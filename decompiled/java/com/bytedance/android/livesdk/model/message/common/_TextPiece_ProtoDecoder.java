package com.bytedance.android.livesdk.model.message.common;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model._ImageModel_ProtoDecoder;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.base.model.user._User_ProtoDecoder;
import com.bytedance.android.livesdk.livesetting.subscription.LiveSubscriptionQuestionnaireHourFrequencySetting;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _TextPiece_ProtoDecoder implements C0IMD<TextPiece> {
    public static TextPiece LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        TextPiece textPiece = new TextPiece();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        if (iLJI != 11) {
                            switch (iLJI) {
                                case 21:
                                    textPiece.userValue = _TextPieceUser_ProtoDecoder.LIZLLL(c1516680pZS);
                                    break;
                                case 22:
                                    textPiece.giftValue = _TextPieceGift_ProtoDecoder.LIZLLL(c1516680pZS);
                                    break;
                                case 23:
                                    textPiece.heartValue = _TextPieceHeart_ProtoDecoder.LIZLLL(c1516680pZS);
                                    break;
                                case LiveSubscriptionQuestionnaireHourFrequencySetting.DEFAULT /* 24 */:
                                    textPiece.patternRefValue = _TextPiecePatternRef_ProtoDecoder.LIZLLL(c1516680pZS);
                                    break;
                                case 25:
                                    textPiece.imageValue = _TextPieceImage_ProtoDecoder.LIZLLL(c1516680pZS);
                                    break;
                                default:
                                    C1516700pZU.LJ(c1516680pZS);
                                    break;
                            }
                        } else {
                            textPiece.stringValue = C1516700pZU.LIZLLL(c1516680pZS);
                        }
                    } else {
                        textPiece.format = _TextFormat_ProtoDecoder.LIZLLL(c1516680pZS);
                    }
                } else {
                    textPiece.type = c1516680pZS.LJIIJ();
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return textPiece;
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(TextPiece textPiece) {
        ImageModel imageModel;
        PatternRef patternRef;
        User user;
        TextPiece textPiece2 = textPiece;
        TextPieceUser textPieceUser = textPiece2.userValue;
        if (textPieceUser != null && (user = textPieceUser.user) != null) {
            _User_ProtoDecoder.LJ(user);
        }
        TextPieceGift textPieceGift = textPiece2.giftValue;
        if (textPieceGift != null && (patternRef = textPieceGift.nameRef) != null && patternRef.keyGroups == null) {
            patternRef.keyGroups = new HashMap();
        }
        TextPieceImage textPieceImage = textPiece2.imageValue;
        if (textPieceImage != null && (imageModel = textPieceImage.imageModel) != null) {
            _ImageModel_ProtoDecoder.LJ(imageModel);
        }
    }

    @Override // X.C0IMD
    public final TextPiece LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, TextPiece textPiece, List list) {
    }
}
