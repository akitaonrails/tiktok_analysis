package com.ss.android.ugc.aweme.shortvideo.mvtemplate.ugctemplate;

import X.C01GW;
import X.C0F1U;
import X.C0LGP;
import X.C0LGR;
import X.C0MWZ;
import X.C13LE;
import X.C1664770tQJ;
import X.C19A3;
import X.C1DPV;
import X.C1DPW;
import X.C1DPX;
import X.C1DRG;
import X.C2217381BqS;
import X.C368610Ecl;
import X.C452501pT;
import X.C539860LFg;
import X.C560530Lyd;
import X.EnumC1641610sox;
import X.EnumC545560LaU;
import X.InterfaceC1650230t2r;
import X.InterfaceC1731706qJ;
import X.InterfaceC2217461Bqa;
import X.InterfaceC362610EJn;
import X.InterfaceC379610EuV;
import X.InterfaceC524950KiL;
import X.InterfaceC561050LzT;
import X.InterfaceC579760MoY;
import android.view.View;
import com.bytedance.als.LiveEvent;
import ge.i;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS194S0000000_8;
import kotlin.jvm.internal.AFwS239S0000000_8;
import kotlin.jvm.internal.AwS552S0100000_8;
import kotlin.jvm.internal.AwS587S0100000_8;
import mn3.e0;

/* JADX INFO: loaded from: classes9.dex */
public final class k extends i<InterfaceC561050LzT, p, C0LGP, C0LGR> implements InterfaceC561050LzT, C0F1U, InterfaceC379610EuV {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJJ;
    public static final int LLJJJIL;
    public final C19A3 LLJILJILJ;
    public final C1DRG LLJILLL;
    public final InterfaceC1731706qJ LLJJ;
    public InterfaceC579760MoY LLJJI;
    public final Function0<C0LGP> LLJJIII;
    public final Function0<C0LGR> LLJJIJI;
    public final C01GW LLJJIJIIJIL;
    public final C560530Lyd<Boolean> LLJJIJIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(k.class, "cameraApiComponent", "getCameraApiComponent()Lcom/bytedance/creativex/recorder/camera/api/CameraApiComponent;", 0);
        C13LE.LIZ.getClass();
        LLJJJ = new InterfaceC2217461Bqa[]{c2217381BqS};
        LLJJJIL = 8;
    }

    private final InterfaceC362610EJn H4() {
        return (InterfaceC362610EJn) this.LLJJIJIIJIL.getValue();
    }

    private final InterfaceC1650230t2r getCameraApiComponent() {
        return (InterfaceC1650230t2r) this.LLJJ.getValue(this, LLJJJ[0]);
    }

    public final void F4() {
        InterfaceC579760MoY interfaceC579760MoY = this.LLJJI;
        if (interfaceC579760MoY == null) {
            interfaceC579760MoY = null;
        }
        interfaceC579760MoY.confirm();
        O4();
    }

    public final void K4() {
        InterfaceC579760MoY interfaceC579760MoY = this.LLJJI;
        if (interfaceC579760MoY == null) {
            interfaceC579760MoY = null;
        }
        interfaceC579760MoY.n7();
        i3(AFwS239S0000000_8.get$arr$(105));
        hide();
    }

    public final void T4() {
        InterfaceC579760MoY interfaceC579760MoY = this.LLJJI;
        if (interfaceC579760MoY == null) {
            interfaceC579760MoY = null;
        }
        interfaceC579760MoY.LIZ();
        i3(AFwS239S0000000_8.get$arr$(106));
        hide();
        this.LLJJIJIL.LJIIJ(Boolean.FALSE);
    }

    private final void O4() {
        View previewView;
        InterfaceC1650230t2r cameraApiComponent = getCameraApiComponent();
        if (!(cameraApiComponent instanceof e0) || cameraApiComponent == null || (previewView = cameraApiComponent.getPreviewView()) == null) {
            return;
        }
        C368610Ecl.LIZ(previewView);
    }

    @Override // ge.i, X.InterfaceC1455500nym
    public void hide() {
        super.hide();
        InterfaceC524950KiL interfaceC524950KiLLIZ = C0MWZ.LIZ(this.LLJILJILJ);
        if (interfaceC524950KiLLIZ != null) {
            interfaceC524950KiLLIZ.b8(H4());
        }
        getCameraApiComponent().IU1().LIZIZ(EnumC545560LaU.UGC_TEMPLATE_RECORD_PREVIEW_VIDEO_SCENE, C1DPV.LIZIZ.LIZIZ(C1DPW.OPEN_CAMERA_CLOSE_UGC_PREVIEW, null), Boolean.FALSE);
    }

    @Override // ge.i, X.InterfaceC1455500nym
    public void show() {
        super.show();
        InterfaceC524950KiL interfaceC524950KiLLIZ = C0MWZ.LIZ(this.LLJILJILJ);
        if (interfaceC524950KiLLIZ != null) {
            interfaceC524950KiLLIZ.AH(H4());
        }
        getCameraApiComponent().IU1().LIZLLL(EnumC545560LaU.UGC_TEMPLATE_RECORD_PREVIEW_VIDEO_SCENE, C1DPV.LIZIZ.LIZJ(C1DPX.CLOSE_CAMERA_UGC_PREVIEW_OPEN, EnumC1641610sox.PAGE_INVISIBLE));
    }

    @Override // X.InterfaceC561050LzT
    public LiveEvent<Boolean> ZC() {
        return this.LLJJIJIL;
    }

    @Override // X.InterfaceC379610EuV
    public C1DRG getDiContainer() {
        return this.LLJILLL;
    }

    @Override // X.AbstractC1664470tPp
    public Function0<C0LGP> o2() {
        return this.LLJJIII;
    }

    @Override // X.AbstractC1664470tPp
    public Function0<C0LGR> w2() {
        return this.LLJJIJI;
    }

    private final void P4(C539860LFg c539860LFg) {
        i3(new AwS587S0100000_8(c539860LFg, 218));
    }

    public k(C19A3 c19a3, C1DRG c1drg) {
        super(c19a3);
        this.LLJILJILJ = c19a3;
        this.LLJILLL = c1drg;
        this.LLJJ = C1664770tQJ.LIZ(getDiContainer(), InterfaceC1650230t2r.class, null);
        this.LLJJIII = AFwS194S0000000_8.get$arr$(164);
        this.LLJJIJI = new AwS552S0100000_8(this, 326);
        this.LLJJIJIIJIL = C452501pT.LIZIZ(new AwS552S0100000_8(this, 325));
        this.LLJJIJIL = new C560530Lyd<>();
    }

    @Override // X.InterfaceC561050LzT
    public void QF2(C539860LFg c539860LFg, InterfaceC579760MoY interfaceC579760MoY) {
        this.LLJJI = interfaceC579760MoY;
        this.LLJJIJIL.LJIIJ(Boolean.TRUE);
        P4(c539860LFg);
        show();
    }
}
