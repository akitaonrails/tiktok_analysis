package com.ss.android.ugc.aweme.commercialize.anchor.service;

import X.C04TD;
import X.C0C64;
import X.C0CLG;
import X.C1044440dHm;
import X.C1047010dLv;
import X.C1050130dQx;
import X.C123100dR;
import X.C15438062q;
import X.C2188811AlT;
import X.C305820Bym;
import X.InterfaceC1044450dHn;
import X.InterfaceC1050170dR1;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.ies.ugc.aweme.commwecialize.ba.service.IBAAnchorService;
import com.bytedance.keva.Keva;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.n;
import com.ss.android.ugc.aweme.ad.preload.IAdLandPagePreloadService;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.commerce.AwemeCommerceStruct;
import com.ss.android.ugc.aweme.commercialize.anchor.interfaces.ICommerceAnchorLogger;
import com.ss.android.ugc.aweme.commercialize.anchor.interfaces.ICommerceAnchorOutService;
import com.ss.android.ugc.aweme.commercialize.anchor.interfaces.ICommerceAnchorService;
import com.ss.android.ugc.aweme.commercialize.anchor.logging.CommerceAnchorLogger;
import com.ss.android.ugc.aweme.commercialize.anchor.model.AnchorData;
import com.ss.android.ugc.aweme.commercialize.anchor.model.CommerceAnchorInfo;
import com.ss.android.ugc.aweme.commercialize.anchor.model.FEAnchorData;
import com.ss.android.ugc.aweme.commercialize.anchor.model.Format;
import com.ss.android.ugc.aweme.commercialize.anchor.model.InitialData;
import com.ss.android.ugc.aweme.commercialize.anchor.model.JumpData;
import com.ss.android.ugc.aweme.commercialize.anchor.model.MapExtra;
import com.ss.android.ugc.aweme.commercialize.anchor.model.PageData;
import com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.spark.AdSparkUtils;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS204S0000000_16;
import kotlin.jvm.internal.AwS260S0300000_16;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes17.dex */
public final class CommerceAnchorService implements ICommerceAnchorService {
    public static ICommerceAnchorService LJIILL() {
        Object objLIZ = C04TD.LIZ(ICommerceAnchorService.class, false);
        if (objLIZ != null) {
            return (ICommerceAnchorService) objLIZ;
        }
        if (C04TD.LLJJJJLIIL == null) {
            synchronized (ICommerceAnchorService.class) {
                if (C04TD.LLJJJJLIIL == null) {
                    C04TD.LLJJJJLIIL = new CommerceAnchorService();
                }
            }
        }
        return C04TD.LLJJJJLIIL;
    }

    @Override // com.ss.android.ugc.aweme.commercialize.anchor.interfaces.ICommerceAnchorService
    public final boolean LIZIZ() {
        ArrayList arrayList;
        C0CLG.LIZ.getClass();
        final long jCurrentTimeMillis = System.currentTimeMillis();
        String[] stringArray = C0CLG.LIZIZ.getStringArray("viewRecords", null);
        if (stringArray != null) {
            ArrayList arrayList2 = new ArrayList(stringArray.length);
            for (String str : stringArray) {
                arrayList2.add(Long.valueOf(CastLongProtector.parseLong(str)));
            }
            arrayList = new ArrayList(arrayList2);
        } else {
            arrayList = new ArrayList();
        }
        arrayList.removeIf(new Predicate() { // from class: X.0ctG
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                if (jCurrentTimeMillis - ((Long) obj).longValue() >= C0CLG.LJI) {
                    return true;
                }
                return false;
            }
        });
        Keva keva = C0CLG.LIZIZ;
        ArrayList arrayList3 = new ArrayList(C15438062q.LJIJJ(arrayList, 10));
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            arrayList3.add(String.valueOf(((Number) it2.next()).longValue()));
        }
        keva.storeStringArray("viewRecords", (String[]) arrayList3.toArray(new String[0]));
        return arrayList.size() < C0CLG.LJ;
    }

    @Override // com.ss.android.ugc.aweme.commercialize.anchor.interfaces.ICommerceAnchorService
    public final boolean LJ() {
        return C0C64.LJIILLIIL().LJIIIZ(31744, "map_profile_page_card", true, false);
    }

    @Override // com.ss.android.ugc.aweme.commercialize.anchor.interfaces.ICommerceAnchorService
    public final int LJFF() {
        Integer showSeconds = C305820Bym.LIZ().getShowSeconds();
        if (showSeconds != null) {
            return showSeconds.intValue();
        }
        return 5;
    }

    @Override // com.ss.android.ugc.aweme.commercialize.anchor.interfaces.ICommerceAnchorService
    public final Integer LJIIL() {
        return Integer.valueOf(R.layout.agr);
    }

    @Override // com.ss.android.ugc.aweme.commercialize.anchor.interfaces.ICommerceAnchorService
    public final boolean LIZJ(List<AnchorCommonStruct> list) {
        if (list == null) {
            return false;
        }
        for (AnchorCommonStruct anchorCommonStruct : list) {
            if (anchorCommonStruct.getBizGroup() == 1) {
                C1047010dLv.LIZ.getClass();
                if (C1047010dLv.LIZIZ(anchorCommonStruct).contains(2)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.commercialize.anchor.interfaces.ICommerceAnchorService
    public final boolean LIZLLL(Aweme aweme) {
        List<AnchorCommonStruct> anchors;
        String styleTemplate;
        MapExtra mapExtra;
        Format formatData;
        if (aweme == null || (anchors = aweme.getAnchors()) == null || !LJI(anchors)) {
            return false;
        }
        for (AnchorCommonStruct anchorCommonStruct : anchors) {
            if (LJIIIIZZ(anchorCommonStruct)) {
                CommerceAnchorInfo commerceAnchorInfoLJIIIZ = LJIIIZ(anchorCommonStruct.getExtra());
                if (commerceAnchorInfoLJIIIZ != null && (mapExtra = commerceAnchorInfoLJIIIZ.getMapExtra()) != null && (formatData = mapExtra.getFormatData()) != null) {
                    styleTemplate = formatData.getStyleTemplate();
                } else {
                    styleTemplate = null;
                }
                if (C123100dR.LIZ(styleTemplate)) {
                    if (!LJIILIIL(anchorCommonStruct) || !LIZIZ()) {
                        return false;
                    }
                    return true;
                }
            }
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.commercialize.anchor.interfaces.ICommerceAnchorService
    public final boolean LJI(List<AnchorCommonStruct> list) {
        if (list == null) {
            return false;
        }
        Iterator<AnchorCommonStruct> it2 = list.iterator();
        while (it2.hasNext()) {
            if (it2.next().getBizGroup() == 1) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.0dHm] */
    @Override // com.ss.android.ugc.aweme.commercialize.anchor.interfaces.ICommerceAnchorService
    public final C1044440dHm LJII(InterfaceC1044450dHn interfaceC1044450dHn) {
        return new InterfaceC1050170dR1(interfaceC1044450dHn) { // from class: X.0dHm
            public final InterfaceC1044450dHn LL;
            public final CommerceAnchorInfo LLILLJJLI;
            public final AnchorData LLILLL;
            public final C01GW LLILZ = C452501pT.LIZIZ(AFwS204S0000000_16.get$arr$(389));
            public final C01GW LLILZIL = C452501pT.LIZIZ(AFwS204S0000000_16.get$arr$(388));

            @Override // X.InterfaceC1037910d7F
            public final void initialize() {
            }

            @Override // X.InterfaceC1050170dR1
            public final void yg(Activity activity, Dialog dialog) {
            }

            public final ICommerceAnchorOutService LIZ() {
                return (ICommerceAnchorOutService) this.LLILZIL.getValue();
            }

            @Override // X.InterfaceC1050170dR1
            public final C1400390mXt o2() {
                ICommerceAnchorOutService iCommerceAnchorOutServiceLIZ = LIZ();
                if (iCommerceAnchorOutServiceLIZ != null) {
                    return iCommerceAnchorOutServiceLIZ.o2();
                }
                return null;
            }

            @Override // X.InterfaceC1010530cP5
            public final /* bridge */ /* synthetic */ InterfaceC1044450dHn Mh() {
                return this.LL;
            }

            {
                String extra;
                Integer numValueOf;
                boolean z;
                LinkedHashMap linkedHashMap;
                String aid;
                String authorUid;
                String id;
                Integer numValueOf2;
                boolean z2;
                Object obj;
                String mapAnchorExtra;
                String organicLogExtra;
                AwemeCommerceStruct commerceVideoAuthInfo;
                MapExtra mapExtra;
                List<AnchorCommonStruct> anchors;
                Aweme aweme;
                Integer numValueOf3;
                String mapAnchorExtra2;
                MapExtra mapExtra2;
                AwemeCommerceStruct commerceVideoAuthInfo2;
                this.LL = interfaceC1044450dHn;
                C1047010dLv c1047010dLv = C1047010dLv.LIZ;
                AnchorCommonStruct anchorCommonStructLIZJ = interfaceC1044450dHn.LIZJ();
                if (anchorCommonStructLIZJ != null) {
                    extra = anchorCommonStructLIZJ.getExtra();
                } else {
                    extra = null;
                }
                c1047010dLv.getClass();
                CommerceAnchorInfo commerceAnchorInfoLIZJ = C1047010dLv.LIZJ(extra);
                this.LLILLJJLI = commerceAnchorInfoLIZJ;
                AnchorCommonStruct anchorCommonStructLIZJ2 = interfaceC1044450dHn.LIZJ();
                if (anchorCommonStructLIZJ2 != null) {
                    numValueOf = Integer.valueOf(anchorCommonStructLIZJ2.getType());
                } else {
                    numValueOf = null;
                }
                if (C1050930dSF.LIZIZ(numValueOf)) {
                    AnchorCommonStruct anchorCommonStructLIZJ3 = interfaceC1044450dHn.LIZJ();
                    InterfaceC1392640mLO interfaceC1392640mLOLJII = interfaceC1044450dHn.LJII();
                    Aweme aweme2 = interfaceC1044450dHn.getAweme();
                    if (aweme2 != null && (commerceVideoAuthInfo2 = aweme2.getCommerceVideoAuthInfo()) != null && commerceVideoAuthInfo2.isPseudoAd()) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z) {
                        linkedHashMap = new LinkedHashMap();
                        AnchorCommonStruct anchorCommonStructLIZJ4 = interfaceC1044450dHn.LIZJ();
                        if (anchorCommonStructLIZJ4 != null) {
                            numValueOf3 = Integer.valueOf(anchorCommonStructLIZJ4.getType());
                        } else {
                            numValueOf3 = null;
                        }
                        linkedHashMap.put("anchor_type", String.valueOf(numValueOf3));
                        linkedHashMap.put("enter_from", interfaceC1044450dHn.getEnterFrom());
                        if (commerceAnchorInfoLIZJ != null && (mapExtra2 = commerceAnchorInfoLIZJ.getMapExtra()) != null) {
                            mapAnchorExtra2 = mapExtra2.getMapAnchorExtra();
                        } else {
                            mapAnchorExtra2 = null;
                        }
                        linkedHashMap.put("map_anchor_extra", mapAnchorExtra2);
                    } else {
                        linkedHashMap = new LinkedHashMap();
                        Aweme aweme3 = interfaceC1044450dHn.getAweme();
                        if (aweme3 != null) {
                            aid = aweme3.getAid();
                        } else {
                            aid = null;
                        }
                        linkedHashMap.put("item_id", aid);
                        Aweme aweme4 = interfaceC1044450dHn.getAweme();
                        if (aweme4 != null) {
                            authorUid = AwemeExtKt.getAuthorUid(aweme4);
                        } else {
                            authorUid = null;
                        }
                        linkedHashMap.put("author_id", authorUid);
                        AnchorCommonStruct anchorCommonStructLIZJ5 = interfaceC1044450dHn.LIZJ();
                        if (anchorCommonStructLIZJ5 != null) {
                            id = anchorCommonStructLIZJ5.getId();
                        } else {
                            id = null;
                        }
                        linkedHashMap.put("anchor_id", id);
                        AnchorCommonStruct anchorCommonStructLIZJ6 = interfaceC1044450dHn.LIZJ();
                        if (anchorCommonStructLIZJ6 != null) {
                            numValueOf2 = Integer.valueOf(anchorCommonStructLIZJ6.getType());
                        } else {
                            numValueOf2 = null;
                        }
                        linkedHashMap.put("anchor_type", String.valueOf(numValueOf2));
                        Aweme aweme5 = interfaceC1044450dHn.getAweme();
                        if (aweme5 != null && AwemeExtKt.isAdTraffic(aweme5)) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        if (!z2 && ((aweme = interfaceC1044450dHn.getAweme()) == null || !AwemeExtKt.isPseudoAd(aweme))) {
                            obj = "1";
                        } else {
                            obj = CardStruct.IStatusCode.DEFAULT;
                        }
                        linkedHashMap.put("is_organic", obj);
                        linkedHashMap.put("enter_from", interfaceC1044450dHn.getEnterFrom());
                        linkedHashMap.put("anchor_index", String.valueOf(interfaceC1044450dHn.LJIIIIZZ()));
                        Aweme aweme6 = interfaceC1044450dHn.getAweme();
                        linkedHashMap.put("multi_anchor", (aweme6 == null || (anchors = aweme6.getAnchors()) == null || anchors.size() <= 1) ? CardStruct.IStatusCode.DEFAULT : "1");
                        if (commerceAnchorInfoLIZJ != null && (mapExtra = commerceAnchorInfoLIZJ.getMapExtra()) != null) {
                            mapAnchorExtra = mapExtra.getMapAnchorExtra();
                        } else {
                            mapAnchorExtra = null;
                        }
                        linkedHashMap.put("map_anchor_extra", mapAnchorExtra);
                        Aweme aweme7 = interfaceC1044450dHn.getAweme();
                        if (aweme7 != null && (commerceVideoAuthInfo = aweme7.getCommerceVideoAuthInfo()) != null) {
                            organicLogExtra = commerceVideoAuthInfo.getOrganicLogExtra();
                        } else {
                            organicLogExtra = null;
                        }
                        linkedHashMap.put("organic_log_extra", organicLogExtra);
                    }
                    AnchorData anchorData = new AnchorData(anchorCommonStructLIZJ3, interfaceC1392640mLOLJII, linkedHashMap, commerceAnchorInfoLIZJ != null ? commerceAnchorInfoLIZJ.getMapExtra() : null);
                    this.LLILLL = anchorData;
                    ICommerceAnchorOutService iCommerceAnchorOutServiceLIZ = LIZ();
                    if (iCommerceAnchorOutServiceLIZ != null) {
                        iCommerceAnchorOutServiceLIZ.LIZIZ(interfaceC1044450dHn.getAweme(), anchorData);
                    }
                }
            }

            @Override // X.InterfaceC1050170dR1
            public final void LLLIZZ(Aweme aweme) {
                ICommerceAnchorOutService iCommerceAnchorOutServiceLIZ = LIZ();
                if (iCommerceAnchorOutServiceLIZ != null) {
                    iCommerceAnchorOutServiceLIZ.LLLIZZ(aweme);
                }
            }

            @Override // X.InterfaceC1050170dR1
            public final void p1(C2344009Gk c2344009Gk) {
                o42(this.LL.getRefer(), "video_anchor");
                C1047010dLv c1047010dLv = C1047010dLv.LIZ;
                InterfaceC1044450dHn interfaceC1044450dHn2 = this.LL;
                AnchorData anchorData = this.LLILLL;
                Map mapLIZJ = C2097908Jt.LIZJ(new Pair("enter_method", "video_anchor"));
                c1047010dLv.getClass();
                C1047010dLv.LIZ(interfaceC1044450dHn2, anchorData, mapLIZJ);
                ICommerceAnchorOutService iCommerceAnchorOutServiceLIZ = LIZ();
                if (iCommerceAnchorOutServiceLIZ != null) {
                    iCommerceAnchorOutServiceLIZ.LJ();
                }
            }

            @Override // X.InterfaceC1050170dR1
            public final void if0(String str, String str2) throws JSONException {
                AnchorCommonStruct anchorCommonStructLIZJ;
                AwemeRawAd awemeRawAdLJJIJL;
                Object mapAnchorExtra;
                MapExtra mapExtra;
                boolean z;
                String str3;
                String aid;
                String authorUid;
                String organicLogExtra;
                PageData pageData;
                String extra;
                List<String> urlList;
                Number numberValueOf;
                List<Integer> anchorPosition;
                MapExtra mapExtra2;
                JumpData jumpData;
                IBAAnchorService iBAAnchorService;
                MapExtra mapExtra3;
                JumpData jumpData2;
                AwemeCommerceStruct commerceVideoAuthInfo;
                Aweme aweme;
                MapExtra mapExtra4;
                Aweme aweme2 = this.LL.getAweme();
                if (aweme2 == null || (anchorCommonStructLIZJ = this.LL.LIZJ()) == null || this.LLILLJJLI == null) {
                    return;
                }
                if (!AwemeExtKt.isAdTraffic(aweme2) && !AwemeExtKt.isPseudoAd(aweme2)) {
                    ICommerceAnchorLogger iCommerceAnchorLogger = (ICommerceAnchorLogger) this.LLILZ.getValue();
                    CommerceAnchorInfo commerceAnchorInfo = this.LLILLJJLI;
                    if (commerceAnchorInfo != null) {
                        mapExtra4 = commerceAnchorInfo.getMapExtra();
                    } else {
                        mapExtra4 = null;
                    }
                    iCommerceAnchorLogger.LJJI(aweme2, anchorCommonStructLIZJ, mapExtra4, this.LL.getEnterFrom(), str2, this.LL.LJIIIIZZ(), this.LL.getRefer());
                } else {
                    if (AwemeExtKt.isAdTraffic(aweme2)) {
                        awemeRawAdLJJIJL = aweme2.getAwemeRawAd();
                    } else {
                        awemeRawAdLJJIJL = C1017070cZd.LJJIJL(aweme2);
                    }
                    C1022820ciu c1022820ciuLIZLLL = C2184171Adz.LIZLLL("draw_ad", "click", awemeRawAdLJJIJL);
                    c1022820ciuLIZLLL.LIZJ(str, "refer");
                    c1022820ciuLIZLLL.LIZIZ(String.valueOf(anchorCommonStructLIZJ.getType()), "anchor_type");
                    c1022820ciuLIZLLL.LIZIZ(this.LL.getEnterFrom(), "enter_from");
                    CommerceAnchorInfo commerceAnchorInfo2 = this.LLILLJJLI;
                    if (commerceAnchorInfo2 != null && (mapExtra = commerceAnchorInfo2.getMapExtra()) != null) {
                        mapAnchorExtra = mapExtra.getMapAnchorExtra();
                    } else {
                        mapAnchorExtra = null;
                    }
                    c1022820ciuLIZLLL.LIZIZ(mapAnchorExtra, "map_anchor_extra");
                    c1022820ciuLIZLLL.LJII();
                }
                if (C1050930dSF.LIZIZ(Integer.valueOf(anchorCommonStructLIZJ.getType()))) {
                    return;
                }
                C1047010dLv c1047010dLv = C1047010dLv.LIZ;
                InterfaceC1044450dHn interfaceC1044450dHn2 = this.LL;
                CommerceAnchorInfo commerceAnchorInfo3 = this.LLILLJJLI;
                c1047010dLv.getClass();
                Aweme aweme3 = interfaceC1044450dHn2.getAweme();
                if (aweme3 != null && AwemeExtKt.isAdTraffic(aweme3)) {
                    z = true;
                } else {
                    z = false;
                }
                if (!z && ((aweme = interfaceC1044450dHn2.getAweme()) == null || !AwemeExtKt.isPseudoAd(aweme))) {
                    str3 = "1";
                } else {
                    str3 = CardStruct.IStatusCode.DEFAULT;
                }
                String enterFrom = interfaceC1044450dHn2.getEnterFrom();
                Aweme aweme4 = interfaceC1044450dHn2.getAweme();
                if (aweme4 != null) {
                    aid = aweme4.getAid();
                } else {
                    aid = null;
                }
                Aweme aweme5 = interfaceC1044450dHn2.getAweme();
                if (aweme5 != null) {
                    authorUid = AwemeExtKt.getAuthorUid(aweme5);
                } else {
                    authorUid = null;
                }
                Aweme aweme6 = interfaceC1044450dHn2.getAweme();
                if (aweme6 != null && (commerceVideoAuthInfo = aweme6.getCommerceVideoAuthInfo()) != null) {
                    organicLogExtra = commerceVideoAuthInfo.getOrganicLogExtra();
                } else {
                    organicLogExtra = null;
                }
                Integer numLJIIIIZZ = interfaceC1044450dHn2.LJIIIIZZ();
                AnchorCommonStruct anchorCommonStructLIZJ2 = interfaceC1044450dHn2.LIZJ();
                if (commerceAnchorInfo3 != null && (mapExtra3 = commerceAnchorInfo3.getMapExtra()) != null && (jumpData2 = mapExtra3.getJumpData()) != null) {
                    pageData = jumpData2.getPageData();
                } else {
                    pageData = null;
                }
                String strLJIIIIZZ = C1741890vQh.LJIIIIZZ(new FEAnchorData(str3, enterFrom, aid, str2, authorUid, organicLogExtra, numLJIIIIZZ, anchorCommonStructLIZJ2, pageData));
                JSONObject jSONObject = new JSONObject();
                AnchorCommonStruct anchorCommonStructLIZJ3 = interfaceC1044450dHn2.LIZJ();
                if (anchorCommonStructLIZJ3 != null) {
                    extra = anchorCommonStructLIZJ3.getExtra();
                } else {
                    extra = null;
                }
                jSONObject.put("ixBusinessData", extra);
                String strLJIIIIZZ2 = C1741890vQh.LJIIIIZZ(new InitialData(strLJIIIIZZ, C786410Ut5.J3(jSONObject)));
                CommerceAnchorInfo commerceAnchorInfo4 = this.LLILLJJLI;
                if (commerceAnchorInfo4 != null && (mapExtra2 = commerceAnchorInfo4.getMapExtra()) != null && (jumpData = mapExtra2.getJumpData()) != null && Intrinsics.LJFF(jumpData.getUseCRouter(), Boolean.TRUE) && (iBAAnchorService = (IBAAnchorService) PluggableExtentionKt.pluggableSpi$default(IBAAnchorService.class, false, false, false, 14, null)) != null) {
                    iBAAnchorService.LJIIIZ(this.LL.getContext(), this.LLILLJJLI, anchorCommonStructLIZJ, aweme2, str2, this.LL.getEnterFrom(), strLJIIIIZZ2);
                    return;
                }
                if (anchorCommonStructLIZJ.getType() == EnumC1430380nKG.BA_PRODUCT_ANCHOR.getTYPE()) {
                    ((IBAAnchorService) ServiceManager.get().getService(IBAAnchorService.class)).LJIILLIIL(82, this.LL.getContext(), this.LLILLJJLI, anchorCommonStructLIZJ, aweme2, str2, this.LL.getEnterFrom(), strLJIIIIZZ2);
                    return;
                }
                String str4 = "";
                String str5 = "ba_paid";
                if (anchorCommonStructLIZJ.getType() == EnumC1430380nKG.BA_DOWNLOAD_ANCHOR.getTYPE()) {
                    CommerceAnchorInfo commerceAnchorInfo5 = this.LLILLJJLI;
                    if (commerceAnchorInfo5 != null && (anchorPosition = commerceAnchorInfo5.getAnchorPosition()) != null && !anchorPosition.isEmpty()) {
                        IBAAnchorService iBAAnchorService2 = (IBAAnchorService) PluggableExtentionKt.pluggableSpi$default(IBAAnchorService.class, false, false, false, 14, null);
                        if (iBAAnchorService2 != null && iBAAnchorService2.LJIILJJIL()) {
                            IBAAnchorService iBAAnchorService3 = (IBAAnchorService) PluggableExtentionKt.pluggableSpi$default(IBAAnchorService.class, false, false, false, 14, null);
                            if (iBAAnchorService3 != null) {
                                Context context = this.LL.getContext();
                                String enterFrom2 = this.LL.getEnterFrom();
                                CommerceAnchorInfo commerceAnchorInfo6 = this.LLILLJJLI;
                                String schema = anchorCommonStructLIZJ.getSchema();
                                if (schema != null) {
                                    str4 = schema;
                                }
                                iBAAnchorService3.LIZ(context, anchorCommonStructLIZJ, aweme2, str2, enterFrom2, commerceAnchorInfo6, strLJIIIIZZ2, str4, Boolean.TRUE);
                                return;
                            }
                            return;
                        }
                        String schema2 = anchorCommonStructLIZJ.getSchema();
                        if (schema2 == null) {
                            return;
                        }
                        SparkContext sparkContext = new SparkContext();
                        sparkContext.LJJLIIJ(schema2);
                        C1537510q73 c1537510q73 = new C1537510q73();
                        c1537510q73.put("initialData", (Object) strLJIIIIZZ2);
                        sparkContext.runtimeInfo = c1537510q73;
                        sparkContext.LJJ(AwemeCommerceStruct.class, aweme2.getCommerceVideoAuthInfo());
                        C1537900q7g c1537900q7g = C1541950qED.LIZJ;
                        Context context2 = this.LL.getContext();
                        c1537900q7g.getClass();
                        new C1541950qED(context2, sparkContext).LIZIZ();
                        return;
                    }
                    Context context3 = this.LL.getContext();
                    if (!(context3 instanceof Activity)) {
                        context3 = null;
                    }
                    String schema3 = anchorCommonStructLIZJ.getSchema();
                    if (schema3 != null) {
                        Keva repo = Keva.getRepo("TTCM_KEVA_REPO");
                        repo.storeString("anchor_extra", anchorCommonStructLIZJ.getExtra());
                        repo.storeString("group_id", aweme2.getGroupId());
                        Uri uri = UriProtector.parse(schema3);
                        Uri.Builder builderBuildUpon = uri.buildUpon();
                        n nVar = new n();
                        nVar.LJJIIJ("sourcePage", "ttam_download_app");
                        nVar.LJJIII(Integer.valueOf(C444960Hcc.LIZJ(context3) ? 1 : 0), "isRTL");
                        if (context3 != null) {
                            numberValueOf = Integer.valueOf(C497820Jfg.LIZJ(context3));
                        } else {
                            numberValueOf = null;
                        }
                        nVar.LJJIII(numberValueOf, "topSafeAreaHeight");
                        builderBuildUpon.appendQueryParameter("lynx_landing_page_data", nVar.toString());
                        builderBuildUpon.appendQueryParameter("sourcePage", "ttam_download_app");
                        if (!AwemeExtKt.isAdTraffic(aweme2)) {
                            str5 = "ba_organic";
                        }
                        builderBuildUpon.appendQueryParameter("traffic_type", str5);
                        builderBuildUpon.appendQueryParameter("country_id", C2222691Bz1.LIZ());
                        SparkContext sparkContext2 = new SparkContext();
                        sparkContext2.LJJLIIJ(builderBuildUpon.toString());
                        sparkContext2.LJJL("is_lynx_landing_page", true);
                        sparkContext2.LJJL("hide_nav_bar", true);
                        sparkContext2.LJJL("hide_status_bar", false);
                        sparkContext2.LJJL("bundle_nav_bar_status_padding", true);
                        sparkContext2.LJJL("need_bottom_out", true);
                        if (uri.isHierarchical()) {
                            String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "fallback_url");
                            if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter == null) {
                                strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = "";
                            }
                            sparkContext2.LJJJZ("bundle_origin_url", strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter);
                            if (TextUtils.equals(UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "async_layout"), "1")) {
                                sparkContext2.LJJL("preset_safe_point", true);
                                sparkContext2.LJJJLZIJ(EnumC665490Q8l.PART_ON_LAYOUT.id(), "thread_strategy");
                            }
                        }
                        String strK0 = ((IAdLandPagePreloadService) ServiceManager.get().getService(IAdLandPagePreloadService.class)).K0("lynx_feed");
                        if (C1000150c8L.LIZIZ()) {
                            sparkContext2.LJJJZ("use_forest", "1");
                            if (strK0 != null) {
                                sparkContext2.LJJJZ("access_key", strK0);
                            }
                        } else {
                            AdSparkUtils.LJFF().LIZLLL(sparkContext2, strK0);
                        }
                        sparkContext2.LJJ(AwemeCommerceStruct.class, aweme2.getCommerceVideoAuthInfo());
                        if (context3 != null) {
                            C1541950qED.LIZJ.getClass();
                            new C1541950qED(context3, sparkContext2).LIZIZ();
                            return;
                        }
                        return;
                    }
                    return;
                }
                if (anchorCommonStructLIZJ.getType() == EnumC1430380nKG.TTCM.getTYPE()) {
                    String schema4 = anchorCommonStructLIZJ.getSchema();
                    if (schema4 != null) {
                        Keva repo2 = Keva.getRepo("TTCM_KEVA_REPO");
                        repo2.storeString("anchor_extra", anchorCommonStructLIZJ.getExtra());
                        repo2.storeString("group_id", aweme2.getGroupId());
                        Uri uri2 = UriProtector.parse(schema4);
                        Uri.Builder builderBuildUpon2 = uri2.buildUpon();
                        n nVar2 = new n();
                        nVar2.LJJIIJ("sourcePage", "ttcm_app");
                        nVar2.LJJIII(Integer.valueOf(C444960Hcc.LIZJ(this.LL.getContext()) ? 1 : 0), "isRTL");
                        nVar2.LJJIII(Integer.valueOf(C497820Jfg.LIZJ(this.LL.getContext())), "topSafeAreaHeight");
                        builderBuildUpon2.appendQueryParameter("lynx_landing_page_data", nVar2.toString());
                        builderBuildUpon2.appendQueryParameter("sourcePage", "ttcm_app");
                        if (!AwemeExtKt.isAdTraffic(aweme2)) {
                            str5 = "ba_organic";
                        }
                        builderBuildUpon2.appendQueryParameter("traffic_type", str5);
                        builderBuildUpon2.appendQueryParameter("country_id", C2222691Bz1.LIZ());
                        SparkContext sparkContext3 = new SparkContext();
                        sparkContext3.LJJLIIJ(builderBuildUpon2.toString());
                        sparkContext3.LJJL("is_lynx_landing_page", true);
                        sparkContext3.LJJL("hide_nav_bar", true);
                        sparkContext3.LJJL("hide_status_bar", false);
                        sparkContext3.LJJL("bundle_nav_bar_status_padding", true);
                        sparkContext3.LJJL("need_bottom_out", true);
                        if (uri2.isHierarchical()) {
                            String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri2, "fallback_url");
                            if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2 == null) {
                                strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2 = "";
                            }
                            sparkContext3.LJJJZ("bundle_origin_url", strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2);
                            if (TextUtils.equals(UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri2, "async_layout"), "1")) {
                                sparkContext3.LJJL("preset_safe_point", true);
                                sparkContext3.LJJJLZIJ(EnumC665490Q8l.PART_ON_LAYOUT.id(), "thread_strategy");
                            }
                        }
                        String strK02 = ((IAdLandPagePreloadService) ServiceManager.get().getService(IAdLandPagePreloadService.class)).K0("lynx_feed");
                        if (C1000150c8L.LIZIZ()) {
                            sparkContext3.LJJJZ("use_forest", "1");
                            if (strK02 != null) {
                                sparkContext3.LJJJZ("access_key", strK02);
                            }
                        } else {
                            AdSparkUtils.LJFF().LIZLLL(sparkContext3, strK02);
                        }
                        C1537900q7g c1537900q7g2 = C1541950qED.LIZJ;
                        Context context4 = this.LL.getContext();
                        c1537900q7g2.getClass();
                        new C1541950qED(context4, sparkContext3).LIZIZ();
                        return;
                    }
                    return;
                }
                if (anchorCommonStructLIZJ.getType() == EnumC1430380nKG.DM_ANCHOR.getTYPE()) {
                    String schema5 = anchorCommonStructLIZJ.getSchema();
                    if (schema5 != null) {
                        SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(this.LL.getContext(), schema5);
                        smartRouteBuildRoute.withParam("enter_from", this.LL.getEnterFrom());
                        smartRouteBuildRoute.open();
                        return;
                    }
                    return;
                }
                if (anchorCommonStructLIZJ.getType() == EnumC1430380nKG.GET_LEADS.getTYPE()) {
                    if (!((AbstractC848400XPy) C0XQ7.LJFF()).isLogin()) {
                        C0XPD.LIZIZ(C1388190mED.LIZ(this.LL.getContext()), "getLeads", "getLeads", null, null);
                        new C1050610dRj().LJJII(aweme2.getAuthor(), aweme2, 1, -1);
                        return;
                    }
                    String str6 = null;
                    User author = aweme2.getAuthor();
                    if (author == null) {
                        return;
                    }
                    new C1050610dRj().LJIIZILJ(aweme2, author);
                    if (anchorCommonStructLIZJ.getSchema() == null) {
                        return;
                    }
                    try {
                        try {
                            if (new JSONObject(anchorCommonStructLIZJ.getExtra()).optInt("schema_type") == 30) {
                                ((IBAAnchorService) ServiceManager.get().getService(IBAAnchorService.class)).LJIILLIIL(82, this.LL.getContext(), this.LLILLJJLI, anchorCommonStructLIZJ, aweme2, str2, this.LL.getEnterFrom(), strLJIIIIZZ2);
                                return;
                            }
                            Uri.Builder builderBuildUpon3 = UriProtector.parse(anchorCommonStructLIZJ.getSchema()).buildUpon();
                            C1050610dRj c1050610dRj = new C1050610dRj();
                            c1050610dRj.LIZJ = 1;
                            c1050610dRj.LJIIIZ(aweme2);
                            Uri.Builder builderAppendQueryParameter = builderBuildUpon3.appendQueryParameter("enter_from", String.valueOf(c1050610dRj.LIZLLL("enter_from")));
                            UrlModel avatarLarger = author.getAvatarLarger();
                            if (avatarLarger != null && (urlList = avatarLarger.getUrlList()) != null) {
                                str6 = (String) ListProtector.get(urlList, 0);
                            }
                            Uri.Builder builderAppendQueryParameter2 = builderAppendQueryParameter.appendQueryParameter("avatar", str6).appendQueryParameter("name", author.getNickname()).appendQueryParameter("ba_uid", author.getUid()).appendQueryParameter("title", anchorCommonStructLIZJ.getKeyword());
                            C1050610dRj c1050610dRj2 = new C1050610dRj();
                            c1050610dRj2.LJIIIZ(aweme2);
                            String string = builderAppendQueryParameter2.appendQueryParameter("is_ad", String.valueOf(c1050610dRj2.LIZLLL("is_ad"))).appendQueryParameter("hide_nav_bar", "1").toString();
                            IBAAnchorService iBAAnchorService4 = (IBAAnchorService) PluggableExtentionKt.pluggableSpi$default(IBAAnchorService.class, false, false, false, 14, null);
                            if (iBAAnchorService4 != null) {
                                iBAAnchorService4.LJIILIIL(string, anchorCommonStructLIZJ, aweme2, str2, this.LL.getEnterFrom(), this.LLILLJJLI, strLJIIIIZZ2);
                                return;
                            }
                            return;
                        } catch (JSONException e) {
                            e = e;
                        }
                    } catch (JSONException e2) {
                        e = e2;
                    }
                    TryCatchGuardChecker.doCheck(e);
                    C1AF0.LJ(e);
                }
                if (anchorCommonStructLIZJ.getType() == EnumC1430380nKG.ANCHOR_TCM_COMMENT.getTYPE()) {
                    Keva repo3 = Keva.getRepo("TTCM_KEVA_REPO");
                    repo3.storeString("anchor_extra", anchorCommonStructLIZJ.getExtra());
                    repo3.storeString("group_id", aweme2.getGroupId());
                    String schema6 = anchorCommonStructLIZJ.getSchema();
                    if (schema6 == null) {
                        return;
                    }
                    SparkContext sparkContext4 = new SparkContext();
                    sparkContext4.LJJLIIJ(schema6);
                    sparkContext4.LJJ(C1888100zEW.class, new C1888100zEW(aweme2, anchorCommonStructLIZJ, str2, this.LL.getEnterFrom(), C1048040dNa.LIZIZ(aweme2.getAnchors())));
                    C1537900q7g c1537900q7g3 = C1541950qED.LIZJ;
                    Context context5 = this.LL.getContext();
                    c1537900q7g3.getClass();
                    new C1541950qED(context5, sparkContext4).LIZIZ();
                    return;
                }
                ((IBAAnchorService) ServiceManager.get().getService(IBAAnchorService.class)).LJIILLIIL(82, this.LL.getContext(), this.LLILLJJLI, anchorCommonStructLIZJ, aweme2, str2, this.LL.getEnterFrom(), strLJIIIIZZ2);
            }

            @Override // X.InterfaceC1050170dR1
            public final void o42(String str, String str2) {
                CommerceAnchorInfo commerceAnchorInfo;
                AwemeRawAd awemeRawAdLJJIJL;
                Integer numValueOf;
                MapExtra mapExtra;
                JumpData jumpData;
                List<String> geckoChannel;
                JumpData jumpData2;
                Integer akType;
                Aweme aweme = this.LL.getAweme();
                if (aweme == null || (commerceAnchorInfo = this.LLILLJJLI) == null) {
                    return;
                }
                C1047010dLv.LIZ.getClass();
                MapExtra mapExtra2 = commerceAnchorInfo.getMapExtra();
                String mapAnchorExtra = null;
                MapExtra mapExtra3 = null;
                mapAnchorExtra = null;
                if (mapExtra2 != null && (jumpData = mapExtra2.getJumpData()) != null && (geckoChannel = jumpData.getGeckoChannel()) != null && !geckoChannel.isEmpty()) {
                    MapExtra mapExtra4 = commerceAnchorInfo.getMapExtra();
                    if (mapExtra4 != null && (jumpData2 = mapExtra4.getJumpData()) != null && (akType = jumpData2.getAkType()) != null && akType.intValue() == 2) {
                        IAdLandPagePreloadService iAdLandPagePreloadService = (IAdLandPagePreloadService) PluggableExtentionKt.pluggableSpi$default(IAdLandPagePreloadService.class, false, false, false, 14, null);
                        if (iAdLandPagePreloadService != null && iAdLandPagePreloadService.G0() != null) {
                            C1024380clQ.LJIILJJIL(null, C1687430u0r.LIZ(geckoChannel));
                        }
                    } else {
                        for (String str3 : geckoChannel) {
                            C988570bpf.LIZ.getClass();
                            if (C1041070dCL.LIZIZ() != null) {
                                C1041280dCg.LIZ(str3, new C1077200e8c(2), null);
                            }
                        }
                    }
                } else {
                    C1022620cia.LJ("AnchorModule", "gecko channel is null or empty");
                }
                if (!AwemeExtKt.isAdTraffic(aweme) && !AwemeExtKt.isPseudoAd(aweme)) {
                    ICommerceAnchorLogger iCommerceAnchorLogger = (ICommerceAnchorLogger) this.LLILZ.getValue();
                    AnchorCommonStruct anchorCommonStructLIZJ = this.LL.LIZJ();
                    CommerceAnchorInfo commerceAnchorInfo2 = this.LLILLJJLI;
                    if (commerceAnchorInfo2 != null) {
                        mapExtra3 = commerceAnchorInfo2.getMapExtra();
                    }
                    iCommerceAnchorLogger.LJIILJJIL(aweme, anchorCommonStructLIZJ, mapExtra3, this.LL.getEnterFrom(), str2, this.LL.LJIIIIZZ(), this.LL.getRefer());
                    return;
                }
                if (AwemeExtKt.isAdTraffic(aweme)) {
                    awemeRawAdLJJIJL = aweme.getAwemeRawAd();
                } else {
                    awemeRawAdLJJIJL = C1017070cZd.LJJIJL(aweme);
                }
                C1022820ciu c1022820ciuLIZLLL = C2184171Adz.LIZLLL("draw_ad", "othershow", awemeRawAdLJJIJL);
                c1022820ciuLIZLLL.LIZJ(str, "refer");
                AnchorCommonStruct anchorCommonStructLIZJ2 = this.LL.LIZJ();
                if (anchorCommonStructLIZJ2 != null) {
                    numValueOf = Integer.valueOf(anchorCommonStructLIZJ2.getType());
                } else {
                    numValueOf = null;
                }
                c1022820ciuLIZLLL.LIZIZ(String.valueOf(numValueOf), "anchor_type");
                c1022820ciuLIZLLL.LIZIZ(this.LL.getEnterFrom(), "enter_from");
                CommerceAnchorInfo commerceAnchorInfo3 = this.LLILLJJLI;
                if (commerceAnchorInfo3 != null && (mapExtra = commerceAnchorInfo3.getMapExtra()) != null) {
                    mapAnchorExtra = mapExtra.getMapAnchorExtra();
                }
                c1022820ciuLIZLLL.LIZIZ(mapAnchorExtra, "map_anchor_extra");
                c1022820ciuLIZLLL.LJII();
            }

            @Override // X.InterfaceC1050170dR1
            public final void It(View view, Aweme aweme, boolean z) {
                ICommerceAnchorOutService iCommerceAnchorOutServiceLIZ = LIZ();
                if (iCommerceAnchorOutServiceLIZ != null) {
                    iCommerceAnchorOutServiceLIZ.LIZLLL();
                }
            }

            @Override // X.InterfaceC1050170dR1
            public final void bn1(View view, C2344009Gk c2344009Gk, String str) throws JSONException {
                if0(this.LL.getRefer(), str);
                C1047010dLv c1047010dLv = C1047010dLv.LIZ;
                InterfaceC1044450dHn interfaceC1044450dHn2 = this.LL;
                AnchorData anchorData = this.LLILLL;
                Map mapLIZJ = C2097908Jt.LIZJ(new Pair("enter_method", str));
                c1047010dLv.getClass();
                C1047010dLv.LIZ(interfaceC1044450dHn2, anchorData, mapLIZJ);
                ICommerceAnchorOutService iCommerceAnchorOutServiceLIZ = LIZ();
                if (iCommerceAnchorOutServiceLIZ != null) {
                    iCommerceAnchorOutServiceLIZ.LIZJ();
                }
            }

            @Override // X.InterfaceC1050170dR1
            public final void go2(Dialog dialog, boolean z, boolean z2, boolean z3) {
                o42(this.LL.getRefer(), "anchor_panel");
                C1047010dLv c1047010dLv = C1047010dLv.LIZ;
                InterfaceC1044450dHn interfaceC1044450dHn2 = this.LL;
                AnchorData anchorData = this.LLILLL;
                Map mapLIZJ = C2097908Jt.LIZJ(new Pair("enter_method", "anchor_panel"));
                c1047010dLv.getClass();
                C1047010dLv.LIZ(interfaceC1044450dHn2, anchorData, mapLIZJ);
                ICommerceAnchorOutService iCommerceAnchorOutServiceLIZ = LIZ();
                if (iCommerceAnchorOutServiceLIZ != null) {
                    iCommerceAnchorOutServiceLIZ.LIZ();
                }
            }
        };
    }

    @Override // com.ss.android.ugc.aweme.commercialize.anchor.interfaces.ICommerceAnchorService
    public final boolean LJIIIIZZ(AnchorCommonStruct anchorCommonStruct) {
        if (anchorCommonStruct == null || anchorCommonStruct.getBizGroup() != 1) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.commercialize.anchor.interfaces.ICommerceAnchorService
    public final CommerceAnchorInfo LJIIIZ(String str) {
        C1047010dLv.LIZ.getClass();
        return C1047010dLv.LIZJ(str);
    }

    @Override // com.ss.android.ugc.aweme.commercialize.anchor.interfaces.ICommerceAnchorService
    public final boolean LJIIJ(AnchorCommonStruct anchorCommonStruct) {
        if (anchorCommonStruct.getBizGroup() == 1) {
            C1047010dLv.LIZ.getClass();
            if (C1047010dLv.LIZIZ(anchorCommonStruct).contains(1)) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.commercialize.anchor.interfaces.ICommerceAnchorService
    public final boolean LJIILIIL(AnchorCommonStruct anchorCommonStruct) {
        String id;
        C0CLG.LIZ.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("lastShowTime_");
        if (anchorCommonStruct != null) {
            id = anchorCommonStruct.getId();
        } else {
            id = null;
        }
        sbLIZ.append(id);
        if (jCurrentTimeMillis - C0CLG.LIZIZ.getLong(C2188811AlT.LIZIZ(sbLIZ), 0L) < C0CLG.LIZLLL * C0CLG.LJFF) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.commercialize.anchor.interfaces.ICommerceAnchorService
    public final void LJIILJJIL(AnchorCommonStruct anchorCommonStruct) {
        String str;
        ArrayList arrayList;
        C0CLG.LIZ.getClass();
        if (anchorCommonStruct != null && anchorCommonStruct.getId() != null && (str = C0CLG.LIZJ) != null && str.length() != 0) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("lastShowTime_");
            sbLIZ.append(anchorCommonStruct.getId());
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            Keva keva = C0CLG.LIZIZ;
            keva.storeLong(strLIZIZ, jCurrentTimeMillis);
            String[] stringArray = keva.getStringArray("viewRecords", null);
            if (stringArray != null) {
                ArrayList arrayList2 = new ArrayList(stringArray.length);
                for (String str2 : stringArray) {
                    arrayList2.add(Long.valueOf(CastLongProtector.parseLong(str2)));
                }
                arrayList = new ArrayList(arrayList2);
            } else {
                arrayList = new ArrayList();
            }
            arrayList.add(Long.valueOf(jCurrentTimeMillis));
            Keva keva2 = C0CLG.LIZIZ;
            ArrayList arrayList3 = new ArrayList(C15438062q.LJIJJ(arrayList, 10));
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                arrayList3.add(String.valueOf(((Number) it2.next()).longValue()));
            }
            keva2.storeStringArray("viewRecords", (String[]) arrayList3.toArray(new String[0]));
        }
    }

    @Override // com.ss.android.ugc.aweme.commercialize.anchor.interfaces.ICommerceAnchorService
    public final void LIZ(Aweme aweme, String str) {
        CommerceAnchorLogger.LJJIIZ().LIZ(aweme, str);
    }

    @Override // com.ss.android.ugc.aweme.commercialize.anchor.interfaces.ICommerceAnchorService
    public final C1050130dQx LJIIJJI(Context context, Aweme aweme, String str, AwS260S0300000_16 awS260S0300000_16) {
        List<AnchorCommonStruct> anchors;
        if (aweme == null || (anchors = aweme.getAnchors()) == null || anchors.isEmpty()) {
            return null;
        }
        for (AnchorCommonStruct anchorCommonStruct : anchors) {
            if (anchorCommonStruct.getBizGroup() == 1) {
                C1047010dLv.LIZ.getClass();
                if (C1047010dLv.LIZIZ(anchorCommonStruct).contains(2)) {
                    return new C1050130dQx(context, aweme, anchorCommonStruct, str, awS260S0300000_16);
                }
            }
        }
        return null;
    }
}
