package com.ss.android.ugc.aweme.search.pages.result.pov.model;

import X.C09CT;
import X.C2188811AlT;
import X.InterfaceC1120204Zs;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class MultiSummaryDisplayInfo implements Serializable, InterfaceC1120204Zs {

    @C09CT("loading_time_duration")
    public final Long loadingTimeDuration;

    @C09CT("preview_loading_texts")
    public final List<String> previewLoadingTexts;

    @C09CT("preview_retry_texts")
    public final List<String> previewRetryTexts;

    public MultiSummaryDisplayInfo() {
        this(null, null, 1000L);
    }

    public final MultiSummaryDisplayInfo copy(List<String> list, List<String> list2, Long l) {
        return new MultiSummaryDisplayInfo(list, list2, l);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MultiSummaryDisplayInfo)) {
            return false;
        }
        MultiSummaryDisplayInfo multiSummaryDisplayInfo = (MultiSummaryDisplayInfo) obj;
        return Intrinsics.LJFF(this.previewLoadingTexts, multiSummaryDisplayInfo.previewLoadingTexts) && Intrinsics.LJFF(this.previewRetryTexts, multiSummaryDisplayInfo.previewRetryTexts) && Intrinsics.LJFF(this.loadingTimeDuration, multiSummaryDisplayInfo.loadingTimeDuration);
    }

    @Override // X.InterfaceC1120204Zs
    public String getLandingRetryText() {
        return null;
    }

    public String getLandingRetryToastText() {
        return null;
    }

    public int hashCode() {
        List<String> list = this.previewLoadingTexts;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        List<String> list2 = this.previewRetryTexts;
        int iHashCode2 = (iHashCode + (list2 == null ? 0 : list2.hashCode())) * 31;
        Long l = this.loadingTimeDuration;
        return iHashCode2 + (l != null ? l.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MultiSummaryDisplayInfo(previewLoadingTexts=");
        sbLIZ.append(this.previewLoadingTexts);
        sbLIZ.append(", previewRetryTexts=");
        sbLIZ.append(this.previewRetryTexts);
        sbLIZ.append(", loadingTimeDuration=");
        sbLIZ.append(this.loadingTimeDuration);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC1120204Zs
    public Long getLoadingTimeDuration() {
        return this.loadingTimeDuration;
    }

    @Override // X.InterfaceC1120204Zs
    public List<String> getPreviewLoadingTexts() {
        return this.previewLoadingTexts;
    }

    @Override // X.InterfaceC1120204Zs
    public List<String> getPreviewRetryTexts() {
        return this.previewRetryTexts;
    }

    public MultiSummaryDisplayInfo(List<String> list, List<String> list2, Long l) {
        this.previewLoadingTexts = list;
        this.previewRetryTexts = list2;
        this.loadingTimeDuration = l;
    }
}
