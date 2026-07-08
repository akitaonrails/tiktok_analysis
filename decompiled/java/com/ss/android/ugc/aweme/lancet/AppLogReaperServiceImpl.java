package com.ss.android.ugc.aweme.lancet;

import X.C0SRQ;
import X.C0XEB;
import X.C260920AKk;
import X.C486660J6q;
import X.C486680J6s;
import X.C786410Ut5;
import X.C837920Wty;
import X.C844470XAv;
import android.text.TextUtils;
import android.util.LruCache;
import com.bytedance.ies.ugc.statisticloggerapi.IAppLogReaperService;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.inferenceengine.IInferenceEngineService;
import com.ss.ugc.clientai.core.api.FeatureServiceManager;
import com.tiktok.ef.i18n.service.manager.I18nServiceApi;
import com.tiktok.ef.i18nmanagerapi.service.i18n.I18nManagerServiceApi;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes24.dex */
public class AppLogReaperServiceImpl implements IAppLogReaperService {
    public final I18nServiceApi LIZ = (I18nServiceApi) PluggableExtentionKt.pluggableSpi(I18nServiceApi.class);

    @Override // com.bytedance.ies.ugc.statisticloggerapi.IAppLogReaperService
    public final void LIZ(JSONObject jSONObject) {
        try {
            System.currentTimeMillis();
            ((IInferenceEngineService) PluggableExtentionKt.pluggableSpi(IInferenceEngineService.class)).LIZ();
            JSONObject batchFeature = FeatureServiceManager.instance().getProducer("f_common_params", 0).getBatchFeature((List) C0XEB.LIZ.getValue(), null, "updateLogHeader", false);
            Iterator<String> itKeys = batchFeature.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                String string = JSONObjectProtectorUtils.getString(batchFeature, next);
                if (next.equals("language")) {
                    try {
                        jSONObject.put(next, string);
                    } catch (JSONException e) {
                        TryCatchGuardChecker.doCheck(e);
                    }
                } else {
                    if (next.equals("app_language") && string.equals("zh-Hans")) {
                        string = "zh-Hant";
                    }
                    LIZIZ(next, string, jSONObject);
                }
            }
            if (((Boolean) C260920AKk.LIZ.getValue()).booleanValue()) {
                I18nManagerServiceApi i18nManagerServiceApiLIZ = this.LIZ.LIZ();
                C844470XAv.LIZ.getClass();
                String strLJIILJJIL = i18nManagerServiceApiLIZ.LJIILJJIL(C844470XAv.LIZ());
                I18nManagerServiceApi i18nManagerServiceApiLIZ2 = this.LIZ.LIZ();
                C844470XAv.LIZ();
                Locale localeLJ = i18nManagerServiceApiLIZ2.LJ();
                StringBuffer stringBuffer = new StringBuffer();
                if (localeLJ != null) {
                    stringBuffer.append(C786410Ut5.t2(localeLJ));
                    if (!TextUtils.isEmpty(localeLJ.getScript())) {
                        stringBuffer.append("-");
                        stringBuffer.append(localeLJ.getScript());
                    }
                    LruCache<Integer, String> lruCache = C0SRQ.LIZ;
                    String strLIZIZ = C837920Wty.LIZIZ(localeLJ);
                    if (!TextUtils.isEmpty(strLIZIZ)) {
                        stringBuffer.append("-");
                        stringBuffer.append(strLIZIZ);
                    }
                }
                LIZIZ("app_locale", strLJIILJJIL, jSONObject);
                LIZIZ("sys_locale", stringBuffer.toString(), jSONObject);
            }
            if (!C486680J6s.LIZ().getEnableUpdateFollowWidgetOpt()) {
                C486660J6q.LJIIIIZZ();
            }
        } catch (AssertionError | Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
    }

    public static void LIZIZ(String str, String str2, JSONObject jSONObject) {
        if (jSONObject.isNull(str)) {
            try {
                jSONObject.put(str, str2);
            } catch (JSONException e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
    }
}
