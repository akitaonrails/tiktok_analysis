package com.ss.android.ugc.aweme.feed.model.search;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class VisualSearchInfoStructKt {
    public static final boolean enableEcomNoCartEntrance(VisualSearchInfoStruct visualSearchInfoStruct) {
        Integer num;
        if (visualSearchInfoStruct == null || (num = visualSearchInfoStruct.ecomNoCartEntranceEnableType) == null || num.intValue() <= 0) {
            return false;
        }
        return true;
    }

    public static final boolean enableVtagComponent(VisualSearchInfoStruct visualSearchInfoStruct) {
        if (visualSearchInfoStruct == null) {
            return false;
        }
        if (!Intrinsics.LJFF(visualSearchInfoStruct.remoteVtagEnable, Boolean.TRUE) && (visualSearchInfoStruct == null || !Intrinsics.LJFF(visualSearchInfoStruct.fallbackVtagEnable, Boolean.TRUE))) {
            return false;
        }
        return true;
    }

    public static final boolean isVideoAuthTheVisualSearch(VisualSearchInfoStruct visualSearchInfoStruct) {
        Integer num;
        if (visualSearchInfoStruct == null || (num = visualSearchInfoStruct.authorVisualSearchEnable) == null || num.intValue() != 1) {
            return false;
        }
        return true;
    }

    public static final boolean isVisualSearchStrongIntent(VisualSearchInfoStruct visualSearchInfoStruct) {
        Integer num;
        if (visualSearchInfoStruct == null || (num = visualSearchInfoStruct.visualSearchIntentLevel) == null || num.intValue() != 1) {
            return false;
        }
        return true;
    }

    public static final VisualSearchInfoStruct update(VisualSearchInfoStruct visualSearchInfoStruct, VisualSearchInfoStruct visualSearchInfoStruct2) {
        if (visualSearchInfoStruct == null) {
            return visualSearchInfoStruct2;
        }
        if (visualSearchInfoStruct2 == null) {
            return new VisualSearchInfoStruct(Boolean.FALSE, Boolean.FALSE, Boolean.FALSE, null, visualSearchInfoStruct.screenshotEntranceStatus, 0, 0, null, null, null, null, 0, 0);
        }
        Integer num = visualSearchInfoStruct2.screenshotEntranceStatus;
        if (num != null && num.intValue() != 0) {
            return visualSearchInfoStruct2;
        }
        return visualSearchInfoStruct2.copy(visualSearchInfoStruct2.remoteVtagEnable, visualSearchInfoStruct2.longPressEntranceEnable, visualSearchInfoStruct2.fallbackVtagEnable, visualSearchInfoStruct2.visualSearchIntentLevel, visualSearchInfoStruct.screenshotEntranceStatus, visualSearchInfoStruct2.vtagEnableType, visualSearchInfoStruct2.fallbackVtagEnableType, visualSearchInfoStruct2.disableEcomContentType, visualSearchInfoStruct2.apiControlInfo, visualSearchInfoStruct2.fallbackVtagInfo, visualSearchInfoStruct2.vtags, visualSearchInfoStruct2.ecomNoCartEntranceEnableType, visualSearchInfoStruct2.authorVisualSearchEnable);
    }
}
