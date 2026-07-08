package com.ss.android.ugc.aweme.services.publisherror;

import X.C08FF;
import X.C2254308sP;
import X.InterfaceC2044707zh;
import java.util.Iterator;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes23.dex */
public final class PublishErrorHandleBtnType {
    public static final /* synthetic */ InterfaceC2044707zh $ENTRIES;
    public static final /* synthetic */ PublishErrorHandleBtnType[] $VALUES;
    public static final Companion Companion;
    public final int value;
    public static final PublishErrorHandleBtnType RETRY = new PublishErrorHandleBtnType("RETRY", 0, 0);
    public static final PublishErrorHandleBtnType GO_TO_EDIT = new PublishErrorHandleBtnType("GO_TO_EDIT", 1, 1);
    public static final PublishErrorHandleBtnType GO_TO_PUBLISH = new PublishErrorHandleBtnType("GO_TO_PUBLISH", 2, 2);
    public static final PublishErrorHandleBtnType OPEN_SCHEMA = new PublishErrorHandleBtnType("OPEN_SCHEMA", 3, 99);
    public static final PublishErrorHandleBtnType NONE = new PublishErrorHandleBtnType("NONE", 4, 100);
    public static final PublishErrorHandleBtnType UNKNOWN = new PublishErrorHandleBtnType("UNKNOWN", 5, Integer.MIN_VALUE);

    public static final /* synthetic */ PublishErrorHandleBtnType[] $values() {
        return new PublishErrorHandleBtnType[]{RETRY, GO_TO_EDIT, GO_TO_PUBLISH, OPEN_SCHEMA, NONE, UNKNOWN};
    }

    public static InterfaceC2044707zh<PublishErrorHandleBtnType> getEntries() {
        return $ENTRIES;
    }

    static {
        PublishErrorHandleBtnType[] publishErrorHandleBtnTypeArr$values = $values();
        $VALUES = publishErrorHandleBtnTypeArr$values;
        $ENTRIES = new C2254308sP(publishErrorHandleBtnTypeArr$values);
        Companion = new Companion();
    }

    public static PublishErrorHandleBtnType[] values() {
        return (PublishErrorHandleBtnType[]) $VALUES.clone();
    }

    public final int getValue() {
        return this.value;
    }

    public static final class Companion {
        public final PublishErrorHandleBtnType fromValue(int i) {
            PublishErrorHandleBtnType next;
            Iterator<PublishErrorHandleBtnType> it2 = PublishErrorHandleBtnType.getEntries().iterator();
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
            PublishErrorHandleBtnType publishErrorHandleBtnType = next;
            if (publishErrorHandleBtnType == null) {
                return PublishErrorHandleBtnType.UNKNOWN;
            }
            return publishErrorHandleBtnType;
        }
    }

    public static PublishErrorHandleBtnType valueOf(String str) {
        return (PublishErrorHandleBtnType) C08FF.LIZ(PublishErrorHandleBtnType.class, str);
    }

    public PublishErrorHandleBtnType(String str, int i, int i2) {
        this.value = i2;
    }
}
