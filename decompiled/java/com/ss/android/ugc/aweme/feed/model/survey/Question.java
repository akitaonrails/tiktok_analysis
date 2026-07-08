package com.ss.android.ugc.aweme.feed.model.survey;

import X.C09CT;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.io.Serializable;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class Question implements Serializable {

    @C09CT(FollowStatusChangeMethod.PARAM_UID)
    public String id;

    @C09CT("options")
    public Option[] options;

    @C09CT("subtitle")
    public String subtitle;

    @C09CT("title")
    public String title;

    @C09CT("type")
    public int type;

    public Question() {
        this("", 0, "", "", null);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Question(id=");
        sbLIZ.append(this.id);
        sbLIZ.append(", type=");
        sbLIZ.append(this.type);
        sbLIZ.append(", title=");
        sbLIZ.append(this.title);
        sbLIZ.append(", subtitle=");
        sbLIZ.append(this.subtitle);
        sbLIZ.append(", options=");
        sbLIZ.append(Arrays.toString(this.options));
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final void setId(String str) {
        this.id = str;
    }

    public final void setOptions(Option[] optionArr) {
        this.options = optionArr;
    }

    public final void setSubtitle(String str) {
        this.subtitle = str;
    }

    public final void setTitle(String str) {
        this.title = str;
    }

    public final void setType(int i) {
        this.type = i;
    }

    public Question(String str, int i, String str2, String str3, Option[] optionArr) {
        this.id = str;
        this.type = i;
        this.title = str2;
        this.subtitle = str3;
        this.options = optionArr;
    }
}
