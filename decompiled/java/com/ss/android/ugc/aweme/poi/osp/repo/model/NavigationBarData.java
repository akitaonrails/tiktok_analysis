package com.ss.android.ugc.aweme.poi.osp.repo.model;

import X.C09CT;
import X.C1201190hMb;
import X.C13LP;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.app.api.RequestLog;
import com.ss.android.ugc.aweme.slash.component.BaseComponentData;
import java.io.Serializable;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class NavigationBarData extends BaseComponentData implements Serializable {

    @C09CT("product_atmosphere_list")
    public final List<ProductAtmosphere> productAtmosphereList;

    @C09CT("title")
    public final String title;

    public NavigationBarData() {
        this(null, null);
    }

    public final NavigationBarData copy(String str, List<ProductAtmosphere> list) {
        return new NavigationBarData(str, list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NavigationBarData)) {
            return false;
        }
        NavigationBarData navigationBarData = (NavigationBarData) obj;
        return Intrinsics.LJFF(this.title, navigationBarData.title) && Intrinsics.LJFF(this.productAtmosphereList, navigationBarData.productAtmosphereList);
    }

    @Override // com.ss.android.ugc.aweme.slash.component.BaseComponentData, X.InterfaceC1201180hMa
    public /* bridge */ /* synthetic */ RequestLog getRequestLog() {
        return C1201190hMb.LIZ(this);
    }

    public int hashCode() {
        String str = this.title;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        List<ProductAtmosphere> list = this.productAtmosphereList;
        return iHashCode + (list != null ? list.hashCode() : 0);
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("NavigationBarData(title=");
        sbLIZ.append(this.title);
        sbLIZ.append(", productAtmosphereList=");
        sbLIZ.append(this.productAtmosphereList);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final String getMobAtmosphereTagIds() {
        String string;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        List<ProductAtmosphere> list = this.productAtmosphereList;
        if (list != null) {
            Iterator<ProductAtmosphere> it2 = list.iterator();
            while (it2.hasNext()) {
                List<ProductAtmosphereExpression> list2 = it2.next().atmosphereExpressionList;
                if (list2 != null) {
                    Iterator<ProductAtmosphereExpression> it3 = list2.iterator();
                    while (it3.hasNext()) {
                        Integer num = it3.next().atmosphereType;
                        if (num != null && (string = num.toString()) != null) {
                            linkedHashSet.add(string);
                        }
                    }
                }
            }
        }
        return C13LP.LJJLIIIJ(linkedHashSet, ",", null, null, 0, null, null, 62);
    }

    public final List<ProductAtmosphere> getProductAtmosphereList() {
        return this.productAtmosphereList;
    }

    public final String getTitle() {
        return this.title;
    }

    public NavigationBarData(String str, List<ProductAtmosphere> list) {
        this.title = str;
        this.productAtmosphereList = list;
    }
}
