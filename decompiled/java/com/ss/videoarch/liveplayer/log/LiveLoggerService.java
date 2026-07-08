package com.ss.videoarch.liveplayer.log;

import X.C1279580jP2;
import X.C1279650jP9;
import X.C1279660jPA;
import X.C1281010jRL;
import X.C1286530jaF;
import X.C1470430oMr;
import X.C1474810oTv;
import X.C1476650oWt;
import X.C1476660oWu;
import X.C1481110oe5;
import X.C1698490uIh;
import X.C1698550uIn;
import X.C1698570uIp;
import X.C1698640uIw;
import X.C1698660uIy;
import X.C1698680uJ0;
import X.C1698700uJ2;
import X.C1698720uJ4;
import X.C1698750uJ7;
import X.C1698770uJ9;
import X.C1698790uJB;
import X.C1698890uJL;
import X.C1698920uJO;
import X.C1698940uJQ;
import X.C1698950uJR;
import X.C1698970uJT;
import X.C1698980uJU;
import X.C1698990uJV;
import X.C1699010uJX;
import X.C1699230uJt;
import X.C1915507er;
import X.C1C7U;
import X.C2188811AlT;
import X.C786410Ut5;
import X.C787360Uuc;
import X.C794300VDw;
import X.EnumC1486270omP;
import X.EnumC1699200uJq;
import X.InterfaceC1467950oIr;
import X.InterfaceC1698710uJ3;
import X.InterfaceC1699150uJl;
import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.util.Pair;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.mt.protector.impl.JSONArrayProtectorUtils;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.vcloud.strategy.StrategyCenter;
import com.ss.android.ugc.aweme.experiment.Mp4ScreenVideoLoadTimeout;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.videoarch.liveplayer.VideoLiveManager;
import java.text.DecimalFormat;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Deque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.ConcurrentLinkedDeque;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.locks.ReentrantLock;
import org.apache.commons.net.ntp.NTPUDPClient;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import ttpobfuscated.e3;

/* JADX INFO: loaded from: classes27.dex */
public final class LiveLoggerService implements Handler.Callback {
    public static final AtomicLong A7;
    public static final DecimalFormat q7 = new DecimalFormat("0.00");
    public static boolean r7 = false;
    public static long s7 = -1;
    public static final HashMap<String, Integer> t7;
    public static final HashSet<String> u7;

    /* JADX INFO: renamed from: v7, reason: collision with root package name */
    public static final HashSet<String> f457v7;
    public static final String w7;
    public static final AtomicLong x7;
    public static final String y7;
    public static final AtomicLong z7;
    public final C1698490uIh A3;
    public long L;
    public final InterfaceC1698710uJ3 LLILLJJLI;
    public final C1698490uIh LLILLL;
    public final VideoLiveManager LLILZ;
    public final C1698770uJ9 LLILZIL;
    public boolean LLIZLLLIL;
    public long LLJ;
    public long LLJI;
    public int LLJIJIL;
    public int LLJILJIL;
    public boolean LLJJJ;
    public boolean LLJJJJ;
    public long LLJJJJJIL;
    public int LLJZ;
    public int LLL;
    public int LLLF;
    public boolean LLLFF;
    public C1279650jP9 LLLFZ;
    public boolean LLLII;
    public boolean LLLIIII;
    public volatile int LLLIIL;
    public volatile boolean LLLILZ;
    public boolean LLLILZLLLI;
    public int LLLJIL;
    public boolean LLLLII;
    public int LLLLIIIILLL;
    public int LLLLJ;
    public int LLLLJI;
    public int LLLLL;
    public int LLLLLIL;
    public int LLLLLILLIL;
    public int LLLLLJIL;
    public float LLLLLLIL;
    public int LLLLLLJ;
    public int LLLLLLL;
    public int LLLLLLLLL;
    public long LLLLLLZ;
    public int LLLLLZL;
    public String LLLLZLL;
    public int LLLZIIL;
    public boolean LLLZLL;
    public boolean LLLZLZ;
    public long LLLZZ;
    public long LLLZZIL;
    public int LLZ;
    public int LLZIL;
    public long LLZILL;
    public long LLZL;
    public long LLZLL;
    public long LLZLLIL;
    public long LLZLLLL;
    public long LLZZ;
    public long LLZZJLIL;
    public long LLZZLLIL;
    public long LLZZZIL;
    public long LLZZZZ;
    public Map<String, String> O3;
    public C1286530jaF Q;
    public long Q6;
    public MyNTPTask R;
    public long R6;
    public boolean S;
    public long S6;
    public long T6;
    public final ConcurrentLinkedDeque<Long> Y0;
    public final ConcurrentLinkedDeque<Long> Z0;
    public int a;
    public final ConcurrentLinkedDeque<Long> a1;
    public long b;
    public int c;
    public long d;
    public int e;
    public C1698790uJB e7;
    public long f;
    public final C1698550uIn f7;
    public long g;
    public C1698980uJU g7;
    public long h;
    public final C1698720uJ4 h7;
    public long i;
    public long j;
    public boolean k;
    public int l;
    public int m;
    public int n;
    public long o;
    public int p;
    public long q;
    public int r;
    public long s;
    public final C787360Uuc z6;
    public long LLIZ = -1;
    public long LLJILJILJ = -1;
    public String LLJILLL = "none";
    public String LLJJ = "none";
    public String LLJJI = "none";
    public String LLJJIII = "none";
    public String LLJJIJI = "none";
    public String LLJJIJIIJIL = "none";
    public String LLJJIJIL = "none";
    public String LLJJJIL = "none";
    public String LLJJJJLIIL = "none";
    public String LLJJL = "none";
    public String LLJJLIIIJLLLLLLLZ = "none";
    public String LLJL = "none";
    public String LLJLIL = "none";
    public int LLJLILLLLZIIL = -1;
    public int LLJLL = -1;
    public String LLJLLIL = "none";
    public String LLJLLL = "none";
    public String LLJZIJLIL = "none";
    public String LLLFFI = "";
    public boolean LLLI = true;
    public volatile String LLLIIIIL = "";
    public volatile long LLLIIIL = -1;
    public volatile String LLLIILIL = "";
    public volatile long LLLIL = -1;
    public String LLLILZJ = "none";
    public String LLLIZZ = "none";
    public String LLLJ = "none";
    public long LLLJL = -1;
    public long LLLL = -1;
    public int LLLLIIL = -1;
    public int LLLLIILL = -1;
    public int LLLLIILLL = -1;
    public int LLLLIL = -1;
    public int LLLLILI = -1;
    public int LLLLLJLJLL = -1;
    public float LLLLLL = -1.0f;
    public String LLLLLLLLLL = "none";
    public String LLLLLLLZIL = "none";
    public long LLLLLLZZ = 2000;
    public int LLLLLZ = -1;
    public int LLLLLZIL = -1;
    public int LLLLZ = -1;
    public float LLLLZI = -1.0f;
    public String LLLLZIL = "none";
    public String LLLLZLLIL = "none";
    public String LLLLZLLLI = "none";
    public String LLLZ = "flv";
    public String LLLZI = "";
    public long LLLZIL = 2;
    public long LLLZL = 3000;
    public long LLZLI = -1;
    public final List<String> t = new ArrayList();
    public int u = 0;
    public int v = 0;
    public int w = 60;
    public long x = 0;
    public long y = 0;
    public long z = 0;
    public long A = 0;
    public long B = 0;
    public long C = 0;
    public long D = 0;
    public int E = 0;
    public int F = 0;
    public int G = 0;
    public final Deque<C1698990uJV> H = new ArrayDeque();
    public boolean I = false;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public int f458J = -1;
    public boolean K = false;
    public boolean M = false;
    public long N = 0;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public long f459O = 0;
    public long P = 0;
    public int T = 0;
    public boolean U = false;
    public int V = 0;
    public long W = 0;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    public int f460X = 0;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public int f461Y = 0;
    public int Z = 0;
    public int a0 = 1;
    public int b0 = 0;
    public int c0 = 0;
    public int d0 = 0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public int f463e0 = -1;
    public ArrayList<Long> f0 = null;
    public ArrayList<Long> g0 = null;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public ArrayList<String> f464h0 = null;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public ArrayList<Integer> f465i0 = null;
    public ArrayList<Integer> j0 = null;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public ArrayList<Long> f466k0 = null;
    public ArrayList<Integer> l0 = null;
    public ArrayList<Integer> m0 = null;
    public ArrayList<Long> n0 = null;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    public ArrayList<Long> f469o0 = null;
    public ArrayList<Long> p0 = null;
    public ArrayList<Long> q0 = null;
    public ArrayList<Long> r0 = null;
    public ArrayList<Long> s0 = null;
    public ArrayList<Integer> t0 = null;
    public ArrayList<Long> u0 = null;
    public ArrayList<Integer> v0 = null;
    public ArrayList<Long> w0 = null;
    public ArrayList<Long> x0 = null;
    public ArrayList<Long> y0 = null;
    public long z0 = -1;
    public String A0 = "none";
    public String B0 = "none";
    public JSONObject C0 = null;
    public ArrayList<Integer> D0 = null;
    public ArrayList<Integer> E0 = null;
    public ArrayList<Long> F0 = null;
    public String G0 = "none";
    public String H0 = "none";
    public boolean I0 = false;
    public InterfaceC1699150uJl J0 = null;
    public final ReentrantLock K0 = new ReentrantLock();
    public final ArrayList<C1915507er> L0 = new ArrayList<>();
    public final ArrayList<C1915507er> M0 = new ArrayList<>();
    public final ArrayList<C1915507er> N0 = new ArrayList<>();
    public final ArrayList<C1915507er> O0 = new ArrayList<>();
    public int P0 = -1;
    public long Q0 = 0;
    public long R0 = 0;
    public int S0 = -1;
    public long T0 = 0;
    public long U0 = 0;
    public JSONObject V0 = null;
    public JSONObject W0 = null;
    public final ArrayList<JSONObject> X0 = new ArrayList<>();
    public int b1 = 0;
    public boolean c1 = false;
    public long d1 = Mp4ScreenVideoLoadTimeout.CONTROL;
    public long e1 = 0;
    public long f1 = 0;
    public int g1 = 0;
    public String h1 = "none";
    public float i1 = -1.0f;
    public long j1 = 0;
    public int k1 = 0;
    public String l1 = "none";
    public String m1 = "tcp";
    public String n1 = "none";
    public int o1 = -1;

    /* JADX INFO: renamed from: p1, reason: collision with root package name */
    public int f470p1 = 0;
    public String q1 = "none";
    public String r1 = "none";
    public String s1 = "none";
    public boolean t1 = false;
    public boolean u1 = false;
    public int v1 = -1;
    public JSONObject w1 = null;
    public int x1 = 0;
    public int y1 = 1;
    public final String z1 = Build.BOARD;
    public final String A1 = Build.HARDWARE;
    public String B1 = "none";
    public String C1 = "none";
    public String D1 = "none";
    public boolean E1 = false;
    public String F1 = "origin";
    public String G1 = "none";
    public String H1 = "none";
    public String I1 = "none";
    public String J1 = "origin";
    public String K1 = "none";
    public long L1 = -1;
    public int M1 = -1;
    public int N1 = 0;
    public String O1 = "none";
    public boolean P1 = false;
    public long Q1 = -1;
    public long R1 = -1;
    public int S1 = 0;
    public String T1 = "none";
    public long U1 = -1;
    public long V1 = 0;
    public long W1 = 0;
    public long X1 = 0;
    public int Y1 = -1;
    public int Z1 = 0;
    public boolean a2 = false;
    public int b2 = EnumC1486270omP.STARTUP_EXEC_TYPE_NONE.ordinal();
    public int c2 = -1;
    public String d2 = "none";
    public ArrayList<String> e2 = null;
    public int f2 = -1;
    public int g2 = -1;
    public String h2 = "none";
    public String i2 = "none";
    public int j2 = -1;
    public int k2 = 0;
    public int l2 = -1;
    public String m2 = "none";

    /* JADX INFO: renamed from: n2, reason: collision with root package name */
    public String f468n2 = "none";
    public int o2 = -1;

    /* JADX INFO: renamed from: p2, reason: collision with root package name */
    public int f471p2 = 0;
    public String q2 = "none";
    public ArrayList<String> r2 = null;
    public String s2 = "none";
    public String t2 = "none";
    public String u2 = "none";
    public int v2 = 0;
    public int w2 = 0;
    public long x2 = 0;
    public long y2 = -1;
    public long z2 = 0;
    public long A2 = 0;
    public long B2 = 0;
    public String C2 = "";
    public String D2 = "";
    public String E2 = "";
    public long F2 = 0;
    public long G2 = 0;
    public long H2 = 0;
    public long I2 = 0;
    public long J2 = 0;
    public long K2 = 0;
    public long L2 = 0;
    public long M2 = 0;
    public long N2 = 0;
    public long O2 = 0;
    public long P2 = 0;
    public long Q2 = 0;
    public long R2 = 0;
    public long S2 = -1;
    public long T2 = -1;
    public long U2 = -1;
    public long V2 = -1;
    public String W2 = "none";
    public long X2 = 0;
    public boolean Y2 = false;
    public long Z2 = 0;

    /* JADX INFO: renamed from: a3, reason: collision with root package name */
    public long f462a3 = 0;
    public long b3 = 0;
    public long c3 = 0;
    public long d3 = 0;
    public long e3 = 0;
    public long f3 = 0;
    public long g3 = 0;
    public long h3 = 0;
    public long i3 = 0;
    public long j3 = 0;
    public long k3 = -1;
    public long l3 = -1;

    /* JADX INFO: renamed from: m3, reason: collision with root package name */
    public int f467m3 = 0;
    public long n3 = 0;
    public long o3 = 0;
    public long p3 = -1;
    public String q3 = "video_audio";
    public int r3 = -1;
    public LinkedBlockingQueue<Long> s3 = null;
    public int t3 = -1;
    public long u3 = -1;
    public int v3 = -1;
    public int w3 = 0;
    public int x3 = 0;
    public int y3 = 0;
    public int z3 = 0;
    public final int B3 = 10;
    public final int C3 = 500;
    public final String D3 = "none";
    public long E3 = 0;
    public long F3 = 0;
    public long G3 = 0;
    public long H3 = 0;
    public int I3 = 0;
    public int J3 = 0;
    public int K3 = 0;
    public final int L3 = 1;
    public int M3 = 0;
    public String N3 = "none";
    public int P3 = -1;
    public float Q3 = -1.0f;
    public int R3 = 0;
    public String S3 = "";
    public long T3 = 0;
    public long U3 = 0;
    public long V3 = 0;
    public long W3 = 0;
    public long X3 = 0;
    public long Y3 = 0;
    public long Z3 = 0;
    public long a4 = 0;
    public long b4 = 0;
    public long c4 = 0;
    public long d4 = 0;
    public long e4 = 0;
    public long f4 = 0;
    public long g4 = 0;
    public long h4 = 0;
    public long i4 = 0;
    public long j4 = 0;
    public long k4 = 0;
    public long l4 = 0;
    public int m4 = 0;
    public int n4 = 0;
    public int o4 = -2;
    public String p4 = "none";
    public String q4 = "none";
    public String r4 = "none";
    public long s4 = -1;
    public JSONObject t4 = null;

    /* JADX INFO: renamed from: u4, reason: collision with root package name */
    public String f473u4 = "";
    public String v4 = "";
    public int w4 = 0;
    public int x4 = 2000;
    public int y4 = 0;
    public int z4 = 0;
    public int A4 = 0;
    public String B4 = "";
    public String C4 = "";
    public int D4 = -1;
    public String E4 = "";
    public String F4 = "";
    public String G4 = "";
    public String H4 = "";
    public String I4 = "";
    public String J4 = "";
    public String K4 = "";
    public long L4 = 0;
    public long M4 = 0;
    public int N4 = 0;
    public int O4 = 0;
    public long P4 = 0;
    public long Q4 = 0;
    public final int R4 = SpeechEngineDefines.TTS_WORK_MODE_BOTH;
    public final int S4 = 512;
    public String T4 = "";
    public String U4 = "";
    public final C1698920uJO V4 = new C1698920uJO();
    public boolean W4 = false;
    public boolean X4 = false;
    public boolean Y4 = false;
    public boolean Z4 = false;
    public boolean a5 = false;
    public boolean b5 = false;
    public int c5 = -1;
    public int d5 = -1;
    public int e5 = -1;
    public long f5 = -1;
    public boolean g5 = false;
    public final boolean h5 = true;
    public int i5 = 0;
    public ArrayList<Integer> j5 = new ArrayList<>();
    public volatile long k5 = 0;
    public volatile long l5 = 0;
    public String m5 = "none";
    public int n5 = 0;
    public String o5 = "none";
    public int p5 = 0;
    public int q5 = 0;
    public int r5 = -1;
    public int s5 = 0;

    /* JADX INFO: renamed from: t5, reason: collision with root package name */
    public int f472t5 = 0;
    public int u5 = 0;
    public String v5 = "none";
    public int w5 = 0;
    public String x5 = "none";
    public String y5 = "none";
    public final int z5 = -998;
    public int A5 = 0;
    public final String B5 = "";
    public List<Long> C5 = null;
    public List<Long> D5 = null;
    public List<Long> E5 = null;
    public List<Long> F5 = null;
    public List<Long> G5 = null;
    public List<Double> H5 = null;
    public List<Integer> I5 = null;
    public long J5 = -1;
    public int K5 = 0;
    public long L5 = -1;
    public long M5 = -1;
    public long N5 = 0;
    public long O5 = 0;
    public long P5 = 0;
    public long Q5 = 0;
    public long R5 = 0;
    public long S5 = 0;
    public String T5 = "none";
    public int U5 = 0;
    public final int V5 = -1;
    public final String W5 = "none";
    public final String X5 = "none";
    public final List<Long> Y5 = new ArrayList();
    public int Z5 = 0;
    public int a6 = 0;
    public int b6 = 0;
    public float c6 = -1.0f;
    public String d6 = "none";
    public long e6 = 0;
    public boolean f6 = false;
    public long g6 = 0;
    public int h6 = -1;
    public long i6 = -1;
    public long j6 = -1;
    public int k6 = 0;
    public long l6 = 0;
    public long m6 = 0;
    public long n6 = 0;
    public long o6 = 0;
    public long p6 = 0;
    public long q6 = 0;
    public long r6 = 0;
    public long s6 = 0;
    public final AtomicBoolean t6 = new AtomicBoolean(false);
    public int u6 = -1;
    public int v6 = 0;
    public final C1698750uJ7 w6 = new C1698750uJ7();
    public final C1698750uJ7 x6 = new C1698750uJ7();
    public final ArrayList<JSONObject> y6 = new ArrayList<>();
    public StrategyCenter A6 = null;
    public int B6 = 0;
    public int C6 = 0;
    public int D6 = 0;
    public int E6 = 0;
    public int F6 = -1;
    public String G6 = "none";
    public boolean H6 = false;
    public int I6 = -1;
    public int J6 = -1;
    public final String K6 = "none";
    public long L6 = 0;
    public long M6 = -1;
    public long N6 = -1;
    public String O6 = "none";
    public String P6 = "none";
    public JSONArray U6 = new JSONArray();
    public int V6 = 0;
    public JSONArray W6 = new JSONArray();
    public final C1698570uIp X6 = new C1698570uIp(this);
    public final C1698660uIy Y6 = new C1698660uIy(this);
    public long Z6 = 0;
    public long a7 = 0;
    public long b7 = 0;
    public final C1698680uJ0 c7 = new C1698680uJ0();
    public JSONObject d7 = new JSONObject();
    public int i7 = 0;
    public int j7 = 0;
    public final C1698640uIw k7 = new C1698640uIw();
    public final C1279580jP2 l7 = new C1279580jP2();
    public int m7 = 0;
    public int n7 = 0;
    public long o7 = -1;
    public long p7 = -1;
    public final BPEAHandler LL = new BPEAHandler(this);
    public long LLILZLL = 60000;

    public final void LJIIZILJ() {
        this.K = true;
    }

    public final synchronized JSONObject LJJIFFI() {
        if (!this.LLLIIII || !this.LLLILZ) {
            return null;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("mio_dns_type", this.LLLIIIIL);
        jSONObject.put("mio_dns_parse_duration", this.LLLIIIL);
        jSONObject.put("mio_dns_error_code", this.LLLIIL);
        jSONObject.put("mio_dns_ip_list", this.LLLIILIL);
        jSONObject.put("mio_dns_fetch_time", this.LLLIL);
        jSONObject.put("mio_dns_is_cache_hit", this.LLLII ? 1 : 0);
        return jSONObject;
    }

    public final void LJJJJI() {
        this.M = false;
        long jCurrentTimeMillis = System.currentTimeMillis() - this.N;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("recover from error time ");
        sbLIZ.append(jCurrentTimeMillis);
        C2188811AlT.LIZIZ(sbLIZ);
        C1698940uJQ.LIZJ();
        if (this.N != 0) {
            this.f459O++;
            this.P += System.currentTimeMillis() - this.N;
        }
    }

    static {
        HashMap<String, Integer> map = new HashMap<>();
        t7 = map;
        HashSet<String> hashSet = new HashSet<>();
        u7 = hashSet;
        HashSet<String> hashSet2 = new HashSet<>();
        f457v7 = hashSet2;
        w7 = UUID.randomUUID().toString().replace("-", "");
        x7 = new AtomicLong(0L);
        y7 = UUID.randomUUID().toString().replace("-", "");
        z7 = new AtomicLong(0L);
        A7 = new AtomicLong(0L);
        map.put("first_frame", Integer.valueOf(SpeechEngineDefines.TTS_WORK_MODE_BOTH));
        hashSet.add("p2p_switch");
        hashSet.add("p2p_error");
        hashSet.add("pts_back");
        hashSet.add("rtc_decode_stall");
        hashSet.add("first_frame_live");
        hashSet.add("link");
        hashSet.add("timestamp_rollback");
        hashSet.add("stream_abnormal");
        hashSet.add("skip_data_info");
        hashSet.add("first_frame_failed");
        hashSet.add("switch_url");
        hashSet.add("push_stall");
        hashSet.add("push_render_stall");
        hashSet2.add("stall");
        hashSet2.add("abr_decision");
        hashSet2.add("abr_session");
    }

    public final void LJFF() {
        C1698490uIh c1698490uIh = this.LLILLL;
        long j = c1698490uIh.LJIJ;
        if (j > 0 && c1698490uIh.LJIIZILJ > 0) {
            this.LLZIL = 0;
            return;
        }
        if (j > 0 && c1698490uIh.LJIIZILJ <= 0) {
            this.LLZIL = 1;
        } else if (j > 0 || c1698490uIh.LJIIZILJ <= 0) {
            this.LLZIL = 3;
        } else {
            this.LLZIL = 2;
        }
    }

    public final String LJIIIIZZ() {
        C1698790uJB c1698790uJB = this.e7;
        if (c1698790uJB != null && c1698790uJB.LIZ) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("start", this.LLLJL);
                jSONObject.put("code", this.e7.LJIILJJIL);
                jSONObject.put("set_window_time", this.e7.LJIILIIL);
                jSONObject.put("reopen_start_ts", this.e7.LJIIJ);
                jSONObject.put("reopen_end_ts", this.e7.LJIIJJI);
                jSONObject.put("pts_diff", this.e7.LJIIL);
                jSONObject.put("receive_size", this.e7.LJIIIZ);
                jSONObject.put("sdk_dns_analysis_end", this.e7.LIZIZ);
                jSONObject.put("player_dns_analysis_end", this.e7.LIZJ);
                jSONObject.put("tcp_connect_end", this.e7.LIZLLL);
                jSONObject.put("tcp_first_package_end", this.e7.LJ);
                jSONObject.put("first_video_package_end", this.e7.LJFF);
                jSONObject.put("first_video_frame_decode_end", this.e7.LJI);
                jSONObject.put("first_frame_render_end", this.e7.LJIIIIZZ);
                return C786410Ut5.J3(jSONObject);
            } catch (JSONException e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        return null;
    }

    public final String LJIILLIIL() {
        this.K0.lock();
        try {
            JSONObject jSONObject = this.d7;
            if (jSONObject == null || jSONObject.length() <= 0) {
                this.K0.unlock();
                return null;
            }
            String strJ3 = C786410Ut5.J3(this.d7);
            this.d7 = new JSONObject();
            this.K0.unlock();
            return strJ3;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            this.K0.unlock();
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0068  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String LJIJ() {
        /*
            r10 = this;
            com.ss.videoarch.liveplayer.VideoLiveManager r0 = r10.LLILZ
            java.lang.String r9 = "none"
            if (r0 != 0) goto L7
            return r9
        L7:
            X.0uIj r1 = r0.LJJII
            java.lang.String r8 = r0.LLJILLL
            boolean r0 = r1.LJJII()
            if (r0 == 0) goto L68
            X.0uIi r6 = r1.LIZIZ
            r6.getClass()
            java.lang.String r5 = "vbitrate"
            java.lang.String r2 = "list"
            boolean r0 = android.text.TextUtils.isEmpty(r8)
            if (r0 != 0) goto L68
            org.json.JSONObject r7 = new org.json.JSONObject
            r7.<init>()
            org.json.JSONObject r1 = r6.LJFF(r8)     // Catch: org.json.JSONException -> L6a
            if (r1 == 0) goto L68
            boolean r0 = r1.has(r2)     // Catch: org.json.JSONException -> L6a
            if (r0 == 0) goto L68
            org.json.JSONArray r4 = r1.optJSONArray(r2)     // Catch: org.json.JSONException -> L6a
            if (r4 == 0) goto L68
            r3 = 0
        L38:
            int r0 = r4.length()     // Catch: org.json.JSONException -> L6a
            if (r3 >= r0) goto L6e
            java.lang.String r2 = r4.optString(r3)     // Catch: org.json.JSONException -> L6a
            boolean r0 = android.text.TextUtils.isEmpty(r2)     // Catch: org.json.JSONException -> L6a
            if (r0 != 0) goto L65
            org.json.JSONObject r1 = r6.LJIILL(r2, r8)     // Catch: org.json.JSONException -> L6a
            if (r1 == 0) goto L61
            boolean r0 = r1.has(r5)     // Catch: org.json.JSONException -> L6a
            if (r0 == 0) goto L5c
            int r0 = r1.optInt(r5)     // Catch: org.json.JSONException -> L6a
            r7.put(r2, r0)     // Catch: org.json.JSONException -> L6a
            goto L65
        L5c:
            r0 = -2
            r7.put(r2, r0)     // Catch: org.json.JSONException -> L6a
            goto L65
        L61:
            r0 = -1
            r7.put(r2, r0)     // Catch: org.json.JSONException -> L6a
        L65:
            int r3 = r3 + 1
            goto L38
        L68:
            r7 = 0
            goto L6e
        L6a:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
        L6e:
            if (r7 == 0) goto L7b
            java.lang.String r1 = X.C786410Ut5.J3(r7)
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 != 0) goto L7b
            return r1
        L7b:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.videoarch.liveplayer.log.LiveLoggerService.LJIJ():java.lang.String");
    }

    public final String LJIJI() {
        VideoLiveManager videoLiveManager = this.LLILZ;
        String strLIZIZ = "none";
        if (videoLiveManager == null) {
            return "none";
        }
        C794300VDw c794300VDw = videoLiveManager.LLZZLLIL;
        if (c794300VDw != null) {
            try {
                strLIZIZ = c794300VDw.LIZIZ();
                return strLIZIZ;
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                C1698940uJQ.LIZIZ();
            }
        }
        return strLIZIZ;
    }

    public final float LJIJJ() {
        C787360Uuc c787360Uuc = this.z6;
        if (c787360Uuc == null) {
            return -1.0f;
        }
        int i = c787360Uuc.LJI;
        int i2 = c787360Uuc.LJII;
        if (i != Integer.MAX_VALUE) {
            return (c787360Uuc.LIZ() - i2) / (i - i2);
        }
        return -1.0f;
    }

    public final StrategyCenter LJIJJLI() {
        if (this.A6 == null) {
            this.A6 = StrategyCenter.getInstance();
        }
        return this.A6;
    }

    public final String LJIL() {
        return this.m4 == 1 ? TextUtils.equals("tls", this.LLILLL.LJJJJJL) ? "https" : TextUtils.equals("rtm", this.LLILLL.LJJJJJL) ? "rtm" : (TextUtils.equals(this.m1, "h2q") && this.LLILLL.LJJLIIIJJIZ == 5) ? "http3" : this.m1 : LJJIIJ();
    }

    public final JSONObject LJJII() {
        JSONObject jSONObject = new JSONObject();
        try {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("getPerfStrategyInfo to report: ");
            sbLIZ.append(this.v2);
            sbLIZ.append(", ");
            sbLIZ.append(this.m7);
            sbLIZ.append(", ");
            sbLIZ.append(this.LLILLL.LLLLLLL);
            sbLIZ.append(", ");
            sbLIZ.append(this.LLILLL.LLLLLLLLL);
            C1481110oe5.LIZIZ("LiveLoggerService_LogPrefStrategy", C2188811AlT.LIZIZ(sbLIZ));
            if (this.v2 > 0) {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("down_count", this.v2);
                jSONObject2.put("up_count", this.w2);
                jSONObject2.put("duration", this.x2);
                jSONObject.put("strategy_resolution", jSONObject2);
            }
            if (this.m7 > 0) {
                JSONObject jSONObject3 = new JSONObject();
                jSONObject3.put("down_count", this.m7);
                jSONObject3.put("up_count", this.n7);
                jSONObject3.put("duration", this.p7 + (this.o7 > 0 ? System.currentTimeMillis() - this.o7 : 0L));
                jSONObject.put("strategy_log", jSONObject3);
            }
            if (this.LLILLL.LLLLLLL == 1) {
                JSONObject jSONObject4 = new JSONObject();
                jSONObject4.put("down_count", 1);
                jSONObject.put("strategy_audio_effect", jSONObject4);
            }
            if (this.LLILLL.LLLLLLLLL == 1) {
                JSONObject jSONObject5 = new JSONObject();
                jSONObject5.put("down_count", 1);
                jSONObject.put("strategy_video_effect", jSONObject5);
                return jSONObject;
            }
        } catch (JSONException e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("error: ");
            sbLIZ2.append(e);
            C1481110oe5.LIZIZ("LiveLoggerService_LogPrefStrategy", C2188811AlT.LIZIZ(sbLIZ2));
        }
        return jSONObject;
    }

    public final String LJJIII() {
        return (!this.P1 || TextUtils.equals(this.LLLZ, "cmaf")) ? this.LLLZ : "llash";
    }

    public final String LJJIIJ() {
        C1698490uIh c1698490uIh = this.LLILLL;
        if (c1698490uIh.LLILLIZIL == 2 || TextUtils.equals("tls", c1698490uIh.LJJJJJ)) {
            return "https";
        }
        if (TextUtils.equals("rtm", this.LLILLL.LJJJJJ)) {
            return "rtm";
        }
        if (!TextUtils.equals(this.m1, "h2q") || this.LLILLL.LJJLIIIJJIZ != 5) {
            return this.m1;
        }
        C1698940uJQ.LIZJ();
        return "http3";
    }

    public final String LJJIIJZLJL() {
        String str = this.y5;
        if (!TextUtils.isEmpty(this.LLILZ.LLIIL)) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(this.LLILZ.LLIIL);
            sbLIZ.append("_");
            sbLIZ.append(this.x5);
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            String stringValue = this.LLILZ.LJLZ().getStringValue(57001, strLIZIZ);
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("try to get pre log with key:");
            sbLIZ2.append(strLIZIZ);
            sbLIZ2.append(", log:");
            sbLIZ2.append(stringValue);
            C2188811AlT.LIZIZ(sbLIZ2);
            C1698940uJQ.LIZJ();
            if (!TextUtils.isEmpty(stringValue) && !TextUtils.equals(stringValue, "none")) {
                return stringValue;
            }
        }
        return str;
    }

    public final int LJJIIZ() {
        return (int) this.LLZLL;
    }

    public final String LJJIIZI() {
        JSONObject jSONObject;
        JSONObject jSONObject2 = new JSONObject();
        try {
            VideoLiveManager videoLiveManager = this.LLILZ;
            JSONObject jSONObjectLLILL = videoLiveManager.O1.equals("none") ? null : videoLiveManager.LLILL(videoLiveManager.O1, videoLiveManager.LLJILLL);
            if (jSONObjectLLILL != null && jSONObjectLLILL.has("v_rtbitrate_timestamp")) {
                this.Q0 = jSONObjectLLILL.optLong("v_rtbitrate_timestamp", this.Q0);
            }
            if (jSONObjectLLILL != null && jSONObjectLLILL.has("v_rtbitrate_vpaas_timestamp")) {
                this.R0 = jSONObjectLLILL.optLong("v_rtbitrate_vpaas_timestamp", this.R0);
            }
            if (this.p5 > 0 && this.q5 > 0) {
                this.LLILZ.LLIL("rtBitrateTs");
                this.Q0 = this.Q0;
                this.LLILZ.LLIL("rtBitrateVpaasTs");
                this.R0 = this.R0;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("[StartupRetry] rtBitrateTs:");
                sbLIZ.append(0L);
                sbLIZ.append(",rtBitrateVpaasTs:");
                sbLIZ.append(0L);
                C2188811AlT.LIZIZ(sbLIZ);
                C1698940uJQ.LIZJ();
            }
            if (this.s5 == 1 && (jSONObject = this.V0) != null && this.W0 != null) {
                long jOptLong = jSONObject.optLong(this.LLILZ.O1);
                this.Q0 = jOptLong > 0 ? jOptLong : this.Q0;
                JSONObject jSONObject3 = this.W0;
                String str = this.LLILZ.O1;
                if (str != null) {
                    str.equals("none");
                }
                long jOptLong2 = jSONObject3.optLong(str, 0L);
                this.R0 = jOptLong2 > 0 ? jOptLong2 : this.R0;
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("[Get_Cybertron] vrtBitrateTs:");
                sbLIZ2.append(jOptLong);
                sbLIZ2.append(",vrtBitrateVpaasTs:");
                sbLIZ2.append(jOptLong2);
                sbLIZ2.append(",delay:");
                sbLIZ2.append(this.LLILLL.LLLLZLLLI - jOptLong2);
                C2188811AlT.LIZIZ(sbLIZ2);
                C1698940uJQ.LIZJ();
            }
            long j = this.Q0;
            if (j > 0 && this.R0 > 0) {
                this.P0 = 0;
            } else if (j <= 0 && this.R0 > 0) {
                this.P0 = -2;
            } else if (j > 0 && this.R0 <= 0) {
                this.P0 = -3;
            }
            jSONObject2.put("v_rtbitrate_timestamp_error_code", this.P0);
            long j2 = this.Q0;
            if (j2 > 0) {
                jSONObject2.put("v_rtbitrate_timestamp", j2);
            }
            long j3 = this.R0;
            if (j3 > 0) {
                jSONObject2.put("v_rtbitrate_vpaas_timestamp", j3);
            }
            jSONObject2.put("v_rtbitrate_startup_error_code", this.S0);
            long j4 = this.T0;
            if (j4 > 0) {
                jSONObject2.put("v_rtbitrate_startup_timestamp", j4);
            }
            long j5 = this.U0;
            if (j5 > 0) {
                jSONObject2.put("v_rtbitrate_startup_ntp_timestamp", j5);
            }
        } catch (JSONException e) {
            TryCatchGuardChecker.doCheck(e);
        }
        return C786410Ut5.J3(jSONObject2);
    }

    public final boolean LJJIJIIJI() {
        VideoLiveManager videoLiveManager = this.LLILZ;
        return videoLiveManager != null && videoLiveManager.LLJJJJLIIL == 1;
    }

    public final int LJJIL() {
        int i = 0;
        if (!this.n1.equals("h2q") || StrategyCenter.getInstance().getIntValue(55402, 0) != 1) {
            return 0;
        }
        C1476650oWt c1476650oWt = C1476660oWu.LIZ;
        int iLIZJ = (int) c1476650oWt.LIZJ(5003);
        if (iLIZJ > 0 && this.L6 > iLIZJ) {
            i = 3;
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("pull_host", this.x5);
                jSONObject.put("type", 3);
                c1476650oWt.LJII(5002, C786410Ut5.J3(jSONObject), -1L);
                return 3;
            } catch (JSONException e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        return i;
    }

    public final void LJJJI() {
        if (this.t6.compareAndSet(true, false)) {
            this.r6 = 0L;
            this.s6 = 0L;
        }
    }

    public final void LJJJJJL() {
        C1698490uIh c1698490uIh;
        VideoLiveManager videoLiveManager = this.LLILZ;
        if (videoLiveManager == null || (c1698490uIh = this.LLILLL) == null) {
            return;
        }
        this.A5 = 1;
        videoLiveManager.LLFZ(c1698490uIh, 10, false);
        JSONObject jSONObjectLJIIJJI = LJIIJJI("first_frame_live");
        if (jSONObjectLJIIJJI != null) {
            try {
                JSONObject jSONObjectPut = jSONObjectLJIIJJI.put("event_key", "first_frame_live").put("is_stream_received", this.LLLZLZ ? 1 : 0).put("is_stream_received_live", this.A5).put("audio_live_open", this.LLILLL.LLLFFI).put("video_live_open", this.LLILLL.LLLFZ).put("audio_live_connect_end", this.LLILLL.LLLI).put("video_live_connect_end", this.LLILLL.LLLII).put("first_live_audio_packet_end", this.LLILLL.LLLIIII).put("first_live_video_packet_end", this.LLILLL.LLLIIIIL);
                this.LLILLL.getClass();
                JSONObject jSONObjectPut2 = jSONObjectPut.put("first_live_audio_frame_render_end", 0L).put("first_live_video_frame_render_end", this.LLILLL.LLLIIIL).put("enable_preload", 0).put("audioHttpxRequestCached", 0).put("videoHttpxRequestCached", 0).put("audioCachedNum", this.LLILLL.LLLJ).put("videoCachedNum", this.LLILLL.LLLJIL).put("preload_init_error", 0).put("preload_result", this.z5).put("preload_resolution", this.B5).put("play_use_preload_resolution", 0).put("preload_visit_timedelta", 0L).put("start", this.LLILLL.LIZ).put("sdk_dns_analysis_end", this.LLILLL.LIZJ).put("http_req_finish_time", this.LLILLL.LJJIJLIJ).put("http_res_finish_time", this.LLILLL.LJJIL).put("first_video_package_end", this.LLILLL.LJIILIIL).put("first_audio_package_end", this.LLILLL.LJIILJJIL).put("first_video_frame_decode_end", this.LLILLL.LJIILL).put("first_audio_frame_decode_end", this.LLILLL.LJIILLIIL).put("first_frame_from_player_core", this.LLILLL.LJIJI).put("first_frame_render_end", this.LLILLL.LJIIZILJ).put("video_param_send_outlet_time", this.LLILLL.LLII).put("first_video_frame_send_outlet_time", this.LLILLL.LLIIII).put("video_first_pkt_pts", this.LLILLL.LJJIII).put("audio_first_pkt_pts", this.LLILLL.LJJIIJZLJL).put("video_buffer_time", this.LLILLL.LJLIIL).put("audio_buffer_time", this.LLILLL.LJLIL).put("download_speed", this.LLILLL.LJJZZI).put("suggest_format", this.l1).put("suggest_protocol", this.n1);
                C1698490uIh c1698490uIh2 = this.LLILLL;
                JSONObject jSONObjectPut3 = jSONObjectPut2.put("first_live_frame_time", c1698490uIh2.LLLIIIL - c1698490uIh2.LIZ).put("cache_hit", 0).put("preload_task_state", 0).put("cache_open_start_time", this.LLILLL.LLLJL).put("cache_open_end_time", this.LLILLL.LLLL).put("cache_read_eof_time", this.LLILLL.LLLLII).put("live_open_start_time", this.LLILLL.LLLLIIIILLL).put("live_open_end_time", this.LLILLL.LLLLIIL).put("live_read_first_pkt_time", this.LLILLL.LLLLIILL);
                C1698490uIh c1698490uIh3 = this.LLILLL;
                JSONObject jSONObjectPut4 = jSONObjectPut3.put("cache_open_cost", c1698490uIh3.LLLL - c1698490uIh3.LLLJL);
                C1698490uIh c1698490uIh4 = this.LLILLL;
                JSONObject jSONObjectPut5 = jSONObjectPut4.put("cache_consume_cost", c1698490uIh4.LLLLII - c1698490uIh4.LLLJL);
                C1698490uIh c1698490uIh5 = this.LLILLL;
                JSONObject jSONObjectPut6 = jSONObjectPut5.put("live_open_cost", c1698490uIh5.LLLLIIL - c1698490uIh5.LLLLIIIILLL);
                C1698490uIh c1698490uIh6 = this.LLILLL;
                JSONObject jSONObjectPut7 = jSONObjectPut6.put("cache_live_hole", c1698490uIh6.LLLLIIL - c1698490uIh6.LLLLII);
                C1698490uIh c1698490uIh7 = this.LLILLL;
                JSONObject jSONObjectPut8 = jSONObjectPut7.put("cache_live_read_diff", c1698490uIh7.LLLLIILL - c1698490uIh7.LLLLII);
                C1698490uIh c1698490uIh8 = this.LLILLL;
                jSONObjectPut8.put("cache_live_render_diff", c1698490uIh8.LLLIIIL - c1698490uIh8.LJIIZILJ).put("buffer_stall_time", this.LLZLLIL).put("buffer_stall_count", this.LLZLL).put("video_decode_stall_time", this.U3).put("video_decode_stall_count", this.T3).put("audio_decode_stall_time", this.W3).put("audio_decode_stall_count", this.V3).put("video_render_stall_time", this.h).put("video_render_stall_count", this.g).put("audio_render_stall_time", this.j).put("audio_render_stall_count", this.i);
                LJJJJIZL(jSONObjectLJIIJJI);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
    }

    public final void LJJLI() {
        if (this.LLIZLLLIL) {
            this.w6.LIZLLL();
            if (this.LLIZ > 0) {
                this.x6.LIZLLL();
            }
        }
    }

    public final void LJJLJ() {
        C1279660jPA c1279660jPA;
        JSONObject jSONObjectLJIIJJI;
        C1279650jP9 c1279650jP9 = this.LLLFZ;
        if (c1279650jP9 == null || (c1279660jPA = c1279650jP9.LIZ) == null || c1279660jPA.LIZJ <= 0 || (jSONObjectLJIIJJI = LJIIJJI("playing")) == null) {
            return;
        }
        try {
            jSONObjectLJIIJJI.put("event_key", "playing");
            jSONObjectLJIIJJI.put("is_low_latency", 0);
            this.LLLFZ.LIZ(jSONObjectLJIIJJI);
            LJJJJIZL(jSONObjectLJIIJJI);
        } catch (JSONException e) {
            TryCatchGuardChecker.doCheck(e);
            C1698940uJQ.LIZIZ();
        }
    }

    public final void LJJLJLI() {
        JSONObject jSONObjectLJIIJJI;
        C1279650jP9 c1279650jP9 = this.LLLFZ;
        if (c1279650jP9 == null || !c1279650jP9.LJFF() || c1279650jP9.LIZLLL || (jSONObjectLJIIJJI = LJIIJJI("player_switch")) == null) {
            return;
        }
        try {
            jSONObjectLJIIJJI.put("event_key", "player_switch");
            this.LLLFZ.LIZLLL(jSONObjectLJIIJJI);
            LJJJJIZL(jSONObjectLJIIJJI);
        } catch (JSONException e) {
            TryCatchGuardChecker.doCheck(e);
            C1698940uJQ.LIZIZ();
        }
    }

    public final void LJJZ() {
        this.LLJJIJI = "none";
        this.LLJJIJIIJIL = "none";
        this.LLJJIJIL = "none";
        this.LLJJJ = false;
        this.LLJJJJJIL = 0L;
        this.G6 = "none";
        this.a2 = false;
        this.LLJ = 0L;
        this.LLJI = 0L;
        this.LLJIJIL = 0;
        this.LLJILJIL = 0;
        this.LLJJL = "none";
        this.LLJJLIIIJLLLLLLLZ = "none";
        this.LLJL = "none";
        this.LLJLIL = "none";
        this.LLJLILLLLZIIL = -1;
        this.LLJLL = -1;
        this.LLJLLIL = "none";
        this.LLJLLL = "none";
        this.S3 = "";
        this.LLJZIJLIL = "none";
        this.LLLFF = false;
        this.LLLII = false;
        this.LLLIIII = false;
        this.q3 = "video_audio";
        this.LLLIIIIL = "";
        this.LLLIIIL = -1L;
        this.LLLIIL = 0;
        this.LLLIILIL = "";
        this.LLLIL = -1L;
        this.LLLILZ = false;
        this.Y2 = false;
        this.f463e0 = -1;
        this.LLLZLL = false;
        this.LLLLII = false;
        this.LLLLIIIILLL = 0;
        this.LLLLIILL = -1;
        this.LLLLIIL = -1;
        this.LLLLIILLL = -1;
        this.LLLLIL = -1;
        this.LLLLILI = -1;
        this.LLLLJ = 0;
        this.LLLLJI = 0;
        this.LLLLL = 0;
        this.LLLLLIL = 0;
        this.LLLLLILLIL = 0;
        this.LLLLLJIL = 0;
        this.LLLLLJLJLL = -1;
        this.LLLLLL = -1.0f;
        this.LLLLLLLLL = 0;
        this.LLLLLLLLLL = "none";
        this.LLLLLLZ = 0L;
        this.LLLLLLZZ = 2000L;
        this.LLLLLZ = -1;
        this.b1 = 0;
        this.LLLZLZ = false;
        this.LLLZZ = 0L;
        this.LLLZZIL = 0L;
        this.e6 = 0L;
        this.g6 = 0L;
        this.LLZ = 0;
        this.LLZILL = 0L;
        this.LLZLI = -1L;
        this.LLZLL = 0L;
        this.LLZLLIL = 0L;
        this.h = 0L;
        this.g = 0L;
        this.j = 0L;
        this.i = 0L;
        this.f459O = 0L;
        this.P = 0L;
        this.M = false;
        this.k = false;
        this.n = 0;
        this.o = 0L;
        this.r = 0;
        this.s = 0L;
        this.p = 0;
        this.q = 0L;
        this.LLZL = 0L;
        ((ArrayList) this.t).clear();
        this.u = 0;
        this.v = 0;
        this.x = 0L;
        this.y = 0L;
        this.z = 0L;
        this.A = 0L;
        this.B = 0L;
        this.C = 0L;
        this.D = 0L;
        this.E = 0;
        this.F = 0;
        this.G = 0;
        this.f470p1 = 0;
        this.q1 = "none";
        this.f458J = -1;
        this.S = false;
        this.T = 0;
        this.W = 0L;
        this.V = 0;
        this.b0 = 0;
        this.c0 = 0;
        this.d0 = 0;
        this.i1 = -1.0f;
        this.g1 = 0;
        this.j1 = 0L;
        this.k1 = 0;
        this.m7 = 0;
        this.n7 = 0;
        this.o7 = -1L;
        this.f0 = null;
        this.g0 = null;
        this.f464h0 = null;
        this.f465i0 = null;
        this.j0 = null;
        this.f466k0 = null;
        this.l0 = null;
        this.m0 = null;
        this.n0 = null;
        this.f469o0 = null;
        this.p0 = null;
        this.q0 = null;
        this.r0 = null;
        this.s0 = null;
        this.t0 = null;
        this.u0 = null;
        this.v0 = null;
        this.D0 = null;
        this.E0 = null;
        this.C0 = null;
        this.w0 = null;
        this.x0 = null;
        this.y0 = null;
        this.z0 = -1L;
        this.LLLLLLLZIL = "none";
        this.A0 = "none";
        this.B0 = "none";
        this.H0 = "none";
        this.G0 = "none";
        this.F0 = null;
        this.P0 = -1;
        this.Q0 = 0L;
        this.R0 = 0L;
        this.S0 = -1;
        this.T0 = 0L;
        this.U0 = 0L;
        this.w1 = null;
        C1698490uIh c1698490uIh = this.LLILLL;
        if (c1698490uIh != null) {
            c1698490uIh.LIZ = 0L;
            c1698490uIh.LIZIZ = 0L;
            c1698490uIh.LIZJ = 0L;
            c1698490uIh.LIZLLL = 0L;
            c1698490uIh.LJ = 0L;
            c1698490uIh.LJFF = 0L;
            c1698490uIh.LJI = 0L;
            c1698490uIh.LJIIL = 0L;
            c1698490uIh.LJIILIIL = 0L;
            c1698490uIh.LJIILJJIL = 0L;
            c1698490uIh.LJIILL = 0L;
            c1698490uIh.LJIILLIIL = 0L;
            c1698490uIh.LJIJI = 0L;
            c1698490uIh.LJIJJ = 0L;
            c1698490uIh.LJIJJLI = 0L;
            c1698490uIh.LJIL = 0L;
            c1698490uIh.LJJ = 0L;
            c1698490uIh.LJJI = 0L;
            c1698490uIh.LJLJLJ = 0L;
            c1698490uIh.LJLJLLL = 0L;
            c1698490uIh.LJLL = 0L;
            c1698490uIh.LJLLI = 0L;
            c1698490uIh.LJLLILLLL = -1;
            c1698490uIh.LJLLJ = 0L;
            c1698490uIh.LJLLL = 0L;
            c1698490uIh.LJLZ = 0.0f;
            c1698490uIh.LJZ = 0.0f;
            c1698490uIh.LJZI = 0;
            c1698490uIh.LJJIFFI = 0L;
            c1698490uIh.LJJIZ = -1;
            c1698490uIh.LJJJ = -1;
            c1698490uIh.LJJJI = -1;
            c1698490uIh.LLIZ = -1;
            c1698490uIh.LLIZLLLIL = -1;
            c1698490uIh.LJJII = -1L;
            c1698490uIh.LJJIII = -1L;
            c1698490uIh.LJJIIJ = -1L;
            c1698490uIh.LJJIIJZLJL = -1L;
            c1698490uIh.LJJIJ = -1L;
            c1698490uIh.LJJIJIIJI = -1L;
            c1698490uIh.LJJIJIIJIL = -1L;
            c1698490uIh.LJJIJIL = -1L;
            c1698490uIh.LJJIJL = -1;
            c1698490uIh.LLJ = -1;
            c1698490uIh.LJJIIZ = -1L;
            c1698490uIh.LJJIIZI = -1L;
            c1698490uIh.LLLF = -1;
            c1698490uIh.LJJIJLIJ = 0L;
            c1698490uIh.LJJIL = 0L;
            c1698490uIh.LLJJIJIIJIL = -1;
            c1698490uIh.LLJJIJIL = -1;
            c1698490uIh.LLJJJ = -1;
            c1698490uIh.LLJJJIL = -1;
            c1698490uIh.LLJJJJ = -1;
            c1698490uIh.LLJJJJJIL = "";
            c1698490uIh.LLJJL = 1;
            c1698490uIh.LJII = 0L;
            c1698490uIh.LJIIIIZZ = 0L;
            c1698490uIh.LJIIJ = 0L;
            c1698490uIh.LJIIJJI = 0L;
            c1698490uIh.LLJILLL = 0;
            c1698490uIh.LLJJ = "";
            c1698490uIh.LLJJI = "";
            c1698490uIh.LLJJIII = 0L;
            c1698490uIh.LLJJIJI = "";
            c1698490uIh.LJJJIL = 0L;
            c1698490uIh.LJJJJ = 0L;
            c1698490uIh.LJJJJI = 0L;
            c1698490uIh.LJJZ = 0.0f;
            c1698490uIh.LJLIIL = 0L;
            c1698490uIh.LJLIL = 0L;
            c1698490uIh.LJLJI = 0L;
            c1698490uIh.LJLJJI = 0L;
            c1698490uIh.LJLJJL = 0L;
            c1698490uIh.LJLJJLL = 0L;
            c1698490uIh.LJLJL = 0L;
            c1698490uIh.LJIIZILJ = 0L;
            c1698490uIh.LJIJ = 0L;
            c1698490uIh.LLFF = -1;
            c1698490uIh.LLFFF = -1;
            c1698490uIh.LLLLLLZZ = -1;
            c1698490uIh.LLLLLZ = -1;
            c1698490uIh.LLLLLZIL = -1;
            c1698490uIh.LLLLLZL = -1;
            c1698490uIh.LLLLZ = -1;
            c1698490uIh.LJJLIIIJL = 0L;
            c1698490uIh.LJJLIIIJLJLI = 0L;
            c1698490uIh.LJJLJLI = 0L;
            c1698490uIh.LLIIJLIL = "none";
            c1698490uIh.LJLLLL = 0L;
            c1698490uIh.LJZL = 0L;
            c1698490uIh.LL = 0L;
            c1698490uIh.LLD = "none";
            c1698490uIh.LLF = 0;
            c1698490uIh.LLL = null;
            c1698490uIh.LJJJJZI = -1L;
            c1698490uIh.LJJJLIIL = -1L;
            c1698490uIh.LJJJLL = 0L;
            c1698490uIh.LJJJLZIJ = 0L;
            c1698490uIh.LJJJZ = 0L;
            c1698490uIh.LJJL = "";
            c1698490uIh.LJJLI = "";
            c1698490uIh.LJJLIIIIJ = "";
            c1698490uIh.LJJLIIIJ = "";
            c1698490uIh.LJJLIIIJILLIZJL = "";
            c1698490uIh.LJJLIIIJJI = 0L;
            c1698490uIh.LJJLIIIJJIZ = 0;
            c1698490uIh.LJJJJIZL = 0L;
            c1698490uIh.LLLFF = 0;
            c1698490uIh.LLIIZ = "0.0.0.0";
            c1698490uIh.LLIL = "";
            c1698490uIh.LLILIL = "";
            c1698490uIh.LLILL = "";
            c1698490uIh.LLILII = -1;
            c1698490uIh.LLILLIZIL = -1;
            c1698490uIh.LLILLL = 0;
            c1698490uIh.LLILZ = 0;
            c1698490uIh.LLILLJJLI = 0;
            c1698490uIh.LLJZ = "";
            c1698490uIh.LLJZIJLIL = "";
            c1698490uIh.LLLFFI = 0L;
            c1698490uIh.LLLFZ = 0L;
            c1698490uIh.LLLI = 0L;
            c1698490uIh.LLLII = 0L;
            c1698490uIh.LLLIIII = 0L;
            c1698490uIh.LLLIIIIL = 0L;
            c1698490uIh.LLLIIIL = 0L;
            c1698490uIh.LLLIILIL = 0L;
            c1698490uIh.LLLIL = 0L;
            c1698490uIh.LLLIIL = 0L;
            c1698490uIh.LLLILZ = 0L;
            c1698490uIh.LLLILZJ = 0L;
            c1698490uIh.LLLILZLLLI = 0L;
            c1698490uIh.LLLIZZ = 0L;
            c1698490uIh.LLLJ = 0L;
            c1698490uIh.LLLJIL = 0L;
            c1698490uIh.LLLJL = 0L;
            c1698490uIh.LLLL = 0L;
            c1698490uIh.LLLLII = 0L;
            c1698490uIh.LLLLIIIILLL = 0L;
            c1698490uIh.LLLLIIL = 0L;
            c1698490uIh.LLLLIILL = 0L;
            c1698490uIh.LLLLIILLL = 0L;
            c1698490uIh.LLLLIL = "";
            c1698490uIh.LLLLILI = -1L;
            c1698490uIh.LJJJJJ = "none";
            c1698490uIh.LJJJJJL = "none";
            c1698490uIh.LJJJJL = -1L;
            c1698490uIh.LJJJJLI = "";
            c1698490uIh.LJL = 0L;
            c1698490uIh.LLLLJ = 0;
            c1698490uIh.LLLLJI = 0;
            c1698490uIh.LLLLL = 0;
            c1698490uIh.LLLLLIL = 0;
            c1698490uIh.LLLLLILLIL = 0;
            c1698490uIh.LLLLLJIL = 0;
            c1698490uIh.LLLLLJLJLL = 0;
            c1698490uIh.LLLLLL = 0;
            c1698490uIh.LLLLLLIL = 0;
            c1698490uIh.LLLLLLJ = 0;
            c1698490uIh.LLLLLLLLL = 0;
            c1698490uIh.LLLLLLL = 0;
            c1698490uIh.LLLLLLLLLL = "";
            c1698490uIh.LLJJJJLIIL = "";
            c1698490uIh.LLLLZLL = 0L;
            c1698490uIh.LLLLZLLIL = 0L;
            c1698490uIh.LLLLZLLLI = 0L;
            c1698490uIh.LLLZ = 0L;
            c1698490uIh.LLLZI = 0L;
            c1698490uIh.LLLZL = -1L;
            c1698490uIh.LLLLLLLZIL = "";
            c1698490uIh.LLLLLLZ = "";
            c1698490uIh.LLLZLL = -1;
            c1698490uIh.LLLZLZ = false;
            c1698490uIh.LLLZZ = 0;
            c1698490uIh.LLLZZIL = 0;
            c1698490uIh.LLZ = 0;
            c1698490uIh.LLZILL = null;
            c1698490uIh.LLZL = -1;
        }
        this.LLJILJILJ = -1L;
        C1698790uJB c1698790uJB = this.e7;
        if (c1698790uJB != null) {
            c1698790uJB.LIZ();
        }
        C1698980uJU c1698980uJU = this.g7;
        if (c1698980uJU != null) {
            c1698980uJU.LIZ = -1L;
            c1698980uJU.LIZIZ = -1L;
            c1698980uJU.LIZJ = 0;
            c1698980uJU.LIZLLL = 0;
        }
        this.LLLIZZ = "none";
        this.LLLJ = "none";
        this.LLLILZJ = "none";
        this.LLLJIL = 0;
        this.LLLLZIL = "none";
        this.LLLLZLLIL = "none";
        this.LLLLZLL = null;
        this.LLLLZLLLI = "none";
        this.B1 = "none";
        this.C1 = "none";
        this.D1 = "none";
        this.LLLZI = "";
        this.LLLZIIL = 0;
        this.LLLZIL = 2L;
        this.LLLZL = 3000L;
        this.x1 = 0;
        this.f462a3 = 0L;
        this.Z2 = 0L;
        this.b3 = 0L;
        this.c3 = 0L;
        this.e3 = 0L;
        this.f3 = 0L;
        this.g3 = 0L;
        this.h3 = 0L;
        this.i3 = 0L;
        this.d3 = 0L;
        this.j3 = 0L;
        this.O5 = 0L;
        this.P5 = 0L;
        this.N5 = 0L;
        this.Q5 = 0L;
        this.R5 = 0L;
        LJJZZI();
        LJL();
        this.E1 = false;
        this.F1 = "origin";
        this.J1 = "origin";
        this.K1 = "none";
        this.M1 = -1;
        this.F6 = -1;
        this.L1 = -1L;
        this.N1 = 0;
        this.O1 = "none";
        this.W2 = "none";
        this.S2 = -1L;
        this.T2 = -1L;
        this.U2 = -1L;
        this.V2 = -1L;
        this.M3 = 0;
        this.P1 = false;
        this.Q1 = -1L;
        this.R1 = -1L;
        this.Y1 = -1;
        this.Z1 = 0;
        this.t2 = "none";
        this.y2 = -1L;
        this.z2 = 0L;
        this.A2 = 0L;
        this.B2 = 0L;
        this.C2 = "";
        this.D2 = "";
        this.E2 = "";
        this.F2 = 0L;
        this.G2 = 0L;
        this.H2 = 0L;
        this.I2 = 0L;
        this.J2 = 0L;
        this.K2 = 0L;
        this.L2 = 0L;
        this.M2 = 0L;
        this.N2 = 0L;
        this.O2 = 0L;
        this.P2 = 0L;
        this.Q2 = 0L;
        this.R2 = 0L;
        this.r3 = -1;
        this.f467m3 = 0;
        this.n3 = 0L;
        this.o3 = 0L;
        this.p3 = -1L;
        this.n5 = 0;
        this.o5 = "none";
        this.LLLLLZL = 0;
        this.LLLLZ = -1;
        this.LLLLZI = -1.0f;
        this.F3 = 0L;
        this.H3 = 0L;
        this.G3 = 0L;
        this.N3 = "none";
        this.R3 = 0;
        this.T3 = 0L;
        this.U3 = 0L;
        this.V3 = 0L;
        this.W3 = 0L;
        this.X3 = 0L;
        this.Y3 = 0L;
        this.Z3 = 0L;
        this.a4 = 0L;
        this.Q6 = 0L;
        this.R6 = 0L;
        this.S6 = 0L;
        this.T6 = 0L;
        this.N4 = 0;
        this.O4 = 0;
        this.P4 = 0L;
        this.Q4 = 0L;
        this.U4 = "";
        this.T4 = "";
        this.f460X = 0;
        this.f461Y = 0;
        this.Z = 0;
        this.a0 = 1;
        this.S5 = 0L;
        this.m4 = 0;
        this.p4 = "none";
        this.q4 = "none";
        this.T5 = "none";
        this.r4 = "none";
        this.s4 = -1L;
        this.t4 = null;
        this.f473u4 = "";
        this.v4 = "";
        if (LJJIJIIJI()) {
            this.X6.LJIIJ();
            C1698660uIy c1698660uIy = this.Y6;
            ((ArrayList) c1698660uIy.LIZ).clear();
            c1698660uIy.LIZIZ = false;
        }
        this.W4 = false;
        this.X4 = false;
        this.Y4 = false;
        this.Z4 = false;
        this.a5 = false;
        this.b5 = false;
        this.d5 = -1;
        this.e5 = -1;
        this.f5 = -1L;
        this.g5 = false;
        this.c5 = -1;
        if (C1481110oe5.LIZ) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("resetPrePullMode, videoLiveManagerHash: ");
            sbLIZ.append(this.LLILZ.P0);
            C1481110oe5.LIZIZ("TTKLivePlayer2", C2188811AlT.LIZIZ(sbLIZ));
        }
        this.i5 = 0;
        this.LLZLLLL = 0L;
        this.LLZZ = 0L;
        this.LLZZJLIL = 0L;
        this.LLZZLLIL = 0L;
        this.LLZZZIL = 0L;
        this.LLZZZZ = 0L;
        this.b = 0L;
        this.a = 0;
        this.d = 0L;
        this.c = 0;
        this.e = 0;
        this.f = 0L;
        this.b4 = 0L;
        this.c4 = 0L;
        this.d4 = 0L;
        this.e4 = 0L;
        this.f4 = 0L;
        this.g4 = 0L;
        this.h4 = 0L;
        this.i4 = 0L;
        this.j4 = 0L;
        this.k4 = 0L;
        this.l4 = 0L;
        this.m5 = "none";
        this.w5 = 0;
        this.x5 = "none";
        this.y5 = "none";
        this.v1 = -1;
        this.A5 = 0;
        this.C5 = null;
        this.D5 = null;
        this.E5 = null;
        this.F5 = null;
        this.G5 = null;
        this.H5 = null;
        this.I5 = null;
        this.J5 = -1L;
        this.w3 = 0;
        this.x3 = 0;
        this.y3 = 0;
        this.z3 = 0;
        this.K5 = 0;
        this.L5 = -1L;
        this.M5 = -1L;
        this.U5 = 0;
        this.Z5 = 0;
        this.a6 = 0;
        this.b6 = 0;
        this.I3 = 0;
        this.LLLJL = -1L;
        this.h6 = -1;
        this.i6 = -1L;
        this.j6 = -1L;
        this.c6 = -1.0f;
        this.LLLL = -1L;
        this.d6 = "none";
        this.i7 = 0;
        this.j7 = 0;
        this.y1 = 1;
        this.A4 = 0;
        this.z4 = 0;
        this.B4 = "";
        this.C4 = "";
        this.E4 = "";
        this.F4 = "";
        this.G4 = "";
        this.H4 = "";
        this.I4 = "";
        this.J4 = "";
        this.K4 = "";
        this.r5 = -1;
        this.I6 = -1;
        this.J6 = -1;
        this.p5 = 0;
        this.q5 = 0;
        this.s5 = 0;
        this.f472t5 = 0;
        this.u5 = 0;
        this.v5 = "none";
        this.Y0.clear();
        this.Z0.clear();
        this.a1.clear();
        C1279580jP2 c1279580jP2 = this.l7;
        if (c1279580jP2 != null) {
            c1279580jP2.LIZ = 0L;
            c1279580jP2.LIZIZ = 0;
            c1279580jP2.LIZJ = 0;
            c1279580jP2.LIZLLL = 0L;
            HashMap<String, Long> map = c1279580jP2.LJ;
            if (map != null) {
                map.clear();
            }
            HashMap<String, Long> map2 = c1279580jP2.LJFF;
            if (map2 != null) {
                map2.clear();
            }
        }
        C1698920uJO c1698920uJO = this.V4;
        if (c1698920uJO != null) {
            Iterator<Integer> it2 = c1698920uJO.LIZ.keySet().iterator();
            while (it2.hasNext()) {
                C1698970uJT c1698970uJT = c1698920uJO.LIZ.get(Integer.valueOf(it2.next().intValue()));
                if (c1698970uJT != null) {
                    c1698970uJT.LIZ = 0L;
                    c1698970uJT.LIZIZ = 0L;
                }
            }
        }
        this.U6 = new JSONArray();
        this.V6 = 0;
        this.W6 = new JSONArray();
        this.Z6 = 0L;
        this.a7 = 0L;
        this.b7 = 0L;
        this.LLLI = true;
        C1279650jP9 c1279650jP9 = this.LLLFZ;
        if (c1279650jP9 != null) {
            c1279650jP9.LIZ = null;
            c1279650jP9.LIZLLL = false;
            c1279650jP9.LIZIZ = 0L;
            c1279650jP9.LIZJ = 0L;
        }
        this.d7 = new JSONObject();
    }

    public final void LJJZZI() {
        this.q2 = "none";
        this.u2 = "none";
        this.k2 = 0;
        this.l2 = -1;
        this.m2 = "none";
        this.f468n2 = "none";
        this.o2 = -1;
        this.f471p2 = 0;
        this.r2 = new ArrayList<>();
        this.s2 = "none";
    }

    public final void LJL() {
        this.b2 = EnumC1486270omP.STARTUP_EXEC_TYPE_NONE.ordinal();
        this.c2 = -1;
        this.d2 = "{\"return_location\": \"noRun\"}";
        this.e2 = new ArrayList<>();
        this.f2 = -1;
        this.g2 = -1;
        this.h2 = "none";
        this.i2 = "none";
        this.j2 = -1;
    }

    public final void LJLIIIL() {
        MyNTPTask myNTPTask;
        if (this.LLIZLLLIL) {
            return;
        }
        C786410Ut5.LJLJJI(101, this.LLILZLL, this.LL);
        long j = this.LLIZ;
        if (j > 0) {
            C786410Ut5.LJLJJI(105, j, this.LL);
        }
        if (this.c1) {
            C786410Ut5.LJLJJI(102, this.d1, this.LL);
        }
        if (this.V == 1 && !this.U && (myNTPTask = this.R) != null) {
            myNTPTask.LIZ(103);
            this.U = true;
        }
        C1279580jP2 c1279580jP2 = this.l7;
        if (c1279580jP2 != null) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            c1279580jP2.LIZ = jCurrentTimeMillis;
            c1279580jP2.LIZLLL = jCurrentTimeMillis;
        }
        LJLIIL();
        this.LLIZLLLIL = true;
        C1698550uIn c1698550uIn = this.f7;
        c1698550uIn.getClass();
        long jCurrentTimeMillis2 = System.currentTimeMillis();
        c1698550uIn.LJFF = jCurrentTimeMillis2;
        c1698550uIn.LJI = jCurrentTimeMillis2;
        if (c1698550uIn.LJIIIZ.LJJIJIIJI()) {
            c1698550uIn.LJIIIZ.X6.LJIIJ();
            LiveLoggerService liveLoggerService = c1698550uIn.LJIIIZ;
            C1698570uIp c1698570uIp = liveLoggerService.X6;
            boolean z = liveLoggerService.W4;
            boolean z2 = liveLoggerService.X4;
            c1698570uIp.LJIIJ();
            c1698570uIp.LJIILJJIL = true;
            c1698570uIp.LJIIL = z;
            c1698570uIp.LJIILIIL = z2;
            if (z) {
                c1698570uIp.LJIIIIZZ = jCurrentTimeMillis2;
            }
            if (z2) {
                c1698570uIp.LJIIIZ = jCurrentTimeMillis2;
            }
            c1698570uIp.LJIIJ = jCurrentTimeMillis2;
            c1698570uIp.LJIIJJI = jCurrentTimeMillis2;
            C1698660uIy c1698660uIy = c1698550uIn.LJIIIZ.Y6;
            ((ArrayList) c1698660uIy.LIZ).clear();
            c1698660uIy.LIZIZ = false;
        }
    }

    public final void LJLIIL() {
        this.K0.lock();
        boolean z = ((Boolean) C1474810oTv.J1.getValue()).booleanValue() && this.Y4;
        if (this.X4 != z) {
            C1698550uIn c1698550uIn = this.f7;
            c1698550uIn.LJIIIZ.K0.lock();
            long jCurrentTimeMillis = System.currentTimeMillis();
            try {
                if (z) {
                    if (c1698550uIn.LJIIIZ.LJJIJIIJI()) {
                        c1698550uIn.LJIIIZ.LJIIIZ(1);
                    }
                    c1698550uIn.LIZ(1);
                    if (c1698550uIn.LJIIIZ.LJJIJIIJI()) {
                        C1698570uIp c1698570uIp = c1698550uIn.LJIIIZ.X6;
                        c1698570uIp.LJI(jCurrentTimeMillis);
                        c1698570uIp.LJIILIIL = true;
                        if (c1698570uIp.LJIIIZ < 0) {
                            c1698570uIp.LJIIIZ = jCurrentTimeMillis;
                        }
                    }
                } else {
                    c1698550uIn.LJI = jCurrentTimeMillis;
                    VideoLiveManager videoLiveManager = c1698550uIn.LIZLLL;
                    if (videoLiveManager != null) {
                        videoLiveManager.LLLJ(1);
                    }
                    if (c1698550uIn.LJIIIZ.LJJIJIIJI()) {
                        C1698570uIp c1698570uIp2 = c1698550uIn.LJIIIZ.X6;
                        long j = c1698570uIp2.LJIIIZ;
                        if (j >= 0) {
                            ((ArrayList) c1698570uIp2.LJI).add(new C1699010uJX(j, Math.max(jCurrentTimeMillis, j)));
                        }
                        c1698570uIp2.LJIIIZ = -1L;
                        c1698570uIp2.LJIILIIL = false;
                    }
                }
                c1698550uIn.LJIIIZ.K0.unlock();
                this.X4 = z;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                c1698550uIn.LJIIIZ.K0.unlock();
                throw th;
            }
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("audio-abnormal update abnormal is ");
        sbLIZ.append(this.X4);
        C2188811AlT.LIZIZ(sbLIZ);
        C1698940uJQ.LIZJ();
        this.K0.unlock();
    }

    public final void LJLIL() {
        C1698640uIw c1698640uIw = this.k7;
        if (c1698640uIw != null) {
            c1698640uIw.LIZIZ = true;
        }
    }

    public final void LJLILLLLZI() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("PLAY-StartTs", this.LLILLL.LIZ).put("PLAY-TcpConnectEnd", this.LLILLL.LJI).put("PLAY-TcpFirstPacketEnd", this.LLILLL.LJIIL).put("PLAY-FirstVideoPacketEnd", this.LLILLL.LJIILIIL).put("PLAY-FirstVideoFrameDecodeEnd", this.LLILLL.LJIILL).put("PLAY-FirstFrameEnd", this.LLLZZ);
            jSONObject.put("PLAY-HostName", this.x5);
            jSONObject.put("PLAY-SessionID", C1474810oTv.LJLJLLL() ? this.LLILZIL.LIZIZ : this.LLLLZLLLI);
            jSONObject.put("stallTotalCount", (int) this.LLZLL);
            jSONObject.put("retryTotalCount", this.G);
            jSONObject.put("firstFrameDownloadSpeed", this.LLILLL.LJLJLJ);
            jSONObject.put("nqeInfo", this.D1);
            jSONObject.put("domain", this.x5);
            jSONObject.put("playTime", this.LLLZZ != 0 ? System.currentTimeMillis() - this.LLLZZ : 0L);
            jSONObject.put("cdnIp", this.LLJJIJIL);
            jSONObject.put("errorCode", this.LLZ);
            jSONObject.put("hasFirstFrame", this.LLLZLZ);
            jSONObject.put("PLAY-EndTs", System.currentTimeMillis());
            jSONObject.put("ipFromPlayerCore", this.LLJJJ);
            jSONObject.put("downloadSpeed", this.LLILLL.LJJZZI);
            C787360Uuc c787360Uuc = this.z6;
            if (c787360Uuc != null) {
                float f = this.E6 - this.D6;
                int i = c787360Uuc.LJI;
                int i2 = c787360Uuc.LJII;
                if (i != Integer.MAX_VALUE) {
                    float f2 = i - i2;
                    float f3 = (f - i2) / f2;
                    float f4 = (r4 - i2) / f2;
                    jSONObject.put("volume_setting", f4);
                    jSONObject.put("volume_change", f3);
                    jSONObject.put("volume_label", f3 == 0.0f ? (this.C6 == 0 && this.B6 == 0) ? 0 : 1 : f3 > 0.0f ? 2 : f3 < 0.0f ? 3 : -1);
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("get current volume change is ");
                    sbLIZ.append(f3);
                    sbLIZ.append(" volume level is ");
                    sbLIZ.append(f4);
                    sbLIZ.append(" max voluem is ");
                    sbLIZ.append(i);
                    sbLIZ.append(" current volume is ");
                    sbLIZ.append(this.E6);
                    C2188811AlT.LIZIZ(sbLIZ);
                    C1698940uJQ.LIZJ();
                }
            }
            if (!TextUtils.isEmpty(this.LLILZ.LLIIL)) {
                jSONObject.put("live_unique_id", this.LLILZ.LLIIL);
            }
            this.LLILZ.LLILZIL(jSONObject);
            LJIJJLI().businessEvent(63, jSONObject);
        } catch (JSONException e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    public final void LJLJJLL() {
        C1698490uIh c1698490uIh;
        VideoLiveManager videoLiveManager = this.LLILZ;
        if (videoLiveManager == null || (c1698490uIh = this.LLILLL) == null) {
            return;
        }
        videoLiveManager.LLFZ(c1698490uIh, 3, false);
        if (this.f0 == null) {
            this.f0 = new ArrayList<>();
            this.n0 = new ArrayList<>();
            this.f469o0 = new ArrayList<>();
            this.p0 = new ArrayList<>();
            this.q0 = new ArrayList<>();
            this.r0 = new ArrayList<>();
            this.s0 = new ArrayList<>();
            this.t0 = new ArrayList<>();
            this.u0 = new ArrayList<>();
            this.g0 = new ArrayList<>();
            this.f464h0 = new ArrayList<>();
            this.f465i0 = new ArrayList<>();
            this.j0 = new ArrayList<>();
            this.f466k0 = new ArrayList<>();
            this.l0 = new ArrayList<>();
            this.m0 = new ArrayList<>();
        }
        C1698490uIh c1698490uIh2 = this.LLILLL;
        if (c1698490uIh2.LJJZZIII == 0 && this.m4 == 1 && !TextUtils.isEmpty(c1698490uIh2.LLJZ)) {
            try {
                JSONObject jSONObjectOptJSONObject = new JSONObject(this.LLILLL.LLJZ).optJSONObject("NetInfo");
                if (jSONObjectOptJSONObject != null) {
                    new JSONObject();
                    long jOptLong = (jSONObjectOptJSONObject.optLong("cctk_bw") * 8) / 1000;
                    C1698490uIh c1698490uIh3 = this.LLILLL;
                    c1698490uIh3.LJJZZIII = Math.max(jOptLong, c1698490uIh3.LJL);
                }
            } catch (JSONException e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        if (this.v0 == null) {
            ArrayList<Integer> arrayList = new ArrayList<>();
            this.v0 = arrayList;
            C1698490uIh c1698490uIh4 = this.LLILLL;
            long j = c1698490uIh4.LJJZZIII;
            if (j == 0) {
                j = c1698490uIh4.LJL;
            }
            arrayList.add(Integer.valueOf((int) j));
            this.v0.add(Integer.valueOf(this.f2));
            this.v0.add(Integer.valueOf(this.LLILLL.LJLIIIL));
        }
        this.f0.add(Long.valueOf((long) this.LLILLL.LJJZ));
        this.n0.add(Long.valueOf(this.LLILLL.LJLIL));
        this.f469o0.add(Long.valueOf(this.LLILLL.LJLIIL));
        this.p0.add(Long.valueOf(this.LLILLL.LJLJI));
        this.q0.add(Long.valueOf(this.LLILLL.LJLJJI));
        this.r0.add(Long.valueOf(this.LLILLL.LJLJJL));
        this.s0.add(Long.valueOf(this.LLILLL.LJLJJLL));
        this.t0.add(Integer.valueOf(this.LLILLL.LLLLJ));
        this.u0.add(Long.valueOf(this.LLILLL.LJLJL));
        ArrayList<Long> arrayList2 = this.g0;
        C1698490uIh c1698490uIh5 = this.LLILLL;
        long j2 = c1698490uIh5.LJJZZIII;
        if (j2 == 0) {
            j2 = c1698490uIh5.LJL;
        }
        arrayList2.add(Long.valueOf(j2));
        this.f464h0.add(this.LLILZ.LLILLJJLI());
        this.f465i0.add(Integer.valueOf(this.l));
        this.j0.add(Integer.valueOf(this.m));
        this.f466k0.add(Long.valueOf(this.K2));
        this.l0.add(Integer.valueOf(this.LLILLL.LJLIIIL));
        this.m0.add(Integer.valueOf(this.F6 / LSPassThroughRecordSizeConfig.DEFAULT));
        this.l = 0;
        this.m = 0;
        if (this.I0) {
            if (this.E0 == null) {
                this.E0 = new ArrayList<>();
                this.D0 = new ArrayList<>();
            }
            this.E0.add(Integer.valueOf(this.LLILLL.LLFFF));
            this.D0.add(Integer.valueOf(this.LLILLL.LLFF));
        }
    }

    public final void LJLJL() {
        this.K0.lock();
        boolean z = this.Z4 || this.a5 || this.b5 || this.d5 == 0;
        if (C1474810oTv.LJJJLL()) {
            z = z || this.c5 == 1;
            if (C1481110oe5.LIZ) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("updateVideoAbnormal filter parallel stream pulling: ");
                sbLIZ.append(this.c5);
                sbLIZ.append(", videoAbnormal: ");
                sbLIZ.append(z);
                sbLIZ.append("videoLiveManagerHash: ");
                sbLIZ.append(this.LLILZ.P0);
                C1481110oe5.LIZIZ("TTKLivePlayer2", C2188811AlT.LIZIZ(sbLIZ));
            }
        }
        if (this.W4 != z) {
            C1698550uIn c1698550uIn = this.f7;
            c1698550uIn.LJIIIZ.K0.lock();
            long jCurrentTimeMillis = System.currentTimeMillis();
            try {
                if (z) {
                    if (c1698550uIn.LJIIIZ.LJJIJIIJI()) {
                        c1698550uIn.LJIIIZ.LJIIIZ(0);
                    }
                    c1698550uIn.LIZ(0);
                    if (c1698550uIn.LJIIIZ.LJJIJIIJI()) {
                        C1698570uIp c1698570uIp = c1698550uIn.LJIIIZ.X6;
                        c1698570uIp.LJII(jCurrentTimeMillis);
                        c1698570uIp.LJIIL = true;
                        if (c1698570uIp.LJIIIIZZ < 0) {
                            c1698570uIp.LJIIIIZZ = jCurrentTimeMillis;
                        }
                    }
                } else {
                    c1698550uIn.LJFF = jCurrentTimeMillis;
                    c1698550uIn.LIZLLL.LLLJ(0);
                    if (c1698550uIn.LJIIIZ.LJJIJIIJI()) {
                        C1698570uIp c1698570uIp2 = c1698550uIn.LJIIIZ.X6;
                        long j = c1698570uIp2.LJIIIIZZ;
                        if (j >= 0) {
                            ((ArrayList) c1698570uIp2.LJFF).add(new C1699010uJX(j, Math.max(jCurrentTimeMillis, j)));
                        }
                        c1698570uIp2.LJIIIIZZ = -1L;
                        c1698570uIp2.LJIIL = false;
                    }
                }
                c1698550uIn.LJIIIZ.K0.unlock();
                this.W4 = z;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                c1698550uIn.LJIIIZ.K0.unlock();
                throw th;
            }
        }
        this.K0.unlock();
    }

    public static int LJJIJ() throws Throwable {
        if (!C1699230uJt.LIZ()) {
            return 0;
        }
        C1699230uJt.LIZ();
        String str = C1699230uJt.LIZIZ;
        if ("L1".equals(str)) {
            return 1;
        }
        if ("L3".equals(str)) {
            return 3;
        }
        return "L2".equals(str) ? 2 : 0;
    }

    public final JSONObject LIZ() {
        LJLJJLL();
        boolean z = (this.y4 == 1 && "none".equals(this.B0) && "none".equals(this.A0)) ? false : this.w4 == 1;
        try {
            JSONObject jSONObjectPut = new JSONObject().put("start_time", this.LLILLL.LIZ).put("duration", System.currentTimeMillis() - this.LLILLL.LIZ).put("render_fps_series", new JSONArray((Collection) this.f0)).put("bandwidth_series", new JSONArray((Collection) this.g0)).put("resolution_series", new JSONArray((Collection) this.f464h0)).put("stall_flag_series", new JSONArray((Collection) this.f465i0)).put("abr_switch_index_series", new JSONArray((Collection) this.f466k0)).put("real_bitrate_series", new JSONArray((Collection) this.l0)).put("play_buffer_series", new JSONArray((Collection) this.n0)).put("speed_switch_series", this.LLLLLLLZIL).put("video_stall_series", this.B0).put("audio_stall_series", this.A0).put("push_bitrate_series", this.D0 == null ? new JSONArray() : new JSONArray((Collection) this.D0)).put("push_fps_series", this.E0 == null ? new JSONArray() : new JSONArray((Collection) this.E0)).put("stall_series", this.w0 == null ? new JSONArray() : new JSONArray((Collection) this.w0));
            JSONObject jSONObject = this.C0;
            if (jSONObject == null) {
                jSONObject = new JSONObject();
            }
            JSONObject jSONObjectPut2 = jSONObjectPut.put("error_series", jSONObject).put("push_stall_series", this.F0 == null ? new JSONArray() : new JSONArray((Collection) this.F0)).put("push_video_stall_series", this.H0).put("push_audio_stall_series", this.G0).put("use_bitrate_series", new JSONArray((Collection) this.m0)).put("cmaf_temporal_series", this.v4);
            if (z) {
                jSONObjectPut2.put("video_frame_series", this.B4);
                jSONObjectPut2.put("audio_frame_series", this.C4);
            }
            if (this.P1) {
                jSONObjectPut2.put("switch_flag_series", new JSONArray((Collection) this.j0));
            }
            if (this.z4 == 1) {
                jSONObjectPut2.put("video_formater_series", this.E4);
                jSONObjectPut2.put("audio_formater_series", this.F4);
                jSONObjectPut2.put("video_decoder_in_series", this.G4);
                jSONObjectPut2.put("audio_decoder_in_series", this.H4);
                jSONObjectPut2.put("video_decoder_out_series", this.I4);
                jSONObjectPut2.put("audio_decoder_out_series", this.J4);
            }
            if (this.A4 != 1) {
                return jSONObjectPut2;
            }
            jSONObjectPut2.put("pkt_frame_info_series", this.K4);
            return jSONObjectPut2;
        } catch (JSONException e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }

    public final void LJJZZIII() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        C1698490uIh c1698490uIh = this.LLILLL;
        long j = c1698490uIh.LLIFFJFJJ;
        if (j <= 0 || jCurrentTimeMillis - j <= Mp4ScreenVideoLoadTimeout.CONTROL) {
            return;
        }
        c1698490uIh.LLFII = -1;
        c1698490uIh.LLF = -1;
        c1698490uIh.getClass();
        this.LLILLL.LLD = "none";
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0297  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0298  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x029e  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x02a6  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x02c2 A[Catch: JSONException -> 0x169e, LOOP:2: B:110:0x02bc->B:112:0x02c2, LOOP_END, TryCatch #0 {JSONException -> 0x169e, blocks: (B:23:0x00ad, B:25:0x00b1, B:27:0x00bc, B:29:0x00c7, B:38:0x00fc, B:40:0x0104, B:42:0x0108, B:43:0x0116, B:45:0x011e, B:46:0x012a, B:48:0x0130, B:50:0x0146, B:51:0x0158, B:53:0x015c, B:55:0x0164, B:56:0x0176, B:58:0x0195, B:63:0x01b2, B:65:0x01c5, B:66:0x01ca, B:68:0x01d2, B:69:0x01d6, B:71:0x01dc, B:72:0x01ea, B:74:0x01fb, B:76:0x020b, B:80:0x024d, B:82:0x0251, B:93:0x026e, B:95:0x0273, B:97:0x0277, B:99:0x0282, B:100:0x028f, B:106:0x02a0, B:109:0x02a8, B:110:0x02bc, B:112:0x02c2, B:113:0x02d1, B:114:0x02e7, B:116:0x02ed, B:117:0x02fb, B:120:0x032c, B:124:0x037d, B:128:0x03c4, B:131:0x06b9, B:135:0x06ca, B:139:0x06f7, B:141:0x09f9, B:142:0x09fb, B:144:0x0a05, B:145:0x0a07, B:147:0x0a11, B:148:0x0a13, B:156:0x0acb, B:160:0x0b3b, B:164:0x0ca9, B:167:0x0d14, B:171:0x0e50, B:173:0x0e70, B:175:0x0e76, B:176:0x0e7f, B:178:0x0e86, B:179:0x0e8b, B:181:0x0e95, B:182:0x0e9e, B:184:0x0ea6, B:186:0x0eaa, B:188:0x0eae, B:198:0x0f26, B:200:0x0f2b, B:208:0x0f5e, B:210:0x0f63, B:212:0x0f7f, B:213:0x0f87, B:215:0x0f8d, B:216:0x0fa1, B:217:0x0faa, B:219:0x0fb9, B:221:0x0fc1, B:223:0x0fd0, B:224:0x0fdb, B:226:0x0fe3, B:227:0x0fee, B:229:0x0ff6, B:230:0x1001, B:232:0x1009, B:233:0x1014, B:235:0x101c, B:236:0x1027, B:238:0x102f, B:239:0x103a, B:241:0x1042, B:242:0x104d, B:244:0x1055, B:245:0x1060, B:247:0x1066, B:248:0x106d, B:250:0x1075, B:251:0x1080, B:253:0x1086, B:254:0x108d, B:256:0x1095, B:257:0x10a0, B:259:0x10a8, B:260:0x10b3, B:262:0x10bb, B:263:0x10c6, B:265:0x10ce, B:266:0x10d9, B:268:0x10e1, B:269:0x10ec, B:271:0x10f2, B:272:0x10f9, B:274:0x1101, B:275:0x110c, B:277:0x1114, B:278:0x111f, B:280:0x1127, B:281:0x1132, B:283:0x1138, B:284:0x113f, B:286:0x1149, B:288:0x114f, B:290:0x115c, B:291:0x1167, B:293:0x116f, B:294:0x117a, B:296:0x1182, B:297:0x118d, B:299:0x1195, B:300:0x11a0, B:302:0x11a8, B:303:0x11b3, B:305:0x11bb, B:306:0x11c6, B:308:0x11ce, B:309:0x11d9, B:311:0x11e1, B:312:0x11ec, B:314:0x11f4, B:315:0x11ff, B:317:0x1207, B:318:0x1212, B:320:0x121a, B:321:0x1225, B:323:0x122d, B:324:0x1238, B:326:0x1240, B:327:0x124b, B:329:0x1253, B:330:0x125e, B:332:0x1266, B:333:0x1271, B:335:0x1279, B:336:0x1284, B:338:0x128c, B:339:0x1297, B:341:0x129f, B:342:0x12aa, B:344:0x12b2, B:345:0x12bd, B:347:0x12c5, B:348:0x12d0, B:350:0x12d8, B:351:0x12e3, B:353:0x12eb, B:354:0x12f6, B:356:0x12fe, B:357:0x1309, B:359:0x1311, B:360:0x131c, B:362:0x1324, B:363:0x132f, B:365:0x1337, B:366:0x1342, B:368:0x134a, B:369:0x1355, B:371:0x135d, B:372:0x1368, B:374:0x1370, B:375:0x137b, B:377:0x137f, B:379:0x1383, B:381:0x138d, B:382:0x1392, B:384:0x1399, B:385:0x139c, B:387:0x13b3, B:388:0x13bb, B:394:0x13d9, B:399:0x13f4, B:401:0x13fb, B:402:0x1400, B:404:0x1404, B:405:0x143f, B:407:0x1445, B:408:0x144a, B:410:0x144f, B:411:0x1454, B:413:0x1458, B:414:0x1463, B:416:0x1467, B:417:0x147c, B:419:0x1495, B:420:0x149e, B:422:0x14a2, B:423:0x14b5, B:425:0x14b9, B:426:0x14d5, B:428:0x14d9, B:429:0x14de, B:431:0x14e2, B:432:0x14e7, B:434:0x14eb, B:435:0x14f1, B:437:0x14f5, B:438:0x1505, B:440:0x1518, B:441:0x151f, B:443:0x1529, B:446:0x153a, B:448:0x153f, B:449:0x155e, B:451:0x1566, B:452:0x158a, B:454:0x1591, B:455:0x1598, B:457:0x159d, B:459:0x15a8, B:465:0x15c2, B:467:0x15ca, B:469:0x15d4, B:470:0x15d6, B:481:0x1678, B:471:0x15d9, B:473:0x1643, B:475:0x1647, B:477:0x164f, B:478:0x1664, B:480:0x166a, B:482:0x167f, B:483:0x1684, B:485:0x1688, B:487:0x168c, B:488:0x168f, B:490:0x1695, B:491:0x169a, B:445:0x1533, B:462:0x15af, B:463:0x15b6, B:391:0x13cf, B:202:0x0f31, B:204:0x0f3c, B:205:0x0f44, B:207:0x0f4a, B:190:0x0eb2, B:191:0x0eec, B:193:0x0ef2, B:194:0x0f00, B:195:0x0f12, B:197:0x0f18, B:168:0x0e42, B:159:0x0b31, B:60:0x01a6, B:28:0x00c3, B:30:0x00cd, B:32:0x00d7, B:34:0x00e5, B:36:0x00f0, B:35:0x00ec), top: B:496:0x00ad }] */
    /* JADX WARN: Removed duplicated region for block: B:116:0x02ed A[Catch: JSONException -> 0x169e, LOOP:3: B:114:0x02e7->B:116:0x02ed, LOOP_END, TryCatch #0 {JSONException -> 0x169e, blocks: (B:23:0x00ad, B:25:0x00b1, B:27:0x00bc, B:29:0x00c7, B:38:0x00fc, B:40:0x0104, B:42:0x0108, B:43:0x0116, B:45:0x011e, B:46:0x012a, B:48:0x0130, B:50:0x0146, B:51:0x0158, B:53:0x015c, B:55:0x0164, B:56:0x0176, B:58:0x0195, B:63:0x01b2, B:65:0x01c5, B:66:0x01ca, B:68:0x01d2, B:69:0x01d6, B:71:0x01dc, B:72:0x01ea, B:74:0x01fb, B:76:0x020b, B:80:0x024d, B:82:0x0251, B:93:0x026e, B:95:0x0273, B:97:0x0277, B:99:0x0282, B:100:0x028f, B:106:0x02a0, B:109:0x02a8, B:110:0x02bc, B:112:0x02c2, B:113:0x02d1, B:114:0x02e7, B:116:0x02ed, B:117:0x02fb, B:120:0x032c, B:124:0x037d, B:128:0x03c4, B:131:0x06b9, B:135:0x06ca, B:139:0x06f7, B:141:0x09f9, B:142:0x09fb, B:144:0x0a05, B:145:0x0a07, B:147:0x0a11, B:148:0x0a13, B:156:0x0acb, B:160:0x0b3b, B:164:0x0ca9, B:167:0x0d14, B:171:0x0e50, B:173:0x0e70, B:175:0x0e76, B:176:0x0e7f, B:178:0x0e86, B:179:0x0e8b, B:181:0x0e95, B:182:0x0e9e, B:184:0x0ea6, B:186:0x0eaa, B:188:0x0eae, B:198:0x0f26, B:200:0x0f2b, B:208:0x0f5e, B:210:0x0f63, B:212:0x0f7f, B:213:0x0f87, B:215:0x0f8d, B:216:0x0fa1, B:217:0x0faa, B:219:0x0fb9, B:221:0x0fc1, B:223:0x0fd0, B:224:0x0fdb, B:226:0x0fe3, B:227:0x0fee, B:229:0x0ff6, B:230:0x1001, B:232:0x1009, B:233:0x1014, B:235:0x101c, B:236:0x1027, B:238:0x102f, B:239:0x103a, B:241:0x1042, B:242:0x104d, B:244:0x1055, B:245:0x1060, B:247:0x1066, B:248:0x106d, B:250:0x1075, B:251:0x1080, B:253:0x1086, B:254:0x108d, B:256:0x1095, B:257:0x10a0, B:259:0x10a8, B:260:0x10b3, B:262:0x10bb, B:263:0x10c6, B:265:0x10ce, B:266:0x10d9, B:268:0x10e1, B:269:0x10ec, B:271:0x10f2, B:272:0x10f9, B:274:0x1101, B:275:0x110c, B:277:0x1114, B:278:0x111f, B:280:0x1127, B:281:0x1132, B:283:0x1138, B:284:0x113f, B:286:0x1149, B:288:0x114f, B:290:0x115c, B:291:0x1167, B:293:0x116f, B:294:0x117a, B:296:0x1182, B:297:0x118d, B:299:0x1195, B:300:0x11a0, B:302:0x11a8, B:303:0x11b3, B:305:0x11bb, B:306:0x11c6, B:308:0x11ce, B:309:0x11d9, B:311:0x11e1, B:312:0x11ec, B:314:0x11f4, B:315:0x11ff, B:317:0x1207, B:318:0x1212, B:320:0x121a, B:321:0x1225, B:323:0x122d, B:324:0x1238, B:326:0x1240, B:327:0x124b, B:329:0x1253, B:330:0x125e, B:332:0x1266, B:333:0x1271, B:335:0x1279, B:336:0x1284, B:338:0x128c, B:339:0x1297, B:341:0x129f, B:342:0x12aa, B:344:0x12b2, B:345:0x12bd, B:347:0x12c5, B:348:0x12d0, B:350:0x12d8, B:351:0x12e3, B:353:0x12eb, B:354:0x12f6, B:356:0x12fe, B:357:0x1309, B:359:0x1311, B:360:0x131c, B:362:0x1324, B:363:0x132f, B:365:0x1337, B:366:0x1342, B:368:0x134a, B:369:0x1355, B:371:0x135d, B:372:0x1368, B:374:0x1370, B:375:0x137b, B:377:0x137f, B:379:0x1383, B:381:0x138d, B:382:0x1392, B:384:0x1399, B:385:0x139c, B:387:0x13b3, B:388:0x13bb, B:394:0x13d9, B:399:0x13f4, B:401:0x13fb, B:402:0x1400, B:404:0x1404, B:405:0x143f, B:407:0x1445, B:408:0x144a, B:410:0x144f, B:411:0x1454, B:413:0x1458, B:414:0x1463, B:416:0x1467, B:417:0x147c, B:419:0x1495, B:420:0x149e, B:422:0x14a2, B:423:0x14b5, B:425:0x14b9, B:426:0x14d5, B:428:0x14d9, B:429:0x14de, B:431:0x14e2, B:432:0x14e7, B:434:0x14eb, B:435:0x14f1, B:437:0x14f5, B:438:0x1505, B:440:0x1518, B:441:0x151f, B:443:0x1529, B:446:0x153a, B:448:0x153f, B:449:0x155e, B:451:0x1566, B:452:0x158a, B:454:0x1591, B:455:0x1598, B:457:0x159d, B:459:0x15a8, B:465:0x15c2, B:467:0x15ca, B:469:0x15d4, B:470:0x15d6, B:481:0x1678, B:471:0x15d9, B:473:0x1643, B:475:0x1647, B:477:0x164f, B:478:0x1664, B:480:0x166a, B:482:0x167f, B:483:0x1684, B:485:0x1688, B:487:0x168c, B:488:0x168f, B:490:0x1695, B:491:0x169a, B:445:0x1533, B:462:0x15af, B:463:0x15b6, B:391:0x13cf, B:202:0x0f31, B:204:0x0f3c, B:205:0x0f44, B:207:0x0f4a, B:190:0x0eb2, B:191:0x0eec, B:193:0x0ef2, B:194:0x0f00, B:195:0x0f12, B:197:0x0f18, B:168:0x0e42, B:159:0x0b31, B:60:0x01a6, B:28:0x00c3, B:30:0x00cd, B:32:0x00d7, B:34:0x00e5, B:36:0x00f0, B:35:0x00ec), top: B:496:0x00ad }] */
    /* JADX WARN: Removed duplicated region for block: B:119:0x032a  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x037a  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x037c  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x03c1  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x03c3  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x06b8  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x06c7  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x06c9  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x06f6  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x09f9 A[Catch: JSONException -> 0x169e, TryCatch #0 {JSONException -> 0x169e, blocks: (B:23:0x00ad, B:25:0x00b1, B:27:0x00bc, B:29:0x00c7, B:38:0x00fc, B:40:0x0104, B:42:0x0108, B:43:0x0116, B:45:0x011e, B:46:0x012a, B:48:0x0130, B:50:0x0146, B:51:0x0158, B:53:0x015c, B:55:0x0164, B:56:0x0176, B:58:0x0195, B:63:0x01b2, B:65:0x01c5, B:66:0x01ca, B:68:0x01d2, B:69:0x01d6, B:71:0x01dc, B:72:0x01ea, B:74:0x01fb, B:76:0x020b, B:80:0x024d, B:82:0x0251, B:93:0x026e, B:95:0x0273, B:97:0x0277, B:99:0x0282, B:100:0x028f, B:106:0x02a0, B:109:0x02a8, B:110:0x02bc, B:112:0x02c2, B:113:0x02d1, B:114:0x02e7, B:116:0x02ed, B:117:0x02fb, B:120:0x032c, B:124:0x037d, B:128:0x03c4, B:131:0x06b9, B:135:0x06ca, B:139:0x06f7, B:141:0x09f9, B:142:0x09fb, B:144:0x0a05, B:145:0x0a07, B:147:0x0a11, B:148:0x0a13, B:156:0x0acb, B:160:0x0b3b, B:164:0x0ca9, B:167:0x0d14, B:171:0x0e50, B:173:0x0e70, B:175:0x0e76, B:176:0x0e7f, B:178:0x0e86, B:179:0x0e8b, B:181:0x0e95, B:182:0x0e9e, B:184:0x0ea6, B:186:0x0eaa, B:188:0x0eae, B:198:0x0f26, B:200:0x0f2b, B:208:0x0f5e, B:210:0x0f63, B:212:0x0f7f, B:213:0x0f87, B:215:0x0f8d, B:216:0x0fa1, B:217:0x0faa, B:219:0x0fb9, B:221:0x0fc1, B:223:0x0fd0, B:224:0x0fdb, B:226:0x0fe3, B:227:0x0fee, B:229:0x0ff6, B:230:0x1001, B:232:0x1009, B:233:0x1014, B:235:0x101c, B:236:0x1027, B:238:0x102f, B:239:0x103a, B:241:0x1042, B:242:0x104d, B:244:0x1055, B:245:0x1060, B:247:0x1066, B:248:0x106d, B:250:0x1075, B:251:0x1080, B:253:0x1086, B:254:0x108d, B:256:0x1095, B:257:0x10a0, B:259:0x10a8, B:260:0x10b3, B:262:0x10bb, B:263:0x10c6, B:265:0x10ce, B:266:0x10d9, B:268:0x10e1, B:269:0x10ec, B:271:0x10f2, B:272:0x10f9, B:274:0x1101, B:275:0x110c, B:277:0x1114, B:278:0x111f, B:280:0x1127, B:281:0x1132, B:283:0x1138, B:284:0x113f, B:286:0x1149, B:288:0x114f, B:290:0x115c, B:291:0x1167, B:293:0x116f, B:294:0x117a, B:296:0x1182, B:297:0x118d, B:299:0x1195, B:300:0x11a0, B:302:0x11a8, B:303:0x11b3, B:305:0x11bb, B:306:0x11c6, B:308:0x11ce, B:309:0x11d9, B:311:0x11e1, B:312:0x11ec, B:314:0x11f4, B:315:0x11ff, B:317:0x1207, B:318:0x1212, B:320:0x121a, B:321:0x1225, B:323:0x122d, B:324:0x1238, B:326:0x1240, B:327:0x124b, B:329:0x1253, B:330:0x125e, B:332:0x1266, B:333:0x1271, B:335:0x1279, B:336:0x1284, B:338:0x128c, B:339:0x1297, B:341:0x129f, B:342:0x12aa, B:344:0x12b2, B:345:0x12bd, B:347:0x12c5, B:348:0x12d0, B:350:0x12d8, B:351:0x12e3, B:353:0x12eb, B:354:0x12f6, B:356:0x12fe, B:357:0x1309, B:359:0x1311, B:360:0x131c, B:362:0x1324, B:363:0x132f, B:365:0x1337, B:366:0x1342, B:368:0x134a, B:369:0x1355, B:371:0x135d, B:372:0x1368, B:374:0x1370, B:375:0x137b, B:377:0x137f, B:379:0x1383, B:381:0x138d, B:382:0x1392, B:384:0x1399, B:385:0x139c, B:387:0x13b3, B:388:0x13bb, B:394:0x13d9, B:399:0x13f4, B:401:0x13fb, B:402:0x1400, B:404:0x1404, B:405:0x143f, B:407:0x1445, B:408:0x144a, B:410:0x144f, B:411:0x1454, B:413:0x1458, B:414:0x1463, B:416:0x1467, B:417:0x147c, B:419:0x1495, B:420:0x149e, B:422:0x14a2, B:423:0x14b5, B:425:0x14b9, B:426:0x14d5, B:428:0x14d9, B:429:0x14de, B:431:0x14e2, B:432:0x14e7, B:434:0x14eb, B:435:0x14f1, B:437:0x14f5, B:438:0x1505, B:440:0x1518, B:441:0x151f, B:443:0x1529, B:446:0x153a, B:448:0x153f, B:449:0x155e, B:451:0x1566, B:452:0x158a, B:454:0x1591, B:455:0x1598, B:457:0x159d, B:459:0x15a8, B:465:0x15c2, B:467:0x15ca, B:469:0x15d4, B:470:0x15d6, B:481:0x1678, B:471:0x15d9, B:473:0x1643, B:475:0x1647, B:477:0x164f, B:478:0x1664, B:480:0x166a, B:482:0x167f, B:483:0x1684, B:485:0x1688, B:487:0x168c, B:488:0x168f, B:490:0x1695, B:491:0x169a, B:445:0x1533, B:462:0x15af, B:463:0x15b6, B:391:0x13cf, B:202:0x0f31, B:204:0x0f3c, B:205:0x0f44, B:207:0x0f4a, B:190:0x0eb2, B:191:0x0eec, B:193:0x0ef2, B:194:0x0f00, B:195:0x0f12, B:197:0x0f18, B:168:0x0e42, B:159:0x0b31, B:60:0x01a6, B:28:0x00c3, B:30:0x00cd, B:32:0x00d7, B:34:0x00e5, B:36:0x00f0, B:35:0x00ec), top: B:496:0x00ad }] */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0a05 A[Catch: JSONException -> 0x169e, TryCatch #0 {JSONException -> 0x169e, blocks: (B:23:0x00ad, B:25:0x00b1, B:27:0x00bc, B:29:0x00c7, B:38:0x00fc, B:40:0x0104, B:42:0x0108, B:43:0x0116, B:45:0x011e, B:46:0x012a, B:48:0x0130, B:50:0x0146, B:51:0x0158, B:53:0x015c, B:55:0x0164, B:56:0x0176, B:58:0x0195, B:63:0x01b2, B:65:0x01c5, B:66:0x01ca, B:68:0x01d2, B:69:0x01d6, B:71:0x01dc, B:72:0x01ea, B:74:0x01fb, B:76:0x020b, B:80:0x024d, B:82:0x0251, B:93:0x026e, B:95:0x0273, B:97:0x0277, B:99:0x0282, B:100:0x028f, B:106:0x02a0, B:109:0x02a8, B:110:0x02bc, B:112:0x02c2, B:113:0x02d1, B:114:0x02e7, B:116:0x02ed, B:117:0x02fb, B:120:0x032c, B:124:0x037d, B:128:0x03c4, B:131:0x06b9, B:135:0x06ca, B:139:0x06f7, B:141:0x09f9, B:142:0x09fb, B:144:0x0a05, B:145:0x0a07, B:147:0x0a11, B:148:0x0a13, B:156:0x0acb, B:160:0x0b3b, B:164:0x0ca9, B:167:0x0d14, B:171:0x0e50, B:173:0x0e70, B:175:0x0e76, B:176:0x0e7f, B:178:0x0e86, B:179:0x0e8b, B:181:0x0e95, B:182:0x0e9e, B:184:0x0ea6, B:186:0x0eaa, B:188:0x0eae, B:198:0x0f26, B:200:0x0f2b, B:208:0x0f5e, B:210:0x0f63, B:212:0x0f7f, B:213:0x0f87, B:215:0x0f8d, B:216:0x0fa1, B:217:0x0faa, B:219:0x0fb9, B:221:0x0fc1, B:223:0x0fd0, B:224:0x0fdb, B:226:0x0fe3, B:227:0x0fee, B:229:0x0ff6, B:230:0x1001, B:232:0x1009, B:233:0x1014, B:235:0x101c, B:236:0x1027, B:238:0x102f, B:239:0x103a, B:241:0x1042, B:242:0x104d, B:244:0x1055, B:245:0x1060, B:247:0x1066, B:248:0x106d, B:250:0x1075, B:251:0x1080, B:253:0x1086, B:254:0x108d, B:256:0x1095, B:257:0x10a0, B:259:0x10a8, B:260:0x10b3, B:262:0x10bb, B:263:0x10c6, B:265:0x10ce, B:266:0x10d9, B:268:0x10e1, B:269:0x10ec, B:271:0x10f2, B:272:0x10f9, B:274:0x1101, B:275:0x110c, B:277:0x1114, B:278:0x111f, B:280:0x1127, B:281:0x1132, B:283:0x1138, B:284:0x113f, B:286:0x1149, B:288:0x114f, B:290:0x115c, B:291:0x1167, B:293:0x116f, B:294:0x117a, B:296:0x1182, B:297:0x118d, B:299:0x1195, B:300:0x11a0, B:302:0x11a8, B:303:0x11b3, B:305:0x11bb, B:306:0x11c6, B:308:0x11ce, B:309:0x11d9, B:311:0x11e1, B:312:0x11ec, B:314:0x11f4, B:315:0x11ff, B:317:0x1207, B:318:0x1212, B:320:0x121a, B:321:0x1225, B:323:0x122d, B:324:0x1238, B:326:0x1240, B:327:0x124b, B:329:0x1253, B:330:0x125e, B:332:0x1266, B:333:0x1271, B:335:0x1279, B:336:0x1284, B:338:0x128c, B:339:0x1297, B:341:0x129f, B:342:0x12aa, B:344:0x12b2, B:345:0x12bd, B:347:0x12c5, B:348:0x12d0, B:350:0x12d8, B:351:0x12e3, B:353:0x12eb, B:354:0x12f6, B:356:0x12fe, B:357:0x1309, B:359:0x1311, B:360:0x131c, B:362:0x1324, B:363:0x132f, B:365:0x1337, B:366:0x1342, B:368:0x134a, B:369:0x1355, B:371:0x135d, B:372:0x1368, B:374:0x1370, B:375:0x137b, B:377:0x137f, B:379:0x1383, B:381:0x138d, B:382:0x1392, B:384:0x1399, B:385:0x139c, B:387:0x13b3, B:388:0x13bb, B:394:0x13d9, B:399:0x13f4, B:401:0x13fb, B:402:0x1400, B:404:0x1404, B:405:0x143f, B:407:0x1445, B:408:0x144a, B:410:0x144f, B:411:0x1454, B:413:0x1458, B:414:0x1463, B:416:0x1467, B:417:0x147c, B:419:0x1495, B:420:0x149e, B:422:0x14a2, B:423:0x14b5, B:425:0x14b9, B:426:0x14d5, B:428:0x14d9, B:429:0x14de, B:431:0x14e2, B:432:0x14e7, B:434:0x14eb, B:435:0x14f1, B:437:0x14f5, B:438:0x1505, B:440:0x1518, B:441:0x151f, B:443:0x1529, B:446:0x153a, B:448:0x153f, B:449:0x155e, B:451:0x1566, B:452:0x158a, B:454:0x1591, B:455:0x1598, B:457:0x159d, B:459:0x15a8, B:465:0x15c2, B:467:0x15ca, B:469:0x15d4, B:470:0x15d6, B:481:0x1678, B:471:0x15d9, B:473:0x1643, B:475:0x1647, B:477:0x164f, B:478:0x1664, B:480:0x166a, B:482:0x167f, B:483:0x1684, B:485:0x1688, B:487:0x168c, B:488:0x168f, B:490:0x1695, B:491:0x169a, B:445:0x1533, B:462:0x15af, B:463:0x15b6, B:391:0x13cf, B:202:0x0f31, B:204:0x0f3c, B:205:0x0f44, B:207:0x0f4a, B:190:0x0eb2, B:191:0x0eec, B:193:0x0ef2, B:194:0x0f00, B:195:0x0f12, B:197:0x0f18, B:168:0x0e42, B:159:0x0b31, B:60:0x01a6, B:28:0x00c3, B:30:0x00cd, B:32:0x00d7, B:34:0x00e5, B:36:0x00f0, B:35:0x00ec), top: B:496:0x00ad }] */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0a11 A[Catch: JSONException -> 0x169e, TryCatch #0 {JSONException -> 0x169e, blocks: (B:23:0x00ad, B:25:0x00b1, B:27:0x00bc, B:29:0x00c7, B:38:0x00fc, B:40:0x0104, B:42:0x0108, B:43:0x0116, B:45:0x011e, B:46:0x012a, B:48:0x0130, B:50:0x0146, B:51:0x0158, B:53:0x015c, B:55:0x0164, B:56:0x0176, B:58:0x0195, B:63:0x01b2, B:65:0x01c5, B:66:0x01ca, B:68:0x01d2, B:69:0x01d6, B:71:0x01dc, B:72:0x01ea, B:74:0x01fb, B:76:0x020b, B:80:0x024d, B:82:0x0251, B:93:0x026e, B:95:0x0273, B:97:0x0277, B:99:0x0282, B:100:0x028f, B:106:0x02a0, B:109:0x02a8, B:110:0x02bc, B:112:0x02c2, B:113:0x02d1, B:114:0x02e7, B:116:0x02ed, B:117:0x02fb, B:120:0x032c, B:124:0x037d, B:128:0x03c4, B:131:0x06b9, B:135:0x06ca, B:139:0x06f7, B:141:0x09f9, B:142:0x09fb, B:144:0x0a05, B:145:0x0a07, B:147:0x0a11, B:148:0x0a13, B:156:0x0acb, B:160:0x0b3b, B:164:0x0ca9, B:167:0x0d14, B:171:0x0e50, B:173:0x0e70, B:175:0x0e76, B:176:0x0e7f, B:178:0x0e86, B:179:0x0e8b, B:181:0x0e95, B:182:0x0e9e, B:184:0x0ea6, B:186:0x0eaa, B:188:0x0eae, B:198:0x0f26, B:200:0x0f2b, B:208:0x0f5e, B:210:0x0f63, B:212:0x0f7f, B:213:0x0f87, B:215:0x0f8d, B:216:0x0fa1, B:217:0x0faa, B:219:0x0fb9, B:221:0x0fc1, B:223:0x0fd0, B:224:0x0fdb, B:226:0x0fe3, B:227:0x0fee, B:229:0x0ff6, B:230:0x1001, B:232:0x1009, B:233:0x1014, B:235:0x101c, B:236:0x1027, B:238:0x102f, B:239:0x103a, B:241:0x1042, B:242:0x104d, B:244:0x1055, B:245:0x1060, B:247:0x1066, B:248:0x106d, B:250:0x1075, B:251:0x1080, B:253:0x1086, B:254:0x108d, B:256:0x1095, B:257:0x10a0, B:259:0x10a8, B:260:0x10b3, B:262:0x10bb, B:263:0x10c6, B:265:0x10ce, B:266:0x10d9, B:268:0x10e1, B:269:0x10ec, B:271:0x10f2, B:272:0x10f9, B:274:0x1101, B:275:0x110c, B:277:0x1114, B:278:0x111f, B:280:0x1127, B:281:0x1132, B:283:0x1138, B:284:0x113f, B:286:0x1149, B:288:0x114f, B:290:0x115c, B:291:0x1167, B:293:0x116f, B:294:0x117a, B:296:0x1182, B:297:0x118d, B:299:0x1195, B:300:0x11a0, B:302:0x11a8, B:303:0x11b3, B:305:0x11bb, B:306:0x11c6, B:308:0x11ce, B:309:0x11d9, B:311:0x11e1, B:312:0x11ec, B:314:0x11f4, B:315:0x11ff, B:317:0x1207, B:318:0x1212, B:320:0x121a, B:321:0x1225, B:323:0x122d, B:324:0x1238, B:326:0x1240, B:327:0x124b, B:329:0x1253, B:330:0x125e, B:332:0x1266, B:333:0x1271, B:335:0x1279, B:336:0x1284, B:338:0x128c, B:339:0x1297, B:341:0x129f, B:342:0x12aa, B:344:0x12b2, B:345:0x12bd, B:347:0x12c5, B:348:0x12d0, B:350:0x12d8, B:351:0x12e3, B:353:0x12eb, B:354:0x12f6, B:356:0x12fe, B:357:0x1309, B:359:0x1311, B:360:0x131c, B:362:0x1324, B:363:0x132f, B:365:0x1337, B:366:0x1342, B:368:0x134a, B:369:0x1355, B:371:0x135d, B:372:0x1368, B:374:0x1370, B:375:0x137b, B:377:0x137f, B:379:0x1383, B:381:0x138d, B:382:0x1392, B:384:0x1399, B:385:0x139c, B:387:0x13b3, B:388:0x13bb, B:394:0x13d9, B:399:0x13f4, B:401:0x13fb, B:402:0x1400, B:404:0x1404, B:405:0x143f, B:407:0x1445, B:408:0x144a, B:410:0x144f, B:411:0x1454, B:413:0x1458, B:414:0x1463, B:416:0x1467, B:417:0x147c, B:419:0x1495, B:420:0x149e, B:422:0x14a2, B:423:0x14b5, B:425:0x14b9, B:426:0x14d5, B:428:0x14d9, B:429:0x14de, B:431:0x14e2, B:432:0x14e7, B:434:0x14eb, B:435:0x14f1, B:437:0x14f5, B:438:0x1505, B:440:0x1518, B:441:0x151f, B:443:0x1529, B:446:0x153a, B:448:0x153f, B:449:0x155e, B:451:0x1566, B:452:0x158a, B:454:0x1591, B:455:0x1598, B:457:0x159d, B:459:0x15a8, B:465:0x15c2, B:467:0x15ca, B:469:0x15d4, B:470:0x15d6, B:481:0x1678, B:471:0x15d9, B:473:0x1643, B:475:0x1647, B:477:0x164f, B:478:0x1664, B:480:0x166a, B:482:0x167f, B:483:0x1684, B:485:0x1688, B:487:0x168c, B:488:0x168f, B:490:0x1695, B:491:0x169a, B:445:0x1533, B:462:0x15af, B:463:0x15b6, B:391:0x13cf, B:202:0x0f31, B:204:0x0f3c, B:205:0x0f44, B:207:0x0f4a, B:190:0x0eb2, B:191:0x0eec, B:193:0x0ef2, B:194:0x0f00, B:195:0x0f12, B:197:0x0f18, B:168:0x0e42, B:159:0x0b31, B:60:0x01a6, B:28:0x00c3, B:30:0x00cd, B:32:0x00d7, B:34:0x00e5, B:36:0x00f0, B:35:0x00ec), top: B:496:0x00ad }] */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0abb  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0abc  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0ac0  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0ac4  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0aca  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0b2f  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0b31 A[Catch: JSONException -> 0x169e, TryCatch #0 {JSONException -> 0x169e, blocks: (B:23:0x00ad, B:25:0x00b1, B:27:0x00bc, B:29:0x00c7, B:38:0x00fc, B:40:0x0104, B:42:0x0108, B:43:0x0116, B:45:0x011e, B:46:0x012a, B:48:0x0130, B:50:0x0146, B:51:0x0158, B:53:0x015c, B:55:0x0164, B:56:0x0176, B:58:0x0195, B:63:0x01b2, B:65:0x01c5, B:66:0x01ca, B:68:0x01d2, B:69:0x01d6, B:71:0x01dc, B:72:0x01ea, B:74:0x01fb, B:76:0x020b, B:80:0x024d, B:82:0x0251, B:93:0x026e, B:95:0x0273, B:97:0x0277, B:99:0x0282, B:100:0x028f, B:106:0x02a0, B:109:0x02a8, B:110:0x02bc, B:112:0x02c2, B:113:0x02d1, B:114:0x02e7, B:116:0x02ed, B:117:0x02fb, B:120:0x032c, B:124:0x037d, B:128:0x03c4, B:131:0x06b9, B:135:0x06ca, B:139:0x06f7, B:141:0x09f9, B:142:0x09fb, B:144:0x0a05, B:145:0x0a07, B:147:0x0a11, B:148:0x0a13, B:156:0x0acb, B:160:0x0b3b, B:164:0x0ca9, B:167:0x0d14, B:171:0x0e50, B:173:0x0e70, B:175:0x0e76, B:176:0x0e7f, B:178:0x0e86, B:179:0x0e8b, B:181:0x0e95, B:182:0x0e9e, B:184:0x0ea6, B:186:0x0eaa, B:188:0x0eae, B:198:0x0f26, B:200:0x0f2b, B:208:0x0f5e, B:210:0x0f63, B:212:0x0f7f, B:213:0x0f87, B:215:0x0f8d, B:216:0x0fa1, B:217:0x0faa, B:219:0x0fb9, B:221:0x0fc1, B:223:0x0fd0, B:224:0x0fdb, B:226:0x0fe3, B:227:0x0fee, B:229:0x0ff6, B:230:0x1001, B:232:0x1009, B:233:0x1014, B:235:0x101c, B:236:0x1027, B:238:0x102f, B:239:0x103a, B:241:0x1042, B:242:0x104d, B:244:0x1055, B:245:0x1060, B:247:0x1066, B:248:0x106d, B:250:0x1075, B:251:0x1080, B:253:0x1086, B:254:0x108d, B:256:0x1095, B:257:0x10a0, B:259:0x10a8, B:260:0x10b3, B:262:0x10bb, B:263:0x10c6, B:265:0x10ce, B:266:0x10d9, B:268:0x10e1, B:269:0x10ec, B:271:0x10f2, B:272:0x10f9, B:274:0x1101, B:275:0x110c, B:277:0x1114, B:278:0x111f, B:280:0x1127, B:281:0x1132, B:283:0x1138, B:284:0x113f, B:286:0x1149, B:288:0x114f, B:290:0x115c, B:291:0x1167, B:293:0x116f, B:294:0x117a, B:296:0x1182, B:297:0x118d, B:299:0x1195, B:300:0x11a0, B:302:0x11a8, B:303:0x11b3, B:305:0x11bb, B:306:0x11c6, B:308:0x11ce, B:309:0x11d9, B:311:0x11e1, B:312:0x11ec, B:314:0x11f4, B:315:0x11ff, B:317:0x1207, B:318:0x1212, B:320:0x121a, B:321:0x1225, B:323:0x122d, B:324:0x1238, B:326:0x1240, B:327:0x124b, B:329:0x1253, B:330:0x125e, B:332:0x1266, B:333:0x1271, B:335:0x1279, B:336:0x1284, B:338:0x128c, B:339:0x1297, B:341:0x129f, B:342:0x12aa, B:344:0x12b2, B:345:0x12bd, B:347:0x12c5, B:348:0x12d0, B:350:0x12d8, B:351:0x12e3, B:353:0x12eb, B:354:0x12f6, B:356:0x12fe, B:357:0x1309, B:359:0x1311, B:360:0x131c, B:362:0x1324, B:363:0x132f, B:365:0x1337, B:366:0x1342, B:368:0x134a, B:369:0x1355, B:371:0x135d, B:372:0x1368, B:374:0x1370, B:375:0x137b, B:377:0x137f, B:379:0x1383, B:381:0x138d, B:382:0x1392, B:384:0x1399, B:385:0x139c, B:387:0x13b3, B:388:0x13bb, B:394:0x13d9, B:399:0x13f4, B:401:0x13fb, B:402:0x1400, B:404:0x1404, B:405:0x143f, B:407:0x1445, B:408:0x144a, B:410:0x144f, B:411:0x1454, B:413:0x1458, B:414:0x1463, B:416:0x1467, B:417:0x147c, B:419:0x1495, B:420:0x149e, B:422:0x14a2, B:423:0x14b5, B:425:0x14b9, B:426:0x14d5, B:428:0x14d9, B:429:0x14de, B:431:0x14e2, B:432:0x14e7, B:434:0x14eb, B:435:0x14f1, B:437:0x14f5, B:438:0x1505, B:440:0x1518, B:441:0x151f, B:443:0x1529, B:446:0x153a, B:448:0x153f, B:449:0x155e, B:451:0x1566, B:452:0x158a, B:454:0x1591, B:455:0x1598, B:457:0x159d, B:459:0x15a8, B:465:0x15c2, B:467:0x15ca, B:469:0x15d4, B:470:0x15d6, B:481:0x1678, B:471:0x15d9, B:473:0x1643, B:475:0x1647, B:477:0x164f, B:478:0x1664, B:480:0x166a, B:482:0x167f, B:483:0x1684, B:485:0x1688, B:487:0x168c, B:488:0x168f, B:490:0x1695, B:491:0x169a, B:445:0x1533, B:462:0x15af, B:463:0x15b6, B:391:0x13cf, B:202:0x0f31, B:204:0x0f3c, B:205:0x0f44, B:207:0x0f4a, B:190:0x0eb2, B:191:0x0eec, B:193:0x0ef2, B:194:0x0f00, B:195:0x0f12, B:197:0x0f18, B:168:0x0e42, B:159:0x0b31, B:60:0x01a6, B:28:0x00c3, B:30:0x00cd, B:32:0x00d7, B:34:0x00e5, B:36:0x00f0, B:35:0x00ec), top: B:496:0x00ad }] */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0ca7  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0d12  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0e42 A[Catch: JSONException -> 0x169e, TRY_LEAVE, TryCatch #0 {JSONException -> 0x169e, blocks: (B:23:0x00ad, B:25:0x00b1, B:27:0x00bc, B:29:0x00c7, B:38:0x00fc, B:40:0x0104, B:42:0x0108, B:43:0x0116, B:45:0x011e, B:46:0x012a, B:48:0x0130, B:50:0x0146, B:51:0x0158, B:53:0x015c, B:55:0x0164, B:56:0x0176, B:58:0x0195, B:63:0x01b2, B:65:0x01c5, B:66:0x01ca, B:68:0x01d2, B:69:0x01d6, B:71:0x01dc, B:72:0x01ea, B:74:0x01fb, B:76:0x020b, B:80:0x024d, B:82:0x0251, B:93:0x026e, B:95:0x0273, B:97:0x0277, B:99:0x0282, B:100:0x028f, B:106:0x02a0, B:109:0x02a8, B:110:0x02bc, B:112:0x02c2, B:113:0x02d1, B:114:0x02e7, B:116:0x02ed, B:117:0x02fb, B:120:0x032c, B:124:0x037d, B:128:0x03c4, B:131:0x06b9, B:135:0x06ca, B:139:0x06f7, B:141:0x09f9, B:142:0x09fb, B:144:0x0a05, B:145:0x0a07, B:147:0x0a11, B:148:0x0a13, B:156:0x0acb, B:160:0x0b3b, B:164:0x0ca9, B:167:0x0d14, B:171:0x0e50, B:173:0x0e70, B:175:0x0e76, B:176:0x0e7f, B:178:0x0e86, B:179:0x0e8b, B:181:0x0e95, B:182:0x0e9e, B:184:0x0ea6, B:186:0x0eaa, B:188:0x0eae, B:198:0x0f26, B:200:0x0f2b, B:208:0x0f5e, B:210:0x0f63, B:212:0x0f7f, B:213:0x0f87, B:215:0x0f8d, B:216:0x0fa1, B:217:0x0faa, B:219:0x0fb9, B:221:0x0fc1, B:223:0x0fd0, B:224:0x0fdb, B:226:0x0fe3, B:227:0x0fee, B:229:0x0ff6, B:230:0x1001, B:232:0x1009, B:233:0x1014, B:235:0x101c, B:236:0x1027, B:238:0x102f, B:239:0x103a, B:241:0x1042, B:242:0x104d, B:244:0x1055, B:245:0x1060, B:247:0x1066, B:248:0x106d, B:250:0x1075, B:251:0x1080, B:253:0x1086, B:254:0x108d, B:256:0x1095, B:257:0x10a0, B:259:0x10a8, B:260:0x10b3, B:262:0x10bb, B:263:0x10c6, B:265:0x10ce, B:266:0x10d9, B:268:0x10e1, B:269:0x10ec, B:271:0x10f2, B:272:0x10f9, B:274:0x1101, B:275:0x110c, B:277:0x1114, B:278:0x111f, B:280:0x1127, B:281:0x1132, B:283:0x1138, B:284:0x113f, B:286:0x1149, B:288:0x114f, B:290:0x115c, B:291:0x1167, B:293:0x116f, B:294:0x117a, B:296:0x1182, B:297:0x118d, B:299:0x1195, B:300:0x11a0, B:302:0x11a8, B:303:0x11b3, B:305:0x11bb, B:306:0x11c6, B:308:0x11ce, B:309:0x11d9, B:311:0x11e1, B:312:0x11ec, B:314:0x11f4, B:315:0x11ff, B:317:0x1207, B:318:0x1212, B:320:0x121a, B:321:0x1225, B:323:0x122d, B:324:0x1238, B:326:0x1240, B:327:0x124b, B:329:0x1253, B:330:0x125e, B:332:0x1266, B:333:0x1271, B:335:0x1279, B:336:0x1284, B:338:0x128c, B:339:0x1297, B:341:0x129f, B:342:0x12aa, B:344:0x12b2, B:345:0x12bd, B:347:0x12c5, B:348:0x12d0, B:350:0x12d8, B:351:0x12e3, B:353:0x12eb, B:354:0x12f6, B:356:0x12fe, B:357:0x1309, B:359:0x1311, B:360:0x131c, B:362:0x1324, B:363:0x132f, B:365:0x1337, B:366:0x1342, B:368:0x134a, B:369:0x1355, B:371:0x135d, B:372:0x1368, B:374:0x1370, B:375:0x137b, B:377:0x137f, B:379:0x1383, B:381:0x138d, B:382:0x1392, B:384:0x1399, B:385:0x139c, B:387:0x13b3, B:388:0x13bb, B:394:0x13d9, B:399:0x13f4, B:401:0x13fb, B:402:0x1400, B:404:0x1404, B:405:0x143f, B:407:0x1445, B:408:0x144a, B:410:0x144f, B:411:0x1454, B:413:0x1458, B:414:0x1463, B:416:0x1467, B:417:0x147c, B:419:0x1495, B:420:0x149e, B:422:0x14a2, B:423:0x14b5, B:425:0x14b9, B:426:0x14d5, B:428:0x14d9, B:429:0x14de, B:431:0x14e2, B:432:0x14e7, B:434:0x14eb, B:435:0x14f1, B:437:0x14f5, B:438:0x1505, B:440:0x1518, B:441:0x151f, B:443:0x1529, B:446:0x153a, B:448:0x153f, B:449:0x155e, B:451:0x1566, B:452:0x158a, B:454:0x1591, B:455:0x1598, B:457:0x159d, B:459:0x15a8, B:465:0x15c2, B:467:0x15ca, B:469:0x15d4, B:470:0x15d6, B:481:0x1678, B:471:0x15d9, B:473:0x1643, B:475:0x1647, B:477:0x164f, B:478:0x1664, B:480:0x166a, B:482:0x167f, B:483:0x1684, B:485:0x1688, B:487:0x168c, B:488:0x168f, B:490:0x1695, B:491:0x169a, B:445:0x1533, B:462:0x15af, B:463:0x15b6, B:391:0x13cf, B:202:0x0f31, B:204:0x0f3c, B:205:0x0f44, B:207:0x0f4a, B:190:0x0eb2, B:191:0x0eec, B:193:0x0ef2, B:194:0x0f00, B:195:0x0f12, B:197:0x0f18, B:168:0x0e42, B:159:0x0b31, B:60:0x01a6, B:28:0x00c3, B:30:0x00cd, B:32:0x00d7, B:34:0x00e5, B:36:0x00f0, B:35:0x00ec), top: B:496:0x00ad }] */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0e50 A[Catch: JSONException -> 0x169e, TRY_ENTER, TryCatch #0 {JSONException -> 0x169e, blocks: (B:23:0x00ad, B:25:0x00b1, B:27:0x00bc, B:29:0x00c7, B:38:0x00fc, B:40:0x0104, B:42:0x0108, B:43:0x0116, B:45:0x011e, B:46:0x012a, B:48:0x0130, B:50:0x0146, B:51:0x0158, B:53:0x015c, B:55:0x0164, B:56:0x0176, B:58:0x0195, B:63:0x01b2, B:65:0x01c5, B:66:0x01ca, B:68:0x01d2, B:69:0x01d6, B:71:0x01dc, B:72:0x01ea, B:74:0x01fb, B:76:0x020b, B:80:0x024d, B:82:0x0251, B:93:0x026e, B:95:0x0273, B:97:0x0277, B:99:0x0282, B:100:0x028f, B:106:0x02a0, B:109:0x02a8, B:110:0x02bc, B:112:0x02c2, B:113:0x02d1, B:114:0x02e7, B:116:0x02ed, B:117:0x02fb, B:120:0x032c, B:124:0x037d, B:128:0x03c4, B:131:0x06b9, B:135:0x06ca, B:139:0x06f7, B:141:0x09f9, B:142:0x09fb, B:144:0x0a05, B:145:0x0a07, B:147:0x0a11, B:148:0x0a13, B:156:0x0acb, B:160:0x0b3b, B:164:0x0ca9, B:167:0x0d14, B:171:0x0e50, B:173:0x0e70, B:175:0x0e76, B:176:0x0e7f, B:178:0x0e86, B:179:0x0e8b, B:181:0x0e95, B:182:0x0e9e, B:184:0x0ea6, B:186:0x0eaa, B:188:0x0eae, B:198:0x0f26, B:200:0x0f2b, B:208:0x0f5e, B:210:0x0f63, B:212:0x0f7f, B:213:0x0f87, B:215:0x0f8d, B:216:0x0fa1, B:217:0x0faa, B:219:0x0fb9, B:221:0x0fc1, B:223:0x0fd0, B:224:0x0fdb, B:226:0x0fe3, B:227:0x0fee, B:229:0x0ff6, B:230:0x1001, B:232:0x1009, B:233:0x1014, B:235:0x101c, B:236:0x1027, B:238:0x102f, B:239:0x103a, B:241:0x1042, B:242:0x104d, B:244:0x1055, B:245:0x1060, B:247:0x1066, B:248:0x106d, B:250:0x1075, B:251:0x1080, B:253:0x1086, B:254:0x108d, B:256:0x1095, B:257:0x10a0, B:259:0x10a8, B:260:0x10b3, B:262:0x10bb, B:263:0x10c6, B:265:0x10ce, B:266:0x10d9, B:268:0x10e1, B:269:0x10ec, B:271:0x10f2, B:272:0x10f9, B:274:0x1101, B:275:0x110c, B:277:0x1114, B:278:0x111f, B:280:0x1127, B:281:0x1132, B:283:0x1138, B:284:0x113f, B:286:0x1149, B:288:0x114f, B:290:0x115c, B:291:0x1167, B:293:0x116f, B:294:0x117a, B:296:0x1182, B:297:0x118d, B:299:0x1195, B:300:0x11a0, B:302:0x11a8, B:303:0x11b3, B:305:0x11bb, B:306:0x11c6, B:308:0x11ce, B:309:0x11d9, B:311:0x11e1, B:312:0x11ec, B:314:0x11f4, B:315:0x11ff, B:317:0x1207, B:318:0x1212, B:320:0x121a, B:321:0x1225, B:323:0x122d, B:324:0x1238, B:326:0x1240, B:327:0x124b, B:329:0x1253, B:330:0x125e, B:332:0x1266, B:333:0x1271, B:335:0x1279, B:336:0x1284, B:338:0x128c, B:339:0x1297, B:341:0x129f, B:342:0x12aa, B:344:0x12b2, B:345:0x12bd, B:347:0x12c5, B:348:0x12d0, B:350:0x12d8, B:351:0x12e3, B:353:0x12eb, B:354:0x12f6, B:356:0x12fe, B:357:0x1309, B:359:0x1311, B:360:0x131c, B:362:0x1324, B:363:0x132f, B:365:0x1337, B:366:0x1342, B:368:0x134a, B:369:0x1355, B:371:0x135d, B:372:0x1368, B:374:0x1370, B:375:0x137b, B:377:0x137f, B:379:0x1383, B:381:0x138d, B:382:0x1392, B:384:0x1399, B:385:0x139c, B:387:0x13b3, B:388:0x13bb, B:394:0x13d9, B:399:0x13f4, B:401:0x13fb, B:402:0x1400, B:404:0x1404, B:405:0x143f, B:407:0x1445, B:408:0x144a, B:410:0x144f, B:411:0x1454, B:413:0x1458, B:414:0x1463, B:416:0x1467, B:417:0x147c, B:419:0x1495, B:420:0x149e, B:422:0x14a2, B:423:0x14b5, B:425:0x14b9, B:426:0x14d5, B:428:0x14d9, B:429:0x14de, B:431:0x14e2, B:432:0x14e7, B:434:0x14eb, B:435:0x14f1, B:437:0x14f5, B:438:0x1505, B:440:0x1518, B:441:0x151f, B:443:0x1529, B:446:0x153a, B:448:0x153f, B:449:0x155e, B:451:0x1566, B:452:0x158a, B:454:0x1591, B:455:0x1598, B:457:0x159d, B:459:0x15a8, B:465:0x15c2, B:467:0x15ca, B:469:0x15d4, B:470:0x15d6, B:481:0x1678, B:471:0x15d9, B:473:0x1643, B:475:0x1647, B:477:0x164f, B:478:0x1664, B:480:0x166a, B:482:0x167f, B:483:0x1684, B:485:0x1688, B:487:0x168c, B:488:0x168f, B:490:0x1695, B:491:0x169a, B:445:0x1533, B:462:0x15af, B:463:0x15b6, B:391:0x13cf, B:202:0x0f31, B:204:0x0f3c, B:205:0x0f44, B:207:0x0f4a, B:190:0x0eb2, B:191:0x0eec, B:193:0x0ef2, B:194:0x0f00, B:195:0x0f12, B:197:0x0f18, B:168:0x0e42, B:159:0x0b31, B:60:0x01a6, B:28:0x00c3, B:30:0x00cd, B:32:0x00d7, B:34:0x00e5, B:36:0x00f0, B:35:0x00ec), top: B:496:0x00ad }] */
    /* JADX WARN: Removed duplicated region for block: B:178:0x0e86 A[Catch: JSONException -> 0x169e, TryCatch #0 {JSONException -> 0x169e, blocks: (B:23:0x00ad, B:25:0x00b1, B:27:0x00bc, B:29:0x00c7, B:38:0x00fc, B:40:0x0104, B:42:0x0108, B:43:0x0116, B:45:0x011e, B:46:0x012a, B:48:0x0130, B:50:0x0146, B:51:0x0158, B:53:0x015c, B:55:0x0164, B:56:0x0176, B:58:0x0195, B:63:0x01b2, B:65:0x01c5, B:66:0x01ca, B:68:0x01d2, B:69:0x01d6, B:71:0x01dc, B:72:0x01ea, B:74:0x01fb, B:76:0x020b, B:80:0x024d, B:82:0x0251, B:93:0x026e, B:95:0x0273, B:97:0x0277, B:99:0x0282, B:100:0x028f, B:106:0x02a0, B:109:0x02a8, B:110:0x02bc, B:112:0x02c2, B:113:0x02d1, B:114:0x02e7, B:116:0x02ed, B:117:0x02fb, B:120:0x032c, B:124:0x037d, B:128:0x03c4, B:131:0x06b9, B:135:0x06ca, B:139:0x06f7, B:141:0x09f9, B:142:0x09fb, B:144:0x0a05, B:145:0x0a07, B:147:0x0a11, B:148:0x0a13, B:156:0x0acb, B:160:0x0b3b, B:164:0x0ca9, B:167:0x0d14, B:171:0x0e50, B:173:0x0e70, B:175:0x0e76, B:176:0x0e7f, B:178:0x0e86, B:179:0x0e8b, B:181:0x0e95, B:182:0x0e9e, B:184:0x0ea6, B:186:0x0eaa, B:188:0x0eae, B:198:0x0f26, B:200:0x0f2b, B:208:0x0f5e, B:210:0x0f63, B:212:0x0f7f, B:213:0x0f87, B:215:0x0f8d, B:216:0x0fa1, B:217:0x0faa, B:219:0x0fb9, B:221:0x0fc1, B:223:0x0fd0, B:224:0x0fdb, B:226:0x0fe3, B:227:0x0fee, B:229:0x0ff6, B:230:0x1001, B:232:0x1009, B:233:0x1014, B:235:0x101c, B:236:0x1027, B:238:0x102f, B:239:0x103a, B:241:0x1042, B:242:0x104d, B:244:0x1055, B:245:0x1060, B:247:0x1066, B:248:0x106d, B:250:0x1075, B:251:0x1080, B:253:0x1086, B:254:0x108d, B:256:0x1095, B:257:0x10a0, B:259:0x10a8, B:260:0x10b3, B:262:0x10bb, B:263:0x10c6, B:265:0x10ce, B:266:0x10d9, B:268:0x10e1, B:269:0x10ec, B:271:0x10f2, B:272:0x10f9, B:274:0x1101, B:275:0x110c, B:277:0x1114, B:278:0x111f, B:280:0x1127, B:281:0x1132, B:283:0x1138, B:284:0x113f, B:286:0x1149, B:288:0x114f, B:290:0x115c, B:291:0x1167, B:293:0x116f, B:294:0x117a, B:296:0x1182, B:297:0x118d, B:299:0x1195, B:300:0x11a0, B:302:0x11a8, B:303:0x11b3, B:305:0x11bb, B:306:0x11c6, B:308:0x11ce, B:309:0x11d9, B:311:0x11e1, B:312:0x11ec, B:314:0x11f4, B:315:0x11ff, B:317:0x1207, B:318:0x1212, B:320:0x121a, B:321:0x1225, B:323:0x122d, B:324:0x1238, B:326:0x1240, B:327:0x124b, B:329:0x1253, B:330:0x125e, B:332:0x1266, B:333:0x1271, B:335:0x1279, B:336:0x1284, B:338:0x128c, B:339:0x1297, B:341:0x129f, B:342:0x12aa, B:344:0x12b2, B:345:0x12bd, B:347:0x12c5, B:348:0x12d0, B:350:0x12d8, B:351:0x12e3, B:353:0x12eb, B:354:0x12f6, B:356:0x12fe, B:357:0x1309, B:359:0x1311, B:360:0x131c, B:362:0x1324, B:363:0x132f, B:365:0x1337, B:366:0x1342, B:368:0x134a, B:369:0x1355, B:371:0x135d, B:372:0x1368, B:374:0x1370, B:375:0x137b, B:377:0x137f, B:379:0x1383, B:381:0x138d, B:382:0x1392, B:384:0x1399, B:385:0x139c, B:387:0x13b3, B:388:0x13bb, B:394:0x13d9, B:399:0x13f4, B:401:0x13fb, B:402:0x1400, B:404:0x1404, B:405:0x143f, B:407:0x1445, B:408:0x144a, B:410:0x144f, B:411:0x1454, B:413:0x1458, B:414:0x1463, B:416:0x1467, B:417:0x147c, B:419:0x1495, B:420:0x149e, B:422:0x14a2, B:423:0x14b5, B:425:0x14b9, B:426:0x14d5, B:428:0x14d9, B:429:0x14de, B:431:0x14e2, B:432:0x14e7, B:434:0x14eb, B:435:0x14f1, B:437:0x14f5, B:438:0x1505, B:440:0x1518, B:441:0x151f, B:443:0x1529, B:446:0x153a, B:448:0x153f, B:449:0x155e, B:451:0x1566, B:452:0x158a, B:454:0x1591, B:455:0x1598, B:457:0x159d, B:459:0x15a8, B:465:0x15c2, B:467:0x15ca, B:469:0x15d4, B:470:0x15d6, B:481:0x1678, B:471:0x15d9, B:473:0x1643, B:475:0x1647, B:477:0x164f, B:478:0x1664, B:480:0x166a, B:482:0x167f, B:483:0x1684, B:485:0x1688, B:487:0x168c, B:488:0x168f, B:490:0x1695, B:491:0x169a, B:445:0x1533, B:462:0x15af, B:463:0x15b6, B:391:0x13cf, B:202:0x0f31, B:204:0x0f3c, B:205:0x0f44, B:207:0x0f4a, B:190:0x0eb2, B:191:0x0eec, B:193:0x0ef2, B:194:0x0f00, B:195:0x0f12, B:197:0x0f18, B:168:0x0e42, B:159:0x0b31, B:60:0x01a6, B:28:0x00c3, B:30:0x00cd, B:32:0x00d7, B:34:0x00e5, B:36:0x00f0, B:35:0x00ec), top: B:496:0x00ad }] */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0e95 A[Catch: JSONException -> 0x169e, TryCatch #0 {JSONException -> 0x169e, blocks: (B:23:0x00ad, B:25:0x00b1, B:27:0x00bc, B:29:0x00c7, B:38:0x00fc, B:40:0x0104, B:42:0x0108, B:43:0x0116, B:45:0x011e, B:46:0x012a, B:48:0x0130, B:50:0x0146, B:51:0x0158, B:53:0x015c, B:55:0x0164, B:56:0x0176, B:58:0x0195, B:63:0x01b2, B:65:0x01c5, B:66:0x01ca, B:68:0x01d2, B:69:0x01d6, B:71:0x01dc, B:72:0x01ea, B:74:0x01fb, B:76:0x020b, B:80:0x024d, B:82:0x0251, B:93:0x026e, B:95:0x0273, B:97:0x0277, B:99:0x0282, B:100:0x028f, B:106:0x02a0, B:109:0x02a8, B:110:0x02bc, B:112:0x02c2, B:113:0x02d1, B:114:0x02e7, B:116:0x02ed, B:117:0x02fb, B:120:0x032c, B:124:0x037d, B:128:0x03c4, B:131:0x06b9, B:135:0x06ca, B:139:0x06f7, B:141:0x09f9, B:142:0x09fb, B:144:0x0a05, B:145:0x0a07, B:147:0x0a11, B:148:0x0a13, B:156:0x0acb, B:160:0x0b3b, B:164:0x0ca9, B:167:0x0d14, B:171:0x0e50, B:173:0x0e70, B:175:0x0e76, B:176:0x0e7f, B:178:0x0e86, B:179:0x0e8b, B:181:0x0e95, B:182:0x0e9e, B:184:0x0ea6, B:186:0x0eaa, B:188:0x0eae, B:198:0x0f26, B:200:0x0f2b, B:208:0x0f5e, B:210:0x0f63, B:212:0x0f7f, B:213:0x0f87, B:215:0x0f8d, B:216:0x0fa1, B:217:0x0faa, B:219:0x0fb9, B:221:0x0fc1, B:223:0x0fd0, B:224:0x0fdb, B:226:0x0fe3, B:227:0x0fee, B:229:0x0ff6, B:230:0x1001, B:232:0x1009, B:233:0x1014, B:235:0x101c, B:236:0x1027, B:238:0x102f, B:239:0x103a, B:241:0x1042, B:242:0x104d, B:244:0x1055, B:245:0x1060, B:247:0x1066, B:248:0x106d, B:250:0x1075, B:251:0x1080, B:253:0x1086, B:254:0x108d, B:256:0x1095, B:257:0x10a0, B:259:0x10a8, B:260:0x10b3, B:262:0x10bb, B:263:0x10c6, B:265:0x10ce, B:266:0x10d9, B:268:0x10e1, B:269:0x10ec, B:271:0x10f2, B:272:0x10f9, B:274:0x1101, B:275:0x110c, B:277:0x1114, B:278:0x111f, B:280:0x1127, B:281:0x1132, B:283:0x1138, B:284:0x113f, B:286:0x1149, B:288:0x114f, B:290:0x115c, B:291:0x1167, B:293:0x116f, B:294:0x117a, B:296:0x1182, B:297:0x118d, B:299:0x1195, B:300:0x11a0, B:302:0x11a8, B:303:0x11b3, B:305:0x11bb, B:306:0x11c6, B:308:0x11ce, B:309:0x11d9, B:311:0x11e1, B:312:0x11ec, B:314:0x11f4, B:315:0x11ff, B:317:0x1207, B:318:0x1212, B:320:0x121a, B:321:0x1225, B:323:0x122d, B:324:0x1238, B:326:0x1240, B:327:0x124b, B:329:0x1253, B:330:0x125e, B:332:0x1266, B:333:0x1271, B:335:0x1279, B:336:0x1284, B:338:0x128c, B:339:0x1297, B:341:0x129f, B:342:0x12aa, B:344:0x12b2, B:345:0x12bd, B:347:0x12c5, B:348:0x12d0, B:350:0x12d8, B:351:0x12e3, B:353:0x12eb, B:354:0x12f6, B:356:0x12fe, B:357:0x1309, B:359:0x1311, B:360:0x131c, B:362:0x1324, B:363:0x132f, B:365:0x1337, B:366:0x1342, B:368:0x134a, B:369:0x1355, B:371:0x135d, B:372:0x1368, B:374:0x1370, B:375:0x137b, B:377:0x137f, B:379:0x1383, B:381:0x138d, B:382:0x1392, B:384:0x1399, B:385:0x139c, B:387:0x13b3, B:388:0x13bb, B:394:0x13d9, B:399:0x13f4, B:401:0x13fb, B:402:0x1400, B:404:0x1404, B:405:0x143f, B:407:0x1445, B:408:0x144a, B:410:0x144f, B:411:0x1454, B:413:0x1458, B:414:0x1463, B:416:0x1467, B:417:0x147c, B:419:0x1495, B:420:0x149e, B:422:0x14a2, B:423:0x14b5, B:425:0x14b9, B:426:0x14d5, B:428:0x14d9, B:429:0x14de, B:431:0x14e2, B:432:0x14e7, B:434:0x14eb, B:435:0x14f1, B:437:0x14f5, B:438:0x1505, B:440:0x1518, B:441:0x151f, B:443:0x1529, B:446:0x153a, B:448:0x153f, B:449:0x155e, B:451:0x1566, B:452:0x158a, B:454:0x1591, B:455:0x1598, B:457:0x159d, B:459:0x15a8, B:465:0x15c2, B:467:0x15ca, B:469:0x15d4, B:470:0x15d6, B:481:0x1678, B:471:0x15d9, B:473:0x1643, B:475:0x1647, B:477:0x164f, B:478:0x1664, B:480:0x166a, B:482:0x167f, B:483:0x1684, B:485:0x1688, B:487:0x168c, B:488:0x168f, B:490:0x1695, B:491:0x169a, B:445:0x1533, B:462:0x15af, B:463:0x15b6, B:391:0x13cf, B:202:0x0f31, B:204:0x0f3c, B:205:0x0f44, B:207:0x0f4a, B:190:0x0eb2, B:191:0x0eec, B:193:0x0ef2, B:194:0x0f00, B:195:0x0f12, B:197:0x0f18, B:168:0x0e42, B:159:0x0b31, B:60:0x01a6, B:28:0x00c3, B:30:0x00cd, B:32:0x00d7, B:34:0x00e5, B:36:0x00f0, B:35:0x00ec), top: B:496:0x00ad }] */
    /* JADX WARN: Removed duplicated region for block: B:190:0x0eb2 A[Catch: JSONException -> 0x169e, TryCatch #0 {JSONException -> 0x169e, blocks: (B:23:0x00ad, B:25:0x00b1, B:27:0x00bc, B:29:0x00c7, B:38:0x00fc, B:40:0x0104, B:42:0x0108, B:43:0x0116, B:45:0x011e, B:46:0x012a, B:48:0x0130, B:50:0x0146, B:51:0x0158, B:53:0x015c, B:55:0x0164, B:56:0x0176, B:58:0x0195, B:63:0x01b2, B:65:0x01c5, B:66:0x01ca, B:68:0x01d2, B:69:0x01d6, B:71:0x01dc, B:72:0x01ea, B:74:0x01fb, B:76:0x020b, B:80:0x024d, B:82:0x0251, B:93:0x026e, B:95:0x0273, B:97:0x0277, B:99:0x0282, B:100:0x028f, B:106:0x02a0, B:109:0x02a8, B:110:0x02bc, B:112:0x02c2, B:113:0x02d1, B:114:0x02e7, B:116:0x02ed, B:117:0x02fb, B:120:0x032c, B:124:0x037d, B:128:0x03c4, B:131:0x06b9, B:135:0x06ca, B:139:0x06f7, B:141:0x09f9, B:142:0x09fb, B:144:0x0a05, B:145:0x0a07, B:147:0x0a11, B:148:0x0a13, B:156:0x0acb, B:160:0x0b3b, B:164:0x0ca9, B:167:0x0d14, B:171:0x0e50, B:173:0x0e70, B:175:0x0e76, B:176:0x0e7f, B:178:0x0e86, B:179:0x0e8b, B:181:0x0e95, B:182:0x0e9e, B:184:0x0ea6, B:186:0x0eaa, B:188:0x0eae, B:198:0x0f26, B:200:0x0f2b, B:208:0x0f5e, B:210:0x0f63, B:212:0x0f7f, B:213:0x0f87, B:215:0x0f8d, B:216:0x0fa1, B:217:0x0faa, B:219:0x0fb9, B:221:0x0fc1, B:223:0x0fd0, B:224:0x0fdb, B:226:0x0fe3, B:227:0x0fee, B:229:0x0ff6, B:230:0x1001, B:232:0x1009, B:233:0x1014, B:235:0x101c, B:236:0x1027, B:238:0x102f, B:239:0x103a, B:241:0x1042, B:242:0x104d, B:244:0x1055, B:245:0x1060, B:247:0x1066, B:248:0x106d, B:250:0x1075, B:251:0x1080, B:253:0x1086, B:254:0x108d, B:256:0x1095, B:257:0x10a0, B:259:0x10a8, B:260:0x10b3, B:262:0x10bb, B:263:0x10c6, B:265:0x10ce, B:266:0x10d9, B:268:0x10e1, B:269:0x10ec, B:271:0x10f2, B:272:0x10f9, B:274:0x1101, B:275:0x110c, B:277:0x1114, B:278:0x111f, B:280:0x1127, B:281:0x1132, B:283:0x1138, B:284:0x113f, B:286:0x1149, B:288:0x114f, B:290:0x115c, B:291:0x1167, B:293:0x116f, B:294:0x117a, B:296:0x1182, B:297:0x118d, B:299:0x1195, B:300:0x11a0, B:302:0x11a8, B:303:0x11b3, B:305:0x11bb, B:306:0x11c6, B:308:0x11ce, B:309:0x11d9, B:311:0x11e1, B:312:0x11ec, B:314:0x11f4, B:315:0x11ff, B:317:0x1207, B:318:0x1212, B:320:0x121a, B:321:0x1225, B:323:0x122d, B:324:0x1238, B:326:0x1240, B:327:0x124b, B:329:0x1253, B:330:0x125e, B:332:0x1266, B:333:0x1271, B:335:0x1279, B:336:0x1284, B:338:0x128c, B:339:0x1297, B:341:0x129f, B:342:0x12aa, B:344:0x12b2, B:345:0x12bd, B:347:0x12c5, B:348:0x12d0, B:350:0x12d8, B:351:0x12e3, B:353:0x12eb, B:354:0x12f6, B:356:0x12fe, B:357:0x1309, B:359:0x1311, B:360:0x131c, B:362:0x1324, B:363:0x132f, B:365:0x1337, B:366:0x1342, B:368:0x134a, B:369:0x1355, B:371:0x135d, B:372:0x1368, B:374:0x1370, B:375:0x137b, B:377:0x137f, B:379:0x1383, B:381:0x138d, B:382:0x1392, B:384:0x1399, B:385:0x139c, B:387:0x13b3, B:388:0x13bb, B:394:0x13d9, B:399:0x13f4, B:401:0x13fb, B:402:0x1400, B:404:0x1404, B:405:0x143f, B:407:0x1445, B:408:0x144a, B:410:0x144f, B:411:0x1454, B:413:0x1458, B:414:0x1463, B:416:0x1467, B:417:0x147c, B:419:0x1495, B:420:0x149e, B:422:0x14a2, B:423:0x14b5, B:425:0x14b9, B:426:0x14d5, B:428:0x14d9, B:429:0x14de, B:431:0x14e2, B:432:0x14e7, B:434:0x14eb, B:435:0x14f1, B:437:0x14f5, B:438:0x1505, B:440:0x1518, B:441:0x151f, B:443:0x1529, B:446:0x153a, B:448:0x153f, B:449:0x155e, B:451:0x1566, B:452:0x158a, B:454:0x1591, B:455:0x1598, B:457:0x159d, B:459:0x15a8, B:465:0x15c2, B:467:0x15ca, B:469:0x15d4, B:470:0x15d6, B:481:0x1678, B:471:0x15d9, B:473:0x1643, B:475:0x1647, B:477:0x164f, B:478:0x1664, B:480:0x166a, B:482:0x167f, B:483:0x1684, B:485:0x1688, B:487:0x168c, B:488:0x168f, B:490:0x1695, B:491:0x169a, B:445:0x1533, B:462:0x15af, B:463:0x15b6, B:391:0x13cf, B:202:0x0f31, B:204:0x0f3c, B:205:0x0f44, B:207:0x0f4a, B:190:0x0eb2, B:191:0x0eec, B:193:0x0ef2, B:194:0x0f00, B:195:0x0f12, B:197:0x0f18, B:168:0x0e42, B:159:0x0b31, B:60:0x01a6, B:28:0x00c3, B:30:0x00cd, B:32:0x00d7, B:34:0x00e5, B:36:0x00f0, B:35:0x00ec), top: B:496:0x00ad }] */
    /* JADX WARN: Removed duplicated region for block: B:193:0x0ef2 A[Catch: JSONException -> 0x169e, LOOP:7: B:191:0x0eec->B:193:0x0ef2, LOOP_END, TryCatch #0 {JSONException -> 0x169e, blocks: (B:23:0x00ad, B:25:0x00b1, B:27:0x00bc, B:29:0x00c7, B:38:0x00fc, B:40:0x0104, B:42:0x0108, B:43:0x0116, B:45:0x011e, B:46:0x012a, B:48:0x0130, B:50:0x0146, B:51:0x0158, B:53:0x015c, B:55:0x0164, B:56:0x0176, B:58:0x0195, B:63:0x01b2, B:65:0x01c5, B:66:0x01ca, B:68:0x01d2, B:69:0x01d6, B:71:0x01dc, B:72:0x01ea, B:74:0x01fb, B:76:0x020b, B:80:0x024d, B:82:0x0251, B:93:0x026e, B:95:0x0273, B:97:0x0277, B:99:0x0282, B:100:0x028f, B:106:0x02a0, B:109:0x02a8, B:110:0x02bc, B:112:0x02c2, B:113:0x02d1, B:114:0x02e7, B:116:0x02ed, B:117:0x02fb, B:120:0x032c, B:124:0x037d, B:128:0x03c4, B:131:0x06b9, B:135:0x06ca, B:139:0x06f7, B:141:0x09f9, B:142:0x09fb, B:144:0x0a05, B:145:0x0a07, B:147:0x0a11, B:148:0x0a13, B:156:0x0acb, B:160:0x0b3b, B:164:0x0ca9, B:167:0x0d14, B:171:0x0e50, B:173:0x0e70, B:175:0x0e76, B:176:0x0e7f, B:178:0x0e86, B:179:0x0e8b, B:181:0x0e95, B:182:0x0e9e, B:184:0x0ea6, B:186:0x0eaa, B:188:0x0eae, B:198:0x0f26, B:200:0x0f2b, B:208:0x0f5e, B:210:0x0f63, B:212:0x0f7f, B:213:0x0f87, B:215:0x0f8d, B:216:0x0fa1, B:217:0x0faa, B:219:0x0fb9, B:221:0x0fc1, B:223:0x0fd0, B:224:0x0fdb, B:226:0x0fe3, B:227:0x0fee, B:229:0x0ff6, B:230:0x1001, B:232:0x1009, B:233:0x1014, B:235:0x101c, B:236:0x1027, B:238:0x102f, B:239:0x103a, B:241:0x1042, B:242:0x104d, B:244:0x1055, B:245:0x1060, B:247:0x1066, B:248:0x106d, B:250:0x1075, B:251:0x1080, B:253:0x1086, B:254:0x108d, B:256:0x1095, B:257:0x10a0, B:259:0x10a8, B:260:0x10b3, B:262:0x10bb, B:263:0x10c6, B:265:0x10ce, B:266:0x10d9, B:268:0x10e1, B:269:0x10ec, B:271:0x10f2, B:272:0x10f9, B:274:0x1101, B:275:0x110c, B:277:0x1114, B:278:0x111f, B:280:0x1127, B:281:0x1132, B:283:0x1138, B:284:0x113f, B:286:0x1149, B:288:0x114f, B:290:0x115c, B:291:0x1167, B:293:0x116f, B:294:0x117a, B:296:0x1182, B:297:0x118d, B:299:0x1195, B:300:0x11a0, B:302:0x11a8, B:303:0x11b3, B:305:0x11bb, B:306:0x11c6, B:308:0x11ce, B:309:0x11d9, B:311:0x11e1, B:312:0x11ec, B:314:0x11f4, B:315:0x11ff, B:317:0x1207, B:318:0x1212, B:320:0x121a, B:321:0x1225, B:323:0x122d, B:324:0x1238, B:326:0x1240, B:327:0x124b, B:329:0x1253, B:330:0x125e, B:332:0x1266, B:333:0x1271, B:335:0x1279, B:336:0x1284, B:338:0x128c, B:339:0x1297, B:341:0x129f, B:342:0x12aa, B:344:0x12b2, B:345:0x12bd, B:347:0x12c5, B:348:0x12d0, B:350:0x12d8, B:351:0x12e3, B:353:0x12eb, B:354:0x12f6, B:356:0x12fe, B:357:0x1309, B:359:0x1311, B:360:0x131c, B:362:0x1324, B:363:0x132f, B:365:0x1337, B:366:0x1342, B:368:0x134a, B:369:0x1355, B:371:0x135d, B:372:0x1368, B:374:0x1370, B:375:0x137b, B:377:0x137f, B:379:0x1383, B:381:0x138d, B:382:0x1392, B:384:0x1399, B:385:0x139c, B:387:0x13b3, B:388:0x13bb, B:394:0x13d9, B:399:0x13f4, B:401:0x13fb, B:402:0x1400, B:404:0x1404, B:405:0x143f, B:407:0x1445, B:408:0x144a, B:410:0x144f, B:411:0x1454, B:413:0x1458, B:414:0x1463, B:416:0x1467, B:417:0x147c, B:419:0x1495, B:420:0x149e, B:422:0x14a2, B:423:0x14b5, B:425:0x14b9, B:426:0x14d5, B:428:0x14d9, B:429:0x14de, B:431:0x14e2, B:432:0x14e7, B:434:0x14eb, B:435:0x14f1, B:437:0x14f5, B:438:0x1505, B:440:0x1518, B:441:0x151f, B:443:0x1529, B:446:0x153a, B:448:0x153f, B:449:0x155e, B:451:0x1566, B:452:0x158a, B:454:0x1591, B:455:0x1598, B:457:0x159d, B:459:0x15a8, B:465:0x15c2, B:467:0x15ca, B:469:0x15d4, B:470:0x15d6, B:481:0x1678, B:471:0x15d9, B:473:0x1643, B:475:0x1647, B:477:0x164f, B:478:0x1664, B:480:0x166a, B:482:0x167f, B:483:0x1684, B:485:0x1688, B:487:0x168c, B:488:0x168f, B:490:0x1695, B:491:0x169a, B:445:0x1533, B:462:0x15af, B:463:0x15b6, B:391:0x13cf, B:202:0x0f31, B:204:0x0f3c, B:205:0x0f44, B:207:0x0f4a, B:190:0x0eb2, B:191:0x0eec, B:193:0x0ef2, B:194:0x0f00, B:195:0x0f12, B:197:0x0f18, B:168:0x0e42, B:159:0x0b31, B:60:0x01a6, B:28:0x00c3, B:30:0x00cd, B:32:0x00d7, B:34:0x00e5, B:36:0x00f0, B:35:0x00ec), top: B:496:0x00ad }] */
    /* JADX WARN: Removed duplicated region for block: B:197:0x0f18 A[Catch: JSONException -> 0x169e, LOOP:8: B:195:0x0f12->B:197:0x0f18, LOOP_END, TryCatch #0 {JSONException -> 0x169e, blocks: (B:23:0x00ad, B:25:0x00b1, B:27:0x00bc, B:29:0x00c7, B:38:0x00fc, B:40:0x0104, B:42:0x0108, B:43:0x0116, B:45:0x011e, B:46:0x012a, B:48:0x0130, B:50:0x0146, B:51:0x0158, B:53:0x015c, B:55:0x0164, B:56:0x0176, B:58:0x0195, B:63:0x01b2, B:65:0x01c5, B:66:0x01ca, B:68:0x01d2, B:69:0x01d6, B:71:0x01dc, B:72:0x01ea, B:74:0x01fb, B:76:0x020b, B:80:0x024d, B:82:0x0251, B:93:0x026e, B:95:0x0273, B:97:0x0277, B:99:0x0282, B:100:0x028f, B:106:0x02a0, B:109:0x02a8, B:110:0x02bc, B:112:0x02c2, B:113:0x02d1, B:114:0x02e7, B:116:0x02ed, B:117:0x02fb, B:120:0x032c, B:124:0x037d, B:128:0x03c4, B:131:0x06b9, B:135:0x06ca, B:139:0x06f7, B:141:0x09f9, B:142:0x09fb, B:144:0x0a05, B:145:0x0a07, B:147:0x0a11, B:148:0x0a13, B:156:0x0acb, B:160:0x0b3b, B:164:0x0ca9, B:167:0x0d14, B:171:0x0e50, B:173:0x0e70, B:175:0x0e76, B:176:0x0e7f, B:178:0x0e86, B:179:0x0e8b, B:181:0x0e95, B:182:0x0e9e, B:184:0x0ea6, B:186:0x0eaa, B:188:0x0eae, B:198:0x0f26, B:200:0x0f2b, B:208:0x0f5e, B:210:0x0f63, B:212:0x0f7f, B:213:0x0f87, B:215:0x0f8d, B:216:0x0fa1, B:217:0x0faa, B:219:0x0fb9, B:221:0x0fc1, B:223:0x0fd0, B:224:0x0fdb, B:226:0x0fe3, B:227:0x0fee, B:229:0x0ff6, B:230:0x1001, B:232:0x1009, B:233:0x1014, B:235:0x101c, B:236:0x1027, B:238:0x102f, B:239:0x103a, B:241:0x1042, B:242:0x104d, B:244:0x1055, B:245:0x1060, B:247:0x1066, B:248:0x106d, B:250:0x1075, B:251:0x1080, B:253:0x1086, B:254:0x108d, B:256:0x1095, B:257:0x10a0, B:259:0x10a8, B:260:0x10b3, B:262:0x10bb, B:263:0x10c6, B:265:0x10ce, B:266:0x10d9, B:268:0x10e1, B:269:0x10ec, B:271:0x10f2, B:272:0x10f9, B:274:0x1101, B:275:0x110c, B:277:0x1114, B:278:0x111f, B:280:0x1127, B:281:0x1132, B:283:0x1138, B:284:0x113f, B:286:0x1149, B:288:0x114f, B:290:0x115c, B:291:0x1167, B:293:0x116f, B:294:0x117a, B:296:0x1182, B:297:0x118d, B:299:0x1195, B:300:0x11a0, B:302:0x11a8, B:303:0x11b3, B:305:0x11bb, B:306:0x11c6, B:308:0x11ce, B:309:0x11d9, B:311:0x11e1, B:312:0x11ec, B:314:0x11f4, B:315:0x11ff, B:317:0x1207, B:318:0x1212, B:320:0x121a, B:321:0x1225, B:323:0x122d, B:324:0x1238, B:326:0x1240, B:327:0x124b, B:329:0x1253, B:330:0x125e, B:332:0x1266, B:333:0x1271, B:335:0x1279, B:336:0x1284, B:338:0x128c, B:339:0x1297, B:341:0x129f, B:342:0x12aa, B:344:0x12b2, B:345:0x12bd, B:347:0x12c5, B:348:0x12d0, B:350:0x12d8, B:351:0x12e3, B:353:0x12eb, B:354:0x12f6, B:356:0x12fe, B:357:0x1309, B:359:0x1311, B:360:0x131c, B:362:0x1324, B:363:0x132f, B:365:0x1337, B:366:0x1342, B:368:0x134a, B:369:0x1355, B:371:0x135d, B:372:0x1368, B:374:0x1370, B:375:0x137b, B:377:0x137f, B:379:0x1383, B:381:0x138d, B:382:0x1392, B:384:0x1399, B:385:0x139c, B:387:0x13b3, B:388:0x13bb, B:394:0x13d9, B:399:0x13f4, B:401:0x13fb, B:402:0x1400, B:404:0x1404, B:405:0x143f, B:407:0x1445, B:408:0x144a, B:410:0x144f, B:411:0x1454, B:413:0x1458, B:414:0x1463, B:416:0x1467, B:417:0x147c, B:419:0x1495, B:420:0x149e, B:422:0x14a2, B:423:0x14b5, B:425:0x14b9, B:426:0x14d5, B:428:0x14d9, B:429:0x14de, B:431:0x14e2, B:432:0x14e7, B:434:0x14eb, B:435:0x14f1, B:437:0x14f5, B:438:0x1505, B:440:0x1518, B:441:0x151f, B:443:0x1529, B:446:0x153a, B:448:0x153f, B:449:0x155e, B:451:0x1566, B:452:0x158a, B:454:0x1591, B:455:0x1598, B:457:0x159d, B:459:0x15a8, B:465:0x15c2, B:467:0x15ca, B:469:0x15d4, B:470:0x15d6, B:481:0x1678, B:471:0x15d9, B:473:0x1643, B:475:0x1647, B:477:0x164f, B:478:0x1664, B:480:0x166a, B:482:0x167f, B:483:0x1684, B:485:0x1688, B:487:0x168c, B:488:0x168f, B:490:0x1695, B:491:0x169a, B:445:0x1533, B:462:0x15af, B:463:0x15b6, B:391:0x13cf, B:202:0x0f31, B:204:0x0f3c, B:205:0x0f44, B:207:0x0f4a, B:190:0x0eb2, B:191:0x0eec, B:193:0x0ef2, B:194:0x0f00, B:195:0x0f12, B:197:0x0f18, B:168:0x0e42, B:159:0x0b31, B:60:0x01a6, B:28:0x00c3, B:30:0x00cd, B:32:0x00d7, B:34:0x00e5, B:36:0x00f0, B:35:0x00ec), top: B:496:0x00ad }] */
    /* JADX WARN: Removed duplicated region for block: B:202:0x0f31 A[Catch: JSONException -> 0x169e, TryCatch #0 {JSONException -> 0x169e, blocks: (B:23:0x00ad, B:25:0x00b1, B:27:0x00bc, B:29:0x00c7, B:38:0x00fc, B:40:0x0104, B:42:0x0108, B:43:0x0116, B:45:0x011e, B:46:0x012a, B:48:0x0130, B:50:0x0146, B:51:0x0158, B:53:0x015c, B:55:0x0164, B:56:0x0176, B:58:0x0195, B:63:0x01b2, B:65:0x01c5, B:66:0x01ca, B:68:0x01d2, B:69:0x01d6, B:71:0x01dc, B:72:0x01ea, B:74:0x01fb, B:76:0x020b, B:80:0x024d, B:82:0x0251, B:93:0x026e, B:95:0x0273, B:97:0x0277, B:99:0x0282, B:100:0x028f, B:106:0x02a0, B:109:0x02a8, B:110:0x02bc, B:112:0x02c2, B:113:0x02d1, B:114:0x02e7, B:116:0x02ed, B:117:0x02fb, B:120:0x032c, B:124:0x037d, B:128:0x03c4, B:131:0x06b9, B:135:0x06ca, B:139:0x06f7, B:141:0x09f9, B:142:0x09fb, B:144:0x0a05, B:145:0x0a07, B:147:0x0a11, B:148:0x0a13, B:156:0x0acb, B:160:0x0b3b, B:164:0x0ca9, B:167:0x0d14, B:171:0x0e50, B:173:0x0e70, B:175:0x0e76, B:176:0x0e7f, B:178:0x0e86, B:179:0x0e8b, B:181:0x0e95, B:182:0x0e9e, B:184:0x0ea6, B:186:0x0eaa, B:188:0x0eae, B:198:0x0f26, B:200:0x0f2b, B:208:0x0f5e, B:210:0x0f63, B:212:0x0f7f, B:213:0x0f87, B:215:0x0f8d, B:216:0x0fa1, B:217:0x0faa, B:219:0x0fb9, B:221:0x0fc1, B:223:0x0fd0, B:224:0x0fdb, B:226:0x0fe3, B:227:0x0fee, B:229:0x0ff6, B:230:0x1001, B:232:0x1009, B:233:0x1014, B:235:0x101c, B:236:0x1027, B:238:0x102f, B:239:0x103a, B:241:0x1042, B:242:0x104d, B:244:0x1055, B:245:0x1060, B:247:0x1066, B:248:0x106d, B:250:0x1075, B:251:0x1080, B:253:0x1086, B:254:0x108d, B:256:0x1095, B:257:0x10a0, B:259:0x10a8, B:260:0x10b3, B:262:0x10bb, B:263:0x10c6, B:265:0x10ce, B:266:0x10d9, B:268:0x10e1, B:269:0x10ec, B:271:0x10f2, B:272:0x10f9, B:274:0x1101, B:275:0x110c, B:277:0x1114, B:278:0x111f, B:280:0x1127, B:281:0x1132, B:283:0x1138, B:284:0x113f, B:286:0x1149, B:288:0x114f, B:290:0x115c, B:291:0x1167, B:293:0x116f, B:294:0x117a, B:296:0x1182, B:297:0x118d, B:299:0x1195, B:300:0x11a0, B:302:0x11a8, B:303:0x11b3, B:305:0x11bb, B:306:0x11c6, B:308:0x11ce, B:309:0x11d9, B:311:0x11e1, B:312:0x11ec, B:314:0x11f4, B:315:0x11ff, B:317:0x1207, B:318:0x1212, B:320:0x121a, B:321:0x1225, B:323:0x122d, B:324:0x1238, B:326:0x1240, B:327:0x124b, B:329:0x1253, B:330:0x125e, B:332:0x1266, B:333:0x1271, B:335:0x1279, B:336:0x1284, B:338:0x128c, B:339:0x1297, B:341:0x129f, B:342:0x12aa, B:344:0x12b2, B:345:0x12bd, B:347:0x12c5, B:348:0x12d0, B:350:0x12d8, B:351:0x12e3, B:353:0x12eb, B:354:0x12f6, B:356:0x12fe, B:357:0x1309, B:359:0x1311, B:360:0x131c, B:362:0x1324, B:363:0x132f, B:365:0x1337, B:366:0x1342, B:368:0x134a, B:369:0x1355, B:371:0x135d, B:372:0x1368, B:374:0x1370, B:375:0x137b, B:377:0x137f, B:379:0x1383, B:381:0x138d, B:382:0x1392, B:384:0x1399, B:385:0x139c, B:387:0x13b3, B:388:0x13bb, B:394:0x13d9, B:399:0x13f4, B:401:0x13fb, B:402:0x1400, B:404:0x1404, B:405:0x143f, B:407:0x1445, B:408:0x144a, B:410:0x144f, B:411:0x1454, B:413:0x1458, B:414:0x1463, B:416:0x1467, B:417:0x147c, B:419:0x1495, B:420:0x149e, B:422:0x14a2, B:423:0x14b5, B:425:0x14b9, B:426:0x14d5, B:428:0x14d9, B:429:0x14de, B:431:0x14e2, B:432:0x14e7, B:434:0x14eb, B:435:0x14f1, B:437:0x14f5, B:438:0x1505, B:440:0x1518, B:441:0x151f, B:443:0x1529, B:446:0x153a, B:448:0x153f, B:449:0x155e, B:451:0x1566, B:452:0x158a, B:454:0x1591, B:455:0x1598, B:457:0x159d, B:459:0x15a8, B:465:0x15c2, B:467:0x15ca, B:469:0x15d4, B:470:0x15d6, B:481:0x1678, B:471:0x15d9, B:473:0x1643, B:475:0x1647, B:477:0x164f, B:478:0x1664, B:480:0x166a, B:482:0x167f, B:483:0x1684, B:485:0x1688, B:487:0x168c, B:488:0x168f, B:490:0x1695, B:491:0x169a, B:445:0x1533, B:462:0x15af, B:463:0x15b6, B:391:0x13cf, B:202:0x0f31, B:204:0x0f3c, B:205:0x0f44, B:207:0x0f4a, B:190:0x0eb2, B:191:0x0eec, B:193:0x0ef2, B:194:0x0f00, B:195:0x0f12, B:197:0x0f18, B:168:0x0e42, B:159:0x0b31, B:60:0x01a6, B:28:0x00c3, B:30:0x00cd, B:32:0x00d7, B:34:0x00e5, B:36:0x00f0, B:35:0x00ec), top: B:496:0x00ad }] */
    /* JADX WARN: Removed duplicated region for block: B:204:0x0f3c A[Catch: JSONException -> 0x169e, TryCatch #0 {JSONException -> 0x169e, blocks: (B:23:0x00ad, B:25:0x00b1, B:27:0x00bc, B:29:0x00c7, B:38:0x00fc, B:40:0x0104, B:42:0x0108, B:43:0x0116, B:45:0x011e, B:46:0x012a, B:48:0x0130, B:50:0x0146, B:51:0x0158, B:53:0x015c, B:55:0x0164, B:56:0x0176, B:58:0x0195, B:63:0x01b2, B:65:0x01c5, B:66:0x01ca, B:68:0x01d2, B:69:0x01d6, B:71:0x01dc, B:72:0x01ea, B:74:0x01fb, B:76:0x020b, B:80:0x024d, B:82:0x0251, B:93:0x026e, B:95:0x0273, B:97:0x0277, B:99:0x0282, B:100:0x028f, B:106:0x02a0, B:109:0x02a8, B:110:0x02bc, B:112:0x02c2, B:113:0x02d1, B:114:0x02e7, B:116:0x02ed, B:117:0x02fb, B:120:0x032c, B:124:0x037d, B:128:0x03c4, B:131:0x06b9, B:135:0x06ca, B:139:0x06f7, B:141:0x09f9, B:142:0x09fb, B:144:0x0a05, B:145:0x0a07, B:147:0x0a11, B:148:0x0a13, B:156:0x0acb, B:160:0x0b3b, B:164:0x0ca9, B:167:0x0d14, B:171:0x0e50, B:173:0x0e70, B:175:0x0e76, B:176:0x0e7f, B:178:0x0e86, B:179:0x0e8b, B:181:0x0e95, B:182:0x0e9e, B:184:0x0ea6, B:186:0x0eaa, B:188:0x0eae, B:198:0x0f26, B:200:0x0f2b, B:208:0x0f5e, B:210:0x0f63, B:212:0x0f7f, B:213:0x0f87, B:215:0x0f8d, B:216:0x0fa1, B:217:0x0faa, B:219:0x0fb9, B:221:0x0fc1, B:223:0x0fd0, B:224:0x0fdb, B:226:0x0fe3, B:227:0x0fee, B:229:0x0ff6, B:230:0x1001, B:232:0x1009, B:233:0x1014, B:235:0x101c, B:236:0x1027, B:238:0x102f, B:239:0x103a, B:241:0x1042, B:242:0x104d, B:244:0x1055, B:245:0x1060, B:247:0x1066, B:248:0x106d, B:250:0x1075, B:251:0x1080, B:253:0x1086, B:254:0x108d, B:256:0x1095, B:257:0x10a0, B:259:0x10a8, B:260:0x10b3, B:262:0x10bb, B:263:0x10c6, B:265:0x10ce, B:266:0x10d9, B:268:0x10e1, B:269:0x10ec, B:271:0x10f2, B:272:0x10f9, B:274:0x1101, B:275:0x110c, B:277:0x1114, B:278:0x111f, B:280:0x1127, B:281:0x1132, B:283:0x1138, B:284:0x113f, B:286:0x1149, B:288:0x114f, B:290:0x115c, B:291:0x1167, B:293:0x116f, B:294:0x117a, B:296:0x1182, B:297:0x118d, B:299:0x1195, B:300:0x11a0, B:302:0x11a8, B:303:0x11b3, B:305:0x11bb, B:306:0x11c6, B:308:0x11ce, B:309:0x11d9, B:311:0x11e1, B:312:0x11ec, B:314:0x11f4, B:315:0x11ff, B:317:0x1207, B:318:0x1212, B:320:0x121a, B:321:0x1225, B:323:0x122d, B:324:0x1238, B:326:0x1240, B:327:0x124b, B:329:0x1253, B:330:0x125e, B:332:0x1266, B:333:0x1271, B:335:0x1279, B:336:0x1284, B:338:0x128c, B:339:0x1297, B:341:0x129f, B:342:0x12aa, B:344:0x12b2, B:345:0x12bd, B:347:0x12c5, B:348:0x12d0, B:350:0x12d8, B:351:0x12e3, B:353:0x12eb, B:354:0x12f6, B:356:0x12fe, B:357:0x1309, B:359:0x1311, B:360:0x131c, B:362:0x1324, B:363:0x132f, B:365:0x1337, B:366:0x1342, B:368:0x134a, B:369:0x1355, B:371:0x135d, B:372:0x1368, B:374:0x1370, B:375:0x137b, B:377:0x137f, B:379:0x1383, B:381:0x138d, B:382:0x1392, B:384:0x1399, B:385:0x139c, B:387:0x13b3, B:388:0x13bb, B:394:0x13d9, B:399:0x13f4, B:401:0x13fb, B:402:0x1400, B:404:0x1404, B:405:0x143f, B:407:0x1445, B:408:0x144a, B:410:0x144f, B:411:0x1454, B:413:0x1458, B:414:0x1463, B:416:0x1467, B:417:0x147c, B:419:0x1495, B:420:0x149e, B:422:0x14a2, B:423:0x14b5, B:425:0x14b9, B:426:0x14d5, B:428:0x14d9, B:429:0x14de, B:431:0x14e2, B:432:0x14e7, B:434:0x14eb, B:435:0x14f1, B:437:0x14f5, B:438:0x1505, B:440:0x1518, B:441:0x151f, B:443:0x1529, B:446:0x153a, B:448:0x153f, B:449:0x155e, B:451:0x1566, B:452:0x158a, B:454:0x1591, B:455:0x1598, B:457:0x159d, B:459:0x15a8, B:465:0x15c2, B:467:0x15ca, B:469:0x15d4, B:470:0x15d6, B:481:0x1678, B:471:0x15d9, B:473:0x1643, B:475:0x1647, B:477:0x164f, B:478:0x1664, B:480:0x166a, B:482:0x167f, B:483:0x1684, B:485:0x1688, B:487:0x168c, B:488:0x168f, B:490:0x1695, B:491:0x169a, B:445:0x1533, B:462:0x15af, B:463:0x15b6, B:391:0x13cf, B:202:0x0f31, B:204:0x0f3c, B:205:0x0f44, B:207:0x0f4a, B:190:0x0eb2, B:191:0x0eec, B:193:0x0ef2, B:194:0x0f00, B:195:0x0f12, B:197:0x0f18, B:168:0x0e42, B:159:0x0b31, B:60:0x01a6, B:28:0x00c3, B:30:0x00cd, B:32:0x00d7, B:34:0x00e5, B:36:0x00f0, B:35:0x00ec), top: B:496:0x00ad }] */
    /* JADX WARN: Removed duplicated region for block: B:210:0x0f63 A[Catch: JSONException -> 0x169e, TryCatch #0 {JSONException -> 0x169e, blocks: (B:23:0x00ad, B:25:0x00b1, B:27:0x00bc, B:29:0x00c7, B:38:0x00fc, B:40:0x0104, B:42:0x0108, B:43:0x0116, B:45:0x011e, B:46:0x012a, B:48:0x0130, B:50:0x0146, B:51:0x0158, B:53:0x015c, B:55:0x0164, B:56:0x0176, B:58:0x0195, B:63:0x01b2, B:65:0x01c5, B:66:0x01ca, B:68:0x01d2, B:69:0x01d6, B:71:0x01dc, B:72:0x01ea, B:74:0x01fb, B:76:0x020b, B:80:0x024d, B:82:0x0251, B:93:0x026e, B:95:0x0273, B:97:0x0277, B:99:0x0282, B:100:0x028f, B:106:0x02a0, B:109:0x02a8, B:110:0x02bc, B:112:0x02c2, B:113:0x02d1, B:114:0x02e7, B:116:0x02ed, B:117:0x02fb, B:120:0x032c, B:124:0x037d, B:128:0x03c4, B:131:0x06b9, B:135:0x06ca, B:139:0x06f7, B:141:0x09f9, B:142:0x09fb, B:144:0x0a05, B:145:0x0a07, B:147:0x0a11, B:148:0x0a13, B:156:0x0acb, B:160:0x0b3b, B:164:0x0ca9, B:167:0x0d14, B:171:0x0e50, B:173:0x0e70, B:175:0x0e76, B:176:0x0e7f, B:178:0x0e86, B:179:0x0e8b, B:181:0x0e95, B:182:0x0e9e, B:184:0x0ea6, B:186:0x0eaa, B:188:0x0eae, B:198:0x0f26, B:200:0x0f2b, B:208:0x0f5e, B:210:0x0f63, B:212:0x0f7f, B:213:0x0f87, B:215:0x0f8d, B:216:0x0fa1, B:217:0x0faa, B:219:0x0fb9, B:221:0x0fc1, B:223:0x0fd0, B:224:0x0fdb, B:226:0x0fe3, B:227:0x0fee, B:229:0x0ff6, B:230:0x1001, B:232:0x1009, B:233:0x1014, B:235:0x101c, B:236:0x1027, B:238:0x102f, B:239:0x103a, B:241:0x1042, B:242:0x104d, B:244:0x1055, B:245:0x1060, B:247:0x1066, B:248:0x106d, B:250:0x1075, B:251:0x1080, B:253:0x1086, B:254:0x108d, B:256:0x1095, B:257:0x10a0, B:259:0x10a8, B:260:0x10b3, B:262:0x10bb, B:263:0x10c6, B:265:0x10ce, B:266:0x10d9, B:268:0x10e1, B:269:0x10ec, B:271:0x10f2, B:272:0x10f9, B:274:0x1101, B:275:0x110c, B:277:0x1114, B:278:0x111f, B:280:0x1127, B:281:0x1132, B:283:0x1138, B:284:0x113f, B:286:0x1149, B:288:0x114f, B:290:0x115c, B:291:0x1167, B:293:0x116f, B:294:0x117a, B:296:0x1182, B:297:0x118d, B:299:0x1195, B:300:0x11a0, B:302:0x11a8, B:303:0x11b3, B:305:0x11bb, B:306:0x11c6, B:308:0x11ce, B:309:0x11d9, B:311:0x11e1, B:312:0x11ec, B:314:0x11f4, B:315:0x11ff, B:317:0x1207, B:318:0x1212, B:320:0x121a, B:321:0x1225, B:323:0x122d, B:324:0x1238, B:326:0x1240, B:327:0x124b, B:329:0x1253, B:330:0x125e, B:332:0x1266, B:333:0x1271, B:335:0x1279, B:336:0x1284, B:338:0x128c, B:339:0x1297, B:341:0x129f, B:342:0x12aa, B:344:0x12b2, B:345:0x12bd, B:347:0x12c5, B:348:0x12d0, B:350:0x12d8, B:351:0x12e3, B:353:0x12eb, B:354:0x12f6, B:356:0x12fe, B:357:0x1309, B:359:0x1311, B:360:0x131c, B:362:0x1324, B:363:0x132f, B:365:0x1337, B:366:0x1342, B:368:0x134a, B:369:0x1355, B:371:0x135d, B:372:0x1368, B:374:0x1370, B:375:0x137b, B:377:0x137f, B:379:0x1383, B:381:0x138d, B:382:0x1392, B:384:0x1399, B:385:0x139c, B:387:0x13b3, B:388:0x13bb, B:394:0x13d9, B:399:0x13f4, B:401:0x13fb, B:402:0x1400, B:404:0x1404, B:405:0x143f, B:407:0x1445, B:408:0x144a, B:410:0x144f, B:411:0x1454, B:413:0x1458, B:414:0x1463, B:416:0x1467, B:417:0x147c, B:419:0x1495, B:420:0x149e, B:422:0x14a2, B:423:0x14b5, B:425:0x14b9, B:426:0x14d5, B:428:0x14d9, B:429:0x14de, B:431:0x14e2, B:432:0x14e7, B:434:0x14eb, B:435:0x14f1, B:437:0x14f5, B:438:0x1505, B:440:0x1518, B:441:0x151f, B:443:0x1529, B:446:0x153a, B:448:0x153f, B:449:0x155e, B:451:0x1566, B:452:0x158a, B:454:0x1591, B:455:0x1598, B:457:0x159d, B:459:0x15a8, B:465:0x15c2, B:467:0x15ca, B:469:0x15d4, B:470:0x15d6, B:481:0x1678, B:471:0x15d9, B:473:0x1643, B:475:0x1647, B:477:0x164f, B:478:0x1664, B:480:0x166a, B:482:0x167f, B:483:0x1684, B:485:0x1688, B:487:0x168c, B:488:0x168f, B:490:0x1695, B:491:0x169a, B:445:0x1533, B:462:0x15af, B:463:0x15b6, B:391:0x13cf, B:202:0x0f31, B:204:0x0f3c, B:205:0x0f44, B:207:0x0f4a, B:190:0x0eb2, B:191:0x0eec, B:193:0x0ef2, B:194:0x0f00, B:195:0x0f12, B:197:0x0f18, B:168:0x0e42, B:159:0x0b31, B:60:0x01a6, B:28:0x00c3, B:30:0x00cd, B:32:0x00d7, B:34:0x00e5, B:36:0x00f0, B:35:0x00ec), top: B:496:0x00ad }] */
    /* JADX WARN: Removed duplicated region for block: B:223:0x0fd0 A[Catch: JSONException -> 0x169e, TryCatch #0 {JSONException -> 0x169e, blocks: (B:23:0x00ad, B:25:0x00b1, B:27:0x00bc, B:29:0x00c7, B:38:0x00fc, B:40:0x0104, B:42:0x0108, B:43:0x0116, B:45:0x011e, B:46:0x012a, B:48:0x0130, B:50:0x0146, B:51:0x0158, B:53:0x015c, B:55:0x0164, B:56:0x0176, B:58:0x0195, B:63:0x01b2, B:65:0x01c5, B:66:0x01ca, B:68:0x01d2, B:69:0x01d6, B:71:0x01dc, B:72:0x01ea, B:74:0x01fb, B:76:0x020b, B:80:0x024d, B:82:0x0251, B:93:0x026e, B:95:0x0273, B:97:0x0277, B:99:0x0282, B:100:0x028f, B:106:0x02a0, B:109:0x02a8, B:110:0x02bc, B:112:0x02c2, B:113:0x02d1, B:114:0x02e7, B:116:0x02ed, B:117:0x02fb, B:120:0x032c, B:124:0x037d, B:128:0x03c4, B:131:0x06b9, B:135:0x06ca, B:139:0x06f7, B:141:0x09f9, B:142:0x09fb, B:144:0x0a05, B:145:0x0a07, B:147:0x0a11, B:148:0x0a13, B:156:0x0acb, B:160:0x0b3b, B:164:0x0ca9, B:167:0x0d14, B:171:0x0e50, B:173:0x0e70, B:175:0x0e76, B:176:0x0e7f, B:178:0x0e86, B:179:0x0e8b, B:181:0x0e95, B:182:0x0e9e, B:184:0x0ea6, B:186:0x0eaa, B:188:0x0eae, B:198:0x0f26, B:200:0x0f2b, B:208:0x0f5e, B:210:0x0f63, B:212:0x0f7f, B:213:0x0f87, B:215:0x0f8d, B:216:0x0fa1, B:217:0x0faa, B:219:0x0fb9, B:221:0x0fc1, B:223:0x0fd0, B:224:0x0fdb, B:226:0x0fe3, B:227:0x0fee, B:229:0x0ff6, B:230:0x1001, B:232:0x1009, B:233:0x1014, B:235:0x101c, B:236:0x1027, B:238:0x102f, B:239:0x103a, B:241:0x1042, B:242:0x104d, B:244:0x1055, B:245:0x1060, B:247:0x1066, B:248:0x106d, B:250:0x1075, B:251:0x1080, B:253:0x1086, B:254:0x108d, B:256:0x1095, B:257:0x10a0, B:259:0x10a8, B:260:0x10b3, B:262:0x10bb, B:263:0x10c6, B:265:0x10ce, B:266:0x10d9, B:268:0x10e1, B:269:0x10ec, B:271:0x10f2, B:272:0x10f9, B:274:0x1101, B:275:0x110c, B:277:0x1114, B:278:0x111f, B:280:0x1127, B:281:0x1132, B:283:0x1138, B:284:0x113f, B:286:0x1149, B:288:0x114f, B:290:0x115c, B:291:0x1167, B:293:0x116f, B:294:0x117a, B:296:0x1182, B:297:0x118d, B:299:0x1195, B:300:0x11a0, B:302:0x11a8, B:303:0x11b3, B:305:0x11bb, B:306:0x11c6, B:308:0x11ce, B:309:0x11d9, B:311:0x11e1, B:312:0x11ec, B:314:0x11f4, B:315:0x11ff, B:317:0x1207, B:318:0x1212, B:320:0x121a, B:321:0x1225, B:323:0x122d, B:324:0x1238, B:326:0x1240, B:327:0x124b, B:329:0x1253, B:330:0x125e, B:332:0x1266, B:333:0x1271, B:335:0x1279, B:336:0x1284, B:338:0x128c, B:339:0x1297, B:341:0x129f, B:342:0x12aa, B:344:0x12b2, B:345:0x12bd, B:347:0x12c5, B:348:0x12d0, B:350:0x12d8, B:351:0x12e3, B:353:0x12eb, B:354:0x12f6, B:356:0x12fe, B:357:0x1309, B:359:0x1311, B:360:0x131c, B:362:0x1324, B:363:0x132f, B:365:0x1337, B:366:0x1342, B:368:0x134a, B:369:0x1355, B:371:0x135d, B:372:0x1368, B:374:0x1370, B:375:0x137b, B:377:0x137f, B:379:0x1383, B:381:0x138d, B:382:0x1392, B:384:0x1399, B:385:0x139c, B:387:0x13b3, B:388:0x13bb, B:394:0x13d9, B:399:0x13f4, B:401:0x13fb, B:402:0x1400, B:404:0x1404, B:405:0x143f, B:407:0x1445, B:408:0x144a, B:410:0x144f, B:411:0x1454, B:413:0x1458, B:414:0x1463, B:416:0x1467, B:417:0x147c, B:419:0x1495, B:420:0x149e, B:422:0x14a2, B:423:0x14b5, B:425:0x14b9, B:426:0x14d5, B:428:0x14d9, B:429:0x14de, B:431:0x14e2, B:432:0x14e7, B:434:0x14eb, B:435:0x14f1, B:437:0x14f5, B:438:0x1505, B:440:0x1518, B:441:0x151f, B:443:0x1529, B:446:0x153a, B:448:0x153f, B:449:0x155e, B:451:0x1566, B:452:0x158a, B:454:0x1591, B:455:0x1598, B:457:0x159d, B:459:0x15a8, B:465:0x15c2, B:467:0x15ca, B:469:0x15d4, B:470:0x15d6, B:481:0x1678, B:471:0x15d9, B:473:0x1643, B:475:0x1647, B:477:0x164f, B:478:0x1664, B:480:0x166a, B:482:0x167f, B:483:0x1684, B:485:0x1688, B:487:0x168c, B:488:0x168f, B:490:0x1695, B:491:0x169a, B:445:0x1533, B:462:0x15af, B:463:0x15b6, B:391:0x13cf, B:202:0x0f31, B:204:0x0f3c, B:205:0x0f44, B:207:0x0f4a, B:190:0x0eb2, B:191:0x0eec, B:193:0x0ef2, B:194:0x0f00, B:195:0x0f12, B:197:0x0f18, B:168:0x0e42, B:159:0x0b31, B:60:0x01a6, B:28:0x00c3, B:30:0x00cd, B:32:0x00d7, B:34:0x00e5, B:36:0x00f0, B:35:0x00ec), top: B:496:0x00ad }] */
    /* JADX WARN: Removed duplicated region for block: B:226:0x0fe3 A[Catch: JSONException -> 0x169e, TryCatch #0 {JSONException -> 0x169e, blocks: (B:23:0x00ad, B:25:0x00b1, B:27:0x00bc, B:29:0x00c7, B:38:0x00fc, B:40:0x0104, B:42:0x0108, B:43:0x0116, B:45:0x011e, B:46:0x012a, B:48:0x0130, B:50:0x0146, B:51:0x0158, B:53:0x015c, B:55:0x0164, B:56:0x0176, B:58:0x0195, B:63:0x01b2, B:65:0x01c5, B:66:0x01ca, B:68:0x01d2, B:69:0x01d6, B:71:0x01dc, B:72:0x01ea, B:74:0x01fb, B:76:0x020b, B:80:0x024d, B:82:0x0251, B:93:0x026e, B:95:0x0273, B:97:0x0277, B:99:0x0282, B:100:0x028f, B:106:0x02a0, B:109:0x02a8, B:110:0x02bc, B:112:0x02c2, B:113:0x02d1, B:114:0x02e7, B:116:0x02ed, B:117:0x02fb, B:120:0x032c, B:124:0x037d, B:128:0x03c4, B:131:0x06b9, B:135:0x06ca, B:139:0x06f7, B:141:0x09f9, B:142:0x09fb, B:144:0x0a05, B:145:0x0a07, B:147:0x0a11, B:148:0x0a13, B:156:0x0acb, B:160:0x0b3b, B:164:0x0ca9, B:167:0x0d14, B:171:0x0e50, B:173:0x0e70, B:175:0x0e76, B:176:0x0e7f, B:178:0x0e86, B:179:0x0e8b, B:181:0x0e95, B:182:0x0e9e, B:184:0x0ea6, B:186:0x0eaa, B:188:0x0eae, B:198:0x0f26, B:200:0x0f2b, B:208:0x0f5e, B:210:0x0f63, B:212:0x0f7f, B:213:0x0f87, B:215:0x0f8d, B:216:0x0fa1, B:217:0x0faa, B:219:0x0fb9, B:221:0x0fc1, B:223:0x0fd0, B:224:0x0fdb, B:226:0x0fe3, B:227:0x0fee, B:229:0x0ff6, B:230:0x1001, B:232:0x1009, B:233:0x1014, B:235:0x101c, B:236:0x1027, B:238:0x102f, B:239:0x103a, B:241:0x1042, B:242:0x104d, B:244:0x1055, B:245:0x1060, B:247:0x1066, B:248:0x106d, B:250:0x1075, B:251:0x1080, B:253:0x1086, B:254:0x108d, B:256:0x1095, B:257:0x10a0, B:259:0x10a8, B:260:0x10b3, B:262:0x10bb, B:263:0x10c6, B:265:0x10ce, B:266:0x10d9, B:268:0x10e1, B:269:0x10ec, B:271:0x10f2, B:272:0x10f9, B:274:0x1101, B:275:0x110c, B:277:0x1114, B:278:0x111f, B:280:0x1127, B:281:0x1132, B:283:0x1138, B:284:0x113f, B:286:0x1149, B:288:0x114f, B:290:0x115c, B:291:0x1167, B:293:0x116f, B:294:0x117a, B:296:0x1182, B:297:0x118d, B:299:0x1195, B:300:0x11a0, B:302:0x11a8, B:303:0x11b3, B:305:0x11bb, B:306:0x11c6, B:308:0x11ce, B:309:0x11d9, B:311:0x11e1, B:312:0x11ec, B:314:0x11f4, B:315:0x11ff, B:317:0x1207, B:318:0x1212, B:320:0x121a, B:321:0x1225, B:323:0x122d, B:324:0x1238, B:326:0x1240, B:327:0x124b, B:329:0x1253, B:330:0x125e, B:332:0x1266, B:333:0x1271, B:335:0x1279, B:336:0x1284, B:338:0x128c, B:339:0x1297, B:341:0x129f, B:342:0x12aa, B:344:0x12b2, B:345:0x12bd, B:347:0x12c5, B:348:0x12d0, B:350:0x12d8, B:351:0x12e3, B:353:0x12eb, B:354:0x12f6, B:356:0x12fe, B:357:0x1309, B:359:0x1311, B:360:0x131c, B:362:0x1324, B:363:0x132f, B:365:0x1337, B:366:0x1342, B:368:0x134a, B:369:0x1355, B:371:0x135d, B:372:0x1368, B:374:0x1370, B:375:0x137b, B:377:0x137f, B:379:0x1383, B:381:0x138d, B:382:0x1392, B:384:0x1399, B:385:0x139c, B:387:0x13b3, B:388:0x13bb, B:394:0x13d9, B:399:0x13f4, B:401:0x13fb, B:402:0x1400, B:404:0x1404, B:405:0x143f, B:407:0x1445, B:408:0x144a, B:410:0x144f, B:411:0x1454, B:413:0x1458, B:414:0x1463, B:416:0x1467, B:417:0x147c, B:419:0x1495, B:420:0x149e, B:422:0x14a2, B:423:0x14b5, B:425:0x14b9, B:426:0x14d5, B:428:0x14d9, B:429:0x14de, B:431:0x14e2, B:432:0x14e7, B:434:0x14eb, B:435:0x14f1, B:437:0x14f5, B:438:0x1505, B:440:0x1518, B:441:0x151f, B:443:0x1529, B:446:0x153a, B:448:0x153f, B:449:0x155e, B:451:0x1566, B:452:0x158a, B:454:0x1591, B:455:0x1598, B:457:0x159d, B:459:0x15a8, B:465:0x15c2, B:467:0x15ca, B:469:0x15d4, B:470:0x15d6, B:481:0x1678, B:471:0x15d9, B:473:0x1643, B:475:0x1647, B:477:0x164f, B:478:0x1664, B:480:0x166a, B:482:0x167f, B:483:0x1684, B:485:0x1688, B:487:0x168c, B:488:0x168f, B:490:0x1695, B:491:0x169a, B:445:0x1533, B:462:0x15af, B:463:0x15b6, B:391:0x13cf, B:202:0x0f31, B:204:0x0f3c, B:205:0x0f44, B:207:0x0f4a, B:190:0x0eb2, B:191:0x0eec, B:193:0x0ef2, B:194:0x0f00, B:195:0x0f12, B:197:0x0f18, B:168:0x0e42, B:159:0x0b31, B:60:0x01a6, B:28:0x00c3, B:30:0x00cd, B:32:0x00d7, B:34:0x00e5, B:36:0x00f0, B:35:0x00ec), top: B:496:0x00ad }] */
    /* JADX WARN: Removed duplicated region for block: B:229:0x0ff6 A[Catch: JSONException -> 0x169e, TryCatch #0 {JSONException -> 0x169e, blocks: (B:23:0x00ad, B:25:0x00b1, B:27:0x00bc, B:29:0x00c7, B:38:0x00fc, B:40:0x0104, B:42:0x0108, B:43:0x0116, B:45:0x011e, B:46:0x012a, B:48:0x0130, B:50:0x0146, B:51:0x0158, B:53:0x015c, B:55:0x0164, B:56:0x0176, B:58:0x0195, B:63:0x01b2, B:65:0x01c5, B:66:0x01ca, B:68:0x01d2, B:69:0x01d6, B:71:0x01dc, B:72:0x01ea, B:74:0x01fb, B:76:0x020b, B:80:0x024d, B:82:0x0251, B:93:0x026e, B:95:0x0273, B:97:0x0277, B:99:0x0282, B:100:0x028f, B:106:0x02a0, B:109:0x02a8, B:110:0x02bc, B:112:0x02c2, B:113:0x02d1, B:114:0x02e7, B:116:0x02ed, B:117:0x02fb, B:120:0x032c, B:124:0x037d, B:128:0x03c4, B:131:0x06b9, B:135:0x06ca, B:139:0x06f7, B:141:0x09f9, B:142:0x09fb, B:144:0x0a05, B:145:0x0a07, B:147:0x0a11, B:148:0x0a13, B:156:0x0acb, B:160:0x0b3b, B:164:0x0ca9, B:167:0x0d14, B:171:0x0e50, B:173:0x0e70, B:175:0x0e76, B:176:0x0e7f, B:178:0x0e86, B:179:0x0e8b, B:181:0x0e95, B:182:0x0e9e, B:184:0x0ea6, B:186:0x0eaa, B:188:0x0eae, B:198:0x0f26, B:200:0x0f2b, B:208:0x0f5e, B:210:0x0f63, B:212:0x0f7f, B:213:0x0f87, B:215:0x0f8d, B:216:0x0fa1, B:217:0x0faa, B:219:0x0fb9, B:221:0x0fc1, B:223:0x0fd0, B:224:0x0fdb, B:226:0x0fe3, B:227:0x0fee, B:229:0x0ff6, B:230:0x1001, B:232:0x1009, B:233:0x1014, B:235:0x101c, B:236:0x1027, B:238:0x102f, B:239:0x103a, B:241:0x1042, B:242:0x104d, B:244:0x1055, B:245:0x1060, B:247:0x1066, B:248:0x106d, B:250:0x1075, B:251:0x1080, B:253:0x1086, B:254:0x108d, B:256:0x1095, B:257:0x10a0, B:259:0x10a8, B:260:0x10b3, B:262:0x10bb, B:263:0x10c6, B:265:0x10ce, B:266:0x10d9, B:268:0x10e1, B:269:0x10ec, B:271:0x10f2, B:272:0x10f9, B:274:0x1101, B:275:0x110c, B:277:0x1114, B:278:0x111f, B:280:0x1127, B:281:0x1132, B:283:0x1138, B:284:0x113f, B:286:0x1149, B:288:0x114f, B:290:0x115c, B:291:0x1167, B:293:0x116f, B:294:0x117a, B:296:0x1182, B:297:0x118d, B:299:0x1195, B:300:0x11a0, B:302:0x11a8, B:303:0x11b3, B:305:0x11bb, B:306:0x11c6, B:308:0x11ce, B:309:0x11d9, B:311:0x11e1, B:312:0x11ec, B:314:0x11f4, B:315:0x11ff, B:317:0x1207, B:318:0x1212, B:320:0x121a, B:321:0x1225, B:323:0x122d, B:324:0x1238, B:326:0x1240, B:327:0x124b, B:329:0x1253, B:330:0x125e, B:332:0x1266, B:333:0x1271, B:335:0x1279, B:336:0x1284, B:338:0x128c, B:339:0x1297, B:341:0x129f, B:342:0x12aa, B:344:0x12b2, B:345:0x12bd, B:347:0x12c5, B:348:0x12d0, B:350:0x12d8, B:351:0x12e3, B:353:0x12eb, B:354:0x12f6, B:356:0x12fe, B:357:0x1309, B:359:0x1311, B:360:0x131c, B:362:0x1324, B:363:0x132f, B:365:0x1337, B:366:0x1342, B:368:0x134a, B:369:0x1355, B:371:0x135d, B:372:0x1368, B:374:0x1370, B:375:0x137b, B:377:0x137f, B:379:0x1383, B:381:0x138d, B:382:0x1392, B:384:0x1399, B:385:0x139c, B:387:0x13b3, B:388:0x13bb, B:394:0x13d9, B:399:0x13f4, B:401:0x13fb, B:402:0x1400, B:404:0x1404, B:405:0x143f, B:407:0x1445, B:408:0x144a, B:410:0x144f, B:411:0x1454, B:413:0x1458, B:414:0x1463, B:416:0x1467, B:417:0x147c, B:419:0x1495, B:420:0x149e, B:422:0x14a2, B:423:0x14b5, B:425:0x14b9, B:426:0x14d5, B:428:0x14d9, B:429:0x14de, B:431:0x14e2, B:432:0x14e7, B:434:0x14eb, B:435:0x14f1, B:437:0x14f5, B:438:0x1505, B:440:0x1518, B:441:0x151f, B:443:0x1529, B:446:0x153a, B:448:0x153f, B:449:0x155e, B:451:0x1566, B:452:0x158a, B:454:0x1591, B:455:0x1598, B:457:0x159d, B:459:0x15a8, B:465:0x15c2, B:467:0x15ca, B:469:0x15d4, B:470:0x15d6, B:481:0x1678, B:471:0x15d9, B:473:0x1643, B:475:0x1647, B:477:0x164f, B:478:0x1664, B:480:0x166a, B:482:0x167f, B:483:0x1684, B:485:0x1688, B:487:0x168c, B:488:0x168f, B:490:0x1695, B:491:0x169a, B:445:0x1533, B:462:0x15af, B:463:0x15b6, B:391:0x13cf, B:202:0x0f31, B:204:0x0f3c, B:205:0x0f44, B:207:0x0f4a, B:190:0x0eb2, B:191:0x0eec, B:193:0x0ef2, B:194:0x0f00, B:195:0x0f12, B:197:0x0f18, B:168:0x0e42, B:159:0x0b31, B:60:0x01a6, B:28:0x00c3, B:30:0x00cd, B:32:0x00d7, B:34:0x00e5, B:36:0x00f0, B:35:0x00ec), top: B:496:0x00ad }] */
    /* JADX WARN: Removed duplicated region for block: B:232:0x1009 A[Catch: JSONException -> 0x169e, TryCatch #0 {JSONException -> 0x169e, blocks: (B:23:0x00ad, B:25:0x00b1, B:27:0x00bc, B:29:0x00c7, B:38:0x00fc, B:40:0x0104, B:42:0x0108, B:43:0x0116, B:45:0x011e, B:46:0x012a, B:48:0x0130, B:50:0x0146, B:51:0x0158, B:53:0x015c, B:55:0x0164, B:56:0x0176, B:58:0x0195, B:63:0x01b2, B:65:0x01c5, B:66:0x01ca, B:68:0x01d2, B:69:0x01d6, B:71:0x01dc, B:72:0x01ea, B:74:0x01fb, B:76:0x020b, B:80:0x024d, B:82:0x0251, B:93:0x026e, B:95:0x0273, B:97:0x0277, B:99:0x0282, B:100:0x028f, B:106:0x02a0, B:109:0x02a8, B:110:0x02bc, B:112:0x02c2, B:113:0x02d1, B:114:0x02e7, B:116:0x02ed, B:117:0x02fb, B:120:0x032c, B:124:0x037d, B:128:0x03c4, B:131:0x06b9, B:135:0x06ca, B:139:0x06f7, B:141:0x09f9, B:142:0x09fb, B:144:0x0a05, B:145:0x0a07, B:147:0x0a11, B:148:0x0a13, B:156:0x0acb, B:160:0x0b3b, B:164:0x0ca9, B:167:0x0d14, B:171:0x0e50, B:173:0x0e70, B:175:0x0e76, B:176:0x0e7f, B:178:0x0e86, B:179:0x0e8b, B:181:0x0e95, B:182:0x0e9e, B:184:0x0ea6, B:186:0x0eaa, B:188:0x0eae, B:198:0x0f26, B:200:0x0f2b, B:208:0x0f5e, B:210:0x0f63, B:212:0x0f7f, B:213:0x0f87, B:215:0x0f8d, B:216:0x0fa1, B:217:0x0faa, B:219:0x0fb9, B:221:0x0fc1, B:223:0x0fd0, B:224:0x0fdb, B:226:0x0fe3, B:227:0x0fee, B:229:0x0ff6, B:230:0x1001, B:232:0x1009, B:233:0x1014, B:235:0x101c, B:236:0x1027, B:238:0x102f, B:239:0x103a, B:241:0x1042, B:242:0x104d, B:244:0x1055, B:245:0x1060, B:247:0x1066, B:248:0x106d, B:250:0x1075, B:251:0x1080, B:253:0x1086, B:254:0x108d, B:256:0x1095, B:257:0x10a0, B:259:0x10a8, B:260:0x10b3, B:262:0x10bb, B:263:0x10c6, B:265:0x10ce, B:266:0x10d9, B:268:0x10e1, B:269:0x10ec, B:271:0x10f2, B:272:0x10f9, B:274:0x1101, B:275:0x110c, B:277:0x1114, B:278:0x111f, B:280:0x1127, B:281:0x1132, B:283:0x1138, B:284:0x113f, B:286:0x1149, B:288:0x114f, B:290:0x115c, B:291:0x1167, B:293:0x116f, B:294:0x117a, B:296:0x1182, B:297:0x118d, B:299:0x1195, B:300:0x11a0, B:302:0x11a8, B:303:0x11b3, B:305:0x11bb, B:306:0x11c6, B:308:0x11ce, B:309:0x11d9, B:311:0x11e1, B:312:0x11ec, B:314:0x11f4, B:315:0x11ff, B:317:0x1207, B:318:0x1212, B:320:0x121a, B:321:0x1225, B:323:0x122d, B:324:0x1238, B:326:0x1240, B:327:0x124b, B:329:0x1253, B:330:0x125e, B:332:0x1266, B:333:0x1271, B:335:0x1279, B:336:0x1284, B:338:0x128c, B:339:0x1297, B:341:0x129f, B:342:0x12aa, B:344:0x12b2, B:345:0x12bd, B:347:0x12c5, B:348:0x12d0, B:350:0x12d8, B:351:0x12e3, B:353:0x12eb, B:354:0x12f6, B:356:0x12fe, B:357:0x1309, B:359:0x1311, B:360:0x131c, B:362:0x1324, B:363:0x132f, B:365:0x1337, B:366:0x1342, B:368:0x134a, B:369:0x1355, B:371:0x135d, B:372:0x1368, B:374:0x1370, B:375:0x137b, B:377:0x137f, B:379:0x1383, B:381:0x138d, B:382:0x1392, B:384:0x1399, B:385:0x139c, B:387:0x13b3, B:388:0x13bb, B:394:0x13d9, B:399:0x13f4, B:401:0x13fb, B:402:0x1400, B:404:0x1404, B:405:0x143f, B:407:0x1445, B:408:0x144a, B:410:0x144f, B:411:0x1454, B:413:0x1458, B:414:0x1463, B:416:0x1467, B:417:0x147c, B:419:0x1495, B:420:0x149e, B:422:0x14a2, B:423:0x14b5, B:425:0x14b9, B:426:0x14d5, B:428:0x14d9, B:429:0x14de, B:431:0x14e2, B:432:0x14e7, B:434:0x14eb, B:435:0x14f1, B:437:0x14f5, B:438:0x1505, B:440:0x1518, B:441:0x151f, B:443:0x1529, B:446:0x153a, B:448:0x153f, B:449:0x155e, B:451:0x1566, B:452:0x158a, B:454:0x1591, B:455:0x1598, B:457:0x159d, B:459:0x15a8, B:465:0x15c2, B:467:0x15ca, B:469:0x15d4, B:470:0x15d6, B:481:0x1678, B:471:0x15d9, B:473:0x1643, B:475:0x1647, B:477:0x164f, B:478:0x1664, B:480:0x166a, B:482:0x167f, B:483:0x1684, B:485:0x1688, B:487:0x168c, B:488:0x168f, B:490:0x1695, B:491:0x169a, B:445:0x1533, B:462:0x15af, B:463:0x15b6, B:391:0x13cf, B:202:0x0f31, B:204:0x0f3c, B:205:0x0f44, B:207:0x0f4a, B:190:0x0eb2, B:191:0x0eec, B:193:0x0ef2, B:194:0x0f00, B:195:0x0f12, B:197:0x0f18, B:168:0x0e42, B:159:0x0b31, B:60:0x01a6, B:28:0x00c3, B:30:0x00cd, B:32:0x00d7, B:34:0x00e5, B:36:0x00f0, B:35:0x00ec), top: B:496:0x00ad }] */
    /* JADX WARN: Removed duplicated region for block: B:235:0x101c A[Catch: JSONException -> 0x169e, TryCatch #0 {JSONException -> 0x169e, blocks: (B:23:0x00ad, B:25:0x00b1, B:27:0x00bc, B:29:0x00c7, B:38:0x00fc, B:40:0x0104, B:42:0x0108, B:43:0x0116, B:45:0x011e, B:46:0x012a, B:48:0x0130, B:50:0x0146, B:51:0x0158, B:53:0x015c, B:55:0x0164, B:56:0x0176, B:58:0x0195, B:63:0x01b2, B:65:0x01c5, B:66:0x01ca, B:68:0x01d2, B:69:0x01d6, B:71:0x01dc, B:72:0x01ea, B:74:0x01fb, B:76:0x020b, B:80:0x024d, B:82:0x0251, B:93:0x026e, B:95:0x0273, B:97:0x0277, B:99:0x0282, B:100:0x028f, B:106:0x02a0, B:109:0x02a8, B:110:0x02bc, B:112:0x02c2, B:113:0x02d1, B:114:0x02e7, B:116:0x02ed, B:117:0x02fb, B:120:0x032c, B:124:0x037d, B:128:0x03c4, B:131:0x06b9, B:135:0x06ca, B:139:0x06f7, B:141:0x09f9, B:142:0x09fb, B:144:0x0a05, B:145:0x0a07, B:147:0x0a11, B:148:0x0a13, B:156:0x0acb, B:160:0x0b3b, B:164:0x0ca9, B:167:0x0d14, B:171:0x0e50, B:173:0x0e70, B:175:0x0e76, B:176:0x0e7f, B:178:0x0e86, B:179:0x0e8b, B:181:0x0e95, B:182:0x0e9e, B:184:0x0ea6, B:186:0x0eaa, B:188:0x0eae, B:198:0x0f26, B:200:0x0f2b, B:208:0x0f5e, B:210:0x0f63, B:212:0x0f7f, B:213:0x0f87, B:215:0x0f8d, B:216:0x0fa1, B:217:0x0faa, B:219:0x0fb9, B:221:0x0fc1, B:223:0x0fd0, B:224:0x0fdb, B:226:0x0fe3, B:227:0x0fee, B:229:0x0ff6, B:230:0x1001, B:232:0x1009, B:233:0x1014, B:235:0x101c, B:236:0x1027, B:238:0x102f, B:239:0x103a, B:241:0x1042, B:242:0x104d, B:244:0x1055, B:245:0x1060, B:247:0x1066, B:248:0x106d, B:250:0x1075, B:251:0x1080, B:253:0x1086, B:254:0x108d, B:256:0x1095, B:257:0x10a0, B:259:0x10a8, B:260:0x10b3, B:262:0x10bb, B:263:0x10c6, B:265:0x10ce, B:266:0x10d9, B:268:0x10e1, B:269:0x10ec, B:271:0x10f2, B:272:0x10f9, B:274:0x1101, B:275:0x110c, B:277:0x1114, B:278:0x111f, B:280:0x1127, B:281:0x1132, B:283:0x1138, B:284:0x113f, B:286:0x1149, B:288:0x114f, B:290:0x115c, B:291:0x1167, B:293:0x116f, B:294:0x117a, B:296:0x1182, B:297:0x118d, B:299:0x1195, B:300:0x11a0, B:302:0x11a8, B:303:0x11b3, B:305:0x11bb, B:306:0x11c6, B:308:0x11ce, B:309:0x11d9, B:311:0x11e1, B:312:0x11ec, B:314:0x11f4, B:315:0x11ff, B:317:0x1207, B:318:0x1212, B:320:0x121a, B:321:0x1225, B:323:0x122d, B:324:0x1238, B:326:0x1240, B:327:0x124b, B:329:0x1253, B:330:0x125e, B:332:0x1266, B:333:0x1271, B:335:0x1279, B:336:0x1284, B:338:0x128c, B:339:0x1297, B:341:0x129f, B:342:0x12aa, B:344:0x12b2, B:345:0x12bd, B:347:0x12c5, B:348:0x12d0, B:350:0x12d8, B:351:0x12e3, B:353:0x12eb, B:354:0x12f6, B:356:0x12fe, B:357:0x1309, B:359:0x1311, B:360:0x131c, B:362:0x1324, B:363:0x132f, B:365:0x1337, B:366:0x1342, B:368:0x134a, B:369:0x1355, B:371:0x135d, B:372:0x1368, B:374:0x1370, B:375:0x137b, B:377:0x137f, B:379:0x1383, B:381:0x138d, B:382:0x1392, B:384:0x1399, B:385:0x139c, B:387:0x13b3, B:388:0x13bb, B:394:0x13d9, B:399:0x13f4, B:401:0x13fb, B:402:0x1400, B:404:0x1404, B:405:0x143f, B:407:0x1445, B:408:0x144a, B:410:0x144f, B:411:0x1454, B:413:0x1458, B:414:0x1463, B:416:0x1467, B:417:0x147c, B:419:0x1495, B:420:0x149e, B:422:0x14a2, B:423:0x14b5, B:425:0x14b9, B:426:0x14d5, B:428:0x14d9, B:429:0x14de, B:431:0x14e2, B:432:0x14e7, B:434:0x14eb, B:435:0x14f1, B:437:0x14f5, B:438:0x1505, B:440:0x1518, B:441:0x151f, B:443:0x1529, B:446:0x153a, B:448:0x153f, B:449:0x155e, B:451:0x1566, B:452:0x158a, B:454:0x1591, B:455:0x1598, B:457:0x159d, B:459:0x15a8, B:465:0x15c2, B:467:0x15ca, B:469:0x15d4, B:470:0x15d6, B:481:0x1678, B:471:0x15d9, B:473:0x1643, B:475:0x1647, B:477:0x164f, B:478:0x1664, B:480:0x166a, B:482:0x167f, B:483:0x1684, B:485:0x1688, B:487:0x168c, B:488:0x168f, B:490:0x1695, B:491:0x169a, B:445:0x1533, B:462:0x15af, B:463:0x15b6, B:391:0x13cf, B:202:0x0f31, B:204:0x0f3c, B:205:0x0f44, B:207:0x0f4a, B:190:0x0eb2, B:191:0x0eec, B:193:0x0ef2, B:194:0x0f00, B:195:0x0f12, B:197:0x0f18, B:168:0x0e42, B:159:0x0b31, B:60:0x01a6, B:28:0x00c3, B:30:0x00cd, B:32:0x00d7, B:34:0x00e5, B:36:0x00f0, B:35:0x00ec), top: B:496:0x00ad }] */
    /* JADX WARN: Removed duplicated region for block: B:238:0x102f A[Catch: JSONException -> 0x169e, TryCatch #0 {JSONException -> 0x169e, blocks: (B:23:0x00ad, B:25:0x00b1, B:27:0x00bc, B:29:0x00c7, B:38:0x00fc, B:40:0x0104, B:42:0x0108, B:43:0x0116, B:45:0x011e, B:46:0x012a, B:48:0x0130, B:50:0x0146, B:51:0x0158, B:53:0x015c, B:55:0x0164, B:56:0x0176, B:58:0x0195, B:63:0x01b2, B:65:0x01c5, B:66:0x01ca, B:68:0x01d2, B:69:0x01d6, B:71:0x01dc, B:72:0x01ea, B:74:0x01fb, B:76:0x020b, B:80:0x024d, B:82:0x0251, B:93:0x026e, B:95:0x0273, B:97:0x0277, B:99:0x0282, B:100:0x028f, B:106:0x02a0, B:109:0x02a8, B:110:0x02bc, B:112:0x02c2, B:113:0x02d1, B:114:0x02e7, B:116:0x02ed, B:117:0x02fb, B:120:0x032c, B:124:0x037d, B:128:0x03c4, B:131:0x06b9, B:135:0x06ca, B:139:0x06f7, B:141:0x09f9, B:142:0x09fb, B:144:0x0a05, B:145:0x0a07, B:147:0x0a11, B:148:0x0a13, B:156:0x0acb, B:160:0x0b3b, B:164:0x0ca9, B:167:0x0d14, B:171:0x0e50, B:173:0x0e70, B:175:0x0e76, B:176:0x0e7f, B:178:0x0e86, B:179:0x0e8b, B:181:0x0e95, B:182:0x0e9e, B:184:0x0ea6, B:186:0x0eaa, B:188:0x0eae, B:198:0x0f26, B:200:0x0f2b, B:208:0x0f5e, B:210:0x0f63, B:212:0x0f7f, B:213:0x0f87, B:215:0x0f8d, B:216:0x0fa1, B:217:0x0faa, B:219:0x0fb9, B:221:0x0fc1, B:223:0x0fd0, B:224:0x0fdb, B:226:0x0fe3, B:227:0x0fee, B:229:0x0ff6, B:230:0x1001, B:232:0x1009, B:233:0x1014, B:235:0x101c, B:236:0x1027, B:238:0x102f, B:239:0x103a, B:241:0x1042, B:242:0x104d, B:244:0x1055, B:245:0x1060, B:247:0x1066, B:248:0x106d, B:250:0x1075, B:251:0x1080, B:253:0x1086, B:254:0x108d, B:256:0x1095, B:257:0x10a0, B:259:0x10a8, B:260:0x10b3, B:262:0x10bb, B:263:0x10c6, B:265:0x10ce, B:266:0x10d9, B:268:0x10e1, B:269:0x10ec, B:271:0x10f2, B:272:0x10f9, B:274:0x1101, B:275:0x110c, B:277:0x1114, B:278:0x111f, B:280:0x1127, B:281:0x1132, B:283:0x1138, B:284:0x113f, B:286:0x1149, B:288:0x114f, B:290:0x115c, B:291:0x1167, B:293:0x116f, B:294:0x117a, B:296:0x1182, B:297:0x118d, B:299:0x1195, B:300:0x11a0, B:302:0x11a8, B:303:0x11b3, B:305:0x11bb, B:306:0x11c6, B:308:0x11ce, B:309:0x11d9, B:311:0x11e1, B:312:0x11ec, B:314:0x11f4, B:315:0x11ff, B:317:0x1207, B:318:0x1212, B:320:0x121a, B:321:0x1225, B:323:0x122d, B:324:0x1238, B:326:0x1240, B:327:0x124b, B:329:0x1253, B:330:0x125e, B:332:0x1266, B:333:0x1271, B:335:0x1279, B:336:0x1284, B:338:0x128c, B:339:0x1297, B:341:0x129f, B:342:0x12aa, B:344:0x12b2, B:345:0x12bd, B:347:0x12c5, B:348:0x12d0, B:350:0x12d8, B:351:0x12e3, B:353:0x12eb, B:354:0x12f6, B:356:0x12fe, B:357:0x1309, B:359:0x1311, B:360:0x131c, B:362:0x1324, B:363:0x132f, B:365:0x1337, B:366:0x1342, B:368:0x134a, B:369:0x1355, B:371:0x135d, B:372:0x1368, B:374:0x1370, B:375:0x137b, B:377:0x137f, B:379:0x1383, B:381:0x138d, B:382:0x1392, B:384:0x1399, B:385:0x139c, B:387:0x13b3, B:388:0x13bb, B:394:0x13d9, B:399:0x13f4, B:401:0x13fb, B:402:0x1400, B:404:0x1404, B:405:0x143f, B:407:0x1445, B:408:0x144a, B:410:0x144f, B:411:0x1454, B:413:0x1458, B:414:0x1463, B:416:0x1467, B:417:0x147c, B:419:0x1495, B:420:0x149e, B:422:0x14a2, B:423:0x14b5, B:425:0x14b9, B:426:0x14d5, B:428:0x14d9, B:429:0x14de, B:431:0x14e2, B:432:0x14e7, B:434:0x14eb, B:435:0x14f1, B:437:0x14f5, B:438:0x1505, B:440:0x1518, B:441:0x151f, B:443:0x1529, B:446:0x153a, B:448:0x153f, B:449:0x155e, B:451:0x1566, B:452:0x158a, B:454:0x1591, B:455:0x1598, B:457:0x159d, B:459:0x15a8, B:465:0x15c2, B:467:0x15ca, B:469:0x15d4, B:470:0x15d6, B:481:0x1678, B:471:0x15d9, B:473:0x1643, B:475:0x1647, B:477:0x164f, B:478:0x1664, B:480:0x166a, B:482:0x167f, B:483:0x1684, B:485:0x1688, B:487:0x168c, B:488:0x168f, B:490:0x1695, B:491:0x169a, B:445:0x1533, B:462:0x15af, B:463:0x15b6, B:391:0x13cf, B:202:0x0f31, B:204:0x0f3c, B:205:0x0f44, B:207:0x0f4a, B:190:0x0eb2, B:191:0x0eec, B:193:0x0ef2, B:194:0x0f00, B:195:0x0f12, B:197:0x0f18, B:168:0x0e42, B:159:0x0b31, B:60:0x01a6, B:28:0x00c3, B:30:0x00cd, B:32:0x00d7, B:34:0x00e5, B:36:0x00f0, B:35:0x00ec), top: B:496:0x00ad }] */
    /* JADX WARN: Removed duplicated region for block: B:241:0x1042 A[Catch: JSONException -> 0x169e, TryCatch #0 {JSONException -> 0x169e, blocks: (B:23:0x00ad, B:25:0x00b1, B:27:0x00bc, B:29:0x00c7, B:38:0x00fc, B:40:0x0104, B:42:0x0108, B:43:0x0116, B:45:0x011e, B:46:0x012a, B:48:0x0130, B:50:0x0146, B:51:0x0158, B:53:0x015c, B:55:0x0164, B:56:0x0176, B:58:0x0195, B:63:0x01b2, B:65:0x01c5, B:66:0x01ca, B:68:0x01d2, B:69:0x01d6, B:71:0x01dc, B:72:0x01ea, B:74:0x01fb, B:76:0x020b, B:80:0x024d, B:82:0x0251, B:93:0x026e, B:95:0x0273, B:97:0x0277, B:99:0x0282, B:100:0x028f, B:106:0x02a0, B:109:0x02a8, B:110:0x02bc, B:112:0x02c2, B:113:0x02d1, B:114:0x02e7, B:116:0x02ed, B:117:0x02fb, B:120:0x032c, B:124:0x037d, B:128:0x03c4, B:131:0x06b9, B:135:0x06ca, B:139:0x06f7, B:141:0x09f9, B:142:0x09fb, B:144:0x0a05, B:145:0x0a07, B:147:0x0a11, B:148:0x0a13, B:156:0x0acb, B:160:0x0b3b, B:164:0x0ca9, B:167:0x0d14, B:171:0x0e50, B:173:0x0e70, B:175:0x0e76, B:176:0x0e7f, B:178:0x0e86, B:179:0x0e8b, B:181:0x0e95, B:182:0x0e9e, B:184:0x0ea6, B:186:0x0eaa, B:188:0x0eae, B:198:0x0f26, B:200:0x0f2b, B:208:0x0f5e, B:210:0x0f63, B:212:0x0f7f, B:213:0x0f87, B:215:0x0f8d, B:216:0x0fa1, B:217:0x0faa, B:219:0x0fb9, B:221:0x0fc1, B:223:0x0fd0, B:224:0x0fdb, B:226:0x0fe3, B:227:0x0fee, B:229:0x0ff6, B:230:0x1001, B:232:0x1009, B:233:0x1014, B:235:0x101c, B:236:0x1027, B:238:0x102f, B:239:0x103a, B:241:0x1042, B:242:0x104d, B:244:0x1055, B:245:0x1060, B:247:0x1066, B:248:0x106d, B:250:0x1075, B:251:0x1080, B:253:0x1086, B:254:0x108d, B:256:0x1095, B:257:0x10a0, B:259:0x10a8, B:260:0x10b3, B:262:0x10bb, B:263:0x10c6, B:265:0x10ce, B:266:0x10d9, B:268:0x10e1, B:269:0x10ec, B:271:0x10f2, B:272:0x10f9, B:274:0x1101, B:275:0x110c, B:277:0x1114, B:278:0x111f, B:280:0x1127, B:281:0x1132, B:283:0x1138, B:284:0x113f, B:286:0x1149, B:288:0x114f, B:290:0x115c, B:291:0x1167, B:293:0x116f, B:294:0x117a, B:296:0x1182, B:297:0x118d, B:299:0x1195, B:300:0x11a0, B:302:0x11a8, B:303:0x11b3, B:305:0x11bb, B:306:0x11c6, B:308:0x11ce, B:309:0x11d9, B:311:0x11e1, B:312:0x11ec, B:314:0x11f4, B:315:0x11ff, B:317:0x1207, B:318:0x1212, B:320:0x121a, B:321:0x1225, B:323:0x122d, B:324:0x1238, B:326:0x1240, B:327:0x124b, B:329:0x1253, B:330:0x125e, B:332:0x1266, B:333:0x1271, B:335:0x1279, B:336:0x1284, B:338:0x128c, B:339:0x1297, B:341:0x129f, B:342:0x12aa, B:344:0x12b2, B:345:0x12bd, B:347:0x12c5, B:348:0x12d0, B:350:0x12d8, B:351:0x12e3, B:353:0x12eb, B:354:0x12f6, B:356:0x12fe, B:357:0x1309, B:359:0x1311, B:360:0x131c, B:362:0x1324, B:363:0x132f, B:365:0x1337, B:366:0x1342, B:368:0x134a, B:369:0x1355, B:371:0x135d, B:372:0x1368, B:374:0x1370, B:375:0x137b, B:377:0x137f, B:379:0x1383, B:381:0x138d, B:382:0x1392, B:384:0x1399, B:385:0x139c, B:387:0x13b3, B:388:0x13bb, B:394:0x13d9, B:399:0x13f4, B:401:0x13fb, B:402:0x1400, B:404:0x1404, B:405:0x143f, B:407:0x1445, B:408:0x144a, B:410:0x144f, B:411:0x1454, B:413:0x1458, B:414:0x1463, B:416:0x1467, B:417:0x147c, B:419:0x1495, B:420:0x149e, B:422:0x14a2, B:423:0x14b5, B:425:0x14b9, B:426:0x14d5, B:428:0x14d9, B:429:0x14de, B:431:0x14e2, B:432:0x14e7, B:434:0x14eb, B:435:0x14f1, B:437:0x14f5, B:438:0x1505, B:440:0x1518, B:441:0x151f, B:443:0x1529, B:446:0x153a, B:448:0x153f, B:449:0x155e, B:451:0x1566, B:452:0x158a, B:454:0x1591, B:455:0x1598, B:457:0x159d, B:459:0x15a8, B:465:0x15c2, B:467:0x15ca, B:469:0x15d4, B:470:0x15d6, B:481:0x1678, B:471:0x15d9, B:473:0x1643, B:475:0x1647, B:477:0x164f, B:478:0x1664, B:480:0x166a, B:482:0x167f, B:483:0x1684, B:485:0x1688, B:487:0x168c, B:488:0x168f, B:490:0x1695, B:491:0x169a, B:445:0x1533, B:462:0x15af, B:463:0x15b6, B:391:0x13cf, B:202:0x0f31, B:204:0x0f3c, B:205:0x0f44, B:207:0x0f4a, B:190:0x0eb2, B:191:0x0eec, B:193:0x0ef2, B:194:0x0f00, B:195:0x0f12, B:197:0x0f18, B:168:0x0e42, B:159:0x0b31, B:60:0x01a6, B:28:0x00c3, B:30:0x00cd, B:32:0x00d7, B:34:0x00e5, B:36:0x00f0, B:35:0x00ec), top: B:496:0x00ad }] */
    /* JADX WARN: Removed duplicated region for block: B:244:0x1055 A[Catch: JSONException -> 0x169e, TryCatch #0 {JSONException -> 0x169e, blocks: (B:23:0x00ad, B:25:0x00b1, B:27:0x00bc, B:29:0x00c7, B:38:0x00fc, B:40:0x0104, B:42:0x0108, B:43:0x0116, B:45:0x011e, B:46:0x012a, B:48:0x0130, B:50:0x0146, B:51:0x0158, B:53:0x015c, B:55:0x0164, B:56:0x0176, B:58:0x0195, B:63:0x01b2, B:65:0x01c5, B:66:0x01ca, B:68:0x01d2, B:69:0x01d6, B:71:0x01dc, B:72:0x01ea, B:74:0x01fb, B:76:0x020b, B:80:0x024d, B:82:0x0251, B:93:0x026e, B:95:0x0273, B:97:0x0277, B:99:0x0282, B:100:0x028f, B:106:0x02a0, B:109:0x02a8, B:110:0x02bc, B:112:0x02c2, B:113:0x02d1, B:114:0x02e7, B:116:0x02ed, B:117:0x02fb, B:120:0x032c, B:124:0x037d, B:128:0x03c4, B:131:0x06b9, B:135:0x06ca, B:139:0x06f7, B:141:0x09f9, B:142:0x09fb, B:144:0x0a05, B:145:0x0a07, B:147:0x0a11, B:148:0x0a13, B:156:0x0acb, B:160:0x0b3b, B:164:0x0ca9, B:167:0x0d14, B:171:0x0e50, B:173:0x0e70, B:175:0x0e76, B:176:0x0e7f, B:178:0x0e86, B:179:0x0e8b, B:181:0x0e95, B:182:0x0e9e, B:184:0x0ea6, B:186:0x0eaa, B:188:0x0eae, B:198:0x0f26, B:200:0x0f2b, B:208:0x0f5e, B:210:0x0f63, B:212:0x0f7f, B:213:0x0f87, B:215:0x0f8d, B:216:0x0fa1, B:217:0x0faa, B:219:0x0fb9, B:221:0x0fc1, B:223:0x0fd0, B:224:0x0fdb, B:226:0x0fe3, B:227:0x0fee, B:229:0x0ff6, B:230:0x1001, B:232:0x1009, B:233:0x1014, B:235:0x101c, B:236:0x1027, B:238:0x102f, B:239:0x103a, B:241:0x1042, B:242:0x104d, B:244:0x1055, B:245:0x1060, B:247:0x1066, B:248:0x106d, B:250:0x1075, B:251:0x1080, B:253:0x1086, B:254:0x108d, B:256:0x1095, B:257:0x10a0, B:259:0x10a8, B:260:0x10b3, B:262:0x10bb, B:263:0x10c6, B:265:0x10ce, B:266:0x10d9, B:268:0x10e1, B:269:0x10ec, B:271:0x10f2, B:272:0x10f9, B:274:0x1101, B:275:0x110c, B:277:0x1114, B:278:0x111f, B:280:0x1127, B:281:0x1132, B:283:0x1138, B:284:0x113f, B:286:0x1149, B:288:0x114f, B:290:0x115c, B:291:0x1167, B:293:0x116f, B:294:0x117a, B:296:0x1182, B:297:0x118d, B:299:0x1195, B:300:0x11a0, B:302:0x11a8, B:303:0x11b3, B:305:0x11bb, B:306:0x11c6, B:308:0x11ce, B:309:0x11d9, B:311:0x11e1, B:312:0x11ec, B:314:0x11f4, B:315:0x11ff, B:317:0x1207, B:318:0x1212, B:320:0x121a, B:321:0x1225, B:323:0x122d, B:324:0x1238, B:326:0x1240, B:327:0x124b, B:329:0x1253, B:330:0x125e, B:332:0x1266, B:333:0x1271, B:335:0x1279, B:336:0x1284, B:338:0x128c, B:339:0x1297, B:341:0x129f, B:342:0x12aa, B:344:0x12b2, B:345:0x12bd, B:347:0x12c5, B:348:0x12d0, B:350:0x12d8, B:351:0x12e3, B:353:0x12eb, B:354:0x12f6, B:356:0x12fe, B:357:0x1309, B:359:0x1311, B:360:0x131c, B:362:0x1324, B:363:0x132f, B:365:0x1337, B:366:0x1342, B:368:0x134a, B:369:0x1355, B:371:0x135d, B:372:0x1368, B:374:0x1370, B:375:0x137b, B:377:0x137f, B:379:0x1383, B:381:0x138d, B:382:0x1392, B:384:0x1399, B:385:0x139c, B:387:0x13b3, B:388:0x13bb, B:394:0x13d9, B:399:0x13f4, B:401:0x13fb, B:402:0x1400, B:404:0x1404, B:405:0x143f, B:407:0x1445, B:408:0x144a, B:410:0x144f, B:411:0x1454, B:413:0x1458, B:414:0x1463, B:416:0x1467, B:417:0x147c, B:419:0x1495, B:420:0x149e, B:422:0x14a2, B:423:0x14b5, B:425:0x14b9, B:426:0x14d5, B:428:0x14d9, B:429:0x14de, B:431:0x14e2, B:432:0x14e7, B:434:0x14eb, B:435:0x14f1, B:437:0x14f5, B:438:0x1505, B:440:0x1518, B:441:0x151f, B:443:0x1529, B:446:0x153a, B:448:0x153f, B:449:0x155e, B:451:0x1566, B:452:0x158a, B:454:0x1591, B:455:0x1598, B:457:0x159d, B:459:0x15a8, B:465:0x15c2, B:467:0x15ca, B:469:0x15d4, B:470:0x15d6, B:481:0x1678, B:471:0x15d9, B:473:0x1643, B:475:0x1647, B:477:0x164f, B:478:0x1664, B:480:0x166a, B:482:0x167f, B:483:0x1684, B:485:0x1688, B:487:0x168c, B:488:0x168f, B:490:0x1695, B:491:0x169a, B:445:0x1533, B:462:0x15af, B:463:0x15b6, B:391:0x13cf, B:202:0x0f31, B:204:0x0f3c, B:205:0x0f44, B:207:0x0f4a, B:190:0x0eb2, B:191:0x0eec, B:193:0x0ef2, B:194:0x0f00, B:195:0x0f12, B:197:0x0f18, B:168:0x0e42, B:159:0x0b31, B:60:0x01a6, B:28:0x00c3, B:30:0x00cd, B:32:0x00d7, B:34:0x00e5, B:36:0x00f0, B:35:0x00ec), top: B:496:0x00ad }] */
    /* JADX WARN: Removed duplicated region for block: B:247:0x1066 A[Catch: JSONException -> 0x169e, TryCatch #0 {JSONException -> 0x169e, blocks: (B:23:0x00ad, B:25:0x00b1, B:27:0x00bc, B:29:0x00c7, B:38:0x00fc, B:40:0x0104, B:42:0x0108, B:43:0x0116, B:45:0x011e, B:46:0x012a, B:48:0x0130, B:50:0x0146, B:51:0x0158, B:53:0x015c, B:55:0x0164, B:56:0x0176, B:58:0x0195, B:63:0x01b2, B:65:0x01c5, B:66:0x01ca, B:68:0x01d2, B:69:0x01d6, B:71:0x01dc, B:72:0x01ea, B:74:0x01fb, B:76:0x020b, B:80:0x024d, B:82:0x0251, B:93:0x026e, B:95:0x0273, B:97:0x0277, B:99:0x0282, B:100:0x028f, B:106:0x02a0, B:109:0x02a8, B:110:0x02bc, B:112:0x02c2, B:113:0x02d1, B:114:0x02e7, B:116:0x02ed, B:117:0x02fb, B:120:0x032c, B:124:0x037d, B:128:0x03c4, B:131:0x06b9, B:135:0x06ca, B:139:0x06f7, B:141:0x09f9, B:142:0x09fb, B:144:0x0a05, B:145:0x0a07, B:147:0x0a11, B:148:0x0a13, B:156:0x0acb, B:160:0x0b3b, B:164:0x0ca9, B:167:0x0d14, B:171:0x0e50, B:173:0x0e70, B:175:0x0e76, B:176:0x0e7f, B:178:0x0e86, B:179:0x0e8b, B:181:0x0e95, B:182:0x0e9e, B:184:0x0ea6, B:186:0x0eaa, B:188:0x0eae, B:198:0x0f26, B:200:0x0f2b, B:208:0x0f5e, B:210:0x0f63, B:212:0x0f7f, B:213:0x0f87, B:215:0x0f8d, B:216:0x0fa1, B:217:0x0faa, B:219:0x0fb9, B:221:0x0fc1, B:223:0x0fd0, B:224:0x0fdb, B:226:0x0fe3, B:227:0x0fee, B:229:0x0ff6, B:230:0x1001, B:232:0x1009, B:233:0x1014, B:235:0x101c, B:236:0x1027, B:238:0x102f, B:239:0x103a, B:241:0x1042, B:242:0x104d, B:244:0x1055, B:245:0x1060, B:247:0x1066, B:248:0x106d, B:250:0x1075, B:251:0x1080, B:253:0x1086, B:254:0x108d, B:256:0x1095, B:257:0x10a0, B:259:0x10a8, B:260:0x10b3, B:262:0x10bb, B:263:0x10c6, B:265:0x10ce, B:266:0x10d9, B:268:0x10e1, B:269:0x10ec, B:271:0x10f2, B:272:0x10f9, B:274:0x1101, B:275:0x110c, B:277:0x1114, B:278:0x111f, B:280:0x1127, B:281:0x1132, B:283:0x1138, B:284:0x113f, B:286:0x1149, B:288:0x114f, B:290:0x115c, B:291:0x1167, B:293:0x116f, B:294:0x117a, B:296:0x1182, B:297:0x118d, B:299:0x1195, B:300:0x11a0, B:302:0x11a8, B:303:0x11b3, B:305:0x11bb, B:306:0x11c6, B:308:0x11ce, B:309:0x11d9, B:311:0x11e1, B:312:0x11ec, B:314:0x11f4, B:315:0x11ff, B:317:0x1207, B:318:0x1212, B:320:0x121a, B:321:0x1225, B:323:0x122d, B:324:0x1238, B:326:0x1240, B:327:0x124b, B:329:0x1253, B:330:0x125e, B:332:0x1266, B:333:0x1271, B:335:0x1279, B:336:0x1284, B:338:0x128c, B:339:0x1297, B:341:0x129f, B:342:0x12aa, B:344:0x12b2, B:345:0x12bd, B:347:0x12c5, B:348:0x12d0, B:350:0x12d8, B:351:0x12e3, B:353:0x12eb, B:354:0x12f6, B:356:0x12fe, B:357:0x1309, B:359:0x1311, B:360:0x131c, B:362:0x1324, B:363:0x132f, B:365:0x1337, B:366:0x1342, B:368:0x134a, B:369:0x1355, B:371:0x135d, B:372:0x1368, B:374:0x1370, B:375:0x137b, B:377:0x137f, B:379:0x1383, B:381:0x138d, B:382:0x1392, B:384:0x1399, B:385:0x139c, B:387:0x13b3, B:388:0x13bb, B:394:0x13d9, B:399:0x13f4, B:401:0x13fb, B:402:0x1400, B:404:0x1404, B:405:0x143f, B:407:0x1445, B:408:0x144a, B:410:0x144f, B:411:0x1454, B:413:0x1458, B:414:0x1463, B:416:0x1467, B:417:0x147c, B:419:0x1495, B:420:0x149e, B:422:0x14a2, B:423:0x14b5, B:425:0x14b9, B:426:0x14d5, B:428:0x14d9, B:429:0x14de, B:431:0x14e2, B:432:0x14e7, B:434:0x14eb, B:435:0x14f1, B:437:0x14f5, B:438:0x1505, B:440:0x1518, B:441:0x151f, B:443:0x1529, B:446:0x153a, B:448:0x153f, B:449:0x155e, B:451:0x1566, B:452:0x158a, B:454:0x1591, B:455:0x1598, B:457:0x159d, B:459:0x15a8, B:465:0x15c2, B:467:0x15ca, B:469:0x15d4, B:470:0x15d6, B:481:0x1678, B:471:0x15d9, B:473:0x1643, B:475:0x1647, B:477:0x164f, B:478:0x1664, B:480:0x166a, B:482:0x167f, B:483:0x1684, B:485:0x1688, B:487:0x168c, B:488:0x168f, B:490:0x1695, B:491:0x169a, B:445:0x1533, B:462:0x15af, B:463:0x15b6, B:391:0x13cf, B:202:0x0f31, B:204:0x0f3c, B:205:0x0f44, B:207:0x0f4a, B:190:0x0eb2, B:191:0x0eec, B:193:0x0ef2, B:194:0x0f00, B:195:0x0f12, B:197:0x0f18, B:168:0x0e42, B:159:0x0b31, B:60:0x01a6, B:28:0x00c3, B:30:0x00cd, B:32:0x00d7, B:34:0x00e5, B:36:0x00f0, B:35:0x00ec), top: B:496:0x00ad }] */
    /* JADX WARN: Removed duplicated region for block: B:250:0x1075 A[Catch: JSONException -> 0x169e, TryCatch #0 {JSONException -> 0x169e, blocks: (B:23:0x00ad, B:25:0x00b1, B:27:0x00bc, B:29:0x00c7, B:38:0x00fc, B:40:0x0104, B:42:0x0108, B:43:0x0116, B:45:0x011e, B:46:0x012a, B:48:0x0130, B:50:0x0146, B:51:0x0158, B:53:0x015c, B:55:0x0164, B:56:0x0176, B:58:0x0195, B:63:0x01b2, B:65:0x01c5, B:66:0x01ca, B:68:0x01d2, B:69:0x01d6, B:71:0x01dc, B:72:0x01ea, B:74:0x01fb, B:76:0x020b, B:80:0x024d, B:82:0x0251, B:93:0x026e, B:95:0x0273, B:97:0x0277, B:99:0x0282, B:100:0x028f, B:106:0x02a0, B:109:0x02a8, B:110:0x02bc, B:112:0x02c2, B:113:0x02d1, B:114:0x02e7, B:116:0x02ed, B:117:0x02fb, B:120:0x032c, B:124:0x037d, B:128:0x03c4, B:131:0x06b9, B:135:0x06ca, B:139:0x06f7, B:141:0x09f9, B:142:0x09fb, B:144:0x0a05, B:145:0x0a07, B:147:0x0a11, B:148:0x0a13, B:156:0x0acb, B:160:0x0b3b, B:164:0x0ca9, B:167:0x0d14, B:171:0x0e50, B:173:0x0e70, B:175:0x0e76, B:176:0x0e7f, B:178:0x0e86, B:179:0x0e8b, B:181:0x0e95, B:182:0x0e9e, B:184:0x0ea6, B:186:0x0eaa, B:188:0x0eae, B:198:0x0f26, B:200:0x0f2b, B:208:0x0f5e, B:210:0x0f63, B:212:0x0f7f, B:213:0x0f87, B:215:0x0f8d, B:216:0x0fa1, B:217:0x0faa, B:219:0x0fb9, B:221:0x0fc1, B:223:0x0fd0, B:224:0x0fdb, B:226:0x0fe3, B:227:0x0fee, B:229:0x0ff6, B:230:0x1001, B:232:0x1009, B:233:0x1014, B:235:0x101c, B:236:0x1027, B:238:0x102f, B:239:0x103a, B:241:0x1042, B:242:0x104d, B:244:0x1055, B:245:0x1060, B:247:0x1066, B:248:0x106d, B:250:0x1075, B:251:0x1080, B:253:0x1086, B:254:0x108d, B:256:0x1095, B:257:0x10a0, B:259:0x10a8, B:260:0x10b3, B:262:0x10bb, B:263:0x10c6, B:265:0x10ce, B:266:0x10d9, B:268:0x10e1, B:269:0x10ec, B:271:0x10f2, B:272:0x10f9, B:274:0x1101, B:275:0x110c, B:277:0x1114, B:278:0x111f, B:280:0x1127, B:281:0x1132, B:283:0x1138, B:284:0x113f, B:286:0x1149, B:288:0x114f, B:290:0x115c, B:291:0x1167, B:293:0x116f, B:294:0x117a, B:296:0x1182, B:297:0x118d, B:299:0x1195, B:300:0x11a0, B:302:0x11a8, B:303:0x11b3, B:305:0x11bb, B:306:0x11c6, B:308:0x11ce, B:309:0x11d9, B:311:0x11e1, B:312:0x11ec, B:314:0x11f4, B:315:0x11ff, B:317:0x1207, B:318:0x1212, B:320:0x121a, B:321:0x1225, B:323:0x122d, B:324:0x1238, B:326:0x1240, B:327:0x124b, B:329:0x1253, B:330:0x125e, B:332:0x1266, B:333:0x1271, B:335:0x1279, B:336:0x1284, B:338:0x128c, B:339:0x1297, B:341:0x129f, B:342:0x12aa, B:344:0x12b2, B:345:0x12bd, B:347:0x12c5, B:348:0x12d0, B:350:0x12d8, B:351:0x12e3, B:353:0x12eb, B:354:0x12f6, B:356:0x12fe, B:357:0x1309, B:359:0x1311, B:360:0x131c, B:362:0x1324, B:363:0x132f, B:365:0x1337, B:366:0x1342, B:368:0x134a, B:369:0x1355, B:371:0x135d, B:372:0x1368, B:374:0x1370, B:375:0x137b, B:377:0x137f, B:379:0x1383, B:381:0x138d, B:382:0x1392, B:384:0x1399, B:385:0x139c, B:387:0x13b3, B:388:0x13bb, B:394:0x13d9, B:399:0x13f4, B:401:0x13fb, B:402:0x1400, B:404:0x1404, B:405:0x143f, B:407:0x1445, B:408:0x144a, B:410:0x144f, B:411:0x1454, B:413:0x1458, B:414:0x1463, B:416:0x1467, B:417:0x147c, B:419:0x1495, B:420:0x149e, B:422:0x14a2, B:423:0x14b5, B:425:0x14b9, B:426:0x14d5, B:428:0x14d9, B:429:0x14de, B:431:0x14e2, B:432:0x14e7, B:434:0x14eb, B:435:0x14f1, B:437:0x14f5, B:438:0x1505, B:440:0x1518, B:441:0x151f, B:443:0x1529, B:446:0x153a, B:448:0x153f, B:449:0x155e, B:451:0x1566, B:452:0x158a, B:454:0x1591, B:455:0x1598, B:457:0x159d, B:459:0x15a8, B:465:0x15c2, B:467:0x15ca, B:469:0x15d4, B:470:0x15d6, B:481:0x1678, B:471:0x15d9, B:473:0x1643, B:475:0x1647, B:477:0x164f, B:478:0x1664, B:480:0x166a, B:482:0x167f, B:483:0x1684, B:485:0x1688, B:487:0x168c, B:488:0x168f, B:490:0x1695, B:491:0x169a, B:445:0x1533, B:462:0x15af, B:463:0x15b6, B:391:0x13cf, B:202:0x0f31, B:204:0x0f3c, B:205:0x0f44, B:207:0x0f4a, B:190:0x0eb2, B:191:0x0eec, B:193:0x0ef2, B:194:0x0f00, B:195:0x0f12, B:197:0x0f18, B:168:0x0e42, B:159:0x0b31, B:60:0x01a6, B:28:0x00c3, B:30:0x00cd, B:32:0x00d7, B:34:0x00e5, B:36:0x00f0, B:35:0x00ec), top: B:496:0x00ad }] */
    /* JADX WARN: Removed duplicated region for block: B:253:0x1086 A[Catch: JSONException -> 0x169e, TryCatch #0 {JSONException -> 0x169e, blocks: (B:23:0x00ad, B:25:0x00b1, B:27:0x00bc, B:29:0x00c7, B:38:0x00fc, B:40:0x0104, B:42:0x0108, B:43:0x0116, B:45:0x011e, B:46:0x012a, B:48:0x0130, B:50:0x0146, B:51:0x0158, B:53:0x015c, B:55:0x0164, B:56:0x0176, B:58:0x0195, B:63:0x01b2, B:65:0x01c5, B:66:0x01ca, B:68:0x01d2, B:69:0x01d6, B:71:0x01dc, B:72:0x01ea, B:74:0x01fb, B:76:0x020b, B:80:0x024d, B:82:0x0251, B:93:0x026e, B:95:0x0273, B:97:0x0277, B:99:0x0282, B:100:0x028f, B:106:0x02a0, B:109:0x02a8, B:110:0x02bc, B:112:0x02c2, B:113:0x02d1, B:114:0x02e7, B:116:0x02ed, B:117:0x02fb, B:120:0x032c, B:124:0x037d, B:128:0x03c4, B:131:0x06b9, B:135:0x06ca, B:139:0x06f7, B:141:0x09f9, B:142:0x09fb, B:144:0x0a05, B:145:0x0a07, B:147:0x0a11, B:148:0x0a13, B:156:0x0acb, B:160:0x0b3b, B:164:0x0ca9, B:167:0x0d14, B:171:0x0e50, B:173:0x0e70, B:175:0x0e76, B:176:0x0e7f, B:178:0x0e86, B:179:0x0e8b, B:181:0x0e95, B:182:0x0e9e, B:184:0x0ea6, B:186:0x0eaa, B:188:0x0eae, B:198:0x0f26, B:200:0x0f2b, B:208:0x0f5e, B:210:0x0f63, B:212:0x0f7f, B:213:0x0f87, B:215:0x0f8d, B:216:0x0fa1, B:217:0x0faa, B:219:0x0fb9, B:221:0x0fc1, B:223:0x0fd0, B:224:0x0fdb, B:226:0x0fe3, B:227:0x0fee, B:229:0x0ff6, B:230:0x1001, B:232:0x1009, B:233:0x1014, B:235:0x101c, B:236:0x1027, B:238:0x102f, B:239:0x103a, B:241:0x1042, B:242:0x104d, B:244:0x1055, B:245:0x1060, B:247:0x1066, B:248:0x106d, B:250:0x1075, B:251:0x1080, B:253:0x1086, B:254:0x108d, B:256:0x1095, B:257:0x10a0, B:259:0x10a8, B:260:0x10b3, B:262:0x10bb, B:263:0x10c6, B:265:0x10ce, B:266:0x10d9, B:268:0x10e1, B:269:0x10ec, B:271:0x10f2, B:272:0x10f9, B:274:0x1101, B:275:0x110c, B:277:0x1114, B:278:0x111f, B:280:0x1127, B:281:0x1132, B:283:0x1138, B:284:0x113f, B:286:0x1149, B:288:0x114f, B:290:0x115c, B:291:0x1167, B:293:0x116f, B:294:0x117a, B:296:0x1182, B:297:0x118d, B:299:0x1195, B:300:0x11a0, B:302:0x11a8, B:303:0x11b3, B:305:0x11bb, B:306:0x11c6, B:308:0x11ce, B:309:0x11d9, B:311:0x11e1, B:312:0x11ec, B:314:0x11f4, B:315:0x11ff, B:317:0x1207, B:318:0x1212, B:320:0x121a, B:321:0x1225, B:323:0x122d, B:324:0x1238, B:326:0x1240, B:327:0x124b, B:329:0x1253, B:330:0x125e, B:332:0x1266, B:333:0x1271, B:335:0x1279, B:336:0x1284, B:338:0x128c, B:339:0x1297, B:341:0x129f, B:342:0x12aa, B:344:0x12b2, B:345:0x12bd, B:347:0x12c5, B:348:0x12d0, B:350:0x12d8, B:351:0x12e3, B:353:0x12eb, B:354:0x12f6, B:356:0x12fe, B:357:0x1309, B:359:0x1311, B:360:0x131c, B:362:0x1324, B:363:0x132f, B:365:0x1337, B:366:0x1342, B:368:0x134a, B:369:0x1355, B:371:0x135d, B:372:0x1368, B:374:0x1370, B:375:0x137b, B:377:0x137f, B:379:0x1383, B:381:0x138d, B:382:0x1392, B:384:0x1399, B:385:0x139c, B:387:0x13b3, B:388:0x13bb, B:394:0x13d9, B:399:0x13f4, B:401:0x13fb, B:402:0x1400, B:404:0x1404, B:405:0x143f, B:407:0x1445, B:408:0x144a, B:410:0x144f, B:411:0x1454, B:413:0x1458, B:414:0x1463, B:416:0x1467, B:417:0x147c, B:419:0x1495, B:420:0x149e, B:422:0x14a2, B:423:0x14b5, B:425:0x14b9, B:426:0x14d5, B:428:0x14d9, B:429:0x14de, B:431:0x14e2, B:432:0x14e7, B:434:0x14eb, B:435:0x14f1, B:437:0x14f5, B:438:0x1505, B:440:0x1518, B:441:0x151f, B:443:0x1529, B:446:0x153a, B:448:0x153f, B:449:0x155e, B:451:0x1566, B:452:0x158a, B:454:0x1591, B:455:0x1598, B:457:0x159d, B:459:0x15a8, B:465:0x15c2, B:467:0x15ca, B:469:0x15d4, B:470:0x15d6, B:481:0x1678, B:471:0x15d9, B:473:0x1643, B:475:0x1647, B:477:0x164f, B:478:0x1664, B:480:0x166a, B:482:0x167f, B:483:0x1684, B:485:0x1688, B:487:0x168c, B:488:0x168f, B:490:0x1695, B:491:0x169a, B:445:0x1533, B:462:0x15af, B:463:0x15b6, B:391:0x13cf, B:202:0x0f31, B:204:0x0f3c, B:205:0x0f44, B:207:0x0f4a, B:190:0x0eb2, B:191:0x0eec, B:193:0x0ef2, B:194:0x0f00, B:195:0x0f12, B:197:0x0f18, B:168:0x0e42, B:159:0x0b31, B:60:0x01a6, B:28:0x00c3, B:30:0x00cd, B:32:0x00d7, B:34:0x00e5, B:36:0x00f0, B:35:0x00ec), top: B:496:0x00ad }] */
    /* JADX WARN: Removed duplicated region for block: B:256:0x1095 A[Catch: JSONException -> 0x169e, TryCatch #0 {JSONException -> 0x169e, blocks: (B:23:0x00ad, B:25:0x00b1, B:27:0x00bc, B:29:0x00c7, B:38:0x00fc, B:40:0x0104, B:42:0x0108, B:43:0x0116, B:45:0x011e, B:46:0x012a, B:48:0x0130, B:50:0x0146, B:51:0x0158, B:53:0x015c, B:55:0x0164, B:56:0x0176, B:58:0x0195, B:63:0x01b2, B:65:0x01c5, B:66:0x01ca, B:68:0x01d2, B:69:0x01d6, B:71:0x01dc, B:72:0x01ea, B:74:0x01fb, B:76:0x020b, B:80:0x024d, B:82:0x0251, B:93:0x026e, B:95:0x0273, B:97:0x0277, B:99:0x0282, B:100:0x028f, B:106:0x02a0, B:109:0x02a8, B:110:0x02bc, B:112:0x02c2, B:113:0x02d1, B:114:0x02e7, B:116:0x02ed, B:117:0x02fb, B:120:0x032c, B:124:0x037d, B:128:0x03c4, B:131:0x06b9, B:135:0x06ca, B:139:0x06f7, B:141:0x09f9, B:142:0x09fb, B:144:0x0a05, B:145:0x0a07, B:147:0x0a11, B:148:0x0a13, B:156:0x0acb, B:160:0x0b3b, B:164:0x0ca9, B:167:0x0d14, B:171:0x0e50, B:173:0x0e70, B:175:0x0e76, B:176:0x0e7f, B:178:0x0e86, B:179:0x0e8b, B:181:0x0e95, B:182:0x0e9e, B:184:0x0ea6, B:186:0x0eaa, B:188:0x0eae, B:198:0x0f26, B:200:0x0f2b, B:208:0x0f5e, B:210:0x0f63, B:212:0x0f7f, B:213:0x0f87, B:215:0x0f8d, B:216:0x0fa1, B:217:0x0faa, B:219:0x0fb9, B:221:0x0fc1, B:223:0x0fd0, B:224:0x0fdb, B:226:0x0fe3, B:227:0x0fee, B:229:0x0ff6, B:230:0x1001, B:232:0x1009, B:233:0x1014, B:235:0x101c, B:236:0x1027, B:238:0x102f, B:239:0x103a, B:241:0x1042, B:242:0x104d, B:244:0x1055, B:245:0x1060, B:247:0x1066, B:248:0x106d, B:250:0x1075, B:251:0x1080, B:253:0x1086, B:254:0x108d, B:256:0x1095, B:257:0x10a0, B:259:0x10a8, B:260:0x10b3, B:262:0x10bb, B:263:0x10c6, B:265:0x10ce, B:266:0x10d9, B:268:0x10e1, B:269:0x10ec, B:271:0x10f2, B:272:0x10f9, B:274:0x1101, B:275:0x110c, B:277:0x1114, B:278:0x111f, B:280:0x1127, B:281:0x1132, B:283:0x1138, B:284:0x113f, B:286:0x1149, B:288:0x114f, B:290:0x115c, B:291:0x1167, B:293:0x116f, B:294:0x117a, B:296:0x1182, B:297:0x118d, B:299:0x1195, B:300:0x11a0, B:302:0x11a8, B:303:0x11b3, B:305:0x11bb, B:306:0x11c6, B:308:0x11ce, B:309:0x11d9, B:311:0x11e1, B:312:0x11ec, B:314:0x11f4, B:315:0x11ff, B:317:0x1207, B:318:0x1212, B:320:0x121a, B:321:0x1225, B:323:0x122d, B:324:0x1238, B:326:0x1240, B:327:0x124b, B:329:0x1253, B:330:0x125e, B:332:0x1266, B:333:0x1271, B:335:0x1279, B:336:0x1284, B:338:0x128c, B:339:0x1297, B:341:0x129f, B:342:0x12aa, B:344:0x12b2, B:345:0x12bd, B:347:0x12c5, B:348:0x12d0, B:350:0x12d8, B:351:0x12e3, B:353:0x12eb, B:354:0x12f6, B:356:0x12fe, B:357:0x1309, B:359:0x1311, B:360:0x131c, B:362:0x1324, B:363:0x132f, B:365:0x1337, B:366:0x1342, B:368:0x134a, B:369:0x1355, B:371:0x135d, B:372:0x1368, B:374:0x1370, B:375:0x137b, B:377:0x137f, B:379:0x1383, B:381:0x138d, B:382:0x1392, B:384:0x1399, B:385:0x139c, B:387:0x13b3, B:388:0x13bb, B:394:0x13d9, B:399:0x13f4, B:401:0x13fb, B:402:0x1400, B:404:0x1404, B:405:0x143f, B:407:0x1445, B:408:0x144a, B:410:0x144f, B:411:0x1454, B:413:0x1458, B:414:0x1463, B:416:0x1467, B:417:0x147c, B:419:0x1495, B:420:0x149e, B:422:0x14a2, B:423:0x14b5, B:425:0x14b9, B:426:0x14d5, B:428:0x14d9, B:429:0x14de, B:431:0x14e2, B:432:0x14e7, B:434:0x14eb, B:435:0x14f1, B:437:0x14f5, B:438:0x1505, B:440:0x1518, B:441:0x151f, B:443:0x1529, B:446:0x153a, B:448:0x153f, B:449:0x155e, B:451:0x1566, B:452:0x158a, B:454:0x1591, B:455:0x1598, B:457:0x159d, B:459:0x15a8, B:465:0x15c2, B:467:0x15ca, B:469:0x15d4, B:470:0x15d6, B:481:0x1678, B:471:0x15d9, B:473:0x1643, B:475:0x1647, B:477:0x164f, B:478:0x1664, B:480:0x166a, B:482:0x167f, B:483:0x1684, B:485:0x1688, B:487:0x168c, B:488:0x168f, B:490:0x1695, B:491:0x169a, B:445:0x1533, B:462:0x15af, B:463:0x15b6, B:391:0x13cf, B:202:0x0f31, B:204:0x0f3c, B:205:0x0f44, B:207:0x0f4a, B:190:0x0eb2, B:191:0x0eec, B:193:0x0ef2, B:194:0x0f00, B:195:0x0f12, B:197:0x0f18, B:168:0x0e42, B:159:0x0b31, B:60:0x01a6, B:28:0x00c3, B:30:0x00cd, B:32:0x00d7, B:34:0x00e5, B:36:0x00f0, B:35:0x00ec), top: B:496:0x00ad }] */
    /* JADX WARN: Removed duplicated region for block: B:259:0x10a8 A[Catch: JSONException -> 0x169e, TryCatch #0 {JSONException -> 0x169e, blocks: (B:23:0x00ad, B:25:0x00b1, B:27:0x00bc, B:29:0x00c7, B:38:0x00fc, B:40:0x0104, B:42:0x0108, B:43:0x0116, B:45:0x011e, B:46:0x012a, B:48:0x0130, B:50:0x0146, B:51:0x0158, B:53:0x015c, B:55:0x0164, B:56:0x0176, B:58:0x0195, B:63:0x01b2, B:65:0x01c5, B:66:0x01ca, B:68:0x01d2, B:69:0x01d6, B:71:0x01dc, B:72:0x01ea, B:74:0x01fb, B:76:0x020b, B:80:0x024d, B:82:0x0251, B:93:0x026e, B:95:0x0273, B:97:0x0277, B:99:0x0282, B:100:0x028f, B:106:0x02a0, B:109:0x02a8, B:110:0x02bc, B:112:0x02c2, B:113:0x02d1, B:114:0x02e7, B:116:0x02ed, B:117:0x02fb, B:120:0x032c, B:124:0x037d, B:128:0x03c4, B:131:0x06b9, B:135:0x06ca, B:139:0x06f7, B:141:0x09f9, B:142:0x09fb, B:144:0x0a05, B:145:0x0a07, B:147:0x0a11, B:148:0x0a13, B:156:0x0acb, B:160:0x0b3b, B:164:0x0ca9, B:167:0x0d14, B:171:0x0e50, B:173:0x0e70, B:175:0x0e76, B:176:0x0e7f, B:178:0x0e86, B:179:0x0e8b, B:181:0x0e95, B:182:0x0e9e, B:184:0x0ea6, B:186:0x0eaa, B:188:0x0eae, B:198:0x0f26, B:200:0x0f2b, B:208:0x0f5e, B:210:0x0f63, B:212:0x0f7f, B:213:0x0f87, B:215:0x0f8d, B:216:0x0fa1, B:217:0x0faa, B:219:0x0fb9, B:221:0x0fc1, B:223:0x0fd0, B:224:0x0fdb, B:226:0x0fe3, B:227:0x0fee, B:229:0x0ff6, B:230:0x1001, B:232:0x1009, B:233:0x1014, B:235:0x101c, B:236:0x1027, B:238:0x102f, B:239:0x103a, B:241:0x1042, B:242:0x104d, B:244:0x1055, B:245:0x1060, B:247:0x1066, B:248:0x106d, B:250:0x1075, B:251:0x1080, B:253:0x1086, B:254:0x108d, B:256:0x1095, B:257:0x10a0, B:259:0x10a8, B:260:0x10b3, B:262:0x10bb, B:263:0x10c6, B:265:0x10ce, B:266:0x10d9, B:268:0x10e1, B:269:0x10ec, B:271:0x10f2, B:272:0x10f9, B:274:0x1101, B:275:0x110c, B:277:0x1114, B:278:0x111f, B:280:0x1127, B:281:0x1132, B:283:0x1138, B:284:0x113f, B:286:0x1149, B:288:0x114f, B:290:0x115c, B:291:0x1167, B:293:0x116f, B:294:0x117a, B:296:0x1182, B:297:0x118d, B:299:0x1195, B:300:0x11a0, B:302:0x11a8, B:303:0x11b3, B:305:0x11bb, B:306:0x11c6, B:308:0x11ce, B:309:0x11d9, B:311:0x11e1, B:312:0x11ec, B:314:0x11f4, B:315:0x11ff, B:317:0x1207, B:318:0x1212, B:320:0x121a, B:321:0x1225, B:323:0x122d, B:324:0x1238, B:326:0x1240, B:327:0x124b, B:329:0x1253, B:330:0x125e, B:332:0x1266, B:333:0x1271, B:335:0x1279, B:336:0x1284, B:338:0x128c, B:339:0x1297, B:341:0x129f, B:342:0x12aa, B:344:0x12b2, B:345:0x12bd, B:347:0x12c5, B:348:0x12d0, B:350:0x12d8, B:351:0x12e3, B:353:0x12eb, B:354:0x12f6, B:356:0x12fe, B:357:0x1309, B:359:0x1311, B:360:0x131c, B:362:0x1324, B:363:0x132f, B:365:0x1337, B:366:0x1342, B:368:0x134a, B:369:0x1355, B:371:0x135d, B:372:0x1368, B:374:0x1370, B:375:0x137b, B:377:0x137f, B:379:0x1383, B:381:0x138d, B:382:0x1392, B:384:0x1399, B:385:0x139c, B:387:0x13b3, B:388:0x13bb, B:394:0x13d9, B:399:0x13f4, B:401:0x13fb, B:402:0x1400, B:404:0x1404, B:405:0x143f, B:407:0x1445, B:408:0x144a, B:410:0x144f, B:411:0x1454, B:413:0x1458, B:414:0x1463, B:416:0x1467, B:417:0x147c, B:419:0x1495, B:420:0x149e, B:422:0x14a2, B:423:0x14b5, B:425:0x14b9, B:426:0x14d5, B:428:0x14d9, B:429:0x14de, B:431:0x14e2, B:432:0x14e7, B:434:0x14eb, B:435:0x14f1, B:437:0x14f5, B:438:0x1505, B:440:0x1518, B:441:0x151f, B:443:0x1529, B:446:0x153a, B:448:0x153f, B:449:0x155e, B:451:0x1566, B:452:0x158a, B:454:0x1591, B:455:0x1598, B:457:0x159d, B:459:0x15a8, B:465:0x15c2, B:467:0x15ca, B:469:0x15d4, B:470:0x15d6, B:481:0x1678, B:471:0x15d9, B:473:0x1643, B:475:0x1647, B:477:0x164f, B:478:0x1664, B:480:0x166a, B:482:0x167f, B:483:0x1684, B:485:0x1688, B:487:0x168c, B:488:0x168f, B:490:0x1695, B:491:0x169a, B:445:0x1533, B:462:0x15af, B:463:0x15b6, B:391:0x13cf, B:202:0x0f31, B:204:0x0f3c, B:205:0x0f44, B:207:0x0f4a, B:190:0x0eb2, B:191:0x0eec, B:193:0x0ef2, B:194:0x0f00, B:195:0x0f12, B:197:0x0f18, B:168:0x0e42, B:159:0x0b31, B:60:0x01a6, B:28:0x00c3, B:30:0x00cd, B:32:0x00d7, B:34:0x00e5, B:36:0x00f0, B:35:0x00ec), top: B:496:0x00ad }] */
    /* JADX WARN: Removed duplicated region for block: B:262:0x10bb A[Catch: JSONException -> 0x169e, TryCatch #0 {JSONException -> 0x169e, blocks: (B:23:0x00ad, B:25:0x00b1, B:27:0x00bc, B:29:0x00c7, B:38:0x00fc, B:40:0x0104, B:42:0x0108, B:43:0x0116, B:45:0x011e, B:46:0x012a, B:48:0x0130, B:50:0x0146, B:51:0x0158, B:53:0x015c, B:55:0x0164, B:56:0x0176, B:58:0x0195, B:63:0x01b2, B:65:0x01c5, B:66:0x01ca, B:68:0x01d2, B:69:0x01d6, B:71:0x01dc, B:72:0x01ea, B:74:0x01fb, B:76:0x020b, B:80:0x024d, B:82:0x0251, B:93:0x026e, B:95:0x0273, B:97:0x0277, B:99:0x0282, B:100:0x028f, B:106:0x02a0, B:109:0x02a8, B:110:0x02bc, B:112:0x02c2, B:113:0x02d1, B:114:0x02e7, B:116:0x02ed, B:117:0x02fb, B:120:0x032c, B:124:0x037d, B:128:0x03c4, B:131:0x06b9, B:135:0x06ca, B:139:0x06f7, B:141:0x09f9, B:142:0x09fb, B:144:0x0a05, B:145:0x0a07, B:147:0x0a11, B:148:0x0a13, B:156:0x0acb, B:160:0x0b3b, B:164:0x0ca9, B:167:0x0d14, B:171:0x0e50, B:173:0x0e70, B:175:0x0e76, B:176:0x0e7f, B:178:0x0e86, B:179:0x0e8b, B:181:0x0e95, B:182:0x0e9e, B:184:0x0ea6, B:186:0x0eaa, B:188:0x0eae, B:198:0x0f26, B:200:0x0f2b, B:208:0x0f5e, B:210:0x0f63, B:212:0x0f7f, B:213:0x0f87, B:215:0x0f8d, B:216:0x0fa1, B:217:0x0faa, B:219:0x0fb9, B:221:0x0fc1, B:223:0x0fd0, B:224:0x0fdb, B:226:0x0fe3, B:227:0x0fee, B:229:0x0ff6, B:230:0x1001, B:232:0x1009, B:233:0x1014, B:235:0x101c, B:236:0x1027, B:238:0x102f, B:239:0x103a, B:241:0x1042, B:242:0x104d, B:244:0x1055, B:245:0x1060, B:247:0x1066, B:248:0x106d, B:250:0x1075, B:251:0x1080, B:253:0x1086, B:254:0x108d, B:256:0x1095, B:257:0x10a0, B:259:0x10a8, B:260:0x10b3, B:262:0x10bb, B:263:0x10c6, B:265:0x10ce, B:266:0x10d9, B:268:0x10e1, B:269:0x10ec, B:271:0x10f2, B:272:0x10f9, B:274:0x1101, B:275:0x110c, B:277:0x1114, B:278:0x111f, B:280:0x1127, B:281:0x1132, B:283:0x1138, B:284:0x113f, B:286:0x1149, B:288:0x114f, B:290:0x115c, B:291:0x1167, B:293:0x116f, B:294:0x117a, B:296:0x1182, B:297:0x118d, B:299:0x1195, B:300:0x11a0, B:302:0x11a8, B:303:0x11b3, B:305:0x11bb, B:306:0x11c6, B:308:0x11ce, B:309:0x11d9, B:311:0x11e1, B:312:0x11ec, B:314:0x11f4, B:315:0x11ff, B:317:0x1207, B:318:0x1212, B:320:0x121a, B:321:0x1225, B:323:0x122d, B:324:0x1238, B:326:0x1240, B:327:0x124b, B:329:0x1253, B:330:0x125e, B:332:0x1266, B:333:0x1271, B:335:0x1279, B:336:0x1284, B:338:0x128c, B:339:0x1297, B:341:0x129f, B:342:0x12aa, B:344:0x12b2, B:345:0x12bd, B:347:0x12c5, B:348:0x12d0, B:350:0x12d8, B:351:0x12e3, B:353:0x12eb, B:354:0x12f6, B:356:0x12fe, B:357:0x1309, B:359:0x1311, B:360:0x131c, B:362:0x1324, B:363:0x132f, B:365:0x1337, B:366:0x1342, B:368:0x134a, B:369:0x1355, B:371:0x135d, B:372:0x1368, B:374:0x1370, B:375:0x137b, B:377:0x137f, B:379:0x1383, B:381:0x138d, B:382:0x1392, B:384:0x1399, B:385:0x139c, B:387:0x13b3, B:388:0x13bb, B:394:0x13d9, B:399:0x13f4, B:401:0x13fb, B:402:0x1400, B:404:0x1404, B:405:0x143f, B:407:0x1445, B:408:0x144a, B:410:0x144f, B:411:0x1454, B:413:0x1458, B:414:0x1463, B:416:0x1467, B:417:0x147c, B:419:0x1495, B:420:0x149e, B:422:0x14a2, B:423:0x14b5, B:425:0x14b9, B:426:0x14d5, B:428:0x14d9, B:429:0x14de, B:431:0x14e2, B:432:0x14e7, B:434:0x14eb, B:435:0x14f1, B:437:0x14f5, B:438:0x1505, B:440:0x1518, B:441:0x151f, B:443:0x1529, B:446:0x153a, B:448:0x153f, B:449:0x155e, B:451:0x1566, B:452:0x158a, B:454:0x1591, B:455:0x1598, B:457:0x159d, B:459:0x15a8, B:465:0x15c2, B:467:0x15ca, B:469:0x15d4, B:470:0x15d6, B:481:0x1678, B:471:0x15d9, B:473:0x1643, B:475:0x1647, B:477:0x164f, B:478:0x1664, B:480:0x166a, B:482:0x167f, B:483:0x1684, B:485:0x1688, B:487:0x168c, B:488:0x168f, B:490:0x1695, B:491:0x169a, B:445:0x1533, B:462:0x15af, B:463:0x15b6, B:391:0x13cf, B:202:0x0f31, B:204:0x0f3c, B:205:0x0f44, B:207:0x0f4a, B:190:0x0eb2, B:191:0x0eec, B:193:0x0ef2, B:194:0x0f00, B:195:0x0f12, B:197:0x0f18, B:168:0x0e42, B:159:0x0b31, B:60:0x01a6, B:28:0x00c3, B:30:0x00cd, B:32:0x00d7, B:34:0x00e5, B:36:0x00f0, B:35:0x00ec), top: B:496:0x00ad }] */
    /* JADX WARN: Removed duplicated region for block: B:265:0x10ce A[Catch: JSONException -> 0x169e, TryCatch #0 {JSONException -> 0x169e, blocks: (B:23:0x00ad, B:25:0x00b1, B:27:0x00bc, B:29:0x00c7, B:38:0x00fc, B:40:0x0104, B:42:0x0108, B:43:0x0116, B:45:0x011e, B:46:0x012a, B:48:0x0130, B:50:0x0146, B:51:0x0158, B:53:0x015c, B:55:0x0164, B:56:0x0176, B:58:0x0195, B:63:0x01b2, B:65:0x01c5, B:66:0x01ca, B:68:0x01d2, B:69:0x01d6, B:71:0x01dc, B:72:0x01ea, B:74:0x01fb, B:76:0x020b, B:80:0x024d, B:82:0x0251, B:93:0x026e, B:95:0x0273, B:97:0x0277, B:99:0x0282, B:100:0x028f, B:106:0x02a0, B:109:0x02a8, B:110:0x02bc, B:112:0x02c2, B:113:0x02d1, B:114:0x02e7, B:116:0x02ed, B:117:0x02fb, B:120:0x032c, B:124:0x037d, B:128:0x03c4, B:131:0x06b9, B:135:0x06ca, B:139:0x06f7, B:141:0x09f9, B:142:0x09fb, B:144:0x0a05, B:145:0x0a07, B:147:0x0a11, B:148:0x0a13, B:156:0x0acb, B:160:0x0b3b, B:164:0x0ca9, B:167:0x0d14, B:171:0x0e50, B:173:0x0e70, B:175:0x0e76, B:176:0x0e7f, B:178:0x0e86, B:179:0x0e8b, B:181:0x0e95, B:182:0x0e9e, B:184:0x0ea6, B:186:0x0eaa, B:188:0x0eae, B:198:0x0f26, B:200:0x0f2b, B:208:0x0f5e, B:210:0x0f63, B:212:0x0f7f, B:213:0x0f87, B:215:0x0f8d, B:216:0x0fa1, B:217:0x0faa, B:219:0x0fb9, B:221:0x0fc1, B:223:0x0fd0, B:224:0x0fdb, B:226:0x0fe3, B:227:0x0fee, B:229:0x0ff6, B:230:0x1001, B:232:0x1009, B:233:0x1014, B:235:0x101c, B:236:0x1027, B:238:0x102f, B:239:0x103a, B:241:0x1042, B:242:0x104d, B:244:0x1055, B:245:0x1060, B:247:0x1066, B:248:0x106d, B:250:0x1075, B:251:0x1080, B:253:0x1086, B:254:0x108d, B:256:0x1095, B:257:0x10a0, B:259:0x10a8, B:260:0x10b3, B:262:0x10bb, B:263:0x10c6, B:265:0x10ce, B:266:0x10d9, B:268:0x10e1, B:269:0x10ec, B:271:0x10f2, B:272:0x10f9, B:274:0x1101, B:275:0x110c, B:277:0x1114, B:278:0x111f, B:280:0x1127, B:281:0x1132, B:283:0x1138, B:284:0x113f, B:286:0x1149, B:288:0x114f, B:290:0x115c, B:291:0x1167, B:293:0x116f, B:294:0x117a, B:296:0x1182, B:297:0x118d, B:299:0x1195, B:300:0x11a0, B:302:0x11a8, B:303:0x11b3, B:305:0x11bb, B:306:0x11c6, B:308:0x11ce, B:309:0x11d9, B:311:0x11e1, B:312:0x11ec, B:314:0x11f4, B:315:0x11ff, B:317:0x1207, B:318:0x1212, B:320:0x121a, B:321:0x1225, B:323:0x122d, B:324:0x1238, B:326:0x1240, B:327:0x124b, B:329:0x1253, B:330:0x125e, B:332:0x1266, B:333:0x1271, B:335:0x1279, B:336:0x1284, B:338:0x128c, B:339:0x1297, B:341:0x129f, B:342:0x12aa, B:344:0x12b2, B:345:0x12bd, B:347:0x12c5, B:348:0x12d0, B:350:0x12d8, B:351:0x12e3, B:353:0x12eb, B:354:0x12f6, B:356:0x12fe, B:357:0x1309, B:359:0x1311, B:360:0x131c, B:362:0x1324, B:363:0x132f, B:365:0x1337, B:366:0x1342, B:368:0x134a, B:369:0x1355, B:371:0x135d, B:372:0x1368, B:374:0x1370, B:375:0x137b, B:377:0x137f, B:379:0x1383, B:381:0x138d, B:382:0x1392, B:384:0x1399, B:385:0x139c, B:387:0x13b3, B:388:0x13bb, B:394:0x13d9, B:399:0x13f4, B:401:0x13fb, B:402:0x1400, B:404:0x1404, B:405:0x143f, B:407:0x1445, B:408:0x144a, B:410:0x144f, B:411:0x1454, B:413:0x1458, B:414:0x1463, B:416:0x1467, B:417:0x147c, B:419:0x1495, B:420:0x149e, B:422:0x14a2, B:423:0x14b5, B:425:0x14b9, B:426:0x14d5, B:428:0x14d9, B:429:0x14de, B:431:0x14e2, B:432:0x14e7, B:434:0x14eb, B:435:0x14f1, B:437:0x14f5, B:438:0x1505, B:440:0x1518, B:441:0x151f, B:443:0x1529, B:446:0x153a, B:448:0x153f, B:449:0x155e, B:451:0x1566, B:452:0x158a, B:454:0x1591, B:455:0x1598, B:457:0x159d, B:459:0x15a8, B:465:0x15c2, B:467:0x15ca, B:469:0x15d4, B:470:0x15d6, B:481:0x1678, B:471:0x15d9, B:473:0x1643, B:475:0x1647, B:477:0x164f, B:478:0x1664, B:480:0x166a, B:482:0x167f, B:483:0x1684, B:485:0x1688, B:487:0x168c, B:488:0x168f, B:490:0x1695, B:491:0x169a, B:445:0x1533, B:462:0x15af, B:463:0x15b6, B:391:0x13cf, B:202:0x0f31, B:204:0x0f3c, B:205:0x0f44, B:207:0x0f4a, B:190:0x0eb2, B:191:0x0eec, B:193:0x0ef2, B:194:0x0f00, B:195:0x0f12, B:197:0x0f18, B:168:0x0e42, B:159:0x0b31, B:60:0x01a6, B:28:0x00c3, B:30:0x00cd, B:32:0x00d7, B:34:0x00e5, B:36:0x00f0, B:35:0x00ec), top: B:496:0x00ad }] */
    /* JADX WARN: Removed duplicated region for block: B:268:0x10e1 A[Catch: JSONException -> 0x169e, TryCatch #0 {JSONException -> 0x169e, blocks: (B:23:0x00ad, B:25:0x00b1, B:27:0x00bc, B:29:0x00c7, B:38:0x00fc, B:40:0x0104, B:42:0x0108, B:43:0x0116, B:45:0x011e, B:46:0x012a, B:48:0x0130, B:50:0x0146, B:51:0x0158, B:53:0x015c, B:55:0x0164, B:56:0x0176, B:58:0x0195, B:63:0x01b2, B:65:0x01c5, B:66:0x01ca, B:68:0x01d2, B:69:0x01d6, B:71:0x01dc, B:72:0x01ea, B:74:0x01fb, B:76:0x020b, B:80:0x024d, B:82:0x0251, B:93:0x026e, B:95:0x0273, B:97:0x0277, B:99:0x0282, B:100:0x028f, B:106:0x02a0, B:109:0x02a8, B:110:0x02bc, B:112:0x02c2, B:113:0x02d1, B:114:0x02e7, B:116:0x02ed, B:117:0x02fb, B:120:0x032c, B:124:0x037d, B:128:0x03c4, B:131:0x06b9, B:135:0x06ca, B:139:0x06f7, B:141:0x09f9, B:142:0x09fb, B:144:0x0a05, B:145:0x0a07, B:147:0x0a11, B:148:0x0a13, B:156:0x0acb, B:160:0x0b3b, B:164:0x0ca9, B:167:0x0d14, B:171:0x0e50, B:173:0x0e70, B:175:0x0e76, B:176:0x0e7f, B:178:0x0e86, B:179:0x0e8b, B:181:0x0e95, B:182:0x0e9e, B:184:0x0ea6, B:186:0x0eaa, B:188:0x0eae, B:198:0x0f26, B:200:0x0f2b, B:208:0x0f5e, B:210:0x0f63, B:212:0x0f7f, B:213:0x0f87, B:215:0x0f8d, B:216:0x0fa1, B:217:0x0faa, B:219:0x0fb9, B:221:0x0fc1, B:223:0x0fd0, B:224:0x0fdb, B:226:0x0fe3, B:227:0x0fee, B:229:0x0ff6, B:230:0x1001, B:232:0x1009, B:233:0x1014, B:235:0x101c, B:236:0x1027, B:238:0x102f, B:239:0x103a, B:241:0x1042, B:242:0x104d, B:244:0x1055, B:245:0x1060, B:247:0x1066, B:248:0x106d, B:250:0x1075, B:251:0x1080, B:253:0x1086, B:254:0x108d, B:256:0x1095, B:257:0x10a0, B:259:0x10a8, B:260:0x10b3, B:262:0x10bb, B:263:0x10c6, B:265:0x10ce, B:266:0x10d9, B:268:0x10e1, B:269:0x10ec, B:271:0x10f2, B:272:0x10f9, B:274:0x1101, B:275:0x110c, B:277:0x1114, B:278:0x111f, B:280:0x1127, B:281:0x1132, B:283:0x1138, B:284:0x113f, B:286:0x1149, B:288:0x114f, B:290:0x115c, B:291:0x1167, B:293:0x116f, B:294:0x117a, B:296:0x1182, B:297:0x118d, B:299:0x1195, B:300:0x11a0, B:302:0x11a8, B:303:0x11b3, B:305:0x11bb, B:306:0x11c6, B:308:0x11ce, B:309:0x11d9, B:311:0x11e1, B:312:0x11ec, B:314:0x11f4, B:315:0x11ff, B:317:0x1207, B:318:0x1212, B:320:0x121a, B:321:0x1225, B:323:0x122d, B:324:0x1238, B:326:0x1240, B:327:0x124b, B:329:0x1253, B:330:0x125e, B:332:0x1266, B:333:0x1271, B:335:0x1279, B:336:0x1284, B:338:0x128c, B:339:0x1297, B:341:0x129f, B:342:0x12aa, B:344:0x12b2, B:345:0x12bd, B:347:0x12c5, B:348:0x12d0, B:350:0x12d8, B:351:0x12e3, B:353:0x12eb, B:354:0x12f6, B:356:0x12fe, B:357:0x1309, B:359:0x1311, B:360:0x131c, B:362:0x1324, B:363:0x132f, B:365:0x1337, B:366:0x1342, B:368:0x134a, B:369:0x1355, B:371:0x135d, B:372:0x1368, B:374:0x1370, B:375:0x137b, B:377:0x137f, B:379:0x1383, B:381:0x138d, B:382:0x1392, B:384:0x1399, B:385:0x139c, B:387:0x13b3, B:388:0x13bb, B:394:0x13d9, B:399:0x13f4, B:401:0x13fb, B:402:0x1400, B:404:0x1404, B:405:0x143f, B:407:0x1445, B:408:0x144a, B:410:0x144f, B:411:0x1454, B:413:0x1458, B:414:0x1463, B:416:0x1467, B:417:0x147c, B:419:0x1495, B:420:0x149e, B:422:0x14a2, B:423:0x14b5, B:425:0x14b9, B:426:0x14d5, B:428:0x14d9, B:429:0x14de, B:431:0x14e2, B:432:0x14e7, B:434:0x14eb, B:435:0x14f1, B:437:0x14f5, B:438:0x1505, B:440:0x1518, B:441:0x151f, B:443:0x1529, B:446:0x153a, B:448:0x153f, B:449:0x155e, B:451:0x1566, B:452:0x158a, B:454:0x1591, B:455:0x1598, B:457:0x159d, B:459:0x15a8, B:465:0x15c2, B:467:0x15ca, B:469:0x15d4, B:470:0x15d6, B:481:0x1678, B:471:0x15d9, B:473:0x1643, B:475:0x1647, B:477:0x164f, B:478:0x1664, B:480:0x166a, B:482:0x167f, B:483:0x1684, B:485:0x1688, B:487:0x168c, B:488:0x168f, B:490:0x1695, B:491:0x169a, B:445:0x1533, B:462:0x15af, B:463:0x15b6, B:391:0x13cf, B:202:0x0f31, B:204:0x0f3c, B:205:0x0f44, B:207:0x0f4a, B:190:0x0eb2, B:191:0x0eec, B:193:0x0ef2, B:194:0x0f00, B:195:0x0f12, B:197:0x0f18, B:168:0x0e42, B:159:0x0b31, B:60:0x01a6, B:28:0x00c3, B:30:0x00cd, B:32:0x00d7, B:34:0x00e5, B:36:0x00f0, B:35:0x00ec), top: B:496:0x00ad }] */
    /* JADX WARN: Removed duplicated region for block: B:271:0x10f2 A[Catch: JSONException -> 0x169e, TryCatch #0 {JSONException -> 0x169e, blocks: (B:23:0x00ad, B:25:0x00b1, B:27:0x00bc, B:29:0x00c7, B:38:0x00fc, B:40:0x0104, B:42:0x0108, B:43:0x0116, B:45:0x011e, B:46:0x012a, B:48:0x0130, B:50:0x0146, B:51:0x0158, B:53:0x015c, B:55:0x0164, B:56:0x0176, B:58:0x0195, B:63:0x01b2, B:65:0x01c5, B:66:0x01ca, B:68:0x01d2, B:69:0x01d6, B:71:0x01dc, B:72:0x01ea, B:74:0x01fb, B:76:0x020b, B:80:0x024d, B:82:0x0251, B:93:0x026e, B:95:0x0273, B:97:0x0277, B:99:0x0282, B:100:0x028f, B:106:0x02a0, B:109:0x02a8, B:110:0x02bc, B:112:0x02c2, B:113:0x02d1, B:114:0x02e7, B:116:0x02ed, B:117:0x02fb, B:120:0x032c, B:124:0x037d, B:128:0x03c4, B:131:0x06b9, B:135:0x06ca, B:139:0x06f7, B:141:0x09f9, B:142:0x09fb, B:144:0x0a05, B:145:0x0a07, B:147:0x0a11, B:148:0x0a13, B:156:0x0acb, B:160:0x0b3b, B:164:0x0ca9, B:167:0x0d14, B:171:0x0e50, B:173:0x0e70, B:175:0x0e76, B:176:0x0e7f, B:178:0x0e86, B:179:0x0e8b, B:181:0x0e95, B:182:0x0e9e, B:184:0x0ea6, B:186:0x0eaa, B:188:0x0eae, B:198:0x0f26, B:200:0x0f2b, B:208:0x0f5e, B:210:0x0f63, B:212:0x0f7f, B:213:0x0f87, B:215:0x0f8d, B:216:0x0fa1, B:217:0x0faa, B:219:0x0fb9, B:221:0x0fc1, B:223:0x0fd0, B:224:0x0fdb, B:226:0x0fe3, B:227:0x0fee, B:229:0x0ff6, B:230:0x1001, B:232:0x1009, B:233:0x1014, B:235:0x101c, B:236:0x1027, B:238:0x102f, B:239:0x103a, B:241:0x1042, B:242:0x104d, B:244:0x1055, B:245:0x1060, B:247:0x1066, B:248:0x106d, B:250:0x1075, B:251:0x1080, B:253:0x1086, B:254:0x108d, B:256:0x1095, B:257:0x10a0, B:259:0x10a8, B:260:0x10b3, B:262:0x10bb, B:263:0x10c6, B:265:0x10ce, B:266:0x10d9, B:268:0x10e1, B:269:0x10ec, B:271:0x10f2, B:272:0x10f9, B:274:0x1101, B:275:0x110c, B:277:0x1114, B:278:0x111f, B:280:0x1127, B:281:0x1132, B:283:0x1138, B:284:0x113f, B:286:0x1149, B:288:0x114f, B:290:0x115c, B:291:0x1167, B:293:0x116f, B:294:0x117a, B:296:0x1182, B:297:0x118d, B:299:0x1195, B:300:0x11a0, B:302:0x11a8, B:303:0x11b3, B:305:0x11bb, B:306:0x11c6, B:308:0x11ce, B:309:0x11d9, B:311:0x11e1, B:312:0x11ec, B:314:0x11f4, B:315:0x11ff, B:317:0x1207, B:318:0x1212, B:320:0x121a, B:321:0x1225, B:323:0x122d, B:324:0x1238, B:326:0x1240, B:327:0x124b, B:329:0x1253, B:330:0x125e, B:332:0x1266, B:333:0x1271, B:335:0x1279, B:336:0x1284, B:338:0x128c, B:339:0x1297, B:341:0x129f, B:342:0x12aa, B:344:0x12b2, B:345:0x12bd, B:347:0x12c5, B:348:0x12d0, B:350:0x12d8, B:351:0x12e3, B:353:0x12eb, B:354:0x12f6, B:356:0x12fe, B:357:0x1309, B:359:0x1311, B:360:0x131c, B:362:0x1324, B:363:0x132f, B:365:0x1337, B:366:0x1342, B:368:0x134a, B:369:0x1355, B:371:0x135d, B:372:0x1368, B:374:0x1370, B:375:0x137b, B:377:0x137f, B:379:0x1383, B:381:0x138d, B:382:0x1392, B:384:0x1399, B:385:0x139c, B:387:0x13b3, B:388:0x13bb, B:394:0x13d9, B:399:0x13f4, B:401:0x13fb, B:402:0x1400, B:404:0x1404, B:405:0x143f, B:407:0x1445, B:408:0x144a, B:410:0x144f, B:411:0x1454, B:413:0x1458, B:414:0x1463, B:416:0x1467, B:417:0x147c, B:419:0x1495, B:420:0x149e, B:422:0x14a2, B:423:0x14b5, B:425:0x14b9, B:426:0x14d5, B:428:0x14d9, B:429:0x14de, B:431:0x14e2, B:432:0x14e7, B:434:0x14eb, B:435:0x14f1, B:437:0x14f5, B:438:0x1505, B:440:0x1518, B:441:0x151f, B:443:0x1529, B:446:0x153a, B:448:0x153f, B:449:0x155e, B:451:0x1566, B:452:0x158a, B:454:0x1591, B:455:0x1598, B:457:0x159d, B:459:0x15a8, B:465:0x15c2, B:467:0x15ca, B:469:0x15d4, B:470:0x15d6, B:481:0x1678, B:471:0x15d9, B:473:0x1643, B:475:0x1647, B:477:0x164f, B:478:0x1664, B:480:0x166a, B:482:0x167f, B:483:0x1684, B:485:0x1688, B:487:0x168c, B:488:0x168f, B:490:0x1695, B:491:0x169a, B:445:0x1533, B:462:0x15af, B:463:0x15b6, B:391:0x13cf, B:202:0x0f31, B:204:0x0f3c, B:205:0x0f44, B:207:0x0f4a, B:190:0x0eb2, B:191:0x0eec, B:193:0x0ef2, B:194:0x0f00, B:195:0x0f12, B:197:0x0f18, B:168:0x0e42, B:159:0x0b31, B:60:0x01a6, B:28:0x00c3, B:30:0x00cd, B:32:0x00d7, B:34:0x00e5, B:36:0x00f0, B:35:0x00ec), top: B:496:0x00ad }] */
    /* JADX WARN: Removed duplicated region for block: B:274:0x1101 A[Catch: JSONException -> 0x169e, TryCatch #0 {JSONException -> 0x169e, blocks: (B:23:0x00ad, B:25:0x00b1, B:27:0x00bc, B:29:0x00c7, B:38:0x00fc, B:40:0x0104, B:42:0x0108, B:43:0x0116, B:45:0x011e, B:46:0x012a, B:48:0x0130, B:50:0x0146, B:51:0x0158, B:53:0x015c, B:55:0x0164, B:56:0x0176, B:58:0x0195, B:63:0x01b2, B:65:0x01c5, B:66:0x01ca, B:68:0x01d2, B:69:0x01d6, B:71:0x01dc, B:72:0x01ea, B:74:0x01fb, B:76:0x020b, B:80:0x024d, B:82:0x0251, B:93:0x026e, B:95:0x0273, B:97:0x0277, B:99:0x0282, B:100:0x028f, B:106:0x02a0, B:109:0x02a8, B:110:0x02bc, B:112:0x02c2, B:113:0x02d1, B:114:0x02e7, B:116:0x02ed, B:117:0x02fb, B:120:0x032c, B:124:0x037d, B:128:0x03c4, B:131:0x06b9, B:135:0x06ca, B:139:0x06f7, B:141:0x09f9, B:142:0x09fb, B:144:0x0a05, B:145:0x0a07, B:147:0x0a11, B:148:0x0a13, B:156:0x0acb, B:160:0x0b3b, B:164:0x0ca9, B:167:0x0d14, B:171:0x0e50, B:173:0x0e70, B:175:0x0e76, B:176:0x0e7f, B:178:0x0e86, B:179:0x0e8b, B:181:0x0e95, B:182:0x0e9e, B:184:0x0ea6, B:186:0x0eaa, B:188:0x0eae, B:198:0x0f26, B:200:0x0f2b, B:208:0x0f5e, B:210:0x0f63, B:212:0x0f7f, B:213:0x0f87, B:215:0x0f8d, B:216:0x0fa1, B:217:0x0faa, B:219:0x0fb9, B:221:0x0fc1, B:223:0x0fd0, B:224:0x0fdb, B:226:0x0fe3, B:227:0x0fee, B:229:0x0ff6, B:230:0x1001, B:232:0x1009, B:233:0x1014, B:235:0x101c, B:236:0x1027, B:238:0x102f, B:239:0x103a, B:241:0x1042, B:242:0x104d, B:244:0x1055, B:245:0x1060, B:247:0x1066, B:248:0x106d, B:250:0x1075, B:251:0x1080, B:253:0x1086, B:254:0x108d, B:256:0x1095, B:257:0x10a0, B:259:0x10a8, B:260:0x10b3, B:262:0x10bb, B:263:0x10c6, B:265:0x10ce, B:266:0x10d9, B:268:0x10e1, B:269:0x10ec, B:271:0x10f2, B:272:0x10f9, B:274:0x1101, B:275:0x110c, B:277:0x1114, B:278:0x111f, B:280:0x1127, B:281:0x1132, B:283:0x1138, B:284:0x113f, B:286:0x1149, B:288:0x114f, B:290:0x115c, B:291:0x1167, B:293:0x116f, B:294:0x117a, B:296:0x1182, B:297:0x118d, B:299:0x1195, B:300:0x11a0, B:302:0x11a8, B:303:0x11b3, B:305:0x11bb, B:306:0x11c6, B:308:0x11ce, B:309:0x11d9, B:311:0x11e1, B:312:0x11ec, B:314:0x11f4, B:315:0x11ff, B:317:0x1207, B:318:0x1212, B:320:0x121a, B:321:0x1225, B:323:0x122d, B:324:0x1238, B:326:0x1240, B:327:0x124b, B:329:0x1253, B:330:0x125e, B:332:0x1266, B:333:0x1271, B:335:0x1279, B:336:0x1284, B:338:0x128c, B:339:0x1297, B:341:0x129f, B:342:0x12aa, B:344:0x12b2, B:345:0x12bd, B:347:0x12c5, B:348:0x12d0, B:350:0x12d8, B:351:0x12e3, B:353:0x12eb, B:354:0x12f6, B:356:0x12fe, B:357:0x1309, B:359:0x1311, B:360:0x131c, B:362:0x1324, B:363:0x132f, B:365:0x1337, B:366:0x1342, B:368:0x134a, B:369:0x1355, B:371:0x135d, B:372:0x1368, B:374:0x1370, B:375:0x137b, B:377:0x137f, B:379:0x1383, B:381:0x138d, B:382:0x1392, B:384:0x1399, B:385:0x139c, B:387:0x13b3, B:388:0x13bb, B:394:0x13d9, B:399:0x13f4, B:401:0x13fb, B:402:0x1400, B:404:0x1404, B:405:0x143f, B:407:0x1445, B:408:0x144a, B:410:0x144f, B:411:0x1454, B:413:0x1458, B:414:0x1463, B:416:0x1467, B:417:0x147c, B:419:0x1495, B:420:0x149e, B:422:0x14a2, B:423:0x14b5, B:425:0x14b9, B:426:0x14d5, B:428:0x14d9, B:429:0x14de, B:431:0x14e2, B:432:0x14e7, B:434:0x14eb, B:435:0x14f1, B:437:0x14f5, B:438:0x1505, B:440:0x1518, B:441:0x151f, B:443:0x1529, B:446:0x153a, B:448:0x153f, B:449:0x155e, B:451:0x1566, B:452:0x158a, B:454:0x1591, B:455:0x1598, B:457:0x159d, B:459:0x15a8, B:465:0x15c2, B:467:0x15ca, B:469:0x15d4, B:470:0x15d6, B:481:0x1678, B:471:0x15d9, B:473:0x1643, B:475:0x1647, B:477:0x164f, B:478:0x1664, B:480:0x166a, B:482:0x167f, B:483:0x1684, B:485:0x1688, B:487:0x168c, B:488:0x168f, B:490:0x1695, B:491:0x169a, B:445:0x1533, B:462:0x15af, B:463:0x15b6, B:391:0x13cf, B:202:0x0f31, B:204:0x0f3c, B:205:0x0f44, B:207:0x0f4a, B:190:0x0eb2, B:191:0x0eec, B:193:0x0ef2, B:194:0x0f00, B:195:0x0f12, B:197:0x0f18, B:168:0x0e42, B:159:0x0b31, B:60:0x01a6, B:28:0x00c3, B:30:0x00cd, B:32:0x00d7, B:34:0x00e5, B:36:0x00f0, B:35:0x00ec), top: B:496:0x00ad }] */
    /* JADX WARN: Removed duplicated region for block: B:277:0x1114 A[Catch: JSONException -> 0x169e, TryCatch #0 {JSONException -> 0x169e, blocks: (B:23:0x00ad, B:25:0x00b1, B:27:0x00bc, B:29:0x00c7, B:38:0x00fc, B:40:0x0104, B:42:0x0108, B:43:0x0116, B:45:0x011e, B:46:0x012a, B:48:0x0130, B:50:0x0146, B:51:0x0158, B:53:0x015c, B:55:0x0164, B:56:0x0176, B:58:0x0195, B:63:0x01b2, B:65:0x01c5, B:66:0x01ca, B:68:0x01d2, B:69:0x01d6, B:71:0x01dc, B:72:0x01ea, B:74:0x01fb, B:76:0x020b, B:80:0x024d, B:82:0x0251, B:93:0x026e, B:95:0x0273, B:97:0x0277, B:99:0x0282, B:100:0x028f, B:106:0x02a0, B:109:0x02a8, B:110:0x02bc, B:112:0x02c2, B:113:0x02d1, B:114:0x02e7, B:116:0x02ed, B:117:0x02fb, B:120:0x032c, B:124:0x037d, B:128:0x03c4, B:131:0x06b9, B:135:0x06ca, B:139:0x06f7, B:141:0x09f9, B:142:0x09fb, B:144:0x0a05, B:145:0x0a07, B:147:0x0a11, B:148:0x0a13, B:156:0x0acb, B:160:0x0b3b, B:164:0x0ca9, B:167:0x0d14, B:171:0x0e50, B:173:0x0e70, B:175:0x0e76, B:176:0x0e7f, B:178:0x0e86, B:179:0x0e8b, B:181:0x0e95, B:182:0x0e9e, B:184:0x0ea6, B:186:0x0eaa, B:188:0x0eae, B:198:0x0f26, B:200:0x0f2b, B:208:0x0f5e, B:210:0x0f63, B:212:0x0f7f, B:213:0x0f87, B:215:0x0f8d, B:216:0x0fa1, B:217:0x0faa, B:219:0x0fb9, B:221:0x0fc1, B:223:0x0fd0, B:224:0x0fdb, B:226:0x0fe3, B:227:0x0fee, B:229:0x0ff6, B:230:0x1001, B:232:0x1009, B:233:0x1014, B:235:0x101c, B:236:0x1027, B:238:0x102f, B:239:0x103a, B:241:0x1042, B:242:0x104d, B:244:0x1055, B:245:0x1060, B:247:0x1066, B:248:0x106d, B:250:0x1075, B:251:0x1080, B:253:0x1086, B:254:0x108d, B:256:0x1095, B:257:0x10a0, B:259:0x10a8, B:260:0x10b3, B:262:0x10bb, B:263:0x10c6, B:265:0x10ce, B:266:0x10d9, B:268:0x10e1, B:269:0x10ec, B:271:0x10f2, B:272:0x10f9, B:274:0x1101, B:275:0x110c, B:277:0x1114, B:278:0x111f, B:280:0x1127, B:281:0x1132, B:283:0x1138, B:284:0x113f, B:286:0x1149, B:288:0x114f, B:290:0x115c, B:291:0x1167, B:293:0x116f, B:294:0x117a, B:296:0x1182, B:297:0x118d, B:299:0x1195, B:300:0x11a0, B:302:0x11a8, B:303:0x11b3, B:305:0x11bb, B:306:0x11c6, B:308:0x11ce, B:309:0x11d9, B:311:0x11e1, B:312:0x11ec, B:314:0x11f4, B:315:0x11ff, B:317:0x1207, B:318:0x1212, B:320:0x121a, B:321:0x1225, B:323:0x122d, B:324:0x1238, B:326:0x1240, B:327:0x124b, B:329:0x1253, B:330:0x125e, B:332:0x1266, B:333:0x1271, B:335:0x1279, B:336:0x1284, B:338:0x128c, B:339:0x1297, B:341:0x129f, B:342:0x12aa, B:344:0x12b2, B:345:0x12bd, B:347:0x12c5, B:348:0x12d0, B:350:0x12d8, B:351:0x12e3, B:353:0x12eb, B:354:0x12f6, B:356:0x12fe, B:357:0x1309, B:359:0x1311, B:360:0x131c, B:362:0x1324, B:363:0x132f, B:365:0x1337, B:366:0x1342, B:368:0x134a, B:369:0x1355, B:371:0x135d, B:372:0x1368, B:374:0x1370, B:375:0x137b, B:377:0x137f, B:379:0x1383, B:381:0x138d, B:382:0x1392, B:384:0x1399, B:385:0x139c, B:387:0x13b3, B:388:0x13bb, B:394:0x13d9, B:399:0x13f4, B:401:0x13fb, B:402:0x1400, B:404:0x1404, B:405:0x143f, B:407:0x1445, B:408:0x144a, B:410:0x144f, B:411:0x1454, B:413:0x1458, B:414:0x1463, B:416:0x1467, B:417:0x147c, B:419:0x1495, B:420:0x149e, B:422:0x14a2, B:423:0x14b5, B:425:0x14b9, B:426:0x14d5, B:428:0x14d9, B:429:0x14de, B:431:0x14e2, B:432:0x14e7, B:434:0x14eb, B:435:0x14f1, B:437:0x14f5, B:438:0x1505, B:440:0x1518, B:441:0x151f, B:443:0x1529, B:446:0x153a, B:448:0x153f, B:449:0x155e, B:451:0x1566, B:452:0x158a, B:454:0x1591, B:455:0x1598, B:457:0x159d, B:459:0x15a8, B:465:0x15c2, B:467:0x15ca, B:469:0x15d4, B:470:0x15d6, B:481:0x1678, B:471:0x15d9, B:473:0x1643, B:475:0x1647, B:477:0x164f, B:478:0x1664, B:480:0x166a, B:482:0x167f, B:483:0x1684, B:485:0x1688, B:487:0x168c, B:488:0x168f, B:490:0x1695, B:491:0x169a, B:445:0x1533, B:462:0x15af, B:463:0x15b6, B:391:0x13cf, B:202:0x0f31, B:204:0x0f3c, B:205:0x0f44, B:207:0x0f4a, B:190:0x0eb2, B:191:0x0eec, B:193:0x0ef2, B:194:0x0f00, B:195:0x0f12, B:197:0x0f18, B:168:0x0e42, B:159:0x0b31, B:60:0x01a6, B:28:0x00c3, B:30:0x00cd, B:32:0x00d7, B:34:0x00e5, B:36:0x00f0, B:35:0x00ec), top: B:496:0x00ad }] */
    /* JADX WARN: Removed duplicated region for block: B:280:0x1127 A[Catch: JSONException -> 0x169e, TryCatch #0 {JSONException -> 0x169e, blocks: (B:23:0x00ad, B:25:0x00b1, B:27:0x00bc, B:29:0x00c7, B:38:0x00fc, B:40:0x0104, B:42:0x0108, B:43:0x0116, B:45:0x011e, B:46:0x012a, B:48:0x0130, B:50:0x0146, B:51:0x0158, B:53:0x015c, B:55:0x0164, B:56:0x0176, B:58:0x0195, B:63:0x01b2, B:65:0x01c5, B:66:0x01ca, B:68:0x01d2, B:69:0x01d6, B:71:0x01dc, B:72:0x01ea, B:74:0x01fb, B:76:0x020b, B:80:0x024d, B:82:0x0251, B:93:0x026e, B:95:0x0273, B:97:0x0277, B:99:0x0282, B:100:0x028f, B:106:0x02a0, B:109:0x02a8, B:110:0x02bc, B:112:0x02c2, B:113:0x02d1, B:114:0x02e7, B:116:0x02ed, B:117:0x02fb, B:120:0x032c, B:124:0x037d, B:128:0x03c4, B:131:0x06b9, B:135:0x06ca, B:139:0x06f7, B:141:0x09f9, B:142:0x09fb, B:144:0x0a05, B:145:0x0a07, B:147:0x0a11, B:148:0x0a13, B:156:0x0acb, B:160:0x0b3b, B:164:0x0ca9, B:167:0x0d14, B:171:0x0e50, B:173:0x0e70, B:175:0x0e76, B:176:0x0e7f, B:178:0x0e86, B:179:0x0e8b, B:181:0x0e95, B:182:0x0e9e, B:184:0x0ea6, B:186:0x0eaa, B:188:0x0eae, B:198:0x0f26, B:200:0x0f2b, B:208:0x0f5e, B:210:0x0f63, B:212:0x0f7f, B:213:0x0f87, B:215:0x0f8d, B:216:0x0fa1, B:217:0x0faa, B:219:0x0fb9, B:221:0x0fc1, B:223:0x0fd0, B:224:0x0fdb, B:226:0x0fe3, B:227:0x0fee, B:229:0x0ff6, B:230:0x1001, B:232:0x1009, B:233:0x1014, B:235:0x101c, B:236:0x1027, B:238:0x102f, B:239:0x103a, B:241:0x1042, B:242:0x104d, B:244:0x1055, B:245:0x1060, B:247:0x1066, B:248:0x106d, B:250:0x1075, B:251:0x1080, B:253:0x1086, B:254:0x108d, B:256:0x1095, B:257:0x10a0, B:259:0x10a8, B:260:0x10b3, B:262:0x10bb, B:263:0x10c6, B:265:0x10ce, B:266:0x10d9, B:268:0x10e1, B:269:0x10ec, B:271:0x10f2, B:272:0x10f9, B:274:0x1101, B:275:0x110c, B:277:0x1114, B:278:0x111f, B:280:0x1127, B:281:0x1132, B:283:0x1138, B:284:0x113f, B:286:0x1149, B:288:0x114f, B:290:0x115c, B:291:0x1167, B:293:0x116f, B:294:0x117a, B:296:0x1182, B:297:0x118d, B:299:0x1195, B:300:0x11a0, B:302:0x11a8, B:303:0x11b3, B:305:0x11bb, B:306:0x11c6, B:308:0x11ce, B:309:0x11d9, B:311:0x11e1, B:312:0x11ec, B:314:0x11f4, B:315:0x11ff, B:317:0x1207, B:318:0x1212, B:320:0x121a, B:321:0x1225, B:323:0x122d, B:324:0x1238, B:326:0x1240, B:327:0x124b, B:329:0x1253, B:330:0x125e, B:332:0x1266, B:333:0x1271, B:335:0x1279, B:336:0x1284, B:338:0x128c, B:339:0x1297, B:341:0x129f, B:342:0x12aa, B:344:0x12b2, B:345:0x12bd, B:347:0x12c5, B:348:0x12d0, B:350:0x12d8, B:351:0x12e3, B:353:0x12eb, B:354:0x12f6, B:356:0x12fe, B:357:0x1309, B:359:0x1311, B:360:0x131c, B:362:0x1324, B:363:0x132f, B:365:0x1337, B:366:0x1342, B:368:0x134a, B:369:0x1355, B:371:0x135d, B:372:0x1368, B:374:0x1370, B:375:0x137b, B:377:0x137f, B:379:0x1383, B:381:0x138d, B:382:0x1392, B:384:0x1399, B:385:0x139c, B:387:0x13b3, B:388:0x13bb, B:394:0x13d9, B:399:0x13f4, B:401:0x13fb, B:402:0x1400, B:404:0x1404, B:405:0x143f, B:407:0x1445, B:408:0x144a, B:410:0x144f, B:411:0x1454, B:413:0x1458, B:414:0x1463, B:416:0x1467, B:417:0x147c, B:419:0x1495, B:420:0x149e, B:422:0x14a2, B:423:0x14b5, B:425:0x14b9, B:426:0x14d5, B:428:0x14d9, B:429:0x14de, B:431:0x14e2, B:432:0x14e7, B:434:0x14eb, B:435:0x14f1, B:437:0x14f5, B:438:0x1505, B:440:0x1518, B:441:0x151f, B:443:0x1529, B:446:0x153a, B:448:0x153f, B:449:0x155e, B:451:0x1566, B:452:0x158a, B:454:0x1591, B:455:0x1598, B:457:0x159d, B:459:0x15a8, B:465:0x15c2, B:467:0x15ca, B:469:0x15d4, B:470:0x15d6, B:481:0x1678, B:471:0x15d9, B:473:0x1643, B:475:0x1647, B:477:0x164f, B:478:0x1664, B:480:0x166a, B:482:0x167f, B:483:0x1684, B:485:0x1688, B:487:0x168c, B:488:0x168f, B:490:0x1695, B:491:0x169a, B:445:0x1533, B:462:0x15af, B:463:0x15b6, B:391:0x13cf, B:202:0x0f31, B:204:0x0f3c, B:205:0x0f44, B:207:0x0f4a, B:190:0x0eb2, B:191:0x0eec, B:193:0x0ef2, B:194:0x0f00, B:195:0x0f12, B:197:0x0f18, B:168:0x0e42, B:159:0x0b31, B:60:0x01a6, B:28:0x00c3, B:30:0x00cd, B:32:0x00d7, B:34:0x00e5, B:36:0x00f0, B:35:0x00ec), top: B:496:0x00ad }] */
    /* JADX WARN: Removed duplicated region for block: B:283:0x1138 A[Catch: JSONException -> 0x169e, TryCatch #0 {JSONException -> 0x169e, blocks: (B:23:0x00ad, B:25:0x00b1, B:27:0x00bc, B:29:0x00c7, B:38:0x00fc, B:40:0x0104, B:42:0x0108, B:43:0x0116, B:45:0x011e, B:46:0x012a, B:48:0x0130, B:50:0x0146, B:51:0x0158, B:53:0x015c, B:55:0x0164, B:56:0x0176, B:58:0x0195, B:63:0x01b2, B:65:0x01c5, B:66:0x01ca, B:68:0x01d2, B:69:0x01d6, B:71:0x01dc, B:72:0x01ea, B:74:0x01fb, B:76:0x020b, B:80:0x024d, B:82:0x0251, B:93:0x026e, B:95:0x0273, B:97:0x0277, B:99:0x0282, B:100:0x028f, B:106:0x02a0, B:109:0x02a8, B:110:0x02bc, B:112:0x02c2, B:113:0x02d1, B:114:0x02e7, B:116:0x02ed, B:117:0x02fb, B:120:0x032c, B:124:0x037d, B:128:0x03c4, B:131:0x06b9, B:135:0x06ca, B:139:0x06f7, B:141:0x09f9, B:142:0x09fb, B:144:0x0a05, B:145:0x0a07, B:147:0x0a11, B:148:0x0a13, B:156:0x0acb, B:160:0x0b3b, B:164:0x0ca9, B:167:0x0d14, B:171:0x0e50, B:173:0x0e70, B:175:0x0e76, B:176:0x0e7f, B:178:0x0e86, B:179:0x0e8b, B:181:0x0e95, B:182:0x0e9e, B:184:0x0ea6, B:186:0x0eaa, B:188:0x0eae, B:198:0x0f26, B:200:0x0f2b, B:208:0x0f5e, B:210:0x0f63, B:212:0x0f7f, B:213:0x0f87, B:215:0x0f8d, B:216:0x0fa1, B:217:0x0faa, B:219:0x0fb9, B:221:0x0fc1, B:223:0x0fd0, B:224:0x0fdb, B:226:0x0fe3, B:227:0x0fee, B:229:0x0ff6, B:230:0x1001, B:232:0x1009, B:233:0x1014, B:235:0x101c, B:236:0x1027, B:238:0x102f, B:239:0x103a, B:241:0x1042, B:242:0x104d, B:244:0x1055, B:245:0x1060, B:247:0x1066, B:248:0x106d, B:250:0x1075, B:251:0x1080, B:253:0x1086, B:254:0x108d, B:256:0x1095, B:257:0x10a0, B:259:0x10a8, B:260:0x10b3, B:262:0x10bb, B:263:0x10c6, B:265:0x10ce, B:266:0x10d9, B:268:0x10e1, B:269:0x10ec, B:271:0x10f2, B:272:0x10f9, B:274:0x1101, B:275:0x110c, B:277:0x1114, B:278:0x111f, B:280:0x1127, B:281:0x1132, B:283:0x1138, B:284:0x113f, B:286:0x1149, B:288:0x114f, B:290:0x115c, B:291:0x1167, B:293:0x116f, B:294:0x117a, B:296:0x1182, B:297:0x118d, B:299:0x1195, B:300:0x11a0, B:302:0x11a8, B:303:0x11b3, B:305:0x11bb, B:306:0x11c6, B:308:0x11ce, B:309:0x11d9, B:311:0x11e1, B:312:0x11ec, B:314:0x11f4, B:315:0x11ff, B:317:0x1207, B:318:0x1212, B:320:0x121a, B:321:0x1225, B:323:0x122d, B:324:0x1238, B:326:0x1240, B:327:0x124b, B:329:0x1253, B:330:0x125e, B:332:0x1266, B:333:0x1271, B:335:0x1279, B:336:0x1284, B:338:0x128c, B:339:0x1297, B:341:0x129f, B:342:0x12aa, B:344:0x12b2, B:345:0x12bd, B:347:0x12c5, B:348:0x12d0, B:350:0x12d8, B:351:0x12e3, B:353:0x12eb, B:354:0x12f6, B:356:0x12fe, B:357:0x1309, B:359:0x1311, B:360:0x131c, B:362:0x1324, B:363:0x132f, B:365:0x1337, B:366:0x1342, B:368:0x134a, B:369:0x1355, B:371:0x135d, B:372:0x1368, B:374:0x1370, B:375:0x137b, B:377:0x137f, B:379:0x1383, B:381:0x138d, B:382:0x1392, B:384:0x1399, B:385:0x139c, B:387:0x13b3, B:388:0x13bb, B:394:0x13d9, B:399:0x13f4, B:401:0x13fb, B:402:0x1400, B:404:0x1404, B:405:0x143f, B:407:0x1445, B:408:0x144a, B:410:0x144f, B:411:0x1454, B:413:0x1458, B:414:0x1463, B:416:0x1467, B:417:0x147c, B:419:0x1495, B:420:0x149e, B:422:0x14a2, B:423:0x14b5, B:425:0x14b9, B:426:0x14d5, B:428:0x14d9, B:429:0x14de, B:431:0x14e2, B:432:0x14e7, B:434:0x14eb, B:435:0x14f1, B:437:0x14f5, B:438:0x1505, B:440:0x1518, B:441:0x151f, B:443:0x1529, B:446:0x153a, B:448:0x153f, B:449:0x155e, B:451:0x1566, B:452:0x158a, B:454:0x1591, B:455:0x1598, B:457:0x159d, B:459:0x15a8, B:465:0x15c2, B:467:0x15ca, B:469:0x15d4, B:470:0x15d6, B:481:0x1678, B:471:0x15d9, B:473:0x1643, B:475:0x1647, B:477:0x164f, B:478:0x1664, B:480:0x166a, B:482:0x167f, B:483:0x1684, B:485:0x1688, B:487:0x168c, B:488:0x168f, B:490:0x1695, B:491:0x169a, B:445:0x1533, B:462:0x15af, B:463:0x15b6, B:391:0x13cf, B:202:0x0f31, B:204:0x0f3c, B:205:0x0f44, B:207:0x0f4a, B:190:0x0eb2, B:191:0x0eec, B:193:0x0ef2, B:194:0x0f00, B:195:0x0f12, B:197:0x0f18, B:168:0x0e42, B:159:0x0b31, B:60:0x01a6, B:28:0x00c3, B:30:0x00cd, B:32:0x00d7, B:34:0x00e5, B:36:0x00f0, B:35:0x00ec), top: B:496:0x00ad }] */
    /* JADX WARN: Removed duplicated region for block: B:290:0x115c A[Catch: JSONException -> 0x169e, TryCatch #0 {JSONException -> 0x169e, blocks: (B:23:0x00ad, B:25:0x00b1, B:27:0x00bc, B:29:0x00c7, B:38:0x00fc, B:40:0x0104, B:42:0x0108, B:43:0x0116, B:45:0x011e, B:46:0x012a, B:48:0x0130, B:50:0x0146, B:51:0x0158, B:53:0x015c, B:55:0x0164, B:56:0x0176, B:58:0x0195, B:63:0x01b2, B:65:0x01c5, B:66:0x01ca, B:68:0x01d2, B:69:0x01d6, B:71:0x01dc, B:72:0x01ea, B:74:0x01fb, B:76:0x020b, B:80:0x024d, B:82:0x0251, B:93:0x026e, B:95:0x0273, B:97:0x0277, B:99:0x0282, B:100:0x028f, B:106:0x02a0, B:109:0x02a8, B:110:0x02bc, B:112:0x02c2, B:113:0x02d1, B:114:0x02e7, B:116:0x02ed, B:117:0x02fb, B:120:0x032c, B:124:0x037d, B:128:0x03c4, B:131:0x06b9, B:135:0x06ca, B:139:0x06f7, B:141:0x09f9, B:142:0x09fb, B:144:0x0a05, B:145:0x0a07, B:147:0x0a11, B:148:0x0a13, B:156:0x0acb, B:160:0x0b3b, B:164:0x0ca9, B:167:0x0d14, B:171:0x0e50, B:173:0x0e70, B:175:0x0e76, B:176:0x0e7f, B:178:0x0e86, B:179:0x0e8b, B:181:0x0e95, B:182:0x0e9e, B:184:0x0ea6, B:186:0x0eaa, B:188:0x0eae, B:198:0x0f26, B:200:0x0f2b, B:208:0x0f5e, B:210:0x0f63, B:212:0x0f7f, B:213:0x0f87, B:215:0x0f8d, B:216:0x0fa1, B:217:0x0faa, B:219:0x0fb9, B:221:0x0fc1, B:223:0x0fd0, B:224:0x0fdb, B:226:0x0fe3, B:227:0x0fee, B:229:0x0ff6, B:230:0x1001, B:232:0x1009, B:233:0x1014, B:235:0x101c, B:236:0x1027, B:238:0x102f, B:239:0x103a, B:241:0x1042, B:242:0x104d, B:244:0x1055, B:245:0x1060, B:247:0x1066, B:248:0x106d, B:250:0x1075, B:251:0x1080, B:253:0x1086, B:254:0x108d, B:256:0x1095, B:257:0x10a0, B:259:0x10a8, B:260:0x10b3, B:262:0x10bb, B:263:0x10c6, B:265:0x10ce, B:266:0x10d9, B:268:0x10e1, B:269:0x10ec, B:271:0x10f2, B:272:0x10f9, B:274:0x1101, B:275:0x110c, B:277:0x1114, B:278:0x111f, B:280:0x1127, B:281:0x1132, B:283:0x1138, B:284:0x113f, B:286:0x1149, B:288:0x114f, B:290:0x115c, B:291:0x1167, B:293:0x116f, B:294:0x117a, B:296:0x1182, B:297:0x118d, B:299:0x1195, B:300:0x11a0, B:302:0x11a8, B:303:0x11b3, B:305:0x11bb, B:306:0x11c6, B:308:0x11ce, B:309:0x11d9, B:311:0x11e1, B:312:0x11ec, B:314:0x11f4, B:315:0x11ff, B:317:0x1207, B:318:0x1212, B:320:0x121a, B:321:0x1225, B:323:0x122d, B:324:0x1238, B:326:0x1240, B:327:0x124b, B:329:0x1253, B:330:0x125e, B:332:0x1266, B:333:0x1271, B:335:0x1279, B:336:0x1284, B:338:0x128c, B:339:0x1297, B:341:0x129f, B:342:0x12aa, B:344:0x12b2, B:345:0x12bd, B:347:0x12c5, B:348:0x12d0, B:350:0x12d8, B:351:0x12e3, B:353:0x12eb, B:354:0x12f6, B:356:0x12fe, B:357:0x1309, B:359:0x1311, B:360:0x131c, B:362:0x1324, B:363:0x132f, B:365:0x1337, B:366:0x1342, B:368:0x134a, B:369:0x1355, B:371:0x135d, B:372:0x1368, B:374:0x1370, B:375:0x137b, B:377:0x137f, B:379:0x1383, B:381:0x138d, B:382:0x1392, B:384:0x1399, B:385:0x139c, B:387:0x13b3, B:388:0x13bb, B:394:0x13d9, B:399:0x13f4, B:401:0x13fb, B:402:0x1400, B:404:0x1404, B:405:0x143f, B:407:0x1445, B:408:0x144a, B:410:0x144f, B:411:0x1454, B:413:0x1458, B:414:0x1463, B:416:0x1467, B:417:0x147c, B:419:0x1495, B:420:0x149e, B:422:0x14a2, B:423:0x14b5, B:425:0x14b9, B:426:0x14d5, B:428:0x14d9, B:429:0x14de, B:431:0x14e2, B:432:0x14e7, B:434:0x14eb, B:435:0x14f1, B:437:0x14f5, B:438:0x1505, B:440:0x1518, B:441:0x151f, B:443:0x1529, B:446:0x153a, B:448:0x153f, B:449:0x155e, B:451:0x1566, B:452:0x158a, B:454:0x1591, B:455:0x1598, B:457:0x159d, B:459:0x15a8, B:465:0x15c2, B:467:0x15ca, B:469:0x15d4, B:470:0x15d6, B:481:0x1678, B:471:0x15d9, B:473:0x1643, B:475:0x1647, B:477:0x164f, B:478:0x1664, B:480:0x166a, B:482:0x167f, B:483:0x1684, B:485:0x1688, B:487:0x168c, B:488:0x168f, B:490:0x1695, B:491:0x169a, B:445:0x1533, B:462:0x15af, B:463:0x15b6, B:391:0x13cf, B:202:0x0f31, B:204:0x0f3c, B:205:0x0f44, B:207:0x0f4a, B:190:0x0eb2, B:191:0x0eec, B:193:0x0ef2, B:194:0x0f00, B:195:0x0f12, B:197:0x0f18, B:168:0x0e42, B:159:0x0b31, B:60:0x01a6, B:28:0x00c3, B:30:0x00cd, B:32:0x00d7, B:34:0x00e5, B:36:0x00f0, B:35:0x00ec), top: B:496:0x00ad }] */
    /* JADX WARN: Removed duplicated region for block: B:293:0x116f A[Catch: JSONException -> 0x169e, TryCatch #0 {JSONException -> 0x169e, blocks: (B:23:0x00ad, B:25:0x00b1, B:27:0x00bc, B:29:0x00c7, B:38:0x00fc, B:40:0x0104, B:42:0x0108, B:43:0x0116, B:45:0x011e, B:46:0x012a, B:48:0x0130, B:50:0x0146, B:51:0x0158, B:53:0x015c, B:55:0x0164, B:56:0x0176, B:58:0x0195, B:63:0x01b2, B:65:0x01c5, B:66:0x01ca, B:68:0x01d2, B:69:0x01d6, B:71:0x01dc, B:72:0x01ea, B:74:0x01fb, B:76:0x020b, B:80:0x024d, B:82:0x0251, B:93:0x026e, B:95:0x0273, B:97:0x0277, B:99:0x0282, B:100:0x028f, B:106:0x02a0, B:109:0x02a8, B:110:0x02bc, B:112:0x02c2, B:113:0x02d1, B:114:0x02e7, B:116:0x02ed, B:117:0x02fb, B:120:0x032c, B:124:0x037d, B:128:0x03c4, B:131:0x06b9, B:135:0x06ca, B:139:0x06f7, B:141:0x09f9, B:142:0x09fb, B:144:0x0a05, B:145:0x0a07, B:147:0x0a11, B:148:0x0a13, B:156:0x0acb, B:160:0x0b3b, B:164:0x0ca9, B:167:0x0d14, B:171:0x0e50, B:173:0x0e70, B:175:0x0e76, B:176:0x0e7f, B:178:0x0e86, B:179:0x0e8b, B:181:0x0e95, B:182:0x0e9e, B:184:0x0ea6, B:186:0x0eaa, B:188:0x0eae, B:198:0x0f26, B:200:0x0f2b, B:208:0x0f5e, B:210:0x0f63, B:212:0x0f7f, B:213:0x0f87, B:215:0x0f8d, B:216:0x0fa1, B:217:0x0faa, B:219:0x0fb9, B:221:0x0fc1, B:223:0x0fd0, B:224:0x0fdb, B:226:0x0fe3, B:227:0x0fee, B:229:0x0ff6, B:230:0x1001, B:232:0x1009, B:233:0x1014, B:235:0x101c, B:236:0x1027, B:238:0x102f, B:239:0x103a, B:241:0x1042, B:242:0x104d, B:244:0x1055, B:245:0x1060, B:247:0x1066, B:248:0x106d, B:250:0x1075, B:251:0x1080, B:253:0x1086, B:254:0x108d, B:256:0x1095, B:257:0x10a0, B:259:0x10a8, B:260:0x10b3, B:262:0x10bb, B:263:0x10c6, B:265:0x10ce, B:266:0x10d9, B:268:0x10e1, B:269:0x10ec, B:271:0x10f2, B:272:0x10f9, B:274:0x1101, B:275:0x110c, B:277:0x1114, B:278:0x111f, B:280:0x1127, B:281:0x1132, B:283:0x1138, B:284:0x113f, B:286:0x1149, B:288:0x114f, B:290:0x115c, B:291:0x1167, B:293:0x116f, B:294:0x117a, B:296:0x1182, B:297:0x118d, B:299:0x1195, B:300:0x11a0, B:302:0x11a8, B:303:0x11b3, B:305:0x11bb, B:306:0x11c6, B:308:0x11ce, B:309:0x11d9, B:311:0x11e1, B:312:0x11ec, B:314:0x11f4, B:315:0x11ff, B:317:0x1207, B:318:0x1212, B:320:0x121a, B:321:0x1225, B:323:0x122d, B:324:0x1238, B:326:0x1240, B:327:0x124b, B:329:0x1253, B:330:0x125e, B:332:0x1266, B:333:0x1271, B:335:0x1279, B:336:0x1284, B:338:0x128c, B:339:0x1297, B:341:0x129f, B:342:0x12aa, B:344:0x12b2, B:345:0x12bd, B:347:0x12c5, B:348:0x12d0, B:350:0x12d8, B:351:0x12e3, B:353:0x12eb, B:354:0x12f6, B:356:0x12fe, B:357:0x1309, B:359:0x1311, B:360:0x131c, B:362:0x1324, B:363:0x132f, B:365:0x1337, B:366:0x1342, B:368:0x134a, B:369:0x1355, B:371:0x135d, B:372:0x1368, B:374:0x1370, B:375:0x137b, B:377:0x137f, B:379:0x1383, B:381:0x138d, B:382:0x1392, B:384:0x1399, B:385:0x139c, B:387:0x13b3, B:388:0x13bb, B:394:0x13d9, B:399:0x13f4, B:401:0x13fb, B:402:0x1400, B:404:0x1404, B:405:0x143f, B:407:0x1445, B:408:0x144a, B:410:0x144f, B:411:0x1454, B:413:0x1458, B:414:0x1463, B:416:0x1467, B:417:0x147c, B:419:0x1495, B:420:0x149e, B:422:0x14a2, B:423:0x14b5, B:425:0x14b9, B:426:0x14d5, B:428:0x14d9, B:429:0x14de, B:431:0x14e2, B:432:0x14e7, B:434:0x14eb, B:435:0x14f1, B:437:0x14f5, B:438:0x1505, B:440:0x1518, B:441:0x151f, B:443:0x1529, B:446:0x153a, B:448:0x153f, B:449:0x155e, B:451:0x1566, B:452:0x158a, B:454:0x1591, B:455:0x1598, B:457:0x159d, B:459:0x15a8, B:465:0x15c2, B:467:0x15ca, B:469:0x15d4, B:470:0x15d6, B:481:0x1678, B:471:0x15d9, B:473:0x1643, B:475:0x1647, B:477:0x164f, B:478:0x1664, B:480:0x166a, B:482:0x167f, B:483:0x1684, B:485:0x1688, B:487:0x168c, B:488:0x168f, B:490:0x1695, B:491:0x169a, B:445:0x1533, B:462:0x15af, B:463:0x15b6, B:391:0x13cf, B:202:0x0f31, B:204:0x0f3c, B:205:0x0f44, B:207:0x0f4a, B:190:0x0eb2, B:191:0x0eec, B:193:0x0ef2, B:194:0x0f00, B:195:0x0f12, B:197:0x0f18, B:168:0x0e42, B:159:0x0b31, B:60:0x01a6, B:28:0x00c3, B:30:0x00cd, B:32:0x00d7, B:34:0x00e5, B:36:0x00f0, B:35:0x00ec), top: B:496:0x00ad }] */
    /* JADX WARN: Removed duplicated region for block: B:296:0x1182 A[Catch: JSONException -> 0x169e, TryCatch #0 {JSONException -> 0x169e, blocks: (B:23:0x00ad, B:25:0x00b1, B:27:0x00bc, B:29:0x00c7, B:38:0x00fc, B:40:0x0104, B:42:0x0108, B:43:0x0116, B:45:0x011e, B:46:0x012a, B:48:0x0130, B:50:0x0146, B:51:0x0158, B:53:0x015c, B:55:0x0164, B:56:0x0176, B:58:0x0195, B:63:0x01b2, B:65:0x01c5, B:66:0x01ca, B:68:0x01d2, B:69:0x01d6, B:71:0x01dc, B:72:0x01ea, B:74:0x01fb, B:76:0x020b, B:80:0x024d, B:82:0x0251, B:93:0x026e, B:95:0x0273, B:97:0x0277, B:99:0x0282, B:100:0x028f, B:106:0x02a0, B:109:0x02a8, B:110:0x02bc, B:112:0x02c2, B:113:0x02d1, B:114:0x02e7, B:116:0x02ed, B:117:0x02fb, B:120:0x032c, B:124:0x037d, B:128:0x03c4, B:131:0x06b9, B:135:0x06ca, B:139:0x06f7, B:141:0x09f9, B:142:0x09fb, B:144:0x0a05, B:145:0x0a07, B:147:0x0a11, B:148:0x0a13, B:156:0x0acb, B:160:0x0b3b, B:164:0x0ca9, B:167:0x0d14, B:171:0x0e50, B:173:0x0e70, B:175:0x0e76, B:176:0x0e7f, B:178:0x0e86, B:179:0x0e8b, B:181:0x0e95, B:182:0x0e9e, B:184:0x0ea6, B:186:0x0eaa, B:188:0x0eae, B:198:0x0f26, B:200:0x0f2b, B:208:0x0f5e, B:210:0x0f63, B:212:0x0f7f, B:213:0x0f87, B:215:0x0f8d, B:216:0x0fa1, B:217:0x0faa, B:219:0x0fb9, B:221:0x0fc1, B:223:0x0fd0, B:224:0x0fdb, B:226:0x0fe3, B:227:0x0fee, B:229:0x0ff6, B:230:0x1001, B:232:0x1009, B:233:0x1014, B:235:0x101c, B:236:0x1027, B:238:0x102f, B:239:0x103a, B:241:0x1042, B:242:0x104d, B:244:0x1055, B:245:0x1060, B:247:0x1066, B:248:0x106d, B:250:0x1075, B:251:0x1080, B:253:0x1086, B:254:0x108d, B:256:0x1095, B:257:0x10a0, B:259:0x10a8, B:260:0x10b3, B:262:0x10bb, B:263:0x10c6, B:265:0x10ce, B:266:0x10d9, B:268:0x10e1, B:269:0x10ec, B:271:0x10f2, B:272:0x10f9, B:274:0x1101, B:275:0x110c, B:277:0x1114, B:278:0x111f, B:280:0x1127, B:281:0x1132, B:283:0x1138, B:284:0x113f, B:286:0x1149, B:288:0x114f, B:290:0x115c, B:291:0x1167, B:293:0x116f, B:294:0x117a, B:296:0x1182, B:297:0x118d, B:299:0x1195, B:300:0x11a0, B:302:0x11a8, B:303:0x11b3, B:305:0x11bb, B:306:0x11c6, B:308:0x11ce, B:309:0x11d9, B:311:0x11e1, B:312:0x11ec, B:314:0x11f4, B:315:0x11ff, B:317:0x1207, B:318:0x1212, B:320:0x121a, B:321:0x1225, B:323:0x122d, B:324:0x1238, B:326:0x1240, B:327:0x124b, B:329:0x1253, B:330:0x125e, B:332:0x1266, B:333:0x1271, B:335:0x1279, B:336:0x1284, B:338:0x128c, B:339:0x1297, B:341:0x129f, B:342:0x12aa, B:344:0x12b2, B:345:0x12bd, B:347:0x12c5, B:348:0x12d0, B:350:0x12d8, B:351:0x12e3, B:353:0x12eb, B:354:0x12f6, B:356:0x12fe, B:357:0x1309, B:359:0x1311, B:360:0x131c, B:362:0x1324, B:363:0x132f, B:365:0x1337, B:366:0x1342, B:368:0x134a, B:369:0x1355, B:371:0x135d, B:372:0x1368, B:374:0x1370, B:375:0x137b, B:377:0x137f, B:379:0x1383, B:381:0x138d, B:382:0x1392, B:384:0x1399, B:385:0x139c, B:387:0x13b3, B:388:0x13bb, B:394:0x13d9, B:399:0x13f4, B:401:0x13fb, B:402:0x1400, B:404:0x1404, B:405:0x143f, B:407:0x1445, B:408:0x144a, B:410:0x144f, B:411:0x1454, B:413:0x1458, B:414:0x1463, B:416:0x1467, B:417:0x147c, B:419:0x1495, B:420:0x149e, B:422:0x14a2, B:423:0x14b5, B:425:0x14b9, B:426:0x14d5, B:428:0x14d9, B:429:0x14de, B:431:0x14e2, B:432:0x14e7, B:434:0x14eb, B:435:0x14f1, B:437:0x14f5, B:438:0x1505, B:440:0x1518, B:441:0x151f, B:443:0x1529, B:446:0x153a, B:448:0x153f, B:449:0x155e, B:451:0x1566, B:452:0x158a, B:454:0x1591, B:455:0x1598, B:457:0x159d, B:459:0x15a8, B:465:0x15c2, B:467:0x15ca, B:469:0x15d4, B:470:0x15d6, B:481:0x1678, B:471:0x15d9, B:473:0x1643, B:475:0x1647, B:477:0x164f, B:478:0x1664, B:480:0x166a, B:482:0x167f, B:483:0x1684, B:485:0x1688, B:487:0x168c, B:488:0x168f, B:490:0x1695, B:491:0x169a, B:445:0x1533, B:462:0x15af, B:463:0x15b6, B:391:0x13cf, B:202:0x0f31, B:204:0x0f3c, B:205:0x0f44, B:207:0x0f4a, B:190:0x0eb2, B:191:0x0eec, B:193:0x0ef2, B:194:0x0f00, B:195:0x0f12, B:197:0x0f18, B:168:0x0e42, B:159:0x0b31, B:60:0x01a6, B:28:0x00c3, B:30:0x00cd, B:32:0x00d7, B:34:0x00e5, B:36:0x00f0, B:35:0x00ec), top: B:496:0x00ad }] */
    /* JADX WARN: Removed duplicated region for block: B:299:0x1195 A[Catch: JSONException -> 0x169e, TryCatch #0 {JSONException -> 0x169e, blocks: (B:23:0x00ad, B:25:0x00b1, B:27:0x00bc, B:29:0x00c7, B:38:0x00fc, B:40:0x0104, B:42:0x0108, B:43:0x0116, B:45:0x011e, B:46:0x012a, B:48:0x0130, B:50:0x0146, B:51:0x0158, B:53:0x015c, B:55:0x0164, B:56:0x0176, B:58:0x0195, B:63:0x01b2, B:65:0x01c5, B:66:0x01ca, B:68:0x01d2, B:69:0x01d6, B:71:0x01dc, B:72:0x01ea, B:74:0x01fb, B:76:0x020b, B:80:0x024d, B:82:0x0251, B:93:0x026e, B:95:0x0273, B:97:0x0277, B:99:0x0282, B:100:0x028f, B:106:0x02a0, B:109:0x02a8, B:110:0x02bc, B:112:0x02c2, B:113:0x02d1, B:114:0x02e7, B:116:0x02ed, B:117:0x02fb, B:120:0x032c, B:124:0x037d, B:128:0x03c4, B:131:0x06b9, B:135:0x06ca, B:139:0x06f7, B:141:0x09f9, B:142:0x09fb, B:144:0x0a05, B:145:0x0a07, B:147:0x0a11, B:148:0x0a13, B:156:0x0acb, B:160:0x0b3b, B:164:0x0ca9, B:167:0x0d14, B:171:0x0e50, B:173:0x0e70, B:175:0x0e76, B:176:0x0e7f, B:178:0x0e86, B:179:0x0e8b, B:181:0x0e95, B:182:0x0e9e, B:184:0x0ea6, B:186:0x0eaa, B:188:0x0eae, B:198:0x0f26, B:200:0x0f2b, B:208:0x0f5e, B:210:0x0f63, B:212:0x0f7f, B:213:0x0f87, B:215:0x0f8d, B:216:0x0fa1, B:217:0x0faa, B:219:0x0fb9, B:221:0x0fc1, B:223:0x0fd0, B:224:0x0fdb, B:226:0x0fe3, B:227:0x0fee, B:229:0x0ff6, B:230:0x1001, B:232:0x1009, B:233:0x1014, B:235:0x101c, B:236:0x1027, B:238:0x102f, B:239:0x103a, B:241:0x1042, B:242:0x104d, B:244:0x1055, B:245:0x1060, B:247:0x1066, B:248:0x106d, B:250:0x1075, B:251:0x1080, B:253:0x1086, B:254:0x108d, B:256:0x1095, B:257:0x10a0, B:259:0x10a8, B:260:0x10b3, B:262:0x10bb, B:263:0x10c6, B:265:0x10ce, B:266:0x10d9, B:268:0x10e1, B:269:0x10ec, B:271:0x10f2, B:272:0x10f9, B:274:0x1101, B:275:0x110c, B:277:0x1114, B:278:0x111f, B:280:0x1127, B:281:0x1132, B:283:0x1138, B:284:0x113f, B:286:0x1149, B:288:0x114f, B:290:0x115c, B:291:0x1167, B:293:0x116f, B:294:0x117a, B:296:0x1182, B:297:0x118d, B:299:0x1195, B:300:0x11a0, B:302:0x11a8, B:303:0x11b3, B:305:0x11bb, B:306:0x11c6, B:308:0x11ce, B:309:0x11d9, B:311:0x11e1, B:312:0x11ec, B:314:0x11f4, B:315:0x11ff, B:317:0x1207, B:318:0x1212, B:320:0x121a, B:321:0x1225, B:323:0x122d, B:324:0x1238, B:326:0x1240, B:327:0x124b, B:329:0x1253, B:330:0x125e, B:332:0x1266, B:333:0x1271, B:335:0x1279, B:336:0x1284, B:338:0x128c, B:339:0x1297, B:341:0x129f, B:342:0x12aa, B:344:0x12b2, B:345:0x12bd, B:347:0x12c5, B:348:0x12d0, B:350:0x12d8, B:351:0x12e3, B:353:0x12eb, B:354:0x12f6, B:356:0x12fe, B:357:0x1309, B:359:0x1311, B:360:0x131c, B:362:0x1324, B:363:0x132f, B:365:0x1337, B:366:0x1342, B:368:0x134a, B:369:0x1355, B:371:0x135d, B:372:0x1368, B:374:0x1370, B:375:0x137b, B:377:0x137f, B:379:0x1383, B:381:0x138d, B:382:0x1392, B:384:0x1399, B:385:0x139c, B:387:0x13b3, B:388:0x13bb, B:394:0x13d9, B:399:0x13f4, B:401:0x13fb, B:402:0x1400, B:404:0x1404, B:405:0x143f, B:407:0x1445, B:408:0x144a, B:410:0x144f, B:411:0x1454, B:413:0x1458, B:414:0x1463, B:416:0x1467, B:417:0x147c, B:419:0x1495, B:420:0x149e, B:422:0x14a2, B:423:0x14b5, B:425:0x14b9, B:426:0x14d5, B:428:0x14d9, B:429:0x14de, B:431:0x14e2, B:432:0x14e7, B:434:0x14eb, B:435:0x14f1, B:437:0x14f5, B:438:0x1505, B:440:0x1518, B:441:0x151f, B:443:0x1529, B:446:0x153a, B:448:0x153f, B:449:0x155e, B:451:0x1566, B:452:0x158a, B:454:0x1591, B:455:0x1598, B:457:0x159d, B:459:0x15a8, B:465:0x15c2, B:467:0x15ca, B:469:0x15d4, B:470:0x15d6, B:481:0x1678, B:471:0x15d9, B:473:0x1643, B:475:0x1647, B:477:0x164f, B:478:0x1664, B:480:0x166a, B:482:0x167f, B:483:0x1684, B:485:0x1688, B:487:0x168c, B:488:0x168f, B:490:0x1695, B:491:0x169a, B:445:0x1533, B:462:0x15af, B:463:0x15b6, B:391:0x13cf, B:202:0x0f31, B:204:0x0f3c, B:205:0x0f44, B:207:0x0f4a, B:190:0x0eb2, B:191:0x0eec, B:193:0x0ef2, B:194:0x0f00, B:195:0x0f12, B:197:0x0f18, B:168:0x0e42, B:159:0x0b31, B:60:0x01a6, B:28:0x00c3, B:30:0x00cd, B:32:0x00d7, B:34:0x00e5, B:36:0x00f0, B:35:0x00ec), top: B:496:0x00ad }] */
    /* JADX WARN: Removed duplicated region for block: B:302:0x11a8 A[Catch: JSONException -> 0x169e, TryCatch #0 {JSONException -> 0x169e, blocks: (B:23:0x00ad, B:25:0x00b1, B:27:0x00bc, B:29:0x00c7, B:38:0x00fc, B:40:0x0104, B:42:0x0108, B:43:0x0116, B:45:0x011e, B:46:0x012a, B:48:0x0130, B:50:0x0146, B:51:0x0158, B:53:0x015c, B:55:0x0164, B:56:0x0176, B:58:0x0195, B:63:0x01b2, B:65:0x01c5, B:66:0x01ca, B:68:0x01d2, B:69:0x01d6, B:71:0x01dc, B:72:0x01ea, B:74:0x01fb, B:76:0x020b, B:80:0x024d, B:82:0x0251, B:93:0x026e, B:95:0x0273, B:97:0x0277, B:99:0x0282, B:100:0x028f, B:106:0x02a0, B:109:0x02a8, B:110:0x02bc, B:112:0x02c2, B:113:0x02d1, B:114:0x02e7, B:116:0x02ed, B:117:0x02fb, B:120:0x032c, B:124:0x037d, B:128:0x03c4, B:131:0x06b9, B:135:0x06ca, B:139:0x06f7, B:141:0x09f9, B:142:0x09fb, B:144:0x0a05, B:145:0x0a07, B:147:0x0a11, B:148:0x0a13, B:156:0x0acb, B:160:0x0b3b, B:164:0x0ca9, B:167:0x0d14, B:171:0x0e50, B:173:0x0e70, B:175:0x0e76, B:176:0x0e7f, B:178:0x0e86, B:179:0x0e8b, B:181:0x0e95, B:182:0x0e9e, B:184:0x0ea6, B:186:0x0eaa, B:188:0x0eae, B:198:0x0f26, B:200:0x0f2b, B:208:0x0f5e, B:210:0x0f63, B:212:0x0f7f, B:213:0x0f87, B:215:0x0f8d, B:216:0x0fa1, B:217:0x0faa, B:219:0x0fb9, B:221:0x0fc1, B:223:0x0fd0, B:224:0x0fdb, B:226:0x0fe3, B:227:0x0fee, B:229:0x0ff6, B:230:0x1001, B:232:0x1009, B:233:0x1014, B:235:0x101c, B:236:0x1027, B:238:0x102f, B:239:0x103a, B:241:0x1042, B:242:0x104d, B:244:0x1055, B:245:0x1060, B:247:0x1066, B:248:0x106d, B:250:0x1075, B:251:0x1080, B:253:0x1086, B:254:0x108d, B:256:0x1095, B:257:0x10a0, B:259:0x10a8, B:260:0x10b3, B:262:0x10bb, B:263:0x10c6, B:265:0x10ce, B:266:0x10d9, B:268:0x10e1, B:269:0x10ec, B:271:0x10f2, B:272:0x10f9, B:274:0x1101, B:275:0x110c, B:277:0x1114, B:278:0x111f, B:280:0x1127, B:281:0x1132, B:283:0x1138, B:284:0x113f, B:286:0x1149, B:288:0x114f, B:290:0x115c, B:291:0x1167, B:293:0x116f, B:294:0x117a, B:296:0x1182, B:297:0x118d, B:299:0x1195, B:300:0x11a0, B:302:0x11a8, B:303:0x11b3, B:305:0x11bb, B:306:0x11c6, B:308:0x11ce, B:309:0x11d9, B:311:0x11e1, B:312:0x11ec, B:314:0x11f4, B:315:0x11ff, B:317:0x1207, B:318:0x1212, B:320:0x121a, B:321:0x1225, B:323:0x122d, B:324:0x1238, B:326:0x1240, B:327:0x124b, B:329:0x1253, B:330:0x125e, B:332:0x1266, B:333:0x1271, B:335:0x1279, B:336:0x1284, B:338:0x128c, B:339:0x1297, B:341:0x129f, B:342:0x12aa, B:344:0x12b2, B:345:0x12bd, B:347:0x12c5, B:348:0x12d0, B:350:0x12d8, B:351:0x12e3, B:353:0x12eb, B:354:0x12f6, B:356:0x12fe, B:357:0x1309, B:359:0x1311, B:360:0x131c, B:362:0x1324, B:363:0x132f, B:365:0x1337, B:366:0x1342, B:368:0x134a, B:369:0x1355, B:371:0x135d, B:372:0x1368, B:374:0x1370, B:375:0x137b, B:377:0x137f, B:379:0x1383, B:381:0x138d, B:382:0x1392, B:384:0x1399, B:385:0x139c, B:387:0x13b3, B:388:0x13bb, B:394:0x13d9, B:399:0x13f4, B:401:0x13fb, B:402:0x1400, B:404:0x1404, B:405:0x143f, B:407:0x1445, B:408:0x144a, B:410:0x144f, B:411:0x1454, B:413:0x1458, B:414:0x1463, B:416:0x1467, B:417:0x147c, B:419:0x1495, B:420:0x149e, B:422:0x14a2, B:423:0x14b5, B:425:0x14b9, B:426:0x14d5, B:428:0x14d9, B:429:0x14de, B:431:0x14e2, B:432:0x14e7, B:434:0x14eb, B:435:0x14f1, B:437:0x14f5, B:438:0x1505, B:440:0x1518, B:441:0x151f, B:443:0x1529, B:446:0x153a, B:448:0x153f, B:449:0x155e, B:451:0x1566, B:452:0x158a, B:454:0x1591, B:455:0x1598, B:457:0x159d, B:459:0x15a8, B:465:0x15c2, B:467:0x15ca, B:469:0x15d4, B:470:0x15d6, B:481:0x1678, B:471:0x15d9, B:473:0x1643, B:475:0x1647, B:477:0x164f, B:478:0x1664, B:480:0x166a, B:482:0x167f, B:483:0x1684, B:485:0x1688, B:487:0x168c, B:488:0x168f, B:490:0x1695, B:491:0x169a, B:445:0x1533, B:462:0x15af, B:463:0x15b6, B:391:0x13cf, B:202:0x0f31, B:204:0x0f3c, B:205:0x0f44, B:207:0x0f4a, B:190:0x0eb2, B:191:0x0eec, B:193:0x0ef2, B:194:0x0f00, B:195:0x0f12, B:197:0x0f18, B:168:0x0e42, B:159:0x0b31, B:60:0x01a6, B:28:0x00c3, B:30:0x00cd, B:32:0x00d7, B:34:0x00e5, B:36:0x00f0, B:35:0x00ec), top: B:496:0x00ad }] */
    /* JADX WARN: Removed duplicated region for block: B:305:0x11bb A[Catch: JSONException -> 0x169e, TryCatch #0 {JSONException -> 0x169e, blocks: (B:23:0x00ad, B:25:0x00b1, B:27:0x00bc, B:29:0x00c7, B:38:0x00fc, B:40:0x0104, B:42:0x0108, B:43:0x0116, B:45:0x011e, B:46:0x012a, B:48:0x0130, B:50:0x0146, B:51:0x0158, B:53:0x015c, B:55:0x0164, B:56:0x0176, B:58:0x0195, B:63:0x01b2, B:65:0x01c5, B:66:0x01ca, B:68:0x01d2, B:69:0x01d6, B:71:0x01dc, B:72:0x01ea, B:74:0x01fb, B:76:0x020b, B:80:0x024d, B:82:0x0251, B:93:0x026e, B:95:0x0273, B:97:0x0277, B:99:0x0282, B:100:0x028f, B:106:0x02a0, B:109:0x02a8, B:110:0x02bc, B:112:0x02c2, B:113:0x02d1, B:114:0x02e7, B:116:0x02ed, B:117:0x02fb, B:120:0x032c, B:124:0x037d, B:128:0x03c4, B:131:0x06b9, B:135:0x06ca, B:139:0x06f7, B:141:0x09f9, B:142:0x09fb, B:144:0x0a05, B:145:0x0a07, B:147:0x0a11, B:148:0x0a13, B:156:0x0acb, B:160:0x0b3b, B:164:0x0ca9, B:167:0x0d14, B:171:0x0e50, B:173:0x0e70, B:175:0x0e76, B:176:0x0e7f, B:178:0x0e86, B:179:0x0e8b, B:181:0x0e95, B:182:0x0e9e, B:184:0x0ea6, B:186:0x0eaa, B:188:0x0eae, B:198:0x0f26, B:200:0x0f2b, B:208:0x0f5e, B:210:0x0f63, B:212:0x0f7f, B:213:0x0f87, B:215:0x0f8d, B:216:0x0fa1, B:217:0x0faa, B:219:0x0fb9, B:221:0x0fc1, B:223:0x0fd0, B:224:0x0fdb, B:226:0x0fe3, B:227:0x0fee, B:229:0x0ff6, B:230:0x1001, B:232:0x1009, B:233:0x1014, B:235:0x101c, B:236:0x1027, B:238:0x102f, B:239:0x103a, B:241:0x1042, B:242:0x104d, B:244:0x1055, B:245:0x1060, B:247:0x1066, B:248:0x106d, B:250:0x1075, B:251:0x1080, B:253:0x1086, B:254:0x108d, B:256:0x1095, B:257:0x10a0, B:259:0x10a8, B:260:0x10b3, B:262:0x10bb, B:263:0x10c6, B:265:0x10ce, B:266:0x10d9, B:268:0x10e1, B:269:0x10ec, B:271:0x10f2, B:272:0x10f9, B:274:0x1101, B:275:0x110c, B:277:0x1114, B:278:0x111f, B:280:0x1127, B:281:0x1132, B:283:0x1138, B:284:0x113f, B:286:0x1149, B:288:0x114f, B:290:0x115c, B:291:0x1167, B:293:0x116f, B:294:0x117a, B:296:0x1182, B:297:0x118d, B:299:0x1195, B:300:0x11a0, B:302:0x11a8, B:303:0x11b3, B:305:0x11bb, B:306:0x11c6, B:308:0x11ce, B:309:0x11d9, B:311:0x11e1, B:312:0x11ec, B:314:0x11f4, B:315:0x11ff, B:317:0x1207, B:318:0x1212, B:320:0x121a, B:321:0x1225, B:323:0x122d, B:324:0x1238, B:326:0x1240, B:327:0x124b, B:329:0x1253, B:330:0x125e, B:332:0x1266, B:333:0x1271, B:335:0x1279, B:336:0x1284, B:338:0x128c, B:339:0x1297, B:341:0x129f, B:342:0x12aa, B:344:0x12b2, B:345:0x12bd, B:347:0x12c5, B:348:0x12d0, B:350:0x12d8, B:351:0x12e3, B:353:0x12eb, B:354:0x12f6, B:356:0x12fe, B:357:0x1309, B:359:0x1311, B:360:0x131c, B:362:0x1324, B:363:0x132f, B:365:0x1337, B:366:0x1342, B:368:0x134a, B:369:0x1355, B:371:0x135d, B:372:0x1368, B:374:0x1370, B:375:0x137b, B:377:0x137f, B:379:0x1383, B:381:0x138d, B:382:0x1392, B:384:0x1399, B:385:0x139c, B:387:0x13b3, B:388:0x13bb, B:394:0x13d9, B:399:0x13f4, B:401:0x13fb, B:402:0x1400, B:404:0x1404, B:405:0x143f, B:407:0x1445, B:408:0x144a, B:410:0x144f, B:411:0x1454, B:413:0x1458, B:414:0x1463, B:416:0x1467, B:417:0x147c, B:419:0x1495, B:420:0x149e, B:422:0x14a2, B:423:0x14b5, B:425:0x14b9, B:426:0x14d5, B:428:0x14d9, B:429:0x14de, B:431:0x14e2, B:432:0x14e7, B:434:0x14eb, B:435:0x14f1, B:437:0x14f5, B:438:0x1505, B:440:0x1518, B:441:0x151f, B:443:0x1529, B:446:0x153a, B:448:0x153f, B:449:0x155e, B:451:0x1566, B:452:0x158a, B:454:0x1591, B:455:0x1598, B:457:0x159d, B:459:0x15a8, B:465:0x15c2, B:467:0x15ca, B:469:0x15d4, B:470:0x15d6, B:481:0x1678, B:471:0x15d9, B:473:0x1643, B:475:0x1647, B:477:0x164f, B:478:0x1664, B:480:0x166a, B:482:0x167f, B:483:0x1684, B:485:0x1688, B:487:0x168c, B:488:0x168f, B:490:0x1695, B:491:0x169a, B:445:0x1533, B:462:0x15af, B:463:0x15b6, B:391:0x13cf, B:202:0x0f31, B:204:0x0f3c, B:205:0x0f44, B:207:0x0f4a, B:190:0x0eb2, B:191:0x0eec, B:193:0x0ef2, B:194:0x0f00, B:195:0x0f12, B:197:0x0f18, B:168:0x0e42, B:159:0x0b31, B:60:0x01a6, B:28:0x00c3, B:30:0x00cd, B:32:0x00d7, B:34:0x00e5, B:36:0x00f0, B:35:0x00ec), top: B:496:0x00ad }] */
    /* JADX WARN: Removed duplicated region for block: B:308:0x11ce A[Catch: JSONException -> 0x169e, TryCatch #0 {JSONException -> 0x169e, blocks: (B:23:0x00ad, B:25:0x00b1, B:27:0x00bc, B:29:0x00c7, B:38:0x00fc, B:40:0x0104, B:42:0x0108, B:43:0x0116, B:45:0x011e, B:46:0x012a, B:48:0x0130, B:50:0x0146, B:51:0x0158, B:53:0x015c, B:55:0x0164, B:56:0x0176, B:58:0x0195, B:63:0x01b2, B:65:0x01c5, B:66:0x01ca, B:68:0x01d2, B:69:0x01d6, B:71:0x01dc, B:72:0x01ea, B:74:0x01fb, B:76:0x020b, B:80:0x024d, B:82:0x0251, B:93:0x026e, B:95:0x0273, B:97:0x0277, B:99:0x0282, B:100:0x028f, B:106:0x02a0, B:109:0x02a8, B:110:0x02bc, B:112:0x02c2, B:113:0x02d1, B:114:0x02e7, B:116:0x02ed, B:117:0x02fb, B:120:0x032c, B:124:0x037d, B:128:0x03c4, B:131:0x06b9, B:135:0x06ca, B:139:0x06f7, B:141:0x09f9, B:142:0x09fb, B:144:0x0a05, B:145:0x0a07, B:147:0x0a11, B:148:0x0a13, B:156:0x0acb, B:160:0x0b3b, B:164:0x0ca9, B:167:0x0d14, B:171:0x0e50, B:173:0x0e70, B:175:0x0e76, B:176:0x0e7f, B:178:0x0e86, B:179:0x0e8b, B:181:0x0e95, B:182:0x0e9e, B:184:0x0ea6, B:186:0x0eaa, B:188:0x0eae, B:198:0x0f26, B:200:0x0f2b, B:208:0x0f5e, B:210:0x0f63, B:212:0x0f7f, B:213:0x0f87, B:215:0x0f8d, B:216:0x0fa1, B:217:0x0faa, B:219:0x0fb9, B:221:0x0fc1, B:223:0x0fd0, B:224:0x0fdb, B:226:0x0fe3, B:227:0x0fee, B:229:0x0ff6, B:230:0x1001, B:232:0x1009, B:233:0x1014, B:235:0x101c, B:236:0x1027, B:238:0x102f, B:239:0x103a, B:241:0x1042, B:242:0x104d, B:244:0x1055, B:245:0x1060, B:247:0x1066, B:248:0x106d, B:250:0x1075, B:251:0x1080, B:253:0x1086, B:254:0x108d, B:256:0x1095, B:257:0x10a0, B:259:0x10a8, B:260:0x10b3, B:262:0x10bb, B:263:0x10c6, B:265:0x10ce, B:266:0x10d9, B:268:0x10e1, B:269:0x10ec, B:271:0x10f2, B:272:0x10f9, B:274:0x1101, B:275:0x110c, B:277:0x1114, B:278:0x111f, B:280:0x1127, B:281:0x1132, B:283:0x1138, B:284:0x113f, B:286:0x1149, B:288:0x114f, B:290:0x115c, B:291:0x1167, B:293:0x116f, B:294:0x117a, B:296:0x1182, B:297:0x118d, B:299:0x1195, B:300:0x11a0, B:302:0x11a8, B:303:0x11b3, B:305:0x11bb, B:306:0x11c6, B:308:0x11ce, B:309:0x11d9, B:311:0x11e1, B:312:0x11ec, B:314:0x11f4, B:315:0x11ff, B:317:0x1207, B:318:0x1212, B:320:0x121a, B:321:0x1225, B:323:0x122d, B:324:0x1238, B:326:0x1240, B:327:0x124b, B:329:0x1253, B:330:0x125e, B:332:0x1266, B:333:0x1271, B:335:0x1279, B:336:0x1284, B:338:0x128c, B:339:0x1297, B:341:0x129f, B:342:0x12aa, B:344:0x12b2, B:345:0x12bd, B:347:0x12c5, B:348:0x12d0, B:350:0x12d8, B:351:0x12e3, B:353:0x12eb, B:354:0x12f6, B:356:0x12fe, B:357:0x1309, B:359:0x1311, B:360:0x131c, B:362:0x1324, B:363:0x132f, B:365:0x1337, B:366:0x1342, B:368:0x134a, B:369:0x1355, B:371:0x135d, B:372:0x1368, B:374:0x1370, B:375:0x137b, B:377:0x137f, B:379:0x1383, B:381:0x138d, B:382:0x1392, B:384:0x1399, B:385:0x139c, B:387:0x13b3, B:388:0x13bb, B:394:0x13d9, B:399:0x13f4, B:401:0x13fb, B:402:0x1400, B:404:0x1404, B:405:0x143f, B:407:0x1445, B:408:0x144a, B:410:0x144f, B:411:0x1454, B:413:0x1458, B:414:0x1463, B:416:0x1467, B:417:0x147c, B:419:0x1495, B:420:0x149e, B:422:0x14a2, B:423:0x14b5, B:425:0x14b9, B:426:0x14d5, B:428:0x14d9, B:429:0x14de, B:431:0x14e2, B:432:0x14e7, B:434:0x14eb, B:435:0x14f1, B:437:0x14f5, B:438:0x1505, B:440:0x1518, B:441:0x151f, B:443:0x1529, B:446:0x153a, B:448:0x153f, B:449:0x155e, B:451:0x1566, B:452:0x158a, B:454:0x1591, B:455:0x1598, B:457:0x159d, B:459:0x15a8, B:465:0x15c2, B:467:0x15ca, B:469:0x15d4, B:470:0x15d6, B:481:0x1678, B:471:0x15d9, B:473:0x1643, B:475:0x1647, B:477:0x164f, B:478:0x1664, B:480:0x166a, B:482:0x167f, B:483:0x1684, B:485:0x1688, B:487:0x168c, B:488:0x168f, B:490:0x1695, B:491:0x169a, B:445:0x1533, B:462:0x15af, B:463:0x15b6, B:391:0x13cf, B:202:0x0f31, B:204:0x0f3c, B:205:0x0f44, B:207:0x0f4a, B:190:0x0eb2, B:191:0x0eec, B:193:0x0ef2, B:194:0x0f00, B:195:0x0f12, B:197:0x0f18, B:168:0x0e42, B:159:0x0b31, B:60:0x01a6, B:28:0x00c3, B:30:0x00cd, B:32:0x00d7, B:34:0x00e5, B:36:0x00f0, B:35:0x00ec), top: B:496:0x00ad }] */
    /* JADX WARN: Removed duplicated region for block: B:311:0x11e1 A[Catch: JSONException -> 0x169e, TryCatch #0 {JSONException -> 0x169e, blocks: (B:23:0x00ad, B:25:0x00b1, B:27:0x00bc, B:29:0x00c7, B:38:0x00fc, B:40:0x0104, B:42:0x0108, B:43:0x0116, B:45:0x011e, B:46:0x012a, B:48:0x0130, B:50:0x0146, B:51:0x0158, B:53:0x015c, B:55:0x0164, B:56:0x0176, B:58:0x0195, B:63:0x01b2, B:65:0x01c5, B:66:0x01ca, B:68:0x01d2, B:69:0x01d6, B:71:0x01dc, B:72:0x01ea, B:74:0x01fb, B:76:0x020b, B:80:0x024d, B:82:0x0251, B:93:0x026e, B:95:0x0273, B:97:0x0277, B:99:0x0282, B:100:0x028f, B:106:0x02a0, B:109:0x02a8, B:110:0x02bc, B:112:0x02c2, B:113:0x02d1, B:114:0x02e7, B:116:0x02ed, B:117:0x02fb, B:120:0x032c, B:124:0x037d, B:128:0x03c4, B:131:0x06b9, B:135:0x06ca, B:139:0x06f7, B:141:0x09f9, B:142:0x09fb, B:144:0x0a05, B:145:0x0a07, B:147:0x0a11, B:148:0x0a13, B:156:0x0acb, B:160:0x0b3b, B:164:0x0ca9, B:167:0x0d14, B:171:0x0e50, B:173:0x0e70, B:175:0x0e76, B:176:0x0e7f, B:178:0x0e86, B:179:0x0e8b, B:181:0x0e95, B:182:0x0e9e, B:184:0x0ea6, B:186:0x0eaa, B:188:0x0eae, B:198:0x0f26, B:200:0x0f2b, B:208:0x0f5e, B:210:0x0f63, B:212:0x0f7f, B:213:0x0f87, B:215:0x0f8d, B:216:0x0fa1, B:217:0x0faa, B:219:0x0fb9, B:221:0x0fc1, B:223:0x0fd0, B:224:0x0fdb, B:226:0x0fe3, B:227:0x0fee, B:229:0x0ff6, B:230:0x1001, B:232:0x1009, B:233:0x1014, B:235:0x101c, B:236:0x1027, B:238:0x102f, B:239:0x103a, B:241:0x1042, B:242:0x104d, B:244:0x1055, B:245:0x1060, B:247:0x1066, B:248:0x106d, B:250:0x1075, B:251:0x1080, B:253:0x1086, B:254:0x108d, B:256:0x1095, B:257:0x10a0, B:259:0x10a8, B:260:0x10b3, B:262:0x10bb, B:263:0x10c6, B:265:0x10ce, B:266:0x10d9, B:268:0x10e1, B:269:0x10ec, B:271:0x10f2, B:272:0x10f9, B:274:0x1101, B:275:0x110c, B:277:0x1114, B:278:0x111f, B:280:0x1127, B:281:0x1132, B:283:0x1138, B:284:0x113f, B:286:0x1149, B:288:0x114f, B:290:0x115c, B:291:0x1167, B:293:0x116f, B:294:0x117a, B:296:0x1182, B:297:0x118d, B:299:0x1195, B:300:0x11a0, B:302:0x11a8, B:303:0x11b3, B:305:0x11bb, B:306:0x11c6, B:308:0x11ce, B:309:0x11d9, B:311:0x11e1, B:312:0x11ec, B:314:0x11f4, B:315:0x11ff, B:317:0x1207, B:318:0x1212, B:320:0x121a, B:321:0x1225, B:323:0x122d, B:324:0x1238, B:326:0x1240, B:327:0x124b, B:329:0x1253, B:330:0x125e, B:332:0x1266, B:333:0x1271, B:335:0x1279, B:336:0x1284, B:338:0x128c, B:339:0x1297, B:341:0x129f, B:342:0x12aa, B:344:0x12b2, B:345:0x12bd, B:347:0x12c5, B:348:0x12d0, B:350:0x12d8, B:351:0x12e3, B:353:0x12eb, B:354:0x12f6, B:356:0x12fe, B:357:0x1309, B:359:0x1311, B:360:0x131c, B:362:0x1324, B:363:0x132f, B:365:0x1337, B:366:0x1342, B:368:0x134a, B:369:0x1355, B:371:0x135d, B:372:0x1368, B:374:0x1370, B:375:0x137b, B:377:0x137f, B:379:0x1383, B:381:0x138d, B:382:0x1392, B:384:0x1399, B:385:0x139c, B:387:0x13b3, B:388:0x13bb, B:394:0x13d9, B:399:0x13f4, B:401:0x13fb, B:402:0x1400, B:404:0x1404, B:405:0x143f, B:407:0x1445, B:408:0x144a, B:410:0x144f, B:411:0x1454, B:413:0x1458, B:414:0x1463, B:416:0x1467, B:417:0x147c, B:419:0x1495, B:420:0x149e, B:422:0x14a2, B:423:0x14b5, B:425:0x14b9, B:426:0x14d5, B:428:0x14d9, B:429:0x14de, B:431:0x14e2, B:432:0x14e7, B:434:0x14eb, B:435:0x14f1, B:437:0x14f5, B:438:0x1505, B:440:0x1518, B:441:0x151f, B:443:0x1529, B:446:0x153a, B:448:0x153f, B:449:0x155e, B:451:0x1566, B:452:0x158a, B:454:0x1591, B:455:0x1598, B:457:0x159d, B:459:0x15a8, B:465:0x15c2, B:467:0x15ca, B:469:0x15d4, B:470:0x15d6, B:481:0x1678, B:471:0x15d9, B:473:0x1643, B:475:0x1647, B:477:0x164f, B:478:0x1664, B:480:0x166a, B:482:0x167f, B:483:0x1684, B:485:0x1688, B:487:0x168c, B:488:0x168f, B:490:0x1695, B:491:0x169a, B:445:0x1533, B:462:0x15af, B:463:0x15b6, B:391:0x13cf, B:202:0x0f31, B:204:0x0f3c, B:205:0x0f44, B:207:0x0f4a, B:190:0x0eb2, B:191:0x0eec, B:193:0x0ef2, B:194:0x0f00, B:195:0x0f12, B:197:0x0f18, B:168:0x0e42, B:159:0x0b31, B:60:0x01a6, B:28:0x00c3, B:30:0x00cd, B:32:0x00d7, B:34:0x00e5, B:36:0x00f0, B:35:0x00ec), top: B:496:0x00ad }] */
    /* JADX WARN: Removed duplicated region for block: B:314:0x11f4 A[Catch: JSONException -> 0x169e, TryCatch #0 {JSONException -> 0x169e, blocks: (B:23:0x00ad, B:25:0x00b1, B:27:0x00bc, B:29:0x00c7, B:38:0x00fc, B:40:0x0104, B:42:0x0108, B:43:0x0116, B:45:0x011e, B:46:0x012a, B:48:0x0130, B:50:0x0146, B:51:0x0158, B:53:0x015c, B:55:0x0164, B:56:0x0176, B:58:0x0195, B:63:0x01b2, B:65:0x01c5, B:66:0x01ca, B:68:0x01d2, B:69:0x01d6, B:71:0x01dc, B:72:0x01ea, B:74:0x01fb, B:76:0x020b, B:80:0x024d, B:82:0x0251, B:93:0x026e, B:95:0x0273, B:97:0x0277, B:99:0x0282, B:100:0x028f, B:106:0x02a0, B:109:0x02a8, B:110:0x02bc, B:112:0x02c2, B:113:0x02d1, B:114:0x02e7, B:116:0x02ed, B:117:0x02fb, B:120:0x032c, B:124:0x037d, B:128:0x03c4, B:131:0x06b9, B:135:0x06ca, B:139:0x06f7, B:141:0x09f9, B:142:0x09fb, B:144:0x0a05, B:145:0x0a07, B:147:0x0a11, B:148:0x0a13, B:156:0x0acb, B:160:0x0b3b, B:164:0x0ca9, B:167:0x0d14, B:171:0x0e50, B:173:0x0e70, B:175:0x0e76, B:176:0x0e7f, B:178:0x0e86, B:179:0x0e8b, B:181:0x0e95, B:182:0x0e9e, B:184:0x0ea6, B:186:0x0eaa, B:188:0x0eae, B:198:0x0f26, B:200:0x0f2b, B:208:0x0f5e, B:210:0x0f63, B:212:0x0f7f, B:213:0x0f87, B:215:0x0f8d, B:216:0x0fa1, B:217:0x0faa, B:219:0x0fb9, B:221:0x0fc1, B:223:0x0fd0, B:224:0x0fdb, B:226:0x0fe3, B:227:0x0fee, B:229:0x0ff6, B:230:0x1001, B:232:0x1009, B:233:0x1014, B:235:0x101c, B:236:0x1027, B:238:0x102f, B:239:0x103a, B:241:0x1042, B:242:0x104d, B:244:0x1055, B:245:0x1060, B:247:0x1066, B:248:0x106d, B:250:0x1075, B:251:0x1080, B:253:0x1086, B:254:0x108d, B:256:0x1095, B:257:0x10a0, B:259:0x10a8, B:260:0x10b3, B:262:0x10bb, B:263:0x10c6, B:265:0x10ce, B:266:0x10d9, B:268:0x10e1, B:269:0x10ec, B:271:0x10f2, B:272:0x10f9, B:274:0x1101, B:275:0x110c, B:277:0x1114, B:278:0x111f, B:280:0x1127, B:281:0x1132, B:283:0x1138, B:284:0x113f, B:286:0x1149, B:288:0x114f, B:290:0x115c, B:291:0x1167, B:293:0x116f, B:294:0x117a, B:296:0x1182, B:297:0x118d, B:299:0x1195, B:300:0x11a0, B:302:0x11a8, B:303:0x11b3, B:305:0x11bb, B:306:0x11c6, B:308:0x11ce, B:309:0x11d9, B:311:0x11e1, B:312:0x11ec, B:314:0x11f4, B:315:0x11ff, B:317:0x1207, B:318:0x1212, B:320:0x121a, B:321:0x1225, B:323:0x122d, B:324:0x1238, B:326:0x1240, B:327:0x124b, B:329:0x1253, B:330:0x125e, B:332:0x1266, B:333:0x1271, B:335:0x1279, B:336:0x1284, B:338:0x128c, B:339:0x1297, B:341:0x129f, B:342:0x12aa, B:344:0x12b2, B:345:0x12bd, B:347:0x12c5, B:348:0x12d0, B:350:0x12d8, B:351:0x12e3, B:353:0x12eb, B:354:0x12f6, B:356:0x12fe, B:357:0x1309, B:359:0x1311, B:360:0x131c, B:362:0x1324, B:363:0x132f, B:365:0x1337, B:366:0x1342, B:368:0x134a, B:369:0x1355, B:371:0x135d, B:372:0x1368, B:374:0x1370, B:375:0x137b, B:377:0x137f, B:379:0x1383, B:381:0x138d, B:382:0x1392, B:384:0x1399, B:385:0x139c, B:387:0x13b3, B:388:0x13bb, B:394:0x13d9, B:399:0x13f4, B:401:0x13fb, B:402:0x1400, B:404:0x1404, B:405:0x143f, B:407:0x1445, B:408:0x144a, B:410:0x144f, B:411:0x1454, B:413:0x1458, B:414:0x1463, B:416:0x1467, B:417:0x147c, B:419:0x1495, B:420:0x149e, B:422:0x14a2, B:423:0x14b5, B:425:0x14b9, B:426:0x14d5, B:428:0x14d9, B:429:0x14de, B:431:0x14e2, B:432:0x14e7, B:434:0x14eb, B:435:0x14f1, B:437:0x14f5, B:438:0x1505, B:440:0x1518, B:441:0x151f, B:443:0x1529, B:446:0x153a, B:448:0x153f, B:449:0x155e, B:451:0x1566, B:452:0x158a, B:454:0x1591, B:455:0x1598, B:457:0x159d, B:459:0x15a8, B:465:0x15c2, B:467:0x15ca, B:469:0x15d4, B:470:0x15d6, B:481:0x1678, B:471:0x15d9, B:473:0x1643, B:475:0x1647, B:477:0x164f, B:478:0x1664, B:480:0x166a, B:482:0x167f, B:483:0x1684, B:485:0x1688, B:487:0x168c, B:488:0x168f, B:490:0x1695, B:491:0x169a, B:445:0x1533, B:462:0x15af, B:463:0x15b6, B:391:0x13cf, B:202:0x0f31, B:204:0x0f3c, B:205:0x0f44, B:207:0x0f4a, B:190:0x0eb2, B:191:0x0eec, B:193:0x0ef2, B:194:0x0f00, B:195:0x0f12, B:197:0x0f18, B:168:0x0e42, B:159:0x0b31, B:60:0x01a6, B:28:0x00c3, B:30:0x00cd, B:32:0x00d7, B:34:0x00e5, B:36:0x00f0, B:35:0x00ec), top: B:496:0x00ad }] */
    /* JADX WARN: Removed duplicated region for block: B:317:0x1207 A[Catch: JSONException -> 0x169e, TryCatch #0 {JSONException -> 0x169e, blocks: (B:23:0x00ad, B:25:0x00b1, B:27:0x00bc, B:29:0x00c7, B:38:0x00fc, B:40:0x0104, B:42:0x0108, B:43:0x0116, B:45:0x011e, B:46:0x012a, B:48:0x0130, B:50:0x0146, B:51:0x0158, B:53:0x015c, B:55:0x0164, B:56:0x0176, B:58:0x0195, B:63:0x01b2, B:65:0x01c5, B:66:0x01ca, B:68:0x01d2, B:69:0x01d6, B:71:0x01dc, B:72:0x01ea, B:74:0x01fb, B:76:0x020b, B:80:0x024d, B:82:0x0251, B:93:0x026e, B:95:0x0273, B:97:0x0277, B:99:0x0282, B:100:0x028f, B:106:0x02a0, B:109:0x02a8, B:110:0x02bc, B:112:0x02c2, B:113:0x02d1, B:114:0x02e7, B:116:0x02ed, B:117:0x02fb, B:120:0x032c, B:124:0x037d, B:128:0x03c4, B:131:0x06b9, B:135:0x06ca, B:139:0x06f7, B:141:0x09f9, B:142:0x09fb, B:144:0x0a05, B:145:0x0a07, B:147:0x0a11, B:148:0x0a13, B:156:0x0acb, B:160:0x0b3b, B:164:0x0ca9, B:167:0x0d14, B:171:0x0e50, B:173:0x0e70, B:175:0x0e76, B:176:0x0e7f, B:178:0x0e86, B:179:0x0e8b, B:181:0x0e95, B:182:0x0e9e, B:184:0x0ea6, B:186:0x0eaa, B:188:0x0eae, B:198:0x0f26, B:200:0x0f2b, B:208:0x0f5e, B:210:0x0f63, B:212:0x0f7f, B:213:0x0f87, B:215:0x0f8d, B:216:0x0fa1, B:217:0x0faa, B:219:0x0fb9, B:221:0x0fc1, B:223:0x0fd0, B:224:0x0fdb, B:226:0x0fe3, B:227:0x0fee, B:229:0x0ff6, B:230:0x1001, B:232:0x1009, B:233:0x1014, B:235:0x101c, B:236:0x1027, B:238:0x102f, B:239:0x103a, B:241:0x1042, B:242:0x104d, B:244:0x1055, B:245:0x1060, B:247:0x1066, B:248:0x106d, B:250:0x1075, B:251:0x1080, B:253:0x1086, B:254:0x108d, B:256:0x1095, B:257:0x10a0, B:259:0x10a8, B:260:0x10b3, B:262:0x10bb, B:263:0x10c6, B:265:0x10ce, B:266:0x10d9, B:268:0x10e1, B:269:0x10ec, B:271:0x10f2, B:272:0x10f9, B:274:0x1101, B:275:0x110c, B:277:0x1114, B:278:0x111f, B:280:0x1127, B:281:0x1132, B:283:0x1138, B:284:0x113f, B:286:0x1149, B:288:0x114f, B:290:0x115c, B:291:0x1167, B:293:0x116f, B:294:0x117a, B:296:0x1182, B:297:0x118d, B:299:0x1195, B:300:0x11a0, B:302:0x11a8, B:303:0x11b3, B:305:0x11bb, B:306:0x11c6, B:308:0x11ce, B:309:0x11d9, B:311:0x11e1, B:312:0x11ec, B:314:0x11f4, B:315:0x11ff, B:317:0x1207, B:318:0x1212, B:320:0x121a, B:321:0x1225, B:323:0x122d, B:324:0x1238, B:326:0x1240, B:327:0x124b, B:329:0x1253, B:330:0x125e, B:332:0x1266, B:333:0x1271, B:335:0x1279, B:336:0x1284, B:338:0x128c, B:339:0x1297, B:341:0x129f, B:342:0x12aa, B:344:0x12b2, B:345:0x12bd, B:347:0x12c5, B:348:0x12d0, B:350:0x12d8, B:351:0x12e3, B:353:0x12eb, B:354:0x12f6, B:356:0x12fe, B:357:0x1309, B:359:0x1311, B:360:0x131c, B:362:0x1324, B:363:0x132f, B:365:0x1337, B:366:0x1342, B:368:0x134a, B:369:0x1355, B:371:0x135d, B:372:0x1368, B:374:0x1370, B:375:0x137b, B:377:0x137f, B:379:0x1383, B:381:0x138d, B:382:0x1392, B:384:0x1399, B:385:0x139c, B:387:0x13b3, B:388:0x13bb, B:394:0x13d9, B:399:0x13f4, B:401:0x13fb, B:402:0x1400, B:404:0x1404, B:405:0x143f, B:407:0x1445, B:408:0x144a, B:410:0x144f, B:411:0x1454, B:413:0x1458, B:414:0x1463, B:416:0x1467, B:417:0x147c, B:419:0x1495, B:420:0x149e, B:422:0x14a2, B:423:0x14b5, B:425:0x14b9, B:426:0x14d5, B:428:0x14d9, B:429:0x14de, B:431:0x14e2, B:432:0x14e7, B:434:0x14eb, B:435:0x14f1, B:437:0x14f5, B:438:0x1505, B:440:0x1518, B:441:0x151f, B:443:0x1529, B:446:0x153a, B:448:0x153f, B:449:0x155e, B:451:0x1566, B:452:0x158a, B:454:0x1591, B:455:0x1598, B:457:0x159d, B:459:0x15a8, B:465:0x15c2, B:467:0x15ca, B:469:0x15d4, B:470:0x15d6, B:481:0x1678, B:471:0x15d9, B:473:0x1643, B:475:0x1647, B:477:0x164f, B:478:0x1664, B:480:0x166a, B:482:0x167f, B:483:0x1684, B:485:0x1688, B:487:0x168c, B:488:0x168f, B:490:0x1695, B:491:0x169a, B:445:0x1533, B:462:0x15af, B:463:0x15b6, B:391:0x13cf, B:202:0x0f31, B:204:0x0f3c, B:205:0x0f44, B:207:0x0f4a, B:190:0x0eb2, B:191:0x0eec, B:193:0x0ef2, B:194:0x0f00, B:195:0x0f12, B:197:0x0f18, B:168:0x0e42, B:159:0x0b31, B:60:0x01a6, B:28:0x00c3, B:30:0x00cd, B:32:0x00d7, B:34:0x00e5, B:36:0x00f0, B:35:0x00ec), top: B:496:0x00ad }] */
    /* JADX WARN: Removed duplicated region for block: B:320:0x121a A[Catch: JSONException -> 0x169e, TryCatch #0 {JSONException -> 0x169e, blocks: (B:23:0x00ad, B:25:0x00b1, B:27:0x00bc, B:29:0x00c7, B:38:0x00fc, B:40:0x0104, B:42:0x0108, B:43:0x0116, B:45:0x011e, B:46:0x012a, B:48:0x0130, B:50:0x0146, B:51:0x0158, B:53:0x015c, B:55:0x0164, B:56:0x0176, B:58:0x0195, B:63:0x01b2, B:65:0x01c5, B:66:0x01ca, B:68:0x01d2, B:69:0x01d6, B:71:0x01dc, B:72:0x01ea, B:74:0x01fb, B:76:0x020b, B:80:0x024d, B:82:0x0251, B:93:0x026e, B:95:0x0273, B:97:0x0277, B:99:0x0282, B:100:0x028f, B:106:0x02a0, B:109:0x02a8, B:110:0x02bc, B:112:0x02c2, B:113:0x02d1, B:114:0x02e7, B:116:0x02ed, B:117:0x02fb, B:120:0x032c, B:124:0x037d, B:128:0x03c4, B:131:0x06b9, B:135:0x06ca, B:139:0x06f7, B:141:0x09f9, B:142:0x09fb, B:144:0x0a05, B:145:0x0a07, B:147:0x0a11, B:148:0x0a13, B:156:0x0acb, B:160:0x0b3b, B:164:0x0ca9, B:167:0x0d14, B:171:0x0e50, B:173:0x0e70, B:175:0x0e76, B:176:0x0e7f, B:178:0x0e86, B:179:0x0e8b, B:181:0x0e95, B:182:0x0e9e, B:184:0x0ea6, B:186:0x0eaa, B:188:0x0eae, B:198:0x0f26, B:200:0x0f2b, B:208:0x0f5e, B:210:0x0f63, B:212:0x0f7f, B:213:0x0f87, B:215:0x0f8d, B:216:0x0fa1, B:217:0x0faa, B:219:0x0fb9, B:221:0x0fc1, B:223:0x0fd0, B:224:0x0fdb, B:226:0x0fe3, B:227:0x0fee, B:229:0x0ff6, B:230:0x1001, B:232:0x1009, B:233:0x1014, B:235:0x101c, B:236:0x1027, B:238:0x102f, B:239:0x103a, B:241:0x1042, B:242:0x104d, B:244:0x1055, B:245:0x1060, B:247:0x1066, B:248:0x106d, B:250:0x1075, B:251:0x1080, B:253:0x1086, B:254:0x108d, B:256:0x1095, B:257:0x10a0, B:259:0x10a8, B:260:0x10b3, B:262:0x10bb, B:263:0x10c6, B:265:0x10ce, B:266:0x10d9, B:268:0x10e1, B:269:0x10ec, B:271:0x10f2, B:272:0x10f9, B:274:0x1101, B:275:0x110c, B:277:0x1114, B:278:0x111f, B:280:0x1127, B:281:0x1132, B:283:0x1138, B:284:0x113f, B:286:0x1149, B:288:0x114f, B:290:0x115c, B:291:0x1167, B:293:0x116f, B:294:0x117a, B:296:0x1182, B:297:0x118d, B:299:0x1195, B:300:0x11a0, B:302:0x11a8, B:303:0x11b3, B:305:0x11bb, B:306:0x11c6, B:308:0x11ce, B:309:0x11d9, B:311:0x11e1, B:312:0x11ec, B:314:0x11f4, B:315:0x11ff, B:317:0x1207, B:318:0x1212, B:320:0x121a, B:321:0x1225, B:323:0x122d, B:324:0x1238, B:326:0x1240, B:327:0x124b, B:329:0x1253, B:330:0x125e, B:332:0x1266, B:333:0x1271, B:335:0x1279, B:336:0x1284, B:338:0x128c, B:339:0x1297, B:341:0x129f, B:342:0x12aa, B:344:0x12b2, B:345:0x12bd, B:347:0x12c5, B:348:0x12d0, B:350:0x12d8, B:351:0x12e3, B:353:0x12eb, B:354:0x12f6, B:356:0x12fe, B:357:0x1309, B:359:0x1311, B:360:0x131c, B:362:0x1324, B:363:0x132f, B:365:0x1337, B:366:0x1342, B:368:0x134a, B:369:0x1355, B:371:0x135d, B:372:0x1368, B:374:0x1370, B:375:0x137b, B:377:0x137f, B:379:0x1383, B:381:0x138d, B:382:0x1392, B:384:0x1399, B:385:0x139c, B:387:0x13b3, B:388:0x13bb, B:394:0x13d9, B:399:0x13f4, B:401:0x13fb, B:402:0x1400, B:404:0x1404, B:405:0x143f, B:407:0x1445, B:408:0x144a, B:410:0x144f, B:411:0x1454, B:413:0x1458, B:414:0x1463, B:416:0x1467, B:417:0x147c, B:419:0x1495, B:420:0x149e, B:422:0x14a2, B:423:0x14b5, B:425:0x14b9, B:426:0x14d5, B:428:0x14d9, B:429:0x14de, B:431:0x14e2, B:432:0x14e7, B:434:0x14eb, B:435:0x14f1, B:437:0x14f5, B:438:0x1505, B:440:0x1518, B:441:0x151f, B:443:0x1529, B:446:0x153a, B:448:0x153f, B:449:0x155e, B:451:0x1566, B:452:0x158a, B:454:0x1591, B:455:0x1598, B:457:0x159d, B:459:0x15a8, B:465:0x15c2, B:467:0x15ca, B:469:0x15d4, B:470:0x15d6, B:481:0x1678, B:471:0x15d9, B:473:0x1643, B:475:0x1647, B:477:0x164f, B:478:0x1664, B:480:0x166a, B:482:0x167f, B:483:0x1684, B:485:0x1688, B:487:0x168c, B:488:0x168f, B:490:0x1695, B:491:0x169a, B:445:0x1533, B:462:0x15af, B:463:0x15b6, B:391:0x13cf, B:202:0x0f31, B:204:0x0f3c, B:205:0x0f44, B:207:0x0f4a, B:190:0x0eb2, B:191:0x0eec, B:193:0x0ef2, B:194:0x0f00, B:195:0x0f12, B:197:0x0f18, B:168:0x0e42, B:159:0x0b31, B:60:0x01a6, B:28:0x00c3, B:30:0x00cd, B:32:0x00d7, B:34:0x00e5, B:36:0x00f0, B:35:0x00ec), top: B:496:0x00ad }] */
    /* JADX WARN: Removed duplicated region for block: B:323:0x122d A[Catch: JSONException -> 0x169e, TryCatch #0 {JSONException -> 0x169e, blocks: (B:23:0x00ad, B:25:0x00b1, B:27:0x00bc, B:29:0x00c7, B:38:0x00fc, B:40:0x0104, B:42:0x0108, B:43:0x0116, B:45:0x011e, B:46:0x012a, B:48:0x0130, B:50:0x0146, B:51:0x0158, B:53:0x015c, B:55:0x0164, B:56:0x0176, B:58:0x0195, B:63:0x01b2, B:65:0x01c5, B:66:0x01ca, B:68:0x01d2, B:69:0x01d6, B:71:0x01dc, B:72:0x01ea, B:74:0x01fb, B:76:0x020b, B:80:0x024d, B:82:0x0251, B:93:0x026e, B:95:0x0273, B:97:0x0277, B:99:0x0282, B:100:0x028f, B:106:0x02a0, B:109:0x02a8, B:110:0x02bc, B:112:0x02c2, B:113:0x02d1, B:114:0x02e7, B:116:0x02ed, B:117:0x02fb, B:120:0x032c, B:124:0x037d, B:128:0x03c4, B:131:0x06b9, B:135:0x06ca, B:139:0x06f7, B:141:0x09f9, B:142:0x09fb, B:144:0x0a05, B:145:0x0a07, B:147:0x0a11, B:148:0x0a13, B:156:0x0acb, B:160:0x0b3b, B:164:0x0ca9, B:167:0x0d14, B:171:0x0e50, B:173:0x0e70, B:175:0x0e76, B:176:0x0e7f, B:178:0x0e86, B:179:0x0e8b, B:181:0x0e95, B:182:0x0e9e, B:184:0x0ea6, B:186:0x0eaa, B:188:0x0eae, B:198:0x0f26, B:200:0x0f2b, B:208:0x0f5e, B:210:0x0f63, B:212:0x0f7f, B:213:0x0f87, B:215:0x0f8d, B:216:0x0fa1, B:217:0x0faa, B:219:0x0fb9, B:221:0x0fc1, B:223:0x0fd0, B:224:0x0fdb, B:226:0x0fe3, B:227:0x0fee, B:229:0x0ff6, B:230:0x1001, B:232:0x1009, B:233:0x1014, B:235:0x101c, B:236:0x1027, B:238:0x102f, B:239:0x103a, B:241:0x1042, B:242:0x104d, B:244:0x1055, B:245:0x1060, B:247:0x1066, B:248:0x106d, B:250:0x1075, B:251:0x1080, B:253:0x1086, B:254:0x108d, B:256:0x1095, B:257:0x10a0, B:259:0x10a8, B:260:0x10b3, B:262:0x10bb, B:263:0x10c6, B:265:0x10ce, B:266:0x10d9, B:268:0x10e1, B:269:0x10ec, B:271:0x10f2, B:272:0x10f9, B:274:0x1101, B:275:0x110c, B:277:0x1114, B:278:0x111f, B:280:0x1127, B:281:0x1132, B:283:0x1138, B:284:0x113f, B:286:0x1149, B:288:0x114f, B:290:0x115c, B:291:0x1167, B:293:0x116f, B:294:0x117a, B:296:0x1182, B:297:0x118d, B:299:0x1195, B:300:0x11a0, B:302:0x11a8, B:303:0x11b3, B:305:0x11bb, B:306:0x11c6, B:308:0x11ce, B:309:0x11d9, B:311:0x11e1, B:312:0x11ec, B:314:0x11f4, B:315:0x11ff, B:317:0x1207, B:318:0x1212, B:320:0x121a, B:321:0x1225, B:323:0x122d, B:324:0x1238, B:326:0x1240, B:327:0x124b, B:329:0x1253, B:330:0x125e, B:332:0x1266, B:333:0x1271, B:335:0x1279, B:336:0x1284, B:338:0x128c, B:339:0x1297, B:341:0x129f, B:342:0x12aa, B:344:0x12b2, B:345:0x12bd, B:347:0x12c5, B:348:0x12d0, B:350:0x12d8, B:351:0x12e3, B:353:0x12eb, B:354:0x12f6, B:356:0x12fe, B:357:0x1309, B:359:0x1311, B:360:0x131c, B:362:0x1324, B:363:0x132f, B:365:0x1337, B:366:0x1342, B:368:0x134a, B:369:0x1355, B:371:0x135d, B:372:0x1368, B:374:0x1370, B:375:0x137b, B:377:0x137f, B:379:0x1383, B:381:0x138d, B:382:0x1392, B:384:0x1399, B:385:0x139c, B:387:0x13b3, B:388:0x13bb, B:394:0x13d9, B:399:0x13f4, B:401:0x13fb, B:402:0x1400, B:404:0x1404, B:405:0x143f, B:407:0x1445, B:408:0x144a, B:410:0x144f, B:411:0x1454, B:413:0x1458, B:414:0x1463, B:416:0x1467, B:417:0x147c, B:419:0x1495, B:420:0x149e, B:422:0x14a2, B:423:0x14b5, B:425:0x14b9, B:426:0x14d5, B:428:0x14d9, B:429:0x14de, B:431:0x14e2, B:432:0x14e7, B:434:0x14eb, B:435:0x14f1, B:437:0x14f5, B:438:0x1505, B:440:0x1518, B:441:0x151f, B:443:0x1529, B:446:0x153a, B:448:0x153f, B:449:0x155e, B:451:0x1566, B:452:0x158a, B:454:0x1591, B:455:0x1598, B:457:0x159d, B:459:0x15a8, B:465:0x15c2, B:467:0x15ca, B:469:0x15d4, B:470:0x15d6, B:481:0x1678, B:471:0x15d9, B:473:0x1643, B:475:0x1647, B:477:0x164f, B:478:0x1664, B:480:0x166a, B:482:0x167f, B:483:0x1684, B:485:0x1688, B:487:0x168c, B:488:0x168f, B:490:0x1695, B:491:0x169a, B:445:0x1533, B:462:0x15af, B:463:0x15b6, B:391:0x13cf, B:202:0x0f31, B:204:0x0f3c, B:205:0x0f44, B:207:0x0f4a, B:190:0x0eb2, B:191:0x0eec, B:193:0x0ef2, B:194:0x0f00, B:195:0x0f12, B:197:0x0f18, B:168:0x0e42, B:159:0x0b31, B:60:0x01a6, B:28:0x00c3, B:30:0x00cd, B:32:0x00d7, B:34:0x00e5, B:36:0x00f0, B:35:0x00ec), top: B:496:0x00ad }] */
    /* JADX WARN: Removed duplicated region for block: B:326:0x1240 A[Catch: JSONException -> 0x169e, TryCatch #0 {JSONException -> 0x169e, blocks: (B:23:0x00ad, B:25:0x00b1, B:27:0x00bc, B:29:0x00c7, B:38:0x00fc, B:40:0x0104, B:42:0x0108, B:43:0x0116, B:45:0x011e, B:46:0x012a, B:48:0x0130, B:50:0x0146, B:51:0x0158, B:53:0x015c, B:55:0x0164, B:56:0x0176, B:58:0x0195, B:63:0x01b2, B:65:0x01c5, B:66:0x01ca, B:68:0x01d2, B:69:0x01d6, B:71:0x01dc, B:72:0x01ea, B:74:0x01fb, B:76:0x020b, B:80:0x024d, B:82:0x0251, B:93:0x026e, B:95:0x0273, B:97:0x0277, B:99:0x0282, B:100:0x028f, B:106:0x02a0, B:109:0x02a8, B:110:0x02bc, B:112:0x02c2, B:113:0x02d1, B:114:0x02e7, B:116:0x02ed, B:117:0x02fb, B:120:0x032c, B:124:0x037d, B:128:0x03c4, B:131:0x06b9, B:135:0x06ca, B:139:0x06f7, B:141:0x09f9, B:142:0x09fb, B:144:0x0a05, B:145:0x0a07, B:147:0x0a11, B:148:0x0a13, B:156:0x0acb, B:160:0x0b3b, B:164:0x0ca9, B:167:0x0d14, B:171:0x0e50, B:173:0x0e70, B:175:0x0e76, B:176:0x0e7f, B:178:0x0e86, B:179:0x0e8b, B:181:0x0e95, B:182:0x0e9e, B:184:0x0ea6, B:186:0x0eaa, B:188:0x0eae, B:198:0x0f26, B:200:0x0f2b, B:208:0x0f5e, B:210:0x0f63, B:212:0x0f7f, B:213:0x0f87, B:215:0x0f8d, B:216:0x0fa1, B:217:0x0faa, B:219:0x0fb9, B:221:0x0fc1, B:223:0x0fd0, B:224:0x0fdb, B:226:0x0fe3, B:227:0x0fee, B:229:0x0ff6, B:230:0x1001, B:232:0x1009, B:233:0x1014, B:235:0x101c, B:236:0x1027, B:238:0x102f, B:239:0x103a, B:241:0x1042, B:242:0x104d, B:244:0x1055, B:245:0x1060, B:247:0x1066, B:248:0x106d, B:250:0x1075, B:251:0x1080, B:253:0x1086, B:254:0x108d, B:256:0x1095, B:257:0x10a0, B:259:0x10a8, B:260:0x10b3, B:262:0x10bb, B:263:0x10c6, B:265:0x10ce, B:266:0x10d9, B:268:0x10e1, B:269:0x10ec, B:271:0x10f2, B:272:0x10f9, B:274:0x1101, B:275:0x110c, B:277:0x1114, B:278:0x111f, B:280:0x1127, B:281:0x1132, B:283:0x1138, B:284:0x113f, B:286:0x1149, B:288:0x114f, B:290:0x115c, B:291:0x1167, B:293:0x116f, B:294:0x117a, B:296:0x1182, B:297:0x118d, B:299:0x1195, B:300:0x11a0, B:302:0x11a8, B:303:0x11b3, B:305:0x11bb, B:306:0x11c6, B:308:0x11ce, B:309:0x11d9, B:311:0x11e1, B:312:0x11ec, B:314:0x11f4, B:315:0x11ff, B:317:0x1207, B:318:0x1212, B:320:0x121a, B:321:0x1225, B:323:0x122d, B:324:0x1238, B:326:0x1240, B:327:0x124b, B:329:0x1253, B:330:0x125e, B:332:0x1266, B:333:0x1271, B:335:0x1279, B:336:0x1284, B:338:0x128c, B:339:0x1297, B:341:0x129f, B:342:0x12aa, B:344:0x12b2, B:345:0x12bd, B:347:0x12c5, B:348:0x12d0, B:350:0x12d8, B:351:0x12e3, B:353:0x12eb, B:354:0x12f6, B:356:0x12fe, B:357:0x1309, B:359:0x1311, B:360:0x131c, B:362:0x1324, B:363:0x132f, B:365:0x1337, B:366:0x1342, B:368:0x134a, B:369:0x1355, B:371:0x135d, B:372:0x1368, B:374:0x1370, B:375:0x137b, B:377:0x137f, B:379:0x1383, B:381:0x138d, B:382:0x1392, B:384:0x1399, B:385:0x139c, B:387:0x13b3, B:388:0x13bb, B:394:0x13d9, B:399:0x13f4, B:401:0x13fb, B:402:0x1400, B:404:0x1404, B:405:0x143f, B:407:0x1445, B:408:0x144a, B:410:0x144f, B:411:0x1454, B:413:0x1458, B:414:0x1463, B:416:0x1467, B:417:0x147c, B:419:0x1495, B:420:0x149e, B:422:0x14a2, B:423:0x14b5, B:425:0x14b9, B:426:0x14d5, B:428:0x14d9, B:429:0x14de, B:431:0x14e2, B:432:0x14e7, B:434:0x14eb, B:435:0x14f1, B:437:0x14f5, B:438:0x1505, B:440:0x1518, B:441:0x151f, B:443:0x1529, B:446:0x153a, B:448:0x153f, B:449:0x155e, B:451:0x1566, B:452:0x158a, B:454:0x1591, B:455:0x1598, B:457:0x159d, B:459:0x15a8, B:465:0x15c2, B:467:0x15ca, B:469:0x15d4, B:470:0x15d6, B:481:0x1678, B:471:0x15d9, B:473:0x1643, B:475:0x1647, B:477:0x164f, B:478:0x1664, B:480:0x166a, B:482:0x167f, B:483:0x1684, B:485:0x1688, B:487:0x168c, B:488:0x168f, B:490:0x1695, B:491:0x169a, B:445:0x1533, B:462:0x15af, B:463:0x15b6, B:391:0x13cf, B:202:0x0f31, B:204:0x0f3c, B:205:0x0f44, B:207:0x0f4a, B:190:0x0eb2, B:191:0x0eec, B:193:0x0ef2, B:194:0x0f00, B:195:0x0f12, B:197:0x0f18, B:168:0x0e42, B:159:0x0b31, B:60:0x01a6, B:28:0x00c3, B:30:0x00cd, B:32:0x00d7, B:34:0x00e5, B:36:0x00f0, B:35:0x00ec), top: B:496:0x00ad }] */
    /* JADX WARN: Removed duplicated region for block: B:329:0x1253 A[Catch: JSONException -> 0x169e, TryCatch #0 {JSONException -> 0x169e, blocks: (B:23:0x00ad, B:25:0x00b1, B:27:0x00bc, B:29:0x00c7, B:38:0x00fc, B:40:0x0104, B:42:0x0108, B:43:0x0116, B:45:0x011e, B:46:0x012a, B:48:0x0130, B:50:0x0146, B:51:0x0158, B:53:0x015c, B:55:0x0164, B:56:0x0176, B:58:0x0195, B:63:0x01b2, B:65:0x01c5, B:66:0x01ca, B:68:0x01d2, B:69:0x01d6, B:71:0x01dc, B:72:0x01ea, B:74:0x01fb, B:76:0x020b, B:80:0x024d, B:82:0x0251, B:93:0x026e, B:95:0x0273, B:97:0x0277, B:99:0x0282, B:100:0x028f, B:106:0x02a0, B:109:0x02a8, B:110:0x02bc, B:112:0x02c2, B:113:0x02d1, B:114:0x02e7, B:116:0x02ed, B:117:0x02fb, B:120:0x032c, B:124:0x037d, B:128:0x03c4, B:131:0x06b9, B:135:0x06ca, B:139:0x06f7, B:141:0x09f9, B:142:0x09fb, B:144:0x0a05, B:145:0x0a07, B:147:0x0a11, B:148:0x0a13, B:156:0x0acb, B:160:0x0b3b, B:164:0x0ca9, B:167:0x0d14, B:171:0x0e50, B:173:0x0e70, B:175:0x0e76, B:176:0x0e7f, B:178:0x0e86, B:179:0x0e8b, B:181:0x0e95, B:182:0x0e9e, B:184:0x0ea6, B:186:0x0eaa, B:188:0x0eae, B:198:0x0f26, B:200:0x0f2b, B:208:0x0f5e, B:210:0x0f63, B:212:0x0f7f, B:213:0x0f87, B:215:0x0f8d, B:216:0x0fa1, B:217:0x0faa, B:219:0x0fb9, B:221:0x0fc1, B:223:0x0fd0, B:224:0x0fdb, B:226:0x0fe3, B:227:0x0fee, B:229:0x0ff6, B:230:0x1001, B:232:0x1009, B:233:0x1014, B:235:0x101c, B:236:0x1027, B:238:0x102f, B:239:0x103a, B:241:0x1042, B:242:0x104d, B:244:0x1055, B:245:0x1060, B:247:0x1066, B:248:0x106d, B:250:0x1075, B:251:0x1080, B:253:0x1086, B:254:0x108d, B:256:0x1095, B:257:0x10a0, B:259:0x10a8, B:260:0x10b3, B:262:0x10bb, B:263:0x10c6, B:265:0x10ce, B:266:0x10d9, B:268:0x10e1, B:269:0x10ec, B:271:0x10f2, B:272:0x10f9, B:274:0x1101, B:275:0x110c, B:277:0x1114, B:278:0x111f, B:280:0x1127, B:281:0x1132, B:283:0x1138, B:284:0x113f, B:286:0x1149, B:288:0x114f, B:290:0x115c, B:291:0x1167, B:293:0x116f, B:294:0x117a, B:296:0x1182, B:297:0x118d, B:299:0x1195, B:300:0x11a0, B:302:0x11a8, B:303:0x11b3, B:305:0x11bb, B:306:0x11c6, B:308:0x11ce, B:309:0x11d9, B:311:0x11e1, B:312:0x11ec, B:314:0x11f4, B:315:0x11ff, B:317:0x1207, B:318:0x1212, B:320:0x121a, B:321:0x1225, B:323:0x122d, B:324:0x1238, B:326:0x1240, B:327:0x124b, B:329:0x1253, B:330:0x125e, B:332:0x1266, B:333:0x1271, B:335:0x1279, B:336:0x1284, B:338:0x128c, B:339:0x1297, B:341:0x129f, B:342:0x12aa, B:344:0x12b2, B:345:0x12bd, B:347:0x12c5, B:348:0x12d0, B:350:0x12d8, B:351:0x12e3, B:353:0x12eb, B:354:0x12f6, B:356:0x12fe, B:357:0x1309, B:359:0x1311, B:360:0x131c, B:362:0x1324, B:363:0x132f, B:365:0x1337, B:366:0x1342, B:368:0x134a, B:369:0x1355, B:371:0x135d, B:372:0x1368, B:374:0x1370, B:375:0x137b, B:377:0x137f, B:379:0x1383, B:381:0x138d, B:382:0x1392, B:384:0x1399, B:385:0x139c, B:387:0x13b3, B:388:0x13bb, B:394:0x13d9, B:399:0x13f4, B:401:0x13fb, B:402:0x1400, B:404:0x1404, B:405:0x143f, B:407:0x1445, B:408:0x144a, B:410:0x144f, B:411:0x1454, B:413:0x1458, B:414:0x1463, B:416:0x1467, B:417:0x147c, B:419:0x1495, B:420:0x149e, B:422:0x14a2, B:423:0x14b5, B:425:0x14b9, B:426:0x14d5, B:428:0x14d9, B:429:0x14de, B:431:0x14e2, B:432:0x14e7, B:434:0x14eb, B:435:0x14f1, B:437:0x14f5, B:438:0x1505, B:440:0x1518, B:441:0x151f, B:443:0x1529, B:446:0x153a, B:448:0x153f, B:449:0x155e, B:451:0x1566, B:452:0x158a, B:454:0x1591, B:455:0x1598, B:457:0x159d, B:459:0x15a8, B:465:0x15c2, B:467:0x15ca, B:469:0x15d4, B:470:0x15d6, B:481:0x1678, B:471:0x15d9, B:473:0x1643, B:475:0x1647, B:477:0x164f, B:478:0x1664, B:480:0x166a, B:482:0x167f, B:483:0x1684, B:485:0x1688, B:487:0x168c, B:488:0x168f, B:490:0x1695, B:491:0x169a, B:445:0x1533, B:462:0x15af, B:463:0x15b6, B:391:0x13cf, B:202:0x0f31, B:204:0x0f3c, B:205:0x0f44, B:207:0x0f4a, B:190:0x0eb2, B:191:0x0eec, B:193:0x0ef2, B:194:0x0f00, B:195:0x0f12, B:197:0x0f18, B:168:0x0e42, B:159:0x0b31, B:60:0x01a6, B:28:0x00c3, B:30:0x00cd, B:32:0x00d7, B:34:0x00e5, B:36:0x00f0, B:35:0x00ec), top: B:496:0x00ad }] */
    /* JADX WARN: Removed duplicated region for block: B:332:0x1266 A[Catch: JSONException -> 0x169e, TryCatch #0 {JSONException -> 0x169e, blocks: (B:23:0x00ad, B:25:0x00b1, B:27:0x00bc, B:29:0x00c7, B:38:0x00fc, B:40:0x0104, B:42:0x0108, B:43:0x0116, B:45:0x011e, B:46:0x012a, B:48:0x0130, B:50:0x0146, B:51:0x0158, B:53:0x015c, B:55:0x0164, B:56:0x0176, B:58:0x0195, B:63:0x01b2, B:65:0x01c5, B:66:0x01ca, B:68:0x01d2, B:69:0x01d6, B:71:0x01dc, B:72:0x01ea, B:74:0x01fb, B:76:0x020b, B:80:0x024d, B:82:0x0251, B:93:0x026e, B:95:0x0273, B:97:0x0277, B:99:0x0282, B:100:0x028f, B:106:0x02a0, B:109:0x02a8, B:110:0x02bc, B:112:0x02c2, B:113:0x02d1, B:114:0x02e7, B:116:0x02ed, B:117:0x02fb, B:120:0x032c, B:124:0x037d, B:128:0x03c4, B:131:0x06b9, B:135:0x06ca, B:139:0x06f7, B:141:0x09f9, B:142:0x09fb, B:144:0x0a05, B:145:0x0a07, B:147:0x0a11, B:148:0x0a13, B:156:0x0acb, B:160:0x0b3b, B:164:0x0ca9, B:167:0x0d14, B:171:0x0e50, B:173:0x0e70, B:175:0x0e76, B:176:0x0e7f, B:178:0x0e86, B:179:0x0e8b, B:181:0x0e95, B:182:0x0e9e, B:184:0x0ea6, B:186:0x0eaa, B:188:0x0eae, B:198:0x0f26, B:200:0x0f2b, B:208:0x0f5e, B:210:0x0f63, B:212:0x0f7f, B:213:0x0f87, B:215:0x0f8d, B:216:0x0fa1, B:217:0x0faa, B:219:0x0fb9, B:221:0x0fc1, B:223:0x0fd0, B:224:0x0fdb, B:226:0x0fe3, B:227:0x0fee, B:229:0x0ff6, B:230:0x1001, B:232:0x1009, B:233:0x1014, B:235:0x101c, B:236:0x1027, B:238:0x102f, B:239:0x103a, B:241:0x1042, B:242:0x104d, B:244:0x1055, B:245:0x1060, B:247:0x1066, B:248:0x106d, B:250:0x1075, B:251:0x1080, B:253:0x1086, B:254:0x108d, B:256:0x1095, B:257:0x10a0, B:259:0x10a8, B:260:0x10b3, B:262:0x10bb, B:263:0x10c6, B:265:0x10ce, B:266:0x10d9, B:268:0x10e1, B:269:0x10ec, B:271:0x10f2, B:272:0x10f9, B:274:0x1101, B:275:0x110c, B:277:0x1114, B:278:0x111f, B:280:0x1127, B:281:0x1132, B:283:0x1138, B:284:0x113f, B:286:0x1149, B:288:0x114f, B:290:0x115c, B:291:0x1167, B:293:0x116f, B:294:0x117a, B:296:0x1182, B:297:0x118d, B:299:0x1195, B:300:0x11a0, B:302:0x11a8, B:303:0x11b3, B:305:0x11bb, B:306:0x11c6, B:308:0x11ce, B:309:0x11d9, B:311:0x11e1, B:312:0x11ec, B:314:0x11f4, B:315:0x11ff, B:317:0x1207, B:318:0x1212, B:320:0x121a, B:321:0x1225, B:323:0x122d, B:324:0x1238, B:326:0x1240, B:327:0x124b, B:329:0x1253, B:330:0x125e, B:332:0x1266, B:333:0x1271, B:335:0x1279, B:336:0x1284, B:338:0x128c, B:339:0x1297, B:341:0x129f, B:342:0x12aa, B:344:0x12b2, B:345:0x12bd, B:347:0x12c5, B:348:0x12d0, B:350:0x12d8, B:351:0x12e3, B:353:0x12eb, B:354:0x12f6, B:356:0x12fe, B:357:0x1309, B:359:0x1311, B:360:0x131c, B:362:0x1324, B:363:0x132f, B:365:0x1337, B:366:0x1342, B:368:0x134a, B:369:0x1355, B:371:0x135d, B:372:0x1368, B:374:0x1370, B:375:0x137b, B:377:0x137f, B:379:0x1383, B:381:0x138d, B:382:0x1392, B:384:0x1399, B:385:0x139c, B:387:0x13b3, B:388:0x13bb, B:394:0x13d9, B:399:0x13f4, B:401:0x13fb, B:402:0x1400, B:404:0x1404, B:405:0x143f, B:407:0x1445, B:408:0x144a, B:410:0x144f, B:411:0x1454, B:413:0x1458, B:414:0x1463, B:416:0x1467, B:417:0x147c, B:419:0x1495, B:420:0x149e, B:422:0x14a2, B:423:0x14b5, B:425:0x14b9, B:426:0x14d5, B:428:0x14d9, B:429:0x14de, B:431:0x14e2, B:432:0x14e7, B:434:0x14eb, B:435:0x14f1, B:437:0x14f5, B:438:0x1505, B:440:0x1518, B:441:0x151f, B:443:0x1529, B:446:0x153a, B:448:0x153f, B:449:0x155e, B:451:0x1566, B:452:0x158a, B:454:0x1591, B:455:0x1598, B:457:0x159d, B:459:0x15a8, B:465:0x15c2, B:467:0x15ca, B:469:0x15d4, B:470:0x15d6, B:481:0x1678, B:471:0x15d9, B:473:0x1643, B:475:0x1647, B:477:0x164f, B:478:0x1664, B:480:0x166a, B:482:0x167f, B:483:0x1684, B:485:0x1688, B:487:0x168c, B:488:0x168f, B:490:0x1695, B:491:0x169a, B:445:0x1533, B:462:0x15af, B:463:0x15b6, B:391:0x13cf, B:202:0x0f31, B:204:0x0f3c, B:205:0x0f44, B:207:0x0f4a, B:190:0x0eb2, B:191:0x0eec, B:193:0x0ef2, B:194:0x0f00, B:195:0x0f12, B:197:0x0f18, B:168:0x0e42, B:159:0x0b31, B:60:0x01a6, B:28:0x00c3, B:30:0x00cd, B:32:0x00d7, B:34:0x00e5, B:36:0x00f0, B:35:0x00ec), top: B:496:0x00ad }] */
    /* JADX WARN: Removed duplicated region for block: B:335:0x1279 A[Catch: JSONException -> 0x169e, TryCatch #0 {JSONException -> 0x169e, blocks: (B:23:0x00ad, B:25:0x00b1, B:27:0x00bc, B:29:0x00c7, B:38:0x00fc, B:40:0x0104, B:42:0x0108, B:43:0x0116, B:45:0x011e, B:46:0x012a, B:48:0x0130, B:50:0x0146, B:51:0x0158, B:53:0x015c, B:55:0x0164, B:56:0x0176, B:58:0x0195, B:63:0x01b2, B:65:0x01c5, B:66:0x01ca, B:68:0x01d2, B:69:0x01d6, B:71:0x01dc, B:72:0x01ea, B:74:0x01fb, B:76:0x020b, B:80:0x024d, B:82:0x0251, B:93:0x026e, B:95:0x0273, B:97:0x0277, B:99:0x0282, B:100:0x028f, B:106:0x02a0, B:109:0x02a8, B:110:0x02bc, B:112:0x02c2, B:113:0x02d1, B:114:0x02e7, B:116:0x02ed, B:117:0x02fb, B:120:0x032c, B:124:0x037d, B:128:0x03c4, B:131:0x06b9, B:135:0x06ca, B:139:0x06f7, B:141:0x09f9, B:142:0x09fb, B:144:0x0a05, B:145:0x0a07, B:147:0x0a11, B:148:0x0a13, B:156:0x0acb, B:160:0x0b3b, B:164:0x0ca9, B:167:0x0d14, B:171:0x0e50, B:173:0x0e70, B:175:0x0e76, B:176:0x0e7f, B:178:0x0e86, B:179:0x0e8b, B:181:0x0e95, B:182:0x0e9e, B:184:0x0ea6, B:186:0x0eaa, B:188:0x0eae, B:198:0x0f26, B:200:0x0f2b, B:208:0x0f5e, B:210:0x0f63, B:212:0x0f7f, B:213:0x0f87, B:215:0x0f8d, B:216:0x0fa1, B:217:0x0faa, B:219:0x0fb9, B:221:0x0fc1, B:223:0x0fd0, B:224:0x0fdb, B:226:0x0fe3, B:227:0x0fee, B:229:0x0ff6, B:230:0x1001, B:232:0x1009, B:233:0x1014, B:235:0x101c, B:236:0x1027, B:238:0x102f, B:239:0x103a, B:241:0x1042, B:242:0x104d, B:244:0x1055, B:245:0x1060, B:247:0x1066, B:248:0x106d, B:250:0x1075, B:251:0x1080, B:253:0x1086, B:254:0x108d, B:256:0x1095, B:257:0x10a0, B:259:0x10a8, B:260:0x10b3, B:262:0x10bb, B:263:0x10c6, B:265:0x10ce, B:266:0x10d9, B:268:0x10e1, B:269:0x10ec, B:271:0x10f2, B:272:0x10f9, B:274:0x1101, B:275:0x110c, B:277:0x1114, B:278:0x111f, B:280:0x1127, B:281:0x1132, B:283:0x1138, B:284:0x113f, B:286:0x1149, B:288:0x114f, B:290:0x115c, B:291:0x1167, B:293:0x116f, B:294:0x117a, B:296:0x1182, B:297:0x118d, B:299:0x1195, B:300:0x11a0, B:302:0x11a8, B:303:0x11b3, B:305:0x11bb, B:306:0x11c6, B:308:0x11ce, B:309:0x11d9, B:311:0x11e1, B:312:0x11ec, B:314:0x11f4, B:315:0x11ff, B:317:0x1207, B:318:0x1212, B:320:0x121a, B:321:0x1225, B:323:0x122d, B:324:0x1238, B:326:0x1240, B:327:0x124b, B:329:0x1253, B:330:0x125e, B:332:0x1266, B:333:0x1271, B:335:0x1279, B:336:0x1284, B:338:0x128c, B:339:0x1297, B:341:0x129f, B:342:0x12aa, B:344:0x12b2, B:345:0x12bd, B:347:0x12c5, B:348:0x12d0, B:350:0x12d8, B:351:0x12e3, B:353:0x12eb, B:354:0x12f6, B:356:0x12fe, B:357:0x1309, B:359:0x1311, B:360:0x131c, B:362:0x1324, B:363:0x132f, B:365:0x1337, B:366:0x1342, B:368:0x134a, B:369:0x1355, B:371:0x135d, B:372:0x1368, B:374:0x1370, B:375:0x137b, B:377:0x137f, B:379:0x1383, B:381:0x138d, B:382:0x1392, B:384:0x1399, B:385:0x139c, B:387:0x13b3, B:388:0x13bb, B:394:0x13d9, B:399:0x13f4, B:401:0x13fb, B:402:0x1400, B:404:0x1404, B:405:0x143f, B:407:0x1445, B:408:0x144a, B:410:0x144f, B:411:0x1454, B:413:0x1458, B:414:0x1463, B:416:0x1467, B:417:0x147c, B:419:0x1495, B:420:0x149e, B:422:0x14a2, B:423:0x14b5, B:425:0x14b9, B:426:0x14d5, B:428:0x14d9, B:429:0x14de, B:431:0x14e2, B:432:0x14e7, B:434:0x14eb, B:435:0x14f1, B:437:0x14f5, B:438:0x1505, B:440:0x1518, B:441:0x151f, B:443:0x1529, B:446:0x153a, B:448:0x153f, B:449:0x155e, B:451:0x1566, B:452:0x158a, B:454:0x1591, B:455:0x1598, B:457:0x159d, B:459:0x15a8, B:465:0x15c2, B:467:0x15ca, B:469:0x15d4, B:470:0x15d6, B:481:0x1678, B:471:0x15d9, B:473:0x1643, B:475:0x1647, B:477:0x164f, B:478:0x1664, B:480:0x166a, B:482:0x167f, B:483:0x1684, B:485:0x1688, B:487:0x168c, B:488:0x168f, B:490:0x1695, B:491:0x169a, B:445:0x1533, B:462:0x15af, B:463:0x15b6, B:391:0x13cf, B:202:0x0f31, B:204:0x0f3c, B:205:0x0f44, B:207:0x0f4a, B:190:0x0eb2, B:191:0x0eec, B:193:0x0ef2, B:194:0x0f00, B:195:0x0f12, B:197:0x0f18, B:168:0x0e42, B:159:0x0b31, B:60:0x01a6, B:28:0x00c3, B:30:0x00cd, B:32:0x00d7, B:34:0x00e5, B:36:0x00f0, B:35:0x00ec), top: B:496:0x00ad }] */
    /* JADX WARN: Removed duplicated region for block: B:338:0x128c A[Catch: JSONException -> 0x169e, TryCatch #0 {JSONException -> 0x169e, blocks: (B:23:0x00ad, B:25:0x00b1, B:27:0x00bc, B:29:0x00c7, B:38:0x00fc, B:40:0x0104, B:42:0x0108, B:43:0x0116, B:45:0x011e, B:46:0x012a, B:48:0x0130, B:50:0x0146, B:51:0x0158, B:53:0x015c, B:55:0x0164, B:56:0x0176, B:58:0x0195, B:63:0x01b2, B:65:0x01c5, B:66:0x01ca, B:68:0x01d2, B:69:0x01d6, B:71:0x01dc, B:72:0x01ea, B:74:0x01fb, B:76:0x020b, B:80:0x024d, B:82:0x0251, B:93:0x026e, B:95:0x0273, B:97:0x0277, B:99:0x0282, B:100:0x028f, B:106:0x02a0, B:109:0x02a8, B:110:0x02bc, B:112:0x02c2, B:113:0x02d1, B:114:0x02e7, B:116:0x02ed, B:117:0x02fb, B:120:0x032c, B:124:0x037d, B:128:0x03c4, B:131:0x06b9, B:135:0x06ca, B:139:0x06f7, B:141:0x09f9, B:142:0x09fb, B:144:0x0a05, B:145:0x0a07, B:147:0x0a11, B:148:0x0a13, B:156:0x0acb, B:160:0x0b3b, B:164:0x0ca9, B:167:0x0d14, B:171:0x0e50, B:173:0x0e70, B:175:0x0e76, B:176:0x0e7f, B:178:0x0e86, B:179:0x0e8b, B:181:0x0e95, B:182:0x0e9e, B:184:0x0ea6, B:186:0x0eaa, B:188:0x0eae, B:198:0x0f26, B:200:0x0f2b, B:208:0x0f5e, B:210:0x0f63, B:212:0x0f7f, B:213:0x0f87, B:215:0x0f8d, B:216:0x0fa1, B:217:0x0faa, B:219:0x0fb9, B:221:0x0fc1, B:223:0x0fd0, B:224:0x0fdb, B:226:0x0fe3, B:227:0x0fee, B:229:0x0ff6, B:230:0x1001, B:232:0x1009, B:233:0x1014, B:235:0x101c, B:236:0x1027, B:238:0x102f, B:239:0x103a, B:241:0x1042, B:242:0x104d, B:244:0x1055, B:245:0x1060, B:247:0x1066, B:248:0x106d, B:250:0x1075, B:251:0x1080, B:253:0x1086, B:254:0x108d, B:256:0x1095, B:257:0x10a0, B:259:0x10a8, B:260:0x10b3, B:262:0x10bb, B:263:0x10c6, B:265:0x10ce, B:266:0x10d9, B:268:0x10e1, B:269:0x10ec, B:271:0x10f2, B:272:0x10f9, B:274:0x1101, B:275:0x110c, B:277:0x1114, B:278:0x111f, B:280:0x1127, B:281:0x1132, B:283:0x1138, B:284:0x113f, B:286:0x1149, B:288:0x114f, B:290:0x115c, B:291:0x1167, B:293:0x116f, B:294:0x117a, B:296:0x1182, B:297:0x118d, B:299:0x1195, B:300:0x11a0, B:302:0x11a8, B:303:0x11b3, B:305:0x11bb, B:306:0x11c6, B:308:0x11ce, B:309:0x11d9, B:311:0x11e1, B:312:0x11ec, B:314:0x11f4, B:315:0x11ff, B:317:0x1207, B:318:0x1212, B:320:0x121a, B:321:0x1225, B:323:0x122d, B:324:0x1238, B:326:0x1240, B:327:0x124b, B:329:0x1253, B:330:0x125e, B:332:0x1266, B:333:0x1271, B:335:0x1279, B:336:0x1284, B:338:0x128c, B:339:0x1297, B:341:0x129f, B:342:0x12aa, B:344:0x12b2, B:345:0x12bd, B:347:0x12c5, B:348:0x12d0, B:350:0x12d8, B:351:0x12e3, B:353:0x12eb, B:354:0x12f6, B:356:0x12fe, B:357:0x1309, B:359:0x1311, B:360:0x131c, B:362:0x1324, B:363:0x132f, B:365:0x1337, B:366:0x1342, B:368:0x134a, B:369:0x1355, B:371:0x135d, B:372:0x1368, B:374:0x1370, B:375:0x137b, B:377:0x137f, B:379:0x1383, B:381:0x138d, B:382:0x1392, B:384:0x1399, B:385:0x139c, B:387:0x13b3, B:388:0x13bb, B:394:0x13d9, B:399:0x13f4, B:401:0x13fb, B:402:0x1400, B:404:0x1404, B:405:0x143f, B:407:0x1445, B:408:0x144a, B:410:0x144f, B:411:0x1454, B:413:0x1458, B:414:0x1463, B:416:0x1467, B:417:0x147c, B:419:0x1495, B:420:0x149e, B:422:0x14a2, B:423:0x14b5, B:425:0x14b9, B:426:0x14d5, B:428:0x14d9, B:429:0x14de, B:431:0x14e2, B:432:0x14e7, B:434:0x14eb, B:435:0x14f1, B:437:0x14f5, B:438:0x1505, B:440:0x1518, B:441:0x151f, B:443:0x1529, B:446:0x153a, B:448:0x153f, B:449:0x155e, B:451:0x1566, B:452:0x158a, B:454:0x1591, B:455:0x1598, B:457:0x159d, B:459:0x15a8, B:465:0x15c2, B:467:0x15ca, B:469:0x15d4, B:470:0x15d6, B:481:0x1678, B:471:0x15d9, B:473:0x1643, B:475:0x1647, B:477:0x164f, B:478:0x1664, B:480:0x166a, B:482:0x167f, B:483:0x1684, B:485:0x1688, B:487:0x168c, B:488:0x168f, B:490:0x1695, B:491:0x169a, B:445:0x1533, B:462:0x15af, B:463:0x15b6, B:391:0x13cf, B:202:0x0f31, B:204:0x0f3c, B:205:0x0f44, B:207:0x0f4a, B:190:0x0eb2, B:191:0x0eec, B:193:0x0ef2, B:194:0x0f00, B:195:0x0f12, B:197:0x0f18, B:168:0x0e42, B:159:0x0b31, B:60:0x01a6, B:28:0x00c3, B:30:0x00cd, B:32:0x00d7, B:34:0x00e5, B:36:0x00f0, B:35:0x00ec), top: B:496:0x00ad }] */
    /* JADX WARN: Removed duplicated region for block: B:341:0x129f A[Catch: JSONException -> 0x169e, TryCatch #0 {JSONException -> 0x169e, blocks: (B:23:0x00ad, B:25:0x00b1, B:27:0x00bc, B:29:0x00c7, B:38:0x00fc, B:40:0x0104, B:42:0x0108, B:43:0x0116, B:45:0x011e, B:46:0x012a, B:48:0x0130, B:50:0x0146, B:51:0x0158, B:53:0x015c, B:55:0x0164, B:56:0x0176, B:58:0x0195, B:63:0x01b2, B:65:0x01c5, B:66:0x01ca, B:68:0x01d2, B:69:0x01d6, B:71:0x01dc, B:72:0x01ea, B:74:0x01fb, B:76:0x020b, B:80:0x024d, B:82:0x0251, B:93:0x026e, B:95:0x0273, B:97:0x0277, B:99:0x0282, B:100:0x028f, B:106:0x02a0, B:109:0x02a8, B:110:0x02bc, B:112:0x02c2, B:113:0x02d1, B:114:0x02e7, B:116:0x02ed, B:117:0x02fb, B:120:0x032c, B:124:0x037d, B:128:0x03c4, B:131:0x06b9, B:135:0x06ca, B:139:0x06f7, B:141:0x09f9, B:142:0x09fb, B:144:0x0a05, B:145:0x0a07, B:147:0x0a11, B:148:0x0a13, B:156:0x0acb, B:160:0x0b3b, B:164:0x0ca9, B:167:0x0d14, B:171:0x0e50, B:173:0x0e70, B:175:0x0e76, B:176:0x0e7f, B:178:0x0e86, B:179:0x0e8b, B:181:0x0e95, B:182:0x0e9e, B:184:0x0ea6, B:186:0x0eaa, B:188:0x0eae, B:198:0x0f26, B:200:0x0f2b, B:208:0x0f5e, B:210:0x0f63, B:212:0x0f7f, B:213:0x0f87, B:215:0x0f8d, B:216:0x0fa1, B:217:0x0faa, B:219:0x0fb9, B:221:0x0fc1, B:223:0x0fd0, B:224:0x0fdb, B:226:0x0fe3, B:227:0x0fee, B:229:0x0ff6, B:230:0x1001, B:232:0x1009, B:233:0x1014, B:235:0x101c, B:236:0x1027, B:238:0x102f, B:239:0x103a, B:241:0x1042, B:242:0x104d, B:244:0x1055, B:245:0x1060, B:247:0x1066, B:248:0x106d, B:250:0x1075, B:251:0x1080, B:253:0x1086, B:254:0x108d, B:256:0x1095, B:257:0x10a0, B:259:0x10a8, B:260:0x10b3, B:262:0x10bb, B:263:0x10c6, B:265:0x10ce, B:266:0x10d9, B:268:0x10e1, B:269:0x10ec, B:271:0x10f2, B:272:0x10f9, B:274:0x1101, B:275:0x110c, B:277:0x1114, B:278:0x111f, B:280:0x1127, B:281:0x1132, B:283:0x1138, B:284:0x113f, B:286:0x1149, B:288:0x114f, B:290:0x115c, B:291:0x1167, B:293:0x116f, B:294:0x117a, B:296:0x1182, B:297:0x118d, B:299:0x1195, B:300:0x11a0, B:302:0x11a8, B:303:0x11b3, B:305:0x11bb, B:306:0x11c6, B:308:0x11ce, B:309:0x11d9, B:311:0x11e1, B:312:0x11ec, B:314:0x11f4, B:315:0x11ff, B:317:0x1207, B:318:0x1212, B:320:0x121a, B:321:0x1225, B:323:0x122d, B:324:0x1238, B:326:0x1240, B:327:0x124b, B:329:0x1253, B:330:0x125e, B:332:0x1266, B:333:0x1271, B:335:0x1279, B:336:0x1284, B:338:0x128c, B:339:0x1297, B:341:0x129f, B:342:0x12aa, B:344:0x12b2, B:345:0x12bd, B:347:0x12c5, B:348:0x12d0, B:350:0x12d8, B:351:0x12e3, B:353:0x12eb, B:354:0x12f6, B:356:0x12fe, B:357:0x1309, B:359:0x1311, B:360:0x131c, B:362:0x1324, B:363:0x132f, B:365:0x1337, B:366:0x1342, B:368:0x134a, B:369:0x1355, B:371:0x135d, B:372:0x1368, B:374:0x1370, B:375:0x137b, B:377:0x137f, B:379:0x1383, B:381:0x138d, B:382:0x1392, B:384:0x1399, B:385:0x139c, B:387:0x13b3, B:388:0x13bb, B:394:0x13d9, B:399:0x13f4, B:401:0x13fb, B:402:0x1400, B:404:0x1404, B:405:0x143f, B:407:0x1445, B:408:0x144a, B:410:0x144f, B:411:0x1454, B:413:0x1458, B:414:0x1463, B:416:0x1467, B:417:0x147c, B:419:0x1495, B:420:0x149e, B:422:0x14a2, B:423:0x14b5, B:425:0x14b9, B:426:0x14d5, B:428:0x14d9, B:429:0x14de, B:431:0x14e2, B:432:0x14e7, B:434:0x14eb, B:435:0x14f1, B:437:0x14f5, B:438:0x1505, B:440:0x1518, B:441:0x151f, B:443:0x1529, B:446:0x153a, B:448:0x153f, B:449:0x155e, B:451:0x1566, B:452:0x158a, B:454:0x1591, B:455:0x1598, B:457:0x159d, B:459:0x15a8, B:465:0x15c2, B:467:0x15ca, B:469:0x15d4, B:470:0x15d6, B:481:0x1678, B:471:0x15d9, B:473:0x1643, B:475:0x1647, B:477:0x164f, B:478:0x1664, B:480:0x166a, B:482:0x167f, B:483:0x1684, B:485:0x1688, B:487:0x168c, B:488:0x168f, B:490:0x1695, B:491:0x169a, B:445:0x1533, B:462:0x15af, B:463:0x15b6, B:391:0x13cf, B:202:0x0f31, B:204:0x0f3c, B:205:0x0f44, B:207:0x0f4a, B:190:0x0eb2, B:191:0x0eec, B:193:0x0ef2, B:194:0x0f00, B:195:0x0f12, B:197:0x0f18, B:168:0x0e42, B:159:0x0b31, B:60:0x01a6, B:28:0x00c3, B:30:0x00cd, B:32:0x00d7, B:34:0x00e5, B:36:0x00f0, B:35:0x00ec), top: B:496:0x00ad }] */
    /* JADX WARN: Removed duplicated region for block: B:344:0x12b2 A[Catch: JSONException -> 0x169e, TryCatch #0 {JSONException -> 0x169e, blocks: (B:23:0x00ad, B:25:0x00b1, B:27:0x00bc, B:29:0x00c7, B:38:0x00fc, B:40:0x0104, B:42:0x0108, B:43:0x0116, B:45:0x011e, B:46:0x012a, B:48:0x0130, B:50:0x0146, B:51:0x0158, B:53:0x015c, B:55:0x0164, B:56:0x0176, B:58:0x0195, B:63:0x01b2, B:65:0x01c5, B:66:0x01ca, B:68:0x01d2, B:69:0x01d6, B:71:0x01dc, B:72:0x01ea, B:74:0x01fb, B:76:0x020b, B:80:0x024d, B:82:0x0251, B:93:0x026e, B:95:0x0273, B:97:0x0277, B:99:0x0282, B:100:0x028f, B:106:0x02a0, B:109:0x02a8, B:110:0x02bc, B:112:0x02c2, B:113:0x02d1, B:114:0x02e7, B:116:0x02ed, B:117:0x02fb, B:120:0x032c, B:124:0x037d, B:128:0x03c4, B:131:0x06b9, B:135:0x06ca, B:139:0x06f7, B:141:0x09f9, B:142:0x09fb, B:144:0x0a05, B:145:0x0a07, B:147:0x0a11, B:148:0x0a13, B:156:0x0acb, B:160:0x0b3b, B:164:0x0ca9, B:167:0x0d14, B:171:0x0e50, B:173:0x0e70, B:175:0x0e76, B:176:0x0e7f, B:178:0x0e86, B:179:0x0e8b, B:181:0x0e95, B:182:0x0e9e, B:184:0x0ea6, B:186:0x0eaa, B:188:0x0eae, B:198:0x0f26, B:200:0x0f2b, B:208:0x0f5e, B:210:0x0f63, B:212:0x0f7f, B:213:0x0f87, B:215:0x0f8d, B:216:0x0fa1, B:217:0x0faa, B:219:0x0fb9, B:221:0x0fc1, B:223:0x0fd0, B:224:0x0fdb, B:226:0x0fe3, B:227:0x0fee, B:229:0x0ff6, B:230:0x1001, B:232:0x1009, B:233:0x1014, B:235:0x101c, B:236:0x1027, B:238:0x102f, B:239:0x103a, B:241:0x1042, B:242:0x104d, B:244:0x1055, B:245:0x1060, B:247:0x1066, B:248:0x106d, B:250:0x1075, B:251:0x1080, B:253:0x1086, B:254:0x108d, B:256:0x1095, B:257:0x10a0, B:259:0x10a8, B:260:0x10b3, B:262:0x10bb, B:263:0x10c6, B:265:0x10ce, B:266:0x10d9, B:268:0x10e1, B:269:0x10ec, B:271:0x10f2, B:272:0x10f9, B:274:0x1101, B:275:0x110c, B:277:0x1114, B:278:0x111f, B:280:0x1127, B:281:0x1132, B:283:0x1138, B:284:0x113f, B:286:0x1149, B:288:0x114f, B:290:0x115c, B:291:0x1167, B:293:0x116f, B:294:0x117a, B:296:0x1182, B:297:0x118d, B:299:0x1195, B:300:0x11a0, B:302:0x11a8, B:303:0x11b3, B:305:0x11bb, B:306:0x11c6, B:308:0x11ce, B:309:0x11d9, B:311:0x11e1, B:312:0x11ec, B:314:0x11f4, B:315:0x11ff, B:317:0x1207, B:318:0x1212, B:320:0x121a, B:321:0x1225, B:323:0x122d, B:324:0x1238, B:326:0x1240, B:327:0x124b, B:329:0x1253, B:330:0x125e, B:332:0x1266, B:333:0x1271, B:335:0x1279, B:336:0x1284, B:338:0x128c, B:339:0x1297, B:341:0x129f, B:342:0x12aa, B:344:0x12b2, B:345:0x12bd, B:347:0x12c5, B:348:0x12d0, B:350:0x12d8, B:351:0x12e3, B:353:0x12eb, B:354:0x12f6, B:356:0x12fe, B:357:0x1309, B:359:0x1311, B:360:0x131c, B:362:0x1324, B:363:0x132f, B:365:0x1337, B:366:0x1342, B:368:0x134a, B:369:0x1355, B:371:0x135d, B:372:0x1368, B:374:0x1370, B:375:0x137b, B:377:0x137f, B:379:0x1383, B:381:0x138d, B:382:0x1392, B:384:0x1399, B:385:0x139c, B:387:0x13b3, B:388:0x13bb, B:394:0x13d9, B:399:0x13f4, B:401:0x13fb, B:402:0x1400, B:404:0x1404, B:405:0x143f, B:407:0x1445, B:408:0x144a, B:410:0x144f, B:411:0x1454, B:413:0x1458, B:414:0x1463, B:416:0x1467, B:417:0x147c, B:419:0x1495, B:420:0x149e, B:422:0x14a2, B:423:0x14b5, B:425:0x14b9, B:426:0x14d5, B:428:0x14d9, B:429:0x14de, B:431:0x14e2, B:432:0x14e7, B:434:0x14eb, B:435:0x14f1, B:437:0x14f5, B:438:0x1505, B:440:0x1518, B:441:0x151f, B:443:0x1529, B:446:0x153a, B:448:0x153f, B:449:0x155e, B:451:0x1566, B:452:0x158a, B:454:0x1591, B:455:0x1598, B:457:0x159d, B:459:0x15a8, B:465:0x15c2, B:467:0x15ca, B:469:0x15d4, B:470:0x15d6, B:481:0x1678, B:471:0x15d9, B:473:0x1643, B:475:0x1647, B:477:0x164f, B:478:0x1664, B:480:0x166a, B:482:0x167f, B:483:0x1684, B:485:0x1688, B:487:0x168c, B:488:0x168f, B:490:0x1695, B:491:0x169a, B:445:0x1533, B:462:0x15af, B:463:0x15b6, B:391:0x13cf, B:202:0x0f31, B:204:0x0f3c, B:205:0x0f44, B:207:0x0f4a, B:190:0x0eb2, B:191:0x0eec, B:193:0x0ef2, B:194:0x0f00, B:195:0x0f12, B:197:0x0f18, B:168:0x0e42, B:159:0x0b31, B:60:0x01a6, B:28:0x00c3, B:30:0x00cd, B:32:0x00d7, B:34:0x00e5, B:36:0x00f0, B:35:0x00ec), top: B:496:0x00ad }] */
    /* JADX WARN: Removed duplicated region for block: B:347:0x12c5 A[Catch: JSONException -> 0x169e, TryCatch #0 {JSONException -> 0x169e, blocks: (B:23:0x00ad, B:25:0x00b1, B:27:0x00bc, B:29:0x00c7, B:38:0x00fc, B:40:0x0104, B:42:0x0108, B:43:0x0116, B:45:0x011e, B:46:0x012a, B:48:0x0130, B:50:0x0146, B:51:0x0158, B:53:0x015c, B:55:0x0164, B:56:0x0176, B:58:0x0195, B:63:0x01b2, B:65:0x01c5, B:66:0x01ca, B:68:0x01d2, B:69:0x01d6, B:71:0x01dc, B:72:0x01ea, B:74:0x01fb, B:76:0x020b, B:80:0x024d, B:82:0x0251, B:93:0x026e, B:95:0x0273, B:97:0x0277, B:99:0x0282, B:100:0x028f, B:106:0x02a0, B:109:0x02a8, B:110:0x02bc, B:112:0x02c2, B:113:0x02d1, B:114:0x02e7, B:116:0x02ed, B:117:0x02fb, B:120:0x032c, B:124:0x037d, B:128:0x03c4, B:131:0x06b9, B:135:0x06ca, B:139:0x06f7, B:141:0x09f9, B:142:0x09fb, B:144:0x0a05, B:145:0x0a07, B:147:0x0a11, B:148:0x0a13, B:156:0x0acb, B:160:0x0b3b, B:164:0x0ca9, B:167:0x0d14, B:171:0x0e50, B:173:0x0e70, B:175:0x0e76, B:176:0x0e7f, B:178:0x0e86, B:179:0x0e8b, B:181:0x0e95, B:182:0x0e9e, B:184:0x0ea6, B:186:0x0eaa, B:188:0x0eae, B:198:0x0f26, B:200:0x0f2b, B:208:0x0f5e, B:210:0x0f63, B:212:0x0f7f, B:213:0x0f87, B:215:0x0f8d, B:216:0x0fa1, B:217:0x0faa, B:219:0x0fb9, B:221:0x0fc1, B:223:0x0fd0, B:224:0x0fdb, B:226:0x0fe3, B:227:0x0fee, B:229:0x0ff6, B:230:0x1001, B:232:0x1009, B:233:0x1014, B:235:0x101c, B:236:0x1027, B:238:0x102f, B:239:0x103a, B:241:0x1042, B:242:0x104d, B:244:0x1055, B:245:0x1060, B:247:0x1066, B:248:0x106d, B:250:0x1075, B:251:0x1080, B:253:0x1086, B:254:0x108d, B:256:0x1095, B:257:0x10a0, B:259:0x10a8, B:260:0x10b3, B:262:0x10bb, B:263:0x10c6, B:265:0x10ce, B:266:0x10d9, B:268:0x10e1, B:269:0x10ec, B:271:0x10f2, B:272:0x10f9, B:274:0x1101, B:275:0x110c, B:277:0x1114, B:278:0x111f, B:280:0x1127, B:281:0x1132, B:283:0x1138, B:284:0x113f, B:286:0x1149, B:288:0x114f, B:290:0x115c, B:291:0x1167, B:293:0x116f, B:294:0x117a, B:296:0x1182, B:297:0x118d, B:299:0x1195, B:300:0x11a0, B:302:0x11a8, B:303:0x11b3, B:305:0x11bb, B:306:0x11c6, B:308:0x11ce, B:309:0x11d9, B:311:0x11e1, B:312:0x11ec, B:314:0x11f4, B:315:0x11ff, B:317:0x1207, B:318:0x1212, B:320:0x121a, B:321:0x1225, B:323:0x122d, B:324:0x1238, B:326:0x1240, B:327:0x124b, B:329:0x1253, B:330:0x125e, B:332:0x1266, B:333:0x1271, B:335:0x1279, B:336:0x1284, B:338:0x128c, B:339:0x1297, B:341:0x129f, B:342:0x12aa, B:344:0x12b2, B:345:0x12bd, B:347:0x12c5, B:348:0x12d0, B:350:0x12d8, B:351:0x12e3, B:353:0x12eb, B:354:0x12f6, B:356:0x12fe, B:357:0x1309, B:359:0x1311, B:360:0x131c, B:362:0x1324, B:363:0x132f, B:365:0x1337, B:366:0x1342, B:368:0x134a, B:369:0x1355, B:371:0x135d, B:372:0x1368, B:374:0x1370, B:375:0x137b, B:377:0x137f, B:379:0x1383, B:381:0x138d, B:382:0x1392, B:384:0x1399, B:385:0x139c, B:387:0x13b3, B:388:0x13bb, B:394:0x13d9, B:399:0x13f4, B:401:0x13fb, B:402:0x1400, B:404:0x1404, B:405:0x143f, B:407:0x1445, B:408:0x144a, B:410:0x144f, B:411:0x1454, B:413:0x1458, B:414:0x1463, B:416:0x1467, B:417:0x147c, B:419:0x1495, B:420:0x149e, B:422:0x14a2, B:423:0x14b5, B:425:0x14b9, B:426:0x14d5, B:428:0x14d9, B:429:0x14de, B:431:0x14e2, B:432:0x14e7, B:434:0x14eb, B:435:0x14f1, B:437:0x14f5, B:438:0x1505, B:440:0x1518, B:441:0x151f, B:443:0x1529, B:446:0x153a, B:448:0x153f, B:449:0x155e, B:451:0x1566, B:452:0x158a, B:454:0x1591, B:455:0x1598, B:457:0x159d, B:459:0x15a8, B:465:0x15c2, B:467:0x15ca, B:469:0x15d4, B:470:0x15d6, B:481:0x1678, B:471:0x15d9, B:473:0x1643, B:475:0x1647, B:477:0x164f, B:478:0x1664, B:480:0x166a, B:482:0x167f, B:483:0x1684, B:485:0x1688, B:487:0x168c, B:488:0x168f, B:490:0x1695, B:491:0x169a, B:445:0x1533, B:462:0x15af, B:463:0x15b6, B:391:0x13cf, B:202:0x0f31, B:204:0x0f3c, B:205:0x0f44, B:207:0x0f4a, B:190:0x0eb2, B:191:0x0eec, B:193:0x0ef2, B:194:0x0f00, B:195:0x0f12, B:197:0x0f18, B:168:0x0e42, B:159:0x0b31, B:60:0x01a6, B:28:0x00c3, B:30:0x00cd, B:32:0x00d7, B:34:0x00e5, B:36:0x00f0, B:35:0x00ec), top: B:496:0x00ad }] */
    /* JADX WARN: Removed duplicated region for block: B:350:0x12d8 A[Catch: JSONException -> 0x169e, TryCatch #0 {JSONException -> 0x169e, blocks: (B:23:0x00ad, B:25:0x00b1, B:27:0x00bc, B:29:0x00c7, B:38:0x00fc, B:40:0x0104, B:42:0x0108, B:43:0x0116, B:45:0x011e, B:46:0x012a, B:48:0x0130, B:50:0x0146, B:51:0x0158, B:53:0x015c, B:55:0x0164, B:56:0x0176, B:58:0x0195, B:63:0x01b2, B:65:0x01c5, B:66:0x01ca, B:68:0x01d2, B:69:0x01d6, B:71:0x01dc, B:72:0x01ea, B:74:0x01fb, B:76:0x020b, B:80:0x024d, B:82:0x0251, B:93:0x026e, B:95:0x0273, B:97:0x0277, B:99:0x0282, B:100:0x028f, B:106:0x02a0, B:109:0x02a8, B:110:0x02bc, B:112:0x02c2, B:113:0x02d1, B:114:0x02e7, B:116:0x02ed, B:117:0x02fb, B:120:0x032c, B:124:0x037d, B:128:0x03c4, B:131:0x06b9, B:135:0x06ca, B:139:0x06f7, B:141:0x09f9, B:142:0x09fb, B:144:0x0a05, B:145:0x0a07, B:147:0x0a11, B:148:0x0a13, B:156:0x0acb, B:160:0x0b3b, B:164:0x0ca9, B:167:0x0d14, B:171:0x0e50, B:173:0x0e70, B:175:0x0e76, B:176:0x0e7f, B:178:0x0e86, B:179:0x0e8b, B:181:0x0e95, B:182:0x0e9e, B:184:0x0ea6, B:186:0x0eaa, B:188:0x0eae, B:198:0x0f26, B:200:0x0f2b, B:208:0x0f5e, B:210:0x0f63, B:212:0x0f7f, B:213:0x0f87, B:215:0x0f8d, B:216:0x0fa1, B:217:0x0faa, B:219:0x0fb9, B:221:0x0fc1, B:223:0x0fd0, B:224:0x0fdb, B:226:0x0fe3, B:227:0x0fee, B:229:0x0ff6, B:230:0x1001, B:232:0x1009, B:233:0x1014, B:235:0x101c, B:236:0x1027, B:238:0x102f, B:239:0x103a, B:241:0x1042, B:242:0x104d, B:244:0x1055, B:245:0x1060, B:247:0x1066, B:248:0x106d, B:250:0x1075, B:251:0x1080, B:253:0x1086, B:254:0x108d, B:256:0x1095, B:257:0x10a0, B:259:0x10a8, B:260:0x10b3, B:262:0x10bb, B:263:0x10c6, B:265:0x10ce, B:266:0x10d9, B:268:0x10e1, B:269:0x10ec, B:271:0x10f2, B:272:0x10f9, B:274:0x1101, B:275:0x110c, B:277:0x1114, B:278:0x111f, B:280:0x1127, B:281:0x1132, B:283:0x1138, B:284:0x113f, B:286:0x1149, B:288:0x114f, B:290:0x115c, B:291:0x1167, B:293:0x116f, B:294:0x117a, B:296:0x1182, B:297:0x118d, B:299:0x1195, B:300:0x11a0, B:302:0x11a8, B:303:0x11b3, B:305:0x11bb, B:306:0x11c6, B:308:0x11ce, B:309:0x11d9, B:311:0x11e1, B:312:0x11ec, B:314:0x11f4, B:315:0x11ff, B:317:0x1207, B:318:0x1212, B:320:0x121a, B:321:0x1225, B:323:0x122d, B:324:0x1238, B:326:0x1240, B:327:0x124b, B:329:0x1253, B:330:0x125e, B:332:0x1266, B:333:0x1271, B:335:0x1279, B:336:0x1284, B:338:0x128c, B:339:0x1297, B:341:0x129f, B:342:0x12aa, B:344:0x12b2, B:345:0x12bd, B:347:0x12c5, B:348:0x12d0, B:350:0x12d8, B:351:0x12e3, B:353:0x12eb, B:354:0x12f6, B:356:0x12fe, B:357:0x1309, B:359:0x1311, B:360:0x131c, B:362:0x1324, B:363:0x132f, B:365:0x1337, B:366:0x1342, B:368:0x134a, B:369:0x1355, B:371:0x135d, B:372:0x1368, B:374:0x1370, B:375:0x137b, B:377:0x137f, B:379:0x1383, B:381:0x138d, B:382:0x1392, B:384:0x1399, B:385:0x139c, B:387:0x13b3, B:388:0x13bb, B:394:0x13d9, B:399:0x13f4, B:401:0x13fb, B:402:0x1400, B:404:0x1404, B:405:0x143f, B:407:0x1445, B:408:0x144a, B:410:0x144f, B:411:0x1454, B:413:0x1458, B:414:0x1463, B:416:0x1467, B:417:0x147c, B:419:0x1495, B:420:0x149e, B:422:0x14a2, B:423:0x14b5, B:425:0x14b9, B:426:0x14d5, B:428:0x14d9, B:429:0x14de, B:431:0x14e2, B:432:0x14e7, B:434:0x14eb, B:435:0x14f1, B:437:0x14f5, B:438:0x1505, B:440:0x1518, B:441:0x151f, B:443:0x1529, B:446:0x153a, B:448:0x153f, B:449:0x155e, B:451:0x1566, B:452:0x158a, B:454:0x1591, B:455:0x1598, B:457:0x159d, B:459:0x15a8, B:465:0x15c2, B:467:0x15ca, B:469:0x15d4, B:470:0x15d6, B:481:0x1678, B:471:0x15d9, B:473:0x1643, B:475:0x1647, B:477:0x164f, B:478:0x1664, B:480:0x166a, B:482:0x167f, B:483:0x1684, B:485:0x1688, B:487:0x168c, B:488:0x168f, B:490:0x1695, B:491:0x169a, B:445:0x1533, B:462:0x15af, B:463:0x15b6, B:391:0x13cf, B:202:0x0f31, B:204:0x0f3c, B:205:0x0f44, B:207:0x0f4a, B:190:0x0eb2, B:191:0x0eec, B:193:0x0ef2, B:194:0x0f00, B:195:0x0f12, B:197:0x0f18, B:168:0x0e42, B:159:0x0b31, B:60:0x01a6, B:28:0x00c3, B:30:0x00cd, B:32:0x00d7, B:34:0x00e5, B:36:0x00f0, B:35:0x00ec), top: B:496:0x00ad }] */
    /* JADX WARN: Removed duplicated region for block: B:353:0x12eb A[Catch: JSONException -> 0x169e, TryCatch #0 {JSONException -> 0x169e, blocks: (B:23:0x00ad, B:25:0x00b1, B:27:0x00bc, B:29:0x00c7, B:38:0x00fc, B:40:0x0104, B:42:0x0108, B:43:0x0116, B:45:0x011e, B:46:0x012a, B:48:0x0130, B:50:0x0146, B:51:0x0158, B:53:0x015c, B:55:0x0164, B:56:0x0176, B:58:0x0195, B:63:0x01b2, B:65:0x01c5, B:66:0x01ca, B:68:0x01d2, B:69:0x01d6, B:71:0x01dc, B:72:0x01ea, B:74:0x01fb, B:76:0x020b, B:80:0x024d, B:82:0x0251, B:93:0x026e, B:95:0x0273, B:97:0x0277, B:99:0x0282, B:100:0x028f, B:106:0x02a0, B:109:0x02a8, B:110:0x02bc, B:112:0x02c2, B:113:0x02d1, B:114:0x02e7, B:116:0x02ed, B:117:0x02fb, B:120:0x032c, B:124:0x037d, B:128:0x03c4, B:131:0x06b9, B:135:0x06ca, B:139:0x06f7, B:141:0x09f9, B:142:0x09fb, B:144:0x0a05, B:145:0x0a07, B:147:0x0a11, B:148:0x0a13, B:156:0x0acb, B:160:0x0b3b, B:164:0x0ca9, B:167:0x0d14, B:171:0x0e50, B:173:0x0e70, B:175:0x0e76, B:176:0x0e7f, B:178:0x0e86, B:179:0x0e8b, B:181:0x0e95, B:182:0x0e9e, B:184:0x0ea6, B:186:0x0eaa, B:188:0x0eae, B:198:0x0f26, B:200:0x0f2b, B:208:0x0f5e, B:210:0x0f63, B:212:0x0f7f, B:213:0x0f87, B:215:0x0f8d, B:216:0x0fa1, B:217:0x0faa, B:219:0x0fb9, B:221:0x0fc1, B:223:0x0fd0, B:224:0x0fdb, B:226:0x0fe3, B:227:0x0fee, B:229:0x0ff6, B:230:0x1001, B:232:0x1009, B:233:0x1014, B:235:0x101c, B:236:0x1027, B:238:0x102f, B:239:0x103a, B:241:0x1042, B:242:0x104d, B:244:0x1055, B:245:0x1060, B:247:0x1066, B:248:0x106d, B:250:0x1075, B:251:0x1080, B:253:0x1086, B:254:0x108d, B:256:0x1095, B:257:0x10a0, B:259:0x10a8, B:260:0x10b3, B:262:0x10bb, B:263:0x10c6, B:265:0x10ce, B:266:0x10d9, B:268:0x10e1, B:269:0x10ec, B:271:0x10f2, B:272:0x10f9, B:274:0x1101, B:275:0x110c, B:277:0x1114, B:278:0x111f, B:280:0x1127, B:281:0x1132, B:283:0x1138, B:284:0x113f, B:286:0x1149, B:288:0x114f, B:290:0x115c, B:291:0x1167, B:293:0x116f, B:294:0x117a, B:296:0x1182, B:297:0x118d, B:299:0x1195, B:300:0x11a0, B:302:0x11a8, B:303:0x11b3, B:305:0x11bb, B:306:0x11c6, B:308:0x11ce, B:309:0x11d9, B:311:0x11e1, B:312:0x11ec, B:314:0x11f4, B:315:0x11ff, B:317:0x1207, B:318:0x1212, B:320:0x121a, B:321:0x1225, B:323:0x122d, B:324:0x1238, B:326:0x1240, B:327:0x124b, B:329:0x1253, B:330:0x125e, B:332:0x1266, B:333:0x1271, B:335:0x1279, B:336:0x1284, B:338:0x128c, B:339:0x1297, B:341:0x129f, B:342:0x12aa, B:344:0x12b2, B:345:0x12bd, B:347:0x12c5, B:348:0x12d0, B:350:0x12d8, B:351:0x12e3, B:353:0x12eb, B:354:0x12f6, B:356:0x12fe, B:357:0x1309, B:359:0x1311, B:360:0x131c, B:362:0x1324, B:363:0x132f, B:365:0x1337, B:366:0x1342, B:368:0x134a, B:369:0x1355, B:371:0x135d, B:372:0x1368, B:374:0x1370, B:375:0x137b, B:377:0x137f, B:379:0x1383, B:381:0x138d, B:382:0x1392, B:384:0x1399, B:385:0x139c, B:387:0x13b3, B:388:0x13bb, B:394:0x13d9, B:399:0x13f4, B:401:0x13fb, B:402:0x1400, B:404:0x1404, B:405:0x143f, B:407:0x1445, B:408:0x144a, B:410:0x144f, B:411:0x1454, B:413:0x1458, B:414:0x1463, B:416:0x1467, B:417:0x147c, B:419:0x1495, B:420:0x149e, B:422:0x14a2, B:423:0x14b5, B:425:0x14b9, B:426:0x14d5, B:428:0x14d9, B:429:0x14de, B:431:0x14e2, B:432:0x14e7, B:434:0x14eb, B:435:0x14f1, B:437:0x14f5, B:438:0x1505, B:440:0x1518, B:441:0x151f, B:443:0x1529, B:446:0x153a, B:448:0x153f, B:449:0x155e, B:451:0x1566, B:452:0x158a, B:454:0x1591, B:455:0x1598, B:457:0x159d, B:459:0x15a8, B:465:0x15c2, B:467:0x15ca, B:469:0x15d4, B:470:0x15d6, B:481:0x1678, B:471:0x15d9, B:473:0x1643, B:475:0x1647, B:477:0x164f, B:478:0x1664, B:480:0x166a, B:482:0x167f, B:483:0x1684, B:485:0x1688, B:487:0x168c, B:488:0x168f, B:490:0x1695, B:491:0x169a, B:445:0x1533, B:462:0x15af, B:463:0x15b6, B:391:0x13cf, B:202:0x0f31, B:204:0x0f3c, B:205:0x0f44, B:207:0x0f4a, B:190:0x0eb2, B:191:0x0eec, B:193:0x0ef2, B:194:0x0f00, B:195:0x0f12, B:197:0x0f18, B:168:0x0e42, B:159:0x0b31, B:60:0x01a6, B:28:0x00c3, B:30:0x00cd, B:32:0x00d7, B:34:0x00e5, B:36:0x00f0, B:35:0x00ec), top: B:496:0x00ad }] */
    /* JADX WARN: Removed duplicated region for block: B:356:0x12fe A[Catch: JSONException -> 0x169e, TryCatch #0 {JSONException -> 0x169e, blocks: (B:23:0x00ad, B:25:0x00b1, B:27:0x00bc, B:29:0x00c7, B:38:0x00fc, B:40:0x0104, B:42:0x0108, B:43:0x0116, B:45:0x011e, B:46:0x012a, B:48:0x0130, B:50:0x0146, B:51:0x0158, B:53:0x015c, B:55:0x0164, B:56:0x0176, B:58:0x0195, B:63:0x01b2, B:65:0x01c5, B:66:0x01ca, B:68:0x01d2, B:69:0x01d6, B:71:0x01dc, B:72:0x01ea, B:74:0x01fb, B:76:0x020b, B:80:0x024d, B:82:0x0251, B:93:0x026e, B:95:0x0273, B:97:0x0277, B:99:0x0282, B:100:0x028f, B:106:0x02a0, B:109:0x02a8, B:110:0x02bc, B:112:0x02c2, B:113:0x02d1, B:114:0x02e7, B:116:0x02ed, B:117:0x02fb, B:120:0x032c, B:124:0x037d, B:128:0x03c4, B:131:0x06b9, B:135:0x06ca, B:139:0x06f7, B:141:0x09f9, B:142:0x09fb, B:144:0x0a05, B:145:0x0a07, B:147:0x0a11, B:148:0x0a13, B:156:0x0acb, B:160:0x0b3b, B:164:0x0ca9, B:167:0x0d14, B:171:0x0e50, B:173:0x0e70, B:175:0x0e76, B:176:0x0e7f, B:178:0x0e86, B:179:0x0e8b, B:181:0x0e95, B:182:0x0e9e, B:184:0x0ea6, B:186:0x0eaa, B:188:0x0eae, B:198:0x0f26, B:200:0x0f2b, B:208:0x0f5e, B:210:0x0f63, B:212:0x0f7f, B:213:0x0f87, B:215:0x0f8d, B:216:0x0fa1, B:217:0x0faa, B:219:0x0fb9, B:221:0x0fc1, B:223:0x0fd0, B:224:0x0fdb, B:226:0x0fe3, B:227:0x0fee, B:229:0x0ff6, B:230:0x1001, B:232:0x1009, B:233:0x1014, B:235:0x101c, B:236:0x1027, B:238:0x102f, B:239:0x103a, B:241:0x1042, B:242:0x104d, B:244:0x1055, B:245:0x1060, B:247:0x1066, B:248:0x106d, B:250:0x1075, B:251:0x1080, B:253:0x1086, B:254:0x108d, B:256:0x1095, B:257:0x10a0, B:259:0x10a8, B:260:0x10b3, B:262:0x10bb, B:263:0x10c6, B:265:0x10ce, B:266:0x10d9, B:268:0x10e1, B:269:0x10ec, B:271:0x10f2, B:272:0x10f9, B:274:0x1101, B:275:0x110c, B:277:0x1114, B:278:0x111f, B:280:0x1127, B:281:0x1132, B:283:0x1138, B:284:0x113f, B:286:0x1149, B:288:0x114f, B:290:0x115c, B:291:0x1167, B:293:0x116f, B:294:0x117a, B:296:0x1182, B:297:0x118d, B:299:0x1195, B:300:0x11a0, B:302:0x11a8, B:303:0x11b3, B:305:0x11bb, B:306:0x11c6, B:308:0x11ce, B:309:0x11d9, B:311:0x11e1, B:312:0x11ec, B:314:0x11f4, B:315:0x11ff, B:317:0x1207, B:318:0x1212, B:320:0x121a, B:321:0x1225, B:323:0x122d, B:324:0x1238, B:326:0x1240, B:327:0x124b, B:329:0x1253, B:330:0x125e, B:332:0x1266, B:333:0x1271, B:335:0x1279, B:336:0x1284, B:338:0x128c, B:339:0x1297, B:341:0x129f, B:342:0x12aa, B:344:0x12b2, B:345:0x12bd, B:347:0x12c5, B:348:0x12d0, B:350:0x12d8, B:351:0x12e3, B:353:0x12eb, B:354:0x12f6, B:356:0x12fe, B:357:0x1309, B:359:0x1311, B:360:0x131c, B:362:0x1324, B:363:0x132f, B:365:0x1337, B:366:0x1342, B:368:0x134a, B:369:0x1355, B:371:0x135d, B:372:0x1368, B:374:0x1370, B:375:0x137b, B:377:0x137f, B:379:0x1383, B:381:0x138d, B:382:0x1392, B:384:0x1399, B:385:0x139c, B:387:0x13b3, B:388:0x13bb, B:394:0x13d9, B:399:0x13f4, B:401:0x13fb, B:402:0x1400, B:404:0x1404, B:405:0x143f, B:407:0x1445, B:408:0x144a, B:410:0x144f, B:411:0x1454, B:413:0x1458, B:414:0x1463, B:416:0x1467, B:417:0x147c, B:419:0x1495, B:420:0x149e, B:422:0x14a2, B:423:0x14b5, B:425:0x14b9, B:426:0x14d5, B:428:0x14d9, B:429:0x14de, B:431:0x14e2, B:432:0x14e7, B:434:0x14eb, B:435:0x14f1, B:437:0x14f5, B:438:0x1505, B:440:0x1518, B:441:0x151f, B:443:0x1529, B:446:0x153a, B:448:0x153f, B:449:0x155e, B:451:0x1566, B:452:0x158a, B:454:0x1591, B:455:0x1598, B:457:0x159d, B:459:0x15a8, B:465:0x15c2, B:467:0x15ca, B:469:0x15d4, B:470:0x15d6, B:481:0x1678, B:471:0x15d9, B:473:0x1643, B:475:0x1647, B:477:0x164f, B:478:0x1664, B:480:0x166a, B:482:0x167f, B:483:0x1684, B:485:0x1688, B:487:0x168c, B:488:0x168f, B:490:0x1695, B:491:0x169a, B:445:0x1533, B:462:0x15af, B:463:0x15b6, B:391:0x13cf, B:202:0x0f31, B:204:0x0f3c, B:205:0x0f44, B:207:0x0f4a, B:190:0x0eb2, B:191:0x0eec, B:193:0x0ef2, B:194:0x0f00, B:195:0x0f12, B:197:0x0f18, B:168:0x0e42, B:159:0x0b31, B:60:0x01a6, B:28:0x00c3, B:30:0x00cd, B:32:0x00d7, B:34:0x00e5, B:36:0x00f0, B:35:0x00ec), top: B:496:0x00ad }] */
    /* JADX WARN: Removed duplicated region for block: B:359:0x1311 A[Catch: JSONException -> 0x169e, TryCatch #0 {JSONException -> 0x169e, blocks: (B:23:0x00ad, B:25:0x00b1, B:27:0x00bc, B:29:0x00c7, B:38:0x00fc, B:40:0x0104, B:42:0x0108, B:43:0x0116, B:45:0x011e, B:46:0x012a, B:48:0x0130, B:50:0x0146, B:51:0x0158, B:53:0x015c, B:55:0x0164, B:56:0x0176, B:58:0x0195, B:63:0x01b2, B:65:0x01c5, B:66:0x01ca, B:68:0x01d2, B:69:0x01d6, B:71:0x01dc, B:72:0x01ea, B:74:0x01fb, B:76:0x020b, B:80:0x024d, B:82:0x0251, B:93:0x026e, B:95:0x0273, B:97:0x0277, B:99:0x0282, B:100:0x028f, B:106:0x02a0, B:109:0x02a8, B:110:0x02bc, B:112:0x02c2, B:113:0x02d1, B:114:0x02e7, B:116:0x02ed, B:117:0x02fb, B:120:0x032c, B:124:0x037d, B:128:0x03c4, B:131:0x06b9, B:135:0x06ca, B:139:0x06f7, B:141:0x09f9, B:142:0x09fb, B:144:0x0a05, B:145:0x0a07, B:147:0x0a11, B:148:0x0a13, B:156:0x0acb, B:160:0x0b3b, B:164:0x0ca9, B:167:0x0d14, B:171:0x0e50, B:173:0x0e70, B:175:0x0e76, B:176:0x0e7f, B:178:0x0e86, B:179:0x0e8b, B:181:0x0e95, B:182:0x0e9e, B:184:0x0ea6, B:186:0x0eaa, B:188:0x0eae, B:198:0x0f26, B:200:0x0f2b, B:208:0x0f5e, B:210:0x0f63, B:212:0x0f7f, B:213:0x0f87, B:215:0x0f8d, B:216:0x0fa1, B:217:0x0faa, B:219:0x0fb9, B:221:0x0fc1, B:223:0x0fd0, B:224:0x0fdb, B:226:0x0fe3, B:227:0x0fee, B:229:0x0ff6, B:230:0x1001, B:232:0x1009, B:233:0x1014, B:235:0x101c, B:236:0x1027, B:238:0x102f, B:239:0x103a, B:241:0x1042, B:242:0x104d, B:244:0x1055, B:245:0x1060, B:247:0x1066, B:248:0x106d, B:250:0x1075, B:251:0x1080, B:253:0x1086, B:254:0x108d, B:256:0x1095, B:257:0x10a0, B:259:0x10a8, B:260:0x10b3, B:262:0x10bb, B:263:0x10c6, B:265:0x10ce, B:266:0x10d9, B:268:0x10e1, B:269:0x10ec, B:271:0x10f2, B:272:0x10f9, B:274:0x1101, B:275:0x110c, B:277:0x1114, B:278:0x111f, B:280:0x1127, B:281:0x1132, B:283:0x1138, B:284:0x113f, B:286:0x1149, B:288:0x114f, B:290:0x115c, B:291:0x1167, B:293:0x116f, B:294:0x117a, B:296:0x1182, B:297:0x118d, B:299:0x1195, B:300:0x11a0, B:302:0x11a8, B:303:0x11b3, B:305:0x11bb, B:306:0x11c6, B:308:0x11ce, B:309:0x11d9, B:311:0x11e1, B:312:0x11ec, B:314:0x11f4, B:315:0x11ff, B:317:0x1207, B:318:0x1212, B:320:0x121a, B:321:0x1225, B:323:0x122d, B:324:0x1238, B:326:0x1240, B:327:0x124b, B:329:0x1253, B:330:0x125e, B:332:0x1266, B:333:0x1271, B:335:0x1279, B:336:0x1284, B:338:0x128c, B:339:0x1297, B:341:0x129f, B:342:0x12aa, B:344:0x12b2, B:345:0x12bd, B:347:0x12c5, B:348:0x12d0, B:350:0x12d8, B:351:0x12e3, B:353:0x12eb, B:354:0x12f6, B:356:0x12fe, B:357:0x1309, B:359:0x1311, B:360:0x131c, B:362:0x1324, B:363:0x132f, B:365:0x1337, B:366:0x1342, B:368:0x134a, B:369:0x1355, B:371:0x135d, B:372:0x1368, B:374:0x1370, B:375:0x137b, B:377:0x137f, B:379:0x1383, B:381:0x138d, B:382:0x1392, B:384:0x1399, B:385:0x139c, B:387:0x13b3, B:388:0x13bb, B:394:0x13d9, B:399:0x13f4, B:401:0x13fb, B:402:0x1400, B:404:0x1404, B:405:0x143f, B:407:0x1445, B:408:0x144a, B:410:0x144f, B:411:0x1454, B:413:0x1458, B:414:0x1463, B:416:0x1467, B:417:0x147c, B:419:0x1495, B:420:0x149e, B:422:0x14a2, B:423:0x14b5, B:425:0x14b9, B:426:0x14d5, B:428:0x14d9, B:429:0x14de, B:431:0x14e2, B:432:0x14e7, B:434:0x14eb, B:435:0x14f1, B:437:0x14f5, B:438:0x1505, B:440:0x1518, B:441:0x151f, B:443:0x1529, B:446:0x153a, B:448:0x153f, B:449:0x155e, B:451:0x1566, B:452:0x158a, B:454:0x1591, B:455:0x1598, B:457:0x159d, B:459:0x15a8, B:465:0x15c2, B:467:0x15ca, B:469:0x15d4, B:470:0x15d6, B:481:0x1678, B:471:0x15d9, B:473:0x1643, B:475:0x1647, B:477:0x164f, B:478:0x1664, B:480:0x166a, B:482:0x167f, B:483:0x1684, B:485:0x1688, B:487:0x168c, B:488:0x168f, B:490:0x1695, B:491:0x169a, B:445:0x1533, B:462:0x15af, B:463:0x15b6, B:391:0x13cf, B:202:0x0f31, B:204:0x0f3c, B:205:0x0f44, B:207:0x0f4a, B:190:0x0eb2, B:191:0x0eec, B:193:0x0ef2, B:194:0x0f00, B:195:0x0f12, B:197:0x0f18, B:168:0x0e42, B:159:0x0b31, B:60:0x01a6, B:28:0x00c3, B:30:0x00cd, B:32:0x00d7, B:34:0x00e5, B:36:0x00f0, B:35:0x00ec), top: B:496:0x00ad }] */
    /* JADX WARN: Removed duplicated region for block: B:362:0x1324 A[Catch: JSONException -> 0x169e, TryCatch #0 {JSONException -> 0x169e, blocks: (B:23:0x00ad, B:25:0x00b1, B:27:0x00bc, B:29:0x00c7, B:38:0x00fc, B:40:0x0104, B:42:0x0108, B:43:0x0116, B:45:0x011e, B:46:0x012a, B:48:0x0130, B:50:0x0146, B:51:0x0158, B:53:0x015c, B:55:0x0164, B:56:0x0176, B:58:0x0195, B:63:0x01b2, B:65:0x01c5, B:66:0x01ca, B:68:0x01d2, B:69:0x01d6, B:71:0x01dc, B:72:0x01ea, B:74:0x01fb, B:76:0x020b, B:80:0x024d, B:82:0x0251, B:93:0x026e, B:95:0x0273, B:97:0x0277, B:99:0x0282, B:100:0x028f, B:106:0x02a0, B:109:0x02a8, B:110:0x02bc, B:112:0x02c2, B:113:0x02d1, B:114:0x02e7, B:116:0x02ed, B:117:0x02fb, B:120:0x032c, B:124:0x037d, B:128:0x03c4, B:131:0x06b9, B:135:0x06ca, B:139:0x06f7, B:141:0x09f9, B:142:0x09fb, B:144:0x0a05, B:145:0x0a07, B:147:0x0a11, B:148:0x0a13, B:156:0x0acb, B:160:0x0b3b, B:164:0x0ca9, B:167:0x0d14, B:171:0x0e50, B:173:0x0e70, B:175:0x0e76, B:176:0x0e7f, B:178:0x0e86, B:179:0x0e8b, B:181:0x0e95, B:182:0x0e9e, B:184:0x0ea6, B:186:0x0eaa, B:188:0x0eae, B:198:0x0f26, B:200:0x0f2b, B:208:0x0f5e, B:210:0x0f63, B:212:0x0f7f, B:213:0x0f87, B:215:0x0f8d, B:216:0x0fa1, B:217:0x0faa, B:219:0x0fb9, B:221:0x0fc1, B:223:0x0fd0, B:224:0x0fdb, B:226:0x0fe3, B:227:0x0fee, B:229:0x0ff6, B:230:0x1001, B:232:0x1009, B:233:0x1014, B:235:0x101c, B:236:0x1027, B:238:0x102f, B:239:0x103a, B:241:0x1042, B:242:0x104d, B:244:0x1055, B:245:0x1060, B:247:0x1066, B:248:0x106d, B:250:0x1075, B:251:0x1080, B:253:0x1086, B:254:0x108d, B:256:0x1095, B:257:0x10a0, B:259:0x10a8, B:260:0x10b3, B:262:0x10bb, B:263:0x10c6, B:265:0x10ce, B:266:0x10d9, B:268:0x10e1, B:269:0x10ec, B:271:0x10f2, B:272:0x10f9, B:274:0x1101, B:275:0x110c, B:277:0x1114, B:278:0x111f, B:280:0x1127, B:281:0x1132, B:283:0x1138, B:284:0x113f, B:286:0x1149, B:288:0x114f, B:290:0x115c, B:291:0x1167, B:293:0x116f, B:294:0x117a, B:296:0x1182, B:297:0x118d, B:299:0x1195, B:300:0x11a0, B:302:0x11a8, B:303:0x11b3, B:305:0x11bb, B:306:0x11c6, B:308:0x11ce, B:309:0x11d9, B:311:0x11e1, B:312:0x11ec, B:314:0x11f4, B:315:0x11ff, B:317:0x1207, B:318:0x1212, B:320:0x121a, B:321:0x1225, B:323:0x122d, B:324:0x1238, B:326:0x1240, B:327:0x124b, B:329:0x1253, B:330:0x125e, B:332:0x1266, B:333:0x1271, B:335:0x1279, B:336:0x1284, B:338:0x128c, B:339:0x1297, B:341:0x129f, B:342:0x12aa, B:344:0x12b2, B:345:0x12bd, B:347:0x12c5, B:348:0x12d0, B:350:0x12d8, B:351:0x12e3, B:353:0x12eb, B:354:0x12f6, B:356:0x12fe, B:357:0x1309, B:359:0x1311, B:360:0x131c, B:362:0x1324, B:363:0x132f, B:365:0x1337, B:366:0x1342, B:368:0x134a, B:369:0x1355, B:371:0x135d, B:372:0x1368, B:374:0x1370, B:375:0x137b, B:377:0x137f, B:379:0x1383, B:381:0x138d, B:382:0x1392, B:384:0x1399, B:385:0x139c, B:387:0x13b3, B:388:0x13bb, B:394:0x13d9, B:399:0x13f4, B:401:0x13fb, B:402:0x1400, B:404:0x1404, B:405:0x143f, B:407:0x1445, B:408:0x144a, B:410:0x144f, B:411:0x1454, B:413:0x1458, B:414:0x1463, B:416:0x1467, B:417:0x147c, B:419:0x1495, B:420:0x149e, B:422:0x14a2, B:423:0x14b5, B:425:0x14b9, B:426:0x14d5, B:428:0x14d9, B:429:0x14de, B:431:0x14e2, B:432:0x14e7, B:434:0x14eb, B:435:0x14f1, B:437:0x14f5, B:438:0x1505, B:440:0x1518, B:441:0x151f, B:443:0x1529, B:446:0x153a, B:448:0x153f, B:449:0x155e, B:451:0x1566, B:452:0x158a, B:454:0x1591, B:455:0x1598, B:457:0x159d, B:459:0x15a8, B:465:0x15c2, B:467:0x15ca, B:469:0x15d4, B:470:0x15d6, B:481:0x1678, B:471:0x15d9, B:473:0x1643, B:475:0x1647, B:477:0x164f, B:478:0x1664, B:480:0x166a, B:482:0x167f, B:483:0x1684, B:485:0x1688, B:487:0x168c, B:488:0x168f, B:490:0x1695, B:491:0x169a, B:445:0x1533, B:462:0x15af, B:463:0x15b6, B:391:0x13cf, B:202:0x0f31, B:204:0x0f3c, B:205:0x0f44, B:207:0x0f4a, B:190:0x0eb2, B:191:0x0eec, B:193:0x0ef2, B:194:0x0f00, B:195:0x0f12, B:197:0x0f18, B:168:0x0e42, B:159:0x0b31, B:60:0x01a6, B:28:0x00c3, B:30:0x00cd, B:32:0x00d7, B:34:0x00e5, B:36:0x00f0, B:35:0x00ec), top: B:496:0x00ad }] */
    /* JADX WARN: Removed duplicated region for block: B:365:0x1337 A[Catch: JSONException -> 0x169e, TryCatch #0 {JSONException -> 0x169e, blocks: (B:23:0x00ad, B:25:0x00b1, B:27:0x00bc, B:29:0x00c7, B:38:0x00fc, B:40:0x0104, B:42:0x0108, B:43:0x0116, B:45:0x011e, B:46:0x012a, B:48:0x0130, B:50:0x0146, B:51:0x0158, B:53:0x015c, B:55:0x0164, B:56:0x0176, B:58:0x0195, B:63:0x01b2, B:65:0x01c5, B:66:0x01ca, B:68:0x01d2, B:69:0x01d6, B:71:0x01dc, B:72:0x01ea, B:74:0x01fb, B:76:0x020b, B:80:0x024d, B:82:0x0251, B:93:0x026e, B:95:0x0273, B:97:0x0277, B:99:0x0282, B:100:0x028f, B:106:0x02a0, B:109:0x02a8, B:110:0x02bc, B:112:0x02c2, B:113:0x02d1, B:114:0x02e7, B:116:0x02ed, B:117:0x02fb, B:120:0x032c, B:124:0x037d, B:128:0x03c4, B:131:0x06b9, B:135:0x06ca, B:139:0x06f7, B:141:0x09f9, B:142:0x09fb, B:144:0x0a05, B:145:0x0a07, B:147:0x0a11, B:148:0x0a13, B:156:0x0acb, B:160:0x0b3b, B:164:0x0ca9, B:167:0x0d14, B:171:0x0e50, B:173:0x0e70, B:175:0x0e76, B:176:0x0e7f, B:178:0x0e86, B:179:0x0e8b, B:181:0x0e95, B:182:0x0e9e, B:184:0x0ea6, B:186:0x0eaa, B:188:0x0eae, B:198:0x0f26, B:200:0x0f2b, B:208:0x0f5e, B:210:0x0f63, B:212:0x0f7f, B:213:0x0f87, B:215:0x0f8d, B:216:0x0fa1, B:217:0x0faa, B:219:0x0fb9, B:221:0x0fc1, B:223:0x0fd0, B:224:0x0fdb, B:226:0x0fe3, B:227:0x0fee, B:229:0x0ff6, B:230:0x1001, B:232:0x1009, B:233:0x1014, B:235:0x101c, B:236:0x1027, B:238:0x102f, B:239:0x103a, B:241:0x1042, B:242:0x104d, B:244:0x1055, B:245:0x1060, B:247:0x1066, B:248:0x106d, B:250:0x1075, B:251:0x1080, B:253:0x1086, B:254:0x108d, B:256:0x1095, B:257:0x10a0, B:259:0x10a8, B:260:0x10b3, B:262:0x10bb, B:263:0x10c6, B:265:0x10ce, B:266:0x10d9, B:268:0x10e1, B:269:0x10ec, B:271:0x10f2, B:272:0x10f9, B:274:0x1101, B:275:0x110c, B:277:0x1114, B:278:0x111f, B:280:0x1127, B:281:0x1132, B:283:0x1138, B:284:0x113f, B:286:0x1149, B:288:0x114f, B:290:0x115c, B:291:0x1167, B:293:0x116f, B:294:0x117a, B:296:0x1182, B:297:0x118d, B:299:0x1195, B:300:0x11a0, B:302:0x11a8, B:303:0x11b3, B:305:0x11bb, B:306:0x11c6, B:308:0x11ce, B:309:0x11d9, B:311:0x11e1, B:312:0x11ec, B:314:0x11f4, B:315:0x11ff, B:317:0x1207, B:318:0x1212, B:320:0x121a, B:321:0x1225, B:323:0x122d, B:324:0x1238, B:326:0x1240, B:327:0x124b, B:329:0x1253, B:330:0x125e, B:332:0x1266, B:333:0x1271, B:335:0x1279, B:336:0x1284, B:338:0x128c, B:339:0x1297, B:341:0x129f, B:342:0x12aa, B:344:0x12b2, B:345:0x12bd, B:347:0x12c5, B:348:0x12d0, B:350:0x12d8, B:351:0x12e3, B:353:0x12eb, B:354:0x12f6, B:356:0x12fe, B:357:0x1309, B:359:0x1311, B:360:0x131c, B:362:0x1324, B:363:0x132f, B:365:0x1337, B:366:0x1342, B:368:0x134a, B:369:0x1355, B:371:0x135d, B:372:0x1368, B:374:0x1370, B:375:0x137b, B:377:0x137f, B:379:0x1383, B:381:0x138d, B:382:0x1392, B:384:0x1399, B:385:0x139c, B:387:0x13b3, B:388:0x13bb, B:394:0x13d9, B:399:0x13f4, B:401:0x13fb, B:402:0x1400, B:404:0x1404, B:405:0x143f, B:407:0x1445, B:408:0x144a, B:410:0x144f, B:411:0x1454, B:413:0x1458, B:414:0x1463, B:416:0x1467, B:417:0x147c, B:419:0x1495, B:420:0x149e, B:422:0x14a2, B:423:0x14b5, B:425:0x14b9, B:426:0x14d5, B:428:0x14d9, B:429:0x14de, B:431:0x14e2, B:432:0x14e7, B:434:0x14eb, B:435:0x14f1, B:437:0x14f5, B:438:0x1505, B:440:0x1518, B:441:0x151f, B:443:0x1529, B:446:0x153a, B:448:0x153f, B:449:0x155e, B:451:0x1566, B:452:0x158a, B:454:0x1591, B:455:0x1598, B:457:0x159d, B:459:0x15a8, B:465:0x15c2, B:467:0x15ca, B:469:0x15d4, B:470:0x15d6, B:481:0x1678, B:471:0x15d9, B:473:0x1643, B:475:0x1647, B:477:0x164f, B:478:0x1664, B:480:0x166a, B:482:0x167f, B:483:0x1684, B:485:0x1688, B:487:0x168c, B:488:0x168f, B:490:0x1695, B:491:0x169a, B:445:0x1533, B:462:0x15af, B:463:0x15b6, B:391:0x13cf, B:202:0x0f31, B:204:0x0f3c, B:205:0x0f44, B:207:0x0f4a, B:190:0x0eb2, B:191:0x0eec, B:193:0x0ef2, B:194:0x0f00, B:195:0x0f12, B:197:0x0f18, B:168:0x0e42, B:159:0x0b31, B:60:0x01a6, B:28:0x00c3, B:30:0x00cd, B:32:0x00d7, B:34:0x00e5, B:36:0x00f0, B:35:0x00ec), top: B:496:0x00ad }] */
    /* JADX WARN: Removed duplicated region for block: B:368:0x134a A[Catch: JSONException -> 0x169e, TryCatch #0 {JSONException -> 0x169e, blocks: (B:23:0x00ad, B:25:0x00b1, B:27:0x00bc, B:29:0x00c7, B:38:0x00fc, B:40:0x0104, B:42:0x0108, B:43:0x0116, B:45:0x011e, B:46:0x012a, B:48:0x0130, B:50:0x0146, B:51:0x0158, B:53:0x015c, B:55:0x0164, B:56:0x0176, B:58:0x0195, B:63:0x01b2, B:65:0x01c5, B:66:0x01ca, B:68:0x01d2, B:69:0x01d6, B:71:0x01dc, B:72:0x01ea, B:74:0x01fb, B:76:0x020b, B:80:0x024d, B:82:0x0251, B:93:0x026e, B:95:0x0273, B:97:0x0277, B:99:0x0282, B:100:0x028f, B:106:0x02a0, B:109:0x02a8, B:110:0x02bc, B:112:0x02c2, B:113:0x02d1, B:114:0x02e7, B:116:0x02ed, B:117:0x02fb, B:120:0x032c, B:124:0x037d, B:128:0x03c4, B:131:0x06b9, B:135:0x06ca, B:139:0x06f7, B:141:0x09f9, B:142:0x09fb, B:144:0x0a05, B:145:0x0a07, B:147:0x0a11, B:148:0x0a13, B:156:0x0acb, B:160:0x0b3b, B:164:0x0ca9, B:167:0x0d14, B:171:0x0e50, B:173:0x0e70, B:175:0x0e76, B:176:0x0e7f, B:178:0x0e86, B:179:0x0e8b, B:181:0x0e95, B:182:0x0e9e, B:184:0x0ea6, B:186:0x0eaa, B:188:0x0eae, B:198:0x0f26, B:200:0x0f2b, B:208:0x0f5e, B:210:0x0f63, B:212:0x0f7f, B:213:0x0f87, B:215:0x0f8d, B:216:0x0fa1, B:217:0x0faa, B:219:0x0fb9, B:221:0x0fc1, B:223:0x0fd0, B:224:0x0fdb, B:226:0x0fe3, B:227:0x0fee, B:229:0x0ff6, B:230:0x1001, B:232:0x1009, B:233:0x1014, B:235:0x101c, B:236:0x1027, B:238:0x102f, B:239:0x103a, B:241:0x1042, B:242:0x104d, B:244:0x1055, B:245:0x1060, B:247:0x1066, B:248:0x106d, B:250:0x1075, B:251:0x1080, B:253:0x1086, B:254:0x108d, B:256:0x1095, B:257:0x10a0, B:259:0x10a8, B:260:0x10b3, B:262:0x10bb, B:263:0x10c6, B:265:0x10ce, B:266:0x10d9, B:268:0x10e1, B:269:0x10ec, B:271:0x10f2, B:272:0x10f9, B:274:0x1101, B:275:0x110c, B:277:0x1114, B:278:0x111f, B:280:0x1127, B:281:0x1132, B:283:0x1138, B:284:0x113f, B:286:0x1149, B:288:0x114f, B:290:0x115c, B:291:0x1167, B:293:0x116f, B:294:0x117a, B:296:0x1182, B:297:0x118d, B:299:0x1195, B:300:0x11a0, B:302:0x11a8, B:303:0x11b3, B:305:0x11bb, B:306:0x11c6, B:308:0x11ce, B:309:0x11d9, B:311:0x11e1, B:312:0x11ec, B:314:0x11f4, B:315:0x11ff, B:317:0x1207, B:318:0x1212, B:320:0x121a, B:321:0x1225, B:323:0x122d, B:324:0x1238, B:326:0x1240, B:327:0x124b, B:329:0x1253, B:330:0x125e, B:332:0x1266, B:333:0x1271, B:335:0x1279, B:336:0x1284, B:338:0x128c, B:339:0x1297, B:341:0x129f, B:342:0x12aa, B:344:0x12b2, B:345:0x12bd, B:347:0x12c5, B:348:0x12d0, B:350:0x12d8, B:351:0x12e3, B:353:0x12eb, B:354:0x12f6, B:356:0x12fe, B:357:0x1309, B:359:0x1311, B:360:0x131c, B:362:0x1324, B:363:0x132f, B:365:0x1337, B:366:0x1342, B:368:0x134a, B:369:0x1355, B:371:0x135d, B:372:0x1368, B:374:0x1370, B:375:0x137b, B:377:0x137f, B:379:0x1383, B:381:0x138d, B:382:0x1392, B:384:0x1399, B:385:0x139c, B:387:0x13b3, B:388:0x13bb, B:394:0x13d9, B:399:0x13f4, B:401:0x13fb, B:402:0x1400, B:404:0x1404, B:405:0x143f, B:407:0x1445, B:408:0x144a, B:410:0x144f, B:411:0x1454, B:413:0x1458, B:414:0x1463, B:416:0x1467, B:417:0x147c, B:419:0x1495, B:420:0x149e, B:422:0x14a2, B:423:0x14b5, B:425:0x14b9, B:426:0x14d5, B:428:0x14d9, B:429:0x14de, B:431:0x14e2, B:432:0x14e7, B:434:0x14eb, B:435:0x14f1, B:437:0x14f5, B:438:0x1505, B:440:0x1518, B:441:0x151f, B:443:0x1529, B:446:0x153a, B:448:0x153f, B:449:0x155e, B:451:0x1566, B:452:0x158a, B:454:0x1591, B:455:0x1598, B:457:0x159d, B:459:0x15a8, B:465:0x15c2, B:467:0x15ca, B:469:0x15d4, B:470:0x15d6, B:481:0x1678, B:471:0x15d9, B:473:0x1643, B:475:0x1647, B:477:0x164f, B:478:0x1664, B:480:0x166a, B:482:0x167f, B:483:0x1684, B:485:0x1688, B:487:0x168c, B:488:0x168f, B:490:0x1695, B:491:0x169a, B:445:0x1533, B:462:0x15af, B:463:0x15b6, B:391:0x13cf, B:202:0x0f31, B:204:0x0f3c, B:205:0x0f44, B:207:0x0f4a, B:190:0x0eb2, B:191:0x0eec, B:193:0x0ef2, B:194:0x0f00, B:195:0x0f12, B:197:0x0f18, B:168:0x0e42, B:159:0x0b31, B:60:0x01a6, B:28:0x00c3, B:30:0x00cd, B:32:0x00d7, B:34:0x00e5, B:36:0x00f0, B:35:0x00ec), top: B:496:0x00ad }] */
    /* JADX WARN: Removed duplicated region for block: B:371:0x135d A[Catch: JSONException -> 0x169e, TryCatch #0 {JSONException -> 0x169e, blocks: (B:23:0x00ad, B:25:0x00b1, B:27:0x00bc, B:29:0x00c7, B:38:0x00fc, B:40:0x0104, B:42:0x0108, B:43:0x0116, B:45:0x011e, B:46:0x012a, B:48:0x0130, B:50:0x0146, B:51:0x0158, B:53:0x015c, B:55:0x0164, B:56:0x0176, B:58:0x0195, B:63:0x01b2, B:65:0x01c5, B:66:0x01ca, B:68:0x01d2, B:69:0x01d6, B:71:0x01dc, B:72:0x01ea, B:74:0x01fb, B:76:0x020b, B:80:0x024d, B:82:0x0251, B:93:0x026e, B:95:0x0273, B:97:0x0277, B:99:0x0282, B:100:0x028f, B:106:0x02a0, B:109:0x02a8, B:110:0x02bc, B:112:0x02c2, B:113:0x02d1, B:114:0x02e7, B:116:0x02ed, B:117:0x02fb, B:120:0x032c, B:124:0x037d, B:128:0x03c4, B:131:0x06b9, B:135:0x06ca, B:139:0x06f7, B:141:0x09f9, B:142:0x09fb, B:144:0x0a05, B:145:0x0a07, B:147:0x0a11, B:148:0x0a13, B:156:0x0acb, B:160:0x0b3b, B:164:0x0ca9, B:167:0x0d14, B:171:0x0e50, B:173:0x0e70, B:175:0x0e76, B:176:0x0e7f, B:178:0x0e86, B:179:0x0e8b, B:181:0x0e95, B:182:0x0e9e, B:184:0x0ea6, B:186:0x0eaa, B:188:0x0eae, B:198:0x0f26, B:200:0x0f2b, B:208:0x0f5e, B:210:0x0f63, B:212:0x0f7f, B:213:0x0f87, B:215:0x0f8d, B:216:0x0fa1, B:217:0x0faa, B:219:0x0fb9, B:221:0x0fc1, B:223:0x0fd0, B:224:0x0fdb, B:226:0x0fe3, B:227:0x0fee, B:229:0x0ff6, B:230:0x1001, B:232:0x1009, B:233:0x1014, B:235:0x101c, B:236:0x1027, B:238:0x102f, B:239:0x103a, B:241:0x1042, B:242:0x104d, B:244:0x1055, B:245:0x1060, B:247:0x1066, B:248:0x106d, B:250:0x1075, B:251:0x1080, B:253:0x1086, B:254:0x108d, B:256:0x1095, B:257:0x10a0, B:259:0x10a8, B:260:0x10b3, B:262:0x10bb, B:263:0x10c6, B:265:0x10ce, B:266:0x10d9, B:268:0x10e1, B:269:0x10ec, B:271:0x10f2, B:272:0x10f9, B:274:0x1101, B:275:0x110c, B:277:0x1114, B:278:0x111f, B:280:0x1127, B:281:0x1132, B:283:0x1138, B:284:0x113f, B:286:0x1149, B:288:0x114f, B:290:0x115c, B:291:0x1167, B:293:0x116f, B:294:0x117a, B:296:0x1182, B:297:0x118d, B:299:0x1195, B:300:0x11a0, B:302:0x11a8, B:303:0x11b3, B:305:0x11bb, B:306:0x11c6, B:308:0x11ce, B:309:0x11d9, B:311:0x11e1, B:312:0x11ec, B:314:0x11f4, B:315:0x11ff, B:317:0x1207, B:318:0x1212, B:320:0x121a, B:321:0x1225, B:323:0x122d, B:324:0x1238, B:326:0x1240, B:327:0x124b, B:329:0x1253, B:330:0x125e, B:332:0x1266, B:333:0x1271, B:335:0x1279, B:336:0x1284, B:338:0x128c, B:339:0x1297, B:341:0x129f, B:342:0x12aa, B:344:0x12b2, B:345:0x12bd, B:347:0x12c5, B:348:0x12d0, B:350:0x12d8, B:351:0x12e3, B:353:0x12eb, B:354:0x12f6, B:356:0x12fe, B:357:0x1309, B:359:0x1311, B:360:0x131c, B:362:0x1324, B:363:0x132f, B:365:0x1337, B:366:0x1342, B:368:0x134a, B:369:0x1355, B:371:0x135d, B:372:0x1368, B:374:0x1370, B:375:0x137b, B:377:0x137f, B:379:0x1383, B:381:0x138d, B:382:0x1392, B:384:0x1399, B:385:0x139c, B:387:0x13b3, B:388:0x13bb, B:394:0x13d9, B:399:0x13f4, B:401:0x13fb, B:402:0x1400, B:404:0x1404, B:405:0x143f, B:407:0x1445, B:408:0x144a, B:410:0x144f, B:411:0x1454, B:413:0x1458, B:414:0x1463, B:416:0x1467, B:417:0x147c, B:419:0x1495, B:420:0x149e, B:422:0x14a2, B:423:0x14b5, B:425:0x14b9, B:426:0x14d5, B:428:0x14d9, B:429:0x14de, B:431:0x14e2, B:432:0x14e7, B:434:0x14eb, B:435:0x14f1, B:437:0x14f5, B:438:0x1505, B:440:0x1518, B:441:0x151f, B:443:0x1529, B:446:0x153a, B:448:0x153f, B:449:0x155e, B:451:0x1566, B:452:0x158a, B:454:0x1591, B:455:0x1598, B:457:0x159d, B:459:0x15a8, B:465:0x15c2, B:467:0x15ca, B:469:0x15d4, B:470:0x15d6, B:481:0x1678, B:471:0x15d9, B:473:0x1643, B:475:0x1647, B:477:0x164f, B:478:0x1664, B:480:0x166a, B:482:0x167f, B:483:0x1684, B:485:0x1688, B:487:0x168c, B:488:0x168f, B:490:0x1695, B:491:0x169a, B:445:0x1533, B:462:0x15af, B:463:0x15b6, B:391:0x13cf, B:202:0x0f31, B:204:0x0f3c, B:205:0x0f44, B:207:0x0f4a, B:190:0x0eb2, B:191:0x0eec, B:193:0x0ef2, B:194:0x0f00, B:195:0x0f12, B:197:0x0f18, B:168:0x0e42, B:159:0x0b31, B:60:0x01a6, B:28:0x00c3, B:30:0x00cd, B:32:0x00d7, B:34:0x00e5, B:36:0x00f0, B:35:0x00ec), top: B:496:0x00ad }] */
    /* JADX WARN: Removed duplicated region for block: B:374:0x1370 A[Catch: JSONException -> 0x169e, TryCatch #0 {JSONException -> 0x169e, blocks: (B:23:0x00ad, B:25:0x00b1, B:27:0x00bc, B:29:0x00c7, B:38:0x00fc, B:40:0x0104, B:42:0x0108, B:43:0x0116, B:45:0x011e, B:46:0x012a, B:48:0x0130, B:50:0x0146, B:51:0x0158, B:53:0x015c, B:55:0x0164, B:56:0x0176, B:58:0x0195, B:63:0x01b2, B:65:0x01c5, B:66:0x01ca, B:68:0x01d2, B:69:0x01d6, B:71:0x01dc, B:72:0x01ea, B:74:0x01fb, B:76:0x020b, B:80:0x024d, B:82:0x0251, B:93:0x026e, B:95:0x0273, B:97:0x0277, B:99:0x0282, B:100:0x028f, B:106:0x02a0, B:109:0x02a8, B:110:0x02bc, B:112:0x02c2, B:113:0x02d1, B:114:0x02e7, B:116:0x02ed, B:117:0x02fb, B:120:0x032c, B:124:0x037d, B:128:0x03c4, B:131:0x06b9, B:135:0x06ca, B:139:0x06f7, B:141:0x09f9, B:142:0x09fb, B:144:0x0a05, B:145:0x0a07, B:147:0x0a11, B:148:0x0a13, B:156:0x0acb, B:160:0x0b3b, B:164:0x0ca9, B:167:0x0d14, B:171:0x0e50, B:173:0x0e70, B:175:0x0e76, B:176:0x0e7f, B:178:0x0e86, B:179:0x0e8b, B:181:0x0e95, B:182:0x0e9e, B:184:0x0ea6, B:186:0x0eaa, B:188:0x0eae, B:198:0x0f26, B:200:0x0f2b, B:208:0x0f5e, B:210:0x0f63, B:212:0x0f7f, B:213:0x0f87, B:215:0x0f8d, B:216:0x0fa1, B:217:0x0faa, B:219:0x0fb9, B:221:0x0fc1, B:223:0x0fd0, B:224:0x0fdb, B:226:0x0fe3, B:227:0x0fee, B:229:0x0ff6, B:230:0x1001, B:232:0x1009, B:233:0x1014, B:235:0x101c, B:236:0x1027, B:238:0x102f, B:239:0x103a, B:241:0x1042, B:242:0x104d, B:244:0x1055, B:245:0x1060, B:247:0x1066, B:248:0x106d, B:250:0x1075, B:251:0x1080, B:253:0x1086, B:254:0x108d, B:256:0x1095, B:257:0x10a0, B:259:0x10a8, B:260:0x10b3, B:262:0x10bb, B:263:0x10c6, B:265:0x10ce, B:266:0x10d9, B:268:0x10e1, B:269:0x10ec, B:271:0x10f2, B:272:0x10f9, B:274:0x1101, B:275:0x110c, B:277:0x1114, B:278:0x111f, B:280:0x1127, B:281:0x1132, B:283:0x1138, B:284:0x113f, B:286:0x1149, B:288:0x114f, B:290:0x115c, B:291:0x1167, B:293:0x116f, B:294:0x117a, B:296:0x1182, B:297:0x118d, B:299:0x1195, B:300:0x11a0, B:302:0x11a8, B:303:0x11b3, B:305:0x11bb, B:306:0x11c6, B:308:0x11ce, B:309:0x11d9, B:311:0x11e1, B:312:0x11ec, B:314:0x11f4, B:315:0x11ff, B:317:0x1207, B:318:0x1212, B:320:0x121a, B:321:0x1225, B:323:0x122d, B:324:0x1238, B:326:0x1240, B:327:0x124b, B:329:0x1253, B:330:0x125e, B:332:0x1266, B:333:0x1271, B:335:0x1279, B:336:0x1284, B:338:0x128c, B:339:0x1297, B:341:0x129f, B:342:0x12aa, B:344:0x12b2, B:345:0x12bd, B:347:0x12c5, B:348:0x12d0, B:350:0x12d8, B:351:0x12e3, B:353:0x12eb, B:354:0x12f6, B:356:0x12fe, B:357:0x1309, B:359:0x1311, B:360:0x131c, B:362:0x1324, B:363:0x132f, B:365:0x1337, B:366:0x1342, B:368:0x134a, B:369:0x1355, B:371:0x135d, B:372:0x1368, B:374:0x1370, B:375:0x137b, B:377:0x137f, B:379:0x1383, B:381:0x138d, B:382:0x1392, B:384:0x1399, B:385:0x139c, B:387:0x13b3, B:388:0x13bb, B:394:0x13d9, B:399:0x13f4, B:401:0x13fb, B:402:0x1400, B:404:0x1404, B:405:0x143f, B:407:0x1445, B:408:0x144a, B:410:0x144f, B:411:0x1454, B:413:0x1458, B:414:0x1463, B:416:0x1467, B:417:0x147c, B:419:0x1495, B:420:0x149e, B:422:0x14a2, B:423:0x14b5, B:425:0x14b9, B:426:0x14d5, B:428:0x14d9, B:429:0x14de, B:431:0x14e2, B:432:0x14e7, B:434:0x14eb, B:435:0x14f1, B:437:0x14f5, B:438:0x1505, B:440:0x1518, B:441:0x151f, B:443:0x1529, B:446:0x153a, B:448:0x153f, B:449:0x155e, B:451:0x1566, B:452:0x158a, B:454:0x1591, B:455:0x1598, B:457:0x159d, B:459:0x15a8, B:465:0x15c2, B:467:0x15ca, B:469:0x15d4, B:470:0x15d6, B:481:0x1678, B:471:0x15d9, B:473:0x1643, B:475:0x1647, B:477:0x164f, B:478:0x1664, B:480:0x166a, B:482:0x167f, B:483:0x1684, B:485:0x1688, B:487:0x168c, B:488:0x168f, B:490:0x1695, B:491:0x169a, B:445:0x1533, B:462:0x15af, B:463:0x15b6, B:391:0x13cf, B:202:0x0f31, B:204:0x0f3c, B:205:0x0f44, B:207:0x0f4a, B:190:0x0eb2, B:191:0x0eec, B:193:0x0ef2, B:194:0x0f00, B:195:0x0f12, B:197:0x0f18, B:168:0x0e42, B:159:0x0b31, B:60:0x01a6, B:28:0x00c3, B:30:0x00cd, B:32:0x00d7, B:34:0x00e5, B:36:0x00f0, B:35:0x00ec), top: B:496:0x00ad }] */
    /* JADX WARN: Removed duplicated region for block: B:381:0x138d A[Catch: JSONException -> 0x169e, TryCatch #0 {JSONException -> 0x169e, blocks: (B:23:0x00ad, B:25:0x00b1, B:27:0x00bc, B:29:0x00c7, B:38:0x00fc, B:40:0x0104, B:42:0x0108, B:43:0x0116, B:45:0x011e, B:46:0x012a, B:48:0x0130, B:50:0x0146, B:51:0x0158, B:53:0x015c, B:55:0x0164, B:56:0x0176, B:58:0x0195, B:63:0x01b2, B:65:0x01c5, B:66:0x01ca, B:68:0x01d2, B:69:0x01d6, B:71:0x01dc, B:72:0x01ea, B:74:0x01fb, B:76:0x020b, B:80:0x024d, B:82:0x0251, B:93:0x026e, B:95:0x0273, B:97:0x0277, B:99:0x0282, B:100:0x028f, B:106:0x02a0, B:109:0x02a8, B:110:0x02bc, B:112:0x02c2, B:113:0x02d1, B:114:0x02e7, B:116:0x02ed, B:117:0x02fb, B:120:0x032c, B:124:0x037d, B:128:0x03c4, B:131:0x06b9, B:135:0x06ca, B:139:0x06f7, B:141:0x09f9, B:142:0x09fb, B:144:0x0a05, B:145:0x0a07, B:147:0x0a11, B:148:0x0a13, B:156:0x0acb, B:160:0x0b3b, B:164:0x0ca9, B:167:0x0d14, B:171:0x0e50, B:173:0x0e70, B:175:0x0e76, B:176:0x0e7f, B:178:0x0e86, B:179:0x0e8b, B:181:0x0e95, B:182:0x0e9e, B:184:0x0ea6, B:186:0x0eaa, B:188:0x0eae, B:198:0x0f26, B:200:0x0f2b, B:208:0x0f5e, B:210:0x0f63, B:212:0x0f7f, B:213:0x0f87, B:215:0x0f8d, B:216:0x0fa1, B:217:0x0faa, B:219:0x0fb9, B:221:0x0fc1, B:223:0x0fd0, B:224:0x0fdb, B:226:0x0fe3, B:227:0x0fee, B:229:0x0ff6, B:230:0x1001, B:232:0x1009, B:233:0x1014, B:235:0x101c, B:236:0x1027, B:238:0x102f, B:239:0x103a, B:241:0x1042, B:242:0x104d, B:244:0x1055, B:245:0x1060, B:247:0x1066, B:248:0x106d, B:250:0x1075, B:251:0x1080, B:253:0x1086, B:254:0x108d, B:256:0x1095, B:257:0x10a0, B:259:0x10a8, B:260:0x10b3, B:262:0x10bb, B:263:0x10c6, B:265:0x10ce, B:266:0x10d9, B:268:0x10e1, B:269:0x10ec, B:271:0x10f2, B:272:0x10f9, B:274:0x1101, B:275:0x110c, B:277:0x1114, B:278:0x111f, B:280:0x1127, B:281:0x1132, B:283:0x1138, B:284:0x113f, B:286:0x1149, B:288:0x114f, B:290:0x115c, B:291:0x1167, B:293:0x116f, B:294:0x117a, B:296:0x1182, B:297:0x118d, B:299:0x1195, B:300:0x11a0, B:302:0x11a8, B:303:0x11b3, B:305:0x11bb, B:306:0x11c6, B:308:0x11ce, B:309:0x11d9, B:311:0x11e1, B:312:0x11ec, B:314:0x11f4, B:315:0x11ff, B:317:0x1207, B:318:0x1212, B:320:0x121a, B:321:0x1225, B:323:0x122d, B:324:0x1238, B:326:0x1240, B:327:0x124b, B:329:0x1253, B:330:0x125e, B:332:0x1266, B:333:0x1271, B:335:0x1279, B:336:0x1284, B:338:0x128c, B:339:0x1297, B:341:0x129f, B:342:0x12aa, B:344:0x12b2, B:345:0x12bd, B:347:0x12c5, B:348:0x12d0, B:350:0x12d8, B:351:0x12e3, B:353:0x12eb, B:354:0x12f6, B:356:0x12fe, B:357:0x1309, B:359:0x1311, B:360:0x131c, B:362:0x1324, B:363:0x132f, B:365:0x1337, B:366:0x1342, B:368:0x134a, B:369:0x1355, B:371:0x135d, B:372:0x1368, B:374:0x1370, B:375:0x137b, B:377:0x137f, B:379:0x1383, B:381:0x138d, B:382:0x1392, B:384:0x1399, B:385:0x139c, B:387:0x13b3, B:388:0x13bb, B:394:0x13d9, B:399:0x13f4, B:401:0x13fb, B:402:0x1400, B:404:0x1404, B:405:0x143f, B:407:0x1445, B:408:0x144a, B:410:0x144f, B:411:0x1454, B:413:0x1458, B:414:0x1463, B:416:0x1467, B:417:0x147c, B:419:0x1495, B:420:0x149e, B:422:0x14a2, B:423:0x14b5, B:425:0x14b9, B:426:0x14d5, B:428:0x14d9, B:429:0x14de, B:431:0x14e2, B:432:0x14e7, B:434:0x14eb, B:435:0x14f1, B:437:0x14f5, B:438:0x1505, B:440:0x1518, B:441:0x151f, B:443:0x1529, B:446:0x153a, B:448:0x153f, B:449:0x155e, B:451:0x1566, B:452:0x158a, B:454:0x1591, B:455:0x1598, B:457:0x159d, B:459:0x15a8, B:465:0x15c2, B:467:0x15ca, B:469:0x15d4, B:470:0x15d6, B:481:0x1678, B:471:0x15d9, B:473:0x1643, B:475:0x1647, B:477:0x164f, B:478:0x1664, B:480:0x166a, B:482:0x167f, B:483:0x1684, B:485:0x1688, B:487:0x168c, B:488:0x168f, B:490:0x1695, B:491:0x169a, B:445:0x1533, B:462:0x15af, B:463:0x15b6, B:391:0x13cf, B:202:0x0f31, B:204:0x0f3c, B:205:0x0f44, B:207:0x0f4a, B:190:0x0eb2, B:191:0x0eec, B:193:0x0ef2, B:194:0x0f00, B:195:0x0f12, B:197:0x0f18, B:168:0x0e42, B:159:0x0b31, B:60:0x01a6, B:28:0x00c3, B:30:0x00cd, B:32:0x00d7, B:34:0x00e5, B:36:0x00f0, B:35:0x00ec), top: B:496:0x00ad }] */
    /* JADX WARN: Removed duplicated region for block: B:384:0x1399 A[Catch: JSONException -> 0x169e, TryCatch #0 {JSONException -> 0x169e, blocks: (B:23:0x00ad, B:25:0x00b1, B:27:0x00bc, B:29:0x00c7, B:38:0x00fc, B:40:0x0104, B:42:0x0108, B:43:0x0116, B:45:0x011e, B:46:0x012a, B:48:0x0130, B:50:0x0146, B:51:0x0158, B:53:0x015c, B:55:0x0164, B:56:0x0176, B:58:0x0195, B:63:0x01b2, B:65:0x01c5, B:66:0x01ca, B:68:0x01d2, B:69:0x01d6, B:71:0x01dc, B:72:0x01ea, B:74:0x01fb, B:76:0x020b, B:80:0x024d, B:82:0x0251, B:93:0x026e, B:95:0x0273, B:97:0x0277, B:99:0x0282, B:100:0x028f, B:106:0x02a0, B:109:0x02a8, B:110:0x02bc, B:112:0x02c2, B:113:0x02d1, B:114:0x02e7, B:116:0x02ed, B:117:0x02fb, B:120:0x032c, B:124:0x037d, B:128:0x03c4, B:131:0x06b9, B:135:0x06ca, B:139:0x06f7, B:141:0x09f9, B:142:0x09fb, B:144:0x0a05, B:145:0x0a07, B:147:0x0a11, B:148:0x0a13, B:156:0x0acb, B:160:0x0b3b, B:164:0x0ca9, B:167:0x0d14, B:171:0x0e50, B:173:0x0e70, B:175:0x0e76, B:176:0x0e7f, B:178:0x0e86, B:179:0x0e8b, B:181:0x0e95, B:182:0x0e9e, B:184:0x0ea6, B:186:0x0eaa, B:188:0x0eae, B:198:0x0f26, B:200:0x0f2b, B:208:0x0f5e, B:210:0x0f63, B:212:0x0f7f, B:213:0x0f87, B:215:0x0f8d, B:216:0x0fa1, B:217:0x0faa, B:219:0x0fb9, B:221:0x0fc1, B:223:0x0fd0, B:224:0x0fdb, B:226:0x0fe3, B:227:0x0fee, B:229:0x0ff6, B:230:0x1001, B:232:0x1009, B:233:0x1014, B:235:0x101c, B:236:0x1027, B:238:0x102f, B:239:0x103a, B:241:0x1042, B:242:0x104d, B:244:0x1055, B:245:0x1060, B:247:0x1066, B:248:0x106d, B:250:0x1075, B:251:0x1080, B:253:0x1086, B:254:0x108d, B:256:0x1095, B:257:0x10a0, B:259:0x10a8, B:260:0x10b3, B:262:0x10bb, B:263:0x10c6, B:265:0x10ce, B:266:0x10d9, B:268:0x10e1, B:269:0x10ec, B:271:0x10f2, B:272:0x10f9, B:274:0x1101, B:275:0x110c, B:277:0x1114, B:278:0x111f, B:280:0x1127, B:281:0x1132, B:283:0x1138, B:284:0x113f, B:286:0x1149, B:288:0x114f, B:290:0x115c, B:291:0x1167, B:293:0x116f, B:294:0x117a, B:296:0x1182, B:297:0x118d, B:299:0x1195, B:300:0x11a0, B:302:0x11a8, B:303:0x11b3, B:305:0x11bb, B:306:0x11c6, B:308:0x11ce, B:309:0x11d9, B:311:0x11e1, B:312:0x11ec, B:314:0x11f4, B:315:0x11ff, B:317:0x1207, B:318:0x1212, B:320:0x121a, B:321:0x1225, B:323:0x122d, B:324:0x1238, B:326:0x1240, B:327:0x124b, B:329:0x1253, B:330:0x125e, B:332:0x1266, B:333:0x1271, B:335:0x1279, B:336:0x1284, B:338:0x128c, B:339:0x1297, B:341:0x129f, B:342:0x12aa, B:344:0x12b2, B:345:0x12bd, B:347:0x12c5, B:348:0x12d0, B:350:0x12d8, B:351:0x12e3, B:353:0x12eb, B:354:0x12f6, B:356:0x12fe, B:357:0x1309, B:359:0x1311, B:360:0x131c, B:362:0x1324, B:363:0x132f, B:365:0x1337, B:366:0x1342, B:368:0x134a, B:369:0x1355, B:371:0x135d, B:372:0x1368, B:374:0x1370, B:375:0x137b, B:377:0x137f, B:379:0x1383, B:381:0x138d, B:382:0x1392, B:384:0x1399, B:385:0x139c, B:387:0x13b3, B:388:0x13bb, B:394:0x13d9, B:399:0x13f4, B:401:0x13fb, B:402:0x1400, B:404:0x1404, B:405:0x143f, B:407:0x1445, B:408:0x144a, B:410:0x144f, B:411:0x1454, B:413:0x1458, B:414:0x1463, B:416:0x1467, B:417:0x147c, B:419:0x1495, B:420:0x149e, B:422:0x14a2, B:423:0x14b5, B:425:0x14b9, B:426:0x14d5, B:428:0x14d9, B:429:0x14de, B:431:0x14e2, B:432:0x14e7, B:434:0x14eb, B:435:0x14f1, B:437:0x14f5, B:438:0x1505, B:440:0x1518, B:441:0x151f, B:443:0x1529, B:446:0x153a, B:448:0x153f, B:449:0x155e, B:451:0x1566, B:452:0x158a, B:454:0x1591, B:455:0x1598, B:457:0x159d, B:459:0x15a8, B:465:0x15c2, B:467:0x15ca, B:469:0x15d4, B:470:0x15d6, B:481:0x1678, B:471:0x15d9, B:473:0x1643, B:475:0x1647, B:477:0x164f, B:478:0x1664, B:480:0x166a, B:482:0x167f, B:483:0x1684, B:485:0x1688, B:487:0x168c, B:488:0x168f, B:490:0x1695, B:491:0x169a, B:445:0x1533, B:462:0x15af, B:463:0x15b6, B:391:0x13cf, B:202:0x0f31, B:204:0x0f3c, B:205:0x0f44, B:207:0x0f4a, B:190:0x0eb2, B:191:0x0eec, B:193:0x0ef2, B:194:0x0f00, B:195:0x0f12, B:197:0x0f18, B:168:0x0e42, B:159:0x0b31, B:60:0x01a6, B:28:0x00c3, B:30:0x00cd, B:32:0x00d7, B:34:0x00e5, B:36:0x00f0, B:35:0x00ec), top: B:496:0x00ad }] */
    /* JADX WARN: Removed duplicated region for block: B:387:0x13b3 A[Catch: JSONException -> 0x169e, TryCatch #0 {JSONException -> 0x169e, blocks: (B:23:0x00ad, B:25:0x00b1, B:27:0x00bc, B:29:0x00c7, B:38:0x00fc, B:40:0x0104, B:42:0x0108, B:43:0x0116, B:45:0x011e, B:46:0x012a, B:48:0x0130, B:50:0x0146, B:51:0x0158, B:53:0x015c, B:55:0x0164, B:56:0x0176, B:58:0x0195, B:63:0x01b2, B:65:0x01c5, B:66:0x01ca, B:68:0x01d2, B:69:0x01d6, B:71:0x01dc, B:72:0x01ea, B:74:0x01fb, B:76:0x020b, B:80:0x024d, B:82:0x0251, B:93:0x026e, B:95:0x0273, B:97:0x0277, B:99:0x0282, B:100:0x028f, B:106:0x02a0, B:109:0x02a8, B:110:0x02bc, B:112:0x02c2, B:113:0x02d1, B:114:0x02e7, B:116:0x02ed, B:117:0x02fb, B:120:0x032c, B:124:0x037d, B:128:0x03c4, B:131:0x06b9, B:135:0x06ca, B:139:0x06f7, B:141:0x09f9, B:142:0x09fb, B:144:0x0a05, B:145:0x0a07, B:147:0x0a11, B:148:0x0a13, B:156:0x0acb, B:160:0x0b3b, B:164:0x0ca9, B:167:0x0d14, B:171:0x0e50, B:173:0x0e70, B:175:0x0e76, B:176:0x0e7f, B:178:0x0e86, B:179:0x0e8b, B:181:0x0e95, B:182:0x0e9e, B:184:0x0ea6, B:186:0x0eaa, B:188:0x0eae, B:198:0x0f26, B:200:0x0f2b, B:208:0x0f5e, B:210:0x0f63, B:212:0x0f7f, B:213:0x0f87, B:215:0x0f8d, B:216:0x0fa1, B:217:0x0faa, B:219:0x0fb9, B:221:0x0fc1, B:223:0x0fd0, B:224:0x0fdb, B:226:0x0fe3, B:227:0x0fee, B:229:0x0ff6, B:230:0x1001, B:232:0x1009, B:233:0x1014, B:235:0x101c, B:236:0x1027, B:238:0x102f, B:239:0x103a, B:241:0x1042, B:242:0x104d, B:244:0x1055, B:245:0x1060, B:247:0x1066, B:248:0x106d, B:250:0x1075, B:251:0x1080, B:253:0x1086, B:254:0x108d, B:256:0x1095, B:257:0x10a0, B:259:0x10a8, B:260:0x10b3, B:262:0x10bb, B:263:0x10c6, B:265:0x10ce, B:266:0x10d9, B:268:0x10e1, B:269:0x10ec, B:271:0x10f2, B:272:0x10f9, B:274:0x1101, B:275:0x110c, B:277:0x1114, B:278:0x111f, B:280:0x1127, B:281:0x1132, B:283:0x1138, B:284:0x113f, B:286:0x1149, B:288:0x114f, B:290:0x115c, B:291:0x1167, B:293:0x116f, B:294:0x117a, B:296:0x1182, B:297:0x118d, B:299:0x1195, B:300:0x11a0, B:302:0x11a8, B:303:0x11b3, B:305:0x11bb, B:306:0x11c6, B:308:0x11ce, B:309:0x11d9, B:311:0x11e1, B:312:0x11ec, B:314:0x11f4, B:315:0x11ff, B:317:0x1207, B:318:0x1212, B:320:0x121a, B:321:0x1225, B:323:0x122d, B:324:0x1238, B:326:0x1240, B:327:0x124b, B:329:0x1253, B:330:0x125e, B:332:0x1266, B:333:0x1271, B:335:0x1279, B:336:0x1284, B:338:0x128c, B:339:0x1297, B:341:0x129f, B:342:0x12aa, B:344:0x12b2, B:345:0x12bd, B:347:0x12c5, B:348:0x12d0, B:350:0x12d8, B:351:0x12e3, B:353:0x12eb, B:354:0x12f6, B:356:0x12fe, B:357:0x1309, B:359:0x1311, B:360:0x131c, B:362:0x1324, B:363:0x132f, B:365:0x1337, B:366:0x1342, B:368:0x134a, B:369:0x1355, B:371:0x135d, B:372:0x1368, B:374:0x1370, B:375:0x137b, B:377:0x137f, B:379:0x1383, B:381:0x138d, B:382:0x1392, B:384:0x1399, B:385:0x139c, B:387:0x13b3, B:388:0x13bb, B:394:0x13d9, B:399:0x13f4, B:401:0x13fb, B:402:0x1400, B:404:0x1404, B:405:0x143f, B:407:0x1445, B:408:0x144a, B:410:0x144f, B:411:0x1454, B:413:0x1458, B:414:0x1463, B:416:0x1467, B:417:0x147c, B:419:0x1495, B:420:0x149e, B:422:0x14a2, B:423:0x14b5, B:425:0x14b9, B:426:0x14d5, B:428:0x14d9, B:429:0x14de, B:431:0x14e2, B:432:0x14e7, B:434:0x14eb, B:435:0x14f1, B:437:0x14f5, B:438:0x1505, B:440:0x1518, B:441:0x151f, B:443:0x1529, B:446:0x153a, B:448:0x153f, B:449:0x155e, B:451:0x1566, B:452:0x158a, B:454:0x1591, B:455:0x1598, B:457:0x159d, B:459:0x15a8, B:465:0x15c2, B:467:0x15ca, B:469:0x15d4, B:470:0x15d6, B:481:0x1678, B:471:0x15d9, B:473:0x1643, B:475:0x1647, B:477:0x164f, B:478:0x1664, B:480:0x166a, B:482:0x167f, B:483:0x1684, B:485:0x1688, B:487:0x168c, B:488:0x168f, B:490:0x1695, B:491:0x169a, B:445:0x1533, B:462:0x15af, B:463:0x15b6, B:391:0x13cf, B:202:0x0f31, B:204:0x0f3c, B:205:0x0f44, B:207:0x0f4a, B:190:0x0eb2, B:191:0x0eec, B:193:0x0ef2, B:194:0x0f00, B:195:0x0f12, B:197:0x0f18, B:168:0x0e42, B:159:0x0b31, B:60:0x01a6, B:28:0x00c3, B:30:0x00cd, B:32:0x00d7, B:34:0x00e5, B:36:0x00f0, B:35:0x00ec), top: B:496:0x00ad }] */
    /* JADX WARN: Removed duplicated region for block: B:390:0x13ce  */
    /* JADX WARN: Removed duplicated region for block: B:391:0x13cf A[Catch: JSONException -> 0x169e, TryCatch #0 {JSONException -> 0x169e, blocks: (B:23:0x00ad, B:25:0x00b1, B:27:0x00bc, B:29:0x00c7, B:38:0x00fc, B:40:0x0104, B:42:0x0108, B:43:0x0116, B:45:0x011e, B:46:0x012a, B:48:0x0130, B:50:0x0146, B:51:0x0158, B:53:0x015c, B:55:0x0164, B:56:0x0176, B:58:0x0195, B:63:0x01b2, B:65:0x01c5, B:66:0x01ca, B:68:0x01d2, B:69:0x01d6, B:71:0x01dc, B:72:0x01ea, B:74:0x01fb, B:76:0x020b, B:80:0x024d, B:82:0x0251, B:93:0x026e, B:95:0x0273, B:97:0x0277, B:99:0x0282, B:100:0x028f, B:106:0x02a0, B:109:0x02a8, B:110:0x02bc, B:112:0x02c2, B:113:0x02d1, B:114:0x02e7, B:116:0x02ed, B:117:0x02fb, B:120:0x032c, B:124:0x037d, B:128:0x03c4, B:131:0x06b9, B:135:0x06ca, B:139:0x06f7, B:141:0x09f9, B:142:0x09fb, B:144:0x0a05, B:145:0x0a07, B:147:0x0a11, B:148:0x0a13, B:156:0x0acb, B:160:0x0b3b, B:164:0x0ca9, B:167:0x0d14, B:171:0x0e50, B:173:0x0e70, B:175:0x0e76, B:176:0x0e7f, B:178:0x0e86, B:179:0x0e8b, B:181:0x0e95, B:182:0x0e9e, B:184:0x0ea6, B:186:0x0eaa, B:188:0x0eae, B:198:0x0f26, B:200:0x0f2b, B:208:0x0f5e, B:210:0x0f63, B:212:0x0f7f, B:213:0x0f87, B:215:0x0f8d, B:216:0x0fa1, B:217:0x0faa, B:219:0x0fb9, B:221:0x0fc1, B:223:0x0fd0, B:224:0x0fdb, B:226:0x0fe3, B:227:0x0fee, B:229:0x0ff6, B:230:0x1001, B:232:0x1009, B:233:0x1014, B:235:0x101c, B:236:0x1027, B:238:0x102f, B:239:0x103a, B:241:0x1042, B:242:0x104d, B:244:0x1055, B:245:0x1060, B:247:0x1066, B:248:0x106d, B:250:0x1075, B:251:0x1080, B:253:0x1086, B:254:0x108d, B:256:0x1095, B:257:0x10a0, B:259:0x10a8, B:260:0x10b3, B:262:0x10bb, B:263:0x10c6, B:265:0x10ce, B:266:0x10d9, B:268:0x10e1, B:269:0x10ec, B:271:0x10f2, B:272:0x10f9, B:274:0x1101, B:275:0x110c, B:277:0x1114, B:278:0x111f, B:280:0x1127, B:281:0x1132, B:283:0x1138, B:284:0x113f, B:286:0x1149, B:288:0x114f, B:290:0x115c, B:291:0x1167, B:293:0x116f, B:294:0x117a, B:296:0x1182, B:297:0x118d, B:299:0x1195, B:300:0x11a0, B:302:0x11a8, B:303:0x11b3, B:305:0x11bb, B:306:0x11c6, B:308:0x11ce, B:309:0x11d9, B:311:0x11e1, B:312:0x11ec, B:314:0x11f4, B:315:0x11ff, B:317:0x1207, B:318:0x1212, B:320:0x121a, B:321:0x1225, B:323:0x122d, B:324:0x1238, B:326:0x1240, B:327:0x124b, B:329:0x1253, B:330:0x125e, B:332:0x1266, B:333:0x1271, B:335:0x1279, B:336:0x1284, B:338:0x128c, B:339:0x1297, B:341:0x129f, B:342:0x12aa, B:344:0x12b2, B:345:0x12bd, B:347:0x12c5, B:348:0x12d0, B:350:0x12d8, B:351:0x12e3, B:353:0x12eb, B:354:0x12f6, B:356:0x12fe, B:357:0x1309, B:359:0x1311, B:360:0x131c, B:362:0x1324, B:363:0x132f, B:365:0x1337, B:366:0x1342, B:368:0x134a, B:369:0x1355, B:371:0x135d, B:372:0x1368, B:374:0x1370, B:375:0x137b, B:377:0x137f, B:379:0x1383, B:381:0x138d, B:382:0x1392, B:384:0x1399, B:385:0x139c, B:387:0x13b3, B:388:0x13bb, B:394:0x13d9, B:399:0x13f4, B:401:0x13fb, B:402:0x1400, B:404:0x1404, B:405:0x143f, B:407:0x1445, B:408:0x144a, B:410:0x144f, B:411:0x1454, B:413:0x1458, B:414:0x1463, B:416:0x1467, B:417:0x147c, B:419:0x1495, B:420:0x149e, B:422:0x14a2, B:423:0x14b5, B:425:0x14b9, B:426:0x14d5, B:428:0x14d9, B:429:0x14de, B:431:0x14e2, B:432:0x14e7, B:434:0x14eb, B:435:0x14f1, B:437:0x14f5, B:438:0x1505, B:440:0x1518, B:441:0x151f, B:443:0x1529, B:446:0x153a, B:448:0x153f, B:449:0x155e, B:451:0x1566, B:452:0x158a, B:454:0x1591, B:455:0x1598, B:457:0x159d, B:459:0x15a8, B:465:0x15c2, B:467:0x15ca, B:469:0x15d4, B:470:0x15d6, B:481:0x1678, B:471:0x15d9, B:473:0x1643, B:475:0x1647, B:477:0x164f, B:478:0x1664, B:480:0x166a, B:482:0x167f, B:483:0x1684, B:485:0x1688, B:487:0x168c, B:488:0x168f, B:490:0x1695, B:491:0x169a, B:445:0x1533, B:462:0x15af, B:463:0x15b6, B:391:0x13cf, B:202:0x0f31, B:204:0x0f3c, B:205:0x0f44, B:207:0x0f4a, B:190:0x0eb2, B:191:0x0eec, B:193:0x0ef2, B:194:0x0f00, B:195:0x0f12, B:197:0x0f18, B:168:0x0e42, B:159:0x0b31, B:60:0x01a6, B:28:0x00c3, B:30:0x00cd, B:32:0x00d7, B:34:0x00e5, B:36:0x00f0, B:35:0x00ec), top: B:496:0x00ad }] */
    /* JADX WARN: Removed duplicated region for block: B:393:0x13d8  */
    /* JADX WARN: Removed duplicated region for block: B:397:0x13f1  */
    /* JADX WARN: Removed duplicated region for block: B:399:0x13f4 A[Catch: JSONException -> 0x169e, PHI: r2
      0x13f4: PHI (r2v135 org.json.JSONObject) = (r2v116 org.json.JSONObject), (r2v115 org.json.JSONObject) binds: [B:398:0x13f2, B:396:0x13ef] A[DONT_GENERATE, DONT_INLINE], TryCatch #0 {JSONException -> 0x169e, blocks: (B:23:0x00ad, B:25:0x00b1, B:27:0x00bc, B:29:0x00c7, B:38:0x00fc, B:40:0x0104, B:42:0x0108, B:43:0x0116, B:45:0x011e, B:46:0x012a, B:48:0x0130, B:50:0x0146, B:51:0x0158, B:53:0x015c, B:55:0x0164, B:56:0x0176, B:58:0x0195, B:63:0x01b2, B:65:0x01c5, B:66:0x01ca, B:68:0x01d2, B:69:0x01d6, B:71:0x01dc, B:72:0x01ea, B:74:0x01fb, B:76:0x020b, B:80:0x024d, B:82:0x0251, B:93:0x026e, B:95:0x0273, B:97:0x0277, B:99:0x0282, B:100:0x028f, B:106:0x02a0, B:109:0x02a8, B:110:0x02bc, B:112:0x02c2, B:113:0x02d1, B:114:0x02e7, B:116:0x02ed, B:117:0x02fb, B:120:0x032c, B:124:0x037d, B:128:0x03c4, B:131:0x06b9, B:135:0x06ca, B:139:0x06f7, B:141:0x09f9, B:142:0x09fb, B:144:0x0a05, B:145:0x0a07, B:147:0x0a11, B:148:0x0a13, B:156:0x0acb, B:160:0x0b3b, B:164:0x0ca9, B:167:0x0d14, B:171:0x0e50, B:173:0x0e70, B:175:0x0e76, B:176:0x0e7f, B:178:0x0e86, B:179:0x0e8b, B:181:0x0e95, B:182:0x0e9e, B:184:0x0ea6, B:186:0x0eaa, B:188:0x0eae, B:198:0x0f26, B:200:0x0f2b, B:208:0x0f5e, B:210:0x0f63, B:212:0x0f7f, B:213:0x0f87, B:215:0x0f8d, B:216:0x0fa1, B:217:0x0faa, B:219:0x0fb9, B:221:0x0fc1, B:223:0x0fd0, B:224:0x0fdb, B:226:0x0fe3, B:227:0x0fee, B:229:0x0ff6, B:230:0x1001, B:232:0x1009, B:233:0x1014, B:235:0x101c, B:236:0x1027, B:238:0x102f, B:239:0x103a, B:241:0x1042, B:242:0x104d, B:244:0x1055, B:245:0x1060, B:247:0x1066, B:248:0x106d, B:250:0x1075, B:251:0x1080, B:253:0x1086, B:254:0x108d, B:256:0x1095, B:257:0x10a0, B:259:0x10a8, B:260:0x10b3, B:262:0x10bb, B:263:0x10c6, B:265:0x10ce, B:266:0x10d9, B:268:0x10e1, B:269:0x10ec, B:271:0x10f2, B:272:0x10f9, B:274:0x1101, B:275:0x110c, B:277:0x1114, B:278:0x111f, B:280:0x1127, B:281:0x1132, B:283:0x1138, B:284:0x113f, B:286:0x1149, B:288:0x114f, B:290:0x115c, B:291:0x1167, B:293:0x116f, B:294:0x117a, B:296:0x1182, B:297:0x118d, B:299:0x1195, B:300:0x11a0, B:302:0x11a8, B:303:0x11b3, B:305:0x11bb, B:306:0x11c6, B:308:0x11ce, B:309:0x11d9, B:311:0x11e1, B:312:0x11ec, B:314:0x11f4, B:315:0x11ff, B:317:0x1207, B:318:0x1212, B:320:0x121a, B:321:0x1225, B:323:0x122d, B:324:0x1238, B:326:0x1240, B:327:0x124b, B:329:0x1253, B:330:0x125e, B:332:0x1266, B:333:0x1271, B:335:0x1279, B:336:0x1284, B:338:0x128c, B:339:0x1297, B:341:0x129f, B:342:0x12aa, B:344:0x12b2, B:345:0x12bd, B:347:0x12c5, B:348:0x12d0, B:350:0x12d8, B:351:0x12e3, B:353:0x12eb, B:354:0x12f6, B:356:0x12fe, B:357:0x1309, B:359:0x1311, B:360:0x131c, B:362:0x1324, B:363:0x132f, B:365:0x1337, B:366:0x1342, B:368:0x134a, B:369:0x1355, B:371:0x135d, B:372:0x1368, B:374:0x1370, B:375:0x137b, B:377:0x137f, B:379:0x1383, B:381:0x138d, B:382:0x1392, B:384:0x1399, B:385:0x139c, B:387:0x13b3, B:388:0x13bb, B:394:0x13d9, B:399:0x13f4, B:401:0x13fb, B:402:0x1400, B:404:0x1404, B:405:0x143f, B:407:0x1445, B:408:0x144a, B:410:0x144f, B:411:0x1454, B:413:0x1458, B:414:0x1463, B:416:0x1467, B:417:0x147c, B:419:0x1495, B:420:0x149e, B:422:0x14a2, B:423:0x14b5, B:425:0x14b9, B:426:0x14d5, B:428:0x14d9, B:429:0x14de, B:431:0x14e2, B:432:0x14e7, B:434:0x14eb, B:435:0x14f1, B:437:0x14f5, B:438:0x1505, B:440:0x1518, B:441:0x151f, B:443:0x1529, B:446:0x153a, B:448:0x153f, B:449:0x155e, B:451:0x1566, B:452:0x158a, B:454:0x1591, B:455:0x1598, B:457:0x159d, B:459:0x15a8, B:465:0x15c2, B:467:0x15ca, B:469:0x15d4, B:470:0x15d6, B:481:0x1678, B:471:0x15d9, B:473:0x1643, B:475:0x1647, B:477:0x164f, B:478:0x1664, B:480:0x166a, B:482:0x167f, B:483:0x1684, B:485:0x1688, B:487:0x168c, B:488:0x168f, B:490:0x1695, B:491:0x169a, B:445:0x1533, B:462:0x15af, B:463:0x15b6, B:391:0x13cf, B:202:0x0f31, B:204:0x0f3c, B:205:0x0f44, B:207:0x0f4a, B:190:0x0eb2, B:191:0x0eec, B:193:0x0ef2, B:194:0x0f00, B:195:0x0f12, B:197:0x0f18, B:168:0x0e42, B:159:0x0b31, B:60:0x01a6, B:28:0x00c3, B:30:0x00cd, B:32:0x00d7, B:34:0x00e5, B:36:0x00f0, B:35:0x00ec), top: B:496:0x00ad }] */
    /* JADX WARN: Removed duplicated region for block: B:401:0x13fb A[Catch: JSONException -> 0x169e, TryCatch #0 {JSONException -> 0x169e, blocks: (B:23:0x00ad, B:25:0x00b1, B:27:0x00bc, B:29:0x00c7, B:38:0x00fc, B:40:0x0104, B:42:0x0108, B:43:0x0116, B:45:0x011e, B:46:0x012a, B:48:0x0130, B:50:0x0146, B:51:0x0158, B:53:0x015c, B:55:0x0164, B:56:0x0176, B:58:0x0195, B:63:0x01b2, B:65:0x01c5, B:66:0x01ca, B:68:0x01d2, B:69:0x01d6, B:71:0x01dc, B:72:0x01ea, B:74:0x01fb, B:76:0x020b, B:80:0x024d, B:82:0x0251, B:93:0x026e, B:95:0x0273, B:97:0x0277, B:99:0x0282, B:100:0x028f, B:106:0x02a0, B:109:0x02a8, B:110:0x02bc, B:112:0x02c2, B:113:0x02d1, B:114:0x02e7, B:116:0x02ed, B:117:0x02fb, B:120:0x032c, B:124:0x037d, B:128:0x03c4, B:131:0x06b9, B:135:0x06ca, B:139:0x06f7, B:141:0x09f9, B:142:0x09fb, B:144:0x0a05, B:145:0x0a07, B:147:0x0a11, B:148:0x0a13, B:156:0x0acb, B:160:0x0b3b, B:164:0x0ca9, B:167:0x0d14, B:171:0x0e50, B:173:0x0e70, B:175:0x0e76, B:176:0x0e7f, B:178:0x0e86, B:179:0x0e8b, B:181:0x0e95, B:182:0x0e9e, B:184:0x0ea6, B:186:0x0eaa, B:188:0x0eae, B:198:0x0f26, B:200:0x0f2b, B:208:0x0f5e, B:210:0x0f63, B:212:0x0f7f, B:213:0x0f87, B:215:0x0f8d, B:216:0x0fa1, B:217:0x0faa, B:219:0x0fb9, B:221:0x0fc1, B:223:0x0fd0, B:224:0x0fdb, B:226:0x0fe3, B:227:0x0fee, B:229:0x0ff6, B:230:0x1001, B:232:0x1009, B:233:0x1014, B:235:0x101c, B:236:0x1027, B:238:0x102f, B:239:0x103a, B:241:0x1042, B:242:0x104d, B:244:0x1055, B:245:0x1060, B:247:0x1066, B:248:0x106d, B:250:0x1075, B:251:0x1080, B:253:0x1086, B:254:0x108d, B:256:0x1095, B:257:0x10a0, B:259:0x10a8, B:260:0x10b3, B:262:0x10bb, B:263:0x10c6, B:265:0x10ce, B:266:0x10d9, B:268:0x10e1, B:269:0x10ec, B:271:0x10f2, B:272:0x10f9, B:274:0x1101, B:275:0x110c, B:277:0x1114, B:278:0x111f, B:280:0x1127, B:281:0x1132, B:283:0x1138, B:284:0x113f, B:286:0x1149, B:288:0x114f, B:290:0x115c, B:291:0x1167, B:293:0x116f, B:294:0x117a, B:296:0x1182, B:297:0x118d, B:299:0x1195, B:300:0x11a0, B:302:0x11a8, B:303:0x11b3, B:305:0x11bb, B:306:0x11c6, B:308:0x11ce, B:309:0x11d9, B:311:0x11e1, B:312:0x11ec, B:314:0x11f4, B:315:0x11ff, B:317:0x1207, B:318:0x1212, B:320:0x121a, B:321:0x1225, B:323:0x122d, B:324:0x1238, B:326:0x1240, B:327:0x124b, B:329:0x1253, B:330:0x125e, B:332:0x1266, B:333:0x1271, B:335:0x1279, B:336:0x1284, B:338:0x128c, B:339:0x1297, B:341:0x129f, B:342:0x12aa, B:344:0x12b2, B:345:0x12bd, B:347:0x12c5, B:348:0x12d0, B:350:0x12d8, B:351:0x12e3, B:353:0x12eb, B:354:0x12f6, B:356:0x12fe, B:357:0x1309, B:359:0x1311, B:360:0x131c, B:362:0x1324, B:363:0x132f, B:365:0x1337, B:366:0x1342, B:368:0x134a, B:369:0x1355, B:371:0x135d, B:372:0x1368, B:374:0x1370, B:375:0x137b, B:377:0x137f, B:379:0x1383, B:381:0x138d, B:382:0x1392, B:384:0x1399, B:385:0x139c, B:387:0x13b3, B:388:0x13bb, B:394:0x13d9, B:399:0x13f4, B:401:0x13fb, B:402:0x1400, B:404:0x1404, B:405:0x143f, B:407:0x1445, B:408:0x144a, B:410:0x144f, B:411:0x1454, B:413:0x1458, B:414:0x1463, B:416:0x1467, B:417:0x147c, B:419:0x1495, B:420:0x149e, B:422:0x14a2, B:423:0x14b5, B:425:0x14b9, B:426:0x14d5, B:428:0x14d9, B:429:0x14de, B:431:0x14e2, B:432:0x14e7, B:434:0x14eb, B:435:0x14f1, B:437:0x14f5, B:438:0x1505, B:440:0x1518, B:441:0x151f, B:443:0x1529, B:446:0x153a, B:448:0x153f, B:449:0x155e, B:451:0x1566, B:452:0x158a, B:454:0x1591, B:455:0x1598, B:457:0x159d, B:459:0x15a8, B:465:0x15c2, B:467:0x15ca, B:469:0x15d4, B:470:0x15d6, B:481:0x1678, B:471:0x15d9, B:473:0x1643, B:475:0x1647, B:477:0x164f, B:478:0x1664, B:480:0x166a, B:482:0x167f, B:483:0x1684, B:485:0x1688, B:487:0x168c, B:488:0x168f, B:490:0x1695, B:491:0x169a, B:445:0x1533, B:462:0x15af, B:463:0x15b6, B:391:0x13cf, B:202:0x0f31, B:204:0x0f3c, B:205:0x0f44, B:207:0x0f4a, B:190:0x0eb2, B:191:0x0eec, B:193:0x0ef2, B:194:0x0f00, B:195:0x0f12, B:197:0x0f18, B:168:0x0e42, B:159:0x0b31, B:60:0x01a6, B:28:0x00c3, B:30:0x00cd, B:32:0x00d7, B:34:0x00e5, B:36:0x00f0, B:35:0x00ec), top: B:496:0x00ad }] */
    /* JADX WARN: Removed duplicated region for block: B:404:0x1404 A[Catch: JSONException -> 0x169e, TryCatch #0 {JSONException -> 0x169e, blocks: (B:23:0x00ad, B:25:0x00b1, B:27:0x00bc, B:29:0x00c7, B:38:0x00fc, B:40:0x0104, B:42:0x0108, B:43:0x0116, B:45:0x011e, B:46:0x012a, B:48:0x0130, B:50:0x0146, B:51:0x0158, B:53:0x015c, B:55:0x0164, B:56:0x0176, B:58:0x0195, B:63:0x01b2, B:65:0x01c5, B:66:0x01ca, B:68:0x01d2, B:69:0x01d6, B:71:0x01dc, B:72:0x01ea, B:74:0x01fb, B:76:0x020b, B:80:0x024d, B:82:0x0251, B:93:0x026e, B:95:0x0273, B:97:0x0277, B:99:0x0282, B:100:0x028f, B:106:0x02a0, B:109:0x02a8, B:110:0x02bc, B:112:0x02c2, B:113:0x02d1, B:114:0x02e7, B:116:0x02ed, B:117:0x02fb, B:120:0x032c, B:124:0x037d, B:128:0x03c4, B:131:0x06b9, B:135:0x06ca, B:139:0x06f7, B:141:0x09f9, B:142:0x09fb, B:144:0x0a05, B:145:0x0a07, B:147:0x0a11, B:148:0x0a13, B:156:0x0acb, B:160:0x0b3b, B:164:0x0ca9, B:167:0x0d14, B:171:0x0e50, B:173:0x0e70, B:175:0x0e76, B:176:0x0e7f, B:178:0x0e86, B:179:0x0e8b, B:181:0x0e95, B:182:0x0e9e, B:184:0x0ea6, B:186:0x0eaa, B:188:0x0eae, B:198:0x0f26, B:200:0x0f2b, B:208:0x0f5e, B:210:0x0f63, B:212:0x0f7f, B:213:0x0f87, B:215:0x0f8d, B:216:0x0fa1, B:217:0x0faa, B:219:0x0fb9, B:221:0x0fc1, B:223:0x0fd0, B:224:0x0fdb, B:226:0x0fe3, B:227:0x0fee, B:229:0x0ff6, B:230:0x1001, B:232:0x1009, B:233:0x1014, B:235:0x101c, B:236:0x1027, B:238:0x102f, B:239:0x103a, B:241:0x1042, B:242:0x104d, B:244:0x1055, B:245:0x1060, B:247:0x1066, B:248:0x106d, B:250:0x1075, B:251:0x1080, B:253:0x1086, B:254:0x108d, B:256:0x1095, B:257:0x10a0, B:259:0x10a8, B:260:0x10b3, B:262:0x10bb, B:263:0x10c6, B:265:0x10ce, B:266:0x10d9, B:268:0x10e1, B:269:0x10ec, B:271:0x10f2, B:272:0x10f9, B:274:0x1101, B:275:0x110c, B:277:0x1114, B:278:0x111f, B:280:0x1127, B:281:0x1132, B:283:0x1138, B:284:0x113f, B:286:0x1149, B:288:0x114f, B:290:0x115c, B:291:0x1167, B:293:0x116f, B:294:0x117a, B:296:0x1182, B:297:0x118d, B:299:0x1195, B:300:0x11a0, B:302:0x11a8, B:303:0x11b3, B:305:0x11bb, B:306:0x11c6, B:308:0x11ce, B:309:0x11d9, B:311:0x11e1, B:312:0x11ec, B:314:0x11f4, B:315:0x11ff, B:317:0x1207, B:318:0x1212, B:320:0x121a, B:321:0x1225, B:323:0x122d, B:324:0x1238, B:326:0x1240, B:327:0x124b, B:329:0x1253, B:330:0x125e, B:332:0x1266, B:333:0x1271, B:335:0x1279, B:336:0x1284, B:338:0x128c, B:339:0x1297, B:341:0x129f, B:342:0x12aa, B:344:0x12b2, B:345:0x12bd, B:347:0x12c5, B:348:0x12d0, B:350:0x12d8, B:351:0x12e3, B:353:0x12eb, B:354:0x12f6, B:356:0x12fe, B:357:0x1309, B:359:0x1311, B:360:0x131c, B:362:0x1324, B:363:0x132f, B:365:0x1337, B:366:0x1342, B:368:0x134a, B:369:0x1355, B:371:0x135d, B:372:0x1368, B:374:0x1370, B:375:0x137b, B:377:0x137f, B:379:0x1383, B:381:0x138d, B:382:0x1392, B:384:0x1399, B:385:0x139c, B:387:0x13b3, B:388:0x13bb, B:394:0x13d9, B:399:0x13f4, B:401:0x13fb, B:402:0x1400, B:404:0x1404, B:405:0x143f, B:407:0x1445, B:408:0x144a, B:410:0x144f, B:411:0x1454, B:413:0x1458, B:414:0x1463, B:416:0x1467, B:417:0x147c, B:419:0x1495, B:420:0x149e, B:422:0x14a2, B:423:0x14b5, B:425:0x14b9, B:426:0x14d5, B:428:0x14d9, B:429:0x14de, B:431:0x14e2, B:432:0x14e7, B:434:0x14eb, B:435:0x14f1, B:437:0x14f5, B:438:0x1505, B:440:0x1518, B:441:0x151f, B:443:0x1529, B:446:0x153a, B:448:0x153f, B:449:0x155e, B:451:0x1566, B:452:0x158a, B:454:0x1591, B:455:0x1598, B:457:0x159d, B:459:0x15a8, B:465:0x15c2, B:467:0x15ca, B:469:0x15d4, B:470:0x15d6, B:481:0x1678, B:471:0x15d9, B:473:0x1643, B:475:0x1647, B:477:0x164f, B:478:0x1664, B:480:0x166a, B:482:0x167f, B:483:0x1684, B:485:0x1688, B:487:0x168c, B:488:0x168f, B:490:0x1695, B:491:0x169a, B:445:0x1533, B:462:0x15af, B:463:0x15b6, B:391:0x13cf, B:202:0x0f31, B:204:0x0f3c, B:205:0x0f44, B:207:0x0f4a, B:190:0x0eb2, B:191:0x0eec, B:193:0x0ef2, B:194:0x0f00, B:195:0x0f12, B:197:0x0f18, B:168:0x0e42, B:159:0x0b31, B:60:0x01a6, B:28:0x00c3, B:30:0x00cd, B:32:0x00d7, B:34:0x00e5, B:36:0x00f0, B:35:0x00ec), top: B:496:0x00ad }] */
    /* JADX WARN: Removed duplicated region for block: B:407:0x1445 A[Catch: JSONException -> 0x169e, TryCatch #0 {JSONException -> 0x169e, blocks: (B:23:0x00ad, B:25:0x00b1, B:27:0x00bc, B:29:0x00c7, B:38:0x00fc, B:40:0x0104, B:42:0x0108, B:43:0x0116, B:45:0x011e, B:46:0x012a, B:48:0x0130, B:50:0x0146, B:51:0x0158, B:53:0x015c, B:55:0x0164, B:56:0x0176, B:58:0x0195, B:63:0x01b2, B:65:0x01c5, B:66:0x01ca, B:68:0x01d2, B:69:0x01d6, B:71:0x01dc, B:72:0x01ea, B:74:0x01fb, B:76:0x020b, B:80:0x024d, B:82:0x0251, B:93:0x026e, B:95:0x0273, B:97:0x0277, B:99:0x0282, B:100:0x028f, B:106:0x02a0, B:109:0x02a8, B:110:0x02bc, B:112:0x02c2, B:113:0x02d1, B:114:0x02e7, B:116:0x02ed, B:117:0x02fb, B:120:0x032c, B:124:0x037d, B:128:0x03c4, B:131:0x06b9, B:135:0x06ca, B:139:0x06f7, B:141:0x09f9, B:142:0x09fb, B:144:0x0a05, B:145:0x0a07, B:147:0x0a11, B:148:0x0a13, B:156:0x0acb, B:160:0x0b3b, B:164:0x0ca9, B:167:0x0d14, B:171:0x0e50, B:173:0x0e70, B:175:0x0e76, B:176:0x0e7f, B:178:0x0e86, B:179:0x0e8b, B:181:0x0e95, B:182:0x0e9e, B:184:0x0ea6, B:186:0x0eaa, B:188:0x0eae, B:198:0x0f26, B:200:0x0f2b, B:208:0x0f5e, B:210:0x0f63, B:212:0x0f7f, B:213:0x0f87, B:215:0x0f8d, B:216:0x0fa1, B:217:0x0faa, B:219:0x0fb9, B:221:0x0fc1, B:223:0x0fd0, B:224:0x0fdb, B:226:0x0fe3, B:227:0x0fee, B:229:0x0ff6, B:230:0x1001, B:232:0x1009, B:233:0x1014, B:235:0x101c, B:236:0x1027, B:238:0x102f, B:239:0x103a, B:241:0x1042, B:242:0x104d, B:244:0x1055, B:245:0x1060, B:247:0x1066, B:248:0x106d, B:250:0x1075, B:251:0x1080, B:253:0x1086, B:254:0x108d, B:256:0x1095, B:257:0x10a0, B:259:0x10a8, B:260:0x10b3, B:262:0x10bb, B:263:0x10c6, B:265:0x10ce, B:266:0x10d9, B:268:0x10e1, B:269:0x10ec, B:271:0x10f2, B:272:0x10f9, B:274:0x1101, B:275:0x110c, B:277:0x1114, B:278:0x111f, B:280:0x1127, B:281:0x1132, B:283:0x1138, B:284:0x113f, B:286:0x1149, B:288:0x114f, B:290:0x115c, B:291:0x1167, B:293:0x116f, B:294:0x117a, B:296:0x1182, B:297:0x118d, B:299:0x1195, B:300:0x11a0, B:302:0x11a8, B:303:0x11b3, B:305:0x11bb, B:306:0x11c6, B:308:0x11ce, B:309:0x11d9, B:311:0x11e1, B:312:0x11ec, B:314:0x11f4, B:315:0x11ff, B:317:0x1207, B:318:0x1212, B:320:0x121a, B:321:0x1225, B:323:0x122d, B:324:0x1238, B:326:0x1240, B:327:0x124b, B:329:0x1253, B:330:0x125e, B:332:0x1266, B:333:0x1271, B:335:0x1279, B:336:0x1284, B:338:0x128c, B:339:0x1297, B:341:0x129f, B:342:0x12aa, B:344:0x12b2, B:345:0x12bd, B:347:0x12c5, B:348:0x12d0, B:350:0x12d8, B:351:0x12e3, B:353:0x12eb, B:354:0x12f6, B:356:0x12fe, B:357:0x1309, B:359:0x1311, B:360:0x131c, B:362:0x1324, B:363:0x132f, B:365:0x1337, B:366:0x1342, B:368:0x134a, B:369:0x1355, B:371:0x135d, B:372:0x1368, B:374:0x1370, B:375:0x137b, B:377:0x137f, B:379:0x1383, B:381:0x138d, B:382:0x1392, B:384:0x1399, B:385:0x139c, B:387:0x13b3, B:388:0x13bb, B:394:0x13d9, B:399:0x13f4, B:401:0x13fb, B:402:0x1400, B:404:0x1404, B:405:0x143f, B:407:0x1445, B:408:0x144a, B:410:0x144f, B:411:0x1454, B:413:0x1458, B:414:0x1463, B:416:0x1467, B:417:0x147c, B:419:0x1495, B:420:0x149e, B:422:0x14a2, B:423:0x14b5, B:425:0x14b9, B:426:0x14d5, B:428:0x14d9, B:429:0x14de, B:431:0x14e2, B:432:0x14e7, B:434:0x14eb, B:435:0x14f1, B:437:0x14f5, B:438:0x1505, B:440:0x1518, B:441:0x151f, B:443:0x1529, B:446:0x153a, B:448:0x153f, B:449:0x155e, B:451:0x1566, B:452:0x158a, B:454:0x1591, B:455:0x1598, B:457:0x159d, B:459:0x15a8, B:465:0x15c2, B:467:0x15ca, B:469:0x15d4, B:470:0x15d6, B:481:0x1678, B:471:0x15d9, B:473:0x1643, B:475:0x1647, B:477:0x164f, B:478:0x1664, B:480:0x166a, B:482:0x167f, B:483:0x1684, B:485:0x1688, B:487:0x168c, B:488:0x168f, B:490:0x1695, B:491:0x169a, B:445:0x1533, B:462:0x15af, B:463:0x15b6, B:391:0x13cf, B:202:0x0f31, B:204:0x0f3c, B:205:0x0f44, B:207:0x0f4a, B:190:0x0eb2, B:191:0x0eec, B:193:0x0ef2, B:194:0x0f00, B:195:0x0f12, B:197:0x0f18, B:168:0x0e42, B:159:0x0b31, B:60:0x01a6, B:28:0x00c3, B:30:0x00cd, B:32:0x00d7, B:34:0x00e5, B:36:0x00f0, B:35:0x00ec), top: B:496:0x00ad }] */
    /* JADX WARN: Removed duplicated region for block: B:410:0x144f A[Catch: JSONException -> 0x169e, TryCatch #0 {JSONException -> 0x169e, blocks: (B:23:0x00ad, B:25:0x00b1, B:27:0x00bc, B:29:0x00c7, B:38:0x00fc, B:40:0x0104, B:42:0x0108, B:43:0x0116, B:45:0x011e, B:46:0x012a, B:48:0x0130, B:50:0x0146, B:51:0x0158, B:53:0x015c, B:55:0x0164, B:56:0x0176, B:58:0x0195, B:63:0x01b2, B:65:0x01c5, B:66:0x01ca, B:68:0x01d2, B:69:0x01d6, B:71:0x01dc, B:72:0x01ea, B:74:0x01fb, B:76:0x020b, B:80:0x024d, B:82:0x0251, B:93:0x026e, B:95:0x0273, B:97:0x0277, B:99:0x0282, B:100:0x028f, B:106:0x02a0, B:109:0x02a8, B:110:0x02bc, B:112:0x02c2, B:113:0x02d1, B:114:0x02e7, B:116:0x02ed, B:117:0x02fb, B:120:0x032c, B:124:0x037d, B:128:0x03c4, B:131:0x06b9, B:135:0x06ca, B:139:0x06f7, B:141:0x09f9, B:142:0x09fb, B:144:0x0a05, B:145:0x0a07, B:147:0x0a11, B:148:0x0a13, B:156:0x0acb, B:160:0x0b3b, B:164:0x0ca9, B:167:0x0d14, B:171:0x0e50, B:173:0x0e70, B:175:0x0e76, B:176:0x0e7f, B:178:0x0e86, B:179:0x0e8b, B:181:0x0e95, B:182:0x0e9e, B:184:0x0ea6, B:186:0x0eaa, B:188:0x0eae, B:198:0x0f26, B:200:0x0f2b, B:208:0x0f5e, B:210:0x0f63, B:212:0x0f7f, B:213:0x0f87, B:215:0x0f8d, B:216:0x0fa1, B:217:0x0faa, B:219:0x0fb9, B:221:0x0fc1, B:223:0x0fd0, B:224:0x0fdb, B:226:0x0fe3, B:227:0x0fee, B:229:0x0ff6, B:230:0x1001, B:232:0x1009, B:233:0x1014, B:235:0x101c, B:236:0x1027, B:238:0x102f, B:239:0x103a, B:241:0x1042, B:242:0x104d, B:244:0x1055, B:245:0x1060, B:247:0x1066, B:248:0x106d, B:250:0x1075, B:251:0x1080, B:253:0x1086, B:254:0x108d, B:256:0x1095, B:257:0x10a0, B:259:0x10a8, B:260:0x10b3, B:262:0x10bb, B:263:0x10c6, B:265:0x10ce, B:266:0x10d9, B:268:0x10e1, B:269:0x10ec, B:271:0x10f2, B:272:0x10f9, B:274:0x1101, B:275:0x110c, B:277:0x1114, B:278:0x111f, B:280:0x1127, B:281:0x1132, B:283:0x1138, B:284:0x113f, B:286:0x1149, B:288:0x114f, B:290:0x115c, B:291:0x1167, B:293:0x116f, B:294:0x117a, B:296:0x1182, B:297:0x118d, B:299:0x1195, B:300:0x11a0, B:302:0x11a8, B:303:0x11b3, B:305:0x11bb, B:306:0x11c6, B:308:0x11ce, B:309:0x11d9, B:311:0x11e1, B:312:0x11ec, B:314:0x11f4, B:315:0x11ff, B:317:0x1207, B:318:0x1212, B:320:0x121a, B:321:0x1225, B:323:0x122d, B:324:0x1238, B:326:0x1240, B:327:0x124b, B:329:0x1253, B:330:0x125e, B:332:0x1266, B:333:0x1271, B:335:0x1279, B:336:0x1284, B:338:0x128c, B:339:0x1297, B:341:0x129f, B:342:0x12aa, B:344:0x12b2, B:345:0x12bd, B:347:0x12c5, B:348:0x12d0, B:350:0x12d8, B:351:0x12e3, B:353:0x12eb, B:354:0x12f6, B:356:0x12fe, B:357:0x1309, B:359:0x1311, B:360:0x131c, B:362:0x1324, B:363:0x132f, B:365:0x1337, B:366:0x1342, B:368:0x134a, B:369:0x1355, B:371:0x135d, B:372:0x1368, B:374:0x1370, B:375:0x137b, B:377:0x137f, B:379:0x1383, B:381:0x138d, B:382:0x1392, B:384:0x1399, B:385:0x139c, B:387:0x13b3, B:388:0x13bb, B:394:0x13d9, B:399:0x13f4, B:401:0x13fb, B:402:0x1400, B:404:0x1404, B:405:0x143f, B:407:0x1445, B:408:0x144a, B:410:0x144f, B:411:0x1454, B:413:0x1458, B:414:0x1463, B:416:0x1467, B:417:0x147c, B:419:0x1495, B:420:0x149e, B:422:0x14a2, B:423:0x14b5, B:425:0x14b9, B:426:0x14d5, B:428:0x14d9, B:429:0x14de, B:431:0x14e2, B:432:0x14e7, B:434:0x14eb, B:435:0x14f1, B:437:0x14f5, B:438:0x1505, B:440:0x1518, B:441:0x151f, B:443:0x1529, B:446:0x153a, B:448:0x153f, B:449:0x155e, B:451:0x1566, B:452:0x158a, B:454:0x1591, B:455:0x1598, B:457:0x159d, B:459:0x15a8, B:465:0x15c2, B:467:0x15ca, B:469:0x15d4, B:470:0x15d6, B:481:0x1678, B:471:0x15d9, B:473:0x1643, B:475:0x1647, B:477:0x164f, B:478:0x1664, B:480:0x166a, B:482:0x167f, B:483:0x1684, B:485:0x1688, B:487:0x168c, B:488:0x168f, B:490:0x1695, B:491:0x169a, B:445:0x1533, B:462:0x15af, B:463:0x15b6, B:391:0x13cf, B:202:0x0f31, B:204:0x0f3c, B:205:0x0f44, B:207:0x0f4a, B:190:0x0eb2, B:191:0x0eec, B:193:0x0ef2, B:194:0x0f00, B:195:0x0f12, B:197:0x0f18, B:168:0x0e42, B:159:0x0b31, B:60:0x01a6, B:28:0x00c3, B:30:0x00cd, B:32:0x00d7, B:34:0x00e5, B:36:0x00f0, B:35:0x00ec), top: B:496:0x00ad }] */
    /* JADX WARN: Removed duplicated region for block: B:413:0x1458 A[Catch: JSONException -> 0x169e, TryCatch #0 {JSONException -> 0x169e, blocks: (B:23:0x00ad, B:25:0x00b1, B:27:0x00bc, B:29:0x00c7, B:38:0x00fc, B:40:0x0104, B:42:0x0108, B:43:0x0116, B:45:0x011e, B:46:0x012a, B:48:0x0130, B:50:0x0146, B:51:0x0158, B:53:0x015c, B:55:0x0164, B:56:0x0176, B:58:0x0195, B:63:0x01b2, B:65:0x01c5, B:66:0x01ca, B:68:0x01d2, B:69:0x01d6, B:71:0x01dc, B:72:0x01ea, B:74:0x01fb, B:76:0x020b, B:80:0x024d, B:82:0x0251, B:93:0x026e, B:95:0x0273, B:97:0x0277, B:99:0x0282, B:100:0x028f, B:106:0x02a0, B:109:0x02a8, B:110:0x02bc, B:112:0x02c2, B:113:0x02d1, B:114:0x02e7, B:116:0x02ed, B:117:0x02fb, B:120:0x032c, B:124:0x037d, B:128:0x03c4, B:131:0x06b9, B:135:0x06ca, B:139:0x06f7, B:141:0x09f9, B:142:0x09fb, B:144:0x0a05, B:145:0x0a07, B:147:0x0a11, B:148:0x0a13, B:156:0x0acb, B:160:0x0b3b, B:164:0x0ca9, B:167:0x0d14, B:171:0x0e50, B:173:0x0e70, B:175:0x0e76, B:176:0x0e7f, B:178:0x0e86, B:179:0x0e8b, B:181:0x0e95, B:182:0x0e9e, B:184:0x0ea6, B:186:0x0eaa, B:188:0x0eae, B:198:0x0f26, B:200:0x0f2b, B:208:0x0f5e, B:210:0x0f63, B:212:0x0f7f, B:213:0x0f87, B:215:0x0f8d, B:216:0x0fa1, B:217:0x0faa, B:219:0x0fb9, B:221:0x0fc1, B:223:0x0fd0, B:224:0x0fdb, B:226:0x0fe3, B:227:0x0fee, B:229:0x0ff6, B:230:0x1001, B:232:0x1009, B:233:0x1014, B:235:0x101c, B:236:0x1027, B:238:0x102f, B:239:0x103a, B:241:0x1042, B:242:0x104d, B:244:0x1055, B:245:0x1060, B:247:0x1066, B:248:0x106d, B:250:0x1075, B:251:0x1080, B:253:0x1086, B:254:0x108d, B:256:0x1095, B:257:0x10a0, B:259:0x10a8, B:260:0x10b3, B:262:0x10bb, B:263:0x10c6, B:265:0x10ce, B:266:0x10d9, B:268:0x10e1, B:269:0x10ec, B:271:0x10f2, B:272:0x10f9, B:274:0x1101, B:275:0x110c, B:277:0x1114, B:278:0x111f, B:280:0x1127, B:281:0x1132, B:283:0x1138, B:284:0x113f, B:286:0x1149, B:288:0x114f, B:290:0x115c, B:291:0x1167, B:293:0x116f, B:294:0x117a, B:296:0x1182, B:297:0x118d, B:299:0x1195, B:300:0x11a0, B:302:0x11a8, B:303:0x11b3, B:305:0x11bb, B:306:0x11c6, B:308:0x11ce, B:309:0x11d9, B:311:0x11e1, B:312:0x11ec, B:314:0x11f4, B:315:0x11ff, B:317:0x1207, B:318:0x1212, B:320:0x121a, B:321:0x1225, B:323:0x122d, B:324:0x1238, B:326:0x1240, B:327:0x124b, B:329:0x1253, B:330:0x125e, B:332:0x1266, B:333:0x1271, B:335:0x1279, B:336:0x1284, B:338:0x128c, B:339:0x1297, B:341:0x129f, B:342:0x12aa, B:344:0x12b2, B:345:0x12bd, B:347:0x12c5, B:348:0x12d0, B:350:0x12d8, B:351:0x12e3, B:353:0x12eb, B:354:0x12f6, B:356:0x12fe, B:357:0x1309, B:359:0x1311, B:360:0x131c, B:362:0x1324, B:363:0x132f, B:365:0x1337, B:366:0x1342, B:368:0x134a, B:369:0x1355, B:371:0x135d, B:372:0x1368, B:374:0x1370, B:375:0x137b, B:377:0x137f, B:379:0x1383, B:381:0x138d, B:382:0x1392, B:384:0x1399, B:385:0x139c, B:387:0x13b3, B:388:0x13bb, B:394:0x13d9, B:399:0x13f4, B:401:0x13fb, B:402:0x1400, B:404:0x1404, B:405:0x143f, B:407:0x1445, B:408:0x144a, B:410:0x144f, B:411:0x1454, B:413:0x1458, B:414:0x1463, B:416:0x1467, B:417:0x147c, B:419:0x1495, B:420:0x149e, B:422:0x14a2, B:423:0x14b5, B:425:0x14b9, B:426:0x14d5, B:428:0x14d9, B:429:0x14de, B:431:0x14e2, B:432:0x14e7, B:434:0x14eb, B:435:0x14f1, B:437:0x14f5, B:438:0x1505, B:440:0x1518, B:441:0x151f, B:443:0x1529, B:446:0x153a, B:448:0x153f, B:449:0x155e, B:451:0x1566, B:452:0x158a, B:454:0x1591, B:455:0x1598, B:457:0x159d, B:459:0x15a8, B:465:0x15c2, B:467:0x15ca, B:469:0x15d4, B:470:0x15d6, B:481:0x1678, B:471:0x15d9, B:473:0x1643, B:475:0x1647, B:477:0x164f, B:478:0x1664, B:480:0x166a, B:482:0x167f, B:483:0x1684, B:485:0x1688, B:487:0x168c, B:488:0x168f, B:490:0x1695, B:491:0x169a, B:445:0x1533, B:462:0x15af, B:463:0x15b6, B:391:0x13cf, B:202:0x0f31, B:204:0x0f3c, B:205:0x0f44, B:207:0x0f4a, B:190:0x0eb2, B:191:0x0eec, B:193:0x0ef2, B:194:0x0f00, B:195:0x0f12, B:197:0x0f18, B:168:0x0e42, B:159:0x0b31, B:60:0x01a6, B:28:0x00c3, B:30:0x00cd, B:32:0x00d7, B:34:0x00e5, B:36:0x00f0, B:35:0x00ec), top: B:496:0x00ad }] */
    /* JADX WARN: Removed duplicated region for block: B:416:0x1467 A[Catch: JSONException -> 0x169e, TryCatch #0 {JSONException -> 0x169e, blocks: (B:23:0x00ad, B:25:0x00b1, B:27:0x00bc, B:29:0x00c7, B:38:0x00fc, B:40:0x0104, B:42:0x0108, B:43:0x0116, B:45:0x011e, B:46:0x012a, B:48:0x0130, B:50:0x0146, B:51:0x0158, B:53:0x015c, B:55:0x0164, B:56:0x0176, B:58:0x0195, B:63:0x01b2, B:65:0x01c5, B:66:0x01ca, B:68:0x01d2, B:69:0x01d6, B:71:0x01dc, B:72:0x01ea, B:74:0x01fb, B:76:0x020b, B:80:0x024d, B:82:0x0251, B:93:0x026e, B:95:0x0273, B:97:0x0277, B:99:0x0282, B:100:0x028f, B:106:0x02a0, B:109:0x02a8, B:110:0x02bc, B:112:0x02c2, B:113:0x02d1, B:114:0x02e7, B:116:0x02ed, B:117:0x02fb, B:120:0x032c, B:124:0x037d, B:128:0x03c4, B:131:0x06b9, B:135:0x06ca, B:139:0x06f7, B:141:0x09f9, B:142:0x09fb, B:144:0x0a05, B:145:0x0a07, B:147:0x0a11, B:148:0x0a13, B:156:0x0acb, B:160:0x0b3b, B:164:0x0ca9, B:167:0x0d14, B:171:0x0e50, B:173:0x0e70, B:175:0x0e76, B:176:0x0e7f, B:178:0x0e86, B:179:0x0e8b, B:181:0x0e95, B:182:0x0e9e, B:184:0x0ea6, B:186:0x0eaa, B:188:0x0eae, B:198:0x0f26, B:200:0x0f2b, B:208:0x0f5e, B:210:0x0f63, B:212:0x0f7f, B:213:0x0f87, B:215:0x0f8d, B:216:0x0fa1, B:217:0x0faa, B:219:0x0fb9, B:221:0x0fc1, B:223:0x0fd0, B:224:0x0fdb, B:226:0x0fe3, B:227:0x0fee, B:229:0x0ff6, B:230:0x1001, B:232:0x1009, B:233:0x1014, B:235:0x101c, B:236:0x1027, B:238:0x102f, B:239:0x103a, B:241:0x1042, B:242:0x104d, B:244:0x1055, B:245:0x1060, B:247:0x1066, B:248:0x106d, B:250:0x1075, B:251:0x1080, B:253:0x1086, B:254:0x108d, B:256:0x1095, B:257:0x10a0, B:259:0x10a8, B:260:0x10b3, B:262:0x10bb, B:263:0x10c6, B:265:0x10ce, B:266:0x10d9, B:268:0x10e1, B:269:0x10ec, B:271:0x10f2, B:272:0x10f9, B:274:0x1101, B:275:0x110c, B:277:0x1114, B:278:0x111f, B:280:0x1127, B:281:0x1132, B:283:0x1138, B:284:0x113f, B:286:0x1149, B:288:0x114f, B:290:0x115c, B:291:0x1167, B:293:0x116f, B:294:0x117a, B:296:0x1182, B:297:0x118d, B:299:0x1195, B:300:0x11a0, B:302:0x11a8, B:303:0x11b3, B:305:0x11bb, B:306:0x11c6, B:308:0x11ce, B:309:0x11d9, B:311:0x11e1, B:312:0x11ec, B:314:0x11f4, B:315:0x11ff, B:317:0x1207, B:318:0x1212, B:320:0x121a, B:321:0x1225, B:323:0x122d, B:324:0x1238, B:326:0x1240, B:327:0x124b, B:329:0x1253, B:330:0x125e, B:332:0x1266, B:333:0x1271, B:335:0x1279, B:336:0x1284, B:338:0x128c, B:339:0x1297, B:341:0x129f, B:342:0x12aa, B:344:0x12b2, B:345:0x12bd, B:347:0x12c5, B:348:0x12d0, B:350:0x12d8, B:351:0x12e3, B:353:0x12eb, B:354:0x12f6, B:356:0x12fe, B:357:0x1309, B:359:0x1311, B:360:0x131c, B:362:0x1324, B:363:0x132f, B:365:0x1337, B:366:0x1342, B:368:0x134a, B:369:0x1355, B:371:0x135d, B:372:0x1368, B:374:0x1370, B:375:0x137b, B:377:0x137f, B:379:0x1383, B:381:0x138d, B:382:0x1392, B:384:0x1399, B:385:0x139c, B:387:0x13b3, B:388:0x13bb, B:394:0x13d9, B:399:0x13f4, B:401:0x13fb, B:402:0x1400, B:404:0x1404, B:405:0x143f, B:407:0x1445, B:408:0x144a, B:410:0x144f, B:411:0x1454, B:413:0x1458, B:414:0x1463, B:416:0x1467, B:417:0x147c, B:419:0x1495, B:420:0x149e, B:422:0x14a2, B:423:0x14b5, B:425:0x14b9, B:426:0x14d5, B:428:0x14d9, B:429:0x14de, B:431:0x14e2, B:432:0x14e7, B:434:0x14eb, B:435:0x14f1, B:437:0x14f5, B:438:0x1505, B:440:0x1518, B:441:0x151f, B:443:0x1529, B:446:0x153a, B:448:0x153f, B:449:0x155e, B:451:0x1566, B:452:0x158a, B:454:0x1591, B:455:0x1598, B:457:0x159d, B:459:0x15a8, B:465:0x15c2, B:467:0x15ca, B:469:0x15d4, B:470:0x15d6, B:481:0x1678, B:471:0x15d9, B:473:0x1643, B:475:0x1647, B:477:0x164f, B:478:0x1664, B:480:0x166a, B:482:0x167f, B:483:0x1684, B:485:0x1688, B:487:0x168c, B:488:0x168f, B:490:0x1695, B:491:0x169a, B:445:0x1533, B:462:0x15af, B:463:0x15b6, B:391:0x13cf, B:202:0x0f31, B:204:0x0f3c, B:205:0x0f44, B:207:0x0f4a, B:190:0x0eb2, B:191:0x0eec, B:193:0x0ef2, B:194:0x0f00, B:195:0x0f12, B:197:0x0f18, B:168:0x0e42, B:159:0x0b31, B:60:0x01a6, B:28:0x00c3, B:30:0x00cd, B:32:0x00d7, B:34:0x00e5, B:36:0x00f0, B:35:0x00ec), top: B:496:0x00ad }] */
    /* JADX WARN: Removed duplicated region for block: B:419:0x1495 A[Catch: JSONException -> 0x169e, TryCatch #0 {JSONException -> 0x169e, blocks: (B:23:0x00ad, B:25:0x00b1, B:27:0x00bc, B:29:0x00c7, B:38:0x00fc, B:40:0x0104, B:42:0x0108, B:43:0x0116, B:45:0x011e, B:46:0x012a, B:48:0x0130, B:50:0x0146, B:51:0x0158, B:53:0x015c, B:55:0x0164, B:56:0x0176, B:58:0x0195, B:63:0x01b2, B:65:0x01c5, B:66:0x01ca, B:68:0x01d2, B:69:0x01d6, B:71:0x01dc, B:72:0x01ea, B:74:0x01fb, B:76:0x020b, B:80:0x024d, B:82:0x0251, B:93:0x026e, B:95:0x0273, B:97:0x0277, B:99:0x0282, B:100:0x028f, B:106:0x02a0, B:109:0x02a8, B:110:0x02bc, B:112:0x02c2, B:113:0x02d1, B:114:0x02e7, B:116:0x02ed, B:117:0x02fb, B:120:0x032c, B:124:0x037d, B:128:0x03c4, B:131:0x06b9, B:135:0x06ca, B:139:0x06f7, B:141:0x09f9, B:142:0x09fb, B:144:0x0a05, B:145:0x0a07, B:147:0x0a11, B:148:0x0a13, B:156:0x0acb, B:160:0x0b3b, B:164:0x0ca9, B:167:0x0d14, B:171:0x0e50, B:173:0x0e70, B:175:0x0e76, B:176:0x0e7f, B:178:0x0e86, B:179:0x0e8b, B:181:0x0e95, B:182:0x0e9e, B:184:0x0ea6, B:186:0x0eaa, B:188:0x0eae, B:198:0x0f26, B:200:0x0f2b, B:208:0x0f5e, B:210:0x0f63, B:212:0x0f7f, B:213:0x0f87, B:215:0x0f8d, B:216:0x0fa1, B:217:0x0faa, B:219:0x0fb9, B:221:0x0fc1, B:223:0x0fd0, B:224:0x0fdb, B:226:0x0fe3, B:227:0x0fee, B:229:0x0ff6, B:230:0x1001, B:232:0x1009, B:233:0x1014, B:235:0x101c, B:236:0x1027, B:238:0x102f, B:239:0x103a, B:241:0x1042, B:242:0x104d, B:244:0x1055, B:245:0x1060, B:247:0x1066, B:248:0x106d, B:250:0x1075, B:251:0x1080, B:253:0x1086, B:254:0x108d, B:256:0x1095, B:257:0x10a0, B:259:0x10a8, B:260:0x10b3, B:262:0x10bb, B:263:0x10c6, B:265:0x10ce, B:266:0x10d9, B:268:0x10e1, B:269:0x10ec, B:271:0x10f2, B:272:0x10f9, B:274:0x1101, B:275:0x110c, B:277:0x1114, B:278:0x111f, B:280:0x1127, B:281:0x1132, B:283:0x1138, B:284:0x113f, B:286:0x1149, B:288:0x114f, B:290:0x115c, B:291:0x1167, B:293:0x116f, B:294:0x117a, B:296:0x1182, B:297:0x118d, B:299:0x1195, B:300:0x11a0, B:302:0x11a8, B:303:0x11b3, B:305:0x11bb, B:306:0x11c6, B:308:0x11ce, B:309:0x11d9, B:311:0x11e1, B:312:0x11ec, B:314:0x11f4, B:315:0x11ff, B:317:0x1207, B:318:0x1212, B:320:0x121a, B:321:0x1225, B:323:0x122d, B:324:0x1238, B:326:0x1240, B:327:0x124b, B:329:0x1253, B:330:0x125e, B:332:0x1266, B:333:0x1271, B:335:0x1279, B:336:0x1284, B:338:0x128c, B:339:0x1297, B:341:0x129f, B:342:0x12aa, B:344:0x12b2, B:345:0x12bd, B:347:0x12c5, B:348:0x12d0, B:350:0x12d8, B:351:0x12e3, B:353:0x12eb, B:354:0x12f6, B:356:0x12fe, B:357:0x1309, B:359:0x1311, B:360:0x131c, B:362:0x1324, B:363:0x132f, B:365:0x1337, B:366:0x1342, B:368:0x134a, B:369:0x1355, B:371:0x135d, B:372:0x1368, B:374:0x1370, B:375:0x137b, B:377:0x137f, B:379:0x1383, B:381:0x138d, B:382:0x1392, B:384:0x1399, B:385:0x139c, B:387:0x13b3, B:388:0x13bb, B:394:0x13d9, B:399:0x13f4, B:401:0x13fb, B:402:0x1400, B:404:0x1404, B:405:0x143f, B:407:0x1445, B:408:0x144a, B:410:0x144f, B:411:0x1454, B:413:0x1458, B:414:0x1463, B:416:0x1467, B:417:0x147c, B:419:0x1495, B:420:0x149e, B:422:0x14a2, B:423:0x14b5, B:425:0x14b9, B:426:0x14d5, B:428:0x14d9, B:429:0x14de, B:431:0x14e2, B:432:0x14e7, B:434:0x14eb, B:435:0x14f1, B:437:0x14f5, B:438:0x1505, B:440:0x1518, B:441:0x151f, B:443:0x1529, B:446:0x153a, B:448:0x153f, B:449:0x155e, B:451:0x1566, B:452:0x158a, B:454:0x1591, B:455:0x1598, B:457:0x159d, B:459:0x15a8, B:465:0x15c2, B:467:0x15ca, B:469:0x15d4, B:470:0x15d6, B:481:0x1678, B:471:0x15d9, B:473:0x1643, B:475:0x1647, B:477:0x164f, B:478:0x1664, B:480:0x166a, B:482:0x167f, B:483:0x1684, B:485:0x1688, B:487:0x168c, B:488:0x168f, B:490:0x1695, B:491:0x169a, B:445:0x1533, B:462:0x15af, B:463:0x15b6, B:391:0x13cf, B:202:0x0f31, B:204:0x0f3c, B:205:0x0f44, B:207:0x0f4a, B:190:0x0eb2, B:191:0x0eec, B:193:0x0ef2, B:194:0x0f00, B:195:0x0f12, B:197:0x0f18, B:168:0x0e42, B:159:0x0b31, B:60:0x01a6, B:28:0x00c3, B:30:0x00cd, B:32:0x00d7, B:34:0x00e5, B:36:0x00f0, B:35:0x00ec), top: B:496:0x00ad }] */
    /* JADX WARN: Removed duplicated region for block: B:422:0x14a2 A[Catch: JSONException -> 0x169e, TryCatch #0 {JSONException -> 0x169e, blocks: (B:23:0x00ad, B:25:0x00b1, B:27:0x00bc, B:29:0x00c7, B:38:0x00fc, B:40:0x0104, B:42:0x0108, B:43:0x0116, B:45:0x011e, B:46:0x012a, B:48:0x0130, B:50:0x0146, B:51:0x0158, B:53:0x015c, B:55:0x0164, B:56:0x0176, B:58:0x0195, B:63:0x01b2, B:65:0x01c5, B:66:0x01ca, B:68:0x01d2, B:69:0x01d6, B:71:0x01dc, B:72:0x01ea, B:74:0x01fb, B:76:0x020b, B:80:0x024d, B:82:0x0251, B:93:0x026e, B:95:0x0273, B:97:0x0277, B:99:0x0282, B:100:0x028f, B:106:0x02a0, B:109:0x02a8, B:110:0x02bc, B:112:0x02c2, B:113:0x02d1, B:114:0x02e7, B:116:0x02ed, B:117:0x02fb, B:120:0x032c, B:124:0x037d, B:128:0x03c4, B:131:0x06b9, B:135:0x06ca, B:139:0x06f7, B:141:0x09f9, B:142:0x09fb, B:144:0x0a05, B:145:0x0a07, B:147:0x0a11, B:148:0x0a13, B:156:0x0acb, B:160:0x0b3b, B:164:0x0ca9, B:167:0x0d14, B:171:0x0e50, B:173:0x0e70, B:175:0x0e76, B:176:0x0e7f, B:178:0x0e86, B:179:0x0e8b, B:181:0x0e95, B:182:0x0e9e, B:184:0x0ea6, B:186:0x0eaa, B:188:0x0eae, B:198:0x0f26, B:200:0x0f2b, B:208:0x0f5e, B:210:0x0f63, B:212:0x0f7f, B:213:0x0f87, B:215:0x0f8d, B:216:0x0fa1, B:217:0x0faa, B:219:0x0fb9, B:221:0x0fc1, B:223:0x0fd0, B:224:0x0fdb, B:226:0x0fe3, B:227:0x0fee, B:229:0x0ff6, B:230:0x1001, B:232:0x1009, B:233:0x1014, B:235:0x101c, B:236:0x1027, B:238:0x102f, B:239:0x103a, B:241:0x1042, B:242:0x104d, B:244:0x1055, B:245:0x1060, B:247:0x1066, B:248:0x106d, B:250:0x1075, B:251:0x1080, B:253:0x1086, B:254:0x108d, B:256:0x1095, B:257:0x10a0, B:259:0x10a8, B:260:0x10b3, B:262:0x10bb, B:263:0x10c6, B:265:0x10ce, B:266:0x10d9, B:268:0x10e1, B:269:0x10ec, B:271:0x10f2, B:272:0x10f9, B:274:0x1101, B:275:0x110c, B:277:0x1114, B:278:0x111f, B:280:0x1127, B:281:0x1132, B:283:0x1138, B:284:0x113f, B:286:0x1149, B:288:0x114f, B:290:0x115c, B:291:0x1167, B:293:0x116f, B:294:0x117a, B:296:0x1182, B:297:0x118d, B:299:0x1195, B:300:0x11a0, B:302:0x11a8, B:303:0x11b3, B:305:0x11bb, B:306:0x11c6, B:308:0x11ce, B:309:0x11d9, B:311:0x11e1, B:312:0x11ec, B:314:0x11f4, B:315:0x11ff, B:317:0x1207, B:318:0x1212, B:320:0x121a, B:321:0x1225, B:323:0x122d, B:324:0x1238, B:326:0x1240, B:327:0x124b, B:329:0x1253, B:330:0x125e, B:332:0x1266, B:333:0x1271, B:335:0x1279, B:336:0x1284, B:338:0x128c, B:339:0x1297, B:341:0x129f, B:342:0x12aa, B:344:0x12b2, B:345:0x12bd, B:347:0x12c5, B:348:0x12d0, B:350:0x12d8, B:351:0x12e3, B:353:0x12eb, B:354:0x12f6, B:356:0x12fe, B:357:0x1309, B:359:0x1311, B:360:0x131c, B:362:0x1324, B:363:0x132f, B:365:0x1337, B:366:0x1342, B:368:0x134a, B:369:0x1355, B:371:0x135d, B:372:0x1368, B:374:0x1370, B:375:0x137b, B:377:0x137f, B:379:0x1383, B:381:0x138d, B:382:0x1392, B:384:0x1399, B:385:0x139c, B:387:0x13b3, B:388:0x13bb, B:394:0x13d9, B:399:0x13f4, B:401:0x13fb, B:402:0x1400, B:404:0x1404, B:405:0x143f, B:407:0x1445, B:408:0x144a, B:410:0x144f, B:411:0x1454, B:413:0x1458, B:414:0x1463, B:416:0x1467, B:417:0x147c, B:419:0x1495, B:420:0x149e, B:422:0x14a2, B:423:0x14b5, B:425:0x14b9, B:426:0x14d5, B:428:0x14d9, B:429:0x14de, B:431:0x14e2, B:432:0x14e7, B:434:0x14eb, B:435:0x14f1, B:437:0x14f5, B:438:0x1505, B:440:0x1518, B:441:0x151f, B:443:0x1529, B:446:0x153a, B:448:0x153f, B:449:0x155e, B:451:0x1566, B:452:0x158a, B:454:0x1591, B:455:0x1598, B:457:0x159d, B:459:0x15a8, B:465:0x15c2, B:467:0x15ca, B:469:0x15d4, B:470:0x15d6, B:481:0x1678, B:471:0x15d9, B:473:0x1643, B:475:0x1647, B:477:0x164f, B:478:0x1664, B:480:0x166a, B:482:0x167f, B:483:0x1684, B:485:0x1688, B:487:0x168c, B:488:0x168f, B:490:0x1695, B:491:0x169a, B:445:0x1533, B:462:0x15af, B:463:0x15b6, B:391:0x13cf, B:202:0x0f31, B:204:0x0f3c, B:205:0x0f44, B:207:0x0f4a, B:190:0x0eb2, B:191:0x0eec, B:193:0x0ef2, B:194:0x0f00, B:195:0x0f12, B:197:0x0f18, B:168:0x0e42, B:159:0x0b31, B:60:0x01a6, B:28:0x00c3, B:30:0x00cd, B:32:0x00d7, B:34:0x00e5, B:36:0x00f0, B:35:0x00ec), top: B:496:0x00ad }] */
    /* JADX WARN: Removed duplicated region for block: B:425:0x14b9 A[Catch: JSONException -> 0x169e, TryCatch #0 {JSONException -> 0x169e, blocks: (B:23:0x00ad, B:25:0x00b1, B:27:0x00bc, B:29:0x00c7, B:38:0x00fc, B:40:0x0104, B:42:0x0108, B:43:0x0116, B:45:0x011e, B:46:0x012a, B:48:0x0130, B:50:0x0146, B:51:0x0158, B:53:0x015c, B:55:0x0164, B:56:0x0176, B:58:0x0195, B:63:0x01b2, B:65:0x01c5, B:66:0x01ca, B:68:0x01d2, B:69:0x01d6, B:71:0x01dc, B:72:0x01ea, B:74:0x01fb, B:76:0x020b, B:80:0x024d, B:82:0x0251, B:93:0x026e, B:95:0x0273, B:97:0x0277, B:99:0x0282, B:100:0x028f, B:106:0x02a0, B:109:0x02a8, B:110:0x02bc, B:112:0x02c2, B:113:0x02d1, B:114:0x02e7, B:116:0x02ed, B:117:0x02fb, B:120:0x032c, B:124:0x037d, B:128:0x03c4, B:131:0x06b9, B:135:0x06ca, B:139:0x06f7, B:141:0x09f9, B:142:0x09fb, B:144:0x0a05, B:145:0x0a07, B:147:0x0a11, B:148:0x0a13, B:156:0x0acb, B:160:0x0b3b, B:164:0x0ca9, B:167:0x0d14, B:171:0x0e50, B:173:0x0e70, B:175:0x0e76, B:176:0x0e7f, B:178:0x0e86, B:179:0x0e8b, B:181:0x0e95, B:182:0x0e9e, B:184:0x0ea6, B:186:0x0eaa, B:188:0x0eae, B:198:0x0f26, B:200:0x0f2b, B:208:0x0f5e, B:210:0x0f63, B:212:0x0f7f, B:213:0x0f87, B:215:0x0f8d, B:216:0x0fa1, B:217:0x0faa, B:219:0x0fb9, B:221:0x0fc1, B:223:0x0fd0, B:224:0x0fdb, B:226:0x0fe3, B:227:0x0fee, B:229:0x0ff6, B:230:0x1001, B:232:0x1009, B:233:0x1014, B:235:0x101c, B:236:0x1027, B:238:0x102f, B:239:0x103a, B:241:0x1042, B:242:0x104d, B:244:0x1055, B:245:0x1060, B:247:0x1066, B:248:0x106d, B:250:0x1075, B:251:0x1080, B:253:0x1086, B:254:0x108d, B:256:0x1095, B:257:0x10a0, B:259:0x10a8, B:260:0x10b3, B:262:0x10bb, B:263:0x10c6, B:265:0x10ce, B:266:0x10d9, B:268:0x10e1, B:269:0x10ec, B:271:0x10f2, B:272:0x10f9, B:274:0x1101, B:275:0x110c, B:277:0x1114, B:278:0x111f, B:280:0x1127, B:281:0x1132, B:283:0x1138, B:284:0x113f, B:286:0x1149, B:288:0x114f, B:290:0x115c, B:291:0x1167, B:293:0x116f, B:294:0x117a, B:296:0x1182, B:297:0x118d, B:299:0x1195, B:300:0x11a0, B:302:0x11a8, B:303:0x11b3, B:305:0x11bb, B:306:0x11c6, B:308:0x11ce, B:309:0x11d9, B:311:0x11e1, B:312:0x11ec, B:314:0x11f4, B:315:0x11ff, B:317:0x1207, B:318:0x1212, B:320:0x121a, B:321:0x1225, B:323:0x122d, B:324:0x1238, B:326:0x1240, B:327:0x124b, B:329:0x1253, B:330:0x125e, B:332:0x1266, B:333:0x1271, B:335:0x1279, B:336:0x1284, B:338:0x128c, B:339:0x1297, B:341:0x129f, B:342:0x12aa, B:344:0x12b2, B:345:0x12bd, B:347:0x12c5, B:348:0x12d0, B:350:0x12d8, B:351:0x12e3, B:353:0x12eb, B:354:0x12f6, B:356:0x12fe, B:357:0x1309, B:359:0x1311, B:360:0x131c, B:362:0x1324, B:363:0x132f, B:365:0x1337, B:366:0x1342, B:368:0x134a, B:369:0x1355, B:371:0x135d, B:372:0x1368, B:374:0x1370, B:375:0x137b, B:377:0x137f, B:379:0x1383, B:381:0x138d, B:382:0x1392, B:384:0x1399, B:385:0x139c, B:387:0x13b3, B:388:0x13bb, B:394:0x13d9, B:399:0x13f4, B:401:0x13fb, B:402:0x1400, B:404:0x1404, B:405:0x143f, B:407:0x1445, B:408:0x144a, B:410:0x144f, B:411:0x1454, B:413:0x1458, B:414:0x1463, B:416:0x1467, B:417:0x147c, B:419:0x1495, B:420:0x149e, B:422:0x14a2, B:423:0x14b5, B:425:0x14b9, B:426:0x14d5, B:428:0x14d9, B:429:0x14de, B:431:0x14e2, B:432:0x14e7, B:434:0x14eb, B:435:0x14f1, B:437:0x14f5, B:438:0x1505, B:440:0x1518, B:441:0x151f, B:443:0x1529, B:446:0x153a, B:448:0x153f, B:449:0x155e, B:451:0x1566, B:452:0x158a, B:454:0x1591, B:455:0x1598, B:457:0x159d, B:459:0x15a8, B:465:0x15c2, B:467:0x15ca, B:469:0x15d4, B:470:0x15d6, B:481:0x1678, B:471:0x15d9, B:473:0x1643, B:475:0x1647, B:477:0x164f, B:478:0x1664, B:480:0x166a, B:482:0x167f, B:483:0x1684, B:485:0x1688, B:487:0x168c, B:488:0x168f, B:490:0x1695, B:491:0x169a, B:445:0x1533, B:462:0x15af, B:463:0x15b6, B:391:0x13cf, B:202:0x0f31, B:204:0x0f3c, B:205:0x0f44, B:207:0x0f4a, B:190:0x0eb2, B:191:0x0eec, B:193:0x0ef2, B:194:0x0f00, B:195:0x0f12, B:197:0x0f18, B:168:0x0e42, B:159:0x0b31, B:60:0x01a6, B:28:0x00c3, B:30:0x00cd, B:32:0x00d7, B:34:0x00e5, B:36:0x00f0, B:35:0x00ec), top: B:496:0x00ad }] */
    /* JADX WARN: Removed duplicated region for block: B:428:0x14d9 A[Catch: JSONException -> 0x169e, TryCatch #0 {JSONException -> 0x169e, blocks: (B:23:0x00ad, B:25:0x00b1, B:27:0x00bc, B:29:0x00c7, B:38:0x00fc, B:40:0x0104, B:42:0x0108, B:43:0x0116, B:45:0x011e, B:46:0x012a, B:48:0x0130, B:50:0x0146, B:51:0x0158, B:53:0x015c, B:55:0x0164, B:56:0x0176, B:58:0x0195, B:63:0x01b2, B:65:0x01c5, B:66:0x01ca, B:68:0x01d2, B:69:0x01d6, B:71:0x01dc, B:72:0x01ea, B:74:0x01fb, B:76:0x020b, B:80:0x024d, B:82:0x0251, B:93:0x026e, B:95:0x0273, B:97:0x0277, B:99:0x0282, B:100:0x028f, B:106:0x02a0, B:109:0x02a8, B:110:0x02bc, B:112:0x02c2, B:113:0x02d1, B:114:0x02e7, B:116:0x02ed, B:117:0x02fb, B:120:0x032c, B:124:0x037d, B:128:0x03c4, B:131:0x06b9, B:135:0x06ca, B:139:0x06f7, B:141:0x09f9, B:142:0x09fb, B:144:0x0a05, B:145:0x0a07, B:147:0x0a11, B:148:0x0a13, B:156:0x0acb, B:160:0x0b3b, B:164:0x0ca9, B:167:0x0d14, B:171:0x0e50, B:173:0x0e70, B:175:0x0e76, B:176:0x0e7f, B:178:0x0e86, B:179:0x0e8b, B:181:0x0e95, B:182:0x0e9e, B:184:0x0ea6, B:186:0x0eaa, B:188:0x0eae, B:198:0x0f26, B:200:0x0f2b, B:208:0x0f5e, B:210:0x0f63, B:212:0x0f7f, B:213:0x0f87, B:215:0x0f8d, B:216:0x0fa1, B:217:0x0faa, B:219:0x0fb9, B:221:0x0fc1, B:223:0x0fd0, B:224:0x0fdb, B:226:0x0fe3, B:227:0x0fee, B:229:0x0ff6, B:230:0x1001, B:232:0x1009, B:233:0x1014, B:235:0x101c, B:236:0x1027, B:238:0x102f, B:239:0x103a, B:241:0x1042, B:242:0x104d, B:244:0x1055, B:245:0x1060, B:247:0x1066, B:248:0x106d, B:250:0x1075, B:251:0x1080, B:253:0x1086, B:254:0x108d, B:256:0x1095, B:257:0x10a0, B:259:0x10a8, B:260:0x10b3, B:262:0x10bb, B:263:0x10c6, B:265:0x10ce, B:266:0x10d9, B:268:0x10e1, B:269:0x10ec, B:271:0x10f2, B:272:0x10f9, B:274:0x1101, B:275:0x110c, B:277:0x1114, B:278:0x111f, B:280:0x1127, B:281:0x1132, B:283:0x1138, B:284:0x113f, B:286:0x1149, B:288:0x114f, B:290:0x115c, B:291:0x1167, B:293:0x116f, B:294:0x117a, B:296:0x1182, B:297:0x118d, B:299:0x1195, B:300:0x11a0, B:302:0x11a8, B:303:0x11b3, B:305:0x11bb, B:306:0x11c6, B:308:0x11ce, B:309:0x11d9, B:311:0x11e1, B:312:0x11ec, B:314:0x11f4, B:315:0x11ff, B:317:0x1207, B:318:0x1212, B:320:0x121a, B:321:0x1225, B:323:0x122d, B:324:0x1238, B:326:0x1240, B:327:0x124b, B:329:0x1253, B:330:0x125e, B:332:0x1266, B:333:0x1271, B:335:0x1279, B:336:0x1284, B:338:0x128c, B:339:0x1297, B:341:0x129f, B:342:0x12aa, B:344:0x12b2, B:345:0x12bd, B:347:0x12c5, B:348:0x12d0, B:350:0x12d8, B:351:0x12e3, B:353:0x12eb, B:354:0x12f6, B:356:0x12fe, B:357:0x1309, B:359:0x1311, B:360:0x131c, B:362:0x1324, B:363:0x132f, B:365:0x1337, B:366:0x1342, B:368:0x134a, B:369:0x1355, B:371:0x135d, B:372:0x1368, B:374:0x1370, B:375:0x137b, B:377:0x137f, B:379:0x1383, B:381:0x138d, B:382:0x1392, B:384:0x1399, B:385:0x139c, B:387:0x13b3, B:388:0x13bb, B:394:0x13d9, B:399:0x13f4, B:401:0x13fb, B:402:0x1400, B:404:0x1404, B:405:0x143f, B:407:0x1445, B:408:0x144a, B:410:0x144f, B:411:0x1454, B:413:0x1458, B:414:0x1463, B:416:0x1467, B:417:0x147c, B:419:0x1495, B:420:0x149e, B:422:0x14a2, B:423:0x14b5, B:425:0x14b9, B:426:0x14d5, B:428:0x14d9, B:429:0x14de, B:431:0x14e2, B:432:0x14e7, B:434:0x14eb, B:435:0x14f1, B:437:0x14f5, B:438:0x1505, B:440:0x1518, B:441:0x151f, B:443:0x1529, B:446:0x153a, B:448:0x153f, B:449:0x155e, B:451:0x1566, B:452:0x158a, B:454:0x1591, B:455:0x1598, B:457:0x159d, B:459:0x15a8, B:465:0x15c2, B:467:0x15ca, B:469:0x15d4, B:470:0x15d6, B:481:0x1678, B:471:0x15d9, B:473:0x1643, B:475:0x1647, B:477:0x164f, B:478:0x1664, B:480:0x166a, B:482:0x167f, B:483:0x1684, B:485:0x1688, B:487:0x168c, B:488:0x168f, B:490:0x1695, B:491:0x169a, B:445:0x1533, B:462:0x15af, B:463:0x15b6, B:391:0x13cf, B:202:0x0f31, B:204:0x0f3c, B:205:0x0f44, B:207:0x0f4a, B:190:0x0eb2, B:191:0x0eec, B:193:0x0ef2, B:194:0x0f00, B:195:0x0f12, B:197:0x0f18, B:168:0x0e42, B:159:0x0b31, B:60:0x01a6, B:28:0x00c3, B:30:0x00cd, B:32:0x00d7, B:34:0x00e5, B:36:0x00f0, B:35:0x00ec), top: B:496:0x00ad }] */
    /* JADX WARN: Removed duplicated region for block: B:431:0x14e2 A[Catch: JSONException -> 0x169e, TryCatch #0 {JSONException -> 0x169e, blocks: (B:23:0x00ad, B:25:0x00b1, B:27:0x00bc, B:29:0x00c7, B:38:0x00fc, B:40:0x0104, B:42:0x0108, B:43:0x0116, B:45:0x011e, B:46:0x012a, B:48:0x0130, B:50:0x0146, B:51:0x0158, B:53:0x015c, B:55:0x0164, B:56:0x0176, B:58:0x0195, B:63:0x01b2, B:65:0x01c5, B:66:0x01ca, B:68:0x01d2, B:69:0x01d6, B:71:0x01dc, B:72:0x01ea, B:74:0x01fb, B:76:0x020b, B:80:0x024d, B:82:0x0251, B:93:0x026e, B:95:0x0273, B:97:0x0277, B:99:0x0282, B:100:0x028f, B:106:0x02a0, B:109:0x02a8, B:110:0x02bc, B:112:0x02c2, B:113:0x02d1, B:114:0x02e7, B:116:0x02ed, B:117:0x02fb, B:120:0x032c, B:124:0x037d, B:128:0x03c4, B:131:0x06b9, B:135:0x06ca, B:139:0x06f7, B:141:0x09f9, B:142:0x09fb, B:144:0x0a05, B:145:0x0a07, B:147:0x0a11, B:148:0x0a13, B:156:0x0acb, B:160:0x0b3b, B:164:0x0ca9, B:167:0x0d14, B:171:0x0e50, B:173:0x0e70, B:175:0x0e76, B:176:0x0e7f, B:178:0x0e86, B:179:0x0e8b, B:181:0x0e95, B:182:0x0e9e, B:184:0x0ea6, B:186:0x0eaa, B:188:0x0eae, B:198:0x0f26, B:200:0x0f2b, B:208:0x0f5e, B:210:0x0f63, B:212:0x0f7f, B:213:0x0f87, B:215:0x0f8d, B:216:0x0fa1, B:217:0x0faa, B:219:0x0fb9, B:221:0x0fc1, B:223:0x0fd0, B:224:0x0fdb, B:226:0x0fe3, B:227:0x0fee, B:229:0x0ff6, B:230:0x1001, B:232:0x1009, B:233:0x1014, B:235:0x101c, B:236:0x1027, B:238:0x102f, B:239:0x103a, B:241:0x1042, B:242:0x104d, B:244:0x1055, B:245:0x1060, B:247:0x1066, B:248:0x106d, B:250:0x1075, B:251:0x1080, B:253:0x1086, B:254:0x108d, B:256:0x1095, B:257:0x10a0, B:259:0x10a8, B:260:0x10b3, B:262:0x10bb, B:263:0x10c6, B:265:0x10ce, B:266:0x10d9, B:268:0x10e1, B:269:0x10ec, B:271:0x10f2, B:272:0x10f9, B:274:0x1101, B:275:0x110c, B:277:0x1114, B:278:0x111f, B:280:0x1127, B:281:0x1132, B:283:0x1138, B:284:0x113f, B:286:0x1149, B:288:0x114f, B:290:0x115c, B:291:0x1167, B:293:0x116f, B:294:0x117a, B:296:0x1182, B:297:0x118d, B:299:0x1195, B:300:0x11a0, B:302:0x11a8, B:303:0x11b3, B:305:0x11bb, B:306:0x11c6, B:308:0x11ce, B:309:0x11d9, B:311:0x11e1, B:312:0x11ec, B:314:0x11f4, B:315:0x11ff, B:317:0x1207, B:318:0x1212, B:320:0x121a, B:321:0x1225, B:323:0x122d, B:324:0x1238, B:326:0x1240, B:327:0x124b, B:329:0x1253, B:330:0x125e, B:332:0x1266, B:333:0x1271, B:335:0x1279, B:336:0x1284, B:338:0x128c, B:339:0x1297, B:341:0x129f, B:342:0x12aa, B:344:0x12b2, B:345:0x12bd, B:347:0x12c5, B:348:0x12d0, B:350:0x12d8, B:351:0x12e3, B:353:0x12eb, B:354:0x12f6, B:356:0x12fe, B:357:0x1309, B:359:0x1311, B:360:0x131c, B:362:0x1324, B:363:0x132f, B:365:0x1337, B:366:0x1342, B:368:0x134a, B:369:0x1355, B:371:0x135d, B:372:0x1368, B:374:0x1370, B:375:0x137b, B:377:0x137f, B:379:0x1383, B:381:0x138d, B:382:0x1392, B:384:0x1399, B:385:0x139c, B:387:0x13b3, B:388:0x13bb, B:394:0x13d9, B:399:0x13f4, B:401:0x13fb, B:402:0x1400, B:404:0x1404, B:405:0x143f, B:407:0x1445, B:408:0x144a, B:410:0x144f, B:411:0x1454, B:413:0x1458, B:414:0x1463, B:416:0x1467, B:417:0x147c, B:419:0x1495, B:420:0x149e, B:422:0x14a2, B:423:0x14b5, B:425:0x14b9, B:426:0x14d5, B:428:0x14d9, B:429:0x14de, B:431:0x14e2, B:432:0x14e7, B:434:0x14eb, B:435:0x14f1, B:437:0x14f5, B:438:0x1505, B:440:0x1518, B:441:0x151f, B:443:0x1529, B:446:0x153a, B:448:0x153f, B:449:0x155e, B:451:0x1566, B:452:0x158a, B:454:0x1591, B:455:0x1598, B:457:0x159d, B:459:0x15a8, B:465:0x15c2, B:467:0x15ca, B:469:0x15d4, B:470:0x15d6, B:481:0x1678, B:471:0x15d9, B:473:0x1643, B:475:0x1647, B:477:0x164f, B:478:0x1664, B:480:0x166a, B:482:0x167f, B:483:0x1684, B:485:0x1688, B:487:0x168c, B:488:0x168f, B:490:0x1695, B:491:0x169a, B:445:0x1533, B:462:0x15af, B:463:0x15b6, B:391:0x13cf, B:202:0x0f31, B:204:0x0f3c, B:205:0x0f44, B:207:0x0f4a, B:190:0x0eb2, B:191:0x0eec, B:193:0x0ef2, B:194:0x0f00, B:195:0x0f12, B:197:0x0f18, B:168:0x0e42, B:159:0x0b31, B:60:0x01a6, B:28:0x00c3, B:30:0x00cd, B:32:0x00d7, B:34:0x00e5, B:36:0x00f0, B:35:0x00ec), top: B:496:0x00ad }] */
    /* JADX WARN: Removed duplicated region for block: B:434:0x14eb A[Catch: JSONException -> 0x169e, TryCatch #0 {JSONException -> 0x169e, blocks: (B:23:0x00ad, B:25:0x00b1, B:27:0x00bc, B:29:0x00c7, B:38:0x00fc, B:40:0x0104, B:42:0x0108, B:43:0x0116, B:45:0x011e, B:46:0x012a, B:48:0x0130, B:50:0x0146, B:51:0x0158, B:53:0x015c, B:55:0x0164, B:56:0x0176, B:58:0x0195, B:63:0x01b2, B:65:0x01c5, B:66:0x01ca, B:68:0x01d2, B:69:0x01d6, B:71:0x01dc, B:72:0x01ea, B:74:0x01fb, B:76:0x020b, B:80:0x024d, B:82:0x0251, B:93:0x026e, B:95:0x0273, B:97:0x0277, B:99:0x0282, B:100:0x028f, B:106:0x02a0, B:109:0x02a8, B:110:0x02bc, B:112:0x02c2, B:113:0x02d1, B:114:0x02e7, B:116:0x02ed, B:117:0x02fb, B:120:0x032c, B:124:0x037d, B:128:0x03c4, B:131:0x06b9, B:135:0x06ca, B:139:0x06f7, B:141:0x09f9, B:142:0x09fb, B:144:0x0a05, B:145:0x0a07, B:147:0x0a11, B:148:0x0a13, B:156:0x0acb, B:160:0x0b3b, B:164:0x0ca9, B:167:0x0d14, B:171:0x0e50, B:173:0x0e70, B:175:0x0e76, B:176:0x0e7f, B:178:0x0e86, B:179:0x0e8b, B:181:0x0e95, B:182:0x0e9e, B:184:0x0ea6, B:186:0x0eaa, B:188:0x0eae, B:198:0x0f26, B:200:0x0f2b, B:208:0x0f5e, B:210:0x0f63, B:212:0x0f7f, B:213:0x0f87, B:215:0x0f8d, B:216:0x0fa1, B:217:0x0faa, B:219:0x0fb9, B:221:0x0fc1, B:223:0x0fd0, B:224:0x0fdb, B:226:0x0fe3, B:227:0x0fee, B:229:0x0ff6, B:230:0x1001, B:232:0x1009, B:233:0x1014, B:235:0x101c, B:236:0x1027, B:238:0x102f, B:239:0x103a, B:241:0x1042, B:242:0x104d, B:244:0x1055, B:245:0x1060, B:247:0x1066, B:248:0x106d, B:250:0x1075, B:251:0x1080, B:253:0x1086, B:254:0x108d, B:256:0x1095, B:257:0x10a0, B:259:0x10a8, B:260:0x10b3, B:262:0x10bb, B:263:0x10c6, B:265:0x10ce, B:266:0x10d9, B:268:0x10e1, B:269:0x10ec, B:271:0x10f2, B:272:0x10f9, B:274:0x1101, B:275:0x110c, B:277:0x1114, B:278:0x111f, B:280:0x1127, B:281:0x1132, B:283:0x1138, B:284:0x113f, B:286:0x1149, B:288:0x114f, B:290:0x115c, B:291:0x1167, B:293:0x116f, B:294:0x117a, B:296:0x1182, B:297:0x118d, B:299:0x1195, B:300:0x11a0, B:302:0x11a8, B:303:0x11b3, B:305:0x11bb, B:306:0x11c6, B:308:0x11ce, B:309:0x11d9, B:311:0x11e1, B:312:0x11ec, B:314:0x11f4, B:315:0x11ff, B:317:0x1207, B:318:0x1212, B:320:0x121a, B:321:0x1225, B:323:0x122d, B:324:0x1238, B:326:0x1240, B:327:0x124b, B:329:0x1253, B:330:0x125e, B:332:0x1266, B:333:0x1271, B:335:0x1279, B:336:0x1284, B:338:0x128c, B:339:0x1297, B:341:0x129f, B:342:0x12aa, B:344:0x12b2, B:345:0x12bd, B:347:0x12c5, B:348:0x12d0, B:350:0x12d8, B:351:0x12e3, B:353:0x12eb, B:354:0x12f6, B:356:0x12fe, B:357:0x1309, B:359:0x1311, B:360:0x131c, B:362:0x1324, B:363:0x132f, B:365:0x1337, B:366:0x1342, B:368:0x134a, B:369:0x1355, B:371:0x135d, B:372:0x1368, B:374:0x1370, B:375:0x137b, B:377:0x137f, B:379:0x1383, B:381:0x138d, B:382:0x1392, B:384:0x1399, B:385:0x139c, B:387:0x13b3, B:388:0x13bb, B:394:0x13d9, B:399:0x13f4, B:401:0x13fb, B:402:0x1400, B:404:0x1404, B:405:0x143f, B:407:0x1445, B:408:0x144a, B:410:0x144f, B:411:0x1454, B:413:0x1458, B:414:0x1463, B:416:0x1467, B:417:0x147c, B:419:0x1495, B:420:0x149e, B:422:0x14a2, B:423:0x14b5, B:425:0x14b9, B:426:0x14d5, B:428:0x14d9, B:429:0x14de, B:431:0x14e2, B:432:0x14e7, B:434:0x14eb, B:435:0x14f1, B:437:0x14f5, B:438:0x1505, B:440:0x1518, B:441:0x151f, B:443:0x1529, B:446:0x153a, B:448:0x153f, B:449:0x155e, B:451:0x1566, B:452:0x158a, B:454:0x1591, B:455:0x1598, B:457:0x159d, B:459:0x15a8, B:465:0x15c2, B:467:0x15ca, B:469:0x15d4, B:470:0x15d6, B:481:0x1678, B:471:0x15d9, B:473:0x1643, B:475:0x1647, B:477:0x164f, B:478:0x1664, B:480:0x166a, B:482:0x167f, B:483:0x1684, B:485:0x1688, B:487:0x168c, B:488:0x168f, B:490:0x1695, B:491:0x169a, B:445:0x1533, B:462:0x15af, B:463:0x15b6, B:391:0x13cf, B:202:0x0f31, B:204:0x0f3c, B:205:0x0f44, B:207:0x0f4a, B:190:0x0eb2, B:191:0x0eec, B:193:0x0ef2, B:194:0x0f00, B:195:0x0f12, B:197:0x0f18, B:168:0x0e42, B:159:0x0b31, B:60:0x01a6, B:28:0x00c3, B:30:0x00cd, B:32:0x00d7, B:34:0x00e5, B:36:0x00f0, B:35:0x00ec), top: B:496:0x00ad }] */
    /* JADX WARN: Removed duplicated region for block: B:437:0x14f5 A[Catch: JSONException -> 0x169e, TryCatch #0 {JSONException -> 0x169e, blocks: (B:23:0x00ad, B:25:0x00b1, B:27:0x00bc, B:29:0x00c7, B:38:0x00fc, B:40:0x0104, B:42:0x0108, B:43:0x0116, B:45:0x011e, B:46:0x012a, B:48:0x0130, B:50:0x0146, B:51:0x0158, B:53:0x015c, B:55:0x0164, B:56:0x0176, B:58:0x0195, B:63:0x01b2, B:65:0x01c5, B:66:0x01ca, B:68:0x01d2, B:69:0x01d6, B:71:0x01dc, B:72:0x01ea, B:74:0x01fb, B:76:0x020b, B:80:0x024d, B:82:0x0251, B:93:0x026e, B:95:0x0273, B:97:0x0277, B:99:0x0282, B:100:0x028f, B:106:0x02a0, B:109:0x02a8, B:110:0x02bc, B:112:0x02c2, B:113:0x02d1, B:114:0x02e7, B:116:0x02ed, B:117:0x02fb, B:120:0x032c, B:124:0x037d, B:128:0x03c4, B:131:0x06b9, B:135:0x06ca, B:139:0x06f7, B:141:0x09f9, B:142:0x09fb, B:144:0x0a05, B:145:0x0a07, B:147:0x0a11, B:148:0x0a13, B:156:0x0acb, B:160:0x0b3b, B:164:0x0ca9, B:167:0x0d14, B:171:0x0e50, B:173:0x0e70, B:175:0x0e76, B:176:0x0e7f, B:178:0x0e86, B:179:0x0e8b, B:181:0x0e95, B:182:0x0e9e, B:184:0x0ea6, B:186:0x0eaa, B:188:0x0eae, B:198:0x0f26, B:200:0x0f2b, B:208:0x0f5e, B:210:0x0f63, B:212:0x0f7f, B:213:0x0f87, B:215:0x0f8d, B:216:0x0fa1, B:217:0x0faa, B:219:0x0fb9, B:221:0x0fc1, B:223:0x0fd0, B:224:0x0fdb, B:226:0x0fe3, B:227:0x0fee, B:229:0x0ff6, B:230:0x1001, B:232:0x1009, B:233:0x1014, B:235:0x101c, B:236:0x1027, B:238:0x102f, B:239:0x103a, B:241:0x1042, B:242:0x104d, B:244:0x1055, B:245:0x1060, B:247:0x1066, B:248:0x106d, B:250:0x1075, B:251:0x1080, B:253:0x1086, B:254:0x108d, B:256:0x1095, B:257:0x10a0, B:259:0x10a8, B:260:0x10b3, B:262:0x10bb, B:263:0x10c6, B:265:0x10ce, B:266:0x10d9, B:268:0x10e1, B:269:0x10ec, B:271:0x10f2, B:272:0x10f9, B:274:0x1101, B:275:0x110c, B:277:0x1114, B:278:0x111f, B:280:0x1127, B:281:0x1132, B:283:0x1138, B:284:0x113f, B:286:0x1149, B:288:0x114f, B:290:0x115c, B:291:0x1167, B:293:0x116f, B:294:0x117a, B:296:0x1182, B:297:0x118d, B:299:0x1195, B:300:0x11a0, B:302:0x11a8, B:303:0x11b3, B:305:0x11bb, B:306:0x11c6, B:308:0x11ce, B:309:0x11d9, B:311:0x11e1, B:312:0x11ec, B:314:0x11f4, B:315:0x11ff, B:317:0x1207, B:318:0x1212, B:320:0x121a, B:321:0x1225, B:323:0x122d, B:324:0x1238, B:326:0x1240, B:327:0x124b, B:329:0x1253, B:330:0x125e, B:332:0x1266, B:333:0x1271, B:335:0x1279, B:336:0x1284, B:338:0x128c, B:339:0x1297, B:341:0x129f, B:342:0x12aa, B:344:0x12b2, B:345:0x12bd, B:347:0x12c5, B:348:0x12d0, B:350:0x12d8, B:351:0x12e3, B:353:0x12eb, B:354:0x12f6, B:356:0x12fe, B:357:0x1309, B:359:0x1311, B:360:0x131c, B:362:0x1324, B:363:0x132f, B:365:0x1337, B:366:0x1342, B:368:0x134a, B:369:0x1355, B:371:0x135d, B:372:0x1368, B:374:0x1370, B:375:0x137b, B:377:0x137f, B:379:0x1383, B:381:0x138d, B:382:0x1392, B:384:0x1399, B:385:0x139c, B:387:0x13b3, B:388:0x13bb, B:394:0x13d9, B:399:0x13f4, B:401:0x13fb, B:402:0x1400, B:404:0x1404, B:405:0x143f, B:407:0x1445, B:408:0x144a, B:410:0x144f, B:411:0x1454, B:413:0x1458, B:414:0x1463, B:416:0x1467, B:417:0x147c, B:419:0x1495, B:420:0x149e, B:422:0x14a2, B:423:0x14b5, B:425:0x14b9, B:426:0x14d5, B:428:0x14d9, B:429:0x14de, B:431:0x14e2, B:432:0x14e7, B:434:0x14eb, B:435:0x14f1, B:437:0x14f5, B:438:0x1505, B:440:0x1518, B:441:0x151f, B:443:0x1529, B:446:0x153a, B:448:0x153f, B:449:0x155e, B:451:0x1566, B:452:0x158a, B:454:0x1591, B:455:0x1598, B:457:0x159d, B:459:0x15a8, B:465:0x15c2, B:467:0x15ca, B:469:0x15d4, B:470:0x15d6, B:481:0x1678, B:471:0x15d9, B:473:0x1643, B:475:0x1647, B:477:0x164f, B:478:0x1664, B:480:0x166a, B:482:0x167f, B:483:0x1684, B:485:0x1688, B:487:0x168c, B:488:0x168f, B:490:0x1695, B:491:0x169a, B:445:0x1533, B:462:0x15af, B:463:0x15b6, B:391:0x13cf, B:202:0x0f31, B:204:0x0f3c, B:205:0x0f44, B:207:0x0f4a, B:190:0x0eb2, B:191:0x0eec, B:193:0x0ef2, B:194:0x0f00, B:195:0x0f12, B:197:0x0f18, B:168:0x0e42, B:159:0x0b31, B:60:0x01a6, B:28:0x00c3, B:30:0x00cd, B:32:0x00d7, B:34:0x00e5, B:36:0x00f0, B:35:0x00ec), top: B:496:0x00ad }] */
    /* JADX WARN: Removed duplicated region for block: B:440:0x1518 A[Catch: JSONException -> 0x169e, TryCatch #0 {JSONException -> 0x169e, blocks: (B:23:0x00ad, B:25:0x00b1, B:27:0x00bc, B:29:0x00c7, B:38:0x00fc, B:40:0x0104, B:42:0x0108, B:43:0x0116, B:45:0x011e, B:46:0x012a, B:48:0x0130, B:50:0x0146, B:51:0x0158, B:53:0x015c, B:55:0x0164, B:56:0x0176, B:58:0x0195, B:63:0x01b2, B:65:0x01c5, B:66:0x01ca, B:68:0x01d2, B:69:0x01d6, B:71:0x01dc, B:72:0x01ea, B:74:0x01fb, B:76:0x020b, B:80:0x024d, B:82:0x0251, B:93:0x026e, B:95:0x0273, B:97:0x0277, B:99:0x0282, B:100:0x028f, B:106:0x02a0, B:109:0x02a8, B:110:0x02bc, B:112:0x02c2, B:113:0x02d1, B:114:0x02e7, B:116:0x02ed, B:117:0x02fb, B:120:0x032c, B:124:0x037d, B:128:0x03c4, B:131:0x06b9, B:135:0x06ca, B:139:0x06f7, B:141:0x09f9, B:142:0x09fb, B:144:0x0a05, B:145:0x0a07, B:147:0x0a11, B:148:0x0a13, B:156:0x0acb, B:160:0x0b3b, B:164:0x0ca9, B:167:0x0d14, B:171:0x0e50, B:173:0x0e70, B:175:0x0e76, B:176:0x0e7f, B:178:0x0e86, B:179:0x0e8b, B:181:0x0e95, B:182:0x0e9e, B:184:0x0ea6, B:186:0x0eaa, B:188:0x0eae, B:198:0x0f26, B:200:0x0f2b, B:208:0x0f5e, B:210:0x0f63, B:212:0x0f7f, B:213:0x0f87, B:215:0x0f8d, B:216:0x0fa1, B:217:0x0faa, B:219:0x0fb9, B:221:0x0fc1, B:223:0x0fd0, B:224:0x0fdb, B:226:0x0fe3, B:227:0x0fee, B:229:0x0ff6, B:230:0x1001, B:232:0x1009, B:233:0x1014, B:235:0x101c, B:236:0x1027, B:238:0x102f, B:239:0x103a, B:241:0x1042, B:242:0x104d, B:244:0x1055, B:245:0x1060, B:247:0x1066, B:248:0x106d, B:250:0x1075, B:251:0x1080, B:253:0x1086, B:254:0x108d, B:256:0x1095, B:257:0x10a0, B:259:0x10a8, B:260:0x10b3, B:262:0x10bb, B:263:0x10c6, B:265:0x10ce, B:266:0x10d9, B:268:0x10e1, B:269:0x10ec, B:271:0x10f2, B:272:0x10f9, B:274:0x1101, B:275:0x110c, B:277:0x1114, B:278:0x111f, B:280:0x1127, B:281:0x1132, B:283:0x1138, B:284:0x113f, B:286:0x1149, B:288:0x114f, B:290:0x115c, B:291:0x1167, B:293:0x116f, B:294:0x117a, B:296:0x1182, B:297:0x118d, B:299:0x1195, B:300:0x11a0, B:302:0x11a8, B:303:0x11b3, B:305:0x11bb, B:306:0x11c6, B:308:0x11ce, B:309:0x11d9, B:311:0x11e1, B:312:0x11ec, B:314:0x11f4, B:315:0x11ff, B:317:0x1207, B:318:0x1212, B:320:0x121a, B:321:0x1225, B:323:0x122d, B:324:0x1238, B:326:0x1240, B:327:0x124b, B:329:0x1253, B:330:0x125e, B:332:0x1266, B:333:0x1271, B:335:0x1279, B:336:0x1284, B:338:0x128c, B:339:0x1297, B:341:0x129f, B:342:0x12aa, B:344:0x12b2, B:345:0x12bd, B:347:0x12c5, B:348:0x12d0, B:350:0x12d8, B:351:0x12e3, B:353:0x12eb, B:354:0x12f6, B:356:0x12fe, B:357:0x1309, B:359:0x1311, B:360:0x131c, B:362:0x1324, B:363:0x132f, B:365:0x1337, B:366:0x1342, B:368:0x134a, B:369:0x1355, B:371:0x135d, B:372:0x1368, B:374:0x1370, B:375:0x137b, B:377:0x137f, B:379:0x1383, B:381:0x138d, B:382:0x1392, B:384:0x1399, B:385:0x139c, B:387:0x13b3, B:388:0x13bb, B:394:0x13d9, B:399:0x13f4, B:401:0x13fb, B:402:0x1400, B:404:0x1404, B:405:0x143f, B:407:0x1445, B:408:0x144a, B:410:0x144f, B:411:0x1454, B:413:0x1458, B:414:0x1463, B:416:0x1467, B:417:0x147c, B:419:0x1495, B:420:0x149e, B:422:0x14a2, B:423:0x14b5, B:425:0x14b9, B:426:0x14d5, B:428:0x14d9, B:429:0x14de, B:431:0x14e2, B:432:0x14e7, B:434:0x14eb, B:435:0x14f1, B:437:0x14f5, B:438:0x1505, B:440:0x1518, B:441:0x151f, B:443:0x1529, B:446:0x153a, B:448:0x153f, B:449:0x155e, B:451:0x1566, B:452:0x158a, B:454:0x1591, B:455:0x1598, B:457:0x159d, B:459:0x15a8, B:465:0x15c2, B:467:0x15ca, B:469:0x15d4, B:470:0x15d6, B:481:0x1678, B:471:0x15d9, B:473:0x1643, B:475:0x1647, B:477:0x164f, B:478:0x1664, B:480:0x166a, B:482:0x167f, B:483:0x1684, B:485:0x1688, B:487:0x168c, B:488:0x168f, B:490:0x1695, B:491:0x169a, B:445:0x1533, B:462:0x15af, B:463:0x15b6, B:391:0x13cf, B:202:0x0f31, B:204:0x0f3c, B:205:0x0f44, B:207:0x0f4a, B:190:0x0eb2, B:191:0x0eec, B:193:0x0ef2, B:194:0x0f00, B:195:0x0f12, B:197:0x0f18, B:168:0x0e42, B:159:0x0b31, B:60:0x01a6, B:28:0x00c3, B:30:0x00cd, B:32:0x00d7, B:34:0x00e5, B:36:0x00f0, B:35:0x00ec), top: B:496:0x00ad }] */
    /* JADX WARN: Removed duplicated region for block: B:445:0x1533 A[Catch: JSONException -> 0x169e, TryCatch #0 {JSONException -> 0x169e, blocks: (B:23:0x00ad, B:25:0x00b1, B:27:0x00bc, B:29:0x00c7, B:38:0x00fc, B:40:0x0104, B:42:0x0108, B:43:0x0116, B:45:0x011e, B:46:0x012a, B:48:0x0130, B:50:0x0146, B:51:0x0158, B:53:0x015c, B:55:0x0164, B:56:0x0176, B:58:0x0195, B:63:0x01b2, B:65:0x01c5, B:66:0x01ca, B:68:0x01d2, B:69:0x01d6, B:71:0x01dc, B:72:0x01ea, B:74:0x01fb, B:76:0x020b, B:80:0x024d, B:82:0x0251, B:93:0x026e, B:95:0x0273, B:97:0x0277, B:99:0x0282, B:100:0x028f, B:106:0x02a0, B:109:0x02a8, B:110:0x02bc, B:112:0x02c2, B:113:0x02d1, B:114:0x02e7, B:116:0x02ed, B:117:0x02fb, B:120:0x032c, B:124:0x037d, B:128:0x03c4, B:131:0x06b9, B:135:0x06ca, B:139:0x06f7, B:141:0x09f9, B:142:0x09fb, B:144:0x0a05, B:145:0x0a07, B:147:0x0a11, B:148:0x0a13, B:156:0x0acb, B:160:0x0b3b, B:164:0x0ca9, B:167:0x0d14, B:171:0x0e50, B:173:0x0e70, B:175:0x0e76, B:176:0x0e7f, B:178:0x0e86, B:179:0x0e8b, B:181:0x0e95, B:182:0x0e9e, B:184:0x0ea6, B:186:0x0eaa, B:188:0x0eae, B:198:0x0f26, B:200:0x0f2b, B:208:0x0f5e, B:210:0x0f63, B:212:0x0f7f, B:213:0x0f87, B:215:0x0f8d, B:216:0x0fa1, B:217:0x0faa, B:219:0x0fb9, B:221:0x0fc1, B:223:0x0fd0, B:224:0x0fdb, B:226:0x0fe3, B:227:0x0fee, B:229:0x0ff6, B:230:0x1001, B:232:0x1009, B:233:0x1014, B:235:0x101c, B:236:0x1027, B:238:0x102f, B:239:0x103a, B:241:0x1042, B:242:0x104d, B:244:0x1055, B:245:0x1060, B:247:0x1066, B:248:0x106d, B:250:0x1075, B:251:0x1080, B:253:0x1086, B:254:0x108d, B:256:0x1095, B:257:0x10a0, B:259:0x10a8, B:260:0x10b3, B:262:0x10bb, B:263:0x10c6, B:265:0x10ce, B:266:0x10d9, B:268:0x10e1, B:269:0x10ec, B:271:0x10f2, B:272:0x10f9, B:274:0x1101, B:275:0x110c, B:277:0x1114, B:278:0x111f, B:280:0x1127, B:281:0x1132, B:283:0x1138, B:284:0x113f, B:286:0x1149, B:288:0x114f, B:290:0x115c, B:291:0x1167, B:293:0x116f, B:294:0x117a, B:296:0x1182, B:297:0x118d, B:299:0x1195, B:300:0x11a0, B:302:0x11a8, B:303:0x11b3, B:305:0x11bb, B:306:0x11c6, B:308:0x11ce, B:309:0x11d9, B:311:0x11e1, B:312:0x11ec, B:314:0x11f4, B:315:0x11ff, B:317:0x1207, B:318:0x1212, B:320:0x121a, B:321:0x1225, B:323:0x122d, B:324:0x1238, B:326:0x1240, B:327:0x124b, B:329:0x1253, B:330:0x125e, B:332:0x1266, B:333:0x1271, B:335:0x1279, B:336:0x1284, B:338:0x128c, B:339:0x1297, B:341:0x129f, B:342:0x12aa, B:344:0x12b2, B:345:0x12bd, B:347:0x12c5, B:348:0x12d0, B:350:0x12d8, B:351:0x12e3, B:353:0x12eb, B:354:0x12f6, B:356:0x12fe, B:357:0x1309, B:359:0x1311, B:360:0x131c, B:362:0x1324, B:363:0x132f, B:365:0x1337, B:366:0x1342, B:368:0x134a, B:369:0x1355, B:371:0x135d, B:372:0x1368, B:374:0x1370, B:375:0x137b, B:377:0x137f, B:379:0x1383, B:381:0x138d, B:382:0x1392, B:384:0x1399, B:385:0x139c, B:387:0x13b3, B:388:0x13bb, B:394:0x13d9, B:399:0x13f4, B:401:0x13fb, B:402:0x1400, B:404:0x1404, B:405:0x143f, B:407:0x1445, B:408:0x144a, B:410:0x144f, B:411:0x1454, B:413:0x1458, B:414:0x1463, B:416:0x1467, B:417:0x147c, B:419:0x1495, B:420:0x149e, B:422:0x14a2, B:423:0x14b5, B:425:0x14b9, B:426:0x14d5, B:428:0x14d9, B:429:0x14de, B:431:0x14e2, B:432:0x14e7, B:434:0x14eb, B:435:0x14f1, B:437:0x14f5, B:438:0x1505, B:440:0x1518, B:441:0x151f, B:443:0x1529, B:446:0x153a, B:448:0x153f, B:449:0x155e, B:451:0x1566, B:452:0x158a, B:454:0x1591, B:455:0x1598, B:457:0x159d, B:459:0x15a8, B:465:0x15c2, B:467:0x15ca, B:469:0x15d4, B:470:0x15d6, B:481:0x1678, B:471:0x15d9, B:473:0x1643, B:475:0x1647, B:477:0x164f, B:478:0x1664, B:480:0x166a, B:482:0x167f, B:483:0x1684, B:485:0x1688, B:487:0x168c, B:488:0x168f, B:490:0x1695, B:491:0x169a, B:445:0x1533, B:462:0x15af, B:463:0x15b6, B:391:0x13cf, B:202:0x0f31, B:204:0x0f3c, B:205:0x0f44, B:207:0x0f4a, B:190:0x0eb2, B:191:0x0eec, B:193:0x0ef2, B:194:0x0f00, B:195:0x0f12, B:197:0x0f18, B:168:0x0e42, B:159:0x0b31, B:60:0x01a6, B:28:0x00c3, B:30:0x00cd, B:32:0x00d7, B:34:0x00e5, B:36:0x00f0, B:35:0x00ec), top: B:496:0x00ad }] */
    /* JADX WARN: Removed duplicated region for block: B:448:0x153f A[Catch: JSONException -> 0x169e, TryCatch #0 {JSONException -> 0x169e, blocks: (B:23:0x00ad, B:25:0x00b1, B:27:0x00bc, B:29:0x00c7, B:38:0x00fc, B:40:0x0104, B:42:0x0108, B:43:0x0116, B:45:0x011e, B:46:0x012a, B:48:0x0130, B:50:0x0146, B:51:0x0158, B:53:0x015c, B:55:0x0164, B:56:0x0176, B:58:0x0195, B:63:0x01b2, B:65:0x01c5, B:66:0x01ca, B:68:0x01d2, B:69:0x01d6, B:71:0x01dc, B:72:0x01ea, B:74:0x01fb, B:76:0x020b, B:80:0x024d, B:82:0x0251, B:93:0x026e, B:95:0x0273, B:97:0x0277, B:99:0x0282, B:100:0x028f, B:106:0x02a0, B:109:0x02a8, B:110:0x02bc, B:112:0x02c2, B:113:0x02d1, B:114:0x02e7, B:116:0x02ed, B:117:0x02fb, B:120:0x032c, B:124:0x037d, B:128:0x03c4, B:131:0x06b9, B:135:0x06ca, B:139:0x06f7, B:141:0x09f9, B:142:0x09fb, B:144:0x0a05, B:145:0x0a07, B:147:0x0a11, B:148:0x0a13, B:156:0x0acb, B:160:0x0b3b, B:164:0x0ca9, B:167:0x0d14, B:171:0x0e50, B:173:0x0e70, B:175:0x0e76, B:176:0x0e7f, B:178:0x0e86, B:179:0x0e8b, B:181:0x0e95, B:182:0x0e9e, B:184:0x0ea6, B:186:0x0eaa, B:188:0x0eae, B:198:0x0f26, B:200:0x0f2b, B:208:0x0f5e, B:210:0x0f63, B:212:0x0f7f, B:213:0x0f87, B:215:0x0f8d, B:216:0x0fa1, B:217:0x0faa, B:219:0x0fb9, B:221:0x0fc1, B:223:0x0fd0, B:224:0x0fdb, B:226:0x0fe3, B:227:0x0fee, B:229:0x0ff6, B:230:0x1001, B:232:0x1009, B:233:0x1014, B:235:0x101c, B:236:0x1027, B:238:0x102f, B:239:0x103a, B:241:0x1042, B:242:0x104d, B:244:0x1055, B:245:0x1060, B:247:0x1066, B:248:0x106d, B:250:0x1075, B:251:0x1080, B:253:0x1086, B:254:0x108d, B:256:0x1095, B:257:0x10a0, B:259:0x10a8, B:260:0x10b3, B:262:0x10bb, B:263:0x10c6, B:265:0x10ce, B:266:0x10d9, B:268:0x10e1, B:269:0x10ec, B:271:0x10f2, B:272:0x10f9, B:274:0x1101, B:275:0x110c, B:277:0x1114, B:278:0x111f, B:280:0x1127, B:281:0x1132, B:283:0x1138, B:284:0x113f, B:286:0x1149, B:288:0x114f, B:290:0x115c, B:291:0x1167, B:293:0x116f, B:294:0x117a, B:296:0x1182, B:297:0x118d, B:299:0x1195, B:300:0x11a0, B:302:0x11a8, B:303:0x11b3, B:305:0x11bb, B:306:0x11c6, B:308:0x11ce, B:309:0x11d9, B:311:0x11e1, B:312:0x11ec, B:314:0x11f4, B:315:0x11ff, B:317:0x1207, B:318:0x1212, B:320:0x121a, B:321:0x1225, B:323:0x122d, B:324:0x1238, B:326:0x1240, B:327:0x124b, B:329:0x1253, B:330:0x125e, B:332:0x1266, B:333:0x1271, B:335:0x1279, B:336:0x1284, B:338:0x128c, B:339:0x1297, B:341:0x129f, B:342:0x12aa, B:344:0x12b2, B:345:0x12bd, B:347:0x12c5, B:348:0x12d0, B:350:0x12d8, B:351:0x12e3, B:353:0x12eb, B:354:0x12f6, B:356:0x12fe, B:357:0x1309, B:359:0x1311, B:360:0x131c, B:362:0x1324, B:363:0x132f, B:365:0x1337, B:366:0x1342, B:368:0x134a, B:369:0x1355, B:371:0x135d, B:372:0x1368, B:374:0x1370, B:375:0x137b, B:377:0x137f, B:379:0x1383, B:381:0x138d, B:382:0x1392, B:384:0x1399, B:385:0x139c, B:387:0x13b3, B:388:0x13bb, B:394:0x13d9, B:399:0x13f4, B:401:0x13fb, B:402:0x1400, B:404:0x1404, B:405:0x143f, B:407:0x1445, B:408:0x144a, B:410:0x144f, B:411:0x1454, B:413:0x1458, B:414:0x1463, B:416:0x1467, B:417:0x147c, B:419:0x1495, B:420:0x149e, B:422:0x14a2, B:423:0x14b5, B:425:0x14b9, B:426:0x14d5, B:428:0x14d9, B:429:0x14de, B:431:0x14e2, B:432:0x14e7, B:434:0x14eb, B:435:0x14f1, B:437:0x14f5, B:438:0x1505, B:440:0x1518, B:441:0x151f, B:443:0x1529, B:446:0x153a, B:448:0x153f, B:449:0x155e, B:451:0x1566, B:452:0x158a, B:454:0x1591, B:455:0x1598, B:457:0x159d, B:459:0x15a8, B:465:0x15c2, B:467:0x15ca, B:469:0x15d4, B:470:0x15d6, B:481:0x1678, B:471:0x15d9, B:473:0x1643, B:475:0x1647, B:477:0x164f, B:478:0x1664, B:480:0x166a, B:482:0x167f, B:483:0x1684, B:485:0x1688, B:487:0x168c, B:488:0x168f, B:490:0x1695, B:491:0x169a, B:445:0x1533, B:462:0x15af, B:463:0x15b6, B:391:0x13cf, B:202:0x0f31, B:204:0x0f3c, B:205:0x0f44, B:207:0x0f4a, B:190:0x0eb2, B:191:0x0eec, B:193:0x0ef2, B:194:0x0f00, B:195:0x0f12, B:197:0x0f18, B:168:0x0e42, B:159:0x0b31, B:60:0x01a6, B:28:0x00c3, B:30:0x00cd, B:32:0x00d7, B:34:0x00e5, B:36:0x00f0, B:35:0x00ec), top: B:496:0x00ad }] */
    /* JADX WARN: Removed duplicated region for block: B:451:0x1566 A[Catch: JSONException -> 0x169e, TryCatch #0 {JSONException -> 0x169e, blocks: (B:23:0x00ad, B:25:0x00b1, B:27:0x00bc, B:29:0x00c7, B:38:0x00fc, B:40:0x0104, B:42:0x0108, B:43:0x0116, B:45:0x011e, B:46:0x012a, B:48:0x0130, B:50:0x0146, B:51:0x0158, B:53:0x015c, B:55:0x0164, B:56:0x0176, B:58:0x0195, B:63:0x01b2, B:65:0x01c5, B:66:0x01ca, B:68:0x01d2, B:69:0x01d6, B:71:0x01dc, B:72:0x01ea, B:74:0x01fb, B:76:0x020b, B:80:0x024d, B:82:0x0251, B:93:0x026e, B:95:0x0273, B:97:0x0277, B:99:0x0282, B:100:0x028f, B:106:0x02a0, B:109:0x02a8, B:110:0x02bc, B:112:0x02c2, B:113:0x02d1, B:114:0x02e7, B:116:0x02ed, B:117:0x02fb, B:120:0x032c, B:124:0x037d, B:128:0x03c4, B:131:0x06b9, B:135:0x06ca, B:139:0x06f7, B:141:0x09f9, B:142:0x09fb, B:144:0x0a05, B:145:0x0a07, B:147:0x0a11, B:148:0x0a13, B:156:0x0acb, B:160:0x0b3b, B:164:0x0ca9, B:167:0x0d14, B:171:0x0e50, B:173:0x0e70, B:175:0x0e76, B:176:0x0e7f, B:178:0x0e86, B:179:0x0e8b, B:181:0x0e95, B:182:0x0e9e, B:184:0x0ea6, B:186:0x0eaa, B:188:0x0eae, B:198:0x0f26, B:200:0x0f2b, B:208:0x0f5e, B:210:0x0f63, B:212:0x0f7f, B:213:0x0f87, B:215:0x0f8d, B:216:0x0fa1, B:217:0x0faa, B:219:0x0fb9, B:221:0x0fc1, B:223:0x0fd0, B:224:0x0fdb, B:226:0x0fe3, B:227:0x0fee, B:229:0x0ff6, B:230:0x1001, B:232:0x1009, B:233:0x1014, B:235:0x101c, B:236:0x1027, B:238:0x102f, B:239:0x103a, B:241:0x1042, B:242:0x104d, B:244:0x1055, B:245:0x1060, B:247:0x1066, B:248:0x106d, B:250:0x1075, B:251:0x1080, B:253:0x1086, B:254:0x108d, B:256:0x1095, B:257:0x10a0, B:259:0x10a8, B:260:0x10b3, B:262:0x10bb, B:263:0x10c6, B:265:0x10ce, B:266:0x10d9, B:268:0x10e1, B:269:0x10ec, B:271:0x10f2, B:272:0x10f9, B:274:0x1101, B:275:0x110c, B:277:0x1114, B:278:0x111f, B:280:0x1127, B:281:0x1132, B:283:0x1138, B:284:0x113f, B:286:0x1149, B:288:0x114f, B:290:0x115c, B:291:0x1167, B:293:0x116f, B:294:0x117a, B:296:0x1182, B:297:0x118d, B:299:0x1195, B:300:0x11a0, B:302:0x11a8, B:303:0x11b3, B:305:0x11bb, B:306:0x11c6, B:308:0x11ce, B:309:0x11d9, B:311:0x11e1, B:312:0x11ec, B:314:0x11f4, B:315:0x11ff, B:317:0x1207, B:318:0x1212, B:320:0x121a, B:321:0x1225, B:323:0x122d, B:324:0x1238, B:326:0x1240, B:327:0x124b, B:329:0x1253, B:330:0x125e, B:332:0x1266, B:333:0x1271, B:335:0x1279, B:336:0x1284, B:338:0x128c, B:339:0x1297, B:341:0x129f, B:342:0x12aa, B:344:0x12b2, B:345:0x12bd, B:347:0x12c5, B:348:0x12d0, B:350:0x12d8, B:351:0x12e3, B:353:0x12eb, B:354:0x12f6, B:356:0x12fe, B:357:0x1309, B:359:0x1311, B:360:0x131c, B:362:0x1324, B:363:0x132f, B:365:0x1337, B:366:0x1342, B:368:0x134a, B:369:0x1355, B:371:0x135d, B:372:0x1368, B:374:0x1370, B:375:0x137b, B:377:0x137f, B:379:0x1383, B:381:0x138d, B:382:0x1392, B:384:0x1399, B:385:0x139c, B:387:0x13b3, B:388:0x13bb, B:394:0x13d9, B:399:0x13f4, B:401:0x13fb, B:402:0x1400, B:404:0x1404, B:405:0x143f, B:407:0x1445, B:408:0x144a, B:410:0x144f, B:411:0x1454, B:413:0x1458, B:414:0x1463, B:416:0x1467, B:417:0x147c, B:419:0x1495, B:420:0x149e, B:422:0x14a2, B:423:0x14b5, B:425:0x14b9, B:426:0x14d5, B:428:0x14d9, B:429:0x14de, B:431:0x14e2, B:432:0x14e7, B:434:0x14eb, B:435:0x14f1, B:437:0x14f5, B:438:0x1505, B:440:0x1518, B:441:0x151f, B:443:0x1529, B:446:0x153a, B:448:0x153f, B:449:0x155e, B:451:0x1566, B:452:0x158a, B:454:0x1591, B:455:0x1598, B:457:0x159d, B:459:0x15a8, B:465:0x15c2, B:467:0x15ca, B:469:0x15d4, B:470:0x15d6, B:481:0x1678, B:471:0x15d9, B:473:0x1643, B:475:0x1647, B:477:0x164f, B:478:0x1664, B:480:0x166a, B:482:0x167f, B:483:0x1684, B:485:0x1688, B:487:0x168c, B:488:0x168f, B:490:0x1695, B:491:0x169a, B:445:0x1533, B:462:0x15af, B:463:0x15b6, B:391:0x13cf, B:202:0x0f31, B:204:0x0f3c, B:205:0x0f44, B:207:0x0f4a, B:190:0x0eb2, B:191:0x0eec, B:193:0x0ef2, B:194:0x0f00, B:195:0x0f12, B:197:0x0f18, B:168:0x0e42, B:159:0x0b31, B:60:0x01a6, B:28:0x00c3, B:30:0x00cd, B:32:0x00d7, B:34:0x00e5, B:36:0x00f0, B:35:0x00ec), top: B:496:0x00ad }] */
    /* JADX WARN: Removed duplicated region for block: B:454:0x1591 A[Catch: JSONException -> 0x169e, TryCatch #0 {JSONException -> 0x169e, blocks: (B:23:0x00ad, B:25:0x00b1, B:27:0x00bc, B:29:0x00c7, B:38:0x00fc, B:40:0x0104, B:42:0x0108, B:43:0x0116, B:45:0x011e, B:46:0x012a, B:48:0x0130, B:50:0x0146, B:51:0x0158, B:53:0x015c, B:55:0x0164, B:56:0x0176, B:58:0x0195, B:63:0x01b2, B:65:0x01c5, B:66:0x01ca, B:68:0x01d2, B:69:0x01d6, B:71:0x01dc, B:72:0x01ea, B:74:0x01fb, B:76:0x020b, B:80:0x024d, B:82:0x0251, B:93:0x026e, B:95:0x0273, B:97:0x0277, B:99:0x0282, B:100:0x028f, B:106:0x02a0, B:109:0x02a8, B:110:0x02bc, B:112:0x02c2, B:113:0x02d1, B:114:0x02e7, B:116:0x02ed, B:117:0x02fb, B:120:0x032c, B:124:0x037d, B:128:0x03c4, B:131:0x06b9, B:135:0x06ca, B:139:0x06f7, B:141:0x09f9, B:142:0x09fb, B:144:0x0a05, B:145:0x0a07, B:147:0x0a11, B:148:0x0a13, B:156:0x0acb, B:160:0x0b3b, B:164:0x0ca9, B:167:0x0d14, B:171:0x0e50, B:173:0x0e70, B:175:0x0e76, B:176:0x0e7f, B:178:0x0e86, B:179:0x0e8b, B:181:0x0e95, B:182:0x0e9e, B:184:0x0ea6, B:186:0x0eaa, B:188:0x0eae, B:198:0x0f26, B:200:0x0f2b, B:208:0x0f5e, B:210:0x0f63, B:212:0x0f7f, B:213:0x0f87, B:215:0x0f8d, B:216:0x0fa1, B:217:0x0faa, B:219:0x0fb9, B:221:0x0fc1, B:223:0x0fd0, B:224:0x0fdb, B:226:0x0fe3, B:227:0x0fee, B:229:0x0ff6, B:230:0x1001, B:232:0x1009, B:233:0x1014, B:235:0x101c, B:236:0x1027, B:238:0x102f, B:239:0x103a, B:241:0x1042, B:242:0x104d, B:244:0x1055, B:245:0x1060, B:247:0x1066, B:248:0x106d, B:250:0x1075, B:251:0x1080, B:253:0x1086, B:254:0x108d, B:256:0x1095, B:257:0x10a0, B:259:0x10a8, B:260:0x10b3, B:262:0x10bb, B:263:0x10c6, B:265:0x10ce, B:266:0x10d9, B:268:0x10e1, B:269:0x10ec, B:271:0x10f2, B:272:0x10f9, B:274:0x1101, B:275:0x110c, B:277:0x1114, B:278:0x111f, B:280:0x1127, B:281:0x1132, B:283:0x1138, B:284:0x113f, B:286:0x1149, B:288:0x114f, B:290:0x115c, B:291:0x1167, B:293:0x116f, B:294:0x117a, B:296:0x1182, B:297:0x118d, B:299:0x1195, B:300:0x11a0, B:302:0x11a8, B:303:0x11b3, B:305:0x11bb, B:306:0x11c6, B:308:0x11ce, B:309:0x11d9, B:311:0x11e1, B:312:0x11ec, B:314:0x11f4, B:315:0x11ff, B:317:0x1207, B:318:0x1212, B:320:0x121a, B:321:0x1225, B:323:0x122d, B:324:0x1238, B:326:0x1240, B:327:0x124b, B:329:0x1253, B:330:0x125e, B:332:0x1266, B:333:0x1271, B:335:0x1279, B:336:0x1284, B:338:0x128c, B:339:0x1297, B:341:0x129f, B:342:0x12aa, B:344:0x12b2, B:345:0x12bd, B:347:0x12c5, B:348:0x12d0, B:350:0x12d8, B:351:0x12e3, B:353:0x12eb, B:354:0x12f6, B:356:0x12fe, B:357:0x1309, B:359:0x1311, B:360:0x131c, B:362:0x1324, B:363:0x132f, B:365:0x1337, B:366:0x1342, B:368:0x134a, B:369:0x1355, B:371:0x135d, B:372:0x1368, B:374:0x1370, B:375:0x137b, B:377:0x137f, B:379:0x1383, B:381:0x138d, B:382:0x1392, B:384:0x1399, B:385:0x139c, B:387:0x13b3, B:388:0x13bb, B:394:0x13d9, B:399:0x13f4, B:401:0x13fb, B:402:0x1400, B:404:0x1404, B:405:0x143f, B:407:0x1445, B:408:0x144a, B:410:0x144f, B:411:0x1454, B:413:0x1458, B:414:0x1463, B:416:0x1467, B:417:0x147c, B:419:0x1495, B:420:0x149e, B:422:0x14a2, B:423:0x14b5, B:425:0x14b9, B:426:0x14d5, B:428:0x14d9, B:429:0x14de, B:431:0x14e2, B:432:0x14e7, B:434:0x14eb, B:435:0x14f1, B:437:0x14f5, B:438:0x1505, B:440:0x1518, B:441:0x151f, B:443:0x1529, B:446:0x153a, B:448:0x153f, B:449:0x155e, B:451:0x1566, B:452:0x158a, B:454:0x1591, B:455:0x1598, B:457:0x159d, B:459:0x15a8, B:465:0x15c2, B:467:0x15ca, B:469:0x15d4, B:470:0x15d6, B:481:0x1678, B:471:0x15d9, B:473:0x1643, B:475:0x1647, B:477:0x164f, B:478:0x1664, B:480:0x166a, B:482:0x167f, B:483:0x1684, B:485:0x1688, B:487:0x168c, B:488:0x168f, B:490:0x1695, B:491:0x169a, B:445:0x1533, B:462:0x15af, B:463:0x15b6, B:391:0x13cf, B:202:0x0f31, B:204:0x0f3c, B:205:0x0f44, B:207:0x0f4a, B:190:0x0eb2, B:191:0x0eec, B:193:0x0ef2, B:194:0x0f00, B:195:0x0f12, B:197:0x0f18, B:168:0x0e42, B:159:0x0b31, B:60:0x01a6, B:28:0x00c3, B:30:0x00cd, B:32:0x00d7, B:34:0x00e5, B:36:0x00f0, B:35:0x00ec), top: B:496:0x00ad }] */
    /* JADX WARN: Removed duplicated region for block: B:457:0x159d A[Catch: JSONException -> 0x169e, TryCatch #0 {JSONException -> 0x169e, blocks: (B:23:0x00ad, B:25:0x00b1, B:27:0x00bc, B:29:0x00c7, B:38:0x00fc, B:40:0x0104, B:42:0x0108, B:43:0x0116, B:45:0x011e, B:46:0x012a, B:48:0x0130, B:50:0x0146, B:51:0x0158, B:53:0x015c, B:55:0x0164, B:56:0x0176, B:58:0x0195, B:63:0x01b2, B:65:0x01c5, B:66:0x01ca, B:68:0x01d2, B:69:0x01d6, B:71:0x01dc, B:72:0x01ea, B:74:0x01fb, B:76:0x020b, B:80:0x024d, B:82:0x0251, B:93:0x026e, B:95:0x0273, B:97:0x0277, B:99:0x0282, B:100:0x028f, B:106:0x02a0, B:109:0x02a8, B:110:0x02bc, B:112:0x02c2, B:113:0x02d1, B:114:0x02e7, B:116:0x02ed, B:117:0x02fb, B:120:0x032c, B:124:0x037d, B:128:0x03c4, B:131:0x06b9, B:135:0x06ca, B:139:0x06f7, B:141:0x09f9, B:142:0x09fb, B:144:0x0a05, B:145:0x0a07, B:147:0x0a11, B:148:0x0a13, B:156:0x0acb, B:160:0x0b3b, B:164:0x0ca9, B:167:0x0d14, B:171:0x0e50, B:173:0x0e70, B:175:0x0e76, B:176:0x0e7f, B:178:0x0e86, B:179:0x0e8b, B:181:0x0e95, B:182:0x0e9e, B:184:0x0ea6, B:186:0x0eaa, B:188:0x0eae, B:198:0x0f26, B:200:0x0f2b, B:208:0x0f5e, B:210:0x0f63, B:212:0x0f7f, B:213:0x0f87, B:215:0x0f8d, B:216:0x0fa1, B:217:0x0faa, B:219:0x0fb9, B:221:0x0fc1, B:223:0x0fd0, B:224:0x0fdb, B:226:0x0fe3, B:227:0x0fee, B:229:0x0ff6, B:230:0x1001, B:232:0x1009, B:233:0x1014, B:235:0x101c, B:236:0x1027, B:238:0x102f, B:239:0x103a, B:241:0x1042, B:242:0x104d, B:244:0x1055, B:245:0x1060, B:247:0x1066, B:248:0x106d, B:250:0x1075, B:251:0x1080, B:253:0x1086, B:254:0x108d, B:256:0x1095, B:257:0x10a0, B:259:0x10a8, B:260:0x10b3, B:262:0x10bb, B:263:0x10c6, B:265:0x10ce, B:266:0x10d9, B:268:0x10e1, B:269:0x10ec, B:271:0x10f2, B:272:0x10f9, B:274:0x1101, B:275:0x110c, B:277:0x1114, B:278:0x111f, B:280:0x1127, B:281:0x1132, B:283:0x1138, B:284:0x113f, B:286:0x1149, B:288:0x114f, B:290:0x115c, B:291:0x1167, B:293:0x116f, B:294:0x117a, B:296:0x1182, B:297:0x118d, B:299:0x1195, B:300:0x11a0, B:302:0x11a8, B:303:0x11b3, B:305:0x11bb, B:306:0x11c6, B:308:0x11ce, B:309:0x11d9, B:311:0x11e1, B:312:0x11ec, B:314:0x11f4, B:315:0x11ff, B:317:0x1207, B:318:0x1212, B:320:0x121a, B:321:0x1225, B:323:0x122d, B:324:0x1238, B:326:0x1240, B:327:0x124b, B:329:0x1253, B:330:0x125e, B:332:0x1266, B:333:0x1271, B:335:0x1279, B:336:0x1284, B:338:0x128c, B:339:0x1297, B:341:0x129f, B:342:0x12aa, B:344:0x12b2, B:345:0x12bd, B:347:0x12c5, B:348:0x12d0, B:350:0x12d8, B:351:0x12e3, B:353:0x12eb, B:354:0x12f6, B:356:0x12fe, B:357:0x1309, B:359:0x1311, B:360:0x131c, B:362:0x1324, B:363:0x132f, B:365:0x1337, B:366:0x1342, B:368:0x134a, B:369:0x1355, B:371:0x135d, B:372:0x1368, B:374:0x1370, B:375:0x137b, B:377:0x137f, B:379:0x1383, B:381:0x138d, B:382:0x1392, B:384:0x1399, B:385:0x139c, B:387:0x13b3, B:388:0x13bb, B:394:0x13d9, B:399:0x13f4, B:401:0x13fb, B:402:0x1400, B:404:0x1404, B:405:0x143f, B:407:0x1445, B:408:0x144a, B:410:0x144f, B:411:0x1454, B:413:0x1458, B:414:0x1463, B:416:0x1467, B:417:0x147c, B:419:0x1495, B:420:0x149e, B:422:0x14a2, B:423:0x14b5, B:425:0x14b9, B:426:0x14d5, B:428:0x14d9, B:429:0x14de, B:431:0x14e2, B:432:0x14e7, B:434:0x14eb, B:435:0x14f1, B:437:0x14f5, B:438:0x1505, B:440:0x1518, B:441:0x151f, B:443:0x1529, B:446:0x153a, B:448:0x153f, B:449:0x155e, B:451:0x1566, B:452:0x158a, B:454:0x1591, B:455:0x1598, B:457:0x159d, B:459:0x15a8, B:465:0x15c2, B:467:0x15ca, B:469:0x15d4, B:470:0x15d6, B:481:0x1678, B:471:0x15d9, B:473:0x1643, B:475:0x1647, B:477:0x164f, B:478:0x1664, B:480:0x166a, B:482:0x167f, B:483:0x1684, B:485:0x1688, B:487:0x168c, B:488:0x168f, B:490:0x1695, B:491:0x169a, B:445:0x1533, B:462:0x15af, B:463:0x15b6, B:391:0x13cf, B:202:0x0f31, B:204:0x0f3c, B:205:0x0f44, B:207:0x0f4a, B:190:0x0eb2, B:191:0x0eec, B:193:0x0ef2, B:194:0x0f00, B:195:0x0f12, B:197:0x0f18, B:168:0x0e42, B:159:0x0b31, B:60:0x01a6, B:28:0x00c3, B:30:0x00cd, B:32:0x00d7, B:34:0x00e5, B:36:0x00f0, B:35:0x00ec), top: B:496:0x00ad }] */
    /* JADX WARN: Removed duplicated region for block: B:462:0x15af A[Catch: JSONException -> 0x169e, TryCatch #0 {JSONException -> 0x169e, blocks: (B:23:0x00ad, B:25:0x00b1, B:27:0x00bc, B:29:0x00c7, B:38:0x00fc, B:40:0x0104, B:42:0x0108, B:43:0x0116, B:45:0x011e, B:46:0x012a, B:48:0x0130, B:50:0x0146, B:51:0x0158, B:53:0x015c, B:55:0x0164, B:56:0x0176, B:58:0x0195, B:63:0x01b2, B:65:0x01c5, B:66:0x01ca, B:68:0x01d2, B:69:0x01d6, B:71:0x01dc, B:72:0x01ea, B:74:0x01fb, B:76:0x020b, B:80:0x024d, B:82:0x0251, B:93:0x026e, B:95:0x0273, B:97:0x0277, B:99:0x0282, B:100:0x028f, B:106:0x02a0, B:109:0x02a8, B:110:0x02bc, B:112:0x02c2, B:113:0x02d1, B:114:0x02e7, B:116:0x02ed, B:117:0x02fb, B:120:0x032c, B:124:0x037d, B:128:0x03c4, B:131:0x06b9, B:135:0x06ca, B:139:0x06f7, B:141:0x09f9, B:142:0x09fb, B:144:0x0a05, B:145:0x0a07, B:147:0x0a11, B:148:0x0a13, B:156:0x0acb, B:160:0x0b3b, B:164:0x0ca9, B:167:0x0d14, B:171:0x0e50, B:173:0x0e70, B:175:0x0e76, B:176:0x0e7f, B:178:0x0e86, B:179:0x0e8b, B:181:0x0e95, B:182:0x0e9e, B:184:0x0ea6, B:186:0x0eaa, B:188:0x0eae, B:198:0x0f26, B:200:0x0f2b, B:208:0x0f5e, B:210:0x0f63, B:212:0x0f7f, B:213:0x0f87, B:215:0x0f8d, B:216:0x0fa1, B:217:0x0faa, B:219:0x0fb9, B:221:0x0fc1, B:223:0x0fd0, B:224:0x0fdb, B:226:0x0fe3, B:227:0x0fee, B:229:0x0ff6, B:230:0x1001, B:232:0x1009, B:233:0x1014, B:235:0x101c, B:236:0x1027, B:238:0x102f, B:239:0x103a, B:241:0x1042, B:242:0x104d, B:244:0x1055, B:245:0x1060, B:247:0x1066, B:248:0x106d, B:250:0x1075, B:251:0x1080, B:253:0x1086, B:254:0x108d, B:256:0x1095, B:257:0x10a0, B:259:0x10a8, B:260:0x10b3, B:262:0x10bb, B:263:0x10c6, B:265:0x10ce, B:266:0x10d9, B:268:0x10e1, B:269:0x10ec, B:271:0x10f2, B:272:0x10f9, B:274:0x1101, B:275:0x110c, B:277:0x1114, B:278:0x111f, B:280:0x1127, B:281:0x1132, B:283:0x1138, B:284:0x113f, B:286:0x1149, B:288:0x114f, B:290:0x115c, B:291:0x1167, B:293:0x116f, B:294:0x117a, B:296:0x1182, B:297:0x118d, B:299:0x1195, B:300:0x11a0, B:302:0x11a8, B:303:0x11b3, B:305:0x11bb, B:306:0x11c6, B:308:0x11ce, B:309:0x11d9, B:311:0x11e1, B:312:0x11ec, B:314:0x11f4, B:315:0x11ff, B:317:0x1207, B:318:0x1212, B:320:0x121a, B:321:0x1225, B:323:0x122d, B:324:0x1238, B:326:0x1240, B:327:0x124b, B:329:0x1253, B:330:0x125e, B:332:0x1266, B:333:0x1271, B:335:0x1279, B:336:0x1284, B:338:0x128c, B:339:0x1297, B:341:0x129f, B:342:0x12aa, B:344:0x12b2, B:345:0x12bd, B:347:0x12c5, B:348:0x12d0, B:350:0x12d8, B:351:0x12e3, B:353:0x12eb, B:354:0x12f6, B:356:0x12fe, B:357:0x1309, B:359:0x1311, B:360:0x131c, B:362:0x1324, B:363:0x132f, B:365:0x1337, B:366:0x1342, B:368:0x134a, B:369:0x1355, B:371:0x135d, B:372:0x1368, B:374:0x1370, B:375:0x137b, B:377:0x137f, B:379:0x1383, B:381:0x138d, B:382:0x1392, B:384:0x1399, B:385:0x139c, B:387:0x13b3, B:388:0x13bb, B:394:0x13d9, B:399:0x13f4, B:401:0x13fb, B:402:0x1400, B:404:0x1404, B:405:0x143f, B:407:0x1445, B:408:0x144a, B:410:0x144f, B:411:0x1454, B:413:0x1458, B:414:0x1463, B:416:0x1467, B:417:0x147c, B:419:0x1495, B:420:0x149e, B:422:0x14a2, B:423:0x14b5, B:425:0x14b9, B:426:0x14d5, B:428:0x14d9, B:429:0x14de, B:431:0x14e2, B:432:0x14e7, B:434:0x14eb, B:435:0x14f1, B:437:0x14f5, B:438:0x1505, B:440:0x1518, B:441:0x151f, B:443:0x1529, B:446:0x153a, B:448:0x153f, B:449:0x155e, B:451:0x1566, B:452:0x158a, B:454:0x1591, B:455:0x1598, B:457:0x159d, B:459:0x15a8, B:465:0x15c2, B:467:0x15ca, B:469:0x15d4, B:470:0x15d6, B:481:0x1678, B:471:0x15d9, B:473:0x1643, B:475:0x1647, B:477:0x164f, B:478:0x1664, B:480:0x166a, B:482:0x167f, B:483:0x1684, B:485:0x1688, B:487:0x168c, B:488:0x168f, B:490:0x1695, B:491:0x169a, B:445:0x1533, B:462:0x15af, B:463:0x15b6, B:391:0x13cf, B:202:0x0f31, B:204:0x0f3c, B:205:0x0f44, B:207:0x0f4a, B:190:0x0eb2, B:191:0x0eec, B:193:0x0ef2, B:194:0x0f00, B:195:0x0f12, B:197:0x0f18, B:168:0x0e42, B:159:0x0b31, B:60:0x01a6, B:28:0x00c3, B:30:0x00cd, B:32:0x00d7, B:34:0x00e5, B:36:0x00f0, B:35:0x00ec), top: B:496:0x00ad }] */
    /* JADX WARN: Removed duplicated region for block: B:463:0x15b6 A[Catch: JSONException -> 0x169e, TryCatch #0 {JSONException -> 0x169e, blocks: (B:23:0x00ad, B:25:0x00b1, B:27:0x00bc, B:29:0x00c7, B:38:0x00fc, B:40:0x0104, B:42:0x0108, B:43:0x0116, B:45:0x011e, B:46:0x012a, B:48:0x0130, B:50:0x0146, B:51:0x0158, B:53:0x015c, B:55:0x0164, B:56:0x0176, B:58:0x0195, B:63:0x01b2, B:65:0x01c5, B:66:0x01ca, B:68:0x01d2, B:69:0x01d6, B:71:0x01dc, B:72:0x01ea, B:74:0x01fb, B:76:0x020b, B:80:0x024d, B:82:0x0251, B:93:0x026e, B:95:0x0273, B:97:0x0277, B:99:0x0282, B:100:0x028f, B:106:0x02a0, B:109:0x02a8, B:110:0x02bc, B:112:0x02c2, B:113:0x02d1, B:114:0x02e7, B:116:0x02ed, B:117:0x02fb, B:120:0x032c, B:124:0x037d, B:128:0x03c4, B:131:0x06b9, B:135:0x06ca, B:139:0x06f7, B:141:0x09f9, B:142:0x09fb, B:144:0x0a05, B:145:0x0a07, B:147:0x0a11, B:148:0x0a13, B:156:0x0acb, B:160:0x0b3b, B:164:0x0ca9, B:167:0x0d14, B:171:0x0e50, B:173:0x0e70, B:175:0x0e76, B:176:0x0e7f, B:178:0x0e86, B:179:0x0e8b, B:181:0x0e95, B:182:0x0e9e, B:184:0x0ea6, B:186:0x0eaa, B:188:0x0eae, B:198:0x0f26, B:200:0x0f2b, B:208:0x0f5e, B:210:0x0f63, B:212:0x0f7f, B:213:0x0f87, B:215:0x0f8d, B:216:0x0fa1, B:217:0x0faa, B:219:0x0fb9, B:221:0x0fc1, B:223:0x0fd0, B:224:0x0fdb, B:226:0x0fe3, B:227:0x0fee, B:229:0x0ff6, B:230:0x1001, B:232:0x1009, B:233:0x1014, B:235:0x101c, B:236:0x1027, B:238:0x102f, B:239:0x103a, B:241:0x1042, B:242:0x104d, B:244:0x1055, B:245:0x1060, B:247:0x1066, B:248:0x106d, B:250:0x1075, B:251:0x1080, B:253:0x1086, B:254:0x108d, B:256:0x1095, B:257:0x10a0, B:259:0x10a8, B:260:0x10b3, B:262:0x10bb, B:263:0x10c6, B:265:0x10ce, B:266:0x10d9, B:268:0x10e1, B:269:0x10ec, B:271:0x10f2, B:272:0x10f9, B:274:0x1101, B:275:0x110c, B:277:0x1114, B:278:0x111f, B:280:0x1127, B:281:0x1132, B:283:0x1138, B:284:0x113f, B:286:0x1149, B:288:0x114f, B:290:0x115c, B:291:0x1167, B:293:0x116f, B:294:0x117a, B:296:0x1182, B:297:0x118d, B:299:0x1195, B:300:0x11a0, B:302:0x11a8, B:303:0x11b3, B:305:0x11bb, B:306:0x11c6, B:308:0x11ce, B:309:0x11d9, B:311:0x11e1, B:312:0x11ec, B:314:0x11f4, B:315:0x11ff, B:317:0x1207, B:318:0x1212, B:320:0x121a, B:321:0x1225, B:323:0x122d, B:324:0x1238, B:326:0x1240, B:327:0x124b, B:329:0x1253, B:330:0x125e, B:332:0x1266, B:333:0x1271, B:335:0x1279, B:336:0x1284, B:338:0x128c, B:339:0x1297, B:341:0x129f, B:342:0x12aa, B:344:0x12b2, B:345:0x12bd, B:347:0x12c5, B:348:0x12d0, B:350:0x12d8, B:351:0x12e3, B:353:0x12eb, B:354:0x12f6, B:356:0x12fe, B:357:0x1309, B:359:0x1311, B:360:0x131c, B:362:0x1324, B:363:0x132f, B:365:0x1337, B:366:0x1342, B:368:0x134a, B:369:0x1355, B:371:0x135d, B:372:0x1368, B:374:0x1370, B:375:0x137b, B:377:0x137f, B:379:0x1383, B:381:0x138d, B:382:0x1392, B:384:0x1399, B:385:0x139c, B:387:0x13b3, B:388:0x13bb, B:394:0x13d9, B:399:0x13f4, B:401:0x13fb, B:402:0x1400, B:404:0x1404, B:405:0x143f, B:407:0x1445, B:408:0x144a, B:410:0x144f, B:411:0x1454, B:413:0x1458, B:414:0x1463, B:416:0x1467, B:417:0x147c, B:419:0x1495, B:420:0x149e, B:422:0x14a2, B:423:0x14b5, B:425:0x14b9, B:426:0x14d5, B:428:0x14d9, B:429:0x14de, B:431:0x14e2, B:432:0x14e7, B:434:0x14eb, B:435:0x14f1, B:437:0x14f5, B:438:0x1505, B:440:0x1518, B:441:0x151f, B:443:0x1529, B:446:0x153a, B:448:0x153f, B:449:0x155e, B:451:0x1566, B:452:0x158a, B:454:0x1591, B:455:0x1598, B:457:0x159d, B:459:0x15a8, B:465:0x15c2, B:467:0x15ca, B:469:0x15d4, B:470:0x15d6, B:481:0x1678, B:471:0x15d9, B:473:0x1643, B:475:0x1647, B:477:0x164f, B:478:0x1664, B:480:0x166a, B:482:0x167f, B:483:0x1684, B:485:0x1688, B:487:0x168c, B:488:0x168f, B:490:0x1695, B:491:0x169a, B:445:0x1533, B:462:0x15af, B:463:0x15b6, B:391:0x13cf, B:202:0x0f31, B:204:0x0f3c, B:205:0x0f44, B:207:0x0f4a, B:190:0x0eb2, B:191:0x0eec, B:193:0x0ef2, B:194:0x0f00, B:195:0x0f12, B:197:0x0f18, B:168:0x0e42, B:159:0x0b31, B:60:0x01a6, B:28:0x00c3, B:30:0x00cd, B:32:0x00d7, B:34:0x00e5, B:36:0x00f0, B:35:0x00ec), top: B:496:0x00ad }] */
    /* JADX WARN: Removed duplicated region for block: B:480:0x166a A[Catch: JSONException -> 0x169e, LOOP:5: B:478:0x1664->B:480:0x166a, LOOP_END, TryCatch #0 {JSONException -> 0x169e, blocks: (B:23:0x00ad, B:25:0x00b1, B:27:0x00bc, B:29:0x00c7, B:38:0x00fc, B:40:0x0104, B:42:0x0108, B:43:0x0116, B:45:0x011e, B:46:0x012a, B:48:0x0130, B:50:0x0146, B:51:0x0158, B:53:0x015c, B:55:0x0164, B:56:0x0176, B:58:0x0195, B:63:0x01b2, B:65:0x01c5, B:66:0x01ca, B:68:0x01d2, B:69:0x01d6, B:71:0x01dc, B:72:0x01ea, B:74:0x01fb, B:76:0x020b, B:80:0x024d, B:82:0x0251, B:93:0x026e, B:95:0x0273, B:97:0x0277, B:99:0x0282, B:100:0x028f, B:106:0x02a0, B:109:0x02a8, B:110:0x02bc, B:112:0x02c2, B:113:0x02d1, B:114:0x02e7, B:116:0x02ed, B:117:0x02fb, B:120:0x032c, B:124:0x037d, B:128:0x03c4, B:131:0x06b9, B:135:0x06ca, B:139:0x06f7, B:141:0x09f9, B:142:0x09fb, B:144:0x0a05, B:145:0x0a07, B:147:0x0a11, B:148:0x0a13, B:156:0x0acb, B:160:0x0b3b, B:164:0x0ca9, B:167:0x0d14, B:171:0x0e50, B:173:0x0e70, B:175:0x0e76, B:176:0x0e7f, B:178:0x0e86, B:179:0x0e8b, B:181:0x0e95, B:182:0x0e9e, B:184:0x0ea6, B:186:0x0eaa, B:188:0x0eae, B:198:0x0f26, B:200:0x0f2b, B:208:0x0f5e, B:210:0x0f63, B:212:0x0f7f, B:213:0x0f87, B:215:0x0f8d, B:216:0x0fa1, B:217:0x0faa, B:219:0x0fb9, B:221:0x0fc1, B:223:0x0fd0, B:224:0x0fdb, B:226:0x0fe3, B:227:0x0fee, B:229:0x0ff6, B:230:0x1001, B:232:0x1009, B:233:0x1014, B:235:0x101c, B:236:0x1027, B:238:0x102f, B:239:0x103a, B:241:0x1042, B:242:0x104d, B:244:0x1055, B:245:0x1060, B:247:0x1066, B:248:0x106d, B:250:0x1075, B:251:0x1080, B:253:0x1086, B:254:0x108d, B:256:0x1095, B:257:0x10a0, B:259:0x10a8, B:260:0x10b3, B:262:0x10bb, B:263:0x10c6, B:265:0x10ce, B:266:0x10d9, B:268:0x10e1, B:269:0x10ec, B:271:0x10f2, B:272:0x10f9, B:274:0x1101, B:275:0x110c, B:277:0x1114, B:278:0x111f, B:280:0x1127, B:281:0x1132, B:283:0x1138, B:284:0x113f, B:286:0x1149, B:288:0x114f, B:290:0x115c, B:291:0x1167, B:293:0x116f, B:294:0x117a, B:296:0x1182, B:297:0x118d, B:299:0x1195, B:300:0x11a0, B:302:0x11a8, B:303:0x11b3, B:305:0x11bb, B:306:0x11c6, B:308:0x11ce, B:309:0x11d9, B:311:0x11e1, B:312:0x11ec, B:314:0x11f4, B:315:0x11ff, B:317:0x1207, B:318:0x1212, B:320:0x121a, B:321:0x1225, B:323:0x122d, B:324:0x1238, B:326:0x1240, B:327:0x124b, B:329:0x1253, B:330:0x125e, B:332:0x1266, B:333:0x1271, B:335:0x1279, B:336:0x1284, B:338:0x128c, B:339:0x1297, B:341:0x129f, B:342:0x12aa, B:344:0x12b2, B:345:0x12bd, B:347:0x12c5, B:348:0x12d0, B:350:0x12d8, B:351:0x12e3, B:353:0x12eb, B:354:0x12f6, B:356:0x12fe, B:357:0x1309, B:359:0x1311, B:360:0x131c, B:362:0x1324, B:363:0x132f, B:365:0x1337, B:366:0x1342, B:368:0x134a, B:369:0x1355, B:371:0x135d, B:372:0x1368, B:374:0x1370, B:375:0x137b, B:377:0x137f, B:379:0x1383, B:381:0x138d, B:382:0x1392, B:384:0x1399, B:385:0x139c, B:387:0x13b3, B:388:0x13bb, B:394:0x13d9, B:399:0x13f4, B:401:0x13fb, B:402:0x1400, B:404:0x1404, B:405:0x143f, B:407:0x1445, B:408:0x144a, B:410:0x144f, B:411:0x1454, B:413:0x1458, B:414:0x1463, B:416:0x1467, B:417:0x147c, B:419:0x1495, B:420:0x149e, B:422:0x14a2, B:423:0x14b5, B:425:0x14b9, B:426:0x14d5, B:428:0x14d9, B:429:0x14de, B:431:0x14e2, B:432:0x14e7, B:434:0x14eb, B:435:0x14f1, B:437:0x14f5, B:438:0x1505, B:440:0x1518, B:441:0x151f, B:443:0x1529, B:446:0x153a, B:448:0x153f, B:449:0x155e, B:451:0x1566, B:452:0x158a, B:454:0x1591, B:455:0x1598, B:457:0x159d, B:459:0x15a8, B:465:0x15c2, B:467:0x15ca, B:469:0x15d4, B:470:0x15d6, B:481:0x1678, B:471:0x15d9, B:473:0x1643, B:475:0x1647, B:477:0x164f, B:478:0x1664, B:480:0x166a, B:482:0x167f, B:483:0x1684, B:485:0x1688, B:487:0x168c, B:488:0x168f, B:490:0x1695, B:491:0x169a, B:445:0x1533, B:462:0x15af, B:463:0x15b6, B:391:0x13cf, B:202:0x0f31, B:204:0x0f3c, B:205:0x0f44, B:207:0x0f4a, B:190:0x0eb2, B:191:0x0eec, B:193:0x0ef2, B:194:0x0f00, B:195:0x0f12, B:197:0x0f18, B:168:0x0e42, B:159:0x0b31, B:60:0x01a6, B:28:0x00c3, B:30:0x00cd, B:32:0x00d7, B:34:0x00e5, B:36:0x00f0, B:35:0x00ec), top: B:496:0x00ad }] */
    /* JADX WARN: Removed duplicated region for block: B:485:0x1688 A[Catch: JSONException -> 0x169e, TryCatch #0 {JSONException -> 0x169e, blocks: (B:23:0x00ad, B:25:0x00b1, B:27:0x00bc, B:29:0x00c7, B:38:0x00fc, B:40:0x0104, B:42:0x0108, B:43:0x0116, B:45:0x011e, B:46:0x012a, B:48:0x0130, B:50:0x0146, B:51:0x0158, B:53:0x015c, B:55:0x0164, B:56:0x0176, B:58:0x0195, B:63:0x01b2, B:65:0x01c5, B:66:0x01ca, B:68:0x01d2, B:69:0x01d6, B:71:0x01dc, B:72:0x01ea, B:74:0x01fb, B:76:0x020b, B:80:0x024d, B:82:0x0251, B:93:0x026e, B:95:0x0273, B:97:0x0277, B:99:0x0282, B:100:0x028f, B:106:0x02a0, B:109:0x02a8, B:110:0x02bc, B:112:0x02c2, B:113:0x02d1, B:114:0x02e7, B:116:0x02ed, B:117:0x02fb, B:120:0x032c, B:124:0x037d, B:128:0x03c4, B:131:0x06b9, B:135:0x06ca, B:139:0x06f7, B:141:0x09f9, B:142:0x09fb, B:144:0x0a05, B:145:0x0a07, B:147:0x0a11, B:148:0x0a13, B:156:0x0acb, B:160:0x0b3b, B:164:0x0ca9, B:167:0x0d14, B:171:0x0e50, B:173:0x0e70, B:175:0x0e76, B:176:0x0e7f, B:178:0x0e86, B:179:0x0e8b, B:181:0x0e95, B:182:0x0e9e, B:184:0x0ea6, B:186:0x0eaa, B:188:0x0eae, B:198:0x0f26, B:200:0x0f2b, B:208:0x0f5e, B:210:0x0f63, B:212:0x0f7f, B:213:0x0f87, B:215:0x0f8d, B:216:0x0fa1, B:217:0x0faa, B:219:0x0fb9, B:221:0x0fc1, B:223:0x0fd0, B:224:0x0fdb, B:226:0x0fe3, B:227:0x0fee, B:229:0x0ff6, B:230:0x1001, B:232:0x1009, B:233:0x1014, B:235:0x101c, B:236:0x1027, B:238:0x102f, B:239:0x103a, B:241:0x1042, B:242:0x104d, B:244:0x1055, B:245:0x1060, B:247:0x1066, B:248:0x106d, B:250:0x1075, B:251:0x1080, B:253:0x1086, B:254:0x108d, B:256:0x1095, B:257:0x10a0, B:259:0x10a8, B:260:0x10b3, B:262:0x10bb, B:263:0x10c6, B:265:0x10ce, B:266:0x10d9, B:268:0x10e1, B:269:0x10ec, B:271:0x10f2, B:272:0x10f9, B:274:0x1101, B:275:0x110c, B:277:0x1114, B:278:0x111f, B:280:0x1127, B:281:0x1132, B:283:0x1138, B:284:0x113f, B:286:0x1149, B:288:0x114f, B:290:0x115c, B:291:0x1167, B:293:0x116f, B:294:0x117a, B:296:0x1182, B:297:0x118d, B:299:0x1195, B:300:0x11a0, B:302:0x11a8, B:303:0x11b3, B:305:0x11bb, B:306:0x11c6, B:308:0x11ce, B:309:0x11d9, B:311:0x11e1, B:312:0x11ec, B:314:0x11f4, B:315:0x11ff, B:317:0x1207, B:318:0x1212, B:320:0x121a, B:321:0x1225, B:323:0x122d, B:324:0x1238, B:326:0x1240, B:327:0x124b, B:329:0x1253, B:330:0x125e, B:332:0x1266, B:333:0x1271, B:335:0x1279, B:336:0x1284, B:338:0x128c, B:339:0x1297, B:341:0x129f, B:342:0x12aa, B:344:0x12b2, B:345:0x12bd, B:347:0x12c5, B:348:0x12d0, B:350:0x12d8, B:351:0x12e3, B:353:0x12eb, B:354:0x12f6, B:356:0x12fe, B:357:0x1309, B:359:0x1311, B:360:0x131c, B:362:0x1324, B:363:0x132f, B:365:0x1337, B:366:0x1342, B:368:0x134a, B:369:0x1355, B:371:0x135d, B:372:0x1368, B:374:0x1370, B:375:0x137b, B:377:0x137f, B:379:0x1383, B:381:0x138d, B:382:0x1392, B:384:0x1399, B:385:0x139c, B:387:0x13b3, B:388:0x13bb, B:394:0x13d9, B:399:0x13f4, B:401:0x13fb, B:402:0x1400, B:404:0x1404, B:405:0x143f, B:407:0x1445, B:408:0x144a, B:410:0x144f, B:411:0x1454, B:413:0x1458, B:414:0x1463, B:416:0x1467, B:417:0x147c, B:419:0x1495, B:420:0x149e, B:422:0x14a2, B:423:0x14b5, B:425:0x14b9, B:426:0x14d5, B:428:0x14d9, B:429:0x14de, B:431:0x14e2, B:432:0x14e7, B:434:0x14eb, B:435:0x14f1, B:437:0x14f5, B:438:0x1505, B:440:0x1518, B:441:0x151f, B:443:0x1529, B:446:0x153a, B:448:0x153f, B:449:0x155e, B:451:0x1566, B:452:0x158a, B:454:0x1591, B:455:0x1598, B:457:0x159d, B:459:0x15a8, B:465:0x15c2, B:467:0x15ca, B:469:0x15d4, B:470:0x15d6, B:481:0x1678, B:471:0x15d9, B:473:0x1643, B:475:0x1647, B:477:0x164f, B:478:0x1664, B:480:0x166a, B:482:0x167f, B:483:0x1684, B:485:0x1688, B:487:0x168c, B:488:0x168f, B:490:0x1695, B:491:0x169a, B:445:0x1533, B:462:0x15af, B:463:0x15b6, B:391:0x13cf, B:202:0x0f31, B:204:0x0f3c, B:205:0x0f44, B:207:0x0f4a, B:190:0x0eb2, B:191:0x0eec, B:193:0x0ef2, B:194:0x0f00, B:195:0x0f12, B:197:0x0f18, B:168:0x0e42, B:159:0x0b31, B:60:0x01a6, B:28:0x00c3, B:30:0x00cd, B:32:0x00d7, B:34:0x00e5, B:36:0x00f0, B:35:0x00ec), top: B:496:0x00ad }] */
    /* JADX WARN: Removed duplicated region for block: B:508:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJLIIIJ(java.lang.String r66) {
        /*
            Method dump skipped, instruction units count: 5816
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.videoarch.liveplayer.log.LiveLoggerService.LJJLIIIJ(java.lang.String):void");
    }

    public static class MyNTPTask {
        public final HandlerThread LIZ;
        public final AnonymousClass1 LIZIZ;

        public final void LIZ(int i) {
            AnonymousClass1 anonymousClass1;
            if (this.LIZ != null && (anonymousClass1 = this.LIZIZ) != null) {
                C786410Ut5.LJLILLLLZI(anonymousClass1, i);
            }
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [com.ss.videoarch.liveplayer.log.LiveLoggerService$MyNTPTask$1] */
        public MyNTPTask(final LiveLoggerService liveLoggerService, Looper looper) {
            if (looper == null) {
                if (this.LIZ == null) {
                    HandlerThread handlerThread = new HandlerThread("DnsHandlerThread");
                    this.LIZ = handlerThread;
                    handlerThread.start();
                }
                looper = C786410Ut5.W2(this.LIZ);
            }
            this.LIZIZ = new BPEAHandler(this, looper) { // from class: com.ss.videoarch.liveplayer.log.LiveLoggerService.MyNTPTask.1
                @Override // android.os.Handler
                public final void handleMessage(Message message) {
                    C1C7U.LIZ("LiveLoggerService$MyNTPTask@e032.<init>$1");
                    if (message != null) {
                        liveLoggerService.getClass();
                    }
                    C1C7U.LIZIZ("LiveLoggerService$MyNTPTask@e032.<init>$1");
                }
            };
        }
    }

    public static long LJ(JSONArray jSONArray) {
        int length = jSONArray.length();
        long j = 0;
        for (int i = 0; i < length; i++) {
            j += (long) JSONArrayProtectorUtils.getInt(jSONArray, i);
        }
        return j;
    }

    public final void LIZJ(JSONObject jSONObject) {
        int i;
        try {
            jSONObject.put("is_window_valid", this.d5);
            int i2 = 1;
            int i3 = 0;
            if (this.Z4) {
                i = 1;
            } else {
                i = 0;
            }
            jSONObject.put("radio_mode", i);
            jSONObject.put("set_surface_ts", this.f5);
            if (this.LLILZ.I2 != 3) {
                i2 = 0;
            }
            if (!this.g5) {
                i3 = i2;
            }
            jSONObject.put("is_preplay", i3);
        } catch (JSONException e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    public final void LIZLLL(JSONObject jSONObject) {
        if (!TextUtils.isEmpty(this.LLILLL.LLJZ)) {
            try {
                JSONObject jSONObjectOptJSONObject = new JSONObject(this.LLILLL.LLJZ).optJSONObject("NetInfo");
                if (jSONObjectOptJSONObject != null) {
                    String strOptString = jSONObjectOptJSONObject.optString("cctk_bw_series");
                    String strOptString2 = jSONObjectOptJSONObject.optString("cctk_srtt_series");
                    String strOptString3 = jSONObjectOptJSONObject.optString("cctk_plr_series");
                    if (TextUtils.isEmpty(strOptString)) {
                        strOptString = "none";
                    }
                    jSONObject.put("cctk_bw_series", strOptString);
                    if (TextUtils.isEmpty(strOptString2)) {
                        strOptString2 = "none";
                    }
                    jSONObject.put("cctk_srtt_series", strOptString2);
                    if (TextUtils.isEmpty(strOptString3)) {
                        strOptString3 = "none";
                    }
                    jSONObject.put("cctk_plr_series", strOptString3);
                }
            } catch (JSONException e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
    }

    public final void LJI(int i) {
        this.x3++;
        this.w3++;
        int i2 = this.v3;
        if (i2 >= 0) {
            if (i <= i2) {
                LJJLIIIJILLIZJL(4, i, i2);
                if (i == 1) {
                    this.y3++;
                    this.z3++;
                }
            } else {
                this.y3++;
                this.z3++;
                if (i - i2 > 1 && !this.LLILZ.LLJZIJLIL) {
                    LJJLIIIJILLIZJL(3, i, i2);
                    int i3 = this.w3;
                    int i4 = this.v3;
                    this.w3 = i3 + ((i - i4) - 1);
                    this.y3 += (i - i4) - 1;
                }
            }
        }
        this.v3 = i;
    }

    public final void LJIIIZ(int i) {
        String strLJIIIZ;
        if (this.LLILZ != null && LJJIJIIJI()) {
            String strLJIIIZ2 = null;
            if (i == 0 || i == 2) {
                InterfaceC1467950oIr interfaceC1467950oIr = this.LLILZ.LIZLLL;
                if (interfaceC1467950oIr == null) {
                    strLJIIIZ = null;
                } else {
                    strLJIIIZ = ((C1470430oMr) interfaceC1467950oIr).LJIIIZ(1946);
                }
                if (TextUtils.isEmpty(strLJIIIZ)) {
                    strLJIIIZ = "none";
                }
                if (!TextUtils.equals(strLJIIIZ, "none")) {
                    this.X6.LIZ(strLJIIIZ, true);
                }
            }
            if (i == 1 || i == 2) {
                InterfaceC1467950oIr interfaceC1467950oIr2 = this.LLILZ.LIZLLL;
                if (interfaceC1467950oIr2 != null) {
                    strLJIIIZ2 = ((C1470430oMr) interfaceC1467950oIr2).LJIIIZ(1947);
                }
                if (TextUtils.isEmpty(strLJIIIZ2)) {
                    strLJIIIZ2 = "none";
                }
                if (!TextUtils.equals(strLJIIIZ2, "none")) {
                    this.X6.LIZ(strLJIIIZ2, false);
                }
            }
        }
    }

    public final JSONObject LJIIJJI(String str) {
        float f;
        int i;
        int i2;
        int i3;
        String string;
        int i4;
        String str2;
        String str3;
        long jCurrentTimeMillis;
        String str4;
        int i5;
        long j;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        Object obj;
        C1281010jRL c1281010jRL;
        this.LLILZ.LLJI();
        this.LLILZ.LL();
        float fLLJILJILJ = this.LLILZ.LLJILJILJ();
        float fLLI = this.LLILZ.LLI();
        if (fLLI != 0.0f) {
            f = fLLJILJILJ / fLLI;
        } else {
            f = -1.0f;
        }
        this.LLILZ.LJJZ();
        boolean z = this.LLLILZLLLI;
        if ("bytevc2".equals(this.LLLILZJ)) {
            z = false;
        }
        LJJZZIII();
        try {
            if (LJIILL(str)) {
                return null;
            }
            JSONObject jSONObjectPut = new JSONObject().put("report_version", "5").put("product_line", "live");
            String str5 = this.LLJJIII;
            String str6 = "-1";
            if (str5 == null) {
                str5 = "-1";
            }
            JSONObject jSONObjectPut2 = jSONObjectPut.put("project_key", str5).put("timestamp", System.currentTimeMillis() + this.LLILZ.LLIIJI()).put("client_timestamp", System.currentTimeMillis());
            String str7 = this.LLJILLL;
            Object obj2 = "none";
            if (str7 == null) {
                str7 = "none";
            }
            JSONObject jSONObjectPut3 = jSONObjectPut2.put("live_stream_enter_method", str7);
            String str8 = this.LLJJ;
            if (str8 == null) {
                str8 = "none";
            }
            JSONObject jSONObjectPut4 = jSONObjectPut3.put("live_stream_enter_action", str8);
            String str9 = this.LLJJI;
            if (str9 == null) {
                str9 = "none";
            }
            JSONObject jSONObjectPut5 = jSONObjectPut4.put("live_stream_enter_method_subtag", str9);
            String str10 = this.LLJJIJI;
            if (str10 != null) {
                str6 = str10;
            }
            JSONObject jSONObjectPut6 = jSONObjectPut5.put("cdn_play_url", str6);
            String str11 = this.LLJJIJIL;
            if (str11 == null) {
                str11 = "none";
            }
            JSONObject jSONObjectPut7 = jSONObjectPut6.put("cdn_ip", str11).put("request_url", this.N3);
            if (this.LLJJJJ) {
                i = 1;
            } else {
                i = 0;
            }
            JSONObject jSONObjectPut8 = jSONObjectPut7.put("is_preview", i);
            if (this.LLLFF) {
                i2 = 1;
            } else {
                i2 = 0;
            }
            JSONObject jSONObjectPut9 = jSONObjectPut8.put("hit_node_optimize", i2).put("evaluator_symbol", this.LLJZIJLIL).put("codec_type", this.LLLILZJ).put("codec_name", this.LLLIZZ);
            if (z) {
                i3 = 1;
            } else {
                i3 = 0;
            }
            JSONObject jSONObjectPut10 = jSONObjectPut9.put("hardware_decode", i3).put("hit_strategy_opt", 0).put("sei_delay", this.LLILLL.LJLLLL).put("sei_source", this.LLILLL.LLD).put("sub_scene", this.LLILLL.LLFII).put("width", this.b0).put("height", this.c0).put("push_client_orientation", this.S3).put("cctk_cnt", this.LLILLL.LJJJLL).put("cctk_cnt_cached", this.LLILLL.LJJJLZIJ).put("cctk_index_diff", this.LLILLL.LJJJZ);
            VideoLiveManager videoLiveManager = this.LLILZ;
            if (videoLiveManager != null && (c1281010jRL = videoLiveManager.LJIIZILJ) != null) {
                string = c1281010jRL.toString();
            } else {
                string = "";
            }
            JSONObject jSONObjectPut11 = jSONObjectPut10.put("nqe", string).put("network_info", this.LLILLL.LJJLI).put("quic_request_time", this.LLILLL.LJJLIIIJJI).put("bwa_result", this.LLILLL.LJJL).put("play_format", LJJIII()).put("play_protocol", LJJIIJ()).put("protocol_downgraded", this.f470p1);
            if (this.LLLZLL) {
                i4 = 1;
            } else {
                i4 = 0;
            }
            JSONObject jSONObjectPut12 = jSONObjectPut11.put("format_downgraded", i4).put("protocol_degrade_reason", this.q1).put("is_background", this.e5).put("redirect_ip", this.m5).put("external_res", this.G1).put("cert_verify_failed", this.LLILLL.LLJILLL).put("redirect_url", this.LLILLL.LLJJI).put("pre_302_hit", this.LLILLL.LLJJIII).put("pre_302_url", this.LLILLL.LLJJIJI).put("sei_ver", this.LLILLL.LLF).put("default_res_bitrate", this.M1).put("push_video_width", this.LLILLL.LLFZ).put("push_video_height", this.LLILLL.LLI).put("live_unique_id", this.G6);
            if (C1474810oTv.LJLJLLL()) {
                str2 = this.LLILZIL.LIZIZ;
            } else {
                str2 = this.LLLLZLLIL;
            }
            JSONObject jSONObjectPut13 = jSONObjectPut12.put("live_stream_session_id", str2);
            if (C1474810oTv.LJLJLLL()) {
                str3 = this.LLILZIL.LIZIZ;
            } else {
                str3 = this.LLLLZLLLI;
            }
            JSONObject jSONObjectPut14 = jSONObjectPut13.put("live_vv_session_id", str3);
            if (this.LLLZZ != 0) {
                jCurrentTimeMillis = System.currentTimeMillis() - this.LLLZZ;
            } else {
                jCurrentTimeMillis = -1;
            }
            JSONObject jSONObjectPut15 = jSONObjectPut14.put("play_time_axis", jCurrentTimeMillis).put("is_abr", this.LLILZ.W1).put("manual_resolution", this.H1);
            if (C1474810oTv.LJLJLLL()) {
                str4 = this.LLILZIL.LIZJ;
            } else {
                str4 = this.LLILZ.LLIZ;
            }
            if (TextUtils.isEmpty(str4)) {
                str4 = "none";
            }
            jSONObjectPut15.put("biz_session_id", str4);
            if (TextUtils.equals(str, "play_stop")) {
                JSONObject jSONObjectPut16 = jSONObjectPut15.put("use_new_applog_api", this.LLLF);
                Object obj3 = this.d6;
                if (obj3 == null) {
                    obj3 = "none";
                }
                JSONObject jSONObjectPut17 = jSONObjectPut16.put("loudness_info", obj3).put("enable_skip_on_buffering_end", this.LLLLIIIILLL);
                if (this.LLLLII) {
                    i8 = 1;
                } else {
                    i8 = 0;
                }
                JSONObject jSONObjectPut18 = jSONObjectPut17.put("enable_hurry", i8).put("hurry_time", this.LLLLIIL).put("hurry_type", this.LLLLIILL).put("hurry_interval", this.LLLLIILLL).put("hurry_once_max", this.LLLLIL).put("hurry_cache_type", this.LLLLJ).put("hurry_skip_start", this.LLLLILI).put("hurry_stop_type", this.LLLLLLIL).put("min_buffer_stop_drop", this.LLLLLLJ).put("max_drop_frame_time_cost", this.LLLLLLL).put("hurry_delay_inc_threshold", 0).put("slow_play_time", this.LLLLLJLJLL).put("enable_strategy_node_opt", this.n5).put("start_play_buffer_threshold", this.LLLLLLZ).put("fast_open_gop_cache", this.LLLLLZ).put("chip_board", this.z1).put("chip_hardware", this.A1).put("abr_switch_sum_count", this.J2).put("abr_switch_total_count", this.L2).put("abr_upswitch_total_count", this.O2).put("abr_upswitch_fail_count", this.Q2).put("abr_downswitch_total_count", this.P2).put("abr_downswitch_fail_count", this.R2).put("abr_fall_back_local", this.o2).put("abr_pty_error_summary", this.f468n2).put("abr_strategy_downswitch_total_count", this.I2).put("abr_strategy_run_total_count", this.F2).put("abr_strategy_switch_total_count", this.G2).put("abr_strategy_upswitch_total_count", this.H2).put("abr_strategy_version", this.s2).put("backup_to_origin", this.w5).put("cert_verify_detail", this.LLILLL.LLJJ).put("disabe_abr_reason_by_auto_info", this.LLILLL.LLLZZ);
                if (this.LLILLL.LLLZLZ) {
                    i9 = 1;
                } else {
                    i9 = 0;
                }
                JSONObject jSONObjectPut19 = jSONObjectPut18.put("enable_abr_by_auto_info", i9).put("enable_global_volume_balance", this.LLLLLZL).put("enable_low_res_startplay", 0).put("enable_lower_res", 0).put("mio_live_worker_version", this.o4);
                if (this.E1) {
                    i10 = 1;
                } else {
                    i10 = 0;
                }
                jSONObjectPut19.put("enable_resolution_auto_degrade", i10).put("fallback_from_hdr_to_sdr", this.U5).put("fallback_type", this.I3).put("settings_info", this.B1).put("stall_retry_time_interval", this.L).put("strategy_start_up_delay", 0L).put("volume_balance_type", this.LLLLZ).put("volume_balance_targetlufs", this.LLLLZI);
                if (C1474810oTv.LLILII()) {
                    obj = q7.format(this.LLLLLL);
                } else {
                    obj = new DecimalFormat("0.00").format(this.LLLLLL);
                }
                jSONObjectPut15.put("slow_speed", obj);
                if (!r7) {
                    C1476650oWt.LIZIZ();
                    long jLIZJ = C1476660oWu.LIZ.LIZJ(1196);
                    if (jLIZJ >= 0) {
                        jSONObjectPut15.put("mediaio_race_use_default_config", jLIZJ);
                        r7 = true;
                    }
                }
                String str12 = this.I1;
                if (str12 != null && !TextUtils.equals(str12, "none")) {
                    jSONObjectPut15.put("abr_default_res", this.I1);
                }
                if (TextUtils.equals(this.m1, "h2") || TextUtils.equals(this.m1, "h2q")) {
                    jSONObjectPut15.put("h2_reused_new", this.LLILLL.LLJJIJIL).put("quic_0rtt_reason", this.LLILLL.LLJJJ).put("quic_0rtt_reason_i", this.LLILLL.LLJJJIL).put("quic_is_ttquiche", this.LLILLL.LLJJJJ).put("quic_detail_info", this.LLILLL.LLJJJJJIL);
                }
            }
            if (TextUtils.equals(str, "playing")) {
                jSONObjectPut15.put("is_too_large_av_diff", this.LLILLL.LLLFF);
            }
            if ((TextUtils.equals(str, "playing") || TextUtils.equals(str, "play_stop")) && (TextUtils.equals(this.m1, "quic") || TextUtils.equals(this.m1, "h2q") || TextUtils.equals(this.m1, "rtm"))) {
                jSONObjectPut15.put("network_stats", this.LLILLL.LLJZ);
            }
            if (TextUtils.equals(str, "first_frame") || TextUtils.equals(str, "play_stop")) {
                if (TextUtils.equals(this.m1, "h2") || TextUtils.equals(this.m1, "h2q")) {
                    jSONObjectPut15.put("h2_reused", this.LLILLL.LLJJIJIIJIL);
                    jSONObjectPut15.put("h2_race_result", this.LLILLL.LLILLIZIL);
                    jSONObjectPut15.put("h2_negotiate_protocol", this.LLILLL.LLILIL);
                }
                if (TextUtils.equals(this.m1, "quic") || TextUtils.equals(this.m1, "h2q") || TextUtils.equals(this.m1, "rtm")) {
                    jSONObjectPut15.put("quic_config_cached", this.LLILLL.LLIZ);
                    jSONObjectPut15.put("quic_CHLO_count", this.LLILLL.LLIZLLLIL);
                    jSONObjectPut15.put("quic_rej_count", this.LLILLL.LLILII);
                    jSONObjectPut15.put("quic_rej_reasons", this.LLILLL.LLIL);
                    jSONObjectPut15.put("quic_conn_cost", this.LLILLL.LLILLL);
                    jSONObjectPut15.put("quic_error_code", this.LLILLL.LLILZ);
                }
            }
            if (TextUtils.equals(str, "first_frame") || TextUtils.equals(str, "playing") || TextUtils.equals(str, "play_stop")) {
                JSONObject jSONObjectPut20 = jSONObjectPut15.put("mute_audio", this.P3).put("player_volume_setting", this.Q3).put("volume_setting", f);
                if (this.LLLIIII) {
                    i5 = 1;
                } else {
                    i5 = 0;
                }
                jSONObjectPut20.put("use_dns_unified_convergence", i5).put("first_play_protocol", LJIL()).put("liveio_first_race_result", this.LLILLL.LJJJJJL);
                if (TextUtils.equals(this.m1, "quic") || TextUtils.equals(this.m1, "h2q") || TextUtils.equals(this.m1, "rtm")) {
                    jSONObjectPut15.put("quic_connection_id", this.LLILLL.LLJILJILJ);
                }
            }
            if (TextUtils.equals(str, "start_play") || TextUtils.equals(str, "first_frame") || TextUtils.equals(str, "playing") || TextUtils.equals(str, "play_stop")) {
                JSONObject jSONObjectPut21 = jSONObjectPut15.put("abr_startup_realbitrate_list", new JSONArray((Collection) this.e2));
                VideoLiveManager videoLiveManager2 = this.LLILZ;
                if (videoLiveManager2 != null) {
                    j = videoLiveManager2.N1;
                } else {
                    j = -1;
                }
                JSONObject jSONObjectPut22 = jSONObjectPut21.put("abr_startup_bitrate", j);
                VideoLiveManager videoLiveManager3 = this.LLILZ;
                if (videoLiveManager3 != null) {
                    obj2 = videoLiveManager3.O1;
                }
                JSONObject jSONObjectPut23 = jSONObjectPut22.put("abr_startup_res", obj2).put("abr_startup_vrtBitrate", this.LLILLL.LJLLJ).put("abr_startup_vrtPSNR", this.LLILLL.LJLLL).put("abr_rawbitrate_list", LJIJ()).put("abr_switch_realbitrate_list", new JSONArray((Collection) this.r2)).put("enable_startup", this.K5).put("startup_exec_type", this.b2).put("startup_estimator_bandwidth", this.f2).put("startup_estimator_source_type", this.g2).put("startup_strategy_log", this.d2).put("startup_strategy_version", this.h2).put("startup_pty_error_summary", this.i2).put("startup_fall_back_local", this.j2).put("ttnet_nqe_info", this.C1).put("mio_live_play", this.n4).put("liveio_error_msg", this.p4).put("quic_load_succ", this.o1).put("enable_mio_demuxer", this.f461Y).put("enable_mio_cmaf", this.Z).put("tls_impl_version", this.LLILLL.LLJJL);
                if (this.Z4) {
                    i6 = 1;
                } else {
                    i6 = 0;
                }
                jSONObjectPut23.put("radio_mode", i6);
                if (this.LLLII) {
                    i7 = 1;
                } else {
                    i7 = 0;
                }
                jSONObjectPut15.put("hit_cache", i7);
                JSONObject jSONObjectLJJIFFI = LJJIFFI();
                if (jSONObjectLJJIFFI != null) {
                    Iterator<String> itKeys = jSONObjectLJJIFFI.keys();
                    while (itKeys.hasNext()) {
                        String next = itKeys.next();
                        jSONObjectPut15.put(next, jSONObjectLJJIFFI.get(next));
                    }
                }
            }
            LJLJI(jSONObjectPut15);
            return jSONObjectPut15;
        } catch (JSONException e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }

    public final JSONObject LJIILJJIL(boolean z) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("timestamp", System.currentTimeMillis() + this.LLILZ.LLIIJI());
        if (z) {
            String str = this.LLJJIJI;
            if (str == null) {
                str = "-1";
            }
            JSONObject jSONObjectPut = jSONObject.put("cdn_play_url", str).put("request_url", this.N3);
            String str2 = this.LLJJIJIL;
            if (str2 == null) {
                str2 = "none";
            }
            jSONObjectPut.put("cdn_ip", str2).put("redirect_url", this.LLILLL.LLJJI).put("redirect_ip", this.m5).put("play_format", LJJIII()).put("play_protocol", LJJIIJ());
        }
        return jSONObject;
    }

    public final boolean LJIILL(String str) {
        if (C1481110oe5.LIZ) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("downgradeOnPerfLogLevel input: ");
            sbLIZ.append(str);
            C1481110oe5.LIZIZ("LiveLoggerService_LogPrefStrategy", C2188811AlT.LIZIZ(sbLIZ));
        }
        boolean z = false;
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        boolean zContains = u7.contains(str);
        boolean zContains2 = f457v7.contains(str);
        if (!zContains && !zContains2) {
            return false;
        }
        int intValue = this.LLILZ.LJLZ().getIntValue(57018, 0);
        if (C1481110oe5.LIZ) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("downgradeOnPerfLogLevel: ");
            sbLIZ2.append(intValue);
            sbLIZ2.append(", ");
            sbLIZ2.append(str);
            C1481110oe5.LIZIZ("LiveLoggerService_LogPrefStrategy", C2188811AlT.LIZIZ(sbLIZ2));
        }
        if (intValue != 50) {
            zContains = false;
            if (intValue == 80) {
                z = true;
            }
        }
        boolean z2 = zContains | z;
        if (z2) {
            if (C1481110oe5.LIZ) {
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("downgradeOnPerfLogLevel no collect no report: ");
                sbLIZ3.append(intValue);
                sbLIZ3.append(", ");
                sbLIZ3.append(str);
                C1481110oe5.LIZIZ("LiveLoggerService_LogPrefStrategy", C2188811AlT.LIZIZ(sbLIZ3));
            }
            this.m7++;
            if (this.o7 == -1) {
                this.o7 = System.currentTimeMillis();
            }
        } else if (this.m7 > 0) {
            this.n7++;
            this.p7 += System.currentTimeMillis() - this.o7;
            this.o7 = -1L;
            return z2;
        }
        return z2;
    }

    public final long LJJ(int i) {
        VideoLiveManager videoLiveManager;
        if (i != 0) {
            if (i != 100) {
                if (i != 101) {
                    return 0L;
                }
                return this.LLILLL.LJIIZILJ;
            }
            return this.LLILLL.LJLLLL;
        }
        int i2 = this.LLJLL;
        if (i2 == -1 && (videoLiveManager = this.LLILZ) != null) {
            return videoLiveManager.LJZL(i, 0L);
        }
        return i2;
    }

    public final void LJJIJIL(JSONObject jSONObject) {
        C1698680uJ0 c1698680uJ0 = this.c7;
        if (c1698680uJ0 != null) {
            C1698950uJR c1698950uJR = c1698680uJ0.LIZ;
            C1698890uJL c1698890uJL = c1698680uJ0.LIZIZ;
            JSONObject jSONObject2 = new JSONObject();
            try {
                jSONObject2.put("switch_success_count", c1698950uJR.LIZ);
                jSONObject2.put("switch_fail_count", c1698950uJR.LIZIZ);
                jSONObject2.put("switch_count", c1698950uJR.LIZJ);
                jSONObject2.put("received_signal_count", c1698950uJR.LIZLLL);
                jSONObject2.put("during_switch_ind", c1698950uJR.LJ);
                jSONObject2.put("quit_to_switch_latency", 0L);
            } catch (JSONException e) {
                TryCatchGuardChecker.doCheck(e);
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("error logging main_backup_switch_attempt in-feed stats: ");
                sbLIZ.append(e);
                C2188811AlT.LIZIZ(sbLIZ);
                C1698940uJQ.LIZIZ();
            }
            JSONObject jSONObject3 = new JSONObject();
            try {
                jSONObject3.put("player_switch_success_count", c1698890uJL.LIZ);
                jSONObject3.put("player_switch_fail_count", c1698890uJL.LIZIZ);
                jSONObject3.put("content_steering_switch_success_count", c1698890uJL.LIZJ);
                jSONObject3.put("content_steering_switch_fail_count", c1698890uJL.LIZLLL);
                jSONObject3.put("signal_switch_success_count", c1698890uJL.LJ);
                jSONObject3.put("signal_switch_fail_count", c1698890uJL.LJFF);
                jSONObject3.put("total_switch_success_count", c1698890uJL.LJI);
                jSONObject3.put("total_switch_fail_count", c1698890uJL.LJII);
                jSONObject3.put("total_switch_count", c1698890uJL.LJIIIIZZ);
                jSONObject3.put("received_signal_count", c1698890uJL.LJIIIZ);
                jSONObject3.put("during_switch_ind", c1698890uJL.LJIIJ);
                jSONObject3.put("quit_to_switch_latency", c1698890uJL.LJIIJJI);
            } catch (JSONException e2) {
                TryCatchGuardChecker.doCheck(e2);
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("error logging main_backup_switch_attempt in-room stats: ");
                sbLIZ2.append(e2);
                C2188811AlT.LIZIZ(sbLIZ2);
                C1698940uJQ.LIZIZ();
            }
            JSONObject jSONObject4 = new JSONObject();
            try {
                jSONObject4.put("in_feed", jSONObject2);
                jSONObject4.put("in_room", jSONObject3);
                jSONObject.put("main_backup_switch_counts", jSONObject4);
            } catch (JSONException e3) {
                TryCatchGuardChecker.doCheck(e3);
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("error logging main_backup_switch_attempt stats: ");
                sbLIZ3.append(e3);
                C2188811AlT.LIZIZ(sbLIZ3);
                C1698940uJQ.LIZIZ();
            }
            C1698680uJ0 c1698680uJ02 = this.c7;
            C1698950uJR c1698950uJR2 = c1698680uJ02.LIZ;
            c1698950uJR2.LIZ = 0L;
            c1698950uJR2.LIZIZ = 0L;
            c1698950uJR2.LIZJ = 0L;
            c1698950uJR2.LIZLLL = 0L;
            c1698950uJR2.LJ = 0;
            C1698890uJL c1698890uJL2 = c1698680uJ02.LIZIZ;
            c1698890uJL2.LIZ = 0L;
            c1698890uJL2.LIZIZ = 0L;
            c1698890uJL2.LIZJ = 0L;
            c1698890uJL2.LIZLLL = 0L;
            c1698890uJL2.LJ = 0L;
            c1698890uJL2.LJFF = 0L;
            c1698890uJL2.LJI = 0L;
            c1698890uJL2.LJII = 0L;
            c1698890uJL2.LJIIIIZZ = 0L;
            c1698890uJL2.LJIIIZ = 0L;
            c1698890uJL2.LJIIJ = 0;
            c1698890uJL2.LJIIJJI = 0L;
        }
    }

    public final void LJJIZ(boolean z) {
        long jCurrentTimeMillis;
        long j;
        int i;
        int i2;
        if (this.LLILZ != null && this.LLILLJJLI != null) {
            if (this.LLILLL.LJIIZILJ > this.X1) {
                jCurrentTimeMillis = System.currentTimeMillis();
                j = this.LLILLL.LJIIZILJ;
            } else {
                jCurrentTimeMillis = System.currentTimeMillis();
                j = this.X1;
            }
            long j2 = jCurrentTimeMillis - j;
            if (this.V2 > 0) {
                if (this.Q1 > this.U1) {
                    i2 = 3;
                } else {
                    i2 = 4;
                }
                this.S1 = i2;
            }
            try {
                JSONObject jSONObjectLJIIJJI = LJIIJJI("abr_session");
                if (jSONObjectLJIIJJI != null) {
                    JSONObject jSONObjectPut = jSONObjectLJIIJJI.put("event_key", "abr_session").put("current_resolution", this.J1).put("current_bitrate", this.Q1).put("previous_resolution", this.T1).put("previous_bitrate", this.U1).put("stall_count", this.V1).put("stall_time", this.W1).put("startup_type", this.S1).put("play_time", j2).put("switch_cost", this.V2).put("abr_switch_info", this.W2).put("is_last", z);
                    if (z) {
                        i = this.N1 + 1;
                    } else {
                        i = this.N1;
                    }
                    jSONObjectPut.put("abr_switch_count", i);
                    LJJJJIZL(jSONObjectLJIIJJI);
                }
            } catch (JSONException e) {
                TryCatchGuardChecker.doCheck(e);
            }
            LJJJI();
            this.V1 = 0L;
            this.W1 = 0L;
            this.X1 = System.currentTimeMillis();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x006b, code lost:
    
        if ((r5.intValue() & r9.k6) != 0) goto L20;
     */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:44:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJJJIZL(org.json.JSONObject r10) {
        /*
            Method dump skipped, instruction units count: 224
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.videoarch.liveplayer.log.LiveLoggerService.LJJJJIZL(org.json.JSONObject):void");
    }

    public final void LJJJJL(boolean z) {
        String str;
        int i;
        if (this.f460X == 1) {
            C1476650oWt c1476650oWt = C1476660oWu.LIZ;
            if (z) {
                i = 1008;
            } else {
                i = 1009;
            }
            c1476650oWt.LJII(i, this.LLILZ.Q0, -1L);
        }
        JSONObject jSONObjectLJIIJJI = LJIIJJI("link");
        if (jSONObjectLJIIJJI != null) {
            try {
                JSONObject jSONObjectPut = jSONObjectLJIIJJI.put("event_key", "link");
                if (z) {
                    str = "start";
                } else {
                    str = "end";
                }
                jSONObjectPut.put("info", str);
                LJJJJIZL(jSONObjectLJIIJJI);
            } catch (JSONException e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
    }

    public final void LJJJJZ(String str) {
        this.w6.LIZJ();
        if (this.LLIZ > 0) {
            this.x6.LIZJ();
        }
        boolean zEquals = TextUtils.equals(str, "ao");
        this.K0.lock();
        if (this.b5 != zEquals) {
            this.b5 = zEquals;
            LJLJL();
        }
        this.K0.unlock();
    }

    public final void LJJJJZI(int i) {
        this.K0.lock();
        if (C1481110oe5.LIZ) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("onPrePullModeChange prePullMode=");
            sbLIZ.append(i);
            sbLIZ.append(", ");
            sbLIZ.append(this.c5);
            sbLIZ.append(", videoLiveManagerHash: ");
            sbLIZ.append(this.LLILZ.P0);
            C1481110oe5.LIZIZ("TTKLivePlayer2", C2188811AlT.LIZIZ(sbLIZ));
        }
        if (this.c5 != i) {
            this.c5 = i;
            LJLJL();
        }
        this.K0.unlock();
    }

    public final void LJJJLZIJ(int i) {
        this.F++;
        this.G++;
        this.LLILZ.LLFZ(this.LLILLL, 2, false);
        LJFF();
        LJJJI();
        try {
            JSONObject jSONObjectLJIILJJIL = LJIILJJIL(true);
            jSONObjectLJIILJJIL.put("reason", this.LLZ).put("code", i).put("socket_err_code", this.LLILLL.LLILZLL).put("socket_err_type", this.LLILLL.LLILZIL).put("render_fail_type", this.LLZIL);
            LJJLL(jSONObjectLJIILJJIL);
            this.W6.put(jSONObjectLJIILJJIL);
        } catch (JSONException e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    public final void LJJL(int i) {
        String str;
        if (this.LLZ == -100015) {
            this.LLZ = 0;
        }
        if (!this.k) {
            return;
        }
        this.k = false;
        this.l = 1;
        this.LLILZ.LLFZ(this.LLILLL, 6, false);
        if (this.w0 == null) {
            this.w0 = new ArrayList<>();
        }
        ArrayList<Long> arrayList = this.x0;
        if (arrayList == null || this.y0 == null || arrayList.size() != this.y0.size()) {
            this.x0 = new ArrayList<>();
            this.y0 = new ArrayList<>();
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        this.w0.add(Long.valueOf(this.z0));
        this.w0.add(Long.valueOf(-(jCurrentTimeMillis - this.LLILLL.LIZ)));
        long j = this.LLZILL;
        if (j != 0) {
            this.x0.add(Long.valueOf(j));
            this.y0.add(Long.valueOf(jCurrentTimeMillis - this.LLZILL));
            if (this.x0.size() > 200) {
                ListProtector.remove(this.x0, 0);
                ListProtector.remove(this.y0, 0);
            }
            this.L0.add(new C1915507er(true, jCurrentTimeMillis - this.LLZILL));
        }
        if (this.y == 0) {
            this.y = jCurrentTimeMillis;
        }
        long j2 = this.LLZILL;
        if (j2 != 0) {
            try {
                long j3 = this.LLZL;
                if (j3 != 0) {
                    this.n++;
                    long j4 = jCurrentTimeMillis - j3;
                    this.o += j4;
                    if (this.LLJJJJ) {
                        this.a++;
                        this.b += j4;
                    }
                }
                this.LLZLL++;
                this.LLZLLIL += jCurrentTimeMillis - j2;
                this.k5 += jCurrentTimeMillis - this.LLZILL;
                if (this.LLZLL >= this.LLLZIL) {
                    if (this.LLLZZ != 0) {
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append(this.LLLZI);
                        sbLIZ.append(",[play_time:");
                        sbLIZ.append(jCurrentTimeMillis - this.LLLZZ);
                        sbLIZ.append(", behavior:");
                        sbLIZ.append(-3);
                        sbLIZ.append(e3.f);
                        this.LLLZI = C2188811AlT.LIZIZ(sbLIZ);
                    } else {
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append(this.LLLZI);
                        sbLIZ2.append(",[no_first_frame, behavior:-3]");
                        this.LLLZI = C2188811AlT.LIZIZ(sbLIZ2);
                    }
                    InterfaceC1698710uJ3 interfaceC1698710uJ3 = this.LLILZ.LJIJJ;
                    if (interfaceC1698710uJ3 != null) {
                        interfaceC1698710uJ3.LJJJJLL();
                    }
                    this.LLLZIL += (long) VideoLiveManager.w3;
                }
                if (this.LLZLLIL >= this.LLLZL) {
                    if (this.LLLZZ != 0) {
                        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                        sbLIZ3.append(this.LLLZI);
                        sbLIZ3.append(",[play_time:");
                        sbLIZ3.append(jCurrentTimeMillis - this.LLLZZ);
                        sbLIZ3.append(", behavior:");
                        sbLIZ3.append(-3);
                        sbLIZ3.append(e3.f);
                        this.LLLZI = C2188811AlT.LIZIZ(sbLIZ3);
                    } else {
                        StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                        sbLIZ4.append(this.LLLZI);
                        sbLIZ4.append(",[no_first_frame, behavior:-3]");
                        this.LLLZI = C2188811AlT.LIZIZ(sbLIZ4);
                    }
                    InterfaceC1698710uJ3 interfaceC1698710uJ32 = this.LLILZ.LJIJJ;
                    if (interfaceC1698710uJ32 != null) {
                        interfaceC1698710uJ32.LJJJJLL();
                    }
                    this.LLLZL += (long) VideoLiveManager.v3;
                }
                if (this.LLJJJJ) {
                    this.LLZZ++;
                    this.LLZLLLL += jCurrentTimeMillis - this.LLZILL;
                }
                this.V1++;
                this.W1 += jCurrentTimeMillis - this.LLZILL;
                if (this.t6.get()) {
                    this.r6 += jCurrentTimeMillis - Math.max(this.LLZILL, this.s6);
                }
                JSONObject jSONObjectLJIIJJI = LJIIJJI("stall");
                if (jSONObjectLJIIJJI != null) {
                    jSONObjectLJIIJJI.put("event_key", "stall").put("stall_start", this.LLZILL).put("stall_end", jCurrentTimeMillis).put("video_buffer_time_stall_start", this.LLILLL.LLJJLIIIJLLLLLLLZ).put("audio_buffer_time_stall_start", this.LLILLL.LLJL).put("video_buffer_time_stall_end", this.LLILLL.LLJLIL).put("audio_buffer_time_stall_end", this.LLILLL.LLJLILLLLZIIL).put("last_res", this.K1).put("stall_start_sub_scene", this.u6).put("stall_start_ver", this.v6).put("reason", this.LLZLI).put("recover_reason", i);
                    if (jCurrentTimeMillis - this.LLJ > 1000) {
                        int i2 = this.LLJIJIL;
                        if (i2 > 0) {
                            jSONObjectLJIIJJI.put("discard_last_1s", i2);
                            this.LLJIJIL = 0;
                        }
                        LJJJJIZL(jSONObjectLJIIJJI);
                        this.LLJ = jCurrentTimeMillis;
                    } else {
                        this.LLJIJIL++;
                    }
                }
                VideoLiveManager videoLiveManager = this.LLILZ;
                if (videoLiveManager != null && videoLiveManager.LLZZ == 1) {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("PLAY-StallTime", jCurrentTimeMillis - this.LLZILL).put("event_key", "stall");
                    if (C1474810oTv.LJLJLLL()) {
                        str = this.LLILZIL.LIZIZ;
                    } else {
                        str = this.LLLLZLLLI;
                    }
                    jSONObject.put("PLAY-SessionID", str);
                    if (!TextUtils.isEmpty(this.LLILZ.LLIIL)) {
                        jSONObject.put("live_unique_id", this.LLILZ.LLIIL);
                    }
                    LJIJJLI().businessEvent(62, jSONObject);
                }
            } catch (JSONException e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
    }

    public final void LJJLIIIJJIZ(String str) {
        VideoLiveManager videoLiveManager;
        if (!TextUtils.isEmpty(str) && this.k7 != null && (videoLiveManager = this.LLILZ) != null) {
            long jLLIIJI = videoLiveManager.LLIIJI();
            this.W = jLLIIJI;
            C1698640uIw c1698640uIw = this.k7;
            c1698640uIw.getClass();
            if (!TextUtils.isEmpty(str)) {
                try {
                    JSONObject jSONObject = new JSONObject(str);
                    if (jSONObject.has("formater_in_time")) {
                        long jOptLong = jSONObject.optLong("formater_in_time");
                        if (jSONObject.has("render_done_time")) {
                            long jOptLong2 = jSONObject.optLong("render_done_time");
                            if (jSONObject.has("sei_data")) {
                                String strOptString = jSONObject.optString("sei_data");
                                StringBuilder sbLIZ = C2188811AlT.LIZ();
                                sbLIZ.append("parsed data, formater_in_time:");
                                sbLIZ.append(jOptLong);
                                sbLIZ.append(", render_done_time:");
                                sbLIZ.append(jOptLong2);
                                sbLIZ.append(", sei_data:");
                                sbLIZ.append(strOptString);
                                C2188811AlT.LIZIZ(sbLIZ);
                                C1698940uJQ.LIZJ();
                                JSONObject jSONObject2 = new JSONObject(strOptString);
                                long j = jOptLong + jLLIIJI;
                                long j2 = jOptLong2 + jLLIIJI;
                                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                                sbLIZ2.append("timediff:");
                                sbLIZ2.append(jLLIIJI);
                                sbLIZ2.append(", formaterInTime:");
                                sbLIZ2.append(j);
                                sbLIZ2.append(", renderDoneTime:");
                                sbLIZ2.append(j2);
                                C2188811AlT.LIZIZ(sbLIZ2);
                                C1698940uJQ.LIZJ();
                                c1698640uIw.LIZ(jSONObject2, j, j2);
                            }
                        }
                    }
                } catch (JSONException e) {
                    TryCatchGuardChecker.doCheck(e);
                }
            }
        }
    }

    public final void LJJLIIIJL(String str) {
        if (str == null) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (jSONObject.has("sdk_version")) {
                this.LLJJL = JSONObjectProtectorUtils.getString(jSONObject, "sdk_version");
            }
            if (jSONObject.has("platform")) {
                this.LLJJLIIIJLLLLLLLZ = JSONObjectProtectorUtils.getString(jSONObject, "platform");
            }
            if (jSONObject.has("os_version")) {
                this.LLJL = JSONObjectProtectorUtils.getString(jSONObject, "os_version");
            }
            if (jSONObject.has("model")) {
                this.LLJLIL = JSONObjectProtectorUtils.getString(jSONObject, "model");
            }
            if (jSONObject.has("start_time")) {
                JSONObjectProtectorUtils.getString(jSONObject, "start_time");
            }
            if (jSONObject.has("min_bitrate")) {
                JSONObjectProtectorUtils.getInt(jSONObject, "min_bitrate");
            }
            if (jSONObject.has("max_bitrate")) {
                this.LLJLL = JSONObjectProtectorUtils.getInt(jSONObject, "max_bitrate");
            }
            if (jSONObject.has("default_bitrate")) {
                JSONObjectProtectorUtils.getInt(jSONObject, "default_bitrate");
            }
            if (jSONObject.has("hit_node_optimize")) {
                JSONObjectProtectorUtils.getInt(jSONObject, "hit_node_optimize");
            }
            if (jSONObject.has("push_protocol")) {
                this.LLJLLIL = JSONObjectProtectorUtils.getString(jSONObject, "push_protocol");
            }
            if (jSONObject.has("qId")) {
                this.LLJLLL = JSONObjectProtectorUtils.getString(jSONObject, "qId");
            }
            if (jSONObject.has("orientation")) {
                this.S3 = JSONObjectProtectorUtils.getString(jSONObject, "orientation");
            } else {
                this.S3 = "";
            }
            if (jSONObject.has("link_info")) {
                JSONObjectProtectorUtils.getString(jSONObject, "link_info");
            }
            if (jSONObject.has("h_id")) {
                JSONObjectProtectorUtils.getInt(jSONObject, "h_id");
            }
            if (jSONObject.has("s_id")) {
                JSONObjectProtectorUtils.getInt(jSONObject, "s_id");
            }
            try {
                if (jSONObject.has("is_hardware_encode")) {
                    this.LLJLILLLLZIIL = JSONObjectProtectorUtils.getInt(jSONObject, "is_hardware_encode");
                    return;
                }
                return;
            } catch (JSONException e) {
                TryCatchGuardChecker.doCheck(e);
                return;
            }
        } catch (JSONException e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
        TryCatchGuardChecker.doCheck(e2);
    }

    public final void LJJLIIIJLJLI(JSONObject jSONObject) {
        long j;
        MyNTPTask myNTPTask;
        try {
            if (jSONObject.has("ts")) {
                long j2 = JSONObjectProtectorUtils.getLong(jSONObject, "ts");
                if (this.V != 1 || !jSONObject.has("tt_ntp") || JSONObjectProtectorUtils.getInt(jSONObject, "tt_ntp") != 1) {
                    if (this.U && !jSONObject.has("tt_ntp")) {
                        MyNTPTask myNTPTask2 = this.R;
                        if (myNTPTask2 != null) {
                            myNTPTask2.LIZIZ.removeCallbacksAndMessages(null);
                        }
                        this.U = false;
                    }
                    this.S = false;
                    j = 0;
                } else {
                    if (!this.U && (myNTPTask = this.R) != null) {
                        myNTPTask.LIZ(103);
                        this.U = true;
                    }
                    j = this.W;
                    this.S = true;
                }
                if (jSONObject.has("ntp_diff")) {
                    this.T = jSONObject.optInt("ntp_diff", 0);
                }
                if (jSONObject.has("tt_ntp") && JSONObjectProtectorUtils.getInt(jSONObject, "tt_ntp") == 1) {
                    VideoLiveManager videoLiveManager = this.LLILZ;
                    if (videoLiveManager != null) {
                        this.W = videoLiveManager.LLIIJI();
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("ntp_time_diff:");
                        sbLIZ.append(this.W);
                        C2188811AlT.LIZIZ(sbLIZ);
                        C1698940uJQ.LIZ();
                    }
                    j = this.W;
                    this.S = true;
                }
                this.LLILLL.LJLLLL = (System.currentTimeMillis() - j2) + j;
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("sei_delay: ");
                sbLIZ2.append(this.LLILLL.LJLLLL);
                C2188811AlT.LIZIZ(sbLIZ2);
                C1698940uJQ.LIZJ();
            }
        } catch (JSONException e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    public final void LJJLIL(boolean z) {
        C1698490uIh c1698490uIh;
        int i;
        long j;
        int i2;
        String str;
        String str2;
        C1281010jRL c1281010jRL;
        String string;
        int iIntValue;
        int iIntValue2;
        int i3;
        int i4;
        int i5;
        String strLJIIIZ;
        InterfaceC1467950oIr interfaceC1467950oIr;
        String strLJIIIZ2;
        if (this.LLILZ != null && (c1698490uIh = this.LLILLL) != null) {
            try {
                long j2 = c1698490uIh.LJJLIIIJLJLI;
                JSONObject jSONObject = new JSONObject();
                this.LLILZ.LLFZ(this.LLILLL, 12, false);
                VideoLiveManager videoLiveManager = this.LLILZ;
                C1698550uIn c1698550uIn = this.f7;
                if (c1698550uIn != null) {
                    InterfaceC1467950oIr interfaceC1467950oIr2 = videoLiveManager.LIZLLL;
                    if (interfaceC1467950oIr2 != null) {
                        c1698550uIn.LIZ = ((C1470430oMr) interfaceC1467950oIr2).LJIIJ(381, 0L);
                        c1698550uIn.LIZIZ = ((C1470430oMr) videoLiveManager.LIZLLL).LJIIJ(385, 0L);
                        c1698550uIn.LIZJ = ((C1470430oMr) videoLiveManager.LIZLLL).LJIIJ(387, 0L);
                    }
                } else {
                    videoLiveManager.getClass();
                }
                if (j2 == 0) {
                    i = 0;
                } else {
                    i = (int) (this.LLILLL.LJJLIIIJLJLI - j2);
                }
                Pair<Integer, Integer> pairLIZ = this.x6.LIZ();
                if (!this.Y2) {
                    j = 0;
                } else {
                    j = this.j3 + 0;
                    this.j3 = 0L;
                }
                this.Y2 = false;
                if (i > 0) {
                    i2 = (int) ((j * 1000.0f) / i);
                } else {
                    i2 = -1;
                }
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("input_audio_level", this.LLILLL.LLLZIIL);
                jSONObject2.put("output_audio_level", this.LLILLL.LLLZIL);
                JSONObject jSONObjectPut = jSONObject.put("event_key", "playing_high_freq").put("real_time_cpu_usage", this.LLILLL.LLJILJIL).put("real_time_temperature", this.LLILLL.LLJI).put("real_time_performance_score", this.LLILLL.LLJIJIL);
                if (C1474810oTv.LJLJLLL()) {
                    str = this.LLILZIL.LIZIZ;
                } else {
                    str = this.LLLLZLLLI;
                }
                JSONObject jSONObjectPut2 = jSONObjectPut.put("live_stream_session_id", str);
                if (C1474810oTv.LJLJLLL()) {
                    str2 = this.LLILZIL.LIZIZ;
                } else {
                    str2 = this.LLLLZLLLI;
                }
                JSONObject jSONObjectPut3 = jSONObjectPut2.put("live_vv_session_id", str2).put("quic_connection_id", this.LLILLL.LLJILJILJ).put("network_stats", this.LLILLL.LLJZIJLIL).put("cctk_cnt", this.LLILLL.LJJJLL).put("cctk_cnt_cached", this.LLILLL.LJJJLZIJ).put("cctk_index_diff", this.LLILLL.LJJJZ);
                VideoLiveManager videoLiveManager2 = this.LLILZ;
                String strLJIIIZ3 = "";
                if (videoLiveManager2 == null || (c1281010jRL = videoLiveManager2.LJIIZILJ) == null) {
                    string = "";
                } else {
                    string = c1281010jRL.toString();
                }
                JSONObject jSONObjectPut4 = jSONObjectPut3.put("nqe", string).put("network_info", this.LLILLL.LJJLI).put("bwa_result", this.LLILLL.LJJL).put("quic_request_time", this.LLILLL.LJJLIIIJJI).put("is_abr", this.LLILZ.W1).put("enable_startup", this.K5).put("abr_decision_reason", this.P6).put("predict_bitrate", this.M6).put("source_bitrate", this.N6).put("source_resolution", this.O6).put("video_render_stall_time", this.f7.LIZ / 1000).put("video_render_stall_count", this.f7.LIZ % 1000).put("video_demux_stall_time", this.f7.LIZIZ / 1000).put("video_demux_stall_count", this.f7.LIZIZ % 1000).put("video_decode_stall_time", this.f7.LIZJ / 1000).put("video_decode_stall_count", this.f7.LIZJ % 1000).put("timestamp", System.currentTimeMillis() + this.LLILZ.LLIIJI()).put("play_time", i);
                if (pairLIZ == null) {
                    iIntValue = 0;
                } else {
                    iIntValue = ((Integer) pairLIZ.first).intValue();
                }
                JSONObject jSONObjectPut5 = jSONObjectPut4.put("stall_time", iIntValue);
                if (pairLIZ == null) {
                    iIntValue2 = 0;
                } else {
                    iIntValue2 = ((Integer) pairLIZ.second).intValue();
                }
                JSONObject jSONObjectPut6 = jSONObjectPut5.put("stall_count", iIntValue2).put("width", this.b0).put("height", this.c0).put("resolution", this.F1);
                if (this.LLLILZLLLI) {
                    i3 = 1;
                } else {
                    i3 = 0;
                }
                JSONObject jSONObjectPut7 = jSONObjectPut6.put("hardware_decode", i3).put("video_buffer_time", this.LLILLL.LJLILLLLZI).put("cur_video_buffer_time", this.LLILLL.LJLIIL);
                if (this.x6.LIZJ != -1) {
                    i4 = 1;
                } else {
                    i4 = 0;
                }
                JSONObject jSONObjectPut8 = jSONObjectPut7.put("is_rebuffering", i4).put("sync_diff", this.LLILLL.LJJLIIIJLLLLLLLZ).put("download_speed", (int) this.LLILLL.LJJZZI).put("play_real_bitrate", this.LLILLL.LLLZLL).put("render_fps", i2).put("render_frame_cnt", j).put("audio_level_info", jSONObject2);
                if (this.Z4) {
                    i5 = 1;
                } else {
                    i5 = 0;
                }
                jSONObjectPut8.put("radio_mode", i5).put("manual_resolution", this.H1).put("is_background", this.e5).put("request_url", this.N3);
                VideoLiveManager videoLiveManager3 = this.LLILZ;
                if (videoLiveManager3 != null && videoLiveManager3.LLJLIL == 1) {
                    InterfaceC1467950oIr interfaceC1467950oIr3 = videoLiveManager3.LIZLLL;
                    if (interfaceC1467950oIr3 == null) {
                        strLJIIIZ2 = "";
                    } else {
                        strLJIIIZ2 = ((C1470430oMr) interfaceC1467950oIr3).LJIIIZ(1995);
                        if (strLJIIIZ2 != null) {
                        }
                    }
                    if (!strLJIIIZ2.isEmpty() && !"{}".equals(strLJIIIZ2)) {
                        try {
                            JSONObject jSONObject3 = new JSONObject(strLJIIIZ2);
                            jSONObject.put("render_stall_primary_reason", jSONObject3.optString("primary_reason", "UNKNOWN"));
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append("render_stall_primary_reason:");
                            sbLIZ.append(jSONObject3.optString("primary_reason", "UNKNOWN"));
                            C2188811AlT.LIZIZ(sbLIZ);
                            C1698940uJQ.LIZJ();
                        } catch (JSONException e) {
                            TryCatchGuardChecker.doCheck(e);
                            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                            sbLIZ2.append("render_stall_primary_reason parse error: ");
                            sbLIZ2.append(e.getMessage());
                            C2188811AlT.LIZIZ(sbLIZ2);
                            C1698940uJQ.LIZIZ();
                        }
                    }
                }
                VideoLiveManager videoLiveManager4 = this.LLILZ;
                if (videoLiveManager4 != null && videoLiveManager4.LLJLILLLLZIIL == 1 && (((interfaceC1467950oIr = videoLiveManager4.LIZLLL) == null || (strLJIIIZ3 = ((C1470430oMr) interfaceC1467950oIr).LJIIIZ(1998)) != null) && !strLJIIIZ3.isEmpty() && !"{}".equals(strLJIIIZ3))) {
                    try {
                        JSONObject jSONObject4 = new JSONObject(strLJIIIZ3);
                        jSONObject.put("decode_stall_primary_reason", jSONObject4.optString("primary_reason", "UNKNOWN"));
                        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                        sbLIZ3.append("decode_stall_primary_reason:");
                        sbLIZ3.append(jSONObject4.optString("primary_reason", "UNKNOWN"));
                        C2188811AlT.LIZIZ(sbLIZ3);
                        C1698940uJQ.LIZJ();
                    } catch (JSONException e2) {
                        TryCatchGuardChecker.doCheck(e2);
                        StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                        sbLIZ4.append("decode_stall_primary_reason parse error: ");
                        sbLIZ4.append(e2.getMessage());
                        C2188811AlT.LIZIZ(sbLIZ4);
                        C1698940uJQ.LIZIZ();
                    }
                }
                VideoLiveManager videoLiveManager5 = this.LLILZ;
                if (videoLiveManager5.m2 == 1) {
                    InterfaceC1467950oIr interfaceC1467950oIr4 = videoLiveManager5.LIZLLL;
                    if (interfaceC1467950oIr4 == null) {
                        strLJIIIZ = null;
                    } else {
                        strLJIIIZ = ((C1470430oMr) interfaceC1467950oIr4).LJIIIZ(1399);
                    }
                    jSONObject.put("buffer_stats", strLJIIIZ);
                    String strLJIILLIIL = LJIILLIIL();
                    if (strLJIILLIIL != null) {
                        jSONObject.put("buffer_stats_before_retry", strLJIILLIIL);
                    }
                }
                LIZJ(jSONObject);
                LJLJI(jSONObject);
                if (this.LLILZ.LLLFFI) {
                    this.f7.LJ(jSONObject, true, j2, this.LLILLL.LJJLIIIJLJLI);
                }
                LJJJJIZL(jSONObject);
            } catch (JSONException e3) {
                TryCatchGuardChecker.doCheck(e3);
            }
            if (z && this.LLIZLLLIL) {
                long j3 = this.LLIZ;
                if (j3 > 0) {
                    C786410Ut5.LJLJJI(105, j3, this.LL);
                }
            }
        }
    }

    public final void LJJLL(JSONObject jSONObject) throws JSONException {
        if (TextUtils.equals(this.m1, "quic")) {
            jSONObject.put("quic_open_result", this.LLILLL.LLJ);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("quic_open_result = ");
            sbLIZ.append(this.LLILLL.LLJ);
            C2188811AlT.LIZIZ(sbLIZ);
            C1698940uJQ.LIZJ();
        }
    }

    public final void LJLI(long j) {
        if (j > 0) {
            this.LLIZ = j;
            C1698550uIn c1698550uIn = this.f7;
            c1698550uIn.LJIIIZ.K0.lock();
            c1698550uIn.LJ = true;
            c1698550uIn.LJIIIIZZ = new HashMap(14);
            c1698550uIn.LJIIIZ.K0.unlock();
        }
    }

    public final void LJLJI(JSONObject jSONObject) throws JSONException {
        if (C1474810oTv.LJLJLLL()) {
            jSONObject.put("vvsession_id_refoctor_enabled", C1474810oTv.LJLJLLL() ? 1 : 0);
            jSONObject.put("live_stream_session_id", this.LLILZIL.LIZIZ);
            jSONObject.put("live_vv_session_id", this.LLILZIL.LIZIZ);
            jSONObject.put("live_mio_task_id", this.LLILZIL.LIZLLL);
            return;
        }
        if (!TextUtils.isEmpty(this.LLLLZLL)) {
            jSONObject.put("live_stream_session_id", this.LLLLZLL);
        }
    }

    public final void LJLJJI(int i) {
        C1698490uIh c1698490uIh;
        VideoLiveManager videoLiveManager = this.LLILZ;
        if (videoLiveManager != null && this.LLILLJJLI != null && (c1698490uIh = this.LLILLL) != null) {
            if (i == 1) {
                this.l6 = c1698490uIh.LJJJJI;
                this.m6 = c1698490uIh.LJJLIIIJL;
                this.n6 = c1698490uIh.LJJJJ;
                this.o6 = c1698490uIh.LJJLL;
                this.o3 = c1698490uIh.LJJLJLI;
            }
            videoLiveManager.LLFZ(c1698490uIh, i, false);
            if (i == 1) {
                C1698490uIh c1698490uIh2 = this.LLILLL;
                this.p6 = c1698490uIh2.LJLIIL;
                this.q6 = c1698490uIh2.LJLIL;
            }
        }
    }

    public final void LJLJJL(JSONObject jSONObject) {
        if (jSONObject.has("event_message")) {
            String strOptString = jSONObject.optString("event_message");
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("eventMessage:");
            sbLIZ.append(strOptString);
            C2188811AlT.LIZIZ(sbLIZ);
            C1698940uJQ.LIZJ();
            if (!TextUtils.isEmpty(strOptString) && jSONObject.has("phase_timestamp")) {
                if (TextUtils.equals("dns resolved", strOptString)) {
                    if (jSONObject.has("request_ip")) {
                        String strOptString2 = jSONObject.optString("request_ip");
                        if (!strOptString2.equals(this.D3)) {
                            this.LLJJIJIL = strOptString2;
                        }
                    }
                    this.E3 = CastLongProtector.parseLong(jSONObject.optString("phase_timestamp"));
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("mRtcDnsTimeStamp:");
                    sbLIZ2.append(this.E3);
                    C2188811AlT.LIZIZ(sbLIZ2);
                    C1698940uJQ.LIZJ();
                    return;
                }
                if (!TextUtils.equals("tcp connected", strOptString) && !TextUtils.equals("quic connected", strOptString) && !TextUtils.equals("send request", strOptString)) {
                    if (TextUtils.equals("tls handshaked", strOptString)) {
                        this.G3 = CastLongProtector.parseLong(jSONObject.optString("phase_timestamp"));
                        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                        sbLIZ3.append("mRtcTlsHandshakedTimeStamp:");
                        sbLIZ3.append(this.G3);
                        C2188811AlT.LIZIZ(sbLIZ3);
                        C1698940uJQ.LIZJ();
                        return;
                    }
                    if (!TextUtils.equals("response received", strOptString) && !TextUtils.equals("remote answer got", strOptString)) {
                        return;
                    }
                    this.H3 = CastLongProtector.parseLong(jSONObject.optString("phase_timestamp"));
                    StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                    sbLIZ4.append("mRtcTcpFirstPackageTimeStamp:");
                    sbLIZ4.append(this.H3);
                    C2188811AlT.LIZIZ(sbLIZ4);
                    C1698940uJQ.LIZJ();
                    return;
                }
                this.F3 = CastLongProtector.parseLong(jSONObject.optString("phase_timestamp"));
                StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                sbLIZ5.append("mRtcTcpConnectTimeStamp:");
                sbLIZ5.append(this.F3);
                C2188811AlT.LIZIZ(sbLIZ5);
                C1698940uJQ.LIZJ();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0075  */
    @Override // android.os.Handler.Callback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean handleMessage(android.os.Message r21) {
        /*
            Method dump skipped, instruction units count: 276
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.videoarch.liveplayer.log.LiveLoggerService.handleMessage(android.os.Message):boolean");
    }

    public static void LJIIJ(ArrayList arrayList, JSONObject jSONObject) {
        if (jSONObject.length() > 0 && arrayList != null) {
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                String strOptString = jSONObject.optString(next);
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(next);
                sbLIZ.append(":");
                sbLIZ.append(strOptString);
                arrayList.add(C2188811AlT.LIZIZ(sbLIZ));
            }
        }
    }

    public static int LJJI(String str, String str2) {
        if (!TextUtils.isEmpty(str) && !str.equals("none") && !TextUtils.isEmpty(str2)) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                if (jSONObject.has(str2)) {
                    return jSONObject.optInt(str2);
                }
                return -1;
            } catch (JSONException e) {
                TryCatchGuardChecker.doCheck(e);
                return -1;
            }
        }
        return -1;
    }

    public static void LJJLIIIJLLLLLLLZ(JSONObject jSONObject, C1698700uJ2 c1698700uJ2) {
        jSONObject.put("source_cdn", c1698700uJ2.LIZJ);
        jSONObject.put("target_cdn", c1698700uJ2.LIZLLL);
        jSONObject.put("source_domain", c1698700uJ2.LJ);
        jSONObject.put("target_domain", c1698700uJ2.LJFF);
        jSONObject.put("source_url", c1698700uJ2.LIZ);
        jSONObject.put("target_url", c1698700uJ2.LIZIZ);
        jSONObject.put("attempt_timestamp", c1698700uJ2.LJIIIZ);
        jSONObject.put("in_feed_ind", c1698700uJ2.LJI.getCode());
        jSONObject.put("switch_type", c1698700uJ2.LJIIJJI.getCode());
        jSONObject.put("switch_type_description", c1698700uJ2.LJIIJJI.getDescription());
        jSONObject.put("switch_details", new JSONObject(c1698700uJ2.LJIIL));
        String str = c1698700uJ2.LJIILIIL;
        if (str == null) {
            str = "";
        }
        jSONObject.put("unique_id", str);
        jSONObject.put("signaling_push_ts", c1698700uJ2.LJIILJJIL);
        if (c1698700uJ2.LJIIJJI == EnumC1699200uJq.SIGNAL_INITIATED) {
            long j = c1698700uJ2.LJIIIZ;
            long j2 = c1698700uJ2.LJII;
            jSONObject.put("receive_signal_timestamp", j2);
            jSONObject.put("attempt_to_receive_latency", j - j2);
        }
    }

    public final void LJJIJL(int i, long j) {
        if (this.g7 == null) {
            this.g7 = new C1698980uJU();
        }
        C1698980uJU c1698980uJU = this.g7;
        c1698980uJU.LIZ = j;
        c1698980uJU.LIZJ = i;
        c1698980uJU.LIZIZ = -1L;
        c1698980uJU.LIZLLL++;
    }

    public final void LJJJ(long j, String str) {
        if (this.LLILZ == null) {
            return;
        }
        try {
            JSONObject jSONObjectLJIIJJI = LJIIJJI("abr_switch");
            C1698490uIh c1698490uIh = new C1698490uIh();
            this.LLILZ.LLFZ(c1698490uIh, 11, false);
            long j2 = c1698490uIh.LJI;
            long j3 = j2 - c1698490uIh.LJ;
            long j4 = c1698490uIh.LJIIL - j2;
            long jCurrentTimeMillis = 0;
            if (this.LLILLL.LJIIZILJ > 0) {
                jCurrentTimeMillis = System.currentTimeMillis() - this.LLILLL.LJIIZILJ;
            }
            jSONObjectLJIIJJI.put("event_key", "abr_switch").put("is_auto_switch", 1).put("target_resoultion", str).put("predict_bitrate", j).put("abr_switch_info", this.W2).put("cur_download_speed", this.S2).put("cur_audio_buffer_time", this.T2).put("cur_video_buffer_time", this.U2).put("stall_count", this.LLZLL).put("switch_cost", this.V2).put("use_expect_bitrate", this.R3).put("tcp_connect_cost", j3).put("tcp_first_package_cost", j4).put("find_stream_info_cost", c1698490uIh.LLLLIILLL).put("request_url", c1698490uIh.LLLLIL).put("prev_video_buffer_time", c1698490uIh.LJLIIL).put("prev_audio_buffer_time", c1698490uIh.LJLIL).put("external_smooth_switch", 0).put("abr_switch_count", this.M2).put("request_cdn_cached", c1698490uIh.LJJIZ).put("request_time_to_source", c1698490uIh.LJJJ).put("request_time_for_cdn", c1698490uIh.LJJJI).put("close_io_cost", c1698490uIh.LLLLILI).put("play_time", jCurrentTimeMillis).put("abr_switch_stall_time", this.r6).put("abr_strategy_log", this.q2).put("abr_switch_fail_count", this.N2).put("abr_decision_reason", this.m2);
            LIZJ(jSONObjectLJIIJJI);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("abr switch log: ");
            sbLIZ.append(jSONObjectLJIIJJI);
            C1698940uJQ.LIZLLL("LiveLoggerService", C2188811AlT.LIZIZ(sbLIZ));
            LJJJI();
            this.R3 = 0;
            if (this.y1 == 1) {
                LJJJJIZL(jSONObjectLJIIJJI);
            }
        } catch (JSONException e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    public final void LJJJJJ(long j, long j2) {
        String str;
        int i;
        int i2;
        String str2;
        C1279660jPA c1279660jPA;
        long j3;
        long j4;
        long j5;
        long j6;
        long j7;
        long j8;
        long j9;
        boolean z = true;
        if (j2 > 0) {
            this.LLLZLZ = true;
            C1279650jP9 c1279650jP9 = this.LLLFZ;
            if (c1279650jP9 != null && c1279650jP9.LIZJ <= 0) {
                c1279650jP9.LIZJ = j2;
            }
            LJJLJLI();
            LJJLJ();
        }
        if (this.LLILZ.LLJJJJ()) {
            this.LLILZ.LLJLLL(j2);
        }
        VideoLiveManager videoLiveManager = this.LLILZ;
        videoLiveManager.LLIFFJFJJ = false;
        videoLiveManager.LLII = 0;
        videoLiveManager.LLIIII = 0L;
        this.f467m3 = this.G;
        this.n3 = this.o3;
        if (this.LLLZZIL == 0 && j2 > 0) {
            this.LLLZZIL = j2;
        }
        this.LLLZZ = j2;
        this.e6 = j2;
        if (this.LLJJJJ) {
            this.k4 = j2;
        }
        C1698490uIh c1698490uIh = this.LLILLL;
        if (c1698490uIh != null) {
            try {
                c1698490uIh.LJIIZILJ = j2;
                c1698490uIh.LJJLIIIJL = System.currentTimeMillis();
                C1698490uIh c1698490uIh2 = this.LLILLL;
                long j10 = c1698490uIh2.LJJLIIIJL;
                c1698490uIh2.LJJLIIIJLJLI = j10;
                if (this.LLJJJJ) {
                    c1698490uIh2.LJJLJLI = j10;
                }
                this.LLILZ.LLFZ(c1698490uIh2, 0, false);
                C1698790uJB c1698790uJB = this.e7;
                if (c1698790uJB != null && c1698790uJB.LIZ) {
                    long j11 = c1698790uJB.LJIIIIZZ;
                    if (j11 > 0) {
                        this.LLILLL.LJIJI = j11;
                    }
                    C1698490uIh c1698490uIh3 = this.LLILLL;
                    if (c1698790uJB.LIZIZ > 0) {
                        j3 = c1698490uIh3.LIZ;
                    } else {
                        j3 = c1698490uIh3.LIZJ;
                    }
                    c1698490uIh3.LIZJ = j3;
                    if (c1698790uJB.LIZJ > 0) {
                        j4 = c1698490uIh3.LIZ;
                    } else {
                        j4 = c1698490uIh3.LJ;
                    }
                    c1698490uIh3.LJ = j4;
                    if (c1698790uJB.LIZLLL > 0) {
                        j5 = c1698490uIh3.LIZ;
                    } else {
                        j5 = c1698490uIh3.LJI;
                    }
                    c1698490uIh3.LJI = j5;
                    if (c1698790uJB.LJ > 0) {
                        j6 = c1698490uIh3.LIZ;
                    } else {
                        j6 = c1698490uIh3.LJIIL;
                    }
                    c1698490uIh3.LJIIL = j6;
                    if (c1698790uJB.LJFF > 0) {
                        j7 = c1698490uIh3.LIZ;
                    } else {
                        j7 = c1698490uIh3.LJIILIIL;
                    }
                    c1698490uIh3.LJIILIIL = j7;
                    if (c1698790uJB.LJII > 0) {
                        j8 = c1698490uIh3.LIZ;
                    } else {
                        j8 = c1698490uIh3.LJIL;
                    }
                    c1698490uIh3.LJIL = j8;
                    if (c1698790uJB.LJI > 0) {
                        j9 = c1698490uIh3.LIZ;
                    } else {
                        j9 = c1698490uIh3.LJIILL;
                    }
                    c1698490uIh3.LJIILL = j9;
                }
                JSONObject jSONObjectLJIIL = LJIIL(this.LLILLL, this.LLLII, j);
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("onFirstFrame , MediaBox 1.10.291.6-mt, PlayerCore ");
                sbLIZ.append(this.LLJJJIL);
                sbLIZ.append(", MediaIO ");
                sbLIZ.append(this.r4);
                sbLIZ.append(", ttquic ");
                sbLIZ.append(this.LLILLL.LLIIZ);
                C2188811AlT.LIZIZ(sbLIZ);
                C1698940uJQ.LIZJ();
                long jOptLong = jSONObjectLJIIL.optLong("total_cost");
                long jOptLong2 = jSONObjectLJIIL.optLong("tcp_connect_end") - jSONObjectLJIIL.optLong("player_dns_analysis_end");
                C1279650jP9 c1279650jP92 = this.LLLFZ;
                if (c1279650jP92 != null && (((c1279660jPA = c1279650jP92.LIZ) != null && c1279660jPA.LIZJ > 0) || c1279650jP92.LJ)) {
                    C1698940uJQ.LIZJ();
                } else {
                    C1698940uJQ.LIZJ();
                    C1279650jP9 c1279650jP93 = this.LLLFZ;
                    if (c1279650jP93 != null) {
                        c1279650jP93.LIZIZ(jSONObjectLJIIL);
                    }
                    LJJJJIZL(jSONObjectLJIIL);
                }
                this.Z6 = jOptLong;
                this.a7 = this.LLILLL.LJJZZI;
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("1.0:");
                sbLIZ2.append(this.LLLZZ);
                this.LLLLLLLLLL = C2188811AlT.LIZIZ(sbLIZ2);
                C1698490uIh c1698490uIh4 = this.LLILLL;
                long j12 = c1698490uIh4.LJLLLL;
                c1698490uIh4.LJZL = j12;
                c1698490uIh4.LL = j12;
                VideoLiveManager videoLiveManager2 = this.LLILZ;
                if (videoLiveManager2 != null && videoLiveManager2.LLZZ == 1) {
                    JSONObject jSONObject = new JSONObject();
                    JSONObject jSONObjectPut = jSONObject.put("PLAY-FirstFrameAudioBuffer", this.LLILLL.LJLIL).put("PLAY-StartTs", this.LLILLL.LIZ).put("PLAY-TcpConnectEnd", this.LLILLL.LJI).put("PLAY-TcpFirstPacketEnd", this.LLILLL.LJIIL).put("PLAY-FirstVideoPacketEnd", this.LLILLL.LJIILIIL).put("PLAY-FirstVideoFrameDecodeEnd", this.LLILLL.LJIILL).put("PLAY-FirstFrameEnd", this.LLLZZ);
                    VideoLiveManager videoLiveManager3 = this.LLILZ;
                    String str3 = "none";
                    if (videoLiveManager3 == null) {
                        str = "none";
                    } else {
                        str = videoLiveManager3.O1;
                    }
                    JSONObject jSONObjectPut2 = jSONObjectPut.put("PLAY-StartupRes", str).put("PLAY-StartupVrtbitrate", this.LLILLL.LJLLJ).put("PLAY-Resolution", this.LLILZ.T1).put("PLAY-FirstFrameVideoBuffer", this.LLILLL.LJLIIL).put("PLAY-FirstFrameDownloadSpeed", this.LLILLL.LJJZZI);
                    String str4 = this.LLJILLL;
                    if (str4 == null) {
                        str4 = "none";
                    }
                    JSONObject jSONObjectPut3 = jSONObjectPut2.put("PLAY-EnterMethod", str4);
                    String str5 = this.LLJJ;
                    if (str5 == null) {
                        str5 = "none";
                    }
                    JSONObject jSONObjectPut4 = jSONObjectPut3.put("PLAY-EnterAction", str5);
                    String str6 = this.LLJJI;
                    if (str6 != null) {
                        str3 = str6;
                    }
                    JSONObject jSONObjectPut5 = jSONObjectPut4.put("PLAY-EnterMethodSubtag", str3);
                    if (this.LLJJJJ) {
                        i = 1;
                    } else {
                        i = 0;
                    }
                    JSONObject jSONObjectPut6 = jSONObjectPut5.put("PLAY-IsPreview", i).put("PLAY-Protocol", LJJIIJ()).put("PLAY-ConnectionID", this.LLILLL.LLJILJILJ).put("PLAY-FirstFrame", jOptLong);
                    if (this.LLLZLZ) {
                        i2 = 1;
                    } else {
                        i2 = 0;
                    }
                    JSONObject jSONObjectPut7 = jSONObjectPut6.put("PLAY-Success", i2);
                    if (this.LLILLL.LJIIJJI <= 0) {
                        z = false;
                    }
                    JSONObject jSONObjectPut8 = jSONObjectPut7.put("PLAY-302", z).put("PLAY-ConnectCost", jOptLong2);
                    if (C1474810oTv.LJLJLLL()) {
                        str2 = this.LLILZIL.LIZIZ;
                    } else {
                        str2 = this.LLLLZLLLI;
                    }
                    JSONObject jSONObjectPut9 = jSONObjectPut8.put("PLAY-SessionID", str2).put("PLAY-StreamSuffix", this.LLILZ.LLJILJIL).put("PLAY-NeptuneName", this.LLILZ.LLJJJJ).put("PLAY-FirstSession", this.LLILLL.LJLLLLLL).put("PLAY-Reused", this.LLILLL.LLJJIJIIJIL).put("PLAY-CdnName", this.LLILZ.LJLLI()).put("PLAY-HostName", this.x5).put("PLAY-FirstKeyFrameSpeed", this.LLILLL.LLZ).put("PLAY-FirstKeyFrameSize", this.LLILLL.LLLZZIL);
                    InterfaceC1467950oIr interfaceC1467950oIr = this.LLILZ.LIZLLL;
                    float fLJIILIIL = 0.0f;
                    if (interfaceC1467950oIr != null) {
                        fLJIILIIL = ((C1470430oMr) interfaceC1467950oIr).LJIILIIL(0.0f, 150);
                    }
                    jSONObjectPut9.put("PLAY-FPS", fLJIILIIL);
                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                    sbLIZ3.append("first session:");
                    sbLIZ3.append(this.LLILLL.LJLLLLLL);
                    sbLIZ3.append(", cdnName: ");
                    sbLIZ3.append(this.LLILZ.LJLLI());
                    C2188811AlT.LIZIZ(sbLIZ3);
                    C1698940uJQ.LIZJ();
                    if (!TextUtils.isEmpty(this.LLILZ.LLIIL)) {
                        jSONObject.put("live_unique_id", this.LLILZ.LLIIL);
                    }
                    jSONObject.put("enable_store_event", this.u5);
                    LJIJJLI().businessEvent(61, jSONObject);
                }
            } catch (JSONException e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x0112 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:111:0x00f0 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJJJLI(int r35, org.json.JSONObject r36) {
        /*
            Method dump skipped, instruction units count: 518
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.videoarch.liveplayer.log.LiveLoggerService.LJJJJLI(int, org.json.JSONObject):void");
    }

    public final void LJJJJLL(String str, String str2) {
        String str3;
        int i;
        String str4;
        if (this.a2) {
            return;
        }
        C1279650jP9 c1279650jP9 = this.LLLFZ;
        if (c1279650jP9 != null) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (jCurrentTimeMillis > 0 && c1279650jP9.LIZIZ <= 0) {
                c1279650jP9.LIZIZ = jCurrentTimeMillis;
            }
        }
        C1698490uIh c1698490uIh = this.LLILLL;
        c1698490uIh.LLIIJLIL = str2;
        this.LLJJIJI = str;
        this.LLJJIJIIJIL = str;
        int i2 = 1;
        this.a2 = true;
        this.h7.LJ = c1698490uIh.LIZ;
        JSONObject jSONObjectLJIIJJI = LJIIJJI("start_play");
        if (jSONObjectLJIIJJI != null) {
            try {
                jSONObjectLJIIJJI.put("event_key", "start_play").put("rule_ids", this.LLLLZIL).put("set_surface_cost", this.e1).put("start_play_time", this.LLILLL.LIZ).put("startup_strategy_start_ts", this.LLILLL.LLLLZLLLI).put("stream_data", this.h1).put("suggest_format", this.l1).put("suggest_protocol", this.n1).put("suggest_access_code", this.s1).put("origin_url", this.r1);
                LIZJ(jSONObjectLJIIJJI);
                if (TextUtils.equals(this.m1, "h2") || TextUtils.equals(this.m1, "h2q")) {
                    jSONObjectLJIIJJI.remove("h2_context_start_cost");
                }
                C1279650jP9 c1279650jP92 = this.LLLFZ;
                if (c1279650jP92 == null || (!c1279650jP92.LJFF() && !c1279650jP92.LJ)) {
                    C1698940uJQ.LIZJ();
                    LJJJJIZL(jSONObjectLJIIJJI);
                } else {
                    C1698940uJQ.LIZJ();
                }
                this.b7 = System.currentTimeMillis();
                VideoLiveManager videoLiveManager = this.LLILZ;
                if (videoLiveManager != null && videoLiveManager.LLZZ == 1) {
                    JSONObject jSONObject = new JSONObject();
                    if (C1474810oTv.LJLJLLL()) {
                        str3 = this.LLILZIL.LIZIZ;
                    } else {
                        str3 = this.LLLLZLLLI;
                    }
                    jSONObject.put("PLAY-SessionID", str3);
                    if (!TextUtils.isEmpty(this.LLILZ.LLIIL)) {
                        jSONObject.put("live_unique_id", this.LLILZ.LLIIL);
                    }
                    if (this.LLILZ.I2 == 3) {
                        i = 1;
                    } else {
                        i = 0;
                    }
                    jSONObject.put("live_pre_pull", i);
                    if (!this.LLJJJJ) {
                        i2 = 0;
                    }
                    jSONObject.put("PLAY-IsPreview", i2);
                    jSONObject.put("PLAY-NeptuneName", this.LLILZ.LLJJJJ);
                    jSONObject.put("enable_store_event", this.u5);
                    if (!TextUtils.isEmpty(this.LLILZ.Q0)) {
                        str4 = this.LLILZ.Q0;
                    } else {
                        str4 = "";
                    }
                    jSONObject.put("mio_sessionId", str4);
                    LJIJJLI().businessEvent(60, jSONObject);
                }
                C787360Uuc c787360Uuc = this.z6;
                if (c787360Uuc != null) {
                    c787360Uuc.LIZIZ();
                    int iLIZ = this.z6.LIZ();
                    this.D6 = iLIZ;
                    this.E6 = iLIZ;
                }
                this.B6 = 0;
                this.C6 = 0;
            } catch (JSONException e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
    }

    public final void LJJJZ(long j, boolean z) {
        String str;
        int i;
        String str2;
        if (j > System.currentTimeMillis() - this.LLILLL.LIZ) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("abnormal rtc decode stall time");
            sbLIZ.append(j);
            C2188811AlT.LIZIZ(sbLIZ);
            C1698940uJQ.LIZJ();
            return;
        }
        JSONObject jSONObjectLJIIJJI = LJIIJJI("rtc_decode_stall");
        if (jSONObjectLJIIJJI != null) {
            try {
                JSONObject jSONObjectPut = jSONObjectLJIIJJI.put("event_key", "rtc_decode_stall");
                if (z) {
                    str = "video";
                } else {
                    str = "audio";
                }
                jSONObjectPut.put("type", str).put("decode_stall_time", j);
                LJJJJIZL(jSONObjectLJIIJJI);
                JSONObject jSONObject = new JSONObject();
                if (z) {
                    i = 0;
                } else {
                    i = 1;
                }
                jSONObject.put("PLAY-StallType", i).put("PLAY-StallTime", j).put("event_key", "rtc_decode_stall");
                if (C1474810oTv.LJLJLLL()) {
                    str2 = this.LLILZIL.LIZIZ;
                } else {
                    str2 = this.LLLLZLLLI;
                }
                jSONObject.put("PLAY-SessionID", str2);
                if (!TextUtils.isEmpty(this.LLILZ.LLIIL)) {
                    jSONObject.put("live_unique_id", this.LLILZ.LLIIL);
                }
                VideoLiveManager videoLiveManager = this.LLILZ;
                if (videoLiveManager != null && videoLiveManager.LLZZ == 1) {
                    LJIJJLI().businessEvent(62, jSONObject);
                }
            } catch (JSONException e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
    }

    public final void LJJLIIIIJ(int i, boolean z) {
        this.LLZ = -100015;
        if (!z) {
            return;
        }
        this.LLILZ.LLFZ(this.LLILLL, 5, false);
        long jCurrentTimeMillis = System.currentTimeMillis();
        this.LLZILL = jCurrentTimeMillis;
        if (this.x == 0) {
            this.x = jCurrentTimeMillis;
        }
        this.LLZL = jCurrentTimeMillis;
        this.LLZLI = i;
        this.k = true;
        this.l = 1;
        if (this.w0 == null) {
            this.w0 = new ArrayList<>();
        }
        long j = this.LLZILL;
        C1698490uIh c1698490uIh = this.LLILLL;
        this.z0 = j - c1698490uIh.LIZ;
        this.u6 = c1698490uIh.LLFII;
        this.v6 = c1698490uIh.LLF;
    }

    public static void LIZIZ(String str, long j, JSONObject jSONObject) {
        if (jSONObject != null) {
            try {
                jSONObject.put("app_session_uuid", str).put("report_id", j);
            } catch (JSONException e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
    }

    public static void LJJIJIIJIL(String str, String str2, JSONObject jSONObject) throws JSONException {
        if (!TextUtils.isEmpty(str)) {
            String[] strArrSplit = str.split(":");
            if (strArrSplit.length == 7) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(str2);
                sbLIZ.append("sync_diff_excellent_count");
                jSONObject.put(C2188811AlT.LIZIZ(sbLIZ), CastIntegerProtector.parseInt(strArrSplit[0]));
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append(str2);
                sbLIZ2.append("sync_diff_normal_count");
                jSONObject.put(C2188811AlT.LIZIZ(sbLIZ2), CastIntegerProtector.parseInt(strArrSplit[1]));
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append(str2);
                sbLIZ3.append("sync_diff_base_count");
                jSONObject.put(C2188811AlT.LIZIZ(sbLIZ3), CastIntegerProtector.parseInt(strArrSplit[2]));
                StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                sbLIZ4.append(str2);
                sbLIZ4.append("sync_diff_count");
                jSONObject.put(C2188811AlT.LIZIZ(sbLIZ4), CastIntegerProtector.parseInt(strArrSplit[3]));
                StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                sbLIZ5.append(str2);
                sbLIZ5.append("unsync_firstframe_count");
                jSONObject.put(C2188811AlT.LIZIZ(sbLIZ5), CastIntegerProtector.parseInt(strArrSplit[4]));
                StringBuilder sbLIZ6 = C2188811AlT.LIZ();
                sbLIZ6.append(str2);
                sbLIZ6.append("unsync_stall_count");
                jSONObject.put(C2188811AlT.LIZIZ(sbLIZ6), CastIntegerProtector.parseInt(strArrSplit[5]));
                StringBuilder sbLIZ7 = C2188811AlT.LIZ();
                sbLIZ7.append(str2);
                sbLIZ7.append("unsync_aprev_count");
                jSONObject.put(C2188811AlT.LIZIZ(sbLIZ7), CastIntegerProtector.parseInt(strArrSplit[6]));
            }
        }
    }

    public final void LJII(int i, int i2, long j) {
        LinkedBlockingQueue<Long> linkedBlockingQueue;
        long jLongValue;
        int i3;
        JSONObject jSONObjectLJIIJJI;
        if (i < 0 || i2 <= 0 || j < 0 || (linkedBlockingQueue = this.s3) == null) {
            return;
        }
        int i4 = this.t3;
        if (i4 == -1) {
            this.t3 = i;
            this.u3 = j;
            return;
        }
        if (i == i4) {
            return;
        }
        if (linkedBlockingQueue.size() > 0) {
            jLongValue = this.s3.peek().longValue();
        } else {
            jLongValue = -1;
        }
        int i5 = 1;
        if (jLongValue > 0 && jLongValue <= this.u3) {
            boolean z = false;
            int i6 = 0;
            while (this.s3.size() > 0) {
                long jLongValue2 = this.s3.peek().longValue();
                long j2 = this.u3;
                if (jLongValue2 == j2) {
                    z = true;
                } else if (z && jLongValue2 > j2 && jLongValue2 <= j) {
                    i6++;
                    if (jLongValue2 == j) {
                        break;
                    }
                }
                this.s3.poll().longValue();
            }
            if (i - this.t3 == 1 && i6 > 0 && i6 != i2) {
                if (i6 < i2) {
                    i3 = 0;
                } else {
                    i3 = 1;
                }
                if (this.LLILZ != null && (jSONObjectLJIIJJI = LJIIJJI("stream_abnormal")) != null) {
                    try {
                        jSONObjectLJIIJJI.put("event_key", "stream_abnormal").put("stream_type", "video").put("type", i3).put("sent_frames", i2).put("received_frames", i6);
                        LJJJJIZL(jSONObjectLJIIJJI);
                    } catch (JSONException e) {
                        TryCatchGuardChecker.doCheck(e);
                    }
                }
            }
        }
        int i7 = this.t3;
        if (i - i7 != 1) {
            if (i > i7) {
                i5 = 0;
            }
            LJJLIIIJILLIZJL(i5, i, i7);
        }
        this.t3 = i;
        this.u3 = j;
    }

    public final JSONObject LJIIL(C1698490uIh c1698490uIh, boolean z, long j) throws JSONException {
        JSONObject jSONObjectLJIIJJI = LJIIJJI("first_frame");
        long jCurrentTimeMillis = c1698490uIh.LJIIZILJ;
        if (jCurrentTimeMillis <= 0) {
            jCurrentTimeMillis = System.currentTimeMillis();
        }
        long j2 = c1698490uIh.LIZ;
        if (jSONObjectLJIIJJI != null) {
            JSONObject jSONObjectPut = jSONObjectLJIIJJI.put("event_key", "first_frame").put("total_cost", jCurrentTimeMillis - j2).put("last_retry_end", 0L).put("hit_cache", z ? 1 : 0).put("start", j2).put("is_stream_received", this.LLLZLZ ? 1 : 0).put("code", this.LLZ).put("sdk_dns_analysis_end", c1698490uIh.LIZJ).put("prepare_block_end", c1698490uIh.LIZLLL);
            long j3 = c1698490uIh.LJJIFFI;
            if (j3 <= 0) {
                j3 = c1698490uIh.LJ;
            }
            jSONObjectPut.put("tfo_fall_back_time", j3).put("pre_connect", this.f463e0).put("request_cdn_cached", this.LLILLL.LJJIZ).put("request_time_to_source", this.LLILLL.LJJJ).put("request_time_for_cdn", this.LLILLL.LJJJI).put("http_req_finish_time", c1698490uIh.LJJIJLIJ).put("http_res_finish_time", c1698490uIh.LJJIL).put("first_video_package_end", c1698490uIh.LJIILIIL).put("first_audio_package_end", c1698490uIh.LJIILJJIL).put("first_video_frame_decode_end", c1698490uIh.LJIILL).put("first_audio_frame_decode_end", c1698490uIh.LJIILLIIL).put("first_frame_from_player_core", c1698490uIh.LJIJI).put("first_frame_render_end", c1698490uIh.LJIIZILJ).put("formater_created_time", c1698490uIh.LLLIIL).put("demuxer_begin_time", c1698490uIh.LLLIILIL).put("demuxer_created_time", c1698490uIh.LLLIL).put("decoder_create_time", c1698490uIh.LLLILZ).put("vdec_begin_time", c1698490uIh.LLLILZJ).put("vdec_created_time", c1698490uIh.LLLILZLLLI).put("outlet_created_time", c1698490uIh.LLLIZZ).put("video_param_send_outlet_time", c1698490uIh.LLII).put("first_video_frame_send_outlet_time", c1698490uIh.LLIIII).put("set_surface_time", this.f1).put("set_surface_cost", this.e1).put("video_render_type", c1698490uIh.LLIIIILZ).put("video_device_open_start", c1698490uIh.LJIJJLI).put("video_device_open_end", c1698490uIh.LJIL).put("audio_device_open_start", c1698490uIh.LJJ).put("audio_device_open_end", c1698490uIh.LJJI).put("video_device_wait_start", c1698490uIh.LLIIIZ).put("video_device_wait_end", c1698490uIh.LLIIJI).put("find_stream_info_start", c1698490uIh.LLIIIJ).put("find_stream_info_end", c1698490uIh.LLIIIL).put("video_first_pkt_pos", c1698490uIh.LJJII).put("video_first_pkt_pts", c1698490uIh.LJJIII).put("audio_first_pkt_pos", c1698490uIh.LJJIIJ).put("audio_first_pkt_pts", c1698490uIh.LJJIIJZLJL).put("first_render_audio_pts", c1698490uIh.LJJIJ).put("first_render_video_pts", c1698490uIh.LJJIJIIJI).put("audio_drop_first_pts", c1698490uIh.LJJIJIIJIL).put("audio_drop_last_pts", c1698490uIh.LJJIJIL).put("audio_drop_cnt", c1698490uIh.LJJIJL).put("video_buffer_time", this.LLILLL.LJLIIL).put("audio_buffer_time", this.LLILLL.LJLIL).put("download_speed", this.LLILLL.LJJZZI).put("stall_time", j).put("first_sei_delay", this.LLILLL.LJLLLL).put("response_header_X-Server-IP", this.LLILLL.LLIILII).put("response_header_Via", this.LLILLL.LLIILZL).put("prepare_end", c1698490uIh.LJIJJ).put("drop_audio_pts_diff", c1698490uIh.LJJIIZ).put("drop_audio_cost", c1698490uIh.LJJIIZI).put("enable_tcp_fast_open", 0).put("tfo_success", c1698490uIh.LLLF).put("optimize_backup_ips", new JSONArray()).put("suggest_format", this.l1).put("suggest_protocol", this.n1).put("suggest_access_code", this.s1).put("container_fps", this.i1).put("play_fps", this.LLILLL.LJLZ).put("real_time_fps", this.LLILLL.LJZ).put("play_fps_type", this.LLILLL.LJZI).put("used_drm", this.i5).put("drm_type", this.LLILZ.H0.toString()).put("ipv6_probe_result", -1).put("http_open_start", c1698490uIh.LJII).put("trans_open_start", c1698490uIh.LJIIIIZZ).put("socket_create_end", c1698490uIh.LJIIJ).put("3xx_happen_time", c1698490uIh.LJIIJJI).put("trans_strategy_params", this.o5).put("trans_params_bandwidth_decision", 0).put("is_free_flow", this.LLJZ).put("enable_fast_first_frame", this.x1).put("preplay_enter_room_timestamp", this.i6).put("pre_create_player_time", this.LLLJL).put("first_set_surface_time", this.LLLL).put("player_dns_analysis_start", c1698490uIh.LJIIIZ).put("first_frame_size_kbits", c1698490uIh.LLLZZIL).put("first_frame_download_speed_kbps", c1698490uIh.LLZ).put("media_type", this.q3);
            LIZJ(jSONObjectLJIIJJI);
            long j4 = this.i6;
            if (j4 != -1) {
                long j5 = c1698490uIh.LJIILL;
                if (j4 > j5) {
                    this.j6 = j4 - j5;
                }
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("preplay enter room at: ");
                sbLIZ.append(this.i6);
                sbLIZ.append(", wait cost: ");
                sbLIZ.append(this.j6);
                C2188811AlT.LIZIZ(sbLIZ);
                C1698940uJQ.LIZJ();
            }
            jSONObjectLJIIJJI.put("sdk_dns_analysis_end", this.LLJILJILJ);
            jSONObjectLJIIJJI.put("player_dns_analysis_end", c1698490uIh.LJ);
            jSONObjectLJIIJJI.put("player_open_input_start", c1698490uIh.LJFF);
            jSONObjectLJIIJJI.put("tcp_connect_end", c1698490uIh.LJI);
            jSONObjectLJIIJJI.put("tcp_first_package_end", c1698490uIh.LJIIL);
            int i = this.LLLLLZIL;
            if (i != -1) {
                jSONObjectLJIIJJI.put("audio_timescale_enable", i);
            }
            if (this.P1) {
                jSONObjectLJIIJJI.put("abr_startup_bitrate", c1698490uIh.LJLI);
                jSONObjectLJIIJJI.put("abr_request_url", c1698490uIh.LLLLIL);
            }
            if (this.f460X == 1) {
                jSONObjectLJIIJJI.put("tcp_first_package_total_response_time", C1476660oWu.LIZ.LIZLLL(this.LLILZ.Q0, 1300));
            }
            return jSONObjectLJIIJJI;
        }
        return null;
    }

    public final void LJJIJLIJ(int i, int i2, boolean z) {
        if (z) {
            this.C6++;
        } else {
            this.B6++;
        }
        this.E6 = i2;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("get current volume from ");
        sbLIZ.append(i);
        sbLIZ.append(" to");
        sbLIZ.append(i2);
        C2188811AlT.LIZIZ(sbLIZ);
        C1698940uJQ.LIZJ();
    }

    public final void LJJJIL(int i, long j, boolean z) {
        String str;
        if (j <= System.currentTimeMillis() - this.LLILLL.LIZ && j > i) {
            if (z) {
                this.T3++;
                this.U3 += j;
                if (this.LLJJJJ) {
                    this.b4++;
                    this.c4 += j;
                }
            } else {
                this.V3++;
                this.W3 += j;
                if (this.LLJJJJ) {
                    this.d4++;
                    this.e4 += j;
                }
            }
            this.O0.add(new C1915507er(z, j));
            try {
                VideoLiveManager videoLiveManager = this.LLILZ;
                if (videoLiveManager != null && videoLiveManager.LLZZ == 1) {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("PLAY-StallType", !z ? 1 : 0).put("PLAY-StallTime", j).put("event_key", "decode_stall");
                    if (C1474810oTv.LJLJLLL()) {
                        str = this.LLILZIL.LIZIZ;
                    } else {
                        str = this.LLLLZLLLI;
                    }
                    jSONObject.put("PLAY-SessionID", str);
                    if (!TextUtils.isEmpty(this.LLILZ.LLIIL)) {
                        jSONObject.put("live_unique_id", this.LLILZ.LLIIL);
                    }
                    LJIJJLI().businessEvent(62, jSONObject);
                    return;
                }
                return;
            } catch (JSONException e) {
                TryCatchGuardChecker.doCheck(e);
                return;
            }
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("abnormal decode stall time");
        sbLIZ.append(j);
        C2188811AlT.LIZIZ(sbLIZ);
        C1698940uJQ.LIZJ();
    }

    public final void LJJJJ(int i, long j, boolean z) {
        String str;
        if (j <= System.currentTimeMillis() - this.LLILLL.LIZ && j > i) {
            if (z) {
                this.X3++;
                this.Y3 += j;
                if (this.LLJJJJ) {
                    this.f4++;
                    this.g4 += j;
                }
            } else {
                this.Z3++;
                this.a4 += j;
                if (this.LLJJJJ) {
                    this.h4++;
                    this.i4 += j;
                }
            }
            this.N0.add(new C1915507er(z, j));
            try {
                VideoLiveManager videoLiveManager = this.LLILZ;
                if (videoLiveManager != null && videoLiveManager.LLZZ == 1) {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("PLAY-StallType", !z ? 1 : 0).put("PLAY-StallTime", j).put("event_key", "demux_stall");
                    if (C1474810oTv.LJLJLLL()) {
                        str = this.LLILZIL.LIZIZ;
                    } else {
                        str = this.LLLLZLLLI;
                    }
                    jSONObject.put("PLAY-SessionID", str);
                    if (!TextUtils.isEmpty(this.LLILZ.LLIIL)) {
                        jSONObject.put("live_unique_id", this.LLILZ.LLIIL);
                    }
                    LJIJJLI().businessEvent(62, jSONObject);
                    return;
                }
                return;
            } catch (JSONException e) {
                TryCatchGuardChecker.doCheck(e);
                return;
            }
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("abnormal demux stall time");
        sbLIZ.append(j);
        C2188811AlT.LIZIZ(sbLIZ);
        C1698940uJQ.LIZJ();
    }

    public final void LJJJLIIL(String str, JSONArray jSONArray, JSONObject jSONObject) {
        JSONObject jSONObjectLJIIJJI = LJIIJJI(str);
        if (jSONObjectLJIIJJI == null) {
            return;
        }
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            jSONObjectLJIIJJI.put(next, JSONObjectProtectorUtils.getLong(jSONObject, next));
        }
        try {
            jSONObjectLJIIJJI.put("event_key", str).put("push_retry_stall", jSONArray).put("sei_source", this.LLILLL.LLD);
            LJJJJIZL(jSONObjectLJIIJJI);
        } catch (JSONException e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    public final void LJJLIIIJILLIZJL(int i, int i2, int i3) {
        JSONObject jSONObjectLJIIJJI;
        if (this.LLILZ != null && (jSONObjectLJIIJJI = LJIIJJI("stream_abnormal")) != null) {
            try {
                jSONObjectLJIIJJI.put("event_key", "stream_abnormal").put("stream_type", "video").put("type", i).put("cur_index", i2).put("last_index", i3);
                LJJJJIZL(jSONObjectLJIIJJI);
            } catch (JSONException e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0038  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJLJLJ(int r10, long r11, boolean r13) {
        /*
            r9 = this;
            X.0uJO r2 = r9.V4
            if (r2 == 0) goto L37
            java.util.HashMap<java.lang.Integer, X.0uJT> r1 = r2.LIZ
            java.lang.Integer r0 = java.lang.Integer.valueOf(r10)
            boolean r0 = r1.containsKey(r0)
            if (r0 == 0) goto L37
            java.util.HashMap<java.lang.Integer, X.0uJT> r1 = r2.LIZ
            java.lang.Integer r0 = java.lang.Integer.valueOf(r10)
            java.lang.Object r8 = r1.get(r0)
            X.0uJT r8 = (X.C1698970uJT) r8
            if (r8 == 0) goto L37
            r4 = 0
            int r0 = (r11 > r4 ? 1 : (r11 == r4 ? 0 : -1))
            if (r0 <= 0) goto L38
            long r2 = r8.LIZIZ
            int r0 = (r11 > r2 ? 1 : (r11 == r2 ? 0 : -1))
            if (r0 <= 0) goto L38
            long r0 = r8.LIZ
            long r6 = r11 - r2
            long r0 = r0 + r6
            r8.LIZ = r0
            r8.LIZIZ = r11
        L33:
            if (r13 == 0) goto L37
            r8.LIZIZ = r4
        L37:
            return
        L38:
            r8.LIZIZ = r4
            goto L33
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.videoarch.liveplayer.log.LiveLoggerService.LJLJLJ(int, long, boolean):void");
    }

    public LiveLoggerService(VideoLiveManager videoLiveManager, InterfaceC1698710uJ3 interfaceC1698710uJ3, long j, Context context) {
        C1698770uJ9 c1698770uJ9;
        this.L = 10000L;
        this.Y0 = null;
        this.Z0 = null;
        this.a1 = null;
        this.A3 = null;
        this.z6 = null;
        this.LLILLJJLI = interfaceC1698710uJ3;
        this.LLILZ = videoLiveManager;
        if (videoLiveManager != null) {
            c1698770uJ9 = videoLiveManager.LJJIII;
        } else {
            c1698770uJ9 = new C1698770uJ9();
        }
        this.LLILZIL = c1698770uJ9;
        this.LLILLL = new C1698490uIh();
        this.f7 = new C1698550uIn(this, videoLiveManager);
        this.h7 = new C1698720uJ4();
        new NTPUDPClient().setDefaultTimeout(10000);
        this.L = j;
        this.A3 = new C1698490uIh();
        this.z6 = new C787360Uuc(context, this);
        this.Y0 = new ConcurrentLinkedDeque<>();
        this.Z0 = new ConcurrentLinkedDeque<>();
        this.a1 = new ConcurrentLinkedDeque<>();
    }

    public final void LJJJLL(int i, long j, boolean z, boolean z2) {
        String str;
        String str2;
        this.l5 = 1L;
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (j <= jCurrentTimeMillis - this.LLILLL.LIZ && j > i) {
            if (z) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("video render stall time ");
                sbLIZ.append(j);
                C2188811AlT.LIZIZ(sbLIZ);
                C1698940uJQ.LIZJ();
                this.p++;
                this.g++;
                this.q += j;
                this.h += j;
                long j2 = jCurrentTimeMillis - this.LLILLL.LJIIZILJ;
                if (this.B0.equals("none")) {
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append(j2);
                    sbLIZ2.append(":");
                    sbLIZ2.append(j);
                    this.B0 = C2188811AlT.LIZIZ(sbLIZ2);
                } else {
                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                    sbLIZ3.append(this.B0);
                    sbLIZ3.append(",");
                    sbLIZ3.append(j2);
                    sbLIZ3.append(":");
                    sbLIZ3.append(j);
                    this.B0 = C2188811AlT.LIZIZ(sbLIZ3);
                }
                if (this.LLJJJJ) {
                    this.LLZZJLIL++;
                    this.LLZZLLIL += j;
                    this.c++;
                    this.d += j;
                }
            } else {
                StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                sbLIZ4.append("audio render stall time ");
                sbLIZ4.append(j);
                C2188811AlT.LIZIZ(sbLIZ4);
                C1698940uJQ.LIZJ();
                this.r++;
                this.i++;
                this.s += j;
                this.j += j;
                long j3 = jCurrentTimeMillis - this.LLILLL.LJIIZILJ;
                if (this.A0.equals("none")) {
                    StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                    sbLIZ5.append(j3);
                    sbLIZ5.append(":");
                    sbLIZ5.append(j);
                    this.A0 = C2188811AlT.LIZIZ(sbLIZ5);
                } else {
                    StringBuilder sbLIZ6 = C2188811AlT.LIZ();
                    sbLIZ6.append(this.A0);
                    sbLIZ6.append(",");
                    sbLIZ6.append(j3);
                    sbLIZ6.append(":");
                    sbLIZ6.append(j);
                    this.A0 = C2188811AlT.LIZIZ(sbLIZ6);
                }
                if (this.LLJJJJ) {
                    this.LLZZZIL++;
                    this.LLZZZZ += j;
                    this.e++;
                    this.f += j;
                }
            }
            this.M0.add(new C1915507er(z, j));
            if (z2) {
                this.LLILZ.LLFZ(this.LLILLL, 4, false);
                JSONObject jSONObjectLJIIJJI = LJIIJJI("render_stall");
                if (jSONObjectLJIIJJI != null) {
                    try {
                        JSONObject jSONObjectPut = jSONObjectLJIIJJI.put("event_key", "render_stall");
                        if (z) {
                            str = "video";
                        } else {
                            str = "audio";
                        }
                        jSONObjectPut.put("type", str).put("stall_time", j).put("video_buffer_time", this.LLILLL.LJLIIL).put("audio_buffer_time", this.LLILLL.LJLIL);
                        LIZJ(jSONObjectLJIIJJI);
                        if (jCurrentTimeMillis - this.LLJI > 1000) {
                            int i2 = this.LLJILJIL;
                            if (i2 > 0) {
                                jSONObjectLJIIJJI.put("discard_last_1s", i2);
                                this.LLJILJIL = 0;
                            }
                            LJJJJIZL(jSONObjectLJIIJJI);
                            this.LLJI = jCurrentTimeMillis;
                        } else {
                            this.LLJILJIL++;
                        }
                        VideoLiveManager videoLiveManager = this.LLILZ;
                        if (videoLiveManager != null && videoLiveManager.LLZZ == 1) {
                            JSONObject jSONObject = new JSONObject();
                            JSONObject jSONObjectPut2 = jSONObject.put("PLAY-StallType", !z ? 1 : 0).put("PLAY-StallTime", j).put("event_key", "render_stall");
                            if (C1474810oTv.LJLJLLL()) {
                                str2 = this.LLILZIL.LIZIZ;
                            } else {
                                str2 = this.LLLLZLLLI;
                            }
                            jSONObjectPut2.put("PLAY-SessionID", str2);
                            if (!TextUtils.isEmpty(this.LLILZ.LLIIL)) {
                                jSONObject.put("live_unique_id", this.LLILZ.LLIIL);
                            }
                            LJIJJLI().businessEvent(62, jSONObject);
                            return;
                        }
                        return;
                    } catch (JSONException e) {
                        TryCatchGuardChecker.doCheck(e);
                        return;
                    }
                }
                return;
            }
            return;
        }
        StringBuilder sbLIZ7 = C2188811AlT.LIZ();
        sbLIZ7.append("abnormal render stall time");
        sbLIZ7.append(j);
        C2188811AlT.LIZIZ(sbLIZ7);
        C1698940uJQ.LIZJ();
    }

    public final void LJJLIIIJJI(int i, String str, String str2, String str3) {
        if (this.LLILZ == null) {
            return;
        }
        try {
            JSONObject jSONObjectLJIIJJI = LJIIJJI("switch_url");
            if (jSONObjectLJIIJJI == null) {
                return;
            }
            JSONObject jSONObjectPut = jSONObjectLJIIJJI.put("event_key", "switch_url");
            if (str == null) {
                str = "null";
            }
            JSONObject jSONObjectPut2 = jSONObjectPut.put("last_cdn_play_url", str);
            if (str2 == null) {
                str2 = "null";
            }
            jSONObjectPut2.put("next_cdn_play_url", str2).put("res_bitrate", this.L1).put("last_res", this.K1).put("code", i).put("reason", str3);
            LJJJJIZL(jSONObjectLJIIJJI);
        } catch (JSONException e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    public final void LJJLIIJ(boolean z, long j, long j2, long j3, long j4) {
        C1698490uIh c1698490uIh;
        long j5 = j4;
        long j6 = j;
        long j7 = j2;
        long j8 = j3;
        VideoLiveManager videoLiveManager = this.LLILZ;
        if (videoLiveManager != null && (c1698490uIh = this.LLILLL) != null) {
            if (j6 == 0) {
                try {
                    j6 = c1698490uIh.LJJJJ;
                } catch (JSONException e) {
                    TryCatchGuardChecker.doCheck(e);
                }
            }
            if (j7 == 0) {
                j7 = c1698490uIh.LJJJJI;
            }
            if (j8 == 0) {
                j8 = c1698490uIh.LJJLIIIJL;
            }
            if (j5 == 0) {
                j5 = c1698490uIh.LJJLL;
            }
            long j9 = c1698490uIh.LJJLJLI;
            if (!z) {
                videoLiveManager.LLFZ(c1698490uIh, 1, false);
            }
            JSONObject jSONObjectLJIILIIL = LJIILIIL(this.LLILLL, j6, j7, j8, j5, z, j9);
            if (this.LLLFZ != null && jSONObjectLJIILIIL != null) {
                jSONObjectLJIILIIL.put("is_low_latency", 0);
                this.LLLFZ.LJ(jSONObjectLJIILIIL);
            }
            LJJJJIZL(jSONObjectLJIILIIL);
            this.LLILLL.LJJJIL = System.currentTimeMillis();
            long j10 = this.LLILZLL;
            if (this.LLIZLLLIL) {
                C786410Ut5.LJLJJI(101, j10, this.LL);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0501  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x050f  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0519  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0558  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x059f  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x05ec  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x05f8  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x061c  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0634  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x063f  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0658  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x065e  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0660  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0669  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x066d  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0671  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0674  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0677  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x067d  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x0769  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x076c  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x07ca  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x0836  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x08b1  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x08be  */
    /* JADX WARN: Removed duplicated region for block: B:258:0x08e8  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x01c4  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0212  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x030c  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0315  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x03a9  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x03bb  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x03c7  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x044c  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0456  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x04f7  */
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
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final org.json.JSONObject LJIILIIL(X.C1698490uIh r46, long r47, long r49, long r51, long r53, boolean r55, long r56) throws org.json.JSONException {
        /*
            Method dump skipped, instruction units count: 2468
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.videoarch.liveplayer.log.LiveLoggerService.LJIILIIL(X.0uIh, long, long, long, long, boolean, long):org.json.JSONObject");
    }
}
