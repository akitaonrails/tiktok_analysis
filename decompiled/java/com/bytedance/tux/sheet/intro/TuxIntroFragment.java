package com.bytedance.tux.sheet.intro;

import X.C197039127h;
import X.C770750ULh;
import X.C770770ULj;
import X.C786410Ut5;
import Y.ACListenerS92S0300000_28;
import Y.ARunnableS128S0100000_28;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.LinearLayout;
import androidx.fragment.app.Fragment;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.tux.drawable.TuxIconDrawable;
import com.bytedance.tux.navigation.TuxNavBar;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes29.dex */
public final class TuxIntroFragment extends Fragment {
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWs4PDd9Oy0pLDt9HELIOSISs4OyB9HDA0ACEnOioKOy40JSAiPQ==";
    public C770750ULh LL;
    public int LLILLJJLI;
    public int LLILLL;
    public int LLILZ;
    public int LLILZIL;
    public int LLILZLL;
    public int LLIZ;
    public int LLIZLLLIL;
    public int LLJ;
    public int LLJI;
    public int LLJIJIL;
    public int LLJILJIL;
    public int LLJILJILJ;
    public int LLJILLL;
    public int LLJJ;
    public int LLJJI;
    public int LLJJIII;
    public int LLJJIJI;
    public Drawable LLJJIJIIJIL;
    public TuxIconDrawable LLJJIJIL;
    public CharSequence LLJJJ;
    public TuxNavBar LLJJJIL;

    public final LinearLayout.LayoutParams MR() {
        return new LinearLayout.LayoutParams(-1, -2);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        View viewLJII;
        super.onResume();
        TuxNavBar tuxNavBar = this.LLJJJIL;
        if (tuxNavBar == null || (viewLJII = tuxNavBar.LJII("TuxIntro")) == null) {
            return;
        }
        HandlerHook.viewPost(viewLJII, new ARunnableS128S0100000_28(viewLJII, 19));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:143:0x063f  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0649  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0745  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x08c7  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x08d6  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x0a13  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x0a16  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x0a25  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x0a5d  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x0a5f  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x0a6d  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x0aa7  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x0aa9  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x0acd  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x0b04  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x021a  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0267  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x02cd  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x02f3  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x031a  */
    /* JADX WARN: Type inference failed for: r0v129 */
    /* JADX WARN: Type inference failed for: r0v130, types: [android.widget.TextView, com.bytedance.tux.input.TuxTextView] */
    /* JADX WARN: Type inference failed for: r0v132, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r0v134, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r0v136, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r0v137, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r0v140, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r30v0, types: [boolean] */
    /* JADX WARN: Type inference failed for: r3v5, types: [android.view.View, android.view.ViewGroup, android.widget.LinearLayout] */
    /* JADX WARN: Type inference failed for: r4v80, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r4v81 */
    /* JADX WARN: Type inference failed for: r4v83 */
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
    public final android.view.View onCreateView(android.view.LayoutInflater r32, android.view.ViewGroup r33, android.os.Bundle r34) {
        /*
            Method dump skipped, instruction units count: 2877
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.tux.sheet.intro.TuxIntroFragment.onCreateView(android.view.LayoutInflater, android.view.ViewGroup, android.os.Bundle):android.view.View");
    }

    public final void NR(C197039127h c197039127h, int i, CharSequence charSequence, C770770ULj c770770ULj, Function1<? super C770770ULj, Unit> function1) {
        if (c770770ULj == null) {
            c770770ULj = new C770770ULj();
        }
        c770770ULj.LIZ = c197039127h;
        c770770ULj.LIZIZ(charSequence);
        c197039127h.setEnabled(c770770ULj.LIZLLL);
        c197039127h.setLoading(c770770ULj.LJ);
        c197039127h.setFocusable(true);
        c197039127h.setImportantForAccessibility(1);
        c197039127h.setButtonVariant(i);
        c197039127h.setText(charSequence);
        if (function1 == null) {
            return;
        }
        c197039127h.setClickable(true);
        C786410Ut5.U8(c197039127h, new ACListenerS92S0300000_28(function1, c770770ULj, this, 0));
    }
}
