package com.bytedance.lynx.hybrid.service;

import X.C1536330q59;
import X.C1537480q70;
import X.InterfaceC1075470e5p;
import android.content.Context;
import com.bytedance.lynx.hybrid.param.HybridSchemaParam;

/* JADX INFO: loaded from: classes24.dex */
public interface ISSPService extends InterfaceC1075470e5p {
    C1536330q59 bootSSPLifecycle(Context context, C1537480q70 c1537480q70, HybridSchemaParam hybridSchemaParam);

    /* synthetic */ String getBid();

    @Override // X.InterfaceC1075470e5p
    /* synthetic */ void onRegister(String str);

    @Override // X.InterfaceC1075470e5p
    /* synthetic */ void onUnRegister();
}
