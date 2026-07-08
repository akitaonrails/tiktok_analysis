package com.ss.android.ugc.aweme.search.pages.result.common.searchvideo.core.videwmodel;

import X.C448240Hhu;
import X.C659520Ptu;
import X.C659750PuH;
import X.C661190Pwb;
import X.C661330Pwp;
import X.InterfaceC0148002o;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.comment.model.Comment;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.SearchInfo;
import com.ss.android.ugc.aweme.feed.model.SearchOutreachDataStruct;
import com.ss.android.ugc.aweme.search.source.neo.ISearchContextAbility;
import kotlin.jvm.internal.AFwS241S0000000_10;
import kotlin.jvm.internal.AwS25S0001000_10;
import kotlin.jvm.internal.AwS25S0010000_10;
import kotlin.jvm.internal.AwS376S0200000_10;

/* JADX INFO: loaded from: classes11.dex */
public class SearchPhotoCommentAnchorViewModel extends AssemViewModel<C661190Pwb> {
    public int LL = 1;

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C661190Pwb(0);
    }

    public final void wQ2(C659520Ptu c659520Ptu) {
        SearchOutreachDataStruct searchOutreachDataStruct;
        SearchInfo searchInfo = c659520Ptu.LL.getSearchInfo();
        if (searchInfo != null && (searchOutreachDataStruct = searchInfo.searchOutreachDataStruct) != null && searchOutreachDataStruct.type == 1) {
            setState(new AwS376S0200000_10(searchOutreachDataStruct, c659520Ptu, 45));
        }
    }

    public final void xQ2(C659750PuH c659750PuH) {
        SearchOutreachDataStruct searchOutreachDataStruct;
        SearchInfo searchInfo = c659750PuH.LL.getSearchInfo();
        if (searchInfo != null && (searchOutreachDataStruct = searchInfo.searchOutreachDataStruct) != null && searchOutreachDataStruct.type == 1) {
            setState(new AwS376S0200000_10(searchOutreachDataStruct, c659750PuH, 46));
        }
    }

    public final void yQ2(int i) {
        this.LL = i;
        setState(new AwS25S0001000_10(i, 2));
    }

    public final void zQ2(boolean z) {
        setState(new AwS25S0010000_10(z, 4));
    }

    public final void vQ2(String str, ISearchContextAbility iSearchContextAbility) {
        Aweme aweme;
        long jCurrentTimeMillis = System.currentTimeMillis();
        C661190Pwb state = getState();
        long j = state.LLJ;
        setState(AFwS241S0000000_10.get$arr$(257));
        if (j >= 0 && (aweme = state.LLILZ) != null) {
            Comment comment = state.LL;
            if (comment != null) {
                C448240Hhu c448240Hhu = new C448240Hhu(comment, aweme);
                C661330Pwp.LIZ(c448240Hhu, state.LLILZ, str, iSearchContextAbility);
                c448240Hhu.LJIJI("duration", String.valueOf(jCurrentTimeMillis - j));
                c448240Hhu.LJIJI("enter_method", "click_comment_external_exposure");
                String cid = comment.getCid();
                if (cid == null) {
                    cid = "";
                }
                c448240Hhu.LJIJI("search_comment_id", cid);
                c448240Hhu.LJIILJJIL();
            }
            setState(AFwS241S0000000_10.get$arr$(258));
        }
    }
}
