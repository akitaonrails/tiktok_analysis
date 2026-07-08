package com.bytedance.android.livesdk.chatroom.model;

import X.C09CT;
import com.bytedance.android.live.base.model.ImageModel;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class CampaignInfo {

    @C09CT("end_time")
    public long endTime;

    @C09CT(FollowStatusChangeMethod.PARAM_UID)
    public long id;

    @C09CT("image")
    public ImageModel image;

    @C09CT("is_sign_up_page")
    public boolean isSignUpPage;

    @C09CT("start_time")
    public long startTime;

    @C09CT("tag")
    public int tag;

    @C09CT("title")
    public String title = "";

    @C09CT("schema_url")
    public String schemaUrl = "";

    @C09CT("activity_id")
    public String activityId = "";

    @C09CT("sub_title")
    public String subTitle = "";

    @C09CT("display_tags")
    public List<CampaignDisplayTag> displayTags = new ArrayList();

    @C09CT("resource_id")
    public String resourceId = "";

    @C09CT("extra")
    public String extra = "";
}
