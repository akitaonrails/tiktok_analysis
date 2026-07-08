package com.ss.android.ugc.aweme.viewmodel;

import X.C01GW;
import X.C036E;
import X.C09R9;
import X.C1220850hsJ;
import X.C1233040iBy;
import X.C13LE;
import X.C19EG;
import X.C452501pT;
import X.InterfaceC1891350zJl;
import X.InterfaceC636340Oxc;
import androidx.fragment.app.Fragment;
import com.bytedance.ext_power_list.AssemListViewModel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.fragments.MentionVideoListFragment;
import kotlin.jvm.internal.AFwS207S0000000_19;

/* JADX INFO: loaded from: classes20.dex */
public abstract class BaseVideoListVM<S extends InterfaceC636340Oxc<S, ITEM>, ITEM extends InterfaceC1891350zJl, Cursor> extends AssemListViewModel<S, ITEM, Cursor> {
    public Fragment LLILLL;
    public int LL = -1;
    public final C09R9 LLILLJJLI = new C09R9(this, C13LE.LIZ(C1220850hsJ.class));
    public final C01GW LLILZ = C452501pT.LIZIZ(AFwS207S0000000_19.get$arr$(335));
    public final C01GW LLILZIL = C452501pT.LIZIZ(AFwS207S0000000_19.get$arr$(334));
    public boolean LLILZLL = true;
    public final long LLIZ = 60;
    public final int LLIZLLLIL = 20;

    public final C19EG getActivity() {
        Fragment fragment = this.LLILLL;
        if (fragment != null) {
            return fragment.getActivity();
        }
        return null;
    }

    public final boolean wQ2() {
        Fragment fragment = this.LLILLL;
        if (!(fragment instanceof MentionVideoListFragment) || fragment == null) {
            return false;
        }
        return MentionVideoListFragment.LLJJJ;
    }

    public static boolean vQ2(Fragment fragment) {
        C19EG activity;
        if (fragment != null) {
            fragment.getActivity();
        }
        try {
            if (C036E.LIZ.LIZIZ()) {
                return true;
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        if (fragment != null) {
            activity = fragment.getActivity();
        } else {
            activity = null;
        }
        C1233040iBy c1233040iBy = new C1233040iBy(activity);
        c1233040iBy.LIZIZ(2131837962);
        c1233040iBy.LIZLLL();
        return false;
    }

    public final void xQ2(boolean z) {
        MentionVideoListFragment mentionVideoListFragment;
        Fragment fragment = this.LLILLL;
        if ((fragment instanceof MentionVideoListFragment) && (mentionVideoListFragment = (MentionVideoListFragment) fragment) != null) {
            mentionVideoListFragment.LLJILLL = z;
        }
    }

    public final void yQ2(boolean z) {
        Fragment fragment = this.LLILLL;
        if ((fragment instanceof MentionVideoListFragment) && fragment != null) {
            MentionVideoListFragment.LLJJJ = true;
        }
    }
}
