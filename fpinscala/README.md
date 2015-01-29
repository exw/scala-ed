Exercises from Functional Programming in Scala by Paul Chiusano and Runar Bjarnason

Published August 2014

Manning website:
http://www.manning.com/bjarnason/

Contents:


Part 1, Introduction to functional programming:

Chapter 1, "What is functional programming?". Defines functional programming (referential transparency, first class functions) and illustrates some benefits -- simpler reasoning, more modularity, etc.

Chapter 2, "Getting started with functional programming in Scala". Introduces Scala-language-specific functional constructs/syntax, e.g. recursion, higher-order functions, polymorphic functions, etc.

Chapter 3, "Functional data structures". Covers algebraic data types, pattern matching, and functional variations of common data structures.

Chapter 4, "Handling errors without exceptions". Discusses issues with exception handling in functional programs and focuses on functional alternatives like Option and Either.

Chapter 5, "Strictness and laziness". Establishes non-strictness as a fundamental technique that facilitates  efficiency and modularity in functional implementations, involving the separation of the definition and evaluation of expressions. This decoupling of concerns allows for code reuse in multiple contexts. 

Chapter 6, "Purely functional state". Touches on how to manage state in functional programs, by passing and returning it as arguments.


Part 2, Functional design and combinator libraries:

Chapter 7, "Purely functional parallelism". Designs a library for functional handling of parallel and asynchronous computations.

Chapter 8, "Property-based testing". Offers examples in the domain of property-based testing by writing generalized abstract ScalaCheck test suites.

Chapter 9, "Parser combinators". Encourages the use of algebraic design in writing combinator libraries, and uses the library to write a practical JSON parser.

Part 3, Common structures in functional design:

Chapter 10, "Monoids". Covers monoids. Where you put stuff in a line and compose them together.

Chapter 11, "Monads". Covers monads. Where you put stuff inside stuff and can only take it out in a special way.

Chapter 12, "Applicative and traversable functors." Covers compositional generalization of monads.

Part 4, Effects and IO:

Chapter 13, "External effects and I/O". Introduces the IO monad.

Chapter 14, "Local effects and mutable state". Discusses advantages of mutating within local scopes while preserving referential transparency.

Chapter 15, "Stream processing and incremental I/O". Constructs a library for stream processing and incremental I/O.
