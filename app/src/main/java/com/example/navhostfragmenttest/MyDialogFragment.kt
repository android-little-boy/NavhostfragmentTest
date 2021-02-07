package com.example.navhostfragmenttest

import android.app.Dialog
import android.content.DialogInterface
import android.os.Bundle
import androidx.appcompat.app.AlertDialog
import androidx.fragment.app.DialogFragment


class MyDialogFragment : DialogFragment() {

    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {
        return AlertDialog.Builder(requireActivity())
            .setTitle("神灯")
            .setMessage("来选择你要实现的一个愿望把")
            .setPositiveButton("车子") { _, _ -> }
            .setNegativeButton("房子") { _, _ -> }.create()
    }


}
