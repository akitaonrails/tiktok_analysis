package com.ss.android.ugc.aweme.adaptation.analysis;

import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public class Analysis {
    public String category;
    public String creationId;
    public String eventName;
    public JSONObject ext_json;
    public long ext_value;
    public Map<String, String> extraMap;
    public String labelName;
    public long minValidStayDuration;
    public long value;

    public String getCategory() {
        return this.category;
    }

    public String getCreationId() {
        return this.creationId;
    }

    public String getEventName() {
        return this.eventName;
    }

    public JSONObject getExt_json() {
        return this.ext_json;
    }

    public long getExt_value() {
        return this.ext_value;
    }

    public Map<String, String> getExtraMap() {
        return this.extraMap;
    }

    public String getLabelName() {
        return this.labelName;
    }

    public long getMinValidStayDuration() {
        return this.minValidStayDuration;
    }

    public long getValue() {
        return this.value;
    }

    public Analysis setCategory(String str) {
        this.category = str;
        return this;
    }

    public Analysis setCreationId(String str) {
        this.creationId = str;
        return this;
    }

    public Analysis setEventName(String str) {
        this.eventName = str;
        return this;
    }

    public Analysis setExt_json(JSONObject jSONObject) {
        this.ext_json = jSONObject;
        return this;
    }

    public Analysis setExt_value(long j) {
        this.ext_value = j;
        return this;
    }

    public Analysis setExtraMap(Map<String, String> map) {
        this.extraMap = map;
        return this;
    }

    public Analysis setLabelName(String str) {
        this.labelName = str;
        return this;
    }

    public void setMinValidStayDuration(long j) {
        this.minValidStayDuration = j;
    }

    public Analysis setValue(long j) {
        this.value = j;
        return this;
    }
}
