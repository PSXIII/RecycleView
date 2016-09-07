package com.example.p_pis.recycleview;

import android.view.View;

/**
 * Created by p_pis on 6/9/2559.
 */
public interface ClickListener {
    void onClick(View view, int position);

    void onLongClick(View view, int position);
}
