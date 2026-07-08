package com.ss.android.ugc.gamora.editor.ailive.widget;

import X.AbstractC214814194y;
import X.C01GW;
import X.C0MFD;
import X.C0MGE;
import X.C452501pT;
import X.C786410Ut5;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS194S0000000_8;
import kotlin.jvm.internal.AFwS239S0000000_8;
import kotlin.jvm.internal.AwS552S0100000_8;

/* JADX INFO: loaded from: classes9.dex */
public final class EditAIGCHelpCenterScene extends AbstractC214814194y implements C0MGE {
    public final C01GW LLJJIJIL = C452501pT.LIZIZ(AFwS194S0000000_8.get$arr$(273));
    public final C01GW LLJJJ = C452501pT.LIZIZ(new AwS552S0100000_8(this, 587));
    public final C01GW LLJJJIL = C452501pT.LIZIZ(new AwS552S0100000_8(this, 588));

    public EditAIGCHelpCenterScene() {
        LLLLJ(AFwS239S0000000_8.get$arr$(190));
    }

    @Override // X.AbstractC214814194y, com.bytedance.scene.Scene
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        ((C0MFD) this.LLJJJIL.getValue()).LIZIZ(view);
    }

    @Override // X.AbstractC1447660nm8, X.C19A3, com.bytedance.scene.Scene
    public final ViewGroup onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return (ViewGroup) C786410Ut5.Td(layoutInflater, R.layout.t0, viewGroup, false);
    }
}
