package com.bytedance.android.livesdk.model.message;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model._ImageModel_ProtoDecoder;
import com.bytedance.android.live.base.model.user.BadgeStruct;
import com.bytedance.android.live.base.model.user._BadgeStruct_ProtoDecoder;
import com.bytedance.android.livesdk.model.message.common.Text;
import com.bytedance.android.livesdk.model.message.common._Text_ProtoDecoder;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _GuidePageResource_ProtoDecoder implements C0IMD<GuidePageResource> {
    public static GuidePageResource LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        GuidePageResource guidePageResource = new GuidePageResource();
        guidePageResource.badges = new ArrayList();
        guidePageResource.texts = new ArrayList();
        guidePageResource.buttonTexts = new ArrayList();
        guidePageResource.animations = new ArrayList();
        guidePageResource.icons = new ArrayList();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                switch (iLJI) {
                    case 1:
                        guidePageResource.texts.add(_Text_ProtoDecoder.LIZLLL(c1516680pZS));
                        break;
                    case 2:
                        guidePageResource.icons.add(_ImageModel_ProtoDecoder.LIZLLL(c1516680pZS));
                        break;
                    case 3:
                        guidePageResource.animations.add(_ImageModel_ProtoDecoder.LIZLLL(c1516680pZS));
                        break;
                    case 4:
                        guidePageResource.badges.add(_BadgeStruct_ProtoDecoder.LIZLLL(c1516680pZS));
                        break;
                    case 5:
                        guidePageResource.buttonTexts.add(_Text_ProtoDecoder.LIZLLL(c1516680pZS));
                        break;
                    case 6:
                        guidePageResource.iconStyleId = c1516680pZS.LJIIJJI();
                        break;
                    case 7:
                        guidePageResource.actionType = c1516680pZS.LJIIJJI();
                        break;
                    default:
                        C1516700pZU.LJ(c1516680pZS);
                        break;
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return guidePageResource;
            }
        }
    }

    public static void LJ(GuidePageResource guidePageResource) {
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
        } else if (!list3.isEmpty()) {
            for (ImageModel imageModel2 : guidePageResource.animations) {
                if (imageModel2 != null) {
                    _ImageModel_ProtoDecoder.LJ(imageModel2);
                }
            }
        }
        List<BadgeStruct> list4 = guidePageResource.badges;
        if (list4 == null) {
            guidePageResource.badges = new ArrayList();
        } else if (!list4.isEmpty()) {
            for (BadgeStruct badgeStruct : guidePageResource.badges) {
                if (badgeStruct != null) {
                    _BadgeStruct_ProtoDecoder.LJ(badgeStruct);
                }
            }
        }
        List<Text> list5 = guidePageResource.buttonTexts;
        if (list5 == null) {
            guidePageResource.buttonTexts = new ArrayList();
            return;
        }
        if (list5.isEmpty()) {
            return;
        }
        for (Text text2 : guidePageResource.buttonTexts) {
            if (text2 != null) {
                _Text_ProtoDecoder.LJ(text2);
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(GuidePageResource guidePageResource) {
        LJ(guidePageResource);
    }

    @Override // X.C0IMD
    public final GuidePageResource LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, GuidePageResource guidePageResource, List list) {
    }
}
