package com.ss.android.ugc.aweme.feed.controller.experiment;

import X.C09CT;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public final class MobRefactorSupportScene {

    @C09CT("play_time_unable_correct")
    public final boolean playTimeUnableCorrect;

    @C09CT("video_play_finish_support_scene")
    public final List<String> videoPlayFinishScene;

    @C09CT("video_play_finish_unable_correct")
    public final boolean videoPlayFinishUnableCorrect;

    @C09CT("video_play_support_scene")
    public final List<String> videoPlayScene;

    @C09CT("play_time_support_scene")
    public final List<String> videoPlayTimeScene;

    @C09CT("video_play_unable_correct")
    public final boolean videoPlayUnableCorrect;

    public MobRefactorSupportScene(List<String> list, boolean z, List<String> list2, boolean z2, List<String> list3, boolean z3) {
        this.videoPlayScene = list;
        this.videoPlayUnableCorrect = z;
        this.videoPlayTimeScene = list2;
        this.playTimeUnableCorrect = z2;
        this.videoPlayFinishScene = list3;
        this.videoPlayFinishUnableCorrect = z3;
    }
}
