package com.bytedance.android.livesdk.model.message;

import X.AbstractC1136060ffY;
import X.C001A;
import X.C09CT;
import com.bytedance.android.livesdk.model.message.common.Text;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class GapHighlightPushGuideMessage extends AbstractC1136060ffY {

    @C09CT("auto_post_switch_status")
    public long autoPostSwitchStatus;

    @C09CT("autocuts_window_end_ts")
    public long autocutsWindowEndTs;

    @C09CT("autocuts_window_start_ts")
    public long autocutsWindowStartTs;

    @C09CT("fragments")
    public List<LiveFragment> fragments;

    @C09CT("is_game_room")
    public boolean isGameRoom;

    @C09CT("main_title")
    public Text mainTitle;

    @C09CT("sub_title")
    public Text subTitle;

    public GapHighlightPushGuideMessage() {
        this.type = C001A.GAP_HIGHLIGHT_PUSH_GUIDE_MESSAGE;
        this.fragments = new ArrayList();
    }
}
