package com.pedro_bruno.jettrivia.repository

import android.util.Log
import com.google.gson.JsonArray
import com.pedro_bruno.jettrivia.data.DataOrException
import com.pedro_bruno.jettrivia.model.Mock
import com.pedro_bruno.jettrivia.model.QuestionItem
import com.pedro_bruno.jettrivia.network.QuestionApi
import javax.inject.Inject

class QuestionRepository @Inject constructor(private val api: QuestionApi) {

    private val dataOrException =
        DataOrException<ArrayList<QuestionItem>, Boolean, Exception>()

    suspend fun getAllQuestions(): DataOrException<ArrayList<QuestionItem>, Boolean, Exception> {
        try {
            dataOrException.loadingState = true
            dataOrException.data = api.getAllQuestions()
            if (dataOrException.data.toString().isNotEmpty()) dataOrException.loadingState = false
        } catch (exception: Exception) {
            dataOrException.e = exception
            //MOCK PARA TESTE DO APP
            dataOrException.data = Mock.mockResponse
            Log.d("Exception request","getAllQuestions: ${dataOrException.e!!.localizedMessage}")
            dataOrException.loadingState = false
        }
        return dataOrException
    }

}