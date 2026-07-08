package com.ss.android.ugc.aweme.ecommerce.ug.mixfeed.service;

import X.C1604850rrf;
import X.C1735810vGt;
import X.C2189821An6;
import com.bytedance.android.livesdkapi.session.EnterRoomConfig;
import com.ss.android.ugc.aweme.ecommerce.ug.mixfeed.ECMixFeedService;
import com.ss.android.ugc.aweme.ecommerce.ug.mixfeed.utils.ECMixFeedExtra;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes8.dex */
public final class ECMixFeedServiceImpl implements ECMixFeedService {
    public final HashMap<String, String> LIZ;

    @Override // com.ss.android.ugc.aweme.ecommerce.ug.mixfeed.ECMixFeedService
    public final C1604850rrf LIZJ() {
        return C1604850rrf.LJ.getValue();
    }

    public ECMixFeedServiceImpl() {
        HashMap<String, String> map = new HashMap<>();
        map.put("is_ec_mix_feed", "1");
        this.LIZ = map;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.ug.mixfeed.ECMixFeedService
    public final HashMap<String, String> LIZ() {
        return this.LIZ;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.ug.mixfeed.ECMixFeedService
    public final boolean LIZLLL(EnterRoomConfig enterRoomConfig) {
        if (Intrinsics.LJFF(enterRoomConfig.mRoomsData.enterFromMerge, "mall") && enterRoomConfig.mSearchData.isFromSearch) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.ug.mixfeed.ECMixFeedService
    public final boolean LJ(C2189821An6 c2189821An6) {
        String from;
        if (c2189821An6 != null) {
            from = c2189821An6.getFrom();
        } else {
            from = null;
        }
        return Intrinsics.LJFF(from, "mix_list_from_ttmall_homepage");
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.ug.mixfeed.ECMixFeedService
    public final EnterRoomConfig LIZIZ(EnterRoomConfig enterRoomConfig, Aweme aweme, C2189821An6 c2189821An6) {
        String str;
        String strLJJJLL;
        if (c2189821An6 != null && enterRoomConfig != null && aweme != null) {
            enterRoomConfig.mLogData.sourceBtmToken = c2189821An6.getSourceBtmToken();
            enterRoomConfig.mRoomsData.enterFromMerge = c2189821An6.getEventType();
            EnterRoomConfig.RoomsData roomsData = enterRoomConfig.mRoomsData;
            roomsData.hasCommerceGoods = Boolean.TRUE;
            roomsData.enterType = "click";
            C1735810vGt.LIZ.getClass();
            ECMixFeedExtra eCMixFeedExtraLIZIZ = C1735810vGt.LIZIZ(c2189821An6);
            EnterRoomConfig.RoomsData roomsData2 = enterRoomConfig.mRoomsData;
            String strLJJJLL2 = null;
            if (eCMixFeedExtraLIZIZ != null) {
                str = eCMixFeedExtraLIZIZ.enterMethod;
            } else {
                str = null;
            }
            roomsData2.enterMethod = str;
            enterRoomConfig.mECData.isFromECContext = 1;
            HashMap<String, String> mobParams = aweme.getMobParams();
            if (mobParams != null) {
                enterRoomConfig.mECData.ecCommonExtraParam = mobParams;
                EnterRoomConfig.LogData logData = enterRoomConfig.mLogData;
                String str2 = mobParams.get("source_module");
                if (str2 != null && (strLJJJLL = a0.LJJJLL("_outer_flow", str2)) != null) {
                    strLJJJLL2 = a0.LJJJLL("_inner_flow", strLJJJLL);
                }
                logData.sourceModule = strLJJJLL2;
            }
        }
        return enterRoomConfig;
    }
}
