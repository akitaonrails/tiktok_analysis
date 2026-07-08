package com.bytedance.android.livesdk.gift.model;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model._ImageModel_ProtoDecoder;
import com.bytedance.android.live.base.model.user.BadgeStruct;
import com.bytedance.android.live.base.model.user._BadgeStruct_ProtoDecoder;
import com.bytedance.android.livesdk.gift.model.CreateMagicResultResponse;
import java.io.IOException;
import java.util.List;
import tikcast.api.user_level.PayGradeInfo;
import tikcast.api.user_level.UserGrade;
import tikcast.api.user_level._PayGradeInfo_ProtoDecoder;

/* JADX INFO: loaded from: classes.dex */
public final class _CreateMagicResultResponse_Data_ProtoDecoder implements C0IMD<CreateMagicResultResponse.Data> {
    public static CreateMagicResultResponse.Data LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        CreateMagicResultResponse.Data data = new CreateMagicResultResponse.Data();
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
                                data.leftCoins = c1516680pZS.LJIIJJI();
                            }
                        } else {
                            data.payGradeInfo = _PayGradeInfo_ProtoDecoder.LIZLLL(c1516680pZS);
                        }
                    } else {
                        data.expireTimestamp = c1516680pZS.LJIIJJI();
                    }
                } else {
                    data.magicResult = _MagicResult_ProtoDecoder.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return data;
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(CreateMagicResultResponse.Data data) {
        UserGrade userGrade;
        ImageModel imageModel;
        CreateMagicResultResponse.Data data2 = data;
        MagicResult magicResult = data2.magicResult;
        if (magicResult != null && (imageModel = magicResult.image) != null) {
            _ImageModel_ProtoDecoder.LJ(imageModel);
        }
        PayGradeInfo payGradeInfo = data2.payGradeInfo;
        if (payGradeInfo != null && (userGrade = payGradeInfo.userGrade) != null) {
            BadgeStruct badgeStruct = userGrade.defaultGradeBadge;
            if (badgeStruct != null) {
                _BadgeStruct_ProtoDecoder.LJ(badgeStruct);
            }
            BadgeStruct badgeStruct2 = userGrade.opacityBadge;
            if (badgeStruct2 != null) {
                _BadgeStruct_ProtoDecoder.LJ(badgeStruct2);
            }
        }
    }

    @Override // X.C0IMD
    public final CreateMagicResultResponse.Data LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, CreateMagicResultResponse.Data data, List list) {
    }
}
