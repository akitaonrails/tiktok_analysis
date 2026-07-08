package com.bytedance.android.strategy;

import X.C11NZ;
import X.C470570Icp;
import X.C470580Icq;
import X.InterfaceC1485405rg;
import X.InterfaceC1501050pAF;
import X.InterfaceC1501070pAH;
import X.InterfaceC1501160pAQ;
import X.InterfaceC1501170pAR;
import X.InterfaceC1501300pAe;
import X.InterfaceC1501310pAf;
import com.bytedance.scene.Scene;
import webcast.api.feed.FetchSpecialCardRequest;
import webcast.api.feed.FetchSpecialCardResponse;
import webcast.api.room.StrategyReportResponse;
import webcast.api.room.StrategyV2Request;

/* JADX INFO: loaded from: classes8.dex */
public interface StrategyApi {
    @InterfaceC1501170pAR("/webcast/feed/fetch_special_card/")
    @InterfaceC1501310pAf({"content-type: application/json"})
    C11NZ<FetchSpecialCardResponse> fetchSpecialCard(@InterfaceC1485405rg FetchSpecialCardRequest fetchSpecialCardRequest);

    @InterfaceC1501160pAQ("/webcast/room/strategy_v2/")
    C11NZ<C470570Icp> getStrategyV2(@InterfaceC1501070pAH("scenes") String str, @InterfaceC1501070pAH("feature_ids") String str2, @InterfaceC1501070pAH("gps_enabled") boolean z);

    @InterfaceC1501300pAe
    @InterfaceC1501170pAR("/webcast/room/strategy_v2/")
    C11NZ<C470570Icp> postStrategyFormV2(@InterfaceC1501050pAF("scenes") String str, @InterfaceC1501050pAF("feature_ids") String str2, @InterfaceC1501050pAF("strategy_infos") String str3, @InterfaceC1501050pAF("package_infos") String str4);

    @InterfaceC1501170pAR("/webcast/room/strategy_v2/")
    @InterfaceC1501310pAf({"content-type: application/json"})
    C11NZ<C470570Icp> postStrategyV2(@InterfaceC1485405rg StrategyV2Request strategyV2Request);

    @InterfaceC1501160pAQ("/webcast/room/strategy_check/")
    C11NZ<C470580Icq> strategyCheck(@InterfaceC1501070pAH(Scene.SCENE_SERVICE) int i, @InterfaceC1501070pAH("room_id") long j, @InterfaceC1501070pAH("anchor_id") long j2, @InterfaceC1501070pAH("trigger_type") int i2, @InterfaceC1501070pAH("enter_from_merge") String str);

    @InterfaceC1501160pAQ("/webcast/room/strategy_check/")
    C11NZ<C470580Icq> strategyCheck(@InterfaceC1501070pAH(Scene.SCENE_SERVICE) int i, @InterfaceC1501070pAH("room_id") long j, @InterfaceC1501070pAH("anchor_id") long j2, @InterfaceC1501070pAH("check_params") String str);

    @InterfaceC1501160pAQ("/webcast/room/strategy_check/")
    C11NZ<C470580Icq> strategyCheck(@InterfaceC1501070pAH(Scene.SCENE_SERVICE) int i, @InterfaceC1501070pAH("room_id") long j, @InterfaceC1501070pAH("anchor_id") long j2, @InterfaceC1501070pAH("action_type") String str, @InterfaceC1501070pAH("watch_duration") long j3, @InterfaceC1501070pAH("trigger_type") int i2, @InterfaceC1501070pAH("trigger_delay") long j4, @InterfaceC1501070pAH("enter_from_merge") String str2, @InterfaceC1501070pAH("trigger_id") String str3, @InterfaceC1501070pAH("strategy_id") String str4);

    @InterfaceC1501160pAQ("/webcast/room/strategy_check/")
    C11NZ<C470580Icq> strategyCheck(@InterfaceC1501070pAH(Scene.SCENE_SERVICE) int i, @InterfaceC1501070pAH("room_id") long j, @InterfaceC1501070pAH("anchor_id") long j2, @InterfaceC1501070pAH("action_type") String str, @InterfaceC1501070pAH("watch_duration") long j3, @InterfaceC1501070pAH("trigger_type") int i2, @InterfaceC1501070pAH("trigger_delay") long j4, @InterfaceC1501070pAH("enter_from_merge") String str2, @InterfaceC1501070pAH("trigger_id") String str3, @InterfaceC1501070pAH("strategy_id") String str4, @InterfaceC1501070pAH("check_params") String str5);

    @InterfaceC1501160pAQ("/webcast/room/strategy_check/")
    C11NZ<C470580Icq> strategyCheck(@InterfaceC1501070pAH(Scene.SCENE_SERVICE) int i, @InterfaceC1501070pAH("room_id") long j, @InterfaceC1501070pAH("anchor_id") long j2, @InterfaceC1501070pAH("strategy_id") String str, @InterfaceC1501070pAH("action_type") String str2);

    @InterfaceC1501160pAQ("/webcast/room/strategy_check/")
    C11NZ<C470580Icq> strategyCheck(@InterfaceC1501070pAH(Scene.SCENE_SERVICE) int i, @InterfaceC1501070pAH("strategy_id") String str);

    @InterfaceC1501160pAQ("/webcast/room/strategy_check/")
    C11NZ<C470580Icq> strategyCheck(@InterfaceC1501070pAH(Scene.SCENE_SERVICE) int i, @InterfaceC1501070pAH("strategy_id") String str, @InterfaceC1501070pAH("check_params") String str2);

    @InterfaceC1501300pAe
    @InterfaceC1501170pAR("/webcast/room/strategy_check/")
    C11NZ<C470580Icq> strategyCheckPost(@InterfaceC1501050pAF(Scene.SCENE_SERVICE) int i, @InterfaceC1501050pAF("strategy_id") String str, @InterfaceC1501070pAH("room_id") long j, @InterfaceC1501070pAH("anchor_id") long j2, @InterfaceC1501050pAF("check_params") String str2);

    @InterfaceC1501160pAQ("/webcast/room/strategy_report/")
    C11NZ<StrategyReportResponse> strategyReport(@InterfaceC1501070pAH(Scene.SCENE_SERVICE) int i, @InterfaceC1501070pAH("action_type") int i2, @InterfaceC1501070pAH("strategy_id") String str);

    @InterfaceC1501160pAQ("/webcast/room/strategy_report/")
    C11NZ<StrategyReportResponse> strategyReport(@InterfaceC1501070pAH(Scene.SCENE_SERVICE) int i, @InterfaceC1501070pAH("action_type") int i2, @InterfaceC1501070pAH("strategy_id") String str, @InterfaceC1501070pAH("style_type") int i3);
}
