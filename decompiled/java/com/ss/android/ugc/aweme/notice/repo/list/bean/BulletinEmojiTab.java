package com.ss.android.ugc.aweme.notice.repo.list.bean;

import X.C09CT;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class BulletinEmojiTab {

    @C09CT("count")
    public final long count;

    @C09CT("selected")
    public final boolean selected;

    @C09CT("tab_name")
    public final String tabName;

    @C09CT("tab_type")
    public final int tabType;

    public final BulletinEmojiTab copy(int i, String str, long j, boolean z) {
        return new BulletinEmojiTab(i, str, j, z);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BulletinEmojiTab)) {
            return false;
        }
        BulletinEmojiTab bulletinEmojiTab = (BulletinEmojiTab) obj;
        return this.tabType == bulletinEmojiTab.tabType && Intrinsics.LJFF(this.tabName, bulletinEmojiTab.tabName) && this.count == bulletinEmojiTab.count && this.selected == bulletinEmojiTab.selected;
    }

    public BulletinEmojiTab() {
        this(0, "", 0L, false);
    }

    public BulletinEmojiTab(int i, String str, long j, boolean z) {
        this.tabType = i;
        this.tabName = str;
        this.count = j;
        this.selected = z;
    }
}
