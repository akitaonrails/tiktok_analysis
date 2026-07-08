package com.ss.android.ugc.aweme.bullet.business;

import X.C1022820ciu;
import X.C1024100cky;
import X.C1024150cl3;
import X.C1027660cqi;
import X.C1027760cqs;
import X.C1028030crJ;
import X.C1035650d3b;
import X.C1039190d9J;
import X.C1041600dDC;
import X.C1041880dDe;
import X.C1537710q7N;
import X.C2184171Adz;
import android.app.Activity;
import com.ss.android.ugc.aweme.bullet.business.BulletBusinessService;
import com.ss.android.ugc.aweme.log.AdLynxEventLoger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AwS595S0100000_16;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes17.dex */
public final class AdLynxStatBusiness extends BulletBusinessService.Business {
    public boolean LIZIZ;
    public boolean LIZJ;
    public String LIZLLL;
    public long LJ;
    public final List<String> LJFF;
    public boolean LJI;
    public long LJII;
    public long LJIIIIZZ;
    public long LJIIIZ;
    public long LJIIJ;
    public C1537710q7N LJIIJJI;
    public String LJIIL;

    public final C1027760cqs LIZ() {
        C1041600dDC c1041600dDC = this.LIZ.LIZIZ;
        if (c1041600dDC instanceof C1027760cqs) {
            return (C1027760cqs) c1041600dDC;
        }
        return null;
    }

    public final void LIZIZ() {
        C1028030crJ c1028030crJ;
        C1027760cqs c1027760cqsLIZ = LIZ();
        if (c1027760cqsLIZ == null || (c1028030crJ = c1027760cqsLIZ.LJJJJI) == null || !Intrinsics.LJFF(c1028030crJ.LIZJ(), Boolean.TRUE)) {
            return;
        }
        this.LJIIJ = System.currentTimeMillis();
    }

    public final void LIZJ() {
        C1028030crJ c1028030crJ;
        C1027760cqs c1027760cqsLIZ = LIZ();
        if (c1027760cqsLIZ == null || (c1028030crJ = c1027760cqsLIZ.LJJJJI) == null || !Intrinsics.LJFF(c1028030crJ.LIZJ(), Boolean.TRUE)) {
            return;
        }
        this.LJIIIZ += System.currentTimeMillis() - this.LJIIJ;
    }

    public AdLynxStatBusiness(C1039190d9J c1039190d9J) {
        super(c1039190d9J);
        this.LJ = System.currentTimeMillis();
        this.LJFF = new ArrayList();
        this.LJIIJ = System.currentTimeMillis();
    }

    public final void LIZLLL(String str) {
        Object objLIZJ;
        int iIntValue;
        Integer num;
        C1027660cqi c1027660cqi = this.LIZ.LIZJ;
        if (c1027660cqi == null) {
            return;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("render_type", "lynx");
        if (Intrinsics.LJFF("load_finish", str)) {
            linkedHashMap.put("duration", Long.valueOf(System.currentTimeMillis() - this.LJ));
        } else if (Intrinsics.LJFF("stay_page", str)) {
            long jCurrentTimeMillis = System.currentTimeMillis() - this.LJII;
            this.LJII = 0L;
            if (jCurrentTimeMillis <= 0) {
                return;
            }
            linkedHashMap.put("stay_time", Long.valueOf(jCurrentTimeMillis));
            this.LJI = true;
            String str2 = this.LJIIL;
            if (str2 == null) {
                str2 = "full_screen_page_click";
            }
            linkedHashMap.put("close_refer", str2);
        }
        C1027760cqs c1027760cqsLIZ = LIZ();
        Object obj = "";
        if (c1027760cqsLIZ != null) {
            objLIZJ = c1027760cqsLIZ.LJJJJIZL.LIZJ();
            if (objLIZJ == null) {
                objLIZJ = "";
            }
        } else {
            objLIZJ = null;
        }
        linkedHashMap.put("channel_name", objLIZJ);
        Object objLIZJ2 = c1027660cqi.LJLILLLLZI.LIZJ();
        if (objLIZJ2 != null) {
            obj = objLIZJ2;
        }
        linkedHashMap.put("page_id", obj);
        linkedHashMap.put("first_page", 1);
        Integer numLIZJ = c1027660cqi.LJLJJLL.LIZJ();
        if (numLIZJ != null) {
            iIntValue = numLIZJ.intValue();
        } else {
            iIntValue = 0;
        }
        linkedHashMap.put("landing_page_style", Integer.valueOf(iIntValue));
        if ((Intrinsics.LJFF("load_finish", str) || Intrinsics.LJFF("load", str)) && (num = (Integer) c1027660cqi.LJLLILLLL.LIZJ()) != null) {
            linkedHashMap.put("sheet_ratio", Integer.valueOf(num.intValue()));
        }
        C1024100cky c1024100ckyLIZ = C1024150cl3.LIZ();
        c1024100ckyLIZ.LIZ = "ad_wap_stat";
        c1024100ckyLIZ.LIZIZ = str;
        c1024100ckyLIZ.LIZLLL(Long.valueOf(c1027660cqi.LIZJ()));
        c1024100ckyLIZ.LJI(c1027660cqi.LJ());
        c1024100ckyLIZ.LIZLLL = c1027660cqi.LIZLLL();
        c1024100ckyLIZ.LIZ(linkedHashMap);
        c1024100ckyLIZ.LJIIIZ();
        HashMap map = new HashMap();
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            Object value = entry.getValue();
            if (value != null) {
                map.put(entry.getKey(), value);
            }
        }
        C1022820ciu c1022820ciuLJ = C2184171Adz.LJ("ad_wap_stat", str, String.valueOf(c1027660cqi.LIZJ()), c1027660cqi.LJ(), c1027660cqi.LIZLLL());
        c1022820ciuLJ.LIZ(map);
        c1022820ciuLJ.LJIIIIZZ();
    }

    public final void LJ(boolean z) throws JSONException {
        C1028030crJ c1028030crJ;
        Object objLIZJ;
        C1041880dDe c1041880dDe;
        Object objLIZJ2;
        C1028030crJ c1028030crJ2;
        C1027660cqi c1027660cqi;
        C1027760cqs c1027760cqsLIZ = LIZ();
        if (c1027760cqsLIZ != null && (c1028030crJ = c1027760cqsLIZ.LJJJJI) != null && Intrinsics.LJFF(c1028030crJ.LIZJ(), Boolean.TRUE)) {
            Activity activity = this.LIZ.getActivity();
            if (!this.LJI) {
                LIZLLL("stay_page");
            }
            if (z) {
                C1027760cqs c1027760cqsLIZ2 = LIZ();
                if (c1027760cqsLIZ2 != null && (c1028030crJ2 = c1027760cqsLIZ2.LJJJJI) != null && Intrinsics.LJFF(c1028030crJ2.LIZJ(), Boolean.TRUE) && (c1027660cqi = this.LIZ.LIZJ) != null) {
                    AdLynxEventLoger adLynxEventLoger = new AdLynxEventLoger(new Object[]{c1027660cqi});
                    C1035650d3b.LIZ.getClass();
                    adLynxEventLoger.logAd(C1035650d3b.LIZIZ, String.valueOf(c1027660cqi.LIZJ()), c1027660cqi.LJ(), null, new AwS595S0100000_16(this, 273));
                }
                if (this.LJIIJJI != null) {
                    JSONObject jSONObject = new JSONObject();
                    C1027760cqs c1027760cqsLIZ3 = LIZ();
                    Object obj = "";
                    if (c1027760cqsLIZ3 == null || (objLIZJ = c1027760cqsLIZ3.LJJJJIZL.LIZJ()) == null) {
                        objLIZJ = "";
                    }
                    jSONObject.put("channel_name", objLIZJ);
                    C1027660cqi c1027660cqi2 = this.LIZ.LIZJ;
                    if (c1027660cqi2 != null && (c1041880dDe = c1027660cqi2.LJLILLLLZI) != null && (objLIZJ2 = c1041880dDe.LIZJ()) != null) {
                        obj = objLIZJ2;
                    }
                    jSONObject.put("page_id", obj);
                    C1537710q7N c1537710q7N = this.LJIIJJI;
                    if (c1537710q7N != null) {
                        c1537710q7N.LIZ("ad_lynx_close", jSONObject);
                    }
                }
            } else if (activity == null || !activity.isFinishing()) {
                return;
            }
            if (!this.LIZIZ) {
                LIZLLL("load");
            }
        }
    }
}
