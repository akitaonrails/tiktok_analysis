package com.ss.android.ugc.aweme.ecommercelive.common.biz.us.popcard.bidding;

import X.AbstractC21198517xX;
import X.AnonymousClass0956;
import X.C01GW;
import X.C13LP;
import X.C1507790pL7;
import X.C1537900q7g;
import X.C1541950qED;
import X.C1547280qMo;
import X.C1720106oR;
import X.C1741890vQh;
import X.C1743900vTw;
import X.C181T;
import X.C181U;
import X.C181X;
import X.C19673811yC;
import X.C19EG;
import X.C21182417uw;
import X.C212167181d;
import X.C2187451AjH;
import X.C2188811AlT;
import X.C23250099c;
import X.C452501pT;
import X.C598730Ne3;
import X.C948503nH;
import X.InterfaceC19677911yr;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ecommercebase.promotion.data.SinglePriceHideInfo;
import com.ss.android.ugc.aweme.ecommercebase.promotion.data.SinglePriceItem;
import com.ss.android.ugc.aweme.ecommercelive.common.biz.us.popcard.data.AuctionData;
import com.ss.android.ugc.aweme.ecommercelive.common.biz.us.popcard.data.AuctionUserInfo;
import com.ss.android.ugc.aweme.ecommercelive.common.biz.us.popcard.data.StatusRetryCfg;
import com.ss.android.ugc.aweme.ecommercelive.common.biz.us.popcard.data.SurpriseSetData;
import com.ss.android.ugc.aweme.ecommercelive.common.biz.us.popcard.vo.UsPopupCardVO;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS190S0000000_4;
import kotlin.jvm.internal.Intrinsics;
import webcast.data.oec_msg.AuctionInfo;
import webcast.data.oec_msg.ExtendAuctionCfg;
import webcast.data.oec_msg.PriceHideInfo;
import webcast.data.oec_msg.PriceItem;
import webcast.data.oec_msg.UserInfo;

/* JADX INFO: loaded from: classes33.dex */
public final class UsBidViewModel extends ViewModel {
    public static final /* synthetic */ int LLJL = 0;
    public String LL;
    public UsPopupCardVO LLILLJJLI;
    public Long LLILLL;
    public Long LLILZ;
    public String LLILZIL;
    public SinglePriceItem LLILZLL;
    public C1743900vTw LLIZ;
    public String LLIZLLLIL = "";
    public final MutableLiveData<Boolean> LLJ;
    public final MutableLiveData<Boolean> LLJI;
    public C181U LLJIJIL;
    public final List<InterfaceC19677911yr> LLJILJIL;
    public final List<C181X> LLJILJILJ;
    public Map<String, Boolean> LLJILLL;
    public long LLJJ;
    public long LLJJI;
    public final C01GW LLJJIII;
    public long LLJJIJI;
    public boolean LLJJIJIIJIL;
    public C598730Ne3 LLJJIJIL;
    public Map<String, StatusRetryCfg> LLJJJ;
    public AbstractC21198517xX<?> LLJJJIL;
    public Boolean LLJJJJ;
    public AnonymousClass0956 LLJJJJJIL;
    public String LLJJJJLIIL;
    public final C01GW LLJJL;
    public final C01GW LLJJLIIIJLLLLLLLZ;

    public UsBidViewModel() {
        Boolean bool = Boolean.FALSE;
        this.LLJ = C948503nH.LJIIL(bool);
        this.LLJI = C948503nH.LJIIL(bool);
        this.LLJILJIL = new ArrayList();
        this.LLJILJILJ = new ArrayList();
        this.LLJILLL = new LinkedHashMap();
        this.LLJJ = -1L;
        this.LLJJI = -1L;
        this.LLJJIII = C452501pT.LIZIZ(AFwS190S0000000_4.get$arr$(987));
        this.LLJJJJLIIL = "";
        this.LLJJL = C452501pT.LIZIZ(AFwS190S0000000_4.get$arr$(985));
        this.LLJJLIIIJLLLLLLLZ = C452501pT.LIZIZ(AFwS190S0000000_4.get$arr$(986));
    }

    public static SinglePriceItem EQ2(PriceItem priceItem) {
        String str;
        String str2 = priceItem.currencyName;
        String str3 = priceItem.currencySymbol;
        int i = priceItem.symbolPosition;
        String str4 = priceItem.salePriceFormat;
        String str5 = priceItem.salePriceDecimal;
        String str6 = priceItem.originPriceFormat;
        String str7 = priceItem.discountFormat;
        String str8 = priceItem.pricePrefix;
        int i2 = priceItem.priceDisplayMode;
        PriceHideInfo priceHideInfo = priceItem.priceHideInfo;
        if (priceHideInfo != null) {
            str = priceHideInfo.displayText;
        } else {
            str = null;
        }
        SinglePriceHideInfo singlePriceHideInfo = new SinglePriceHideInfo(str);
        boolean z = priceItem.showCurrencySpace;
        return new SinglePriceItem(0L, str2, str3, i, str5, null, str4, str6, str7, null, str8, Integer.valueOf(i2), singlePriceHideInfo, priceItem.reducePriceFormat, priceItem.singleProductPriceFormat, Boolean.valueOf(z), Integer.valueOf(priceItem.currencyShowMode), null, null, null);
    }

    public final void CQ2(InterfaceC19677911yr interfaceC19677911yr) {
        if (((ArrayList) this.LLJILJIL).contains(interfaceC19677911yr)) {
            return;
        }
        ((ArrayList) this.LLJILJIL).add(interfaceC19677911yr);
    }

    public final void FQ2(AuctionInfo auctionInfo) {
        String str;
        List urls;
        C181U c181u = this.LLJIJIL;
        if (c181u != null) {
            c181u.LJII = auctionInfo.auctionTextTypeInt;
        }
        if (c181u != null) {
            if (c181u.LJII == 0) {
                c181u.LJII = 11;
            }
            c181u.LJIIIZ = false;
            c181u.LJI = auctionInfo.auctionStatus;
        }
        UserInfo userInfo = auctionInfo.auctionWinner;
        if (userInfo != null && c181u != null) {
            Long lValueOf = Long.valueOf(userInfo.userId);
            String str2 = userInfo.nickName;
            ImageModel imageModel = userInfo.avatar;
            if (imageModel != null && (urls = imageModel.getUrls()) != null) {
                str = (String) C13LP.LJJJLZIJ(0, urls);
            } else {
                str = null;
            }
            c181u.LIZIZ = new C212167181d(Boolean.FALSE, str2, str, lValueOf);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x005d A[PHI: r8 r15 r16 r17
      0x005d: PHI (r8v4 com.ss.android.ugc.aweme.ecommercelive.common.biz.us.popcard.data.AuctionData) = 
      (r8v2 com.ss.android.ugc.aweme.ecommercelive.common.biz.us.popcard.data.AuctionData)
      (r8v5 com.ss.android.ugc.aweme.ecommercelive.common.biz.us.popcard.data.AuctionData)
     binds: [B:82:0x00e7, B:37:0x0059] A[DONT_GENERATE, DONT_INLINE]
      0x005d: PHI (r15v3 com.ss.android.ugc.aweme.ecommercebase.promotion.data.SinglePriceItem) = 
      (r15v1 com.ss.android.ugc.aweme.ecommercebase.promotion.data.SinglePriceItem)
      (r15v4 com.ss.android.ugc.aweme.ecommercebase.promotion.data.SinglePriceItem)
     binds: [B:82:0x00e7, B:37:0x0059] A[DONT_GENERATE, DONT_INLINE]
      0x005d: PHI (r16v2 X.181d) = (r16v0 X.181d), (r16v3 X.181d) binds: [B:82:0x00e7, B:37:0x0059] A[DONT_GENERATE, DONT_INLINE]
      0x005d: PHI (r17v4 com.ss.android.ugc.aweme.ecommercebase.promotion.data.SinglePriceItem) = 
      (r17v1 com.ss.android.ugc.aweme.ecommercebase.promotion.data.SinglePriceItem)
      (r17v5 com.ss.android.ugc.aweme.ecommercebase.promotion.data.SinglePriceItem)
     binds: [B:82:0x00e7, B:37:0x0059] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0079 A[PHI: r6 r7 r23
      0x0079: PHI (r6v7 int) = (r6v1 int), (r6v8 int) binds: [B:71:0x00d3, B:45:0x0075] A[DONT_GENERATE, DONT_INLINE]
      0x0079: PHI (r7v7 int) = (r7v1 int), (r7v8 int) binds: [B:71:0x00d3, B:45:0x0075] A[DONT_GENERATE, DONT_INLINE]
      0x0079: PHI (r23v6 int) = (r23v0 int), (r23v7 int) binds: [B:71:0x00d3, B:45:0x0075] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0085 A[PHI: r5 r6 r7 r13 r23 r26
      0x0085: PHI (r5v5 boolean) = (r5v1 boolean), (r5v6 boolean) binds: [B:74:0x00d9, B:48:0x0081] A[DONT_GENERATE, DONT_INLINE]
      0x0085: PHI (r6v6 int) = (r6v2 int), (r6v7 int) binds: [B:74:0x00d9, B:48:0x0081] A[DONT_GENERATE, DONT_INLINE]
      0x0085: PHI (r7v6 int) = (r7v2 int), (r7v7 int) binds: [B:74:0x00d9, B:48:0x0081] A[DONT_GENERATE, DONT_INLINE]
      0x0085: PHI (r13v6 webcast.data.oec_msg.CarouselCfg) = (r13v1 webcast.data.oec_msg.CarouselCfg), (r13v7 webcast.data.oec_msg.CarouselCfg) binds: [B:74:0x00d9, B:48:0x0081] A[DONT_GENERATE, DONT_INLINE]
      0x0085: PHI (r23v5 int) = (r23v1 int), (r23v6 int) binds: [B:74:0x00d9, B:48:0x0081] A[DONT_GENERATE, DONT_INLINE]
      0x0085: PHI (r26v4 java.lang.String) = (r26v0 java.lang.String), (r26v5 java.lang.String) binds: [B:74:0x00d9, B:48:0x0081] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x008d A[PHI: r5 r6 r7 r11 r12 r13 r23 r26
      0x008d: PHI (r5v4 boolean) = (r5v2 boolean), (r5v5 boolean) binds: [B:77:0x00dd, B:51:0x008b] A[DONT_GENERATE, DONT_INLINE]
      0x008d: PHI (r6v5 int) = (r6v3 int), (r6v6 int) binds: [B:77:0x00dd, B:51:0x008b] A[DONT_GENERATE, DONT_INLINE]
      0x008d: PHI (r7v5 int) = (r7v3 int), (r7v6 int) binds: [B:77:0x00dd, B:51:0x008b] A[DONT_GENERATE, DONT_INLINE]
      0x008d: PHI (r11v2 java.lang.Long) = (r11v0 java.lang.Long), (r11v3 java.lang.Long) binds: [B:77:0x00dd, B:51:0x008b] A[DONT_GENERATE, DONT_INLINE]
      0x008d: PHI (r12v3 java.lang.Long) = (r12v1 java.lang.Long), (r12v4 java.lang.Long) binds: [B:77:0x00dd, B:51:0x008b] A[DONT_GENERATE, DONT_INLINE]
      0x008d: PHI (r13v5 webcast.data.oec_msg.CarouselCfg) = (r13v2 webcast.data.oec_msg.CarouselCfg), (r13v6 webcast.data.oec_msg.CarouselCfg) binds: [B:77:0x00dd, B:51:0x008b] A[DONT_GENERATE, DONT_INLINE]
      0x008d: PHI (r23v4 int) = (r23v2 int), (r23v5 int) binds: [B:77:0x00dd, B:51:0x008b] A[DONT_GENERATE, DONT_INLINE]
      0x008d: PHI (r26v3 java.lang.String) = (r26v1 java.lang.String), (r26v4 java.lang.String) binds: [B:77:0x00dd, B:51:0x008b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00dc A[PHI: r5 r6 r7 r12 r13 r23 r26
      0x00dc: PHI (r5v2 boolean) = (r5v1 boolean), (r5v5 boolean) binds: [B:75:0x00db, B:50:0x0089] A[DONT_GENERATE, DONT_INLINE]
      0x00dc: PHI (r6v3 int) = (r6v2 int), (r6v6 int) binds: [B:75:0x00db, B:50:0x0089] A[DONT_GENERATE, DONT_INLINE]
      0x00dc: PHI (r7v3 int) = (r7v2 int), (r7v6 int) binds: [B:75:0x00db, B:50:0x0089] A[DONT_GENERATE, DONT_INLINE]
      0x00dc: PHI (r12v1 java.lang.Long) = (r12v0 java.lang.Long), (r12v4 java.lang.Long) binds: [B:75:0x00db, B:50:0x0089] A[DONT_GENERATE, DONT_INLINE]
      0x00dc: PHI (r13v2 webcast.data.oec_msg.CarouselCfg) = (r13v1 webcast.data.oec_msg.CarouselCfg), (r13v6 webcast.data.oec_msg.CarouselCfg) binds: [B:75:0x00db, B:50:0x0089] A[DONT_GENERATE, DONT_INLINE]
      0x00dc: PHI (r23v2 int) = (r23v1 int), (r23v5 int) binds: [B:75:0x00db, B:50:0x0089] A[DONT_GENERATE, DONT_INLINE]
      0x00dc: PHI (r26v1 java.lang.String) = (r26v0 java.lang.String), (r26v4 java.lang.String) binds: [B:75:0x00db, B:50:0x0089] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00e9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.ss.android.ugc.aweme.ecommercelive.common.biz.us.popcard.data.AuctionData vQ2(com.ss.android.ugc.aweme.ecommercelive.common.biz.us.popcard.vo.UsPopupCardVO r34) {
        /*
            Method dump skipped, instruction units count: 254
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommercelive.common.biz.us.popcard.bidding.UsBidViewModel.vQ2(com.ss.android.ugc.aweme.ecommercelive.common.biz.us.popcard.vo.UsPopupCardVO):com.ss.android.ugc.aweme.ecommercelive.common.biz.us.popcard.data.AuctionData");
    }

    public final void wQ2(int i) {
        StatusRetryCfg statusRetryCfg;
        Long l;
        AnonymousClass0956 anonymousClass0956 = this.LLJJJJJIL;
        if (anonymousClass0956 != null) {
            anonymousClass0956.LIZIZ(null);
        }
        Map<String, StatusRetryCfg> map = this.LLJJJ;
        if (map != null && (statusRetryCfg = map.get(String.valueOf(i))) != null && (l = statusRetryCfg.maxRetryTimes) != null) {
            this.LLJJJJJIL = C23250099c.LIZLLL(ViewModelKt.getViewModelScope(this), null, null, new C21182417uw(l.longValue(), statusRetryCfg, this, i, null), 3);
        }
    }

    public final void zQ2(C181U c181u) {
        String string;
        String str;
        Long l;
        int i = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("informAuctionInfoChanged, auctionInfoListeners: ");
        sbLIZ.append(((ArrayList) this.LLJILJIL).size());
        C1720106oR.LJI("UsBid", C2188811AlT.LIZIZ(sbLIZ));
        Iterator it2 = ((ArrayList) this.LLJILJIL).iterator();
        while (it2.hasNext()) {
            ((InterfaceC19677911yr) it2.next()).LJLIIIL(c181u);
        }
        int i2 = 0;
        if (c181u != null) {
            int i3 = c181u.LJI;
            if (i3 == 20 || i3 == 30) {
                C212167181d c212167181d = c181u.LIZIZ;
                if (c212167181d != null && (l = c212167181d.LIZ) != null) {
                    string = l.toString();
                } else {
                    string = null;
                }
                String str2 = "";
                if (string == null) {
                    string = "";
                }
                if ((c212167181d != null && Intrinsics.LJFF(c212167181d.LIZLLL, Boolean.TRUE)) || Intrinsics.LJFF(string, this.LLJJIII.getValue())) {
                    Map<String, String> mapXQ2 = xQ2(null, null, true);
                    SinglePriceItem singlePriceItem = c181u.LIZJ;
                    if (singlePriceItem != null && (str = singlePriceItem.salePriceFormat) != null) {
                        str2 = str;
                    }
                    mapXQ2.put("money", str2);
                    C1507790pL7.LIZ.getClass();
                    C1507790pL7.LIZJ("tiktokec_bid_win", mapXQ2);
                }
            }
            i2 = c181u.LJI;
        }
        wQ2(i2);
    }

    public final void AQ2(UsPopupCardVO usPopupCardVO, boolean z) {
        AuctionData auctionData;
        String string;
        String str;
        Long l;
        for (C181X c181x : (ArrayList) this.LLJILJILJ) {
            c181x.ky(usPopupCardVO);
            if (z) {
                c181x.Hi(usPopupCardVO);
            }
        }
        if (usPopupCardVO != null && (auctionData = usPopupCardVO.auctionData) != null) {
            int i = auctionData.auctionStatus;
            if (i != 20 && i != 30) {
                return;
            }
            AuctionUserInfo auctionUserInfo = auctionData.bidderInfo;
            if (auctionUserInfo != null && (l = auctionUserInfo.userId) != null) {
                string = l.toString();
            } else {
                string = null;
            }
            String str2 = "";
            if (string == null) {
                string = "";
            }
            if ((auctionUserInfo == null || !Intrinsics.LJFF(auctionUserInfo.isWinner, Boolean.TRUE)) && !Intrinsics.LJFF(string, this.LLJJIII.getValue())) {
                return;
            }
            Map<String, String> mapXQ2 = xQ2(null, null, true);
            SinglePriceItem singlePriceItem = auctionData.currentBidPrice;
            if (singlePriceItem != null && (str = singlePriceItem.salePriceFormat) != null) {
                str2 = str;
            }
            mapXQ2.put("money", str2);
            C1507790pL7.LIZ.getClass();
            C1507790pL7.LIZJ("tiktokec_bid_win", mapXQ2);
        }
    }

    public final void BQ2(C19EG c19eg, Map map) {
        String str;
        Object obj = null;
        if (map != null) {
            obj = map.get("schema");
        }
        if ((obj instanceof String) && (str = (String) obj) != null) {
            C1537900q7g c1537900q7g = C1541950qED.LIZJ;
            SparkContext sparkContext = new SparkContext();
            sparkContext.LJJLIIJ(str);
            try {
                C1547280qMo.LJFF(sparkContext, new Pair("agreement", C1741890vQh.LJIIIIZZ(map)), new Pair("track_params", C1741890vQh.LJIIIIZZ(xQ2(null, null, true))));
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
            c1537900q7g.getClass();
            new C1541950qED(c19eg, sparkContext).LIZIZ();
        }
    }

    public final Map<String, String> xQ2(Boolean bool, Long l, boolean z) {
        String string;
        String str;
        ExtendAuctionCfg extendAuctionCfg;
        String str2;
        String strLIZ;
        String strLIZIZ;
        String str3;
        long jLongValue;
        String string2;
        AuctionData auctionData;
        Map<String, Object> map;
        AuctionData auctionData2;
        SurpriseSetData surpriseSetData;
        Long l2;
        AuctionData auctionData3;
        SurpriseSetData surpriseSetData2;
        Long l3;
        AuctionData auctionData4;
        String str4;
        SinglePriceItem singlePriceItem;
        String strLIZJ;
        String strLIZJ2;
        String strLIZJ3;
        String strLIZJ4;
        String strLIZJ5;
        String strLIZJ6;
        String strLIZJ7;
        String strLIZJ8;
        AuctionData auctionData5;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("author_id", String.valueOf(this.LLJJI));
        linkedHashMap.put("room_id", String.valueOf(this.LLJJ));
        Long l4 = this.LLILLL;
        String str5 = "";
        if (l4 == null || (string = l4.toString()) == null) {
            string = "";
        }
        linkedHashMap.put("product_id", string);
        linkedHashMap.put("live_status", "during_live");
        C181U c181u = this.LLJIJIL;
        if (c181u == null || (str = c181u.LJIIJJI) == null) {
            str = "";
        }
        linkedHashMap.put("auction_id", str);
        UsPopupCardVO usPopupCardVO = this.LLILLJJLI;
        if (usPopupCardVO != null && (auctionData5 = usPopupCardVO.auctionData) != null) {
            extendAuctionCfg = auctionData5.extendAuctionCfg;
        } else {
            extendAuctionCfg = null;
        }
        linkedHashMap.put("is_extended_auction", C19673811yC.LIZJ(extendAuctionCfg));
        C1743900vTw c1743900vTw = this.LLIZ;
        if (c1743900vTw != null && (strLIZJ8 = c1743900vTw.LIZJ("enter_from_merge")) != null) {
            linkedHashMap.put("enter_from_merge", strLIZJ8);
            linkedHashMap.put("enter_from_info", strLIZJ8);
        }
        C1743900vTw c1743900vTw2 = this.LLIZ;
        if (c1743900vTw2 != null && (strLIZJ7 = c1743900vTw2.LIZJ("search_result_id")) != null) {
            linkedHashMap.put("search_result_id", strLIZJ7);
        }
        C1743900vTw c1743900vTw3 = this.LLIZ;
        if (c1743900vTw3 != null && (strLIZJ6 = c1743900vTw3.LIZJ("search_id")) != null) {
            linkedHashMap.put("search_id", strLIZJ6);
        }
        C1743900vTw c1743900vTw4 = this.LLIZ;
        if (c1743900vTw4 != null && (strLIZJ5 = c1743900vTw4.LIZJ("request_id")) != null) {
            linkedHashMap.put("request_id", strLIZJ5);
        }
        C1743900vTw c1743900vTw5 = this.LLIZ;
        if (c1743900vTw5 != null && (strLIZJ4 = c1743900vTw5.LIZJ("enter_method")) != null) {
            linkedHashMap.put("enter_method", strLIZJ4);
        }
        C1743900vTw c1743900vTw6 = this.LLIZ;
        if (c1743900vTw6 != null && (strLIZJ3 = c1743900vTw6.LIZJ("action_type")) != null) {
            linkedHashMap.put("action_type", strLIZJ3);
        }
        C1743900vTw c1743900vTw7 = this.LLIZ;
        if (c1743900vTw7 != null && (strLIZJ2 = c1743900vTw7.LIZJ("follow_status")) != null) {
            linkedHashMap.put("follow_status", strLIZJ2);
        }
        C1743900vTw c1743900vTw8 = this.LLIZ;
        if (c1743900vTw8 != null && (strLIZJ = c1743900vTw8.LIZJ("ecom_live_rcmd_info")) != null) {
            linkedHashMap.put("ecom_live_rcmd_info", strLIZJ);
        }
        linkedHashMap.put("entrance_form", "live_popup_card");
        String str6 = "bid";
        linkedHashMap.put("source_button", "bid");
        if (Intrinsics.LJFF(bool, Boolean.TRUE)) {
            str2 = "live_auction_set_max_bid";
        } else {
            str2 = "live_auction_set_bid";
        }
        linkedHashMap.put("page_name", str2);
        linkedHashMap.put("previous_page", "live");
        linkedHashMap.put("source_page_type", "live");
        String str7 = this.LLILZIL;
        if (str7 == null) {
            str7 = "";
        }
        linkedHashMap.put("sku_id", str7);
        linkedHashMap.put("source_content_id", String.valueOf(this.LLJJ));
        if (bool != null) {
            if (bool.booleanValue()) {
                str6 = "max_bid";
            }
            linkedHashMap.put("bid_type", str6);
            if (z) {
                if (bool.booleanValue()) {
                    str4 = this.LLIZLLLIL;
                } else {
                    C181U c181u2 = this.LLJIJIL;
                    if (c181u2 == null || (singlePriceItem = c181u2.LIZLLL) == null || (str4 = singlePriceItem.salePriceFormat) == null) {
                        str4 = "";
                    }
                }
            } else {
                str4 = this.LLJJJJLIIL;
            }
            linkedHashMap.put("bid_price", str4);
        }
        C181U c181u3 = this.LLJIJIL;
        if (c181u3 == null) {
            strLIZ = "";
        } else {
            strLIZ = C19673811yC.LIZ(c181u3.LJI);
        }
        linkedHashMap.put("auction_status", strLIZ);
        UsPopupCardVO usPopupCardVO2 = this.LLILLJJLI;
        if (usPopupCardVO2 == null || (auctionData4 = usPopupCardVO2.auctionData) == null) {
            strLIZIZ = "";
        } else {
            strLIZIZ = C19673811yC.LIZIZ(auctionData4.auctionType);
        }
        linkedHashMap.put("auction_type", strLIZIZ);
        linkedHashMap.put("is_single_sku", "1");
        linkedHashMap.put("page_show_type", "half_screen");
        SinglePriceItem singlePriceItem2 = this.LLILZLL;
        if (singlePriceItem2 == null || (str3 = singlePriceItem2.salePriceFormat) == null) {
            str3 = "";
        }
        linkedHashMap.put("bid_starting_price", str3);
        if (l != null) {
            linkedHashMap.put("time_to_end", String.valueOf(l.longValue()));
        }
        UsPopupCardVO usPopupCardVO3 = this.LLILLJJLI;
        long jLongValue2 = 1;
        if (usPopupCardVO3 != null && (auctionData3 = usPopupCardVO3.auctionData) != null && (surpriseSetData2 = auctionData3.surpriseSetData) != null && (l3 = surpriseSetData2.totalStock) != null) {
            jLongValue = l3.longValue();
        } else {
            jLongValue = 1;
        }
        linkedHashMap.put("auction_info_all", String.valueOf(jLongValue));
        UsPopupCardVO usPopupCardVO4 = this.LLILLJJLI;
        if (usPopupCardVO4 != null && (auctionData2 = usPopupCardVO4.auctionData) != null && (surpriseSetData = auctionData2.surpriseSetData) != null && (l2 = surpriseSetData.remainingStock) != null) {
            jLongValue2 = l2.longValue();
        }
        linkedHashMap.put("auction_info_left", String.valueOf(jLongValue2));
        C181U c181u4 = this.LLJIJIL;
        if (c181u4 == null || (string2 = Integer.valueOf(c181u4.LJI).toString()) == null) {
            string2 = "";
        }
        linkedHashMap.put("rd_auction_status", string2);
        UsPopupCardVO usPopupCardVO5 = this.LLILLJJLI;
        if (usPopupCardVO5 != null && (auctionData = usPopupCardVO5.auctionData) != null && (map = auctionData.auctionDaInfo) != null) {
            for (Map.Entry<String, Object> entry : map.entrySet()) {
                linkedHashMap.put(entry.getKey(), entry.getValue().toString());
            }
        }
        C1743900vTw c1743900vTw9 = this.LLIZ;
        if (c1743900vTw9 != null) {
            String str8 = (String) linkedHashMap.get("product_id");
            if (str8 == null) {
                str8 = "";
            }
            String strLIZ2 = C181T.LIZ(c1743900vTw9, str8);
            if (strLIZ2 != null) {
                str5 = strLIZ2;
            }
        }
        linkedHashMap.put("entrance_info", str5);
        return linkedHashMap;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(16:15|(1:17)(1:52)|18|(1:20)(1:51)|(1:22)(2:32|(2:45|(1:50)(1:49))(2:40|(0)(1:44)))|(1:24)|25|(1:27)(1:31)|28|(9:30|74|53|(1:55)|76|63|(1:65)(1:68)|69|70)(1:61)|62|76|63|(0)(0)|69|70) */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x00d6, code lost:
    
        r10 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x00d7, code lost:
    
        com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0115, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0116, code lost:
    
        com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0119, code lost:
    
        throw r0;
     */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00cd A[Catch: all -> 0x00d6, CancellationException -> 0x0115, TRY_LEAVE, TryCatch #3 {CancellationException -> 0x0115, all -> 0x00d6, blocks: (B:63:0x00c9, B:65:0x00cd), top: B:76:0x00c9 }] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00da  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void DQ2(X.C19EG r32, boolean r33, java.lang.String r34, java.lang.Long r35, X.InterfaceC1631620sYq<? super java.lang.Boolean, ? super com.ss.android.ugc.aweme.ecommercelive.common.infra.data.AuctionBidResp, ? super java.lang.String, kotlin.Unit> r36, kotlin.jvm.functions.Function1<? super kotlin.jvm.functions.Function0<kotlin.Unit>, kotlin.Unit> r37) {
        /*
            Method dump skipped, instruction units count: 282
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommercelive.common.biz.us.popcard.bidding.UsBidViewModel.DQ2(X.19EG, boolean, java.lang.String, java.lang.Long, X.0sYq, kotlin.jvm.functions.Function1):void");
    }
}
