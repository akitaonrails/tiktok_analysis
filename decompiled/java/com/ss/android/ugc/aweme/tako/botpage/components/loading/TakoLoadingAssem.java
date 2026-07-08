package com.ss.android.ugc.aweme.tako.botpage.components.loading;

import X.C01GW;
import X.C07QJ;
import X.C0B1N;
import X.C0GY8;
import X.C1077410e8x;
import X.C1077420e8y;
import X.C123100dR;
import X.C1295090jo3;
import X.C1295960jpS;
import X.C1308910kAL;
import X.C13LP;
import X.C14J2;
import X.C15438062q;
import X.C1697810uHb;
import X.C18081076h;
import X.C1857690yRT;
import X.C1857750yRZ;
import X.C1858620ySy;
import X.C299000Bnm;
import X.C339190DRl;
import X.C418440Gaw;
import X.C426750GoL;
import X.C444830HcP;
import X.C452501pT;
import X.C474160Iic;
import X.C786410Ut5;
import X.C814420VxA;
import X.InterfaceC1295080jo2;
import X.InterfaceC1296040jpa;
import X.InterfaceC1587906Jp;
import X.InterfaceC1857950yRt;
import X.InterfaceC712990Rxx;
import Y.ALAdapterS0S1100000_27;
import Y.AUListenerS217S0200000_7;
import android.animation.ValueAnimator;
import android.content.Context;
import android.text.TextDirectionHeuristics;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateDecelerateInterpolator;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.tako.ccl.model.api.TakoProcessInfo;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS216S0000000_27;
import kotlin.jvm.internal.AFwS314S0000000_27;
import kotlin.jvm.internal.AwS462S0200000_27;
import kotlin.jvm.internal.AwS571S0100000_27;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes28.dex */
public final class TakoLoadingAssem extends ReusedUISlotAssem<TakoLoadingAssem> implements InterfaceC712990Rxx<InterfaceC1857950yRt> {
    public LinearLayoutCompat LLJJLIIIJLLLLLLLZ;
    public C1295960jpS LLJL;
    public C14J2 LLJLIL;
    public ConstraintLayout LLJLILLLLZIIL;
    public TuxTextView LLJLL;
    public Boolean LLJLLL;
    public ValueAnimator LLJZ;
    public boolean LLJZIJLIL;
    public String LLL;
    public C14J2 LLLFF;
    public final C01GW LLJLLIL = C452501pT.LIZIZ(new AwS571S0100000_27(this, 795));
    public final C01GW LLLF = C452501pT.LIZIZ(AFwS216S0000000_27.get$arr$(177));
    public final C01GW LLLFFI = C452501pT.LIZIZ(new AwS571S0100000_27(this, 796));

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int Oo() {
        return R.layout.fkz;
    }

    @Override // X.InterfaceC712990Rxx
    public final void wr() {
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final void cp() {
        C07QJ.LIZ.getClass();
        if (C07QJ.LIZ()) {
            sp();
            C0GY8 c0gy8 = (C0GY8) this.LLLF.getValue();
            ValueAnimator valueAnimator = c0gy8.LIZ;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            c0gy8.LIZ = null;
            c0gy8.LIZIZ = null;
        }
    }

    public final void op() {
        TuxTextView tuxTextView;
        TuxTextView tuxTextView2;
        C07QJ.LIZ.getClass();
        if (C07QJ.LIZ()) {
            sp();
        }
        C1295960jpS c1295960jpS = this.LLJL;
        if (c1295960jpS != null && !c1295960jpS.isAnimating()) {
            C1295960jpS c1295960jpS2 = this.LLJL;
            if (c1295960jpS2 != null) {
                c1295960jpS2.setProgress(0.0f);
            }
            C1295960jpS c1295960jpS3 = this.LLJL;
            if (c1295960jpS3 != null) {
                c1295960jpS3.playAnimation();
            }
            zp(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(5)), 0);
        }
        C14J2 c14j2 = this.LLJLIL;
        if (c14j2 != null) {
            C786410Ut5.c1(c14j2, 0);
        }
        TuxTextView tuxTextView3 = this.LLJLL;
        if (tuxTextView3 != null) {
            tuxTextView3.setText("");
        }
        if (!C18081076h.LIZ() || (tuxTextView = this.LLJLL) == null || tuxTextView.getVisibility() != 0 || (tuxTextView2 = this.LLJLL) == null) {
            return;
        }
        C786410Ut5.LLLLZLL(tuxTextView2, 8);
    }

    public final void sp() {
        ValueAnimator valueAnimator = this.LLJZ;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.LLJZ = null;
        this.LLL = null;
    }

    @Override // X.InterfaceC712990Rxx
    public final void unBind() {
        C1295960jpS c1295960jpS;
        C1295960jpS c1295960jpS2;
        C07QJ.LIZ.getClass();
        if (C07QJ.LIZ()) {
            sp();
            C0GY8 c0gy8 = (C0GY8) this.LLLF.getValue();
            ValueAnimator valueAnimator = c0gy8.LIZ;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            c0gy8.LIZ = null;
            c0gy8.LIZIZ = null;
        }
        LinearLayoutCompat linearLayoutCompat = this.LLJJLIIIJLLLLLLLZ;
        if (linearLayoutCompat != null) {
            yp(linearLayoutCompat, AFwS314S0000000_27.get$arr$(15));
        }
        if ((C0B1N.LIZ() & 32) != 32 || (c1295960jpS = this.LLJL) == null || !c1295960jpS.isAnimating() || (c1295960jpS2 = this.LLJL) == null) {
            return;
        }
        c1295960jpS2.cancelAnimation();
    }

    public final void tp() {
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a1p, getContentView().getContext());
        final int iIntValue = numLIZJ != null ? numLIZJ.intValue() : 0;
        C1295960jpS c1295960jpS = this.LLJL;
        if (c1295960jpS != null) {
            c1295960jpS.addValueCallback(new C1295090jo3("**"), InterfaceC1295080jo2.LIZ, (InterfaceC1296040jpa<Integer>) new InterfaceC1296040jpa() { // from class: X.0ySv
                @Override // X.InterfaceC1296040jpa
                public final Object LIZ(C1295570jop c1295570jop) {
                    return Integer.valueOf(iIntValue);
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x021c  */
    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onViewCreated(android.view.View r12) {
        /*
            Method dump skipped, instruction units count: 588
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.tako.botpage.components.loading.TakoLoadingAssem.onViewCreated(android.view.View):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
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
    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final void up(InterfaceC1857950yRt interfaceC1857950yRt) {
        TuxTextView tuxTextView;
        int iLJ;
        TuxTextView tuxTextView2;
        Context context;
        String string;
        C1295960jpS c1295960jpS;
        Context context2;
        InterfaceC1857950yRt interfaceC1857950yRt2 = interfaceC1857950yRt;
        C14J2 c14j2 = this.LLLFF;
        if (c14j2 != null) {
            c14j2.setEnableGradientEffect(false);
        }
        if (interfaceC1857950yRt2.LIZ() == 3) {
            C07QJ.LIZ.getClass();
            if (C07QJ.LIZ()) {
                if (interfaceC1857950yRt2.LJJIFFI().isEmpty()) {
                    C1295960jpS c1295960jpS2 = this.LLJL;
                    if (c1295960jpS2 != null) {
                        C786410Ut5.LLD(0, c1295960jpS2);
                    }
                    op();
                    TuxTextView tuxTextView3 = this.LLJLL;
                    if (tuxTextView3 != null) {
                        C786410Ut5.LLLLZLL(tuxTextView3, 8);
                        return;
                    }
                    return;
                }
                List<TakoProcessInfo> listLJJIFFI = interfaceC1857950yRt2.LJJIFFI();
                ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(listLJJIFFI, 10));
                Iterator<TakoProcessInfo> it2 = listLJJIFFI.iterator();
                while (it2.hasNext()) {
                    arrayList.add(Integer.valueOf(it2.next().stage));
                }
                if (!arrayList.contains(1)) {
                    List<TakoProcessInfo> listLJJIFFI2 = interfaceC1857950yRt2.LJJIFFI();
                    ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(listLJJIFFI2, 10));
                    Iterator<TakoProcessInfo> it3 = listLJJIFFI2.iterator();
                    while (it3.hasNext()) {
                        arrayList2.add(Integer.valueOf(it3.next().stage));
                    }
                    if (!arrayList2.contains(7)) {
                        return;
                    }
                }
                List<TakoProcessInfo> listLJJIFFI3 = interfaceC1857950yRt2.LJJIFFI();
                ArrayList arrayList3 = new ArrayList(C15438062q.LJIJJ(listLJJIFFI3, 10));
                Iterator<TakoProcessInfo> it4 = listLJJIFFI3.iterator();
                while (it4.hasNext()) {
                    arrayList3.add(Integer.valueOf(it4.next().stage));
                }
                if (!arrayList3.contains(7) ? (context = getContext()) == null || (string = context.getString(2131849784)) == null : (context2 = getContext()) == null || (string = context2.getString(2131849880)) == null) {
                    string = "";
                }
                TuxTextView tuxTextView4 = this.LLJLL;
                if (tuxTextView4 != null && tuxTextView4.getVisibility() == 0) {
                    return;
                }
                if (this.LLJZIJLIL) {
                    this.LLL = string;
                    return;
                }
                ConstraintLayout constraintLayout = this.LLJLILLLLZIIL;
                if (constraintLayout == null || this.LLJLL == null || (c1295960jpS = this.LLJL) == null) {
                    return;
                }
                sp();
                this.LLJZIJLIL = true;
                if (!c1295960jpS.isAnimating()) {
                    c1295960jpS.setProgress(0.0f);
                    c1295960jpS.playAnimation();
                }
                C444830HcP c444830HcP = new C444830HcP();
                c444830HcP.LIZLLL = false;
                c444830HcP.LJIILIIL(string);
                c444830HcP.LJII(62);
                c444830HcP.LJIIIZ(1);
                c444830HcP.LIZIZ.LJII = TextUtils.TruncateAt.END;
                c444830HcP.LJIILL(0);
                int width = c444830HcP.LIZIZ().getWidth() + C814420VxA.LIZIZ(C418440Gaw.LIZIZ(32));
                int width2 = c1295960jpS.getWidth();
                if (width <= width2) {
                    up(string);
                    return;
                }
                ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(width2, width);
                valueAnimatorOfInt.setDuration(300L);
                valueAnimatorOfInt.setInterpolator(new AccelerateDecelerateInterpolator());
                valueAnimatorOfInt.addUpdateListener(new AUListenerS217S0200000_7(this, constraintLayout, 13));
                valueAnimatorOfInt.addListener(new ALAdapterS0S1100000_27(this, string, 0));
                valueAnimatorOfInt.start();
                this.LLJZ = valueAnimatorOfInt;
                return;
            }
            op();
            List<TakoProcessInfo> listLJJIFFI4 = interfaceC1857950yRt2.LJJIFFI();
            if (!(listLJJIFFI4 instanceof Collection) || !listLJJIFFI4.isEmpty()) {
                Iterator<TakoProcessInfo> it5 = listLJJIFFI4.iterator();
                while (it5.hasNext()) {
                    int i = it5.next().stage;
                    if (100 <= i && i < 201) {
                        TakoProcessInfo takoProcessInfo = (TakoProcessInfo) C13LP.LJJLIIIJL(interfaceC1857950yRt2.LJJIFFI());
                        if (takoProcessInfo == null) {
                            return;
                        }
                        String str = takoProcessInfo.stageName;
                        if (!C123100dR.LIZ(str) || str == null || (tuxTextView = this.LLJLL) == null) {
                            return;
                        }
                        if (tuxTextView.getVisibility() != 0 && (tuxTextView2 = this.LLJLL) != null) {
                            C786410Ut5.LLLLZLL(tuxTextView2, 0);
                        }
                        TuxTextView tuxTextView5 = this.LLJLL;
                        if (tuxTextView5 != null) {
                            tuxTextView5.setText(str);
                        }
                        Boolean boolValueOf = Boolean.valueOf(TextDirectionHeuristics.FIRSTSTRONG_LTR.isRtl(str, 0, str.length()));
                        this.LLJLLL = boolValueOf;
                        ConstraintLayout constraintLayout2 = this.LLJLILLLLZIIL;
                        if (constraintLayout2 != null) {
                            if (boolValueOf != null) {
                                iLJ = boolValueOf.booleanValue();
                            } else {
                                iLJ = C426750GoL.LJ(getContentView());
                            }
                            constraintLayout2.setLayoutDirection(iLJ);
                        }
                        zp(0, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(5)));
                        return;
                    }
                }
            }
            if (C18081076h.LIZ()) {
                return;
            }
            LinearLayoutCompat linearLayoutCompat = this.LLJJLIIIJLLLLLLLZ;
            List<TakoProcessInfo> listLJJIFFI5 = interfaceC1857950yRt2.LJJIFFI();
            TuxTextView tuxTextView6 = this.LLJLL;
            if (tuxTextView6 != null) {
                C339190DRl.LIZIZ(tuxTextView6);
            }
            if (linearLayoutCompat == null) {
                return;
            }
            C1857690yRT.LIZIZ(linearLayoutCompat, listLJJIFFI5.size(), new C474160Iic(this));
            yp(linearLayoutCompat, new AwS462S0200000_27((List) listLJJIFFI5, (List<TakoProcessInfo>) this, (TakoLoadingAssem) 19));
            return;
        }
        C1295960jpS c1295960jpS3 = this.LLJL;
        if (c1295960jpS3 == null) {
            return;
        }
        c1295960jpS3.cancelAnimation();
    }

    /* JADX WARN: Multi-variable type inference failed */
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
    public final void up(String str) {
        TuxTextView tuxTextView;
        C1295960jpS c1295960jpS;
        int iLJ;
        ConstraintLayout constraintLayout = this.LLJLILLLLZIIL;
        if (constraintLayout == null || (tuxTextView = this.LLJLL) == null || (c1295960jpS = this.LLJL) == null) {
            return;
        }
        C786410Ut5.LLD(8, c1295960jpS);
        c1295960jpS.pauseAnimation();
        tuxTextView.setText(str);
        C786410Ut5.LLLLZLL(tuxTextView, 0);
        ValueAnimator valueAnimator = ((C0GY8) this.LLLF.getValue()).LIZ;
        if (valueAnimator == null || !valueAnimator.isRunning()) {
            if (C299000Bnm.LIZ()) {
                C0GY8.LIZ((C0GY8) this.LLLF.getValue(), tuxTextView, TextDirectionHeuristics.FIRSTSTRONG_LTR.isRtl(str, 0, str.length()), 14);
            } else {
                C0GY8.LIZ((C0GY8) this.LLLF.getValue(), tuxTextView, false, 30);
            }
        }
        ViewGroup.LayoutParams layoutParams = constraintLayout.getLayoutParams();
        layoutParams.width = -2;
        C786410Ut5.m6(constraintLayout, layoutParams);
        ConstraintLayout constraintLayout2 = this.LLJLILLLLZIIL;
        if (constraintLayout2 != null) {
            Boolean boolValueOf = Boolean.valueOf(TextDirectionHeuristics.FIRSTSTRONG_LTR.isRtl(str, 0, str.length()));
            this.LLJLLL = boolValueOf;
            if (boolValueOf != null) {
                iLJ = boolValueOf.booleanValue();
            } else {
                iLJ = C426750GoL.LJ(getContentView());
            }
            constraintLayout2.setLayoutDirection(iLJ);
        }
        zp(0, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(5)));
        this.LLJZIJLIL = false;
        String str2 = this.LLL;
        if (str2 != null) {
            this.LLL = null;
            if (!Intrinsics.LJFF(str2, str)) {
                tuxTextView.setText(str2);
            }
        }
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ boolean ur(InterfaceC1857950yRt interfaceC1857950yRt) {
        return true;
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ void vr(InterfaceC1857950yRt interfaceC1857950yRt) {
    }

    @Override // X.InterfaceC712990Rxx
    public final void sr(InterfaceC1587906Jp interfaceC1587906Jp, List list) {
        up(interfaceC1587906Jp);
    }

    public final void yp(ViewGroup viewGroup, Function2<? super Integer, ? super C1858620ySy, Unit> function2) {
        Iterator it2 = new C1077420e8y((LinearLayoutCompat) viewGroup, 14).iterator();
        int i = 0;
        while (true) {
            C1077410e8x c1077410e8x = (C1077410e8x) it2;
            if (c1077410e8x.hasNext()) {
                Object next = c1077410e8x.next();
                int i2 = i + 1;
                if (i >= 0) {
                    function2.invoke(Integer.valueOf(i), ((View) next).findViewById(R.id.zvv));
                    i = i2;
                } else {
                    C1697810uHb.LJIJI();
                    throw null;
                }
            } else {
                return;
            }
        }
    }

    public final void zp(int i, int i2) {
        boolean zLJ;
        C1295960jpS c1295960jpS;
        C1295960jpS c1295960jpS2;
        if (this.LLJLL == null) {
            return;
        }
        Boolean bool = this.LLJLLL;
        if (bool != null) {
            zLJ = bool.booleanValue();
        } else {
            zLJ = C426750GoL.LJ(getContentView());
        }
        if (zLJ) {
            C1295960jpS c1295960jpS3 = this.LLJL;
            if (c1295960jpS3 != null) {
                C1857750yRZ.LJIIL(i2, c1295960jpS3);
            }
            C1295960jpS c1295960jpS4 = this.LLJL;
            if (c1295960jpS4 != null) {
                C1857750yRZ.LJIILIIL(i, c1295960jpS4);
            }
            if (C299000Bnm.LIZ() && (c1295960jpS2 = this.LLJL) != null) {
                C786410Ut5.Wb(c1295960jpS2, -1.0f);
                return;
            }
            return;
        }
        C1295960jpS c1295960jpS5 = this.LLJL;
        if (c1295960jpS5 != null) {
            C1857750yRZ.LJIILIIL(i2, c1295960jpS5);
        }
        C1295960jpS c1295960jpS6 = this.LLJL;
        if (c1295960jpS6 != null) {
            C1857750yRZ.LJIIL(i, c1295960jpS6);
        }
        if (C299000Bnm.LIZ() || (c1295960jpS = this.LLJL) == null) {
            return;
        }
        C786410Ut5.Wb(c1295960jpS, 1.0f);
    }
}
