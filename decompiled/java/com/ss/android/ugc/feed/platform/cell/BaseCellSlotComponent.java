package com.ss.android.ugc.feed.platform.cell;

import X.AbstractC616030OEf;
import X.C01GW;
import X.C03H5;
import X.C07CT;
import X.C0CNO;
import X.C0RD6;
import X.C0RDG;
import X.C0RDJ;
import X.C0RJE;
import X.C0RJN;
import X.C0RK5;
import X.C0RK6;
import X.C0RK7;
import X.C0ROU;
import X.C2189821An6;
import X.C2487409ou;
import X.C299640Boo;
import X.C452501pT;
import X.C637920P0k;
import X.C690870R8b;
import X.C697530RXr;
import X.C699980Rcy;
import X.C700100RdA;
import X.C700310RdV;
import X.C715390S4j;
import X.C715400S4k;
import X.C723850SaN;
import X.C786410Ut5;
import X.C799570VYd;
import X.EnumC700430Rdh;
import X.InterfaceC1294060jmO;
import X.InterfaceC691660RBc;
import X.InterfaceC701660Rfg;
import X.InterfaceC712990Rxx;
import X.RunnableC514801zW;
import Y.ARunnableS111S0100000_11;
import android.os.Looper;
import android.view.View;
import androidx.lifecycle.Observer;
import com.bytedance.assem.arch.reused.ReusedAssem;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.ss.android.ugc.aweme.feed.assem.desc.FeedModeBaseProtocol;
import com.ss.android.ugc.aweme.feed.assem.story.FeedStoryTagAssem;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.feed.model.banner.FcpUiTemplate;
import com.ss.android.ugc.feed.platform.panel.base.EventCenter;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS160S1100000_11;
import kotlin.jvm.internal.AwS18S1110000_11;
import kotlin.jvm.internal.AwS555S0100000_11;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public abstract class BaseCellSlotComponent<RECEIVER extends C03H5> extends ReusedUISlotAssem<RECEIVER> implements IComponentStatus, InterfaceC712990Rxx<VideoItemParams>, InterfaceC691660RBc, FeedModeBaseProtocol, C0RK6, InterfaceC701660Rfg, C0ROU {
    public final /* synthetic */ BaseCellComponentExtension LLJJLIIIJLLLLLLLZ = new BaseCellComponentExtension();
    public final /* synthetic */ C0RK5 LLJL = new C0RK5();
    public final /* synthetic */ C0RDG LLJLIL = new C0RDG();
    public final /* synthetic */ C0RK7 LLJLILLLLZIIL = new C0RK7();
    public final C01GW LLJLL = C452501pT.LIZIZ(new C0RDJ(this));

    @Override // X.InterfaceC701660Rfg
    public final void F0() {
        this.LLJLIL.getClass();
    }

    public void H() {
    }

    public void J1(int i, Aweme aweme) {
    }

    public void LJL() {
    }

    public void LJLIIIL(int i) {
    }

    public void LJLLLL() {
    }

    public void LLLI(int i) {
    }

    public void T6(int i, Aweme aweme) {
    }

    public void eventInit(C0RD6 c0rd6) {
    }

    @Override // X.AbstractC738140SxQ
    public boolean get_assem_onParent_set_isOnParentSetEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    @Override // X.InterfaceC701660Rfg
    public final void il() {
        this.LLJLIL.LL = true;
    }

    @InterfaceC1294060jmO
    public void onDestroyView() {
    }

    @Override // X.InterfaceC691660RBc
    public final void p(int i) {
    }

    @Override // com.ss.android.ugc.feed.platform.cell.IComponentStatus
    public final void setComponentClickStatusExperimental(View view, EnumC700430Rdh enumC700430Rdh) {
        this.LLJJLIIIJLLLLLLLZ.setComponentClickStatusExperimental(view, enumC700430Rdh);
    }

    public boolean tp() {
        return this instanceof FeedStoryTagAssem;
    }

    public void unBind() {
    }

    @Override // com.ss.android.ugc.feed.platform.cell.IComponentStatus
    public final void vn(View view, EnumC700430Rdh enumC700430Rdh) {
        this.LLJJLIIIJLLLLLLLZ.vn(view, enumC700430Rdh);
    }

    public void wr() {
    }

    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: zp, reason: merged with bridge method [inline-methods] */
    public void vr(VideoItemParams videoItemParams) {
    }

    @Override // X.InterfaceC701660Rfg
    public final String G2() {
        return this.LLJLIL.LLILLL;
    }

    @Override // X.InterfaceC701660Rfg
    public final boolean ej() {
        return this.LLJLIL.LL;
    }

    public C690870R8b jm() {
        return (C690870R8b) this.LLJLL.getValue();
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem, com.bytedance.assem.arch.reused.ReusedAssem
    public void mo() {
        if (this.LLJL.LL) {
            Fo(new AwS555S0100000_11((BaseCellSlotComponent) this, 1168));
        }
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem, com.bytedance.assem.arch.reused.ReusedAssem
    public void oo() {
        if (this.LLJL.LL) {
            Fo(new AwS555S0100000_11((BaseCellSlotComponent) this, 1169));
        } else {
            if (sp()) {
                return;
            }
            super.oo();
        }
    }

    @Override // X.InterfaceC691700RBg
    public final EventCenter getEventCenter() {
        return jm().LJFF;
    }

    @Override // X.AbstractC738140SxQ
    public void onParentSet() {
        super.onParentSet();
        if (!Intrinsics.LJFF(C786410Ut5.u3(), Looper.getMainLooper().getThread())) {
            C786410Ut5.LJJZZIII(C799570VYd.LIZJ(), new ARunnableS111S0100000_11(this, 72));
            return;
        }
        C0RD6 c0rd6 = new C0RD6();
        eventInit(c0rd6);
        if (!c0rd6.LIZJ().isEmpty()) {
            Iterator<T> it2 = c0rd6.LIZJ().entrySet().iterator();
            while (it2.hasNext()) {
                Map.Entry entry = (Map.Entry) it2.next();
                EventCenter eventCenter = jm().LJFF;
                if (eventCenter != null) {
                    eventCenter.yQ2((String) entry.getKey(), (Observer) entry.getValue(), true);
                }
            }
        }
    }

    public boolean sp() {
        return C0RJE.LIZIZ(getParent(), false);
    }

    public final void yp() {
        super.oo();
    }

    public final void Ap(boolean z) {
        AbstractC616030OEf<?> abstractC616030OEf = this.LLJLIL.LLILZIL;
        if (abstractC616030OEf != null) {
            abstractC616030OEf.LJ(false);
        }
    }

    @Override // X.InterfaceC701660Rfg
    public final void Bl(AwS160S1100000_11 awS160S1100000_11) {
        this.LLJLIL.LLILZ = awS160S1100000_11;
    }

    @Override // X.InterfaceC701660Rfg
    public final void Jk(FcpUiTemplate fcpUiTemplate) {
        this.LLJLIL.LLILZLL = fcpUiTemplate;
    }

    @Override // X.InterfaceC701660Rfg
    public final void Ka(String str) {
        this.LLJLIL.LLILLL = str;
    }

    @Override // X.InterfaceC701660Rfg
    public final void ga(AbstractC616030OEf<?> abstractC616030OEf) {
        this.LLJLIL.LLILZIL = abstractC616030OEf;
    }

    @Override // X.InterfaceC701660Rfg
    public final void l4(C700310RdV c700310RdV) {
        this.LLJLIL.LLILLJJLI = c700310RdV;
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public void onViewCreated(View view) {
        String str;
        C0RJN c0rjnLIZIZ;
        final View viewLJJIJL = LJJIJL();
        if (C786410Ut5.u3() == Looper.getMainLooper().getThread()) {
            C786410Ut5.LJLLLLLL(0, viewLJJIJL);
        } else if (Intrinsics.LJFF(C697530RXr.LIZ().enableContainerViewShow, Boolean.TRUE)) {
            C2487409ou.LIZJ(new Runnable() { // from class: X.00oF
                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("BaseCellComponentKt@1f5a.containerViewShow$1");
                    try {
                        C786410Ut5.LJLLLLLL(0, viewLJJIJL);
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("BaseCellComponentKt@1f5a.containerViewShow$1");
                }
            });
        } else {
            C637920P0k.LIZ(viewLJJIJL, new RunnableC514801zW(viewLJJIJL, 142));
        }
        final View viewLJJIJL2 = LJJIJL();
        final String simpleName = getClass().getSimpleName();
        if (Intrinsics.LJFF(C786410Ut5.u3(), Looper.getMainLooper().getThread())) {
            viewLJJIJL2.setTag(C700100RdA.LJIILIIL, simpleName);
        } else {
            C786410Ut5.LJJZZIII(C799570VYd.LIZJ(), new Runnable() { // from class: X.0R98
                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("BaseCellComponentKt@1f5a.setTagContainerView$$inlined$postOnUIThread$1");
                    try {
                        viewLJJIJL2.setTag(C700100RdA.LJIILIIL, simpleName);
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("BaseCellComponentKt@1f5a.setTagContainerView$$inlined$postOnUIThread$1");
                }
            });
        }
        Object objLJFF = C723850SaN.LJFF(this, "category");
        C2189821An6 c2189821An6 = null;
        if (objLJFF instanceof String) {
            str = (String) objLJFF;
        } else {
            str = null;
        }
        if ((Intrinsics.LJFF(str, "bottom_banner") || Intrinsics.LJFF(str, "genre_tag")) && !C715400S4k.LIZIZ() && !tp()) {
            C690870R8b c690870R8bJm = jm();
            if (c690870R8bJm != null && (c0rjnLIZIZ = c690870R8bJm.LIZIZ()) != null) {
                c2189821An6 = c0rjnLIZIZ.LIZJ;
            }
            C0CNO.LIZLLL(0L, new AwS18S1110000_11(str, (String) C07CT.LIZ(c2189821An6), (boolean) this, 0));
            C715390S4j.LIZ(view);
        }
    }

    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: op, reason: merged with bridge method [inline-methods] */
    public boolean ur(VideoItemParams videoItemParams) {
        Function0<Boolean> function0;
        if (C0RJE.LIZIZ(getParent(), false)) {
            return ((ReusedAssem) getParent()).LLILLJJLI;
        }
        C0RDG c0rdg = this.LLJLIL;
        if (c0rdg.LL) {
            Function2<? super String, ? super C699980Rcy, Boolean> function2 = c0rdg.LLILLJJLI;
            if (function2 == null || !function2.invoke(c0rdg.LLILLL, null).booleanValue()) {
                return false;
            }
            if (C299640Boo.LIZ() && (function0 = this.LLJLIL.LLILZ) != null && !function0.invoke().booleanValue()) {
                return false;
            }
            return true;
        }
        return true;
    }

    @Override // X.C0ROU
    public final void pl(boolean z) {
        this.LLJLILLLLZIIL.LL = z;
    }

    @Override // X.C0RK6
    public final void sn(boolean z) {
        this.LLJL.LL = z;
    }

    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: up, reason: merged with bridge method [inline-methods] */
    public void sr(VideoItemParams videoItemParams, List<? extends Object> list) {
        up(videoItemParams);
    }
}
