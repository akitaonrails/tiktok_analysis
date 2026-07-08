package com.ss.android.ugc.aweme.search.pages.result.common.searchvideo.core.protocols.bottomanchors;

import X.C03H5;
import X.C04VX;
import X.C0PT4;
import X.C10IT;
import X.C13IQ;
import X.C13LE;
import X.C19719912Dl;
import X.C301230BrN;
import X.C435830H7d;
import X.C436130H8h;
import X.C657990PrR;
import X.C659650Pu7;
import X.C660780Pvw;
import X.EnumC1430380nKG;
import X.EnumC436120H8g;
import X.EnumC660370PvH;
import X.EnumC660450PvP;
import android.view.View;
import com.bytedance.assem.arch.reused.ReusedUIContentAssem;
import com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.search.innerflowpage.SearchKeyFramePoint;
import com.ss.android.ugc.aweme.search.pages.result.common.searchvideo.core.assem.SearchIntentKeyFrameAssem;
import com.ss.android.ugc.aweme.search.pages.result.common.searchvideo.core.protocal.ISearchVideoBottomAnchorProtocol;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.KeyMoments;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.SearchAwemeInfo;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.SearchMixFeed;
import com.zhiliaoapp.musically.R;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes11.dex */
public final class ISearchIntentKeyFrameProtocol implements ISearchVideoBottomAnchorProtocol {
    public static final ISearchIntentKeyFrameProtocol LL = new ISearchIntentKeyFrameProtocol();
    public static final C19719912Dl LLILLJJLI = C13LE.LIZ(SearchIntentKeyFrameAssem.class);

    @Override // com.ss.android.ugc.aweme.search.pages.result.common.searchvideo.core.protocal.ISearchVideoBottomAnchorProtocol
    public final void Bk1(View view) {
    }

    @Override // com.ss.android.ugc.aweme.search.pages.result.common.searchvideo.core.protocal.ISearchVideoBottomAnchorProtocol
    public final void xg2(View view, Function0<Unit> function0) {
    }

    @Override // com.ss.android.ugc.aweme.search.pages.result.common.searchvideo.core.protocal.ISearchVideoAnchorPriorityProtocol
    public final List<Integer> yD2() {
        return Collections.singletonList(Integer.valueOf(R.id.uau));
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
        return C657990PrR.LIZIZ(view.findViewById(R.id.uax));
    }

    @Override // com.ss.android.ugc.aweme.search.pages.result.common.searchvideo.core.protocal.ISearchVideoAnchorPriorityProtocol
    public final EnumC660370PvH iY1(Aweme aweme) {
        return EnumC660370PvH.KEY_FRAME_INTENT;
    }

    @Override // com.ss.android.ugc.aweme.search.pages.result.common.searchvideo.core.protocal.ISearchVideoBottomAnchorProtocol
    public final Object qX1(Aweme aweme, SearchMixFeed searchMixFeed) {
        int iIntValue;
        KeyMoments keyMoments;
        SearchAwemeInfo searchAwemeInfo;
        SearchAwemeInfo searchAwemeInfo2;
        Integer num;
        C436130H8h c436130H8h = EnumC436120H8g.Companion;
        if (searchMixFeed != null && (searchAwemeInfo2 = searchMixFeed.searchAwemeInfo) != null && (num = searchAwemeInfo2.intentType) != null) {
            iIntValue = num.intValue();
        } else {
            iIntValue = 0;
        }
        c436130H8h.getClass();
        EnumC436120H8g enumC436120H8gLIZ = C436130H8h.LIZ(iIntValue);
        if (searchMixFeed != null && (searchAwemeInfo = searchMixFeed.searchAwemeInfo) != null) {
            keyMoments = searchAwemeInfo.keyMomentList;
        } else {
            keyMoments = null;
        }
        return new C435830H7d(enumC436120H8gLIZ, keyMoments);
    }

    @Override // com.ss.android.ugc.aweme.search.pages.result.common.searchvideo.core.protocal.ISearchVideoBottomAnchorProtocol
    public final Map<String, String> wV0(Aweme aweme, C660780Pvw c660780Pvw) {
        return C659650Pu7.LIZ();
    }

    @Override // com.ss.android.ugc.aweme.search.pages.result.common.searchvideo.core.protocal.ISearchVideoAnchorPriorityProtocol
    public final boolean od0(SearchMixFeed searchMixFeed, Aweme aweme, C0PT4 c0pt4) {
        SearchAwemeInfo searchAwemeInfo;
        KeyMoments keyMoments;
        List<SearchKeyFramePoint> list;
        SearchAwemeInfo searchAwemeInfo2;
        if (searchMixFeed == null || aweme == null || ((Number) C04VX.LIZ.getValue()).intValue() != 1) {
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
        C436130H8h c436130H8h = EnumC436120H8g.Companion;
        SearchAwemeInfo searchAwemeInfo3 = searchMixFeed.searchAwemeInfo;
        c436130H8h.getClass();
        if (!C436130H8h.LIZIZ(searchAwemeInfo3) || (searchAwemeInfo = searchMixFeed.searchAwemeInfo) == null || (keyMoments = searchAwemeInfo.keyMomentList) == null || (list = keyMoments.moments) == null || !(!list.isEmpty())) {
            return false;
        }
        if (C301230BrN.LIZ() && (searchAwemeInfo2 = searchMixFeed.searchAwemeInfo) != null) {
            Integer num = searchAwemeInfo2.intentType;
            int value = EnumC436120H8g.RENDERED_KEYFRAME.getValue();
            if (num != null && num.intValue() == value) {
                return false;
            }
        }
        return true;
    }
}
