package com.ss.android.ugc.aweme.im.sharepanel.impl.editshare.assem;

import X.AbstractC738140SxQ;
import X.C01GW;
import X.C0DXR;
import X.C1220000hqw;
import X.C13LE;
import X.C1554610qYd;
import X.C1558520qew;
import X.C1559260qg8;
import X.C1697810uHb;
import X.C19507611Tu;
import X.C19719912Dl;
import X.C2217381BqS;
import X.C418440Gaw;
import X.C451610HnL;
import X.C452070Ho5;
import X.C452501pT;
import X.C723590SZx;
import X.C723700Sa8;
import X.C723850SaN;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C736820SvI;
import X.C736950SvV;
import X.C786410Ut5;
import X.C814420VxA;
import X.EnumC20618915mF;
import X.EnumC452301pR;
import X.InterfaceC665370Q7z;
import X.ViewOnAttachStateChangeListenerC20604515jv;
import Y.AsS38S0200000_31;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.assem.arch.view.UISlotAssem;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.im.sharepanel.impl.editshare.item.EditShareSelectCell;
import com.ss.android.ugc.aweme.im.sharepanel.impl.editshare.util.EditShareProtocol;
import com.ss.android.ugc.aweme.im.sharepanel.impl.editshare.vm.ContactSelectVM;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS276S0000000_31;
import kotlin.jvm.internal.AwS368S0200000_2;
import kotlin.jvm.internal.AwS546S0100000_2;
import kotlin.jvm.internal.AwS560S0100000_16;
import kotlin.jvm.internal.AwS575S0100000_31;
import kotlin.jvm.internal.AwS645S0100000_31;
import kotlin.jvm.internal.AwS680S0100000_31;

/* JADX INFO: loaded from: classes32.dex */
public final class VerticalContactListAssem extends UISlotAssem implements EditShareProtocol {
    public final C1559260qg8 LLJJI = new C1559260qg8(new C723590SZx(this, C19507611Tu.class, null), checkSupervisorPrepared());
    public ViewOnAttachStateChangeListenerC20604515jv LLJJIII;
    public final C736950SvV LLJJIJI;
    public final C01GW LLJJIJIIJIL;
    public final C01GW LLJJIJIL;
    public final C01GW LLJJJ;
    public final C01GW LLJJJIL;
    public final C01GW LLJJJJ;

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int Co() {
        return R.layout.co9;
    }

    @Override // com.ss.android.ugc.aweme.im.sharepanel.impl.editshare.util.EditShareProtocol
    public final void Uc1() {
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv = this.LLJJIII;
        if (viewOnAttachStateChangeListenerC20604515jv != null) {
            viewOnAttachStateChangeListenerC20604515jv.scrollToPosition(0);
            C723850SaN.LJII(this, C13LE.LIZ(EditShareTopOptionAssem.class), null);
            viewOnAttachStateChangeListenerC20604515jv.LJIJJ();
            viewOnAttachStateChangeListenerC20604515jv.removeItemDecoration((C0DXR) this.LLJJJJ.getValue());
        }
    }

    public VerticalContactListAssem() {
        AwS575S0100000_31 awS575S0100000_31 = new AwS575S0100000_31(this, 724);
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(ContactSelectVM.class);
        AFwS276S0000000_31 aFwS276S0000000_31 = AFwS276S0000000_31.get$arr$(143);
        this.LLJJIJI = new C736950SvV(c19719912DlLIZ, new AwS560S0100000_16(awS575S0100000_31, (Function0<Unit>) 313), new C452070Ho5(), C724750Sbp.LJII(this), C1220000hqw.LIZ(this), aFwS276S0000000_31, new AwS575S0100000_31((AbstractC738140SxQ) this, 725), new C451610HnL(this, true, true), new C723700Sa8(this));
        EnumC452301pR enumC452301pR = EnumC452301pR.NONE;
        this.LLJJIJIIJIL = C452501pT.LIZ(enumC452301pR, new AwS546S0100000_2(this, 586));
        this.LLJJIJIL = C452501pT.LIZ(enumC452301pR, new AwS546S0100000_2(this, 585));
        this.LLJJJ = C452501pT.LIZ(enumC452301pR, new AwS546S0100000_2(this, 583));
        this.LLJJJIL = C452501pT.LIZ(enumC452301pR, new AwS546S0100000_2(this, 584));
        this.LLJJJJ = C452501pT.LIZ(enumC452301pR, new AwS560S0100000_16(this, 314));
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv;
        int i;
        super.onViewCreated(view);
        final InterfaceC665370Q7z interfaceC665370Q7zLJIIL = C1558520qew.LJIIL(this);
        C1554610qYd.LIZJ(interfaceC665370Q7zLJIIL, EditShareProtocol.class, C1697810uHb.LJIILJJIL(this));
        Lifecycle lifecycle = getLifecycle();
        if (lifecycle != null) {
            lifecycle.addObserver(new LifecycleEventObserver() { // from class: com.ss.android.ugc.aweme.im.sharepanel.impl.editshare.assem.VerticalContactListAssem$onViewCreated$$inlined$registerProtocol$1
                @Override // androidx.lifecycle.LifecycleEventObserver
                public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
                    if (event == Lifecycle.Event.ON_DESTROY) {
                        C1554610qYd.LIZLLL(interfaceC665370Q7zLJIIL, EditShareProtocol.class, this);
                    }
                }
            });
        }
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv2 = null;
        if ((view instanceof ViewOnAttachStateChangeListenerC20604515jv) && (viewOnAttachStateChangeListenerC20604515jv = (ViewOnAttachStateChangeListenerC20604515jv) view) != null) {
            viewOnAttachStateChangeListenerC20604515jv.addItemDecoration((C0DXR) this.LLJJJJ.getValue());
            Context context = viewOnAttachStateChangeListenerC20604515jv.getContext();
            if (context != null) {
                LinearLayout linearLayout = new LinearLayout(context);
                C786410Ut5.d6(linearLayout, new ViewGroup.LayoutParams(-1, -2));
                ViewGroup.LayoutParams layoutParams = viewOnAttachStateChangeListenerC20604515jv.getLayoutParams();
                if (layoutParams != null) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                    if (((C19507611Tu) this.LLJJI.getValue()).LL == EnumC20618915mF.SEARCH) {
                        i = 4;
                    } else {
                        i = 12;
                    }
                    int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(i)));
                    marginLayoutParams.setMarginStart(iLIZIZ);
                    marginLayoutParams.setMarginEnd(iLIZIZ);
                    C786410Ut5.W5(viewOnAttachStateChangeListenerC20604515jv, marginLayoutParams);
                    C723850SaN.LIZLLL(this, new AwS368S0200000_2(this, linearLayout, 46));
                    viewOnAttachStateChangeListenerC20604515jv.LJ(0, linearLayout);
                    viewOnAttachStateChangeListenerC20604515jv.LJIILJJIL(EditShareSelectCell.class);
                    viewOnAttachStateChangeListenerC20604515jv.addOnScrollListener(new AsS38S0200000_31(view, this, 0));
                    viewOnAttachStateChangeListenerC20604515jv.setItemAnimator(null);
                    viewOnAttachStateChangeListenerC20604515jv2 = viewOnAttachStateChangeListenerC20604515jv;
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
                }
            } else {
                "Required value was null.".toString();
                throw new IllegalArgumentException("Required value was null.");
            }
        }
        this.LLJJIII = viewOnAttachStateChangeListenerC20604515jv2;
        C736680Sv4.LJIIIIZZ(this, (AssemViewModel) this.LLJJIJI.getValue(), new C2217381BqS() { // from class: X.15ls
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Integer.valueOf(((C20617115lx) obj).LLILZ);
            }
        }, C736820SvI.LJ(), new AwS645S0100000_31(this, 40), 4);
        C736680Sv4.LJIIIZ(this, (AssemViewModel) this.LLJJIJI.getValue(), new C2217381BqS() { // from class: X.15lw
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C20617115lx) obj).LL;
            }
        }, new C2217381BqS() { // from class: X.15lt
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Boolean.valueOf(((C20617115lx) obj).LLILZLL);
            }
        }, null, new AwS680S0100000_31(this, 7), 12);
        C736680Sv4.LJIIIIZZ(this, (AssemViewModel) this.LLJJIJI.getValue(), new C2217381BqS() { // from class: X.15lu
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Boolean.valueOf(((C20617115lx) obj).LLILLL);
            }
        }, C736820SvI.LJ(), new AwS645S0100000_31(this, 41), 4);
    }
}
