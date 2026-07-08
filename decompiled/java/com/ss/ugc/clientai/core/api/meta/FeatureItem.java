package com.ss.ugc.clientai.core.api.meta;

import X.C09CT;
import com.ss.ugc.clientai.core.api.meta.ttm.rule.TTMFeatureRule;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes14.dex */
public final class FeatureItem implements Serializable {

    @C09CT("name")
    public String name;

    @C09CT("params")
    public String params;

    @C09CT("returnCode")
    public ReturnCode returnCode;

    @C09CT("rule")
    public TTMFeatureRule rule;

    @C09CT("scene_keys")
    public List<String> sceneKeys;

    @C09CT("trans")
    public String trans;

    @C09CT("ttm_type")
    public int ttmType;

    public FeatureItem() {
        this(null, null, null, null, -1, null, new ArrayList());
    }

    public final FeatureItem copy(String str, String str2, String str3, ReturnCode returnCode, int i, TTMFeatureRule tTMFeatureRule, List<String> list) {
        return new FeatureItem(str, str2, str3, returnCode, i, tTMFeatureRule, list);
    }

    public int hashCode() {
        String str = this.name;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.params;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.trans;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        ReturnCode returnCode = this.returnCode;
        int iHashCode4 = (((iHashCode3 + (returnCode == null ? 0 : returnCode.hashCode())) * 31) + this.ttmType) * 31;
        TTMFeatureRule tTMFeatureRule = this.rule;
        return ((iHashCode4 + (tTMFeatureRule != null ? tTMFeatureRule.hashCode() : 0)) * 31) + this.sceneKeys.hashCode();
    }

    public final void setName(String str) {
        this.name = str;
    }

    public final void setParams(String str) {
        this.params = str;
    }

    public final void setReturnCode(ReturnCode returnCode) {
        this.returnCode = returnCode;
    }

    public final void setRule(TTMFeatureRule tTMFeatureRule) {
        this.rule = tTMFeatureRule;
    }

    public final void setSceneKeys(List<String> list) {
        this.sceneKeys = list;
    }

    public final void setTrans(String str) {
        this.trans = str;
    }

    public final void setTtmType(int i) {
        this.ttmType = i;
    }

    public FeatureItem(String str, String str2, String str3, ReturnCode returnCode, int i, TTMFeatureRule tTMFeatureRule, List<String> list) {
        this.name = str;
        this.params = str2;
        this.trans = str3;
        this.returnCode = returnCode;
        this.ttmType = i;
        this.rule = tTMFeatureRule;
        this.sceneKeys = list;
    }
}
