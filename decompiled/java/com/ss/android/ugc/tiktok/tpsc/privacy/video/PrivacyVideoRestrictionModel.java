package com.ss.android.ugc.tiktok.tpsc.privacy.video;

import X.C09CT;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.network.model.BaseResponse;
import com.ss.android.ugc.tiktok.tpsc.model.VideoItemRestriction;
import com.ss.android.ugc.tiktok.tpsc.model.VideoItemSettings;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes29.dex */
public final class PrivacyVideoRestrictionModel extends BaseResponse {

    @C09CT("restriction")
    public final VideoItemRestriction restriction;

    @C09CT("settings")
    public final VideoItemSettings settings;

    public PrivacyVideoRestrictionModel() {
        this(null, null);
    }

    public final PrivacyVideoRestrictionModel copy(VideoItemRestriction videoItemRestriction, VideoItemSettings videoItemSettings) {
        return new PrivacyVideoRestrictionModel(videoItemRestriction, videoItemSettings);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PrivacyVideoRestrictionModel)) {
            return false;
        }
        PrivacyVideoRestrictionModel privacyVideoRestrictionModel = (PrivacyVideoRestrictionModel) obj;
        return Intrinsics.LJFF(this.restriction, privacyVideoRestrictionModel.restriction) && Intrinsics.LJFF(this.settings, privacyVideoRestrictionModel.settings);
    }

    public int hashCode() {
        VideoItemRestriction videoItemRestriction = this.restriction;
        int iHashCode = (videoItemRestriction == null ? 0 : videoItemRestriction.hashCode()) * 31;
        VideoItemSettings videoItemSettings = this.settings;
        return iHashCode + (videoItemSettings != null ? videoItemSettings.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PrivacyVideoRestrictionModel(restriction=");
        sbLIZ.append(this.restriction);
        sbLIZ.append(", settings=");
        sbLIZ.append(this.settings);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final VideoItemRestriction getRestriction() {
        return this.restriction;
    }

    public final VideoItemSettings getSettings() {
        return this.settings;
    }

    public PrivacyVideoRestrictionModel(VideoItemRestriction videoItemRestriction, VideoItemSettings videoItemSettings) {
        this.restriction = videoItemRestriction;
        this.settings = videoItemSettings;
    }
}
