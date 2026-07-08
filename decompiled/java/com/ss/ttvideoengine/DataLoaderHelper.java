package com.ss.ttvideoengine;

import X.C0V1G;
import X.C0VOT;
import X.C0W0A;
import X.C0WPO;
import X.C0WPR;
import X.C1297600js6;
import X.C1308970kAR;
import X.C1309100kAe;
import X.C1309150kAj;
import X.C1309170kAl;
import X.C1468070oJ3;
import X.C1468180oJE;
import X.C1468590oJt;
import X.C1468600oJu;
import X.C1468790oKD;
import X.C1468800oKE;
import X.C1469080oKg;
import X.C1469160oKo;
import X.C1469310oL3;
import X.C1469320oL4;
import X.C1469750oLl;
import X.C1470200oMU;
import X.C1470240oMY;
import X.C1470430oMr;
import X.C1471140oO0;
import X.C1471160oO2;
import X.C1471170oO3;
import X.C1471180oO4;
import X.C1471290oOF;
import X.C1471300oOG;
import X.C1471420oOS;
import X.C1471550oOf;
import X.C1471660oOq;
import X.C1474520oTS;
import X.C1474810oTv;
import X.C1475070oUL;
import X.C1475130oUR;
import X.C1475160oUU;
import X.C1475200oUY;
import X.C1475410oUt;
import X.C1475430oUv;
import X.C1475450oUx;
import X.C1475460oUy;
import X.C1475470oUz;
import X.C1475490oV1;
import X.C1475500oV2;
import X.C1475600oVC;
import X.C1475770oVT;
import X.C1475790oVV;
import X.C1475880oVe;
import X.C1475910oVh;
import X.C1476090oVz;
import X.C1476100oW0;
import X.C1476110oW1;
import X.C1476120oW2;
import X.C1476130oW3;
import X.C1476140oW4;
import X.C1476150oW5;
import X.C1476160oW6;
import X.C1476170oW7;
import X.C1476180oW8;
import X.C1476190oW9;
import X.C1476210oWB;
import X.C1476260oWG;
import X.C1476290oWJ;
import X.C1476300oWK;
import X.C1476320oWM;
import X.C1476330oWN;
import X.C1476340oWO;
import X.C1476350oWP;
import X.C1476370oWR;
import X.C1476380oWS;
import X.C2085608Fa;
import X.C2187451AjH;
import X.C2188811AlT;
import X.C386801es;
import X.C786410Ut5;
import X.C787250UuR;
import X.C790010Uyt;
import X.C790030Uyv;
import X.C790040Uyw;
import X.C790190UzB;
import X.C790230UzF;
import X.C795730VJj;
import X.C805420Vie;
import X.EnumC1469040oKc;
import X.EnumC1469720oLi;
import X.EnumC1469940oM4;
import X.EnumC2281151EQn;
import X.InterfaceC1467050oHP;
import X.InterfaceC1470190oMT;
import X.InterfaceC1475610oVD;
import X.InterfaceC1475620oVE;
import X.InterfaceC790020Uyu;
import android.content.Context;
import android.text.TextUtils;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.android.livesdk.livesetting.subscription.LiveSubscriptionQuestionnaireHourFrequencySetting;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.vcloud.strategy.StrategyMediaInfo;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.ss.mediakit.medialoader.AVMDLDataLoader;
import com.ss.mediakit.medialoader.AVMDLDataLoaderConfigure;
import com.ss.mediakit.medialoader.AVMDLDataLoaderListener;
import com.ss.mediakit.medialoader.AVMDLDataLoaderNotifyInfo;
import com.ss.mediakit.medialoader.AVMDLStartCompleteListener;
import com.ss.mediakit.net.AVMDLDNSParser;
import com.ss.ttvideoengine.DataLoaderHelper;
import com.ss.ttvideoengine.fetcher.VideoInfoFetcher;
import com.ss.ttvideoengine.utils.TTVideoEngineLog;
import com.tts.oecverify.BdTuring;
import fyo.e;
import java.io.UnsupportedEncodingException;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes24.dex */
public class DataLoaderHelper implements AVMDLDataLoaderListener, AVMDLStartCompleteListener, C0V1G {
    public volatile int LIZIZ;
    public AVMDLDataLoaderConfigure LJIIIZ;
    public final C1468790oKD LJIIJJI;
    public final C1476170oW7 LIZ = new C1476170oW7();
    public final C1476330oWN LIZJ = new C1476160oW6() { // from class: X.0oWN
    };
    public final C1476330oWN LIZLLL = new C1476160oW6() { // from class: X.0oWN
    };
    public final C1476330oWN LJ = new C1476160oW6() { // from class: X.0oWN
    };
    public final C1476330oWN LJFF = new C1476160oW6() { // from class: X.0oWN
    };
    public final HashMap<String, ArrayList<WeakReference<InterfaceC1470190oMT>>> LJI = new HashMap<>();
    public final ReentrantLock LJII = new ReentrantLock();
    public AVMDLDataLoader LJIIIIZZ = null;
    public Context LJIIJ = null;
    public String LJIIL = null;
    public C1469750oLl LJIILIIL = null;
    public C0WPR LJIILJJIL = null;
    public int LJIILL = 0;
    public boolean LJIILLIIL = true;
    public long LJIIZILJ = -1;
    public long LJIJ = 0;
    public boolean LJIJI = false;
    public boolean LJIJJ = true;
    public int LJIJJLI = 0;
    public boolean LJIL = true;
    public int LJJI = 0;
    public int LJJIFFI = 0;
    public InterfaceC790020Uyu LJJII = null;
    public WeakReference<InterfaceC790020Uyu> LJJIII = null;
    public int LJJIIJ = -1;
    public int LJJIIJZLJL = 0;
    public boolean LJJIIZ = false;
    public int LJJIIZI = 0;
    public int LJJIJ = 1;
    public boolean LJJIJIIJI = true;
    public boolean LJJIJIIJIL = true;
    public int LJJIJIL = 0;
    public boolean LJJIJL = false;
    public C0W0A LJJIJLIJ = null;
    public int LJJIL = 0;
    public int LJJIZ = 0;
    public int LJJJ = 1;
    public int LJJJI = 0;
    public int LJJJIL = 0;
    public int LJJJJ = 0;
    public int LJJJJI = 0;
    public int LJJJJIZL = 0;
    public int LJJJJJ = 0;
    public boolean LJJJJJL = false;
    public final C1476180oW8 LJJJJL = new C1476180oW8();
    public int LJJJJLI = 0;
    public int LJJJJLL = 0;
    public int LJJJJZ = 0;
    public int LJJJJZI = 0;
    public int LJJJLIIL = 0;
    public int LJJJLL = 0;
    public final ArrayList<Integer> LJJJLZIJ = new ArrayList<>();
    public int LJJJZ = EnumC1469040oKc.None.ordinal();
    public int LJJL = EnumC1469720oLi.Default.ordinal();
    public volatile boolean LJJLI = false;
    public String LJJLIIIIJ = null;
    public final Map<String, C1476300oWK> LJJLIIIJ = new ConcurrentHashMap();
    public int LJJLIIIJILLIZJL = 0;
    public int LJJLIIIJJI = 0;
    public int LJJLIIIJJIZ = 0;
    public int LJJLIIIJL = 0;
    public int LJJLIIIJLJLI = 0;
    public boolean LJJLIIIJLLLLLLLZ = false;
    public final C1470200oMU LJJLIIJ = new Object() { // from class: X.0oMU
    };
    public final C1476130oW3 LJJLIL = new C1476130oW3();
    public final C1471170oO3 LJJLJ = new Object() { // from class: X.0oO3
    };
    public final C1476120oW2 LJJLJLI = new C1476120oW2();
    public final C1476350oWP LJJLL = new Object() { // from class: X.0oWP
    };
    public final C1476110oW1 LJJZ = new C1476110oW1();
    public final C1476090oVz LJJZZI = new C1476090oVz();
    public final C1469310oL3 LJJZZIII = new Object() { // from class: X.0oL3
    };
    public final C1469320oL4 LJL = new Object() { // from class: X.0oL4
    };
    public final C1476100oW0 LJLI = new C1476100oW0();
    public final C1475470oUz LJLIIIL = new C1475470oUz();
    public final C1475460oUy LJLIIL = new C1475460oUy();
    public final C1471160oO2 LJLIL = new Object() { // from class: X.0oO2
    };
    public final C1471140oO0 LJLILLLLZI = new C1471140oO0();
    public final C1471180oO4 LJLJI = new Object() { // from class: X.0oO4
    };
    public final C1475910oVh LJLJJI = new C1475910oVh();
    public final C1471420oOS LJLJJL = new Object() { // from class: X.0oOS
    };
    public final C1476140oW4 LJLJJLL = new C1476140oW4();
    public final C1476370oWR LJLJL = new Object() { // from class: X.0oWR
    };
    public final C1297600js6 LJJ = new C1297600js6(C790030Uyv.LIZ.LJIILJJIL);

    @Override // com.ss.mediakit.medialoader.AVMDLDataLoaderListener
    public final long getInt64Value(int i, long j) {
        return 0L;
    }

    public final boolean LJJIZ() {
        AVMDLDataLoaderConfigure aVMDLDataLoaderConfigure = this.LJIIIZ;
        if (aVMDLDataLoaderConfigure != null && !TextUtils.isEmpty(aVMDLDataLoaderConfigure.mPrecisePreloadConfigStr)) {
            try {
                if (JSONObjectProtectorUtils.getInt(new JSONObject(this.LJIIIZ.mPrecisePreloadConfigStr), "enable") > 0) {
                    return true;
                }
            } catch (JSONException e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        return false;
    }

    public final boolean LJJJ() {
        this.LJJ.LIZJ(0);
        try {
            boolean z = this.LIZIZ == 0;
            this.LJJ.LJFF(0);
            return z;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            this.LJJ.LJFF(0);
            throw th;
        }
    }

    public final void LJJJJZ() {
        Throwable targetException;
        if (C1474810oTv.LJJIFFI()) {
            this.LJLI.getClass();
            C1476100oW0.LIZIZ(this);
            return;
        }
        this.LJJ.LIZJ(2);
        try {
            if (this.LIZIZ == 0) {
                int i = C2187451AjH.LIZ;
                C1471660oOq.LIZIZ("DataLoaderHelper", "DataLoader has started not need start");
                this.LJJ.LJFF(2);
                if (C790030Uyv.LIZ.LJIILL > 0) {
                    this.LJJ.LJI(1);
                    return;
                }
                return;
            }
            this.LJJL = EnumC1469720oLi.Initializing.ordinal();
            if (!LJJIJL()) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("initMdlFail:");
                sbLIZ.append(AVMDLDataLoader.getLoadFailMsg());
                String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                this.LJJL = EnumC1469720oLi.InitializeError.ordinal();
                throw new Exception(strLIZIZ);
            }
            this.LIZLLL.LIZJ = 4L;
            this.LIZJ.LIZJ = 20L;
            if (this.LJIIIZ == null) {
                this.LJIIIZ = AVMDLDataLoaderConfigure.getDefaultonfigure();
            }
            JSONObject jSONObject = new JSONObject();
            try {
                if (!TextUtils.isEmpty(C1309170kAl.LIZJ)) {
                    jSONObject.put("app_channel", C1309170kAl.LIZJ);
                }
                if (!TextUtils.isEmpty(C1309170kAl.LIZIZ)) {
                    jSONObject.put("app_name", C1309170kAl.LIZIZ);
                }
                if (!TextUtils.isEmpty(C1309170kAl.LJIIIIZZ)) {
                    jSONObject.put("device_id_secret", C1309170kAl.LJIIIIZZ);
                }
                if (!TextUtils.isEmpty(C1309170kAl.LJ)) {
                    jSONObject.put("device_id", C1309170kAl.LJ);
                }
                if (!TextUtils.isEmpty(C1309170kAl.LIZLLL)) {
                    jSONObject.put("app_version", C1309170kAl.LIZLLL);
                }
                int i2 = C1309170kAl.LIZ;
                if (i2 >= 0) {
                    jSONObject.put("app_id", i2);
                }
                if (jSONObject.has("app_id")) {
                    this.LJIIIZ.mAppInfo = C786410Ut5.J3(jSONObject);
                }
            } catch (JSONException e) {
                TryCatchGuardChecker.doCheck(e);
                int i3 = C2187451AjH.LIZ;
                TTVideoEngineLog.d(e);
            }
            if (this.LJIILJJIL != null) {
                this.LJIIIZ.mEnableReportTaskLog = 1;
            }
            if (this.LJJIJIIJI) {
                this.LJIIIZ.mCloseLocalServer = 1;
            }
            this.LJIIIIZZ.setConfigure(this.LJIIIZ);
            if (this.LJIIIIZZ.start() < 0) {
                this.LJJL = EnumC1469720oLi.InitializeError.ordinal();
                this.LJJLIIIIJ = "start data loader fail";
                throw new Exception("start data loader fail");
            }
            int i4 = C2187451AjH.LIZ;
            C1471660oOq.LIZJ("DataLoaderHelper", "[preload] preload strategy " + this.LJJIL);
            if (this.LJJLIIIJJIZ < 2) {
                LJJJLZIJ(!this.LJJLIIIJLLLLLLLZ);
            }
            long longValue = this.LJIIIIZZ.getLongValue(7218);
            this.LJIIZILJ = longValue;
            if (longValue == -1) {
                this.LJIJJ = true;
            }
            if (this.LJJIJ == 1 && this.LJIL && longValue > 0) {
                try {
                    Class<?> clsLIZ = C1469080oKg.LIZ(200, "com.ss.ttm.player.TTPlayer");
                    Method declaredMethod = clsLIZ.getDeclaredMethod("registerNativeMdl", Long.TYPE);
                    declaredMethod.setAccessible(true);
                    if (((Integer) declaredMethod.invoke(clsLIZ, Long.valueOf(this.LJIIZILJ))).intValue() == 0) {
                        C1471660oOq.LIZJ("DataLoaderHelper", "firstNativeMDL effect");
                        this.LJIJI = true;
                        this.LJIJJ = false;
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    int i5 = C2187451AjH.LIZ;
                    C1471660oOq.LIZIZ("DataLoaderHelper", th.toString());
                    if ((th instanceof InvocationTargetException) && (targetException = th.getTargetException()) != null) {
                        C1471660oOq.LIZIZ("DataLoaderHelper", targetException.toString());
                    }
                }
            }
            this.LJJIJL = this.LJIIIIZZ.getLongValue(9407) == 1;
            C1471660oOq.LIZJ("DataLoaderHelper", "start: get mdlprotocolHandle: " + this.LJIIZILJ);
            this.LJIILIIL.LIZ(this.LJIIIIZZ, this.LJJI);
            this.LIZIZ = 0;
            if (this.LJJLI && this.LJJL == EnumC1469720oLi.Initializing.ordinal()) {
                this.LJJL = EnumC1469720oLi.InitializeComplete.ordinal();
            }
            this.LJJII = new InterfaceC790020Uyu() { // from class: X.0V1C
                @Override // X.InterfaceC790020Uyu
                public final void LIZ(int i6, int i7, int i8) {
                    if (i6 != 0) {
                        return;
                    }
                    int i9 = C2187451AjH.LIZ;
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("access changed, from: ");
                    sbLIZ2.append(i7);
                    sbLIZ2.append(" to: ");
                    sbLIZ2.append(i8);
                    TTVideoEngineLog.d("DataLoaderHelper", C2188811AlT.LIZIZ(sbLIZ2));
                    DataLoaderHelper dataLoaderHelper = this.LIZ;
                    dataLoaderHelper.LJJIIJ = i8;
                    dataLoaderHelper.LJJJJL(LSPassThroughRecordSizeConfig.DEFAULT, i7);
                    this.LIZ.LJJJJL(1104, i8);
                }
            };
            this.LJJIII = new WeakReference<>(this.LJJII);
            C790010Uyt.LJ().LJIIIIZZ(this.LJJIII);
            int longValue2 = (int) this.LJIIIIZZ.getLongValue(7433);
            this.LJIJ = C1470430oMr.LJIIL(longValue2);
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("KeyIsGetDemuxerVersion: ");
            sbLIZ2.append(longValue2);
            sbLIZ2.append(", handle: ");
            sbLIZ2.append(this.LJIJ);
            TTVideoEngineLog.d("DataLoaderHelper", C2188811AlT.LIZIZ(sbLIZ2));
            if (this.LJIJ != 0) {
                TTVideoEngineLog.d("DataLoaderHelper", "set KeyIsSetDemuxerHandle");
                this.LJIIIIZZ.setLongValue(7432, this.LJIJ);
            }
            TTVideoEngineLog.d("DataLoaderHelper", "DataLoader start.");
            this.LJJ.LJFF(2);
            if (C790030Uyv.LIZ.LJIILL > 0) {
                this.LJJ.LJI(1);
            }
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
            this.LJJ.LJFF(2);
            if (C790030Uyv.LIZ.LJIILL > 0) {
                this.LJJ.LJI(1);
            }
            throw th2;
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [X.0oWN] */
    /* JADX WARN: Type inference failed for: r0v15, types: [X.0oMU] */
    /* JADX WARN: Type inference failed for: r0v17, types: [X.0oO3] */
    /* JADX WARN: Type inference failed for: r0v19, types: [X.0oWP] */
    /* JADX WARN: Type inference failed for: r0v2, types: [X.0oWN] */
    /* JADX WARN: Type inference failed for: r0v22, types: [X.0oL3] */
    /* JADX WARN: Type inference failed for: r0v23, types: [X.0oL4] */
    /* JADX WARN: Type inference failed for: r0v27, types: [X.0oO2] */
    /* JADX WARN: Type inference failed for: r0v29, types: [X.0oO4] */
    /* JADX WARN: Type inference failed for: r0v3, types: [X.0oWN] */
    /* JADX WARN: Type inference failed for: r0v31, types: [X.0oOS] */
    /* JADX WARN: Type inference failed for: r0v33, types: [X.0oWR] */
    /* JADX WARN: Type inference failed for: r0v4, types: [X.0oWN] */
    public DataLoaderHelper() {
        this.LIZIZ = 1;
        this.LJIIIZ = null;
        this.LJIIJJI = null;
        this.LJIIJJI = C1468790oKD.LIZIZ();
        this.LIZIZ = 1;
        this.LJIIIZ = AVMDLDataLoaderConfigure.getDefaultonfigure();
    }

    public final String LJIIIIZZ() {
        if (C1474810oTv.LJJIFFI()) {
            getClass();
        }
        return null;
    }

    public final void LJIILJJIL() {
        String strLIZJ;
        String strLJFF;
        C1468800oKE c1468800oKELIZ;
        if (C1474810oTv.LJJIFFI()) {
            this.LJJLJLI.LIZIZ(this);
            return;
        }
        if (this.LJIIIIZZ == null) {
            int i = C2187451AjH.LIZ;
            C1471660oOq.LIZIZ("DataLoaderHelper", "[preload] need load mdl first.");
            return;
        }
        C1471550oOf c1471550oOfLIZ = LIZ();
        if (c1471550oOfLIZ != null && LIZLLL(c1471550oOfLIZ)) {
            LJFF();
            if (c1471550oOfLIZ.LIZIZ != null || c1471550oOfLIZ.LJIIJ != null) {
                LJII(c1471550oOfLIZ);
                return;
            }
            if (C1474810oTv.LJJIFFI()) {
                this.LJJLJLI.LIZJ(c1471550oOfLIZ, this);
                return;
            }
            if (c1471550oOfLIZ.LJI != null && ((CopyOnWriteArrayList) c1471550oOfLIZ.LJIILLIIL).size() == 1) {
                ListProtector.remove(c1471550oOfLIZ.LJIILLIIL, 0);
            }
            HashMap map = new HashMap();
            if (c1471550oOfLIZ.LJI != null) {
                throw null;
            }
            if (this.LIZ == null || !TextUtils.isEmpty(c1471550oOfLIZ.LJII)) {
                strLIZJ = null;
                strLJFF = null;
            } else {
                strLIZJ = this.LIZ.LIZJ(map, c1471550oOfLIZ.LIZ, c1471550oOfLIZ.LJ);
                strLJFF = this.LIZ.LJFF(c1471550oOfLIZ.LIZ, c1471550oOfLIZ.LJ);
                c1471550oOfLIZ.LJI.getClass();
                c1471550oOfLIZ.LJII = C790040Uyw.LIZ(strLIZJ);
            }
            C1468070oJ3.LIZ().getClass();
            String strLIZ = C790040Uyw.LIZ(strLIZJ);
            synchronized (C1476380oWS.class) {
                try {
                    c1468800oKELIZ = this.LJIIJJI.LIZ(c1471550oOfLIZ.LIZ, strLIZ);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
            if (c1468800oKELIZ != null && !c1468800oKELIZ.LIZJ) {
                c1471550oOfLIZ.LIZIZ = c1468800oKELIZ.LIZ;
                int i2 = C2187451AjH.LIZ;
                C1471660oOq.LIZJ("DataLoaderHelper", C786410Ut5.j4("[preload] get videoModel , videoId = %s", new Object[]{c1471550oOfLIZ.LIZ}));
                LJII(c1471550oOfLIZ);
                return;
            }
            if (c1471550oOfLIZ.LJI != null) {
                VideoInfoFetcher videoInfoFetcher = new VideoInfoFetcher(this.LJIIJ);
                c1471550oOfLIZ.LJFF = videoInfoFetcher;
                videoInfoFetcher.LJII = new C1471290oOF(c1471550oOfLIZ);
                VideoInfoFetcher videoInfoFetcher2 = c1471550oOfLIZ.LJFF;
                c1471550oOfLIZ.LJI.getClass();
                videoInfoFetcher2.LJIIIZ = null;
                VideoInfoFetcher videoInfoFetcher3 = c1471550oOfLIZ.LJFF;
                c1471550oOfLIZ.LJI.getClass();
                videoInfoFetcher3.LJIIL = null;
                c1471550oOfLIZ.LJFF.LJIIIZ(true);
                VideoInfoFetcher videoInfoFetcher4 = c1471550oOfLIZ.LJFF;
                c1471550oOfLIZ.LJI.getClass();
                c1471550oOfLIZ.LJI.getClass();
                c1471550oOfLIZ.LJI.getClass();
                videoInfoFetcher4.LJII(0, strLIZ, strLJFF, null);
            }
        }
    }

    public final void LJIJJLI() {
        if (C1474810oTv.LJJIFFI()) {
            this.LJLJJLL.getClass();
            if (this.LJIIIIZZ == null || this.LIZIZ != 0) {
                int i = C2187451AjH.LIZ;
                C1471660oOq.LIZIZ("DataLoaderHelper", "need start mdl first");
                return;
            }
            if (this.LJJJJ == 1) {
                C1469160oKo c1469160oKo = C790230UzF.LIZ;
                if (c1469160oKo.LJI()) {
                    c1469160oKo.LIZJ().businessEvent(31205, 1);
                }
            }
            this.LJJ.LIZJ(1);
            try {
                C1476140oW4.LIZIZ(this);
            } finally {
                try {
                } finally {
                }
            }
            this.LJJ.LJFF(1);
            return;
        }
        if (this.LJIIIIZZ == null || this.LIZIZ != 0) {
            int i2 = C2187451AjH.LIZ;
            C1471660oOq.LIZIZ("DataLoaderHelper", "need start mdl first");
            return;
        }
        if (this.LJJJJ == 1) {
            C1469160oKo c1469160oKo2 = C790230UzF.LIZ;
            if (c1469160oKo2.LJI()) {
                c1469160oKo2.LIZJ().businessEvent(31205, 1);
            }
        }
        this.LJJ.LIZJ(1);
        try {
            LJIL();
        } finally {
            try {
                TryCatchGuardChecker.doCheck(th);
                int i3 = C2187451AjH.LIZ;
                TTVideoEngineLog.d(th);
            } finally {
            }
        }
        this.LJJ.LJFF(1);
    }

    public final void LJIL() {
        if (C1474810oTv.LJJIFFI()) {
            this.LJLJJLL.getClass();
            C1476140oW4.LIZIZ(this);
            return;
        }
        ArrayList arrayList = new ArrayList();
        if (LIZJ() > 0) {
            while (true) {
                C1471550oOf c1471550oOfLJFF = LJFF();
                if (c1471550oOfLJFF == null) {
                    break;
                }
                if (c1471550oOfLJFF.LIZLLL >= 10000) {
                    arrayList.add(c1471550oOfLJFF);
                } else {
                    VideoInfoFetcher videoInfoFetcher = c1471550oOfLJFF.LJFF;
                    if (videoInfoFetcher != null) {
                        videoInfoFetcher.LJI();
                    }
                    LJIIJ(c1471550oOfLJFF);
                }
            }
            for (int i = 0; i < arrayList.size(); i++) {
                LIZLLL((C1471550oOf) ListProtector.get(arrayList, i));
            }
            arrayList.clear();
        }
        if (LIZJ() > 0) {
            while (true) {
                C1471550oOf c1471550oOfLJFF2 = LJFF();
                if (c1471550oOfLJFF2 == null) {
                    break;
                }
                if (c1471550oOfLJFF2.LIZLLL >= 10000) {
                    arrayList.add(c1471550oOfLJFF2);
                } else {
                    VideoInfoFetcher videoInfoFetcher2 = c1471550oOfLJFF2.LJFF;
                    if (videoInfoFetcher2 != null) {
                        videoInfoFetcher2.LJI();
                    }
                    LJIIJ(c1471550oOfLJFF2);
                }
            }
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                LIZLLL((C1471550oOf) ListProtector.get(arrayList, i2));
            }
            arrayList.clear();
        }
        if (LIZJ() > 0) {
            boolean z = false;
            while (true) {
                C1471550oOf c1471550oOfLJFF3 = LJFF();
                if (c1471550oOfLJFF3 == null) {
                    break;
                }
                if (c1471550oOfLJFF3.LIZLLL >= 10000) {
                    arrayList.add(c1471550oOfLJFF3);
                } else {
                    LJIIJ(c1471550oOfLJFF3);
                    z = true;
                }
            }
            if (z) {
                this.LJIIIIZZ.cancelAll();
            }
            for (int i3 = 0; i3 < arrayList.size(); i3++) {
                LIZLLL((C1471550oOf) ListProtector.get(arrayList, i3));
            }
            arrayList.clear();
        }
    }

    public final void LJJI() {
        if (C1474810oTv.LJJIFFI()) {
            getClass();
            this.LJJ.LIZJ(1);
            try {
                if (this.LJIIIIZZ != null) {
                    LJJI();
                }
            } finally {
                try {
                } finally {
                }
            }
            this.LJJ.LJFF(1);
            return;
        }
        this.LJJ.LIZJ(1);
        try {
            AVMDLDataLoader aVMDLDataLoader = this.LJIIIIZZ;
            if (aVMDLDataLoader == null) {
                this.LJJ.LJFF(1);
                return;
            }
            aVMDLDataLoader.clearNetinfoCache();
        } finally {
            try {
                TryCatchGuardChecker.doCheck(th);
            } finally {
            }
        }
        this.LJJ.LJFF(1);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00cf A[Catch: Exception -> 0x00e1, TryCatch #1 {Exception -> 0x00e1, blocks: (B:32:0x00b8, B:34:0x00cf, B:35:0x00d9), top: B:69:0x00b8 }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0103  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LJJIJL() {
        /*
            Method dump skipped, instruction units count: 382
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.ttvideoengine.DataLoaderHelper.LJJIJL():boolean");
    }

    public final void LJJJJIZL() {
        if (!C1474810oTv.LJJIFFI()) {
            if (this.LJIIIIZZ == null) {
                int i = C2187451AjH.LIZ;
                C1471660oOq.LIZIZ("DataLoaderHelper", "need start mdl first");
                return;
            } else {
                this.LJJ.LIZJ(1);
                this.LJIIIIZZ.resumePreConnect();
                this.LJJ.LJFF(1);
                return;
            }
        }
        getClass();
        if (this.LJIIIIZZ == null) {
            int i2 = C2187451AjH.LIZ;
            C1471660oOq.LIZIZ("DataLoaderHelper", "need start mdl first");
        } else {
            this.LJJ.LIZJ(1);
            this.LJIIIIZZ.resumePreConnect();
            this.LJJ.LJFF(1);
        }
    }

    public final void LJJJLIIL() {
        if (!C1474810oTv.LJJIFFI()) {
            if (this.LJIIIIZZ == null) {
                int i = C2187451AjH.LIZ;
                C1471660oOq.LIZIZ("DataLoaderHelper", "need start mdl first");
                return;
            } else {
                this.LJJ.LIZJ(1);
                this.LJIIIIZZ.suspendPreconnect();
                this.LJJ.LJFF(1);
                return;
            }
        }
        getClass();
        if (this.LJIIIIZZ == null) {
            int i2 = C2187451AjH.LIZ;
            C1471660oOq.LIZIZ("DataLoaderHelper", "need start mdl first");
        } else {
            this.LJJ.LIZJ(1);
            this.LJIIIIZZ.suspendPreconnect();
            this.LJJ.LJFF(1);
        }
    }

    @Override // com.ss.mediakit.medialoader.AVMDLStartCompleteListener
    public final void onStartComplete() {
        if (!C1474810oTv.LJJIFFI()) {
            this.LJJLI = true;
            if (this.LJJL == EnumC1469720oLi.Initializing.ordinal()) {
                this.LJJL = EnumC1469720oLi.InitializeComplete.ordinal();
            }
            int i = C2187451AjH.LIZ;
            TTVideoEngineLog.d("DataLoaderHelper", "MediaDataLoader start complete");
            C1309100kAe c1309100kAe = C1309150kAj.LIZ;
            c1309100kAe.LIZIZ();
            c1309100kAe.LJFF();
            int i2 = C790010Uyt.LJ().LIZ;
            this.LJJIIJ = i2;
            AVMDLDataLoader aVMDLDataLoader = this.LJIIIIZZ;
            if (aVMDLDataLoader != null) {
                aVMDLDataLoader.setIntValue(7219, i2);
                Map<String, C1476300oWK> map = this.LJJLIIIJ;
                if (map != null && !((ConcurrentHashMap) map).isEmpty()) {
                    for (Map.Entry entry : ((ConcurrentHashMap) this.LJJLIIIJ).entrySet()) {
                        int i3 = C2187451AjH.LIZ;
                        C1471660oOq.LIZJ("DataLoaderHelper", C786410Ut5.j4("update feed dns info delay, host:%s, ipList:%s, fetchTime:%d", new Object[]{((C1476300oWK) entry.getValue()).LIZ, ((C1476300oWK) entry.getValue()).LIZIZ, Long.valueOf(((C1476300oWK) entry.getValue()).LIZJ)}));
                        AVMDLDNSParser.updateFeedDNSInfo(((C1476300oWK) entry.getValue()).LIZ, ((C1476300oWK) entry.getValue()).LIZIZ, ((C1476300oWK) entry.getValue()).LIZJ);
                    }
                    int i4 = C2187451AjH.LIZ;
                    C1471660oOq.LIZJ("DataLoaderHelper", "clear all feed dns cache");
                    ((ConcurrentHashMap) this.LJJLIIIJ).clear();
                }
                if (this.LJJLIIIJJIZ >= 2) {
                    LJJJLZIJ(!this.LJJLIIIJLLLLLLLZ);
                }
                if (!C790230UzF.LIZ.LJI()) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("strategy center running failed, set mdl preload strategy back ");
                    sbLIZ.append(this.LJJIZ);
                    TTVideoEngineLog.d("DataLoaderHelper", C2188811AlT.LIZIZ(sbLIZ));
                    this.LJIIIIZZ.setIntValue(1030, this.LJJIZ);
                }
            }
            C1476170oW7 c1476170oW7 = this.LIZ;
            if (c1476170oW7 != null) {
                c1476170oW7.LJ(11, 0L, 0L, "mdl start complete");
            }
            this.LIZ.onStartComplete();
            return;
        }
        this.LJLI.getClass();
        this.LJJLI = true;
        if (this.LJJL == EnumC1469720oLi.Initializing.ordinal()) {
            this.LJJL = EnumC1469720oLi.InitializeComplete.ordinal();
        }
        int i5 = C2187451AjH.LIZ;
        TTVideoEngineLog.d("DataLoaderHelper", "MediaDataLoader start complete");
        C1309100kAe c1309100kAe2 = C1309150kAj.LIZ;
        c1309100kAe2.LIZIZ();
        c1309100kAe2.LJFF();
        int i6 = C790010Uyt.LJ().LIZ;
        this.LJJIIJ = i6;
        AVMDLDataLoader aVMDLDataLoader2 = this.LJIIIIZZ;
        if (aVMDLDataLoader2 != null) {
            aVMDLDataLoader2.setIntValue(7219, i6);
            Map<String, C1476300oWK> map2 = this.LJJLIIIJ;
            if (map2 != null && !((ConcurrentHashMap) map2).isEmpty()) {
                for (Map.Entry entry2 : ((ConcurrentHashMap) this.LJJLIIIJ).entrySet()) {
                    int i7 = C2187451AjH.LIZ;
                    C1471660oOq.LIZJ("DataLoaderHelper", C786410Ut5.j4("update feed dns info delay, host:%s, ipList:%s, fetchTime:%d", new Object[]{((C1476300oWK) entry2.getValue()).LIZ, ((C1476300oWK) entry2.getValue()).LIZIZ, Long.valueOf(((C1476300oWK) entry2.getValue()).LIZJ)}));
                    AVMDLDNSParser.updateFeedDNSInfo(((C1476300oWK) entry2.getValue()).LIZ, ((C1476300oWK) entry2.getValue()).LIZIZ, ((C1476300oWK) entry2.getValue()).LIZJ);
                }
                int i8 = C2187451AjH.LIZ;
                C1471660oOq.LIZJ("DataLoaderHelper", "clear all feed dns cache");
                ((ConcurrentHashMap) this.LJJLIIIJ).clear();
            }
            if (this.LJJLIIIJJIZ >= 2) {
                C1476100oW0.LIZJ(!this.LJJLIIIJLLLLLLLZ, this);
            }
            if (!C790230UzF.LIZ.LJI()) {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("strategy center running failed, set mdl preload strategy back ");
                sbLIZ2.append(this.LJJIZ);
                TTVideoEngineLog.d("DataLoaderHelper", C2188811AlT.LIZIZ(sbLIZ2));
                this.LJIIIIZZ.setIntValue(1030, this.LJJIZ);
            }
        }
        C1476170oW7 c1476170oW72 = this.LIZ;
        if (c1476170oW72 != null) {
            c1476170oW72.LJ(11, 0L, 0L, "mdl start complete");
        }
        this.LIZ.onStartComplete();
    }

    public static DataLoaderHelper LJJIIZI() {
        return C805420Vie.LIZ;
    }

    public static boolean LJIIIZ(C1475130oUR c1475130oUR) {
        InterfaceC1467050oHP interfaceC1467050oHP;
        if (c1475130oUR != null && c1475130oUR.LJJ == 1) {
            int i = C2187451AjH.LIZ;
            C1471660oOq.LIZJ("DataLoaderHelper", "[preload] live model, valid.");
            return true;
        }
        if (c1475130oUR != null && (interfaceC1467050oHP = c1475130oUR.LIZLLL) != null && c1475130oUR.LJ != null) {
            if (!TextUtils.isEmpty(interfaceC1467050oHP.LJJII(2))) {
                return true;
            }
            int i2 = C2187451AjH.LIZ;
            C1471660oOq.LIZIZ("DataLoaderHelper", "[preload] videoId invalid.");
            if (c1475130oUR.LIZJ != null) {
                C1475490oV1 c1475490oV1 = new C1475490oV1(3);
                c1475490oV1.LIZJ = new e("kTTVideoErrorDomainDataLoaderPreload", -100001);
                c1475130oUR.LIZJ.LIZ(c1475490oV1);
            }
            return false;
        }
        int i3 = C2187451AjH.LIZ;
        C1471660oOq.LIZIZ("DataLoaderHelper", "[preload] videoModel input invalid");
        if (c1475130oUR != null && c1475130oUR.LIZJ != null) {
            C1475490oV1 c1475490oV12 = new C1475490oV1(3);
            c1475490oV12.LIZJ = new e("kTTVideoErrorDomainDataLoaderPreload", -100001);
            c1475130oUR.LIZJ.LIZ(c1475490oV12);
        }
        return false;
    }

    public static void LJIIJ(C1471550oOf c1471550oOf) {
        if (c1471550oOf.LJIIJJI) {
            return;
        }
        c1471550oOf.LJIIJJI = true;
        if (c1471550oOf.LIZJ() != null) {
            c1471550oOf.LIZJ().LIZ(new C1475490oV1(5));
        }
    }

    public static C1475880oVe LJIIL(String str) {
        C1475880oVe c1475880oVe = null;
        if (str == null) {
            return null;
        }
        String[] strArrSplit = str.split(",");
        if (strArrSplit.length >= 4) {
            c1475880oVe = new C1475880oVe();
            if (!TextUtils.isEmpty(strArrSplit[0])) {
                c1475880oVe.LIZIZ = CastLongProtector.valueOf(strArrSplit[0]).longValue();
            }
            if (!TextUtils.isEmpty(strArrSplit[1])) {
                c1475880oVe.LIZ = CastLongProtector.valueOf(strArrSplit[1]).longValue();
            }
        }
        return c1475880oVe;
    }

    public static final String LJJII(String str) {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        int i = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("before encode:");
        sbLIZ.append(str);
        TTVideoEngineLog.d("TTHelperEncode", C2188811AlT.LIZIZ(sbLIZ));
        try {
            String strQueryComponentEncode = AVMDLDataLoader.queryComponentEncode(str);
            if (TextUtils.isEmpty(strQueryComponentEncode)) {
                TTVideoEngineLog.d("TTHelperEncode", "call native encode fail,try java");
                strQueryComponentEncode = URLEncoder.encode(str, "UTF-8");
            }
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("after encode:");
            sbLIZ2.append(strQueryComponentEncode);
            TTVideoEngineLog.d("TTHelperEncode", C2188811AlT.LIZIZ(sbLIZ2));
            return strQueryComponentEncode;
        } catch (UnsupportedEncodingException e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }

    @Override // X.C0V1G
    public final void LIZ(Object obj) {
        String strJ3 = "";
        if (C1474810oTv.LJJIFFI()) {
            getClass();
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("device_score", obj);
                strJ3 = C786410Ut5.J3(jSONObject);
            } catch (JSONException e) {
                TryCatchGuardChecker.doCheck(e);
                int i = C2187451AjH.LIZ;
                TTVideoEngineLog.d(e);
            }
            if (!TextUtils.isEmpty(strJ3)) {
                int i2 = C2187451AjH.LIZ;
                TTVideoEngineLog.d("DataLoaderHelper", "onPortraitChange enginePortait: " + strJ3);
                this.LJIIIIZZ.setStringValue(7446, strJ3);
                return;
            }
            return;
        }
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject2.put("device_score", obj);
            strJ3 = C786410Ut5.J3(jSONObject2);
        } catch (JSONException e2) {
            TryCatchGuardChecker.doCheck(e2);
            int i3 = C2187451AjH.LIZ;
            TTVideoEngineLog.d(e2);
        }
        if (!TextUtils.isEmpty(strJ3)) {
            int i4 = C2187451AjH.LIZ;
            TTVideoEngineLog.d("DataLoaderHelper", "onPortraitChange enginePortait: " + strJ3);
            this.LJIIIIZZ.setStringValue(7446, strJ3);
        }
    }

    public final void LIZJ(C1471550oOf c1471550oOf) {
        ArrayList<C1471550oOf> arrayListLJIIIZ = LJIIIZ();
        for (int i = 0; i < arrayListLJIIIZ.size(); i++) {
            C1476150oW5 c1476150oW5 = (C1476150oW5) ListProtector.get(arrayListLJIIIZ, i);
            if (!TextUtils.isEmpty(c1476150oW5.LIZ) && !TextUtils.isEmpty(c1471550oOf.LIZ) && c1476150oW5.LIZ.equals(c1471550oOf.LIZ)) {
                return;
            }
        }
        this.LJJ.LIZJ(0);
        C1476180oW8 c1476180oW8 = this.LJJJJL;
        String str = c1471550oOf.LIZ;
        c1476180oW8.LIZJ.lock();
        if (!c1476180oW8.LIZLLL.containsKey(str)) {
            if (c1476180oW8.LIZLLL.size() >= 2) {
                c1476180oW8.LIZLLL.clear();
            }
            c1476180oW8.LIZLLL.put(str, new C1476260oWG());
        }
        int i2 = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("key :");
        sbLIZ.append(str);
        sbLIZ.append(" cache end.");
        TTVideoEngineLog.d("PreloadUtil", C2188811AlT.LIZIZ(sbLIZ));
        C1476260oWG c1476260oWG = c1476180oW8.LIZLLL.get(str);
        if (c1476260oWG != null) {
            c1476260oWG.LIZLLL = true;
            if (!c1476260oWG.LJ) {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("cached video trigger preload ");
                sbLIZ2.append(str);
                sbLIZ2.append(" cache end ");
                TTVideoEngineLog.d("PreloadUtil", C2188811AlT.LIZIZ(sbLIZ2));
                DataLoaderHelper dataLoaderHelper = C805420Vie.LIZ;
                long j = c1476260oWG.LIZ;
                C1476170oW7 c1476170oW7 = dataLoaderHelper.LIZ;
                if (c1476170oW7 != null) {
                    c1476170oW7.LJ(9, 0L, j, "");
                }
                c1476260oWG.LJ = true;
            }
        } else {
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("key :");
            sbLIZ3.append(str);
            sbLIZ3.append(" play info null");
            TTVideoEngineLog.d("PreloadUtil", C2188811AlT.LIZIZ(sbLIZ3));
        }
        c1476180oW8.LIZJ.unlock();
        this.LJJ.LJFF(0);
        String str2 = c1471550oOf.LIZ;
        ArrayList arrayList = null;
        if (C1474810oTv.LJJIFFI()) {
            getClass();
            if (!TextUtils.isEmpty(str2)) {
                try {
                    this.LJII.lock();
                    ArrayList<WeakReference<InterfaceC1470190oMT>> arrayList2 = this.LJI.get(str2);
                    if (arrayList2 != null) {
                        arrayList = new ArrayList();
                        arrayList.addAll(arrayList2);
                        StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                        sbLIZ4.append("get engine ref,rawKey = ");
                        sbLIZ4.append(str2);
                        sbLIZ4.append(" engine ref count: ");
                        sbLIZ4.append(arrayList.size());
                        C1471660oOq.LIZJ("DataLoaderHelper", C2188811AlT.LIZIZ(sbLIZ4));
                    }
                    this.LJII.unlock();
                } finally {
                }
            } else {
                return;
            }
        } else if (!TextUtils.isEmpty(str2)) {
            try {
                this.LJII.lock();
                ArrayList<WeakReference<InterfaceC1470190oMT>> arrayList3 = this.LJI.get(str2);
                if (arrayList3 != null) {
                    arrayList = new ArrayList();
                    arrayList.addAll(arrayList3);
                    StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                    sbLIZ5.append("get engine ref,rawKey = ");
                    sbLIZ5.append(str2);
                    sbLIZ5.append(" engine ref count: ");
                    sbLIZ5.append(arrayList.size());
                    C1471660oOq.LIZJ("DataLoaderHelper", C2188811AlT.LIZIZ(sbLIZ5));
                }
                this.LJII.unlock();
            } finally {
            }
        } else {
            return;
        }
        if (arrayList == null || arrayList.size() == 0) {
            return;
        }
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            Reference reference = (Reference) ListProtector.get(arrayList, i3);
            if (reference.get() != null) {
                ((InterfaceC1470190oMT) reference.get()).LJI();
            }
        }
    }

    public final void LJFF(C1475130oUR c1475130oUR) {
        C1475450oUx c1475450oUx;
        if (C1474810oTv.LJJIFFI()) {
            this.LJLIIL.getClass();
            C1475460oUy.LIZ(c1475130oUR, this);
            return;
        }
        InterfaceC1475610oVD interfaceC1475610oVD = c1475130oUR.LJFF;
        C1475500oV2 c1475500oV2 = null;
        if (interfaceC1475610oVD != null) {
            c1475450oUx = new C1475450oUx(interfaceC1475610oVD);
        } else {
            c1475450oUx = null;
        }
        C1475200oUY c1475200oUY = c1475130oUR.LIZJ;
        if (c1475200oUY != null) {
            c1475500oV2 = new C1475500oV2(c1475200oUY);
        }
        C790230UzF.LIZ.LIZJ().addPriorityTask(c1475130oUR.LIZJ(), c1475450oUx, c1475500oV2);
    }

    /* JADX WARN: Removed duplicated region for block: B:117:0x02e7  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01fc  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0210  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x025b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJII(X.C1471550oOf r26) {
        /*
            Method dump skipped, instruction units count: 1172
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.ttvideoengine.DataLoaderHelper.LJII(X.0oOf):void");
    }

    public final boolean LJIILLIIL(String str) {
        if (C1474810oTv.LJJIFFI()) {
            getClass();
            if (!TextUtils.isEmpty(str)) {
                String lowerCase = str.toLowerCase();
                if (!lowerCase.startsWith("mdl://") && !lowerCase.startsWith("http://127.0.0.1") && !lowerCase.startsWith("http://localhost") && !lowerCase.startsWith("file://") && !lowerCase.startsWith("/") && !C1476290oWJ.LIZIZ(str) && ((this.LJJIJIL == 1 && this.LJJIJL) || !C1476290oWJ.LIZ(str))) {
                    return true;
                }
            }
            return false;
        }
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        String lowerCase2 = str.toLowerCase();
        if (lowerCase2.startsWith("mdl://") || lowerCase2.startsWith("http://127.0.0.1") || lowerCase2.startsWith("http://localhost") || lowerCase2.startsWith("file://") || lowerCase2.startsWith("/") || C1476290oWJ.LIZIZ(str)) {
            return false;
        }
        if ((this.LJJIJIL == 1 && this.LJJIJL) || !C1476290oWJ.LIZ(str)) {
            return true;
        }
        return false;
    }

    public final void LJIIZILJ(C1475600oVC c1475600oVC) {
        if (C1474810oTv.LJJIFFI()) {
            this.LJJLIL.getClass();
            C1476130oW3.LIZIZ(c1475600oVC, this);
            return;
        }
        this.LJJ.LIZJ(1);
        try {
            LIZIZ(c1475600oVC.LIZ, c1475600oVC.LIZJ, c1475600oVC.LJFF, null, c1475600oVC);
            this.LJJ.LJFF(1);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            this.LJJ.LJFF(1);
            throw th;
        }
    }

    public final void LJIJ(C1476190oW9 c1476190oW9) {
        EnumC2281151EQn enumC2281151EQn;
        EnumC2281151EQn enumC2281151EQn2;
        String strLIZ;
        String strLIZ2 = null;
        if (C1474810oTv.LJJIFFI()) {
            this.LJJLIL.getClass();
            C1470240oMY c1470240oMY = c1476190oW9.LIZ;
            if (c1470240oMY != null && (enumC2281151EQn2 = c1476190oW9.LIZIZ) != null) {
                C1468600oJu c1468600oJu = C1468590oJt.LIZ;
                C1474520oTS c1474520oTSLJIIIZ = c1470240oMY.LJIIIZ(enumC2281151EQn2, c1476190oW9.LJFF, true);
                if (c1474520oTSLJIIIZ != null) {
                    strLIZ = c1474520oTSLJIIIZ.LIZ(15);
                } else {
                    strLIZ = null;
                }
                if (TextUtils.isEmpty(strLIZ)) {
                    int i = C2187451AjH.LIZ;
                    C1471660oOq.LIZIZ("DataLoaderHelper", "[preload] key invalid.");
                    c1476190oW9.LIZ();
                    return;
                }
                String strLJJII = c1476190oW9.LIZ.LJJII(2);
                if (TextUtils.isEmpty(strLJJII)) {
                    int i2 = C2187451AjH.LIZ;
                    C1471660oOq.LIZIZ("DataLoaderHelper", "[preload] videoId invalid.");
                    c1476190oW9.LIZ();
                    return;
                } else {
                    this.LJJ.LIZJ(1);
                    try {
                        C1476130oW3.LIZ(strLIZ, strLJJII, c1476190oW9.LIZJ, c1476190oW9, null, this);
                        this.LJJ.LJFF(1);
                        return;
                    } finally {
                    }
                }
            }
            int i3 = C2187451AjH.LIZ;
            C1471660oOq.LIZIZ("DataLoaderHelper", "[preload] addTask videoModel input invalid");
            c1476190oW9.LIZ();
            return;
        }
        C1470240oMY c1470240oMY2 = c1476190oW9.LIZ;
        if (c1470240oMY2 != null && (enumC2281151EQn = c1476190oW9.LIZIZ) != null) {
            C1468600oJu c1468600oJu2 = C1468590oJt.LIZ;
            C1474520oTS c1474520oTSLJIIIZ2 = c1470240oMY2.LJIIIZ(enumC2281151EQn, c1476190oW9.LJFF, true);
            if (c1474520oTSLJIIIZ2 != null) {
                strLIZ2 = c1474520oTSLJIIIZ2.LIZ(15);
            }
            if (TextUtils.isEmpty(strLIZ2)) {
                int i4 = C2187451AjH.LIZ;
                C1471660oOq.LIZIZ("DataLoaderHelper", "[preload] key invalid.");
                c1476190oW9.LIZ();
                return;
            }
            String strLJJII2 = c1476190oW9.LIZ.LJJII(2);
            if (TextUtils.isEmpty(strLJJII2)) {
                int i5 = C2187451AjH.LIZ;
                C1471660oOq.LIZIZ("DataLoaderHelper", "[preload] videoId invalid.");
                c1476190oW9.LIZ();
                return;
            } else {
                this.LJJ.LIZJ(1);
                try {
                    LIZIZ(strLIZ2, strLJJII2, c1476190oW9.LIZJ, c1476190oW9, null);
                    this.LJJ.LJFF(1);
                    return;
                } finally {
                }
            }
        }
        int i6 = C2187451AjH.LIZ;
        C1471660oOq.LIZIZ("DataLoaderHelper", "[preload] addTask videoModel input invalid");
        c1476190oW9.LIZ();
    }

    public final C1475070oUL LJIJI(String str) {
        if (C1474810oTv.LJJIFFI()) {
            this.LJLJJI.getClass();
            C1475880oVe c1475880oVeLIZJ = C1475910oVh.LIZJ(str, this);
            if (c1475880oVeLIZJ == null) {
                return null;
            }
            C1475070oUL c1475070oUL = new C1475070oUL();
            c1475070oUL.LIZ = c1475880oVeLIZJ.LIZ;
            c1475070oUL.LIZIZ = c1475880oVeLIZJ.LIZIZ;
            return c1475070oUL;
        }
        C1475880oVe c1475880oVeLJJIIJZLJL = LJJIIJZLJL(str);
        if (c1475880oVeLJJIIJZLJL == null) {
            return null;
        }
        C1475070oUL c1475070oUL2 = new C1475070oUL();
        c1475070oUL2.LIZ = c1475880oVeLJJIIJZLJL.LIZ;
        c1475070oUL2.LIZIZ = c1475880oVeLJJIIJZLJL.LIZIZ;
        return c1475070oUL2;
    }

    public final void LJJ(String str) {
        if (C1474810oTv.LJJIFFI()) {
            this.LJLJJLL.getClass();
            C1476140oW4.LIZJ(str, this);
            return;
        }
        if (TextUtils.isEmpty(str)) {
            return;
        }
        if (this.LJIIIIZZ != null && this.LIZIZ == 0) {
            this.LJJ.LIZJ(1);
            try {
                C1471550oOf c1471550oOfLJI = LJI(str);
                if (c1471550oOfLJI != null) {
                    LJIIJ(c1471550oOfLJI);
                } else {
                    C1471550oOf c1471550oOfLJI2 = LJI(str);
                    if (c1471550oOfLJI2 != null) {
                        VideoInfoFetcher videoInfoFetcher = c1471550oOfLJI2.LJFF;
                        if (videoInfoFetcher != null) {
                            videoInfoFetcher.LJI();
                        }
                        LJIIJ(c1471550oOfLJI2);
                    } else {
                        C1471550oOf c1471550oOfLJI3 = LJI(str);
                        if (c1471550oOfLJI3 != null) {
                            this.LJIIIIZZ.cancel(str);
                            LJIIJ(c1471550oOfLJI3);
                        }
                    }
                }
                int i = C2187451AjH.LIZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("[preload] cancel preload task. key = ");
                sbLIZ.append(str);
                C1471660oOq.LIZJ("DataLoaderHelper", C2188811AlT.LIZIZ(sbLIZ));
            } finally {
                try {
                } catch (Throwable th) {
                }
            }
            this.LJJ.LJFF(1);
            return;
        }
        int i2 = C2187451AjH.LIZ;
        C1471660oOq.LIZIZ("DataLoaderHelper", "need start mdl first");
    }

    public final void LJJIII(String str) {
        if (C1474810oTv.LJJIFFI()) {
            this.LJLJJI.getClass();
            if (!TextUtils.isEmpty(str)) {
                this.LJJ.LIZJ(1);
                try {
                    if (this.LJIIIIZZ == null) {
                        int i = C2187451AjH.LIZ;
                        C1471660oOq.LIZIZ("DataLoaderHelper", "mInnerDataLoader == null");
                    } else {
                        int i2 = C2187451AjH.LIZ;
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append(" force remove mdl file. key ");
                        sbLIZ.append(str);
                        C1471660oOq.LIZJ("DataLoaderHelper", C2188811AlT.LIZIZ(sbLIZ));
                        this.LJIIIIZZ.forceRemoveFileCache(str);
                    }
                } finally {
                    try {
                    } finally {
                    }
                }
                this.LJJ.LJFF(1);
                return;
            }
            return;
        }
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.LJJ.LIZJ(1);
        try {
        } finally {
            try {
            } catch (Throwable th) {
            }
        }
        if (this.LJIIIIZZ == null) {
            int i3 = C2187451AjH.LIZ;
            C1471660oOq.LIZIZ("DataLoaderHelper", "mInnerDataLoader == null");
            this.LJJ.LJFF(1);
            return;
        }
        int i4 = C2187451AjH.LIZ;
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append(" force remove mdl file. key ");
        sbLIZ2.append(str);
        C1471660oOq.LIZJ("DataLoaderHelper", C2188811AlT.LIZIZ(sbLIZ2));
        this.LJIIIIZZ.forceRemoveFileCache(str);
        this.LJJ.LJFF(1);
    }

    public final long LJJIIJ(String str) {
        if (C1474810oTv.LJJIFFI()) {
            this.LJLJJI.getClass();
            return C1475910oVh.LJ(str, this);
        }
        return LJJIIZ(str);
    }

    public final C1475880oVe LJJIIJZLJL(String str) {
        if (C1474810oTv.LJJIFFI()) {
            this.LJLJJI.getClass();
            return C1475910oVh.LIZJ(str, this);
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        this.LJJ.LIZJ(1);
        try {
            if (this.LJIIIIZZ != null && this.LIZIZ == 0) {
                C1475880oVe c1475880oVeLJIIL = LJIIL(this.LJIIIIZZ.getStringCacheInfo(str));
                this.LJJ.LJFF(1);
                return c1475880oVeLJIIL;
            }
        } finally {
            try {
            } catch (Throwable th) {
            }
        }
        this.LJJ.LJFF(1);
        return null;
    }

    public final long LJJIIZ(String str) {
        if (C1474810oTv.LJJIFFI()) {
            this.LJLJJI.getClass();
            return C1475910oVh.LJ(str, this);
        }
        long j = 0;
        if (this.LIZIZ != 0) {
            return 0L;
        }
        this.LJJ.LIZJ(1);
        try {
            AVMDLDataLoader aVMDLDataLoader = this.LJIIIIZZ;
            if (aVMDLDataLoader != null) {
                long cacheSize = aVMDLDataLoader.getCacheSize(str);
                if (cacheSize > 0) {
                    j = cacheSize;
                }
            }
        } finally {
            try {
            } catch (Throwable th) {
            }
        }
        this.LJJ.LJFF(1);
        return j;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v2, types: [int] */
    /* JADX WARN: Type inference failed for: r7v25 */
    /* JADX WARN: Type inference failed for: r7v27, types: [int] */
    /* JADX WARN: Type inference failed for: r7v28 */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v50 */
    /* JADX WARN: Type inference failed for: r7v51 */
    /* JADX WARN: Type inference failed for: r7v52 */
    /* JADX WARN: Type inference failed for: r7v53 */
    /* JADX WARN: Type inference failed for: r7v54 */
    /* JADX WARN: Type inference failed for: r7v55 */
    /* JADX WARN: Type inference failed for: r7v56 */
    /* JADX WARN: Type inference failed for: r7v57 */
    /* JADX WARN: Type inference failed for: r7v58 */
    /* JADX WARN: Type inference failed for: r7v59 */
    /* JADX WARN: Type inference failed for: r7v60 */
    /* JADX WARN: Type inference failed for: r7v61 */
    /* JADX WARN: Type inference failed for: r7v62 */
    /* JADX WARN: Type inference failed for: r7v63 */
    /* JADX WARN: Type inference failed for: r7v64 */
    /* JADX WARN: Type inference failed for: r7v65 */
    /* JADX WARN: Type inference failed for: r7v66 */
    /* JADX WARN: Type inference failed for: r7v67 */
    /* JADX WARN: Type inference failed for: r7v68 */
    /* JADX WARN: Type inference failed for: r7v69 */
    /* JADX WARN: Type inference failed for: r7v70 */
    /* JADX WARN: Type inference failed for: r7v71 */
    /* JADX WARN: Type inference failed for: r7v72 */
    /* JADX WARN: Type inference failed for: r7v73 */
    /* JADX WARN: Type inference failed for: r7v74 */
    /* JADX WARN: Type inference failed for: r7v75 */
    /* JADX WARN: Type inference failed for: r7v76 */
    /* JADX WARN: Type inference failed for: r7v77 */
    /* JADX WARN: Type inference failed for: r7v78 */
    /* JADX WARN: Type inference failed for: r7v79 */
    /* JADX WARN: Type inference failed for: r7v80 */
    /* JADX WARN: Type inference failed for: r7v81 */
    /* JADX WARN: Type inference failed for: r7v82 */
    /* JADX WARN: Type inference failed for: r7v83 */
    /* JADX WARN: Type inference failed for: r7v84 */
    /* JADX WARN: Type inference failed for: r7v85 */
    /* JADX WARN: Type inference failed for: r7v86 */
    /* JADX WARN: Type inference failed for: r7v87 */
    /* JADX WARN: Type inference failed for: r7v88 */
    /* JADX WARN: Type inference failed for: r7v89 */
    /* JADX WARN: Type inference failed for: r7v90 */
    /* JADX WARN: Type inference failed for: r7v91 */
    /* JADX WARN: Type inference failed for: r7v92 */
    /* JADX WARN: Type inference failed for: r7v93 */
    /* JADX WARN: Type inference failed for: r7v94 */
    /* JADX WARN: Type inference failed for: r7v95 */
    public final int LJJIJ(int i) {
        ?? intValue = 0;
        ?? intValue2 = 0;
        if (C1474810oTv.LJJIFFI()) {
            getClass();
            this.LJJ.LIZJ(1);
            try {
                if (i != 7) {
                    if (i != 8) {
                        if (i != 100) {
                            if (i != 101) {
                                if (i != 114) {
                                    if (i != 115) {
                                        if (i != 9018) {
                                            if (i != 9019) {
                                                switch (i) {
                                                    case 1:
                                                        intValue2 = this.LJIIIZ.mMaxCacheSize;
                                                        break;
                                                    case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                                                        intValue2 = this.LJJIL;
                                                        break;
                                                    case 90:
                                                        intValue2 = this.LJIIIZ.mDNSMainType;
                                                        break;
                                                    case 103:
                                                        intValue2 = AVMDLDNSParser.getIntValue(4);
                                                        break;
                                                    case 105:
                                                        intValue2 = AVMDLDNSParser.getIntValue(6);
                                                        break;
                                                    case 1001:
                                                        intValue2 = this.LJIIIZ.mEnablePreconnect;
                                                        break;
                                                    case 1008:
                                                        intValue2 = this.LJJIIJ;
                                                        break;
                                                    case 1150:
                                                        intValue2 = this.LJIIIZ.mEnableIOManager;
                                                        break;
                                                    case 9009:
                                                        intValue2 = this.LJJIJL;
                                                        break;
                                                    case 9016:
                                                        intValue2 = this.LJJJJLL;
                                                        break;
                                                    case 9021:
                                                        intValue2 = this.LJJJJZ;
                                                        break;
                                                    default:
                                                        switch (i) {
                                                            case 13000:
                                                                intValue2 = this.LJJLIIIJJI;
                                                                break;
                                                            case 13001:
                                                                intValue2 = this.LJJLIIIJILLIZJL;
                                                                break;
                                                            case 13002:
                                                                intValue2 = this.LJJLIIIJJIZ;
                                                                break;
                                                            case 13003:
                                                                intValue2 = this.LJJLIIIJLJLI;
                                                                break;
                                                            default:
                                                                intValue2 = -1;
                                                                break;
                                                        }
                                                        break;
                                                }
                                            } else {
                                                intValue2 = this.LJJJLL;
                                            }
                                        } else {
                                            intValue2 = this.LJJJLIIL;
                                        }
                                    } else {
                                        intValue2 = this.LJJIIZI;
                                    }
                                }
                                this.LJJ.LJFF(1);
                                return intValue2;
                            }
                            intValue2 = this.LJIIIZ.mEnableSessionReuse;
                        } else {
                            intValue2 = this.LJIIIZ.mMaxTlsVersion;
                        }
                    } else {
                        intValue2 = this.LJIIIZ.mEnableSocketReuse;
                    }
                } else {
                    intValue2 = this.LJIIIZ.mEnableExternDNS;
                }
                this.LJJ.LJFF(1);
                return intValue2;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                this.LJJ.LJFF(1);
                throw th;
            }
        }
        this.LJJ.LIZJ(1);
        try {
            if (i != 7) {
                if (i != 8) {
                    if (i != 100) {
                        if (i != 101) {
                            if (i != 114) {
                                if (i != 115) {
                                    if (i != 9018) {
                                        if (i != 9019) {
                                            switch (i) {
                                                case 1:
                                                    intValue = this.LJIIIZ.mMaxCacheSize;
                                                    break;
                                                case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                                                    intValue = this.LJJIL;
                                                    break;
                                                case 90:
                                                    intValue = this.LJIIIZ.mDNSMainType;
                                                    break;
                                                case 103:
                                                    intValue = AVMDLDNSParser.getIntValue(4);
                                                    break;
                                                case 105:
                                                    intValue = AVMDLDNSParser.getIntValue(6);
                                                    break;
                                                case 1001:
                                                    intValue = this.LJIIIZ.mEnablePreconnect;
                                                    break;
                                                case 1008:
                                                    intValue = this.LJJIIJ;
                                                    break;
                                                case 1150:
                                                    intValue = this.LJIIIZ.mEnableIOManager;
                                                    break;
                                                case 9009:
                                                    intValue = this.LJJIJL;
                                                    break;
                                                case 9016:
                                                    intValue = this.LJJJJLL;
                                                    break;
                                                case 9021:
                                                    intValue = this.LJJJJZ;
                                                    break;
                                                default:
                                                    switch (i) {
                                                        case 13000:
                                                            intValue = this.LJJLIIIJJI;
                                                            break;
                                                        case 13001:
                                                            intValue = this.LJJLIIIJILLIZJL;
                                                            break;
                                                        case 13002:
                                                            intValue = this.LJJLIIIJJIZ;
                                                            break;
                                                        case 13003:
                                                            intValue = this.LJJLIIIJLJLI;
                                                            break;
                                                        default:
                                                            intValue = -1;
                                                            break;
                                                    }
                                                    break;
                                            }
                                        } else {
                                            intValue = this.LJJJLL;
                                        }
                                    } else {
                                        intValue = this.LJJJLIIL;
                                    }
                                } else {
                                    intValue = this.LJJIIZI;
                                }
                            }
                            this.LJJ.LJFF(1);
                            return intValue;
                        }
                        intValue = this.LJIIIZ.mEnableSessionReuse;
                    } else {
                        intValue = this.LJIIIZ.mMaxTlsVersion;
                    }
                } else {
                    intValue = this.LJIIIZ.mEnableSocketReuse;
                }
            } else {
                intValue = this.LJIIIZ.mEnableExternDNS;
            }
            this.LJJ.LJFF(1);
            return intValue;
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
            this.LJJ.LJFF(1);
            throw th2;
        }
    }

    public final long LJJIJIIJI(int i) {
        long j;
        long j2 = -1;
        if (C1474810oTv.LJJIFFI()) {
            getClass();
            this.LJJ.LIZJ(1);
            try {
                if (i != 1003) {
                    if (i != 1152) {
                        if (i == 1153) {
                            j2 = this.LJIIIZ.mMonitorMinAllowLoadSize;
                        }
                        this.LJJ.LJFF(1);
                        return j2;
                    }
                    j2 = this.LJIIIZ.mMonitorTimeInternal;
                } else if (this.LJIL) {
                    j2 = this.LJIIZILJ;
                }
                this.LJJ.LJFF(1);
                return j2;
            } finally {
            }
        }
        this.LJJ.LIZJ(1);
        try {
            if (i != 1003) {
                if (i != 1152) {
                    if (i != 1153) {
                        this.LJJ.LJFF(1);
                        return -1L;
                    }
                    j = this.LJIIIZ.mMonitorMinAllowLoadSize;
                } else {
                    j = this.LJIIIZ.mMonitorTimeInternal;
                }
                this.LJJ.LJFF(1);
                return j;
            }
            if (this.LJIL) {
                j2 = this.LJIIZILJ;
            }
            this.LJJ.LJFF(1);
            return j2;
        } finally {
        }
    }

    public final String LJJIJIIJIL(long j) {
        if (C1474810oTv.LJJIFFI()) {
            getClass();
            int i = (int) j;
            if (i == 0) {
                return "default";
            }
            if (i == 1) {
                return "cellular";
            }
            if (i != 2) {
                return null;
            }
            return "wifi";
        }
        int i2 = (int) j;
        if (i2 == 0) {
            return "default";
        }
        if (i2 == 1) {
            return "cellular";
        }
        if (i2 != 2) {
            return null;
        }
        return "wifi";
    }

    public final String LJJIJIL(int i) {
        String str;
        AVMDLDataLoader aVMDLDataLoader;
        AVMDLDataLoader aVMDLDataLoader2;
        String str2 = null;
        if (C1474810oTv.LJJIFFI()) {
            getClass();
            this.LJJ.LIZJ(1);
            try {
                try {
                    if (i != 0) {
                        if (i != 6) {
                            if (i != 1509) {
                                if (i == 9010) {
                                    str2 = this.LJIIIZ.mSocketTraingCenterConfigStr;
                                }
                            } else {
                                str2 = this.LJIIIZ.mCustomUA;
                            }
                        } else {
                            if (this.LJIIL == null && (aVMDLDataLoader2 = this.LJIIIIZZ) != null) {
                                this.LJIIL = aVMDLDataLoader2.getStringValue(11);
                            }
                            str2 = this.LJIIL;
                        }
                    } else {
                        str2 = this.LJIIIZ.mCacheDir;
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    this.LJJ.LJFF(1);
                    throw th;
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                int i2 = C2187451AjH.LIZ;
                TTVideoEngineLog.d(e);
            }
            this.LJJ.LJFF(1);
            return str2;
        }
        this.LJJ.LIZJ(1);
        try {
            try {
            } catch (Exception e2) {
                TryCatchGuardChecker.doCheck(e2);
                int i3 = C2187451AjH.LIZ;
                TTVideoEngineLog.d(e2);
            }
            if (i != 0) {
                if (i != 6) {
                    if (i != 1509) {
                        if (i == 9010) {
                            str = this.LJIIIZ.mSocketTraingCenterConfigStr;
                        }
                        this.LJJ.LJFF(1);
                        return null;
                    }
                    str = this.LJIIIZ.mCustomUA;
                } else {
                    if (this.LJIIL == null && (aVMDLDataLoader = this.LJIIIIZZ) != null) {
                        this.LJIIL = aVMDLDataLoader.getStringValue(11);
                    }
                    str = this.LJIIL;
                }
            } else {
                str = this.LJIIIZ.mCacheDir;
            }
            this.LJJ.LJFF(1);
            return str;
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
            this.LJJ.LJFF(1);
            throw th2;
        }
    }

    public final synchronized void LJJJJJL(C0WPO c0wpo) {
        this.LJIILJJIL = c0wpo;
    }

    public final void LJJJJLL(String[] strArr) {
        if (C1474810oTv.LJJIFFI()) {
            this.LJLJJI.getClass();
            int i = C2187451AjH.LIZ;
            TTVideoEngineLog.d("DataLoaderHelper", "set protect dirs avoid clear when use clear interface");
            this.LJJ.LIZJ(2);
            try {
                this.LJIIIZ.setProtectCacheDirs(strArr);
                this.LJJ.LJFF(2);
                return;
            } finally {
            }
        }
        int i2 = C2187451AjH.LIZ;
        TTVideoEngineLog.d("DataLoaderHelper", "set protect dirs avoid clear when use clear interface");
        this.LJJ.LIZJ(2);
        try {
            this.LJIIIZ.setProtectCacheDirs(strArr);
            this.LJJ.LJFF(2);
        } finally {
        }
    }

    public final boolean LJJJJZI(String str) {
        boolean z = false;
        if (C1474810oTv.LJJIFFI()) {
            getClass();
            if (this.LIZIZ == 0) {
                this.LJJ.LIZJ(1);
                try {
                    if (this.LJIIIIZZ != null && !TextUtils.isEmpty(str)) {
                        this.LJIIIIZZ.downloadResource(str);
                        int i = C2187451AjH.LIZ;
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("[downloader] start download resource = ");
                        sbLIZ.append(str);
                        C1471660oOq.LIZJ("DataLoaderHelper", C2188811AlT.LIZIZ(sbLIZ));
                        z = true;
                    }
                } catch (Throwable th) {
                    try {
                        TryCatchGuardChecker.doCheck(th);
                        int i2 = C2187451AjH.LIZ;
                        TTVideoEngineLog.d(th);
                    } catch (Throwable th2) {
                        TryCatchGuardChecker.doCheck(th2);
                    }
                }
                this.LJJ.LJFF(1);
            }
            return z;
        }
        if (this.LIZIZ != 0) {
            return false;
        }
        this.LJJ.LIZJ(1);
        try {
            if (this.LJIIIIZZ != null && !TextUtils.isEmpty(str)) {
                this.LJIIIIZZ.downloadResource(str);
                int i3 = C2187451AjH.LIZ;
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("[downloader] start download resource = ");
                sbLIZ2.append(str);
                C1471660oOq.LIZJ("DataLoaderHelper", C2188811AlT.LIZIZ(sbLIZ2));
                z = true;
            }
        } catch (Throwable th3) {
            try {
                TryCatchGuardChecker.doCheck(th3);
                int i4 = C2187451AjH.LIZ;
                TTVideoEngineLog.d(th3);
            } catch (Throwable th4) {
                TryCatchGuardChecker.doCheck(th4);
            }
        }
        this.LJJ.LJFF(1);
        return z;
    }

    public final long LJJJLL(String str) {
        long j = 0;
        if (C1474810oTv.LJJIFFI()) {
            this.LJLJJI.getClass();
            if (this.LIZIZ != 0) {
                return 0L;
            }
            this.LJJ.LIZJ(1);
            try {
                AVMDLDataLoader aVMDLDataLoader = this.LJIIIIZZ;
                if (aVMDLDataLoader != null) {
                    long jTryQuickGetCacheSize = aVMDLDataLoader.tryQuickGetCacheSize(str);
                    if (jTryQuickGetCacheSize > 0) {
                        j = jTryQuickGetCacheSize;
                    }
                }
            } finally {
                try {
                } finally {
                }
            }
            this.LJJ.LJFF(1);
            return j;
        }
        if (this.LIZIZ != 0) {
            return 0L;
        }
        this.LJJ.LIZJ(1);
        try {
            AVMDLDataLoader aVMDLDataLoader2 = this.LJIIIIZZ;
            if (aVMDLDataLoader2 != null) {
                long jTryQuickGetCacheSize2 = aVMDLDataLoader2.tryQuickGetCacheSize(str);
                if (jTryQuickGetCacheSize2 > 0) {
                    j = jTryQuickGetCacheSize2;
                }
            }
        } finally {
            try {
                TryCatchGuardChecker.doCheck(th);
            } finally {
            }
        }
        this.LJJ.LJFF(1);
        return j;
    }

    public final void LJJJLZIJ(boolean z) {
        if (C1474810oTv.LJJIFFI()) {
            this.LJLI.getClass();
            C1476100oW0.LIZJ(z, this);
            return;
        }
        if (!z) {
            int i = C2187451AjH.LIZ;
            TTVideoEngineLog.d("DataLoaderHelper", "tryStartStrategyCenter not to load, outer to control load");
            return;
        }
        if (this.LJIIIZ.mEnableIOManager != 0 && this.LJJLIIIJJI == 0) {
            long longValue = this.LJIIIIZZ.getLongValue(7390);
            long longValue2 = this.LJIIIIZZ.getLongValue(7402);
            if (longValue != 0 && longValue != -1 && longValue != -998 && longValue2 >= 0) {
                this.LJJIJLIJ = new C0W0A();
                C1469160oKo c1469160oKo = C790230UzF.LIZ;
                c1469160oKo.LJIILLIIL.lock();
                try {
                    c1469160oKo.LJII = longValue;
                    c1469160oKo.LJIIIIZZ = longValue2;
                    c1469160oKo.LJIILLIIL.unlock();
                    c1469160oKo.LJIIIZ = this.LJIIJ;
                    c1469160oKo.LJIILJJIL();
                    int i2 = C2187451AjH.LIZ;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("after start strategy center running=");
                    sbLIZ.append(c1469160oKo.LJI());
                    TTVideoEngineLog.d("DataLoaderHelper", C2188811AlT.LIZIZ(sbLIZ));
                    c1469160oKo.LIZIZ(C1309170kAl.LIZ(), null);
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("config strategy center session_id=");
                    sbLIZ2.append(C1468180oJE.LJJZZIII);
                    sbLIZ2.append("cache_dir=");
                    sbLIZ2.append(this.LJIIIZ.mCacheDir);
                    TTVideoEngineLog.d("DataLoaderHelper", C2188811AlT.LIZIZ(sbLIZ2));
                    c1469160oKo.LIZJ().setStringValue(31211, C1468180oJE.LJJZZIII);
                    c1469160oKo.LIZJ().setStringValue(31209, this.LJIIIZ.mCacheDir);
                    if (this.LJIIIIZZ.isRunning()) {
                        if (!c1469160oKo.LJI()) {
                            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                            sbLIZ3.append("strategy center start failed, set mdl preload strategy back ");
                            sbLIZ3.append(this.LJJIZ);
                            TTVideoEngineLog.d("DataLoaderHelper", C2188811AlT.LIZIZ(sbLIZ3));
                            this.LJIIIIZZ.setIntValue(1030, this.LJJIZ);
                            return;
                        }
                        this.LJIIIIZZ.setIntValue(1030, this.LJJIL);
                        return;
                    }
                    return;
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    c1469160oKo.LJIILLIIL.unlock();
                    throw th;
                }
            }
            int i3 = C2187451AjH.LIZ;
            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
            sbLIZ4.append("tryStartStrategyCenter iomanagerHandle or iomanagerVersion is not validiomanagerHandle=");
            sbLIZ4.append(longValue);
            sbLIZ4.append(" iomanagerVersion=");
            sbLIZ4.append(longValue2);
            TTVideoEngineLog.d("DataLoaderHelper", C2188811AlT.LIZIZ(sbLIZ4));
        }
    }

    @Override // com.ss.mediakit.medialoader.AVMDLDataLoaderListener
    public final String getCheckSumInfo(String str) {
        String checkSumInfo = null;
        try {
            if (this.LIZ != null && !TextUtils.isEmpty(str)) {
                checkSumInfo = this.LIZ.getCheckSumInfo(str);
                return checkSumInfo;
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            int i = C2187451AjH.LIZ;
            TTVideoEngineLog.d(e);
        }
        return checkSumInfo;
    }

    @Override // com.ss.mediakit.medialoader.AVMDLDataLoaderListener
    public final void onNotify(AVMDLDataLoaderNotifyInfo aVMDLDataLoaderNotifyInfo) {
        String str;
        C1471550oOf c1471550oOfLJ;
        String str2;
        String str3;
        String str4;
        int i;
        long j;
        int i2;
        int i3;
        String str5;
        boolean z;
        C1471550oOf c1471550oOfLJ2;
        C1476330oWN c1476330oWN;
        String str6;
        int i4;
        String str7;
        JSONObject jSONObject;
        JSONObject jSONObject2;
        if (C1474810oTv.LJJIFFI()) {
            this.LJJZ.getClass();
            C1476110oW1.LIZ(aVMDLDataLoaderNotifyInfo, this);
            return;
        }
        if (aVMDLDataLoaderNotifyInfo == null) {
            return;
        }
        JSONObject jSONObject3 = aVMDLDataLoaderNotifyInfo.jsonLog;
        if (jSONObject3 != null) {
            try {
                if (!jSONObject3.has("app_session_id")) {
                    aVMDLDataLoaderNotifyInfo.jsonLog.put("app_session_id", C1468180oJE.LJJZZIII);
                }
            } catch (JSONException e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        int i5 = aVMDLDataLoaderNotifyInfo.what;
        if (i5 != 8) {
            if (i5 != 24) {
                if (i5 != 50) {
                    if (i5 != 70) {
                        if (i5 != 700) {
                            if (i5 != 10) {
                                if (i5 != 11) {
                                    if (i5 != 702 && i5 != 703) {
                                        if (i5 != 901) {
                                            if (i5 != 902) {
                                                switch (i5) {
                                                    case 0:
                                                        C0WPR c0wpr = this.LJIILJJIL;
                                                        if (c0wpr != null) {
                                                            ((C0WPO) c0wpr).LIZIZ(aVMDLDataLoaderNotifyInfo.logType, aVMDLDataLoaderNotifyInfo.jsonLog);
                                                            return;
                                                        }
                                                        C1476170oW7 c1476170oW7 = this.LIZ;
                                                        if (c1476170oW7 == null) {
                                                            return;
                                                        }
                                                        c1476170oW7.LJI(0, aVMDLDataLoaderNotifyInfo.logType, aVMDLDataLoaderNotifyInfo.jsonLog);
                                                        return;
                                                    case 1:
                                                        C0WPR c0wpr2 = this.LJIILJJIL;
                                                        if (c0wpr2 != null) {
                                                            ((C0WPO) c0wpr2).LIZIZ(aVMDLDataLoaderNotifyInfo.logType, aVMDLDataLoaderNotifyInfo.jsonLog);
                                                            return;
                                                        }
                                                        C1476170oW7 c1476170oW72 = this.LIZ;
                                                        if (c1476170oW72 == null) {
                                                            return;
                                                        }
                                                        c1476170oW72.LJI(1, aVMDLDataLoaderNotifyInfo.logType, aVMDLDataLoaderNotifyInfo.jsonLog);
                                                        return;
                                                    case 2:
                                                        C790230UzF.LIZ.LJIILIIL();
                                                        C1476170oW7 c1476170oW73 = this.LIZ;
                                                        if (c1476170oW73 == null) {
                                                            return;
                                                        }
                                                        c1476170oW73.LJ(2, aVMDLDataLoaderNotifyInfo.code, aVMDLDataLoaderNotifyInfo.parameter, aVMDLDataLoaderNotifyInfo.logInfo);
                                                        return;
                                                    case 3:
                                                    case 4:
                                                        int i6 = C2187451AjH.LIZ;
                                                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                                                        sbLIZ.append("KeyIsFileCacheProgress log = ");
                                                        sbLIZ.append(aVMDLDataLoaderNotifyInfo.logInfo);
                                                        sbLIZ.append(", task type = ");
                                                        sbLIZ.append(aVMDLDataLoaderNotifyInfo.parameter);
                                                        sbLIZ.append(" code = ");
                                                        sbLIZ.append((int) aVMDLDataLoaderNotifyInfo.code);
                                                        TTVideoEngineLog.d("DataLoaderHelper", C2188811AlT.LIZIZ(sbLIZ));
                                                        String str8 = aVMDLDataLoaderNotifyInfo.logInfo;
                                                        if (str8 == null) {
                                                            return;
                                                        }
                                                        long j2 = aVMDLDataLoaderNotifyInfo.parameter;
                                                        if (j2 == 3) {
                                                            C0VOT.LJIIIIZZ.getClass();
                                                            TextUtils.isEmpty(str8);
                                                            return;
                                                        }
                                                        if (j2 == 2) {
                                                            z = true;
                                                        } else {
                                                            z = false;
                                                        }
                                                        if (TextUtils.isEmpty(str8)) {
                                                            return;
                                                        }
                                                        String[] strArrSplit = aVMDLDataLoaderNotifyInfo.logInfo.split(",");
                                                        if (strArrSplit.length < 3) {
                                                            return;
                                                        }
                                                        try {
                                                            long jLongValue = CastLongProtector.valueOf(strArrSplit[0]).longValue();
                                                            long jLongValue2 = CastLongProtector.valueOf(strArrSplit[1]).longValue();
                                                            if (jLongValue2 <= 0 && aVMDLDataLoaderNotifyInfo.what != 4) {
                                                                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                                                                sbLIZ2.append("[preload] mediaSize <= 0 return ");
                                                                sbLIZ2.append(aVMDLDataLoaderNotifyInfo.logInfo);
                                                                C1471660oOq.LIZJ("DataLoaderHelper", C2188811AlT.LIZIZ(sbLIZ2));
                                                                return;
                                                            }
                                                            String str9 = strArrSplit[2];
                                                            String str10 = "";
                                                            if (strArrSplit.length >= 4) {
                                                                str10 = strArrSplit[3];
                                                            }
                                                            if (z) {
                                                                c1471550oOfLJ2 = LJ(str9);
                                                                if (c1471550oOfLJ2 == null) {
                                                                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                                                                    sbLIZ3.append("[preload] preload temItem == null return ");
                                                                    sbLIZ3.append(aVMDLDataLoaderNotifyInfo.logInfo);
                                                                    C1471660oOq.LIZJ("DataLoaderHelper", C2188811AlT.LIZIZ(sbLIZ3));
                                                                    int i7 = aVMDLDataLoaderNotifyInfo.what;
                                                                    if (i7 == 4) {
                                                                        C1475430oUv c1475430oUv = new C1475430oUv();
                                                                        c1475430oUv.LJ = jLongValue;
                                                                        c1475430oUv.LIZLLL = jLongValue2;
                                                                        c1475430oUv.LIZ = str9;
                                                                        c1475430oUv.LJIIIIZZ = 2;
                                                                        c1475430oUv.LIZJ = str10;
                                                                        C1476170oW7 c1476170oW74 = this.LIZ;
                                                                        if (c1476170oW74 == null) {
                                                                            return;
                                                                        }
                                                                        c1476170oW74.LJIIIIZZ(c1475430oUv);
                                                                        StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                                                                        sbLIZ4.append(" task progress. cache end. key = ");
                                                                        sbLIZ4.append(str9);
                                                                        C1471660oOq.LIZJ("DataLoaderHelper", C2188811AlT.LIZIZ(sbLIZ4));
                                                                        return;
                                                                    }
                                                                    if (this.LJJJJZI != 1 || i7 != 3) {
                                                                        return;
                                                                    }
                                                                    C1475790oVV c1475790oVV = new C1475790oVV();
                                                                    c1475790oVV.LIZ = 2;
                                                                    C1471550oOf c1471550oOf = new C1471550oOf();
                                                                    c1471550oOf.LIZIZ(str9);
                                                                    C1476320oWM c1476320oWMLIZLLL = c1471550oOf.LIZLLL(str9);
                                                                    if (c1476320oWMLIZLLL == null) {
                                                                        return;
                                                                    }
                                                                    c1476320oWMLIZLLL.LJIIJJI = jLongValue;
                                                                    c1476320oWMLIZLLL.LJIIIZ = jLongValue;
                                                                    c1476320oWMLIZLLL.LJIIJ = jLongValue2;
                                                                    c1476320oWMLIZLLL.LJIIL = str10;
                                                                    c1476320oWMLIZLLL.LIZ = str9;
                                                                    c1475790oVV.LJ(c1471550oOf);
                                                                    C1476170oW7 c1476170oW75 = this.LIZ;
                                                                    if (c1476170oW75 == null) {
                                                                        return;
                                                                    }
                                                                    c1476170oW75.LIZIZ(c1475790oVV);
                                                                    return;
                                                                }
                                                                c1476330oWN = this.LJ;
                                                            } else {
                                                                c1471550oOfLJ2 = LJ(str9);
                                                                if (c1471550oOfLJ2 == null) {
                                                                    StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                                                                    sbLIZ5.append("[preload] play temItem == null return ");
                                                                    sbLIZ5.append(aVMDLDataLoaderNotifyInfo.logInfo);
                                                                    C1471660oOq.LIZJ("DataLoaderHelper", C2188811AlT.LIZIZ(sbLIZ5));
                                                                    return;
                                                                }
                                                                c1476330oWN = this.LJFF;
                                                            }
                                                            C1476320oWM c1476320oWMLIZLLL2 = c1471550oOfLJ2.LIZLLL(str9);
                                                            if (c1476320oWMLIZLLL2 != null) {
                                                                c1476320oWMLIZLLL2.LJIIJ = jLongValue2;
                                                                c1476320oWMLIZLLL2.LJIIJJI = jLongValue;
                                                                c1476320oWMLIZLLL2.LJIIL = str10;
                                                            }
                                                            if (TextUtils.isEmpty(c1471550oOfLJ2.LIZ)) {
                                                                str6 = str9;
                                                            } else {
                                                                str6 = c1471550oOfLJ2.LIZ;
                                                            }
                                                            C1476210oWB c1476210oWB = C1476340oWO.LIZ;
                                                            C1475790oVV c1475790oVVLIZ = c1476210oWB.LIZ(str6);
                                                            if (c1475790oVVLIZ == null) {
                                                                c1475790oVVLIZ = new C1475790oVV();
                                                            }
                                                            if (z) {
                                                                i4 = 2;
                                                            } else {
                                                                i4 = 1;
                                                            }
                                                            c1475790oVVLIZ.LIZ = i4;
                                                            c1475790oVVLIZ.LJ(c1471550oOfLJ2);
                                                            if (jLongValue2 == jLongValue && c1476320oWMLIZLLL2 != null && c1476320oWMLIZLLL2.LJ != null) {
                                                                StringBuilder sbLIZ6 = C2188811AlT.LIZ();
                                                                sbLIZ6.append("[preload] ");
                                                                if (c1476320oWMLIZLLL2.LJ.LJFF() == 1) {
                                                                    str7 = "Audio";
                                                                } else {
                                                                    str7 = "Video";
                                                                }
                                                                sbLIZ6.append(str7);
                                                                sbLIZ6.append(" cache complete key: ");
                                                                sbLIZ6.append(str9);
                                                                C1471660oOq.LIZJ("DataLoaderHelper", C2188811AlT.LIZIZ(sbLIZ6));
                                                            }
                                                            C1476170oW7 c1476170oW76 = this.LIZ;
                                                            if (c1476170oW76 != null) {
                                                                c1476170oW76.LIZIZ(c1475790oVVLIZ);
                                                            }
                                                            c1476210oWB.LIZIZ(str6, c1475790oVVLIZ);
                                                            if (!c1475790oVVLIZ.LIZJ() && ((!z || !c1475790oVVLIZ.LIZLLL()) && aVMDLDataLoaderNotifyInfo.what != 4)) {
                                                                return;
                                                            }
                                                            c1476330oWN.LJI(str9);
                                                            c1476210oWB.LIZJ(str6);
                                                            if (!z) {
                                                                StringBuilder sbLIZ7 = C2188811AlT.LIZ();
                                                                sbLIZ7.append("[preload] notify vid cache end key: ");
                                                                sbLIZ7.append(str6);
                                                                C1471660oOq.LIZJ("DataLoaderHelper", C2188811AlT.LIZIZ(sbLIZ7));
                                                                LIZJ(c1471550oOfLJ2);
                                                            }
                                                            C1475430oUv c1475430oUv2 = new C1475430oUv();
                                                            c1475430oUv2.LJ = jLongValue;
                                                            c1475430oUv2.LIZLLL = jLongValue2;
                                                            c1475430oUv2.LIZ = str9;
                                                            c1475430oUv2.LIZJ = str10;
                                                            c1475430oUv2.LJFF = c1476320oWMLIZLLL2.LIZJ;
                                                            c1475430oUv2.LJI = c1476320oWMLIZLLL2.LIZLLL;
                                                            c1475430oUv2.LJII = c1476320oWMLIZLLL2.LJ;
                                                            c1475430oUv2.LIZIZ = c1471550oOfLJ2.LIZ;
                                                            c1475430oUv2.LJIIIIZZ = c1475790oVVLIZ.LIZ;
                                                            if (c1471550oOfLJ2.LIZJ() != null && z) {
                                                                C1475490oV1 c1475490oV1 = new C1475490oV1(2);
                                                                c1475490oV1.LIZIZ = c1475430oUv2;
                                                                c1471550oOfLJ2.LIZJ().LIZ(c1475490oV1);
                                                                StringBuilder sbLIZ8 = C2188811AlT.LIZ();
                                                                sbLIZ8.append("[preload] notify end cache size = ");
                                                                sbLIZ8.append(c1475790oVVLIZ.LIZIZ());
                                                                C1471660oOq.LIZJ("DataLoaderHelper", C2188811AlT.LIZIZ(sbLIZ8));
                                                            }
                                                            C1476170oW7 c1476170oW77 = this.LIZ;
                                                            if (c1476170oW77 == null) {
                                                                return;
                                                            }
                                                            c1476170oW77.LJIIIIZZ(c1475430oUv2);
                                                            StringBuilder sbLIZ9 = C2188811AlT.LIZ();
                                                            sbLIZ9.append(" task progress. cache end. key = ");
                                                            sbLIZ9.append(str9);
                                                            sbLIZ9.append(", rawKey = ");
                                                            sbLIZ9.append(str6);
                                                            C1471660oOq.LIZJ("DataLoaderHelper", C2188811AlT.LIZIZ(sbLIZ9));
                                                            return;
                                                        } catch (Exception e2) {
                                                            TryCatchGuardChecker.doCheck(e2);
                                                            int i8 = C2187451AjH.LIZ;
                                                            TTVideoEngineLog.d(e2);
                                                            return;
                                                        }
                                                    case 5:
                                                        C1476170oW7 c1476170oW78 = this.LIZ;
                                                        if (c1476170oW78 == null) {
                                                            return;
                                                        }
                                                        c1476170oW78.LJ(20, aVMDLDataLoaderNotifyInfo.code, aVMDLDataLoaderNotifyInfo.parameter, aVMDLDataLoaderNotifyInfo.logInfo);
                                                        return;
                                                    case 6:
                                                        try {
                                                            JSONObject jSONObjectLIZ = C2085608Fa.LIZ(aVMDLDataLoaderNotifyInfo.jsonLog);
                                                            if (jSONObjectLIZ == null) {
                                                                return;
                                                            }
                                                            C1476170oW7 c1476170oW79 = this.LIZ;
                                                            if (c1476170oW79 != null) {
                                                                c1476170oW79.LIZLLL(jSONObjectLIZ);
                                                            }
                                                            int i9 = C2187451AjH.LIZ;
                                                            StringBuilder sbLIZ10 = C2188811AlT.LIZ();
                                                            sbLIZ10.append("receive log:");
                                                            sbLIZ10.append(jSONObjectLIZ);
                                                            TTVideoEngineLog.d("avmdlcdnlog", C2188811AlT.LIZIZ(sbLIZ10));
                                                            return;
                                                        } catch (Exception e3) {
                                                            TryCatchGuardChecker.doCheck(e3);
                                                            return;
                                                        }
                                                    default:
                                                        switch (i5) {
                                                            case BdTuring.TYPE_SMS_VOICE /* 13 */:
                                                                C1476170oW7 c1476170oW710 = this.LIZ;
                                                                if (c1476170oW710 == null || (jSONObject2 = aVMDLDataLoaderNotifyInfo.jsonLog) == null) {
                                                                    return;
                                                                }
                                                                c1476170oW710.LJI(0, aVMDLDataLoaderNotifyInfo.logType, jSONObject2);
                                                                return;
                                                            case 14:
                                                                int i10 = C2187451AjH.LIZ;
                                                                StringBuilder sbLIZ11 = C2188811AlT.LIZ();
                                                                sbLIZ11.append("MDL Alog: ");
                                                                sbLIZ11.append(aVMDLDataLoaderNotifyInfo.logInfo);
                                                                C1471660oOq.LIZJ("DataLoaderHelper", C2188811AlT.LIZIZ(sbLIZ11));
                                                                return;
                                                            case 15:
                                                                C0WPR c0wpr3 = this.LJIILJJIL;
                                                                if (c0wpr3 != null) {
                                                                    ((C0WPO) c0wpr3).LIZIZ(aVMDLDataLoaderNotifyInfo.logType, aVMDLDataLoaderNotifyInfo.jsonLog);
                                                                    return;
                                                                }
                                                                C1476170oW7 c1476170oW711 = this.LIZ;
                                                                if (c1476170oW711 == null || (jSONObject = aVMDLDataLoaderNotifyInfo.jsonLog) == null) {
                                                                    return;
                                                                }
                                                                c1476170oW711.LIZ(aVMDLDataLoaderNotifyInfo.logType, jSONObject);
                                                                return;
                                                            case 16:
                                                                C1476170oW7 c1476170oW712 = this.LIZ;
                                                                if (c1476170oW712 == null) {
                                                                    return;
                                                                }
                                                                c1476170oW712.LJI(0, aVMDLDataLoaderNotifyInfo.logType, aVMDLDataLoaderNotifyInfo.jsonLog);
                                                                return;
                                                            default:
                                                                switch (i5) {
                                                                    case 19:
                                                                        C0WPR c0wpr4 = this.LJIILJJIL;
                                                                        if (c0wpr4 != null) {
                                                                            ((C0WPO) c0wpr4).LIZIZ(aVMDLDataLoaderNotifyInfo.logType, aVMDLDataLoaderNotifyInfo.jsonLog);
                                                                            return;
                                                                        }
                                                                        C1476170oW7 c1476170oW713 = this.LIZ;
                                                                        if (c1476170oW713 == null) {
                                                                            return;
                                                                        }
                                                                        c1476170oW713.LJI(7, aVMDLDataLoaderNotifyInfo.logType, aVMDLDataLoaderNotifyInfo.jsonLog);
                                                                        return;
                                                                    case LiveToolbarIconStyleSetting.HIGHLIGHT_WITH_TEXT /* 20 */:
                                                                        break;
                                                                    case 21:
                                                                        String str11 = aVMDLDataLoaderNotifyInfo.logInfo;
                                                                        if (str11 == null) {
                                                                            return;
                                                                        }
                                                                        C0VOT.LJIIIIZZ.getClass();
                                                                        TextUtils.isEmpty(str11);
                                                                        return;
                                                                    case 22:
                                                                        String str12 = aVMDLDataLoaderNotifyInfo.logInfo;
                                                                        if (str12 == null) {
                                                                            return;
                                                                        }
                                                                        C0VOT.LJIIIIZZ.getClass();
                                                                        TextUtils.isEmpty(str12);
                                                                        return;
                                                                    default:
                                                                        switch (i5) {
                                                                            case LSPassThroughRecordSizeConfig.DEFAULT /* 1000 */:
                                                                            case 1001:
                                                                            case 1002:
                                                                            case 1003:
                                                                            case 1005:
                                                                                C0WPR c0wpr5 = this.LJIILJJIL;
                                                                                if (c0wpr5 != null) {
                                                                                    ((C0WPO) c0wpr5).LIZIZ(aVMDLDataLoaderNotifyInfo.logType, aVMDLDataLoaderNotifyInfo.jsonLog);
                                                                                    return;
                                                                                }
                                                                                C1476170oW7 c1476170oW714 = this.LIZ;
                                                                                if (c1476170oW714 == null) {
                                                                                    return;
                                                                                }
                                                                                c1476170oW714.LJI(10, aVMDLDataLoaderNotifyInfo.logType, aVMDLDataLoaderNotifyInfo.jsonLog);
                                                                                return;
                                                                            case 1004:
                                                                                C0WPR c0wpr6 = this.LJIILJJIL;
                                                                                if (c0wpr6 == null) {
                                                                                    return;
                                                                                }
                                                                                ((C0WPO) c0wpr6).LIZJ("videoplayer_mdl_sample", aVMDLDataLoaderNotifyInfo.jsonLog);
                                                                                return;
                                                                            default:
                                                                                int i11 = C2187451AjH.LIZ;
                                                                                StringBuilder sbLIZ12 = C2188811AlT.LIZ();
                                                                                sbLIZ12.append("NOT DEAL notify info what =  ");
                                                                                sbLIZ12.append(aVMDLDataLoaderNotifyInfo.what);
                                                                                TTVideoEngineLog.d("DataLoaderHelper", C2188811AlT.LIZIZ(sbLIZ12));
                                                                                return;
                                                                        }
                                                                }
                                                                break;
                                                        }
                                                        break;
                                                }
                                            } else {
                                                int i12 = C2187451AjH.LIZ;
                                                StringBuilder sbLIZ13 = C2188811AlT.LIZ();
                                                sbLIZ13.append("KeyIsFileDeleteSizeByUsedTime size: ");
                                                sbLIZ13.append(aVMDLDataLoaderNotifyInfo.code);
                                                TTVideoEngineLog.d("DataLoaderHelper", C2188811AlT.LIZIZ(sbLIZ13));
                                                C1476170oW7 c1476170oW715 = this.LIZ;
                                                if (c1476170oW715 == null) {
                                                    return;
                                                }
                                                c1476170oW715.LJ(31, 0L, aVMDLDataLoaderNotifyInfo.code, null);
                                                return;
                                            }
                                        } else {
                                            int i13 = C2187451AjH.LIZ;
                                            TTVideoEngineLog.d("multinetwork", C786410Ut5.j4("target network:%d current network:%d", new Object[]{Long.valueOf(aVMDLDataLoaderNotifyInfo.parameter), Long.valueOf(aVMDLDataLoaderNotifyInfo.code)}));
                                            String strLJJIJIIJIL = LJJIJIIJIL(aVMDLDataLoaderNotifyInfo.parameter);
                                            String strLJJIJIIJIL2 = LJJIJIIJIL(aVMDLDataLoaderNotifyInfo.code);
                                            if (TextUtils.isEmpty(strLJJIJIIJIL) || TextUtils.isEmpty(strLJJIJIIJIL2) || this.LIZ == null) {
                                                return;
                                            }
                                            StringBuilder sbLIZ14 = C2188811AlT.LIZ();
                                            sbLIZ14.append("do callback target: ");
                                            sbLIZ14.append(strLJJIJIIJIL);
                                            sbLIZ14.append(" current: ");
                                            sbLIZ14.append(strLJJIJIIJIL2);
                                            TTVideoEngineLog.d("multinetwork", C2188811AlT.LIZIZ(sbLIZ14));
                                            this.LIZ.getClass();
                                            StringBuilder sbLIZ15 = C2188811AlT.LIZ();
                                            sbLIZ15.append("end do callback target: ");
                                            sbLIZ15.append(strLJJIJIIJIL);
                                            sbLIZ15.append(" current: ");
                                            sbLIZ15.append(strLJJIJIIJIL2);
                                            TTVideoEngineLog.d("multinetwork", C2188811AlT.LIZIZ(sbLIZ15));
                                            return;
                                        }
                                    } else {
                                        return;
                                    }
                                } else {
                                    C0WPR c0wpr7 = this.LJIILJJIL;
                                    if (c0wpr7 != null) {
                                        ((C0WPO) c0wpr7).LIZIZ(aVMDLDataLoaderNotifyInfo.logType, aVMDLDataLoaderNotifyInfo.jsonLog);
                                        return;
                                    }
                                    C1476170oW7 c1476170oW716 = this.LIZ;
                                    if (c1476170oW716 == null) {
                                        return;
                                    }
                                    c1476170oW716.LJI(5, aVMDLDataLoaderNotifyInfo.logType, aVMDLDataLoaderNotifyInfo.jsonLog);
                                    int i14 = C2187451AjH.LIZ;
                                    StringBuilder sbLIZ16 = C2188811AlT.LIZ();
                                    sbLIZ16.append("live loader log sample msg: ");
                                    sbLIZ16.append(aVMDLDataLoaderNotifyInfo.logInfo);
                                    TTVideoEngineLog.d("DataLoaderHelper", C2188811AlT.LIZIZ(sbLIZ16));
                                    return;
                                }
                            } else {
                                C0WPR c0wpr8 = this.LJIILJJIL;
                                if (c0wpr8 != null) {
                                    ((C0WPO) c0wpr8).LIZIZ(aVMDLDataLoaderNotifyInfo.logType, aVMDLDataLoaderNotifyInfo.jsonLog);
                                    return;
                                }
                                C1476170oW7 c1476170oW717 = this.LIZ;
                                if (c1476170oW717 == null) {
                                    return;
                                }
                                c1476170oW717.LJI(4, aVMDLDataLoaderNotifyInfo.logType, aVMDLDataLoaderNotifyInfo.jsonLog);
                                int i15 = C2187451AjH.LIZ;
                                StringBuilder sbLIZ17 = C2188811AlT.LIZ();
                                sbLIZ17.append("live loader log msg: ");
                                sbLIZ17.append(aVMDLDataLoaderNotifyInfo.logInfo);
                                TTVideoEngineLog.d("DataLoaderHelper", C2188811AlT.LIZIZ(sbLIZ17));
                                return;
                            }
                        } else {
                            int i16 = C2187451AjH.LIZ;
                            StringBuilder sbLIZ18 = C2188811AlT.LIZ();
                            sbLIZ18.append("KeyIsSpeedTestSampledByTime  mNeedSpeedTestByTimeInternal:");
                            sbLIZ18.append(this.LJJIIJZLJL);
                            sbLIZ18.append(" code:");
                            sbLIZ18.append(aVMDLDataLoaderNotifyInfo.code);
                            TTVideoEngineLog.d("DataLoaderHelper", C2188811AlT.LIZIZ(sbLIZ18));
                            int i17 = this.LJJIIJZLJL;
                            if (i17 != 1) {
                                i2 = 2;
                                if (i17 != 2) {
                                    i3 = -1;
                                } else {
                                    i3 = 32;
                                }
                            } else {
                                i2 = 2;
                                i3 = 2;
                            }
                            if (this.LIZ == null || i3 == -1) {
                                return;
                            }
                            StringBuilder sbLIZ19 = C2188811AlT.LIZ();
                            sbLIZ19.append("KeyIsSpeedTestSampledByTimenotify by");
                            if (i3 == i2) {
                                str5 = "general";
                            } else {
                                str5 = "timeinternal";
                            }
                            sbLIZ19.append(str5);
                            sbLIZ19.append("speed info code:");
                            sbLIZ19.append(aVMDLDataLoaderNotifyInfo.code);
                            sbLIZ19.append(" parameter:");
                            sbLIZ19.append(aVMDLDataLoaderNotifyInfo.parameter);
                            TTVideoEngineLog.d("DataLoaderHelper", C2188811AlT.LIZIZ(sbLIZ19));
                            this.LIZ.LJ(i3, aVMDLDataLoaderNotifyInfo.code, aVMDLDataLoaderNotifyInfo.parameter, aVMDLDataLoaderNotifyInfo.logInfo);
                            return;
                        }
                    } else {
                        JSONObject jSONObject4 = aVMDLDataLoaderNotifyInfo.jsonLog;
                        try {
                            C790190UzB c790190UzB = C790190UzB.LIZLLL;
                            long jLIZ = c790190UzB.LIZ();
                            if (jLIZ > 0) {
                                jSONObject4.put("_play_waste_data", jLIZ);
                            }
                            synchronized (c790190UzB) {
                                j = c790190UzB.LIZJ;
                                c790190UzB.LIZJ = 0L;
                            }
                            if (j > 0) {
                                jSONObject4.put("_play_consumed_data", j);
                            }
                        } catch (Exception e4) {
                            TryCatchGuardChecker.doCheck(e4);
                        }
                        aVMDLDataLoaderNotifyInfo.jsonLog = jSONObject4;
                        C0WPR c0wpr9 = this.LJIILJJIL;
                        if (c0wpr9 != null) {
                            ((C0WPO) c0wpr9).LIZIZ(aVMDLDataLoaderNotifyInfo.logType, jSONObject4);
                            return;
                        }
                        C1476170oW7 c1476170oW718 = this.LIZ;
                        if (c1476170oW718 != null) {
                            c1476170oW718.LJI(3, aVMDLDataLoaderNotifyInfo.logType, jSONObject4);
                        }
                        int i18 = C2187451AjH.LIZ;
                        StringBuilder sbLIZ20 = C2188811AlT.LIZ();
                        sbLIZ20.append("heart beat msg: ");
                        sbLIZ20.append(aVMDLDataLoaderNotifyInfo.logInfo);
                        TTVideoEngineLog.d("DataLoaderHelper", C2188811AlT.LIZIZ(sbLIZ20));
                        return;
                    }
                } else {
                    return;
                }
            } else {
                C1476170oW7 c1476170oW719 = this.LIZ;
                if (c1476170oW719 == null) {
                    return;
                }
                c1476170oW719.LJ(30, 0L, aVMDLDataLoaderNotifyInfo.parameter, aVMDLDataLoaderNotifyInfo.logInfo);
                return;
            }
        }
        String str13 = aVMDLDataLoaderNotifyInfo.logInfo;
        if (str13 == null) {
            return;
        }
        if (aVMDLDataLoaderNotifyInfo.parameter == 3) {
            long j3 = aVMDLDataLoaderNotifyInfo.code;
            C0VOT c0vot = C0VOT.LJIIIIZZ;
            int i19 = (int) j3;
            if (i19 != -5000) {
                if (i19 != -4000) {
                    if (i19 != -2000) {
                        if (i19 != -3001) {
                            if (i19 != -3000) {
                                switch (i19) {
                                    case -1002:
                                        str4 = "Waiting for too many tasks, > 20";
                                        break;
                                    case -1001:
                                        str4 = "add the same key task.";
                                        break;
                                    case C386801es.DEFAULT /* -1000 */:
                                        str4 = "create preload task fail.";
                                        break;
                                    default:
                                        str4 = "task fail. reply task error.";
                                        break;
                                }
                            } else {
                                if (!C787250UuR.LIZIZ(this.LJIIJ)) {
                                    i = -9960;
                                } else {
                                    i = -9945;
                                }
                                str4 = "url invalid. response status code >= 400";
                            }
                        } else {
                            str4 = "server invalid. response status code >= 500";
                            i = -9944;
                        }
                    } else {
                        str4 = "media data content length invalid";
                    }
                } else {
                    str4 = "request invalid.";
                }
                i = i19;
            } else {
                str4 = "write file fail.";
                i = -9948;
            }
            StringBuilder sbLIZ21 = C2188811AlT.LIZ();
            sbLIZ21.append("key = ");
            sbLIZ21.append(str13);
            sbLIZ21.append(", reason = ");
            sbLIZ21.append(str4);
            new e("kTTVideoErrorDomainDownload", i, i19, C2188811AlT.LIZIZ(sbLIZ21));
            c0vot.getClass();
            TextUtils.isEmpty(str13);
            return;
        }
        int i20 = C2187451AjH.LIZ;
        StringBuilder sbLIZ22 = C2188811AlT.LIZ();
        sbLIZ22.append(" task fail log = ");
        sbLIZ22.append(aVMDLDataLoaderNotifyInfo.logInfo);
        sbLIZ22.append(", code = ");
        sbLIZ22.append(aVMDLDataLoaderNotifyInfo.code);
        sbLIZ22.append(", task type = ");
        sbLIZ22.append(aVMDLDataLoaderNotifyInfo.parameter);
        C1471660oOq.LIZJ("DataLoaderHelper", C2188811AlT.LIZIZ(sbLIZ22));
        String[] strArrSplit2 = aVMDLDataLoaderNotifyInfo.logInfo.split(",");
        if (strArrSplit2.length < 1 || (c1471550oOfLJ = LJ((str = strArrSplit2[0]))) == null) {
            return;
        }
        C1476330oWN c1476330oWN2 = this.LJ;
        e eVar = new e("kTTVideoErrorDomainDataLoaderPreload", (int) aVMDLDataLoaderNotifyInfo.code, 0, aVMDLDataLoaderNotifyInfo.logInfo);
        if (TextUtils.isEmpty(c1471550oOfLJ.LIZ)) {
            str2 = str;
        } else {
            str2 = c1471550oOfLJ.LIZ;
        }
        C1476210oWB c1476210oWB2 = C1476340oWO.LIZ;
        C1475790oVV c1475790oVVLIZ2 = c1476210oWB2.LIZ(str2);
        if (c1475790oVVLIZ2 == null) {
            c1475790oVVLIZ2 = new C1475790oVV();
        }
        c1475790oVVLIZ2.LIZ = (int) aVMDLDataLoaderNotifyInfo.parameter;
        c1475790oVVLIZ2.LJ(c1471550oOfLJ);
        C1475770oVT c1475770oVTLIZ = c1475790oVVLIZ2.LIZ(str);
        if (c1475770oVTLIZ != null) {
            c1475770oVTLIZ.LJFF = eVar;
        }
        C1476170oW7 c1476170oW720 = this.LIZ;
        if (c1476170oW720 != null) {
            c1476170oW720.LIZIZ(c1475790oVVLIZ2);
        }
        c1476210oWB2.LIZIZ(str2, c1475790oVVLIZ2);
        if (!c1475790oVVLIZ2.LIZJ() && !c1475790oVVLIZ2.LIZLLL()) {
            return;
        }
        c1476330oWN2.LJI(str);
        StringBuilder sbLIZ23 = C2188811AlT.LIZ();
        sbLIZ23.append("pop all task item. videoId = ");
        sbLIZ23.append(c1471550oOfLJ.LIZ);
        sbLIZ23.append(" key = ");
        sbLIZ23.append(str);
        C1471660oOq.LIZJ("DataLoaderHelper", C2188811AlT.LIZIZ(sbLIZ23));
        c1476210oWB2.LIZJ(str2);
        if (this.LIZ != null) {
            C1475430oUv c1475430oUv3 = new C1475430oUv();
            c1475430oUv3.LJIIIIZZ = (int) aVMDLDataLoaderNotifyInfo.parameter;
            c1475430oUv3.LIZIZ = c1471550oOfLJ.LIZ;
            c1475430oUv3.LIZ = str;
            C1475600oVC c1475600oVC = c1471550oOfLJ.LJIIJ;
            if (c1475600oVC != null && (str3 = c1475600oVC.LIZIZ) != null) {
                c1475430oUv3.LIZJ = str3;
                c1475430oUv3.LIZ = null;
            }
            this.LIZ.LJIIIIZZ(c1475430oUv3);
        }
        if (c1471550oOfLJ.LIZJ() == null || aVMDLDataLoaderNotifyInfo.parameter != 2) {
            return;
        }
        C1475490oV1 c1475490oV12 = new C1475490oV1(3);
        c1475490oV12.LIZJ = eVar;
        c1475490oV12.LIZIZ = null;
        c1471550oOfLJ.LIZJ().LIZ(c1475490oV12);
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0074  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZLLL(X.C1475130oUR r12, java.lang.String r13) {
        /*
            r11 = this;
            boolean r0 = X.C1474810oTv.LJJIFFI()
            r8 = r13
            if (r0 == 0) goto L10
            X.0oUz r0 = r11.LJLIIIL
            r0.getClass()
            X.C1475470oUz.LIZ(r12, r8, r11)
            return
        L10:
            if (r12 == 0) goto Lad
            X.0oVD r0 = r12.LJFF
            r7 = 0
            if (r0 == 0) goto L76
            X.0oUx r6 = new X.0oUx
            r6.<init>(r0)
        L1c:
            X.0oUY r0 = r12.LIZJ
            if (r0 == 0) goto L25
            X.0oV2 r7 = new X.0oV2
            r7.<init>(r0)
        L25:
            X.0oHP r0 = r12.LIZLLL
            java.lang.String r1 = r0.LJIJ()
            boolean r0 = r12.LIZ()
            if (r0 == 0) goto L74
            java.lang.String r5 = r12.LIZJ()
            boolean r0 = android.text.TextUtils.isEmpty(r5)
            if (r0 != 0) goto L74
        L3b:
            int r1 = r11.LJJJJI
            r0 = 1
            if (r1 != r0) goto L78
            X.0oHP r0 = r12.LIZLLL
            if (r0 == 0) goto L78
            java.util.List r1 = r0.LJIILL()
            if (r1 == 0) goto L78
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L78
            java.util.Iterator r4 = r1.iterator()
        L54:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L78
            java.lang.Object r0 = r4.next()
            X.0oTS r0 = (X.C1474520oTS) r0
            java.lang.String[] r3 = r0.LJIIJ()
            int r2 = r3.length
            r1 = 0
        L66:
            if (r1 >= r2) goto L54
            r0 = r3[r1]
            boolean r0 = r11.LJIILLIIL(r0)
            if (r0 != 0) goto L71
            return
        L71:
            int r1 = r1 + 1
            goto L66
        L74:
            r5 = r1
            goto L3b
        L76:
            r6 = r7
            goto L1c
        L78:
            int r0 = r11.LJJLIIIJL
            r2 = 2
            r0 = r0 & 2
            if (r0 != r2) goto Lb1
            com.bytedance.vcloud.strategy.StrategyMediaInfo$Builder r1 = new com.bytedance.vcloud.strategy.StrategyMediaInfo$Builder
            r1.<init>(r5, r7, r6)
            r1.sceneId(r8)
            int r0 = r12.LJJ
            r1.isLive(r0)
            boolean r0 = r12.LJIL
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r1.isLast(r0)
            X.0oHP r0 = r12.LIZLLL
            if (r0 == 0) goto Lae
            java.lang.String r0 = r0.LJJII(r2)
        L9d:
            r1.mediaId(r0)
            com.bytedance.vcloud.strategy.StrategyMediaInfo r1 = r1.build()
            X.0oKo r0 = X.C790230UzF.LIZ
            com.bytedance.vcloud.strategy.StrategyCenter r0 = r0.LIZJ()
            r0.addStrategyMedia(r1, r8)
        Lad:
            return
        Lae:
            java.lang.String r0 = ""
            goto L9d
        Lb1:
            X.0oKo r0 = X.C790230UzF.LIZ
            com.bytedance.vcloud.strategy.StrategyCenter r4 = r0.LIZJ()
            boolean r9 = r12.LJIL
            r10 = 0
            r4.addMedia(r5, r6, r7, r8, r9, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.ttvideoengine.DataLoaderHelper.LIZLLL(X.0oUR, java.lang.String):void");
    }

    public final void LJ(String str, List list) {
        C1475450oUx c1475450oUx;
        JSONObject jSONObjectLJII;
        String strLJJII;
        InterfaceC1467050oHP interfaceC1467050oHP;
        List<C1474520oTS> listLJIILL;
        if (C1474810oTv.LJJIFFI()) {
            this.LJLIIIL.getClass();
            C1475470oUz.LIZIZ(list, str, this);
            return;
        }
        if (list == null) {
            throw new NullPointerException("isEmpty");
        }
        ArrayList arrayList = new ArrayList();
        loop0: for (int i = 0; i < list.size(); i++) {
            C1475130oUR c1475130oUR = (C1475130oUR) ListProtector.get(list, i);
            if (c1475130oUR != null) {
                InterfaceC1475610oVD interfaceC1475610oVD = c1475130oUR.LJFF;
                C1475500oV2 c1475500oV2 = null;
                if (interfaceC1475610oVD != null) {
                    c1475450oUx = new C1475450oUx(interfaceC1475610oVD);
                } else {
                    c1475450oUx = null;
                }
                C1475200oUY c1475200oUY = c1475130oUR.LIZJ;
                if (c1475200oUY != null) {
                    c1475500oV2 = new C1475500oV2(c1475200oUY);
                }
                if (c1475130oUR.LIZ()) {
                    jSONObjectLJII = c1475130oUR.LIZLLL();
                } else {
                    jSONObjectLJII = c1475130oUR.LIZLLL.LJII();
                }
                if (this.LJJJJI == 1 && (interfaceC1467050oHP = c1475130oUR.LIZLLL) != null && (listLJIILL = interfaceC1467050oHP.LJIILL()) != null && !listLJIILL.isEmpty()) {
                    Iterator<C1474520oTS> it2 = listLJIILL.iterator();
                    while (it2.hasNext()) {
                        for (String str2 : it2.next().LJIIJ()) {
                            if (!LJIILLIIL(str2)) {
                                break loop0;
                            }
                        }
                    }
                }
                StrategyMediaInfo.Builder builder = new StrategyMediaInfo.Builder(jSONObjectLJII, c1475500oV2, c1475450oUx);
                builder.sceneId(str);
                builder.isLive(c1475130oUR.LJJ);
                builder.isLast(Boolean.valueOf(c1475130oUR.LJIL));
                InterfaceC1467050oHP interfaceC1467050oHP2 = c1475130oUR.LIZLLL;
                if (interfaceC1467050oHP2 != null) {
                    strLJJII = interfaceC1467050oHP2.LJJII(2);
                } else {
                    strLJJII = "";
                }
                builder.mediaId(strLJJII);
                arrayList.add(builder.build());
            }
        }
        C790230UzF.LIZ.LIZJ().addStrategyMedias(arrayList, str);
    }

    public final void LJI(String str, List list) {
        C1475450oUx c1475450oUx;
        String strLJJII;
        InterfaceC1467050oHP interfaceC1467050oHP;
        List<C1474520oTS> listLJIILL;
        if (C1474810oTv.LJJIFFI()) {
            this.LJLIIIL.getClass();
            C1475470oUz.LIZJ(list, str, this);
            return;
        }
        if (list == null) {
            throw new NullPointerException("isEmpty");
        }
        ArrayList arrayList = new ArrayList();
        loop0: for (int i = 0; i < list.size(); i++) {
            C1475130oUR c1475130oUR = (C1475130oUR) ListProtector.get(list, i);
            if (c1475130oUR != null) {
                InterfaceC1475610oVD interfaceC1475610oVD = c1475130oUR.LJFF;
                C1475500oV2 c1475500oV2 = null;
                if (interfaceC1475610oVD != null) {
                    c1475450oUx = new C1475450oUx(interfaceC1475610oVD);
                } else {
                    c1475450oUx = null;
                }
                C1475200oUY c1475200oUY = c1475130oUR.LIZJ;
                if (c1475200oUY != null) {
                    c1475500oV2 = new C1475500oV2(c1475200oUY);
                }
                String strLJIJ = c1475130oUR.LIZLLL.LJIJ();
                if (c1475130oUR.LIZ()) {
                    String strLIZJ = c1475130oUR.LIZJ();
                    if (!TextUtils.isEmpty(strLIZJ)) {
                        strLJIJ = strLIZJ;
                    }
                }
                boolean z = true;
                if (this.LJJJJI == 1 && (interfaceC1467050oHP = c1475130oUR.LIZLLL) != null && (listLJIILL = interfaceC1467050oHP.LJIILL()) != null && !listLJIILL.isEmpty()) {
                    Iterator<C1474520oTS> it2 = listLJIILL.iterator();
                    while (it2.hasNext()) {
                        for (String str2 : it2.next().LJIIJ()) {
                            if (!LJIILLIIL(str2)) {
                                break loop0;
                            }
                        }
                    }
                }
                StrategyMediaInfo.Builder builder = new StrategyMediaInfo.Builder(strLJIJ, c1475500oV2, c1475450oUx);
                builder.sceneId(str);
                builder.isLive(c1475130oUR.LJJ);
                if (i != list.size() - 1) {
                    z = false;
                }
                builder.isLast(Boolean.valueOf(z));
                InterfaceC1467050oHP interfaceC1467050oHP2 = c1475130oUR.LIZLLL;
                if (interfaceC1467050oHP2 != null) {
                    strLJJII = interfaceC1467050oHP2.LJJII(2);
                } else {
                    strLJJII = "";
                }
                builder.mediaId(strLJJII);
                arrayList.add(builder.build());
            }
        }
        C790230UzF.LIZ.LIZJ().refreshUnplayedMedias(arrayList, str);
    }

    public final void LJIIJJI(C1474520oTS c1474520oTS, C1471550oOf c1471550oOf) {
        C1476190oW9 c1476190oW9;
        C1476190oW9 c1476190oW92;
        if (C1474810oTv.LJJIFFI()) {
            getClass();
            String[] strArrLJIIJ = c1474520oTS.LJIIJ();
            String strLIZ = c1474520oTS.LIZ(15);
            C1476320oWM c1476320oWMLIZIZ = c1471550oOf.LIZIZ(strLIZ);
            if (strArrLJIIJ != null && strArrLJIIJ.length >= 1) {
                String[] strArr = (String[]) strArrLJIIJ.clone();
                if (c1471550oOf.LJI == null && (c1476190oW92 = c1471550oOf.LJIIIZ) != null && c1476190oW92.LJ) {
                    for (int i = 0; i < strArr.length; i++) {
                        if (!TextUtils.isEmpty(strArr[i])) {
                            strArr[i] = C795730VJj.LIZ(strArr[i]);
                        }
                    }
                }
                if (c1476320oWMLIZIZ == null && (c1476320oWMLIZIZ = c1471550oOf.LIZIZ(strLIZ)) == null) {
                    c1471550oOf.LIZ(-100001);
                    return;
                }
                c1476320oWMLIZIZ.LIZ = strLIZ;
                c1476320oWMLIZIZ.LJ = c1474520oTS;
                c1476320oWMLIZIZ.LIZLLL = c1474520oTS.LIZ(5);
                c1476320oWMLIZIZ.LIZJ = c1474520oTS.getResolution();
                c1476320oWMLIZIZ.LJFF = strArr;
                c1476320oWMLIZIZ.LJIIL = null;
                c1476320oWMLIZIZ.LJI = C1471300oOG.LIZJ(c1474520oTS, c1471550oOf);
                int i2 = C2187451AjH.LIZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("[preload] prepare url info. videoId = ");
                sbLIZ.append(c1471550oOf.LIZ);
                sbLIZ.append(", key is ");
                sbLIZ.append(strLIZ);
                sbLIZ.append(", resolution = ");
                sbLIZ.append(c1476320oWMLIZIZ.LIZJ.toString());
                TTVideoEngineLog.d("DataLoaderHelper", C2188811AlT.LIZIZ(sbLIZ));
                return;
            }
            int i3 = C2187451AjH.LIZ;
            C1471660oOq.LIZIZ("DataLoaderHelper", "[preload] url info, urls info invalid");
            c1471550oOf.LIZ(-100001);
            return;
        }
        String[] strArrLJIIJ2 = c1474520oTS.LJIIJ();
        String strLIZ2 = c1474520oTS.LIZ(15);
        C1476320oWM c1476320oWMLIZIZ2 = c1471550oOf.LIZIZ(strLIZ2);
        if (strArrLJIIJ2 != null && strArrLJIIJ2.length >= 1) {
            String[] strArr2 = (String[]) strArrLJIIJ2.clone();
            if (c1471550oOf.LJI == null && (c1476190oW9 = c1471550oOf.LJIIIZ) != null && c1476190oW9.LJ) {
                for (int i4 = 0; i4 < strArr2.length; i4++) {
                    if (!TextUtils.isEmpty(strArr2[i4])) {
                        strArr2[i4] = C795730VJj.LIZ(strArr2[i4]);
                    }
                }
            }
            if (c1476320oWMLIZIZ2 == null && (c1476320oWMLIZIZ2 = c1471550oOf.LIZIZ(strLIZ2)) == null) {
                c1471550oOf.LIZ(-100001);
                return;
            }
            c1476320oWMLIZIZ2.LIZ = strLIZ2;
            c1476320oWMLIZIZ2.LJ = c1474520oTS;
            c1476320oWMLIZIZ2.LIZLLL = c1474520oTS.LIZ(5);
            c1476320oWMLIZIZ2.LIZJ = c1474520oTS.getResolution();
            c1476320oWMLIZIZ2.LJFF = strArr2;
            c1476320oWMLIZIZ2.LJIIL = null;
            c1476320oWMLIZIZ2.LJI = C1471300oOG.LIZJ(c1474520oTS, c1471550oOf);
            int i5 = C2187451AjH.LIZ;
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("[preload] prepare url info. videoId = ");
            sbLIZ2.append(c1471550oOf.LIZ);
            sbLIZ2.append(", key is ");
            sbLIZ2.append(strLIZ2);
            sbLIZ2.append(", resolution = ");
            sbLIZ2.append(c1476320oWMLIZIZ2.LIZJ.toString());
            TTVideoEngineLog.d("DataLoaderHelper", C2188811AlT.LIZIZ(sbLIZ2));
            return;
        }
        int i6 = C2187451AjH.LIZ;
        C1471660oOq.LIZIZ("DataLoaderHelper", "[preload] url info, urls info invalid");
        c1471550oOf.LIZ(-100001);
    }

    public final void LJIILL(C1471550oOf c1471550oOf, C1476320oWM c1476320oWM) {
        boolean zLJIIJ;
        boolean zLJIIJ2;
        if (C1474810oTv.LJJIFFI()) {
            this.LJJLJLI.getClass();
            int i = C2187451AjH.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("[preload] start mdl preload task.  key = ");
            sbLIZ.append(c1476320oWM.LIZ);
            C1471660oOq.LIZJ("DataLoaderHelper", C2188811AlT.LIZIZ(sbLIZ));
            String str = c1476320oWM.LJIILIIL;
            String str2 = c1476320oWM.LIZ;
            C1475600oVC c1475600oVC = c1471550oOf.LJIIJ;
            if (c1475600oVC != null && c1475600oVC.LJIIIZ != null) {
                String strLJJJJI = LJJJJI(c1471550oOf.LIZLLL, c1471550oOf.LJIILL, str2, c1471550oOf.LIZ, c1471550oOf.LJIIIIZZ);
                StringBuffer stringBuffer = new StringBuffer();
                stringBuffer.append(strLJJJJI);
                stringBuffer.append("&header_size=");
                stringBuffer.append(c1476320oWM.LJII);
                stringBuffer.append("&timestamp=0");
                c1471550oOf.LJIIJ.getClass();
                String string = stringBuffer.toString();
                c1476320oWM.LIZIZ = string;
                if (!TextUtils.isEmpty(string)) {
                    LJI(str2);
                    LIZLLL(c1471550oOf);
                    long j = c1476320oWM.LJIIIIZZ;
                    if (j > 0 && j < c1476320oWM.LJII + 102400) {
                        c1476320oWM.LJIIIZ += j;
                        c1476320oWM.LJIIIIZZ = 0L;
                    }
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("[preload] preload offset ");
                    sbLIZ2.append(c1476320oWM.LJIIIIZZ);
                    sbLIZ2.append(" header size = ");
                    sbLIZ2.append(c1476320oWM.LJII);
                    sbLIZ2.append(" preload size = ");
                    sbLIZ2.append(c1476320oWM.LJIIIZ);
                    C1471660oOq.LIZJ("DataLoaderHelper", C2188811AlT.LIZIZ(sbLIZ2));
                    if (c1476320oWM.LJIIIIZZ > 0) {
                        long j2 = c1476320oWM.LJII;
                        if (j2 > 0) {
                            this.LJIIIIZZ.preloadResource(c1476320oWM.LIZIZ, (int) j2);
                        }
                        this.LJIIIIZZ.preloadResource(c1476320oWM.LIZIZ, (int) c1476320oWM.LJIIIIZZ, (int) c1476320oWM.LJIIIZ);
                    } else {
                        this.LJIIIIZZ.preloadResource(c1476320oWM.LIZIZ, (int) c1476320oWM.LJIIIZ);
                    }
                } else {
                    c1471550oOf.LIZ(-100001);
                }
                C1471660oOq.LIZJ("DataLoaderHelper", C786410Ut5.j4("[preload] exect preload task by provider mode, key is %s; videoId = %s proxyurl:%s", new Object[]{str2, c1471550oOf.LIZ, c1476320oWM.LIZIZ}));
                return;
            }
            String[] strArr = c1476320oWM.LJFF;
            if (strArr != null) {
                C1470240oMY c1470240oMY = c1471550oOf.LIZIZ;
                if (c1470240oMY != null) {
                    zLJIIJ2 = c1470240oMY.LJIIJ(EnumC1469940oM4.HLS);
                } else {
                    zLJIIJ2 = false;
                }
                if (strArr.length > 0 && !TextUtils.isEmpty(strArr[0]) && C1476290oWJ.LIZ(strArr[0])) {
                    zLJIIJ2 = true;
                }
                C1471300oOG.LIZ(c1471550oOf, c1476320oWM);
                String strLJJJIL = LJJJIL(str2, c1471550oOf.LIZ, c1476320oWM.LJIIIIZZ, strArr, c1476320oWM.LJIIL, c1476320oWM.LJI, c1471550oOf.LIZLLL, str, zLJIIJ2, c1471550oOf.LJIIIIZZ, c1471550oOf.LJIILJJIL);
                StringBuffer stringBuffer2 = new StringBuffer();
                stringBuffer2.append(strLJJJIL);
                stringBuffer2.append("&header_size=");
                stringBuffer2.append(c1476320oWM.LJII);
                if (c1471550oOf.LJIIIZ != null) {
                    stringBuffer2.append("&timestamp=0");
                    c1471550oOf.LJIIIZ.getClass();
                }
                String string2 = stringBuffer2.toString();
                c1476320oWM.LIZIZ = string2;
                if (!TextUtils.isEmpty(string2)) {
                    LJI(str2);
                    LIZLLL(c1471550oOf);
                    long j3 = c1476320oWM.LJIIIIZZ;
                    if (j3 > 0 && j3 < c1476320oWM.LJII + 102400) {
                        c1476320oWM.LJIIIZ += j3;
                        c1476320oWM.LJIIIIZZ = 0L;
                    }
                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                    sbLIZ3.append("[preload] preload offset ");
                    sbLIZ3.append(c1476320oWM.LJIIIIZZ);
                    sbLIZ3.append(" header size = ");
                    sbLIZ3.append(c1476320oWM.LJII);
                    sbLIZ3.append(" preload size = ");
                    sbLIZ3.append(c1476320oWM.LJIIIZ);
                    C1471660oOq.LIZJ("DataLoaderHelper", C2188811AlT.LIZIZ(sbLIZ3));
                    if (c1476320oWM.LJIIIIZZ > 0) {
                        long j4 = c1476320oWM.LJII;
                        if (j4 > 0) {
                            this.LJIIIIZZ.preloadResource(c1476320oWM.LIZIZ, (int) j4);
                        }
                        this.LJIIIIZZ.preloadResource(c1476320oWM.LIZIZ, (int) c1476320oWM.LJIIIIZZ, (int) c1476320oWM.LJIIIZ);
                    } else {
                        this.LJIIIIZZ.preloadResource(c1476320oWM.LIZIZ, (int) c1476320oWM.LJIIIZ);
                    }
                    C1471660oOq.LIZJ("DataLoaderHelper", C786410Ut5.j4("[preload] exect preload task ,key is %s; videoId = %s", new Object[]{c1476320oWM.LIZ, c1471550oOf.LIZ}));
                    return;
                }
                c1471550oOf.LIZ(-100001);
                return;
            }
            c1471550oOf.LIZ(-100001);
            return;
        }
        int i2 = C2187451AjH.LIZ;
        StringBuilder sbLIZ4 = C2188811AlT.LIZ();
        sbLIZ4.append("[preload] start mdl preload task.  key = ");
        sbLIZ4.append(c1476320oWM.LIZ);
        C1471660oOq.LIZJ("DataLoaderHelper", C2188811AlT.LIZIZ(sbLIZ4));
        String str3 = c1476320oWM.LJIILIIL;
        String str4 = c1476320oWM.LIZ;
        C1475600oVC c1475600oVC2 = c1471550oOf.LJIIJ;
        if (c1475600oVC2 != null && c1475600oVC2.LJIIIZ != null) {
            String strLJJJJI2 = LJJJJI(c1471550oOf.LIZLLL, c1471550oOf.LJIILL, str4, c1471550oOf.LIZ, c1471550oOf.LJIIIIZZ);
            StringBuffer stringBuffer3 = new StringBuffer();
            stringBuffer3.append(strLJJJJI2);
            stringBuffer3.append("&header_size=");
            stringBuffer3.append(c1476320oWM.LJII);
            stringBuffer3.append("&timestamp=0");
            c1471550oOf.LJIIJ.getClass();
            String string3 = stringBuffer3.toString();
            c1476320oWM.LIZIZ = string3;
            if (!TextUtils.isEmpty(string3)) {
                LJI(str4);
                LIZLLL(c1471550oOf);
                long j5 = c1476320oWM.LJIIIIZZ;
                if (j5 > 0 && j5 < c1476320oWM.LJII + 102400) {
                    c1476320oWM.LJIIIZ += j5;
                    c1476320oWM.LJIIIIZZ = 0L;
                }
                StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                sbLIZ5.append("[preload] preload offset ");
                sbLIZ5.append(c1476320oWM.LJIIIIZZ);
                sbLIZ5.append(" header size = ");
                sbLIZ5.append(c1476320oWM.LJII);
                sbLIZ5.append(" preload size = ");
                sbLIZ5.append(c1476320oWM.LJIIIZ);
                C1471660oOq.LIZJ("DataLoaderHelper", C2188811AlT.LIZIZ(sbLIZ5));
                if (c1476320oWM.LJIIIIZZ > 0) {
                    long j6 = c1476320oWM.LJII;
                    if (j6 > 0) {
                        this.LJIIIIZZ.preloadResource(c1476320oWM.LIZIZ, (int) j6);
                    }
                    this.LJIIIIZZ.preloadResource(c1476320oWM.LIZIZ, (int) c1476320oWM.LJIIIIZZ, (int) c1476320oWM.LJIIIZ);
                } else {
                    this.LJIIIIZZ.preloadResource(c1476320oWM.LIZIZ, (int) c1476320oWM.LJIIIZ);
                }
            } else {
                c1471550oOf.LIZ(-100001);
            }
            C1471660oOq.LIZJ("DataLoaderHelper", C786410Ut5.j4("[preload] exect preload task by provider mode, key is %s; videoId = %s proxyurl:%s", new Object[]{str4, c1471550oOf.LIZ, c1476320oWM.LIZIZ}));
            return;
        }
        String[] strArr2 = c1476320oWM.LJFF;
        if (strArr2 != null) {
            C1470240oMY c1470240oMY2 = c1471550oOf.LIZIZ;
            if (c1470240oMY2 != null) {
                zLJIIJ = c1470240oMY2.LJIIJ(EnumC1469940oM4.HLS);
            } else {
                zLJIIJ = false;
            }
            if (strArr2.length > 0 && !TextUtils.isEmpty(strArr2[0]) && C1476290oWJ.LIZ(strArr2[0])) {
                zLJIIJ = true;
            }
            C1471300oOG.LIZ(c1471550oOf, c1476320oWM);
            String strLJJJIL2 = LJJJIL(str4, c1471550oOf.LIZ, c1476320oWM.LJIIIIZZ, strArr2, c1476320oWM.LJIIL, c1476320oWM.LJI, c1471550oOf.LIZLLL, str3, zLJIIJ, c1471550oOf.LJIIIIZZ, c1471550oOf.LJIILJJIL);
            StringBuffer stringBuffer4 = new StringBuffer();
            stringBuffer4.append(strLJJJIL2);
            stringBuffer4.append("&header_size=");
            stringBuffer4.append(c1476320oWM.LJII);
            if (c1471550oOf.LJIIIZ != null) {
                stringBuffer4.append("&timestamp=0");
                c1471550oOf.LJIIIZ.getClass();
            }
            String string4 = stringBuffer4.toString();
            c1476320oWM.LIZIZ = string4;
            if (!TextUtils.isEmpty(string4)) {
                LJI(str4);
                LIZLLL(c1471550oOf);
                long j7 = c1476320oWM.LJIIIIZZ;
                if (j7 > 0 && j7 < c1476320oWM.LJII + 102400) {
                    c1476320oWM.LJIIIZ += j7;
                    c1476320oWM.LJIIIIZZ = 0L;
                }
                StringBuilder sbLIZ6 = C2188811AlT.LIZ();
                sbLIZ6.append("[preload] preload offset ");
                sbLIZ6.append(c1476320oWM.LJIIIIZZ);
                sbLIZ6.append(" header size = ");
                sbLIZ6.append(c1476320oWM.LJII);
                sbLIZ6.append(" preload size = ");
                sbLIZ6.append(c1476320oWM.LJIIIZ);
                C1471660oOq.LIZJ("DataLoaderHelper", C2188811AlT.LIZIZ(sbLIZ6));
                if (c1476320oWM.LJIIIIZZ > 0) {
                    long j8 = c1476320oWM.LJII;
                    if (j8 > 0) {
                        this.LJIIIIZZ.preloadResource(c1476320oWM.LIZIZ, (int) j8);
                    }
                    this.LJIIIIZZ.preloadResource(c1476320oWM.LIZIZ, (int) c1476320oWM.LJIIIIZZ, (int) c1476320oWM.LJIIIZ);
                } else {
                    this.LJIIIIZZ.preloadResource(c1476320oWM.LIZIZ, (int) c1476320oWM.LJIIIZ);
                }
                C1471660oOq.LIZJ("DataLoaderHelper", C786410Ut5.j4("[preload] exect preload task ,key is %s; videoId = %s", new Object[]{c1476320oWM.LIZ, c1471550oOf.LIZ}));
                return;
            }
            c1471550oOf.LIZ(-100001);
            return;
        }
        c1471550oOf.LIZ(-100001);
    }

    public final String LJJIL(AVMDLDataLoader.IOTaskModel iOTaskModel, C1474520oTS c1474520oTS) {
        boolean z = false;
        String strIoPrepare = null;
        if (C1474810oTv.LJJIFFI()) {
            getClass();
            if (this.LJIIIIZZ != null) {
                if (this.LIZIZ != 0) {
                    int i = C2187451AjH.LIZ;
                    TTVideoEngineLog.d("DataLoaderHelper", "ioPrepare state not start");
                } else {
                    if (this.LJIJJ || !this.LJIL) {
                        z = true;
                        if (this.LJJIJIIJI) {
                            int i2 = C2187451AjH.LIZ;
                            C1471660oOq.LIZIZ("DataLoaderHelper", "ioPrepare should use localServer but closed localServer");
                            return null;
                        }
                    }
                    iOTaskModel.useLocalServer = z;
                    strIoPrepare = this.LJIIIIZZ.ioPrepare(iOTaskModel);
                    if (!TextUtils.isEmpty(strIoPrepare)) {
                        C1471550oOf c1471550oOfLJIIIIZZ = LJIIIIZZ(iOTaskModel.rawKey);
                        if (c1471550oOfLJIIIIZZ == null) {
                            c1471550oOfLJIIIIZZ = new C1471550oOf();
                        }
                        C1476320oWM c1476320oWMLIZIZ = c1471550oOfLJIIIIZZ.LIZIZ(iOTaskModel.fileKey);
                        if (c1476320oWMLIZIZ != null) {
                            c1476320oWMLIZIZ.LIZ = iOTaskModel.fileKey;
                            c1471550oOfLJIIIIZZ.LIZ = iOTaskModel.rawKey;
                            c1476320oWMLIZIZ.LIZIZ = strIoPrepare;
                            c1476320oWMLIZIZ.LJFF = (String[]) iOTaskModel.urls.clone();
                            c1476320oWMLIZIZ.LJIIL = iOTaskModel.filePath;
                            c1476320oWMLIZIZ.LJ = c1474520oTS;
                            LIZLLL(c1471550oOfLJIIIIZZ);
                        }
                        this.LJJJZ = EnumC1469040oKc.None.ordinal();
                        return strIoPrepare;
                    }
                }
                return strIoPrepare;
            }
            int i3 = C2187451AjH.LIZ;
            TTVideoEngineLog.d("DataLoaderHelper", "ioPrepare dataloader null");
            return null;
        }
        if (this.LJIIIIZZ != null) {
            if (this.LIZIZ != 0) {
                int i4 = C2187451AjH.LIZ;
                TTVideoEngineLog.d("DataLoaderHelper", "ioPrepare state not start");
                return null;
            }
            if (this.LJIJJ || !this.LJIL) {
                z = true;
                if (this.LJJIJIIJI) {
                    int i5 = C2187451AjH.LIZ;
                    C1471660oOq.LIZIZ("DataLoaderHelper", "ioPrepare should use localServer but closed localServer");
                    return null;
                }
            }
            iOTaskModel.useLocalServer = z;
            String strIoPrepare2 = this.LJIIIIZZ.ioPrepare(iOTaskModel);
            if (!TextUtils.isEmpty(strIoPrepare2)) {
                C1471550oOf c1471550oOfLJIIIIZZ2 = LJIIIIZZ(iOTaskModel.rawKey);
                if (c1471550oOfLJIIIIZZ2 == null) {
                    c1471550oOfLJIIIIZZ2 = new C1471550oOf();
                }
                C1476320oWM c1476320oWMLIZIZ2 = c1471550oOfLJIIIIZZ2.LIZIZ(iOTaskModel.fileKey);
                if (c1476320oWMLIZIZ2 != null) {
                    c1476320oWMLIZIZ2.LIZ = iOTaskModel.fileKey;
                    c1471550oOfLJIIIIZZ2.LIZ = iOTaskModel.rawKey;
                    c1476320oWMLIZIZ2.LIZIZ = strIoPrepare2;
                    c1476320oWMLIZIZ2.LJFF = (String[]) iOTaskModel.urls.clone();
                    c1476320oWMLIZIZ2.LJIIL = iOTaskModel.filePath;
                    c1476320oWMLIZIZ2.LJ = c1474520oTS;
                    LIZLLL(c1471550oOfLJIIIIZZ2);
                }
                this.LJJJZ = EnumC1469040oKc.None.ordinal();
            }
            return strIoPrepare2;
        }
        int i6 = C2187451AjH.LIZ;
        TTVideoEngineLog.d("DataLoaderHelper", "ioPrepare dataloader null");
        return null;
    }

    public final void LJJJJJ(String[] strArr, long[] jArr) {
        if (C1474810oTv.LJJIFFI()) {
            this.LJLJJI.getClass();
            int i = C2187451AjH.LIZ;
            TTVideoEngineLog.d("DataLoaderHelper", "setcustom paths and maxcaches ");
            this.LJJ.LIZJ(2);
            try {
                this.LJIIIZ.setCacheInfoList(strArr, jArr);
                this.LJJ.LJFF(2);
                return;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                this.LJJ.LJFF(2);
                throw th;
            }
        }
        int i2 = C2187451AjH.LIZ;
        TTVideoEngineLog.d("DataLoaderHelper", "setcustom paths and maxcaches ");
        this.LJJ.LIZJ(2);
        try {
            this.LJIIIZ.setCacheInfoList(strArr, jArr);
            this.LJJ.LJFF(2);
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
            this.LJJ.LJFF(2);
            throw th2;
        }
    }

    public final void LJJJJL(int i, int i2) {
        if (C1474810oTv.LJJIFFI()) {
            this.LJJZZI.getClass();
            C1476090oVz.LIZ(i, i2, this);
            return;
        }
        this.LJJ.LIZJ(1);
        int i3 = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("setIntValue key = ");
        sbLIZ.append(i);
        sbLIZ.append(", value = ");
        sbLIZ.append(i2);
        TTVideoEngineLog.d("DataLoaderHelper", C2188811AlT.LIZIZ(sbLIZ));
        try {
            try {
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3) {
                            if (i != 4) {
                                if (i != 5) {
                                    if (i != 7) {
                                        if (i != 8) {
                                            if (i != 9) {
                                                if (i != 55) {
                                                    if (i != 56) {
                                                        if (i != 60) {
                                                            if (i != 61) {
                                                                if (i != 100) {
                                                                    if (i != 101) {
                                                                        switch (i) {
                                                                            case BdTuring.TYPE_EMAIL /* 11 */:
                                                                                this.LJIIIZ.mPreloadParallelNum = i2;
                                                                                AVMDLDataLoader aVMDLDataLoader = this.LJIIIIZZ;
                                                                                if (aVMDLDataLoader != null) {
                                                                                    aVMDLDataLoader.setIntValue(102, i2);
                                                                                }
                                                                                break;
                                                                            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                                                                                if (i2 >= 100) {
                                                                                    AVMDLDataLoaderConfigure aVMDLDataLoaderConfigure = this.LJIIIZ;
                                                                                    this.LJJIZ = aVMDLDataLoaderConfigure.mPreloadStrategy;
                                                                                    aVMDLDataLoaderConfigure.mPreloadStrategy = 100;
                                                                                } else {
                                                                                    AVMDLDataLoaderConfigure aVMDLDataLoaderConfigure2 = this.LJIIIZ;
                                                                                    this.LJJIZ = aVMDLDataLoaderConfigure2.mPreloadStrategy;
                                                                                    aVMDLDataLoaderConfigure2.mPreloadStrategy = i2;
                                                                                }
                                                                                this.LJJIL = i2;
                                                                                if (i2 == 200) {
                                                                                    this.LJIIIZ.mEnableIOManager = 1;
                                                                                }
                                                                                break;
                                                                            case BdTuring.TYPE_SMS_VOICE /* 13 */:
                                                                                this.LJIIIZ.mCheckSumLevel = i2;
                                                                                break;
                                                                            case 14:
                                                                                this.LJIIIZ.mTestSpeedTypeVersion = i2;
                                                                                break;
                                                                            case 15:
                                                                                this.LJIILL = i2;
                                                                                break;
                                                                            default:
                                                                                if (i != 112) {
                                                                                    if (i != 113) {
                                                                                        boolean z = false;
                                                                                        switch (i) {
                                                                                            case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                                                                                                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                                                                                                sbLIZ2.append("set write file notify intervalMS ");
                                                                                                sbLIZ2.append(i2);
                                                                                                C1471660oOq.LIZJ("DataLoaderHelper", C2188811AlT.LIZIZ(sbLIZ2));
                                                                                                this.LJIIIZ.mWriteFileNotifyIntervalMS = i2;
                                                                                                break;
                                                                                            case LiveToolbarIconStyleSetting.COLORFUL_WITH_TEXT /* 18 */:
                                                                                            case 19:
                                                                                            case LiveToolbarIconStyleSetting.HIGHLIGHT_WITH_TEXT /* 20 */:
                                                                                            case 1155:
                                                                                            case 2037:
                                                                                            case 9000:
                                                                                            case 9030:
                                                                                            case 12002:
                                                                                                break;
                                                                                            case 21:
                                                                                                this.LJIIIZ.mEnableDownloaderLog = i2;
                                                                                                break;
                                                                                            case 22:
                                                                                                this.LJIIIZ.mEnableTTNetLoader = i2;
                                                                                                break;
                                                                                            case 23:
                                                                                                this.LJIIIZ.mTTNetLoaderCronetBufSizeKB = i2;
                                                                                                break;
                                                                                            case LiveSubscriptionQuestionnaireHourFrequencySetting.DEFAULT /* 24 */:
                                                                                                this.LJIIIZ.mEnableTTQuicHeLoader = i2;
                                                                                                break;
                                                                                            case 25:
                                                                                                this.LJIIIZ.mEnableTTQuicHeLoaderCheckWithNetworkType = i2;
                                                                                                break;
                                                                                            case BaseNotice.RECOMMEND_LIVE /* 50 */:
                                                                                                this.LJIIIZ.mIsCloseFileCache = i2;
                                                                                                break;
                                                                                            case 80:
                                                                                                this.LJIIIZ.mPreloadWaitListType = i2;
                                                                                                break;
                                                                                            case 119:
                                                                                                C1309100kAe c1309100kAeLJ = C1309100kAe.LJ();
                                                                                                c1309100kAeLJ.LJFF = i2;
                                                                                                if (C1308970kAR.LIZJ != null) {
                                                                                                    c1309100kAeLJ.LIZIZ();
                                                                                                    c1309100kAeLJ.LJFF();
                                                                                                }
                                                                                                break;
                                                                                            case 121:
                                                                                                this.LJIIIZ.mUseNewSpeedTestForSingle = i2;
                                                                                                break;
                                                                                            case 123:
                                                                                                if (i2 > 0) {
                                                                                                    this.LJIIIZ.mDeviceScoreEx = i2;
                                                                                                }
                                                                                                break;
                                                                                            case 200:
                                                                                                this.LJIIIZ.mEnableEventInfo = i2;
                                                                                                break;
                                                                                            case 1115:
                                                                                                this.LJIIIZ.mMaxIPV6Num = i2;
                                                                                                break;
                                                                                            case 1116:
                                                                                                this.LJIIIZ.mMaxIPV4Num = i2;
                                                                                                break;
                                                                                            case 1117:
                                                                                                this.LJIIIZ.mForbidByPassCookie = i2;
                                                                                                break;
                                                                                            case 1118:
                                                                                                this.LJIIIZ.mEnableLazyBufferpool = i2;
                                                                                                break;
                                                                                            case 1119:
                                                                                                this.LJIIIZ.mSessionTimeout = i2;
                                                                                                break;
                                                                                            case 1120:
                                                                                                this.LJIIIZ.mEnableNewBufferpool = i2;
                                                                                                break;
                                                                                            case 1121:
                                                                                                this.LJIIIZ.mNewBufferPoolBlockSize = i2;
                                                                                                break;
                                                                                            case 1122:
                                                                                                this.LJIIIZ.mNewBufferPoolResidentSize = i2;
                                                                                                break;
                                                                                            case 1123:
                                                                                                this.LJIIIZ.mNewBufferPoolGrowBlockCount = i2;
                                                                                                break;
                                                                                            case 1124:
                                                                                                this.LJIIIZ.mEnablePlayInfoCache = i2;
                                                                                                break;
                                                                                            case 1125:
                                                                                                this.LJIIIZ.mControlCDNRangeType = i2;
                                                                                                break;
                                                                                            case 1126:
                                                                                                this.LJIIIZ.mEnableP2PPreDown = i2;
                                                                                                break;
                                                                                            case 1127:
                                                                                                this.LJIIIZ.mEnablePlayLog = i2;
                                                                                                break;
                                                                                            case 1128:
                                                                                                this.LJIIIZ.mEnableNetScheduler = i2;
                                                                                                break;
                                                                                            case 1129:
                                                                                                this.LJIIIZ.mNetSchedulerBlockAllNetErr = i2;
                                                                                                break;
                                                                                            case 1130:
                                                                                                this.LJIIIZ.mNetSchedulerBlockErrCount = i2;
                                                                                                break;
                                                                                            case 1131:
                                                                                                this.LJIIIZ.mNetSChedulerBlockDurationMs = i2;
                                                                                                break;
                                                                                            case 1132:
                                                                                                this.LJIIIZ.mFirstRangeLeftThreshold = i2;
                                                                                                break;
                                                                                            case 1133:
                                                                                                this.LJIIIZ.mIsAllowTryTheLastUrl = i2;
                                                                                                break;
                                                                                            case 1134:
                                                                                                this.LJIIIZ.mEnableCacheReqRange = i2;
                                                                                                break;
                                                                                            case 1135:
                                                                                                this.LJIIIZ.mEnableLoaderSeek = i2;
                                                                                                break;
                                                                                            case 1136:
                                                                                                this.LJIIIZ.mP2PPreDownPeerCount = i2;
                                                                                                break;
                                                                                            case 1137:
                                                                                                this.LJIIIZ.mEnableDynamicTimeout = i2;
                                                                                                break;
                                                                                            case 1138:
                                                                                                this.LJIIIZ.mSocketInitialTimeout = i2;
                                                                                                break;
                                                                                            case 1139:
                                                                                                this.LJIIIZ.mMaxSocketReuseCount = i2;
                                                                                                break;
                                                                                            case 1140:
                                                                                                AVMDLDNSParser.setIntValue(10, i2);
                                                                                                break;
                                                                                            case 1141:
                                                                                                AVMDLDNSParser.setIntValue(2, i2);
                                                                                                break;
                                                                                            case 1143:
                                                                                                this.LJIIIZ.mP2PFirstRangeLoaderType = i2;
                                                                                                break;
                                                                                            case 1145:
                                                                                                this.LJIIIZ.mMaxAliveHostNum = i2;
                                                                                                break;
                                                                                            case 1146:
                                                                                                this.LJIIIZ.mFileExtendSizeKB = i2;
                                                                                                break;
                                                                                            case 1147:
                                                                                                this.LJIIIZ.mMinAllowSpeed = i2;
                                                                                                break;
                                                                                            case 1148:
                                                                                                this.LJIIIZ.mNetSchedulerBlockHostIpErrCount = i2;
                                                                                                break;
                                                                                            case 1150:
                                                                                                this.LJIIIZ.mEnableIOManager = i2;
                                                                                                break;
                                                                                            case 1151:
                                                                                                this.LJIIIZ.mEnableOwnVDPPreloadNotify = i2;
                                                                                                break;
                                                                                            case 1154:
                                                                                                this.LJJJ = i2;
                                                                                                break;
                                                                                            case 1156:
                                                                                                if (i2 > 0) {
                                                                                                    this.LJJJJL.LIZ = i2;
                                                                                                }
                                                                                                break;
                                                                                            case 1157:
                                                                                                if (i2 > 0) {
                                                                                                    this.LJJJJL.LIZIZ = i2;
                                                                                                }
                                                                                                break;
                                                                                            case 1158:
                                                                                                this.LJIIIZ.mMaxFileMemCacheSize = i2;
                                                                                                break;
                                                                                            case 1159:
                                                                                                this.LJIIIZ.mMaxFileMemCacheNum = i2;
                                                                                                break;
                                                                                            case 1160:
                                                                                                if (i2 >= 0) {
                                                                                                    this.LJIIIZ.mEnableEarlyData = i2;
                                                                                                }
                                                                                                break;
                                                                                            case 1161:
                                                                                                if (i2 > 0) {
                                                                                                    this.LJIIIZ.mSocketRecvBufferSize = i2;
                                                                                                }
                                                                                                break;
                                                                                            case 1162:
                                                                                                if (i2 > 0) {
                                                                                                    this.LJIIIZ.mEnableSpeedPredict = i2;
                                                                                                }
                                                                                                break;
                                                                                            case 1163:
                                                                                                this.LJJJI = i2;
                                                                                                break;
                                                                                            case 1164:
                                                                                                this.LJIIIZ.mEnableUseOriginalUrl = i2;
                                                                                                break;
                                                                                            case 1166:
                                                                                                this.LJIIIZ.mEnableLoaderLogExtractUrls = i2;
                                                                                                break;
                                                                                            case 1167:
                                                                                                this.LJIIIZ.mMaxLoaderLogNum = i2;
                                                                                                break;
                                                                                            case 1168:
                                                                                                this.LJIIIZ.mCheckContentTypeMethod = i2;
                                                                                                break;
                                                                                            case 1169:
                                                                                                this.LJIIIZ.mCloseThreadPool = i2;
                                                                                                break;
                                                                                            case 1170:
                                                                                                this.LJJJIL = i2;
                                                                                                break;
                                                                                            case 1171:
                                                                                                if (i2 > 0) {
                                                                                                    this.LJIIIZ.mEnableSpeedEngine = i2;
                                                                                                }
                                                                                                break;
                                                                                            case 1172:
                                                                                                if (i2 > 0) {
                                                                                                    this.LJIIIZ.mEnableSpeedReport = i2;
                                                                                                }
                                                                                                break;
                                                                                            case 1503:
                                                                                                this.LJJJJIZL = i2;
                                                                                                break;
                                                                                            case 1504:
                                                                                                this.LJJJJJ = i2;
                                                                                                break;
                                                                                            case 1505:
                                                                                                this.LJJJJ = i2;
                                                                                                break;
                                                                                            case 1513:
                                                                                                this.LJJJJI = i2;
                                                                                                break;
                                                                                            case 1514:
                                                                                                this.LJIIIZ.mGetCookieTokenLevel = i2;
                                                                                                break;
                                                                                            case 1601:
                                                                                                this.LJIIIZ.mZeroRatingStatus = i2;
                                                                                                AVMDLDataLoader aVMDLDataLoader2 = this.LJIIIIZZ;
                                                                                                if (aVMDLDataLoader2 != null) {
                                                                                                    aVMDLDataLoader2.setIntValue(6601, i2);
                                                                                                }
                                                                                                break;
                                                                                            case 1701:
                                                                                                this.LJIIIZ.mEnableByteMediaNetLoader = i2;
                                                                                                break;
                                                                                            case 1702:
                                                                                                this.LJIIIZ.mEnableJavaThreadMerge = i2;
                                                                                                break;
                                                                                            case 1705:
                                                                                                this.LJIIIZ.mNewUserOptVer = i2;
                                                                                                break;
                                                                                            case 2000:
                                                                                                this.LJIIIZ.mEnableStorageModule = i2;
                                                                                                break;
                                                                                            case 2001:
                                                                                                this.LJIIIZ.mStoPlayDldWinSizeKBNM = i2;
                                                                                                break;
                                                                                            case 2002:
                                                                                                this.LJIIIZ.mStoPlayDldWinSizeKBLS = i2;
                                                                                                break;
                                                                                            case 2003:
                                                                                                this.LJIIIZ.mStoRingBufferSizeKB = i2;
                                                                                                break;
                                                                                            case 2004:
                                                                                                this.LJIIIZ.mStoIoWriteLimitKBTh1 = i2;
                                                                                                break;
                                                                                            case 2005:
                                                                                                this.LJIIIZ.mStoIoWriteLimitKBTh2 = i2;
                                                                                                break;
                                                                                            case 2006:
                                                                                                this.LJIIIZ.mStoMaxIdleTimeSec = i2;
                                                                                                break;
                                                                                            case 2008:
                                                                                                if (i2 >= 0) {
                                                                                                    this.LJIIIZ.mThreadStackSizeLevel = i2;
                                                                                                }
                                                                                                break;
                                                                                            case 2009:
                                                                                                if (i2 > 0) {
                                                                                                    this.LJIIIZ.mThreadPoolMinCount = i2;
                                                                                                }
                                                                                                break;
                                                                                            case 2010:
                                                                                                if (i2 > 0) {
                                                                                                    this.LJIIIZ.mEnableThreadPoolCheckIdle = i2;
                                                                                                }
                                                                                                break;
                                                                                            case 2011:
                                                                                                if (i2 > 0) {
                                                                                                    this.LJIIIZ.mThreadPoolTTLSecond = i2;
                                                                                                }
                                                                                                break;
                                                                                            case 2012:
                                                                                                if (i2 > 0) {
                                                                                                    this.LJIIIZ.mMaxIpNum = i2;
                                                                                                }
                                                                                                break;
                                                                                            case 2013:
                                                                                                this.LJIIIZ.mNonBlockRangeMode = i2;
                                                                                                break;
                                                                                            case 2014:
                                                                                                this.LJIIIZ.mNonBlockRangeMaxSizeKB = i2;
                                                                                                break;
                                                                                            case 2015:
                                                                                                if (i2 >= 0) {
                                                                                                    this.LJIIIZ.mNetUnreachableStopRetry = i2;
                                                                                                }
                                                                                                break;
                                                                                            case 2016:
                                                                                                if (i2 >= 0) {
                                                                                                    this.LJIIIZ.mEnableWaitNetReachable = i2;
                                                                                                }
                                                                                                break;
                                                                                            case 2017:
                                                                                                this.LJIIIZ.mEnableFileMutexOptimize = i2;
                                                                                                break;
                                                                                            case 2018:
                                                                                                if (i2 > 0) {
                                                                                                    this.LJIIIZ.mSkipCDNBeforeExpiredSec = i2;
                                                                                                }
                                                                                                break;
                                                                                            case 2019:
                                                                                                if (i2 > 0) {
                                                                                                    this.LJIIIZ.mNetUnreachableTimeout = i2;
                                                                                                }
                                                                                                break;
                                                                                            case 2020:
                                                                                            case 2021:
                                                                                                if (i2 >= 1 && i2 <= 32) {
                                                                                                    if (!TextUtils.isEmpty(this.LJIIIZ.mP2PCostTag)) {
                                                                                                        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                                                                                                        AVMDLDataLoaderConfigure aVMDLDataLoaderConfigure3 = this.LJIIIZ;
                                                                                                        sbLIZ3.append(aVMDLDataLoaderConfigure3.mP2PCostTag);
                                                                                                        sbLIZ3.append(',');
                                                                                                        sbLIZ3.append(Integer.toString(i2));
                                                                                                        aVMDLDataLoaderConfigure3.mP2PCostTag = C2188811AlT.LIZIZ(sbLIZ3);
                                                                                                    } else {
                                                                                                        this.LJIIIZ.mP2PCostTag = Integer.toString(i2);
                                                                                                    }
                                                                                                    StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                                                                                                    sbLIZ4.append("cur p2p cost tag is: ");
                                                                                                    sbLIZ4.append(this.LJIIIZ.mP2PCostTag);
                                                                                                    TTVideoEngineLog.d("DataLoaderHelper", C2188811AlT.LIZIZ(sbLIZ4));
                                                                                                }
                                                                                                break;
                                                                                            case 2022:
                                                                                                if (i2 > 0) {
                                                                                                    this.LJIIIZ.mIgnoreTextSpeedTest = i2;
                                                                                                }
                                                                                                break;
                                                                                            case 2023:
                                                                                                if (i2 > 0) {
                                                                                                    this.LJIIIZ.mEnableOptimizeRange = i2;
                                                                                                }
                                                                                                break;
                                                                                            case 2024:
                                                                                                if (i2 > 0) {
                                                                                                    this.LJIIIZ.mDownLogMaxSize = i2;
                                                                                                }
                                                                                                break;
                                                                                            case 2025:
                                                                                                this.LJIIIZ.mCheckCacheDir = i2;
                                                                                                break;
                                                                                            case 2026:
                                                                                                this.LJIIIZ.mEnableUseGroupId = i2;
                                                                                                break;
                                                                                            case 2027:
                                                                                                this.LJIIIZ.mDisableRecentCache = i2;
                                                                                                break;
                                                                                            case 2028:
                                                                                                this.LJIIIZ.mUpdateCacheFileInternal = i2;
                                                                                                break;
                                                                                            case 2031:
                                                                                                this.LJIIIZ.mEnableMissReason = i2;
                                                                                                break;
                                                                                            case 2032:
                                                                                                this.LJIIIZ.mPreloadInfoRecordMaxCnt = i2;
                                                                                                break;
                                                                                            case 2033:
                                                                                                this.LJIIIZ.mEnableTraceIdPreloadLog = i2;
                                                                                                break;
                                                                                            case 2034:
                                                                                                this.LJIIIZ.mSessionCacheInterval = i2;
                                                                                                break;
                                                                                            case 2035:
                                                                                                this.LJIIIZ.mFileManagerInterval = i2;
                                                                                                break;
                                                                                            case 2036:
                                                                                                this.LJIIIZ.mEnableEnginePortrait = i2;
                                                                                                break;
                                                                                            case 2038:
                                                                                                StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                                                                                                sbLIZ5.append("set sto_sensitive_user ");
                                                                                                sbLIZ5.append(i2);
                                                                                                C1471660oOq.LIZJ("DataLoaderHelper", C2188811AlT.LIZIZ(sbLIZ5));
                                                                                                this.LJIIIZ.mStoSensitiveUser = i2;
                                                                                                AVMDLDataLoader aVMDLDataLoader3 = this.LJIIIIZZ;
                                                                                                if (aVMDLDataLoader3 != null && i2 > 0) {
                                                                                                    aVMDLDataLoader3.setIntValue(7453, i2);
                                                                                                }
                                                                                                break;
                                                                                            case 2039:
                                                                                                AVMDLDataLoader aVMDLDataLoader4 = this.LJIIIIZZ;
                                                                                                if (aVMDLDataLoader4 != null) {
                                                                                                    aVMDLDataLoader4.setIntValue(7454, i2);
                                                                                                }
                                                                                                break;
                                                                                            case 2040:
                                                                                                StringBuilder sbLIZ6 = C2188811AlT.LIZ();
                                                                                                sbLIZ6.append("set sto_level ");
                                                                                                sbLIZ6.append(i2);
                                                                                                C1471660oOq.LIZJ("DataLoaderHelper", C2188811AlT.LIZIZ(sbLIZ6));
                                                                                                this.LJIIIZ.mStoLevel = i2;
                                                                                                AVMDLDataLoader aVMDLDataLoader5 = this.LJIIIIZZ;
                                                                                                if (aVMDLDataLoader5 != null && i2 > 0) {
                                                                                                    aVMDLDataLoader5.setIntValue(7455, i2);
                                                                                                }
                                                                                                break;
                                                                                            case 2041:
                                                                                                this.LJIIIZ.mEnableDataLoaderLockOpt = i2;
                                                                                                break;
                                                                                            case 2042:
                                                                                                this.LJIIIZ.mPlayTaskNotWriteDisk = i2;
                                                                                                break;
                                                                                            case 2100:
                                                                                                if (i2 >= 0) {
                                                                                                    this.LJIIIZ.mEnableP2pUpload = i2;
                                                                                                }
                                                                                                break;
                                                                                            case 2102:
                                                                                                if (i2 >= 0) {
                                                                                                    this.LJIIIZ.mDevDiskSizeMB = i2;
                                                                                                }
                                                                                                break;
                                                                                            case 2104:
                                                                                                if (i2 >= 0) {
                                                                                                    this.LJIIIZ.mDevMemorySizeMB = i2;
                                                                                                }
                                                                                                break;
                                                                                            case 9001:
                                                                                                this.LJIIIZ.mIgnorePlayInfo = i2;
                                                                                                break;
                                                                                            case 9008:
                                                                                                this.LJJIJIL = i2;
                                                                                                break;
                                                                                            case 9013:
                                                                                                this.LJJJJLI = i2;
                                                                                                break;
                                                                                            case 9014:
                                                                                                if (i2 == 1 || i2 == 0) {
                                                                                                    this.LJIIIZ.mEnableMultiDownloadPath = i2;
                                                                                                }
                                                                                                break;
                                                                                            case 9016:
                                                                                                this.LJJJJLL = i2;
                                                                                                break;
                                                                                            case 9017:
                                                                                                this.LJJJJZI = i2;
                                                                                                break;
                                                                                            case 9018:
                                                                                                this.LJJJLIIL = i2;
                                                                                                break;
                                                                                            case 9019:
                                                                                                this.LJJJLL = i2;
                                                                                                break;
                                                                                            case 9021:
                                                                                                this.LJJJJZ = i2;
                                                                                                break;
                                                                                            case 9302:
                                                                                                if (i2 > 0) {
                                                                                                    this.LJIIIZ.mLoadPcdnInterval = i2;
                                                                                                }
                                                                                                break;
                                                                                            case 13000:
                                                                                                this.LJJLIIIJJI = i2;
                                                                                                break;
                                                                                            case 13001:
                                                                                                this.LJJLIIIJILLIZJL = i2;
                                                                                                break;
                                                                                            case 13002:
                                                                                                this.LJJLIIIJJIZ = i2;
                                                                                                break;
                                                                                            case 13003:
                                                                                                this.LJJLIIIJLJLI = i2;
                                                                                                break;
                                                                                            case 13004:
                                                                                                if (i2 == 1) {
                                                                                                    z = true;
                                                                                                }
                                                                                                this.LJJLIIIJLLLLLLLZ = z;
                                                                                                break;
                                                                                            case 13005:
                                                                                                this.LJIIIZ.mEnableCellularUp = i2;
                                                                                                break;
                                                                                            case 13006:
                                                                                                this.LJJLIIIJL = i2;
                                                                                                break;
                                                                                            case 13007:
                                                                                                this.LJIIIZ.mCellularUpAsyncDelay = i2;
                                                                                                break;
                                                                                            default:
                                                                                                switch (i) {
                                                                                                    case 103:
                                                                                                        AVMDLDNSParser.setIntValue(4, i2);
                                                                                                        break;
                                                                                                    case 104:
                                                                                                        AVMDLDNSParser.setIntValue(5, i2);
                                                                                                        break;
                                                                                                    case 105:
                                                                                                        AVMDLDNSParser.setIntValue(6, i2);
                                                                                                        break;
                                                                                                    case 106:
                                                                                                        AVMDLDNSParser.setIntValue(7, i2);
                                                                                                        break;
                                                                                                    default:
                                                                                                        switch (i) {
                                                                                                            case 500:
                                                                                                                this.LJIIIZ.mLiveP2pAllow = i2;
                                                                                                                break;
                                                                                                            case 501:
                                                                                                                this.LJIIIZ.mLiveLoaderType = i2;
                                                                                                                break;
                                                                                                            case 502:
                                                                                                                this.LJIIIZ.mLiveLoaderEnable = i2;
                                                                                                                break;
                                                                                                            default:
                                                                                                                switch (i) {
                                                                                                                    case 505:
                                                                                                                        this.LJIIIZ.mLiveWatchDurationThreshold = i2;
                                                                                                                        break;
                                                                                                                    case 506:
                                                                                                                        this.LJIIIZ.mLiveCacheThresholdHttpToP2p = i2;
                                                                                                                        break;
                                                                                                                    case 507:
                                                                                                                        this.LJIIIZ.mLiveCacheThresholdP2pToHttp = i2;
                                                                                                                        break;
                                                                                                                    case 508:
                                                                                                                        this.LJIIIZ.mLiveMaxTrySwitchP2pTimes = i2;
                                                                                                                        break;
                                                                                                                    case 509:
                                                                                                                        this.LJIIIZ.mLiveWaitP2pReadyThreshold = i2;
                                                                                                                        break;
                                                                                                                    case 510:
                                                                                                                        this.LJIIIZ.mLiveMobileUploadAllow = i2;
                                                                                                                        break;
                                                                                                                    case 511:
                                                                                                                        this.LJIIIZ.mLiveMobileDownloadAllow = i2;
                                                                                                                        break;
                                                                                                                    case 512:
                                                                                                                        this.LJIIIZ.mAlogEnable = i2;
                                                                                                                        AVMDLDataLoader aVMDLDataLoader6 = this.LJIIIIZZ;
                                                                                                                        if (aVMDLDataLoader6 != null) {
                                                                                                                            aVMDLDataLoader6.setIntValue(7225, i2);
                                                                                                                        }
                                                                                                                        break;
                                                                                                                    case 513:
                                                                                                                        this.LJIIIZ.mLiveRecvDataTimeout = i2;
                                                                                                                        break;
                                                                                                                    default:
                                                                                                                        switch (i) {
                                                                                                                            case LSPassThroughRecordSizeConfig.DEFAULT /* 1000 */:
                                                                                                                                if (this.LJJIFFI == 1) {
                                                                                                                                    LJJI();
                                                                                                                                }
                                                                                                                                AVMDLDataLoader aVMDLDataLoader7 = this.LJIIIIZZ;
                                                                                                                                if (aVMDLDataLoader7 != null) {
                                                                                                                                    aVMDLDataLoader7.setIntValue(7217, i2);
                                                                                                                                }
                                                                                                                                break;
                                                                                                                            case 1001:
                                                                                                                                this.LJIIIZ.mEnablePreconnect = i2;
                                                                                                                                break;
                                                                                                                            case 1002:
                                                                                                                                this.LJIIIZ.mPreconnectNum = i2;
                                                                                                                                break;
                                                                                                                            default:
                                                                                                                                switch (i) {
                                                                                                                                    case 1004:
                                                                                                                                        if (i2 != 0) {
                                                                                                                                            z = true;
                                                                                                                                        }
                                                                                                                                        this.LJIJJ = z;
                                                                                                                                        StringBuilder sbLIZ7 = C2188811AlT.LIZ();
                                                                                                                                        sbLIZ7.append("setIntValue: mInvalidMdlProcotol: ");
                                                                                                                                        sbLIZ7.append(this.LJIJJ);
                                                                                                                                        C1471660oOq.LIZJ("DataLoaderHelper", C2188811AlT.LIZIZ(sbLIZ7));
                                                                                                                                        break;
                                                                                                                                    case 1005:
                                                                                                                                        if (i2 == 1) {
                                                                                                                                            z = true;
                                                                                                                                        }
                                                                                                                                        this.LJIL = z;
                                                                                                                                        if (this.LJJIJIIJI) {
                                                                                                                                            this.LJIL = true;
                                                                                                                                        }
                                                                                                                                        StringBuilder sbLIZ8 = C2188811AlT.LIZ();
                                                                                                                                        sbLIZ8.append("config DATALOADER_KEY_SET_MDL_PROTOCOL_ENABLE: ");
                                                                                                                                        sbLIZ8.append(this.LJIL);
                                                                                                                                        C1471660oOq.LIZJ("DataLoaderHelper", C2188811AlT.LIZIZ(sbLIZ8));
                                                                                                                                        break;
                                                                                                                                    case 1006:
                                                                                                                                        this.LJIIIZ.mRingBufferSizeKB = i2;
                                                                                                                                        break;
                                                                                                                                    case 1007:
                                                                                                                                        this.LJIIIZ.mEnableFileCacheV2 = i2;
                                                                                                                                        break;
                                                                                                                                    default:
                                                                                                                                        switch (i) {
                                                                                                                                            case 1009:
                                                                                                                                                this.LJIIIZ.mEnableFileRingBuffer = i2;
                                                                                                                                                break;
                                                                                                                                            case 1010:
                                                                                                                                                this.LJIIIZ.mEnableUseFileExtendLoaderBuffer = i2;
                                                                                                                                                break;
                                                                                                                                            case 1011:
                                                                                                                                                this.LJJIFFI = i2;
                                                                                                                                                break;
                                                                                                                                            case 1012:
                                                                                                                                                this.LJJIJ = i2;
                                                                                                                                                break;
                                                                                                                                            case 1013:
                                                                                                                                                if (i2 == 1) {
                                                                                                                                                    z = true;
                                                                                                                                                }
                                                                                                                                                this.LJJIJIIJI = z;
                                                                                                                                                if (z) {
                                                                                                                                                    this.LJIL = true;
                                                                                                                                                    this.LJJIJIIJIL = true;
                                                                                                                                                }
                                                                                                                                                break;
                                                                                                                                            case 1014:
                                                                                                                                                if (i2 == 1) {
                                                                                                                                                    z = true;
                                                                                                                                                }
                                                                                                                                                this.LJJIJIIJIL = z;
                                                                                                                                                break;
                                                                                                                                            default:
                                                                                                                                                switch (i) {
                                                                                                                                                    case 1100:
                                                                                                                                                        break;
                                                                                                                                                    case 1101:
                                                                                                                                                        this.LJIIIZ.mEnableLoaderPreempt = i2;
                                                                                                                                                        break;
                                                                                                                                                    case 1102:
                                                                                                                                                        this.LJIIIZ.mAccessCheckLevel = i2;
                                                                                                                                                        break;
                                                                                                                                                    case 1103:
                                                                                                                                                        this.LJIIIZ.mNextDownloadThreshold = i2;
                                                                                                                                                        break;
                                                                                                                                                    case 1104:
                                                                                                                                                        AVMDLDataLoader aVMDLDataLoader8 = this.LJIIIIZZ;
                                                                                                                                                        if (aVMDLDataLoader8 != null) {
                                                                                                                                                            aVMDLDataLoader8.setIntValue(7219, i2);
                                                                                                                                                        }
                                                                                                                                                        break;
                                                                                                                                                    case 1105:
                                                                                                                                                        this.LJIIIZ.mSocketSendBufferKB = i2;
                                                                                                                                                        break;
                                                                                                                                                    default:
                                                                                                                                                        switch (i) {
                                                                                                                                                            case 1108:
                                                                                                                                                                this.LJIIIZ.mEnableSyncDnsForPcdn = i2;
                                                                                                                                                                break;
                                                                                                                                                            case 1109:
                                                                                                                                                                AVMDLDataLoader aVMDLDataLoader9 = this.LJIIIIZZ;
                                                                                                                                                                if (aVMDLDataLoader9 != null) {
                                                                                                                                                                    aVMDLDataLoader9.setIntValue(7227, i2);
                                                                                                                                                                }
                                                                                                                                                                break;
                                                                                                                                                            case 1110:
                                                                                                                                                                this.LJIIIZ.mXYLibValue = i2;
                                                                                                                                                                break;
                                                                                                                                                            case 1111:
                                                                                                                                                                this.LJIIIZ.mCheckPreloadLevel = i2;
                                                                                                                                                                break;
                                                                                                                                                            case 1112:
                                                                                                                                                                this.LJJIIJZLJL = i2;
                                                                                                                                                                break;
                                                                                                                                                            case 1113:
                                                                                                                                                                if (i2 != 0) {
                                                                                                                                                                    z = true;
                                                                                                                                                                }
                                                                                                                                                                this.LJJIIZ = z;
                                                                                                                                                                break;
                                                                                                                                                            default:
                                                                                                                                                                switch (i) {
                                                                                                                                                                    case 30:
                                                                                                                                                                        this.LJIIIZ.mEncryptVersion = i2;
                                                                                                                                                                        break;
                                                                                                                                                                    case 31:
                                                                                                                                                                        this.LJIIIZ.mEnableOkHttpLoader = i2;
                                                                                                                                                                        break;
                                                                                                                                                                    case 32:
                                                                                                                                                                        if (i2 > 0) {
                                                                                                                                                                            z = true;
                                                                                                                                                                        }
                                                                                                                                                                        this.LJJJJJL = z;
                                                                                                                                                                        break;
                                                                                                                                                                    case LiveToolbarIconStyleSetting.GRAY_WITHOUT_TEXT /* 33 */:
                                                                                                                                                                        if (i2 != 0) {
                                                                                                                                                                            z = true;
                                                                                                                                                                        }
                                                                                                                                                                        this.LJIILLIIL = z;
                                                                                                                                                                        break;
                                                                                                                                                                    case LiveToolbarIconStyleSetting.COLORFUL_WITHOUT_TEXT /* 34 */:
                                                                                                                                                                        this.LJIIIZ.mEnablePcdnAuto = i2;
                                                                                                                                                                        break;
                                                                                                                                                                    default:
                                                                                                                                                                        switch (i) {
                                                                                                                                                                            case 63:
                                                                                                                                                                                this.LJIIIZ.mMaxIpCountEachDomain = i2;
                                                                                                                                                                                break;
                                                                                                                                                                            case 64:
                                                                                                                                                                                this.LJIIIZ.mEnableIpBucket = i2;
                                                                                                                                                                                break;
                                                                                                                                                                            case 65:
                                                                                                                                                                                this.LJIIIZ.mErrorStateTrustTime = i2;
                                                                                                                                                                                break;
                                                                                                                                                                            case 66:
                                                                                                                                                                                this.LJIIIZ.mOnlyUseCdn = i2;
                                                                                                                                                                                break;
                                                                                                                                                                            default:
                                                                                                                                                                                switch (i) {
                                                                                                                                                                                    case 90:
                                                                                                                                                                                        this.LJIIIZ.mDNSMainType = i2;
                                                                                                                                                                                        AVMDLDNSParser.setIntValue(0, i2);
                                                                                                                                                                                        break;
                                                                                                                                                                                    case 91:
                                                                                                                                                                                        this.LJIIIZ.mDNSBackType = i2;
                                                                                                                                                                                        AVMDLDNSParser.setIntValue(1, i2);
                                                                                                                                                                                        break;
                                                                                                                                                                                    case 92:
                                                                                                                                                                                        this.LJIIIZ.mMainToBackUpDelayedTime = i2;
                                                                                                                                                                                        AVMDLDNSParser.setIntValue(3, i2);
                                                                                                                                                                                        break;
                                                                                                                                                                                    case 93:
                                                                                                                                                                                        this.LJIIIZ.mEnableBenchMarkIOSpeed = i2;
                                                                                                                                                                                        break;
                                                                                                                                                                                    case 94:
                                                                                                                                                                                        this.LJIIIZ.mSpeedCoefficientValue = i2;
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
                                                                                                                break;
                                                                                                        }
                                                                                                        break;
                                                                                                }
                                                                                                break;
                                                                                        }
                                                                                    } else {
                                                                                        this.LJIIIZ.mGlobalSpeedSampleInterval = i2;
                                                                                        AVMDLDataLoader aVMDLDataLoader10 = this.LJIIIIZZ;
                                                                                        if (aVMDLDataLoader10 != null) {
                                                                                            aVMDLDataLoader10.setIntValue(7370, i2);
                                                                                        }
                                                                                        break;
                                                                                    }
                                                                                } else {
                                                                                    this.LJIIIZ.mSpeedSampleInterval = i2;
                                                                                    break;
                                                                                }
                                                                                break;
                                                                        }
                                                                    } else {
                                                                        this.LJIIIZ.mEnableSessionReuse = i2;
                                                                    }
                                                                } else {
                                                                    this.LJIIIZ.mMaxTlsVersion = i2;
                                                                }
                                                            } else {
                                                                this.LJJI = i2;
                                                            }
                                                        } else {
                                                            this.LJIIIZ.mEnablePreloadReUse = i2;
                                                        }
                                                    } else {
                                                        this.LJIIIZ.mEnableMaxCacheAgeForAllDir = i2;
                                                    }
                                                } else {
                                                    this.LJIIIZ.mMaxCacheAge = i2;
                                                }
                                            } else {
                                                this.LJIIIZ.mSocketIdleTimeOut = i2;
                                            }
                                        } else {
                                            this.LJIIIZ.mEnableSocketReuse = i2;
                                        }
                                    } else {
                                        this.LJIIIZ.mEnableExternDNS = i2;
                                    }
                                } else {
                                    this.LJIIIZ.mLoaderType = i2;
                                }
                            } else {
                                this.LJIIIZ.mTryCount = i2;
                            }
                        } else {
                            this.LJIIIZ.mOpenTimeOut = i2;
                        }
                    } else {
                        this.LJIIIZ.mRWTimeOut = i2;
                    }
                } else {
                    this.LJIIIZ.mMaxCacheSize = i2;
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                C786410Ut5.v3();
            }
            this.LJJ.LJFF(1);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            this.LJJ.LJFF(1);
            throw th;
        }
    }

    public final C1475070oUL LJIJJ(String str, TimeUnit timeUnit, long j) {
        C1475880oVe c1475880oVeLJIIL;
        if (C1474810oTv.LJJIFFI()) {
            this.LJLJJI.getClass();
            C1475880oVe c1475880oVeLIZLLL = C1475910oVh.LIZLLL(str, j, timeUnit, this);
            if (c1475880oVeLIZLLL == null) {
                return null;
            }
            C1475070oUL c1475070oUL = new C1475070oUL();
            c1475070oUL.LIZ = c1475880oVeLIZLLL.LIZ;
            c1475070oUL.LIZIZ = c1475880oVeLIZLLL.LIZIZ;
            return c1475070oUL;
        }
        if (C1474810oTv.LJJIFFI()) {
            this.LJLJJI.getClass();
            c1475880oVeLJIIL = C1475910oVh.LIZLLL(str, j, timeUnit, this);
        } else {
            if (!TextUtils.isEmpty(str)) {
                try {
                    int i = C2187451AjH.LIZ;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("****try get cacheinfo lock timeout");
                    sbLIZ.append(j);
                    TTVideoEngineLog.d("DataLoaderHelper", C2188811AlT.LIZIZ(sbLIZ));
                    if (this.LJJ.LJ(j, timeUnit)) {
                        TTVideoEngineLog.d("DataLoaderHelper", "####get cacheinfo lock suc");
                        try {
                        } catch (Throwable th) {
                            th = th;
                            c1475880oVeLJIIL = null;
                        }
                        if (this.LJIIIIZZ != null && this.LIZIZ == 0) {
                            c1475880oVeLJIIL = LJIIL(this.LJIIIIZZ.getStringCacheInfo(str));
                            try {
                                TTVideoEngineLog.d("DataLoaderHelper", "get cacheinfo native end");
                            } catch (Throwable th2) {
                                th = th2;
                                try {
                                    try {
                                        TryCatchGuardChecker.doCheck(th);
                                        int i2 = C2187451AjH.LIZ;
                                        TTVideoEngineLog.d(th);
                                    } catch (InterruptedException e) {
                                        e = e;
                                        TryCatchGuardChecker.doCheck(e);
                                        int i3 = C2187451AjH.LIZ;
                                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                                        sbLIZ2.append("get cacheinfo interrupt exception:");
                                        sbLIZ2.append(e.getLocalizedMessage());
                                        TTVideoEngineLog.d("DataLoaderHelper", C2188811AlT.LIZIZ(sbLIZ2));
                                    }
                                } catch (Throwable th3) {
                                    TryCatchGuardChecker.doCheck(th3);
                                    this.LJJ.LJFF(1);
                                    throw th3;
                                }
                            }
                            this.LJJ.LJFF(1);
                        } else {
                            TTVideoEngineLog.d("DataLoaderHelper", "get cacheinfo fail mdl not start");
                            this.LJJ.LJFF(1);
                            return null;
                        }
                    } else {
                        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                        sbLIZ3.append("####not get cacheinfo lock timeout");
                        sbLIZ3.append(j);
                        TTVideoEngineLog.d("DataLoaderHelper", C2188811AlT.LIZIZ(sbLIZ3));
                        c1475880oVeLJIIL = null;
                    }
                } catch (InterruptedException e2) {
                    e = e2;
                    c1475880oVeLJIIL = null;
                }
                TTVideoEngineLog.d("DataLoaderHelper", "get cacheinfo all end");
            }
            return null;
        }
        if (c1475880oVeLJIIL != null) {
            C1475070oUL c1475070oUL2 = new C1475070oUL();
            c1475070oUL2.LIZ = c1475880oVeLJIIL.LIZ;
            c1475070oUL2.LIZIZ = c1475880oVeLJIIL.LIZIZ;
            return c1475070oUL2;
        }
        return null;
    }

    /* JADX WARN: Finally extract failed */
    public final void LJJIJLIJ(long j, String str, String str2) {
        if (C1474810oTv.LJJIFFI()) {
            getClass();
            this.LJJ.LIZJ(2);
            try {
                if (this.LJIIIIZZ == null) {
                    if (this.LJJLIIIJ != null) {
                        int i = C2187451AjH.LIZ;
                        C1471660oOq.LIZJ("DataLoaderHelper", C786410Ut5.j4("cache feed dns record, host:%s, ipList:%s, fetchTime:%d", new Object[]{str, str2, Long.valueOf(j)}));
                        ((ConcurrentHashMap) this.LJJLIIIJ).put(str, new C1476300oWK(str, str2, j));
                    }
                } else {
                    int i2 = C2187451AjH.LIZ;
                    C1471660oOq.LIZJ("DataLoaderHelper", C786410Ut5.j4("update feed dns info, host:%s, ipList:%s, fetchTime:%d", new Object[]{str, str2, Long.valueOf(j)}));
                    AVMDLDNSParser.updateFeedDNSInfo(str, str2, j);
                }
            } finally {
                try {
                } catch (Throwable th) {
                }
            }
            this.LJJ.LJFF(2);
            return;
        }
        this.LJJ.LIZJ(2);
        try {
            if (this.LJIIIIZZ == null) {
                if (this.LJJLIIIJ != null) {
                    int i3 = C2187451AjH.LIZ;
                    C1471660oOq.LIZJ("DataLoaderHelper", C786410Ut5.j4("cache feed dns record, host:%s, ipList:%s, fetchTime:%d", new Object[]{str, str2, Long.valueOf(j)}));
                    ((ConcurrentHashMap) this.LJJLIIIJ).put(str, new C1476300oWK(str, str2, j));
                }
            } else {
                int i4 = C2187451AjH.LIZ;
                C1471660oOq.LIZJ("DataLoaderHelper", C786410Ut5.j4("update feed dns info, host:%s, ipList:%s, fetchTime:%d", new Object[]{str, str2, Long.valueOf(j)}));
                AVMDLDNSParser.updateFeedDNSInfo(str, str2, j);
            }
        } finally {
            try {
                TryCatchGuardChecker.doCheck(th);
            } catch (Throwable th2) {
                TryCatchGuardChecker.doCheck(th2);
                this.LJJ.LJFF(2);
            }
        }
        this.LJJ.LJFF(2);
    }

    public final void LJJJJLI(int i, long j, String str) {
        if (C1474810oTv.LJJIFFI()) {
            this.LJLILLLLZI.getClass();
            C1471140oO0.LIZ(i, str, j, this);
            return;
        }
        if (this.LIZIZ != 0) {
            int i2 = C2187451AjH.LIZ;
            TTVideoEngineLog.d("DataLoaderHelper", "dataloader not started, not allow set play info");
        } else {
            if (this.LJJJI <= 0) {
                return;
            }
            this.LJJ.LIZJ(1);
            C1476180oW8 c1476180oW8 = this.LJJJJL;
            if (c1476180oW8.LIZ > 0 && c1476180oW8.LIZIZ > 0) {
                c1476180oW8.LIZJ(i, j, str);
            }
            this.LJJ.LJFF(1);
        }
    }

    @Override // com.ss.mediakit.medialoader.AVMDLDataLoaderListener
    public final String getStringValue(int i, long j, String str) {
        C1471550oOf c1471550oOfLJ;
        C1475600oVC c1475600oVC;
        InterfaceC1475620oVE interfaceC1475620oVE;
        String strLJJLL;
        HashMap<String, String> mapLJII;
        C1471550oOf c1471550oOfLJ2;
        C1475600oVC c1475600oVC2;
        InterfaceC1475620oVE interfaceC1475620oVE2;
        String strLJJLL2;
        HashMap<String, String> mapLJII2;
        String str2 = str;
        String strLIZIZ = null;
        if (C1474810oTv.LJJIFFI()) {
            getClass();
            int i2 = C2187451AjH.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("[preload] getStringValue, key = ");
            sbLIZ.append(str2);
            C1471660oOq.LIZJ("DataLoaderHelper", C2188811AlT.LIZIZ(sbLIZ));
            if (i != 1506) {
                if (i == 1509 && this.LIZ != null && !TextUtils.isEmpty(str2) && (mapLJII2 = this.LIZ.LJII(str2)) != null && mapLJII2.size() != 0) {
                    StringBuilder sb = new StringBuilder();
                    for (String str3 : mapLJII2.keySet()) {
                        if (!TextUtils.isEmpty(str3) && !TextUtils.isEmpty(mapLJII2.get(str3))) {
                            sb.append(str3);
                            sb.append(": ");
                            sb.append(mapLJII2.get(str3));
                            sb.append("\r\n");
                        }
                    }
                    int i3 = C2187451AjH.LIZ;
                    C1471660oOq.LIZJ("DataLoaderHelper", C786410Ut5.j4("[customheader] get custom header:%s url: %s", new Object[]{str2, sb.toString()}));
                    return sb.toString();
                }
            } else {
                C1476330oWN c1476330oWN = this.LJ;
                if (c1476330oWN != null) {
                    c1471550oOfLJ2 = c1476330oWN.LJ(str2);
                } else {
                    c1471550oOfLJ2 = null;
                }
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("[preload] getStringValue, key = ");
                sbLIZ2.append(str2);
                C1471660oOq.LIZJ("DataLoaderHelper", C2188811AlT.LIZIZ(sbLIZ2));
                if (c1471550oOfLJ2 != null && (c1475600oVC2 = c1471550oOfLJ2.LJIIJ) != null && (interfaceC1475620oVE2 = c1475600oVC2.LJIIIZ) != null) {
                    String strLIZ = ((C1475160oUU) interfaceC1475620oVE2).LIZ();
                    String[] strArrLIZJ = ((C1475160oUU) c1471550oOfLJ2.LJIIJ.LJIIIZ).LIZJ();
                    C1476320oWM c1476320oWMLIZLLL = c1471550oOfLJ2.LIZLLL(str2);
                    long jLIZIZ = ((C1475160oUU) c1471550oOfLJ2.LJIIJ.LJIIIZ).LIZIZ();
                    C1475160oUU c1475160oUU = (C1475160oUU) c1471550oOfLJ2.LJIIJ.LJIIIZ;
                    C1475410oUt c1475410oUt = c1475160oUU.LJI;
                    if (c1475410oUt != null && c1475410oUt.LIZIZ != -1) {
                        strLJJLL2 = c1475410oUt.LIZJ;
                    } else {
                        strLJJLL2 = c1475160oUU.LJIIIIZZ.LIZ.LJJLL(c1475160oUU.LJII.LIZ);
                    }
                    if (c1471550oOfLJ2.LJIIL != null) {
                        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                        sbLIZ3.append("tag=");
                        sbLIZ3.append(C795730VJj.LJFF(c1471550oOfLJ2.LJIIL));
                        strLIZIZ = C2188811AlT.LIZIZ(sbLIZ3);
                    }
                    String strLJJJJ = LJJJJ(strLIZ, strLIZ, c1476320oWMLIZLLL.LJIIIIZZ, jLIZIZ, strArrLIZJ, strLJJLL2, strLIZIZ, false, null, c1471550oOfLJ2.LJIILL);
                    if (!TextUtils.isEmpty(strLIZ)) {
                        str2 = strLIZ;
                    }
                    c1476320oWMLIZLLL.LIZ = str2;
                    C1471660oOq.LIZJ("DataLoaderHelper", C786410Ut5.j4("[preload] get proxxy url from url: %s", new Object[]{strLJJJJ}));
                    return strLJJJJ;
                }
            }
            return null;
        }
        int i4 = C2187451AjH.LIZ;
        StringBuilder sbLIZ4 = C2188811AlT.LIZ();
        sbLIZ4.append("[preload] getStringValue, key = ");
        sbLIZ4.append(str2);
        C1471660oOq.LIZJ("DataLoaderHelper", C2188811AlT.LIZIZ(sbLIZ4));
        if (i != 1506) {
            if (i != 1509 || this.LIZ == null || TextUtils.isEmpty(str2) || (mapLJII = this.LIZ.LJII(str2)) == null || mapLJII.size() == 0) {
                return null;
            }
            StringBuilder sb2 = new StringBuilder();
            for (String str4 : mapLJII.keySet()) {
                if (!TextUtils.isEmpty(str4) && !TextUtils.isEmpty(mapLJII.get(str4))) {
                    sb2.append(str4);
                    sb2.append(": ");
                    sb2.append(mapLJII.get(str4));
                    sb2.append("\r\n");
                }
            }
            int i5 = C2187451AjH.LIZ;
            C1471660oOq.LIZJ("DataLoaderHelper", C786410Ut5.j4("[customheader] get custom header:%s url: %s", new Object[]{str2, sb2.toString()}));
            return sb2.toString();
        }
        C1476330oWN c1476330oWN2 = this.LJ;
        if (c1476330oWN2 != null) {
            c1471550oOfLJ = c1476330oWN2.LJ(str2);
        } else {
            c1471550oOfLJ = null;
        }
        StringBuilder sbLIZ5 = C2188811AlT.LIZ();
        sbLIZ5.append("[preload] getStringValue, key = ");
        sbLIZ5.append(str2);
        C1471660oOq.LIZJ("DataLoaderHelper", C2188811AlT.LIZIZ(sbLIZ5));
        if (c1471550oOfLJ != null && (c1475600oVC = c1471550oOfLJ.LJIIJ) != null && (interfaceC1475620oVE = c1475600oVC.LJIIIZ) != null) {
            String strLIZ2 = ((C1475160oUU) interfaceC1475620oVE).LIZ();
            String[] strArrLIZJ2 = ((C1475160oUU) c1471550oOfLJ.LJIIJ.LJIIIZ).LIZJ();
            C1476320oWM c1476320oWMLIZLLL2 = c1471550oOfLJ.LIZLLL(str2);
            long jLIZIZ2 = ((C1475160oUU) c1471550oOfLJ.LJIIJ.LJIIIZ).LIZIZ();
            C1475160oUU c1475160oUU2 = (C1475160oUU) c1471550oOfLJ.LJIIJ.LJIIIZ;
            C1475410oUt c1475410oUt2 = c1475160oUU2.LJI;
            if (c1475410oUt2 != null && c1475410oUt2.LIZIZ != -1) {
                strLJJLL = c1475410oUt2.LIZJ;
            } else {
                strLJJLL = c1475160oUU2.LJIIIIZZ.LIZ.LJJLL(c1475160oUU2.LJII.LIZ);
            }
            if (c1471550oOfLJ.LJIIL != null) {
                StringBuilder sbLIZ6 = C2188811AlT.LIZ();
                sbLIZ6.append("tag=");
                sbLIZ6.append(C795730VJj.LJFF(c1471550oOfLJ.LJIIL));
                strLIZIZ = C2188811AlT.LIZIZ(sbLIZ6);
            }
            String strLJJJJ2 = LJJJJ(strLIZ2, strLIZ2, c1476320oWMLIZLLL2.LJIIIIZZ, jLIZIZ2, strArrLIZJ2, strLJJLL, strLIZIZ, false, null, c1471550oOfLJ.LJIILL);
            if (!TextUtils.isEmpty(strLIZ2)) {
                str2 = strLIZ2;
            }
            c1476320oWMLIZLLL2.LIZ = str2;
            C1471660oOq.LIZJ("DataLoaderHelper", C786410Ut5.j4("[preload] get proxxy url from url: %s", new Object[]{strLJJJJ2}));
            return strLJJJJ2;
        }
        return null;
    }

    public final void LIZIZ(String str, String str2, long j, C1476190oW9 c1476190oW9, C1475600oVC c1475600oVC) {
        String str3;
        EnumC2281151EQn enumC2281151EQn;
        if (TextUtils.isEmpty(str)) {
            int i = C2187451AjH.LIZ;
            C1471660oOq.LIZIZ("DataLoaderHelper", "[preload] key invalid.");
            return;
        }
        if (this.LJIIIIZZ != null && this.LIZIZ == 0) {
            if (!LIZIZ(str) && !LIZIZ(str)) {
                if (TTVideoEngineLog.d()) {
                    int i2 = C2187451AjH.LIZ;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("[preload] _addTask key=");
                    sbLIZ.append(str);
                    sbLIZ.append(", videoId=");
                    sbLIZ.append(str2);
                    sbLIZ.append(", preloadSize=");
                    sbLIZ.append(j);
                    sbLIZ.append(", vidItem=");
                    sbLIZ.append((Object) null);
                    sbLIZ.append(", videoModelItem=");
                    sbLIZ.append(c1476190oW9);
                    sbLIZ.append(", urlItem=");
                    sbLIZ.append(c1475600oVC);
                    TTVideoEngineLog.d("DataLoaderHelper", C2188811AlT.LIZIZ(sbLIZ));
                }
                EnumC2281151EQn enumC2281151EQn2 = EnumC2281151EQn.Undefine;
                if (c1476190oW9 != null && (enumC2281151EQn = c1476190oW9.LIZIZ) != null) {
                    enumC2281151EQn2 = enumC2281151EQn;
                }
                int i3 = -1;
                String str4 = "unknown";
                if (c1475600oVC != null) {
                    if (!TextUtils.isEmpty(c1475600oVC.LIZLLL)) {
                        str4 = c1475600oVC.LIZLLL;
                    }
                    str3 = "";
                    if (TextUtils.isEmpty("")) {
                        str3 = null;
                    }
                } else if (c1476190oW9 != null) {
                    if (!TextUtils.isEmpty(c1476190oW9.LJI)) {
                        str4 = c1476190oW9.LJI;
                    }
                    if (!TextUtils.isEmpty(c1476190oW9.LJII)) {
                        str3 = c1476190oW9.LJII;
                    } else {
                        str3 = null;
                    }
                    int i4 = c1476190oW9.LJIIIIZZ;
                    if (i4 != -1) {
                        i3 = i4;
                    }
                } else {
                    str4 = null;
                    str3 = null;
                }
                C1471550oOf c1471550oOf = new C1471550oOf();
                c1471550oOf.LJ(str, enumC2281151EQn2, j);
                c1471550oOf.LIZ = str2;
                c1471550oOf.LJI = null;
                c1471550oOf.LJIIIZ = c1476190oW9;
                c1471550oOf.LJIIJ = c1475600oVC;
                c1471550oOf.LJIIL = str4;
                c1471550oOf.LJIILIIL = str3;
                c1471550oOf.LJIILJJIL = i3;
                if (c1475600oVC != null) {
                    c1471550oOf.LIZLLL = c1475600oVC.LJI;
                    c1471550oOf.LJIIIIZZ = c1475600oVC.LJ;
                    c1471550oOf.LJIILL = c1475600oVC.LJII;
                }
                if (c1476190oW9 != null) {
                    c1471550oOf.LIZIZ = c1476190oW9.LIZ;
                    c1471550oOf.LIZLLL = 0;
                    c1471550oOf.LJIIIIZZ = c1476190oW9.LJIIIZ;
                }
                if (LIZLLL(c1471550oOf)) {
                    LJIILJJIL();
                    return;
                } else {
                    c1471550oOf.LIZ(-1002);
                    return;
                }
            }
            int i5 = C2187451AjH.LIZ;
            TTVideoEngineLog.d("DataLoaderHelper", "[preload] add the same key task.");
            return;
        }
        int i6 = C2187451AjH.LIZ;
        C1471660oOq.LIZIZ("DataLoaderHelper", "[preload] need load mdl first.");
    }

    public final String LJJIFFI(String str, String str2, String[] strArr, int i, String str3) {
        if (!TextUtils.isEmpty(str) && strArr != null && strArr.length >= 1) {
            return LJJJI(str, str2, 0L, 0L, strArr, str3, null, 0, null, false, null, i, "", -1, 0);
        }
        return null;
    }

    public final String LJJJJI(int i, int i2, String str, String str2, String str3) {
        if (C1474810oTv.LJJIFFI()) {
            getClass();
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            String strLJFF = C795730VJj.LJFF(str);
            if (TextUtils.isEmpty(strLJFF)) {
                return null;
            }
            if (TextUtils.isEmpty(str2)) {
                str2 = str;
            }
            String strLJFF2 = C795730VJj.LJFF(str2);
            if (!TextUtils.isEmpty(strLJFF2)) {
                str = strLJFF2;
            }
            StringBuffer stringBuffer = new StringBuffer("?rk=");
            stringBuffer.append(str);
            stringBuffer.append("&k=");
            stringBuffer.append(strLJFF);
            stringBuffer.append("&pv=1");
            if (!TextUtils.isEmpty(str3)) {
                stringBuffer.append("&gid=");
                stringBuffer.append(str3);
            }
            if (i > 0) {
                stringBuffer.append("&l=");
                stringBuffer.append(i);
            }
            if (i2 > 0) {
                stringBuffer.append("&ts=");
                stringBuffer.append(i2);
            }
            return stringBuffer.toString();
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        String strLJFF3 = C795730VJj.LJFF(str);
        if (TextUtils.isEmpty(strLJFF3)) {
            return null;
        }
        if (TextUtils.isEmpty(str2)) {
            str2 = str;
        }
        String strLJFF4 = C795730VJj.LJFF(str2);
        if (!TextUtils.isEmpty(strLJFF4)) {
            str = strLJFF4;
        }
        StringBuffer stringBuffer2 = new StringBuffer("?rk=");
        stringBuffer2.append(str);
        stringBuffer2.append("&k=");
        stringBuffer2.append(strLJFF3);
        stringBuffer2.append("&pv=1");
        if (!TextUtils.isEmpty(str3)) {
            stringBuffer2.append("&gid=");
            stringBuffer2.append(str3);
        }
        if (i > 0) {
            stringBuffer2.append("&l=");
            stringBuffer2.append(i);
        }
        if (i2 > 0) {
            stringBuffer2.append("&ts=");
            stringBuffer2.append(i2);
        }
        return stringBuffer2.toString();
    }

    public final String LJJJJ(String str, String str2, long j, long j2, String[] strArr, String str3, String str4, boolean z, String str5, int i) {
        return LJJJI(str, str2, j, j2, strArr, str3, str4, 0, null, z, str5, 0, "", -1, i);
    }

    public final String LJJJIL(String str, String str2, long j, String[] strArr, String str3, String str4, int i, String str5, boolean z, String str6, int i2) {
        return LJJJI(str, str2, j, 0L, strArr, str3, str4, i, str5, z, null, 0, str6, i2, 0);
    }

    /* JADX WARN: Removed duplicated region for block: B:64:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x013f A[Catch: all -> 0x0150, TryCatch #0 {all -> 0x0150, blocks: (B:68:0x0133, B:70:0x013f), top: B:215:0x0133 }] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x016d A[Catch: all -> 0x021b, TryCatch #3 {all -> 0x021b, blocks: (B:103:0x0217, B:78:0x0157, B:80:0x016d, B:82:0x0171, B:85:0x0179, B:87:0x0186, B:89:0x01a5, B:91:0x01b4, B:92:0x01bc, B:88:0x0195), top: B:219:0x00c4 }] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0179 A[Catch: all -> 0x021b, TRY_ENTER, TryCatch #3 {all -> 0x021b, blocks: (B:103:0x0217, B:78:0x0157, B:80:0x016d, B:82:0x0171, B:85:0x0179, B:87:0x0186, B:89:0x01a5, B:91:0x01b4, B:92:0x01bc, B:88:0x0195), top: B:219:0x00c4 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String LJIILIIL(java.lang.String r40, java.lang.String r41, long r42, java.lang.String[] r44, X.EnumC2281151EQn r45, java.lang.String r46, X.C1474520oTS r47, java.lang.String r48, java.lang.String r49, boolean r50, boolean r51, java.lang.String r52, int r53) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1054
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.ttvideoengine.DataLoaderHelper.LJIILIIL(java.lang.String, java.lang.String, long, java.lang.String[], X.1EQn, java.lang.String, X.0oTS, java.lang.String, java.lang.String, boolean, boolean, java.lang.String, int):java.lang.String");
    }

    public final String LJJJI(String str, String str2, long j, long j2, String[] strArr, String str3, String str4, int i, String str5, boolean z, String str6, int i2, String str7, int i3, int i4) {
        boolean z2;
        String strEncode;
        boolean z3;
        String strEncode2;
        String str8 = str;
        if (C1474810oTv.LJJIFFI()) {
            getClass();
            if (TextUtils.isEmpty(str8) || strArr == null || strArr.length < 1) {
                return null;
            }
            String[] strArr2 = (String[]) strArr.clone();
            if (j2 <= 0) {
                j2 = 0;
            }
            for (String str9 : strArr2) {
                if (!LJIILLIIL(str9)) {
                    return null;
                }
            }
            if (strArr2.length > 1) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(strArr2[0]);
                for (int i5 = 1; i5 < strArr2.length; i5++) {
                    String str10 = strArr2[i5];
                    Boolean bool = Boolean.TRUE;
                    int size = arrayList.size() - 1;
                    while (true) {
                        if (size < 0) {
                            break;
                        }
                        if (((String) ListProtector.get(arrayList, size)).equals(str10)) {
                            bool = Boolean.FALSE;
                            break;
                        }
                        size--;
                    }
                    if (bool.booleanValue()) {
                        arrayList.add(str10);
                    }
                }
                strArr2 = new String[arrayList.size()];
                arrayList.toArray(strArr2);
            }
            String strLJFF = C795730VJj.LJFF(str8);
            if (TextUtils.isEmpty(strLJFF)) {
                return null;
            }
            int i6 = C2187451AjH.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("preloadProxyQuery: key = ");
            sbLIZ.append(str8);
            sbLIZ.append(", rawKey = ");
            sbLIZ.append(str2);
            C1471660oOq.LIZJ("DataLoaderHelper", C2188811AlT.LIZIZ(sbLIZ));
            if (!TextUtils.isEmpty(str2)) {
                str8 = str2;
            }
            String strLJFF2 = C795730VJj.LJFF(str8);
            if (TextUtils.isEmpty(strLJFF2)) {
                strLJFF2 = "videoId";
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("?rk=");
            stringBuffer.append(strLJFF2);
            stringBuffer.append("&k=");
            stringBuffer.append(strLJFF);
            if (j2 > 0) {
                stringBuffer.append("&s=");
                stringBuffer.append(j + j2);
            }
            if (i > 0) {
                stringBuffer.append("&l=");
                stringBuffer.append(i);
            }
            if (!TextUtils.isEmpty(str3)) {
                String strLJFF3 = C795730VJj.LJFF(str3);
                if (!TextUtils.isEmpty(strLJFF3)) {
                    stringBuffer.append("&p=");
                    stringBuffer.append(strLJFF3);
                }
            }
            if (!TextUtils.isEmpty(str5)) {
                String strLJFF4 = C795730VJj.LJFF(str5);
                if (!TextUtils.isEmpty(strLJFF4)) {
                    stringBuffer.append("&h=");
                    stringBuffer.append(strLJFF4);
                }
            }
            if (!TextUtils.isEmpty(str7)) {
                stringBuffer.append("&gid=");
                stringBuffer.append(str7);
            }
            if (i4 > 0) {
                stringBuffer.append("&ts=");
                stringBuffer.append(i4);
            }
            if (!z && !C1476290oWJ.LIZ(strArr2[0])) {
                z3 = false;
            } else {
                z3 = true;
            }
            if (z3) {
                stringBuffer.append("&ft=1");
            }
            if (i2 > 0) {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("&ev=");
                sbLIZ2.append(i2);
                stringBuffer.append(C2188811AlT.LIZIZ(sbLIZ2));
            }
            if (!TextUtils.isEmpty(str6)) {
                String strLJFF5 = C795730VJj.LJFF(str6);
                if (!TextUtils.isEmpty(strLJFF5)) {
                    stringBuffer.append("&dtk=");
                    stringBuffer.append(strLJFF5);
                }
            }
            if (i3 > 0) {
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("&play_index_gap=");
                sbLIZ3.append(i3);
                stringBuffer.append(C2188811AlT.LIZIZ(sbLIZ3));
            }
            StringBuffer stringBuffer2 = new StringBuffer();
            for (int i7 = 0; i7 < strArr2.length; i7++) {
                if (this.LJIIIZ.mEnableUseOriginalUrl != 1) {
                    strEncode2 = LJJII(strArr2[i7]);
                } else {
                    try {
                    } catch (UnsupportedEncodingException e) {
                        e = e;
                    }
                    try {
                        strEncode2 = URLEncoder.encode(strArr2[i7], "UTF-8");
                    } catch (UnsupportedEncodingException e2) {
                        e = e2;
                        TryCatchGuardChecker.doCheck(e);
                        int i8 = C2187451AjH.LIZ;
                        StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                        sbLIZ4.append("encode failed:");
                        sbLIZ4.append(strArr2[i7]);
                        TTVideoEngineLog.d("TTHelperEncode", C2188811AlT.LIZIZ(sbLIZ4));
                        strEncode2 = null;
                    }
                }
                StringBuffer stringBuffer3 = new StringBuffer();
                if (!TextUtils.isEmpty(strEncode2)) {
                    stringBuffer3.append("&u");
                    stringBuffer3.append(i7);
                    stringBuffer3.append("=");
                    stringBuffer3.append(strEncode2);
                }
                if (stringBuffer.length() + stringBuffer2.length() + stringBuffer3.length() + 32 > 3096) {
                    break;
                }
                stringBuffer2.append(stringBuffer3);
            }
            if (stringBuffer2.length() < 1) {
                return null;
            }
            stringBuffer.append(stringBuffer2);
            if (!TextUtils.isEmpty(str4) && stringBuffer.length() + str4.length() + 33 <= 3096) {
                stringBuffer.append("&");
                stringBuffer.append(str4);
            }
            return stringBuffer.toString();
        }
        if (TextUtils.isEmpty(str8) || strArr == null || strArr.length < 1) {
            return null;
        }
        String[] strArr3 = (String[]) strArr.clone();
        if (j2 <= 0) {
            j2 = 0;
        }
        for (String str11 : strArr3) {
            if (!LJIILLIIL(str11)) {
                return null;
            }
        }
        if (strArr3.length > 1) {
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(strArr3[0]);
            for (int i9 = 1; i9 < strArr3.length; i9++) {
                String str12 = strArr3[i9];
                Boolean bool2 = Boolean.TRUE;
                int size2 = arrayList2.size() - 1;
                while (true) {
                    if (size2 < 0) {
                        break;
                    }
                    if (((String) ListProtector.get(arrayList2, size2)).equals(str12)) {
                        bool2 = Boolean.FALSE;
                        break;
                    }
                    size2--;
                }
                if (bool2.booleanValue()) {
                    arrayList2.add(str12);
                }
            }
            strArr3 = new String[arrayList2.size()];
            arrayList2.toArray(strArr3);
        }
        String strLJFF6 = C795730VJj.LJFF(str8);
        if (TextUtils.isEmpty(strLJFF6)) {
            return null;
        }
        int i10 = C2187451AjH.LIZ;
        StringBuilder sbLIZ5 = C2188811AlT.LIZ();
        sbLIZ5.append("preloadProxyQuery: key = ");
        sbLIZ5.append(str8);
        sbLIZ5.append(", rawKey = ");
        sbLIZ5.append(str2);
        C1471660oOq.LIZJ("DataLoaderHelper", C2188811AlT.LIZIZ(sbLIZ5));
        if (!TextUtils.isEmpty(str2)) {
            str8 = str2;
        }
        String strLJFF7 = C795730VJj.LJFF(str8);
        if (TextUtils.isEmpty(strLJFF7)) {
            strLJFF7 = "videoId";
        }
        StringBuffer stringBuffer4 = new StringBuffer();
        stringBuffer4.append("?rk=");
        stringBuffer4.append(strLJFF7);
        stringBuffer4.append("&k=");
        stringBuffer4.append(strLJFF6);
        if (j2 > 0) {
            stringBuffer4.append("&s=");
            stringBuffer4.append(j + j2);
        }
        if (i > 0) {
            stringBuffer4.append("&l=");
            stringBuffer4.append(i);
        }
        if (!TextUtils.isEmpty(str3)) {
            String strLJFF8 = C795730VJj.LJFF(str3);
            if (!TextUtils.isEmpty(strLJFF8)) {
                stringBuffer4.append("&p=");
                stringBuffer4.append(strLJFF8);
            }
        }
        if (!TextUtils.isEmpty(str5)) {
            String strLJFF9 = C795730VJj.LJFF(str5);
            if (!TextUtils.isEmpty(strLJFF9)) {
                stringBuffer4.append("&h=");
                stringBuffer4.append(strLJFF9);
            }
        }
        if (!TextUtils.isEmpty(str7)) {
            stringBuffer4.append("&gid=");
            stringBuffer4.append(str7);
        }
        if (i4 > 0) {
            stringBuffer4.append("&ts=");
            stringBuffer4.append(i4);
        }
        if (!z && !C1476290oWJ.LIZ(strArr3[0])) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (z2) {
            stringBuffer4.append("&ft=1");
        }
        if (i2 > 0) {
            StringBuilder sbLIZ6 = C2188811AlT.LIZ();
            sbLIZ6.append("&ev=");
            sbLIZ6.append(i2);
            stringBuffer4.append(C2188811AlT.LIZIZ(sbLIZ6));
        }
        if (!TextUtils.isEmpty(str6)) {
            String strLJFF10 = C795730VJj.LJFF(str6);
            if (!TextUtils.isEmpty(strLJFF10)) {
                stringBuffer4.append("&dtk=");
                stringBuffer4.append(strLJFF10);
            }
        }
        if (i3 > 0) {
            StringBuilder sbLIZ7 = C2188811AlT.LIZ();
            sbLIZ7.append("&play_index_gap=");
            sbLIZ7.append(i3);
            stringBuffer4.append(C2188811AlT.LIZIZ(sbLIZ7));
        }
        StringBuffer stringBuffer5 = new StringBuffer();
        for (int i11 = 0; i11 < strArr3.length; i11++) {
            if (this.LJIIIZ.mEnableUseOriginalUrl == 1) {
                try {
                    try {
                        strEncode = URLEncoder.encode(strArr3[i11], "UTF-8");
                    } catch (UnsupportedEncodingException e3) {
                        e = e3;
                        TryCatchGuardChecker.doCheck(e);
                        int i12 = C2187451AjH.LIZ;
                        StringBuilder sbLIZ8 = C2188811AlT.LIZ();
                        sbLIZ8.append("encode failed:");
                        sbLIZ8.append(strArr3[i11]);
                        TTVideoEngineLog.d("TTHelperEncode", C2188811AlT.LIZIZ(sbLIZ8));
                        strEncode = null;
                    }
                } catch (UnsupportedEncodingException e4) {
                    e = e4;
                }
            } else {
                strEncode = LJJII(strArr3[i11]);
            }
            StringBuffer stringBuffer6 = new StringBuffer();
            if (!TextUtils.isEmpty(strEncode)) {
                stringBuffer6.append("&u");
                stringBuffer6.append(i11);
                stringBuffer6.append("=");
                stringBuffer6.append(strEncode);
            }
            if (stringBuffer4.length() + stringBuffer5.length() + stringBuffer6.length() + 32 > 3096) {
                break;
            }
            stringBuffer5.append(stringBuffer6);
        }
        if (stringBuffer5.length() < 1) {
            return null;
        }
        stringBuffer4.append(stringBuffer5);
        if (!TextUtils.isEmpty(str4) && stringBuffer4.length() + str4.length() + 33 <= 3096) {
            stringBuffer4.append("&");
            stringBuffer4.append(str4);
        }
        return stringBuffer4.toString();
    }
}
