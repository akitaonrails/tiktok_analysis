package com.ss.android.ugc.aweme.shortvideo.monitor.music;

/* JADX INFO: loaded from: classes31.dex */
public final class TrackDetails {
    public final String creation_id;
    public final String current_scene;
    public final Float dub_volume;
    public final String enter_from;
    public final Double file_audio_volume;
    public final Float file_size_range;
    public final String is_draft;
    public final String music_clip_check;
    public final Long music_duration;
    public final String music_exit_in_nle;
    public final String music_file_exit;
    public final String music_file_legal_result;
    public final String music_id;
    public final String music_selected_from;
    public final Float music_volume;
    public final Long shoot_duration;
    public final String shoot_way;
    public final Integer system_volume;
    public final String video_id;
    public final Float voice_volume;

    public final String is_draft() {
        return this.is_draft;
    }

    public TrackDetails(String str, String str2, String str3, String str4, String str5, Double d, String str6, Integer num, String str7, Float f, Float f2, String str8, String str9, Float f3, Long l, Long l2, String str10, String str11, Float f4, String str12) {
        this.creation_id = str;
        this.enter_from = str2;
        this.current_scene = str3;
        this.shoot_way = str4;
        this.is_draft = str5;
        this.file_audio_volume = d;
        this.music_file_legal_result = str6;
        this.system_volume = num;
        this.music_id = str7;
        this.music_volume = f;
        this.voice_volume = f2;
        this.music_clip_check = str8;
        this.music_file_exit = str9;
        this.file_size_range = f3;
        this.music_duration = l;
        this.shoot_duration = l2;
        this.music_selected_from = str10;
        this.video_id = str11;
        this.dub_volume = f4;
        this.music_exit_in_nle = str12;
    }
}
