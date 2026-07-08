package com.ss.android.ugc.aweme.screenshot.configuration;

import com.ss.android.ugc.aweme.feedback.IScreenShotFeedbackService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.share.base.model.BaseSharePackage;
import com.ss.android.ugc.aweme.share.config.TTCustomSharePanelBarProtocol;
import com.ss.android.ugc.aweme.share.config.TTShareDefaultConfig;
import com.ss.android.ugc.aweme.share.config.TTShareTitleProtocol;
import com.ss.android.ugc.aweme.share.core.protocol.ShareTitleProtocol;
import com.ss.android.ugc.aweme.sharer.model.SharePackage;
import com.ss.android.ugc.aweme.sharer.protocol.CustomSharePanelBarProtocol;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes22.dex */
public abstract class ScreenShotShareConfiguration<T extends SharePackage> extends TTShareDefaultConfig<SharePackage> {
    @Override // com.ss.android.ugc.aweme.share.config.TTShareDefaultConfig, com.ss.android.ugc.aweme.share.core.protocol.ShareConfiguration
    public CustomSharePanelBarProtocol LIZ(BaseSharePackage baseSharePackage) {
        return new TTCustomSharePanelBarProtocol() { // from class: com.ss.android.ugc.aweme.screenshot.configuration.ScreenShotShareConfiguration$getCustomSharePanelBar$1
            @Override // com.ss.android.ugc.aweme.share.config.TTCustomSharePanelBarProtocol, com.ss.android.ugc.aweme.sharer.protocol.CustomSharePanelBarProtocol
            public final boolean PK1() {
                return true;
            }
        };
    }

    @Override // com.ss.android.ugc.aweme.share.config.TTShareDefaultConfig, com.ss.android.ugc.aweme.share.core.protocol.ShareConfiguration
    public final ShareTitleProtocol LJFF(BaseSharePackage baseSharePackage) {
        return new TTShareTitleProtocol() { // from class: com.ss.android.ugc.aweme.screenshot.configuration.ScreenShotShareConfiguration$getShareTitleProtocol$1
            public final int LL;

            {
                this.LL = ((IScreenShotFeedbackService) ServiceManager.get().getService(IScreenShotFeedbackService.class)).isFeedbackEnable(false) ? 2131827349 : R.string.tba;
            }

            @Override // com.ss.android.ugc.aweme.share.config.TTShareTitleProtocol, com.ss.android.ugc.aweme.share.core.protocol.ShareTitleProtocol
            public final int getShareTitle() {
                return this.LL;
            }
        };
    }
}
