package com.bytedance.android.livesdk.model;

import X.C09CT;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class BoardItemTemplate {

    @C09CT("template_char_limit")
    public int templateCharLimit;

    @C09CT("template_id")
    public long templateId;

    @C09CT("template_keyboard_type")
    public int templateKeyboardType;

    @C09CT("template_content")
    public String templateContent = "";

    @C09CT("template_starling_key")
    public String templateStarlingKey = "";

    @C09CT("template_hint_content")
    public String templateHintContent = "";

    @C09CT("template_hint_starling_key")
    public String templateHintStarlingKey = "";

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof BoardItemTemplate) || this.templateId != ((BoardItemTemplate) obj).templateId) {
            return false;
        }
        String str = this.templateContent;
        if (!Intrinsics.LJFF(str, str)) {
            return false;
        }
        return true;
    }
}
