package com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto;

import X.C09CT;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class SaveDisplayInfo {

    @C09CT("save_display_popup_content")
    public List<SaveDisplayInfoContent> content;

    @C09CT("name")
    public String name;

    public SaveDisplayInfo() {
    }

    public final int hashCode() {
        String str = this.name;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        List<SaveDisplayInfoContent> list = this.content;
        return iHashCode + (list != null ? list.hashCode() : 0);
    }

    public SaveDisplayInfo(String str, List<SaveDisplayInfoContent> list) {
        this.name = str;
        this.content = list;
    }
}
