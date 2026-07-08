package com.bytedance.android.livesdk.comp.impl.subscription.business.foundation.packagepage.ui;

import X.C01GW;
import X.C098200Yq;
import X.C0HZQ;
import X.C0K06;
import X.C0KCA;
import X.C0KCF;
import X.C0KDR;
import X.C0KGN;
import X.C0KGS;
import X.C0KI0;
import X.C0KI1;
import X.C0KI2;
import X.C0KI7;
import X.C0KI8;
import X.C0KI9;
import X.C0KIM;
import X.C0KJA;
import X.C1361400lX0;
import X.C13LQ;
import X.C1685300txQ;
import X.C16F5;
import X.C16FS;
import X.C1834150xpV;
import X.C189200o6;
import X.C19EG;
import X.C19GS;
import X.C2097608Jq;
import X.C259800zU;
import X.C452501pT;
import X.C497740JfY;
import X.C500260Jjc;
import X.C514490KFr;
import X.C514620KGe;
import X.C514720KGo;
import X.C514770KGt;
import X.C514850KHb;
import X.C514900KHg;
import X.C514950KHl;
import X.C514960KHm;
import X.C515020KHs;
import X.C515040KHu;
import X.C515050KHv;
import X.C515090KHz;
import X.C515320KIw;
import X.C515330KIx;
import X.C515340KIy;
import X.C515440KJi;
import X.C635860Owq;
import X.C786410Ut5;
import X.EnumC513810KDb;
import X.InterfaceC515600KJy;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.TextView;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.actionhandler.IActionHandlerService;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.android.livesdk.chatroom.api.SubInfo;
import com.bytedance.android.livesdk.chatroom.api.UpdateTips;
import com.bytedance.android.livesdk.comp.api.subscription.api.SubscribeUserInfoResponse;
import com.bytedance.android.livesdk.comp.api.subscription.api.Subscribing;
import com.bytedance.android.livesdk.comp.impl.subscription.business.foundation.packagepage.ui.SubPackageMultiMonthFragment;
import com.bytedance.android.livesdk.comp.impl.subscription.business.foundation.packagepage.viewmodel.PackagePageViewModel;
import com.bytedance.android.livesdk.livesetting.subscription.LiveGiftSubTermsCheckboxSetting;
import com.bytedance.android.livesdk.livesetting.subscription.LiveSubscriptionPaymentTimeCostOptimization;
import com.bytedance.android.livesdk.livesetting.subscription.SubEuRegionSetting;
import com.bytedance.android.livesdk.livesetting.watchlive.LiveSubscribeLynxUrl;
import com.bytedance.android.livesdk.livesetting.watchlive.LiveSubscribeUserFaqNative;
import com.bytedance.android.livesdk.subscribe.model.RefundInfo;
import com.bytedance.android.livesdk.subscribe.model.SubscriptionProductDetailWithTemplateInfo;
import com.bytedance.android.livesdk.ui.BaseFragment;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import webcast.api.sub.OfferInfo;
import webcast.api.sub.TemplateInfo;
import webcast.api.sub.TemplateListData;

/* JADX INFO: loaded from: classes8.dex */
public final class SubPackageMultiMonthFragment extends BaseFragment {
    public static final int LLJJLIIIJLLLLLLLZ = (int) C497740JfY.LIZIZ(12.0f);
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWstJyshJywoZyM6PiA/LSR9KyohOWE6JTUgZzwmKjYvOyYjPCwjJ2ExPTYlJyHELIOSogO2sqJjo9LCQ4ICA9ZjUtKiQyLyA8KCg2ZjAlZxwmKhUtKiQyLyABPCMnIQgjJzs7DjctLiI2JjE=";
    public PackagePageViewModel LLILLJJLI;
    public Map<String, String> LLILZIL;
    public boolean LLILZLL;
    public boolean LLIZ;
    public C0KJA LLIZLLLIL;
    public C16FS LLJ;
    public C0HZQ LLJI;
    public C16F5 LLJIJIL;
    public ViewGroup LLJILJIL;
    public LiveIconView LLJILJILJ;
    public LiveIconView LLJILLL;
    public ObjectAnimator LLJJ;
    public C0KGN LLJJI;
    public boolean LLJJIII;
    public boolean LLJJIJIIJIL;
    public boolean LLJJIJIL;
    public boolean LLJJJ;
    public long LLJJJIL;
    public long LLJJJJ;
    public long LLJJJJJIL;
    public Boolean LLJJJJLIIL;
    public boolean LLJJL;
    public Function0<Unit> LL = new C515440KJi();
    public final C01GW LLILLL = C452501pT.LIZIZ(new C515020KHs());
    public C0KCF LLILZ = new C0KCF(null, null, null, false, 0, null, null, null, null, null, null, null, null, null, null, false, null, false, null, 0, null, null, null, null, null, 0, null, 0, 0, false, -1, 15);
    public final boolean LLJJIJI = SubEuRegionSetting.INSTANCE.isEuRegion();

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        ObjectAnimator objectAnimator = this.LLJJ;
        if (objectAnimator != null) {
            objectAnimator.cancel();
            objectAnimator.removeAllListeners();
        }
        ((Handler) this.LLILLL.getValue()).removeCallbacksAndMessages(null);
        this.LLJJJ = true;
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStart() {
        super.onStart();
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, com.bytedance.android.live.design.resource.theme.LiveThemeAwareFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        getArguments();
        this.LLJJIJIIJIL = Intrinsics.LJFF(this.LLILZ.LIZJ, "sub_change_price_email");
    }

    public final void NR(C514770KGt c514770KGt, boolean z) {
        int i = 0;
        if (c514770KGt == null) {
            c514770KGt = new C514770KGt(i);
        }
        List listLJIJI = C13LQ.LJIJI(new InterfaceC515600KJy[]{new C0KI7(c514770KGt.LJIIJJI), new InterfaceC515600KJy() { // from class: X.0KIx
            public final String LL = "item_package_refund_alert";

            @Override // X.InterfaceC515600KJy
            public final boolean LIZ(InterfaceC515600KJy interfaceC515600KJy) {
                return false;
            }

            @Override // X.InterfaceC515600KJy
            public final String LJJJ() {
                return this.LL;
            }
        }, new InterfaceC515600KJy() { // from class: X.0KIw
            public final String LL = "item_package_sub_plans";

            @Override // X.InterfaceC515600KJy
            public final boolean LIZ(InterfaceC515600KJy interfaceC515600KJy) {
                return false;
            }

            @Override // X.InterfaceC515600KJy
            public final String LJJJ() {
                return this.LL;
            }
        }, new C515090KHz(c514770KGt.LIZLLL), new C0KIM(c514770KGt.LJI), new C0KI9(c514770KGt.LIZ), new C0KI8(c514770KGt), new InterfaceC515600KJy() { // from class: X.0KIy
            public final String LL = "item_package_refund_info";

            @Override // X.InterfaceC515600KJy
            public final boolean LIZ(InterfaceC515600KJy interfaceC515600KJy) {
                return false;
            }

            @Override // X.InterfaceC515600KJy
            public final String LJJJ() {
                return this.LL;
            }
        }});
        C514490KFr c514490KFr = new C514490KFr(c514770KGt, this);
        if (z) {
            C0KJA c0kja = this.LLIZLLLIL;
            if (c0kja != null) {
                C0KJA.LIZIZ(c0kja, listLJIJI, null, new C514950KHl(c514490KFr), 6);
                return;
            }
            return;
        }
        C0KJA c0kja2 = this.LLIZLLLIL;
        if (c0kja2 == null) {
            return;
        }
        C0KJA.LIZJ(c0kja2, listLJIJI, new C514960KHm(c514490KFr));
    }

    /* JADX WARN: Type inference failed for: r0v33, types: [T, X.0KHb] */
    /* JADX WARN: Type inference failed for: r3v1, types: [X.0KGM] */
    @Override // com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(final View view, Bundle bundle) {
        C514770KGt value;
        MutableLiveData<C514770KGt> mutableLiveData;
        MutableLiveData<EnumC513810KDb> mutableLiveData2;
        LiveData<SubscribeUserInfoResponse> liveData;
        LiveData<SubscriptionProductDetailWithTemplateInfo> liveData2;
        LiveData<C514900KHg> liveData3;
        final SubscriptionProductDetailWithTemplateInfo value2;
        TemplateInfo templateInfo;
        LiveData<SubscriptionProductDetailWithTemplateInfo> liveData4;
        MutableLiveData<C514770KGt> mutableLiveData3;
        int i;
        super.onViewCreated(view, bundle);
        this.LLIZLLLIL = (C0KJA) view.findViewById(R.id.pxo);
        this.LLJ = (C16FS) view.findViewById(R.id.whz);
        this.LLJI = (C0HZQ) view.findViewById(R.id.wgw);
        this.LLJIJIL = (C16F5) view.findViewById(R.id.wgx);
        this.LLJILJIL = (ViewGroup) view.findViewById(R.id.xj2);
        this.LLJJI = new C0KGN(this.LLILLJJLI, this.LLILZIL);
        this.LLJILJILJ = (LiveIconView) view.findViewById(R.id.hoq);
        this.LLJILLL = (LiveIconView) view.findViewById(R.id.bn7);
        ((TextView) view.findViewById(R.id.title)).setTextColor(C497740JfY.LIZLLL(R.attr.ewy, view.getContext()));
        LiveIconView liveIconView = this.LLJILJILJ;
        if (liveIconView != null) {
            C786410Ut5.g8(liveIconView, new View.OnClickListener() { // from class: X.0KGn
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    C0KCA.LJ(this.LL.getContext(), LiveSubscribeUserFaqNative.INSTANCE.getValue(), true, Integer.valueOf(view.getHeight()));
                    String str = this.LL.LLILZ.LJII;
                    C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_subscribe_faq_entrance_click");
                    c474500IjALIZ.LJIL();
                    c474500IjALIZ.LJJII(str, "show_entrance");
                    c474500IjALIZ.LIZ();
                }
            });
        }
        final LiveIconView liveIconView2 = this.LLJILLL;
        if (liveIconView2 != null) {
            if (this.LLILZ.LJIILL) {
                i = 0;
            } else {
                i = 8;
            }
            C786410Ut5.LJLLLLLL(i, liveIconView2);
            C786410Ut5.g8(liveIconView2, new View.OnClickListener() { // from class: X.0KCE
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    UpdateTips updateTips;
                    boolean z;
                    String strLIZLLL;
                    MutableLiveData<C514770KGt> mutableLiveData4;
                    C514770KGt value3;
                    MutableLiveData<C514770KGt> mutableLiveData5;
                    C514770KGt value4;
                    MutableLiveData<C514770KGt> mutableLiveData6;
                    C514770KGt value5;
                    PackagePageViewModel packagePageViewModel = this.LL.LLILLJJLI;
                    UpdateTips updateTips2 = null;
                    if (packagePageViewModel != null && (mutableLiveData6 = packagePageViewModel.LLJILJIL) != null && (value5 = mutableLiveData6.getValue()) != null) {
                        updateTips = value5.LJIIJJI;
                    } else {
                        updateTips = null;
                    }
                    if (updateTips != null) {
                        z = true;
                    } else {
                        z = false;
                    }
                    PackagePageViewModel packagePageViewModel2 = this.LL.LLILLJJLI;
                    if (packagePageViewModel2 != null && (mutableLiveData5 = packagePageViewModel2.LLJILJIL) != null && (value4 = mutableLiveData5.getValue()) != null) {
                        updateTips2 = value4.LJIIJJI;
                    }
                    C0KDR.LJIIL(z, "return", updateTips2);
                    this.LL.LL.invoke();
                    PackagePageViewModel packagePageViewModel3 = this.LL.LLILLJJLI;
                    if (packagePageViewModel3 != null && (mutableLiveData4 = packagePageViewModel3.LLJILJIL) != null && (value3 = mutableLiveData4.getValue()) != null && value3.LIZIZ && !Intrinsics.LJFF(this.LL.LLILZ.LJIILLIIL, "user_subscribe_entry") && !Intrinsics.LJFF(this.LL.LLILZ.LJIILLIIL, "user_subscribe_state_five_split")) {
                        return;
                    }
                    C0KCF c0kcf = this.LL.LLILZ;
                    if (c0kcf.LJIIZILJ && C500260Jjc.LJJIIZ(c0kcf.LJIJ)) {
                        ((IActionHandlerService) C1161920gLG.LIZJ(IActionHandlerService.class)).handle(liveIconView2.getContext(), this.LL.LLILZ.LJIJ);
                        return;
                    }
                    SubPackageMultiMonthFragment subPackageMultiMonthFragment = this.LL;
                    if (subPackageMultiMonthFragment.LLILZ.LJIIZILJ) {
                        return;
                    }
                    String scheme = LiveSubscribeLynxUrl.INSTANCE.getValue().getScheme(subPackageMultiMonthFragment.LLILZ.LJIILLIIL);
                    if (scheme.length() == 0 && Intrinsics.LJFF(subPackageMultiMonthFragment.LLILZ.LJIILLIIL, "subscribe_state_scheme")) {
                        scheme = "sslocal://webcast_lynxview?url=https%3A%2F%2Flf16-gecko-source.tiktokcdn.com%2Fobj%2Fbyte-gurd-source-sg%2Ftiktok%2Ffe%2Flive%2Ftiktok_live_revenue_subscription%2Fpages%2Fuser%2Fsubscribe%2Fstate.js&should_full_screen=1&hide_nav_bar=1&hide_status_bar=0&hide_loading=1&trans_status_bar=0&use_spark=1&bd_hybrid_monitor_bid=tiktok_live_revenue%2Fsubscription";
                    }
                    if (scheme.length() == 0) {
                        strLIZLLL = "";
                    } else {
                        C495520Jby c495520Jby = new C495520Jby(scheme);
                        c495520Jby.LIZJ("anchor_id", subPackageMultiMonthFragment.LLILZ.LIZ);
                        c495520Jby.LIZJ("room_id", subPackageMultiMonthFragment.LLILZ.LJIILJJIL);
                        c495520Jby.LIZJ("show_entrance", subPackageMultiMonthFragment.LLILZ.LJII);
                        c495520Jby.LIZ(1, "from_next_page");
                        c495520Jby.LIZJ("log_param", subPackageMultiMonthFragment.LLILZ.LJIJJ);
                        strLIZLLL = c495520Jby.LIZLLL();
                        strLIZLLL.toString();
                    }
                    if (strLIZLLL.length() <= 0) {
                        return;
                    }
                    C0K8F c0k8f = C0K8F.LIZ;
                    Context context = liveIconView2.getContext();
                    c0k8f.getClass();
                    C0K8F.LJII(context, strLIZLLL, null);
                }
            });
        }
        C0KJA c0kja = this.LLIZLLLIL;
        if (c0kja != null) {
            c0kja.setFlashListComponentId("list_view_package_page");
        }
        C0KJA c0kja2 = this.LLIZLLLIL;
        if (c0kja2 != null) {
            c0kja2.setBodyListOverScrollMode(2);
        }
        C0KJA c0kja3 = this.LLIZLLLIL;
        if (c0kja3 != null) {
            final C0KGN c0kgn = this.LLJJI;
            c0kja3.LIZLLL(C2097608Jq.LJIIIIZZ(new Pair(C515320KIw.class, new C0K06<C515320KIw, C0KI0>(c0kgn) { // from class: X.0KGX
                public final C0KGN LIZIZ;

                @Override // X.C0K06
                public final int LJIIIZ() {
                    return R.layout.gbp;
                }

                {
                    this.LIZIZ = c0kgn;
                }

                @Override // X.C0K06
                public final C0K07 LJIIIIZZ(View view2) {
                    return new C0KI0(view2);
                }

                @Override // X.C0K06
                /* JADX INFO: renamed from: LJIIJJI, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
                public final C0KI0 LJIIJ(LayoutInflater layoutInflater, ViewGroup viewGroup) {
                    View viewTd = C786410Ut5.Td(layoutInflater, R.layout.gbp, viewGroup, false);
                    RecyclerView recyclerView = (RecyclerView) viewTd.findViewById(R.id.qlv);
                    if (recyclerView != null) {
                        recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext(), 1, false));
                        recyclerView.setNestedScrollingEnabled(false);
                        recyclerView.setAdapter(this.LIZIZ);
                        String str = SubPackageMultiMonthFragment._pnsPageId;
                        recyclerView.addItemDecoration(new C515010KHr(SubPackageMultiMonthFragment.LLJJLIIIJLLLLLLLZ));
                        recyclerView.setOverScrollMode(2);
                    }
                    return new C0KI0(viewTd);
                }
            }), new Pair(C515090KHz.class, new C0K06<C515090KHz, C515040KHu>() { // from class: X.0KHt
                @Override // X.C0K06
                public final int LJIIIZ() {
                    return R.layout.gbn;
                }

                @Override // X.C0K06
                public final C0K07 LJIIIIZZ(final View view2) {
                    return new C0K07<C515090KHz>(view2) { // from class: X.0KHu
                        public final C16F5 LL;

                        {
                            super(view2);
                            this.LL = (C16F5) view2.findViewById(R.id.pi8);
                        }

                        @Override // X.C0K07
                        public final void I5(InterfaceC515600KJy interfaceC515600KJy) {
                            this.LL.setText(((C515090KHz) interfaceC515600KJy).LLILLJJLI);
                        }
                    };
                }
            }), new Pair(C0KIM.class, new C0K06<C0KIM, C515050KHv>() { // from class: X.0KHw
                @Override // X.C0K06
                public final int LJIIIZ() {
                    return R.layout.gbs;
                }

                @Override // X.C0K06
                public final C0K07 LJIIIIZZ(View view2) {
                    return new C0K07<C0KIM>(view2) { // from class: X.0KHv
                        public final C16F5 LL;

                        {
                            super(view2);
                            this.LL = (C16F5) view2.findViewById(R.id.be_);
                        }

                        @Override // X.C0K07
                        public final void I5(InterfaceC515600KJy interfaceC515600KJy) {
                            String strLJIIL;
                            C16F5 c16f5 = this.LL;
                            int i2 = ((C0KIM) interfaceC515600KJy).LLILLJJLI;
                            if (i2 == 1) {
                                strLJIIL = C497740JfY.LJIJI(2131844439);
                            } else {
                                strLJIIL = C497740JfY.LJIIL(2131755807, i2, Integer.valueOf(i2));
                            }
                            c16f5.setText(strLJIIL);
                        }
                    };
                }
            }), new Pair(C0KI9.class, new C0K06<C0KI9, C0KGS>() { // from class: X.0KHk
                @Override // X.C0K06
                public final int LJIIIZ() {
                    return R.layout.gbt;
                }

                @Override // X.C0K06
                public final C0K07 LJIIIIZZ(View view2) {
                    return new C0K07<C0KI9>(view2) { // from class: X.0KGS
                        public final C16F5 LL;

                        {
                            super(view2);
                            this.LL = (C16F5) view2.findViewById(R.id.he7);
                        }

                        @Override // X.C0K07
                        public final void I5(InterfaceC515600KJy interfaceC515600KJy) {
                            String strLJIIL;
                            C0KI9 c0ki9 = (C0KI9) interfaceC515600KJy;
                            SubInfo subInfo = c0ki9.LLILLJJLI;
                            if (subInfo != null) {
                                long jLongValue = subInfo.subStartTime.longValue();
                                SimpleDateFormat simpleDateFormat = C963140bAe.LIZ;
                                String str = simpleDateFormat.format(new Date(jLongValue));
                                str.toString();
                                String str2 = simpleDateFormat.format(new Date(subInfo.subEndTime.longValue()));
                                str2.toString();
                                int i2 = subInfo.renewalPeriod;
                                if (i2 == 1) {
                                    strLJIIL = C497740JfY.LJIJJ(2131844393, Integer.valueOf(c0ki9.LLILLJJLI.renewalPeriod), str, str2);
                                } else {
                                    strLJIIL = C497740JfY.LJIIL(2131755914, c0ki9.LLILLJJLI.renewalPeriod, Integer.valueOf(i2), str, str2);
                                }
                                this.LL.setText(strLJIIL);
                            }
                        }
                    };
                }
            }), new Pair(C0KI8.class, new C0K06<C0KI8, C514720KGo>() { // from class: X.0KHj
                @Override // X.C0K06
                public final int LJIIIZ() {
                    return R.layout.gbj;
                }

                @Override // X.C0K06
                public final C0K07 LJIIIIZZ(View view2) {
                    return new C0K07<C0KI8>(view2) { // from class: X.0KGo
                        public final C16F5 LL;

                        {
                            super(view2);
                            this.LL = (C16F5) view2.findViewById(R.id.bea);
                        }

                        @Override // X.C0K07
                        public final void I5(InterfaceC515600KJy interfaceC515600KJy) {
                            String strLJIIL;
                            C16F5 c16f5 = this.LL;
                            C514770KGt c514770KGt = ((C0KI8) interfaceC515600KJy).LLILLJJLI;
                            if (c514770KGt.LJIIIIZZ) {
                                strLJIIL = C497740JfY.LJIJJ(2131830312, c514770KGt.LJIIIZ);
                            } else {
                                int i2 = c514770KGt.LJI;
                                strLJIIL = C497740JfY.LJIIL(2131755522, i2, Integer.valueOf(i2));
                            }
                            c16f5.setText(strLJIIL);
                        }
                    };
                }
            }), new Pair(C515330KIx.class, new C0K06<C515330KIx, C0KI1>() { // from class: X.0KHx
                @Override // X.C0K06
                public final int LJIIIZ() {
                    return R.layout.gbr;
                }

                @Override // X.C0K06
                public final C0K07 LJIIIIZZ(final View view2) {
                    return new C0K07<C515330KIx>(view2) { // from class: X.0KI1
                        @Override // X.C0K07
                        public final /* bridge */ /* synthetic */ void I5(InterfaceC515600KJy interfaceC515600KJy) {
                        }
                    };
                }
            }), new Pair(C515340KIy.class, new C0K06<C515340KIy, C0KI2>() { // from class: X.0KHy
                @Override // X.C0K06
                public final int LJIIIZ() {
                    return R.layout.gbi;
                }

                @Override // X.C0K06
                public final C0K07 LJIIIIZZ(final View view2) {
                    return new C0K07<C515340KIy>(view2) { // from class: X.0KI2
                        @Override // X.C0K07
                        public final /* bridge */ /* synthetic */ void I5(InterfaceC515600KJy interfaceC515600KJy) {
                        }
                    };
                }
            }), new Pair(C0KI7.class, new C0K06<C0KI7, C514620KGe>() { // from class: X.0KHi
                @Override // X.C0K06
                public final int LJIIIZ() {
                    return R.layout.gbh;
                }

                @Override // X.C0K06
                public final C0K07 LJIIIIZZ(View view2) {
                    return new C0K07<C0KI7>(view2) { // from class: X.0KGe
                        public final C16F5 LL;

                        {
                            super(view2);
                            this.LL = (C16F5) view2.findViewById(R.id.pfs);
                        }

                        @Override // X.C0K07
                        public final void I5(InterfaceC515600KJy interfaceC515600KJy) {
                            UpdateTips updateTips = ((C0KI7) interfaceC515600KJy).LLILLJJLI;
                            if (updateTips != null) {
                                C16F5 c16f5 = this.LL;
                                if (c16f5 != null) {
                                    C786410Ut5.LLJJJJ(c16f5, 0);
                                }
                                C16F5 c16f52 = this.LL;
                                if (c16f52 != null) {
                                    c16f52.setText(C0KCA.LIZ(updateTips, c16f52.getContext(), false));
                                }
                                C16F5 c16f53 = this.LL;
                                if (c16f53 != null) {
                                    c16f53.setMovementMethod(LinkMovementMethod.getInstance());
                                }
                            }
                        }
                    };
                }
            })));
        }
        PackagePageViewModel packagePageViewModel = this.LLILLJJLI;
        if (packagePageViewModel != null && (mutableLiveData3 = packagePageViewModel.LLJILJIL) != null) {
            value = mutableLiveData3.getValue();
        } else {
            value = null;
        }
        NR(value, true);
        final C16FS c16fs = this.LLJ;
        if (c16fs != null) {
            c16fs.setRadius((int) C497740JfY.LIZIZ(8.0f));
            C786410Ut5.h8(c16fs, new View.OnClickListener() { // from class: X.0KGC
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    TemplateInfo templateInfo2;
                    LiveData<SubscriptionProductDetailWithTemplateInfo> liveData5;
                    SubscriptionProductDetailWithTemplateInfo value3;
                    LiveData<SubscriptionProductDetailWithTemplateInfo> liveData6;
                    SubscriptionProductDetailWithTemplateInfo value4;
                    SubPackageMultiMonthFragment subPackageMultiMonthFragment = this.LL;
                    String str = subPackageMultiMonthFragment.LLILZ.LJII;
                    Map<String, String> map = subPackageMultiMonthFragment.LLILZIL;
                    PackagePageViewModel packagePageViewModel2 = subPackageMultiMonthFragment.LLILLJJLI;
                    if (packagePageViewModel2 != null && (liveData6 = packagePageViewModel2.LLIZ) != null && (value4 = liveData6.getValue()) != null) {
                        templateInfo2 = value4.getTemplateInfo();
                    } else {
                        templateInfo2 = null;
                    }
                    SubPackageMultiMonthFragment subPackageMultiMonthFragment2 = this.LL;
                    C0KDR.LJIIJ(str, map, templateInfo2, subPackageMultiMonthFragment2.LLJJIII, subPackageMultiMonthFragment2.LLILZ.LJIIIIZZ);
                    SubPackageMultiMonthFragment subPackageMultiMonthFragment3 = this.LL;
                    boolean zBooleanValue = false;
                    if (!subPackageMultiMonthFragment3.LLJJIII) {
                        C766270U4b.LIZLLL(2131854934);
                        LiveGiftSubTermsCheckboxSetting liveGiftSubTermsCheckboxSetting = LiveGiftSubTermsCheckboxSetting.INSTANCE;
                        if (liveGiftSubTermsCheckboxSetting.getValue() == liveGiftSubTermsCheckboxSetting.getSHAKE()) {
                            SubPackageMultiMonthFragment subPackageMultiMonthFragment4 = this.LL;
                            subPackageMultiMonthFragment4.getClass();
                            float fLIZIZ = (int) C497740JfY.LIZIZ(12.0f);
                            float f = -fLIZIZ;
                            subPackageMultiMonthFragment4.LLJJ = ObjectAnimator.ofFloat(subPackageMultiMonthFragment4.LLJILJIL, "translationX", 0.0f, f, fLIZIZ, f, fLIZIZ, 0.0f).setDuration(200L);
                            ObjectAnimator objectAnimator = subPackageMultiMonthFragment4.LLJJ;
                            if (objectAnimator != null) {
                                C786410Ut5.Pd(objectAnimator);
                            }
                            C0KEG.LIZ(subPackageMultiMonthFragment4.getContext());
                            return;
                        }
                        return;
                    }
                    PackagePageViewModel packagePageViewModel3 = subPackageMultiMonthFragment3.LLILLJJLI;
                    if (packagePageViewModel3 != null && (liveData5 = packagePageViewModel3.LLIZ) != null && (value3 = liveData5.getValue()) != null) {
                        long jCurrentTimeMillis = System.currentTimeMillis() - this.LL.LLJJJIL;
                        long jCurrentTimeMillis2 = System.currentTimeMillis() - this.LL.LLJJJJ;
                        long jCurrentTimeMillis3 = System.currentTimeMillis();
                        SubPackageMultiMonthFragment subPackageMultiMonthFragment5 = this.LL;
                        long j = jCurrentTimeMillis3 - subPackageMultiMonthFragment5.LLJJJJJIL;
                        String str2 = subPackageMultiMonthFragment5.LLILZ.LJII;
                        Map<String, String> map2 = subPackageMultiMonthFragment5.LLILZIL;
                        TemplateInfo templateInfo3 = value3.getTemplateInfo();
                        Boolean bool = this.LL.LLJJJJLIIL;
                        if (bool != null) {
                            zBooleanValue = bool.booleanValue();
                        }
                        C0KDR.LJIIJJI(str2, map2, templateInfo3, jCurrentTimeMillis, j, zBooleanValue, jCurrentTimeMillis2, this.LL.LLILZ.LJIIIIZZ);
                        SubPackageMultiMonthFragment subPackageMultiMonthFragment6 = this.LL;
                        PackagePageViewModel packagePageViewModel4 = subPackageMultiMonthFragment6.LLILLJJLI;
                        if (packagePageViewModel4 != null) {
                            packagePageViewModel4.LLJIJIL.setValue(EnumC513810KDb.PAY_INPROGRESS);
                        }
                        C16FS c16fs2 = subPackageMultiMonthFragment6.LLJ;
                        if (c16fs2 != null) {
                            c16fs2.LJ();
                        }
                        PackagePageViewModel packagePageViewModel5 = this.LL.LLILLJJLI;
                        if (packagePageViewModel5 != null) {
                            Context context = c16fs.getContext();
                            SubPackageMultiMonthFragment subPackageMultiMonthFragment7 = this.LL;
                            C0KCF c0kcf = subPackageMultiMonthFragment7.LLILZ;
                            packagePageViewModel5.xQ2(context, value3, c0kcf.LIZ, c0kcf.LIZJ, subPackageMultiMonthFragment7.LLILZIL, c0kcf.LJIJJLI, EnumC513390KBl.PACKAGE_PAGE, false);
                        }
                    }
                }
            });
        }
        final C0HZQ c0hzq = this.LLJI;
        if (c0hzq != null) {
            PackagePageViewModel packagePageViewModel2 = this.LLILLJJLI;
            if (packagePageViewModel2 != null && (liveData4 = packagePageViewModel2.LLIZ) != null) {
                value2 = liveData4.getValue();
            } else {
                value2 = null;
            }
            LiveGiftSubTermsCheckboxSetting liveGiftSubTermsCheckboxSetting = LiveGiftSubTermsCheckboxSetting.INSTANCE;
            if (liveGiftSubTermsCheckboxSetting.getValue() == liveGiftSubTermsCheckboxSetting.getHIDE()) {
                C500260Jjc.LJIILIIL(c0hzq);
                this.LLJJIII = true;
                this.LLJJJJ = System.currentTimeMillis();
                String str = this.LLILZ.LJII;
                if (value2 != null) {
                    templateInfo = value2.getTemplateInfo();
                } else {
                    templateInfo = null;
                }
                C0KDR.LIZIZ(str, templateInfo, liveGiftSubTermsCheckboxSetting.getHIDE());
            } else {
                C500260Jjc.LLFFF(c0hzq);
                C786410Ut5.D7(c0hzq, new CompoundButton.OnCheckedChangeListener() { // from class: X.0KGR
                    @Override // android.widget.CompoundButton.OnCheckedChangeListener
                    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                        TemplateInfo templateInfo2;
                        LiveData<SubscriptionProductDetailWithTemplateInfo> liveData5;
                        SubscriptionProductDetailWithTemplateInfo value3;
                        PackagePageViewModel packagePageViewModel3;
                        SubPackageMultiMonthFragment subPackageMultiMonthFragment = this.LL;
                        subPackageMultiMonthFragment.LLJJIII = z;
                        if (z) {
                            subPackageMultiMonthFragment.LLJJJJ = System.currentTimeMillis();
                            String str2 = this.LL.LLILZ.LJII;
                            SubscriptionProductDetailWithTemplateInfo subscriptionProductDetailWithTemplateInfo = value2;
                            if (subscriptionProductDetailWithTemplateInfo != null) {
                                templateInfo2 = subscriptionProductDetailWithTemplateInfo.getTemplateInfo();
                            } else {
                                templateInfo2 = null;
                            }
                            C0KDR.LIZIZ(str2, templateInfo2, LiveGiftSubTermsCheckboxSetting.INSTANCE.getValue());
                            if (!this.LL.LLJJL && LiveSubscriptionPaymentTimeCostOptimization.enablePaymentTimeCostOptimization()) {
                                SubPackageMultiMonthFragment subPackageMultiMonthFragment2 = this.LL;
                                subPackageMultiMonthFragment2.LLJJL = true;
                                PackagePageViewModel packagePageViewModel4 = subPackageMultiMonthFragment2.LLILLJJLI;
                                if (packagePageViewModel4 != null && (liveData5 = packagePageViewModel4.LLIZ) != null && (value3 = liveData5.getValue()) != null && (packagePageViewModel3 = this.LL.LLILLJJLI) != null) {
                                    Context context = c0hzq.getContext();
                                    SubPackageMultiMonthFragment subPackageMultiMonthFragment3 = this.LL;
                                    C0KCF c0kcf = subPackageMultiMonthFragment3.LLILZ;
                                    packagePageViewModel3.xQ2(context, value3, c0kcf.LIZ, c0kcf.LIZJ, subPackageMultiMonthFragment3.LLILZIL, c0kcf.LJIJJLI, EnumC513390KBl.PACKAGE_PAGE, true);
                                }
                            }
                        }
                    }
                });
                C635860Owq.LIZ.LIZJ(8, c0hzq);
            }
        }
        C16F5 c16f5 = this.LLJIJIL;
        if (c16f5 != null) {
            c16f5.setText(C0KCA.LIZIZ(c16f5.getContext(), getContext(), null));
        }
        C16F5 c16f52 = this.LLJIJIL;
        if (c16f52 != null) {
            c16f52.setMovementMethod(LinkMovementMethod.getInstance());
        }
        C16F5 c16f53 = this.LLJIJIL;
        if (c16f53 != null) {
            c16f53.setHighlightColor(0);
        }
        PackagePageViewModel packagePageViewModel3 = this.LLILLJJLI;
        if (packagePageViewModel3 != null && (liveData3 = packagePageViewModel3.LLILZIL) != null) {
            liveData3.observe(getViewLifecycleOwner(), new Observer() { // from class: X.0KGA
                @Override // androidx.lifecycle.Observer
                public final void onChanged(Object obj) {
                    boolean zLIZ;
                    String strLIZ;
                    RefundInfo refundInfo;
                    C0KH1 c0kh1;
                    TemplateListData templateListData;
                    C0KH1 c0kh12;
                    TemplateListData templateListData2;
                    String str2;
                    Long lLJJLIL;
                    C0KH1 c0kh13;
                    C0KH1 c0kh14;
                    List<SubscriptionProductDetailWithTemplateInfo> list;
                    OfferInfo offerInfoLJII;
                    C514900KHg c514900KHg = (C514900KHg) obj;
                    boolean z = false;
                    List<UpdateTips> list2 = null;
                    if (c514900KHg != null && (list = c514900KHg.LIZ) != null) {
                        SubPackageMultiMonthFragment subPackageMultiMonthFragment = this.LL;
                        zLIZ = C513940KDo.LIZ(list);
                        C0KGN c0kgn2 = subPackageMultiMonthFragment.LLJJI;
                        if (c0kgn2 != null) {
                            boolean z2 = subPackageMultiMonthFragment.LLJJIJIIJIL;
                            c0kgn2.LLILZIL = list;
                            c0kgn2.LLILLL = z2;
                            c0kgn2.notifyDataSetChanged();
                        }
                        subPackageMultiMonthFragment.LLJJJIL = System.currentTimeMillis();
                        if (zLIZ && (offerInfoLJII = C513940KDo.LJII(list)) != null) {
                            strLIZ = C513990KDt.LIZ(offerInfoLJII, null);
                        } else {
                            strLIZ = null;
                        }
                    } else {
                        zLIZ = false;
                        strLIZ = null;
                    }
                    SubPackageMultiMonthFragment subPackageMultiMonthFragment2 = this.LL;
                    if (c514900KHg != null && (((c0kh13 = c514900KHg.LIZJ) != null && c0kh13.LIZJ == 3) || ((c0kh14 = c514900KHg.LIZJ) != null && c0kh14.LIZJ == 1))) {
                        z = true;
                    }
                    subPackageMultiMonthFragment2.LLIZ = z;
                    if (z && subPackageMultiMonthFragment2.LLJJIJI) {
                        Map<String, String> map = subPackageMultiMonthFragment2.LLILZIL;
                        if (map != null && (str2 = map.get("room_id")) != null && (lLJJLIL = C500260Jjc.LJJLIL(str2)) != null) {
                            lLJJLIL.longValue();
                        }
                        SubPackageMultiMonthFragment subPackageMultiMonthFragment3 = this.LL;
                        PackagePageViewModel packagePageViewModel4 = subPackageMultiMonthFragment3.LLILLJJLI;
                        if (packagePageViewModel4 != null) {
                            String str3 = subPackageMultiMonthFragment3.LLILZ.LIZ;
                            packagePageViewModel4.getClass();
                            packagePageViewModel4.LLIZLLLIL.setValue(str3);
                        }
                    }
                    SubPackageMultiMonthFragment subPackageMultiMonthFragment4 = this.LL;
                    PackagePageViewModel packagePageViewModel5 = subPackageMultiMonthFragment4.LLILLJJLI;
                    if (packagePageViewModel5 != null) {
                        Boolean boolValueOf = Boolean.valueOf(subPackageMultiMonthFragment4.LLIZ);
                        Boolean boolValueOf2 = Boolean.valueOf(zLIZ);
                        if (c514900KHg != null && (c0kh12 = c514900KHg.LIZJ) != null && (templateListData2 = c0kh12.LIZ) != null) {
                            refundInfo = templateListData2.refundInfo;
                        } else {
                            refundInfo = null;
                        }
                        if (c514900KHg != null && (c0kh1 = c514900KHg.LIZJ) != null && (templateListData = c0kh1.LIZ) != null) {
                            list2 = templateListData.transactionTips;
                        }
                        PackagePageViewModel.wQ2(packagePageViewModel5, null, boolValueOf, null, strLIZ, boolValueOf2, refundInfo, null, null, null, list2, 928);
                    }
                }
            });
        }
        PackagePageViewModel packagePageViewModel4 = this.LLILLJJLI;
        if (packagePageViewModel4 != null && (liveData2 = packagePageViewModel4.LLIZ) != null) {
            liveData2.observe(getViewLifecycleOwner(), new Observer() { // from class: X.0KGB
                /* JADX WARN: Removed duplicated region for block: B:81:0x011b  */
                @Override // androidx.lifecycle.Observer
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final void onChanged(java.lang.Object r23) {
                    /*
                        Method dump skipped, instruction units count: 319
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C0KGB.onChanged(java.lang.Object):void");
                }
            });
        }
        PackagePageViewModel packagePageViewModel5 = this.LLILLJJLI;
        if (packagePageViewModel5 != null && (liveData = packagePageViewModel5.LLJ) != null) {
            liveData.observe(getViewLifecycleOwner(), new Observer() { // from class: X.0KCa
                @Override // androidx.lifecycle.Observer
                public final void onChanged(Object obj) {
                    Subscribing subscribing;
                    SubInfo subInfo;
                    PackagePageViewModel packagePageViewModel6;
                    SubscribeUserInfoResponse subscribeUserInfoResponse = (SubscribeUserInfoResponse) obj;
                    if (subscribeUserInfoResponse != null && (subscribing = subscribeUserInfoResponse.subscribing) != null && (subInfo = subscribing.subInfo) != null && (packagePageViewModel6 = this.LL.LLILLJJLI) != null) {
                        PackagePageViewModel.wQ2(packagePageViewModel6, subInfo, null, null, null, null, null, null, null, null, null, 2016);
                    }
                }
            });
        }
        final C259800zU c259800zU = new C259800zU();
        final ?? r3 = new Observer() { // from class: X.0KGM
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                Function0<Unit> function0;
                if (((C0KIP) obj).LIZJ == 1) {
                    SubPackageMultiMonthFragment subPackageMultiMonthFragment = this.LL;
                    C0KCA.LIZLLL(subPackageMultiMonthFragment.LLILZ, Boolean.valueOf(subPackageMultiMonthFragment.LLILZLL), this.LL.getContext());
                    SubPackageMultiMonthFragment subPackageMultiMonthFragment2 = this.LL;
                    PackagePageViewModel packagePageViewModel6 = subPackageMultiMonthFragment2.LLILLJJLI;
                    if (packagePageViewModel6 != null) {
                        packagePageViewModel6.LLJIJIL.setValue(EnumC513810KDb.PAY_ENDED);
                    }
                    C16FS c16fs2 = subPackageMultiMonthFragment2.LLJ;
                    if (c16fs2 != null) {
                        c16fs2.LJIIL();
                    }
                    subPackageMultiMonthFragment2.LL.invoke();
                } else {
                    SubPackageMultiMonthFragment subPackageMultiMonthFragment3 = this.LL;
                    PackagePageViewModel packagePageViewModel7 = subPackageMultiMonthFragment3.LLILLJJLI;
                    if (packagePageViewModel7 != null) {
                        packagePageViewModel7.LLJIJIL.setValue(EnumC513810KDb.PAY_ENDED);
                    }
                    C16FS c16fs3 = subPackageMultiMonthFragment3.LLJ;
                    if (c16fs3 != null) {
                        c16fs3.LJIIL();
                    }
                }
                if (this.LL.LLJJJ && (function0 = c259800zU.element) != null) {
                    function0.invoke();
                }
            }
        };
        c259800zU.element = new C514850KHb(this, r3);
        PackagePageViewModel packagePageViewModel6 = this.LLILLJJLI;
        if (packagePageViewModel6 != null && (mutableLiveData2 = packagePageViewModel6.LLJIJIL) != null) {
            mutableLiveData2.observe(getViewLifecycleOwner(), new Observer() { // from class: X.0KGg
                @Override // androidx.lifecycle.Observer
                public final void onChanged(Object obj) {
                    PackagePageViewModel packagePageViewModel7;
                    MutableLiveData<C0KIP> mutableLiveData4;
                    boolean zLJIIJ = C513940KDo.LJIIJ((EnumC513810KDb) obj);
                    C0HZQ c0hzq2 = this.LL.LLJI;
                    if (c0hzq2 != null) {
                        c0hzq2.setClickable(!zLJIIJ);
                    }
                    C16FS c16fs2 = this.LL.LLJ;
                    if (c16fs2 != null) {
                        c16fs2.setClickable(!zLJIIJ);
                    }
                    if (zLJIIJ && (packagePageViewModel7 = this.LL.LLILLJJLI) != null && (mutableLiveData4 = packagePageViewModel7.LLJI) != null) {
                        mutableLiveData4.observeForever(r3);
                    }
                }
            });
        }
        PackagePageViewModel packagePageViewModel7 = this.LLILLJJLI;
        if (packagePageViewModel7 != null && (mutableLiveData = packagePageViewModel7.LLJILJIL) != null) {
            mutableLiveData.observe(getViewLifecycleOwner(), new Observer() { // from class: X.0KH5
                @Override // androidx.lifecycle.Observer
                public final void onChanged(Object obj) {
                    final C514770KGt c514770KGt = (C514770KGt) obj;
                    Handler handler = (Handler) this.LL.LLILLL.getValue();
                    final SubPackageMultiMonthFragment subPackageMultiMonthFragment = this.LL;
                    C786410Ut5.LJJZZIII(handler, new Runnable() { // from class: X.0KHT
                        @Override // java.lang.Runnable
                        public final void run() {
                            boolean zLIZ;
                            C1C7U.LIZ("SubPackageMultiMonthFragment@32ed.initView$9$1");
                            try {
                                subPackageMultiMonthFragment.NR(c514770KGt, false);
                            } finally {
                                if (!zLIZ) {
                                }
                            }
                            C1C7U.LIZIZ("SubPackageMultiMonthFragment@32ed.initView$9$1");
                        }
                    });
                }
            });
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i;
        if (C1834150xpV.LJI(getContext())) {
            i = R.style.uy;
        } else {
            i = R.style.v0;
        }
        View viewTd = C786410Ut5.Td(layoutInflater.cloneInContext(new C1361400lX0(requireActivity(), i)), R.layout.gbl, viewGroup, false);
        C19GS c19gs = null;
        if (!(viewTd instanceof View)) {
            viewTd = null;
        }
        if (viewTd != null) {
            try {
                ViewTreeLifecycleOwner.set(viewTd, getViewLifecycleOwner());
                ViewTreeViewModelStoreOwner.set(viewTd, this);
                viewTd.setTag(R.id.view_tree_saved_state_registry_owner, this);
                C19EG activity = getActivity();
                if (activity instanceof C19GS) {
                    c19gs = (C19GS) activity;
                }
                C1685300txQ.LIZ(c19gs);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
                return viewTd;
            }
        }
        C189200o6.m2constructorimpl(Unit.LIZ);
        return viewTd;
    }
}
