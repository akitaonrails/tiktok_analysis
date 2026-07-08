package com.bytedance.android.livesdk.livesetting.linkmic;

import X.C1697810uHb;
import com.google.gson.n;
import java.util.List;

/* JADX INFO: loaded from: classes16.dex */
public final class MultiGuestV3GuestMonitoringTipsSetting {
    public static final String DEFAULT = "";
    public static n cache;
    public static final int defaultInt = 0;
    public static final MultiGuestV3GuestMonitoringTipsSetting INSTANCE = new MultiGuestV3GuestMonitoringTipsSetting();
    public static String last = "";
    public static final List<Integer> hiddenLevelList = C1697810uHb.LJIIJJI(0, 1, 2);
    public static final List<Integer> badLevelList = C1697810uHb.LJIIJJI(3, 4);
    public static final List<Integer> veryBadLevelList = C1697810uHb.LJIIJJI(5, 6);

    public final boolean getShowNetworkTip() {
        return true;
    }

    public final boolean getSyncNetworkState() {
        return true;
    }

    public final List<Integer> getBadLevelList() {
        return badLevelList;
    }

    public final List<Integer> getHiddenLevelList() {
        return hiddenLevelList;
    }

    public final List<Integer> getVeryBadLevelList() {
        return veryBadLevelList;
    }
}
