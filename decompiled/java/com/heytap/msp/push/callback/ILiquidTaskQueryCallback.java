package com.heytap.msp.push.callback;

import java.util.List;

/* JADX INFO: loaded from: classes14.dex */
public interface ILiquidTaskQueryCallback {
    void onFailure(int i);

    void onSuccess(List<String> list);
}
