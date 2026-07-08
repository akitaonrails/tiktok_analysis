package com.ss.android.ugc.feed.platform.cell.interact.info.horiontag.tag;

import X.C0RF0;
import X.C1331660kl2;
import X.C1331670kl3;
import X.C13LP;
import X.C1559260qg8;
import X.C1AF0;
import X.C2211631BhB;
import X.C299590Boj;
import X.C384050F3z;
import X.C418440Gaw;
import X.C430210Gtv;
import X.C438710HIf;
import X.C690430R6j;
import X.C690870R8b;
import X.C704010RjT;
import X.C723580SZw;
import X.C786410Ut5;
import X.EnumC700430Rdh;
import Y.ACListenerS76S0300000_9;
import android.view.View;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.feed.platform.cell.trigger.DynamicComponent;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.AwS588S0100000_9;

/* JADX INFO: loaded from: classes12.dex */
public final class FeedMusicFanSpotlightAssem extends DynamicComponent<FeedMusicFanSpotlightAssem> {
    public View LLJZIJLIL;
    public C430210Gtv LLL;
    public TuxTextView LLLF;

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int Oo() {
        return R.layout.b6d;
    }

    @Override // com.ss.android.ugc.feed.platform.cell.trigger.DynamicComponent
    /* JADX INFO: renamed from: Ep */
    public final void up(VideoItemParams videoItemParams) {
        User user;
        Aweme aweme = videoItemParams.getAweme();
        if (aweme != null) {
            List<User> pickedUsers = aweme.getPickedUsers();
            if (pickedUsers != null && (user = (User) C13LP.LJJJLZIJ(0, pickedUsers)) != null) {
                C1331670kl3 c1331670kl3LJIIIIZZ = C1331660kl2.LJIIIIZZ(C438710HIf.LIZ(user.getAvatarMedium()));
                C430210Gtv c430210Gtv = this.LLL;
                View view = null;
                if (c430210Gtv == null) {
                    c430210Gtv = null;
                }
                c1331670kl3LJIIIIZZ.LJJ(c430210Gtv);
                C786410Ut5.h3(c1331670kl3LJIIIIZZ);
                View view2 = this.LLJZIJLIL;
                if (view2 != null) {
                    view = view2;
                }
                C786410Ut5.I7(new ACListenerS76S0300000_9(this, user, aweme, 3), view);
            } else {
                return;
            }
        }
        C2211631BhB.LJ(LJJIJL(), new AwS588S0100000_9(this, 30));
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        C690870R8b c690870R8b;
        String str;
        super.onViewCreated(view);
        C384050F3z c384050F3z = new C384050F3z();
        c384050F3z.LIZIZ = Integer.valueOf(R.attr.ee);
        c384050F3z.LJIIIIZZ = Float.valueOf(C418440Gaw.LIZIZ(4));
        c384050F3z.LJIIIZ = Float.valueOf(C418440Gaw.LIZIZ(4));
        c384050F3z.LJIIJ = Float.valueOf(C418440Gaw.LIZIZ(4));
        c384050F3z.LJIIJJI = Float.valueOf(C418440Gaw.LIZIZ(4));
        view.setBackground(c384050F3z.LIZ(view.getContext()));
        View viewFindViewById = view.findViewById(R.id.hng);
        this.LLJZIJLIL = viewFindViewById;
        View view2 = null;
        if (viewFindViewById == null) {
            viewFindViewById = null;
        }
        setComponentClickStatusExperimental(viewFindViewById, EnumC700430Rdh.POSITIVE);
        this.LLLF = (TuxTextView) view.findViewById(R.id.bca);
        C430210Gtv c430210Gtv = (C430210Gtv) view.findViewById(R.id.bbz);
        this.LLL = c430210Gtv;
        if (c430210Gtv == null) {
            c430210Gtv = null;
        }
        c430210Gtv.setBorderWidth(0);
        C430210Gtv c430210Gtv2 = this.LLL;
        if (c430210Gtv2 == null) {
            c430210Gtv2 = null;
        }
        c430210Gtv2.setRoundingParamsPadding(0.0f);
        C430210Gtv c430210Gtv3 = this.LLL;
        if (c430210Gtv3 == null) {
            c430210Gtv3 = null;
        }
        c430210Gtv3.setBorderAttrRes(0);
        C690430R6j c690430R6j = (C690430R6j) new C1559260qg8(new C723580SZw(this, C690430R6j.class, null), checkSupervisorPrepared()).getValue();
        if (c690430R6j == null || (c690870R8b = c690430R6j.LL) == null) {
            c690870R8b = new C690870R8b();
            if (C299590Boj.LIZ()) {
                C1AF0.LIZJ("can not find hierarchyData: cellContext");
                c690870R8b.LIZIZ = "cell_unknown";
            }
        }
        C0RF0 c0rf0 = c690870R8b.LIZLLL;
        if (c0rf0 != null) {
            str = c0rf0.LJIIIZ;
        } else {
            str = null;
        }
        if (C704010RjT.LJ(str)) {
            C704010RjT.LIZLLL(this.LLLF);
            C430210Gtv c430210Gtv4 = this.LLL;
            if (c430210Gtv4 == null) {
                c430210Gtv4 = null;
            }
            C704010RjT.LIZ(c430210Gtv4);
            View view3 = this.LLJZIJLIL;
            if (view3 == null) {
                view3 = null;
            }
            C704010RjT.LIZIZ(view3);
            View view4 = this.LLJZIJLIL;
            if (view4 != null) {
                view2 = view4;
            }
            view2.setPadding(0, 0, 0, 0);
        }
    }

    @Override // com.ss.android.ugc.feed.platform.cell.trigger.DynamicComponent, X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final /* bridge */ /* synthetic */ void up(Object obj) {
        up((VideoItemParams) obj);
    }
}
