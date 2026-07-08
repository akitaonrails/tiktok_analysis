package com.bytedance.hybrid.common.autoservice;

import X.C1537480q70;
import X.InterfaceC1531560pxS;
import X.InterfaceC1538750q93;
import X.InterfaceC1541990qEH;
import X.InterfaceC1542250qEh;
import com.bytedance.lynx.hybrid.autoservice.IHybridInnerAutoService;
import com.bytedance.lynx.hybrid.param.HybridSchemaParam;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes24.dex */
public interface ISDUIAPI extends IHybridInnerAutoService {
    InterfaceC1531560pxS getOrCreateSDUIKitInitParams(C1537480q70 c1537480q70, String str, InterfaceC1542250qEh interfaceC1542250qEh, boolean z);

    InterfaceC1538750q93<?> getSduiKitViewProvider();

    void initSDUIKit();

    boolean isSDUIView(InterfaceC1541990qEH interfaceC1541990qEH);

    boolean sduiKitReady();

    void setHybridSchemaParams(InterfaceC1531560pxS interfaceC1531560pxS, HybridSchemaParam hybridSchemaParam);

    void setInitData(InterfaceC1531560pxS interfaceC1531560pxS, JSONObject jSONObject);
}
