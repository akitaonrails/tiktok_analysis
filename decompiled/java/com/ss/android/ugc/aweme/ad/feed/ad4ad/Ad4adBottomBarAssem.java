package com.ss.android.ugc.aweme.ad.feed.ad4ad;

import X.C20684815ws;
import X.C707230Rof;
import X.C786410Ut5;
import X.EnumC700430Rdh;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.ss.android.ugc.aweme.commercialize.model.Ad4adModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes12.dex */
public final class Ad4adBottomBarAssem extends BaseCellSlotComponent<Ad4adBottomBarAssem> {
    public ViewGroup LLJLLIL;
    public Ad4adModel LLJLLL;
    public Aweme LLJZ;

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int Oo() {
        return R.layout.b4r;
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        ViewGroup viewGroup = (ViewGroup) view.findViewById(R.id.a6k);
        this.LLJLLIL = viewGroup;
        if (viewGroup != null) {
            setComponentClickStatusExperimental(viewGroup, EnumC700430Rdh.POSITIVE);
        }
    }

    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final void up(VideoItemParams videoItemParams) {
        VideoItemParams videoItemParams2 = videoItemParams;
        this.LLJLLL = C707230Rof.LIZJ(videoItemParams2.getAweme());
        this.LLJZ = videoItemParams2.getAweme();
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, X.InterfaceC691660RBc
    public final void J1(int i, Aweme aweme) {
        boolean z;
        String str;
        Ad4adModel ad4adModelLIZJ;
        Aweme aweme2 = this.LLJZ;
        if (aweme2 != null) {
            if (C707230Rof.LIZLLL(aweme2) && (ad4adModelLIZJ = C707230Rof.LIZJ(aweme2)) != null && ad4adModelLIZJ.whyThisAd != null) {
                z = true;
            } else {
                z = false;
            }
            ViewGroup viewGroup = this.LLJLLIL;
            if (viewGroup != null) {
                if (z) {
                    TextView textView = (TextView) viewGroup.findViewById(R.id.a6l);
                    if (textView != null) {
                        Ad4adModel ad4adModel = this.LLJLLL;
                        if (ad4adModel != null) {
                            str = ad4adModel.whyThisAd;
                        } else {
                            str = null;
                        }
                        textView.setText(str);
                        C786410Ut5.LJLZ(0, viewGroup);
                        C786410Ut5.K7(viewGroup, null);
                        C20684815ws.LJIJ("ad4ad_disclaimer_show", C707230Rof.LIZ(aweme2));
                        return;
                    }
                    return;
                }
                C786410Ut5.LJLZ(8, viewGroup);
            }
        }
    }
}
