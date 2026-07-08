package com.bytedance.ies.ugc.statisticlogger.btm;

import X.C09CT;
import X.C13BV;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes4.dex */
public final class SparkPopUpPageConfigData implements Serializable {

    @C09CT("page_btm_code")
    public final List<String> pageBtmCode;

    public SparkPopUpPageConfigData() {
        this(null, 1, null);
    }

    public SparkPopUpPageConfigData(List<String> list) {
        this.pageBtmCode = list;
    }

    public SparkPopUpPageConfigData(List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? C13BV.INSTANCE : list);
    }
}
