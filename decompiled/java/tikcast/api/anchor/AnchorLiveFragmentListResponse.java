package tikcast.api.anchor;

import X.C09CT;
import X.C2097608Jq;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class AnchorLiveFragmentListResponse {

    @C09CT("data")
    public ResponseData data;

    public static final class ResponseData {

        @C09CT("show_auto_post_notice")
        public boolean showAutoPostNotice;

        @C09CT("show_beans_gift_text")
        public boolean showBeansGiftText;

        @C09CT("show_inbox_sub_pop_up")
        public boolean showInboxSubPopUp;

        @C09CT("show_template")
        public boolean showTemplate;

        @C09CT("user_revert_switch")
        public int userRevertSwitch;

        @C09CT("room_map")
        public Map<String, AnchorFragmentListResult> roomMap = C2097608Jq.LJ();

        @C09CT("post_detail_list")
        public List<AnchorLiveFragmentPostDetail> postDetailList = new ArrayList();

        @C09CT("fragment_list")
        public List<LiveFragmentDetail> fragmentList = new ArrayList();

        @C09CT("highlight_reminder")
        public List<HighlightReminder> highlightReminder = new ArrayList();
    }
}
