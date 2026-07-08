package com.ss.android.ugc.aweme.compliance.api.model;

import X.C09CT;

/* JADX INFO: loaded from: classes19.dex */
public final class MeditationVideo {
    public static final int $stable = 0;

    @C09CT("bg_full_video_box_meditation_end_loop")
    public final String boxMeditationEndLoop;

    @C09CT("bg_full_video_box_meditation")
    public final String boxMeditationFullVideo;

    @C09CT("bg_end_loop_video")
    public final String endLoopVideo;

    @C09CT("bg_full_video_478_meditation_end_loop")
    public final String fourSeventEightMeditationEndLoop;

    @C09CT("bg_full_video_478_meditation")
    public final String fourSeventEightMeditationFullVideo;

    @C09CT("bg_full_video_five_loop")
    public final String fullVideo;

    public MeditationVideo() {
        this("https://sf16-va.tiktokcdn-us.com/obj/eden-va2/ajbkvyw_zuw/ljhwZthlaukjlkulzlp/final_5_loops_long_intro.mp4", "https://sf16-va.tiktokcdn-us.com/obj/eden-va2/ajbkvyw_zuw/ljhwZthlaukjlkulzlp/Meditation%20part03.mp4", "https://sf16-va.tiktokcdn-us.com/obj/eden-va2/ajbkvyw_zuw/ljhwZthlaukjlkulzlp/wellbeing/breathing_exercise/box_full_loop.mp4", "https://sf16-va.tiktokcdn-us.com/obj/eden-va2/ajbkvyw_zuw/ljhwZthlaukjlkulzlp/Meditation%20part03.mp4", "https://sf16-va.tiktokcdn-us.com/obj/eden-va2/ajbkvyw_zuw/ljhwZthlaukjlkulzlp/wellbeing/breathing_exercise/478_full_loop.mp4", "https://sf16-va.tiktokcdn-us.com/obj/eden-va2/ajbkvyw_zuw/ljhwZthlaukjlkulzlp/Meditation%20part03.mp4");
    }

    public MeditationVideo(String str, String str2, String str3, String str4, String str5, String str6) {
        this.fullVideo = str;
        this.endLoopVideo = str2;
        this.boxMeditationFullVideo = str3;
        this.boxMeditationEndLoop = str4;
        this.fourSeventEightMeditationFullVideo = str5;
        this.fourSeventEightMeditationEndLoop = str6;
    }
}
