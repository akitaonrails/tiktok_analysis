package com.bytedance.pipo.ttpay.recharge.share;

import X.AbstractC1372680lpC;
import X.AbstractC1372690lpD;
import X.C1373470lqT;
import X.C13LE;
import X.C19719912Dl;
import com.ss.android.ugc.aweme.share.base.model.BaseSharePackage;
import com.ss.android.ugc.aweme.share.config.TTCustomSharePanelBarProtocol;
import com.ss.android.ugc.aweme.share.config.TTShareDefaultConfig;
import com.ss.android.ugc.aweme.share.config.TTSheetActionProtocol;
import com.ss.android.ugc.aweme.share.core.protocol.SheetActionProtocol;
import com.ss.android.ugc.aweme.sharer.protocol.CustomSharePanelBarProtocol;

/* JADX INFO: loaded from: classes22.dex */
public final class QrCodeShareConfiguration extends TTShareDefaultConfig<QrCodeSharePackage> {
    public static final C1373470lqT LLILLJJLI;

    /* JADX WARN: Type inference failed for: r1v0, types: [X.0lqT] */
    static {
        final C19719912Dl c19719912DlLIZ = C13LE.LIZ(QrCodeSharePackage.class);
        LLILLJJLI = new AbstractC1372690lpD(c19719912DlLIZ) { // from class: X.0lqT
            public final String LIZ = "pipo_qr_code";
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
                this.LIZIZ = c19719912DlLIZ;
            }
        };
    }

    @Override // com.ss.android.ugc.aweme.share.config.TTShareDefaultConfig, com.ss.android.ugc.aweme.share.core.protocol.ShareConfiguration
    public final AbstractC1372680lpC LIZLLL() {
        return LLILLJJLI;
    }

    @Override // com.ss.android.ugc.aweme.share.config.TTShareDefaultConfig, com.ss.android.ugc.aweme.share.core.protocol.ShareConfiguration
    public final CustomSharePanelBarProtocol LIZ(BaseSharePackage baseSharePackage) {
        return new TTCustomSharePanelBarProtocol() { // from class: com.bytedance.pipo.ttpay.recharge.share.QrCodeShareConfiguration$getCustomSharePanelBar$1
        };
    }

    @Override // com.ss.android.ugc.aweme.share.config.TTShareDefaultConfig, com.ss.android.ugc.aweme.share.core.protocol.ShareConfiguration
    public final SheetActionProtocol LJI(BaseSharePackage baseSharePackage) {
        return new TTSheetActionProtocol(baseSharePackage) { // from class: com.bytedance.pipo.ttpay.recharge.share.QrCodeShareConfiguration$getSheetActionProtocol$1
        };
    }
}
