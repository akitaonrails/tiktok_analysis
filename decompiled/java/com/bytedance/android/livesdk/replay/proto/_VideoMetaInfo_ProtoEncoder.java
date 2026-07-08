package com.bytedance.android.livesdk.replay.proto;

import X.C1142340fpg;
import X.C1142350fph;
import X.InterfaceC1132110fZB;

/* JADX INFO: loaded from: classes28.dex */
public final class _VideoMetaInfo_ProtoEncoder implements InterfaceC1132110fZB<VideoMetaInfo> {
    public static void LIZIZ(C1142350fph c1142350fph, VideoMetaInfo videoMetaInfo) {
        C1142340fpg.LJFF(c1142350fph, 1, videoMetaInfo.url);
        long j = videoMetaInfo.height;
        c1142350fph.LIZLLL(2, 0);
        c1142350fph.LJFF(j);
        long j2 = videoMetaInfo.width;
        c1142350fph.LIZLLL(3, 0);
        c1142350fph.LJFF(j2);
        long j3 = videoMetaInfo.size;
        c1142350fph.LIZLLL(4, 0);
        c1142350fph.LJFF(j3);
        C1142340fpg.LIZJ(c1142350fph, 5, videoMetaInfo.duration);
        C1142340fpg.LJFF(c1142350fph, 6, videoMetaInfo.fileId);
    }

    @Override // X.InterfaceC1132110fZB
    public final void LIZ(C1142350fph c1142350fph, VideoMetaInfo videoMetaInfo) {
        LIZIZ(c1142350fph, videoMetaInfo);
    }

    public static void LIZJ(C1142350fph c1142350fph, int i, VideoMetaInfo videoMetaInfo) {
        if (videoMetaInfo == null) {
            return;
        }
        c1142350fph.LIZLLL(i, 2);
        c1142350fph.LJ(C1142340fpg.LJIILL(1, videoMetaInfo.url) + C1142340fpg.LJIIL(2, videoMetaInfo.height) + C1142340fpg.LJIIL(3, videoMetaInfo.width) + C1142340fpg.LJIIL(4, videoMetaInfo.size) + C1142350fph.LIZ(5) + 4 + C1142340fpg.LJIILL(6, videoMetaInfo.fileId));
        LIZIZ(c1142350fph, videoMetaInfo);
    }
}
