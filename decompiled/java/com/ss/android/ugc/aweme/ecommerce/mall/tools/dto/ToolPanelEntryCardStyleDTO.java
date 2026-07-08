package com.ss.android.ugc.aweme.ecommerce.mall.tools.dto;

import X.C09CT;

/* JADX INFO: loaded from: classes27.dex */
public final class ToolPanelEntryCardStyleDTO {

    @C09CT("button_name")
    public String buttonName;

    @C09CT("color")
    public String color;

    @C09CT("icon")
    public ToolPanelEntryIconDTO icon;

    @C09CT("is_dark_mode")
    public Boolean isDarkMode;

    @C09CT("link")
    public ToolPanelEntryLinkDTO link;

    @C09CT("link_title")
    public ToolPanelEntryTitleDTO linkTitle;

    @C09CT("title")
    public ToolPanelEntryTitleDTO title;

    public ToolPanelEntryCardStyleDTO() {
        this(null, null, null, null, null, null, null);
    }

    public ToolPanelEntryCardStyleDTO(String str, ToolPanelEntryIconDTO toolPanelEntryIconDTO, ToolPanelEntryLinkDTO toolPanelEntryLinkDTO, ToolPanelEntryTitleDTO toolPanelEntryTitleDTO, ToolPanelEntryTitleDTO toolPanelEntryTitleDTO2, String str2, Boolean bool) {
        this.buttonName = str;
        this.icon = toolPanelEntryIconDTO;
        this.link = toolPanelEntryLinkDTO;
        this.linkTitle = toolPanelEntryTitleDTO;
        this.title = toolPanelEntryTitleDTO2;
        this.color = str2;
        this.isDarkMode = bool;
    }
}
