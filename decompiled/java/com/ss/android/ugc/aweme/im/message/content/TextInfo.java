package com.ss.android.ugc.aweme.im.message.content;

import X.C09CT;
import java.util.List;

/* JADX INFO: loaded from: classes15.dex */
public final class TextInfo {

    @C09CT("infos")
    public final List<NamedValue> infos;

    @C09CT("title")
    public final MessageTitle title;

    public TextInfo(MessageTitle messageTitle, List<NamedValue> list) {
        this.title = messageTitle;
        this.infos = list;
    }
}
