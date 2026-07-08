package com.ss.android.ugc.feed.platform.panel.plugindownloading;

import X.AbstractC1604290rql;
import X.C01GW;
import X.C0RUJ;
import X.C0SZ8;
import X.C0X35;
import X.C1389300mG0;
import X.C14LC;
import X.C1566140qrE;
import X.C1602160rnK;
import X.C1604180rqa;
import X.C1604190rqb;
import X.C1604210rqd;
import X.C1604220rqe;
import X.C1604230rqf;
import X.C1604240rqg;
import X.C1604270rqj;
import X.C1604320rqo;
import X.C1618440sDa;
import X.C1620830sHR;
import X.C1954807lC;
import X.C19EG;
import X.C2188811AlT;
import X.C266000Abe;
import X.C299750Boz;
import X.C303460Buy;
import X.C309690CBz;
import X.C418440Gaw;
import X.C452501pT;
import X.C486860J7k;
import X.C630740Ooa;
import X.C707370Rot;
import X.C786410Ut5;
import X.C814420VxA;
import X.EnumC452301pR;
import X.InterfaceC1554640qYg;
import X.InterfaceC1565950qqv;
import X.InterfaceC1604310rqn;
import X.InterfaceC494301wD;
import Y.AObserverS226S0100000_24;
import Y.ARunnableS124S0100000_24;
import android.content.Context;
import android.view.View;
import android.view.ViewStub;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import com.bytedance.ies.ugc.aweme.plugin.service.IPluginService;
import com.ss.android.ugc.aweme.arch.widgets.base.NextLiveData;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.homepage.api.interaction.ScrollSwitchStateManager;
import com.ss.android.ugc.feed.platform.panel.BasePanelUIComponent;
import com.ss.android.ugc.feed.platform.panel.downloadbar.IDownloadBarAbility;
import com.ss.android.ugc.feed.platform.panel.viewpager.IViewPagerComponentAbility;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.AwS140S0110000_24;
import kotlin.jvm.internal.AwS568S0100000_24;

/* JADX INFO: loaded from: classes25.dex */
public final class PluginDownloadBarComponent extends BasePanelUIComponent implements IPluginDownloadBarAbility, InterfaceC1604310rqn, C0RUJ, InterfaceC1554640qYg {
    public C1604320rqo LLJIJIL;
    public ViewStub LLJILJIL;
    public final C01GW LLJILJILJ;
    public final C01GW LLJILLL;
    public final AtomicBoolean LLJJ;
    public final C01GW LLJJI;

    @Override // X.C0RUJ
    public final void Ie() {
    }

    @Override // X.InterfaceC1604310rqn
    public final void LLJJJJ() {
        Ho(false);
        C1604240rqg.LIZ.getClass();
        C1604240rqg.LIZJ = null;
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

    @Override // com.ss.android.ugc.feed.platform.panel.plugindownloading.IPluginDownloadBarAbility
    public final void ia() {
    }

    @Override // X.InterfaceC1604310rqn
    public final void k1() {
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
        if (str.hashCode() != 1779858594) {
            return null;
        }
        return this;
    }

    public final void Go() {
        C1604240rqg.LIZ.getClass();
        AbstractC1604290rql abstractC1604290rql = C1604240rqg.LIZJ;
        if (abstractC1604290rql != null) {
            Jo(abstractC1604290rql);
        } else {
            Ho(false);
        }
    }

    @Override // com.ss.android.ugc.feed.platform.panel.plugindownloading.IPluginDownloadBarAbility
    public final void dc0() {
        if (this.LLJJ.get()) {
            Ho(false);
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("hidden by Video Download, skip by already hiding visibility=");
        C1604320rqo c1604320rqo = this.LLJIJIL;
        sbLIZ.append(c1604320rqo != null ? Integer.valueOf(c1604320rqo.getVisibility()) : null);
        C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // com.ss.android.ugc.feed.platform.panel.plugindownloading.IPluginDownloadBarAbility
    public final void show() {
        C1604240rqg.LIZ.getClass();
        if (C1604240rqg.LIZJ == null || this.LLJJ.get()) {
            return;
        }
        Ho(true);
    }

    public PluginDownloadBarComponent() {
        C01GW c01gwLIZIZ;
        C01GW c01gwLIZIZ2;
        if (C299750Boz.LIZ()) {
            C630740Ooa c630740Ooa = new C630740Ooa(EnumC452301pR.PUBLICATION, new AwS568S0100000_24((InterfaceC1565950qqv) this, 1567), null);
            C1566140qrE.LIZJ(this, c630740Ooa);
            c01gwLIZIZ = c630740Ooa;
        } else {
            c01gwLIZIZ = C452501pT.LIZIZ(new AwS140S0110000_24(false, (InterfaceC1565950qqv) this, 31));
        }
        this.LLJILJILJ = c01gwLIZIZ;
        if (C299750Boz.LIZ()) {
            C630740Ooa c630740Ooa2 = new C630740Ooa(EnumC452301pR.PUBLICATION, new AwS568S0100000_24((InterfaceC1565950qqv) this, 1568), null);
            C1566140qrE.LIZJ(this, c630740Ooa2);
            c01gwLIZIZ2 = c630740Ooa2;
        } else {
            c01gwLIZIZ2 = C452501pT.LIZIZ(new AwS140S0110000_24(false, (InterfaceC1565950qqv) this, 32));
        }
        this.LLJILLL = c01gwLIZIZ2;
        this.LLJJ = new AtomicBoolean(false);
        this.LLJJI = C452501pT.LIZIZ(new AwS568S0100000_24(this, 1569));
    }

    @Override // com.ss.android.ugc.feed.platform.panel.BasePanelUIComponent, com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onDestroy() {
        super.onDestroy();
        C1604320rqo.LLJI.remove(this);
    }

    @Override // X.AbstractC738140SxQ
    public final void onPause() {
        super.onPause();
        Go();
    }

    @Override // X.AbstractC738140SxQ
    public final void onResume() {
        super.onResume();
        Go();
    }

    @Override // X.InterfaceC1604310rqn
    public final void LLJJJJLIIL() {
        LLJJJJ();
    }

    public final void Ho(boolean z) {
        C0SZ8 c0sz8LJLIL;
        int iLIZIZ;
        C0SZ8 c0sz8LJLIL2;
        IDownloadBarAbility iDownloadBarAbility;
        if (z && (iDownloadBarAbility = (IDownloadBarAbility) this.LLJILLL.getValue()) != null && iDownloadBarAbility.isShowing()) {
            return;
        }
        if (C303460Buy.LIZIZ() && z) {
            C0X35.LJIILL(new ARunnableS124S0100000_24(this, 100));
        }
        C1604320rqo c1604320rqo = this.LLJIJIL;
        if (c1604320rqo != null) {
            if (z) {
                this.LLJJ.set(true);
                int visibility = c1604320rqo.getVisibility();
                c1604320rqo.setVisibility(0);
                C1602160rnK.LIZIZ(visibility, 0, c1604320rqo);
                c1604320rqo.measure(0, 0);
                int measuredHeight = c1604320rqo.getMeasuredHeight();
                if (C1389300mG0.LJIILL(getPanelContext())) {
                    iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(60));
                } else {
                    C1618440sDa c1618440sDa = C1618440sDa.LIZIZ;
                    if (c1618440sDa.LJJIIJ().LJJIIJZLJL(getPanelContext().LJ)) {
                        iLIZIZ = c1618440sDa.LJJIIJ().LJIIL(c1604320rqo.getContext());
                    } else {
                        boolean z2 = C14LC.LJIIIZ;
                        C309690CBz.LIZ.getClass();
                        iLIZIZ = C14LC.LIZIZ();
                    }
                }
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
                layoutParams.gravity = 80;
                layoutParams.bottomMargin = iLIZIZ;
                C786410Ut5.e6(c1604320rqo, layoutParams);
                c1604320rqo.requestLayout();
                IViewPagerComponentAbility iViewPagerComponentAbility = (IViewPagerComponentAbility) this.LLJJI.getValue();
                if (iViewPagerComponentAbility != null && (c0sz8LJLIL2 = iViewPagerComponentAbility.LJLIL()) != null) {
                    c0sz8LJLIL2.Z(measuredHeight, true);
                }
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("showPluginDownloadProgressBar(true) barHeight=");
                sbLIZ.append(measuredHeight);
                C2188811AlT.LIZIZ(sbLIZ);
                return;
            }
            this.LLJJ.set(false);
            int visibility2 = c1604320rqo.getVisibility();
            c1604320rqo.setVisibility(8);
            C1602160rnK.LIZIZ(visibility2, 8, c1604320rqo);
            IViewPagerComponentAbility iViewPagerComponentAbility2 = (IViewPagerComponentAbility) this.LLJJI.getValue();
            if (iViewPagerComponentAbility2 != null && (c0sz8LJLIL = iViewPagerComponentAbility2.LJLIL()) != null) {
                c0sz8LJLIL.Z(c1604320rqo.getHeight(), false);
            }
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("showPluginDownloadProgressBar(false) it.height=");
            sbLIZ2.append(c1604320rqo.getHeight());
            C2188811AlT.LIZIZ(sbLIZ2);
        }
    }

    public final void Jo(AbstractC1604290rql abstractC1604290rql) {
        if (C1389300mG0.LJIJJ(getPanelContext())) {
            if (abstractC1604290rql instanceof C1604220rqe) {
                if (this.LLJIJIL != null) {
                    C1604320rqo.LJ();
                }
                C1604320rqo c1604320rqo = this.LLJIJIL;
                if (c1604320rqo != null) {
                    c1604320rqo.LJFF(0, ((C1604220rqe) abstractC1604290rql).LIZIZ);
                }
                Ho(true);
                return;
            }
            if (abstractC1604290rql instanceof C1604210rqd) {
                if (this.LLJIJIL != null) {
                    C1604320rqo.LJ();
                }
                C1604320rqo c1604320rqo2 = this.LLJIJIL;
                if (c1604320rqo2 != null) {
                    C1604210rqd c1604210rqd = (C1604210rqd) abstractC1604290rql;
                    c1604320rqo2.LJFF(c1604210rqd.LIZIZ, c1604210rqd.LIZJ);
                }
                Ho(true);
                return;
            }
            if (abstractC1604290rql instanceof C1604230rqf) {
                if (this.LLJIJIL != null) {
                    C1604320rqo.LJ();
                }
                C1604320rqo c1604320rqo3 = this.LLJIJIL;
                if (c1604320rqo3 != null) {
                    c1604320rqo3.LIZIZ(((C1604230rqf) abstractC1604290rql).LIZIZ);
                }
                Ho(true);
                return;
            }
            if (abstractC1604290rql instanceof C1604180rqa) {
                if (this.LLJIJIL != null) {
                    C1604320rqo.LJ();
                }
                C1604320rqo c1604320rqo4 = this.LLJIJIL;
                if (c1604320rqo4 != null) {
                    C1604180rqa c1604180rqa = (C1604180rqa) abstractC1604290rql;
                    c1604320rqo4.LIZ(c1604180rqa.LIZIZ, c1604180rqa.LIZJ, c1604180rqa.LIZLLL);
                }
                Ho(true);
                return;
            }
            throw new C1954807lC();
        }
        C1389300mG0.LJII(getPanelContext());
    }

    /* JADX WARN: Type inference failed for: r1v5, types: [X.0rqc] */
    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        NextLiveData nextLiveDataLIZ;
        super.onViewCreated(view);
        C1604240rqg c1604240rqg = C1604240rqg.LIZ;
        C19EG c19eg = (C19EG) getContext();
        c1604240rqg.getClass();
        if (C1604240rqg.LIZLLL.LIZ(false, true)) {
            IPluginService iPluginService = (IPluginService) PluggableExtentionKt.pluggableSpi$default(IPluginService.class, false, false, false, 14, null);
            if (iPluginService != null) {
                iPluginService.LJJIJ(new C1604190rqb(C786410Ut5.P3(c19eg)));
            }
            if (((Boolean) C266000Abe.LIZ.getValue()).booleanValue()) {
                ScrollSwitchStateManager scrollSwitchStateManagerLIZIZ = C486860J7k.LIZIZ(c19eg);
                scrollSwitchStateManagerLIZIZ.LLJJ.observe(c19eg, new AObserverS226S0100000_24(c19eg, 19));
                final Context contextP3 = C786410Ut5.P3(c19eg);
                C1604270rqj.LIZ = new C1604190rqb(contextP3) { // from class: X.0rqc
                    @Override // X.C1604190rqb
                    public final List LJIIIIZZ() {
                        C1604250rqh.LIZ.getClass();
                        LinkedList linkedList = new LinkedList(C1604250rqh.LIZJ);
                        ArrayList arrayList = new ArrayList();
                        for (Object obj : linkedList) {
                            C1604240rqg.LIZ.getClass();
                            if (C1604240rqg.LIZIZ.contains(obj)) {
                                arrayList.add(obj);
                            }
                        }
                        return C13LP.LLIIII(arrayList);
                    }
                };
            }
        }
        if (C303460Buy.LIZIZ()) {
            this.LLJILJIL = (ViewStub) view.findViewById(R.id.g4e);
        }
        if (this.LLJILJIL == null) {
            this.LLJIJIL = (C1604320rqo) view.findViewById(R.id.g4d);
        }
        C1604320rqo.LLJI.add(this);
        Fragment fragment = getPanelContext().LJ;
        if (fragment != null) {
            synchronized (new Object() { // from class: X.0rqk
            }) {
                nextLiveDataLIZ = C707370Rot.LIZ.LIZ("PLUGIN_DOWNLOAD_STATUS");
            }
            nextLiveDataLIZ.observe(fragment, new AObserverS226S0100000_24(this, 18));
        }
        Go();
        IViewPagerComponentAbility iViewPagerComponentAbility = (IViewPagerComponentAbility) this.LLJJI.getValue();
        if (iViewPagerComponentAbility != null) {
            iViewPagerComponentAbility.Bv0(new C1620830sHR(this, 10));
        }
    }
}
