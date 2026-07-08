package com.ss.android.ugc.aweme.fe.method;

import X.C20684915wt;
import X.InterfaceC1041760dDS;
import android.text.TextUtils;
import android.view.View;
import android.webkit.WebView;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.btm.api.BtmSDK;
import com.bytedance.android.btm.api.model.PageFinder;
import com.bytedance.ies.web.jsbridge.IESJsBridge;
import com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
public final class SendLogV3Method extends BaseCommonJavaMethod {
    public SendLogV3Method() {
        super(null);
    }

    @Override // com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    public SendLogV3Method(IESJsBridge iESJsBridge) {
        super(iESJsBridge);
    }

    @Override // com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod
    public final void handle(JSONObject jSONObject, InterfaceC1041760dDS interfaceC1041760dDS) {
        WebView webView;
        String string;
        String str = "";
        if (jSONObject == null) {
            if (interfaceC1041760dDS != null) {
                interfaceC1041760dDS.LIZ(0, "");
                return;
            }
            return;
        }
        String strOptString = jSONObject.optString("eventName");
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("params");
        if (!TextUtils.isEmpty(strOptString) && jSONObjectOptJSONObject != null) {
            Iterator<String> itKeys = jSONObjectOptJSONObject.keys();
            HashMap map = new HashMap();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                String strOptString2 = jSONObjectOptJSONObject.optString(next);
                itKeys.remove();
                map.put(next, strOptString2);
            }
            String str2 = (String) map.get("btm");
            if (str2 == null) {
                str2 = "";
            }
            String str3 = (String) map.get("btm_show_id");
            if (str3 != null) {
                str = str3;
            }
            if (str2.length() > 0 && str.length() == 0) {
                BtmSDK btmSDK = BtmSDK.INSTANCE;
                IESJsBridge iESJsBridge = this.LLILLJJLI;
                if (iESJsBridge != null) {
                    webView = iESJsBridge.LIZ;
                } else {
                    webView = null;
                }
                for (Map.Entry entry : BtmSDK.createReportParams$default(btmSDK, str2, PageFinder.via((View) webView), null, 4, null).entrySet()) {
                    Object value = entry.getValue();
                    if (value != null && (string = value.toString()) != null) {
                        map.put(entry.getKey(), string);
                    }
                }
            }
            C20684915wt.LJFF(strOptString, map);
            if (interfaceC1041760dDS == null) {
                return;
            }
            interfaceC1041760dDS.onSuccess(new JSONObject());
            return;
        }
        if (interfaceC1041760dDS == null) {
            return;
        }
        interfaceC1041760dDS.LIZ(0, "");
    }
}
