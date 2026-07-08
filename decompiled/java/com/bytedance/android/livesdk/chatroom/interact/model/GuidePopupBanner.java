package com.bytedance.android.livesdk.chatroom.interact.model;

import X.C09CT;
import com.bytedance.android.live.base.model.user.User;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class GuidePopupBanner {

    @C09CT("banner_content_type")
    public int bannerContentType;

    @C09CT("banner_style")
    public int bannerStyle;

    @C09CT("recap_title_type")
    public int recapTitleType;

    @C09CT("top_cohosted_partners")
    public List<User> topCohostedPartners = new ArrayList();

    @C09CT("benefits")
    public List<Benefit> benefits = new ArrayList();

    @C09CT("timestamp")
    public String timestamp = "";
}
