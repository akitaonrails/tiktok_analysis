package com.ss.android.ugc.aweme.story.experiment.thought;

import X.C01GW;
import X.C09CT;
import X.C452501pT;
import com.ss.android.ugc.aweme.feed.model.story.BackgroundModel;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.AFwS207S0000000_19;

/* JADX INFO: loaded from: classes20.dex */
public final class StoryThoughtHolidayConfigSettings {
    public static final StoryThoughtHolidayConfigSettings LIZ = new StoryThoughtHolidayConfigSettings();
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS207S0000000_19.get$arr$(322));

    /* JADX INFO: loaded from: classes32.dex */
    public static final class StoryThoughtHolidayConfig implements Serializable {
        public static final int $stable = 8;

        @C09CT("background_button_icon_gecko_id")
        public final String backgroundButtonIconGeckoId;

        @C09CT("background_image_list")
        public final List<BackgroundModel> backgroundImageList;

        @C09CT("bubble")
        public final BubbleStruct bubble;

        @C09CT("end_time_in_millisecond")
        public final long endTimeInMillisecond;

        @C09CT("gradient_colors")
        public final List<Integer> gradientColors;

        @C09CT("guidance")
        public final GuidanceStruct guidance;

        @C09CT("holiday_name")
        public final String holidayName;

        @C09CT("holiday_type")
        public final int holidayType;

        @C09CT("keywords")
        public final List<String> keyWords;

        @C09CT("start_time_in_millisecond")
        public final long startTimeInMillisecond;

        public static final class BubbleStruct implements Serializable {
            public static final int $stable = 0;

            @C09CT("background_color")
            public final int backgroundColor;

            public BubbleStruct(int i) {
                this.backgroundColor = i;
            }
        }

        public final String getImmersiveViewGuidanceText(boolean z) {
            GuidanceStruct guidanceStruct = this.guidance;
            if (guidanceStruct != null) {
                if (z) {
                    return guidanceStruct.immersiveViewGuidanceText;
                }
                return guidanceStruct.skylightGuidanceText;
            }
            return null;
        }

        public static final class GuidanceStruct implements Serializable {
            public static final int $stable = 0;

            @C09CT("immersive_view_guidance_text")
            public final String immersiveViewGuidanceText;

            @C09CT("skylight_guidance_text")
            public final String skylightGuidanceText;

            public GuidanceStruct() {
                this(null, null);
            }

            public GuidanceStruct(String str, String str2) {
                this.immersiveViewGuidanceText = str;
                this.skylightGuidanceText = str2;
            }
        }

        public StoryThoughtHolidayConfig(int i, String str, long j, long j2, List<String> list, String str2, List<BackgroundModel> list2, List<Integer> list3, BubbleStruct bubbleStruct, GuidanceStruct guidanceStruct) {
            this.holidayType = i;
            this.holidayName = str;
            this.startTimeInMillisecond = j;
            this.endTimeInMillisecond = j2;
            this.keyWords = list;
            this.backgroundButtonIconGeckoId = str2;
            this.backgroundImageList = list2;
            this.gradientColors = list3;
            this.bubble = bubbleStruct;
            this.guidance = guidanceStruct;
        }
    }
}
