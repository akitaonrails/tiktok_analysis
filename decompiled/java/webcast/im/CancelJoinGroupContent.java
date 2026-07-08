package webcast.im;

import X.C09CT;
import java.util.ArrayList;
import java.util.List;
import tikcast.linkmic.common.GroupChannelAllUser;
import tikcast.linkmic.common.GroupPlayer;

/* JADX INFO: loaded from: classes.dex */
public final class CancelJoinGroupContent {

    @C09CT("group_user")
    public GroupChannelAllUser groupUser;

    @C09CT("leaver")
    public List<GroupPlayer> leaver = new ArrayList();

    @C09CT("operator")
    public GroupPlayer operator;

    @C09CT("type")
    public int type;
}
