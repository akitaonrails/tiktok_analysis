package com.ss.android.ugc.aweme.aiportrait.detail;

import X.InterfaceC627640Oja;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.aweme.challenge.ui.DetailAwemeListFragment;

/* JADX INFO: loaded from: classes10.dex */
public final class AIPortraitDetailAwemeListFragment extends DetailAwemeListFragment {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiQlOSAhPDctIDt9LCA4HELIOSKCY/ZgQFGSAhPDctIDsXLTEtICMSPyAhLAM6OzEKOy40JSAiPQ==";

    @Override // com.ss.android.ugc.aweme.challenge.ui.DetailAwemeListFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.LLJJJJLIIL = new InterfaceC627640Oja() { // from class: X.0OjZ
            @Override // X.InterfaceC627640Oja
            public final void LIZ(int i) {
                FrameLayout frameLayout = this.LIZ.LLJJJ;
                if (frameLayout != null) {
                    C786410Ut5.LJZ(8, frameLayout);
                }
                C1235870iGX c1235870iGX = this.LIZ.LLJJIJIL;
                if (c1235870iGX != null) {
                    C786410Ut5.LLLLIILL(c1235870iGX, 8);
                }
                RecyclerView recyclerView = this.LIZ.LLJJIJIIJIL;
                if (recyclerView != null) {
                    C786410Ut5.LLIZLLLIL(recyclerView, 0);
                }
            }
        };
    }
}
