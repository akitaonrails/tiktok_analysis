package com.ss.android.ugc.aweme.im.streak.impl.api;

import X.C0I0B;
import X.C1566106Bf;
import X.InterfaceC1364105Vn;
import X.InterfaceC1501120pAM;
import X.InterfaceC1501160pAQ;
import com.bytedance.scene.Scene;

/* JADX INFO: loaded from: classes3.dex */
public final class StreakPushApi implements IStreakPushApi {
    public static final StreakPushApi LIZIZ = new StreakPushApi();
    public final /* synthetic */ IStreakPushApi LIZ = (IStreakPushApi) ((C1566106Bf) C0I0B.LJFF.LIZLLL()).LIZIZ(IStreakPushApi.class);

    @Override // com.ss.android.ugc.aweme.im.streak.impl.api.IStreakPushApi
    @InterfaceC1501160pAQ("/tiktok/v1/im/push/content/fetch")
    public Object pushStreakColdStart(@InterfaceC1501120pAM("push_type") int i, @InterfaceC1501120pAM(Scene.SCENE_SERVICE) int i2, InterfaceC1364105Vn<? super StreakPushContentResponse> interfaceC1364105Vn) {
        return this.LIZ.pushStreakColdStart(i, i2, interfaceC1364105Vn);
    }
}
