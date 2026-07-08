package com.ss.android.ugc.aweme.dependence.beauty.data;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class BeautifyTag {
    public final String tag;
    public final float value;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BeautifyTag)) {
            return false;
        }
        BeautifyTag beautifyTag = (BeautifyTag) obj;
        return Intrinsics.LJFF(this.tag, beautifyTag.tag) && Float.compare(this.value, beautifyTag.value) == 0;
    }

    public BeautifyTag() {
        this("", 0.0f);
    }

    public BeautifyTag(String str, float f) {
        this.tag = str;
        this.value = f;
    }
}
