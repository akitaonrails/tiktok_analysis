package com.bytedance.android.livesdk.model.message.common;

import X.C1142340fpg;
import X.C1142350fph;
import X.InterfaceC1132110fZB;
import com.bytedance.android.live.base.model._ImageModel_ProtoEncoder;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.base.model.user._User_ProtoEncoder;

/* JADX INFO: loaded from: classes18.dex */
public final class _TextPiece_ProtoEncoder implements InterfaceC1132110fZB<TextPiece> {
    public static int LIZJ(TextPiece textPiece) {
        int iLIZIZ;
        int iLIZIZ2;
        int iLIZIZ3;
        int iLIZIZ4;
        int iLIZIZ5;
        int iLIZIZ6;
        int iLJIIIZ = C1142340fpg.LJIIIZ(1, textPiece.type);
        int iLIZ = 0;
        TextFormat textFormat = textPiece.format;
        if (textFormat == null) {
            iLIZIZ = 0;
        } else {
            int iLIZJ = _TextFormat_ProtoEncoder.LIZJ(textFormat);
            iLIZIZ = iLIZJ + C1142350fph.LIZIZ(iLIZJ) + C1142350fph.LIZ(2);
        }
        int iLJIILL = iLJIIIZ + iLIZIZ + C1142340fpg.LJIILL(11, textPiece.stringValue);
        TextPieceUser textPieceUser = textPiece.userValue;
        if (textPieceUser == null) {
            iLIZIZ3 = 0;
        } else {
            User user = textPieceUser.user;
            if (user == null) {
                iLIZIZ2 = 0;
            } else {
                int iLIZLLL = _User_ProtoEncoder.LIZLLL(user);
                iLIZIZ2 = iLIZLLL + C1142350fph.LIZIZ(iLIZLLL) + C1142350fph.LIZ(1);
            }
            int iLJI = iLIZIZ2 + C1142340fpg.LJI(2);
            iLIZIZ3 = iLJI + C1142350fph.LIZIZ(iLJI) + C1142350fph.LIZ(21);
        }
        int i = iLJIILL + iLIZIZ3;
        TextPieceGift textPieceGift = textPiece.giftValue;
        if (textPieceGift == null) {
            iLIZIZ4 = 0;
        } else {
            int iLIZJ2 = _TextPieceGift_ProtoEncoder.LIZJ(textPieceGift);
            iLIZIZ4 = iLIZJ2 + C1142350fph.LIZIZ(iLIZJ2) + C1142350fph.LIZ(22);
        }
        int i2 = i + iLIZIZ4;
        TextPieceHeart textPieceHeart = textPiece.heartValue;
        if (textPieceHeart == null) {
            iLIZIZ5 = 0;
        } else {
            int iLJIILL2 = C1142340fpg.LJIILL(1, textPieceHeart.color);
            iLIZIZ5 = iLJIILL2 + C1142350fph.LIZIZ(iLJIILL2) + C1142350fph.LIZ(23);
        }
        int i3 = i2 + iLIZIZ5;
        TextPiecePatternRef textPiecePatternRef = textPiece.patternRefValue;
        if (textPiecePatternRef == null) {
            iLIZIZ6 = 0;
        } else {
            int iLJIILL3 = C1142340fpg.LJIILL(1, textPiecePatternRef.key) + C1142340fpg.LJIILL(2, textPiecePatternRef.defaultPattern);
            iLIZIZ6 = iLJIILL3 + C1142350fph.LIZIZ(iLJIILL3) + C1142350fph.LIZ(24);
        }
        int i4 = i3 + iLIZIZ6;
        TextPieceImage textPieceImage = textPiece.imageValue;
        if (textPieceImage != null) {
            int iLJ = _ImageModel_ProtoEncoder.LJ(1, textPieceImage.imageModel);
            iLIZ = C1142350fph.LIZ(25) + iLJ + C1142350fph.LIZIZ(iLJ);
        }
        return i4 + iLIZ;
    }

    public static void LIZIZ(C1142350fph c1142350fph, TextPiece textPiece) {
        int iLIZIZ;
        int i = textPiece.type;
        c1142350fph.LIZLLL(1, 0);
        c1142350fph.LIZJ(i);
        TextFormat textFormat = textPiece.format;
        if (textFormat != null) {
            c1142350fph.LIZLLL(2, 2);
            c1142350fph.LJ(_TextFormat_ProtoEncoder.LIZJ(textFormat));
            _TextFormat_ProtoEncoder.LIZIZ(c1142350fph, textFormat);
        }
        C1142340fpg.LJFF(c1142350fph, 11, textPiece.stringValue);
        TextPieceUser textPieceUser = textPiece.userValue;
        if (textPieceUser != null) {
            c1142350fph.LIZLLL(21, 2);
            User user = textPieceUser.user;
            if (user == null) {
                iLIZIZ = 0;
            } else {
                int iLIZLLL = _User_ProtoEncoder.LIZLLL(user);
                iLIZIZ = iLIZLLL + C1142350fph.LIZIZ(iLIZLLL) + C1142350fph.LIZ(1);
            }
            c1142350fph.LJ(iLIZIZ + C1142340fpg.LJI(2));
            _User_ProtoEncoder.LIZJ(c1142350fph, 1, textPieceUser.user);
            boolean z = textPieceUser.withColon;
            c1142350fph.LIZLLL(2, 0);
            c1142350fph.LJ(z ? 1 : 0);
        }
        TextPieceGift textPieceGift = textPiece.giftValue;
        if (textPieceGift != null) {
            c1142350fph.LIZLLL(22, 2);
            c1142350fph.LJ(_TextPieceGift_ProtoEncoder.LIZJ(textPieceGift));
            _TextPieceGift_ProtoEncoder.LIZIZ(c1142350fph, textPieceGift);
        }
        TextPieceHeart textPieceHeart = textPiece.heartValue;
        if (textPieceHeart != null) {
            c1142350fph.LIZLLL(23, 2);
            c1142350fph.LJ(C1142340fpg.LJIILL(1, textPieceHeart.color));
            C1142340fpg.LJFF(c1142350fph, 1, textPieceHeart.color);
        }
        TextPiecePatternRef textPiecePatternRef = textPiece.patternRefValue;
        if (textPiecePatternRef != null) {
            c1142350fph.LIZLLL(24, 2);
            c1142350fph.LJ(C1142340fpg.LJIILL(1, textPiecePatternRef.key) + C1142340fpg.LJIILL(2, textPiecePatternRef.defaultPattern));
            C1142340fpg.LJFF(c1142350fph, 1, textPiecePatternRef.key);
            C1142340fpg.LJFF(c1142350fph, 2, textPiecePatternRef.defaultPattern);
        }
        TextPieceImage textPieceImage = textPiece.imageValue;
        if (textPieceImage != null) {
            c1142350fph.LIZLLL(25, 2);
            c1142350fph.LJ(_ImageModel_ProtoEncoder.LJ(1, textPieceImage.imageModel));
            _ImageModel_ProtoEncoder.LIZJ(c1142350fph, 1, textPieceImage.imageModel);
        }
    }

    @Override // X.InterfaceC1132110fZB
    public final void LIZ(C1142350fph c1142350fph, TextPiece textPiece) {
        LIZIZ(c1142350fph, textPiece);
    }
}
