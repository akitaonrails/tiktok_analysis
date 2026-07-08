package com.ss.android.ugc.feed.platform.cell;

import X.C01GW;
import X.C03H5;
import X.C0R8L;
import X.C0RD6;
import X.C452501pT;
import X.C690870R8b;
import X.C786410Ut5;
import X.C799570VYd;
import X.EnumC700430Rdh;
import X.InterfaceC1294060jmO;
import X.InterfaceC1587906Jp;
import X.InterfaceC691660RBc;
import X.InterfaceC712990Rxx;
import Y.ARunnableS111S0100000_11;
import android.os.Looper;
import android.view.View;
import androidx.lifecycle.Observer;
import com.bytedance.assem.arch.reused.ReusedUIContentAssem;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.feed.platform.panel.base.EventCenter;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public abstract class BaseCellContentComponent<RECEIVER extends C03H5> extends ReusedUIContentAssem<RECEIVER> implements IComponentStatus, InterfaceC712990Rxx<VideoItemParams>, InterfaceC691660RBc {
    public final /* synthetic */ BaseCellComponentExtension LLJJJJ = new BaseCellComponentExtension();
    public final C01GW LLJJJJJIL = C452501pT.LIZIZ(new C0R8L(this));

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

    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: cp, reason: merged with bridge method [inline-methods] */
    public boolean ur(VideoItemParams videoItemParams) {
        return true;
    }

    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: dp, reason: merged with bridge method [inline-methods] */
    public void vr(VideoItemParams videoItemParams) {
    }

    public void eventInit(C0RD6 c0rd6) {
    }

    @Override // X.AbstractC738140SxQ
    public boolean get_assem_onParent_set_isOnParentSetEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    @InterfaceC1294060jmO
    public void onDestroyView() {
    }

    public void p(int i) {
    }

    @Override // com.ss.android.ugc.feed.platform.cell.IComponentStatus
    public final void setComponentClickStatusExperimental(View view, EnumC700430Rdh enumC700430Rdh) {
        this.LLJJJJ.setComponentClickStatusExperimental(view, enumC700430Rdh);
    }

    public void unBind() {
    }

    @Override // com.ss.android.ugc.feed.platform.cell.IComponentStatus
    public final void vn(View view, EnumC700430Rdh enumC700430Rdh) {
        this.LLJJJJ.vn(view, enumC700430Rdh);
    }

    public void wr() {
    }

    @Override // X.InterfaceC691660RBc
    public final C690870R8b jm() {
        return (C690870R8b) this.LLJJJJJIL.getValue();
    }

    @Override // X.InterfaceC691700RBg
    public final EventCenter getEventCenter() {
        return jm().LJFF;
    }

    @Override // X.AbstractC738140SxQ
    public void onParentSet() {
        super.onParentSet();
        if (!Intrinsics.LJFF(C786410Ut5.u3(), Looper.getMainLooper().getThread())) {
            C786410Ut5.LJJZZIII(C799570VYd.LIZJ(), new ARunnableS111S0100000_11(this, 70));
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

    @Override // X.InterfaceC712990Rxx
    public final void sr(InterfaceC1587906Jp interfaceC1587906Jp, List list) {
        up(interfaceC1587906Jp);
    }
}
