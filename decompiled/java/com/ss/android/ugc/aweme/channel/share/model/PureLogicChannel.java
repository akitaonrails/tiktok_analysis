package com.ss.android.ugc.aweme.channel.share.model;

import X.C06KX;
import X.C0M7Y;
import X.C1371420lnA;
import X.C1371430lnB;
import X.C1374270lrl;
import X.C1375540lto;
import X.C424540Gkm;
import X.InterfaceC1369790lkX;
import android.content.Context;
import android.view.View;
import com.ss.android.ugc.aweme.share.improve.channel.ImChannel;
import com.ss.android.ugc.aweme.share.improve.channel.QrCodeChannel;

/* JADX INFO: loaded from: classes22.dex */
public abstract class PureLogicChannel implements InterfaceC1369790lkX, C06KX {
    @Override // X.InterfaceC1369790lkX
    public boolean LIZJ() {
        return false;
    }

    @Override // X.InterfaceC1369790lkX
    public final boolean LJIIL(C1371420lnA c1371420lnA, Context context, C0M7Y c0m7y) {
        return false;
    }

    @Override // X.InterfaceC1369790lkX
    public final boolean LJIIZILJ(Context context) {
        return true;
    }

    @Override // X.InterfaceC1369790lkX
    public final boolean LJIJ(C1374270lrl c1374270lrl, Context context, C0M7Y c0m7y) {
        return false;
    }

    @Override // X.InterfaceC1369790lkX
    public final void LJIL() {
    }

    @Override // X.InterfaceC1369790lkX
    public final void LJJI() {
    }

    @Override // X.InterfaceC1369790lkX
    public boolean LJJIFFI(C1371430lnB c1371430lnB, Context context, C0M7Y c0m7y) {
        return false;
    }

    @Override // X.InterfaceC1369790lkX
    public boolean LJJIII() {
        return this instanceof QrCodeChannel;
    }

    @Override // X.InterfaceC1369790lkX
    public void LJJIIJZLJL(int i) {
    }

    @Override // X.InterfaceC1369790lkX
    public void LJJIJIL(View view, boolean z) {
    }

    @Override // X.InterfaceC1369790lkX
    public final boolean LJJJIL(C1375540lto c1375540lto, Context context, C0M7Y c0m7y) {
        return false;
    }

    @Override // X.InterfaceC1370450llb
    public final int LJJJJLI() {
        return 101;
    }

    @Override // X.InterfaceC1369790lkX
    public final boolean LJJJLIIL() {
        return false;
    }

    @Override // X.InterfaceC1369790lkX
    public final float LJJL() {
        return 0.34f;
    }

    @Override // X.InterfaceC1369790lkX
    public boolean LJJLI() {
        return this instanceof ImChannel;
    }

    @Override // X.InterfaceC1369790lkX
    public boolean LJJLIIIJJI() {
        return false;
    }

    @Override // X.InterfaceC1369790lkX
    public final int LJIIJJI() {
        return LIZJ() ? 1 : 0;
    }

    @Override // X.InterfaceC1369790lkX
    public void LJIJI(C424540Gkm c424540Gkm, boolean z) {
        c424540Gkm.setImageDrawable(LJJII(c424540Gkm.getContext(), z));
    }
}
