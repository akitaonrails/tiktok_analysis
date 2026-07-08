package com.bytedance.android.livesdk.model;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _ImageBackground_ProtoDecoder implements C0IMD<ImageBackground> {
    public static ImageBackground LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        ImageBackground imageBackground = new ImageBackground();
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
                                    imageBackground.repeat = c1516680pZS.LJIIJ();
                                }
                            } else {
                                imageBackground.alignmentY = c1516680pZS.LJIIJ();
                            }
                        } else {
                            imageBackground.alignmentX = c1516680pZS.LJIIJ();
                        }
                    } else {
                        imageBackground.capInsets = _EdgeInsets_ProtoDecoder.LIZLLL(c1516680pZS);
                    }
                } else {
                    imageBackground.image = _ImageContent_ProtoDecoder.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return imageBackground;
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(ImageBackground imageBackground) {
        ImageContent imageContent = imageBackground.image;
        if (imageContent != null) {
            _ImageContent_ProtoDecoder.LJ(imageContent);
        }
    }

    @Override // X.C0IMD
    public final ImageBackground LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, ImageBackground imageBackground, List list) {
    }
}
