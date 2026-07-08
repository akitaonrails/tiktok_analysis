package com.ss.android.ugc.aweme.shortvideo.ui.component;

import X.AbstractC2255721DQs;
import X.AbstractC848400XPy;
import X.AnonymousClass0801;
import X.C01GW;
import X.C05YF;
import X.C09R3;
import X.C0BNR;
import X.C0CHQ;
import X.C0CIU;
import X.C0CNO;
import X.C0DLQ;
import X.C0EN3;
import X.C0L07;
import X.C0LAB;
import X.C0XQ7;
import X.C1367960lha;
import X.C1392820mLg;
import X.C13LE;
import X.C1409940mnI;
import X.C1438550nXR;
import X.C1440005kM;
import X.C1440340naK;
import X.C1441530ncF;
import X.C1443030nef;
import X.C1443560nfW;
import X.C1447990nmf;
import X.C1448010nmh;
import X.C1448080nmo;
import X.C1448140nmu;
import X.C1448150nmv;
import X.C1448790nnx;
import X.C1449420noy;
import X.C1452150ntN;
import X.C1453870nw9;
import X.C1458410o3T;
import X.C1459710o5Z;
import X.C14EU;
import X.C1514430pVp;
import X.C15R5;
import X.C1624360sN8;
import X.C1627310sRt;
import X.C1630980sXo;
import X.C1650090t2d;
import X.C1653040t7O;
import X.C1653550t8D;
import X.C1655360tB8;
import X.C1655370tB9;
import X.C1655630tBZ;
import X.C1655640tBa;
import X.C1664770tQJ;
import X.C1699250uJv;
import X.C19221910Hx;
import X.C19712912At;
import X.C19771112Xd;
import X.C19EG;
import X.C1AF0;
import X.C1DI6;
import X.C1DPV;
import X.C1DPW;
import X.C1DRG;
import X.C201955140j;
import X.C20684815ws;
import X.C2208841Bcg;
import X.C2217381BqS;
import X.C2265108u9;
import X.C2475009mu;
import X.C275670ArF;
import X.C291390BbV;
import X.C305600ByQ;
import X.C306720C0o;
import X.C452501pT;
import X.C524780Ki4;
import X.C533930Kwp;
import X.C539900LFk;
import X.C540290LGx;
import X.C579950Mor;
import X.C778450UgF;
import X.C786410Ut5;
import X.C799570VYd;
import X.C855640XhS;
import X.C856140XiG;
import X.C860470XpF;
import X.C861880XrW;
import X.C863370Xtv;
import X.EnumC1448040nmk;
import X.EnumC1584370rKd;
import X.EnumC1641390sob;
import X.InterfaceC1624140sMm;
import X.InterfaceC1645590svN;
import X.InterfaceC1645720sva;
import X.InterfaceC1648570t0B;
import X.InterfaceC1731706qJ;
import X.InterfaceC2217461Bqa;
import X.InterfaceC362610EJn;
import X.InterfaceC379610EuV;
import Y.AObjectS242S0100000_9;
import Y.AObjectS246S0100000_25;
import Y.AObserverS227S0100000_25;
import Y.ARunnableS108S0100000_8;
import Y.ARunnableS125S0100000_25;
import Y.ARunnableS133S0100000_33;
import Y.ARunnableS87S0000000_8;
import android.hardware.display.DisplayManager;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.lifecycle.Lifecycle;
import com.bytedance.bpea.basics.Cert;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.creativex.recorder.gesture.DefaultGesturePresenter;
import com.bytedance.scene.Scene;
import com.ss.android.ugc.aweme.creative.model.CreativeDurationExtra;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.internal.AVCommerceServiceImpl;
import com.ss.android.ugc.aweme.mob.record.IRecordMobService;
import com.ss.android.ugc.aweme.service.IToolsOfflineService;
import com.ss.android.ugc.aweme.services.superentrance.SuperEntranceEvent;
import com.ss.android.ugc.aweme.shortvideo.SafeHandler;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.d4;
import com.ss.android.ugc.aweme.shortvideo.model.ShootExtraData;
import com.ss.android.ugc.aweme.shortvideo.ui.TikTokCameraBaseGroupScene;
import com.ss.android.ugc.aweme.shortvideo.ui.VideoRecordRootView;
import com.ss.android.ugc.aweme.tools.ToolsBaseLightSensorUtils;
import com.ss.android.ugc.aweme.utils.oh;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import dtj.u7;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS194S0000000_8;
import kotlin.jvm.internal.AwS569S0100000_25;
import kotlin.jvm.internal.AwS604S0100000_25;
import kotlin.jvm.internal.Intrinsics;
import lth.o;
import mn3.e0;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.ThreadMode;
import pyl.s;
import r1k.a;

/* JADX INFO: loaded from: classes26.dex */
public final class q extends AbstractC2255721DQs<InterfaceC1645590svN> implements InterfaceC1645590svN, InterfaceC379610EuV {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJLIL;
    public static final int LLJLILLLLZIIL;
    public final C1DRG LL;
    public boolean LLILZIL;
    public boolean LLIZ;
    public boolean LLIZLLLIL;
    public boolean LLJ;
    public boolean LLJI;
    public boolean LLJIJIL;
    public Effect LLJILJIL;
    public C1655360tB8 LLJJLIIIJLLLLLLLZ;
    public C1448010nmh LLJL;
    public final SafeHandler LLILLJJLI = new SafeHandler(this);
    public final C1650090t2d LLILLL = new C1650090t2d();
    public boolean LLILZ = true;
    public boolean LLILZLL = true;
    public long LLJILJILJ = -1;
    public long LLJILLL = -1;
    public final C01GW LLJJ = C452501pT.LIZIZ(new AwS569S0100000_25(this, 326));
    public final C01GW LLJJI = C452501pT.LIZIZ(new AwS569S0100000_25(this, 322));
    public final InterfaceC1731706qJ LLJJIII = C1664770tQJ.LIZ(getDiContainer(), ShortVideoContext.class, null);
    public final InterfaceC1731706qJ LLJJIJI = C1664770tQJ.LIZ(getDiContainer(), C1453870nw9.class, null);
    public final InterfaceC1731706qJ LLJJIJIIJIL = C1664770tQJ.LIZ(getDiContainer(), C1655630tBZ.class, null);
    public final InterfaceC1731706qJ LLJJIJIL = C1664770tQJ.LIZ(getDiContainer(), C19EG.class, null);
    public final InterfaceC1731706qJ LLJJJ = C1664770tQJ.LIZ(getDiContainer(), TikTokCameraBaseGroupScene.class, null);
    public final InterfaceC1731706qJ LLJJJIL = C1664770tQJ.LIZ(getDiContainer(), C1627310sRt.class, null);
    public final InterfaceC1731706qJ LLJJJJ = C1664770tQJ.LIZ(getDiContainer(), InterfaceC1648570t0B.class, null);
    public final InterfaceC1731706qJ LLJJJJJIL = C1664770tQJ.LIZ(getDiContainer(), e0.class, null);
    public final InterfaceC1731706qJ LLJJJJLIIL = C1664770tQJ.LIZ(getDiContainer(), lnn.q.class, null);
    public final InterfaceC362610EJn LLJJL = new InterfaceC362610EJn() { // from class: X.0tBR
        @Override // X.InterfaceC362610EJn
        public final boolean onKeyDown(int i, KeyEvent keyEvent) {
            C1655570tBT.LIZIZ.LJIIIZ(i, keyEvent);
            return false;
        }
    };

    @Override // X.InterfaceC1645590svN
    public void O02() {
        this.LLIZLLLIL = false;
    }

    public final void W1() {
    }

    public InterfaceC1645590svN Z1() {
        return this;
    }

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(q.class, "shortVideoContext", "getShortVideoContext()Lcom/ss/android/ugc/aweme/shortvideo/ShortVideoContext;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(q.class, "recordStateDispatch", "getRecordStateDispatch()Lcom/ss/android/ugc/aweme/shortvideo/util/performance/ScreenStateDispatch;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS3 = new C2217381BqS(q.class, "saaOnNewIntentReceiver", "getSaaOnNewIntentReceiver()Lcom/ss/android/ugc/aweme/adaptation/saa/SAAOnNewIntentReceiver;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS4 = new C2217381BqS(q.class, "activity", "getActivity()Landroidx/fragment/app/FragmentActivity;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS5 = new C2217381BqS(q.class, "rootScene", "getRootScene()Lcom/ss/android/ugc/aweme/shortvideo/ui/TikTokCameraBaseGroupScene;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS6 = new C2217381BqS(q.class, "recordRootSceneLoader", "getRecordRootSceneLoader()Lcom/ss/android/ugc/aweme/shortvideo/ui/RecordRootSceneLoader;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS7 = new C2217381BqS(q.class, "recordControlApi", "getRecordControlApi()Lcom/bytedance/creativex/recorder/camera/api/RecordControlApi;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS8 = new C2217381BqS(q.class, "cameraApiComponent", "getCameraApiComponent()Lcom/bytedance/creativex/recorder/camera/api/TikTokCameraApiComponent;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS9 = new C2217381BqS(q.class, "stickerApiComponent", "getStickerApiComponent()Lcom/ss/android/ugc/gamora/recorder/sticker/sticker_core/StickerApiComponent;", 0);
        c09r3.getClass();
        LLJLIL = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2, c2217381BqS3, c2217381BqS4, c2217381BqS5, c2217381BqS6, c2217381BqS7, c2217381BqS8, c2217381BqS9};
        LLJLILLLLZIIL = 8;
    }

    private final C1655630tBZ W2() {
        return (C1655630tBZ) this.LLJJIJIIJIL.getValue(this, LLJLIL[2]);
    }

    private final InterfaceC1648570t0B getRecordControlApi() {
        return (InterfaceC1648570t0B) this.LLJJJJ.getValue(this, LLJLIL[6]);
    }

    private final lnn.q getStickerApiComponent() {
        return (lnn.q) this.LLJJJJLIIL.getValue(this, LLJLIL[8]);
    }

    private final FrameLayout w2() {
        return (FrameLayout) this.LLJJI.getValue();
    }

    public final C1627310sRt G2() {
        return (C1627310sRt) this.LLJJJIL.getValue(this, LLJLIL[5]);
    }

    public final VideoRecordRootView H2() {
        return (VideoRecordRootView) this.LLJJ.getValue();
    }

    public final C1453870nw9<EnumC1641390sob> T2() {
        return (C1453870nw9) this.LLJJIJI.getValue(this, LLJLIL[1]);
    }

    public final void c3() {
        DefaultGesturePresenter defaultGesturePresenter = new DefaultGesturePresenter(getActivity(), this, null, w2());
        InterfaceC1645720sva effectController = getCameraApiComponent().St2().getEffectController();
        ViewGroup.LayoutParams layoutParams = getCameraApiComponent().fF2().getLayoutParams();
        defaultGesturePresenter.LJIIL(new a(effectController, new ViewGroup.MarginLayoutParams(layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null)), 1, 100);
    }

    public final C19EG getActivity() {
        return (C19EG) this.LLJJIJIL.getValue(this, LLJLIL[3]);
    }

    public final e0 getCameraApiComponent() {
        return (e0) this.LLJJJJJIL.getValue(this, LLJLIL[7]);
    }

    public final TikTokCameraBaseGroupScene getRootScene() {
        return (TikTokCameraBaseGroupScene) this.LLJJJ.getValue(this, LLJLIL[4]);
    }

    public final ShortVideoContext getShortVideoContext() {
        return (ShortVideoContext) this.LLJJIII.getValue(this, LLJLIL[0]);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0076 A[PHI: r1
      0x0076: PHI (r1v4 java.lang.String) = (r1v1 java.lang.String), (r1v2 java.lang.String), (r1v3 java.lang.String), (r1v5 java.lang.String) binds: [B:37:0x0073, B:34:0x006a, B:18:0x0039, B:15:0x0030] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void m3() {
        /*
            r4 = this;
            com.ss.android.ugc.aweme.shortvideo.ShortVideoContext r0 = r4.getShortVideoContext()
            java.lang.String r0 = r0.shootWay
            if (r0 != 0) goto L9
            return
        L9:
            java.lang.String r3 = com.ss.android.ugc.aweme.sticker.model.FaceStickerBean.sCurPropSource
            com.ss.android.ugc.aweme.shortvideo.ShortVideoContext r0 = r4.getShortVideoContext()
            java.lang.String r2 = r0.shootWay
            if (r2 == 0) goto L1c
            int r0 = r2.hashCode()
            java.lang.String r1 = "prop_reuse"
            switch(r0) {
                case -1731750228: goto L6d;
                case -1723515079: goto L64;
                case -1098262888: goto L5b;
                case 3449699: goto L50;
                case 3524221: goto L45;
                case 474773721: goto L3c;
                case 669986889: goto L33;
                case 1402633315: goto L2a;
                case 1911525183: goto L1f;
                default: goto L1c;
            }
        L1c:
            com.ss.android.ugc.aweme.sticker.model.FaceStickerBean.sCurPropSource = r3
            return
        L1f:
            java.lang.String r0 = "green_screen_kit"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L1c
            java.lang.String r3 = "prop_share_panel"
            goto L1c
        L2a:
            java.lang.String r1 = "challenge"
            boolean r0 = r2.equals(r1)
            if (r0 != 0) goto L76
            goto L1c
        L33:
            java.lang.String r1 = "direct_shoot"
            boolean r0 = r2.equals(r1)
            if (r0 != 0) goto L76
            goto L1c
        L3c:
            java.lang.String r0 = "reuse_giphy_gif"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L62
            goto L1c
        L45:
            java.lang.String r0 = "scan"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L1c
            java.lang.String r3 = "qr_code"
            goto L1c
        L50:
            java.lang.String r0 = "prop"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L1c
            java.lang.String r3 = "homepage_prop_maker"
            goto L1c
        L5b:
            boolean r0 = r2.equals(r1)
            if (r0 != 0) goto L62
            goto L1c
        L62:
            r3 = r1
            goto L1c
        L64:
            java.lang.String r1 = "trends_publish_entry"
            boolean r0 = r2.equals(r1)
            if (r0 != 0) goto L76
            goto L1c
        L6d:
            java.lang.String r1 = "single_song"
            boolean r0 = r2.equals(r1)
            if (r0 != 0) goto L76
            goto L1c
        L76:
            r3 = r1
            goto L1c
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.shortvideo.ui.component.q.m3():void");
    }

    private final long o2() {
        C1448010nmh c1448010nmh;
        if (!C1448080nmo.LIZ() || (c1448010nmh = this.LLJL) == null) {
            return 0L;
        }
        return c1448010nmh.LIZ();
    }

    public final void X1() {
        getCameraApiComponent().NF(s.NORMAL);
        getRecordControlApi().jJ1(true);
        getStickerApiComponent().Mg2();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v3, types: [X.0tB9, android.hardware.display.DisplayManager$DisplayListener] */
    @Override // X.AbstractC2255721DQs
    public void onCreate() {
        super.onCreate();
        C19EG activity = getActivity();
        ShortVideoContext shortVideoContext = getShortVideoContext();
        TikTokCameraBaseGroupScene rootScene = getRootScene();
        final C1655360tB8 c1655360tB8 = new C1655360tB8(activity, shortVideoContext, rootScene, new AwS569S0100000_25(this, 323), new AwS569S0100000_25(this, 324));
        this.LLJJLIIIJLLLLLLLZ = c1655360tB8;
        rootScene.LJLJJL(c1655360tB8);
        rootScene.LJJLIL(c1655360tB8);
        rootScene.LLI(c1655360tB8);
        rootScene.LJIJI(c1655360tB8);
        Object objJ2 = C786410Ut5.J2(activity, "display");
        c1655360tB8.LJFF = objJ2 instanceof DisplayManager ? (DisplayManager) objJ2 : null;
        c1655360tB8.LJII = c1655360tB8.LJI();
        ?? r1 = new DisplayManager.DisplayListener() { // from class: X.0tB9
            @Override // android.hardware.display.DisplayManager.DisplayListener
            public final void onDisplayAdded(int i) {
            }

            @Override // android.hardware.display.DisplayManager.DisplayListener
            public final void onDisplayRemoved(int i) {
            }

            @Override // android.hardware.display.DisplayManager.DisplayListener
            public final void onDisplayChanged(int i) {
                int iLJI = c1655360tB8.LJI();
                C1655360tB8 c1655360tB82 = c1655360tB8;
                if (iLJI != c1655360tB82.LJII) {
                    c1655360tB82.LJII = iLJI;
                    if (c1655360tB82.LJ.invoke().booleanValue() && C12VA.LIZ().LJIIJJI.invoke().booleanValue()) {
                        c1655360tB8.LIZLLL.invoke().St2().getCameraController().s4().Q3();
                    }
                }
            }
        };
        c1655360tB8.LJI = r1;
        DisplayManager displayManager = c1655360tB8.LJFF;
        if (displayManager != 0) {
            displayManager.registerDisplayListener(r1, null);
        }
        if (C1448080nmo.LIZ()) {
            this.LLJL = new C1448010nmh();
        }
        EventBus.LIZLLL().LJIJJ(this);
        o.LIZLLL();
        C0CHQ.LIZ().getPublishService().LJI();
        C1443030nef c1443030nefLJII = C1443030nef.LJII();
        String str = getShortVideoContext().shootWay;
        c1443030nefLJII.LIZIZ = str;
        c1443030nefLJII.LIZJ = str;
        C1443030nef.LJII().LIZLLL = getShortVideoContext().mShootFrom;
        m3();
        C1DPV c1dpv = C1DPV.LIZIZ;
        c1dpv.LIZ(C1448150nmv.LIZ(getShortVideoContext()));
        C1409940mnI.LJI();
        C15R5.LJI.LJIIIIZZ(getActivity());
        boolean zLIZ = new C1653550t8D(getShortVideoContext()).LIZ();
        this.LLILLJJLI.postDelayed(new ARunnableS125S0100000_25(this, 41), zLIZ ? 2000L : 0L);
        if (zLIZ) {
            if (C19712912At.LIZ.LIZJ()) {
                this.LLIZ = true;
            } else {
                PR(c1dpv.LIZIZ(C1DPW.OPEN_CAMERA_ENTER_SHOOT, null), true);
            }
        }
        getCameraApiComponent().A31().LIZ(this, new AObjectS246S0100000_25(this, 206));
        getCameraApiComponent().qF1().observe(this, new AObserverS227S0100000_25(this, 26));
        T2().LIZLLL(EnumC1641390sob.ACTIVITY_ENTER_ANIMATION_END).LIZ(this, new AObjectS246S0100000_25(this, 205));
        getCameraApiComponent().PB(new C1441530ncF());
        getCameraApiComponent().St2().setControllerCallback(new C19771112Xd(getShortVideoContext().getCreationId(), getShortVideoContext().creativeModel.audioAlgorithmModel));
        W2().LIZ.LIZ(C1655640tBa.LL).LJIIIZ(this, Lifecycle.State.STARTED, new AwS604S0100000_25(this, 181));
        H2().setOnDrawnListener(new ARunnableS125S0100000_25(this, 42));
        if (!getShortVideoContext().creativeModel.loadMusicAndEffectModel.isDraftMusicLegal) {
            HandlerHook.viewPost(H2(), new ARunnableS108S0100000_8(this, 58));
        }
        if (getShortVideoContext().creativeModel.loadMusicAndEffectModel.netUnavailableMusic) {
            HandlerHook.viewPost(H2(), new ARunnableS108S0100000_8(this, 55));
        }
        o.LIZJ.getClass();
        C1514430pVp.LJFF(EnumC1584370rKd.valueOf("SHOOT"));
        this.LLILLJJLI.post(new ARunnableS108S0100000_8(this, 56));
        C1459710o5Z.LJIIJJI = true;
        C1448790nnx.LIZ = true;
        C1448790nnx.LIZIZ = true;
        C1448790nnx.LIZJ = true;
        if (C306720C0o.LIZ()) {
            G2().LIZ.LJII(Boolean.TRUE);
            this.LLILZ = false;
        }
        C863370Xtv.LIZ("normal").LJI("at_shoot_page", false);
        C1367960lha.LIZ.getClass();
        C1367960lha.LIZ().LJJZZI(getActivity());
        this.LLILLJJLI.post(new ARunnableS108S0100000_8(this, 57));
        C2208841Bcg.LIZ(C0CHQ.LIZ);
        if (C291390BbV.LIZ()) {
            C0EN3.LIZ();
        }
        C1453870nw9<EnumC1641390sob> c1453870nw9T2 = T2();
        AFwS194S0000000_8 aFwS194S0000000_8 = AFwS194S0000000_8.get$arr$(177);
        EnumC1641390sob enumC1641390sob = EnumC1641390sob.CAMERA_FRAME_AVAILABLE;
        if (!((Boolean) C0BNR.LIZ.getValue()).booleanValue() || c1453870nw9T2 == null) {
            aFwS194S0000000_8.invoke();
        } else {
            c1453870nw9T2.LIZJ(enumC1641390sob.getValue()).LIZ(this, new AObjectS242S0100000_9(aFwS194S0000000_8, 0));
        }
        if (getShortVideoContext().isSpecialPlusIcon == 1) {
            C1440005kM.LIZ(new SuperEntranceEvent(3, false));
        }
        if (!C539900LFk.LIZIZ(getShortVideoContext())) {
            getShortVideoContext().creativeModel.recordData.enterShootPageTime = System.currentTimeMillis();
            CreativeDurationExtra creativeDurationExtra = getShortVideoContext().creativeFlowData.getCreativeDurationExtra();
            if (creativeDurationExtra.getStartTime() == 0) {
                creativeDurationExtra.setStartTime(System.currentTimeMillis());
            }
        }
        IToolsOfflineService iToolsOfflineService = (IToolsOfflineService) ServiceManager.get().getService(IToolsOfflineService.class);
        H2();
        iToolsOfflineService.LIZJ();
    }

    @Override // X.AbstractC2255721DQs
    public void onDestroy() {
        DisplayManager displayManager;
        C1448010nmh c1448010nmh;
        super.onDestroy();
        if (C1448080nmo.LIZ() && (c1448010nmh = this.LLJL) != null) {
            C201955140j.LIZIZ("BackgroundDurationTracker", "reset: State reset.");
            c1448010nmh.LIZ = EnumC1448040nmk.LL;
            c1448010nmh.LIZIZ = 0L;
            c1448010nmh.LIZJ = 0L;
        }
        C1655360tB8 c1655360tB8 = this.LLJJLIIIJLLLLLLLZ;
        if (c1655360tB8 != null) {
            c1655360tB8.LIZJ.LJIIZILJ(c1655360tB8);
            c1655360tB8.LIZJ.LLJJ(c1655360tB8);
            c1655360tB8.LIZJ.LJIJ(c1655360tB8);
            c1655360tB8.LIZJ.LJLLL(c1655360tB8);
            C1655370tB9 c1655370tB9 = c1655360tB8.LJI;
            if (c1655370tB9 != null && (displayManager = c1655360tB8.LJFF) != null) {
                displayManager.unregisterDisplayListener(c1655370tB9);
            }
            c1655360tB8.LJI = null;
            c1655360tB8.LJFF = null;
        }
        EventBus.LIZLLL().LJJI(this);
        C1624360sN8.LIZ.clear();
        C1624360sN8.LIZIZ.clear();
        C1653040t7O.LIZ.LJ();
        o.LJI.dl();
        C1458410o3T.LJIIJJI(true);
        C19221910Hx c19221910Hx = (C19221910Hx) o.LIZJ;
        c19221910Hx.getClass();
        C786410Ut5.LJL(C799570VYd.LIZIZ(), new ARunnableS133S0100000_33(c19221910Hx, 60));
        C856140XiG.LIZIZ("editor");
        C2475009mu.LJ(C0L07.LIZ.getSecond());
        C0L07.LIZ = new Pair<>(null, null);
        C786410Ut5.LJLILLLLZI(C1699250uJv.LLILLL.LL, 1);
        C1448790nnx.LIZ = false;
        C1448790nnx.LIZIZ = false;
        C1448790nnx.LIZJ = false;
        C0CHQ.LIZ().getPublishService().LIZ();
        AVCommerceServiceImpl.LJIIJ().LIZJ();
        C524780Ki4.LIZ.leave(getActivity(), "record");
        C2265108u9.LIZIZ();
        C863370Xtv.LIZ("normal").LJFF("at_shoot_page");
        C1452150ntN.LIZLLL();
        C1452150ntN.LJFF = null;
        C1452150ntN.LJI = null;
        C1452150ntN.LJII = null;
        C1DPV.LIZIZ.LIZ.getClass();
        C1DI6.LIZIZ = null;
    }

    @Override // X.AbstractC2255721DQs
    public void onPause() {
        super.onPause();
        C524780Ki4.LIZ.pause(getActivity(), "record", getShortVideoContext().shootWay, getShortVideoContext().getCreationId());
        if (C861880XrW.LIZIZ().enable) {
            C860470XpF.LIZ("tool_record_page_load");
        } else {
            oh.LJ("tool_record_enter");
        }
        getRootScene().b8(this.LLJJL);
    }

    @Override // X.AbstractC2255721DQs
    public void onResume() {
        super.onResume();
        if (((Boolean) C275670ArF.LIZ.getValue()).booleanValue() && !this.LLJI && C0DLQ.LIZ() == 2) {
            this.LLJI = true;
            T2().LIZLLL(EnumC1641390sob.ACTIVITY_ENTER_ANIMATION_END).LIZ(this, new AObjectS246S0100000_25(this, 207));
        }
        this.LLJILJILJ = System.currentTimeMillis();
        getShortVideoContext().creativeModel.recordMobModel.onActivityResumeMillis = this.LLJILJILJ;
        getShortVideoContext().creativeModel.ffdEventReport.shootUiFFD = this.LLJILJILJ - getShortVideoContext().creativeModel.recordMobModel.startRecordTime;
        if (this.LLIZ) {
            PR(C1DPV.LIZIZ.LIZIZ(C1DPW.OPEN_CAMERA_FIRST_ON_RESUME, null), true);
            this.LLIZ = false;
        } else if (C0DLQ.LIZ() == 3) {
            if (((Boolean) C305600ByQ.LIZ.getValue()).booleanValue()) {
                getCameraApiComponent().XB();
            }
            PR(C0DLQ.LIZJ, false);
        }
        if (getShortVideoContext().mIsFromDraft && !getShortVideoContext().LJJJJIZL()) {
            C0CNO.LIZJ(180L, new ARunnableS87S0000000_8(2));
        }
        if (this.LLJIJIL) {
            InterfaceC1624140sMm interfaceC1624140sMm = o.LJJI;
            getActivity();
            o.LJJI.getClass();
            interfaceC1624140sMm.getClass();
            this.LLJIJIL = false;
        }
        if (u7.LJ()) {
            C0LAB c0lab = new C0LAB();
            c0lab.LJ(Scene.SCENE_SERVICE, "resume_record");
            c0lab.LJ("shoot_way", getShortVideoContext().shootWay);
            c0lab.LJ("creation_id", getShortVideoContext().getCreationId());
            c0lab.LJ("enter_from", getShortVideoContext().enterFrom);
            C1699250uJv.LLILLL.getClass();
            c0lab.LIZIZ(0L, "dalvikPss");
            c0lab.LIZIZ(0L, "nativePss");
            c0lab.LIZIZ(0L, "otherPss");
            c0lab.LIZIZ(0L, "totalPss");
            C20684815ws.LJIILLIIL("av_memory_log", c0lab.LIZ);
        }
        if (!C0CIU.LIZJ()) {
            C540290LGx.LIZ.LJIIJJI(getActivity(), new AwS569S0100000_25(this, 325));
        }
        this.LLILLL.LIZ(-1, System.currentTimeMillis() - getShortVideoContext().creativeModel.recordMobModel.startRecordTime, "click_plus", true);
        getRootScene().kF(this.LLJJL);
    }

    @Override // X.AbstractC2255721DQs
    public void onStart() {
        C1448010nmh c1448010nmh;
        super.onStart();
        if (this.LLJILLL == -1) {
            this.LLJILLL = System.currentTimeMillis();
        }
        if (!C1448080nmo.LIZ() || (c1448010nmh = this.LLJL) == null) {
            return;
        }
        c1448010nmh.LIZIZ();
    }

    @Override // X.AbstractC2255721DQs
    public void onStop() {
        C1448010nmh c1448010nmh;
        super.onStop();
        if (C1448080nmo.LIZ() && (c1448010nmh = this.LLJL) != null) {
            c1448010nmh.LIZJ();
        }
        long j = getShortVideoContext().creativeModel.recordMobModel.exitRecordTimeMillis;
        if (j != -1) {
            long jCurrentTimeMillis = System.currentTimeMillis() - j;
            if (jCurrentTimeMillis < 10000) {
                this.LLILLL.LIZ(-1, jCurrentTimeMillis, "click_close_camera", false);
            }
            getShortVideoContext().creativeModel.recordMobModel.exitRecordTimeMillis = -1L;
        }
    }

    @Override // X.AbstractC2255721DQs
    public /* bridge */ /* synthetic */ C05YF getApiComponent() {
        Z1();
        return this;
    }

    @Override // X.InterfaceC379610EuV
    public C1DRG getDiContainer() {
        return this.LL;
    }

    public q(C1DRG c1drg) {
        this.LL = c1drg;
    }

    public final void i3(C1448140nmu c1448140nmu) {
        String str;
        String str2;
        if (this.LLIZLLLIL) {
            return;
        }
        if (!this.LLILZLL) {
            C19EG activity = getActivity();
            ShortVideoContext shortVideoContext = getShortVideoContext();
            boolean zIsLogin = ((AbstractC848400XPy) C0XQ7.LJFF()).isLogin();
            boolean zLIZLLL = C533930Kwp.LIZLLL("android.permission.RECORD_AUDIO");
            C0LAB c0lab = new C0LAB();
            c0lab.LJ("enter_from", shortVideoContext.enterFrom);
            c0lab.LJFF("cold_start", shortVideoContext.creativeModel.recordMobModel.isColdStart);
            c0lab.LIZIZ(System.currentTimeMillis() - shortVideoContext.creativeModel.recordMobModel.startRecordTime, "duration");
            c0lab.LJFF("camera_permission", false);
            if (zLIZLLL) {
                str = "has_permission";
            } else {
                str = "no_permission";
            }
            c0lab.LJ("microphone_status", str);
            c0lab.LIZ(C778450UgF.LIZ(activity), "brightness");
            c0lab.LIZJ(Float.valueOf(ToolsBaseLightSensorUtils.INSTANCE.getCurrentLightLevel()), "light_sensor_level");
            if (C1392820mLg.LIZ()) {
                String str3 = "1";
                if (zIsLogin) {
                    str2 = "1";
                } else {
                    str2 = CardStruct.IStatusCode.DEFAULT;
                }
                c0lab.LJ("is_login", str2);
                c0lab.LJ("has_camera_permission", CardStruct.IStatusCode.DEFAULT);
                if (!zLIZLLL) {
                    str3 = CardStruct.IStatusCode.DEFAULT;
                }
                c0lab.LJ("has_microphone_permission", str3);
            }
            C1440340naK.LIZ(c0lab, shortVideoContext.creativeModel.propFromGroupModel);
            if (d4.LJIJJLI(shortVideoContext)) {
                c0lab.LJ("shoot_enter_from", shortVideoContext.creativeModel.shootEnterFrom);
                c0lab.LJ("shoot_enter_method", shortVideoContext.enterMethod);
                c0lab.LJ("content_source", "upload");
            }
            ShootExtraData shootExtraData = shortVideoContext.creativeFlowData.getShootExtraData();
            if (shootExtraData != null) {
                c0lab.LJ("followup_square_action_position", shootExtraData.getFollowupSquareActionPosition());
                c0lab.LJ("is_from_followup_square_original_video", shootExtraData.isFromFollowupSquareOriginalVideo());
                c0lab.LJ("followup_square_recommend_type", shootExtraData.getFollowupSquareRecommendType());
                c0lab.LJ("followup_square_recommend_reason", shootExtraData.getFollowupSquareRecommendReason());
                if (shootExtraData.getFollowupSquareVideoRank() != null) {
                    c0lab.LIZLLL(shootExtraData.getFollowupSquareVideoRank(), "followup_square_video_rank");
                }
            }
            C1438550nXR.LIZ(c0lab, shortVideoContext);
            C1447990nmf.LIZ.getClass();
            C1447990nmf.LIZ(c0lab, shortVideoContext);
            IRecordMobService iRecordMobService = (IRecordMobService) ServiceManager.get().getService(IRecordMobService.class);
            String creationId = shortVideoContext.getCreationId();
            String str4 = shortVideoContext.shootWay;
            if (str4 != null) {
                iRecordMobService.LIZJ(new C1449420noy(creationId, str4, C1443560nfW.LJIIIIZZ(), null), c0lab);
                this.LLIZLLLIL = true;
            } else {
                "Required value was null.".toString();
                throw new IllegalArgumentException("Required value was null.");
            }
        }
        if (this.LLJILLL >= 0 && this.LLJ) {
            e0 cameraApiComponent = getCameraApiComponent();
            lnn.q stickerApiComponent = getStickerApiComponent();
            VideoRecordRootView videoRecordRootViewH2 = H2();
            C19EG activity2 = getActivity();
            long j = this.LLJILLL;
            long j2 = this.LLJILJILJ;
            C1DRG diContainer = getDiContainer();
            ShortVideoContext shortVideoContext2 = getShortVideoContext();
            o2();
            C1447990nmf.LIZIZ(cameraApiComponent, stickerApiComponent, videoRecordRootViewH2, activity2, j, j2, diContainer, c1448140nmu, shortVideoContext2);
            this.LLIZLLLIL = true;
        }
    }

    @C14EU(threadMode = ThreadMode.MAIN)
    public final void onEvent(C579950Mor c579950Mor) {
        getRootScene().finish();
    }

    @C14EU(sticky = true)
    public final void onReceiveEvent(C1630980sXo c1630980sXo) {
        if (c1630980sXo != null && TextUtils.equals(c1630980sXo.LIZ, "sticker_unlocked")) {
            this.LLJIJIL = true;
            this.LLJILJIL = c1630980sXo.LIZIZ;
            if (getLifecycle().getCurrentState().isAtLeast(Lifecycle.State.RESUMED) && !c1630980sXo.LIZJ) {
                InterfaceC1624140sMm interfaceC1624140sMm = o.LJJI;
                getActivity();
                o.LJJI.getClass();
                interfaceC1624140sMm.getClass();
                this.LLJIJIL = false;
            }
            EventBus.LIZLLL().LJIL(c1630980sXo);
        }
    }

    @C14EU(threadMode = ThreadMode.MAIN)
    public final void onReceiveEvent(AnonymousClass0801 anonymousClass0801) {
        if (anonymousClass0801 != null && anonymousClass0801.LIZ != null) {
            getShortVideoContext().extraSession.commerceData = anonymousClass0801.LIZ;
        }
        C855640XhS.LIZ(getShortVideoContext().creativeModel);
    }

    public final void PR(Cert cert, boolean z) {
        if (this.LLILZIL) {
            return;
        }
        if (C0DLQ.LIZ() != 0 && C533930Kwp.LIZLLL("android.permission.CAMERA")) {
            if (C0DLQ.LIZ() != 0) {
                if (Intrinsics.LJFF(cert, C0DLQ.LIZ)) {
                    if (C0DLQ.LIZ() != 1) {
                        return;
                    }
                } else if (Intrinsics.LJFF(cert, C0DLQ.LIZIZ)) {
                    if (C0DLQ.LIZ() != 2) {
                        return;
                    }
                } else if (!Intrinsics.LJFF(cert, C0DLQ.LIZJ) || C0DLQ.LIZ() != 3) {
                    return;
                }
            } else {
                C1AF0.LIZIZ();
            }
            this.LLILZIL = true;
            this.LLILZLL = true;
            getCameraApiComponent().DS0(cert, z);
            return;
        }
        this.LLILZIL = true;
        this.LLILZLL = false;
        getCameraApiComponent().PR(cert, z);
    }
}
