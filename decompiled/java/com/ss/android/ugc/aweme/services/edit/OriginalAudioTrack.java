package com.ss.android.ugc.aweme.services.edit;

import X.C09CT;

/* JADX INFO: loaded from: classes29.dex */
public final class OriginalAudioTrack {

    @C09CT("edit_type")
    public final Integer editType;

    @C09CT("existing_original_audio_track_vid")
    public final String existingOriginalAudioTrackVid;

    @C09CT("is_keep_existing_original_audio_track")
    public final Boolean isKeepExistingOriginalAudioTrack;

    @C09CT("new_original_audio_track_vid")
    public final String newOriginalAudioTrackVid;

    @C09CT("volume")
    public final int volume;

    public final Boolean isKeepExistingOriginalAudioTrack() {
        return this.isKeepExistingOriginalAudioTrack;
    }

    public OriginalAudioTrack(int i, Boolean bool, String str, String str2, Integer num) {
        this.volume = i;
        this.isKeepExistingOriginalAudioTrack = bool;
        this.existingOriginalAudioTrackVid = str;
        this.newOriginalAudioTrackVid = str2;
        this.editType = num;
    }
}
