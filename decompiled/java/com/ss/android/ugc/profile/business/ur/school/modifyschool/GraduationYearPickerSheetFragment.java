package com.ss.android.ugc.profile.business.ur.school.modifyschool;

import X.C019F;
import X.C01D1;
import X.C098200Yq;
import X.C0DOI;
import X.C0OM1;
import X.C1229200i5m;
import X.C1250250idj;
import X.C1251150ifB;
import X.C13LE;
import X.C13LQ;
import X.C1622206Wu;
import X.C1685300txQ;
import X.C189200o6;
import X.C197039127h;
import X.C19719912Dl;
import X.C19EG;
import X.C19GS;
import X.C2217381BqS;
import X.C338490DOt;
import X.C451460Hn6;
import X.C451620HnM;
import X.C451650HnP;
import X.C452070Ho5;
import X.C724750Sbp;
import X.C786410Ut5;
import X.C987103tV;
import X.InterfaceC2217461Bqa;
import X.InterfaceC344240DeY;
import X.InterfaceC451590HnJ;
import X.InterfaceC724760Sbq;
import Y.ACListenerS139S0100000_4;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.ies.foundation.fragment.BaseFragment;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.profile.business.ur.school.utils.YearPickerViewModel;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS232S0000000_4;
import kotlin.jvm.internal.AwS548S0100000_4;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class GraduationYearPickerSheetFragment extends BaseFragment implements InterfaceC344240DeY {
    public static final C0DOI LLJIJIL;
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJILJIL;
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZjU+Jik6JCBiKzogISspOjx9PTdiOiw7JyogZyHELIOSI8LCwqMDwwICojJWEUOiQoPC4nISoiECoyOhUlKiQ2OhYkLConDjctLiI2JjE=";
    public final boolean LLIZ;
    public final boolean LLIZLLLIL;
    public final AssemVMLazy LLJ;
    public FrameLayout LLJI;

    /* JADX WARN: Type inference failed for: r0v3, types: [X.0DOI] */
    static {
        C2217381BqS c2217381BqS = new C2217381BqS(GraduationYearPickerSheetFragment.class, "yearPickerVM", "getYearPickerVM()Lcom/ss/android/ugc/profile/business/ur/school/utils/YearPickerViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJILJIL = new InterfaceC2217461Bqa[]{c2217381BqS};
        LLJIJIL = new Object() { // from class: X.0DOI
        };
    }

    public GraduationYearPickerSheetFragment() {
        this(false, false);
    }

    @Override // X.InterfaceC344240DeY
    public final C0OM1 Sn() {
        C0OM1 c0om1 = new C0OM1();
        C1250250idj c1250250idj = new C1250250idj();
        c1250250idj.LIZJ = getString(this.LLIZLLLIL ? 2131846925 : 2131846868);
        c0om1.LIZJ = c1250250idj;
        C1251150ifB c1251150ifB = new C1251150ifB();
        c1251150ifB.LIZLLL();
        c1251150ifB.LIZJ = R.raw.icon_x_mark_small;
        c1251150ifB.LIZJ(new AwS548S0100000_4(this, 356));
        c0om1.LIZIZ(c1251150ifB);
        return c0om1;
    }

    public GraduationYearPickerSheetFragment(boolean z, boolean z2) {
        AssemVMLazy assemVMLazy;
        this.LLIZ = z;
        this.LLIZLLLIL = z2;
        InterfaceC724760Sbq interfaceC724760Sbq = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(YearPickerViewModel.class);
        AwS548S0100000_4 awS548S0100000_4 = new AwS548S0100000_4(c19719912DlLIZ, 359);
        AFwS232S0000000_4 aFwS232S0000000_4 = AFwS232S0000000_4.get$arr$(126);
        if (Intrinsics.LJFF(interfaceC724760Sbq, C01D1.LIZ)) {
            assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ), awS548S0100000_4, new C452070Ho5(), new C1622206Wu(this, true), new C338490DOt(this, true), new AwS548S0100000_4((HasDefaultViewModelProviderFactory) this, 360), aFwS232S0000000_4, new C451460Hn6(this, true), new C451620HnM(this, true), new C987103tV(this, true));
        } else if (interfaceC724760Sbq instanceof InterfaceC451590HnJ) {
            assemVMLazy = C451650HnP.LIZ(this, (InterfaceC451590HnJ) interfaceC724760Sbq, C724750Sbp.LJIIJ(this, c19719912DlLIZ), awS548S0100000_4, new AwS548S0100000_4((Fragment) this, 361), aFwS232S0000000_4, null, null, null);
        } else if (Intrinsics.LJFF(interfaceC724760Sbq, interfaceC724760Sbq)) {
            assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ), awS548S0100000_4, new C452070Ho5(), C724750Sbp.LJII(this), C724750Sbp.LJIIIZ(this), new AwS548S0100000_4((HasDefaultViewModelProviderFactory) this, 362), aFwS232S0000000_4, new C451460Hn6(this, false), new C451620HnM(this, false), new C987103tV(this, false));
        } else {
            throw new IllegalArgumentException("Do not support this scope here.");
        }
        this.LLJ = assemVMLazy;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0032  */
    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onViewCreated(android.view.View r6, android.os.Bundle r7) {
        /*
            r5 = this;
            super.onViewCreated(r6, r7)
            android.os.Bundle r0 = r5.getArguments()
            java.lang.String r2 = "GraduationYearInputChosenYear"
            r4 = 0
            if (r0 == 0) goto L32
            boolean r1 = r0.containsKey(r2)
            r0 = 1
            if (r1 != r0) goto L32
        L13:
            r3 = 0
            if (r0 == 0) goto L30
            android.os.Bundle r0 = r5.getArguments()
            if (r0 == 0) goto L30
            int r0 = r0.getInt(r2)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
        L24:
            kotlin.jvm.internal.AwS368S0200000_2 r1 = new kotlin.jvm.internal.AwS368S0200000_2
            r0 = 72
            r1.<init>(r5, r2, r0)
            r0 = 3
            X.C723850SaN.LIZ(r5, r4, r3, r1, r0)
            return
        L30:
            r2 = r3
            goto L24
        L32:
            r0 = 0
            goto L13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.profile.business.ur.school.modifyschool.GraduationYearPickerSheetFragment.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i;
        FrameLayout frameLayout = new FrameLayout(requireContext());
        frameLayout.setId(View.generateViewId());
        this.LLJI = frameLayout;
        View[] viewArr = {frameLayout};
        AwS548S0100000_4 awS548S0100000_4 = new AwS548S0100000_4(this, 357);
        AwS548S0100000_4 awS548S0100000_42 = new AwS548S0100000_4(this, 358);
        boolean z = this.LLIZ;
        Context context = ((View) C13LQ.LJIL(viewArr)).getContext();
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.addView(viewArr[0]);
        LinearLayout linearLayout2 = new LinearLayout(context);
        C19GS c19gs = null;
        C197039127h c197039127h = new C197039127h(context, null, 6, 0);
        if (z) {
            i = 2131846865;
        } else {
            i = 2131846866;
        }
        c197039127h.setText(i);
        c197039127h.setButtonSize(3);
        c197039127h.setButtonVariant(1);
        C786410Ut5.U8(c197039127h, new ACListenerS139S0100000_4(awS548S0100000_4, 97));
        linearLayout2.addView(c197039127h, new LinearLayout.LayoutParams(0, -2, 1.0f));
        C197039127h c197039127h2 = new C197039127h(context, null, 6, 0);
        c197039127h2.setText(2131846864);
        c197039127h2.setButtonSize(3);
        c197039127h2.setButtonVariant(0);
        C786410Ut5.U8(c197039127h2, new ACListenerS139S0100000_4(awS548S0100000_42, 98));
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(0, -2, 1.0f);
        layoutParams.setMarginStart(((Number) C1229200i5m.LIZJ.getValue()).intValue());
        linearLayout2.addView(c197039127h2, layoutParams);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams2.gravity = 1;
        layoutParams2.topMargin = ((Number) C1229200i5m.LIZ.getValue()).intValue();
        layoutParams2.bottomMargin = ((Number) C1229200i5m.LIZIZ.getValue()).intValue();
        linearLayout.addView(linearLayout2, layoutParams2);
        try {
            ViewTreeLifecycleOwner.set(linearLayout, getViewLifecycleOwner());
            ViewTreeViewModelStoreOwner.set(linearLayout, this);
            linearLayout.setTag(R.id.view_tree_saved_state_registry_owner, this);
            C19EG activity = getActivity();
            if (activity instanceof C19GS) {
                c19gs = (C19GS) activity;
            }
            C1685300txQ.LIZ(c19gs);
            C189200o6.m2constructorimpl(Unit.LIZ);
            return linearLayout;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
            return linearLayout;
        }
    }
}
