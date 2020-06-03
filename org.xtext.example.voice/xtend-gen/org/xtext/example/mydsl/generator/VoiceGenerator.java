/**
 * generated by Xtext 2.21.0
 */
package org.xtext.example.mydsl.generator;

import com.google.common.collect.Iterators;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.generator.AbstractGenerator;
import org.eclipse.xtext.generator.IFileSystemAccess2;
import org.eclipse.xtext.generator.IGeneratorContext;
import org.eclipse.xtext.xbase.lib.IteratorExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.xtext.example.mydsl.voice.Entity;
import org.xtext.example.mydsl.voice.EntityExample;
import org.xtext.example.mydsl.voice.Intent;
import org.xtext.example.mydsl.voice.IsFollowup;
import org.xtext.example.mydsl.voice.Question;
import org.xtext.example.mydsl.voice.Reference;
import org.xtext.example.mydsl.voice.Sysvariable;

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
@SuppressWarnings("all")
public class VoiceGenerator extends AbstractGenerator {
  @Override
  public void doGenerate(final Resource resource, final IFileSystemAccess2 fsa, final IGeneratorContext context) {
    final Procedure1<Entity> _function = (Entity it) -> {
      this.generateEntityFile(it, fsa);
    };
    IteratorExtensions.<Entity>forEach(Iterators.<Entity>filter(resource.getAllContents(), Entity.class), _function);
    final Procedure1<Intent> _function_1 = (Intent it) -> {
      this.generateIntentFile(it, fsa);
    };
    IteratorExtensions.<Intent>forEach(Iterators.<Intent>filter(resource.getAllContents(), Intent.class), _function_1);
  }
  
  public void generateEntityFile(final Entity entity, final IFileSystemAccess2 fsa) {
    String _name = entity.getName();
    String _plus = (_name + "_entries_en.json");
    fsa.generateFile(_plus, this.generateEntityEntries(entity));
    String _name_1 = entity.getName();
    String _plus_1 = (_name_1 + ".json");
    fsa.generateFile(_plus_1, this.generateEntity(entity));
  }
  
  public void generateIntentFile(final Intent intent, final IFileSystemAccess2 fsa) {
    String _name = intent.getName();
    String _plus = (_name + ".json");
    fsa.generateFile(_plus, this.generateIntent(intent));
  }
  
  public CharSequence generateIntent(final Intent intent) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("{");
    _builder.newLine();
    _builder.append("\"id\": \"");
    String _generateId = this.generateId(36);
    _builder.append(_generateId);
    _builder.append("\",");
    _builder.newLineIfNotEmpty();
    _builder.append("\"name\": \"");
    String _name = intent.getName();
    _builder.append(_name);
    _builder.append("\",");
    _builder.newLineIfNotEmpty();
    _builder.append("\"auto\": true,");
    _builder.newLine();
    CharSequence _xifexpression = null;
    IsFollowup _isFollowup = intent.getIsFollowup();
    boolean _tripleNotEquals = (_isFollowup != null);
    if (_tripleNotEquals) {
      StringConcatenation _builder_1 = new StringConcatenation();
      _builder_1.append("\"contexts\": [");
      _builder_1.newLine();
      _builder_1.append("\t\t\t    ");
      _builder_1.append("\"");
      String _name_1 = intent.getIsFollowup().getIntent().getName();
      _builder_1.append(_name_1, "\t\t\t    ");
      _builder_1.append("-followup\"");
      _builder_1.newLineIfNotEmpty();
      _builder_1.append("\t\t\t  ");
      _builder_1.append("],");
      _builder_1.newLine();
      _builder_1.append("\t\t\t  ");
      _builder_1.append("\"responses\": [");
      _builder_1.newLine();
      _builder_1.append("\t\t\t  \t\t\t\t\t");
      _builder_1.append("{");
      _builder_1.newLine();
      _builder_1.append("\t\t\t  \t\t\t\t\t");
      _builder_1.append("\"resetContexts\": false,");
      _builder_1.newLine();
      _builder_1.append("\t\t\t  \t\t\t\t\t");
      _builder_1.append("\"action\": \"\"");
      _builder_1.newLine();
      _builder_1.append("\t\t\t  \t\t\t\t\t");
      _builder_1.append("\"affectedContexts\":[],");
      _xifexpression = _builder_1;
    } else {
      CharSequence _xifexpression_1 = null;
      String _hasFollowup = intent.getHasFollowup();
      boolean _tripleNotEquals_1 = (_hasFollowup != null);
      if (_tripleNotEquals_1) {
        StringConcatenation _builder_2 = new StringConcatenation();
        _builder_2.append("\"contexts\": [],");
        _builder_2.newLine();
        _builder_2.append("\"responses\": [");
        _builder_2.newLine();
        _builder_2.append("\t\t");
        _builder_2.append("{");
        _builder_2.newLine();
        _builder_2.append("\t\t");
        _builder_2.append("\"resetContexts\": false,");
        _builder_2.newLine();
        _builder_2.append("\t\t");
        _builder_2.append("\"affectedContexts\": [");
        _builder_2.newLine();
        _builder_2.append("        ");
        _builder_2.append("{");
        _builder_2.newLine();
        _builder_2.append("          ");
        _builder_2.append("\"name\": \"");
        String _name_2 = intent.getName();
        _builder_2.append(_name_2, "          ");
        _builder_2.append("-followup\",");
        _builder_2.newLineIfNotEmpty();
        _builder_2.append("          ");
        _builder_2.append("\"parameters\": {},");
        _builder_2.newLine();
        _builder_2.append("          ");
        _builder_2.append("\"lifespan\": 2");
        _builder_2.newLine();
        _builder_2.append("        ");
        _builder_2.append("}");
        _builder_2.newLine();
        _builder_2.append("        ");
        _builder_2.append("],");
        _builder_2.newLine();
        _xifexpression_1 = _builder_2;
      }
      _xifexpression = _xifexpression_1;
    }
    _builder.append(_xifexpression);
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("\"parameter\": [");
    _builder.newLine();
    {
      EList<Question> _question = intent.getQuestion();
      for(final Question parameter : _question) {
        _builder.append("{ ");
        _builder.newLine();
        _builder.append("          ");
        _builder.append("\"id\": \"");
        String _generateId_1 = this.generateId(36);
        _builder.append(_generateId_1, "          ");
        _builder.append("\",");
        _builder.newLineIfNotEmpty();
        _builder.append("          ");
        _builder.append("\"required\": ");
        CharSequence _xifexpression_2 = null;
        String _required = parameter.getRequired();
        boolean _tripleEquals = (_required == null);
        if (_tripleEquals) {
          StringConcatenation _builder_3 = new StringConcatenation();
          _builder_3.append("false");
          _xifexpression_2 = _builder_3;
        } else {
          StringConcatenation _builder_4 = new StringConcatenation();
          _builder_4.append("true");
          _xifexpression_2 = _builder_4;
        }
        _builder.append(_xifexpression_2, "          ");
        _builder.newLineIfNotEmpty();
        _builder.append("          ");
        _builder.append("\"dataType\": \"@");
        String _entityType = this.getEntityType(parameter.getQuestionEntity().getWithEntity());
        _builder.append(_entityType, "          ");
        _builder.append("\",");
        _builder.newLineIfNotEmpty();
        _builder.append("          ");
        _builder.append("\"name\": \"");
        String _entityType_1 = this.getEntityType(parameter.getQuestionEntity().getWithEntity());
        _builder.append(_entityType_1, "          ");
        _builder.append("\",");
        _builder.newLineIfNotEmpty();
        _builder.append("          ");
        _builder.append("\"value\": \"$");
        String _entityType_2 = this.getEntityType(parameter.getQuestionEntity().getWithEntity());
        _builder.append(_entityType_2, "          ");
        _builder.append("\",");
        _builder.newLineIfNotEmpty();
        _builder.append("          ");
        _builder.append("\"prompts\": [");
        _builder.newLine();
        _builder.append("            ");
        _builder.append("{");
        _builder.newLine();
        _builder.append("              ");
        _builder.append("\"lang\": \"en\",");
        _builder.newLine();
        _builder.append("              ");
        _builder.append("\"value\": \"");
        String _prompt = parameter.getPrompt();
        _builder.append(_prompt, "              ");
        _builder.append("\"");
        _builder.newLineIfNotEmpty();
        _builder.append("            ");
        _builder.append("}");
        _builder.newLine();
        _builder.append("          ");
        _builder.append("],");
        _builder.newLine();
        _builder.append("          ");
        _builder.append("\"promptMessages\": [],");
        _builder.newLine();
        _builder.append("          ");
        _builder.append("\"noMatchPromptMessages\": [],");
        _builder.newLine();
        _builder.append("          ");
        _builder.append("\"noInputPromptMessages\": [],");
        _builder.newLine();
        _builder.append("          ");
        _builder.append("\"outputDialogContexts\": [],");
        _builder.newLine();
        _builder.append("          ");
        _builder.append("\"isList\": false");
        _builder.newLine();
        _builder.append("        ");
        _builder.append("},");
        _builder.newLine();
      }
    }
    _builder.append("],");
    _builder.newLine();
    _builder.append("      ");
    _builder.append("\"messages\": [");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("{");
    _builder.newLine();
    _builder.append("          ");
    _builder.append("\"type\": 0,");
    _builder.newLine();
    _builder.append("          ");
    _builder.append("\"lang\": \"en\",");
    _builder.newLine();
    _builder.append("          ");
    _builder.append("\"condition\": \"\",");
    _builder.newLine();
    _builder.append("          ");
    _builder.append("\"speech\": []");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("}");
    _builder.newLine();
    _builder.append("      ");
    _builder.append("],");
    _builder.newLine();
    _builder.append("      ");
    _builder.append("\"defaultResponsePlatforms\": {},");
    _builder.newLine();
    _builder.append("      ");
    _builder.append("\"speech\": []");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("}");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("],");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("\"priority\": 500000,");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("\"webhookUsed\": true,");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("\"webhookForSlotFilling\": false,");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("\"fallbackIntent\": false,");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("\"events\": [],");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("\"conditionalResponses\": [],");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("\"condition\": \"\",");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("\"conditionalFollowupEvents\": []");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence generateFollowupIntent(final Intent intent) {
    StringConcatenation _builder = new StringConcatenation();
    return _builder;
  }
  
  public CharSequence generateRegularIntent(final Intent intent) {
    StringConcatenation _builder = new StringConcatenation();
    return _builder;
  }
  
  public String getEntityType(final Reference ref) {
    String _xifexpression = null;
    Entity _entity = ref.getEntity();
    boolean _tripleNotEquals = (_entity != null);
    if (_tripleNotEquals) {
      _xifexpression = ref.getEntity().getName();
    } else {
      String _xifexpression_1 = null;
      Sysvariable _sysvar = ref.getSysvar();
      boolean _tripleNotEquals_1 = (_sysvar != null);
      if (_tripleNotEquals_1) {
        String _value = ref.getSysvar().getValue();
        _xifexpression_1 = ("sys." + _value);
      }
      _xifexpression = _xifexpression_1;
    }
    return _xifexpression;
  }
  
  public CharSequence generateEntityEntries(final Entity entity) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("[");
    _builder.newLine();
    {
      EList<EntityExample> _example = entity.getExample();
      for(final EntityExample example : _example) {
        _builder.append("{");
        _builder.newLine();
        _builder.append("  ");
        _builder.append("\"value\": \"");
        String _name = example.getName();
        _builder.append(_name, "  ");
        _builder.append("\",");
        _builder.newLineIfNotEmpty();
        _builder.append("  ");
        _builder.append("\"synonyms\": [");
        _builder.newLine();
        _builder.append("    ");
        _builder.append("\"\"");
        _builder.newLine();
        _builder.append("  ");
        _builder.append("]");
        _builder.newLine();
        _builder.append("},");
        _builder.newLine();
      }
    }
    _builder.append("]");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence generateEntity(final Entity entity) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("{");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("\"id\": \"");
    String _generateId = this.generateId(36);
    _builder.append(_generateId, "  ");
    _builder.append("\",");
    _builder.newLineIfNotEmpty();
    _builder.append("  ");
    _builder.append("\"name\": \"");
    String _name = entity.getName();
    _builder.append(_name, "  ");
    _builder.append("\",");
    _builder.newLineIfNotEmpty();
    _builder.append("  ");
    _builder.append("\"isOverridable\": true,");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("\"isEnum\": false,");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("\"isRegexp\": false,");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("\"automatedExpansion\": false,");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("\"allowFuzzyExtraction\": true");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  private final String ALPHA_NUMERIC_STRING = "abcdefghijklmnopqrstuvxyz0123456789-";
  
  public String generateId(final int count) {
    String _xblockexpression = null;
    {
      int c = count;
      String id = "";
      while ((c-- != 0)) {
        {
          double _random = Math.random();
          int _length = this.ALPHA_NUMERIC_STRING.length();
          final int character = Double.valueOf((_random * _length)).intValue();
          String _id = id;
          char _charAt = this.ALPHA_NUMERIC_STRING.charAt(character);
          id = (_id + Character.valueOf(_charAt));
        }
      }
      _xblockexpression = id;
    }
    return _xblockexpression;
  }
}
