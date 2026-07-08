package com.bytedance.android.livesdkapi.depend.model.live;

import X.C09CT;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.User;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class FYPRoomTagItem {

    @C09CT("content")
    public String content;

    @C09CT("da_info")
    public String daInfo = "";

    @C09CT("event_tags")
    public Map<String, String> eventTags;

    @C09CT("from_user")
    public User fromUser;

    @C09CT("from_user_list")
    public List<User> fromUserList;

    @C09CT("icon")
    public ImageModel icon;

    @C09CT(FollowStatusChangeMethod.PARAM_UID)
    public Integer id;

    @C09CT("style")
    public Integer style;

    @C09CT("total_user_list_count")
    public int totalUserListCount;

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.id != null) {
            sb.append(", id=");
            sb.append(this.id);
        }
        if (this.style != null) {
            sb.append(", style=");
            sb.append(this.style);
        }
        if (this.content != null) {
            sb.append(", content=");
            sb.append(this.content);
        }
        if (this.icon != null) {
            sb.append(", icon=");
            sb.append(this.icon);
        }
        sb.replace(0, 2, "FYPRoomTagItem{");
        sb.append('}');
        return sb.toString();
    }
}
