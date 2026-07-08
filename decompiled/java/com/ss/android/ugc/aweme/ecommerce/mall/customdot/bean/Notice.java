package com.ss.android.ugc.aweme.ecommerce.mall.customdot.bean;

import X.C09CT;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;

/* JADX INFO: loaded from: classes.dex */
public final class Notice {

    @C09CT("content")
    public String content;

    @C09CT("create_time")
    public String createTime;

    @C09CT(FollowStatusChangeMethod.PARAM_UID)
    public String id;

    @C09CT("middle_image_url")
    public String middleImageUrl;

    @C09CT("schema_url")
    public String schemaUrl;

    @C09CT("template_id")
    public String templateId;

    @C09CT("title")
    public String title;

    @C09CT("type")
    public final int type;

    public Notice(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        this.type = i;
        this.id = str;
        this.title = str2;
        this.content = str3;
        this.schemaUrl = str4;
        this.middleImageUrl = str5;
        this.createTime = str6;
        this.templateId = str7;
    }
}
