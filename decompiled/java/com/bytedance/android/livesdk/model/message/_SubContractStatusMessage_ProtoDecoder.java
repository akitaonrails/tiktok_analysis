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
import com.bytedance.android.livesdkapi.message.CommonMessageData;
import com.bytedance.android.livesdkapi.message._CommonMessageData_ProtoDecoder;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _SubContractStatusMessage_ProtoDecoder implements C0IMD<SubContractStatusMessage> {
    @Override // X.C0IMD
    public final void LIZ(SubContractStatusMessage subContractStatusMessage) {
        SubInfo subInfo;
        SubLevel subLevel;
        SubContractStatusMessage subContractStatusMessage2 = subContractStatusMessage;
        CommonMessageData commonMessageData = subContractStatusMessage2.baseMessage;
        if (commonMessageData != null) {
            _CommonMessageData_ProtoDecoder.LJ(commonMessageData);
        }
        PushContractStatusResult pushContractStatusResult = subContractStatusMessage2.data;
        if (pushContractStatusResult != null && (subInfo = pushContractStatusResult.subInfo) != null && (subLevel = subInfo.subLevel) != null) {
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
    public final SubContractStatusMessage LIZJ(C1516680pZS c1516680pZS) throws IOException {
        SubContractStatusMessage subContractStatusMessage = new SubContractStatusMessage();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        if (iLJI != 3) {
                            C1516700pZU.LJ(c1516680pZS);
                        } else {
                            subContractStatusMessage.extra = _SubContractStatusMessage_ResponseExtra_ProtoDecoder.LIZLLL(c1516680pZS);
                        }
                    } else {
                        subContractStatusMessage.data = _PushContractStatusResult_ProtoDecoder.LIZLLL(c1516680pZS);
                    }
                } else {
                    subContractStatusMessage.baseMessage = _CommonMessageData_ProtoDecoder.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return subContractStatusMessage;
            }
        }
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, SubContractStatusMessage subContractStatusMessage, List list) {
    }
}
