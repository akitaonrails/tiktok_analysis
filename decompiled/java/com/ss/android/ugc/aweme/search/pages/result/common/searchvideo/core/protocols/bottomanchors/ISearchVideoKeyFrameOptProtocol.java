package com.ss.android.ugc.aweme.search.pages.result.common.searchvideo.core.protocols.bottomanchors;

import X.C01GW;
import X.C03H5;
import X.C0PT4;
import X.C10IT;
import X.C13IQ;
import X.C13LE;
import X.C13LP;
import X.C452501pT;
import X.C657990PrR;
import X.C659650Pu7;
import X.C660780Pvw;
import X.EnumC1430380nKG;
import X.EnumC660370PvH;
import X.EnumC660450PvP;
import android.view.View;
import com.bytedance.assem.arch.reused.ReusedUIContentAssem;
import com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.BigThumb;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.search.innerflowpage.SearchKeyFramePoint;
import com.ss.android.ugc.aweme.search.pages.result.common.searchvideo.core.protocal.ISearchVideoBottomAnchorProtocol;
import com.ss.android.ugc.aweme.search.pages.result.common.searchvideo.core.protocols.bottomanchors.keyframe.SearchKeyframeOptContainerAssem;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.KeyMoments;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.SearchAwemeInfo;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.SearchMixFeed;
import com.zhiliaoapp.musically.R;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS196S0000000_10;

/* JADX INFO: loaded from: classes11.dex */
public final class ISearchVideoKeyFrameOptProtocol implements ISearchVideoBottomAnchorProtocol {
    public static final ISearchVideoKeyFrameOptProtocol LL = new ISearchVideoKeyFrameOptProtocol();
    public static final C01GW LLILLJJLI = C452501pT.LIZIZ(AFwS196S0000000_10.get$arr$(289));

    @Override // com.ss.android.ugc.aweme.search.pages.result.common.searchvideo.core.protocal.ISearchVideoBottomAnchorProtocol
    public final void Bk1(View view) {
    }

    @Override // com.ss.android.ugc.aweme.search.pages.result.common.searchvideo.core.protocal.ISearchVideoBottomAnchorProtocol
    public final C13IQ<? extends ReusedUIContentAssem<? extends C03H5>> gN2() {
        return C13LE.LIZ(SearchKeyframeOptContainerAssem.class);
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
        return Collections.singletonList(Integer.valueOf(R.id.i_8));
    }

    @Override // com.ss.android.ugc.aweme.search.pages.result.common.searchvideo.core.protocal.ISearchVideoBottomAnchorProtocol
    public final EnumC660450PvP gz0() {
        return EnumC660450PvP.DEFAULT;
    }

    @Override // com.ss.android.ugc.aweme.search.pages.result.common.searchvideo.core.protocal.ISearchVideoBottomAnchorProtocol
    public final int CB1(View view) {
        View viewFindViewById = view.findViewById(R.id.i_8);
        if (viewFindViewById != null) {
            return C657990PrR.LIZIZ(viewFindViewById);
        }
        return 0;
    }

    @Override // com.ss.android.ugc.aweme.search.pages.result.common.searchvideo.core.protocal.ISearchVideoAnchorPriorityProtocol
    public final EnumC660370PvH iY1(Aweme aweme) {
        return EnumC660370PvH.KEY_FRAME_OPT;
    }

    @Override // com.ss.android.ugc.aweme.search.pages.result.common.searchvideo.core.protocal.ISearchVideoBottomAnchorProtocol
    public final Map<String, String> wV0(Aweme aweme, C660780Pvw c660780Pvw) {
        return C659650Pu7.LIZ();
    }

    @Override // com.ss.android.ugc.aweme.search.pages.result.common.searchvideo.core.protocal.ISearchVideoAnchorPriorityProtocol
    public final boolean od0(SearchMixFeed searchMixFeed, Aweme aweme, C0PT4 c0pt4) {
        KeyMoments keyMoments;
        List<SearchKeyFramePoint> list;
        SearchAwemeInfo searchAwemeInfo;
        KeyMoments keyMoments2;
        List<SearchKeyFramePoint> list2;
        Video video;
        List<BigThumb> bigThumbs;
        BigThumb bigThumb;
        if (searchMixFeed == null || aweme == null || LLILLJJLI.getValue() == null) {
            return false;
        }
        C10IT.LIZ.getClass();
        if (C10IT.LJIIL(aweme) || aweme.isAd()) {
            return false;
        }
        List<AnchorCommonStruct> anchors = aweme.getAnchors();
        if (anchors != null && !anchors.isEmpty()) {
            for (AnchorCommonStruct anchorCommonStruct : anchors) {
                if (anchorCommonStruct.getType() == EnumC1430380nKG.ANCHOR_SHOP_MIX.getTYPE() && anchorCommonStruct.getShowInSearchResult()) {
                    return false;
                }
            }
        }
        SearchAwemeInfo searchAwemeInfo2 = searchMixFeed.searchAwemeInfo;
        if (searchAwemeInfo2 == null || (keyMoments = searchAwemeInfo2.keyMomentList) == null || (list = keyMoments.moments) == null || list.size() < 2 || (searchAwemeInfo = searchMixFeed.searchAwemeInfo) == null || (keyMoments2 = searchAwemeInfo.keyMomentList) == null || (list2 = keyMoments2.moments) == null || list2.size() < 2 || (video = aweme.getVideo()) == null || (bigThumbs = video.getBigThumbs()) == null || (bigThumb = (BigThumb) C13LP.LJJJLL(bigThumbs)) == null || !(!bigThumb.imgUrls.isEmpty())) {
            return false;
        }
        return true;
    }
}
