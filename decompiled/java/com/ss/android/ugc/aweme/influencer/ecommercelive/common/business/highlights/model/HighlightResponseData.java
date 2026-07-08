package com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.highlights.model;

import X.C09CT;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public final class HighlightResponseData implements Serializable {
    public static final int $stable = 8;

    @C09CT("auto_post_data")
    public final HighlightAutoPostData autoPostData;

    @C09CT("auto_post_guidance_card")
    public final ECGuidanceCard autoPostGuidanceCard;

    @C09CT("auto_post_switch_cell")
    public final AutoPostSwitchCell autoPostSwitchCell;

    @C09CT("live_recording_bar")
    public final LiveRecordingEntranceBar liveRecordingBar;

    @C09CT("new_user_guide")
    public final HighlightNewUserGuide newUserGuide;

    @C09CT("offset")
    public final Integer offset;

    @C09CT("highlight_timeline")
    public final List<HighlightTimelineCardGroup> timeline;

    @C09CT("highlight_top")
    public final HighlightCard topHighlights;

    public HighlightResponseData(HighlightNewUserGuide highlightNewUserGuide, HighlightAutoPostData highlightAutoPostData, HighlightCard highlightCard, List<HighlightTimelineCardGroup> list, Integer num, LiveRecordingEntranceBar liveRecordingEntranceBar, ECGuidanceCard eCGuidanceCard, AutoPostSwitchCell autoPostSwitchCell) {
        this.newUserGuide = highlightNewUserGuide;
        this.autoPostData = highlightAutoPostData;
        this.topHighlights = highlightCard;
        this.timeline = list;
        this.offset = num;
        this.liveRecordingBar = liveRecordingEntranceBar;
        this.autoPostGuidanceCard = eCGuidanceCard;
        this.autoPostSwitchCell = autoPostSwitchCell;
    }
}
