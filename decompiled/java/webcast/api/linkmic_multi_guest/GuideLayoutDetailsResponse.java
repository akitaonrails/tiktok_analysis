package webcast.api.linkmic_multi_guest;

import X.C09CT;
import java.util.ArrayList;
import java.util.List;
import tikcast.linkmic.common.AnchorPanelLayoutTypeSetting;
import tikcast.linkmic.common.LayoutData;

/* JADX INFO: loaded from: classes.dex */
public final class GuideLayoutDetailsResponse {

    @C09CT("data")
    public ResponseData data;

    @C09CT("extra")
    public Extra extra;

    public static final class AnchorLayoutSetting {

        @C09CT("panel_layout_type_setting")
        public List<AnchorPanelLayoutTypeSetting> panelLayoutTypeSetting = new ArrayList();
    }

    public static final class AnchorSetting {

        @C09CT("bubbles")
        public List<Bubble> bubbles = new ArrayList();

        @C09CT("multi_guest_apply_auto_approve")
        public int multiGuestApplyAutoApprove;
    }

    public static final class Bubble {

        @C09CT("text")
        public String text = "";

        @C09CT("type")
        public int type;
    }

    public static final class Extra {

        @C09CT("now")
        public long now;
    }

    public static final class ResponseData {

        @C09CT("anchor_layout_setting")
        public AnchorLayoutSetting anchorLayoutSetting;

        @C09CT("anchor_setting")
        public AnchorSetting anchorSetting;

        @C09CT("is_lastly_mg")
        public boolean isLastlyMg;

        @C09CT("room_layout_data")
        public LayoutData roomLayoutData;

        @C09CT("show_available_spot")
        public int showAvailableSpot;
    }
}
