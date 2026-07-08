package com.ss.android.ugc.aweme.ecommerce.base.address.list;

import X.AnonymousClass0317;
import X.AnonymousClass0408;
import X.C013C;
import X.C019F;
import X.C01GW;
import X.C034S;
import X.C036A;
import X.C049Y;
import X.C0OM1;
import X.C10508049a;
import X.C1120604Zw;
import X.C1121904a9;
import X.C118300cf;
import X.C1250250idj;
import X.C1251150ifB;
import X.C1308910kAL;
import X.C1323030kX7;
import X.C1391190mJ3;
import X.C1397510mTF;
import X.C1397580mTM;
import X.C1397620mTQ;
import X.C13LE;
import X.C1637806bA;
import X.C1741890vQh;
import X.C1748720vbi;
import X.C197039127h;
import X.C19719912Dl;
import X.C19EG;
import X.C1AQS;
import X.C2095008Iq;
import X.C2097608Jq;
import X.C2217381BqS;
import X.C2371409Qy;
import X.C259800zU;
import X.C343970De7;
import X.C452501pT;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C786410Ut5;
import X.C862003Yk;
import X.C928203k0;
import X.C955103oL;
import X.EnumC955203oM;
import X.InterfaceC1164530gPT;
import X.InterfaceC2217461Bqa;
import X.InterfaceC990303u1;
import X.InterfaceC990403u2;
import X.ViewOnAttachStateChangeListenerC20604515jv;
import android.content.Context;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.View;
import android.view.Window;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.navigation.TuxNavBar;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.google.gson.s;
import com.ss.android.ugc.aweme.ecommerce.api.model.ExceptionUX;
import com.ss.android.ugc.aweme.ecommerce.base.address.AddressPageStarter;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.NoticeDialogMessage;
import com.ss.android.ugc.aweme.ecommerce.base.address.list.AddressListState;
import com.ss.android.ugc.aweme.ecommerce.core.engine.IComponentStrategyService;
import com.ss.android.ugc.aweme.ecommerce.dependency.live.LiveDependencyService;
import com.ss.android.ugc.aweme.ecommerce.dependency.performanceopt.PerformanceOptDependencyService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.IECommerceHostService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.live.ILiveDependencyService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.performanceopt.IPerformanceOptDependencyService;
import com.ss.android.ugc.aweme.ecommerce.service.IEventCenter;
import com.ss.android.ugc.aweme.ecommerce.tts.addresslist.us.UsAddressListAssemViewModel;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.zhiliaoapp.musically.R;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS228S0000000_1;
import kotlin.jvm.internal.AFwS284S0000000_1;
import kotlin.jvm.internal.AwS210S0300000_1;
import kotlin.jvm.internal.AwS367S0200000_1;
import kotlin.jvm.internal.AwS545S0100000_1;
import kotlin.jvm.internal.AwS580S0100000_1;
import kotlin.jvm.internal.AwS615S0100000_1;
import kotlin.jvm.internal.Intrinsics;
import p8b.c;

/* JADX INFO: loaded from: classes2.dex */
public final class AddressListPanelAssem extends UIContentAssem implements c, InterfaceC1164530gPT, InterfaceC990403u2, InterfaceC990303u1 {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJJJLIIL;
    public TuxNavBar LLIZLLLIL;
    public LinearLayout LLJ;
    public C197039127h LLJI;
    public TuxTextView LLJIJIL;
    public final AssemVMLazy LLJILJIL;
    public final C01GW LLJILJILJ;
    public final C01GW LLJILLL;
    public ViewOnAttachStateChangeListenerC20604515jv LLJJ;
    public int LLJJI;
    public long LLJJIII;
    public boolean LLJJIJI;
    public String LLJJIJIIJIL;
    public boolean LLJJIJIL;
    public int LLJJJ;
    public int LLJJJIL;
    public long LLJJJJ;
    public String LLJJJJJIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(AddressListPanelAssem.class, "viewModel", "getViewModel()Lcom/ss/android/ugc/aweme/ecommerce/base/address/list/AddressListAssemViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJJJJLIIL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public AddressListPanelAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(AddressListAssemViewModel.class);
        this.LLJILJIL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new AwS545S0100000_1(c19719912DlLIZ, 52), AFwS228S0000000_1.get$arr$(39), null, true);
        this.LLJILJILJ = C452501pT.LIZIZ(new AwS545S0100000_1(this, 50));
        this.LLJILLL = C452501pT.LIZIZ(new AwS545S0100000_1(this, 53));
        this.LLJJI = 1;
        this.LLJJIJI = true;
        this.LLJJIJIIJIL = "other reason";
        this.LLJJIJIL = true;
        this.LLJJJJ = -1L;
        this.LLJJJJJIL = "normal_checkout";
    }

    @Override // p8b.c
    public final String getViewName() {
        return "AddressListPanelAssem";
    }

    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onPause_isOnPauseEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onResume_isOnResumeEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onStart_isOnStartEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onStop_isOnStopEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    public final C197039127h Go() {
        View viewFindViewById = this.LLJI;
        if (viewFindViewById == null) {
            View viewLJJIJL = LJJIJL();
            viewFindViewById = viewLJJIJL != null ? viewLJJIJL.findViewById(R.id.caj) : null;
            this.LLJI = (C197039127h) viewFindViewById;
        }
        return (C197039127h) viewFindViewById;
    }

    public final AddressListPanelAssemFragment Ho() {
        return (AddressListPanelAssemFragment) this.LLJILJILJ.getValue();
    }

    public final TuxNavBar Jo() {
        View viewFindViewById = this.LLIZLLLIL;
        if (viewFindViewById == null) {
            View viewLJJIJL = LJJIJL();
            viewFindViewById = viewLJJIJL != null ? viewLJJIJL.findViewById(R.id.xzl) : null;
            this.LLIZLLLIL = (TuxNavBar) viewFindViewById;
        }
        return (TuxNavBar) viewFindViewById;
    }

    public final AddressListAssemViewModel Lo() {
        AssemVMLazy assemVMLazy = this.LLJILJIL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJJJLIIL;
        return (AddressListAssemViewModel) assemVMLazy.getValue();
    }

    public final void LLJJJJLIIL() {
        C1748720vbi.LIZLLL(Jo(), new C049Y(), new AwS580S0100000_1(this, 58));
        AddressListPanelAssemFragment addressListPanelAssemFragmentHo = Ho();
        if (addressListPanelAssemFragmentHo != null) {
            String str = TuxSheet._pnsPageId;
            C1391190mJ3.LJFF(addressListPanelAssemFragmentHo, C343970De7.LIZ);
            addressListPanelAssemFragmentHo.onDestroy();
        }
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onDestroy() {
        super.onDestroy();
        ((IEventCenter) ServiceManager.get().getService(IEventCenter.class)).LIZJ("ec_address_change", this);
        ((IEventCenter) ServiceManager.get().getService(IEventCenter.class)).LIZJ("ec_show_notice_dialog", this);
        IEventCenter iEventCenter = (IEventCenter) PluggableExtentionKt.pluggableSpi$default(IEventCenter.class, false, false, false, 14, null);
        if (iEventCenter != null) {
            iEventCenter.LIZJ("ec_show_notice_exception_ux_dialog", this);
        }
    }

    @Override // X.AbstractC738140SxQ
    public final void onPause() {
        AnonymousClass0317 anonymousClass0317CreateILiveDependencyServicebyMonsterPlugin;
        super.onPause();
        if (C034S.LIZ()) {
            C1120604Zw.LIZ.LIZ();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            anonymousClass0317CreateILiveDependencyServicebyMonsterPlugin = LiveDependencyService.createILiveDependencyServicebyMonsterPlugin(false);
            C1AQS.LIZJ(jElapsedRealtime, 1, ILiveDependencyService.class.getName(), anonymousClass0317CreateILiveDependencyServicebyMonsterPlugin != null ? anonymousClass0317CreateILiveDependencyServicebyMonsterPlugin.getClass().getName() : null, anonymousClass0317CreateILiveDependencyServicebyMonsterPlugin != null);
        } else {
            C1120604Zw.LIZ.LIZ();
            anonymousClass0317CreateILiveDependencyServicebyMonsterPlugin = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(ILiveDependencyService.class);
        }
        ((ILiveDependencyService) anonymousClass0317CreateILiveDependencyServicebyMonsterPlugin).addLiveDuration(SystemClock.elapsedRealtime() - this.LLJJJJ);
    }

    @Override // X.AbstractC738140SxQ
    public final void onResume() {
        super.onResume();
        this.LLJJJJ = SystemClock.elapsedRealtime();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC738140SxQ
    public final void onStop() {
        super.onStop();
        C259800zU c259800zU = new C259800zU();
        c259800zU.element = C036A.LIZIZ() ? "close" : "return";
        if (Lo().LLJILLL) {
            c259800zU.element = "next";
        }
        AddressListPanelAssemFragment addressListPanelAssemFragmentHo = Ho();
        if (addressListPanelAssemFragmentHo != null) {
            C1748720vbi.LIZIZ(addressListPanelAssemFragmentHo, new C10508049a(), new AwS210S0300000_1(addressListPanelAssemFragmentHo, (AddressListPanelAssemFragment) c259800zU, (C259800zU<String>) this, (AddressListPanelAssem) 65));
        }
    }

    @Override // X.AbstractC738140SxQ
    public final void onStart() {
        super.onStart();
    }

    @Override // X.InterfaceC990403u2
    public final void Cb(Function0<Unit> function0) {
        withState(Lo(), new AwS580S0100000_1(this, 535));
    }

    @Override // X.InterfaceC990303u1
    public final boolean K4(Map<String, String> map) {
        AddressListAssemViewModel addressListAssemViewModelLo = Lo();
        C013C c013c = new C013C();
        addressListAssemViewModelLo.ml(new AwS367S0200000_1(c013c, (C013C) map, (Map<String, String>) 35));
        if (c013c.element) {
            return true;
        }
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv = this.LLJJ;
        if (viewOnAttachStateChangeListenerC20604515jv != null) {
            AddressListAssemViewModel addressListAssemViewModelLo2 = Lo();
            C118300cf c118300cf = new C118300cf();
            addressListAssemViewModelLo2.ml(new AwS580S0100000_1(c118300cf, 62));
            if (c118300cf.element == -1) {
                if (viewOnAttachStateChangeListenerC20604515jv.getChildCount() <= 0 || viewOnAttachStateChangeListenerC20604515jv.getHeight() <= 0) {
                    ((HashMap) map).put("blank_type", "empty_view");
                    return true;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        AddressPageStarter.AddressListEnterParams addressListEnterParams;
        String string;
        String string2;
        boolean zBooleanValue;
        Window window;
        int iLJIILL;
        int iIntValue;
        Integer numLIZJ;
        Integer numLJIIJJI;
        Integer numLJIIJJI2;
        AnonymousClass0317 anonymousClass0317CreateIPerformanceOptDependencyServicebyMonsterPlugin;
        boolean z;
        String name;
        Boolean boolIsHalfScreenListPage;
        Bundle arguments;
        String string3;
        Bundle arguments2;
        Bundle arguments3;
        Bundle arguments4;
        super.onViewCreated(view);
        this.LLJJIII = SystemClock.elapsedRealtime();
        AddressListPanelAssemFragment addressListPanelAssemFragmentHo = Ho();
        if (addressListPanelAssemFragmentHo != null && (arguments4 = addressListPanelAssemFragmentHo.getArguments()) != null) {
            addressListEnterParams = (AddressPageStarter.AddressListEnterParams) arguments4.getParcelable("enter_params");
        } else {
            addressListEnterParams = null;
        }
        AddressListPanelAssemFragment addressListPanelAssemFragmentHo2 = Ho();
        if (addressListPanelAssemFragmentHo2 != null && (arguments3 = addressListPanelAssemFragmentHo2.getArguments()) != null) {
            string = arguments3.getString("track_id");
        } else {
            string = null;
        }
        AddressListPanelAssemFragment addressListPanelAssemFragmentHo3 = Ho();
        if (addressListPanelAssemFragmentHo3 != null && (arguments2 = addressListPanelAssemFragmentHo3.getArguments()) != null) {
            string2 = arguments2.getString("selected_address_id");
        } else {
            string2 = null;
        }
        AddressListPanelAssemFragment addressListPanelAssemFragmentHo4 = Ho();
        if (addressListPanelAssemFragmentHo4 != null && (arguments = addressListPanelAssemFragmentHo4.getArguments()) != null && (string3 = arguments.getString("checkout_type")) != null) {
            this.LLJJJJJIL = string3;
        }
        Lo().wQ2(addressListEnterParams, string, string2);
        Lo().LLJJLIIIJLLLLLLLZ = addressListEnterParams;
        AddressListAssemViewModel addressListAssemViewModelLo = Lo();
        if (addressListEnterParams != null && (boolIsHalfScreenListPage = addressListEnterParams.isHalfScreenListPage()) != null) {
            zBooleanValue = boolIsHalfScreenListPage.booleanValue();
        } else {
            zBooleanValue = true;
        }
        addressListAssemViewModelLo.LLJIJIL = zBooleanValue;
        this.LLJJ = (ViewOnAttachStateChangeListenerC20604515jv) view.findViewById(R.id.ah9);
        AddressListPanelAssemFragment addressListPanelAssemFragmentHo5 = Ho();
        if (addressListPanelAssemFragmentHo5 != null) {
            C19EG activity = addressListPanelAssemFragmentHo5.getActivity();
            if (activity != null) {
                window = activity.getWindow();
            } else {
                window = null;
            }
            C1323030kX7.LIZ(window);
            ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv = this.LLJJ;
            if (viewOnAttachStateChangeListenerC20604515jv != null) {
                Map mapLJIIIIZZ = C2097608Jq.LJIIIIZZ(new Pair("biz_type", null), new Pair("region", null), new Pair("page_name", "shipping_info"), new Pair("template", null));
                String str = (String) mapLJIIIIZZ.get("biz_type");
                if (str != null) {
                    numLJIIJJI = C2095008Iq.LJIIJJI(str);
                } else {
                    numLJIIJJI = null;
                }
                EnumC955203oM enumC955203oMLIZ = C955103oL.LIZ(numLJIIJJI);
                String str2 = (String) mapLJIIIIZZ.get("page_name");
                String str3 = (String) mapLJIIIIZZ.get("region");
                String str4 = (String) mapLJIIIIZZ.get("template");
                if (str4 != null) {
                    numLJIIJJI2 = C2095008Iq.LJIIJJI(str4);
                } else {
                    numLJIIJJI2 = null;
                }
                AnonymousClass0408 anonymousClass0408 = AnonymousClass0408.LIZ;
                if (str2 == null) {
                    str2 = "";
                }
                anonymousClass0408.getClass();
                IComponentStrategyService iComponentStrategyServiceLIZLLL = AnonymousClass0408.LIZLLL(enumC955203oMLIZ, str2, str3, numLJIIJJI2);
                if (iComponentStrategyServiceLIZLLL == null) {
                    iComponentStrategyServiceLIZLLL = new DefaultAddressListStrategyService();
                }
                iComponentStrategyServiceLIZLLL.LIZLLL(viewOnAttachStateChangeListenerC20604515jv);
                viewOnAttachStateChangeListenerC20604515jv.setLifecycleOwner(addressListPanelAssemFragmentHo5);
                if (C034S.LIZ()) {
                    C1120604Zw.LIZ.LIZ();
                    long jElapsedRealtime = SystemClock.elapsedRealtime();
                    anonymousClass0317CreateIPerformanceOptDependencyServicebyMonsterPlugin = PerformanceOptDependencyService.createIPerformanceOptDependencyServicebyMonsterPlugin(false);
                    if (anonymousClass0317CreateIPerformanceOptDependencyServicebyMonsterPlugin != null) {
                        z = true;
                    } else {
                        z = false;
                    }
                    String name2 = IPerformanceOptDependencyService.class.getName();
                    if (anonymousClass0317CreateIPerformanceOptDependencyServicebyMonsterPlugin != null) {
                        name = anonymousClass0317CreateIPerformanceOptDependencyServicebyMonsterPlugin.getClass().getName();
                    } else {
                        name = null;
                    }
                    C1AQS.LIZJ(jElapsedRealtime, 1, name2, name, z);
                } else {
                    C1120604Zw.LIZ.LIZ();
                    anonymousClass0317CreateIPerformanceOptDependencyServicebyMonsterPlugin = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(IPerformanceOptDependencyService.class);
                }
                ((IPerformanceOptDependencyService) anonymousClass0317CreateIPerformanceOptDependencyServicebyMonsterPlugin).createFpsMonitor("tiktokec_anchor_shipping_info").LIZIZ(viewOnAttachStateChangeListenerC20604515jv);
            }
            AddressPageStarter.AddressListEnterParams addressListEnterParams2 = Lo().LLJJLIIIJLLLLLLLZ;
            if (addressListEnterParams2 != null && Intrinsics.LJFF(addressListEnterParams2.getHideTitle(), Boolean.TRUE)) {
                C786410Ut5.LLLLZLLLI(Jo(), 8);
            } else {
                Integer num = Lo().LLJJIII;
                if (num != null && num.intValue() == 4) {
                    iLJIILL = 2131832696;
                } else {
                    iLJIILL = ((pha.c) this.LLJILLL.getValue()).LJIILL();
                }
                C0OM1 c0om1 = new C0OM1();
                C1250250idj c1250250idj = new C1250250idj();
                c1250250idj.LIZJ = addressListPanelAssemFragmentHo5.getString(iLJIILL);
                c0om1.LIZJ = c1250250idj;
                Context context = getContext();
                if (context != null && (numLIZJ = C1308910kAL.LIZJ(R.attr.c3, context)) != null) {
                    iIntValue = numLIZJ.intValue();
                } else {
                    iIntValue = 0;
                }
                c0om1.LIZJ(iIntValue);
                c0om1.LIZLLL = true;
                C928203k0 c928203k0 = C928203k0.LIZ;
                String str5 = this.LLJJJJJIL;
                c928203k0.getClass();
                if (C928203k0.LJIILJJIL(str5)) {
                    C1251150ifB c1251150ifB = new C1251150ifB();
                    c1251150ifB.LIZLLL();
                    c1251150ifB.LIZJ = R.raw.icon_chevron_left_offset_ltr;
                    c1251150ifB.LIZLLL = true;
                    c1251150ifB.LIZJ(new AwS545S0100000_1(this, 1562));
                    c0om1.LJ(c1251150ifB);
                } else {
                    C1251150ifB c1251150ifB2 = new C1251150ifB();
                    c1251150ifB2.LIZLLL();
                    c1251150ifB2.LIZJ = R.raw.icon_x_mark_small;
                    c1251150ifB2.LIZLLL = true;
                    c1251150ifB2.LIZJ(new AwS545S0100000_1(this, 1563));
                    c0om1.LIZIZ(c1251150ifB2);
                }
                Jo().setNavActions(c0om1);
            }
        }
        ((IEventCenter) ServiceManager.get().getService(IEventCenter.class)).LIZLLL("ec_address_change", this);
        ((IEventCenter) ServiceManager.get().getService(IEventCenter.class)).LIZLLL("ec_show_notice_dialog", this);
        IEventCenter iEventCenter = (IEventCenter) PluggableExtentionKt.pluggableSpi$default(IEventCenter.class, false, false, false, 14, null);
        if (iEventCenter != null) {
            iEventCenter.LIZLLL("ec_show_notice_exception_ux_dialog", this);
        }
        C736680Sv4.LJIIIIZZ(this, Lo(), new C2217381BqS() { // from class: X.03tF
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Integer.valueOf(((AddressListState) obj).getStatus());
            }
        }, null, new AwS615S0100000_1(this, 7), 6);
        C736680Sv4.LJIIIIZZ(this, Lo(), new C2217381BqS() { // from class: X.03tJ
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((AddressListState) obj).getAddressState();
            }
        }, null, new AwS615S0100000_1(this, 155), 6);
        C736680Sv4.LJIIIIZZ(this, Lo(), new C2217381BqS() { // from class: X.03tN
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((AddressListState) obj).getAddressItems();
            }
        }, null, new AwS615S0100000_1(this, 156), 6);
        if (Lo().d41()) {
            C736680Sv4.LJIIIIZZ(this, Lo(), new C2217381BqS() { // from class: X.03tP
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return ((AddressListState) obj).getSelectAddressId();
                }
            }, null, AFwS284S0000000_1.get$arr$(43), 6);
            C736680Sv4.LJIIIIZZ(this, Lo(), new C2217381BqS() { // from class: X.03tL
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return ((AddressListState) obj).getPolicyItemVO();
                }
            }, null, new AwS615S0100000_1(this, 157), 6);
        }
        C736680Sv4.LJIIIIZZ(this, Lo(), new C2217381BqS() { // from class: X.03ry
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((AddressListState) obj).getChangeOnOrderToast();
            }
        }, null, new AwS615S0100000_1(this, 158), 6);
        Lo().It0(null);
    }

    @Override // X.InterfaceC1164530gPT
    public final void onEvent(String str, String str2) {
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv;
        RecyclerView.LayoutManager layoutManager;
        Type type;
        Context context;
        Type type2;
        int iHashCode = str.hashCode();
        if (iHashCode != 1819520028) {
            if (iHashCode != 1974122510) {
                if (iHashCode == 2121607534 && str.equals("ec_show_notice_exception_ux_dialog")) {
                    try {
                        Gson gsonLJFF = C1741890vQh.LJFF();
                        C1120604Zw.LIZ.getClass();
                        C1121904a9 c1121904a9LIZIZ = C1120604Zw.LIZIZ();
                        if (c1121904a9LIZIZ != null && c1121904a9LIZIZ.LJII) {
                            type2 = C2371409Qy.LIZJ(C13LE.LJII(ExceptionUX.class));
                        } else {
                            type2 = new TypeToken<ExceptionUX>() { // from class: X.03tH
                            }.getType();
                        }
                        Object objFromJson = GsonProtectorUtils.fromJson(gsonLJFF, str2, type2);
                        if (!(objFromJson instanceof ExceptionUX)) {
                            objFromJson = null;
                        }
                        ExceptionUX exceptionUX = (ExceptionUX) objFromJson;
                        if (exceptionUX != null) {
                            Lo();
                            AddressListAssemViewModel.yQ2(getContext(), exceptionUX, new AwS545S0100000_1(this, 51));
                            return;
                        }
                        return;
                    } catch (s e) {
                        TryCatchGuardChecker.doCheck(e);
                        return;
                    }
                }
                return;
            }
            if (str.equals("ec_show_notice_dialog")) {
                try {
                    Gson gsonLJFF2 = C1741890vQh.LJFF();
                    C1120604Zw.LIZ.getClass();
                    C1121904a9 c1121904a9LIZIZ2 = C1120604Zw.LIZIZ();
                    if (c1121904a9LIZIZ2 != null && c1121904a9LIZIZ2.LJII) {
                        type = C2371409Qy.LIZJ(C13LE.LJII(NoticeDialogMessage.class));
                    } else {
                        type = new TypeToken<NoticeDialogMessage>() { // from class: X.03tR
                        }.getType();
                    }
                    Object objFromJson2 = GsonProtectorUtils.fromJson(gsonLJFF2, str2, type);
                    if (!(objFromJson2 instanceof NoticeDialogMessage)) {
                        objFromJson2 = null;
                    }
                    NoticeDialogMessage noticeDialogMessage = (NoticeDialogMessage) objFromJson2;
                    if (noticeDialogMessage != null && (context = getContext()) != null) {
                        C1397580mTM c1397580mTM = new C1397580mTM(context);
                        String str3 = noticeDialogMessage.titleText;
                        if (str3 != null) {
                            c1397580mTM.LJI(str3);
                        }
                        String str4 = noticeDialogMessage.contentText;
                        if (str4 != null) {
                            c1397580mTM.LIZIZ(str4);
                        }
                        C1397620mTQ c1397620mTQ = new C1397620mTQ(context);
                        String str5 = noticeDialogMessage.confirmButtonText;
                        if (str5 != null) {
                            c1397620mTQ.LIZJ(0, str5, new AwS580S0100000_1(this, 532));
                        }
                        c1397580mTM.LJIIL = c1397620mTQ;
                        new C1397510mTF(c1397580mTM).LIZLLL();
                        return;
                    }
                    return;
                } catch (s e2) {
                    TryCatchGuardChecker.doCheck(e2);
                    return;
                }
            }
            return;
        }
        if (str.equals("ec_address_change") && C862003Yk.LIZ(str2).type != 2 && (Lo() instanceof UsAddressListAssemViewModel) && (viewOnAttachStateChangeListenerC20604515jv = this.LLJJ) != null && (layoutManager = viewOnAttachStateChangeListenerC20604515jv.getLayoutManager()) != null) {
            layoutManager.scrollToPosition(0);
        }
    }
}
