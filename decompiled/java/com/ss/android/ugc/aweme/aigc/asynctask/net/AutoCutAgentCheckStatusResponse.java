package com.ss.android.ugc.aweme.aigc.asynctask.net;

import X.C09CT;
import X.C2188811AlT;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class AutoCutAgentCheckStatusResponse {
    public static final int $stable = 8;

    @C09CT("base_resp")
    public final AutoCutAgentBaseResp baseResp;

    @C09CT("estimated_time_remaining_ms")
    public final Long estimatedTimeRemainingMs;

    @C09CT("extra")
    public final Extra extra;

    @C09CT("log_pb")
    public final LogPb logPb;

    @C09CT("overall_progress_percent")
    public final Integer overallProgressPercent;

    @C09CT("status_code")
    public final Integer statusCode;

    @C09CT("status_msg")
    public final String statusMsg;

    @C09CT("task_status_info")
    public final List<TaskStatusInfoResponse> taskStatusInfo;

    public AutoCutAgentCheckStatusResponse() {
        this(null, null, null, null, null, null, null, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AutoCutAgentCheckStatusResponse)) {
            return false;
        }
        AutoCutAgentCheckStatusResponse autoCutAgentCheckStatusResponse = (AutoCutAgentCheckStatusResponse) obj;
        return Intrinsics.LJFF(this.baseResp, autoCutAgentCheckStatusResponse.baseResp) && Intrinsics.LJFF(this.overallProgressPercent, autoCutAgentCheckStatusResponse.overallProgressPercent) && Intrinsics.LJFF(this.estimatedTimeRemainingMs, autoCutAgentCheckStatusResponse.estimatedTimeRemainingMs) && Intrinsics.LJFF(this.statusCode, autoCutAgentCheckStatusResponse.statusCode) && Intrinsics.LJFF(this.statusMsg, autoCutAgentCheckStatusResponse.statusMsg) && Intrinsics.LJFF(this.extra, autoCutAgentCheckStatusResponse.extra) && Intrinsics.LJFF(this.logPb, autoCutAgentCheckStatusResponse.logPb) && Intrinsics.LJFF(this.taskStatusInfo, autoCutAgentCheckStatusResponse.taskStatusInfo);
    }

    public int hashCode() {
        AutoCutAgentBaseResp autoCutAgentBaseResp = this.baseResp;
        int iHashCode = (autoCutAgentBaseResp == null ? 0 : autoCutAgentBaseResp.hashCode()) * 31;
        Integer num = this.overallProgressPercent;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        Long l = this.estimatedTimeRemainingMs;
        int iHashCode3 = (iHashCode2 + (l == null ? 0 : l.hashCode())) * 31;
        Integer num2 = this.statusCode;
        int iHashCode4 = (iHashCode3 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str = this.statusMsg;
        int iHashCode5 = (iHashCode4 + (str == null ? 0 : str.hashCode())) * 31;
        Extra extra = this.extra;
        int iHashCode6 = (iHashCode5 + (extra == null ? 0 : extra.hashCode())) * 31;
        LogPb logPb = this.logPb;
        int iHashCode7 = (iHashCode6 + (logPb == null ? 0 : logPb.hashCode())) * 31;
        List<TaskStatusInfoResponse> list = this.taskStatusInfo;
        return iHashCode7 + (list != null ? list.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AutoCutAgentCheckStatusResponse(baseResp=");
        sbLIZ.append(this.baseResp);
        sbLIZ.append(", overallProgressPercent=");
        sbLIZ.append(this.overallProgressPercent);
        sbLIZ.append(", estimatedTimeRemainingMs=");
        sbLIZ.append(this.estimatedTimeRemainingMs);
        sbLIZ.append(", statusCode=");
        sbLIZ.append(this.statusCode);
        sbLIZ.append(", statusMsg=");
        sbLIZ.append(this.statusMsg);
        sbLIZ.append(", extra=");
        sbLIZ.append(this.extra);
        sbLIZ.append(", logPb=");
        sbLIZ.append(this.logPb);
        sbLIZ.append(", taskStatusInfo=");
        sbLIZ.append(this.taskStatusInfo);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final class LogPb {
        public static final int $stable = 0;

        @C09CT("impr_id")
        public final String imprId;

        public LogPb() {
            this(null);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof LogPb) && Intrinsics.LJFF(this.imprId, ((LogPb) obj).imprId);
        }

        public int hashCode() {
            String str = this.imprId;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public String toString() {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("LogPb(imprId=");
            sbLIZ.append(this.imprId);
            sbLIZ.append(')');
            return C2188811AlT.LIZIZ(sbLIZ);
        }

        public LogPb(String str) {
            this.imprId = str;
        }
    }

    public static final class Extra {
        public static final int $stable = 8;

        @C09CT("fatal_item_ids")
        public final List<String> fatalItemIds;

        @C09CT("logid")
        public final String logId;

        @C09CT("now")
        public final Long now;

        public Extra() {
            this(null, null, null);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Extra)) {
                return false;
            }
            Extra extra = (Extra) obj;
            return Intrinsics.LJFF(this.fatalItemIds, extra.fatalItemIds) && Intrinsics.LJFF(this.logId, extra.logId) && Intrinsics.LJFF(this.now, extra.now);
        }

        public int hashCode() {
            List<String> list = this.fatalItemIds;
            int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
            String str = this.logId;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            Long l = this.now;
            return iHashCode2 + (l != null ? l.hashCode() : 0);
        }

        public String toString() {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Extra(fatalItemIds=");
            sbLIZ.append(this.fatalItemIds);
            sbLIZ.append(", logId=");
            sbLIZ.append(this.logId);
            sbLIZ.append(", now=");
            sbLIZ.append(this.now);
            sbLIZ.append(')');
            return C2188811AlT.LIZIZ(sbLIZ);
        }

        public Extra(List<String> list, String str, Long l) {
            this.fatalItemIds = list;
            this.logId = str;
            this.now = l;
        }
    }

    public AutoCutAgentCheckStatusResponse(AutoCutAgentBaseResp autoCutAgentBaseResp, Integer num, Long l, Integer num2, String str, Extra extra, LogPb logPb, List<TaskStatusInfoResponse> list) {
        this.baseResp = autoCutAgentBaseResp;
        this.overallProgressPercent = num;
        this.estimatedTimeRemainingMs = l;
        this.statusCode = num2;
        this.statusMsg = str;
        this.extra = extra;
        this.logPb = logPb;
        this.taskStatusInfo = list;
    }

    /* JADX INFO: loaded from: classes9.dex */
    public static final class TaskStatusInfoResponse {
        public static final int $stable = 0;

        @C09CT("estimated_time_remaining_ms")
        public final Long estimatedTimeRemainingMs;

        @C09CT("index")
        public final Integer index;

        @C09CT("metrics_infos")
        public final String metricsInfos;

        @C09CT("nle_draft")
        public final String nleDraft;

        @C09CT("overall_progress_percent")
        public final Integer overallProgressPercent;

        @C09CT("progress_infos")
        public final String progressInfos;

        @C09CT("status_code")
        public final Integer statusCode;

        @C09CT("status_message")
        public final String statusMsg;

        @C09CT("task_id")
        public final String taskId;

        @C09CT("title")
        public final String title;

        public TaskStatusInfoResponse() {
            this(null, null, null, null, null, null, null, null, null, null);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof TaskStatusInfoResponse)) {
                return false;
            }
            TaskStatusInfoResponse taskStatusInfoResponse = (TaskStatusInfoResponse) obj;
            return Intrinsics.LJFF(this.taskId, taskStatusInfoResponse.taskId) && Intrinsics.LJFF(this.index, taskStatusInfoResponse.index) && Intrinsics.LJFF(this.overallProgressPercent, taskStatusInfoResponse.overallProgressPercent) && Intrinsics.LJFF(this.statusCode, taskStatusInfoResponse.statusCode) && Intrinsics.LJFF(this.statusMsg, taskStatusInfoResponse.statusMsg) && Intrinsics.LJFF(this.progressInfos, taskStatusInfoResponse.progressInfos) && Intrinsics.LJFF(this.estimatedTimeRemainingMs, taskStatusInfoResponse.estimatedTimeRemainingMs) && Intrinsics.LJFF(this.nleDraft, taskStatusInfoResponse.nleDraft) && Intrinsics.LJFF(this.title, taskStatusInfoResponse.title) && Intrinsics.LJFF(this.metricsInfos, taskStatusInfoResponse.metricsInfos);
        }

        public int hashCode() {
            String str = this.taskId;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            Integer num = this.index;
            int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
            Integer num2 = this.overallProgressPercent;
            int iHashCode3 = (iHashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
            Integer num3 = this.statusCode;
            int iHashCode4 = (iHashCode3 + (num3 == null ? 0 : num3.hashCode())) * 31;
            String str2 = this.statusMsg;
            int iHashCode5 = (iHashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.progressInfos;
            int iHashCode6 = (iHashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31;
            Long l = this.estimatedTimeRemainingMs;
            int iHashCode7 = (iHashCode6 + (l == null ? 0 : l.hashCode())) * 31;
            String str4 = this.nleDraft;
            int iHashCode8 = (iHashCode7 + (str4 == null ? 0 : str4.hashCode())) * 31;
            String str5 = this.title;
            int iHashCode9 = (iHashCode8 + (str5 == null ? 0 : str5.hashCode())) * 31;
            String str6 = this.metricsInfos;
            return iHashCode9 + (str6 != null ? str6.hashCode() : 0);
        }

        public String toString() {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("TaskStatusInfoResponse(taskId=");
            sbLIZ.append(this.taskId);
            sbLIZ.append(", index=");
            sbLIZ.append(this.index);
            sbLIZ.append(", overallProgressPercent=");
            sbLIZ.append(this.overallProgressPercent);
            sbLIZ.append(", statusCode=");
            sbLIZ.append(this.statusCode);
            sbLIZ.append(", statusMsg=");
            sbLIZ.append(this.statusMsg);
            sbLIZ.append(", progressInfos=");
            sbLIZ.append(this.progressInfos);
            sbLIZ.append(", estimatedTimeRemainingMs=");
            sbLIZ.append(this.estimatedTimeRemainingMs);
            sbLIZ.append(", nleDraft=");
            sbLIZ.append(this.nleDraft);
            sbLIZ.append(", title=");
            sbLIZ.append(this.title);
            sbLIZ.append(", metricsInfos=");
            sbLIZ.append(this.metricsInfos);
            sbLIZ.append(')');
            return C2188811AlT.LIZIZ(sbLIZ);
        }

        public TaskStatusInfoResponse(String str, Integer num, Integer num2, Integer num3, String str2, String str3, Long l, String str4, String str5, String str6) {
            this.taskId = str;
            this.index = num;
            this.overallProgressPercent = num2;
            this.statusCode = num3;
            this.statusMsg = str2;
            this.progressInfos = str3;
            this.estimatedTimeRemainingMs = l;
            this.nleDraft = str4;
            this.title = str5;
            this.metricsInfos = str6;
        }
    }
}
