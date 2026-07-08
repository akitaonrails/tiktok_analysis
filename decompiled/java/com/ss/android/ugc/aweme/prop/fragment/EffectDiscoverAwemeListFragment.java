package com.ss.android.ugc.aweme.prop.fragment;

import X.C0DXR;
import X.C116F;
import X.C11NJ;
import X.C11NZ;
import X.C1398410mUh;
import X.C1701940uOG;
import Y.AfS190S0100000_21;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.router.SmartRoute;
import com.ss.android.ugc.aweme.challenge.ui.DetailAwemeListFragment;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class EffectDiscoverAwemeListFragment extends DetailAwemeListFragment {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZjU+Jj99LjctLiI2HELIOSJjFiDCk1LSY4DSYgKyo6LD0SPyAhLAM6OzEKOy40JSAiPQ==";
    public int LLLILZLLLI;
    public C11NZ<Integer> LLLIZZ;
    public final C11NJ LLLJ = new C11NJ();

    @Override // com.ss.android.ugc.aweme.challenge.ui.DetailAwemeListFragment
    public final int bS() {
        return 2;
    }

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        this.LLLJ.dispose();
    }

    @Override // com.ss.android.ugc.aweme.challenge.ui.DetailAwemeListFragment
    public final void SR(boolean z) {
        C116F c116f;
        T t = this.LLILZ.LL;
        if ((t instanceof C116F) && (c116f = (C116F) t) != null) {
            c116f.LLJ = this.LLLILZLLLI;
        }
        super.SR(z);
    }

    @Override // com.ss.android.ugc.aweme.challenge.ui.DetailAwemeListFragment
    public final C0DXR VR(int i) {
        return new C0DXR() { // from class: X.0mZZ
            @Override // X.C0DXR
            public final void LIZIZ(Rect rect, View view, RecyclerView recyclerView, C21673919s1 c21673919s1) {
                super.LIZIZ(rect, view, recyclerView, c21673919s1);
                if (recyclerView.getChildAdapterPosition(view) % 2 == 0) {
                    rect.left = 0;
                    rect.right = 1;
                } else {
                    rect.left = 1;
                    rect.right = 0;
                }
                rect.top = 1;
                rect.bottom = 1;
            }
        };
    }

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C11NZ<Integer> c11nz = this.LLLIZZ;
        if (c11nz != null) {
            this.LLLJ.LIZ(c11nz.LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLJLI(new AfS190S0100000_21(this, 14)));
        }
    }

    @Override // com.ss.android.ugc.aweme.challenge.ui.DetailAwemeListFragment
    public final SmartRoute NR(C1398410mUh c1398410mUh, Aweme aweme) {
        String string;
        String string2;
        String string3;
        SmartRoute smartRouteNR = super.NR(c1398410mUh, aweme);
        Bundle arguments = getArguments();
        String string4 = null;
        if (arguments != null) {
            string = arguments.getString("detail_aweme_from");
        } else {
            string = null;
        }
        smartRouteNR.withParam("detail_aweme_from", string);
        Bundle arguments2 = getArguments();
        if (arguments2 != null) {
            string2 = arguments2.getString("creation_id");
        } else {
            string2 = null;
        }
        smartRouteNR.withParam("creation_id", string2);
        Bundle arguments3 = getArguments();
        if (arguments3 != null) {
            string3 = arguments3.getString("shoot_way");
        } else {
            string3 = null;
        }
        smartRouteNR.withParam("shoot_way", string3);
        Bundle arguments4 = getArguments();
        if (arguments4 != null) {
            string4 = arguments4.getString("shoot_tab_name");
        }
        smartRouteNR.withParam("shoot_tab_name", string4);
        if (Intrinsics.LJFF(string, "from_effect_discover_tab")) {
            smartRouteNR.withParam("previous_page", "prop_page_discover");
            smartRouteNR.withParam("refer", "prop_page_discover");
            return smartRouteNR;
        }
        smartRouteNR.withParam("previous_page", "prop_panel_discover");
        smartRouteNR.withParam("refer", "video_shoot_page");
        return smartRouteNR;
    }
}
