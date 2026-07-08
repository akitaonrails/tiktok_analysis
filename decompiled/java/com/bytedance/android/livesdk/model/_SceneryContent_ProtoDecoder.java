package com.bytedance.android.livesdk.model;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _SceneryContent_ProtoDecoder implements C0IMD<SceneryContent> {
    public static SceneryContent LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        SceneryContent sceneryContent = new SceneryContent();
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
                                    sceneryContent.scenerySource = C1516700pZU.LIZLLL(c1516680pZS);
                                }
                            } else {
                                sceneryContent.imageTransition = c1516680pZS.LJIIJ();
                            }
                        } else {
                            sceneryContent.templateImageContent = _ImageContent_ProtoDecoder.LIZLLL(c1516680pZS);
                        }
                    } else {
                        sceneryContent.imageContent = _ImageContent_ProtoDecoder.LIZLLL(c1516680pZS);
                    }
                } else {
                    sceneryContent.sceneryType = c1516680pZS.LJIIJ();
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return sceneryContent;
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(SceneryContent sceneryContent) {
        SceneryContent sceneryContent2 = sceneryContent;
        ImageContent imageContent = sceneryContent2.imageContent;
        if (imageContent != null) {
            _ImageContent_ProtoDecoder.LJ(imageContent);
        }
        ImageContent imageContent2 = sceneryContent2.templateImageContent;
        if (imageContent2 != null) {
            _ImageContent_ProtoDecoder.LJ(imageContent2);
        }
    }

    @Override // X.C0IMD
    public final SceneryContent LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, SceneryContent sceneryContent, List list) {
    }
}
