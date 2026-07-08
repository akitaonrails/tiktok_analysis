package com.ss.android.ugc.aweme.live.notify;

import X.C08FF;
import X.C2254308sP;
import X.InterfaceC2044707zh;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes19.dex */
public final class LiveNotifyWidget {
    public static final /* synthetic */ InterfaceC2044707zh $ENTRIES;
    public static final /* synthetic */ LiveNotifyWidget[] $VALUES;
    public static final LiveNotifyWidget BANNER = new LiveNotifyWidget("BANNER", 0);
    public static final LiveNotifyWidget MID_TOUCH = new LiveNotifyWidget("MID_TOUCH", 1);

    public static final /* synthetic */ LiveNotifyWidget[] $values() {
        return new LiveNotifyWidget[]{BANNER, MID_TOUCH};
    }

    public static InterfaceC2044707zh<LiveNotifyWidget> getEntries() {
        return $ENTRIES;
    }

    static {
        LiveNotifyWidget[] liveNotifyWidgetArr$values = $values();
        $VALUES = liveNotifyWidgetArr$values;
        $ENTRIES = new C2254308sP(liveNotifyWidgetArr$values);
    }

    public static LiveNotifyWidget[] values() {
        return (LiveNotifyWidget[]) $VALUES.clone();
    }

    public static LiveNotifyWidget valueOf(String str) {
        return (LiveNotifyWidget) C08FF.LIZ(LiveNotifyWidget.class, str);
    }

    public LiveNotifyWidget(String str, int i) {
    }
}
