package com.ss.android.ugc.aweme.search.pages.result.common.copyrightmute.core.communicate;

import X.C04TD;
import X.C0PRC;
import X.C0PSI;
import X.C0Q3E;
import X.C0SUC;
import X.C2189821An6;
import X.C659060PtA;
import X.C659070PtB;
import android.view.View;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeBizExtKt;
import com.ss.android.ugc.aweme.search.copyrightmute.ISearchCopyrightMuteService;
import com.ss.android.ugc.aweme.search.source.neo.ISearchContextAbility;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class SearchCopyrightMuteServiceImpl implements ISearchCopyrightMuteService {
    public static ISearchCopyrightMuteService LJI() {
        Object objLIZ = C04TD.LIZ(ISearchCopyrightMuteService.class, false);
        if (objLIZ != null) {
            return (ISearchCopyrightMuteService) objLIZ;
        }
        if (C04TD.M3 == null) {
            synchronized (ISearchCopyrightMuteService.class) {
                if (C04TD.M3 == null) {
                    C04TD.M3 = new SearchCopyrightMuteServiceImpl();
                }
            }
        }
        return C04TD.M3;
    }

    @Override // com.ss.android.ugc.aweme.search.copyrightmute.ISearchCopyrightMuteService
    public final boolean LIZLLL(String str) {
        if (!Intrinsics.LJFF(str, "general_search") && !Intrinsics.LJFF(str, "search_result")) {
            return false;
        }
        return true;
    }

    public static Map LJFF(View view, Aweme aweme) {
        String aid;
        String searchResultId;
        HashMap<String, String> searchExtraParams;
        C2189821An6 c2189821An6LIZ = C0SUC.LIZ(view.getContext());
        ISearchContextAbility iSearchContextAbilityLJI = C0Q3E.LJI();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        C0PRC c0prc = (C0PRC) iSearchContextAbilityLJI.Ph1().LIZJ();
        linkedHashMap.put("search_id", c0prc.LLILLL);
        linkedHashMap.put("search_keyword", c0prc.LLIZLLLIL);
        linkedHashMap.put("enter_from", c0prc.LIZIZ());
        String strLIZ = C0PSI.LIZ(c0prc.LL);
        String str = "";
        if (strLIZ == null) {
            strLIZ = "";
        }
        linkedHashMap.put("search_type", strLIZ);
        linkedHashMap.put("is_fullscreen", "1");
        if (aweme == null || (aid = aweme.getAid()) == null) {
            aid = "";
        }
        linkedHashMap.put("group_id", aid);
        if ((aweme != null && (searchExtraParams = AwemeBizExtKt.getSearchExtraParams(aweme)) != null && (searchResultId = searchExtraParams.get("search_result_id")) != null) || (searchResultId = c2189821An6LIZ.getSearchResultId()) != null || (aweme != null && (searchResultId = aweme.getAid()) != null)) {
            str = searchResultId;
        }
        linkedHashMap.put("search_result_id", str);
        return linkedHashMap;
    }

    @Override // com.ss.android.ugc.aweme.search.copyrightmute.ISearchCopyrightMuteService
    public final void LIZ(TuxIconView tuxIconView, Aweme aweme) {
        C659060PtA c659060PtA = C659060PtA.LIZ;
        Map mapLJFF = LJFF(tuxIconView, aweme);
        c659060PtA.getClass();
        C659060PtA.LIZIZ("sounds_remove_show", aweme, null, mapLJFF);
    }

    @Override // com.ss.android.ugc.aweme.search.copyrightmute.ISearchCopyrightMuteService
    public final boolean LIZIZ(Aweme aweme, String str) {
        if ((Intrinsics.LJFF(str, "general_search") || Intrinsics.LJFF(str, "search_result")) && C659070PtB.LIZ(aweme)) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.search.copyrightmute.ISearchCopyrightMuteService
    public final boolean LIZJ(Aweme aweme, String str) {
        return LIZIZ(aweme, str);
    }

    @Override // com.ss.android.ugc.aweme.search.copyrightmute.ISearchCopyrightMuteService
    public final void LJ(View view, Aweme aweme) {
        C659060PtA.LIZ(C659060PtA.LIZ, view, aweme, null, LJFF(view, aweme), 4);
    }
}
