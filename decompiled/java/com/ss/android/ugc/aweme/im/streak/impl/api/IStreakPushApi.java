package com.ss.android.ugc.aweme.im.streak.impl.api;

import X.InterfaceC1364105Vn;
import X.InterfaceC1501120pAM;
import X.InterfaceC1501160pAQ;
import com.bytedance.scene.Scene;

/* JADX INFO: loaded from: classes3.dex */
public interface IStreakPushApi {
    @InterfaceC1501160pAQ("/tiktok/v1/im/push/content/fetch")
    Object pushStreakColdStart(@InterfaceC1501120pAM("push_type") int i, @InterfaceC1501120pAM(Scene.SCENE_SERVICE) int i2, InterfaceC1364105Vn<? super StreakPushContentResponse> interfaceC1364105Vn);
}
