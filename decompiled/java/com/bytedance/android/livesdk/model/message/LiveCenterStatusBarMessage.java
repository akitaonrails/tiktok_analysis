package com.bytedance.android.livesdk.model.message;

import X.AbstractC1136060ffY;
import X.C001A;
import X.C09CT;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveCenterMockToolSwitch;
import webcast.data.RealtimeLiveCenterLopInfo;
import webcast.data.RealtimeLiveCenterTrafficToolInfoIM;
import webcast.data.RealtimeLiveCenterWhiteBoxIM;
import webcast.data.RealtimeLiveCenterWhiteBoxPreviewIM;

/* JADX INFO: loaded from: classes.dex */
public final class LiveCenterStatusBarMessage extends AbstractC1136060ffY {

    @C09CT("duration")
    public long duration;

    @C09CT("lop_info")
    public RealtimeLiveCenterLopInfo lopInfo;

    @C09CT("text")
    public String text;

    @C09CT("traffic_tool_info")
    public RealtimeLiveCenterTrafficToolInfoIM trafficToolInfo;

    @C09CT("type")
    public int type;

    @C09CT(LiveCenterMockToolSwitch.WHITEBOX)
    public RealtimeLiveCenterWhiteBoxIM whiteBox;

    @C09CT("white_box_preview")
    public RealtimeLiveCenterWhiteBoxPreviewIM whiteBoxPreview;

    public LiveCenterStatusBarMessage() {
        super.type = C001A.LIVE_CENTER_STATUS_BAR_MESSAGE;
        this.text = "";
    }
}
