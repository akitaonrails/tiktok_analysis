package com.bytedance.android.livesdk.content_spotlight.model;

import X.C09CT;
import com.bytedance.android.livesdk.model.message.common.Text;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class ContentSpotlightRequirement {

    @C09CT("dynamic_description")
    public List<Text> dynamicDescription = new ArrayList();

    @C09CT("requirement_type")
    public int requirementType;

    @C09CT(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS)
    public int status;
}
