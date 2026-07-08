package com.ss.android.ugc.aweme.bullet.business;

import X.C1022820ciu;
import X.C1028040crK;
import X.C1038730d8Z;
import X.C1039060d96;
import X.C1039190d9J;
import X.C1039200d9K;
import X.C1041600dDC;
import X.C1AF0;
import X.C2184171Adz;
import X.C786410Ut5;
import android.app.Activity;
import android.text.TextUtils;
import android.webkit.WebView;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ad.preload.IAdLandPagePreloadService;
import com.ss.android.ugc.aweme.bullet.business.BulletBusinessService;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes17.dex */
public final class AdWebStatBusiness extends BulletBusinessService.Business {
    public static final /* synthetic */ int LJIIIZ = 0;
    public final C1039200d9K LIZIZ;
    public long LIZJ;
    public boolean LIZLLL;
    public boolean LJ;
    public boolean LJFF;
    public final ArrayList<Integer> LJI;
    public long LJII;
    public boolean LJIIIIZZ;

    public final JSONObject LJFF() {
        JSONObject jSONObject = null;
        try {
            JSONObject jSONObject2 = !TextUtils.isEmpty(LJ()) ? new JSONObject(LJ()) : new JSONObject();
            try {
                C1041600dDC c1041600dDC = this.LIZ.LIZIZ;
                C1038730d8Z c1038730d8Z = c1041600dDC instanceof C1038730d8Z ? (C1038730d8Z) c1041600dDC : null;
                jSONObject2.put("log_extra", c1038730d8Z != null ? c1038730d8Z.LIZJ() : "");
                return jSONObject2;
            } catch (Exception e) {
                e = e;
                jSONObject = jSONObject2;
                TryCatchGuardChecker.doCheck(e);
                C1AF0.LJ(e);
                return jSONObject;
            }
        } catch (Exception e2) {
            e = e2;
        }
    }

    static {
        new ConcurrentHashMap();
    }

    public final long LIZJ() {
        C1038730d8Z c1038730d8Z;
        C1028040crK c1028040crK;
        Long lLIZJ;
        C1041600dDC c1041600dDC = this.LIZ.LIZIZ;
        if (!(c1041600dDC instanceof C1038730d8Z) || (c1038730d8Z = (C1038730d8Z) c1041600dDC) == null || (c1028040crK = c1038730d8Z.LJJLL) == null || (lLIZJ = c1028040crK.LIZJ()) == null) {
            return 0L;
        }
        return lLIZJ.longValue();
    }

    public final String LIZLLL() {
        C1041600dDC c1041600dDC = this.LIZ.LIZIZ;
        if (c1041600dDC == null || !(c1041600dDC instanceof C1038730d8Z)) {
            return null;
        }
        C1038730d8Z c1038730d8Z = (C1038730d8Z) c1041600dDC;
        String str = (String) c1038730d8Z.LJLLILLLL.LIZJ();
        if (!TextUtils.isEmpty(str)) {
            return str;
        }
        Long lLIZJ = c1038730d8Z.LJJLL.LIZJ();
        if (lLIZJ != null) {
            return lLIZJ.toString();
        }
        return null;
    }

    public final String LJ() {
        C1038730d8Z c1038730d8Z;
        String str;
        C1041600dDC c1041600dDC = this.LIZ.LIZIZ;
        return (!(c1041600dDC instanceof C1038730d8Z) || (c1038730d8Z = (C1038730d8Z) c1041600dDC) == null || (str = (String) c1038730d8Z.LJLL.LIZJ()) == null) ? "" : str;
    }

    public final int LJI() {
        C1041600dDC c1041600dDC = this.LIZ.LIZIZ;
        if (c1041600dDC == null || !(c1041600dDC instanceof C1038730d8Z)) {
            return 0;
        }
        return ((C1038730d8Z) c1041600dDC).LLFZ;
    }

    public final String LJII() {
        String str;
        C1041600dDC c1041600dDC = this.LIZ.LIZIZ;
        C1039060d96 c1039060d96 = c1041600dDC instanceof C1039060d96 ? (C1039060d96) c1041600dDC : null;
        return (c1039060d96 == null || (str = (String) c1039060d96.LJJJLZIJ.LIZJ()) == null) ? "" : str;
    }

    public final int LJIIIIZZ() {
        Integer numLIZJ;
        C1041600dDC c1041600dDC = this.LIZ.LIZIZ;
        C1039060d96 c1039060d96 = c1041600dDC instanceof C1039060d96 ? (C1039060d96) c1041600dDC : null;
        if (c1039060d96 == null || (numLIZJ = c1039060d96.LJJLIIIJLJLI.LIZJ()) == null) {
            return 0;
        }
        return numLIZJ.intValue();
    }

    public AdWebStatBusiness(C1039190d9J c1039190d9J) {
        super(c1039190d9J);
        this.LIZIZ = new C1039200d9K();
        this.LJI = new ArrayList<>();
    }

    public final void LJIIJ(boolean z) {
        Activity activity;
        JSONObject jSONObject;
        int i;
        JSONObject jSONObjectLJFF = LJFF();
        long jCurrentTimeMillis = System.currentTimeMillis() - this.LIZJ;
        this.LIZJ = 0L;
        if (LIZJ() > 0) {
            if (jCurrentTimeMillis > 0 && !this.LIZLLL) {
                C1039200d9K c1039200d9K = this.LIZIZ;
                long jLIZJ = LIZJ();
                JSONObject jSONObjectLIZIZ = LIZIZ(null, null);
                int iLJI = LJI();
                if (jLIZJ > 0) {
                    if (c1039200d9K.LJFF != null) {
                        if (jSONObjectLJFF == null) {
                            jSONObject = new JSONObject();
                        } else {
                            jSONObject = jSONObjectLJFF;
                        }
                        try {
                            jSONObject.put("is_ad_event", "1");
                            jSONObject.put("tag", "draw_ad");
                            if (jSONObjectLIZIZ == null) {
                                jSONObjectLIZIZ = new JSONObject();
                            }
                            jSONObjectLIZIZ.put("present_url", c1039200d9K.LJFF);
                            jSONObjectLIZIZ.put("container_type", "bullet");
                            jSONObjectLIZIZ.put("ix_to_externalurl", 0);
                            jSONObjectLIZIZ.put("landing_page_style", iLJI);
                            jSONObjectLIZIZ.put("stay_time", jCurrentTimeMillis);
                            jSONObjectLIZIZ.put("render_type", "h5");
                            jSONObjectLIZIZ.put("preload_status", -1);
                            if (c1039200d9K.LJIIIZ && c1039200d9K.LJIIJ != 1) {
                                i = 0;
                            } else {
                                i = 1;
                            }
                            jSONObjectLIZIZ.put("first_page", i);
                            jSONObject.put("ad_extra_data", C786410Ut5.J3(jSONObjectLIZIZ));
                        } catch (JSONException e) {
                            TryCatchGuardChecker.doCheck(e);
                            C1AF0.LJ(e);
                        }
                        C1022820ciu c1022820ciuLJ = C2184171Adz.LJ("ad_wap_stat", "stay_page", String.valueOf(jLIZJ), "", CardStruct.IStatusCode.DEFAULT);
                        Iterator<String> itKeys = jSONObject.keys();
                        while (itKeys.hasNext()) {
                            String next = itKeys.next();
                            c1022820ciuLJ.LIZJ(jSONObject.opt(next), next);
                        }
                        c1022820ciuLJ.LJII();
                    }
                } else {
                    c1039200d9K.getClass();
                }
                this.LIZLLL = true;
            }
            if (z || ((activity = this.LIZ.getActivity()) != null && activity.isFinishing())) {
                C1039200d9K c1039200d9K2 = this.LIZIZ;
                long jLIZJ2 = LIZJ();
                C1039200d9K c1039200d9K3 = this.LIZIZ;
                c1039200d9K2.LIZIZ(null, jLIZJ2, jSONObjectLJFF, LIZIZ(Integer.valueOf(c1039200d9K3.LJIIL), c1039200d9K3.LJIIJJI), LJI(), 0);
            }
        }
    }

    public final void LIZ(WebView webView, String str) {
        boolean z;
        C1039200d9K c1039200d9K = this.LIZIZ;
        long jLIZJ = LIZJ();
        JSONObject jSONObjectLJFF = LJFF();
        JSONObject jSONObjectLIZIZ = LIZIZ(null, null);
        int iLJI = LJI();
        c1039200d9K.getClass();
        if (webView != null && !TextUtils.isEmpty(str)) {
            if (c1039200d9K.LJI == null) {
                c1039200d9K.LJI = c1039200d9K.LJFF;
            }
            if (!TextUtils.isEmpty(webView.getOriginalUrl()) && !TextUtils.equals(webView.getOriginalUrl(), str) && !c1039200d9K.LIZLLL) {
                z = true;
            } else {
                z = false;
            }
            c1039200d9K.LIZJ = z;
            if (jLIZJ > 0) {
                if (jSONObjectLJFF == null) {
                    jSONObjectLJFF = new JSONObject();
                }
                try {
                    jSONObjectLJFF.put("is_ad_event", "1");
                    jSONObjectLJFF.put("tag", "draw_ad");
                    if (jSONObjectLIZIZ == null) {
                        jSONObjectLIZIZ = new JSONObject();
                    }
                    jSONObjectLIZIZ.put("present_url", c1039200d9K.LJI);
                    jSONObjectLIZIZ.put("next_url", str);
                    jSONObjectLIZIZ.put("container_type", "bullet");
                    jSONObjectLIZIZ.put("landing_page_style", iLJI);
                    jSONObjectLJFF.put("ad_extra_data", C786410Ut5.J3(jSONObjectLIZIZ));
                } catch (JSONException e) {
                    TryCatchGuardChecker.doCheck(e);
                    C1AF0.LJ(e);
                }
                C1022820ciu c1022820ciuLJ = C2184171Adz.LJ("ad_wap_stat", "jump_page", String.valueOf(jLIZJ), "", CardStruct.IStatusCode.DEFAULT);
                Iterator<String> itKeys = jSONObjectLJFF.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    c1022820ciuLJ.LIZJ(jSONObjectLJFF.opt(next), next);
                }
                c1022820ciuLJ.LJII();
            }
            c1039200d9K.LJI = str;
        }
    }

    public final JSONObject LIZIZ(Integer num, String str) {
        Integer num2;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("is_web_url", LJIIIIZZ());
            IAdLandPagePreloadService iAdLandPagePreloadService = (IAdLandPagePreloadService) ServiceManager.get().getService(IAdLandPagePreloadService.class);
            if (iAdLandPagePreloadService != null) {
                LJII();
                iAdLandPagePreloadService.C0();
                num2 = 2;
            } else {
                num2 = null;
            }
            jSONObject.put("landing_type", num2);
            if (!TextUtils.isEmpty(LJII()) && LJIIIIZZ() == 1) {
                jSONObject.put("channel_name", LJII());
            }
            if (!TextUtils.isEmpty(str)) {
                jSONObject.put("fail_reason", str);
            }
            if (num != null && num.intValue() != 999999999) {
                jSONObject.put("error_code", num.intValue());
            }
            return jSONObject;
        } catch (JSONException e) {
            TryCatchGuardChecker.doCheck(e);
            C1AF0.LJ(e);
            return null;
        }
    }

    public final void LJIIIZ(Integer num, String str, String str2) {
        int iIntValue;
        C1039200d9K c1039200d9K = this.LIZIZ;
        long jLIZJ = LIZJ();
        JSONObject jSONObjectLJFF = LJFF();
        JSONObject jSONObjectLIZIZ = LIZIZ(num, str2);
        if (num != null) {
            iIntValue = num.intValue();
        } else {
            iIntValue = -1;
        }
        int iLJI = LJI();
        c1039200d9K.LJ = true;
        c1039200d9K.LJIIJJI = str2;
        c1039200d9K.LJIIL = iIntValue;
        c1039200d9K.LIZIZ(str, jLIZJ, jSONObjectLJFF, jSONObjectLIZIZ, iLJI, 0);
    }
}
