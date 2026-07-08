package com.ss.android.ugc.aweme.search.pages.result.pov.model;

import X.C09CT;
import com.ss.android.ugc.aweme.search.pages.result.nimble.model.fusioncard.SummaryDisplayInfo;
import java.io.Serializable;

/* JADX INFO: loaded from: classes11.dex */
public final class AISummaryStream implements Serializable {

    @C09CT("attr")
    public final AISummaryStreamAttr attr;

    @C09CT("display_info")
    public final SummaryDisplayInfo displayInfo;

    @C09CT("dynamic_param")
    public final String dynamicParam;

    @C09CT("page_op")
    public final String pageOp;

    @C09CT("stage_code")
    public final Integer stageCode;

    @C09CT("status_code")
    public final Integer statusCode;

    @C09CT("stream_segment")
    public final AiStreamSegment streamSegment;

    public AISummaryStream() {
        this(null, null, null, null, null, null, null);
    }

    public int hashCode() {
        Integer num = this.statusCode;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        AISummaryStreamAttr aISummaryStreamAttr = this.attr;
        int iHashCode2 = (iHashCode + (aISummaryStreamAttr == null ? 0 : aISummaryStreamAttr.hashCode())) * 31;
        AiStreamSegment aiStreamSegment = this.streamSegment;
        int iHashCode3 = (iHashCode2 + (aiStreamSegment == null ? 0 : aiStreamSegment.hashCode())) * 31;
        SummaryDisplayInfo summaryDisplayInfo = this.displayInfo;
        int iHashCode4 = (iHashCode3 + (summaryDisplayInfo == null ? 0 : summaryDisplayInfo.hashCode())) * 31;
        Integer num2 = this.stageCode;
        int iHashCode5 = (iHashCode4 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str = this.dynamicParam;
        int iHashCode6 = (iHashCode5 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.pageOp;
        return iHashCode6 + (str2 != null ? str2.hashCode() : 0);
    }

    public AISummaryStream(Integer num, AISummaryStreamAttr aISummaryStreamAttr, AiStreamSegment aiStreamSegment, SummaryDisplayInfo summaryDisplayInfo, Integer num2, String str, String str2) {
        this.statusCode = num;
        this.attr = aISummaryStreamAttr;
        this.streamSegment = aiStreamSegment;
        this.displayInfo = summaryDisplayInfo;
        this.stageCode = num2;
        this.dynamicParam = str;
        this.pageOp = str2;
    }
}
