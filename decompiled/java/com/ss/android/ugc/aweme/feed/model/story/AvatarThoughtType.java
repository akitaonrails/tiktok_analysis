package com.ss.android.ugc.aweme.feed.model.story;

import X.C08FF;
import X.C2254308sP;
import X.InterfaceC2044707zh;
import java.util.Iterator;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes23.dex */
public final class AvatarThoughtType {
    public static final /* synthetic */ InterfaceC2044707zh $ENTRIES;
    public static final /* synthetic */ AvatarThoughtType[] $VALUES;
    public static final Companion Companion;
    public final int value;
    public static final AvatarThoughtType AVATARTYPE_PROFILE_PHOTO = new AvatarThoughtType("AVATARTYPE_PROFILE_PHOTO", 0, 0);
    public static final AvatarThoughtType AVATARTYPE_SOCIAL_AVATAR = new AvatarThoughtType("AVATARTYPE_SOCIAL_AVATAR", 1, 1);
    public static final AvatarThoughtType AVATARTYPE_AVATAR_THOUGHT = new AvatarThoughtType("AVATARTYPE_AVATAR_THOUGHT", 2, 2);
    public static final AvatarThoughtType AVATARTYPE_SOCIAL_AVATAR_WITHOUT_BG = new AvatarThoughtType("AVATARTYPE_SOCIAL_AVATAR_WITHOUT_BG", 3, 3);

    public static final /* synthetic */ AvatarThoughtType[] $values() {
        return new AvatarThoughtType[]{AVATARTYPE_PROFILE_PHOTO, AVATARTYPE_SOCIAL_AVATAR, AVATARTYPE_AVATAR_THOUGHT, AVATARTYPE_SOCIAL_AVATAR_WITHOUT_BG};
    }

    public static InterfaceC2044707zh<AvatarThoughtType> getEntries() {
        return $ENTRIES;
    }

    static {
        AvatarThoughtType[] avatarThoughtTypeArr$values = $values();
        $VALUES = avatarThoughtTypeArr$values;
        $ENTRIES = new C2254308sP(avatarThoughtTypeArr$values);
        Companion = new Companion();
    }

    public static AvatarThoughtType[] values() {
        return (AvatarThoughtType[]) $VALUES.clone();
    }

    public final int getValue() {
        return this.value;
    }

    public static final class Companion {
        public final AvatarThoughtType fromInt(int i) {
            AvatarThoughtType next;
            Iterator<AvatarThoughtType> it2 = AvatarThoughtType.getEntries().iterator();
            while (true) {
                if (it2.hasNext()) {
                    next = it2.next();
                    if (next.getValue() == i) {
                        break;
                    }
                } else {
                    next = null;
                    break;
                }
            }
            AvatarThoughtType avatarThoughtType = next;
            if (avatarThoughtType == null) {
                return AvatarThoughtType.AVATARTYPE_PROFILE_PHOTO;
            }
            return avatarThoughtType;
        }
    }

    public static AvatarThoughtType valueOf(String str) {
        return (AvatarThoughtType) C08FF.LIZ(AvatarThoughtType.class, str);
    }

    public AvatarThoughtType(String str, int i, int i2) {
        this.value = i2;
    }
}
