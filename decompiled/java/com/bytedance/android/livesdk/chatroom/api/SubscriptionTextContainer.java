package com.bytedance.android.livesdk.chatroom.api;

import X.C09CT;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class SubscriptionTextContainer {

    @C09CT("font_style")
    public int fontStyle;

    @C09CT("text")
    public String text = "";

    @C09CT("placeholder_params")
    public List<SubscriptionTextContainer> placeholderParams = new ArrayList();
}
