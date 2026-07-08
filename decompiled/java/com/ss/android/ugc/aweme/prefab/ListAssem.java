package com.ss.android.ugc.aweme.prefab;

import X.C01GW;
import X.C0P6P;
import X.C1722300uv6;
import X.C1749280vcc;
import X.C19EG;
import X.C20603715jn;
import X.C2217381BqS;
import X.C418440Gaw;
import X.C452501pT;
import X.C627300Oj2;
import X.C724240Sb0;
import X.C786410Ut5;
import X.C814420VxA;
import X.ViewOnAttachStateChangeListenerC20604515jv;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.assem.arch.dynamic.DynamicAssem;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.ext_power_list.AssemListViewModel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS218S0300000_9;
import kotlin.jvm.internal.AwS545S0100000_1;
import kotlin.jvm.internal.AwS553S0100000_9;
import kotlin.jvm.internal.AwS588S0100000_9;

/* JADX INFO: loaded from: classes10.dex */
public abstract class ListAssem extends DynamicAssem {
    public ViewOnAttachStateChangeListenerC20604515jv LLJJI;
    public C1749280vcc LLJJIII;
    public final C01GW LLJJIJI = C452501pT.LIZIZ(new AwS553S0100000_9(this, 1446));
    public final C01GW LLJJIJIIJIL = C452501pT.LIZIZ(new AwS553S0100000_9(this, 1447));

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public int Co() {
        return 0;
    }

    public abstract AssemListViewModel<?, ?, ?> tp();

    public final C1722300uv6 lp() {
        return (C1722300uv6) this.LLJJIJI.getValue();
    }

    public final ViewOnAttachStateChangeListenerC20604515jv mp() {
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv = this.LLJJI;
        if (viewOnAttachStateChangeListenerC20604515jv != null) {
            return viewOnAttachStateChangeListenerC20604515jv;
        }
        return null;
    }

    public C20603715jn op() {
        C20603715jn c20603715jn = new C20603715jn();
        c20603715jn.LIZJ = true;
        c20603715jn.LIZ = 5;
        return c20603715jn;
    }

    public final C1749280vcc sp() {
        C1749280vcc c1749280vcc = this.LLJJIII;
        if (c1749280vcc != null) {
            return c1749280vcc;
        }
        return null;
    }

    public void up() {
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jvMp = mp();
        viewOnAttachStateChangeListenerC20604515jvMp.setListConfig(op());
        tp().setListState(viewOnAttachStateChangeListenerC20604515jvMp.getState());
        viewOnAttachStateChangeListenerC20604515jvMp.LJIIL(tp().getConfig());
    }

    @Override // com.bytedance.assem.arch.view.UISlotAssem, com.bytedance.assem.arch.core.UIAssem
    public final void xo() {
        Context context = getContext();
        if (context == null) {
            return;
        }
        FrameLayout frameLayout = new FrameLayout(context);
        C786410Ut5.a6(frameLayout, new ViewGroup.LayoutParams(-1, -1));
        C1749280vcc c1749280vcc = new C1749280vcc(context, null, 6);
        C786410Ut5.U6(c1749280vcc, new ViewGroup.LayoutParams(-1, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(500))));
        this.LLJJIII = c1749280vcc;
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv = new ViewOnAttachStateChangeListenerC20604515jv(context, null);
        C786410Ut5.E6(viewOnAttachStateChangeListenerC20604515jv, new ViewGroup.LayoutParams(-1, -1));
        this.LLJJI = viewOnAttachStateChangeListenerC20604515jv;
        frameLayout.addView(sp());
        frameLayout.addView(mp());
        Zo(frameLayout);
        super.xo();
    }

    @Override // com.bytedance.assem.arch.dynamic.DynamicAssem, com.bytedance.assem.arch.core.UIAssem
    public void onViewCreated(View view) {
        LifecycleOwner viewLifecycleOwner;
        up();
        C786410Ut5.LLF(8, mp());
        View viewTd = C786410Ut5.Td(C786410Ut5.ne(mp().getContext()), R.layout.ean, mp(), false);
        C786410Ut5.LJLLLLLL(8, viewTd);
        mp().LIZLLL(viewTd);
        C627300Oj2 c627300Oj2 = new C627300Oj2(mp(), new C0P6P() { // from class: X.0Oj0
            @Override // X.C0P6P
            public final void LJJIFFI() {
                this.LL.tp().manualListRetry(EnumC323450Cm7.Next);
            }
        });
        AwS553S0100000_9 awS553S0100000_9 = new AwS553S0100000_9(this, 35);
        AwS545S0100000_1 awS545S0100000_1 = new AwS545S0100000_1(viewTd, 11);
        AwS553S0100000_9 awS553S0100000_92 = new AwS553S0100000_9(viewTd, 36);
        C19EG c19egLIZ = C724240Sb0.LIZ(this);
        if (c19egLIZ != null) {
            Fragment fragmentLJI = C724240Sb0.LJI(this);
            if (fragmentLJI != null) {
                viewLifecycleOwner = fragmentLJI.getViewLifecycleOwner();
            } else {
                viewLifecycleOwner = null;
            }
            NetworkHelper networkHelper = new NetworkHelper(awS553S0100000_9, null, awS545S0100000_1, awS553S0100000_92, c19egLIZ, null, 1, viewLifecycleOwner, 162);
            AssemViewModel.asyncSubscribe$default(tp(), new C2217381BqS() { // from class: X.0Oj1
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return ((InterfaceC636270OxV) obj).getLoadMoreState();
                }
            }, null, new AwS218S0300000_9(networkHelper, this, c627300Oj2, 2), new AwS553S0100000_9(networkHelper, 34), new AwS588S0100000_9(networkHelper, 28), 2, null);
            return;
        }
        "Required value was null.".toString();
        throw new IllegalArgumentException("Required value was null.");
    }
}
