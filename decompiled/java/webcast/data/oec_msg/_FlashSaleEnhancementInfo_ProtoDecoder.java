package webcast.data.oec_msg;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model._ImageModel_ProtoDecoder;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _FlashSaleEnhancementInfo_ProtoDecoder implements C0IMD<FlashSaleEnhancementInfo> {
    public static FlashSaleEnhancementInfo LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        FlashSaleEnhancementInfo flashSaleEnhancementInfo = new FlashSaleEnhancementInfo();
        flashSaleEnhancementInfo.buyerInfos = new ArrayList();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        if (iLJI != 3) {
                            C1516700pZU.LJ(c1516680pZS);
                        } else {
                            flashSaleEnhancementInfo.enhancementTextInfo = _EnhancementTextInfo_ProtoDecoder.LIZLLL(c1516680pZS);
                        }
                    } else {
                        flashSaleEnhancementInfo.buyerInfos.add(_UserInfo_ProtoDecoder.LIZLLL(c1516680pZS));
                    }
                } else {
                    flashSaleEnhancementInfo.stockShowStatus = c1516680pZS.LJIIJ();
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return flashSaleEnhancementInfo;
            }
        }
    }

    public static void LJ(FlashSaleEnhancementInfo flashSaleEnhancementInfo) {
        ImageModel imageModel;
        List<UserInfo> list = flashSaleEnhancementInfo.buyerInfos;
        if (list == null) {
            flashSaleEnhancementInfo.buyerInfos = new ArrayList();
        } else if (!list.isEmpty()) {
            for (UserInfo userInfo : flashSaleEnhancementInfo.buyerInfos) {
                if (userInfo != null && (imageModel = userInfo.avatar) != null) {
                    _ImageModel_ProtoDecoder.LJ(imageModel);
                }
            }
        }
        EnhancementTextInfo enhancementTextInfo = flashSaleEnhancementInfo.enhancementTextInfo;
        if (enhancementTextInfo != null) {
            _EnhancementTextInfo_ProtoDecoder.LJ(enhancementTextInfo);
        }
    }

    @Override // X.C0IMD
    public final void LIZ(FlashSaleEnhancementInfo flashSaleEnhancementInfo) {
        LJ(flashSaleEnhancementInfo);
    }

    @Override // X.C0IMD
    public final FlashSaleEnhancementInfo LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, FlashSaleEnhancementInfo flashSaleEnhancementInfo, List list) {
    }
}
