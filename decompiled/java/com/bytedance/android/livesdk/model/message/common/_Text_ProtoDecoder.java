package com.bytedance.android.livesdk.model.message.common;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model._ImageModel_ProtoDecoder;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.base.model.user._User_ProtoDecoder;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _Text_ProtoDecoder implements C0IMD<Text> {
    public static Text LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        Text text = new Text();
        text.pieces = new ArrayList();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        if (iLJI != 3) {
                            if (iLJI != 4) {
                                C1516700pZU.LJ(c1516680pZS);
                            } else {
                                text.pieces.add(_TextPiece_ProtoDecoder.LIZLLL(c1516680pZS));
                            }
                        } else {
                            text.defaultFormat = _TextFormat_ProtoDecoder.LIZLLL(c1516680pZS);
                        }
                    } else {
                        text.defaultPattern = C1516700pZU.LIZLLL(c1516680pZS);
                    }
                } else {
                    text.key = C1516700pZU.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return text;
            }
        }
    }

    public static void LJ(Text text) {
        ImageModel imageModel;
        PatternRef patternRef;
        User user;
        List<TextPiece> list = text.pieces;
        if (list == null) {
            text.pieces = new ArrayList();
            return;
        }
        if (list.isEmpty()) {
            return;
        }
        for (TextPiece textPiece : text.pieces) {
            if (textPiece != null) {
                TextPieceUser textPieceUser = textPiece.userValue;
                if (textPieceUser != null && (user = textPieceUser.user) != null) {
                    _User_ProtoDecoder.LJ(user);
                }
                TextPieceGift textPieceGift = textPiece.giftValue;
                if (textPieceGift != null && (patternRef = textPieceGift.nameRef) != null && patternRef.keyGroups == null) {
                    patternRef.keyGroups = new HashMap();
                }
                TextPieceImage textPieceImage = textPiece.imageValue;
                if (textPieceImage != null && (imageModel = textPieceImage.imageModel) != null) {
                    _ImageModel_ProtoDecoder.LJ(imageModel);
                }
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(Text text) {
        LJ(text);
    }

    @Override // X.C0IMD
    public final Text LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, Text text, List list) {
    }
}
