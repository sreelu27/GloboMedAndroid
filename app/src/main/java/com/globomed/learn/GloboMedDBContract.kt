package com.globomed.learn

import android.provider.BaseColumns
import android.provider.BaseColumns._ID

object GloboMedDBContract {

    object EmployeeEntry : BaseColumns {
        const val TABLE_NAME = "employee"
        const val COLUMN_NAME = "name"
        const val COLUMN_DOB = "dob"
        const val COLUMN_DESIGNATION = "designation"

        const val SQL_CREATE_ENTRIES: String =
            "CREATE TABLE $TABLE_NAME (" +
                    _ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
                    "$COLUMN_NAME TEXT NOT NULL, " +
                    "$COLUMN_DOB INTEGER NOT NULL, " +
                    "$COLUMN_DESIGNATION TEXT NOT NULL )"

        const val SQL_DROP_TABLE = "DROP TABLE IF EXISTS $TABLE_NAME"
    }
}