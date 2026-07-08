package com.ss.android.ugc.aweme.fe.method;

import X.C1035880d3y;
import X.C1035890d3z;
import X.C123100dR;
import X.C1906580ziK;
import X.EnumC1037150d61;
import X.InterfaceC1048350dO5;
import android.os.SystemClock;
import android.webkit.WebView;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.ies.web.jsbridge.IESJsBridge;
import com.bytedance.lynx.hybrid.webkit.WebKitView;
import com.ss.android.ugc.aweme.ad.recording.engageinfo.IAdLandPageEngageInfoProvider;
import com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.web.service.IAdWebUtils;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes17.dex */
public final class SendLogMethod extends BaseCommonJavaMethod {
    public final InterfaceC1048350dO5 LLILLL;

    @Override // com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    public SendLogMethod(IESJsBridge iESJsBridge, InterfaceC1048350dO5 interfaceC1048350dO5) {
        super(iESJsBridge);
        this.LLILLL = interfaceC1048350dO5;
    }

    public final void LIZIZ(JSONObject jSONObject, C1035880d3y c1035880d3y) throws JSONException {
        Long l;
        jSONObject.put("tt_visible", !C1906580ziK.LJI());
        if (c1035880d3y == null) {
            jSONObject.put("page_visible_status", EnumC1037150d61.UNKNOWN.getValue());
            return;
        }
        jSONObject.put("stopLoading", c1035880d3y.getWebLoadStatusModel().stopLoading);
        jSONObject.put("landing_page_style", c1035880d3y.isNineScreen());
        jSONObject.put("lp_refer", c1035880d3y.getRefer());
        jSONObject.put("sheet_ratio", c1035880d3y.getSheetRatio());
        C1035890d3z adCommonData = c1035880d3y.getAdCommonData();
        jSONObject.put("page_visible_status", adCommonData.webViewVisible.getValue());
        Long l2 = adCommonData.enterWebViewTimeStamp;
        if (adCommonData.webViewVisible == EnumC1037150d61.INVISIBLE && (l = adCommonData.exitWebViewTimeStamp) != null) {
            jSONObject.put("time_to_leave", SystemClock.elapsedRealtime() - l.longValue());
            if (l2 != null) {
                jSONObject.put("page_stay_duration", l.longValue() - l2.longValue());
            } else {
                return;
            }
        } else if (l2 == null) {
            return;
        }
        jSONObject.put("time_to_page_show", SystemClock.elapsedRealtime() - l2.longValue());
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x0241  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x02a5  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x02ea  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x046d  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x0482  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x021d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01be  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01ca A[Catch: JSONException -> 0x020b, TRY_LEAVE, TryCatch #4 {JSONException -> 0x020b, blocks: (B:78:0x01b7, B:84:0x01ca, B:80:0x01c0, B:82:0x01c6), top: B:197:0x01ad }] */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0204  */
    @Override // com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void handle(org.json.JSONObject r33, X.InterfaceC1041760dDS r34) throws org.json.JSONException {
        /*
            Method dump skipped, instruction units count: 1162
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.fe.method.SendLogMethod.handle(org.json.JSONObject, X.0dDS):void");
    }

    public final void LIZ(JSONObject jSONObject, C1035880d3y c1035880d3y, String str) throws JSONException {
        String strLIZIZ;
        if (c1035880d3y == null) {
            return;
        }
        if (C123100dR.LIZ(str)) {
            jSONObject.putOpt("rule_name", str);
        }
        if (jSONObject.has("recording_index")) {
            return;
        }
        IAdLandPageEngageInfoProvider iAdLandPageEngageInfoProvider = (IAdLandPageEngageInfoProvider) PluggableExtentionKt.pluggableSpi$default(IAdLandPageEngageInfoProvider.class, false, false, false, 14, null);
        Object obj = "";
        if (iAdLandPageEngageInfoProvider == null || (strLIZIZ = iAdLandPageEngageInfoProvider.LIZIZ(c1035880d3y.getRealCreativeIdStr())) == null) {
            strLIZIZ = "";
        }
        if (strLIZIZ.length() > 0) {
            jSONObject.putOpt("engaged_info", strLIZIZ);
        }
        Object containerId = c1035880d3y.getContainerId();
        if (containerId != null) {
            obj = containerId;
        }
        jSONObject.putOpt("container_id", obj);
        jSONObject.putOpt("recording_time", Long.valueOf(System.currentTimeMillis()));
        jSONObject.putOpt("recording_index", Integer.valueOf(c1035880d3y.getRecordingModel().eventIndex.incrementAndGet()));
        WebView webView = this.LLILLJJLI.LIZ;
        Object objTv = null;
        if (!(webView instanceof WebKitView)) {
            webView = null;
        }
        IAdWebUtils iAdWebUtils = (IAdWebUtils) PluggableExtentionKt.pluggableSpi$default(IAdWebUtils.class, false, false, false, 14, null);
        if (iAdWebUtils != null) {
            objTv = iAdWebUtils.tv(webView);
        }
        jSONObject.putOpt("page_info_id", objTv);
    }
}
