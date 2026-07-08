package com.ss.android.ugc.aweme.interactive.task.base.card;

import X.AbstractC900170ZTb;
import X.C01GW;
import X.C03H5;
import X.C0I6Y;
import X.C0ICC;
import X.C0ZTQ;
import X.C1308910kAL;
import X.C1559260qg8;
import X.C1584506Ih;
import X.C21368018jm;
import X.C21652419oY;
import X.C300840Bqk;
import X.C452501pT;
import X.C457780HxI;
import X.C723590SZx;
import X.C724270Sb3;
import X.C786410Ut5;
import X.C869590Y9l;
import X.C898860ZOa;
import X.C911450ZpH;
import X.EnumC1710806mw;
import X.InterfaceC1587906Jp;
import X.InterfaceC461380I7k;
import X.InterfaceC712990Rxx;
import X.InterfaceC900180ZTc;
import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.ss.android.ugc.aweme.im.chatroom.api.model.SessionInfo;
import com.ss.android.ugc.aweme.im.message.template.card.BaseInteractiveTaskTemplate;
import com.ss.android.ugc.aweme.im.message.template.component.interactive.task.InlineMessageKeyComponent;
import com.ss.android.ugc.aweme.im.message.template.component.interactive.task.InlineMessageTipComponent;
import com.zhiliaoapp.musically.R;
import java.util.Arrays;
import java.util.List;
import kotlin.jvm.internal.AwS558S0100000_14;
import kotlin.text.a0;
import kotlin.text.u;

/* JADX INFO: loaded from: classes15.dex */
public abstract class BaseInteractiveTaskCardAssem<RECEIVER extends C03H5, TEMPLATE extends BaseInteractiveTaskTemplate, DATA extends AbstractC900170ZTb<TEMPLATE>> extends ReusedUISlotAssem<RECEIVER> implements InterfaceC712990Rxx<DATA> {
    public final C01GW LLJJLIIIJLLLLLLLZ = C452501pT.LIZIZ(new AwS558S0100000_14((BaseInteractiveTaskCardAssem) this, 1062));
    public final C1559260qg8 LLJL = new C1559260qg8(new C723590SZx(this, C457780HxI.class, null), checkSupervisorPrepared());
    public final C01GW LLJLIL = C452501pT.LIZIZ(new AwS558S0100000_14((BaseInteractiveTaskCardAssem) this, 1063));
    public final C01GW LLJLILLLLZIIL = C452501pT.LIZIZ(new AwS558S0100000_14((BaseInteractiveTaskCardAssem) this, 1064));
    public final C01GW LLJLL = C452501pT.LIZIZ(new AwS558S0100000_14((BaseInteractiveTaskCardAssem) this, 1061));

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int Oo() {
        return R.layout.cfa;
    }

    public abstract C21368018jm op();

    public abstract InterfaceC900180ZTc<TEMPLATE> sp();

    @Override // X.InterfaceC712990Rxx
    public final void unBind() {
    }

    public abstract C0ZTQ up();

    @Override // X.InterfaceC712990Rxx
    public final void wr() {
    }

    public abstract void yp(DATA data);

    public final SessionInfo tp() {
        return (SessionInfo) this.LLJJLIIIJLLLLLLLZ.getValue();
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem, com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void Co() {
        super.Co();
        ViewGroup viewGroup = (ViewGroup) this.LLJLL.getValue();
        getContentView().getContext();
        viewGroup.addView(op());
    }

    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final void up(Object obj) {
        boolean zLIZIZ;
        Object obj2;
        InlineMessageTipComponent inlineMessageTipComponentW7;
        int iLJJJ;
        final int iIntValue;
        Integer numLIZJ;
        AbstractC900170ZTb abstractC900170ZTb = (AbstractC900170ZTb) obj;
        if (abstractC900170ZTb.LL == null) {
            C1584506Ih.LIZ((View) this.LLJLL.getValue());
            return;
        }
        TextView textView = (TextView) this.LLJLILLLLZIIL.getValue();
        final TEMPLATE template = abstractC900170ZTb.LL;
        SpannableStringBuilder spannableStringBuilderLIZIZ = sp().LIZIZ();
        boolean z = false;
        z = false;
        z = false;
        if (spannableStringBuilderLIZIZ == null) {
            if (template != null && (inlineMessageTipComponentW7 = template.W7()) != null) {
                String strLJJIFFI = inlineMessageTipComponentW7.tips;
                for (InlineMessageKeyComponent inlineMessageKeyComponent : inlineMessageTipComponentW7.template) {
                    String str = inlineMessageKeyComponent.name;
                    String strJ4 = C786410Ut5.j4("{{%s}}", Arrays.copyOf(new Object[]{inlineMessageKeyComponent.key}, 1));
                    if (inlineMessageKeyComponent.key.length() != 0 && inlineMessageKeyComponent.name.length() != 0) {
                        strLJJIFFI = u.LJJIFFI(strLJJIFFI, strJ4, str, false);
                    }
                }
                spannableStringBuilderLIZIZ = new SpannableStringBuilder(strLJJIFFI);
                for (final InlineMessageKeyComponent inlineMessageKeyComponent2 : inlineMessageTipComponentW7.template) {
                    String str2 = inlineMessageKeyComponent2.key;
                    String str3 = inlineMessageKeyComponent2.name;
                    final EnumC1710806mw enumC1710806mw = inlineMessageKeyComponent2.action;
                    if (str2.length() != 0) {
                        if (str3.length() != 0 && (iLJJJ = a0.LJJJ(strLJJIFFI, str3, z ? 1 : 0, z, 6)) >= 0) {
                            Context context = getContext();
                            if (context != null && (numLIZJ = C1308910kAL.LIZJ(R.attr.a1n, context)) != null) {
                                iIntValue = numLIZJ.intValue();
                            } else {
                                iIntValue = -16776961;
                            }
                            C786410Ut5.q2(spannableStringBuilderLIZIZ, new ClickableSpan() { // from class: X.0ZTa
                                @Override // android.text.style.ClickableSpan
                                public final void onClick(View view) {
                                    if (enumC1710806mw == null) {
                                        return;
                                    }
                                    InterfaceC900180ZTc<TEMPLATE> interfaceC900180ZTcSp = this.sp();
                                    EnumC1710806mw enumC1710806mw2 = enumC1710806mw;
                                    this.tp();
                                    interfaceC900180ZTcSp.LIZ(enumC1710806mw2, template, inlineMessageKeyComponent2);
                                }

                                @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
                                public final void updateDrawState(TextPaint textPaint) {
                                    super.updateDrawState(textPaint);
                                    textPaint.setColor(iIntValue);
                                    textPaint.setUnderlineText(false);
                                }
                            }, iLJJJ, str3.length() + iLJJJ, 33);
                        }
                    }
                    z = false;
                }
            } else {
                spannableStringBuilderLIZIZ = new SpannableStringBuilder("");
            }
        }
        textView.setText(spannableStringBuilderLIZIZ);
        ((TextView) this.LLJLILLLLZIIL.getValue()).setMovementMethod(LinkMovementMethod.getInstance());
        if (C300840Bqk.LIZ()) {
            zLIZIZ = abstractC900170ZTb.LLILLJJLI;
        } else {
            zLIZIZ = up().LIZIZ(((C0ICC) abstractC900170ZTb).LLIZ.LIZ.LIZ, abstractC900170ZTb.LL);
        }
        if (zLIZIZ) {
            C1584506Ih.LIZ((View) this.LLJLL.getValue());
            return;
        }
        C1584506Ih.LIZIZ((View) this.LLJLL.getValue());
        yp(abstractC900170ZTb);
        C21652419oY c21652419oY = (C21652419oY) this.LLJLIL.getValue();
        C898860ZOa gestureConfig = ((C21652419oY) this.LLJLIL.getValue()).getGestureConfig();
        C911450ZpH c911450ZpH = C911450ZpH.LIZ;
        C724270Sb3 c724270Sb3 = this.LLJI;
        if (c724270Sb3 != null) {
            obj2 = c724270Sb3.LL;
        } else {
            obj2 = null;
        }
        C869590Y9l c869590Y9lLIZ = C0I6Y.LIZ((InterfaceC461380I7k) obj2);
        c911450ZpH.getClass();
        c21652419oY.setGestureConfig(C898860ZOa.LIZ(gestureConfig, !C911450ZpH.LIZJ(c869590Y9lLIZ), z, 11));
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ boolean ur(Object obj) {
        return true;
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ void vr(Object obj) {
    }

    @Override // X.InterfaceC712990Rxx
    public final void sr(InterfaceC1587906Jp interfaceC1587906Jp, List list) {
        up(interfaceC1587906Jp);
    }
}
