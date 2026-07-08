package com.ss.android.ugc.aweme.internalshare.impl.ui.iminput;

import X.C0I06;
import X.C457770HxH;
import X.InterfaceC1554640qYg;
import X.InterfaceC453710Hqj;
import X.InterfaceC494301wD;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.LifecycleOwnerKt;
import com.ss.android.ugc.aweme.im.assem.BasePanelContainerAssem;
import kotlin.jvm.internal.AwS550S0100000_6;

/* JADX INFO: loaded from: classes7.dex */
public final class InternalShareEmojiPanelAssem extends BasePanelContainerAssem implements C0I06, InterfaceC1554640qYg {
    @Override // X.C0I06
    public final void Dg(int i) {
    }

    @Override // com.ss.android.ugc.aweme.im.ability.RequestKeyboardAbility
    public final void Fr() {
    }

    @Override // X.C0I06
    public final Integer Ga() {
        return null;
    }

    @Override // X.C0I06
    public final void c8(long j) {
    }

    @Override // X.C0I06
    public final int fJ() {
        return 0;
    }

    @Override // X.C0I06
    public final long hN() {
        return 0L;
    }

    @Override // X.C0I06
    public final void la(int i) {
    }

    @Override // X.InterfaceC1554640qYg
    public final InterfaceC494301wD provideAbility(String str) {
        if (str.hashCode() != 1313643522) {
            return null;
        }
        return this;
    }

    @Override // X.C0I06
    public final void z4(int i) {
    }

    @Override // com.ss.android.ugc.aweme.im.assem.BasePanelContainerAssem, com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        C457770HxH c457770HxH = InterfaceC453710Hqj.LIZ;
        ViewGroup viewGroup = (ViewGroup) LJJIJL();
        LifecycleOwnerKt.getLifecycleScope(this);
        AwS550S0100000_6 awS550S0100000_6 = new AwS550S0100000_6(this, 450);
        c457770HxH.getClass();
        C457770HxH.LIZ(viewGroup, awS550S0100000_6);
    }
}
