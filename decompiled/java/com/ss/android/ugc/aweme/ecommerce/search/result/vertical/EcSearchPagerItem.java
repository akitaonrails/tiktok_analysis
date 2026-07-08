package com.ss.android.ugc.aweme.ecommerce.search.result.vertical;

import X.C01GW;
import X.C098200Yq;
import X.C0PSK;
import X.C0PSL;
import X.C0Q3E;
import X.C0QER;
import X.C0QJN;
import X.C0QLD;
import X.C0QLZ;
import X.C0QOY;
import X.C0QPB;
import X.C0QQZ;
import X.C0QSJ;
import X.C0QXN;
import X.C0QYH;
import X.C0QYZ;
import X.C1558360qeg;
import X.C1558520qew;
import X.C1685300txQ;
import X.C1766860w4y;
import X.C189200o6;
import X.C19EG;
import X.C19GS;
import X.C2187451AjH;
import X.C2229651COl;
import X.C315220CXg;
import X.C616540OGe;
import X.C646000PVm;
import X.C650500PfM;
import X.C650950Pg5;
import X.C650960Pg6;
import X.C663990Q2r;
import X.C664000Q2s;
import X.C664030Q2v;
import X.C669560QOc;
import X.C669580QOe;
import X.C669590QOf;
import X.C669600QOg;
import X.C669640QOk;
import X.C669750QOv;
import X.C670060QQa;
import X.C672090QXv;
import X.C672110QXx;
import X.C673150Qan;
import X.C679440Qkw;
import X.C687700QyG;
import X.C723850SaN;
import X.C786410Ut5;
import X.C844470XAv;
import X.EnumC669620QOi;
import X.EnumC669630QOj;
import X.EnumC670440QRm;
import X.InterfaceC1146704e9;
import X.InterfaceC1206390hUz;
import X.InterfaceC687730QyJ;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.ViewModelProviders;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.android.btm.api.BtmSDK;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment;
import com.ss.android.ugc.aweme.discover.helper.LastSearch;
import com.ss.android.ugc.aweme.discover.model.GlobalDoodleConfig;
import com.ss.android.ugc.aweme.discover.model.SearchApiResult;
import com.ss.android.ugc.aweme.ecommerce.search.page.EcSearchActivity;
import com.ss.android.ugc.aweme.ecommerce.search.page.mix.IMixVSearchAbility;
import com.ss.android.ugc.aweme.ecommerce.search.page.mix.TriggerRetentionPopUpAbility;
import com.ss.android.ugc.aweme.ecommerce.search.page.vm.EcSearchStartViewModel;
import com.ss.android.ugc.aweme.ecommerce.search.result.ISearchResultSubPageAbility;
import com.ss.android.ugc.aweme.ecommerce.search.result.ISearchResultSubPageContextAbility;
import com.ss.android.ugc.aweme.ecommerce.search.result.vertical.assem.VerticalSearchAbility;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.feed.model.LogPbBean;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.search.common.utils.SAFHelper;
import com.ss.android.ugc.aweme.search.ecommerce.EcomPersonalizedToastAbility;
import com.ss.android.ugc.aweme.search.ecommerce.entrance.ECSearchEntranceData;
import com.ss.android.ugc.aweme.search.inter.ISearchMiddleForECService;
import com.ss.android.ugc.aweme.search.model.SearchResultParam;
import com.ss.android.ugc.aweme.search.result.ISearchSkinBgAbility;
import com.ss.android.ugc.aweme.services.IMainService;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.AwS546S0100000_2;
import kotlin.jvm.internal.AwS581S0100000_2;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
public final class EcSearchPagerItem extends AmeBaseFragment implements InterfaceC1206390hUz, ISearchVerticalContext, TriggerRetentionPopUpAbility, C0QSJ, InterfaceC1146704e9 {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiAvJiI+LTcvLGEgLSHELIOSQ+Kid9OiA/PCMnZjMpOzs6KyQgZwowGyAtOyw7GCQrLD0aPCAh";
    public TuxTextView LL;
    public C679440Qkw LLILLJJLI;
    public EnumC669620QOi LLILLL;
    public int LLILZ;
    public final C0QLZ LLILZIL = new C0QLZ();
    public String LLILZLL = "";
    public long LLIZ;

    @Override // com.ss.android.ugc.aweme.ecommerce.search.page.mix.TriggerRetentionPopUpAbility
    public final boolean Bs() {
        IMixVSearchAbility iMixVSearchAbility = (IMixVSearchAbility) C1558520qew.LIZ(C1558360qeg.LJFF(this, null), IMixVSearchAbility.class, null);
        return iMixVSearchAbility != null && iMixVSearchAbility.Bs();
    }

    public final void MR() {
        ISearchResultSubPageAbility iSearchResultSubPageAbility;
        VerticalSearchAbility verticalSearchAbility = (VerticalSearchAbility) C1558520qew.LIZ(C1558360qeg.LJFF(this, null), VerticalSearchAbility.class, null);
        if (verticalSearchAbility != null) {
            verticalSearchAbility.ga0(false);
        }
        EnumC669620QOi enumC669620QOi = this.LLILLL;
        if (enumC669620QOi == null || (iSearchResultSubPageAbility = (ISearchResultSubPageAbility) C1558520qew.LIZ(C1558360qeg.LJFF(this, null), ISearchResultSubPageAbility.class, null)) == null) {
            return;
        }
        iSearchResultSubPageAbility.he0(enumC669620QOi);
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.search.result.vertical.ISearchVerticalContext
    public final SearchResultParam Tb() {
        SearchResultParam searchResultParamTb = null;
        ISearchResultSubPageAbility iSearchResultSubPageAbility = (ISearchResultSubPageAbility) C1558520qew.LIZ(C1558360qeg.LJFF(this, null), ISearchResultSubPageAbility.class, null);
        if (iSearchResultSubPageAbility == null || (searchResultParamTb = iSearchResultSubPageAbility.Tb()) == null || searchResultParamTb.getEcomTargetTab() == null || searchResultParamTb.getEcomTargetTab() == this.LLILLL) {
            return searchResultParamTb;
        }
        SearchResultParam searchResultParamCopy = searchResultParamTb.copy();
        searchResultParamCopy.setEnterMethod("switch_tab");
        return searchResultParamCopy;
    }

    @Override // X.InterfaceC1206390hUz
    public final void V6() {
    }

    @Override // X.C0QSJ
    public final void bindAbility(Object obj, Class cls) {
        C673150Qan.LIZ(this, obj, cls);
    }

    @Override // X.InterfaceC1146704e9
    public final void checkParentScope() {
        C687700QyG.LIZ(this, new Class[]{SearchVerticalScope.class});
    }

    @Override // X.C0QSJ
    public final Object getAbility(Class cls) {
        return null;
    }

    @Override // X.InterfaceC1146704e9
    public final List getParentScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(SearchVerticalScope.class);
        return arrayList;
    }

    @Override // X.C0QSJ
    public final List getScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(SearchVerticalScope.class);
        return arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x002d  */
    @Override // com.ss.android.ugc.aweme.ecommerce.search.result.vertical.ISearchVerticalContext
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Long lS1() {
        /*
            r4 = this;
            r3 = 0
            com.ss.android.ugc.aweme.search.model.SearchResultParam r0 = r4.Tb()     // Catch: java.lang.Exception -> L3b
            if (r0 == 0) goto L13
            X.0QER r0 = r0.getSearchEnterParam()     // Catch: java.lang.Exception -> L3b
            if (r0 == 0) goto L13
            java.lang.String r0 = r0.getRouteUri()     // Catch: java.lang.Exception -> L3b
            if (r0 != 0) goto L15
        L13:
            java.lang.String r0 = ""
        L15:
            android.net.Uri r1 = com.bytedance.mt.protector.impl.UriProtector.parse(r0)     // Catch: java.lang.Exception -> L3b
            if (r1 == 0) goto L22
            java.lang.String r0 = "shop_popup_init_time"
            java.lang.String r2 = com.bytedance.mt.protector.impl.UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(r1, r0)     // Catch: java.lang.Exception -> L3b
            goto L23
        L22:
            r2 = r3
        L23:
            if (r2 == 0) goto L2d
            boolean r1 = X.C123100dR.LIZ(r2)     // Catch: java.lang.Exception -> L3b
            r0 = 1
            if (r1 != r0) goto L2d
            goto L2e
        L2d:
            r0 = 0
        L2e:
            if (r0 == 0) goto L3f
            if (r2 == 0) goto L3f
            long r0 = com.bytedance.mt.protector.impl.string2number.CastLongProtector.parseLong(r2)     // Catch: java.lang.Exception -> L3b
            java.lang.Long r3 = java.lang.Long.valueOf(r0)     // Catch: java.lang.Exception -> L3b
            return r3
        L3b:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
        L3f:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.search.result.vertical.EcSearchPagerItem.lS1():java.lang.Long");
    }

    @Override // X.C0QSJ
    public final void registerAbilityLoadListener(InterfaceC687730QyJ interfaceC687730QyJ) {
    }

    @Override // X.C0QSJ
    public final void unbindAbility(Object obj, Class cls) {
        C673150Qan.LIZIZ(this, obj, cls);
    }

    @Override // X.C0QSJ
    public final void unregisterAbilityLoadListener(InterfaceC687730QyJ interfaceC687730QyJ) {
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.search.result.vertical.ISearchVerticalContext
    public final C0QYH Bf() throws Throwable {
        String value;
        C0QJN c0qjn;
        C0QJN c0qjn2;
        C0QER searchEnterParam;
        C0QER searchEnterParam2;
        ECSearchEntranceData ecSearchEntranceData;
        C650960Pg6 immutableData;
        C669560QOc c669560QOc;
        C650960Pg6 immutableData2;
        C669560QOc c669560QOc2;
        C650960Pg6 immutableData3;
        C669560QOc c669560QOc3;
        C650960Pg6 immutableData4;
        C0QJN c0qjn3;
        String str = ((C663990Q2r) C0Q3E.LIZIZ(this).Ww1().LIZJ()).LLIZLLLIL;
        C646000PVm c646000PVm = C650950Pg5.Companion;
        c646000PVm.getClass();
        C650950Pg5 c650950Pg5LJIIIZ = C646000PVm.LJIIIZ(this, this);
        String str2 = null;
        String str3 = (c650950Pg5LJIIIZ == null || (immutableData4 = c650950Pg5LJIIIZ.getImmutableData()) == null || (c0qjn3 = immutableData4.singleSearchEcommerceModel) == null) ? null : c0qjn3.srcMaterialId;
        c646000PVm.getClass();
        C650950Pg5 c650950Pg5LJIIIZ2 = C646000PVm.LJIIIZ(this, this);
        String str4 = (c650950Pg5LJIIIZ2 == null || (immutableData3 = c650950Pg5LJIIIZ2.getImmutableData()) == null || (c669560QOc3 = immutableData3.searchEcommerceModel) == null) ? null : c669560QOc3.sourceProductId;
        c646000PVm.getClass();
        C650950Pg5 c650950Pg5LJIIIZ3 = C646000PVm.LJIIIZ(this, this);
        String str5 = (c650950Pg5LJIIIZ3 == null || (immutableData2 = c650950Pg5LJIIIZ3.getImmutableData()) == null || (c669560QOc2 = immutableData2.searchEcommerceModel) == null) ? null : c669560QOc2.clickRecomSearchEntrance;
        C19EG activity = getActivity();
        c646000PVm.getClass();
        C646000PVm.LJFF(this, activity);
        C19EG activity2 = getActivity();
        c646000PVm.getClass();
        C646000PVm.LJFF(this, activity2);
        c646000PVm.getClass();
        C650950Pg5 c650950Pg5LJIIIZ4 = C646000PVm.LJIIIZ(this, this);
        C672110QXx c672110QXx = (c650950Pg5LJIIIZ4 == null || (immutableData = c650950Pg5LJIIIZ4.getImmutableData()) == null || (c669560QOc = immutableData.searchEcommerceModel) == null) ? null : c669560QOc.deepLinkEcParams;
        ISearchResultSubPageContextAbility iSearchResultSubPageContextAbility = (ISearchResultSubPageContextAbility) C1558520qew.LIZ(C1558360qeg.LJFF(this, null), ISearchResultSubPageContextAbility.class, null);
        boolean z = iSearchResultSubPageContextAbility != null && iSearchResultSubPageContextAbility.getContainerType() == C0QQZ.HALF_NEW.getValue();
        C19EG activity3 = getActivity();
        SearchResultParam searchResultParamTb = Tb();
        Integer numValueOf = (searchResultParamTb == null || (searchEnterParam2 = searchResultParamTb.getSearchEnterParam()) == null || (ecSearchEntranceData = searchEnterParam2.getEcSearchEntranceData()) == null) ? null : Integer.valueOf(C650500PfM.LIZ(ecSearchEntranceData));
        SearchResultParam searchResultParamTb2 = Tb();
        ECSearchEntranceData ecSearchEntranceData2 = (searchResultParamTb2 == null || (searchEnterParam = searchResultParamTb2.getSearchEnterParam()) == null) ? null : searchEnterParam.getEcSearchEntranceData();
        String value2 = EnumC670440QRm.HALF_SHOP.getValue();
        if (z) {
            value = C670060QQa.LIZ(numValueOf, ecSearchEntranceData2, value2);
        } else {
            value = (activity3 instanceof EcSearchActivity ? EnumC670440QRm.SIMPLE : EnumC670440QRm.NORMAL).getValue();
        }
        EnumC669620QOi enumC669620QOi = this.LLILLL;
        String tabName = enumC669620QOi != null ? enumC669620QOi.getTabName() : null;
        c646000PVm.getClass();
        C650960Pg6 c650960Pg6LJII = C646000PVm.LJII(this, this);
        String str6 = (c650960Pg6LJII == null || (c0qjn2 = c650960Pg6LJII.singleSearchEcommerceModel) == null) ? null : c0qjn2.enterGroupId;
        c646000PVm.getClass();
        C650960Pg6 c650960Pg6LJII2 = C646000PVm.LJII(this, this);
        if (c650960Pg6LJII2 != null && (c0qjn = c650960Pg6LJII2.singleSearchEcommerceModel) != null) {
            str2 = c0qjn.productPanelType;
        }
        C01GW<C669750QOv> c01gw = C669750QOv.LIZLLL;
        return new C0QYH(str, str3, str4, str5, c672110QXx, value, tabName, str6, str2, C669590QOf.LIZ().LIZJ(), null, 16384);
    }

    @Override // X.InterfaceC1206390hUz
    public final void LLLILZLLLI() {
        C1766860w4y.LIZ.getClass();
        C1766860w4y.LJIILL(null, "ec_search_action", "", true);
        VerticalSearchAbility verticalSearchAbility = (VerticalSearchAbility) C1558520qew.LIZ(C1558360qeg.LJFF(this, null), VerticalSearchAbility.class, null);
        if (verticalSearchAbility != null) {
            EnumC669620QOi enumC669620QOi = this.LLILLL;
            if (enumC669620QOi == null) {
                enumC669620QOi = EnumC669620QOi.SHOP;
            }
            verticalSearchAbility.Jd2(enumC669620QOi, true, null);
        }
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.search.result.vertical.ISearchVerticalContext
    public final C0QYZ Zm() {
        C664030Q2v c664030Q2v;
        C664030Q2v c664030Q2v2;
        EnumC669620QOi enumC669620QOiSU0;
        C19EG activity = getActivity();
        String str = (activity == null || !((EcSearchStartViewModel) ViewModelProviders.of(activity).get(EcSearchStartViewModel.class)).LL) ? CardStruct.IStatusCode.DEFAULT : "1";
        String str2 = null;
        ISearchResultSubPageAbility iSearchResultSubPageAbility = (ISearchResultSubPageAbility) C1558520qew.LIZ(C1558360qeg.LJFF(this, null), ISearchResultSubPageAbility.class, null);
        String tabName = (iSearchResultSubPageAbility == null || (enumC669620QOiSU0 = iSearchResultSubPageAbility.SU0()) == null) ? null : enumC669620QOiSU0.getTabName();
        String str3 = C0QOY.LIZ;
        C646000PVm c646000PVm = C650950Pg5.Companion;
        c646000PVm.getClass();
        C650960Pg6 c650960Pg6LJII = C646000PVm.LJII(this, this);
        String str4 = (c650960Pg6LJII == null || (c664030Q2v2 = c650960Pg6LJII.searchVideoModel) == null) ? null : c664030Q2v2.groupId;
        c646000PVm.getClass();
        C650960Pg6 c650960Pg6LJII2 = C646000PVm.LJII(this, this);
        if (c650960Pg6LJII2 != null && (c664030Q2v = c650960Pg6LJII2.searchVideoModel) != null) {
            str2 = c664030Q2v.groupId;
        }
        return new C0QYZ(tabName, str3, str, str4, str2);
    }

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        VerticalSearchAbility verticalSearchAbility = (VerticalSearchAbility) C1558520qew.LIZ(C1558360qeg.LJFF(this, null), VerticalSearchAbility.class, null);
        if (verticalSearchAbility != null) {
            verticalSearchAbility.Jd2(null, true, Long.valueOf(this.LLIZ));
        }
        C1558520qew.LJIIJJI(C1558360qeg.LJFF(this, null), ISearchVerticalContext.class, null);
        C19EG activity = getActivity();
        if (activity != null) {
            C1558520qew.LJIIJJI(C1558360qeg.LJI(activity, null), TriggerRetentionPopUpAbility.class, null);
        }
        this.LL = null;
        this.LLILLJJLI = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [X.0PSK, X.0QOh] */
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
    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
        this.LLIZ = System.currentTimeMillis();
        EcomPersonalizedToastAbility ecomPersonalizedToastAbility = (EcomPersonalizedToastAbility) C1558520qew.LIZ(C1558360qeg.LJFF(this, null), EcomPersonalizedToastAbility.class, null);
        if (ecomPersonalizedToastAbility != null) {
            ecomPersonalizedToastAbility.dismiss();
        }
        BtmSDK btmSDK = BtmSDK.INSTANCE;
        Boolean bool = Boolean.TRUE;
        ?? r1 = new C0PSK() { // from class: X.0QOh
        };
        r1.LIZ = true;
        btmSDK.onPageHide(this, bool, r1);
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        if (C616540OGe.LIZ() && !((IMainService) ServiceManager.get().getService(IMainService.class)).isMainPage(getActivity())) {
            C2187451AjH.LJJIJIIJI(EcSearchPagerItem.class.getName());
        }
        super.onResume();
        BtmSDK btmSDK = BtmSDK.INSTANCE;
        Boolean bool = Boolean.TRUE;
        C0PSL c0psl = new C0PSL();
        c0psl.LIZ = true;
        btmSDK.onPageShow(this, bool, c0psl);
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.search.result.vertical.ISearchVerticalContext
    public final int LJLJJL() {
        return this.LLILZ;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.search.result.vertical.ISearchVerticalContext
    public final String Nb1() {
        return this.LLILZLL;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.search.result.vertical.ISearchVerticalContext
    public final void Yt1(C2229651COl c2229651COl) {
        View viewFindViewById = this.LLILLJJLI;
        if (viewFindViewById == null) {
            View view = getView();
            if (view != null) {
                viewFindViewById = view.findViewById(R.id.ua8);
            } else {
                viewFindViewById = null;
            }
            this.LLILLJJLI = (C679440Qkw) viewFindViewById;
        }
        ((C679440Qkw) viewFindViewById).LLILZLL = c2229651COl;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001b  */
    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onCreate(android.os.Bundle r14) {
        /*
            Method dump skipped, instruction units count: 432
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.search.result.vertical.EcSearchPagerItem.onCreate(android.os.Bundle):void");
    }

    @Override // X.InterfaceC1206390hUz
    public final void onPageSelected(int i) {
        String str;
        ISearchResultSubPageAbility iSearchResultSubPageAbility;
        C0QPB c0qpbLIZ = C669580QOe.LIZ(C1558360qeg.LJFF(this, null));
        if (c0qpbLIZ != null) {
            c0qpbLIZ.LLILLJJLI = this.LLILLL;
        }
        ISearchResultSubPageAbility iSearchResultSubPageAbility2 = (ISearchResultSubPageAbility) C1558520qew.LIZ(C1558360qeg.LJFF(this, null), ISearchResultSubPageAbility.class, null);
        if (iSearchResultSubPageAbility2 != null && !iSearchResultSubPageAbility2.bx(this.LLILLL)) {
            ISearchResultSubPageAbility iSearchResultSubPageAbility3 = (ISearchResultSubPageAbility) C1558520qew.LIZ(C1558360qeg.LJFF(this, null), ISearchResultSubPageAbility.class, null);
            if (iSearchResultSubPageAbility3 != null) {
                iSearchResultSubPageAbility3.Xd1(this.LLILLL);
            }
            VerticalSearchAbility verticalSearchAbility = (VerticalSearchAbility) C1558520qew.LIZ(C1558360qeg.LJFF(this, null), VerticalSearchAbility.class, null);
            if (verticalSearchAbility != null) {
                verticalSearchAbility.ga0(false);
            }
        }
        EnumC669620QOi enumC669620QOi = this.LLILLL;
        if (enumC669620QOi != null && (iSearchResultSubPageAbility = (ISearchResultSubPageAbility) C1558520qew.LIZ(C1558360qeg.LJFF(this, null), ISearchResultSubPageAbility.class, null)) != null) {
            iSearchResultSubPageAbility.he0(enumC669620QOi);
        }
        C1766860w4y c1766860w4y = C1766860w4y.LIZ;
        String str2 = this.LLILZIL.LIZLLL;
        String str3 = "";
        if (str2 == null) {
            str2 = "";
        }
        c1766860w4y.getClass();
        C1766860w4y.LJIILL(null, "search_id", str2, false);
        String str4 = this.LLILZIL.LJFF;
        if (str4 == null) {
            str4 = "";
        }
        c1766860w4y.getClass();
        C1766860w4y.LJIILL(null, "search_entrance", str4, false);
        C0QLZ c0qlz = this.LLILZIL;
        if (c0qlz != null && (str = c0qlz.LIZIZ) != null) {
            str3 = str;
        }
        c1766860w4y.getClass();
        C1766860w4y.LJIILL(null, "ec_search_action", str3, false);
        VerticalSearchAbility verticalSearchAbility2 = (VerticalSearchAbility) C1558520qew.LIZ(C1558360qeg.LJFF(this, null), VerticalSearchAbility.class, null);
        if (verticalSearchAbility2 != null) {
            EnumC669620QOi enumC669620QOi2 = this.LLILLL;
            if (enumC669620QOi2 == null) {
                enumC669620QOi2 = EnumC669620QOi.SHOP;
            }
            verticalSearchAbility2.Jd2(enumC669620QOi2, false, Long.valueOf(System.currentTimeMillis()));
        }
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        C0QER searchEnterParam;
        Integer numValueOf;
        super.onSaveInstanceState(bundle);
        SearchResultParam searchResultParamTb = Tb();
        if (searchResultParamTb != null && (searchEnterParam = searchResultParamTb.getSearchEnterParam()) != null && (numValueOf = Integer.valueOf(C650500PfM.LIZIZ(searchEnterParam))) != null) {
            bundle.putInt("ec_search_entrance_type", numValueOf.intValue());
        }
    }

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) throws Throwable {
        super.onViewCreated(view, bundle);
        if (bundle != null) {
            bundle.getInt("ec_search_entrance_type");
            ISearchMiddleForECService iSearchMiddleForECService = (ISearchMiddleForECService) ServiceManager.get().getService(ISearchMiddleForECService.class);
            C19EG activity = getActivity();
            if (activity != null && (iSearchMiddleForECService.LJJIIJZLJL(activity) || (activity instanceof EcSearchActivity))) {
                SAFHelper.LIZ.getClass();
                SAFHelper.LIZJ(this, activity);
            }
        }
        C1558520qew.LJII(C1558360qeg.LJFF(this, null), this, ISearchVerticalContext.class, null, null);
        C19EG activity2 = getActivity();
        if (activity2 != null) {
            C1558520qew.LJII(C1558360qeg.LJI(activity2, null), this, TriggerRetentionPopUpAbility.class, null, null);
        }
        C844470XAv.LIZ.getClass();
        if (Intrinsics.LJFF(C844470XAv.LJIILL, "local_test")) {
            View viewFindViewById = this.LL;
            if (viewFindViewById == null) {
                View view2 = getView();
                if (view2 != null) {
                    viewFindViewById = view2.findViewById(R.id.fh4);
                } else {
                    viewFindViewById = null;
                }
                this.LL = (TuxTextView) viewFindViewById;
            }
            C786410Ut5.LLLLZLL((TuxTextView) viewFindViewById, 0);
        }
        C723850SaN.LIZ(this, false, null, new AwS581S0100000_2(this, 146), 3);
        EnumC669620QOi enumC669620QOi = this.LLILLL;
        if (enumC669620QOi == null) {
            return;
        }
        switch (C669640QOk.LIZ[enumC669620QOi.ordinal()]) {
            case 1:
                C723850SaN.LIZ(this, false, null, new AwS581S0100000_2(this, 147), 3);
                ISearchSkinBgAbility iSearchSkinBgAbility = (ISearchSkinBgAbility) C1558520qew.LIZ(C1558360qeg.LJFF(this, null), ISearchSkinBgAbility.class, null);
                if (iSearchSkinBgAbility != null) {
                    iSearchSkinBgAbility.WR0(new AwS546S0100000_2(view, 179));
                }
                break;
            case 2:
                C723850SaN.LIZ(this, false, null, new AwS581S0100000_2(this, 148), 3);
                break;
            case 3:
                C723850SaN.LIZ(this, false, null, new AwS581S0100000_2(this, 149), 3);
                break;
            case 4:
                C723850SaN.LIZ(this, false, null, new AwS581S0100000_2(this, 150), 3);
                break;
            case 5:
                C723850SaN.LIZ(this, false, null, new AwS581S0100000_2(this, 145), 3);
                break;
            case 6:
                C723850SaN.LIZ(this, false, null, new AwS581S0100000_2(this, 151), 3);
                break;
        }
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i;
        if (this.LLILLL == EnumC669620QOi.ECOM_VIDEO) {
            i = R.layout.btm;
        } else {
            i = R.layout.bse;
        }
        View viewTd = C786410Ut5.Td(layoutInflater.cloneInContext(getContext()), i, viewGroup, false);
        if (C315220CXg.LIZ().LJLIIL(Tb(), true) != null) {
            viewTd.setBackgroundColor(0);
        }
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

    @Override // com.ss.android.ugc.aweme.ecommerce.search.result.vertical.ISearchVerticalContext
    public final void GG0(String str, SearchApiResult searchApiResult, EnumC669620QOi enumC669620QOi, SearchResultParam searchResultParam, String str2, String str3) throws JSONException {
        String imprId;
        String searchChannel;
        String newSource;
        Long lValueOf;
        String imprId2;
        String str4;
        C0QXN ecommerceNewUserModel;
        String imprId3;
        C664000Q2s c664000Q2s;
        String imprId4;
        String searchChannel2;
        String newSource2;
        C01GW<C669750QOv> c01gw = C669750QOv.LIZLLL;
        C669750QOv c669750QOvLIZ = C669590QOf.LIZ();
        LogPbBean logPbBean = searchApiResult.logPb;
        String str5 = "";
        if (logPbBean == null || (imprId = logPbBean.getImprId()) == null) {
            imprId = "";
        }
        GlobalDoodleConfig globalDoodleConfig = searchApiResult.globalDoodleConfig;
        if (globalDoodleConfig != null) {
            searchChannel = globalDoodleConfig.getSearchChannel();
        } else {
            searchChannel = null;
        }
        GlobalDoodleConfig globalDoodleConfig2 = searchApiResult.globalDoodleConfig;
        if (globalDoodleConfig2 != null) {
            newSource = globalDoodleConfig2.getNewSource();
        } else {
            newSource = null;
        }
        BaseResponse.ServerTimeExtra serverTimeExtra = searchApiResult.extra;
        if (serverTimeExtra != null) {
            lValueOf = Long.valueOf(serverTimeExtra.now);
        } else {
            lValueOf = null;
        }
        c669750QOvLIZ.LJIJJLI(new LastSearch(str, imprId, searchChannel, newSource, lValueOf, 0L));
        View view = getView();
        if (view != null) {
            C1766860w4y c1766860w4y = C1766860w4y.LIZ;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("query", str);
            LogPbBean logPbBean2 = searchApiResult.logPb;
            if (logPbBean2 == null || (imprId4 = logPbBean2.getImprId()) == null) {
                imprId4 = "";
            }
            jSONObject.put("search_id", imprId4);
            GlobalDoodleConfig globalDoodleConfig3 = searchApiResult.globalDoodleConfig;
            if (globalDoodleConfig3 != null) {
                searchChannel2 = globalDoodleConfig3.getSearchChannel();
            } else {
                searchChannel2 = null;
            }
            jSONObject.put("channel", searchChannel2);
            jSONObject.put("source", str3);
            GlobalDoodleConfig globalDoodleConfig4 = searchApiResult.globalDoodleConfig;
            if (globalDoodleConfig4 != null) {
                newSource2 = globalDoodleConfig4.getNewSource();
            } else {
                newSource2 = null;
            }
            jSONObject.put("enter_method", newSource2);
            jSONObject.put("search_timestamp", System.currentTimeMillis() / ((long) LSPassThroughRecordSizeConfig.DEFAULT));
            String strJ3 = C786410Ut5.J3(jSONObject);
            this.LLILZIL.LIZIZ = strJ3;
            linkedHashMap.put("ec_search_action", strJ3);
            c1766860w4y.getClass();
            C1766860w4y.LJIILIIL(view, linkedHashMap, true);
        }
        LogPbBean logPbBean3 = searchApiResult.logPb;
        if (logPbBean3 == null || (imprId2 = logPbBean3.getImprId()) == null) {
            imprId2 = "";
        }
        C0QLD.LIZIZ("", imprId2, this.LLILZIL);
        C650950Pg5.Companion.getClass();
        C650960Pg6 c650960Pg6LJII = C646000PVm.LJII(this, this);
        if (c650960Pg6LJII == null || (c664000Q2s = c650960Pg6LJII.searchCommonModel) == null || (str4 = c664000Q2s.enterFrom) == null) {
            str4 = "";
        }
        C0QLD.LIZ("", str4, this.LLILZIL);
        C1766860w4y.LIZ.getClass();
        C1766860w4y.LJIILL(null, "ec_search_enter_method", "", false);
        C0QPB c0qpbLIZ = C669580QOe.LIZ(C1558360qeg.LJFF(this, null));
        if (c0qpbLIZ != null) {
            EnumC669630QOj enumC669630QOj = EnumC669630QOj.SHOP;
            if (enumC669620QOi == EnumC669620QOi.ECOM_LIVE) {
                enumC669630QOj = EnumC669630QOj.ECOM_LIVE;
            } else if (enumC669620QOi == EnumC669620QOi.STORE) {
                enumC669630QOj = EnumC669630QOj.STORE;
            } else {
                SearchResultParam searchResultParam2 = c0qpbLIZ.LLILZ;
                if (searchResultParam2 != null && (ecommerceNewUserModel = searchResultParam2.getEcommerceNewUserModel()) != null && ecommerceNewUserModel.landingToNewUserPage) {
                    enumC669630QOj = EnumC669630QOj.NEW_USER;
                }
            }
            LogPbBean logPbBean4 = searchApiResult.logPb;
            if (logPbBean4 != null && (imprId3 = logPbBean4.getImprId()) != null) {
                str5 = imprId3;
            }
            C669600QOg c669600QOg = new C669600QOg(enumC669630QOj, str5);
            Iterator<C669600QOg> it2 = c0qpbLIZ.LLILZIL.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                C669600QOg next = it2.next();
                if (next.LIZ == c669600QOg.LIZ) {
                    if (next != null) {
                        c0qpbLIZ.LLILZIL.remove(next);
                    }
                }
            }
            c0qpbLIZ.LLILZIL.add(c669600QOg);
        }
        C672090QXv.LIZIZ(C1558360qeg.LJFF(this, null), str2, searchResultParam, enumC669620QOi, searchApiResult);
    }
}
