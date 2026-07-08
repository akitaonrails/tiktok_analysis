package com.bytedance.android.livesdk.model.message;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model._ImageModel_ProtoDecoder;
import com.bytedance.android.live.base.model.user.BadgeStruct;
import com.bytedance.android.live.base.model.user._BadgeStruct_ProtoDecoder;
import com.bytedance.android.livesdk.chatroom.api.LevelBadge;
import com.bytedance.android.livesdk.chatroom.api.SubInfo;
import com.bytedance.android.livesdk.chatroom.api.SubLevel;
import com.bytedance.android.livesdk.chatroom.api._SubInfo_ProtoDecoder;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _PushContractStatusResult_ProtoDecoder implements C0IMD<PushContractStatusResult> {
    public static PushContractStatusResult LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        PushContractStatusResult pushContractStatusResult = new PushContractStatusResult();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                switch (iLJI) {
                    case 1:
                        pushContractStatusResult.payChannel = c1516680pZS.LJIIJ();
                        break;
                    case 2:
                        pushContractStatusResult.status = c1516680pZS.LJIIJ();
                        break;
                    case 3:
                        pushContractStatusResult.tplType = c1516680pZS.LJIIJ();
                        break;
                    case 4:
                        pushContractStatusResult.subCircle = c1516680pZS.LJIIJ();
                        break;
                    case 5:
                        pushContractStatusResult.subInfo = _SubInfo_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 6:
                        pushContractStatusResult.toast = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 7:
                        pushContractStatusResult.contractid = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 8:
                        pushContractStatusResult.createContractIntent = c1516680pZS.LJIIJ();
                        break;
                    default:
                        C1516700pZU.LJ(c1516680pZS);
                        break;
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return pushContractStatusResult;
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(PushContractStatusResult pushContractStatusResult) {
        SubLevel subLevel;
        SubInfo subInfo = pushContractStatusResult.subInfo;
        if (subInfo != null && (subLevel = subInfo.subLevel) != null) {
            LevelBadge levelBadge = subLevel.badge;
            if (levelBadge != null) {
                ImageModel imageModel = levelBadge.originImg;
                if (imageModel != null) {
                    _ImageModel_ProtoDecoder.LJ(imageModel);
                }
                ImageModel imageModel2 = levelBadge.previewImg;
                if (imageModel2 != null) {
                    _ImageModel_ProtoDecoder.LJ(imageModel2);
                }
            }
            BadgeStruct badgeStruct = subLevel.badgeStruct;
            if (badgeStruct != null) {
                _BadgeStruct_ProtoDecoder.LJ(badgeStruct);
            }
        }
    }

    @Override // X.C0IMD
    public final PushContractStatusResult LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, PushContractStatusResult pushContractStatusResult, List list) {
    }
}
