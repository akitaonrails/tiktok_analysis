package com.ss.android.ugc.aweme.recording;

import X.C01GW;
import X.C0PEM;
import X.C1035880d3y;
import X.C1042130dE3;
import X.C1042260dEG;
import X.C1042430dEX;
import X.C1042440dEY;
import X.C1042450dEZ;
import X.C1058290de7;
import X.C13BV;
import X.C2274571E1f;
import X.C23250099c;
import X.C817503Hh;
import X.InterfaceC1038080d7W;
import android.webkit.WebView;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ad.recording.IRecordingInteractionInterceptor;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.log.AdWebEventLogger;
import com.ss.android.ugc.aweme.settings.IABRecordingInterceptJsLogModel;
import com.ss.android.ugc.aweme.settings.JsLogInterceptRule;
import com.ss.android.ugc.aweme.settings.JsLogSelector;
import com.ss.android.ugc.aweme.web.service.IAdWebUtils;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.AwS6S3100000_16;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes17.dex */
public final class RecordingInteractionInterceptor implements IRecordingInteractionInterceptor {
    @Override // com.ss.android.ugc.aweme.ad.recording.IRecordingInteractionInterceptor
    public final boolean LIZLLL(C1035880d3y c1035880d3y, String str) {
        if (c1035880d3y == null) {
            return false;
        }
        C1042450dEZ.LIZ.getClass();
        if (!C1042450dEZ.LIZLLL(c1035880d3y)) {
            return false;
        }
        return Intrinsics.LJFF(str, "recordingJsEvent");
    }

    @Override // com.ss.android.ugc.aweme.ad.recording.IRecordingInteractionInterceptor
    public final void LIZ(JSONObject jSONObject, C1035880d3y c1035880d3y, InterfaceC1038080d7W interfaceC1038080d7W) {
        String strOptString;
        String strLJIJJ;
        if (!C1042260dEG.LIZ().enableTransferPixel) {
            return;
        }
        System.currentTimeMillis();
        String strOptString2 = jSONObject.optString("trackLogData");
        if (strOptString2 != null && !a0.LJJJIL(strOptString2)) {
            try {
                JSONObject jSONObject2 = new JSONObject(strOptString2);
                String strOptString3 = jSONObject2.optString("message_id");
                if (strOptString3 != null && !a0.LJJJIL(strOptString3)) {
                    if (jSONObject2.has("auto_collected_properties")) {
                        strOptString = jSONObject2.optString("action");
                    } else {
                        strOptString = jSONObject2.optString("event");
                    }
                    if (strOptString != null && !a0.LJJJIL(strOptString) && !Intrinsics.LJFF(strOptString, "Pf")) {
                        if (interfaceC1038080d7W == null || (strLJIJJ = interfaceC1038080d7W.LJIJJ()) == null) {
                            strLJIJJ = "";
                        }
                        new AdWebEventLogger(c1035880d3y).logAd(C2274571E1f.LIZ, c1035880d3y.getAwemeRawAd(), new AwS6S3100000_16(c1035880d3y, strOptString, strOptString3, strLJIJJ, 4));
                    }
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.ad.recording.IRecordingInteractionInterceptor
    public final Pair<Boolean, String> LIZIZ(JSONObject jSONObject, C1035880d3y c1035880d3y, WebView webView) {
        String strTv;
        C01GW c01gw = C1042440dEY.LIZIZ;
        if (!((IABRecordingInterceptJsLogModel) c01gw.getValue()).recordingJsLogInterceptEnable) {
            return new Pair<>(Boolean.FALSE, "");
        }
        List<JsLogInterceptRule> list = ((IABRecordingInterceptJsLogModel) c01gw.getValue()).recordingJsLogInterceptRuleList;
        if (list == null) {
            list = C13BV.INSTANCE;
        }
        for (JsLogInterceptRule jsLogInterceptRule : list) {
            List<JsLogSelector> list2 = jsLogInterceptRule.selector;
            if (list2 != null && !list2.isEmpty()) {
                for (JsLogSelector jsLogSelector : list2) {
                    String str = jsLogSelector.path;
                    String str2 = jsLogSelector.value;
                    if (!jSONObject.has(str) || !Intrinsics.LJFF(jSONObject.optString(str), str2)) {
                        break;
                    }
                }
                IAdWebUtils iAdWebUtils = (IAdWebUtils) PluggableExtentionKt.pluggableSpi$default(IAdWebUtils.class, false, false, false, 14, null);
                if (iAdWebUtils != null) {
                    strTv = iAdWebUtils.tv(webView);
                } else {
                    strTv = null;
                }
                String str3 = jsLogInterceptRule.ruleName;
                if (c1035880d3y != null) {
                    new AdWebEventLogger(c1035880d3y).logAd(C2274571E1f.LIZ, c1035880d3y.getAwemeRawAd(), new C1058290de7(jSONObject.optString("eventName"), jSONObject.optString("labelName"), str3, jSONObject, c1035880d3y, strTv));
                }
                return new Pair<>(Boolean.TRUE, jsLogInterceptRule.ruleName);
            }
        }
        return new Pair<>(Boolean.FALSE, "");
    }

    @Override // com.ss.android.ugc.aweme.ad.recording.IRecordingInteractionInterceptor
    public final void LIZJ(JSONObject jSONObject, C1035880d3y c1035880d3y, InterfaceC1038080d7W interfaceC1038080d7W) {
        String originalWebUrl;
        String strLJIJJ;
        C1042450dEZ.LIZ.getClass();
        if (c1035880d3y != null) {
            C1042130dE3 c1042130dE3 = C1042130dE3.LIZ;
            AwemeRawAd awemeRawAd = c1035880d3y.getAwemeRawAd();
            String str = "";
            if (awemeRawAd == null || (originalWebUrl = awemeRawAd.getOriginalWebUrl()) == null) {
                originalWebUrl = "";
            }
            String currentUrlOrWebUrl = c1035880d3y.getCurrentUrlOrWebUrl();
            if (currentUrlOrWebUrl == null) {
                currentUrlOrWebUrl = "";
            }
            if (interfaceC1038080d7W != null && (strLJIJJ = interfaceC1038080d7W.LJIJJ()) != null) {
                str = strLJIJJ;
            }
            c1042130dE3.getClass();
            C23250099c.LIZLLL(C817503Hh.LL, C0PEM.LIZJ, null, new C1042430dEX(C1042130dE3.LIZLLL(originalWebUrl, currentUrlOrWebUrl, "", c1035880d3y, str, null), jSONObject, c1035880d3y, null), 2);
        }
    }
}
