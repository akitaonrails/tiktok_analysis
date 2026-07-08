package com.bytedance.android.livesdk.model;

import X.C09CT;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class RichTextContent {

    @C09CT("styles")
    public List<RichTextStyle> styles = new ArrayList();

    @C09CT("paragraphs")
    public List<Paragraph> paragraphs = new ArrayList();

    @C09CT("item_style_ref")
    public String itemStyleRef = "";
}
