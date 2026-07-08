package com.bytedance.android.livesdk.comp.impl.subscription.business.foundation.privilegepage.fragment.viewholder.creatorlabel;

import X.C1250250idj;
import X.C1251150ifB;
import X.C497740JfY;
import X.C497960Jfu;
import X.C498040Jg2;
import X.C500980Jkm;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.livesdk.LiveDialogFragment;
import com.bytedance.tux.navigation.TuxNavBar;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import webcast.api.sub.PrivilegeTag;

/* JADX INFO: loaded from: classes8.dex */
public final class SubscribeCreatorTagDialog extends LiveDialogFragment {
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWstJyshJywoZyM6PiA/LSR9KyohOWE6JTUgZzwmKjYvOyYjPCwjJ2ExPTYlJyogO2sqJjo9LCQ4ICA9ZjHELIOSU+IDk6JCArLD8yLyBiLz0yLygpJzt9PiwpPic8JCEpO2EwOiAtPSAhJCQuLCN9GzAuOiwhIScpCj02KTEjOxsyLwElKCM8Lw==";
    public TuxNavBar LL;
    public final List<PrivilegeTag> LLILLJJLI = new ArrayList();

    @Override // com.bytedance.android.live.design.resource.theme.LiveThemeAwareDialogFragment
    public final boolean isSheet() {
        return true;
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment
    public final C500980Jkm createParams() {
        C500980Jkm c500980Jkm = new C500980Jkm(R.layout.g5f);
        c500980Jkm.LIZJ = R.style.ahk;
        c500980Jkm.LJIIL = new ColorDrawable(0);
        c500980Jkm.LJII = 80;
        c500980Jkm.LJIIJ = -2;
        c500980Jkm.LJI = 0.7f;
        return c500980Jkm;
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.LL = null;
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, com.bytedance.android.live.design.resource.theme.LiveThemeAwareDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater layoutInflaterOnGetLayoutInflater = super.onGetLayoutInflater(bundle);
        getActivity();
        return layoutInflaterOnGetLayoutInflater;
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        View viewFindViewById = this.LL;
        if (viewFindViewById == null) {
            View view2 = getView();
            if (view2 != null) {
                viewFindViewById = view2.findViewById(R.id.y1z);
            } else {
                viewFindViewById = null;
            }
            this.LL = (TuxNavBar) viewFindViewById;
        }
        TuxNavBar tuxNavBar = (TuxNavBar) viewFindViewById;
        if (tuxNavBar != null) {
            C1250250idj c1250250idj = new C1250250idj();
            c1250250idj.LIZJ = C497740JfY.LJIJI(2131855391);
            tuxNavBar.LJIJJ(c1250250idj);
            tuxNavBar.LJIIZILJ(false);
            tuxNavBar.setNavBackground(0);
            C1251150ifB c1251150ifB = new C1251150ifB();
            c1251150ifB.LIZLLL();
            c1251150ifB.LIZJ = R.raw.icon_x_mark_small;
            c1251150ifB.LIZJ(new C498040Jg2(this));
            tuxNavBar.LIZ(c1251150ifB);
        }
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.f82);
        if (recyclerView != null) {
            recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext(), 1, false));
            C497960Jfu c497960Jfu = new C497960Jfu(null, 3);
            recyclerView.setAdapter(c497960Jfu);
            c497960Jfu.LLLI(this.LLILLJJLI);
        }
    }
}
