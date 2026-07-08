package com.ss.android.ugc.aweme.im.chatroom.input.components.record;

import X.C01GW;
import X.C0HVA;
import X.C1397760mTe;
import X.C1559260qg8;
import X.C19290410dS;
import X.C20094413jq;
import X.C20094813ju;
import X.C23250099c;
import X.C259800zU;
import X.C418440Gaw;
import X.C419910GdJ;
import X.C432350GxN;
import X.C432670Gxt;
import X.C434380H1o;
import X.C452501pT;
import X.C457780HxI;
import X.C459000HzG;
import X.C723580SZw;
import X.C786410Ut5;
import X.C814420VxA;
import X.C817403Hg;
import X.EnumC1397840mTm;
import X.EnumC430090Gtj;
import X.EnumC434400H1q;
import X.EnumC452301pR;
import X.InterfaceC1175904ir;
import X.InterfaceC430010Gtb;
import Y.ACListenerS110S0200000_6;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import android.widget.FrameLayout;
import androidx.lifecycle.LifecycleOwnerKt;
import com.bytedance.assem.arch.core.UIAssem;
import com.bytedance.assem.arch.view.UISlotAssem;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.im.chatroom.input.components.record.RecordBtnAssem;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS192S0000000_6;
import kotlin.jvm.internal.AwS550S0100000_6;

/* JADX INFO: loaded from: classes7.dex */
public final class RecordBtnAssem extends UISlotAssem implements C0HVA {
    public TuxIconView LLJJIII;
    public View LLJJIJI;
    public View LLJJIJIIJIL;
    public boolean LLJJJIL;
    public EnumC430090Gtj LLJJJJ;
    public final C1559260qg8 LLJJI = new C1559260qg8(new C723580SZw(this, C457780HxI.class, null), checkSupervisorPrepared());
    public final C01GW LLJJIJIL = C452501pT.LIZ(EnumC452301pR.NONE, new AwS550S0100000_6(this, 139));
    public final C01GW LLJJJ = C452501pT.LIZIZ(AFwS192S0000000_6.get$arr$(62));

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int Co() {
        return R.layout.crc;
    }

    @Override // X.C0HVA
    public final String Bc() {
        return C432670Gxt.LIZ(this);
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onDestroy() {
        super.onDestroy();
        if (this.LLJJJIL) {
            ((InterfaceC430010Gtb) this.LLJJIJIL.getValue()).dismiss();
        }
    }

    public final InterfaceC1175904ir hp(UIAssem uIAssem) {
        return C459000HzG.LIZ(uIAssem);
    }

    /* JADX WARN: Type inference failed for: r0v7, types: [T, X.0H1q] */
    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(final View view) {
        Function2 function2LIZJ;
        super.onViewCreated(view);
        if ((view instanceof FrameLayout) && view != null && (function2LIZJ = C459000HzG.LIZJ(this)) != null) {
            function2LIZJ.invoke(this, view);
        }
        this.LLJJIJIIJIL = view;
        TuxIconView tuxIconView = (TuxIconView) view.findViewById(R.id.sya);
        if (tuxIconView != null) {
            int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(6));
            tuxIconView.setPadding(iLIZIZ, iLIZIZ, iLIZIZ, iLIZIZ);
            C419910GdJ c419910GdJ = new C419910GdJ();
            c419910GdJ.LIZ = R.raw.icon_mic_fill;
            c419910GdJ.LJ = Integer.valueOf(R.attr.a00);
            c419910GdJ.LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24));
            c419910GdJ.LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24));
            tuxIconView.setTuxIcon(c419910GdJ);
        } else {
            tuxIconView = null;
        }
        this.LLJJIII = tuxIconView;
        this.LLJJIJI = view.findViewById(R.id.syc);
        TuxIconView tuxIconView2 = this.LLJJIII;
        if (tuxIconView2 != null) {
            tuxIconView2.setLabel(view.getContext().getString(2131832303, ""));
            int i = C20094413jq.LJIIZILJ;
            C1397760mTe c1397760mTe = new C1397760mTe();
            c1397760mTe.LIZIZ = EnumC1397840mTm.BUTTON;
            c1397760mTe.LIZJ = null;
            C20094813ju.LIZ(tuxIconView2, c1397760mTe.LIZ());
        }
        if (C459000HzG.LIZIZ(this).getValue() == EnumC430090Gtj.DISABLED) {
            C786410Ut5.I7(new ACListenerS110S0200000_6(view, this, 5), view);
        } else {
            final C817403Hg c817403Hg = new C817403Hg();
            final C817403Hg c817403Hg2 = new C817403Hg();
            final C817403Hg c817403Hg3 = new C817403Hg();
            final C817403Hg c817403Hg4 = new C817403Hg();
            final C434380H1o c434380H1o = new C434380H1o(c817403Hg, c817403Hg2, c817403Hg3, c817403Hg4, view, this);
            final C19290410dS c19290410dS = new C19290410dS(view.getContext(), c434380H1o, null);
            final C259800zU c259800zU = new C259800zU();
            c259800zU.element = EnumC434400H1q.LLILLL;
            view.setOnTouchListener(new View.OnTouchListener() { // from class: X.0H1n
                /* JADX WARN: Type inference failed for: r0v100, types: [T, X.0H1q] */
                /* JADX WARN: Type inference failed for: r0v131, types: [T, X.0H1q] */
                /* JADX WARN: Type inference failed for: r0v6, types: [T, X.0H1q] */
                /* JADX WARN: Type inference failed for: r0v71, types: [T, X.0H1q] */
                /* JADX WARN: Type inference failed for: r0v86, types: [T, X.0H1q] */
                /* JADX WARN: Type inference failed for: r0v99, types: [T, X.0H1q] */
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
                @Override // android.view.View.OnTouchListener
                public final boolean onTouch(View view2, MotionEvent motionEvent) {
                    boolean z;
                    ViewParent parent = view2.getParent();
                    int iLIZ = C434410H1r.LIZ(true);
                    parent.requestDisallowInterceptTouchEvent(true);
                    c19290410dS.LIZ(motionEvent);
                    int layoutDirection = view2.getLayoutDirection();
                    int iLIZ2 = C434410H1r.LIZ(false);
                    if (layoutDirection == 1) {
                        z = true;
                    } else {
                        z = false;
                    }
                    int actionMasked = motionEvent.getActionMasked();
                    if (actionMasked != 1) {
                        if (actionMasked != 2) {
                            if (actionMasked != 3) {
                                return true;
                            }
                        } else {
                            float x = motionEvent.getX();
                            float y = motionEvent.getY();
                            float f = x - c817403Hg.element;
                            c817403Hg3.element += y - c817403Hg2.element;
                            c817403Hg4.element += f;
                            RecordBtnAssem recordBtnAssem = this;
                            recordBtnAssem.getClass();
                            if (C459000HzG.LIZIZ(recordBtnAssem).getValue() == EnumC430090Gtj.PRESSED) {
                                EnumC434400H1q enumC434400H1q = c259800zU.element;
                                if (enumC434400H1q == EnumC434400H1q.LL) {
                                    RecordBtnAssem recordBtnAssem2 = this;
                                    ((C434390H1p) recordBtnAssem2.hp(recordBtnAssem2)).LIZLLL.invoke(view2, Float.valueOf(c817403Hg4.element - C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(C434410H1r.LIZ(z))))));
                                } else if (enumC434400H1q == EnumC434400H1q.LLILLJJLI) {
                                    ((InterfaceC430010Gtb) this.LLJJIJIL.getValue()).LJJIFFI((int) (c817403Hg3.element - C814420VxA.LIZIZ(C418440Gaw.LIZIZ(-20))));
                                    if (c817403Hg3.element < C418440Gaw.LIZIZ(-40) + C814420VxA.LIZIZ(C418440Gaw.LIZIZ(-20))) {
                                        RecordBtnAssem recordBtnAssem3 = this;
                                        ((C434390H1p) recordBtnAssem3.hp(recordBtnAssem3)).LJ.invoke(view2);
                                        c259800zU.element = EnumC434400H1q.LLILZ;
                                    }
                                }
                            }
                            int iOrdinal = c259800zU.element.ordinal();
                            if (iOrdinal != 0) {
                                if (iOrdinal != 1) {
                                    if (iOrdinal != 2) {
                                        if (iOrdinal != 3) {
                                            throw new C1954807lC();
                                        }
                                    } else if (!z ? c817403Hg4.element < C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(iLIZ2))) : c817403Hg4.element > C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(iLIZ)))) {
                                        c259800zU.element = EnumC434400H1q.LL;
                                    } else if (c817403Hg3.element < C814420VxA.LIZIZ(C418440Gaw.LIZIZ(-20))) {
                                        c259800zU.element = EnumC434400H1q.LLILLJJLI;
                                    }
                                } else if (c817403Hg3.element >= C814420VxA.LIZIZ(C418440Gaw.LIZIZ(-20))) {
                                    c259800zU.element = EnumC434400H1q.LLILLL;
                                }
                            } else if (!z ? c817403Hg4.element >= C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(iLIZ2))) : c817403Hg4.element <= C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(iLIZ)))) {
                                c259800zU.element = EnumC434400H1q.LLILLL;
                            }
                            c817403Hg.element = x;
                            c817403Hg2.element = y;
                            return true;
                        }
                    }
                    if (c434380H1o.LL) {
                        RecordBtnAssem recordBtnAssem4 = this;
                        recordBtnAssem4.getClass();
                        if (C459000HzG.LIZIZ(recordBtnAssem4).getValue() == EnumC430090Gtj.PRESSED) {
                            int iOrdinal2 = c259800zU.element.ordinal();
                            if (iOrdinal2 != 0) {
                                if (iOrdinal2 != 1) {
                                    if (iOrdinal2 != 2) {
                                        if (iOrdinal2 != 3) {
                                            throw new C1954807lC();
                                        }
                                    } else {
                                        if (C298300Bme.LIZ()) {
                                            view2.performHapticFeedback(3);
                                        }
                                        RecordBtnAssem recordBtnAssem5 = this;
                                        ((C434390H1p) recordBtnAssem5.hp(recordBtnAssem5)).LJFF.invoke(view2);
                                    }
                                } else {
                                    if (C298300Bme.LIZ()) {
                                        view2.performHapticFeedback(3);
                                    }
                                    RecordBtnAssem recordBtnAssem6 = this;
                                    ((C434390H1p) recordBtnAssem6.hp(recordBtnAssem6)).LJFF.invoke(view2);
                                }
                            } else if (!z ? c817403Hg4.element < C418440Gaw.LIZIZ(-100) + C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(iLIZ2))) : c817403Hg4.element > C418440Gaw.LIZIZ(100) + C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(iLIZ)))) {
                                RecordBtnAssem recordBtnAssem7 = this;
                                ((C434390H1p) recordBtnAssem7.hp(recordBtnAssem7)).LIZJ.invoke(view);
                            } else {
                                if (C298300Bme.LIZ()) {
                                    view2.performHapticFeedback(3);
                                }
                                RecordBtnAssem recordBtnAssem8 = this;
                                ((C434390H1p) recordBtnAssem8.hp(recordBtnAssem8)).LJFF.invoke(view2);
                            }
                        }
                    }
                    c259800zU.element = EnumC434400H1q.LLILLL;
                    return true;
                }
            });
        }
        C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C432350GxN(this, null), 3);
    }
}
