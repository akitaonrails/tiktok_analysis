package com.ss.android.ugc.aweme.pns.universalpopup.core.ui.p007default;

import X.AbstractC1914420zuy;
import X.AbstractC1914480zv4;
import X.C01GW;
import X.C098200Yq;
import X.C10UZ;
import X.C1397510mTF;
import X.C1397620mTQ;
import X.C13LE;
import X.C166Z;
import X.C1685300txQ;
import X.C189200o6;
import X.C1914080zuQ;
import X.C1914170zuZ;
import X.C1914360zus;
import X.C1914440zv0;
import X.C1914570zvD;
import X.C19719612Di;
import X.C19EG;
import X.C19GS;
import X.C19MB;
import X.C19ME;
import X.C2188811AlT;
import X.C2217381BqS;
import X.C418440Gaw;
import X.C419910GdJ;
import X.C443120HZe;
import X.C452501pT;
import X.C786410Ut5;
import X.C814420VxA;
import X.C990320bsU;
import X.EnumC1914300zum;
import X.InterfaceC1085710eML;
import X.InterfaceC1914540zvA;
import X.InterfaceC1914580zvE;
import X.InterfaceC2217461Bqa;
import Y.ACListenerS89S1100000_28;
import Y.ARunnableS32S1100000_28;
import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import android.text.SpannableStringBuilder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.pns.universalpopup.core.model.StyleExtra;
import com.ss.android.ugc.aweme.pns.universalpopup.core.model.UniversalPopup;
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
import kotlin.jvm.internal.AwS394S0200000_28;
import kotlin.jvm.internal.AwS572S0100000_28;
import kotlin.jvm.internal.AwS596S0100000_17;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes29.dex */
public final class UniversalPopupBlocksUI extends UniversalPopupUI implements InterfaceC1914580zvE {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJI;
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZjUiOmEmJiw6LD0gKSk8Jj8mHELIOSOGsvJj02ZjAlZys2LiQ5JTt9HSslPyohOyQgGSAjPTUOJSAwIzYZAA==";
    public C1914080zuQ LLIZ;
    public C1397510mTF LLIZLLLIL;
    public boolean LLJ;
    public boolean LLJI;
    public final List<C443120HZe<String, String, AbstractC1914480zv4>> LLJIJIL = new ArrayList();
    public final List<AbstractC1914480zv4> LLJILJIL = new ArrayList();
    public final Set<String> LLJILJILJ = new LinkedHashSet();
    public final C166Z LLJILLL = new C166Z(new AwS394S0200000_28((LayoutInflater) null, this, 37), true);
    public final C01GW LLJJ = C452501pT.LIZIZ(new AwS572S0100000_28(this, 506));

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(UniversalPopupBlocksUI.class, "bottomSheetViewBinding", "getBottomSheetViewBinding()Lcom/ss/android/ugc/aweme/pns/universalpopup/core/databinding/UniversalPopupBottomSheetBlockBinding;", 0);
        C13LE.LIZ.getClass();
        LLJJI = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

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

    public final C1914360zus bS() {
        C166Z c166z = this.LLJILLL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJI;
        return (C1914360zus) c166z.LIZIZ(this);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        C1397510mTF c1397510mTF = this.LLIZLLLIL;
        if (c1397510mTF != null) {
            c1397510mTF.LIZIZ(null);
        }
    }

    public final void cS(String str) {
        C786410Ut5.LJLIIL(200L, new BPEAHandler(Looper.getMainLooper()), new ARunnableS32S1100000_28(this, str, 3));
    }

    public final LinearLayout gS(List<UniversalPopupBlock> list) {
        String str;
        String str2;
        Context contextRequireContext = requireContext();
        Map<String, InterfaceC1914540zvA> map = this.LLILZ;
        UniversalPopup universalPopupPR = PR();
        if (universalPopupPR != null) {
            str = universalPopupPR.style;
        } else {
            str = null;
        }
        if (!Intrinsics.LJFF(str, EnumC1914300zum.DIALOG.getValue()) && !Intrinsics.LJFF(str, EnumC1914300zum.DIALOG_WIDE.getValue())) {
            str2 = "fullscreen";
        } else {
            str2 = "dialog";
        }
        C990320bsU c990320bsULIZIZ = C1914570zvD.LIZIZ(contextRequireContext, list, map, this, str2);
        ((ArrayList) this.LLJILJIL).addAll(c990320bsULIZIZ.LIZIZ);
        ((ArrayList) this.LLJIJIL).addAll(c990320bsULIZIZ.LIZJ);
        this.LLJILJILJ.addAll(c990320bsULIZIZ.LIZLLL);
        return c990320bsULIZIZ.LIZ;
    }

    public final void ZR(ConstraintLayout constraintLayout, String str) {
        Integer numLJI;
        int i;
        int i2;
        boolean zLJFF = Intrinsics.LJFF(str, "back_button");
        if (zLJFF) {
            C1914170zuZ.LIZ.getClass();
            AbstractC1914420zuy abstractC1914420zuy = C1914170zuZ.LJII;
            if (abstractC1914420zuy != null) {
                numLJI = abstractC1914420zuy.LJI("IconChevronLeftLtr");
            } else {
                return;
            }
        } else {
            C1914170zuZ.LIZ.getClass();
            AbstractC1914420zuy abstractC1914420zuy2 = C1914170zuZ.LJII;
            if (abstractC1914420zuy2 != null) {
                numLJI = abstractC1914420zuy2.LJI("IconXMarkSmall");
            } else {
                return;
            }
        }
        if (numLJI != null) {
            TuxIconView tuxIconView = new TuxIconView(requireContext(), null, 0, 6, null);
            C419910GdJ c419910GdJ = new C419910GdJ();
            c419910GdJ.LIZ = numLJI.intValue();
            if (C10UZ.LIZLLL(requireContext())) {
                i = -1;
            } else {
                i = -16777216;
            }
            c419910GdJ.LIZLLL = Integer.valueOf(i);
            tuxIconView.setTuxIcon(c419910GdJ);
            C786410Ut5.a9(tuxIconView, new ACListenerS89S1100000_28(this, str, 7));
            C786410Ut5.M6(tuxIconView, new C19ME(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24))));
            tuxIconView.setId(View.generateViewId());
            constraintLayout.addView(tuxIconView);
            C19MB c19mb = new C19MB();
            c19mb.LJII(constraintLayout);
            c19mb.LJIIIZ(tuxIconView.getId(), 3, 0, 3, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16)));
            int id = tuxIconView.getId();
            if (zLJFF) {
                i2 = 6;
            } else {
                i2 = 7;
            }
            c19mb.LJIIIZ(id, i2, 0, i2, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16)));
            c19mb.LIZIZ(constraintLayout);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0283  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0341  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0343  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0348  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x034d  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x0489  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x0521 A[LOOP:3: B:232:0x051b->B:234:0x0521, LOOP_END] */
    /* JADX WARN: Type inference failed for: r11v0 */
    /* JADX WARN: Type inference failed for: r11v1, types: [X.0mJT, X.0mTD] */
    /* JADX WARN: Type inference failed for: r11v4, types: [X.0mTR] */
    /* JADX WARN: Type inference failed for: r11v5, types: [X.0mTQ] */
    /* JADX WARN: Type inference failed for: r11v6, types: [X.0mTQ] */
    /* JADX WARN: Type inference failed for: r15v0, types: [androidx.fragment.app.Fragment, com.ss.android.ugc.aweme.pns.universalpopup.core.ui.UniversalPopupUI, com.ss.android.ugc.aweme.pns.universalpopup.core.ui.default.UniversalPopupBlocksUI, java.lang.Object] */
    @Override // com.ss.android.ugc.aweme.pns.universalpopup.core.ui.UniversalPopupUI, androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onViewCreated(android.view.View r16, android.os.Bundle r17) {
        /*
            Method dump skipped, instruction units count: 1550
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.pns.universalpopup.core.ui.p007default.UniversalPopupBlocksUI.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    public static void dS(UniversalPopupBlocksUI universalPopupBlocksUI, ViewGroup viewGroup, ViewGroup viewGroup2) {
        universalPopupBlocksUI.getClass();
        int iIndexOfChild = viewGroup.indexOfChild(viewGroup);
        ViewGroup.LayoutParams layoutParams = viewGroup.getLayoutParams();
        C786410Ut5.LJJJLZIJ(viewGroup, viewGroup);
        viewGroup2.setId(viewGroup.getId());
        viewGroup.addView(viewGroup2, iIndexOfChild, layoutParams);
    }

    public final void aS(C1397620mTQ c1397620mTQ, UniversalPopupBlockElement universalPopupBlockElement, String str) {
        String str2 = universalPopupBlockElement.text;
        if (str2 != null) {
            String str3 = universalPopupBlockElement.subtype;
            if (Intrinsics.LJFF(str3, "primary")) {
                c1397620mTQ.LIZJ(0, str2, new AwS111S1200000_28(this, universalPopupBlockElement, str, 3));
            } else if (Intrinsics.LJFF(str3, "destructive")) {
                c1397620mTQ.LIZJ(2, str2, new AwS111S1200000_28(this, universalPopupBlockElement, str, 4));
            } else {
                c1397620mTQ.LIZJ(1, str2, new AwS111S1200000_28(this, universalPopupBlockElement, str, 5));
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C1914080zuQ c1914080zuQLIZ = C1914080zuQ.LIZ(layoutInflater, viewGroup);
        this.LLIZ = c1914080zuQLIZ;
        ConstraintLayout constraintLayout = c1914080zuQLIZ.LL;
        C19GS c19gs = null;
        if (!(constraintLayout instanceof View)) {
            constraintLayout = null;
        }
        if (constraintLayout != null) {
            try {
                ViewTreeLifecycleOwner.set(constraintLayout, getViewLifecycleOwner());
                ViewTreeViewModelStoreOwner.set(constraintLayout, this);
                constraintLayout.setTag(R.id.view_tree_saved_state_registry_owner, this);
                C19EG activity = getActivity();
                if (activity instanceof C19GS) {
                    c19gs = (C19GS) activity;
                }
                C1685300txQ.LIZ(c19gs);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
                return constraintLayout;
            }
        }
        C189200o6.m2constructorimpl(Unit.LIZ);
        return constraintLayout;
    }

    @Override // X.InterfaceC1914580zvE
    public final void pl(UniversalPopupAction universalPopupAction, String str, String str2) {
        if (universalPopupAction == null) {
            return;
        }
        if (str != null) {
            for (C443120HZe c443120HZe : (ArrayList) this.LLJIJIL) {
                Object first = c443120HZe.getFirst();
                Object second = c443120HZe.getSecond();
                AbstractC1914480zv4 abstractC1914480zv4 = (AbstractC1914480zv4) c443120HZe.getThird();
                if (!Intrinsics.LJFF(first, universalPopupAction.actionId) && Intrinsics.LJFF(second, str)) {
                    abstractC1914480zv4.LIZJ(false);
                }
            }
            this.LLJILJILJ.remove(str);
            if (this.LLJILJILJ.isEmpty()) {
                List<AbstractC1914480zv4> list = this.LLJILJIL;
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
        List<AbstractC1914480zv4> list2 = this.LLJILJIL;
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
