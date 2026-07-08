package com.ss.android.ugc.aweme.live.slot;

import X.AbstractC756740TmK;
import X.C13LP;
import X.C1892750zM1;
import X.C21266818Kk;
import X.C500980Jkm;
import X.C748570TXz;
import X.C756180TlQ;
import X.C756930Tmd;
import X.C800330VaR;
import X.EnumC21266618Ki;
import X.EnumC21266718Kj;
import X.EnumC756810TmR;
import X.InterfaceC1124060fMC;
import X.InterfaceC1124130fMJ;
import X.InterfaceC1892740zM0;
import X.InterfaceC21213717zz;
import X.InterfaceC756140TlM;
import X.InterfaceC756370Tlj;
import Y.AObserverS177S0200000_12;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import com.bytedance.android.live.slot.AbsSlotWidget;
import com.bytedance.android.live.slot.IIconSlot;
import com.bytedance.android.live.slot.LiveShopAddPermissionBusinessSetting;
import com.bytedance.android.livesdk.LiveDialogFragment;
import com.ss.ugc.live.sdk.message.data.IMessage;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
public final class LiveShopBagBusinessSlotWidget extends AbstractC756740TmK<IIconSlot, IIconSlot.SlotViewModel, EnumC756810TmR> implements InterfaceC1124130fMJ {
    public IIconSlot.SlotViewModel LLILLJJLI;
    public InterfaceC21213717zz LLILZ;
    public boolean LLILZLL;
    public InterfaceC1124060fMC<IIconSlot, IIconSlot.SlotViewModel, EnumC756810TmR> LLIZ;
    public final C756180TlQ LL = new C756180TlQ(this);
    public final HashMap<InterfaceC1124060fMC<IIconSlot, IIconSlot.SlotViewModel, EnumC756810TmR>, IIconSlot.SlotViewModel> LLILLL = new HashMap<>();
    public final C748570TXz LLILZIL = new C748570TXz();
    public final HashSet<String> LLIZLLLIL = new HashSet<>();
    public EnumC21266718Kj LLJ = EnumC21266718Kj.NONE;
    public HashSet<InterfaceC1124060fMC<IIconSlot, IIconSlot.SlotViewModel, EnumC756810TmR>> LLJI = new HashSet<>();
    public final HashSet<InterfaceC1124060fMC<IIconSlot, IIconSlot.SlotViewModel, EnumC756810TmR>> LLJIJIL = new HashSet<>();
    public final HashSet<InterfaceC1124060fMC<IIconSlot, IIconSlot.SlotViewModel, EnumC756810TmR>> LLJILJIL = new HashSet<>();

    public static final class ShopBagSlotsBottomSheetDialog extends LiveDialogFragment {
        public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiklPyp9OykjPWEfITMpGic8OActLg0mHELIOSOywiLDwgGykjPRg6LCIpPWsAICo8Cy40GykjPTwRJzE4JiIAICApPQs6KSkjLg==";
        public C748570TXz LL;

        @Override // com.bytedance.android.livesdk.LiveDialogFragment
        public final boolean adaptEdgeToEdge() {
            return true;
        }

        @Override // com.bytedance.android.live.design.resource.theme.LiveThemeAwareDialogFragment
        public final boolean isSheet() {
            return true;
        }

        @Override // com.bytedance.android.livesdk.LiveDialogFragment
        public final C500980Jkm createParams() {
            C500980Jkm c500980Jkm = new C500980Jkm(R.layout.g7b);
            c500980Jkm.LIZIZ = 2;
            c500980Jkm.LIZJ = R.style.ahi;
            c500980Jkm.LJIIL = new ColorDrawable(0);
            c500980Jkm.LJII = 80;
            c500980Jkm.LJI = 0.0f;
            return c500980Jkm;
        }

        /* JADX WARN: Removed duplicated region for block: B:17:0x0083  */
        @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.Fragment
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void onViewCreated(android.view.View r8, android.os.Bundle r9) {
            /*
                r7 = this;
                super.onViewCreated(r8, r9)
                r0 = 2131383713(0x7f0a55a1, float:1.8387807E38)
                android.view.View r2 = r8.findViewById(r0)
                Y.ACListenerS147S0100000_12 r1 = new Y.ACListenerS147S0100000_12
                r0 = 252(0xfc, float:3.53E-43)
                r1.<init>(r7, r0)
                X.C786410Ut5.I7(r1, r2)
                r0 = 2131391524(0x7f0a7424, float:1.840365E38)
                android.view.View r4 = r8.findViewById(r0)
                androidx.recyclerview.widget.RecyclerView r4 = (androidx.recyclerview.widget.RecyclerView) r4
                com.bytedance.android.livesdk.chatroom.ui.SSLinearLayoutManager r2 = new com.bytedance.android.livesdk.chatroom.ui.SSLinearLayoutManager
                X.19EG r1 = r7.getActivity()
                r0 = 1
                r2.<init>(r1, r0)
                r4.setLayoutManager(r2)
                X.0TM1 r3 = new X.0TM1
                X.0TXz r0 = r7.LL
                if (r0 == 0) goto L83
                java.util.Map<X.0fMC<com.bytedance.android.live.slot.IIconSlot, com.bytedance.android.live.slot.IIconSlot$SlotViewModel, X.0TmR>, com.bytedance.android.live.slot.IIconSlot$SlotViewModel> r0 = r0.LIZIZ
                if (r0 == 0) goto L83
                java.util.LinkedHashMap r6 = new java.util.LinkedHashMap
                r6.<init>()
                java.util.HashMap r0 = (java.util.HashMap) r0
                java.util.Set r0 = r0.entrySet()
                java.util.Iterator r5 = r0.iterator()
            L43:
                boolean r0 = r5.hasNext()
                if (r0 == 0) goto L6f
                java.lang.Object r2 = r5.next()
                java.util.Map$Entry r2 = (java.util.Map.Entry) r2
                java.lang.Object r0 = r2.getValue()
                com.bytedance.android.live.slot.IIconSlot$SlotViewModel r0 = (com.bytedance.android.live.slot.IIconSlot.SlotViewModel) r0
                androidx.lifecycle.MutableLiveData<java.lang.Boolean> r0 = r0.LLILZ
                java.lang.Object r1 = r0.getValue()
                java.lang.Boolean r0 = java.lang.Boolean.TRUE
                boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
                if (r0 == 0) goto L43
                java.lang.Object r1 = r2.getKey()
                java.lang.Object r0 = r2.getValue()
                r6.put(r1, r0)
                goto L43
            L6f:
                java.util.Set r2 = r6.keySet()
                if (r2 == 0) goto L83
                Y.AComparatorS31S0000000_12 r1 = new Y.AComparatorS31S0000000_12
                r0 = 14
                r1.<init>(r0)
                java.util.List r1 = X.C13LP.LJLLLL(r1, r2)
                if (r1 == 0) goto L83
                goto L85
            L83:
                X.13BV r1 = X.C13BV.INSTANCE
            L85:
                X.0TXz r0 = r7.LL
                if (r0 == 0) goto L8d
                java.util.Map<X.0fMC<com.bytedance.android.live.slot.IIconSlot, com.bytedance.android.live.slot.IIconSlot$SlotViewModel, X.0TmR>, com.bytedance.android.live.slot.IIconSlot$SlotViewModel> r0 = r0.LIZIZ
                if (r0 != 0) goto L91
            L8d:
                java.util.Map r0 = X.C2097608Jq.LJ()
            L91:
                r3.<init>(r7, r1, r0)
                r4.setAdapter(r3)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.live.slot.LiveShopBagBusinessSlotWidget.ShopBagSlotsBottomSheetDialog.onViewCreated(android.view.View, android.os.Bundle):void");
        }
    }

    @Override // X.InterfaceC1124060fMC
    public final List<Integer> getMessageType() {
        return null;
    }

    @Override // X.InterfaceC1124060fMC
    public final void onCreate(Bundle bundle) {
    }

    @Override // X.InterfaceC1124060fMC
    public final void onDispose() {
    }

    @Override // X.AbstractC756740TmK, X.InterfaceC756750TmL, X.InterfaceC1124060fMC
    public void onEvent(Boolean bool) {
    }

    @Override // X.InterfaceC1124060fMC
    public final void onMessage(IMessage iMessage) {
    }

    @Override // X.InterfaceC1124060fMC
    public final void onPause() {
    }

    @Override // X.InterfaceC1124060fMC
    public final void onResume() {
    }

    @Override // X.InterfaceC1124060fMC
    public final void onStart() {
    }

    @Override // X.InterfaceC1124060fMC
    public final void onStop() {
    }

    @Override // X.InterfaceC1124060fMC
    public final String LIZ() {
        return EnumC21266618Ki.BUSINESS.getValue();
    }

    public final void LIZJ() {
        int size = this.LLILLL.size();
        if (size == 0) {
            LIZIZ(false);
            InterfaceC21213717zz interfaceC21213717zz = this.LLILZ;
            if (interfaceC21213717zz != null) {
                interfaceC21213717zz.LJII(this, this.LLILLJJLI);
            }
            InterfaceC21213717zz interfaceC21213717zz2 = this.LLILZ;
            if (interfaceC21213717zz2 != null) {
                interfaceC21213717zz2.LIZIZ(Boolean.FALSE);
            }
            this.LLIZ = null;
            this.LLJ = EnumC21266718Kj.NONE;
        } else if (size != 1) {
            LIZIZ(true);
            InterfaceC21213717zz interfaceC21213717zz3 = this.LLILZ;
            if (interfaceC21213717zz3 != null) {
                interfaceC21213717zz3.LJII(this, this.LLILLJJLI);
            }
            InterfaceC21213717zz interfaceC21213717zz4 = this.LLILZ;
            if (interfaceC21213717zz4 != null) {
                interfaceC21213717zz4.LIZIZ(Boolean.TRUE);
            }
            this.LLIZ = this;
            this.LLJ = EnumC21266718Kj.BUSINESS;
        } else {
            LIZIZ(false);
            Map.Entry entry = (Map.Entry) C13LP.LJJJJZ(this.LLILLL.entrySet());
            InterfaceC21213717zz interfaceC21213717zz5 = this.LLILZ;
            if (interfaceC21213717zz5 != null) {
                interfaceC21213717zz5.LJII((InterfaceC1124060fMC) entry.getKey(), (IIconSlot.SlotViewModel) entry.getValue());
            }
            InterfaceC21213717zz interfaceC21213717zz6 = this.LLILZ;
            if (interfaceC21213717zz6 != null) {
                interfaceC21213717zz6.LIZIZ(Boolean.TRUE);
            }
            this.LLIZ = (InterfaceC1124060fMC) entry.getKey();
            C21266818Kk c21266818Kk = EnumC21266618Ki.Companion;
            String strLIZ = ((InterfaceC1124060fMC) entry.getKey()).LIZ();
            c21266818Kk.getClass();
            this.LLJ = C21266818Kk.LIZJ(strLIZ);
        }
        LJI();
    }

    public final void LJI() {
        MutableLiveData<String> mutableLiveData;
        IIconSlot.SlotViewModel slotViewModel = this.LLILLJJLI;
        if (slotViewModel == null) {
            return;
        }
        InterfaceC1124060fMC<IIconSlot, IIconSlot.SlotViewModel, EnumC756810TmR> interfaceC1124060fMC = this.LLIZ;
        String value = null;
        if (interfaceC1124060fMC != null) {
            if (Intrinsics.LJFF(interfaceC1124060fMC, this)) {
                Iterator<T> it2 = this.LLILLL.values().iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    String value2 = ((IIconSlot.SlotViewModel) it2.next()).LLILZLL.getValue();
                    if (value2 != null) {
                        value = value2;
                        break;
                    }
                }
            } else {
                IIconSlot.SlotViewModel slotViewModel2 = (IIconSlot.SlotViewModel) ((HashMap) this.LLILZIL.LIZIZ).get(interfaceC1124060fMC);
                if (slotViewModel2 != null && (mutableLiveData = slotViewModel2.LLILZLL) != null) {
                    value = mutableLiveData.getValue();
                }
            }
        }
        slotViewModel.LLILZLL.setValue(value);
    }

    @Override // X.InterfaceC1124060fMC
    public final void onDestroy() {
        this.LLIZLLLIL.clear();
        this.LLJI.clear();
        this.LLJIJIL.clear();
        this.LLJILJIL.clear();
        ShopBagSlotsBottomSheetDialog shopBagSlotsBottomSheetDialog = this.LL.LIZ;
        if (shopBagSlotsBottomSheetDialog == null || !shopBagSlotsBottomSheetDialog.isShowing()) {
            return;
        }
        shopBagSlotsBottomSheetDialog.dismissAllowingStateLoss();
    }

    @Override // X.InterfaceC1124060fMC
    public final Object LLILZLL() {
        return this.LL;
    }

    @Override // X.InterfaceC1124060fMC
    public final Enum LLJ() {
        return EnumC756810TmR.SLOT_LIVE_WATCHER_TOOLBAR;
    }

    public final void LIZIZ(boolean z) {
        IIconSlot.SlotViewModel slotViewModel = this.LLILLJJLI;
        if (slotViewModel != null && !Intrinsics.LJFF(slotViewModel.LLILZ.getValue(), Boolean.valueOf(z))) {
            slotViewModel.LLILZ.setValue(Boolean.valueOf(z));
        }
    }

    @Override // X.InterfaceC756750TmL
    public final boolean LJ(InterfaceC1124060fMC<?, ?, ?> interfaceC1124060fMC) {
        if (interfaceC1124060fMC == null) {
            return false;
        }
        Iterator<InterfaceC1124060fMC<IIconSlot, IIconSlot.SlotViewModel, EnumC756810TmR>> it2 = this.LLILZIL.LIZ.iterator();
        while (it2.hasNext()) {
            if (it2.next() == interfaceC1124060fMC) {
                return true;
            }
        }
        return false;
    }

    @Override // X.InterfaceC1124130fMJ
    public final void LJIIJ(String str) {
        EnumC21266618Ki.Companion.getClass();
        if (C21266818Kk.LIZIZ(str)) {
            this.LLIZLLLIL.add(str);
        }
    }

    @Override // X.InterfaceC212387189p
    public final void LJIILIIL(final Function1<? super C1892750zM1, Unit> function1) {
        if (!LiveShopAddPermissionBusinessSetting.INSTANCE.isEnabled()) {
            return;
        }
        for (Map.Entry entry : ((HashMap) this.LLILZIL.LIZIZ).entrySet()) {
            InterfaceC1124060fMC<IIconSlot, IIconSlot.SlotViewModel, EnumC756810TmR> interfaceC1124060fMC = (InterfaceC1124060fMC) entry.getKey();
            Object value = entry.getValue();
            if ((value instanceof IIconSlot.SlotViewModel) && value != null && this.LLIZLLLIL.contains(interfaceC1124060fMC.LIZ()) && (interfaceC1124060fMC instanceof InterfaceC756370Tlj) && this.LLJIJIL.add(interfaceC1124060fMC)) {
                ((InterfaceC756370Tlj) interfaceC1124060fMC).LJIIIZ(new InterfaceC1892740zM0() { // from class: X.0Tli
                    @Override // X.InterfaceC1892740zM0
                    public final void LIZ(C1892750zM1 c1892750zM1) {
                        function1.invoke(c1892750zM1);
                    }
                });
            }
        }
    }

    @Override // X.InterfaceC212387189p
    public final void LJIJI(C756930Tmd c756930Tmd) {
        boolean z;
        if (!LiveShopAddPermissionBusinessSetting.INSTANCE.isEnabled() || this.LLJ == c756930Tmd.LIZ) {
            return;
        }
        HashSet<InterfaceC1124060fMC<IIconSlot, IIconSlot.SlotViewModel, EnumC756810TmR>> hashSet = new HashSet<>();
        for (Map.Entry entry : ((HashMap) this.LLILZIL.LIZIZ).entrySet()) {
            InterfaceC1124060fMC<IIconSlot, IIconSlot.SlotViewModel, EnumC756810TmR> interfaceC1124060fMC = (InterfaceC1124060fMC) entry.getKey();
            IIconSlot.SlotViewModel slotViewModel = (IIconSlot.SlotViewModel) entry.getValue();
            if ((slotViewModel instanceof IIconSlot.SlotViewModel) && slotViewModel != null) {
                String strLIZ = interfaceC1124060fMC.LIZ();
                if (this.LLIZLLLIL.contains(strLIZ)) {
                    if ((!c756930Tmd.LIZIZ || !Intrinsics.LJFF(strLIZ, c756930Tmd.LIZJ)) && c756930Tmd.LIZ != EnumC21266718Kj.BUSINESS) {
                        z = false;
                        this.LLILLL.remove(interfaceC1124060fMC);
                    } else {
                        z = true;
                        this.LLILLL.put(interfaceC1124060fMC, slotViewModel);
                        hashSet.add(interfaceC1124060fMC);
                    }
                    slotViewModel.LLILZ.setValue(Boolean.valueOf(z));
                }
            }
        }
        if (!Intrinsics.LJFF(this.LLJI, hashSet)) {
            LIZJ();
            this.LLJI = hashSet;
        }
    }

    @Override // X.InterfaceC1124060fMC
    public final void onExposure(String str) {
        Iterator<T> it2 = this.LLILLL.keySet().iterator();
        while (it2.hasNext()) {
            InterfaceC1124060fMC interfaceC1124060fMC = (InterfaceC1124060fMC) it2.next();
            if (interfaceC1124060fMC instanceof AbsSlotWidget) {
                ((AbsSlotWidget) interfaceC1124060fMC).onAggregateExposure(str);
            }
        }
    }

    @Override // X.InterfaceC756750TmL
    public final void LIZLLL(InterfaceC1124060fMC<?, ?, ?> interfaceC1124060fMC, IIconSlot.SlotViewModel slotViewModel) {
        if (interfaceC1124060fMC != null && slotViewModel != null) {
            C748570TXz c748570TXz = this.LLILZIL;
            c748570TXz.LIZ.add(interfaceC1124060fMC);
            ((HashMap) c748570TXz.LIZIZ).put(interfaceC1124060fMC, slotViewModel);
            if (this.LLILZLL) {
                LJFF(interfaceC1124060fMC, slotViewModel);
            }
        }
    }

    public final void LJFF(InterfaceC1124060fMC<IIconSlot, IIconSlot.SlotViewModel, EnumC756810TmR> interfaceC1124060fMC, IIconSlot.SlotViewModel slotViewModel) {
        LifecycleOwner lifecycleOwner;
        InterfaceC21213717zz interfaceC21213717zz = this.LLILZ;
        if (interfaceC21213717zz == null || (lifecycleOwner = interfaceC21213717zz.getLifecycleOwner()) == null || !this.LLJILJIL.add(interfaceC1124060fMC)) {
            return;
        }
        slotViewModel.LLILZLL.observe(lifecycleOwner, new AObserverS177S0200000_12(this, interfaceC1124060fMC, 24));
    }

    @Override // X.InterfaceC1124060fMC
    public final void LLIZ(ViewModel viewModel, InterfaceC21213717zz interfaceC21213717zz) {
        Drawable drawableLIZIZ;
        Drawable drawableLIZIZ2;
        Context context;
        Context context2;
        Context context3;
        IIconSlot.SlotViewModel slotViewModel = (IIconSlot.SlotViewModel) viewModel;
        IIconSlot.SlotViewModel slotViewModel2 = this.LLILLJJLI;
        this.LLILLJJLI = slotViewModel;
        this.LLILZLL = true;
        this.LLILZ = interfaceC21213717zz;
        if (!Intrinsics.LJFF(slotViewModel2, slotViewModel)) {
            IIconSlot.SlotViewModel slotViewModel3 = this.LLILLJJLI;
            String string = null;
            if (slotViewModel3 != null) {
                MutableLiveData<Drawable> mutableLiveData = slotViewModel3.LLJ;
                InterfaceC21213717zz interfaceC21213717zz2 = this.LLILZ;
                if (interfaceC21213717zz2 != null && (context3 = interfaceC21213717zz2.getContext()) != null) {
                    drawableLIZIZ = C800330VaR.LIZIZ(context3, R.drawable.cqy);
                } else {
                    drawableLIZIZ = null;
                }
                mutableLiveData.setValue(drawableLIZIZ);
                MutableLiveData<Drawable> mutableLiveData2 = slotViewModel3.LLJI;
                InterfaceC21213717zz interfaceC21213717zz3 = this.LLILZ;
                if (interfaceC21213717zz3 != null && (context2 = interfaceC21213717zz3.getContext()) != null) {
                    drawableLIZIZ2 = C800330VaR.LIZIZ(context2, R.drawable.cqy);
                } else {
                    drawableLIZIZ2 = null;
                }
                mutableLiveData2.setValue(drawableLIZIZ2);
                MutableLiveData<String> mutableLiveData3 = slotViewModel3.LLJILJILJ;
                InterfaceC21213717zz interfaceC21213717zz4 = this.LLILZ;
                if (interfaceC21213717zz4 != null && (context = interfaceC21213717zz4.getContext()) != null) {
                    string = context.getString(2131821346);
                }
                mutableLiveData3.setValue(string);
            }
            for (Map.Entry entry : ((HashMap) this.LLILZIL.LIZIZ).entrySet()) {
                Object key = entry.getKey();
                IIconSlot.SlotViewModel slotViewModel4 = (IIconSlot.SlotViewModel) entry.getValue();
                if ((slotViewModel4 instanceof IIconSlot.SlotViewModel) && slotViewModel4 != null && Intrinsics.LJFF(slotViewModel4.LLILZ.getValue(), Boolean.TRUE)) {
                    this.LLILLL.put((InterfaceC1124060fMC<IIconSlot, IIconSlot.SlotViewModel, EnumC756810TmR>) key, slotViewModel4);
                }
            }
            LIZJ();
            for (Map.Entry entry2 : ((HashMap) this.LLILZIL.LIZIZ).entrySet()) {
                LJFF((InterfaceC1124060fMC) entry2.getKey(), (IIconSlot.SlotViewModel) entry2.getValue());
            }
            LJI();
        }
    }

    @Override // X.InterfaceC1124060fMC
    public final void prepareToShow(Map<String, ? extends Object> map, InterfaceC756140TlM interfaceC756140TlM) {
        interfaceC756140TlM.LIZ(true);
    }
}
