package webcast.data;

import X.C09CT;
import com.bytedance.android.live.base.model.ImageModel;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class PreviewCommentInfo {

    @C09CT("expire_time")
    public long expireTime;

    @C09CT("icon")
    public ImageModel icon;

    @C09CT("polling_interval")
    public long pollingInterval;

    @C09CT("comment_list")
    public List<PreviewCommentItem> commentList = new ArrayList();

    @C09CT("title")
    public String title = "";
}
