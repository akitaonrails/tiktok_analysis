package com.bytedance.android.livesdkapi.depend.model.live.match;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model._ImageModel_ProtoDecoder;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _BattleUserInfo_ProtoDecoder implements C0IMD<BattleUserInfo> {
    public static BattleUserInfo LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        BattleUserInfo battleUserInfo = new BattleUserInfo();
        battleUserInfo.tags = new ArrayList();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        C1516700pZU.LJ(c1516680pZS);
                    } else {
                        battleUserInfo.tags.add(_BattleRivalTag_ProtoDecoder.LIZLLL(c1516680pZS));
                    }
                } else {
                    battleUserInfo.user = _BattleBaseUserInfo_ProtoDecoder.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return battleUserInfo;
            }
        }
    }

    public static void LJ(BattleUserInfo battleUserInfo) {
        ImageModel imageModel;
        BattleBaseUserInfo battleBaseUserInfo = battleUserInfo.user;
        if (battleBaseUserInfo != null && (imageModel = battleBaseUserInfo.avatarThumb) != null) {
            _ImageModel_ProtoDecoder.LJ(imageModel);
        }
        List<BattleRivalTag> list = battleUserInfo.tags;
        if (list == null) {
            battleUserInfo.tags = new ArrayList();
            return;
        }
        if (list.isEmpty()) {
            return;
        }
        for (BattleRivalTag battleRivalTag : battleUserInfo.tags) {
            if (battleRivalTag != null) {
                ImageModel imageModel2 = battleRivalTag.bgImage;
                if (imageModel2 != null) {
                    _ImageModel_ProtoDecoder.LJ(imageModel2);
                }
                ImageModel imageModel3 = battleRivalTag.iconImage;
                if (imageModel3 != null) {
                    _ImageModel_ProtoDecoder.LJ(imageModel3);
                }
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(BattleUserInfo battleUserInfo) {
        LJ(battleUserInfo);
    }

    @Override // X.C0IMD
    public final BattleUserInfo LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, BattleUserInfo battleUserInfo, List list) {
    }
}
