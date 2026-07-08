package com.ss.android.ugc.aweme.ml.infra;

import X.C09CT;
import android.text.TextUtils;
import java.util.List;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes24.dex */
public class FeatureTypeConfig {

    @C09CT("aweme_sub_type")
    public String awemeSubType;

    @C09CT("enable")
    public boolean enable;

    @C09CT("range")
    public int range;

    @C09CT("exclude_this")
    public boolean rangeExcludeThis;

    @C09CT("sub_type")
    public String subType = "all";
    public List<String> subTypeList;

    public final List<String> getSubTypeList() {
        if (this.subTypeList == null) {
            this.subTypeList = a0.LJJLIIIJILLIZJL(this.subType, new String[]{"|"}, 0, 6);
        }
        return this.subTypeList;
    }

    public String toString() {
        return super.toString();
    }

    public final String getAwemeSubType() {
        return this.awemeSubType;
    }

    public final boolean getEnable() {
        return this.enable;
    }

    public final int getRange() {
        return this.range;
    }

    public final boolean getRangeExcludeThis() {
        return this.rangeExcludeThis;
    }

    public final String getSubType() {
        return this.subType;
    }

    public final boolean containSubType(String str) {
        return containSubType(str, false);
    }

    public final void setAwemeSubType(String str) {
        this.awemeSubType = str;
    }

    public final void setEnable(boolean z) {
        this.enable = z;
    }

    public final void setRange(int i) {
        this.range = i;
    }

    public final void setRangeExcludeThis(boolean z) {
        this.rangeExcludeThis = z;
    }

    public final void setSubType(String str) {
        this.subType = str;
    }

    public final boolean containSubType(String str, boolean z) {
        List<String> subTypeList;
        if (TextUtils.isEmpty(this.subType) || (subTypeList = getSubTypeList()) == null) {
            return false;
        }
        if ((z || !subTypeList.contains("all")) && !subTypeList.contains(str)) {
            return false;
        }
        return true;
    }
}
