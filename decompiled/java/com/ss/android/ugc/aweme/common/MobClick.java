package com.ss.android.ugc.aweme.common;

import X.C1085640eME;
import X.C2188811AlT;
import android.text.TextUtils;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes32.dex */
public class MobClick {
    public static final C1085640eME<MobClick> pool = new C1085640eME<>(5);
    public String category;
    public String eventName;
    public JSONObject ext_json;
    public long ext_value_long;
    public String ext_value_str;
    public String labelName;
    public String value;

    public void clearState() {
        this.eventName = null;
        this.labelName = null;
        this.value = null;
        this.ext_value_str = null;
        this.ext_value_long = 0L;
        this.category = null;
        this.ext_json = null;
    }

    public static MobClick obtain() {
        MobClick mobClickLIZIZ = pool.LIZIZ();
        return mobClickLIZIZ == null ? new MobClick() : mobClickLIZIZ;
    }

    public String getValue() {
        if (TextUtils.isEmpty(this.value)) {
            this.value = CardStruct.IStatusCode.DEFAULT;
        }
        return this.value;
    }

    public void recycle() {
        clearState();
        pool.LIZ(this);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MobClick{eventName='");
        sbLIZ.append(this.eventName);
        sbLIZ.append('\'');
        sbLIZ.append(", labelName='");
        sbLIZ.append(this.labelName);
        sbLIZ.append('\'');
        sbLIZ.append(", value='");
        sbLIZ.append(this.value);
        sbLIZ.append('\'');
        sbLIZ.append(", ext_value_str='");
        sbLIZ.append(this.ext_value_str);
        sbLIZ.append('\'');
        sbLIZ.append(", ext_value_long=");
        sbLIZ.append(this.ext_value_long);
        sbLIZ.append(", category='");
        sbLIZ.append(this.category);
        sbLIZ.append('\'');
        sbLIZ.append(", ext_json=");
        sbLIZ.append(this.ext_json);
        sbLIZ.append('}');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public String getCategory() {
        return this.category;
    }

    public String getEventName() {
        return this.eventName;
    }

    public JSONObject getExtJson() {
        return this.ext_json;
    }

    public long getExtValueLong() {
        return this.ext_value_long;
    }

    public String getExtValueStr() {
        return this.ext_value_str;
    }

    public String getLabelName() {
        return this.labelName;
    }

    public MobClick setCategory(String str) {
        this.category = str;
        return this;
    }

    public MobClick setEventName(String str) {
        this.eventName = str;
        return this;
    }

    public MobClick setExtValueLong(long j) {
        this.ext_value_long = j;
        return this;
    }

    public MobClick setExtValueString(String str) {
        this.ext_value_str = str;
        return this;
    }

    public MobClick setJsonObject(JSONObject jSONObject) {
        this.ext_json = jSONObject;
        return this;
    }

    public MobClick setLabelName(String str) {
        this.labelName = str;
        return this;
    }

    public MobClick setValue(String str) {
        this.value = str;
        return this;
    }
}
