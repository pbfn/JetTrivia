package com.pedro_bruno.jettrivia.model

object Mock {
    val mockResponse: ArrayList<QuestionItem> = arrayListOf(
        QuestionItem(
            question = "LFD2 was banned in Australia.",
            category = "world",
            answer = "True",
            choices = listOf("False","True")
        ),
        QuestionItem(
            question = "One of the remnants of this states former status as a possession of France is the fact that it was named after a French king.",
            category = "world",
            answer = "Louisiana",
            choices = listOf("Oklahoma",
                "Florida",
                "Louisiana",
                "Georgia")
        ),
        QuestionItem(
            question = "No state has as many different species of mammals as this one. The average square mile of land contains 1.4 elk, 1.4 pronghorn antelope, and 3.3 deer.",
            category = "world",
            answer = "Montana",
            choices = listOf( "Nebraska",
                "Nevada",
                "Colorado",
                "Montana")
        ),
        QuestionItem(
            question = "Arizona became the 48th state on February 14, 1912.",
            category = "world",
            answer = "True",
            choices = listOf("False",
                "True")
        ),
        QuestionItem(
            question = "The largest lake in this state is Lake Okeechobee. The state is also home to one of the two naturally round lakes in the world.",
            category ="world",
            answer = "Florida",
            choices = listOf( "Hawaii",
                "Tennessee",
                "Florida",
                "Alabama")
        )
    )
}