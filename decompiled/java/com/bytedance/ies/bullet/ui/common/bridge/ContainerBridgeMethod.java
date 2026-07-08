package com.bytedance.ies.bullet.ui.common.bridge;

import X.AbstractC1051750dTZ;
import X.C1051660dTQ;
import X.InterfaceC1058710den;
import android.content.Context;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes17.dex */
public abstract class ContainerBridgeMethod extends AbstractC1051750dTZ {
    @Override // X.InterfaceC1051460dT6
    public abstract /* synthetic */ String getName();

    @Override // X.InterfaceC1051730dTX
    public abstract /* synthetic */ void handle(JSONObject jSONObject, InterfaceC1058710den interfaceC1058710den);

    public final Context getContext() {
        return (Context) this.contextProviderFactory.LIZIZ(Context.class);
    }

    public ContainerBridgeMethod(C1051660dTQ c1051660dTQ) {
        super(c1051660dTQ);
    }
}
