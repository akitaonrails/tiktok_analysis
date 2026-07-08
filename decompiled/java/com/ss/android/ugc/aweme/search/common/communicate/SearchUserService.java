package com.ss.android.ugc.aweme.search.common.communicate;

import X.C0C64;
import X.C13LP;
import X.C2188811AlT;
import X.C317760Ccw;
import X.C317770Ccx;
import android.content.Context;
import android.net.Uri;
import com.ss.android.ugc.aweme.search.model.SearchUserSugResponse;
import com.ss.android.ugc.aweme.search.pages.sug.core.repo.SearchSugApi;
import com.ss.android.ugc.aweme.search.service.ISearchUserService;
import java.util.Collection;
import java.util.List;
import org.json.JSONArray;

/* JADX INFO: loaded from: classes5.dex */
public final class SearchUserService implements ISearchUserService {
    @Override // com.ss.android.ugc.aweme.search.service.ISearchUserService
    public final boolean LIZLLL() {
        return C0C64.LJIILLIIL().LJIJ(31744, 0, "disable_relationship", true) != 1;
    }

    @Override // com.ss.android.ugc.aweme.search.service.ISearchUserService
    public final SearchUserSugResponse LIZJ(C317760Ccw c317760Ccw) {
        String strEncode;
        List listLL;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("fetchUserSug, key: ");
        sbLIZ.append(c317760Ccw.LIZJ);
        sbLIZ.append(", count: ");
        sbLIZ.append(c317760Ccw.LJ);
        sbLIZ.append(", source: ");
        sbLIZ.append(c317760Ccw.LIZLLL);
        sbLIZ.append(", filter-size: ");
        List<String> list = c317760Ccw.LJFF;
        Integer numValueOf = null;
        if (list != null) {
            numValueOf = Integer.valueOf(list.size());
        }
        sbLIZ.append(numValueOf);
        C2188811AlT.LIZIZ(sbLIZ);
        SearchSugApi.SugApi sugApiLIZ = SearchSugApi.LIZ();
        long j = c317760Ccw.LIZ;
        Long l = c317760Ccw.LIZIZ;
        String str = c317760Ccw.LIZJ;
        String str2 = c317760Ccw.LIZLLL;
        long j2 = c317760Ccw.LJ;
        List<String> list2 = c317760Ccw.LJFF;
        if (list2 != null && (!list2.isEmpty()) && (listLL = C13LP.LL(list2, 100)) != null) {
            strEncode = Uri.encode(new JSONArray((Collection) listLL).toString());
        } else {
            strEncode = "";
        }
        return sugApiLIZ.LIZJ(j, l, str, str2, j2, strEncode, c317760Ccw.LJI).execute().LIZIZ;
    }

    @Override // com.ss.android.ugc.aweme.search.service.ISearchUserService
    public final String LIZ(Context context, Integer num) {
        return C317770Ccx.LIZ(context, num);
    }

    @Override // com.ss.android.ugc.aweme.search.service.ISearchUserService
    public final String LIZIZ(Context context, String str) {
        return C317770Ccx.LIZIZ(context, str);
    }
}
