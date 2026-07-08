package com.ss.android.ugc.aweme.search.pages.result.common.feedback.core.ui;

import X.C01GW;
import X.C098200Yq;
import X.C0OM1;
import X.C1250250idj;
import X.C1251150ifB;
import X.C13LP;
import X.C1685300txQ;
import X.C1697820uHc;
import X.C1844507Kh;
import X.C189200o6;
import X.C19EG;
import X.C19GS;
import X.C293500Beu;
import X.C384050F3z;
import X.C418440Gaw;
import X.C419910GdJ;
import X.C426160GnO;
import X.C426750GoL;
import X.C427870Gq9;
import X.C452501pT;
import X.C683220Qr2;
import X.C684150QsX;
import X.C688690Qzr;
import X.C786410Ut5;
import X.C814420VxA;
import X.EnumC682590Qq1;
import X.InterfaceC344240DeY;
import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.drawable.TuxIconDrawable;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.discover.model.FeedbackMultipleChoice;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS196S0000000_10;
import kotlin.jvm.internal.AwS169S0400000_10;
import kotlin.jvm.internal.AwS554S0100000_10;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.u;

/* JADX INFO: loaded from: classes11.dex */
public final class SearchFeedbackOptionalFragment extends Fragment implements InterfaceC344240DeY {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZjYpKD0wIGs8KCg2O2s+LDwmJDFiKiA+JSHELIOSoiZyk2LSEuKCw4ZiYjOyp9PSxiGioyOiYkDyo2LCctKiQcODElJiEyJAM+KCg+LSs4";
    public C683220Qr2 LL;
    public View LLILLJJLI;
    public C426160GnO LLILLL;
    public ConstraintLayout LLILZ;
    public TuxTextView LLILZIL;
    public C427870Gq9 LLILZLL;
    public SmartImageView LLIZ;
    public TuxTextView LLIZLLLIL;
    public C688690Qzr LLJ;
    public LinearLayout LLJI;
    public ViewGroup LLJIJIL;
    public TuxTextView LLJILJIL;
    public final C01GW LLJILJILJ = C452501pT.LIZIZ(AFwS196S0000000_10.get$arr$(286));
    public List<FeedbackMultipleChoice> LLJILLL = new ArrayList();
    public C684150QsX LLJJ;
    public AwS169S0400000_10 LLJJI;
    public Function0<Unit> LLJJIII;

    public final boolean NR() {
        C683220Qr2 c683220Qr2;
        Aweme aweme;
        C01GW c01gw = C293500Beu.LIZ;
        if (!C293500Beu.LIZIZ || (c683220Qr2 = this.LL) == null || (aweme = c683220Qr2.LJIILIIL) == null || !aweme.isAd()) {
            return false;
        }
        C683220Qr2 c683220Qr22 = this.LL;
        return !Intrinsics.LJFF(c683220Qr22 != null ? c683220Qr22.LIZ : null, EnumC682590Qq1.E_COM.getValue());
    }

    @Override // X.InterfaceC344240DeY
    public final C0OM1 Sn() {
        String string;
        Resources resources;
        C0OM1 c0om1 = new C0OM1();
        c0om1.LIZLLL = true;
        C1250250idj c1250250idj = new C1250250idj();
        Context context = getContext();
        if (context == null || (resources = context.getResources()) == null || (string = resources.getString(2131822169)) == null) {
            string = "";
        }
        c1250250idj.LIZJ = string;
        c0om1.LIZJ = c1250250idj;
        C1251150ifB c1251150ifB = new C1251150ifB();
        c1251150ifB.LIZLLL();
        c1251150ifB.LIZJ = R.raw.icon_x_mark;
        c1251150ifB.LIZJ(new AwS554S0100000_10(this, 450));
        c0om1.LIZIZ(c1251150ifB);
        return c0om1;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        List<FeedbackMultipleChoice> list;
        List<FeedbackMultipleChoice> list2;
        super.onCreate(bundle);
        C683220Qr2 c683220Qr2 = this.LL;
        String str = null;
        if (c683220Qr2 != null) {
            str = c683220Qr2.LIZ;
        }
        if (str != null && ((Boolean) C1844507Kh.LIZ.getValue()).booleanValue()) {
            Iterator it2 = ((List) C1844507Kh.LIZIZ.getValue()).iterator();
            while (it2.hasNext()) {
                if (u.LJIJI((String) it2.next(), str, true)) {
                    C683220Qr2 c683220Qr22 = this.LL;
                    if (c683220Qr22 != null && (list2 = c683220Qr22.LIZLLL) != null && (true ^ list2.isEmpty())) {
                        ArrayList arrayList = new ArrayList(list2);
                        List list3 = (List) C1844507Kh.LIZJ.getValue();
                        ArrayList arrayList2 = new ArrayList();
                        for (Object obj : list3) {
                            Iterator it3 = arrayList.iterator();
                            while (true) {
                                if (it3.hasNext()) {
                                    Object next = it3.next();
                                    if (Intrinsics.LJFF(((FeedbackMultipleChoice) next).getKey(), obj)) {
                                        if (next != null) {
                                            arrayList2.add(next);
                                        }
                                    }
                                }
                            }
                        }
                        arrayList.removeAll(arrayList2);
                        List list4 = (List) C1844507Kh.LIZLLL.getValue();
                        ArrayList arrayList3 = new ArrayList();
                        for (Object obj2 : list4) {
                            Iterator it4 = arrayList.iterator();
                            while (true) {
                                if (it4.hasNext()) {
                                    Object next2 = it4.next();
                                    if (Intrinsics.LJFF(((FeedbackMultipleChoice) next2).getKey(), obj2)) {
                                        if (next2 != null) {
                                            arrayList3.add(next2);
                                        }
                                    }
                                }
                            }
                        }
                        arrayList.removeAll(arrayList3);
                        this.LLJILLL.addAll(arrayList2);
                        this.LLJILLL.addAll(C1697820uHc.LIZLLL(arrayList));
                        this.LLJILLL.addAll(arrayList3);
                        return;
                    }
                    return;
                }
            }
        }
        C683220Qr2 c683220Qr23 = this.LL;
        if (c683220Qr23 != null && (list = c683220Qr23.LIZLLL) != null && (!list.isEmpty())) {
            ArrayList arrayList4 = new ArrayList(C1697820uHc.LIZLLL(C13LP.LL(list, list.size() - 1)));
            this.LLJILLL = arrayList4;
            arrayList4.add(C13LP.LJJLIIIJJI(list));
        }
    }

    public final void MR(SmartImageView smartImageView, String str) {
        Context context = getContext();
        if (context != null) {
            if (Intrinsics.LJFF(str, EnumC682590Qq1.USER.getValue())) {
                C419910GdJ c419910GdJ = new C419910GdJ();
                c419910GdJ.LIZ = R.raw.icon_color_default_avatar;
                c419910GdJ.LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(48));
                c419910GdJ.LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(48));
                smartImageView.setBackground(c419910GdJ.LIZ(context));
                return;
            }
            if (Intrinsics.LJFF(str, EnumC682590Qq1.POI.getValue())) {
                C419910GdJ c419910GdJ2 = new C419910GdJ();
                c419910GdJ2.LIZ = R.raw.icon_map_pin_fill;
                c419910GdJ2.LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(20));
                c419910GdJ2.LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(20));
                c419910GdJ2.LJ = Integer.valueOf(R.attr.a1j);
                TuxIconDrawable tuxIconDrawableLIZ = c419910GdJ2.LIZ(context);
                C384050F3z c384050F3z = new C384050F3z();
                c384050F3z.LIZIZ = Integer.valueOf(R.attr.c7);
                c384050F3z.LJII = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(48));
                c384050F3z.LJI = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(48));
                c384050F3z.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(2));
                smartImageView.setBackground(C426750GoL.LJIILIIL(tuxIconDrawableLIZ, c384050F3z.LIZ(context)));
                return;
            }
            C419910GdJ c419910GdJ3 = new C419910GdJ();
            c419910GdJ3.LIZ = R.raw.icon_tiktok_logo;
            c419910GdJ3.LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24));
            c419910GdJ3.LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24));
            c419910GdJ3.LJ = Integer.valueOf(R.attr.ng);
            TuxIconDrawable tuxIconDrawableLIZ2 = c419910GdJ3.LIZ(context);
            C384050F3z c384050F3z2 = new C384050F3z();
            c384050F3z2.LIZIZ = Integer.valueOf(R.attr.c7);
            c384050F3z2.LJII = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(42));
            c384050F3z2.LJI = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(56));
            c384050F3z2.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(2));
            smartImageView.setBackground(C426750GoL.LJIILIIL(tuxIconDrawableLIZ2, c384050F3z2.LIZ(context)));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0332  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x036a  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0435  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x04da  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0536  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x06a9  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x06b1  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x06b6  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x06c2  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x06cd  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x06d7  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x06da  */
    /* JADX WARN: Removed duplicated region for block: B:351:0x0813  */
    /* JADX WARN: Type inference failed for: r14v19 */
    /* JADX WARN: Type inference failed for: r14v20 */
    /* JADX WARN: Type inference failed for: r14v47 */
    /* JADX WARN: Type inference failed for: r14v48 */
    /* JADX WARN: Type inference failed for: r14v49 */
    /* JADX WARN: Type inference failed for: r14v6, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r15v10 */
    /* JADX WARN: Type inference failed for: r15v7, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r15v8, types: [android.view.View, android.widget.TextView, com.bytedance.tux.input.TuxTextView] */
    /* JADX WARN: Type inference failed for: r15v9 */
    /* JADX WARN: Type inference failed for: r20v2, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v105 */
    /* JADX WARN: Type inference failed for: r2v125 */
    /* JADX WARN: Type inference failed for: r2v89, types: [android.view.ViewGroup] */
    /* JADX WARN: Type inference failed for: r65v0, types: [androidx.fragment.app.Fragment, com.ss.android.ugc.aweme.search.pages.result.common.feedback.core.ui.SearchFeedbackOptionalFragment, java.lang.Object] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onViewCreated(android.view.View r66, android.os.Bundle r67) {
        /*
            Method dump skipped, instruction units count: 2166
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.search.pages.result.common.feedback.core.ui.SearchFeedbackOptionalFragment.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewTd = C786410Ut5.Td(layoutInflater.cloneInContext(viewGroup.getContext()), R.layout.f2y, viewGroup, false);
        this.LLILLJJLI = viewTd;
        C19GS c19gs = null;
        if (viewTd == null) {
            viewTd = null;
        }
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
