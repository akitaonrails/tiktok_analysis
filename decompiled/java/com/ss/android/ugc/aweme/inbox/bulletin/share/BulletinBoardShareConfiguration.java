package com.ss.android.ugc.aweme.inbox.bulletin.share;

import X.AbstractC1372680lpC;
import X.AbstractC1372690lpD;
import X.C1371900lnw;
import X.C13LE;
import X.C19719912Dl;
import android.content.Context;
import com.ss.android.ugc.aweme.share.base.model.BaseSharePackage;
import com.ss.android.ugc.aweme.share.config.TTShareDefaultConfig;
import com.ss.android.ugc.aweme.share.core.protocol.ShareChannelProtocol;

/* JADX INFO: loaded from: classes22.dex */
public final class BulletinBoardShareConfiguration extends TTShareDefaultConfig<BulletinBoardInviteSharePackage> {
    public static final C1371900lnw LLILLJJLI;

    /* JADX WARN: Type inference failed for: r1v0, types: [X.0lnw] */
    static {
        final C19719912Dl c19719912DlLIZ = C13LE.LIZ(BulletinBoardInviteSharePackage.class);
        LLILLJJLI = new AbstractC1372690lpD(c19719912DlLIZ) { // from class: X.0lnw
            public final String LIZ = "bb_invite_share";
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
    public final ShareChannelProtocol LIZJ(Context context, BaseSharePackage baseSharePackage) {
        return new BulletinShareChannelProtocol(baseSharePackage);
    }
}
