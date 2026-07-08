package com.ss.android.ugc.aweme.feed.model.live;

import X.C09CT;
import android.os.SystemClock;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class RelatedLiveTagStruct implements Serializable {

    @C09CT("content")
    public String content;
    public boolean enterMixPageSign;

    @C09CT("related_tag")
    public String relatedTag;

    @C09CT("tag_name")
    public String tagName;
    public long updateTime;

    public RelatedLiveTagStruct() {
        this(SystemClock.elapsedRealtime(), false, null, null, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RelatedLiveTagStruct)) {
            return false;
        }
        RelatedLiveTagStruct relatedLiveTagStruct = (RelatedLiveTagStruct) obj;
        return this.updateTime == relatedLiveTagStruct.updateTime && this.enterMixPageSign == relatedLiveTagStruct.enterMixPageSign && Intrinsics.LJFF(this.tagName, relatedLiveTagStruct.tagName) && Intrinsics.LJFF(this.content, relatedLiveTagStruct.content) && Intrinsics.LJFF(this.relatedTag, relatedLiveTagStruct.relatedTag);
    }

    public final void setContent(String str) {
        this.content = str;
    }

    public final void setRelatedTag(String str) {
        this.relatedTag = str;
    }

    public final void setTagName(String str) {
        this.tagName = str;
    }

    public final void setUpdateTime(long j) {
        this.updateTime = j;
    }

    public RelatedLiveTagStruct(long j, boolean z, String str, String str2, String str3) {
        this.updateTime = j;
        this.enterMixPageSign = z;
        this.tagName = str;
        this.content = str2;
        this.relatedTag = str3;
    }
}
