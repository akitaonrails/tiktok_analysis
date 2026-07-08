package com.bytedance.android.livesdk.watch.push;

import X.C006A;
import X.C463530IFr;
import com.bytedance.android.live.base.model.ImageModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes8.dex */
public interface ILivePushService extends C006A {
    void CK0(C463530IFr c463530IFr);

    C463530IFr Fi0();

    void MX1(boolean z);

    boolean lj();

    void qj();

    void registerPushHandler(Function0<Unit> function0);

    void sendPush(ImageModel imageModel, String str, String str2, ImageModel imageModel2);

    void unregisterPushHandler();
}
