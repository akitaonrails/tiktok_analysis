package com.ss.videoarch.liveplayer;

import X.AbstractC1487640ooc;
import X.C01GW;
import X.C08RN;
import X.C0IJ8;
import X.C0TI7;
import X.C1281010jRL;
import X.C1284740jXM;
import X.C1286530jaF;
import X.C1286540jaG;
import X.C1407370mj9;
import X.C1469430oLF;
import X.C1470430oMr;
import X.C1470480oMw;
import X.C1470530oN1;
import X.C1470570oN5;
import X.C1470620oNA;
import X.C1470760oNO;
import X.C1470800oNS;
import X.C1470830oNV;
import X.C1470860oNY;
import X.C1470870oNZ;
import X.C1474810oTv;
import X.C1476630oWr;
import X.C1476640oWs;
import X.C1476650oWt;
import X.C1476660oWu;
import X.C1481110oe5;
import X.C1484630ojl;
import X.C1486160omE;
import X.C1486290omR;
import X.C1486300omS;
import X.C1486590omv;
import X.C1556760qc6;
import X.C1698470uIf;
import X.C1698490uIh;
import X.C1698500uIi;
import X.C1698510uIj;
import X.C1698540uIm;
import X.C1698620uIu;
import X.C1698630uIv;
import X.C1698650uIx;
import X.C1698670uIz;
import X.C1698680uJ0;
import X.C1698690uJ1;
import X.C1698700uJ2;
import X.C1698740uJ6;
import X.C1698760uJ8;
import X.C1698770uJ9;
import X.C1698780uJA;
import X.C1698790uJB;
import X.C1698800uJC;
import X.C1698820uJE;
import X.C1698830uJF;
import X.C1698840uJG;
import X.C1698890uJL;
import X.C1698930uJP;
import X.C1698940uJQ;
import X.C1699050uJb;
import X.C1699100uJg;
import X.C1699110uJh;
import X.C1699140uJk;
import X.C1699230uJt;
import X.C1911307eB;
import X.C1971307nr;
import X.C2093608Ic;
import X.C2118408Rq;
import X.C2188811AlT;
import X.C538540LAe;
import X.C786410Ut5;
import X.C786450Ut9;
import X.C789860Uye;
import X.C794300VDw;
import X.C822650WOx;
import X.C827820Wdg;
import X.C838410Wul;
import X.EnumC1469090oKh;
import X.EnumC1486270omP;
import X.EnumC1486320omU;
import X.EnumC1487690ooh;
import X.EnumC1487700ooi;
import X.EnumC1487710ooj;
import X.EnumC1491000ou2;
import X.EnumC1699190uJp;
import X.EnumC1699200uJq;
import X.EnumC1699210uJr;
import X.EnumC801300Vc0;
import X.InterfaceC1467090oHT;
import X.InterfaceC1467440oI2;
import X.InterfaceC1467950oIr;
import X.InterfaceC1470050oMF;
import X.InterfaceC1470060oMG;
import X.InterfaceC1470070oMH;
import X.InterfaceC1470080oMI;
import X.InterfaceC1470580oN6;
import X.InterfaceC1470660oNE;
import X.InterfaceC1470680oNG;
import X.InterfaceC1491020ou4;
import X.InterfaceC1698710uJ3;
import X.InterfaceC1699150uJl;
import X.RunnableC1485770olb;
import X.SurfaceHolderCallbackC1471310oOH;
import Y.ARunnableS123S0100000_23;
import Y.ARunnableS18S1100000_13;
import Y.ARunnableS92S0200000_23;
import android.app.Application;
import android.content.Context;
import android.graphics.SurfaceTexture;
import android.media.AudioManager;
import android.net.ConnectivityManager;
import android.os.Build;
import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Size;
import android.view.Surface;
import android.view.SurfaceControl;
import android.view.SurfaceHolder;
import com.bytedance.android.livesdk.livesetting.game.DefaultHighLightCutConfig;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.android.livesdk.livesetting.watchlive.LivePreCreateNextRoomPlayer;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.bpea.transmit.delegate.BPEAThread;
import com.bytedance.librarian.Librarian;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.bytedance.mt.protector.impl.PatternProtector;
import com.bytedance.mt.protector.impl.string2number.CastFloatProtector;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.vcloud.strategy.ILiveFeatureBundle;
import com.bytedance.vcloud.strategy.ILiveStartupRetryListener;
import com.bytedance.vcloud.strategy.StrategyCenter;
import com.bytedance.vcloud.strategy.StrategyStartupGearInfo;
import com.google.android.gms.common.ConnectionResult;
import com.ss.android.ugc.aweme.experiment.Mp4ScreenVideoLoadTimeout;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.lancet.LoadSoLancet;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.ss.android.ugc.bytex.pthread.base.convergence.hook.ThreadMethodProxy;
import com.ss.mediakit.net.NQE;
import com.ss.mediakit.net.NetworkState;
import com.ss.ttm.player.NativeAudioProcessor;
import com.ss.ttm.player.TTPlayerClient;
import com.ss.ttm.player.x;
import com.ss.ttvideo.TTKPlayerV2;
import com.ss.videoarch.liveio.IMIOLivePlayTaskCallback;
import com.ss.videoarch.liveio.LiveIOManager;
import com.ss.videoarch.liveplayer.VideoLiveManager;
import com.ss.videoarch.liveplayer.config.LiveConfigCenterWrapper;
import com.ss.videoarch.liveplayer.log.LiveLoggerService;
import com.ss.videoarch.liveplayer.retry.RetryProcessor;
import com.tiktok.ttkmedia.configcenter.ConfigCenter;
import com.tts.oecverify.BdTuring;
import java.io.File;
import java.io.PrintStream;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;
import java.util.concurrent.Callable;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import ttpobfuscated.e3;

/* JADX INFO: loaded from: classes27.dex */
public final class VideoLiveManager extends AbstractC1487640ooc {
    public static final AtomicInteger k3;
    public static int l3;

    /* JADX INFO: renamed from: m3, reason: collision with root package name */
    public static int f443m3;
    public static int n3;
    public static final int o3;
    public static int p3;
    public static int q3;
    public static int r3;
    public static String s3;
    public static boolean t3;
    public static C1699100uJg u3;
    public static final int v3;
    public static final int w3;
    public String A;
    public int A0;
    public final Object A1;
    public int A2;
    public boolean B;
    public int B0;
    public C1698540uIm B1;
    public int B2;
    public boolean C;
    public int C0;
    public int C1;
    public int C2;
    public boolean D;
    public final C822650WOx D0;
    public int D1;
    public int D2;
    public boolean E;
    public int E0;
    public int E1;
    public long E2;
    public boolean F;
    public int F0;
    public int F1;
    public int F2;
    public boolean G;
    public int G0;
    public long G1;
    public int G2;
    public int H;
    public EnumC1699190uJp H0;
    public float H1;
    public String H2;
    public int I;
    public String I0;
    public float I1;
    public int I2;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public int f444J;
    public C1699110uJh J0;
    public boolean J1;
    public int J2;
    public int K;
    public int K0;
    public float K1;
    public boolean K2;
    public int L;
    public int L0;
    public int L1;
    public C0IJ8 L2;
    public String LJIIJ;
    public int LJIIJJI;
    public boolean LJIIL;
    public final BPEAHandler LJIILIIL;
    public int LJIILJJIL;
    public long LJIILL;
    public final LiveLoggerService LJIILLIIL;
    public final Context LJIJI;
    public final InterfaceC1698710uJ3 LJIJJ;
    public final InterfaceC1699150uJl LJIJJLI;
    public final C1286540jaG LJIL;
    public final RetryProcessor LJJ;
    public final C1698780uJA LJJIFFI;
    public final C1698770uJ9 LJJIII;
    public final C1698690uJ1 LJJIIJ;
    public InterfaceC1467090oHT LJJIIJZLJL;
    public SurfaceHolder LJJIIZ;
    public SurfaceHolderCallbackC1471310oOH LJJIIZI;
    public Surface LJJIJ;
    public SurfaceControl LJJIJIIJI;
    public SurfaceControl LJJIJIIJIL;
    public int LJJIJIL;
    public int LJJIJL;
    public Surface LJJIJLIJ;
    public final AtomicBoolean LJJIL;
    public final AtomicBoolean LJJIZ;
    public int LJJJ;
    public volatile boolean LJJJI;
    public boolean LJJJIL;
    public boolean LJJJJ;
    public boolean LJJJJI;
    public boolean LJJJJIZL;
    public int LJJJJJ;
    public int LJJJJJL;
    public int LJJJJL;
    public final int LJJJJLI;
    public final int LJJJJLL;
    public int LJJJJZ;
    public int LJJJJZI;
    public int LJJJLIIL;
    public int LJJJLL;
    public int LJJJLZIJ;
    public int LJJJZ;
    public int LJJL;
    public final int LJJLI;
    public final int LJJLIIIIJ;
    public int LJJLIIIJ;
    public int LJJLIIIJILLIZJL;
    public final int LJJLIIIJJI;
    public int LJJLIIIJJIZ;
    public int LJJLIIIJL;
    public int LJJLIIIJLJLI;
    public int LJJLIIIJLLLLLLLZ;
    public int LJJLIIJ;
    public int LJJLIL;
    public int LJJLJ;
    public boolean LJJLJLI;
    public int LJJLL;
    public int LJJZ;
    public int LJJZZI;
    public int LJJZZIII;
    public int LJL;
    public int LJLI;
    public int LJLIIIL;
    public int LJLIIL;
    public int LJLIL;
    public int LJLILLLLZI;
    public int LJLJI;
    public int LJLJJI;
    public int LJLJJL;
    public int LJLJJLL;
    public float LJLJL;
    public int LJLJLJ;
    public float LJLJLLL;
    public String LJLL;
    public String LJLLI;
    public boolean LJLLILLLL;
    public String LJLLJ;
    public String LJLLL;
    public int LJLLLL;
    public boolean LJLLLLLL;
    public boolean LJLZ;
    public boolean LJZ;
    public String LJZI;
    public boolean LJZL;
    public int LL;
    public int LLD;
    public String LLF;
    public long LLFF;
    public boolean LLFFF;
    public String LLFII;
    public int LLFZ;
    public boolean LLI;
    public boolean LLIFFJFJJ;
    public int LLII;
    public long LLIIII;
    public final List<C1698670uIz> LLIIIILZ;
    public final C1698700uJ2 LLIIIJ;
    public int LLIIIL;
    public int LLIIIZ;
    public long LLIIJI;
    public String LLIIJLIL;
    public String LLIIL;
    public String LLIILII;
    public int LLIILZL;
    public int LLIIZ;
    public int LLIL;
    public int LLILII;
    public int LLILIL;
    public int LLILL;
    public int LLILLIZIL;
    public int LLILLJJLI;
    public int LLILLL;
    public int LLILZ;
    public int LLILZIL;
    public int LLILZLL;
    public String LLIZ;
    public int LLIZLLLIL;
    public int LLJ;
    public int LLJI;
    public long LLJIJIL;
    public String LLJILJIL;
    public int LLJILJILJ;
    public String LLJILLL;
    public String LLJJ;
    public String LLJJI;
    public String LLJJIII;
    public String LLJJIJI;
    public String LLJJIJIIJIL;
    public boolean LLJJIJIL;
    public String LLJJJ;
    public String LLJJJIL;
    public String LLJJJJ;
    public int LLJJJJJIL;
    public int LLJJJJLIIL;
    public int LLJJL;
    public int LLJJLIIIJLLLLLLLZ;
    public int LLJL;
    public int LLJLIL;
    public int LLJLILLLLZIIL;
    public JSONObject LLJLL;
    public JSONObject LLJLLIL;
    public long LLJLLL;
    public long LLJZ;
    public boolean LLJZIJLIL;
    public int LLL;
    public int LLLF;
    public boolean LLLFF;
    public boolean LLLFFI;
    public int LLLFZ;
    public int LLLI;
    public int LLLII;
    public int LLLIIII;
    public int LLLIIIIL;
    public int LLLIIIL;
    public int LLLIIL;
    public int LLLIILIL;
    public int LLLIL;
    public int LLLILZ;
    public int LLLILZJ;
    public int LLLILZLLLI;
    public int LLLIZZ;
    public long LLLJ;
    public long LLLJIL;
    public int LLLJL;
    public boolean LLLL;
    public final boolean LLLLII;
    public int LLLLIIIILLL;
    public int LLLLIIL;
    public int LLLLIILL;
    public int LLLLIILLL;
    public final int LLLLIL;
    public int LLLLILI;
    public int LLLLJ;
    public int LLLLJI;
    public final int LLLLL;
    public long LLLLLIL;
    public long LLLLLILLIL;
    public int LLLLLJIL;
    public boolean LLLLLJLJLL;
    public boolean LLLLLL;
    public String LLLLLLIL;
    public String LLLLLLJ;
    public String LLLLLLL;
    public int LLLLLLLLL;
    public String LLLLLLLLLL;
    public String LLLLLLLZIL;
    public String LLLLLLZ;
    public String LLLLLLZZ;
    public String LLLLLZ;
    public String LLLLLZIL;
    public int LLLLLZL;
    public boolean LLLLZ;
    public String LLLLZI;
    public boolean LLLLZIL;
    public boolean LLLLZLL;
    public CopyOnWriteArrayList<String> LLLLZLLIL;
    public int LLLLZLLLI;
    public boolean LLLZ;
    public int LLLZI;
    public final float LLLZIIL;
    public final float LLLZIL;
    public final float LLLZL;
    public final float LLLZLL;
    public int LLLZLZ;
    public int LLLZZ;
    public int LLLZZIL;
    public int LLZ;
    public int LLZIL;
    public int LLZILL;
    public int LLZL;
    public boolean LLZLI;
    public final long LLZLL;
    public final int LLZLLIL;
    public int LLZLLLL;
    public int LLZZ;
    public final long LLZZJLIL;
    public final C794300VDw LLZZLLIL;
    public volatile boolean LLZZZIL;
    public volatile boolean LLZZZZ;
    public int M;
    public int M0;
    public int M1;
    public boolean M2;
    public int N;
    public int N0;
    public long N1;
    public long N2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public boolean f445O;
    public int O0;
    public String O1;
    public Surface O2;
    public int P;
    public int P0;
    public long P1;
    public C1698760uJ8 P2;
    public int Q;
    public String Q0;
    public boolean Q1;
    public C1407370mj9 Q2;
    public int R;
    public String R0;
    public boolean R1;
    public C1407370mj9 R2;
    public int S;
    public int S0;
    public int S1;
    public ARunnableS123S0100000_23 S2;
    public int T;
    public int T0;
    public String T1;
    public boolean T2;
    public int U;
    public int U0;
    public int U1;
    public C1556760qc6 U2;
    public int V;
    public int V0;
    public int V1;
    public int V2;
    public int W;
    public int W0;
    public int W1;
    public int W2;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    public int f446X;
    public int X0;
    public int X1;
    public String X2;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public int f447Y;
    public int Y0;
    public int Y1;
    public C1698740uJ6 Y2;
    public int Z;
    public int Z0;
    public int Z1;
    public C1698930uJP Z2;
    public final int a;
    public int a0;
    public String a1;
    public int a2;

    /* JADX INFO: renamed from: a3, reason: collision with root package name */
    public final Map<String, String> f448a3;
    public final String b;
    public int b0;
    public boolean b1;
    public String b2;
    public C1486290omR b3;
    public final InterfaceC1491020ou4 c;
    public int c0;
    public int c1;
    public final List<Integer> c2;
    public C1486160omE c3;
    public boolean d;
    public int d0;
    public int d1;
    public final float d2;
    public ARunnableS123S0100000_23 d3;
    public String e;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public int f449e0;
    public String e1;
    public long e2;
    public ARunnableS123S0100000_23 e3;
    public final int f;
    public int f0;
    public boolean f1;
    public int f2;
    public boolean f3;
    public int g;
    public int g0;
    public boolean g1;
    public int g2;
    public StrategyCenter g3;
    public double h;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public int f450h0;
    public boolean h1;
    public int h2;
    public InterfaceC1467440oI2 h3;
    public int i;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public int f451i0;
    public List<String> i1;
    public final List<Float> i2;
    public InterfaceC1467440oI2 i3;
    public int j;
    public int j0;
    public boolean j1;
    public final List<Integer> j2;
    public boolean j3;
    public long k;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public int f452k0;
    public int k1;
    public int k2;
    public final String l;
    public String l0;
    public JSONObject l1;
    public String l2;
    public final String m;
    public String m0;
    public JSONObject m1;
    public int m2;
    public final String n;
    public String n0;
    public JSONObject n1;

    /* JADX INFO: renamed from: n2, reason: collision with root package name */
    public int f453n2;
    public int o;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    public int f454o0;
    public int o1;
    public int o2;
    public int p;
    public int p0;

    /* JADX INFO: renamed from: p1, reason: collision with root package name */
    public int f455p1;

    /* JADX INFO: renamed from: p2, reason: collision with root package name */
    public int f456p2;
    public boolean q;
    public int q0;
    public int q1;
    public int q2;
    public int r;
    public int r0;
    public int r1;
    public String r2;
    public boolean s;
    public final C1698630uIv s0;
    public C1486590omv s1;
    public C1286530jaF s2;
    public NativeAudioProcessor t;
    public int t0;
    public int t1;
    public String t2;
    public int u;
    public int u0;
    public int u1;
    public float u2;
    public int v;
    public int v0;
    public final Object v1;
    public boolean v2;
    public int w;
    public int w0;
    public boolean w1;
    public boolean w2;
    public final C1698650uIx x;
    public int x0;
    public int x1;
    public int x2;
    public final C1470760oNO y;
    public int y0;
    public final AtomicBoolean y1;
    public int y2;
    public String z;
    public int z0;
    public JSONObject z1;
    public final int z2;
    public final C1281010jRL LJIIZILJ = new C1281010jRL();
    public final Object LJIJ = new Object();
    public final C1971307nr LJJI = new C1971307nr();
    public final C1698510uIj LJJII = new C1698510uIj();

    public final String LLIILZL() {
        Object[] objArr = new Object[3];
        objArr[0] = "RTM_PLAYER_LOG";
        objArr[1] = TextUtils.isEmpty(this.b) ? "" : this.b;
        objArr[2] = Integer.valueOf(this.P0);
        return C786410Ut5.j4("%s\t[%s_%d]", objArr);
    }

    static {
        C1481110oe5.LIZIZ("VideoLiveManager", "liveProcessPlugin register");
        C1470480oMw c1470480oMw = C1469430oLF.LIZ;
        EnumC1469090oKh enumC1469090oKh = EnumC1469090oKh.LIVE_PLAYER;
        c1470480oMw.LIZIZ(enumC1469090oKh, InterfaceC1470050oMF.class, new InterfaceC1470580oN6<C1470800oNS>() { // from class: X.0oNT
            @Override // X.InterfaceC1470580oN6
            public final InterfaceC1470560oN4 LIZ(AbstractC1470590oN7 abstractC1470590oN7, InterfaceC1469660oLc interfaceC1469660oLc) {
                return new C1470800oNS((C1470760oNO) abstractC1470590oN7, interfaceC1469660oLc);
            }
        });
        c1470480oMw.LIZIZ(enumC1469090oKh, InterfaceC1470060oMG.class, new InterfaceC1470580oN6<C1470830oNV>() { // from class: X.0oNP
            @Override // X.InterfaceC1470580oN6
            public final InterfaceC1470560oN4 LIZ(AbstractC1470590oN7 abstractC1470590oN7, InterfaceC1469660oLc interfaceC1469660oLc) {
                return new C1470830oNV((C1470760oNO) abstractC1470590oN7, interfaceC1469660oLc);
            }
        });
        c1470480oMw.LIZIZ(enumC1469090oKh, InterfaceC1470680oNG.class, new InterfaceC1470580oN6<C1698470uIf>() { // from class: X.0oNU
            @Override // X.InterfaceC1470580oN6
            public final InterfaceC1470560oN4 LIZ(AbstractC1470590oN7 abstractC1470590oN7, InterfaceC1469660oLc interfaceC1469660oLc) {
                return new C1698470uIf((C1470760oNO) abstractC1470590oN7, interfaceC1469660oLc);
            }
        });
        c1470480oMw.LIZIZ(enumC1469090oKh, InterfaceC1470070oMH.class, new InterfaceC1470580oN6<InterfaceC1470070oMH>() { // from class: X.0oNQ
            @Override // X.InterfaceC1470580oN6
            public final InterfaceC1470560oN4 LIZ(AbstractC1470590oN7 abstractC1470590oN7, InterfaceC1469660oLc interfaceC1469660oLc) {
                return new C1470790oNR((C1470760oNO) abstractC1470590oN7, interfaceC1469660oLc);
            }
        });
        if (C1474810oTv.LLJI().pluginReuseMode == 1) {
            c1470480oMw.LIZ(enumC1469090oKh, InterfaceC1470050oMF.class, new C1470570oN5());
            c1470480oMw.LIZ(enumC1469090oKh, InterfaceC1470060oMG.class, new C1470570oN5());
            c1470480oMw.LIZ(enumC1469090oKh, InterfaceC1470070oMH.class, new C1470570oN5());
        }
        k3 = new AtomicInteger(0);
        l3 = 500;
        f443m3 = 200;
        n3 = 900;
        o3 = 600;
        p3 = -1;
        q3 = -1;
        r3 = -1;
        t3 = false;
        u3 = null;
        v3 = LivePreCreateNextRoomPlayer.ENABLE;
        w3 = 2;
    }

    public final void LJIIL() {
        int i = this.LLLLLZL;
        if (i == 1) {
            ((C1470430oMr) this.LIZLLL).LIZJ(899, i);
        }
        int i2 = this.LLZ;
        if (i2 >= 0) {
            ((C1470430oMr) this.LIZLLL).LIZJ(535, i2);
        }
        if (this.L1 == 1 && this.O1.equals("none") && this.S1 == 1) {
            ((C1470430oMr) this.LIZLLL).LIZJ(546, 1);
            this.LJIILLIIL.b2 = EnumC1486270omP.STARTUP_EXEC_TYPE_PLAYER_STRATEGY.ordinal();
            this.LJIILLIIL.S1 = 1;
        }
        if (this.v == 1) {
            ((C1470430oMr) this.LIZLLL).LIZJ(651, 1);
        }
        if (this.LLZILL == 1) {
            ((C1470430oMr) this.LIZLLL).LIZJ(548, 1);
        }
    }

    public final void LJIILIIL() {
        InterfaceC1699150uJl interfaceC1699150uJl = this.LJIJJLI;
        if (interfaceC1699150uJl == null || this.q) {
            return;
        }
        this.q = true;
        this.LJJJJJL = ((Integer) interfaceC1699150uJl.LIZ(3, "live_option_render_type")).intValue();
        int i = this.LLILZ;
        if (i >= 0) {
            this.LJJJJJL = i;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("mEnableResolutionAutoDegrade:");
        sbLIZ.append(this.LJLZ);
        sbLIZ.append(" mStallCountThresOfResolutionDegrade:");
        sbLIZ.append(this.LLFZ);
        C2188811AlT.LIZIZ(sbLIZ);
        C1698940uJQ.LIZJ();
        InterfaceC1699150uJl interfaceC1699150uJl2 = this.LJIJJLI;
        Boolean bool = Boolean.FALSE;
        this.LLLLZ = ((Boolean) interfaceC1699150uJl2.LIZ(bool, "live_sdk_http_dns_enabled")).booleanValue();
        this.LLLLZI = (String) this.LJIJJLI.LIZ("null", "live_sdk_http_dns_server_host");
        this.LJIILLIIL.getClass();
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("enable http dns:");
        sbLIZ2.append(this.LLLLZ);
        sbLIZ2.append(" http dns server: ");
        sbLIZ2.append(this.LLLLZI);
        C2188811AlT.LIZIZ(sbLIZ2);
        C1698940uJQ.LIZJ();
        ((Boolean) this.LJIJJLI.LIZ(bool, "live_sdk_cancel_sdk_dns_fail_retry")).booleanValue();
        this.LLLLZLLLI = ((Integer) this.LJIJJLI.LIZ(0, "live_sdk_optimize_backup_enabled")).intValue();
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append("enable optimize backup ip:");
        sbLIZ3.append(this.LLLLZLLLI);
        C2188811AlT.LIZIZ(sbLIZ3);
        C1698940uJQ.LIZJ();
        this.LJJLIIJ = ((Integer) this.LJIJJLI.LIZ(-1, "live_sdk_specify_media_codec_type")).intValue();
        this.LJJLIL = ((Integer) this.LJIJJLI.LIZ(-1, "live_sdk_use_media_codec_with_low_latency_suffix")).intValue();
        StringBuilder sbLIZ4 = C2188811AlT.LIZ();
        sbLIZ4.append("spspps:");
        sbLIZ4.append(this.LLLLL);
        sbLIZ4.append(", dts:1");
        C2188811AlT.LIZIZ(sbLIZ4);
        C1698940uJQ.LIZJ();
        this.LLZZ = ((Integer) this.LJIJJLI.LIZ(0, "live_stream_strategy_sdk_enable")).intValue();
        this.LLILZLL = ((Integer) this.LJIJJLI.LIZ(0, "live_sdk_enable_node_optimize_by_default")).intValue();
        this.LLIZLLLIL = ((Integer) this.LJIJJLI.LIZ(0, "live_sdk_enable_configcenter_opendl")).intValue();
        this.LLJ = ((Integer) this.LJIJJLI.LIZ(0, "live_sdk_enable_start_mio_without_quic")).intValue();
        this.LLJI = ((Integer) this.LJIJJLI.LIZ(0, "live_sdk_enable_dump_ssl_key_log")).intValue();
        this.x1 = ((Integer) this.LJIJJLI.LIZ(-1, "live_sdk_dummy_surface_cache_mode")).intValue();
        this.LLILL = ((Integer) this.LJIJJLI.LIZ(-1, "live_sdk_sw_render_type")).intValue();
        this.LLILLIZIL = ((Integer) this.LJIJJLI.LIZ(0, "live_sdk_enable_yv_render")).intValue();
        this.LLILLJJLI = ((Integer) this.LJIJJLI.LIZ(0, "live_sdk_enable_direct_vc1")).intValue();
        this.LLILLL = ((Integer) this.LJIJJLI.LIZ(-1, "live_sdk_direct_vc1_thread_count")).intValue();
    }

    public final void LJIILL() {
        LJIIJ(EnumC1487700ooi.IDLE);
        InterfaceC1698710uJ3 interfaceC1698710uJ3 = this.LJIJJ;
        if (interfaceC1698710uJ3 != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("releaseAsync start -- ");
            sbLIZ.append(this.P0);
            interfaceC1698710uJ3.LJJJJJ(C2188811AlT.LIZIZ(sbLIZ));
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("releaseAsync -- ");
        sbLIZ2.append(this.P0);
        C2188811AlT.LIZIZ(sbLIZ2);
        C1698940uJQ.LIZJ();
        if (C1474810oTv.LJJJZ()) {
            this.LJIILIIL.removeCallbacksAndMessages(null);
            RetryProcessor retryProcessor = this.LJJ;
            retryProcessor.LJIIJJI = false;
            retryProcessor.LJIILJJIL.removeCallbacksAndMessages(null);
        }
        EnumC1487710ooj enumC1487710ooj = this.LJIIIIZZ;
        if (enumC1487710ooj == EnumC1487710ooj.PLAYED || enumC1487710ooj == EnumC1487710ooj.PAUSED || enumC1487710ooj == EnumC1487710ooj.PREPARING) {
            LJJJI("releaseAsync", false);
        }
        C822650WOx c822650WOx = this.D0;
        if (c822650WOx != null) {
            c822650WOx.shutdown();
        }
        this.LJIILIIL.removeCallbacksAndMessages(null);
        if (!C1474810oTv.LLILIL() || this.LIZLLL == null) {
            LLLILZ();
        }
        if (this.LIZLLL == null) {
            if (C1474810oTv.LJLJLLL()) {
                this.LJJIII.LIZ();
                return;
            }
            return;
        }
        this.LIZLLL = null;
        this.LJJIIZ = null;
        this.LJJIIZI = null;
        this.LJJIJ = null;
        this.y1.set(false);
        LiveLoggerService liveLoggerService = this.LJIILLIIL;
        liveLoggerService.Q = null;
        liveLoggerService.LJJZ();
        this.s0.LIZ();
        C1286530jaF c1286530jaF = this.s2;
        if (c1286530jaF != null) {
            c1286530jaF.LIZ = null;
            c1286530jaF.LIZIZ = null;
            this.s2 = null;
        }
        this.LJIIIZ = EnumC1487690ooh.IDLE;
        this.LJIIIIZZ = EnumC1487710ooj.IDLE;
        this.j1 = true;
        InterfaceC1467090oHT interfaceC1467090oHT = this.LJJIIJZLJL;
        if (interfaceC1467090oHT != null) {
            interfaceC1467090oHT.release();
        }
        if (!C1474810oTv.LLILIL()) {
            LLLILZ();
        }
        C1698940uJQ.LIZJ();
        if (C1474810oTv.LJLJLLL()) {
            this.LJJIII.LIZ();
        }
        InterfaceC1698710uJ3 interfaceC1698710uJ32 = this.LJIJJ;
        if (interfaceC1698710uJ32 != null) {
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("releaseAsync end -- ");
            sbLIZ3.append(this.P0);
            interfaceC1698710uJ32.LJJJJJ(C2188811AlT.LIZIZ(sbLIZ3));
        }
        this.B1 = null;
    }

    public final void LJJIJIIJI() {
        boolean z;
        JSONObject jSONObjectOptJSONObject;
        JSONObject jSONObjectOptJSONObject2;
        JSONObject jSONObjectOptJSONObject3;
        JSONObject jSONObjectOptJSONObject4;
        JSONObject jSONObject;
        JSONObject jSONObject2;
        JSONObject jSONObjectLLILL = LLILL(this.LLJILJIL, this.LLJILLL);
        if (jSONObjectLLILL != null) {
            try {
                if (!this.LJZL && jSONObjectLLILL.has("Auto") && (jSONObject = JSONObjectProtectorUtils.getJSONObject(jSONObjectLLILL, "Auto")) != null) {
                    if (jSONObject.has("Enable")) {
                        this.LJZ = jSONObject.optInt("Enable") == 1;
                    }
                    if (jSONObject.has("Demotion") && (jSONObject2 = JSONObjectProtectorUtils.getJSONObject(jSONObject, "Demotion")) != null && jSONObject2.has("StallCount")) {
                        this.LLFZ = JSONObjectProtectorUtils.getInt(jSONObject2, "StallCount");
                    }
                }
                if (jSONObjectLLILL.has("SocketReceiveBufferSize")) {
                    ((C1470430oMr) this.LIZLLL).LIZJ(25, jSONObjectLLILL.optInt("SocketReceiveBufferSize"));
                }
                if (jSONObjectLLILL.has("EnableDefaultLoudnessInfo")) {
                    ((C1470430oMr) this.LIZLLL).LIZJ(42575, jSONObjectLLILL.optInt("EnableDefaultLoudnessInfo"));
                }
                if (jSONObjectLLILL.has("DurationOfStartAutoSpeed")) {
                    this.LLLLLLLLL = jSONObjectLLILL.optInt("DurationOfStartAutoSpeed");
                }
                if (jSONObjectLLILL.has("DefaultP2PFastOpenDuration")) {
                    jSONObjectLLILL.optInt("DefaultP2PFastOpenDuration");
                }
                if (jSONObjectLLILL.has("vbitrate")) {
                    this.LL = jSONObjectLLILL.optInt("vbitrate");
                }
                if (jSONObjectLLILL.has("EnableRenderStall")) {
                    this.LLJJJJJIL = jSONObjectLLILL.optInt("EnableRenderStall");
                }
                if (jSONObjectLLILL.has("EnableAbnormalSeriesReport")) {
                    this.LLJJL = jSONObjectLLILL.optInt("EnableAbnormalSeriesReport");
                }
                if (jSONObjectLLILL.has("AbnormalSeriesPreSnapshotCount")) {
                    this.LLJJLIIIJLLLLLLLZ = jSONObjectLLILL.optInt("AbnormalSeriesPreSnapshotCount");
                }
                if (jSONObjectLLILL.has("AbnormalSeriesMaxPerPlaying")) {
                    this.LLJL = jSONObjectLLILL.optInt("AbnormalSeriesMaxPerPlaying");
                }
                if (jSONObjectLLILL.has("VideoRenderStallThreshold")) {
                    l3 = jSONObjectLLILL.optInt("VideoRenderStallThreshold");
                }
                if (jSONObjectLLILL.has("AudioRenderStallThreshold")) {
                    f443m3 = jSONObjectLLILL.optInt("AudioRenderStallThreshold");
                }
                if (jSONObjectLLILL.has("EnableDemuxerStall")) {
                    this.LLL = jSONObjectLLILL.optInt("EnableDemuxerStall");
                }
                if (jSONObjectLLILL.has("EnableDecoderStall")) {
                    this.LLLF = jSONObjectLLILL.optInt("EnableDecoderStall");
                }
                if (jSONObjectLLILL.has("DemuxerStallThreshold")) {
                    n3 = jSONObjectLLILL.optInt("DemuxerStallThreshold");
                }
                if (jSONObjectLLILL.has("EnableStartupResFallback2Default")) {
                    this.LLD = jSONObjectLLILL.optInt("EnableStartupResFallback2Default", this.LLD);
                }
                if (jSONObjectLLILL.has("EnableSVC")) {
                    this.k2 = jSONObjectLLILL.optInt("EnableSVC");
                }
                if (jSONObjectLLILL.has("EnableBufferStats")) {
                    this.m2 = jSONObjectLLILL.optInt("EnableBufferStats");
                }
                if (jSONObjectLLILL.has("VideoDemuxerStallCounterThreshold")) {
                    this.LLLFZ = jSONObjectLLILL.optInt("VideoDemuxerStallCounterThreshold");
                    this.LLLFFI = true;
                }
                if (jSONObjectLLILL.has("VideoPostDecoderStallCounterThreshold")) {
                    this.LLLI = jSONObjectLLILL.optInt("VideoPostDecoderStallCounterThreshold");
                    this.LLLFFI = true;
                }
                if (jSONObjectLLILL.has("VideoRenderStallCounterThreshold")) {
                    this.LLLII = jSONObjectLLILL.optInt("VideoRenderStallCounterThreshold");
                    this.LLLFFI = true;
                }
                if (jSONObjectLLILL.has("VideoOutletReadStallCounterThreshold")) {
                    this.LLLIIL = jSONObjectLLILL.optInt("VideoOutletReadStallCounterThreshold");
                    this.LLLFFI = true;
                }
                if (jSONObjectLLILL.has("AudioDemuxerStallCounterThreshold")) {
                    this.LLLIIII = jSONObjectLLILL.optInt("AudioDemuxerStallCounterThreshold");
                    this.LLLFFI = true;
                }
                if (jSONObjectLLILL.has("AudioPostDecoderStallCounterThreshold")) {
                    this.LLLIIIIL = jSONObjectLLILL.optInt("AudioPostDecoderStallCounterThreshold");
                    this.LLLFFI = true;
                }
                if (jSONObjectLLILL.has("AudioRenderStallCounterThreshold")) {
                    this.LLLIIIL = jSONObjectLLILL.optInt("AudioRenderStallCounterThreshold");
                    this.LLLFFI = true;
                }
                if (jSONObjectLLILL.has("EnableRenderStallSeriesReport")) {
                    this.LLJJJJLIIL = jSONObjectLLILL.optInt("EnableRenderStallSeriesReport");
                }
                if (jSONObjectLLILL.has("FixStackEmptyDemuxStall")) {
                    this.LLLIILIL = jSONObjectLLILL.optInt("FixStackEmptyDemuxStall");
                }
                if (jSONObjectLLILL.has("TransInfoCheck")) {
                    JSONObject jSONObjectOptJSONObject5 = jSONObjectLLILL.optJSONObject("TransInfoCheck");
                    if (jSONObjectOptJSONObject5.has("Enabled")) {
                        this.LLIILZL = jSONObjectOptJSONObject5.optInt("Enabled");
                    }
                }
                if (jSONObjectLLILL.has("SEICheck")) {
                    JSONObject jSONObjectOptJSONObject6 = jSONObjectLLILL.optJSONObject("SEICheck");
                    if (jSONObjectOptJSONObject6.has("Enabled")) {
                        this.LLIIZ = jSONObjectOptJSONObject6.optInt("Enabled");
                        if (jSONObjectOptJSONObject6.optInt("Enabled") == 1 || this.LJIILLIIL != null) {
                            this.LJIILLIIL.LJIIZILJ();
                        }
                    }
                }
                if (jSONObjectLLILL.has("gop")) {
                    this.LLIL = jSONObjectLLILL.optInt("gop");
                }
                if (jSONObjectLLILL.has("ABREnableSwitchQuery")) {
                    this.LLLLLZL = jSONObjectLLILL.optInt("ABREnableSwitchQuery");
                }
                if (jSONObjectLLILL.has("ABRDecisionReportLevel")) {
                    this.LLLZZIL = jSONObjectLLILL.optInt("ABRDecisionReportLevel");
                }
                if (jSONObjectLLILL.has("MainBackupSwitch")) {
                    JSONObject jSONObjectOptJSONObject7 = jSONObjectLLILL.optJSONObject("MainBackupSwitch");
                    if (jSONObjectOptJSONObject7.has("Enabled")) {
                        if (jSONObjectOptJSONObject7.optInt("Enabled") == 0) {
                            this.LLI = false;
                        } else {
                            this.LLI = true;
                        }
                    }
                }
                if (jSONObjectLLILL.has("NetworkAdapt")) {
                    LJIILJJIL(new JSONObject(jSONObjectLLILL.optString("NetworkAdapt")));
                }
                if (jSONObjectLLILL.has("StartPlayAudioBufferThreshold")) {
                    this.LLLLLIL = jSONObjectLLILL.optInt("StartPlayAudioBufferThreshold");
                }
                if (jSONObjectLLILL.has("StartPlayAudioBufferWaitTime")) {
                    this.LLLLLILLIL = jSONObjectLLILL.optLong("StartPlayAudioBufferWaitTime");
                }
                if (jSONObjectLLILL.has("EnableBCStartPlayBuffer")) {
                    this.LLLLLJIL = jSONObjectLLILL.optInt("EnableBCStartPlayBuffer");
                }
                if (jSONObjectLLILL.has("ProtocolDowngrade")) {
                    this.LLLLJ = jSONObjectLLILL.optInt("ProtocolDowngrade") == 1 ? 1 : 0;
                }
                if (jSONObjectLLILL.has("ProtocolRetryTimes")) {
                    this.LLLLILI = jSONObjectLLILL.optInt("ProtocolRetryTimes");
                }
                if (jSONObjectLLILL.has("AudioDropThreshold")) {
                    this.LLLILZ = jSONObjectLLILL.optInt("AudioDropThreshold");
                }
                if (jSONObjectLLILL.has("FixSmoothAOSwitch")) {
                    this.LLLILZJ = jSONObjectLLILL.optInt("FixSmoothAOSwitch");
                }
                if (jSONObjectLLILL.has("DisableSecondFrameSync")) {
                    this.N = jSONObjectLLILL.optInt("DisableSecondFrameSync");
                }
                if (jSONObjectLLILL.has("EnableFixPlayResStatistic")) {
                    this.LLLILZLLLI = jSONObjectLLILL.optInt("EnableFixPlayResStatistic");
                }
                if (jSONObjectLLILL.has("UseFastOpenDurationFromSetAPI")) {
                    this.LLLFF = jSONObjectLLILL.optInt("UseFastOpenDurationFromSetAPI") == 1;
                }
                if (this.LLLFF && r3 != -1) {
                    p3 = r3;
                } else if (jSONObjectLLILL.has("FastOpenDuration")) {
                    p3 = jSONObjectLLILL.optInt("FastOpenDuration");
                }
                if (jSONObjectLLILL.has("P2PFastOpenDuration")) {
                    q3 = jSONObjectLLILL.optInt("P2PFastOpenDuration");
                }
                if (jSONObjectLLILL.has("EnableCmafSegmentSeriesReport")) {
                    this.LJIILLIIL.a0 = jSONObjectLLILL.optInt("EnableCmafSegmentSeriesReport");
                }
                if (jSONObjectLLILL.has("AudioTimescaleEnable")) {
                    this.LLZLLLL = jSONObjectLLILL.optInt("AudioTimescaleEnable");
                }
                if (jSONObjectLLILL.has("SkipBufferingBeforeFirstFrame")) {
                    this.LLIIIL = jSONObjectLLILL.optInt("SkipBufferingBeforeFirstFrame");
                }
                if (jSONObjectLLILL.has("CmafSegNumDiffThreshold")) {
                    this.LLIIIZ = jSONObjectLLILL.optInt("CmafSegNumDiffThreshold");
                }
                if (jSONObjectLLILL.has("EnableFastOpen")) {
                    this.LLLLJI = jSONObjectLLILL.optInt("EnableFastOpen");
                }
                if (jSONObjectLLILL.has("EnableSkipFlvNullTag")) {
                    this.LLLZZ = jSONObjectLLILL.optInt("EnableSkipFlvNullTag");
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("enable skip flv null tag:");
                    sbLIZ.append(this.LLLZZ);
                    C2188811AlT.LIZIZ(sbLIZ);
                    C1698940uJQ.LIZ();
                }
                if (jSONObjectLLILL.has("EnableHttpKeepOriginHost")) {
                    this.S = jSONObjectLLILL.optInt("EnableHttpKeepOriginHost", this.S);
                }
                if (jSONObjectLLILL.has("EnableBackupOriginInDecodeError")) {
                    this.U0 = jSONObjectLLILL.optInt("EnableBackupOriginInDecodeError");
                }
                InterfaceC1699150uJl interfaceC1699150uJl = this.LJIJJLI;
                if (interfaceC1699150uJl != null) {
                    this.LJIILLIIL.W = ((Long) interfaceC1699150uJl.LIZ(0L, "time_diff_server_and_client")).longValue();
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("time_diff:");
                    sbLIZ2.append(this.LJIILLIIL.W);
                    C2188811AlT.LIZIZ(sbLIZ2);
                    C1698940uJQ.LIZ();
                }
                if (jSONObjectLLILL.has("NoSyncReportMinDuration")) {
                    this.B0 = jSONObjectLLILL.optInt("NoSyncReportMinDuration");
                }
                if (jSONObjectLLILL.has("NoSyncReportReportThres")) {
                    this.C0 = jSONObjectLLILL.optInt("NoSyncReportReportThres");
                }
                if (jSONObjectLLILL.has("httpx")) {
                    this.LLLLLLIL = jSONObjectLLILL.optString("httpx");
                    LiveLoggerService liveLoggerService = this.LJIILLIIL;
                    LLL("httpx", jSONObjectLLILL);
                    liveLoggerService.getClass();
                }
                if (jSONObjectLLILL.has("llash")) {
                    this.LLLLLLJ = jSONObjectLLILL.optString("llash");
                }
                if (jSONObjectLLILL.has("EnableAbrLogOnBitrateChange")) {
                    this.LJIILLIIL.y1 = jSONObjectLLILL.optInt("EnableAbrLogOnBitrateChange", 1);
                }
                if (jSONObjectLLILL.has("cmaf")) {
                    this.LLLLLLL = jSONObjectLLILL.optString("cmaf");
                    this.LJIILLIIL.w1 = LLL("cmaf", jSONObjectLLILL);
                }
                if (jSONObjectLLILL.has("BufferDataMs")) {
                    this.LJJJLIIL = jSONObjectLLILL.optInt("BufferDataMs", -1);
                }
                if (this.g != 1) {
                    if (jSONObjectLLILL.has("PlayingIntervalMs")) {
                        LiveLoggerService liveLoggerService2 = this.LJIILLIIL;
                        long jOptLong = jSONObjectLLILL.optLong("PlayingIntervalMs", 60000L);
                        if (jOptLong >= 2000) {
                            liveLoggerService2.LLILZLL = jOptLong;
                        } else {
                            liveLoggerService2.getClass();
                        }
                        this.A2 = (int) jSONObjectLLILL.optLong("PlayingIntervalMs", 60000L);
                    }
                    if (jSONObjectLLILL.has("HighFreqPlayingIntervalMs")) {
                        this.LJIILLIIL.LJLI(jSONObjectLLILL.optLong("HighFreqPlayingIntervalMs", -1L));
                    }
                }
                this.LJIILLIIL.b1 = 1;
                this.LLILII = Build.VERSION.SDK_INT >= 31 ? 1 : 0;
                if (jSONObjectLLILL.has("EnableOptimizeLivePtsRollback")) {
                    this.LJJLIIIJJIZ = jSONObjectLLILL.optInt("EnableOptimizeLivePtsRollback", 1);
                }
                if (jSONObjectLLILL.has("EnableResyncOnRollback")) {
                    this.LJJLIIIJL = jSONObjectLLILL.optInt("EnableResyncOnRollback", 0);
                }
                if (jSONObjectLLILL.has("RollbackPendingMaxPackets")) {
                    this.LJJLIIIJLJLI = jSONObjectLLILL.optInt("RollbackPendingMaxPackets", 10);
                }
                if (jSONObjectLLILL.has("ResyncBarrierTimeoutMs")) {
                    this.LJJLIIIJLLLLLLLZ = jSONObjectLLILL.optInt("ResyncBarrierTimeoutMs", LSPassThroughRecordSizeConfig.DEFAULT);
                }
                if (jSONObjectLLILL.has("UseNewApplogAPI")) {
                    z = false;
                    this.LJIILLIIL.LLLF = jSONObjectLLILL.optInt("UseNewApplogAPI", 0);
                } else {
                    z = false;
                }
                if (jSONObjectLLILL.has("DropFrameConfig") && (jSONObjectOptJSONObject4 = jSONObjectLLILL.optJSONObject("DropFrameConfig")) != null) {
                    if (jSONObjectOptJSONObject4.has("DropFrameRateLimit")) {
                        this.I1 = (float) jSONObjectOptJSONObject4.optDouble("DropFrameRateLimit");
                    }
                    if (jSONObjectOptJSONObject4.has("MinDurationToRetry")) {
                        this.F1 = jSONObjectOptJSONObject4.optInt("MinDurationToRetry");
                    }
                    if (jSONObjectOptJSONObject4.has("Enable") && this.I1 != -1.0f) {
                        this.D1 = jSONObjectOptJSONObject4.optInt("Enable");
                    }
                    if (jSONObjectOptJSONObject4.has("EnableDropFrameRetry") && this.D1 != 0) {
                        this.E1 = jSONObjectOptJSONObject4.optInt("EnableDropFrameRetry");
                    }
                }
                if (jSONObjectLLILL.has("SizeOfGopSizeCollector")) {
                    this.y2 = jSONObjectLLILL.optInt("SizeOfGopSizeCollector");
                }
                if (jSONObjectLLILL.has("SizeOfCctkBwCollector")) {
                    this.C2 = jSONObjectLLILL.optInt("SizeOfCctkBwCollector");
                }
                if (jSONObjectLLILL.has("DurationOfCctkBwCollector")) {
                    this.D2 = jSONObjectLLILL.optInt("DurationOfCctkBwCollector");
                }
                if (jSONObjectLLILL.has("PeriodOfSessionTimeSeries")) {
                    this.E2 = jSONObjectLLILL.optLong("PeriodOfSessionTimeSeries");
                    this.B2 = (int) jSONObjectLLILL.optLong("PeriodOfSessionTimeSeries", Mp4ScreenVideoLoadTimeout.CONTROL);
                }
                if (jSONObjectLLILL.has("EnableLooperRemoveMsgNotify")) {
                    this.F2 = jSONObjectLLILL.optInt("EnableLooperRemoveMsgNotify");
                }
                if (jSONObjectLLILL.has("EnableStopRetryInAudioRender")) {
                    this.M = jSONObjectLLILL.optInt("EnableStopRetryInAudioRender");
                }
                if (jSONObjectLLILL.has("EnableStrategySDKEnable")) {
                    this.LLZZ = jSONObjectLLILL.optInt("EnableStrategySDKEnable");
                    this.LJIILLIIL.getClass();
                }
                if (jSONObjectLLILL.has("EnableNodeOptimizeByDefault")) {
                    this.LLILZLL = jSONObjectLLILL.optInt("EnableNodeOptimizeByDefault");
                }
                if (jSONObjectLLILL.has("AudioBalanceTargetLuft")) {
                    this.u2 = (float) jSONObjectLLILL.optDouble("AudioBalanceTargetLuft");
                }
                if (jSONObjectLLILL.has("EnableSkipAudioBalanceInLink")) {
                    this.x2 = jSONObjectLLILL.optInt("EnableSkipAudioBalanceInLink");
                }
                if (jSONObjectLLILL.has("EnableOnlyAudioInAoRes")) {
                    this.G2 = jSONObjectLLILL.optInt("EnableOnlyAudioInAoRes");
                }
                if (jSONObjectLLILL.has("EnableSocketBindInFfmpeg")) {
                    jSONObjectLLILL.optInt("EnableSocketBindInFfmpeg");
                }
                if (jSONObjectLLILL.has("EnableConfigBeforeSwitch")) {
                    this.q2 = jSONObjectLLILL.optInt("EnableConfigBeforeSwitch");
                }
                if (jSONObjectLLILL.has("EnableForceDrawWhenSurfaceChange")) {
                    jSONObjectLLILL.optInt("EnableForceDrawWhenSurfaceChange");
                }
                if (jSONObjectLLILL.has("EnableAvgFrameRate")) {
                    ((C1470430oMr) this.LIZLLL).LIZJ(42800, jSONObjectLLILL.optInt("EnableAvgFrameRate"));
                }
                if (jSONObjectLLILL.has("EnableAudioDirectBuffer")) {
                    this.LJLI = jSONObjectLLILL.optInt("EnableAudioDirectBuffer");
                }
                ((C1470430oMr) this.LIZLLL).LIZJ(42515, 1);
                if (jSONObjectLLILL.has("EnablePlayerFormaterModuleControllerRefactor")) {
                    ((C1470430oMr) this.LIZLLL).LIZJ(42121, jSONObjectLLILL.optInt("EnablePlayerFormaterModuleControllerRefactor"));
                }
                if (jSONObjectLLILL.has("RenderDataSpaceOpt")) {
                    ((C1470430oMr) this.LIZLLL).LIZJ(42716, jSONObjectLLILL.optInt("RenderDataSpaceOpt"));
                }
                if (jSONObjectLLILL.has("SilenceVoiceThreshold")) {
                    ((C1470430oMr) this.LIZLLL).LIZJ(40108, jSONObjectLLILL.optInt("SilenceVoiceThreshold"));
                }
                float f = this.u2;
                if (f != -1.0f) {
                    this.LJIILLIIL.c6 = f;
                    ((C1470430oMr) this.LIZLLL).LJIL(f, 645);
                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                    sbLIZ3.append("set ae tar luft ");
                    sbLIZ3.append(this.u2);
                    C2188811AlT.LIZIZ(sbLIZ3);
                    C1698940uJQ.LIZJ();
                }
                LJJLIIIIJ();
                LJJLIIIJJIZ(jSONObjectLLILL);
                LJJLIIIJLJLI(jSONObjectLLILL);
                LJJLIIIJLLLLLLLZ(jSONObjectLLILL);
                LJJL(jSONObjectLLILL);
                LJJJZ(jSONObjectLLILL);
                LJJLI(jSONObjectLLILL);
                LJJLIIIJILLIZJL(jSONObjectLLILL);
                LJJLIIIJL(jSONObjectLLILL);
                LJJJLZIJ(jSONObjectLLILL);
                LJJLJLI(jSONObjectLLILL);
                LJJLIIJ(jSONObjectLLILL);
                LJJLL(jSONObjectLLILL);
                if (jSONObjectLLILL.has("EnableAvFrameSeries")) {
                    this.LJIILLIIL.w4 = jSONObjectLLILL.optInt("EnableAvFrameSeries");
                    ((C1470430oMr) this.LIZLLL).LIZJ(1973, this.LJIILLIIL.w4);
                }
                if (jSONObjectLLILL.has("EnableAudioDucking")) {
                    ((C1470430oMr) this.LIZLLL).LIZJ(430, jSONObjectLLILL.optInt("EnableAudioDucking"));
                }
                if (jSONObjectLLILL.has("AvFrameSeriesDuration")) {
                    this.LJIILLIIL.x4 = jSONObjectLLILL.optInt("AvFrameSeriesDuration");
                    ((C1470430oMr) this.LIZLLL).LIZJ(1974, this.LJIILLIIL.x4);
                }
                if (jSONObjectLLILL.has("EnableAvFrameSeriesOnStall")) {
                    this.LJIILLIIL.y4 = jSONObjectLLILL.optInt("EnableAvFrameSeriesOnStall");
                }
                this.LJIILLIIL.LJLIL();
                if (jSONObjectLLILL.has("EnableAVPktSeries")) {
                    this.LJIILLIIL.z4 = jSONObjectLLILL.optInt("EnableAVPktSeries");
                    ((C1470430oMr) this.LIZLLL).LIZJ(1920, this.LJIILLIIL.z4);
                }
                if (jSONObjectLLILL.has("AvPktSeriesDuration")) {
                    ((C1470430oMr) this.LIZLLL).LIZJ(1921, jSONObjectLLILL.optInt("AvPktSeriesDuration"));
                }
                if (jSONObjectLLILL.has("ReportTransDetailLog")) {
                    this.LJIILLIIL.A4 = jSONObjectLLILL.optInt("ReportTransDetailLog");
                }
                if (jSONObjectLLILL.has("EnableOptimizeCompressor")) {
                    ((C1470430oMr) this.LIZLLL).LIZJ(42854, jSONObjectLLILL.optInt("EnableOptimizeCompressor"));
                }
                ((C1470430oMr) this.LIZLLL).LIZJ(40100, 1);
                this.b3 = C1486290omR.LIZ(jSONObjectLLILL);
                if (jSONObjectLLILL.has("EnableBufferRecoveryStrategy")) {
                    int iOptInt = jSONObjectLLILL.optInt("EnableBufferRecoveryStrategy");
                    StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                    sbLIZ4.append("set enable buffer recovery:");
                    sbLIZ4.append(iOptInt);
                    C2188811AlT.LIZIZ(sbLIZ4);
                    C1698940uJQ.LIZJ();
                    LJLZ().setIntValue(55042, iOptInt);
                }
                if (jSONObjectLLILL.has("BufferRecoveryStrategy") && (jSONObjectOptJSONObject3 = jSONObjectLLILL.optJSONObject("BufferRecoveryStrategy")) != null) {
                    LJLZ().setAlgorithmJson(55043, C786410Ut5.J3(jSONObjectOptJSONObject3));
                }
                if (jSONObjectLLILL.has("EnablePlaySpeedControlStrategy")) {
                    int iOptInt2 = jSONObjectLLILL.optInt("EnablePlaySpeedControlStrategy");
                    StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                    sbLIZ5.append("set enable play speed:");
                    sbLIZ5.append(iOptInt2);
                    C2188811AlT.LIZIZ(sbLIZ5);
                    C1698940uJQ.LIZJ();
                    LJLZ().setIntValue(55044, iOptInt2);
                }
                if (jSONObjectLLILL.has("PlaySpeedControlStrategy") && (jSONObjectOptJSONObject2 = jSONObjectLLILL.optJSONObject("PlaySpeedControlStrategy")) != null) {
                    LJLZ().setAlgorithmJson(55045, C786410Ut5.J3(jSONObjectOptJSONObject2));
                }
                if (jSONObjectLLILL.has("EnableMediaCodecMutexInStopAndClose")) {
                    ((C1470430oMr) this.LIZLLL).LIZJ(44133, jSONObjectLLILL.optInt("EnableMediaCodecMutexInStopAndClose"));
                }
                if (jSONObjectLLILL.has("ForceDisableWidevine")) {
                    this.K0 = jSONObjectLLILL.optInt("ForceDisableWidevine");
                }
                if (jSONObjectLLILL.has("FixDecodeBufferLength")) {
                    ((C1470430oMr) this.LIZLLL).LIZJ(42330, jSONObjectLLILL.optInt("FixDecodeBufferLength"));
                }
                if (jSONObjectLLILL.has("EnableOpenClimiterLoudness")) {
                    if (jSONObjectLLILL.optInt("EnableOpenClimiterLoudness") == 1) {
                        z = true;
                    }
                    this.J1 = z;
                }
                if (jSONObjectLLILL.has("ClimiterPeakLimit")) {
                    this.K1 = (float) jSONObjectLLILL.optDouble("ClimiterPeakLimit");
                }
                if (jSONObjectLLILL.has("DrmPreProvision") && (jSONObjectOptJSONObject = jSONObjectLLILL.optJSONObject("DrmPreProvision")) != null) {
                    if (jSONObjectOptJSONObject.has("Enable")) {
                        this.L0 = jSONObjectOptJSONObject.optInt("Enable");
                    }
                    if (jSONObjectOptJSONObject.has("ProvisionRequestTimeoutMS")) {
                        this.M0 = jSONObjectOptJSONObject.optInt("ProvisionRequestTimeoutMS");
                    }
                    if (jSONObjectOptJSONObject.has("ProvisionRetryIntervalMS")) {
                        this.N0 = jSONObjectOptJSONObject.optInt("ProvisionRetryIntervalMS");
                    }
                }
            } catch (JSONException e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        LiveLoggerService liveLoggerService3 = this.LJIILLIIL;
        int i = this.LL;
        liveLoggerService3.M1 = i;
        liveLoggerService3.F6 = i;
    }

    public final void LJJIJIL() {
        if (this.B) {
            String strLJLLJ = LJLLJ();
            if (strLJLLJ.equals(this.A)) {
                LJJJJI();
                return;
            }
            LiveConfigCenterWrapper.getInstance().removeVVConfigs(this.A);
            C1698940uJQ.LIZJ();
            String str = this.LLJILLL;
            if (str == null) {
                str = "main";
            }
            JSONObject jSONObjectLLILL = LLILL(this.LLJILJIL, "main");
            JSONObject jSONObjectLLILL2 = LLILL(this.LLJILJIL, "backup");
            if (jSONObjectLLILL == null && jSONObjectLLILL2 == null) {
                C1698940uJQ.LIZJ();
                return;
            }
            if (LiveConfigCenterWrapper.getInstance().updateConfigs(jSONObjectLLILL, jSONObjectLLILL2, LJLLJ(), str)) {
                this.A = strLJLLJ;
            }
            LJJJJI();
        }
    }

    public final void LJJIL() {
        String strLJIIJJI = this.LJJII.LJIIJJI(this.LLJILJIL.equals("auto") ? this.LJJII.LJI() : this.LLJILJIL, this.LLJJ, this.LLJILLL, this.LLJZIJLIL);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("_setProtocol, net type: ");
        sbLIZ.append(C789860Uye.LIZ(this.LJIJI));
        C2188811AlT.LIZIZ(sbLIZ);
        C1698940uJQ.LIZJ();
        if (strLJIIJJI != null) {
            this.LJIILLIIL.r1 = strLJIIJJI;
            LLLLLLLZIL(strLJIIJJI);
            this.LLJJJIL = strLJIIJJI;
        }
        LJJJJLI(true);
    }

    public final void LJJIZ() {
        String str;
        String strLJIJJ = this.LJJII.LJIJJ(this.LLJILJIL, this.LLJILLL);
        C1698510uIj c1698510uIj = this.LJJII;
        String str2 = "none";
        if (c1698510uIj.LJJII()) {
            c1698510uIj.LIZIZ.getClass();
            str = "none";
        } else {
            str = null;
        }
        if (!TextUtils.isEmpty(str) && !str.equals("none")) {
            strLJIJJ = str;
        }
        if (this.LLZL > 0) {
            C1698940uJQ.LIZJ();
            C1698500uIi c1698500uIi = this.LJJII.LIZIZ;
            if (c1698500uIi != null) {
                c1698500uIi.LJJIFFI = true;
            }
            strLJIJJ = "tsl";
        } else {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("use suggest format: ");
            sbLIZ.append(strLJIJJ);
            C2188811AlT.LIZIZ(sbLIZ);
            C1698940uJQ.LIZJ();
            C1698500uIi c1698500uIi2 = this.LJJII.LIZIZ;
            if (c1698500uIi2 != null) {
                c1698500uIi2.LJJIFFI = false;
            }
        }
        String str3 = "cmaf";
        if (strLJIJJ == null) {
            strLJIJJ = "flv";
        } else {
            if (strLJIJJ.equals("cmaf")) {
                if (this.f444J == 1 && this.I == 1) {
                    this.LLLLLJLJLL = true;
                }
                if (!this.LLLLLJLJLL) {
                    if (C0TI7.LIZ("ttffmpeg") && C0TI7.LIZ("ffmpeg_dashdec") && C0TI7.LIZ("ttmcmaf")) {
                        C1698940uJQ.LIZJ();
                        this.LLLLLJLJLL = true;
                    } else {
                        C1698940uJQ.LIZJ();
                        this.LLLLLJLJLL = false;
                        C1698510uIj c1698510uIj2 = this.LJJII;
                        if (c1698510uIj2.LJJII()) {
                            c1698510uIj2.LIZIZ.LIZJ |= 1;
                        }
                        str2 = strLJIJJ;
                        strLJIJJ = "flv";
                    }
                }
            }
            str2 = strLJIJJ;
        }
        String str4 = (strLJIJJ.equals("flv") || strLJIJJ.equals("cmaf")) ? strLJIJJ : "flv";
        if (this.LJJII.LJJIII()) {
            str2 = "cmaf";
        } else {
            str3 = str4;
        }
        this.LLJJ = str3;
        LiveLoggerService liveLoggerService = this.LJIILLIIL;
        liveLoggerService.l1 = str2;
        liveLoggerService.LLLZ = str3;
    }

    public final void LJJJJI() {
        if (this.B) {
            String str = this.LLJILLL;
            if (str == null) {
                str = "main";
            }
            LiveConfigCenterWrapper.getInstance().switchVVConfigActiveVariant(str, LJLLJ());
            this.h3 = LiveConfigCenterWrapper.getInstance().getVVConfig(LJLLJ());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x005d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJJLIIL() throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 829
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.videoarch.liveplayer.VideoLiveManager.LJJJLIIL():void");
    }

    public final void LJJJLL() {
        this.LLIIIJ.LJIIL.remove("player_error_code");
        this.LLIIIJ.LJIIL.remove("player_error_time");
        this.LLIIIJ.LJIIL.remove("source_source_type");
        this.LLIIIJ.LJIIL.remove("target_source_type");
        this.LLIIIJ.LJIIL.remove("target_format");
    }

    public final void LJJLIIIIJ() {
        if (this.LJIJJLI == null) {
            C1698940uJQ.LIZJ();
            return;
        }
        C1698940uJQ.LIZJ();
        ((C1470430oMr) this.LIZLLL).LIZJ(42724, 1);
        ((C1470430oMr) this.LIZLLL).LIZJ(42725, ((Integer) this.LJIJJLI.LIZ(0, "live_player_enable_unify_codec_reuse")).intValue());
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01bc  */
    /* JADX WARN: Type inference failed for: r0v52, types: [X.0uJg] */
    /* JADX WARN: Type inference failed for: r0v59, types: [X.0uJh] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJLIIIJ() {
        /*
            Method dump skipped, instruction units count: 464
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.videoarch.liveplayer.VideoLiveManager.LJJLIIIJ():void");
    }

    public final void LJJLIIIJJI() throws Throwable {
        int i;
        Object obj;
        if (this.H == 0) {
            return;
        }
        if (!this.LJIIL) {
            this.LJIIJJI = StrategyCenter.getInstance().getIntValue(56018, 0);
            this.LJIIL = true;
        }
        LiveLoggerService liveLoggerService = this.LJIILLIIL;
        liveLoggerService.f460X = 1;
        liveLoggerService.f461Y = this.I;
        liveLoggerService.Z = this.f444J;
        if (this.H != 0 && !this.f445O) {
            C1476630oWr c1476630oWr = new C1476630oWr();
            Context context = this.LJIJI;
            File file = C786450Ut9.LIZJ;
            if (file == null || !C786450Ut9.LJ) {
                try {
                    C786450Ut9.LIZJ = context.getFilesDir();
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    Context applicationContext = null;
                    try {
                        Class<?> cls = Class.forName("android.app.ActivityThread");
                        Object objInvoke = cls.getDeclaredMethod("currentActivityThread", new Class[0]).invoke(null, new Object[0]);
                        Field declaredField = cls.getDeclaredField("mInitialApplication");
                        declaredField.setAccessible(true);
                        obj = declaredField.get(objInvoke);
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                        PrintStream printStream = System.out;
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("Error: ");
                        sbLIZ.append(e.getMessage());
                        printStream.println(C2188811AlT.LIZIZ(sbLIZ));
                    }
                    if (!(obj instanceof Application)) {
                        System.out.println("Error: mInitialApplication is not an instance of Application");
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append(th.getMessage());
                        sbLIZ2.append(":");
                        sbLIZ2.append(C08RN.LIZJ());
                        sbLIZ2.append(" applicationContext is null");
                        throw new Throwable(C2188811AlT.LIZIZ(sbLIZ2));
                    }
                    applicationContext = ((Application) obj).getApplicationContext();
                    PrintStream printStream2 = System.out;
                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                    sbLIZ3.append("Application context obtained through ActivityThread: ");
                    sbLIZ3.append(applicationContext);
                    printStream2.println(C2188811AlT.LIZIZ(sbLIZ3));
                    if (applicationContext != null) {
                        C786450Ut9.LIZJ = applicationContext.getFilesDir();
                        C08RN.LIZ(applicationContext);
                    }
                    StringBuilder sbLIZ22 = C2188811AlT.LIZ();
                    sbLIZ22.append(th.getMessage());
                    sbLIZ22.append(":");
                    sbLIZ22.append(C08RN.LIZJ());
                    sbLIZ22.append(" applicationContext is null");
                    throw new Throwable(C2188811AlT.LIZIZ(sbLIZ22));
                }
                file = C786450Ut9.LIZJ;
            }
            c1476630oWr.LIZ = file.getAbsolutePath();
            c1476630oWr.LIZIZ = this.W == 1;
            c1476630oWr.LJ = this.LLIZLLLIL == 1;
            c1476630oWr.LJFF = this.w0 == 1;
            c1476630oWr.LIZJ = this.LLJ == 1;
            c1476630oWr.LIZLLL = this.LLJI == 1;
            c1476630oWr.LJI = this.n0;
            C1476640oWs c1476640oWs = new C1476640oWs(c1476630oWr);
            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
            sbLIZ4.append("mio_live configLiveIOGlobal isSyncV2:");
            sbLIZ4.append(this.a0);
            sbLIZ4.append(" mEnableMioLive:");
            sbLIZ4.append(1);
            sbLIZ4.append(" mEnableStartMioWithoutTTquic: ");
            sbLIZ4.append(this.LLJ);
            sbLIZ4.append(" mEnableDumpSslKeyLog:");
            sbLIZ4.append(this.LLJI);
            sbLIZ4.append(" mEnableConfigCenterOpenDL:");
            sbLIZ4.append(this.LLIZLLLIL);
            C2188811AlT.LIZIZ(sbLIZ4);
            C1698940uJQ.LIZJ();
            if (this.a0 == 1) {
                C1476660oWu.LIZ.LJIIL(C786410Ut5.N3(this.LJIJI), c1476640oWs);
            } else {
                C1476660oWu.LIZ.LJIIJJI(C786410Ut5.N3(this.LJIJI), c1476640oWs);
            }
            C1698940uJQ.LIZJ();
            int intValue = StrategyCenter.getInstance().getIntValue(55402, 0);
            if (intValue == 1 && !t3) {
                C1476650oWt c1476650oWt = C1476660oWu.LIZ;
                if (c1476650oWt.LIZJ) {
                    LiveIOManager.getInstance().setIntValue(2304, intValue);
                }
                if (this.E) {
                    if (c1476650oWt.LIZJ) {
                        LiveIOManager.getInstance().setIntValue(2306, 1);
                    }
                    C1698940uJQ.LIZJ();
                }
                C1698940uJQ.LIZJ();
                c1476650oWt.LJIIIZ(20001, ConfigCenter.LJI().LJIIIIZZ());
                c1476650oWt.LJIIIZ(20002, ConfigCenter.LJI().LJ());
                c1476650oWt.LJIIIZ(20003, ConfigCenter.LJI().LIZLLL());
                c1476650oWt.LJIIIZ(20004, ConfigCenter.LJI().LIZJ());
                c1476650oWt.LJIIIZ(20005, ConfigCenter.LJI().LJFF());
                C1698940uJQ.LIZJ();
                t3 = true;
            }
            NQE.getInstance().addNetworkStateCallback(new NetworkState.NetworkStateCallback() { // from class: X.0jRM
                @Override // com.ss.mediakit.net.NetworkState.NetworkStateCallback
                public final void onNetworkStateChanged(NetworkState networkState) {
                    VideoLiveManager videoLiveManager;
                    C1281010jRL c1281010jRL;
                    if (networkState == null) {
                        return;
                    }
                    synchronized (this.LIZ.LJIJ) {
                        try {
                            StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                            sbLIZ5.append("videolivemanager: onNetworkStateChanged, and new state is ");
                            sbLIZ5.append(networkState.toString());
                            sbLIZ5.append(", and old mLiveNetworkState is ");
                            sbLIZ5.append(this.LIZ.LJIIZILJ.toString());
                            C2188811AlT.LIZIZ(sbLIZ5);
                            C1698940uJQ.LIZJ();
                            videoLiveManager = this.LIZ;
                            c1281010jRL = videoLiveManager.LJIIZILJ;
                            int i2 = networkState.scenario;
                            long j = networkState.updateTs;
                            int i3 = networkState.networkQuality;
                            int i4 = networkState.bandwidthKbps;
                            int i5 = networkState.rttMs;
                            int i6 = networkState.lossRatePercent;
                            int i7 = networkState.jitterMs;
                            c1281010jRL.LIZ = i2;
                            c1281010jRL.LIZIZ = j;
                            c1281010jRL.LIZJ = i3;
                            c1281010jRL.LIZLLL = i4;
                            c1281010jRL.LJ = i5;
                            c1281010jRL.LJFF = i6;
                            c1281010jRL.LJI = i7;
                        } catch (Throwable th2) {
                            TryCatchGuardChecker.doCheck(th2);
                            throw th2;
                        }
                    }
                    InterfaceC1698710uJ3 interfaceC1698710uJ3 = videoLiveManager.LJIJJ;
                    if (interfaceC1698710uJ3 != null) {
                        interfaceC1698710uJ3.LJJJJ(c1281010jRL);
                    }
                }
            }, "MIOLiveNQE");
            this.f445O = true;
        }
        LiveLoggerService liveLoggerService2 = this.LJIILLIIL;
        C1476650oWt c1476650oWt2 = C1476660oWu.LIZ;
        liveLoggerService2.n4 = c1476650oWt2.LIZJ(1159) == 1 ? 1 : 0;
        StringBuilder sbLIZ5 = C2188811AlT.LIZ();
        sbLIZ5.append("enable mio_live play:");
        sbLIZ5.append(this.LJIILLIIL.n4);
        C2188811AlT.LIZIZ(sbLIZ5);
        C1698940uJQ.LIZJ();
        if (!this.F) {
            if (this.I == 1 || this.LJIIJJI != 0) {
                long jLIZJ = c1476650oWt2.LIZJ(1172);
                StringBuilder sbLIZ6 = C2188811AlT.LIZ();
                sbLIZ6.append("set live protocol handle by mio ret: ");
                sbLIZ6.append(jLIZJ);
                C2188811AlT.LIZIZ(sbLIZ6);
                C1698940uJQ.LIZJ();
                this.F = jLIZJ == 0;
            } else {
                long jLIZJ2 = c1476650oWt2.LIZJ(1001);
                if (jLIZJ2 != -1) {
                    long jLIZIZ = ((C1470430oMr) this.LIZLLL).LIZIZ(501, jLIZJ2);
                    StringBuilder sbLIZ7 = C2188811AlT.LIZ();
                    sbLIZ7.append("set live protocol handle by playercore ret: ");
                    sbLIZ7.append(jLIZIZ);
                    C2188811AlT.LIZIZ(sbLIZ7);
                    C1698940uJQ.LIZJ();
                    this.F = jLIZIZ == 0;
                }
                StringBuilder sbLIZ8 = C2188811AlT.LIZ();
                sbLIZ8.append("get live proto ret: ");
                sbLIZ8.append(jLIZJ2);
                sbLIZ8.append(", register ret: ");
                sbLIZ8.append(this.F);
                C2188811AlT.LIZIZ(sbLIZ8);
                C1698940uJQ.LIZJ();
            }
        }
        if (!this.F) {
            C1698940uJQ.LIZIZ();
            this.I = 0;
            this.f444J = 0;
            LiveLoggerService liveLoggerService3 = this.LJIILLIIL;
            liveLoggerService3.f461Y = 0;
            liveLoggerService3.Z = 0;
            if (TextUtils.equals(this.LLJJ, "cmaf") && this.f1) {
                this.g1 = true;
            }
        }
        StringBuilder sbLIZ9 = C2188811AlT.LIZ();
        sbLIZ9.append("mEnableMIODemuxer:");
        sbLIZ9.append(this.I);
        sbLIZ9.append(" mEnablePreIO:");
        sbLIZ9.append(this.LJIIJJI);
        sbLIZ9.append(" mIsLiveIOProtoRegister:");
        sbLIZ9.append(this.F);
        C2188811AlT.LIZIZ(sbLIZ9);
        C1698940uJQ.LIZJ();
        if (this.P == 1) {
            if (LiveIOManager.getInstance().GetCheckPermissionToGetNetwork()) {
                i = c1476650oWt2.LIZIZ;
                if (i != 0) {
                    if (i == 1) {
                        i = LiveIOManager.getInstance().GetHasSetDeviceInfo() ? 0 : 1;
                    } else {
                        try {
                            new C2118408Rq();
                            int iLIZ = C2118408Rq.LIZ("p2plivevdp");
                            synchronized (c1476650oWt2) {
                                try {
                                    if (c1476650oWt2.LIZIZ != 0) {
                                        c1476650oWt2.LIZIZ = iLIZ;
                                    }
                                    if (c1476650oWt2.LIZIZ == 0 && !LiveIOManager.getInstance().GetHasSetDeviceInfo()) {
                                        c1476650oWt2.LIZIZ = 1;
                                    }
                                } catch (Throwable th2) {
                                    TryCatchGuardChecker.doCheck(th2);
                                    throw th2;
                                }
                            }
                        } catch (Exception e2) {
                            TryCatchGuardChecker.doCheck(e2);
                        }
                        i = c1476650oWt2.LIZIZ;
                    }
                }
            } else {
                i = -2;
            }
            StringBuilder sbLIZ10 = C2188811AlT.LIZ();
            sbLIZ10.append("get p2p status is:");
            sbLIZ10.append(i);
            C2188811AlT.LIZIZ(sbLIZ10);
            C1698940uJQ.LIZJ();
            if (i == 1) {
                this.P = 0;
                this.LJIILLIIL.q4 = "device info is null";
                C1698940uJQ.LIZJ();
            } else if (i != 0) {
                this.P = 0;
                if (i == -1) {
                    this.LJIILLIIL.q4 = "load p2psdk fail";
                } else {
                    this.LJIILLIIL.q4 = "network permission fail";
                }
                StringBuilder sbLIZ11 = C2188811AlT.LIZ();
                sbLIZ11.append("disable p2p:");
                sbLIZ11.append(this.LJIILLIIL.q4);
                C2188811AlT.LIZIZ(sbLIZ11);
                C1698940uJQ.LIZJ();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x0294  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x088a  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x088e  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01f8  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0242  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x026d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJLIL() throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 2205
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.videoarch.liveplayer.VideoLiveManager.LJJLIL():void");
    }

    public final void LJJZ() {
        String str = this.LJIILLIIL.N3;
        if (this.LIZLLL != null && LLJJJ()) {
            long jLJI = ((C1470430oMr) this.LIZLLL).LJI(650, -1);
            if (jLJI <= 0) {
                jLJI = ((C1470430oMr) this.LIZLLL).LJIIJ(963, -1L);
            }
            if (jLJI > 0 && jLJI != this.LJJII.LJ(this.T1, this.LLJILLL)) {
                this.T1 = this.LJJII.LJIIIIZZ(jLJI, this.LLJILLL);
                this.LJIILLIIL.Z5 = 1;
                String strLJIIJJI = this.LJJII.LJIIJJI(this.LLJILJIL, this.LLJJ, this.LLJILLL, this.LLJZIJLIL);
                if (strLJIIJJI != null) {
                    String strReplace = strLJIIJJI.replace("mem://llash/", "");
                    String strLJIIJJI2 = this.LJJII.LJIIJJI(this.T1, this.LLJJ, this.LLJILLL, this.LLJZIJLIL);
                    if (!TextUtils.isEmpty(strLJIIJJI2)) {
                        LiveLoggerService liveLoggerService = this.LJIILLIIL;
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append(strLJIIJJI2);
                        sbLIZ.append("&llash=");
                        sbLIZ.append(strReplace);
                        liveLoggerService.N3 = C2188811AlT.LIZIZ(sbLIZ);
                    }
                }
            }
        }
        if (TextUtils.equals(this.LLJJ, "cmaf") && this.f444J == 1 && this.I == 1) {
            String strLJ = C1476660oWu.LIZ.LJ(this.Q0, 1305);
            LiveLoggerService liveLoggerService2 = this.LJIILLIIL;
            if (!TextUtils.isEmpty(strLJ)) {
                str = strLJ;
            }
            liveLoggerService2.N3 = str;
        }
    }

    public final SurfaceControl LJJZZI() {
        if (Build.VERSION.SDK_INT >= 29 && this.LJJIJIIJIL == null) {
            SurfaceControl.Builder builder = new SurfaceControl.Builder();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Live-");
            sbLIZ.append(k3.incrementAndGet());
            this.LJJIJIIJIL = builder.setName(C2188811AlT.LIZIZ(sbLIZ)).setBufferSize(0, 0).build();
            Surface surface = new Surface(this.LJJIJIIJIL);
            this.LJJIJ = surface;
            this.LJJIJLIJ = surface;
        }
        return this.LJJIJIIJIL;
    }

    /* JADX WARN: Removed duplicated region for block: B:127:0x0271  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x03b2  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x03bb  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x04fd  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x0512  */
    /* JADX WARN: Removed duplicated region for block: B:255:0x0524  */
    /* JADX WARN: Removed duplicated region for block: B:269:0x0577  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String LJL() throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1961
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.videoarch.liveplayer.VideoLiveManager.LJL():java.lang.String");
    }

    public final boolean LJLI() {
        JSONObject jSONObjectLJFF;
        if (LLILL(this.LLJILJIL, this.LLJILLL) == null) {
            C1698940uJQ.LIZJ();
            return false;
        }
        if (!TextUtils.equals(this.LLJILJIL, "auto")) {
            C1698940uJQ.LIZJ();
            return false;
        }
        C1486590omv c1486590omv = this.s1;
        if (c1486590omv != null && !c1486590omv.LIZLLL.get()) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("EnableABRByAutoInfo is disabled, disable reason is:");
            sbLIZ.append(this.s1.LJII.get());
            C2188811AlT.LIZIZ(sbLIZ);
            C1698940uJQ.LIZJ();
            return false;
        }
        C1698510uIj c1698510uIj = this.LJJII;
        String str = this.LLJILLL;
        if (c1698510uIj.LJJII()) {
            jSONObjectLJFF = c1698510uIj.LIZIZ.LJFF(str);
            if (jSONObjectLJFF != null && jSONObjectLJFF.has("list")) {
                JSONArray jSONArrayOptJSONArray = jSONObjectLJFF.optJSONArray("list");
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("EnableABRByAutoInfo is enable, abrInfo:");
                sbLIZ2.append(jSONObjectLJFF);
                C2188811AlT.LIZIZ(sbLIZ2);
                C1698940uJQ.LIZJ();
                return jSONArrayOptJSONArray != null && jSONArrayOptJSONArray.length() > 1;
            }
        } else {
            jSONObjectLJFF = null;
        }
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append("EnableABRByAutoInfo is disabled, abrInfo:");
        sbLIZ3.append(jSONObjectLJFF);
        C2188811AlT.LIZIZ(sbLIZ3);
        C1698940uJQ.LIZJ();
        return false;
    }

    public final void LJLIIIL() {
        if (this.LJJIIJZLJL != null) {
            return;
        }
        InterfaceC1467090oHT interfaceC1467090oHTLIZ = C1470620oNA.LIZ(this.y, this);
        this.LJJIIJZLJL = interfaceC1467090oHTLIZ;
        if (interfaceC1467090oHTLIZ == null) {
            NullPointerException nullPointerException = new NullPointerException();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("TTKMain must not be null Player: ");
            sbLIZ.append(C1470530oN1.LIZIZ(this.y));
            C1481110oe5.LJFF(nullPointerException, C2188811AlT.LIZIZ(sbLIZ));
            this.LJJIIJZLJL = new TTKPlayerV2(this.y, this);
        }
        this.LJ = this;
        this.LJFF = this;
    }

    public final JSONObject LJLJI() {
        C1698510uIj c1698510uIj = this.LJJII;
        String str = this.LLJILLL;
        if (!c1698510uIj.LJJII()) {
            return null;
        }
        C1698500uIi c1698500uIi = c1698510uIj.LIZIZ;
        if (c1698500uIi.LJIILJJIL != null && c1698500uIi.LJJJJIZL == c1698500uIi.LJJJJI && c1698500uIi.LJJJJJ == 23 && c1698500uIi.LJJJJLL.equals(str)) {
            return c1698500uIi.LJIILJJIL;
        }
        c1698500uIi.LJJJJIZL = c1698500uIi.LJJJJI;
        c1698500uIi.LJJJJLL = str;
        c1698500uIi.LJJJJJ = 23;
        JSONObject jSONObject = c1698500uIi.LIZ;
        if (jSONObject == null || jSONObject.length() <= 0) {
            return null;
        }
        Iterator<String> itKeys = c1698500uIi.LIZ.keys();
        c1698500uIi.LJIILJJIL = new JSONObject();
        c1698500uIi.LJIILL = new JSONObject();
        while (itKeys.hasNext()) {
            try {
                String next = itKeys.next();
                C1698800uJC c1698800uJCLJIIIIZZ = c1698500uIi.LJIIIIZZ(next, str);
                if (c1698800uJCLJIIIIZZ != null) {
                    c1698500uIi.LJIILJJIL.put(next, c1698800uJCLJIIIIZZ.LIZ);
                    long j = c1698800uJCLJIIIIZZ.LIZIZ;
                    if (j > 0) {
                        c1698500uIi.LJIILL.put(next, j);
                    }
                }
            } catch (JSONException e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        return c1698500uIi.LJIILJJIL;
    }

    public final long LJLJJI() {
        InterfaceC1467950oIr interfaceC1467950oIr = this.LIZLLL;
        if (interfaceC1467950oIr == null) {
            return 0L;
        }
        return ((C1470430oMr) interfaceC1467950oIr).LJIIJ(73, 0L);
    }

    public final JSONObject LJLJJL() {
        C1407370mj9 c1407370mj9 = this.R2;
        if (c1407370mj9 != null) {
            return c1407370mj9.LIZIZ();
        }
        return null;
    }

    public final JSONObject LJLJJLL() {
        C1407370mj9 c1407370mj9 = this.R2;
        if (c1407370mj9 != null) {
            return c1407370mj9.LIZJ();
        }
        return null;
    }

    public final JSONObject LJLJL() {
        C1407370mj9 c1407370mj9 = this.Q2;
        if (c1407370mj9 != null) {
            return c1407370mj9.LIZIZ();
        }
        return null;
    }

    public final JSONObject LJLJLJ() {
        C1407370mj9 c1407370mj9 = this.Q2;
        if (c1407370mj9 != null) {
            return c1407370mj9.LIZJ();
        }
        return null;
    }

    public final JSONObject LJLL() {
        JSONObject jSONObject = null;
        try {
            JSONObject jSONObjectLLF = LLF();
            if (jSONObjectLLF == null) {
                return null;
            }
            try {
                int iOptInt = jSONObjectLLF.optInt("cctk_bw") * 8;
                jSONObjectLLF.optInt("cctk_plr");
                jSONObjectLLF.optInt("cctk_mrtt");
                jSONObjectLLF.put("cctk_bw", iOptInt);
                return jSONObjectLLF;
            } catch (JSONException e) {
                e = e;
                jSONObject = jSONObjectLLF;
                TryCatchGuardChecker.doCheck(e);
                return jSONObject;
            }
        } catch (JSONException e2) {
            e = e2;
        }
    }

    public final String LJLLI() {
        JSONObject jSONObjectLLILL = LLILL(this.LLJILJIL, this.LLJILLL);
        return jSONObjectLLILL == null ? "" : jSONObjectLLILL.optString("cdn_name", "");
    }

    public final JSONObject LJLLILLLL() throws JSONException {
        InterfaceC1467950oIr interfaceC1467950oIr = this.LIZLLL;
        if (interfaceC1467950oIr == null) {
            return null;
        }
        int iLJI = ((C1470430oMr) interfaceC1467950oIr).LJI(1173, 0);
        int iLJI2 = ((C1470430oMr) this.LIZLLL).LJI(1176, 0);
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("strategy_balance_update_type", iLJI).put("is_sei_link_syncopt", iLJI2);
        return jSONObject;
    }

    public final String LJLLL() {
        String strLJIIIZ;
        if (this.G) {
            strLJIIIZ = C1476660oWu.LIZ.LJ(this.Q0, 1138);
        } else {
            InterfaceC1467950oIr interfaceC1467950oIr = this.LIZLLL;
            strLJIIIZ = interfaceC1467950oIr != null ? ((C1470430oMr) interfaceC1467950oIr).LJIIIZ(1024) : null;
        }
        if (!TextUtils.isEmpty(strLJIIIZ)) {
            this.LLLLLLLLLL = strLJIIIZ;
        }
        return this.LLLLLLLLLL;
    }

    public final void LJLLLL() {
        InterfaceC1699150uJl interfaceC1699150uJl = this.LJIJJLI;
        String upperCase = "NONE";
        if (interfaceC1699150uJl != null) {
            String str = (String) interfaceC1699150uJl.LIZ("NONE", "network_type");
            upperCase = (TextUtils.isEmpty(str) || str.equals("NONE")) ? str : str.toUpperCase();
        }
        String str2 = this.LLJJIJI;
        if (str2 != "none" && !str2.equals(upperCase)) {
            this.LLJJIJIL = true;
        }
        this.LLJJIJI = upperCase;
    }

    public final long LJLLLLLL() {
        JSONObject jSONObjectLLILL;
        long jLJ = this.LJJII.LJ(this.LLJILJIL, this.LLJILLL);
        return (jLJ > 0 || (jSONObjectLLILL = LLILL(this.LLJILJIL, this.LLJILLL)) == null || !jSONObjectLLILL.has("vbitrate")) ? jLJ : jSONObjectLLILL.optInt("vbitrate");
    }

    public final StrategyCenter LJLZ() {
        if (this.g3 == null) {
            this.g3 = StrategyCenter.getInstance();
        }
        return this.g3;
    }

    public final int LJZ() {
        InterfaceC1467950oIr interfaceC1467950oIr = this.LIZLLL;
        if (interfaceC1467950oIr != null) {
            return ((C1470430oMr) interfaceC1467950oIr).LJI(3101, -1);
        }
        return -1;
    }

    public final JSONObject LJZI() {
        EnumC1487710ooj enumC1487710ooj;
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("start", this.LJIILLIIL.LLILLL.LIZ);
            jSONObject.put("start_invoke", this.LJIILLIIL.LLILLL.LIZIZ);
            if (C1474810oTv.LJLJLLL()) {
                jSONObject.put("live_stream_session_id", this.LJJIII.LIZIZ);
            } else {
                jSONObject.put("live_stream_session_id", this.LLIIJLIL);
            }
            if (this.LIZLLL == null || (enumC1487710ooj = this.LJIIIIZZ) == EnumC1487710ooj.IDLE) {
                jSONObject.put("code", -100025);
                return jSONObject;
            }
            if (enumC1487710ooj == EnumC1487710ooj.STOPPED) {
                jSONObject.put("code", -100024);
                return jSONObject;
            }
            jSONObject.put("code", this.LJIILLIIL.LLZ).put("pre_create_player_time", this.LJIILLIIL.LLLJL).put("sdk_dns_analysis_end", this.LJIILLIIL.LLILLL.LIZJ).put("first_set_surface_time", this.LJIILLIIL.LLLL).put("first_frame_render_end", this.LJIILLIIL.LLILLL.LJIIZILJ).put("set_window_time", ((C1470430oMr) this.LIZLLL).LJIIJ(1379, -1L));
            if (this.G) {
                if (!this.LJIILLIIL.LLLZLZ) {
                    C1698630uIv c1698630uIv = this.s0;
                    String str = c1698630uIv.LJIJJ.Q0;
                    if (str != null) {
                        C1476650oWt c1476650oWt = C1476660oWu.LIZ;
                        c1698630uIv.LIZ = c1476650oWt.LIZLLL(str, 1101);
                        c1698630uIv.LIZIZ = c1476650oWt.LIZLLL(c1698630uIv.LJIJJ.Q0, 1102);
                        c1698630uIv.LIZJ = c1476650oWt.LIZLLL(c1698630uIv.LJIJJ.Q0, 1103);
                    }
                }
                jSONObject.put("player_dns_analysis_end", this.s0.LIZ);
                jSONObject.put("tcp_connect_end", this.s0.LIZIZ);
                jSONObject.put("tcp_first_package_end", this.s0.LIZJ);
            } else {
                LiveLoggerService liveLoggerService = this.LJIILLIIL;
                jSONObject.put("player_dns_analysis_end", liveLoggerService.LLLZLZ ? liveLoggerService.LLILLL.LJ : ((C1470430oMr) this.LIZLLL).LJIIJ(68, -1L));
                LiveLoggerService liveLoggerService2 = this.LJIILLIIL;
                jSONObject.put("tcp_connect_end", liveLoggerService2.LLLZLZ ? liveLoggerService2.LLILLL.LJI : ((C1470430oMr) this.LIZLLL).LJIIJ(69, -1L));
                LiveLoggerService liveLoggerService3 = this.LJIILLIIL;
                jSONObject.put("tcp_first_package_end", liveLoggerService3.LLLZLZ ? liveLoggerService3.LLILLL.LJIIL : ((C1470430oMr) this.LIZLLL).LJIIJ(70, -1L));
            }
            LiveLoggerService liveLoggerService4 = this.LJIILLIIL;
            jSONObject.put("vdec_created_time", liveLoggerService4.LLLZLZ ? liveLoggerService4.LLILLL.LLLILZLLLI : ((C1470430oMr) this.LIZLLL).LJIIJ(630, -1L));
            LiveLoggerService liveLoggerService5 = this.LJIILLIIL;
            jSONObject.put("first_video_package_end", liveLoggerService5.LLLZLZ ? liveLoggerService5.LLILLL.LJIILIIL : ((C1470430oMr) this.LIZLLL).LJIIJ(75, -1L));
            LiveLoggerService liveLoggerService6 = this.LJIILLIIL;
            jSONObject.put("first_video_frame_decode_end", liveLoggerService6.LLLZLZ ? liveLoggerService6.LLILLL.LJIILL : ((C1470430oMr) this.LIZLLL).LJIIJ(77, -1L));
            return jSONObject;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return null;
        }
    }

    public final void LL() {
        int iIndexOf;
        int i;
        int iIndexOf2;
        InterfaceC1467950oIr interfaceC1467950oIr = this.LIZLLL;
        if (interfaceC1467950oIr == null) {
            return;
        }
        String strLJIIIZ = this.G ? this.s0.LJIILLIIL : ((C1470430oMr) interfaceC1467950oIr).LJIIIZ(71);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("liveio update playerIP: ");
        sbLIZ.append(strLJIIIZ);
        C2188811AlT.LIZIZ(sbLIZ);
        C1698940uJQ.LIZJ();
        if (strLJIIIZ != null && strLJIIIZ.startsWith(e3.e) && (iIndexOf = strLJIIIZ.indexOf(e3.e)) != -1 && (iIndexOf2 = strLJIIIZ.indexOf(e3.f, (i = iIndexOf + 1))) != -1) {
            strLJIIIZ = strLJIIIZ.substring(i, iIndexOf2);
        }
        if (TextUtils.isEmpty(strLJIIIZ) || TextUtils.equals(strLJIIIZ, this.LJLLL)) {
            this.LJIILLIIL.m5 = "none";
        } else if (TextUtils.equals(this.LJLLL, "none")) {
            LiveLoggerService liveLoggerService = this.LJIILLIIL;
            liveLoggerService.LLJJIJIL = strLJIIIZ;
            liveLoggerService.LLJJJ = true;
            liveLoggerService.m5 = "none";
        } else if (this.b1) {
            this.LJIILLIIL.m5 = strLJIIIZ;
        } else {
            this.LJIILLIIL.m5 = "none";
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("hash code: ");
        sbLIZ2.append(hashCode());
        sbLIZ2.append(", current ip: ");
        sbLIZ2.append(this.LJLLL);
        sbLIZ2.append(", redirect ip:");
        sbLIZ2.append(this.LJIILLIIL.m5);
        sbLIZ2.append(", redirect url:");
        sbLIZ2.append(this.LJIILLIIL.LLILLL.LLJJI);
        sbLIZ2.append(", redirect happen:");
        sbLIZ2.append(this.b1);
        C2188811AlT.LIZIZ(sbLIZ2);
        C1698940uJQ.LIZJ();
    }

    public final void LLD() {
        InterfaceC1467950oIr interfaceC1467950oIr;
        if (this.LLJZIJLIL || this.LJLLLLLL || (interfaceC1467950oIr = this.LIZLLL) == null) {
            return;
        }
        this.LLJZ = ((C1470430oMr) interfaceC1467950oIr).LJIIJ(320, -1L);
        this.LLJLLL = ((C1470430oMr) this.LIZLLL).LJIIJ(319, -1L);
    }

    public final float LLI() {
        return this.LJJIFFI.LIZ();
    }

    public final long LLIFFJFJJ() {
        C1698510uIj c1698510uIj = this.LJJII;
        if (c1698510uIj != null) {
            C1698500uIi c1698500uIi = c1698510uIj.LIZIZ;
            long j = c1698500uIi != null ? c1698500uIi.LJJIZ : -1L;
            long j2 = this.N2;
            if (j2 >= 0) {
                return j + j2;
            }
        }
        return -1L;
    }

    public final JSONObject LLII() {
        C1698510uIj c1698510uIj = this.LJJII;
        String str = this.LLJILJIL;
        String str2 = this.LLJILLL;
        JSONObject jSONObjectOptJSONObject = null;
        if (c1698510uIj.LJJII()) {
            C1698500uIi c1698500uIi = c1698510uIj.LIZIZ;
            if (c1698500uIi.LJJ(str)) {
                str = c1698500uIi.LIZLLL;
            }
            if (c1698500uIi.LJJI(str)) {
                try {
                    JSONObject jSONObjectLJIILIIL = c1698500uIi.LJIILIIL(str, str2);
                    if (jSONObjectLJIILIIL != null) {
                        jSONObjectOptJSONObject = jSONObjectLJIILIIL.optJSONObject("NetDetect");
                        return jSONObjectOptJSONObject;
                    }
                } catch (JSONException e) {
                    TryCatchGuardChecker.doCheck(e);
                }
            }
        }
        return jSONObjectOptJSONObject;
    }

    public final void LLIIII() {
        LiveLoggerService liveLoggerService = this.LJIILLIIL;
        String str = liveLoggerService.C1;
        liveLoggerService.D1 = str;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(this.LJIILLIIL.C1);
            if (jSONObject.has("net_effective_connection_type")) {
                jSONObject.optString("net_effective_connection_type", CardStruct.IStatusCode.DEFAULT);
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    public final JSONObject LLIIIILZ() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("time_series", this.LLLLLLLZIL);
            jSONObject.put("cctk_bw_series", this.LLLLLLZ);
            jSONObject.put("cctk_srtt_series", this.LLLLLLZZ);
            jSONObject.put("cctk_plr_series", this.LLLLLZ);
            return jSONObject;
        } catch (JSONException e) {
            TryCatchGuardChecker.doCheck(e);
            return jSONObject;
        }
    }

    public final C1281010jRL LLIIIJ() {
        C1281010jRL c1281010jRL;
        NetworkState networkState = C1476660oWu.LIZ.LIZJ(1159) == 1 ? NQE.getInstance().getNetworkState(1) : null;
        synchronized (this.LJIJ) {
            if (networkState != null) {
                try {
                    C1281010jRL c1281010jRL2 = this.LJIIZILJ;
                    int i = networkState.scenario;
                    long j = networkState.updateTs;
                    int i2 = networkState.networkQuality;
                    int i3 = networkState.bandwidthKbps;
                    int i4 = networkState.rttMs;
                    int i5 = networkState.lossRatePercent;
                    int i6 = networkState.jitterMs;
                    c1281010jRL2.LIZ = i;
                    c1281010jRL2.LIZIZ = j;
                    c1281010jRL2.LIZJ = i2;
                    c1281010jRL2.LIZLLL = i3;
                    c1281010jRL2.LJ = i4;
                    c1281010jRL2.LJFF = i5;
                    c1281010jRL2.LJI = i6;
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
            c1281010jRL = this.LJIIZILJ;
        }
        return c1281010jRL;
    }

    public final long LLIIJI() {
        InterfaceC1699150uJl interfaceC1699150uJl = this.LJIJJLI;
        if (interfaceC1699150uJl != null) {
            return ((Long) interfaceC1699150uJl.LIZ(0L, "time_diff_server_and_client")).longValue();
        }
        return 0L;
    }

    public final C1699140uJk LLIIJLIL() {
        C1699140uJk c1699140uJk = new C1699140uJk();
        String str = this.LJIILLIIL.LLLIZZ;
        InterfaceC1467950oIr interfaceC1467950oIr = this.LIZLLL;
        long j = 0;
        if (interfaceC1467950oIr != null) {
            ((C1470430oMr) interfaceC1467950oIr).LJIILIIL(0.0f, 150);
            long jLJIIJ = (((C1470430oMr) this.LIZLLL).LJIIJ(63, 0L) * 8) / 1000;
            ((C1470430oMr) this.LIZLLL).LJIIJ(72, 0L);
            ((C1470430oMr) this.LIZLLL).LJIIJ(73, 0L);
            j = jLJIIJ;
        }
        c1699140uJk.LIZ = j;
        TextUtils.equals(str, "hardware_codec");
        if (this.LJIILLIIL.k) {
            System.currentTimeMillis();
        }
        return c1699140uJk;
    }

    public final JSONObject LLILII() {
        InterfaceC1491020ou4 interfaceC1491020ou4;
        Size sizeLIZIZ;
        JSONObject jSONObject = new JSONObject();
        if (this.LJIIIZ != EnumC1487690ooh.IDLE && this.LJIIIIZZ != EnumC1487710ooj.STOPPED && (interfaceC1491020ou4 = this.c) != null && (sizeLIZIZ = interfaceC1491020ou4.LIZIZ()) != null) {
            try {
                jSONObject.put("width", sizeLIZIZ.getWidth());
                jSONObject.put("height", sizeLIZIZ.getHeight());
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("[pip_strategy], getRenderViewSize，width：");
                sbLIZ.append(sizeLIZIZ.getWidth());
                sbLIZ.append(" * ");
                sbLIZ.append(sizeLIZIZ.getHeight());
                C2188811AlT.LIZIZ(sbLIZ);
                C1698940uJQ.LIZIZ();
                return jSONObject;
            } catch (JSONException e) {
                TryCatchGuardChecker.doCheck(e);
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("getRenderViewSize json exception:");
                sbLIZ2.append(e.getMessage());
                C2188811AlT.LIZIZ(sbLIZ2);
                C1698940uJQ.LIZIZ();
            }
        }
        return jSONObject;
    }

    public final String LLILIL() {
        String strLJI = this.LJJII.LJI();
        if (this.M1 == 1 && !this.LLFFF && !this.LLFII.equals("none") && !TextUtils.equals(strLJI, "none") && !this.LLFII.equals(strLJI)) {
            this.LLJILJIL = this.LLFII;
            LiveLoggerService liveLoggerService = this.LJIILLIIL;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("fallback_external_");
            sbLIZ.append(this.LLJILJIL);
            liveLoggerService.LLLFFI = C2188811AlT.LIZIZ(sbLIZ);
            return this.LLJILJIL;
        }
        if (this.LLD != 0 || TextUtils.equals("none", this.O1)) {
            LiveLoggerService liveLoggerService2 = this.LJIILLIIL;
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("fallback_default_");
            sbLIZ2.append(strLJI);
            liveLoggerService2.LLLFFI = C2188811AlT.LIZIZ(sbLIZ2);
            return strLJI;
        }
        LiveLoggerService liveLoggerService3 = this.LJIILLIIL;
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append("keep_");
        sbLIZ3.append(this.O1);
        liveLoggerService3.LLLFFI = C2188811AlT.LIZIZ(sbLIZ3);
        return this.O1;
    }

    public final String LLILLJJLI() {
        return TextUtils.equals(this.LLJILJIL, "auto") ? !TextUtils.equals(this.LJIILLIIL.t2, "none") ? this.LJIILLIIL.t2 : this.LJJII.LJI() : this.T1;
    }

    public final int LLILLL() {
        InterfaceC1467950oIr interfaceC1467950oIr = this.LIZLLL;
        if (interfaceC1467950oIr != null) {
            return ((C1470430oMr) interfaceC1467950oIr).LJI(25, -1);
        }
        return -1;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x001e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final org.json.JSONObject LLILZ() {
        /*
            Method dump skipped, instruction units count: 1214
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.videoarch.liveplayer.VideoLiveManager.LLILZ():org.json.JSONObject");
    }

    public final String LLIZLLLIL() {
        String str;
        String[] strArrSplit = this.e.split("-");
        str = "vt";
        if (strArrSplit.length > 0 && ((HashMap) this.f448a3).size() > 0) {
            String str2 = strArrSplit[0];
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("config player tag mPlayerCreateEnterMethod is ");
            sbLIZ.append(this.e);
            sbLIZ.append(" subtag is ");
            sbLIZ.append(str2);
            sbLIZ.append("hash code: ");
            sbLIZ.append(hashCode());
            C2188811AlT.LIZIZ(sbLIZ);
            C1698940uJQ.LIZJ();
            String str3 = (String) ((HashMap) this.f448a3).get(str2);
            str = str3 != null ? str3 : "vt";
            if (TextUtils.equals(strArrSplit[strArrSplit.length - 1], "preview")) {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append(str);
                sbLIZ2.append("-p");
                return C2188811AlT.LIZIZ(sbLIZ2);
            }
        } else if (((HashMap) this.f448a3).size() > 0) {
            String str4 = (String) ((HashMap) this.f448a3).get(this.e);
            if (str4 != null) {
                return str4;
            }
        }
        return str;
    }

    public final long LLJ() {
        InterfaceC1467950oIr interfaceC1467950oIr = this.LIZLLL;
        if (interfaceC1467950oIr == null) {
            return 0L;
        }
        return ((C1470430oMr) interfaceC1467950oIr).LJIIJ(72, 0L);
    }

    public final void LLJI() {
        InterfaceC1467950oIr interfaceC1467950oIr = this.LIZLLL;
        if (interfaceC1467950oIr == null || this.LJIILLIIL == null) {
            return;
        }
        int iLJI = ((C1470430oMr) interfaceC1467950oIr).LJI(141, -1);
        if (iLJI == 0) {
            this.LJIILLIIL.LLLILZJ = "h264";
        } else if (iLJI == 1) {
            this.LJIILLIIL.LLLILZJ = "bytevc1";
        } else if (iLJI == 33) {
            this.LJIILLIIL.LLLILZJ = "bytevc2";
        }
    }

    public final int LLJIJIL() {
        int iLJJ;
        int i = this.LJIILLIIL.c0;
        if (i > 0) {
            return i;
        }
        C1698510uIj c1698510uIj = this.LJJII;
        if (c1698510uIj == null || (iLJJ = c1698510uIj.LJJ(this.LLJILJIL, this.LLJILLL)) <= 0) {
            return 0;
        }
        return iLJJ >> 16;
    }

    public final int LLJILJIL() {
        int iLJJ;
        int i = this.LJIILLIIL.b0;
        if (i > 0) {
            return i;
        }
        C1698510uIj c1698510uIj = this.LJJII;
        if (c1698510uIj == null || (iLJJ = c1698510uIj.LJJ(this.LLJILJIL, this.LLJILLL)) <= 0) {
            return 0;
        }
        return iLJJ & 65535;
    }

    public final float LLJILJILJ() {
        return this.LJJIFFI.LIZIZ();
    }

    public final Map<String, Object> LLJILLL() {
        C1698510uIj c1698510uIj = this.LJJII;
        if (c1698510uIj == null) {
            return null;
        }
        String strLJJI = c1698510uIj.LJJI(this.LLJILJIL, this.LLJILLL);
        if (TextUtils.isEmpty(strLJJI)) {
            return null;
        }
        return StrategyCenter.getInstance().getLiveWidevineSessionMetrics(strLJJI);
    }

    public final List<String> LLJJ() throws Throwable {
        ArrayList arrayList = new ArrayList();
        if (!C1699230uJt.LIZ()) {
            return arrayList;
        }
        C1699230uJt.LIZ();
        boolean zEquals = "L3".equals(C1699230uJt.LIZIZ);
        C1698510uIj c1698510uIj = this.LJJII;
        String str = this.LLJILLL;
        if (c1698510uIj.LJJII()) {
            return c1698510uIj.LIZIZ.LJIJJLI(str, zEquals);
        }
        return null;
    }

    public final boolean LLJJIJIIJIL() {
        C1698700uJ2 c1698700uJ2 = this.LLIIIJ;
        return c1698700uJ2 != null && c1698700uJ2.LJI == EnumC1699210uJr.IN_FEED && c1698700uJ2.LJIIJ == EnumC801300Vc0.SWITCHING && c1698700uJ2.LJIIIIZZ;
    }

    public final void LLJJIJIL() {
        ((HashMap) this.f448a3).put("homepage_hot", "vh");
        ((HashMap) this.f448a3).put("others_homepage", "vo");
        ((HashMap) this.f448a3).put("general_search", "vg");
        ((HashMap) this.f448a3).put("personal_homepage", "vp");
        ((HashMap) this.f448a3).put("homepage_friends", "vf");
        ((HashMap) this.f448a3).put("homepage_follow", "vw");
        ((HashMap) this.f448a3).put("collection_video", "vc");
        ((HashMap) this.f448a3).put("single_song", "vs");
        ((HashMap) this.f448a3).put("search_result", "vr");
        ((HashMap) this.f448a3).put("message", "la");
        ((HashMap) this.f448a3).put("live_merge", "lh");
        ((HashMap) this.f448a3).put("live_end", "le");
        ((HashMap) this.f448a3).put("push", "lp");
        ((HashMap) this.f448a3).put("inner_push", "li");
        ((HashMap) this.f448a3).put("live_detail", "ld");
        ((HashMap) this.f448a3).put("search", "lr");
        ((HashMap) this.f448a3).put("goods_search", "lg");
        ((HashMap) this.f448a3).put("chat", "lc");
        ((HashMap) this.f448a3).put("share", "ls");
        ((HashMap) this.f448a3).put("mall", "lm");
        C1698940uJQ.LIZIZ();
    }

    public final boolean LLJJJ() {
        if (this.LJJII.LIZLLL == 2 && TextUtils.equals(this.LJZI, "abr_bb_4live") && TextUtils.equals(this.LLJILJIL, "auto")) {
            return TextUtils.equals(this.LLJJ, "flv") || (TextUtils.equals(this.LLJJ, "cmaf") && this.f444J == 1 && this.I == 1);
        }
        return false;
    }

    public final boolean LLJJJIL() {
        C1698760uJ8 c1698760uJ8 = this.P2;
        return c1698760uJ8 != null && c1698760uJ8.LJIIJ == 1;
    }

    public final boolean LLJJJJ() {
        C1698700uJ2 c1698700uJ2 = this.LLIIIJ;
        return c1698700uJ2 != null && c1698700uJ2.LJIIJ == EnumC801300Vc0.SWITCHING;
    }

    public final boolean LLJJJJJIL() {
        return (TextUtils.equals(this.LLJJ, "flv") || TextUtils.equals(this.LLJJ, "cmaf")) && TextUtils.equals(this.LLJILJIL, "ao") && this.G2 == 1;
    }

    public final boolean LLJJJJLIIL() {
        if (!this.LJJII.LJJIII() || (C1699230uJt.LIZ() && this.K0 == 0)) {
            return true;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("drm not playable forceDisableWidevine=");
        sbLIZ.append(this.K0);
        C2188811AlT.LIZIZ(sbLIZ);
        C1698940uJQ.LIZIZ();
        return false;
    }

    public final boolean LLJJL() {
        return TextUtils.equals(this.LLJJI, "quic") || TextUtils.equals(this.LLJJI, "h2") || TextUtils.equals(this.LLJJI, "h2q");
    }

    public final boolean LLJJLIIIJLLLLLLLZ() {
        return TextUtils.equals(this.LLJJIJIIJIL, "quic") || TextUtils.equals(this.LLJJIJIIJIL, "rtm") || TextUtils.equals(this.LLJJIJIIJIL, "h2") || TextUtils.equals(this.LLJJIJIIJIL, "h2q");
    }

    public final boolean LLJL() {
        if (!this.LJJJJI) {
            LLLIILIL(true);
        }
        try {
            LoadSoLancet.LIZJ("vcbasekit");
            long jUptimeMillis = SystemClock.uptimeMillis();
            Librarian.LJFF("vcbasekit");
            LoadSoLancet.LJ(jUptimeMillis, "vcbasekit");
            LoadSoLancet.LIZLLL(jUptimeMillis, "vcbasekit");
            LoadSoLancet.LIZIZ("vcbasekit");
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C1698940uJQ.LIZJ();
        }
        if (C0TI7.LIZ("ttquic")) {
            C1698940uJQ.LIZJ();
            this.LLLLLL = true;
            this.LJIILLIIL.o1 = 1;
            return true;
        }
        C1698940uJQ.LIZJ();
        this.LLLLLL = false;
        this.LJIILLIIL.o1 = 0;
        return false;
    }

    public final void LLJZIJLIL() {
        if ((this.LJLLLLLL || this.LLJZIJLIL) && this.LLJJJJJIL == 1) {
            if (this.LLJLLL != -1) {
                this.LJIILLIIL.LJJJLL(0, (int) (System.currentTimeMillis() - this.LLJLLL), false, false);
            }
            if (this.LLJZ != -1) {
                this.LJIILLIIL.LJJJLL(0, (int) (System.currentTimeMillis() - this.LLJZ), true, false);
            }
        }
    }

    public final void LLLIL() {
        LLLLLLLZIL(this.LJJII.LJIIJJI("auto".equals(this.LLJILJIL) ? this.LJJII.LJI() : this.LLJILJIL, this.LLJJ, this.LLJILLL, this.LLJZIJLIL));
        LJJJJLI(false);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("cdn_switch, refreshed protocol for source:");
        sbLIZ.append(this.LLJILLL);
        sbLIZ.append(", suggest:");
        sbLIZ.append(this.LLJJI);
        sbLIZ.append(", transport:");
        sbLIZ.append(this.LLJJIJIIJIL);
        C2188811AlT.LIZIZ(sbLIZ);
        C1698940uJQ.LIZJ();
    }

    public final void LLLILZ() {
        Surface surface;
        SurfaceControl surfaceControl;
        Surface surface2;
        if (this.LJJIL.get()) {
            this.LJJIJIIJIL = null;
            this.LJJIJLIJ = null;
            C1698940uJQ.LIZJ();
            return;
        }
        if (C1474810oTv.LLILIL() && (surface2 = this.LJJIJLIJ) != null) {
            surface2.release();
        }
        if (Build.VERSION.SDK_INT >= 29 && (surfaceControl = this.LJJIJIIJIL) != null) {
            surfaceControl.release();
        }
        if (!C1474810oTv.LLILIL() && (surface = this.LJJIJLIJ) != null) {
            surface.release();
        }
        this.LJJIJIIJIL = null;
        this.LJJIJLIJ = null;
    }

    public final void LLLJIL() {
        if (this.LIZLLL == null || !((Boolean) C1474810oTv.V1.getValue()).booleanValue()) {
            return;
        }
        ((C1470430oMr) this.LIZLLL).LIZJ(424, 1);
    }

    public final void LLLL() {
        if (this.LLLILZLLLI == 1) {
            LiveLoggerService liveLoggerService = this.LJIILLIIL;
            if (liveLoggerService.k) {
                liveLoggerService.LJJL(3);
            }
        }
        this.LJIILLIIL.k = false;
        this.LJLLLLLL = false;
    }

    public final void LLLLIIL() {
        LiveLoggerService liveLoggerService;
        String str;
        if (this.LJIIIIZZ == EnumC1487710ooj.IDLE || (liveLoggerService = this.LJIILLIIL) == null || (str = this.LLJILJIL) == null) {
            return;
        }
        liveLoggerService.K1 = str.equals("auto") ? this.LJIILLIIL.J1 : this.LLJILJIL;
    }

    public final void LLLLJI() {
        InterfaceC1467440oI2 interfaceC1467440oI2;
        JSONObject jSONObjectLLILL = LLILL(this.LLJILJIL, this.LLJILLL);
        if (jSONObjectLLILL != null) {
            this.j0 = ((Boolean) C1486300omS.LJ(jSONObjectLLILL, "PCDNDownloadEnabled", Boolean.valueOf(this.j0 == 1))).booleanValue() ? 1 : 0;
            this.f452k0 = ((Boolean) C1486300omS.LJ(jSONObjectLLILL, "PCDNUploadEnabled", Boolean.valueOf(this.f452k0 == 1))).booleanValue() ? 1 : 0;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("schedule pcdn config dn:");
            sbLIZ.append(this.j0);
            sbLIZ.append(" up:");
            sbLIZ.append(this.f452k0);
            C2188811AlT.LIZIZ(sbLIZ);
            C1698940uJQ.LIZ();
            if (jSONObjectLLILL.has("LiveIOConfig")) {
                JSONObject jSONObjectOptJSONObject = jSONObjectLLILL.optJSONObject("LiveIOConfig");
                if (jSONObjectOptJSONObject != null) {
                    this.H = ((Integer) C1486300omS.LJ(jSONObjectOptJSONObject, "EnableLiveIO", Integer.valueOf(this.H))).intValue();
                    if (this.E && this.B && (interfaceC1467440oI2 = this.h3) != null) {
                        this.I = interfaceC1467440oI2.LJIIIIZZ(2301);
                        this.f444J = this.h3.LJIIIIZZ(2202);
                        this.L = this.h3.LJIIIIZZ(2203);
                        this.K = this.h3.LJIIIIZZ(2204);
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("[CmafConfigCenter] configLiveIO via starship: mEnableMIODemuxer=");
                        sbLIZ2.append(this.I);
                        sbLIZ2.append(", mEnableMIOCmaf=");
                        sbLIZ2.append(this.f444J);
                        sbLIZ2.append(", mEnableCmafSeamlessAO=");
                        sbLIZ2.append(this.L);
                        sbLIZ2.append(", mEnableCmafAOHint=");
                        sbLIZ2.append(this.K);
                        C2188811AlT.LIZIZ(sbLIZ2);
                        C1698940uJQ.LIZJ();
                    } else {
                        this.I = ((Integer) C1486300omS.LJ(jSONObjectOptJSONObject, "EnableMIODemuxer", Integer.valueOf(this.I))).intValue();
                        this.f444J = ((Integer) C1486300omS.LJ(jSONObjectOptJSONObject, "EnableMIOCmaf", Integer.valueOf(this.f444J))).intValue();
                        this.L = ((Integer) C1486300omS.LJ(jSONObjectOptJSONObject, "EnableCmafSeamlessAO", Integer.valueOf(this.L))).intValue();
                        this.K = ((Integer) C1486300omS.LJ(jSONObjectOptJSONObject, "EnableCmafAOHint", Integer.valueOf(this.K))).intValue();
                        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                        sbLIZ3.append("[CmafConfigCenter] configLiveIO via sdkParams: mEnableMIODemuxer=");
                        sbLIZ3.append(this.I);
                        sbLIZ3.append(", mEnableMIOCmaf=");
                        sbLIZ3.append(this.f444J);
                        sbLIZ3.append(", mEnableCmafSeamlessAO=");
                        sbLIZ3.append(this.L);
                        sbLIZ3.append(", mEnableCmafAOHint=");
                        sbLIZ3.append(this.K);
                        C2188811AlT.LIZIZ(sbLIZ3);
                        C1698940uJQ.LIZJ();
                    }
                    this.V = ((Integer) C1486300omS.LJ(jSONObjectOptJSONObject, "EnableLiveIOUseJavaThread", Integer.valueOf(this.V))).intValue();
                    this.W = ((Integer) C1486300omS.LJ(jSONObjectOptJSONObject, "EnableLiveIOLoadQuicASyn", Integer.valueOf(this.W))).intValue();
                    this.a0 = ((Integer) C1486300omS.LJ(jSONObjectOptJSONObject, "EnableLiveIOUseNewInterface", Integer.valueOf(this.a0))).intValue();
                    this.f446X = ((Integer) C1486300omS.LJ(jSONObjectOptJSONObject, "EnableLiveIONewPlay", Integer.valueOf(this.f446X))).intValue();
                    this.f447Y = ((Integer) C1486300omS.LJ(jSONObjectOptJSONObject, "EnableLiveIORetryOpt", Integer.valueOf(this.f447Y))).intValue();
                    this.Z = ((Integer) C1486300omS.LJ(jSONObjectOptJSONObject, "EnableLoadScfgInMainThread", Integer.valueOf(this.Z))).intValue();
                    this.P = ((Integer) C1486300omS.LJ(jSONObjectOptJSONObject, "EnableP2P", Integer.valueOf(this.P))).intValue();
                    this.Q = ((Integer) C1486300omS.LJ(jSONObjectOptJSONObject, "EnableHttpPrepare", Integer.valueOf(this.Q))).intValue();
                    this.R = ((Integer) C1486300omS.LJ(jSONObjectOptJSONObject, "EnableHttpReadBlock", Integer.valueOf(this.R))).intValue();
                    this.T = ((Integer) C1486300omS.LJ(jSONObjectOptJSONObject, "EnableHttpKeepOriginAgent", Integer.valueOf(this.T))).intValue();
                    this.U = ((Integer) C1486300omS.LJ(jSONObjectOptJSONObject, "EnableHttpKeepRedirectIP", Integer.valueOf(this.U))).intValue();
                    this.b0 = ((Integer) C1486300omS.LJ(jSONObjectOptJSONObject, "EnableLiveIOTimeoutInternal", Integer.valueOf(this.b0))).intValue();
                    this.d0 = ((Integer) C1486300omS.LJ(jSONObjectOptJSONObject, "HttpReadBlockDelay", Integer.valueOf(this.d0))).intValue();
                    this.c0 = ((Integer) C1486300omS.LJ(jSONObjectOptJSONObject, "LiveIOReadBuffer", Integer.valueOf(this.c0))).intValue();
                    this.f454o0 = ((Integer) C1486300omS.LJ(jSONObjectOptJSONObject, "EnableLiveIORace", Integer.valueOf(this.f454o0))).intValue();
                    this.p0 = ((Integer) C1486300omS.LJ(jSONObjectOptJSONObject, "EnableLiveIORaceIPV6First", Integer.valueOf(this.p0))).intValue();
                    this.r0 = ((Integer) C1486300omS.LJ(jSONObjectOptJSONObject, "RaceMaxNodeSize", Integer.valueOf(this.r0))).intValue();
                    this.q0 = ((Integer) C1486300omS.LJ(jSONObjectOptJSONObject, "Ipv6DegradeDelay", Integer.valueOf(this.q0))).intValue();
                    this.f0 = ((Integer) C1486300omS.LJ(jSONObjectOptJSONObject, "EnableP2pUp", Integer.valueOf(this.f0))).intValue();
                    this.t0 = ((Integer) C1486300omS.LJ(jSONObjectOptJSONObject, "GetBufferLongDelay", Integer.valueOf(this.t0))).intValue();
                    this.u0 = ((Integer) C1486300omS.LJ(jSONObjectOptJSONObject, "GetBufferShortDelay", Integer.valueOf(this.u0))).intValue();
                    this.v0 = ((Integer) C1486300omS.LJ(jSONObjectOptJSONObject, "GetBufferCacheThreshold", Integer.valueOf(this.v0))).intValue();
                    this.w0 = ((Integer) C1486300omS.LJ(jSONObjectOptJSONObject, "EnableRegisterNetwork", Integer.valueOf(this.w0))).intValue();
                    this.x0 = ((Integer) C1486300omS.LJ(jSONObjectOptJSONObject, "EnableAdvanceNotifyFinish", Integer.valueOf(this.x0))).intValue();
                    this.y0 = ((Integer) C1486300omS.LJ(jSONObjectOptJSONObject, "EnablePreSendRequest", Integer.valueOf(this.y0))).intValue();
                    this.z0 = ((Integer) C1486300omS.LJ(jSONObjectOptJSONObject, "PreSendRequestDuration", Integer.valueOf(this.z0))).intValue();
                    if (jSONObjectOptJSONObject.has("LiveIOABGroupID")) {
                        this.g0 = jSONObjectOptJSONObject.optInt("LiveIOABGroupID");
                        LiveLoggerService liveLoggerService = this.LJIILLIIL;
                        if (liveLoggerService.j5 == null) {
                            liveLoggerService.j5 = new ArrayList<>();
                        }
                        this.LJIILLIIL.j5.add(Integer.valueOf(this.g0));
                    }
                    this.O0 = ((Integer) C1486300omS.LJ(jSONObjectOptJSONObject, "PcdnIOType", Integer.valueOf(this.O0))).intValue();
                    this.V0 = ((Integer) C1486300omS.LJ(jSONObjectOptJSONObject, "EnableQuic", Integer.valueOf(this.V0))).intValue();
                    this.Z0 = ((Integer) C1486300omS.LJ(jSONObjectOptJSONObject, "LiveIOSupportPreRender", Integer.valueOf(this.Z0))).intValue();
                    this.a1 = (String) C1486300omS.LJ(jSONObjectOptJSONObject, "EnableQuicMinVersion", this.a1);
                    this.f450h0 = ((Integer) C1486300omS.LJ(jSONObjectOptJSONObject, "EnablePcdnRts", Integer.valueOf(this.f450h0))).intValue();
                    this.W0 = ((Integer) C1486300omS.LJ(jSONObjectOptJSONObject, "EnableABR", Integer.valueOf(this.W0))).intValue();
                    this.X0 = ((Integer) C1486300omS.LJ(jSONObjectOptJSONObject, "RaceUrlIndependentTLS", Integer.valueOf(this.X0))).intValue();
                    this.Y0 = ((Integer) C1486300omS.LJ(jSONObjectOptJSONObject, "TLSRaceMustGivenIps", Integer.valueOf(this.Y0))).intValue();
                    this.f451i0 = ((Integer) C1486300omS.LJ(jSONObjectOptJSONObject, "EnablePcdnSchedule", Integer.valueOf(this.f451i0))).intValue();
                    this.l0 = (String) C1486300omS.LJ(jSONObjectOptJSONObject, "LiveIOExperimentParam", this.l0);
                    this.m0 = (String) C1486300omS.LJ(jSONObjectOptJSONObject, "RaceConfig", this.m0);
                    this.n0 = (String) C1486300omS.LJ(jSONObjectOptJSONObject, "ConfigParams", this.n0);
                    StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                    sbLIZ4.append("schedule pcdn enable:");
                    sbLIZ4.append(this.f451i0);
                    C2188811AlT.LIZIZ(sbLIZ4);
                    C1698940uJQ.LIZ();
                }
                if (this.f451i0 == 1 && (this.j0 == 1 || this.f452k0 == 1)) {
                    this.H = 1;
                    this.P = 1;
                    this.Q = 1;
                    this.O0 = 8;
                    LiveLoggerService liveLoggerService2 = this.LJIILLIIL;
                    if (liveLoggerService2.j5 == null) {
                        liveLoggerService2.j5 = new ArrayList<>();
                    }
                    if (this.j0 == 1) {
                        this.g0 = 2002;
                    } else if (this.f452k0 == 1) {
                        this.g0 = 2003;
                        this.f0 = 1;
                    }
                    this.LJIILLIIL.j5.add(Integer.valueOf(this.g0));
                    StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                    sbLIZ5.append("schedule pcdn force happen, group id:");
                    sbLIZ5.append(this.g0);
                    C2188811AlT.LIZIZ(sbLIZ5);
                    C1698940uJQ.LIZ();
                }
                this.LJIILLIIL.getClass();
                this.f451i0 = 0;
                this.P = 0;
                this.f0 = 0;
                this.LJIILLIIL.q4 = "using mio";
            } else {
                this.H = 1;
                this.V = 0;
                this.V0 = 1;
                this.W0 = 1;
                this.a0 = 1;
                this.f451i0 = 0;
                this.P = 0;
                this.f0 = 0;
                this.LJIILLIIL.q4 = "using mio";
            }
            if (this.E) {
                this.x.getClass();
                this.x.getClass();
                StringBuilder sbLIZ6 = C2188811AlT.LIZ();
                sbLIZ6.append("[CmafConfigCenter] setLiveIOConfig: enableCmafStarshipConfig=true, mEnableMIODemuxer=");
                sbLIZ6.append(this.I);
                C2188811AlT.LIZIZ(sbLIZ6);
                C1698940uJQ.LIZJ();
            }
        }
    }

    public final void LLLLLZIL() {
        if (this.d3 != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("content steering startup removeCallbacks -- ");
            sbLIZ.append(this.P0);
            C2188811AlT.LIZIZ(sbLIZ);
            C1698940uJQ.LIZIZ();
            this.LJIILIIL.removeCallbacks(this.d3);
            this.d3 = null;
        }
    }

    public final void LLLLZLL() {
        InterfaceC1467950oIr interfaceC1467950oIr = this.LIZLLL;
        if (interfaceC1467950oIr == null) {
            return;
        }
        long jLJIIJ = ((C1470430oMr) interfaceC1467950oIr).LJIIJ(45, 0L);
        long jLJIIJ2 = ((C1470430oMr) this.LIZLLL).LJIIJ(46, 0L);
        LiveLoggerService liveLoggerService = this.LJIILLIIL;
        liveLoggerService.f462a3 += jLJIIJ;
        liveLoggerService.b3 += jLJIIJ2;
        long jLJIIJ3 = ((C1470430oMr) this.LIZLLL).LJIIJ(1940, 0L);
        LiveLoggerService liveLoggerService2 = this.LJIILLIIL;
        long j = liveLoggerService2.Z2;
        if (liveLoggerService2.Y2) {
            liveLoggerService2.Z2 = jLJIIJ + j;
            liveLoggerService2.d3 += jLJIIJ3;
            liveLoggerService2.j3 = jLJIIJ3 + liveLoggerService2.j3;
        } else {
            liveLoggerService2.Z2 = jLJIIJ - liveLoggerService2.LLILLL.LJJJJ;
            liveLoggerService2.d3 = jLJIIJ3 - liveLoggerService2.e3;
            liveLoggerService2.j3 = jLJIIJ3 - 0;
            liveLoggerService2.Y2 = true;
        }
        liveLoggerService2.LJLJLJ(0, ((C1470430oMr) this.LIZLLL).LJIIJ(1941, 0L), true);
        this.LJIILLIIL.LJLJLJ(1, ((C1470430oMr) this.LIZLLL).LJIIJ(1942, 0L), true);
        this.LJIILLIIL.LJLJLJ(2, ((C1470430oMr) this.LIZLLL).LJIIJ(1943, 0L), true);
    }

    public final int LLLZIL() {
        C1698500uIi c1698500uIi = this.LJJII.LIZIZ;
        if (c1698500uIi == null) {
            return 0;
        }
        return c1698500uIi.LJJLI;
    }

    public final void play() {
        LiveLoggerService liveLoggerService = this.LJIILLIIL;
        long jCurrentTimeMillis = System.currentTimeMillis();
        liveLoggerService.X1 = jCurrentTimeMillis;
        liveLoggerService.LLILLL.LIZ = jCurrentTimeMillis;
        if (liveLoggerService.LLJJJJ) {
            liveLoggerService.j4 = jCurrentTimeMillis;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("record start play time when call play:");
        sbLIZ.append(this.LJIILLIIL.LLILLL.LIZ);
        C2188811AlT.LIZIZ(sbLIZ);
        C1698940uJQ.LIZJ();
        if (C1474810oTv.LJLJLLL()) {
            this.LJJIIJ.LIZ("play");
        } else {
            LJLILLLLZI("play");
        }
        LJLIIIL();
        ((InterfaceC1470660oNE) this.LJJIIJZLJL).play(new C1699050uJb(10000));
    }

    public static Map LLIILII() {
        return StrategyCenter.getInstance().getProvisionMetrics();
    }

    public final void LJJIJLIJ() {
        InterfaceC1467950oIr interfaceC1467950oIr;
        String strLJIIIZ;
        String strLJIIIZ2;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("_resetPlayer -- ");
        sbLIZ.append(this.P0);
        C2188811AlT.LIZIZ(sbLIZ);
        C1698940uJQ.LIZJ();
        InterfaceC1467950oIr interfaceC1467950oIr2 = this.LIZLLL;
        if (interfaceC1467950oIr2 != null) {
            if (this.LLJLIL == 1 && (strLJIIIZ2 = ((C1470430oMr) interfaceC1467950oIr2).LJIIIZ(1996)) != null && !strLJIIIZ2.isEmpty() && !"{}".equals(strLJIIIZ2)) {
                try {
                    JSONObject jSONObject = new JSONObject(strLJIIIZ2);
                    Iterator<String> itKeys = jSONObject.keys();
                    while (itKeys.hasNext()) {
                        String next = itKeys.next();
                        this.LLJLL.put(next, this.LLJLL.optLong(next, 0L) + jSONObject.optLong(next, 0L));
                    }
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("accumulateRenderStallSummary parse error: ");
                    sbLIZ2.append(e.getMessage());
                    C2188811AlT.LIZIZ(sbLIZ2);
                    C1698940uJQ.LIZIZ();
                }
            }
            if (this.LLJLILLLLZIIL == 1 && (interfaceC1467950oIr = this.LIZLLL) != null && (strLJIIIZ = ((C1470430oMr) interfaceC1467950oIr).LJIIIZ(1999)) != null && !strLJIIIZ.isEmpty() && !"{}".equals(strLJIIIZ)) {
                try {
                    JSONObject jSONObject2 = new JSONObject(strLJIIIZ);
                    Iterator<String> itKeys2 = jSONObject2.keys();
                    while (itKeys2.hasNext()) {
                        String next2 = itKeys2.next();
                        this.LLJLLIL.put(next2, this.LLJLLIL.optLong(next2, 0L) + jSONObject2.optLong(next2, 0L));
                    }
                } catch (Exception e2) {
                    TryCatchGuardChecker.doCheck(e2);
                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                    sbLIZ3.append("accumulateDecodeStallSummary parse error: ");
                    sbLIZ3.append(e2.getMessage());
                    C2188811AlT.LIZIZ(sbLIZ3);
                    C1698940uJQ.LIZIZ();
                }
            }
            InterfaceC1467090oHT interfaceC1467090oHT = this.LJJIIJZLJL;
            if (interfaceC1467090oHT != null) {
                interfaceC1467090oHT.reset();
            }
            if (this.v2) {
                this.v2 = false;
            }
        }
        this.LJIIIZ = EnumC1487690ooh.INITIALIZED;
        LJIIJ(EnumC1487700ooi.IDLE);
    }

    public final void LJJJJ() {
        EnumC1487690ooh enumC1487690ooh;
        String str;
        C1698490uIh c1698490uIh;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("_stopPlayer, mPrepareState ");
        sbLIZ.append(this.LJIIIZ);
        sbLIZ.append(", mLivePlayerState ");
        sbLIZ.append(this.LJIIIIZZ);
        sbLIZ.append(" ");
        sbLIZ.append(this.LIZLLL);
        C827820Wdg.LIZ(this, "VideoLiveManager", C2188811AlT.LIZIZ(sbLIZ));
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("_stopPlayer -- ");
        sbLIZ2.append(this.P0);
        C2188811AlT.LIZIZ(sbLIZ2);
        C1698940uJQ.LIZJ();
        if (this.LIZLLL != null && ((enumC1487690ooh = this.LJIIIZ) == EnumC1487690ooh.PREPARED || enumC1487690ooh == EnumC1487690ooh.PREPARING)) {
            LiveLoggerService liveLoggerService = this.LJIILLIIL;
            if (liveLoggerService != null) {
                VideoLiveManager videoLiveManager = liveLoggerService.LLILZ;
                if (videoLiveManager != null && (c1698490uIh = liveLoggerService.LLILLL) != null) {
                    videoLiveManager.LLFZ(c1698490uIh, 8, false);
                }
                if (this.LLIILZL == 1 || this.LLIIZ == 1) {
                    LiveLoggerService liveLoggerService2 = this.LJIILLIIL;
                    LinkedBlockingQueue<Long> linkedBlockingQueue = liveLoggerService2.s3;
                    if (linkedBlockingQueue != null) {
                        linkedBlockingQueue.clear();
                        liveLoggerService2.s3 = null;
                    }
                    liveLoggerService2.u3 = -1L;
                    liveLoggerService2.v3 = -1;
                    liveLoggerService2.t3 = -1;
                }
                if (this.G && (str = this.Q0) != null) {
                    LiveLoggerService liveLoggerService3 = this.LJIILLIIL;
                    C1476650oWt c1476650oWt = C1476660oWu.LIZ;
                    c1476650oWt.LIZLLL(str, 1108);
                    liveLoggerService3.getClass();
                    LiveLoggerService liveLoggerService4 = this.LJIILLIIL;
                    c1476650oWt.LIZLLL(this.Q0, 1109);
                    liveLoggerService4.getClass();
                }
                this.LJIILLIIL.LLLJIL = ((C1470430oMr) this.LIZLLL).LJI(540, 0);
                this.LJIILLIIL.i7 = ((C1470430oMr) this.LIZLLL).LJI(1184, 0);
                this.LJIILLIIL.j7 = ((C1470430oMr) this.LIZLLL).LJI(1185, 0);
                this.LJIILLIIL.D4 = ((C1470430oMr) this.LIZLLL).LJI(567, -1);
                LiveLoggerService liveLoggerService5 = this.LJIILLIIL;
                if (liveLoggerService5.w4 == 1) {
                    liveLoggerService5.B4 = ((C1470430oMr) this.LIZLLL).LJIIIZ(1975);
                    this.LJIILLIIL.C4 = ((C1470430oMr) this.LIZLLL).LJIIIZ(1976);
                }
                LiveLoggerService liveLoggerService6 = this.LJIILLIIL;
                if (liveLoggerService6.z4 == 1) {
                    liveLoggerService6.E4 = ((C1470430oMr) this.LIZLLL).LJIIIZ(1922);
                    this.LJIILLIIL.F4 = ((C1470430oMr) this.LIZLLL).LJIIIZ(1923);
                    this.LJIILLIIL.G4 = ((C1470430oMr) this.LIZLLL).LJIIIZ(1924);
                    this.LJIILLIIL.H4 = ((C1470430oMr) this.LIZLLL).LJIIIZ(1925);
                    this.LJIILLIIL.I4 = ((C1470430oMr) this.LIZLLL).LJIIIZ(1926);
                    this.LJIILLIIL.J4 = ((C1470430oMr) this.LIZLLL).LJIIIZ(1927);
                }
                if (!this.G) {
                    LiveLoggerService liveLoggerService7 = this.LJIILLIIL;
                    if (liveLoggerService7.A4 == 1) {
                        liveLoggerService7.K4 = ((C1470430oMr) this.LIZLLL).LJIIIZ(1928);
                    }
                }
                this.LJIILLIIL.h7.LIZ += Math.max(((C1470430oMr) this.LIZLLL).LJI(40101, 0), 0);
                this.LJIILLIIL.h7.LIZIZ += Math.max(((C1470430oMr) this.LIZLLL).LJI(40102, 0), 0);
                this.LJIILLIIL.h7.LIZJ += Math.max(((C1470430oMr) this.LIZLLL).LJI(40104, 0), 0);
                this.LJIILLIIL.h7.LIZLLL += Math.max(((C1470430oMr) this.LIZLLL).LJI(40106, 0), 0);
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("updateSilenceInfo: ");
                sbLIZ3.append(this.LJIILLIIL.h7.toString());
                C2188811AlT.LIZIZ(sbLIZ3);
                C1698940uJQ.LIZJ();
                this.LJIILLIIL.v5 = ((C1470430oMr) this.LIZLLL).LJIIIZ(60006);
                StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                sbLIZ4.append("StrategyPackageInfo:");
                sbLIZ4.append(this.LJIILLIIL.v5);
                C2188811AlT.LIZIZ(sbLIZ4);
                C1698940uJQ.LIZJ();
            }
            if (this.x0 == 1) {
                LLLLLZL();
            }
            if (this.LJIIIIZZ != EnumC1487710ooj.PAUSED) {
                this.LJJIIJZLJL.stop();
                LJLLLL();
            } else {
                if (this.LIZLLL != null && this.LLZL > 0 && this.LJJJJL == 1) {
                    C1698940uJQ.LIZJ();
                    ((C1470430oMr) this.LIZLLL).LIZJ(1091, 1);
                }
                this.LJJIIJZLJL.reset();
            }
        } else if (this.x0 == 1) {
            LLLLLZL();
        }
        if (this.x0 != 1) {
            LLLLLZL();
        }
        StringBuilder sbLIZ5 = C2188811AlT.LIZ();
        sbLIZ5.append("prepareState: ");
        sbLIZ5.append(this.LJIIIZ);
        sbLIZ5.append(" to: ");
        EnumC1487690ooh enumC1487690ooh2 = EnumC1487690ooh.INITIALIZED;
        sbLIZ5.append(enumC1487690ooh2);
        sbLIZ5.append(" -- ");
        sbLIZ5.append(this.P0);
        C2188811AlT.LIZIZ(sbLIZ5);
        C1698940uJQ.LIZJ();
        this.LJIIIZ = enumC1487690ooh2;
        LJIIJ(EnumC1487700ooi.IDLE);
    }

    public final void LJJJJZI() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("changeABRDecisionState, isClose: ");
        sbLIZ.append(false);
        C2188811AlT.LIZIZ(sbLIZ);
        C1698940uJQ.LIZJ();
        if (this.f453n2 == 1 && this.w == 1) {
            this.w = 0;
            LLLLLZ(this.LLFF, this.LLF);
        }
    }

    public final void LJJLJ() {
        String strLIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("config player tag mPlayerCreateEnterMethod is ");
        sbLIZ.append(this.e);
        sbLIZ.append("hash code: ");
        sbLIZ.append(hashCode());
        C2188811AlT.LIZIZ(sbLIZ);
        C1698940uJQ.LIZJ();
        if (this.LIZLLL == null || this.d) {
            return;
        }
        String strLLIZLLLIL = LLIZLLLIL();
        if (C1474810oTv.LJLILLLLZI()) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("tag=");
            sbLIZ2.append(strLLIZLLLIL);
            sbLIZ2.append(";report=1;report_idle=1;type=live");
            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
        } else {
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("tag=");
            sbLIZ3.append(strLLIZLLLIL);
            sbLIZ3.append(";report=1;type=live");
            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ3);
        }
        StringBuilder sbLIZ4 = C2188811AlT.LIZ();
        sbLIZ4.append("config player tag to ");
        sbLIZ4.append(strLIZIZ);
        sbLIZ4.append("hash code: ");
        sbLIZ4.append(hashCode());
        C2188811AlT.LIZIZ(sbLIZ4);
        C1698940uJQ.LIZJ();
        C01GW c01gw = C1474810oTv.R1;
        if (((Number) c01gw.getValue()).intValue() > 0) {
            ((C1470430oMr) this.LIZLLL).LIZJ(44134, ((Number) c01gw.getValue()).intValue());
        }
        ((C1470430oMr) this.LIZLLL).LIZ(1746, strLIZIZ);
        this.d = true;
    }

    public final void LJJZZIII() {
        String liveSource;
        String strOptString;
        JSONArray jSONArrayOptJSONArray;
        JSONObject inFeedSwitchStats = LJLZ().getInFeedSwitchStats(this.LLIIL);
        String strOptString2 = "";
        if (inFeedSwitchStats != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("[updateInFeedSwitchStats] inFeedSwitchStats retrieved - ");
            sbLIZ.append(C786410Ut5.J3(inFeedSwitchStats));
            C2188811AlT.LIZIZ(sbLIZ);
            C1698940uJQ.LIZJ();
            if (inFeedSwitchStats.has("last_received_signal_ts")) {
                this.LLIIIJ.LJII = inFeedSwitchStats.optLong("last_received_signal_ts", 0L);
            }
            if (inFeedSwitchStats.has("signal_cnt")) {
                this.LJIILLIIL.c7.LIZ.LIZLLL = inFeedSwitchStats.optLong("signal_cnt", 0L);
            }
            if (inFeedSwitchStats.has("signal_records") && (jSONArrayOptJSONArray = inFeedSwitchStats.optJSONArray("signal_records")) != null) {
                for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
                    JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(i);
                    if (jSONObjectOptJSONObject != null) {
                        C1698670uIz c1698670uIz = new C1698670uIz();
                        c1698670uIz.LIZ = jSONObjectOptJSONObject.optString("unique_id", "");
                        c1698670uIz.LIZIZ = jSONObjectOptJSONObject.optLong("signal_receive_ts", 0L);
                        c1698670uIz.LIZJ = jSONObjectOptJSONObject.optLong("signaling_push_ts", 0L);
                        c1698670uIz.LIZLLL = jSONObjectOptJSONObject.optInt("in_feed_ind", 0) == 1 ? EnumC1699210uJr.IN_FEED : EnumC1699210uJr.IN_ROOM;
                        c1698670uIz.LJ = jSONObjectOptJSONObject.optString("switch_result", "");
                        c1698670uIz.LJFF = jSONObjectOptJSONObject.optLong("error_code", 0L);
                        c1698670uIz.LJI = jSONObjectOptJSONObject.optString("source_domain", "");
                        c1698670uIz.LJII = jSONObjectOptJSONObject.optString("target_domain", "");
                        c1698670uIz.LJIIIIZZ = jSONObjectOptJSONObject.optLong("attempt_ts", 0L);
                        c1698670uIz.LJIIIZ = jSONObjectOptJSONObject.optLong("success_ts", 0L);
                        c1698670uIz.LJIIJ = jSONObjectOptJSONObject.optLong("fail_ts", 0L);
                        c1698670uIz.LJIIJJI = jSONObjectOptJSONObject.optString("ignore_reason", "");
                        if (LJLIIL(c1698670uIz.LIZ) == null) {
                            ((ArrayList) this.LLIIIILZ).add(c1698670uIz);
                        }
                    }
                }
            }
        }
        String strLJIILIIL = this.LJJII.LJIILIIL();
        if (strLJIILIIL == null || strLJIILIIL.isEmpty()) {
            C1698940uJQ.LIZJ();
            liveSource = "main";
        } else {
            liveSource = LJLZ().getLiveSource(strLJIILIIL);
        }
        if (inFeedSwitchStats != null) {
            strOptString = inFeedSwitchStats.optString("active_unique_id", "");
            strOptString2 = inFeedSwitchStats.optString("active_target_source", "");
        } else {
            strOptString = "";
        }
        if (TextUtils.isEmpty(strOptString) || !TextUtils.equals(strOptString2, "backup") || !TextUtils.equals(liveSource, "backup")) {
            this.LLJILLL = "main";
            return;
        }
        if (this.LJJII != null && !TextUtils.isEmpty(this.LLJILJIL)) {
            String strLJI = TextUtils.equals("auto", this.LLJILJIL) ? this.LJJII.LJI() : this.LLJILJIL;
            if (!TextUtils.isEmpty(strLJI)) {
                if (!TextUtils.isEmpty(this.LJJII.LJIJJ(strLJI, "backup")) && (!TextUtils.isEmpty(this.LJJII.LJIIJJI(strLJI, r6, "backup", this.LLJZIJLIL)))) {
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("[decideInitialPlaySource] in-feed switch attempt - starting on backup, active_unique_id=");
                    sbLIZ2.append(strOptString);
                    C2188811AlT.LIZIZ(sbLIZ2);
                    C1698940uJQ.LIZJ();
                    this.LLJILLL = "backup";
                    this.LLIIIJ.LJIIIZ = System.currentTimeMillis();
                    C1698700uJ2 c1698700uJ2 = this.LLIIIJ;
                    c1698700uJ2.LJI = EnumC1699210uJr.IN_FEED;
                    c1698700uJ2.LJIIJ = EnumC801300Vc0.SWITCHING;
                    c1698700uJ2.LJIIJJI = EnumC1699200uJq.SIGNAL_INITIATED;
                    c1698700uJ2.LJIIIIZZ = true;
                    c1698700uJ2.LJIILIIL = strOptString;
                    C1698670uIz c1698670uIzLJLIIL = LJLIIL(strOptString);
                    if (c1698670uIzLJLIIL != null) {
                        this.LLIIIJ.LJIILJJIL = c1698670uIzLJLIIL.LIZJ;
                        return;
                    }
                    return;
                }
            }
        }
        C1698940uJQ.LIZJ();
        this.LLJILLL = "main";
        C1698670uIz c1698670uIzLJLIIL2 = LJLIIL(strOptString);
        if (c1698670uIzLJLIIL2 == null || c1698670uIzLJLIIL2.LJIIIZ != 0) {
            return;
        }
        c1698670uIzLJLIIL2.LJ = "ignore";
        c1698670uIzLJLIIL2.LJIIJJI = "no_effective_switch";
    }

    public final long LJLJLLL() {
        String strLJLLL = LJLLL();
        long longValue = 0;
        if (TextUtils.isEmpty(strLJLLL)) {
            return 0L;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        long j = jCurrentTimeMillis - ((long) this.D2);
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("connectionId", strLJLLL);
            jSONObject.put("startTime", j);
            jSONObject.put("stopTime", jCurrentTimeMillis);
            longValue = (LJLZ().getLongValue(57011, C786410Ut5.J3(jSONObject), 0L) * 8) / 1000;
            return longValue;
        } catch (JSONException e) {
            TryCatchGuardChecker.doCheck(e);
            return longValue;
        }
    }

    public final String LJLLJ() {
        C1698940uJQ.LIZJ();
        if (C2093608Ic.LJ(this.z)) {
            C1698510uIj c1698510uIj = this.LJJII;
            String strLIZIZ = null;
            String strLJIILL = c1698510uIj != null ? c1698510uIj.LJIILL() : null;
            String str = this.LLIIL;
            ConfigCenter configCenter = ConfigCenter.LIZIZ;
            if (str != null && !str.isEmpty() && strLJIILL != null && !strLJIILL.isEmpty()) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(str);
                sbLIZ.append("*");
                sbLIZ.append(strLJIILL);
                strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            }
            this.z = strLIZIZ;
            if (C2093608Ic.LJ(strLIZIZ)) {
                this.z = UUID.randomUUID().toString();
            }
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("[ConfigCenter] getConfigUniqueId create new uniqueId=");
            sbLIZ2.append(this.z);
            C2188811AlT.LIZIZ(sbLIZ2);
            C1698940uJQ.LIZJ();
        }
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append("[ConfigCenter] getConfigUniqueId uniqueId=");
        sbLIZ3.append(this.z);
        C2188811AlT.LIZIZ(sbLIZ3);
        C1698940uJQ.LIZJ();
        return this.z;
    }

    public final JSONObject LLF() {
        String strLJLLL = LJLLL();
        if (TextUtils.isEmpty(strLJLLL)) {
            return null;
        }
        String stringValue = LJLZ().getStringValue(57012, strLJLLL);
        if (TextUtils.isEmpty(stringValue)) {
            return null;
        }
        try {
            return new JSONObject(stringValue);
        } catch (JSONException e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }

    public final EnumC1487710ooj LLFFF() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("getLivePlayerState: ");
        sbLIZ.append(this.LJIIIIZZ);
        C2188811AlT.LIZIZ(sbLIZ);
        C1698940uJQ.LIZJ();
        return this.LJIIIIZZ;
    }

    public final String LLILLIZIL() {
        JSONObject jSONObjectLLF = LLF();
        if (jSONObjectLLF == null) {
            return "";
        }
        if (C1474810oTv.LLILII()) {
            StringBuilder sb = new StringBuilder(192);
            sb.append("{\"cctk_bw\":");
            sb.append((jSONObjectLLF.optInt("cctk_bw", 0) / LSPassThroughRecordSizeConfig.DEFAULT) * 8);
            sb.append(",\"cctk_plr\":");
            sb.append(jSONObjectLLF.optInt("cctk_plr", 0));
            sb.append(",\"cctk_srtt\":");
            sb.append(jSONObjectLLF.optInt("cctk_srtt", 0) / LSPassThroughRecordSizeConfig.DEFAULT);
            sb.append(",\"cctk_send_ts\":");
            sb.append(jSONObjectLLF.optInt("cctk_stmp", 0) / LSPassThroughRecordSizeConfig.DEFAULT);
            sb.append(",\"cctk_recv_ts\":");
            sb.append(jSONObjectLLF.optInt("timestamp", 0));
            sb.append(",\"cctk_rttv\":");
            sb.append(jSONObjectLLF.optInt("cctk_rttv", 0) / LSPassThroughRecordSizeConfig.DEFAULT);
            sb.append(",\"cctk_srate\":");
            sb.append((jSONObjectLLF.optInt("cctk_srate", 0) / LSPassThroughRecordSizeConfig.DEFAULT) * 8);
            sb.append(",\"cctk_rrate\":");
            sb.append((jSONObjectLLF.optInt("cctk_rrate", 0) / LSPassThroughRecordSizeConfig.DEFAULT) * 8);
            sb.append(",\"cctk_irate\":");
            sb.append((jSONObjectLLF.optInt("cctk_irate", 0) / LSPassThroughRecordSizeConfig.DEFAULT) * 8);
            sb.append(",\"cctk_blen\":");
            sb.append(jSONObjectLLF.optInt("cctk_blen", 0));
            sb.append("}");
            return sb.toString();
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("");
        sbLIZ.append("{\"cctk_bw\":");
        sbLIZ.append((jSONObjectLLF.optInt("cctk_bw", 0) / LSPassThroughRecordSizeConfig.DEFAULT) * 8);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append(strLIZIZ);
        sbLIZ2.append(",\"cctk_plr\":");
        sbLIZ2.append(jSONObjectLLF.optInt("cctk_plr", 0));
        String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ2);
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append(strLIZIZ2);
        sbLIZ3.append(",\"cctk_srtt\":");
        sbLIZ3.append(jSONObjectLLF.optInt("cctk_srtt", 0) / LSPassThroughRecordSizeConfig.DEFAULT);
        String strLIZIZ3 = C2188811AlT.LIZIZ(sbLIZ3);
        StringBuilder sbLIZ4 = C2188811AlT.LIZ();
        sbLIZ4.append(strLIZIZ3);
        sbLIZ4.append(",\"cctk_send_ts\":");
        sbLIZ4.append(jSONObjectLLF.optInt("cctk_stmp", 0) / LSPassThroughRecordSizeConfig.DEFAULT);
        String strLIZIZ4 = C2188811AlT.LIZIZ(sbLIZ4);
        StringBuilder sbLIZ5 = C2188811AlT.LIZ();
        sbLIZ5.append(strLIZIZ4);
        sbLIZ5.append(",\"cctk_recv_ts\":");
        sbLIZ5.append(jSONObjectLLF.optInt("timestamp", 0));
        String strLIZIZ5 = C2188811AlT.LIZIZ(sbLIZ5);
        StringBuilder sbLIZ6 = C2188811AlT.LIZ();
        sbLIZ6.append(strLIZIZ5);
        sbLIZ6.append(",\"cctk_rttv\":");
        sbLIZ6.append(jSONObjectLLF.optInt("cctk_rttv", 0) / LSPassThroughRecordSizeConfig.DEFAULT);
        String strLIZIZ6 = C2188811AlT.LIZIZ(sbLIZ6);
        StringBuilder sbLIZ7 = C2188811AlT.LIZ();
        sbLIZ7.append(strLIZIZ6);
        sbLIZ7.append(",\"cctk_srate\":");
        sbLIZ7.append((jSONObjectLLF.optInt("cctk_srate", 0) / LSPassThroughRecordSizeConfig.DEFAULT) * 8);
        String strLIZIZ7 = C2188811AlT.LIZIZ(sbLIZ7);
        StringBuilder sbLIZ8 = C2188811AlT.LIZ();
        sbLIZ8.append(strLIZIZ7);
        sbLIZ8.append(",\"cctk_rrate\":");
        sbLIZ8.append((jSONObjectLLF.optInt("cctk_rrate", 0) / LSPassThroughRecordSizeConfig.DEFAULT) * 8);
        String strLIZIZ8 = C2188811AlT.LIZIZ(sbLIZ8);
        StringBuilder sbLIZ9 = C2188811AlT.LIZ();
        sbLIZ9.append(strLIZIZ8);
        sbLIZ9.append(",\"cctk_irate\":");
        sbLIZ9.append((jSONObjectLLF.optInt("cctk_irate", 0) / LSPassThroughRecordSizeConfig.DEFAULT) * 8);
        String strLIZIZ9 = C2188811AlT.LIZIZ(sbLIZ9);
        StringBuilder sbLIZ10 = C2188811AlT.LIZ();
        sbLIZ10.append(strLIZIZ9);
        sbLIZ10.append(",\"cctk_blen\":");
        sbLIZ10.append(jSONObjectLLF.optInt("cctk_blen", 0));
        String strLIZIZ10 = C2188811AlT.LIZIZ(sbLIZ10);
        StringBuilder sbLIZ11 = C2188811AlT.LIZ();
        sbLIZ11.append(strLIZIZ10);
        sbLIZ11.append("}");
        return C2188811AlT.LIZIZ(sbLIZ11);
    }

    public final void LLLILZLLLI() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("reset, ");
        sbLIZ.append(this.LIZLLL);
        C827820Wdg.LIZ(this, "VideoLiveManager", C2188811AlT.LIZIZ(sbLIZ));
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("reset -- ");
        sbLIZ2.append(this.P0);
        C2188811AlT.LIZIZ(sbLIZ2);
        C1698940uJQ.LIZJ();
        if (this.LIZLLL == null) {
            return;
        }
        EnumC1487710ooj enumC1487710ooj = this.LJIIIIZZ;
        if (enumC1487710ooj == EnumC1487710ooj.PLAYED || enumC1487710ooj == EnumC1487710ooj.PAUSED || enumC1487710ooj == EnumC1487710ooj.PREPARING) {
            this.LJIILLIIL.LJLJJI(1);
        }
        LJJIJL("reset");
        this.LJIILLIIL.LJJZ();
        this.s0.LIZ();
        this.LLIIL = null;
        this.LJJIJIIJI = null;
        this.LJLLI = null;
        this.LJLL = null;
        this.LJLZ = false;
        this.LJZ = false;
        this.LLZLI = false;
        this.LLI = true;
        this.LJJI.LIZ.set(false);
        this.LLJILJIL = "origin";
        this.LLJILJILJ = -1;
        this.LLJJ = "flv";
        this.LLJJIJIIJIL = "tcp";
        this.LLJJI = "none";
        this.LLJJIII = "none";
        this.LLJILLL = "main";
        this.LJLIL = -1;
        this.LJJJI = false;
        this.LJJJIL = false;
        this.K2 = false;
        this.LLLLLZL = 0;
        SurfaceHolderCallbackC1471310oOH surfaceHolderCallbackC1471310oOH = this.LJJIIZI;
        if (surfaceHolderCallbackC1471310oOH != null) {
            SurfaceHolder surfaceHolder = this.LJJIIZ;
            if (surfaceHolder != null) {
                surfaceHolder.removeCallback(surfaceHolderCallbackC1471310oOH);
            }
            WeakReference<VideoLiveManager> weakReference = this.LJJIIZI.LL;
            if (weakReference != null) {
                weakReference.clear();
            }
        }
        this.LJJIIZ = null;
        this.LJJIIZI = null;
        this.LLD = 1;
        this.LJJIJ = null;
        this.LJII = EnumC1487700ooi.IDLE;
        this.LJIILLIIL.m5 = "none";
        this.j3 = false;
        this.k1 = 1;
        this.LJJLJ = 0;
        this.LJJLJLI = false;
        this.LJJZ = 0;
        this.LJJLL = -1;
        if (((Boolean) C1474810oTv.T1.getValue()).booleanValue()) {
            this.d = false;
        }
        if (C1474810oTv.LJLJLLL()) {
            this.LJJIII.LIZ();
        }
    }

    public final void LLLIZZ() {
        C1698940uJQ.LIZJ();
        this.LJJLJ = 0;
        ((C1470430oMr) this.LIZLLL).LIZJ(196, 0);
        ((C1470430oMr) this.LIZLLL).LIZJ(587, 0);
        ((C1470430oMr) this.LIZLLL).LIZJ(42524, 0);
        ((C1470430oMr) this.LIZLLL).LIZJ(42520, 0);
        ((C1470430oMr) this.LIZLLL).LIZJ(42521, 0);
        ((C1470430oMr) this.LIZLLL).LIZJ(42523, 0);
        ((C1470430oMr) this.LIZLLL).LIZJ(42522, 0);
    }

    public final JSONObject LLLLIIIILLL() {
        JSONObject jSONObject;
        C1698940uJQ.LIZJ();
        StrategyStartupGearInfo.GearRequest gearRequest = new StrategyStartupGearInfo.GearRequest();
        String strLJIIJJI = this.LJJII.LJIIJJI(TextUtils.equals(this.LLJILJIL, "auto") ? this.LJJII.LJI() : this.LLJILJIL, this.LLJJ, this.LLJILLL, this.LLJZIJLIL);
        String str = this.LLJILLL;
        gearRequest.mLevel = str;
        gearRequest.mAbrBitrateInfoMap = this.LJJII.LIZIZ(21, str, true);
        gearRequest.mAbrGearToResolutionMap = this.LJJII.LIZJ();
        C1698510uIj c1698510uIj = this.LJJII;
        gearRequest.mAbrRtBitrateInfoMap = !c1698510uIj.LJJII() ? null : c1698510uIj.LIZIZ.LJI();
        C1698510uIj c1698510uIj2 = this.LJJII;
        gearRequest.mAbrRtBitrateTsMap = !c1698510uIj2.LJJII() ? null : c1698510uIj2.LIZIZ.LJIJ;
        C1698510uIj c1698510uIj3 = this.LJJII;
        gearRequest.mAbrRtBitrateStdMap = !c1698510uIj3.LJJII() ? null : c1698510uIj3.LIZIZ.LJIJI;
        C1698510uIj c1698510uIj4 = this.LJJII;
        gearRequest.mAbrRtBitratePctMap = !c1698510uIj4.LJJII() ? null : c1698510uIj4.LIZIZ.LJIJJ;
        C1698510uIj c1698510uIj5 = this.LJJII;
        if (c1698510uIj5.LJJII()) {
            jSONObject = c1698510uIj5.LIZIZ.LJIJJLI;
            if (jSONObject == null) {
                jSONObject = new JSONObject();
            }
        } else {
            jSONObject = null;
        }
        gearRequest.mAbrGearToSizeMap = jSONObject;
        gearRequest.mUserCount = this.LJJII.LJIL();
        gearRequest.mHost = C1286540jaG.LIZJ(strLJIIJJI);
        gearRequest.mIsHorizontalScreen = this.LJJII.LJII();
        gearRequest.mIsPreview = this.LJIILLIIL.LLJJJJ ? 1 : 0;
        C1698510uIj c1698510uIj6 = this.LJJII;
        gearRequest.mPushResolution = !c1698510uIj6.LJJII() ? 0 : c1698510uIj6.LIZIZ.LJJJJJL;
        gearRequest.mNeptuneName = this.LJJII.LJIIIZ();
        gearRequest.mDefaultResolution = this.LJJII.LJI();
        gearRequest.mEnableProbeStartupBitrate = this.L1 == 1;
        gearRequest.mEnableBandwidthEstimationStrategy = this.o2 == 1;
        gearRequest.mStartupStrategyInputParams = this.m1;
        gearRequest.mbandwidthEstimationStrategyInputParams = this.n1;
        gearRequest.mRoomId = this.LLIIL;
        gearRequest.mStreamName = this.LJJII.LJIJ();
        gearRequest.mCdnName = LJLLI();
        gearRequest.mCallType = this.LJIILLIIL.L5 > 0 ? 1 : 0;
        if (C1474810oTv.LJLJLLL()) {
            gearRequest.mSessionID = this.LJJIII.LIZIZ;
        } else {
            gearRequest.mSessionID = this.LLIIJLIL;
        }
        gearRequest.mEnableGetCybertronVrtbitrate = this.r1 == 1;
        C1698510uIj c1698510uIj7 = this.LJJII;
        gearRequest.mLatestVrtbitrateTs = !c1698510uIj7.LJJII() ? -1L : c1698510uIj7.LIZIZ.LJJL;
        gearRequest.mEnableStartupRetry = this.o1 == 1 && !this.j3;
        gearRequest.mStartupRetryInterval = this.q1;
        gearRequest.mStartupRetryLimitCount = this.f455p1;
        gearRequest.mStartupRetryListener = new ILiveStartupRetryListener(this) { // from class: X.0ood
            public final WeakReference<VideoLiveManager> LIZ;

            {
                this.LIZ = new WeakReference<>(this);
            }

            @Override // com.bytedance.vcloud.strategy.ILiveStartupRetryListener
            public final boolean onStartupRetryResultCallback(StrategyStartupGearInfo.GearResponse gearResponse) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("[StartupRetry] onStartupRetryResultCallback:");
                sbLIZ.append(gearResponse.mRoomId);
                C2188811AlT.LIZIZ(sbLIZ);
                C1698940uJQ.LIZJ();
                VideoLiveManager videoLiveManager = this.LIZ.get();
                if (videoLiveManager == null) {
                    C1698940uJQ.LIZJ();
                    return false;
                }
                if (videoLiveManager.j3) {
                    C1698940uJQ.LIZJ();
                    return false;
                }
                if (videoLiveManager.LJIIIZ() == EnumC1487700ooi.IDLE) {
                    C1698940uJQ.LIZJ();
                    return false;
                }
                ARunnableS92S0200000_23 aRunnableS92S0200000_23 = new ARunnableS92S0200000_23(videoLiveManager, gearResponse, 34);
                try {
                    BPEAHandler bPEAHandler = videoLiveManager.LJIILIIL;
                    if (bPEAHandler != null) {
                        C786410Ut5.LJJZZIII(bPEAHandler, aRunnableS92S0200000_23);
                    } else {
                        C822650WOx c822650WOx = videoLiveManager.D0;
                        if (c822650WOx != null && !c822650WOx.isShutdown()) {
                            videoLiveManager.D0.submit(aRunnableS92S0200000_23);
                        } else {
                            aRunnableS92S0200000_23.run();
                        }
                    }
                    return true;
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("submitRunnablePreferHandler exception, message=");
                    sbLIZ2.append(e.getMessage());
                    C2188811AlT.LIZIZ(sbLIZ2);
                    C1698940uJQ.LJ();
                    return true;
                }
            }
        };
        gearRequest.mConfigUniqueId = LJLLJ();
        if (this.t1 == 1) {
            JSONObject jSONObject2 = new JSONObject();
            C1698510uIj c1698510uIj8 = this.LJJII;
            if (c1698510uIj8 != null && c1698510uIj8.LJJIFFI("origin")) {
                C1698510uIj c1698510uIj9 = this.LJJII;
                C1698840uJG c1698840uJGLJIJJ = !c1698510uIj9.LJJII() ? null : c1698510uIj9.LIZIZ.LJIJJ("origin", this.LLJILLL);
                try {
                    jSONObject2.put("width", c1698840uJGLJIJJ.LIZ);
                    jSONObject2.put("height", c1698840uJGLJIJJ.LIZIZ);
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("[pip_strategy], getPushVideoSize, width:");
                    sbLIZ.append(c1698840uJGLJIJJ.LIZ);
                    sbLIZ.append(" * ");
                    sbLIZ.append(c1698840uJGLJIJJ.LIZIZ);
                    C2188811AlT.LIZIZ(sbLIZ);
                    C1698940uJQ.LIZIZ();
                } catch (JSONException e) {
                    TryCatchGuardChecker.doCheck(e);
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("getPushVideoSize json exception:");
                    sbLIZ2.append(e.getMessage());
                    C2188811AlT.LIZIZ(sbLIZ2);
                    C1698940uJQ.LIZIZ();
                }
            }
            gearRequest.mOriginResolution = jSONObject2;
            if (!TextUtils.isEmpty(C1474810oTv.LLFII())) {
                try {
                    gearRequest.mPageLayoutRatio = new JSONObject(C1474810oTv.LLFII());
                } catch (JSONException e2) {
                    TryCatchGuardChecker.doCheck(e2);
                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                    sbLIZ3.append("addPipInfoForStartupIfNeeded json exception:");
                    sbLIZ3.append(e2.getMessage());
                    C2188811AlT.LIZIZ(sbLIZ3);
                    C1698940uJQ.LIZIZ();
                }
            }
            gearRequest.mRenderViewSize = LLILII();
            gearRequest.mEnterMethod = this.LJIILLIIL.LLJILLL;
            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
            sbLIZ4.append("[pip_strategy], addPipInfoForStartupIfNeeded, mOriginResolution:");
            sbLIZ4.append(gearRequest.mOriginResolution);
            sbLIZ4.append(", LivePageLayoutRatio:");
            sbLIZ4.append(C1474810oTv.LLFII());
            sbLIZ4.append(", EnterMethod:");
            sbLIZ4.append(gearRequest.mEnterMethod);
            sbLIZ4.append(", RenderViewResolution:");
            sbLIZ4.append(gearRequest.mRenderViewSize);
            C2188811AlT.LIZIZ(sbLIZ4);
            C1698940uJQ.LIZIZ();
        }
        this.LJJII.LIZIZ(23, this.LLJILLL, true);
        C1698510uIj c1698510uIj10 = this.LJJII;
        JSONObject jSONObjectLJI = !c1698510uIj10.LJJII() ? null : c1698510uIj10.LIZIZ.LJI();
        if (jSONObjectLJI == null || jSONObjectLJI.length() <= 0) {
            LiveLoggerService liveLoggerService = this.LJIILLIIL;
            Objects.requireNonNull(liveLoggerService);
            liveLoggerService.S0 = -2;
        } else {
            LiveLoggerService liveLoggerService2 = this.LJIILLIIL;
            Objects.requireNonNull(liveLoggerService2);
            liveLoggerService2.S0 = 0;
            this.LJIILLIIL.T0 = System.currentTimeMillis();
            long jLLIIJI = LLIIJI();
            if (jLLIIJI != 0) {
                LiveLoggerService liveLoggerService3 = this.LJIILLIIL;
                liveLoggerService3.U0 = liveLoggerService3.T0 + jLLIIJI;
            }
        }
        StrategyStartupGearInfo.GearResponse liveStartupBitrateResult = LJLZ().getLiveStartupBitrateResult(gearRequest);
        C1698940uJQ.LIZJ();
        if (liveStartupBitrateResult == null) {
            return null;
        }
        LLLZIIL(liveStartupBitrateResult, false);
        JSONObject jSONObject3 = liveStartupBitrateResult.mStrategyLog;
        if (jSONObject3 != null) {
            C786410Ut5.J3(jSONObject3);
            C1698940uJQ.LIZJ();
        }
        return liveStartupBitrateResult.mStrategyLog;
    }

    public final void LLLLIL() {
        String str = C1474810oTv.LJLJLLL() ? this.LJJIII.LIZIZ : this.LJIILLIIL.LLLLZLLLI;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("set setFeatureDataBundleWithUniqueId with ");
        sbLIZ.append(this.LLIIL);
        sbLIZ.append("--");
        sbLIZ.append(this.P0);
        sbLIZ.append("--");
        sbLIZ.append(str);
        C2188811AlT.LIZIZ(sbLIZ);
        C1698940uJQ.LIZJ();
        StrategyCenter.getInstance().addLiveMediaSessionBundle(this.LLIIL, str, this.B1);
        this.LJIILLIIL.G6 = this.LLIIL;
    }

    public final boolean LLLLLLZZ() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("shouldUseSurfaceControl, preview:");
        sbLIZ.append(this.LJIILLIIL.LLJJJJ);
        sbLIZ.append(", surface control:1 , all surface control:");
        sbLIZ.append(this.LJJJ);
        C2188811AlT.LIZIZ(sbLIZ);
        C1698940uJQ.LIZJ();
        if (Build.VERSION.SDK_INT < 29) {
            return false;
        }
        return this.LJIILLIIL.LLJJJJ || this.LJJJ == 1;
    }

    public final void LLLLLZL() {
        String str;
        JSONObject jSONObject;
        String[] strArrSplit;
        C1698940uJQ.LIZJ();
        C1698770uJ9 c1698770uJ9 = this.LJJIII;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("[VVSessionIdRefactor] stopLiveIO:");
        sbLIZ.append(this.Q0);
        sbLIZ.append(", equals: ");
        sbLIZ.append(TextUtils.equals(this.LJJIII.LIZLLL, this.Q0));
        c1698770uJ9.LIZIZ(C2188811AlT.LIZIZ(sbLIZ));
        if (!this.G || (str = this.Q0) == null) {
            return;
        }
        if (this.LJIILLIIL.LLJJJJ) {
            C1476660oWu.LIZ.LJII(1006, str, -1L);
        }
        String str2 = this.Q0;
        if (str2 != null) {
            C1476650oWt c1476650oWt = C1476660oWu.LIZ;
            long jLIZLLL = c1476650oWt.LIZLLL(str2, 1124);
            long jLIZLLL2 = c1476650oWt.LIZLLL(this.Q0, 1125);
            long jLIZLLL3 = c1476650oWt.LIZLLL(this.Q0, 1155);
            long jLIZLLL4 = c1476650oWt.LIZLLL(this.Q0, 1147);
            long jLIZLLL5 = c1476650oWt.LIZLLL(this.Q0, 1148);
            this.LJIILLIIL.S5 = c1476650oWt.LIZLLL(this.Q0, 1160);
            this.LJIILLIIL.T5 = c1476650oWt.LJ(this.Q0, 1161);
            long j = 0;
            if (jLIZLLL >= 0) {
                this.LJIILLIIL.N5 += jLIZLLL;
                j = 0;
            }
            if (jLIZLLL2 >= j) {
                this.LJIILLIIL.O5 += jLIZLLL2;
            }
            if (jLIZLLL3 >= j) {
                this.LJIILLIIL.P5 += jLIZLLL3;
            }
            if (jLIZLLL4 >= j) {
                this.LJIILLIIL.Q5 += jLIZLLL4;
            }
            if (jLIZLLL5 >= j) {
                this.LJIILLIIL.R5 += jLIZLLL5;
            }
        }
        if (this.P == 1 && this.f0 == 1 && this.g0 == 2002) {
            long jLIZLLL6 = C1476660oWu.LIZ.LIZLLL(this.Q0, 1129);
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("get liveio runtime group id: ");
            sbLIZ2.append(jLIZLLL6);
            C2188811AlT.LIZIZ(sbLIZ2);
            C1698940uJQ.LIZJ();
            if (jLIZLLL6 != -1) {
                this.LJIILLIIL.j5.clear();
                this.LJIILLIIL.j5.add(Integer.valueOf((int) jLIZLLL6));
            }
        }
        LiveLoggerService liveLoggerService = this.LJIILLIIL;
        if (liveLoggerService.A4 == 1) {
            liveLoggerService.K4 = C1476660oWu.LIZ.LJ(this.Q0, 1167);
        }
        LiveLoggerService liveLoggerService2 = this.LJIILLIIL;
        C1476650oWt c1476650oWt2 = C1476660oWu.LIZ;
        liveLoggerService2.s4 = c1476650oWt2.LIZLLL(this.Q0, 1301);
        if (TextUtils.equals(this.LLJJ, "cmaf") && this.f444J == 1 && this.I == 1) {
            LiveLoggerService liveLoggerService3 = this.LJIILLIIL;
            liveLoggerService3.getClass();
            String strLJ = c1476650oWt2.LJ(liveLoggerService3.LLILZ.Q0, 1302);
            if (strLJ != null) {
                jSONObject = new JSONObject();
                try {
                    strArrSplit = strLJ.split(":");
                } catch (JSONException e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                if (strArrSplit.length < 13) {
                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                    sbLIZ3.append("cmafSegmentLogs length is illegal, should be at least 13, but real is ");
                    sbLIZ3.append(strArrSplit.length);
                    C2188811AlT.LIZIZ(sbLIZ3);
                    C1698940uJQ.LJ();
                    jSONObject = null;
                    liveLoggerService3.t4 = jSONObject;
                    LiveLoggerService liveLoggerService4 = this.LJIILLIIL;
                    C1476650oWt c1476650oWt3 = C1476660oWu.LIZ;
                    liveLoggerService4.f473u4 = c1476650oWt3.LJ(this.Q0, 1303);
                    this.LJIILLIIL.N3 = c1476650oWt3.LJ(this.Q0, 1305);
                    this.LJIILLIIL.v4 = c1476650oWt3.LJ(this.Q0, 1317);
                } else {
                    jSONObject.put("cmaf_segment_total_count", CastLongProtector.parseLong(strArrSplit[0]));
                    jSONObject.put("cmaf_segment_reuse_sum", CastLongProtector.parseLong(strArrSplit[1]));
                    jSONObject.put("cmaf_segment_success_sum", CastLongProtector.parseLong(strArrSplit[2]));
                    jSONObject.put("cmaf_segment_data_interval_sum", CastLongProtector.parseLong(strArrSplit[3]));
                    jSONObject.put("cmaf_segment_frame_interval_sum", CastLongProtector.parseLong(strArrSplit[4]));
                    jSONObject.put("cmaf_segment_cache_hit_sum", CastLongProtector.parseLong(strArrSplit[5]));
                    jSONObject.put("cmaf_segment_racing_count", CastLongProtector.parseLong(strArrSplit[6]));
                    jSONObject.put("cmaf_segment_racing_interval_sum", CastLongProtector.parseLong(strArrSplit[7]));
                    jSONObject.put("cmaf_segment_stall_time", CastLongProtector.parseLong(strArrSplit[8]));
                    jSONObject.put("cmaf_segment_count_without_mediafirst", CastLongProtector.parseLong(strArrSplit[9]));
                    jSONObject.put("cmaf_segment_jmpd_success_sum", CastLongProtector.parseLong(strArrSplit[10]));
                    jSONObject.put("cmaf_segment_downloaded_sum", CastLongProtector.parseLong(strArrSplit[11]));
                    jSONObject.put("cmaf_segment_segment_merge_success_sum", CastLongProtector.parseLong(strArrSplit[12]));
                    liveLoggerService3.t4 = jSONObject;
                    LiveLoggerService liveLoggerService42 = this.LJIILLIIL;
                    C1476650oWt c1476650oWt32 = C1476660oWu.LIZ;
                    liveLoggerService42.f473u4 = c1476650oWt32.LJ(this.Q0, 1303);
                    this.LJIILLIIL.N3 = c1476650oWt32.LJ(this.Q0, 1305);
                    this.LJIILLIIL.v4 = c1476650oWt32.LJ(this.Q0, 1317);
                }
            } else {
                jSONObject = null;
                liveLoggerService3.t4 = jSONObject;
                LiveLoggerService liveLoggerService422 = this.LJIILLIIL;
                C1476650oWt c1476650oWt322 = C1476660oWu.LIZ;
                liveLoggerService422.f473u4 = c1476650oWt322.LJ(this.Q0, 1303);
                this.LJIILLIIL.N3 = c1476650oWt322.LJ(this.Q0, 1305);
                this.LJIILLIIL.v4 = c1476650oWt322.LJ(this.Q0, 1317);
            }
        }
        this.LJIILLIIL.LJLJJI(2);
        C1476650oWt c1476650oWt4 = C1476660oWu.LIZ;
        String str3 = this.Q0;
        if (c1476650oWt4.LIZJ) {
            LiveIOManager.getInstance().removeLiveEngineCallback(str3);
        }
        String str4 = this.Q0;
        if (c1476650oWt4.LIZJ) {
            LiveIOManager.getInstance().notifyFinish(str4, null);
        }
        this.Q0 = null;
    }

    public final void LLLLZLLLI() {
        JSONObject jSONObjectLLF = LLF();
        if (jSONObjectLLF != null) {
            int iOptInt = jSONObjectLLF.optInt("cctk_srtt", 0);
            int i = iOptInt > 0 ? iOptInt / LSPassThroughRecordSizeConfig.DEFAULT : 0;
            int i2 = this.j;
            if (i2 > 0) {
                this.i = Math.abs(i - i2);
            }
            this.j = i;
            this.h = ((double) jSONObjectLLF.optInt("cctk_plr")) / 100.0d;
            this.k = jSONObjectLLF.optInt("cctk_bw") * 8;
        }
    }

    public final void pause() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("pause -- ");
        sbLIZ.append(this.P0);
        C2188811AlT.LIZIZ(sbLIZ);
        C1698940uJQ.LIZJ();
        this.LJJIIJZLJL.pause();
    }

    public final void release() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("release start -- ");
        sbLIZ.append(this.P0);
        C2188811AlT.LIZIZ(sbLIZ);
        C1698940uJQ.LIZJ();
        LJIIJ(EnumC1487700ooi.IDLE);
        InterfaceC1698710uJ3 interfaceC1698710uJ3 = this.LJIJJ;
        if (interfaceC1698710uJ3 != null) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("release start -- ");
            sbLIZ2.append(this.P0);
            interfaceC1698710uJ3.LJJJJJ(C2188811AlT.LIZIZ(sbLIZ2));
        }
        if (C1474810oTv.LJJJZ()) {
            this.LJIILIIL.removeCallbacksAndMessages(null);
            RetryProcessor retryProcessor = this.LJJ;
            retryProcessor.LJIIJJI = false;
            retryProcessor.LJIILJJIL.removeCallbacksAndMessages(null);
        }
        EnumC1487710ooj enumC1487710ooj = this.LJIIIIZZ;
        if (enumC1487710ooj == EnumC1487710ooj.PLAYED || enumC1487710ooj == EnumC1487710ooj.PAUSED || enumC1487710ooj == EnumC1487710ooj.PREPARING) {
            LJJJI("release", true);
        }
        if (!C1474810oTv.LLILIL() || this.LIZLLL == null) {
            LLLILZ();
        }
        this.LJIILIIL.removeCallbacksAndMessages(null);
        C822650WOx c822650WOx = this.D0;
        if (c822650WOx != null) {
            c822650WOx.shutdown();
        }
        if (this.LIZLLL == null) {
            return;
        }
        if (!C1474810oTv.LLILIL()) {
            ((C1470430oMr) this.LIZLLL).LJIJ();
        }
        this.j1 = false;
        InterfaceC1467090oHT interfaceC1467090oHT = this.LJJIIJZLJL;
        if (interfaceC1467090oHT != null) {
            interfaceC1467090oHT.release();
            this.LJJIIJZLJL = null;
            if (C1474810oTv.LLJI().enableLiveReuse || C1474810oTv.LLJI().enableMixReuse || C1474810oTv.LLJI().enableKernelReuse) {
                this.LIZLLL = null;
            }
            if (C1474810oTv.LJJJZ()) {
                this.LIZLLL = null;
            }
        }
        if (C1474810oTv.LLILIL()) {
            LLLILZ();
        }
        this.LJJIJIIJI = null;
        this.LJJIIZ = null;
        this.LJJIIZI = null;
        this.LJJIJ = null;
        LiveLoggerService liveLoggerService = this.LJIILLIIL;
        liveLoggerService.Q = null;
        liveLoggerService.LJJZ();
        this.s0.LIZ();
        C1286530jaF c1286530jaF = this.s2;
        if (c1286530jaF != null) {
            c1286530jaF.LIZ = null;
            c1286530jaF.LIZIZ = null;
            this.s2 = null;
        }
        this.LLIIL = null;
        this.LJIIIZ = EnumC1487690ooh.IDLE;
        this.LJIIIIZZ = EnumC1487710ooj.IDLE;
        C1698940uJQ.LIZJ();
        this.Q0 = null;
        if (C1474810oTv.LJLJLLL()) {
            this.LJJIII.LIZ();
        }
        InterfaceC1698710uJ3 interfaceC1698710uJ32 = this.LJIJJ;
        if (interfaceC1698710uJ32 != null) {
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("release end -- ");
            sbLIZ3.append(this.P0);
            interfaceC1698710uJ32.LJJJJJ(C2188811AlT.LIZIZ(sbLIZ3));
        }
        this.P0 = -1;
        this.L2 = C0IJ8.VeLivePlayerRotation0;
        this.z = null;
        if (((Boolean) C1474810oTv.T1.getValue()).booleanValue()) {
            this.d = false;
        }
        if (this.B && this.A != null) {
            LiveConfigCenterWrapper.getInstance().removeVVConfigs(this.A);
            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
            sbLIZ4.append("[ConfigCenter] removeManagedConfigs: ");
            sbLIZ4.append(this.A);
            C2188811AlT.LIZIZ(sbLIZ4);
            C1698940uJQ.LIZJ();
            this.A = null;
        }
        this.B1 = null;
    }

    public final void stop() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("stop -- ");
        sbLIZ.append(this.P0);
        C2188811AlT.LIZIZ(sbLIZ);
        C1698940uJQ.LIZJ();
        LJIIJ(EnumC1487700ooi.IDLE);
        InterfaceC1698710uJ3 interfaceC1698710uJ3 = this.LJIJJ;
        if (interfaceC1698710uJ3 != null) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("stop start -- ");
            sbLIZ2.append(this.P0);
            interfaceC1698710uJ3.LJJJJJ(C2188811AlT.LIZIZ(sbLIZ2));
        }
        LJJJI("stop", true);
        this.LJJ.LJIIJJI = false;
        LiveLoggerService liveLoggerService = this.LJIILLIIL;
        if (liveLoggerService != null) {
            liveLoggerService.LJJZ();
        }
        if (C1474810oTv.LJLJLLL()) {
            this.LJJIII.LIZ();
        }
        InterfaceC1698710uJ3 interfaceC1698710uJ32 = this.LJIJJ;
        if (interfaceC1698710uJ32 != null) {
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("stop end-- ");
            sbLIZ3.append(this.P0);
            interfaceC1698710uJ32.LJJJJJ(C2188811AlT.LIZIZ(sbLIZ3));
        }
        this.j3 = false;
        this.LLIIL = null;
        this.LJJIJIIJI = null;
        this.k1 = 1;
        this.LJJLJ = 0;
        this.LJJLJLI = false;
        this.LJJZ = 0;
        this.LJJLL = -1;
        this.X1 = 1;
        this.Y1 = 0;
        this.Z1 = 0;
        this.a2 = 0;
        this.b2 = "ABRNoFirstFrame";
        this.e2 = 0L;
        this.f2 = 0;
        this.g2 = 0;
        this.h2 = 0;
        ((CopyOnWriteArrayList) this.c2).clear();
        ((CopyOnWriteArrayList) this.i2).clear();
        ((CopyOnWriteArrayList) this.j2).clear();
        this.z = null;
        if (!this.B || this.A == null) {
            return;
        }
        LiveConfigCenterWrapper.getInstance().removeVVConfigs(this.A);
        StringBuilder sbLIZ4 = C2188811AlT.LIZ();
        sbLIZ4.append("[ConfigCenter] removeManagedConfigs: ");
        sbLIZ4.append(this.A);
        C2188811AlT.LIZIZ(sbLIZ4);
        C1698940uJQ.LIZJ();
        this.A = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:130:0x052c  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x075f  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x0a52  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LLFZ(X.C1698490uIh r18, int r19, boolean r20) {
        /*
            Method dump skipped, instruction units count: 5129
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.videoarch.liveplayer.VideoLiveManager.LLFZ(X.0uIh, int, boolean):void");
    }

    /* JADX WARN: Type inference failed for: r1v52, types: [X.0uIm] */
    public VideoLiveManager(C1698820uJE c1698820uJE) {
        int i;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        this.LJIJJ = null;
        this.LJIJJLI = null;
        C1698770uJ9 c1698770uJ9 = new C1698770uJ9();
        this.LJJIII = c1698770uJ9;
        this.LJJIIJ = new C1698690uJ1(c1698770uJ9);
        this.LJJIIZI = null;
        this.LJJIJIL = 0;
        this.LJJIJL = 0;
        this.LJJIL = new AtomicBoolean(false);
        this.LJJIZ = new AtomicBoolean(false);
        this.LJJJ = 0;
        this.LJJJI = false;
        this.LJJJIL = false;
        this.LJJJJ = false;
        this.LJJJJI = false;
        this.LJJJJIZL = false;
        this.LJJJJJ = 0;
        this.LJJJJJL = 3;
        this.LJJJJL = 0;
        this.LJJJJLI = -1;
        this.LJJJJLL = -1;
        this.LJJJJZ = -1;
        this.LJJJJZI = 1;
        this.LJJJLIIL = -1;
        this.LJJJLL = -1;
        this.LJJJLZIJ = -1;
        this.LJJJZ = -1;
        this.LJJL = 0;
        this.LJJLI = 100;
        this.LJJLIIIIJ = LSPassThroughRecordSizeConfig.DEFAULT;
        this.LJJLIIIJ = 1;
        this.LJJLIIIJILLIZJL = 1;
        this.LJJLIIIJJI = 7;
        this.LJJLIIIJJIZ = 1;
        this.LJJLIIIJL = 0;
        this.LJJLIIIJLJLI = 10;
        this.LJJLIIIJLLLLLLLZ = LSPassThroughRecordSizeConfig.DEFAULT;
        this.LJJLIIJ = -1;
        this.LJJLIL = 0;
        this.LJJLJ = 0;
        this.LJJLJLI = false;
        this.LJJLL = -1;
        this.LJJZ = 0;
        this.LJJZZI = 10000;
        this.LJJZZIII = 1;
        this.LJL = 0;
        this.LJLI = 0;
        this.LJLIIIL = 0;
        this.LJLIIL = -1;
        this.LJLIL = -1;
        this.LJLILLLLZI = 0;
        this.LJLJI = LSPassThroughRecordSizeConfig.DEFAULT;
        this.LJLJJI = 5000;
        this.LJLJJL = -1;
        this.LJLJJLL = 0;
        this.LJLJL = -1.0f;
        this.LJLJLJ = -1;
        this.LJLJLLL = -1.0f;
        this.LJLL = null;
        this.LJLLI = null;
        this.LJLLILLLL = false;
        this.LJLLJ = null;
        this.LJLLL = null;
        this.LJLLLL = 0;
        this.LJLLLLLL = false;
        this.LJLZ = false;
        this.LJZ = false;
        this.LJZI = "abr_bb_4live";
        this.LJZL = false;
        this.LL = -1;
        this.LLD = 1;
        this.LLF = "none";
        this.LLFF = -1L;
        this.LLFFF = false;
        this.LLFII = "origin";
        this.LLFZ = 4;
        this.LLI = true;
        this.LLIFFJFJJ = false;
        this.LLII = 0;
        this.LLIIII = 0L;
        this.LLIIIILZ = new ArrayList();
        this.LLIIIL = 0;
        this.LLIIIZ = 10;
        this.LLIIJI = -1L;
        this.LLIIJLIL = null;
        this.LLIIL = null;
        this.LLIILII = null;
        this.LLIILZL = 0;
        this.LLIIZ = 0;
        this.LLIL = 4;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 31) {
            i = 1;
        } else {
            i = 0;
        }
        this.LLILII = i;
        this.LLILIL = 0;
        this.LLILL = -1;
        this.LLILLIZIL = 0;
        this.LLILLJJLI = 0;
        this.LLILLL = -1;
        this.LLILZ = -1;
        this.LLILZIL = 1;
        this.LLILZLL = 0;
        this.LLIZ = "";
        this.LLIZLLLIL = 0;
        this.LLJ = 0;
        this.LLJI = 0;
        this.LLJIJIL = -1L;
        this.LLJILJIL = "origin";
        this.LLJILJILJ = -1;
        this.LLJILLL = "main";
        this.LLJJ = "flv";
        this.LLJJI = "none";
        this.LLJJIII = "none";
        this.LLJJIJI = "none";
        this.LLJJIJIIJIL = "tcp";
        this.LLJJIJIL = false;
        this.LLJJJ = "none";
        this.LLJJJIL = "none";
        this.LLJJJJ = "";
        this.LLJJJJJIL = 1;
        this.LLJJJJLIIL = 1;
        this.LLJJL = 0;
        this.LLJJLIIIJLLLLLLLZ = 200;
        this.LLJL = 60;
        this.LLJLIL = 0;
        this.LLJLILLLLZIIL = 0;
        this.LLJLL = new JSONObject();
        this.LLJLLIL = new JSONObject();
        this.LLJLLL = -1L;
        this.LLJZ = -1L;
        this.LLJZIJLIL = false;
        this.LLL = 1;
        this.LLLF = 1;
        this.LLLFF = false;
        this.LLLFFI = false;
        this.LLLFZ = 0;
        this.LLLI = 0;
        this.LLLII = 0;
        this.LLLIIII = 0;
        this.LLLIIIIL = 0;
        this.LLLIIIL = 0;
        this.LLLIIL = 0;
        this.LLLIILIL = 0;
        this.LLLIL = 1;
        this.LLLILZ = 0;
        this.LLLILZJ = 0;
        this.LLLILZLLLI = 0;
        this.LLLIZZ = 1;
        this.LLLJ = 0L;
        this.LLLJIL = 0L;
        this.LLLJL = 0;
        this.LLLL = false;
        this.LLLLII = true;
        this.LLLLIIIILLL = 0;
        this.LLLLIIL = 0;
        this.LLLLIILL = 1;
        this.LLLLIILLL = 1;
        this.LLLLIL = 1;
        this.LLLLILI = 3;
        this.LLLLJ = 0;
        this.LLLLJI = 1;
        this.LLLLL = 1;
        this.LLLLLIL = 0L;
        this.LLLLLILLIL = 2000L;
        this.LLLLLJIL = 0;
        this.LLLLLJLJLL = false;
        this.LLLLLL = false;
        this.LLLLLLIL = null;
        this.LLLLLLJ = null;
        this.LLLLLLL = null;
        this.LLLLLLLLL = 0;
        this.LLLLLLLLLL = "";
        this.LLLLLLLZIL = "";
        this.LLLLLLZ = "";
        this.LLLLLLZZ = "";
        this.LLLLLZ = "";
        this.LLLLLZIL = "";
        this.LLLLLZL = 0;
        this.LLLLZ = false;
        this.LLLLZI = null;
        this.LLLLZIL = false;
        this.LLLLZLL = false;
        this.LLLLZLLIL = null;
        this.LLLLZLLLI = 0;
        this.LLLZ = false;
        this.LLLZI = -1;
        this.LLLZIIL = -1.0f;
        this.LLLZIL = -1.0f;
        this.LLLZL = -1.0f;
        this.LLLZLL = -1.0f;
        this.LLLZLZ = -1;
        this.LLLZZ = 0;
        this.LLLZZIL = 2;
        this.LLZ = 3;
        this.LLZIL = 1;
        this.LLZILL = 0;
        this.LLZL = -1;
        this.LLZLI = false;
        this.LLZLL = 2000000L;
        this.LLZLLIL = -3;
        this.LLZLLLL = -1;
        this.LLZZ = 1;
        this.LLZZJLIL = 10000L;
        this.LLZZZIL = false;
        this.LLZZZZ = false;
        this.a = 1;
        this.b = "";
        this.d = false;
        this.e = "none";
        this.f = 0;
        this.g = 0;
        this.h = 0.0d;
        this.i = 0;
        this.j = 0;
        this.k = 0L;
        this.l = "";
        this.m = "";
        this.n = "";
        this.o = 0;
        this.p = -1;
        this.q = false;
        new ArrayList();
        new Object() { // from class: X.0uJc
        };
        this.r = 0;
        this.s = false;
        this.u = 1;
        this.v = 1;
        this.w = 0;
        this.x = null;
        this.F = false;
        this.G = false;
        this.H = 1;
        this.I = 0;
        this.f444J = 0;
        this.K = 0;
        this.L = 0;
        this.M = 0;
        this.N = 0;
        this.f445O = false;
        this.P = 0;
        this.Q = 0;
        this.R = 0;
        this.S = 0;
        this.T = 0;
        this.U = 0;
        this.V = 0;
        this.W = 0;
        this.f446X = 1;
        this.f447Y = 1;
        this.Z = 1;
        this.a0 = 1;
        this.b0 = 0;
        this.c0 = 1048576;
        this.d0 = -1;
        this.f449e0 = 0;
        this.f0 = 0;
        this.g0 = 0;
        this.f450h0 = 0;
        this.f451i0 = 0;
        this.j0 = 0;
        this.f452k0 = 0;
        this.l0 = "";
        this.m0 = "";
        this.n0 = "";
        this.f454o0 = 0;
        this.p0 = 0;
        this.q0 = LSPassThroughRecordSizeConfig.DEFAULT;
        this.r0 = 4;
        this.s0 = new C1698630uIv(this);
        this.t0 = 500;
        this.u0 = DefaultHighLightCutConfig.DEFAULT_CUT_INTERVAL;
        this.v0 = 5000;
        this.w0 = 0;
        this.x0 = 0;
        this.y0 = 0;
        this.z0 = DefaultHighLightCutConfig.DEFAULT_CUT_INTERVAL;
        this.A0 = 0;
        this.B0 = 5000;
        this.C0 = 200;
        this.D0 = null;
        this.E0 = 0;
        this.F0 = -1;
        this.G0 = 0;
        this.H0 = EnumC1699190uJp.VeLivePlayerDrmTypeNone;
        this.I0 = "";
        this.J0 = null;
        this.K0 = 0;
        this.L0 = 0;
        this.M0 = 5000;
        this.N0 = 50;
        this.O0 = 0;
        this.P0 = -1;
        this.Q0 = null;
        this.R0 = null;
        this.S0 = -1;
        this.T0 = 1;
        this.U0 = 0;
        this.V0 = 1;
        this.W0 = 1;
        this.X0 = 0;
        this.Y0 = 0;
        this.Z0 = 0;
        this.a1 = "1.0.105.5";
        this.b1 = false;
        this.c1 = 50;
        this.d1 = 5000;
        this.f1 = true;
        this.g1 = false;
        this.h1 = false;
        this.i1 = null;
        this.j1 = false;
        this.k1 = 1;
        this.l1 = null;
        this.m1 = null;
        this.n1 = null;
        this.o1 = 0;
        this.f455p1 = 10;
        this.q1 = 10000;
        this.r1 = 0;
        this.s1 = null;
        this.t1 = 0;
        this.u1 = 0;
        this.v1 = new Object();
        this.w1 = false;
        this.x1 = -1;
        this.y1 = new AtomicBoolean(false);
        this.z1 = null;
        this.A1 = new Object();
        this.B1 = new ILiveFeatureBundle() { // from class: X.0uIm
            /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
            /* JADX WARN: Failed to find 'out' block for switch in B:16:0x0085. Please report as an issue. */
            /* JADX WARN: Failed to find 'out' block for switch in B:19:0x008e. Please report as an issue. */
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Removed duplicated region for block: B:100:0x0247 A[Catch: JSONException -> 0x08bc, TryCatch #2 {JSONException -> 0x08bc, blocks: (B:26:0x00a5, B:27:0x00aa, B:29:0x00b0, B:32:0x00b5, B:33:0x00bd, B:35:0x00c4, B:39:0x00e0, B:40:0x00fa, B:42:0x0101, B:44:0x0105, B:45:0x010d, B:47:0x0114, B:49:0x011e, B:50:0x0127, B:51:0x013d, B:53:0x0143, B:54:0x014c, B:56:0x0152, B:57:0x015b, B:59:0x0161, B:60:0x016c, B:62:0x0172, B:64:0x0178, B:65:0x017a, B:67:0x0184, B:69:0x018a, B:70:0x018c, B:71:0x0196, B:73:0x019c, B:74:0x01a0, B:75:0x01aa, B:77:0x01b9, B:78:0x01c2, B:79:0x01cb, B:81:0x01da, B:82:0x01e3, B:83:0x01ec, B:85:0x01fb, B:86:0x0204, B:88:0x0210, B:90:0x0217, B:92:0x021b, B:94:0x022c, B:96:0x0232, B:99:0x023e, B:100:0x0247, B:102:0x024f, B:103:0x0258, B:104:0x0263, B:106:0x0269, B:107:0x0276, B:109:0x027c, B:110:0x028f, B:112:0x0295, B:115:0x029a, B:37:0x00ce), top: B:431:0x00a5, inners: #4 }] */
            /* JADX WARN: Removed duplicated region for block: B:103:0x0258 A[Catch: JSONException -> 0x08bc, TryCatch #2 {JSONException -> 0x08bc, blocks: (B:26:0x00a5, B:27:0x00aa, B:29:0x00b0, B:32:0x00b5, B:33:0x00bd, B:35:0x00c4, B:39:0x00e0, B:40:0x00fa, B:42:0x0101, B:44:0x0105, B:45:0x010d, B:47:0x0114, B:49:0x011e, B:50:0x0127, B:51:0x013d, B:53:0x0143, B:54:0x014c, B:56:0x0152, B:57:0x015b, B:59:0x0161, B:60:0x016c, B:62:0x0172, B:64:0x0178, B:65:0x017a, B:67:0x0184, B:69:0x018a, B:70:0x018c, B:71:0x0196, B:73:0x019c, B:74:0x01a0, B:75:0x01aa, B:77:0x01b9, B:78:0x01c2, B:79:0x01cb, B:81:0x01da, B:82:0x01e3, B:83:0x01ec, B:85:0x01fb, B:86:0x0204, B:88:0x0210, B:90:0x0217, B:92:0x021b, B:94:0x022c, B:96:0x0232, B:99:0x023e, B:100:0x0247, B:102:0x024f, B:103:0x0258, B:104:0x0263, B:106:0x0269, B:107:0x0276, B:109:0x027c, B:110:0x028f, B:112:0x0295, B:115:0x029a, B:37:0x00ce), top: B:431:0x00a5, inners: #4 }] */
            /* JADX WARN: Removed duplicated region for block: B:104:0x0263 A[Catch: JSONException -> 0x08bc, TryCatch #2 {JSONException -> 0x08bc, blocks: (B:26:0x00a5, B:27:0x00aa, B:29:0x00b0, B:32:0x00b5, B:33:0x00bd, B:35:0x00c4, B:39:0x00e0, B:40:0x00fa, B:42:0x0101, B:44:0x0105, B:45:0x010d, B:47:0x0114, B:49:0x011e, B:50:0x0127, B:51:0x013d, B:53:0x0143, B:54:0x014c, B:56:0x0152, B:57:0x015b, B:59:0x0161, B:60:0x016c, B:62:0x0172, B:64:0x0178, B:65:0x017a, B:67:0x0184, B:69:0x018a, B:70:0x018c, B:71:0x0196, B:73:0x019c, B:74:0x01a0, B:75:0x01aa, B:77:0x01b9, B:78:0x01c2, B:79:0x01cb, B:81:0x01da, B:82:0x01e3, B:83:0x01ec, B:85:0x01fb, B:86:0x0204, B:88:0x0210, B:90:0x0217, B:92:0x021b, B:94:0x022c, B:96:0x0232, B:99:0x023e, B:100:0x0247, B:102:0x024f, B:103:0x0258, B:104:0x0263, B:106:0x0269, B:107:0x0276, B:109:0x027c, B:110:0x028f, B:112:0x0295, B:115:0x029a, B:37:0x00ce), top: B:431:0x00a5, inners: #4 }] */
            /* JADX WARN: Removed duplicated region for block: B:107:0x0276 A[Catch: JSONException -> 0x08bc, TryCatch #2 {JSONException -> 0x08bc, blocks: (B:26:0x00a5, B:27:0x00aa, B:29:0x00b0, B:32:0x00b5, B:33:0x00bd, B:35:0x00c4, B:39:0x00e0, B:40:0x00fa, B:42:0x0101, B:44:0x0105, B:45:0x010d, B:47:0x0114, B:49:0x011e, B:50:0x0127, B:51:0x013d, B:53:0x0143, B:54:0x014c, B:56:0x0152, B:57:0x015b, B:59:0x0161, B:60:0x016c, B:62:0x0172, B:64:0x0178, B:65:0x017a, B:67:0x0184, B:69:0x018a, B:70:0x018c, B:71:0x0196, B:73:0x019c, B:74:0x01a0, B:75:0x01aa, B:77:0x01b9, B:78:0x01c2, B:79:0x01cb, B:81:0x01da, B:82:0x01e3, B:83:0x01ec, B:85:0x01fb, B:86:0x0204, B:88:0x0210, B:90:0x0217, B:92:0x021b, B:94:0x022c, B:96:0x0232, B:99:0x023e, B:100:0x0247, B:102:0x024f, B:103:0x0258, B:104:0x0263, B:106:0x0269, B:107:0x0276, B:109:0x027c, B:110:0x028f, B:112:0x0295, B:115:0x029a, B:37:0x00ce), top: B:431:0x00a5, inners: #4 }] */
            /* JADX WARN: Removed duplicated region for block: B:110:0x028f A[Catch: JSONException -> 0x08bc, TryCatch #2 {JSONException -> 0x08bc, blocks: (B:26:0x00a5, B:27:0x00aa, B:29:0x00b0, B:32:0x00b5, B:33:0x00bd, B:35:0x00c4, B:39:0x00e0, B:40:0x00fa, B:42:0x0101, B:44:0x0105, B:45:0x010d, B:47:0x0114, B:49:0x011e, B:50:0x0127, B:51:0x013d, B:53:0x0143, B:54:0x014c, B:56:0x0152, B:57:0x015b, B:59:0x0161, B:60:0x016c, B:62:0x0172, B:64:0x0178, B:65:0x017a, B:67:0x0184, B:69:0x018a, B:70:0x018c, B:71:0x0196, B:73:0x019c, B:74:0x01a0, B:75:0x01aa, B:77:0x01b9, B:78:0x01c2, B:79:0x01cb, B:81:0x01da, B:82:0x01e3, B:83:0x01ec, B:85:0x01fb, B:86:0x0204, B:88:0x0210, B:90:0x0217, B:92:0x021b, B:94:0x022c, B:96:0x0232, B:99:0x023e, B:100:0x0247, B:102:0x024f, B:103:0x0258, B:104:0x0263, B:106:0x0269, B:107:0x0276, B:109:0x027c, B:110:0x028f, B:112:0x0295, B:115:0x029a, B:37:0x00ce), top: B:431:0x00a5, inners: #4 }] */
            /* JADX WARN: Removed duplicated region for block: B:122:0x02b5 A[Catch: JSONException -> 0x08c3, TryCatch #0 {JSONException -> 0x08c3, blocks: (B:116:0x02a3, B:118:0x02a9, B:121:0x02ae, B:122:0x02b5, B:124:0x02bb, B:127:0x02c2, B:128:0x02c9, B:130:0x02cf, B:134:0x02d8, B:135:0x02df, B:136:0x02f3, B:137:0x0307, B:138:0x031d, B:140:0x0323, B:141:0x0330, B:143:0x0336, B:144:0x033f, B:148:0x034a, B:149:0x0353, B:151:0x0359, B:152:0x0372, B:154:0x0378, B:155:0x0391, B:157:0x0399, B:159:0x039f, B:160:0x03b3, B:162:0x03bb, B:164:0x03c1, B:165:0x03d5, B:167:0x03db, B:168:0x03e9, B:170:0x03ef, B:171:0x03fd, B:173:0x0403, B:174:0x0410, B:176:0x0416, B:177:0x0423, B:179:0x0429, B:180:0x0436, B:182:0x043c, B:184:0x0442, B:185:0x044f, B:186:0x045c, B:187:0x0469, B:189:0x046f, B:190:0x047a, B:192:0x0480, B:193:0x048b, B:195:0x0491, B:196:0x049c, B:198:0x04a2, B:199:0x04b2, B:201:0x04b8, B:202:0x04c8, B:203:0x04d5, B:205:0x04db, B:206:0x04ee, B:209:0x0500, B:211:0x051b, B:212:0x0523, B:214:0x0531, B:217:0x0549, B:219:0x0569, B:220:0x056c, B:221:0x0577, B:223:0x057d, B:225:0x0585, B:226:0x058b, B:227:0x059a, B:229:0x05a6, B:230:0x05a9, B:232:0x05bc, B:233:0x05f7, B:237:0x0603, B:238:0x061f, B:243:0x062e, B:245:0x0636, B:247:0x063c, B:249:0x0642, B:250:0x0661, B:252:0x0667), top: B:427:0x02a3 }] */
            /* JADX WARN: Removed duplicated region for block: B:128:0x02c9 A[Catch: JSONException -> 0x08c3, TryCatch #0 {JSONException -> 0x08c3, blocks: (B:116:0x02a3, B:118:0x02a9, B:121:0x02ae, B:122:0x02b5, B:124:0x02bb, B:127:0x02c2, B:128:0x02c9, B:130:0x02cf, B:134:0x02d8, B:135:0x02df, B:136:0x02f3, B:137:0x0307, B:138:0x031d, B:140:0x0323, B:141:0x0330, B:143:0x0336, B:144:0x033f, B:148:0x034a, B:149:0x0353, B:151:0x0359, B:152:0x0372, B:154:0x0378, B:155:0x0391, B:157:0x0399, B:159:0x039f, B:160:0x03b3, B:162:0x03bb, B:164:0x03c1, B:165:0x03d5, B:167:0x03db, B:168:0x03e9, B:170:0x03ef, B:171:0x03fd, B:173:0x0403, B:174:0x0410, B:176:0x0416, B:177:0x0423, B:179:0x0429, B:180:0x0436, B:182:0x043c, B:184:0x0442, B:185:0x044f, B:186:0x045c, B:187:0x0469, B:189:0x046f, B:190:0x047a, B:192:0x0480, B:193:0x048b, B:195:0x0491, B:196:0x049c, B:198:0x04a2, B:199:0x04b2, B:201:0x04b8, B:202:0x04c8, B:203:0x04d5, B:205:0x04db, B:206:0x04ee, B:209:0x0500, B:211:0x051b, B:212:0x0523, B:214:0x0531, B:217:0x0549, B:219:0x0569, B:220:0x056c, B:221:0x0577, B:223:0x057d, B:225:0x0585, B:226:0x058b, B:227:0x059a, B:229:0x05a6, B:230:0x05a9, B:232:0x05bc, B:233:0x05f7, B:237:0x0603, B:238:0x061f, B:243:0x062e, B:245:0x0636, B:247:0x063c, B:249:0x0642, B:250:0x0661, B:252:0x0667), top: B:427:0x02a3 }] */
            /* JADX WARN: Removed duplicated region for block: B:135:0x02df A[Catch: JSONException -> 0x08c3, TryCatch #0 {JSONException -> 0x08c3, blocks: (B:116:0x02a3, B:118:0x02a9, B:121:0x02ae, B:122:0x02b5, B:124:0x02bb, B:127:0x02c2, B:128:0x02c9, B:130:0x02cf, B:134:0x02d8, B:135:0x02df, B:136:0x02f3, B:137:0x0307, B:138:0x031d, B:140:0x0323, B:141:0x0330, B:143:0x0336, B:144:0x033f, B:148:0x034a, B:149:0x0353, B:151:0x0359, B:152:0x0372, B:154:0x0378, B:155:0x0391, B:157:0x0399, B:159:0x039f, B:160:0x03b3, B:162:0x03bb, B:164:0x03c1, B:165:0x03d5, B:167:0x03db, B:168:0x03e9, B:170:0x03ef, B:171:0x03fd, B:173:0x0403, B:174:0x0410, B:176:0x0416, B:177:0x0423, B:179:0x0429, B:180:0x0436, B:182:0x043c, B:184:0x0442, B:185:0x044f, B:186:0x045c, B:187:0x0469, B:189:0x046f, B:190:0x047a, B:192:0x0480, B:193:0x048b, B:195:0x0491, B:196:0x049c, B:198:0x04a2, B:199:0x04b2, B:201:0x04b8, B:202:0x04c8, B:203:0x04d5, B:205:0x04db, B:206:0x04ee, B:209:0x0500, B:211:0x051b, B:212:0x0523, B:214:0x0531, B:217:0x0549, B:219:0x0569, B:220:0x056c, B:221:0x0577, B:223:0x057d, B:225:0x0585, B:226:0x058b, B:227:0x059a, B:229:0x05a6, B:230:0x05a9, B:232:0x05bc, B:233:0x05f7, B:237:0x0603, B:238:0x061f, B:243:0x062e, B:245:0x0636, B:247:0x063c, B:249:0x0642, B:250:0x0661, B:252:0x0667), top: B:427:0x02a3 }] */
            /* JADX WARN: Removed duplicated region for block: B:136:0x02f3 A[Catch: JSONException -> 0x08c3, TryCatch #0 {JSONException -> 0x08c3, blocks: (B:116:0x02a3, B:118:0x02a9, B:121:0x02ae, B:122:0x02b5, B:124:0x02bb, B:127:0x02c2, B:128:0x02c9, B:130:0x02cf, B:134:0x02d8, B:135:0x02df, B:136:0x02f3, B:137:0x0307, B:138:0x031d, B:140:0x0323, B:141:0x0330, B:143:0x0336, B:144:0x033f, B:148:0x034a, B:149:0x0353, B:151:0x0359, B:152:0x0372, B:154:0x0378, B:155:0x0391, B:157:0x0399, B:159:0x039f, B:160:0x03b3, B:162:0x03bb, B:164:0x03c1, B:165:0x03d5, B:167:0x03db, B:168:0x03e9, B:170:0x03ef, B:171:0x03fd, B:173:0x0403, B:174:0x0410, B:176:0x0416, B:177:0x0423, B:179:0x0429, B:180:0x0436, B:182:0x043c, B:184:0x0442, B:185:0x044f, B:186:0x045c, B:187:0x0469, B:189:0x046f, B:190:0x047a, B:192:0x0480, B:193:0x048b, B:195:0x0491, B:196:0x049c, B:198:0x04a2, B:199:0x04b2, B:201:0x04b8, B:202:0x04c8, B:203:0x04d5, B:205:0x04db, B:206:0x04ee, B:209:0x0500, B:211:0x051b, B:212:0x0523, B:214:0x0531, B:217:0x0549, B:219:0x0569, B:220:0x056c, B:221:0x0577, B:223:0x057d, B:225:0x0585, B:226:0x058b, B:227:0x059a, B:229:0x05a6, B:230:0x05a9, B:232:0x05bc, B:233:0x05f7, B:237:0x0603, B:238:0x061f, B:243:0x062e, B:245:0x0636, B:247:0x063c, B:249:0x0642, B:250:0x0661, B:252:0x0667), top: B:427:0x02a3 }] */
            /* JADX WARN: Removed duplicated region for block: B:137:0x0307 A[Catch: JSONException -> 0x08c3, TryCatch #0 {JSONException -> 0x08c3, blocks: (B:116:0x02a3, B:118:0x02a9, B:121:0x02ae, B:122:0x02b5, B:124:0x02bb, B:127:0x02c2, B:128:0x02c9, B:130:0x02cf, B:134:0x02d8, B:135:0x02df, B:136:0x02f3, B:137:0x0307, B:138:0x031d, B:140:0x0323, B:141:0x0330, B:143:0x0336, B:144:0x033f, B:148:0x034a, B:149:0x0353, B:151:0x0359, B:152:0x0372, B:154:0x0378, B:155:0x0391, B:157:0x0399, B:159:0x039f, B:160:0x03b3, B:162:0x03bb, B:164:0x03c1, B:165:0x03d5, B:167:0x03db, B:168:0x03e9, B:170:0x03ef, B:171:0x03fd, B:173:0x0403, B:174:0x0410, B:176:0x0416, B:177:0x0423, B:179:0x0429, B:180:0x0436, B:182:0x043c, B:184:0x0442, B:185:0x044f, B:186:0x045c, B:187:0x0469, B:189:0x046f, B:190:0x047a, B:192:0x0480, B:193:0x048b, B:195:0x0491, B:196:0x049c, B:198:0x04a2, B:199:0x04b2, B:201:0x04b8, B:202:0x04c8, B:203:0x04d5, B:205:0x04db, B:206:0x04ee, B:209:0x0500, B:211:0x051b, B:212:0x0523, B:214:0x0531, B:217:0x0549, B:219:0x0569, B:220:0x056c, B:221:0x0577, B:223:0x057d, B:225:0x0585, B:226:0x058b, B:227:0x059a, B:229:0x05a6, B:230:0x05a9, B:232:0x05bc, B:233:0x05f7, B:237:0x0603, B:238:0x061f, B:243:0x062e, B:245:0x0636, B:247:0x063c, B:249:0x0642, B:250:0x0661, B:252:0x0667), top: B:427:0x02a3 }] */
            /* JADX WARN: Removed duplicated region for block: B:138:0x031d A[Catch: JSONException -> 0x08c3, TryCatch #0 {JSONException -> 0x08c3, blocks: (B:116:0x02a3, B:118:0x02a9, B:121:0x02ae, B:122:0x02b5, B:124:0x02bb, B:127:0x02c2, B:128:0x02c9, B:130:0x02cf, B:134:0x02d8, B:135:0x02df, B:136:0x02f3, B:137:0x0307, B:138:0x031d, B:140:0x0323, B:141:0x0330, B:143:0x0336, B:144:0x033f, B:148:0x034a, B:149:0x0353, B:151:0x0359, B:152:0x0372, B:154:0x0378, B:155:0x0391, B:157:0x0399, B:159:0x039f, B:160:0x03b3, B:162:0x03bb, B:164:0x03c1, B:165:0x03d5, B:167:0x03db, B:168:0x03e9, B:170:0x03ef, B:171:0x03fd, B:173:0x0403, B:174:0x0410, B:176:0x0416, B:177:0x0423, B:179:0x0429, B:180:0x0436, B:182:0x043c, B:184:0x0442, B:185:0x044f, B:186:0x045c, B:187:0x0469, B:189:0x046f, B:190:0x047a, B:192:0x0480, B:193:0x048b, B:195:0x0491, B:196:0x049c, B:198:0x04a2, B:199:0x04b2, B:201:0x04b8, B:202:0x04c8, B:203:0x04d5, B:205:0x04db, B:206:0x04ee, B:209:0x0500, B:211:0x051b, B:212:0x0523, B:214:0x0531, B:217:0x0549, B:219:0x0569, B:220:0x056c, B:221:0x0577, B:223:0x057d, B:225:0x0585, B:226:0x058b, B:227:0x059a, B:229:0x05a6, B:230:0x05a9, B:232:0x05bc, B:233:0x05f7, B:237:0x0603, B:238:0x061f, B:243:0x062e, B:245:0x0636, B:247:0x063c, B:249:0x0642, B:250:0x0661, B:252:0x0667), top: B:427:0x02a3 }] */
            /* JADX WARN: Removed duplicated region for block: B:141:0x0330 A[Catch: JSONException -> 0x08c3, TryCatch #0 {JSONException -> 0x08c3, blocks: (B:116:0x02a3, B:118:0x02a9, B:121:0x02ae, B:122:0x02b5, B:124:0x02bb, B:127:0x02c2, B:128:0x02c9, B:130:0x02cf, B:134:0x02d8, B:135:0x02df, B:136:0x02f3, B:137:0x0307, B:138:0x031d, B:140:0x0323, B:141:0x0330, B:143:0x0336, B:144:0x033f, B:148:0x034a, B:149:0x0353, B:151:0x0359, B:152:0x0372, B:154:0x0378, B:155:0x0391, B:157:0x0399, B:159:0x039f, B:160:0x03b3, B:162:0x03bb, B:164:0x03c1, B:165:0x03d5, B:167:0x03db, B:168:0x03e9, B:170:0x03ef, B:171:0x03fd, B:173:0x0403, B:174:0x0410, B:176:0x0416, B:177:0x0423, B:179:0x0429, B:180:0x0436, B:182:0x043c, B:184:0x0442, B:185:0x044f, B:186:0x045c, B:187:0x0469, B:189:0x046f, B:190:0x047a, B:192:0x0480, B:193:0x048b, B:195:0x0491, B:196:0x049c, B:198:0x04a2, B:199:0x04b2, B:201:0x04b8, B:202:0x04c8, B:203:0x04d5, B:205:0x04db, B:206:0x04ee, B:209:0x0500, B:211:0x051b, B:212:0x0523, B:214:0x0531, B:217:0x0549, B:219:0x0569, B:220:0x056c, B:221:0x0577, B:223:0x057d, B:225:0x0585, B:226:0x058b, B:227:0x059a, B:229:0x05a6, B:230:0x05a9, B:232:0x05bc, B:233:0x05f7, B:237:0x0603, B:238:0x061f, B:243:0x062e, B:245:0x0636, B:247:0x063c, B:249:0x0642, B:250:0x0661, B:252:0x0667), top: B:427:0x02a3 }] */
            /* JADX WARN: Removed duplicated region for block: B:144:0x033f A[Catch: JSONException -> 0x08c3, TryCatch #0 {JSONException -> 0x08c3, blocks: (B:116:0x02a3, B:118:0x02a9, B:121:0x02ae, B:122:0x02b5, B:124:0x02bb, B:127:0x02c2, B:128:0x02c9, B:130:0x02cf, B:134:0x02d8, B:135:0x02df, B:136:0x02f3, B:137:0x0307, B:138:0x031d, B:140:0x0323, B:141:0x0330, B:143:0x0336, B:144:0x033f, B:148:0x034a, B:149:0x0353, B:151:0x0359, B:152:0x0372, B:154:0x0378, B:155:0x0391, B:157:0x0399, B:159:0x039f, B:160:0x03b3, B:162:0x03bb, B:164:0x03c1, B:165:0x03d5, B:167:0x03db, B:168:0x03e9, B:170:0x03ef, B:171:0x03fd, B:173:0x0403, B:174:0x0410, B:176:0x0416, B:177:0x0423, B:179:0x0429, B:180:0x0436, B:182:0x043c, B:184:0x0442, B:185:0x044f, B:186:0x045c, B:187:0x0469, B:189:0x046f, B:190:0x047a, B:192:0x0480, B:193:0x048b, B:195:0x0491, B:196:0x049c, B:198:0x04a2, B:199:0x04b2, B:201:0x04b8, B:202:0x04c8, B:203:0x04d5, B:205:0x04db, B:206:0x04ee, B:209:0x0500, B:211:0x051b, B:212:0x0523, B:214:0x0531, B:217:0x0549, B:219:0x0569, B:220:0x056c, B:221:0x0577, B:223:0x057d, B:225:0x0585, B:226:0x058b, B:227:0x059a, B:229:0x05a6, B:230:0x05a9, B:232:0x05bc, B:233:0x05f7, B:237:0x0603, B:238:0x061f, B:243:0x062e, B:245:0x0636, B:247:0x063c, B:249:0x0642, B:250:0x0661, B:252:0x0667), top: B:427:0x02a3 }] */
            /* JADX WARN: Removed duplicated region for block: B:149:0x0353 A[Catch: JSONException -> 0x08c3, TryCatch #0 {JSONException -> 0x08c3, blocks: (B:116:0x02a3, B:118:0x02a9, B:121:0x02ae, B:122:0x02b5, B:124:0x02bb, B:127:0x02c2, B:128:0x02c9, B:130:0x02cf, B:134:0x02d8, B:135:0x02df, B:136:0x02f3, B:137:0x0307, B:138:0x031d, B:140:0x0323, B:141:0x0330, B:143:0x0336, B:144:0x033f, B:148:0x034a, B:149:0x0353, B:151:0x0359, B:152:0x0372, B:154:0x0378, B:155:0x0391, B:157:0x0399, B:159:0x039f, B:160:0x03b3, B:162:0x03bb, B:164:0x03c1, B:165:0x03d5, B:167:0x03db, B:168:0x03e9, B:170:0x03ef, B:171:0x03fd, B:173:0x0403, B:174:0x0410, B:176:0x0416, B:177:0x0423, B:179:0x0429, B:180:0x0436, B:182:0x043c, B:184:0x0442, B:185:0x044f, B:186:0x045c, B:187:0x0469, B:189:0x046f, B:190:0x047a, B:192:0x0480, B:193:0x048b, B:195:0x0491, B:196:0x049c, B:198:0x04a2, B:199:0x04b2, B:201:0x04b8, B:202:0x04c8, B:203:0x04d5, B:205:0x04db, B:206:0x04ee, B:209:0x0500, B:211:0x051b, B:212:0x0523, B:214:0x0531, B:217:0x0549, B:219:0x0569, B:220:0x056c, B:221:0x0577, B:223:0x057d, B:225:0x0585, B:226:0x058b, B:227:0x059a, B:229:0x05a6, B:230:0x05a9, B:232:0x05bc, B:233:0x05f7, B:237:0x0603, B:238:0x061f, B:243:0x062e, B:245:0x0636, B:247:0x063c, B:249:0x0642, B:250:0x0661, B:252:0x0667), top: B:427:0x02a3 }] */
            /* JADX WARN: Removed duplicated region for block: B:152:0x0372 A[Catch: JSONException -> 0x08c3, TryCatch #0 {JSONException -> 0x08c3, blocks: (B:116:0x02a3, B:118:0x02a9, B:121:0x02ae, B:122:0x02b5, B:124:0x02bb, B:127:0x02c2, B:128:0x02c9, B:130:0x02cf, B:134:0x02d8, B:135:0x02df, B:136:0x02f3, B:137:0x0307, B:138:0x031d, B:140:0x0323, B:141:0x0330, B:143:0x0336, B:144:0x033f, B:148:0x034a, B:149:0x0353, B:151:0x0359, B:152:0x0372, B:154:0x0378, B:155:0x0391, B:157:0x0399, B:159:0x039f, B:160:0x03b3, B:162:0x03bb, B:164:0x03c1, B:165:0x03d5, B:167:0x03db, B:168:0x03e9, B:170:0x03ef, B:171:0x03fd, B:173:0x0403, B:174:0x0410, B:176:0x0416, B:177:0x0423, B:179:0x0429, B:180:0x0436, B:182:0x043c, B:184:0x0442, B:185:0x044f, B:186:0x045c, B:187:0x0469, B:189:0x046f, B:190:0x047a, B:192:0x0480, B:193:0x048b, B:195:0x0491, B:196:0x049c, B:198:0x04a2, B:199:0x04b2, B:201:0x04b8, B:202:0x04c8, B:203:0x04d5, B:205:0x04db, B:206:0x04ee, B:209:0x0500, B:211:0x051b, B:212:0x0523, B:214:0x0531, B:217:0x0549, B:219:0x0569, B:220:0x056c, B:221:0x0577, B:223:0x057d, B:225:0x0585, B:226:0x058b, B:227:0x059a, B:229:0x05a6, B:230:0x05a9, B:232:0x05bc, B:233:0x05f7, B:237:0x0603, B:238:0x061f, B:243:0x062e, B:245:0x0636, B:247:0x063c, B:249:0x0642, B:250:0x0661, B:252:0x0667), top: B:427:0x02a3 }] */
            /* JADX WARN: Removed duplicated region for block: B:155:0x0391 A[Catch: JSONException -> 0x08c3, TryCatch #0 {JSONException -> 0x08c3, blocks: (B:116:0x02a3, B:118:0x02a9, B:121:0x02ae, B:122:0x02b5, B:124:0x02bb, B:127:0x02c2, B:128:0x02c9, B:130:0x02cf, B:134:0x02d8, B:135:0x02df, B:136:0x02f3, B:137:0x0307, B:138:0x031d, B:140:0x0323, B:141:0x0330, B:143:0x0336, B:144:0x033f, B:148:0x034a, B:149:0x0353, B:151:0x0359, B:152:0x0372, B:154:0x0378, B:155:0x0391, B:157:0x0399, B:159:0x039f, B:160:0x03b3, B:162:0x03bb, B:164:0x03c1, B:165:0x03d5, B:167:0x03db, B:168:0x03e9, B:170:0x03ef, B:171:0x03fd, B:173:0x0403, B:174:0x0410, B:176:0x0416, B:177:0x0423, B:179:0x0429, B:180:0x0436, B:182:0x043c, B:184:0x0442, B:185:0x044f, B:186:0x045c, B:187:0x0469, B:189:0x046f, B:190:0x047a, B:192:0x0480, B:193:0x048b, B:195:0x0491, B:196:0x049c, B:198:0x04a2, B:199:0x04b2, B:201:0x04b8, B:202:0x04c8, B:203:0x04d5, B:205:0x04db, B:206:0x04ee, B:209:0x0500, B:211:0x051b, B:212:0x0523, B:214:0x0531, B:217:0x0549, B:219:0x0569, B:220:0x056c, B:221:0x0577, B:223:0x057d, B:225:0x0585, B:226:0x058b, B:227:0x059a, B:229:0x05a6, B:230:0x05a9, B:232:0x05bc, B:233:0x05f7, B:237:0x0603, B:238:0x061f, B:243:0x062e, B:245:0x0636, B:247:0x063c, B:249:0x0642, B:250:0x0661, B:252:0x0667), top: B:427:0x02a3 }] */
            /* JADX WARN: Removed duplicated region for block: B:160:0x03b3 A[Catch: JSONException -> 0x08c3, TryCatch #0 {JSONException -> 0x08c3, blocks: (B:116:0x02a3, B:118:0x02a9, B:121:0x02ae, B:122:0x02b5, B:124:0x02bb, B:127:0x02c2, B:128:0x02c9, B:130:0x02cf, B:134:0x02d8, B:135:0x02df, B:136:0x02f3, B:137:0x0307, B:138:0x031d, B:140:0x0323, B:141:0x0330, B:143:0x0336, B:144:0x033f, B:148:0x034a, B:149:0x0353, B:151:0x0359, B:152:0x0372, B:154:0x0378, B:155:0x0391, B:157:0x0399, B:159:0x039f, B:160:0x03b3, B:162:0x03bb, B:164:0x03c1, B:165:0x03d5, B:167:0x03db, B:168:0x03e9, B:170:0x03ef, B:171:0x03fd, B:173:0x0403, B:174:0x0410, B:176:0x0416, B:177:0x0423, B:179:0x0429, B:180:0x0436, B:182:0x043c, B:184:0x0442, B:185:0x044f, B:186:0x045c, B:187:0x0469, B:189:0x046f, B:190:0x047a, B:192:0x0480, B:193:0x048b, B:195:0x0491, B:196:0x049c, B:198:0x04a2, B:199:0x04b2, B:201:0x04b8, B:202:0x04c8, B:203:0x04d5, B:205:0x04db, B:206:0x04ee, B:209:0x0500, B:211:0x051b, B:212:0x0523, B:214:0x0531, B:217:0x0549, B:219:0x0569, B:220:0x056c, B:221:0x0577, B:223:0x057d, B:225:0x0585, B:226:0x058b, B:227:0x059a, B:229:0x05a6, B:230:0x05a9, B:232:0x05bc, B:233:0x05f7, B:237:0x0603, B:238:0x061f, B:243:0x062e, B:245:0x0636, B:247:0x063c, B:249:0x0642, B:250:0x0661, B:252:0x0667), top: B:427:0x02a3 }] */
            /* JADX WARN: Removed duplicated region for block: B:165:0x03d5 A[Catch: JSONException -> 0x08c3, TryCatch #0 {JSONException -> 0x08c3, blocks: (B:116:0x02a3, B:118:0x02a9, B:121:0x02ae, B:122:0x02b5, B:124:0x02bb, B:127:0x02c2, B:128:0x02c9, B:130:0x02cf, B:134:0x02d8, B:135:0x02df, B:136:0x02f3, B:137:0x0307, B:138:0x031d, B:140:0x0323, B:141:0x0330, B:143:0x0336, B:144:0x033f, B:148:0x034a, B:149:0x0353, B:151:0x0359, B:152:0x0372, B:154:0x0378, B:155:0x0391, B:157:0x0399, B:159:0x039f, B:160:0x03b3, B:162:0x03bb, B:164:0x03c1, B:165:0x03d5, B:167:0x03db, B:168:0x03e9, B:170:0x03ef, B:171:0x03fd, B:173:0x0403, B:174:0x0410, B:176:0x0416, B:177:0x0423, B:179:0x0429, B:180:0x0436, B:182:0x043c, B:184:0x0442, B:185:0x044f, B:186:0x045c, B:187:0x0469, B:189:0x046f, B:190:0x047a, B:192:0x0480, B:193:0x048b, B:195:0x0491, B:196:0x049c, B:198:0x04a2, B:199:0x04b2, B:201:0x04b8, B:202:0x04c8, B:203:0x04d5, B:205:0x04db, B:206:0x04ee, B:209:0x0500, B:211:0x051b, B:212:0x0523, B:214:0x0531, B:217:0x0549, B:219:0x0569, B:220:0x056c, B:221:0x0577, B:223:0x057d, B:225:0x0585, B:226:0x058b, B:227:0x059a, B:229:0x05a6, B:230:0x05a9, B:232:0x05bc, B:233:0x05f7, B:237:0x0603, B:238:0x061f, B:243:0x062e, B:245:0x0636, B:247:0x063c, B:249:0x0642, B:250:0x0661, B:252:0x0667), top: B:427:0x02a3 }] */
            /* JADX WARN: Removed duplicated region for block: B:168:0x03e9 A[Catch: JSONException -> 0x08c3, TryCatch #0 {JSONException -> 0x08c3, blocks: (B:116:0x02a3, B:118:0x02a9, B:121:0x02ae, B:122:0x02b5, B:124:0x02bb, B:127:0x02c2, B:128:0x02c9, B:130:0x02cf, B:134:0x02d8, B:135:0x02df, B:136:0x02f3, B:137:0x0307, B:138:0x031d, B:140:0x0323, B:141:0x0330, B:143:0x0336, B:144:0x033f, B:148:0x034a, B:149:0x0353, B:151:0x0359, B:152:0x0372, B:154:0x0378, B:155:0x0391, B:157:0x0399, B:159:0x039f, B:160:0x03b3, B:162:0x03bb, B:164:0x03c1, B:165:0x03d5, B:167:0x03db, B:168:0x03e9, B:170:0x03ef, B:171:0x03fd, B:173:0x0403, B:174:0x0410, B:176:0x0416, B:177:0x0423, B:179:0x0429, B:180:0x0436, B:182:0x043c, B:184:0x0442, B:185:0x044f, B:186:0x045c, B:187:0x0469, B:189:0x046f, B:190:0x047a, B:192:0x0480, B:193:0x048b, B:195:0x0491, B:196:0x049c, B:198:0x04a2, B:199:0x04b2, B:201:0x04b8, B:202:0x04c8, B:203:0x04d5, B:205:0x04db, B:206:0x04ee, B:209:0x0500, B:211:0x051b, B:212:0x0523, B:214:0x0531, B:217:0x0549, B:219:0x0569, B:220:0x056c, B:221:0x0577, B:223:0x057d, B:225:0x0585, B:226:0x058b, B:227:0x059a, B:229:0x05a6, B:230:0x05a9, B:232:0x05bc, B:233:0x05f7, B:237:0x0603, B:238:0x061f, B:243:0x062e, B:245:0x0636, B:247:0x063c, B:249:0x0642, B:250:0x0661, B:252:0x0667), top: B:427:0x02a3 }] */
            /* JADX WARN: Removed duplicated region for block: B:171:0x03fd A[Catch: JSONException -> 0x08c3, TryCatch #0 {JSONException -> 0x08c3, blocks: (B:116:0x02a3, B:118:0x02a9, B:121:0x02ae, B:122:0x02b5, B:124:0x02bb, B:127:0x02c2, B:128:0x02c9, B:130:0x02cf, B:134:0x02d8, B:135:0x02df, B:136:0x02f3, B:137:0x0307, B:138:0x031d, B:140:0x0323, B:141:0x0330, B:143:0x0336, B:144:0x033f, B:148:0x034a, B:149:0x0353, B:151:0x0359, B:152:0x0372, B:154:0x0378, B:155:0x0391, B:157:0x0399, B:159:0x039f, B:160:0x03b3, B:162:0x03bb, B:164:0x03c1, B:165:0x03d5, B:167:0x03db, B:168:0x03e9, B:170:0x03ef, B:171:0x03fd, B:173:0x0403, B:174:0x0410, B:176:0x0416, B:177:0x0423, B:179:0x0429, B:180:0x0436, B:182:0x043c, B:184:0x0442, B:185:0x044f, B:186:0x045c, B:187:0x0469, B:189:0x046f, B:190:0x047a, B:192:0x0480, B:193:0x048b, B:195:0x0491, B:196:0x049c, B:198:0x04a2, B:199:0x04b2, B:201:0x04b8, B:202:0x04c8, B:203:0x04d5, B:205:0x04db, B:206:0x04ee, B:209:0x0500, B:211:0x051b, B:212:0x0523, B:214:0x0531, B:217:0x0549, B:219:0x0569, B:220:0x056c, B:221:0x0577, B:223:0x057d, B:225:0x0585, B:226:0x058b, B:227:0x059a, B:229:0x05a6, B:230:0x05a9, B:232:0x05bc, B:233:0x05f7, B:237:0x0603, B:238:0x061f, B:243:0x062e, B:245:0x0636, B:247:0x063c, B:249:0x0642, B:250:0x0661, B:252:0x0667), top: B:427:0x02a3 }] */
            /* JADX WARN: Removed duplicated region for block: B:174:0x0410 A[Catch: JSONException -> 0x08c3, TryCatch #0 {JSONException -> 0x08c3, blocks: (B:116:0x02a3, B:118:0x02a9, B:121:0x02ae, B:122:0x02b5, B:124:0x02bb, B:127:0x02c2, B:128:0x02c9, B:130:0x02cf, B:134:0x02d8, B:135:0x02df, B:136:0x02f3, B:137:0x0307, B:138:0x031d, B:140:0x0323, B:141:0x0330, B:143:0x0336, B:144:0x033f, B:148:0x034a, B:149:0x0353, B:151:0x0359, B:152:0x0372, B:154:0x0378, B:155:0x0391, B:157:0x0399, B:159:0x039f, B:160:0x03b3, B:162:0x03bb, B:164:0x03c1, B:165:0x03d5, B:167:0x03db, B:168:0x03e9, B:170:0x03ef, B:171:0x03fd, B:173:0x0403, B:174:0x0410, B:176:0x0416, B:177:0x0423, B:179:0x0429, B:180:0x0436, B:182:0x043c, B:184:0x0442, B:185:0x044f, B:186:0x045c, B:187:0x0469, B:189:0x046f, B:190:0x047a, B:192:0x0480, B:193:0x048b, B:195:0x0491, B:196:0x049c, B:198:0x04a2, B:199:0x04b2, B:201:0x04b8, B:202:0x04c8, B:203:0x04d5, B:205:0x04db, B:206:0x04ee, B:209:0x0500, B:211:0x051b, B:212:0x0523, B:214:0x0531, B:217:0x0549, B:219:0x0569, B:220:0x056c, B:221:0x0577, B:223:0x057d, B:225:0x0585, B:226:0x058b, B:227:0x059a, B:229:0x05a6, B:230:0x05a9, B:232:0x05bc, B:233:0x05f7, B:237:0x0603, B:238:0x061f, B:243:0x062e, B:245:0x0636, B:247:0x063c, B:249:0x0642, B:250:0x0661, B:252:0x0667), top: B:427:0x02a3 }] */
            /* JADX WARN: Removed duplicated region for block: B:177:0x0423 A[Catch: JSONException -> 0x08c3, TryCatch #0 {JSONException -> 0x08c3, blocks: (B:116:0x02a3, B:118:0x02a9, B:121:0x02ae, B:122:0x02b5, B:124:0x02bb, B:127:0x02c2, B:128:0x02c9, B:130:0x02cf, B:134:0x02d8, B:135:0x02df, B:136:0x02f3, B:137:0x0307, B:138:0x031d, B:140:0x0323, B:141:0x0330, B:143:0x0336, B:144:0x033f, B:148:0x034a, B:149:0x0353, B:151:0x0359, B:152:0x0372, B:154:0x0378, B:155:0x0391, B:157:0x0399, B:159:0x039f, B:160:0x03b3, B:162:0x03bb, B:164:0x03c1, B:165:0x03d5, B:167:0x03db, B:168:0x03e9, B:170:0x03ef, B:171:0x03fd, B:173:0x0403, B:174:0x0410, B:176:0x0416, B:177:0x0423, B:179:0x0429, B:180:0x0436, B:182:0x043c, B:184:0x0442, B:185:0x044f, B:186:0x045c, B:187:0x0469, B:189:0x046f, B:190:0x047a, B:192:0x0480, B:193:0x048b, B:195:0x0491, B:196:0x049c, B:198:0x04a2, B:199:0x04b2, B:201:0x04b8, B:202:0x04c8, B:203:0x04d5, B:205:0x04db, B:206:0x04ee, B:209:0x0500, B:211:0x051b, B:212:0x0523, B:214:0x0531, B:217:0x0549, B:219:0x0569, B:220:0x056c, B:221:0x0577, B:223:0x057d, B:225:0x0585, B:226:0x058b, B:227:0x059a, B:229:0x05a6, B:230:0x05a9, B:232:0x05bc, B:233:0x05f7, B:237:0x0603, B:238:0x061f, B:243:0x062e, B:245:0x0636, B:247:0x063c, B:249:0x0642, B:250:0x0661, B:252:0x0667), top: B:427:0x02a3 }] */
            /* JADX WARN: Removed duplicated region for block: B:17:0x0088  */
            /* JADX WARN: Removed duplicated region for block: B:180:0x0436 A[Catch: JSONException -> 0x08c3, TryCatch #0 {JSONException -> 0x08c3, blocks: (B:116:0x02a3, B:118:0x02a9, B:121:0x02ae, B:122:0x02b5, B:124:0x02bb, B:127:0x02c2, B:128:0x02c9, B:130:0x02cf, B:134:0x02d8, B:135:0x02df, B:136:0x02f3, B:137:0x0307, B:138:0x031d, B:140:0x0323, B:141:0x0330, B:143:0x0336, B:144:0x033f, B:148:0x034a, B:149:0x0353, B:151:0x0359, B:152:0x0372, B:154:0x0378, B:155:0x0391, B:157:0x0399, B:159:0x039f, B:160:0x03b3, B:162:0x03bb, B:164:0x03c1, B:165:0x03d5, B:167:0x03db, B:168:0x03e9, B:170:0x03ef, B:171:0x03fd, B:173:0x0403, B:174:0x0410, B:176:0x0416, B:177:0x0423, B:179:0x0429, B:180:0x0436, B:182:0x043c, B:184:0x0442, B:185:0x044f, B:186:0x045c, B:187:0x0469, B:189:0x046f, B:190:0x047a, B:192:0x0480, B:193:0x048b, B:195:0x0491, B:196:0x049c, B:198:0x04a2, B:199:0x04b2, B:201:0x04b8, B:202:0x04c8, B:203:0x04d5, B:205:0x04db, B:206:0x04ee, B:209:0x0500, B:211:0x051b, B:212:0x0523, B:214:0x0531, B:217:0x0549, B:219:0x0569, B:220:0x056c, B:221:0x0577, B:223:0x057d, B:225:0x0585, B:226:0x058b, B:227:0x059a, B:229:0x05a6, B:230:0x05a9, B:232:0x05bc, B:233:0x05f7, B:237:0x0603, B:238:0x061f, B:243:0x062e, B:245:0x0636, B:247:0x063c, B:249:0x0642, B:250:0x0661, B:252:0x0667), top: B:427:0x02a3 }] */
            /* JADX WARN: Removed duplicated region for block: B:186:0x045c A[Catch: JSONException -> 0x08c3, TryCatch #0 {JSONException -> 0x08c3, blocks: (B:116:0x02a3, B:118:0x02a9, B:121:0x02ae, B:122:0x02b5, B:124:0x02bb, B:127:0x02c2, B:128:0x02c9, B:130:0x02cf, B:134:0x02d8, B:135:0x02df, B:136:0x02f3, B:137:0x0307, B:138:0x031d, B:140:0x0323, B:141:0x0330, B:143:0x0336, B:144:0x033f, B:148:0x034a, B:149:0x0353, B:151:0x0359, B:152:0x0372, B:154:0x0378, B:155:0x0391, B:157:0x0399, B:159:0x039f, B:160:0x03b3, B:162:0x03bb, B:164:0x03c1, B:165:0x03d5, B:167:0x03db, B:168:0x03e9, B:170:0x03ef, B:171:0x03fd, B:173:0x0403, B:174:0x0410, B:176:0x0416, B:177:0x0423, B:179:0x0429, B:180:0x0436, B:182:0x043c, B:184:0x0442, B:185:0x044f, B:186:0x045c, B:187:0x0469, B:189:0x046f, B:190:0x047a, B:192:0x0480, B:193:0x048b, B:195:0x0491, B:196:0x049c, B:198:0x04a2, B:199:0x04b2, B:201:0x04b8, B:202:0x04c8, B:203:0x04d5, B:205:0x04db, B:206:0x04ee, B:209:0x0500, B:211:0x051b, B:212:0x0523, B:214:0x0531, B:217:0x0549, B:219:0x0569, B:220:0x056c, B:221:0x0577, B:223:0x057d, B:225:0x0585, B:226:0x058b, B:227:0x059a, B:229:0x05a6, B:230:0x05a9, B:232:0x05bc, B:233:0x05f7, B:237:0x0603, B:238:0x061f, B:243:0x062e, B:245:0x0636, B:247:0x063c, B:249:0x0642, B:250:0x0661, B:252:0x0667), top: B:427:0x02a3 }] */
            /* JADX WARN: Removed duplicated region for block: B:187:0x0469 A[Catch: JSONException -> 0x08c3, TryCatch #0 {JSONException -> 0x08c3, blocks: (B:116:0x02a3, B:118:0x02a9, B:121:0x02ae, B:122:0x02b5, B:124:0x02bb, B:127:0x02c2, B:128:0x02c9, B:130:0x02cf, B:134:0x02d8, B:135:0x02df, B:136:0x02f3, B:137:0x0307, B:138:0x031d, B:140:0x0323, B:141:0x0330, B:143:0x0336, B:144:0x033f, B:148:0x034a, B:149:0x0353, B:151:0x0359, B:152:0x0372, B:154:0x0378, B:155:0x0391, B:157:0x0399, B:159:0x039f, B:160:0x03b3, B:162:0x03bb, B:164:0x03c1, B:165:0x03d5, B:167:0x03db, B:168:0x03e9, B:170:0x03ef, B:171:0x03fd, B:173:0x0403, B:174:0x0410, B:176:0x0416, B:177:0x0423, B:179:0x0429, B:180:0x0436, B:182:0x043c, B:184:0x0442, B:185:0x044f, B:186:0x045c, B:187:0x0469, B:189:0x046f, B:190:0x047a, B:192:0x0480, B:193:0x048b, B:195:0x0491, B:196:0x049c, B:198:0x04a2, B:199:0x04b2, B:201:0x04b8, B:202:0x04c8, B:203:0x04d5, B:205:0x04db, B:206:0x04ee, B:209:0x0500, B:211:0x051b, B:212:0x0523, B:214:0x0531, B:217:0x0549, B:219:0x0569, B:220:0x056c, B:221:0x0577, B:223:0x057d, B:225:0x0585, B:226:0x058b, B:227:0x059a, B:229:0x05a6, B:230:0x05a9, B:232:0x05bc, B:233:0x05f7, B:237:0x0603, B:238:0x061f, B:243:0x062e, B:245:0x0636, B:247:0x063c, B:249:0x0642, B:250:0x0661, B:252:0x0667), top: B:427:0x02a3 }] */
            /* JADX WARN: Removed duplicated region for block: B:190:0x047a A[Catch: JSONException -> 0x08c3, TryCatch #0 {JSONException -> 0x08c3, blocks: (B:116:0x02a3, B:118:0x02a9, B:121:0x02ae, B:122:0x02b5, B:124:0x02bb, B:127:0x02c2, B:128:0x02c9, B:130:0x02cf, B:134:0x02d8, B:135:0x02df, B:136:0x02f3, B:137:0x0307, B:138:0x031d, B:140:0x0323, B:141:0x0330, B:143:0x0336, B:144:0x033f, B:148:0x034a, B:149:0x0353, B:151:0x0359, B:152:0x0372, B:154:0x0378, B:155:0x0391, B:157:0x0399, B:159:0x039f, B:160:0x03b3, B:162:0x03bb, B:164:0x03c1, B:165:0x03d5, B:167:0x03db, B:168:0x03e9, B:170:0x03ef, B:171:0x03fd, B:173:0x0403, B:174:0x0410, B:176:0x0416, B:177:0x0423, B:179:0x0429, B:180:0x0436, B:182:0x043c, B:184:0x0442, B:185:0x044f, B:186:0x045c, B:187:0x0469, B:189:0x046f, B:190:0x047a, B:192:0x0480, B:193:0x048b, B:195:0x0491, B:196:0x049c, B:198:0x04a2, B:199:0x04b2, B:201:0x04b8, B:202:0x04c8, B:203:0x04d5, B:205:0x04db, B:206:0x04ee, B:209:0x0500, B:211:0x051b, B:212:0x0523, B:214:0x0531, B:217:0x0549, B:219:0x0569, B:220:0x056c, B:221:0x0577, B:223:0x057d, B:225:0x0585, B:226:0x058b, B:227:0x059a, B:229:0x05a6, B:230:0x05a9, B:232:0x05bc, B:233:0x05f7, B:237:0x0603, B:238:0x061f, B:243:0x062e, B:245:0x0636, B:247:0x063c, B:249:0x0642, B:250:0x0661, B:252:0x0667), top: B:427:0x02a3 }] */
            /* JADX WARN: Removed duplicated region for block: B:193:0x048b A[Catch: JSONException -> 0x08c3, TryCatch #0 {JSONException -> 0x08c3, blocks: (B:116:0x02a3, B:118:0x02a9, B:121:0x02ae, B:122:0x02b5, B:124:0x02bb, B:127:0x02c2, B:128:0x02c9, B:130:0x02cf, B:134:0x02d8, B:135:0x02df, B:136:0x02f3, B:137:0x0307, B:138:0x031d, B:140:0x0323, B:141:0x0330, B:143:0x0336, B:144:0x033f, B:148:0x034a, B:149:0x0353, B:151:0x0359, B:152:0x0372, B:154:0x0378, B:155:0x0391, B:157:0x0399, B:159:0x039f, B:160:0x03b3, B:162:0x03bb, B:164:0x03c1, B:165:0x03d5, B:167:0x03db, B:168:0x03e9, B:170:0x03ef, B:171:0x03fd, B:173:0x0403, B:174:0x0410, B:176:0x0416, B:177:0x0423, B:179:0x0429, B:180:0x0436, B:182:0x043c, B:184:0x0442, B:185:0x044f, B:186:0x045c, B:187:0x0469, B:189:0x046f, B:190:0x047a, B:192:0x0480, B:193:0x048b, B:195:0x0491, B:196:0x049c, B:198:0x04a2, B:199:0x04b2, B:201:0x04b8, B:202:0x04c8, B:203:0x04d5, B:205:0x04db, B:206:0x04ee, B:209:0x0500, B:211:0x051b, B:212:0x0523, B:214:0x0531, B:217:0x0549, B:219:0x0569, B:220:0x056c, B:221:0x0577, B:223:0x057d, B:225:0x0585, B:226:0x058b, B:227:0x059a, B:229:0x05a6, B:230:0x05a9, B:232:0x05bc, B:233:0x05f7, B:237:0x0603, B:238:0x061f, B:243:0x062e, B:245:0x0636, B:247:0x063c, B:249:0x0642, B:250:0x0661, B:252:0x0667), top: B:427:0x02a3 }] */
            /* JADX WARN: Removed duplicated region for block: B:196:0x049c A[Catch: JSONException -> 0x08c3, TryCatch #0 {JSONException -> 0x08c3, blocks: (B:116:0x02a3, B:118:0x02a9, B:121:0x02ae, B:122:0x02b5, B:124:0x02bb, B:127:0x02c2, B:128:0x02c9, B:130:0x02cf, B:134:0x02d8, B:135:0x02df, B:136:0x02f3, B:137:0x0307, B:138:0x031d, B:140:0x0323, B:141:0x0330, B:143:0x0336, B:144:0x033f, B:148:0x034a, B:149:0x0353, B:151:0x0359, B:152:0x0372, B:154:0x0378, B:155:0x0391, B:157:0x0399, B:159:0x039f, B:160:0x03b3, B:162:0x03bb, B:164:0x03c1, B:165:0x03d5, B:167:0x03db, B:168:0x03e9, B:170:0x03ef, B:171:0x03fd, B:173:0x0403, B:174:0x0410, B:176:0x0416, B:177:0x0423, B:179:0x0429, B:180:0x0436, B:182:0x043c, B:184:0x0442, B:185:0x044f, B:186:0x045c, B:187:0x0469, B:189:0x046f, B:190:0x047a, B:192:0x0480, B:193:0x048b, B:195:0x0491, B:196:0x049c, B:198:0x04a2, B:199:0x04b2, B:201:0x04b8, B:202:0x04c8, B:203:0x04d5, B:205:0x04db, B:206:0x04ee, B:209:0x0500, B:211:0x051b, B:212:0x0523, B:214:0x0531, B:217:0x0549, B:219:0x0569, B:220:0x056c, B:221:0x0577, B:223:0x057d, B:225:0x0585, B:226:0x058b, B:227:0x059a, B:229:0x05a6, B:230:0x05a9, B:232:0x05bc, B:233:0x05f7, B:237:0x0603, B:238:0x061f, B:243:0x062e, B:245:0x0636, B:247:0x063c, B:249:0x0642, B:250:0x0661, B:252:0x0667), top: B:427:0x02a3 }] */
            /* JADX WARN: Removed duplicated region for block: B:199:0x04b2 A[Catch: JSONException -> 0x08c3, TryCatch #0 {JSONException -> 0x08c3, blocks: (B:116:0x02a3, B:118:0x02a9, B:121:0x02ae, B:122:0x02b5, B:124:0x02bb, B:127:0x02c2, B:128:0x02c9, B:130:0x02cf, B:134:0x02d8, B:135:0x02df, B:136:0x02f3, B:137:0x0307, B:138:0x031d, B:140:0x0323, B:141:0x0330, B:143:0x0336, B:144:0x033f, B:148:0x034a, B:149:0x0353, B:151:0x0359, B:152:0x0372, B:154:0x0378, B:155:0x0391, B:157:0x0399, B:159:0x039f, B:160:0x03b3, B:162:0x03bb, B:164:0x03c1, B:165:0x03d5, B:167:0x03db, B:168:0x03e9, B:170:0x03ef, B:171:0x03fd, B:173:0x0403, B:174:0x0410, B:176:0x0416, B:177:0x0423, B:179:0x0429, B:180:0x0436, B:182:0x043c, B:184:0x0442, B:185:0x044f, B:186:0x045c, B:187:0x0469, B:189:0x046f, B:190:0x047a, B:192:0x0480, B:193:0x048b, B:195:0x0491, B:196:0x049c, B:198:0x04a2, B:199:0x04b2, B:201:0x04b8, B:202:0x04c8, B:203:0x04d5, B:205:0x04db, B:206:0x04ee, B:209:0x0500, B:211:0x051b, B:212:0x0523, B:214:0x0531, B:217:0x0549, B:219:0x0569, B:220:0x056c, B:221:0x0577, B:223:0x057d, B:225:0x0585, B:226:0x058b, B:227:0x059a, B:229:0x05a6, B:230:0x05a9, B:232:0x05bc, B:233:0x05f7, B:237:0x0603, B:238:0x061f, B:243:0x062e, B:245:0x0636, B:247:0x063c, B:249:0x0642, B:250:0x0661, B:252:0x0667), top: B:427:0x02a3 }] */
            /* JADX WARN: Removed duplicated region for block: B:202:0x04c8 A[Catch: JSONException -> 0x08c3, TryCatch #0 {JSONException -> 0x08c3, blocks: (B:116:0x02a3, B:118:0x02a9, B:121:0x02ae, B:122:0x02b5, B:124:0x02bb, B:127:0x02c2, B:128:0x02c9, B:130:0x02cf, B:134:0x02d8, B:135:0x02df, B:136:0x02f3, B:137:0x0307, B:138:0x031d, B:140:0x0323, B:141:0x0330, B:143:0x0336, B:144:0x033f, B:148:0x034a, B:149:0x0353, B:151:0x0359, B:152:0x0372, B:154:0x0378, B:155:0x0391, B:157:0x0399, B:159:0x039f, B:160:0x03b3, B:162:0x03bb, B:164:0x03c1, B:165:0x03d5, B:167:0x03db, B:168:0x03e9, B:170:0x03ef, B:171:0x03fd, B:173:0x0403, B:174:0x0410, B:176:0x0416, B:177:0x0423, B:179:0x0429, B:180:0x0436, B:182:0x043c, B:184:0x0442, B:185:0x044f, B:186:0x045c, B:187:0x0469, B:189:0x046f, B:190:0x047a, B:192:0x0480, B:193:0x048b, B:195:0x0491, B:196:0x049c, B:198:0x04a2, B:199:0x04b2, B:201:0x04b8, B:202:0x04c8, B:203:0x04d5, B:205:0x04db, B:206:0x04ee, B:209:0x0500, B:211:0x051b, B:212:0x0523, B:214:0x0531, B:217:0x0549, B:219:0x0569, B:220:0x056c, B:221:0x0577, B:223:0x057d, B:225:0x0585, B:226:0x058b, B:227:0x059a, B:229:0x05a6, B:230:0x05a9, B:232:0x05bc, B:233:0x05f7, B:237:0x0603, B:238:0x061f, B:243:0x062e, B:245:0x0636, B:247:0x063c, B:249:0x0642, B:250:0x0661, B:252:0x0667), top: B:427:0x02a3 }] */
            /* JADX WARN: Removed duplicated region for block: B:203:0x04d5 A[Catch: JSONException -> 0x08c3, TryCatch #0 {JSONException -> 0x08c3, blocks: (B:116:0x02a3, B:118:0x02a9, B:121:0x02ae, B:122:0x02b5, B:124:0x02bb, B:127:0x02c2, B:128:0x02c9, B:130:0x02cf, B:134:0x02d8, B:135:0x02df, B:136:0x02f3, B:137:0x0307, B:138:0x031d, B:140:0x0323, B:141:0x0330, B:143:0x0336, B:144:0x033f, B:148:0x034a, B:149:0x0353, B:151:0x0359, B:152:0x0372, B:154:0x0378, B:155:0x0391, B:157:0x0399, B:159:0x039f, B:160:0x03b3, B:162:0x03bb, B:164:0x03c1, B:165:0x03d5, B:167:0x03db, B:168:0x03e9, B:170:0x03ef, B:171:0x03fd, B:173:0x0403, B:174:0x0410, B:176:0x0416, B:177:0x0423, B:179:0x0429, B:180:0x0436, B:182:0x043c, B:184:0x0442, B:185:0x044f, B:186:0x045c, B:187:0x0469, B:189:0x046f, B:190:0x047a, B:192:0x0480, B:193:0x048b, B:195:0x0491, B:196:0x049c, B:198:0x04a2, B:199:0x04b2, B:201:0x04b8, B:202:0x04c8, B:203:0x04d5, B:205:0x04db, B:206:0x04ee, B:209:0x0500, B:211:0x051b, B:212:0x0523, B:214:0x0531, B:217:0x0549, B:219:0x0569, B:220:0x056c, B:221:0x0577, B:223:0x057d, B:225:0x0585, B:226:0x058b, B:227:0x059a, B:229:0x05a6, B:230:0x05a9, B:232:0x05bc, B:233:0x05f7, B:237:0x0603, B:238:0x061f, B:243:0x062e, B:245:0x0636, B:247:0x063c, B:249:0x0642, B:250:0x0661, B:252:0x0667), top: B:427:0x02a3 }] */
            /* JADX WARN: Removed duplicated region for block: B:206:0x04ee A[Catch: JSONException -> 0x08c3, TryCatch #0 {JSONException -> 0x08c3, blocks: (B:116:0x02a3, B:118:0x02a9, B:121:0x02ae, B:122:0x02b5, B:124:0x02bb, B:127:0x02c2, B:128:0x02c9, B:130:0x02cf, B:134:0x02d8, B:135:0x02df, B:136:0x02f3, B:137:0x0307, B:138:0x031d, B:140:0x0323, B:141:0x0330, B:143:0x0336, B:144:0x033f, B:148:0x034a, B:149:0x0353, B:151:0x0359, B:152:0x0372, B:154:0x0378, B:155:0x0391, B:157:0x0399, B:159:0x039f, B:160:0x03b3, B:162:0x03bb, B:164:0x03c1, B:165:0x03d5, B:167:0x03db, B:168:0x03e9, B:170:0x03ef, B:171:0x03fd, B:173:0x0403, B:174:0x0410, B:176:0x0416, B:177:0x0423, B:179:0x0429, B:180:0x0436, B:182:0x043c, B:184:0x0442, B:185:0x044f, B:186:0x045c, B:187:0x0469, B:189:0x046f, B:190:0x047a, B:192:0x0480, B:193:0x048b, B:195:0x0491, B:196:0x049c, B:198:0x04a2, B:199:0x04b2, B:201:0x04b8, B:202:0x04c8, B:203:0x04d5, B:205:0x04db, B:206:0x04ee, B:209:0x0500, B:211:0x051b, B:212:0x0523, B:214:0x0531, B:217:0x0549, B:219:0x0569, B:220:0x056c, B:221:0x0577, B:223:0x057d, B:225:0x0585, B:226:0x058b, B:227:0x059a, B:229:0x05a6, B:230:0x05a9, B:232:0x05bc, B:233:0x05f7, B:237:0x0603, B:238:0x061f, B:243:0x062e, B:245:0x0636, B:247:0x063c, B:249:0x0642, B:250:0x0661, B:252:0x0667), top: B:427:0x02a3 }] */
            /* JADX WARN: Removed duplicated region for block: B:207:0x04fb  */
            /* JADX WARN: Removed duplicated region for block: B:221:0x0577 A[Catch: JSONException -> 0x08c3, TryCatch #0 {JSONException -> 0x08c3, blocks: (B:116:0x02a3, B:118:0x02a9, B:121:0x02ae, B:122:0x02b5, B:124:0x02bb, B:127:0x02c2, B:128:0x02c9, B:130:0x02cf, B:134:0x02d8, B:135:0x02df, B:136:0x02f3, B:137:0x0307, B:138:0x031d, B:140:0x0323, B:141:0x0330, B:143:0x0336, B:144:0x033f, B:148:0x034a, B:149:0x0353, B:151:0x0359, B:152:0x0372, B:154:0x0378, B:155:0x0391, B:157:0x0399, B:159:0x039f, B:160:0x03b3, B:162:0x03bb, B:164:0x03c1, B:165:0x03d5, B:167:0x03db, B:168:0x03e9, B:170:0x03ef, B:171:0x03fd, B:173:0x0403, B:174:0x0410, B:176:0x0416, B:177:0x0423, B:179:0x0429, B:180:0x0436, B:182:0x043c, B:184:0x0442, B:185:0x044f, B:186:0x045c, B:187:0x0469, B:189:0x046f, B:190:0x047a, B:192:0x0480, B:193:0x048b, B:195:0x0491, B:196:0x049c, B:198:0x04a2, B:199:0x04b2, B:201:0x04b8, B:202:0x04c8, B:203:0x04d5, B:205:0x04db, B:206:0x04ee, B:209:0x0500, B:211:0x051b, B:212:0x0523, B:214:0x0531, B:217:0x0549, B:219:0x0569, B:220:0x056c, B:221:0x0577, B:223:0x057d, B:225:0x0585, B:226:0x058b, B:227:0x059a, B:229:0x05a6, B:230:0x05a9, B:232:0x05bc, B:233:0x05f7, B:237:0x0603, B:238:0x061f, B:243:0x062e, B:245:0x0636, B:247:0x063c, B:249:0x0642, B:250:0x0661, B:252:0x0667), top: B:427:0x02a3 }] */
            /* JADX WARN: Removed duplicated region for block: B:227:0x059a A[Catch: JSONException -> 0x08c3, TryCatch #0 {JSONException -> 0x08c3, blocks: (B:116:0x02a3, B:118:0x02a9, B:121:0x02ae, B:122:0x02b5, B:124:0x02bb, B:127:0x02c2, B:128:0x02c9, B:130:0x02cf, B:134:0x02d8, B:135:0x02df, B:136:0x02f3, B:137:0x0307, B:138:0x031d, B:140:0x0323, B:141:0x0330, B:143:0x0336, B:144:0x033f, B:148:0x034a, B:149:0x0353, B:151:0x0359, B:152:0x0372, B:154:0x0378, B:155:0x0391, B:157:0x0399, B:159:0x039f, B:160:0x03b3, B:162:0x03bb, B:164:0x03c1, B:165:0x03d5, B:167:0x03db, B:168:0x03e9, B:170:0x03ef, B:171:0x03fd, B:173:0x0403, B:174:0x0410, B:176:0x0416, B:177:0x0423, B:179:0x0429, B:180:0x0436, B:182:0x043c, B:184:0x0442, B:185:0x044f, B:186:0x045c, B:187:0x0469, B:189:0x046f, B:190:0x047a, B:192:0x0480, B:193:0x048b, B:195:0x0491, B:196:0x049c, B:198:0x04a2, B:199:0x04b2, B:201:0x04b8, B:202:0x04c8, B:203:0x04d5, B:205:0x04db, B:206:0x04ee, B:209:0x0500, B:211:0x051b, B:212:0x0523, B:214:0x0531, B:217:0x0549, B:219:0x0569, B:220:0x056c, B:221:0x0577, B:223:0x057d, B:225:0x0585, B:226:0x058b, B:227:0x059a, B:229:0x05a6, B:230:0x05a9, B:232:0x05bc, B:233:0x05f7, B:237:0x0603, B:238:0x061f, B:243:0x062e, B:245:0x0636, B:247:0x063c, B:249:0x0642, B:250:0x0661, B:252:0x0667), top: B:427:0x02a3 }] */
            /* JADX WARN: Removed duplicated region for block: B:27:0x00aa A[Catch: JSONException -> 0x08bc, FALL_THROUGH, TryCatch #2 {JSONException -> 0x08bc, blocks: (B:26:0x00a5, B:27:0x00aa, B:29:0x00b0, B:32:0x00b5, B:33:0x00bd, B:35:0x00c4, B:39:0x00e0, B:40:0x00fa, B:42:0x0101, B:44:0x0105, B:45:0x010d, B:47:0x0114, B:49:0x011e, B:50:0x0127, B:51:0x013d, B:53:0x0143, B:54:0x014c, B:56:0x0152, B:57:0x015b, B:59:0x0161, B:60:0x016c, B:62:0x0172, B:64:0x0178, B:65:0x017a, B:67:0x0184, B:69:0x018a, B:70:0x018c, B:71:0x0196, B:73:0x019c, B:74:0x01a0, B:75:0x01aa, B:77:0x01b9, B:78:0x01c2, B:79:0x01cb, B:81:0x01da, B:82:0x01e3, B:83:0x01ec, B:85:0x01fb, B:86:0x0204, B:88:0x0210, B:90:0x0217, B:92:0x021b, B:94:0x022c, B:96:0x0232, B:99:0x023e, B:100:0x0247, B:102:0x024f, B:103:0x0258, B:104:0x0263, B:106:0x0269, B:107:0x0276, B:109:0x027c, B:110:0x028f, B:112:0x0295, B:115:0x029a, B:37:0x00ce), top: B:431:0x00a5, inners: #4 }] */
            /* JADX WARN: Removed duplicated region for block: B:33:0x00bd A[Catch: JSONException -> 0x08bc, TryCatch #2 {JSONException -> 0x08bc, blocks: (B:26:0x00a5, B:27:0x00aa, B:29:0x00b0, B:32:0x00b5, B:33:0x00bd, B:35:0x00c4, B:39:0x00e0, B:40:0x00fa, B:42:0x0101, B:44:0x0105, B:45:0x010d, B:47:0x0114, B:49:0x011e, B:50:0x0127, B:51:0x013d, B:53:0x0143, B:54:0x014c, B:56:0x0152, B:57:0x015b, B:59:0x0161, B:60:0x016c, B:62:0x0172, B:64:0x0178, B:65:0x017a, B:67:0x0184, B:69:0x018a, B:70:0x018c, B:71:0x0196, B:73:0x019c, B:74:0x01a0, B:75:0x01aa, B:77:0x01b9, B:78:0x01c2, B:79:0x01cb, B:81:0x01da, B:82:0x01e3, B:83:0x01ec, B:85:0x01fb, B:86:0x0204, B:88:0x0210, B:90:0x0217, B:92:0x021b, B:94:0x022c, B:96:0x0232, B:99:0x023e, B:100:0x0247, B:102:0x024f, B:103:0x0258, B:104:0x0263, B:106:0x0269, B:107:0x0276, B:109:0x027c, B:110:0x028f, B:112:0x0295, B:115:0x029a, B:37:0x00ce), top: B:431:0x00a5, inners: #4 }] */
            /* JADX WARN: Removed duplicated region for block: B:40:0x00fa A[Catch: JSONException -> 0x08bc, TryCatch #2 {JSONException -> 0x08bc, blocks: (B:26:0x00a5, B:27:0x00aa, B:29:0x00b0, B:32:0x00b5, B:33:0x00bd, B:35:0x00c4, B:39:0x00e0, B:40:0x00fa, B:42:0x0101, B:44:0x0105, B:45:0x010d, B:47:0x0114, B:49:0x011e, B:50:0x0127, B:51:0x013d, B:53:0x0143, B:54:0x014c, B:56:0x0152, B:57:0x015b, B:59:0x0161, B:60:0x016c, B:62:0x0172, B:64:0x0178, B:65:0x017a, B:67:0x0184, B:69:0x018a, B:70:0x018c, B:71:0x0196, B:73:0x019c, B:74:0x01a0, B:75:0x01aa, B:77:0x01b9, B:78:0x01c2, B:79:0x01cb, B:81:0x01da, B:82:0x01e3, B:83:0x01ec, B:85:0x01fb, B:86:0x0204, B:88:0x0210, B:90:0x0217, B:92:0x021b, B:94:0x022c, B:96:0x0232, B:99:0x023e, B:100:0x0247, B:102:0x024f, B:103:0x0258, B:104:0x0263, B:106:0x0269, B:107:0x0276, B:109:0x027c, B:110:0x028f, B:112:0x0295, B:115:0x029a, B:37:0x00ce), top: B:431:0x00a5, inners: #4 }] */
            /* JADX WARN: Removed duplicated region for block: B:419:0x08cd  */
            /* JADX WARN: Removed duplicated region for block: B:422:0x08dc  */
            /* JADX WARN: Removed duplicated region for block: B:425:0x08ee  */
            /* JADX WARN: Removed duplicated region for block: B:427:0x02a3 A[EXC_TOP_SPLITTER, SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:429:0x0094 A[EXC_TOP_SPLITTER, SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:440:0x0091 A[SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:45:0x010d A[Catch: JSONException -> 0x08bc, TryCatch #2 {JSONException -> 0x08bc, blocks: (B:26:0x00a5, B:27:0x00aa, B:29:0x00b0, B:32:0x00b5, B:33:0x00bd, B:35:0x00c4, B:39:0x00e0, B:40:0x00fa, B:42:0x0101, B:44:0x0105, B:45:0x010d, B:47:0x0114, B:49:0x011e, B:50:0x0127, B:51:0x013d, B:53:0x0143, B:54:0x014c, B:56:0x0152, B:57:0x015b, B:59:0x0161, B:60:0x016c, B:62:0x0172, B:64:0x0178, B:65:0x017a, B:67:0x0184, B:69:0x018a, B:70:0x018c, B:71:0x0196, B:73:0x019c, B:74:0x01a0, B:75:0x01aa, B:77:0x01b9, B:78:0x01c2, B:79:0x01cb, B:81:0x01da, B:82:0x01e3, B:83:0x01ec, B:85:0x01fb, B:86:0x0204, B:88:0x0210, B:90:0x0217, B:92:0x021b, B:94:0x022c, B:96:0x0232, B:99:0x023e, B:100:0x0247, B:102:0x024f, B:103:0x0258, B:104:0x0263, B:106:0x0269, B:107:0x0276, B:109:0x027c, B:110:0x028f, B:112:0x0295, B:115:0x029a, B:37:0x00ce), top: B:431:0x00a5, inners: #4 }] */
            /* JADX WARN: Removed duplicated region for block: B:50:0x0127 A[Catch: JSONException -> 0x08bc, TryCatch #2 {JSONException -> 0x08bc, blocks: (B:26:0x00a5, B:27:0x00aa, B:29:0x00b0, B:32:0x00b5, B:33:0x00bd, B:35:0x00c4, B:39:0x00e0, B:40:0x00fa, B:42:0x0101, B:44:0x0105, B:45:0x010d, B:47:0x0114, B:49:0x011e, B:50:0x0127, B:51:0x013d, B:53:0x0143, B:54:0x014c, B:56:0x0152, B:57:0x015b, B:59:0x0161, B:60:0x016c, B:62:0x0172, B:64:0x0178, B:65:0x017a, B:67:0x0184, B:69:0x018a, B:70:0x018c, B:71:0x0196, B:73:0x019c, B:74:0x01a0, B:75:0x01aa, B:77:0x01b9, B:78:0x01c2, B:79:0x01cb, B:81:0x01da, B:82:0x01e3, B:83:0x01ec, B:85:0x01fb, B:86:0x0204, B:88:0x0210, B:90:0x0217, B:92:0x021b, B:94:0x022c, B:96:0x0232, B:99:0x023e, B:100:0x0247, B:102:0x024f, B:103:0x0258, B:104:0x0263, B:106:0x0269, B:107:0x0276, B:109:0x027c, B:110:0x028f, B:112:0x0295, B:115:0x029a, B:37:0x00ce), top: B:431:0x00a5, inners: #4 }] */
            /* JADX WARN: Removed duplicated region for block: B:51:0x013d A[Catch: JSONException -> 0x08bc, TryCatch #2 {JSONException -> 0x08bc, blocks: (B:26:0x00a5, B:27:0x00aa, B:29:0x00b0, B:32:0x00b5, B:33:0x00bd, B:35:0x00c4, B:39:0x00e0, B:40:0x00fa, B:42:0x0101, B:44:0x0105, B:45:0x010d, B:47:0x0114, B:49:0x011e, B:50:0x0127, B:51:0x013d, B:53:0x0143, B:54:0x014c, B:56:0x0152, B:57:0x015b, B:59:0x0161, B:60:0x016c, B:62:0x0172, B:64:0x0178, B:65:0x017a, B:67:0x0184, B:69:0x018a, B:70:0x018c, B:71:0x0196, B:73:0x019c, B:74:0x01a0, B:75:0x01aa, B:77:0x01b9, B:78:0x01c2, B:79:0x01cb, B:81:0x01da, B:82:0x01e3, B:83:0x01ec, B:85:0x01fb, B:86:0x0204, B:88:0x0210, B:90:0x0217, B:92:0x021b, B:94:0x022c, B:96:0x0232, B:99:0x023e, B:100:0x0247, B:102:0x024f, B:103:0x0258, B:104:0x0263, B:106:0x0269, B:107:0x0276, B:109:0x027c, B:110:0x028f, B:112:0x0295, B:115:0x029a, B:37:0x00ce), top: B:431:0x00a5, inners: #4 }] */
            /* JADX WARN: Removed duplicated region for block: B:535:? A[RETURN, SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:54:0x014c A[Catch: JSONException -> 0x08bc, TryCatch #2 {JSONException -> 0x08bc, blocks: (B:26:0x00a5, B:27:0x00aa, B:29:0x00b0, B:32:0x00b5, B:33:0x00bd, B:35:0x00c4, B:39:0x00e0, B:40:0x00fa, B:42:0x0101, B:44:0x0105, B:45:0x010d, B:47:0x0114, B:49:0x011e, B:50:0x0127, B:51:0x013d, B:53:0x0143, B:54:0x014c, B:56:0x0152, B:57:0x015b, B:59:0x0161, B:60:0x016c, B:62:0x0172, B:64:0x0178, B:65:0x017a, B:67:0x0184, B:69:0x018a, B:70:0x018c, B:71:0x0196, B:73:0x019c, B:74:0x01a0, B:75:0x01aa, B:77:0x01b9, B:78:0x01c2, B:79:0x01cb, B:81:0x01da, B:82:0x01e3, B:83:0x01ec, B:85:0x01fb, B:86:0x0204, B:88:0x0210, B:90:0x0217, B:92:0x021b, B:94:0x022c, B:96:0x0232, B:99:0x023e, B:100:0x0247, B:102:0x024f, B:103:0x0258, B:104:0x0263, B:106:0x0269, B:107:0x0276, B:109:0x027c, B:110:0x028f, B:112:0x0295, B:115:0x029a, B:37:0x00ce), top: B:431:0x00a5, inners: #4 }] */
            /* JADX WARN: Removed duplicated region for block: B:57:0x015b A[Catch: JSONException -> 0x08bc, TryCatch #2 {JSONException -> 0x08bc, blocks: (B:26:0x00a5, B:27:0x00aa, B:29:0x00b0, B:32:0x00b5, B:33:0x00bd, B:35:0x00c4, B:39:0x00e0, B:40:0x00fa, B:42:0x0101, B:44:0x0105, B:45:0x010d, B:47:0x0114, B:49:0x011e, B:50:0x0127, B:51:0x013d, B:53:0x0143, B:54:0x014c, B:56:0x0152, B:57:0x015b, B:59:0x0161, B:60:0x016c, B:62:0x0172, B:64:0x0178, B:65:0x017a, B:67:0x0184, B:69:0x018a, B:70:0x018c, B:71:0x0196, B:73:0x019c, B:74:0x01a0, B:75:0x01aa, B:77:0x01b9, B:78:0x01c2, B:79:0x01cb, B:81:0x01da, B:82:0x01e3, B:83:0x01ec, B:85:0x01fb, B:86:0x0204, B:88:0x0210, B:90:0x0217, B:92:0x021b, B:94:0x022c, B:96:0x0232, B:99:0x023e, B:100:0x0247, B:102:0x024f, B:103:0x0258, B:104:0x0263, B:106:0x0269, B:107:0x0276, B:109:0x027c, B:110:0x028f, B:112:0x0295, B:115:0x029a, B:37:0x00ce), top: B:431:0x00a5, inners: #4 }] */
            /* JADX WARN: Removed duplicated region for block: B:60:0x016c A[Catch: JSONException -> 0x08bc, TryCatch #2 {JSONException -> 0x08bc, blocks: (B:26:0x00a5, B:27:0x00aa, B:29:0x00b0, B:32:0x00b5, B:33:0x00bd, B:35:0x00c4, B:39:0x00e0, B:40:0x00fa, B:42:0x0101, B:44:0x0105, B:45:0x010d, B:47:0x0114, B:49:0x011e, B:50:0x0127, B:51:0x013d, B:53:0x0143, B:54:0x014c, B:56:0x0152, B:57:0x015b, B:59:0x0161, B:60:0x016c, B:62:0x0172, B:64:0x0178, B:65:0x017a, B:67:0x0184, B:69:0x018a, B:70:0x018c, B:71:0x0196, B:73:0x019c, B:74:0x01a0, B:75:0x01aa, B:77:0x01b9, B:78:0x01c2, B:79:0x01cb, B:81:0x01da, B:82:0x01e3, B:83:0x01ec, B:85:0x01fb, B:86:0x0204, B:88:0x0210, B:90:0x0217, B:92:0x021b, B:94:0x022c, B:96:0x0232, B:99:0x023e, B:100:0x0247, B:102:0x024f, B:103:0x0258, B:104:0x0263, B:106:0x0269, B:107:0x0276, B:109:0x027c, B:110:0x028f, B:112:0x0295, B:115:0x029a, B:37:0x00ce), top: B:431:0x00a5, inners: #4 }] */
            /* JADX WARN: Removed duplicated region for block: B:67:0x0184 A[Catch: JSONException -> 0x08bc, TryCatch #2 {JSONException -> 0x08bc, blocks: (B:26:0x00a5, B:27:0x00aa, B:29:0x00b0, B:32:0x00b5, B:33:0x00bd, B:35:0x00c4, B:39:0x00e0, B:40:0x00fa, B:42:0x0101, B:44:0x0105, B:45:0x010d, B:47:0x0114, B:49:0x011e, B:50:0x0127, B:51:0x013d, B:53:0x0143, B:54:0x014c, B:56:0x0152, B:57:0x015b, B:59:0x0161, B:60:0x016c, B:62:0x0172, B:64:0x0178, B:65:0x017a, B:67:0x0184, B:69:0x018a, B:70:0x018c, B:71:0x0196, B:73:0x019c, B:74:0x01a0, B:75:0x01aa, B:77:0x01b9, B:78:0x01c2, B:79:0x01cb, B:81:0x01da, B:82:0x01e3, B:83:0x01ec, B:85:0x01fb, B:86:0x0204, B:88:0x0210, B:90:0x0217, B:92:0x021b, B:94:0x022c, B:96:0x0232, B:99:0x023e, B:100:0x0247, B:102:0x024f, B:103:0x0258, B:104:0x0263, B:106:0x0269, B:107:0x0276, B:109:0x027c, B:110:0x028f, B:112:0x0295, B:115:0x029a, B:37:0x00ce), top: B:431:0x00a5, inners: #4 }] */
            /* JADX WARN: Removed duplicated region for block: B:71:0x0196 A[Catch: JSONException -> 0x08bc, TryCatch #2 {JSONException -> 0x08bc, blocks: (B:26:0x00a5, B:27:0x00aa, B:29:0x00b0, B:32:0x00b5, B:33:0x00bd, B:35:0x00c4, B:39:0x00e0, B:40:0x00fa, B:42:0x0101, B:44:0x0105, B:45:0x010d, B:47:0x0114, B:49:0x011e, B:50:0x0127, B:51:0x013d, B:53:0x0143, B:54:0x014c, B:56:0x0152, B:57:0x015b, B:59:0x0161, B:60:0x016c, B:62:0x0172, B:64:0x0178, B:65:0x017a, B:67:0x0184, B:69:0x018a, B:70:0x018c, B:71:0x0196, B:73:0x019c, B:74:0x01a0, B:75:0x01aa, B:77:0x01b9, B:78:0x01c2, B:79:0x01cb, B:81:0x01da, B:82:0x01e3, B:83:0x01ec, B:85:0x01fb, B:86:0x0204, B:88:0x0210, B:90:0x0217, B:92:0x021b, B:94:0x022c, B:96:0x0232, B:99:0x023e, B:100:0x0247, B:102:0x024f, B:103:0x0258, B:104:0x0263, B:106:0x0269, B:107:0x0276, B:109:0x027c, B:110:0x028f, B:112:0x0295, B:115:0x029a, B:37:0x00ce), top: B:431:0x00a5, inners: #4 }] */
            /* JADX WARN: Removed duplicated region for block: B:75:0x01aa A[Catch: JSONException -> 0x08bc, TryCatch #2 {JSONException -> 0x08bc, blocks: (B:26:0x00a5, B:27:0x00aa, B:29:0x00b0, B:32:0x00b5, B:33:0x00bd, B:35:0x00c4, B:39:0x00e0, B:40:0x00fa, B:42:0x0101, B:44:0x0105, B:45:0x010d, B:47:0x0114, B:49:0x011e, B:50:0x0127, B:51:0x013d, B:53:0x0143, B:54:0x014c, B:56:0x0152, B:57:0x015b, B:59:0x0161, B:60:0x016c, B:62:0x0172, B:64:0x0178, B:65:0x017a, B:67:0x0184, B:69:0x018a, B:70:0x018c, B:71:0x0196, B:73:0x019c, B:74:0x01a0, B:75:0x01aa, B:77:0x01b9, B:78:0x01c2, B:79:0x01cb, B:81:0x01da, B:82:0x01e3, B:83:0x01ec, B:85:0x01fb, B:86:0x0204, B:88:0x0210, B:90:0x0217, B:92:0x021b, B:94:0x022c, B:96:0x0232, B:99:0x023e, B:100:0x0247, B:102:0x024f, B:103:0x0258, B:104:0x0263, B:106:0x0269, B:107:0x0276, B:109:0x027c, B:110:0x028f, B:112:0x0295, B:115:0x029a, B:37:0x00ce), top: B:431:0x00a5, inners: #4 }] */
            /* JADX WARN: Removed duplicated region for block: B:79:0x01cb A[Catch: JSONException -> 0x08bc, TryCatch #2 {JSONException -> 0x08bc, blocks: (B:26:0x00a5, B:27:0x00aa, B:29:0x00b0, B:32:0x00b5, B:33:0x00bd, B:35:0x00c4, B:39:0x00e0, B:40:0x00fa, B:42:0x0101, B:44:0x0105, B:45:0x010d, B:47:0x0114, B:49:0x011e, B:50:0x0127, B:51:0x013d, B:53:0x0143, B:54:0x014c, B:56:0x0152, B:57:0x015b, B:59:0x0161, B:60:0x016c, B:62:0x0172, B:64:0x0178, B:65:0x017a, B:67:0x0184, B:69:0x018a, B:70:0x018c, B:71:0x0196, B:73:0x019c, B:74:0x01a0, B:75:0x01aa, B:77:0x01b9, B:78:0x01c2, B:79:0x01cb, B:81:0x01da, B:82:0x01e3, B:83:0x01ec, B:85:0x01fb, B:86:0x0204, B:88:0x0210, B:90:0x0217, B:92:0x021b, B:94:0x022c, B:96:0x0232, B:99:0x023e, B:100:0x0247, B:102:0x024f, B:103:0x0258, B:104:0x0263, B:106:0x0269, B:107:0x0276, B:109:0x027c, B:110:0x028f, B:112:0x0295, B:115:0x029a, B:37:0x00ce), top: B:431:0x00a5, inners: #4 }] */
            /* JADX WARN: Removed duplicated region for block: B:83:0x01ec A[Catch: JSONException -> 0x08bc, TryCatch #2 {JSONException -> 0x08bc, blocks: (B:26:0x00a5, B:27:0x00aa, B:29:0x00b0, B:32:0x00b5, B:33:0x00bd, B:35:0x00c4, B:39:0x00e0, B:40:0x00fa, B:42:0x0101, B:44:0x0105, B:45:0x010d, B:47:0x0114, B:49:0x011e, B:50:0x0127, B:51:0x013d, B:53:0x0143, B:54:0x014c, B:56:0x0152, B:57:0x015b, B:59:0x0161, B:60:0x016c, B:62:0x0172, B:64:0x0178, B:65:0x017a, B:67:0x0184, B:69:0x018a, B:70:0x018c, B:71:0x0196, B:73:0x019c, B:74:0x01a0, B:75:0x01aa, B:77:0x01b9, B:78:0x01c2, B:79:0x01cb, B:81:0x01da, B:82:0x01e3, B:83:0x01ec, B:85:0x01fb, B:86:0x0204, B:88:0x0210, B:90:0x0217, B:92:0x021b, B:94:0x022c, B:96:0x0232, B:99:0x023e, B:100:0x0247, B:102:0x024f, B:103:0x0258, B:104:0x0263, B:106:0x0269, B:107:0x0276, B:109:0x027c, B:110:0x028f, B:112:0x0295, B:115:0x029a, B:37:0x00ce), top: B:431:0x00a5, inners: #4 }] */
            /* JADX WARN: Type inference failed for: r12v1, types: [T] */
            /* JADX WARN: Type inference failed for: r12v8 */
            /* JADX WARN: Type inference failed for: r12v9 */
            /* JADX WARN: Type inference fix 'apply assigned field type' failed
            java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
            	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
            	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
            	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
             */
            /*  JADX ERROR: UnsupportedOperationException in pass: RegionMakerVisitor
                java.lang.UnsupportedOperationException
                	at java.base/java.util.Collections$UnmodifiableCollection.add(Unknown Source)
                	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker$1.leaveRegion(SwitchRegionMaker.java:390)
                	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:70)
                	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
                	at java.base/java.util.ArrayList.forEach(Unknown Source)
                	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
                	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:23)
                	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.insertBreaksForCase(SwitchRegionMaker.java:370)
                	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.insertBreaks(SwitchRegionMaker.java:85)
                	at jadx.core.dex.visitors.regions.PostProcessRegions.leaveRegion(PostProcessRegions.java:33)
                	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:70)
                	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
                	at java.base/java.util.ArrayList.forEach(Unknown Source)
                	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
                	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
                	at java.base/java.util.ArrayList.forEach(Unknown Source)
                	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Unknown Source)
                	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
                	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
                	at java.base/java.util.ArrayList.forEach(Unknown Source)
                	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
                	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
                	at java.base/java.util.ArrayList.forEach(Unknown Source)
                	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
                	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
                	at java.base/java.util.ArrayList.forEach(Unknown Source)
                	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
                	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
                	at java.base/java.util.ArrayList.forEach(Unknown Source)
                	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Unknown Source)
                	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
                	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
                	at java.base/java.util.ArrayList.forEach(Unknown Source)
                	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
                	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
                	at java.base/java.util.ArrayList.forEach(Unknown Source)
                	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Unknown Source)
                	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
                	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
                	at java.base/java.util.ArrayList.forEach(Unknown Source)
                	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
                	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:19)
                	at jadx.core.dex.visitors.regions.PostProcessRegions.process(PostProcessRegions.java:23)
                	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:31)
                */
            @Override // com.bytedance.vcloud.strategy.ILiveFeatureBundle
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final <T> T getAppInfoForKey(java.lang.String r42, T r43) {
                /*
                    Method dump skipped, instruction units count: 2604
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C1698540uIm.getAppInfoForKey(java.lang.String, java.lang.Object):java.lang.Object");
            }
        };
        this.C1 = 0;
        this.D1 = 0;
        this.E1 = 0;
        this.F1 = -1;
        this.G1 = -1L;
        this.H1 = 0.0f;
        this.I1 = -1.0f;
        this.J1 = true;
        this.K1 = -1.0f;
        this.L1 = 0;
        this.M1 = 0;
        this.N1 = -1L;
        this.O1 = "none";
        this.P1 = -1L;
        this.Q1 = true;
        this.R1 = false;
        this.S1 = 0;
        this.T1 = "none";
        this.U1 = 0;
        this.V1 = 0;
        this.W1 = 0;
        this.X1 = 1;
        this.Y1 = 0;
        this.Z1 = 0;
        this.a2 = 0;
        this.b2 = "ABRNoFirstFrame";
        this.c2 = new CopyOnWriteArrayList();
        this.d2 = 0.5f;
        this.e2 = 0L;
        this.f2 = 0;
        this.g2 = 0;
        this.h2 = 0;
        this.i2 = new CopyOnWriteArrayList();
        this.j2 = new CopyOnWriteArrayList();
        this.k2 = 0;
        this.l2 = "unknown";
        this.m2 = 0;
        this.f453n2 = 0;
        this.o2 = 0;
        this.f456p2 = 0;
        this.q2 = 0;
        this.r2 = null;
        this.t2 = null;
        this.u2 = -1.0f;
        this.v2 = false;
        this.w2 = false;
        this.x2 = 0;
        this.y2 = 10;
        this.z2 = 20000;
        this.A2 = C538540LAe.LLJJJIL;
        this.B2 = 5000;
        this.C2 = LSPassThroughRecordSizeConfig.DEFAULT;
        this.D2 = 10000;
        this.E2 = Mp4ScreenVideoLoadTimeout.CONTROL;
        this.F2 = 0;
        this.G2 = 0;
        this.H2 = "";
        this.I2 = -1;
        this.J2 = -1;
        this.K2 = false;
        this.L2 = C0IJ8.VeLivePlayerRotation0;
        this.M2 = true;
        this.N2 = -1L;
        this.P2 = null;
        this.Q2 = null;
        this.R2 = null;
        this.S2 = null;
        this.T2 = false;
        this.U2 = null;
        this.V2 = 0;
        this.W2 = 0;
        this.X2 = "";
        this.Y2 = null;
        this.Z2 = null;
        this.f448a3 = new HashMap();
        this.b3 = null;
        this.c3 = null;
        this.d3 = null;
        this.e3 = null;
        this.f3 = false;
        this.g3 = null;
        this.j3 = false;
        Context context = c1698820uJE.LIZ;
        this.LJIJI = context;
        InterfaceC1698710uJ3 interfaceC1698710uJ3 = c1698820uJE.LIZIZ;
        this.LJIJJ = interfaceC1698710uJ3;
        InterfaceC1699150uJl interfaceC1699150uJl = c1698820uJE.LIZLLL;
        this.LJIJJLI = interfaceC1699150uJl;
        C1470760oNO c1470760oNO = new C1470760oNO(context);
        this.y = c1470760oNO;
        c1470760oNO.LIZ = true;
        this.LLIIIJ = new C1698700uJ2();
        if (StrategyCenter.getInstance().getIntValue(55422, 0) == 1) {
            z = true;
        } else {
            z = false;
        }
        this.C = z;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("[ConfigCenter] mEnableDIDConfiguration = ");
        sbLIZ.append(this.C);
        C2188811AlT.LIZIZ(sbLIZ);
        C1698940uJQ.LIZJ();
        if (this.C) {
            LiveConfigCenterWrapper.getInstance().registerDIDParserRules();
            this.i3 = LiveConfigCenterWrapper.getInstance().getDIDConfig();
        }
        if (StrategyCenter.getInstance().getIntValue(55405, 0) == 1) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.B = z2;
        if (StrategyCenter.getInstance().getIntValue(55432, 0) == 1) {
            z3 = true;
        } else {
            z3 = false;
        }
        this.D = z3;
        this.E = ((Boolean) C1474810oTv.E5.getValue()).booleanValue();
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("[CmafConfigCenter] enable=");
        sbLIZ2.append(this.E);
        C2188811AlT.LIZIZ(sbLIZ2);
        C1698940uJQ.LIZJ();
        this.LLILZ = ((Number) C1474810oTv.F5.getValue()).intValue();
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append("[renderTypeConfigCenter] rendertype=");
        sbLIZ3.append(this.LLILZ);
        C2188811AlT.LIZIZ(sbLIZ3);
        C1698940uJQ.LIZJ();
        StringBuilder sbLIZ4 = C2188811AlT.LIZ();
        sbLIZ4.append("[ConfigCenter] initVVConfiguration mEnableVVConfiguration = ");
        sbLIZ4.append(this.B);
        C2188811AlT.LIZIZ(sbLIZ4);
        C1698940uJQ.LIZJ();
        if (this.B) {
            C1698940uJQ.LIZJ();
            LiveConfigCenterWrapper.getInstance().registerParserRules();
            this.h3 = LiveConfigCenterWrapper.getInstance().getVVConfig("default");
        }
        if ((this.B || this.C) && this.D) {
            StringBuilder sbLIZ5 = C2188811AlT.LIZ();
            sbLIZ5.append("[ConfigCenter] enabling player ConfigCenter (VV=");
            sbLIZ5.append(this.B);
            sbLIZ5.append(", DID=");
            sbLIZ5.append(this.C);
            sbLIZ5.append(", LivePlayerConfigCenter=");
            sbLIZ5.append(this.D);
            sbLIZ5.append(")");
            C2188811AlT.LIZIZ(sbLIZ5);
            C1698940uJQ.LIZJ();
            C1470430oMr.LJJI(1397, 1);
        }
        c1698820uJE.LJI = 10000L;
        if (interfaceC1699150uJl != null) {
            this.f = ((Integer) interfaceC1699150uJl.LIZ(0, "live_sdk_enable_log_strategy_center")).intValue();
            this.LJJJ = ((Integer) interfaceC1699150uJl.LIZ(0, "live_sdk_enable_all_surface_control")).intValue();
            int iIntValue = ((Integer) interfaceC1699150uJl.LIZ(0, "live_sdk_enable_player_surface_control_pool")).intValue();
            AtomicBoolean atomicBoolean = this.LJJIL;
            if (iIntValue == 1) {
                z4 = true;
            } else {
                z4 = false;
            }
            atomicBoolean.set(z4);
            int iIntValue2 = ((Integer) interfaceC1699150uJl.LIZ(0, "live_sdk_enable_pre_create_surface_control")).intValue();
            AtomicBoolean atomicBoolean2 = this.LJJIZ;
            if (iIntValue2 == 1) {
                z5 = true;
            } else {
                z5 = false;
            }
            atomicBoolean2.set(z5);
            StringBuilder sbLIZ6 = C2188811AlT.LIZ();
            sbLIZ6.append("all surface control:");
            sbLIZ6.append(this.LJJJ);
            sbLIZ6.append(", kernel surface control:");
            sbLIZ6.append(this.LJJIL.get());
            C2188811AlT.LIZIZ(sbLIZ6);
            C1698940uJQ.LIZJ();
        }
        LiveLoggerService liveLoggerService = new LiveLoggerService(this, interfaceC1698710uJ3, c1698820uJE.LJI, context);
        this.LJIILLIIL = liveLoggerService;
        liveLoggerService.LLJJIII = null;
        liveLoggerService.J0 = interfaceC1699150uJl;
        this.x = new C1698650uIx();
        this.LJIILIIL = new BPEAHandler(Looper.myLooper());
        TimeUnit timeUnit = TimeUnit.SECONDS;
        C822650WOx c822650WOx = new C822650WOx(1, 3, 60L, timeUnit, new LinkedBlockingDeque(), new ThreadFactory() { // from class: X.0k5c
            @Override // java.util.concurrent.ThreadFactory
            public final Thread newThread(Runnable runnable) {
                BPEAThread bPEAThread = new BPEAThread(runnable, "VideoLiveManager");
                ThreadMethodProxy.setPriority(bPEAThread, 10);
                return bPEAThread;
            }
        });
        this.D0 = c822650WOx;
        StringBuilder sbLIZ7 = C2188811AlT.LIZ();
        sbLIZ7.append("GlobalLiveThreadPool.getHighPriorityPool: ");
        sbLIZ7.append(c822650WOx);
        C1481110oe5.LIZIZ("VideoLiveManager", C2188811AlT.LIZIZ(sbLIZ7));
        this.LJJ = new RetryProcessor(new C1698620uIu(this), c1698820uJE.LJFF, c1698820uJE.LJI, liveLoggerService);
        this.LJJIFFI = new C1698780uJA(context);
        this.LLLLZ = c1698820uJE.LJ;
        C1286540jaG c1286540jaG = new C1286540jaG(c822650WOx, c1698820uJE.LIZJ);
        this.LJIL = c1286540jaG;
        c1286540jaG.LJI();
        this.LLJJ = "flv";
        this.LLJILJIL = "origin";
        this.LJLLLL = 0;
        this.LJLZ = false;
        this.LLI = true;
        this.P0 = hashCode();
        this.s2 = new C1286530jaF();
        if (C1470860oNY.LIZIZ == null && C1470860oNY.LIZIZ == null) {
            synchronized (C1470860oNY.class) {
                try {
                    if (C1470860oNY.LIZIZ == null) {
                        if (C1470860oNY.LIZLLL == null) {
                            C1470870oNZ c1470870oNZ = new C1470870oNZ();
                            C1470860oNY.LIZLLL = c1470870oNZ;
                            c1470870oNZ.LIZ = 19;
                            c1470870oNZ.LIZIZ = 1;
                            c1470870oNZ.LIZJ = 1;
                        }
                        C1470870oNZ c1470870oNZ2 = C1470860oNY.LIZLLL;
                        C1470860oNY.LIZIZ = new C822650WOx(c1470870oNZ2.LIZIZ, c1470870oNZ2.LIZJ, 60L, timeUnit, new LinkedBlockingQueue(), new ThreadFactory() { // from class: X.0oNX
                            @Override // java.util.concurrent.ThreadFactory
                            public final Thread newThread(Runnable runnable) {
                                return new BPEAThread(new RunnableC788190Uvx(runnable, C1470860oNY.LIZLLL.LIZ), "VideoLiveManager-L");
                            }
                        });
                    }
                } finally {
                    TryCatchGuardChecker.doCheck(th);
                }
            }
        }
        C822650WOx c822650WOx2 = C1470860oNY.LIZIZ;
        this.s2.LIZ = c822650WOx2;
        StringBuilder sbLIZ8 = C2188811AlT.LIZ();
        sbLIZ8.append("GlobalLiveThreadPool.getLowPriorityPool: ");
        sbLIZ8.append(c822650WOx2);
        C1481110oe5.LIZIZ("VideoLiveManager", C2188811AlT.LIZIZ(sbLIZ8));
        C1286530jaF c1286530jaF = this.s2;
        c1286530jaF.LIZIZ = interfaceC1698710uJ3;
        liveLoggerService.Q = c1286530jaF;
        this.LLZZLLIL = new C794300VDw();
        if (context != null) {
            try {
                if (C838410Wul.LIZ(context, "android.permission.ACCESS_NETWORK_STATE") == 0 && i2 >= 24 && C789860Uye.LIZ == null) {
                    C789860Uye.LIZ = (ConnectivityManager) C786410Ut5.H2(context, "connectivity");
                }
            } catch (Throwable th) {
            }
        }
        this.c = c1698820uJE.LJII;
        LLJJIJIL();
        LJLIIIL();
    }

    public static JSONArray LJLIL(String str) {
        try {
            ArrayList arrayList = new ArrayList();
            while (true) {
                JSONObject jSONObject = new JSONObject();
                int iIndexOf = str.indexOf("index:");
                int iIndexOf2 = str.indexOf(",pts_diff:");
                if (iIndexOf >= 0 && iIndexOf2 >= 0 && iIndexOf < iIndexOf2) {
                    jSONObject.put("index", CastIntegerProtector.parseInt(str.substring(iIndexOf + 6, iIndexOf2)));
                    String strSubstring = str.substring(iIndexOf2);
                    int iIndexOf3 = strSubstring.indexOf(",drop_dur:");
                    if (iIndexOf3 >= 0 && 10 < iIndexOf3) {
                        jSONObject.put("pts_diff", CastLongProtector.parseLong(strSubstring.substring(10, iIndexOf3)));
                        String strSubstring2 = strSubstring.substring(iIndexOf3);
                        int iIndexOf4 = strSubstring2.indexOf(",key:");
                        if (iIndexOf4 >= 0 && 10 < iIndexOf4) {
                            jSONObject.put("drop_dur", CastLongProtector.parseLong(strSubstring2.substring(10, iIndexOf4)));
                            String strSubstring3 = strSubstring2.substring(iIndexOf4);
                            int iIndexOf5 = strSubstring3.indexOf(",index:");
                            if (iIndexOf5 != -1) {
                                if (5 >= iIndexOf5) {
                                    break;
                                }
                                jSONObject.put("key_frame", CastIntegerProtector.parseInt(strSubstring3.substring(5, iIndexOf5)));
                                arrayList.add(jSONObject);
                                str = strSubstring3.substring(iIndexOf5 + 1);
                            } else if (strSubstring3.length() != 0) {
                                String strSubstring4 = strSubstring3.substring(5);
                                jSONObject.put("key_frame", CastIntegerProtector.parseInt(strSubstring4));
                                arrayList.add(jSONObject);
                                StringBuilder sbLIZ = C2188811AlT.LIZ();
                                sbLIZ.append("key: ");
                                sbLIZ.append(strSubstring4);
                                C2188811AlT.LIZIZ(sbLIZ);
                                C1698940uJQ.LIZJ();
                            }
                        } else {
                            break;
                        }
                    } else {
                        break;
                    }
                } else {
                    break;
                }
            }
            return new JSONArray((Collection) arrayList);
        } catch (JSONException e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }

    public final void LJIILJJIL(JSONObject jSONObject) {
        int i;
        if (!jSONObject.has("Enabled") || jSONObject.optInt("Enabled") != 1) {
            return;
        }
        if (jSONObject.has("HurryType")) {
            if (jSONObject.optInt("HurryType", 0) == 1) {
                i = 1;
            } else {
                i = 0;
            }
            this.LJLIL = i;
        } else {
            this.LJLIL = 0;
        }
        LiveLoggerService liveLoggerService = this.LJIILLIIL;
        int i2 = this.LJLIL;
        liveLoggerService.LLLLIILL = i2;
        ((C1470430oMr) this.LIZLLL).LIZJ(84, i2);
        if (jSONObject.has("HurryTime")) {
            int iOptInt = jSONObject.optInt("HurryTime");
            this.LJLILLLLZI = iOptInt;
            ((C1470430oMr) this.LIZLLL).LIZJ(15, iOptInt);
            this.LJIILLIIL.LLLLIIL = this.LJLILLLLZI;
        }
        if (jSONObject.has("HurryMillisecond")) {
            int iOptInt2 = jSONObject.optInt("HurryMillisecond");
            this.LJLILLLLZI = iOptInt2;
            ((C1470430oMr) this.LIZLLL).LIZJ(397, iOptInt2);
            this.LJIILLIIL.LLLLIIL = this.LJLILLLLZI;
        }
        if (jSONObject.has("HurryInterval")) {
            int iOptInt3 = jSONObject.optInt("HurryInterval");
            this.LJLJI = iOptInt3;
            this.LJIILLIIL.LLLLIILLL = iOptInt3;
            ((C1470430oMr) this.LIZLLL).LIZJ(1060, iOptInt3);
        }
        if (jSONObject.has("HurryOnceMax")) {
            int iOptInt4 = jSONObject.optInt("HurryOnceMax");
            this.LJLJJI = iOptInt4;
            this.LJIILLIIL.LLLLIL = iOptInt4;
            ((C1470430oMr) this.LIZLLL).LIZJ(1061, iOptInt4);
        }
        if (jSONObject.has("HurryCacheType")) {
            int iOptInt5 = jSONObject.optInt("HurryCacheType");
            this.LJLJJLL = iOptInt5;
            this.LJIILLIIL.LLLLJ = iOptInt5;
            ((C1470430oMr) this.LIZLLL).LIZJ(1064, iOptInt5);
        }
        if (jSONObject.has("HurryLogEnable")) {
            this.LJIILLIIL.LLLLLJIL = jSONObject.optInt("HurryCacheType", 0);
        }
        if (jSONObject.has("HurryStartMs")) {
            int iOptInt6 = jSONObject.optInt("HurryStartMs");
            this.LJLJJL = iOptInt6;
            this.LJIILLIIL.LLLLILI = iOptInt6;
            ((C1470430oMr) this.LIZLLL).LIZJ(1062, iOptInt6);
        }
        if (jSONObject.has("HurrySpeed")) {
            float f = CastFloatProtector.parseFloat(jSONObject.optString("HurrySpeed"));
            this.LJLJL = f;
            ((C1470430oMr) this.LIZLLL).LJIL(f, 80);
            this.LJIILLIIL.getClass();
        }
        if (jSONObject.has("SlowTime")) {
            int iOptInt7 = jSONObject.optInt("SlowTime");
            this.LJLJLJ = iOptInt7;
            ((C1470430oMr) this.LIZLLL).LIZJ(190, iOptInt7);
            this.LJIILLIIL.LLLLLJLJLL = this.LJLJLJ;
        }
        if (jSONObject.has("SlowMillisecond")) {
            int iOptInt8 = jSONObject.optInt("SlowMillisecond");
            this.LJLJLJ = iOptInt8;
            ((C1470430oMr) this.LIZLLL).LIZJ(398, iOptInt8);
            this.LJIILLIIL.LLLLLJLJLL = this.LJLJLJ;
        }
        if (jSONObject.has("SlowSpeed")) {
            try {
                float f2 = CastFloatProtector.parseFloat(jSONObject.optString("SlowSpeed"));
                this.LJLJLLL = f2;
                ((C1470430oMr) this.LIZLLL).LJIL(f2, 191);
                this.LJIILLIIL.LLLLLL = this.LJLJLLL;
            } catch (NumberFormatException e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        if (jSONObject.has("HurryStopType")) {
            int iOptInt9 = jSONObject.optInt("HurryStopType");
            ((C1470430oMr) this.LIZLLL).LIZJ(1065, iOptInt9);
            this.LJIILLIIL.LLLLLLIL = iOptInt9;
        }
        if (jSONObject.has("MinBufferStopDrop")) {
            int iOptInt10 = jSONObject.optInt("MinBufferStopDrop");
            ((C1470430oMr) this.LIZLLL).LIZJ(1068, iOptInt10);
            this.LJIILLIIL.LLLLLLJ = iOptInt10;
        }
        if (jSONObject.has("MaxDropFrameCost")) {
            int iOptInt11 = jSONObject.optInt("MaxDropFrameCost");
            ((C1470430oMr) this.LIZLLL).LIZJ(1069, iOptInt11);
            this.LJIILLIIL.LLLLLLL = iOptInt11;
        }
        ((C1470430oMr) this.LIZLLL).LIZJ(1078, 1);
        this.LJIILLIIL.getClass();
        if (jSONObject.has("EnableSkipOnBufferingEnd")) {
            ((C1470430oMr) this.LIZLLL).LIZJ(1067, jSONObject.optInt("EnableSkipOnBufferingEnd"));
            this.LJIILLIIL.LLLLIIIILLL = jSONObject.optInt("EnableSkipOnBufferingEnd");
        }
        if (jSONObject.has("EnableCheckDropTimeCost")) {
            ((C1470430oMr) this.LIZLLL).LIZJ(1077, jSONObject.optInt("EnableCheckDropTimeCost"));
        }
        if (jSONObject.has("BufferingStartIDLTime")) {
            ((C1470430oMr) this.LIZLLL).LIZJ(1066, jSONObject.optInt("BufferingStartIDLTime"));
            LiveLoggerService liveLoggerService2 = this.LJIILLIIL;
            jSONObject.optInt("BufferingStartIDLTime");
            liveLoggerService2.getClass();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:111:0x0225  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0236  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0246  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0249  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0285  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x028f  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0292  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0394 A[PHI: r4 r6 r8
      0x0394: PHI (r4v10 long) = (r4v9 long), (r4v12 long) binds: [B:182:0x0389, B:120:0x0244] A[DONT_GENERATE, DONT_INLINE]
      0x0394: PHI (r6v5 boolean) = (r6v4 boolean), (r6v7 boolean) binds: [B:182:0x0389, B:120:0x0244] A[DONT_GENERATE, DONT_INLINE]
      0x0394: PHI (r8v6 org.json.JSONObject) = (r8v3 org.json.JSONObject), (r8v8 org.json.JSONObject) binds: [B:182:0x0389, B:120:0x0244] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:185:0x039c  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x03f1  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x0401  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x0409  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x040e  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x0416  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x0455  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x045b  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x046f A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:230:0x048e  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x049e  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x04a8  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x04d5  */
    /* JADX WARN: Removed duplicated region for block: B:264:0x050e  */
    /* JADX WARN: Removed duplicated region for block: B:266:0x0514  */
    /* JADX WARN: Removed duplicated region for block: B:329:0x0664  */
    /* JADX WARN: Removed duplicated region for block: B:335:0x0676  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJIJIIJIL(java.lang.String r23) {
        /*
            Method dump skipped, instruction units count: 1725
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.videoarch.liveplayer.VideoLiveManager.LJJIJIIJIL(java.lang.String):void");
    }

    public final void LJJIJL(String str) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("_reset from ");
        sbLIZ.append(str);
        sbLIZ.append(" -- ");
        sbLIZ.append(this.P0);
        C2188811AlT.LIZIZ(sbLIZ);
        C1698940uJQ.LIZJ();
        LJJJJ();
        if (this.LIZLLL != null && this.LLZL > 0 && this.LJJJJL == 1) {
            C1698940uJQ.LIZJ();
            ((C1470430oMr) this.LIZLLL).LIZJ(1091, 1);
        }
        InterfaceC1467950oIr interfaceC1467950oIr = this.LIZLLL;
        if (interfaceC1467950oIr != null) {
            ((C1470430oMr) interfaceC1467950oIr).LIZJ(1349, 0);
        }
        LJJIJLIJ();
        LJJJIL(str);
        this.LLJILJILJ = -1;
        this.LJIIIIZZ = EnumC1487710ooj.IDLE;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final void LJJJ(String str) {
        if (!this.LJZI.equals("abr_bb_4live") || !this.LJLZ || TextUtils.isEmpty(str)) {
            return;
        }
        String str2 = str;
        while (!TextUtils.isEmpty(str2)) {
            if ((this.M2 && this.LJJII.LJJIFFI(str2)) || !TextUtils.isEmpty(this.LJJII.LJIIJJI(str2, this.LLJJ, this.LLJILLL, this.LLJZIJLIL))) {
                this.LJJII.LJJIIJ(str2);
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("set default resolution: ");
                sbLIZ.append(str2);
                C2188811AlT.LIZIZ(sbLIZ);
                C1698940uJQ.LIZJ();
                this.LJIILLIIL.J1 = this.LJJII.LJI();
                return;
            }
            str2.getClass();
            switch (str2.hashCode()) {
                case -1008619738:
                    if (str2.equals("origin")) {
                        str2 = "uhd";
                    } else {
                        str2 = null;
                    }
                    break;
                case 3324:
                    if (str2.equals("hd")) {
                        str2 = "sd";
                    } else {
                        str2 = null;
                    }
                    break;
                case 3665:
                    if (str2.equals("sd")) {
                        str2 = "ld";
                    } else {
                        str2 = null;
                    }
                    break;
                case 115761:
                    if (str2.equals("uhd")) {
                        str2 = "hd";
                    } else {
                        str2 = null;
                    }
                    break;
                default:
                    str2 = null;
                    break;
            }
        }
        while (!TextUtils.isEmpty(str)) {
            if (!TextUtils.isEmpty(this.LJJII.LJIIJJI(str, this.LLJJ, this.LLJILLL, this.LLJZIJLIL))) {
                this.LJJII.LJJIIJ(str);
                this.LJIILLIIL.J1 = this.LJJII.LJI();
                return;
            }
            str.getClass();
            switch (str.hashCode()) {
                case 3324:
                    if (str.equals("hd")) {
                        str = "uhd";
                    } else {
                        str = null;
                    }
                    break;
                case 3448:
                    if (str.equals("ld")) {
                        str = "sd";
                    } else {
                        str = null;
                    }
                    break;
                case 3665:
                    if (str.equals("sd")) {
                        str = "hd";
                    } else {
                        str = null;
                    }
                    break;
                case 115761:
                    if (str.equals("uhd")) {
                        str = "origin";
                    } else {
                        str = null;
                    }
                    break;
                default:
                    str = null;
                    break;
            }
        }
        if (TextUtils.isEmpty(str)) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append(str);
            sbLIZ2.append(" not found");
            C2188811AlT.LIZIZ(sbLIZ2);
            C1698940uJQ.LJ();
        }
    }

    public final void LJJJIL(String str) {
        String str2;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("_stopLiveManager from: ");
        sbLIZ.append(str);
        sbLIZ.append(" -- ");
        sbLIZ.append(this.P0);
        C2188811AlT.LIZIZ(sbLIZ);
        C1698940uJQ.LIZJ();
        int i = 1;
        if (this.LLZZ == 1) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("release strategy FeatureDataBundle, call from: ");
            sbLIZ2.append(str);
            sbLIZ2.append(" -- ");
            sbLIZ2.append(this.P0);
            C2188811AlT.LIZIZ(sbLIZ2);
            C1698940uJQ.LIZJ();
            if (C1474810oTv.LJLJLLL()) {
                str2 = this.LJJIII.LIZIZ;
            } else {
                str2 = this.LJIILLIIL.LLLLZLLLI;
            }
            if (!TextUtils.isEmpty(str2)) {
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("releaseFeatureDataBundleWithUniqueId with ");
                sbLIZ3.append(this.LLIIL);
                sbLIZ3.append("--");
                sbLIZ3.append(this.P0);
                sbLIZ3.append("--");
                sbLIZ3.append(str2);
                C2188811AlT.LIZIZ(sbLIZ3);
                C1698940uJQ.LIZJ();
                StrategyCenter.getInstance().removeLiveMediaSessionBundle(this.LLIIL, str2);
            }
        }
        EnumC1487710ooj enumC1487710ooj = this.LJIIIIZZ;
        if (enumC1487710ooj == EnumC1487710ooj.PLAYED || enumC1487710ooj == EnumC1487710ooj.PAUSED || (this.j3 && enumC1487710ooj == EnumC1487710ooj.PREPARING)) {
            C1698940uJQ.LIZ();
            LLJZIJLIL();
            LJJJJZ(this.LJIILLIIL.LLLZZ);
            this.LJIILLIIL.LJJLI();
            if (this.LJLLLLLL) {
                this.LJIILLIIL.LJJL(0);
            }
            InterfaceC1467950oIr interfaceC1467950oIr = this.LIZLLL;
            if (interfaceC1467950oIr != null) {
                LiveLoggerService liveLoggerService = this.LJIILLIIL;
                liveLoggerService.c6 = ((C1470430oMr) interfaceC1467950oIr).LJIILIIL(liveLoggerService.c6, 645);
                this.LJIILJJIL = 0;
                ((C1470430oMr) this.LIZLLL).LIZJ(669, 0);
                ((C1470430oMr) this.LIZLLL).LIZJ(650, 0);
            }
            this.LJIILLIIL.t1 = this.LLJJIJIL;
            if (LLJJJJ()) {
                long jCurrentTimeMillis = System.currentTimeMillis() - this.LLIIIJ.LJII;
                StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                sbLIZ4.append("[reset] in-progress main-backup switch on quit - quit_to_switch_latency=");
                sbLIZ4.append(jCurrentTimeMillis);
                C2188811AlT.LIZIZ(sbLIZ4);
                C1698940uJQ.LIZJ();
                C1698680uJ0 c1698680uJ0 = this.LJIILLIIL.c7;
                EnumC1699210uJr enumC1699210uJr = this.LLIIIJ.LJI;
                c1698680uJ0.getClass();
                StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                sbLIZ5.append("[updateOnPreSwitchQuit] - context=");
                sbLIZ5.append(enumC1699210uJr);
                sbLIZ5.append(", quit_to_switch_latency=");
                sbLIZ5.append(jCurrentTimeMillis);
                C2188811AlT.LIZIZ(sbLIZ5);
                C1698940uJQ.LIZJ();
                if (enumC1699210uJr == EnumC1699210uJr.IN_FEED) {
                    c1698680uJ0.LIZ.LJ = 1;
                } else {
                    C1698890uJL c1698890uJL = c1698680uJ0.LIZIZ;
                    c1698890uJL.LJIIJ = 1;
                    c1698890uJL.LJIIJJI = jCurrentTimeMillis;
                }
                this.LLIIIJ.LIZ();
            }
            LiveLoggerService liveLoggerService2 = this.LJIILLIIL;
            if (liveLoggerService2.LLIZLLLIL) {
                liveLoggerService2.LLIZLLLIL = false;
                liveLoggerService2.LL.removeCallbacksAndMessages(null);
                LiveLoggerService.MyNTPTask myNTPTask = liveLoggerService2.R;
                if (myNTPTask != null) {
                    myNTPTask.LIZIZ.removeCallbacksAndMessages(null);
                }
                liveLoggerService2.U = false;
                LiveLoggerService.A7.set(System.currentTimeMillis());
            }
            LinkedBlockingQueue<Long> linkedBlockingQueue = liveLoggerService2.s3;
            if (linkedBlockingQueue != null) {
                linkedBlockingQueue.clear();
                liveLoggerService2.s3 = null;
            }
            liveLoggerService2.u3 = -1L;
            liveLoggerService2.v3 = -1;
            liveLoggerService2.t3 = -1;
            liveLoggerService2.LJJLIIIJ(str);
            liveLoggerService2.LJJZ();
            liveLoggerService2.g7 = null;
        }
        this.LJJ.LIZLLL();
        this.f3 = false;
        ARunnableS123S0100000_23 aRunnableS123S0100000_23 = this.e3;
        if (aRunnableS123S0100000_23 != null) {
            this.LJIILIIL.removeCallbacks(aRunnableS123S0100000_23);
            this.e3 = null;
        }
        LLLLLZIL();
        this.c3 = null;
        String strLJIILIIL = this.LJJII.LJIILIIL();
        if (strLJIILIIL != null && !strLJIILIIL.isEmpty()) {
            LJLZ().removeSignalingCallback(strLJIILIIL);
        } else {
            C1698940uJQ.LIZJ();
        }
        if (str.equals("reset")) {
            C1698510uIj c1698510uIj = this.LJJII;
            c1698510uIj.LJ = 0;
            c1698510uIj.LIZJ = null;
            c1698510uIj.LIZIZ = null;
            c1698510uIj.LIZ = null;
        }
        this.h = 0.0d;
        this.i = 0;
        this.j = 0;
        this.k = 0L;
        if (C1474810oTv.LJLJLLL()) {
            C1698770uJ9 c1698770uJ9 = this.LJJIII;
            StringBuilder sbLIZ6 = C2188811AlT.LIZ();
            sbLIZ6.append("[VVSessionIdRefactor] _stopLiveManager, Set_RemoveMIOLogTracker:");
            sbLIZ6.append(this.LJJIII.LIZLLL);
            sbLIZ6.append(", equals: ");
            sbLIZ6.append(TextUtils.equals(this.LJJIII.LIZLLL, this.Q0));
            c1698770uJ9.LIZIZ(C2188811AlT.LIZIZ(sbLIZ6));
            C1476650oWt c1476650oWt = C1476660oWu.LIZ;
            String str3 = this.LJJIII.LIZLLL;
            if (c1476650oWt.LIZJ) {
                LiveIOManager.getInstance().setStringValue(1307, str3);
            }
        } else {
            C1476650oWt c1476650oWt2 = C1476660oWu.LIZ;
            String str4 = this.R0;
            if (c1476650oWt2.LIZJ) {
                LiveIOManager.getInstance().setStringValue(1307, str4);
            }
        }
        this.R0 = null;
        this.LJJJI = false;
        this.LJJIJIIJI = null;
        this.K2 = false;
        this.LJJJIL = false;
        this.LLLZ = false;
        this.LLLJ = 0L;
        this.LLLJIL = 0L;
        this.LJLLLL = 0;
        this.LJIIIIZZ = EnumC1487710ooj.STOPPED;
        this.LJLLLLLL = false;
        LLLLJ(false);
        this.LJJJJ = false;
        this.D1 = 0;
        this.E1 = 0;
        this.LLIILZL = 0;
        this.LLLLZLL = false;
        this.LLJJ = "flv";
        this.LLJJIJIIJIL = "tcp";
        this.LLJJI = "none";
        this.LLJJIII = "none";
        this.LLLIL = 1;
        this.LLLILZ = 0;
        this.LLLILZJ = 0;
        this.LLLILZLLLI = 0;
        this.LJLLL = null;
        this.g1 = false;
        this.f1 = true;
        this.F2 = 0;
        p3 = -1;
        q3 = -1;
        this.U1 = -1;
        ARunnableS123S0100000_23 aRunnableS123S0100000_232 = this.S2;
        if (aRunnableS123S0100000_232 != null) {
            this.LJIILIIL.removeCallbacks(aRunnableS123S0100000_232);
            this.S2 = null;
        }
        "setStreamInfo".equals(str);
        this.LJIILIIL.removeCallbacksAndMessages(null);
        this.LLZ = -1;
        this.v = 0;
        this.c1 = 50;
        this.d1 = 5000;
        this.LLZIL = 1;
        this.B0 = 5000;
        this.C0 = 200;
        this.S0 = -1;
        this.U0 = 0;
        this.V0 = 1;
        this.Z0 = 0;
        this.W0 = 1;
        this.I = 0;
        this.K = 0;
        this.L = 0;
        this.M = 0;
        this.LLF = "none";
        this.LLFF = -1L;
        this.LLFFF = false;
        LiveLoggerService liveLoggerService3 = this.LJIILLIIL;
        liveLoggerService3.getClass();
        this.h1 = false;
        this.i1 = null;
        this.L1 = 0;
        this.M1 = 0;
        this.N1 = -1L;
        this.O1 = "none";
        this.P1 = -1L;
        this.R1 = false;
        this.Q1 = true;
        this.o2 = 0;
        this.n1 = null;
        this.S1 = 0;
        this.V1 = 0;
        this.f453n2 = 0;
        this.W1 = 0;
        this.f456p2 = 0;
        ((ArrayList) liveLoggerService3.Y5).clear();
        this.s = false;
        this.t2 = null;
        this.u2 = -1.0f;
        this.x2 = 0;
        this.w2 = false;
        this.LLZILL = 0;
        this.G2 = 0;
        this.H2 = "";
        this.u = 0;
        this.M2 = false;
        this.N2 = -1L;
        this.v2 = false;
        if (Build.VERSION.SDK_INT < 31) {
            i = 0;
        }
        this.LLILII = i;
        this.LLILIL = 0;
        this.P2 = null;
        this.Q2 = null;
        this.R2 = null;
        this.T2 = false;
        this.U2 = null;
        this.V2 = 0;
        this.W2 = 0;
        this.X2 = "";
        this.LJLI = 0;
        this.LJL = 0;
        this.LJLIIIL = 0;
        this.LJLIIL = -1;
        this.y1.set(false);
        this.Y2 = null;
        this.Z2 = null;
        this.LLLLLLLZIL = "";
        this.LLLLLLZ = "";
        this.LLLLLLZZ = "";
        this.LLLLLZ = "";
        this.LLLLLZIL = "";
        this.l1 = null;
        this.m1 = null;
        this.q = false;
        this.z1 = null;
    }

    public final String LJJJJIZL(String str) {
        int i;
        int i2 = p3;
        if (this.P == 1 && (i = q3) != -1) {
            i2 = i;
        }
        if (i2 != -1) {
            return LJIIJJI(str, "abr_pts", C786410Ut5.k4(Locale.getDefault(), "%d", new Object[]{Integer.valueOf(i2)}));
        }
        return str;
    }

    public final String LJJJJJ(String str) {
        if (this.k1 == 1 && this.LJJLJ == 1 && !this.LLJZIJLIL) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("download_duration=");
            sbLIZ.append(C786410Ut5.k4(Locale.getDefault(), "%d", new Object[]{Integer.valueOf(this.LJJLL)}));
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            int iIndexOf = str.indexOf("?");
            if (iIndexOf == -1) {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("?");
                sbLIZ2.append(strLIZIZ);
                strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
            } else if (iIndexOf != str.length() - 1) {
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("&");
                sbLIZ3.append(strLIZIZ);
                strLIZIZ = C2188811AlT.LIZIZ(sbLIZ3);
            }
            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
            sbLIZ4.append(str);
            sbLIZ4.append(strLIZIZ);
            return C2188811AlT.LIZIZ(sbLIZ4);
        }
        return str;
    }

    public final String LJJJJJL(String str) {
        String str2;
        String str3;
        boolean zLJLJLLL = C1474810oTv.LJLJLLL();
        if (!TextUtils.isEmpty(str)) {
            if (!zLJLJLLL) {
                if (TextUtils.isEmpty(s3)) {
                    return null;
                }
            } else if (TextUtils.isEmpty(this.LJJIII.LIZIZ)) {
                return null;
            }
            if (!str.contains("_session_id")) {
                if (zLJLJLLL) {
                    str3 = this.LJJIII.LIZIZ;
                } else {
                    str3 = this.LJIILLIIL.LLLLZLLIL;
                }
                str = LJIIJJI(str, "_session_id", str3);
            }
            if (zLJLJLLL) {
                str2 = this.LJJIII.LIZJ;
            } else {
                str2 = this.LLIZ;
            }
            if (!TextUtils.isEmpty(str2) && !str.contains("biz_session_id")) {
                return LJIIJJI(str, "biz_session_id", str2);
            }
            return str;
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x01be  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x01c4  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x01cd  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x01df  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x020b  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x023c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJJJLI(boolean r10) {
        /*
            Method dump skipped, instruction units count: 595
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.videoarch.liveplayer.VideoLiveManager.LJJJJLI(boolean):void");
    }

    public final boolean LJJJJLL(int i) {
        C1698830uJF[] c1698830uJFArr;
        boolean z = false;
        if (this.LLLIZZ == 2 && (c1698830uJFArr = this.LJJII.LIZ) != null && c1698830uJFArr.length != 0) {
            for (C1698830uJF c1698830uJF : c1698830uJFArr) {
                if ("h264".equals(c1698830uJF.LIZ()) && c1698830uJF.LIZ != null) {
                    String str = c1698830uJF.LIZ;
                    if (str == null) {
                        return false;
                    }
                    LLLLZLL();
                    LLD();
                    LLLLJ(true);
                    ((C1470430oMr) this.LIZLLL).LIZJ(1349, 1);
                    LiveLoggerService liveLoggerService = this.LJIILLIIL;
                    liveLoggerService.LLJJIJIIJIL = str;
                    liveLoggerService.LJJLIIIJJI(i, this.LJLLJ, str, "bytevc1_to_h264");
                    this.LJLLJ = str;
                    this.LLLIZZ = 1;
                    this.LJIILLIIL.getClass();
                    if (this.LJJJJL != 1 && this.LLLLIIIILLL == 1) {
                        this.LJJJJL = 1;
                        this.LJJJZ = 0;
                        ((C1470430oMr) this.LIZLLL).LIZJ(59, 1);
                        LiveLoggerService liveLoggerService2 = this.LJIILLIIL;
                        if (this.LJJJJL == 1) {
                            z = true;
                        }
                        liveLoggerService2.LLLILZLLLI = z;
                    }
                    LJJIJLIJ();
                    LLLFF(str);
                    return true;
                }
            }
        }
        return false;
    }

    public final void LJJJJZ(long j) {
        String strLJLLL = LJLLL();
        if (!TextUtils.isEmpty(strLJLLL)) {
            long jOptInt = 0;
            if (this.LJIILLIIL.LLLZZ > 0) {
                List<String> cCTKSeries = LJLZ().getCCTKSeries(strLJLLL, j, System.currentTimeMillis(), 120);
                if (cCTKSeries != null && !cCTKSeries.isEmpty()) {
                    int i = 1;
                    int i2 = 0;
                    if (C1474810oTv.LLILII()) {
                        StringBuilder sb = new StringBuilder(256);
                        StringBuilder sb2 = new StringBuilder(256);
                        StringBuilder sb3 = new StringBuilder(256);
                        StringBuilder sb4 = new StringBuilder(256);
                        sb.append(e3.e);
                        sb2.append(e3.e);
                        sb3.append(e3.e);
                        sb4.append(e3.e);
                        long jOptInt2 = 0;
                        for (String str : cCTKSeries) {
                            if (!TextUtils.isEmpty(str)) {
                                try {
                                    JSONObject jSONObject = new JSONObject(str);
                                    if (sb.length() == i) {
                                        sb.append(jSONObject.optInt("cctk_bw", i2));
                                        sb2.append(jSONObject.optInt("cctk_srtt", i2));
                                        sb3.append(jSONObject.optInt("cctk_plr", i2));
                                        sb4.append(jSONObject.optInt("timestamp", i2));
                                        jOptInt2 = jSONObject.optInt("timestamp", i2);
                                    } else {
                                        try {
                                            sb.append(",");
                                            sb.append(jSONObject.optInt("cctk_bw", i2));
                                            sb2.append(",");
                                            sb2.append(jSONObject.optInt("cctk_srtt", i2));
                                            sb3.append(",");
                                            try {
                                                sb3.append(jSONObject.optInt("cctk_plr", i2));
                                                sb4.append(",");
                                                sb4.append(((long) jSONObject.optInt("timestamp", i2)) - jOptInt2);
                                            } catch (JSONException e) {
                                                e = e;
                                                TryCatchGuardChecker.doCheck(e);
                                            }
                                        } catch (JSONException e2) {
                                            e = e2;
                                        }
                                    }
                                } catch (JSONException e3) {
                                    e = e3;
                                }
                                i = 1;
                                i2 = 0;
                            }
                        }
                        sb.append(e3.f);
                        this.LLLLLLZ = sb.toString();
                        sb2.append(e3.f);
                        this.LLLLLLZZ = sb2.toString();
                        sb3.append(e3.f);
                        this.LLLLLZ = sb3.toString();
                        sb4.append(e3.f);
                        this.LLLLLZIL = sb4.toString();
                        return;
                    }
                    this.LLLLLLZ = e3.e;
                    this.LLLLLLZZ = e3.e;
                    this.LLLLLZ = e3.e;
                    this.LLLLLZIL = e3.e;
                    for (String str2 : cCTKSeries) {
                        if (!TextUtils.isEmpty(str2)) {
                            try {
                                JSONObject jSONObject2 = new JSONObject(str2);
                                if (this.LLLLLLZ.length() == 1) {
                                    try {
                                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                                        sbLIZ.append(this.LLLLLLZ);
                                        try {
                                            sbLIZ.append(jSONObject2.optInt("cctk_bw", 0));
                                            this.LLLLLLZ = C2188811AlT.LIZIZ(sbLIZ);
                                            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                                            sbLIZ2.append(this.LLLLLLZZ);
                                            sbLIZ2.append(jSONObject2.optInt("cctk_srtt", 0));
                                            this.LLLLLLZZ = C2188811AlT.LIZIZ(sbLIZ2);
                                            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                                            sbLIZ3.append(this.LLLLLZ);
                                            sbLIZ3.append(jSONObject2.optInt("cctk_plr", 0));
                                            this.LLLLLZ = C2188811AlT.LIZIZ(sbLIZ3);
                                            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                                            sbLIZ4.append(this.LLLLLZIL);
                                            sbLIZ4.append(jSONObject2.optInt("timestamp", 0));
                                            this.LLLLLZIL = C2188811AlT.LIZIZ(sbLIZ4);
                                            jOptInt = jSONObject2.optInt("timestamp", 0);
                                        } catch (JSONException e4) {
                                            e = e4;
                                            TryCatchGuardChecker.doCheck(e);
                                        }
                                    } catch (JSONException e5) {
                                        e = e5;
                                    }
                                } else {
                                    StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                                    sbLIZ5.append(this.LLLLLLZ);
                                    sbLIZ5.append(",");
                                    sbLIZ5.append(jSONObject2.optInt("cctk_bw", 0));
                                    this.LLLLLLZ = C2188811AlT.LIZIZ(sbLIZ5);
                                    StringBuilder sbLIZ6 = C2188811AlT.LIZ();
                                    sbLIZ6.append(this.LLLLLLZZ);
                                    sbLIZ6.append(",");
                                    sbLIZ6.append(jSONObject2.optInt("cctk_srtt", 0));
                                    this.LLLLLLZZ = C2188811AlT.LIZIZ(sbLIZ6);
                                    StringBuilder sbLIZ7 = C2188811AlT.LIZ();
                                    sbLIZ7.append(this.LLLLLZ);
                                    sbLIZ7.append(",");
                                    sbLIZ7.append(jSONObject2.optInt("cctk_plr", 0));
                                    this.LLLLLZ = C2188811AlT.LIZIZ(sbLIZ7);
                                    StringBuilder sbLIZ8 = C2188811AlT.LIZ();
                                    sbLIZ8.append(this.LLLLLZIL);
                                    sbLIZ8.append(",");
                                    sbLIZ8.append(((long) jSONObject2.optInt("timestamp", 0)) - jOptInt);
                                    this.LLLLLZIL = C2188811AlT.LIZIZ(sbLIZ8);
                                }
                            } catch (JSONException e6) {
                                e = e6;
                            }
                        }
                    }
                    StringBuilder sbLIZ9 = C2188811AlT.LIZ();
                    sbLIZ9.append(this.LLLLLLZ);
                    sbLIZ9.append(e3.f);
                    this.LLLLLLZ = C2188811AlT.LIZIZ(sbLIZ9);
                    StringBuilder sbLIZ10 = C2188811AlT.LIZ();
                    sbLIZ10.append(this.LLLLLLZZ);
                    sbLIZ10.append(e3.f);
                    this.LLLLLLZZ = C2188811AlT.LIZIZ(sbLIZ10);
                    StringBuilder sbLIZ11 = C2188811AlT.LIZ();
                    sbLIZ11.append(this.LLLLLZ);
                    sbLIZ11.append(e3.f);
                    this.LLLLLZ = C2188811AlT.LIZIZ(sbLIZ11);
                    StringBuilder sbLIZ12 = C2188811AlT.LIZ();
                    sbLIZ12.append(this.LLLLLZIL);
                    sbLIZ12.append(e3.f);
                    this.LLLLLZIL = C2188811AlT.LIZIZ(sbLIZ12);
                }
            }
        }
    }

    public final void LJJJLZIJ(JSONObject jSONObject) {
        LiveLoggerService liveLoggerService;
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("VoicePool");
        if (jSONObjectOptJSONObject == null) {
            jSONObjectOptJSONObject = new JSONObject();
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("configAudioManagerPool to ");
        sbLIZ.append(jSONObjectOptJSONObject);
        C2188811AlT.LIZIZ(sbLIZ);
        C1698940uJQ.LIZJ();
        if (jSONObjectOptJSONObject.optInt("Enable", 1) != 1) {
            return;
        }
        int iOptInt = jSONObjectOptJSONObject.optInt("EnablePreview", -1);
        if (iOptInt == -1 || (liveLoggerService = this.LJIILLIIL) == null || (iOptInt != 1 ? iOptInt != 0 || !liveLoggerService.LLJJJJ : liveLoggerService.LLJJJJ)) {
            ((C1470430oMr) this.LIZLLL).LIZJ(42112, 1);
            int iOptInt2 = jSONObjectOptJSONObject.optInt("Size", 7);
            if (iOptInt2 != -1) {
                C1470430oMr.LJJI(1306, iOptInt2);
            }
            int iOptInt3 = jSONObjectOptJSONObject.optInt("UseCount", 20);
            if (iOptInt3 != -1) {
                C1470430oMr.LJJI(1307, iOptInt3);
            }
            int iOptInt4 = jSONObjectOptJSONObject.optInt("MaxSameCount", 4);
            if (iOptInt4 != -1) {
                C1470430oMr.LJJI(1309, iOptInt4);
            }
            int iOptInt5 = jSONObjectOptJSONObject.optInt("ForbidMono", -1);
            if (iOptInt5 != -1) {
                C1470430oMr.LJJI(1367, iOptInt5);
            }
            int iOptInt6 = jSONObjectOptJSONObject.optInt("ChangeSampleNumber", -1);
            if (iOptInt6 != -1) {
                C1470430oMr.LJJI(1368, iOptInt6);
            }
            String strOptString = jSONObjectOptJSONObject.optString("ForbidSampleRate", "48000");
            if (!strOptString.equals("none")) {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("configAudioManagerPool sampleRateForbidList ");
                sbLIZ2.append(strOptString);
                C2188811AlT.LIZIZ(sbLIZ2);
                C1698940uJQ.LIZJ();
                ((C1470430oMr) this.LIZLLL).LIZ(1366, strOptString);
                return;
            }
            return;
        }
        ((C1470430oMr) this.LIZLLL).LIZJ(42112, 0);
        C1698940uJQ.LIZJ();
    }

    public final void LJJJZ(JSONObject jSONObject) {
        C1698760uJ8 c1698760uJ8;
        int i;
        int i2;
        int i3;
        int i4;
        HashMap<String, Object> mapLIZ;
        int i5;
        int iOptInt;
        int i6;
        int iLJIIIIZZ;
        InterfaceC1467440oI2 interfaceC1467440oI2 = this.i3;
        int i7 = 0;
        String str = null;
        c1698760uJ8 = null;
        C1698760uJ8 c1698760uJ82 = null;
        str = null;
        str = null;
        if (interfaceC1467440oI2 != null && interfaceC1467440oI2.LJIIIIZZ(3001) == 1) {
            InterfaceC1467440oI2 interfaceC1467440oI22 = this.i3;
            if (interfaceC1467440oI22 != null && (iLJIIIIZZ = interfaceC1467440oI22.LJIIIIZZ(3001)) == 1) {
                c1698760uJ82 = new C1698760uJ8();
                c1698760uJ82.LIZ = iLJIIIIZZ;
                c1698760uJ82.LJ = interfaceC1467440oI22.LJIIIIZZ(3002);
                c1698760uJ82.LJFF = interfaceC1467440oI22.LJIIIIZZ(3003);
                c1698760uJ82.LJIIJ = interfaceC1467440oI22.LJIIIIZZ(3004);
                c1698760uJ82.LJI = interfaceC1467440oI22.LJIIIIZZ(3005);
                c1698760uJ82.LJII = interfaceC1467440oI22.LJIIIIZZ(3006);
                c1698760uJ82.LJIIIIZZ = interfaceC1467440oI22.LJIIIIZZ(3007);
            }
            this.P2 = c1698760uJ82;
            if (c1698760uJ82 != null) {
                if (c1698760uJ82.LJ == 1) {
                    i6 = 1;
                } else {
                    i6 = 0;
                }
                LIZJ(152, i6);
                if (this.P2.LJFF == 1) {
                    i7 = 1;
                }
                LIZJ(171, i7);
                LIZJ(153, this.P2.LJIIIIZZ);
                return;
            }
            return;
        }
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("AudioMetric");
        if (jSONObjectOptJSONObject != null && (iOptInt = jSONObjectOptJSONObject.optInt("Enable")) == 1) {
            c1698760uJ8 = new C1698760uJ8();
            c1698760uJ8.LIZ = iOptInt;
            c1698760uJ8.LIZIZ = jSONObjectOptJSONObject.optString("ModelName");
            c1698760uJ8.LIZLLL = jSONObjectOptJSONObject.optInt("EnableDetectBeforeAE");
            c1698760uJ8.LJ = jSONObjectOptJSONObject.optInt("EnableDetectAfterAE");
            c1698760uJ8.LJFF = jSONObjectOptJSONObject.optInt("AudioMetricDetectUseV2");
            if (jSONObjectOptJSONObject.has("Interval")) {
                c1698760uJ8.LJI = jSONObjectOptJSONObject.optInt("Interval");
            }
            if (jSONObjectOptJSONObject.has("DelayTime")) {
                c1698760uJ8.LJII = jSONObjectOptJSONObject.optInt("DelayTime");
            }
            if (jSONObjectOptJSONObject.has("DetectBufferTime")) {
                c1698760uJ8.LJIIIIZZ = jSONObjectOptJSONObject.optInt("DetectBufferTime");
            }
            c1698760uJ8.LJIIIZ = jSONObjectOptJSONObject.optInt("UsePoolHandle");
            c1698760uJ8.LJIIJ = jSONObjectOptJSONObject.optInt("EnableGetResInStop");
            c1698760uJ8.LJIIJJI = jSONObjectOptJSONObject.optInt("EnableCalcBadRate");
            c1698760uJ8.LJIIL = jSONObjectOptJSONObject.optInt("EnableFakeStereo");
        } else {
            c1698760uJ8 = null;
        }
        this.P2 = c1698760uJ8;
        if (c1698760uJ8 == null) {
            return;
        }
        if (c1698760uJ8.LIZLLL == 1) {
            i = 1;
        } else {
            i = 0;
        }
        LIZJ(151, i);
        if (this.P2.LJ == 1) {
            i2 = 1;
        } else {
            i2 = 0;
        }
        LIZJ(152, i2);
        if (this.P2.LJFF == 1) {
            i3 = 1;
        } else {
            i3 = 0;
        }
        LIZJ(171, i3);
        LIZJ(153, this.P2.LJIIIIZZ);
        if (this.P2.LJIIIZ == 1) {
            i4 = 1;
        } else {
            i4 = 0;
        }
        LIZJ(154, i4);
        InterfaceC1467950oIr interfaceC1467950oIr = this.LIZLLL;
        if (interfaceC1467950oIr != null) {
            if (this.P2.LJIIJJI == 1) {
                i5 = 1;
            } else {
                i5 = 0;
            }
            ((C1470430oMr) interfaceC1467950oIr).LIZJ(1177, i5);
            InterfaceC1467950oIr interfaceC1467950oIr2 = this.LIZLLL;
            if (this.P2.LJIIL == 1) {
                i7 = 1;
            }
            ((C1470430oMr) interfaceC1467950oIr2).LIZJ(1178, i7);
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("samicore audiometric model name=");
        sbLIZ.append(this.P2.LIZIZ);
        C2188811AlT.LIZIZ(sbLIZ);
        C1698940uJQ.LIZJ();
        EnumC1491000ou2 enumC1491000ou2 = EnumC1491000ou2.VeLivePlayerEffectAudioBalance;
        String str2 = this.P2.LIZIZ;
        InterfaceC1491020ou4 interfaceC1491020ou4 = this.c;
        if (interfaceC1491020ou4 == null || (mapLIZ = interfaceC1491020ou4.LIZ(enumC1491000ou2, str2)) == null) {
            C1698940uJQ.LIZJ();
        } else {
            Integer num = (Integer) mapLIZ.get(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS);
            if (num != null && num.intValue() == 1) {
                str = (String) mapLIZ.get("path");
            } else {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("getEffectModelPath status=");
                sbLIZ2.append(num);
                C2188811AlT.LIZIZ(sbLIZ2);
                C1698940uJQ.LIZJ();
            }
        }
        if (TextUtils.isEmpty(str)) {
            C1698940uJQ.LIZJ();
        } else {
            this.P2.LIZJ = str;
            LIZ(150, str);
        }
    }

    public final void LJJL(JSONObject jSONObject) {
        if (jSONObject.has("AudioCalibrationType")) {
            this.LJJZZIII = jSONObject.optInt("AudioCalibrationType", 1);
        }
        ((C1470430oMr) this.LIZLLL).LIZJ(42122, 1);
        if (jSONObject.has("AudioGetLatencyFreq")) {
            this.LJJZZI = jSONObject.optInt("AudioGetLatencyFreq", 10000);
        }
        if (jSONObject.has("CreateAudioTrackEarly")) {
            this.LJL = jSONObject.optInt("CreateAudioTrackEarly");
        }
    }

    public final void LJJLI(JSONObject jSONObject) {
        C1556760qc6 c1556760qc6;
        InterfaceC1467950oIr interfaceC1467950oIr;
        int i;
        int iOptInt;
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("AudioWatermark");
        int i2 = 1;
        if (jSONObjectOptJSONObject != null && (iOptInt = jSONObjectOptJSONObject.optInt("Enabled")) == 1) {
            c1556760qc6 = new C1556760qc6();
            c1556760qc6.LIZ = iOptInt;
            c1556760qc6.LIZJ = jSONObjectOptJSONObject.optInt("Density");
            c1556760qc6.LIZIZ = jSONObjectOptJSONObject.optInt("EnablePrivateRoom");
        } else {
            c1556760qc6 = null;
        }
        this.U2 = c1556760qc6;
        if (c1556760qc6 != null && (interfaceC1467950oIr = this.LIZLLL) != null) {
            if (c1556760qc6.LIZ == 1) {
                i = 1;
            } else {
                i = 0;
            }
            ((C1470430oMr) interfaceC1467950oIr).LIZJ(1179, i);
            InterfaceC1467950oIr interfaceC1467950oIr2 = this.LIZLLL;
            if (this.U2.LIZIZ != 1) {
                i2 = 0;
            }
            ((C1470430oMr) interfaceC1467950oIr2).LIZJ(1180, i2);
        }
    }

    public final void LJJLIIIJILLIZJL(JSONObject jSONObject) {
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("DropBFrameConfig");
        if (jSONObjectOptJSONObject != null) {
            C1911307eB c1911307eB = new C1911307eB();
            c1911307eB.LIZ = jSONObjectOptJSONObject.optInt("Enable");
            c1911307eB.LIZIZ = jSONObjectOptJSONObject.optInt("MinFPS");
            c1911307eB.LIZJ = jSONObjectOptJSONObject.optInt("DropRate");
            c1911307eB.LIZLLL = jSONObjectOptJSONObject.optInt("EnableDumpData");
            LIZJ(138, c1911307eB.LIZ);
            LIZJ(140, c1911307eB.LIZIZ);
            if (c1911307eB.LIZ == 1) {
                LIZJ(139, c1911307eB.LIZJ);
            } else {
                LIZJ(139, -1);
            }
            InterfaceC1467950oIr interfaceC1467950oIr = this.LIZLLL;
            if (interfaceC1467950oIr != null) {
                ((C1470430oMr) interfaceC1467950oIr).LIZJ(42512, c1911307eB.LIZLLL);
            }
        }
    }

    public final void LJJLIIIJJIZ(JSONObject jSONObject) {
        if (this.k1 == 1 && !this.LJJLJLI) {
            if (jSONObject.has("LivePreOnlyWorkPreview") && jSONObject.optInt("LivePreOnlyWorkPreview") == 1 && !this.LJIILLIIL.LLJJJJ) {
                C1698940uJQ.LJ();
                return;
            }
            if (jSONObject.has("EnableLivePreDemux")) {
                this.LJJZ = jSONObject.optInt("EnableLivePreDemux");
            }
            if (jSONObject.has("EnableLivePreRender")) {
                this.LJJLJ = jSONObject.optInt("EnableLivePreRender");
            }
            int i = this.LJJLJ;
            if (i != 1 && this.LJJZ != 1) {
                return;
            }
            int i2 = this.LJJZ;
            if (i2 == 1) {
                ((C1470430oMr) this.LIZLLL).LIZJ(587, i2);
                this.LJIILLIIL.k1 = 2;
            } else {
                ((C1470430oMr) this.LIZLLL).LIZJ(196, i);
                ((C1470430oMr) this.LIZLLL).LIZJ(42524, this.LJJLJ);
                ((C1470430oMr) this.LIZLLL).LIZJ(1049, 1);
                this.LJIILLIIL.k1 = 1;
            }
            if (jSONObject.has("LivePreRenderRequestDuration")) {
                int iOptInt = jSONObject.optInt("LivePreRenderRequestDuration");
                this.LJJLL = iOptInt;
                ((C1470430oMr) this.LIZLLL).LIZJ(42520, iOptInt);
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("live pre-render, request duration:");
                sbLIZ.append(this.LJJLL);
                C2188811AlT.LIZIZ(sbLIZ);
                C1698940uJQ.LIZJ();
            }
            if (jSONObject.has("RenderPreDecodedFrame")) {
                ((C1470430oMr) this.LIZLLL).LIZJ(42521, jSONObject.optInt("RenderPreDecodedFrame"));
            }
            if (jSONObject.has("PreDecodeBufferDuration")) {
                ((C1470430oMr) this.LIZLLL).LIZJ(42523, jSONObject.optInt("PreDecodeBufferDuration"));
            }
            if (jSONObject.has("UsePreRenderBuffer")) {
                ((C1470430oMr) this.LIZLLL).LIZJ(42522, jSONObject.optInt("UsePreRenderBuffer"));
                return;
            }
            return;
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("should not enable live pre-render, already failed:");
        sbLIZ2.append(this.LJJLJLI);
        C2188811AlT.LIZIZ(sbLIZ2);
        C1698940uJQ.LIZJ();
        LLLIZZ();
    }

    public final void LJJLIIIJL(JSONObject jSONObject) {
        InterfaceC1467950oIr interfaceC1467950oIr;
        InterfaceC1467950oIr interfaceC1467950oIr2;
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("LoudnessStrategy");
        if (jSONObjectOptJSONObject == null) {
            return;
        }
        C1698940uJQ.LIZJ();
        if (jSONObjectOptJSONObject.optInt("Enable") != 1) {
            return;
        }
        InterfaceC1467950oIr interfaceC1467950oIr3 = this.LIZLLL;
        if (interfaceC1467950oIr3 != null) {
            ((C1470430oMr) interfaceC1467950oIr3).LIZJ(1171, 1);
        }
        int iOptInt = jSONObjectOptJSONObject.optInt("EffectType", -1);
        if (iOptInt != -1) {
            InterfaceC1467950oIr interfaceC1467950oIr4 = this.LIZLLL;
            if (interfaceC1467950oIr4 != null) {
                ((C1470430oMr) interfaceC1467950oIr4).LIZJ(643, iOptInt);
            }
            this.LLLZLZ = iOptInt;
        }
        String strOptString = jSONObjectOptJSONObject.optString("LibraParamsStr", "none");
        if (!strOptString.equals("none") && (interfaceC1467950oIr2 = this.LIZLLL) != null) {
            ((C1470430oMr) interfaceC1467950oIr2).LIZ(1172, strOptString);
        }
        float fOptDouble = (float) jSONObjectOptJSONObject.optDouble("DefaultShorterm", 0.0d);
        float fOptDouble2 = (float) jSONObjectOptJSONObject.optDouble("DefaultMomentary", 0.0d);
        if (fOptDouble != 0.0f && fOptDouble2 != 0.0f && (interfaceC1467950oIr = this.LIZLLL) != null) {
            ((C1470430oMr) interfaceC1467950oIr).LJIL(fOptDouble, 1174);
            ((C1470430oMr) this.LIZLLL).LJIL(fOptDouble2, 1175);
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("config loudness strategy type is ");
        sbLIZ.append(iOptInt);
        sbLIZ.append(" params is ");
        sbLIZ.append(strOptString);
        sbLIZ.append(" default shorterm is ");
        sbLIZ.append(fOptDouble);
        sbLIZ.append(" default momentary is ");
        sbLIZ.append(fOptDouble2);
        C2188811AlT.LIZIZ(sbLIZ);
        C1698940uJQ.LIZJ();
    }

    public final void LJJLIIIJLJLI(JSONObject jSONObject) {
        if (jSONObject.has("EnableMcMonitor")) {
            this.LJJLIIIJ = jSONObject.optInt("EnableMcMonitor", 1);
        }
        if (jSONObject.has("EnableMcPipeline")) {
            this.LJJLIIIJILLIZJL = jSONObject.optInt("EnableMcPipeline", 1);
        }
    }

    public final void LJJLIIIJLLLLLLLZ(JSONObject jSONObject) {
        if (jSONObject.has("EnableFormaterBufferControl")) {
            this.LJLIIIL = jSONObject.optInt("EnableFormaterBufferControl");
        }
        if (jSONObject.has("FormaterMaxFramesInMc")) {
            this.LJLIIL = jSONObject.optInt("FormaterMaxFramesInMc");
        }
    }

    public final void LJJLIIJ(JSONObject jSONObject) {
        ((C1470430oMr) this.LIZLLL).LIZJ(42700, jSONObject.optInt("EnablePlayerFR", 1));
        ((C1470430oMr) this.LIZLLL).LIZJ(42702, jSONObject.optInt("EnableBinControl", 1));
        ((C1470430oMr) this.LIZLLL).LIZJ(42703, jSONObject.optInt("AudioPrerollTimeout", 500));
        ((C1470430oMr) this.LIZLLL).LIZJ(42706, jSONObject.optInt("EnableADecoderPlugin", 1));
        ((C1470430oMr) this.LIZLLL).LIZJ(42707, jSONObject.optInt("AudioSampleMap", 1));
        ((C1470430oMr) this.LIZLLL).LIZJ(42710, jSONObject.optInt("FixBinBuffering", 1));
        ((C1470430oMr) this.LIZLLL).LIZJ(42922, jSONObject.optInt("EnableCreateDecoderEarly", 1));
        ((C1470430oMr) this.LIZLLL).LIZJ(42925, jSONObject.optInt("AudioDecodeMaxCacheSize", 8));
        ((C1470430oMr) this.LIZLLL).LIZJ(42924, jSONObject.optInt("AudioGraphMaxCacheSize", 3));
        if (jSONObject.has("BCEofUseOutlet")) {
            ((C1470430oMr) this.LIZLLL).LIZJ(43319, jSONObject.optInt("BCEofUseOutlet"));
        }
        if (jSONObject.has("ElementStartDistribute")) {
            ((C1470430oMr) this.LIZLLL).LIZJ(42711, jSONObject.optInt("ElementStartDistribute"));
        }
        if (jSONObject.has("FrameworkStopIO")) {
            ((C1470430oMr) this.LIZLLL).LIZJ(42727, jSONObject.optInt("FrameworkStopIO"));
        }
        if (jSONObject.has("EnableAudioThreadMerge")) {
            ((C1470430oMr) this.LIZLLL).LIZJ(1338, jSONObject.optInt("EnableAudioThreadMerge"));
        }
        if (jSONObject.has("RefineBufferCheckLock")) {
            ((C1470430oMr) this.LIZLLL).LIZJ(42126, jSONObject.optInt("RefineBufferCheckLock"));
        }
        if (jSONObject.has("EnablePrerollOpt")) {
            ((C1470430oMr) this.LIZLLL).LIZJ(42721, jSONObject.optInt("EnablePrerollOpt"));
        }
        if (jSONObject.has("EnableBufferControl")) {
            ((C1470430oMr) this.LIZLLL).LIZJ(43301, jSONObject.optInt("EnableBufferControl"));
        }
        if (jSONObject.has("BufferThreshCheck")) {
            ((C1470430oMr) this.LIZLLL).LIZJ(43302, jSONObject.optInt("BufferThreshCheck"));
        }
        if (jSONObject.has("BufferEleInteraction")) {
            ((C1470430oMr) this.LIZLLL).LIZJ(43303, jSONObject.optInt("BufferEleInteraction"));
        }
        if (jSONObject.has("EnableBufferControlFramework")) {
            ((C1470430oMr) this.LIZLLL).LIZJ(43304, jSONObject.optInt("EnableBufferControlFramework"));
        }
        if (jSONObject.has("BufferControlReadTimeout")) {
            ((C1470430oMr) this.LIZLLL).LIZJ(43308, jSONObject.optInt("BufferControlReadTimeout"));
        }
        if (jSONObject.has("BufferControlVideoReadTimeout")) {
            ((C1470430oMr) this.LIZLLL).LIZJ(43328, jSONObject.optInt("BufferControlVideoReadTimeout"));
        }
        if (jSONObject.has("BufferPlayerOptCnt")) {
            ((C1470430oMr) this.LIZLLL).LIZJ(43309, jSONObject.optInt("BufferPlayerOptCnt"));
        }
        if (jSONObject.has("RefineClockThreadSafe")) {
            ((C1470430oMr) this.LIZLLL).LIZJ(43313, jSONObject.optInt("RefineClockThreadSafe"));
        }
        if (jSONObject.has("EnableOutletEventDrive")) {
            ((C1470430oMr) this.LIZLLL).LIZJ(43314, jSONObject.optInt("EnableOutletEventDrive"));
        }
        if (jSONObject.has("BufferingStartDelayTime")) {
            ((C1470430oMr) this.LIZLLL).LIZJ(43315, jSONObject.optInt("BufferingStartDelayTime"));
        }
        if (jSONObject.has("VOutletRefactorRefineStateMachine")) {
            ((C1470430oMr) this.LIZLLL).LIZJ(43320, jSONObject.optInt("VOutletRefactorRefineStateMachine"));
        }
        if (jSONObject.has("VOutletRefactorThreadCombinedOpt")) {
            ((C1470430oMr) this.LIZLLL).LIZJ(43321, jSONObject.optInt("VOutletRefactorThreadCombinedOpt"));
        }
        if (jSONObject.has("VOutletRefactorOptCtlHandle")) {
            ((C1470430oMr) this.LIZLLL).LIZJ(43324, jSONObject.optInt("VOutletRefactorOptCtlHandle"));
        }
        if (jSONObject.has("GetAudioParameterOpt")) {
            ((C1470430oMr) this.LIZLLL).LIZJ(43325, jSONObject.optInt("GetAudioParameterOpt"));
        }
        if (jSONObject.has("FixBufferControlPeek")) {
            ((C1470430oMr) this.LIZLLL).LIZJ(43327, jSONObject.optInt("FixBufferControlPeek"));
        }
        if (jSONObject.has("SkipPlayStartWait")) {
            ((C1470430oMr) this.LIZLLL).LIZJ(43330, jSONObject.optInt("SkipPlayStartWait"));
        }
        if (jSONObject.has("EnableMergeAudioGraphOutlet")) {
            ((C1470430oMr) this.LIZLLL).LIZJ(43212, jSONObject.optInt("EnableMergeAudioGraphOutlet"));
        }
        if (jSONObject.has("EnableStrategyCenter")) {
            ((C1470430oMr) this.LIZLLL).LIZJ(43000, jSONObject.optInt("EnableStrategyCenter"));
        }
        if (jSONObject.has("EnableAvsyncController")) {
            ((C1470430oMr) this.LIZLLL).LIZJ(42855, jSONObject.optInt("EnableAvsyncController"));
        }
        if (jSONObject.has("EnableVideoFirstSync")) {
            ((C1470430oMr) this.LIZLLL).LIZJ(42856, jSONObject.optInt("EnableVideoFirstSync"));
        }
        if (jSONObject.has("EnableVideoAlignModuleFallback")) {
            ((C1470430oMr) this.LIZLLL).LIZJ(42857, jSONObject.optInt("EnableVideoAlignModuleFallback"));
        }
        if (jSONObject.has("EnableAudioAlignWithRealClock")) {
            ((C1470430oMr) this.LIZLLL).LIZJ(42858, jSONObject.optInt("EnableAudioAlignWithRealClock"));
        }
        if (jSONObject.has("AVSyncEosWaitTimeout")) {
            ((C1470430oMr) this.LIZLLL).LIZJ(42859, jSONObject.optInt("AVSyncEosWaitTimeout"));
        }
        if (jSONObject.has("AVSyncRefineWait")) {
            ((C1470430oMr) this.LIZLLL).LIZJ(42860, jSONObject.optInt("AVSyncRefineWait"));
        }
        if (jSONObject.has("AVSyncRefineFirstSync")) {
            ((C1470430oMr) this.LIZLLL).LIZJ(42861, jSONObject.optInt("AVSyncRefineFirstSync"));
        }
        if (jSONObject.has("AVSyncAdjustPtsMask")) {
            ((C1470430oMr) this.LIZLLL).LIZJ(42862, jSONObject.optInt("AVSyncAdjustPtsMask"));
        }
        if (jSONObject.has("AVSyncLargeDiffThreshold")) {
            ((C1470430oMr) this.LIZLLL).LIZJ(42863, jSONObject.optInt("AVSyncLargeDiffThreshold"));
        }
        if (jSONObject.has("EnableAVDecoderRefactor")) {
            if (jSONObject.optInt("EnableAVDecoderRefactor") > 0) {
                ((C1470430oMr) this.LIZLLL).LIZJ(49032, 2);
            } else {
                ((C1470430oMr) this.LIZLLL).LIZJ(49032, 0);
            }
        }
        if (jSONObject.has("EnableAOutletRefactor")) {
            if (jSONObject.optInt("EnableAOutletRefactor") > 0) {
                ((C1470430oMr) this.LIZLLL).LIZJ(49033, 2);
            } else {
                ((C1470430oMr) this.LIZLLL).LIZJ(49033, 0);
            }
        }
        if (jSONObject.has("EnableUseDurationFromFrameRate")) {
            ((C1470430oMr) this.LIZLLL).LIZJ(42820, jSONObject.optInt("EnableUseDurationFromFrameRate"));
        }
    }

    public final void LJJLJLI(JSONObject jSONObject) {
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("SeiLinkSyncOpt");
        if (jSONObjectOptJSONObject == null) {
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("configSeiLinkType to ");
        sbLIZ.append(jSONObjectOptJSONObject);
        C2188811AlT.LIZIZ(sbLIZ);
        C1698940uJQ.LIZJ();
        if (jSONObjectOptJSONObject.optInt("Enable") != 1) {
            return;
        }
        ((C1470430oMr) this.LIZLLL).LIZJ(42516, 1);
        ((C1470430oMr) this.LIZLLL).LIZJ(42517, jSONObjectOptJSONObject.optInt("DelayTime", ConnectionResult.DRIVE_EXTERNAL_STORAGE_REQUIRED));
    }

    public final void LJJLL(JSONObject jSONObject) {
        C1698740uJ6 c1698740uJ6;
        InterfaceC1467950oIr interfaceC1467950oIr;
        int iOptInt;
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("VideoAbnormal");
        if (jSONObjectOptJSONObject != null && (iOptInt = jSONObjectOptJSONObject.optInt("Enable")) == 1) {
            c1698740uJ6 = new C1698740uJ6();
            c1698740uJ6.LIZ = iOptInt;
            c1698740uJ6.LIZIZ = jSONObjectOptJSONObject.optInt("Interval");
            c1698740uJ6.LIZJ = jSONObjectOptJSONObject.optInt("Strategy");
            c1698740uJ6.LIZLLL = jSONObjectOptJSONObject.optInt("EnableNotifyImmediately");
            c1698740uJ6.LJI = jSONObjectOptJSONObject.optInt("YBlackTolerance");
            c1698740uJ6.LJII = jSONObjectOptJSONObject.optInt("UVBlackTolerance");
            c1698740uJ6.LJIIIIZZ = jSONObjectOptJSONObject.optInt("BlackRatio");
            c1698740uJ6.LJIIIZ = jSONObjectOptJSONObject.optInt("UVGreenTolerance");
            c1698740uJ6.LJIIJ = jSONObjectOptJSONObject.optInt("GreenRatio");
            c1698740uJ6.LJIIJJI = jSONObjectOptJSONObject.optInt("AbnormalColorMinDurationInMS");
            c1698740uJ6.LJIIL = jSONObjectOptJSONObject.optInt("AbnormalColorSamplingStep");
            c1698740uJ6.LJ = jSONObjectOptJSONObject.optInt("EnableBlackDetect");
            c1698740uJ6.LJFF = jSONObjectOptJSONObject.optInt("EnableGreenDetect");
            c1698740uJ6.LJIILIIL = jSONObjectOptJSONObject.optInt("RecordCountThres");
        } else {
            c1698740uJ6 = null;
        }
        this.Y2 = c1698740uJ6;
        if (c1698740uJ6 != null && (interfaceC1467950oIr = this.LIZLLL) != null) {
            ((C1470430oMr) interfaceC1467950oIr).LIZJ(42302, c1698740uJ6.LIZIZ);
            ((C1470430oMr) this.LIZLLL).LIZJ(42303, this.Y2.LIZJ);
            ((C1470430oMr) this.LIZLLL).LIZJ(42308, this.Y2.LIZLLL);
            ((C1470430oMr) this.LIZLLL).LIZJ(42311, this.Y2.LJI);
            ((C1470430oMr) this.LIZLLL).LIZJ(42312, this.Y2.LJII);
            ((C1470430oMr) this.LIZLLL).LIZJ(42319, this.Y2.LJIIIIZZ);
            ((C1470430oMr) this.LIZLLL).LIZJ(44301, this.Y2.LJIIIZ);
            ((C1470430oMr) this.LIZLLL).LIZJ(44302, this.Y2.LJIIJ);
            ((C1470430oMr) this.LIZLLL).LIZJ(44300, this.Y2.LJIIL);
            ((C1470430oMr) this.LIZLLL).LIZJ(42313, this.Y2.LJIIJJI);
            ((C1470430oMr) this.LIZLLL).LIZJ(42318, this.Y2.LJIILIIL);
            ((C1470430oMr) this.LIZLLL).LIZJ(44303, this.Y2.LJ);
            ((C1470430oMr) this.LIZLLL).LIZJ(44304, this.Y2.LJFF);
        }
    }

    public final C1698670uIz LJLIIL(String str) {
        List<C1698670uIz> list;
        if (str != null && (list = this.LLIIIILZ) != null) {
            for (C1698670uIz c1698670uIz : (ArrayList) list) {
                if (str.equals(c1698670uIz.LIZ)) {
                    return c1698670uIz;
                }
            }
        }
        return null;
    }

    public final void LJLILLLLZI(String str) {
        if (!TextUtils.isEmpty(this.LJIILLIIL.LLLLZLL)) {
            return;
        }
        long jCurrentTimeMillis = this.LJIILLIIL.LLILLL.LIZ;
        if (jCurrentTimeMillis <= 0) {
            jCurrentTimeMillis = System.currentTimeMillis();
        }
        String strLJIILL = this.LJJII.LJIILL();
        s3 = strLJIILL;
        if (TextUtils.isEmpty(strLJIILL)) {
            s3 = UUID.randomUUID().toString().replace("-", "").toLowerCase();
        }
        LiveLoggerService liveLoggerService = this.LJIILLIIL;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(s3);
        sbLIZ.append(e3.d);
        sbLIZ.append(jCurrentTimeMillis);
        sbLIZ.append(e3.d);
        sbLIZ.append(this.P0);
        liveLoggerService.LLLLZLL = C2188811AlT.LIZIZ(sbLIZ);
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append(str);
        sbLIZ2.append(" generate global session id:");
        sbLIZ2.append(this.LJIILLIIL.LLLLZLL);
        C2188811AlT.LIZIZ(sbLIZ2);
        C1698940uJQ.LIZJ();
    }

    public final String LLIIIZ(String str) {
        String strLJI;
        if (this.LLJILJIL.equals("auto")) {
            strLJI = this.LJJII.LJI();
        } else {
            strLJI = this.LLJILJIL;
        }
        String strLJIJJ = this.LJJII.LJIJJ(strLJI, str);
        if (TextUtils.isEmpty(strLJIJJ)) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("main-backup switch skipped: no suggest format for level=");
            sbLIZ.append(str);
            sbLIZ.append(", resolution=");
            sbLIZ.append(strLJI);
            C2188811AlT.LIZIZ(sbLIZ);
            C1698940uJQ.LJ();
            return null;
        }
        String strLJIIJJI = this.LJJII.LJIIJJI(strLJI, strLJIJJ, str, this.LLJZIJLIL);
        if (TextUtils.isEmpty(strLJIIJJI)) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("main-backup switch skipped: no backup url for format=");
            sbLIZ2.append(strLJIJJ);
            sbLIZ2.append(" level=");
            sbLIZ2.append(str);
            C2188811AlT.LIZIZ(sbLIZ2);
            C1698940uJQ.LJ();
            return strLJIIJJI;
        }
        this.LLIIIJ.LJIIL.put("source_source_type", this.LLJILLL);
        this.LLIIIJ.LJIIL.put("target_source_type", str);
        this.LLIIIJ.LJIIL.put("target_format", strLJIJJ);
        return strLJIIJJI;
    }

    public final void LLIIL(C1698790uJB c1698790uJB) {
        InterfaceC1467950oIr interfaceC1467950oIr;
        if (c1698790uJB != null && (interfaceC1467950oIr = this.LIZLLL) != null) {
            if (c1698790uJB.LJIIJ <= 0) {
                c1698790uJB.LJIIJ = ((C1470430oMr) interfaceC1467950oIr).LJIIJ(1376, -1L);
            }
            if (c1698790uJB.LJIIJJI <= 0) {
                c1698790uJB.LJIIJJI = ((C1470430oMr) this.LIZLLL).LJIIJ(1377, -1L);
            }
            if (c1698790uJB.LJIIL <= 0) {
                c1698790uJB.LJIIL = ((C1470430oMr) this.LIZLLL).LJI(1378, -1);
            }
            if (c1698790uJB.LJIILIIL <= 0) {
                c1698790uJB.LJIILIIL = ((C1470430oMr) this.LIZLLL).LJIIJ(1379, -1L);
            }
        }
    }

    public final String LLIIZ(String str) {
        String strLJI;
        String strLJIJJLI = this.LJJII.LJIJJLI(this.LLJILJIL, str);
        if (TextUtils.equals("h2q", strLJIJJLI) && this.LLLLLL) {
            strLJIJJLI = "h2q";
        }
        if (!LLJL()) {
            C1698510uIj c1698510uIj = this.LJJII;
            if (this.LLJILJIL.equals("auto")) {
                strLJI = this.LJJII.LJI();
            } else {
                strLJI = this.LLJILJIL;
            }
            String strLJIIJJI = c1698510uIj.LJIIJJI(strLJI, this.LLJJ, str, this.LLJZIJLIL);
            if (strLJIIJJI != null) {
                if (strLJIIJJI.startsWith("http")) {
                    strLJIJJLI = "tcp";
                }
                if (strLJIIJJI.startsWith("https")) {
                    strLJIJJLI = "tls";
                }
            }
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("get real protocol: ");
        sbLIZ.append(this.LLJJI);
        C2188811AlT.LIZIZ(sbLIZ);
        C1698940uJQ.LIZJ();
        return strLJIJJLI;
    }

    public final void LLIL(String str) {
        if (this.O1.equals("none")) {
            return;
        }
        C1698510uIj c1698510uIj = this.LJJII;
        if (c1698510uIj.LJJII()) {
            c1698510uIj.LIZIZ.getClass();
            if (!TextUtils.equals(str, "rtBitrateTs")) {
                TextUtils.equals(str, "rtBitrateVpaasTs");
            }
        }
    }

    public final void LLILZIL(JSONObject jSONObject) {
        try {
            if (!this.LJIILLIIL.d6.equals("none")) {
                JSONObject jSONObject2 = new JSONObject(this.LJIILLIIL.d6);
                if (jSONObject2.has("sourceLuft")) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("set sourceLuft is ");
                    sbLIZ.append(jSONObject2.optDouble("sourceLuft"));
                    C2188811AlT.LIZIZ(sbLIZ);
                    C1698940uJQ.LIZIZ();
                    jSONObject.put("source_loudness", jSONObject2.optDouble("sourceLuft"));
                }
            }
            if (this.u2 != -1.0f) {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("target_loudness is ");
                sbLIZ2.append(this.u2);
                C2188811AlT.LIZIZ(sbLIZ2);
                C1698940uJQ.LIZIZ();
                jSONObject.put("target_loudness", this.u2);
            }
            jSONObject.put("network_series", LLIIIILZ());
        } catch (JSONException e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String LLILZLL(int r6) {
        /*
            Method dump skipped, instruction units count: 336
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.videoarch.liveplayer.VideoLiveManager.LLILZLL(int):java.lang.String");
    }

    public final long LLIZ(int i) {
        InterfaceC1467950oIr interfaceC1467950oIr = this.LIZLLL;
        if (interfaceC1467950oIr != null) {
            if (i != 0) {
                if (i == 1) {
                    return ((C1470430oMr) interfaceC1467950oIr).LJIIJ(898, 0L);
                }
            } else {
                return ((C1470430oMr) interfaceC1467950oIr).LJIIJ(897, 0L);
            }
        }
        return 0L;
    }

    public final void LLJJIII(String str) {
        if (this.LLZZZZ || TextUtils.isEmpty(str)) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            int iOptInt = jSONObject.optInt("is_cdn_switch", 0);
            int iOptInt2 = jSONObject.optInt("switch_result", 0);
            if (iOptInt == 1 && iOptInt2 < 0) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("cdn_switch seamless failed (result=");
                sbLIZ.append(iOptInt2);
                sbLIZ.append("), fallback to non-seamless");
                C2188811AlT.LIZIZ(sbLIZ);
                C1698940uJQ.LJ();
                this.LLZZZZ = true;
                this.LLZZZIL = true;
                try {
                    LLLLZ(-100029, EnumC1699210uJr.IN_ROOM);
                    this.LLZZZIL = false;
                    this.LLZZZZ = false;
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    this.LLZZZIL = false;
                    this.LLZZZZ = false;
                    throw th;
                }
            }
        } catch (JSONException e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("cdn_switch fallback JSON parse error: ");
            sbLIZ2.append(e.getMessage());
            C2188811AlT.LIZIZ(sbLIZ2);
            C1698940uJQ.LIZIZ();
        }
    }

    public final void LLJLIL(JSONObject jSONObject) {
        JSONObject jSONObject2;
        JSONObject jSONObject3 = this.z1;
        if (jSONObject3 != null && jSONObject3.length() != 0) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("start mockFeaturesData: ");
            sbLIZ.append(C786410Ut5.J3(this.z1));
            C2188811AlT.LIZIZ(sbLIZ);
            C1698940uJQ.LIZ();
            synchronized (this.A1) {
                try {
                    jSONObject2 = this.z1;
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
            try {
                Iterator<String> itKeys = jSONObject2.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    jSONObject.put(next, jSONObject2.opt(next));
                }
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("mockFeaturesData success: ");
                sbLIZ2.append(C786410Ut5.J3(jSONObject));
                C2188811AlT.LIZIZ(sbLIZ2);
                C1698940uJQ.LIZ();
            } catch (JSONException e) {
                TryCatchGuardChecker.doCheck(e);
                C1698940uJQ.LIZIZ();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00fa  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LLJLILLLLZIIL(java.lang.String r12) {
        /*
            Method dump skipped, instruction units count: 524
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.videoarch.liveplayer.VideoLiveManager.LLJLILLLLZIIL(java.lang.String):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0108  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LLJLLL(long r7) {
        /*
            Method dump skipped, instruction units count: 296
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.videoarch.liveplayer.VideoLiveManager.LLJLLL(long):void");
    }

    public final void LLLF(String str) {
        String name;
        if (this.LJIILLIIL == null) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            this.LJIILLIIL.LLLII = jSONObject.optBoolean("is_cache_hit", false);
            this.LJIILLIIL.LLLIIIIL = jSONObject.optString("dns_type", "Unknown");
            this.LJIILLIIL.LLLIIIL = jSONObject.optLong("parse_duration", -1L);
            this.LJIILLIIL.LLLIIL = jSONObject.optInt("error_code", 0);
            if (jSONObject.has("ip_list")) {
                Object obj = jSONObject.get("ip_list");
                if (obj instanceof JSONArray) {
                    JSONArray jSONArray = (JSONArray) obj;
                    StringBuilder sb = new StringBuilder();
                    int iMin = Math.min(jSONArray.length(), 50);
                    for (int i = 0; i < iMin; i++) {
                        if (i > 0) {
                            sb.append(",");
                        }
                        String strOptString = jSONArray.optString(i, "");
                        if (!strOptString.isEmpty() && strOptString.length() <= 50) {
                            sb.append(strOptString);
                        }
                    }
                    if (jSONArray.length() > iMin) {
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("[DNS_Refactor] IP list truncated: ");
                        sbLIZ.append(jSONArray.length());
                        sbLIZ.append(" -> ");
                        sbLIZ.append(iMin);
                        C2188811AlT.LIZIZ(sbLIZ);
                        C1698940uJQ.LJ();
                    }
                    this.LJIILLIIL.LLLIILIL = sb.toString();
                } else if (obj instanceof String) {
                    String strSubstring = (String) obj;
                    LiveLoggerService liveLoggerService = this.LJIILLIIL;
                    if (strSubstring.length() > 2500) {
                        strSubstring = strSubstring.substring(0, 2500);
                    }
                    liveLoggerService.LLLIILIL = strSubstring;
                } else {
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("[DNS_Refactor] Unexpected ip_list type: ");
                    if (obj == null) {
                        name = "null";
                    } else {
                        name = obj.getClass().getName();
                    }
                    sbLIZ2.append(name);
                    C2188811AlT.LIZIZ(sbLIZ2);
                    C1698940uJQ.LJ();
                    this.LJIILLIIL.LLLIILIL = "";
                }
            } else {
                this.LJIILLIIL.LLLIILIL = "";
            }
            this.LJIILLIIL.LLLIL = System.currentTimeMillis();
            this.LJIILLIIL.LLLILZ = true;
        } catch (JSONException e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("[DNS_Refactor] JSON parse error: ");
            sbLIZ3.append(str);
            sbLIZ3.append(", ");
            sbLIZ3.append(e.getMessage());
            C2188811AlT.LIZIZ(sbLIZ3);
            C1698940uJQ.LIZIZ();
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
            sbLIZ4.append("[DNS_Refactor] Unexpected error parsing DNS info, ");
            sbLIZ4.append(e2.getMessage());
            C2188811AlT.LIZIZ(sbLIZ4);
            C1698940uJQ.LIZIZ();
        }
    }

    public final void LLLFF(String str) {
        InterfaceC1470660oNE interfaceC1470660oNE = (InterfaceC1470660oNE) this.LJJIIJZLJL;
        C1699050uJb c1699050uJb = new C1699050uJb(10001);
        c1699050uJb.LIZIZ = str;
        interfaceC1470660oNE.play(c1699050uJb);
    }

    public final void LLLFFI(C1698490uIh c1698490uIh) {
        String strLJIIIZ = ((C1470430oMr) this.LIZLLL).LJIIIZ(335);
        if (strLJIIIZ == null) {
            return;
        }
        for (String str : strLJIIIZ.split("\r\n")) {
            if (str.startsWith("X-Server-Ip: ")) {
                c1698490uIh.LLIILII = str.split(": ", 2)[1];
            } else if (str.startsWith("Via: ")) {
                c1698490uIh.LLIILZL = str.split(": ", 2)[1];
            }
        }
    }

    public final boolean LLLI(String str) throws Throwable {
        String strLJI;
        String strLJIJI;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("playResolution:");
        sbLIZ.append(str);
        sbLIZ.append(", res=");
        sbLIZ.append(this.LLJILJIL);
        sbLIZ.append(", externalRes=");
        sbLIZ.append(this.LLFII);
        C2188811AlT.LIZIZ(sbLIZ);
        C1698940uJQ.LIZJ();
        if (this.LJJII.LIZLLL != 2 || this.LJIIIZ == EnumC1487690ooh.IDLE || this.LJIIIIZZ == EnumC1487710ooj.STOPPED || str == null) {
            return false;
        }
        if (TextUtils.equals(this.LLFII, str)) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("playResolution: same res=");
            sbLIZ2.append(str);
            C2188811AlT.LIZIZ(sbLIZ2);
            C1698940uJQ.LIZJ();
            return true;
        }
        if (TextUtils.equals(str, "ao") && ((!TextUtils.equals(this.LLJJ, "flv") && !TextUtils.equals(this.LLJJ, "cmaf")) || this.G2 == 0)) {
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("not support switch to audio, streamFormat: ");
            sbLIZ3.append(this.LLJJ);
            sbLIZ3.append(", enableOnlyAudioInAoRes: ");
            sbLIZ3.append(this.G2);
            C2188811AlT.LIZIZ(sbLIZ3);
            C1698940uJQ.LIZJ();
            return false;
        }
        this.LJJ.LIZLLL();
        this.LLJILJILJ = -1;
        this.LJLLLL = 0;
        if (this.L == 1 && TextUtils.equals(this.LLJJ, "cmaf") && this.G) {
            if (TextUtils.equals(str, "ao") && !this.LLJZIJLIL && LLJJJ() && this.LJJJI) {
                C1698940uJQ.LIZJ();
                String strLJIIJJI = this.LJJII.LJIIJJI("ao", "cmaf", this.LLJILLL, this.LLJZIJLIL);
                if (TextUtils.isEmpty(strLJIIJJI)) {
                    C1698940uJQ.LIZJ();
                    return false;
                }
                LiveLoggerService liveLoggerService = this.LJIILLIIL;
                liveLoggerService.H1 = "ao";
                liveLoggerService.LLJILJILJ = -1L;
                String str2 = this.LJLLJ;
                StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                sbLIZ4.append("setting_");
                sbLIZ4.append(this.LLJILJIL);
                sbLIZ4.append("_to_");
                sbLIZ4.append("ao");
                liveLoggerService.LJJLIIIJJI(0, str2, strLJIIJJI, C2188811AlT.LIZIZ(sbLIZ4));
                LiveLoggerService liveLoggerService2 = this.LJIILLIIL;
                StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                sbLIZ5.append("manual_abr_");
                sbLIZ5.append(this.LLJILJIL);
                sbLIZ5.append("_to_");
                sbLIZ5.append("ao");
                liveLoggerService2.W2 = C2188811AlT.LIZIZ(sbLIZ5);
                LLLLIIL();
                LJJJJZI();
                this.LLJILJIL = "ao";
                this.T1 = "ao";
                this.LLFII = "ao";
                ((ArrayList) this.LJIILLIIL.Y5).add(Long.valueOf(this.LJJII.LJ("ao", this.LLJILLL)));
                if (this.LLLILZLLLI > 0) {
                    LLLL();
                }
                this.LJIILLIIL.LJJJJZ("ao");
                LLD();
                C1476650oWt c1476650oWt = C1476660oWu.LIZ;
                c1476650oWt.LJIIJ(2302, this.Q0, "ao");
                c1476650oWt.LJII(2303, this.Q0, -1L);
                int i = this.LLLILZJ;
                if (i > 0) {
                    ((C1470430oMr) this.LIZLLL).LIZJ(1110, i);
                    return true;
                }
                return true;
            }
            ((C1470430oMr) this.LIZLLL).LIZJ(669, 0);
        }
        LiveLoggerService liveLoggerService3 = this.LJIILLIIL;
        long jCurrentTimeMillis = System.currentTimeMillis();
        liveLoggerService3.X1 = jCurrentTimeMillis;
        liveLoggerService3.LLILLL.LIZ = jCurrentTimeMillis;
        if (liveLoggerService3.LLJJJJ) {
            liveLoggerService3.j4 = jCurrentTimeMillis;
        }
        StringBuilder sbLIZ6 = C2188811AlT.LIZ();
        sbLIZ6.append("record start play time when call playResolution:");
        sbLIZ6.append(this.LJIILLIIL.LLILLL.LIZ);
        C2188811AlT.LIZIZ(sbLIZ6);
        C1698940uJQ.LIZJ();
        if (!C1474810oTv.LJLJLLL()) {
            LJLILLLLZI("playResolution");
        }
        LiveLoggerService liveLoggerService4 = this.LJIILLIIL;
        liveLoggerService4.LLJILJILJ = -1L;
        String str3 = this.LJLLJ;
        StringBuilder sbLIZ7 = C2188811AlT.LIZ();
        sbLIZ7.append("setting_");
        sbLIZ7.append(this.LLJILJIL);
        sbLIZ7.append("_to_");
        sbLIZ7.append(str);
        liveLoggerService4.LJJLIIIJJI(0, str3, "none", C2188811AlT.LIZIZ(sbLIZ7));
        LiveLoggerService liveLoggerService5 = this.LJIILLIIL;
        StringBuilder sbLIZ8 = C2188811AlT.LIZ();
        sbLIZ8.append("manual_abr_");
        sbLIZ8.append(this.LLJILJIL);
        sbLIZ8.append("_to_");
        sbLIZ8.append(str);
        liveLoggerService5.W2 = C2188811AlT.LIZIZ(sbLIZ8);
        LLLLIIL();
        LLLJL("playResolution");
        this.LLJILJIL = str;
        if (this.LJLZ && this.LJZI.equals("abr_bb_4live") && TextUtils.equals(str, "auto")) {
            LJJJJZI();
        }
        if (TextUtils.equals(str, "auto")) {
            this.T1 = this.LJJII.LJI();
        } else {
            this.T1 = str;
        }
        this.LLFII = str;
        ((ArrayList) this.LJIILLIIL.Y5).add(Long.valueOf(this.LJJII.LJ(this.T1, this.LLJILLL)));
        C1698510uIj c1698510uIj = this.LJJII;
        if (this.LLJILJIL.equals("auto")) {
            strLJI = this.LJJII.LJI();
        } else {
            strLJI = this.LLJILJIL;
        }
        String strLJIIJJI2 = c1698510uIj.LJIIJJI(strLJI, this.LLJJ, this.LLJILLL, this.LLJZIJLIL);
        if (this.LJZI.equals("rad") && str.equals("auto")) {
            this.LLJILJIL = this.LJJII.LJI();
        }
        if (TextUtils.isEmpty(strLJIIJJI2)) {
            StringBuilder sbLIZ9 = C2188811AlT.LIZ();
            sbLIZ9.append("");
            sbLIZ9.append(str);
            sbLIZ9.append(" playUrl not exist");
            C2188811AlT.LIZIZ(sbLIZ9);
            C1698940uJQ.LIZIZ();
            return false;
        }
        if (this.LIZLLL == null) {
            StringBuilder sbLIZ10 = C2188811AlT.LIZ();
            sbLIZ10.append("playResolution: player is null, resolution=");
            sbLIZ10.append(str);
            C2188811AlT.LIZIZ(sbLIZ10);
            C1698940uJQ.LJ();
            return false;
        }
        this.LJIILLIIL.H1 = str;
        if (this.LLLILZLLLI > 0) {
            LLLL();
        }
        this.LJIILLIIL.LJJJJZ(str);
        LLLLZLL();
        LLD();
        LLLLJ(true);
        ((C1470430oMr) this.LIZLLL).LIZJ(1349, 1);
        C1698510uIj c1698510uIj2 = this.LJJII;
        String str4 = this.LLJILJIL;
        String str5 = this.LLJILLL;
        if (!c1698510uIj2.LJJII()) {
            strLJIJI = null;
        } else {
            strLJIJI = c1698510uIj2.LIZIZ.LJIJI(str4, str5);
        }
        if ("bytevc2".equals(strLJIJI)) {
            C1698940uJQ.LJ();
            ((C1470430oMr) this.LIZLLL).setSurface(null);
            this.LJIILLIIL.LLLILZJ = "bytevc2";
        }
        LJJJJ();
        if (this.LIZLLL != null && this.LJJJJL == 1 && TextUtils.equals(this.LJJII.LJFF("fhd", this.LLJILLL), "hdr")) {
            C1698940uJQ.LIZJ();
            ((C1470430oMr) this.LIZLLL).LIZJ(1091, 1);
        }
        LJJIJLIJ();
        if (this.q2 > 0) {
            LJJLIL();
        }
        this.LJIILLIIL.LLJJIJIIJIL = strLJIIJJI2;
        this.LLLLZIL = true;
        if (!TextUtils.equals(this.LLJILJIL, "auto")) {
            this.LJIILLIIL.P1 = false;
        }
        LLLFF(strLJIIJJI2);
        return true;
    }

    public final void LLLII(String str) {
        if (TextUtils.isEmpty(str)) {
            C1698940uJQ.LIZIZ();
            return;
        }
        LJLIIIL();
        if (LJIIIZ() != EnumC1487700ooi.IDLE) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Has prepared -- ");
            sbLIZ.append(this.P0);
            C2188811AlT.LIZIZ(sbLIZ);
            C1698940uJQ.LIZJ();
            return;
        }
        LLLLLL(str);
        if (C1474810oTv.LJLJLLL()) {
            this.LJJIIJ.LIZ("prepare");
        }
        ((InterfaceC1470660oNE) this.LJJIIJZLJL).prepare(new C1484630ojl(10000));
    }

    public final void LLLIIL(String str) {
        JSONObject jSONObject;
        int i;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        if (this.Z2 == null) {
            C1698740uJ6 c1698740uJ6 = this.Y2;
            if (c1698740uJ6 != null) {
                i = c1698740uJ6.LJIILIIL;
            } else {
                i = 16;
            }
            this.Z2 = new C1698930uJP(i);
        }
        C1698930uJP c1698930uJP = this.Z2;
        c1698930uJP.getClass();
        if (!TextUtils.isEmpty(str)) {
            synchronized (c1698930uJP.LIZJ) {
                try {
                    try {
                        jSONObject = new JSONObject(str);
                        if (c1698930uJP.LIZIZ == null) {
                            c1698930uJP.LIZIZ = new JSONArray();
                        }
                    } catch (JSONException e) {
                        TryCatchGuardChecker.doCheck(e);
                    }
                    if (c1698930uJP.LIZIZ.length() >= c1698930uJP.LIZ) {
                        return;
                    }
                    c1698930uJP.LIZIZ.put(jSONObject);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
    }

    public final void LLLIILIL(boolean z) {
        if (z || Arrays.asList("quic", "h2", "h2q").contains(this.LLJJIJIIJIL)) {
            try {
                Method method = Class.forName("com.ss.videoarch.live.ttquic.ContextUtils").getMethod("initApplicationContext", Context.class);
                method.setAccessible(true);
                method.invoke(null, C786410Ut5.N3(this.LJIJI));
                Method method2 = Class.forName("com.ss.videoarch.live.ttquic.JNIUtils").getMethod("setClassLoader", ClassLoader.class);
                method2.setAccessible(true);
                method2.invoke(null, this.LJIJI.getClassLoader());
                this.LJJJJI = true;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("disable quic cert verify, ");
                sbLIZ.append(th.toString());
                C2188811AlT.LIZIZ(sbLIZ);
                C1698940uJQ.LIZIZ();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LLLILZJ(int r10) {
        /*
            r9 = this;
            com.ss.videoarch.liveplayer.log.LiveLoggerService r5 = r9.LJIILLIIL
            if (r5 == 0) goto L7a
            com.ss.videoarch.liveplayer.VideoLiveManager r2 = r5.LLILZ
            if (r2 == 0) goto L7a
            X.0uIh r1 = r5.LLILLL
            r0 = 7
            r8 = 0
            r2.LLFZ(r1, r0, r8)
            if (r10 == 0) goto L13
            r5.LLZ = r10
        L13:
            long r3 = r5.k3
            r6 = 0
            int r0 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            if (r0 <= 0) goto L27
            long r1 = r5.l3
            int r0 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r0 <= 0) goto L27
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 >= 0) goto L27
            r6 = 1
            goto L28
        L27:
            r6 = 0
        L28:
            org.json.JSONArray r0 = r5.U6     // Catch: org.json.JSONException -> L76
            int r0 = r0.length()     // Catch: org.json.JSONException -> L76
            if (r0 <= 0) goto L31
            r8 = 1
        L31:
            org.json.JSONObject r4 = r5.LJIILJJIL(r8)     // Catch: org.json.JSONException -> L76
            java.lang.String r0 = "result"
            org.json.JSONObject r3 = r4.put(r0, r10)     // Catch: org.json.JSONException -> L76
            java.lang.String r2 = "error_msg"
            if (r10 == 0) goto L65
            com.ss.videoarch.liveplayer.VideoLiveManager r0 = r5.LLILZ     // Catch: org.json.JSONException -> L76
            X.0oIr r1 = r0.LIZLLL     // Catch: org.json.JSONException -> L76
            X.0oMr r1 = (X.C1470430oMr) r1     // Catch: org.json.JSONException -> L76
            r0 = 5002(0x138a, float:7.009E-42)
            java.lang.String r0 = r1.LJIIIZ(r0)     // Catch: org.json.JSONException -> L76
        L4b:
            org.json.JSONObject r1 = r3.put(r2, r0)     // Catch: org.json.JSONException -> L76
            java.lang.String r0 = "first_audio_packet_dts_rollback"
            org.json.JSONObject r3 = r1.put(r0, r6)     // Catch: org.json.JSONException -> L76
            java.lang.String r2 = "first_audio_packet_dts"
            long r0 = r5.k3     // Catch: org.json.JSONException -> L76
            org.json.JSONObject r3 = r3.put(r2, r0)     // Catch: org.json.JSONException -> L76
            java.lang.String r2 = "previous_audio_packet_dts"
            long r0 = r5.l3     // Catch: org.json.JSONException -> L76
            r3.put(r2, r0)     // Catch: org.json.JSONException -> L76
            goto L68
        L65:
            java.lang.String r0 = "none"
            goto L4b
        L68:
            if (r10 == 0) goto L70
            int r0 = r5.V6     // Catch: org.json.JSONException -> L76
            int r0 = r0 + 1
            r5.V6 = r0     // Catch: org.json.JSONException -> L76
        L70:
            org.json.JSONArray r0 = r5.U6     // Catch: org.json.JSONException -> L76
            r0.put(r4)     // Catch: org.json.JSONException -> L76
            return
        L76:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
        L7a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.videoarch.liveplayer.VideoLiveManager.LLLILZJ(int):void");
    }

    public final void LLLJ(int i) {
        InterfaceC1467950oIr interfaceC1467950oIr = this.LIZLLL;
        if (interfaceC1467950oIr != null) {
            if (i == 0 || i == 2) {
                ((C1470430oMr) interfaceC1467950oIr).LJIIJ(418, 0L);
                ((C1470430oMr) this.LIZLLL).LJIIJ(417, 0L);
                ((C1470430oMr) this.LIZLLL).LJIIJ(416, 0L);
            }
            if (i == 1 || i == 2) {
                ((C1470430oMr) this.LIZLLL).LJIIJ(421, 0L);
                ((C1470430oMr) this.LIZLLL).LJIIJ(420, 0L);
                ((C1470430oMr) this.LIZLLL).LJIIJ(419, 0L);
            }
        }
    }

    public final void LLLJL(String str) {
        String strLIZIZ;
        String strOptString;
        C1698500uIi c1698500uIi;
        JSONObject jSONObject;
        if (C1474810oTv.LJLJLLL()) {
            LiveLoggerService liveLoggerService = this.LJIILLIIL;
            String str2 = this.LLJJI;
            String str3 = this.LLJJIJIIJIL;
            String str4 = this.LLJJIII;
            liveLoggerService.n1 = str2;
            liveLoggerService.m1 = str3;
            liveLoggerService.s1 = str4;
        } else {
            String strLJIILL = this.LJJII.LJIILL();
            s3 = strLJIILL;
            if (TextUtils.isEmpty(strLJIILL)) {
                s3 = UUID.randomUUID().toString().replace("-", "").toLowerCase();
            }
            LiveLoggerService liveLoggerService2 = this.LJIILLIIL;
            String str5 = this.LLJJI;
            String str6 = this.LLJJIJIIJIL;
            String str7 = this.LLJJIII;
            liveLoggerService2.n1 = str5;
            liveLoggerService2.m1 = str6;
            liveLoggerService2.s1 = str7;
            String lowerCase = s3;
            try {
                if (TextUtils.isEmpty(lowerCase)) {
                    lowerCase = UUID.randomUUID().toString().replace("-", "").toLowerCase(Locale.getDefault());
                }
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(lowerCase);
                sbLIZ.append(e3.d);
                sbLIZ.append(System.currentTimeMillis());
                sbLIZ.append(e3.d);
                sbLIZ.append(UUID.randomUUID().toString().hashCode());
                strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append(lowerCase);
                sbLIZ2.append(e3.d);
                sbLIZ2.append(System.currentTimeMillis());
                strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
            }
            liveLoggerService2.LLLLZLLIL = strLIZIZ;
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("caller:");
            sbLIZ3.append(str);
            sbLIZ3.append(", refresh sessionId old:");
            sbLIZ3.append(this.LLIIJLIL);
            sbLIZ3.append(", new:");
            sbLIZ3.append(this.LJIILLIIL.LLLLZLLIL);
            C2188811AlT.LIZIZ(sbLIZ3);
            C1698940uJQ.LIZJ();
            LiveLoggerService liveLoggerService3 = this.LJIILLIIL;
            this.LLIIJLIL = liveLoggerService3.LLLLZLLIL;
            if (!TextUtils.isEmpty(liveLoggerService3.LLLLZLLLI) && !"none".equals(this.LJIILLIIL.LLLLZLLLI)) {
                StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                sbLIZ4.append("skip PlayVVSessionID update, current value is valid: ");
                sbLIZ4.append(this.LJIILLIIL.LLLLZLLLI);
                C2188811AlT.LIZIZ(sbLIZ4);
                C1698940uJQ.LIZJ();
            } else {
                LiveLoggerService liveLoggerService4 = this.LJIILLIIL;
                liveLoggerService4.LLLLZLLLI = liveLoggerService4.LLLLZLLIL;
                StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                sbLIZ5.append("conditional update PlayVVSessionID: ");
                sbLIZ5.append(this.LJIILLIIL.LLLLZLLLI);
                C2188811AlT.LIZIZ(sbLIZ5);
                C1698940uJQ.LIZJ();
            }
        }
        LiveLoggerService liveLoggerService5 = this.LJIILLIIL;
        C1698510uIj c1698510uIj = this.LJJII;
        if (c1698510uIj.LJJII() && (jSONObject = (c1698500uIi = c1698510uIj.LIZIZ).LIZIZ) != null && jSONObject.has("rule_ids")) {
            strOptString = c1698500uIi.LIZIZ.optString("rule_ids");
        } else {
            strOptString = null;
        }
        liveLoggerService5.LLLLZIL = strOptString;
        LiveLoggerService liveLoggerService6 = this.LJIILLIIL;
        liveLoggerService6.F1 = this.LLJILJIL;
        liveLoggerService6.J1 = this.LJJII.LJI();
        if (this.LLZZ == 1) {
            LLLLIL();
        }
        StringBuilder sbLIZ6 = C2188811AlT.LIZ();
        sbLIZ6.append("finish set interface : ");
        sbLIZ6.append(this.LLZZ);
        C2188811AlT.LIZIZ(sbLIZ6);
        C1698940uJQ.LIZ();
    }

    public final void LLLLIILL(String str) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("setBizSessionId:");
        sbLIZ.append(str);
        C2188811AlT.LIZIZ(sbLIZ);
        C1698940uJQ.LIZJ();
        this.LLIZ = str;
        if (C1474810oTv.LJLJLLL()) {
            this.LJJIII.LIZJ = str;
        }
    }

    public final void LLLLIILLL(int i) {
        r3 = i;
        this.LJJII.LJJIIJZLJL(i);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("setFastOpenDuration ");
        sbLIZ.append(i);
        C2188811AlT.LIZIZ(sbLIZ);
        C1698940uJQ.LIZJ();
    }

    /* JADX WARN: Removed duplicated region for block: B:55:0x00f4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LLLLJ(boolean r14) {
        /*
            Method dump skipped, instruction units count: 374
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.videoarch.liveplayer.VideoLiveManager.LLLLJ(boolean):void");
    }

    public final void LLLLL(String str) {
        this.LLIIL = str;
        InterfaceC1467950oIr interfaceC1467950oIr = this.LIZLLL;
        if (interfaceC1467950oIr != null) {
            ((C1470430oMr) interfaceC1467950oIr).LIZ(901, str);
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("client set unique id:");
        sbLIZ.append(str);
        sbLIZ.append("-- ");
        sbLIZ.append(this.P0);
        C2188811AlT.LIZIZ(sbLIZ);
        C1698940uJQ.LIZJ();
    }

    public final void LLLLLIL(boolean z) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("setMute: ");
        sbLIZ.append(z);
        C2188811AlT.LIZIZ(sbLIZ);
        C1698940uJQ.LIZJ();
        this.w1 = z;
        C1698780uJA c1698780uJA = this.LJJIFFI;
        InterfaceC1470080oMI interfaceC1470080oMI = c1698780uJA.LIZIZ;
        if (interfaceC1470080oMI != null) {
            if (interfaceC1470080oMI.LJFF()) {
                float fLIZ = c1698780uJA.LIZ();
                if (fLIZ > 0.0f) {
                    c1698780uJA.LIZJ = c1698780uJA.LIZIZ() / fLIZ;
                }
                if (z) {
                    c1698780uJA.LIZIZ.LJIILLIIL(0.0f, 0.0f);
                } else {
                    InterfaceC1470080oMI interfaceC1470080oMI2 = c1698780uJA.LIZIZ;
                    float f = c1698780uJA.LIZJ;
                    interfaceC1470080oMI2.LJIILLIIL(f, f);
                }
            } else {
                c1698780uJA.LIZIZ.LJ(z);
            }
        }
        LiveLoggerService liveLoggerService = this.LJIILLIIL;
        if (liveLoggerService != null) {
            liveLoggerService.P3 = z ? 1 : 0;
            liveLoggerService.K0.lock();
            if (liveLoggerService.Y4 != z) {
                liveLoggerService.Y4 = z;
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("audio-abnormal update mute is ");
                sbLIZ2.append(liveLoggerService.Y4);
                C2188811AlT.LIZIZ(sbLIZ2);
                C1698940uJQ.LIZJ();
                liveLoggerService.LJLIIL();
            }
            liveLoggerService.K0.unlock();
        }
    }

    public final void LLLLLILLIL(C1698830uJF[] c1698830uJFArr) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("setPlayUrls, sdkParam:");
        sbLIZ.append(c1698830uJFArr);
        if (C2188811AlT.LIZIZ(sbLIZ) == null) {
            int length = c1698830uJFArr.length;
        }
        C1698940uJQ.LIZJ();
        C1698510uIj c1698510uIj = this.LJJII;
        c1698510uIj.LIZ = c1698830uJFArr;
        c1698510uIj.LJ = 0;
        c1698510uIj.LIZLLL = 1;
        ArrayList arrayList = new ArrayList();
        for (C1698830uJF c1698830uJF : c1698830uJFArr) {
            String str = c1698830uJF.LIZ;
            if (str != null) {
                arrayList.add(str);
            }
            String str2 = c1698830uJF.LIZIZ;
            if (str2 != null) {
                arrayList.add(str2);
            }
        }
        String[] strArr = new String[arrayList.size()];
        c1698510uIj.LIZJ = strArr;
        arrayList.toArray(strArr);
        if (C1474810oTv.LJLJLLL()) {
            this.LJJIII.LIZ = this.LJJII;
        }
        if (this.LJLLJ != null && this.LJJII.LJIIJ() != null && this.LJJII.LJIIJ().LIZ != this.LJLLJ) {
            LJJIJL("setPlayURLs");
        }
    }

    public final void LLLLLJIL(boolean z) {
        LiveLoggerService liveLoggerService = this.LJIILLIIL;
        if (liveLoggerService != null) {
            if (liveLoggerService.LLJJJJ && !z) {
                liveLoggerService.l4 = System.currentTimeMillis();
            }
            this.LJIILLIIL.LLJJJJ = z;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("setPreviewFlag: ");
        sbLIZ.append(z);
        sbLIZ.append(", mLogService: ");
        sbLIZ.append(this.LJIILLIIL);
        C2188811AlT.LIZIZ(sbLIZ);
        C1698940uJQ.LIZJ();
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0046  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LLLLLJLJLL(X.C0IJ8 r4) {
        /*
            r3 = this;
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "setRenderRotation rotation: "
            r1.append(r0)
            r1.append(r4)
            java.lang.String r0 = ", current rotation: "
            r1.append(r0)
            X.0IJ8 r0 = r3.L2
            r1.append(r0)
            X.C2188811AlT.LIZIZ(r1)
            X.C1698940uJQ.LIZJ()
            int[] r1 = X.C1698850uJH.LIZIZ
            int r0 = r4.ordinal()
            r1 = r1[r0]
            r0 = 1
            if (r1 == r0) goto L46
            r0 = 2
            if (r1 == r0) goto L43
            r0 = 3
            if (r1 == r0) goto L40
            r0 = 4
            if (r1 != r0) goto L46
            r2 = 270(0x10e, float:3.78E-43)
        L32:
            X.0oIr r1 = r3.LIZLLL
            if (r1 == 0) goto L3d
            r0 = 1948(0x79c, float:2.73E-42)
            X.0oMr r1 = (X.C1470430oMr) r1
            r1.LIZJ(r0, r2)
        L3d:
            r3.L2 = r4
            return
        L40:
            r2 = 180(0xb4, float:2.52E-43)
            goto L32
        L43:
            r2 = 90
            goto L32
        L46:
            r2 = 0
            goto L32
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.videoarch.liveplayer.VideoLiveManager.LLLLLJLJLL(X.0IJ8):void");
    }

    public final void LLLLLL(String str) {
        if (this.j3 && !TextUtils.isEmpty(str) && str.contains("\"rtp_token_map\":{\"")) {
            C1698940uJQ.LIZJ();
            return;
        }
        System.currentTimeMillis();
        if (LJIIIZ() != EnumC1487700ooi.IDLE && str.equals(this.e1)) {
            C1698940uJQ.LIZJ();
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("setStreamInfo:");
        sbLIZ.append(str);
        C1698940uJQ.LIZLLL("ILivePublicAPI", C2188811AlT.LIZIZ(sbLIZ));
        InterfaceC1698710uJ3 interfaceC1698710uJ3 = this.LJIJJ;
        if (interfaceC1698710uJ3 != null) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("setStreamInfo:");
            sbLIZ2.append(str);
            interfaceC1698710uJ3.LJJJJJ(C2188811AlT.LIZIZ(sbLIZ2));
        }
        LiveLoggerService liveLoggerService = this.LJIILLIIL;
        liveLoggerService.h1 = str;
        this.e1 = str;
        liveLoggerService.LJJZ();
        try {
            JSONObject jSONObject = new JSONObject(str);
            C1698510uIj c1698510uIj = this.LJJII;
            c1698510uIj.LIZIZ = new C1698500uIi(jSONObject);
            c1698510uIj.LJ = 0;
            c1698510uIj.LIZLLL = 2;
            if (C1474810oTv.LJLJLLL()) {
                this.LJJIII.LIZ = this.LJJII;
            }
            C1698940uJQ.LIZJ();
            if (this.LJJII.LJJIII()) {
                this.y.LIZJ = 6;
            }
        } catch (JSONException e) {
            TryCatchGuardChecker.doCheck(e);
        }
        LJJIJL("setStreamInfo");
    }

    public final void LLLLLLL(SurfaceHolder surfaceHolder) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("setSurfaceHolder: ");
        sbLIZ.append(surfaceHolder);
        C2188811AlT.LIZIZ(sbLIZ);
        C1698940uJQ.LIZJ();
        InterfaceC1698710uJ3 interfaceC1698710uJ3 = this.LJIJJ;
        if (interfaceC1698710uJ3 != null) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("setSurfaceHolder: ");
            sbLIZ2.append(surfaceHolder);
            interfaceC1698710uJ3.LJJJJJ(C2188811AlT.LIZIZ(sbLIZ2));
        }
        synchronized (this.v1) {
            try {
                if (this.LJJIIZ != null && this.LJJIIZI != null) {
                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                    sbLIZ3.append("remove callback:");
                    sbLIZ3.append(this.LJJIIZI);
                    sbLIZ3.append(", surfaceholder:");
                    sbLIZ3.append(surfaceHolder);
                    sbLIZ3.append(", mSurface:");
                    sbLIZ3.append(this.LJJIJ);
                    sbLIZ3.append(", mSurfaceHolder:");
                    sbLIZ3.append(this.LJJIIZ);
                    C2188811AlT.LIZIZ(sbLIZ3);
                    C1698940uJQ.LIZJ();
                    WeakReference<VideoLiveManager> weakReference = this.LJJIIZI.LL;
                    if (weakReference != null) {
                        weakReference.clear();
                    }
                    this.LJJIIZ.removeCallback(this.LJJIIZI);
                    this.LJJIIZI = null;
                }
                this.LJJIIZ = surfaceHolder;
                if (this.LIZLLL != null) {
                    this.LJIILLIIL.f1 = System.currentTimeMillis();
                    if (this.LJJIIZ != null) {
                        if (this.LJJIIZI == null) {
                            SurfaceHolderCallbackC1471310oOH surfaceHolderCallbackC1471310oOH = new SurfaceHolderCallbackC1471310oOH(this);
                            this.LJJIIZI = surfaceHolderCallbackC1471310oOH;
                            this.LJJIIZ.addCallback(surfaceHolderCallbackC1471310oOH);
                        }
                        C1698940uJQ.LIZJ();
                        LLLLLLLLL(-1L, this.LJJIIZ.getSurface(), false);
                    }
                    this.LJIILLIIL.e1 = System.currentTimeMillis() - this.LJIILLIIL.f1;
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public final void LLLLLLLLLL(SurfaceTexture surfaceTexture) {
        Surface surface;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("setSurfaceTexture: ");
        sbLIZ.append(surfaceTexture);
        C2188811AlT.LIZIZ(sbLIZ);
        C1698940uJQ.LIZJ();
        if (surfaceTexture == null) {
            surface = null;
        } else {
            surface = new Surface(surfaceTexture);
        }
        LLLLLLLLL(-1L, surface, false);
        InterfaceC1698710uJ3 interfaceC1698710uJ3 = this.LJIJJ;
        if (interfaceC1698710uJ3 != null) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("setSurfaceTexture: ");
            sbLIZ2.append(surfaceTexture);
            interfaceC1698710uJ3.LJJJJJ(C2188811AlT.LIZIZ(sbLIZ2));
        }
    }

    public final void LLLLLLLZIL(String str) {
        if (str == null) {
            return;
        }
        if (str.startsWith("https")) {
            this.LLJJIJIIJIL = "tls";
        } else if (str.startsWith("http")) {
            this.LLJJIJIIJIL = "tcp";
        }
        this.LLJJJ = this.LLJJIJIIJIL;
    }

    public final void LLLLLLZ(float f) {
        AudioManager audioManager;
        C1698780uJA c1698780uJA = this.LJJIFFI;
        if (c1698780uJA.LIZIZ != null && (audioManager = (AudioManager) C786410Ut5.H2(c1698780uJA.LIZ, "audio")) != null) {
            audioManager.setStreamVolume(3, (int) f, 0);
        }
        this.LJIILLIIL.getClass();
    }

    public final void LLLZ(String str) {
        String strLJI;
        if (!TextUtils.isEmpty(str)) {
            this.LLJILLL = str;
            C1698510uIj c1698510uIj = this.LJJII;
            if ("auto".equals(this.LLJILJIL)) {
                strLJI = this.LJJII.LJI();
            } else {
                strLJI = this.LLJILJIL;
            }
            String strLJIIJJI = c1698510uIj.LJIIJJI(strLJI, "flv", this.LLJILLL, this.LLJZIJLIL);
            if (!TextUtils.isEmpty(strLJIIJJI)) {
                this.LJLLJ = strLJIIJJI;
                if (!TextUtils.equals(this.LLJJ, "cmaf") && this.LJIILLIIL != null) {
                    if (LLJJJ()) {
                        String strLJIIJJI2 = this.LJJII.LJIIJJI(this.LLJILJIL, "flv", this.LLJILLL, this.LLJZIJLIL);
                        if (!TextUtils.isEmpty(strLJIIJJI2)) {
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append(strLJIIJJI);
                            sbLIZ.append("&llash=");
                            sbLIZ.append(strLJIIJJI2.replace("mem://llash/", ""));
                            strLJIIJJI = C2188811AlT.LIZIZ(sbLIZ);
                        }
                    }
                    this.LJIILLIIL.N3 = strLJIIJJI;
                }
            }
        }
    }

    public final void LLLZI(StrategyStartupGearInfo.GearResponse gearResponse) {
        String strLJIIJJI;
        String str;
        String strLJI;
        C1698940uJQ.LIZJ();
        if (!this.j3 && this.LJJII != null) {
            EnumC1487700ooi enumC1487700ooiLJIIIZ = LJIIIZ();
            EnumC1487700ooi enumC1487700ooi = EnumC1487700ooi.PREPARED;
            if (enumC1487700ooiLJIIIZ == enumC1487700ooi && gearResponse != null) {
                String strLLLFZ = LLLFZ(gearResponse.mStrategyLog, true);
                LLLZIIL(gearResponse, true);
                if (!TextUtils.isEmpty(strLLLFZ) && this.LJJII.LJJIFFI(strLLLFZ)) {
                    if (this.Q1) {
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("[StartupRetry] return because res equal:");
                        sbLIZ.append(this.O1);
                        C2188811AlT.LIZIZ(sbLIZ);
                        C1698940uJQ.LIZJ();
                        return;
                    }
                    if (!this.LLZLI && strLLLFZ.equals("origin")) {
                        LJJJ("uhd");
                    } else {
                        LJJJ(strLLLFZ);
                    }
                    C1698510uIj c1698510uIj = this.LJJII;
                    if (c1698510uIj.LIZLLL == 2) {
                        if ("auto".equals(this.LLJILJIL)) {
                            strLJI = this.LJJII.LJI();
                        } else {
                            strLJI = this.LLJILJIL;
                        }
                        strLJIIJJI = c1698510uIj.LJIIJJI(strLJI, this.LLJJ, this.LLJILLL, this.LLJZIJLIL);
                        if (strLJIIJJI != null) {
                            this.LJIIJ = strLJIIJJI;
                        } else {
                            return;
                        }
                    } else {
                        strLJIIJJI = null;
                    }
                    if (this.k1 == 1 && this.LJII == enumC1487700ooi && this.G && (str = this.Q0) != null) {
                        C1476650oWt c1476650oWt = C1476660oWu.LIZ;
                        if (c1476650oWt.LIZJ) {
                            LiveIOManager.getInstance().removeLiveEngineCallback(str);
                        }
                        String str2 = this.Q0;
                        if (c1476650oWt.LIZJ) {
                            LiveIOManager.getInstance().notifyFinish(str2, null);
                        }
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("[StartupRetry] notifyFinish:");
                        sbLIZ2.append(this.Q0);
                        C2188811AlT.LIZIZ(sbLIZ2);
                        C1698940uJQ.LIZJ();
                    }
                    LLLJL("updateStartupRetryResult");
                    InterfaceC1470660oNE interfaceC1470660oNE = (InterfaceC1470660oNE) this.LJJIIJZLJL;
                    C1484630ojl c1484630ojl = new C1484630ojl(10002);
                    c1484630ojl.LIZIZ = strLJIIJJI;
                    c1484630ojl.LIZJ = gearResponse;
                    interfaceC1470660oNE.prepare(c1484630ojl);
                    return;
                }
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("res is not right:");
                sbLIZ3.append(strLLLFZ);
                C2188811AlT.LIZIZ(sbLIZ3);
                C1698940uJQ.LIZJ();
                return;
            }
        }
        StringBuilder sbLIZ4 = C2188811AlT.LIZ();
        sbLIZ4.append("[StartupRetry] updateStartupRetryResult return because mCallPlay:");
        sbLIZ4.append(this.j3);
        C2188811AlT.LIZIZ(sbLIZ4);
        C1698940uJQ.LIZJ();
    }

    public final void setSurface(Surface surface) {
        C1698940uJQ.LIZJ();
        LLLLLLLLL(-1L, surface, false);
        InterfaceC1698710uJ3 interfaceC1698710uJ3 = this.LJIJJ;
        if (interfaceC1698710uJ3 != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("setSurface: ");
            sbLIZ.append(surface);
            interfaceC1698710uJ3.LJJJJJ(C2188811AlT.LIZIZ(sbLIZ));
        }
    }

    public static JSONObject LLL(String str, JSONObject jSONObject) {
        try {
            Object obj = jSONObject.get(str);
            if (obj instanceof JSONObject) {
                return (JSONObject) obj;
            }
            if (obj instanceof String) {
                return new JSONObject((String) obj);
            }
            return null;
        } catch (JSONException e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }

    public final void LIZ(int i, String str) {
        String strLIZIZ = "";
        switch (i) {
            case 26:
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("");
                sbLIZ.append("cacheFilePath:");
                sbLIZ.append(str);
                strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                this.LJLL = str;
                if (this.LIZLLL != null) {
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append(System.currentTimeMillis());
                    sbLIZ2.append("");
                    String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ2);
                    this.LJLLI = strLIZIZ2;
                    ((C1470430oMr) this.LIZLLL).LIZ(17, strLIZIZ2);
                    ((C1470430oMr) this.LIZLLL).LIZJ(14, 1);
                    ((C1470430oMr) this.LIZLLL).LJIJJ(str);
                }
                break;
            case 43:
                this.LJIILLIIL.G1 = str;
                this.LLFII = str;
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("");
                sbLIZ3.append("set resolution:");
                sbLIZ3.append(str);
                strLIZIZ = C2188811AlT.LIZIZ(sbLIZ3);
                LLLLIIL();
                this.LLJILJIL = str;
                break;
            case 60:
                StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                sbLIZ4.append("");
                sbLIZ4.append("set stream format:");
                sbLIZ4.append(str);
                strLIZIZ = C2188811AlT.LIZIZ(sbLIZ4);
                this.LLJJ = str;
                LiveLoggerService liveLoggerService = this.LJIILLIIL;
                liveLoggerService.l1 = str;
                liveLoggerService.LLLZ = str;
                if (this.LIZLLL != null && str.equals("cmaf")) {
                    if (this.f444J == 1 && this.I == 1) {
                        ((C1470430oMr) this.LIZLLL).LIZ(1250, str);
                        ((C1470430oMr) this.LIZLLL).LIZ(315, "live");
                    } else {
                        ((C1470430oMr) this.LIZLLL).LIZ(315, str);
                    }
                }
                break;
            case 63:
                this.LJIILLIIL.LLJILLL = str;
                break;
            case 64:
                this.LJIILLIIL.LLJJ = str;
                break;
            case 65:
                StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                sbLIZ5.append("");
                sbLIZ5.append(" abr strategy:");
                sbLIZ5.append(str);
                strLIZIZ = C2188811AlT.LIZIZ(sbLIZ5);
                this.LJZI = str;
                break;
            case 86:
                StringBuilder sbLIZ6 = C2188811AlT.LIZ();
                sbLIZ6.append("");
                sbLIZ6.append("cdn abr switch is not supported any more:");
                sbLIZ6.append(str);
                strLIZIZ = C2188811AlT.LIZIZ(sbLIZ6);
                break;
            case 89:
                StringBuilder sbLIZ7 = C2188811AlT.LIZ();
                sbLIZ7.append("");
                sbLIZ7.append("set url_host:");
                sbLIZ7.append(str);
                strLIZIZ = C2188811AlT.LIZIZ(sbLIZ7);
                break;
            case 91:
                StringBuilder sbLIZ8 = C2188811AlT.LIZ();
                sbLIZ8.append("");
                sbLIZ8.append("set drm verify license request info");
                sbLIZ8.append(str);
                strLIZIZ = C2188811AlT.LIZIZ(sbLIZ8);
                break;
            case 141:
                this.LJIILLIIL.LLJJI = str;
                break;
            case 150:
                StringBuilder sbLIZ9 = C2188811AlT.LIZ();
                sbLIZ9.append("");
                sbLIZ9.append("samicore audiometric model path=");
                sbLIZ9.append(str);
                strLIZIZ = C2188811AlT.LIZIZ(sbLIZ9);
                if (this.LIZLLL != null && !TextUtils.isEmpty(str)) {
                    ((C1470430oMr) this.LIZLLL).LIZ(1166, str);
                }
                break;
            case 157:
                StringBuilder sbLIZ10 = C2188811AlT.LIZ();
                sbLIZ10.append("");
                sbLIZ10.append("audio watermark content: ");
                sbLIZ10.append(str);
                strLIZIZ = C2188811AlT.LIZIZ(sbLIZ10);
                this.X2 = str;
                InterfaceC1467950oIr interfaceC1467950oIr = this.LIZLLL;
                if (interfaceC1467950oIr != null) {
                    ((C1470430oMr) interfaceC1467950oIr).LIZ(1182, str);
                }
                break;
            case 159:
                StringBuilder sbLIZ11 = C2188811AlT.LIZ();
                sbLIZ11.append("");
                sbLIZ11.append("set featuresdata ");
                sbLIZ11.append(str);
                strLIZIZ = C2188811AlT.LIZIZ(sbLIZ11);
                if (TextUtils.isEmpty(str)) {
                    synchronized (this.A1) {
                        try {
                            this.z1 = null;
                        } finally {
                        }
                    }
                } else {
                    try {
                        JSONObject jSONObject = new JSONObject(str);
                        if (jSONObject.length() > 0) {
                            synchronized (this.A1) {
                                try {
                                    this.z1 = jSONObject;
                                } finally {
                                }
                            }
                        }
                    } catch (JSONException e) {
                        TryCatchGuardChecker.doCheck(e);
                        StringBuilder sbLIZ12 = C2188811AlT.LIZ();
                        sbLIZ12.append("setMockFeaturesData failed, featuresData=");
                        sbLIZ12.append(str);
                        C2188811AlT.LIZIZ(sbLIZ12);
                        C1698940uJQ.LIZIZ();
                    }
                }
                break;
            case 200:
                this.e = str;
                LJJLJ();
                break;
        }
        StringBuilder sbLIZ13 = C2188811AlT.LIZ();
        sbLIZ13.append("player=");
        sbLIZ13.append(this.LIZLLL);
        sbLIZ13.append(", setStringOption ");
        sbLIZ13.append(strLIZIZ);
        C2188811AlT.LIZIZ(sbLIZ13);
        C1698940uJQ.LIZJ();
    }

    public final void LIZIZ(int i, long j) {
        String strLIZIZ = "";
        if (i != 59) {
            if (i != 95) {
                if (i != 320) {
                    if (i == 324) {
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("[AudioDucking] VideoLiveManager LIVE_OPTION_IS_AUDIO_DUCKING_WRITE_BLOCK ");
                        sbLIZ.append(i);
                        C2188811AlT.LIZIZ(sbLIZ);
                        C1698940uJQ.LIZIZ();
                        InterfaceC1467950oIr interfaceC1467950oIr = this.LIZLLL;
                        if (interfaceC1467950oIr != null) {
                            ((C1470430oMr) interfaceC1467950oIr).LIZIZ(435, j);
                        }
                    }
                } else {
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("[AudioDucking] VideoLiveManager LIVE_OPTION_IS_AUDIO_DUCKING_SET_CONFIG_BLOCK ");
                    sbLIZ2.append(i);
                    C2188811AlT.LIZIZ(sbLIZ2);
                    C1698940uJQ.LIZIZ();
                    InterfaceC1467950oIr interfaceC1467950oIr2 = this.LIZLLL;
                    if (interfaceC1467950oIr2 != null) {
                        ((C1470430oMr) interfaceC1467950oIr2).LIZIZ(431, j);
                    }
                }
            } else {
                NativeAudioProcessor nativeAudioProcessor = new NativeAudioProcessor();
                this.t = nativeAudioProcessor;
                nativeAudioProcessor.setNativeWrapper(j);
                if (this.LIZLLL != null && this.t != null) {
                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                    sbLIZ3.append("setAudioProcess ");
                    sbLIZ3.append(this.t);
                    C2188811AlT.LIZIZ(sbLIZ3);
                    C1698940uJQ.LIZJ();
                    InterfaceC1467950oIr interfaceC1467950oIr3 = this.LIZLLL;
                    if (interfaceC1467950oIr3 instanceof C1470430oMr) {
                        NativeAudioProcessor nativeAudioProcessor2 = this.t;
                        TTPlayerClient tTPlayerClient = ((C1470430oMr) interfaceC1467950oIr3).LIZ;
                        if (tTPlayerClient != null) {
                            tTPlayerClient.setAudioProcessor(nativeAudioProcessor2);
                        }
                    }
                }
            }
        } else {
            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
            sbLIZ4.append("");
            sbLIZ4.append("set alog func:");
            sbLIZ4.append(j);
            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ4);
            this.LLJIJIL = j;
        }
        StringBuilder sbLIZ5 = C2188811AlT.LIZ();
        sbLIZ5.append("setLongOptin ");
        sbLIZ5.append(strLIZIZ);
        C2188811AlT.LIZIZ(sbLIZ5);
        C1698940uJQ.LIZJ();
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void LIZJ(int i, int i2) {
        boolean z;
        LiveLoggerService liveLoggerService;
        boolean z2;
        boolean z3 = true;
        boolean z4 = true;
        int i3 = 1;
        String strLIZIZ = "";
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        if (i != 5) {
                            if (i != 21) {
                                if (i != 22) {
                                    if (i != 55) {
                                        boolean z5 = false;
                                        if (i != 56) {
                                            if (i != 96) {
                                                if (i != 97) {
                                                    if (i != 110) {
                                                        if (i != 111) {
                                                            if (i != 116) {
                                                                if (i != 117) {
                                                                    if (i != 131) {
                                                                        if (i != 132) {
                                                                            if (i != 167) {
                                                                                if (i != 168) {
                                                                                    switch (i) {
                                                                                        case 7:
                                                                                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                                                                                            sbLIZ.append("");
                                                                                            sbLIZ.append("hard_decode:");
                                                                                            sbLIZ.append(i2);
                                                                                            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                                                                                            this.LJJJJL = i2;
                                                                                            InterfaceC1467950oIr interfaceC1467950oIr = this.LIZLLL;
                                                                                            if (interfaceC1467950oIr != null) {
                                                                                                ((C1470430oMr) interfaceC1467950oIr).LIZJ(59, i2);
                                                                                            }
                                                                                            break;
                                                                                        case 8:
                                                                                            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                                                                                            sbLIZ2.append("");
                                                                                            sbLIZ2.append("enable_cache_file:");
                                                                                            sbLIZ2.append(i2);
                                                                                            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
                                                                                            this.LJJJJZ = i2;
                                                                                            InterfaceC1467950oIr interfaceC1467950oIr2 = this.LIZLLL;
                                                                                            if (interfaceC1467950oIr2 != null) {
                                                                                                ((C1470430oMr) interfaceC1467950oIr2).LIZJ(14, 1);
                                                                                            }
                                                                                            break;
                                                                                        case BdTuring.TYPE_ECAF /* 9 */:
                                                                                            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                                                                                            sbLIZ3.append("");
                                                                                            sbLIZ3.append("bytevc1_decoder_type:");
                                                                                            sbLIZ3.append(i2);
                                                                                            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ3);
                                                                                            this.LJJJJZI = i2;
                                                                                            InterfaceC1467950oIr interfaceC1467950oIr3 = this.LIZLLL;
                                                                                            if (interfaceC1467950oIr3 != null) {
                                                                                                ((C1470430oMr) interfaceC1467950oIr3).LIZJ(67, i2);
                                                                                            }
                                                                                            break;
                                                                                        case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                                                                                            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                                                                                            sbLIZ4.append("");
                                                                                            sbLIZ4.append("buffering_millSeconds:");
                                                                                            sbLIZ4.append(i2);
                                                                                            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ4);
                                                                                            this.LJJJLIIL = i2;
                                                                                            InterfaceC1467950oIr interfaceC1467950oIr4 = this.LIZLLL;
                                                                                            if (interfaceC1467950oIr4 != null) {
                                                                                                ((C1470430oMr) interfaceC1467950oIr4).LIZJ(86, i2);
                                                                                            }
                                                                                            break;
                                                                                        case BdTuring.TYPE_EMAIL /* 11 */:
                                                                                            StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                                                                                            sbLIZ5.append("");
                                                                                            sbLIZ5.append("buffering_timeout:");
                                                                                            sbLIZ5.append(i2);
                                                                                            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ5);
                                                                                            this.LJJJLL = i2;
                                                                                            InterfaceC1467950oIr interfaceC1467950oIr5 = this.LIZLLL;
                                                                                            if (interfaceC1467950oIr5 != null) {
                                                                                                ((C1470430oMr) interfaceC1467950oIr5).LIZJ(81, i2);
                                                                                            }
                                                                                            break;
                                                                                        case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                                                                                            StringBuilder sbLIZ6 = C2188811AlT.LIZ();
                                                                                            sbLIZ6.append("");
                                                                                            sbLIZ6.append("network_timeout:");
                                                                                            sbLIZ6.append(i2);
                                                                                            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ6);
                                                                                            this.LJJJLZIJ = i2;
                                                                                            InterfaceC1467950oIr interfaceC1467950oIr6 = this.LIZLLL;
                                                                                            if (interfaceC1467950oIr6 != null) {
                                                                                                ((C1470430oMr) interfaceC1467950oIr6).LIZJ(9, i2 * 1000000);
                                                                                            }
                                                                                            break;
                                                                                        default:
                                                                                            switch (i) {
                                                                                                case 31:
                                                                                                    StringBuilder sbLIZ7 = C2188811AlT.LIZ();
                                                                                                    sbLIZ7.append("");
                                                                                                    sbLIZ7.append("url_ability:");
                                                                                                    sbLIZ7.append(i2);
                                                                                                    strLIZIZ = C2188811AlT.LIZIZ(sbLIZ7);
                                                                                                    this.LLLIZZ = i2;
                                                                                                    if (i2 == 1 || i2 == 2) {
                                                                                                        this.LJIILLIIL.getClass();
                                                                                                    }
                                                                                                    break;
                                                                                                case 42:
                                                                                                    StringBuilder sbLIZ8 = C2188811AlT.LIZ();
                                                                                                    sbLIZ8.append("");
                                                                                                    sbLIZ8.append("enable NTP:");
                                                                                                    sbLIZ8.append(i2);
                                                                                                    strLIZIZ = C2188811AlT.LIZIZ(sbLIZ8);
                                                                                                    this.LLLJL = i2;
                                                                                                    break;
                                                                                                case 44:
                                                                                                    StringBuilder sbLIZ9 = C2188811AlT.LIZ();
                                                                                                    sbLIZ9.append("");
                                                                                                    sbLIZ9.append("set in main looper:");
                                                                                                    sbLIZ9.append(i2);
                                                                                                    strLIZIZ = C2188811AlT.LIZIZ(sbLIZ9);
                                                                                                    break;
                                                                                                case 77:
                                                                                                    StringBuilder sbLIZ10 = C2188811AlT.LIZ();
                                                                                                    sbLIZ10.append("");
                                                                                                    sbLIZ10.append("tsl time shift:");
                                                                                                    sbLIZ10.append(i2);
                                                                                                    strLIZIZ = C2188811AlT.LIZIZ(sbLIZ10);
                                                                                                    this.LLZL = i2;
                                                                                                    this.LJIILLIIL.getClass();
                                                                                                    break;
                                                                                                case 90:
                                                                                                    StringBuilder sbLIZ11 = C2188811AlT.LIZ();
                                                                                                    sbLIZ11.append("");
                                                                                                    sbLIZ11.append("set background status:");
                                                                                                    sbLIZ11.append(i2);
                                                                                                    strLIZIZ = C2188811AlT.LIZIZ(sbLIZ11);
                                                                                                    InterfaceC1467950oIr interfaceC1467950oIr7 = this.LIZLLL;
                                                                                                    if (interfaceC1467950oIr7 != null) {
                                                                                                        ((C1470430oMr) interfaceC1467950oIr7).LIZJ(658, i2);
                                                                                                    }
                                                                                                    break;
                                                                                                case 93:
                                                                                                    StringBuilder sbLIZ12 = C2188811AlT.LIZ();
                                                                                                    sbLIZ12.append("");
                                                                                                    sbLIZ12.append("set enable fallback dec:");
                                                                                                    sbLIZ12.append(i2);
                                                                                                    strLIZIZ = C2188811AlT.LIZIZ(sbLIZ12);
                                                                                                    InterfaceC1467950oIr interfaceC1467950oIr8 = this.LIZLLL;
                                                                                                    if (interfaceC1467950oIr8 != null) {
                                                                                                        ((C1470430oMr) interfaceC1467950oIr8).LIZJ(257, i2);
                                                                                                    }
                                                                                                    break;
                                                                                                case 122:
                                                                                                    StringBuilder sbLIZ13 = C2188811AlT.LIZ();
                                                                                                    sbLIZ13.append("");
                                                                                                    sbLIZ13.append("room state: ");
                                                                                                    sbLIZ13.append(i2);
                                                                                                    strLIZIZ = C2188811AlT.LIZIZ(sbLIZ13);
                                                                                                    LiveLoggerService liveLoggerService2 = this.LJIILLIIL;
                                                                                                    if (liveLoggerService2 != null) {
                                                                                                        if (i2 == 1) {
                                                                                                            if (liveLoggerService2.LLLZLZ && !liveLoggerService2.f6) {
                                                                                                                liveLoggerService2.e6 = System.currentTimeMillis();
                                                                                                            }
                                                                                                            liveLoggerService2.f6 = true;
                                                                                                        } else if (i2 == 2) {
                                                                                                            if (liveLoggerService2.LLLZLZ && liveLoggerService2.e6 > 0 && liveLoggerService2.f6) {
                                                                                                                liveLoggerService2.g6 += System.currentTimeMillis() - liveLoggerService2.e6;
                                                                                                            }
                                                                                                            liveLoggerService2.f6 = false;
                                                                                                        }
                                                                                                    }
                                                                                                    break;
                                                                                                case 142:
                                                                                                    if (i2 != 1) {
                                                                                                        if (i2 != 2) {
                                                                                                            StringBuilder sbLIZ14 = C2188811AlT.LIZ();
                                                                                                            sbLIZ14.append("");
                                                                                                            sbLIZ14.append("user-set qos constraint: unknown option ");
                                                                                                            sbLIZ14.append(i2);
                                                                                                            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ14);
                                                                                                        } else {
                                                                                                            StringBuilder sbLIZ15 = C2188811AlT.LIZ();
                                                                                                            sbLIZ15.append("");
                                                                                                            sbLIZ15.append("user-set qos constraint: fast first frame");
                                                                                                            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ15);
                                                                                                            this.A0 = 1;
                                                                                                        }
                                                                                                    } else {
                                                                                                        StringBuilder sbLIZ16 = C2188811AlT.LIZ();
                                                                                                        sbLIZ16.append("");
                                                                                                        sbLIZ16.append("user-set qos constraint: low latency");
                                                                                                        strLIZIZ = C2188811AlT.LIZIZ(sbLIZ16);
                                                                                                    }
                                                                                                    break;
                                                                                                case 145:
                                                                                                    LiveLoggerService liveLoggerService3 = this.LJIILLIIL;
                                                                                                    if (i2 == 1) {
                                                                                                        z = true;
                                                                                                    } else {
                                                                                                        z = false;
                                                                                                    }
                                                                                                    liveLoggerService3.g5 = z;
                                                                                                    if (this.I2 == 3 && i2 == 1 && C1474810oTv.LJJJLL()) {
                                                                                                        this.LJIILLIIL.LJJJJZI(0);
                                                                                                    }
                                                                                                    break;
                                                                                                case 156:
                                                                                                    StringBuilder sbLIZ17 = C2188811AlT.LIZ();
                                                                                                    sbLIZ17.append("");
                                                                                                    sbLIZ17.append("audio watermark appid: ");
                                                                                                    sbLIZ17.append(i2);
                                                                                                    strLIZIZ = C2188811AlT.LIZIZ(sbLIZ17);
                                                                                                    this.W2 = i2;
                                                                                                    InterfaceC1467950oIr interfaceC1467950oIr9 = this.LIZLLL;
                                                                                                    if (interfaceC1467950oIr9 != null) {
                                                                                                        ((C1470430oMr) interfaceC1467950oIr9).LIZJ(1181, i2);
                                                                                                    }
                                                                                                    break;
                                                                                                case 158:
                                                                                                    StringBuilder sbLIZ18 = C2188811AlT.LIZ();
                                                                                                    sbLIZ18.append("");
                                                                                                    sbLIZ18.append("is private room: ");
                                                                                                    sbLIZ18.append(i2);
                                                                                                    strLIZIZ = C2188811AlT.LIZIZ(sbLIZ18);
                                                                                                    this.V2 = i2;
                                                                                                    InterfaceC1467950oIr interfaceC1467950oIr10 = this.LIZLLL;
                                                                                                    if (interfaceC1467950oIr10 != null) {
                                                                                                        ((C1470430oMr) interfaceC1467950oIr10).LIZJ(1183, i2);
                                                                                                    }
                                                                                                    break;
                                                                                                case 160:
                                                                                                    LiveLoggerService liveLoggerService4 = this.LJIILLIIL;
                                                                                                    if (liveLoggerService4 != null) {
                                                                                                        liveLoggerService4.LLL = i2;
                                                                                                    }
                                                                                                    break;
                                                                                                case 171:
                                                                                                    StringBuilder sbLIZ19 = C2188811AlT.LIZ();
                                                                                                    sbLIZ19.append("");
                                                                                                    sbLIZ19.append("samicore audiometric use v2: ");
                                                                                                    sbLIZ19.append(i2);
                                                                                                    strLIZIZ = C2188811AlT.LIZIZ(sbLIZ19);
                                                                                                    InterfaceC1467950oIr interfaceC1467950oIr11 = this.LIZLLL;
                                                                                                    if (interfaceC1467950oIr11 != null) {
                                                                                                        ((C1470430oMr) interfaceC1467950oIr11).LIZJ(1191, i2);
                                                                                                    }
                                                                                                    break;
                                                                                                case DefaultHighLightCutConfig.DEFAULT_CUT_INTERVAL /* 300 */:
                                                                                                    this.g = i2;
                                                                                                    if (i2 == 1 && (liveLoggerService = this.LJIILLIIL) != null) {
                                                                                                        liveLoggerService.LLILZLL = Mp4ScreenVideoLoadTimeout.CONTROL;
                                                                                                    }
                                                                                                    break;
                                                                                                case 325:
                                                                                                    StringBuilder sbLIZ20 = C2188811AlT.LIZ();
                                                                                                    sbLIZ20.append("[AudioDucking] VideoLiveManager LIVE_OPTION_IS_AUDIO_DUCKING_SESSION_ID ");
                                                                                                    sbLIZ20.append(i);
                                                                                                    C2188811AlT.LIZIZ(sbLIZ20);
                                                                                                    C1698940uJQ.LIZJ();
                                                                                                    InterfaceC1467950oIr interfaceC1467950oIr12 = this.LIZLLL;
                                                                                                    if (interfaceC1467950oIr12 != null) {
                                                                                                        ((C1470430oMr) interfaceC1467950oIr12).LIZJ(436, i2);
                                                                                                    }
                                                                                                    break;
                                                                                                default:
                                                                                                    switch (i) {
                                                                                                        case 138:
                                                                                                            StringBuilder sbLIZ21 = C2188811AlT.LIZ();
                                                                                                            sbLIZ21.append("");
                                                                                                            sbLIZ21.append("EnableDropFrameByUser=");
                                                                                                            sbLIZ21.append(i2);
                                                                                                            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ21);
                                                                                                            this.E0 = i2;
                                                                                                            this.LJIILLIIL.getClass();
                                                                                                            InterfaceC1467950oIr interfaceC1467950oIr13 = this.LIZLLL;
                                                                                                            if (interfaceC1467950oIr13 != null) {
                                                                                                                ((C1470430oMr) interfaceC1467950oIr13).LIZJ(1510, i2);
                                                                                                            }
                                                                                                            break;
                                                                                                        case 139:
                                                                                                            StringBuilder sbLIZ22 = C2188811AlT.LIZ();
                                                                                                            sbLIZ22.append("");
                                                                                                            sbLIZ22.append("DropFrameRate=");
                                                                                                            sbLIZ22.append(i2);
                                                                                                            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ22);
                                                                                                            this.F0 = i2;
                                                                                                            this.LJIILLIIL.getClass();
                                                                                                            InterfaceC1467950oIr interfaceC1467950oIr14 = this.LIZLLL;
                                                                                                            if (interfaceC1467950oIr14 != null) {
                                                                                                                ((C1470430oMr) interfaceC1467950oIr14).LIZJ(1512, i2);
                                                                                                            }
                                                                                                            break;
                                                                                                        case 140:
                                                                                                            StringBuilder sbLIZ23 = C2188811AlT.LIZ();
                                                                                                            sbLIZ23.append("");
                                                                                                            sbLIZ23.append("DropFrameMinFps=");
                                                                                                            sbLIZ23.append(i2);
                                                                                                            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ23);
                                                                                                            this.G0 = i2;
                                                                                                            this.LJIILLIIL.getClass();
                                                                                                            InterfaceC1467950oIr interfaceC1467950oIr15 = this.LIZLLL;
                                                                                                            if (interfaceC1467950oIr15 != null) {
                                                                                                                ((C1470430oMr) interfaceC1467950oIr15).LIZJ(1511, i2);
                                                                                                            }
                                                                                                            break;
                                                                                                        default:
                                                                                                            switch (i) {
                                                                                                                case 151:
                                                                                                                    StringBuilder sbLIZ24 = C2188811AlT.LIZ();
                                                                                                                    sbLIZ24.append("");
                                                                                                                    sbLIZ24.append("samicore audiometric before ae: ");
                                                                                                                    sbLIZ24.append(i2);
                                                                                                                    strLIZIZ = C2188811AlT.LIZIZ(sbLIZ24);
                                                                                                                    boolean z6 = this.T2;
                                                                                                                    if (i2 == 1) {
                                                                                                                        z2 = true;
                                                                                                                    } else {
                                                                                                                        z2 = false;
                                                                                                                    }
                                                                                                                    this.T2 = z6 | z2;
                                                                                                                    if (i2 == 1 && this.Q2 == null) {
                                                                                                                        this.Q2 = new C1407370mj9(false);
                                                                                                                    }
                                                                                                                    InterfaceC1467950oIr interfaceC1467950oIr16 = this.LIZLLL;
                                                                                                                    if (interfaceC1467950oIr16 != null) {
                                                                                                                        ((C1470430oMr) interfaceC1467950oIr16).LIZJ(1164, i2);
                                                                                                                    }
                                                                                                                    break;
                                                                                                                case 152:
                                                                                                                    StringBuilder sbLIZ25 = C2188811AlT.LIZ();
                                                                                                                    sbLIZ25.append("");
                                                                                                                    sbLIZ25.append("samicore audiometric after ae: ");
                                                                                                                    sbLIZ25.append(i2);
                                                                                                                    strLIZIZ = C2188811AlT.LIZIZ(sbLIZ25);
                                                                                                                    boolean z7 = this.T2;
                                                                                                                    if (i2 == 1) {
                                                                                                                        z5 = true;
                                                                                                                    }
                                                                                                                    this.T2 = z7 | z5;
                                                                                                                    if (i2 == 1 && this.R2 == null) {
                                                                                                                        this.R2 = new C1407370mj9(true);
                                                                                                                    }
                                                                                                                    InterfaceC1467950oIr interfaceC1467950oIr17 = this.LIZLLL;
                                                                                                                    if (interfaceC1467950oIr17 != null) {
                                                                                                                        ((C1470430oMr) interfaceC1467950oIr17).LIZJ(1165, i2);
                                                                                                                    }
                                                                                                                    break;
                                                                                                                case 153:
                                                                                                                    StringBuilder sbLIZ26 = C2188811AlT.LIZ();
                                                                                                                    sbLIZ26.append("");
                                                                                                                    sbLIZ26.append("samicore audiometric detect duration thres: ");
                                                                                                                    sbLIZ26.append(i2);
                                                                                                                    strLIZIZ = C2188811AlT.LIZIZ(sbLIZ26);
                                                                                                                    InterfaceC1467950oIr interfaceC1467950oIr18 = this.LIZLLL;
                                                                                                                    if (interfaceC1467950oIr18 != null) {
                                                                                                                        ((C1470430oMr) interfaceC1467950oIr18).LIZJ(1168, i2);
                                                                                                                    }
                                                                                                                    break;
                                                                                                                case 154:
                                                                                                                    StringBuilder sbLIZ27 = C2188811AlT.LIZ();
                                                                                                                    sbLIZ27.append("");
                                                                                                                    sbLIZ27.append("samicore audiometric use handle pool: ");
                                                                                                                    sbLIZ27.append(i2);
                                                                                                                    strLIZIZ = C2188811AlT.LIZIZ(sbLIZ27);
                                                                                                                    InterfaceC1467950oIr interfaceC1467950oIr19 = this.LIZLLL;
                                                                                                                    if (interfaceC1467950oIr19 != null) {
                                                                                                                        ((C1470430oMr) interfaceC1467950oIr19).LIZJ(1169, i2);
                                                                                                                    }
                                                                                                                    break;
                                                                                                                default:
                                                                                                                    switch (i) {
                                                                                                                        case 321:
                                                                                                                            StringBuilder sbLIZ28 = C2188811AlT.LIZ();
                                                                                                                            sbLIZ28.append("[AudioDucking] VideoLiveManager LIVE_OPTION_IS_AUDIO_DUCKING_START ");
                                                                                                                            sbLIZ28.append(i);
                                                                                                                            C2188811AlT.LIZIZ(sbLIZ28);
                                                                                                                            C1698940uJQ.LIZJ();
                                                                                                                            InterfaceC1467950oIr interfaceC1467950oIr20 = this.LIZLLL;
                                                                                                                            if (interfaceC1467950oIr20 != null) {
                                                                                                                                ((C1470430oMr) interfaceC1467950oIr20).LIZJ(432, i2);
                                                                                                                            }
                                                                                                                            break;
                                                                                                                        case 322:
                                                                                                                            StringBuilder sbLIZ29 = C2188811AlT.LIZ();
                                                                                                                            sbLIZ29.append("[AudioDucking] VideoLiveManager LIVE_OPTION_IS_AUDIO_DUCKING_STOP ");
                                                                                                                            sbLIZ29.append(i);
                                                                                                                            C2188811AlT.LIZIZ(sbLIZ29);
                                                                                                                            C1698940uJQ.LIZJ();
                                                                                                                            InterfaceC1467950oIr interfaceC1467950oIr21 = this.LIZLLL;
                                                                                                                            if (interfaceC1467950oIr21 != null) {
                                                                                                                                ((C1470430oMr) interfaceC1467950oIr21).LIZJ(433, i2);
                                                                                                                            }
                                                                                                                            break;
                                                                                                                        case 323:
                                                                                                                            StringBuilder sbLIZ30 = C2188811AlT.LIZ();
                                                                                                                            sbLIZ30.append("[AudioDucking] VideoLiveManager LIVE_OPTION_IS_AUDIO_DUCKING_WRITE_BLOCK_SIZE ");
                                                                                                                            sbLIZ30.append(i);
                                                                                                                            C2188811AlT.LIZIZ(sbLIZ30);
                                                                                                                            C1698940uJQ.LIZJ();
                                                                                                                            InterfaceC1467950oIr interfaceC1467950oIr22 = this.LIZLLL;
                                                                                                                            if (interfaceC1467950oIr22 != null) {
                                                                                                                                ((C1470430oMr) interfaceC1467950oIr22).LIZJ(434, i2);
                                                                                                                            }
                                                                                                                            break;
                                                                                                                        default:
                                                                                                                            switch (i) {
                                                                                                                                case 16:
                                                                                                                                    StringBuilder sbLIZ31 = C2188811AlT.LIZ();
                                                                                                                                    sbLIZ31.append("");
                                                                                                                                    sbLIZ31.append("use_test_action:");
                                                                                                                                    sbLIZ31.append(i2);
                                                                                                                                    strLIZIZ = C2188811AlT.LIZIZ(sbLIZ31);
                                                                                                                                    InterfaceC1467950oIr interfaceC1467950oIr23 = this.LIZLLL;
                                                                                                                                    if (interfaceC1467950oIr23 != null) {
                                                                                                                                        ((C1470430oMr) interfaceC1467950oIr23).LIZJ(83, i2);
                                                                                                                                    }
                                                                                                                                    break;
                                                                                                                                case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                                                                                                                                    StringBuilder sbLIZ32 = C2188811AlT.LIZ();
                                                                                                                                    sbLIZ32.append("");
                                                                                                                                    sbLIZ32.append("hurry_time:");
                                                                                                                                    sbLIZ32.append(i2);
                                                                                                                                    strLIZIZ = C2188811AlT.LIZIZ(sbLIZ32);
                                                                                                                                    this.LJLILLLLZI = i2;
                                                                                                                                    InterfaceC1467950oIr interfaceC1467950oIr24 = this.LIZLLL;
                                                                                                                                    if (interfaceC1467950oIr24 != null) {
                                                                                                                                        ((C1470430oMr) interfaceC1467950oIr24).LIZJ(15, i2);
                                                                                                                                        this.LJIILLIIL.LLLLIIL = i2;
                                                                                                                                    }
                                                                                                                                    break;
                                                                                                                                case LiveToolbarIconStyleSetting.COLORFUL_WITH_TEXT /* 18 */:
                                                                                                                                    StringBuilder sbLIZ33 = C2188811AlT.LIZ();
                                                                                                                                    sbLIZ33.append("");
                                                                                                                                    sbLIZ33.append("hurry_type:");
                                                                                                                                    sbLIZ33.append(i2);
                                                                                                                                    strLIZIZ = C2188811AlT.LIZIZ(sbLIZ33);
                                                                                                                                    this.LJLIL = i2;
                                                                                                                                    InterfaceC1467950oIr interfaceC1467950oIr25 = this.LIZLLL;
                                                                                                                                    if (interfaceC1467950oIr25 != null) {
                                                                                                                                        ((C1470430oMr) interfaceC1467950oIr25).LIZJ(84, i2);
                                                                                                                                    }
                                                                                                                                    break;
                                                                                                                                default:
                                                                                                                                    switch (i) {
                                                                                                                                        case LiveToolbarIconStyleSetting.GRAY_WITHOUT_TEXT /* 33 */:
                                                                                                                                            StringBuilder sbLIZ34 = C2188811AlT.LIZ();
                                                                                                                                            sbLIZ34.append("");
                                                                                                                                            sbLIZ34.append("asyncInit:");
                                                                                                                                            sbLIZ34.append(i2);
                                                                                                                                            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ34);
                                                                                                                                            this.LJJL = i2;
                                                                                                                                            InterfaceC1467950oIr interfaceC1467950oIr26 = this.LIZLLL;
                                                                                                                                            if (interfaceC1467950oIr26 != null && this.LJJJJL == 1) {
                                                                                                                                                ((C1470430oMr) interfaceC1467950oIr26).LIZJ(181, i2);
                                                                                                                                                this.LJIILLIIL.getClass();
                                                                                                                                            }
                                                                                                                                            break;
                                                                                                                                        case LiveToolbarIconStyleSetting.COLORFUL_WITHOUT_TEXT /* 34 */:
                                                                                                                                            StringBuilder sbLIZ35 = C2188811AlT.LIZ();
                                                                                                                                            sbLIZ35.append("");
                                                                                                                                            sbLIZ35.append("defaultCodecID:");
                                                                                                                                            sbLIZ35.append(i2);
                                                                                                                                            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ35);
                                                                                                                                            this.LJJJZ = i2;
                                                                                                                                            break;
                                                                                                                                        case 35:
                                                                                                                                            StringBuilder sbLIZ36 = C2188811AlT.LIZ();
                                                                                                                                            sbLIZ36.append("");
                                                                                                                                            sbLIZ36.append("enable 264 hardware decode ");
                                                                                                                                            sbLIZ36.append(i2);
                                                                                                                                            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ36);
                                                                                                                                            this.LLLLIIIILLL = i2;
                                                                                                                                            break;
                                                                                                                                        case LiveToolbarIconStyleSetting.HIGHLIGHT_WITHOUT_TEXT /* 36 */:
                                                                                                                                            StringBuilder sbLIZ37 = C2188811AlT.LIZ();
                                                                                                                                            sbLIZ37.append("");
                                                                                                                                            sbLIZ37.append("enable bytevc1 hardware decode ");
                                                                                                                                            sbLIZ37.append(i2);
                                                                                                                                            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ37);
                                                                                                                                            this.LLLLIIL = i2;
                                                                                                                                            break;
                                                                                                                                        default:
                                                                                                                                            switch (i) {
                                                                                                                                                case 38:
                                                                                                                                                    StringBuilder sbLIZ38 = C2188811AlT.LIZ();
                                                                                                                                                    sbLIZ38.append("");
                                                                                                                                                    sbLIZ38.append("enable test split ");
                                                                                                                                                    sbLIZ38.append(i2);
                                                                                                                                                    strLIZIZ = C2188811AlT.LIZIZ(sbLIZ38);
                                                                                                                                                    InterfaceC1467950oIr interfaceC1467950oIr27 = this.LIZLLL;
                                                                                                                                                    if (interfaceC1467950oIr27 != null) {
                                                                                                                                                        ((C1470430oMr) interfaceC1467950oIr27).LIZJ(87, i2);
                                                                                                                                                    }
                                                                                                                                                    break;
                                                                                                                                                case 39:
                                                                                                                                                    StringBuilder sbLIZ39 = C2188811AlT.LIZ();
                                                                                                                                                    sbLIZ39.append("");
                                                                                                                                                    sbLIZ39.append("enable httpk degrade:");
                                                                                                                                                    sbLIZ39.append(i2);
                                                                                                                                                    strLIZIZ = C2188811AlT.LIZIZ(sbLIZ39);
                                                                                                                                                    this.LLLLIILLL = i2;
                                                                                                                                                    break;
                                                                                                                                                case 40:
                                                                                                                                                    StringBuilder sbLIZ40 = C2188811AlT.LIZ();
                                                                                                                                                    sbLIZ40.append("");
                                                                                                                                                    sbLIZ40.append("enable fast open:");
                                                                                                                                                    sbLIZ40.append(i2);
                                                                                                                                                    strLIZIZ = C2188811AlT.LIZIZ(sbLIZ40);
                                                                                                                                                    this.LLLLJI = i2;
                                                                                                                                                    break;
                                                                                                                                                default:
                                                                                                                                                    switch (i) {
                                                                                                                                                        case 83:
                                                                                                                                                            this.LJLILLLLZI = i2;
                                                                                                                                                            StringBuilder sbLIZ41 = C2188811AlT.LIZ();
                                                                                                                                                            sbLIZ41.append("");
                                                                                                                                                            sbLIZ41.append("hurry_time:");
                                                                                                                                                            sbLIZ41.append(i2);
                                                                                                                                                            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ41);
                                                                                                                                                            InterfaceC1467950oIr interfaceC1467950oIr28 = this.LIZLLL;
                                                                                                                                                            if (interfaceC1467950oIr28 != null) {
                                                                                                                                                                ((C1470430oMr) interfaceC1467950oIr28).LIZJ(397, i2);
                                                                                                                                                                this.LJIILLIIL.LLLLIIL = i2;
                                                                                                                                                            }
                                                                                                                                                            break;
                                                                                                                                                        case 84:
                                                                                                                                                            StringBuilder sbLIZ42 = C2188811AlT.LIZ();
                                                                                                                                                            sbLIZ42.append("");
                                                                                                                                                            sbLIZ42.append("slow_play_time:");
                                                                                                                                                            sbLIZ42.append(i2);
                                                                                                                                                            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ42);
                                                                                                                                                            this.LJLJLJ = i2;
                                                                                                                                                            InterfaceC1467950oIr interfaceC1467950oIr29 = this.LIZLLL;
                                                                                                                                                            if (interfaceC1467950oIr29 != null) {
                                                                                                                                                                ((C1470430oMr) interfaceC1467950oIr29).LIZJ(398, i2);
                                                                                                                                                                this.LJIILLIIL.LLLLLJLJLL = i2;
                                                                                                                                                            }
                                                                                                                                                            break;
                                                                                                                                                        case 85:
                                                                                                                                                            StringBuilder sbLIZ43 = C2188811AlT.LIZ();
                                                                                                                                                            sbLIZ43.append("");
                                                                                                                                                            sbLIZ43.append("enable free flow:");
                                                                                                                                                            sbLIZ43.append(i2);
                                                                                                                                                            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ43);
                                                                                                                                                            this.f449e0 = i2;
                                                                                                                                                            this.x.getClass();
                                                                                                                                                            this.LJIILLIIL.LLJZ = i2;
                                                                                                                                                            break;
                                                                                                                                                    }
                                                                                                                                                    break;
                                                                                                                                            }
                                                                                                                                            break;
                                                                                                                                    }
                                                                                                                                    break;
                                                                                                                            }
                                                                                                                            break;
                                                                                                                    }
                                                                                                                    break;
                                                                                                            }
                                                                                                            break;
                                                                                                    }
                                                                                                    break;
                                                                                            }
                                                                                            break;
                                                                                    }
                                                                                } else {
                                                                                    StringBuilder sbLIZ44 = C2188811AlT.LIZ();
                                                                                    sbLIZ44.append("");
                                                                                    sbLIZ44.append("set background mode:");
                                                                                    sbLIZ44.append(i2);
                                                                                    strLIZIZ = C2188811AlT.LIZIZ(sbLIZ44);
                                                                                    this.LJIILLIIL.e5 = i2;
                                                                                }
                                                                            } else {
                                                                                StringBuilder sbLIZ45 = C2188811AlT.LIZ();
                                                                                sbLIZ45.append("");
                                                                                sbLIZ45.append("set background status:");
                                                                                sbLIZ45.append(i2);
                                                                                strLIZIZ = C2188811AlT.LIZIZ(sbLIZ45);
                                                                                LiveLoggerService liveLoggerService5 = this.LJIILLIIL;
                                                                                if (liveLoggerService5.h5) {
                                                                                    if (i2 == 0) {
                                                                                        z4 = false;
                                                                                    }
                                                                                    liveLoggerService5.K0.lock();
                                                                                    if (liveLoggerService5.a5 != z4) {
                                                                                        liveLoggerService5.a5 = z4;
                                                                                        liveLoggerService5.LJLJL();
                                                                                    }
                                                                                    liveLoggerService5.w6.LIZIZ(z4);
                                                                                    if (liveLoggerService5.LLIZ > 0) {
                                                                                        liveLoggerService5.x6.LIZIZ(z4);
                                                                                    }
                                                                                    liveLoggerService5.K0.unlock();
                                                                                }
                                                                            }
                                                                        } else {
                                                                            StringBuilder sbLIZ46 = C2188811AlT.LIZ();
                                                                            sbLIZ46.append("");
                                                                            sbLIZ46.append("is real auto resolution: ");
                                                                            sbLIZ46.append(i2);
                                                                            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ46);
                                                                            if (this.J2 == 0 && i2 == 1 && this.s) {
                                                                                LJJJJZI();
                                                                            }
                                                                            this.J2 = i2;
                                                                        }
                                                                    } else {
                                                                        StringBuilder sbLIZ47 = C2188811AlT.LIZ();
                                                                        sbLIZ47.append("");
                                                                        sbLIZ47.append("preplay type: ");
                                                                        sbLIZ47.append(i2);
                                                                        strLIZIZ = C2188811AlT.LIZIZ(sbLIZ47);
                                                                        this.I2 = i2;
                                                                        if (C1474810oTv.LJJJLL()) {
                                                                            LiveLoggerService liveLoggerService6 = this.LJIILLIIL;
                                                                            if (i2 != 3) {
                                                                                i3 = 0;
                                                                            }
                                                                            liveLoggerService6.LJJJJZI(i3);
                                                                        }
                                                                    }
                                                                } else {
                                                                    StringBuilder sbLIZ48 = C2188811AlT.LIZ();
                                                                    sbLIZ48.append("");
                                                                    sbLIZ48.append("enable rtm pause use play: ");
                                                                    sbLIZ48.append(i2);
                                                                    strLIZIZ = C2188811AlT.LIZIZ(sbLIZ48);
                                                                }
                                                            } else {
                                                                StringBuilder sbLIZ49 = C2188811AlT.LIZ();
                                                                sbLIZ49.append("");
                                                                sbLIZ49.append("set analyzed duration:");
                                                                sbLIZ49.append(i2);
                                                                strLIZIZ = C2188811AlT.LIZIZ(sbLIZ49);
                                                                this.U1 = i2;
                                                            }
                                                        } else {
                                                            StringBuilder sbLIZ50 = C2188811AlT.LIZ();
                                                            sbLIZ50.append("");
                                                            sbLIZ50.append("global enable audio volume balance:");
                                                            sbLIZ50.append(i2);
                                                            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ50);
                                                            this.LLLZI = i2;
                                                        }
                                                    } else {
                                                        StringBuilder sbLIZ51 = C2188811AlT.LIZ();
                                                        sbLIZ51.append("");
                                                        sbLIZ51.append("enable set AudioProcessor after play:");
                                                        sbLIZ51.append(i2);
                                                        strLIZIZ = C2188811AlT.LIZIZ(sbLIZ51);
                                                        InterfaceC1467950oIr interfaceC1467950oIr30 = this.LIZLLL;
                                                        if (interfaceC1467950oIr30 != null) {
                                                            ((C1470430oMr) interfaceC1467950oIr30).LIZJ(1073, i2);
                                                        }
                                                    }
                                                } else {
                                                    StringBuilder sbLIZ52 = C2188811AlT.LIZ();
                                                    sbLIZ52.append("");
                                                    sbLIZ52.append("set dummy audio sleep:");
                                                    sbLIZ52.append(i2);
                                                    strLIZIZ = C2188811AlT.LIZIZ(sbLIZ52);
                                                    this.T0 = i2;
                                                    InterfaceC1467950oIr interfaceC1467950oIr31 = this.LIZLLL;
                                                    if (interfaceC1467950oIr31 != null) {
                                                        ((C1470430oMr) interfaceC1467950oIr31).LIZJ(539, i2);
                                                    }
                                                }
                                            } else {
                                                StringBuilder sbLIZ53 = C2188811AlT.LIZ();
                                                sbLIZ53.append("");
                                                sbLIZ53.append("set set voice:");
                                                sbLIZ53.append(i2);
                                                strLIZIZ = C2188811AlT.LIZIZ(sbLIZ53);
                                                this.S0 = i2;
                                                InterfaceC1467950oIr interfaceC1467950oIr32 = this.LIZLLL;
                                                if (interfaceC1467950oIr32 != null) {
                                                    ((C1470430oMr) interfaceC1467950oIr32).LIZJ(378, i2);
                                                }
                                            }
                                        } else {
                                            StringBuilder sbLIZ54 = C2188811AlT.LIZ();
                                            sbLIZ54.append("");
                                            sbLIZ54.append("enable resolution degrade:");
                                            sbLIZ54.append(i2);
                                            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ54);
                                            if (i2 != 1) {
                                                z3 = false;
                                            }
                                            this.LJLZ = z3;
                                        }
                                    } else {
                                        StringBuilder sbLIZ55 = C2188811AlT.LIZ();
                                        sbLIZ55.append("");
                                        sbLIZ55.append("set stall count thre:");
                                        sbLIZ55.append(i2);
                                        strLIZIZ = C2188811AlT.LIZIZ(sbLIZ55);
                                        this.LLFZ = i2;
                                    }
                                } else {
                                    StringBuilder sbLIZ56 = C2188811AlT.LIZ();
                                    sbLIZ56.append("");
                                    sbLIZ56.append("check side data");
                                    sbLIZ56.append(i2);
                                    strLIZIZ = C2188811AlT.LIZIZ(sbLIZ56);
                                    this.LLLLIILL = i2;
                                    InterfaceC1467950oIr interfaceC1467950oIr33 = this.LIZLLL;
                                    if (interfaceC1467950oIr33 != null) {
                                        ((C1470430oMr) interfaceC1467950oIr33).LIZJ(132, i2);
                                    }
                                }
                            } else {
                                StringBuilder sbLIZ57 = C2188811AlT.LIZ();
                                sbLIZ57.append("");
                                sbLIZ57.append("slow_play_time:");
                                sbLIZ57.append(i2);
                                strLIZIZ = C2188811AlT.LIZIZ(sbLIZ57);
                                this.LJLJLJ = i2;
                                InterfaceC1467950oIr interfaceC1467950oIr34 = this.LIZLLL;
                                if (interfaceC1467950oIr34 != null) {
                                    ((C1470430oMr) interfaceC1467950oIr34).LIZJ(190, i2);
                                    this.LJIILLIIL.LLLLLJLJLL = i2;
                                }
                            }
                        } else {
                            StringBuilder sbLIZ58 = C2188811AlT.LIZ();
                            sbLIZ58.append("");
                            sbLIZ58.append("render_type:");
                            sbLIZ58.append(i2);
                            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ58);
                            this.LJJJJJL = i2;
                            InterfaceC1467950oIr interfaceC1467950oIr35 = this.LIZLLL;
                            if (interfaceC1467950oIr35 != null) {
                                ((C1470430oMr) interfaceC1467950oIr35).LIZJ(56, i2);
                            }
                        }
                    } else {
                        StringBuilder sbLIZ59 = C2188811AlT.LIZ();
                        sbLIZ59.append("");
                        sbLIZ59.append("image_layout:");
                        sbLIZ59.append(i2);
                        strLIZIZ = C2188811AlT.LIZIZ(sbLIZ59);
                        this.LJJJJJ = i2;
                        InterfaceC1467950oIr interfaceC1467950oIr36 = this.LIZLLL;
                        if (interfaceC1467950oIr36 != null) {
                            ((C1470430oMr) interfaceC1467950oIr36).LIZJ(36, i2);
                        }
                    }
                } else {
                    StringBuilder sbLIZ60 = C2188811AlT.LIZ();
                    sbLIZ60.append("");
                    sbLIZ60.append("forbid_os_player:");
                    sbLIZ60.append(i2);
                    strLIZIZ = C2188811AlT.LIZIZ(sbLIZ60);
                    x.LJI(11, i2);
                }
            } else {
                StringBuilder sbLIZ61 = C2188811AlT.LIZ();
                sbLIZ61.append("");
                sbLIZ61.append("image_scale:");
                sbLIZ61.append(i2);
                strLIZIZ = C2188811AlT.LIZIZ(sbLIZ61);
                InterfaceC1467950oIr interfaceC1467950oIr37 = this.LIZLLL;
                if (interfaceC1467950oIr37 != null) {
                    ((C1470430oMr) interfaceC1467950oIr37).LIZJ(38, i2);
                }
            }
        } else {
            StringBuilder sbLIZ62 = C2188811AlT.LIZ();
            sbLIZ62.append("");
            sbLIZ62.append("image_enhancement:");
            sbLIZ62.append(i2);
            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ62);
            InterfaceC1467950oIr interfaceC1467950oIr38 = this.LIZLLL;
            if (interfaceC1467950oIr38 != null) {
                ((C1470430oMr) interfaceC1467950oIr38).LIZJ(37, i2);
            }
        }
        StringBuilder sbLIZ63 = C2188811AlT.LIZ();
        sbLIZ63.append("player=");
        sbLIZ63.append(this.LIZLLL);
        sbLIZ63.append(", setIntOption ");
        sbLIZ63.append(strLIZIZ);
        C2188811AlT.LIZIZ(sbLIZ63);
        C1698940uJQ.LIZJ();
    }

    public final void LJJJI(String str, boolean z) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("_stop, mLivePlayerState ");
        sbLIZ.append(this.LJIIIIZZ);
        sbLIZ.append(", isStopPlayer ");
        sbLIZ.append(z);
        C827820Wdg.LIZ(this, "VideoLiveManager", C2188811AlT.LIZIZ(sbLIZ));
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("_stop -- ");
        sbLIZ2.append(this.P0);
        C2188811AlT.LIZIZ(sbLIZ2);
        C1698940uJQ.LIZJ();
        EnumC1487710ooj enumC1487710ooj = this.LJIIIIZZ;
        EnumC1487710ooj enumC1487710ooj2 = EnumC1487710ooj.PLAYED;
        if (enumC1487710ooj != enumC1487710ooj2 && enumC1487710ooj != EnumC1487710ooj.PAUSED && enumC1487710ooj != EnumC1487710ooj.PREPARING) {
            return;
        }
        if (enumC1487710ooj == enumC1487710ooj2 || enumC1487710ooj == EnumC1487710ooj.PAUSED || enumC1487710ooj == EnumC1487710ooj.PREPARING) {
            this.LJIILLIIL.LJLJJI(1);
        }
        InterfaceC1467950oIr interfaceC1467950oIr = this.LIZLLL;
        if (interfaceC1467950oIr != null) {
            ((C1470430oMr) interfaceC1467950oIr).LIZJ(1349, 0);
        }
        if (z) {
            LJJJJ();
        } else {
            this.LJIIIZ = EnumC1487690ooh.INITIALIZED;
        }
        LJJJIL(str);
        this.LJIIIIZZ = EnumC1487710ooj.STOPPED;
        LiveLoggerService liveLoggerService = this.LJIILLIIL;
        liveLoggerService.P3 = -1;
        liveLoggerService.Q3 = -1.0f;
        liveLoggerService.j5.clear();
        this.LLLLZLLIL = null;
        this.LLFII = "origin";
        this.w1 = false;
        this.LLLZI = -1;
        this.T1 = "none";
        this.U1 = 0;
        this.LLJILLL = "main";
        this.I2 = -1;
        this.J2 = -1;
        this.f449e0 = 0;
        this.A0 = 0;
    }

    public final void LJJJJL(int i, Map map) {
        InterfaceC1467950oIr interfaceC1467950oIr = this.LIZLLL;
        if (interfaceC1467950oIr == null) {
            return;
        }
        if (i == 0 || i == 2) {
            long jLJIIJ = ((C1470430oMr) interfaceC1467950oIr).LJIIJ(418, 0L);
            long jLJIIJ2 = ((C1470430oMr) this.LIZLLL).LJIIJ(417, 0L);
            long jLJIIJ3 = ((C1470430oMr) this.LIZLLL).LJIIJ(416, 0L);
            long jLJIIJ4 = ((C1470430oMr) this.LIZLLL).LJIIJ(423, 0L);
            C1486300omS.LIZ(jLJIIJ3 / 1000, "new_video_render_stall_time", map);
            C1486300omS.LIZ(jLJIIJ3 % 1000, "new_video_render_stall_count", map);
            C1486300omS.LIZ(jLJIIJ2 / 1000, "new_video_demux_stall_time", map);
            C1486300omS.LIZ(jLJIIJ2 % 1000, "new_video_demux_stall_count", map);
            C1486300omS.LIZ(jLJIIJ / 1000, "new_video_decode_stall_time", map);
            C1486300omS.LIZ(jLJIIJ % 1000, "new_video_decode_stall_count", map);
            C1486300omS.LIZ(jLJIIJ4 / 1000, "new_video_outlet_read_stall_time", map);
            C1486300omS.LIZ(jLJIIJ4 % 1000, "new_video_outlet_read_stall_count", map);
        }
        if (i == 1 || i == 2) {
            long jLJIIJ5 = ((C1470430oMr) this.LIZLLL).LJIIJ(421, 0L);
            long jLJIIJ6 = ((C1470430oMr) this.LIZLLL).LJIIJ(420, 0L);
            long jLJIIJ7 = ((C1470430oMr) this.LIZLLL).LJIIJ(419, 0L);
            C1486300omS.LIZ(jLJIIJ7 / 1000, "new_audio_render_stall_time", map);
            C1486300omS.LIZ(jLJIIJ7 % 1000, "new_audio_render_stall_count", map);
            C1486300omS.LIZ(jLJIIJ6 / 1000, "new_audio_demux_stall_time", map);
            C1486300omS.LIZ(jLJIIJ6 % 1000, "new_audio_demux_stall_count", map);
            C1486300omS.LIZ(jLJIIJ5 / 1000, "new_audio_decode_stall_time", map);
            C1486300omS.LIZ(jLJIIJ5 % 1000, "new_audio_decode_stall_count", map);
        }
    }

    public final long LJZL(int i, long j) {
        if (i != 0) {
            if (i != 68) {
                if (i != 78) {
                    if (i != 108) {
                        if (i != 326) {
                            if (i != 98) {
                                if (i != 99) {
                                    if (i != 171) {
                                        if (i != 172) {
                                            switch (i) {
                                                case 151:
                                                    if (this.LIZLLL != null) {
                                                        return ((C1470430oMr) r1).LJI(1164, 0);
                                                    }
                                                    return j;
                                                case 152:
                                                    if (this.LIZLLL != null) {
                                                        return ((C1470430oMr) r1).LJI(1165, 0);
                                                    }
                                                    return j;
                                                case 153:
                                                    if (this.LIZLLL != null) {
                                                        return ((C1470430oMr) r1).LJI(1168, -1);
                                                    }
                                                    return j;
                                                case 154:
                                                    if (this.LIZLLL != null) {
                                                        return ((C1470430oMr) r1).LJI(1169, 0);
                                                    }
                                                    return j;
                                                default:
                                                    switch (i) {
                                                        case 161:
                                                            if (this.LIZLLL != null) {
                                                                return ((C1470430oMr) r1).LJI(40101, -1);
                                                            }
                                                            return j;
                                                        case 162:
                                                            if (this.LIZLLL != null) {
                                                                return ((C1470430oMr) r1).LJI(40102, -1);
                                                            }
                                                            return j;
                                                        case 163:
                                                            if (this.LIZLLL != null) {
                                                                return ((C1470430oMr) r1).LJI(40103, -1);
                                                            }
                                                            return j;
                                                        case 164:
                                                            if (this.LIZLLL != null) {
                                                                return ((C1470430oMr) r1).LJI(40104, -1);
                                                            }
                                                            return j;
                                                        case 165:
                                                            if (this.LIZLLL != null) {
                                                                return ((C1470430oMr) r1).LJI(40105, -1);
                                                            }
                                                            return j;
                                                        case 166:
                                                            if (this.LIZLLL != null) {
                                                                return ((C1470430oMr) r1).LJI(40106, -1);
                                                            }
                                                            return j;
                                                        default:
                                                            return j;
                                                    }
                                            }
                                        }
                                        if (this.LIZLLL != null) {
                                            return ((C1470430oMr) r1).LJI(40107, 0);
                                        }
                                        return j;
                                    }
                                    if (this.LIZLLL != null) {
                                        return ((C1470430oMr) r1).LJI(1191, 0);
                                    }
                                    return j;
                                }
                                if (this.LIZLLL != null) {
                                    return ((C1470430oMr) r1).LJI(157, -1);
                                }
                                return j;
                            }
                            if (this.LIZLLL != null) {
                                return ((C1470430oMr) r1).LJI(141, -1);
                            }
                            return j;
                        }
                        if (this.LIZLLL != null) {
                            return ((C1470430oMr) r1).LJI(437, 0);
                        }
                        return j;
                    }
                    InterfaceC1467950oIr interfaceC1467950oIr = this.LIZLLL;
                    if (interfaceC1467950oIr != null) {
                        if (!((C1470430oMr) interfaceC1467950oIr).LJIIZILJ()) {
                            return 0L;
                        }
                        return 1L;
                    }
                    return j;
                }
                if (this.LIZLLL != null) {
                    return ((C1470430oMr) r1).LJI(379, 0);
                }
                return j;
            }
            InterfaceC1467950oIr interfaceC1467950oIr2 = this.LIZLLL;
            if (interfaceC1467950oIr2 != null) {
                return (((C1470430oMr) interfaceC1467950oIr2).LJIIJ(63, 0L) * 8) / 1000;
            }
            return j;
        }
        InterfaceC1467950oIr interfaceC1467950oIr3 = this.LIZLLL;
        if (interfaceC1467950oIr3 != null) {
            return (((C1470430oMr) interfaceC1467950oIr3).LJIIJ(63, 0L) * 8) / 1000;
        }
        return j;
    }

    public final void LLFII(C1698490uIh c1698490uIh, int i) {
        LLFZ(c1698490uIh, i, false);
    }

    public final JSONObject LLILL(String str, String str2) {
        return this.LJJII.LJIILJJIL(str, str2);
    }

    public final void LLJJI(String str, String str2) {
        String strLIZIZ;
        JSONArray jSONArrayOptJSONArray;
        String strOptString;
        int i;
        if (this.LLJILJIL.equals("auto") && this.LJLZ && this.LJZI.equals("abr_bb_4live") && this.LJJII.LIZLLL == 2 && this.LLJJ.equals("flv")) {
            LiveLoggerService liveLoggerService = this.LJIILLIIL;
            liveLoggerService.P1 = true;
            liveLoggerService.J1 = this.LJJII.LJI();
            C1698510uIj c1698510uIj = this.LJJII;
            String str3 = this.t2;
            C1698500uIi c1698500uIi = c1698510uIj.LIZIZ;
            if (c1698500uIi != null) {
                c1698500uIi.LJ = str3;
                c1698500uIi.LJII = str;
                c1698500uIi.LJIIIIZZ = str2;
            }
            int i2 = p3;
            if (this.P == 1 && this.G && (i = q3) != -1) {
                i2 = i;
            }
            if (i2 != -1) {
                c1698510uIj.LJJIIJZLJL(i2);
            }
            String strLJIIJJI = this.LJJII.LJIIJJI(this.LLJILJIL, this.LLJJ, this.LLJILLL, this.LLJZIJLIL);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("mpd url:");
            sbLIZ.append(strLJIIJJI);
            C2188811AlT.LIZIZ(sbLIZ);
            C1698940uJQ.LIZJ();
            if (this.LJIILLIIL.m4 == 1 && this.W0 == 1) {
                try {
                    JSONObject jSONObject = new JSONObject(strLJIIJJI);
                    JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("adaptationSet");
                    if (jSONObjectOptJSONObject != null && (jSONArrayOptJSONArray = jSONObjectOptJSONObject.optJSONArray("representation")) != null) {
                        for (int i3 = 0; i3 < jSONArrayOptJSONArray.length(); i3++) {
                            JSONObject jSONObjectOptJSONObject2 = jSONArrayOptJSONArray.optJSONObject(i3);
                            if (jSONObjectOptJSONObject2 != null && (strOptString = jSONObjectOptJSONObject2.optString("url")) != null) {
                                String strOptString2 = jSONObjectOptJSONObject2.optString("sourceType");
                                if (C1474810oTv.LLFF() && !TextUtils.equals(strOptString2, this.LLJILLL)) {
                                    String strLLFF = LLFF(strOptString, C1286540jaG.LIZJ(strOptString), null);
                                    if (strLLFF != null) {
                                        jSONObjectOptJSONObject2.put("url", strLLFF);
                                    }
                                } else {
                                    String strLLFF2 = LLFF(strOptString, str2, str);
                                    if (strLLFF2 != null) {
                                        jSONObjectOptJSONObject2.put("url", strLLFF2);
                                    }
                                }
                            }
                        }
                    }
                    strLJIIJJI = C786410Ut5.J3(jSONObject);
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("mpd url:");
                    sbLIZ2.append(strLJIIJJI);
                    C2188811AlT.LIZIZ(sbLIZ2);
                    C1698940uJQ.LIZJ();
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    C1698940uJQ.LIZJ();
                }
            }
            if (strLJIIJJI == null) {
                strLIZIZ = this.r2;
            } else {
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("mem://llash/");
                sbLIZ3.append(strLJIIJJI);
                strLIZIZ = C2188811AlT.LIZIZ(sbLIZ3);
            }
            this.r2 = strLIZIZ;
            if (strLJIIJJI != null) {
                if (this.I == 1) {
                    ((C1470430oMr) this.LIZLLL).LIZ(1250, "llash");
                    ((C1470430oMr) this.LIZLLL).LIZ(315, "live");
                } else {
                    ((C1470430oMr) this.LIZLLL).LIZ(315, "llash");
                }
            }
            ((C1470430oMr) this.LIZLLL).LIZJ(324, 1);
            LJIIL();
            this.s = true;
            return;
        }
        if (this.LLJILJIL.equals("auto") && this.LJLZ && this.LJZI.equals("abr_bb_4live") && this.LJJII.LIZLLL == 2 && TextUtils.equals(this.LLJJ, "cmaf") && this.f444J == 1 && this.I == 1) {
            LiveLoggerService liveLoggerService2 = this.LJIILLIIL;
            liveLoggerService2.P1 = true;
            liveLoggerService2.J1 = this.LJJII.LJI();
            C1698510uIj c1698510uIj2 = this.LJJII;
            String str4 = this.t2;
            C1698500uIi c1698500uIi2 = c1698510uIj2.LIZIZ;
            if (c1698500uIi2 != null) {
                c1698500uIi2.LJ = str4;
                c1698500uIi2.LJII = str;
                c1698500uIi2.LJIIIIZZ = str2;
            }
            ((C1470430oMr) this.LIZLLL).LIZ(1250, "cmaf");
            ((C1470430oMr) this.LIZLLL).LIZ(315, "live");
            ((C1470430oMr) this.LIZLLL).LIZJ(324, 1);
            LJIIL();
            this.s = true;
            return;
        }
        this.s = false;
    }

    public final void LLJJIJI(int i, Exception exc) {
        HashMap map = new HashMap();
        map.put("url", this.r2);
        C1284740jXM c1284740jXM = new C1284740jXM(i, exc.getMessage(), map, false);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Prepare Exception");
        sbLIZ.append(this.P0);
        sbLIZ.append(", Code: ");
        sbLIZ.append(i);
        sbLIZ.append(" : ");
        sbLIZ.append(exc.getMessage());
        C2188811AlT.LIZIZ(sbLIZ);
        C1698940uJQ.LIZIZ();
        this.LJJ.LIZIZ(c1284740jXM, this.LJJJI);
    }

    public final void LLJLL(String str, boolean z) {
        String strLJI;
        C1698670uIz c1698670uIzLJLIIL;
        C1698670uIz c1698670uIzLJLIIL2;
        C1698940uJQ.LIZJ();
        if (!z && this.LLIIIJ.LJI == EnumC1699210uJr.IN_FEED) {
            String str2 = this.LLJILLL;
            String str3 = "backup";
            if (str2.equals("backup")) {
                str3 = "main";
            }
            C1698510uIj c1698510uIj = this.LJJII;
            if (this.LLJILJIL.equals("auto")) {
                strLJI = this.LJJII.LJI();
            } else {
                strLJI = this.LLJILJIL;
            }
            String strLJIIJJI = c1698510uIj.LJIIJJI(strLJI, "flv", str3, this.LLJZIJLIL);
            if (TextUtils.isEmpty(str)) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("onMainBackupSwitchAttempt fail - current url could not be retrieved - ");
                sbLIZ.append(str2);
                sbLIZ.append(" ");
                sbLIZ.append(str3);
                C2188811AlT.LIZIZ(sbLIZ);
                C1698940uJQ.LIZJ();
            }
            if (TextUtils.isEmpty(strLJIIJJI)) {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("onMainBackupSwitchAttempt fail - previous url could not be retrieved - ");
                sbLIZ2.append(str2);
                sbLIZ2.append(" ");
                sbLIZ2.append(str3);
                C2188811AlT.LIZIZ(sbLIZ2);
                C1698940uJQ.LIZJ();
            }
            C1698700uJ2 c1698700uJ2 = this.LLIIIJ;
            c1698700uJ2.LIZJ = str3;
            c1698700uJ2.LIZLLL = str2;
            c1698700uJ2.LIZ = strLJIIJJI;
            c1698700uJ2.LIZIZ = str;
            if (!TextUtils.isEmpty(strLJIIJJI)) {
                this.LLIIIJ.LJ = C1486300omS.LIZJ(strLJIIJJI);
            }
            if (!TextUtils.isEmpty(str)) {
                this.LLIIIJ.LJFF = C1486300omS.LIZJ(str);
            }
            if (!TextUtils.isEmpty(this.LLIIIJ.LJ)) {
                C1698700uJ2 c1698700uJ22 = this.LLIIIJ;
                if (TextUtils.equals(c1698700uJ22.LJ, c1698700uJ22.LJFF)) {
                    C1698940uJQ.LIZJ();
                    String str4 = this.LLIIIJ.LJIILIIL;
                    if (str4 != null && (c1698670uIzLJLIIL2 = LJLIIL(str4)) != null && c1698670uIzLJLIIL2.LJIIIZ == 0) {
                        c1698670uIzLJLIIL2.LJ = "ignore";
                        c1698670uIzLJLIIL2.LJIIJJI = "no_effective_switch";
                    }
                    C1698700uJ2 c1698700uJ23 = this.LLIIIJ;
                    c1698700uJ23.LJIIIIZZ = false;
                    c1698700uJ23.LIZ();
                    return;
                }
            }
            String str5 = this.LLIIIJ.LJIILIIL;
            if (str5 != null && (c1698670uIzLJLIIL = LJLIIL(str5)) != null && c1698670uIzLJLIIL.LJIIIIZZ == 0) {
                c1698670uIzLJLIIL.LJIIIIZZ = System.currentTimeMillis();
            }
        }
        C1698700uJ2 c1698700uJ24 = this.LLIIIJ;
        if (c1698700uJ24.LJIIIIZZ) {
            c1698700uJ24.LJIIIIZZ = false;
        }
        LiveLoggerService liveLoggerService = this.LJIILLIIL;
        if (liveLoggerService != null) {
            try {
                JSONObject jSONObjectLJIIJJI = liveLoggerService.LJIIJJI("main_backup_switch_attempt");
                jSONObjectLJIIJJI.put("event_key", "main_backup_switch_attempt");
                LiveLoggerService.LJJLIIIJLLLLLLLZ(jSONObjectLJIIJJI, c1698700uJ24);
                liveLoggerService.LJJJJIZL(jSONObjectLJIIJJI);
                return;
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("onMainBackupSwitchAttempt exception - ");
                sbLIZ3.append(e.toString());
                C2188811AlT.LIZIZ(sbLIZ3);
                C1698940uJQ.LIZJ();
                return;
            }
        }
        C1698940uJQ.LIZJ();
    }

    public final void LLJLLIL(int i, long j) {
        C1698670uIz c1698670uIzLJLIIL;
        C1698940uJQ.LIZJ();
        if (i == 0) {
            this.LLIIIJ.LJIIL.put("switch_stopped", Boolean.TRUE);
        } else {
            this.LLIIIJ.LJIIL.put("switch_player_error_code", Integer.valueOf(i));
            this.LLIIIJ.LJIIL.put("switch_player_error_time", Long.valueOf(j));
        }
        LiveLoggerService liveLoggerService = this.LJIILLIIL;
        if (liveLoggerService != null) {
            C1698700uJ2 c1698700uJ2 = this.LLIIIJ;
            try {
                liveLoggerService.c7.LIZ(c1698700uJ2.LJI, c1698700uJ2.LJIIJJI);
                JSONObject jSONObjectLJIIJJI = liveLoggerService.LJIIJJI("main_backup_switch_fail");
                if (jSONObjectLJIIJJI != null) {
                    jSONObjectLJIIJJI.put("event_key", "main_backup_switch_fail");
                    LiveLoggerService.LJJLIIIJLLLLLLLZ(jSONObjectLJIIJJI, c1698700uJ2);
                    liveLoggerService.LJJJJIZL(jSONObjectLJIIJJI);
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("onMainBackupSwitchFail exception - ");
                sbLIZ.append(e.toString());
                C2188811AlT.LIZIZ(sbLIZ);
                C1698940uJQ.LIZJ();
            }
        } else {
            C1698940uJQ.LIZJ();
        }
        String str = this.LLIIIJ.LJIILIIL;
        if (str != null && (c1698670uIzLJLIIL = LJLIIL(str)) != null) {
            c1698670uIzLJLIIL.LJ = "fail";
            c1698670uIzLJLIIL.LJIIJ = System.currentTimeMillis();
            c1698670uIzLJLIIL.LJFF = i;
        }
        this.LLIIIJ.LIZ();
    }

    public final void LLJZ(int i, String str) {
        int i2;
        if (!TextUtils.isEmpty(str) && this.a != 0 && this.LJIJJ != null) {
            int length = str.length();
            if (length <= 4096) {
                InterfaceC1698710uJ3 interfaceC1698710uJ3 = this.LJIJJ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(LLIILZL());
                sbLIZ.append(" ");
                sbLIZ.append(str);
                interfaceC1698710uJ3.LJJJJJ(C2188811AlT.LIZIZ(sbLIZ));
                return;
            }
            int i3 = 0;
            do {
                i2 = i3 + SpeechEngineDefines.TTS_WORK_MODE_BOTH;
                String strSubstring = str.substring(i3, Math.min(i2, length));
                InterfaceC1698710uJ3 interfaceC1698710uJ32 = this.LJIJJ;
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append(LLIILZL());
                sbLIZ2.append(" ");
                sbLIZ2.append(strSubstring);
                interfaceC1698710uJ32.LJJJJJ(C2188811AlT.LIZIZ(sbLIZ2));
                i3 = i2;
            } while (i2 < length);
        }
    }

    public final String LLLFZ(JSONObject jSONObject, boolean z) {
        JSONObject jSONObjectOptJSONObject;
        int iOptInt;
        JSONObject jSONObjectLIZIZ;
        JSONObject jSONObjectOptJSONObject2;
        String strOptString;
        int i;
        int iOptInt2;
        String strOptString2;
        String strLJIIIIZZ = "";
        int i2 = 1;
        if (this.L1 == 1 && this.LLZZ == 1) {
            if (z) {
                this.LJIILLIIL.q5++;
                this.Q1 = true;
            }
            if (jSONObject != null) {
                if (jSONObject.has("startup_probe_bitrate")) {
                    iOptInt = jSONObject.optInt("startup_probe_bitrate");
                    this.N1 = iOptInt;
                } else {
                    iOptInt = 0;
                }
                this.LJIILLIIL.LLILLL.LLLLZLLLI = jSONObject.optLong("startupStrategyStartTs");
                this.LJIILLIIL.LLILLL.LLLZ = jSONObject.optLong("startupStrategyEndTs");
                jSONObjectOptJSONObject = jSONObject.optJSONObject("strategy_log");
                strLJIIIIZZ = jSONObject.optString("probe_res");
                if (jSONObjectOptJSONObject != null) {
                    try {
                        jSONObjectOptJSONObject.put("from_cache", jSONObject.optInt("from_cache", -1));
                    } catch (JSONException e) {
                        TryCatchGuardChecker.doCheck(e);
                    }
                }
                JSONObject jSONObjectOptJSONObject3 = jSONObject.optJSONObject("SmartStartupStrategyResult");
                if (jSONObjectOptJSONObject3 != null) {
                    if (jSONObjectOptJSONObject == null) {
                        try {
                            jSONObjectOptJSONObject = new JSONObject();
                        } catch (JSONException e2) {
                            TryCatchGuardChecker.doCheck(e2);
                        }
                    }
                    jSONObjectOptJSONObject.put("SmartStartupStrategyResult", jSONObjectOptJSONObject3);
                    if (Boolean.valueOf(jSONObjectOptJSONObject3.optBoolean("should_use_smart_startup")).booleanValue()) {
                        strLJIIIIZZ = jSONObjectOptJSONObject3.optString("gearResult");
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("use SmartStartup Gear: ");
                        sbLIZ.append(strLJIIIIZZ);
                        C2188811AlT.LIZIZ(sbLIZ);
                        C1698940uJQ.LIZJ();
                    }
                }
                LiveLoggerService liveLoggerService = this.LJIILLIIL;
                if (jSONObject.has("fall_back_local")) {
                    iOptInt2 = jSONObject.optInt("fall_back_local");
                } else {
                    iOptInt2 = this.LJIILLIIL.j2;
                }
                liveLoggerService.j2 = iOptInt2;
                LiveLoggerService liveLoggerService2 = this.LJIILLIIL;
                if (jSONObject.has("pty_error_summary")) {
                    strOptString2 = jSONObject.optString("pty_error_summary");
                } else {
                    strOptString2 = this.LJIILLIIL.i2;
                }
                liveLoggerService2.i2 = strOptString2;
            } else {
                jSONObjectOptJSONObject = null;
                iOptInt = 0;
            }
            if (TextUtils.isEmpty(strLJIIIIZZ) && iOptInt > 0) {
                strLJIIIIZZ = this.LJJII.LJIIIIZZ(iOptInt, this.LLJILLL);
            }
            long j = -1;
            if (TextUtils.isEmpty(strLJIIIIZZ)) {
                this.O1 = "none";
            } else {
                if (z) {
                    long j2 = iOptInt;
                    long j3 = this.P1;
                    if (j2 == j3) {
                        this.LJIILLIIL.r5 = EnumC1486320omU.STARTUP_RETRY_EQUAL.ordinal();
                    } else if (j2 > j3) {
                        this.LJIILLIIL.r5 = EnumC1486320omU.STARTUP_RETRY_HIGHER.ordinal();
                    } else {
                        this.LJIILLIIL.r5 = EnumC1486320omU.STARTUP_RETRY_LOWER.ordinal();
                    }
                    if (!TextUtils.equals(strLJIIIIZZ, this.O1)) {
                        this.Q1 = false;
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("[StartupRetry] res is diff, now res:");
                        sbLIZ2.append(strLJIIIIZZ);
                        sbLIZ2.append(", before res:");
                        sbLIZ2.append(this.O1);
                        C2188811AlT.LIZIZ(sbLIZ2);
                        C1698940uJQ.LIZJ();
                    }
                }
                this.O1 = strLJIIIIZZ;
                if (this.P1 == -1) {
                    this.P1 = iOptInt;
                }
            }
            LiveLoggerService liveLoggerService3 = this.LJIILLIIL;
            long j4 = iOptInt;
            liveLoggerService3.getClass();
            if (jSONObjectOptJSONObject != null && jSONObjectOptJSONObject.length() > 0) {
                String strJ3 = C786410Ut5.J3(jSONObjectOptJSONObject);
                liveLoggerService3.d2 = strJ3;
                if (TextUtils.isEmpty(strJ3)) {
                    liveLoggerService3.d2 = "none";
                }
                if (jSONObjectOptJSONObject.has("startup_exec_type")) {
                    liveLoggerService3.b2 = jSONObjectOptJSONObject.optInt("startup_exec_type");
                }
                if (jSONObjectOptJSONObject.has("max_bitrate")) {
                    if (jSONObjectOptJSONObject.optLong("max_bitrate") == j4) {
                        i = 1;
                    } else {
                        i = 0;
                    }
                    liveLoggerService3.c2 = i;
                }
                if (jSONObjectOptJSONObject.has("startup_estimator_bandwidth")) {
                    liveLoggerService3.f2 = jSONObjectOptJSONObject.optInt("startup_estimator_bandwidth");
                }
                if (jSONObjectOptJSONObject.has("startup_estimator_source_type")) {
                    liveLoggerService3.g2 = jSONObjectOptJSONObject.optInt("startup_estimator_source_type");
                }
                if (jSONObjectOptJSONObject.has("real_bitrate_list") && (jSONObjectOptJSONObject2 = jSONObjectOptJSONObject.optJSONObject("real_bitrate_list")) != null) {
                    ArrayList<String> arrayList = new ArrayList<>();
                    if (jSONObjectOptJSONObject2.length() > 0) {
                        Iterator<String> itKeys = jSONObjectOptJSONObject2.keys();
                        while (itKeys.hasNext()) {
                            String next = itKeys.next();
                            JSONObject jSONObjectOptJSONObject4 = jSONObjectOptJSONObject2.optJSONObject(next);
                            if (jSONObjectOptJSONObject4 != null && jSONObjectOptJSONObject4.has("reference_bitrate")) {
                                strOptString = jSONObjectOptJSONObject4.optString("reference_bitrate");
                            } else {
                                strOptString = jSONObjectOptJSONObject2.optString(next);
                            }
                            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                            sbLIZ3.append(next);
                            sbLIZ3.append(":");
                            sbLIZ3.append(strOptString);
                            arrayList.add(C2188811AlT.LIZIZ(sbLIZ3));
                        }
                    }
                    liveLoggerService3.e2 = arrayList;
                }
                if (jSONObjectOptJSONObject.has("version")) {
                    liveLoggerService3.h2 = jSONObjectOptJSONObject.optString("version");
                }
            }
            ArrayList<String> arrayList2 = this.LJIILLIIL.e2;
            if ((arrayList2 == null || arrayList2.size() == 0) && (jSONObjectLIZIZ = this.LJJII.LIZIZ(21, this.LLJILLL, true)) != null) {
                this.LJIILLIIL.e2 = new ArrayList<>();
                LiveLoggerService.LJIIJ(this.LJIILLIIL.e2, jSONObjectLIZIZ);
            }
            if (this.LJIILLIIL.c2 < 0) {
                C1698510uIj c1698510uIj = this.LJJII;
                if (c1698510uIj.LJJII()) {
                    j = c1698510uIj.LIZIZ.LJJI;
                }
                LiveLoggerService liveLoggerService4 = this.LJIILLIIL;
                if (j != j4) {
                    i2 = 0;
                }
                liveLoggerService4.c2 = i2;
            }
            C1698940uJQ.LIZJ();
        }
        return strLJIIIIZZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:110:0x028f  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0294 A[Catch: JSONException -> 0x04d0, TRY_ENTER, TryCatch #13 {JSONException -> 0x04d0, blocks: (B:44:0x011c, B:45:0x013e, B:47:0x0148, B:48:0x0154, B:50:0x015c, B:52:0x0166, B:54:0x016e, B:62:0x01a3, B:55:0x0172, B:57:0x017a, B:58:0x0187, B:60:0x018f, B:61:0x019c, B:65:0x01ac, B:73:0x01e1, B:76:0x01eb, B:86:0x021e, B:88:0x0228, B:89:0x0234, B:91:0x023c, B:93:0x0244, B:95:0x024e, B:97:0x0258, B:117:0x02c0, B:124:0x02df, B:111:0x0294, B:113:0x02a2, B:114:0x02b1, B:116:0x02b9, B:98:0x025f, B:100:0x0267, B:102:0x026f, B:104:0x0275, B:106:0x027d, B:77:0x01f6, B:79:0x01fe, B:81:0x0206, B:83:0x020c, B:85:0x0214, B:67:0x01b4, B:69:0x01bc, B:72:0x01cb, B:70:0x01c3), top: B:314:0x011c }] */
    /* JADX WARN: Removed duplicated region for block: B:145:0x032d  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x033b A[Catch: JSONException -> 0x04ce, TryCatch #10 {JSONException -> 0x04ce, blocks: (B:208:0x047a, B:210:0x0484, B:212:0x048e, B:213:0x0499, B:215:0x04a3, B:146:0x0333, B:148:0x033b, B:149:0x034a, B:157:0x036d, B:159:0x0376, B:160:0x037d, B:161:0x038a, B:173:0x03bb, B:196:0x0435, B:199:0x043d, B:202:0x0448, B:205:0x0453, B:207:0x0464, B:216:0x04af, B:178:0x03cc, B:182:0x03d6, B:186:0x03e1, B:188:0x03f2, B:189:0x040a), top: B:308:0x0333 }] */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0362  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0363  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0376 A[Catch: JSONException -> 0x04ce, TryCatch #10 {JSONException -> 0x04ce, blocks: (B:208:0x047a, B:210:0x0484, B:212:0x048e, B:213:0x0499, B:215:0x04a3, B:146:0x0333, B:148:0x033b, B:149:0x034a, B:157:0x036d, B:159:0x0376, B:160:0x037d, B:161:0x038a, B:173:0x03bb, B:196:0x0435, B:199:0x043d, B:202:0x0448, B:205:0x0453, B:207:0x0464, B:216:0x04af, B:178:0x03cc, B:182:0x03d6, B:186:0x03e1, B:188:0x03f2, B:189:0x040a), top: B:308:0x0333 }] */
    /* JADX WARN: Removed duplicated region for block: B:163:0x03a7  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x03cc A[Catch: JSONException -> 0x04ce, TRY_ENTER, TryCatch #10 {JSONException -> 0x04ce, blocks: (B:208:0x047a, B:210:0x0484, B:212:0x048e, B:213:0x0499, B:215:0x04a3, B:146:0x0333, B:148:0x033b, B:149:0x034a, B:157:0x036d, B:159:0x0376, B:160:0x037d, B:161:0x038a, B:173:0x03bb, B:196:0x0435, B:199:0x043d, B:202:0x0448, B:205:0x0453, B:207:0x0464, B:216:0x04af, B:178:0x03cc, B:182:0x03d6, B:186:0x03e1, B:188:0x03f2, B:189:0x040a), top: B:308:0x0333 }] */
    /* JADX WARN: Removed duplicated region for block: B:180:0x03d2  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x03d4  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x03dd  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x03df  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x03f2 A[Catch: JSONException -> 0x04ce, TryCatch #10 {JSONException -> 0x04ce, blocks: (B:208:0x047a, B:210:0x0484, B:212:0x048e, B:213:0x0499, B:215:0x04a3, B:146:0x0333, B:148:0x033b, B:149:0x034a, B:157:0x036d, B:159:0x0376, B:160:0x037d, B:161:0x038a, B:173:0x03bb, B:196:0x0435, B:199:0x043d, B:202:0x0448, B:205:0x0453, B:207:0x0464, B:216:0x04af, B:178:0x03cc, B:182:0x03d6, B:186:0x03e1, B:188:0x03f2, B:189:0x040a), top: B:308:0x0333 }] */
    /* JADX WARN: Removed duplicated region for block: B:189:0x040a A[Catch: JSONException -> 0x04ce, TryCatch #10 {JSONException -> 0x04ce, blocks: (B:208:0x047a, B:210:0x0484, B:212:0x048e, B:213:0x0499, B:215:0x04a3, B:146:0x0333, B:148:0x033b, B:149:0x034a, B:157:0x036d, B:159:0x0376, B:160:0x037d, B:161:0x038a, B:173:0x03bb, B:196:0x0435, B:199:0x043d, B:202:0x0448, B:205:0x0453, B:207:0x0464, B:216:0x04af, B:178:0x03cc, B:182:0x03d6, B:186:0x03e1, B:188:0x03f2, B:189:0x040a), top: B:308:0x0333 }] */
    /* JADX WARN: Removed duplicated region for block: B:196:0x0435 A[Catch: JSONException -> 0x04ce, TryCatch #10 {JSONException -> 0x04ce, blocks: (B:208:0x047a, B:210:0x0484, B:212:0x048e, B:213:0x0499, B:215:0x04a3, B:146:0x0333, B:148:0x033b, B:149:0x034a, B:157:0x036d, B:159:0x0376, B:160:0x037d, B:161:0x038a, B:173:0x03bb, B:196:0x0435, B:199:0x043d, B:202:0x0448, B:205:0x0453, B:207:0x0464, B:216:0x04af, B:178:0x03cc, B:182:0x03d6, B:186:0x03e1, B:188:0x03f2, B:189:0x040a), top: B:308:0x0333 }] */
    /* JADX WARN: Removed duplicated region for block: B:198:0x043b  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x0446  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x0451  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x0464 A[Catch: JSONException -> 0x04ce, TryCatch #10 {JSONException -> 0x04ce, blocks: (B:208:0x047a, B:210:0x0484, B:212:0x048e, B:213:0x0499, B:215:0x04a3, B:146:0x0333, B:148:0x033b, B:149:0x034a, B:157:0x036d, B:159:0x0376, B:160:0x037d, B:161:0x038a, B:173:0x03bb, B:196:0x0435, B:199:0x043d, B:202:0x0448, B:205:0x0453, B:207:0x0464, B:216:0x04af, B:178:0x03cc, B:182:0x03d6, B:186:0x03e1, B:188:0x03f2, B:189:0x040a), top: B:308:0x0333 }] */
    /* JADX WARN: Removed duplicated region for block: B:210:0x0484 A[Catch: JSONException -> 0x04ce, TryCatch #10 {JSONException -> 0x04ce, blocks: (B:208:0x047a, B:210:0x0484, B:212:0x048e, B:213:0x0499, B:215:0x04a3, B:146:0x0333, B:148:0x033b, B:149:0x034a, B:157:0x036d, B:159:0x0376, B:160:0x037d, B:161:0x038a, B:173:0x03bb, B:196:0x0435, B:199:0x043d, B:202:0x0448, B:205:0x0453, B:207:0x0464, B:216:0x04af, B:178:0x03cc, B:182:0x03d6, B:186:0x03e1, B:188:0x03f2, B:189:0x040a), top: B:308:0x0333 }] */
    /* JADX WARN: Removed duplicated region for block: B:215:0x04a3 A[Catch: JSONException -> 0x04ce, TryCatch #10 {JSONException -> 0x04ce, blocks: (B:208:0x047a, B:210:0x0484, B:212:0x048e, B:213:0x0499, B:215:0x04a3, B:146:0x0333, B:148:0x033b, B:149:0x034a, B:157:0x036d, B:159:0x0376, B:160:0x037d, B:161:0x038a, B:173:0x03bb, B:196:0x0435, B:199:0x043d, B:202:0x0448, B:205:0x0453, B:207:0x0464, B:216:0x04af, B:178:0x03cc, B:182:0x03d6, B:186:0x03e1, B:188:0x03f2, B:189:0x040a), top: B:308:0x0333 }] */
    /* JADX WARN: Removed duplicated region for block: B:216:0x04af A[Catch: JSONException -> 0x04ce, TRY_LEAVE, TryCatch #10 {JSONException -> 0x04ce, blocks: (B:208:0x047a, B:210:0x0484, B:212:0x048e, B:213:0x0499, B:215:0x04a3, B:146:0x0333, B:148:0x033b, B:149:0x034a, B:157:0x036d, B:159:0x0376, B:160:0x037d, B:161:0x038a, B:173:0x03bb, B:196:0x0435, B:199:0x043d, B:202:0x0448, B:205:0x0453, B:207:0x0464, B:216:0x04af, B:178:0x03cc, B:182:0x03d6, B:186:0x03e1, B:188:0x03f2, B:189:0x040a), top: B:308:0x0333 }] */
    /* JADX WARN: Removed duplicated region for block: B:227:0x0504  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x0513  */
    /* JADX WARN: Removed duplicated region for block: B:286:0x0623  */
    /* JADX WARN: Removed duplicated region for block: B:306:0x02d1 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0148 A[Catch: JSONException -> 0x04d0, TryCatch #13 {JSONException -> 0x04d0, blocks: (B:44:0x011c, B:45:0x013e, B:47:0x0148, B:48:0x0154, B:50:0x015c, B:52:0x0166, B:54:0x016e, B:62:0x01a3, B:55:0x0172, B:57:0x017a, B:58:0x0187, B:60:0x018f, B:61:0x019c, B:65:0x01ac, B:73:0x01e1, B:76:0x01eb, B:86:0x021e, B:88:0x0228, B:89:0x0234, B:91:0x023c, B:93:0x0244, B:95:0x024e, B:97:0x0258, B:117:0x02c0, B:124:0x02df, B:111:0x0294, B:113:0x02a2, B:114:0x02b1, B:116:0x02b9, B:98:0x025f, B:100:0x0267, B:102:0x026f, B:104:0x0275, B:106:0x027d, B:77:0x01f6, B:79:0x01fe, B:81:0x0206, B:83:0x020c, B:85:0x0214, B:67:0x01b4, B:69:0x01bc, B:72:0x01cb, B:70:0x01c3), top: B:314:0x011c }] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x015c A[Catch: JSONException -> 0x04d0, TryCatch #13 {JSONException -> 0x04d0, blocks: (B:44:0x011c, B:45:0x013e, B:47:0x0148, B:48:0x0154, B:50:0x015c, B:52:0x0166, B:54:0x016e, B:62:0x01a3, B:55:0x0172, B:57:0x017a, B:58:0x0187, B:60:0x018f, B:61:0x019c, B:65:0x01ac, B:73:0x01e1, B:76:0x01eb, B:86:0x021e, B:88:0x0228, B:89:0x0234, B:91:0x023c, B:93:0x0244, B:95:0x024e, B:97:0x0258, B:117:0x02c0, B:124:0x02df, B:111:0x0294, B:113:0x02a2, B:114:0x02b1, B:116:0x02b9, B:98:0x025f, B:100:0x0267, B:102:0x026f, B:104:0x0275, B:106:0x027d, B:77:0x01f6, B:79:0x01fe, B:81:0x0206, B:83:0x020c, B:85:0x0214, B:67:0x01b4, B:69:0x01bc, B:72:0x01cb, B:70:0x01c3), top: B:314:0x011c }] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x016e A[Catch: JSONException -> 0x04d0, TryCatch #13 {JSONException -> 0x04d0, blocks: (B:44:0x011c, B:45:0x013e, B:47:0x0148, B:48:0x0154, B:50:0x015c, B:52:0x0166, B:54:0x016e, B:62:0x01a3, B:55:0x0172, B:57:0x017a, B:58:0x0187, B:60:0x018f, B:61:0x019c, B:65:0x01ac, B:73:0x01e1, B:76:0x01eb, B:86:0x021e, B:88:0x0228, B:89:0x0234, B:91:0x023c, B:93:0x0244, B:95:0x024e, B:97:0x0258, B:117:0x02c0, B:124:0x02df, B:111:0x0294, B:113:0x02a2, B:114:0x02b1, B:116:0x02b9, B:98:0x025f, B:100:0x0267, B:102:0x026f, B:104:0x0275, B:106:0x027d, B:77:0x01f6, B:79:0x01fe, B:81:0x0206, B:83:0x020c, B:85:0x0214, B:67:0x01b4, B:69:0x01bc, B:72:0x01cb, B:70:0x01c3), top: B:314:0x011c }] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x017a A[Catch: JSONException -> 0x04d0, TryCatch #13 {JSONException -> 0x04d0, blocks: (B:44:0x011c, B:45:0x013e, B:47:0x0148, B:48:0x0154, B:50:0x015c, B:52:0x0166, B:54:0x016e, B:62:0x01a3, B:55:0x0172, B:57:0x017a, B:58:0x0187, B:60:0x018f, B:61:0x019c, B:65:0x01ac, B:73:0x01e1, B:76:0x01eb, B:86:0x021e, B:88:0x0228, B:89:0x0234, B:91:0x023c, B:93:0x0244, B:95:0x024e, B:97:0x0258, B:117:0x02c0, B:124:0x02df, B:111:0x0294, B:113:0x02a2, B:114:0x02b1, B:116:0x02b9, B:98:0x025f, B:100:0x0267, B:102:0x026f, B:104:0x0275, B:106:0x027d, B:77:0x01f6, B:79:0x01fe, B:81:0x0206, B:83:0x020c, B:85:0x0214, B:67:0x01b4, B:69:0x01bc, B:72:0x01cb, B:70:0x01c3), top: B:314:0x011c }] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x018f A[Catch: JSONException -> 0x04d0, TryCatch #13 {JSONException -> 0x04d0, blocks: (B:44:0x011c, B:45:0x013e, B:47:0x0148, B:48:0x0154, B:50:0x015c, B:52:0x0166, B:54:0x016e, B:62:0x01a3, B:55:0x0172, B:57:0x017a, B:58:0x0187, B:60:0x018f, B:61:0x019c, B:65:0x01ac, B:73:0x01e1, B:76:0x01eb, B:86:0x021e, B:88:0x0228, B:89:0x0234, B:91:0x023c, B:93:0x0244, B:95:0x024e, B:97:0x0258, B:117:0x02c0, B:124:0x02df, B:111:0x0294, B:113:0x02a2, B:114:0x02b1, B:116:0x02b9, B:98:0x025f, B:100:0x0267, B:102:0x026f, B:104:0x0275, B:106:0x027d, B:77:0x01f6, B:79:0x01fe, B:81:0x0206, B:83:0x020c, B:85:0x0214, B:67:0x01b4, B:69:0x01bc, B:72:0x01cb, B:70:0x01c3), top: B:314:0x011c }] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01a3 A[Catch: JSONException -> 0x04d0, TRY_LEAVE, TryCatch #13 {JSONException -> 0x04d0, blocks: (B:44:0x011c, B:45:0x013e, B:47:0x0148, B:48:0x0154, B:50:0x015c, B:52:0x0166, B:54:0x016e, B:62:0x01a3, B:55:0x0172, B:57:0x017a, B:58:0x0187, B:60:0x018f, B:61:0x019c, B:65:0x01ac, B:73:0x01e1, B:76:0x01eb, B:86:0x021e, B:88:0x0228, B:89:0x0234, B:91:0x023c, B:93:0x0244, B:95:0x024e, B:97:0x0258, B:117:0x02c0, B:124:0x02df, B:111:0x0294, B:113:0x02a2, B:114:0x02b1, B:116:0x02b9, B:98:0x025f, B:100:0x0267, B:102:0x026f, B:104:0x0275, B:106:0x027d, B:77:0x01f6, B:79:0x01fe, B:81:0x0206, B:83:0x020c, B:85:0x0214, B:67:0x01b4, B:69:0x01bc, B:72:0x01cb, B:70:0x01c3), top: B:314:0x011c }] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01ac A[Catch: JSONException -> 0x04d0, TRY_ENTER, TryCatch #13 {JSONException -> 0x04d0, blocks: (B:44:0x011c, B:45:0x013e, B:47:0x0148, B:48:0x0154, B:50:0x015c, B:52:0x0166, B:54:0x016e, B:62:0x01a3, B:55:0x0172, B:57:0x017a, B:58:0x0187, B:60:0x018f, B:61:0x019c, B:65:0x01ac, B:73:0x01e1, B:76:0x01eb, B:86:0x021e, B:88:0x0228, B:89:0x0234, B:91:0x023c, B:93:0x0244, B:95:0x024e, B:97:0x0258, B:117:0x02c0, B:124:0x02df, B:111:0x0294, B:113:0x02a2, B:114:0x02b1, B:116:0x02b9, B:98:0x025f, B:100:0x0267, B:102:0x026f, B:104:0x0275, B:106:0x027d, B:77:0x01f6, B:79:0x01fe, B:81:0x0206, B:83:0x020c, B:85:0x0214, B:67:0x01b4, B:69:0x01bc, B:72:0x01cb, B:70:0x01c3), top: B:314:0x011c }] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01b4 A[Catch: JSONException -> 0x04d0, TryCatch #13 {JSONException -> 0x04d0, blocks: (B:44:0x011c, B:45:0x013e, B:47:0x0148, B:48:0x0154, B:50:0x015c, B:52:0x0166, B:54:0x016e, B:62:0x01a3, B:55:0x0172, B:57:0x017a, B:58:0x0187, B:60:0x018f, B:61:0x019c, B:65:0x01ac, B:73:0x01e1, B:76:0x01eb, B:86:0x021e, B:88:0x0228, B:89:0x0234, B:91:0x023c, B:93:0x0244, B:95:0x024e, B:97:0x0258, B:117:0x02c0, B:124:0x02df, B:111:0x0294, B:113:0x02a2, B:114:0x02b1, B:116:0x02b9, B:98:0x025f, B:100:0x0267, B:102:0x026f, B:104:0x0275, B:106:0x027d, B:77:0x01f6, B:79:0x01fe, B:81:0x0206, B:83:0x020c, B:85:0x0214, B:67:0x01b4, B:69:0x01bc, B:72:0x01cb, B:70:0x01c3), top: B:314:0x011c }] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01bc A[Catch: JSONException -> 0x04d0, TryCatch #13 {JSONException -> 0x04d0, blocks: (B:44:0x011c, B:45:0x013e, B:47:0x0148, B:48:0x0154, B:50:0x015c, B:52:0x0166, B:54:0x016e, B:62:0x01a3, B:55:0x0172, B:57:0x017a, B:58:0x0187, B:60:0x018f, B:61:0x019c, B:65:0x01ac, B:73:0x01e1, B:76:0x01eb, B:86:0x021e, B:88:0x0228, B:89:0x0234, B:91:0x023c, B:93:0x0244, B:95:0x024e, B:97:0x0258, B:117:0x02c0, B:124:0x02df, B:111:0x0294, B:113:0x02a2, B:114:0x02b1, B:116:0x02b9, B:98:0x025f, B:100:0x0267, B:102:0x026f, B:104:0x0275, B:106:0x027d, B:77:0x01f6, B:79:0x01fe, B:81:0x0206, B:83:0x020c, B:85:0x0214, B:67:0x01b4, B:69:0x01bc, B:72:0x01cb, B:70:0x01c3), top: B:314:0x011c }] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01c3 A[Catch: JSONException -> 0x04d0, TryCatch #13 {JSONException -> 0x04d0, blocks: (B:44:0x011c, B:45:0x013e, B:47:0x0148, B:48:0x0154, B:50:0x015c, B:52:0x0166, B:54:0x016e, B:62:0x01a3, B:55:0x0172, B:57:0x017a, B:58:0x0187, B:60:0x018f, B:61:0x019c, B:65:0x01ac, B:73:0x01e1, B:76:0x01eb, B:86:0x021e, B:88:0x0228, B:89:0x0234, B:91:0x023c, B:93:0x0244, B:95:0x024e, B:97:0x0258, B:117:0x02c0, B:124:0x02df, B:111:0x0294, B:113:0x02a2, B:114:0x02b1, B:116:0x02b9, B:98:0x025f, B:100:0x0267, B:102:0x026f, B:104:0x0275, B:106:0x027d, B:77:0x01f6, B:79:0x01fe, B:81:0x0206, B:83:0x020c, B:85:0x0214, B:67:0x01b4, B:69:0x01bc, B:72:0x01cb, B:70:0x01c3), top: B:314:0x011c }] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01cb A[Catch: JSONException -> 0x04d0, TryCatch #13 {JSONException -> 0x04d0, blocks: (B:44:0x011c, B:45:0x013e, B:47:0x0148, B:48:0x0154, B:50:0x015c, B:52:0x0166, B:54:0x016e, B:62:0x01a3, B:55:0x0172, B:57:0x017a, B:58:0x0187, B:60:0x018f, B:61:0x019c, B:65:0x01ac, B:73:0x01e1, B:76:0x01eb, B:86:0x021e, B:88:0x0228, B:89:0x0234, B:91:0x023c, B:93:0x0244, B:95:0x024e, B:97:0x0258, B:117:0x02c0, B:124:0x02df, B:111:0x0294, B:113:0x02a2, B:114:0x02b1, B:116:0x02b9, B:98:0x025f, B:100:0x0267, B:102:0x026f, B:104:0x0275, B:106:0x027d, B:77:0x01f6, B:79:0x01fe, B:81:0x0206, B:83:0x020c, B:85:0x0214, B:67:0x01b4, B:69:0x01bc, B:72:0x01cb, B:70:0x01c3), top: B:314:0x011c }] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01eb A[Catch: JSONException -> 0x04d0, TRY_ENTER, TryCatch #13 {JSONException -> 0x04d0, blocks: (B:44:0x011c, B:45:0x013e, B:47:0x0148, B:48:0x0154, B:50:0x015c, B:52:0x0166, B:54:0x016e, B:62:0x01a3, B:55:0x0172, B:57:0x017a, B:58:0x0187, B:60:0x018f, B:61:0x019c, B:65:0x01ac, B:73:0x01e1, B:76:0x01eb, B:86:0x021e, B:88:0x0228, B:89:0x0234, B:91:0x023c, B:93:0x0244, B:95:0x024e, B:97:0x0258, B:117:0x02c0, B:124:0x02df, B:111:0x0294, B:113:0x02a2, B:114:0x02b1, B:116:0x02b9, B:98:0x025f, B:100:0x0267, B:102:0x026f, B:104:0x0275, B:106:0x027d, B:77:0x01f6, B:79:0x01fe, B:81:0x0206, B:83:0x020c, B:85:0x0214, B:67:0x01b4, B:69:0x01bc, B:72:0x01cb, B:70:0x01c3), top: B:314:0x011c }] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01f6 A[Catch: JSONException -> 0x04d0, TryCatch #13 {JSONException -> 0x04d0, blocks: (B:44:0x011c, B:45:0x013e, B:47:0x0148, B:48:0x0154, B:50:0x015c, B:52:0x0166, B:54:0x016e, B:62:0x01a3, B:55:0x0172, B:57:0x017a, B:58:0x0187, B:60:0x018f, B:61:0x019c, B:65:0x01ac, B:73:0x01e1, B:76:0x01eb, B:86:0x021e, B:88:0x0228, B:89:0x0234, B:91:0x023c, B:93:0x0244, B:95:0x024e, B:97:0x0258, B:117:0x02c0, B:124:0x02df, B:111:0x0294, B:113:0x02a2, B:114:0x02b1, B:116:0x02b9, B:98:0x025f, B:100:0x0267, B:102:0x026f, B:104:0x0275, B:106:0x027d, B:77:0x01f6, B:79:0x01fe, B:81:0x0206, B:83:0x020c, B:85:0x0214, B:67:0x01b4, B:69:0x01bc, B:72:0x01cb, B:70:0x01c3), top: B:314:0x011c }] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0228 A[Catch: JSONException -> 0x04d0, TryCatch #13 {JSONException -> 0x04d0, blocks: (B:44:0x011c, B:45:0x013e, B:47:0x0148, B:48:0x0154, B:50:0x015c, B:52:0x0166, B:54:0x016e, B:62:0x01a3, B:55:0x0172, B:57:0x017a, B:58:0x0187, B:60:0x018f, B:61:0x019c, B:65:0x01ac, B:73:0x01e1, B:76:0x01eb, B:86:0x021e, B:88:0x0228, B:89:0x0234, B:91:0x023c, B:93:0x0244, B:95:0x024e, B:97:0x0258, B:117:0x02c0, B:124:0x02df, B:111:0x0294, B:113:0x02a2, B:114:0x02b1, B:116:0x02b9, B:98:0x025f, B:100:0x0267, B:102:0x026f, B:104:0x0275, B:106:0x027d, B:77:0x01f6, B:79:0x01fe, B:81:0x0206, B:83:0x020c, B:85:0x0214, B:67:0x01b4, B:69:0x01bc, B:72:0x01cb, B:70:0x01c3), top: B:314:0x011c }] */
    /* JADX WARN: Removed duplicated region for block: B:98:0x025f A[Catch: JSONException -> 0x04d0, TryCatch #13 {JSONException -> 0x04d0, blocks: (B:44:0x011c, B:45:0x013e, B:47:0x0148, B:48:0x0154, B:50:0x015c, B:52:0x0166, B:54:0x016e, B:62:0x01a3, B:55:0x0172, B:57:0x017a, B:58:0x0187, B:60:0x018f, B:61:0x019c, B:65:0x01ac, B:73:0x01e1, B:76:0x01eb, B:86:0x021e, B:88:0x0228, B:89:0x0234, B:91:0x023c, B:93:0x0244, B:95:0x024e, B:97:0x0258, B:117:0x02c0, B:124:0x02df, B:111:0x0294, B:113:0x02a2, B:114:0x02b1, B:116:0x02b9, B:98:0x025f, B:100:0x0267, B:102:0x026f, B:104:0x0275, B:106:0x027d, B:77:0x01f6, B:79:0x01fe, B:81:0x0206, B:83:0x020c, B:85:0x0214, B:67:0x01b4, B:69:0x01bc, B:72:0x01cb, B:70:0x01c3), top: B:314:0x011c }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LLLIIIL(int r38, java.lang.String r39) {
        /*
            Method dump skipped, instruction units count: 1575
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.videoarch.liveplayer.VideoLiveManager.LLLIIIL(int, java.lang.String):void");
    }

    public final void LLLLII(long j, Runnable runnable) {
        C786410Ut5.LJLIIL(j, this.LJIILIIL, runnable);
    }

    public final void LLLLILI(float f, int i) {
        String strLIZIZ = "";
        if (i != 19) {
            if (i != 20) {
                if (i == 143) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("");
                    sbLIZ.append("audio balance target lufs:");
                    sbLIZ.append(f);
                    strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                }
            } else {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("");
                sbLIZ2.append("slow_speed:");
                sbLIZ2.append(f);
                strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
                this.LJLJLLL = f;
                InterfaceC1467950oIr interfaceC1467950oIr = this.LIZLLL;
                if (interfaceC1467950oIr != null) {
                    ((C1470430oMr) interfaceC1467950oIr).LJIL(f, 191);
                    this.LJIILLIIL.LLLLLL = f;
                }
            }
        } else {
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("");
            sbLIZ3.append("catch_speed:");
            sbLIZ3.append(f);
            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ3);
            this.LJLJL = f;
            InterfaceC1467950oIr interfaceC1467950oIr2 = this.LIZLLL;
            if (interfaceC1467950oIr2 != null) {
                ((C1470430oMr) interfaceC1467950oIr2).LJIL(f, 80);
                this.LJIILLIIL.getClass();
            }
        }
        StringBuilder sbLIZ4 = C2188811AlT.LIZ();
        sbLIZ4.append("setFloatOption ");
        sbLIZ4.append(strLIZIZ);
        C2188811AlT.LIZIZ(sbLIZ4);
        C1698940uJQ.LIZJ();
    }

    public final void LLLLLZ(long j, String str) {
        if (this.X1 == 1) {
            this.b2 = "ABRDelayTimeNotReady";
        }
        int i = this.LLZZ;
        LLLLII(j, new ARunnableS18S1100000_13(this, str, 24));
    }

    /* JADX WARN: Removed duplicated region for block: B:67:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x025a  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0267  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LLLLZ(int r18, X.EnumC1699210uJr r19) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 909
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.videoarch.liveplayer.VideoLiveManager.LLLLZ(int, X.0uJr):boolean");
    }

    public final void LLLLZIL(long j, Surface surface) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("sync setSurface player=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", surface from ");
        sbLIZ.append(this.LJJIJ);
        sbLIZ.append(" to ");
        sbLIZ.append(surface);
        C2188811AlT.LIZIZ(sbLIZ);
        C1698940uJQ.LIZJ();
        LLLLLLLLL(j, surface, false);
    }

    public final void LLLLZLLIL(String str, String str2) {
        if (str != null && str2 != null && LJLZ().getIntValue(55047, 0) == 1) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("PLAY-SessionID", str);
                jSONObject.put("mio_sessionId", str2);
                if (!TextUtils.isEmpty(this.LLIIL)) {
                    jSONObject.put("live_unique_id", this.LLIIL);
                }
            } catch (JSONException e) {
                TryCatchGuardChecker.doCheck(e);
            }
            LJLZ().businessEvent(57016, jSONObject);
            C1698940uJQ.LIZJ();
        }
    }

    public final void LLLZIIL(StrategyStartupGearInfo.GearResponse gearResponse, boolean z) {
        this.LJIILLIIL.f472t5 = gearResponse.mHitCybertronVrtbitrate;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("updateStartupVrtbitrateInfo, retry:");
        sbLIZ.append(z);
        sbLIZ.append(",hit cybertron:");
        sbLIZ.append(this.LJIILLIIL.f472t5);
        sbLIZ.append(",bitrate map:");
        sbLIZ.append(gearResponse.mCybertronRtBitrateInfoMap);
        sbLIZ.append(",ts map:");
        sbLIZ.append(gearResponse.mCybertronRtBitrateTsMap);
        sbLIZ.append(",vpaas ts map:");
        sbLIZ.append(gearResponse.mCybertronRtBitrateVpaasTsMap);
        C2188811AlT.LIZIZ(sbLIZ);
        C1698940uJQ.LIZJ();
        LiveLoggerService liveLoggerService = this.LJIILLIIL;
        if (liveLoggerService.f472t5 == 2) {
            liveLoggerService.V0 = gearResponse.mCybertronRtBitrateTsMap;
            liveLoggerService.W0 = gearResponse.mCybertronRtBitrateVpaasTsMap;
        }
        if (z) {
            liveLoggerService.T0 = liveLoggerService.LLILLL.LLLLZLLLI;
            long jLLIIJI = LLIIJI();
            if (jLLIIJI != 0) {
                LiveLoggerService liveLoggerService2 = this.LJIILLIIL;
                liveLoggerService2.U0 = liveLoggerService2.T0 + jLLIIJI;
            }
        }
    }

    public static String LLFF(String str, String str2, String str3) {
        boolean z;
        if (!TextUtils.isEmpty(str3)) {
            z = !C1286540jaG.LJFF(str3);
        } else {
            z = false;
        }
        String strLJ = C1286540jaG.LJ(str, str2, z);
        String strEncode = null;
        if (TextUtils.isEmpty(strLJ)) {
            return null;
        }
        try {
            strEncode = URLEncoder.encode(strLJ, "UTF-8");
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("live://127.0.0.1");
        sbLIZ.append("?u0=" + strEncode);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final String LJIIJJI(String str, String str2, String str3) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(str2);
        sbLIZ.append("=");
        sbLIZ.append(str3);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        int iIndexOf = str.indexOf("?");
        if (iIndexOf == -1) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("?");
            sbLIZ2.append(strLIZIZ);
            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
        } else if (iIndexOf != str.length() - 1) {
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("&");
            sbLIZ3.append(strLIZIZ);
            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ3);
        }
        if (LLJJJ() && !TextUtils.equals(str2, "abr_pts")) {
            if (this.t2 == null) {
                StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                sbLIZ4.append(str2);
                sbLIZ4.append("=");
                sbLIZ4.append(str3);
                this.t2 = C2188811AlT.LIZIZ(sbLIZ4);
            } else {
                StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                sbLIZ5.append(this.t2);
                sbLIZ5.append("&");
                sbLIZ5.append(str2);
                sbLIZ5.append("=");
                sbLIZ5.append(str3);
                this.t2 = C2188811AlT.LIZIZ(sbLIZ5);
            }
        }
        StringBuilder sbLIZ6 = C2188811AlT.LIZ();
        sbLIZ6.append(str);
        sbLIZ6.append(strLIZIZ);
        return C2188811AlT.LIZIZ(sbLIZ6);
    }

    public final String LLIIIL(long j, boolean z, boolean z2) {
        String str;
        String strLIZIZ;
        String str2;
        JSONObject jSONObjectLLF = LLF();
        if (jSONObjectLLF == null) {
            return "";
        }
        if (z) {
            LJJJJZ(j);
        }
        if (C1474810oTv.LLILII()) {
            StringBuilder sb = new StringBuilder(256);
            sb.append("{\"cctk_stmp\":");
            sb.append(jSONObjectLLF.optInt("cctk_stmp", 0));
            sb.append(",\"cctk_bw\":");
            sb.append(jSONObjectLLF.optInt("cctk_bw", 0));
            sb.append(",\"cctk_plr\":");
            sb.append(jSONObjectLLF.optInt("cctk_plr", 0));
            sb.append(",\"cctk_mrtt\":");
            sb.append(jSONObjectLLF.optInt("cctk_mrtt", 0));
            sb.append(",\"cctk_srtt\":");
            sb.append(jSONObjectLLF.optInt("cctk_srtt", 0));
            sb.append(",\"cctk_rttv\":");
            sb.append(jSONObjectLLF.optInt("cctk_rttv", 0));
            sb.append(",\"cctk_srate\":");
            sb.append(jSONObjectLLF.optInt("cctk_srate", 0));
            sb.append(",\"cctk_rrate\":");
            sb.append(jSONObjectLLF.optInt("cctk_rrate", 0));
            sb.append(",\"cctk_irate\":");
            sb.append(jSONObjectLLF.optInt("cctk_irate", 0));
            sb.append(",\"cctk_blen\":");
            sb.append(jSONObjectLLF.optInt("cctk_blen", 0));
            sb.append(",\"rtt\":");
            sb.append(jSONObjectLLF.optInt("rtt", 0));
            sb.append(",\"cctk_slst\":");
            sb.append(jSONObjectLLF.optInt("cctk_slst", 0));
            sb.append(",\"cctk_thpt\":");
            sb.append(jSONObjectLLF.optInt("cctk_thpt", 0));
            sb.append(",\"loss\":");
            sb.append(jSONObjectLLF.optInt("loss", 0));
            sb.append(",\"cctk_bw_series\":\"");
            sb.append(this.LLLLLLZ);
            sb.append("\",\"cctk_srtt_series\":\"");
            sb.append(this.LLLLLLZZ);
            sb.append("\",\"cctk_plr_series\":\"");
            sb.append(this.LLLLLZ);
            sb.append("\",\"cctk_ts_series\":\"");
            if (z2) {
                str2 = this.LLLLLZIL;
            } else {
                str2 = "[]";
            }
            sb.append(str2);
            sb.append("\"}");
            strLIZIZ = sb.toString();
        } else {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("{\"cctk_stmp\":");
            sbLIZ.append(jSONObjectLLF.optInt("cctk_stmp", 0));
            String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ);
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append(strLIZIZ2);
            sbLIZ2.append(",\"cctk_bw\":");
            sbLIZ2.append(jSONObjectLLF.optInt("cctk_bw", 0));
            String strLIZIZ3 = C2188811AlT.LIZIZ(sbLIZ2);
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append(strLIZIZ3);
            sbLIZ3.append(",\"cctk_plr\":");
            sbLIZ3.append(jSONObjectLLF.optInt("cctk_plr", 0));
            String strLIZIZ4 = C2188811AlT.LIZIZ(sbLIZ3);
            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
            sbLIZ4.append(strLIZIZ4);
            sbLIZ4.append(",\"cctk_mrtt\":");
            sbLIZ4.append(jSONObjectLLF.optInt("cctk_mrtt", 0));
            String strLIZIZ5 = C2188811AlT.LIZIZ(sbLIZ4);
            StringBuilder sbLIZ5 = C2188811AlT.LIZ();
            sbLIZ5.append(strLIZIZ5);
            sbLIZ5.append(",\"cctk_srtt\":");
            sbLIZ5.append(jSONObjectLLF.optInt("cctk_srtt", 0));
            String strLIZIZ6 = C2188811AlT.LIZIZ(sbLIZ5);
            StringBuilder sbLIZ6 = C2188811AlT.LIZ();
            sbLIZ6.append(strLIZIZ6);
            sbLIZ6.append(",\"cctk_rttv\":");
            sbLIZ6.append(jSONObjectLLF.optInt("cctk_rttv", 0));
            String strLIZIZ7 = C2188811AlT.LIZIZ(sbLIZ6);
            StringBuilder sbLIZ7 = C2188811AlT.LIZ();
            sbLIZ7.append(strLIZIZ7);
            sbLIZ7.append(",\"cctk_srate\":");
            sbLIZ7.append(jSONObjectLLF.optInt("cctk_srate", 0));
            String strLIZIZ8 = C2188811AlT.LIZIZ(sbLIZ7);
            StringBuilder sbLIZ8 = C2188811AlT.LIZ();
            sbLIZ8.append(strLIZIZ8);
            sbLIZ8.append(",\"cctk_rrate\":");
            sbLIZ8.append(jSONObjectLLF.optInt("cctk_rrate", 0));
            String strLIZIZ9 = C2188811AlT.LIZIZ(sbLIZ8);
            StringBuilder sbLIZ9 = C2188811AlT.LIZ();
            sbLIZ9.append(strLIZIZ9);
            sbLIZ9.append(",\"cctk_irate\":");
            sbLIZ9.append(jSONObjectLLF.optInt("cctk_irate", 0));
            String strLIZIZ10 = C2188811AlT.LIZIZ(sbLIZ9);
            StringBuilder sbLIZ10 = C2188811AlT.LIZ();
            sbLIZ10.append(strLIZIZ10);
            sbLIZ10.append(",\"cctk_blen\":");
            sbLIZ10.append(jSONObjectLLF.optInt("cctk_blen", 0));
            String strLIZIZ11 = C2188811AlT.LIZIZ(sbLIZ10);
            StringBuilder sbLIZ11 = C2188811AlT.LIZ();
            sbLIZ11.append(strLIZIZ11);
            sbLIZ11.append(",\"rtt\":");
            sbLIZ11.append(jSONObjectLLF.optInt("rtt", 0));
            String strLIZIZ12 = C2188811AlT.LIZIZ(sbLIZ11);
            StringBuilder sbLIZ12 = C2188811AlT.LIZ();
            sbLIZ12.append(strLIZIZ12);
            sbLIZ12.append(",\"cctk_slst\":");
            sbLIZ12.append(jSONObjectLLF.optInt("cctk_slst", 0));
            String strLIZIZ13 = C2188811AlT.LIZIZ(sbLIZ12);
            StringBuilder sbLIZ13 = C2188811AlT.LIZ();
            sbLIZ13.append(strLIZIZ13);
            sbLIZ13.append(",\"cctk_thpt\":");
            sbLIZ13.append(jSONObjectLLF.optInt("cctk_thpt", 0));
            String strLIZIZ14 = C2188811AlT.LIZIZ(sbLIZ13);
            StringBuilder sbLIZ14 = C2188811AlT.LIZ();
            sbLIZ14.append(strLIZIZ14);
            sbLIZ14.append(",\"loss\":");
            sbLIZ14.append(jSONObjectLLF.optInt("loss", 0));
            String strLIZIZ15 = C2188811AlT.LIZIZ(sbLIZ14);
            StringBuilder sbLIZ15 = C2188811AlT.LIZ();
            sbLIZ15.append(strLIZIZ15);
            sbLIZ15.append(",\"cctk_bw_series\":\"");
            sbLIZ15.append(this.LLLLLLZ);
            sbLIZ15.append("\"");
            String strLIZIZ16 = C2188811AlT.LIZIZ(sbLIZ15);
            StringBuilder sbLIZ16 = C2188811AlT.LIZ();
            sbLIZ16.append(strLIZIZ16);
            sbLIZ16.append(",\"cctk_srtt_series\":\"");
            sbLIZ16.append(this.LLLLLLZZ);
            sbLIZ16.append("\"");
            String strLIZIZ17 = C2188811AlT.LIZIZ(sbLIZ16);
            StringBuilder sbLIZ17 = C2188811AlT.LIZ();
            sbLIZ17.append(strLIZIZ17);
            sbLIZ17.append(",\"cctk_plr_series\":\"");
            sbLIZ17.append(this.LLLLLZ);
            sbLIZ17.append("\"");
            String strLIZIZ18 = C2188811AlT.LIZIZ(sbLIZ17);
            StringBuilder sbLIZ18 = C2188811AlT.LIZ();
            sbLIZ18.append(strLIZIZ18);
            sbLIZ18.append(",\"cctk_ts_series\":\"");
            if (z2) {
                str = this.LLLLLZIL;
            } else {
                str = "[]";
            }
            sbLIZ18.append(str);
            sbLIZ18.append("\"");
            String strLIZIZ19 = C2188811AlT.LIZIZ(sbLIZ18);
            StringBuilder sbLIZ19 = C2188811AlT.LIZ();
            sbLIZ19.append(strLIZIZ19);
            sbLIZ19.append("}");
            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ19);
        }
        StringBuilder sbLIZ20 = C2188811AlT.LIZ();
        sbLIZ20.append("{\"NetInfo\":");
        sbLIZ20.append(strLIZIZ);
        sbLIZ20.append("}");
        return C2188811AlT.LIZIZ(sbLIZ20);
    }

    public final void LLLLLLIL(SurfaceControl surfaceControl, int i, int i2) {
        Surface surface;
        Object obj;
        boolean z;
        InterfaceC1467950oIr interfaceC1467950oIr;
        if (Build.VERSION.SDK_INT < 29) {
            return;
        }
        if (this.LJJIL.get()) {
            LLLLLLJ(surfaceControl, i, i2);
            return;
        }
        if (this.LJJIJIIJIL == null) {
            this.LJJIJIIJIL = LJJZZI();
            if (this.LJJIJLIJ == null) {
                this.LJJIJLIJ = new Surface(this.LJJIJIIJIL);
            }
            C1698940uJQ.LIZJ();
        }
        this.LJJIJIIJI = surfaceControl;
        if (this.LJJIJIIJIL != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("setSurfaceControl parent:");
            sbLIZ.append(surfaceControl);
            sbLIZ.append(", width:");
            sbLIZ.append(i);
            sbLIZ.append(", height:");
            sbLIZ.append(i2);
            sbLIZ.append(", hash:");
            sbLIZ.append(hashCode());
            C2188811AlT.LIZIZ(sbLIZ);
            C1698940uJQ.LIZJ();
            surface = this.LJJIJLIJ;
        } else {
            if (surfaceControl != null) {
                surface = new Surface(surfaceControl);
            } else {
                surface = null;
            }
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("sdk surface control is null, parent:");
            if (surfaceControl == null) {
                obj = "none";
            } else {
                obj = surfaceControl;
            }
            sbLIZ2.append(obj);
            sbLIZ2.append(", hash:");
            sbLIZ2.append(hashCode());
            C2188811AlT.LIZIZ(sbLIZ2);
            C1698940uJQ.LIZJ();
        }
        boolean z2 = false;
        if (this.LJJIJIIJIL != null) {
            z = true;
        } else {
            z = false;
        }
        LLLLLLLLL(-1L, surface, z);
        if (this.LJJIJIIJIL != null) {
            try {
                SurfaceControl.Transaction transaction = new SurfaceControl.Transaction();
                try {
                    SurfaceControl.Transaction bufferSize = transaction.reparent(this.LJJIJIIJIL, surfaceControl).setBufferSize(this.LJJIJIIJIL, i, i2);
                    SurfaceControl surfaceControl2 = this.LJJIJIIJIL;
                    if (surfaceControl != null) {
                        z2 = true;
                    }
                    bufferSize.setVisibility(surfaceControl2, z2).apply();
                    transaction.close();
                } finally {
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                C1698940uJQ.LIZIZ();
            }
            if (surfaceControl != null && this.LJJJI && (interfaceC1467950oIr = this.LIZLLL) != null) {
                ((C1470430oMr) interfaceC1467950oIr).LIZJ(35007, 1);
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("update live surface status, hash:");
                sbLIZ3.append(hashCode());
                C2188811AlT.LIZIZ(sbLIZ3);
                C1698940uJQ.LIZJ();
            }
        }
    }

    public final void LLLLLLJ(SurfaceControl surfaceControl, int i, int i2) {
        InterfaceC1467950oIr interfaceC1467950oIr = this.LIZLLL;
        if (interfaceC1467950oIr != null) {
            ((C1470430oMr) interfaceC1467950oIr).LJJIJIIJI(surfaceControl, i, i2);
            this.LJJIJ = ((C1470430oMr) this.LIZLLL).LJIILJJIL();
        }
        this.LJJIJIIJI = surfaceControl;
        this.LJJIJIL = i;
        this.LJJIJL = i2;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("step in setSurfaceControlToKernel, parent:");
        sbLIZ.append(surfaceControl);
        sbLIZ.append(", width:");
        sbLIZ.append(i);
        sbLIZ.append(", height:");
        sbLIZ.append(i2);
        C2188811AlT.LIZIZ(sbLIZ);
        C1698940uJQ.LIZJ();
    }

    public final void LLLLLLLLL(final long j, Surface surface, boolean z) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("setSurfaceInternalV2, surface: ");
        sbLIZ.append(surface);
        sbLIZ.append(", hash:");
        sbLIZ.append(hashCode());
        C2188811AlT.LIZIZ(sbLIZ);
        C1698940uJQ.LIZJ();
        InterfaceC1698710uJ3 interfaceC1698710uJ3 = this.LJIJJ;
        if (interfaceC1698710uJ3 != null) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("setSurfaceInternalV2, surface: ");
            sbLIZ2.append(surface);
            interfaceC1698710uJ3.LJJJJJ(C2188811AlT.LIZIZ(sbLIZ2));
        }
        if (surface == null) {
            if (this.LJJIJ == null) {
                C1698940uJQ.LIZJ();
                return;
            }
        } else if (!surface.isValid()) {
            C1698940uJQ.LIZJ();
            InterfaceC1698710uJ3 interfaceC1698710uJ32 = this.LJIJJ;
            if (interfaceC1698710uJ32 != null) {
                interfaceC1698710uJ32.LJJJJJ("setSurfaceInternalV2 surface is invalid.");
                return;
            }
            return;
        }
        if (this.I2 == 3) {
            LiveLoggerService liveLoggerService = this.LJIILLIIL;
            if (liveLoggerService.i6 == -1 && surface != null) {
                liveLoggerService.i6 = System.currentTimeMillis();
            }
        }
        LiveLoggerService liveLoggerService2 = this.LJIILLIIL;
        if (liveLoggerService2.LLLL <= 0 && surface != null) {
            liveLoggerService2.LLLL = System.currentTimeMillis();
        }
        this.LJJIJ = surface;
        if (this.LIZLLL == null) {
            C1698940uJQ.LIZJ();
            return;
        }
        if (z && this.y1.get()) {
            C1698940uJQ.LIZJ();
            return;
        }
        this.O2 = surface;
        boolean z2 = false;
        if (z) {
            if (surface != null) {
                this.y1.set(true);
                C1698940uJQ.LIZJ();
            }
        } else {
            this.y1.set(false);
            C1698940uJQ.LIZJ();
        }
        final Surface surface2 = this.LJJIJ;
        if (Looper.myLooper() == Looper.getMainLooper()) {
            z2 = true;
        }
        if (j <= 0) {
            j = 80;
        }
        this.LJIILLIIL.f1 = System.currentTimeMillis();
        if (surface2 != null && surface2.isValid()) {
            LiveLoggerService liveLoggerService3 = this.LJIILLIIL;
            liveLoggerService3.K0.lock();
            if (liveLoggerService3.d5 != 1) {
                liveLoggerService3.d5 = 1;
                liveLoggerService3.LJLJL();
            }
            liveLoggerService3.K0.unlock();
            this.LJIILLIIL.f5 = System.currentTimeMillis();
        }
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append("setSurfaceInternalV2 set surface to player, surface:");
        sbLIZ3.append(surface2);
        sbLIZ3.append(", main thread:");
        sbLIZ3.append(z2);
        sbLIZ3.append(", timeout:");
        sbLIZ3.append(j);
        C2188811AlT.LIZIZ(sbLIZ3);
        C1698940uJQ.LIZJ();
        if (!z2) {
            InterfaceC1467950oIr interfaceC1467950oIr = this.LIZLLL;
            if (interfaceC1467950oIr != null) {
                ((C1470430oMr) interfaceC1467950oIr).setSurface(surface2);
            }
        } else {
            C822650WOx c822650WOx = this.D0;
            if (c822650WOx != null && !c822650WOx.isShutdown()) {
                try {
                    this.D0.submit(new Callable<Boolean>() { // from class: X.0oOI
                        @Override // java.util.concurrent.Callable
                        public final Boolean call() {
                            C1C7U.LIZ("VideoLiveManager@62c1.setSurfaceInternalV2$1");
                            VideoLiveManager videoLiveManager = this.LLILLL;
                            long j2 = j;
                            Surface surface3 = surface2;
                            videoLiveManager.getClass();
                            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                            sbLIZ4.append("setSurfaceInternal, surface: ");
                            sbLIZ4.append(surface3);
                            sbLIZ4.append(", timeout: ");
                            sbLIZ4.append(j2);
                            C2188811AlT.LIZIZ(sbLIZ4);
                            C1698940uJQ.LIZJ();
                            InterfaceC1698710uJ3 interfaceC1698710uJ33 = videoLiveManager.LJIJJ;
                            if (interfaceC1698710uJ33 != null) {
                                StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                                sbLIZ5.append("setSurfaceInternal, surface: ");
                                sbLIZ5.append(surface3);
                                sbLIZ5.append(", timeout: ");
                                sbLIZ5.append(j2);
                                interfaceC1698710uJ33.LJJJJJ(C2188811AlT.LIZIZ(sbLIZ5));
                            }
                            long jCurrentTimeMillis = System.currentTimeMillis();
                            InterfaceC1467950oIr interfaceC1467950oIr2 = videoLiveManager.LIZLLL;
                            if (interfaceC1467950oIr2 != null) {
                                ((C1470430oMr) interfaceC1467950oIr2).setSurface(surface3);
                            }
                            long jCurrentTimeMillis2 = System.currentTimeMillis() - jCurrentTimeMillis;
                            LiveLoggerService liveLoggerService4 = videoLiveManager.LJIILLIIL;
                            if (liveLoggerService4 != null) {
                                liveLoggerService4.J5 = jCurrentTimeMillis2;
                            }
                            StringBuilder sbLIZ6 = C2188811AlT.LIZ();
                            sbLIZ6.append("setSurfaceInternal finish, cost: ");
                            sbLIZ6.append(jCurrentTimeMillis2);
                            C2188811AlT.LIZIZ(sbLIZ6);
                            C1698940uJQ.LIZJ();
                            InterfaceC1698710uJ3 interfaceC1698710uJ34 = videoLiveManager.LJIJJ;
                            if (interfaceC1698710uJ34 != null) {
                                StringBuilder sbLIZ7 = C2188811AlT.LIZ();
                                sbLIZ7.append("setSurfaceInternal finish, cost: ");
                                sbLIZ7.append(jCurrentTimeMillis2);
                                interfaceC1698710uJ34.LJJJJJ(C2188811AlT.LIZIZ(sbLIZ7));
                            }
                            Boolean bool = Boolean.TRUE;
                            C1C7U.LIZIZ("VideoLiveManager@62c1.setSurfaceInternalV2$1");
                            return bool;
                        }
                    }).get(j, TimeUnit.MILLISECONDS);
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                    sbLIZ4.append("setSurfaceInternalV2 sync setSurface post exception:");
                    sbLIZ4.append(e.getMessage());
                    C2188811AlT.LIZIZ(sbLIZ4);
                    C1698940uJQ.LIZIZ();
                }
            } else {
                ((C1470430oMr) this.LIZLLL).setSurface(surface2);
            }
        }
        this.LJIILLIIL.e1 = System.currentTimeMillis() - this.LJIILLIIL.f1;
    }

    public final void LLLIIII(String str, String str2, String str3, String str4) {
        C1698700uJ2 c1698700uJ2 = this.LLIIIJ;
        c1698700uJ2.LIZ = str;
        c1698700uJ2.LIZIZ = str2;
        c1698700uJ2.LJ = C1486300omS.LIZJ(str);
        this.LLIIIJ.LJFF = C1486300omS.LIZJ(str2);
        C1698700uJ2 c1698700uJ22 = this.LLIIIJ;
        c1698700uJ22.LIZJ = str3;
        c1698700uJ22.LIZLLL = str4;
        c1698700uJ22.LJIIJ = EnumC801300Vc0.SWITCHING;
        LLJLL(str, true);
    }

    public final String LLLIIIIL(String str, String str2, String str3, Map<String, String> map) {
        boolean z;
        boolean zFind;
        boolean z2;
        boolean z3;
        int i;
        String strJ3;
        JSONObject jSONObjectLJIIL;
        InterfaceC1467440oI2 interfaceC1467440oI2;
        int iHashCode;
        String strLIZIZ;
        String str4;
        String stringValue;
        String strJ4 = str2;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("prepareProxy play url: ");
        sbLIZ.append(str);
        sbLIZ.append(", host: ");
        sbLIZ.append(str3);
        sbLIZ.append(", ip: ");
        sbLIZ.append(strJ4);
        C2188811AlT.LIZIZ(sbLIZ);
        C1698940uJQ.LIZJ();
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("prepareProxy play url: ");
        sbLIZ2.append(str);
        sbLIZ2.append(", host: ");
        sbLIZ2.append(str3);
        sbLIZ2.append(", ip: ");
        sbLIZ2.append(strJ4);
        LLJZ(5, C2188811AlT.LIZIZ(sbLIZ2));
        if (this.H == 1) {
            if (C1476660oWu.LIZ.LIZJ) {
                stringValue = LiveIOManager.getInstance().getStringValue(1100);
            } else {
                stringValue = null;
            }
            this.LJIILLIIL.r4 = stringValue;
        }
        if (this.f450h0 == 1) {
            C1476660oWu.LIZ.LIZJ(1200);
            this.LJIILLIIL.getClass();
            this.LJIILLIIL.getClass();
        }
        if (!this.LLJJ.equals("flv") && !this.LLJJ.equals("cmaf")) {
            z = false;
        } else {
            z = true;
        }
        if (LLJJJ() && this.W0 == 0) {
            z = false;
        }
        if (!C1474810oTv.LJLJLLL() && TextUtils.isEmpty(this.LLIIJLIL)) {
            z = false;
        }
        if (TextUtils.equals(this.LLJILJIL, "ao") && this.G2 == 1 && this.P == 1) {
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("mResolution is AUDIO ");
            sbLIZ3.append(TextUtils.equals(this.LLJILJIL, "ao"));
            sbLIZ3.append(", mEnableOnlyAudioInAoRes:");
            sbLIZ3.append(this.G2);
            this.LJIILLIIL.q4 = C2188811AlT.LIZIZ(sbLIZ3);
            z = false;
        }
        if (this.LLJJIJIIJIL.equals("quic")) {
            z = false;
        }
        if (!this.LLJJIJIIJIL.equals("tcp") && ((!TextUtils.equals("h2q", this.LLJJIJIIJIL) || this.V0 != 1) && !this.LLJJIJIIJIL.equals("tls"))) {
            z = false;
        }
        if (this.k1 == 1 && this.LJJLJ == 1 && !this.LLJZIJLIL && this.Z0 == 0) {
            z = false;
        }
        if (!z) {
            if (C1474810oTv.LJLJLLL()) {
                str4 = this.LJJIII.LIZIZ;
            } else {
                str4 = this.LLIIJLIL;
            }
            boolean zIsEmpty = TextUtils.isEmpty(str4);
            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
            sbLIZ4.append("proxy not support format: ");
            sbLIZ4.append(this.LLJJ);
            sbLIZ4.append(", protocol: ");
            sbLIZ4.append(this.LLJJIJIIJIL);
            sbLIZ4.append(", liveio support quic: ");
            sbLIZ4.append(this.V0);
            sbLIZ4.append(" ,abr: ");
            sbLIZ4.append(this.LJLZ);
            sbLIZ4.append(", session id invalid: ");
            sbLIZ4.append(zIsEmpty);
            sbLIZ4.append(", liveio version: ");
            sbLIZ4.append(this.LJIILLIIL.r4);
            sbLIZ4.append(", current resolution: ");
            sbLIZ4.append(this.LLJILJIL);
            String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ4);
            LLJZ(6, strLIZIZ2);
            C1698940uJQ.LIZJ();
            this.LJIILLIIL.p4 = strLIZIZ2;
        }
        if (!z || TextUtils.isEmpty(str) || TextUtils.isEmpty(str3)) {
            return null;
        }
        if (this.P == 1 && (this.LLJJIJIIJIL.equals("quic") || !this.LLJJ.equals("flv"))) {
            this.P = 0;
            this.LJIILLIIL.q4 = "format is not flv";
            InterfaceC1467950oIr interfaceC1467950oIr = this.LIZLLL;
            if (interfaceC1467950oIr != null) {
                ((C1470430oMr) interfaceC1467950oIr).LIZJ(780, 0);
            }
        }
        StringBuilder sbLIZ5 = C2188811AlT.LIZ();
        sbLIZ5.append("enable liveio play:");
        sbLIZ5.append(this.H);
        sbLIZ5.append(" enable p2p: ");
        sbLIZ5.append(this.P);
        sbLIZ5.append(" enable pcdn rts: ");
        sbLIZ5.append(this.f450h0);
        C2188811AlT.LIZIZ(sbLIZ5);
        C1698940uJQ.LIZJ();
        if (this.H != 1) {
            return null;
        }
        if (!this.F) {
            this.LJIILLIIL.p4 = "liveio protocol register fail";
            C1698940uJQ.LIZJ();
            return null;
        }
        C1476650oWt c1476650oWt = C1476660oWu.LIZ;
        if (!c1476650oWt.LIZJ) {
            this.LJIILLIIL.p4 = "liveio not running";
            C1698940uJQ.LIZJ();
            return null;
        }
        String strLLFF = LLFF(LJJJJIZL(str), str3, strJ4);
        if (TextUtils.isEmpty(strLLFF)) {
            this.LJIILLIIL.p4 = "liveio proxy url fail";
            C1698940uJQ.LIZJ();
            return null;
        }
        if (C1474810oTv.LJLJLLL()) {
            C1698770uJ9 c1698770uJ9 = this.LJJIII;
            String str5 = c1698770uJ9.LIZLLL;
            if (!TextUtils.isEmpty(str5) && !((Boolean) C1474810oTv.H5.getValue()).booleanValue()) {
                strLIZIZ = this.LJJIII.LIZLLL;
            } else {
                this.LJJIII.LIZIZ("[VVSessionIdRefactor] generateMIOTaskId");
                StringBuilder sbLIZ6 = C2188811AlT.LIZ();
                sbLIZ6.append(System.currentTimeMillis());
                sbLIZ6.append(e3.d);
                C1698510uIj c1698510uIj = this.LJJII;
                if (!c1698510uIj.LJJII()) {
                    iHashCode = 0;
                } else {
                    iHashCode = c1698510uIj.LIZIZ.hashCode();
                }
                sbLIZ6.append(iHashCode);
                strLIZIZ = C2188811AlT.LIZIZ(sbLIZ6);
            }
            c1698770uJ9.LIZLLL = strLIZIZ;
            ((HashMap) map).put("X-Session-ID", this.LJJIII.LIZLLL);
            C1698770uJ9 c1698770uJ92 = this.LJJIII;
            this.Q0 = c1698770uJ92.LIZLLL;
            StringBuilder sbLIZ7 = C2188811AlT.LIZ();
            sbLIZ7.append("[VVSessionIdRefactor] prepareLiveIOURL, lastMIOTaskId:");
            sbLIZ7.append(str5);
            sbLIZ7.append(", newMIOTaskId:");
            sbLIZ7.append(this.LJJIII.LIZLLL);
            sbLIZ7.append(",mLiveVVSessionId:");
            sbLIZ7.append(this.LJJIII.LIZIZ);
            c1698770uJ92.LIZIZ(C2188811AlT.LIZIZ(sbLIZ7));
            String str6 = this.LJJIII.LIZLLL;
            if (str5 != null && str6 != null && !TextUtils.equals(str5, str6)) {
                c1476650oWt.LJIIJ(1308, str5, str6);
            }
            C1698770uJ9 c1698770uJ93 = this.LJJIII;
            LLLLZLLIL(c1698770uJ93.LIZIZ, c1698770uJ93.LIZLLL);
        } else {
            String str7 = this.R0;
            String str8 = this.LLIIJLIL;
            if (str8 != null) {
                if (this.P0 != -1) {
                    StringBuilder sbLIZ8 = C2188811AlT.LIZ();
                    sbLIZ8.append(this.LLIIJLIL);
                    sbLIZ8.append(e3.d);
                    sbLIZ8.append(this.P0);
                    this.Q0 = C2188811AlT.LIZIZ(sbLIZ8);
                } else {
                    this.Q0 = str8;
                }
                ((HashMap) map).put("X-Session-ID", this.Q0);
                String str9 = this.Q0;
                this.R0 = str9;
                if (str7 != null && str9 != null && !TextUtils.equals(str7, str9)) {
                    c1476650oWt.LJIIJ(1308, str7, str9);
                }
                LLLLZLLIL(this.LJIILLIIL.LLLLZLLLI, this.R0);
            } else {
                return null;
            }
        }
        try {
            JSONObject jSONObject = new JSONObject();
            if (strJ4 == null || strJ4.equals("none")) {
                String strLIZJ = C1286540jaG.LIZJ(str);
                if (strLIZJ != null && strLIZJ.length() >= 7 && strLIZJ.length() <= 15 && !"".equals(strLIZJ)) {
                    zFind = PatternProtector.compile("([1-9]|[1-9]\\d|1\\d{2}|2[0-4]\\d|25[0-5])(\\.(\\d|[1-9]\\d|1\\d{2}|2[0-4]\\d|25[0-5])){3}").matcher(strLIZJ).find();
                } else {
                    zFind = false;
                }
                if (zFind) {
                    strJ4 = strLIZJ;
                }
            }
            if (strJ4 == null || strJ4.equals("none")) {
                z2 = false;
            } else {
                z2 = !C1286540jaG.LJFF(strJ4);
                if (z2 && !strJ4.contains(e3.e)) {
                    strJ4 = C786410Ut5.j4("[%s]", new Object[]{strJ4});
                }
                this.LJLLL = strJ4;
                LiveLoggerService liveLoggerService = this.LJIILLIIL;
                liveLoggerService.LLJJIJIL = strJ4;
                liveLoggerService.LLJJJ = false;
                jSONObject.put("given_ips", strJ4);
            }
            this.x.getClass();
            jSONObject.put("url", LJJJJJ(LJJJJIZL(C1286540jaG.LJ(str, str3, z2))));
            if (this.LLJJ.equals("cmaf")) {
                if (this.f444J == 1 && this.I == 1) {
                    jSONObject.put("cmaf_media_first", 1);
                    C1698940uJQ.LIZJ();
                } else if (this.E && this.B && (interfaceC1467440oI2 = this.h3) != null) {
                    int iLJIIIIZZ = interfaceC1467440oI2.LJIIIIZZ(2201);
                    jSONObject.put("cmaf_media_first", iLJIIIIZZ);
                    StringBuilder sbLIZ9 = C2188811AlT.LIZ();
                    sbLIZ9.append("[CmafConfigCenter] prepareLiveIOURL via starship: cmaf_media_first=");
                    sbLIZ9.append(iLJIIIIZZ);
                    C2188811AlT.LIZIZ(sbLIZ9);
                    C1698940uJQ.LIZJ();
                } else {
                    JSONObject jSONObject2 = this.LJIILLIIL.w1;
                    if (jSONObject2 != null && jSONObject2.has("CmafMediaFirst")) {
                        jSONObject.put("cmaf_media_first", this.LJIILLIIL.w1.get("CmafMediaFirst"));
                        StringBuilder sbLIZ10 = C2188811AlT.LIZ();
                        sbLIZ10.append("[CmafConfigCenter] prepareLiveIOURL via sdkParams: cmaf_media_first=");
                        sbLIZ10.append(this.LJIILLIIL.w1.get("CmafMediaFirst"));
                        C2188811AlT.LIZIZ(sbLIZ10);
                        C1698940uJQ.LIZJ();
                    }
                }
            }
            if (this.I == 1 && this.LLJILJIL.equals("auto") && this.LJZI.equals("abr_bb_4live")) {
                C1698510uIj c1698510uIj2 = this.LJJII;
                if (c1698510uIj2.LIZLLL == 2) {
                    JSONObject jSONObjectLIZIZ = c1698510uIj2.LIZIZ(23, this.LLJILLL, true);
                    JSONObject jSONObjectLJIJI = this.LJJII.LJIJI(this.LLJILLL);
                    String strJ32 = "{}";
                    if (jSONObjectLIZIZ == null) {
                        strJ3 = "{}";
                    } else {
                        strJ3 = C786410Ut5.J3(jSONObjectLIZIZ);
                    }
                    jSONObject.put("abr_bitrate_map", strJ3);
                    if (jSONObjectLJIJI != null) {
                        strJ32 = C786410Ut5.J3(jSONObjectLJIJI);
                    }
                    jSONObject.put("abr_stream_suffix_map", strJ32);
                    jSONObject.put("sdk_auto", 1);
                    jSONObject.put("sched_recommend_resolution", "auto");
                    if ("cmaf".equals(this.LLJJ) && (jSONObjectLJIIL = this.LJJII.LJIIL(this.LLJILLL)) != null) {
                        JSONArray jSONArrayNames = jSONObjectLJIIL.names();
                        if (jSONArrayNames != null) {
                            for (int i2 = 0; i2 < jSONArrayNames.length(); i2++) {
                                String strOptString = jSONArrayNames.optString(i2);
                                String strOptString2 = jSONObjectLJIIL.optString(strOptString);
                                if (!TextUtils.isEmpty(strOptString2)) {
                                    String strLJJJJJL = LJJJJJL(strOptString2);
                                    if (!TextUtils.isEmpty(strLJJJJJL)) {
                                        strOptString2 = strLJJJJJL;
                                    }
                                    jSONObjectLJIIL.put(strOptString, strOptString2);
                                }
                            }
                        }
                        StringBuilder sbLIZ11 = C2188811AlT.LIZ();
                        sbLIZ11.append("abrURLMap: ");
                        sbLIZ11.append(jSONObjectLJIIL);
                        C1698940uJQ.LIZLLL("VideoLiveManager", C2188811AlT.LIZIZ(sbLIZ11));
                        jSONObject.put("abr_url_map", C786410Ut5.J3(jSONObjectLJIIL));
                    }
                }
            }
            this.x.getClass();
            if (this.B) {
                String strLJLLJ = LJLLJ();
                if (!TextUtils.isEmpty(strLJLLJ)) {
                    jSONObject.put("config_id", strLJLLJ);
                    StringBuilder sbLIZ12 = C2188811AlT.LIZ();
                    sbLIZ12.append("[ConfigCenter] attach config_id into liveIO params id=");
                    sbLIZ12.append(strLJLLJ);
                    C2188811AlT.LIZIZ(sbLIZ12);
                    C1698940uJQ.LIZJ();
                } else {
                    C1698940uJQ.LIZJ();
                }
            }
            if (!this.LLJJIJIIJIL.equals("h2q")) {
                jSONObject.put("suggest_protocol", this.LLJJIJIIJIL);
            } else {
                jSONObject.put("suggest_protocol", "h2q");
            }
            jSONObject.put("suggest_format", this.LLJJ);
            jSONObject.put("http_headers", C786410Ut5.J3(new JSONObject(map)));
            if (!TextUtils.isEmpty(this.l0)) {
                jSONObject.put("liveio_experiment_param", C786410Ut5.J3(new JSONObject(this.l0)));
            }
            if (!TextUtils.isEmpty(this.m0)) {
                jSONObject.put("RaceConfig", C786410Ut5.J3(new JSONObject(this.m0)));
            }
            if (!TextUtils.isEmpty(this.n0)) {
                jSONObject.put("liveio_params_config", C786410Ut5.J3(new JSONObject(this.n0)));
            }
            boolean z4 = this.LLLLII;
            if (z4) {
                jSONObject.put("enable_dns_parser_manager", z4);
            }
            jSONObject.put("abr_pts", p3);
            StringBuilder sbLIZ13 = C2188811AlT.LIZ();
            sbLIZ13.append("liveio playInfoJson: ");
            sbLIZ13.append(C786410Ut5.J3(jSONObject));
            C2188811AlT.LIZIZ(sbLIZ13);
            C1698940uJQ.LIZJ();
            if (this.f446X == 0) {
                C1476650oWt c1476650oWt2 = C1476660oWu.LIZ;
                String str10 = this.Q0;
                String strJ33 = C786410Ut5.J3(jSONObject);
                if (c1476650oWt2.LIZJ) {
                    LiveIOManager.getInstance().prepare(str10, strJ33);
                }
                LiveIOManager.getInstance().setLiveEngineCallback(new IMIOLivePlayTaskCallback(this) { // from class: X.0ojm
                    public final WeakReference<VideoLiveManager> LIZ;

                    {
                        this.LIZ = new WeakReference<>(this);
                    }

                    @Override // com.ss.videoarch.liveio.IMIOLivePlayTaskCallback
                    public final void onNotify(int i3, String str11) {
                        String string;
                        VideoLiveManager videoLiveManager = this.LIZ.get();
                        if (videoLiveManager == null) {
                            return;
                        }
                        LiveLoggerService liveLoggerService2 = videoLiveManager.LJIILLIIL;
                        String str12 = videoLiveManager.Q0;
                        if (i3 != 3100) {
                            if (i3 == 3101 && liveLoggerService2 != null) {
                                C1476660oWu.LIZ.LJII(3101, str12, liveLoggerService2.LLILLL.LIZ);
                                return;
                            }
                            return;
                        }
                        if (liveLoggerService2 == null) {
                            return;
                        }
                        C1476650oWt c1476650oWt3 = C1476660oWu.LIZ;
                        ArrayList<Long> arrayList = liveLoggerService2.w0;
                        if (arrayList != null && !arrayList.isEmpty()) {
                            StringBuilder sb = new StringBuilder(e3.e);
                            boolean z5 = true;
                            for (Long l : liveLoggerService2.w0) {
                                if (z5) {
                                    sb.append(l);
                                    z5 = false;
                                } else {
                                    sb.append(",");
                                    sb.append(l);
                                }
                            }
                            sb.append(e3.f);
                            string = sb.toString();
                        } else {
                            string = "";
                        }
                        c1476650oWt3.LJIIJ(3100, str12, string);
                    }
                }, this.Q0, true);
                if (this.k1 == 0 || this.LJIILLIIL.L5 == -1 || (this.LLJZIJLIL && this.f447Y == 1)) {
                    C1698940uJQ.LIZJ();
                    String str11 = this.Q0;
                    if (c1476650oWt2.LIZJ) {
                        LiveIOManager.getInstance().play(str11);
                    }
                } else if (this.y0 == 1 && this.L1 == 1) {
                    C1698940uJQ.LIZJ();
                    c1476650oWt2.LJII(1165, this.Q0, this.z0);
                }
            } else {
                if (this.k1 == 0 || this.LJIILLIIL.L5 == -1 || (this.LLJZIJLIL && this.f447Y == 1)) {
                    C1698940uJQ.LIZJ();
                    jSONObject.put("liveio_receive_play_call", 1);
                    z3 = false;
                } else {
                    z3 = true;
                }
                C1476650oWt c1476650oWt3 = C1476660oWu.LIZ;
                String str12 = this.Q0;
                String strJ34 = C786410Ut5.J3(jSONObject);
                if (c1476650oWt3.LIZJ) {
                    LiveIOManager.getInstance().prepare(str12, strJ34);
                }
                LiveIOManager.getInstance().setLiveEngineCallback(new IMIOLivePlayTaskCallback(this) { // from class: X.0ojm
                    public final WeakReference<VideoLiveManager> LIZ;

                    {
                        this.LIZ = new WeakReference<>(this);
                    }

                    @Override // com.ss.videoarch.liveio.IMIOLivePlayTaskCallback
                    public final void onNotify(int i3, String str112) {
                        String string;
                        VideoLiveManager videoLiveManager = this.LIZ.get();
                        if (videoLiveManager == null) {
                            return;
                        }
                        LiveLoggerService liveLoggerService2 = videoLiveManager.LJIILLIIL;
                        String str122 = videoLiveManager.Q0;
                        if (i3 != 3100) {
                            if (i3 == 3101 && liveLoggerService2 != null) {
                                C1476660oWu.LIZ.LJII(3101, str122, liveLoggerService2.LLILLL.LIZ);
                                return;
                            }
                            return;
                        }
                        if (liveLoggerService2 == null) {
                            return;
                        }
                        C1476650oWt c1476650oWt32 = C1476660oWu.LIZ;
                        ArrayList<Long> arrayList = liveLoggerService2.w0;
                        if (arrayList != null && !arrayList.isEmpty()) {
                            StringBuilder sb = new StringBuilder(e3.e);
                            boolean z5 = true;
                            for (Long l : liveLoggerService2.w0) {
                                if (z5) {
                                    sb.append(l);
                                    z5 = false;
                                } else {
                                    sb.append(",");
                                    sb.append(l);
                                }
                            }
                            sb.append(e3.f);
                            string = sb.toString();
                        } else {
                            string = "";
                        }
                        c1476650oWt32.LJIIJ(3100, str122, string);
                    }
                }, this.Q0, true);
                if (this.y0 == 1 && this.L1 == 1 && z3) {
                    C1698940uJQ.LIZJ();
                    c1476650oWt3.LJII(1165, this.Q0, this.z0);
                }
            }
            this.G = true;
            LiveLoggerService liveLoggerService2 = this.LJIILLIIL;
            C1476650oWt c1476650oWt4 = C1476660oWu.LIZ;
            if (c1476650oWt4.LIZJ(1159) == 1) {
                i = 1;
            } else {
                i = 0;
            }
            liveLoggerService2.n4 = i;
            C1698940uJQ.LIZJ();
            this.LJIILLIIL.o4 = (int) c1476650oWt4.LIZJ(1166);
            C1698940uJQ.LIZJ();
            this.LJIILLIIL.m4 = 1;
            if (this.P == 1) {
                C786410Ut5.LJJZZIII(this.LJIILIIL, new RunnableC1485770olb(this, this.Q0, true, this.t0, this.u0, this.v0));
            }
            this.LJIILLIIL.getClass();
            C1698940uJQ.LIZJ();
            return strLLFF;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C1698940uJQ.LJ();
            this.LJIILLIIL.p4 = "liveio prepare fail";
            return null;
        }
    }

    public final void LLLLZI(int i, long j, long j2, String str, String str2) {
        if (TextUtils.equals(this.LLJILLL, str)) {
            C1698940uJQ.LIZJ();
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("content steering - switch from ");
        sbLIZ.append(this.LLJILLL);
        sbLIZ.append(" to ");
        sbLIZ.append(str);
        sbLIZ.append(" -- ");
        sbLIZ.append(this.P0);
        C2188811AlT.LIZIZ(sbLIZ);
        C1698940uJQ.LIZJ();
        C1698700uJ2 c1698700uJ2 = this.LLIIIJ;
        c1698700uJ2.LJIIJJI = EnumC1699200uJq.CONTENT_STEERING_INITIATED;
        if (this.LLIFFJFJJ) {
            c1698700uJ2.LJIIL.put("player_error_code", Integer.valueOf(this.LLII));
            this.LLIIIJ.LJIIL.put("player_error_time", Long.valueOf(this.LLIIII));
        }
        this.LLIIIJ.LJIIL.put("cs_request_time", Long.valueOf(j));
        this.LLIIIJ.LJIIL.put("cs_response_time", Long.valueOf(j2));
        this.LLIIIJ.LJIIL.put("play_scene", str2);
        if (!LLLLZ(i, EnumC1699210uJr.IN_ROOM)) {
            this.LLIIIJ.LIZ();
        }
    }
}
