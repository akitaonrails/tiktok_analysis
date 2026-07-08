package com.bytedance.tiktok.homepage.mainfragment;

import X.C08FF;
import X.C2254308sP;
import X.InterfaceC2044707zh;
import com.ss.android.ugc.aweme.feed.util.LivePreviewCTASmartDisplayManager;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes25.dex */
public final class MFLeftIconPriority {
    public static final /* synthetic */ InterfaceC2044707zh $ENTRIES;
    public static final /* synthetic */ MFLeftIconPriority[] $VALUES;
    public static final MFLeftIconPriority DYNAMIC = new MFLeftIconPriority("DYNAMIC", 0);
    public static final MFLeftIconPriority PUBLISH = new MFLeftIconPriority("PUBLISH", 1);
    public static final MFLeftIconPriority LIVE = new MFLeftIconPriority("LIVE", 2);
    public static final MFLeftIconPriority SEARCH = new MFLeftIconPriority("SEARCH", 3);
    public static final MFLeftIconPriority DEFAULT = new MFLeftIconPriority(LivePreviewCTASmartDisplayManager.DEFAULT, 4);

    public static final /* synthetic */ MFLeftIconPriority[] $values() {
        return new MFLeftIconPriority[]{DYNAMIC, PUBLISH, LIVE, SEARCH, DEFAULT};
    }

    public static InterfaceC2044707zh<MFLeftIconPriority> getEntries() {
        return $ENTRIES;
    }

    static {
        MFLeftIconPriority[] mFLeftIconPriorityArr$values = $values();
        $VALUES = mFLeftIconPriorityArr$values;
        $ENTRIES = new C2254308sP(mFLeftIconPriorityArr$values);
    }

    public static MFLeftIconPriority[] values() {
        return (MFLeftIconPriority[]) $VALUES.clone();
    }

    public static MFLeftIconPriority valueOf(String str) {
        return (MFLeftIconPriority) C08FF.LIZ(MFLeftIconPriority.class, str);
    }

    public MFLeftIconPriority(String str, int i) {
    }
}
