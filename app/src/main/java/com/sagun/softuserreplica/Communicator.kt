package com.sagun.softuserreplica

import com.sagun.softuserreplica.model.Student

interface Communicator {
    fun passData(lstStd: ArrayList<Student>)
}