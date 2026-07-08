package com.bytedance.hybrid.common.autoservice;

import X.C1537480q70;
import X.InterfaceC1531560pxS;
import X.InterfaceC1538750q93;
import X.InterfaceC1541990qEH;
import X.InterfaceC1542250qEh;
import com.bytedance.lynx.hybrid.param.HybridSchemaParam;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes24.dex */
public final class DefaultSDUIAPI implements ISDUIAPI {
    @Override // com.bytedance.hybrid.common.autoservice.ISDUIAPI
    public InterfaceC1531560pxS getOrCreateSDUIKitInitParams(C1537480q70 c1537480q70, String str, InterfaceC1542250qEh interfaceC1542250qEh, boolean z) {
        return null;
    }

    @Override // com.bytedance.hybrid.common.autoservice.ISDUIAPI
    public InterfaceC1538750q93<?> getSduiKitViewProvider() {
        return null;
    }

    @Override // com.bytedance.hybrid.common.autoservice.ISDUIAPI
    public void initSDUIKit() {
    }

    @Override // com.bytedance.hybrid.common.autoservice.ISDUIAPI
    public boolean isSDUIView(InterfaceC1541990qEH interfaceC1541990qEH) {
        return false;
    }

    @Override // com.bytedance.hybrid.common.autoservice.ISDUIAPI
    public boolean sduiKitReady() {
        return false;
    }

    @Override // com.bytedance.hybrid.common.autoservice.ISDUIAPI
    public void setHybridSchemaParams(InterfaceC1531560pxS interfaceC1531560pxS, HybridSchemaParam hybridSchemaParam) {
    }

    @Override // com.bytedance.hybrid.common.autoservice.ISDUIAPI
    public void setInitData(InterfaceC1531560pxS interfaceC1531560pxS, JSONObject jSONObject) {
    }
}
