package webcast.data.multi_guest_play;

import X.C09CT;

/* JADX INFO: loaded from: classes.dex */
public final class ActivePlaybook {

    @C09CT("current_state_id")
    public long currentStateId;

    @C09CT("end_time")
    public long endTime;

    @C09CT("exists_custom_content")
    public boolean existsCustomContent;

    @C09CT("operator_id")
    public long operatorId;

    @C09CT("play_id")
    public long playId;

    @C09CT("play_status")
    public int playStatus;

    @C09CT("playbook")
    public Playbook playbook;

    @C09CT("playbook_group")
    public PlaybookGroup playbookGroup;

    @C09CT("room_id")
    public long roomId;

    @C09CT("start_time")
    public long startTime;

    @C09CT("version")
    public long version;

    public final String toString() {
        return "ActivePlaybook(roomId=" + this.roomId + ", playId=" + this.playId + ", playStatus=" + this.playStatus + ", playbook=" + this.playbook + ", existsCustomContent=" + this.existsCustomContent + ", startTime=" + this.startTime + ", endTime=" + this.endTime + ", playbookGroup=" + this.playbookGroup + ", operatorId=" + this.operatorId + ", version=" + this.version + ", currentStateId=" + this.currentStateId + ')';
    }
}
