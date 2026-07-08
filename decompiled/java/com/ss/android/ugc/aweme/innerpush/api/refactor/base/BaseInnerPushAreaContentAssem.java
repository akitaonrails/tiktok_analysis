package com.ss.android.ugc.aweme.innerpush.api.refactor.base;

import X.C786410Ut5;
import Y.ACListenerS137S0100000_2;
import android.view.View;

/* JADX INFO: loaded from: classes3.dex */
public abstract class BaseInnerPushAreaContentAssem extends BaseInnerPushContentAssem {
    @Override // com.ss.android.ugc.aweme.innerpush.api.refactor.base.BaseInnerPushContentAssem, com.bytedance.assem.arch.core.UIAssem
    public void onViewCreated(View view) {
        super.onViewCreated(view);
        C786410Ut5.I7(new ACListenerS137S0100000_2(this, 37), view);
    }
}
