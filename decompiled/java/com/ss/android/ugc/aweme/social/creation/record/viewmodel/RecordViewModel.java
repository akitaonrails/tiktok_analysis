package com.ss.android.ugc.aweme.social.creation.record.viewmodel;

import X.AnonymousClass0951;
import X.C01GW;
import X.C054G;
import X.C05YW;
import X.C09IC;
import X.C09R3;
import X.C0PEM;
import X.C1370905Yd;
import X.C13LE;
import X.C1658370tFz;
import X.C1658380tG0;
import X.C1658390tG1;
import X.C1658400tG2;
import X.C1658420tG4;
import X.C1658470tG9;
import X.C1658500tGC;
import X.C1664750tQH;
import X.C1664770tQJ;
import X.C1665700tRo;
import X.C1683130ttv;
import X.C1698260uIK;
import X.C1DFH;
import X.C1DRG;
import X.C2107308Nj;
import X.C2217381BqS;
import X.C2296808zG;
import X.C452501pT;
import X.EnumC1308705Af;
import X.InterfaceC1632530saJ;
import X.InterfaceC1645420sv6;
import X.InterfaceC1648760t0U;
import X.InterfaceC1655300tB2;
import X.InterfaceC1655310tB3;
import X.InterfaceC1656640tDC;
import X.InterfaceC2217461Bqa;
import X.InterfaceC346201Wa;
import X.InterfaceC379610EuV;
import androidx.lifecycle.ViewModel;
import kotlin.jvm.internal.AFwS311S0000000_25;
import kotlin.jvm.internal.AwS569S0100000_25;
import kotlin.jvm.internal.AwS639S0100000_25;

/* JADX INFO: loaded from: classes26.dex */
public final class RecordViewModel extends ViewModel implements InterfaceC379610EuV {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJI;
    public final C1DRG LL;
    public final C1664750tQH LLILLJJLI;
    public final C01GW LLILLL;
    public final C01GW LLILZ;
    public final C01GW LLILZIL;
    public final C1664750tQH LLILZLL;
    public final C1664750tQH LLIZ;
    public final AwS639S0100000_25 LLIZLLLIL;
    public final AnonymousClass0951 LLJ;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(RecordViewModel.class, "shootComponent", "getShootComponent()Lcom/ss/android/ugc/aweme/social/creation/record/viewmodel/component/ShootApiComponent;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(RecordViewModel.class, "recordControlCompatBridge", "getRecordControlCompatBridge()Lcom/ss/android/ugc/aweme/social/creation/record/viewmodel/bridge/RecordControlCompatBridgeApiComponent;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS3 = new C2217381BqS(RecordViewModel.class, "cameraLogicBridge", "getCameraLogicBridge()Lcom/ss/android/ugc/aweme/social/creation/record/viewmodel/bridge/CameraLogicVisibilityBridgeApi;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS4 = new C2217381BqS(RecordViewModel.class, "viewLayoutBridge", "getViewLayoutBridge()Lcom/ss/android/ugc/aweme/social/creation/record/view/CameraViewLayoutBridgeApiComponent;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS5 = new C2217381BqS(RecordViewModel.class, "cameraViewControlBridge", "getCameraViewControlBridge()Lcom/ss/android/ugc/aweme/social/creation/record/viewmodel/component/CameraViewControlBridgeApi;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS6 = new C2217381BqS(RecordViewModel.class, "centerViewTouchEventDispatcher", "getCenterViewTouchEventDispatcher()Lcom/ss/android/ugc/aweme/social/creation/record/launch/component/CenterViewTouchEventDispatcher;", 0);
        c09r3.getClass();
        LLJI = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2, c2217381BqS3, c2217381BqS4, c2217381BqS5, c2217381BqS6};
    }

    @Override // X.InterfaceC379610EuV
    public final C1DRG getDiContainer() {
        return this.LL;
    }

    public RecordViewModel(C1DRG c1drg) {
        this.LL = c1drg;
        this.LLILLJJLI = C1664770tQJ.LIZ(c1drg, InterfaceC1655300tB2.class, null);
        C1664750tQH c1664750tQHLIZ = C1664770tQJ.LIZ(c1drg, InterfaceC1656640tDC.class, null);
        C1664750tQH c1664750tQHLIZ2 = C1664770tQJ.LIZ(c1drg, InterfaceC1632530saJ.class, null);
        C1664750tQH c1664750tQHLIZ3 = C1664770tQJ.LIZ(c1drg, InterfaceC1655310tB3.class, null);
        C01GW c01gwLIZIZ = C452501pT.LIZIZ(new AwS569S0100000_25(this, 393));
        this.LLILLL = c01gwLIZIZ;
        C01GW c01gwLIZIZ2 = C452501pT.LIZIZ(new AwS569S0100000_25(this, 392));
        this.LLILZ = c01gwLIZIZ2;
        C01GW c01gwLIZIZ3 = C452501pT.LIZIZ(new AwS569S0100000_25(this, 391));
        this.LLILZIL = c01gwLIZIZ3;
        C1664750tQH c1664750tQHLIZ4 = C1664770tQJ.LIZ(c1drg, InterfaceC1648760t0U.class, null);
        this.LLILZLL = c1664750tQHLIZ4;
        this.LLIZ = C1664770tQJ.LIZ(c1drg, InterfaceC1645420sv6.class, null);
        this.LLIZLLLIL = new AwS639S0100000_25(this, 53);
        C1698260uIK c1698260uIK = ((C1658420tG4) c01gwLIZIZ.getValue()).LLILLL;
        AnonymousClass0951 anonymousClass0951 = ((C1658390tG1) c01gwLIZIZ2.getValue()).LLILLJJLI;
        AnonymousClass0951 anonymousClass09512 = ((C1658400tG2) c01gwLIZIZ3.getValue()).LLILLJJLI;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJI;
        C1698260uIK c1698260uIK2 = new C1698260uIK(new InterfaceC346201Wa[]{c1698260uIK, anonymousClass0951, anonymousClass09512, ((InterfaceC1656640tDC) c1664750tQHLIZ.getValue(this, interfaceC2217461BqaArr[1])).hx0(), ((InterfaceC1632530saJ) c1664750tQHLIZ2.getValue(this, interfaceC2217461BqaArr[2])).getState(), ((InterfaceC1655310tB3) c1664750tQHLIZ3.getValue(this, interfaceC2217461BqaArr[3])).EB(), ((InterfaceC1648760t0U) c1664750tQHLIZ4.getValue(this, interfaceC2217461BqaArr[4])).Bb2()}, new C1658380tG0(this, null), 12);
        C1DFH c1dfh = C0PEM.LIZ;
        C054G c054gLIZ = C2296808zG.LIZ(C2107308Nj.LIZ.LLIILII());
        C05YW.LIZ.getClass();
        this.LLJ = C09IC.LJJIJIL(c1698260uIK2, c054gLIZ, C1370905Yd.LIZIZ, new RecordViewModelState(new C1665700tRo(0), new C1658500tGC(null, null, 7), new C1658470tG9(null), new C1683130ttv(0.0f, 0.0f, 0.0f, 0.0f), false, true, EnumC1308705Af.NOT_RECORDING, AFwS311S0000000_25.get$arr$(25), new C1658370tFz(false, 15)));
    }
}
