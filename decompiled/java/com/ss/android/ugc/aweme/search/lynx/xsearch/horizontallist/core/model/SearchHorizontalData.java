package com.ss.android.ugc.aweme.search.lynx.xsearch.horizontallist.core.model;

import X.C09CT;
import X.C09CX;
import X.C20039713b1;
import X.C7740030o;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.google.gson.reflect.TypeToken;
import com.ss.android.ugc.aweme.discover.model.SearchApiResult;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes11.dex */
public final class SearchHorizontalData extends SearchApiResult {
    public transient List<? extends Aweme> LL;
    public List<? extends Map<?, ?>> LLILLJJLI;

    @C09CT("aweme_list")
    public List<? extends Map<?, ?>> awemeListRaw;

    @C09CT("has_more")
    public Boolean hasMore;

    @C09CT("new_cursor")
    public Long newCursor;

    @C09CT("raw_data_diff")
    public final String rawDataDiff = "";

    public final List<Aweme> LJ() {
        if (this.LL == null) {
            if (this.awemeListRaw == null) {
                return null;
            }
            this.LL = new ArrayList();
            for (Map<?, ?> map : this.awemeListRaw) {
                C20039713b1.LIZ.getClass();
                if (C20039713b1.LIZJ()) {
                    Object objLJLJJLL = C09CX.LJLJJLL("loadmore", Aweme.class, map);
                    if (objLJLJJLL != null) {
                        ((ArrayList) this.LL).add(objLJLJJLL);
                    }
                } else {
                    ((ArrayList) this.LL).add(GsonProtectorUtils.fromJson(C7740030o.LIZ().getGson(), GsonProtectorUtils.toJson(C7740030o.LIZ().getGson(), map), new TypeToken<Aweme>() { // from class: X.0Pcy
                    }.getType()));
                }
            }
        }
        return this.LL;
    }
}
