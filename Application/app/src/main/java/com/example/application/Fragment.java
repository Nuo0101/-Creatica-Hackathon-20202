package com.example.application;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.EditText;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.DialogFragment;

public class Fragment extends DialogFragment {
    private EditText message;
    private OnfragInteractionListener listener;

    public interface OnfragInteractionListener{
        void onOkPressed();
    }

    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        if(context instanceof OnfragInteractionListener){
            listener = (OnfragInteractionListener) context;
        }else{
            throw new RuntimeException(context.toString()+"expction");
        }
    }



    @NonNull
    @Override
    public Dialog onCreateDialog(@Nullable Bundle savedInstanceState) {
        View view = LayoutInflater.from(getActivity()).inflate(R.layout.fregment_layout, null);

        AlertDialog.Builder bulider = new AlertDialog.Builder(getContext());

        return bulider
                .setView(view)
                .setTitle("Suggestion")
                .setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        return;
                    }
                }).create();

    }
}
