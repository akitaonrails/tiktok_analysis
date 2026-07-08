package com.ss.android.ugc.aweme.commercialize.utils;

import X.AbstractC1025070cmX;
import X.C1021860chM;
import X.C1022620cia;
import X.C1022820ciu;
import X.C1024720cly;
import X.C1024750cm1;
import X.C1025720cna;
import X.C1026310coX;
import X.C1026350cob;
import X.C1027410cqJ;
import X.C1027580cqa;
import X.C1028090crP;
import X.C1388190mED;
import X.C13LP;
import X.C1483410ohn;
import X.C19EG;
import X.C2184171Adz;
import X.C2188811AlT;
import X.C2201691BEx;
import X.InterfaceC1036270d4b;
import android.content.Context;
import android.text.TextUtils;
import android.view.MotionEvent;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.commercialize.hybrid.api.web.model.AdlpExtraModel;
import com.ss.android.ugc.aweme.commercialize.model.NativeSiteConfig;
import com.ss.android.ugc.aweme.commercialize.model.feed.anchor.AnchorInfoStruct;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.landpage.popup.IAdLandingPagePopUpService;
import com.ss.android.ugc.aweme.utils.IAdOpenHelper;
import java.lang.ref.Reference;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.AwS630S0100000_16;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes17.dex */
public final class AdOpenHelperImpl implements IAdOpenHelper {
    public boolean LIZ;
    public final String LIZIZ;

    public AdOpenHelperImpl() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AdOpenHelperImpl");
        sbLIZ.append(hashCode());
        this.LIZIZ = C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // com.ss.android.ugc.aweme.utils.IAdOpenHelper
    public final boolean LIZIZ(int i) {
        return AbstractC1025070cmX.LJIIJJI(i);
    }

    @Override // com.ss.android.ugc.aweme.utils.IAdOpenHelper
    public final void LIZJ(final Context context, Aweme aweme) {
        AnchorInfoStruct anchorAdInfo;
        boolean z;
        String webUrl;
        String str;
        long jLongValue;
        long jLongValue2;
        List<String> list;
        String str2;
        String nativeSiteCustomData;
        AwemeRawAd awemeRawAd = aweme.getAwemeRawAd();
        this.LIZ = C1483410ohn.LJLJJI().isPlaying();
        if (awemeRawAd != null && (anchorAdInfo = awemeRawAd.getAnchorAdInfo()) != null) {
            String nativeSiteAdInfo = anchorAdInfo.getNativeSiteAdInfo();
            if (nativeSiteAdInfo != null && nativeSiteAdInfo.length() != 0 && anchorAdInfo.getNativeSiteConfig() != null && (nativeSiteCustomData = anchorAdInfo.getNativeSiteCustomData()) != null && nativeSiteCustomData.length() != 0) {
                z = true;
            } else {
                z = false;
            }
            String str3 = "";
            if (z) {
                C1022620cia.LIZ("AdOpenHelperImpl", "[onAdAnchorClick] try to open lynx page");
                C1027580cqa c1027580cqa = new C1027580cqa();
                NativeSiteConfig nativeSiteConfig = anchorAdInfo.getNativeSiteConfig();
                if (nativeSiteConfig != null) {
                    str = nativeSiteConfig.lynxScheme;
                } else {
                    str = null;
                }
                c1027580cqa.LJJJIL(str);
                c1027580cqa.LJ(awemeRawAd);
                c1027580cqa.LIZLLL(aweme.getAid());
                c1027580cqa.LJJIJL("draw_ad");
                Long adId = awemeRawAd.getAdId();
                long jLongValue3 = 0;
                if (adId != null) {
                    jLongValue = adId.longValue();
                } else {
                    jLongValue = 0;
                }
                c1027580cqa.LIZ(jLongValue);
                Long creativeId = awemeRawAd.getCreativeId();
                if (creativeId != null) {
                    jLongValue2 = creativeId.longValue();
                } else {
                    jLongValue2 = 0;
                }
                c1027580cqa.LJI(jLongValue2);
                c1027580cqa.LJIJJ(awemeRawAd.getLogExtra());
                Long groupId = awemeRawAd.getGroupId();
                if (groupId != null) {
                    jLongValue3 = groupId.longValue();
                }
                c1027580cqa.LJIILIIL(jLongValue3);
                c1027580cqa.LJIJ(awemeRawAd.getWebviewType());
                c1027580cqa.LJIILJJIL(false);
                c1027580cqa.LJJJ("");
                String nativeSiteAdInfo2 = anchorAdInfo.getNativeSiteAdInfo();
                if (nativeSiteAdInfo2 == null) {
                    nativeSiteAdInfo2 = "";
                }
                c1027580cqa.LJJ(nativeSiteAdInfo2);
                String nativeSiteCustomData2 = anchorAdInfo.getNativeSiteCustomData();
                if (nativeSiteCustomData2 == null) {
                    nativeSiteCustomData2 = "";
                }
                c1027580cqa.LJJIFFI(nativeSiteCustomData2);
                NativeSiteConfig nativeSiteConfig2 = anchorAdInfo.getNativeSiteConfig();
                if (nativeSiteConfig2 != null && (list = nativeSiteConfig2.geckoChannel) != null && (str2 = (String) C13LP.LJJJLZIJ(0, list)) != null) {
                    str3 = str2;
                }
                c1027580cqa.LJIJJLI(str3);
                if (C1027410cqJ.LIZJ(context, c1027580cqa.LIZ).LIZ()) {
                    C1022820ciu c1022820ciuLIZLLL = C2184171Adz.LIZLLL("draw_ad", "click", aweme.getAwemeRawAd());
                    c1022820ciuLIZLLL.LIZJ("anchor", "refer");
                    c1022820ciuLIZLLL.LJII();
                    UrlModel clickTrackUrlList = awemeRawAd.getClickTrackUrlList();
                    Long creativeId2 = awemeRawAd.getCreativeId();
                    String logExtra = awemeRawAd.getLogExtra();
                    new AwS630S0100000_16(awemeRawAd, 60);
                    C2201691BEx.LIZ("click", clickTrackUrlList, creativeId2, logExtra);
                    return;
                }
            } else if (Intrinsics.LJFF(awemeRawAd.getType(), "web") && anchorAdInfo.getWebStyleType() == 6 && (webUrl = awemeRawAd.getWebUrl()) != null) {
                if (!TextUtils.isEmpty(webUrl)) {
                    str3 = webUrl;
                }
                if (AbstractC1025070cmX.LJIIL(UriProtector.parse(str3))) {
                    final IAdLandingPagePopUpService iAdLandingPagePopUpService = (IAdLandingPagePopUpService) ServiceManager.get().getService(IAdLandingPagePopUpService.class);
                    AdlpExtraModel adlpExtraModelLIZ = C1028090crP.LIZ(aweme, null, 0, C1026350cob.LIZLLL(58), null, null, null, null);
                    Boolean bool = Boolean.FALSE;
                    C1026310coX c1026310coX = new C1026310coX(webUrl, awemeRawAd, adlpExtraModelLIZ, false, new C1025720cna(0.7f, bool, bool, 3, null, -1, -1, null), null);
                    C19EG c19egLIZIZ = C1388190mED.LIZIZ(context);
                    if (c19egLIZIZ != null) {
                        C1022620cia.LIZ("AdOpenHelperImpl", "[onAdAnchorClick] web url, open in 7 split-screen");
                        ((C1024750cm1) C1024720cly.LIZ).LIZ(context, this.LIZIZ, true);
                        C1022820ciu c1022820ciuLIZLLL2 = C2184171Adz.LIZLLL("draw_ad", "click", c1026310coX.getAwemeRawAd());
                        c1022820ciuLIZLLL2.LIZJ("anchor", "refer");
                        c1022820ciuLIZLLL2.LJII();
                        iAdLandingPagePopUpService.LJIIJ(58, c19egLIZIZ, new InterfaceC1036270d4b() { // from class: X.0clx
                            @Override // X.InterfaceC1036270d4b
                            public final void Gn(MotionEvent motionEvent) {
                            }

                            @Override // X.InterfaceC1036270d4b
                            public final void LLLFFI(TuxSheet tuxSheet, float f) {
                            }

                            @Override // X.InterfaceC1036270d4b
                            public final void Pu(InterfaceC1034470d1h interfaceC1034470d1h) {
                            }

                            @Override // X.InterfaceC1036270d4b
                            public final void Rg(InterfaceC1034470d1h interfaceC1034470d1h) {
                            }

                            @Override // X.InterfaceC1036270d4b
                            public final void V() {
                            }

                            @Override // X.InterfaceC1036270d4b
                            public final void Yc() {
                            }

                            @Override // X.InterfaceC1036270d4b
                            public final void ni(TuxSheet tuxSheet, InterfaceC1034470d1h interfaceC1034470d1h) {
                            }

                            @Override // X.InterfaceC1036270d4b
                            public final void s8(TuxSheet tuxSheet, InterfaceC1034470d1h interfaceC1034470d1h, String str4) {
                            }

                            @Override // X.InterfaceC1036270d4b
                            public final void LLLLIIIILLL(TuxSheet tuxSheet, int i) {
                                if (i != 3) {
                                    if (i != 4) {
                                        if (i == 5) {
                                            if (this.LL.LIZ) {
                                                C1022620cia.LIZ("AdOpenHelperImpl", "[onStateChanged] close page, resume play");
                                                C1483410ohn.LJLJJI().LJIILLIIL();
                                            } else {
                                                C1022620cia.LIZ("AdOpenHelperImpl", "[onStateChanged] close page, continue pause");
                                            }
                                            ((C1024750cm1) C1024720cly.LIZ).LIZ(context, this.LL.LIZIZ, false);
                                            this.LL.LIZ = false;
                                            return;
                                        }
                                        return;
                                    }
                                    if (this.LL.LIZ) {
                                        C1024750cm1 c1024750cm1 = (C1024750cm1) C1024720cly.LIZ;
                                        c1024750cm1.getClass();
                                        if (C1474810oTv.LJJIJIIJIL()) {
                                            for (Reference reference : (CopyOnWriteArrayList) c1024750cm1.LIZ) {
                                                if (reference != null && reference.get() != null && ((InterfaceC1024730clz) reference.get()).LIZ()) {
                                                    C1022620cia.LIZ("AdOpenHelperImpl", "[onStateChanged] 7-split screen, resume play");
                                                    C1483410ohn.LJLJJI().LJIILLIIL();
                                                    return;
                                                }
                                            }
                                        }
                                    }
                                    C1022620cia.LIZ("AdOpenHelperImpl", "[onStateChanged] 7-split screen, continue pause");
                                    return;
                                }
                                C1022620cia.LIZ("AdOpenHelperImpl", "[onStateChanged] full screen, pause play");
                                C1483410ohn.LJLJJI().LIZ();
                            }

                            @Override // X.InterfaceC1036270d4b
                            public final void ha(TuxSheet tuxSheet, InterfaceC1034470d1h interfaceC1034470d1h, String str4, String str5) {
                                if (this.LL.LIZ) {
                                    C1022620cia.LIZ("AdOpenHelperImpl", "[onClose] close page, resume play");
                                    C1483410ohn.LJLJJI().LJIILLIIL();
                                } else {
                                    C1022620cia.LIZ("AdOpenHelperImpl", "[onClose] close page, continue pause");
                                }
                                ((C1024750cm1) C1024720cly.LIZ).LIZ(context, this.LL.LIZIZ, false);
                                this.LL.LIZ = false;
                                IAdLandingPagePopUpService iAdLandingPagePopUpService2 = iAdLandingPagePopUpService;
                                if (iAdLandingPagePopUpService2 != null) {
                                    iAdLandingPagePopUpService2.LJIJ();
                                }
                            }
                        }, c1026310coX, null);
                        return;
                    }
                    return;
                }
            }
        }
        C1022620cia.LIZ("AdOpenHelperImpl", "[onAdAnchorClick] go to cta button procedure");
        C1021860chM.LJJJI(context, aweme, 58, null);
    }

    @Override // com.ss.android.ugc.aweme.utils.IAdOpenHelper
    public final void LIZ(Context context, Aweme aweme, int i) {
        C1021860chM.LJJJI(context, aweme, i, null);
    }
}
