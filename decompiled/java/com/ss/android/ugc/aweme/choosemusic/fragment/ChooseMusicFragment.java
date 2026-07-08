package com.ss.android.ugc.aweme.choosemusic.fragment;

import X.C0QMK;
import X.C15IK;
import X.C20684815ws;
import X.C2097608Jq;
import X.C2344009Gk;
import X.C673090Qah;
import X.C681420Qo8;
import X.C681430Qo9;
import X.C682480Qpq;
import X.C684000QsI;
import X.C786410Ut5;
import android.os.Bundle;
import android.view.View;
import com.bytedance.tux.icon.TuxIconView;
import com.zhiliaoapp.musically.R;
import kotlin.Pair;

/* JADX INFO: loaded from: classes11.dex */
public final class ChooseMusicFragment extends BaseChooseMusicFragment {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiYkJiAgLSg5HELIOSOiYwZiM+KCg+LSs4Zww7Jyo/LAImOywvDz0yLygpJzs=";
    public TuxIconView LLLLIILL;
    public boolean LLLLIILLL;

    @Override // com.ss.android.ugc.aweme.choosemusic.fragment.BaseChooseMusicFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        boolean z = C681420Qo8.LIZ;
        C681420Qo8.LIZ = false;
    }

    @Override // com.ss.android.ugc.aweme.choosemusic.fragment.BaseChooseMusicFragment
    public final void MR(int i) {
        if (!C682480Qpq.LIZ().LJFF()) {
            return;
        }
        if (i != 8 && i != 4) {
            if (i == 0 && !this.LLLLIILLL) {
                this.LLLLIILLL = true;
                C2344009Gk c2344009Gk = new C2344009Gk();
                String str = C15IK.LIZ;
                if (str == null) {
                    str = "";
                }
                c2344009Gk.LJIIIIZZ("enter_from", str);
                c2344009Gk.LJIIIIZZ("enter_from_second", "discover_search_box_right");
                c2344009Gk.LJIIIIZZ("creation_id", C15IK.LJ);
                c2344009Gk.LJIIIIZZ("is_song_recog", "1");
                C20684815ws.LJIILLIIL("voice_button_show", c2344009Gk.LIZ);
                return;
            }
            return;
        }
        this.LLLLIILLL = false;
    }

    @Override // com.ss.android.ugc.aweme.choosemusic.fragment.BaseChooseMusicFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.LLLLIILL = (TuxIconView) view.findViewById(R.id.voice_search_button);
        if (C682480Qpq.LIZ().LJFF()) {
            TuxIconView tuxIconView = this.LLLLIILL;
            if (tuxIconView != null) {
                C786410Ut5.LLLLLLZZ(tuxIconView, 0);
            }
            C684000QsI c684000QsI = C684000QsI.LIZIZ;
            TuxIconView tuxIconView2 = this.LLLLIILL;
            C0QMK c0qmk = new C0QMK() { // from class: X.0Qo7
                @Override // X.C0QMK
                public final void onDismiss() {
                }

                @Override // X.C0QMK
                public final void LIZ(C665460Q8i c665460Q8i) {
                    if (!this.LIZ.isViewValid()) {
                        return;
                    }
                    this.LIZ.SR(c665460Q8i);
                }
            };
            Pair[] pairArr = new Pair[3];
            String str = C15IK.LIZ;
            String str2 = "";
            if (str == null) {
                str = "";
            }
            pairArr[0] = new Pair("enter_from", str);
            pairArr[1] = new Pair("enter_from_second", "discover_search_box_right");
            String str3 = C15IK.LJ;
            if (str3 != null) {
                str2 = str3;
            }
            pairArr[2] = new Pair("creation_id", str2);
            c684000QsI.LIZJ(tuxIconView2, this, c0qmk, C2097608Jq.LJI(pairArr));
            if (!C681430Qo9.LIZ()) {
                MR(0);
            }
        }
        boolean z = C681420Qo8.LIZ;
        boolean zLIZ = C682480Qpq.LIZ().LIZ();
        C681420Qo8.LIZIZ = zLIZ;
        if (!zLIZ) {
            C673090Qah.LIZIZ.LIZLLL();
        }
        C681420Qo8.LIZ = true;
    }
}
