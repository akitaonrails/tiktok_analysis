package com.lynx.tasm.behavior.ui.view;

import android.content.Context;
import android.view.ViewGroup;
import com.lynx.tasm.behavior.ui.UIGroup;
import j27.s;

/* JADX INFO: loaded from: classes21.dex */
public abstract class UISimpleView<T extends ViewGroup> extends UIGroup<T> {
    public UISimpleView(Context context) {
        this((s) context);
    }

    public UISimpleView(s sVar) {
        this(sVar, null);
    }

    public UISimpleView(s sVar, Object obj) {
        super(sVar, obj);
    }
}
