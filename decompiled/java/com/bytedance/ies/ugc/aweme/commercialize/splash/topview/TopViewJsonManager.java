package com.bytedance.ies.ugc.aweme.commercialize.splash.topview;

import X.C0B4N;
import X.C0C64;
import X.C0CCZ;
import X.C0CPH;
import X.C0N2S;
import X.C0VSF;
import X.C0VSJ;
import X.C0VU1;
import X.C0VZ0;
import X.C1017070cZd;
import X.C1018150cbN;
import X.C1020790cfd;
import X.C1030840cvq;
import X.C1227904rF;
import X.C1AF0;
import X.C2188811AlT;
import X.C2214201BlK;
import X.C2344809Gs;
import X.C7740030o;
import X.C786410Ut5;
import X.C794210VDn;
import X.C799900VZk;
import X.C810670Vr7;
import X.C844470XAv;
import X.EnumC799870VZh;
import X.EnumC799980VZs;
import X.InterfaceC1018210cbT;
import X.InterfaceC626120Oh8;
import X.InterfaceC799590VYf;
import Y.ACallableS420S0100000_13;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;
import com.bytedance.ies.ugc.aweme.commercialize.splash.topview.TopViewJsonManager;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.ss.android.ugc.aweme.commercialize.topview.TopViewAweme;
import com.ss.android.ugc.aweme.commercialize.topview.TopViewAwemeRawAd;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.structure.api.ICommerceService;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.AwS67S1000000_16;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes14.dex */
public final class TopViewJsonManager {
    public static final long LJI;
    public static final long LJII;
    public static String LJIIIIZZ;
    public static String LJIIIZ;
    public static boolean LJIIJ;
    public final Gson LIZIZ;
    public final SharedPreferences LIZJ;
    public volatile Map<String, Aweme> LIZLLL;
    public final Object LIZ = new Object();
    public final ConcurrentHashMap<String, InterfaceC1018210cbT> LJ = new ConcurrentHashMap<>();
    public long LJFF = 0;

    public final synchronized Map<String, InterfaceC1018210cbT> LJ() {
        String strLJI;
        if (!this.LJ.isEmpty()) {
            return this.LJ;
        }
        try {
            strLJI = LJI(null);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C1AF0.LJ(e);
        } catch (OutOfMemoryError e2) {
            TryCatchGuardChecker.doCheck(e2);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("AwesomeSplash OutOfMemoryError:");
            sbLIZ.append(e2.toString());
            C2344809Gs.LJ(C2188811AlT.LIZIZ(sbLIZ));
            C2344809Gs.LJI(e2);
            LIZ();
        }
        if (!TextUtils.isEmpty(strLJI)) {
            if (!TextUtils.isEmpty(strLJI) && strLJI.length() >= 3) {
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                JSONObject jSONObject = new JSONObject(strLJI);
                Gson gson = C7740030o.LIZ().getGson();
                Iterator<String> itKeys = jSONObject.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    this.LJ.put(next, LJFF(JSONObjectProtectorUtils.getJSONObject(jSONObject, next), gson));
                }
                C1020790cfd.LJJIIZ(C0N2S.PARTIAL_LOAD, SystemClock.elapsedRealtime() - jElapsedRealtime);
                return this.LJ;
            }
        }
        return this.LJ;
    }

    static {
        TimeUnit timeUnit = TimeUnit.DAYS;
        LJI = timeUnit.toMillis(3L);
        LJII = timeUnit.toMillis(14L);
        LJIIJ = false;
    }

    public static void LIZ() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(LJIIIZ);
        sbLIZ.append("awemes.json");
        C0VSJ c0vsj = new C0VSJ(C2188811AlT.LIZIZ(sbLIZ));
        if (c0vsj.exists()) {
            c0vsj.delete();
        }
    }

    public final void LJII() {
        C0VSJ c0vsj = new C0VSJ(LJIIIZ);
        if (!c0vsj.exists()) {
            c0vsj.mkdirs();
        }
        try {
            Map<String, Aweme> mapLIZLLL = LIZLLL(null);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(LJIIIZ);
            sbLIZ.append("awemes.json");
            C0VSJ c0vsj2 = new C0VSJ(C2188811AlT.LIZIZ(sbLIZ));
            if (mapLIZLLL == null || mapLIZLLL.size() == 0) {
                if (c0vsj2.exists()) {
                    c0vsj2.delete();
                    return;
                }
                return;
            }
            if (!c0vsj2.exists()) {
                c0vsj2.createNewFile();
            }
            BufferedWriter bufferedWriter = new BufferedWriter(new C794210VDn(c0vsj2));
            bufferedWriter.write(GsonProtectorUtils.toJson(this.LIZIZ, mapLIZLLL, new TypeToken<Map<String, Aweme>>() { // from class: X.0WA6
            }.getType()));
            bufferedWriter.close();
            if (C0B4N.LIZ()) {
                for (Map.Entry<String, Aweme> entry : mapLIZLLL.entrySet()) {
                    String key = entry.getKey();
                    if (!TextUtils.isEmpty(key)) {
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append(LJIIIZ);
                        sbLIZ2.append(key);
                        sbLIZ2.append(".json");
                        C0VSJ c0vsj3 = new C0VSJ(C2188811AlT.LIZIZ(sbLIZ2));
                        if (!c0vsj3.exists()) {
                            c0vsj3.createNewFile();
                        }
                        BufferedWriter bufferedWriter2 = new BufferedWriter(new C794210VDn(c0vsj3));
                        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
                        concurrentHashMap.put(key, entry.getValue());
                        bufferedWriter2.write(GsonProtectorUtils.toJson(this.LIZIZ, concurrentHashMap, new TypeToken<Map<String, Aweme>>() { // from class: X.0WA7
                        }.getType()));
                        bufferedWriter2.close();
                    }
                }
            }
        } catch (IOException e) {
            TryCatchGuardChecker.doCheck(e);
            C1AF0.LJ(e);
        } catch (OutOfMemoryError e2) {
            TryCatchGuardChecker.doCheck(e2);
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("AwesomeSplash OutOfMemoryError:");
            sbLIZ3.append(e2.toString());
            C2344809Gs.LJ(C2188811AlT.LIZIZ(sbLIZ3));
            C2344809Gs.LJI(e2);
        }
    }

    /* JADX INFO: loaded from: classes4.dex */
    public class InnerLegoTask implements InterfaceC799590VYf, C0CCZ {
        @Override // X.InterfaceC800080Va2
        public final /* synthetic */ List finalizedBy() {
            return null;
        }

        @Override // X.InterfaceC800080Va2
        public final String key() {
            return "TopViewJsonManager$InnerLegoTask";
        }

        @Override // X.InterfaceC799590VYf
        public final /* synthetic */ int level() {
            return 1;
        }

        @Override // X.InterfaceC800080Va2
        public final /* synthetic */ boolean meetTrigger() {
            return true;
        }

        @Override // X.InterfaceC799590VYf
        public final /* synthetic */ int priority() {
            return 1;
        }

        @Override // X.C0CCZ
        public final /* synthetic */ boolean serialExecute() {
            return false;
        }

        @Override // X.InterfaceC800080Va2
        public final /* synthetic */ int targetProcess() {
            return C0VZ0.LIZ();
        }

        @Override // X.InterfaceC800080Va2
        public final /* synthetic */ EnumC799980VZs triggerType() {
            return C0VZ0.LIZIZ(this);
        }

        @Override // X.InterfaceC799590VYf
        public final C0VU1 threadType() {
            return C0VU1.CPU;
        }

        @Override // X.C0CCZ
        public final EnumC799870VZh type() {
            return EnumC799870VZh.BACKGROUND;
        }

        public InnerLegoTask() {
        }

        @Override // X.InterfaceC308150C6b
        public final void run(Context context) {
            try {
                TopViewJsonManager.this.LIZIZ.LJIIJ(Aweme.class);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
    }

    public TopViewJsonManager(String str) {
        C1227904rF.LIZ.getClass();
        this.LIZIZ = C1227904rF.LIZLLL();
        LJIIIIZZ = str;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(LJIIIIZZ);
        sbLIZ.append("awemeJson/");
        LJIIIZ = C2188811AlT.LIZIZ(sbLIZ);
        C844470XAv.LIZ.getClass();
        this.LIZJ = C810670Vr7.LIZJ(C844470XAv.LIZ(), 0, "awesome_splash");
        C2214201BlK.LIZLLL().LIZIZ(new InterfaceC626120Oh8<Boolean>() { // from class: X.0COH
            @Override // X.InterfaceC626120Oh8
            public final void onComplete() {
            }

            @Override // X.InterfaceC626120Oh8
            public final void onError(Throwable th) {
            }

            @Override // X.InterfaceC626120Oh8
            public final void onSubscribe(InterfaceC420801kM interfaceC420801kM) {
            }

            @Override // X.InterfaceC626120Oh8
            public final void onNext(Boolean bool) {
                if (bool.booleanValue() && C0C64.LJIILLIIL().LJIIIZ(31744, "awesome_splash_del_when_background_enabled", true, false)) {
                    TopViewJsonManager topViewJsonManager = this.LL;
                    topViewJsonManager.getClass();
                    C15O7.LIZJ(new ACallableS420S0100000_13(topViewJsonManager, 0));
                }
            }
        });
    }

    public static String LJI(String str) {
        String strLIZIZ;
        BufferedReader bufferedReader;
        StringBuilder sb = new StringBuilder();
        if (C0B4N.LIZ() && !TextUtils.isEmpty(str)) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(str);
            sbLIZ.append(".json");
            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        } else {
            strLIZIZ = "awemes.json";
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append(LJIIIZ);
        sbLIZ2.append(strLIZIZ);
        C0VSJ c0vsj = new C0VSJ(C2188811AlT.LIZIZ(sbLIZ2));
        if (!c0vsj.exists()) {
            return sb.toString();
        }
        try {
            bufferedReader = new BufferedReader(new C0VSF(c0vsj));
        } catch (IOException e) {
            TryCatchGuardChecker.doCheck(e);
            C1AF0.LJ(e);
        }
        while (true) {
            String line = bufferedReader.readLine();
            if (line == null) {
                break;
            }
            sb.append(line);
            return sb.toString();
        }
        bufferedReader.close();
        return sb.toString();
    }

    public final Aweme LIZIZ(String str) {
        Aweme aweme;
        if (C0B4N.LIZ()) {
            Map<String, Aweme> mapLIZLLL = LIZLLL(str);
            if (mapLIZLLL != null && mapLIZLLL.size() != 0 && mapLIZLLL.containsKey(str)) {
                aweme = mapLIZLLL.get(str);
            } else {
                aweme = null;
            }
        } else {
            Map<String, Aweme> mapLIZLLL2 = LIZLLL(null);
            if (mapLIZLLL2 != null && mapLIZLLL2.size() != 0) {
                aweme = mapLIZLLL2.get(str);
            }
            return null;
        }
        ((ICommerceService) ServiceManager.get().getService(ICommerceService.class)).LJIIIZ().isEnabled();
        if (C1017070cZd.LLJILJILJ(aweme)) {
            return null;
        }
        return aweme;
    }

    public final Map<String, Aweme> LIZJ(String str) {
        boolean z;
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        C1018150cbN.LIZJ().getClass();
        try {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            if (C0B4N.LIZ() && !TextUtils.isEmpty(str)) {
                String strLJI = LJI(str);
                if (!TextUtils.isEmpty(strLJI)) {
                    Map<String, Aweme> map = (Map) this.LIZIZ.LJIIIIZZ(strLJI, new TypeToken<Map<String, Aweme>>() { // from class: X.0WA8
                    }.getType());
                    C1020790cfd.LJJIIZ(C0N2S.TOPVIEW_JSON_SPILT, SystemClock.elapsedRealtime() - jElapsedRealtime);
                    return map;
                }
            }
            String strLJI2 = LJI(null);
            if (!TextUtils.isEmpty(strLJI2)) {
                if (TextUtils.isEmpty(strLJI2) || strLJI2.length() < 3) {
                    z = false;
                } else {
                    z = true;
                }
                if (!z) {
                    return concurrentHashMap;
                }
                Map<String, Aweme> map2 = (Map) this.LIZIZ.LJIIIIZZ(strLJI2, new TypeToken<Map<String, Aweme>>() { // from class: X.0WA9
                }.getType());
                C1020790cfd.LJJIIZ(C0N2S.DEFAULT, SystemClock.elapsedRealtime() - jElapsedRealtime);
                if (map2 != null && map2.size() != 0) {
                    concurrentHashMap.putAll(map2);
                    return concurrentHashMap;
                }
                return map2;
            }
            LJIIIIZZ(str);
            return concurrentHashMap;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C1AF0.LJ(e);
            return concurrentHashMap;
        } catch (OutOfMemoryError e2) {
            TryCatchGuardChecker.doCheck(e2);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("AwesomeSplash OutOfMemoryError:");
            sbLIZ.append(e2.toString());
            C2344809Gs.LJ(C2188811AlT.LIZIZ(sbLIZ));
            C2344809Gs.LJI(e2);
            LIZ();
            return concurrentHashMap;
        }
    }

    public final Map<String, Aweme> LIZLLL(String str) {
        boolean z;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("call getMap, topViewId: ");
        sbLIZ.append(str);
        sbLIZ.append(" isMainThread: ");
        if (Looper.getMainLooper() == Looper.myLooper()) {
            z = true;
        } else {
            z = false;
        }
        sbLIZ.append(z);
        C2188811AlT.LIZIZ(sbLIZ);
        if (C0B4N.LIZ() && !TextUtils.isEmpty(str)) {
            if (this.LIZLLL != null && this.LIZLLL.containsKey(str)) {
                return this.LIZLLL;
            }
            if (this.LIZLLL == null) {
                synchronized (this.LIZ) {
                    try {
                        if (this.LIZLLL == null) {
                            this.LIZLLL = LIZJ(str);
                        }
                    } finally {
                    }
                }
            } else {
                this.LIZLLL.putAll(LIZJ(str));
            }
        } else if (this.LIZLLL == null) {
            synchronized (this.LIZ) {
                try {
                    if (this.LIZLLL == null) {
                        this.LIZLLL = LIZJ(null);
                    }
                } finally {
                }
            }
        }
        return this.LIZLLL;
    }

    public final void LJIIIIZZ(String str) {
        C1020790cfd c1020790cfd = new C1020790cfd(new Object[0]);
        C1030840cvq.LIZ.getClass();
        c1020790cfd.log(C1030840cvq.LJ, new AwS67S1000000_16(str, 2));
        if (!LJIIJ) {
            try {
                if (C0C64.LJIILLIIL().LJIIIZ(31744, "topview_json_opt_check", true, false)) {
                    return;
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C1AF0.LJ(th);
            }
            C799900VZk.LIZ.getClass();
            C0CPH c0cph = new C0CPH();
            c0cph.LIZ(new InnerLegoTask());
            c0cph.LIZIZ();
            LJIIJ = true;
        }
    }

    public static TopViewAweme LJFF(JSONObject jSONObject, Gson gson) {
        String strJ3;
        String strOptString = jSONObject.optString("aweme_id");
        boolean zOptBoolean = jSONObject.optBoolean("is_ads", false);
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("raw_ad_data");
        String strJ32 = null;
        if (jSONObjectOptJSONObject == null) {
            strJ3 = null;
        } else {
            strJ3 = C786410Ut5.J3(jSONObjectOptJSONObject);
        }
        TopViewAwemeRawAd topViewAwemeRawAd = (TopViewAwemeRawAd) GsonProtectorUtils.fromJson(gson, strJ3, TopViewAwemeRawAd.class);
        JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject("video");
        if (jSONObjectOptJSONObject2 != null) {
            strJ32 = C786410Ut5.J3(jSONObjectOptJSONObject2);
        }
        return new TopViewAweme(strOptString, zOptBoolean, topViewAwemeRawAd, (Video) GsonProtectorUtils.fromJson(gson, strJ32, Video.class), jSONObject.optInt("aweme_type"));
    }
}
