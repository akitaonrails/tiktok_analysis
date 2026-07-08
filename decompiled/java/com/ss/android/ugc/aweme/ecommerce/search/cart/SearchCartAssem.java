package com.ss.android.ugc.aweme.ecommerce.search.cart;

import X.AnonymousClass0186;
import X.C01GW;
import X.C049Q;
import X.C0GYM;
import X.C0QER;
import X.C0XQS;
import X.C0XQT;
import X.C1018703yb;
import X.C1308910kAL;
import X.C1361400lX0;
import X.C1385040m98;
import X.C1388190mED;
import X.C13IQ;
import X.C13LE;
import X.C1548820qPI;
import X.C1558520qew;
import X.C1602160rnK;
import X.C1637806bA;
import X.C1741890vQh;
import X.C1872780ypo;
import X.C19719912Dl;
import X.C19EG;
import X.C2097608Jq;
import X.C2217381BqS;
import X.C23250099c;
import X.C2344009Gk;
import X.C262100zr;
import X.C285920BIo;
import X.C418440Gaw;
import X.C452501pT;
import X.C676440Qg6;
import X.C683330QrD;
import X.C683340QrE;
import X.C683430QrN;
import X.C683440QrO;
import X.C724240Sb0;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C786410Ut5;
import X.C946803n0;
import X.EnumC668970QLv;
import X.InterfaceC1107590evd;
import X.InterfaceC1141530foN;
import X.InterfaceC2217461Bqa;
import X.InterfaceC586170Myt;
import X.InterfaceC665370Q7z;
import X.InterfaceC676470Qg9;
import X.InterfaceC724760Sbq;
import Y.ACListenerS145S0100000_10;
import android.app.Activity;
import android.content.Context;
import android.graphics.PointF;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwnerKt;
import com.bytedance.assem.arch.view.UISlotAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.IAccountService;
import com.ss.android.ugc.aweme.ILoginService;
import com.ss.android.ugc.aweme.discover.helper.LastSearch;
import com.ss.android.ugc.aweme.ecommerce.model.CartRefreshEvent;
import com.ss.android.ugc.aweme.ecommerce.search.cart.vm.SearchCartVM;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.search.ISearchService;
import com.ss.android.ugc.aweme.search.common.utils.SAFHelper;
import com.ss.android.ugc.aweme.search.ecommerce.cart.ISearchCartAbility;
import com.ss.android.ugc.aweme.search.ecommerce.cart.ISearchCartContextAbility;
import com.zhiliaoapp.musically.R;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS241S0000000_10;
import kotlin.jvm.internal.AwS554S0100000_10;
import kotlin.jvm.internal.AwS624S0100000_10;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public class SearchCartAssem extends UISlotAssem implements InterfaceC1141530foN, InterfaceC586170Myt, ISearchCartAbility {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJJJJIL;
    public final AssemVMLazy LLJJI;
    public C0GYM LLJJIII;
    public TuxIconView LLJJIJI;
    public ISearchCartContextAbility LLJJIJIIJIL;
    public C0QER LLJJIJIL;
    public final C01GW LLJJJ;
    public final C01GW LLJJJIL;
    public PointF LLJJJJ;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(SearchCartAssem.class, "vm", "getVm()Lcom/ss/android/ugc/aweme/ecommerce/search/cart/vm/SearchCartVM;", 0);
        C13LE.LIZ.getClass();
        LLJJJJJIL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public SearchCartAssem() {
        SAFHelper.LIZ.getClass();
        InterfaceC724760Sbq interfaceC724760SbqLJJJIL = SAFHelper.LJJJIL();
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(SearchCartVM.class);
        this.LLJJI = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), interfaceC724760SbqLJJJIL, C1637806bA.LIZ, new AwS554S0100000_10((C13IQ) c19719912DlLIZ, 23), AFwS241S0000000_10.get$arr$(30), null, true);
        this.LLJJJ = C452501pT.LIZIZ(new AwS554S0100000_10(this, 22));
        this.LLJJJIL = C452501pT.LIZIZ(new AwS554S0100000_10(this, 20));
        AnonymousClass0186.LIZ("onSearchCartInit", null);
    }

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public int Co() {
        return R.layout.bqj;
    }

    public final Pair<String, String> hp() {
        return new Pair<>("cartState", C1741890vQh.LJIIIIZZ(C2097608Jq.LJIIJ(new Pair("isViewValid", Boolean.valueOf(this.LLILZ)), new Pair("enableEntranceShow", withState(kp(), AFwS241S0000000_10.get$arr$(20))), new Pair("dataState", withState(kp(), AFwS241S0000000_10.get$arr$(21))))));
    }

    public final SearchCartVM kp() {
        AssemVMLazy assemVMLazy = this.LLJJI;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJJJJIL;
        return (SearchCartVM) assemVMLazy.getValue();
    }

    public final boolean mp() {
        return ((Boolean) withState(kp(), AFwS241S0000000_10.get$arr$(22))).booleanValue() && (withState(kp(), AFwS241S0000000_10.get$arr$(23)) instanceof C683430QrN) && this.LLILZ;
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onCreate() throws Throwable {
        super.onCreate();
        C1548820qPI.LIZLLL("ec_search_cart_adding", this);
        C1548820qPI.LIZLLL("ec_cart_refresh", this);
        SAFHelper sAFHelper = SAFHelper.LIZ;
        Fragment fragmentLJI = C724240Sb0.LJI(this);
        C19EG c19egLIZ = C724240Sb0.LIZ(this);
        sAFHelper.getClass();
        InterfaceC665370Q7z interfaceC665370Q7zLJJIJLIJ = SAFHelper.LJJIJLIJ(fragmentLJI, c19egLIZ);
        if (interfaceC665370Q7zLJJIJLIJ != null) {
            C1558520qew.LJII(interfaceC665370Q7zLJJIJLIJ, this, ISearchCartAbility.class, null, null);
        }
        ((IAccountService) ServiceManager.get().getService(IAccountService.class)).LJIILL(this);
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onDestroy() throws Throwable {
        super.onDestroy();
        C1548820qPI.LJIIIIZZ("ec_cart_refresh", this);
        C1548820qPI.LJIIIIZZ("ec_search_cart_adding", this);
        SAFHelper sAFHelper = SAFHelper.LIZ;
        Fragment fragmentLIZ = C946803n0.LIZ(LJJIJL());
        C19EG c19egLIZ = C724240Sb0.LIZ(this);
        sAFHelper.getClass();
        InterfaceC665370Q7z interfaceC665370Q7zLJJIJLIJ = SAFHelper.LJJIJLIJ(fragmentLIZ, c19egLIZ);
        if (interfaceC665370Q7zLJJIJLIJ != null) {
            C1558520qew.LJIIJJI(interfaceC665370Q7zLJJIJLIJ, ISearchCartAbility.class, null);
        }
        ((IAccountService) ServiceManager.get().getService(IAccountService.class)).LJI(this);
    }

    public final void op() {
        String pageName;
        String previousPage;
        String str;
        LastSearch lastSearchLIZIZ;
        boolean z = ((Boolean) withState(kp(), AFwS241S0000000_10.get$arr$(611))).booleanValue() && !(withState(kp(), AFwS241S0000000_10.get$arr$(612)) instanceof C683440QrO);
        boolean z2 = ((Number) withState(kp(), AFwS241S0000000_10.get$arr$(613))).intValue() > 0 && !(withState(kp(), AFwS241S0000000_10.get$arr$(614)) instanceof C683440QrO);
        if (LJJIJL().getVisibility() != 0 && z && withState(kp(), AFwS241S0000000_10.get$arr$(29)) == EnumC668970QLv.PAGE_CHANGE) {
            C683340QrE c683340QrE = C683340QrE.LIZ;
            C0QER c0qer = this.LLJJIJIL;
            int iIntValue = ((Number) withState(kp(), AFwS241S0000000_10.get$arr$(27))).intValue();
            String str2 = C285920BIo.LIZ() ? "black_number" : "number";
            String str3 = (String) this.LLJJJIL.getValue();
            c683340QrE.getClass();
            C2344009Gk c2344009Gk = new C2344009Gk();
            c2344009Gk.LJIIIIZZ("EVENT_ORIGIN_FEATURE", "TEMAI");
            if (c0qer == null || (pageName = c0qer.getPageName()) == null) {
                pageName = "goods_search";
            }
            c2344009Gk.LJIIIIZZ("page_name", pageName);
            if (c0qer != null) {
                previousPage = c0qer.getPreviousPage();
                if (previousPage == null) {
                    previousPage = c0qer.getEnterSearchFrom();
                }
            } else {
                previousPage = null;
            }
            c2344009Gk.LJIIIIZZ("previous_page", previousPage);
            c2344009Gk.LJIIIIZZ("enter_from", c0qer != null ? c0qer.getEnterSearchFrom() : null);
            c2344009Gk.LIZJ(iIntValue, "notice_number");
            c2344009Gk.LJIIIIZZ("notice_type", str2);
            c2344009Gk.LJIIIIZZ("cart_entrance", str3);
            InterfaceC676470Qg9 interfaceC676470Qg9Y0 = ((ISearchService) ServiceManager.get().getService(ISearchService.class)).y0();
            if (interfaceC676470Qg9Y0 == null || (lastSearchLIZIZ = interfaceC676470Qg9Y0.LIZIZ()) == null || (str = lastSearchLIZIZ.search_id) == null) {
                str = "";
            }
            c2344009Gk.LJIIIIZZ("search_id", str);
            C1018703yb.LIZIZ("tiktokec_cart_entrance_show", c2344009Gk.LIZ);
        }
        ISearchCartContextAbility iSearchCartContextAbility = this.LLJJIJIIJIL;
        if (iSearchCartContextAbility != null) {
            iSearchCartContextAbility.TR(z);
        }
        C786410Ut5.LJLLLLLL(z ? 0 : 8, LJJIJL());
        C0GYM c0gym = this.LLJJIII;
        if (c0gym != null) {
            int i = z2 ? 0 : 8;
            int visibility = c0gym.getVisibility();
            c0gym.setVisibility(i);
            C1602160rnK.LIZIZ(visibility, i, c0gym);
        }
        C0GYM c0gym2 = this.LLJJIII;
        if (c0gym2 != null) {
            c0gym2.setCount(((Number) withState(kp(), AFwS241S0000000_10.get$arr$(28))).intValue());
        }
        AnonymousClass0186.LIZ("onRefreshCartView", C2097608Jq.LJIIJ(new Pair("isEntranceVisible", Boolean.valueOf(z)), new Pair("isRedBadgeVisible", Boolean.valueOf(z2)), hp()));
    }

    public final boolean ip(boolean z) {
        Activity activityLIZ;
        IAccountService iAccountService = (IAccountService) ServiceManager.get().getService(IAccountService.class);
        if (!iAccountService.LJIIJ().isLogin() && z) {
            ILoginService iLoginServiceLIZJ = iAccountService.LIZJ();
            C0XQS c0xqs = new C0XQS();
            Context context = getContext();
            if (context != null) {
                activityLIZ = C1388190mED.LIZ(context);
            } else {
                activityLIZ = null;
            }
            c0xqs.LIZ = activityLIZ;
            iLoginServiceLIZJ.showLoginAndRegisterView(new C0XQT(c0xqs));
        }
        return iAccountService.LJIIJ().isLogin();
    }

    public void lp(View view) {
        this.LLJJIJI = (TuxIconView) view.findViewById(R.id.v8n);
        this.LLJJIII = (C0GYM) view.findViewById(R.id.v8p);
    }

    @Override // X.InterfaceC1141530foN
    public final void mh2(C262100zr c262100zr) {
        Integer num;
        Map<String, Object> mapLIZ;
        View view = (View) withState(kp(), AFwS241S0000000_10.get$arr$(25));
        View view2 = (View) withState(kp(), AFwS241S0000000_10.get$arr$(26));
        String str = c262100zr.LIZ;
        String string = null;
        if (Intrinsics.LJFF(str, "ec_search_cart_adding")) {
            this.LLJJJJ = null;
            if (view2 == null) {
                return;
            }
            view2.getLocationInWindow(new int[2]);
            InterfaceC1107590evd interfaceC1107590evd = c262100zr.LIZIZ;
            if (interfaceC1107590evd != null) {
                this.LLJJJJ = new PointF(C418440Gaw.LIZIZ(Double.valueOf(interfaceC1107590evd.getDouble("x"))) + r7[0], C418440Gaw.LIZIZ(Double.valueOf(interfaceC1107590evd.getDouble("y"))) + r7[1]);
            }
        } else if (Intrinsics.LJFF(str, "ec_cart_refresh")) {
            InterfaceC1107590evd interfaceC1107590evd2 = c262100zr.LIZIZ;
            if (interfaceC1107590evd2 != null) {
                C1872780ypo.LIZ.getClass();
                CartRefreshEvent cartRefreshEventLIZ = C049Q.LIZ(C786410Ut5.J3(C1872780ypo.LIZIZ(interfaceC1107590evd2)));
                if (cartRefreshEventLIZ != null && (num = cartRefreshEventLIZ.count) != null) {
                    C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C683330QrD(this, num.intValue(), cartRefreshEventLIZ, view, null), 3);
                    if (cartRefreshEventLIZ.refresh == 1) {
                        SearchCartVM searchCartVMKp = kp();
                        if (ip(false) && searchCartVMKp != null) {
                            searchCartVMKp.wQ2(CardStruct.IStatusCode.DEFAULT, (String) this.LLJJJ.getValue());
                        }
                    }
                } else {
                    return;
                }
            } else {
                return;
            }
        }
        Pair[] pairArr = new Pair[2];
        pairArr[0] = new Pair("jsEventName", c262100zr.LIZ);
        InterfaceC1107590evd interfaceC1107590evd3 = c262100zr.LIZIZ;
        if (interfaceC1107590evd3 != null && (mapLIZ = interfaceC1107590evd3.LIZ()) != null) {
            string = mapLIZ.toString();
        }
        pairArr[1] = new Pair("jsEventParams", string);
        AnonymousClass0186.LIZ("onReceiveJsEvent", C2097608Jq.LJIIJ(pairArr));
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(final View view) {
        C0QER c0qer;
        Integer numLIZJ;
        Integer numLIZJ2;
        C676440Qg6 c676440Qg6Fd2;
        super.onViewCreated(view);
        ISearchCartContextAbility iSearchCartContextAbility = (ISearchCartContextAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), ISearchCartContextAbility.class, null);
        this.LLJJIJIIJIL = iSearchCartContextAbility;
        if (iSearchCartContextAbility != null && (c676440Qg6Fd2 = iSearchCartContextAbility.fd2()) != null) {
            c0qer = c676440Qg6Fd2.LIZIZ;
        } else {
            c0qer = null;
        }
        this.LLJJIJIL = c0qer;
        lp(view);
        if (C285920BIo.LIZ()) {
            Context context = getContext();
            if (context != null && (numLIZJ2 = C1308910kAL.LIZJ(R.attr.a1i, context)) != null) {
                int iIntValue = numLIZJ2.intValue();
                C0GYM c0gym = this.LLJJIII;
                if (c0gym != null) {
                    c0gym.setBadgeBackgroundColor(iIntValue);
                }
            }
            Context context2 = getContext();
            if (context2 != null && (numLIZJ = C1308910kAL.LIZJ(R.attr.a0o, context2)) != null) {
                int iIntValue2 = numLIZJ.intValue();
                C0GYM c0gym2 = this.LLJJIII;
                if (c0gym2 != null) {
                    c0gym2.setBadgeTextColor(iIntValue2);
                }
            }
        }
        C736680Sv4.LJIIIIZZ(this, kp(), new C2217381BqS() { // from class: X.0QrG
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Integer.valueOf(((C683390QrJ) obj).LLILZ);
            }
        }, null, new AwS624S0100000_10(this, 4), 6);
        C736680Sv4.LJIIIIZZ(this, kp(), new C2217381BqS() { // from class: X.0QrH
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C683390QrJ) obj).LLILZIL;
            }
        }, null, new AwS624S0100000_10(this, 5), 6);
        C736680Sv4.LJIIIIZZ(this, kp(), new C2217381BqS() { // from class: X.0QrI
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C683390QrJ) obj).LL;
            }
        }, null, new AwS624S0100000_10(this, 6), 6);
        final ACListenerS145S0100000_10 aCListenerS145S0100000_10 = new ACListenerS145S0100000_10(this, 6);
        final Integer numValueOf = Integer.valueOf(LSPassThroughRecordSizeConfig.DEFAULT);
        final Boolean bool = Boolean.TRUE;
        C786410Ut5.I7(new View.OnClickListener() { // from class: X.0QrF
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int iIntValue3;
                boolean zBooleanValue;
                View view3 = view;
                Integer num = numValueOf;
                if (num != null) {
                    iIntValue3 = num.intValue();
                } else {
                    iIntValue3 = LSPassThroughRecordSizeConfig.DEFAULT;
                }
                Boolean bool2 = bool;
                if (bool2 != null) {
                    zBooleanValue = bool2.booleanValue();
                } else {
                    zBooleanValue = true;
                }
                C1744700vVE.LIZ(view3, iIntValue3, zBooleanValue, false, aCListenerS145S0100000_10);
            }
        }, view);
        SearchCartVM searchCartVMKp = kp();
        if (ip(false) && searchCartVMKp != null) {
            searchCartVMKp.wQ2("1", (String) this.LLJJJ.getValue());
        }
    }

    @Override // com.ss.android.ugc.aweme.search.ecommerce.cart.ISearchCartAbility
    public final void xz2(boolean z) {
        C1361400lX0 c1361400lX0LIZ;
        Integer numLIZJ;
        Context context = getContext();
        if (context != null) {
            c1361400lX0LIZ = C1385040m98.LIZ(context, z);
            if (c1361400lX0LIZ != null && (numLIZJ = C1308910kAL.LIZJ(R.attr.a1h, c1361400lX0LIZ)) != null) {
                int iIntValue = numLIZJ.intValue();
                TuxIconView tuxIconView = this.LLJJIJI;
                if (tuxIconView != null) {
                    tuxIconView.setTintColor(iIntValue);
                }
            }
        } else {
            c1361400lX0LIZ = null;
        }
        if (C285920BIo.LIZ() && c1361400lX0LIZ != null) {
            Integer numLIZJ2 = C1308910kAL.LIZJ(R.attr.a1i, c1361400lX0LIZ);
            if (numLIZJ2 != null) {
                int iIntValue2 = numLIZJ2.intValue();
                C0GYM c0gym = this.LLJJIII;
                if (c0gym != null) {
                    c0gym.setBadgeBackgroundColor(iIntValue2);
                }
            }
            Integer numLIZJ3 = C1308910kAL.LIZJ(R.attr.a0o, c1361400lX0LIZ);
            if (numLIZJ3 != null) {
                int iIntValue3 = numLIZJ3.intValue();
                C0GYM c0gym2 = this.LLJJIII;
                if (c0gym2 != null) {
                    c0gym2.setBadgeTextColor(iIntValue3);
                }
            }
        }
    }

    @Override // X.InterfaceC586170Myt
    public final void onAccountResult(int i, boolean z, int i2, User user) {
        if (i == 1 && z) {
            kp().wQ2("2", "tiktok_ecom");
        }
    }
}
