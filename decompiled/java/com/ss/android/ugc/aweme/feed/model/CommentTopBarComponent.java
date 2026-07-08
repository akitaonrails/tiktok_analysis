package com.ss.android.ugc.aweme.feed.model;

import X.C09CT;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class CommentTopBarComponent implements Serializable {

    @C09CT("action")
    public CommentTopBarAction action;

    @C09CT("biz_id")
    public String bizId;

    @C09CT("biz_type")
    public Integer bizType;

    @C09CT("container")
    public CommentTopBarContainer container;

    @C09CT("desc_prefix")
    public CommentTopBarText descPrefix;

    @C09CT("desc_suffix")
    public CommentTopBarText descSuffix;

    @C09CT("desc_tail")
    public CommentTopBarText descTail;

    @C09CT("display_strategy")
    public CommentTopBarComponentDisplayStrategy displayStrategy;

    @C09CT("extra")
    public String extra;

    @C09CT("icon")
    public CommentTopBarIcon icon;
    public Boolean isLocalDefault;

    @C09CT("name")
    public String name;

    @C09CT("separator")
    public CommentTopBarText separator;

    @C09CT("tail_icon")
    public CommentTopBarIcon tailIcon;

    @C09CT("template_type")
    public Integer templateType;

    @C09CT("title")
    public CommentTopBarText title;

    @C09CT("title_prefix")
    public CommentTopBarText titlePrefix;

    @C09CT("title_separator")
    public CommentTopBarText titleSeparator;

    @C09CT("tracer_info")
    public String tracerInfo;

    public CommentTopBarComponent() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CommentTopBarComponent)) {
            return false;
        }
        CommentTopBarComponent commentTopBarComponent = (CommentTopBarComponent) obj;
        return Intrinsics.LJFF(this.templateType, commentTopBarComponent.templateType) && Intrinsics.LJFF(this.bizType, commentTopBarComponent.bizType) && Intrinsics.LJFF(this.bizId, commentTopBarComponent.bizId) && Intrinsics.LJFF(this.name, commentTopBarComponent.name) && Intrinsics.LJFF(this.icon, commentTopBarComponent.icon) && Intrinsics.LJFF(this.titlePrefix, commentTopBarComponent.titlePrefix) && Intrinsics.LJFF(this.title, commentTopBarComponent.title) && Intrinsics.LJFF(this.titleSeparator, commentTopBarComponent.titleSeparator) && Intrinsics.LJFF(this.descPrefix, commentTopBarComponent.descPrefix) && Intrinsics.LJFF(this.separator, commentTopBarComponent.separator) && Intrinsics.LJFF(this.descSuffix, commentTopBarComponent.descSuffix) && Intrinsics.LJFF(this.tailIcon, commentTopBarComponent.tailIcon) && Intrinsics.LJFF(this.descTail, commentTopBarComponent.descTail) && Intrinsics.LJFF(this.container, commentTopBarComponent.container) && Intrinsics.LJFF(this.action, commentTopBarComponent.action) && Intrinsics.LJFF(this.displayStrategy, commentTopBarComponent.displayStrategy) && Intrinsics.LJFF(this.extra, commentTopBarComponent.extra) && Intrinsics.LJFF(this.tracerInfo, commentTopBarComponent.tracerInfo) && Intrinsics.LJFF(this.isLocalDefault, commentTopBarComponent.isLocalDefault);
    }

    public final Boolean isLocalDefault() {
        return this.isLocalDefault;
    }

    public final void setAction(CommentTopBarAction commentTopBarAction) {
        this.action = commentTopBarAction;
    }

    public final void setBizId(String str) {
        this.bizId = str;
    }

    public final void setBizType(Integer num) {
        this.bizType = num;
    }

    public final void setContainer(CommentTopBarContainer commentTopBarContainer) {
        this.container = commentTopBarContainer;
    }

    public final void setDescPrefix(CommentTopBarText commentTopBarText) {
        this.descPrefix = commentTopBarText;
    }

    public final void setDescSuffix(CommentTopBarText commentTopBarText) {
        this.descSuffix = commentTopBarText;
    }

    public final void setDescTail(CommentTopBarText commentTopBarText) {
        this.descTail = commentTopBarText;
    }

    public final void setDisplayStrategy(CommentTopBarComponentDisplayStrategy commentTopBarComponentDisplayStrategy) {
        this.displayStrategy = commentTopBarComponentDisplayStrategy;
    }

    public final void setExtra(String str) {
        this.extra = str;
    }

    public final void setIcon(CommentTopBarIcon commentTopBarIcon) {
        this.icon = commentTopBarIcon;
    }

    public final void setLocalDefault(Boolean bool) {
        this.isLocalDefault = bool;
    }

    public final void setName(String str) {
        this.name = str;
    }

    public final void setSeparator(CommentTopBarText commentTopBarText) {
        this.separator = commentTopBarText;
    }

    public final void setTailIcon(CommentTopBarIcon commentTopBarIcon) {
        this.tailIcon = commentTopBarIcon;
    }

    public final void setTemplateType(Integer num) {
        this.templateType = num;
    }

    public final void setTitle(CommentTopBarText commentTopBarText) {
        this.title = commentTopBarText;
    }

    public final void setTitlePrefix(CommentTopBarText commentTopBarText) {
        this.titlePrefix = commentTopBarText;
    }

    public final void setTitleSeparator(CommentTopBarText commentTopBarText) {
        this.titleSeparator = commentTopBarText;
    }

    public final void setTracerInfo(String str) {
        this.tracerInfo = str;
    }

    public CommentTopBarComponent(Integer num, Integer num2, String str, String str2, CommentTopBarIcon commentTopBarIcon, CommentTopBarText commentTopBarText, CommentTopBarText commentTopBarText2, CommentTopBarText commentTopBarText3, CommentTopBarText commentTopBarText4, CommentTopBarText commentTopBarText5, CommentTopBarText commentTopBarText6, CommentTopBarIcon commentTopBarIcon2, CommentTopBarText commentTopBarText7, CommentTopBarContainer commentTopBarContainer, CommentTopBarAction commentTopBarAction, CommentTopBarComponentDisplayStrategy commentTopBarComponentDisplayStrategy, String str3, String str4, Boolean bool) {
        this.templateType = num;
        this.bizType = num2;
        this.bizId = str;
        this.name = str2;
        this.icon = commentTopBarIcon;
        this.titlePrefix = commentTopBarText;
        this.title = commentTopBarText2;
        this.titleSeparator = commentTopBarText3;
        this.descPrefix = commentTopBarText4;
        this.separator = commentTopBarText5;
        this.descSuffix = commentTopBarText6;
        this.tailIcon = commentTopBarIcon2;
        this.descTail = commentTopBarText7;
        this.container = commentTopBarContainer;
        this.action = commentTopBarAction;
        this.displayStrategy = commentTopBarComponentDisplayStrategy;
        this.extra = str3;
        this.tracerInfo = str4;
        this.isLocalDefault = bool;
    }
}
