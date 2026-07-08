package com.ss.android.ugc.aweme.search.pages.result.effectlist.core.model;

import X.C09CT;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import java.io.Serializable;

/* JADX INFO: loaded from: classes11.dex */
public final class SearchEffect implements Serializable {
    public static final int $stable = 8;

    @C09CT("doc_id")
    public String docId;

    @C09CT("hint")
    public String hint;

    @C09CT("icon_url")
    public UrlModel iconUrl;

    @C09CT("use_number")
    public int useNumber;

    @C09CT("effect_id")
    public String effectId = "";

    @C09CT("name")
    public String name = "";

    public final String getDocId() {
        return this.docId;
    }

    public final String getEffectId() {
        return this.effectId;
    }

    public final String getHint() {
        return this.hint;
    }

    public final UrlModel getIconUrl() {
        return this.iconUrl;
    }

    public final String getName() {
        return this.name;
    }

    public final int getUseNumber() {
        return this.useNumber;
    }

    public final void setDocId(String str) {
        this.docId = str;
    }

    public final void setEffectId(String str) {
        this.effectId = str;
    }

    public final void setHint(String str) {
        this.hint = str;
    }

    public final void setIconUrl(UrlModel urlModel) {
        this.iconUrl = urlModel;
    }

    public final void setName(String str) {
        this.name = str;
    }

    public final void setUseNumber(int i) {
        this.useNumber = i;
    }
}
