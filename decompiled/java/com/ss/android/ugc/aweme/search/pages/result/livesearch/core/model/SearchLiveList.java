package com.ss.android.ugc.aweme.search.pages.result.livesearch.core.model;

import X.C09CT;
import X.C7740030o;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.google.gson.reflect.TypeToken;
import com.ss.android.ugc.aweme.discover.model.SearchApiResult;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes11.dex */
public class SearchLiveList extends SearchApiResult {
    public List<SearchLiveStruct> LL;
    public List<SearchLiveStruct> LLILLJJLI;

    @C09CT("cursor")
    public long cursor;

    @C09CT("extra_data")
    public List<Map<?, ?>> extraDataRaw;

    @C09CT("has_more")
    public boolean hasMore;

    @C09CT("data")
    public List<Map<?, ?>> liveListRaw;

    @C09CT("raw_timestamp")
    public Long rawTimestamp;

    public final List<SearchLiveStruct> LJ() {
        if (this.LLILLJJLI == null && this.extraDataRaw != null) {
            this.LLILLJJLI = new ArrayList();
            Iterator<Map<?, ?>> it2 = this.extraDataRaw.iterator();
            while (it2.hasNext()) {
                ((ArrayList) this.LLILLJJLI).add(GsonProtectorUtils.fromJson(C7740030o.LIZ().getGson(), GsonProtectorUtils.toJson(C7740030o.LIZ().getGson(), it2.next()), new TypeToken<SearchLiveStruct>() { // from class: X.0PZC
                }.getType()));
            }
        }
        return this.LLILLJJLI;
    }

    public final List<SearchLiveStruct> LJI() {
        if (this.LL == null && this.liveListRaw != null) {
            this.LL = new ArrayList();
            Iterator<Map<?, ?>> it2 = this.liveListRaw.iterator();
            while (it2.hasNext()) {
                ((ArrayList) this.LL).add(GsonProtectorUtils.fromJson(C7740030o.LIZ().getGson(), GsonProtectorUtils.toJson(C7740030o.LIZ().getGson(), it2.next()), new TypeToken<SearchLiveStruct>() { // from class: X.0PZB
                }.getType()));
            }
        }
        return this.LL;
    }
}
