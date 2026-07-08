package com.ss.android.ugc.aweme.friendstab.model;

/* JADX INFO: loaded from: classes25.dex */
public final class SingleTabCounter {
    public int numberCount;
    public boolean showGuideRedDot;
    public String tag;

    public final SingleTabCounter copy(String str, int i, boolean z) {
        return new SingleTabCounter(str, i, z);
    }

    public SingleTabCounter() {
        this("", 0, false);
    }

    public final void setNumberCount(int i) {
        this.numberCount = i;
    }

    public final void setShowGuideRedDot(boolean z) {
        this.showGuideRedDot = z;
    }

    public final void setTag(String str) {
        this.tag = str;
    }

    public SingleTabCounter(String str, int i, boolean z) {
        this.tag = str;
        this.numberCount = i;
        this.showGuideRedDot = z;
    }
}
