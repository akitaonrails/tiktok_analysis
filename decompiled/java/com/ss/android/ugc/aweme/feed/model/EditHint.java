package com.ss.android.ugc.aweme.feed.model;

import X.C09CT;
import X.C2188811AlT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public class EditHint implements Serializable {

    @C09CT("hint")
    public String hint;

    @C09CT("language")
    public String language;

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("EditHint{language='");
        sbLIZ.append(this.language);
        sbLIZ.append('\'');
        sbLIZ.append(", hint='");
        sbLIZ.append(this.hint);
        sbLIZ.append('\'');
        sbLIZ.append('}');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public String getHint() {
        return this.hint;
    }

    public String getLanguage() {
        return this.language;
    }

    public void setHint(String str) {
        this.hint = str;
    }

    public void setLanguage(String str) {
        this.language = str;
    }
}
