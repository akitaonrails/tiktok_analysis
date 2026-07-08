package com.ss.android.ugc.aweme.search.pages.result.common.searchvideo.core.protocols.bottomanchors;

import X.C03H5;
import X.C0PT4;
import X.C13IQ;
import X.C13LE;
import X.C19719912Dl;
import X.C418440Gaw;
import X.C657990PrR;
import X.C659650Pu7;
import X.C660240Pv4;
import X.C660780Pvw;
import X.C786410Ut5;
import X.C814420VxA;
import X.EnumC660370PvH;
import X.EnumC660450PvP;
import android.view.View;
import com.bytedance.assem.arch.reused.ReusedUIContentAssem;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.search.pages.result.common.searchvideo.core.assem.SearchVideoCommentAssem;
import com.ss.android.ugc.aweme.search.pages.result.common.searchvideo.core.protocal.ISearchVideoBottomAnchorProtocol;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.SearchMixFeed;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes11.dex */
public final class ISearchVideoCommentProtocol implements ISearchVideoBottomAnchorProtocol {
    public static final ISearchVideoCommentProtocol LL = new ISearchVideoCommentProtocol();
    public static final C19719912Dl LLILLJJLI = C13LE.LIZ(SearchVideoCommentAssem.class);

    @Override // com.ss.android.ugc.aweme.search.pages.result.common.searchvideo.core.protocal.ISearchVideoBottomAnchorProtocol
    public final void Bk1(View view) {
    }

    @Override // com.ss.android.ugc.aweme.search.pages.result.common.searchvideo.core.protocal.ISearchVideoBottomAnchorProtocol
    public final void xg2(View view, Function0<Unit> function0) {
    }

    @Override // com.ss.android.ugc.aweme.search.pages.result.common.searchvideo.core.protocal.ISearchVideoAnchorPriorityProtocol
    public final List<Integer> yD2() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(Integer.valueOf(R.id.i4i));
        return arrayList;
    }

    @Override // com.ss.android.ugc.aweme.search.pages.result.common.searchvideo.core.protocal.ISearchVideoBottomAnchorProtocol
    public final C13IQ<? extends ReusedUIContentAssem<? extends C03H5>> gN2() {
        return LLILLJJLI;
    }

    @Override // com.ss.android.ugc.aweme.search.pages.result.common.searchvideo.core.protocal.ISearchVideoBottomAnchorProtocol
    public final EnumC660450PvP gz0() {
        return EnumC660450PvP.DEFAULT;
    }

    @Override // com.ss.android.ugc.aweme.search.pages.result.common.searchvideo.core.protocal.ISearchVideoBottomAnchorProtocol
    public final int CB1(View view) {
        int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(10));
        View viewFindViewById = view.findViewById(R.id.nbu);
        int visibility = viewFindViewById.getVisibility();
        C786410Ut5.LJLLLLLL(0, viewFindViewById);
        viewFindViewById.measure(View.MeasureSpec.makeMeasureSpec(view.getMeasuredWidth(), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(0, 0));
        View viewFindViewById2 = view.findViewById(R.id.lco);
        View viewFindViewById3 = view.findViewById(R.id.zep);
        C786410Ut5.LJLLLLLL(visibility, viewFindViewById);
        return C657990PrR.LIZIZ(viewFindViewById2) + C657990PrR.LIZIZ(viewFindViewById3) + iLIZIZ;
    }

    @Override // com.ss.android.ugc.aweme.search.pages.result.common.searchvideo.core.protocal.ISearchVideoAnchorPriorityProtocol
    public final EnumC660370PvH iY1(Aweme aweme) {
        return EnumC660370PvH.COMMENT;
    }

    @Override // com.ss.android.ugc.aweme.search.pages.result.common.searchvideo.core.protocal.ISearchVideoBottomAnchorProtocol
    public final Object qX1(Aweme aweme, SearchMixFeed searchMixFeed) {
        if (searchMixFeed != null) {
            return C660240Pv4.LIZ(searchMixFeed);
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.search.pages.result.common.searchvideo.core.protocal.ISearchVideoBottomAnchorProtocol
    public final Map<String, String> wV0(Aweme aweme, C660780Pvw c660780Pvw) {
        return C659650Pu7.LIZ();
    }

    @Override // com.ss.android.ugc.aweme.search.pages.result.common.searchvideo.core.protocal.ISearchVideoAnchorPriorityProtocol
    public final boolean od0(SearchMixFeed searchMixFeed, Aweme aweme, C0PT4 c0pt4) {
        if (searchMixFeed == null || C660240Pv4.LIZ(searchMixFeed) == null) {
            return false;
        }
        return true;
    }
}
