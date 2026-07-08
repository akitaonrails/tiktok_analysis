package com.ss.android.ugc.gamora.recorder.sticker.childeffectpanel;

import X.C09R3;
import X.C13LE;
import X.C1444560nh8;
import X.C1645710svZ;
import X.C1664740tQG;
import X.C1664750tQH;
import X.C1664770tQJ;
import X.C1DRG;
import X.C2217381BqS;
import X.C385670FAf;
import X.C786410Ut5;
import X.InterfaceC1623190sLF;
import X.InterfaceC1625000sOA;
import X.InterfaceC1631520sYg;
import X.InterfaceC2217461Bqa;
import X.InterfaceC379610EuV;
import X.InterfaceC577400Mkk;
import Y.ACListenerS159S0100000_25;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.scene.Scene;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes26.dex */
public final class g extends Scene implements InterfaceC379610EuV {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJIJI;
    public final C1DRG LLJI;
    public final InterfaceC1631520sYg LLJIJIL;
    public C1645710svZ LLJILJIL;
    public ViewGroup LLJILJILJ;
    public ViewGroup LLJILLL;
    public boolean LLJJ;
    public final C1664750tQH LLJJI;
    public final C1664740tQG LLJJIII;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(g.class, "stickerApiComponent", "getStickerApiComponent()Lcom/bytedance/creativex/recorder/sticker/api/StickerCoreApiComponent;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(g.class, "slideComponent", "getSlideComponent()Lcom/ss/android/ugc/slideslip/SlideSlipEffectApiComponent;", 0);
        c09r3.getClass();
        LLJJIJI = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2};
    }

    public final void hide() {
        C1645710svZ c1645710svZ = this.LLJILJIL;
        if (c1645710svZ != null) {
            C786410Ut5.C1(c1645710svZ, 8);
        }
    }

    public final void show() {
        C385670FAf<Boolean> c385670FAfA3;
        Boolean boolLIZJ;
        C1645710svZ c1645710svZ;
        if (!C1444560nh8.LIZ()) {
            hide();
            return;
        }
        C1664750tQH c1664750tQH = this.LLJJI;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJIJI;
        InterfaceC1623190sLF interfaceC1623190sLFU = ((InterfaceC1625000sOA) c1664750tQH.getValue(this, interfaceC2217461BqaArr[0])).U();
        ViewGroup viewGroupRN = interfaceC1623190sLFU != null ? interfaceC1623190sLFU.RN() : null;
        this.LLJILJILJ = viewGroupRN;
        ViewGroup viewGroup = viewGroupRN != null ? (ViewGroup) viewGroupRN.findViewById(R.id.w4h) : null;
        this.LLJILLL = viewGroup;
        if (viewGroup != null) {
            this.LLJILJIL = (C1645710svZ) viewGroup.findViewById(R.id.o_l);
        }
        C1645710svZ c1645710svZ2 = this.LLJILJIL;
        if (c1645710svZ2 != null) {
            C786410Ut5.C1(c1645710svZ2, 0);
        }
        InterfaceC577400Mkk interfaceC577400Mkk = (InterfaceC577400Mkk) this.LLJJIII.getValue(this, interfaceC2217461BqaArr[1]);
        if (interfaceC577400Mkk != null && (c385670FAfA3 = interfaceC577400Mkk.A3()) != null && (boolLIZJ = c385670FAfA3.LIZJ()) != null && boolLIZJ.booleanValue() && (c1645710svZ = this.LLJILJIL) != null) {
            C786410Ut5.C1(c1645710svZ, 8);
        }
        if (this.LLJJ) {
            return;
        }
        C1645710svZ c1645710svZ3 = this.LLJILJIL;
        if (c1645710svZ3 != null) {
            C786410Ut5.Sa(c1645710svZ3, new ACListenerS159S0100000_25(this, 44));
        }
        this.LLJJ = true;
    }

    @Override // X.InterfaceC379610EuV
    public final C1DRG getDiContainer() {
        return this.LLJI;
    }

    public g(C1DRG c1drg, InterfaceC1631520sYg interfaceC1631520sYg) {
        this.LLJI = c1drg;
        this.LLJIJIL = interfaceC1631520sYg;
        this.LLJJI = C1664770tQJ.LIZ(c1drg, InterfaceC1625000sOA.class, null);
        this.LLJJIII = C1664770tQJ.LIZIZ(c1drg, InterfaceC577400Mkk.class, null);
    }

    @Override // com.bytedance.scene.Scene
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
    }

    @Override // com.bytedance.scene.Scene
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return C786410Ut5.Td(layoutInflater, R.layout.af5, viewGroup, false);
    }
}
