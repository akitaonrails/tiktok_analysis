package com.ss.android.ugc.trill.download.protocol.muteaudio;

import X.C1379810m0h;
import com.ss.android.ugc.aweme.feed.model.ACLCommonShare;
import com.ss.android.ugc.aweme.share.download.protocol.DefaultMuteAudioAbilityProtocol;

/* JADX INFO: loaded from: classes22.dex */
public final class AwemeVideoMuteAudioAbilityProtocol extends DefaultMuteAudioAbilityProtocol<C1379810m0h> {
    public final boolean LLILLJJLI;

    @Override // com.ss.android.ugc.aweme.share.base.download.configuration.protocol.MuteAudioAbilityProtocol
    public final boolean LIZ() {
        return this.LLILLJJLI;
    }

    public AwemeVideoMuteAudioAbilityProtocol(C1379810m0h c1379810m0h) {
        boolean mute;
        super(c1379810m0h);
        ACLCommonShare aCLCommonShare = c1379810m0h.LJIILIIL;
        if (aCLCommonShare != null) {
            mute = aCLCommonShare.getMute();
        } else {
            mute = false;
        }
        this.LLILLJJLI = mute;
    }
}
