package com.bytedance.android.livesdkapi.host.dummy;

import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.livesdkapi.host.IHostPush;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes32.dex */
public final class LiveHostPushDummy implements IHostPush {
    @Override // com.bytedance.android.livesdkapi.host.IHostPush
    public final void registerPushHandler(Function0<Unit> function0) {
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostPush
    public final void sendPush(ImageModel imageModel, String str, String str2, ImageModel imageModel2) {
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostPush
    public final void unregisterPushHandler() {
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostPush
    public final /* bridge */ /* synthetic */ void onInit() {
    }
}
