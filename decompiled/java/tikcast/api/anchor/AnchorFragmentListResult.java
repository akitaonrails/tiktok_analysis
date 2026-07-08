package tikcast.api.anchor;

import X.C09CT;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class AnchorFragmentListResult {

    @C09CT("generate_status")
    public int generateStatus;

    @C09CT("has_muted")
    public boolean hasMuted;

    @C09CT("high_value_info")
    public HighValueInfomation highValueInfo;

    @C09CT("highlight_collection")
    public HighlightCollection highlightCollection;

    @C09CT("room_revert_switch")
    public int roomRevertSwitch;

    @C09CT("fragment_list")
    public List<LiveFragmentDetail> fragmentList = new ArrayList();

    @C09CT("posted_fragment_list")
    public List<LiveFragmentDetail> postedFragmentList = new ArrayList();
}
