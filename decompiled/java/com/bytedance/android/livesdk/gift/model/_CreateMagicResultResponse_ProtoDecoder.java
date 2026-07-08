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
import webcast.data.RechargeCustomError;
import webcast.data._RechargeCustomError_ProtoDecoder;

/* JADX INFO: loaded from: classes.dex */
public final class _CreateMagicResultResponse_ProtoDecoder implements C0IMD<CreateMagicResultResponse> {
    @Override // X.C0IMD
    public final void LIZ(CreateMagicResultResponse createMagicResultResponse) {
        RechargeCustomError rechargeCustomError;
        UserGrade userGrade;
        ImageModel imageModel;
        CreateMagicResultResponse createMagicResultResponse2 = createMagicResultResponse;
        CreateMagicResultResponse.Data data = createMagicResultResponse2.data;
        if (data != null) {
            MagicResult magicResult = data.magicResult;
            if (magicResult != null && (imageModel = magicResult.image) != null) {
                _ImageModel_ProtoDecoder.LJ(imageModel);
            }
            PayGradeInfo payGradeInfo = data.payGradeInfo;
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
        CreateMagicResultResponse.Extra extra = createMagicResultResponse2.extra;
        if (extra != null && (rechargeCustomError = extra.customError) != null) {
            _RechargeCustomError_ProtoDecoder.LJ(rechargeCustomError);
        }
    }

    @Override // X.C0IMD
    public final CreateMagicResultResponse LIZJ(C1516680pZS c1516680pZS) throws IOException {
        CreateMagicResultResponse createMagicResultResponse = new CreateMagicResultResponse();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        C1516700pZU.LJ(c1516680pZS);
                    } else {
                        createMagicResultResponse.extra = _CreateMagicResultResponse_Extra_ProtoDecoder.LIZLLL(c1516680pZS);
                    }
                } else {
                    createMagicResultResponse.data = _CreateMagicResultResponse_Data_ProtoDecoder.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return createMagicResultResponse;
            }
        }
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, CreateMagicResultResponse createMagicResultResponse, List list) {
    }
}
