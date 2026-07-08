package com.bytedance.android.livesdk.gift.base.platform.business.panel.portrait;

import X.AbstractC1125260fO8;
import X.C09JN;
import X.C0IPN;
import X.C1100420ek4;
import X.C1100680ekU;
import X.C1100690ekV;
import X.C1101480elm;
import X.C1121600fIE;
import X.C1125100fNs;
import X.C1125210fO3;
import X.C1128590fTV;
import X.C1133380fbE;
import X.C1143680frq;
import X.C1161920gLG;
import X.C11NJ;
import X.C2044407ze;
import X.C212300rp;
import X.C255000yi;
import X.C500260Jjc;
import X.C784440Upu;
import X.InterfaceC1097170eep;
import X.InterfaceC1100670ekT;
import Y.AfS153S0200000_17;
import Y.AfS186S0100000_17;
import android.content.Context;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModelProviders;
import com.bytedance.android.live.ai.api.pitaya.ILiveClientAIService;
import com.bytedance.android.livesdk.gift.base.platform.business.panel.portrait.GiftLeafRootWidget;
import com.bytedance.android.livesdk.gift.base.platform.core.manager.GiftManager;
import com.bytedance.android.livesdk.gift.model.GiftPage;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveBroadcastPictureMemOpt;
import com.bytedance.android.livesdk.livesetting.gift.LiveGiftPanelTopLeafNewArchSetting;
import com.bytedance.android.livesdk.pack.viewmodel.BagListViewModel;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdk.widgets.giftwidget.viewmodel.GiftLeafRootViewModel;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.host.user.IHostPad;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;
import com.zhiliaoapp.musically.R;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes18.dex */
public final class GiftLeafRootWidget extends LiveRecyclableWidget {
    public C212300rp LL;
    public C1133380fbE LLILLJJLI;
    public ViewGroup LLILLL;
    public final C11NJ LLILZ = new C11NJ();
    public C1125210fO3 LLILZIL;

    @Override // com.bytedance.android.widget.Widget
    public final int getLayoutId() {
        return R.layout.go2;
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget
    public final boolean needRecycle() {
        return false;
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onInit(Object[] objArr) {
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    public final GiftLeafRootViewModel y1() {
        Fragment fragment;
        InterfaceC1097170eep interfaceC1097170eep = this.widgetCallback;
        if (interfaceC1097170eep == null || (fragment = interfaceC1097170eep.getFragment()) == null) {
            return null;
        }
        return (GiftLeafRootViewModel) ViewModelProviders.of(fragment).get(GiftLeafRootViewModel.class);
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onUnload() {
        C1100690ekV<AbstractC1125260fO8> c1100690ekV;
        C1100420ek4 c1100420ek4X1 = x1();
        if (c1100420ek4X1 != null) {
            c1100420ek4X1.setFragment(null);
        }
        ((ILiveClientAIService) C1161920gLG.LIZJ(ILiveClientAIService.class)).IM0();
        List<String> list = C1101480elm.LIZ;
        C1133380fbE c1133380fbE = this.LLILLJJLI;
        if (c1133380fbE != null) {
            c1133380fbE.LJJIZ();
        }
        this.LLILZ.LJ();
        C1125210fO3 c1125210fO3 = this.LLILZIL;
        if (c1125210fO3 != null) {
            GiftLeafRootViewModel giftLeafRootViewModelY1 = y1();
            if (giftLeafRootViewModelY1 != null && (c1100690ekV = giftLeafRootViewModelY1.LLILLJJLI) != null) {
                c1100690ekV.LIZLLL(c1125210fO3);
            }
            this.LLILZIL = null;
        }
    }

    public final C1100420ek4 x1() {
        if (getView() instanceof C1100420ek4) {
            return (C1100420ek4) getView();
        }
        View view = getView();
        if (view != null) {
            return (C1100420ek4) view.findViewById(R.id.mis);
        }
        return null;
    }

    public GiftLeafRootWidget(C212300rp c212300rp) {
        this.LL = c212300rp;
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget
    public final void initConstructor(Object... objArr) {
        super.initConstructor(Arrays.copyOf(objArr, objArr.length));
        this.LL = (C212300rp) objArr[0];
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [X.0ekT, X.0fO3, java.lang.Object] */
    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onLoad(Object[] objArr) {
        C1100690ekV<AbstractC1125260fO8> c1100690ekV;
        Fragment fragment;
        BagListViewModel bagListViewModel;
        long ownerUserId;
        Fragment fragment2;
        BagListViewModel bagListViewModel2;
        if (!LiveBroadcastPictureMemOpt.forbidPreloadInvalidGecko()) {
            C1143680frq.LJJII(C0IPN.LIZ("tiktok_live_basic_resource", "tiktok_live_revenue_demand_4"), "ttlive_gift_group_guide.webp");
        }
        C1143680frq.LJJII(C0IPN.LIZ("tiktok_live_basic_resource", "tiktok_live_revenue_demand_1"), "ttlive_recharge_anim.webp");
        C1100420ek4 c1100420ek4X1 = x1();
        if (c1100420ek4X1 != null) {
            c1100420ek4X1.setFragment(this.widgetCallback.getFragment());
        }
        GiftLeafRootViewModel giftLeafRootViewModelY1 = y1();
        if (giftLeafRootViewModelY1 != null) {
            giftLeafRootViewModelY1.LL = this.dataChannel;
        }
        InterfaceC1097170eep interfaceC1097170eep = this.widgetCallback;
        if (interfaceC1097170eep != null && (fragment2 = interfaceC1097170eep.getFragment()) != null && (bagListViewModel2 = (BagListViewModel) ViewModelProviders.of(fragment2).get(BagListViewModel.class)) != null) {
            bagListViewModel2.LL = this.dataChannel;
        }
        InterfaceC1097170eep interfaceC1097170eep2 = this.widgetCallback;
        if (interfaceC1097170eep2 != null && (fragment = interfaceC1097170eep2.getFragment()) != null && (bagListViewModel = (BagListViewModel) ViewModelProviders.of(fragment).get(BagListViewModel.class)) != null) {
            Fragment fragment3 = this.widgetCallback.getFragment();
            bagListViewModel.LLIZ.LIZ(C784440Upu.LIZ().LJ(C1125100fNs.class).LJJLJLI(new AfS186S0100000_17(bagListViewModel, 144)));
            bagListViewModel.LLIZ.LIZ(C784440Upu.LIZ().LJ(C255000yi.class).LJJLL(new AfS153S0200000_17(fragment3, bagListViewModel, 27), new C09JN() { // from class: X.00N8
                @Override // X.C09JN
                public final /* bridge */ /* synthetic */ void accept(Object obj) {
                    C1C7U.LIZ("BagListViewModel@cb9.onWidgetCreated$3");
                    C1C7U.LIZIZ("BagListViewModel@cb9.onWidgetCreated$3");
                }
            }));
            if (C1121600fIE.LIZLLL()) {
                long jLJJLIIIJ = C500260Jjc.LJJLIIIJ(bagListViewModel.LL);
                Room roomLJJLIIIIJ = C500260Jjc.LJJLIIIIJ(bagListViewModel.LL);
                if (roomLJJLIIIIJ != null) {
                    ownerUserId = roomLJJLIIIIJ.getOwnerUserId();
                } else {
                    ownerUserId = 0;
                }
                bagListViewModel.yQ2(7, jLJJLIIIJ, ownerUserId, UserService.getInstance().user().getCurrentUserId(), null);
            }
        }
        C1128590fTV.LJIJJLI = SystemClock.uptimeMillis();
        C1133380fbE c1133380fbE = new C1133380fbE(this.context);
        this.LLILLJJLI = c1133380fbE;
        C1100420ek4 c1100420ek4X12 = x1();
        if (c1100420ek4X12 != null) {
            c1100420ek4X12.e0(c1133380fbE, null);
        }
        C1128590fTV.LJIL = SystemClock.uptimeMillis();
        ?? r3 = new InterfaceC1100670ekT<AbstractC1125260fO8>() { // from class: X.0fO3
            @Override // X.InterfaceC1100670ekT
            public final void LLZZLLIL(AbstractC1125260fO8 abstractC1125260fO8) {
                Long l;
                AbstractC1100460ek8 c1127390fRZ;
                C1100690ekV<AbstractC1125240fO6> c1100690ekV2;
                List<? extends GiftPage> listLJJJJLI;
                AbstractC1125260fO8 abstractC1125260fO82 = abstractC1125260fO8;
                if (abstractC1125260fO82 instanceof C1125230fO5) {
                    GiftLeafRootWidget giftLeafRootWidget = this.LIZ;
                    Context context = giftLeafRootWidget.context;
                    if (context != null) {
                        int zIndex = EnumC1129580fV6.GIFT_PANEL_LEAF.getZIndex();
                        C1100420ek4 c1100420ek4X13 = giftLeafRootWidget.x1();
                        if (c1100420ek4X13 == null || !c1100420ek4X13.h0(zIndex)) {
                            C1128590fTV.LJIILL = SystemClock.uptimeMillis();
                            C1128710fTh c1128710fTh = new C1128710fTh(context);
                            C1121570fIB c1121570fIB = ((C1125230fO5) abstractC1125260fO82).LIZJ;
                            Fragment fragment4 = null;
                            if (c1121570fIB != null) {
                                l = c1121570fIB.LJJ;
                            } else {
                                l = null;
                            }
                            c1128710fTh.LLLLLZIL = l;
                            C1100420ek4 c1100420ek4X14 = this.LIZ.x1();
                            if (c1100420ek4X14 != null) {
                                c1100420ek4X14.e0(c1128710fTh, null);
                            }
                            C1128590fTV.LJIILLIIL = SystemClock.uptimeMillis();
                            C1128590fTV.LJIIZILJ = SystemClock.uptimeMillis();
                            GiftLeafRootWidget giftLeafRootWidget2 = this.LIZ;
                            InterfaceC1097170eep interfaceC1097170eep3 = giftLeafRootWidget2.widgetCallback;
                            if (interfaceC1097170eep3 != null) {
                                fragment4 = interfaceC1097170eep3.getFragment();
                            }
                            if (LiveGiftPanelTopLeafNewArchSetting.INSTANCE.isEnabled()) {
                                c1127390fRZ = new C1127650fRz(giftLeafRootWidget2.context);
                            } else {
                                c1127390fRZ = new C1127390fRZ(fragment4, giftLeafRootWidget2.context);
                            }
                            c1128710fTh.LJI(R.id.wyj, c1127390fRZ);
                            C1128590fTV.LJIJ = SystemClock.uptimeMillis();
                            C1128590fTV.LJIJI = SystemClock.uptimeMillis();
                            c1128710fTh.LJI(R.id.wyi, new C1124290fMZ(context));
                            C1128590fTV.LJIJJ = SystemClock.uptimeMillis();
                            if (!((IHostPad) C1161920gLG.LIZJ(IHostPad.class)).isPad()) {
                                C1128590fTV.LJJ = SystemClock.uptimeMillis();
                                c1128710fTh.LJI(R.id.bun, new C1125580fOe(context));
                                C1128590fTV.LJJI = SystemClock.uptimeMillis();
                            }
                        }
                        if (this.LIZ.LL.LIZ.isEmpty()) {
                            C212300rp c212300rp = this.LIZ.LL;
                            List<GiftPage> dataFromMemoryCache = GiftManager.inst().getDataFromMemoryCache();
                            if (dataFromMemoryCache != null) {
                                listLJJJJLI = C13LP.LJJJJLI(dataFromMemoryCache);
                            } else {
                                listLJJJJLI = C13BV.INSTANCE;
                            }
                            c212300rp.LIZ = listLJJJJLI;
                        }
                        GiftLeafRootViewModel giftLeafRootViewModelY12 = this.LIZ.y1();
                        if (giftLeafRootViewModelY12 != null && (c1100690ekV2 = giftLeafRootViewModelY12.LLILLL) != null) {
                            C1125230fO5 c1125230fO5 = (C1125230fO5) abstractC1125260fO82;
                            c1100690ekV2.LIZ(new C1125220fO4(c1125230fO5.LIZ, this.LIZ.LL.LIZ, c1125230fO5.LIZIZ, c1125230fO5.LIZJ));
                            return;
                        }
                        return;
                    }
                    return;
                }
                throw new C1954807lC();
            }
        };
        this.LLILZIL = r3;
        GiftLeafRootViewModel giftLeafRootViewModelY12 = y1();
        if (giftLeafRootViewModelY12 != null && (c1100690ekV = giftLeafRootViewModelY12.LLILLJJLI) != null) {
            C2044407ze.LIZ("observer");
            if (!c1100690ekV.LIZ.containsKey(r3)) {
                c1100690ekV.LIZ.put((InterfaceC1100670ekT<T>) r3, new C1100680ekU(r3));
            }
        }
    }
}
