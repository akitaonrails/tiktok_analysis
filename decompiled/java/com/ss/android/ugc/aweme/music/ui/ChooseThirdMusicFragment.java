package com.ss.android.ugc.aweme.music.ui;

import X.C098200Yq;
import X.C1685300txQ;
import X.C189200o6;
import X.C19EG;
import X.C19GS;
import X.C531070KsD;
import X.C630790Oof;
import X.C723850SaN;
import X.ViewOnAttachStateChangeListenerC20604515jv;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.ies.foundation.fragment.BaseFragment;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.music.model.ExternalMusicInfo;
import com.zhiliaoapp.musically.R;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.internal.AwS598S0100000_19;

/* JADX INFO: loaded from: classes20.dex */
public final class ChooseThirdMusicFragment extends BaseFragment {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2Zig5OiYwHELIOSZjAlZww7Jyo/LBs7ITcoBDogISYKOy40JSAiPQ==";
    public ViewOnAttachStateChangeListenerC20604515jv LLIZ;
    public List<ExternalMusicInfo> LLIZLLLIL;
    public boolean LLJ;
    public String LLJI;
    public String LLJIJIL;
    public String LLJILJIL;
    public String LLJILJILJ;
    public String LLJILLL;
    public String LLJJ;
    public int LLJJI;
    public Map<String, String> LLJJIII;
    public C630790Oof LLJJIJI;

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.LLIZ = null;
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        Serializable serializable;
        boolean z;
        String string;
        String string2;
        String string3;
        String string4;
        String string5;
        Serializable serializable2;
        Map<String, String> map;
        Serializable serializable3;
        String string6;
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        C630790Oof c630790Oof = null;
        if (arguments != null) {
            serializable = arguments.getSerializable("music_info_list");
        } else {
            serializable = null;
        }
        this.LLIZLLLIL = (ArrayList) serializable;
        Bundle arguments2 = getArguments();
        int i = 0;
        if (arguments2 != null) {
            z = arguments2.getBoolean("is_exclusive_resso");
        } else {
            z = false;
        }
        this.LLJ = z;
        Bundle arguments3 = getArguments();
        String str = "";
        if (arguments3 == null || (string = arguments3.getString("process_id")) == null) {
            string = "";
        }
        this.LLJI = string;
        Bundle arguments4 = getArguments();
        if (arguments4 == null || (string2 = arguments4.getString("music_id")) == null) {
            string2 = "";
        }
        this.LLJIJIL = string2;
        Bundle arguments5 = getArguments();
        if (arguments5 == null || (string3 = arguments5.getString("group_id")) == null) {
            string3 = "";
        }
        this.LLJILJIL = string3;
        Bundle arguments6 = getArguments();
        if (arguments6 == null || (string4 = arguments6.getString("request_id")) == null) {
            string4 = "";
        }
        this.LLJILJILJ = string4;
        Bundle arguments7 = getArguments();
        if (arguments7 == null || (string5 = arguments7.getString("show_type")) == null) {
            string5 = "";
        }
        this.LLJILLL = string5;
        Bundle arguments8 = getArguments();
        if (arguments8 != null && (string6 = arguments8.getString("music_from")) != null) {
            str = string6;
        }
        this.LLJJ = str;
        Bundle arguments9 = getArguments();
        if (arguments9 != null) {
            i = arguments9.getInt("enter_from");
        }
        this.LLJJI = i;
        Bundle arguments10 = getArguments();
        if (arguments10 != null) {
            serializable2 = arguments10.getSerializable("log_extra");
        } else {
            serializable2 = null;
        }
        if (serializable2 instanceof Map) {
            map = (Map) serializable2;
        } else {
            map = null;
        }
        this.LLJJIII = map;
        Bundle arguments11 = getArguments();
        if (arguments11 != null) {
            serializable3 = arguments11.getSerializable("simple_music_data");
        } else {
            serializable3 = null;
        }
        if (serializable3 instanceof C630790Oof) {
            c630790Oof = (C630790Oof) serializable3;
        }
        this.LLJJIJI = c630790Oof;
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        C723850SaN.LIZ(this, false, null, new AwS598S0100000_19(this, 193), 3);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewLIZ = C531070KsD.LIZ(getActivity(), R.layout.dr3, layoutInflater, viewGroup);
        C19GS c19gs = null;
        if (!(viewLIZ instanceof View)) {
            viewLIZ = null;
        }
        if (viewLIZ != null) {
            try {
                ViewTreeLifecycleOwner.set(viewLIZ, getViewLifecycleOwner());
                ViewTreeViewModelStoreOwner.set(viewLIZ, this);
                viewLIZ.setTag(R.id.view_tree_saved_state_registry_owner, this);
                C19EG activity = getActivity();
                if (activity instanceof C19GS) {
                    c19gs = (C19GS) activity;
                }
                C1685300txQ.LIZ(c19gs);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
                return viewLIZ;
            }
        }
        C189200o6.m2constructorimpl(Unit.LIZ);
        return viewLIZ;
    }
}
