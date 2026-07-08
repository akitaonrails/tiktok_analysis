package com.bytedance.android.livesdk.push;

import X.C1161920gLG;
import X.C463530IFr;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.livesdk.livesetting.watchlive.LivePushGuideToFypExperiment;
import com.bytedance.android.livesdk.watch.push.ILivePushService;
import com.bytedance.android.livesdkapi.host.IHostPush;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes32.dex */
public class LivePushService implements ILivePushService {
    public boolean LL = true;
    public boolean LLILLJJLI;
    public C463530IFr LLILLL;

    @Override // com.bytedance.android.livesdk.watch.push.ILivePushService
    public final void qj() {
        this.LLILLJJLI = true;
    }

    @Override // com.bytedance.android.livesdk.watch.push.ILivePushService
    public final void unregisterPushHandler() {
        ((IHostPush) C1161920gLG.LIZJ(IHostPush.class)).unregisterPushHandler();
    }

    @Override // com.bytedance.android.livesdk.watch.push.ILivePushService
    public final boolean lj() {
        return LivePushGuideToFypExperiment.liveRoomCount() > 0;
    }

    @Override // com.bytedance.android.livesdk.watch.push.ILivePushService
    public final C463530IFr Fi0() {
        return this.LLILLL;
    }

    @Override // com.bytedance.android.livesdk.watch.push.ILivePushService
    public final void CK0(C463530IFr c463530IFr) {
        this.LLILLL = c463530IFr;
    }

    @Override // com.bytedance.android.livesdk.watch.push.ILivePushService
    public final void MX1(boolean z) {
        this.LL = z;
    }

    @Override // com.bytedance.android.livesdk.watch.push.ILivePushService
    public final void registerPushHandler(Function0<Unit> function0) {
        ((IHostPush) C1161920gLG.LIZJ(IHostPush.class)).registerPushHandler(function0);
    }

    @Override // com.bytedance.android.livesdk.watch.push.ILivePushService
    public final void sendPush(ImageModel imageModel, String str, String str2, ImageModel imageModel2) {
        if (this.LL && !this.LLILLJJLI) {
            ((IHostPush) C1161920gLG.LIZJ(IHostPush.class)).sendPush(imageModel, str, str2, imageModel2);
        }
    }
}
