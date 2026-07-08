package com.bytedance.android.livesdk.chatroom.model.interact;

import X.C09CT;
import com.bytedance.android.live.base.model.ImageModel;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class CohostTopic {

    @C09CT(FollowStatusChangeMethod.PARAM_UID)
    public long id;

    @C09CT("liked")
    public boolean liked;

    @C09CT("total_heat")
    public long totalHeat;

    @C09CT("total_rivals")
    public long totalRivals;

    @C09CT("title_key")
    public String titleKey = "";

    @C09CT("title_text")
    public String titleText = "";

    @C09CT("rivals_avatar")
    public List<ImageModel> rivalsAvatar = new ArrayList();
}
