package com.ss.android.ugc.feed.platform.panel.speed;

import X.AbstractC848400XPy;
import X.C01GW;
import X.C0NIG;
import X.C0P4Y;
import X.C0XQ7;
import X.C1386110mAr;
import X.C1566140qrE;
import X.C1735430vGH;
import X.C19252910Tv;
import X.C19EG;
import X.C2188811AlT;
import X.C299750Boz;
import X.C452501pT;
import X.C520680KbS;
import X.C589950NBx;
import X.C589960NBy;
import X.C616140OEq;
import X.C628500Oky;
import X.C630740Ooa;
import X.C724240Sb0;
import X.C786410Ut5;
import X.EnumC452301pR;
import X.InterfaceC1554640qYg;
import X.InterfaceC1565950qqv;
import X.InterfaceC1583770rJf;
import X.InterfaceC1735440vGI;
import X.InterfaceC427710Gpt;
import X.InterfaceC494301wD;
import X.InterfaceC606700Nqu;
import Y.ACListenerS144S0100000_9;
import Y.ARunnableS109S0100000_9;
import android.view.View;
import android.widget.LinearLayout;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.hox.Hox;
import com.bytedance.keva.Keva;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.feed.platform.panel.BasePanelUIComponent;
import com.ss.android.ugc.feed.platform.panel.viewpager.IViewPagerComponentAbility;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS195S0000000_9;
import kotlin.jvm.internal.AwS127S0110000_9;
import kotlin.jvm.internal.AwS553S0100000_9;
import kotlin.jvm.internal.AwS588S0100000_9;
import kotlin.jvm.internal.AwS623S0100000_9;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class TabletPlaybackSpeedComponent extends BasePanelUIComponent implements InterfaceC1554640qYg {
    public final C01GW LLJIJIL;
    public final C630740Ooa LLJILJIL;
    public TuxTextView LLJILJILJ;
    public TuxTextView LLJILLL;
    public LinearLayout LLJJ;
    public LinearLayout LLJJI;
    public C589950NBx LLJJIII;
    public C616140OEq LLJJIJI;
    public final C630740Ooa LLJJIJIIJIL;
    public boolean LLJJIJIL;
    public Aweme LLJJJ;

    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onStart_isOnStartEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onStop_isOnStopEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    @Override // X.InterfaceC1554640qYg
    public final InterfaceC494301wD provideAbility(String str) {
        str.getClass();
        return null;
    }

    public final Aweme Go() {
        IViewPagerComponentAbility iViewPagerComponentAbility = (IViewPagerComponentAbility) this.LLJILJIL.getValue();
        if (iViewPagerComponentAbility != null) {
            return iViewPagerComponentAbility.LLLLLJLJLL();
        }
        return null;
    }

    public TabletPlaybackSpeedComponent() {
        C01GW c01gwLIZIZ;
        if (C299750Boz.LIZ()) {
            C630740Ooa c630740Ooa = new C630740Ooa(EnumC452301pR.PUBLICATION, new AwS553S0100000_9((InterfaceC1565950qqv) this, 1621), null);
            C1566140qrE.LIZJ(this, c630740Ooa);
            c01gwLIZIZ = c630740Ooa;
        } else {
            c01gwLIZIZ = C452501pT.LIZIZ(new AwS127S0110000_9(false, (InterfaceC1565950qqv) this, 16));
        }
        this.LLJIJIL = c01gwLIZIZ;
        this.LLJILJIL = C628500Oky.LIZ(new AwS553S0100000_9(this, 1623));
        this.LLJJIJIIJIL = C628500Oky.LIZ(AFwS195S0000000_9.get$arr$(358));
    }

    @Override // X.AbstractC738140SxQ
    public final void onStart() {
        super.onStart();
        if (this.LLJJIJIL) {
            this.LLJJIJIL = false;
            Jo(Go());
        }
    }

    @Override // X.AbstractC738140SxQ
    public final void onStop() {
        super.onStop();
        this.LLJJIJIL = true;
    }

    public final void Ho(Aweme aweme) {
        boolean z;
        C616140OEq c616140OEq;
        TuxTextView tuxTextView;
        C589960NBy.LIZ.getClass();
        float fLIZIZ = C589960NBy.LIZIZ(aweme);
        if (fLIZIZ == 1.0f) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            TuxTextView tuxTextView2 = this.LLJILJILJ;
            if (tuxTextView2 != null) {
                C786410Ut5.LLLLZLL(tuxTextView2, 8);
            }
        } else if (fLIZIZ == 2.0f) {
            TuxTextView tuxTextView3 = this.LLJILJILJ;
            if (tuxTextView3 != null) {
                C786410Ut5.LLLLZLL(tuxTextView3, 0);
            }
            TuxTextView tuxTextView4 = this.LLJILJILJ;
            if (tuxTextView4 != null) {
                tuxTextView4.setText("2x");
            }
        } else {
            TuxTextView tuxTextView5 = this.LLJILJILJ;
            if (tuxTextView5 != null) {
                C786410Ut5.LLLLZLL(tuxTextView5, 0);
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(fLIZIZ);
            sbLIZ.append('x');
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            TuxTextView tuxTextView6 = this.LLJILJILJ;
            if (tuxTextView6 != null) {
                tuxTextView6.setText(strLIZIZ);
            }
        }
        TuxTextView tuxTextView7 = this.LLJILLL;
        if (tuxTextView7 != null && tuxTextView7.getVisibility() == 0 && (tuxTextView = this.LLJILLL) != null) {
            C786410Ut5.LLLLZLL(tuxTextView, 8);
        }
        LinearLayout linearLayout = this.LLJJI;
        if (linearLayout != null && linearLayout.getVisibility() == 0 && (c616140OEq = this.LLJJIJI) != null) {
            c616140OEq.LIZJ(c616140OEq.LJ, new AwS553S0100000_9(c616140OEq, 1687));
        }
    }

    public final void Jo(Aweme aweme) {
        boolean z;
        InterfaceC606700Nqu interfaceC606700Nqu;
        String aid;
        C589960NBy.LIZ.getClass();
        if (C589960NBy.LIZ(aweme) && (interfaceC606700Nqu = (InterfaceC606700Nqu) this.LLJJIJIIJIL.getValue()) != null && interfaceC606700Nqu.LJJIIJ(C589960NBy.LIZIZ(aweme), aweme)) {
            if (LJJIJL().getVisibility() != 0) {
                Aweme aweme2 = this.LLJJJ;
                String aid2 = null;
                if (aweme2 != null) {
                    aid = aweme2.getAid();
                } else {
                    aid = null;
                }
                if (aweme != null) {
                    aid2 = aweme.getAid();
                }
                if (!Intrinsics.LJFF(aid, aid2)) {
                    this.LLJJJ = aweme;
                    C1386110mAr.LIZ.getClass();
                    C1386110mAr.LJFF(aweme, "homepage_hot", "on_screen_button");
                }
            }
            z = true;
        } else {
            z = false;
        }
        if (z) {
            C616140OEq c616140OEq = this.LLJJIJI;
            if (c616140OEq != null && c616140OEq.LJII) {
                return;
            }
            if (LJJIJL().getVisibility() == 0) {
                Ho(aweme);
                return;
            }
            final C616140OEq c616140OEq2 = this.LLJJIJI;
            if (c616140OEq2 == null) {
                return;
            }
            final AwS553S0100000_9 awS553S0100000_9 = new AwS553S0100000_9(this, 1622);
            View view = c616140OEq2.LIZJ;
            if (view != null && view.getVisibility() == 0) {
                awS553S0100000_9.invoke();
                return;
            }
            if (!((Keva) c616140OEq2.LJIIIIZZ.getValue()).getBoolean("first_show_playback_speed", false)) {
                c616140OEq2.LJII = true;
                ((Keva) c616140OEq2.LJIIIIZZ.getValue()).storeBoolean("first_show_playback_speed", true);
                TuxTextView tuxTextView = c616140OEq2.LIZIZ;
                if (tuxTextView != null) {
                    C786410Ut5.LLLLZLL(tuxTextView, 0);
                }
                TuxTextView tuxTextView2 = c616140OEq2.LIZ;
                if (tuxTextView2 != null) {
                    C786410Ut5.LLLLZLL(tuxTextView2, 8);
                }
                C1735430vGH c1735430vGH = new C1735430vGH(3000L, 1000L, new InterfaceC1735440vGI() { // from class: X.0Nqt
                    @Override // X.InterfaceC1735440vGI
                    public final void LJJI(long j) {
                    }

                    @Override // X.InterfaceC1735440vGI
                    public final void onStart() {
                    }

                    @Override // X.InterfaceC1735440vGI
                    public final void LIZLLL() {
                        C616140OEq c616140OEq3 = c616140OEq2;
                        c616140OEq3.LIZJ(c616140OEq3.LIZIZ, awS553S0100000_9);
                        c616140OEq2.LJII = false;
                    }
                });
                c616140OEq2.LJI = c1735430vGH;
                c1735430vGH.LJFF();
            } else {
                awS553S0100000_9.invoke();
            }
            c616140OEq2.LIZ(true);
            return;
        }
        C616140OEq c616140OEq3 = this.LLJJIJI;
        if (c616140OEq3 != null) {
            View view2 = c616140OEq3.LIZJ;
            if (view2 != null && view2.getVisibility() == 8) {
                return;
            }
            c616140OEq3.LIZLLL();
            c616140OEq3.LIZ(false);
        }
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        C589960NBy c589960NBy = C589960NBy.LIZ;
        C0NIG c0nig = new C0NIG(this);
        c589960NBy.getClass();
        C589960NBy.LJ = c0nig;
        IViewPagerComponentAbility iViewPagerComponentAbility = (IViewPagerComponentAbility) this.LLJILJIL.getValue();
        if (iViewPagerComponentAbility != null) {
            iViewPagerComponentAbility.Bv0(new C0P4Y(this, 6));
        }
        C19252910Tv.LIZIZ.LIZLLL().LJIJI().LJLLI().LJLJJI(new AwS588S0100000_9(this, 498));
        C19EG c19egLIZ = C724240Sb0.LIZ(this);
        if (c19egLIZ != null) {
            Hox.LLJILJIL.LIZ(c19egLIZ).vQ2(new InterfaceC1583770rJf() { // from class: X.0Nqs
                @Override // X.InterfaceC1583770rJf
                public final void A4(String str, String str2) {
                    Aweme awemeGo;
                    if (Intrinsics.LJFF(str2, "For You") && (awemeGo = this.LL.Go()) != null) {
                        this.LL.Jo(awemeGo);
                    }
                }
            });
        }
        ((AbstractC848400XPy) C0XQ7.LJFF()).LJJIFFI(new InterfaceC427710Gpt() { // from class: X.0NC3
            @Override // X.InterfaceC427710Gpt
            public final void LLLLLLZZ(int i, User user, User user2) {
                if (i == 4 && user2 != null && user != null && !Intrinsics.LJFF(user2.getUid(), user.getUid())) {
                    HandlerHook.viewPostDelay(this.LL.LJJIJL(), new ARunnableS109S0100000_9(this.LL, 149), 150L);
                }
            }
        });
        this.LLJILJILJ = (TuxTextView) C520680KbS.LIZ(R.id.qod, view);
        this.LLJILLL = (TuxTextView) C520680KbS.LIZ(R.id.qoe, view);
        this.LLJJ = (LinearLayout) C520680KbS.LIZ(R.id.qo_, view);
        this.LLJJI = (LinearLayout) C520680KbS.LIZ(R.id.qoc, view);
        this.LLJJIJI = new C616140OEq(this.LLJILJILJ, this.LLJILLL, LJJIJL(), this.LLJJ, this.LLJJI, new AwS553S0100000_9(this, 1686));
        LinearLayout linearLayout = this.LLJJ;
        if (linearLayout != null) {
            C786410Ut5.R7(linearLayout, new ACListenerS144S0100000_9(this, 93));
        }
        this.LLJJIII = new C589950NBx(view, new AwS623S0100000_9(this, 189));
    }
}
