package com.bytedance.android.livesdk.impl.revenue.strategy.api;

import X.C11NZ;
import X.C470590Icr;
import X.InterfaceC1501050pAF;
import X.InterfaceC1501170pAR;
import X.InterfaceC1501300pAe;
import com.bytedance.scene.Scene;
import webcast.api.first_recharge.CampaignOperateResp;

/* JADX INFO: loaded from: classes.dex */
public interface StrategyApi {
    @InterfaceC1501300pAe
    @InterfaceC1501170pAR("/webcast/first_recharge/campaign_operate/")
    C11NZ<C470590Icr<CampaignOperateResp.Data>> operateCampaign(@InterfaceC1501050pAF(Scene.SCENE_SERVICE) int i, @InterfaceC1501050pAF("room_id") long j, @InterfaceC1501050pAF("req_from") int i2, @InterfaceC1501050pAF("gift_enter_from") String str, @InterfaceC1501050pAF("request_page") String str2);
}
