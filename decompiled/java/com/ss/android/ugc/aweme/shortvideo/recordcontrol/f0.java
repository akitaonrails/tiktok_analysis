package com.ss.android.ugc.aweme.shortvideo.recordcontrol;

import X.C05YF;
import X.C089E;
import X.C09R3;
import X.C0CHA;
import X.C0CHQ;
import X.C0CNO;
import X.C13LE;
import X.C1419810n3D;
import X.C1644050sst;
import X.C1655380tBA;
import X.C1656050tCF;
import X.C1656110tCL;
import X.C1656120tCM;
import X.C1662150tM5;
import X.C1664770tQJ;
import X.C19GS;
import X.C1DRG;
import X.C201955140j;
import X.C201967140v;
import X.C2188811AlT;
import X.C2217381BqS;
import X.C558570LvT;
import X.C560530Lyd;
import X.C565600MGg;
import X.InterfaceC1631630sYr;
import X.InterfaceC1648570t0B;
import X.InterfaceC1652830t73;
import X.InterfaceC1655620tBY;
import X.InterfaceC1655990tC9;
import X.InterfaceC1731706qJ;
import X.InterfaceC2217461Bqa;
import com.bytedance.als.LiveEvent;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.services.IExternalService;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.WorkSpace.Workspace;
import com.ss.android.ugc.aweme.sticker.model.NewGreenScreenEffectModel;
import com.ss.android.vesdk.VEInfo;
import com.ss.android.vesdk.VERecorder;
import java.io.File;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS569S0100000_25;
import lgo.a;

/* JADX INFO: loaded from: classes26.dex */
public final class f0 extends C1656050tCF<e0> implements e0 {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] h;
    public final C560530Lyd<Boolean> LLZZZZ;
    public final InterfaceC1731706qJ a;
    public final InterfaceC1731706qJ b;
    public final InterfaceC1731706qJ c;
    public final InterfaceC1731706qJ d;
    public final C1655380tBA e;
    public volatile boolean f;
    public final LiveEvent<Boolean> g;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(f0.class, "shortVideoContext", "getShortVideoContext()Lcom/ss/android/ugc/aweme/shortvideo/ShortVideoContext;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(f0.class, "appCompatActivity", "getAppCompatActivity()Landroidx/appcompat/app/AppCompatActivity;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS3 = new C2217381BqS(f0.class, "componentizationConfig", "getComponentizationConfig()Lcom/ss/android/ugc/aweme/shortvideo/ui/RecordContainerComponentizationConfig;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS4 = new C2217381BqS(f0.class, "onBackPressedRegistry", "getOnBackPressedRegistry()Lcom/ss/android/ugc/aweme/saa/CreationOnBackPressedRegistry;", 0);
        c09r3.getClass();
        h = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2, c2217381BqS3, c2217381BqS4};
    }

    public e0 s7() {
        return this;
    }

    private final C565600MGg getComponentizationConfig() {
        return (C565600MGg) this.c.getValue(this, h[2]);
    }

    private final InterfaceC1655990tC9 y7() {
        return (InterfaceC1655990tC9) this.d.getValue(this, h[3]);
    }

    public final void L7() {
        if (this.f) {
            return;
        }
        this.f = true;
        C0CNO.LIZLLL(0L, new AwS569S0100000_25(this, 305));
    }

    public final ShortVideoContext getShortVideoContext() {
        return (ShortVideoContext) this.a.getValue(this, h[0]);
    }

    public final C19GS u7() {
        return (C19GS) this.b.getValue(this, h[1]);
    }

    @Override // X.C1656050tCF, X.InterfaceC1648570t0B
    public void KQ() {
        super.KQ();
        a.LIZIZ.LIZIZ().LIZ(C1662150tM5.LIZIZ);
    }

    @Override // X.C1656050tCF
    public void U5() {
        super.U5();
        a.LIZIZ.LIZIZ().LIZ(C1662150tM5.LIZIZ);
    }

    @Override // X.C1656050tCF
    public NewGreenScreenEffectModel n5() {
        NewGreenScreenEffectModel newGreenScreenEffectModel = getShortVideoContext().creativeModel.newGreenScreenEffectModel;
        return new NewGreenScreenEffectModel(newGreenScreenEffectModel.getOpenGreenScreenMode(), newGreenScreenEffectModel.getOpenPortraitMode(), newGreenScreenEffectModel.getGreenScreenMaterialType(), false);
    }

    @Override // X.C1656050tCF, X.InterfaceC1648570t0B
    public void oB0() {
        File[] fileArrYm;
        Workspace workspace = getShortVideoContext().cameraComponentModel.mWorkspace;
        if (workspace != null && (fileArrYm = workspace.LL.Ym()) != null && fileArrYm.length != 0) {
            C089E c089e = new C089E(fileArrYm);
            while (c089e.hasNext()) {
                C1419810n3D.LJFF(((File) c089e.next()).getPath());
            }
        }
        if (C0CHA.LIZ()) {
            super.oB0();
            C0CHQ.LIZ().LJI().LIZJ().LJIIIZ(getShortVideoContext().getCreationId(), this.LLILZIL.mWorkspace.LJ().getPath());
        } else {
            if (C0CHQ.LIZ().LJI().LJIILJJIL().LIZ(new C558570LvT(getShortVideoContext().creativeInfo, false, false, false, 14))) {
                return;
            }
            super.oB0();
        }
    }

    @Override // X.C1656050tCF, X.AbstractC2255721DQs
    public void onCreate() {
        super.onCreate();
        getCameraApi().St2().L0(new InterfaceC1631630sYr<Integer, Integer, String, VERecorder, Unit>() { // from class: X.0tCB
            @Override // X.InterfaceC1631630sYr
            public final Unit invoke(Integer num, Integer num2, String str, VERecorder vERecorder) {
                int iIntValue = num.intValue();
                num2.intValue();
                this.LL.I7(iIntValue);
                return Unit.LIZ;
            }
        });
        getCameraApi().St2().lh(new InterfaceC1652830t73() { // from class: X.0tCD
            @Override // X.InterfaceC1464200oCo
            public final void onCallback(int i, int i2, float f, String str) {
                if (i == VEInfo.TE_MSG_RECORD_HW_ENCODE_FAIL) {
                    this.LL.L7();
                }
            }
        });
        C565600MGg componentizationConfig = getComponentizationConfig();
        if (componentizationConfig == null || !componentizationConfig.LIZ) {
            return;
        }
        InterfaceC1655990tC9 interfaceC1655990tC9Y7 = y7();
        if (interfaceC1655990tC9Y7 != null) {
            interfaceC1655990tC9Y7.LJIJI(this.e);
        } else {
            "CreationOnBackPressedRegistry should register together with RecordContainerComponentizationConfig(true)".toString();
            throw new IllegalArgumentException("CreationOnBackPressedRegistry should register together with RecordContainerComponentizationConfig(true)");
        }
    }

    @Override // X.AbstractC2255721DQs
    public void onDestroy() {
        super.onDestroy();
        InterfaceC1655990tC9 interfaceC1655990tC9Y7 = y7();
        if (interfaceC1655990tC9Y7 != null) {
            interfaceC1655990tC9Y7.LJLLL(this.e);
        }
    }

    @Override // X.C1656050tCF, X.AbstractC2255721DQs
    public void onResume() {
        super.onResume();
        this.f = false;
    }

    @Override // X.AbstractC2255721DQs
    public void onStop() {
        super.onStop();
        C565600MGg componentizationConfig = getComponentizationConfig();
        if (componentizationConfig == null || !componentizationConfig.LIZ) {
            return;
        }
        V2(false);
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.recordcontrol.e0
    public LiveEvent<Boolean> EE1() {
        return this.g;
    }

    @Override // X.C1656050tCF
    /* JADX INFO: renamed from: O4 */
    public /* bridge */ /* synthetic */ InterfaceC1648570t0B getApiComponent() {
        s7();
        return this;
    }

    @Override // X.C1656050tCF, X.AbstractC2255721DQs
    public /* bridge */ /* synthetic */ C05YF getApiComponent() {
        s7();
        return this;
    }

    public final void I7(int i) {
        if (i == 1022) {
            C0CNO.LIZLLL(0L, new AwS569S0100000_25(this, 303));
            return;
        }
        if (i == 1080) {
            C0CNO.LIZLLL(0L, new AwS569S0100000_25(this, 304));
            ((IExternalService) ServiceManager.get().getService(IExternalService.class)).provideAVPerformance().end("tool_performance_start_record_latency", "recorder_first_frame");
        } else {
            if (i != 1003 && i != VEInfo.TE_RECORD_INFO_VIDEO_SW_ENCODER_INIT) {
                return;
            }
            ((IExternalService) ServiceManager.get().getService(IExternalService.class)).provideAVPerformance().step("tool_performance_start_record_latency", "recorder_init_done");
        }
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.recordcontrol.e0
    public void NK(boolean z) {
        this.LLZZZZ.LJIIJ(Boolean.valueOf(!z));
    }

    @Override // X.C1656050tCF, X.InterfaceC1648570t0B
    public void mE1(C1656120tCM c1656120tCM) {
        this.f = false;
        ShortVideoContext shortVideoContext = getShortVideoContext();
        if (shortVideoContext != null && (shortVideoContext.LJJLL() || shortVideoContext.cameraComponentModel.curBackgroundVideo != null)) {
            C201967140v c201967140v = C201967140v.LIZIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("setMaxDuration to ve: ");
            sbLIZ.append(shortVideoContext.cameraComponentModel.mMaxDuration);
            C201955140j.LIZLLL(c201967140v, "RecordControl", C2188811AlT.LIZIZ(sbLIZ));
            getCameraApi().St2().setRecordMaxDuration(shortVideoContext.cameraComponentModel.mMaxDuration);
        }
        super.mE1(c1656120tCM);
    }

    @Override // X.C1656050tCF, X.InterfaceC1648570t0B
    public void tu0(C1644050sst c1644050sst) {
        if (c1644050sst.LIZ != 0) {
            super.tu0(c1644050sst);
        } else {
            super.tu0(c1644050sst);
        }
    }

    /* JADX WARN: Type inference failed for: r0v8, types: [X.0tBA] */
    public f0(C1DRG c1drg, Function1<? super C1656110tCL, Unit> function1) {
        super(c1drg, function1);
        C560530Lyd<Boolean> c560530Lyd = new C560530Lyd<>();
        this.LLZZZZ = c560530Lyd;
        this.a = C1664770tQJ.LIZ(getDiContainer(), ShortVideoContext.class, null);
        this.b = C1664770tQJ.LIZ(getDiContainer(), C19GS.class, null);
        this.c = C1664770tQJ.LIZIZ(getDiContainer(), C565600MGg.class, null);
        this.d = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC1655990tC9.class, null);
        this.e = new InterfaceC1655620tBY() { // from class: X.0tBA
            @Override // X.InterfaceC1655620tBY
            public final void LJ() {
            }

            @Override // X.InterfaceC1655620tBY
            public final boolean onBackPressed() {
                return false;
            }

            @Override // X.InterfaceC1655620tBY
            public final boolean LJFF() {
                return (this.LIZ.Jv2().LIZJ().booleanValue() || this.LIZ.getShortVideoContext().creativeModel.aigcMetadataModel.isAigcEffect) ? false : true;
            }
        };
        this.g = c560530Lyd;
    }
}
