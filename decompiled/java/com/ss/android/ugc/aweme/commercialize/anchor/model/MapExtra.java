package com.ss.android.ugc.aweme.commercialize.anchor.model;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes17.dex */
public final class MapExtra implements Serializable {

    @C09CT("anchor_partner")
    public Integer anchorPartner;

    @C09CT("attribution_data")
    public AttributionData attributionData;

    @C09CT("format_data")
    public Format formatData;

    @C09CT("jump_data")
    public JumpData jumpData;

    @C09CT("map_anchor_extra")
    public String mapAnchorExtra;

    @C09CT("report_data")
    public ReportData reportData;

    public final Integer getAnchorPartner() {
        return this.anchorPartner;
    }

    public final AttributionData getAttributionData() {
        return this.attributionData;
    }

    public final Format getFormatData() {
        return this.formatData;
    }

    public final JumpData getJumpData() {
        return this.jumpData;
    }

    public final String getMapAnchorExtra() {
        return this.mapAnchorExtra;
    }

    public final ReportData getReportData() {
        return this.reportData;
    }

    public final void setAnchorPartner(Integer num) {
        this.anchorPartner = num;
    }

    public final void setAttributionData(AttributionData attributionData) {
        this.attributionData = attributionData;
    }

    public final void setFormatData(Format format) {
        this.formatData = format;
    }

    public final void setJumpData(JumpData jumpData) {
        this.jumpData = jumpData;
    }

    public final void setMapAnchorExtra(String str) {
        this.mapAnchorExtra = str;
    }

    public final void setReportData(ReportData reportData) {
        this.reportData = reportData;
    }
}
