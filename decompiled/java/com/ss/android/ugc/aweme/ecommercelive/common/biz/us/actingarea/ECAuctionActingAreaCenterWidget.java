package com.ss.android.ugc.aweme.ecommercelive.common.biz.us.actingarea;

import X.AbstractC21206917yt;
import X.C1210090hax;
import X.C1236220iH6;
import X.C1556460qbc;
import X.C1563970qnj;
import X.EnumC1124020fM8;
import X.InterfaceC21213717zz;
import X.InterfaceC756140TlM;
import android.content.Context;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModel;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AwS173S1100000_24;
import kotlin.jvm.internal.AwS22S1110000_24;

/* JADX INFO: loaded from: classes25.dex */
public final class ECAuctionActingAreaCenterWidget extends AbstractC21206917yt implements LifecycleEventObserver {
    public final Context LLILLL;
    public C1236220iH6 LLILZ;
    public LifecycleOwner LLILZIL;

    @Override // X.InterfaceC1124060fMC
    public final String LIZ() {
        return "ec_shop";
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
    }

    @Override // X.InterfaceC1124060fMC
    public final Object LLILZLL() {
        if (this.LLILZ == null) {
            this.LLILZ = new C1236220iH6(this.LLILLL);
        }
        return this.LLILZ;
    }

    @Override // com.bytedance.android.live.slot.AbsSlotWidget, X.InterfaceC1124060fMC
    public final void onDestroy() {
        C1210090hax c1210090hax;
        Lifecycle lifecycle;
        LifecycleOwner lifecycleOwner = this.LLILZIL;
        if (lifecycleOwner != null && (lifecycle = lifecycleOwner.getLifecycle()) != null) {
            lifecycle.removeObserver(this);
        }
        this.LLILZIL = null;
        C1236220iH6 c1236220iH6 = this.LLILZ;
        if (c1236220iH6 == null || (c1210090hax = c1236220iH6.LL) == null) {
            return;
        }
        List<C1556460qbc> list = C1563970qnj.LIZ;
        C1563970qnj.LJ(new AwS173S1100000_24(c1210090hax, "acting_area", 10));
    }

    @Override // X.InterfaceC1124060fMC
    public final Enum LLJ() {
        return EnumC1124020fM8.SLOT_LIVE_EC_AUCTION_ACTING_AREA;
    }

    public ECAuctionActingAreaCenterWidget(Context context) {
        this.LLILLL = context;
    }

    @Override // com.bytedance.android.live.slot.AbsSlotWidget, X.InterfaceC1124060fMC
    public final void LLIZ(ViewModel viewModel, InterfaceC21213717zz interfaceC21213717zz) {
        C1210090hax c1210090hax;
        this.LL = viewModel;
        this.LLILLJJLI = interfaceC21213717zz;
        LifecycleOwner lifecycleOwner = interfaceC21213717zz.getLifecycleOwner();
        if (lifecycleOwner != null) {
            lifecycleOwner.getLifecycle().addObserver(this);
        } else {
            lifecycleOwner = null;
        }
        this.LLILZIL = lifecycleOwner;
        C1236220iH6 c1236220iH6 = this.LLILZ;
        if (c1236220iH6 != null && (c1210090hax = c1236220iH6.LL) != null) {
            List<C1556460qbc> list = C1563970qnj.LIZ;
            C1563970qnj.LJ(new AwS22S1110000_24(c1210090hax, "acting_area", 0));
        }
    }

    @Override // X.InterfaceC1124060fMC
    public final void prepareToShow(Map<String, Object> map, InterfaceC756140TlM interfaceC756140TlM) {
        interfaceC756140TlM.LIZ(true);
    }
}
