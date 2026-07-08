package com.ss.android.ugc.aweme.socialavatar.mixstudio.iddropdown;

import X.C01GW;
import X.C05YD;
import X.C0HOM;
import X.C0HQF;
import X.C13LE;
import X.C15438062q;
import X.C20600815jK;
import X.C2217381BqS;
import X.C418440Gaw;
import X.C440440HOw;
import X.C441150HRp;
import X.C443120HZe;
import X.C452501pT;
import X.C462960IDm;
import X.C786410Ut5;
import X.C814420VxA;
import X.InterfaceC1891350zJl;
import X.InterfaceC2217461Bqa;
import X.ViewOnAttachStateChangeListenerC20604515jv;
import Y.ARunnableS75S0200000_6;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.LifecycleOwner;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.powerlist.PowerCell;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AFwS192S0000000_6;

/* JADX INFO: loaded from: classes7.dex */
public final class IdTabPowerCell extends PowerCell<C0HQF> {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLILZIL;
    public final C01GW LL = C452501pT.LIZIZ(AFwS192S0000000_6.get$arr$(261));
    public final C462960IDm LLILLJJLI = new C462960IDm(this, 4);
    public final RecyclerView.RecycledViewPool LLILLL = new RecyclerView.RecycledViewPool();
    public ViewOnAttachStateChangeListenerC20604515jv LLILZ;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(IdTabPowerCell.class, "control", "getControl()Lcom/ss/android/ugc/aweme/socialavatar/mixstudio/iddropdown/MixStudioIdDropdownView$IdDropdownControl;", 0);
        C13LE.LIZ.getClass();
        LLILZIL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl) {
        C0HQF c0hqf = (C0HQF) interfaceC1891350zJl;
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv = this.LLILZ;
        if (viewOnAttachStateChangeListenerC20604515jv != null) {
            LifecycleOwner currentLifecycleOwner = getCurrentLifecycleOwner();
            if (currentLifecycleOwner != null) {
                viewOnAttachStateChangeListenerC20604515jv.setLifecycleOwner(currentLifecycleOwner);
            }
            viewOnAttachStateChangeListenerC20604515jv.setRecycledViewPool(this.LLILLL);
            ViewGroup.LayoutParams layoutParams = viewOnAttachStateChangeListenerC20604515jv.getLayoutParams();
            layoutParams.height = c0hqf.LL.LIZIZ.size() * (C814420VxA.LIZIZ(C418440Gaw.LIZIZ(52)) + C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12)));
            C786410Ut5.E6(viewOnAttachStateChangeListenerC20604515jv, layoutParams);
            C20600815jK<InterfaceC1891350zJl> state = viewOnAttachStateChangeListenerC20604515jv.getState();
            if (state != null) {
                List<C443120HZe<Integer, String, C05YD<C0HOM<? extends C440440HOw>>>> list = c0hqf.LL.LIZIZ;
                ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
                for (C443120HZe<Integer, String, C05YD<C0HOM<? extends C440440HOw>>> c443120HZe : list) {
                    arrayList.add(new C441150HRp(c443120HZe.getFirst().intValue(), c443120HZe.getSecond(), c443120HZe.getThird()));
                }
                state.LJIIZILJ(arrayList, new ARunnableS75S0200000_6(this, viewOnAttachStateChangeListenerC20604515jv, 52));
            }
        }
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv = new ViewOnAttachStateChangeListenerC20604515jv(viewGroup.getContext(), null);
        viewOnAttachStateChangeListenerC20604515jv.setLayoutManager(new LinearLayoutManager(viewOnAttachStateChangeListenerC20604515jv.getContext(), 1, false));
        viewOnAttachStateChangeListenerC20604515jv.LJIILJJIL(IdPowerCell.class);
        C786410Ut5.E6(viewOnAttachStateChangeListenerC20604515jv, new RecyclerView.LayoutParams(-1, -1));
        this.LLILZ = viewOnAttachStateChangeListenerC20604515jv;
        return viewOnAttachStateChangeListenerC20604515jv;
    }
}
