package com.bytedance.android.livesdk.comp.impl.game.partnership.mixlayout.business.common.api;

import X.AbstractC19484711Kz;
import X.C470590Icr;
import X.InterfaceC1501050pAF;
import X.InterfaceC1501070pAH;
import X.InterfaceC1501130pAN;
import X.InterfaceC1501160pAQ;
import X.InterfaceC1501170pAR;
import X.InterfaceC1501300pAe;
import com.bytedance.android.livesdk.comp.impl.game.partnership.mixlayout.business.common.model.RawGameDetailHomeResponse$ResponseData;
import com.bytedance.scene.Scene;
import java.util.Map;
import webcast.api.game_station.GameDetailHotHashtagResponse;
import webcast.api.game_station.GameDetailTranslateResponse;
import webcast.api.game_station.GameDetailVideosResponse;
import webcast.api.game_station.GameDetailVideosTabResponse;
import webcast.api.game_station.GameRegisterResponse;
import webcast.api.game_station.LiveFeedResponse;

/* JADX INFO: loaded from: classes29.dex */
public interface GameDetailPageApi {
    @InterfaceC1501160pAQ("/game_station/game_detail/hashtag/hot")
    AbstractC19484711Kz<C470590Icr<GameDetailHotHashtagResponse.ResponseData>> requestAnchorGameDetailHashTags(@InterfaceC1501070pAH("game_id") String str, @InterfaceC1501070pAH("game_tag_id") String str2, @InterfaceC1501070pAH("limit") int i, @InterfaceC1501070pAH("offset") int i2);

    @InterfaceC1501160pAQ("/game_station/game_detail/home/v2")
    AbstractC19484711Kz<C470590Icr<RawGameDetailHomeResponse$ResponseData>> requestAnchorGameDetailHomeV2(@InterfaceC1501070pAH(Scene.SCENE_SERVICE) int i, @InterfaceC1501070pAH("game_id") String str, @InterfaceC1501070pAH("room_id") String str2, @InterfaceC1501070pAH("ad_id") String str3, @InterfaceC1501070pAH("item_id") String str4, @InterfaceC1501070pAH("author_id") String str5, @InterfaceC1501070pAH("game_tag_id") String str6, @InterfaceC1501070pAH("promote_task_id") String str7, @InterfaceC1501070pAH("promote_task_type") String str8, @InterfaceC1501070pAH("log_extra") String str9, @InterfaceC1501070pAH("extra_params") String str10);

    @InterfaceC1501160pAQ("/game_station/game_detail_videos/")
    AbstractC19484711Kz<C470590Icr<GameDetailVideosResponse.ResponseData>> requestAnchorGameDetailVideos(@InterfaceC1501130pAN Map<String, String> map);

    @InterfaceC1501160pAQ("/game_station/esports/match_list")
    AbstractC19484711Kz<String> requestEsportsMatchList(@InterfaceC1501070pAH("tournament_id") String str, @InterfaceC1501070pAH("timestamp") long j, @InterfaceC1501070pAH("batch_size") int i, @InterfaceC1501070pAH("slide_way") int i2, @InterfaceC1501070pAH(Scene.SCENE_SERVICE) int i3);

    @InterfaceC1501160pAQ("/game_station/game_detail/home/v2")
    AbstractC19484711Kz<C470590Icr<RawGameDetailHomeResponse$ResponseData>> requestGameDetailHomeV2DataByKey(@InterfaceC1501070pAH("data_keys") String str, @InterfaceC1501070pAH(Scene.SCENE_SERVICE) int i, @InterfaceC1501070pAH("game_id") String str2, @InterfaceC1501070pAH("room_id") String str3, @InterfaceC1501070pAH("ad_id") String str4, @InterfaceC1501070pAH("item_id") String str5, @InterfaceC1501070pAH("author_id") String str6, @InterfaceC1501070pAH("game_tag_id") String str7, @InterfaceC1501070pAH("promote_task_id") String str8, @InterfaceC1501070pAH("promote_task_type") String str9, @InterfaceC1501070pAH("log_extra") String str10, @InterfaceC1501070pAH("extra_params") String str11);

    @InterfaceC1501160pAQ("/game_station/game_detail/translate/")
    AbstractC19484711Kz<C470590Icr<GameDetailTranslateResponse.ResponseData>> requestGameDetailTranslate(@InterfaceC1501070pAH("game_id") long j, @InterfaceC1501070pAH("game_tag_id") long j2, @InterfaceC1501070pAH("content") String str, @InterfaceC1501070pAH("source_language") String str2);

    @InterfaceC1501160pAQ("/game_station/game_detail/videos/tab/")
    AbstractC19484711Kz<C470590Icr<GameDetailVideosTabResponse.ResponseData>> requestGameDetailVideosTab(@InterfaceC1501070pAH("game_id") String str, @InterfaceC1501070pAH("game_tag_id") String str2);

    @InterfaceC1501300pAe
    @InterfaceC1501170pAR("/game_station/register/")
    AbstractC19484711Kz<C470590Icr<GameRegisterResponse.ResponseData>> requestGameStationRegister(@InterfaceC1501050pAF(Scene.SCENE_SERVICE) int i, @InterfaceC1501050pAF("game_id") String str, @InterfaceC1501050pAF("is_unregister") boolean z, @InterfaceC1501050pAF("room_id") String str2, @InterfaceC1501050pAF("item_id") String str3, @InterfaceC1501050pAF("author_id") String str4, @InterfaceC1501050pAF("game_tag_id") String str5, @InterfaceC1501050pAF("promote_task_id") String str6, @InterfaceC1501050pAF("log_extra") String str7, @InterfaceC1501050pAF("extra_params") String str8);

    @InterfaceC1501160pAQ("/game_station/game_detail/live_feed/")
    AbstractC19484711Kz<C470590Icr<LiveFeedResponse.ResponseData>> requestLiveFeed(@InterfaceC1501070pAH("game_tag_id") String str, @InterfaceC1501070pAH("author_id") String str2, @InterfaceC1501070pAH(Scene.SCENE_SERVICE) int i, @InterfaceC1501070pAH("pull_type") int i2, @InterfaceC1501070pAH("game_id") String str3, @InterfaceC1501070pAH("live_tab_type") int i3, @InterfaceC1501070pAH("req_from") String str4);
}
