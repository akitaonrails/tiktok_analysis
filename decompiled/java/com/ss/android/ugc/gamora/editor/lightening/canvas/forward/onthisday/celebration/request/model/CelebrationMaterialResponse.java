package com.ss.android.ugc.gamora.editor.lightening.canvas.forward.onthisday.celebration.request.model;

import X.C09CT;
import X.C786410Ut5;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.story.celebration.CelebrationExitStrategy;
import com.ss.android.ugc.aweme.story.celebration.CelebrationExtraParams;
import com.ss.android.ugc.aweme.story.celebration.CelebrationRenderedVideo;
import com.ss.android.ugc.aweme.story.celebration.CelebrationScenePullRate;
import com.ss.android.ugc.aweme.story.celebration.CelebrationTemplateConfig;
import com.ss.android.ugc.aweme.story.celebration.CelebrationTemplateInfo;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class CelebrationMaterialResponse extends BaseResponse {

    @C09CT("celebration_pull_rate_control")
    public final CelebrationScenePullRate celebrationPullRateControl;

    @C09CT("celebration_type")
    public final int celebrationType;

    @C09CT("data")
    public final List<Aweme> data;

    @C09CT("exit_strategy")
    public final CelebrationExitStrategy exitStrategy;

    @C09CT("extra_params")
    public final CelebrationExtraParams extraParams;

    @C09CT("is_celebration")
    public final boolean isCelebration;

    @C09CT("is_exited")
    public final Boolean isExited;

    @C09CT("is_published")
    public final Boolean isPublished;

    @C09CT("landing_schema_after_exit")
    public final String landingSchemaAfterExit;

    @C09CT("rendered_video")
    public final CelebrationRenderedVideo renderedVideo;

    @C09CT("template_schema")
    public final CelebrationTemplateConfig templateConfig;

    @C09CT("ui_template_info")
    public final List<CelebrationTemplateInfo> uiTemplateInfo;

    @C09CT("unique_id")
    public final String uniqueId;

    public CelebrationMaterialResponse() {
        this(0, false, null, null, null, "", null, null, null, null, null, null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CelebrationMaterialResponse)) {
            return false;
        }
        CelebrationMaterialResponse celebrationMaterialResponse = (CelebrationMaterialResponse) obj;
        return this.celebrationType == celebrationMaterialResponse.celebrationType && this.isCelebration == celebrationMaterialResponse.isCelebration && Intrinsics.LJFF(this.data, celebrationMaterialResponse.data) && Intrinsics.LJFF(this.uiTemplateInfo, celebrationMaterialResponse.uiTemplateInfo) && Intrinsics.LJFF(this.celebrationPullRateControl, celebrationMaterialResponse.celebrationPullRateControl) && Intrinsics.LJFF(this.uniqueId, celebrationMaterialResponse.uniqueId) && Intrinsics.LJFF(this.isExited, celebrationMaterialResponse.isExited) && Intrinsics.LJFF(this.extraParams, celebrationMaterialResponse.extraParams) && Intrinsics.LJFF(this.templateConfig, celebrationMaterialResponse.templateConfig) && Intrinsics.LJFF(this.exitStrategy, celebrationMaterialResponse.exitStrategy) && Intrinsics.LJFF(this.landingSchemaAfterExit, celebrationMaterialResponse.landingSchemaAfterExit) && Intrinsics.LJFF(this.isPublished, celebrationMaterialResponse.isPublished) && Intrinsics.LJFF(this.renderedVideo, celebrationMaterialResponse.renderedVideo);
    }

    public final int hashCode() {
        int iZ2 = ((this.celebrationType * 31) + C786410Ut5.Z2(this.isCelebration)) * 31;
        List<Aweme> list = this.data;
        int iHashCode = (iZ2 + (list == null ? 0 : list.hashCode())) * 31;
        List<CelebrationTemplateInfo> list2 = this.uiTemplateInfo;
        int iHashCode2 = (iHashCode + (list2 == null ? 0 : list2.hashCode())) * 31;
        CelebrationScenePullRate celebrationScenePullRate = this.celebrationPullRateControl;
        int iHashCode3 = (((iHashCode2 + (celebrationScenePullRate == null ? 0 : celebrationScenePullRate.hashCode())) * 31) + this.uniqueId.hashCode()) * 31;
        Boolean bool = this.isExited;
        int iHashCode4 = (iHashCode3 + (bool == null ? 0 : bool.hashCode())) * 31;
        CelebrationExtraParams celebrationExtraParams = this.extraParams;
        int iHashCode5 = (iHashCode4 + (celebrationExtraParams == null ? 0 : celebrationExtraParams.hashCode())) * 31;
        CelebrationTemplateConfig celebrationTemplateConfig = this.templateConfig;
        int iHashCode6 = (iHashCode5 + (celebrationTemplateConfig == null ? 0 : celebrationTemplateConfig.hashCode())) * 31;
        CelebrationExitStrategy celebrationExitStrategy = this.exitStrategy;
        int iHashCode7 = (iHashCode6 + (celebrationExitStrategy == null ? 0 : celebrationExitStrategy.hashCode())) * 31;
        String str = this.landingSchemaAfterExit;
        int iHashCode8 = (iHashCode7 + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool2 = this.isPublished;
        int iHashCode9 = (iHashCode8 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        CelebrationRenderedVideo celebrationRenderedVideo = this.renderedVideo;
        return iHashCode9 + (celebrationRenderedVideo != null ? celebrationRenderedVideo.hashCode() : 0);
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public final String toString() {
        return "CelebrationMaterialResponse(celebrationType=" + this.celebrationType + ", isCelebration=" + this.isCelebration + ", data=" + this.data + ", uiTemplateInfo=" + this.uiTemplateInfo + ", celebrationPullRateControl=" + this.celebrationPullRateControl + ", uniqueId=" + this.uniqueId + ", isExited=" + this.isExited + ", extraParams=" + this.extraParams + ", templateConfig=" + this.templateConfig + ", exitStrategy=" + this.exitStrategy + ", landingSchemaAfterExit=" + this.landingSchemaAfterExit + ", isPublished=" + this.isPublished + ", renderedVideo=" + this.renderedVideo + ')';
    }

    /* JADX WARN: Multi-variable type inference failed */
    public CelebrationMaterialResponse(int i, boolean z, List<? extends Aweme> list, List<CelebrationTemplateInfo> list2, CelebrationScenePullRate celebrationScenePullRate, String str, Boolean bool, CelebrationExtraParams celebrationExtraParams, CelebrationTemplateConfig celebrationTemplateConfig, CelebrationExitStrategy celebrationExitStrategy, String str2, Boolean bool2, CelebrationRenderedVideo celebrationRenderedVideo) {
        this.celebrationType = i;
        this.isCelebration = z;
        this.data = list;
        this.uiTemplateInfo = list2;
        this.celebrationPullRateControl = celebrationScenePullRate;
        this.uniqueId = str;
        this.isExited = bool;
        this.extraParams = celebrationExtraParams;
        this.templateConfig = celebrationTemplateConfig;
        this.exitStrategy = celebrationExitStrategy;
        this.landingSchemaAfterExit = str2;
        this.isPublished = bool2;
        this.renderedVideo = celebrationRenderedVideo;
    }
}
