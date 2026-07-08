package com.ss.android.ugc.aweme.ab;

import X.C09CT;

/* JADX INFO: loaded from: classes13.dex */
public final class LiveAiSummaryTypewriterAnimConfig {

    @C09CT("has_typewriter_anim")
    public final boolean hasTypewriterAnim;

    @C09CT("typewriter_anim_max_speed")
    public final long typewriterAnimMaxSpeed;

    @C09CT("typewriter_anim_min_speed")
    public final long typewriterAnimMinSpeed;

    public LiveAiSummaryTypewriterAnimConfig() {
        this(true, 40L, 70L);
    }

    public LiveAiSummaryTypewriterAnimConfig(boolean z, long j, long j2) {
        this.hasTypewriterAnim = z;
        this.typewriterAnimMaxSpeed = j;
        this.typewriterAnimMinSpeed = j2;
    }
}
