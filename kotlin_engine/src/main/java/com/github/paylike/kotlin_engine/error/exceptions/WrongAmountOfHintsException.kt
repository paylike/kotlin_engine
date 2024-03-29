package com.github.paylike.kotlin_engine.error.exceptions

/** Thrown if something is not found */
class WrongAmountOfHintsException(
    private val expectedNumber: Int,
    private val actualNumber: Int,
    override val message: String =
        "Wrong amount of hints. Need exactly $expectedNumber hints to continue payment. Current number is: $actualNumber"
) : EngineException()
