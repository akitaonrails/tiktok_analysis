package com.ss.android.ugc.aweme.poi.revisit.view;

import X.C019F;
import X.C01D1;
import X.C01GW;
import X.C03H5;
import X.C098200Yq;
import X.C0FNT;
import X.C0OM1;
import X.C0QSJ;
import X.C0ZP4;
import X.C1175270ggn;
import X.C1177570gkV;
import X.C1177580gkW;
import X.C1177730gkl;
import X.C1177940gl6;
import X.C1185040gwY;
import X.C1185050gwZ;
import X.C1185430gxB;
import X.C1189060h32;
import X.C11H2;
import X.C11H6;
import X.C11H7;
import X.C11H9;
import X.C1205490hTX;
import X.C1247530iZL;
import X.C1250250idj;
import X.C1251150ifB;
import X.C1367960lha;
import X.C1390850mIV;
import X.C13LE;
import X.C1558520qew;
import X.C1622206Wu;
import X.C1685300txQ;
import X.C1749280vcc;
import X.C1770850wBP;
import X.C189200o6;
import X.C19474211Gy;
import X.C19719912Dl;
import X.C19EG;
import X.C19GS;
import X.C1EMR;
import X.C2217381BqS;
import X.C2344009Gk;
import X.C338490DOt;
import X.C451460Hn6;
import X.C451620HnM;
import X.C451650HnP;
import X.C452070Ho5;
import X.C673150Qan;
import X.C687700QyG;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C786410Ut5;
import X.C987103tV;
import X.EnumC1076210e71;
import X.InterfaceC0148002o;
import X.InterfaceC1146704e9;
import X.InterfaceC1631620sYq;
import X.InterfaceC1631630sYr;
import X.InterfaceC1685420txc;
import X.InterfaceC1685430txd;
import X.InterfaceC2217241BqE;
import X.InterfaceC2217461Bqa;
import X.InterfaceC451590HnJ;
import X.InterfaceC665370Q7z;
import X.InterfaceC687730QyJ;
import X.InterfaceC724530SbT;
import X.InterfaceC724760Sbq;
import X.InterfaceC725050ScJ;
import X.InterfaceC736810SvH;
import X.InterfaceC836760Ws6;
import X.ViewOnAttachStateChangeListenerC20604515jv;
import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.android.btm.api.model.PageFinder;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.router.arg.RouteArgExtension;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.navigation.TuxNavBar;
import com.ss.android.ugc.aweme.poi.BasePage;
import com.ss.android.ugc.aweme.poi.revisit.api.PoiRevisitApi;
import com.ss.android.ugc.aweme.poi.revisit.model.PoiRevisitCardItem;
import com.ss.android.ugc.aweme.poi.revisit.vm.PoiRevisitViewModel;
import com.ss.android.ugc.aweme.poi_api.model.PoiLocation;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS206S0000000_18;
import kotlin.jvm.internal.AFwS256S0000000_18;
import kotlin.jvm.internal.AwS0S5400000_18;
import kotlin.jvm.internal.AwS562S0100000_18;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
@InterfaceC836760Ws6
public final class PoiRevisitFragment extends BasePage implements InterfaceC724530SbT, IPoiRevisitFragmentAbility, C0QSJ, InterfaceC1146704e9 {
    public static final C1177940gl6 LLJJIJIL;
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJJ;
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZjUjIGEhHELIOSLTMlOiYnZjMlLDh9GColGyolITYlPQkhKSIhLCEn";
    public final C01GW LLIZLLLIL = RouteArgExtension.INSTANCE.requiredArg(this, AFwS206S0000000_18.get$arr$(514), "poi_revisit_data_params", C1177730gkl.class);
    public final AssemVMLazy LLJ;
    public View LLJI;
    public C1175270ggn LLJIJIL;
    public ConstraintLayout LLJILJIL;
    public ViewGroup LLJILJILJ;
    public TuxNavBar LLJILLL;
    public C1749280vcc LLJJ;
    public ViewOnAttachStateChangeListenerC20604515jv LLJJI;
    public TuxIconView LLJJIII;
    public Long LLJJIJI;
    public EnumC1076210e71 LLJJIJIIJIL;

    /* JADX WARN: Type inference failed for: r0v3, types: [X.0gl6] */
    static {
        C2217381BqS c2217381BqS = new C2217381BqS(PoiRevisitFragment.class, "pageVM", "getPageVM()Lcom/ss/android/ugc/aweme/poi/revisit/vm/PoiRevisitViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJJJ = new InterfaceC2217461Bqa[]{c2217381BqS};
        LLJJIJIL = new Object() { // from class: X.0gl6
        };
    }

    @Override // X.C0QSJ
    public final void bindAbility(Object obj, Class cls) {
        C673150Qan.LIZ(this, obj, cls);
    }

    @Override // X.InterfaceC1146704e9
    public final void checkParentScope() {
        C687700QyG.LIZ(this, new Class[]{PoiRevisitFragmentScope.class});
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
        arrayList.add(PoiRevisitFragmentScope.class);
        return arrayList;
    }

    @Override // X.InterfaceC725030ScH
    public final C03H5 getReceiverForHostVM() {
        return null;
    }

    @Override // X.C0QSJ
    public final List getScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(PoiRevisitFragmentScope.class);
        return arrayList;
    }

    @Override // X.InterfaceC725030ScH
    public final boolean getUniqueOnlyDefault() {
        return true;
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

    public PoiRevisitFragment() {
        AssemVMLazy assemVMLazy;
        InterfaceC724760Sbq interfaceC724760Sbq = C01D1.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(PoiRevisitViewModel.class);
        AwS562S0100000_18 awS562S0100000_18 = new AwS562S0100000_18(c19719912DlLIZ, 2006);
        AFwS256S0000000_18 aFwS256S0000000_18 = AFwS256S0000000_18.get$arr$(644);
        if (Intrinsics.LJFF(interfaceC724760Sbq, interfaceC724760Sbq)) {
            assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ), awS562S0100000_18, new C452070Ho5(), new C1622206Wu(this, true), new C338490DOt(this, true), new AwS562S0100000_18((HasDefaultViewModelProviderFactory) this, 2007), aFwS256S0000000_18, new C451460Hn6(this, true), new C451620HnM(this, true), new C987103tV(this, true));
        } else if (interfaceC724760Sbq instanceof InterfaceC451590HnJ) {
            assemVMLazy = C451650HnP.LIZ(this, (InterfaceC451590HnJ) interfaceC724760Sbq, C724750Sbp.LJIIJ(this, c19719912DlLIZ), awS562S0100000_18, new AwS562S0100000_18((Fragment) this, 2008), aFwS256S0000000_18, null, null, null);
        } else {
            if (!Intrinsics.LJFF(interfaceC724760Sbq, C019F.LIZ)) {
                throw new IllegalArgumentException("Do not support this scope here.");
            }
            assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ), awS562S0100000_18, new C452070Ho5(), C724750Sbp.LJII(this), C724750Sbp.LJIIIZ(this), new AwS562S0100000_18((HasDefaultViewModelProviderFactory) this, 2009), aFwS256S0000000_18, new C451460Hn6(this, false), new C451620HnM(this, false), new C987103tV(this, false));
        }
        this.LLJ = assemVMLazy;
    }

    public final C1177730gkl UR() {
        return (C1177730gkl) this.LLIZLLLIL.getValue();
    }

    public final PoiRevisitViewModel VR() {
        AssemVMLazy assemVMLazy = this.LLJ;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJJ;
        return (PoiRevisitViewModel) assemVMLazy.getValue();
    }

    private final void initState() {
        VR().AQ2();
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        InterfaceC665370Q7z interfaceC665370Q7z = VR().LLJ;
        if (interfaceC665370Q7z != null) {
            C1558520qew.LJIIJJI(interfaceC665370Q7z, IPoiRevisitFragmentAbility.class, null);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0088  */
    @Override // androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onResume() {
        /*
            r11 = this;
            super.onResume()
            android.content.Context r0 = r11.getContext()
            if (r0 != 0) goto La
            return
        La:
            java.lang.Class<com.ss.android.ugc.tiktok.location_api.service.ILocationService> r0 = com.ss.android.ugc.tiktok.location_api.service.ILocationService.class
            r1 = 0
            r6 = 0
            r4 = 14
            r5 = 0
            r2 = r1
            r3 = r1
            java.lang.Object r1 = com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt.pluggableSpi$default(r0, r1, r2, r3, r4, r5)
            X.0hWl r1 = (X.InterfaceC1207490hWl) r1
            r2 = 1
            if (r1 == 0) goto L88
            X.0XAv r0 = X.C844470XAv.LIZ
            r0.getClass()
            android.content.Context r0 = X.C844470XAv.LIZ()
            boolean r0 = r1.LJII(r6, r0)
            if (r0 != r2) goto L88
            r4 = 1
        L2c:
            java.lang.Class<com.ss.android.ugc.tiktok.location_api.service.ILocationBaseServiceForMT> r5 = com.ss.android.ugc.tiktok.location_api.service.ILocationBaseServiceForMT.class
            r9 = 14
            r10 = 0
            r7 = r6
            r8 = r6
            java.lang.Object r1 = com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt.pluggableSpi$default(r5, r6, r7, r8, r9, r10)
            com.ss.android.ugc.tiktok.location_api.service.ILocationBaseServiceForMT r1 = (com.ss.android.ugc.tiktok.location_api.service.ILocationBaseServiceForMT) r1
            if (r1 == 0) goto L86
            X.0XAv r0 = X.C844470XAv.LIZ
            r0.getClass()
            android.content.Context r0 = X.C844470XAv.LIZ()
            boolean r0 = r1.LJ(r0)
            if (r0 != r2) goto L86
            r3 = 1
        L4b:
            if (r4 != 0) goto L7e
            X.0e71 r2 = X.EnumC1076210e71.NO_PERMISSION
        L4f:
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "Revisit Fragment onResume hasCoarsePermission="
            r1.append(r0)
            r1.append(r4)
            java.lang.String r0 = ", hasPrecisePermission="
            r1.append(r0)
            r1.append(r3)
            java.lang.String r0 = ", currentPermissionType="
            r1.append(r0)
            r1.append(r2)
            X.C2188811AlT.LIZIZ(r1)
            X.0e71 r0 = r11.LLJJIJIIJIL
            if (r0 == 0) goto L7b
            if (r2 == r0) goto L7b
            com.ss.android.ugc.aweme.poi.revisit.vm.PoiRevisitViewModel r0 = r11.VR()
            r0.AQ2()
        L7b:
            r11.LLJJIJIIJIL = r2
            return
        L7e:
            if (r3 != 0) goto L83
            X.0e71 r2 = X.EnumC1076210e71.COARSE
            goto L4f
        L83:
            X.0e71 r2 = X.EnumC1076210e71.PRECISE
            goto L4f
        L86:
            r3 = 0
            goto L4b
        L88:
            r4 = 0
            goto L2c
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.poi.revisit.view.PoiRevisitFragment.onResume():void");
    }

    @Override // com.ss.android.ugc.aweme.poi.BasePage, androidx.fragment.app.Fragment
    public final void onStart() {
        super.onStart();
        this.LLJJIJI = Long.valueOf(System.currentTimeMillis());
    }

    @Override // com.ss.android.ugc.aweme.poi.BasePage, androidx.fragment.app.Fragment
    public final void onStop() {
        super.onStop();
        Long l = this.LLJJIJI;
        if (l != null) {
            long jLongValue = l.longValue();
            C1177570gkV c1177570gkV = C1177570gkV.LIZ;
            Integer numValueOf = Integer.valueOf((int) (System.currentTimeMillis() - jLongValue));
            c1177570gkV.getClass();
            C2344009Gk c2344009Gk = new C2344009Gk();
            c2344009Gk.LJFF("enter_from", "ttsocial_collection_detail_page");
            c2344009Gk.LJFF("current_page", "ttls_collection_poi_list_page");
            c2344009Gk.LJFF("enable_location", C1177570gkV.LIZIZ());
            C1189060h32.LJIJJLI(c2344009Gk, "duration", numValueOf);
            C1185040gwY c1185040gwY = C1185040gwY.LIZ;
            Map<String, String> map = c2344009Gk.LIZ;
            C1185050gwZ c1185050gwZ = new C1185050gwZ(PageFinder.via((Fragment) this));
            c1185040gwY.getClass();
            C1185040gwY.LIZIZ("stay_time", map, c1185050gwZ);
        }
        this.LLJJIJI = null;
    }

    @Override // com.ss.android.ugc.aweme.poi.revisit.view.IPoiRevisitFragmentAbility
    public final void Ad0(PoiRevisitCardItem poiRevisitCardItem) {
        Activity activityLIZ;
        C19EG c19eg;
        FragmentManager supportFragmentManager;
        String str;
        String str2;
        PoiLocation poiLocation;
        String str3;
        Context context = getContext();
        String str4 = null;
        if (context != null) {
            activityLIZ = C0FNT.LIZ(context);
        } else {
            activityLIZ = null;
        }
        if ((activityLIZ instanceof C19EG) && (c19eg = (C19EG) activityLIZ) != null && (supportFragmentManager = c19eg.getSupportFragmentManager()) != null) {
            Context context2 = getContext();
            if (poiRevisitCardItem != null) {
                str = poiRevisitCardItem.poiId;
                str2 = poiRevisitCardItem.poiName;
                poiLocation = poiRevisitCardItem.LLILLL;
                str3 = poiRevisitCardItem.formattedAddress;
                str4 = poiRevisitCardItem.keyCategory;
            } else {
                str = null;
                str2 = null;
                poiLocation = null;
                str3 = null;
            }
            if (context2 != null) {
                try {
                    ArrayList arrayList = new ArrayList();
                    ZR(context2, arrayList, str, str2, poiLocation, str3, str4);
                    C1247530iZL c1247530iZL = new C1247530iZL();
                    c1247530iZL.LIZ = context2.getResources().getString(2131844787);
                    c1247530iZL.LIZJ(R.raw.icon_doc_on_doc);
                    c1247530iZL.LIZJ = 0;
                    c1247530iZL.LIZ(new C1177580gkW(this, str, str4, context2, str2, str3));
                    arrayList.add(c1247530iZL);
                    C1390850mIV c1390850mIV = new C1390850mIV();
                    c1390850mIV.LIZ.LLJJIJI = context2.getResources().getString(2131844788);
                    c1390850mIV.LJFF(arrayList);
                    c1390850mIV.LIZJ().show(supportFragmentManager, "map");
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    C1205490hTX.LIZ.LJ(C1EMR.MAP_MODE_ERR, e);
                }
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.poi.BasePage, com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        activityConfiguration(AFwS256S0000000_18.get$arr$(642));
        NR(AFwS256S0000000_18.get$arr$(643));
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
    public final void WR(View view, boolean z) {
        int size;
        List<PoiRevisitApi.PoiRevisitCardModel> list;
        String quantityString;
        Resources resources;
        List<String> collectPoiIdList;
        if (view == null) {
            return;
        }
        TuxNavBar tuxNavBar = (TuxNavBar) view.findViewById(R.id.p15);
        this.LLJILLL = tuxNavBar;
        if (tuxNavBar != null) {
            tuxNavBar.bringToFront();
        }
        C1177730gkl c1177730gklUR = UR();
        if (c1177730gklUR != null && (collectPoiIdList = c1177730gklUR.getCollectPoiIdList()) != null) {
            size = collectPoiIdList.size();
        } else {
            PoiRevisitApi.PoiRevisitCardListResponse poiRevisitCardListResponseWQ2 = VR().wQ2(false, false, false);
            if (poiRevisitCardListResponseWQ2 != null && (list = poiRevisitCardListResponseWQ2.poiCardList) != null) {
                size = list.size();
            } else {
                size = 0;
            }
        }
        Context context = getContext();
        String str = "";
        if (context == null || (resources = context.getResources()) == null || (quantityString = resources.getQuantityString(2131755622, size, String.valueOf(size))) == null) {
            quantityString = "";
        }
        C0OM1 c0om1 = new C0OM1();
        C1251150ifB c1251150ifB = new C1251150ifB();
        c1251150ifB.LIZLLL();
        c1251150ifB.LIZJ = R.raw.icon_chevron_left_offset_ltr;
        c1251150ifB.LIZJ(new AwS562S0100000_18(this, 2005));
        c0om1.LJ(c1251150ifB);
        C1250250idj c1250250idj = new C1250250idj();
        String collectionName = UR().getCollectionName();
        if (collectionName != null) {
            str = collectionName;
        }
        c1250250idj.LIZJ = str;
        c1250250idj.LIZLLL = quantityString;
        c0om1.LIZJ = c1250250idj;
        if (z) {
            C1251150ifB c1251150ifB2 = new C1251150ifB();
            c1251150ifB2.LIZLLL();
            c1251150ifB2.LIZJ = R.raw.icon_map;
            c1251150ifB2.LIZJ(new AwS562S0100000_18(this, 2004));
            c0om1.LIZIZ(c1251150ifB2);
        }
        TuxNavBar tuxNavBar2 = this.LLJILLL;
        if (tuxNavBar2 != null) {
            tuxNavBar2.setNavActions(c0om1);
        }
        TuxNavBar tuxNavBar3 = this.LLJILLL;
        if (tuxNavBar3 != null) {
            tuxNavBar3.setClickable(true);
        }
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type java.lang.Object to com.ss.android.ugc.aweme.poi.revisit.view.PoiRevisitFragment for r16v2 'this'  java.lang.Object
        	at jadx.core.dex.instructions.args.SSAVar.setType(SSAVar.java:114)
        	at jadx.core.dex.instructions.args.RegisterArg.setType(RegisterArg.java:52)
        	at jadx.core.dex.visitors.ModVisitor.removeCheckCast(ModVisitor.java:417)
        	at jadx.core.dex.visitors.ModVisitor.replaceStep(ModVisitor.java:152)
        	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
        */
    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(android.view.View r17, android.os.Bundle r18) {
        /*
            Method dump skipped, instruction units count: 476
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.poi.revisit.view.PoiRevisitFragment.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.e8k, viewGroup, false);
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

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o, A, B> C0ZP4 selectSubscribe(AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, InterfaceC2217241BqE<S, ? extends B> interfaceC2217241BqE2, C1770850wBP<C19474211Gy<A, B>> c1770850wBP, Function1<? super Throwable, Unit> function1, InterfaceC1631620sYq<? super C03H5, ? super A, ? super B, Unit> interfaceC1631620sYq) {
        return C736680Sv4.LIZLLL(assemViewModel, this, c1770850wBP, function1, interfaceC1631620sYq, interfaceC2217241BqE, interfaceC2217241BqE2);
    }

    public final void ZR(Context context, ArrayList arrayList, String str, String str2, PoiLocation poiLocation, String str3, String str4) {
        C1367960lha.LIZ.getClass();
        if (!C1367960lha.LIZ().LJI(context)) {
            C1185430gxB.LIZ.getClass();
            C1185430gxB.LJIL(null, "map_mode", str);
            return;
        }
        C1247530iZL c1247530iZL = new C1247530iZL();
        c1247530iZL.LIZ = context.getResources().getString(2131844800);
        c1247530iZL.LIZJ(R.raw.icon_arrow_up_right_ltr);
        c1247530iZL.LIZJ = 0;
        c1247530iZL.LIZ(new AwS0S5400000_18(this, str, str4, context, poiLocation, str2, str3, 1));
        arrayList.add(c1247530iZL);
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
