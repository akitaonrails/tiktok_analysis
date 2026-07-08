package com.ss.android.ugc.aweme.story.friends.detail.component;

import X.C0SED;
import X.C0SEI;
import X.C0T2Y;
import X.C11JF;
import X.C1308910kAL;
import X.C1558520qew;
import X.C1843500y4a;
import X.C19EG;
import X.C330770Cxv;
import X.C337180DJs;
import X.C628500Oky;
import X.C630740Ooa;
import X.C724240Sb0;
import X.C740740T3w;
import X.C786410Ut5;
import X.InterfaceC1554640qYg;
import X.InterfaceC494301wD;
import Y.ARunnableS16S1200000_11;
import android.view.View;
import android.view.animation.LinearInterpolator;
import com.bytedance.assem.arch.view.UISlotAssem;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.story.friends.detail.ability.FriendsDetailViewerEntranceUIAbility;
import com.ss.android.ugc.aweme.story.friends.detail.component.FriendsDetailViewerEntranceUIAssem;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.AwS555S0100000_11;
import wh6.AbS693S0100000_11;

/* JADX INFO: loaded from: classes12.dex */
public final class FriendsDetailViewerEntranceUIAssem extends UISlotAssem implements FriendsDetailViewerEntranceUIAbility, InterfaceC1554640qYg {
    public Aweme LLJJI;
    public TuxTextView LLJJIII;
    public TuxIconView LLJJIJI;
    public SmartImageView LLJJIJIIJIL;
    public C11JF LLJJIJIL;
    public final C630740Ooa LLJJJ = C628500Oky.LIZ(new AwS555S0100000_11(this, 909));
    public final C630740Ooa LLJJJIL = C628500Oky.LIZ(new AwS555S0100000_11(this, 910));

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int Co() {
        return R.layout.fdh;
    }

    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onParent_set_isOnParentSetEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    @Override // X.InterfaceC1554640qYg
    public final InterfaceC494301wD provideAbility(String str) {
        if (str.hashCode() != -76107853) {
            return null;
        }
        return this;
    }

    public final void hp() {
        if (LJJIJL().getVisibility() == 0) {
            return;
        }
        C786410Ut5.T4(LJJIJL(), 0.0f);
        C337180DJs.LIZJ(LJJIJL());
        LJJIJL().animate().alpha(1.0f).setDuration(150L).setInterpolator(new LinearInterpolator()).start();
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onCreate() {
        super.onCreate();
        C19EG c19egLIZ = C724240Sb0.LIZ(this);
        if (c19egLIZ != null) {
            C740740T3w.LIZIZ(c19egLIZ, this, new C0T2Y() { // from class: X.0SEC
                @Override // X.C0T2Y
                public final void Y3(Aweme aweme) {
                    FriendsDetailViewerEntranceUIAssem friendsDetailViewerEntranceUIAssem = this.LL;
                    friendsDetailViewerEntranceUIAssem.LLJJI = aweme;
                    if (C729980SkG.LJIIIIZZ(aweme)) {
                        C337180DJs.LIZJ(friendsDetailViewerEntranceUIAssem.LJJIJL());
                    } else {
                        C337180DJs.LIZ(friendsDetailViewerEntranceUIAssem.LJJIJL());
                    }
                }
            });
        }
    }

    @Override // X.AbstractC738140SxQ
    public final void onParentSet() throws IllegalAccessException {
        super.onParentSet();
        C1558520qew.LIZLLL(this);
    }

    @Override // com.ss.android.ugc.aweme.story.friends.detail.ability.FriendsDetailViewerEntranceUIAbility
    public final void Rj2(C0SED c0sed) {
        long jLongValue;
        String str = c0sed.LIZ;
        List<User> list = c0sed.LIZIZ;
        Aweme aweme = c0sed.LJ;
        Long lValueOf = Long.valueOf(c0sed.LIZJ);
        if (str != null) {
            C330770Cxv.LIZ.getClass();
            C0SEI c0seiLIZIZ = C330770Cxv.LIZIZ(aweme);
            if (lValueOf != null) {
                jLongValue = lValueOf.longValue();
            } else {
                jLongValue = 0;
            }
            if (jLongValue == 0) {
                TuxIconView tuxIconView = this.LLJJIJI;
                if (tuxIconView != null) {
                    C786410Ut5.LLLLLLZZ(tuxIconView, 8);
                }
                ip(R.attr.eh);
                TuxTextView tuxTextView = this.LLJJIII;
                if (tuxTextView != null) {
                    tuxTextView.setText(tuxTextView.getContext().getResources().getQuantityString(c0seiLIZIZ.LIZ, 0, C1843500y4a.LIZIZ(jLongValue)));
                }
            } else if (jLongValue < 0) {
                TuxTextView tuxTextView2 = this.LLJJIII;
                if (tuxTextView2 != null) {
                    tuxTextView2.setText(tuxTextView2.getContext().getString(c0seiLIZIZ.LIZIZ));
                }
                TuxIconView tuxIconView2 = this.LLJJIJI;
                if (tuxIconView2 != null) {
                    C786410Ut5.LLLLLLZZ(tuxIconView2, 8);
                }
                ip(R.attr.eh);
            } else {
                TuxTextView tuxTextView3 = this.LLJJIII;
                if (tuxTextView3 != null) {
                    tuxTextView3.setText(tuxTextView3.getContext().getResources().getQuantityString(c0seiLIZIZ.LIZ, (int) jLongValue, C1843500y4a.LIZIZ(jLongValue)));
                }
                TuxIconView tuxIconView3 = this.LLJJIJI;
                if (tuxIconView3 != null) {
                    C786410Ut5.LLLLLLZZ(tuxIconView3, 0);
                }
                ip(R.attr.ee);
            }
            TuxTextView tuxTextView4 = this.LLJJIII;
            if (tuxTextView4 != null) {
                HandlerHook.viewPost(tuxTextView4, new ARunnableS16S1200000_11(list, str, this, 0));
            }
        }
    }

    public final void ip(int i) {
        Integer numLIZJ;
        TuxTextView tuxTextView = this.LLJJIII;
        if (tuxTextView != null && (numLIZJ = C1308910kAL.LIZJ(i, tuxTextView.getContext())) != null) {
            tuxTextView.setTextColor(numLIZJ.intValue());
        }
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        this.LLJJIII = (TuxTextView) view.findViewById(R.id.tv_viewer_count);
        this.LLJJIJI = (TuxIconView) view.findViewById(R.id.jx_);
        this.LLJJIJIIJIL = (SmartImageView) view.findViewById(R.id.view_entrance_avatar_view);
        view.findViewById(R.id.dvq);
        C786410Ut5.I7(new AbS693S0100000_11(this, 15, 42), view);
    }
}
