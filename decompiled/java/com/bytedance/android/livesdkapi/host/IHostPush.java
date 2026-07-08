package com.bytedance.android.livesdkapi.host;

import X.C006A;
import com.bytedance.android.live.base.model.ImageModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes32.dex */
public interface IHostPush extends C006A {
    /* bridge */ /* synthetic */ void onInit();

    void registerPushHandler(Function0<Unit> function0);

    void sendPush(ImageModel imageModel, String str, String str2, ImageModel imageModel2);

    void unregisterPushHandler();
}
