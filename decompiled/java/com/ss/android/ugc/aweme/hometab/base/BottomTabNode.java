package com.ss.android.ugc.aweme.hometab.base;

import X.AbstractC1583720rJa;
import X.C01GW;
import X.C1584240rKQ;
import X.C1584460rKm;
import X.C1592130rX9;
import X.C1592140rXA;
import X.C1593020rYa;
import X.C19EG;
import X.C452501pT;
import X.InterfaceC1583080rIY;
import X.InterfaceC1584260rKS;
import X.InterfaceC1589850rTT;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.bytedance.pumbaa.utility.method_id.MethodIDManager;
import com.bytedance.tiktok.homepage.mainfragment.BottomTabProtocol;
import com.ss.android.ugc.aweme.TabFragmentNode;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes25.dex */
public final class BottomTabNode extends TabFragmentNode implements InterfaceC1584260rKS {
    public final Context LLIZLLLIL;
    public final BottomTabProtocol LLJ;
    public final C01GW LLJI = C452501pT.LIZIZ(new C1584240rKQ(this));

    @Override // com.ss.android.ugc.aweme.TabFragmentNode, X.InterfaceC1583870rJp
    public final void LJ(String str) {
    }

    @Override // com.ss.android.ugc.aweme.TabFragmentNode, X.InterfaceC1583870rJp
    public final void LJIIIIZZ(String str, String str2) {
    }

    @Override // X.InterfaceC1583870rJp
    public final String LIZLLL() {
        return this.LLJ.mc(this.LLIZLLLIL);
    }

    @Override // X.AbstractC1583720rJa, X.InterfaceC1583870rJp
    public final String LJFF() {
        return this.LLJ.getMob();
    }

    @Override // com.ss.android.ugc.aweme.TabFragmentNode, X.InterfaceC1583870rJp
    public final InterfaceC1589850rTT LJII() {
        return this.LLJ.LJ();
    }

    @Override // com.ss.android.ugc.aweme.TabFragmentNode, X.InterfaceC1583870rJp
    public final boolean LJIIIZ() {
        return this.LLJ.LJI();
    }

    @Override // com.ss.android.ugc.aweme.TabFragmentNode, X.InterfaceC1583870rJp
    public final void LJIIJ() {
        this.LLJ.LJIIIIZZ(this.LLIZLLLIL);
    }

    @Override // X.InterfaceC1584260rKS
    public final C1593020rYa LJIILL() {
        return (C1593020rYa) this.LLJI.getValue();
    }

    @Override // X.AbstractC1583720rJa
    public final Bundle LJIIZILJ() {
        return this.LLJ.V9(this.LLIZLLLIL);
    }

    @Override // X.AbstractC1583720rJa
    public final Class<? extends Fragment> LJIJ() {
        return this.LLJ.LLJIJIL();
    }

    @Override // X.AbstractC1583720rJa
    public final String tag() {
        return this.LLJ.getTag();
    }

    @Override // com.ss.android.ugc.aweme.TabFragmentNode, X.InterfaceC1583870rJp
    public final void LIZIZ() {
        boolean zLJI = MethodIDManager.LJI(71854);
        this.LLJ.LJII(this.LLIZLLLIL);
        if (zLJI) {
            MethodIDManager.LJ();
        }
    }

    public final int hashCode() {
        return tag().hashCode();
    }

    @Override // X.InterfaceC1583870rJp
    public final View LJI(InterfaceC1583080rIY interfaceC1583080rIY) {
        C1593020rYa c1593020rYaLJIILL = LJIILL();
        C1584460rKm c1584460rKm = (C1584460rKm) this.LLJ.LL.getValue();
        View viewLIZ = c1584460rKm.LIZ(interfaceC1583080rIY, c1593020rYaLJIILL);
        c1584460rKm.LL = viewLIZ;
        return viewLIZ;
    }

    public final boolean equals(Object obj) {
        Class<?> cls;
        if (this == obj) {
            return true;
        }
        if (obj != null) {
            cls = obj.getClass();
        } else {
            cls = null;
        }
        if (Intrinsics.LJFF(BottomTabNode.class, cls) && TextUtils.equals(tag(), ((AbstractC1583720rJa) obj).tag())) {
            return true;
        }
        return false;
    }

    public BottomTabNode(Context context, BottomTabProtocol bottomTabProtocol) {
        this.LLIZLLLIL = context;
        this.LLJ = bottomTabProtocol;
        bottomTabProtocol.init(context);
    }

    @Override // com.ss.android.ugc.aweme.TabFragmentNode, X.InterfaceC1583870rJp
    public final void LIZJ(C19EG c19eg, C1592130rX9 c1592130rX9, C1592140rXA c1592140rXA) {
        this.LLJ.LJIIIZ(c19eg, c1592130rX9, c1592140rXA);
    }
}
