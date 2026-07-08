package com.bytedance.android.livesdk.model;

import X.C1142340fpg;
import X.C1142350fph;
import X.InterfaceC1132110fZB;
import com.bytedance.android.livesdk.model.Gift;

/* JADX INFO: loaded from: classes18.dex */
public final class _Gift_MusicGiftInfo_AudioResource_ProtoEncoder implements InterfaceC1132110fZB<Gift.MusicGiftInfo.AudioResource> {
    public static int LIZIZ(Gift.MusicGiftInfo.AudioResource audioResource) {
        return C1142340fpg.LJIILL(1, audioResource.audioUrl) + C1142340fpg.LJIILL(2, audioResource.lyricsUrl) + C1142340fpg.LJIIL(3, audioResource.snippetId);
    }

    @Override // X.InterfaceC1132110fZB
    public final void LIZ(C1142350fph c1142350fph, Gift.MusicGiftInfo.AudioResource audioResource) {
        Gift.MusicGiftInfo.AudioResource audioResource2 = audioResource;
        C1142340fpg.LJFF(c1142350fph, 1, audioResource2.audioUrl);
        C1142340fpg.LJFF(c1142350fph, 2, audioResource2.lyricsUrl);
        long j = audioResource2.snippetId;
        c1142350fph.LIZLLL(3, 0);
        c1142350fph.LJFF(j);
    }
}
