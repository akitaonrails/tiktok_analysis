package com.bytedance.android.livesdk.model;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model._ImageModel_ProtoDecoder;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _ShortTouchPreviewSetting_ProtoDecoder implements C0IMD<ShortTouchPreviewSetting> {
    public static ShortTouchPreviewSetting LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        ShortTouchPreviewSetting shortTouchPreviewSetting = new ShortTouchPreviewSetting();
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
                                    shortTouchPreviewSetting.discountText = C1516700pZU.LIZLLL(c1516680pZS);
                                }
                            } else {
                                shortTouchPreviewSetting.amountText = C1516700pZU.LIZLLL(c1516680pZS);
                            }
                        } else {
                            shortTouchPreviewSetting.previewImage = _ImageModel_ProtoDecoder.LIZLLL(c1516680pZS);
                        }
                    } else {
                        shortTouchPreviewSetting.previewShowTime = Long.valueOf(c1516680pZS.LJIIJJI());
                    }
                } else {
                    shortTouchPreviewSetting.previewSchema = C1516700pZU.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return shortTouchPreviewSetting;
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(ShortTouchPreviewSetting shortTouchPreviewSetting) {
        ImageModel imageModel = shortTouchPreviewSetting.previewImage;
        if (imageModel != null) {
            _ImageModel_ProtoDecoder.LJ(imageModel);
        }
    }

    @Override // X.C0IMD
    public final ShortTouchPreviewSetting LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, ShortTouchPreviewSetting shortTouchPreviewSetting, List list) {
    }
}
