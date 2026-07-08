package com.bytedance.android.livesdk.model.message;

import X.AbstractC1136060ffY;
import X.C001A;
import X.C09CT;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class CaptionMessage extends AbstractC1136060ffY {

    @C09CT("content")
    public List<CaptionContent> content;

    @C09CT("definite")
    public boolean definite;

    @C09CT("duration_ms")
    public long durationMs;

    @C09CT("sentence_id")
    public long sentenceId;

    @C09CT("sequence_id")
    public long sequenceId;

    @C09CT("timestamp_ms")
    public long timestampMs;

    public CaptionMessage() {
        this.type = C001A.CAPTION_MESSAGE;
    }
}
