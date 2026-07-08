package com.ss.android.ugc.aweme.commerce.challenge;

import X.C098200Yq;
import X.C0HF8;
import X.C1037220d68;
import X.C1055720dZy;
import X.C14EU;
import X.C1685300txQ;
import X.C189200o6;
import X.C1944507jX;
import X.C1944607jY;
import X.C19EG;
import X.C19GS;
import X.C341940Daq;
import X.C484220Iyq;
import X.C786410Ut5;
import X.InterfaceC1055740da0;
import X.InterfaceC19400810vG;
import X.SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.k;
import com.google.gson.m;
import com.google.gson.n;
import com.google.gson.p;
import com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.ThreadMode;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes17.dex */
public final class CommerceChallengeFragment extends AmeBaseFragment implements InterfaceC19400810vG, InterfaceC1055740da0 {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiYjJCI2OiYpZyHELIOSw7KSkgLCE0LWsPJiI+LTcvLAw7KSkgLCE0LQM+KCg+LSs4";
    public C1055720dZy LL;
    public final Rect LLILLJJLI = new Rect();
    public boolean LLILLL = true;
    public String LLILZ;
    public String LLILZIL;
    public C0HF8 LLILZLL;
    public String LLIZ;

    @Override // X.InterfaceC19400810vG
    public final void Bp() {
    }

    @Override // X.InterfaceC19400810vG
    public final /* synthetic */ void Jo(boolean z) {
    }

    @Override // X.InterfaceC19400810vG
    public final /* synthetic */ void LJLJLLL(String str) {
    }

    @Override // X.InterfaceC19400810vG
    public final /* synthetic */ void cb(boolean z, boolean z2) {
    }

    @Override // X.InterfaceC19400810vG
    public final void refresh() {
        this.LLILLL = false;
        String str = this.LLIZ;
        if (str != null) {
            C1944607jY c1944607jYLIZ = C1944507jX.LIZ(str);
            String str2 = this.LLILZ;
            if (str2 == null) {
                str2 = "";
            }
            c1944607jYLIZ.LIZ("challenge_id", str2);
            String string = c1944607jYLIZ.LIZIZ().toString();
            C0HF8 c0hf8 = this.LLILZLL;
            if (c0hf8 != null) {
                c0hf8.LL = string;
                c0hf8.notifyDataSetChanged();
            }
        }
    }

    public final C1055720dZy MR() {
        View viewFindViewById = this.LL;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.t0q) : null;
            this.LL = (C1055720dZy) viewFindViewById;
        }
        return (C1055720dZy) viewFindViewById;
    }

    public final C1037220d68 NR() {
        C0HF8 c0hf8 = this.LLILZLL;
        if (c0hf8 != null) {
            return c0hf8.LLILZ;
        }
        return null;
    }

    @Override // X.InterfaceC1055740da0
    public final String getTitle() {
        String str = this.LLILZIL;
        return str == null ? "" : str;
    }

    @Override // X.InterfaceC19400810vG
    public final void K() {
        RecyclerView.LayoutManager layoutManager;
        C1055720dZy c1055720dZyMR = MR();
        if (c1055720dZyMR == null || (layoutManager = c1055720dZyMR.getLayoutManager()) == null) {
            return;
        }
        layoutManager.scrollToPosition(0);
    }

    @Override // X.InterfaceC19400810vG, X.InterfaceC1258040iqI
    public final View LJJLIIIJILLIZJL() {
        return MR();
    }

    public final void OR() {
        C1037220d68 c1037220d68NR;
        C1037220d68 c1037220d68NR2 = NR();
        if (c1037220d68NR2 == null || !c1037220d68NR2.getGlobalVisibleRect(this.LLILLJJLI) || (c1037220d68NR = NR()) == null) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("height", C341940Daq.LIZIZ(this.LLILLJJLI.height()));
        c1037220d68NR.LIZIZ("brand_room_show", jSONObject);
    }

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        RecyclerView.LayoutManager layoutManager;
        C1037220d68 c1037220d68;
        SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB;
        super.onDestroyView();
        C1055720dZy c1055720dZyMR = MR();
        if (c1055720dZyMR != null && (layoutManager = c1055720dZyMR.getLayoutManager()) != null) {
            int childCount = layoutManager.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View viewFindViewByPosition = layoutManager.findViewByPosition(i);
                if ((viewFindViewByPosition instanceof C1037220d68) && (c1037220d68 = (C1037220d68) viewFindViewByPosition) != null && (sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB = c1037220d68.LL) != null) {
                    SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB.LJIL(sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB);
                }
            }
        }
        EventBus.LIZLLL().LJJI(this);
        this.LL = null;
    }

    @Override // X.InterfaceC19400810vG
    public final boolean bo() {
        return this.LLILLL;
    }

    @Override // X.InterfaceC19400810vG
    public final void b7(String str) {
        this.LLILZ = str;
    }

    @C14EU(threadMode = ThreadMode.MAIN)
    public final void onJsBroadcast(C484220Iyq c484220Iyq) throws JSONException {
        boolean z;
        C1037220d68 c1037220d68NR;
        C1037220d68 c1037220d68NR2;
        C1037220d68 c1037220d68NR3 = NR();
        String containerId = null;
        if (c1037220d68NR3 != null) {
            containerId = c1037220d68NR3.getContainerId();
        }
        if (Intrinsics.LJFF(containerId, JSONObjectProtectorUtils.getString(c484220Iyq.LIZ, "reactId")) && (c1037220d68NR2 = NR()) != null && c1037220d68NR2.getGlobalVisibleRect(this.LLILLJJLI)) {
            z = true;
        } else {
            z = false;
        }
        String string = JSONObjectProtectorUtils.getString(c484220Iyq.LIZ, "eventName");
        if (string != null && Intrinsics.LJFF(string, "brand_room_loaded") && z && (c1037220d68NR = NR()) != null) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("height", C341940Daq.LIZIZ(this.LLILLJJLI.height()));
            c1037220d68NR.LIZIZ("brand_room_show", jSONObject);
        }
    }

    @C14EU(threadMode = ThreadMode.MAIN)
    public final void top(C484220Iyq c484220Iyq) {
        boolean zLJFF;
        String strLJIL;
        k kVarLJJIIZ;
        String containerId;
        n nVarLJIILIIL = GsonProtectorUtils.parse(new p(), C786410Ut5.J3(c484220Iyq.LIZ)).LJIILIIL();
        k kVarLJJIIZ2 = nVarLJIILIIL.LJJIIZ("data");
        if (kVarLJJIIZ2 != null && !(kVarLJJIIZ2 instanceof m) && (kVarLJJIIZ = kVarLJJIIZ2.LJIILIIL().LJJIIZ("reactId")) != null && !(kVarLJJIIZ instanceof m)) {
            String strLJIL2 = kVarLJJIIZ.LJIL();
            C1037220d68 c1037220d68NR = NR();
            if (c1037220d68NR == null || (containerId = c1037220d68NR.getContainerId()) == null) {
                containerId = "";
            }
            zLJFF = Intrinsics.LJFF(strLJIL2, containerId);
        } else {
            zLJFF = false;
        }
        Boolean boolValueOf = Boolean.valueOf(zLJFF);
        if (boolValueOf.booleanValue()) {
            boolValueOf.booleanValue();
            k kVarLJJIIZ3 = nVarLJIILIIL.LJJIIZ("eventName");
            if (kVarLJJIIZ3 != null && (strLJIL = kVarLJJIIZ3.LJIL()) != null) {
                if (Intrinsics.LJFF(strLJIL, "mp_tab_top_arrived") || Intrinsics.LJFF(strLJIL, "mp_tab_top_left")) {
                    if (Intrinsics.LJFF(strLJIL, "mp_tab_top_arrived")) {
                        MR().getEnterTabManager().LIZ = true;
                    } else {
                        if (!Intrinsics.LJFF(strLJIL, "mp_tab_top_left")) {
                            return;
                        }
                        MR().getEnterTabManager().LIZ = false;
                    }
                }
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        MR().setLayoutManager(new LinearLayoutManager(getActivity()) { // from class: com.ss.android.ugc.aweme.commerce.challenge.CommerceChallengeFragment.onViewCreated.1
            @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
            public final boolean canScrollHorizontally() {
                return false;
            }

            @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
            public final boolean canScrollVertically() {
                return false;
            }
        });
        this.LLILZLL = new C0HF8(this);
        MR().setAdapter(this.LLILZLL);
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        EventBus.LIZLLL().LJIJJ(this);
        C19GS c19gs = null;
        View viewSd = C786410Ut5.Sd(R.layout.c8j, C786410Ut5.ne(getActivity()), null);
        if (!(viewSd instanceof View)) {
            viewSd = null;
        }
        if (viewSd != null) {
            try {
                ViewTreeLifecycleOwner.set(viewSd, getViewLifecycleOwner());
                ViewTreeViewModelStoreOwner.set(viewSd, this);
                viewSd.setTag(R.id.view_tree_saved_state_registry_owner, this);
                C19EG activity = getActivity();
                if (activity instanceof C19GS) {
                    c19gs = (C19GS) activity;
                }
                C1685300txQ.LIZ(c19gs);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
                return viewSd;
            }
        }
        C189200o6.m2constructorimpl(Unit.LIZ);
        return viewSd;
    }
}
