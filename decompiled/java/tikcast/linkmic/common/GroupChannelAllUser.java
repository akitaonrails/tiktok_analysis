package tikcast.linkmic.common;

import X.C09CT;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class GroupChannelAllUser {

    @C09CT("content_version")
    public long contentVersion;

    @C09CT("group_channel_id")
    public long groupChannelId;

    @C09CT("user")
    public List<GroupChannelUser> user = new ArrayList();
}
