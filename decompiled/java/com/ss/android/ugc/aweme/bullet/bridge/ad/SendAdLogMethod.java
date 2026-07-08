package com.ss.android.ugc.aweme.bullet.bridge.ad;

import X.C0T4N;
import X.C1019720cdu;
import X.C1051660dTQ;
import X.C1440005kM;
import X.C988850bq7;
import X.InterfaceC1019840ce6;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes17.dex */
public final class SendAdLogMethod extends BaseBridgeMethod {
    public static final C1019720cdu Companion = new Object() { // from class: X.0cdu
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

    public SendAdLogMethod(C1051660dTQ c1051660dTQ) {
        super(c1051660dTQ);
        this.name = "sendAdLog";
    }

    @Override // com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod
    public void handle(JSONObject jSONObject, InterfaceC1019840ce6 interfaceC1019840ce6) {
        String strOptString = jSONObject.optString("func");
        sendAdLog(jSONObject, C988850bq7.LIZ(), interfaceC1019840ce6);
        C1440005kM.LIZ(new C0T4N(strOptString, jSONObject));
    }

    /* JADX WARN: Not initialized variable reg: 7, insn: 0x0275: IF  (r7 I:??[int, boolean, OBJECT, ARRAY, byte, short, char]) == (0 ??[int, boolean, OBJECT, ARRAY, byte, short, char])  -> B:179:? (LINE:50332277), block:B:164:0x0275 */
    /* JADX WARN: Not initialized variable reg: 8, insn: 0x0272: INVOKE (r8 I:org.json.JSONObject), (r6 I:java.lang.String) VIRTUAL call: org.json.JSONObject.optString(java.lang.String):java.lang.String A[MD:(java.lang.String):java.lang.String (c)] (LINE:50332274), block:B:163:0x026c */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00cd A[Catch: Exception -> 0x026b, TryCatch #0 {Exception -> 0x026b, blocks: (B:3:0x0005, B:6:0x0039, B:8:0x004f, B:10:0x0054, B:12:0x005a, B:14:0x0060, B:15:0x0064, B:17:0x006a, B:18:0x0078, B:21:0x0082, B:23:0x0086, B:36:0x00aa, B:38:0x00ae, B:41:0x00b5, B:43:0x00b9, B:45:0x00bf, B:48:0x00cd, B:50:0x00d1, B:53:0x00d8, B:55:0x00dc, B:57:0x00e2, B:60:0x00e9, B:62:0x00ed, B:64:0x00f1, B:65:0x00f5, B:25:0x008c, B:29:0x0096, B:31:0x009a, B:33:0x00a0, B:34:0x00a4, B:70:0x0103, B:71:0x0109, B:76:0x0129, B:77:0x012b, B:78:0x012e, B:80:0x013b, B:81:0x0142, B:83:0x014a, B:85:0x014e, B:87:0x0154, B:90:0x015c, B:92:0x0163, B:93:0x0167, B:95:0x016d, B:97:0x0179, B:98:0x017d, B:100:0x0183, B:102:0x0189, B:105:0x0191, B:107:0x01a5, B:108:0x01a9, B:110:0x01af, B:111:0x01bd, B:113:0x01c5, B:115:0x01c9, B:127:0x0209, B:129:0x020d, B:132:0x0214, B:134:0x0218, B:136:0x021e, B:138:0x022a, B:140:0x022e, B:143:0x0235, B:145:0x0239, B:147:0x023f, B:150:0x0246, B:152:0x024c, B:153:0x0250, B:117:0x01cf, B:119:0x01da, B:121:0x01e0, B:123:0x01e4, B:125:0x01ea, B:126:0x0205, B:156:0x025c, B:158:0x0260, B:160:0x0265), top: B:167:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00e9 A[Catch: Exception -> 0x026b, TryCatch #0 {Exception -> 0x026b, blocks: (B:3:0x0005, B:6:0x0039, B:8:0x004f, B:10:0x0054, B:12:0x005a, B:14:0x0060, B:15:0x0064, B:17:0x006a, B:18:0x0078, B:21:0x0082, B:23:0x0086, B:36:0x00aa, B:38:0x00ae, B:41:0x00b5, B:43:0x00b9, B:45:0x00bf, B:48:0x00cd, B:50:0x00d1, B:53:0x00d8, B:55:0x00dc, B:57:0x00e2, B:60:0x00e9, B:62:0x00ed, B:64:0x00f1, B:65:0x00f5, B:25:0x008c, B:29:0x0096, B:31:0x009a, B:33:0x00a0, B:34:0x00a4, B:70:0x0103, B:71:0x0109, B:76:0x0129, B:77:0x012b, B:78:0x012e, B:80:0x013b, B:81:0x0142, B:83:0x014a, B:85:0x014e, B:87:0x0154, B:90:0x015c, B:92:0x0163, B:93:0x0167, B:95:0x016d, B:97:0x0179, B:98:0x017d, B:100:0x0183, B:102:0x0189, B:105:0x0191, B:107:0x01a5, B:108:0x01a9, B:110:0x01af, B:111:0x01bd, B:113:0x01c5, B:115:0x01c9, B:127:0x0209, B:129:0x020d, B:132:0x0214, B:134:0x0218, B:136:0x021e, B:138:0x022a, B:140:0x022e, B:143:0x0235, B:145:0x0239, B:147:0x023f, B:150:0x0246, B:152:0x024c, B:153:0x0250, B:117:0x01cf, B:119:0x01da, B:121:0x01e0, B:123:0x01e4, B:125:0x01ea, B:126:0x0205, B:156:0x025c, B:158:0x0260, B:160:0x0265), top: B:167:0x0005 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void sendAdLog(org.json.JSONObject r20, X.C1019830ce5 r21, X.InterfaceC1019840ce6 r22) {
        /*
            Method dump skipped, instruction units count: 637
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.bullet.bridge.ad.SendAdLogMethod.sendAdLog(org.json.JSONObject, X.0ce5, X.0ce6):void");
    }
}
