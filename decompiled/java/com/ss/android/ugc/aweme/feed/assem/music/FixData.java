package com.ss.android.ugc.aweme.feed.assem.music;

import X.C09CT;

/* JADX INFO: loaded from: classes10.dex */
public final class FixData {

    @C09CT("fix_rtl_cover_anim")
    public final boolean needFixCoverAnim;

    @C09CT("fix_marquee_anim")
    public final boolean needFixMarqueeAnim;

    public FixData() {
        this(false, false);
    }

    public FixData(boolean z, boolean z2) {
        this.needFixMarqueeAnim = z;
        this.needFixCoverAnim = z2;
    }
}
