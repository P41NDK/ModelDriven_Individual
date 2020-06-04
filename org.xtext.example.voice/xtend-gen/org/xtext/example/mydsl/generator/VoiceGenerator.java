/**
 * generated by Xtext 2.21.0
 */
package org.xtext.example.mydsl.generator;

import com.google.common.base.Objects;
import com.google.common.collect.Iterators;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.function.Consumer;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtend.lib.Data;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.generator.AbstractGenerator;
import org.eclipse.xtext.generator.IFileSystemAccess2;
import org.eclipse.xtext.generator.IGeneratorContext;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.IteratorExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.eclipse.xtext.xbase.lib.Pure;
import org.eclipse.xtext.xbase.lib.util.ToStringHelper;
import org.xtext.example.mydsl.voice.Entity;
import org.xtext.example.mydsl.voice.EntityExample;
import org.xtext.example.mydsl.voice.Intent;
import org.xtext.example.mydsl.voice.IsFollowup;
import org.xtext.example.mydsl.voice.Question;
import org.xtext.example.mydsl.voice.Reference;
import org.xtext.example.mydsl.voice.Sysvariable;
import org.xtext.example.mydsl.voice.Training;

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
@SuppressWarnings("all")
public class VoiceGenerator extends AbstractGenerator {
  @Data
  public static class IntentFollowUp {
    private final String _name;
    
    private final Intent _followupTo;
    
    private final Intent _followupFrom;
    
    private final List<Question> _question;
    
    private final Training _training;
    
    public IntentFollowUp(final String name, final Intent followupTo, final Intent followupFrom, final List<Question> question, final Training training) {
      super();
      this._name = name;
      this._followupTo = followupTo;
      this._followupFrom = followupFrom;
      this._question = question;
      this._training = training;
    }
    
    @Override
    @Pure
    public int hashCode() {
      final int prime = 31;
      int result = 1;
      result = prime * result + ((this._name== null) ? 0 : this._name.hashCode());
      result = prime * result + ((this._followupTo== null) ? 0 : this._followupTo.hashCode());
      result = prime * result + ((this._followupFrom== null) ? 0 : this._followupFrom.hashCode());
      result = prime * result + ((this._question== null) ? 0 : this._question.hashCode());
      return prime * result + ((this._training== null) ? 0 : this._training.hashCode());
    }
    
    @Override
    @Pure
    public boolean equals(final Object obj) {
      if (this == obj)
        return true;
      if (obj == null)
        return false;
      if (getClass() != obj.getClass())
        return false;
      VoiceGenerator.IntentFollowUp other = (VoiceGenerator.IntentFollowUp) obj;
      if (this._name == null) {
        if (other._name != null)
          return false;
      } else if (!this._name.equals(other._name))
        return false;
      if (this._followupTo == null) {
        if (other._followupTo != null)
          return false;
      } else if (!this._followupTo.equals(other._followupTo))
        return false;
      if (this._followupFrom == null) {
        if (other._followupFrom != null)
          return false;
      } else if (!this._followupFrom.equals(other._followupFrom))
        return false;
      if (this._question == null) {
        if (other._question != null)
          return false;
      } else if (!this._question.equals(other._question))
        return false;
      if (this._training == null) {
        if (other._training != null)
          return false;
      } else if (!this._training.equals(other._training))
        return false;
      return true;
    }
    
    @Override
    @Pure
    public String toString() {
      String result = new ToStringHelper().toString(this);
      return result;
    }
    
    @Pure
    public String getName() {
      return this._name;
    }
    
    @Pure
    public Intent getFollowupTo() {
      return this._followupTo;
    }
    
    @Pure
    public Intent getFollowupFrom() {
      return this._followupFrom;
    }
    
    @Pure
    public List<Question> getQuestion() {
      return this._question;
    }
    
    @Pure
    public Training getTraining() {
      return this._training;
    }
  }
  
  private Set<VoiceGenerator.IntentFollowUp> followUpInformation;
  
  private ArrayList<Intent> intentsWithFollowup = new ArrayList<Intent>();
  
  @Override
  public void doGenerate(final Resource resource, final IFileSystemAccess2 fsa, final IGeneratorContext context) {
    this.followUpInformation = this.collectFollowUp(Iterators.<Intent>filter(resource.getAllContents(), Intent.class));
    final Procedure1<Entity> _function = (Entity it) -> {
      this.generateEntityFile(it, fsa);
    };
    IteratorExtensions.<Entity>forEach(Iterators.<Entity>filter(resource.getAllContents(), Entity.class), _function);
    final Consumer<VoiceGenerator.IntentFollowUp> _function_1 = (VoiceGenerator.IntentFollowUp it) -> {
      this.generateIntentFile(it, fsa);
    };
    this.followUpInformation.forEach(_function_1);
  }
  
  public void generateEntityFile(final Entity entity, final IFileSystemAccess2 fsa) {
    String _name = entity.getName();
    String _plus = (_name + "_entries_en.json");
    fsa.generateFile(_plus, this.generateEntityEntries(entity));
    String _name_1 = entity.getName();
    String _plus_1 = (_name_1 + ".json");
    fsa.generateFile(_plus_1, this.generateEntity(entity));
  }
  
  public void generateIntentFile(final VoiceGenerator.IntentFollowUp intent, final IFileSystemAccess2 fsa) {
    String _name = intent.getName();
    String _plus = (_name + ".json");
    fsa.generateFile(_plus, this.generateIntent(intent));
  }
  
  public CharSequence generateIntent(final VoiceGenerator.IntentFollowUp intent) {
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
    CharSequence _generateFollowup = this.generateFollowup(intent);
    _builder.append(_generateFollowup);
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("\"parameter\": [");
    _builder.newLine();
    {
      List<Question> _question = intent.getQuestion();
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
        _builder.append("\"required\": \"true\",");
        _builder.newLine();
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
        _builder.append("} ");
        CharSequence _xifexpression = null;
        Question _last = IterableExtensions.<Question>last(intent.getQuestion());
        boolean _notEquals = (!Objects.equal(parameter, _last));
        if (_notEquals) {
          StringConcatenation _builder_1 = new StringConcatenation();
          _builder_1.append(",");
          _xifexpression = _builder_1;
        }
        _builder.append(_xifexpression, "        ");
        _builder.newLineIfNotEmpty();
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
  
  public Set<VoiceGenerator.IntentFollowUp> collectFollowUp(final Iterator<Intent> intents) {
    HashSet<VoiceGenerator.IntentFollowUp> _xblockexpression = null;
    {
      final HashSet<VoiceGenerator.IntentFollowUp> result = new HashSet<VoiceGenerator.IntentFollowUp>();
      final Procedure1<Intent> _function = (Intent item) -> {
        String _name = item.getName();
        Intent _xifexpression = null;
        IsFollowup _isFollowup = item.getIsFollowup();
        boolean _tripleNotEquals = (_isFollowup != null);
        if (_tripleNotEquals) {
          _xifexpression = item.getIsFollowup().getIntent();
        } else {
          _xifexpression = null;
        }
        EList<Question> _question = item.getQuestion();
        Training _training = item.getTraining();
        VoiceGenerator.IntentFollowUp _intentFollowUp = new VoiceGenerator.IntentFollowUp(_name, _xifexpression, item, _question, _training);
        result.add(_intentFollowUp);
        IsFollowup _isFollowup_1 = item.getIsFollowup();
        boolean _tripleNotEquals_1 = (_isFollowup_1 != null);
        if (_tripleNotEquals_1) {
          this.intentsWithFollowup.add(item.getIsFollowup().getIntent());
        }
      };
      IteratorExtensions.<Intent>forEach(intents, _function);
      _xblockexpression = result;
    }
    return _xblockexpression;
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
  
  public CharSequence generateFollowup(final VoiceGenerator.IntentFollowUp followup) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("\"contexts\": [");
    _builder.newLine();
    CharSequence _xifexpression = null;
    Intent _followupTo = followup.getFollowupTo();
    boolean _tripleNotEquals = (_followupTo != null);
    if (_tripleNotEquals) {
      StringConcatenation _builder_1 = new StringConcatenation();
      _builder_1.append("\"");
      String _name = followup.getFollowupTo().getName();
      _builder_1.append(_name);
      _builder_1.append("-followup\"");
      _xifexpression = _builder_1;
    }
    _builder.append(_xifexpression);
    _builder.newLineIfNotEmpty();
    _builder.append("],");
    _builder.newLine();
    _builder.append("\t\t\t  ");
    _builder.append("\"responses\": [");
    _builder.newLine();
    _builder.append("\t\t\t  \t\t\t\t\t");
    _builder.append("{");
    _builder.newLine();
    _builder.append("\t\t\t  \t\t\t\t\t");
    _builder.append("\"resetContexts\": false,");
    _builder.newLine();
    _builder.append("\t\t\t  \t\t\t\t\t");
    _builder.append("\"affectedContexts\":[");
    _builder.newLine();
    _builder.append("\t\t\t  \t\t\t\t\t");
    CharSequence _xifexpression_1 = null;
    boolean _contains = this.intentsWithFollowup.contains(followup.getFollowupFrom());
    if (_contains) {
      StringConcatenation _builder_2 = new StringConcatenation();
      _builder_2.append("{");
      _builder_2.newLine();
      _builder_2.append("\t\t\t\t  \t\t\t\t\t\t\t");
      _builder_2.append("\"name\": \"");
      String _name_1 = followup.getFollowupFrom().getName();
      _builder_2.append(_name_1, "\t\t\t\t  \t\t\t\t\t\t\t");
      _builder_2.append("-followup\",");
      _builder_2.newLineIfNotEmpty();
      _builder_2.append("\t\t\t\t  \t\t\t\t\t\t\t");
      _builder_2.append("\"parameters\": {},");
      _builder_2.newLine();
      _builder_2.append("\t\t\t\t  \t\t\t\t\t\t\t");
      _builder_2.append("\"lifespan\": 2");
      _builder_2.newLine();
      _builder_2.append("\t\t\t\t  \t\t\t\t\t\t");
      _builder_2.append("}");
      _xifexpression_1 = _builder_2;
    }
    _builder.append(_xifexpression_1, "\t\t\t  \t\t\t\t\t");
    _builder.append("        ");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t\t  \t\t\t\t\t");
    _builder.append("],");
    _builder.newLine();
    _builder.append("\t\t\t  \t\t\t\t\t");
    _builder.append("\"action\": \"\",");
    _builder.newLine();
    return _builder;
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
        _builder.append("}");
        CharSequence _xifexpression = null;
        EntityExample _last = IterableExtensions.<EntityExample>last(entity.getExample());
        boolean _notEquals = (!Objects.equal(example, _last));
        if (_notEquals) {
          StringConcatenation _builder_1 = new StringConcatenation();
          _builder_1.append(",");
          _xifexpression = _builder_1;
        }
        _builder.append(_xifexpression);
        _builder.newLineIfNotEmpty();
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
