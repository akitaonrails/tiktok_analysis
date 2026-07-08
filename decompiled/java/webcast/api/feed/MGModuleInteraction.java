package webcast.api.feed;

import X.C09CT;
import com.bytedance.android.live.base.model.ImageModel;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public final class MGModuleInteraction {

    @C09CT("count")
    public long count;

    @C09CT("friend_avatar")
    public ImageModel friendAvatar;

    @C09CT("friend_uid")
    public long friendUid;

    @C09CT("icon")
    public ImageModel icon;

    @C09CT("inner_feed_mg_agg_id")
    public long innerFeedMgAggId;

    @C09CT("type")
    public int type;

    @C09CT("title")
    public String title = "";

    @C09CT("desc")
    public String desc = "";

    @C09CT("btn_title")
    public String btnTitle = "";

    @C09CT("avatars")
    public List<ImageModel> avatars = new ArrayList();

    @C09CT("name")
    public String name = "";

    @C09CT("background_color")
    public String backgroundColor = "";
}
