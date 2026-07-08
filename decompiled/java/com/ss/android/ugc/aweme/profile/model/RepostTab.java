package com.ss.android.ugc.aweme.profile.model;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes20.dex */
public final class RepostTab implements Serializable {

    @C09CT("repost_tab_all_visible")
    public boolean repostShowForPublic;

    @C09CT("show_repost_tab_other")
    public int showRepostOther;

    @C09CT("show_repost_tab_self")
    public int showRepostSelf;

    public RepostTab() {
        this(0, 0, false);
    }

    public final boolean getRepostShowForPublic() {
        return this.repostShowForPublic;
    }

    public final int getShowRepostOther() {
        return this.showRepostOther;
    }

    public final int getShowRepostSelf() {
        return this.showRepostSelf;
    }

    public final void setRepostShowForPublic(boolean z) {
        this.repostShowForPublic = z;
    }

    public final void setShowRepostOther(int i) {
        this.showRepostOther = i;
    }

    public final void setShowRepostSelf(int i) {
        this.showRepostSelf = i;
    }

    public RepostTab(int i, int i2, boolean z) {
        this.showRepostSelf = i;
        this.showRepostOther = i2;
        this.repostShowForPublic = z;
    }
}
