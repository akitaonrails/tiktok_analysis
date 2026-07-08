package com.bytedance.android.livesdk.replay.proto;

import X.C1142340fpg;
import X.C1142350fph;
import X.InterfaceC1132110fZB;

/* JADX INFO: loaded from: classes28.dex */
public final class _SpriteImageItem_ProtoEncoder implements InterfaceC1132110fZB<SpriteImageItem> {
    public static void LIZIZ(C1142350fph c1142350fph, SpriteImageItem spriteImageItem) {
        C1142340fpg.LJFF(c1142350fph, 1, spriteImageItem.url);
        long j = spriteImageItem.spriteNum;
        c1142350fph.LIZLLL(2, 0);
        c1142350fph.LJFF(j);
        long j2 = spriteImageItem.imageXNum;
        c1142350fph.LIZLLL(3, 0);
        c1142350fph.LJFF(j2);
        long j3 = spriteImageItem.imageYNum;
        c1142350fph.LIZLLL(4, 0);
        c1142350fph.LJFF(j3);
        long j4 = spriteImageItem.imageHeight;
        c1142350fph.LIZLLL(5, 0);
        c1142350fph.LJFF(j4);
        long j5 = spriteImageItem.imageWidth;
        c1142350fph.LIZLLL(6, 0);
        c1142350fph.LJFF(j5);
        long j6 = spriteImageItem.fps;
        c1142350fph.LIZLLL(7, 0);
        c1142350fph.LJFF(j6);
    }

    @Override // X.InterfaceC1132110fZB
    public final void LIZ(C1142350fph c1142350fph, SpriteImageItem spriteImageItem) {
        LIZIZ(c1142350fph, spriteImageItem);
    }
}
