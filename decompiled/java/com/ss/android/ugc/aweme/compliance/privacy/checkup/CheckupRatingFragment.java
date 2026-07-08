package com.ss.android.ugc.aweme.compliance.privacy.checkup;

import X.C1264560j0o;
import X.C1697810uHb;
import X.C191994109g;
import X.C19202610Am;
import X.C19202810Ao;
import X.C1954807lC;
import X.C197039127h;
import X.C19EG;
import X.C20684815ws;
import X.C2344009Gk;
import X.C384050F3z;
import X.C418440Gaw;
import X.C426750GoL;
import X.C786410Ut5;
import X.C814420VxA;
import X.EnumC19202910Ap;
import Y.ACListenerS130S0200000_28;
import Y.ACListenerS162S0100000_28;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import java.util.List;

/* JADX INFO: loaded from: classes29.dex */
public final class CheckupRatingFragment extends CheckupBasePageFragment {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiYjJD8/ISQiKip9ODHELIOSclPy4wMWsvISowIzA8Zww7LSYnPD8BKTElJygVOiQrJCo9PA==";
    public LinearLayout LLILZIL;
    public TuxTextView LLILZLL;
    public final List<C19202610Am> LLIZ = C1697810uHb.LJIIJJI(new C19202610Am(R.raw.icon_bitmap_big_moji_very_bad, R.raw.icon_bitmap_big_moji_very_bad_gray, 2131845056, 1), new C19202610Am(R.raw.icon_bitmap_big_moji_bad, R.raw.icon_bitmap_big_moji_bad_gray, 2131845055, 2), new C19202610Am(R.raw.icon_bitmap_big_moji_neutral, R.raw.icon_bitmap_big_moji_neutral_gray, 2131845054, 3), new C19202610Am(R.raw.icon_bitmap_big_moji_good, R.raw.icon_bitmap_big_moji_good_gray, 2131845053, 4), new C19202610Am(R.raw.icon_bitmap_big_moji_very_good, R.raw.icon_bitmap_big_moji_very_good_gray, 2131845052, 5));
    public C19202610Am LLIZLLLIL;

    @Override // com.ss.android.ugc.aweme.compliance.privacy.checkup.CheckupBasePageFragment
    public final int MR() {
        return R.layout.bdh;
    }

    @Override // com.ss.android.ugc.aweme.compliance.privacy.checkup.CheckupBasePageFragment
    public final boolean NR(boolean z) {
        return true;
    }

    @Override // com.ss.android.ugc.aweme.compliance.privacy.checkup.CheckupBasePageFragment
    public final void PR() {
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_from", getEnterFrom());
        C191994109g.LIZ.getClass();
        c2344009Gk.LJ(C191994109g.LIZJ(), "total_social_info");
        c2344009Gk.LJ(C191994109g.LIZIZ(), "privacy_status_info");
        C20684815ws.LJIILLIIL("privacy_checkup_complete_page_show", c2344009Gk.LIZ);
    }

    @Override // com.ss.android.ugc.aweme.compliance.privacy.checkup.CheckupBasePageFragment
    public final String RR() {
        return C1264560j0o.LIZ("rating");
    }

    @Override // com.ss.android.ugc.aweme.compliance.privacy.checkup.CheckupBasePageFragment
    public final void WR() {
        C197039127h c197039127h = this.LLILLJJLI;
        if (c197039127h != null) {
            c197039127h.setText(getString(2131845050));
            c197039127h.setEnabled(false);
            C786410Ut5.U8(c197039127h, new ACListenerS162S0100000_28(this, 43));
        }
        TuxTextView tuxTextView = this.LLILLL;
        if (tuxTextView != null) {
            C786410Ut5.LLLLZLL(tuxTextView, 8);
            C197039127h c197039127h2 = this.LLILLJJLI;
            if (c197039127h2 != null) {
                C426750GoL.LJIIIZ(c197039127h2, null, null, null, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12))), false, 23);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.compliance.privacy.checkup.CheckupBasePageFragment
    public final void OR(EnumC19202910Ap enumC19202910Ap) {
        String str;
        int i = C19202810Ao.LIZ[enumC19202910Ap.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    str = "tap_x_exit";
                } else {
                    throw new C1954807lC();
                }
            } else {
                str = "";
            }
        } else {
            str = "tap_submit";
        }
        Integer numValueOf = null;
        if (enumC19202910Ap == EnumC19202910Ap.EVENT_CLOSE) {
            C191994109g c191994109g = C191994109g.LIZ;
            String enterFrom = getEnterFrom();
            c191994109g.getClass();
            C191994109g.LJIIJ(null, enterFrom, str);
            return;
        }
        C191994109g c191994109g2 = C191994109g.LIZ;
        String enterFrom2 = getEnterFrom();
        C19202610Am c19202610Am = this.LLIZLLLIL;
        if (c19202610Am != null) {
            numValueOf = Integer.valueOf(c19202610Am.LIZLLL);
        }
        c191994109g2.getClass();
        C191994109g.LJIIJ(numValueOf, enterFrom2, str);
    }

    @Override // com.ss.android.ugc.aweme.compliance.privacy.checkup.CheckupBasePageFragment
    public final void SR(Context context) {
        OR(EnumC19202910Ap.EVENT_CLOSE);
        C19EG activity = getActivity();
        if (activity != null) {
            activity.finish();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ss.android.ugc.aweme.compliance.privacy.checkup.CheckupBasePageFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.LLILZIL = (LinearLayout) view.findViewById(R.id.sro);
        this.LLILZLL = (TuxTextView) view.findViewById(R.id.srk);
        LinearLayout linearLayout = this.LLILZIL;
        if (linearLayout != null) {
            for (C19202610Am c19202610Am : this.LLIZ) {
                TuxIconView tuxIconView = new TuxIconView(linearLayout.getContext(), null, 0, 6, null == true ? 1 : 0);
                tuxIconView.setIconRes(c19202610Am.LIZIZ);
                C786410Ut5.a9(tuxIconView, new ACListenerS130S0200000_28(this, c19202610Am, 15));
                linearLayout.addView(tuxIconView, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(44)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(44)));
            }
            C384050F3z c384050F3z = new C384050F3z();
            c384050F3z.LJII = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(18));
            linearLayout.setDividerDrawable(c384050F3z.LIZ(linearLayout.getContext()));
        }
    }
}
