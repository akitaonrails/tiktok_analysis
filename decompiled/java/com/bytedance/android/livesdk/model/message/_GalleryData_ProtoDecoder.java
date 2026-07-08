package com.bytedance.android.livesdk.model.message;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.livesdk.model.message.GalleryData;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class _GalleryData_ProtoDecoder implements C0IMD<GalleryData> {
    public static GalleryData LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        GalleryData galleryData = new GalleryData();
        galleryData.progress = new HashMap();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        if (iLJI != 3) {
                            C1516700pZU.LJ(c1516680pZS);
                        } else {
                            galleryData.endTimeInMs = c1516680pZS.LJIIJJI();
                        }
                    } else {
                        galleryData.period = c1516680pZS.LJIIJJI();
                    }
                } else {
                    long jLIZJ2 = c1516680pZS.LIZJ();
                    Long lValueOf = null;
                    GalleryData.TitleData titleDataLIZLLL = null;
                    while (true) {
                        int iLJI2 = c1516680pZS.LJI();
                        if (iLJI2 == -1) {
                            break;
                        }
                        if (iLJI2 != 1) {
                            if (iLJI2 == 2) {
                                titleDataLIZLLL = _GalleryData_TitleData_ProtoDecoder.LIZLLL(c1516680pZS);
                            }
                        } else {
                            lValueOf = Long.valueOf(c1516680pZS.LJIIJJI());
                        }
                    }
                    c1516680pZS.LJ(jLIZJ2);
                    if (lValueOf != null) {
                        if (titleDataLIZLLL != null) {
                            galleryData.progress.put(lValueOf, titleDataLIZLLL);
                        } else {
                            throw new IllegalStateException("Map value must not be null!");
                        }
                    } else {
                        throw new IllegalStateException("Map key must not be null!");
                    }
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return galleryData;
            }
        }
    }

    public static void LJ(GalleryData galleryData) {
        Map<Long, GalleryData.TitleData> map = galleryData.progress;
        if (map == null) {
            galleryData.progress = new HashMap();
        } else {
            if (map.isEmpty()) {
                return;
            }
            Iterator<Map.Entry<Long, GalleryData.TitleData>> it2 = galleryData.progress.entrySet().iterator();
            while (it2.hasNext()) {
                it2.next().getValue();
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(GalleryData galleryData) {
        LJ(galleryData);
    }

    @Override // X.C0IMD
    public final GalleryData LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, GalleryData galleryData, List list) {
    }
}
