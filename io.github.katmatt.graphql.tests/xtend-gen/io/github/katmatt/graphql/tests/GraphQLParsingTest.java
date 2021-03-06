/**
 * generated by Xtext 2.23.0
 */
package io.github.katmatt.graphql.tests;

import com.google.inject.Inject;
import io.github.katmatt.graphql.graphQL.TypeSystemDefinition;
import io.github.katmatt.graphql.tests.GraphQLInjectorProvider;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.testing.InjectWith;
import org.eclipse.xtext.testing.extensions.InjectionExtension;
import org.eclipse.xtext.testing.util.ParseHelper;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

@ExtendWith(InjectionExtension.class)
@InjectWith(GraphQLInjectorProvider.class)
@SuppressWarnings("all")
public class GraphQLParsingTest {
  @Inject
  private ParseHelper<TypeSystemDefinition> parseHelper;
  
  @Test
  public void example34() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("type Person @addExternalFields(source: \"profiles\") @excludeField(name: \"photo\") {");
      _builder.newLine();
      _builder.append("  ");
      _builder.append("name: String");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      final TypeSystemDefinition result = this.parseHelper.parse(_builder);
      Assertions.assertNotNull(result);
      final EList<Resource.Diagnostic> errors = result.eResource().getErrors();
      boolean _isEmpty = errors.isEmpty();
      StringConcatenation _builder_1 = new StringConcatenation();
      _builder_1.append("Unexpected errors: ");
      String _join = IterableExtensions.join(errors, ", ");
      _builder_1.append(_join);
      Assertions.assertTrue(_isEmpty, _builder_1.toString());
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void example36() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("\"\"\"");
      _builder.newLine();
      _builder.append("A simple GraphQL schema which is well described.");
      _builder.newLine();
      _builder.append("\"\"\"");
      _builder.newLine();
      _builder.append("schema {");
      _builder.newLine();
      _builder.append("  ");
      _builder.append("query: Query");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      _builder.newLine();
      _builder.append("\"\"\"");
      _builder.newLine();
      _builder.append("Root type for all your queries");
      _builder.newLine();
      _builder.append("\"\"\"");
      _builder.newLine();
      _builder.append("type Query {");
      _builder.newLine();
      _builder.append("  ");
      _builder.append("\"\"\"");
      _builder.newLine();
      _builder.append("  ");
      _builder.append("Translates a string from a given language into a different language.");
      _builder.newLine();
      _builder.append("  ");
      _builder.append("\"\"\"");
      _builder.newLine();
      _builder.append("  ");
      _builder.append("translate(");
      _builder.newLine();
      _builder.append("    ");
      _builder.append("\"The original language that `text` is provided in.\"");
      _builder.newLine();
      _builder.append("    ");
      _builder.append("fromLanguage: Language");
      _builder.newLine();
      _builder.newLine();
      _builder.append("    ");
      _builder.append("\"The translated language to be returned.\"");
      _builder.newLine();
      _builder.append("    ");
      _builder.append("toLanguage: Language");
      _builder.newLine();
      _builder.newLine();
      _builder.append("    ");
      _builder.append("\"The text to be translated.\"");
      _builder.newLine();
      _builder.append("    ");
      _builder.append("text: String");
      _builder.newLine();
      _builder.append("  ");
      _builder.append("): String");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      _builder.newLine();
      _builder.append("\"\"\"");
      _builder.newLine();
      _builder.append("The set of languages supported by `translate`.");
      _builder.newLine();
      _builder.append("\"\"\"");
      _builder.newLine();
      _builder.append("enum Language {");
      _builder.newLine();
      _builder.append("  ");
      _builder.append("\"English\"");
      _builder.newLine();
      _builder.append("  ");
      _builder.append("EN");
      _builder.newLine();
      _builder.newLine();
      _builder.append("  ");
      _builder.append("\"French\"");
      _builder.newLine();
      _builder.append("  ");
      _builder.append("FR");
      _builder.newLine();
      _builder.newLine();
      _builder.append("  ");
      _builder.append("\"Chinese\"");
      _builder.newLine();
      _builder.append("  ");
      _builder.append("CH");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      final TypeSystemDefinition result = this.parseHelper.parse(_builder);
      Assertions.assertNotNull(result);
      final EList<Resource.Diagnostic> errors = result.eResource().getErrors();
      boolean _isEmpty = errors.isEmpty();
      StringConcatenation _builder_1 = new StringConcatenation();
      _builder_1.append("Unexpected errors: ");
      String _join = IterableExtensions.join(errors, ", ");
      _builder_1.append(_join);
      Assertions.assertTrue(_isEmpty, _builder_1.toString());
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void example77() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("union SearchResult =");
      _builder.newLine();
      _builder.append("  ");
      _builder.append("| Photo");
      _builder.newLine();
      _builder.append("  ");
      _builder.append("| Person");
      _builder.newLine();
      final TypeSystemDefinition result = this.parseHelper.parse(_builder);
      Assertions.assertNotNull(result);
      final EList<Resource.Diagnostic> errors = result.eResource().getErrors();
      boolean _isEmpty = errors.isEmpty();
      StringConcatenation _builder_1 = new StringConcatenation();
      _builder_1.append("Unexpected errors: ");
      String _join = IterableExtensions.join(errors, ", ");
      _builder_1.append(_join);
      Assertions.assertTrue(_isEmpty, _builder_1.toString());
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void example78() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("enum Direction {");
      _builder.newLine();
      _builder.append("  ");
      _builder.append("NORTH");
      _builder.newLine();
      _builder.append("  ");
      _builder.append("EAST");
      _builder.newLine();
      _builder.append("  ");
      _builder.append("SOUTH");
      _builder.newLine();
      _builder.append("  ");
      _builder.append("WEST");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      final TypeSystemDefinition result = this.parseHelper.parse(_builder);
      Assertions.assertNotNull(result);
      final EList<Resource.Diagnostic> errors = result.eResource().getErrors();
      boolean _isEmpty = errors.isEmpty();
      StringConcatenation _builder_1 = new StringConcatenation();
      _builder_1.append("Unexpected errors: ");
      String _join = IterableExtensions.join(errors, ", ");
      _builder_1.append(_join);
      Assertions.assertTrue(_isEmpty, _builder_1.toString());
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void example79() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("input Point2D {");
      _builder.newLine();
      _builder.append("  ");
      _builder.append("x: Float");
      _builder.newLine();
      _builder.append("  ");
      _builder.append("y: Float");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      final TypeSystemDefinition result = this.parseHelper.parse(_builder);
      Assertions.assertNotNull(result);
      final EList<Resource.Diagnostic> errors = result.eResource().getErrors();
      boolean _isEmpty = errors.isEmpty();
      StringConcatenation _builder_1 = new StringConcatenation();
      _builder_1.append("Unexpected errors: ");
      String _join = IterableExtensions.join(errors, ", ");
      _builder_1.append(_join);
      Assertions.assertTrue(_isEmpty, _builder_1.toString());
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
}
