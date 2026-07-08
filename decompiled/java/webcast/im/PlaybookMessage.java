package webcast.im;

import X.AbstractC1136060ffY;
import X.C001A;
import X.C09CT;
import java.util.ArrayList;
import java.util.List;
import webcast.data.multi_guest_play.PlaybookGroup;

/* JADX INFO: loaded from: classes32.dex */
public final class PlaybookMessage extends AbstractC1136060ffY {

    @C09CT("biz_reason")
    public String bizReason;

    @C09CT("cover_url")
    public String coverUrl;

    @C09CT("current_state_id")
    public long currentStateId;

    @C09CT("first_level_tag_types")
    public List<Integer> firstLevelTagTypes;

    @C09CT("message_type")
    public int messageType;

    @C09CT("need_recharge")
    public boolean needRecharge;

    @C09CT("operator_id")
    public long operatorId;

    @C09CT("play_id")
    public long playId;

    @C09CT("play_status")
    public int playStatus;

    @C09CT("playbook_end_reason")
    public int playbookEndReason;

    @C09CT("playbook_group")
    public PlaybookGroup playbookGroup;

    @C09CT("playbook_id")
    public long playbookId;

    @C09CT("playbook_start_reason")
    public int playbookStartReason;

    @C09CT("title")
    public String title;

    @C09CT("version")
    public long version;

    public PlaybookMessage() {
        this.type = C001A.PLAYBOOK_MESSAGE;
        this.title = "";
        this.coverUrl = "";
        this.bizReason = "";
        this.firstLevelTagTypes = new ArrayList();
    }
}
