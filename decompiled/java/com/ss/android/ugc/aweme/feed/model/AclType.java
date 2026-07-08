package com.ss.android.ugc.aweme.feed.model;

import X.C08FF;
import X.C2254308sP;
import X.InterfaceC2044707zh;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes17.dex */
public final class AclType {
    public static final /* synthetic */ InterfaceC2044707zh $ENTRIES;
    public static final /* synthetic */ AclType[] $VALUES;
    public static final AclType SHARE_THIRD_PLATFORM = new AclType("SHARE_THIRD_PLATFORM", 0);
    public static final AclType PLATFORM_LIST = new AclType("PLATFORM_LIST", 1);
    public static final AclType SHARE_GENERAL = new AclType("SHARE_GENERAL", 2);

    public static final /* synthetic */ AclType[] $values() {
        return new AclType[]{SHARE_THIRD_PLATFORM, PLATFORM_LIST, SHARE_GENERAL};
    }

    public static InterfaceC2044707zh<AclType> getEntries() {
        return $ENTRIES;
    }

    static {
        AclType[] aclTypeArr$values = $values();
        $VALUES = aclTypeArr$values;
        $ENTRIES = new C2254308sP(aclTypeArr$values);
    }

    public static AclType[] values() {
        return (AclType[]) $VALUES.clone();
    }

    public static AclType valueOf(String str) {
        return (AclType) C08FF.LIZ(AclType.class, str);
    }

    public AclType(String str, int i) {
    }
}
