package com.ss.android.ugc.aweme.tools.draft;

import X.C01GW;
import X.C452501pT;
import Y.AObjectS241S0100000_8;
import android.os.Bundle;
import android.view.View;
import com.ss.android.ugc.aweme.tools.draft.viewmodel.DraftViewModel;
import kotlin.jvm.internal.AwS552S0100000_8;

/* JADX INFO: loaded from: classes9.dex */
public final class PostedDraftPageFragment extends DraftFragment {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZjEjJiMgHELIOSZiE+KCknZhUjOjs2LAE+KCknGCQrLAkhKSIhLCEn";
    public final C01GW LLLIIIL = C452501pT.LIZIZ(new AwS552S0100000_8(this, 477));
    public final String LLLIIL = "posted_draft_page";

    @Override // com.ss.android.ugc.aweme.tools.draft.DraftFragment
    public final String getEnterFrom() {
        return "general_draft_list";
    }

    @Override // com.ss.android.ugc.aweme.tools.draft.DraftFragment
    public final DraftViewModel PR() {
        return (DraftViewModel) this.LLLIIIL.getValue();
    }

    @Override // com.ss.android.ugc.aweme.tools.draft.DraftFragment
    public final void fM() {
        requireFragmentManager().LJLLILLLL();
    }

    @Override // com.ss.android.ugc.aweme.tools.draft.DraftFragment
    public final String OR() {
        return this.LLLIIL;
    }

    @Override // com.ss.android.ugc.aweme.tools.draft.DraftFragment, com.ss.android.ugc.aweme.appcompat.AmeBaseFragmentAdaptationLegacyFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        ((DraftBoxActivity) requireActivity()).LLILLL.LIZ(this, new AObjectS241S0100000_8(this, 39));
    }
}
