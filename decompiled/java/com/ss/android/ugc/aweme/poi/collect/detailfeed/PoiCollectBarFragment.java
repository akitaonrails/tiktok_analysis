package com.ss.android.ugc.aweme.poi.collect.detailfeed;

import X.C01GW;
import X.C098200Yq;
import X.C1185410gx9;
import X.C1188530h2B;
import X.C1685300txQ;
import X.C189200o6;
import X.C19EG;
import X.C19GS;
import X.C452501pT;
import X.C723850SaN;
import X.C786410Ut5;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.ies.foundation.fragment.BaseFragment;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.poi.detail.container.model.PoiGeneralCommonParams;
import com.zhiliaoapp.musically.R;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS206S0000000_18;
import kotlin.jvm.internal.AwS597S0100000_18;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class PoiCollectBarFragment extends BaseFragment {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZjUjIGEwJykgLCHELIOSwnZiEpPS46JCMpLCt9GColCiA/JCAvPQ0yOgM+KCg+LSs4";
    public String LLIZ;
    public boolean LLJ;
    public String LLJI;
    public C1188530h2B LLJIJIL;
    public C1185410gx9 LLJILJIL;
    public int LLJILLL;
    public String LLJJ;
    public String LLJJI;
    public String LLJJIII;
    public String LLJJIJI;
    public Boolean LLJJIJIIJIL;
    public List<String> LLJJIJIL;
    public List<String> LLJJJ;
    public PoiGeneralCommonParams LLJJJIL;
    public Map<String, String> LLJJJJ;
    public Map<String, String> LLJJJJJIL;
    public String LLIZLLLIL = "";
    public final C01GW LLJILJILJ = C452501pT.LIZIZ(AFwS206S0000000_18.get$arr$(285));

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        Map<String, String> map;
        super.onCreate(bundle);
        if (bundle != null) {
            String string = bundle.getString("poi_id");
            if (string != null) {
                this.LLIZ = string;
            }
            String string2 = bundle.getString("poi_name");
            if (string2 != null) {
                this.LLIZLLLIL = string2;
            }
            this.LLJ = bundle.getBoolean("is_collected");
            String string3 = bundle.getString("poi_address");
            if (string3 != null) {
                this.LLJI = string3;
            }
            Serializable serializable = bundle.getSerializable("poi_collect_mo_data");
            if (serializable != null) {
                this.LLJIJIL = (C1188530h2B) serializable;
            }
            Serializable serializable2 = bundle.getSerializable("poi_detail_params");
            if (serializable2 != null) {
                this.LLJILJIL = (C1185410gx9) serializable2;
            }
            this.LLJILLL = bundle.getInt("post_bottom_bar_style", 0);
            String string4 = bundle.getString("video_from");
            if (string4 != null) {
                this.LLJJ = string4;
            }
            String string5 = bundle.getString("poi_session_id");
            if (string5 != null) {
                this.LLJJI = string5;
            }
            String string6 = bundle.getString("poi_enter_from");
            if (string6 != null) {
                this.LLJJIII = string6;
            }
            String string7 = bundle.getString("ad_click_id");
            if (string7 != null) {
                this.LLJJIJI = string7;
            }
            this.LLJJIJIIJIL = Boolean.valueOf(bundle.getBoolean("privacy_auth_status_query_required", false));
            ArrayList<String> stringArrayList = bundle.getStringArrayList("source_product_ids");
            if (stringArrayList != null) {
                this.LLJJJ = stringArrayList;
            }
            ArrayList<String> stringArrayList2 = bundle.getStringArrayList("source_merchant_ids");
            if (stringArrayList2 != null) {
                this.LLJJIJIL = stringArrayList2;
            }
            Serializable serializable3 = bundle.getSerializable("common_mob_params");
            if (serializable3 != null) {
                this.LLJJJIL = (PoiGeneralCommonParams) serializable3;
            }
            Serializable serializable4 = bundle.getSerializable("poi_router_params");
            Map<String, String> map2 = null;
            if (serializable4 != null) {
                if (serializable4 instanceof Map) {
                    map = (Map) serializable4;
                } else {
                    map = null;
                }
                this.LLJJJJ = map;
            }
            Serializable serializable5 = bundle.getSerializable("poi_general_track_params");
            if (serializable5 != null) {
                if (serializable5 instanceof Map) {
                    map2 = (Map) serializable5;
                }
                this.LLJJJJJIL = map2;
            }
        }
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        ArrayList arrayList;
        ArrayList arrayList2;
        Serializable serializable;
        super.onSaveInstanceState(bundle);
        C786410Ut5.LJJJI("poi_id", this.LLIZ, bundle);
        C786410Ut5.LJJJI("poi_name", this.LLIZLLLIL, bundle);
        bundle.putBoolean("is_collected", this.LLJ);
        C786410Ut5.LJJJI("poi_address", this.LLJI, bundle);
        C786410Ut5.LJJIZ(bundle, "poi_collect_mo_data", this.LLJIJIL);
        C786410Ut5.LJJIZ(bundle, "poi_detail_params", this.LLJILJIL);
        bundle.putInt("post_bottom_bar_style", this.LLJILLL);
        C786410Ut5.LJJJI("video_from", this.LLJJ, bundle);
        C786410Ut5.LJJJI("poi_session_id", this.LLJJI, bundle);
        C786410Ut5.LJJJI("poi_enter_from", this.LLJJIII, bundle);
        C786410Ut5.LJJJI("ad_click_id", this.LLJJIJI, bundle);
        bundle.putBoolean("privacy_auth_status_query_required", Intrinsics.LJFF(this.LLJJIJIIJIL, Boolean.TRUE));
        List<String> list = this.LLJJJ;
        Serializable serializable2 = null;
        if (list instanceof ArrayList) {
            arrayList = (ArrayList) list;
        } else {
            arrayList = null;
        }
        C786410Ut5.LJJJIL(bundle, "source_product_ids", arrayList);
        List<String> list2 = this.LLJJIJIL;
        if (list2 instanceof ArrayList) {
            arrayList2 = (ArrayList) list2;
        } else {
            arrayList2 = null;
        }
        C786410Ut5.LJJJIL(bundle, "source_merchant_ids", arrayList2);
        C786410Ut5.LJJIZ(bundle, "common_mob_params", this.LLJJJIL);
        Map<String, String> map = this.LLJJJJ;
        if (map instanceof Serializable) {
            serializable = (Serializable) map;
        } else {
            serializable = null;
        }
        C786410Ut5.LJJIZ(bundle, "poi_router_params", serializable);
        Map<String, String> map2 = this.LLJJJJJIL;
        if (map2 instanceof Serializable) {
            serializable2 = (Serializable) map2;
        }
        C786410Ut5.LJJIZ(bundle, "poi_general_track_params", serializable2);
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        C723850SaN.LIZ(this, false, null, new AwS597S0100000_18(this, 252), 3);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        FrameLayout frameLayout;
        Context context = getContext();
        C19GS c19gs = null;
        if (context != null) {
            frameLayout = new FrameLayout(context);
            frameLayout.setId(((Number) this.LLJILJILJ.getValue()).intValue());
        } else {
            frameLayout = null;
        }
        if (!(frameLayout instanceof View)) {
            frameLayout = null;
        }
        if (frameLayout != null) {
            try {
                ViewTreeLifecycleOwner.set(frameLayout, getViewLifecycleOwner());
                ViewTreeViewModelStoreOwner.set(frameLayout, this);
                frameLayout.setTag(R.id.view_tree_saved_state_registry_owner, this);
                C19EG activity = getActivity();
                if (activity instanceof C19GS) {
                    c19gs = (C19GS) activity;
                }
                C1685300txQ.LIZ(c19gs);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
                return frameLayout;
            }
        }
        C189200o6.m2constructorimpl(Unit.LIZ);
        return frameLayout;
    }
}
