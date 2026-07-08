package com.ss.android.ugc.aweme.music.presenter;

import X.AbstractC1372680lpC;
import X.C1376640lva;
import X.C13LE;
import android.content.Context;
import com.ss.android.ugc.aweme.share.base.model.BaseSharePackage;
import com.ss.android.ugc.aweme.share.config.TTShareDefaultConfig;
import com.ss.android.ugc.aweme.share.core.protocol.ShareChannelProtocol;
import com.ss.android.ugc.aweme.share.core.protocol.SheetActionProtocol;

/* JADX INFO: loaded from: classes22.dex */
public final class MusicShareConfiguration extends TTShareDefaultConfig<MusicSharePackageV2> {
    public static final C1376640lva LLILLJJLI = new C1376640lva("music_share", C13LE.LIZ(MusicSharePackageV2.class));

    @Override // com.ss.android.ugc.aweme.share.config.TTShareDefaultConfig, com.ss.android.ugc.aweme.share.core.protocol.ShareConfiguration
    public final AbstractC1372680lpC LIZLLL() {
        return LLILLJJLI;
    }

    @Override // com.ss.android.ugc.aweme.share.config.TTShareDefaultConfig, com.ss.android.ugc.aweme.share.core.protocol.ShareConfiguration
    public final SheetActionProtocol LJI(BaseSharePackage baseSharePackage) {
        return new MusicSheetActionProtocol(baseSharePackage);
    }

    @Override // com.ss.android.ugc.aweme.share.config.TTShareDefaultConfig, com.ss.android.ugc.aweme.share.core.protocol.ShareConfiguration
    public final ShareChannelProtocol LIZJ(Context context, BaseSharePackage baseSharePackage) {
        return new MusicShareChannelProtocol(baseSharePackage);
    }
}
