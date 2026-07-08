package com.ss.android.ugc.aweme.notice.repo.list.bean;

import X.C09CT;
import X.C13BV;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes4.dex */
public final class CommentSuggestInfo implements Serializable {

    @C09CT("visible_text")
    public final String buttonText;

    @C09CT("smart_reply")
    public final String keyboardInitContent;

    @C09CT("other_replies")
    public final List<String> keyboardQuickReplyText;

    @C09CT("type")
    public final int type;

    public CommentSuggestInfo() {
        this(0, null, null, null, 15, null);
    }

    public CommentSuggestInfo(int i, String str, String str2, List<String> list) {
        this.type = i;
        this.buttonText = str;
        this.keyboardInitContent = str2;
        this.keyboardQuickReplyText = list;
    }

    public CommentSuggestInfo(int i, String str, String str2, List list, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i, (i2 & 2) != 0 ? "" : str, (i2 & 4) != 0 ? "" : str2, (i2 & 8) != 0 ? C13BV.INSTANCE : list);
    }
}
