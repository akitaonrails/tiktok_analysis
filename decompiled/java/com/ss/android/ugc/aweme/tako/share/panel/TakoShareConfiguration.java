package com.ss.android.ugc.aweme.tako.share.panel;

import X.AbstractC1372680lpC;
import X.AbstractC1372690lpD;
import X.C1382890m5f;
import X.C13LE;
import android.content.Context;
import com.ss.android.ugc.aweme.share.base.model.BaseSharePackage;
import com.ss.android.ugc.aweme.share.config.TTCustomSharePanelBarProtocol;
import com.ss.android.ugc.aweme.share.config.TTShareDefaultConfig;
import com.ss.android.ugc.aweme.share.config.TTSharePanelLogicProtocol;
import com.ss.android.ugc.aweme.share.config.TTShareTitleProtocol;
import com.ss.android.ugc.aweme.share.config.TTSheetActionProtocol;
import com.ss.android.ugc.aweme.share.core.protocol.ShareChannelProtocol;
import com.ss.android.ugc.aweme.share.core.protocol.SharePanelLogicProtocol;
import com.ss.android.ugc.aweme.share.core.protocol.ShareTitleProtocol;
import com.ss.android.ugc.aweme.share.core.protocol.SheetActionProtocol;
import com.ss.android.ugc.aweme.sharer.protocol.CustomSharePanelBarProtocol;

/* JADX INFO: loaded from: classes22.dex */
public final class TakoShareConfiguration extends TTShareDefaultConfig<TakoSharePackage> {
    public static final C1382890m5f LLILLJJLI = new AbstractC1372690lpD(C13LE.LIZ(TakoSharePackage.class)) { // from class: X.0m5f
        public final String LIZ = "tako_share";
        public final C13IQ<? extends BaseSharePackage> LIZIZ;

        @Override // X.AbstractC1372680lpC
        public final C13IQ<? extends BaseSharePackage> LIZ() {
            return this.LIZIZ;
        }

        @Override // X.AbstractC1372680lpC
        public final String LIZIZ() {
            return this.LIZ;
        }

        {
            this.LIZIZ = c19719912Dl;
        }
    };

    @Override // com.ss.android.ugc.aweme.share.config.TTShareDefaultConfig, com.ss.android.ugc.aweme.share.core.protocol.ShareConfiguration
    public final AbstractC1372680lpC LIZLLL() {
        return LLILLJJLI;
    }

    @Override // com.ss.android.ugc.aweme.share.config.TTShareDefaultConfig, com.ss.android.ugc.aweme.share.core.protocol.ShareConfiguration
    public final CustomSharePanelBarProtocol LIZ(BaseSharePackage baseSharePackage) {
        if (baseSharePackage instanceof TakoLongImageSharePackage) {
            return new TakoLongImageCustomSharePanelBarProtocol();
        }
        if (baseSharePackage instanceof TakoBatchMessageSharePackage) {
            return new TakoBatchCustomSharePanelBarProtocol();
        }
        return new TTCustomSharePanelBarProtocol();
    }

    @Override // com.ss.android.ugc.aweme.share.config.TTShareDefaultConfig, com.ss.android.ugc.aweme.share.core.protocol.ShareConfiguration
    public final SharePanelLogicProtocol LJ(BaseSharePackage baseSharePackage) {
        if (baseSharePackage instanceof TakoImageSharePackage) {
            return new TakoImageSharePanelLogicProtocol(baseSharePackage);
        }
        if (baseSharePackage instanceof TakoVideoSharePackage) {
            return new TakoVideoSharePanelLogicProtocol(baseSharePackage);
        }
        if (baseSharePackage instanceof TakoLongImageSharePackage) {
            return new TakoLongImageSharePanelLogicProtocol(baseSharePackage);
        }
        if (baseSharePackage instanceof TakoBatchMessageSharePackage) {
            return new TakoBatchSharePanelLogicProtocol(baseSharePackage);
        }
        return new TTSharePanelLogicProtocol(baseSharePackage);
    }

    @Override // com.ss.android.ugc.aweme.share.config.TTShareDefaultConfig, com.ss.android.ugc.aweme.share.core.protocol.ShareConfiguration
    public final ShareTitleProtocol LJFF(BaseSharePackage baseSharePackage) {
        if (baseSharePackage instanceof TakoImageSharePackage) {
            return new TTShareTitleProtocol() { // from class: com.ss.android.ugc.aweme.tako.share.panel.TakoImageShareConfiguration$shareTitleProtocol$1
                @Override // com.ss.android.ugc.aweme.share.config.TTShareTitleProtocol, com.ss.android.ugc.aweme.share.core.protocol.ShareTitleProtocol
                public final int getShareTitle() {
                    return 2131822537;
                }
            };
        }
        if (baseSharePackage instanceof TakoVideoSharePackage) {
            return new TTShareTitleProtocol() { // from class: com.ss.android.ugc.aweme.tako.share.panel.TakoVideoShareConfiguration$shareTitleProtocol$1
                @Override // com.ss.android.ugc.aweme.share.config.TTShareTitleProtocol, com.ss.android.ugc.aweme.share.core.protocol.ShareTitleProtocol
                public final int getShareTitle() {
                    return 2131822537;
                }
            };
        }
        if (baseSharePackage instanceof TakoLongImageSharePackage) {
            return new TTShareTitleProtocol() { // from class: com.ss.android.ugc.aweme.tako.share.panel.TakoLongImageShareConfiguration$shareTitleProtocol$1
                @Override // com.ss.android.ugc.aweme.share.config.TTShareTitleProtocol, com.ss.android.ugc.aweme.share.core.protocol.ShareTitleProtocol
                public final int getShareTitle() {
                    return 2131822535;
                }
            };
        }
        if (baseSharePackage instanceof TakoBatchMessageSharePackage) {
            return new TTShareTitleProtocol() { // from class: com.ss.android.ugc.aweme.tako.share.panel.TakoBatchShareConfiguration$shareTitleProtocol$1
                @Override // com.ss.android.ugc.aweme.share.config.TTShareTitleProtocol, com.ss.android.ugc.aweme.share.core.protocol.ShareTitleProtocol
                public final int getShareTitle() {
                    return 2131822537;
                }
            };
        }
        return new TTShareTitleProtocol();
    }

    @Override // com.ss.android.ugc.aweme.share.config.TTShareDefaultConfig, com.ss.android.ugc.aweme.share.core.protocol.ShareConfiguration
    public final SheetActionProtocol LJI(BaseSharePackage baseSharePackage) {
        if (baseSharePackage instanceof TakoImageSharePackage) {
            return new TakoImageSheetActionProtocol(baseSharePackage);
        }
        if (baseSharePackage instanceof TakoVideoSharePackage) {
            return new TakoVideoSheetActionProtocol(baseSharePackage);
        }
        if (baseSharePackage instanceof TakoLongImageSharePackage) {
            return new TakoLongImageSheetActionProtocol(baseSharePackage);
        }
        if (baseSharePackage instanceof TakoBatchMessageSharePackage) {
            return new TakoBatchSheetActionProtocol(baseSharePackage);
        }
        return new TTSheetActionProtocol(baseSharePackage);
    }

    @Override // com.ss.android.ugc.aweme.share.config.TTShareDefaultConfig, com.ss.android.ugc.aweme.share.core.protocol.ShareConfiguration
    public final ShareChannelProtocol LIZJ(Context context, BaseSharePackage baseSharePackage) {
        if (baseSharePackage instanceof TakoLongImageSharePackage) {
            return new TakoLongImageShareChannelProtocol(baseSharePackage);
        }
        if (baseSharePackage instanceof TakoBatchMessageSharePackage) {
            return new TakoBatchShareChannelProtocol(baseSharePackage);
        }
        if (!(baseSharePackage instanceof TakoImageSharePackage) && !(baseSharePackage instanceof TakoVideoSharePackage)) {
            return new TakoShareChannelProtocol(baseSharePackage);
        }
        return new TakoInAppOnlyChannelProtocol(baseSharePackage);
    }
}
