package com.ss.android.ugc.aweme.experiment;

import X.C09CT;
import X.C13BV;
import com.bytedance.ies.abmock.SettingsManager;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes25.dex */
public final class PaidContentAnchorInAppSetting {
    public static final IAPKeys LIZ = new IAPKeys(C13BV.INSTANCE);

    public static IAPKeys LIZ() {
        SettingsManager settingsManagerLIZLLL = SettingsManager.LIZLLL();
        IAPKeys iAPKeys = LIZ;
        IAPKeys iAPKeys2 = (IAPKeys) settingsManagerLIZLLL.LJIIIIZZ("paid_content", IAPKeys.class, iAPKeys);
        return iAPKeys2 != null ? iAPKeys2 : iAPKeys;
    }

    public static final class IAPKeys {

        @C09CT("iap_id_google")
        public final List<String> iAPIDs;

        public IAPKeys() {
            this(null, 1, null);
        }

        public IAPKeys(List<String> list) {
            this.iAPIDs = list;
        }

        public IAPKeys(List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? C13BV.INSTANCE : list);
        }
    }
}
