package com.bytedance.android.livesdk.model;

import X.C1142340fpg;
import X.C1142350fph;
import X.InterfaceC1132110fZB;
import com.bytedance.android.livesdk.model.Gift;

/* JADX INFO: loaded from: classes18.dex */
public final class _Gift_MusicGiftInfo_ProtoEncoder implements InterfaceC1132110fZB<Gift.MusicGiftInfo> {
    public static int LIZJ(Gift.MusicGiftInfo musicGiftInfo) {
        int iLJIILL = C1142340fpg.LJIILL(1, musicGiftInfo.artistName);
        int iLIZIZ = 0;
        Gift.MusicGiftInfo.AudioResource audioResource = musicGiftInfo.resource;
        if (audioResource != null) {
            int iLIZIZ2 = _Gift_MusicGiftInfo_AudioResource_ProtoEncoder.LIZIZ(audioResource);
            iLIZIZ = iLIZIZ2 + C1142350fph.LIZIZ(iLIZIZ2) + C1142350fph.LIZ(2);
        }
        return iLJIILL + iLIZIZ + C1142340fpg.LJIIL(3, musicGiftInfo.songId) + C1142340fpg.LJIIL(4, musicGiftInfo.moodId) + C1142340fpg.LJIILL(5, musicGiftInfo.songName);
    }

    public static void LIZIZ(C1142350fph c1142350fph, Gift.MusicGiftInfo musicGiftInfo) {
        C1142340fpg.LJFF(c1142350fph, 1, musicGiftInfo.artistName);
        Gift.MusicGiftInfo.AudioResource audioResource = musicGiftInfo.resource;
        if (audioResource != null) {
            c1142350fph.LIZLLL(2, 2);
            c1142350fph.LJ(_Gift_MusicGiftInfo_AudioResource_ProtoEncoder.LIZIZ(audioResource));
            C1142340fpg.LJFF(c1142350fph, 1, audioResource.audioUrl);
            C1142340fpg.LJFF(c1142350fph, 2, audioResource.lyricsUrl);
            long j = audioResource.snippetId;
            c1142350fph.LIZLLL(3, 0);
            c1142350fph.LJFF(j);
        }
        long j2 = musicGiftInfo.songId;
        c1142350fph.LIZLLL(3, 0);
        c1142350fph.LJFF(j2);
        long j3 = musicGiftInfo.moodId;
        c1142350fph.LIZLLL(4, 0);
        c1142350fph.LJFF(j3);
        C1142340fpg.LJFF(c1142350fph, 5, musicGiftInfo.songName);
    }

    @Override // X.InterfaceC1132110fZB
    public final void LIZ(C1142350fph c1142350fph, Gift.MusicGiftInfo musicGiftInfo) {
        LIZIZ(c1142350fph, musicGiftInfo);
    }
}
