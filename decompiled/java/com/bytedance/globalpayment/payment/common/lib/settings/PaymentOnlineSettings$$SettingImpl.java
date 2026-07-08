package com.bytedance.globalpayment.payment.common.lib.settings;

import X.C2664011i;
import X.C810040Vq6;
import X.C810060Vq8;
import X.C810200VqM;
import X.InterfaceC810050Vq7;
import X.InterfaceC810100VqC;
import X.InterfaceC810260VqS;
import android.content.Context;
import android.content.SharedPreferences;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes14.dex */
public class PaymentOnlineSettings$$SettingImpl implements PaymentOnlineSettings {
    public final InterfaceC810050Vq7 LIZ;
    public final C810060Vq8 LIZIZ;

    @Override // com.bytedance.globalpayment.payment.common.lib.settings.PaymentOnlineSettings
    public final JSONObject LIZIZ() {
        InterfaceC810050Vq7 interfaceC810050Vq7 = this.LIZ;
        if (interfaceC810050Vq7 == null || !interfaceC810050Vq7.contains("restore_settings")) {
            return null;
        }
        String string = this.LIZ.getString("restore_settings");
        C810040Vq6.LIZ(C810200VqM.class, this.LIZIZ).getClass();
        try {
            return new JSONObject(string);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }

    @Override // com.bytedance.globalpayment.payment.common.lib.settings.PaymentOnlineSettings
    public final boolean LIZJ() {
        InterfaceC810050Vq7 interfaceC810050Vq7 = this.LIZ;
        if (interfaceC810050Vq7 == null || !interfaceC810050Vq7.contains("pipo_process_settings")) {
            return true;
        }
        return this.LIZ.getBoolean("pipo_process_settings");
    }

    @Override // com.bytedance.globalpayment.payment.common.lib.settings.PaymentOnlineSettings
    public final long LIZLLL() {
        InterfaceC810050Vq7 interfaceC810050Vq7 = this.LIZ;
        if (interfaceC810050Vq7 == null || !interfaceC810050Vq7.contains("auto_ack_after_upload_token_in_ms")) {
            return 120000L;
        }
        return this.LIZ.getLong("auto_ack_after_upload_token_in_ms");
    }

    @Override // com.bytedance.globalpayment.payment.common.lib.settings.PaymentOnlineSettings
    public final boolean LJJII() {
        InterfaceC810050Vq7 interfaceC810050Vq7 = this.LIZ;
        if (interfaceC810050Vq7 == null || !interfaceC810050Vq7.contains("need_ack_after_success_query")) {
            return false;
        }
        return this.LIZ.getBoolean("need_ack_after_success_query");
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [X.0Vq8] */
    public PaymentOnlineSettings$$SettingImpl(InterfaceC810050Vq7 interfaceC810050Vq7) {
        new ConcurrentHashMap();
        new ConcurrentHashMap();
        this.LIZIZ = new InterfaceC810100VqC() { // from class: X.0Vq8
            @Override // X.InterfaceC810100VqC
            public final <T> T create(Class<T> cls) {
                if (cls == C810200VqM.class) {
                    return (T) new Object() { // from class: X.0VqM
                    };
                }
                if (cls == C810200VqM.class) {
                    return (T) new Object() { // from class: X.0VqM
                    };
                }
                if (cls == C810200VqM.class) {
                    return (T) new Object() { // from class: X.0VqM
                    };
                }
                return null;
            }
        };
        this.LIZ = interfaceC810050Vq7;
    }

    @Override // com.bytedance.push.settings.ISettings
    public final void unregisterValChanged(InterfaceC810260VqS interfaceC810260VqS) {
        InterfaceC810050Vq7 interfaceC810050Vq7 = this.LIZ;
        if (interfaceC810050Vq7 != null) {
            interfaceC810050Vq7.LIZIZ();
        }
    }

    @Override // com.bytedance.push.settings.ISettings
    public final void updateSettings(Context context, JSONObject jSONObject) {
        InterfaceC810050Vq7 interfaceC810050Vq7;
        if (jSONObject != null && (interfaceC810050Vq7 = this.LIZ) != null) {
            SharedPreferences.Editor editorEdit = interfaceC810050Vq7.edit();
            if (jSONObject.has("restore_settings")) {
                editorEdit.putString("restore_settings", jSONObject.optString("restore_settings"));
            }
            if (jSONObject.has("pipo_process_settings")) {
                editorEdit.putBoolean("pipo_process_settings", C2664011i.LIZ("pipo_process_settings", jSONObject));
            }
            if (jSONObject.has("payment_settings_request_interval")) {
                editorEdit.putLong("payment_settings_request_interval", jSONObject.optLong("payment_settings_request_interval"));
            }
            if (jSONObject.has("gecko_config")) {
                editorEdit.putString("gecko_config", jSONObject.optString("gecko_config"));
            }
            if (jSONObject.has("webview_config")) {
                editorEdit.putString("webview_config", jSONObject.optString("webview_config"));
            }
            if (jSONObject.has("auto_ack_after_upload_token_in_ms")) {
                editorEdit.putLong("auto_ack_after_upload_token_in_ms", jSONObject.optLong("auto_ack_after_upload_token_in_ms"));
            }
            if (jSONObject.has("need_ack_after_success_query")) {
                editorEdit.putBoolean("need_ack_after_success_query", C2664011i.LIZ("need_ack_after_success_query", jSONObject));
            }
            editorEdit.apply();
        }
    }

    @Override // com.bytedance.push.settings.ISettings
    public final void registerValChanged(Context context, String str, String str2, InterfaceC810260VqS interfaceC810260VqS) {
        InterfaceC810050Vq7 interfaceC810050Vq7 = this.LIZ;
        if (interfaceC810050Vq7 != null) {
            interfaceC810050Vq7.LIZ(context, str, str2);
        }
    }
}
