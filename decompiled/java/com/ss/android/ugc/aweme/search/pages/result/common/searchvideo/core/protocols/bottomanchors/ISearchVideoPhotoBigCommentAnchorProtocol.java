package com.ss.android.ugc.aweme.search.pages.result.common.searchvideo.core.protocols.bottomanchors;

import X.C03H5;
import X.C0PT4;
import X.C13IQ;
import X.C13LE;
import X.C19719912Dl;
import X.C657990PrR;
import X.C660430PvN;
import X.C660780Pvw;
import X.EnumC660370PvH;
import X.EnumC660390PvJ;
import X.EnumC660440PvO;
import X.EnumC660450PvP;
import android.view.View;
import com.bytedance.assem.arch.reused.ReusedUIContentAssem;
import com.ss.android.ugc.aweme.comment.model.Comment;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.SearchInfo;
import com.ss.android.ugc.aweme.feed.model.SearchOutreachDataStruct;
import com.ss.android.ugc.aweme.search.pages.result.common.searchcomment.ui.SearchBigCommentAnchorAssem;
import com.ss.android.ugc.aweme.search.pages.result.common.searchphoto.core.bottomanchors.protocol.ISearchPhotoBottomAnchorProtocol;
import com.ss.android.ugc.aweme.search.pages.result.common.searchvideo.core.protocal.ISearchVideoBottomAnchorProtocol;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.SearchMixFeed;
import com.zhiliaoapp.musically.R;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes11.dex */
public final class ISearchVideoPhotoBigCommentAnchorProtocol implements ISearchVideoBottomAnchorProtocol, ISearchPhotoBottomAnchorProtocol {
    public static final ISearchVideoPhotoBigCommentAnchorProtocol LL = new ISearchVideoPhotoBigCommentAnchorProtocol();
    public static final C19719912Dl LLILLJJLI = C13LE.LIZ(SearchBigCommentAnchorAssem.class);

    @Override // com.ss.android.ugc.aweme.search.pages.result.common.searchvideo.core.protocal.ISearchVideoBottomAnchorProtocol
    public final void Bk1(View view) {
    }

    @Override // com.ss.android.ugc.aweme.search.pages.result.common.searchvideo.core.protocal.ISearchVideoBottomAnchorProtocol
    public final Integer qe2(View view) {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.search.pages.result.common.searchvideo.core.protocal.ISearchVideoBottomAnchorProtocol
    public final void xg2(View view, Function0<Unit> function0) {
    }

    @Override // com.ss.android.ugc.aweme.search.pages.result.common.searchvideo.core.protocal.ISearchVideoAnchorPriorityProtocol
    public final List<Integer> yD2() {
        return Collections.singletonList(Integer.valueOf(R.id.u7g));
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
        return C657990PrR.LIZIZ(view.findViewById(R.id.u7g));
    }

    @Override // com.ss.android.ugc.aweme.search.pages.result.common.searchphoto.core.bottomanchors.protocol.ISearchPhotoBottomAnchorProtocol
    public final EnumC660390PvJ cZ0(Aweme aweme) {
        return EnumC660390PvJ.BIG_COMMENT;
    }

    @Override // com.ss.android.ugc.aweme.search.pages.result.common.searchphoto.core.bottomanchors.protocol.ISearchPhotoBottomAnchorProtocol
    public final int cw2(View view) {
        return C657990PrR.LIZIZ(view.findViewById(R.id.u7g));
    }

    @Override // com.ss.android.ugc.aweme.search.pages.result.common.searchvideo.core.protocal.ISearchVideoAnchorPriorityProtocol
    public final EnumC660370PvH iY1(Aweme aweme) {
        return EnumC660370PvH.BIG_COMMENT;
    }

    @Override // com.ss.android.ugc.aweme.search.pages.result.common.searchvideo.core.protocal.ISearchVideoBottomAnchorProtocol
    public final Object qX1(Aweme aweme, SearchMixFeed searchMixFeed) {
        EnumC660440PvO enumC660440PvO;
        SearchInfo searchInfo;
        SearchOutreachDataStruct searchOutreachDataStruct;
        if (aweme != null && (searchInfo = aweme.getSearchInfo()) != null && (searchOutreachDataStruct = searchInfo.searchOutreachDataStruct) != null && searchOutreachDataStruct.uiStyle == 4) {
            enumC660440PvO = EnumC660440PvO.AUTO;
        } else {
            enumC660440PvO = EnumC660440PvO.CONST_DARK;
        }
        return new C660430PvN(enumC660440PvO);
    }

    @Override // com.ss.android.ugc.aweme.search.pages.result.common.searchvideo.core.protocal.ISearchVideoBottomAnchorProtocol
    public final Map<String, String> wV0(Aweme aweme, C660780Pvw c660780Pvw) {
        SearchInfo searchInfo;
        SearchOutreachDataStruct searchOutreachDataStruct;
        Comment comment;
        String cid;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("comment_card_type", "comment_external_exposure");
        if (aweme != null && (searchInfo = aweme.getSearchInfo()) != null && (searchOutreachDataStruct = searchInfo.searchOutreachDataStruct) != null && (comment = searchOutreachDataStruct.comment) != null && (cid = comment.getCid()) != null) {
            linkedHashMap.put("search_comment_id", cid);
            linkedHashMap.put("list_item_id", cid);
            linkedHashMap.put("token_type", "comment_external_exposure");
        }
        return linkedHashMap;
    }

    @Override // com.ss.android.ugc.aweme.search.pages.result.common.searchvideo.core.protocal.ISearchVideoAnchorPriorityProtocol
    public final boolean od0(SearchMixFeed searchMixFeed, Aweme aweme, C0PT4 c0pt4) {
        SearchInfo searchInfo;
        SearchOutreachDataStruct searchOutreachDataStruct;
        if (searchMixFeed == null || aweme == null || (searchInfo = aweme.getSearchInfo()) == null || (searchOutreachDataStruct = searchInfo.searchOutreachDataStruct) == null || searchOutreachDataStruct.comment == null || searchOutreachDataStruct.type != 1) {
            return false;
        }
        int i = searchOutreachDataStruct.uiStyle;
        if (i != 4 && i != 5) {
            return false;
        }
        return true;
    }
}
