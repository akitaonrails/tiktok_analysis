package com.ss.android.ugc.aweme.im.ai.impl.smartreply.sources;

import X.C01GW;
import X.C0ID1;
import X.C1308910kAL;
import X.C1331660kl2;
import X.C1331670kl3;
import X.C1331730kl9;
import X.C1331750klB;
import X.C1332130kln;
import X.C1781740wSy;
import X.C1783710wW9;
import X.C2188811AlT;
import X.C23250099c;
import X.C384050F3z;
import X.C418440Gaw;
import X.C426750GoL;
import X.C438710HIf;
import X.C452501pT;
import X.C786410Ut5;
import X.C814420VxA;
import X.InterfaceC1891350zJl;
import Y.ACListenerS129S0200000_27;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import android.text.SpannableString;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.TextView;
import androidx.lifecycle.LifecycleOwnerKt;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.im.ai.impl.smartreply.sources.SourceCell;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.zhiliaoapp.musically.R;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import kotlin.jvm.internal.AwS550S0100000_6;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class SourceCell extends PowerCell<C1781740wSy> {
    public final C01GW LL = C452501pT.LIZIZ(new AwS550S0100000_6(this, 103));

    public final Context I5() {
        return (Context) this.LL.getValue();
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl) {
        StringBuilder sbLIZ;
        String str;
        final C1781740wSy c1781740wSy = (C1781740wSy) interfaceC1891350zJl;
        super.onBindItemView(c1781740wSy);
        C786410Ut5.LLLLLLZZ((TuxIconView) this.itemView.findViewById(R.id.vr0), 8);
        C786410Ut5.I7(new ACListenerS129S0200000_27(c1781740wSy, this, 57), this.itemView);
        final TuxTextView tuxTextView = (TuxTextView) this.itemView.findViewById(R.id.nx2);
        String string = I5().getString(2131846294);
        if (C426750GoL.LIZLLL(I5())) {
            sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(string);
            sbLIZ.append("...");
        } else {
            sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("...");
            sbLIZ.append(string);
        }
        final String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        final String str2 = c1781740wSy.LL;
        C786410Ut5.y3(tuxTextView.getViewTreeObserver(), new ViewTreeObserver.OnPreDrawListener() { // from class: X.0Gvy
            public final /* synthetic */ int LLILLL = 2;

            /* JADX WARN: Type inference fix 'apply assigned field type' failed
            java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
            	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
            	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
            	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
             */
            @Override // android.view.ViewTreeObserver.OnPreDrawListener
            public final boolean onPreDraw() {
                C786410Ut5.D3(tuxTextView.getViewTreeObserver(), this);
                tuxTextView.setMaxLines(Integer.MAX_VALUE);
                tuxTextView.setText(str2);
                Layout layout = tuxTextView.getLayout();
                if (layout == null) {
                    return true;
                }
                int lineCount = layout.getLineCount();
                int i = this.LLILLL;
                boolean z = false;
                if (lineCount <= i) {
                    tuxTextView.setText(str2);
                    tuxTextView.setMaxLines(this.LLILLL);
                    return true;
                }
                final SourceCell sourceCell = this;
                final TuxTextView tuxTextView2 = tuxTextView;
                final String str3 = str2;
                String str4 = strLIZIZ;
                final C1781740wSy c1781740wSy2 = c1781740wSy;
                sourceCell.getClass();
                Layout layout2 = tuxTextView2.getLayout();
                int i2 = i - 1;
                int lineStart = layout2.getLineStart(i2);
                int lineEnd = layout2.getLineEnd(i2);
                float lineWidth = layout2.getLineWidth(i2);
                float fMeasureText = tuxTextView2.getPaint().measureText(str4);
                if (lineWidth > 0.0f) {
                    f = ((int) (((lineWidth - fMeasureText) / lineWidth >= 0.0f ? r1 : 0.0f) * 10)) / 10.0f;
                }
                int iLJ = C13LZ.LJ((int) (lineStart + ((lineEnd - lineStart) * f)), lineStart, lineEnd);
                ClickableSpan clickableSpan = new ClickableSpan() { // from class: X.0wYI
                    @Override // android.text.style.ClickableSpan
                    public final void onClick(View view) {
                        SourceCell sourceCell2 = sourceCell;
                        TuxTextView tuxTextView3 = tuxTextView2;
                        String str5 = str3;
                        sourceCell2.getClass();
                        tuxTextView3.setText(new SpannableString(str5));
                        tuxTextView3.setMaxLines(Integer.MAX_VALUE);
                        tuxTextView3.setMovementMethod(null);
                        C1508705vR c1508705vR = C1508705vR.LL;
                        C1781740wSy c1781740wSy3 = c1781740wSy2;
                        String str6 = c1781740wSy3.LLIZLLLIL;
                        String str7 = c1781740wSy3.LLJI;
                        String str8 = c1781740wSy3.LLJIJIL;
                        String str9 = c1781740wSy3.LLJILJIL;
                        String strLIZIZ2 = C0ZO8.LIZIZ(c1781740wSy3.LLIZ);
                        String strLIZ = C0ZO8.LIZ(c1781740wSy2.LLIZ);
                        C1781740wSy c1781740wSy4 = c1781740wSy2;
                        String str10 = c1781740wSy4.LLJILJILJ;
                        String str11 = c1781740wSy4.LLJILLL;
                        c1508705vR.getClass();
                        C1508705vR.LJIIIIZZ(str6, str7, str8, str9, strLIZIZ2, strLIZ, str10, str11, "click_more");
                    }

                    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
                    public final void updateDrawState(TextPaint textPaint) {
                        int iIntValue;
                        super.updateDrawState(textPaint);
                        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a1k, sourceCell.I5());
                        if (numLIZJ != null) {
                            iIntValue = numLIZJ.intValue();
                        } else {
                            iIntValue = 0;
                        }
                        textPaint.setColor(iIntValue);
                        textPaint.setUnderlineText(false);
                    }
                };
                Context contextI5 = sourceCell.I5();
                if (contextI5 != null && C426750GoL.LIZLLL(contextI5)) {
                    z = true;
                }
                if (z) {
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append(C13LN.LJZL(lineStart, str3));
                    sbLIZ2.append(str4);
                    sbLIZ2.append(str3.substring(lineStart, iLJ));
                    SpannableString spannableString = new SpannableString(C2188811AlT.LIZIZ(sbLIZ2));
                    C786410Ut5.p2(spannableString, clickableSpan, lineStart, str4.length() + lineStart, 33);
                    tuxTextView2.setText(spannableString);
                } else {
                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                    sbLIZ3.append(C13LN.LJZL(iLJ, str3));
                    sbLIZ3.append(str4);
                    String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ3);
                    SpannableString spannableString2 = new SpannableString(strLIZIZ2);
                    C786410Ut5.p2(spannableString2, clickableSpan, strLIZIZ2.length() - str4.length(), strLIZIZ2.length(), 33);
                    tuxTextView2.setText(spannableString2);
                }
                tuxTextView2.setMaxLines(i);
                if (C431460Gvw.LJFF == null) {
                    C431460Gvw.LJFF = new C431460Gvw();
                }
                tuxTextView2.setMovementMethod(C431460Gvw.LJFF);
                return true;
            }
        });
        SmartImageView smartImageView = (SmartImageView) this.itemView.findViewById(R.id.vqy);
        if (smartImageView != null) {
            C384050F3z c384050F3z = new C384050F3z();
            c384050F3z.LIZIZ = Integer.valueOf(R.attr.a03);
            c384050F3z.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(10));
            c384050F3z.LIZLLL = Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Double.valueOf(0.5d))));
            int iLIZJ = C1308910kAL.LIZJ(R.attr.a02, I5());
            int iIntValue = -16777216;
            if (iLIZJ == null) {
                iLIZJ = -16777216;
            }
            c384050F3z.LJ = iLIZJ;
            Drawable drawableLIZ = c384050F3z.LIZ(I5());
            C1331670kl3 c1331670kl3LJIIIIZZ = C1331660kl2.LJIIIIZZ(C438710HIf.LIZJ(c1781740wSy.LLILLJJLI));
            c1331670kl3LJIIIIZZ.LJJ(smartImageView);
            c1331670kl3LJIIIIZZ.LIZLLL("smart_reply_source_sheet");
            C1331750klB c1331750klB = new C1331750klB();
            c1331750klB.LJ = C418440Gaw.LIZIZ(10);
            c1331750klB.LIZIZ = (int) 0.5d;
            Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a02, I5());
            if (numLIZJ != null) {
                iIntValue = numLIZJ.intValue();
            }
            c1331750klB.LIZJ = iIntValue;
            c1331670kl3LJIIIIZZ.LJJI = new C1331730kl9(c1331750klB);
            c1331670kl3LJIIIIZZ.LJJIIZI(drawableLIZ);
            C1332130kln.LJFF(c1331670kl3LJIIIIZZ, "create_ai_reply_assistant_guide", new C0ID1(this, c1781740wSy, 3), false, null, null, null, 60);
        }
        long j = c1781740wSy.LLILZIL;
        if (j > 0) {
            try {
                DateFormat dateInstance = SimpleDateFormat.getDateInstance(2, Locale.getDefault());
                if (j < 1.0E12d) {
                    j *= (long) LSPassThroughRecordSizeConfig.DEFAULT;
                }
                str = dateInstance.format(new Date(j));
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                str = "";
            }
        } else {
            str = "";
        }
        if (Intrinsics.LJFF(c1781740wSy.LLIZ, "comment")) {
            ((TextView) this.itemView.findViewById(R.id.wgz)).setText(I5().getString(2131846293, str));
        } else {
            ((TextView) this.itemView.findViewById(R.id.wgz)).setText(I5().getString(2131846295, str));
        }
        C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C1783710wW9(c1781740wSy, null), 3);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        return PowerCell.inflateItemView$default(this, viewGroup, R.layout.cpx, false, 4, null);
    }
}
