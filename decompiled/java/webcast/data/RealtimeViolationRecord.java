package webcast.data;

import X.C09CT;
import com.bytedance.android.livesdk.model.message.PunishEventInfo;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;

/* JADX INFO: loaded from: classes34.dex */
public final class RealtimeViolationRecord {

    @C09CT("appeal_info")
    public AppealInfo appealInfo;

    @C09CT("end_time")
    public long endTime;

    @C09CT("icon_type")
    public int iconType;

    @C09CT("punish_info")
    public PunishEventInfo punishInfo;

    @C09CT("start_time")
    public long startTime;

    @C09CT(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS)
    public int status;

    @C09CT("type")
    public int type;

    @C09CT("title")
    public String title = "";

    @C09CT("reason")
    public String reason = "";

    @C09CT("suggestion")
    public String suggestion = "";

    @C09CT("issue_time_text")
    public String issueTimeText = "";

    public final RealtimeViolationRecord LIZ() {
        RealtimeViolationRecord realtimeViolationRecord = new RealtimeViolationRecord();
        realtimeViolationRecord.startTime = this.startTime;
        realtimeViolationRecord.endTime = this.endTime;
        realtimeViolationRecord.title = this.title;
        realtimeViolationRecord.reason = this.reason;
        realtimeViolationRecord.suggestion = this.suggestion;
        realtimeViolationRecord.type = this.type;
        realtimeViolationRecord.punishInfo = this.punishInfo;
        realtimeViolationRecord.status = this.status;
        realtimeViolationRecord.issueTimeText = this.issueTimeText;
        AppealInfo appealInfo = this.appealInfo;
        if (appealInfo != null) {
            AppealInfo appealInfo2 = new AppealInfo();
            realtimeViolationRecord.appealInfo = appealInfo2;
            appealInfo2.appealStatus = appealInfo.appealStatus;
            appealInfo2.showAppeal = appealInfo.showAppeal;
            appealInfo2.roomId = appealInfo.roomId;
            appealInfo2.hostCenterAppealType = appealInfo.hostCenterAppealType;
        }
        return realtimeViolationRecord;
    }
}
