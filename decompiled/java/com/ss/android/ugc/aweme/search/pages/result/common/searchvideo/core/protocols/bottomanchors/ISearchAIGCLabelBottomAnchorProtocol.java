package com.ss.android.ugc.aweme.search.pages.result.common.searchvideo.core.protocols.bottomanchors;

import X.C03H5;
import X.C07GJ;
import X.C0PT4;
import X.C0SD5;
import X.C13IQ;
import X.C13LE;
import X.C19719912Dl;
import X.C2188811AlT;
import X.C294600Bgg;
import X.C660780Pvw;
import X.EnumC645300PSu;
import X.EnumC660370PvH;
import X.EnumC660390PvJ;
import X.EnumC660450PvP;
import android.view.View;
import com.bytedance.assem.arch.reused.ReusedUIContentAssem;
import com.ss.android.ugc.aweme.commerce.AwemeCommerceStruct;
import com.ss.android.ugc.aweme.feed.model.Aweme;
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
public final class ISearchAIGCLabelBottomAnchorProtocol implements ISearchVideoBottomAnchorProtocol, ISearchPhotoBottomAnchorProtocol {
    public static final ISearchAIGCLabelBottomAnchorProtocol LL = new ISearchAIGCLabelBottomAnchorProtocol();
    public static final C19719912Dl LLILLJJLI = C13LE.LIZ(SearchAIGCLabelAssem.class);

    @Override // com.ss.android.ugc.aweme.search.pages.result.common.searchvideo.core.protocal.ISearchVideoBottomAnchorProtocol
    public final void Bk1(View view) {
    }

    @Override // com.ss.android.ugc.aweme.search.pages.result.common.searchvideo.core.protocal.ISearchVideoBottomAnchorProtocol
    public final Object qX1(Aweme aweme, SearchMixFeed searchMixFeed) {
        return null;
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
        return Collections.singletonList(Integer.valueOf(R.id.u6p));
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
        View viewFindViewById = view.findViewById(R.id.u6p);
        if (viewFindViewById != null) {
            return viewFindViewById.getMeasuredWidth();
        }
        return 0;
    }

    @Override // com.ss.android.ugc.aweme.search.pages.result.common.searchphoto.core.bottomanchors.protocol.ISearchPhotoBottomAnchorProtocol
    public final EnumC660390PvJ cZ0(Aweme aweme) {
        return EnumC660390PvJ.AIGC_LABEL;
    }

    @Override // com.ss.android.ugc.aweme.search.pages.result.common.searchphoto.core.bottomanchors.protocol.ISearchPhotoBottomAnchorProtocol
    public final int cw2(View view) {
        View viewFindViewById = view.findViewById(R.id.u6p);
        if (viewFindViewById != null) {
            return viewFindViewById.getMeasuredWidth();
        }
        return 0;
    }

    @Override // com.ss.android.ugc.aweme.search.pages.result.common.searchvideo.core.protocal.ISearchVideoAnchorPriorityProtocol
    public final EnumC660370PvH iY1(Aweme aweme) {
        return EnumC660370PvH.AIGC_LABEL;
    }

    @Override // com.ss.android.ugc.aweme.search.pages.result.common.searchvideo.core.protocal.ISearchVideoBottomAnchorProtocol
    public final Map<String, String> wV0(Aweme aweme, C660780Pvw c660780Pvw) {
        return new LinkedHashMap();
    }

    @Override // com.ss.android.ugc.aweme.search.pages.result.common.searchvideo.core.protocal.ISearchVideoAnchorPriorityProtocol
    public final boolean od0(SearchMixFeed searchMixFeed, Aweme aweme, C0PT4 c0pt4) {
        boolean z;
        EnumC645300PSu enumC645300PSu;
        String ecSearchBoBcLabelText;
        AwemeCommerceStruct commerceVideoAuthInfo;
        EnumC645300PSu enumC645300PSu2;
        boolean zLIZIZ = false;
        if (C07GJ.LIZ() != 0) {
            z = true;
        } else {
            z = false;
        }
        String aid = null;
        if (!z) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("skip match: experiment disables label, aid=");
            if (aweme != null) {
                aid = aweme.getAid();
            }
            sbLIZ.append(aid);
            C2188811AlT.LIZIZ(sbLIZ);
            return false;
        }
        if (c0pt4 != null) {
            enumC645300PSu = c0pt4.LIZIZ;
        } else {
            enumC645300PSu = null;
        }
        if (enumC645300PSu != EnumC645300PSu.TOP_TAB) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("skip match: tabScene=");
            if (c0pt4 != null) {
                enumC645300PSu2 = c0pt4.LIZIZ;
            } else {
                enumC645300PSu2 = null;
            }
            sbLIZ2.append(enumC645300PSu2);
            sbLIZ2.append(", aid=");
            if (aweme != null) {
                aid = aweme.getAid();
            }
            sbLIZ2.append(aid);
            C2188811AlT.LIZIZ(sbLIZ2);
            return false;
        }
        if (aweme != null && (commerceVideoAuthInfo = aweme.getCommerceVideoAuthInfo()) != null) {
            ecSearchBoBcLabelText = commerceVideoAuthInfo.getEcSearchBoBcLabelText();
        } else {
            ecSearchBoBcLabelText = null;
        }
        if (C294600Bgg.LIZ(ecSearchBoBcLabelText)) {
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("skip match: bobc label is shown, aid=");
            if (aweme != null) {
                aid = aweme.getAid();
            }
            sbLIZ3.append(aid);
            C2188811AlT.LIZIZ(sbLIZ3);
            return false;
        }
        if (aweme != null) {
            zLIZIZ = C0SD5.LIZIZ(aweme);
        }
        StringBuilder sbLIZ4 = C2188811AlT.LIZ();
        sbLIZ4.append("match result: aid=");
        if (aweme != null) {
            aid = aweme.getAid();
        }
        sbLIZ4.append(aid);
        sbLIZ4.append(", shouldShow=");
        sbLIZ4.append(zLIZIZ);
        C2188811AlT.LIZIZ(sbLIZ4);
        return zLIZIZ;
    }
}
