package com.bytedance.android.livesdkapi.depend.model.live;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model._ImageModel_ProtoDecoder;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _LikeIconInfo_ProtoDecoder implements C0IMD<LikeIconInfo> {
    public static LikeIconInfo LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        LikeIconInfo likeIconInfo = new LikeIconInfo();
        likeIconInfo.iconsSelf = new ArrayList();
        likeIconInfo.icons = new ArrayList();
        likeIconInfo.defaultIcons = new ArrayList();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        if (iLJI != 3) {
                            C1516700pZU.LJ(c1516680pZS);
                        } else {
                            likeIconInfo.defaultIcons.add(_ImageModel_ProtoDecoder.LIZLLL(c1516680pZS));
                        }
                    } else {
                        likeIconInfo.iconsSelf.add(_ImageModel_ProtoDecoder.LIZLLL(c1516680pZS));
                    }
                } else {
                    likeIconInfo.icons.add(_ImageModel_ProtoDecoder.LIZLLL(c1516680pZS));
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return likeIconInfo;
            }
        }
    }

    public static void LJ(LikeIconInfo likeIconInfo) {
        List<ImageModel> list = likeIconInfo.icons;
        if (list == null) {
            likeIconInfo.icons = new ArrayList();
        } else if (!list.isEmpty()) {
            for (ImageModel imageModel : likeIconInfo.icons) {
                if (imageModel != null) {
                    _ImageModel_ProtoDecoder.LJ(imageModel);
                }
            }
        }
        List<ImageModel> list2 = likeIconInfo.iconsSelf;
        if (list2 == null) {
            likeIconInfo.iconsSelf = new ArrayList();
        } else if (!list2.isEmpty()) {
            for (ImageModel imageModel2 : likeIconInfo.iconsSelf) {
                if (imageModel2 != null) {
                    _ImageModel_ProtoDecoder.LJ(imageModel2);
                }
            }
        }
        List<ImageModel> list3 = likeIconInfo.defaultIcons;
        if (list3 == null) {
            likeIconInfo.defaultIcons = new ArrayList();
            return;
        }
        if (list3.isEmpty()) {
            return;
        }
        for (ImageModel imageModel3 : likeIconInfo.defaultIcons) {
            if (imageModel3 != null) {
                _ImageModel_ProtoDecoder.LJ(imageModel3);
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(LikeIconInfo likeIconInfo) {
        LJ(likeIconInfo);
    }

    @Override // X.C0IMD
    public final LikeIconInfo LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, LikeIconInfo likeIconInfo, List list) {
    }
}
