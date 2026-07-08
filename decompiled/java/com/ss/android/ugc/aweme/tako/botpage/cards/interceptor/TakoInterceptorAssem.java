package com.ss.android.ugc.aweme.tako.botpage.cards.interceptor;

import X.C00GX;
import X.C019F;
import X.C01GW;
import X.C1308910kAL;
import X.C13LC;
import X.C13LE;
import X.C1637806bA;
import X.C1856050yOp;
import X.C1856350yPJ;
import X.C1862330yYx;
import X.C1863850ybP;
import X.C19719912Dl;
import X.C2095008Iq;
import X.C2217381BqS;
import X.C322730Ckx;
import X.C418440Gaw;
import X.C426750GoL;
import X.C452501pT;
import X.C724750Sbp;
import X.C786410Ut5;
import X.C814420VxA;
import X.InterfaceC1587906Jp;
import X.InterfaceC2217461Bqa;
import X.InterfaceC712990Rxx;
import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.view.View;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.tako.botpage.components.action.multiple.TakoMultipleSelectVM;
import com.ss.android.ugc.aweme.tako.botpage.vm.ability.IMessageAbility;
import com.ss.android.ugc.aweme.tako.ccl.model.api.Message;
import com.ss.android.ugc.aweme.tako.ccl.model.api.TakoMixFeed;
import com.ss.android.ugc.aweme.tako.signal.ITakoContextAbility;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AFwS264S0000000_24;
import kotlin.jvm.internal.AwS271S0300000_27;
import kotlin.jvm.internal.AwS568S0100000_24;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes28.dex */
public class TakoInterceptorAssem extends ReusedUISlotAssem<TakoInterceptorAssem> implements InterfaceC712990Rxx<C322730Ckx> {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJLLIL;
    public final C01GW LLJJLIIIJLLLLLLLZ = C452501pT.LIZIZ(new AwS568S0100000_24(this, 1262));
    public final C01GW LLJL = C452501pT.LIZIZ(new AwS568S0100000_24(this, 1261));
    public final AssemVMLazy LLJLIL;
    public TuxTextView LLJLILLLLZIIL;
    public String LLJLL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(TakoInterceptorAssem.class, "multipleSelectVM", "getMultipleSelectVM()Lcom/ss/android/ugc/aweme/tako/botpage/components/action/multiple/TakoMultipleSelectVM;", 0);
        C13LE.LIZ.getClass();
        LLJLLIL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public TakoInterceptorAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(TakoMultipleSelectVM.class);
        this.LLJLIL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new AwS568S0100000_24(c19719912DlLIZ, 1263), AFwS264S0000000_24.get$arr$(433), null, true);
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int Oo() {
        return R.layout.fn_;
    }

    @Override // X.InterfaceC712990Rxx
    public final void unBind() {
    }

    @Override // X.InterfaceC712990Rxx
    public final void wr() {
    }

    public final ITakoContextAbility op() {
        return (ITakoContextAbility) this.LLJL.getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x002d  */
    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onViewCreated(android.view.View r5) {
        /*
            r4 = this;
            r0 = 2131381986(0x7f0a4ee2, float:1.8384305E38)
            android.view.View r0 = r5.findViewById(r0)
            com.bytedance.tux.input.TuxTextView r0 = (com.bytedance.tux.input.TuxTextView) r0
            r4.LLJLILLLLZIIL = r0
            r0 = 2131378892(0x7f0a42cc, float:1.837803E38)
            android.view.View r3 = r5.findViewById(r0)
            X.0Q7z r2 = X.C1558520qew.LJIIL(r4)
            java.lang.Class<com.ss.android.ugc.aweme.tako.signal.ITakoContextAbility> r1 = com.ss.android.ugc.aweme.tako.signal.ITakoContextAbility.class
            r0 = 0
            X.01wD r0 = X.C1558520qew.LIZ(r2, r1, r0)
            com.ss.android.ugc.aweme.tako.signal.ITakoContextAbility r0 = (com.ss.android.ugc.aweme.tako.signal.ITakoContextAbility) r0
            r2 = 0
            if (r0 == 0) goto L2d
            boolean r1 = r0.T91()
            r0 = 1
            if (r1 != r0) goto L2d
        L29:
            X.C1857750yRZ.LJIIIZ(r3, r0, r2)
            return
        L2d:
            r0 = 0
            goto L29
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.tako.botpage.cards.interceptor.TakoInterceptorAssem.onViewCreated(android.view.View):void");
    }

    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final void up(C322730Ckx c322730Ckx) {
        boolean z;
        IMessageAbility iMessageAbility;
        TakoMixFeed takoMixFeedLJIIIZ;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        C13LC<C1863850ybP> c13lcT71;
        C1863850ybP c1863850ybP;
        String str8;
        C13LC<C1863850ybP> c13lcT712;
        C1863850ybP c1863850ybP2;
        Integer numLJIIJJI;
        C13LC<C1863850ybP> c13lcT713;
        C1863850ybP c1863850ybP3;
        C13LC<C1863850ybP> c13lcT714;
        C1863850ybP c1863850ybP4;
        C13LC<C1863850ybP> c13lcT715;
        C1863850ybP c1863850ybP5;
        C13LC<C1863850ybP> c13lcT716;
        C1863850ybP c1863850ybP6;
        final int iIntValue;
        C322730Ckx c322730Ckx2 = c322730Ckx;
        TakoMixFeed takoMixFeedLJIIIZ2 = c322730Ckx2.LLILLJJLI.LLILLL.LJIIIZ();
        if (takoMixFeedLJIIIZ2 != null && takoMixFeedLJIIIZ2.cardType == 1022) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            TuxTextView tuxTextView = this.LLJLILLLLZIIL;
            if (tuxTextView == null) {
                tuxTextView = null;
            }
            tuxTextView.setMovementMethod(LinkMovementMethod.getInstance());
            tuxTextView.setHighlightColor(0);
            Context context = getContext();
            if (context != null) {
                String string = context.getString(2131822454);
                String strJ4 = C786410Ut5.j4(context.getString(2131822453), Arrays.copyOf(new Object[]{string}, 1));
                final AwS271S0300000_27 awS271S0300000_27 = new AwS271S0300000_27(this, c322730Ckx2, tuxTextView, 23);
                int iLJJJ = a0.LJJJ(strJ4, string, 0, false, 6);
                Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a1n, context);
                if (numLIZJ != null) {
                    iIntValue = numLIZJ.intValue();
                } else {
                    iIntValue = 0;
                }
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(strJ4);
                if (iLJJJ >= 0) {
                    C786410Ut5.q2(spannableStringBuilder, new ClickableSpan() { // from class: X.0yOo
                        @Override // android.text.style.ClickableSpan
                        public final void onClick(View view) {
                            if (C0OBG.LIZ(1000L, view)) {
                                return;
                            }
                            awS271S0300000_27.invoke();
                        }

                        @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
                        public final void updateDrawState(TextPaint textPaint) {
                            textPaint.setColor(iIntValue);
                            textPaint.setUnderlineText(false);
                        }
                    }, iLJJJ, string.length() + iLJJJ, 17);
                }
                tuxTextView.setText(spannableStringBuilder);
            }
            ITakoContextAbility iTakoContextAbilityOp = op();
            if (iTakoContextAbilityOp != null && (c13lcT716 = iTakoContextAbilityOp.T71()) != null && (c1863850ybP6 = (C1863850ybP) c13lcT716.LIZIZ()) != null) {
                str = c1863850ybP6.LLILZIL;
            } else {
                str = null;
            }
            String str9 = "";
            if (str == null) {
                str = "";
            }
            String str10 = c322730Ckx2.LLILLJJLI.LLILLL.uuid;
            Map<String, List<String>> map = C00GX.LIZ;
            List list = (List) C1856050yOp.LIZIZ(str, map);
            if (list == null || !list.contains(str10)) {
                List<String> arrayList = (List) C1856050yOp.LIZIZ(str, map);
                if (arrayList == null) {
                    arrayList = new ArrayList<>();
                }
                arrayList.add(str10);
                map.put(str, arrayList);
                TakoMixFeed takoMixFeedLJIIIZ3 = c322730Ckx2.LLILLJJLI.LLILLL.LJIIIZ();
                if (takoMixFeedLJIIIZ3 != null) {
                    str2 = takoMixFeedLJIIIZ3.msgExt.get("source_card_type");
                } else {
                    str2 = null;
                }
                C1862330yYx c1862330yYx = C1862330yYx.LIZ;
                ITakoContextAbility iTakoContextAbilityOp2 = op();
                if (iTakoContextAbilityOp2 != null && (c13lcT715 = iTakoContextAbilityOp2.T71()) != null && (c1863850ybP5 = (C1863850ybP) c13lcT715.LIZIZ()) != null) {
                    str3 = c1863850ybP5.LL;
                } else {
                    str3 = null;
                }
                ITakoContextAbility iTakoContextAbilityOp3 = op();
                if (iTakoContextAbilityOp3 != null && (c13lcT714 = iTakoContextAbilityOp3.T71()) != null && (c1863850ybP4 = (C1863850ybP) c13lcT714.LIZIZ()) != null) {
                    str4 = c1863850ybP4.LLILLJJLI;
                } else {
                    str4 = null;
                }
                ITakoContextAbility iTakoContextAbilityOp4 = op();
                if (iTakoContextAbilityOp4 != null && (c13lcT713 = iTakoContextAbilityOp4.T71()) != null && (c1863850ybP3 = (C1863850ybP) c13lcT713.LIZIZ()) != null) {
                    str5 = c1863850ybP3.LLILZIL;
                } else {
                    str5 = null;
                }
                if (str2 != null && (numLJIIJJI = C2095008Iq.LJIIJJI(str2)) != null && numLJIIJJI.intValue() == 301) {
                    str6 = "image_generation";
                } else {
                    str6 = "text_generation";
                }
                ITakoContextAbility iTakoContextAbilityOp5 = op();
                if (iTakoContextAbilityOp5 == null || (c13lcT712 = iTakoContextAbilityOp5.T71()) == null || (c1863850ybP2 = (C1863850ybP) c13lcT712.LIZIZ()) == null || (str7 = c1863850ybP2.LLILZLL) == null) {
                    str7 = "";
                }
                ITakoContextAbility iTakoContextAbilityOp6 = op();
                if (iTakoContextAbilityOp6 != null && (c13lcT71 = iTakoContextAbilityOp6.T71()) != null && (c1863850ybP = (C1863850ybP) c13lcT71.LIZIZ()) != null && (str8 = c1863850ybP.LLIZ) != null) {
                    str9 = str8;
                }
                C1862330yYx.LJJLIIIJJIZ(c1862330yYx, str3, str4, str5, str10, str6, "try again", str7, str9);
            }
        } else {
            TuxTextView tuxTextView2 = this.LLJLILLLLZIIL;
            if (tuxTextView2 == null) {
                tuxTextView2 = null;
            }
            tuxTextView2.setText(c322730Ckx2.LL);
        }
        TuxTextView tuxTextView3 = this.LLJLILLLLZIIL;
        if (tuxTextView3 == null) {
            tuxTextView3 = null;
        }
        C786410Ut5.LLLLZLL(tuxTextView3, 0);
        C1856350yPJ.LIZ.getClass();
        if (C1856350yPJ.LIZ() && (takoMixFeedLJIIIZ = c322730Ckx2.LLILLJJLI.LLILLL.LJIIIZ()) != null && takoMixFeedLJIIIZ.cardType == 1012) {
            TuxTextView tuxTextView4 = this.LLJLILLLLZIIL;
            if (tuxTextView4 == null) {
                tuxTextView4 = null;
            }
            tuxTextView4.setGravity(8388611);
            TuxTextView tuxTextView5 = this.LLJLILLLLZIIL;
            if (tuxTextView5 == null) {
                tuxTextView5 = null;
            }
            C426750GoL.LJIIIZ(tuxTextView5, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16))), 0, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16))), 0, false, 16);
            TuxTextView tuxTextView6 = this.LLJLILLLLZIIL;
            if (tuxTextView6 == null) {
                tuxTextView6 = null;
            }
            tuxTextView6.setTuxFont(71);
        }
        Message message = c322730Ckx2.LLILLJJLI.LLILLL;
        if ((true ^ Intrinsics.LJFF(c322730Ckx2.LLILLL, this.LLJLL)) && message != null && (iMessageAbility = (IMessageAbility) this.LLJJLIIIJLLLLLLLZ.getValue()) != null) {
            iMessageAbility.P92(message);
        }
        this.LLJLL = c322730Ckx2.LLILLL;
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ boolean ur(C322730Ckx c322730Ckx) {
        return true;
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ void vr(C322730Ckx c322730Ckx) {
    }

    @Override // X.InterfaceC712990Rxx
    public final void sr(InterfaceC1587906Jp interfaceC1587906Jp, List list) {
        up(interfaceC1587906Jp);
    }
}
