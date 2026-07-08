package kotlin.jvm.internal;

import X.C020W;
import X.C08QA;
import X.C09AY;
import X.C0CHQ;
import X.C0DZZ;
import X.C0MAX;
import X.C0NNA;
import X.C0VSJ;
import X.C0WZX;
import X.C1308910kAL;
import X.C1622410sJz;
import X.C1622420sK0;
import X.C1622440sK2;
import X.C1670840ta6;
import X.C1675360thO;
import X.C1675370thP;
import X.C1686700tzg;
import X.C1686720tzi;
import X.C1698320uIQ;
import X.C1735760vGo;
import X.C19292410dm;
import X.C19719212De;
import X.C201955140j;
import X.C2188811AlT;
import X.C2204961BRm;
import X.C23250099c;
import X.EnumC1671200tag;
import X.EnumC19358310oP;
import X.EnumC20228214Cy;
import X.EnumC21568119ax;
import X.InterfaceC1622430sK1;
import X.InterfaceC1664410tPj;
import X.InterfaceC1665500tRU;
import X.ViewOnAttachStateChangeListenerC1846530y9T;
import Y.ARunnableS104S0100000_4;
import android.content.Context;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;
import android.widget.FrameLayout;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.ss.android.ugc.aweme.creative.model.TemplateEffectInfo;
import com.ss.android.ugc.aweme.creative.model.UploadableMobileEffect2;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.social.thought.view.IThoughtBubblePromptResolver;
import com.ss.android.ugc.aweme.social.thought.view.SocialThoughtBaseBubbleBackgroundView;
import com.ss.android.ugc.aweme.sticker.model.FaceStickerBean;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.gamora.recorder.sticker.templateeffect.DiyPropParser;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes26.dex */
public class AwS27S1400000_25 extends C09AY implements Function1 {
    public final int $t;
    public Object l1;
    public Object l2;
    public Object l3;
    public Object l4;
    public String s0;

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj);
            case 1:
                return invoke$1(this, obj);
            case 2:
                return invoke$2(this, obj);
            case 3:
                return invoke$3(this, obj);
            default:
                return null;
        }
    }

    public static /* bridge */ /* synthetic */ Object invoke$0(AwS27S1400000_25 awS27S1400000_25, Object obj) throws Throwable {
        int iIntValue;
        String str;
        int length;
        C0DZZ c0dzzLIZ;
        Context context = (Context) obj;
        SocialThoughtBaseBubbleBackgroundView socialThoughtBaseBubbleBackgroundView = new SocialThoughtBaseBubbleBackgroundView(context, null, 6, 0);
        EnumC21568119ax enumC21568119ax = (EnumC21568119ax) awS27S1400000_25.l1;
        EditText[] editTextArr = (EditText[]) awS27S1400000_25.l2;
        String str2 = awS27S1400000_25.s0;
        final boolean[] zArr = (boolean[]) awS27S1400000_25.l3;
        final Function2 function2 = (Function2) awS27S1400000_25.l4;
        socialThoughtBaseBubbleBackgroundView.setBubbleShape(enumC21568119ax);
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a1f, context);
        if (numLIZJ != null) {
            iIntValue = numLIZJ.intValue();
        } else {
            iIntValue = -1;
        }
        socialThoughtBaseBubbleBackgroundView.setFillColor(iIntValue);
        socialThoughtBaseBubbleBackgroundView.setBubbleAnchor(EnumC19358310oP.START_BOTTOM);
        socialThoughtBaseBubbleBackgroundView.setBodyMinWidthOverrideDp(108.0f);
        float f = context.getResources().getDisplayMetrics().density;
        int i = (int) (16 * f);
        int i2 = (int) (14 * f);
        IThoughtBubblePromptResolver iThoughtBubblePromptResolver = (IThoughtBubblePromptResolver) PluggableExtentionKt.pluggableSpi$default(IThoughtBubblePromptResolver.class, false, false, false, 14, null);
        if (iThoughtBubblePromptResolver == null || (c0dzzLIZ = iThoughtBubblePromptResolver.LIZ(context, true)) == null || (str = c0dzzLIZ.LIZ) == null) {
            str = "";
        }
        C1735760vGo c1735760vGo = new C1735760vGo(context);
        c1735760vGo.setBackground(null);
        c1735760vGo.setInputType(131073);
        c1735760vGo.setPrompt(str);
        c1735760vGo.setFocusable(true);
        c1735760vGo.setFocusableInTouchMode(true);
        c1735760vGo.setPadding(i, i2, i, i2);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c1735760vGo);
        c1735760vGo.setLayoutParams(layoutParams);
        c1735760vGo.setMaxFontSize(21);
        c1735760vGo.setAutoSizeSteps(C1670840ta6.LIZ);
        c1735760vGo.addTextChangedListener(new TextWatcher() { // from class: X.0tz9
            @Override // android.text.TextWatcher
            public final void beforeTextChanged(CharSequence charSequence, int i3, int i4, int i5) {
            }

            @Override // android.text.TextWatcher
            public final void onTextChanged(CharSequence charSequence, int i3, int i4, int i5) {
            }

            @Override // android.text.TextWatcher
            public final void afterTextChanged(Editable editable) {
                String string;
                Function2<String, Boolean, Unit> function22 = function2;
                if (editable == null || (string = editable.toString()) == null) {
                    string = "";
                }
                function22.invoke(string, Boolean.valueOf(!zArr[0]));
            }
        });
        c1735760vGo.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() { // from class: X.0tzA
            @Override // android.view.View.OnAttachStateChangeListener
            public final void onViewDetachedFromWindow(View view) {
            }

            @Override // android.view.View.OnAttachStateChangeListener
            public final void onViewAttachedToWindow(View view) {
                view.requestFocus();
                HandlerHook.viewPost(view, new ARunnableS104S0100000_4(view, 98));
            }
        });
        if (str2.length() > 0) {
            zArr[0] = true;
            c1735760vGo.setText(str2);
            Editable editableR = C2204961BRm.r(c1735760vGo, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KPmnYJbP0HxsIa5vyM7VV+Jl0+7O0GY8L9FouNLLfzWuPp7xnfbWLmSZrx5YRPc=", null));
            if (editableR != null) {
                length = editableR.length();
            } else {
                length = 0;
            }
            c1735760vGo.setSelection(length);
            zArr[0] = false;
        }
        socialThoughtBaseBubbleBackgroundView.addView(c1735760vGo);
        editTextArr[0] = c1735760vGo;
        return socialThoughtBaseBubbleBackgroundView;
    }

    public static final Object invoke$1(AwS27S1400000_25 awS27S1400000_25, Object obj) {
        C1686700tzg c1686700tzg = (C1686700tzg) awS27S1400000_25.l1;
        c1686700tzg.LLJILLL.addView(c1686700tzg, c1686700tzg.LLJJ);
        ((C1686700tzg) awS27S1400000_25.l1).LJIIJJI((Function0) awS27S1400000_25.l2, (C1686720tzi) awS27S1400000_25.l3, awS27S1400000_25.s0, (EnumC1671200tag) awS27S1400000_25.l4);
        return new C1698320uIQ((C1686700tzg) awS27S1400000_25.l1, 8);
    }

    public static final Object invoke$2(AwS27S1400000_25 awS27S1400000_25, Object obj) {
        InterfaceC1665500tRU interfaceC1665500tRU = (InterfaceC1665500tRU) awS27S1400000_25.l1;
        AFwS266S0000000_25 aFwS266S0000000_25 = AFwS266S0000000_25.get$arr$(530);
        String str = awS27S1400000_25.s0;
        InterfaceC1664410tPj interfaceC1664410tPj = (InterfaceC1664410tPj) awS27S1400000_25.l2;
        Function0 function0 = (Function0) awS27S1400000_25.l3;
        Function1 function1 = (Function1) awS27S1400000_25.l4;
        ((C0MAX) obj).LJ(interfaceC1665500tRU.size(), new C020W(aFwS266S0000000_25, interfaceC1665500tRU, 74), null, new C020W(AFwS266S0000000_25.get$arr$(531), interfaceC1665500tRU, 75), new C19719212De(699646206, new C1675360thO(interfaceC1665500tRU, str, interfaceC1664410tPj, function0, function1), true));
        return Unit.LIZ;
    }

    public static final Object invoke$3(AwS27S1400000_25 awS27S1400000_25, Object obj) {
        Long lValueOf;
        String name;
        String nickname = null;
        if (((Number) obj).intValue() == 3) {
            ((C1622410sJz) awS27S1400000_25.l1).LLJILLL = null;
        } else {
            C1622410sJz c1622410sJz = (C1622410sJz) awS27S1400000_25.l1;
            Effect effect = (Effect) awS27S1400000_25.l2;
            String str = awS27S1400000_25.s0;
            InterfaceC1622430sK1 interfaceC1622430sK1 = (InterfaceC1622430sK1) awS27S1400000_25.l3;
            c1622410sJz.getClass();
            DiyPropParser.LJIIJJI(effect);
            String resourceId = effect.getResourceId();
            C0VSJ c0vsjLJIILLIIL = C0CHQ.LIZ().LJJIIJZLJL().getPathService().LJIILLIIL(c1622410sJz.LL.creativeInfo, EnumC20228214Cy.MOBILE_EFFECT, str, false);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(effect.getName());
            sbLIZ.append('-');
            C19292410dm currentUser = C0CHQ.LIZ().getAccountService().getCurrentUser();
            if (currentUser != null) {
                nickname = currentUser.getNickname();
            }
            sbLIZ.append(nickname);
            UploadableMobileEffect2 uploadableMobileEffect2 = new UploadableMobileEffect2(str, C2188811AlT.LIZIZ(sbLIZ), C08QA.LJIL(c0vsjLJIILLIIL, "icon.png").getAbsolutePath(), C08QA.LJIL(c0vsjLJIILLIIL, "all.zip").getAbsolutePath(), c0vsjLJIILLIIL.getAbsolutePath(), new TemplateEffectInfo(resourceId, effect.getEffectId()), null, null, true, false, null);
            C1622440sK2 c1622440sK2LIZLLL = interfaceC1622430sK1.LIZLLL(effect, uploadableMobileEffect2);
            Function0<Boolean> function0 = c1622440sK2LIZLLL.LIZ;
            int i = c1622440sK2LIZLLL.LIZIZ;
            FaceStickerBean faceStickerBean = c1622440sK2LIZLLL.LIZJ;
            c1622410sJz.LLJILLL = faceStickerBean;
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("convertToStickerBean stickerId=");
            if (faceStickerBean != null) {
                lValueOf = Long.valueOf(faceStickerBean.getStickerId());
            } else {
                lValueOf = null;
            }
            sbLIZ2.append(lValueOf);
            sbLIZ2.append(" stickerName=");
            if (faceStickerBean != null) {
                name = faceStickerBean.getName();
            } else {
                name = null;
            }
            sbLIZ2.append(name);
            C201955140j.LIZIZ("MET-JEFF", C2188811AlT.LIZIZ(sbLIZ2));
            if (i != 1 && !function0.invoke().booleanValue()) {
                c1622410sJz.LLJILJILJ = null;
            } else {
                c1622410sJz.LLJILJILJ = uploadableMobileEffect2;
                c1622410sJz.LLJ.put(uploadableMobileEffect2.effectId, new C1622420sK0(faceStickerBean, i, function0));
            }
            c1622410sJz.LLJI = null;
            ((ArrayList) c1622410sJz.LLIZLLLIL).add(C23250099c.LIZLLL(c1622410sJz.LLILZLL, null, null, new C0NNA(c1622410sJz, null), 3));
            Function0 function02 = (Function0) awS27S1400000_25.l4;
            if (function02 != null) {
                function02.invoke();
            }
        }
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS27S1400000_25(C1622410sJz c1622410sJz, C1622410sJz c1622410sJz2, Effect effect, String str, InterfaceC1622430sK1 interfaceC1622430sK1, Function0<Unit> function0) {
        super(1);
        this.$t = function0;
        this.l1 = c1622410sJz;
        this.l2 = c1622410sJz2;
        this.s0 = effect;
        this.l3 = str;
        this.l4 = interfaceC1622430sK1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS27S1400000_25(InterfaceC1665500tRU interfaceC1665500tRU, InterfaceC1665500tRU<C1675370thP> interfaceC1665500tRU2, String str, InterfaceC1664410tPj<String> interfaceC1664410tPj, Function0<Unit> function0, Function1<? super InterfaceC1664410tPj<String>, Unit> function1) {
        super(1);
        this.$t = function1;
        this.l1 = interfaceC1665500tRU;
        this.s0 = interfaceC1665500tRU2;
        this.l2 = str;
        this.l3 = interfaceC1664410tPj;
        this.l4 = function0;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS27S1400000_25(C1686700tzg c1686700tzg, C1686700tzg c1686700tzg2, Function0<Unit> function0, C1686720tzi c1686720tzi, String str, EnumC1671200tag enumC1671200tag) {
        super(1);
        this.$t = enumC1671200tag;
        this.l1 = c1686700tzg;
        this.l2 = c1686700tzg2;
        this.l3 = function0;
        this.s0 = c1686720tzi;
        this.l4 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS27S1400000_25(EnumC21568119ax enumC21568119ax, EnumC21568119ax enumC21568119ax2, EditText[] editTextArr, String str, boolean[] zArr, Function2<? super String, ? super Boolean, Unit> function2) {
        super(1);
        this.$t = function2;
        this.l1 = enumC21568119ax;
        this.l2 = enumC21568119ax2;
        this.s0 = editTextArr;
        this.l3 = str;
        this.l4 = zArr;
    }
}
