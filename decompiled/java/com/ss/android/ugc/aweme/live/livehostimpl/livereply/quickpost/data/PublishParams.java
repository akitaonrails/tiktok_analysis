package com.ss.android.ugc.aweme.live.livehostimpl.livereply.quickpost.data;

import X.C1444390ngr;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes23.dex */
public final class PublishParams implements Serializable {
    public static final int $stable = 8;
    public final List<String> challenges;
    public final String defaultText;
    public final String musicId;
    public final List<C1444390ngr> userTags;

    public PublishParams() {
        this("", new ArrayList(), new ArrayList(), "");
    }

    public PublishParams(String str, List<String> list, List<C1444390ngr> list2, String str2) {
        this.defaultText = str;
        this.challenges = list;
        this.userTags = list2;
        this.musicId = str2;
    }
}
