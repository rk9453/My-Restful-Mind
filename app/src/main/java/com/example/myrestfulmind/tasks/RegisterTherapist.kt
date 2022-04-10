package com.example.myrestfulmind.tasks

import android.app.Activity
import android.os.AsyncTask
import android.widget.Toast
import com.example.myrestfulmind.database.AppDataBaseTh
import com.example.myrestfulmind.database.Therapist

class RegisterTherapist(val context: Activity,
                       val db: AppDataBaseTh,
                       val user: Therapist
): AsyncTask<Void, Void, Void?>() {
    override fun onPreExecute() {
        super.onPreExecute()
        Toast.makeText(context, "Registration started.", Toast.LENGTH_SHORT).show()
    }
    override fun doInBackground(vararg params:Void?): Void? {
        db.therapistDAO().insert(user)
        return null
    }

    override fun onPostExecute(result: Void?) {
        super.onPostExecute(result)
        Toast.makeText(context, "Registration done.", Toast.LENGTH_SHORT).show()
    }
}