package com.ss.android.ugc.aweme.commercialize.hybrid.api.web.model;

import X.C09CT;
import X.C2188811AlT;
import java.io.Serializable;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes17.dex */
public final class AdWebRecordingModel implements Serializable {

    @C09CT("current_page_click_count")
    public final AtomicLong currentPageClickCount;

    @C09CT("current_page_scroll_count")
    public final AtomicLong currentPageScrollCount;

    @C09CT("event_index")
    public final AtomicInteger eventIndex;

    @C09CT("is_inject_js")
    public AtomicBoolean isInjectJs;

    public AdWebRecordingModel() {
        this(new AtomicInteger(0), new AtomicLong(0L), new AtomicLong(0L), new AtomicBoolean(false));
    }

    public final AdWebRecordingModel copy(AtomicInteger atomicInteger, AtomicLong atomicLong, AtomicLong atomicLong2, AtomicBoolean atomicBoolean) {
        return new AdWebRecordingModel(atomicInteger, atomicLong, atomicLong2, atomicBoolean);
    }

    public int hashCode() {
        return (((((this.eventIndex.hashCode() * 31) + this.currentPageClickCount.hashCode()) * 31) + this.currentPageScrollCount.hashCode()) * 31) + this.isInjectJs.hashCode();
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AdWebRecordingModel(eventIndex=");
        sbLIZ.append(this.eventIndex);
        sbLIZ.append(", currentPageClickCount=");
        sbLIZ.append(this.currentPageClickCount);
        sbLIZ.append(", currentPageScrollCount=");
        sbLIZ.append(this.currentPageScrollCount);
        sbLIZ.append(", isInjectJs=");
        sbLIZ.append(this.isInjectJs);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final AtomicBoolean isInjectJs() {
        return this.isInjectJs;
    }

    public final void setInjectJs(AtomicBoolean atomicBoolean) {
        this.isInjectJs = atomicBoolean;
    }

    public AdWebRecordingModel(AtomicInteger atomicInteger, AtomicLong atomicLong, AtomicLong atomicLong2, AtomicBoolean atomicBoolean) {
        this.eventIndex = atomicInteger;
        this.currentPageClickCount = atomicLong;
        this.currentPageScrollCount = atomicLong2;
        this.isInjectJs = atomicBoolean;
    }
}
