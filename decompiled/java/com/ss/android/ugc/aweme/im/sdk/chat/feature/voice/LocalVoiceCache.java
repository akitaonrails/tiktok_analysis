package com.ss.android.ugc.aweme.im.sdk.chat.feature.voice;

import X.C09CT;
import com.ss.android.ugc.aweme.transcript.IMVoiceTranscribeModel;

/* JADX INFO: loaded from: classes15.dex */
public final class LocalVoiceCache {
    public static final LocalVoiceCache LIZ = new LocalVoiceCache(false, false, false, new IMVoiceTranscribeModel(null, null, 3, null));

    @C09CT("has_interacted")
    public final boolean hasInteracted;

    @C09CT("transcript_model")
    public final IMVoiceTranscribeModel serverModel;

    @C09CT("show_transcript")
    public final boolean showTranscript;

    @C09CT("transcribed")
    public final boolean transcribed;

    public LocalVoiceCache() {
        this(false, false, false, new IMVoiceTranscribeModel(null, null, 3, null));
    }

    public LocalVoiceCache(boolean z, boolean z2, boolean z3, IMVoiceTranscribeModel iMVoiceTranscribeModel) {
        this.hasInteracted = z;
        this.showTranscript = z2;
        this.transcribed = z3;
        this.serverModel = iMVoiceTranscribeModel;
    }

    public static LocalVoiceCache LIZ(LocalVoiceCache localVoiceCache, boolean z, boolean z2, boolean z3, IMVoiceTranscribeModel iMVoiceTranscribeModel, int i) {
        if ((i & 1) != 0) {
            z = localVoiceCache.hasInteracted;
        }
        if ((i & 2) != 0) {
            z2 = localVoiceCache.showTranscript;
        }
        if ((i & 4) != 0) {
            z3 = localVoiceCache.transcribed;
        }
        if ((i & 8) != 0) {
            iMVoiceTranscribeModel = localVoiceCache.serverModel;
        }
        localVoiceCache.getClass();
        return new LocalVoiceCache(z, z2, z3, iMVoiceTranscribeModel);
    }
}
