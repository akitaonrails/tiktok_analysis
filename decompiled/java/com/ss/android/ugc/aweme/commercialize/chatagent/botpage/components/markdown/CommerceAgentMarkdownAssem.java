package com.ss.android.ugc.aweme.commercialize.chatagent.botpage.components.markdown;

import X.AnonymousClass0652;
import X.C01GW;
import X.C08LY;
import X.C08QT;
import X.C09RB;
import X.C09RD;
import X.C0DIA;
import X.C11GT;
import X.C12NX;
import X.C12NY;
import X.C12NZ;
import X.C1308910kAL;
import X.C13BV;
import X.C14J3;
import X.C15438062q;
import X.C1697810uHb;
import X.C1889507af;
import X.C19744812Na;
import X.C19745012Nc;
import X.C2097908Jt;
import X.C321730CjL;
import X.C418440Gaw;
import X.C431110GvN;
import X.C444910HcX;
import X.C452501pT;
import X.C786410Ut5;
import X.C814420VxA;
import X.InterfaceC1587906Jp;
import X.InterfaceC2273511Dyn;
import X.InterfaceC712990Rxx;
import android.content.Context;
import android.graphics.Paint;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.style.LineHeightSpan;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.bytedance.mt.protector.impl.PatternProtector;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.commercialize.chatagent.botpage.cards.ability.CommerceAgentCardAbility;
import com.ss.android.ugc.aweme.commercialize.chatagent.common.ui.markdown.style.CommerceAgentMarkDownBulletSpan;
import com.ss.android.ugc.aweme.commercialize.chatagent.common.ui.markdown.style.LinkUnderLineSpan;
import com.ss.android.ugc.aweme.commercialize.chatagent.msg.base.api.Message;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.search.ISearchMarkdownService;
import com.zhiliaoapp.musically.R;
import java.io.BufferedReader;
import java.io.StringReader;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS273S0000000_29;
import kotlin.jvm.internal.AwS573S0100000_29;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes30.dex */
public final class CommerceAgentMarkdownAssem extends ReusedUISlotAssem<CommerceAgentMarkdownAssem> implements InterfaceC712990Rxx<C0DIA> {
    public final C01GW LLJJLIIIJLLLLLLLZ = C452501pT.LIZIZ(new AwS573S0100000_29(this, 80));
    public LinearLayout LLJL;

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int Oo() {
        return R.layout.aju;
    }

    @Override // X.InterfaceC712990Rxx
    public final void unBind() {
    }

    @Override // X.InterfaceC712990Rxx
    public final void wr() {
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        this.LLJL = (LinearLayout) view.findViewById(R.id.nbz);
    }

    /* JADX WARN: Type inference failed for: r10v3, types: [X.0Gns] */
    /* JADX WARN: Type inference failed for: r5v4, types: [X.1Dyj] */
    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final void up(C0DIA c0dia) {
        View view;
        Iterable<C19744812Na> iterable;
        Object obj;
        String str;
        CharSequence c444910HcX;
        int iIntValue;
        final boolean z;
        Spannable spannableLIZ;
        int iLIZIZ;
        Message messageLI2;
        String str2;
        Message messageLI22;
        Message messageLI23;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        int iLIZIZ2;
        int i;
        Integer numValueOf;
        int i2;
        C0DIA c0dia2 = c0dia;
        LinearLayout linearLayout = this.LLJL;
        if (linearLayout != null) {
            Object parent = linearLayout.getParent();
            if (parent instanceof View) {
                view = (View) parent;
                while (view != null && !(view instanceof C14J3)) {
                    Object parent2 = view.getParent();
                    if (parent2 instanceof View) {
                        view = (View) parent2;
                    } else {
                        view = null;
                        break;
                    }
                }
            } else {
                view = null;
                break;
            }
            if (!(view instanceof C14J3)) {
                view = null;
            }
            boolean z2 = false;
            if (view != null) {
                if (AnonymousClass0652.LIZ(c0dia2.getText())) {
                    i2 = 0;
                } else {
                    i2 = 8;
                }
                C786410Ut5.LJLLLLLL(i2, view);
            }
            C12NY c12ny = new C12NY(linearLayout, (CommerceAgentCardAbility) this.LLJJLIIIJLLLLLLLZ.getValue());
            C19745012Nc c19745012Nc = new Object() { // from class: X.12Nc
            };
            String text = c0dia2.getText();
            c19745012Nc.getClass();
            boolean z3 = true;
            if (text == null) {
                iterable = C13BV.INSTANCE;
            } else {
                Matcher matcher = PatternProtector.compile("(<u><b>)([\\s\\S]+?)(</b></u>)").matcher(text);
                ArrayList arrayList = new ArrayList();
                int iEnd = 0;
                while (matcher.find()) {
                    if (iEnd < matcher.start()) {
                        arrayList.add(new C19744812Na(text.substring(iEnd, matcher.start()), false));
                    }
                    arrayList.add(new C19744812Na(matcher.group(), true));
                    iEnd = matcher.end() + 1;
                }
                iterable = arrayList;
                if (iEnd < text.length()) {
                    arrayList.add(new C19744812Na(text.substring(iEnd, text.length()), false));
                    iterable = arrayList;
                }
            }
            ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(iterable, 10));
            int i3 = 0;
            for (C19744812Na c19744812Na : iterable) {
                String str3 = c19744812Na.LIZ;
                boolean z4 = c19744812Na.LIZIZ;
                if (z4) {
                    i = i3 + 1;
                    numValueOf = Integer.valueOf(i3);
                } else {
                    i = i3;
                    numValueOf = null;
                }
                arrayList2.add(new C1889507af(numValueOf, str3, z4));
                i3 = i;
            }
            int size = arrayList2.size();
            C11GT c11gt = new C11GT(c12ny);
            if (linearLayout.getContext() != null) {
                int childCount = size - linearLayout.getChildCount();
                if (childCount > 0) {
                    int i4 = 0;
                    do {
                        if (linearLayout.getChildCount() < size) {
                            linearLayout.addView((View) c11gt.invoke(linearLayout, linearLayout.getContext()));
                        }
                        i4++;
                    } while (i4 < childCount);
                } else {
                    int i5 = -childCount;
                    if (linearLayout.getChildCount() >= i5) {
                        try {
                            C786410Ut5.LJJZ(linearLayout.getChildCount() - i5, i5, linearLayout);
                        } catch (Exception e) {
                            TryCatchGuardChecker.doCheck(e);
                        }
                    }
                }
            }
            CommerceAgentCardAbility commerceAgentCardAbility = c12ny.LIZIZ;
            C08QT c08qt = new C08QT(C09RB.LJIIJJI(new C08LY(new C09RD(linearLayout), AFwS273S0000000_29.get$arr$(340))));
            int i6 = 0;
            while (c08qt.hasNext()) {
                Object next = c08qt.next();
                int i7 = i6 + 1;
                if (i6 >= 0) {
                    final TextView textView = (TextView) next;
                    textView.setMovementMethod(C431110GvN.LIZ);
                    textView.setClickable(z2);
                    textView.setLongClickable(z2);
                    ViewGroup.LayoutParams layoutParams = textView.getLayoutParams();
                    if ((layoutParams instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams) != null) {
                        if (i6 == 0) {
                            iLIZIZ2 = 0;
                        } else {
                            iLIZIZ2 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12));
                        }
                        marginLayoutParams.topMargin = iLIZIZ2;
                    }
                    if (i6 < arrayList2.size()) {
                        obj = ListProtector.get(arrayList2, i6);
                    } else {
                        obj = null;
                    }
                    C1889507af c1889507af = (C1889507af) obj;
                    if (c1889507af != null) {
                        if (commerceAgentCardAbility != null && (messageLI23 = commerceAgentCardAbility.LI2()) != null) {
                            str = messageLI23.uuid;
                        } else {
                            str = null;
                        }
                        if (!Intrinsics.LJFF(str, C12NY.LJ)) {
                            textView.setText(c1889507af.LL);
                            if (commerceAgentCardAbility != null && (messageLI22 = commerceAgentCardAbility.LI2()) != null) {
                                str2 = messageLI22.uuid;
                            } else {
                                str2 = null;
                            }
                            C12NY.LJ = str2;
                        }
                        try {
                            C19745012Nc c19745012Nc2 = new Object() { // from class: X.12Nc
                            };
                            final String strLIZIZ = c1889507af.LL;
                            final C12NX c12nx = c12ny.LIZLLL;
                            final C12NZ c12nz = c12ny.LIZJ;
                            try {
                                final Map mapLIZJ = C2097908Jt.LIZJ(new Pair("rank", c1889507af.LLILLL));
                                if (commerceAgentCardAbility != null && (messageLI2 = commerceAgentCardAbility.LI2()) != null && C321730CjL.LIZJ(messageLI2) == z3) {
                                    z = true;
                                } else {
                                    z = false;
                                }
                                c19745012Nc2.getClass();
                                if (z) {
                                    ISearchMarkdownService iSearchMarkdownService = (ISearchMarkdownService) PluggableExtentionKt.pluggableSpi$default(ISearchMarkdownService.class, false, false, false, 14, null);
                                    if (iSearchMarkdownService != null) {
                                        strLIZIZ = iSearchMarkdownService.LIZIZ(strLIZIZ);
                                    } else {
                                        strLIZIZ = null;
                                    }
                                }
                                try {
                                    final ?? r10 = new InterfaceC2273511Dyn(textView, c12nx, c12nz, mapLIZJ, z) { // from class: X.0Gns
                                        public final TextView LIZ;
                                        public final InterfaceC418230Gab LIZIZ;
                                        public final InterfaceC426470Gnt LIZJ;
                                        public final Map<String, Object> LIZLLL;
                                        public final boolean LJ;
                                        public final int LJFF = -1;
                                        public final int LJI;
                                        public final int LJII;
                                        public final int LJIIIIZZ;
                                        public final int LJIIIZ;

                                        @Override // X.InterfaceC2273511Dyn
                                        public final SpannableStringBuilder LIZ(CharSequence charSequence) {
                                            return SpannableStringBuilder.valueOf(charSequence);
                                        }

                                        @Override // X.InterfaceC2273511Dyn
                                        public final SpannableStringBuilder LIZJ(CharSequence charSequence) {
                                            return SpannableStringBuilder.valueOf(charSequence);
                                        }

                                        @Override // X.InterfaceC2273511Dyn
                                        public final SpannableStringBuilder LIZLLL(CharSequence charSequence) {
                                            SpannableStringBuilder spannableStringBuilderValueOf = SpannableStringBuilder.valueOf(charSequence);
                                            C418220Gaa c418220Gaa = new C418220Gaa(this.LJIIIZ, charSequence, this.LIZLLL, this.LIZIZ);
                                            C444920HcY c444920HcY = new C444920HcY(42, true);
                                            C786410Ut5.q2(spannableStringBuilderValueOf, c418220Gaa, 0, charSequence.length(), 33);
                                            C786410Ut5.q2(spannableStringBuilderValueOf, c444920HcY, 0, charSequence.length(), 33);
                                            return spannableStringBuilderValueOf;
                                        }

                                        @Override // X.InterfaceC2273511Dyn
                                        public final void LJ(SpannableStringBuilder spannableStringBuilder) {
                                            SpannableString spannableString = new SpannableString("\n");
                                            C786410Ut5.p2(spannableString, new LineHeightSpan(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8))) { // from class: X.0GVk
                                                public final int LL;

                                                {
                                                    this.LL = i;
                                                }

                                                @Override // android.text.style.LineHeightSpan
                                                public final void chooseHeight(CharSequence charSequence, int i8, int i9, int i10, int i11, Paint.FontMetricsInt fontMetricsInt) {
                                                    Spanned spanned;
                                                    if ((charSequence instanceof Spanned) && (spanned = (Spanned) charSequence) != null) {
                                                        Integer numValueOf2 = Integer.valueOf(spanned.getSpanStart(this));
                                                        Integer numValueOf3 = Integer.valueOf(spanned.getSpanEnd(this));
                                                        if (numValueOf2 != null && i8 == numValueOf2.intValue()) {
                                                            int i12 = fontMetricsInt.ascent;
                                                            int i13 = this.LL;
                                                            fontMetricsInt.ascent = i12 - i13;
                                                            fontMetricsInt.top -= i13;
                                                        }
                                                        if (numValueOf3 != null && i9 == numValueOf3.intValue()) {
                                                            int i14 = fontMetricsInt.descent;
                                                            int i15 = this.LL;
                                                            fontMetricsInt.descent = i14 + i15;
                                                            fontMetricsInt.bottom += i15;
                                                        }
                                                    }
                                                }
                                            }, spannableString.length() - 1, spannableString.length(), 17);
                                            spannableStringBuilder.append((CharSequence) spannableString);
                                        }

                                        /* JADX WARN: Removed duplicated region for block: B:15:0x0046  */
                                        @Override // X.InterfaceC2273511Dyn
                                        /*
                                            Code decompiled incorrectly, please refer to instructions dump.
                                            To view partially-correct add '--show-bad-code' argument
                                        */
                                        public final android.text.SpannableStringBuilder LJII(java.lang.CharSequence r11) {
                                            /*
                                                r10 = this;
                                                android.text.SpannableStringBuilder r3 = android.text.SpannableStringBuilder.valueOf(r11)
                                                boolean r0 = r10.LJ
                                                if (r0 == 0) goto L46
                                                android.widget.TextView r0 = r10.LIZ
                                                r9 = 0
                                                if (r0 == 0) goto L46
                                                android.content.Context r0 = r0.getContext()
                                                if (r0 == 0) goto L46
                                                java.lang.Class<com.ss.android.ugc.aweme.search.ISearchMarkdownService> r4 = com.ss.android.ugc.aweme.search.ISearchMarkdownService.class
                                                r5 = 0
                                                r8 = 14
                                                r6 = r5
                                                r7 = r5
                                                java.lang.Object r1 = com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt.pluggableSpi$default(r4, r5, r6, r7, r8, r9)
                                                com.ss.android.ugc.aweme.search.ISearchMarkdownService r1 = (com.ss.android.ugc.aweme.search.ISearchMarkdownService) r1
                                                if (r1 == 0) goto L3b
                                                android.widget.TextView r0 = r10.LIZ
                                                android.content.Context r0 = r0.getContext()
                                                android.graphics.Bitmap r2 = r1.LJI(r0)
                                                if (r2 == 0) goto L3b
                                                X.0GaQ r9 = new X.0GaQ
                                                int r1 = r10.LJII
                                                int r0 = r10.LJIIIIZZ
                                                r9.<init>(r1, r0, r2)
                                                X.0Gab r0 = r10.LIZIZ
                                                r9.LLJI = r0
                                            L3b:
                                                int r2 = r11.length()
                                                r1 = 33
                                                r0 = 0
                                                X.C786410Ut5.q2(r3, r9, r0, r2, r1)
                                                return r3
                                            L46:
                                                X.0GaN r9 = new X.0GaN
                                                int r1 = r10.LJII
                                                int r0 = r10.LJIIIIZZ
                                                r9.<init>(r1, r0, r11)
                                                X.0Gab r0 = r10.LIZIZ
                                                r9.LLJI = r0
                                                goto L3b
                                            */
                                            throw new UnsupportedOperationException("Method not decompiled: X.C426460Gns.LJII(java.lang.CharSequence):android.text.SpannableStringBuilder");
                                        }

                                        @Override // X.InterfaceC2273511Dyn
                                        public final SpannableStringBuilder LJIIIIZZ(CharSequence charSequence) {
                                            SpannableStringBuilder spannableStringBuilderValueOf = SpannableStringBuilder.valueOf(charSequence);
                                            C786410Ut5.q2(spannableStringBuilderValueOf, new C444920HcY(52, true), 0, spannableStringBuilderValueOf.length(), 33);
                                            return spannableStringBuilderValueOf;
                                        }

                                        @Override // X.InterfaceC2273511Dyn
                                        public final SpannableStringBuilder LJFF(CharSequence charSequence, CharSequence charSequence2) {
                                            SpannableStringBuilder spannableStringBuilderValueOf = SpannableStringBuilder.valueOf(charSequence);
                                            LinkUnderLineSpan linkUnderLineSpan = new LinkUnderLineSpan(charSequence, charSequence2, this.LIZIZ, this.LIZLLL);
                                            C786410Ut5.q2(spannableStringBuilderValueOf, linkUnderLineSpan, 0, ((String) charSequence).length(), 33);
                                            LinkedHashMap linkedHashMap = new LinkedHashMap();
                                            Map<String, Object> map = this.LIZLLL;
                                            if (map != null) {
                                                linkedHashMap.putAll(map);
                                            }
                                            linkedHashMap.put("origin_url", charSequence2);
                                            InterfaceC426470Gnt interfaceC426470Gnt = this.LIZJ;
                                            if (interfaceC426470Gnt != null) {
                                                interfaceC426470Gnt.LIZ(linkUnderLineSpan, charSequence, linkedHashMap);
                                            }
                                            return spannableStringBuilderValueOf;
                                        }

                                        @Override // X.InterfaceC2273511Dyn
                                        public final SpannableStringBuilder LJI(int i8, CharSequence charSequence) {
                                            SpannableStringBuilder spannableStringBuilderValueOf = SpannableStringBuilder.valueOf(charSequence);
                                            C786410Ut5.q2(spannableStringBuilderValueOf, new CommerceAgentMarkDownBulletSpan(i8, this.LJFF, 0), 0, spannableStringBuilderValueOf.length(), 33);
                                            return spannableStringBuilderValueOf;
                                        }

                                        {
                                            Context context;
                                            int iIntValue2;
                                            int iIntValue3;
                                            int iIntValue4;
                                            this.LIZ = textView;
                                            this.LIZIZ = c12nx;
                                            this.LIZJ = c12nz;
                                            this.LIZLLL = mapLIZJ;
                                            this.LJ = z;
                                            new WeakReference(this.LIZ);
                                            if (textView != null && (context = textView.getContext()) != null) {
                                                Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a1h, context);
                                                if (numLIZJ != null) {
                                                    iIntValue2 = numLIZJ.intValue();
                                                } else {
                                                    iIntValue2 = 0;
                                                }
                                                this.LJI = iIntValue2;
                                                Integer numLIZJ2 = C1308910kAL.LIZJ(R.attr.a1k, context);
                                                if (numLIZJ2 != null) {
                                                    iIntValue3 = numLIZJ2.intValue();
                                                } else {
                                                    iIntValue3 = 0;
                                                }
                                                this.LJII = iIntValue3;
                                                Integer numLIZJ3 = C1308910kAL.LIZJ(R.attr.br, context);
                                                if (numLIZJ3 != null) {
                                                    iIntValue4 = numLIZJ3.intValue();
                                                } else {
                                                    iIntValue4 = 0;
                                                }
                                                this.LJIIIIZZ = iIntValue4;
                                                Integer numLIZJ4 = C1308910kAL.LIZJ(R.attr.d5, context);
                                                this.LJIIIZ = numLIZJ4 != null ? numLIZJ4.intValue() : 0;
                                                Integer numLIZJ5 = C1308910kAL.LIZJ(R.attr.bb, context);
                                                if (numLIZJ5 != null) {
                                                    numLIZJ5.intValue();
                                                }
                                            }
                                        }

                                        @Override // X.InterfaceC2273511Dyn
                                        public final SpannableStringBuilder LIZIZ(int i8, int i9, int i10, CharSequence charSequence, String str4) {
                                            SpannableStringBuilder spannableStringBuilderValueOf = SpannableStringBuilder.valueOf(charSequence);
                                            if (str4 != null) {
                                                Matcher matcher2 = PatternProtector.compile("\\d+").matcher(str4);
                                                if (matcher2.find()) {
                                                    try {
                                                        i9 = CastIntegerProtector.parseInt(matcher2.group());
                                                    } catch (Exception e2) {
                                                        TryCatchGuardChecker.doCheck(e2);
                                                    }
                                                }
                                            }
                                            CommerceAgentMarkDownBulletSpan commerceAgentMarkDownBulletSpan = new CommerceAgentMarkDownBulletSpan(i8, this.LJI, i9);
                                            commerceAgentMarkDownBulletSpan.LIZ(i10);
                                            C786410Ut5.q2(spannableStringBuilderValueOf, commerceAgentMarkDownBulletSpan, 0, spannableStringBuilderValueOf.length(), 33);
                                            return spannableStringBuilderValueOf;
                                        }
                                    };
                                    try {
                                        spannableLIZ = new Object(strLIZIZ, r10) { // from class: X.1Dyj
                                            public final InterfaceC2273511Dyn LIZ;
                                            public final C2273451Dyh LIZIZ;
                                            public final BufferedReader LIZJ;

                                            public final Spannable LIZ() {
                                                C2273491Dyl c2273491Dyl;
                                                String line = this.LIZJ.readLine();
                                                SpannableStringBuilder spannableStringBuilder = null;
                                                final C2260251DdP c2260251DdP = null;
                                                C2273491Dyl c2273491Dyl2 = null;
                                                while (line != null) {
                                                    C2273491Dyl c2273491Dyl3 = new C2273491Dyl(line);
                                                    if (c2273491Dyl2 == null) {
                                                        c2260251DdP = new C2260251DdP(c2273491Dyl3);
                                                        c2273491Dyl2 = c2273491Dyl3;
                                                    } else if (c2260251DdP != null) {
                                                        c2260251DdP.LIZJ.LIZIZ(c2273491Dyl3);
                                                        c2260251DdP.LIZJ = c2273491Dyl3;
                                                    }
                                                    line = this.LIZJ.readLine();
                                                }
                                                if (c2260251DdP != null) {
                                                    this.LIZIZ.LIZIZ = new InterfaceC2273551Dyr() { // from class: X.1Dyp
                                                        @Override // X.InterfaceC2273551Dyr
                                                        public final C2260251DdP LJII() {
                                                            return c2260251DdP;
                                                        }
                                                    };
                                                    while (true) {
                                                        C2273491Dyl c2273491Dyl4 = c2260251DdP.LIZIZ;
                                                        if (c2273491Dyl4 == null || !C2273451Dyh.LIZIZ(25, c2273491Dyl4)) {
                                                            break;
                                                        }
                                                        C2273491Dyl c2273491Dyl5 = c2260251DdP.LIZIZ;
                                                        C2273491Dyl c2273491Dyl6 = c2260251DdP.LIZJ;
                                                        if (c2273491Dyl5 == c2273491Dyl6) {
                                                            c2273491Dyl = c2273491Dyl6.LIZ;
                                                        } else {
                                                            c2273491Dyl = c2273491Dyl5.LIZIZ;
                                                            if (c2273491Dyl5 == c2260251DdP.LIZ) {
                                                                c2260251DdP.LIZ = c2273491Dyl;
                                                            }
                                                        }
                                                        if (c2273491Dyl5.LIZJ == null) {
                                                            c2273491Dyl5.LJI();
                                                        } else {
                                                            c2273491Dyl5.LJFF();
                                                        }
                                                        c2260251DdP.LIZIZ = c2273491Dyl;
                                                    }
                                                    if (c2260251DdP.LIZIZ != null && c2260251DdP.LIZ != null) {
                                                        if (c2260251DdP.LIZJ == null) {
                                                            return null;
                                                        }
                                                        do {
                                                            C2273491Dyl c2273491Dyl7 = c2260251DdP.LIZIZ;
                                                            boolean zLJII = this.LIZIZ.LJII(c2273491Dyl7);
                                                            boolean zLJIIIZ = this.LIZIZ.LJIIIZ(c2273491Dyl7);
                                                            if (!zLJII && !zLJIIIZ) {
                                                                c2273491Dyl7.LJFF = SpannableStringBuilder.valueOf(c2273491Dyl7.LJ);
                                                                this.LIZIZ.LJ(c2273491Dyl7);
                                                            }
                                                        } while (c2260251DdP.LIZ());
                                                        c2260251DdP.LIZIZ = c2260251DdP.LIZ;
                                                        spannableStringBuilder = new SpannableStringBuilder();
                                                        do {
                                                            C2273491Dyl c2273491Dyl8 = c2260251DdP.LIZIZ;
                                                            C2273491Dyl c2273491Dyl9 = c2273491Dyl8.LIZIZ;
                                                            spannableStringBuilder.append(c2273491Dyl8.LJFF);
                                                            if (c2273491Dyl9 == null) {
                                                                break;
                                                            }
                                                            InterfaceC2273511Dyn interfaceC2273511Dyn = this.LIZ;
                                                            if (interfaceC2273511Dyn != null) {
                                                                interfaceC2273511Dyn.LJ(spannableStringBuilder);
                                                            }
                                                        } while (c2260251DdP.LIZ());
                                                    }
                                                }
                                                return spannableStringBuilder;
                                            }

                                            {
                                                this.LIZ = r10;
                                                this.LIZIZ = new C2273451Dyh(r10);
                                                this.LIZJ = new BufferedReader(new StringReader(strLIZIZ == null ? "" : strLIZIZ));
                                            }
                                        }.LIZ();
                                    } catch (Exception e2) {
                                        TryCatchGuardChecker.doCheck(e2);
                                    }
                                } catch (Exception e3) {
                                    e = e3;
                                }
                            } catch (Exception e4) {
                                e = e4;
                            }
                        } catch (Exception e5) {
                            e = e5;
                        }
                        if (spannableLIZ != null) {
                            if (c1889507af.LLILLJJLI) {
                                iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(5));
                            } else {
                                iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4));
                            }
                            try {
                                textView.setPadding(0, 0, 0, iLIZIZ);
                                c444910HcX = new C444910HcX(spannableLIZ);
                            } catch (Exception e6) {
                                e = e6;
                                TryCatchGuardChecker.doCheck(e);
                                c444910HcX = null;
                            }
                        } else {
                            c444910HcX = null;
                        }
                        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.agr, new ContextThemeWrapper(textView.getContext(), R.style.y0));
                        if (numLIZJ != null) {
                            iIntValue = numLIZJ.intValue();
                        } else {
                            iIntValue = 0;
                        }
                        textView.setTextColor(iIntValue);
                        if (c444910HcX == null) {
                            c444910HcX = c1889507af.LL;
                        }
                        textView.setText(c444910HcX);
                    }
                    z2 = false;
                    i6 = i7;
                    z3 = true;
                } else {
                    C1697810uHb.LJIJI();
                    throw null;
                }
            }
        }
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ boolean ur(C0DIA c0dia) {
        return true;
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ void vr(C0DIA c0dia) {
    }

    @Override // X.InterfaceC712990Rxx
    public final void sr(InterfaceC1587906Jp interfaceC1587906Jp, List list) {
        up(interfaceC1587906Jp);
    }
}
