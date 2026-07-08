package com.ss.android.ugc.aweme.tako.aivideo.detail.page;

import X.C687700QyG;
import com.ss.android.ugc.aweme.base.ui.CommonPageFragment;
import com.ss.android.ugc.aweme.detail.ui.DetailFragment;
import com.ss.android.ugc.aweme.tako.aivideo.detail.scope.TakoAIVideoDetailScope;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes25.dex */
public final class TakoAiVideoPlayFragment extends DetailFragment {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZjEtIiB9KSw6ICs2J2HELIOSsoLDsyISliOS40LWsYKCQ8CSwaICs2JxUgKDYVOiQrJCo9PA==";

    @Override // com.ss.android.ugc.aweme.detail.ui.DetailFragment, X.InterfaceC1146704e9
    public final void checkParentScope() {
        C687700QyG.LIZ(this, new Class[]{TakoAIVideoDetailScope.class});
    }

    @Override // com.ss.android.ugc.aweme.detail.ui.DetailFragment, X.InterfaceC1146704e9
    public final List getParentScopes() {
        ArrayList arrayList = new ArrayList(super.getParentScopes());
        arrayList.add(TakoAIVideoDetailScope.class);
        return arrayList;
    }

    @Override // com.ss.android.ugc.aweme.detail.ui.DetailFragment
    public final Class<? extends CommonPageFragment> PR() {
        return TakoAiVideoDetailPageFragment.class;
    }
}
