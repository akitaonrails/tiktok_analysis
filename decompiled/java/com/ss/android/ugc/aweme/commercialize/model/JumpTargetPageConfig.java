package com.ss.android.ugc.aweme.commercialize.model;

import X.C09CS;
import X.C09CT;
import com.ss.android.ugc.aweme.utils.JsonToStringAdapter;
import java.io.Serializable;

/* JADX INFO: loaded from: classes17.dex */
public final class JumpTargetPageConfig implements Serializable {

    @C09CT("click_position")
    @C09CS(JsonToStringAdapter.class)
    public final String clickPosition;

    public final String getClickPosition() {
        return this.clickPosition;
    }
}
