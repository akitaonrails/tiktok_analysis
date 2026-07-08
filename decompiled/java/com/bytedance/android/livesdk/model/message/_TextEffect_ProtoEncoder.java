package com.bytedance.android.livesdk.model.message;

import X.C1142350fph;
import X.InterfaceC1132110fZB;
import com.bytedance.android.livesdk.model.message.TextEffect;

/* JADX INFO: loaded from: classes18.dex */
public final class _TextEffect_ProtoEncoder implements InterfaceC1132110fZB<TextEffect> {
    @Override // X.InterfaceC1132110fZB
    public final void LIZ(C1142350fph c1142350fph, TextEffect textEffect) {
        TextEffect textEffect2 = textEffect;
        TextEffect.Detail detail = textEffect2.portraitDetail;
        if (detail != null) {
            c1142350fph.LIZLLL(1, 2);
            c1142350fph.LJ(_TextEffect_Detail_ProtoEncoder.LIZJ(detail));
            _TextEffect_Detail_ProtoEncoder.LIZIZ(c1142350fph, detail);
        }
        TextEffect.Detail detail2 = textEffect2.landscapeDetail;
        if (detail2 != null) {
            c1142350fph.LIZLLL(2, 2);
            c1142350fph.LJ(_TextEffect_Detail_ProtoEncoder.LIZJ(detail2));
            _TextEffect_Detail_ProtoEncoder.LIZIZ(c1142350fph, detail2);
        }
    }
}
