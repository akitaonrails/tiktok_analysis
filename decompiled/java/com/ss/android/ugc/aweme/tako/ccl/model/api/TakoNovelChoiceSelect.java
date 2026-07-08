package com.ss.android.ugc.aweme.tako.ccl.model.api;

import X.C09CT;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;

/* JADX INFO: loaded from: classes28.dex */
public final class TakoNovelChoiceSelect {

    @C09CT(FollowStatusChangeMethod.PARAM_UID)
    public final String id;

    @C09CT("is_selected")
    public int isSelected;

    @C09CT("rank")
    public final int rank;

    @C09CT("text")
    public final String text;

    public TakoNovelChoiceSelect() {
        this(0, "", "", 0);
    }

    public TakoNovelChoiceSelect(int i, String str, String str2, int i2) {
        this.rank = i;
        this.text = str;
        this.id = str2;
        this.isSelected = i2;
    }
}
