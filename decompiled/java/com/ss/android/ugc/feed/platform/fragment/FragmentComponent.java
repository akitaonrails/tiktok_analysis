package com.ss.android.ugc.feed.platform.fragment;

import X.C01GW;
import X.C20673215v0;
import X.C452501pT;
import X.C734520Sra;
import X.InterfaceC734530Srb;
import X.InterfaceC735760Sta;
import android.app.Activity;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.feed.platform.panel.BasePanelUIComponent;
import com.ss.android.ugc.feed.platform.panel.IRootAbility;

/* JADX INFO: loaded from: classes12.dex */
public class FragmentComponent extends BasePanelUIComponent implements InterfaceC735760Sta {
    public final C01GW LLJIJIL = C452501pT.LIZIZ(new C734520Sra(this));

    @Override // X.InterfaceC743730TFj
    public final void Bg(Activity activity, Fragment fragment) {
    }

    @Override // X.InterfaceC743730TFj
    public final void L() {
    }

    @Override // X.InterfaceC743730TFj
    public final void LLLZIL() {
    }

    @Override // X.InterfaceC743730TFj
    public void LLZLLLL(View view, Bundle bundle) {
    }

    @Override // X.InterfaceC743730TFj
    public final void M() {
    }

    @Override // X.InterfaceC743730TFj
    public final void M1(Configuration configuration) {
    }

    @Override // X.InterfaceC743730TFj
    public final void Mf(Bundle bundle) {
    }

    @Override // X.InterfaceC743730TFj
    public final void P9(Bundle bundle) {
    }

    @Override // X.InterfaceC743730TFj
    public final void Re(Bundle bundle) {
    }

    @Override // X.InterfaceC743730TFj
    public final void Tg() {
    }

    @Override // X.InterfaceC743730TFj
    public final void cq() {
    }

    @Override // X.InterfaceC743730TFj
    public final void dd() {
    }

    @Override // X.InterfaceC743730TFj
    public final void fl() {
    }

    @Override // X.InterfaceC743730TFj
    public final void w4() {
    }

    @Override // com.bytedance.assem.arch.view.UIContentAssem, com.bytedance.assem.arch.core.UIAssem
    public final void xo() {
        View view = getSupervisor().LLJJIII;
        if (view != null) {
            Ao(view);
            oo(view);
        }
    }

    @Override // X.InterfaceC735760Sta
    public final View V2(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        InterfaceC734530Srb interfaceC734530SrbAA0;
        IRootAbility iRootAbility = (IRootAbility) this.LLJIJIL.getValue();
        if (iRootAbility == null || (interfaceC734530SrbAA0 = iRootAbility.AA0()) == null) {
            return null;
        }
        return C20673215v0.LIZJ(interfaceC734530SrbAA0.LIZJ(), getPanelContext().LIZ());
    }
}
