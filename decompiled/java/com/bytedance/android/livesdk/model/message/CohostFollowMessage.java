package com.bytedance.android.livesdk.model.message;

import X.C09CT;
import com.bytedance.android.livesdk.model.message.common.Text;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class CohostFollowMessage {

    @C09CT("description")
    public Text description;

    @C09CT("display_user_infos")
    public List<DisplayUserInfo> displayUserInfos = new ArrayList();

    @C09CT("title")
    public Text title;
}
