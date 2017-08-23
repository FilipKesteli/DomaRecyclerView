package com.kesteli.filip.domarecyclerview;

import android.view.View;

/**
 * Created by Valemate on 23.8.2017..
 */

public interface OnClickListener {
    void onClick(View view, int position);

    void onLongClick(View view, int position);
}
