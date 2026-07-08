package com.bytedance.android.livesdk.hashtag;

import X.C09SO;
import X.C11NZ;
import X.C470590Icr;
import X.EnumC1846380y9E;
import X.InterfaceC1501050pAF;
import X.InterfaceC1501070pAH;
import X.InterfaceC1501160pAQ;
import X.InterfaceC1501170pAR;
import X.InterfaceC1501300pAe;
import com.bytedance.android.live.base.model.HashtagResponse;
import com.bytedance.android.livesdk.model.Hashtag;
import com.bytedance.scene.Scene;
import webcast.api.game.SearchTagResponse;
import webcast.api.game.SearchTagResponseV2;

/* JADX INFO: loaded from: classes.dex */
public interface HashtagApi {
    @InterfaceC1501160pAQ("/webcast/room/hashtag/list/")
    @C09SO(EnumC1846380y9E.BROADCAST)
    C11NZ<C470590Icr<HashtagResponse>> fetchHashtagList(@InterfaceC1501070pAH("target_game_tag_id") String str);

    @InterfaceC1501300pAe
    @InterfaceC1501170pAR("/webcast/game/tag/search/")
    C11NZ<C470590Icr<SearchTagResponse.ResponseData>> searchGameTag(@InterfaceC1501050pAF("user_id") String str, @InterfaceC1501050pAF("search_id") String str2, @InterfaceC1501050pAF("query_string") String str3, @InterfaceC1501050pAF("lan") String str4, @InterfaceC1501050pAF("country") String str5, @InterfaceC1501050pAF("need_detail") Boolean bool, @InterfaceC1501050pAF("offset") Integer num, @InterfaceC1501050pAF("limit") Integer num2);

    @InterfaceC1501300pAe
    @InterfaceC1501170pAR("/webcast/game/tag/search/v2/")
    C11NZ<C470590Icr<SearchTagResponseV2.ResponseData>> searchGameTagV2(@InterfaceC1501050pAF("user_id") String str, @InterfaceC1501050pAF("query_string") String str2, @InterfaceC1501050pAF("offset") Integer num, @InterfaceC1501050pAF("limit") Integer num2, @InterfaceC1501050pAF("live_mode") Long l, @InterfaceC1501050pAF(Scene.SCENE_SERVICE) String str3);

    @InterfaceC1501300pAe
    @InterfaceC1501170pAR("/webcast/game/tag/record_search/")
    C11NZ<C470590Icr<Void>> sendTagRecord(@InterfaceC1501050pAF("user_id") String str, @InterfaceC1501050pAF("room_id") String str2, @InterfaceC1501050pAF("search_text") String str3, @InterfaceC1501050pAF("game_tag_id") Long l);

    @InterfaceC1501300pAe
    @InterfaceC1501170pAR("/webcast/room/hashtag/set/")
    C11NZ<C470590Icr<Hashtag>> setHashtag(@InterfaceC1501050pAF("room_id") Long l, @InterfaceC1501050pAF("anchor_id") Long l2, @InterfaceC1501050pAF("hashtag_id") Long l3, @InterfaceC1501050pAF("game_tag_id") Long l4);
}
