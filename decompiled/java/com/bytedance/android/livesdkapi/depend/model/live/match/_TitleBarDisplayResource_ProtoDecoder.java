package com.bytedance.android.livesdkapi.depend.model.live.match;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model._ImageModel_ProtoDecoder;
import com.bytedance.android.livesdk.model.message.common.Text;
import com.bytedance.android.livesdk.model.message.common._Text_ProtoDecoder;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _TitleBarDisplayResource_ProtoDecoder implements C0IMD<TitleBarDisplayResource> {
    public static TitleBarDisplayResource LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        TitleBarDisplayResource titleBarDisplayResource = new TitleBarDisplayResource();
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
                                    titleBarDisplayResource.durationMs = c1516680pZS.LJIIJJI();
                                }
                            } else {
                                titleBarDisplayResource.rightIconSchemaUrl = C1516700pZU.LIZLLL(c1516680pZS);
                            }
                        } else {
                            titleBarDisplayResource.rightIcon = _ImageModel_ProtoDecoder.LIZLLL(c1516680pZS);
                        }
                    } else {
                        titleBarDisplayResource.contentText = _Text_ProtoDecoder.LIZLLL(c1516680pZS);
                    }
                } else {
                    titleBarDisplayResource.leftIcon = _ImageModel_ProtoDecoder.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return titleBarDisplayResource;
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(TitleBarDisplayResource titleBarDisplayResource) {
        TitleBarDisplayResource titleBarDisplayResource2 = titleBarDisplayResource;
        ImageModel imageModel = titleBarDisplayResource2.leftIcon;
        if (imageModel != null) {
            _ImageModel_ProtoDecoder.LJ(imageModel);
        }
        Text text = titleBarDisplayResource2.contentText;
        if (text != null) {
            _Text_ProtoDecoder.LJ(text);
        }
        ImageModel imageModel2 = titleBarDisplayResource2.rightIcon;
        if (imageModel2 != null) {
            _ImageModel_ProtoDecoder.LJ(imageModel2);
        }
    }

    @Override // X.C0IMD
    public final TitleBarDisplayResource LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, TitleBarDisplayResource titleBarDisplayResource, List list) {
    }
}
