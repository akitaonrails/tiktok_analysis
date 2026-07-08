package com.bytedance.ies.ugc.aweme.rich.model.feed.model;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes24.dex */
public final class BitrateAudioStruct implements Serializable {

    @C09CT("audio_extra")
    public String audioExtra;

    @C09CT("audio_meta")
    public BitrateMetaStruct audioMeta;

    @C09CT("audio_quality")
    public long audioQuality;

    public final String getAudioExtra() {
        return this.audioExtra;
    }

    public final BitrateMetaStruct getAudioMeta() {
        return this.audioMeta;
    }

    public final long getAudioQuality() {
        return this.audioQuality;
    }

    public final void setAudioExtra(String str) {
        this.audioExtra = str;
    }

    public final void setAudioMeta(BitrateMetaStruct bitrateMetaStruct) {
        this.audioMeta = bitrateMetaStruct;
    }

    public final void setAudioQuality(long j) {
        this.audioQuality = j;
    }
}
