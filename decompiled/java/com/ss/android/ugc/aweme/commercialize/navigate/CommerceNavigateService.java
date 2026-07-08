package com.ss.android.ugc.aweme.commercialize.navigate;

import X.C09C2;
import X.C1012460cSC;
import X.C1017070cZd;
import X.C1027250cq3;
import X.C1027260cq4;
import X.C1027270cq5;
import X.C1027460cqO;
import X.C1027480cqQ;
import X.C1027490cqR;
import X.C1027510cqT;
import X.C1027520cqU;
import X.C1027580cqa;
import X.C1027780cqu;
import X.C13BV;
import X.C13LP;
import X.C2188811AlT;
import X.InterfaceC1000280c8Y;
import X.InterfaceC1027870cr3;
import X.InterfaceC988500bpY;
import android.content.Context;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.ss.android.ugc.aweme.commercialize.ad.service.ICommercializeAdService;
import com.ss.android.ugc.aweme.commercialize.model.NativeSiteConfig;
import com.ss.android.ugc.aweme.commercialize.model.router.AdUnifyJumpModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import java.util.List;
import kotlin.jvm.internal.AwS595S0100000_16;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes17.dex */
public final class CommerceNavigateService implements ICommerceNavigateService {
    @Override // com.ss.android.ugc.aweme.commercialize.navigate.ICommerceNavigateService
    public final void LIZ(final Context context, Aweme aweme, C1027520cqU c1027520cqU) {
        Boolean boolValueOf;
        AwemeRawAd awemeRawAd;
        InterfaceC1000280c8Y interfaceC1000280c8Y;
        long jLongValue;
        String webUrl;
        int i;
        String str;
        List list;
        List<String> list2;
        C1012460cSC c1012460cSC = ICommerceNavigateService.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("isAd ");
        if (aweme != null) {
            boolValueOf = Boolean.valueOf(AwemeExtKt.isAdTraffic(aweme));
        } else {
            boolValueOf = null;
        }
        sbLIZ.append(boolValueOf);
        C2188811AlT.LIZIZ(sbLIZ);
        c1012460cSC.getClass();
        if (context == null || aweme == null || (awemeRawAd = aweme.getAwemeRawAd()) == null) {
            return;
        }
        if (Intrinsics.LJFF(awemeRawAd.getType(), "web")) {
            C1027580cqa c1027580cqa = new C1027580cqa();
            c1027580cqa.LIZLLL(c1027520cqU.LIZJ);
            c1027580cqa.LJ(awemeRawAd);
            String str2 = c1027520cqU.LIZLLL;
            C1027780cqu c1027780cqu = c1027580cqa.LIZ.LIZ;
            c1027780cqu.LJIIJ = str2;
            c1027780cqu.LJIIL = c1027520cqU.LJ;
            c1027580cqa.LIZIZ(String.valueOf(awemeRawAd.getAdType()));
            c1027580cqa.LJJIJL(c1027520cqU.LIZ);
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append(c1027520cqU.LIZ);
            sbLIZ2.append('_');
            sbLIZ2.append(c1027520cqU.LIZIZ);
            c1027580cqa.LJJIJ(C2188811AlT.LIZIZ(sbLIZ2));
            Long creativeId = awemeRawAd.getCreativeId();
            long jLongValue2 = 0;
            if (creativeId != null) {
                jLongValue = creativeId.longValue();
            } else {
                jLongValue = 0;
            }
            c1027580cqa.LJI(jLongValue);
            c1027580cqa.LJIJJ(awemeRawAd.getLogExtra());
            Long groupId = awemeRawAd.getGroupId();
            if (groupId != null) {
                jLongValue2 = groupId.longValue();
            }
            c1027580cqa.LJIILIIL(jLongValue2);
            NativeSiteConfig nativeSiteConfig = awemeRawAd.getNativeSiteConfig();
            if (nativeSiteConfig == null || (webUrl = nativeSiteConfig.lynxScheme) == null) {
                webUrl = awemeRawAd.getWebUrl();
            }
            c1027580cqa.LJJJIL(webUrl);
            boolean zBooleanValue = true;
            c1027580cqa.LJJII(true);
            String json = GsonProtectorUtils.toJson(C09C2.LIZ(), awemeRawAd.getBrowserConfig());
            String str3 = "";
            if (json == null) {
                json = "";
            }
            c1027580cqa.LJFF(json);
            c1027580cqa.LJJJ(awemeRawAd.getWebTitle());
            c1027580cqa.LJJIJIL(awemeRawAd.isReportEnable());
            Boolean useOrdinaryWeb_ = awemeRawAd.getUseOrdinaryWeb_();
            if (useOrdinaryWeb_ != null) {
                zBooleanValue = useOrdinaryWeb_.booleanValue();
            }
            c1027580cqa.LJJIJLIJ(zBooleanValue);
            c1027580cqa.LJJJI(awemeRawAd.getWebType());
            c1027580cqa.LIZ.LIZIZ.LJIILJJIL = System.currentTimeMillis();
            String landingPageInfo = awemeRawAd.getLandingPageInfo();
            if (landingPageInfo == null) {
                landingPageInfo = "";
            }
            c1027580cqa.LJIIZILJ(landingPageInfo);
            awemeRawAd.getNativeSiteConfig();
            c1027580cqa.LJJIJIIJI();
            String nativeSiteCustomData = awemeRawAd.getNativeSiteCustomData();
            if (nativeSiteCustomData == null) {
                nativeSiteCustomData = "";
            }
            c1027580cqa.LJJIFFI(nativeSiteCustomData);
            String nativeSiteAdInfo = awemeRawAd.getNativeSiteAdInfo();
            if (nativeSiteAdInfo == null) {
                nativeSiteAdInfo = "";
            }
            c1027580cqa.LJJ(nativeSiteAdInfo);
            String appData = awemeRawAd.getAppData();
            if (appData == null) {
                appData = "";
            }
            c1027580cqa.LJJI(appData);
            NativeSiteConfig nativeSiteConfig2 = awemeRawAd.getNativeSiteConfig();
            if (nativeSiteConfig2 != null) {
                i = nativeSiteConfig2.lynxLandingStyle;
            } else {
                i = 0;
            }
            c1027580cqa.LJIL(i);
            NativeSiteConfig nativeSiteConfig3 = awemeRawAd.getNativeSiteConfig();
            if (nativeSiteConfig3 == null || (list2 = nativeSiteConfig3.geckoChannel) == null || (str = (String) C13LP.LJJJLZIJ(0, list2)) == null) {
                str = "";
            }
            c1027580cqa.LJIJJLI(str);
            c1027580cqa.LJJIIJZLJL(awemeRawAd.getPreloadWeb());
            c1027580cqa.LIZ.LIZIZ.LJIIIZ = awemeRawAd.getPreloadWebNew();
            String channelName = awemeRawAd.getChannelName();
            if (channelName != null) {
                str3 = channelName;
            }
            c1027580cqa.LJJIZ(str3);
            NativeSiteConfig nativeSiteConfig4 = awemeRawAd.getNativeSiteConfig();
            if (nativeSiteConfig4 == null || (list = nativeSiteConfig4.secondPageGeckoChannel) == null) {
                list = C13BV.INSTANCE;
            }
            c1027580cqa.LJJIJIIJIL(list);
            c1027580cqa.LJJIIZ(awemeRawAd.getPreloadWebSecondPage());
            c1027580cqa.LJJIII(awemeRawAd.getOpenUrl());
            c1027580cqa.LJIIJ(awemeRawAd.getDownloadUrl());
            c1027580cqa.LJJIIZI(awemeRawAd.getQuickAppUrl());
            c1027580cqa.LJIIIZ(awemeRawAd.getOpenUrl());
            c1027580cqa.LJIIL(awemeRawAd.getWebUrl());
            c1027580cqa.LJIIJJI(awemeRawAd.getWebTitle());
            c1027580cqa.LJJIIJ(awemeRawAd.getPackageName());
            c1027580cqa.LIZJ(awemeRawAd.getAppName());
            c1027580cqa.LJII(awemeRawAd.isDisableDownloadDialog());
            c1027580cqa.LJIIIIZZ(awemeRawAd.getDownloadMode());
            c1027580cqa.LJIJI(awemeRawAd.getLinkMode());
            c1027580cqa.LJIILL(awemeRawAd.isSupportMultiple());
            C1027480cqQ c1027480cqQ = c1027580cqa.LIZ;
            C1027490cqR c1027490cqR = new C1027490cqR();
            c1027490cqR.LIZ.LIZJ = c1027480cqQ;
            c1027490cqR.LIZIZ(context);
            c1027490cqR.LIZ(new C1027260cq4());
            c1027490cqR.LIZ(new C1027250cq3() { // from class: X.0cqY
                @Override // X.AbstractC1027370cqF
                public final void LJFF(boolean z, C1027480cqQ c1027480cqQ2) {
                    C1027410cqJ.LJ(context, z, c1027480cqQ2);
                }
            });
            C1027460cqO c1027460cqO = C1027460cqO.LIZIZ;
            c1027490cqR.LIZ(c1027460cqO.LJIILIIL(null));
            c1027490cqR.LIZ(new C1027270cq5());
            c1027490cqR.LIZ(c1027460cqO.LJIIIIZZ(new AwS595S0100000_16(c1027480cqQ, 263)));
            c1027490cqR.LIZ.LIZ();
            return;
        }
        InterfaceC988500bpY interfaceC988500bpYQ = ((ICommercializeAdService) ServiceManager.get().getService(ICommercializeAdService.class)).Q(17);
        if (!(interfaceC988500bpYQ instanceof InterfaceC1000280c8Y) || (interfaceC1000280c8Y = (InterfaceC1000280c8Y) interfaceC988500bpYQ) == null) {
            return;
        }
        interfaceC1000280c8Y.LJJIFFI(context, aweme);
    }

    @Override // com.ss.android.ugc.aweme.commercialize.navigate.ICommerceNavigateService
    public final void LIZIZ(Context context, Aweme aweme, AdUnifyJumpModel adUnifyJumpModel, C1027520cqU c1027520cqU) {
        InterfaceC1027870cr3 interfaceC1027870cr3;
        AwemeRawAd awemeRawAd;
        if (Intrinsics.LJFF(adUnifyJumpModel.getType(), "web")) {
            interfaceC1027870cr3 = new InterfaceC1027870cr3() { // from class: X.0cqK
                @Override // X.InterfaceC1027870cr3
                public final void LIZ(C1027510cqT c1027510cqT) {
                    AwemeRawAd awemeRawAd2;
                    String aid;
                    long jLongValue;
                    long jLongValue2;
                    String logExtra;
                    String nativeSiteAdInfo;
                    AwemeRawAd awemeRawAd3;
                    AwemeRawAd awemeRawAd4;
                    Long groupId;
                    AwemeRawAd awemeRawAd5;
                    AwemeRawAd awemeRawAd6;
                    Long creativeId;
                    AwemeRawAd awemeRawAd7;
                    Long adId;
                    final Context context2 = c1027510cqT.LIZ;
                    C1027580cqa c1027580cqa = new C1027580cqa();
                    c1027580cqa.LJJIII(c1027510cqT.LIZJ.getOpenURL());
                    Aweme aweme2 = c1027510cqT.LIZIZ;
                    if (aweme2 != null) {
                        awemeRawAd2 = aweme2.getAwemeRawAd();
                    } else {
                        awemeRawAd2 = null;
                    }
                    c1027580cqa.LJ(awemeRawAd2);
                    Aweme aweme3 = c1027510cqT.LIZIZ;
                    if (aweme3 != null) {
                        aid = aweme3.getAid();
                    } else {
                        aid = null;
                    }
                    c1027580cqa.LIZLLL(aid);
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append(c1027510cqT.LIZLLL.LIZ);
                    sbLIZ.append('_');
                    sbLIZ.append(c1027510cqT.LIZLLL.LIZIZ);
                    c1027580cqa.LJJIJ(C2188811AlT.LIZIZ(sbLIZ));
                    Aweme aweme4 = c1027510cqT.LIZIZ;
                    long jLongValue3 = 0;
                    if (aweme4 != null && (awemeRawAd7 = aweme4.getAwemeRawAd()) != null && (adId = awemeRawAd7.getAdId()) != null) {
                        jLongValue = adId.longValue();
                    } else {
                        jLongValue = 0;
                    }
                    c1027580cqa.LIZ(jLongValue);
                    Aweme aweme5 = c1027510cqT.LIZIZ;
                    if (aweme5 != null && (awemeRawAd6 = aweme5.getAwemeRawAd()) != null && (creativeId = awemeRawAd6.getCreativeId()) != null) {
                        jLongValue2 = creativeId.longValue();
                    } else {
                        jLongValue2 = 0;
                    }
                    c1027580cqa.LJI(jLongValue2);
                    Aweme aweme6 = c1027510cqT.LIZIZ;
                    if (aweme6 != null && (awemeRawAd5 = aweme6.getAwemeRawAd()) != null) {
                        logExtra = awemeRawAd5.getLogExtra();
                    } else {
                        logExtra = null;
                    }
                    c1027580cqa.LJIJJ(logExtra);
                    Aweme aweme7 = c1027510cqT.LIZIZ;
                    if (aweme7 != null && (awemeRawAd4 = aweme7.getAwemeRawAd()) != null && (groupId = awemeRawAd4.getGroupId()) != null) {
                        jLongValue3 = groupId.longValue();
                    }
                    c1027580cqa.LJIILIIL(jLongValue3);
                    c1027580cqa.LJJII(true);
                    String lynxScheme = c1027510cqT.LIZJ.getLynxModel().getLynxScheme();
                    if (lynxScheme != null && lynxScheme.length() > 0) {
                        c1027580cqa.LJJJIL(c1027510cqT.LIZJ.getLynxModel().getLynxScheme());
                        Aweme aweme8 = c1027510cqT.LIZIZ;
                        String str = "";
                        if (aweme8 == null || (awemeRawAd3 = aweme8.getAwemeRawAd()) == null || (nativeSiteAdInfo = awemeRawAd3.getNativeSiteAdInfo()) == null) {
                            nativeSiteAdInfo = "";
                        }
                        c1027580cqa.LJJ(nativeSiteAdInfo);
                        String lynxCustomData = c1027510cqT.LIZJ.getLynxModel().getLynxCustomData();
                        if (lynxCustomData != null) {
                            str = lynxCustomData;
                        }
                        c1027580cqa.LJJIFFI(str);
                    } else {
                        c1027580cqa.LJJJIL(c1027510cqT.LIZJ.getWebModel().getWebUrl());
                        c1027580cqa.LJJJ(c1027510cqT.LIZJ.getWebModel().getWebTitle());
                    }
                    C1027480cqQ c1027480cqQ = c1027580cqa.LIZ;
                    C1027490cqR c1027490cqR = new C1027490cqR();
                    c1027490cqR.LIZ.LIZJ = c1027480cqQ;
                    c1027490cqR.LIZIZ(context2);
                    c1027490cqR.LIZ(new C1027260cq4());
                    c1027490cqR.LIZ(new C1027250cq3() { // from class: X.0cqW
                        @Override // X.AbstractC1027370cqF
                        public final void LJFF(boolean z, C1027480cqQ c1027480cqQ2) {
                            C1027410cqJ.LJ(context2, z, c1027480cqQ2);
                        }
                    });
                    C1027460cqO c1027460cqO = C1027460cqO.LIZIZ;
                    c1027490cqR.LIZ(c1027460cqO.LJIILIIL(null));
                    c1027490cqR.LIZ(new C1027270cq5());
                    c1027490cqR.LIZ(c1027460cqO.LJ(null));
                    c1027490cqR.LIZ(c1027460cqO.LJIIIIZZ(null));
                    c1027490cqR.LIZ.LIZ();
                }
            };
        } else {
            String type = null;
            if (aweme != null && (awemeRawAd = aweme.getAwemeRawAd()) != null) {
                type = awemeRawAd.getType();
            }
            if (Intrinsics.LJFF(type, "app") && !C1017070cZd.LJJLL(aweme)) {
                interfaceC1027870cr3 = new InterfaceC1027870cr3() { // from class: X.0cqL
                    public static C1027580cqa LIZIZ(C1027510cqT c1027510cqT) {
                        AwemeRawAd awemeRawAd2;
                        String aid;
                        long jLongValue;
                        long jLongValue2;
                        AwemeRawAd awemeRawAd3;
                        Long groupId;
                        AwemeRawAd awemeRawAd4;
                        AwemeRawAd awemeRawAd5;
                        Long creativeId;
                        AwemeRawAd awemeRawAd6;
                        Long adId;
                        C1027580cqa c1027580cqa = new C1027580cqa();
                        c1027580cqa.LJJIII(c1027510cqT.LIZJ.getOpenURL());
                        c1027580cqa.LJJIIJ(c1027510cqT.LIZJ.getAppID());
                        Aweme aweme2 = c1027510cqT.LIZIZ;
                        String logExtra = null;
                        if (aweme2 != null) {
                            awemeRawAd2 = aweme2.getAwemeRawAd();
                        } else {
                            awemeRawAd2 = null;
                        }
                        c1027580cqa.LJ(awemeRawAd2);
                        Aweme aweme3 = c1027510cqT.LIZIZ;
                        if (aweme3 != null) {
                            aid = aweme3.getAid();
                        } else {
                            aid = null;
                        }
                        c1027580cqa.LIZLLL(aid);
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append(c1027510cqT.LIZLLL.LIZ);
                        sbLIZ.append('_');
                        sbLIZ.append(c1027510cqT.LIZLLL.LIZIZ);
                        c1027580cqa.LJJIJ(C2188811AlT.LIZIZ(sbLIZ));
                        Aweme aweme4 = c1027510cqT.LIZIZ;
                        long jLongValue3 = 0;
                        if (aweme4 != null && (awemeRawAd6 = aweme4.getAwemeRawAd()) != null && (adId = awemeRawAd6.getAdId()) != null) {
                            jLongValue = adId.longValue();
                        } else {
                            jLongValue = 0;
                        }
                        c1027580cqa.LIZ(jLongValue);
                        Aweme aweme5 = c1027510cqT.LIZIZ;
                        if (aweme5 != null && (awemeRawAd5 = aweme5.getAwemeRawAd()) != null && (creativeId = awemeRawAd5.getCreativeId()) != null) {
                            jLongValue2 = creativeId.longValue();
                        } else {
                            jLongValue2 = 0;
                        }
                        c1027580cqa.LJI(jLongValue2);
                        Aweme aweme6 = c1027510cqT.LIZIZ;
                        if (aweme6 != null && (awemeRawAd4 = aweme6.getAwemeRawAd()) != null) {
                            logExtra = awemeRawAd4.getLogExtra();
                        }
                        c1027580cqa.LJIJJ(logExtra);
                        Aweme aweme7 = c1027510cqT.LIZIZ;
                        if (aweme7 != null && (awemeRawAd3 = aweme7.getAwemeRawAd()) != null && (groupId = awemeRawAd3.getGroupId()) != null) {
                            jLongValue3 = groupId.longValue();
                        }
                        c1027580cqa.LJIILIIL(jLongValue3);
                        return c1027580cqa;
                    }

                    @Override // X.InterfaceC1027870cr3
                    public final void LIZ(C1027510cqT c1027510cqT) {
                        final Context context2 = c1027510cqT.LIZ;
                        C1027480cqQ c1027480cqQ = LIZIZ(c1027510cqT).LIZ;
                        C1027490cqR c1027490cqR = new C1027490cqR();
                        c1027490cqR.LIZ.LIZJ = c1027480cqQ;
                        c1027490cqR.LIZIZ(context2);
                        c1027490cqR.LIZ(new C1027260cq4());
                        c1027490cqR.LIZ(new C1027250cq3() { // from class: X.0cqV
                            @Override // X.AbstractC1027370cqF
                            public final void LJFF(boolean z, C1027480cqQ c1027480cqQ2) {
                                C1027410cqJ.LJ(context2, z, c1027480cqQ2);
                            }
                        });
                        if (!c1027490cqR.LIZ.LIZ()) {
                            C1027490cqR c1027490cqR2 = new C1027490cqR();
                            C1027580cqa c1027580cqaLIZIZ = LIZIZ(c1027510cqT);
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append("market://details?id=");
                            sbLIZ.append(c1027510cqT.LIZJ.getAppID());
                            c1027580cqaLIZIZ.LJJIII(C2188811AlT.LIZIZ(sbLIZ));
                            c1027490cqR2.LIZ.LIZJ = c1027580cqaLIZIZ.LIZ;
                            c1027490cqR2.LIZIZ(c1027510cqT.LIZ);
                            c1027490cqR2.LIZ(new C1027400cqI());
                            c1027490cqR2.LIZ.LIZ();
                        }
                    }
                };
            } else {
                interfaceC1027870cr3 = new InterfaceC1027870cr3() { // from class: X.0cqK
                    @Override // X.InterfaceC1027870cr3
                    public final void LIZ(C1027510cqT c1027510cqT) {
                        AwemeRawAd awemeRawAd2;
                        String aid;
                        long jLongValue;
                        long jLongValue2;
                        String logExtra;
                        String nativeSiteAdInfo;
                        AwemeRawAd awemeRawAd3;
                        AwemeRawAd awemeRawAd4;
                        Long groupId;
                        AwemeRawAd awemeRawAd5;
                        AwemeRawAd awemeRawAd6;
                        Long creativeId;
                        AwemeRawAd awemeRawAd7;
                        Long adId;
                        final Context context2 = c1027510cqT.LIZ;
                        C1027580cqa c1027580cqa = new C1027580cqa();
                        c1027580cqa.LJJIII(c1027510cqT.LIZJ.getOpenURL());
                        Aweme aweme2 = c1027510cqT.LIZIZ;
                        if (aweme2 != null) {
                            awemeRawAd2 = aweme2.getAwemeRawAd();
                        } else {
                            awemeRawAd2 = null;
                        }
                        c1027580cqa.LJ(awemeRawAd2);
                        Aweme aweme3 = c1027510cqT.LIZIZ;
                        if (aweme3 != null) {
                            aid = aweme3.getAid();
                        } else {
                            aid = null;
                        }
                        c1027580cqa.LIZLLL(aid);
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append(c1027510cqT.LIZLLL.LIZ);
                        sbLIZ.append('_');
                        sbLIZ.append(c1027510cqT.LIZLLL.LIZIZ);
                        c1027580cqa.LJJIJ(C2188811AlT.LIZIZ(sbLIZ));
                        Aweme aweme4 = c1027510cqT.LIZIZ;
                        long jLongValue3 = 0;
                        if (aweme4 != null && (awemeRawAd7 = aweme4.getAwemeRawAd()) != null && (adId = awemeRawAd7.getAdId()) != null) {
                            jLongValue = adId.longValue();
                        } else {
                            jLongValue = 0;
                        }
                        c1027580cqa.LIZ(jLongValue);
                        Aweme aweme5 = c1027510cqT.LIZIZ;
                        if (aweme5 != null && (awemeRawAd6 = aweme5.getAwemeRawAd()) != null && (creativeId = awemeRawAd6.getCreativeId()) != null) {
                            jLongValue2 = creativeId.longValue();
                        } else {
                            jLongValue2 = 0;
                        }
                        c1027580cqa.LJI(jLongValue2);
                        Aweme aweme6 = c1027510cqT.LIZIZ;
                        if (aweme6 != null && (awemeRawAd5 = aweme6.getAwemeRawAd()) != null) {
                            logExtra = awemeRawAd5.getLogExtra();
                        } else {
                            logExtra = null;
                        }
                        c1027580cqa.LJIJJ(logExtra);
                        Aweme aweme7 = c1027510cqT.LIZIZ;
                        if (aweme7 != null && (awemeRawAd4 = aweme7.getAwemeRawAd()) != null && (groupId = awemeRawAd4.getGroupId()) != null) {
                            jLongValue3 = groupId.longValue();
                        }
                        c1027580cqa.LJIILIIL(jLongValue3);
                        c1027580cqa.LJJII(true);
                        String lynxScheme = c1027510cqT.LIZJ.getLynxModel().getLynxScheme();
                        if (lynxScheme != null && lynxScheme.length() > 0) {
                            c1027580cqa.LJJJIL(c1027510cqT.LIZJ.getLynxModel().getLynxScheme());
                            Aweme aweme8 = c1027510cqT.LIZIZ;
                            String str = "";
                            if (aweme8 == null || (awemeRawAd3 = aweme8.getAwemeRawAd()) == null || (nativeSiteAdInfo = awemeRawAd3.getNativeSiteAdInfo()) == null) {
                                nativeSiteAdInfo = "";
                            }
                            c1027580cqa.LJJ(nativeSiteAdInfo);
                            String lynxCustomData = c1027510cqT.LIZJ.getLynxModel().getLynxCustomData();
                            if (lynxCustomData != null) {
                                str = lynxCustomData;
                            }
                            c1027580cqa.LJJIFFI(str);
                        } else {
                            c1027580cqa.LJJJIL(c1027510cqT.LIZJ.getWebModel().getWebUrl());
                            c1027580cqa.LJJJ(c1027510cqT.LIZJ.getWebModel().getWebTitle());
                        }
                        C1027480cqQ c1027480cqQ = c1027580cqa.LIZ;
                        C1027490cqR c1027490cqR = new C1027490cqR();
                        c1027490cqR.LIZ.LIZJ = c1027480cqQ;
                        c1027490cqR.LIZIZ(context2);
                        c1027490cqR.LIZ(new C1027260cq4());
                        c1027490cqR.LIZ(new C1027250cq3() { // from class: X.0cqW
                            @Override // X.AbstractC1027370cqF
                            public final void LJFF(boolean z, C1027480cqQ c1027480cqQ2) {
                                C1027410cqJ.LJ(context2, z, c1027480cqQ2);
                            }
                        });
                        C1027460cqO c1027460cqO = C1027460cqO.LIZIZ;
                        c1027490cqR.LIZ(c1027460cqO.LJIILIIL(null));
                        c1027490cqR.LIZ(new C1027270cq5());
                        c1027490cqR.LIZ(c1027460cqO.LJ(null));
                        c1027490cqR.LIZ(c1027460cqO.LJIIIIZZ(null));
                        c1027490cqR.LIZ.LIZ();
                    }
                };
            }
        }
        interfaceC1027870cr3.LIZ(new C1027510cqT(context, aweme, adUnifyJumpModel, c1027520cqU));
    }
}
