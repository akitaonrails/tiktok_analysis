package com.ss.android.ugc.aweme.music.search;

import X.C098200Yq;
import X.C1685300txQ;
import X.C189200o6;
import X.C19EG;
import X.C19GS;
import X.C446760HfW;
import X.C447520Hgk;
import X.C632210Oqx;
import X.C723850SaN;
import X.C786410Ut5;
import X.InterfaceC634010Otr;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.ies.foundation.fragment.BaseFragment;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS236S0000000_6;
import kotlin.jvm.internal.AwS585S0100000_6;

/* JADX INFO: loaded from: classes7.dex */
public final class SearchMusicFragment extends BaseFragment implements InterfaceC634010Otr {
    public static final C446760HfW LLIZ = new Object() { // from class: X.0HfW
    };
    public static final int LLIZLLLIL = 8;
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2Zig5OiHELIOSYwZjYpKD0wIGsfLC4hKy0BPDw6KwM+KCg+LSs4";

    @Override // X.InterfaceC634010Otr, X.InterfaceC724720Sbm, X.InterfaceC723730SaB
    public /* bridge */ /* synthetic */ String LIZ() {
        return null;
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return VR(this, layoutInflater, viewGroup, bundle);
    }

    private final boolean SR() {
        C632210Oqx.LIZ.getClass();
        return !C632210Oqx.LJFF();
    }

    @Override // X.InterfaceC724720Sbm
    /* JADX INFO: renamed from: WR, reason: merged with bridge method [inline-methods] */
    public C447520Hgk lt() {
        Bundle arguments = getArguments();
        String string = arguments != null ? arguments.getString("user_id") : null;
        Bundle arguments2 = getArguments();
        String string2 = arguments2 != null ? arguments2.getString("sec_user_id") : null;
        Bundle arguments3 = getArguments();
        return new C447520Hgk(string, string2, (SearchPinnedMusicList) (arguments3 != null ? arguments3.getSerializable("pinned_music_list") : null));
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        NR(AFwS236S0000000_6.get$arr$(237));
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        C723850SaN.LIZ(this, false, null, new AwS585S0100000_6(this, 133), 3);
    }

    public View UR(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return C786410Ut5.Td(layoutInflater, R.layout.edq, viewGroup, false);
    }

    public static View VR(SearchMusicFragment searchMusicFragment, LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewUR = searchMusicFragment.UR(layoutInflater, viewGroup, bundle);
        C19GS c19gs = null;
        if (!(viewUR instanceof View)) {
            viewUR = null;
        }
        if (viewUR != null) {
            try {
                ViewTreeLifecycleOwner.set(viewUR, searchMusicFragment.getViewLifecycleOwner());
                ViewTreeViewModelStoreOwner.set(viewUR, searchMusicFragment);
                viewUR.setTag(R.id.view_tree_saved_state_registry_owner, searchMusicFragment);
                C19EG activity = searchMusicFragment.getActivity();
                if (activity instanceof C19GS) {
                    c19gs = (C19GS) activity;
                }
                C1685300txQ.LIZ(c19gs);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
                return viewUR;
            }
        }
        C189200o6.m2constructorimpl(Unit.LIZ);
        return viewUR;
    }
}
