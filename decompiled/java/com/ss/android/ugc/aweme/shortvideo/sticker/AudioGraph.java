package com.ss.android.ugc.aweme.shortvideo.sticker;

import X.C09CT;
import X.C13LQ;
import java.io.Serializable;

/* JADX INFO: loaded from: classes26.dex */
public final class AudioGraph implements Serializable {

    @C09CT("sources")
    public final String[] sources;

    @C09CT("use_output")
    public final Boolean useOutput;

    public AudioGraph() {
        this(null, null);
    }

    public final boolean enableMic() {
        String[] strArr = this.sources;
        return strArr != null && C13LQ.LJJIJIIJI("mic", strArr) >= 0;
    }

    public final boolean enableMusic() {
        String[] strArr = this.sources;
        return strArr != null && C13LQ.LJJIJIIJI("music", strArr) >= 0;
    }

    public AudioGraph(String[] strArr, Boolean bool) {
        this.sources = strArr;
        this.useOutput = bool;
    }
}
