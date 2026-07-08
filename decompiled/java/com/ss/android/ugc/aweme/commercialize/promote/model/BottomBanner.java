package com.ss.android.ugc.aweme.commercialize.promote.model;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes20.dex */
public final class BottomBanner implements Serializable {

    @C09CT("bottom_banner_frequency_clear")
    public Boolean frequencyClear;

    @C09CT("bottom_banner_text_key")
    public String key;

    @C09CT("schema")
    public String schema;

    @C09CT("bottom_banner_show_times")
    public Integer showTimes;

    @C09CT("bottom_banner_next_show_gap_days")
    public Integer timeGap;

    @C09CT("button_type")
    public Integer type;

    public BottomBanner() {
        this(null, null, null, null, Boolean.FALSE, null);
    }

    public final Boolean getFrequencyClear() {
        return this.frequencyClear;
    }

    public final String getKey() {
        return this.key;
    }

    public final String getSchema() {
        return this.schema;
    }

    public final Integer getShowTimes() {
        return this.showTimes;
    }

    public final Integer getTimeGap() {
        return this.timeGap;
    }

    public final Integer getType() {
        return this.type;
    }

    public final void setFrequencyClear(Boolean bool) {
        this.frequencyClear = bool;
    }

    public final void setKey(String str) {
        this.key = str;
    }

    public final void setSchema(String str) {
        this.schema = str;
    }

    public final void setShowTimes(Integer num) {
        this.showTimes = num;
    }

    public final void setTimeGap(Integer num) {
        this.timeGap = num;
    }

    public final void setType(Integer num) {
        this.type = num;
    }

    public BottomBanner(Integer num, String str, Integer num2, Integer num3, Boolean bool, String str2) {
        this.type = num;
        this.key = str;
        this.showTimes = num2;
        this.timeGap = num3;
        this.frequencyClear = bool;
        this.schema = str2;
    }
}
