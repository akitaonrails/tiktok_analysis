package com.ss.android.ugc.aweme.im.common.model;

import X.C08FF;
import X.C2254308sP;
import X.InterfaceC2044707zh;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes5.dex */
public final class IMStickerCreationStatus {
    public static final /* synthetic */ InterfaceC2044707zh $ENTRIES;
    public static final /* synthetic */ IMStickerCreationStatus[] $VALUES;
    public final int status;
    public static final IMStickerCreationStatus NONE = new IMStickerCreationStatus("NONE", 0, 0);
    public static final IMStickerCreationStatus IN_PROGRESS = new IMStickerCreationStatus("IN_PROGRESS", 1, 1);
    public static final IMStickerCreationStatus CREATED = new IMStickerCreationStatus("CREATED", 2, 2);
    public static final IMStickerCreationStatus REGENERATING = new IMStickerCreationStatus("REGENERATING", 3, 3);
    public static final IMStickerCreationStatus FAILED = new IMStickerCreationStatus("FAILED", 4, 4);

    public static final /* synthetic */ IMStickerCreationStatus[] $values() {
        return new IMStickerCreationStatus[]{NONE, IN_PROGRESS, CREATED, REGENERATING, FAILED};
    }

    public static InterfaceC2044707zh<IMStickerCreationStatus> getEntries() {
        return $ENTRIES;
    }

    static {
        IMStickerCreationStatus[] iMStickerCreationStatusArr$values = $values();
        $VALUES = iMStickerCreationStatusArr$values;
        $ENTRIES = new C2254308sP(iMStickerCreationStatusArr$values);
    }

    public static IMStickerCreationStatus[] values() {
        return (IMStickerCreationStatus[]) $VALUES.clone();
    }

    public final int getStatus() {
        return this.status;
    }

    public static IMStickerCreationStatus valueOf(String str) {
        return (IMStickerCreationStatus) C08FF.LIZ(IMStickerCreationStatus.class, str);
    }

    public IMStickerCreationStatus(String str, int i, int i2) {
        this.status = i2;
    }
}
