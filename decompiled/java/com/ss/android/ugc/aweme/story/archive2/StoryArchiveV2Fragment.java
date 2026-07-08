package com.ss.android.ugc.aweme.story.archive2;

import X.C01GW;
import X.C098200Yq;
import X.C0LAB;
import X.C1173900gea;
import X.C1220000hqw;
import X.C1308910kAL;
import X.C13LE;
import X.C1685300txQ;
import X.C189200o6;
import X.C19EG;
import X.C19GS;
import X.C20684815ws;
import X.C287100BNc;
import X.C338520DOw;
import X.C451460Hn6;
import X.C451620HnM;
import X.C452070Ho5;
import X.C723850SaN;
import X.C724750Sbp;
import X.C736950SvV;
import X.C786410Ut5;
import X.InterfaceC836760Ws6;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.ies.foundation.fragment.BaseFragment;
import com.bytedance.router.arg.RouteArgExtension;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS256S0000000_18;
import kotlin.jvm.internal.AwS581S0100000_2;

/* JADX INFO: loaded from: classes19.dex */
@InterfaceC836760Ws6
public final class StoryArchiveV2Fragment extends BaseFragment {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZjY4Jj0qZiHELIOSQ+Kic6PiB+ZxwnJzc1CD0wICw6LBlhDjctLiI2JjE=";
    public final C01GW LLIZ = RouteArgExtension.INSTANCE.optionalArgNotNull(this, AFwS256S0000000_18.get$arr$(763), "is_enter_from_gallery", Boolean.class);
    public final C01GW LLIZLLLIL = RouteArgExtension.INSTANCE.optionalArgNotNull(this, AFwS256S0000000_18.get$arr$(762), "enter_from", String.class);
    public final C736950SvV LLJ = new C736950SvV(C13LE.LIZ(StoryArchiveV2ArchiveViewModel.class), null, new C452070Ho5(), C724750Sbp.LJII(this), C1220000hqw.LIZ(this), AFwS256S0000000_18.get$arr$(764), new C451460Hn6(this, false), new C451620HnM(this, true), new C338520DOw(this));

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        String str;
        String str2;
        Integer numLIZJ;
        Window window;
        Window window2;
        super.onCreate(bundle);
        C19EG activity = getActivity();
        if (activity != null) {
            activity.setTheme(R.style.y0);
        }
        Context context = getContext();
        if (context != null && (numLIZJ = C1308910kAL.LIZJ(R.attr.e1, context)) != null) {
            int iIntValue = numLIZJ.intValue();
            C19EG activity2 = getActivity();
            if (activity2 != null && (window2 = activity2.getWindow()) != null) {
                window2.setStatusBarColor(iIntValue);
            }
            C19EG activity3 = getActivity();
            if (activity3 != null && (window = activity3.getWindow()) != null) {
                window.setNavigationBarColor(iIntValue);
            }
        }
        ((StoryArchiveV2ArchiveViewModel) this.LLJ.getValue()).LLILLL = (String) this.LLIZLLLIL.getValue();
        ((StoryArchiveV2ArchiveViewModel) this.LLJ.getValue()).LLILZ = ((Boolean) this.LLIZ.getValue()).booleanValue();
        C1173900gea c1173900gea = C1173900gea.LIZ;
        boolean zBooleanValue = ((Boolean) this.LLIZ.getValue()).booleanValue();
        c1173900gea.getClass();
        if (C287100BNc.LIZ()) {
            str = "calendar_tab";
        } else {
            str = "story_tab";
        }
        C0LAB c0lab = new C0LAB();
        if (zBooleanValue) {
            str2 = "upload_page";
        } else {
            str2 = "personal_homepage";
        }
        c0lab.LJ("position", str2);
        c0lab.LJ("tab_name", str);
        C20684815ws.LJIILLIIL("enter_story_archive_page", c0lab.LIZ);
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        C723850SaN.LIZ(this, false, null, new AwS581S0100000_2(this, 315), 3);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.fax, viewGroup, false);
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
