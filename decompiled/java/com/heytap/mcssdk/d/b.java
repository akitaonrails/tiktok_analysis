package com.heytap.mcssdk.d;

import android.content.Context;
import android.content.Intent;
import com.heytap.msp.push.mode.BaseMode;
import com.heytap.msp.push.mode.CallkitDataMessage;

/* JADX INFO: loaded from: classes14.dex */
public class b extends d {
    @Override // com.heytap.mcssdk.d.e
    public BaseMode a(Context context, int i, Intent intent) {
        if (4120 == i) {
            return a(intent, i);
        }
        return null;
    }

    @Override // com.heytap.mcssdk.d.d
    public BaseMode a(Intent intent, int i) {
        return new CallkitDataMessage(intent, i);
    }
}
