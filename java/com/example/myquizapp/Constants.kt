package com.example.myquizapp

import java.util.ArrayList

object Constants {

    const val USER_NAME : String = "User_name"
    const val TOTAL_QUESTION: String = "total_questions"
    const val CORRECT_ANSWER: String = "correct_answers"



    fun getQuestions(): ArrayList<Question>{
        val questionsList = ArrayList<Question>()

        val que1 = Question(
            id = 1, "What country does this flag belong to?",
            R.drawable.ic_flag_of_argentina,
            "Argentina", "Australia", "India", "Mexico",
            1
        )

        questionsList.add(que1)

        val que2 = Question(
            id = 2, "What country does this flag belong to?",
            R.drawable.ic_flag_of_brazil,
            "Argentina", "Brazil", "India", "Mexico",
            2
        )

        questionsList.add(que2)


        val que3 = Question(
            id = 3, "What country does this flag belong to?",
            R.drawable.ic_flag_of_denmark,
            "Denmark", "Australia", "India", "Mexico",
            1
        )

        questionsList.add(que3)

        val que4 = Question(
            id = 4, "What country does this flag belong to?",
            R.drawable.ic_flag_of_australia,
            "Denmark", "Australia", "India", "Mexico",
            2
        )

        questionsList.add(que4)


        val que5 = Question(
            id = 5, "What country does this flag belong to?",
            R.drawable.ic_flag_of_belgium,
            "Denmark", "Australia", "India", "Belgium",
            4
        )

        questionsList.add(que5)




        return questionsList
    }

}