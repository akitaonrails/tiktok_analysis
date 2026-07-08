package tikcast.linkmic.common;

import X.C09CT;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class LayoutData {

    @C09CT("group_channel_id")
    public long groupChannelId;

    @C09CT("layout")
    public LayoutState layout;

    @C09CT("spot_list")
    public List<SpotInfo> spotList = new ArrayList();

    @C09CT("ui_pos")
    public List<PosIdentity> uiPos = new ArrayList();

    @C09CT("version")
    public long version;
}
