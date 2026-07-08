package com.ss.android.ugc.aweme.hybridkit.ttopruntime.experiment;

import X.C09CT;
import com.bytedance.ies.abmock.SettingsManager;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes14.dex */
public final class TTOPSparkRuntimeConfigSettings {
    public static final TTOPSPARKRUNTIMECONFIGModel LIZ = new TTOPSPARKRUNTIMECONFIGModel(new ArrayList(), new ArrayList(), new ArrayList());

    public static final class TTOPSPARKRUNTIMECONFIGModel {

        @C09CT("ttopAllowList")
        public final ArrayList<String> ttopAllowList;

        @C09CT("ttopGPKeys")
        public final ArrayList<String> ttopGPKeys;

        @C09CT("ttopJSBList")
        public final ArrayList<String> ttopJSBList;

        public TTOPSPARKRUNTIMECONFIGModel() {
            this(new ArrayList(), new ArrayList(), new ArrayList());
        }

        public TTOPSPARKRUNTIMECONFIGModel(ArrayList<String> arrayList, ArrayList<String> arrayList2, ArrayList<String> arrayList3) {
            this.ttopAllowList = arrayList;
            this.ttopGPKeys = arrayList2;
            this.ttopJSBList = arrayList3;
        }
    }

    public static final TTOPSPARKRUNTIMECONFIGModel LIZ() {
        SettingsManager settingsManagerLIZLLL = SettingsManager.LIZLLL();
        TTOPSPARKRUNTIMECONFIGModel tTOPSPARKRUNTIMECONFIGModel = LIZ;
        TTOPSPARKRUNTIMECONFIGModel tTOPSPARKRUNTIMECONFIGModel2 = (TTOPSPARKRUNTIMECONFIGModel) settingsManagerLIZLLL.LJIIIIZZ("TTOP_SPARK_RUNTIME_CONFIG", TTOPSPARKRUNTIMECONFIGModel.class, tTOPSPARKRUNTIMECONFIGModel);
        return tTOPSPARKRUNTIMECONFIGModel2 != null ? tTOPSPARKRUNTIMECONFIGModel2 : tTOPSPARKRUNTIMECONFIGModel;
    }
}
