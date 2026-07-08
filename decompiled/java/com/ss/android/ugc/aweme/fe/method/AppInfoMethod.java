package com.ss.android.ugc.aweme.fe.method;

import X.C0WZX;
import X.C1059360dfq;
import X.C10EU;
import X.C1593730rZj;
import X.C20123913ob;
import X.C2204961BRm;
import X.C844470XAv;
import X.InterfaceC1041760dDS;
import android.content.ContentResolver;
import android.text.TextUtils;
import android.text.format.DateFormat;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.ies.web.jsbridge.IESJsBridge;
import com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.specact.api.ISpecActService;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes17.dex */
public final class AppInfoMethod extends BaseCommonJavaMethod {
    public AppInfoMethod() {
        super(null);
    }

    @Override // com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    public AppInfoMethod(IESJsBridge iESJsBridge) {
        super(iESJsBridge);
    }

    @Override // com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod
    public final void handle(JSONObject jSONObject, InterfaceC1041760dDS interfaceC1041760dDS) throws Throwable {
        String strOptString;
        String strLLIIIZ;
        int iIntValue;
        JSONObject jSONObject2 = new JSONObject();
        if (jSONObject != null) {
            strOptString = jSONObject.optString("permissionGroup");
        } else {
            strOptString = null;
        }
        for (Map.Entry entry : ((HashMap) C1059360dfq.LIZ(strOptString)).entrySet()) {
            jSONObject2.put((String) entry.getKey(), entry.getValue());
        }
        C844470XAv.LIZ.getClass();
        ContentResolver contentResolver = C844470XAv.LIZ().getContentResolver();
        if (contentResolver != null) {
            if (TextUtils.equals("time_12_24", "android_id")) {
                if (C10EU.LJIILIIL() && C20123913ob.LIZ()) {
                    strLLIIIZ = "";
                } else {
                    if (TextUtils.isEmpty(C20123913ob.LIZ)) {
                        C20123913ob.LIZ = C2204961BRm.LLIIIZ(contentResolver, "time_12_24", new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOytLZLLyDqfCkR6Te0TVi9JQfJ0eZf7", null));
                    }
                    strLLIIIZ = C20123913ob.LIZ;
                }
            } else {
                strLLIIIZ = C2204961BRm.LLIIIZ(contentResolver, "time_12_24", new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOytLZLLyDqfCkR6Te0TVi9JQfJ0eZf7", null));
            }
        } else if (DateFormat.is24HourFormat(C844470XAv.LIZ())) {
            strLLIIIZ = "24";
        } else {
            strLLIIIZ = "12";
        }
        jSONObject2.put("time_system", strLLIIIZ);
        jSONObject2.put("code", 1);
        if (jSONObject2.has("aid")) {
            ISpecActService iSpecActService = (ISpecActService) PluggableExtentionKt.pluggableSpi$default(ISpecActService.class, false, false, false, 14, null);
            if (iSpecActService != null) {
                iSpecActService.LJJIIZI();
            }
            Integer numLJJIII = C1593730rZj.LIZIZ.LJJIII();
            if (numLJJIII != null) {
                iIntValue = numLJJIII.intValue();
            } else {
                iIntValue = 1233;
            }
            jSONObject2.put("aid", iIntValue);
        }
        if (interfaceC1041760dDS != null) {
            interfaceC1041760dDS.LIZIZ(jSONObject2);
        }
    }
}
