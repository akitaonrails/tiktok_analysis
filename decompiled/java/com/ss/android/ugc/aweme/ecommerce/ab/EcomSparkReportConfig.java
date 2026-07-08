package com.ss.android.ugc.aweme.ecommerce.ab;

import X.C09CT;
import X.C13BV;
import X.C15438062q;
import X.C2097908Jt;
import X.C2188811AlT;
import com.bytedance.ies.abmock.SettingsManager;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes21.dex */
public final class EcomSparkReportConfig {
    public static final EcomSparkReportConfigData LIZ;
    public static final Map<String, String> LIZIZ;
    public static final Map<String, EcomSparkReportConfigModel> LIZJ;

    public static final class EcomSparkReportConfigModel {

        @C09CT("channel")
        public String channel;

        @C09CT("page_name")
        public String pageName;

        @C09CT("sub_page_name")
        public String subPageName;

        @C09CT("sub_param")
        public String subParam;

        @C09CT("sub_value")
        public String subValue;

        public EcomSparkReportConfigModel() {
            this("", "", "", "", "");
        }

        public EcomSparkReportConfigModel(String str, String str2, String str3, String str4, String str5) {
            this.channel = str;
            this.pageName = str2;
            this.subParam = str3;
            this.subValue = str4;
            this.subPageName = str5;
        }
    }

    static {
        EcomSparkReportConfigData ecomSparkReportConfigData = new EcomSparkReportConfigData(null, 1, null);
        EcomSparkReportConfigData ecomSparkReportConfigData2 = (EcomSparkReportConfigData) SettingsManager.LIZLLL().LJIIIIZZ("ecom_spark_report_config", EcomSparkReportConfigData.class, ecomSparkReportConfigData);
        if (ecomSparkReportConfigData2 != null) {
            ecomSparkReportConfigData = ecomSparkReportConfigData2;
        }
        LIZ = ecomSparkReportConfigData;
        List<EcomSparkReportConfigModel> list = ecomSparkReportConfigData.data;
        int iLIZIZ = C2097908Jt.LIZIZ(C15438062q.LJIJJ(list, 10));
        if (iLIZIZ < 16) {
            iLIZIZ = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iLIZIZ);
        for (EcomSparkReportConfigModel ecomSparkReportConfigModel : list) {
            Pair pair = new Pair(ecomSparkReportConfigModel.channel, ecomSparkReportConfigModel.pageName);
            linkedHashMap.put(pair.getFirst(), pair.getSecond());
        }
        LIZIZ = linkedHashMap;
        List<EcomSparkReportConfigModel> list2 = LIZ.data;
        int iLIZIZ2 = C2097908Jt.LIZIZ(C15438062q.LJIJJ(list2, 10));
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(iLIZIZ2 >= 16 ? iLIZIZ2 : 16);
        for (EcomSparkReportConfigModel ecomSparkReportConfigModel2 : list2) {
            EcomSparkReportConfigModel ecomSparkReportConfigModel3 = ecomSparkReportConfigModel2;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(ecomSparkReportConfigModel3.channel);
            sbLIZ.append('_');
            sbLIZ.append(ecomSparkReportConfigModel3.subParam);
            sbLIZ.append('_');
            sbLIZ.append(ecomSparkReportConfigModel3.subValue);
            linkedHashMap2.put(C2188811AlT.LIZIZ(sbLIZ), ecomSparkReportConfigModel2);
        }
        LIZJ = linkedHashMap2;
    }

    public static final class EcomSparkReportConfigData {

        @C09CT("data")
        public List<EcomSparkReportConfigModel> data;

        public EcomSparkReportConfigData() {
            this(null, 1, null);
        }

        public EcomSparkReportConfigData(List<EcomSparkReportConfigModel> list) {
            this.data = list;
        }

        public EcomSparkReportConfigData(List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? C13BV.INSTANCE : list);
        }
    }
}
