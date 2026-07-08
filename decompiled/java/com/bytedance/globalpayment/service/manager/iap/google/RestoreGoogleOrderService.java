package com.bytedance.globalpayment.service.manager.iap.google;

/* JADX INFO: loaded from: classes28.dex */
public interface RestoreGoogleOrderService {
    boolean isEnableRestoreOrder();

    void onFailedFinishedTokenUpload(String str);

    void onSuccessFinishedTokenUpload(String str);
}
