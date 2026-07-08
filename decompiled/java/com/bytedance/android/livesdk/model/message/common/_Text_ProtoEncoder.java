package com.bytedance.android.livesdk.model.message.common;

import X.C1142340fpg;
import X.C1142350fph;
import X.InterfaceC1132110fZB;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.List;

/* JADX INFO: loaded from: classes18.dex */
public final class _Text_ProtoEncoder implements InterfaceC1132110fZB<Text> {
    public static int LIZLLL(Text text) {
        int iLIZIZ;
        int iLIZIZ2;
        if (text == null) {
            return 0;
        }
        int iLJIILL = C1142340fpg.LJIILL(1, text.key) + C1142340fpg.LJIILL(2, text.defaultPattern);
        TextFormat textFormat = text.defaultFormat;
        if (textFormat == null) {
            iLIZIZ = 0;
        } else {
            int iLIZJ = _TextFormat_ProtoEncoder.LIZJ(textFormat);
            iLIZIZ = iLIZJ + C1142350fph.LIZIZ(iLIZJ) + C1142350fph.LIZ(3);
        }
        int i = iLJIILL + iLIZIZ;
        List<TextPiece> list = text.pieces;
        if (list != null && !list.isEmpty()) {
            for (int i2 = 0; i2 < text.pieces.size(); i2++) {
                TextPiece textPiece = (TextPiece) ListProtector.get(text.pieces, i2);
                if (textPiece == null) {
                    iLIZIZ2 = 0;
                } else {
                    int iLIZJ2 = _TextPiece_ProtoEncoder.LIZJ(textPiece);
                    iLIZIZ2 = iLIZJ2 + C1142350fph.LIZIZ(iLIZJ2) + C1142350fph.LIZ(4);
                }
                i += iLIZIZ2;
            }
        }
        return i;
    }

    public static void LIZIZ(C1142350fph c1142350fph, Text text) {
        C1142340fpg.LJFF(c1142350fph, 1, text.key);
        C1142340fpg.LJFF(c1142350fph, 2, text.defaultPattern);
        TextFormat textFormat = text.defaultFormat;
        if (textFormat != null) {
            c1142350fph.LIZLLL(3, 2);
            c1142350fph.LJ(_TextFormat_ProtoEncoder.LIZJ(textFormat));
            _TextFormat_ProtoEncoder.LIZIZ(c1142350fph, textFormat);
        }
        List<TextPiece> list = text.pieces;
        if (list != null && !list.isEmpty()) {
            for (int i = 0; i < text.pieces.size(); i++) {
                TextPiece textPiece = (TextPiece) ListProtector.get(text.pieces, i);
                if (textPiece != null) {
                    c1142350fph.LIZLLL(4, 2);
                    c1142350fph.LJ(_TextPiece_ProtoEncoder.LIZJ(textPiece));
                    _TextPiece_ProtoEncoder.LIZIZ(c1142350fph, textPiece);
                }
            }
        }
    }

    public static int LJ(int i, Text text) {
        if (text == null) {
            return 0;
        }
        int iLIZLLL = LIZLLL(text);
        return iLIZLLL + C1142350fph.LIZIZ(iLIZLLL) + C1142350fph.LIZ(i);
    }

    @Override // X.InterfaceC1132110fZB
    public final void LIZ(C1142350fph c1142350fph, Text text) {
        LIZIZ(c1142350fph, text);
    }

    public static void LIZJ(C1142350fph c1142350fph, int i, Text text) {
        if (text == null) {
            return;
        }
        c1142350fph.LIZLLL(i, 2);
        c1142350fph.LJ(LIZLLL(text));
        LIZIZ(c1142350fph, text);
    }
}
