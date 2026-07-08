package com.ss.android.ugc.aweme.groupshot.vh;

import X.C01GW;
import X.C0I6Y;
import X.C0Z2Z;
import X.C0ZDX;
import X.C0ZQ8;
import X.C0ZQ9;
import X.C0ZQA;
import X.C0ZTM;
import X.C1295960jpS;
import X.C1308910kAL;
import X.C1559260qg8;
import X.C1584506Ih;
import X.C1697806kq;
import X.C1954807lC;
import X.C21652419oY;
import X.C300840Bqk;
import X.C452501pT;
import X.C457780HxI;
import X.C461530I7z;
import X.C462420IBk;
import X.C462430IBl;
import X.C723590SZx;
import X.C723830SaL;
import X.C724270Sb3;
import X.C786410Ut5;
import X.C869590Y9l;
import X.C893560Z3q;
import X.C898860ZOa;
import X.C901500ZYe;
import X.C901510ZYf;
import X.C901520ZYg;
import X.C911450ZpH;
import X.C912070ZqH;
import X.EnumC1710806mw;
import X.EnumC1711006my;
import X.EnumC1786290waJ;
import X.EnumC900290ZTn;
import X.InterfaceC1587906Jp;
import X.InterfaceC461380I7k;
import X.InterfaceC712990Rxx;
import X.ViewOnAttachStateChangeListenerC1846530y9T;
import android.animation.ValueAnimator;
import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import android.widget.TextView;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.bytedance.router.SmartRouter;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.aigroupshot.AIGroupShotEntry;
import com.ss.android.ugc.aweme.groupshot.vh.AIGroupShotCardReusedUISlot;
import com.ss.android.ugc.aweme.im.chatroom.api.model.SessionInfo;
import com.ss.android.ugc.aweme.im.message.template.card.AIGroupShotCardTemplate;
import com.ss.android.ugc.aweme.im.message.template.component.interactive.task.InlineMessageKeyComponent;
import com.ss.android.ugc.aweme.im.message.template.component.interactive.task.InlineMessageTipComponent;
import com.ss.android.ugc.aweme.im.message.template.component.interactive.task.aigroupshot.AIGroupShotTemplateInfoComponent;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AwS415S0200000_14;
import kotlin.jvm.internal.AwS558S0100000_14;
import kotlin.jvm.internal.AwS593S0100000_14;
import kotlin.text.a0;
import kotlin.text.u;

/* JADX INFO: loaded from: classes15.dex */
public final class AIGroupShotCardReusedUISlot extends ReusedUISlotAssem<AIGroupShotCardReusedUISlot> implements InterfaceC712990Rxx<C462420IBk> {
    public ValueAnimator LLJZIJLIL;
    public AIGroupShotCardTemplate LLLF;
    public Long LLLFF;
    public C462420IBk LLLFFI;
    public final C01GW LLJJLIIIJLLLLLLLZ = C452501pT.LIZIZ(new AwS558S0100000_14(this, 159));
    public final C1559260qg8 LLJL = new C1559260qg8(new C723590SZx(this, C457780HxI.class, null), checkSupervisorPrepared());
    public final C01GW LLJLIL = C452501pT.LIZIZ(new AwS558S0100000_14(this, 163));
    public final C01GW LLJLILLLLZIIL = C452501pT.LIZIZ(new AwS558S0100000_14(this, 162));
    public final C01GW LLJLL = C452501pT.LIZIZ(new AwS558S0100000_14(this, 157));
    public final C01GW LLJLLIL = C452501pT.LIZIZ(new AwS558S0100000_14(this, 165));
    public final C01GW LLJLLL = C452501pT.LIZIZ(new AwS558S0100000_14(this, 164));
    public final C01GW LLJZ = C452501pT.LIZIZ(new AwS558S0100000_14(this, 158));
    public final C01GW LLL = C452501pT.LIZIZ(new AwS558S0100000_14(this, 156));

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int Oo() {
        return R.layout.csm;
    }

    @Override // X.InterfaceC712990Rxx
    public final void unBind() {
    }

    @Override // X.InterfaceC712990Rxx
    public final void wr() {
    }

    public final C901500ZYe sp() {
        return (C901500ZYe) this.LLL.getValue();
    }

    public final SessionInfo tp() {
        return (SessionInfo) this.LLJLILLLLZIIL.getValue();
    }

    public final C21652419oY up() {
        return (C21652419oY) this.LLJLLL.getValue();
    }

    public final void op() {
        up().setGestureConfig(C898860ZOa.LIZ(up().getGestureConfig(), false, sp().getVisibility() == 0 && (sp().getCurrentStyle() instanceof C901520ZYg), 7));
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        C21652419oY c21652419oYUp = up();
        c21652419oYUp.getClass();
        c21652419oYUp.LL = EnumC900290ZTn.REFACTOR;
        c21652419oYUp.setGestureConfig(C898860ZOa.LIZ(c21652419oYUp.getGestureConfig(), false, false, 7));
        c21652419oYUp.setDefaultOnLongPressAction(new AwS415S0200000_14(this, c21652419oYUp, 16));
        c21652419oYUp.setDefaultOnDoubleTapAction(new AwS558S0100000_14(this, 161));
        C723830SaL.LIZ(this, null, new AwS593S0100000_14(this, 19));
        sp().setOnActionCallback(new AwS593S0100000_14(this, 20));
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ boolean ur(C462420IBk c462420IBk) {
        return true;
    }

    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: yp, reason: merged with bridge method [inline-methods] */
    public final void up(C462420IBk c462420IBk) {
        Object obj;
        SpannableStringBuilder spannableStringBuilder;
        InlineMessageTipComponent inlineMessageTipComponent;
        int iLJJJ;
        final int iIntValue;
        Integer numLIZJ;
        boolean zLIZIZ;
        String string;
        this.LLLFFI = c462420IBk;
        C869590Y9l c869590Y9l = c462420IBk.LLILII().LIZ.LIZ;
        this.LLLFF = Long.valueOf(c869590Y9l.getMsgId());
        AIGroupShotCardTemplate aIGroupShotCardTemplate = (AIGroupShotCardTemplate) C0Z2Z.LIZ(c869590Y9l, AIGroupShotCardTemplate.class);
        if (aIGroupShotCardTemplate == null) {
            return;
        }
        this.LLLF = aIGroupShotCardTemplate;
        TextView textView = (TextView) this.LLJLLIL.getValue();
        C724270Sb3 c724270Sb3 = this.LLJI;
        if (c724270Sb3 != null) {
            obj = c724270Sb3.LL;
        } else {
            obj = null;
        }
        String str = "";
        if (C0ZDX.LJJJJZ(C0I6Y.LIZ((InterfaceC461380I7k) obj))) {
            Context context = getContext();
            if (context != null && (string = context.getString(2131830877)) != null) {
                str = string;
            }
            spannableStringBuilder = new SpannableStringBuilder(str);
        } else {
            AIGroupShotCardTemplate aIGroupShotCardTemplate2 = this.LLLF;
            if (aIGroupShotCardTemplate2 != null && (inlineMessageTipComponent = aIGroupShotCardTemplate2.tip) != null) {
                String strLJJIFFI = inlineMessageTipComponent.tips;
                for (InlineMessageKeyComponent inlineMessageKeyComponent : inlineMessageTipComponent.template) {
                    String str2 = inlineMessageKeyComponent.name;
                    String strJ4 = C786410Ut5.j4("{{%s}}", Arrays.copyOf(new Object[]{inlineMessageKeyComponent.key}, 1));
                    if (inlineMessageKeyComponent.key.length() != 0 && inlineMessageKeyComponent.name.length() != 0) {
                        strLJJIFFI = u.LJJIFFI(strLJJIFFI, strJ4, str2, false);
                    }
                }
                spannableStringBuilder = new SpannableStringBuilder(strLJJIFFI);
                for (final InlineMessageKeyComponent inlineMessageKeyComponent2 : inlineMessageTipComponent.template) {
                    String str3 = inlineMessageKeyComponent2.key;
                    String str4 = inlineMessageKeyComponent2.name;
                    final EnumC1710806mw enumC1710806mw = inlineMessageKeyComponent2.action;
                    if (str3.length() != 0 && str4.length() != 0 && (iLJJJ = a0.LJJJ(strLJJIFFI, str4, 0, false, 6)) >= 0) {
                        Context context2 = getContext();
                        if (context2 != null && (numLIZJ = C1308910kAL.LIZJ(R.attr.a1n, context2)) != null) {
                            iIntValue = numLIZJ.intValue();
                        } else {
                            iIntValue = -16776961;
                        }
                        C786410Ut5.q2(spannableStringBuilder, new ClickableSpan() { // from class: X.06mu
                            @Override // android.text.style.ClickableSpan
                            public final void onClick(View view) {
                                AbstractC1682806iQ abstractC1682806iQLIZ;
                                String str5;
                                AIGroupShotTemplateInfoComponent aIGroupShotTemplateInfoComponent;
                                EnumC1710806mw enumC1710806mw2 = enumC1710806mw;
                                if (enumC1710806mw2 != null) {
                                    int i = C1710706mv.LIZ[enumC1710806mw2.ordinal()];
                                    if (i != 1) {
                                        if (i == 2) {
                                            C1700606lI c1700606lI = C1700606lI.LIZIZ;
                                            C19EG c19egLIZ = C724240Sb0.LIZ(this);
                                            if (c19egLIZ == null) {
                                                return;
                                            }
                                            AIGroupShotEntry.InChat.InlineMessage inlineMessage = AIGroupShotEntry.InChat.InlineMessage.INSTANCE;
                                            if (this.tp().getChatType() == 3) {
                                                abstractC1682806iQLIZ = new C1682706iP(this.tp().getConversationId());
                                            } else {
                                                abstractC1682806iQLIZ = C1682506iN.LIZ(this.tp().getConversationId());
                                            }
                                            AIGroupShotCardReusedUISlot aIGroupShotCardReusedUISlot = this;
                                            AIGroupShotCardTemplate aIGroupShotCardTemplate3 = aIGroupShotCardReusedUISlot.LLLF;
                                            String str6 = null;
                                            if (aIGroupShotCardTemplate3 != null && (aIGroupShotTemplateInfoComponent = aIGroupShotCardTemplate3.templateInfo) != null) {
                                                str5 = aIGroupShotTemplateInfoComponent.templateId;
                                            } else {
                                                str5 = null;
                                                if (aIGroupShotCardTemplate3 != null) {
                                                }
                                                c1700606lI.LIZJ(c19egLIZ, inlineMessage, abstractC1682806iQLIZ, str5, str6, "chat", Integer.valueOf(aIGroupShotCardReusedUISlot.tp().getChatType()));
                                                return;
                                            }
                                            AIGroupShotTemplateInfoComponent aIGroupShotTemplateInfoComponent2 = aIGroupShotCardTemplate3.templateInfo;
                                            if (aIGroupShotTemplateInfoComponent2 != null) {
                                                str6 = aIGroupShotTemplateInfoComponent2.templateResId;
                                            }
                                            c1700606lI.LIZJ(c19egLIZ, inlineMessage, abstractC1682806iQLIZ, str5, str6, "chat", Integer.valueOf(aIGroupShotCardReusedUISlot.tp().getChatType()));
                                            return;
                                        }
                                        return;
                                    }
                                    Context context3 = this.getContext();
                                    if (context3 != null) {
                                        SmartRouter.buildRoute(context3, inlineMessageKeyComponent2.link).open();
                                    }
                                }
                            }

                            @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
                            public final void updateDrawState(TextPaint textPaint) {
                                super.updateDrawState(textPaint);
                                textPaint.setColor(iIntValue);
                                textPaint.setUnderlineText(false);
                            }
                        }, iLJJJ, str4.length() + iLJJJ, 33);
                    }
                }
            } else {
                spannableStringBuilder = new SpannableStringBuilder("");
            }
        }
        textView.setText(spannableStringBuilder);
        C1697806kq.LIZ((TuxTextView) this.LLJLLIL.getValue());
        ((C1295960jpS) this.LLJZ.getValue()).cancelAnimation();
        C1584506Ih.LIZ((View) this.LLJZ.getValue());
        ValueAnimator valueAnimator = this.LLJZIJLIL;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        C901500ZYe c901500ZYeSp = sp();
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c901500ZYeSp);
        c901500ZYeSp.setScaleX(1.0f);
        C901500ZYe c901500ZYeSp2 = sp();
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c901500ZYeSp2);
        c901500ZYeSp2.setScaleY(1.0f);
        if (C300840Bqk.LIZ()) {
            zLIZIZ = c462420IBk.LLILLL;
        } else {
            zLIZIZ = C0ZTM.LIZIZ.LIZ.LIZIZ(c869590Y9l, aIGroupShotCardTemplate);
        }
        if (zLIZIZ) {
            C1584506Ih.LIZ(sp());
            return;
        }
        C1584506Ih.LIZIZ(sp());
        C901500ZYe c901500ZYeSp3 = sp();
        C911450ZpH.LIZ.getClass();
        c901500ZYeSp3.LIZIZ(C911450ZpH.LIZJ(c869590Y9l), aIGroupShotCardTemplate, new AwS558S0100000_14(this, 160));
        C0ZQ8 currentStyle = sp().getCurrentStyle();
        if (!(currentStyle instanceof C901510ZYf) && !(currentStyle instanceof C0ZQ9)) {
            if (currentStyle instanceof C901520ZYg) {
                C893560Z3q.LIZJ(C893560Z3q.LIZ, Long.valueOf(c869590Y9l.getSender()), null, c869590Y9l.getConversationId(), null, "group_shot", null, false, false, false, true, null, null, null, null, 64960);
            } else if (!(currentStyle instanceof C0ZQA) && currentStyle != null) {
                throw new C1954807lC();
            }
        } else {
            C912070ZqH.LIZIZ.LJIIL().LJIIL("chat", EnumC1786290waJ.GROUP_SHOT_CARD, EnumC1711006my.JOIN, Integer.valueOf(tp().getChatType()));
        }
        op();
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ void vr(C462420IBk c462420IBk) {
    }

    @Override // X.InterfaceC712990Rxx
    public final void sr(InterfaceC1587906Jp interfaceC1587906Jp, List list) {
        boolean z;
        C462430IBl c462430IBl;
        boolean zLIZIZ;
        C462420IBk c462420IBk = (C462420IBk) interfaceC1587906Jp;
        this.LLLFFI = c462420IBk;
        if (list != null && !list.isEmpty()) {
            z = false;
        } else {
            z = true;
        }
        Object obj = null;
        if (z) {
            up(c462420IBk);
        } else {
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : list) {
                if (obj2 instanceof C461530I7z) {
                    arrayList.add(obj2);
                }
            }
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                Object obj3 = ((C461530I7z) it2.next()).LIZIZ;
                if ((obj3 instanceof C462430IBl) && (c462430IBl = (C462430IBl) obj3) != null) {
                    if (c462430IBl.LIZ) {
                        up(c462420IBk);
                    } else if (c462430IBl.LIZIZ) {
                        if (C300840Bqk.LIZ()) {
                            zLIZIZ = c462420IBk.LLILLL;
                        } else {
                            C0ZTM c0ztm = C0ZTM.LIZIZ;
                            C869590Y9l c869590Y9lLIZ = C0I6Y.LIZ(c462420IBk);
                            AIGroupShotCardTemplate aIGroupShotCardTemplate = this.LLLF;
                            if (aIGroupShotCardTemplate != null) {
                                zLIZIZ = c0ztm.LIZ.LIZIZ(c869590Y9lLIZ, aIGroupShotCardTemplate);
                            }
                        }
                        if (zLIZIZ) {
                            C1584506Ih.LIZ(sp());
                            ValueAnimator valueAnimator = this.LLJZIJLIL;
                            if (valueAnimator != null) {
                                valueAnimator.cancel();
                            }
                            C901500ZYe c901500ZYeSp = sp();
                            ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c901500ZYeSp);
                            c901500ZYeSp.setScaleX(1.0f);
                            C901500ZYe c901500ZYeSp2 = sp();
                            ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c901500ZYeSp2);
                            c901500ZYeSp2.setScaleY(1.0f);
                        }
                    }
                }
            }
        }
        C21652419oY c21652419oYUp = up();
        C898860ZOa gestureConfig = up().getGestureConfig();
        C911450ZpH c911450ZpH = C911450ZpH.LIZ;
        C724270Sb3 c724270Sb3 = this.LLJI;
        if (c724270Sb3 != null) {
            obj = c724270Sb3.LL;
        }
        C869590Y9l c869590Y9lLIZ2 = C0I6Y.LIZ((InterfaceC461380I7k) obj);
        c911450ZpH.getClass();
        c21652419oYUp.setGestureConfig(C898860ZOa.LIZ(gestureConfig, true ^ C911450ZpH.LIZJ(c869590Y9lLIZ2), false, 11));
        op();
    }
}
