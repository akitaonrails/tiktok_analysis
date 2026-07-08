package com.ss.android.ugc.aweme.socialavatar.mixstudio.network;

import X.C09CT;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public final class MixStudioTask {

    @C09CT("base_models")
    public final List<MixStudioBaseModel> baseModels;

    @C09CT("elements")
    public final List<MixStudioNetworkElement> elements;

    @C09CT("entrance_visited")
    public final String entranceVisited;

    @C09CT("task_id")
    public final String id;

    @C09CT("results")
    public final List<MixStudioSticker> results;

    @C09CT(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS)
    public final Integer status;

    public MixStudioTask(String str, Integer num, List<MixStudioBaseModel> list, List<MixStudioNetworkElement> list2, List<MixStudioSticker> list3, String str2) {
        this.id = str;
        this.status = num;
        this.baseModels = list;
        this.elements = list2;
        this.results = list3;
        this.entranceVisited = str2;
    }
}
