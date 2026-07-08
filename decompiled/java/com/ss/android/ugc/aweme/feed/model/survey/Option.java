package com.ss.android.ugc.aweme.feed.model.survey;

import X.C09CT;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.feed.model.prompt.LocalPromptOption;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class Option implements Serializable {
    public String additional_content;

    @C09CT("extra")
    public String extra;

    @C09CT(FollowStatusChangeMethod.PARAM_UID)
    public int id;

    @C09CT("images")
    public Map<String, ForceVideo> images;
    public boolean isSelected;
    public LocalPromptOption localPromptOption;

    @C09CT("name")
    public String name;

    @C09CT("questions")
    public Question[] questions;

    @C09CT("toast")
    public String toast;

    @C09CT("type")
    public int type;

    public Option() {
        this(0, "", null, null, 0, "", null, null, "", false);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Option(id=");
        sbLIZ.append(this.id);
        sbLIZ.append(", name=");
        sbLIZ.append(this.name);
        sbLIZ.append(", questions=");
        sbLIZ.append(Arrays.toString(this.questions));
        sbLIZ.append(", toast=");
        sbLIZ.append(this.toast);
        sbLIZ.append(", type=");
        sbLIZ.append(this.type);
        sbLIZ.append(", extra=");
        sbLIZ.append(this.extra);
        sbLIZ.append(", images=");
        sbLIZ.append(this.images);
        sbLIZ.append(", localPromptOption=");
        sbLIZ.append(this.localPromptOption);
        sbLIZ.append(", additional_content=");
        sbLIZ.append(this.additional_content);
        sbLIZ.append(", isSelected=");
        sbLIZ.append(this.isSelected);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final boolean isSelected() {
        return this.isSelected;
    }

    public final void setAdditional_content(String str) {
        this.additional_content = str;
    }

    public final void setExtra(String str) {
        this.extra = str;
    }

    public final void setId(int i) {
        this.id = i;
    }

    public final void setImages(Map<String, ForceVideo> map) {
        this.images = map;
    }

    public final void setLocalPromptOption(LocalPromptOption localPromptOption) {
        this.localPromptOption = localPromptOption;
    }

    public final void setName(String str) {
        this.name = str;
    }

    public final void setQuestions(Question[] questionArr) {
        this.questions = questionArr;
    }

    public final void setSelected(boolean z) {
        this.isSelected = z;
    }

    public final void setType(int i) {
        this.type = i;
    }

    public Option(int i, String str, Question[] questionArr, String str2, int i2, String str3, Map<String, ForceVideo> map, LocalPromptOption localPromptOption, String str4, boolean z) {
        this.id = i;
        this.name = str;
        this.questions = questionArr;
        this.toast = str2;
        this.type = i2;
        this.extra = str3;
        this.images = map;
        this.localPromptOption = localPromptOption;
        this.additional_content = str4;
        this.isSelected = z;
    }
}
