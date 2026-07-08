package com.ss.android.ugc.aweme.editeffect.search.middleware.result;

import X.C09CT;
import X.C15438062q;
import com.ss.android.ugc.aweme.feed.model.LogPbBean;
import com.ss.android.ugc.effectmanager.effect.model.Asset;
import com.ss.android.ugc.effectmanager.effect.model.AssetUtilsKt;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes23.dex */
public final class EffectSearchResultResponse {
    public transient List<? extends Effect> LIZ;

    @C09CT("has_more")
    public final Integer _hasMore;

    @C09CT("asset_list")
    public final List<Asset> assetList;

    @C09CT("cursor")
    public final Integer cursor;

    @C09CT("log_pb")
    public final LogPbBean logPb;

    @C09CT("status_code")
    public final Integer statusCode;

    public EffectSearchResultResponse() {
        this(-1, null, 0, 0, null, null);
    }

    public final List<Effect> LIZ() {
        List list = this.LIZ;
        if (list != null) {
            return list;
        }
        List<Asset> list2 = this.assetList;
        ArrayList arrayList = null;
        if (list2 != null) {
            ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(list2, 10));
            Iterator<Asset> it2 = list2.iterator();
            while (it2.hasNext()) {
                arrayList2.add(AssetUtilsKt.convertAssetToEffect(it2.next(), null));
            }
            arrayList = arrayList2;
        }
        this.LIZ = arrayList;
        return arrayList;
    }

    public EffectSearchResultResponse(Integer num, LogPbBean logPbBean, Integer num2, Integer num3, List<Asset> list, List<? extends Effect> list2) {
        this.statusCode = num;
        this.logPb = logPbBean;
        this.cursor = num2;
        this._hasMore = num3;
        this.assetList = list;
        this.LIZ = list2;
    }
}
