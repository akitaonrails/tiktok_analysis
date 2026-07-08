package com.ss.android.ugc.aweme.ecommerce.showcase.service.saas;

import X.InterfaceC1257980iqC;
import android.view.View;
import android.widget.ListView;
import android.widget.ScrollView;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.aweme.profile.ui.ProfileListFragment;

/* JADX INFO: loaded from: classes20.dex */
public abstract class TabCommerceFragment extends ProfileListFragment implements InterfaceC1257980iqC {
    @Override // com.ss.android.ugc.aweme.profile.ui.ProfileListFragment
    public final void Bp() {
    }

    @Override // X.InterfaceC1206550hVF
    public final void Ii(boolean z) {
    }

    public void LJFF() {
    }

    @Override // X.InterfaceC1206550hVF
    public final boolean LJLLL() {
        return false;
    }

    public void PB(String str) {
    }

    @Override // com.ss.android.ugc.aweme.profile.ui.ProfileListFragment
    public final boolean isEmpty() {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.profile.ui.ProfileListFragment
    public final void cS(boolean z) {
        View viewLJJLIIIJILLIZJL = LJJLIIIJILLIZJL();
        if (viewLJJLIIIJILLIZJL instanceof RecyclerView) {
            if (z) {
                ((RecyclerView) viewLJJLIIIJILLIZJL).smoothScrollToPosition(0);
                return;
            } else {
                ((RecyclerView) viewLJJLIIIJILLIZJL).scrollToPosition(0);
                return;
            }
        }
        if (viewLJJLIIIJILLIZJL instanceof ScrollView) {
            ((ScrollView) viewLJJLIIIJILLIZJL).scrollTo(0, 0);
        } else {
            if (!(viewLJJLIIIJILLIZJL instanceof ListView)) {
                return;
            }
            if (z) {
                ((ListView) viewLJJLIIIJILLIZJL).smoothScrollToPosition(0);
            } else {
                viewLJJLIIIJILLIZJL.scrollTo(0, 0);
            }
        }
    }
}
