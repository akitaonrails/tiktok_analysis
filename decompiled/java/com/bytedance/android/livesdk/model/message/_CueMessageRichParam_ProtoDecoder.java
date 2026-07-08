package com.bytedance.android.livesdk.model.message;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model._ImageModel_ProtoDecoder;
import com.bytedance.android.live.base.model.user.BadgeStruct;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.base.model.user._BadgeStruct_ProtoDecoder;
import com.bytedance.android.live.base.model.user._User_ProtoDecoder;
import com.bytedance.android.livesdk.model.message.common.Text;
import com.bytedance.android.livesdk.model.message.common._Text_ProtoDecoder;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _CueMessageRichParam_ProtoDecoder implements C0IMD<CueMessageRichParam> {
    public static CueMessageRichParam LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        CueMessageRichParam cueMessageRichParam = new CueMessageRichParam();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                switch (iLJI) {
                    case 1:
                        cueMessageRichParam.type = c1516680pZS.LJIIJ();
                        break;
                    case 2:
                        cueMessageRichParam.image = _ImageModel_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 3:
                        cueMessageRichParam.paramText = _Text_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 4:
                        cueMessageRichParam.intervalTime = c1516680pZS.LJIIJJI();
                        break;
                    case 5:
                        cueMessageRichParam.intervalDay = c1516680pZS.LJIIJJI();
                        break;
                    case 6:
                        cueMessageRichParam.user = _User_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 7:
                        cueMessageRichParam.badge = _BadgeStruct_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    default:
                        C1516700pZU.LJ(c1516680pZS);
                        break;
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return cueMessageRichParam;
            }
        }
    }

    public static void LJ(CueMessageRichParam cueMessageRichParam) {
        ImageModel imageModel = cueMessageRichParam.image;
        if (imageModel != null) {
            _ImageModel_ProtoDecoder.LJ(imageModel);
        }
        Text text = cueMessageRichParam.paramText;
        if (text != null) {
            _Text_ProtoDecoder.LJ(text);
        }
        User user = cueMessageRichParam.user;
        if (user != null) {
            _User_ProtoDecoder.LJ(user);
        }
        BadgeStruct badgeStruct = cueMessageRichParam.badge;
        if (badgeStruct != null) {
            _BadgeStruct_ProtoDecoder.LJ(badgeStruct);
        }
    }

    @Override // X.C0IMD
    public final void LIZ(CueMessageRichParam cueMessageRichParam) {
        LJ(cueMessageRichParam);
    }

    @Override // X.C0IMD
    public final CueMessageRichParam LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, CueMessageRichParam cueMessageRichParam, List list) {
    }
}
