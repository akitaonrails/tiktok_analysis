package com.ss.android.ugc.feed.platform.cell;

import X.AbstractC616030OEf;
import X.C01GW;
import X.C03H5;
import X.C0RD6;
import X.C0RDA;
import X.C0RDG;
import X.C452501pT;
import X.C690870R8b;
import X.C699980Rcy;
import X.C700310RdV;
import X.C786410Ut5;
import X.C799570VYd;
import X.EnumC700430Rdh;
import X.InterfaceC1294060jmO;
import X.InterfaceC1587906Jp;
import X.InterfaceC691660RBc;
import X.InterfaceC701660Rfg;
import X.InterfaceC712990Rxx;
import Y.ARunnableS111S0100000_11;
import android.os.Looper;
import android.view.View;
import androidx.lifecycle.Observer;
import com.bytedance.assem.arch.reused.ReusedAssem;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.feed.model.banner.FcpUiTemplate;
import com.ss.android.ugc.feed.platform.panel.base.EventCenter;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS160S1100000_11;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public abstract class BaseCellLogicComponent<RECEIVER extends C03H5> extends ReusedAssem<RECEIVER> implements InterfaceC712990Rxx<VideoItemParams>, InterfaceC691660RBc, IComponentStatus, InterfaceC701660Rfg {
    public final /* synthetic */ BaseCellComponentExtension LLJJ = new BaseCellComponentExtension();
    public final /* synthetic */ C0RDG LLJJI = new C0RDG();
    public final C01GW LLJJIII = C452501pT.LIZIZ(new C0RDA(this));

    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: Ao, reason: merged with bridge method [inline-methods] */
    public void vr(VideoItemParams videoItemParams) {
    }

    @Override // X.InterfaceC701660Rfg
    public final void F0() {
        this.LLJJI.getClass();
    }

    @Override // X.InterfaceC691660RBc
    public final void H() {
    }

    public void J1(int i, Aweme aweme) {
    }

    public void LJL() {
    }

    public void LJLIIIL(int i) {
    }

    @Override // X.InterfaceC691660RBc
    public final void LJLLLL() {
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
        this.LLJJI.LL = true;
    }

    @Override // X.InterfaceC691660RBc
    @InterfaceC1294060jmO
    public final void onDestroyView() {
    }

    public void p(int i) {
    }

    @Override // com.ss.android.ugc.feed.platform.cell.IComponentStatus
    public final void setComponentClickStatusExperimental(View view, EnumC700430Rdh enumC700430Rdh) {
        this.LLJJ.setComponentClickStatusExperimental(view, enumC700430Rdh);
    }

    public void unBind() {
    }

    @Override // com.ss.android.ugc.feed.platform.cell.IComponentStatus
    public final void vn(View view, EnumC700430Rdh enumC700430Rdh) {
        this.LLJJ.vn(view, enumC700430Rdh);
    }

    public void wr() {
    }

    @Override // X.InterfaceC701660Rfg
    public final String G2() {
        return this.LLJJI.LLILLL;
    }

    @Override // X.InterfaceC701660Rfg
    public final boolean ej() {
        return this.LLJJI.LL;
    }

    @Override // X.InterfaceC691660RBc
    public final C690870R8b jm() {
        return (C690870R8b) this.LLJJIII.getValue();
    }

    @Override // X.InterfaceC691700RBg
    public final EventCenter getEventCenter() {
        return jm().LJFF;
    }

    @Override // X.AbstractC738140SxQ
    public void onParentSet() {
        super.onParentSet();
        if (!Intrinsics.LJFF(C786410Ut5.u3(), Looper.getMainLooper().getThread())) {
            C786410Ut5.LJJZZIII(C799570VYd.LIZJ(), new ARunnableS111S0100000_11(this, 71));
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

    @Override // X.InterfaceC701660Rfg
    public final void Bl(AwS160S1100000_11 awS160S1100000_11) {
        this.LLJJI.LLILZ = awS160S1100000_11;
    }

    @Override // X.InterfaceC701660Rfg
    public final void Jk(FcpUiTemplate fcpUiTemplate) {
        this.LLJJI.LLILZLL = fcpUiTemplate;
    }

    @Override // X.InterfaceC701660Rfg
    public final void Ka(String str) {
        this.LLJJI.LLILLL = str;
    }

    @Override // X.InterfaceC701660Rfg
    public final void ga(AbstractC616030OEf<?> abstractC616030OEf) {
        this.LLJJI.LLILZIL = abstractC616030OEf;
    }

    @Override // X.InterfaceC701660Rfg
    public final void l4(C700310RdV c700310RdV) {
        this.LLJJI.LLILLJJLI = c700310RdV;
    }

    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: zo, reason: merged with bridge method [inline-methods] */
    public boolean ur(VideoItemParams videoItemParams) {
        C0RDG c0rdg = this.LLJJI;
        if (c0rdg.LL) {
            Function2<? super String, ? super C699980Rcy, Boolean> function2 = c0rdg.LLILLJJLI;
            if (function2 != null) {
                return function2.invoke(c0rdg.LLILLL, null).booleanValue();
            }
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC712990Rxx
    public final void sr(InterfaceC1587906Jp interfaceC1587906Jp, List list) {
        up(interfaceC1587906Jp);
    }
}
