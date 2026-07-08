package com.bytedance.android.livesdk.comp.api.linkcore.model;

import X.C13BV;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import tikcast.linkmic.common.PosIdentity;

/* JADX INFO: loaded from: classes16.dex */
public final class LinkMicStatus {
    public final String aigcWallpaperUrl;
    public final long clientVersion;
    public final String layoutId;
    public final List<tikcast.linkmic.common.LinkUserState> linkUserState;
    public final String sharedBgStickerId;
    public final List<PosIdentity> uiPositions;

    public LinkMicStatus() {
        this(0L, null, null, null, null, null, 63, null);
    }

    public LinkMicStatus(long j, String str, List<tikcast.linkmic.common.LinkUserState> list, String str2, String str3, List<PosIdentity> list2) {
        this.clientVersion = j;
        this.layoutId = str;
        this.linkUserState = list;
        this.sharedBgStickerId = str2;
        this.aigcWallpaperUrl = str3;
        this.uiPositions = list2;
    }

    public LinkMicStatus(long j, String str, List list, String str2, String str3, List list2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 0L : j, (i & 2) != 0 ? "" : str, (i & 4) != 0 ? C13BV.INSTANCE : list, (i & 8) != 0 ? null : str2, (i & 16) == 0 ? str3 : null, (i & 32) != 0 ? C13BV.INSTANCE : list2);
    }
}
