package com.ss.android.ugc.aweme.texttoimage;

import X.C09CT;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes9.dex */
public final class Text2ImageShowInfo {
    public transient String LIZ;

    @C09CT("ai_name")
    public String aiName;

    @C09CT("ai_task_id")
    public String aiTaskId;

    @C09CT("cover_url")
    public String coverUrl;

    @C09CT("image_url")
    public final String placeholderUrl;

    @C09CT("template_id")
    public final Long templateId;

    @C09CT("type")
    public String type;

    public Text2ImageShowInfo(String str, String str2, String str3, String str4, Long l, String str5, String str6) {
        this.type = str;
        this.placeholderUrl = str2;
        this.coverUrl = str3;
        this.aiTaskId = str4;
        this.templateId = l;
        this.aiName = str5;
        this.LIZ = str6;
    }

    public /* synthetic */ Text2ImageShowInfo(String str, String str2, String str3, String str4, Long l, String str5, String str6, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, str4, l, str5, (i & 64) != 0 ? null : str6);
    }
}
