package com.ss.ugc.clientai.core.api.meta;

import X.C09CT;
import X.C15438062q;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes14.dex */
public final class FeatureGroup implements Serializable {

    @C09CT("features")
    public List<FeatureItem> features;

    @C09CT("group")
    public String groupName;

    @C09CT("op_type")
    public int opType;

    @C09CT("params")
    public String params;

    @C09CT("source_type")
    public int sourceType;

    @C09CT("trans")
    public String trans;

    public FeatureGroup() {
        this(null, null, 0, 0, null, null);
    }

    public final FeatureGroup copy(String str, List<FeatureItem> list, int i, int i2, String str2, String str3) {
        return new FeatureGroup(str, list, i, i2, str2, str3);
    }

    public int hashCode() {
        String str = this.groupName;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        List<FeatureItem> list = this.features;
        int iHashCode2 = (((((iHashCode + (list == null ? 0 : list.hashCode())) * 31) + this.opType) * 31) + this.sourceType) * 31;
        String str2 = this.params;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.trans;
        return iHashCode3 + (str3 != null ? str3.hashCode() : 0);
    }

    public final FeatureGroup copy() {
        ArrayList arrayList;
        String str = this.groupName;
        List<FeatureItem> list = this.features;
        if (list != null) {
            arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
            for (FeatureItem featureItem : list) {
                arrayList.add(featureItem.copy(featureItem.name, featureItem.params, featureItem.trans, featureItem.returnCode, featureItem.ttmType, featureItem.rule, featureItem.sceneKeys));
            }
        } else {
            arrayList = null;
        }
        return new FeatureGroup(str, arrayList, this.opType, this.sourceType, this.params, this.trans);
    }

    public final void setFeatures(List<FeatureItem> list) {
        this.features = list;
    }

    public final void setGroupName(String str) {
        this.groupName = str;
    }

    public final void setOpType(int i) {
        this.opType = i;
    }

    public final void setParams(String str) {
        this.params = str;
    }

    public final void setSourceType(int i) {
        this.sourceType = i;
    }

    public final void setTrans(String str) {
        this.trans = str;
    }

    public FeatureGroup(String str, List<FeatureItem> list, int i, int i2, String str2, String str3) {
        this.groupName = str;
        this.features = list;
        this.opType = i;
        this.sourceType = i2;
        this.params = str2;
        this.trans = str3;
    }
}
