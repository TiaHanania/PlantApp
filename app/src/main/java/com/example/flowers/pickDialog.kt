package com.example.flowers

import android.os.Bundle
import android.view.*
import androidx.fragment.app.DialogFragment
import android.widget.*

class PickDialog: DialogFragment(R.layout.picking_fragment) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        val cancelbt : Button = view.findViewById(R.id.cancelBTN)
        val submitbt : Button = view.findViewById(R.id.submitBTN)
        val radioGroup: RadioGroup = view.findViewById(R.id.rating)

        cancelbt.setOnClickListener{
            dismiss()
        }

        submitbt.setOnClickListener {
            val selectedOption: Int = radioGroup.checkedRadioButtonId
            val radioButton: RadioButton = view.findViewById(selectedOption)
            Toast.makeText(context,radioButton.text,Toast.LENGTH_SHORT).show()
        }

    }

    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        inflater.inflate(R.menu.pick, menu)
    }
} 