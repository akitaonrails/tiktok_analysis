package com.ss.android.ugc.aweme.socialavatar.network;

import X.InterfaceC1364105Vn;
import X.InterfaceC1485405rg;
import X.InterfaceC1501070pAH;
import X.InterfaceC1501160pAQ;
import X.InterfaceC1501170pAR;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public interface LegacySocialAvatarCreationApi {
    @InterfaceC1501170pAR("/tiktok/v1/im/ai_moji/create")
    Object createSocialAvatar(@InterfaceC1485405rg SocialAvatarCreationRequest socialAvatarCreationRequest, InterfaceC1364105Vn<? super SocialAvatarCreateResponse> interfaceC1364105Vn);

    @InterfaceC1501160pAQ("/tiktok/v1/aigc/tasks")
    Object getAIGCTaskList(@InterfaceC1501070pAH("task_ids") List<String> list, @InterfaceC1501070pAH("filter_status") List<Integer> list2, @InterfaceC1501070pAH("cursor") int i, @InterfaceC1501070pAH("count") int i2, @InterfaceC1501070pAH("need_waiting_detail") boolean z, @InterfaceC1501070pAH("job_type") String str, InterfaceC1364105Vn<? super AIGCTaskResponse> interfaceC1364105Vn);

    @InterfaceC1501170pAR("/tiktok/v1/aigc/tasks/discard")
    Object postAIGCDiscard(@InterfaceC1485405rg AIGCTaskDiscardRequest aIGCTaskDiscardRequest, InterfaceC1364105Vn<Object> interfaceC1364105Vn);
}
