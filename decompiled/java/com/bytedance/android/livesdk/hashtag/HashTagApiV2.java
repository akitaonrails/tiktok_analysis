package com.bytedance.android.livesdk.hashtag;

import X.C09SO;
import X.C470590Icr;
import X.EnumC1846380y9E;
import X.InterfaceC1364105Vn;
import X.InterfaceC1501050pAF;
import X.InterfaceC1501160pAQ;
import X.InterfaceC1501170pAR;
import X.InterfaceC1501300pAe;
import com.bytedance.android.live.base.model.HashtagResponse;
import com.bytedance.scene.Scene;
import webcast.api.game.SearchTagResponseV2;

/* JADX INFO: loaded from: classes.dex */
public interface HashTagApiV2 {
    @InterfaceC1501160pAQ("/webcast/room/hashtag/list/")
    @C09SO(EnumC1846380y9E.BROADCAST)
    Object fetchHashtagList(InterfaceC1364105Vn<? super C470590Icr<HashtagResponse>> interfaceC1364105Vn);

    @InterfaceC1501300pAe
    @InterfaceC1501170pAR("/webcast/game/tag/search/v2/")
    Object searchGameTag(@InterfaceC1501050pAF("user_id") String str, @InterfaceC1501050pAF("query_string") String str2, @InterfaceC1501050pAF("offset") int i, @InterfaceC1501050pAF("limit") int i2, @InterfaceC1501050pAF("live_mode") long j, @InterfaceC1501050pAF(Scene.SCENE_SERVICE) String str3, InterfaceC1364105Vn<? super C470590Icr<SearchTagResponseV2.ResponseData>> interfaceC1364105Vn);
}
