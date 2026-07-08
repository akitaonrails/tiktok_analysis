package com.ss.android.ugc.aweme.comment.detailpage.bottombarv2.assem;

import X.C0WZX;
import X.C1265760j2k;
import X.C1308910kAL;
import X.C1348730lCZ;
import X.C1348830lCj;
import X.C1353500lKG;
import X.C1401850maF;
import X.C1ER1;
import X.C2188811AlT;
import X.C2189821An6;
import X.C2204961BRm;
import X.C294190Bg1;
import X.C427690Gpr;
import X.C786410Ut5;
import X.C960203pA;
import X.EnumC048800Fq;
import X.InterfaceC682070QpB;
import Y.ACListenerS155S0100000_21;
import android.content.Context;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.method.LinkMovementMethod;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.ss.android.ugc.aweme.comment.detailpage.bottombarv2.protocol.DetailBottomBarAbility;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeBizExtKt;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.zhiliaoapp.musically.R;
import java.util.Objects;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class BottomMusicShootCommentAssem extends AbstractBottomInputPriorityComponent {
    public C1353500lKG LLJILLL;
    public View LLJJ;
    public String LLJJI;

    @Override // com.ss.android.ugc.feed.platform.container.protocol.priority.PriorityProtocol
    public final String zg() {
        return "music_shoot_comment";
    }

    @Override // com.ss.android.ugc.aweme.comment.detailpage.bottombarv2.assem.AbstractBottomInputPriorityComponent
    public final C1348830lCj Vo() {
        String enterFrom;
        View viewFindViewById = LJJIJL().findViewById(R.id.ma7);
        C1353500lKG c1353500lKG = this.LLJILLL;
        TextView textView = (TextView) LJJIJL().findViewById(R.id.e_q);
        String aid = getAid();
        DetailBottomBarAbility detailBottomBarAbilityJo = Jo();
        if (detailBottomBarAbilityJo == null || (enterFrom = detailBottomBarAbilityJo.getEnterFrom()) == null) {
            enterFrom = "";
        }
        EnumC048800Fq enumC048800Fq = EnumC048800Fq.DEFAULT;
        Aweme awemeHo = Ho();
        return new C1348830lCj(viewFindViewById, c1353500lKG, textView, aid, enterFrom, enumC048800Fq, awemeHo != null ? AwemeExtKt.getAuthorUid(awemeHo) : null, 6, 256);
    }

    @Override // com.ss.android.ugc.aweme.comment.detailpage.bottombarv2.protocol.BottomBarProtocol
    public final boolean LJJLIL() {
        Aweme awemeHo;
        return Go(xp0()) && (awemeHo = Ho()) != null && AwemeBizExtKt.getHasCreationIntention(awemeHo) && C1ER1.LIZIZ.LLIILZL().LJII(Ho());
    }

    @Override // com.ss.android.ugc.aweme.comment.detailpage.bottombarv2.assem.AbstractBottomPriorityComponent
    public final void W3() {
        C1353500lKG c1353500lKG;
        Aweme awemeHo = Ho();
        if (awemeHo != null && AwemeExtKt.isProhibited(awemeHo)) {
            C1353500lKG c1353500lKG2 = this.LLJILLL;
            if (c1353500lKG2 != null) {
                c1353500lKG2.setEnabled(false);
            }
            C1353500lKG c1353500lKG3 = this.LLJILLL;
            if (c1353500lKG3 != null) {
                c1353500lKG3.setHint(2131829184);
                return;
            }
            return;
        }
        C1353500lKG c1353500lKG4 = this.LLJILLL;
        if (c1353500lKG4 != null) {
            c1353500lKG4.setEnabled(true);
        }
        C1348730lCZ c1348730lCZSo = So();
        if (c1348730lCZSo != null) {
            c1348730lCZSo.LJJIJL();
        }
        C294190Bg1.LIZ.getClass();
        if (!C294190Bg1.LIZ() || (c1353500lKG = this.LLJILLL) == null) {
            return;
        }
        c1353500lKG.setHint(2131829129);
    }

    @Override // com.ss.android.ugc.aweme.comment.detailpage.bottombarv2.assem.AbstractBottomPriorityComponent
    public final boolean Go(C2189821An6 c2189821An6) {
        String eventType;
        InterfaceC682070QpB interfaceC682070QpBLLIILZL = C1ER1.LIZIZ.LLIILZL();
        if (c2189821An6 != null) {
            eventType = c2189821An6.getEventType();
        } else {
            eventType = null;
        }
        return interfaceC682070QpBLLIILZL.LJ(eventType);
    }

    @Override // com.ss.android.ugc.aweme.comment.detailpage.bottombarv2.assem.AbstractBottomPriorityComponent
    public final void No(ViewGroup viewGroup) throws Throwable {
        Editable editableLLLZZIL;
        CharSequence hint;
        C1353500lKG c1353500lKG;
        String eventType;
        Integer numLIZJ;
        String string;
        int iLIZ;
        String string2;
        View viewLJJIJL = LJJIJL();
        if ((viewLJJIJL instanceof ViewGroup) && viewLJJIJL.findViewById(R.id.fq2) == null) {
            ViewGroup viewGroup2 = (ViewGroup) viewLJJIJL;
            C786410Ut5.Sd(R.layout.a1v, C786410Ut5.ne(viewGroup2.getContext()), viewGroup2).setId(R.id.fq2);
            this.LLJILLL = (C1353500lKG) viewLJJIJL.findViewById(R.id.eal);
            C786410Ut5.LJLLLLLL(4, viewLJJIJL.findViewById(R.id.ma7));
            View viewFindViewById = viewLJJIJL.findViewById(R.id.ecc);
            this.LLJJ = viewFindViewById;
            if (viewFindViewById != null) {
                C427690Gpr.LJ(viewFindViewById, 0.0f);
            }
            View view = this.LLJJ;
            if (view != null) {
                C786410Ut5.I7(new C1401850maF(this, 29), view);
            }
            TextView textView = (TextView) viewLJJIJL.findViewById(R.id.e_q);
            if (textView != null) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                Context context = getContext();
                String str = "";
                if (context == null || (string = context.getString(2131829134)) == null) {
                    string = "";
                }
                sbLIZ.append(string);
                sbLIZ.append(' ');
                String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                Context context2 = getContext();
                if (context2 != null && (string2 = context2.getString(2131858245)) != null) {
                    str = string2;
                }
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append(strLIZIZ);
                sbLIZ2.append(str);
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(C2188811AlT.LIZIZ(sbLIZ2));
                C786410Ut5.q2(spannableStringBuilder, new C1265760j2k(this, 2), strLIZIZ.length(), spannableStringBuilder.length(), 18);
                Context context3 = getContext();
                if (context3 != null) {
                    iLIZ = C960203pA.LIZ(R.attr.ee, context3);
                } else {
                    iLIZ = 0;
                }
                C786410Ut5.q2(spannableStringBuilder, new ForegroundColorSpan(iLIZ), strLIZIZ.length(), spannableStringBuilder.length(), 18);
                C786410Ut5.q2(spannableStringBuilder, new StyleSpan(1), strLIZIZ.length(), spannableStringBuilder.length(), 18);
                textView.setText(spannableStringBuilder);
                textView.setMovementMethod(new LinkMovementMethod());
            }
            C1353500lKG c1353500lKG2 = this.LLJILLL;
            if (c1353500lKG2 != null) {
                c1353500lKG2.setCursorVisible(false);
            }
            Context context4 = getContext();
            if (context4 != null && (numLIZJ = C1308910kAL.LIZJ(R.attr.eg, context4)) != null) {
                int iIntValue = numLIZJ.intValue();
                C1353500lKG c1353500lKG3 = this.LLJILLL;
                if (c1353500lKG3 != null) {
                    c1353500lKG3.setHintTextColor(iIntValue);
                }
            }
        }
        C1353500lKG c1353500lKG4 = this.LLJILLL;
        if (c1353500lKG4 != null) {
            c1353500lKG4.requestFocus();
        }
        C1353500lKG c1353500lKG5 = this.LLJILLL;
        String authorUid = null;
        if (c1353500lKG5 != null) {
            editableLLLZZIL = C2204961BRm.LLLZZIL(c1353500lKG5, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOmnbpLL0iZaJrbQazgwx+q9myKHnkDP0A9QTVsNdLPdCSrYvHLAxHvpTe1jqkvHDq090/KkKpO+Ae1da9IYo39z", null));
        } else {
            editableLLLZZIL = null;
        }
        Objects.toString(editableLLLZZIL);
        C1353500lKG c1353500lKG6 = this.LLJILLL;
        if (c1353500lKG6 != null) {
            hint = c1353500lKG6.getHint();
        } else {
            hint = null;
        }
        Objects.toString(hint);
        if (!Intrinsics.LJFF(this.LLJJI, getAid())) {
            this.LLJJI = getAid();
            InterfaceC682070QpB interfaceC682070QpBLLIILZL = C1ER1.LIZIZ.LLIILZL();
            String aid = getAid();
            C2189821An6 c2189821An6Xp0 = xp0();
            if (c2189821An6Xp0 != null) {
                eventType = c2189821An6Xp0.getEventType();
            } else {
                eventType = null;
            }
            Aweme awemeHo = Ho();
            if (awemeHo != null) {
                authorUid = AwemeExtKt.getAuthorUid(awemeHo);
            }
            interfaceC682070QpBLLIILZL.LJIIIZ(aid, eventType, authorUid);
        }
        C294190Bg1.LIZ.getClass();
        if (C294190Bg1.LIZ() && (c1353500lKG = this.LLJILLL) != null) {
            C786410Ut5.L9(c1353500lKG, new ACListenerS155S0100000_21(this, 19));
        }
    }
}
