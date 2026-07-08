package com.bytedance.assem.arch.view;

import X.C01GW;
import X.C1163430gNh;
import X.C1163440gNi;
import X.C18L3;
import X.C20624615nA;
import X.C20624715nB;
import X.C20624815nC;
import X.C20742916Ex;
import X.C2188811AlT;
import X.C452501pT;
import X.C520680KbS;
import X.C786410Ut5;
import X.EnumC452301pR;
import X.InterfaceC1294060jmO;
import X.InterfaceC201986141o;
import X.InterfaceC487670JAn;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.lifecycle.Lifecycle;
import com.bytedance.assem.arch.core.UIAssem;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS375S0200000_9;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes32.dex */
public abstract class UISlotAssem extends UIAssem {
    public static final C20624615nA LLJILJILJ = new Object() { // from class: X.15nA
    };
    public static final C01GW<Boolean> LLJILLL;
    public static final C01GW<Boolean> LLJJ;
    public int LLIZ;
    public Function0<? extends ViewGroup> LLIZLLLIL;
    public C18L3 LLJ;
    public LayoutInflater LLJI;
    public C1163440gNi LLJIJIL = C1163440gNi.LIZ;
    public View LLJILJIL;

    public static /* synthetic */ void No() {
    }

    public static /* synthetic */ void So() {
    }

    public abstract int Co();

    public Context Eo(Context context) {
        return context;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.15nA] */
    static {
        EnumC452301pR enumC452301pR = EnumC452301pR.NONE;
        LLJILLL = C452501pT.LIZ(enumC452301pR, new C20624815nC());
        LLJJ = C452501pT.LIZ(enumC452301pR, new C20624715nB());
    }

    public final View getContentView() {
        View view = this.LLJILJIL;
        if (view != null) {
            return view;
        }
        return null;
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public void xo() {
        final ViewGroup viewGroupLIZ;
        C1163430gNh c1163430gNh;
        InterfaceC201986141o interfaceC201986141o;
        Function0<? extends ViewGroup> function0 = this.LLIZLLLIL;
        if (so()) {
            viewGroupLIZ = LJJIJL();
        } else if (function0 != null) {
            viewGroupLIZ = function0.invoke();
        } else {
            if (this.LLIZ == 0) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("slotLayoutId must be assigned in ");
                sbLIZ.append(this);
                sbLIZ.append('.');
                String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                strLIZIZ.toString();
                throw new IllegalStateException(strLIZIZ);
            }
            View view = getSupervisor().LLJJIII;
            if (view == null) {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("container view in supervisor is null in ");
                sbLIZ2.append(this);
                String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ2);
                strLIZIZ2.toString();
                throw new IllegalStateException(strLIZIZ2);
            }
            viewGroupLIZ = C520680KbS.LIZ(this.LLIZ, view);
            if (viewGroupLIZ == null) {
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("find view is null in ");
                sbLIZ3.append(this);
                sbLIZ3.append(", id: ");
                sbLIZ3.append(this.LLIZ);
                String strLIZIZ3 = C2188811AlT.LIZIZ(sbLIZ3);
                strLIZIZ3.toString();
                throw new IllegalStateException(strLIZIZ3);
            }
        }
        if (!(viewGroupLIZ instanceof ViewGroup)) {
            String str = "container must be a ViewGroup in " + this;
            str.toString();
            throw new IllegalStateException(str);
        }
        Ao(viewGroupLIZ);
        if (this.LLJILJIL != null) {
            ((ViewGroup) viewGroupLIZ).addView(getContentView());
            oo(getContentView());
            return;
        }
        int iCo = Co();
        if (iCo == 0) {
            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
            sbLIZ4.append("layoutId must be assigned. in ");
            sbLIZ4.append(this);
            String strLIZIZ4 = C2188811AlT.LIZIZ(sbLIZ4);
            strLIZIZ4.toString();
            throw new IllegalStateException(strLIZIZ4);
        }
        Context context = getContext();
        if (context == null) {
            "Required value was null.".toString();
            throw new IllegalArgumentException("Required value was null.");
        }
        Context contextEo = Eo(context);
        C1163440gNi c1163440gNi = this.LLJIJIL;
        if (Intrinsics.LJFF(c1163440gNi, C1163440gNi.LIZIZ)) {
            C18L3 c18l3 = this.LLJ;
            if (c18l3 == null) {
                c18l3 = new C18L3(contextEo);
            }
            c18l3.LIZ(iCo, (ViewGroup) viewGroupLIZ, new InterfaceC487670JAn() { // from class: X.15n9
                @Override // X.InterfaceC487670JAn
                public final void onInflateFinished(View view2, int i, ViewGroup viewGroup) {
                    if (this.getLifecycle().getCurrentState() == Lifecycle.State.DESTROYED) {
                        return;
                    }
                    ((ViewGroup) viewGroupLIZ).addView(view2);
                    this.Zo(view2);
                    this.oo(view2);
                }
            });
            return;
        }
        if (Intrinsics.LJFF(c1163440gNi, C1163440gNi.LIZJ)) {
            View viewLIZ = C20742916Ex.LIZ(contextEo, iCo, new FrameLayout(contextEo), false, -1);
            if (viewLIZ != null) {
                ((ViewGroup) viewGroupLIZ).addView(viewLIZ);
                Zo(viewLIZ);
                oo(viewLIZ);
                return;
            }
            return;
        }
        if (!Intrinsics.LJFF(c1163440gNi, C1163440gNi.LIZ)) {
            if (c1163440gNi instanceof C1163430gNh) {
                C1163440gNi c1163440gNi2 = this.LLJIJIL;
                if (!(c1163440gNi2 instanceof C1163430gNh) || (c1163430gNh = (C1163430gNh) c1163440gNi2) == null || (interfaceC201986141o = c1163430gNh.LJ) == null) {
                    return;
                }
                interfaceC201986141o.LIZ(contextEo, iCo, viewGroupLIZ, new AwS375S0200000_9(viewGroupLIZ, this, 17));
                return;
            }
            return;
        }
        LayoutInflater layoutInflaterNe = C786410Ut5.ne(context);
        if (!Intrinsics.LJFF(contextEo, context)) {
            layoutInflaterNe = layoutInflaterNe.cloneInContext(contextEo);
        }
        LayoutInflater layoutInflater = this.LLJI;
        if (layoutInflater != null) {
            layoutInflaterNe = layoutInflater;
        }
        ViewGroup viewGroup = (ViewGroup) viewGroupLIZ;
        View viewTd = C786410Ut5.Td(layoutInflaterNe, iCo, viewGroup, false);
        if (viewTd != null) {
            viewGroup.addView(viewTd);
            Zo(viewTd);
            oo(viewTd);
        }
    }

    public final Function0<ViewGroup> Fo() {
        return this.LLIZLLLIL;
    }

    public final C1163440gNi Go() {
        return this.LLJIJIL;
    }

    public final int Ho() {
        return this.LLIZ;
    }

    public final int Jo() {
        return this.LLIZ;
    }

    public final C18L3 Lo() {
        return this.LLJ;
    }

    public final LayoutInflater Oo() {
        return this.LLJI;
    }

    public final void Vo(Function0<? extends ViewGroup> function0) {
        this.LLIZLLLIL = function0;
    }

    public final void Zo(View view) {
        this.LLJILJIL = view;
    }

    @InterfaceC1294060jmO
    public final void ap(C1163440gNi c1163440gNi) {
        bp(c1163440gNi);
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x001b A[PHI: r1
      0x001b: PHI (r1v2 X.0gNi) = (r1v1 X.0gNi), (r1v0 X.0gNi) binds: [B:12:0x0038, B:5:0x0019] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void bp(X.C1163440gNi r3) {
        /*
            r2 = this;
            X.0gNi r1 = X.C1163440gNi.LIZIZ
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r3, r1)
            if (r0 == 0) goto L1f
            X.15nA r0 = com.bytedance.assem.arch.view.UISlotAssem.LLJILJILJ
            r0.getClass()
            X.01GW<java.lang.Boolean> r0 = com.bytedance.assem.arch.view.UISlotAssem.LLJILLL
            java.lang.Object r0 = r0.getValue()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L1f
        L1b:
            r3 = r1
        L1c:
            r2.LLJIJIL = r3
            return
        L1f:
            X.0gNi r1 = X.C1163440gNi.LIZJ
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r3, r1)
            if (r0 == 0) goto L3b
            X.15nA r0 = com.bytedance.assem.arch.view.UISlotAssem.LLJILJILJ
            r0.getClass()
            X.01GW<java.lang.Boolean> r0 = com.bytedance.assem.arch.view.UISlotAssem.LLJJ
            java.lang.Object r0 = r0.getValue()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L3b
            goto L1b
        L3b:
            boolean r0 = r3 instanceof X.C1163430gNh
            if (r0 != 0) goto L1c
            X.0gNi r3 = X.C1163440gNi.LIZ
            goto L1c
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.assem.arch.view.UISlotAssem.bp(X.0gNi):void");
    }

    public final void cp(int i) {
        this.LLIZ = i;
    }

    public final void dp(C18L3 c18l3) {
        this.LLJ = c18l3;
    }

    public final void ep(LayoutInflater layoutInflater) {
        this.LLJI = layoutInflater;
    }
}
