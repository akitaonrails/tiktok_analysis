package com.ss.android.ugc.aweme.search.pages.result.common.searchvideo.core.protocols.bottomanchors;

import X.C03H5;
import X.C0PT4;
import X.C13IQ;
import X.C2188811AlT;
import X.C657990PrR;
import X.C659560Pty;
import X.C659600Pu2;
import X.C659620Pu4;
import X.C659650Pu7;
import X.C660780Pvw;
import X.EnumC660370PvH;
import X.EnumC660450PvP;
import android.view.View;
import com.bytedance.assem.arch.reused.ReusedUIContentAssem;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.EnhancedProduct;
import com.ss.android.ugc.aweme.search.pages.result.common.searchvideo.core.protocal.ISearchVideoBottomAnchorProtocol;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.SearchMixFeed;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes11.dex */
public final class ISearchEcWeakAnchorProtocol implements ISearchVideoBottomAnchorProtocol {
    public static final ISearchEcWeakAnchorProtocol LL = new ISearchEcWeakAnchorProtocol();

    @Override // com.ss.android.ugc.aweme.search.pages.result.common.searchvideo.core.protocal.ISearchVideoBottomAnchorProtocol
    public final void Bk1(View view) {
    }

    @Override // com.ss.android.ugc.aweme.search.pages.result.common.searchvideo.core.protocal.ISearchVideoBottomAnchorProtocol
    public final C13IQ<? extends ReusedUIContentAssem<? extends C03H5>> gN2() {
        return null;
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
        arrayList.add(Integer.valueOf(R.id.video_holder_anchor_view));
        return arrayList;
    }

    @Override // com.ss.android.ugc.aweme.search.pages.result.common.searchvideo.core.protocal.ISearchVideoBottomAnchorProtocol
    public final EnumC660450PvP gz0() {
        return EnumC660450PvP.DEFAULT;
    }

    @Override // com.ss.android.ugc.aweme.search.pages.result.common.searchvideo.core.protocal.ISearchVideoBottomAnchorProtocol
    public final int CB1(View view) {
        View viewFindViewById = view.findViewById(R.id.video_holder_anchor_view);
        if (viewFindViewById != null) {
            return C657990PrR.LIZIZ(viewFindViewById);
        }
        return 0;
    }

    @Override // com.ss.android.ugc.aweme.search.pages.result.common.searchvideo.core.protocal.ISearchVideoAnchorPriorityProtocol
    public final EnumC660370PvH iY1(Aweme aweme) {
        return EnumC660370PvH.ECOMMERCE_WEAK;
    }

    @Override // com.ss.android.ugc.aweme.search.pages.result.common.searchvideo.core.protocal.ISearchVideoBottomAnchorProtocol
    public final Map<String, String> wV0(Aweme aweme, C660780Pvw c660780Pvw) {
        return C659650Pu7.LIZ();
    }

    @Override // com.ss.android.ugc.aweme.search.pages.result.common.searchvideo.core.protocal.ISearchVideoAnchorPriorityProtocol
    public final boolean od0(SearchMixFeed searchMixFeed, Aweme aweme, C0PT4 c0pt4) {
        EnhancedProduct.Style styleLIZJ;
        boolean z;
        C659560Pty c659560Pty;
        if (c0pt4 == null || (c659560Pty = c0pt4.LIZ) == null || (styleLIZJ = c659560Pty.LJFF) == null) {
            if (aweme != null) {
                C659620Pu4.LLJILJILJ.getClass();
                styleLIZJ = C659600Pu2.LIZJ(aweme, null, null, null, null, "");
            } else {
                styleLIZJ = null;
            }
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ISearchEcWeakAnchorProtocol");
        sbLIZ.append(" isMatch ");
        EnhancedProduct.Style style = EnhancedProduct.Style.STYLE_WEAK;
        if (styleLIZJ == style) {
            z = true;
        } else {
            z = false;
        }
        sbLIZ.append(z);
        C2188811AlT.LIZIZ(sbLIZ);
        if (styleLIZJ == style || styleLIZJ == EnhancedProduct.Style.STYLE_ANCHOR_PROMOTION_TITLE_WITH_PLAY_ANIMATION || styleLIZJ == EnhancedProduct.Style.STYLE_ANCHOR_SMALL_PRODUCT) {
            return true;
        }
        return false;
    }
}
