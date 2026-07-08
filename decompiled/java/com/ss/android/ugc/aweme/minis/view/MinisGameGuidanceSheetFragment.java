package com.ss.android.ugc.aweme.minis.view;

import X.AbstractC1335900krs;
import X.C098200Yq;
import X.C1331660kl2;
import X.C1331670kl3;
import X.C1685300txQ;
import X.C189200o6;
import X.C197039127h;
import X.C19EG;
import X.C19GS;
import X.C2195221Avo;
import X.C2196701AyC;
import X.C427870Gq9;
import X.C786410Ut5;
import X.EnumC1222070huH;
import X.InterfaceC2197281Az8;
import Y.ACListenerS168S0100000_34;
import android.graphics.drawable.Animatable;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.minis.model.MinisMetaResp;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes35.dex */
public final class MinisGameGuidanceSheetFragment extends Fragment {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiglJyYgZjMlHELIOSLDh9BSwiIDwUKSgpDjo6LCQiKioAICApPQkhKSIhLCEn";
    public C197039127h LL;
    public C197039127h LLILLJJLI;
    public SmartImageView LLILLL;
    public C427870Gq9 LLILZ;
    public InterfaceC2197281Az8 LLILZIL;
    public TuxTextView LLILZLL;
    public TuxTextView LLIZ;
    public Boolean LLIZLLLIL;

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        if (Intrinsics.LJFF(this.LLIZLLLIL, Boolean.TRUE)) {
            return;
        }
        C2196701AyC c2196701AyC = C2196701AyC.LIZ;
        String value = EnumC1222070huH.FAILED.getValue();
        c2196701AyC.getClass();
        C2196701AyC.LJFF("swipe down", value);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        String str2;
        String str3;
        super.onViewCreated(view, bundle);
        this.LL = (C197039127h) view.findViewById(R.id.ad1);
        this.LLILLJJLI = (C197039127h) view.findViewById(R.id.t40);
        this.LLILLL = (SmartImageView) view.findViewById(R.id.of4);
        this.LLILZ = (C427870Gq9) view.findViewById(R.id.of3);
        this.LLILZLL = (TuxTextView) view.findViewById(R.id.ad8);
        this.LLIZ = (TuxTextView) view.findViewById(R.id.ad9);
        Object[] objArr = new Object[1];
        MinisMetaResp minisMetaResp = C2195221Avo.LJIIJ;
        String str4 = "";
        if (minisMetaResp == null || (str = minisMetaResp.name) == null) {
            str = "";
        }
        objArr[0] = str;
        String string = getString(2131822353, objArr);
        TuxTextView tuxTextView = this.LLILZLL;
        if (tuxTextView != null) {
            tuxTextView.setText(string);
        }
        Object[] objArr2 = new Object[1];
        MinisMetaResp minisMetaResp2 = C2195221Avo.LJIIJ;
        if (minisMetaResp2 == null || (str2 = minisMetaResp2.name) == null) {
            str2 = "";
        }
        objArr2[0] = str2;
        String string2 = getString(2131822352, objArr2);
        TuxTextView tuxTextView2 = this.LLIZ;
        if (tuxTextView2 != null) {
            tuxTextView2.setText(string2);
        }
        MinisMetaResp minisMetaResp3 = C2195221Avo.LJIIJ;
        if (minisMetaResp3 != null && (str3 = minisMetaResp3.iconUrl) != null) {
            str4 = str3;
        }
        C1331670kl3 c1331670kl3LJIIIZ = C1331660kl2.LJIIIZ(str4);
        c1331670kl3LJIIIZ.LJJIIZ(R.drawable.cn0);
        c1331670kl3LJIIIZ.LIZLLL("MinisGameLogoLoading");
        c1331670kl3LJIIIZ.LJJ(this.LLILLL);
        c1331670kl3LJIIIZ.LJIIJ(new AbstractC1335900krs() { // from class: X.1Az7
            @Override // X.InterfaceC427850Gq7
            public final void Ad(Uri uri, View view2, C428600GrK c428600GrK, Animatable animatable) {
            }

            @Override // X.InterfaceC427850Gq7
            public final void cm(Uri uri, View view2, Throwable th) {
            }
        });
        C1331670kl3 c1331670kl3LJIIIZ2 = C1331660kl2.LJIIIZ(str4);
        c1331670kl3LJIIIZ2.LJJIIZ(R.drawable.cn0);
        c1331670kl3LJIIIZ2.LIZLLL("MinisGameCircleLogoLoading");
        c1331670kl3LJIIIZ2.LJJ(this.LLILZ);
        c1331670kl3LJIIIZ2.LJIIJ(new AbstractC1335900krs() { // from class: X.1Az6
            @Override // X.InterfaceC427850Gq7
            public final void cm(Uri uri, View view2, Throwable th) {
            }

            @Override // X.InterfaceC427850Gq7
            public final void Ad(Uri uri, View view2, C428600GrK c428600GrK, Animatable animatable) {
                C427870Gq9 c427870Gq9 = this.LL.LLILZ;
                if (c427870Gq9 != null) {
                    C786410Ut5.LLLLJI(c427870Gq9, 4);
                }
            }
        });
        C197039127h c197039127h = this.LL;
        if (c197039127h != null) {
            C786410Ut5.U8(c197039127h, new ACListenerS168S0100000_34(this, 13));
        }
        C197039127h c197039127h2 = this.LLILLJJLI;
        if (c197039127h2 != null) {
            C786410Ut5.U8(c197039127h2, new ACListenerS168S0100000_34(this, 14));
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.dmv, viewGroup, false);
        if (viewTd != null) {
            C786410Ut5.LJLLLLLL(0, viewTd);
        }
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
