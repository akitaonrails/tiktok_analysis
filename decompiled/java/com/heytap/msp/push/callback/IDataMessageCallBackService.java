package com.heytap.msp.push.callback;

import android.content.Context;
import com.heytap.msp.push.mode.DataMessage;
import com.heytap.msp.push.mode.RemoteMessage;

/* JADX INFO: loaded from: classes14.dex */
public interface IDataMessageCallBackService {
    void processMessage(Context context, DataMessage dataMessage);

    boolean verifyMessage(RemoteMessage remoteMessage);
}
