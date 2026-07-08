package com.ss.android.ugc.aweme.hybridkit.experiment;

import X.C09CT;
import X.C13BV;
import X.EnumC1536200q4w;
import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.spark.ISparkHostApi;
import com.ss.android.ugc.aweme.spark.SparkHostApiImpl;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes17.dex */
public final class EnableGlobalpropsDesensitizationSettings {
    public static final EnableGlobalpropsDesensitizationSettings LIZ = new EnableGlobalpropsDesensitizationSettings();
    public static final EnableGlobalpropsDesensitizationModel LIZIZ = new EnableGlobalpropsDesensitizationModel(new ArrayList(), false, new ArrayList());

    public static final List<String> LIZ(String str) {
        SettingsManager settingsManagerLIZLLL = SettingsManager.LIZLLL();
        EnableGlobalpropsDesensitizationModel enableGlobalpropsDesensitizationModel = LIZIZ;
        EnableGlobalpropsDesensitizationModel enableGlobalpropsDesensitizationModel2 = (EnableGlobalpropsDesensitizationModel) settingsManagerLIZLLL.LJIIIIZZ("enable_globalprops_desensitization", EnableGlobalpropsDesensitizationModel.class, enableGlobalpropsDesensitizationModel);
        if (enableGlobalpropsDesensitizationModel2 != null) {
            enableGlobalpropsDesensitizationModel = enableGlobalpropsDesensitizationModel2;
        }
        ArrayList arrayList = new ArrayList();
        if (LIZIZ(str)) {
            Collection collection = enableGlobalpropsDesensitizationModel.removeKeys;
            if (collection == null) {
                collection = C13BV.INSTANCE;
            }
            arrayList.addAll(collection);
        }
        return arrayList;
    }

    public static final boolean LIZIZ(String str) {
        boolean z;
        SparkHostApiImpl sparkHostApiImplLLIIJI;
        SettingsManager settingsManagerLIZLLL = SettingsManager.LIZLLL();
        EnableGlobalpropsDesensitizationModel enableGlobalpropsDesensitizationModel = LIZIZ;
        EnableGlobalpropsDesensitizationModel enableGlobalpropsDesensitizationModel2 = (EnableGlobalpropsDesensitizationModel) settingsManagerLIZLLL.LJIIIIZZ("enable_globalprops_desensitization", EnableGlobalpropsDesensitizationModel.class, enableGlobalpropsDesensitizationModel);
        if (enableGlobalpropsDesensitizationModel2 != null) {
            enableGlobalpropsDesensitizationModel = enableGlobalpropsDesensitizationModel2;
        }
        List<String> list = enableGlobalpropsDesensitizationModel.denyList;
        boolean z2 = false;
        if (list != null) {
            z = false;
            for (String str2 : list) {
                if (str != null && a0.LJJIIZI(str, str2, false)) {
                    z = true;
                }
            }
        } else {
            z = false;
        }
        if (!enableGlobalpropsDesensitizationModel.enable) {
            return false;
        }
        ISparkHostApi iSparkHostApi = (ISparkHostApi) PluggableExtentionKt.pluggableSpi$default(ISparkHostApi.class, false, false, false, 14, null);
        if (iSparkHostApi != null && (sparkHostApiImplLLIIJI = iSparkHostApi.LLIIJI()) != null) {
            if (str == null) {
                str = "";
            }
            if (sparkHostApiImplLLIIJI.LLJZIJLIL(str, EnumC1536200q4w.ISOLATED_WEBVIEW)) {
                z2 = true;
            }
        }
        return z2 & (!z);
    }

    public static final class EnableGlobalpropsDesensitizationModel {

        @C09CT("denyList")
        public final List<String> denyList;

        @C09CT("enable")
        public final boolean enable;

        @C09CT("removeKeys")
        public final List<String> removeKeys;

        public EnableGlobalpropsDesensitizationModel(List<String> list, boolean z, List<String> list2) {
            this.denyList = list;
            this.enable = z;
            this.removeKeys = list2;
        }
    }
}
