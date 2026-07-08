package com.bytedance.android.livesdk.comp.impl.pcs.business.growth.form.cell;

import X.C019F;
import X.C01D1;
import X.C01GW;
import X.C03H5;
import X.C03IJ;
import X.C0HZQ;
import X.C0ZP4;
import X.C11H2;
import X.C11H6;
import X.C11H7;
import X.C11H9;
import X.C13LE;
import X.C1697810uHb;
import X.C16F5;
import X.C1727380v3I;
import X.C1727400v3K;
import X.C1727410v3L;
import X.C1727420v3M;
import X.C1727430v3N;
import X.C1727440v3O;
import X.C1727450v3P;
import X.C1727460v3Q;
import X.C1727470v3R;
import X.C1727480v3S;
import X.C1727490v3T;
import X.C1727500v3U;
import X.C1727510v3V;
import X.C1727520v3W;
import X.C1727530v3X;
import X.C1727540v3Y;
import X.C1727560v3a;
import X.C1727570v3b;
import X.C1727580v3c;
import X.C1727590v3d;
import X.C1727600v3e;
import X.C1727610v3f;
import X.C1727620v3g;
import X.C1727630v3h;
import X.C1727640v3i;
import X.C1727650v3j;
import X.C1727660v3k;
import X.C1727680v3m;
import X.C1727690v3n;
import X.C1727700v3o;
import X.C1727710v3p;
import X.C1727720v3q;
import X.C1727730v3r;
import X.C1727740v3s;
import X.C1727760v3u;
import X.C1727800v3y;
import X.C1734800vFG;
import X.C1770850wBP;
import X.C19474211Gy;
import X.C19719912Dl;
import X.C20736316Cj;
import X.C2188811AlT;
import X.C2217381BqS;
import X.C439101nJ;
import X.C452080Ho6;
import X.C452501pT;
import X.C497740JfY;
import X.C500260Jjc;
import X.C736680Sv4;
import X.C737910Sx3;
import X.C786410Ut5;
import X.InterfaceC0148002o;
import X.InterfaceC1631620sYq;
import X.InterfaceC1631630sYr;
import X.InterfaceC1685420txc;
import X.InterfaceC1685430txd;
import X.InterfaceC1891350zJl;
import X.InterfaceC2217241BqE;
import X.InterfaceC2217461Bqa;
import X.InterfaceC451590HnJ;
import X.InterfaceC724530SbT;
import X.InterfaceC725050ScJ;
import X.InterfaceC736810SvH;
import android.content.Context;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.LinearLayout;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.livesdk.comp.api.pcs.data.setting.form.LivePcsFormPrefillSetting;
import com.bytedance.android.livesdk.comp.impl.pcs.business.growth.form.vm.PcsFormVm;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.ies.powerlist.PowerCell;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.MatchResult;
import kotlin.text.Regex;
import webcast.data.SMBFormConsent;
import webcast.data.SMBFormDisclaimer;

/* JADX INFO: loaded from: classes27.dex */
public final class PcsFormPrivacyPolicyCell extends PowerCell<C1727540v3Y> implements InterfaceC724530SbT {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJILJILJ;
    public static final Regex LLJILLL;
    public final AssemVMLazy LL;
    public View LLILLJJLI;
    public C16F5 LLILLL;
    public ViewGroup LLILZ;
    public C16F5 LLILZIL;
    public C16F5 LLILZLL;
    public View LLIZ;
    public View LLIZLLLIL;
    public C0HZQ LLJ;
    public C16F5 LLJI;
    public C16F5 LLJIJIL;
    public final Map<String, C0HZQ> LLJILJIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(PcsFormPrivacyPolicyCell.class, "vm", "getVm()Lcom/bytedance/android/livesdk/comp/impl/pcs/business/growth/form/vm/PcsFormVm;", 0);
        C13LE.LIZ.getClass();
        LLJILJILJ = new InterfaceC2217461Bqa[]{c2217381BqS};
        LLJILLL = new Regex("\\([^)]*\\)");
    }

    @Override // X.InterfaceC724530SbT, X.InterfaceC736810SvH
    public final LifecycleOwner getActualLifecycleOwner() {
        return this;
    }

    @Override // X.InterfaceC725030ScH
    public final InterfaceC736810SvH getActualLifecycleOwnerHolder() {
        return this;
    }

    @Override // X.InterfaceC725050ScJ
    public final C03H5 getActualReceiver() {
        return this;
    }

    @Override // X.InterfaceC725030ScH
    public final InterfaceC725050ScJ<C03H5> getActualReceiverHolder() {
        return this;
    }

    @Override // X.InterfaceC725030ScH
    public final LifecycleOwner getHostLifecycleOwner() {
        return null;
    }

    @Override // X.InterfaceC725030ScH
    public final LifecycleOwner getOwnLifecycleOwner() {
        return this;
    }

    @Override // X.InterfaceC725030ScH
    public final C03H5 getReceiverForHostVM() {
        return null;
    }

    @Override // X.InterfaceC725030ScH
    public final boolean getUniqueOnlyDefault() {
        return true;
    }

    public final PcsFormVm N5() {
        AssemVMLazy assemVMLazy = this.LL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJILJILJ;
        return (PcsFormVm) assemVMLazy.getValue();
    }

    public final void P5() {
        for (Map.Entry entry : ((LinkedHashMap) this.LLJILJIL).entrySet()) {
            I5((String) entry.getKey(), (C0HZQ) entry.getValue());
        }
    }

    public PcsFormPrivacyPolicyCell() {
        AssemVMLazy assemVMLazy;
        Object obj = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(PcsFormVm.class);
        C1727430v3N c1727430v3N = new C1727430v3N(c19719912DlLIZ);
        C1727760v3u c1727760v3u = new C1727760v3u();
        if (Intrinsics.LJFF(obj, C01D1.LIZ)) {
            assemVMLazy = new AssemVMLazy(new C1727710v3p(c19719912DlLIZ), c1727430v3N, new C1727640v3i(), new C1727520v3W(this), new C1727440v3O(this), new C1727690v3n(this), c1727760v3u, new C1727410v3L(this), null, new C1727450v3P(this));
        } else if (obj instanceof InterfaceC451590HnJ) {
            C1727500v3U c1727500v3U = new C1727500v3U(this);
            C1727680v3m c1727680v3m = new C1727680v3m(this);
            C1727720v3q c1727720v3q = new C1727720v3q(c19719912DlLIZ);
            C01GW c01gwLIZIZ = C452501pT.LIZIZ(new C1727630v3h((InterfaceC451590HnJ) obj, c1727500v3U));
            C1727580v3c c1727580v3c = new C1727580v3c(c01gwLIZIZ);
            C1727590v3d c1727590v3d = new C1727590v3d(c01gwLIZIZ);
            C1727600v3e c1727600v3e = new C1727600v3e(c01gwLIZIZ);
            C1727610v3f c1727610v3f = new C1727610v3f(c01gwLIZIZ);
            C1727620v3g c1727620v3g = new C1727620v3g(c01gwLIZIZ);
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = C737910Sx3.LIZ;
            assemVMLazy = new AssemVMLazy(c1727720v3q, c1727430v3N, new C452080Ho6(), c1727580v3c, c1727590v3d, c1727680v3m, c1727760v3u, c1727600v3e, c1727610v3f, c1727620v3g);
        } else if (Intrinsics.LJFF(obj, obj)) {
            assemVMLazy = new AssemVMLazy(new C1727730v3r(c19719912DlLIZ), c1727430v3N, new C1727650v3j(), new C1727530v3X(this), new C1727490v3T(this), new C1727700v3o(this), c1727760v3u, new C1727400v3K(this), null, new C1727460v3Q(this));
        } else {
            if (!Intrinsics.LJFF(obj, C03IJ.LIZ)) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Don't support this VMScope: ");
                sbLIZ.append(obj);
                sbLIZ.append(" there");
                throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
            }
            assemVMLazy = new AssemVMLazy(new C1727740v3s(c19719912DlLIZ), c1727430v3N, new C1727660v3k(), new C1727510v3V(this), new C1727480v3S(this), new C1727470v3R(this), c1727760v3u, null, null, new C1727420v3M(this));
        }
        this.LL = assemVMLazy;
        this.LLJILJIL = new LinkedHashMap();
    }

    public final SpannableString L5(C1727540v3Y c1727540v3Y) {
        String strLJIJJ = C497740JfY.LJIJJ(2131856184, c1727540v3Y.LLILLJJLI);
        return C1727800v3y.LIZ(C497740JfY.LJIJJ(2131856180, c1727540v3Y.LLILLJJLI, strLJIJJ), strLJIJJ, 500, Integer.valueOf(R.attr.c9n), new C1727560v3a(this, c1727540v3Y), this.itemView.getContext());
    }

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
    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl) {
        CharSequence charSequence;
        CharSequence charSequenceConcat;
        C1727540v3Y c1727540v3Y = (C1727540v3Y) interfaceC1891350zJl;
        super.onBindItemView(c1727540v3Y);
        ((LinkedHashMap) this.LLJILJIL).clear();
        SMBFormDisclaimer sMBFormDisclaimer = c1727540v3Y.LLILZIL;
        int i = R.attr.ezt;
        if (sMBFormDisclaimer == null) {
            View view = this.LLILLJJLI;
            if (view != null) {
                C786410Ut5.LJLLLLLL(8, view);
            }
            ViewGroup viewGroup = this.LLILZ;
            if (viewGroup != null) {
                C786410Ut5.LJJJJI(viewGroup);
            }
        } else {
            View view2 = this.LLILLJJLI;
            if (view2 != null) {
                C500260Jjc.LLFFF(view2);
            }
            C16F5 c16f5 = this.LLILLL;
            if (c16f5 != null) {
                c16f5.setText(sMBFormDisclaimer.text);
            }
            ViewGroup viewGroup2 = this.LLILZ;
            if (viewGroup2 != null) {
                C786410Ut5.LJJJJI(viewGroup2);
            }
            int i2 = 0;
            for (SMBFormConsent sMBFormConsent : sMBFormDisclaimer.consents) {
                int i3 = i2 + 1;
                if (i2 >= 0) {
                    SMBFormConsent sMBFormConsent2 = sMBFormConsent;
                    N5();
                    String str = sMBFormConsent2.label;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append(i2);
                    sbLIZ.append(str);
                    final String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                    Context context = this.itemView.getContext();
                    LinearLayout linearLayout = new LinearLayout(context);
                    LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
                    layoutParams.topMargin = C439101nJ.LIZ(12);
                    C786410Ut5.d6(linearLayout, layoutParams);
                    linearLayout.setOrientation(0);
                    linearLayout.setGravity(16);
                    linearLayout.setClickable(true);
                    final C0HZQ c0hzq = new C0HZQ(context, null, 6);
                    LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
                    layoutParams2.topMargin = C439101nJ.LIZ(1);
                    layoutParams2.setMarginStart(C439101nJ.LIZ(1));
                    C786410Ut5.N6(c0hzq, layoutParams2);
                    c0hzq.setSize(0);
                    C16F5 c16f52 = new C16F5(context, null);
                    LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(0, -2);
                    layoutParams3.setMarginStart(C439101nJ.LIZ(9));
                    layoutParams3.weight = 1.0f;
                    C786410Ut5.y6(c16f52, layoutParams3);
                    c16f52.setTextAppearance(context, R.style.a9g);
                    c16f52.setTextColor(C20736316Cj.LIZIZ(R.attr.ezs, context));
                    if (sMBFormConsent2.isOptional) {
                        int iLIZIZ = C20736316Cj.LIZIZ(i, context);
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append(' ');
                        sbLIZ2.append(C497740JfY.LJIJI(2131856178));
                        String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ2);
                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(sMBFormConsent2.label);
                        spannableStringBuilder.append((CharSequence) strLIZIZ2);
                        C786410Ut5.q2(spannableStringBuilder, new ForegroundColorSpan(iLIZIZ), spannableStringBuilder.length() - strLIZIZ2.length(), spannableStringBuilder.length(), 33);
                        charSequence = spannableStringBuilder;
                    } else {
                        charSequence = sMBFormConsent2.label;
                    }
                    c16f52.setText(charSequence);
                    C786410Ut5.D7(c0hzq, null);
                    c0hzq.setChecked(Intrinsics.LJFF(((LinkedHashMap) N5().LLIZLLLIL).get(strLIZIZ), Boolean.TRUE));
                    C786410Ut5.D7(c0hzq, new CompoundButton.OnCheckedChangeListener() { // from class: X.0v3Z
                        @Override // android.widget.CompoundButton.OnCheckedChangeListener
                        public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                            PcsFormVm pcsFormVmN5 = this.LL.N5();
                            pcsFormVmN5.LLIZLLLIL.put(strLIZIZ, Boolean.valueOf(z));
                            this.LL.I5(strLIZIZ, c0hzq);
                        }
                    });
                    linearLayout.addView(c0hzq);
                    linearLayout.addView(c16f52);
                    C786410Ut5.R7(linearLayout, new View.OnClickListener() { // from class: X.0v3v
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view3) {
                            c0hzq.toggle();
                        }
                    });
                    this.LLJILJIL.put(strLIZIZ, c0hzq);
                    ViewGroup viewGroup3 = this.LLILZ;
                    if (viewGroup3 != null) {
                        viewGroup3.addView(linearLayout);
                    }
                    i2 = i3;
                    i = R.attr.ezt;
                } else {
                    C1697810uHb.LJIJI();
                    throw null;
                }
            }
            P5();
        }
        C16F5 c16f53 = this.LLILZIL;
        if (c16f53 != null) {
            c16f53.setText(C497740JfY.LJIJI(2131856182));
        }
        if (c1727540v3Y.LL) {
            charSequenceConcat = L5(c1727540v3Y);
        } else {
            String strLJIJI = C497740JfY.LJIJI(2131856183);
            charSequenceConcat = TextUtils.concat(L5(c1727540v3Y), " ", C1727800v3y.LIZ(C497740JfY.LJIJJ(2131856181, strLJIJI), strLJIJI, 500, Integer.valueOf(R.attr.c9n), new C1727570v3b(this, c1727540v3Y), this.itemView.getContext()));
        }
        C16F5 c16f54 = this.LLILZLL;
        if (c16f54 != null) {
            c16f54.setText(charSequenceConcat);
        }
        C16F5 c16f55 = this.LLILZLL;
        if (c16f55 != null) {
            c16f55.setLinksClickable(true);
        }
        C16F5 c16f56 = this.LLILZLL;
        if (c16f56 != null) {
            c16f56.setClickable(true);
        }
        C16F5 c16f57 = this.LLILZLL;
        if (c16f57 != null) {
            c16f57.setMovementMethod(LinkMovementMethod.getInstance());
        }
        N5();
        if (LivePcsFormPrefillSetting.INSTANCE.enableLocalStoragePrefill() && !C1734800vFG.LIZJ()) {
            View view3 = this.LLIZ;
            if (view3 != null) {
                C500260Jjc.LLFFF(view3);
            }
            C0HZQ c0hzq2 = this.LLJ;
            if (c0hzq2 != null) {
                c0hzq2.setSize(0);
            }
            C16F5 c16f58 = this.LLJI;
            if (c16f58 != null) {
                CharSequence charSequenceLJIJI = C497740JfY.LJIJI(2131856377);
                MatchResult matchResultFind$default = Regex.find$default(LLJILLL, charSequenceLJIJI, 0, 2, null);
                if (matchResultFind$default != null) {
                    int iLIZIZ2 = C20736316Cj.LIZIZ(R.attr.ezt, this.itemView.getContext());
                    SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(charSequenceLJIJI);
                    C786410Ut5.q2(spannableStringBuilder2, new ForegroundColorSpan(iLIZIZ2), matchResultFind$default.LIZIZ().LL, matchResultFind$default.LIZIZ().LLILLJJLI + 1, 33);
                    charSequenceLJIJI = spannableStringBuilder2;
                }
                c16f58.setText(charSequenceLJIJI);
            }
            C16F5 c16f59 = this.LLJIJIL;
            if (c16f59 != null) {
                c16f59.setText(C497740JfY.LJIJI(2131856376));
            }
            C0HZQ c0hzq3 = this.LLJ;
            if (c0hzq3 != null) {
                C786410Ut5.D7(c0hzq3, null);
                c0hzq3.setChecked(N5().LLJI);
                C786410Ut5.D7(c0hzq3, new CompoundButton.OnCheckedChangeListener() { // from class: X.0v3l
                    @Override // android.widget.CompoundButton.OnCheckedChangeListener
                    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                        this.LL.N5().LLJI = z;
                    }
                });
            }
            View view4 = this.LLIZLLLIL;
            if (view4 != null) {
                C786410Ut5.I7(new View.OnClickListener() { // from class: X.0v3t
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view5) {
                        C0HZQ c0hzq4 = this.LL.LLJ;
                        if (c0hzq4 != null) {
                            c0hzq4.toggle();
                        }
                    }
                }, view4);
                return;
            }
            return;
        }
        View view5 = this.LLIZ;
        if (view5 == null) {
            return;
        }
        C786410Ut5.LJLLLLLL(8, view5);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        View viewInflateItemView$default = PowerCell.inflateItemView$default(this, viewGroup, R.layout.hg0, false, 4, null);
        this.LLILLJJLI = viewInflateItemView$default.findViewById(R.id.fc5);
        viewInflateItemView$default.findViewById(R.id.fc7);
        this.LLILLL = (C16F5) viewInflateItemView$default.findViewById(R.id.fc6);
        this.LLILZ = (ViewGroup) viewInflateItemView$default.findViewById(R.id.epf);
        this.LLILZIL = (C16F5) viewInflateItemView$default.findViewById(R.id.ruk);
        this.LLILZLL = (C16F5) viewInflateItemView$default.findViewById(R.id.ruj);
        this.LLIZ = viewInflateItemView$default.findViewById(R.id.w8o);
        this.LLIZLLLIL = viewInflateItemView$default.findViewById(R.id.w8q);
        this.LLJ = (C0HZQ) viewInflateItemView$default.findViewById(R.id.w8n);
        this.LLJI = (C16F5) viewInflateItemView$default.findViewById(R.id.w8r);
        this.LLJIJIL = (C16F5) viewInflateItemView$default.findViewById(R.id.w8p);
        C736680Sv4.LJIIIIZZ(this, N5(), new C2217381BqS() { // from class: X.0v3H
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Boolean.valueOf(((C1734460vEi) obj).LLILZ);
            }
        }, null, new C1727380v3I(this), 6);
        return viewInflateItemView$default;
    }

    public final void I5(String str, C0HZQ c0hzq) {
        int i;
        if (N5().getState().LLILZ && N5().LLJ.contains(str) && !Intrinsics.LJFF(((LinkedHashMap) N5().LLIZLLLIL).get(str), Boolean.TRUE)) {
            i = R.attr.exz;
        } else {
            i = R.attr.esc;
        }
        c0hzq.setCheckBoxUncheckedColor(C20736316Cj.LIZIZ(i, this.itemView.getContext()));
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o> C0ZP4 subscribe(AssemViewModel<S> assemViewModel, C1770850wBP<S> c1770850wBP, Function1<? super Throwable, Unit> function1, Function2<? super C03H5, ? super S, Unit> function2) {
        return C736680Sv4.LJIILLIIL(this, assemViewModel, c1770850wBP, function1, function2);
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o, A> C0ZP4 selectSubscribe(AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, C1770850wBP<C11H9<A>> c1770850wBP, Function1<? super Throwable, Unit> function1, Function2<? super C03H5, ? super A, Unit> function2) {
        return C736680Sv4.LJ(this, assemViewModel, interfaceC2217241BqE, c1770850wBP, function1, function2);
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o, A> C0ZP4 selectSubscribeOnAsync(AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, C1770850wBP<C11H9<A>> c1770850wBP, Function1<? super Throwable, Unit> function1, Function2<? super C03H5, ? super A, Unit> function2) {
        return C736680Sv4.LJIILJJIL(this, assemViewModel, interfaceC2217241BqE, c1770850wBP, function1, function2);
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o, A, B> C0ZP4 selectSubscribe(AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, InterfaceC2217241BqE<S, ? extends B> interfaceC2217241BqE2, C1770850wBP<C19474211Gy<A, B>> c1770850wBP, Function1<? super Throwable, Unit> function1, InterfaceC1631620sYq<? super C03H5, ? super A, ? super B, Unit> interfaceC1631620sYq) {
        return C736680Sv4.LIZLLL(assemViewModel, this, c1770850wBP, function1, interfaceC1631620sYq, interfaceC2217241BqE, interfaceC2217241BqE2);
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o, A, B, C> C0ZP4 selectSubscribe(AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, InterfaceC2217241BqE<S, ? extends B> interfaceC2217241BqE2, InterfaceC2217241BqE<S, ? extends C> interfaceC2217241BqE3, C1770850wBP<C11H7<A, B, C>> c1770850wBP, Function1<? super Throwable, Unit> function1, InterfaceC1631630sYr<? super C03H5, ? super A, ? super B, ? super C, Unit> interfaceC1631630sYr) {
        return C736680Sv4.LJFF(this, assemViewModel, interfaceC2217241BqE, interfaceC2217241BqE2, interfaceC2217241BqE3, c1770850wBP, function1, interfaceC1631630sYr);
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o, A, B, C, D> C0ZP4 selectSubscribe(AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, InterfaceC2217241BqE<S, ? extends B> interfaceC2217241BqE2, InterfaceC2217241BqE<S, ? extends C> interfaceC2217241BqE3, InterfaceC2217241BqE<S, ? extends D> interfaceC2217241BqE4, C1770850wBP<C11H6<A, B, C, D>> c1770850wBP, Function1<? super Throwable, Unit> function1, InterfaceC1685420txc<? super C03H5, ? super A, ? super B, ? super C, ? super D, Unit> interfaceC1685420txc) {
        return C736680Sv4.LJI(this, assemViewModel, interfaceC2217241BqE, interfaceC2217241BqE2, interfaceC2217241BqE3, interfaceC2217241BqE4, c1770850wBP, function1, interfaceC1685420txc);
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o, A, B, C, D, E> C0ZP4 selectSubscribe(AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, InterfaceC2217241BqE<S, ? extends B> interfaceC2217241BqE2, InterfaceC2217241BqE<S, ? extends C> interfaceC2217241BqE3, InterfaceC2217241BqE<S, ? extends D> interfaceC2217241BqE4, InterfaceC2217241BqE<S, ? extends E> interfaceC2217241BqE5, C1770850wBP<C11H2<A, B, C, D, E>> c1770850wBP, Function1<? super Throwable, Unit> function1, InterfaceC1685430txd<? super C03H5, ? super A, ? super B, ? super C, ? super D, ? super E, Unit> interfaceC1685430txd) {
        return C736680Sv4.LJII(this, assemViewModel, interfaceC2217241BqE, interfaceC2217241BqE2, interfaceC2217241BqE3, interfaceC2217241BqE4, interfaceC2217241BqE5, c1770850wBP, function1, interfaceC1685430txd);
    }
}
