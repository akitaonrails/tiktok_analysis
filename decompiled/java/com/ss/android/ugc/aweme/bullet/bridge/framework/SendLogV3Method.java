package com.ss.android.ugc.aweme.bullet.bridge.framework;

import X.C1051660dTQ;
import X.C1063290dmB;
import X.C1893310zMv;
import X.C20684915wt;
import X.InterfaceC1019840ce6;
import X.InterfaceC1541990qEH;
import android.text.TextUtils;
import android.view.View;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.btm.api.BtmSDK;
import com.bytedance.android.btm.api.model.PageFinder;
import com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes17.dex */
public final class SendLogV3Method extends BaseBridgeMethod {
    public static final C1063290dmB Companion = new Object() { // from class: X.0dmB
    };
    public final String name;

    @Override // com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod, androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod, com.bytedance.ies.bullet.ui.common.bridge.ContainerBridgeMethod, X.InterfaceC1051460dT6
    public String getName() {
        return this.name;
    }

    public SendLogV3Method(C1051660dTQ c1051660dTQ) {
        super(c1051660dTQ);
        this.name = "sendLogV3";
    }

    private final void sendLogV3(JSONObject jSONObject, InterfaceC1019840ce6 interfaceC1019840ce6) {
        boolean z;
        View viewE1;
        String string;
        String str = "";
        if (jSONObject == null) {
            interfaceC1019840ce6.LIZ(0, "");
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
            if (str2.length() > 0) {
                z = true;
            } else {
                z = false;
            }
            View viewE12 = null;
            if (z && str.length() == 0) {
                BtmSDK btmSDK = BtmSDK.INSTANCE;
                InterfaceC1541990qEH interfaceC1541990qEH = (InterfaceC1541990qEH) this.contextProviderFactory.LIZIZ(InterfaceC1541990qEH.class);
                if (interfaceC1541990qEH != null) {
                    viewE1 = interfaceC1541990qEH.e1();
                } else {
                    viewE1 = null;
                }
                for (Map.Entry entry : BtmSDK.createReportParams$default(btmSDK, str2, PageFinder.via(viewE1), null, 4, null).entrySet()) {
                    Object value = entry.getValue();
                    if (value != null && (string = value.toString()) != null) {
                        map.put(entry.getKey(), string);
                    }
                }
            }
            C1893310zMv c1893310zMv = C1893310zMv.LIZIZ;
            InterfaceC1541990qEH interfaceC1541990qEH2 = (InterfaceC1541990qEH) this.contextProviderFactory.LIZIZ(InterfaceC1541990qEH.class);
            if (interfaceC1541990qEH2 != null) {
                viewE12 = interfaceC1541990qEH2.e1();
            }
            Map mapLIZLLL = c1893310zMv.LIZLLL(PageFinder.via(viewE12), strOptString, map);
            if (mapLIZLLL != null) {
                for (Map.Entry entry2 : mapLIZLLL.entrySet()) {
                    map.put(entry2.getKey(), entry2.getValue());
                }
            }
            C20684915wt.LJFF(strOptString, map);
            interfaceC1019840ce6.onSuccess(new JSONObject());
            return;
        }
        interfaceC1019840ce6.LIZ(0, "");
    }

    @Override // com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod
    public void handle(JSONObject jSONObject, InterfaceC1019840ce6 interfaceC1019840ce6) {
        sendLogV3(jSONObject, interfaceC1019840ce6);
    }
}
