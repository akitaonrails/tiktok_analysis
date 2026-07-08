package com.ss.android.ugc.aweme.ecommerce.smartcheck.core.roma;

import X.C09CT;
import com.google.gson.k;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public final class RomaPatternKey {

    @C09CT("defaultValue")
    public final String defaultValue;

    @C09CT("desc")
    public final String desc;

    @C09CT("editable")
    public final boolean editable;

    @C09CT("joinPatternItem")
    public final k joinPatternItem;

    @C09CT("key")
    public String key = "";

    @C09CT("needEncode")
    public final boolean needEncode;

    @C09CT("options")
    public final List<RomaPatternOption> options;

    @C09CT("required")
    public boolean required;

    @C09CT("schema")
    public final String schema;

    @C09CT("type")
    public final String type;

    public final String getDefaultValue() {
        return this.defaultValue;
    }

    public final String getDesc() {
        return this.desc;
    }

    public final boolean getEditable() {
        return this.editable;
    }

    public final k getJoinPatternItem() {
        return this.joinPatternItem;
    }

    public final String getKey() {
        return this.key;
    }

    public final boolean getNeedEncode() {
        return this.needEncode;
    }

    public final List<RomaPatternOption> getOptions() {
        return this.options;
    }

    public final boolean getRequired() {
        return this.required;
    }

    public final String getSchema() {
        return this.schema;
    }

    public final String getType() {
        return this.type;
    }

    public final void setKey(String str) {
        this.key = str;
    }

    public final void setRequired(boolean z) {
        this.required = z;
    }
}
