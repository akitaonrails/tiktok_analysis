package com.bytedance.android.livesdk.gift.model;

import X.C1142350fph;
import X.InterfaceC1132110fZB;

/* JADX INFO: loaded from: classes18.dex */
public final class _GiftEffectSpecs_ProtoEncoder implements InterfaceC1132110fZB<GiftEffectSpecs> {
    public static int LIZJ(GiftEffectSpecs giftEffectSpecs) {
        int iLIZIZ;
        int iLIZIZ2;
        int iLIZIZ3;
        int iLIZIZ4;
        GiftEffectCrossScreenStickerSpec giftEffectCrossScreenStickerSpec = giftEffectSpecs.crossScreenSticker;
        int iLIZ = 0;
        if (giftEffectCrossScreenStickerSpec == null) {
            iLIZIZ = 0;
        } else {
            int iLIZJ = _GiftEffectCrossScreenStickerSpec_ProtoEncoder.LIZJ(giftEffectCrossScreenStickerSpec);
            iLIZIZ = iLIZJ + C1142350fph.LIZIZ(iLIZJ) + C1142350fph.LIZ(1);
        }
        GiftEffectLynxSpec giftEffectLynxSpec = giftEffectSpecs.lynx;
        if (giftEffectLynxSpec == null) {
            iLIZIZ2 = 0;
        } else {
            int iLIZJ2 = _GiftEffectLynxSpec_ProtoEncoder.LIZJ(giftEffectLynxSpec);
            iLIZIZ2 = iLIZJ2 + C1142350fph.LIZIZ(iLIZJ2) + C1142350fph.LIZ(2);
        }
        int i = iLIZIZ + iLIZIZ2;
        GiftEffectPrefabSpec giftEffectPrefabSpec = giftEffectSpecs.prefab;
        if (giftEffectPrefabSpec == null) {
            iLIZIZ3 = 0;
        } else {
            int iLIZJ3 = _GiftEffectPrefabSpec_ProtoEncoder.LIZJ(giftEffectPrefabSpec);
            iLIZIZ3 = iLIZJ3 + C1142350fph.LIZIZ(iLIZJ3) + C1142350fph.LIZ(3);
        }
        int i2 = i + iLIZIZ3;
        GiftEffectSerialSpec giftEffectSerialSpec = giftEffectSpecs.serialSpec;
        if (giftEffectSerialSpec == null) {
            iLIZIZ4 = 0;
        } else {
            int iLIZJ4 = _GiftEffectSerialSpec_ProtoEncoder.LIZJ(giftEffectSerialSpec);
            iLIZIZ4 = iLIZJ4 + C1142350fph.LIZIZ(iLIZJ4) + C1142350fph.LIZ(4);
        }
        int i3 = i2 + iLIZIZ4;
        GiftEffectStreamSpec giftEffectStreamSpec = giftEffectSpecs.streamEffectSpec;
        if (giftEffectStreamSpec != null) {
            int iLIZJ5 = _GiftEffectStreamSpec_ProtoEncoder.LIZJ(giftEffectStreamSpec);
            iLIZ = C1142350fph.LIZ(5) + iLIZJ5 + C1142350fph.LIZIZ(iLIZJ5);
        }
        return i3 + iLIZ;
    }

    public static void LIZIZ(C1142350fph c1142350fph, GiftEffectSpecs giftEffectSpecs) {
        GiftEffectCrossScreenStickerSpec giftEffectCrossScreenStickerSpec = giftEffectSpecs.crossScreenSticker;
        if (giftEffectCrossScreenStickerSpec != null) {
            c1142350fph.LIZLLL(1, 2);
            c1142350fph.LJ(_GiftEffectCrossScreenStickerSpec_ProtoEncoder.LIZJ(giftEffectCrossScreenStickerSpec));
            _GiftEffectCrossScreenStickerSpec_ProtoEncoder.LIZIZ(c1142350fph, giftEffectCrossScreenStickerSpec);
        }
        GiftEffectLynxSpec giftEffectLynxSpec = giftEffectSpecs.lynx;
        if (giftEffectLynxSpec != null) {
            c1142350fph.LIZLLL(2, 2);
            c1142350fph.LJ(_GiftEffectLynxSpec_ProtoEncoder.LIZJ(giftEffectLynxSpec));
            _GiftEffectLynxSpec_ProtoEncoder.LIZIZ(c1142350fph, giftEffectLynxSpec);
        }
        GiftEffectPrefabSpec giftEffectPrefabSpec = giftEffectSpecs.prefab;
        if (giftEffectPrefabSpec != null) {
            c1142350fph.LIZLLL(3, 2);
            c1142350fph.LJ(_GiftEffectPrefabSpec_ProtoEncoder.LIZJ(giftEffectPrefabSpec));
            _GiftEffectPrefabSpec_ProtoEncoder.LIZIZ(c1142350fph, giftEffectPrefabSpec);
        }
        GiftEffectSerialSpec giftEffectSerialSpec = giftEffectSpecs.serialSpec;
        if (giftEffectSerialSpec != null) {
            c1142350fph.LIZLLL(4, 2);
            c1142350fph.LJ(_GiftEffectSerialSpec_ProtoEncoder.LIZJ(giftEffectSerialSpec));
            _GiftEffectSerialSpec_ProtoEncoder.LIZIZ(c1142350fph, giftEffectSerialSpec);
        }
        GiftEffectStreamSpec giftEffectStreamSpec = giftEffectSpecs.streamEffectSpec;
        if (giftEffectStreamSpec != null) {
            c1142350fph.LIZLLL(5, 2);
            c1142350fph.LJ(_GiftEffectStreamSpec_ProtoEncoder.LIZJ(giftEffectStreamSpec));
            _GiftEffectStreamSpec_ProtoEncoder.LIZIZ(c1142350fph, giftEffectStreamSpec);
        }
    }

    @Override // X.InterfaceC1132110fZB
    public final void LIZ(C1142350fph c1142350fph, GiftEffectSpecs giftEffectSpecs) {
        LIZIZ(c1142350fph, giftEffectSpecs);
    }
}
