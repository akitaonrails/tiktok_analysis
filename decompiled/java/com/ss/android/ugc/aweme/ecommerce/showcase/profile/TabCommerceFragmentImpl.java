package com.ss.android.ugc.aweme.ecommerce.showcase.profile;

import X.C01GW;
import X.C099M;
import X.C099Q;
import X.C099R;
import X.C0WST;
import X.C0WSU;
import X.C0WZW;
import X.C0WZX;
import X.C1202220hOG;
import X.C1537710q7N;
import X.C1741890vQh;
import X.C189200o6;
import X.C2187451AjH;
import X.C2252611DEt;
import X.C23250099c;
import X.C452501pT;
import X.C598190NdB;
import X.C616540OGe;
import X.C786410Ut5;
import X.EnumC452301pR;
import X.InterfaceC1364105Vn;
import X.InterfaceC1541990qEH;
import X.SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB;
import android.os.Bundle;
import android.view.View;
import androidx.lifecycle.LifecycleOwnerKt;
import com.bytedance.hybrid.spark.SparkContext;
import com.google.gson.n;
import com.ss.android.ugc.aweme.ecommerce.showcase.service.IEcommerceStoreBizLogService;
import com.ss.android.ugc.aweme.ecommerce.showcase.service.saas.TabCommerceFragment;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.profile.MiniUser;
import com.ss.android.ugc.aweme.services.IMainService;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.internal.AwS153S1100000_4;
import kotlin.jvm.internal.AwS156S1100000_7;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes27.dex */
public abstract class TabCommerceFragmentImpl extends TabCommerceFragment {
    public final C01GW LLILZLL;
    public final C01GW LLIZ;
    public final C01GW LLIZLLLIL;
    public int[] LLJ;
    public String LLJI;
    public HashMap<String, Object> LLJIJIL;
    public MiniUser LLJILJIL;
    public String LLJILJILJ;
    public String LLJILLL;
    public long LLJJ;
    public long LLJJI;
    public final Map<String, Object> LLJJIII;
    public final Map<String, Object> LLJJIJI;
    public SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB LLJJIJIIJIL;
    public SparkContext LLJJIJIL;
    public MiniUser LLJJJ;
    public String LLJJJIL;
    public C2252611DEt LLJJJJ;

    public abstract int Rc();

    public final boolean BS() {
        return ((Boolean) this.LLILZLL.getValue()).booleanValue();
    }

    public final String getEnterFrom() {
        return (String) this.LLIZ.getValue();
    }

    public final C1537710q7N wS() {
        SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB = this.LLJJIJIIJIL;
        InterfaceC1541990qEH kitView = sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB != null ? sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB.getKitView() : null;
        if (kitView instanceof C1537710q7N) {
            return (C1537710q7N) kitView;
        }
        return null;
    }

    public final String yS() {
        C1202220hOG c1202220hOG = C1202220hOG.LIZ;
        Object obj = ((LinkedHashMap) this.LLJJIII).get("list_source_content_id");
        String str = zS().id;
        c1202220hOG.getClass();
        n nVarLIZIZ = C1202220hOG.LIZIZ(obj, str);
        if (nVarLIZIZ != null) {
            return nVarLIZIZ.toString();
        }
        return null;
    }

    public final MiniUser zS() {
        MiniUser miniUser = this.LLJILJIL;
        if (miniUser != null) {
            return miniUser;
        }
        return null;
    }

    public TabCommerceFragmentImpl() {
        EnumC452301pR enumC452301pR = EnumC452301pR.NONE;
        this.LLILZLL = C452501pT.LIZ(enumC452301pR, new AwS153S1100000_4(this, 2));
        this.LLIZ = C452501pT.LIZ(enumC452301pR, new AwS156S1100000_7(this, "enter_from", 2));
        this.LLIZLLLIL = C452501pT.LIZ(enumC452301pR, new AwS156S1100000_7(this, "entrance_type", 2));
        this.LLJ = new int[0];
        this.LLJI = "";
        this.LLJILJILJ = "";
        this.LLJILLL = "";
        this.LLJJIII = new LinkedHashMap();
        this.LLJJIJI = new LinkedHashMap();
    }

    @Override // com.ss.android.ugc.aweme.profile.ui.ProfileListFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C598190NdB(this, null), 3);
        SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB = this.LLJJIJIIJIL;
        if (sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB != null) {
            SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB.LJIL(sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB);
        }
        super.onDestroyView();
    }

    @Override // com.ss.android.ugc.aweme.profile.ui.ProfileListFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public void onResume() {
        if (C616540OGe.LIZ() && !((IMainService) ServiceManager.get().getService(IMainService.class)).isMainPage(getActivity())) {
            C2187451AjH.LJJIJIIJI(getClass().getName());
        }
        super.onResume();
        if (!getUserVisibleHint() || wS() == null) {
            return;
        }
        FS(1);
    }

    @Override // com.ss.android.ugc.aweme.profile.ui.ProfileListFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public void onStop() {
        if (getUserVisibleHint() && wS() != null) {
            ES(1);
        }
        super.onStop();
    }

    public void ES(int i) {
        C1537710q7N c1537710q7NWS = wS();
        if (c1537710q7NWS != null) {
            c1537710q7NWS.onHide();
        }
    }

    public void FS(int i) {
        C1537710q7N c1537710q7NWS = wS();
        if (c1537710q7NWS != null) {
            c1537710q7NWS.onShow();
        }
    }

    public final Object JS(InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        C2252611DEt c2252611DEt = this.LLJJJJ;
        if (c2252611DEt != null) {
            Boolean.valueOf(c2252611DEt.LJJIIZ(null));
        }
        if (!getUserVisibleHint()) {
            C2252611DEt c2252611DEt2 = new C2252611DEt(1, C099M.LIZLLL(interfaceC1364105Vn));
            c2252611DEt2.LJIJJ();
            this.LLJJJJ = c2252611DEt2;
            Object objLJIJ = c2252611DEt2.LJIJ();
            if (objLJIJ == C099R.LJFF()) {
                C099Q.LIZJ(interfaceC1364105Vn);
            }
            if (objLJIJ == C099R.LJFF()) {
                return objLJIJ;
            }
            return Unit.LIZ;
        }
        return Unit.LIZ;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.showcase.service.saas.TabCommerceFragment, X.InterfaceC1257980iqC
    public final void PB(String str) {
        this.LLJJJIL = str;
    }

    @Override // com.ss.android.ugc.aweme.profile.ui.ProfileListFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        HashMap<String, Object> mapLIZLLL;
        Bundle arguments;
        MiniUser miniUser;
        String string;
        String string2;
        int[] intArray;
        super.onCreate(bundle);
        Bundle arguments2 = getArguments();
        if (arguments2 != null && (intArray = arguments2.getIntArray("traffic_source_list")) != null) {
            this.LLJ = intArray;
        }
        Bundle arguments3 = getArguments();
        if (arguments3 != null && (string2 = arguments3.getString("trackParams")) != null) {
            this.LLJI = string2;
        }
        Bundle arguments4 = getArguments();
        String string3 = null;
        if (arguments4 != null) {
            mapLIZLLL = C1741890vQh.LIZLLL(arguments4, "trackParams");
        } else {
            mapLIZLLL = null;
        }
        this.LLJIJIL = mapLIZLLL;
        Bundle arguments5 = getArguments();
        if (arguments5 != null) {
            string3 = arguments5.getString("group_id");
        }
        if (string3 != null && !a0.LJJJIL(string3)) {
            this.LLJJJIL = string3;
        }
        Bundle arguments6 = getArguments();
        if (arguments6 != null && (string = arguments6.getString("list_source_content_id")) != null && !a0.LJJJIL(string)) {
            this.LLJJIII.put("list_source_content_id", string);
        }
        if ((bundle != null && (miniUser = (MiniUser) bundle.getParcelable("user")) != null) || ((arguments = getArguments()) != null && (miniUser = (MiniUser) arguments.getParcelable("user")) != null)) {
            this.LLJILJIL = miniUser;
        } else {
            "Required value was null.".toString();
            throw new IllegalArgumentException("Required value was null.");
        }
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        C786410Ut5.LJJIJL(bundle, "user", zS());
    }

    @Override // com.ss.android.ugc.aweme.profile.ui.ProfileListFragment, androidx.fragment.app.Fragment
    public void setUserVisibleHint(boolean z) {
        Object obj;
        C0WSU c0wsuLIZIZ = new C0WST().LIZIZ(10502, "com/ss/android/ugc/aweme/ecommerce/showcase/profile/TabCommerceFragmentImpl", "setUserVisibleHint", this, new Object[]{Boolean.valueOf(z)}, "void", new C0WZW(false, "(Z)V", new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KO+rbJLD2SDodnu3ZuhKqaILhr0sz6YkaWp60qRs/8frCf48lw6orMT8rqhv7TYy4121", null)));
        if (c0wsuLIZIZ.LIZ) {
            return;
        }
        Object[] objArr = c0wsuLIZIZ.LIZJ;
        if (objArr != null && (obj = objArr[0]) != null) {
            z = ((Boolean) obj).booleanValue();
        }
        super.setUserVisibleHint(z);
        if (z) {
            if (this.LLJJI <= 0) {
                this.LLJJI = System.currentTimeMillis();
            }
            C2252611DEt c2252611DEt = this.LLJJJJ;
            if (c2252611DEt != null) {
                Unit unit = Unit.LIZ;
                C189200o6.m2constructorimpl(unit);
                c2252611DEt.resumeWith(unit);
            }
            this.LLJJJJ = null;
            return;
        }
        if (wS() == null) {
            return;
        }
        ES(0);
    }

    @Override // X.InterfaceC1257980iqC
    public void za(MiniUser miniUser) {
        boolean z;
        IEcommerceStoreBizLogService iEcommerceStoreBizLogService = (IEcommerceStoreBizLogService) PluggableExtentionKt.pluggableSpi$default(IEcommerceStoreBizLogService.class, false, false, false, 14, null);
        if (iEcommerceStoreBizLogService != null) {
            if (this.LLJILJIL != null && Intrinsics.LJFF(zS().id, miniUser.id)) {
                z = true;
            } else {
                z = false;
            }
            iEcommerceStoreBizLogService.LJI(Rc(), z, this.mStatusViewValid);
        }
        if (this.mStatusViewValid) {
            miniUser = null;
        }
        this.LLJJJ = miniUser;
    }

    public final void HS(String str, JSONObject jSONObject) {
        SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB = this.LLJJIJIIJIL;
        if (sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB != null) {
            sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB.LIZ(str, jSONObject);
        }
    }

    @Override // com.ss.android.ugc.aweme.profile.ui.ProfileListFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        MiniUser miniUser = this.LLJJJ;
        if (miniUser != null) {
            this.LLJILJIL = miniUser;
        }
        this.LLJJJ = null;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:0|2|(2:4|(1:6)(1:13))(0)|7|(1:(1:(1:(1:12)(2:14|15))(2:38|51))(4:16|49|17|(2:28|(5:30|(1:32)|33|(1:35)|(1:37)(1:39))(2:40|(1:42)))(1:27)))(1:18)|47|19|(2:21|43)|(0)(0)|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0058, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0061 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0062  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:41:0x00c4 -> B:47:0x004b). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final <T> java.lang.Object GS(X.C1749280vcc r10, kotlin.jvm.functions.Function1<? super X.InterfaceC1364105Vn<? super T>, ? extends java.lang.Object> r11, X.InterfaceC1364105Vn<? super T> r12) {
        /*
            Method dump skipped, instruction units count: 205
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.showcase.profile.TabCommerceFragmentImpl.GS(X.0vcc, kotlin.jvm.functions.Function1, X.05Vn):java.lang.Object");
    }
}
