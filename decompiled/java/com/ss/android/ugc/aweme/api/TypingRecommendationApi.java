package com.ss.android.ugc.aweme.api;

import X.InterfaceC1364105Vn;
import X.InterfaceC1485605ri;
import X.InterfaceC1501120pAM;
import X.InterfaceC1501200pAU;
import X.InterfaceC2177008fw;
import com.bytedance.scene.Scene;
import com.ss.android.ugc.aweme.model.TypingRecommendationResponse;
import java.util.Map;

/* JADX INFO: loaded from: classes20.dex */
public interface TypingRecommendationApi {
    @InterfaceC1501200pAU("im/typing_recommendation")
    Object getTypingRecommendation(@InterfaceC1485605ri Map<String, String> map, @InterfaceC1501120pAM("raw_keyword") String str, @InterfaceC1501120pAM("sticker_ab_json") String str2, @InterfaceC1501120pAM("is_search") Boolean bool, @InterfaceC1501120pAM("hash_uid") String str3, @InterfaceC1501120pAM("effect_ab_json") String str4, @InterfaceC1501120pAM("sa_sticker_ab_version") Integer num, @InterfaceC1501120pAM("sa_set_id") Long l, @InterfaceC1501120pAM("ai_self_set_id") Long l2, @InterfaceC1501120pAM("to_userid") String str5, @InterfaceC1501120pAM("chat_type") String str6, @InterfaceC1501120pAM("region") String str7, @InterfaceC1501120pAM("network_type") String str8, @InterfaceC1501120pAM("network_quality_type") Integer num2, @InterfaceC1501120pAM("in_house_tenor") Boolean bool2, @InterfaceC1501120pAM("client_version") long j, @InterfaceC1501120pAM(Scene.SCENE_SERVICE) String str9, @InterfaceC2177008fw Object obj, InterfaceC1364105Vn<? super TypingRecommendationResponse> interfaceC1364105Vn);
}
