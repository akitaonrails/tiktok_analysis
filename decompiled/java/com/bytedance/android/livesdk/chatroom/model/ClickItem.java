package com.bytedance.android.livesdk.chatroom.model;

import X.C09CT;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class ClickItem {

    @C09CT("type")
    public String type = "";

    @C09CT("value")
    public String value = "";

    @C09CT("condition")
    public String condition = "";

    @C09CT("params")
    public List<ClickParam> params = new ArrayList();
}
