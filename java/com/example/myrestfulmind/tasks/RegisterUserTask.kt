package com.example.myrestfulmind.tasks

import android.app.Activity
import android.os.AsyncTask
import android.widget.Toast
import com.example.myrestfulmind.database.AppDataBase
import com.example.myrestfulmind.database.User

class RegisterUserTask(val context: Activity,
                       val db: AppDataBase,
                       val user: User
): AsyncTask<Void, Void, Void?>() {
    override fun onPreExecute() {
        super.onPreExecute()
        Toast.makeText(context, "Registration started.", Toast.LENGTH_SHORT).show()
    }
    override fun doInBackground(vararg params:Void?): Void? {
        db.userDAO().insert(user)
        return null
    }

    override fun onPostExecute(result: Void?) {
        super.onPostExecute(result)
        Toast.makeText(context, "Registration done.", Toast.LENGTH_SHORT).show()
    }
}

