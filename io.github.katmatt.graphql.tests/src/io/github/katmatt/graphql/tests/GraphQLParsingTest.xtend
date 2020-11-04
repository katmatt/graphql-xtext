/*
 * generated by Xtext 2.23.0
 */
package io.github.katmatt.graphql.tests

import com.google.inject.Inject
import org.eclipse.xtext.testing.InjectWith
import org.eclipse.xtext.testing.extensions.InjectionExtension
import org.eclipse.xtext.testing.util.ParseHelper
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.^extension.ExtendWith
import io.github.katmatt.graphql.graphQL.TypeSystemDefinition

@ExtendWith(InjectionExtension)
@InjectWith(GraphQLInjectorProvider)
class GraphQLParsingTest {
	@Inject
	ParseHelper<TypeSystemDefinition> parseHelper
		
	@Test
	def void example34() {
		val result = parseHelper.parse('''
			type Person @addExternalFields(source: "profiles") @excludeField(name: "photo") {
			  name: String
			}
		''')
		Assertions.assertNotNull(result)
		val errors = result.eResource.errors
		Assertions.assertTrue(errors.isEmpty, '''Unexpected errors: «errors.join(", ")»''')
	}
	
	@Test
	def void example36() {
		val result = parseHelper.parse('''
			"""
			A simple GraphQL schema which is well described.
			"""
			schema {
			  query: Query
			}
			
			"""
			Root type for all your queries
			"""
			type Query {
			  """
			  Translates a string from a given language into a different language.
			  """
			  translate(
			    "The original language that `text` is provided in."
			    fromLanguage: Language
			
			    "The translated language to be returned."
			    toLanguage: Language
			
			    "The text to be translated."
			    text: String
			  ): String
			}
			
			"""
			The set of languages supported by `translate`.
			"""
			enum Language {
			  "English"
			  EN
			
			  "French"
			  FR
			
			  "Chinese"
			  CH
			}
		''')
		Assertions.assertNotNull(result)
		val errors = result.eResource.errors
		Assertions.assertTrue(errors.isEmpty, '''Unexpected errors: «errors.join(", ")»''')
	}
	
	@Test
	def void example77() {
		val result = parseHelper.parse('''
			union SearchResult =
			  | Photo
			  | Person
		''')
		Assertions.assertNotNull(result)
		val errors = result.eResource.errors
		Assertions.assertTrue(errors.isEmpty, '''Unexpected errors: «errors.join(", ")»''')
	}
	
	@Test
	def void example78() {
		val result = parseHelper.parse('''
			enum Direction {
			  NORTH
			  EAST
			  SOUTH
			  WEST
			}
		''')
		Assertions.assertNotNull(result)
		val errors = result.eResource.errors
		Assertions.assertTrue(errors.isEmpty, '''Unexpected errors: «errors.join(", ")»''')
	}
	
	@Test
	def void example79() {
		val result = parseHelper.parse('''
			input Point2D {
			  x: Float
			  y: Float
			}
		''')
		Assertions.assertNotNull(result)
		val errors = result.eResource.errors
		Assertions.assertTrue(errors.isEmpty, '''Unexpected errors: «errors.join(", ")»''')
	}		
}
