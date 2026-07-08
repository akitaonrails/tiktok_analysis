package com.ss.android.ugc.gamora.recorder.sticker.templateeffect.effectparser;

import X.C09CT;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class Content {

    @C09CT("content")
    public final Content2 content;

    @C09CT("requirement")
    public final Map<String, Boolean> requirement;

    @C09CT("tag")
    public final String tag;

    @C09CT("version")
    public final String version;

    public Content() {
        this(null, null, null, null);
    }

    public Content(Content2 content2, Map<String, Boolean> map, String str, String str2) {
        this.content = content2;
        this.requirement = map;
        this.tag = str;
        this.version = str2;
    }
}
