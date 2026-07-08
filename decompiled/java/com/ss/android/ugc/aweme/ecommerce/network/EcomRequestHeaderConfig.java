package com.ss.android.ugc.aweme.ecommerce.network;

import X.C09CT;
import X.C0C64;
import X.C1507490pKd;
import X.C15438062q;
import X.C2097908Jt;
import X.C2188811AlT;
import com.google.gson.k;
import com.google.gson.q;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes24.dex */
public final class EcomRequestHeaderConfig {
    public static final EcomRequestHeaderConfigModel[] LIZ;
    public static final Map<String, EcomRequestHeaderConfigModel> LIZIZ;
    public static final Map<String, EcomRequestHeaderConfigModel> LIZJ;

    static {
        EcomRequestHeaderConfigModel[] ecomRequestHeaderConfigModelArr = new EcomRequestHeaderConfigModel[0];
        EcomRequestHeaderConfigModel[] ecomRequestHeaderConfigModelArr2 = (EcomRequestHeaderConfigModel[]) C0C64.LJIILLIIL().LJJII(EcomRequestHeaderConfigModel[].class, ecomRequestHeaderConfigModelArr, "ecom_request_header_config", true);
        if (ecomRequestHeaderConfigModelArr2 != null) {
            ecomRequestHeaderConfigModelArr = ecomRequestHeaderConfigModelArr2;
        }
        LIZ = ecomRequestHeaderConfigModelArr;
        ArrayList arrayList = new ArrayList();
        for (EcomRequestHeaderConfigModel ecomRequestHeaderConfigModel : ecomRequestHeaderConfigModelArr) {
            String str = ecomRequestHeaderConfigModel.host;
            if (str != null && str.length() != 0) {
                arrayList.add(ecomRequestHeaderConfigModel);
            }
        }
        int iLIZIZ = C2097908Jt.LIZIZ(C15438062q.LJIJJ(arrayList, 10));
        if (iLIZIZ < 16) {
            iLIZIZ = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iLIZIZ);
        for (Object obj : arrayList) {
            linkedHashMap.put(((EcomRequestHeaderConfigModel) obj).host, obj);
        }
        LIZIZ = linkedHashMap;
        EcomRequestHeaderConfigModel[] ecomRequestHeaderConfigModelArr3 = LIZ;
        ArrayList arrayList2 = new ArrayList();
        for (EcomRequestHeaderConfigModel ecomRequestHeaderConfigModel2 : ecomRequestHeaderConfigModelArr3) {
            String str2 = ecomRequestHeaderConfigModel2.path;
            if (str2 != null && str2.length() != 0) {
                arrayList2.add(ecomRequestHeaderConfigModel2);
            }
        }
        int iLIZIZ2 = C2097908Jt.LIZIZ(C15438062q.LJIJJ(arrayList2, 10));
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(iLIZIZ2 >= 16 ? iLIZIZ2 : 16);
        for (Object obj2 : arrayList2) {
            linkedHashMap2.put(((EcomRequestHeaderConfigModel) obj2).path, obj2);
        }
        LIZJ = linkedHashMap2;
    }

    public static boolean LIZIZ(C1507490pKd c1507490pKd) {
        if (c1507490pKd.LIZ.length() > 0 && c1507490pKd.LIZIZ.length() > 0) {
            return true;
        }
        return false;
    }

    /* JADX INFO: loaded from: classes.dex */
    public static final class HeaderConfig {

        @C09CT("name")
        public final String name;

        @C09CT("value")
        public final k value;

        public HeaderConfig() {
            this(null, null);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof HeaderConfig)) {
                return false;
            }
            HeaderConfig headerConfig = (HeaderConfig) obj;
            return Intrinsics.LJFF(this.name, headerConfig.name) && Intrinsics.LJFF(this.value, headerConfig.value);
        }

        public final int hashCode() {
            String str = this.name;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            k kVar = this.value;
            return iHashCode + (kVar != null ? kVar.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("HeaderConfig(name=");
            sbLIZ.append(this.name);
            sbLIZ.append(", value=");
            sbLIZ.append(this.value);
            sbLIZ.append(')');
            return C2188811AlT.LIZIZ(sbLIZ);
        }

        public HeaderConfig(String str, k kVar) {
            this.name = str;
            this.value = kVar;
        }
    }

    public static void LIZ(EcomRequestHeaderConfigModel ecomRequestHeaderConfigModel, List list) {
        String string;
        List<String> list2 = ecomRequestHeaderConfigModel.headers;
        if (list2 != null) {
            for (String str : list2) {
                int iLJJJ = a0.LJJJ(str, ":", 0, false, 6);
                if (iLJJJ > 0 && iLJJJ != a0.LJJIJL(str)) {
                    C1507490pKd c1507490pKd = new C1507490pKd(str.substring(0, iLJJJ), str.substring(iLJJJ + 1));
                    if (LIZIZ(c1507490pKd)) {
                        ((ArrayList) list).add(c1507490pKd);
                    }
                }
            }
        }
        List<HeaderConfig> list3 = ecomRequestHeaderConfigModel.headerConfigs;
        if (list3 != null) {
            for (HeaderConfig headerConfig : list3) {
                k kVar = headerConfig.value;
                if (kVar != null) {
                    if ((kVar instanceof q) && (kVar.LJIILJJIL().LL instanceof String)) {
                        string = kVar.LJIL();
                    } else {
                        string = kVar.toString();
                    }
                } else {
                    string = null;
                }
                String str2 = headerConfig.name;
                if (str2 == null) {
                    str2 = "";
                }
                if (string == null) {
                    string = "";
                }
                C1507490pKd c1507490pKd2 = new C1507490pKd(str2, string);
                if (LIZIZ(c1507490pKd2)) {
                    ((ArrayList) list).add(c1507490pKd2);
                }
            }
        }
    }

    public static final class EcomRequestHeaderConfigModel {

        @C09CT("header_configs")
        public final List<HeaderConfig> headerConfigs;

        @C09CT("headers")
        public final List<String> headers;

        @C09CT("host")
        public final String host;

        @C09CT("path")
        public final String path;

        public EcomRequestHeaderConfigModel() {
            this(null, null, null, null);
        }

        public EcomRequestHeaderConfigModel(String str, String str2, List<String> list, List<HeaderConfig> list2) {
            this.host = str;
            this.path = str2;
            this.headers = list;
            this.headerConfigs = list2;
        }
    }
}
