package com.example.myrestfulmind.tasks

import android.app.Activity
import android.os.AsyncTask
import android.widget.Toast
import com.example.myrestfulmind.database.AppDataBaseTh
import com.example.myrestfulmind.database.Therapist


class FetchTherapist(val context: Activity,
                     val db: AppDataBaseTh,
                     val email: String,
                     val password: String,
                     val callback: (Therapist?) -> Unit
): AsyncTask<Void, Void, Therapist?>() {
    override fun onPreExecute() {
        super.onPreExecute()
    }
    override fun doInBackground(vararg params:Void?): Therapist? {

        return db.therapistDAO().findByMail(email, password)
    }

    override fun onPostExecute(result: Therapist?) {
        super.onPostExecute(result)
        callback(result)
    }
}