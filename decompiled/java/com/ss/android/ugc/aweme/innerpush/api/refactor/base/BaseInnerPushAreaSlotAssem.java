package com.ss.android.ugc.aweme.innerpush.api.refactor.base;

import X.C786410Ut5;
import Y.ACListenerS165S0100000_31;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;

/* JADX INFO: loaded from: classes32.dex */
public abstract class BaseInnerPushAreaSlotAssem extends BaseInnerPushSlotAssem {
    public abstract void kp(View view);

    @Override // com.ss.android.ugc.aweme.innerpush.api.refactor.base.BaseInnerPushSlotAssem, com.bytedance.assem.arch.core.UIAssem
    public void onViewCreated(View view) {
        ViewGroup viewGroup;
        super.onViewCreated(view);
        ViewParent parent = view.getParent();
        if ((parent instanceof ViewGroup) && (viewGroup = (ViewGroup) parent) != null) {
            C786410Ut5.K7(viewGroup, new ACListenerS165S0100000_31(this, 74));
        }
    }
}
