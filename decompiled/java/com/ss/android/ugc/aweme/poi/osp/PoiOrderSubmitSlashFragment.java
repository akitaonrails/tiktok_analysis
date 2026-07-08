package com.ss.android.ugc.aweme.poi.osp;

import X.AbstractC1387200mCc;
import X.C019F;
import X.C01D1;
import X.C01GW;
import X.C03H5;
import X.C051S;
import X.C098200Yq;
import X.C09R3;
import X.C0DXR;
import X.C0QSJ;
import X.C0ZP4;
import X.C1172750gcj;
import X.C1173110gdJ;
import X.C1173300gdc;
import X.C1180090goZ;
import X.C1180170goh;
import X.C1180620gpQ;
import X.C1181430gqj;
import X.C1181930grX;
import X.C1183350gtp;
import X.C1183360gtq;
import X.C1184000gus;
import X.C1185040gwY;
import X.C1185050gwZ;
import X.C1186990gzh;
import X.C1187000gzi;
import X.C1187080gzq;
import X.C1189060h32;
import X.C1192290h8F;
import X.C1192570h8h;
import X.C1192580h8i;
import X.C1192650h8p;
import X.C1192760h90;
import X.C1192780h92;
import X.C1192810h95;
import X.C1192840h98;
import X.C1192850h99;
import X.C1192870h9B;
import X.C1192880h9C;
import X.C1192960h9K;
import X.C1193110h9Z;
import X.C1193120h9a;
import X.C1193130h9b;
import X.C1193140h9c;
import X.C1193160h9e;
import X.C1193630hAP;
import X.C1193670hAT;
import X.C11H2;
import X.C11H6;
import X.C11H7;
import X.C11H9;
import X.C1202330hOR;
import X.C1209040hZG;
import X.C1308910kAL;
import X.C1389880mGw;
import X.C1389890mGx;
import X.C1391190mJ3;
import X.C1397510mTF;
import X.C1397580mTM;
import X.C13IQ;
import X.C13LE;
import X.C13LP;
import X.C14K9;
import X.C1554960qZC;
import X.C1558360qeg;
import X.C1558520qew;
import X.C1622206Wu;
import X.C1685300txQ;
import X.C1770850wBP;
import X.C189200o6;
import X.C18JG;
import X.C1906580ziK;
import X.C19474211Gy;
import X.C1948607kC;
import X.C19719912Dl;
import X.C19EG;
import X.C19GS;
import X.C2188811AlT;
import X.C2211631BhB;
import X.C2217381BqS;
import X.C2248361CzK;
import X.C2276411E8h;
import X.C23250099c;
import X.C298360Bmk;
import X.C308370C6x;
import X.C338490DOt;
import X.C343970De7;
import X.C418440Gaw;
import X.C451460Hn6;
import X.C451620HnM;
import X.C451650HnP;
import X.C452070Ho5;
import X.C452501pT;
import X.C497820Jfg;
import X.C673150Qan;
import X.C687700QyG;
import X.C698190Ra5;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C786410Ut5;
import X.C814420VxA;
import X.C960203pA;
import X.C985403tE;
import X.C987103tV;
import X.DialogC1389620mGW;
import X.EnumC1181510gqr;
import X.EnumC1181540gqu;
import X.EnumC1187010gzj;
import X.EnumC1187020gzk;
import X.EnumC1192690h8t;
import X.EnumC452301pR;
import X.InterfaceC0148002o;
import X.InterfaceC1058150ddt;
import X.InterfaceC1146704e9;
import X.InterfaceC1180800gpi;
import X.InterfaceC1180970gpz;
import X.InterfaceC1181300gqW;
import X.InterfaceC1181680gr8;
import X.InterfaceC1192660h8q;
import X.InterfaceC1631620sYq;
import X.InterfaceC1631630sYr;
import X.InterfaceC1685420txc;
import X.InterfaceC1685430txd;
import X.InterfaceC1709520uaU;
import X.InterfaceC1740760vOs;
import X.InterfaceC2217241BqE;
import X.InterfaceC2217461Bqa;
import X.InterfaceC451590HnJ;
import X.InterfaceC687730QyJ;
import X.InterfaceC724530SbT;
import X.InterfaceC724760Sbq;
import X.InterfaceC725050ScJ;
import X.InterfaceC736810SvH;
import X.InterfaceC836760Ws6;
import X.ViewOnAttachStateChangeListenerC20604515jv;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModelKt;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.bcm.api.model.BcmParams;
import com.bytedance.android.btm.api.model.PageFinder;
import com.bytedance.assem.arch.core.UIAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.router.arg.RouteArgExtension;
import com.bytedance.scene.Scene;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.manager.JSEventCenter;
import com.ss.android.ugc.aweme.pipo.cashier.IPIPOCashierService;
import com.ss.android.ugc.aweme.poi.experiment.TiktokPoiLynxSettings;
import com.ss.android.ugc.aweme.poi.osp.PoiOrderSubmitSlashFragment;
import com.ss.android.ugc.aweme.poi.osp.PoiOrderSubmitViewModel;
import com.ss.android.ugc.aweme.poi.osp.assem.PoiOrderSubmitSheetViewModel;
import com.ss.android.ugc.aweme.poi.osp.component.PoiOrderSubmitLoadingAssem;
import com.ss.android.ugc.aweme.poi.osp.repo.model.BuySkuItem;
import com.ss.android.ugc.aweme.poi.osp.repo.model.CouponModuleData;
import com.ss.android.ugc.aweme.poi.osp.repo.model.DialogContent;
import com.ss.android.ugc.aweme.poi.osp.repo.model.LsExceptionUx;
import com.ss.android.ugc.aweme.poi.osp.repo.model.NavigationBarData;
import com.ss.android.ugc.aweme.poi.osp.repo.model.OrderAttribute;
import com.ss.android.ugc.aweme.poi.osp.repo.model.OrderSummaryData;
import com.ss.android.ugc.aweme.poi.osp.repo.model.PageInfoData;
import com.ss.android.ugc.aweme.poi.osp.repo.model.PriceBreakdownData;
import com.ss.android.ugc.aweme.poi.osp.repo.model.PriceItem;
import com.ss.android.ugc.aweme.poi.osp.repo.model.SkuBuyLimit;
import com.ss.android.ugc.aweme.poi.osp.repo.model.SkuData;
import com.ss.android.ugc.aweme.poi.osp.repo.model.SkuListData;
import com.ss.android.ugc.aweme.poi.osp.repo.model.SkuPrice;
import com.ss.android.ugc.aweme.poi.osp.repo.model.SubmitOrderResponse;
import com.ss.android.ugc.aweme.poi.osp.repo.model.ToastContent;
import com.ss.android.ugc.aweme.slash.data.PageInfo;
import com.ss.android.ugc.aweme.slash.data.SlashApiResponse;
import com.ss.android.ugc.aweme.slash.data.SlashRequestParam;
import com.ss.android.ugc.aweme.slash.page.SlashFragment;
import com.ss.android.ugc.aweme.trace.IUnsampledTraceLogger;
import com.zhiliaoapp.musically.R;
import irm.AkS57S0200000_18;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS206S0000000_18;
import kotlin.jvm.internal.AFwS256S0000000_18;
import kotlin.jvm.internal.AwS105S0110000_18;
import kotlin.jvm.internal.AwS35S0600000_18;
import kotlin.jvm.internal.AwS384S0200000_18;
import kotlin.jvm.internal.AwS419S0200000_18;
import kotlin.jvm.internal.AwS560S0100000_16;
import kotlin.jvm.internal.AwS562S0100000_18;
import kotlin.jvm.internal.AwS597S0100000_18;
import kotlin.jvm.internal.AwS632S0100000_18;
import kotlin.jvm.internal.AwS667S0100000_18;
import kotlin.jvm.internal.AwS8S1001000_18;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes19.dex */
@InterfaceC836760Ws6
public final class PoiOrderSubmitSlashFragment extends SlashFragment<C1187080gzq> implements InterfaceC1058150ddt, InterfaceC724530SbT, InterfaceC1740760vOs, PoiOrderSubmitCashierAbility, PoiOrderSubmitSlashAbility, C0QSJ, InterfaceC1146704e9 {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLZIL;
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZjUjIGE8HELIOSOzViGSA6BzcoLD0APSchIDsAJCQ/IQkhKSIhLCEn";
    public final C01GW LLLLIIIILLL = RouteArgExtension.INSTANCE.optionalArg(this, AFwS256S0000000_18.get$arr$(523), "source_btm_token", String.class);
    public final C01GW LLLLIIL = RouteArgExtension.INSTANCE.requiredArg(this, AFwS206S0000000_18.get$arr$(421), "poi_id", String.class);
    public final C01GW LLLLIILL = RouteArgExtension.INSTANCE.requiredArg(this, AFwS206S0000000_18.get$arr$(425), "sku_list", String.class);
    public final C01GW LLLLIILLL = RouteArgExtension.INSTANCE.optionalArg(this, AFwS256S0000000_18.get$arr$(522), "sync_coupon_info", String.class);
    public final C01GW LLLLIL = RouteArgExtension.INSTANCE.optionalArg(this, AFwS256S0000000_18.get$arr$(521), "pdp_atmosphere_tag_ids", String.class);
    public final C01GW LLLLILI = RouteArgExtension.INSTANCE.requiredArg(this, AFwS206S0000000_18.get$arr$(411), "open_by_sheet", String.class);
    public final C01GW LLLLJ = RouteArgExtension.INSTANCE.requiredArg(this, AFwS206S0000000_18.get$arr$(414), "pay_request_id", String.class);
    public final C01GW LLLLJI = RouteArgExtension.INSTANCE.requiredArg(this, AFwS206S0000000_18.get$arr$(423), "pt_info", String.class);
    public final C01GW LLLLL = RouteArgExtension.INSTANCE.requiredArg(this, AFwS206S0000000_18.get$arr$(413), "collect_info", String.class);
    public final C01GW LLLLLIL = RouteArgExtension.INSTANCE.requiredArg(this, AFwS206S0000000_18.get$arr$(412), "track_info", String.class);
    public final C01GW LLLLLILLIL = RouteArgExtension.INSTANCE.requiredArg(this, AFwS206S0000000_18.get$arr$(415), "enter_from", String.class);
    public final C01GW LLLLLJIL = RouteArgExtension.INSTANCE.requiredArg(this, AFwS206S0000000_18.get$arr$(417), "enter_method", String.class);
    public final C01GW LLLLLJLJLL = RouteArgExtension.INSTANCE.requiredArg(this, AFwS206S0000000_18.get$arr$(416), "pdp_enter_from", String.class);
    public final C01GW LLLLLL = RouteArgExtension.INSTANCE.requiredArg(this, AFwS206S0000000_18.get$arr$(418), "pdp_enter_method", String.class);
    public final C01GW LLLLLLIL = RouteArgExtension.INSTANCE.requiredArg(this, AFwS206S0000000_18.get$arr$(419), "poi_detail_enter_from", String.class);
    public final C01GW LLLLLLJ = RouteArgExtension.INSTANCE.requiredArg(this, AFwS206S0000000_18.get$arr$(420), "poi_detail_enter_method", String.class);
    public final C01GW LLLLLLL = RouteArgExtension.INSTANCE.requiredArg(this, AFwS206S0000000_18.get$arr$(426), "one_click_booking_type_able", String.class);
    public final C01GW LLLLLLLLL = RouteArgExtension.INSTANCE.requiredArg(this, AFwS206S0000000_18.get$arr$(427), "one_click_booking_type_actual", String.class);
    public final AssemVMLazy LLLLLLLLLL;
    public final AssemVMLazy LLLLLLLZIL;
    public final C01GW LLLLLLZ;
    public final C01GW LLLLLLZZ;
    public final C01GW LLLLLZ;
    public boolean LLLLLZIL;
    public boolean LLLLLZL;
    public boolean LLLLZ;
    public final C01GW LLLLZI;
    public final C01GW LLLLZIL;
    public final C01GW LLLLZLL;
    public final String LLLLZLLIL;
    public final C01GW LLLLZLLLI;
    public final C01GW LLLZ;
    public final C01GW LLLZI;
    public Function1<? super MotionEvent, Unit> LLLZIIL;
    public final C01GW LLLZIL;
    public final JSEventCenter LLLZL;
    public FrameLayout LLLZLL;
    public View LLLZLZ;
    public TuxIconView LLLZZ;
    public int LLLZZIL;
    public PopupWindow LLZ;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(PoiOrderSubmitSlashFragment.class, "vm", "getVm()Lcom/ss/android/ugc/aweme/poi/osp/PoiOrderSubmitViewModel;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(PoiOrderSubmitSlashFragment.class, "orderSummaryViewModel", "getOrderSummaryViewModel()Lcom/ss/android/ugc/aweme/poi/osp/assem/PoiOrderSubmitSheetViewModel;", 0);
        c09r3.getClass();
        LLZIL = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2};
    }

    @Override // com.ss.android.ugc.aweme.slash.page.SlashFragment
    public final C1180620gpQ GV(C1180620gpQ c1180620gpQ, EnumC1181510gqr enumC1181510gqr) {
        return c1180620gpQ;
    }

    @Override // com.ss.android.ugc.aweme.slash.page.SlashFragment
    public final boolean LJLLL() {
        return false;
    }

    @Override // X.InterfaceC1058150ddt
    public final void LLLFFI(TuxSheet tuxSheet, float f) {
    }

    @Override // com.ss.android.ugc.aweme.slash.page.SlashFragment
    public final boolean WU() {
        if (qW().LLIZ) {
            return true;
        }
        C1193160h9e c1193160h9e = C1193160h9e.LIZ;
        Context context = getContext();
        AwS562S0100000_18 awS562S0100000_18 = new AwS562S0100000_18(this, 1640);
        C1192650h8p c1192650h8pOW = oW();
        InterfaceC1192660h8q interfaceC1192660h8qOV = OV();
        String strLJIIIZ = interfaceC1192660h8qOV != null ? interfaceC1192660h8qOV.LJIIIZ() : null;
        boolean z = qW().getState().LLILZIL;
        c1193160h9e.getClass();
        if (C1193160h9e.LIZ(context, awS562S0100000_18, c1192650h8pOW, this, strLJIIIZ, z)) {
            return true;
        }
        return super.WU();
    }

    @Override // X.C0QSJ
    public final void bindAbility(Object obj, Class cls) {
        C673150Qan.LIZ(this, obj, cls);
    }

    @Override // X.InterfaceC1146704e9
    public final void checkParentScope() {
        C687700QyG.LIZ(this, new Class[]{PoiOrderSubmitScope.class});
    }

    @Override // com.ss.android.ugc.aweme.slash.page.SlashFragment
    public final C13IQ<? extends UIAssem> fV() {
        return C13LE.LIZ(PoiOrderSubmitLoadingAssem.class);
    }

    @Override // com.ss.android.ugc.aweme.slash.page.SlashFragment
    public final SlashApiResponse gT() {
        return null;
    }

    @Override // X.C0QSJ
    public final Object getAbility(Class cls) {
        return null;
    }

    @Override // X.InterfaceC724530SbT, X.InterfaceC736810SvH
    public final LifecycleOwner getActualLifecycleOwner() {
        return this;
    }

    @Override // X.InterfaceC725030ScH
    public final InterfaceC736810SvH getActualLifecycleOwnerHolder() {
        return this;
    }

    @Override // X.InterfaceC725050ScJ
    public final C03H5 getActualReceiver() {
        return this;
    }

    @Override // X.InterfaceC725030ScH
    public final InterfaceC725050ScJ<C03H5> getActualReceiverHolder() {
        return this;
    }

    @Override // X.InterfaceC1740760vOs
    public String getBtmPageCode() {
        return "b8216";
    }

    @Override // X.InterfaceC725030ScH
    public final LifecycleOwner getHostLifecycleOwner() {
        return null;
    }

    @Override // X.InterfaceC725030ScH
    public final LifecycleOwner getOwnLifecycleOwner() {
        return this;
    }

    @Override // X.InterfaceC1146704e9
    public final List getParentScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(PoiOrderSubmitScope.class);
        return arrayList;
    }

    @Override // X.InterfaceC725030ScH
    public final C03H5 getReceiverForHostVM() {
        return null;
    }

    @Override // X.C0QSJ
    public final List getScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(PoiOrderSubmitScope.class);
        return arrayList;
    }

    @Override // X.InterfaceC725030ScH
    public final boolean getUniqueOnlyDefault() {
        return true;
    }

    @Override // com.ss.android.ugc.aweme.slash.page.SlashFragment
    public final SlashRequestParam jT() {
        return GA2(getPoiId(), (List) this.LLLLLLZ.getValue(), EnumC1187020gzk.INITIAL_FETCH, null, RV(), VV());
    }

    @Override // X.InterfaceC1058150ddt
    public final boolean onBackPress() {
        if (qW().LLIZ) {
            return true;
        }
        C1193160h9e c1193160h9e = C1193160h9e.LIZ;
        Context context = getContext();
        AwS562S0100000_18 awS562S0100000_18 = new AwS562S0100000_18(this, 1638);
        C1192650h8p c1192650h8pOW = oW();
        InterfaceC1192660h8q interfaceC1192660h8qOV = OV();
        String strLJIIIZ = interfaceC1192660h8qOV != null ? interfaceC1192660h8qOV.LJIIIZ() : null;
        boolean z = qW().getState().LLILZIL;
        c1193160h9e.getClass();
        if (C1193160h9e.LIZ(context, awS562S0100000_18, c1192650h8pOW, this, strLJIIIZ, z)) {
            return true;
        }
        qW().LLILZLL = "return";
        return false;
    }

    @Override // X.InterfaceC1740760vOs
    public final Map<String, String> r9() {
        return null;
    }

    @Override // X.C0QSJ
    public final void registerAbilityLoadListener(InterfaceC687730QyJ interfaceC687730QyJ) {
    }

    @Override // com.ss.android.ugc.aweme.slash.page.SlashFragment
    public final boolean sV() {
        return true;
    }

    @Override // X.C0QSJ
    public final void unbindAbility(Object obj, Class cls) {
        C673150Qan.LIZIZ(this, obj, cls);
    }

    @Override // X.C0QSJ
    public final void unregisterAbilityLoadListener(InterfaceC687730QyJ interfaceC687730QyJ) {
    }

    public PoiOrderSubmitSlashFragment() {
        AssemVMLazy assemVMLazy;
        boolean z;
        AssemVMLazy assemVMLazy2;
        boolean z2;
        boolean z3;
        InterfaceC724760Sbq interfaceC724760Sbq = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(PoiOrderSubmitViewModel.class);
        AwS560S0100000_16 awS560S0100000_16 = new AwS560S0100000_16((C13IQ) c19719912DlLIZ, 417);
        AFwS256S0000000_18 aFwS256S0000000_18 = AFwS256S0000000_18.get$arr$(525);
        C01D1 c01d1 = C01D1.LIZ;
        if (Intrinsics.LJFF(interfaceC724760Sbq, c01d1)) {
            assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ), awS560S0100000_16, new C452070Ho5(), new C1622206Wu(this, true), new C338490DOt(this, true), new AwS562S0100000_18((HasDefaultViewModelProviderFactory) this, 1639), aFwS256S0000000_18, new C451460Hn6(this, true), new C451620HnM(this, true), new C987103tV(this, true));
            z = true;
        } else if (interfaceC724760Sbq instanceof InterfaceC451590HnJ) {
            assemVMLazy = C451650HnP.LIZ(this, (InterfaceC451590HnJ) interfaceC724760Sbq, C724750Sbp.LJIIJ(this, c19719912DlLIZ), awS560S0100000_16, new AwS562S0100000_18((Fragment) this, 1641), aFwS256S0000000_18, null, null, null);
            z = true;
        } else {
            if (!Intrinsics.LJFF(interfaceC724760Sbq, interfaceC724760Sbq)) {
                throw new IllegalArgumentException("Do not support this scope here.");
            }
            z = true;
            assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ), awS560S0100000_16, new C452070Ho5(), C724750Sbp.LJII(this), C724750Sbp.LJIIIZ(this), new AwS562S0100000_18((HasDefaultViewModelProviderFactory) this, 1642), aFwS256S0000000_18, new C451460Hn6(this, false), new C451620HnM(this, false), new C987103tV(this, false));
        }
        this.LLLLLLLLLL = assemVMLazy;
        C19719912Dl c19719912DlLIZ2 = C13LE.LIZ(PoiOrderSubmitSheetViewModel.class);
        AwS560S0100000_16 awS560S0100000_162 = new AwS560S0100000_16((C13IQ) c19719912DlLIZ2, 418);
        AFwS256S0000000_18 aFwS256S0000000_182 = AFwS256S0000000_18.get$arr$(527);
        if (Intrinsics.LJFF(interfaceC724760Sbq, c01d1)) {
            assemVMLazy2 = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ2), awS560S0100000_162, new C452070Ho5(), new C1622206Wu(this, z), new C338490DOt(this, z), new AwS562S0100000_18((HasDefaultViewModelProviderFactory) this, 1643), aFwS256S0000000_182, new C451460Hn6(this, z), new C451620HnM(this, z), new C987103tV(this, z));
            z3 = false;
            z2 = true;
        } else if (interfaceC724760Sbq instanceof InterfaceC451590HnJ) {
            assemVMLazy2 = C451650HnP.LIZ(this, (InterfaceC451590HnJ) interfaceC724760Sbq, C724750Sbp.LJIIJ(this, c19719912DlLIZ2), awS560S0100000_162, new AwS562S0100000_18((Fragment) this, 1644), aFwS256S0000000_182, null, null, null);
            z2 = true;
            z3 = false;
        } else {
            if (!Intrinsics.LJFF(interfaceC724760Sbq, interfaceC724760Sbq)) {
                throw new IllegalArgumentException("Do not support this scope here.");
            }
            z2 = true;
            z3 = false;
            assemVMLazy2 = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ2), awS560S0100000_162, new C452070Ho5(), C724750Sbp.LJII(this), C724750Sbp.LJIIIZ(this), new AwS562S0100000_18((HasDefaultViewModelProviderFactory) this, 1637), aFwS256S0000000_182, new C451460Hn6(this, false), new C451620HnM(this, false), new C987103tV(this, false));
        }
        this.LLLLLLLZIL = assemVMLazy2;
        this.LLLLLLZ = C452501pT.LIZIZ(new AwS562S0100000_18(this, 1635));
        this.LLLLLLZZ = C452501pT.LIZIZ(new AwS562S0100000_18(this, 1631));
        this.LLLLLZ = C452501pT.LIZIZ(new AwS562S0100000_18(this, 1645));
        this.LLLLLZL = z2;
        this.LLLLZI = C452501pT.LIZIZ(new AwS562S0100000_18(this, 1636));
        this.LLLLZIL = C452501pT.LIZIZ(new AwS562S0100000_18(this, 1628));
        this.LLLLZLL = C452501pT.LIZ(EnumC452301pR.NONE, AFwS206S0000000_18.get$arr$(424));
        this.LLLLZLLIL = UUID.randomUUID().toString();
        this.LLLLZLLLI = C452501pT.LIZIZ(new AwS562S0100000_18(this, 1630));
        this.LLLZ = C452501pT.LIZIZ(AFwS206S0000000_18.get$arr$(422));
        this.LLLZI = C452501pT.LIZIZ(new AwS560S0100000_16(this, 416));
        this.LLLZIIL = AFwS256S0000000_18.get$arr$(520);
        this.LLLZIL = C452501pT.LIZIZ(new AwS562S0100000_18(this, 1629));
        this.LLLZL = new JSEventCenter(z3);
    }

    public final JSONObject NV() {
        JSONObject jSONObject = new JSONObject();
        Iterator<Map.Entry<String, Object>> it2 = nW().entrySet().iterator();
        while (true) {
            String string = null;
            if (!it2.hasNext()) {
                break;
            }
            Map.Entry<String, Object> next = it2.next();
            String key = next.getKey();
            Object value = next.getValue();
            if (value != null) {
                string = value.toString();
            }
            C1189060h32.LJJI(key, string, jSONObject);
        }
        for (Map.Entry<String, Object> entry : WV().entrySet()) {
            String key2 = entry.getKey();
            Object value2 = entry.getValue();
            C1189060h32.LJJI(key2, value2 != null ? value2.toString() : null, jSONObject);
        }
        C1189060h32.LJJI("poi_id", getPoiId(), jSONObject);
        C1189060h32.LJJI("poi_detail_enter_from", eW(), jSONObject);
        C1189060h32.LJJI("poi_detail_enter_method", gW(), jSONObject);
        C1189060h32.LJJI("pdp_enter_from", YV(), jSONObject);
        C1189060h32.LJJI("pdp_enter_method", aW(), jSONObject);
        C1189060h32.LJJI("order_submit_enter_from", getEnterFrom(), jSONObject);
        C1189060h32.LJJI("order_submit_enter_method", getEnterMethod(), jSONObject);
        C1189060h32.LJJI("one_click_booking_type_able", SV(), jSONObject);
        C1189060h32.LJJI("one_click_booking_type_actual", TV(), jSONObject);
        return jSONObject;
    }

    public final InterfaceC1192660h8q OV() {
        return (InterfaceC1192660h8q) this.LLLLZLLLI.getValue();
    }

    @Override // X.InterfaceC1181010gq3
    public final C1181930grX Pu2() {
        return (C1181930grX) this.LLLLZLL.getValue();
    }

    public final String QV() {
        return (String) this.LLLLL.getValue();
    }

    public final String RV() {
        return (String) this.LLLLIILLL.getValue();
    }

    public final String SV() {
        return (String) this.LLLLLLL.getValue();
    }

    public final String TV() {
        return (String) this.LLLLLLLLL.getValue();
    }

    public final PoiOrderSubmitSheetViewModel UV() {
        AssemVMLazy assemVMLazy = this.LLLLLLLZIL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLZIL;
        return (PoiOrderSubmitSheetViewModel) assemVMLazy.getValue();
    }

    public final EnumC1187010gzj VV() {
        return (EnumC1187010gzj) this.LLLLZIL.getValue();
    }

    public final Map<String, Object> WV() {
        return (Map) this.LLLLLLZZ.getValue();
    }

    public final String XV() {
        return (String) this.LLLLJ.getValue();
    }

    public final String YV() {
        return (String) this.LLLLLJLJLL.getValue();
    }

    public final String aW() {
        return (String) this.LLLLLL.getValue();
    }

    public final String eW() {
        return (String) this.LLLLLLIL.getValue();
    }

    @Override // com.ss.android.ugc.aweme.slash.page.SlashFragment
    public final C1173300gdc<C1187080gzq> fT() {
        return new C1173300gdc<>(new C1187080gzq(getPoiId(), (List) this.LLLLLLZ.getValue(), XV(), RV(), VV(), oW()));
    }

    public final String gW() {
        return (String) this.LLLLLLJ.getValue();
    }

    public final String getEnterFrom() {
        return (String) this.LLLLLILLIL.getValue();
    }

    public final String getEnterMethod() {
        return (String) this.LLLLLJIL.getValue();
    }

    public final String getPoiId() {
        return (String) this.LLLLIIL.getValue();
    }

    @Override // com.ss.android.ugc.aweme.slash.page.SlashFragment
    public final InterfaceC1181300gqW hT() {
        return new InterfaceC1181300gqW() { // from class: X.0guc
            @Override // X.InterfaceC1181300gqW
            public final C11NZ<SlashApiResponse> LIZ(SlashRequestParam slashRequestParam) {
                return C11IR.LL;
            }
        };
    }

    public final C1186990gzh hW() {
        return (C1186990gzh) this.LLLZ.getValue();
    }

    public final Map<String, Object> nW() {
        return (Map) this.LLLLLZ.getValue();
    }

    public final C1192650h8p oW() {
        return (C1192650h8p) this.LLLZIL.getValue();
    }

    @Override // com.ss.android.ugc.aweme.slash.page.SlashFragment, androidx.fragment.app.SAFTikTokFragment, X.InterfaceC214902198i
    public final boolean onBackPressed() {
        C2276411E8h.LIZIZ.log("poi", "osp onBackPressed");
        qW().LLILZLL = "return";
        return super.onBackPressed();
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // com.ss.android.ugc.aweme.slash.page.SlashFragment, androidx.fragment.app.SAFTikTokFragment, androidx.fragment.app.Fragment
    public final void onStop() throws JSONException {
        PriceBreakdownData priceBreakdownData;
        String strLJIJ;
        super.onStop();
        C2276411E8h.LIZIZ.log("poi", "poi osp on stop");
        if (tW()) {
            if (this.LLLLZ) {
                JSEventCenter jSEventCenter = this.LLLZL;
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("pay_request_id", XV());
                jSEventCenter.JG1("ttls_osp_submit_finish", jSONObject);
            } else {
                C1186990gzh c1186990gzhHW = hW();
                String poiId = getPoiId();
                String strRV = RV();
                EnumC1187010gzj enumC1187010gzjVV = VV();
                c1186990gzhHW.getClass();
                ArrayList<BuySkuItem> arrayList = new ArrayList();
                for (BuySkuItem buySkuItem : c1186990gzhHW.LIZ.LIZ) {
                    arrayList.add(buySkuItem.copy(buySkuItem.skuId, buySkuItem.quantity, buySkuItem.productId));
                }
                IPIPOCashierService iPIPOCashierService = (IPIPOCashierService) PluggableExtentionKt.pluggableSpi$default(IPIPOCashierService.class, false, false, false, 14, null);
                if (iPIPOCashierService == null || (strLJIJ = iPIPOCashierService.LJIJ()) == null) {
                    strLJIJ = "";
                }
                Map<String, Object> map = c1186990gzhHW.LIZ.LIZIZ;
                if (enumC1187010gzjVV == null) {
                    enumC1187010gzjVV = EnumC1187010gzj.DEFAULT;
                }
                C1187000gzi c1187000gzi = new C1187000gzi(poiId, arrayList, strLJIJ, map, strRV, null, enumC1187010gzjVV, null);
                JSEventCenter jSEventCenter2 = this.LLLZL;
                JSONArray jSONArray = new JSONArray();
                for (BuySkuItem buySkuItem2 : arrayList) {
                    JSONObject jSONObject2 = new JSONObject();
                    String str = buySkuItem2.skuId;
                    if (str == null) {
                        str = "";
                    }
                    jSONObject2.put("sku_id", str);
                    Integer num = buySkuItem2.quantity;
                    jSONObject2.put("num", num != null ? num.intValue() : 0);
                    String str2 = buySkuItem2.productId;
                    if (str2 == null) {
                        str2 = "";
                    }
                    jSONObject2.put("product_id", str2);
                    jSONArray.put(jSONObject2);
                }
                Map<String, Object> map2 = c1187000gzi.LIZLLL;
                JSONObject jSONObjectLIZ = map2 != null ? C051S.LIZ(map2) : new JSONObject();
                Object obj = c1187000gzi.LIZ;
                if (obj == null) {
                    obj = "";
                }
                jSONObjectLIZ.put("poi_id", obj);
                jSONObjectLIZ.put("sku_list", jSONArray);
                jSONObjectLIZ.put("pay_info", c1187000gzi.LIZJ);
                C1189060h32.LJIL(jSONObjectLIZ, "initial_coupon_info", c1187000gzi.LJ);
                jSONObjectLIZ.put("order_type", c1187000gzi.LJI.getCode());
                EnumC1187020gzk enumC1187020gzk = hW().LIZIZ;
                C1189060h32.LJIL(jSONObjectLIZ, Scene.SCENE_SERVICE, enumC1187020gzk != null ? Integer.valueOf(enumC1187020gzk.getCode()) : null);
                jSEventCenter2.JG1("ttls_osp_sync", jSONObjectLIZ);
            }
        }
        if (this.LLLLLZIL) {
            qW().LLILZLL = "next";
        }
        String poiId2 = getPoiId();
        String strEW = eW();
        String strGW = gW();
        String strYV = YV();
        String strAW = aW();
        String enterFrom = getEnterFrom();
        String enterMethod = getEnterMethod();
        String strQV = QV();
        boolean z = YW() != null;
        String str3 = qW().LLILZLL;
        if (str3 == null) {
            str3 = "close";
        }
        long jCurrentTimeMillis = System.currentTimeMillis() - qW().LLILZIL;
        Map<String, Object> mapWV = WV();
        Map<String, Object> mapNW = nW();
        SkuListData skuListData = (SkuListData) ta2(new C1180090goZ("osp_buy_sku_info"));
        SkuPrice skuPrice = skuListData != null ? skuListData.getSkuPrice() : null;
        OrderSummaryData orderSummaryData = (OrderSummaryData) ta2(new C1180090goZ("osp_footer"));
        List<PriceItem> list = (orderSummaryData == null || (priceBreakdownData = orderSummaryData.getPriceBreakdownData(OV())) == null) ? null : priceBreakdownData.subPrices;
        CouponModuleData couponModuleData = (CouponModuleData) ta2(new C1180090goZ("osp_coupon_module"));
        String couponTrackInfo = couponModuleData != null ? couponModuleData.getCouponTrackInfo() : null;
        String strXV = XV();
        String str4 = (String) this.LLLLIL.getValue();
        NavigationBarData navigationBarData = (NavigationBarData) ta2(new C1180090goZ("osp_navigation_bar"));
        String mobAtmosphereTagIds = navigationBarData != null ? navigationBarData.getMobAtmosphereTagIds() : null;
        SkuListData skuListData2 = (SkuListData) ta2(new C1180090goZ("osp_buy_sku_info"));
        Boolean boolValueOf = skuListData2 != null ? Boolean.valueOf(skuListData2.isOutOfStock()) : null;
        PageFinder pageFinderVia = PageFinder.via((Fragment) this);
        String strSV = SV();
        String strTV = TV();
        Map mapLIZ = C308370C6x.LIZ(3);
        C1185040gwY c1185040gwY = C1185040gwY.LIZ;
        JSONObject jSONObject3 = new JSONObject();
        for (Map.Entry entry : ((LinkedHashMap) mapLIZ).entrySet()) {
            C1189060h32.LJJI((String) entry.getKey(), (String) entry.getValue(), jSONObject3);
        }
        for (Map.Entry<String, Object> entry2 : mapWV.entrySet()) {
            String key = entry2.getKey();
            Object value = entry2.getValue();
            C1189060h32.LJJI(key, value != null ? value.toString() : null, jSONObject3);
        }
        jSONObject3.put("poi_id", poiId2);
        jSONObject3.put("enter_from", "order_submit_page");
        jSONObject3.put("poi_detail_enter_from", strEW);
        jSONObject3.put("poi_detail_enter_method", strGW);
        jSONObject3.put("pdp_enter_from", strYV);
        jSONObject3.put("pdp_enter_method", strAW);
        jSONObject3.put("order_submit_enter_from", enterFrom);
        jSONObject3.put("order_submit_enter_method", enterMethod);
        jSONObject3.put("one_click_booking_type_able", strSV);
        jSONObject3.put("one_click_booking_type_actual", strTV);
        C1189060h32.LIZIZ(strQV, jSONObject3);
        jSONObject3.put("is_load_data", C1189060h32.LJJIIZ(Boolean.valueOf(z)));
        jSONObject3.put("quit_type", str3);
        jSONObject3.put("stay_time", jCurrentTimeMillis);
        for (Map.Entry<String, Object> entry3 : mapNW.entrySet()) {
            C1189060h32.LJJI(entry3.getKey(), String.valueOf(entry3.getValue()), jSONObject3);
        }
        if (skuPrice != null) {
            C1189060h32.LJJI("discount", String.valueOf(skuPrice.discountNum), jSONObject3);
            C1189060h32.LJJI("discount_type", skuPrice.discountType, jSONObject3);
            C1189060h32.LJJI("currency", skuPrice.currency, jSONObject3);
            C1189060h32.LJJI("save_amount", skuPrice.saveAmount, jSONObject3);
        }
        if (list != null) {
            for (PriceItem priceItem : list) {
                C1189060h32.LJJI(priceItem.key, priceItem.priceAmount, jSONObject3);
            }
        }
        C1189060h32.LJJI("coupon_info", couponTrackInfo, jSONObject3);
        jSONObject3.put("pay_request_id", strXV);
        C1189060h32.LJJI("pdp_atmosphere_tag_ids", str4, jSONObject3);
        C1189060h32.LJJI("osp_atmosphere_tag_ids", mobAtmosphereTagIds, jSONObject3);
        C1189060h32.LJJI("is_out_of_stock", Intrinsics.LJFF(boolValueOf, Boolean.TRUE) ? "1" : CardStruct.IStatusCode.DEFAULT, jSONObject3);
        C1185050gwZ c1185050gwZ = new C1185050gwZ(pageFinderVia);
        c1185040gwY.getClass();
        C1185040gwY.LIZJ("leave_order_submit_page", jSONObject3, c1185050gwZ);
    }

    public final PoiOrderSubmitViewModel qW() {
        AssemVMLazy assemVMLazy = this.LLLLLLLLLL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLZIL;
        return (PoiOrderSubmitViewModel) assemVMLazy.getValue();
    }

    @Override // com.ss.android.ugc.aweme.slash.page.SlashFragment
    public final InterfaceC1180800gpi sT() {
        return new C1193140h9c();
    }

    public final boolean tW() {
        return ((Boolean) this.LLLLZI.getValue()).booleanValue();
    }

    @Override // com.ss.android.ugc.aweme.slash.page.SlashFragment
    public final C1202330hOR vU() {
        if (Build.VERSION.SDK_INT >= 35) {
            return C1193630hAP.LIZ(C1192870h9B.LIZ, R.attr.zp, R.attr.zo, false, 28);
        }
        C1202330hOR c1202330hOR = new C1202330hOR(false, 3);
        c1202330hOR.LIZLLL = true;
        c1202330hOR.LJFF = -1;
        c1202330hOR.LJI = R.attr.zo;
        c1202330hOR.LIZ = false;
        Context context = getContext();
        c1202330hOR.LIZJ = true ^ (context != null ? C960203pA.LIZIZ(context) : false);
        return c1202330hOR;
    }

    public static void wW() {
        IUnsampledTraceLogger iUnsampledTraceLogger;
        SettingsManager.LIZLLL().getClass();
        if (!SettingsManager.LIZ("poi_user_moving_line_track", false) || (iUnsampledTraceLogger = (IUnsampledTraceLogger) PluggableExtentionKt.pluggableSpi$default(IUnsampledTraceLogger.class, false, false, false, 14, null)) == null) {
            return;
        }
        iUnsampledTraceLogger.LIZIZ();
    }

    @Override // com.ss.android.ugc.aweme.slash.page.SlashFragment
    public final void DT() {
        if (!tW()) {
            super.DT();
        } else {
            String str = TuxSheet._pnsPageId;
            C1391190mJ3.LJFF(this, C343970De7.LIZ);
        }
    }

    @Override // com.ss.android.ugc.aweme.slash.page.SlashFragment
    public final boolean PU() {
        return tW();
    }

    @Override // com.ss.android.ugc.aweme.slash.page.SlashFragment
    public final InterfaceC1181300gqW iT() {
        return hW();
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x0084  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int iW() {
        /*
            r4 = this;
            boolean r0 = X.C299110Bnx.LIZ()
            r2 = 0
            if (r0 == 0) goto L29
            java.lang.String r0 = com.bytedance.tux.sheet.sheet.TuxSheet._pnsPageId
            X.16BC r1 = X.C1391190mJ3.LJIIIZ(r4)
            boolean r0 = r1 instanceof com.ss.android.ugc.aweme.poi.osp.TuxOspSheetBehavior
            if (r0 == 0) goto L1b
            com.bytedance.tux.sheet.sheet.TuxSheetBehavior r1 = (com.bytedance.tux.sheet.sheet.TuxSheetBehavior) r1
            if (r1 == 0) goto L1b
            int r0 = r1.LJIILLIIL
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
        L1b:
            r3 = 0
            if (r2 == 0) goto L3e
            int r0 = r2.intValue()
            if (r0 <= 0) goto L3e
            int r0 = r2.intValue()
            return r0
        L29:
            java.lang.String r0 = com.bytedance.tux.sheet.sheet.TuxSheet._pnsPageId
            X.16BC r1 = X.C1391190mJ3.LJIIIZ(r4)
            boolean r0 = r1 instanceof com.ss.android.ugc.aweme.poi.osp.OspBottomSheetBehavior
            if (r0 == 0) goto L1b
            com.google.android.material.bottomsheet.BottomSheetBehavior r1 = (com.google.android.material.bottomsheet.BottomSheetBehavior) r1
            if (r1 == 0) goto L1b
            int r0 = r1.collapsedOffset
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
            goto L1b
        L3e:
            android.content.Context r0 = r4.getContext()
            if (r0 == 0) goto L86
            int r2 = X.C497820Jfg.LIZ(r0)
        L48:
            boolean r0 = X.C299110Bnx.LIZ()
            if (r0 == 0) goto L71
            java.lang.String r0 = com.bytedance.tux.sheet.sheet.TuxSheet._pnsPageId
            X.16BC r1 = X.C1391190mJ3.LJIIIZ(r4)
            boolean r0 = r1 instanceof com.bytedance.tux.sheet.sheet.TuxSheetBehavior
            if (r0 == 0) goto L84
            com.bytedance.tux.sheet.sheet.TuxSheetBehavior r1 = (com.bytedance.tux.sheet.sheet.TuxSheetBehavior) r1
            if (r1 == 0) goto L84
            int r0 = r1.getPeekHeight()
        L60:
            if (r2 == 0) goto L88
            if (r0 == 0) goto L88
            int r2 = r2 - r0
            android.content.Context r0 = r4.getContext()
            if (r0 == 0) goto L6f
            int r3 = X.C497820Jfg.LIZJ(r0)
        L6f:
            int r2 = r2 + r3
            return r2
        L71:
            java.lang.String r0 = com.bytedance.tux.sheet.sheet.TuxSheet._pnsPageId
            X.16BC r1 = X.C1391190mJ3.LJIIIZ(r4)
            boolean r0 = r1 instanceof com.google.android.material.bottomsheet.BottomSheetBehavior
            if (r0 == 0) goto L84
            com.google.android.material.bottomsheet.BottomSheetBehavior r1 = (com.google.android.material.bottomsheet.BottomSheetBehavior) r1
            if (r1 == 0) goto L84
            int r0 = r1.getPeekHeight()
            goto L60
        L84:
            r0 = 0
            goto L60
        L86:
            r2 = 0
            goto L48
        L88:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.poi.osp.PoiOrderSubmitSlashFragment.iW():int");
    }

    @Override // com.ss.android.ugc.aweme.poi.osp.PoiOrderSubmitCashierAbility
    public final InterfaceC1192660h8q n8() {
        return OV();
    }

    @Override // com.ss.android.ugc.aweme.slash.page.SlashFragment, androidx.fragment.app.SAFTikTokFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        InterfaceC1192660h8q interfaceC1192660h8qOV;
        InterfaceC1192660h8q interfaceC1192660h8qOV2;
        super.onDestroy();
        C2276411E8h.LIZIZ.log("poi", "poi osp on destroy");
        C1558520qew.LJIIJJI(C1558360qeg.LJFF(this, null), PoiOrderSubmitCashierAbility.class, null);
        if (getContext() != null && (interfaceC1192660h8qOV = OV()) != null && interfaceC1192660h8qOV.LJIIJJI() && (interfaceC1192660h8qOV2 = OV()) != null) {
            interfaceC1192660h8qOV2.LJIIIIZZ();
        }
        InterfaceC1192660h8q interfaceC1192660h8qOV3 = OV();
        if (interfaceC1192660h8qOV3 != null) {
            interfaceC1192660h8qOV3.LJIILJJIL();
        }
    }

    @Override // com.ss.android.ugc.aweme.slash.page.SlashFragment, androidx.fragment.app.SAFTikTokFragment, androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
        C2276411E8h.LIZIZ.log("poi", "poi osp onPause");
    }

    @Override // com.ss.android.ugc.aweme.slash.page.SlashFragment, androidx.fragment.app.SAFTikTokFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        C2276411E8h.LIZIZ.log("poi", "poi osp onResume");
    }

    @Override // com.ss.android.ugc.aweme.slash.page.SlashFragment, androidx.fragment.app.SAFTikTokFragment, androidx.fragment.app.Fragment
    public final void onStart() {
        C19EG activity;
        Window window;
        super.onStart();
        if (!tW() && (activity = getActivity()) != null && (window = activity.getWindow()) != null) {
            window.setSoftInputMode(32);
        }
        C2276411E8h.LIZIZ.log("poi", "poi osp onStart");
    }

    @Override // X.InterfaceC1740760vOs
    public final String w3() {
        return String.valueOf(hashCode());
    }

    @Override // com.ss.android.ugc.aweme.slash.page.SlashFragment
    public final SlashRequestParam NU(SlashRequestParam slashRequestParam) {
        return GA2(getPoiId(), (List) this.LLLLLLZ.getValue(), EnumC1187020gzk.INITIAL_FETCH, null, RV(), VV());
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0045  */
    @Override // com.ss.android.ugc.aweme.slash.page.SlashFragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean ZS(X.C1180620gpQ r6) {
        /*
            r5 = this;
            r4 = 0
            if (r6 == 0) goto L45
            java.util.List r0 = r6.LJIILIIL()
            if (r0 == 0) goto L45
            java.util.Iterator r3 = r0.iterator()
        Ld:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L43
            java.lang.Object r2 = r3.next()
            r0 = r2
            X.0gpu r0 = (X.C1180920gpu) r0
            X.0goZ r0 = r0.LIZIZ
            java.lang.String r1 = r0.LIZ
            java.lang.String r0 = "osp_buy_sku_info"
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            if (r0 == 0) goto Ld
        L26:
            X.0gpu r2 = (X.C1180920gpu) r2
            if (r2 == 0) goto L45
            com.ss.android.ugc.aweme.slash.component.BaseComponentData r1 = r2.LIZLLL
        L2c:
            boolean r0 = r1 instanceof com.ss.android.ugc.aweme.poi.osp.repo.model.SkuListData
            if (r0 == 0) goto L38
            com.ss.android.ugc.aweme.poi.osp.repo.model.SkuListData r1 = (com.ss.android.ugc.aweme.poi.osp.repo.model.SkuListData) r1
            if (r1 == 0) goto L38
            java.util.List r4 = r1.getSkuDataList()
        L38:
            r2 = 0
            r1 = 1
            if (r4 == 0) goto L47
            boolean r0 = r4.isEmpty()
            if (r0 != 0) goto L47
            return r1
        L43:
            r2 = r4
            goto L26
        L45:
            r1 = r4
            goto L2c
        L47:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.poi.osp.PoiOrderSubmitSlashFragment.ZS(X.0gpQ):boolean");
    }

    @Override // com.ss.android.ugc.aweme.slash.page.SlashFragment, androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        super.onAttach(context);
        if (C298360Bmk.LIZ()) {
            if (!C1192840h98.LIZ) {
                C1192840h98.LIZ = true;
                C1180090goZ c1180090goZ = new C1180090goZ("osp_payment_info");
                C1192580h8i c1192580h8i = new C1192580h8i();
                HashMap<C1180090goZ, InterfaceC1180970gpz> map = C1180170goh.LIZIZ;
                map.put(c1180090goZ, c1192580h8i);
                map.put(new C1180090goZ("osp_coupon_module"), new C1192760h90());
                map.put(new C1180090goZ("osp_coupon_guide"), new C1193120h9a());
                map.put(new C1180090goZ("osp_footer"), new C1192960h9K());
                map.put(new C1180090goZ("osp_navigation_bar"), new C1193140h9c());
                map.put(new C1180090goZ("osp_privacy"), new C1192570h8h());
                map.put(new C1180090goZ("osp_buy_sku_info"), new C1192850h99());
                map.put(new C1180090goZ("osp_exit_confirm_modal"), new C1193130h9b());
                map.put(new C1180090goZ("osp_price_summary"), new C1193110h9Z());
                C1183360gtq c1183360gtq = C1183350gtp.LIZ;
                if (C1180170goh.LIZ == null) {
                    C1180170goh.LIZ = c1183360gtq;
                    return;
                }
                return;
            }
            return;
        }
        C1184000gus.LIZ();
    }

    @Override // com.ss.android.ugc.aweme.slash.page.SlashFragment, androidx.fragment.app.SAFTikTokFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C18JG.LJII(this, "a4257.b8216", (String) this.LLLLIIIILLL.getValue());
        if (!nW().containsKey("sku_ids")) {
            nW().put("sku_ids", C13LP.LJJLIIIJ((Iterable) this.LLLLLLZ.getValue(), null, null, null, 0, null, AFwS256S0000000_18.get$arr$(524), 31));
        }
        if (!nW().containsKey("product_ids")) {
            nW().put("product_ids", C13LP.LJJLIIIJ((Iterable) this.LLLLLLZ.getValue(), null, null, null, 0, null, AFwS256S0000000_18.get$arr$(526), 31));
        }
        PageFinder pageFinderVia = PageFinder.via((Fragment) this);
        BcmParams bcmParams = new BcmParams();
        bcmParams.put("poi_id", getPoiId());
        bcmParams.put("product_id", String.valueOf(nW().get("product_ids")));
        bcmParams.put("merchant_id", String.valueOf(nW().get("merchant_ids")));
        C18JG.LJIIIIZZ(pageFinderVia, bcmParams);
        PoiOrderSubmitViewModel poiOrderSubmitViewModelQW = qW();
        C23250099c.LIZLLL(ViewModelKt.getViewModelScope(poiOrderSubmitViewModelQW), null, null, new C1172750gcj(poiOrderSubmitViewModelQW, null), 3);
        qW().LLILZIL = System.currentTimeMillis();
        qW().LLIZLLLIL = tW();
        PoiOrderSubmitViewModel poiOrderSubmitViewModelQW2 = qW();
        poiOrderSubmitViewModelQW2.withState(new AwS105S0110000_18(!tW(), poiOrderSubmitViewModelQW2, 23));
    }

    public final void rW(LsExceptionUx lsExceptionUx) {
        long jIntValue;
        if (getContext() != null) {
            C2276411E8h.LIZIZ.log("poi", "osp handleExceptionUx");
            List<SkuBuyLimit> list = lsExceptionUx.skuBuyLimit;
            if (list != null) {
                qW().setState(new AwS597S0100000_18(list, (List<String>) 1099));
            }
            C1192810h95 c1192810h95 = C1192810h95.LIZ;
            AwS562S0100000_18 awS562S0100000_18 = new AwS562S0100000_18(this, 1632);
            AwS562S0100000_18 awS562S0100000_182 = new AwS562S0100000_18(this, 1633);
            AwS419S0200000_18 awS419S0200000_18 = new AwS419S0200000_18(this, lsExceptionUx, 83);
            AwS597S0100000_18 awS597S0100000_18 = new AwS597S0100000_18(this, 416);
            AwS562S0100000_18 awS562S0100000_183 = new AwS562S0100000_18(this, 1634);
            c1192810h95.getClass();
            Integer num = lsExceptionUx.type;
            int value = EnumC1192690h8t.TOAST.getValue();
            if (num != null && num.intValue() == value) {
                ToastContent toastContent = lsExceptionUx.toastContent;
                if (toastContent != null) {
                    Context context = getContext();
                    C698190Ra5 c698190Ra5LJFF = null;
                    if (context == null) {
                        AbstractC1387200mCc abstractC1387200mCcLIZIZ = C1906580ziK.LIZIZ();
                        if (abstractC1387200mCcLIZIZ != null) {
                            context = abstractC1387200mCcLIZIZ.LIZIZ();
                        } else {
                            context = null;
                        }
                    }
                    String str = toastContent.icon;
                    if (str != null && str.length() != 0 && context != null) {
                        C01GW c01gw = C2248361CzK.LIZ;
                        c698190Ra5LJFF = C2248361CzK.LJFF(context, toastContent.icon);
                    }
                    C1192810h95.LIZIZ = new C1192780h92(toastContent, awS562S0100000_18, awS562S0100000_182, awS419S0200000_18, awS597S0100000_18, awS562S0100000_183);
                    C1389880mGw c1389880mGw = new C1389880mGw(this);
                    if (c698190Ra5LJFF != null) {
                        c1389880mGw.LJ(c698190Ra5LJFF.LIZ);
                    }
                    c1389880mGw.LJIIIZ(toastContent.message);
                    Integer num2 = toastContent.duration;
                    if (num2 != null) {
                        jIntValue = num2.intValue();
                    } else {
                        jIntValue = 3000;
                    }
                    c1389880mGw.LIZLLL(jIntValue);
                    C1192780h92 c1192780h92 = C1192810h95.LIZIZ;
                    if (c1192780h92 != null) {
                        c1389880mGw.LIZJ(c1192780h92);
                        c1389880mGw.LJIIJ();
                        return;
                    } else {
                        "Required value was null.".toString();
                        throw new IllegalArgumentException("Required value was null.");
                    }
                }
                C1389890mGx c1389890mGx = new C1389890mGx(this);
                c1389890mGx.LJIIIZ(2131848597);
                c1389890mGx.LIZLLL(2000L);
                c1389890mGx.LJIIJJI();
                return;
            }
            int value2 = EnumC1192690h8t.DIALOG.getValue();
            if (num == null || num.intValue() != value2) {
                return;
            }
            if (lsExceptionUx.dialogContent != null && getContext() != null) {
                Context context2 = getContext();
                DialogContent dialogContent = lsExceptionUx.dialogContent;
                if (context2 == null) {
                    return;
                }
                C1397580mTM c1397580mTM = new C1397580mTM(context2);
                c1397580mTM.LJI(dialogContent.title);
                c1397580mTM.LIZIZ(dialogContent.message);
                C985403tE.LIZ(c1397580mTM, new AwS35S0600000_18(dialogContent, awS562S0100000_18, awS562S0100000_182, awS419S0200000_18, awS597S0100000_18, awS562S0100000_183, 1));
                c1397580mTM.LJII = false;
                new C1397510mTF(c1397580mTM).LIZLLL();
                return;
            }
            C1389890mGx c1389890mGx2 = new C1389890mGx(this);
            c1389890mGx2.LJIIIZ(2131848597);
            c1389890mGx2.LIZLLL(2000L);
            c1389890mGx2.LJIIJJI();
        }
    }

    public final void vW(String str) throws JSONException {
        String mobProductIds;
        String mobSkuIds;
        String mobMerchantIds;
        String mobProductQuantities;
        PriceBreakdownData priceBreakdownData;
        SkuListData skuListData = (SkuListData) ta2(new C1180090goZ("osp_buy_sku_info"));
        JSONObject jSONObject = oW().toJSONObject();
        String str2 = null;
        if (skuListData != null) {
            mobProductIds = skuListData.getMobProductIds();
        } else {
            mobProductIds = null;
        }
        C1189060h32.LJJI("product_ids", mobProductIds, jSONObject);
        if (skuListData != null) {
            mobSkuIds = skuListData.getMobSkuIds();
        } else {
            mobSkuIds = null;
        }
        C1189060h32.LJJI("sku_ids", mobSkuIds, jSONObject);
        if (skuListData != null) {
            mobMerchantIds = skuListData.getMobMerchantIds();
        } else {
            mobMerchantIds = null;
        }
        C1189060h32.LJJI("merchant_ids", mobMerchantIds, jSONObject);
        if (skuListData != null) {
            mobProductQuantities = skuListData.getMobProductQuantities();
        } else {
            mobProductQuantities = null;
        }
        C1189060h32.LJJI("quantity", mobProductQuantities, jSONObject);
        C1189060h32.LJJI("order_id", str, jSONObject);
        OrderSummaryData orderSummaryData = (OrderSummaryData) ta2(new C1180090goZ("osp_footer"));
        if (orderSummaryData != null && (priceBreakdownData = orderSummaryData.getPriceBreakdownData(OV())) != null) {
            List<PriceItem> list = priceBreakdownData.subPrices;
            if (list != null) {
                for (PriceItem priceItem : list) {
                    C1189060h32.LJJI(priceItem.key, priceItem.priceAmount, jSONObject);
                }
            }
            PriceItem priceItem2 = priceBreakdownData.totalPrice;
            if (priceItem2 != null) {
                str2 = priceItem2.currencySymbol;
            }
            C1189060h32.LJJI("currency_symbol", str2, jSONObject);
        }
        InterfaceC1192660h8q interfaceC1192660h8qOV = OV();
        if (interfaceC1192660h8qOV != null) {
            interfaceC1192660h8qOV.LIZ(jSONObject);
        }
    }

    @Override // X.InterfaceC1058150ddt
    public final void LLLLIIIILLL(TuxSheet tuxSheet, int i) {
        boolean z;
        if (!tW()) {
            return;
        }
        PoiOrderSubmitViewModel poiOrderSubmitViewModelQW = qW();
        if (i == 3) {
            z = true;
        } else {
            z = false;
        }
        poiOrderSubmitViewModelQW.withState(new AwS105S0110000_18(z, poiOrderSubmitViewModelQW, 23));
    }

    @Override // com.ss.android.ugc.aweme.slash.page.SlashFragment
    public final C13IQ<? extends UIAssem> MU(boolean z, SlashRequestParam slashRequestParam) {
        if (z) {
            C786410Ut5.J4((DialogC1389620mGW) this.LLLZI.getValue());
            return null;
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0086  */
    @Override // com.ss.android.ugc.aweme.slash.page.SlashFragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void dV(X.C1180620gpQ r31, boolean r32) throws org.json.JSONException {
        /*
            Method dump skipped, instruction units count: 885
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.poi.osp.PoiOrderSubmitSlashFragment.dV(X.0gpQ, boolean):void");
    }

    @Override // com.ss.android.ugc.aweme.slash.page.SlashFragment
    public final Pair<EnumC1181540gqu, C13IQ<? extends UIAssem>> lT(Throwable th, boolean z) {
        if (z) {
            C1389880mGw c1389880mGw = new C1389880mGw(this);
            c1389880mGw.LJIIIIZZ(2131848597);
            c1389880mGw.LJIIJ();
            return new Pair<>(EnumC1181540gqu.NONE, null);
        }
        C1173110gdJ c1173110gdJ = C1173110gdJ.LIZ;
        String message = th.getMessage();
        c1173110gdJ.getClass();
        c1173110gdJ.LIZJ("poi_order_show_error_page", new AwS8S1001000_18(-1, message, 6));
        return new Pair<>(EnumC1181540gqu.COMMON, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x005f  */
    @Override // com.ss.android.ugc.aweme.slash.page.SlashFragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final kotlin.Pair<X.EnumC1181540gqu, X.C13IQ<? extends com.bytedance.assem.arch.core.UIAssem>> mT(X.C1180620gpQ r7, boolean r8) {
        /*
            r6 = this;
            r5 = 0
            if (r7 == 0) goto L5f
            java.util.List r0 = r7.LJIILIIL()
            if (r0 == 0) goto L5f
            java.util.Iterator r3 = r0.iterator()
        Ld:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L5d
            java.lang.Object r2 = r3.next()
            r0 = r2
            X.0gpu r0 = (X.C1180920gpu) r0
            X.0goZ r0 = r0.LIZIZ
            java.lang.String r1 = r0.LIZ
            java.lang.String r0 = "osp_buy_sku_info"
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            if (r0 == 0) goto Ld
        L26:
            X.0gpu r2 = (X.C1180920gpu) r2
            if (r2 == 0) goto L5f
            com.ss.android.ugc.aweme.slash.component.BaseComponentData r1 = r2.LIZLLL
        L2c:
            boolean r0 = r1 instanceof com.ss.android.ugc.aweme.poi.osp.repo.model.SkuListData
            if (r0 == 0) goto L40
            com.ss.android.ugc.aweme.poi.osp.repo.model.SkuListData r1 = (com.ss.android.ugc.aweme.poi.osp.repo.model.SkuListData) r1
            if (r1 == 0) goto L40
            java.util.List r0 = r1.getSkuDataList()
            if (r0 == 0) goto L40
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L61
        L40:
            if (r8 != 0) goto L61
            X.0gdJ r4 = X.C1173110gdJ.LIZ
            r4.getClass()
            kotlin.jvm.internal.AwS8S1001000_18 r3 = new kotlin.jvm.internal.AwS8S1001000_18
            r2 = -2
            java.lang.String r1 = "empty sku list"
            r0 = 6
            r3.<init>(r2, r1, r0)
            java.lang.String r0 = "poi_order_show_error_page"
            r4.LIZJ(r0, r3)
            X.0gqu r1 = X.EnumC1181540gqu.COMMON
            kotlin.Pair r0 = new kotlin.Pair
            r0.<init>(r1, r5)
            return r0
        L5d:
            r2 = r5
            goto L26
        L5f:
            r1 = r5
            goto L2c
        L61:
            X.0gqu r1 = X.EnumC1181540gqu.NONE
            kotlin.Pair r0 = new kotlin.Pair
            r0.<init>(r1, r5)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.poi.osp.PoiOrderSubmitSlashFragment.mT(X.0gpQ, boolean):kotlin.Pair");
    }

    @Override // com.ss.android.ugc.aweme.slash.page.SlashFragment, androidx.fragment.app.SAFTikTokFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) throws JSONException {
        Integer numLIZJ;
        int i;
        int iLIZJ;
        C1193670hAT c1193670hAT;
        super.onViewCreated(view, bundle);
        if ((view instanceof C1193670hAT) && (c1193670hAT = (C1193670hAT) view) != null) {
            c1193670hAT.setDispatchEventListener(new AwS597S0100000_18(this, 417));
        }
        View viewFindViewById = view.findViewById(R.id.w0u);
        final int iIntValue = 0;
        if (viewFindViewById != null) {
            ViewGroup.LayoutParams layoutParams = viewFindViewById.getLayoutParams();
            if (layoutParams != null) {
                Context context = viewFindViewById.getContext();
                if (context != null) {
                    iLIZJ = C497820Jfg.LIZJ(context);
                } else {
                    iLIZJ = 0;
                }
                layoutParams.height = iLIZJ;
            }
        } else {
            viewFindViewById = null;
        }
        this.LLLZLZ = viewFindViewById;
        TuxIconView tuxIconView = (TuxIconView) view.findViewById(R.id.e1y);
        if (tuxIconView != null) {
            if (!qW().getState().LLILZIL && tW()) {
                i = 0;
            } else {
                i = 8;
            }
            C786410Ut5.LJLLLLLL(i, tuxIconView);
            C786410Ut5.I7(new AkS57S0200000_18(this, tuxIconView, 40), tuxIconView);
        } else {
            tuxIconView = null;
        }
        this.LLLZZ = tuxIconView;
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jvLt = Lt();
        if (viewOnAttachStateChangeListenerC20604515jvLt != null) {
            Context context2 = viewOnAttachStateChangeListenerC20604515jvLt.getContext();
            if (context2 != null && (numLIZJ = C1308910kAL.LIZJ(R.attr.zp, context2)) != null) {
                iIntValue = numLIZJ.intValue();
            }
            final int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8));
            viewOnAttachStateChangeListenerC20604515jvLt.addItemDecoration(new C0DXR(iIntValue, iLIZIZ) { // from class: X.0GhN
                public final int LL;
                public final int LLILLJJLI = 1;
                public final float LLILLL = 0.0f;
                public final float LLILZ = 0.0f;
                public final boolean LLILZIL = true;
                public final Paint LLILZLL;

                {
                    this.LL = iLIZIZ;
                    Paint paint = new Paint(1);
                    paint.setColor(iIntValue);
                    paint.setStyle(Paint.Style.FILL);
                    this.LLILZLL = paint;
                }

                @Override // X.C0DXR
                public final void LIZLLL(Canvas canvas, RecyclerView recyclerView, C21673919s1 c21673919s1) {
                    ViewGroup.MarginLayoutParams marginLayoutParams;
                    Integer numValueOf;
                    ViewGroup.MarginLayoutParams marginLayoutParams2;
                    Integer numValueOf2;
                    if (this.LLILLJJLI == 1) {
                        int measuredWidth = recyclerView.getMeasuredWidth();
                        int childCount = recyclerView.getChildCount();
                        for (int i2 = 0; i2 < childCount; i2++) {
                            View childAt = recyclerView.getChildAt(i2);
                            ViewGroup.LayoutParams layoutParams2 = childAt.getLayoutParams();
                            if (layoutParams2 instanceof RecyclerView.LayoutParams) {
                                marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2;
                            } else {
                                marginLayoutParams2 = null;
                            }
                            int top = childAt.getTop();
                            if (marginLayoutParams2 != null) {
                                numValueOf2 = Integer.valueOf(marginLayoutParams2.topMargin);
                            } else {
                                numValueOf2 = null;
                            }
                            int iLIZJ2 = top + C1175120ggY.LIZJ(numValueOf2);
                            int i3 = iLIZJ2 - this.LL;
                            if (this.LLILZIL) {
                                canvas.drawRect(0 + this.LLILLL, i3, measuredWidth - this.LLILZ, iLIZJ2, this.LLILZLL);
                            } else {
                                float f = i3;
                                float f2 = iLIZJ2;
                                canvas.drawRect(0.0f, f, this.LLILLL, f2, this.LLILZLL);
                                float f3 = measuredWidth;
                                canvas.drawRect(f3 - this.LLILZ, f, f3, f2, this.LLILZLL);
                            }
                        }
                        return;
                    }
                    int measuredHeight = recyclerView.getMeasuredHeight();
                    int childCount2 = recyclerView.getChildCount();
                    for (int i4 = 0; i4 < childCount2; i4++) {
                        View childAt2 = recyclerView.getChildAt(i4);
                        ViewGroup.LayoutParams layoutParams3 = childAt2.getLayoutParams();
                        if (layoutParams3 instanceof RecyclerView.LayoutParams) {
                            marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams3;
                        } else {
                            marginLayoutParams = null;
                        }
                        int left = childAt2.getLeft();
                        if (marginLayoutParams != null) {
                            numValueOf = Integer.valueOf(marginLayoutParams.leftMargin);
                        } else {
                            numValueOf = null;
                        }
                        int iLIZJ3 = left + C1175120ggY.LIZJ(numValueOf);
                        int i5 = iLIZJ3 - this.LL;
                        if (this.LLILZIL) {
                            canvas.drawRect(i5, 0 + this.LLILLL, iLIZJ3, measuredHeight - this.LLILZ, this.LLILZLL);
                        } else {
                            float f4 = i5;
                            float f5 = this.LLILLL;
                            float f6 = iLIZJ3;
                            canvas.drawRect(f4, 0 + f5, f6, f5, this.LLILZLL);
                            float f7 = measuredHeight;
                            canvas.drawRect(f4, f7 - this.LLILZ, f6, f7, this.LLILZLL);
                        }
                    }
                }

                @Override // X.C0DXR
                public final void LIZIZ(Rect rect, View view2, RecyclerView recyclerView, C21673919s1 c21673919s1) {
                    recyclerView.getChildAdapterPosition(view2);
                    if (this.LLILLJJLI == 1) {
                        rect.set(0, 0, 0, this.LL);
                    } else {
                        rect.set(0, 0, this.LL, 0);
                    }
                }
            });
        }
        FrameLayout frameLayout = (FrameLayout) view.findViewById(R.id.psv);
        this.LLLZLL = frameLayout;
        if (frameLayout != null && Build.VERSION.SDK_INT >= 35) {
            C14K9.LJIJJ(frameLayout, new C1209040hZG(this, 4));
        }
        C1558520qew.LJII(C1558360qeg.LJFF(this, null), this, PoiOrderSubmitCashierAbility.class, null, null);
        C1558520qew.LJII(C1558360qeg.LJFF(this, null), this, PoiOrderSubmitSlashAbility.class, null, null);
        C1554960qZC.LIZ(C1558360qeg.LJFF(this, null), oW(), C1192650h8p.class, "source_default_key");
        InterfaceC1192660h8q interfaceC1192660h8qOV = OV();
        if (interfaceC1192660h8qOV != null) {
            interfaceC1192660h8qOV.LJIILLIIL(new InterfaceC1709520uaU() { // from class: X.0h8l
                @Override // X.InterfaceC1709520uaU
                public final C1192680h8s LIZ() {
                    Context context3 = this.LIZ.getContext();
                    if (context3 == null) {
                        return null;
                    }
                    PoiOrderSubmitSlashFragment poiOrderSubmitSlashFragment = this.LIZ;
                    C1193380hA0 c1193380hA0 = new C1193380hA0(context3, null, 6, 0);
                    c1193380hA0.setExpandIconVisible(false);
                    ViewGroup.LayoutParams layoutParams2 = new ViewGroup.LayoutParams(-1, -2);
                    ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c1193380hA0);
                    c1193380hA0.setLayoutParams(layoutParams2);
                    return new C1192680h8s(c1193380hA0, new AwS384S0200000_18(poiOrderSubmitSlashFragment, c1193380hA0, 114));
                }

                @Override // X.InterfaceC1709520uaU
                public final void LIZIZ() {
                    PageInfo pageInfoYW = this.LIZ.YW();
                    PageInfoData pageInfoDataLIZ = C1183480gu2.LIZ(pageInfoYW != null ? pageInfoYW.data : null);
                    Object objLIZJ = C1893310zMv.LIZIZ.LIZJ(PageFinder.via(this), null);
                    String str = objLIZJ instanceof String ? (String) objLIZJ : null;
                    PoiOrderSubmitViewModel poiOrderSubmitViewModelQW = this.LIZ.qW();
                    String poiId = this.LIZ.getPoiId();
                    InterfaceC1192660h8q interfaceC1192660h8qOV2 = this.LIZ.OV();
                    String strLIZLLL = C18JG.LIZLLL(PageFinder.via(this), "c4600.d52459", null);
                    Object obj = this.LIZ.WV().get("initial_poi_enter_from");
                    String string = obj != null ? obj.toString() : null;
                    Object obj2 = this.LIZ.WV().get("initial_poi_enter_method");
                    String string2 = obj2 != null ? obj2.toString() : null;
                    Object obj3 = this.LIZ.WV().get("initial_poi_from_group_id");
                    String string3 = obj3 != null ? obj3.toString() : null;
                    Object obj4 = this.LIZ.WV().get("initial_poi_enter_from");
                    String string4 = obj4 != null ? obj4.toString() : null;
                    String poiId2 = this.LIZ.getPoiId();
                    String strEW = this.LIZ.eW();
                    String strGW = this.LIZ.gW();
                    String strYV = this.LIZ.YV();
                    String strAW = this.LIZ.aW();
                    String enterFrom = this.LIZ.getEnterFrom();
                    String enterMethod = this.LIZ.getEnterMethod();
                    Object obj5 = this.LIZ.WV().get("search_id");
                    String string5 = obj5 != null ? obj5.toString() : null;
                    Object obj6 = this.LIZ.WV().get("search_result_id");
                    String string6 = obj6 != null ? obj6.toString() : null;
                    Object obj7 = this.LIZ.WV().get("activity_source");
                    String string7 = obj7 != null ? obj7.toString() : null;
                    Object obj8 = this.LIZ.WV().get("activity_page_id");
                    String string8 = obj8 != null ? obj8.toString() : null;
                    Object obj9 = this.LIZ.WV().get("request_id");
                    String string9 = obj9 != null ? obj9.toString() : null;
                    Object obj10 = this.LIZ.WV().get("click_id");
                    String string10 = obj10 != null ? obj10.toString() : null;
                    Object obj11 = this.LIZ.WV().get("ttls_card_log_id");
                    String string11 = obj11 != null ? obj11.toString() : null;
                    Object obj12 = this.LIZ.WV().get("ttls_anchor_type");
                    String string12 = obj12 != null ? obj12.toString() : null;
                    Object obj13 = this.LIZ.WV().get("ttls_anchor_product_cnt");
                    String string13 = obj13 != null ? obj13.toString() : null;
                    Object obj14 = this.LIZ.WV().get("card_type");
                    String string14 = obj14 != null ? obj14.toString() : null;
                    Object obj15 = this.LIZ.WV().get("sub_card_type");
                    String string15 = obj15 != null ? obj15.toString() : null;
                    Object obj16 = this.LIZ.WV().get("poi_session_id");
                    OrderAttribute orderAttribute = new OrderAttribute(strLIZLLL, string, string2, string3, string4, poiId2, strEW, strGW, strYV, strAW, enterFrom, enterMethod, string5, string6, string7, string8, string9, string10, string11, str, string12, string13, string14, string15, obj16 != null ? obj16.toString() : null, this.LIZ.SV(), this.LIZ.TV());
                    JSONObject jSONObject = new JSONObject();
                    PoiOrderSubmitSlashFragment poiOrderSubmitSlashFragment = this.LIZ;
                    for (Map.Entry<String, Object> entry : poiOrderSubmitSlashFragment.nW().entrySet()) {
                        String key = entry.getKey();
                        Object value = entry.getValue();
                        C1189060h32.LJJI(key, value != null ? value.toString() : null, jSONObject);
                    }
                    for (Map.Entry<String, Object> entry2 : poiOrderSubmitSlashFragment.WV().entrySet()) {
                        String key2 = entry2.getKey();
                        Object value2 = entry2.getValue();
                        C1189060h32.LJJI(key2, value2 != null ? value2.toString() : null, jSONObject);
                    }
                    C1189060h32.LJJI("poi_id", poiOrderSubmitSlashFragment.getPoiId(), jSONObject);
                    C1189060h32.LJJI("poi_detail_enter_from", poiOrderSubmitSlashFragment.eW(), jSONObject);
                    C1189060h32.LJJI("poi_detail_enter_method", poiOrderSubmitSlashFragment.gW(), jSONObject);
                    C1189060h32.LJJI("pdp_enter_from", poiOrderSubmitSlashFragment.YV(), jSONObject);
                    C1189060h32.LJJI("pdp_enter_method", poiOrderSubmitSlashFragment.aW(), jSONObject);
                    C1189060h32.LJJI("order_submit_enter_from", poiOrderSubmitSlashFragment.getEnterFrom(), jSONObject);
                    C1189060h32.LJJI("order_submit_enter_method", poiOrderSubmitSlashFragment.getEnterMethod(), jSONObject);
                    C1189060h32.LJJI("promote_id", str, jSONObject);
                    C1189060h32.LJJI("one_click_booking_type_able", poiOrderSubmitSlashFragment.SV(), jSONObject);
                    C1189060h32.LJJI("one_click_booking_type_actual", poiOrderSubmitSlashFragment.TV(), jSONObject);
                    C1189060h32.LJJI("bcm_chain", C18JG.LIZLLL(PageFinder.via(jSONObject), "c4600.d52459", null), jSONObject);
                    for (Map.Entry entry3 : C1076720e7q.LIZ(PageFinder.via(jSONObject), true).entrySet()) {
                        String str2 = (String) entry3.getKey();
                        Object value3 = entry3.getValue();
                        C1189060h32.LJJI(str2, value3 != null ? value3.toString() : null, jSONObject);
                    }
                    String strJ3 = C786410Ut5.J3(jSONObject);
                    SkuListData skuListData = (SkuListData) this.LIZ.ta2(new C1180090goZ("osp_buy_sku_info"));
                    List<SkuData> skuDataList = skuListData != null ? skuListData.getSkuDataList() : null;
                    String str3 = pageInfoDataLIZ != null ? pageInfoDataLIZ.priceSecret : null;
                    CouponModuleData couponModuleData = (CouponModuleData) this.LIZ.ta2(new C1180090goZ("osp_coupon_module"));
                    poiOrderSubmitViewModelQW.wQ2(poiId, interfaceC1192660h8qOV2, orderAttribute, strJ3, skuDataList, str3, couponModuleData != null ? couponModuleData.getMarketingIdentifierStr() : null, C18JG.LJ(PageFinder.via(this), "c4600.d52459"));
                    PoiOrderSubmitViewModel poiOrderSubmitViewModelQW2 = this.LIZ.qW();
                    PoiOrderSubmitSlashFragment poiOrderSubmitSlashFragment2 = this.LIZ;
                    poiOrderSubmitViewModelQW2.vQ2(poiOrderSubmitSlashFragment2, poiOrderSubmitSlashFragment2.getPoiId(), (SkuListData) this.LIZ.ta2(new C1180090goZ("osp_buy_sku_info")));
                }

                @Override // X.InterfaceC1709520uaU
                public final void c3() {
                    C1193620hAO c1193620hAOLJ;
                    OrderSummaryData orderSummaryData = (OrderSummaryData) this.LIZ.ta2(new C1180090goZ("osp_footer"));
                    C1193050h9T c1193050h9T = null;
                    PriceBreakdownData priceBreakdownData = orderSummaryData != null ? orderSummaryData.getPriceBreakdownData(this.LIZ.OV()) : null;
                    PoiOrderSubmitSheetViewModel poiOrderSubmitSheetViewModelUV = this.LIZ.UV();
                    InterfaceC1192660h8q interfaceC1192660h8qOV2 = this.LIZ.OV();
                    if (interfaceC1192660h8qOV2 != null && (c1193620hAOLJ = interfaceC1192660h8qOV2.LJ(false)) != null) {
                        c1193050h9T = c1193620hAOLJ.LIZLLL;
                    }
                    poiOrderSubmitSheetViewModelUV.setState(new AwS384S0200000_18(priceBreakdownData, c1193050h9T, 305));
                }

                @Override // X.InterfaceC1709520uaU
                public final void LIZJ(EnumC1155070gAD enumC1155070gAD) {
                    PoiOrderSubmitSlashFragment poiOrderSubmitSlashFragment = this.LIZ;
                    poiOrderSubmitSlashFragment.OB1(new AwS419S0200000_18(poiOrderSubmitSlashFragment, this, 84));
                }
            });
        }
        C736680Sv4.LJIIIZ(this, qW(), new C2217381BqS() { // from class: X.0gMi
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1159320gH4) obj).LL;
            }
        }, new C2217381BqS() { // from class: X.0gLx
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1159320gH4) obj).LLILLL;
            }
        }, null, new AwS667S0100000_18(this, 42), 12);
        C736680Sv4.LJIIIIZZ(this, qW(), new C2217381BqS() { // from class: X.0h8x
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Boolean.valueOf(((C1159320gH4) obj).LLILZIL);
            }
        }, null, new AwS632S0100000_18(this, 316), 6);
        Wd2(new InterfaceC1181680gr8() { // from class: X.0h8u
            @Override // X.InterfaceC1181680gr8
            public final void LJIILIIL(int i2) {
                int iIW;
                PoiOrderSubmitSlashFragment poiOrderSubmitSlashFragment = this.LL;
                FrameLayout frameLayout2 = poiOrderSubmitSlashFragment.LLLZLL;
                if (frameLayout2 != null) {
                    int i3 = poiOrderSubmitSlashFragment.LLLZZIL + i2;
                    if (poiOrderSubmitSlashFragment.qW().getState().LLILZIL) {
                        iIW = 0;
                    } else {
                        iIW = this.LL.iW();
                    }
                    frameLayout2.setPadding(0, 0, 0, i3 + iIW);
                }
            }
        });
        if (tW()) {
            C736680Sv4.LJIIIIZZ(this, UV(), new C2217381BqS() { // from class: X.0h9D
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return ((C1193040h9S) obj).LL;
                }
            }, null, new C1192880h9C(this), 6);
        }
        JSEventCenter jSEventCenter = this.LLLZL;
        Lifecycle lifecycle = getLifecycle();
        jSEventCenter.getClass();
        lifecycle.addObserver(jSEventCenter);
        this.LLLZL.LIZ("pipo_pay_result", new AwS597S0100000_18(this, 418));
        this.LLLZL.LIZ("ttls_order_coupon_panel_confirm", new AwS597S0100000_18(this, 419));
        C2211631BhB.LJIIL(this, getActivity());
        C2276411E8h.LIZIZ.log("poi", "enter poi order submit page");
        String poiId = getPoiId();
        String enterFrom = getEnterFrom();
        String enterMethod = getEnterMethod();
        String strEW = eW();
        String strGW = gW();
        String strYV = YV();
        String strAW = aW();
        String enterFrom2 = getEnterFrom();
        String enterMethod2 = getEnterMethod();
        String strQV = QV();
        Map<String, Object> mapWV = WV();
        Map<String, Object> mapNW = nW();
        String strLIZLLL = C18JG.LIZLLL(PageFinder.via((Fragment) this), "a4257.b8216.c0.d0", null);
        String strXV = XV();
        PageFinder pageFinderVia = PageFinder.via((Fragment) this);
        String strSV = SV();
        String strTV = TV();
        Map mapLIZ = C308370C6x.LIZ(3);
        C1185040gwY c1185040gwY = C1185040gwY.LIZ;
        JSONObject jSONObject = new JSONObject();
        for (Map.Entry entry : ((LinkedHashMap) mapLIZ).entrySet()) {
            C1189060h32.LJJI((String) entry.getKey(), (String) entry.getValue(), jSONObject);
        }
        for (Map.Entry<String, Object> entry2 : mapWV.entrySet()) {
            C1189060h32.LJJI(entry2.getKey(), String.valueOf(entry2.getValue()), jSONObject);
        }
        jSONObject.put("poi_id", poiId);
        jSONObject.put("enter_from", enterFrom);
        jSONObject.put("enter_method", enterMethod);
        jSONObject.put("poi_detail_enter_from", strEW);
        jSONObject.put("poi_detail_enter_method", strGW);
        jSONObject.put("pdp_enter_from", strYV);
        jSONObject.put("pdp_enter_method", strAW);
        jSONObject.put("order_submit_enter_from", enterFrom2);
        jSONObject.put("order_submit_enter_method", enterMethod2);
        jSONObject.put("one_click_booking_type_able", strSV);
        jSONObject.put("one_click_booking_type_actual", strTV);
        C1189060h32.LIZIZ(strQV, jSONObject);
        for (Map.Entry<String, Object> entry3 : mapNW.entrySet()) {
            C1189060h32.LJJI(entry3.getKey(), String.valueOf(entry3.getValue()), jSONObject);
        }
        C1189060h32.LJJI("bcm_chain", strLIZLLL, jSONObject);
        jSONObject.put("pay_request_id", strXV);
        C1185050gwZ c1185050gwZ = new C1185050gwZ(pageFinderVia);
        c1185040gwY.getClass();
        C1185040gwY.LIZJ("enter_order_submit_page", jSONObject, c1185050gwZ);
        C1192290h8F.LIZJ(this, new AwS597S0100000_18(this, 420));
    }

    public final void uW(long j, String str) {
        String orderId;
        C2276411E8h c2276411E8h = C2276411E8h.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("osp openOrderDetailAndFinishSelf, errorMsg = ");
        sbLIZ.append(str);
        c2276411E8h.log("poi", C2188811AlT.LIZIZ(sbLIZ));
        qW().LLILZLL = "next";
        SubmitOrderResponse submitOrderResponseLIZ = qW().getState().LL.LIZ();
        String str2 = "";
        if (submitOrderResponseLIZ == null || (orderId = submitOrderResponseLIZ.getOrderId()) == null) {
            orderId = "";
        }
        String strLIZIZ = TiktokPoiLynxSettings.LIZIZ("poi_order_detail");
        if (strLIZIZ != null) {
            str2 = strLIZIZ;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("order_id", orderId);
        C1189060h32.LJJ("pt_info", (String) this.LLLLJI.getValue(), linkedHashMap);
        C1189060h32.LJJ("error_msg", str, linkedHashMap);
        linkedHashMap.put("enter_from", "order_submit_page");
        C1189060h32.LJJ("poi_detail_enter_from", eW(), linkedHashMap);
        C1189060h32.LJJ("poi_detail_enter_method", gW(), linkedHashMap);
        C1189060h32.LJJ("pdp_enter_from", YV(), linkedHashMap);
        C1189060h32.LJJ("pdp_enter_method", aW(), linkedHashMap);
        C1189060h32.LJJ("order_submit_enter_from", getEnterFrom(), linkedHashMap);
        C1189060h32.LJJ("order_submit_enter_method", getEnterMethod(), linkedHashMap);
        C1189060h32.LJJ("collect_info", QV(), linkedHashMap);
        C1189060h32.LJJ("track_info", (String) this.LLLLLIL.getValue(), linkedHashMap);
        C1189060h32.LJJ("one_click_booking_type_able", SV(), linkedHashMap);
        C1189060h32.LJJ("one_click_booking_type_actual", TV(), linkedHashMap);
        linkedHashMap.put("pipo_pay_callback_ts", String.valueOf(j));
        C1189060h32.LJJ("source_btm_token", C18JG.LIZ("c4600.d52459", PageFinder.via((Fragment) this), null), linkedHashMap);
        C1948607kC.LIZIZ(str2, linkedHashMap);
        DT();
        JSEventCenter jSEventCenter = this.LLLZL;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("pay_request_id", XV());
        jSEventCenter.JG1("biz_open_order_detail", jSONObject);
    }

    @Override // com.ss.android.ugc.aweme.slash.page.SlashFragment
    public final void YU(Throwable th, boolean z, boolean z2) {
        super.YU(th, z, z2);
        C786410Ut5.LJIIJ((DialogC1389620mGW) this.LLLZI.getValue());
    }

    @Override // com.ss.android.ugc.aweme.slash.page.SlashFragment, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        VT().LIZIZ();
        View viewLIZIZ = C1181430gqj.LIZIZ(layoutInflater.getContext(), R.layout.e5s, viewGroup, false);
        C19GS c19gs = null;
        if (!(viewLIZIZ instanceof View)) {
            viewLIZIZ = null;
        }
        if (viewLIZIZ != null) {
            try {
                ViewTreeLifecycleOwner.set(viewLIZIZ, getViewLifecycleOwner());
                ViewTreeViewModelStoreOwner.set(viewLIZIZ, this);
                viewLIZIZ.setTag(R.id.view_tree_saved_state_registry_owner, this);
                C19EG activity = getActivity();
                if (activity instanceof C19GS) {
                    c19gs = (C19GS) activity;
                }
                C1685300txQ.LIZ(c19gs);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
                return viewLIZIZ;
            }
        }
        C189200o6.m2constructorimpl(Unit.LIZ);
        return viewLIZIZ;
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o> C0ZP4 subscribe(AssemViewModel<S> assemViewModel, C1770850wBP<S> c1770850wBP, Function1<? super Throwable, Unit> function1, Function2<? super C03H5, ? super S, Unit> function2) {
        return C736680Sv4.LJIILLIIL(this, assemViewModel, c1770850wBP, function1, function2);
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o, A> C0ZP4 selectSubscribe(AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, C1770850wBP<C11H9<A>> c1770850wBP, Function1<? super Throwable, Unit> function1, Function2<? super C03H5, ? super A, Unit> function2) {
        return C736680Sv4.LJ(this, assemViewModel, interfaceC2217241BqE, c1770850wBP, function1, function2);
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o, A> C0ZP4 selectSubscribeOnAsync(AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, C1770850wBP<C11H9<A>> c1770850wBP, Function1<? super Throwable, Unit> function1, Function2<? super C03H5, ? super A, Unit> function2) {
        return C736680Sv4.LJIILJJIL(this, assemViewModel, interfaceC2217241BqE, c1770850wBP, function1, function2);
    }

    @Override // com.ss.android.ugc.aweme.poi.osp.PoiOrderSubmitSlashAbility
    public final SlashRequestParam GA2(String str, List<BuySkuItem> list, EnumC1187020gzk enumC1187020gzk, Map<String, ? extends Object> map, String str2, EnumC1187010gzj enumC1187010gzj) {
        return hW().LIZLLL(str, list, enumC1187020gzk, map, str2, C786410Ut5.J3(NV()), enumC1187010gzj, C18JG.LJ(PageFinder.via((Fragment) this), "a4257.b8216.c0.d0"));
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o, A, B> C0ZP4 selectSubscribe(AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, InterfaceC2217241BqE<S, ? extends B> interfaceC2217241BqE2, C1770850wBP<C19474211Gy<A, B>> c1770850wBP, Function1<? super Throwable, Unit> function1, InterfaceC1631620sYq<? super C03H5, ? super A, ? super B, Unit> interfaceC1631620sYq) {
        return C736680Sv4.LIZLLL(assemViewModel, this, c1770850wBP, function1, interfaceC1631620sYq, interfaceC2217241BqE, interfaceC2217241BqE2);
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o, A, B, C> C0ZP4 selectSubscribe(AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, InterfaceC2217241BqE<S, ? extends B> interfaceC2217241BqE2, InterfaceC2217241BqE<S, ? extends C> interfaceC2217241BqE3, C1770850wBP<C11H7<A, B, C>> c1770850wBP, Function1<? super Throwable, Unit> function1, InterfaceC1631630sYr<? super C03H5, ? super A, ? super B, ? super C, Unit> interfaceC1631630sYr) {
        return C736680Sv4.LJFF(this, assemViewModel, interfaceC2217241BqE, interfaceC2217241BqE2, interfaceC2217241BqE3, c1770850wBP, function1, interfaceC1631630sYr);
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o, A, B, C, D> C0ZP4 selectSubscribe(AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, InterfaceC2217241BqE<S, ? extends B> interfaceC2217241BqE2, InterfaceC2217241BqE<S, ? extends C> interfaceC2217241BqE3, InterfaceC2217241BqE<S, ? extends D> interfaceC2217241BqE4, C1770850wBP<C11H6<A, B, C, D>> c1770850wBP, Function1<? super Throwable, Unit> function1, InterfaceC1685420txc<? super C03H5, ? super A, ? super B, ? super C, ? super D, Unit> interfaceC1685420txc) {
        return C736680Sv4.LJI(this, assemViewModel, interfaceC2217241BqE, interfaceC2217241BqE2, interfaceC2217241BqE3, interfaceC2217241BqE4, c1770850wBP, function1, interfaceC1685420txc);
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o, A, B, C, D, E> C0ZP4 selectSubscribe(AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, InterfaceC2217241BqE<S, ? extends B> interfaceC2217241BqE2, InterfaceC2217241BqE<S, ? extends C> interfaceC2217241BqE3, InterfaceC2217241BqE<S, ? extends D> interfaceC2217241BqE4, InterfaceC2217241BqE<S, ? extends E> interfaceC2217241BqE5, C1770850wBP<C11H2<A, B, C, D, E>> c1770850wBP, Function1<? super Throwable, Unit> function1, InterfaceC1685430txd<? super C03H5, ? super A, ? super B, ? super C, ? super D, ? super E, Unit> interfaceC1685430txd) {
        return C736680Sv4.LJII(this, assemViewModel, interfaceC2217241BqE, interfaceC2217241BqE2, interfaceC2217241BqE3, interfaceC2217241BqE4, interfaceC2217241BqE5, c1770850wBP, function1, interfaceC1685430txd);
    }
}
