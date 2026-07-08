package com.ss.android.ugc.aweme.im.marshal;

import X.C01GW;
import X.C0HVA;
import X.C452501pT;
import X.InterfaceC1175904ir;
import android.view.View;
import com.ss.android.ugc.aweme.im.common.assem.IMUISlotViewAssem;
import kotlin.jvm.internal.AwS550S0100000_6;

/* JADX INFO: loaded from: classes7.dex */
public abstract class UiStateViewAssem<STATE, ACTION extends InterfaceC1175904ir, T extends View> extends IMUISlotViewAssem implements C0HVA {
    public final C01GW LLJJI = C452501pT.LIZIZ(new AwS550S0100000_6((UiStateViewAssem) this, 149));

    public abstract void hp(T t);

    @Override // X.C0HVA
    public final String Bc() {
        return (String) this.LLJJI.getValue();
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        hp(view);
    }
}
