package com.ss.android.ugc.aweme.tako.aivideo.detail.page;

import X.C19EG;
import X.C2189821An6;
import X.C687700QyG;
import X.C786410Ut5;
import X.InterfaceC1146704e9;
import android.os.Bundle;
import com.ss.android.ugc.aweme.detail.ui.DetailFragment;
import com.ss.android.ugc.aweme.detail.ui.saf.DetailSafRootFragment;
import com.ss.android.ugc.aweme.tako.aivideo.detail.scope.TakoAIVideoDetailScope;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONException;

/* JADX INFO: loaded from: classes25.dex */
public final class TakoAiVideoDetailSafRootFragment extends DetailSafRootFragment implements InterfaceC1146704e9 {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZjEtIiB9KSw6ICs2J2soLDsyHELIOSISliOS40LWsYKCQ8CSwaICs2JwEpPS46JBYtLx08JzEKOy40JSAiPQ==";

    @Override // X.InterfaceC1146704e9
    public final void checkParentScope() {
        C687700QyG.LIZ(this, new Class[]{TakoAIVideoDetailScope.class});
    }

    @Override // X.InterfaceC1146704e9
    public final List getParentScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(TakoAIVideoDetailScope.class);
        return arrayList;
    }

    @Override // com.ss.android.ugc.aweme.detail.ui.saf.DetailSafRootFragment
    public final boolean wS() {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.detail.ui.saf.DetailSafRootFragment
    public final DetailFragment mS(C2189821An6 c2189821An6) {
        C19EG activity = getActivity();
        if (!(activity instanceof TakoAiVideoDetailActivity) || activity == null) {
            return null;
        }
        Bundle bundle = new Bundle();
        C786410Ut5.LJJIZ(bundle, "feed_param", c2189821An6);
        TakoAiVideoPlayFragment takoAiVideoPlayFragment = new TakoAiVideoPlayFragment();
        takoAiVideoPlayFragment.setArguments(bundle);
        return takoAiVideoPlayFragment;
    }

    @Override // com.ss.android.ugc.aweme.detail.ui.saf.DetailSafRootFragment, androidx.fragment.app.SAFTikTokFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) throws JSONException {
        C687700QyG.LJI(this);
        super.onCreate(bundle);
    }
}
