package webcast.im;

import X.C09CT;
import com.bytedance.android.livesdk.model.message.linkcore.RTCExtraInfo;
import java.util.ArrayList;
import java.util.List;
import tikcast.linkmic.common.GroupChannelAllUser;
import tikcast.linkmic.common.GroupPlayer;

/* JADX INFO: loaded from: classes.dex */
public final class JoinGroupContent {

    @C09CT("group_ext_info")
    public List<RTCExtraInfo> groupExtInfo = new ArrayList();

    @C09CT("group_user")
    public GroupChannelAllUser groupUser;

    @C09CT("join_user")
    public GroupPlayer joinUser;

    @C09CT("type")
    public int type;
}
