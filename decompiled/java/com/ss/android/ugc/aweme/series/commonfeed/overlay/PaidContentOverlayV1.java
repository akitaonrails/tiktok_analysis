package com.ss.android.ugc.aweme.series.commonfeed.overlay;

import X.AbstractC1606710ruf;
import X.C1308910kAL;
import X.C1387980mDs;
import X.C1401790ma9;
import X.C14LC;
import X.C1612770s4R;
import X.C197039127h;
import X.C20742216Eq;
import X.C2188811AlT;
import X.C418440Gaw;
import X.C422280Gh8;
import X.C431300Gvg;
import X.C786410Ut5;
import X.C814420VxA;
import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent;
import com.zhiliaoapp.musically.R;
import irm.AkS91S0100000_24;
import kotlin.jvm.internal.AwS635S0100000_21;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes25.dex */
public final class PaidContentOverlayV1 extends AbstractC1606710ruf {
    public C1387980mDs LLJI;
    public SmartImageView LLJIJIL;
    public C197039127h LLJILJIL;
    public TuxTextView LLJILJILJ;
    public C1612770s4R LLJILLL;

    @Override // X.InterfaceC1615720s9C
    public final int LIZLLL() {
        return R.layout.bhh;
    }

    /* JADX WARN: Removed duplicated region for block: B:68:0x00ea  */
    @Override // X.InterfaceC1615720s9C
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZIZ() {
        /*
            Method dump skipped, instruction units count: 680
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.series.commonfeed.overlay.PaidContentOverlayV1.LIZIZ():void");
    }

    public PaidContentOverlayV1(BaseCellSlotComponent baseCellSlotComponent) {
        super(baseCellSlotComponent);
    }

    @Override // X.AbstractC1606710ruf
    public final void LJIIIZ(boolean z) {
        C197039127h c197039127h = this.LLJILJIL;
        if (c197039127h != null) {
            c197039127h.setLoading(z);
        }
        C197039127h c197039127h2 = this.LLJILJIL;
        if (c197039127h2 != null) {
            c197039127h2.setClickable(!z);
        }
    }

    @Override // X.AbstractC1606710ruf, X.InterfaceC1615720s9C
    public final void onViewCreated(View view) {
        final int iIntValue;
        Number numberValueOf;
        Integer numLIZJ;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        ViewGroup.MarginLayoutParams marginLayoutParams2;
        ViewGroup.LayoutParams layoutParams;
        ViewGroup.LayoutParams layoutParams2;
        this.LLIZLLLIL = view;
        this.LLJILJILJ = (TuxTextView) view.findViewById(R.id.q03);
        TextView textView = (TextView) view.findViewById(R.id.q02);
        TextView textView2 = (TextView) view.findViewById(R.id.pzv);
        this.LLJIJIL = (SmartImageView) view.findViewById(R.id.pzu);
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.pzx);
        this.LLJILJIL = (C197039127h) view.findViewById(R.id.pzw);
        View viewFindViewById = view.findViewById(R.id.pzz);
        boolean z = C14LC.LJIIIZ;
        if (z) {
            ((C20742216Eq) view.findViewById(R.id.pzy)).setGuidelinePercent(0.15f);
            SmartImageView smartImageView = this.LLJIJIL;
            if (smartImageView != null && (layoutParams2 = smartImageView.getLayoutParams()) != null) {
                layoutParams2.width = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(90));
            }
            SmartImageView smartImageView2 = this.LLJIJIL;
            if (smartImageView2 != null && (layoutParams = smartImageView2.getLayoutParams()) != null) {
                layoutParams.height = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(120));
            }
            C197039127h c197039127h = this.LLJILJIL;
            if (c197039127h != null) {
                c197039127h.setButtonSize(2);
            }
            TuxTextView tuxTextView = this.LLJILJILJ;
            ViewGroup.LayoutParams layoutParams3 = null;
            if (tuxTextView != null) {
                layoutParams3 = tuxTextView.getLayoutParams();
            }
            if ((layoutParams3 instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams3) != null) {
                marginLayoutParams2.topMargin = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12));
            }
            ViewGroup.LayoutParams layoutParams4 = recyclerView.getLayoutParams();
            if ((layoutParams4 instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams4) != null) {
                marginLayoutParams.topMargin = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24));
            }
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(textView.getContext().getString(2131847493));
        sbLIZ.append(" · ");
        sbLIZ.append(textView.getContext().getString(2131847496));
        textView.setText(C2188811AlT.LIZIZ(sbLIZ));
        C786410Ut5.I7(new AkS91S0100000_24(this, 0), viewFindViewById);
        String string = textView2.getContext().getString(2131847501);
        String string2 = textView2.getContext().getString(2131847502, string);
        int iLJJJ = a0.LJJJ(string2, string, 0, false, 6);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(string2);
        Context context = view.getContext();
        if (context != null && (numLIZJ = C1308910kAL.LIZJ(R.attr.ee, context)) != null) {
            iIntValue = numLIZJ.intValue();
        } else {
            iIntValue = 0;
        }
        C786410Ut5.q2(spannableStringBuilder, new ForegroundColorSpan(iIntValue) { // from class: com.ss.android.ugc.aweme.series.commonfeed.overlay.PaidContentOverlayV1$onViewCreated$foregroundSpan$1
            @Override // android.text.style.ForegroundColorSpan, android.text.style.CharacterStyle
            public final void updateDrawState(TextPaint textPaint) {
                super.updateDrawState(textPaint);
                textPaint.setUnderlineText(false);
            }
        }, iLJJJ, string.length() + iLJJJ, 34);
        textView2.setHighlightColor(0);
        textView2.setText(spannableStringBuilder);
        textView2.setMovementMethod(C431300Gvg.LIZ());
        C786410Ut5.I7(new AkS91S0100000_24(view, 1), textView2);
        if (z) {
            numberValueOf = 8;
        } else {
            numberValueOf = Float.valueOf(12.0f);
        }
        int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(numberValueOf));
        if (recyclerView != null) {
            GridLayoutManager gridLayoutManager = new GridLayoutManager(recyclerView.getContext(), 2);
            gridLayoutManager.LLIZ = new C1401790ma9(this, 2);
            recyclerView.setLayoutManager(gridLayoutManager);
            recyclerView.addItemDecoration(new C422280Gh8(iLIZIZ));
        }
        C1387980mDs c1387980mDs = new C1387980mDs(R.drawable.bf4, new AwS635S0100000_21(this, 83));
        this.LLJI = c1387980mDs;
        if (recyclerView != null) {
            recyclerView.setAdapter(c1387980mDs);
        }
        C197039127h c197039127h2 = this.LLJILJIL;
        if (c197039127h2 != null) {
            C786410Ut5.I7(new AkS91S0100000_24(this, 2), c197039127h2);
        }
    }
}
