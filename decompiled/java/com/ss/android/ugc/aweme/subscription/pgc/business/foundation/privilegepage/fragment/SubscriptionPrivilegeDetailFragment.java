package com.ss.android.ugc.aweme.subscription.pgc.business.foundation.privilegepage.fragment;

import X.AbstractC511920K5u;
import X.C01GW;
import X.C098200Yq;
import X.C0HE8;
import X.C0K0R;
import X.C0K1E;
import X.C0K1F;
import X.C0K5A;
import X.C0KXU;
import X.C1390410mHn;
import X.C1685300txQ;
import X.C16G0;
import X.C16GX;
import X.C189200o6;
import X.C19EG;
import X.C19GS;
import X.C19U0;
import X.C19U1;
import X.C2089408Gm;
import X.C2097608Jq;
import X.C452501pT;
import X.C510610K0t;
import X.C511520K4g;
import X.C511830K5l;
import X.C512050K6h;
import X.C786410Ut5;
import X.EnumC510710K1d;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.livesdk.chatroom.api.SubPackagePrivilege;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.subscription.pgc.api.bridge.SubscriptionSceneContext;
import com.ss.android.ugc.aweme.subscription.pgc.business.foundation.privilegepage.viewmodel.PrivilegeDetailViewModel;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.WeakHashMap;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS187S0000000_2;
import kotlin.jvm.internal.AFwS193S0000000_7;
import kotlin.jvm.internal.AwS550S0100000_6;
import kotlin.jvm.internal.AwS551S0100000_7;
import kotlin.jvm.internal.AwS586S0100000_7;

/* JADX INFO: loaded from: classes8.dex */
public final class SubscriptionPrivilegeDetailFragment extends AbsPrivilegeDetailBaseFragment {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZjY5KzwwOiw8PSY8Jms8Lix9KjA/ICE2OzZiLyAmJiEtPSY8HELIOSJms8OyYlISkpLiojKSIpZykhKSIhLCEnZhY5KzwwOiw8PSY8JhU+IDk6JCArLAs2PCQlJQkhKSIhLCEn";
    public ImageView LLLIZZ;
    public C16G0 LLLJ;
    public C1390410mHn LLLJIL;
    public ConstraintLayout LLLJL;
    public View LLLL;
    public TextView LLLLII;
    public View LLLLIIIILLL;
    public C19U1 LLLLIIL;
    public LinearLayout LLLLIILL;
    public int LLLLIILLL;
    public int LLLLIL;
    public Integer LLLLILI;
    public String LLLLJ;
    public final Map<String, Parcelable> LLLLJI;
    public boolean LLLLL;
    public String LLLLLIL;
    public PrivilegeDetailViewModel LLLLLILLIL;
    public String LLLLLJIL;
    public C510610K0t LLLLLJLJLL;
    public TextView LLLLLL;
    public ImageView LLLLLLIL;
    public View LLLLLLJ;
    public RecyclerView LLLLLLL;
    public RecyclerView LLLLLLLLL;
    public final C01GW LLLLLLLLLL;
    public final C01GW LLLLLLLZIL;
    public C19U1 LLLLLLZ;
    public C19U1 LLLLLLZZ;
    public View LLLLLZ;
    public FrameLayout LLLLLZIL;
    public boolean LLLLLZL;
    public C16GX LLLLZ;
    public final C01GW LLLLZI;
    public View LLLLZIL;
    public TextView LLLLZLL;
    public final C01GW LLLLZLLIL;

    static {
        new C0K5A();
    }

    @Override // com.ss.android.ugc.aweme.subscription.pgc.business.foundation.privilegepage.fragment.AbsPrivilegeDetailBaseFragment
    public final void bS() {
    }

    public final void ES() {
        C16GX c16gx;
        int paddingTop;
        if (this.LLILZ == EnumC510710K1d.FULL_PAGE && (c16gx = this.LLLLZ) != null) {
            Integer num = this.LLLLILI;
            if (num != null) {
                paddingTop = num.intValue();
            } else {
                paddingTop = c16gx.getPaddingTop();
                this.LLLLILI = Integer.valueOf(paddingTop);
            }
            if (getParentFragment() instanceof SubPrivilegeDetailFullPage) {
                c16gx.setPadding(c16gx.getPaddingLeft(), paddingTop, c16gx.getPaddingRight(), c16gx.getPaddingBottom());
            } else {
                c16gx.setPadding(c16gx.getPaddingLeft(), paddingTop + this.LLLLIILLL, c16gx.getPaddingRight(), c16gx.getPaddingBottom());
            }
        }
    }

    public final void FS() {
        C0KXU c0kxu;
        ViewGroup viewGroup = this.LLJJJIL;
        int measuredHeight = viewGroup != null ? viewGroup.getMeasuredHeight() : 0;
        ViewGroup viewGroup2 = this.LLJJJIL;
        int consumedBottomInset = measuredHeight - ((!(viewGroup2 instanceof C0KXU) || (c0kxu = (C0KXU) viewGroup2) == null) ? 0 : c0kxu.getConsumedBottomInset());
        if (consumedBottomInset < 0) {
            consumedBottomInset = 0;
        }
        ViewGroup viewGroup3 = this.LLLFF;
        int iMax = Math.max(consumedBottomInset, viewGroup3 != null ? viewGroup3.getMeasuredHeight() : 0) + (this.LLILZ == EnumC510710K1d.FULL_PAGE ? this.LLLLIL : 0);
        RecyclerView recyclerView = this.LLLLLLL;
        RecyclerView recyclerView2 = recyclerView != null ? recyclerView : null;
        recyclerView2.setPadding(recyclerView2.getPaddingLeft(), recyclerView2.getPaddingTop(), recyclerView2.getPaddingRight(), iMax);
        FrameLayout frameLayout = this.LLLLLZIL;
        if (frameLayout != null) {
            frameLayout.setPadding(frameLayout.getPaddingLeft(), frameLayout.getPaddingTop(), frameLayout.getPaddingRight(), iMax);
        }
    }

    public final String rS() {
        String string;
        EnumC510710K1d enumC510710K1d = this.LLILZ;
        if (enumC510710K1d != null && enumC510710K1d.isFullScreen()) {
            return "";
        }
        String str = this.LLJJIII;
        Pair[] pairArr = new Pair[2];
        pairArr[0] = new Pair("show_entrance", this.LLILZLL);
        SubscriptionSceneContext subscriptionSceneContext = this.LLJJI;
        if (subscriptionSceneContext == null || (string = Boolean.valueOf(subscriptionSceneContext.LIZ()).toString()) == null) {
            string = "false";
        }
        pairArr[1] = new Pair("preview_mode", string);
        return C2089408Gm.LIZ(str, "popup", C2097608Jq.LJIIIIZZ(pairArr));
    }

    public final C16G0 sS() {
        View viewFindViewById = this.LLLJ;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.eux) : null;
            this.LLLJ = (C16G0) viewFindViewById;
        }
        return (C16G0) viewFindViewById;
    }

    public final ConstraintLayout wS() {
        View viewFindViewById = this.LLLJL;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.ics) : null;
            this.LLLJL = (ConstraintLayout) viewFindViewById;
        }
        return (ConstraintLayout) viewFindViewById;
    }

    public final C1390410mHn yS() {
        View viewFindViewById = this.LLLJIL;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.nld) : null;
            this.LLLJIL = (C1390410mHn) viewFindViewById;
        }
        return (C1390410mHn) viewFindViewById;
    }

    public final PrivilegeDetailViewModel zS() {
        PrivilegeDetailViewModel privilegeDetailViewModel = this.LLLLLILLIL;
        if (privilegeDetailViewModel != null) {
            return privilegeDetailViewModel;
        }
        return null;
    }

    public SubscriptionPrivilegeDetailFragment() {
        C01GW c01gw = C511520K4g.LIZ;
        Resources.getSystem().getDisplayMetrics();
        this.LLLLJ = "";
        this.LLLLJI = new LinkedHashMap();
        this.LLLLLJIL = "";
        this.LLLLLLLLLL = C452501pT.LIZIZ(new AwS551S0100000_7(this, 460));
        this.LLLLLLLZIL = C452501pT.LIZIZ(AFwS193S0000000_7.get$arr$(179));
        this.LLLLZI = C452501pT.LIZIZ(new AwS550S0100000_6(this, 727));
        this.LLLLZLLIL = C452501pT.LIZIZ(AFwS187S0000000_2.get$arr$(681));
    }

    public final boolean GS() {
        return C511830K5l.LIZ(getContext());
    }

    @Override // com.ss.android.ugc.aweme.subscription.pgc.business.foundation.privilegepage.fragment.AbsPrivilegeDetailBaseFragment
    public final void PR() {
        View view;
        super.PR();
        Fragment parentFragment = getParentFragment();
        if (parentFragment == null || (view = parentFragment.getView()) == null) {
            return;
        }
        View viewFindViewById = view.findViewById(R.id.ojl);
        this.LLLLZIL = viewFindViewById;
        if (viewFindViewById != null) {
            C0K0R.LIZ(viewFindViewById);
        }
    }

    @Override // com.ss.android.ugc.aweme.subscription.pgc.business.foundation.privilegepage.fragment.AbsPrivilegeDetailBaseFragment
    public final int UR() {
        int size;
        PrivilegeDetailViewModel privilegeDetailViewModelZS = zS();
        if (privilegeDetailViewModelZS == null || (size = privilegeDetailViewModelZS.LLJJIJIL.size()) < 1) {
            return 1;
        }
        return size;
    }

    @Override // com.ss.android.ugc.aweme.subscription.pgc.business.foundation.privilegepage.fragment.AbsPrivilegeDetailBaseFragment
    public final PrivilegeDetailViewModel WR() {
        return zS();
    }

    @Override // com.ss.android.ugc.aweme.subscription.pgc.commonui.fragment.PgcBaseFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        C0K1F c0k1f = (C0K1F) this.LLLLZI.getValue();
        if (c0k1f == null || c0k1f.LIZ != 0) {
            if (this.LLLLZI.getValue() != null) {
                System.currentTimeMillis();
            }
            C0K1F c0k1f2 = (C0K1F) this.LLLLZI.getValue();
            if (c0k1f2 != null) {
                ((ArrayList) c0k1f2.LIZIZ).clear();
            }
        }
        WeakHashMap<Object, C0K1F> weakHashMap = C0K1E.LIZ;
        synchronized (weakHashMap) {
            try {
                weakHashMap.remove(this);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        this.LLLIZZ = null;
        this.LLLJ = null;
        this.LLLJIL = null;
        this.LLLJL = null;
        this.LLLL = null;
        this.LLLLII = null;
        this.LLLLIIIILLL = null;
        this.LLLLIIL = null;
        this.LLLLIILL = null;
    }

    public final SubPackagePrivilege uS() {
        PrivilegeDetailViewModel privilegeDetailViewModelZS = zS();
        if (privilegeDetailViewModelZS != null) {
            return privilegeDetailViewModelZS.vQ2();
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.subscription.pgc.business.foundation.privilegepage.fragment.AbsPrivilegeDetailBaseFragment, com.ss.android.ugc.aweme.subscription.pgc.commonui.fragment.PgcBaseFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
    }

    public static void qS(C19U1 c19u1) {
        ViewGroup viewGroup;
        c19u1.setPaddingRelative(0, 0, 0, 0);
        View childAt = c19u1.getChildAt(0);
        if ((childAt instanceof ViewGroup) && (viewGroup = (ViewGroup) childAt) != null) {
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                viewGroup.getChildAt(i).setPaddingRelative(0, 0, 0, 0);
            }
        }
    }

    public final void BS(C19U0 c19u0) {
        View viewFindViewById;
        View view = c19u0.LJFF;
        if (view != null && (viewFindViewById = view.findViewById(R.id.wxy)) != null) {
            C0K0R.LIZJ(viewFindViewById);
        }
    }

    @Override // com.ss.android.ugc.aweme.subscription.pgc.business.foundation.privilegepage.fragment.AbsPrivilegeDetailBaseFragment
    public final void hS(AbstractC511920K5u abstractC511920K5u) {
        if (this.LLILZ == EnumC510710K1d.FULL_PAGE) {
            AwS586S0100000_7 awS586S0100000_7 = new AwS586S0100000_7(this, 299);
            if ((abstractC511920K5u instanceof C512050K6h) && abstractC511920K5u != null) {
                awS586S0100000_7.invoke(abstractC511920K5u);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x006c  */
    @Override // com.ss.android.ugc.aweme.subscription.pgc.business.foundation.privilegepage.fragment.AbsPrivilegeDetailBaseFragment, com.ss.android.ugc.aweme.subscription.pgc.commonui.fragment.PgcBaseFragment, androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onCreate(android.os.Bundle r22) {
        /*
            Method dump skipped, instruction units count: 223
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.subscription.pgc.business.foundation.privilegepage.fragment.SubscriptionPrivilegeDetailFragment.onCreate(android.os.Bundle):void");
    }

    @Override // androidx.fragment.app.Fragment
    public final LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater layoutInflaterOnGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return layoutInflaterOnGetLayoutInflater.cloneInContext(C0HE8.LIZ(layoutInflaterOnGetLayoutInflater.getContext()));
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x0129 A[PHI: r0
      0x0129: PHI (r0v31 android.view.View) = (r0v30 android.view.View), (r0v99 android.view.View) binds: [B:35:0x0116, B:40:0x0127] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.ss.android.ugc.aweme.subscription.pgc.business.foundation.privilegepage.fragment.AbsPrivilegeDetailBaseFragment, com.ss.android.ugc.aweme.subscription.pgc.commonui.fragment.PgcBaseFragment, androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onViewCreated(android.view.View r14, android.os.Bundle r15) {
        /*
            Method dump skipped, instruction units count: 860
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.subscription.pgc.business.foundation.privilegepage.fragment.SubscriptionPrivilegeDetailFragment.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.fer, viewGroup, false);
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
