package com.ss.android.ugc.aweme.tools.draft.ab;

import X.C09CT;
import X.C2188811AlT;

/* JADX INFO: loaded from: classes9.dex */
public final class DraftManagementConfigModel {

    @C09CT("half_year_draft")
    public final int halfYearDraft;

    @C09CT("half_year_memory_size_GB")
    public final int halfYearMemorySizeGB;

    @C09CT("push_exit_num")
    public final int pushExitNum;

    @C09CT("push_show_interval")
    public final int pushShowInterval;

    @C09CT("top_banner_device_size_GB")
    public final int topBannerDeviceSizeGB;

    @C09CT("top_banner_draft_size_MB")
    public final int topBannerDraftSizeMB;

    @C09CT("top_banner_size_section_MB")
    public final int topBannerSizeSectionMB;

    @C09CT("total_draft")
    public final int totalDraft;

    @C09CT("total_memory_size_GB")
    public final int totalMemorySizeGB;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DraftManagementConfigModel)) {
            return false;
        }
        DraftManagementConfigModel draftManagementConfigModel = (DraftManagementConfigModel) obj;
        return this.totalDraft == draftManagementConfigModel.totalDraft && this.halfYearDraft == draftManagementConfigModel.halfYearDraft && this.totalMemorySizeGB == draftManagementConfigModel.totalMemorySizeGB && this.halfYearMemorySizeGB == draftManagementConfigModel.halfYearMemorySizeGB && this.pushShowInterval == draftManagementConfigModel.pushShowInterval && this.pushExitNum == draftManagementConfigModel.pushExitNum && this.topBannerDraftSizeMB == draftManagementConfigModel.topBannerDraftSizeMB && this.topBannerDeviceSizeGB == draftManagementConfigModel.topBannerDeviceSizeGB && this.topBannerSizeSectionMB == draftManagementConfigModel.topBannerSizeSectionMB;
    }

    public final int hashCode() {
        return (((((((((((((((this.totalDraft * 31) + this.halfYearDraft) * 31) + this.totalMemorySizeGB) * 31) + this.halfYearMemorySizeGB) * 31) + this.pushShowInterval) * 31) + this.pushExitNum) * 31) + this.topBannerDraftSizeMB) * 31) + this.topBannerDeviceSizeGB) * 31) + this.topBannerSizeSectionMB;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("DraftManagementConfigModel(totalDraft=");
        sbLIZ.append(this.totalDraft);
        sbLIZ.append(", halfYearDraft=");
        sbLIZ.append(this.halfYearDraft);
        sbLIZ.append(", totalMemorySizeGB=");
        sbLIZ.append(this.totalMemorySizeGB);
        sbLIZ.append(", halfYearMemorySizeGB=");
        sbLIZ.append(this.halfYearMemorySizeGB);
        sbLIZ.append(", pushShowInterval=");
        sbLIZ.append(this.pushShowInterval);
        sbLIZ.append(", pushExitNum=");
        sbLIZ.append(this.pushExitNum);
        sbLIZ.append(", topBannerDraftSizeMB=");
        sbLIZ.append(this.topBannerDraftSizeMB);
        sbLIZ.append(", topBannerDeviceSizeGB=");
        sbLIZ.append(this.topBannerDeviceSizeGB);
        sbLIZ.append(", topBannerSizeSectionMB=");
        sbLIZ.append(this.topBannerSizeSectionMB);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public DraftManagementConfigModel() {
        this(100, 10, 3, 1, 5, 3, 500, 3, 10);
    }

    public DraftManagementConfigModel(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
        this.totalDraft = i;
        this.halfYearDraft = i2;
        this.totalMemorySizeGB = i3;
        this.halfYearMemorySizeGB = i4;
        this.pushShowInterval = i5;
        this.pushExitNum = i6;
        this.topBannerDraftSizeMB = i7;
        this.topBannerDeviceSizeGB = i8;
        this.topBannerSizeSectionMB = i9;
    }
}
