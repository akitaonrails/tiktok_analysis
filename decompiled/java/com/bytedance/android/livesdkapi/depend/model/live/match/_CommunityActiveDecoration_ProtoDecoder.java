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
public final class _CommunityActiveDecoration_ProtoDecoder implements C0IMD<CommunityActiveDecoration> {
    public static CommunityActiveDecoration LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        CommunityActiveDecoration communityActiveDecoration = new CommunityActiveDecoration();
        communityActiveDecoration.images = new HashMap();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        if (iLJI != 3) {
                            C1516700pZU.LJ(c1516680pZS);
                        } else {
                            long jLIZJ2 = c1516680pZS.LIZJ();
                            Integer numValueOf = null;
                            ImageModel imageModelLIZLLL = null;
                            while (true) {
                                int iLJI2 = c1516680pZS.LJI();
                                if (iLJI2 == -1) {
                                    break;
                                }
                                if (iLJI2 != 1) {
                                    if (iLJI2 == 2) {
                                        imageModelLIZLLL = _ImageModel_ProtoDecoder.LIZLLL(c1516680pZS);
                                    }
                                } else {
                                    numValueOf = Integer.valueOf(c1516680pZS.LJIIJ());
                                }
                            }
                            c1516680pZS.LJ(jLIZJ2);
                            if (numValueOf != null) {
                                if (imageModelLIZLLL != null) {
                                    communityActiveDecoration.images.put(numValueOf, imageModelLIZLLL);
                                } else {
                                    throw new IllegalStateException("Map value must not be null!");
                                }
                            } else {
                                throw new IllegalStateException("Map key must not be null!");
                            }
                        }
                    } else {
                        communityActiveDecoration.slotType = c1516680pZS.LJIIJ();
                    }
                } else {
                    communityActiveDecoration.decorationId = c1516680pZS.LJIIJJI();
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return communityActiveDecoration;
            }
        }
    }

    public static void LJ(CommunityActiveDecoration communityActiveDecoration) {
        Map<Integer, ImageModel> map = communityActiveDecoration.images;
        if (map == null) {
            communityActiveDecoration.images = new HashMap();
            return;
        }
        if (map.isEmpty()) {
            return;
        }
        Iterator<Map.Entry<Integer, ImageModel>> it2 = communityActiveDecoration.images.entrySet().iterator();
        while (it2.hasNext()) {
            ImageModel value = it2.next().getValue();
            if (value != null) {
                _ImageModel_ProtoDecoder.LJ(value);
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(CommunityActiveDecoration communityActiveDecoration) {
        LJ(communityActiveDecoration);
    }

    @Override // X.C0IMD
    public final CommunityActiveDecoration LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, CommunityActiveDecoration communityActiveDecoration, List list) {
    }
}
