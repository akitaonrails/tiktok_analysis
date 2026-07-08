package com.ss.android.ugc.aweme.compliance.business.search.feedback;

import X.C09CT;
import X.C13BV;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes13.dex */
public final class QuestionData implements Serializable {
    public static final int $stable = 8;

    @C09CT("content")
    public final List<QuestionContent> content;

    @C09CT("desc")
    public final String desc;

    @C09CT("hint")
    public final String hint;

    @C09CT(FollowStatusChangeMethod.PARAM_UID)
    public final String id;

    @C09CT("placeholder")
    public final String placeholder;

    @C09CT("required")
    public final boolean required;

    @C09CT("title")
    public final String title;

    @C09CT("type")
    public final int type;

    public QuestionData() {
        this(null, null, null, null, null, null, 0, false, 255, null);
    }

    public QuestionData(String str, String str2, String str3, String str4, List<QuestionContent> list, String str5, int i, boolean z) {
        this.title = str;
        this.desc = str2;
        this.hint = str3;
        this.placeholder = str4;
        this.content = list;
        this.id = str5;
        this.type = i;
        this.required = z;
    }

    public QuestionData(String str, String str2, String str3, String str4, List list, String str5, int i, boolean z, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? "" : str2, (i2 & 4) != 0 ? "" : str3, (i2 & 8) != 0 ? "" : str4, (i2 & 16) != 0 ? C13BV.INSTANCE : list, (i2 & 32) == 0 ? str5 : "", (i2 & 64) != 0 ? 0 : i, (i2 & 128) == 0 ? z : false);
    }
}
