package tikcast.api.epiphron;

import X.C09CT;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public final class ToolbarTipsCheckFeature {

    @C09CT("anchor_id")
    public long anchorId;

    @C09CT("room_id")
    public long roomId;

    @C09CT("watch_duration")
    public long watchDuration;

    @C09CT("toolbar_tips_trigger_name")
    public String toolbarTipsTriggerName = "";

    @C09CT("show_com_types")
    public List<Integer> showComTypes = new ArrayList();

    @C09CT("unclick_com_types")
    public List<Integer> unclickComTypes = new ArrayList();
}
