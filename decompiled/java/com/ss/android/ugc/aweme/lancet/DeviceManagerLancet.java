package com.ss.android.ugc.aweme.lancet;

import X.C0WZX;
import X.C0X9S;
import X.C10EU;
import X.C1515120pWw;
import X.C20123713oZ;
import X.C2204961BRm;
import X.C557050Lt1;
import X.C807400Vlq;
import X.C844130X9n;
import X.C844470XAv;
import X.InterfaceC1485405rg;
import X.InterfaceC1501170pAR;
import X.InterfaceC1501310pAf;
import X.InterfaceC594300NSq;
import Y.ARunnableS18S1100000_13;
import Y.ARunnableS92S0000000_13;
import android.content.ContentResolver;
import android.content.Context;
import android.text.TextUtils;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.keva.Keva;
import com.bytedance.pumbaa.utility.method_id.MethodIDManager;
import com.bytedance.retrofit2.Retrofit;
import com.bytedance.ropa.encrypt.RopaEncrypt;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.common.applog.AppLog;
import com.ss.android.ugc.aweme.lancet.DeviceManagerLancet;
import com.ss.android.ugc.aweme.settings.RetryConfig;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes14.dex */
public final class DeviceManagerLancet {
    public static long LIZ = -1;
    public static final C557050Lt1 LIZIZ = new C557050Lt1(false);
    public static final C557050Lt1 LIZJ = new C557050Lt1(false);
    public static final C557050Lt1 LIZLLL = new C557050Lt1(false);
    public static String LJ = null;
    public static int LJFF = 0;
    public static final ScheduledExecutorService LJI = C807400Vlq.LJ();

    public interface Api {
        @InterfaceC1501170pAR("/track_event")
        @InterfaceC1501310pAf({"Content-Type: application/json"})
        C0X9S<String> post(@InterfaceC1485405rg Map map);
    }

    public static String LIZ(ContentResolver contentResolver) {
        if (TextUtils.equals("android_id", "android_id")) {
            if (C10EU.LJIILIIL() && C20123713oZ.LIZ()) {
                return "";
            }
            if (TextUtils.isEmpty(C20123713oZ.LIZ)) {
                C20123713oZ.LIZ = C2204961BRm.LLIIIL(contentResolver, "android_id", new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOapbZzLyHyZ5tEPFGT6QU4fxpVwOaNgXIpI", null));
            }
            return C20123713oZ.LIZ;
        }
        return C2204961BRm.LLIIIL(contentResolver, "android_id", new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOapbZzLyHyZ5tEPFGT6QU4fxpVwOaNgXIpI", null));
    }

    public static void LIZLLL(Context context, String str) {
        if (!"network_failed".equals(str)) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            long j = LIZ;
            if (j != -1 && jCurrentTimeMillis / 3600000 == j / 3600000) {
                return;
            }
            LJFF = 0;
            LIZ = jCurrentTimeMillis;
        }
        if (C844130X9n.LIZ == null) {
            SettingsManager.LIZLLL().getClass();
            C844130X9n.LIZ = Boolean.valueOf(SettingsManager.LIZ("pumbaa_parameter_report_settings", true));
        }
        Boolean bool = C844130X9n.LIZ;
        if (bool == null || bool.booleanValue()) {
            LJI.execute(new ARunnableS18S1100000_13(context, str, 4));
        }
    }

    public static void LIZJ(int i, String str, Map map) {
        boolean zLJI = MethodIDManager.LJI(137670);
        Retrofit retrofitLJIILIIL = C1515120pWw.LJIILIIL("https://cp-rp.tiktokv.com");
        HashMap map2 = new HashMap();
        C844470XAv.LIZ.getClass();
        map2.put("app_id", String.valueOf(C844470XAv.LJIIJ));
        if (LJ == null) {
            LJ = AppLog.com_ss_android_common_applog_AppLog_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getServerDeviceId();
        }
        map2.put("did", LJ);
        map2.put("report_type", "OneTime");
        map2.put("trigger_source", str);
        map2.put("app_version", C844470XAv.LJFF());
        if ("network_failed".equals(str)) {
            i = 1;
        }
        map2.put("is_data_changed", Integer.valueOf(i));
        map2.put("os", "android");
        map2.putAll(map);
        Api api = (Api) retrofitLJIILIIL.LIZ(Api.class);
        if (api == null) {
            if (zLJI) {
                MethodIDManager.LJ();
            }
        } else {
            api.post(map2).enqueue(new InterfaceC594300NSq<String>() { // from class: X.0X9k
                @Override // X.InterfaceC594300NSq
                public final void onFailure(C0X9S<String> c0x9s, Throwable th) {
                    int i2;
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("type", "report_error");
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put("error", th.getMessage());
                        C793770VBv.LJII("sky_eye_apm_log", jSONObject, null, jSONObject2);
                        RetryConfig retryConfig = (RetryConfig) C844110X9l.LIZIZ.getValue();
                        if (retryConfig == null) {
                            retryConfig = C844110X9l.LIZ;
                        }
                        if (retryConfig.enable && (i2 = DeviceManagerLancet.LJFF) < retryConfig.retryMaxCount) {
                            DeviceManagerLancet.LJFF = i2 + 1;
                            DeviceManagerLancet.LJI.schedule(new ARunnableS92S0000000_13(19), retryConfig.interval, TimeUnit.SECONDS);
                        }
                    } catch (JSONException e) {
                        TryCatchGuardChecker.doCheck(e);
                    }
                }

                @Override // X.InterfaceC594300NSq
                public final void onResponse(C0X9S<String> c0x9s, C0X52<String> c0x52) {
                    String str2;
                    if (c0x52 != null && (str2 = c0x52.LIZIZ) != null) {
                        str2.getClass();
                    }
                }
            });
            if (zLJI) {
                MethodIDManager.LJ();
            }
        }
    }

    public static String LIZIZ(String str, String str2, Keva keva, AtomicInteger atomicInteger) {
        int i;
        if (!keva.getString(str2, "").equals(str)) {
            keva.storeString(str2, str);
            i = 1;
        } else {
            i = 0;
        }
        if (atomicInteger.get() == 0) {
            atomicInteger.set(i);
        }
        return RopaEncrypt.getEncryptSeqV2(str, 1, str2).getData();
    }
}
