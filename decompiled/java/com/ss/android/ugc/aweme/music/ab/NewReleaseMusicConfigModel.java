package com.ss.android.ugc.aweme.music.ab;

import X.C09CT;

/* JADX INFO: loaded from: classes10.dex */
public final class NewReleaseMusicConfigModel {

    @C09CT("feed_music_title_new_tag_show_times_per_day")
    public final int feedMusicTitleShowTimes;

    @C09CT("feed_record_expand_animation_show_times_per_day")
    public final int feedRecordAnimationShowTimes;

    @C09CT("feed_record_expand_animation_start_time")
    public final int feedRecordAnimationStartTimes;

    public NewReleaseMusicConfigModel() {
        this(0, 0, 0);
    }

    public NewReleaseMusicConfigModel(int i, int i2, int i3) {
        this.feedMusicTitleShowTimes = i;
        this.feedRecordAnimationShowTimes = i2;
        this.feedRecordAnimationStartTimes = i3;
    }
}
