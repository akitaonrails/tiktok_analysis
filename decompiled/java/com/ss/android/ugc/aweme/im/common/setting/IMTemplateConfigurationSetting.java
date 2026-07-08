package com.ss.android.ugc.aweme.im.common.setting;

import X.C09CT;
import com.bytedance.ies.abmock.SettingsManager;

/* JADX INFO: loaded from: classes15.dex */
public final class IMTemplateConfigurationSetting {
    public static final TemplateConfigurationModel LIZ;

    public static final class TemplateConfigurationModel {

        @C09CT("playlist_template_enabled")
        public final boolean isPlaylistTemplateEnabled;

        @C09CT("message_refresh_enabled")
        public final boolean isRefreshEnabled;

        @C09CT("refresh_interval_ms")
        public final long refreshInterval;

        @C09CT("refresh_page_size")
        public final int refreshPageSize;

        public TemplateConfigurationModel() {
            this(true, true, 25, 1000L);
        }

        public TemplateConfigurationModel(boolean z, boolean z2, int i, long j) {
            this.isPlaylistTemplateEnabled = z;
            this.isRefreshEnabled = z2;
            this.refreshPageSize = i;
            this.refreshInterval = j;
        }
    }

    static {
        TemplateConfigurationModel templateConfigurationModel = new TemplateConfigurationModel(true, true, 25, 1000L);
        TemplateConfigurationModel templateConfigurationModel2 = (TemplateConfigurationModel) SettingsManager.LIZLLL().LJIIIIZZ("tt_im_message_template_config", TemplateConfigurationModel.class, templateConfigurationModel);
        if (templateConfigurationModel2 != null) {
            templateConfigurationModel = templateConfigurationModel2;
        }
        LIZ = templateConfigurationModel;
    }
}
