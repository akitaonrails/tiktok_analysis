package com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model;

import X.C09CT;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class SearchSpotInfo implements Serializable {
    public static final int $stable = 8;

    @C09CT("button_link")
    public final String buttonSchema;

    @C09CT("button_title")
    public final String buttonText;

    @C09CT("event_id")
    public final Long eventId;

    @C09CT("event_id_str")
    public final String eventIdStr;

    @C09CT("icon")
    public String frameIcon;

    @C09CT("hot_value")
    public long hotValue;

    @C09CT("rank_number")
    public String rankNumber;

    @C09CT("sentence")
    public String sentence = "";

    public int hashCode() {
        return this.sentence.hashCode();
    }

    public final String getButtonSchema() {
        return this.buttonSchema;
    }

    public final String getButtonText() {
        return this.buttonText;
    }

    public final Long getEventId() {
        return this.eventId;
    }

    public final String getEventIdStr() {
        return this.eventIdStr;
    }

    public final String getFrameIcon() {
        return this.frameIcon;
    }

    public final long getHotValue() {
        return this.hotValue;
    }

    public final String getRankNumber() {
        return this.rankNumber;
    }

    public final String getSentence() {
        return this.sentence;
    }

    public boolean equals(Object obj) {
        Class<?> cls;
        if (this == obj) {
            return true;
        }
        if (obj != null) {
            cls = obj.getClass();
        } else {
            cls = null;
        }
        if (Intrinsics.LJFF(SearchSpotInfo.class, cls) && Intrinsics.LJFF(this.sentence, ((SearchSpotInfo) obj).sentence)) {
            return true;
        }
        return false;
    }

    public final void setFrameIcon(String str) {
        this.frameIcon = str;
    }

    public final void setHotValue(long j) {
        this.hotValue = j;
    }

    public final void setRankNumber(String str) {
        this.rankNumber = str;
    }

    public final void setSentence(String str) {
        this.sentence = str;
    }
}
