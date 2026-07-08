package com.bytedance.android.livesdk.model.message;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model._ImageModel_ProtoDecoder;
import com.bytedance.android.livesdk.goody_bag.model.GoodyBagUserInfo;
import com.bytedance.android.livesdk.goody_bag.model.GoodyBagWinnerInfo;
import com.bytedance.android.livesdk.goody_bag.model._GoodyBagBaseInfo_ProtoDecoder;
import com.bytedance.android.livesdk.goody_bag.model._GoodyBagSkin_ProtoDecoder;
import com.bytedance.android.livesdk.goody_bag.model._GoodyBagWinnerInfo_ProtoDecoder;
import com.bytedance.android.livesdkapi.message.CommonMessageData;
import com.bytedance.android.livesdkapi.message._CommonMessageData_ProtoDecoder;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _GoodyBagMessage_ProtoDecoder implements C0IMD<GoodyBagMessage> {
    @Override // X.C0IMD
    public final void LIZ(GoodyBagMessage goodyBagMessage) {
        GoodyBagUserInfo goodyBagUserInfo;
        ImageModel imageModel;
        GoodyBagMessage goodyBagMessage2 = goodyBagMessage;
        CommonMessageData commonMessageData = goodyBagMessage2.baseMessage;
        if (commonMessageData != null) {
            _CommonMessageData_ProtoDecoder.LJ(commonMessageData);
        }
        List<GoodyBagWinnerInfo> list = goodyBagMessage2.winners;
        if (list == null) {
            goodyBagMessage2.winners = new ArrayList();
            return;
        }
        if (list.isEmpty()) {
            return;
        }
        for (GoodyBagWinnerInfo goodyBagWinnerInfo : goodyBagMessage2.winners) {
            if (goodyBagWinnerInfo != null && (goodyBagUserInfo = goodyBagWinnerInfo.userInfo) != null && (imageModel = goodyBagUserInfo.avatar) != null) {
                _ImageModel_ProtoDecoder.LJ(imageModel);
            }
        }
    }

    @Override // X.C0IMD
    public final GoodyBagMessage LIZJ(C1516680pZS c1516680pZS) throws IOException {
        GoodyBagMessage goodyBagMessage = new GoodyBagMessage();
        goodyBagMessage.winners = new ArrayList();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        if (iLJI != 3) {
                            if (iLJI != 4) {
                                if (iLJI != 5) {
                                    C1516700pZU.LJ(c1516680pZS);
                                } else {
                                    goodyBagMessage.goodyBagSkin = _GoodyBagSkin_ProtoDecoder.LIZLLL(c1516680pZS);
                                }
                            } else {
                                goodyBagMessage.type = c1516680pZS.LJIIJ();
                            }
                        } else {
                            goodyBagMessage.winners.add(_GoodyBagWinnerInfo_ProtoDecoder.LIZLLL(c1516680pZS));
                        }
                    } else {
                        goodyBagMessage.baseInfo = _GoodyBagBaseInfo_ProtoDecoder.LIZLLL(c1516680pZS);
                    }
                } else {
                    goodyBagMessage.baseMessage = _CommonMessageData_ProtoDecoder.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return goodyBagMessage;
            }
        }
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, GoodyBagMessage goodyBagMessage, List list) {
    }
}
