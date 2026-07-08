package com.ss.android.ugc.aweme.hybridkit.experiment;

import X.C08CX;
import X.C09CT;
import X.C0C64;
import java.util.Set;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes24.dex */
public final class SparkI18nxGlobalConfig {
    public static final SparkI18nxGlobalConfigModel LIZ = new SparkI18nxGlobalConfigModel(false, 0, false, null, 15, null);

    public static final SparkI18nxGlobalConfigModel LIZ() {
        C0C64 c0c64LJIILLIIL = C0C64.LJIILLIIL();
        SparkI18nxGlobalConfigModel sparkI18nxGlobalConfigModel = LIZ;
        SparkI18nxGlobalConfigModel sparkI18nxGlobalConfigModel2 = (SparkI18nxGlobalConfigModel) c0c64LJIILLIIL.LJJIIJ(true, "spark_i18nx_global_config", 31744, SparkI18nxGlobalConfigModel.class, sparkI18nxGlobalConfigModel, 2);
        return sparkI18nxGlobalConfigModel2 != null ? sparkI18nxGlobalConfigModel2 : sparkI18nxGlobalConfigModel;
    }

    public static final class SparkI18nxGlobalConfigModel {

        @C09CT("cache_limit")
        public final int cacheLimit;

        @C09CT("channels")
        public final Set<String> channels;

        @C09CT("enable")
        public final boolean enable;

        @C09CT("enable_channels_control")
        public final boolean enableChannelsControl;

        public SparkI18nxGlobalConfigModel() {
            this(false, 0, false, null, 15, null);
        }

        public SparkI18nxGlobalConfigModel(boolean z, int i, boolean z2, Set<String> set) {
            this.enable = z;
            this.cacheLimit = i;
            this.enableChannelsControl = z2;
            this.channels = set;
        }

        public SparkI18nxGlobalConfigModel(boolean z, int i, boolean z2, Set set, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this((i2 & 1) != 0 ? false : z, (i2 & 2) != 0 ? 0 : i, (i2 & 4) != 0 ? false : z2, (i2 & 8) != 0 ? C08CX.INSTANCE : set);
        }
    }
}
