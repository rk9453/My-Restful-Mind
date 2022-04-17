package com.example.myrestfulmind.tasks

import android.app.Activity
import android.os.AsyncTask
import android.widget.Toast
import com.example.myrestfulmind.database.DateDataBase
import com.example.myrestfulmind.database.Date


class FetchDate(val context: Activity,
                     val db: DateDataBase,
                     val callback: (Date?) -> Unit
): AsyncTask<Void, Void, Date?>() {
    override fun onPreExecute() {
        super.onPreExecute()
    }
    override fun doInBackground(vararg params:Void?): Date? {

        return db.dateDAO().find()
    }

    override fun onPostExecute(result: Date?) {
        super.onPostExecute(result)
        callback(result)
    }
}