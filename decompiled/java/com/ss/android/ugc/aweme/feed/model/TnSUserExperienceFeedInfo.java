package com.ss.android.ugc.aweme.feed.model;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public final class TnSUserExperienceFeedInfo implements Serializable {

    @C09CT("footnote")
    public FootNoteInfo footNoteInfo;

    public TnSUserExperienceFeedInfo() {
        this(null);
    }

    public TnSUserExperienceFeedInfo(FootNoteInfo footNoteInfo) {
        this.footNoteInfo = footNoteInfo;
    }
}
