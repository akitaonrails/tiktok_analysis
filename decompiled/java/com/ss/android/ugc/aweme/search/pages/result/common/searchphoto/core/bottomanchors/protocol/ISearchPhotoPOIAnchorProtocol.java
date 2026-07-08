package com.ss.android.ugc.aweme.search.pages.result.common.searchphoto.core.bottomanchors.protocol;

import X.C03H5;
import X.C07EW;
import X.C0PT4;
import X.C13IQ;
import X.C13LE;
import X.C418440Gaw;
import X.C660380PvI;
import X.C660780Pvw;
import X.C660800Pvy;
import X.C660840Pw2;
import X.C814420VxA;
import X.EnumC660370PvH;
import X.EnumC660390PvJ;
import X.EnumC660450PvP;
import android.view.View;
import com.bytedance.assem.arch.reused.ReusedUIContentAssem;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.search.pages.result.common.searchphoto.core.bottomanchors.assem.SearchPhotoPOIAnchorAssem;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.SearchMixFeed;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes11.dex */
public final class ISearchPhotoPOIAnchorProtocol implements ISearchPhotoBottomAnchorProtocol {
    public static final ISearchPhotoPOIAnchorProtocol LL = new ISearchPhotoPOIAnchorProtocol();

    @Override // com.ss.android.ugc.aweme.search.pages.result.common.searchvideo.core.protocal.ISearchVideoBottomAnchorProtocol
    public final C13IQ<? extends ReusedUIContentAssem<? extends C03H5>> gN2() {
        return C13LE.LIZ(SearchPhotoPOIAnchorAssem.class);
    }

    @Override // com.ss.android.ugc.aweme.search.pages.result.common.searchvideo.core.protocal.ISearchVideoAnchorPriorityProtocol
    public final List<Integer> yD2() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(Integer.valueOf(R.id.u6w));
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
    public final void Bk1(View view) {
        C660840Pw2 c660840Pw2 = (C660840Pw2) view.findViewById(R.id.u6w);
        if (c660840Pw2 != null) {
            c660840Pw2.setOnHeightChangeListener(null);
        }
    }

    @Override // com.ss.android.ugc.aweme.search.pages.result.common.searchvideo.core.protocal.ISearchVideoBottomAnchorProtocol
    public final int CB1(View view) {
        C660840Pw2 c660840Pw2;
        C660380PvI.LIZ.getClass();
        if (view != null && (c660840Pw2 = (C660840Pw2) view.findViewById(R.id.u6w)) != null) {
            return c660840Pw2.getMeasureWidthWhenPlay();
        }
        return 0;
    }

    @Override // com.ss.android.ugc.aweme.search.pages.result.common.searchphoto.core.bottomanchors.protocol.ISearchPhotoBottomAnchorProtocol
    public final EnumC660390PvJ cZ0(Aweme aweme) {
        C660380PvI.LIZ.getClass();
        if (C660380PvI.LIZJ(aweme)) {
            return EnumC660390PvJ.PHOTO_POI;
        }
        return EnumC660390PvJ.NO_PRIORITY;
    }

    @Override // com.ss.android.ugc.aweme.search.pages.result.common.searchphoto.core.bottomanchors.protocol.ISearchPhotoBottomAnchorProtocol
    public final int cw2(View view) {
        C660840Pw2 c660840Pw2;
        C660380PvI.LIZ.getClass();
        if (view != null && (c660840Pw2 = (C660840Pw2) view.findViewById(R.id.u6w)) != null) {
            return c660840Pw2.getMeasureWidthWhenPlay();
        }
        return 0;
    }

    @Override // com.ss.android.ugc.aweme.search.pages.result.common.searchvideo.core.protocal.ISearchVideoAnchorPriorityProtocol
    public final EnumC660370PvH iY1(Aweme aweme) {
        return EnumC660370PvH.POI;
    }

    @Override // com.ss.android.ugc.aweme.search.pages.result.common.searchvideo.core.protocal.ISearchVideoBottomAnchorProtocol
    public final Integer qe2(View view) {
        if (!C07EW.LIZ()) {
            return null;
        }
        C660840Pw2 c660840Pw2 = (C660840Pw2) view.findViewById(R.id.u6w);
        int currentTotalHeight = 0;
        if (c660840Pw2 != null && c660840Pw2.getVisibility() == 0) {
            currentTotalHeight = c660840Pw2.getCurrentTotalHeight();
        }
        return Integer.valueOf(currentTotalHeight + C814420VxA.LIZIZ(C418440Gaw.LIZIZ(1)));
    }

    @Override // com.ss.android.ugc.aweme.search.pages.result.common.searchvideo.core.protocal.ISearchVideoBottomAnchorProtocol
    public final Object qX1(Aweme aweme, SearchMixFeed searchMixFeed) {
        C660800Pvy.LIZ.getClass();
        return C660800Pvy.LIZ(aweme);
    }

    @Override // com.ss.android.ugc.aweme.search.pages.result.common.searchvideo.core.protocal.ISearchVideoBottomAnchorProtocol
    public final Map<String, String> wV0(Aweme aweme, C660780Pvw c660780Pvw) {
        C660380PvI.LIZ.getClass();
        return C660380PvI.LIZ(aweme);
    }

    @Override // com.ss.android.ugc.aweme.search.pages.result.common.searchvideo.core.protocal.ISearchVideoBottomAnchorProtocol
    public final void xg2(View view, Function0<Unit> function0) {
        C660840Pw2 c660840Pw2;
        if (C07EW.LIZ() && (c660840Pw2 = (C660840Pw2) view.findViewById(R.id.u6w)) != null) {
            c660840Pw2.setOnHeightChangeListener(function0);
        }
    }

    @Override // com.ss.android.ugc.aweme.search.pages.result.common.searchvideo.core.protocal.ISearchVideoAnchorPriorityProtocol
    public final boolean od0(SearchMixFeed searchMixFeed, Aweme aweme, C0PT4 c0pt4) {
        C660380PvI.LIZ.getClass();
        return C660380PvI.LIZJ(aweme);
    }
}
