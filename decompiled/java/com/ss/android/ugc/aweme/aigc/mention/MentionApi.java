package com.ss.android.ugc.aweme.aigc.mention;

import X.InterfaceC1364105Vn;
import X.InterfaceC1485405rg;
import X.InterfaceC1501070pAH;
import X.InterfaceC1501160pAQ;
import X.InterfaceC1501170pAR;
import com.ss.android.ugc.aweme.creative.model.mention.MentionCheckRequest;
import com.ss.android.ugc.aweme.creative.model.mention.MentionCheckResult;
import com.ss.android.ugc.aweme.creative.model.mention.MentionResponse;
import com.ss.android.ugc.aweme.creative.model.mention.RecommendMentionRequest;
import com.ss.android.ugc.aweme.creative.model.mention.SpecMentionRequest;
import com.ss.android.ugc.aweme.creative.model.mention.SpecMentionResponse;

/* JADX INFO: loaded from: classes9.dex */
public interface MentionApi {
    @InterfaceC1501170pAR("/api/cameo/permission/check")
    Object checkMentionCameoValid(@InterfaceC1485405rg MentionCheckRequest mentionCheckRequest, InterfaceC1364105Vn<? super MentionCheckResult> interfaceC1364105Vn);

    @InterfaceC1501170pAR("/api/cameo/mention/list")
    Object getRecommendMentionList(@InterfaceC1485405rg RecommendMentionRequest recommendMentionRequest, InterfaceC1364105Vn<? super MentionResponse> interfaceC1364105Vn);

    @InterfaceC1501160pAQ("/api/cameo/mention/recommendation")
    Object getRecommendationCameoMention(@InterfaceC1501070pAH("size") int i, InterfaceC1364105Vn<? super MentionResponse> interfaceC1364105Vn);

    @InterfaceC1501160pAQ("/api/cameo/mention/search")
    Object getSearchMentionList(@InterfaceC1501070pAH("search_id") String str, @InterfaceC1501070pAH("query") String str2, @InterfaceC1501070pAH("size") int i, @InterfaceC1501070pAH("my_cameo") boolean z, InterfaceC1364105Vn<? super MentionResponse> interfaceC1364105Vn);

    @InterfaceC1501170pAR("/api/cameo/mention/mget")
    Object getSpecificMentionData(@InterfaceC1485405rg SpecMentionRequest specMentionRequest, InterfaceC1364105Vn<? super SpecMentionResponse> interfaceC1364105Vn);
}
