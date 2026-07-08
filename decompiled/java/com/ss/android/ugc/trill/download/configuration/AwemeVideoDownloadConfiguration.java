package com.ss.android.ugc.trill.download.configuration;

import X.AbstractC21169117sn;
import X.C1379810m0h;
import X.C13LE;
import X.C19719912Dl;
import com.ss.android.ugc.aweme.share.base.download.configuration.DownloadConfiguration;
import com.ss.android.ugc.aweme.share.base.download.configuration.protocol.DownloadAbilityProtocol;
import com.ss.android.ugc.aweme.share.base.download.configuration.protocol.DownloadUIProtocol;
import com.ss.android.ugc.aweme.share.base.download.configuration.protocol.MuteAudioAbilityProtocol;
import com.ss.android.ugc.aweme.share.base.download.configuration.protocol.WaterMarkAbilityProtocol;
import com.ss.android.ugc.trill.download.protocol.download.AwemeVideoDownloadAbilityProtocol;
import com.ss.android.ugc.trill.download.protocol.muteaudio.AwemeVideoMuteAudioAbilityProtocol;
import com.ss.android.ugc.trill.download.protocol.watermark.AwemeVideoWaterMarkAbilityProtocol;
import com.ss.android.ugc.trill.download.ui.AwemeUIProtocol;

/* JADX INFO: loaded from: classes22.dex */
public final class AwemeVideoDownloadConfiguration extends DownloadConfiguration<C1379810m0h> {
    public final C19719912Dl LL = C13LE.LIZ(C1379810m0h.class);

    @Override // com.ss.android.ugc.aweme.share.base.download.configuration.DownloadConfiguration
    public final DownloadUIProtocol LIZJ() {
        return new AwemeUIProtocol();
    }

    @Override // com.ss.android.ugc.aweme.share.base.download.configuration.DownloadConfiguration
    public final C19719912Dl LIZLLL() {
        return this.LL;
    }

    @Override // com.ss.android.ugc.aweme.share.base.download.configuration.DownloadConfiguration
    public final DownloadAbilityProtocol LIZ(AbstractC21169117sn abstractC21169117sn) {
        AwemeVideoDownloadAbilityProtocol awemeVideoDownloadAbilityProtocol = new AwemeVideoDownloadAbilityProtocol((C1379810m0h) abstractC21169117sn);
        if (awemeVideoDownloadAbilityProtocol.LLILLJJLI == null) {
            return null;
        }
        return awemeVideoDownloadAbilityProtocol;
    }

    @Override // com.ss.android.ugc.aweme.share.base.download.configuration.DownloadConfiguration
    public final MuteAudioAbilityProtocol LJ(AbstractC21169117sn abstractC21169117sn) {
        AwemeVideoMuteAudioAbilityProtocol awemeVideoMuteAudioAbilityProtocol = new AwemeVideoMuteAudioAbilityProtocol((C1379810m0h) abstractC21169117sn);
        if (awemeVideoMuteAudioAbilityProtocol.LL == null) {
            return null;
        }
        return awemeVideoMuteAudioAbilityProtocol;
    }

    @Override // com.ss.android.ugc.aweme.share.base.download.configuration.DownloadConfiguration
    public final WaterMarkAbilityProtocol LJFF(AbstractC21169117sn abstractC21169117sn) {
        AwemeVideoWaterMarkAbilityProtocol awemeVideoWaterMarkAbilityProtocol = new AwemeVideoWaterMarkAbilityProtocol((C1379810m0h) abstractC21169117sn);
        if (awemeVideoWaterMarkAbilityProtocol.LLILLJJLI == null) {
            return null;
        }
        return awemeVideoWaterMarkAbilityProtocol;
    }
}
