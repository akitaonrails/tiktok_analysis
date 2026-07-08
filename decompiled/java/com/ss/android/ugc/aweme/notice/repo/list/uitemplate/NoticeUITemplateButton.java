package com.ss.android.ugc.aweme.notice.repo.list.uitemplate;

import X.C09CT;
import java.util.List;

/* JADX INFO: loaded from: classes28.dex */
public final class NoticeUITemplateButton {

    @C09CT("actions")
    public final List<Integer> actions;

    @C09CT("button_extra")
    public final String buttonExtra;

    @C09CT("content")
    public final String content;

    @C09CT("schema_url")
    public final String schemaUrl;

    @C09CT("type")
    public final Integer type;

    public final int hashCode() {
        String str = this.content;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.type;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        String str2 = this.schemaUrl;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        List<Integer> list = this.actions;
        int iHashCode4 = (iHashCode3 + (list == null ? 0 : list.hashCode())) * 31;
        String str3 = this.buttonExtra;
        return iHashCode4 + (str3 != null ? str3.hashCode() : 0);
    }

    public NoticeUITemplateButton(String str, Integer num, String str2, List<Integer> list, String str3) {
        this.content = str;
        this.type = num;
        this.schemaUrl = str2;
        this.actions = list;
        this.buttonExtra = str3;
    }
}
