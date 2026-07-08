package com.ss.android.ugc.aweme.im.sdk.chat.feature.translation;

import X.C0ZVU;
import X.C1308910kAL;
import X.C1697806kq;
import X.C786410Ut5;
import X.C901130ZWt;
import X.InterfaceC1587906Jp;
import X.InterfaceC712990Rxx;
import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.SpannedString;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes15.dex */
public final class IMTextTranslationInlineTurnOnAutoTranslateAssem extends ReusedUISlotAssem<IMTextTranslationInlineTurnOnAutoTranslateAssem> implements InterfaceC712990Rxx<C0ZVU> {
    public TuxTextView LLJJLIIIJLLLLLLLZ;

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int Oo() {
        return R.layout.ckn;
    }

    @Override // X.InterfaceC712990Rxx
    public final void unBind() {
    }

    @Override // X.InterfaceC712990Rxx
    public final void wr() {
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        this.LLJJLIIIJLLLLLLLZ = (TuxTextView) view.findViewById(R.id.k8v);
    }

    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final void up(C0ZVU c0zvu) {
        Integer numLIZJ;
        C901130ZWt.LIZIZ.LJIIL().LIZLLL();
        Context context = getContext();
        if (context != null && (numLIZJ = C1308910kAL.LIZJ(R.attr.a1n, context)) != null) {
            final int iIntValue = numLIZJ.intValue();
            String string = context.getString(2131830821);
            String string2 = context.getString(2131830822, string);
            TuxTextView tuxTextView = this.LLJJLIIIJLLLLLLLZ;
            if (tuxTextView != null) {
                C1697806kq.LIZ(tuxTextView);
            }
            TuxTextView tuxTextView2 = this.LLJJLIIIJLLLLLLLZ;
            if (tuxTextView2 != null) {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                spannableStringBuilder.append((CharSequence) string2);
                int iLJJJJI = a0.LJJJJI(string2, string, 0, 6);
                if (iLJJJJI != -1) {
                    C786410Ut5.q2(spannableStringBuilder, new ForegroundColorSpan(iIntValue), iLJJJJI, string.length() + iLJJJJI, 17);
                    C786410Ut5.q2(spannableStringBuilder, new ClickableSpan() { // from class: X.0ZVV
                        @Override // android.text.style.ClickableSpan
                        public final void onClick(View view) {
                            C901130ZWt c901130ZWt = C901130ZWt.LIZIZ;
                            c901130ZWt.LJIIL().LIZ();
                            c901130ZWt.LJ(view);
                        }

                        @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
                        public final void updateDrawState(TextPaint textPaint) {
                            textPaint.setColor(iIntValue);
                            textPaint.setUnderlineText(false);
                        }
                    }, iLJJJJI, string.length() + iLJJJJI, 17);
                }
                tuxTextView2.setText(new SpannedString(spannableStringBuilder));
            }
        }
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ boolean ur(C0ZVU c0zvu) {
        return true;
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ void vr(C0ZVU c0zvu) {
    }

    @Override // X.InterfaceC712990Rxx
    public final void sr(InterfaceC1587906Jp interfaceC1587906Jp, List list) {
        up(interfaceC1587906Jp);
    }
}
