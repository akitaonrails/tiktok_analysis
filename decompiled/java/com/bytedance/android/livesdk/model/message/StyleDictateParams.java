package com.bytedance.android.livesdk.model.message;

import X.C09CT;
import java.util.ArrayList;
import java.util.List;
import webcast.data.EntryData;

/* JADX INFO: loaded from: classes.dex */
public final class StyleDictateParams {

    @C09CT("animated")
    public boolean animated;

    @C09CT("duration")
    public int duration;

    @C09CT("entry_data")
    public EntryData entryData;

    @C09CT("max_line")
    public long maxLine;

    @C09CT("max_width")
    public long maxWidth;

    @C09CT("preselected_gift_id")
    public long preselectedGiftId;

    @C09CT("preselected_match_item_id")
    public long preselectedMatchItemId;

    @C09CT("show_trailing_arrow")
    public boolean showTrailingArrow;

    @C09CT("tap_dismiss_area")
    public int tapDismissArea;

    @C09CT("bubble_decoration_list")
    public List<BubbleDecoration> bubbleDecorationList = new ArrayList();

    @C09CT("onclick_schema")
    public String onclickSchema = "";

    @C09CT("background_color")
    public String backgroundColor = "";

    @C09CT("business_type")
    public String businessType = "";

    @C09CT("bubble_content_id")
    public String bubbleContentId = "";

    @C09CT("pointing_target_type")
    public String pointingTargetType = "";
}
