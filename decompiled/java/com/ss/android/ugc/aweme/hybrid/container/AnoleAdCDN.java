package com.ss.android.ugc.aweme.hybrid.container;

import X.AbstractC1023470cjx;
import X.C1003700cE4;
import X.C1010370cOp;
import X.C1014110cUr;
import X.C1014130cUt;
import X.C1014150cUv;
import X.C1014160cUw;
import X.C1023960ckk;
import X.C123100dR;
import X.C2188811AlT;
import X.InterfaceC1018920ccc;
import android.text.TextUtils;
import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.commercialize.model.AnoleComponentModel;
import com.ss.android.ugc.aweme.commercialize.model.AnoleModel;
import com.ss.android.ugc.aweme.commercialize.model.IABLoadingFormatModel;
import com.ss.android.ugc.aweme.commercialize.model.LandingPageDataModel;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AwS595S0100000_16;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes17.dex */
public final class AnoleAdCDN implements InterfaceC1018920ccc<C1014160cUw> {
    public static final int $stable = 0;

    @Override // X.InterfaceC1018920ccc
    public C1014150cUv obtainGeckoConfig(C1014160cUw c1014160cUw) {
        String str;
        Boolean bool;
        Map<String, AnoleComponentModel> map;
        Collection<AnoleComponentModel> collectionValues;
        IABLoadingFormatModel iABLoadingFormatModelLIZ;
        String loadingFormatCdn;
        String loadingFormatCdn2;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (c1014160cUw == null || (str = c1014160cUw.LIZIZ) == null) {
            str = "preload";
        }
        if (c1014160cUw != null) {
            bool = c1014160cUw.LJ;
        } else {
            bool = null;
        }
        if (!Intrinsics.LJFF(bool, Boolean.TRUE)) {
            return new C1014130cUt(linkedHashMap);
        }
        AnoleModel anoleModel = c1014160cUw.LIZ.getAnoleModel();
        if (anoleModel != null && (map = anoleModel.components) != null && (collectionValues = map.values()) != null) {
            for (AnoleComponentModel anoleComponentModel : collectionValues) {
                if (C1010370cOp.LIZ(anoleComponentModel, str) && (iABLoadingFormatModelLIZ = C1003700cE4.LIZ(c1014160cUw.LIZ)) != null && iABLoadingFormatModelLIZ.getLandingFormatType() == 5) {
                    LandingPageDataModel landingPageData = iABLoadingFormatModelLIZ.getLandingPageData();
                    if (landingPageData != null) {
                        loadingFormatCdn = landingPageData.getLoadingFormatCdn();
                    } else {
                        loadingFormatCdn = null;
                    }
                    if (TextUtils.isEmpty(loadingFormatCdn)) {
                        AbstractC1023470cjx abstractC1023470cjx = new AbstractC1023470cjx() { // from class: X.0c9R
                            public final C1023630ckD<?>[] LIZ = new C1023630ckD[0];

                            {
                                Object[] objArr = new Object[0];
                            }

                            @Override // X.AbstractC1023380cjo, X.C1023640ckE
                            public final C1023630ckD<?>[] getInternalLogics() {
                                return this.LIZ;
                            }
                        };
                        C1023960ckk c1023960ckk = C1014110cUr.LIZ;
                        String creativeIdStr = c1014160cUw.LIZ.getCreativeIdStr();
                        if (creativeIdStr == null) {
                            creativeIdStr = "";
                        }
                        abstractC1023470cjx.logAd(c1023960ckk, creativeIdStr, c1014160cUw.LIZ.getLogExtra(), null, new AwS595S0100000_16(anoleComponentModel, 94));
                    }
                    LandingPageDataModel landingPageData2 = iABLoadingFormatModelLIZ.getLandingPageData();
                    if (landingPageData2 != null && (loadingFormatCdn2 = landingPageData2.getLoadingFormatCdn()) != null && C123100dR.LIZ(loadingFormatCdn2)) {
                        String str2 = anoleComponentModel.slotID;
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        SettingsManager.LIZLLL().getClass();
                        sbLIZ.append(SettingsManager.LJI("iab_loading_format_cdn_config", "https://tosv-sg.tiktok-row.org/obj/thrid-ladning-page/"));
                        sbLIZ.append(loadingFormatCdn2);
                        linkedHashMap.put(str2, C2188811AlT.LIZIZ(sbLIZ));
                    }
                }
            }
        }
        return new C1014130cUt(linkedHashMap);
    }
}
