package com.bytedance.android.livesdkapi.depend.model.live.match;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model._ImageModel_ProtoDecoder;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class _CommunityHeartMeInfo_ProtoDecoder implements C0IMD<CommunityHeartMeInfo> {
    public static CommunityHeartMeInfo LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        CommunityHeartMeInfo communityHeartMeInfo = new CommunityHeartMeInfo();
        communityHeartMeInfo.slots = new HashMap();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        if (iLJI != 3) {
                            C1516700pZU.LJ(c1516680pZS);
                        } else {
                            communityHeartMeInfo.anchorCommunityLevel = c1516680pZS.LJIIJJI();
                        }
                    } else {
                        communityHeartMeInfo.thrownItemImage = _ImageModel_ProtoDecoder.LIZLLL(c1516680pZS);
                    }
                } else {
                    long jLIZJ2 = c1516680pZS.LIZJ();
                    Integer numValueOf = null;
                    CommunityActiveDecoration communityActiveDecorationLIZLLL = null;
                    while (true) {
                        int iLJI2 = c1516680pZS.LJI();
                        if (iLJI2 == -1) {
                            break;
                        }
                        if (iLJI2 != 1) {
                            if (iLJI2 == 2) {
                                communityActiveDecorationLIZLLL = _CommunityActiveDecoration_ProtoDecoder.LIZLLL(c1516680pZS);
                            }
                        } else {
                            numValueOf = Integer.valueOf(c1516680pZS.LJIIJ());
                        }
                    }
                    c1516680pZS.LJ(jLIZJ2);
                    if (numValueOf != null) {
                        if (communityActiveDecorationLIZLLL != null) {
                            communityHeartMeInfo.slots.put(numValueOf, communityActiveDecorationLIZLLL);
                        } else {
                            throw new IllegalStateException("Map value must not be null!");
                        }
                    } else {
                        throw new IllegalStateException("Map key must not be null!");
                    }
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return communityHeartMeInfo;
            }
        }
    }

    public static void LJ(CommunityHeartMeInfo communityHeartMeInfo) {
        Map<Integer, CommunityActiveDecoration> map = communityHeartMeInfo.slots;
        if (map == null) {
            communityHeartMeInfo.slots = new HashMap();
        } else if (!map.isEmpty()) {
            Iterator<Map.Entry<Integer, CommunityActiveDecoration>> it2 = communityHeartMeInfo.slots.entrySet().iterator();
            while (it2.hasNext()) {
                CommunityActiveDecoration value = it2.next().getValue();
                if (value != null) {
                    _CommunityActiveDecoration_ProtoDecoder.LJ(value);
                }
            }
        }
        ImageModel imageModel = communityHeartMeInfo.thrownItemImage;
        if (imageModel != null) {
            _ImageModel_ProtoDecoder.LJ(imageModel);
        }
    }

    @Override // X.C0IMD
    public final void LIZ(CommunityHeartMeInfo communityHeartMeInfo) {
        LJ(communityHeartMeInfo);
    }

    @Override // X.C0IMD
    public final CommunityHeartMeInfo LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, CommunityHeartMeInfo communityHeartMeInfo, List list) {
    }
}
