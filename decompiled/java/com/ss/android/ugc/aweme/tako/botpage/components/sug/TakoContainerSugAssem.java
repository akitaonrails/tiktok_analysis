package com.ss.android.ugc.aweme.tako.botpage.components.sug;

import X.C01GW;
import X.C0DXR;
import X.C0Q4Y;
import X.C12NV;
import X.C1558520qew;
import X.C1697810uHb;
import X.C20600815jK;
import X.C452501pT;
import X.C786410Ut5;
import X.InterfaceC1587906Jp;
import X.InterfaceC1857870yRl;
import X.InterfaceC1891350zJl;
import X.InterfaceC712990Rxx;
import X.ViewOnAttachStateChangeListenerC20604515jv;
import Y.AAListenerS339S0100000_29;
import android.animation.ObjectAnimator;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.zhiliaoapp.musically.R;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AwS573S0100000_29;
import kotlin.jvm.internal.AwS643S0100000_29;

/* JADX INFO: loaded from: classes30.dex */
public final class TakoContainerSugAssem extends ReusedUISlotAssem<TakoContainerSugAssem> implements InterfaceC712990Rxx<InterfaceC1857870yRl> {
    public ViewOnAttachStateChangeListenerC20604515jv LLJJLIIIJLLLLLLLZ;
    public ObjectAnimator LLJLILLLLZIIL;
    public final C01GW LLJL = C452501pT.LIZIZ(new AwS573S0100000_29(this, 497));
    public final C01GW LLJLIL = C452501pT.LIZIZ(new AwS573S0100000_29(this, 498));
    public final C01GW LLJLL = C452501pT.LIZIZ(new AwS573S0100000_29(this, 499));
    public final C01GW LLJLLIL = C452501pT.LIZIZ(new AwS573S0100000_29(this, 500));

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int Oo() {
        return R.layout.fkg;
    }

    @Override // X.InterfaceC712990Rxx
    public final void unBind() {
    }

    @Override // X.InterfaceC712990Rxx
    public final void wr() {
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final void cp() {
        ObjectAnimator objectAnimator = this.LLJLILLLLZIIL;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv = (ViewOnAttachStateChangeListenerC20604515jv) view.findViewById(R.id.rn0);
        this.LLJJLIIIJLLLLLLLZ = viewOnAttachStateChangeListenerC20604515jv;
        if (viewOnAttachStateChangeListenerC20604515jv != null) {
            viewOnAttachStateChangeListenerC20604515jv.setLayoutManager(new LinearLayoutManager(viewOnAttachStateChangeListenerC20604515jv.getContext(), 1, false));
            viewOnAttachStateChangeListenerC20604515jv.setAnimation(null);
            viewOnAttachStateChangeListenerC20604515jv.setItemAnimator(null);
            viewOnAttachStateChangeListenerC20604515jv.getState().LIZLLL = C0Q4Y.BUFFER;
            viewOnAttachStateChangeListenerC20604515jv.LJIILJJIL(TakoContainerSugItemCell.class);
            viewOnAttachStateChangeListenerC20604515jv.addItemDecoration(new C0DXR() { // from class: X.10wR
                @Override // X.C0DXR
                public final void LIZIZ(Rect rect, View view2, RecyclerView recyclerView, C21673919s1 c21673919s1) {
                    if (recyclerView.getChildAdapterPosition(view2) == 0) {
                        rect.top = 0;
                    } else {
                        rect.top = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(10));
                    }
                }
            });
        }
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, "alpha", 1.0f, 0.0f);
        objectAnimatorOfFloat.setDuration(200L);
        objectAnimatorOfFloat.addListener(new AAListenerS339S0100000_29(this, 6));
        this.LLJLILLLLZIIL = objectAnimatorOfFloat;
    }

    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final void up(InterfaceC1857870yRl interfaceC1857870yRl) {
        int i;
        float f;
        C20600815jK<InterfaceC1891350zJl> state;
        C20600815jK<InterfaceC1891350zJl> state2;
        InterfaceC1857870yRl interfaceC1857870yRl2 = interfaceC1857870yRl;
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv = this.LLJJLIIIJLLLLLLLZ;
        if (viewOnAttachStateChangeListenerC20604515jv != null && (state2 = viewOnAttachStateChangeListenerC20604515jv.getState()) != null) {
            state2.LJFF(null);
        }
        Iterator<String> it2 = interfaceC1857870yRl2.LJIL().LLILLJJLI.sugList.iterator();
        int i2 = 0;
        while (it2.hasNext()) {
            it2.next();
            int i3 = i2 + 1;
            if (i2 >= 0) {
                ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv2 = this.LLJJLIIIJLLLLLLLZ;
                if (viewOnAttachStateChangeListenerC20604515jv2 != null && (state = viewOnAttachStateChangeListenerC20604515jv2.getState()) != null) {
                    C20600815jK.LIZJ(state, new C12NV(interfaceC1857870yRl2.LJIL(), i2, new AwS643S0100000_29(this, 63), new AwS643S0100000_29(this, 64), C1558520qew.LJIIL(this)));
                }
                i2 = i3;
            } else {
                C1697810uHb.LJIJI();
                throw null;
            }
        }
        View viewLJJIJL = LJJIJL();
        if ((!interfaceC1857870yRl2.LJIL().LLILLJJLI.sugList.isEmpty()) && !interfaceC1857870yRl2.LJIL().LLILLJJLI.isClick && interfaceC1857870yRl2.LJIL().LLILLJJLI.sugShowType == 2) {
            i = 0;
        } else {
            i = 8;
        }
        C786410Ut5.LJLLLLLL(i, viewLJJIJL);
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv3 = this.LLJJLIIIJLLLLLLLZ;
        if (viewOnAttachStateChangeListenerC20604515jv3 != null) {
            if (LJJIJL().getVisibility() == 0) {
                f = 1.0f;
            } else {
                f = 0.0f;
            }
            C786410Ut5.s5(viewOnAttachStateChangeListenerC20604515jv3, f);
        }
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ boolean ur(InterfaceC1857870yRl interfaceC1857870yRl) {
        return true;
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ void vr(InterfaceC1857870yRl interfaceC1857870yRl) {
    }

    @Override // X.InterfaceC712990Rxx
    public final void sr(InterfaceC1587906Jp interfaceC1587906Jp, List list) {
        up(interfaceC1587906Jp);
    }
}
