package com.bytedance.android.livesdk.model;

import X.C09CT;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes28.dex */
public final class SMBBoardFontStyle {

    @C09CT("font_resource_id")
    public long fontResourceId;

    @C09CT("font_identifier")
    public String fontIdentifier = "";

    @C09CT("font_display_name")
    public String fontDisplayName = "";

    @C09CT("styles")
    public List<RichTextStyle> styles = new ArrayList();
}
