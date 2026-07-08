package com.ss.android.ugc.aweme.search.arch.v2.protocol.card.components.top1.slidingview.ui;

import X.C07E5;
import X.C0Q4Y;
import X.C1196320hEk;
import X.C1558520qew;
import X.C1559260qg8;
import X.C339190DRl;
import X.C346010DhP;
import X.C346270Dhp;
import X.C660830Pw1;
import X.C723580SZw;
import X.EnumC039900Cf;
import X.InterfaceC1587906Jp;
import X.InterfaceC1631620sYq;
import X.InterfaceC655050Pmh;
import X.InterfaceC712990Rxx;
import X.ViewOnAttachStateChangeListenerC20604515jv;
import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.ss.android.ugc.aweme.search.arch.v2.protocol.card.parser.SearchCardScope;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes5.dex */
public final class SearchTop1CardSlidingViewAssem extends ReusedUISlotAssem<SearchTop1CardSlidingViewAssem> implements InterfaceC712990Rxx<InterfaceC655050Pmh>, Top1CardSlidingViewAbility {
    public ViewOnAttachStateChangeListenerC20604515jv LLJJLIIIJLLLLLLLZ;
    public final C1559260qg8 LLJL = new C1559260qg8(new C723580SZw(this, C346010DhP.class, null), checkSupervisorPrepared());

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int Oo() {
        return R.layout.ev_;
    }

    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onParent_set_isOnParentSetEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    @Override // X.AbstractC738140SxQ
    public final void onParentSet() throws IllegalAccessException {
        super.onParentSet();
        C1558520qew.LIZLLL(this);
        C1558520qew.LJI(this, SearchCardScope.class, this, Top1CardSlidingViewAbility.class, null, null);
    }

    @Override // X.InterfaceC712990Rxx
    public final void unBind() {
    }

    @Override // X.InterfaceC712990Rxx
    public final void wr() {
    }

    @Override // com.ss.android.ugc.aweme.search.arch.v2.protocol.card.components.top1.slidingview.ui.Top1CardSlidingViewAbility
    public final void LX1(C660830Pw1 c660830Pw1) {
        boolean z;
        InterfaceC1631620sYq<? super Boolean, ? super String, ? super Integer, Unit> interfaceC1631620sYq;
        c660830Pw1.getClass();
        if (EnumC039900Cf.HIGHLIGHT_CERULEAN == null) {
            z = true;
        } else {
            z = false;
        }
        C346010DhP c346010DhP = (C346010DhP) this.LLJL.getValue();
        if (c346010DhP != null && (interfaceC1631620sYq = c346010DhP.LLILLL) != null) {
            Boolean boolValueOf = Boolean.valueOf(z);
            c660830Pw1.getClass();
            c660830Pw1.getClass();
            interfaceC1631620sYq.invoke(boolValueOf, null, 0);
        }
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final Context So(Context context) {
        if (C07E5.LIZ()) {
            return LJJIJL().getContext();
        }
        return context;
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv = (ViewOnAttachStateChangeListenerC20604515jv) view.findViewById(R.id.vkk);
        this.LLJJLIIIJLLLLLLLZ = viewOnAttachStateChangeListenerC20604515jv;
        if (viewOnAttachStateChangeListenerC20604515jv == null) {
            viewOnAttachStateChangeListenerC20604515jv = null;
        }
        C1196320hEk.LIZIZ(viewOnAttachStateChangeListenerC20604515jv, C1558520qew.LJIIL(this));
        viewOnAttachStateChangeListenerC20604515jv.scrollToPosition(0);
        C339190DRl.LIZLLL(viewOnAttachStateChangeListenerC20604515jv);
        viewOnAttachStateChangeListenerC20604515jv.setTag(R.id.rnd, C1558520qew.LJIIL(this));
        viewOnAttachStateChangeListenerC20604515jv.getState().LIZLLL = C0Q4Y.BUFFER;
        viewOnAttachStateChangeListenerC20604515jv.setLayoutManager(new LinearLayoutManager(viewOnAttachStateChangeListenerC20604515jv.getContext(), 0, false));
        viewOnAttachStateChangeListenerC20604515jv.LJIILJJIL(SearchTop1SlidingViewCell.class);
        viewOnAttachStateChangeListenerC20604515jv.setAnimation(null);
        viewOnAttachStateChangeListenerC20604515jv.setItemAnimator(null);
        viewOnAttachStateChangeListenerC20604515jv.addItemDecoration(new C346270Dhp(0));
    }

    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final void up(InterfaceC655050Pmh interfaceC655050Pmh) {
        Function0<? extends List<C660830Pw1>> function0;
        List<C660830Pw1> listInvoke;
        C346010DhP c346010DhP = (C346010DhP) this.LLJL.getValue();
        if (c346010DhP != null && (function0 = c346010DhP.LL) != null && (listInvoke = function0.invoke()) != null) {
            ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv = this.LLJJLIIIJLLLLLLLZ;
            if (viewOnAttachStateChangeListenerC20604515jv == null) {
                viewOnAttachStateChangeListenerC20604515jv = null;
            }
            viewOnAttachStateChangeListenerC20604515jv.getState().LJIILL(listInvoke, null);
        }
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ boolean ur(InterfaceC655050Pmh interfaceC655050Pmh) {
        return true;
    }

    @Override // com.ss.android.ugc.aweme.search.arch.v2.protocol.card.components.top1.slidingview.ui.Top1CardSlidingViewAbility
    public final void y21(C660830Pw1 c660830Pw1) {
        boolean z;
        InterfaceC1631620sYq<? super Boolean, ? super String, ? super Integer, Unit> interfaceC1631620sYq;
        c660830Pw1.getClass();
        if (EnumC039900Cf.HIGHLIGHT_CERULEAN == null) {
            z = true;
        } else {
            z = false;
        }
        C346010DhP c346010DhP = (C346010DhP) this.LLJL.getValue();
        if (c346010DhP != null && (interfaceC1631620sYq = c346010DhP.LLILLJJLI) != null) {
            Boolean boolValueOf = Boolean.valueOf(z);
            c660830Pw1.getClass();
            c660830Pw1.getClass();
            interfaceC1631620sYq.invoke(boolValueOf, null, 0);
        }
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ void vr(InterfaceC655050Pmh interfaceC655050Pmh) {
    }

    @Override // X.InterfaceC712990Rxx
    public final void sr(InterfaceC1587906Jp interfaceC1587906Jp, List list) {
        up(interfaceC1587906Jp);
    }
}
