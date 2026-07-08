package com.bytedance.android.livesdk.model;

import X.C1142340fpg;
import X.C1142350fph;
import X.InterfaceC1132110fZB;

/* JADX INFO: loaded from: classes36.dex */
public final class _Author_ProtoEncoder implements InterfaceC1132110fZB<Author> {
    public static int LIZJ(Author author) {
        return C1142340fpg.LJIIL(1, author.videoTotalCount) + C1142340fpg.LJIIL(2, author.videoTotalPlayCount) + C1142340fpg.LJIIL(6, author.videoTotalFavoriteCount);
    }

    public static void LIZIZ(C1142350fph c1142350fph, Author author) {
        long j = author.videoTotalCount;
        c1142350fph.LIZLLL(1, 0);
        c1142350fph.LJFF(j);
        long j2 = author.videoTotalPlayCount;
        c1142350fph.LIZLLL(2, 0);
        c1142350fph.LJFF(j2);
        long j3 = author.videoTotalFavoriteCount;
        c1142350fph.LIZLLL(6, 0);
        c1142350fph.LJFF(j3);
    }

    @Override // X.InterfaceC1132110fZB
    public final void LIZ(C1142350fph c1142350fph, Author author) {
        LIZIZ(c1142350fph, author);
    }
}
