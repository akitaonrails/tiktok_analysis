package com.ss.android.ugc.aweme.shortvideo.ui.permissionmanager;

import X.AbstractC1664490tPr;
import X.C013C;
import X.C08B7;
import X.C0CHQ;
import X.C0HWO;
import X.C0LAB;
import X.C0QSJ;
import X.C1014030cUj;
import X.C1256610inz;
import X.C13LE;
import X.C1443960ngA;
import X.C1446350nk1;
import X.C1482560ogQ;
import X.C1488120opO;
import X.C1558360qeg;
import X.C1631190sY9;
import X.C1651120t4I;
import X.C1662500tMe;
import X.C1662550tMj;
import X.C1662570tMl;
import X.C1662660tMu;
import X.C1662670tMv;
import X.C1662820tNA;
import X.C1662830tNB;
import X.C1664590tQ1;
import X.C1664770tQJ;
import X.C19514711Wn;
import X.C19741112Lp;
import X.C19A3;
import X.C19EG;
import X.C1DRG;
import X.C20622515mp;
import X.C20684815ws;
import X.C2217371BqR;
import X.C2217381BqS;
import X.C2254401DLq;
import X.C2341909Fp;
import X.C256040A1q;
import X.C296200BjG;
import X.C306620C0e;
import X.C375830EoP;
import X.C385670FAf;
import X.C527810Kmx;
import X.C533800Kwc;
import X.C533930Kwp;
import X.C562660M4y;
import X.C579510Mo9;
import X.C580090Mp5;
import X.C580110Mp7;
import X.C582130MsN;
import X.C687700QyG;
import X.C786410Ut5;
import X.EnumC2249751D3t;
import X.InterfaceC1452360nti;
import X.InterfaceC1638550sk1;
import X.InterfaceC1647890sz5;
import X.InterfaceC1647930sz9;
import X.InterfaceC1650230t2r;
import X.InterfaceC1652190t61;
import X.InterfaceC1731706qJ;
import X.InterfaceC19515111Wr;
import X.InterfaceC20597015ii;
import X.InterfaceC2217461Bqa;
import X.InterfaceC2342209Fs;
import X.InterfaceC379610EuV;
import Y.AObjectS246S0100000_25;
import android.app.Activity;
import android.text.TextUtils;
import android.view.SurfaceView;
import com.bytedance.als.LiveEvent;
import com.bytedance.als.h0;
import com.bytedance.als.ui.UIPanelComponent;
import com.bytedance.bpea.cert.token.TokenCert;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.base.HomePageViewPagerAbility;
import com.ss.android.ugc.aweme.experiment.Mp4ScreenAnimationUrlSettings;
import com.ss.android.ugc.aweme.experiment.SimplifyCameraPermissionExperiment;
import com.ss.android.ugc.aweme.experiment.SimplifyCameraPermissionExperimentV2Gif;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.scope.MainActivityScope;
import com.ss.android.ugc.aweme.service.IToolsCameraAudioSecurityCheckService;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.d4;
import com.ss.android.ugc.aweme.shortvideo.ui.permissionmanager.v1;
import com.ss.android.ugc.gamora.recorder.bottom.IBottomTabChangeService;
import com.ss.android.vesdk.k;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS266S0000000_25;
import kotlin.jvm.internal.AwS111S0110000_25;
import kotlin.jvm.internal.AwS37S0010000_25;
import kotlin.jvm.internal.AwS569S0100000_25;
import kotlin.jvm.internal.AwS604S0100000_25;
import kotlin.jvm.internal.AwS7S0020000_25;
import kotlin.jvm.internal.Intrinsics;
import mn3.e0;

/* JADX INFO: loaded from: classes26.dex */
public final class v1 extends UIPanelComponent<InterfaceC1652190t61, AbstractC1664490tPr<C1662500tMe, C1662570tMl>, C1662500tMe, C1662570tMl> implements InterfaceC379610EuV, InterfaceC1652190t61 {
    public static final C1662820tNA LLJLL;
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJLLIL;
    public static final int LLJLLL;
    public final C19A3 LLJ;
    public final C1DRG LLJI;
    public final InterfaceC1731706qJ LLJIJIL;
    public final InterfaceC1731706qJ LLJILJIL;
    public final InterfaceC1731706qJ LLJILJILJ;
    public final InterfaceC1731706qJ LLJILLL;
    public final InterfaceC1731706qJ LLJJ;
    public final InterfaceC1731706qJ LLJJI;
    public final InterfaceC1731706qJ LLJJIII;
    public boolean LLJJIJI;
    public boolean LLJJIJIIJIL;
    public boolean LLJJIJIL;
    public boolean LLJJJ;
    public final Keva LLJJJIL;
    public final Keva LLJJJJ;
    public final Keva LLJJJJJIL;
    public final InterfaceC1731706qJ LLJJJJLIIL;
    public final h0<Boolean> LLJJL;
    public final Function0<C1662500tMe> LLJJLIIIJLLLLLLLZ;
    public final Function0<C1662570tMl> LLJL;
    public final Function0<C1662550tMj> LLJLIL;
    public volatile boolean LLJLILLLLZIIL;

    /* JADX WARN: Type inference failed for: r0v16, types: [X.0tNA] */
    static {
        C2217381BqS c2217381BqS = new C2217381BqS(v1.class, "recordUIConductorApi", "getRecordUIConductorApi()Lcom/ss/android/ugc/aweme/shortvideo/ui/RecordUIConductorApi;", 0);
        C13LE.LIZ.getClass();
        LLJLLIL = new InterfaceC2217461Bqa[]{c2217381BqS, new C2217381BqS(v1.class, "cameraApiComponent", "getCameraApiComponent()Lcom/bytedance/creativex/recorder/camera/api/CameraApiComponent;", 0), new C2217381BqS(v1.class, "splitShootApiComponent", "getSplitShootApiComponent()Lcom/ss/android/ugc/gamora/recorder/splitshoot/SplitShootApiComponent;", 0), new C2217381BqS(v1.class, "shortVideoContext", "getShortVideoContext()Lcom/ss/android/ugc/aweme/shortvideo/ShortVideoContext;", 0), new C2217381BqS(v1.class, "recordBottomTabApi", "getRecordBottomTabApi()Lcom/ss/android/ugc/gamora/recorder/bottom/BaseBottomTabApiComponent;", 0), new C2217381BqS(v1.class, "reuseSurfaceApi", "getReuseSurfaceApi()Lcom/bytedance/uicomponent/ReuseSurfaceApiComponent;", 0), new C2217381BqS(v1.class, "tiktokCameraApiComponent", "getTiktokCameraApiComponent()Lcom/bytedance/creativex/recorder/camera/api/TikTokCameraApiComponent;", 0), new C2217381BqS(v1.class, "lazyControlProgressConfig", "getLazyControlProgressConfig()Lcom/ss/android/ugc/aweme/property/LazyLoadControlProgressComponentConfig;", 0)};
        LLJLL = new Object() { // from class: X.0tNA
        };
        LLJLLL = 8;
    }

    private final C1631190sY9 K4() {
        return (C1631190sY9) this.LLJJJJLIIL.getValue(this, LLJLLIL[7]);
    }

    private final void M5() {
        final C19EG c19eg;
        String[] strArr;
        final boolean zLIZLLL = C533930Kwp.LIZLLL("android.permission.CAMERA");
        final boolean zLIZLLL2 = C533930Kwp.LIZLLL("android.permission.RECORD_AUDIO");
        this.LLJJIJI = true;
        Activity activity = this.LLJ.mActivity;
        if (!(activity instanceof C19EG) || (c19eg = (C19EG) activity) == null) {
            return;
        }
        final boolean z = SimplifyCameraPermissionExperiment.isEnabled() || SimplifyCameraPermissionExperimentV2Gif.isEnabled();
        InterfaceC19515111Wr interfaceC19515111Wr = new InterfaceC19515111Wr() { // from class: X.0tMr
            @Override // X.InterfaceC19515111Wr
            public final void onCanceled() {
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Removed duplicated region for block: B:27:0x008b  */
            /* JADX WARN: Type inference failed for: r1v17, types: [T, X.0HWO] */
            @Override // X.InterfaceC19515111Wr
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void LIZ(X.C0HWO... r20) {
                /*
                    Method dump skipped, instruction units count: 495
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C1662630tMr.LIZ(X.0HWO[]):void");
            }
        };
        if (z && this.LLJJJ) {
            d6(TextUtils.equals(P4().getCurrentBottomTag(), "record_mode_live"));
            return;
        }
        if (z) {
            if (C1651120t4I.LIZ() && this.LLJJJJJIL.getBoolean("simplify_show_permission_page_key", false)) {
                this.LLJJIJIIJIL = false;
                strArr = new String[]{"android.permission.CAMERA"};
            } else {
                this.LLJJIJIIJIL = true;
                strArr = new String[]{"android.permission.CAMERA", "android.permission.RECORD_AUDIO"};
            }
        } else if (C1651120t4I.LIZ() && Keva.getRepo("show_permission_statement_repo").getBoolean("show_permission_page", false)) {
            this.LLJJIJIIJIL = false;
            strArr = new String[]{"android.permission.CAMERA"};
        } else {
            this.LLJJIJIIJIL = true;
            strArr = new String[]{"android.permission.CAMERA", "android.permission.RECORD_AUDIO"};
        }
        boolean z2 = false;
        for (String str : strArr) {
            if (Intrinsics.LJFF(str, "android.permission.CAMERA") && !zLIZLLL) {
                z2 = true;
            }
            if (Intrinsics.LJFF(str, "android.permission.RECORD_AUDIO") && !zLIZLLL2) {
                z2 = true;
            }
        }
        if (z2) {
            C533800Kwc.LJFF(strArr, c19eg, "shoot_page", null);
        }
        C19514711Wn.LIZIZ.LIZIZ(c19eg, TokenCert.Companion.with("bpea-tools_request_camera_audio_permission_optimize_enter_record")).LIZIZ((String[]) Arrays.copyOf(strArr, strArr.length)).LIZJ(interfaceC19515111Wr);
        if (z) {
            this.LLJJJJJIL.storeBoolean("simplify_show_permission_page_key", true);
        }
    }

    private final InterfaceC1452360nti Z4() {
        return (InterfaceC1452360nti) this.LLJJI.getValue(this, LLJLLIL[5]);
    }

    private final InterfaceC1650230t2r getCameraApiComponent() {
        return (InterfaceC1650230t2r) this.LLJILJIL.getValue(this, LLJLLIL[1]);
    }

    private final InterfaceC1638550sk1 gq() {
        return (InterfaceC1638550sk1) this.LLJILJILJ.getValue(this, LLJLLIL[2]);
    }

    private final e0 k5() {
        return (e0) this.LLJJIII.getValue(this, LLJLLIL[6]);
    }

    private final void n5() {
        h0 h0VarLIZIZ;
        h0 h0VarP7;
        IBottomTabChangeService iBottomTabChangeService = (IBottomTabChangeService) PluggableExtentionKt.pluggableSpi$default(IBottomTabChangeService.class, false, false, false, 14, null);
        if (iBottomTabChangeService != null && (h0VarP7 = iBottomTabChangeService.P7()) != null) {
            h0VarP7.LIZ(this, new AObjectS246S0100000_25(this, 220));
        }
        IBottomTabChangeService iBottomTabChangeService2 = (IBottomTabChangeService) PluggableExtentionKt.pluggableSpi$default(IBottomTabChangeService.class, false, false, false, 14, null);
        if (iBottomTabChangeService2 == null || (h0VarLIZIZ = iBottomTabChangeService2.LIZIZ()) == null) {
            return;
        }
        h0VarLIZIZ.LIZ(this, new AObjectS246S0100000_25(this, 221));
    }

    private final void x5() {
        if (C533930Kwp.LIZLLL("android.permission.CAMERA")) {
            return;
        }
        String str = Mp4ScreenAnimationUrlSettings.getValue().videoUrl;
        Keva keva = C1662830tNB.LLLZLZ;
        C1482560ogQ c1482560ogQLIZ = C1488120opO.LIZ(str);
        C582130MsN.LIZ().LJ().getClass();
        C1014030cUj.LIZ.LJIILLIIL(1024, Collections.singletonList(c1482560ogQLIZ));
    }

    public final void C5() {
        String str = !C533930Kwp.LIZLLL("android.permission.CAMERA") ? !C533930Kwp.LIZLLL("android.permission.RECORD_AUDIO") ? "camera,microphone" : "camera" : "microphone";
        C562660M4y c562660M4y = C562660M4y.LIZ;
        ShortVideoContext shortVideoContext = getShortVideoContext();
        c562660M4y.getClass();
        C0LAB c0lab = new C0LAB();
        c0lab.LJ("creation_id", shortVideoContext.creativeInfo.getCreationId());
        c0lab.LJ("shoot_way", shortVideoContext.shootWay);
        c0lab.LJ("enter_from", "video_shoot_page");
        c0lab.LJ("from_page", shortVideoContext.enterFrom);
        c0lab.LJ("page_type", "shoot_page");
        c0lab.LJ("type", str);
        C20684815ws.LJIILLIIL("deny_access_page_show", c0lab.LIZ);
    }

    public final void E5() {
        final C19EG c19eg;
        C0LAB c0lab = new C0LAB();
        List<InterfaceC2342209Fs> list = C2341909Fp.LIZ;
        C2341909Fp.LIZ("click_request_camera_permission", c0lab.LIZ);
        Activity activity = this.LLJ.mActivity;
        if (!(activity instanceof C19EG) || (c19eg = (C19EG) activity) == null) {
            return;
        }
        C19741112Lp.LIZ.getClass();
        final boolean zLJI = C19741112Lp.LJI(c19eg, "android.permission.CAMERA", false);
        InterfaceC19515111Wr interfaceC19515111Wr = new InterfaceC19515111Wr() { // from class: X.0tMs
            @Override // X.InterfaceC19515111Wr
            public final void onCanceled() {
            }

            @Override // X.InterfaceC19515111Wr
            public final void LIZ(C0HWO... c0hwoArr) {
                int i;
                if (SimplifyCameraPermissionExperiment.isEnabled() || SimplifyCameraPermissionExperimentV2Gif.isEnabled()) {
                    this.LIZ.LLJJJJJIL.storeBoolean("simplify_show_permission_is_interacted", true);
                }
                C0HWO c0hwo = c0hwoArr[0];
                String[] strArr = {"android.permission.CAMERA"};
                int[] iArr = new int[1];
                if (c0hwo.LIZ()) {
                    i = 0;
                } else {
                    i = -1;
                }
                iArr[0] = i;
                C533800Kwc.LIZLLL(strArr, iArr, c19eg, "shoot_page", null);
                if (c0hwo.LIZIZ == EnumC442280HVy.DENIED_PERMANENT && zLJI) {
                    C19741112Lp c19741112Lp = C19741112Lp.LIZ;
                    C19EG c19eg2 = c19eg;
                    c19741112Lp.getClass();
                    C19741112Lp.LJIIIZ(c19eg2, "android.permission.CAMERA");
                    return;
                }
                if (c0hwo.LIZ()) {
                    boolean zEquals = TextUtils.equals(this.LIZ.P4().getCurrentBottomTag(), "record_mode_live");
                    if (C533930Kwp.LIZLLL("android.permission.RECORD_AUDIO")) {
                        this.LIZ.hide();
                        v1 v1Var = this.LIZ;
                        v1Var.i3(new AwS111S0110000_25(zEquals, v1Var, 6));
                    } else {
                        if (C1651120t4I.LIZ() && !zEquals) {
                            this.LIZ.U5();
                            return;
                        }
                        boolean zLJIIL = C1443960ngA.LJIIL(this.LIZ.getShortVideoContext());
                        if (!zEquals && !zLJIIL) {
                            this.LIZ.i3(AFwS266S0000000_25.get$arr$(165));
                        } else {
                            this.LIZ.i3(AFwS266S0000000_25.get$arr$(164));
                        }
                    }
                }
            }
        };
        C533800Kwc.LJFF(new String[]{"android.permission.CAMERA"}, c19eg, "shoot_page", null);
        C19514711Wn.LIZIZ.LIZIZ(c19eg, TokenCert.Companion.with("bpea-tools_request_camera_permission_optimize")).LIZIZ("android.permission.CAMERA").LIZJ(interfaceC19515111Wr);
    }

    public final void H5() {
        final C19EG c19eg;
        C0LAB c0lab = new C0LAB();
        List<InterfaceC2342209Fs> list = C2341909Fp.LIZ;
        C2341909Fp.LIZ("click_request_mic_permission", c0lab.LIZ);
        Activity activity = this.LLJ.mActivity;
        if (!(activity instanceof C19EG) || (c19eg = (C19EG) activity) == null) {
            return;
        }
        C19741112Lp.LIZ.getClass();
        final boolean zLJI = C19741112Lp.LJI(c19eg, "android.permission.RECORD_AUDIO", false);
        InterfaceC19515111Wr interfaceC19515111Wr = new InterfaceC19515111Wr() { // from class: X.0tMt
            @Override // X.InterfaceC19515111Wr
            public final void onCanceled() {
            }

            @Override // X.InterfaceC19515111Wr
            public final void LIZ(C0HWO... c0hwoArr) {
                int i;
                if (SimplifyCameraPermissionExperiment.isEnabled() || SimplifyCameraPermissionExperimentV2Gif.isEnabled()) {
                    this.LIZ.LLJJJJJIL.storeBoolean("simplify_show_permission_is_interacted", true);
                }
                C0HWO c0hwo = c0hwoArr[0];
                String[] strArr = {"android.permission.RECORD_AUDIO"};
                int[] iArr = new int[1];
                if (c0hwo.LIZ()) {
                    i = 0;
                } else {
                    i = -1;
                }
                iArr[0] = i;
                C533800Kwc.LIZLLL(strArr, iArr, c19eg, "shoot_page", null);
                if (c0hwo.LIZIZ == EnumC442280HVy.DENIED_PERMANENT && zLJI) {
                    C19741112Lp c19741112Lp = C19741112Lp.LIZ;
                    C19EG c19eg2 = c19eg;
                    c19741112Lp.getClass();
                    C19741112Lp.LJIIIZ(c19eg2, "android.permission.RECORD_AUDIO");
                    return;
                }
                if (c0hwo.LIZ()) {
                    if (C533930Kwp.LIZLLL("android.permission.CAMERA")) {
                        v1 v1Var = this.LIZ;
                        v1Var.i3(new AwS604S0100000_25(v1Var, 202));
                        this.LIZ.hide();
                        return;
                    }
                    this.LIZ.i3(AFwS266S0000000_25.get$arr$(166));
                }
            }
        };
        C533800Kwc.LJFF(new String[]{"android.permission.RECORD_AUDIO"}, c19eg, "shoot_page", null);
        C19514711Wn.LIZIZ.LIZIZ(c19eg, TokenCert.Companion.with("bpea-tools_request_audio_permission_optimize")).LIZIZ("android.permission.RECORD_AUDIO").LIZJ(interfaceC19515111Wr);
    }

    @Override // X.InterfaceC1652190t61
    public void Iw1() {
        this.LLJJL.LJII(Boolean.TRUE);
    }

    @Override // X.InterfaceC1652190t61
    public C385670FAf<Boolean> L00() {
        return Z1(new C2217381BqS() { // from class: X.0tMn
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Boolean.valueOf(((C1662500tMe) obj).LJ);
            }
        });
    }

    @Override // X.InterfaceC1652190t61
    public C385670FAf<Boolean> NR1() {
        return Z1(new C2217381BqS() { // from class: X.0tMX
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Boolean.valueOf(((C1662500tMe) obj).LJIIIZ);
            }
        });
    }

    public final InterfaceC1647930sz9 P4() {
        return (InterfaceC1647930sz9) this.LLJJ.getValue(this, LLJLLIL[4]);
    }

    public final InterfaceC1647890sz5 T4() {
        return (InterfaceC1647890sz5) this.LLJIJIL.getValue(this, LLJLLIL[0]);
    }

    @Override // X.InterfaceC1652190t61
    public C385670FAf<C0HWO> Vc() {
        return Z1(new C2217371BqR() { // from class: X.0tN1
            @Override // X.C2217371BqR, X.AbstractC2217331BqN, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1662500tMe) obj).LIZIZ;
            }

            @Override // X.C2217371BqR, X.AbstractC2217331BqN
            public final void set(Object obj, Object obj2) {
                ((C1662500tMe) obj).LIZIZ = (C0HWO) obj2;
            }
        });
    }

    @Override // X.InterfaceC1652190t61
    public C385670FAf<C375830EoP<Boolean>> bx1() {
        return Z1(new C2217381BqS() { // from class: X.0tN0
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1662500tMe) obj).LJI;
            }
        });
    }

    public final ShortVideoContext getShortVideoContext() {
        return (ShortVideoContext) this.LLJILLL.getValue(this, LLJLLIL[3]);
    }

    @Override // X.InterfaceC1652190t61
    public C385670FAf<Boolean> jG2() {
        return Z1(new C2217381BqS() { // from class: X.0tMp
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Boolean.valueOf(((C1662500tMe) obj).LJIIJ);
            }
        });
    }

    public final void o4() {
        C19741112Lp c19741112Lp = C19741112Lp.LIZ;
        Activity activityLJII = C1664590tQ1.LJII(this);
        c19741112Lp.getClass();
        C19741112Lp.LJIIIZ(activityLJII, "android.permission.CAMERA");
    }

    @Override // X.InterfaceC1652190t61
    public C385670FAf<Boolean> rX1() {
        return Z1(new C2217381BqS() { // from class: X.0tMo
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Boolean.valueOf(((C1662500tMe) obj).LJII);
            }
        });
    }

    @Override // X.InterfaceC1652190t61
    public void tu2() {
        i3(AFwS266S0000000_25.get$arr$(163));
    }

    @Override // X.InterfaceC1652190t61
    public C385670FAf<Boolean> un2() {
        return Z1(new C2217381BqS() { // from class: X.0tMm
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Boolean.valueOf(((C1662500tMe) obj).LJIIIIZZ);
            }
        });
    }

    private final boolean e4() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        long j = this.LLJJJJ.getLong("first_click_shoot_without_mic_key", 0L);
        if (C533930Kwp.LIZLLL("android.permission.CAMERA") && !C533930Kwp.LIZLLL("android.permission.RECORD_AUDIO")) {
            if (j > 0) {
                if (jCurrentTimeMillis - j < 86400000) {
                    return false;
                }
            } else if (j != 0) {
            }
            this.LLJJJJ.storeLong("first_click_shoot_without_mic_key", jCurrentTimeMillis);
        }
        return true;
    }

    private final void t5() {
        LiveEvent<Long> liveEventKg0;
        e0 e0VarK5 = k5();
        if (e0VarK5 == null || (liveEventKg0 = e0VarK5.Kg0()) == null) {
            return;
        }
        liveEventKg0.LIZ(this, new AObjectS246S0100000_25(this, 222));
    }

    private final void v5() {
        if (C533930Kwp.LIZIZ(C527810Kmx.LIZ())) {
            return;
        }
        C1446350nk1 c1446350nk1 = C1446350nk1.LIZ;
        ShortVideoContext shortVideoContext = getShortVideoContext();
        c1446350nk1.getClass();
        if (C1446350nk1.LJIIL(shortVideoContext)) {
            return;
        }
        S5(false, false);
        if (C533930Kwp.LIZIZ(C527810Kmx.LIZ())) {
            hide();
            i3(new AwS604S0100000_25(this, 201));
            return;
        }
        if (SimplifyCameraPermissionExperimentV2Gif.isEnabled()) {
            Keva keva = C1662830tNB.LLLZLZ;
            if (!C1488120opO.LIZIZ()) {
                boolean zLIZLLL = C533930Kwp.LIZLLL("android.permission.RECORD_AUDIO");
                boolean zLIZLLL2 = C533930Kwp.LIZLLL("android.permission.CAMERA");
                boolean z = zLIZLLL || C256040A1q.LIZ();
                if (zLIZLLL2 && z) {
                    U5();
                    return;
                }
                return;
            }
        }
        M5();
    }

    public final void D5() {
        if (SimplifyCameraPermissionExperimentV2Gif.isEnabled()) {
            M5();
        }
    }

    public final int LLJJJJLIIL() {
        InterfaceC1638550sk1 interfaceC1638550sk1Gq = gq();
        if (interfaceC1638550sk1Gq != null) {
            return interfaceC1638550sk1Gq.LLJJJJLIIL();
        }
        return 0;
    }

    public final void U5() {
        k kVar = getCameraApiComponent().u92().LIZIZ().LIZIZ;
        C2254401DLq c2254401DLq = kVar.LJJJJ;
        EnumC2249751D3t enumC2249751D3t = EnumC2249751D3t.DISABLE;
        c2254401DLq.LJJIII = enumC2249751D3t;
        kVar.LJJJ.LJJIII("RecordMicConfig", enumC2249751D3t.ordinal());
        this.LLJJJJ.storeLong("first_click_shoot_without_mic_key", System.currentTimeMillis());
        boolean zEquals = TextUtils.equals(P4().getCurrentBottomTag(), "record_mode_live");
        hide();
        i3(new AwS37S0010000_25(zEquals, 8));
    }

    public final boolean d5() {
        if ((((getShortVideoContext().cameraComponentModel.isEditorProRecordMode && !d4.LJFF(getShortVideoContext())) || getShortVideoContext().LJJIL() || getShortVideoContext().LJJIIZI() || getShortVideoContext().LJJJ()) && C1443960ngA.LJIIIZ(getShortVideoContext())) || getShortVideoContext().LJJIJ()) {
            return false;
        }
        return (!getShortVideoContext().LJJJJZ() || getShortVideoContext().LJJIJIIJI()) && getShortVideoContext().creativeModel.albumOpenApiModel == null;
    }

    @Override // com.bytedance.als.ui.UIPanelComponent
    public void hide() {
        super.hide();
        ((IToolsCameraAudioSecurityCheckService) ServiceManager.get().getService(IToolsCameraAudioSecurityCheckService.class)).LJII();
        if (C306620C0e.LIZ()) {
            return;
        }
        C0LAB c0lab = new C0LAB();
        List<InterfaceC2342209Fs> list = C2341909Fp.LIZ;
        C2341909Fp.LIZ("permission_page_hide", c0lab.LIZ);
    }

    @Override // com.bytedance.als.ui.UIPanelComponent, X.AbstractC2255721DQs
    public void onCreate() {
        super.onCreate();
        if (SimplifyCameraPermissionExperimentV2Gif.isEnabled()) {
            x5();
            t5();
        }
        if (SimplifyCameraPermissionExperiment.isEnabled() || SimplifyCameraPermissionExperimentV2Gif.isEnabled()) {
            n5();
        }
        v5();
    }

    @Override // X.AbstractC2255721DQs
    public void onDestroy() {
        super.onDestroy();
        this.LLJJJ = false;
        this.LLJJIJIIJIL = false;
        if (SimplifyCameraPermissionExperiment.isEnabled() || SimplifyCameraPermissionExperimentV2Gif.isEnabled()) {
            C19514711Wn.LJ.clear();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x0089  */
    @Override // X.AbstractC2255721DQs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onStart() {
        /*
            Method dump skipped, instruction units count: 248
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.shortvideo.ui.permissionmanager.v1.onStart():void");
    }

    @Override // X.AbstractC2255721DQs
    public void onStop() {
        super.onStop();
        this.LLJJIJIL = true;
    }

    @Override // com.bytedance.als.ui.UIPanelComponent
    public void show() {
        InterfaceC1452360nti interfaceC1452360ntiZ4;
        SurfaceView surfaceViewLJIJJLI;
        super.show();
        if (!C533930Kwp.LIZLLL("android.permission.CAMERA") && (interfaceC1452360ntiZ4 = Z4()) != null && (surfaceViewLJIJJLI = interfaceC1452360ntiZ4.LJIJJLI()) != null) {
            C786410Ut5.LLIIII(surfaceViewLJIJJLI, 8);
        }
        ((IToolsCameraAudioSecurityCheckService) ServiceManager.get().getService(IToolsCameraAudioSecurityCheckService.class)).LJII();
        C0LAB c0lab = new C0LAB();
        List<InterfaceC2342209Fs> list = C2341909Fp.LIZ;
        C2341909Fp.LIZ("permission_page_show", c0lab.LIZ);
    }

    public final void z4() {
        HomePageViewPagerAbility homePageViewPagerAbilityLIZIZ;
        if (getShortVideoContext().cameraComponentModel.isEditorProRecordMode) {
            C786410Ut5.LJLLLLLL(8, getCameraApiComponent().getPreviewView());
            ((C580090Mp5) getDiContainer().LJII(C580090Mp5.class, null)).LIZ(new C579510Mo9(C1664590tQ1.LJII(this), new C580110Mp7(getShortVideoContext(), false, getShortVideoContext().cameraComponentModel.isFromEditorProNows, 112)));
            return;
        }
        if (getShortVideoContext().creativeModel.editorProAIGCInfoModel.aiPlaygroundCameraModel.fromAiPlayground) {
            C786410Ut5.LJLLLLLL(8, getCameraApiComponent().getPreviewView());
            C0CHQ.LIZ().LJJJJJ().isAiVideoPhotoModeBackPressed(getShortVideoContext(), C1664590tQ1.LJII(this));
            return;
        }
        Activity activity = this.LLJ.mActivity;
        C19EG c19eg = activity instanceof C19EG ? (C19EG) activity : null;
        InterfaceC20597015ii interfaceC20597015iiLIZJ = C20622515mp.LIZJ(c19eg);
        if (interfaceC20597015iiLIZJ != null) {
            interfaceC20597015iiLIZJ.finish();
            return;
        }
        if (!(c19eg instanceof C08B7)) {
            if (c19eg != null) {
                c19eg.finish();
                return;
            }
            return;
        }
        if (C296200BjG.LIZ()) {
            C0QSJ c0qsjLIZJ = C687700QyG.LIZJ(C1558360qeg.LJI(c19eg, null), MainActivityScope.class);
            Object ability = c0qsjLIZJ != null ? c0qsjLIZJ.getAbility(HomePageViewPagerAbility.class) : null;
            homePageViewPagerAbilityLIZIZ = (HomePageViewPagerAbility) (ability instanceof HomePageViewPagerAbility ? ability : null);
        } else {
            homePageViewPagerAbilityLIZIZ = C1256610inz.LIZIZ(c19eg);
        }
        if (homePageViewPagerAbilityLIZIZ != null) {
            homePageViewPagerAbilityLIZIZ.Ta0(false, Boolean.TRUE);
        }
    }

    @Override // com.bytedance.als.ui.UIPanelComponent
    public Function0<C1662550tMj> E3() {
        return this.LLJLIL;
    }

    public final Keva F4() {
        return this.LLJJJIL;
    }

    public final Keva H4() {
        return this.LLJJJJ;
    }

    public h0<Boolean> O4() {
        return this.LLJJL;
    }

    @Override // X.InterfaceC1652190t61
    public /* bridge */ /* synthetic */ C385670FAf P7() {
        return this.LLJJL;
    }

    @Override // X.InterfaceC379610EuV
    public C1DRG getDiContainer() {
        return this.LLJI;
    }

    public final C19A3 getParentScene() {
        return this.LLJ;
    }

    @Override // X.AbstractC1664470tPp
    public Function0<C1662500tMe> o2() {
        return this.LLJJLIIIJLLLLLLLZ;
    }

    @Override // X.AbstractC1664470tPp
    public Function0<C1662570tMl> w2() {
        return this.LLJL;
    }

    private final void R5(boolean z) {
        i3(new AwS37S0010000_25(z, 7));
    }

    private final void d6(boolean z) {
        boolean zLIZLLL = C533930Kwp.LIZLLL("android.permission.CAMERA");
        if (z) {
            boolean zLIZLLL2 = C533930Kwp.LIZLLL("android.permission.RECORD_AUDIO");
            if (!zLIZLLL || !zLIZLLL2) {
                R5(true);
                return;
            }
            return;
        }
        if (zLIZLLL) {
            return;
        }
        R5(false);
    }

    public final void N5(boolean z) {
        i3(new AwS37S0010000_25(z, 6));
    }

    public final void m6(boolean z) {
        if (SimplifyCameraPermissionExperimentV2Gif.isEnabled()) {
            this.LLJLILLLLZIIL = z;
        }
    }

    @Override // X.InterfaceC1652190t61
    public void yn0(boolean z) {
        boolean zLIZLLL = C533930Kwp.LIZLLL("android.permission.RECORD_AUDIO");
        boolean zLIZLLL2 = C533930Kwp.LIZLLL("android.permission.CAMERA");
        if (zLIZLLL2) {
            if (zLIZLLL) {
                hide();
                return;
            }
        } else if (zLIZLLL) {
            i3(new AwS111S0110000_25(z, this, 3));
            return;
        } else if (!zLIZLLL2) {
            i3(new AwS111S0110000_25(z, this, 5));
            return;
        }
        i3(new AwS111S0110000_25(z, this, 4));
    }

    public v1(C19A3 c19a3, C1DRG c1drg) {
        super(c19a3);
        this.LLJ = c19a3;
        this.LLJI = c1drg;
        this.LLJIJIL = C1664770tQJ.LIZ(getDiContainer(), InterfaceC1647890sz5.class, null);
        this.LLJILJIL = C1664770tQJ.LIZ(getDiContainer(), InterfaceC1650230t2r.class, null);
        this.LLJILJILJ = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC1638550sk1.class, null);
        this.LLJILLL = C1664770tQJ.LIZ(getDiContainer(), ShortVideoContext.class, null);
        this.LLJJ = C1664770tQJ.LIZ(getDiContainer(), InterfaceC1647930sz9.class, null);
        this.LLJJI = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC1452360nti.class, null);
        this.LLJJIII = C1664770tQJ.LIZIZ(getDiContainer(), e0.class, null);
        this.LLJJJIL = Keva.getRepo("show_permission_statement_repo");
        this.LLJJJJ = Keva.getRepo("show_permission_statement_repo");
        this.LLJJJJJIL = Keva.getRepo("simplify_show_permission_repo");
        this.LLJJJJLIIL = C1664770tQJ.LIZIZ(getDiContainer(), C1631190sY9.class, "lazyControlProgressConfig");
        this.LLJJL = new h0<>(null);
        this.LLJJLIIIJLLLLLLLZ = new AwS569S0100000_25(this, 341);
        this.LLJL = new AwS569S0100000_25(this, 339);
        this.LLJLIL = new AwS569S0100000_25(this, 340);
    }

    private final void S5(boolean z, boolean z2) {
        boolean z3;
        boolean z4 = true;
        if (C1651120t4I.LIZ() && !z) {
            z3 = true;
        } else {
            z3 = false;
        }
        if ((C533930Kwp.LIZLLL("android.permission.RECORD_AUDIO") || z3) && C533930Kwp.LIZLLL("android.permission.CAMERA")) {
            if ((SimplifyCameraPermissionExperiment.isEnabled() || SimplifyCameraPermissionExperimentV2Gif.isEnabled()) && !C533930Kwp.LIZLLL("android.permission.RECORD_AUDIO") && !z && !z2 && !this.LLJJJJJIL.getBoolean("simplify_show_permission_is_interacted", false)) {
                show();
                i3(AFwS266S0000000_25.get$arr$(158));
                return;
            } else {
                i3(new AwS7S0020000_25(z2, z, 0));
                hide();
                return;
            }
        }
        if (!e4() && !z) {
            hide();
            k kVar = getCameraApiComponent().u92().LIZIZ().LIZIZ;
            C2254401DLq c2254401DLq = kVar.LJJJJ;
            EnumC2249751D3t enumC2249751D3t = EnumC2249751D3t.DISABLE;
            c2254401DLq.LJJIII = enumC2249751D3t;
            kVar.LJJJ.LJJIII("RecordMicConfig", enumC2249751D3t.ordinal());
            i3(AFwS266S0000000_25.get$arr$(159));
            return;
        }
        show();
        C013C c013c = new C013C();
        if (TextUtils.equals(getShortVideoContext().shootWay, "duet") || TextUtils.equals(getShortVideoContext().shootWay, "stitch") || !d5()) {
            z4 = false;
        }
        c013c.element = z4;
        if (getShortVideoContext().cameraComponentModel.isEditorProRecordMode) {
            c013c.element = false;
        }
        i3(new AwS604S0100000_25(c013c, 200));
    }

    @Override // X.InterfaceC1652190t61
    public void PL0(boolean z, boolean z2) {
        S5(z, z2);
        d6(z);
    }

    @Override // X.InterfaceC1652190t61
    public void gG1(boolean z, boolean z2, boolean z3, boolean z4) {
        hide();
        i3(new C1662670tMv(C1443960ngA.LJIIL(getShortVideoContext()), z, z3, z2, z4));
    }

    @Override // X.InterfaceC1652190t61
    public void v50(boolean z, boolean z2, boolean z3, boolean z4) {
        i3(new C1662660tMu(z3, z2, z, z4));
    }
}
