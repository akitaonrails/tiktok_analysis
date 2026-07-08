package com.ss.android.ugc.aweme.verify;

import android.content.Context;
import android.view.View;
import com.bytedance.assem.arch.view.UIContentAssem;

/* JADX INFO: loaded from: classes27.dex */
public abstract class ThemedContextUIContentAssem extends UIContentAssem {
    public Context LLIZLLLIL;

    @Override // com.bytedance.assem.arch.core.UIAssem
    public void onViewCreated(View view) {
        super.onViewCreated(view);
        this.LLIZLLLIL = view.getContext();
    }
}
