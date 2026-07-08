package com.bytedance.tiktok.homepage.mainfragment;

import X.AbstractC738140SxQ;
import X.C1558520qew;
import X.C1566540qrs;
import X.C724240Sb0;
import X.InterfaceC1570850qyp;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;

/* JADX INFO: loaded from: classes25.dex */
public class BaseMainPageFragmentAssem extends AbstractC738140SxQ implements InterfaceC1570850qyp {
    public final /* synthetic */ C1566540qrs LL = new C1566540qrs();

    @Override // X.InterfaceC1570850qyp
    public void LLLZLZ(String str, String str2, boolean z, boolean z2, Bundle bundle, String str3) {
    }

    @Override // X.InterfaceC1570850qyp
    public final void N5() {
    }

    @Override // X.InterfaceC1570850qyp
    public void O9(ViewGroup viewGroup) {
    }

    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onParent_set_isOnParentSetEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onStart_isOnStartEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    @Override // X.InterfaceC1570850qyp
    public final void onNewIntent(Intent intent) {
    }

    @Override // X.InterfaceC1570850qyp
    public void t(String str, Fragment fragment, Fragment fragment2) {
    }

    @Override // X.AbstractC738140SxQ
    public final void onStart() {
        Fragment fragmentLJI;
        View view;
        if (!this.LL.LIZJ && (fragmentLJI = C724240Sb0.LJI(this)) != null && (view = fragmentLJI.getView()) != null) {
            bg(view);
        }
        super.onStart();
    }

    @Override // X.AbstractC738140SxQ
    public final void onParentSet() throws IllegalAccessException {
        super.onParentSet();
        C1558520qew.LIZLLL(this);
    }

    @Override // X.InterfaceC1570850qyp
    public void bg(View view) {
        this.LL.LIZJ = true;
    }
}
