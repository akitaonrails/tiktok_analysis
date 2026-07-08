package com.bytedance.android.livesdk.model.message;

import X.C09CT;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class SurpriseSet {

    @C09CT(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS)
    public int status;

    @C09CT("surprise_set_extra")
    public SurpriseSetExtra surpriseSetExtra;

    @C09CT("surprise_set_id")
    public String surpriseSetId = "";

    @C09CT("surprise_set_item")
    public List<LiveSurpriseSetItem> surpriseSetItem = new ArrayList();

    @C09CT("surprise_set_properties")
    public SurpriseSetProperties surpriseSetProperties;
}
