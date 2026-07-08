package com.bytedance.android.livesdk.model.message;

import X.C1142340fpg;
import X.C1142350fph;
import X.InterfaceC1132110fZB;
import com.bytedance.android.live.base.model._ImageModel_ProtoEncoder;
import com.bytedance.android.livesdk.model.message.TextEffect;
import com.bytedance.android.livesdk.model.message.common._Text_ProtoEncoder;

/* JADX INFO: loaded from: classes18.dex */
public final class _TextEffect_Detail_ProtoEncoder implements InterfaceC1132110fZB<TextEffect.Detail> {
    public static int LIZJ(TextEffect.Detail detail) {
        if (detail == null) {
            return 0;
        }
        return _Text_ProtoEncoder.LJ(1, detail.text) + C1142340fpg.LJIIIZ(2, detail.textFontSize) + _ImageModel_ProtoEncoder.LJ(3, detail.background) + C1142340fpg.LJIIIZ(4, (int) detail.start) + C1142340fpg.LJIIIZ(5, (int) detail.duration) + C1142340fpg.LJIIIZ(6, detail.x) + C1142340fpg.LJIIIZ(7, detail.y) + C1142340fpg.LJIIIZ(8, detail.width) + C1142340fpg.LJIIIZ(9, detail.height) + C1142340fpg.LJIIIZ(10, detail.shadowDx) + C1142340fpg.LJIIIZ(11, detail.shadowDy) + C1142340fpg.LJIIIZ(12, detail.shadowRadius) + C1142340fpg.LJIILL(13, detail.shadowColor) + C1142340fpg.LJIILL(14, detail.strokeColor) + C1142340fpg.LJIIIZ(15, detail.strokeWidth);
    }

    public static void LIZIZ(C1142350fph c1142350fph, TextEffect.Detail detail) {
        _Text_ProtoEncoder.LIZJ(c1142350fph, 1, detail.text);
        int i = detail.textFontSize;
        c1142350fph.LIZLLL(2, 0);
        c1142350fph.LIZJ(i);
        _ImageModel_ProtoEncoder.LIZJ(c1142350fph, 3, detail.background);
        int i2 = (int) detail.start;
        c1142350fph.LIZLLL(4, 0);
        c1142350fph.LIZJ(i2);
        int i3 = (int) detail.duration;
        c1142350fph.LIZLLL(5, 0);
        c1142350fph.LIZJ(i3);
        int i4 = detail.x;
        c1142350fph.LIZLLL(6, 0);
        c1142350fph.LIZJ(i4);
        int i5 = detail.y;
        c1142350fph.LIZLLL(7, 0);
        c1142350fph.LIZJ(i5);
        int i6 = detail.width;
        c1142350fph.LIZLLL(8, 0);
        c1142350fph.LIZJ(i6);
        int i7 = detail.height;
        c1142350fph.LIZLLL(9, 0);
        c1142350fph.LIZJ(i7);
        int i8 = detail.shadowDx;
        c1142350fph.LIZLLL(10, 0);
        c1142350fph.LIZJ(i8);
        int i9 = detail.shadowDy;
        c1142350fph.LIZLLL(11, 0);
        c1142350fph.LIZJ(i9);
        int i10 = detail.shadowRadius;
        c1142350fph.LIZLLL(12, 0);
        c1142350fph.LIZJ(i10);
        C1142340fpg.LJFF(c1142350fph, 13, detail.shadowColor);
        C1142340fpg.LJFF(c1142350fph, 14, detail.strokeColor);
        int i11 = detail.strokeWidth;
        c1142350fph.LIZLLL(15, 0);
        c1142350fph.LIZJ(i11);
    }

    @Override // X.InterfaceC1132110fZB
    public final void LIZ(C1142350fph c1142350fph, TextEffect.Detail detail) {
        LIZIZ(c1142350fph, detail);
    }
}
