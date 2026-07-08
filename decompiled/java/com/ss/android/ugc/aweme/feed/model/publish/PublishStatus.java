package com.ss.android.ugc.aweme.feed.model.publish;

import X.C08FF;
import X.C2254308sP;
import X.InterfaceC2044707zh;
import com.ss.android.ugc.aweme.feed.util.LivePreviewCTASmartDisplayManager;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes20.dex */
public final class PublishStatus {
    public static final /* synthetic */ InterfaceC2044707zh $ENTRIES;
    public static final /* synthetic */ PublishStatus[] $VALUES;
    public static final PublishStatus SUCCESS = new PublishStatus("SUCCESS", 0);
    public static final PublishStatus FAILED = new PublishStatus("FAILED", 1);
    public static final PublishStatus CANCEL = new PublishStatus("CANCEL", 2);
    public static final PublishStatus UPLOADING = new PublishStatus("UPLOADING", 3);
    public static final PublishStatus DEFAULT = new PublishStatus(LivePreviewCTASmartDisplayManager.DEFAULT, 4);

    public static final /* synthetic */ PublishStatus[] $values() {
        return new PublishStatus[]{SUCCESS, FAILED, CANCEL, UPLOADING, DEFAULT};
    }

    public static InterfaceC2044707zh<PublishStatus> getEntries() {
        return $ENTRIES;
    }

    static {
        PublishStatus[] publishStatusArr$values = $values();
        $VALUES = publishStatusArr$values;
        $ENTRIES = new C2254308sP(publishStatusArr$values);
    }

    public static PublishStatus[] values() {
        return (PublishStatus[]) $VALUES.clone();
    }

    public static PublishStatus valueOf(String str) {
        return (PublishStatus) C08FF.LIZ(PublishStatus.class, str);
    }

    public PublishStatus(String str, int i) {
    }
}
