package com.bytedance.android.livesdkapi.host;

import X.C006A;
import com.ss.ugc.live.sdk.message.data.warlock.WLDataModel;

/* JADX INFO: loaded from: classes32.dex */
public interface IHostWarlock extends C006A {
    boolean isOpen();

    /* bridge */ /* synthetic */ void onInit();

    void sendMessage(WLDataModel wLDataModel);
}
