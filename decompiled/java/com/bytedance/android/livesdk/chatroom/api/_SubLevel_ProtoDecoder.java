package com.bytedance.android.livesdk.chatroom.api;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model._ImageModel_ProtoDecoder;
import com.bytedance.android.live.base.model.user.BadgeStruct;
import com.bytedance.android.live.base.model.user._BadgeStruct_ProtoDecoder;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _SubLevel_ProtoDecoder implements C0IMD<SubLevel> {
    public static SubLevel LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        SubLevel subLevel = new SubLevel();
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
                                    subLevel.badgeStruct = _BadgeStruct_ProtoDecoder.LIZLLL(c1516680pZS);
                                }
                            } else {
                                subLevel.badge = _LevelBadge_ProtoDecoder.LIZLLL(c1516680pZS);
                            }
                        } else {
                            subLevel.monthLimit = Integer.valueOf(c1516680pZS.LJIIJ());
                        }
                    } else {
                        subLevel.desc = C1516700pZU.LIZLLL(c1516680pZS);
                    }
                } else {
                    subLevel.level = Integer.valueOf(c1516680pZS.LJIIJ());
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return subLevel;
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(SubLevel subLevel) {
        SubLevel subLevel2 = subLevel;
        LevelBadge levelBadge = subLevel2.badge;
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
        BadgeStruct badgeStruct = subLevel2.badgeStruct;
        if (badgeStruct != null) {
            _BadgeStruct_ProtoDecoder.LJ(badgeStruct);
        }
    }

    @Override // X.C0IMD
    public final SubLevel LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, SubLevel subLevel, List list) {
    }
}
