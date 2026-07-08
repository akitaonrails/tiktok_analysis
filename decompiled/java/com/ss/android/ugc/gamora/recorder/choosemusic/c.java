package com.ss.android.ugc.gamora.recorder.choosemusic;

import X.AbstractC579260Mnk;
import X.C013C;
import X.C05YF;
import X.C09R3;
import X.C0CHQ;
import X.C0ETY;
import X.C1389880mGw;
import X.C13LE;
import X.C1443960ngA;
import X.C1452640nuA;
import X.C1454900nxo;
import X.C1458370o3P;
import X.C1458580o3k;
import X.C1637850sit;
import X.C1652400t6M;
import X.C1664770tQJ;
import X.C1673840tew;
import X.C19713312Ax;
import X.C19A3;
import X.C1DRG;
import X.C201955140j;
import X.C2217381BqS;
import X.C287490BOp;
import X.C343070Dcf;
import X.C385670FAf;
import X.C533930Kwp;
import X.C539900LFk;
import X.InterfaceC1638550sk1;
import X.InterfaceC1647420syK;
import X.InterfaceC1647890sz5;
import X.InterfaceC1648020szI;
import X.InterfaceC1648870t0f;
import X.InterfaceC1652190t61;
import X.InterfaceC1652370t6J;
import X.InterfaceC1652770t6x;
import X.InterfaceC1731706qJ;
import X.InterfaceC2217461Bqa;
import X.InterfaceC577380Mki;
import Y.AObjectS178S0000000_25;
import Y.AObjectS246S0100000_25;
import Y.AObserverS173S0200000_8;
import android.app.Activity;
import android.view.View;
import androidx.lifecycle.LiveData;
import com.ss.android.ugc.aweme.creative.model.music.AVMusic;
import com.ss.android.ugc.aweme.music.model.MusicBeanUtilKt;
import com.ss.android.ugc.aweme.port.in.IAnotherMusicService;
import com.ss.android.ugc.aweme.shortvideo.component.a;
import com.ss.android.ugc.aweme.shortvideo.d4;
import com.ss.android.ugc.aweme.shortvideo.model.ShootExtraData;
import com.ss.android.ugc.aweme.shortvideo.stitch.StitchParams;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS604S0100000_25;
import kotlin.jvm.internal.Intrinsics;
import lnn.q;

/* JADX INFO: loaded from: classes26.dex */
public final class c extends C1652400t6M {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLLII;
    public final C19A3 LLJLLIL;
    public final InterfaceC1731706qJ LLJLLL;
    public final InterfaceC1731706qJ LLJZ;
    public final InterfaceC1731706qJ LLJZIJLIL;
    public final InterfaceC1731706qJ LLL;
    public final InterfaceC1731706qJ LLLF;
    public final InterfaceC1731706qJ LLLFF;
    public final InterfaceC1731706qJ LLLFFI;
    public boolean LLLFZ;
    public final InterfaceC1652370t6J LLLI;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(c.class, "recordAdapterApi", "getRecordAdapterApi()Lcom/ss/android/ugc/aweme/shortvideo/adapter/RecordAdapterApi;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(c.class, "stickerApiComponent", "getStickerApiComponent()Lcom/ss/android/ugc/gamora/recorder/sticker/sticker_core/StickerApiComponent;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS3 = new C2217381BqS(c.class, "bottomTabApiComponent", "getBottomTabApiComponent()Lcom/ss/android/ugc/gamora/recorder/bottom/BottomTabApiComponent;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS4 = new C2217381BqS(c.class, "planCUIApiComponent", "getPlanCUIApiComponent()Lcom/ss/android/ugc/aweme/shortvideo/component/PlanCUIApiComponent;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS5 = new C2217381BqS(c.class, "recordPermissionApi", "getRecordPermissionApi()Lcom/ss/android/ugc/aweme/shortvideo/ui/permissionmanager/RecordPermissionUIApiComponent;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS6 = new C2217381BqS(c.class, "splitShootApiComponent", "getSplitShootApiComponent()Lcom/ss/android/ugc/gamora/recorder/splitshoot/SplitShootApiComponent;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS7 = new C2217381BqS(c.class, "cameraLayoutApiComponent", "getCameraLayoutApiComponent()Lcom/ss/android/ugc/gamora/recorder/layout/CameraLayoutApiComponent;", 0);
        c09r3.getClass();
        LLLII = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2, c2217381BqS3, c2217381BqS4, c2217381BqS5, c2217381BqS6, c2217381BqS7};
    }

    private final InterfaceC1648020szI Op() {
        return (InterfaceC1648020szI) this.LLJZIJLIL.getValue(this, LLLII[2]);
    }

    private final InterfaceC577380Mki R5() {
        return (InterfaceC577380Mki) this.LLLFFI.getValue(this, LLLII[6]);
    }

    private final a getPlanCUIApiComponent() {
        return (a) this.LLL.getValue(this, LLLII[3]);
    }

    private final InterfaceC1638550sk1 gq() {
        return (InterfaceC1638550sk1) this.LLLFF.getValue(this, LLLII[5]);
    }

    public final InterfaceC1652190t61 S5() {
        return (InterfaceC1652190t61) this.LLLF.getValue(this, LLLII[4]);
    }

    public final InterfaceC1647420syK getRecordAdapterApi() {
        return (InterfaceC1647420syK) this.LLJLLL.getValue(this, LLLII[0]);
    }

    public final q getStickerApiComponent() {
        return (q) this.LLJZ.getValue(this, LLLII[1]);
    }

    private final boolean N5() {
        return C539900LFk.LIZ(getShortVideoContext()) || !getShortVideoContext().LJJIL();
    }

    @Override // X.C1652400t6M
    public boolean P4() {
        return getShortVideoContext().creativeModel.initialModel.dmCameraModel.enterFromDM;
    }

    @Override // X.C1652400t6M
    public boolean T4() {
        return d4.LJJIII(getShortVideoContext()) || d4.LJIIIZ(getShortVideoContext());
    }

    public final void U5() {
        if (getShortVideoContext().LJJJJLL()) {
            if (C1443960ngA.LJIIJJI(getShortVideoContext().stitchContext.stitchParams)) {
                StitchParams stitchParams = getShortVideoContext().stitchContext.stitchParams;
                C1452640nuA.LJII(stitchParams != null ? stitchParams.getMusic() : null, false, getShortVideoContext().creativeModel.musicBuzModel);
                getShortVideoContext().LJJLIIIJILLIZJL("stitch");
                StitchParams stitchParams2 = getShortVideoContext().stitchContext.stitchParams;
                AVMusic music = stitchParams2 != null ? stitchParams2.getMusic() : null;
                StitchParams stitchParams3 = getShortVideoContext().stitchContext.stitchParams;
                sn(new C1454900nxo(false, "", music, stitchParams3 != null ? stitchParams3.getMusicPath() : null, true, -1L, 768));
            } else {
                C1452640nuA.LJII(null, false, getShortVideoContext().creativeModel.musicBuzModel);
            }
            l5();
        }
    }

    public final boolean d6() {
        return (getShortVideoContext().LJJIFFI() || getShortVideoContext().LJJLL() || d4.LJJII(getShortVideoContext()) || getShortVideoContext().LJJJ() || !N5() || getShortVideoContext().LJJIIZI() || getShortVideoContext().LJJIJ() || getShortVideoContext().creativeModel.initialModel.dmCameraModel.isBulletin || getShortVideoContext().LJJJJL() || getShortVideoContext().isDuetMode || d4.LJJIII(getShortVideoContext()) || d4.LJIIIZ(getShortVideoContext()) || getShortVideoContext().creativeModel.albumOpenApiModel != null) ? false : true;
    }

    @Override // X.C1652400t6M
    public void n5() {
        InterfaceC1648870t0f interfaceC1648870t0f = (InterfaceC1648870t0f) getDiContainer().LJII(InterfaceC1648870t0f.class, null);
        interfaceC1648870t0f.setNeedNoTouchListener(true);
        interfaceC1648870t0f.getNoBlockTouchEvent().LIZ(this, new AObjectS246S0100000_25(this, 381));
    }

    @Override // X.C1652400t6M, X.AbstractC2255721DQs
    public void onCreate() {
        ShootExtraData shootExtraData;
        super.onCreate();
        getRecordAdapterApi().n72(this);
        this.LLJLLIL.add(R.id.sz5, e4(), "RecordChooseMusicScene");
        if (C533930Kwp.LIZLLL("android.permission.CAMERA") && (shootExtraData = getShortVideoContext().creativeFlowData.getShootExtraData()) != null && Intrinsics.LJFF(shootExtraData.getReplaceOfflineMusic(), Boolean.TRUE)) {
            C1389880mGw c1389880mGw = new C1389880mGw(getActivity());
            c1389880mGw.LJIIIIZZ(2131848261);
            c1389880mGw.LJIIJ();
        }
        C201955140j.LJIILJJIL(C1673840tew.LIZIZ, "UnderstandingKeyCenter clearLocalUnderstandingKey");
        C1458580o3k.LIZ = null;
    }

    @Override // X.C1652400t6M, X.AbstractC2255721DQs
    public void onDestroy() {
        super.onDestroy();
        getRecordAdapterApi().n72(null);
        C201955140j.LJIILJJIL(C1673840tew.LIZIZ, "UnderstandingKeyCenter clearLocalUnderstandingKey");
        C1458580o3k.LIZ = null;
        C1458370o3P.LIZ.getClass();
        C1458370o3P.LJJII();
    }

    @Override // X.C1652400t6M
    public void registerObservers() {
        C385670FAf<String> c385670FAfJP0;
        C385670FAf<Boolean> c385670FAfRX1;
        super.registerObservers();
        getDiContainer();
        if (C343070Dcf.LIZIZ()) {
            if (getPlanCUIApiComponent().US().LIZJ().floatValue() < 1.0f) {
                View view = Q3().mView;
                if (view != null) {
                    view.setLayerType(2, null);
                }
                getPlanCUIApiComponent().Z40().LIZ(this, new AObjectS246S0100000_25(this, 384));
            }
            getPlanCUIApiComponent().US().LIZ(this, new AObjectS246S0100000_25(this, 385));
        }
        getPlanCUIApiComponent().RS().LIZ(this, new AObjectS246S0100000_25(this, 386));
        this.LLILLL.LIZ.LIZ(this, new AObjectS246S0100000_25(this, 387));
        InterfaceC1652190t61 interfaceC1652190t61S5 = S5();
        if (interfaceC1652190t61S5 != null && (c385670FAfRX1 = interfaceC1652190t61S5.rX1()) != null) {
            c385670FAfRX1.LIZ(this, new AObjectS246S0100000_25(this, 388));
        }
        Op().getBottomTabIndexChangeEvent().LIZ(this, new AObjectS246S0100000_25(this, 389));
        getPlanCUIApiComponent().LLZIL().LIZ(this, new AObjectS246S0100000_25(this, 390));
        getPlanCUIApiComponent().nS().LIZ(this, new AObjectS246S0100000_25(this, 391));
        InterfaceC1638550sk1 interfaceC1638550sk1Gq = gq();
        if (interfaceC1638550sk1Gq != null && (c385670FAfJP0 = interfaceC1638550sk1Gq.jP0()) != null) {
            c385670FAfJP0.LIZ(this, new AObjectS246S0100000_25(this, 392));
        }
        getPlanCUIApiComponent().Qw1().LIZ(this, new AObjectS246S0100000_25(this, 382));
        if (C1637850sit.LIZIZ(this)) {
            U5();
        } else {
            getPlanCUIApiComponent().E21().LIZ(this, new AObjectS246S0100000_25(this, 383));
        }
        getPlanCUIApiComponent().A71().LIZ(this, new AObjectS178S0000000_25(this, 3));
        if (!C287490BOp.LIZ()) {
            InterfaceC577380Mki interfaceC577380MkiR5 = R5();
            m6(interfaceC577380MkiR5 != null ? interfaceC577380MkiR5.r6() : null);
            return;
        }
        C1DRG diContainer = getDiContainer();
        if (C343070Dcf.LIZ()) {
            ((C0ETY) diContainer.LJII(C0ETY.class, null)).Sd(InterfaceC577380Mki.class, new AwS604S0100000_25(this, 352));
            return;
        }
        C05YF c05yf = (C05YF) diContainer.LJIIL(null, InterfaceC577380Mki.class);
        if (c05yf != null) {
            m6(((InterfaceC577380Mki) c05yf).r6());
        }
    }

    @Override // X.C1652400t6M
    public C385670FAf<Boolean> sK0() {
        return ((InterfaceC1647890sz5) getDiContainer().LJII(a.class, null)).sK0();
    }

    @Override // X.C1652400t6M
    public boolean E5() {
        return this.LLLFZ;
    }

    @Override // X.C1652400t6M
    public InterfaceC1652370t6J c3() {
        return this.LLLI;
    }

    public final void m6(LiveData<AbstractC579260Mnk> liveData) {
        C013C c013c = new C013C();
        c013c.element = this.LLLFZ;
        if (liveData != null) {
            liveData.observe(this, new AObserverS173S0200000_8(c013c, this, 4));
        }
    }

    @Override // X.C1652400t6M, X.InterfaceC1628590sTx
    public void mQ0(boolean z) {
        Class<?> cls;
        IAnotherMusicService iAnotherMusicService = (IAnotherMusicService) C0CHQ.LIZ().LJJJJL();
        if (!z) {
            Activity activityLIZIZ = C19713312Ax.LIZIZ();
            if (activityLIZIZ != null) {
                cls = activityLIZIZ.getClass();
            } else {
                cls = null;
            }
            if (!Intrinsics.LJFF(cls, iAnotherMusicService.LIZJ())) {
                InterfaceC1652770t6x interfaceC1652770t6xV3 = v3();
                if ((interfaceC1652770t6xV3 != null && interfaceC1652770t6xV3.Xq()) || getPlanCUIApiComponent().HF1()) {
                    return;
                }
                q stickerApiComponent = getStickerApiComponent();
                if (stickerApiComponent != null && stickerApiComponent.Eh2()) {
                    return;
                }
            } else {
                return;
            }
        }
        W2().t1();
    }

    public final void setEnable(boolean z) {
        if (getShortVideoContext().LJJJJLL() || getShortVideoContext().LJJJJZ() || getShortVideoContext().cameraComponentModel.isEditorProRecordMode || getShortVideoContext().LJJIJL()) {
            z = false;
        }
        y5(z);
        Yj(z);
        if (!getShortVideoContext().LJJJJL() && !getShortVideoContext().isDuetMode && !getShortVideoContext().LJJLL() && !getShortVideoContext().LJJIFFI()) {
            AVMusic aVMusicExtractAVMusic = MusicBeanUtilKt.extractAVMusic(getShortVideoContext().creativeModel.musicBuzModel);
            if (aVMusicExtractAVMusic == null && getShortVideoContext().cameraComponentModel.isEditorProRecordMode) {
                Y7(Boolean.FALSE, null, null);
                return;
            }
            if (z) {
                if (aVMusicExtractAVMusic == null) {
                    FO1(null, null);
                    return;
                }
                return;
            } else {
                if (aVMusicExtractAVMusic == null || !getShortVideoContext().LJJJJZI()) {
                    return;
                }
                FO1(aVMusicExtractAVMusic, getShortVideoContext().LJIIJJI());
                return;
            }
        }
        Y7(Boolean.FALSE, null, null);
    }

    public c(C19A3 c19a3, final C1DRG c1drg) {
        super(c19a3, c1drg);
        this.LLJLLIL = c19a3;
        this.LLJLLL = C1664770tQJ.LIZ(getDiContainer(), InterfaceC1647420syK.class, null);
        this.LLJZ = C1664770tQJ.LIZIZ(getDiContainer(), q.class, null);
        this.LLJZIJLIL = C1664770tQJ.LIZ(getDiContainer(), InterfaceC1648020szI.class, null);
        this.LLL = C1664770tQJ.LIZ(getDiContainer(), a.class, null);
        this.LLLF = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC1652190t61.class, null);
        this.LLLFF = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC1638550sk1.class, null);
        this.LLLFFI = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC577380Mki.class, null);
        this.LLLI = new InterfaceC1652370t6J() { // from class: X.0sxm
            @Override // X.InterfaceC1652370t6J
            public final boolean A3() {
                C385670FAf<Boolean> c385670FAfA3;
                Boolean boolLIZJ;
                InterfaceC577400Mkk interfaceC577400Mkk = (InterfaceC577400Mkk) c1drg.LJIIL(null, InterfaceC577400Mkk.class);
                if (interfaceC577400Mkk == null || (c385670FAfA3 = interfaceC577400Mkk.A3()) == null || (boolLIZJ = c385670FAfA3.LIZJ()) == null) {
                    return false;
                }
                return boolLIZJ.booleanValue();
            }

            @Override // X.InterfaceC1652370t6J
            public final void wd() {
                a aVarLIZJ = this.LIZ.getRecordAdapterApi().pi2().LIZJ();
                if (aVarLIZJ != null) {
                    aVarLIZJ.L02(false);
                }
            }

            @Override // X.InterfaceC1652370t6J
            public final void vd(AVMusic aVMusic) {
                InterfaceC1628900sUS interfaceC1628900sUS = (InterfaceC1628900sUS) c1drg.LJIIL(null, InterfaceC1628900sUS.class);
                if (interfaceC1628900sUS != null) {
                    interfaceC1628900sUS.vd(aVMusic);
                }
            }
        };
    }
}
