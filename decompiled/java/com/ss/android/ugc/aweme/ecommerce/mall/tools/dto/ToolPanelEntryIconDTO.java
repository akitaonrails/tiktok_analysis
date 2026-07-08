package com.ss.android.ugc.aweme.ecommerce.mall.tools.dto;

import X.C09CT;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class ToolPanelEntryIconDTO {

    @C09CT("height")
    public Integer height;

    @C09CT("url_list")
    public List<String> urlList;

    @C09CT("width")
    public Integer width;

    public ToolPanelEntryIconDTO() {
        this(null, null, null);
    }

    public ToolPanelEntryIconDTO(List<String> list, Integer num, Integer num2) {
        this.urlList = list;
        this.width = num;
        this.height = num2;
    }
}
