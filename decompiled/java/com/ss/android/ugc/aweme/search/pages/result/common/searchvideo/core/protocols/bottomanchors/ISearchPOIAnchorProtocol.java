package com.ss.android.ugc.aweme.search.pages.result.common.searchvideo.core.protocols.bottomanchors;

import X.C03H5;
import X.C07EW;
import X.C0PT4;
import X.C13IQ;
import X.C13LE;
import X.C186700nh;
import X.C19719912Dl;
import X.C660190Puz;
import X.C660780Pvw;
import X.C660800Pvy;
import X.C660840Pw2;
import X.EnumC660370PvH;
import X.EnumC660450PvP;
import android.view.View;
import com.bytedance.assem.arch.reused.ReusedUIContentAssem;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.poi.PoiDataStruct;
import com.ss.android.ugc.aweme.search.pages.result.common.searchvideo.core.assem.SearchPOIAnchorAssem;
import com.ss.android.ugc.aweme.search.pages.result.common.searchvideo.core.protocal.ISearchVideoBottomAnchorProtocol;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.SearchMixFeed;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes11.dex */
public final class ISearchPOIAnchorProtocol implements ISearchVideoBottomAnchorProtocol {
    public static final ISearchPOIAnchorProtocol LL = new ISearchPOIAnchorProtocol();
    public static final C19719912Dl LLILLJJLI = C13LE.LIZ(SearchPOIAnchorAssem.class);

    @Override // com.ss.android.ugc.aweme.search.pages.result.common.searchvideo.core.protocal.ISearchVideoBottomAnchorProtocol
    public final Object qX1(Aweme aweme, SearchMixFeed searchMixFeed) {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.search.pages.result.common.searchvideo.core.protocal.ISearchVideoAnchorPriorityProtocol
    public final List<Integer> yD2() {
        ArrayList arrayList = new ArrayList();
        SearchPOIAnchorAssem.LLJLL.getClass();
        arrayList.add(Integer.valueOf(SearchPOIAnchorAssem.LLJLLL));
        if (C07EW.LIZ()) {
            arrayList.add(Integer.valueOf(R.id.u6u));
        }
        return arrayList;
    }

    @Override // com.ss.android.ugc.aweme.search.pages.result.common.searchvideo.core.protocal.ISearchVideoBottomAnchorProtocol
    public final EnumC660450PvP gz0() {
        return C07EW.LIZ() ? EnumC660450PvP.CUSTOM : EnumC660450PvP.DEFAULT;
    }

    @Override // com.ss.android.ugc.aweme.search.pages.result.common.searchvideo.core.protocal.ISearchVideoBottomAnchorProtocol
    public final C13IQ<? extends ReusedUIContentAssem<? extends C03H5>> gN2() {
        return LLILLJJLI;
    }

    @Override // com.ss.android.ugc.aweme.search.pages.result.common.searchvideo.core.protocal.ISearchVideoBottomAnchorProtocol
    public final void Bk1(View view) {
        SearchPOIAnchorAssem.LLJLL.getClass();
        C660840Pw2 c660840Pw2 = (C660840Pw2) view.findViewById(SearchPOIAnchorAssem.LLJLLL);
        if (c660840Pw2 != null) {
            c660840Pw2.setOnHeightChangeListener(null);
        }
    }

    @Override // com.ss.android.ugc.aweme.search.pages.result.common.searchvideo.core.protocal.ISearchVideoBottomAnchorProtocol
    public final int CB1(View view) {
        C660840Pw2 c660840Pw2;
        SearchPOIAnchorAssem.LLJLL.getClass();
        View viewFindViewById = view.findViewById(SearchPOIAnchorAssem.LLJLLL);
        if ((viewFindViewById instanceof C660840Pw2) && (c660840Pw2 = (C660840Pw2) viewFindViewById) != null) {
            return c660840Pw2.getMeasureWidthWhenPlay();
        }
        return 0;
    }

    @Override // com.ss.android.ugc.aweme.search.pages.result.common.searchvideo.core.protocal.ISearchVideoAnchorPriorityProtocol
    public final EnumC660370PvH iY1(Aweme aweme) {
        return EnumC660370PvH.POI;
    }

    @Override // com.ss.android.ugc.aweme.search.pages.result.common.searchvideo.core.protocal.ISearchVideoBottomAnchorProtocol
    public final Map<String, String> wV0(Aweme aweme, C660780Pvw c660780Pvw) {
        String str;
        String str2;
        C660800Pvy.LIZ.getClass();
        PoiDataStruct poiDataStructLIZ = C660800Pvy.LIZ(aweme);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("anchor_outreach_type", "1");
        if (poiDataStructLIZ == null || (str = poiDataStructLIZ.poiId) == null) {
            str = "";
        }
        linkedHashMap.put("poi_id", str);
        if (poiDataStructLIZ != null) {
            str2 = poiDataStructLIZ.collectInfo;
        } else {
            str2 = null;
        }
        C186700nh.LIZ(str2, linkedHashMap);
        return linkedHashMap;
    }

    @Override // com.ss.android.ugc.aweme.search.pages.result.common.searchvideo.core.protocal.ISearchVideoBottomAnchorProtocol
    public final void xg2(View view, Function0<Unit> function0) {
        if (!C07EW.LIZ()) {
            return;
        }
        SearchPOIAnchorAssem.LLJLL.getClass();
        C660840Pw2 c660840Pw2 = (C660840Pw2) view.findViewById(SearchPOIAnchorAssem.LLJLLL);
        if (c660840Pw2 != null) {
            c660840Pw2.setOnHeightChangeListener(function0);
        }
    }

    @Override // com.ss.android.ugc.aweme.search.pages.result.common.searchvideo.core.protocal.ISearchVideoAnchorPriorityProtocol
    public final boolean od0(SearchMixFeed searchMixFeed, Aweme aweme, C0PT4 c0pt4) {
        C660800Pvy.LIZ.getClass();
        PoiDataStruct poiDataStructLIZ = C660800Pvy.LIZ(aweme);
        if (C660190Puz.LIZ(aweme) && poiDataStructLIZ != null && C660190Puz.LIZ(aweme)) {
            return true;
        }
        return false;
    }
}
