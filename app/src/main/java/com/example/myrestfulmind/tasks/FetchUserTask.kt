package com.example.myrestfulmind.tasks

import android.app.Activity
import android.os.AsyncTask
import android.widget.Toast
import com.example.myrestfulmind.database.AppDataBase
import com.example.myrestfulmind.database.User

class FetchUserTask(val context: Activity,
                    val db: AppDataBase,
                    val email: String,
                    val password: String,
                    val callback: (User?) -> Unit
): AsyncTask<Void, Void, User?>() {
    override fun onPreExecute() {
        super.onPreExecute()
    }
    override fun doInBackground(vararg params:Void?): User? {

        return db.userDAO().findByEmail(email, password)
    }

    override fun onPostExecute(result: User?) {
        super.onPostExecute(result)
        callback(result)
    }
}
