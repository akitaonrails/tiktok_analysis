package com.ss.android.ugc.aweme.socialgame.api.experiment;

import X.C09CT;

/* JADX INFO: loaded from: classes3.dex */
public final class EmojiGameMatchStruct {

    @C09CT("text")
    public final String text;

    @C09CT("type")
    public final Integer type;

    public EmojiGameMatchStruct() {
        this(null, null);
    }

    public EmojiGameMatchStruct(String str, Integer num) {
        this.text = str;
        this.type = num;
    }
}
