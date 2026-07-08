package com.ss.android.ugc.aweme.ecommercelive.common.biz.us.actingarea;

import X.AbstractC21206917yt;
import X.C1210090hax;
import X.C1236230iH7;
import X.C1556460qbc;
import X.C1563970qnj;
import X.C1564050qnr;
import X.C2097608Jq;
import X.C21198117xT;
import X.C2188811AlT;
import X.EnumC1124020fM8;
import X.InterfaceC21213717zz;
import X.InterfaceC756140TlM;
import android.content.Context;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import com.bytedance.android.live.slot.IFrameSlot;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.AwS108S1000000_24;
import kotlin.jvm.internal.AwS173S1100000_24;
import kotlin.jvm.internal.AwS22S1110000_24;
import kotlin.jvm.internal.AwS568S0100000_24;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes25.dex */
public final class ECAuctionActingAreaBottomRightWidget extends AbstractC21206917yt implements LifecycleEventObserver {
    public final Context LLILLL;
    public C1236230iH7 LLILZ;
    public C1210090hax LLILZIL;
    public IFrameSlot.SlotViewModel LLILZLL;
    public LifecycleOwner LLIZ;
    public Boolean LLIZLLLIL;

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
            this.LLILZ = new C1236230iH7(this.LLILLL);
        }
        return this.LLILZ;
    }

    @Override // com.bytedance.android.live.slot.AbsSlotWidget, X.InterfaceC1124060fMC
    public final void onDestroy() {
        Lifecycle lifecycle;
        MutableLiveData<Boolean> mutableLiveData;
        List<C1556460qbc> list = C1563970qnj.LIZ;
        C1563970qnj.LJ(new AwS108S1000000_24(4));
        C1210090hax c1210090hax = this.LLILZIL;
        if (c1210090hax != null) {
            C1563970qnj.LJ(new AwS173S1100000_24(c1210090hax, "acting_area_bottom", 10));
        }
        LJJ("widget_destroy", false, Intrinsics.LJFF(this.LLIZLLLIL, Boolean.TRUE));
        IFrameSlot.SlotViewModel slotViewModel = this.LLILZLL;
        if (slotViewModel != null && (mutableLiveData = slotViewModel.LLIZLLLIL) != null) {
            mutableLiveData.setValue(Boolean.FALSE);
        }
        this.LLILZIL = null;
        this.LLILZLL = null;
        LifecycleOwner lifecycleOwner = this.LLIZ;
        if (lifecycleOwner != null && (lifecycle = lifecycleOwner.getLifecycle()) != null) {
            lifecycle.removeObserver(this);
        }
        this.LLIZ = null;
    }

    @Override // X.InterfaceC1124060fMC
    public final Enum LLJ() {
        return EnumC1124020fM8.SLOT_LIVE_EC_AUCTION_BOTTOM_RIGHT_ACTING_AREA;
    }

    public ECAuctionActingAreaBottomRightWidget(Context context) {
        this.LLILLL = context;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0035  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJI(java.lang.String r4) {
        /*
            r3 = this;
            java.util.List<X.0qbc> r0 = X.C1563970qnj.LIZ
            kotlin.jvm.internal.AwS108S1000000_24 r1 = new kotlin.jvm.internal.AwS108S1000000_24
            r0 = 5
            r1.<init>(r0)
            java.lang.Object r2 = X.C1563970qnj.LJFF(r1)
            r1 = 0
            if (r2 == 0) goto L35
            X.0hax r0 = r3.LLILZIL
            if (r0 == 0) goto L33
            X.0qnr r0 = r0.LLILZ
            if (r0 == 0) goto L33
            java.lang.Long r0 = r0.LIZJ
        L19:
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r0, r2)
            if (r0 == 0) goto L35
            r2 = 1
        L20:
            r3.LJJ(r4, r2, r1)
            com.bytedance.android.live.slot.IFrameSlot$SlotViewModel r0 = r3.LLILZLL
            if (r0 == 0) goto L32
            androidx.lifecycle.MutableLiveData<java.lang.Boolean> r1 = r0.LLIZLLLIL
            if (r1 == 0) goto L32
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r2)
            r1.setValue(r0)
        L32:
            return
        L33:
            r0 = 0
            goto L19
        L35:
            r2 = 0
            goto L20
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommercelive.common.biz.us.actingarea.ECAuctionActingAreaBottomRightWidget.LJJI(java.lang.String):void");
    }

    @Override // com.bytedance.android.live.slot.AbsSlotWidget, X.InterfaceC1124060fMC
    public final void LLIZ(ViewModel viewModel, InterfaceC21213717zz interfaceC21213717zz) {
        IFrameSlot.SlotViewModel slotViewModel = (IFrameSlot.SlotViewModel) viewModel;
        this.LL = slotViewModel;
        this.LLILLJJLI = interfaceC21213717zz;
        LifecycleOwner lifecycleOwner = interfaceC21213717zz.getLifecycleOwner();
        C1210090hax c1210090hax = null;
        if (lifecycleOwner != null) {
            lifecycleOwner.getLifecycle().addObserver(this);
        } else {
            lifecycleOwner = null;
        }
        this.LLIZ = lifecycleOwner;
        C1236230iH7 c1236230iH7 = this.LLILZ;
        if (c1236230iH7 != null) {
            c1210090hax = c1236230iH7.LL;
        }
        this.LLILZIL = c1210090hax;
        this.LLILZLL = slotViewModel;
        if (c1210090hax != null) {
            List<C1556460qbc> list = C1563970qnj.LIZ;
            C1563970qnj.LJ(new AwS22S1110000_24(c1210090hax, "acting_area_bottom", 0));
            C1563970qnj.LJ(new AwS173S1100000_24(new AwS568S0100000_24(this, 1852), 9));
            LJJI("init_sync");
        }
    }

    @Override // X.InterfaceC1124060fMC
    public final void prepareToShow(Map<String, Object> map, InterfaceC756140TlM interfaceC756140TlM) {
        interfaceC756140TlM.LIZ(true);
    }

    public final void LJJ(String str, boolean z, boolean z2) {
        String str2;
        String str3;
        String str4;
        long jLongValue;
        Long l;
        String string;
        if (!z2 && Intrinsics.LJFF(this.LLIZLLLIL, Boolean.valueOf(z))) {
            return;
        }
        this.LLIZLLLIL = Boolean.valueOf(z);
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (z) {
            str2 = "auction_acting_area_bottom_right_show";
        } else {
            str2 = "auction_acting_area_bottom_right_hide";
        }
        if (z) {
            if (Intrinsics.LJFF(str, "init_sync")) {
                str3 = "init_sync_show";
            } else {
                str3 = "pin_card_show";
            }
        } else if (Intrinsics.LJFF(str, "init_sync")) {
            str3 = "init_sync_hide";
        } else {
            str3 = "widget_destroy";
            if (!Intrinsics.LJFF(str, "widget_destroy")) {
                str3 = "unpin_sub_scene";
            }
        }
        C1210090hax c1210090hax = this.LLILZIL;
        C1564050qnr c1564050qnr = null;
        if (c1210090hax != null) {
            c1564050qnr = c1210090hax.LLILZ;
        }
        Pair[] pairArr = new Pair[3];
        String str5 = "";
        if (c1564050qnr == null || (str4 = c1564050qnr.LIZ) == null) {
            str4 = "";
        }
        pairArr[0] = new Pair("room_id", str4);
        if (c1564050qnr != null && (string = Integer.valueOf(c1564050qnr.LIZIZ).toString()) != null) {
            str5 = string;
        }
        pairArr[1] = new Pair("card_type", str5);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("sub_scene:acting_area_bottom, visible:");
        sbLIZ.append(z ? 1 : 0);
        sbLIZ.append(", reason:");
        sbLIZ.append(str3);
        sbLIZ.append(", current_timestamp:");
        sbLIZ.append(jCurrentTimeMillis);
        sbLIZ.append(", pop_card_id:");
        if (c1564050qnr != null && (l = c1564050qnr.LIZJ) != null) {
            jLongValue = l.longValue();
        } else {
            jLongValue = -1;
        }
        sbLIZ.append(jLongValue);
        pairArr[2] = new Pair("step_extra", C2188811AlT.LIZIZ(sbLIZ));
        Map mapLJIIJ = C2097608Jq.LJIIJ(pairArr);
        C21198117xT.LIZ.getClass();
        C21198117xT.LIZIZ(str2, mapLJIIJ);
    }
}
