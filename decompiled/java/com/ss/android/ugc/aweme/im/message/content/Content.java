package com.ss.android.ugc.aweme.im.message.content;

import X.C09CT;
import java.util.List;

/* JADX INFO: loaded from: classes15.dex */
public final class Content {

    @C09CT("parser")
    public final Parser parser;

    @C09CT("template")
    public final List<Template> template;

    @C09CT("tips")
    public final String tips;

    public Content(String str, List<Template> list, Parser parser) {
        this.tips = str;
        this.template = list;
        this.parser = parser;
    }
}
