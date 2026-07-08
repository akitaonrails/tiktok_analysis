package com.ss.android.ugc.aweme.ecommerce.ug.feedeccard.service;

import X.AnonymousClass1666;
import X.C0S78;
import X.C123500dV;
import X.C1768000w6o;
import X.C207193165v;
import X.C207196165y;
import X.C711420RvQ;
import X.C716970SAl;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ecommerce.ug.feedeccard.bean.FeedEcCardConfig;
import com.ss.android.ugc.aweme.ecommerce.ug.feedeccard.bean.FeedEcCardData;
import com.ss.android.ugc.aweme.feed.ab.FeedEcCardTrackServerConfig;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.feed.model.cardinsert.CardInsertInfo;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes32.dex */
public final class EcUgFeedEcCardService implements IFeedEcCardService {
    @Override // com.ss.android.ugc.aweme.ecommerce.ug.feedeccard.service.IFeedEcCardService
    public final List<Object> LIZIZ() {
        return Collections.singletonList(new C711420RvQ() { // from class: X.0So2
            {
                new C732310So1();
                new C732300So0();
                new C732330So3();
            }
        });
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.ug.feedeccard.service.IFeedEcCardService
    public final void LIZJ(int i, List list) {
        AnonymousClass1666.LIZ.getClass();
        C0S78.LIZJ(new C716970SAl(list, i), true);
    }

    /* JADX WARN: Removed duplicated region for block: B:65:0x013b  */
    @Override // com.ss.android.ugc.aweme.ecommerce.ug.feedeccard.service.IFeedEcCardService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List<com.ss.android.ugc.feed.platform.cardinsert.data.CardTypeRequest> LIZ(com.ss.android.ugc.feed.platform.cardinsert.data.FeedCardInsertData r23, java.util.List<com.ss.android.ugc.aweme.feed.model.cardinsert.CardInsertResultInfo> r24, java.lang.Object r25) {
        /*
            Method dump skipped, instruction units count: 1119
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.ug.feedeccard.service.EcUgFeedEcCardService.LIZ(com.ss.android.ugc.feed.platform.cardinsert.data.FeedCardInsertData, java.util.List, java.lang.Object):java.util.List");
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.ug.feedeccard.service.IFeedEcCardService
    public final void LIZLLL(Aweme aweme, Integer num, Integer num2, boolean z) {
        CardInsertInfo cardInsertInfo;
        Integer numValueOf;
        Map<String, String> map;
        String str;
        FeedEcCardData feedEcCardDataLIZ;
        FeedEcCardConfig feedEcCardConfig;
        Integer num3;
        AnonymousClass1666.LIZ.getClass();
        FeedEcCardTrackServerConfig.TrackModel trackModel = (FeedEcCardTrackServerConfig.TrackModel) FeedEcCardTrackServerConfig.LIZIZ.getValue();
        String str2 = null;
        if (aweme != null && (cardInsertInfo = aweme.getCardInsertInfo()) != null && (numValueOf = Integer.valueOf(cardInsertInfo.getCardType())) != null) {
            numValueOf.intValue();
            if (Intrinsics.LJFF(trackModel.enable, Boolean.TRUE) && (map = trackModel.cardTypeList) != null && map.containsKey(C123500dV.LIZIZ(numValueOf))) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                linkedHashMap.put("card_type", numValueOf);
                if (num != null) {
                    linkedHashMap.put("feed_count", Integer.valueOf(num.intValue()));
                }
                if (num2 != null) {
                    linkedHashMap.put("insert_index", Integer.valueOf(num2.intValue()));
                }
                if (aweme != null) {
                    CardInsertInfo cardInsertInfo2 = aweme.getCardInsertInfo();
                    if (cardInsertInfo2 != null) {
                        linkedHashMap.put("card_impl_type", Integer.valueOf(cardInsertInfo2.getCardImplType()));
                    }
                    linkedHashMap.put("aweme_type", Integer.valueOf(aweme.getAwemeType()));
                }
                if (z) {
                    str = "1";
                } else {
                    str = CardStruct.IStatusCode.DEFAULT;
                }
                linkedHashMap.put("has_cache", str);
                Map<String, String> map2 = trackModel.cardTypeList;
                if (map2 != null && (str2 = map2.get(C123500dV.LIZIZ(numValueOf))) != null) {
                    linkedHashMap.put("type", str2);
                }
                try {
                    if (Intrinsics.LJFF(str2, "native") && (feedEcCardDataLIZ = C207193165v.LIZ(aweme)) != null && (feedEcCardConfig = feedEcCardDataLIZ.LIZ) != null && (num3 = feedEcCardConfig.cardSubtype) != null) {
                        linkedHashMap.put("card_subtype", Integer.valueOf(num3.intValue()));
                    }
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                C207196165y.LIZ.getClass();
                linkedHashMap.put("not_display_request_item_count", Integer.valueOf(C207196165y.LIZ()));
                C1768000w6o.LIZ.getClass();
                C1768000w6o.LIZIZ("rd_tiktokec_feed_ec_card_info_from_server", linkedHashMap);
            }
        }
    }
}
