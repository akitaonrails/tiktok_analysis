package com.ss.android.ugc.feed.platform.cell.component.stickermanager.gesturesafe;

import X.C09CT;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes4.dex */
public final class ForbidGestureInfo {
    public static final int $stable = 8;

    @C09CT("ges")
    public final ArrayList<String> forbidGesture;

    @C09CT("type")
    public final int stickerType;

    public ForbidGestureInfo(int i, ArrayList<String> arrayList) {
        this.stickerType = i;
        this.forbidGesture = arrayList;
    }
}
