package com.ss.android.ugc.feed.platform.cell.component.stickermanager.gesturesafe;

import X.C09CT;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes30.dex */
public final class CoverLimitInfo {
    public static final int $stable = 8;

    @C09CT("limit")
    public final float limit;

    @C09CT("types")
    public final ArrayList<Integer> types;

    public CoverLimitInfo(float f, ArrayList<Integer> arrayList) {
        this.limit = f;
        this.types = arrayList;
    }
}
