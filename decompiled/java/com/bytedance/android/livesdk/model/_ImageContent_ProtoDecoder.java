package com.bytedance.android.livesdk.model;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model._ImageModel_ProtoDecoder;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _ImageContent_ProtoDecoder implements C0IMD<ImageContent> {
    public static ImageContent LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        ImageContent imageContent = new ImageContent();
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
                                    imageContent.primaryColor = C1516700pZU.LIZLLL(c1516680pZS);
                                }
                            } else {
                                imageContent.image = _ImageModel_ProtoDecoder.LIZLLL(c1516680pZS);
                            }
                        } else {
                            imageContent.fillMode = c1516680pZS.LJIIJ();
                        }
                    } else {
                        imageContent.imageHeight = _SizeSpec_ProtoDecoder.LIZLLL(c1516680pZS);
                    }
                } else {
                    imageContent.imageWidth = _SizeSpec_ProtoDecoder.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return imageContent;
            }
        }
    }

    public static void LJ(ImageContent imageContent) {
        SizeSpec sizeSpec = imageContent.imageWidth;
        SizeSpec sizeSpec2 = imageContent.imageHeight;
        ImageModel imageModel = imageContent.image;
        if (imageModel != null) {
            _ImageModel_ProtoDecoder.LJ(imageModel);
        }
    }

    @Override // X.C0IMD
    public final void LIZ(ImageContent imageContent) {
        LJ(imageContent);
    }

    @Override // X.C0IMD
    public final ImageContent LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, ImageContent imageContent, List list) {
    }
}
