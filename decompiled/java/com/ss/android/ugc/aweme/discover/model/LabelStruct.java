package com.ss.android.ugc.aweme.discover.model;

import X.C09CT;

/* JADX INFO: loaded from: classes11.dex */
public final class LabelStruct {

    @C09CT("attach_card_source")
    public int attachCardSource;

    @C09CT("label_id")
    public String labelId = "";

    @C09CT("label_text")
    public String labelText = "";

    @C09CT("jump_query")
    public String jumpQuery = "";

    @C09CT("attach_card_key")
    public String attachCardKey = "";

    public final String getAttachCardKey() {
        return this.attachCardKey;
    }

    public final int getAttachCardSource() {
        return this.attachCardSource;
    }

    public final String getJumpQuery() {
        return this.jumpQuery;
    }

    public final String getLabelId() {
        return this.labelId;
    }

    public final String getLabelText() {
        return this.labelText;
    }

    public final void setAttachCardKey(String str) {
        this.attachCardKey = str;
    }

    public final void setAttachCardSource(int i) {
        this.attachCardSource = i;
    }

    public final void setJumpQuery(String str) {
        this.jumpQuery = str;
    }

    public final void setLabelId(String str) {
        this.labelId = str;
    }

    public final void setLabelText(String str) {
        this.labelText = str;
    }
}
