package com.ss.android.ugc.tools.net;

import X.C23114093w;

/* JADX INFO: loaded from: classes4.dex */
public final class WeakNetSortRule {
    public static final C23114093w Companion = new Object() { // from class: X.093w
    };
    public final int maxSortCount;
    public final int minNeededCount;
    public final int sortCategory;
    public final boolean sortCover;

    public WeakNetSortRule() {
        this(0, 0, 0, false);
    }

    public WeakNetSortRule(int i, int i2, int i3, boolean z) {
        this.sortCategory = i;
        this.maxSortCount = i2;
        this.minNeededCount = i3;
        this.sortCover = z;
    }
}
