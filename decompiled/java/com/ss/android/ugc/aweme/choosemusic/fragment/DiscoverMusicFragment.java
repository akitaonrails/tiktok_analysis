package com.ss.android.ugc.aweme.choosemusic.fragment;

import X.C0RD4;
import X.C1233040iBy;
import X.C15HB;
import X.C15HG;
import X.C19EG;
import X.C20491215Gc;
import X.C20493315Gx;
import android.os.Bundle;
import com.zhiliaoapp.musically.R;
import java.util.List;

/* JADX INFO: loaded from: classes32.dex */
public final class DiscoverMusicFragment extends BaseDiscoverMusicFragment {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiYkJiAgLSg5OiHELIOSYwZiM+KCg+LSs4Zws6OyYjPyohBTA/ICwVOiQrJCo9PA==";
    public final C20491215Gc LLJJIJI = new C20491215Gc();

    @Override // com.ss.android.ugc.aweme.choosemusic.fragment.BaseDiscoverMusicFragment
    public final void NR() {
        Boolean bool = (Boolean) this.LLILLL.get("data_sticker_music_from_video", Boolean.TRUE);
        List list = (List) this.LLILLL.get("data_sticker", null);
        if (bool.booleanValue()) {
            if (this.LLILLL.get("data_challenge") != null) {
                C15HB c15hb = this.LLILZIL;
                c15hb.LLJIJIL = true;
                c15hb.LLJILLL = 5;
                return;
            } else {
                if (list == null || list.size() <= 0) {
                    return;
                }
                C15HB c15hb2 = this.LLILZIL;
                c15hb2.LLJIJIL = true;
                c15hb2.LLJILLL = 4;
                return;
            }
        }
        if (list != null && list.size() > 0) {
            C15HB c15hb3 = this.LLILZIL;
            c15hb3.LLJIJIL = true;
            c15hb3.LLJILLL = 4;
        } else if (this.LLILLL.get("data_challenge") != null) {
            C15HB c15hb4 = this.LLILZIL;
            c15hb4.LLJIJIL = true;
            c15hb4.LLJILLL = 5;
        }
    }

    @Override // com.ss.android.ugc.aweme.choosemusic.fragment.BaseDiscoverMusicFragment
    public final void showLoadMoreEmpty() {
        this.LLILZIL.setShowFooter(false);
    }

    @Override // com.ss.android.ugc.aweme.choosemusic.fragment.BaseDiscoverMusicFragment
    public final void MR(C0RD4 c0rd4) {
        int i;
        Object obj = c0rd4.LIZIZ;
        if (obj == null) {
            obj = null;
        }
        C20493315Gx c20493315Gx = (C20493315Gx) obj;
        if (getUserVisibleHint() && c20493315Gx.LIZJ != -1) {
            if (c20493315Gx.LIZ == 1) {
                if (c20493315Gx.LIZLLL == 1) {
                    i = 2131828935;
                } else {
                    i = 2131828351;
                }
            } else if (c20493315Gx.LIZLLL == 1) {
                i = 2131828942;
            } else {
                i = R.string.f1n;
            }
            C19EG activity = getActivity();
            if (activity != null) {
                C1233040iBy c1233040iBy = new C1233040iBy(activity);
                c1233040iBy.LIZIZ(i);
                c1233040iBy.LIZLLL();
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.15Gw] */
    @Override // com.ss.android.ugc.aweme.choosemusic.fragment.BaseDiscoverMusicFragment, androidx.fragment.app.Fragment
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        this.LLILZIL.LLJJIJIL = new C15HG() { // from class: X.15Gw
            @Override // X.C15HG
            public final C20491215Gc LIZIZ() {
                return this.LIZ.LLJJIJI;
            }

            @Override // X.C15HG
            public final void LIZ(C15HO c15ho, String str) {
                C20491215Gc c20491215Gc = this.LIZ.LLJJIJI;
                String str2 = c15ho.LJ;
                if (!c20491215Gc.LIZ.contains(str2)) {
                    c20491215Gc.LIZ.add(str2);
                    C15IK.LJIILL(c15ho.LIZ, c15ho.LIZJ, c15ho.LJ, c15ho.LIZIZ, c15ho.LJIILIIL, c15ho.LJIILLIIL, str);
                }
            }
        };
    }
}
