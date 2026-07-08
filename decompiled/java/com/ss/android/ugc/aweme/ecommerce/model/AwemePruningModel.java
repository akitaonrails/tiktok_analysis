package com.ss.android.ugc.aweme.ecommerce.model;

import X.C09CT;
import com.ss.android.ugc.aweme.commerce.model.ShopAdStruct;
import com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct;
import com.ss.android.ugc.aweme.feed.model.AnchorCustomData;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.profile.model.User;
import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes33.dex */
public final class AwemePruningModel implements Serializable {

    @C09CT("aid")
    public final String aid;

    @C09CT("anchorCustomData")
    public final AnchorCustomData anchorCustomData;

    @C09CT("anchors")
    public final List<AnchorCommonStruct> anchors;

    @C09CT("anchorsExtras")
    public final String anchorsExtras;

    @C09CT("author")
    public final User author;

    @C09CT("authorUid")
    public final String authorUid;

    @C09CT("awemeExtraParams")
    public final Map<String, String> awemeExtraParams;

    @C09CT("awemeRawAd")
    public final AwemeRawAd awemeRawAd;

    @C09CT("awemeRawAdIdStr")
    public final String awemeRawAdIdStr;

    @C09CT("eventType")
    public final String eventType;

    @C09CT("groupId")
    public final String groupId;

    @C09CT("isAd")
    public final Boolean isAd;

    @C09CT("mMobParams")
    public final HashMap<String, String> mMobParams;

    @C09CT("requestId")
    public final String requestId;

    @C09CT("shopAdStruct")
    public final ShopAdStruct shopAdStruct;

    @C09CT("startClickTime")
    public Long startClickTime;

    public AwemePruningModel() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AwemePruningModel)) {
            return false;
        }
        AwemePruningModel awemePruningModel = (AwemePruningModel) obj;
        return Intrinsics.LJFF(this.aid, awemePruningModel.aid) && Intrinsics.LJFF(this.groupId, awemePruningModel.groupId) && Intrinsics.LJFF(this.requestId, awemePruningModel.requestId) && Intrinsics.LJFF(this.anchors, awemePruningModel.anchors) && Intrinsics.LJFF(this.authorUid, awemePruningModel.authorUid) && Intrinsics.LJFF(this.author, awemePruningModel.author) && Intrinsics.LJFF(this.awemeRawAdIdStr, awemePruningModel.awemeRawAdIdStr) && Intrinsics.LJFF(this.anchorCustomData, awemePruningModel.anchorCustomData) && Intrinsics.LJFF(this.awemeExtraParams, awemePruningModel.awemeExtraParams) && Intrinsics.LJFF(this.mMobParams, awemePruningModel.mMobParams) && Intrinsics.LJFF(this.isAd, awemePruningModel.isAd) && Intrinsics.LJFF(this.awemeRawAd, awemePruningModel.awemeRawAd) && Intrinsics.LJFF(this.eventType, awemePruningModel.eventType) && Intrinsics.LJFF(this.startClickTime, awemePruningModel.startClickTime) && Intrinsics.LJFF(this.shopAdStruct, awemePruningModel.shopAdStruct) && Intrinsics.LJFF(this.anchorsExtras, awemePruningModel.anchorsExtras);
    }

    public final Boolean isAd() {
        return this.isAd;
    }

    public final void setStartClickTime(Long l) {
        this.startClickTime = l;
    }

    public AwemePruningModel(String str, String str2, String str3, List<AnchorCommonStruct> list, String str4, User user, String str5, AnchorCustomData anchorCustomData, Map<String, String> map, HashMap<String, String> map2, Boolean bool, AwemeRawAd awemeRawAd, String str6, Long l, ShopAdStruct shopAdStruct, String str7) {
        this.aid = str;
        this.groupId = str2;
        this.requestId = str3;
        this.anchors = list;
        this.authorUid = str4;
        this.author = user;
        this.awemeRawAdIdStr = str5;
        this.anchorCustomData = anchorCustomData;
        this.awemeExtraParams = map;
        this.mMobParams = map2;
        this.isAd = bool;
        this.awemeRawAd = awemeRawAd;
        this.eventType = str6;
        this.startClickTime = l;
        this.shopAdStruct = shopAdStruct;
        this.anchorsExtras = str7;
    }
}
