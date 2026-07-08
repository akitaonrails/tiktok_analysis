package com.ss.android.ugc.aweme.favorites.business;

import X.AbstractC2369409Qe;
import X.AbstractC480470Isn;
import X.C13LP;
import X.C15438062q;
import X.C1697810uHb;
import X.C19EG;
import android.content.Context;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.profile.ui.ProfileListFragment;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes19.dex */
public final class FavoritesPagerAdapterOtherProfile extends AbstractC480470Isn implements LifecycleEventObserver {
    public final Bundle LLIZ;
    public final Context LLIZLLLIL;
    public final List<AbstractC2369409Qe> LLJ;

    public final List<Fragment> LJJIJLIJ() {
        List<AbstractC2369409Qe> list = this.LLJ;
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
        Iterator<AbstractC2369409Qe> it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList.add(it2.next().LIZ().LIZ);
        }
        return arrayList;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final int getCount() {
        return ((ArrayList) this.LLJ).size();
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final int LJIJJ(Object obj) {
        if (C13LP.LJJJJ(obj, LJJIJLIJ())) {
            return ((ArrayList) LJJIJLIJ()).indexOf(obj);
        }
        return -2;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final CharSequence LJIJJLI(int i) {
        return ((AbstractC2369409Qe) ListProtector.get(this.LLJ, i)).LIZ().LIZIZ;
    }

    @Override // X.AbstractC480470Isn
    public final Fragment LJJIJIL(int i) {
        return ((AbstractC2369409Qe) ListProtector.get(this.LLJ, i)).LIZ().LIZ;
    }

    public final String LJJIL(int i) {
        return ((AbstractC2369409Qe) ListProtector.get(this.LLJ, i)).LIZ().LIZJ;
    }

    public final void LJJIZ(int i) {
        ProfileListFragment profileListFragment;
        boolean z;
        int i2 = 0;
        for (Fragment fragment : LJJIJLIJ()) {
            int i3 = i2 + 1;
            if (i2 >= 0) {
                Fragment fragment2 = fragment;
                if ((fragment2 instanceof ProfileListFragment) && (profileListFragment = (ProfileListFragment) fragment2) != null) {
                    if (profileListFragment.getFragmentManager() != null) {
                        if (i2 == i) {
                            z = true;
                        } else {
                            z = false;
                        }
                        profileListFragment.setUserVisibleHint(z);
                    }
                    profileListFragment.Bp();
                }
                i2 = i3;
            } else {
                C1697810uHb.LJIJI();
                throw null;
            }
        }
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        Iterator<AbstractC2369409Qe> it2 = this.LLJ.iterator();
        while (it2.hasNext()) {
            it2.next().LIZIZ(event);
        }
    }

    public FavoritesPagerAdapterOtherProfile(C19EG c19eg, Bundle bundle, FragmentManager fragmentManager) {
        super(fragmentManager, 0);
        this.LLIZ = bundle;
        this.LLIZLLLIL = c19eg;
        this.LLJ = new ArrayList();
    }
}
