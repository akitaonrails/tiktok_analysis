package com.bytedance.android.livesdk.init;

import X.AbstractC20513081v;
import X.C1161920gLG;
import com.bytedance.android.message.IMessageService;

/* JADX INFO: loaded from: classes8.dex */
public class ImsdkInitTask extends AbstractC20513081v {
    @Override // X.AbstractC20513081v
    public String getTaskName() {
        return "imsdk_init_task";
    }

    @Override // X.AbstractC20513081v
    public void run() {
        ((IMessageService) C1161920gLG.LIZJ(IMessageService.class)).initZstdCompressResourceWhenSDKStart();
    }
}
