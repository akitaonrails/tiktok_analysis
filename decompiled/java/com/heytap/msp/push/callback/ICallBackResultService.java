package com.heytap.msp.push.callback;

/* JADX INFO: loaded from: classes14.dex */
public interface ICallBackResultService {
    void onError(int i, String str, String str2, String str3);

    void onGetNotificationStatus(int i, int i2);

    void onGetPushStatus(int i, int i2);

    void onRegister(int i, String str, String str2, String str3);

    void onSetPushTime(int i, String str);

    void onUnRegister(int i, String str, String str2);
}
