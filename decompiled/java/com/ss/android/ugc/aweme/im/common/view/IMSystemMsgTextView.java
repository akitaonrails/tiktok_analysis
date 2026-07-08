package com.ss.android.ugc.aweme.im.common.view;

import X.C287620BPc;
import X.C418440Gaw;
import X.C814420VxA;
import android.content.Context;
import android.util.AttributeSet;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes14.dex */
public class IMSystemMsgTextView extends TuxTextView {
    public IMSystemMsgTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public IMSystemMsgTextView(Context context, AttributeSet attributeSet, int i) {
        int i2;
        int i3;
        attributeSet = (i & 2) != 0 ? null : attributeSet;
        if ((i & 4) != 0) {
            i2 = R.attr.z4;
        } else {
            i2 = 0;
        }
        super(context, attributeSet, i2);
        if (C287620BPc.LIZ()) {
            i3 = 6;
        } else {
            i3 = 8;
        }
        int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(i3)));
        setPadding(getPaddingStart(), iLIZIZ, getPaddingEnd(), iLIZIZ);
    }
}
