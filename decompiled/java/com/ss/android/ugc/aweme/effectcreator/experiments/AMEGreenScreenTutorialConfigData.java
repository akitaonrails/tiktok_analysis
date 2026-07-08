package com.ss.android.ugc.aweme.effectcreator.experiments;

import X.C09CT;
import X.C13BV;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes.dex */
public final class AMEGreenScreenTutorialConfigData implements Serializable {

    @C09CT("ame_greenscreen_tutorial_container")
    public final String container;

    @C09CT("ame_greenscreen_tutorial_container_parameters")
    public final String containerParameters;

    @C09CT("ame_greenscreen_tutorial_enable")
    public final boolean enable;

    @C09CT("prefetch_resource_config")
    public final List<PrefetchResourceConfig> prefetchConfigList;

    @C09CT("ame_greenscreen_tutorial_url")
    public final String url;

    @C09CT("ame_greenscreen_tutorial_version")
    public final int version;

    public static final class PrefetchResourceConfig implements Serializable {

        @C09CT("type")
        public final String type;

        @C09CT("url")
        public final String url;

        public PrefetchResourceConfig() {
            this("", "");
        }

        public PrefetchResourceConfig(String str, String str2) {
            this.type = str;
            this.url = str2;
        }
    }

    public AMEGreenScreenTutorialConfigData() {
        this(false, null, null, null, 0, null, 63, null);
    }

    public AMEGreenScreenTutorialConfigData(boolean z, String str, String str2, String str3, int i, List<PrefetchResourceConfig> list) {
        this.enable = z;
        this.container = str;
        this.url = str2;
        this.containerParameters = str3;
        this.version = i;
        this.prefetchConfigList = list;
    }

    public AMEGreenScreenTutorialConfigData(boolean z, String str, String str2, String str3, int i, List list, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? false : z, (i2 & 2) != 0 ? "" : str, (i2 & 4) != 0 ? "" : str2, (i2 & 8) == 0 ? str3 : "", (i2 & 16) == 0 ? i : 0, (i2 & 32) != 0 ? C13BV.INSTANCE : list);
    }
}
