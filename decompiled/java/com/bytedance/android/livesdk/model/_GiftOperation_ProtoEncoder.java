package com.bytedance.android.livesdk.model;

import X.C1142340fpg;
import X.C1142350fph;
import X.InterfaceC1132110fZB;
import com.bytedance.android.live.base.model._ImageModel_ProtoEncoder;

/* JADX INFO: loaded from: classes18.dex */
public final class _GiftOperation_ProtoEncoder implements InterfaceC1132110fZB<GiftOperation> {
    public static void LIZIZ(C1142350fph c1142350fph, GiftOperation giftOperation) {
        _ImageModel_ProtoEncoder.LIZJ(c1142350fph, 1, giftOperation.leftImage);
        _ImageModel_ProtoEncoder.LIZJ(c1142350fph, 2, giftOperation.rightImage);
        C1142340fpg.LJFF(c1142350fph, 3, giftOperation.title);
        C1142340fpg.LJFF(c1142350fph, 4, giftOperation.titleColor);
        long j = giftOperation.titleSize;
        c1142350fph.LIZLLL(5, 0);
        c1142350fph.LJFF(j);
        C1142340fpg.LJFF(c1142350fph, 6, giftOperation.schemeUrl);
        C1142340fpg.LJFF(c1142350fph, 7, giftOperation.eventName);
    }

    @Override // X.InterfaceC1132110fZB
    public final void LIZ(C1142350fph c1142350fph, GiftOperation giftOperation) {
        LIZIZ(c1142350fph, giftOperation);
    }
}
