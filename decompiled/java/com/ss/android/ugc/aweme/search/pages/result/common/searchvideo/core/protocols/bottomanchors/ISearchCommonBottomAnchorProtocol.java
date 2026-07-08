package com.ss.android.ugc.aweme.search.pages.result.common.searchvideo.core.protocols.bottomanchors;

import X.C03H5;
import X.C0PT4;
import X.C13IQ;
import X.C13LE;
import X.C19719912Dl;
import X.C659650Pu7;
import X.C660380PvI;
import X.C660780Pvw;
import X.EnumC660370PvH;
import X.EnumC660390PvJ;
import X.EnumC660450PvP;
import X.InterfaceC660480PvS;
import android.view.View;
import com.bytedance.assem.arch.reused.ReusedUIContentAssem;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.search.pages.result.common.anchor.ui.SearchInsideCoverAnchorAssem;
import com.ss.android.ugc.aweme.search.pages.result.common.searchphoto.core.bottomanchors.protocol.ISearchPhotoBottomAnchorProtocol;
import com.ss.android.ugc.aweme.search.pages.result.common.searchvideo.core.protocal.ISearchVideoBottomAnchorProtocol;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.SearchMixFeed;
import com.zhiliaoapp.musically.R;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes11.dex */
public final class ISearchCommonBottomAnchorProtocol implements ISearchVideoBottomAnchorProtocol, ISearchPhotoBottomAnchorProtocol {
    public static final ISearchCommonBottomAnchorProtocol LL = new ISearchCommonBottomAnchorProtocol();
    public static final C19719912Dl LLILLJJLI = C13LE.LIZ(SearchInsideCoverAnchorAssem.class);

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
        return Collections.singletonList(Integer.valueOf(R.id.uat));
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
        return view.getWidth();
    }

    @Override // com.ss.android.ugc.aweme.search.pages.result.common.searchphoto.core.bottomanchors.protocol.ISearchPhotoBottomAnchorProtocol
    public final EnumC660390PvJ cZ0(Aweme aweme) {
        return EnumC660390PvJ.PHOTO_POI_COMPONENT_TYPE;
    }

    @Override // com.ss.android.ugc.aweme.search.pages.result.common.searchphoto.core.bottomanchors.protocol.ISearchPhotoBottomAnchorProtocol
    public final int cw2(View view) {
        return view.getWidth();
    }

    @Override // com.ss.android.ugc.aweme.search.pages.result.common.searchvideo.core.protocal.ISearchVideoAnchorPriorityProtocol
    public final EnumC660370PvH iY1(Aweme aweme) {
        C660380PvI.LIZ.getClass();
        if (C660380PvI.LIZJ(aweme)) {
            return EnumC660370PvH.POI;
        }
        return EnumC660370PvH.NO_PRIORITY;
    }

    @Override // com.ss.android.ugc.aweme.search.pages.result.common.searchvideo.core.protocal.ISearchVideoBottomAnchorProtocol
    public final Map<String, String> wV0(Aweme aweme, C660780Pvw c660780Pvw) {
        InterfaceC660480PvS interfaceC660480PvS;
        Map<String, String> mapLIZIZ;
        if (c660780Pvw == null || (interfaceC660480PvS = c660780Pvw.LIZIZ) == null || (mapLIZIZ = interfaceC660480PvS.LIZIZ(aweme)) == null) {
            return C659650Pu7.LIZ();
        }
        return mapLIZIZ;
    }

    @Override // com.ss.android.ugc.aweme.search.pages.result.common.searchvideo.core.protocal.ISearchVideoAnchorPriorityProtocol
    public final boolean od0(SearchMixFeed searchMixFeed, Aweme aweme, C0PT4 c0pt4) {
        C660380PvI.LIZ.getClass();
        return C660380PvI.LIZJ(aweme);
    }
}
