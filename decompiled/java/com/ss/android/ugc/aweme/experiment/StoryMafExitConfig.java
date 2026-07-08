package com.ss.android.ugc.aweme.experiment;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes25.dex */
public final class StoryMafExitConfig implements Serializable {

    @C09CT("enable")
    public final boolean enable;

    @C09CT("long_term")
    public final MafExitTermConfig longTerm;

    @C09CT("short_term")
    public final MafExitTermConfig shortTerm;

    public StoryMafExitConfig() {
        this(false, new MafExitTermConfig(0, 0, 0), new MafExitTermConfig(0, 0, 0));
    }

    public StoryMafExitConfig(boolean z, MafExitTermConfig mafExitTermConfig, MafExitTermConfig mafExitTermConfig2) {
        this.enable = z;
        this.shortTerm = mafExitTermConfig;
        this.longTerm = mafExitTermConfig2;
    }
}
