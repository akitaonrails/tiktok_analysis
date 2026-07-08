package com.ss.android.ugc.aweme.feed.model;

import X.C08FF;
import X.C2254308sP;
import X.InterfaceC2044707zh;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class CommentTopBarTemplateType {
    public static final /* synthetic */ InterfaceC2044707zh $ENTRIES;
    public static final /* synthetic */ CommentTopBarTemplateType[] $VALUES;
    public static final CommentTopBarTemplateType UNKNOWN_TEMPLATE = new CommentTopBarTemplateType("UNKNOWN_TEMPLATE", 0);
    public static final CommentTopBarTemplateType ANCHOR_TYPE = new CommentTopBarTemplateType("ANCHOR_TYPE", 1);
    public static final CommentTopBarTemplateType SEARCH_TYPE = new CommentTopBarTemplateType("SEARCH_TYPE", 2);

    public static final /* synthetic */ CommentTopBarTemplateType[] $values() {
        return new CommentTopBarTemplateType[]{UNKNOWN_TEMPLATE, ANCHOR_TYPE, SEARCH_TYPE};
    }

    public static InterfaceC2044707zh<CommentTopBarTemplateType> getEntries() {
        return $ENTRIES;
    }

    static {
        CommentTopBarTemplateType[] commentTopBarTemplateTypeArr$values = $values();
        $VALUES = commentTopBarTemplateTypeArr$values;
        $ENTRIES = new C2254308sP(commentTopBarTemplateTypeArr$values);
    }

    public static CommentTopBarTemplateType[] values() {
        return (CommentTopBarTemplateType[]) $VALUES.clone();
    }

    public static CommentTopBarTemplateType valueOf(String str) {
        return (CommentTopBarTemplateType) C08FF.LIZ(CommentTopBarTemplateType.class, str);
    }

    public CommentTopBarTemplateType(String str, int i) {
    }
}
