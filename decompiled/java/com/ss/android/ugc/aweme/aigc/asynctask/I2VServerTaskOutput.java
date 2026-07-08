package com.ss.android.ugc.aweme.aigc.asynctask;

import X.C09CT;
import X.C13BV;
import X.C2097608Jq;
import X.C786410Ut5;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.ss.android.ugc.aweme.creative.model.aigc.AIGCResultType;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class I2VServerTaskOutput extends AbsTaskOutput {

    @C09CT("child_errorCode")
    public final int errorCode;

    @C09CT("child_errorMsg")
    public final String errorMsg;

    @C09CT("child_errorSource")
    public final String errorSource;

    @C09CT("extra")
    public final String extra;

    @C09CT("child_fail_reason_msg")
    public final String failReasonMsg;

    @C09CT("ip_rephrased_prompt")
    public final String ipRephrasedPrompt;

    @C09CT("child_log_id")
    public final String logId;

    @C09CT("quota_result")
    public final QuotaResult quotaResult;

    @C09CT("server_create_time")
    public final long serverCreateTime;

    @C09CT("server_end_time")
    public final long serverEndTime;

    @C09CT("child_serverTaskId")
    public final String serverTaskId;

    @C09CT("child_status")
    public final String status;

    @C09CT("upload_end_time")
    public final long uploadTaskEndTime;

    @C09CT("uri_migration_map")
    public final Map<String, String> uriMigrationMap;

    @C09CT("child_videoUrl")
    public final String videoUrl;

    @C09CT("child_videoUrlList")
    public final List<AIGCServerTaskOutput> videoUrlList;

    @C09CT("file_url_type")
    public final AIGCResultType videoUrlType;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof I2VServerTaskOutput)) {
            return false;
        }
        I2VServerTaskOutput i2VServerTaskOutput = (I2VServerTaskOutput) obj;
        return Intrinsics.LJFF(this.status, i2VServerTaskOutput.status) && this.errorCode == i2VServerTaskOutput.errorCode && Intrinsics.LJFF(this.errorMsg, i2VServerTaskOutput.errorMsg) && Intrinsics.LJFF(this.errorSource, i2VServerTaskOutput.errorSource) && Intrinsics.LJFF(this.failReasonMsg, i2VServerTaskOutput.failReasonMsg) && Intrinsics.LJFF(this.videoUrl, i2VServerTaskOutput.videoUrl) && this.videoUrlType == i2VServerTaskOutput.videoUrlType && Intrinsics.LJFF(this.serverTaskId, i2VServerTaskOutput.serverTaskId) && Intrinsics.LJFF(this.videoUrlList, i2VServerTaskOutput.videoUrlList) && Intrinsics.LJFF(this.logId, i2VServerTaskOutput.logId) && this.serverCreateTime == i2VServerTaskOutput.serverCreateTime && this.serverEndTime == i2VServerTaskOutput.serverEndTime && Intrinsics.LJFF(this.extra, i2VServerTaskOutput.extra) && Intrinsics.LJFF(this.uriMigrationMap, i2VServerTaskOutput.uriMigrationMap) && Intrinsics.LJFF(this.ipRephrasedPrompt, i2VServerTaskOutput.ipRephrasedPrompt) && this.uploadTaskEndTime == i2VServerTaskOutput.uploadTaskEndTime && Intrinsics.LJFF(this.quotaResult, i2VServerTaskOutput.quotaResult);
    }

    public final int hashCode() {
        int iHashCode = ((((this.status.hashCode() * 31) + this.errorCode) * 31) + this.errorMsg.hashCode()) * 31;
        String str = this.errorSource;
        return ((((((((((((((((((((((((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.failReasonMsg.hashCode()) * 31) + this.videoUrl.hashCode()) * 31) + this.videoUrlType.hashCode()) * 31) + this.serverTaskId.hashCode()) * 31) + this.videoUrlList.hashCode()) * 31) + this.logId.hashCode()) * 31) + C786410Ut5.Y2(this.serverCreateTime)) * 31) + C786410Ut5.Y2(this.serverEndTime)) * 31) + this.extra.hashCode()) * 31) + this.uriMigrationMap.hashCode()) * 31) + this.ipRephrasedPrompt.hashCode()) * 31) + C786410Ut5.Y2(this.uploadTaskEndTime)) * 31) + this.quotaResult.hashCode();
    }

    public final String toString() {
        return "I2VServerTaskOutput(status=" + this.status + ", errorCode=" + this.errorCode + ", errorMsg=" + this.errorMsg + ", errorSource=" + this.errorSource + ", failReasonMsg=" + this.failReasonMsg + ", videoUrl=" + this.videoUrl + ", videoUrlType=" + this.videoUrlType + ", serverTaskId=" + this.serverTaskId + ", videoUrlList=" + this.videoUrlList + ", logId=" + this.logId + ", serverCreateTime=" + this.serverCreateTime + ", serverEndTime=" + this.serverEndTime + ", extra=" + this.extra + ", uriMigrationMap=" + this.uriMigrationMap + ", ipRephrasedPrompt=" + this.ipRephrasedPrompt + ", uploadTaskEndTime=" + this.uploadTaskEndTime + ", quotaResult=" + this.quotaResult + ')';
    }

    @Override // com.ss.android.ugc.aweme.aigc.asynctask.AbsTaskOutput
    public final int LIZ() {
        return this.errorCode;
    }

    @Override // com.ss.android.ugc.aweme.aigc.asynctask.AbsTaskOutput
    public final String LIZIZ() {
        return this.errorMsg;
    }

    @Override // com.ss.android.ugc.aweme.aigc.asynctask.AbsTaskOutput
    public final String LIZJ() {
        return this.errorSource;
    }

    @Override // com.ss.android.ugc.aweme.aigc.asynctask.AbsTaskOutput
    public final String LIZLLL() {
        return this.failReasonMsg;
    }

    @Override // com.ss.android.ugc.aweme.aigc.asynctask.AbsTaskOutput
    public final String LJ() {
        return this.status;
    }

    public I2VServerTaskOutput(String str, int i, String str2, String str3, String str4, String str5, AIGCResultType aIGCResultType, String str6, List<AIGCServerTaskOutput> list, String str7, long j, long j2, String str8, Map<String, String> map, String str9, long j3, QuotaResult quotaResult) {
        super(str, i, str2, null, "");
        this.status = str;
        this.errorCode = i;
        this.errorMsg = str2;
        this.errorSource = str3;
        this.failReasonMsg = str4;
        this.videoUrl = str5;
        this.videoUrlType = aIGCResultType;
        this.serverTaskId = str6;
        this.videoUrlList = list;
        this.logId = str7;
        this.serverCreateTime = j;
        this.serverEndTime = j2;
        this.extra = str8;
        this.uriMigrationMap = map;
        this.ipRephrasedPrompt = str9;
        this.uploadTaskEndTime = j3;
        this.quotaResult = quotaResult;
    }

    public I2VServerTaskOutput(String str, int i, String str2, String str3, String str4, String str5, AIGCResultType aIGCResultType, String str6, List list, String str7, long j, long j2, String str8, Map map, String str9, long j3, QuotaResult quotaResult, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i2 & 2) != 0 ? 0 : i, (i2 & 4) != 0 ? "" : str2, (i2 & 8) != 0 ? null : str3, (i2 & 16) != 0 ? "" : str4, (i2 & 32) != 0 ? "" : str5, (i2 & 64) != 0 ? AIGCResultType.VIDEO : aIGCResultType, (i2 & 128) != 0 ? "" : str6, (i2 & 256) != 0 ? C13BV.INSTANCE : list, (i2 & 512) != 0 ? "" : str7, (i2 & 1024) != 0 ? 0L : j, (i2 & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0 ? 0L : j2, (i2 & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0 ? "" : str8, (i2 & 8192) != 0 ? C2097608Jq.LJ() : map, (i2 & 16384) == 0 ? str9 : "", (32768 & i2) != 0 ? 0L : j3, (i2 & 65536) != 0 ? new QuotaResult(null, null, null, "", null) : quotaResult);
    }
}
