package com.ss.android.ugc.feed.platform.panel.downloadbar;

import X.C01GW;
import X.C0RUJ;
import X.C0SZ8;
import X.C0T1R;
import X.C0X35;
import X.C1376270luz;
import X.C1389300mG0;
import X.C14LC;
import X.C1559900qhA;
import X.C1559910qhB;
import X.C1566140qrE;
import X.C1602160rnK;
import X.C1604330rqp;
import X.C1618440sDa;
import X.C20684815ws;
import X.C2344009Gk;
import X.C299750Boz;
import X.C303460Buy;
import X.C309690CBz;
import X.C418440Gaw;
import X.C452501pT;
import X.C630740Ooa;
import X.C707370Rot;
import X.C786410Ut5;
import X.C814420VxA;
import X.EnumC452301pR;
import X.InterfaceC1554640qYg;
import X.InterfaceC1565950qqv;
import X.InterfaceC1604170rqZ;
import X.InterfaceC1616070s9l;
import X.InterfaceC494301wD;
import Y.ARunnableS124S0100000_24;
import android.view.View;
import android.view.ViewStub;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import com.ss.android.ugc.aweme.arch.widgets.base.NextLiveData;
import com.ss.android.ugc.aweme.feed.assem.ability.IFeedPanelPlatformAbility;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.feed.platform.panel.BasePanelUIComponent;
import com.ss.android.ugc.feed.platform.panel.downloadbar.DownloadBarComponent;
import com.ss.android.ugc.feed.platform.panel.plugindownloading.IPluginDownloadBarAbility;
import com.ss.android.ugc.feed.platform.panel.viewpager.IViewPagerComponentAbility;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS140S0110000_24;
import kotlin.jvm.internal.AwS425S0200000_24;
import kotlin.jvm.internal.AwS568S0100000_24;

/* JADX INFO: loaded from: classes25.dex */
public final class DownloadBarComponent extends BasePanelUIComponent implements IDownloadBarAbility, InterfaceC1604170rqZ, C0RUJ, InterfaceC1554640qYg {
    public C1604330rqp LLJIJIL;
    public ViewStub LLJILJIL;
    public AwS425S0200000_24 LLJILJILJ;
    public boolean LLJILLL;
    public boolean LLJJ;
    public int LLJJI = -1;
    public final C01GW LLJJIII;
    public final C01GW LLJJIJI;
    public final C01GW LLJJIJIIJIL;

    public final void Ho() {
        No(false);
        int i = this.LLJJI;
        if (i == 1 || i == 2) {
            this.LLJJ = true;
        } else {
            if (i != 4 || this.LLJIJIL == null) {
                return;
            }
            C1604330rqp.LJ();
        }
    }

    @Override // X.C0RUJ
    public final void Ie() {
    }

    @Override // X.InterfaceC1604170rqZ
    public final void LLJJJJ() {
        No(false);
    }

    @Override // X.C0RUJ
    public final String T1() {
        return "panel_download_bar";
    }

    @Override // X.C0RUJ
    public final void a6() {
    }

    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onPause_isOnPauseEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onResume_isOnResumeEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    @Override // X.C0RUJ
    public final void lj() {
    }

    @Override // X.C0RUJ
    public final boolean m8() {
        return false;
    }

    @Override // X.InterfaceC1554640qYg
    public final InterfaceC494301wD provideAbility(String str) {
        if (str.hashCode() != -934552109) {
            return null;
        }
        return this;
    }

    public static void Lo() {
        C1376270luz.LIZ.getClass();
        Aweme aweme = C1376270luz.LJI;
        if (aweme != null) {
            C2344009Gk c2344009Gk = new C2344009Gk();
            c2344009Gk.LJIIIIZZ("group_id", aweme.getAid());
            c2344009Gk.LJIIIIZZ("author_id", AwemeExtKt.getAuthorUid(aweme));
            C20684815ws.LJIILLIIL("download_failure_window_show", c2344009Gk.LIZ);
        }
    }

    public final IViewPagerComponentAbility Go() {
        return (IViewPagerComponentAbility) this.LLJJIJIIJIL.getValue();
    }

    @Override // com.ss.android.ugc.feed.platform.panel.downloadbar.IDownloadBarAbility
    public final void ia() {
        if (this.LLJJ) {
            No(true);
        }
        this.LLJJ = false;
        this.LLJILLL = false;
        AwS425S0200000_24 awS425S0200000_24 = this.LLJILJILJ;
        if (awS425S0200000_24 != null) {
            awS425S0200000_24.invoke();
        }
        this.LLJILJILJ = null;
    }

    @Override // com.ss.android.ugc.feed.platform.panel.downloadbar.IDownloadBarAbility
    public final boolean isShowing() {
        C1604330rqp c1604330rqp = this.LLJIJIL;
        return c1604330rqp != null && c1604330rqp.getVisibility() == 0 && c1604330rqp.getAlpha() > 0.0f;
    }

    public DownloadBarComponent() {
        C01GW c01gwLIZIZ;
        C01GW c01gwLIZIZ2;
        if (C299750Boz.LIZ()) {
            C630740Ooa c630740Ooa = new C630740Ooa(EnumC452301pR.PUBLICATION, new AwS568S0100000_24((InterfaceC1565950qqv) this, 1531), null);
            C1566140qrE.LIZJ(this, c630740Ooa);
            c01gwLIZIZ = c630740Ooa;
        } else {
            c01gwLIZIZ = C452501pT.LIZIZ(new C1559900qhA(false, this));
        }
        this.LLJJIII = c01gwLIZIZ;
        if (C299750Boz.LIZ()) {
            C630740Ooa c630740Ooa2 = new C630740Ooa(EnumC452301pR.PUBLICATION, new AwS568S0100000_24((InterfaceC1565950qqv) this, 1532), null);
            C1566140qrE.LIZJ(this, c630740Ooa2);
            c01gwLIZIZ2 = c630740Ooa2;
        } else {
            c01gwLIZIZ2 = C452501pT.LIZIZ(new AwS140S0110000_24(false, (InterfaceC1565950qqv) this, 22));
        }
        this.LLJJIJI = c01gwLIZIZ2;
        this.LLJJIJIIJIL = C452501pT.LIZIZ(new C1559910qhB(this));
    }

    @Override // com.ss.android.ugc.feed.platform.panel.BasePanelUIComponent, com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onDestroy() {
        super.onDestroy();
        C1604330rqp.LLJILJIL.remove(this);
    }

    @Override // X.AbstractC738140SxQ
    public final void onPause() {
        super.onPause();
        IViewPagerComponentAbility iViewPagerComponentAbilityGo = Go();
        Jo(iViewPagerComponentAbilityGo != null ? iViewPagerComponentAbilityGo.LJIIIIZZ() : null);
    }

    @Override // X.AbstractC738140SxQ
    public final void onResume() {
        super.onResume();
        IViewPagerComponentAbility iViewPagerComponentAbilityGo = Go();
        Jo(iViewPagerComponentAbilityGo != null ? iViewPagerComponentAbilityGo.LJIIIIZZ() : null);
    }

    public final void Jo(Aweme aweme) {
        boolean z;
        if (aweme != null && C0T1R.LJ(aweme)) {
            No(false);
            return;
        }
        if (C1376270luz.LIZIZ()) {
            C1376270luz.LIZ.getClass();
            if (!C1376270luz.LJIILJJIL) {
                No(true);
                C1604330rqp c1604330rqp = this.LLJIJIL;
                if (c1604330rqp == null) {
                    return;
                }
                c1604330rqp.LJIIIIZZ(C1604330rqp.LLJILLL);
                return;
            }
        }
        if (this.LLJIJIL != null && C1604330rqp.LLJILJILJ.hasMessages(1)) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            No(true);
            C1604330rqp c1604330rqp2 = this.LLJIJIL;
            if (c1604330rqp2 == null) {
                return;
            }
            C1604330rqp.LIZIZ(c1604330rqp2, c1604330rqp2.getIsDownloadingPhoto(), c1604330rqp2.getSuccessDownloadMediaNumber(), null, 12);
            return;
        }
        if (this.LLJIJIL != null && C1604330rqp.LLJILJILJ.hasMessages(2) && C1376270luz.LJIILL) {
            No(true);
            C1604330rqp c1604330rqp3 = this.LLJIJIL;
            if (c1604330rqp3 == null) {
                return;
            }
            C1604330rqp.LIZ(c1604330rqp3, c1604330rqp3.getIsDownloadingPhoto(), null, 14);
            if (c1604330rqp3.getIsDownloadingPhoto()) {
                return;
            }
            Lo();
            return;
        }
        No(false);
    }

    public final void No(boolean z) {
        C0SZ8 c0sz8LJLIL;
        int iLIZIZ;
        C0SZ8 c0sz8LJLIL2;
        if (C303460Buy.LIZIZ() && z) {
            C0X35.LJIILL(new ARunnableS124S0100000_24(this, 142));
        }
        C1604330rqp c1604330rqp = this.LLJIJIL;
        if (c1604330rqp != null) {
            if (z) {
                int visibility = c1604330rqp.getVisibility();
                c1604330rqp.setVisibility(0);
                C1602160rnK.LIZIZ(visibility, 0, c1604330rqp);
                c1604330rqp.measure(0, 0);
                int measuredHeight = c1604330rqp.getMeasuredHeight();
                if (C1389300mG0.LJIILL(getPanelContext())) {
                    iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(60));
                } else {
                    C1618440sDa c1618440sDa = C1618440sDa.LIZIZ;
                    if (c1618440sDa.LJJIIJ().LJJIIJZLJL(getPanelContext().LJ)) {
                        iLIZIZ = c1618440sDa.LJJIIJ().LJIIL(c1604330rqp.getContext());
                    } else {
                        boolean z2 = C14LC.LJIIIZ;
                        C309690CBz.LIZ.getClass();
                        iLIZIZ = C14LC.LIZIZ();
                    }
                }
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
                layoutParams.gravity = 80;
                layoutParams.bottomMargin = iLIZIZ;
                C786410Ut5.e6(c1604330rqp, layoutParams);
                c1604330rqp.requestLayout();
                IViewPagerComponentAbility iViewPagerComponentAbilityGo = Go();
                if (iViewPagerComponentAbilityGo != null && (c0sz8LJLIL2 = iViewPagerComponentAbilityGo.LJLIL()) != null) {
                    c0sz8LJLIL2.LLJJ(measuredHeight, true);
                }
                IPluginDownloadBarAbility iPluginDownloadBarAbility = (IPluginDownloadBarAbility) this.LLJJIJI.getValue();
                if (iPluginDownloadBarAbility != null) {
                    iPluginDownloadBarAbility.dc0();
                    return;
                }
                return;
            }
            int visibility2 = c1604330rqp.getVisibility();
            c1604330rqp.setVisibility(8);
            C1602160rnK.LIZIZ(visibility2, 8, c1604330rqp);
            IFeedPanelPlatformAbility iFeedPanelPlatformAbility = (IFeedPanelPlatformAbility) this.LLJJIII.getValue();
            if (iFeedPanelPlatformAbility != null) {
                iFeedPanelPlatformAbility.sP();
            }
            IViewPagerComponentAbility iViewPagerComponentAbilityGo2 = Go();
            if (iViewPagerComponentAbilityGo2 != null && (c0sz8LJLIL = iViewPagerComponentAbilityGo2.LJLIL()) != null) {
                c0sz8LJLIL.LLJJ(c1604330rqp.getHeight(), false);
            }
            IPluginDownloadBarAbility iPluginDownloadBarAbility2 = (IPluginDownloadBarAbility) this.LLJJIJI.getValue();
            if (iPluginDownloadBarAbility2 == null) {
                return;
            }
            iPluginDownloadBarAbility2.show();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:127:0x0172  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Oo(X.C0SU5 r11) {
        /*
            Method dump skipped, instruction units count: 418
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.feed.platform.panel.downloadbar.DownloadBarComponent.Oo(X.0SU5):void");
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        Aweme awemeLJIIIIZZ;
        super.onViewCreated(view);
        if (C303460Buy.LIZIZ()) {
            this.LLJILJIL = (ViewStub) view.findViewById(R.id.g4t);
        }
        if (this.LLJILJIL == null) {
            C1604330rqp c1604330rqp = (C1604330rqp) view.findViewById(R.id.g4s);
            this.LLJIJIL = c1604330rqp;
            if (c1604330rqp != null) {
                c1604330rqp.setVideoDownloadClickListener(this);
            }
        }
        C1604330rqp.LLJILJIL.add(this);
        Fragment fragment = getPanelContext().LJ;
        if (fragment != null) {
            C707370Rot.LIZ.LIZ("video_download_status").observe(fragment, new Observer() { // from class: X.0rqW
                @Override // androidx.lifecycle.Observer
                public final void onChanged(Object obj) {
                    C0SU5 c0su5 = (C0SU5) obj;
                    DownloadBarComponent downloadBarComponent = this.LL;
                    downloadBarComponent.getClass();
                    C0X35.LJIILL(new ARunnableS124S0100000_24(downloadBarComponent, 142));
                    if (c0su5 != null) {
                        DownloadBarComponent downloadBarComponent2 = this.LL;
                        int i = C0SU5.LIZIZ;
                        downloadBarComponent2.LLJJI = i;
                        if (downloadBarComponent2.LLJILLL && (i == 5 || i == 4)) {
                            downloadBarComponent2.LLJILJILJ = new AwS425S0200000_24(downloadBarComponent2, c0su5, 83);
                        } else {
                            downloadBarComponent2.Oo(c0su5);
                        }
                    }
                }
            });
        }
        IViewPagerComponentAbility iViewPagerComponentAbilityGo = Go();
        if (iViewPagerComponentAbilityGo != null) {
            awemeLJIIIIZZ = iViewPagerComponentAbilityGo.LJIIIIZZ();
        } else {
            awemeLJIIIIZZ = null;
        }
        Jo(awemeLJIIIIZZ);
        IViewPagerComponentAbility iViewPagerComponentAbilityGo2 = Go();
        if (iViewPagerComponentAbilityGo2 != null) {
            iViewPagerComponentAbilityGo2.Bv0(new InterfaceC1616070s9l() { // from class: X.0rqX
                @Override // X.InterfaceC1616160s9u
                public final /* synthetic */ void onBeforePageChange() {
                }

                @Override // X.InterfaceC1616070s9l, X.InterfaceC469360Ias
                public final void onPageScrollStateChanged(int i) {
                }

                @Override // X.InterfaceC1616070s9l, X.InterfaceC469360Ias
                public final void onPageScrolled(int i, float f, int i2) {
                }

                @Override // X.InterfaceC1616070s9l
                public final void onPageScrolledEnd(int i, float f, int i2) {
                }

                @Override // X.InterfaceC1616070s9l
                public final void onPageSelected(int i, boolean z) {
                }

                @Override // X.InterfaceC1616070s9l
                public final void onPageUnSelected(C0SZ8 c0sz8) {
                }

                @Override // X.InterfaceC1616160s9u
                public final /* synthetic */ void onScrollToItemStart(int i) {
                }

                @Override // X.InterfaceC1616160s9u
                public final /* synthetic */ void onScrollToItemStart(int i, boolean z) {
                }

                @Override // X.InterfaceC1616070s9l, X.InterfaceC469360Ias
                public final void onPageSelected(int i) {
                    Aweme awemeLJIIIIZZ2;
                    DownloadBarComponent downloadBarComponent = this.LL;
                    IViewPagerComponentAbility iViewPagerComponentAbilityGo3 = downloadBarComponent.Go();
                    if (iViewPagerComponentAbilityGo3 != null) {
                        awemeLJIIIIZZ2 = iViewPagerComponentAbilityGo3.LJIIIIZZ();
                    } else {
                        awemeLJIIIIZZ2 = null;
                    }
                    downloadBarComponent.Jo(awemeLJIIIIZZ2);
                }
            });
        }
    }

    @Override // X.InterfaceC1604170rqZ
    public final void zc(boolean z) {
        if (z) {
            NextLiveData<Object> nextLiveDataLIZIZ = C707370Rot.LIZ.LIZIZ("photo_click_try");
            C1376270luz.LIZ.getClass();
            nextLiveDataLIZIZ.postValue(C1376270luz.LJI);
        } else {
            No(false);
            NextLiveData<Object> nextLiveDataLIZIZ2 = C707370Rot.LIZ.LIZIZ("video_click_retry");
            C1376270luz.LIZ.getClass();
            nextLiveDataLIZIZ2.postValue(C1376270luz.LJI);
        }
    }
}
