package com.bytedance.android.livesdk.model.message.common;

import X.C1142350fph;
import X.InterfaceC1132110fZB;
import com.bytedance.android.live.base.model.user._User_ProtoEncoder;

/* JADX INFO: loaded from: classes18.dex */
public final class _TextPieceUser_ProtoEncoder implements InterfaceC1132110fZB<TextPieceUser> {
    @Override // X.InterfaceC1132110fZB
    public final void LIZ(C1142350fph c1142350fph, TextPieceUser textPieceUser) {
        TextPieceUser textPieceUser2 = textPieceUser;
        _User_ProtoEncoder.LIZJ(c1142350fph, 1, textPieceUser2.user);
        boolean z = textPieceUser2.withColon;
        c1142350fph.LIZLLL(2, 0);
        c1142350fph.LJ(z ? 1 : 0);
    }
}
