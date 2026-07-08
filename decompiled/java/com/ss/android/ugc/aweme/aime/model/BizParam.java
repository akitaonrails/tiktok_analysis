package com.ss.android.ugc.aweme.aime.model;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes10.dex */
public final class BizParam implements Serializable {
    public static final int $stable = 0;

    @C09CT("prompt_visible_editable")
    public final String visibleEditablePrompt;

    public BizParam(String str) {
        this.visibleEditablePrompt = str;
    }
}
