package com.bytedance.globalpayment.payment.common.lib.settings;

import X.InterfaceC810050Vq7;
import X.InterfaceC810260VqS;
import android.content.Context;
import android.content.SharedPreferences;

/* JADX INFO: loaded from: classes14.dex */
public class PaymentLocalSettings$$SettingImpl implements PaymentLocalSettings {
    public final InterfaceC810050Vq7 LIZ;

    @Override // com.bytedance.globalpayment.payment.common.lib.settings.PaymentLocalSettings
    public final String LJIIJJI() {
        InterfaceC810050Vq7 interfaceC810050Vq7 = this.LIZ;
        return (interfaceC810050Vq7 == null || !interfaceC810050Vq7.contains("need_restore_orders")) ? "" : this.LIZ.getString("need_restore_orders");
    }

    @Override // com.bytedance.globalpayment.payment.common.lib.settings.PaymentLocalSettings
    public final void LJIIL(String str) {
        InterfaceC810050Vq7 interfaceC810050Vq7 = this.LIZ;
        if (interfaceC810050Vq7 != null) {
            SharedPreferences.Editor editorEdit = interfaceC810050Vq7.edit();
            editorEdit.putString("need_restore_orders", str);
            editorEdit.apply();
        }
    }

    @Override // com.bytedance.push.settings.ILocalSettings
    public final void unregisterValChanged(InterfaceC810260VqS interfaceC810260VqS) {
        InterfaceC810050Vq7 interfaceC810050Vq7 = this.LIZ;
        if (interfaceC810050Vq7 != null) {
            interfaceC810050Vq7.LIZIZ();
        }
    }

    public PaymentLocalSettings$$SettingImpl(Context context, InterfaceC810050Vq7 interfaceC810050Vq7) {
        this.LIZ = interfaceC810050Vq7;
    }

    @Override // com.bytedance.push.settings.ILocalSettings
    public final void registerValChanged(Context context, String str, String str2, InterfaceC810260VqS interfaceC810260VqS) {
        InterfaceC810050Vq7 interfaceC810050Vq7 = this.LIZ;
        if (interfaceC810050Vq7 != null) {
            interfaceC810050Vq7.LIZ(context, str, str2);
        }
    }
}
