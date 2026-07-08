package com.ss.android.ugc.aweme.feed.model.banner;

import X.C08FF;
import X.C2254308sP;
import X.InterfaceC2044707zh;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class TagActionType {
    public static final /* synthetic */ InterfaceC2044707zh $ENTRIES;
    public static final /* synthetic */ TagActionType[] $VALUES;
    public static final Companion Companion;
    public static final TagActionType TAG_ACTION_TYPE_CUSTOMIZED = new TagActionType("TAG_ACTION_TYPE_CUSTOMIZED", 0, 0);
    public final int type;

    public static final /* synthetic */ TagActionType[] $values() {
        return new TagActionType[]{TAG_ACTION_TYPE_CUSTOMIZED};
    }

    public static final TagActionType fromValue(int i) {
        return Companion.fromValue(i);
    }

    public static InterfaceC2044707zh<TagActionType> getEntries() {
        return $ENTRIES;
    }

    static {
        TagActionType[] tagActionTypeArr$values = $values();
        $VALUES = tagActionTypeArr$values;
        $ENTRIES = new C2254308sP(tagActionTypeArr$values);
        Companion = new Companion();
    }

    public static TagActionType[] values() {
        return (TagActionType[]) $VALUES.clone();
    }

    public final int getType() {
        return this.type;
    }

    public static final class Companion {
        public final TagActionType fromValue(int i) {
            for (TagActionType tagActionType : TagActionType.values()) {
                if (tagActionType.getType() == i) {
                    return tagActionType;
                }
            }
            return TagActionType.TAG_ACTION_TYPE_CUSTOMIZED;
        }
    }

    public static TagActionType valueOf(String str) {
        return (TagActionType) C08FF.LIZ(TagActionType.class, str);
    }

    public TagActionType(String str, int i, int i2) {
        this.type = i2;
    }
}
