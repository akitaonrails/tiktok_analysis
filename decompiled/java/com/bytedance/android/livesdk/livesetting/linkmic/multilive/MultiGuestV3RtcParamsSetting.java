package com.bytedance.android.livesdk.livesetting.linkmic.multilive;

import X.C19748512Ol;
import X.C20441214yg;
import X.C2188811AlT;
import android.util.LruCache;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import com.google.gson.n;
import com.google.gson.p;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
@SettingsKey("muilt_live_pipeline_params")
public final class MultiGuestV3RtcParamsSetting {
    public static final String DEFAULT = "";
    public static n cache;
    public static volatile Function2<? super String, ? super Throwable, Unit> loader;
    public static final MultiGuestV3RtcParamsSetting INSTANCE = new MultiGuestV3RtcParamsSetting();
    public static final LruCache<String, RtcParams> configCache = new LruCache<>(6);

    private final n getCache() {
        n nVarLJIILIIL = cache;
        if (nVarLJIILIIL == null) {
            try {
                new p();
                nVarLJIILIIL = p.LIZJ(getValue()).LJIILIIL();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                Function2<? super String, ? super Throwable, Unit> function2 = loader;
                if (function2 != null) {
                    function2.invoke("parse whole json error", th);
                }
                nVarLJIILIIL = null;
            }
        }
        cache = nVarLJIILIIL;
        return nVarLJIILIIL;
    }

    public final String getValue() {
        return SettingsManager.INSTANCE.getStringValue("muilt_live_pipeline_params", DEFAULT);
    }

    public final RtcParams getRtcParams(String str, int i, Function2<? super String, ? super Throwable, Unit> function2) {
        String strLIZIZ;
        n nVarLJJIJ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("getRtcParams ");
        sbLIZ.append(str);
        sbLIZ.append('_');
        sbLIZ.append(i);
        C20441214yg.LIZIZ("RTC", C2188811AlT.LIZIZ(sbLIZ));
        if (str == null) {
            return null;
        }
        if (loader == null) {
            loader = function2;
        }
        if (i <= 0) {
            strLIZIZ = str;
        } else {
            try {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append(str);
                sbLIZ2.append('_');
                sbLIZ2.append(i);
                sbLIZ2.append('p');
                strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                Function2<? super String, ? super Throwable, Unit> function22 = loader;
                if (function22 != null) {
                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                    sbLIZ3.append("parse config json error ");
                    sbLIZ3.append(str);
                    sbLIZ3.append('-');
                    sbLIZ3.append(i);
                    function22.invoke(C2188811AlT.LIZIZ(sbLIZ3), th);
                    return null;
                }
            }
        }
        LruCache<String, RtcParams> lruCache = configCache;
        RtcParams rtcParams = lruCache.get(strLIZIZ);
        if (rtcParams == null) {
            n cache2 = INSTANCE.getCache();
            if (cache2 != null && (nVarLJJIJ = cache2.LJJIJ(str)) != null) {
                if (i > 0) {
                    StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                    sbLIZ4.append(i);
                    sbLIZ4.append('p');
                    if (nVarLJJIJ.LJJIJIIJIL(C2188811AlT.LIZIZ(sbLIZ4))) {
                        Gson gson = C19748512Ol.LIZIZ;
                        StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                        sbLIZ5.append(i);
                        sbLIZ5.append('p');
                        Object objLIZJ = gson.LIZJ(nVarLJJIJ.LJJIIZ(C2188811AlT.LIZIZ(sbLIZ5)), RtcParams.class);
                        lruCache.put(strLIZIZ, (RtcParams) objLIZJ);
                        return (RtcParams) objLIZJ;
                    }
                }
                Object objLIZJ2 = C19748512Ol.LIZIZ.LIZJ(nVarLJJIJ, RtcParams.class);
                lruCache.put(strLIZIZ, (RtcParams) objLIZJ2);
                return (RtcParams) objLIZJ2;
            }
            return null;
        }
        return rtcParams;
    }
}
