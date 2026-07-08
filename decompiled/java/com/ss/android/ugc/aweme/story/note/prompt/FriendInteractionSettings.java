package com.ss.android.ugc.aweme.story.note.prompt;

import X.C09CT;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.story.experiment.thought.StoryThoughtHolidayConfigSettings;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class FriendInteractionSettings extends BaseResponse implements Serializable {
    public static final int $stable = 8;

    @C09CT("dynamic_skylight_guidance")
    public final DynamicSkylightGuidance dynamicSkylightGuidance;

    @C09CT("holiday_thought_configs")
    public final List<StoryThoughtHolidayConfigSettings.StoryThoughtHolidayConfig> holidayThoughtConfigs;

    public FriendInteractionSettings() {
        this(null, null);
    }

    public final FriendInteractionSettings copy(DynamicSkylightGuidance dynamicSkylightGuidance, List<StoryThoughtHolidayConfigSettings.StoryThoughtHolidayConfig> list) {
        return new FriendInteractionSettings(dynamicSkylightGuidance, list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FriendInteractionSettings)) {
            return false;
        }
        FriendInteractionSettings friendInteractionSettings = (FriendInteractionSettings) obj;
        return Intrinsics.LJFF(this.dynamicSkylightGuidance, friendInteractionSettings.dynamicSkylightGuidance) && Intrinsics.LJFF(this.holidayThoughtConfigs, friendInteractionSettings.holidayThoughtConfigs);
    }

    public int hashCode() {
        DynamicSkylightGuidance dynamicSkylightGuidance = this.dynamicSkylightGuidance;
        int iHashCode = (dynamicSkylightGuidance == null ? 0 : dynamicSkylightGuidance.hashCode()) * 31;
        List<StoryThoughtHolidayConfigSettings.StoryThoughtHolidayConfig> list = this.holidayThoughtConfigs;
        return iHashCode + (list != null ? list.hashCode() : 0);
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("FriendInteractionSettings(dynamicSkylightGuidance=");
        sbLIZ.append(this.dynamicSkylightGuidance);
        sbLIZ.append(", holidayThoughtConfigs=");
        sbLIZ.append(this.holidayThoughtConfigs);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final DynamicSkylightGuidance getDynamicSkylightGuidance() {
        return this.dynamicSkylightGuidance;
    }

    public final List<StoryThoughtHolidayConfigSettings.StoryThoughtHolidayConfig> getHolidayThoughtConfigs() {
        return this.holidayThoughtConfigs;
    }

    public static final class DynamicSkylightGuidance implements Serializable {
        public static final int $stable = 8;

        @C09CT("skylight_guidance_texts")
        public final List<String> skylightGuidanceTexts;

        public DynamicSkylightGuidance() {
            this(null);
        }

        public DynamicSkylightGuidance(List<String> list) {
            this.skylightGuidanceTexts = list;
        }
    }

    public FriendInteractionSettings(DynamicSkylightGuidance dynamicSkylightGuidance, List<StoryThoughtHolidayConfigSettings.StoryThoughtHolidayConfig> list) {
        this.dynamicSkylightGuidance = dynamicSkylightGuidance;
        this.holidayThoughtConfigs = list;
    }
}
