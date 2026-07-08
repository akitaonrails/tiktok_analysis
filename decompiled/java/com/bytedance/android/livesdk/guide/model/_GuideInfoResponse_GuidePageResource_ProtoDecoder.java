package com.bytedance.android.livesdk.guide.model;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model._ImageModel_ProtoDecoder;
import com.bytedance.android.livesdk.guide.model.GuideInfoResponse;
import com.bytedance.android.livesdk.model.message.common.Text;
import com.bytedance.android.livesdk.model.message.common._Text_ProtoDecoder;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _GuideInfoResponse_GuidePageResource_ProtoDecoder implements C0IMD<GuideInfoResponse.GuidePageResource> {
    public static GuideInfoResponse.GuidePageResource LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        GuideInfoResponse.GuidePageResource guidePageResource = new GuideInfoResponse.GuidePageResource();
        guidePageResource.texts = new ArrayList();
        guidePageResource.animations = new ArrayList();
        guidePageResource.icons = new ArrayList();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        if (iLJI != 3) {
                            C1516700pZU.LJ(c1516680pZS);
                        } else {
                            guidePageResource.animations.add(_ImageModel_ProtoDecoder.LIZLLL(c1516680pZS));
                        }
                    } else {
                        guidePageResource.icons.add(_ImageModel_ProtoDecoder.LIZLLL(c1516680pZS));
                    }
                } else {
                    guidePageResource.texts.add(_Text_ProtoDecoder.LIZLLL(c1516680pZS));
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return guidePageResource;
            }
        }
    }

    public static void LJ(GuideInfoResponse.GuidePageResource guidePageResource) {
        List<Text> list = guidePageResource.texts;
        if (list == null) {
            guidePageResource.texts = new ArrayList();
        } else if (!list.isEmpty()) {
            for (Text text : guidePageResource.texts) {
                if (text != null) {
                    _Text_ProtoDecoder.LJ(text);
                }
            }
        }
        List<ImageModel> list2 = guidePageResource.icons;
        if (list2 == null) {
            guidePageResource.icons = new ArrayList();
        } else if (!list2.isEmpty()) {
            for (ImageModel imageModel : guidePageResource.icons) {
                if (imageModel != null) {
                    _ImageModel_ProtoDecoder.LJ(imageModel);
                }
            }
        }
        List<ImageModel> list3 = guidePageResource.animations;
        if (list3 == null) {
            guidePageResource.animations = new ArrayList();
            return;
        }
        if (list3.isEmpty()) {
            return;
        }
        for (ImageModel imageModel2 : guidePageResource.animations) {
            if (imageModel2 != null) {
                _ImageModel_ProtoDecoder.LJ(imageModel2);
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(GuideInfoResponse.GuidePageResource guidePageResource) {
        LJ(guidePageResource);
    }

    @Override // X.C0IMD
    public final GuideInfoResponse.GuidePageResource LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, GuideInfoResponse.GuidePageResource guidePageResource, List list) {
    }
}
