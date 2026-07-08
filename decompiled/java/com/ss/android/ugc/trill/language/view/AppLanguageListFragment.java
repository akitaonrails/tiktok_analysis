package com.ss.android.ugc.trill.language.view;

import X.C086I;
import X.C098200Yq;
import X.C0OM1;
import X.C0TUX;
import X.C1250250idj;
import X.C1250300ido;
import X.C1554960qZC;
import X.C1558360qeg;
import X.C1685300txQ;
import X.C189200o6;
import X.C19277410bM;
import X.C19EG;
import X.C19GS;
import X.C20684815ws;
import X.C747580TUe;
import X.C786410Ut5;
import X.EnumC638250P1r;
import X.InterfaceC1555100qZQ;
import X.InterfaceC1910030znt;
import X.InterfaceC197023126r;
import X.InterfaceC747540TUa;
import Y.AObjectS126S0000000_28;
import Y.AObjectS371S0100000_28;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.foundation.fragment.BaseFragment;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.router.SmartRouter;
import com.bytedance.router.fragment.FragmentRoute;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.navigation.TuxNavBar;
import com.ss.android.common.lib.AppLogNewUtils;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.offline.language.ILanguageDebugService;
import com.ss.android.ugc.aweme.views.WrapLinearLayoutManager;
import com.ss.android.ugc.trill.language.view.AppLanguageListFragment;
import com.ss.android.ugc.trill.language.viewmodel.AppLanguageViewModel;
import com.tiktok.ef.i18n.service.manager.I18nServiceApi;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Objects;
import kotlin.Unit;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes29.dex */
public class AppLanguageListFragment extends BaseFragment implements Observer<ArrayList<C747580TUe>>, InterfaceC747540TUa {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZjE+ICM/ZiktJygmKSHELIOSIpZzk6LTJiCD8jBCQiLjoyLyAAIDwnDjctLiI2JjE=";
    public AppLanguageViewModel LLIZ;
    public TuxNavBar LLIZLLLIL;
    public RecyclerView LLJ;
    public C0TUX LLJI;
    public int LLJIJIL;
    public int LLJILJIL;
    public boolean LLJILJILJ;
    public String LLJILLL;
    public String LLJJ;

    public final void LIZLLL() {
        C19277410bM c19277410bM;
        InterfaceC1555100qZQ interfaceC1555100qZQLIZIZ = C1554960qZC.LIZIZ(C1558360qeg.LJFF(this, null), null, C19277410bM.class, null);
        if (interfaceC1555100qZQLIZIZ == null || (c19277410bM = (C19277410bM) interfaceC1555100qZQLIZIZ.getSource()) == null || !c19277410bM.LL) {
            if (getActivity() != null) {
                getActivity().finish();
            }
        } else {
            FragmentRoute fragmentRouteFragmentNavigation = SmartRouter.fragmentNavigation(this);
            fragmentRouteFragmentNavigation.pop();
            fragmentRouteFragmentNavigation.commit();
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(18:0|2|(15:15|(0)(1:18)|14|37|19|(1:21)(1:22)|23|(1:25)|26|29|(1:31)|32|(1:34)|35|36)(1:8)|9|(0)(1:13)|14|37|19|(0)(0)|23|(0)|26|29|(0)|32|(0)|35|36) */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0078, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0079, code lost:
    
        com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0);
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0054 A[PHI: r5 r6
      0x0054: PHI (r5v1 java.lang.String) = (r5v0 java.lang.String), (r5v3 java.lang.String), (r5v3 java.lang.String) binds: [B:16:0x0051, B:10:0x0038, B:12:0x003e] A[DONT_GENERATE, DONT_INLINE]
      0x0054: PHI (r6v1 java.lang.String) = (r6v0 java.lang.String), (r6v3 java.lang.String), (r6v3 java.lang.String) binds: [B:16:0x0051, B:10:0x0038, B:12:0x003e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00b3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void SR() {
        /*
            r8 = this;
            com.ss.android.ugc.aweme.framework.services.ServiceManager r1 = com.ss.android.ugc.aweme.framework.services.ServiceManager.get()
            java.lang.Class<com.ss.android.ugc.aweme.setting.services.ISettingService> r0 = com.ss.android.ugc.aweme.setting.services.ISettingService.class
            java.lang.Object r0 = r1.getService(r0)
            com.ss.android.ugc.aweme.setting.services.ISettingService r0 = (com.ss.android.ugc.aweme.setting.services.ISettingService) r0
            java.util.List r2 = r0.getI18nItems()
            java.lang.String r7 = ""
            if (r2 == 0) goto L4f
            int r1 = r8.LLJIJIL
            if (r1 < 0) goto L4f
            int r0 = r2.size()
            if (r1 >= r0) goto L4f
            int r0 = r8.LLJIJIL
            java.lang.Object r0 = com.bytedance.mt.protector.impl.collections.ListProtector.get(r2, r0)
            X.0znt r0 = (X.InterfaceC1910030znt) r0
            java.lang.String r6 = r0.LIZ()
            int r0 = r8.LLJIJIL
            java.lang.Object r0 = com.bytedance.mt.protector.impl.collections.ListProtector.get(r2, r0)
            X.0znt r0 = (X.InterfaceC1910030znt) r0
            java.lang.String r5 = r0.LIZIZ()
        L36:
            int r1 = r8.LLJILJIL
            if (r1 < 0) goto L54
            int r0 = r2.size()
            if (r1 >= r0) goto L54
            int r0 = r8.LLJILJIL
            java.lang.Object r0 = com.bytedance.mt.protector.impl.collections.ListProtector.get(r2, r0)
            X.0znt r0 = (X.InterfaceC1910030znt) r0
            java.lang.String r4 = r0.LIZ()
        L4c:
            java.lang.String r3 = r8.LLJILLL
            goto L56
        L4f:
            r6 = r7
            r5 = r7
            if (r2 == 0) goto L54
            goto L36
        L54:
            r4 = r7
            goto L4c
        L56:
            org.json.JSONObject r2 = new org.json.JSONObject     // Catch: java.lang.Exception -> L78
            r2.<init>()     // Catch: java.lang.Exception -> L78
            java.lang.String r1 = "pre_label"
            if (r4 != 0) goto L61
            r0 = r7
            goto L62
        L61:
            r0 = r4
        L62:
            r2.put(r1, r0)     // Catch: java.lang.Exception -> L78
            java.lang.String r0 = "label"
            if (r6 == 0) goto L6a
            r7 = r6
        L6a:
            r2.put(r0, r7)     // Catch: java.lang.Exception -> L78
            java.lang.String r0 = "enter_from"
            r2.put(r0, r3)     // Catch: java.lang.Exception -> L78
            java.lang.String r0 = "change_language"
            com.ss.android.common.lib.AppLogNewUtils.onEventV3(r0, r2)     // Catch: java.lang.Exception -> L78
            goto L7c
        L78:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
        L7c:
            java.lang.Class<com.ss.android.ugc.aweme.service.IUnKnownOwnershipBusinessOuterService> r0 = com.ss.android.ugc.aweme.service.IUnKnownOwnershipBusinessOuterService.class
            java.lang.Object r2 = com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt.pluggableSpi(r0)
            com.ss.android.ugc.aweme.service.IUnKnownOwnershipBusinessOuterService r2 = (com.ss.android.ugc.aweme.service.IUnKnownOwnershipBusinessOuterService) r2
            if (r2 == 0) goto L92
            android.content.Context r1 = r8.getContext()
            X.10bJ r0 = new X.10bJ
            r0.<init>(r8, r4, r6)
            r2.LJIJJ(r6, r5, r1, r0)
        L92:
            com.ss.android.ugc.aweme.framework.services.ServiceManager r1 = com.ss.android.ugc.aweme.framework.services.ServiceManager.get()
            java.lang.Class<com.ss.android.ugc.aweme.services.IExternalService> r0 = com.ss.android.ugc.aweme.services.IExternalService.class
            java.lang.Object r0 = r1.getService(r0)
            com.ss.android.ugc.aweme.services.IExternalService r0 = (com.ss.android.ugc.aweme.services.IExternalService) r0
            com.ss.android.ugc.aweme.services.external.IConfigService r0 = r0.configService()
            com.ss.android.ugc.aweme.services.external.ICacheService r0 = r0.cacheConfig()
            r0.clearFilterCache()
            java.lang.Class<com.ss.android.ugc.aweme.changeregionapi.api.IPNSChangeRegionService> r0 = com.ss.android.ugc.aweme.changeregionapi.api.IPNSChangeRegionService.class
            java.lang.Object r0 = com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt.pluggableSpi(r0)
            com.ss.android.ugc.aweme.changeregionapi.api.IPNSChangeRegionService r0 = (com.ss.android.ugc.aweme.changeregionapi.api.IPNSChangeRegionService) r0
            if (r0 == 0) goto Lb6
            r0.LJIILJJIL()
        Lb6:
            com.ss.android.ugc.aweme.compliance.api.services.settings.IComplianceSettingsService r0 = com.ss.android.ugc.aweme.compliance.api.ComplianceServiceProvider.LJJI()
            r0.LJIILIIL()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.trill.language.view.AppLanguageListFragment.SR():void");
    }

    @Override // X.InterfaceC747540TUa
    public final void LLJL(int i) {
        if (i == this.LLJIJIL) {
            return;
        }
        if (i == this.LLJILJIL) {
            TuxNavBar tuxNavBar = this.LLIZLLLIL;
            Objects.requireNonNull(tuxNavBar);
            this.LLIZLLLIL = tuxNavBar;
            this.LLIZLLLIL.LJJ(new AObjectS126S0000000_28(0), "end_text");
        } else {
            TuxNavBar tuxNavBar2 = this.LLIZLLLIL;
            Objects.requireNonNull(tuxNavBar2);
            this.LLIZLLLIL = tuxNavBar2;
            this.LLIZLLLIL.LJJ(new AObjectS126S0000000_28(1), "end_text");
        }
        AppLanguageViewModel appLanguageViewModel = this.LLIZ;
        int i2 = this.LLJIJIL;
        MutableLiveData<ArrayList<C747580TUe>> mutableLiveData = appLanguageViewModel.LL;
        if (!C086I.LIZIZ(mutableLiveData.getValue())) {
            if (i2 >= 0) {
                ((C747580TUe) ListProtector.get(mutableLiveData.getValue(), i2)).LIZ = false;
            }
            ((C747580TUe) ListProtector.get(mutableLiveData.getValue(), i)).LIZ = true;
        }
        this.LLJIJIL = i;
        this.LLJI.notifyDataSetChanged();
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        Intent intent;
        super.onAttach(context);
        if (!this.LLJILJILJ) {
            this.LLJILJILJ = true;
            Bundle arguments = getArguments();
            if (arguments == null) {
                C19EG activity = getActivity();
                if (activity != null && (intent = activity.getIntent()) != null) {
                    try {
                        arguments = intent.getExtras();
                        if (arguments == null) {
                            return;
                        }
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                        return;
                    }
                } else {
                    return;
                }
            }
            int i = arguments.getInt("key_launch_mode");
            long j = arguments.getLong("key_launch_time");
            if (i > 0 && j > 0) {
                HashMap map = new HashMap();
                map.put("launch_mode", String.valueOf(i));
                map.put("cost_time", String.valueOf(System.currentTimeMillis() - j));
                map.put("page", "language-setting");
                C20684815ws.LJIILLIIL("easy_navigation_performance_track", map);
            }
        }
    }

    @Override // androidx.lifecycle.Observer
    public final void onChanged(ArrayList<C747580TUe> arrayList) {
        ArrayList<C747580TUe> arrayList2 = arrayList;
        if (!C086I.LIZIZ(arrayList2)) {
            C0TUX c0tux = this.LLJI;
            if (c0tux == null) {
                C0TUX c0tux2 = new C0TUX(getContext(), this);
                this.LLJI = c0tux2;
                c0tux2.LLILLL = arrayList2;
                this.LLJ.setAdapter(c0tux2);
                String strLIZ = ((C747580TUe) ListProtector.get(arrayList2, this.LLJILJIL)).LIZIZ.LIZ();
                String str = this.LLJILLL;
                String str2 = this.LLJJ;
                try {
                    JSONObject jSONObject = new JSONObject();
                    if (strLIZ == null) {
                        strLIZ = "";
                    }
                    jSONObject.put("app_language", strLIZ);
                    jSONObject.put("enter_from", str);
                    jSONObject.put("enter_method", str2);
                    AppLogNewUtils.onEventV3("enter_app_language_setting", jSONObject);
                    return;
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    return;
                }
            }
            c0tux.LLILLL = arrayList2;
            c0tux.notifyDataSetChanged();
        }
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        NR(new AObjectS371S0100000_28(this, 5));
        super.onCreate(bundle);
        if (getActivity() == null) {
            return;
        }
        AppLanguageViewModel appLanguageViewModel = (AppLanguageViewModel) ViewModelProviders.of(this).get(AppLanguageViewModel.class);
        this.LLIZ = appLanguageViewModel;
        if (appLanguageViewModel.LL == null) {
            appLanguageViewModel.LL = new MutableLiveData<>();
        }
        appLanguageViewModel.LL.observe(this, this);
        AppLanguageViewModel appLanguageViewModel2 = this.LLIZ;
        Context context = getContext();
        appLanguageViewModel2.getClass();
        ArrayList<C747580TUe> arrayList = new ArrayList<>();
        I18nServiceApi i18nServiceApi = (I18nServiceApi) PluggableExtentionKt.pluggableSpi(I18nServiceApi.class);
        int size = -1;
        if (i18nServiceApi != null && i18nServiceApi.LIZ() != null) {
            for (InterfaceC1910030znt interfaceC1910030znt : i18nServiceApi.LIZ().LJIIJJI()) {
                if (TextUtils.equals(interfaceC1910030znt.LIZJ(), i18nServiceApi.LIZ().LJI(context))) {
                    arrayList.add(new C747580TUe(interfaceC1910030znt, true));
                    size = arrayList.size() - 1;
                } else {
                    arrayList.add(new C747580TUe(interfaceC1910030znt, false));
                }
            }
        }
        appLanguageViewModel2.LL.postValue(arrayList);
        this.LLJILJIL = size;
        this.LLJIJIL = size;
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        this.LLIZLLLIL = (TuxNavBar) view.findViewById(R.id.y08);
        this.LLJ = (RecyclerView) view.findViewById(R.id.msq);
        super.onViewCreated(view, bundle);
        this.LLJ.setLayoutManager(new WrapLinearLayoutManager(getContext()));
        final ILanguageDebugService iLanguageDebugService = (ILanguageDebugService) ServiceManager.get().getService(ILanguageDebugService.class);
        C0OM1 c0om1 = new C0OM1();
        C1250300ido c1250300ido = new C1250300ido();
        c1250300ido.LIZIZ = "start_text";
        c1250300ido.LJ = true;
        c1250300ido.LIZLLL = EnumC638250P1r.SECONDARY;
        c1250300ido.LIZJ = getString(2131828217);
        c1250300ido.LIZ = new InterfaceC197023126r() { // from class: X.10bL
            @Override // X.InterfaceC197023126r
            public final void LIZ() {
                this.LIZ.LIZLLL();
            }
        };
        c0om1.LJ(c1250300ido);
        C1250250idj c1250250idj = new C1250250idj();
        c1250250idj.LIZJ = getText(2131826604);
        c0om1.LIZJ = c1250250idj;
        iLanguageDebugService.isOpen();
        C1250300ido c1250300ido2 = new C1250300ido();
        c1250300ido2.LIZIZ = "end_text";
        c1250300ido2.LIZJ = getString(2131834695);
        c1250300ido2.LJ = false;
        c1250300ido2.LIZLLL = EnumC638250P1r.PRIMARY;
        c1250300ido2.LIZ = new InterfaceC197023126r() { // from class: X.10bK
            @Override // X.InterfaceC197023126r
            public final void LIZ() {
                AppLanguageListFragment appLanguageListFragment = this.LIZIZ;
                TuxNavBar tuxNavBar = appLanguageListFragment.LLIZLLLIL;
                Objects.requireNonNull(tuxNavBar);
                appLanguageListFragment.LLIZLLLIL = tuxNavBar;
                View viewLJII = this.LIZIZ.LLIZLLLIL.LJII("end_text");
                if (viewLJII == null || !viewLJII.isEnabled()) {
                    this.LIZIZ.LIZLLL();
                } else {
                    iLanguageDebugService.isOpen();
                    this.LIZIZ.SR();
                }
            }
        };
        c0om1.LIZIZ(c1250300ido2);
        this.LLIZLLLIL.setNavActions(c0om1);
        TypedValue typedValue = new TypedValue();
        view.getContext().getTheme().resolveAttribute(R.attr.zp, typedValue, true);
        view.setBackgroundColor(typedValue.data);
        this.LLIZLLLIL.setNavBackground(typedValue.data);
        this.LLIZLLLIL.LJIIZILJ(false);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.f5v, viewGroup, false);
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
