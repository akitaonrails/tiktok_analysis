package com.bytedance.pipo.verify.base.model.response;

import X.C09CT;
import java.util.List;

/* JADX INFO: loaded from: classes27.dex */
public final class AlertMsg {

    @C09CT("button")
    public final List<PopupContent> button;

    @C09CT("content")
    public final String content;

    @C09CT("title")
    public final String title;

    public AlertMsg() {
        this(null, null, null);
    }

    public AlertMsg(String str, String str2, List<PopupContent> list) {
        this.title = str;
        this.content = str2;
        this.button = list;
    }
}
