package com.ss.android.ugc.aweme.component.searchcomponent;

import X.C09CT;
import com.ss.android.ugc.aweme.commercialize.router.api.model.CRouterCoreModel;
import java.io.Serializable;

/* JADX INFO: loaded from: classes17.dex */
public final class SearchOpenLoopAnchorComponentModel implements Serializable {
    public static final int $stable = 8;

    @C09CT("has_arrow")
    public final boolean hasArrow;

    @C09CT("has_bg")
    public final boolean hasBg;

    @C09CT("jump_data")
    public final CRouterCoreModel jumpData;

    @C09CT("text")
    public final String text;

    @C09CT("type")
    public final String type;

    public SearchOpenLoopAnchorComponentModel() {
        this("web", "", false, true, null);
    }

    public final boolean getHasArrow() {
        return this.hasArrow;
    }

    public final boolean getHasBg() {
        return this.hasBg;
    }

    public final CRouterCoreModel getJumpData() {
        return this.jumpData;
    }

    public final String getText() {
        return this.text;
    }

    public final String getType() {
        return this.type;
    }

    public SearchOpenLoopAnchorComponentModel(String str, String str2, boolean z, boolean z2, CRouterCoreModel cRouterCoreModel) {
        this.type = str;
        this.text = str2;
        this.hasBg = z;
        this.hasArrow = z2;
        this.jumpData = cRouterCoreModel;
    }
}
