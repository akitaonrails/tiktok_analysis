package com.bytedance.android.livesdk.model.message;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _AtmosphereTagInfo_ProtoDecoder implements C0IMD<AtmosphereTagInfo> {
    public static AtmosphereTagInfo LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        AtmosphereTagInfo atmosphereTagInfo = new AtmosphereTagInfo();
        atmosphereTagInfo.atmosphereTags = new ArrayList();
        atmosphereTagInfo.pinAtmosphereTags = new ArrayList();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        if (iLJI != 3) {
                            C1516700pZU.LJ(c1516680pZS);
                        } else {
                            atmosphereTagInfo.pinAtmosphereTags.add(_ProductAtmosphereTag_ProtoDecoder.LIZLLL(c1516680pZS));
                        }
                    } else {
                        atmosphereTagInfo.atmosphereTags.add(_ProductAtmosphereTag_ProtoDecoder.LIZLLL(c1516680pZS));
                    }
                } else {
                    atmosphereTagInfo.tagType = c1516680pZS.LJIIJ();
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return atmosphereTagInfo;
            }
        }
    }

    public static void LJ(AtmosphereTagInfo atmosphereTagInfo) {
        List<ProductAtmosphereTag> list = atmosphereTagInfo.atmosphereTags;
        if (list == null) {
            atmosphereTagInfo.atmosphereTags = new ArrayList();
        } else if (!list.isEmpty()) {
            Iterator<ProductAtmosphereTag> it2 = atmosphereTagInfo.atmosphereTags.iterator();
            while (it2.hasNext()) {
                it2.next();
            }
        }
        List<ProductAtmosphereTag> list2 = atmosphereTagInfo.pinAtmosphereTags;
        if (list2 == null) {
            atmosphereTagInfo.pinAtmosphereTags = new ArrayList();
        } else {
            if (list2.isEmpty()) {
                return;
            }
            Iterator<ProductAtmosphereTag> it3 = atmosphereTagInfo.pinAtmosphereTags.iterator();
            while (it3.hasNext()) {
                it3.next();
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(AtmosphereTagInfo atmosphereTagInfo) {
        LJ(atmosphereTagInfo);
    }

    @Override // X.C0IMD
    public final AtmosphereTagInfo LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, AtmosphereTagInfo atmosphereTagInfo, List list) {
    }
}
