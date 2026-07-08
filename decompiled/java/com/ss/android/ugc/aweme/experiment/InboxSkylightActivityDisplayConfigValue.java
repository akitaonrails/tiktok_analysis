package com.ss.android.ugc.aweme.experiment;

import X.C09CT;

/* JADX INFO: loaded from: classes5.dex */
public final class InboxSkylightActivityDisplayConfigValue {

    @C09CT("display_policy")
    public final int display_policy;

    @C09CT("show_when_content_below")
    public final int show_when_content_below;

    public InboxSkylightActivityDisplayConfigValue() {
        this(0, 3);
    }

    public InboxSkylightActivityDisplayConfigValue(int i, int i2) {
        this.display_policy = i;
        this.show_when_content_below = i2;
    }
}
