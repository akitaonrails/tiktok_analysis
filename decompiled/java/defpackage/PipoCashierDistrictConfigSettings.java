package defpackage;

import X.C09CT;
import com.bytedance.ies.abmock.SettingsManager;
import java.io.Serializable;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes24.dex */
public final class PipoCashierDistrictConfigSettings {
    public static final PipoCashierDistrictConfig LIZ = new PipoCashierDistrictConfig(null, null, null);

    public static final PipoCashierDistrictConfig LIZIZ() {
        SettingsManager settingsManagerLIZLLL = SettingsManager.LIZLLL();
        PipoCashierDistrictConfig pipoCashierDistrictConfig = LIZ;
        PipoCashierDistrictConfig pipoCashierDistrictConfig2 = (PipoCashierDistrictConfig) settingsManagerLIZLLL.LJIIIIZZ("pipo_cashier_district_config", PipoCashierDistrictConfig.class, pipoCashierDistrictConfig);
        return pipoCashierDistrictConfig2 != null ? pipoCashierDistrictConfig2 : pipoCashierDistrictConfig;
    }

    public static String LIZ(String str) {
        Object obj;
        String str2;
        List<PipoCashierDistrictConfigModel> list = LIZIZ().configs;
        if (list != null) {
            Iterator<PipoCashierDistrictConfigModel> it2 = list.iterator();
            while (true) {
                obj = null;
                if (!it2.hasNext()) {
                    break;
                }
                PipoCashierDistrictConfigModel next = it2.next();
                PipoCashierDistrictConfigModel pipoCashierDistrictConfigModel = next;
                if (pipoCashierDistrictConfigModel != null) {
                    obj = pipoCashierDistrictConfigModel.cashierType;
                }
                if (Intrinsics.LJFF(obj, str)) {
                    obj = next;
                    break;
                }
            }
            PipoCashierDistrictConfigModel pipoCashierDistrictConfigModel2 = (PipoCashierDistrictConfigModel) obj;
            if (pipoCashierDistrictConfigModel2 != null && (str2 = pipoCashierDistrictConfigModel2.countryCode) != null) {
                return str2;
            }
        }
        return "US";
    }

    public static final class PipoCashierDistrictConfig implements Serializable {

        @C09CT("configs")
        public final List<PipoCashierDistrictConfigModel> configs;

        @C09CT("host")
        public final String host;

        @C09CT("key")
        public final String key;

        public PipoCashierDistrictConfig(List<PipoCashierDistrictConfigModel> list, String str, String str2) {
            this.configs = list;
            this.host = str;
            this.key = str2;
        }
    }

    /* JADX INFO: loaded from: classes27.dex */
    public static final class PipoCashierDistrictConfigModel implements Serializable {

        @C09CT("cashier_type")
        public final String cashierType;

        @C09CT("country_code")
        public final String countryCode;

        @C09CT("geoname_id")
        public final String geonameId;

        @C09CT("without_next_level")
        public final String withoutNextLevel;

        public PipoCashierDistrictConfigModel(String str, String str2, String str3, String str4) {
            this.cashierType = str;
            this.countryCode = str2;
            this.geonameId = str3;
            this.withoutNextLevel = str4;
        }
    }
}
