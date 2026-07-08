package com.ss.android.ugc.aweme.profile.model;

import X.C09CT;
import com.ss.android.ugc.aweme.feed.model.TextWithInlineLink;
import java.io.Serializable;

/* JADX INFO: loaded from: classes29.dex */
public final class AGSWarningPopupWindow implements Serializable {

    @C09CT("button")
    public final AGSWarningPopupButton button;

    @C09CT("pop_content")
    public final TextWithInlineLink content;

    @C09CT("pop_title")
    public final String title;

    public AGSWarningPopupWindow() {
        this("", null, null);
    }

    public AGSWarningPopupWindow(String str, TextWithInlineLink textWithInlineLink, AGSWarningPopupButton aGSWarningPopupButton) {
        this.title = str;
        this.content = textWithInlineLink;
        this.button = aGSWarningPopupButton;
    }
}
