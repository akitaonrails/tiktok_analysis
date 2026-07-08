package com.bytedance.android.livesdk.init;

import X.AbstractC20513081v;
import X.C1161920gLG;
import com.bytedance.android.livesdkapi.host.IHostNetwork;

/* JADX INFO: loaded from: classes4.dex */
public class RegisterWebSocketTask extends AbstractC20513081v {
    @Override // X.AbstractC20513081v
    public String getTaskName() {
        return "register_web_socket_task";
    }

    @Override // X.AbstractC20513081v
    public void run() {
        ((IHostNetwork) C1161920gLG.LIZJ(IHostNetwork.class)).registerHostWS();
    }
}
