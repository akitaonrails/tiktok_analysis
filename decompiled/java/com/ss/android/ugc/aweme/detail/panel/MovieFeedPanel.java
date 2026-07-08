package com.ss.android.ugc.aweme.detail.panel;

import X.C1324840ka2;
import X.C20684815ws;
import X.C21459218yU;
import X.C2344009Gk;
import X.C786410Ut5;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.Toast;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.homepage.api.msadapt.IMSAdaptionService;
import com.ss.android.ugc.aweme.mvtemplate.impl.MovieReuseServiceImpl;
import com.ss.android.ugc.aweme.shortvideo.model.MvModel;
import com.ss.android.ugc.aweme.tools.detail.IMovieReuseService;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes22.dex */
public class MovieFeedPanel extends ShootFeedPanel {
    public final MvModel G0;
    public final String H0;
    public final int I0;
    public final int J0;

    @Override // com.ss.android.ugc.aweme.detail.panel.ShootFeedPanel
    public final int L0() {
        return 2131857993;
    }

    public MovieFeedPanel(Bundle bundle) {
        this.G0 = (MvModel) bundle.getSerializable("feed_data_movie_model");
        this.H0 = bundle.getString("feed_data_movie_group_id", "");
        this.I0 = bundle.getInt("mv_type", 1);
        this.J0 = bundle.getInt("source_id", 1);
    }

    @Override // com.ss.android.ugc.aweme.detail.panel.ShootFeedPanel
    public final void I0(View view) {
        if (this.activity != null && ((IMSAdaptionService) ServiceManager.get().getService(IMSAdaptionService.class)).LIZLLL(this.activity)) {
            Activity activity = this.activity;
            C786410Ut5.re(Toast.makeText(activity, activity.getString(2131832497), 0));
            return;
        }
        IMovieReuseService iMovieReuseServiceLJ = MovieReuseServiceImpl.LJ();
        if (this.G0 != null) {
            iMovieReuseServiceLJ.LIZLLL(getFragment(), this.G0.getMvId(), this.I0, this.J0, true);
            C2344009Gk c2344009Gk = new C2344009Gk();
            c2344009Gk.LJIIIIZZ("enter_method", "mv_feed");
            c2344009Gk.LJIIIIZZ("mv_id", this.G0.getMvId());
            c2344009Gk.LJIIIIZZ("enter_from", "mv_page");
            c2344009Gk.LJIIIIZZ("shoot_way", "mv_page");
            c2344009Gk.LJIIIIZZ("content_type", "mv");
            c2344009Gk.LJIIIIZZ("group_id", this.H0);
            C20684815ws.LJIILLIIL("shoot", c2344009Gk.LIZ);
        }
    }

    @Override // com.ss.android.ugc.aweme.detail.panel.ShootFeedPanel
    public final View M0(RelativeLayout relativeLayout) {
        View viewTd = C786410Ut5.Td(C786410Ut5.ne(getContext()), R.layout.blf, relativeLayout, false);
        if (this.G0 != null) {
            C1324840ka2.LJFF((RemoteImageView) viewTd.findViewById(R.id.om6), this.G0.getIconUrl());
            C21459218yU c21459218yU = (C21459218yU) viewTd.findViewById(R.id.hu1);
            c21459218yU.setTuxFont(42);
            N0(c21459218yU, this.G0.getName());
        }
        return viewTd;
    }
}
