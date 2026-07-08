package com.ss.android.ugc.aweme.emoji.common.sysemoji;

import X.C09CT;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public class Emoji implements Serializable {

    @C09CT("business")
    public int business;

    @C09CT("emoji")
    public List<String> emoji;

    @C09CT("ios")
    public String ios = "";

    @C09CT("and")
    public String and = "";

    public final String getAnd() {
        return this.and;
    }

    public final int getBusiness() {
        return this.business;
    }

    public final List<String> getEmoji() {
        return this.emoji;
    }

    public final String getIos() {
        return this.ios;
    }

    public final void setAnd(String str) {
        this.and = str;
    }

    public final void setBusiness(int i) {
        this.business = i;
    }

    public final void setEmoji(List<String> list) {
        this.emoji = list;
    }

    public final void setIos(String str) {
        this.ios = str;
    }
}
