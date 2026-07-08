package com.ss.android.ugc.aweme.publicgroup.data;

import X.C09CT;
import X.C13BV;
import X.C786410Ut5;
import X.EnumC1206110hUX;
import X.EnumC1219960hqs;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes20.dex */
public final class GroupForPreview {

    @C09CT("access_criteria_desc")
    public final String accessCriteriaDesc;

    @C09CT("audit_question")
    public final String auditQuestion;

    @C09CT("avatar_url")
    public final String avatarUrl;

    @C09CT("group_business_type")
    public final int businessType;

    @C09CT("conv_short_id")
    public final long convShortId;

    @C09CT("effective_config")
    public final List<GroupAccessCriteria> effectiveConfig;

    @C09CT("group_desc")
    public final String groupDesc;

    @C09CT("group_member_limit")
    public final int groupMemberLimit;

    @C09CT("group_name")
    public final String groupName;

    @C09CT("group_owner_id")
    public final long groupOwnerId;

    @C09CT("group_owner_name")
    public final String groupOwnerName;

    @C09CT("group_size")
    public final int groupSize;

    @C09CT("group_type")
    public final String groupType;

    @C09CT("audit_switch")
    public final boolean needApproval;

    @C09CT("show_status")
    public final int showStatus;

    public GroupForPreview() {
        this(0L, null, null, 0, 0, null, 0L, null, false, null, null, 0, null, null, 0, 32767, null);
    }

    public final int hashCode() {
        return (((((((((((((((((((((((((((C786410Ut5.Y2(this.convShortId) * 31) + this.groupName.hashCode()) * 31) + this.avatarUrl.hashCode()) * 31) + this.groupSize) * 31) + this.groupMemberLimit) * 31) + this.groupDesc.hashCode()) * 31) + C786410Ut5.Y2(this.groupOwnerId)) * 31) + this.groupOwnerName.hashCode()) * 31) + C786410Ut5.Z2(this.needApproval)) * 31) + this.auditQuestion.hashCode()) * 31) + this.accessCriteriaDesc.hashCode()) * 31) + this.businessType) * 31) + this.groupType.hashCode()) * 31) + this.effectiveConfig.hashCode()) * 31) + this.showStatus;
    }

    public GroupForPreview(long j, String str, String str2, int i, int i2, String str3, long j2, String str4, boolean z, String str5, String str6, int i3, String str7, List<GroupAccessCriteria> list, int i4) {
        this.convShortId = j;
        this.groupName = str;
        this.avatarUrl = str2;
        this.groupSize = i;
        this.groupMemberLimit = i2;
        this.groupDesc = str3;
        this.groupOwnerId = j2;
        this.groupOwnerName = str4;
        this.needApproval = z;
        this.auditQuestion = str5;
        this.accessCriteriaDesc = str6;
        this.businessType = i3;
        this.groupType = str7;
        this.effectiveConfig = list;
        this.showStatus = i4;
    }

    public GroupForPreview(long j, String str, String str2, int i, int i2, String str3, long j2, String str4, boolean z, String str5, String str6, int i3, String str7, List list, int i4, int i5, DefaultConstructorMarker defaultConstructorMarker) {
        this((i5 & 1) != 0 ? 0L : j, (i5 & 2) != 0 ? "" : str, (i5 & 4) != 0 ? "" : str2, (i5 & 8) != 0 ? -1 : i, (i5 & 16) != 0 ? 0 : i2, (i5 & 32) != 0 ? "" : str3, (i5 & 64) == 0 ? j2 : 0L, (i5 & 128) != 0 ? "" : str4, (i5 & 256) == 0 ? z : false, (i5 & 512) != 0 ? "" : str5, (i5 & 1024) != 0 ? "" : str6, (i5 & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0 ? EnumC1219960hqs.UNKNOWN.getValue() : i3, (i5 & SpeechEngineDefines.TTS_WORK_MODE_BOTH) == 0 ? str7 : "", (i5 & 8192) != 0 ? C13BV.INSTANCE : list, (i5 & 16384) != 0 ? EnumC1206110hUX.UNKNOWN.getValue() : i4);
    }
}
