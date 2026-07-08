package webcast.data.multilive_biz;

import X.C09CT;
import java.util.ArrayList;
import java.util.List;
import webcast.data.multi_guest_play.ActivePlaybook;
import webcast.data.multi_guest_play.CountdownContent;
import webcast.data.multi_guest_play.CountdownForAllContent;
import webcast.data.multi_guest_play.GuestShowdownContent;
import webcast.data.multi_guest_play.NoticeboardContent;
import webcast.data.multi_guest_play.ShowContent;
import webcast.data.multi_guest_play.TextHeaderPlayContent;
import webcast.data.multi_guest_play.TopGuestMetaContent;

/* JADX INFO: loaded from: classes.dex */
public final class BizResumeResponse {

    @C09CT("data")
    public ResponseData data;

    public static final class ResponseData {

        @C09CT("active_playbook")
        public ActivePlaybook activePlaybook;

        @C09CT("countdown_for_all_content")
        public CountdownForAllContent countdownForAllContent;

        @C09CT("guest_showdown_content")
        public GuestShowdownContent guestShowdownContent;

        @C09CT("is_showing")
        public boolean isShowing;

        @C09CT("quick_call_auto_approve")
        public int quickCallAutoApprove;

        @C09CT("quick_call_auto_approve_start_ms")
        public long quickCallAutoApproveStartMs;

        @C09CT("show_content")
        public ShowContent showContent;

        @C09CT("text_header_content")
        public TextHeaderPlayContent textHeaderContent;

        @C09CT("top_guest_meta")
        public TopGuestMetaContent topGuestMeta;

        @C09CT("countdown_contents")
        public List<CountdownContent> countdownContents = new ArrayList();

        @C09CT("noticeboard_contents")
        public List<NoticeboardContent> noticeboardContents = new ArrayList();
    }
}
