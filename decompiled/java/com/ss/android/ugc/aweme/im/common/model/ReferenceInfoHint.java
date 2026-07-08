package com.ss.android.ugc.aweme.im.common.model;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes7.dex */
public final class ReferenceInfoHint implements Serializable {

    @C09CT("content")
    public final String content;

    @C09CT("refmsg_template_quote")
    public final String refMsg_template_quote;

    @C09CT("refmsg_content")
    public final String refmsg_content;

    @C09CT("refmsg_light_interaction_name")
    public final String refmsg_light_interaction_name;

    @C09CT("refmsg_sec_uid")
    public final String refmsg_sec_uid;

    @C09CT("refmsg_sub_type")
    public final String refmsg_sub_type;

    @C09CT("refmsg_type")
    public final int refmsg_type;

    @C09CT("refmsg_uid")
    public final String refmsg_uid;

    public ReferenceInfoHint() {
        this("", "", "", -1, null, "", "", null);
    }

    public final String getContent() {
        return this.content;
    }

    public final String getRefMsg_template_quote() {
        return this.refMsg_template_quote;
    }

    public final String getRefmsg_content() {
        return this.refmsg_content;
    }

    public final String getRefmsg_light_interaction_name() {
        return this.refmsg_light_interaction_name;
    }

    public final String getRefmsg_sec_uid() {
        return this.refmsg_sec_uid;
    }

    public final String getRefmsg_sub_type() {
        return this.refmsg_sub_type;
    }

    public final int getRefmsg_type() {
        return this.refmsg_type;
    }

    public final String getRefmsg_uid() {
        return this.refmsg_uid;
    }

    public ReferenceInfoHint(String str, String str2, String str3, int i, String str4, String str5, String str6, String str7) {
        this.content = str;
        this.refmsg_uid = str2;
        this.refmsg_sec_uid = str3;
        this.refmsg_type = i;
        this.refmsg_sub_type = str4;
        this.refmsg_content = str5;
        this.refMsg_template_quote = str6;
        this.refmsg_light_interaction_name = str7;
    }
}
