package com.ss.android.ugc.gamora.editor.audio.tts.base.model;

import X.C09CT;
import X.C0MY0;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes30.dex */
public final class TTSAudioParam {

    @C09CT("audio_path_list")
    @C0MY0
    public List<String> audioPathList;

    @C09CT("old_text")
    public String audioText;

    @C09CT("audio_track_duration")
    public int audioTrackDuration;

    @C09CT("audio_track_file_path")
    public String audioTrackFilePath;

    @C09CT("audio_track_index")
    public int audioTrackIndex;

    @C09CT("mEndTime")
    public int endTime;

    @C09CT("has_read_text_audio")
    public boolean hasReadTextAudio;

    @C09CT("nle_uuid")
    public String nleUuid;

    @C09CT("speaker_id")
    public String speakerID;

    @C09CT("mStartTime")
    public int startTime;

    @C09CT("tts_anchor_release_date")
    public long ttsAnchorReleaseDate;

    @C09CT("tts_hash_tag_ids")
    public List<String> ttsHashTagIds;

    @C09CT("voice_anchor_name")
    public String voiceAnchorName;

    @C09CT("voice_effect_id")
    public String voiceEffectId;

    public TTSAudioParam() {
        this(0, 0, 0, -1, null, "", false, new ArrayList(), null, null, null, 0L, null, new ArrayList());
    }

    public TTSAudioParam(int i, int i2, int i3, int i4, String str, String str2, boolean z, List<String> list, String str3, String str4, String str5, long j, String str6, List<String> list2) {
        this.startTime = i;
        this.endTime = i2;
        this.audioTrackDuration = i3;
        this.audioTrackIndex = i4;
        this.audioTrackFilePath = str;
        this.nleUuid = str2;
        this.hasReadTextAudio = z;
        this.audioPathList = list;
        this.audioText = str3;
        this.voiceAnchorName = str4;
        this.voiceEffectId = str5;
        this.ttsAnchorReleaseDate = j;
        this.speakerID = str6;
        this.ttsHashTagIds = list2;
    }
}
