package com.ss.android.ugc.aweme.search.pages.result.common.searchvideo.core.protocols.bottomanchors;

import X.C03H5;
import X.C04WN;
import X.C0PT4;
import X.C0PYD;
import X.C0Q3E;
import X.C13IQ;
import X.C13LE;
import X.C19719912Dl;
import X.C301230BrN;
import X.C657990PrR;
import X.C659650Pu7;
import X.C660240Pv4;
import X.C660350PvF;
import X.C660780Pvw;
import X.EnumC1430380nKG;
import X.EnumC436120H8g;
import X.EnumC660370PvH;
import X.EnumC660450PvP;
import android.view.View;
import com.bytedance.assem.arch.reused.ReusedUIContentAssem;
import com.ss.android.ugc.aweme.comment.model.Comment;
import com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.search.innerflowpage.SearchKeyFramePoint;
import com.ss.android.ugc.aweme.search.pages.result.common.searchvideo.core.assem.SearchVideoKeyFrameAssem;
import com.ss.android.ugc.aweme.search.pages.result.common.searchvideo.core.protocal.ISearchVideoBottomAnchorProtocol;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.SearchAwemeInfo;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.SearchMixFeed;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes11.dex */
public final class ISearchVideoKeyFrameProtocol implements ISearchVideoBottomAnchorProtocol {
    public static final ISearchVideoKeyFrameProtocol LL = new ISearchVideoKeyFrameProtocol();
    public static final C19719912Dl LLILLJJLI = C13LE.LIZ(SearchVideoKeyFrameAssem.class);

    @Override // com.ss.android.ugc.aweme.search.pages.result.common.searchvideo.core.protocal.ISearchVideoBottomAnchorProtocol
    public final void Bk1(View view) {
    }

    @Override // com.ss.android.ugc.aweme.search.pages.result.common.searchvideo.core.protocal.ISearchVideoBottomAnchorProtocol
    public final Object qX1(Aweme aweme, SearchMixFeed searchMixFeed) {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.search.pages.result.common.searchvideo.core.protocal.ISearchVideoBottomAnchorProtocol
    public final void xg2(View view, Function0<Unit> function0) {
    }

    @Override // com.ss.android.ugc.aweme.search.pages.result.common.searchvideo.core.protocal.ISearchVideoAnchorPriorityProtocol
    public final List<Integer> yD2() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(Integer.valueOf(R.id.ue5));
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
        return C657990PrR.LIZIZ(view.findViewById(R.id.ufh)) + C657990PrR.LIZIZ(view.findViewById(R.id.ufc));
    }

    @Override // com.ss.android.ugc.aweme.search.pages.result.common.searchvideo.core.protocal.ISearchVideoAnchorPriorityProtocol
    public final EnumC660370PvH iY1(Aweme aweme) {
        return EnumC660370PvH.KEY_FRAME;
    }

    @Override // com.ss.android.ugc.aweme.search.pages.result.common.searchvideo.core.protocal.ISearchVideoBottomAnchorProtocol
    public final Map<String, String> wV0(Aweme aweme, C660780Pvw c660780Pvw) {
        return C659650Pu7.LIZ();
    }

    @Override // com.ss.android.ugc.aweme.search.pages.result.common.searchvideo.core.protocal.ISearchVideoAnchorPriorityProtocol
    public final boolean od0(SearchMixFeed searchMixFeed, Aweme aweme, C0PT4 c0pt4) {
        Aweme awemeLIZIZ;
        SearchAwemeInfo searchAwemeInfo;
        if (searchMixFeed == null) {
            return false;
        }
        Comment commentLIZ = C660240Pv4.LIZ(searchMixFeed);
        C660350PvF.LIZ.getClass();
        if (C04WN.LIZ() && commentLIZ == null && (awemeLIZIZ = C660350PvF.LIZIZ(searchMixFeed)) != null && !C660350PvF.LIZLLL(awemeLIZIZ) && !C660350PvF.LIZJ(awemeLIZIZ, searchMixFeed)) {
            List<SearchKeyFramePoint> list = ((C0PYD) C0Q3E.LIZJ(awemeLIZIZ).Y30().LIZJ()).LLILZLL;
            List<AnchorCommonStruct> anchors = awemeLIZIZ.getAnchors();
            if (anchors != null && !anchors.isEmpty()) {
                for (AnchorCommonStruct anchorCommonStruct : anchors) {
                    if (anchorCommonStruct.getType() == EnumC1430380nKG.ANCHOR_SHOP_MIX.getTYPE() && anchorCommonStruct.getShowInSearchResult()) {
                        break;
                    }
                }
                if (list != null) {
                    return !C301230BrN.LIZ() ? true : true;
                }
            } else if (list != null && !list.isEmpty()) {
                if (!C301230BrN.LIZ() && (searchAwemeInfo = searchMixFeed.searchAwemeInfo) != null) {
                    Integer num = searchAwemeInfo.intentType;
                    int value = EnumC436120H8g.RENDERED_KEYFRAME.getValue();
                    if (num != null && num.intValue() == value) {
                        return false;
                    }
                    return true;
                }
            }
        }
        return false;
    }
}
