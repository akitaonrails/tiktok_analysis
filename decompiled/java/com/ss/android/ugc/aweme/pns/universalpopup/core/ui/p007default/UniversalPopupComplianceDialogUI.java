package com.ss.android.ugc.aweme.pns.universalpopup.core.ui.p007default;

import X.AbstractC1914480zv4;
import X.C098200Yq;
import X.C1397510mTF;
import X.C1397620mTQ;
import X.C1685300txQ;
import X.C189200o6;
import X.C1914440zv0;
import X.C1914570zvD;
import X.C19719612Di;
import X.C19EG;
import X.C19GS;
import X.C2188811AlT;
import X.C418440Gaw;
import X.C443120HZe;
import X.C786410Ut5;
import X.C814420VxA;
import X.C990320bsU;
import X.InterfaceC1085710eML;
import X.InterfaceC1914580zvE;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.pns.universalpopup.core.model.StyleExtra;
import com.ss.android.ugc.aweme.pns.universalpopup.core.model.UniversalPopupAction;
import com.ss.android.ugc.aweme.pns.universalpopup.core.model.UniversalPopupBlock;
import com.ss.android.ugc.aweme.pns.universalpopup.core.model.UniversalPopupBlockElement;
import com.ss.android.ugc.aweme.pns.universalpopup.core.ui.UniversalPopupUI;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.internal.AwS111S1200000_28;
import kotlin.jvm.internal.AwS596S0100000_17;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes29.dex */
public final class UniversalPopupComplianceDialogUI extends UniversalPopupUI implements InterfaceC1914580zvE {
    public static final int LLJILJIL = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(72));
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZjUiOmEmJiw6LD0gKSk8Jj8mOGsvJjHELIOS02ZjAlZys2LiQ5JTt9HSslPyohOyQgGSAjPTUPJiIjJCwtJyw2DCwtJSA0HQw=";
    public C1397510mTF LLIZ;
    public boolean LLIZLLLIL;
    public final List<C443120HZe<String, String, AbstractC1914480zv4>> LLJ = new ArrayList();
    public final List<AbstractC1914480zv4> LLJI = new ArrayList();
    public final Set<String> LLJIJIL = new LinkedHashSet();

    @Override // com.ss.android.ugc.aweme.pns.universalpopup.core.ui.UniversalPopupUI
    public final void RR(Map<String, String> map, StyleExtra styleExtra) {
    }

    @Override // com.ss.android.ugc.aweme.pns.universalpopup.core.ui.UniversalPopupUI
    public final void SR(SpannableStringBuilder spannableStringBuilder, String str) {
    }

    @Override // com.ss.android.ugc.aweme.pns.universalpopup.core.ui.UniversalPopupUI
    public final void UR(List list, Boolean bool, AwS596S0100000_17 awS596S0100000_17) {
    }

    @Override // com.ss.android.ugc.aweme.pns.universalpopup.core.ui.UniversalPopupUI
    public final void VR(String str, String str2) {
    }

    @Override // com.ss.android.ugc.aweme.pns.universalpopup.core.ui.UniversalPopupUI
    public final void WR(String str) {
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        C1397510mTF c1397510mTF = this.LLIZ;
        if (c1397510mTF != null) {
            c1397510mTF.LIZIZ(null);
        }
    }

    public final LinearLayout aS(List<UniversalPopupBlock> list) {
        C990320bsU c990320bsULIZIZ = C1914570zvD.LIZIZ(requireContext(), list, this.LLILZ, this, "dialog");
        ((ArrayList) this.LLJI).addAll(c990320bsULIZIZ.LIZIZ);
        ((ArrayList) this.LLJ).addAll(c990320bsULIZIZ.LIZJ);
        this.LLJIJIL.addAll(c990320bsULIZIZ.LIZLLL);
        return c990320bsULIZIZ.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x014f A[LOOP:5: B:57:0x0149->B:59:0x014f, LOOP_END] */
    /* JADX WARN: Type inference failed for: r10v1, types: [android.view.ViewGroup] */
    /* JADX WARN: Type inference failed for: r12v0 */
    /* JADX WARN: Type inference failed for: r12v1, types: [X.0mJT, X.0mTD] */
    /* JADX WARN: Type inference failed for: r12v6, types: [X.0mTR] */
    /* JADX WARN: Type inference failed for: r12v7, types: [X.0mTQ] */
    /* JADX WARN: Type inference failed for: r12v8, types: [X.0mTQ] */
    /* JADX WARN: Type inference failed for: r39v0, types: [androidx.fragment.app.Fragment, com.ss.android.ugc.aweme.pns.universalpopup.core.ui.UniversalPopupUI, com.ss.android.ugc.aweme.pns.universalpopup.core.ui.default.UniversalPopupComplianceDialogUI] */
    @Override // com.ss.android.ugc.aweme.pns.universalpopup.core.ui.UniversalPopupUI, androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onViewCreated(android.view.View r40, android.os.Bundle r41) {
        /*
            Method dump skipped, instruction units count: 1175
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.pns.universalpopup.core.ui.p007default.UniversalPopupComplianceDialogUI.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    public final void ZR(C1397620mTQ c1397620mTQ, UniversalPopupBlockElement universalPopupBlockElement, String str) {
        String str2 = universalPopupBlockElement.text;
        if (str2 != null) {
            String str3 = universalPopupBlockElement.subtype;
            if (Intrinsics.LJFF(str3, "primary")) {
                c1397620mTQ.LIZJ(0, str2, new AwS111S1200000_28(this, universalPopupBlockElement, str, 6));
            } else if (Intrinsics.LJFF(str3, "destructive")) {
                c1397620mTQ.LIZJ(2, str2, new AwS111S1200000_28(this, universalPopupBlockElement, str, 7));
            } else {
                c1397620mTQ.LIZJ(1, str2, new AwS111S1200000_28(this, universalPopupBlockElement, str, 8));
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C19GS c19gs;
        FrameLayout frameLayout = new FrameLayout(requireContext());
        C786410Ut5.a6(frameLayout, new ViewGroup.LayoutParams(-1, -1));
        try {
            ViewTreeLifecycleOwner.set(frameLayout, getViewLifecycleOwner());
            ViewTreeViewModelStoreOwner.set(frameLayout, this);
            frameLayout.setTag(R.id.view_tree_saved_state_registry_owner, this);
            C19EG activity = getActivity();
            if (activity instanceof C19GS) {
                c19gs = (C19GS) activity;
            } else {
                c19gs = null;
            }
            C1685300txQ.LIZ(c19gs);
            C189200o6.m2constructorimpl(Unit.LIZ);
            return frameLayout;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
            return frameLayout;
        }
    }

    @Override // X.InterfaceC1914580zvE
    public final void pl(UniversalPopupAction universalPopupAction, String str, String str2) {
        if (universalPopupAction == null) {
            return;
        }
        if (str != null) {
            for (C443120HZe c443120HZe : (ArrayList) this.LLJ) {
                Object first = c443120HZe.getFirst();
                Object second = c443120HZe.getSecond();
                AbstractC1914480zv4 abstractC1914480zv4 = (AbstractC1914480zv4) c443120HZe.getThird();
                if (!Intrinsics.LJFF(first, universalPopupAction.actionId) && Intrinsics.LJFF(second, str)) {
                    abstractC1914480zv4.LIZJ(false);
                }
            }
            this.LLJIJIL.remove(str);
            if (this.LLJIJIL.isEmpty()) {
                List<AbstractC1914480zv4> list = this.LLJI;
                ArrayList arrayList = new ArrayList();
                for (Object obj : (ArrayList) list) {
                    if (obj instanceof C1914440zv0) {
                        arrayList.add(obj);
                    }
                }
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    ((AbstractC1914480zv4) it2.next()).LIZJ(true);
                }
            }
        }
        List<AbstractC1914480zv4> list2 = this.LLJI;
        ArrayList arrayList2 = new ArrayList();
        Iterator it3 = ((ArrayList) list2).iterator();
        while (it3.hasNext()) {
            C19719612Di.LJJI(((AbstractC1914480zv4) it3.next()).LIZIZ(), arrayList2);
        }
        ArrayList arrayList3 = new ArrayList(arrayList2);
        if (str2 != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(str2);
            sbLIZ.append('_');
            sbLIZ.append(universalPopupAction.actionId);
            arrayList3.add(C2188811AlT.LIZIZ(sbLIZ));
        }
        InterfaceC1085710eML interfaceC1085710eML = this.LLILLL;
        if (interfaceC1085710eML != null) {
            interfaceC1085710eML.ZI(universalPopupAction, arrayList3);
        }
    }
}
