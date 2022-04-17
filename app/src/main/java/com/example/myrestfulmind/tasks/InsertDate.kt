package com.example.myrestfulmind.tasks

import android.app.Activity
import android.os.AsyncTask
import android.widget.Toast
import com.example.myrestfulmind.database.DateDataBase
import com.example.myrestfulmind.database.Date

class InsertDate(val context: Activity,
                        val db: DateDataBase,
                        val user: Date
): AsyncTask<Void, Void, Void?>() {

    override fun doInBackground(vararg params:Void?): Void? {
        db.dateDAO().insert(user)
        return null
    }

}