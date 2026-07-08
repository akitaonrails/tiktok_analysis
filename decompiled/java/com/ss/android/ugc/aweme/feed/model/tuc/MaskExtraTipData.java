package com.ss.android.ugc.aweme.feed.model.tuc;

import X.C09CT;
import com.ss.android.ugc.tiktok.tuc.model.TUCIconData;
import java.io.Serializable;

/* JADX INFO: loaded from: classes29.dex */
public final class MaskExtraTipData implements Serializable {

    @C09CT("icon")
    public final TUCIconData icon;

    @C09CT("text")
    public final String text;

    public MaskExtraTipData() {
        this(null, null);
    }

    public MaskExtraTipData(TUCIconData tUCIconData, String str) {
        this.icon = tUCIconData;
        this.text = str;
    }
}
