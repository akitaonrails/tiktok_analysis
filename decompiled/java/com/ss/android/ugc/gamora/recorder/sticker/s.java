package com.ss.android.ugc.gamora.recorder.sticker;

import X.C01GW;
import X.C09R3;
import X.C0ETY;
import X.C0MGL;
import X.C0MJC;
import X.C111U;
import X.C13LE;
import X.C1621430sIP;
import X.C1622460sK4;
import X.C1622920sKo;
import X.C1623490sLj;
import X.C1624310sN3;
import X.C1631190sY9;
import X.C1631200sYA;
import X.C1631530sYh;
import X.C1635820sfc;
import X.C1664770tQJ;
import X.C1697810uHb;
import X.C1797450wsJ;
import X.C19GS;
import X.C1DRG;
import X.C20519815Rc;
import X.C2217381BqS;
import X.C267490Ae3;
import X.C306810C0x;
import X.C330830Cy1;
import X.C452501pT;
import X.C535390KzB;
import X.C539900LFk;
import X.C577980Mlg;
import X.InterfaceC1621070sHp;
import X.InterfaceC1621520sIY;
import X.InterfaceC1622330sJr;
import X.InterfaceC1622470sK5;
import X.InterfaceC1624480sNK;
import X.InterfaceC1628590sTx;
import X.InterfaceC1630630sXF;
import X.InterfaceC1635390sev;
import X.InterfaceC1638550sk1;
import X.InterfaceC1647420syK;
import X.InterfaceC1648020szI;
import X.InterfaceC1648570t0B;
import X.InterfaceC1649530t1j;
import X.InterfaceC1650930t3z;
import X.InterfaceC1652470t6T;
import X.InterfaceC1731706qJ;
import X.InterfaceC2217461Bqa;
import X.InterfaceC2254081DKk;
import android.widget.FrameLayout;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.services.IAVServiceProxy;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.component.a;
import com.ss.android.ugc.aweme.shortvideo.ui.TikTokCameraBaseGroupScene;
import com.ss.android.ugc.aweme.shortvideo.x2;
import com.ss.android.ugc.aweme.sticker.types.ar.uploadpicsticker.UploadPicStickerARPresenter;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.gamora.recorder.navi.DynamicSelectorHandler;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS265S0000000_25;
import kotlin.jvm.internal.AwS569S0100000_25;
import mn3.e0;

/* JADX INFO: loaded from: classes26.dex */
public final class s extends l0 {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] j0;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public static final int f431k0;
    public final InterfaceC1731706qJ g0;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public final InterfaceC1731706qJ f432h0;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public final C01GW f433i0;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(s.class, "recordAdapterApi", "getRecordAdapterApi()Lcom/ss/android/ugc/aweme/shortvideo/adapter/RecordAdapterApi;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(s.class, "lazyControlProgressConfig", "getLazyControlProgressConfig()Lcom/ss/android/ugc/aweme/property/LazyLoadControlProgressComponentConfig;", 0);
        c09r3.getClass();
        j0 = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2};
        f431k0 = 8;
    }

    private final InterfaceC1650930t3z Cp() {
        return (InterfaceC1650930t3z) this.f433i0.getValue();
    }

    private final void Ig() {
        x2 x2VarLLLLLLZ;
        C19GS c19gs = this.LLILLJJLI;
        getLifecycleOwner();
        C1DRG diContainer = getDiContainer();
        InterfaceC1624480sNK interfaceC1624480sNKC0 = C0();
        C1622460sK4 c1622460sK4VS0 = vS0();
        InterfaceC1630630sXF interfaceC1630630sXFNg = Ng();
        InterfaceC1652470t6T interfaceC1652470t6TOc = oc();
        FrameLayout frameLayout = null;
        TikTokCameraBaseGroupScene tikTokCameraBaseGroupScene = (TikTokCameraBaseGroupScene) getDiContainer().LJIIL(null, TikTokCameraBaseGroupScene.class);
        if (tikTokCameraBaseGroupScene != null && (x2VarLLLLLLZ = tikTokCameraBaseGroupScene.LLLLLLZ()) != null) {
            frameLayout = (FrameLayout) x2VarLLLLLLZ.requireViewById(R.id.sz6);
        }
        C0MJC c0mjc = new C0MJC(c19gs, this, diContainer, interfaceC1624480sNKC0, c1622460sK4VS0, interfaceC1630630sXFNg, interfaceC1652470t6TOc, frameLayout);
        if (C330830Cy1.LIZ()) {
            C1797450wsJ.LIZ.getClass();
            C1797450wsJ.LIZLLL();
        }
        sk(c0mjc);
        C1622460sK4 c1622460sK4VS02 = vS0();
        final InterfaceC1624480sNK interfaceC1624480sNKC02 = C0();
        ((ArrayList) c1622460sK4VS02.LIZJ).add(new InterfaceC1622470sK5(interfaceC1624480sNKC02) { // from class: X.0sK6
            public final InterfaceC1624480sNK LIZ;

            @Override // X.InterfaceC1622470sK5
            public final void LIZIZ() {
            }

            {
                this.LIZ = interfaceC1624480sNKC02;
            }

            @Override // X.InterfaceC1622470sK5
            public final boolean LIZ(Effect effect) {
                return C1624550sNR.LIZIZ(effect);
            }
        });
        this.i = c0mjc;
    }

    private final C1631190sY9 Jg() {
        return (C1631190sY9) this.f432h0.getValue(this, j0[1]);
    }

    private final void zg() {
        List listLJIILJJIL = C1697810uHb.LJIILJJIL(new C111U(this.LLILLJJLI, getCameraApiComponent().St2(), (InterfaceC1635390sev) getDiContainer().LJII(InterfaceC1635390sev.class, null), getShortVideoContext(), new AwS569S0100000_25(this, 645), this));
        UploadPicStickerARPresenter uploadPicStickerARPresenter = this.f;
        if (uploadPicStickerARPresenter != null) {
            listLJIILJJIL.add(uploadPicStickerARPresenter);
        }
        sk(new DynamicSelectorHandler(this.LLILLJJLI, listLJIILJJIL));
        Cg();
        if (C535390KzB.LIZ()) {
            Ig();
        }
    }

    public final InterfaceC1647420syK getRecordAdapterApi() {
        return (InterfaceC1647420syK) this.g0.getValue(this, j0[0]);
    }

    @Override // com.ss.android.ugc.gamora.recorder.sticker.l0
    public Function0<Boolean> ie() {
        return new AwS569S0100000_25(this, 646);
    }

    private final void Cg() {
        InterfaceC1628590sTx interfaceC1628590sTxBa;
        if (C306810C0x.LIZ() && (interfaceC1628590sTxBa = Ba()) != null) {
            C19GS c19gs = this.LLILLJJLI;
            InterfaceC2254081DKk interfaceC2254081DKkSt2 = getCameraApiComponent().St2();
            e0 cameraApiComponent = getCameraApiComponent();
            InterfaceC1648570t0B recordControlApi = getRecordControlApi();
            ShortVideoContext shortVideoContext = getShortVideoContext();
            C1DRG diContainer = getDiContainer();
            getLifecycleOwner();
            sk(new C20519815Rc(c19gs, interfaceC2254081DKkSt2, cameraApiComponent, interfaceC1628590sTxBa, recordControlApi, shortVideoContext, diContainer, this));
        }
    }

    private final InterfaceC1630630sXF Ng() {
        return getRecordAdapterApi().NV().LIZJ();
    }

    private final InterfaceC1648020szI Op() {
        return getRecordAdapterApi().VK0().LIZJ();
    }

    private final InterfaceC1649530t1j Rg() {
        return getRecordAdapterApi().qR0().LIZJ();
    }

    private final InterfaceC1638550sk1 gq() {
        return getRecordAdapterApi().Mv0().LIZJ();
    }

    @Override // com.ss.android.ugc.gamora.recorder.sticker.l0
    public void Ae() {
        InterfaceC1638550sk1 interfaceC1638550sk1Gq;
        if (!C577980Mlg.LIZIZ() || (interfaceC1638550sk1Gq = gq()) == null) {
            return;
        }
        interfaceC1638550sk1Gq.Ut1(true);
    }

    @Override // com.ss.android.ugc.gamora.recorder.sticker.l0
    public InterfaceC1628590sTx Ba() {
        return getRecordAdapterApi().NL1().LIZJ();
    }

    @Override // com.ss.android.ugc.gamora.recorder.sticker.l0
    public void Ee() {
        InterfaceC1648020szI interfaceC1648020szILIZJ = getRecordAdapterApi().VK0().LIZJ();
        if (interfaceC1648020szILIZJ != null) {
            interfaceC1648020szILIZJ.setTabSwitchEnabled(true);
        }
    }

    @Override // com.ss.android.ugc.gamora.recorder.sticker.l0
    public void Je() {
        super.Je();
        InterfaceC1647420syK recordAdapterApi = getRecordAdapterApi();
        a aVarLIZJ = recordAdapterApi.pi2().LIZJ();
        if (aVarLIZJ != null) {
            aVarLIZJ.eP2(false);
        }
        InterfaceC1648020szI interfaceC1648020szILIZJ = recordAdapterApi.VK0().LIZJ();
        if (interfaceC1648020szILIZJ != null) {
            interfaceC1648020szILIZJ.showBottomTab(false);
        }
        InterfaceC1630630sXF interfaceC1630630sXFLIZJ = recordAdapterApi.NV().LIZJ();
        if (interfaceC1630630sXFLIZJ != null) {
            interfaceC1630630sXFLIZJ.W9(false);
        }
        C0MGL c0mglLIZJ = recordAdapterApi.Vt2().LIZJ();
        if (c0mglLIZJ != null) {
            c0mglLIZJ.GN2(true);
        }
    }

    @Override // com.ss.android.ugc.gamora.recorder.sticker.l0
    public void Re() {
        super.Re();
        InterfaceC1647420syK recordAdapterApi = getRecordAdapterApi();
        a aVarLIZJ = recordAdapterApi.pi2().LIZJ();
        if (aVarLIZJ != null) {
            aVarLIZJ.eP2(true);
        }
        InterfaceC1648020szI interfaceC1648020szILIZJ = recordAdapterApi.VK0().LIZJ();
        if (interfaceC1648020szILIZJ != null) {
            interfaceC1648020szILIZJ.showBottomTab(true);
        }
        InterfaceC1630630sXF interfaceC1630630sXFLIZJ = recordAdapterApi.NV().LIZJ();
        if (interfaceC1630630sXFLIZJ != null) {
            interfaceC1630630sXFLIZJ.W9(true);
        }
    }

    @Override // com.ss.android.ugc.gamora.recorder.sticker.l0
    public InterfaceC1652470t6T oc() {
        return getRecordAdapterApi().O80().LIZJ();
    }

    @Override // com.ss.android.ugc.gamora.recorder.sticker.l0
    public boolean ug() {
        return super.ug() && !C539900LFk.LJIIIIZZ(getShortVideoContext());
    }

    @Override // com.ss.android.ugc.gamora.recorder.sticker.l0, X.AbstractC1622910sKn
    public void G2(InterfaceC1621520sIY interfaceC1621520sIY) {
        super.G2(interfaceC1621520sIY);
        C1623490sLj c1623490sLj = C1623490sLj.LIZ;
        if (C539900LFk.LJIIIIZZ(getShortVideoContext())) {
            interfaceC1621520sIY.LIZ(c1623490sLj);
        }
    }

    @Override // com.ss.android.ugc.gamora.recorder.sticker.l0
    public void Te(boolean z) {
        if (((IAVServiceProxy) ServiceManager.get().getService(IAVServiceProxy.class)).getStoryService().LJI()) {
            InterfaceC1648020szI interfaceC1648020szIOp = Op();
            if (interfaceC1648020szIOp != null) {
                C1631530sYh.LIZ.getClass();
                interfaceC1648020szIOp.setCurrentTab(C1631530sYh.LIZLLL, false, 0, false);
            }
            if (C1631200sYA.LIZ(Jg())) {
                ((C0ETY) getDiContainer().LJII(C0ETY.class, null)).Sd(InterfaceC1630630sXF.class, new AwS265S0000000_25(17));
            } else {
                InterfaceC1630630sXF interfaceC1630630sXFNg = Ng();
                if (interfaceC1630630sXFNg != null) {
                    interfaceC1630630sXFNg.Y60(false);
                }
            }
        }
        if (C577980Mlg.LIZIZ()) {
            InterfaceC1638550sk1 interfaceC1638550sk1Gq = gq();
            if (interfaceC1638550sk1Gq != null) {
                C1631530sYh.LIZ.getClass();
                interfaceC1638550sk1Gq.gj(C1631530sYh.LIZJ, z);
            }
            if (z) {
                InterfaceC1638550sk1 interfaceC1638550sk1Gq2 = gq();
                if (interfaceC1638550sk1Gq2 != null) {
                    interfaceC1638550sk1Gq2.JN0(false);
                }
            } else {
                InterfaceC1638550sk1 interfaceC1638550sk1Gq3 = gq();
                if (interfaceC1638550sk1Gq3 != null) {
                    interfaceC1638550sk1Gq3.Ut1(false);
                }
            }
        } else {
            InterfaceC1648020szI interfaceC1648020szIOp2 = Op();
            if (interfaceC1648020szIOp2 != null) {
                C1631530sYh.LIZ.getClass();
                interfaceC1648020szIOp2.setCurrentTab(C1631530sYh.LIZJ, z, 0, false);
            }
        }
        InterfaceC1649530t1j interfaceC1649530t1jRg = Rg();
        if (interfaceC1649530t1jRg != null) {
            interfaceC1649530t1jRg.p7(false);
        }
        InterfaceC1649530t1j interfaceC1649530t1jRg2 = Rg();
        if (interfaceC1649530t1jRg2 != null) {
            interfaceC1649530t1jRg2.jh(pyl.s.NORMAL);
        }
    }

    @Override // com.ss.android.ugc.gamora.recorder.sticker.l0
    public void Ve(String str) {
        super.Ve(str);
        InterfaceC1650930t3z interfaceC1650930t3zCp = Cp();
        if (interfaceC1650930t3zCp != null) {
            interfaceC1650930t3zCp.uC(str);
        }
    }

    @Override // com.ss.android.ugc.gamora.recorder.sticker.l0, X.AbstractC1622910sKn
    public void T2(FrameLayout frameLayout, InterfaceC1622330sJr interfaceC1622330sJr) {
        super.T2(frameLayout, interfaceC1622330sJr);
        zg();
    }

    @Override // com.ss.android.ugc.gamora.recorder.sticker.l0, X.AbstractC1622910sKn
    public void W2(FrameLayout frameLayout, InterfaceC1622330sJr interfaceC1622330sJr, C1635820sfc c1635820sfc) {
        super.W2(frameLayout, interfaceC1622330sJr, c1635820sfc);
        zg();
    }

    public s(C1DRG c1drg, InterfaceC1621070sHp interfaceC1621070sHp, C1621430sIP c1621430sIP, Function1<? super C1622920sKo, Unit> function1) {
        super(c1drg, interfaceC1621070sHp, c1621430sIP, function1);
        this.g0 = C1664770tQJ.LIZ(getDiContainer(), InterfaceC1647420syK.class, null);
        this.f432h0 = C1664770tQJ.LIZIZ(getDiContainer(), C1631190sY9.class, "lazyControlProgressConfig");
        this.f433i0 = C452501pT.LIZIZ(new AwS569S0100000_25(this, 647));
        if (((Boolean) C267490Ae3.LIZ.getValue()).booleanValue()) {
            C19GS c19gs = this.LLILLJJLI;
            ShortVideoContext shortVideoContext = getShortVideoContext();
            da();
            new C1624310sN3(c1drg, c19gs, this, shortVideoContext, this);
        }
    }
}
