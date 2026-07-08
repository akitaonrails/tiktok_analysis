package com.ss.android.ugc.aweme.series.feed.tab.common.ab;

import X.C01GW;
import X.C09CT;
import X.C452501pT;
import kotlin.jvm.internal.AFwS190S0000000_4;

/* JADX INFO: loaded from: classes5.dex */
public final class SeriesFeedTabConfig {
    public static final SeriesFeedTabConfig LIZ = new SeriesFeedTabConfig();
    public static final ConfigModel LIZIZ = new ConfigModel();
    public static final C01GW LIZJ = C452501pT.LIZIZ(AFwS190S0000000_4.get$arr$(1849));

    public static final class ConfigModel {

        @C09CT("need_client_visible_verify")
        public Boolean needClientVisibleVerify;

        @C09CT("tab_enable")
        public Boolean tabEnable;

        @C09CT("use_skylight_shader_bg")
        public Boolean useSkylightShaderBg;

        public ConfigModel() {
            Boolean bool = Boolean.TRUE;
            this.tabEnable = bool;
            this.useSkylightShaderBg = bool;
            this.needClientVisibleVerify = Boolean.FALSE;
        }

        public final Boolean getNeedClientVisibleVerify() {
            return this.needClientVisibleVerify;
        }

        public final Boolean getTabEnable() {
            return this.tabEnable;
        }

        public final Boolean getUseSkylightShaderBg() {
            return this.useSkylightShaderBg;
        }

        public final void setNeedClientVisibleVerify(Boolean bool) {
            this.needClientVisibleVerify = bool;
        }

        public final void setTabEnable(Boolean bool) {
            this.tabEnable = bool;
        }

        public final void setUseSkylightShaderBg(Boolean bool) {
            this.useSkylightShaderBg = bool;
        }
    }
}
