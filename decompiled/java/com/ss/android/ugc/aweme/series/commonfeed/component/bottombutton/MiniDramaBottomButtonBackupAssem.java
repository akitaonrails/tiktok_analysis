package com.ss.android.ugc.aweme.series.commonfeed.component.bottombutton;

import X.C1308910kAL;
import X.C1558520qew;
import X.C418440Gaw;
import X.C419890GdH;
import X.C444920HcY;
import X.C786410Ut5;
import X.C814420VxA;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import com.bytedance.touchpoint.api.model.DramaBottomButton;
import com.bytedance.touchpoint.api.model.Title;
import com.bytedance.tux.drawable.TuxIconDrawable;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.feed.model.PaidContentInfo;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent;
import com.zhiliaoapp.musically.R;
import kotlin.text.a0;
import wh6.AbS693S0100000_11;

/* JADX INFO: loaded from: classes12.dex */
public final class MiniDramaBottomButtonBackupAssem extends BaseCellSlotComponent<MiniDramaBottomButtonBackupAssem> {
    public TuxTextView LLJLLIL;
    public View LLJLLL;
    public TuxTextView LLJZ;
    public View LLJZIJLIL;

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int Oo() {
        return R.layout.bgy;
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        GradientDrawable gradientDrawable;
        super.onViewCreated(view);
        this.LLJLLIL = (TuxTextView) view.findViewById(R.id.od7);
        this.LLJLLL = view.findViewById(R.id.elb);
        this.LLJZ = (TuxTextView) view.findViewById(R.id.od5);
        this.LLJZIJLIL = view.findViewById(R.id.el9);
        Drawable background = view.getBackground();
        if ((background instanceof GradientDrawable) && (gradientDrawable = (GradientDrawable) background) != null) {
            gradientDrawable.setCornerRadius(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(200)));
        }
        C786410Ut5.I7(new AbS693S0100000_11(this, 7, 42), view);
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
    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final void up(VideoItemParams videoItemParams) {
        DramaBottomButton dramaBottomButtonBW;
        GradientDrawable gradientDrawable;
        final int iIntValue;
        String str;
        int iIntValue2;
        Integer numLIZJ;
        String str2;
        Integer numLIZJ2;
        int iIntValue3;
        Integer numLIZJ3;
        VideoItemParams videoItemParams2 = videoItemParams;
        TuxIconDrawable tuxIconDrawable = null;
        String bottomButtonText = null;
        MiniDramaBottomButtonAbility miniDramaBottomButtonAbility = (MiniDramaBottomButtonAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), MiniDramaBottomButtonAbility.class, null);
        if (miniDramaBottomButtonAbility != null) {
            dramaBottomButtonBW = miniDramaBottomButtonAbility.BW();
        } else {
            dramaBottomButtonBW = null;
        }
        Drawable background = getContentView().getBackground();
        if (background instanceof GradientDrawable) {
            gradientDrawable = (GradientDrawable) background;
        } else {
            gradientDrawable = null;
        }
        if (gradientDrawable != null) {
            Context context = getContext();
            if (context != null && (numLIZJ3 = C1308910kAL.LIZJ(R.attr.e9, context)) != null) {
                iIntValue3 = numLIZJ3.intValue();
            } else {
                iIntValue3 = 0;
            }
            gradientDrawable.setColor(iIntValue3);
        }
        if (dramaBottomButtonBW == null) {
            View view = this.LLJLLL;
            if (view != null) {
                C786410Ut5.LJLLLLLL(0, view);
            }
            View view2 = this.LLJZIJLIL;
            if (view2 != null) {
                C786410Ut5.LJLLLLLL(8, view2);
            }
            TuxTextView tuxTextView = this.LLJLLIL;
            if (tuxTextView != null) {
                PaidContentInfo paidContentInfo = videoItemParams2.getAweme().mPaidContentInfo;
                if (paidContentInfo != null) {
                    bottomButtonText = paidContentInfo.getBottomButtonText();
                }
                tuxTextView.setText(bottomButtonText);
                return;
            }
            return;
        }
        View view3 = this.LLJLLL;
        if (view3 != null) {
            C786410Ut5.LJLLLLLL(8, view3);
        }
        View view4 = this.LLJZIJLIL;
        if (view4 != null) {
            C786410Ut5.LJLLLLLL(0, view4);
        }
        Context context2 = getContext();
        if (context2 != null && (numLIZJ2 = C1308910kAL.LIZJ(R.attr.bi, context2)) != null) {
            iIntValue = numLIZJ2.intValue();
        } else {
            iIntValue = 0;
        }
        ForegroundColorSpan foregroundColorSpan = new ForegroundColorSpan(iIntValue) { // from class: com.ss.android.ugc.aweme.series.commonfeed.component.bottombutton.MiniDramaBottomButtonBackupAssem$onBind$foregroundSpan$1
            @Override // android.text.style.ForegroundColorSpan, android.text.style.CharacterStyle
            public final void updateDrawState(TextPaint textPaint) {
                super.updateDrawState(textPaint);
                textPaint.setUnderlineText(false);
            }
        };
        Title title = dramaBottomButtonBW.title;
        String str3 = "";
        if (title == null || (str = title.text) == null) {
            str = "";
        }
        Title title2 = dramaBottomButtonBW.highlightTitle;
        if (title2 != null && (str2 = title2.text) != null) {
            str3 = str2;
        }
        int iLJJJ = a0.LJJJ(str, str3, 0, false, 6);
        int iLJJJ2 = a0.LJJJ(str, "{tux_icon}", 0, false, 6);
        Context context3 = getContext();
        if (context3 != null) {
            tuxIconDrawable = new TuxIconDrawable(context3, R.raw.icon_point_fill);
            Context context4 = getContext();
            if (context4 != null && (numLIZJ = C1308910kAL.LIZJ(R.attr.bi, context4)) != null) {
                iIntValue2 = numLIZJ.intValue();
            } else {
                iIntValue2 = 0;
            }
            tuxIconDrawable.LJFF(iIntValue2);
            tuxIconDrawable.setBounds(0, 0, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(14)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(14)));
        }
        C419890GdH c419890GdH = new C419890GdH(tuxIconDrawable, 2);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        if (iLJJJ >= 0) {
            C786410Ut5.q2(spannableStringBuilder, foregroundColorSpan, iLJJJ, str3.length() + iLJJJ, 34);
            C786410Ut5.q2(spannableStringBuilder, new C444920HcY(53, false), iLJJJ, str3.length() + iLJJJ, 34);
        }
        if (iLJJJ2 >= 0) {
            C786410Ut5.q2(spannableStringBuilder, c419890GdH, iLJJJ2, iLJJJ2 + 10, 34);
        }
        TuxTextView tuxTextView2 = this.LLJZ;
        if (tuxTextView2 == null) {
            return;
        }
        tuxTextView2.setText(spannableStringBuilder);
    }
}
