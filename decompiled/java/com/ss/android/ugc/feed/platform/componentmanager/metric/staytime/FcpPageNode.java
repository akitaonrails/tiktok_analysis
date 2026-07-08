package com.ss.android.ugc.feed.platform.componentmanager.metric.staytime;

import java.io.Serializable;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes33.dex */
public final class FcpPageNode implements Serializable {
    public static final int $stable = 8;
    public final Set<String> frameIds = new LinkedHashSet();
    public final FcpPageInfo info;
    public FcpComponentTracker tracker;

    public final Set<String> getFrameIds() {
        return this.frameIds;
    }

    public final FcpPageInfo getInfo() {
        return this.info;
    }

    public final FcpComponentTracker getTracker() {
        return this.tracker;
    }

    public FcpPageNode(FcpPageInfo fcpPageInfo) {
        this.info = fcpPageInfo;
    }

    public final boolean isComponentMatch(String str) {
        String componentKey;
        FcpComponentTracker fcpComponentTracker = this.tracker;
        if (fcpComponentTracker != null) {
            componentKey = fcpComponentTracker.getComponentKey();
        } else {
            componentKey = null;
        }
        return Intrinsics.LJFF(componentKey, str);
    }

    public final boolean isUniqueIdEqual(FcpPageInfo fcpPageInfo) {
        return this.info.isUniqueIdEqual(fcpPageInfo);
    }

    public final void setTracker(FcpComponentTracker fcpComponentTracker) {
        this.tracker = fcpComponentTracker;
    }

    public final void tryAddFrame(String str) {
        this.frameIds.add(str);
    }

    public final void tryRemoveFrame(String str) {
        this.frameIds.remove(str);
    }

    public final boolean isPageMatch(FcpPageInfo fcpPageInfo, boolean z) {
        if (fcpPageInfo.getWillEndRecordManually() && !z) {
            return false;
        }
        return Intrinsics.LJFF(this.info.getPageId(), fcpPageInfo.getPageId());
    }
}
