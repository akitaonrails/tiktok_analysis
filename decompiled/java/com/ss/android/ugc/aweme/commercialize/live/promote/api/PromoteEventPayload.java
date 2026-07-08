package com.ss.android.ugc.aweme.commercialize.live.promote.api;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes29.dex */
public final class PromoteEventPayload implements Serializable {

    @C09CT("categories")
    public PromoteEventCategories categories;

    @C09CT("name")
    public String name;

    @C09CT("type")
    public String type;

    public PromoteEventPayload() {
        this("promote_entrance_click", "event", null);
    }

    public final PromoteEventCategories getCategories() {
        return this.categories;
    }

    public final String getName() {
        return this.name;
    }

    public final String getType() {
        return this.type;
    }

    public final void setCategories(PromoteEventCategories promoteEventCategories) {
        this.categories = promoteEventCategories;
    }

    public final void setName(String str) {
        this.name = str;
    }

    public final void setType(String str) {
        this.type = str;
    }

    public PromoteEventPayload(String str, String str2, PromoteEventCategories promoteEventCategories) {
        this.name = str;
        this.type = str2;
        this.categories = promoteEventCategories;
    }
}
