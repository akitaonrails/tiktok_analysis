package com.ss.android.ugc.aweme.tako.botpage.cards.answer.languagestyle;

import X.C01GW;
import X.C0R36;
import X.C123100dR;
import X.C13LC;
import X.C13LP;
import X.C1856050yOp;
import X.C1857690yRT;
import X.C1862330yYx;
import X.C1863850ybP;
import X.C1864480ycQ;
import X.C201992141u;
import X.C444920HcY;
import X.C452501pT;
import X.C786410Ut5;
import X.InterfaceC1587906Jp;
import X.InterfaceC712990Rxx;
import android.text.SpannableStringBuilder;
import android.text.method.LinkMovementMethod;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.tako.ccl.model.api.TakoMixFeed;
import com.ss.android.ugc.aweme.tako.signal.ITakoContextAbility;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.AwS431S0200000_30;
import kotlin.jvm.internal.AwS574S0100000_30;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes31.dex */
public final class TakoLanguageStyleHintAssem extends ReusedUISlotAssem<TakoLanguageStyleHintAssem> implements InterfaceC712990Rxx<C0R36> {
    public final C01GW LLJJLIIIJLLLLLLLZ = C452501pT.LIZIZ(new AwS574S0100000_30(this, 216));
    public final C01GW LLJL = C452501pT.LIZIZ(new AwS574S0100000_30(this, 215));

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int Oo() {
        return R.layout.fn4;
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
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

    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final void up(C0R36 c0r36) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        C13LC<C1863850ybP> c13lcT71;
        C1863850ybP c1863850ybP;
        String str6;
        C13LC<C1863850ybP> c13lcT712;
        C1863850ybP c1863850ybP2;
        C13LC<C1863850ybP> c13lcT713;
        C1863850ybP c1863850ybP3;
        C13LC<C1863850ybP> c13lcT714;
        C1863850ybP c1863850ybP4;
        C13LC<C1863850ybP> c13lcT715;
        C1863850ybP c1863850ybP5;
        C13LC<C1863850ybP> c13lcT716;
        C1863850ybP c1863850ybP6;
        int iLJJJ;
        int iLJJJ2;
        C0R36 c0r362 = c0r36;
        TakoMixFeed takoMixFeed = c0r362.LLILZLL;
        String str7 = null;
        if (takoMixFeed != null) {
            str = takoMixFeed.text;
        } else {
            str = null;
        }
        if (C123100dR.LIZ(str)) {
            TuxTextView tuxTextView = (TuxTextView) LJJIJL().findViewById(R.id.x_u);
            if (tuxTextView != null) {
                AwS431S0200000_30 awS431S0200000_30 = new AwS431S0200000_30(this, tuxTextView, 49);
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
                C786410Ut5.q2(spannableStringBuilder, new ForegroundColorSpan(C1857690yRT.LJIIJ(R.attr.a1k)), 0, spannableStringBuilder.length(), 33);
                ArrayList arrayList = new ArrayList();
                int i = 0;
                while (true) {
                    int iLJJJ3 = a0.LJJJ(spannableStringBuilder, "<action>", i, false, 4);
                    if (iLJJJ3 == -1 || (iLJJJ2 = a0.LJJJ(spannableStringBuilder, "</action>", iLJJJ3 + 8, false, 4)) == -1) {
                        break;
                    }
                    arrayList.add(new Pair(Integer.valueOf(iLJJJ3), Integer.valueOf(iLJJJ2)));
                    i = iLJJJ2 + 9;
                }
                for (Pair pair : C13LP.LJLJJLL(arrayList)) {
                    int iIntValue = ((Number) pair.getFirst()).intValue();
                    int iIntValue2 = ((Number) pair.getSecond()).intValue();
                    int i2 = iIntValue + 8;
                    if (i2 < iIntValue2) {
                        C786410Ut5.q2(spannableStringBuilder, new C444920HcY(52, false), i2, iIntValue2, 33);
                        C786410Ut5.q2(spannableStringBuilder, new C1864480ycQ(awS431S0200000_30, 3), i2, iIntValue2, 33);
                    }
                    spannableStringBuilder.delete(iIntValue2, iIntValue2 + 9);
                    spannableStringBuilder.delete(iIntValue, i2);
                }
                ArrayList arrayList2 = new ArrayList();
                int i3 = 0;
                while (true) {
                    int iLJJJ4 = a0.LJJJ(spannableStringBuilder, "<b>", i3, false, 4);
                    if (iLJJJ4 == -1 || (iLJJJ = a0.LJJJ(spannableStringBuilder, "</b>", iLJJJ4 + 3, false, 4)) == -1) {
                        break;
                    }
                    arrayList2.add(new Pair(Integer.valueOf(iLJJJ4), Integer.valueOf(iLJJJ)));
                    i3 = iLJJJ + 4;
                }
                for (Pair pair2 : C13LP.LJLJJLL(arrayList2)) {
                    int iIntValue3 = ((Number) pair2.getFirst()).intValue();
                    int iIntValue4 = ((Number) pair2.getSecond()).intValue();
                    int i4 = iIntValue3 + 3;
                    if (i4 < iIntValue4) {
                        C786410Ut5.q2(spannableStringBuilder, new C444920HcY(52, false), i4, iIntValue4, 33);
                    }
                    spannableStringBuilder.delete(iIntValue4, iIntValue4 + 4);
                    spannableStringBuilder.delete(iIntValue3, i4);
                }
                tuxTextView.setMovementMethod(LinkMovementMethod.getInstance());
                tuxTextView.setText(spannableStringBuilder);
            }
            String str8 = c0r362.LLILLJJLI;
            ITakoContextAbility iTakoContextAbilityOp = op();
            if (iTakoContextAbilityOp != null && (c13lcT716 = iTakoContextAbilityOp.T71()) != null && (c1863850ybP6 = (C1863850ybP) c13lcT716.LIZIZ()) != null) {
                str2 = c1863850ybP6.LLILZIL;
            } else {
                str2 = null;
            }
            String str9 = "";
            if (str2 == null) {
                str2 = "";
            }
            C201992141u.LIZ.getClass();
            Map<String, List<String>> map = C201992141u.LJ;
            List list = (List) C1856050yOp.LIZIZ(str2, map);
            if (list != null && list.contains(str8)) {
                return;
            }
            List<String> arrayList3 = (List) C1856050yOp.LIZIZ(str2, map);
            if (arrayList3 == null) {
                arrayList3 = new ArrayList<>();
            }
            arrayList3.add(str8);
            map.put(str2, arrayList3);
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
                str7 = c1863850ybP3.LLILZIL;
            }
            ITakoContextAbility iTakoContextAbilityOp5 = op();
            if (iTakoContextAbilityOp5 == null || (c13lcT712 = iTakoContextAbilityOp5.T71()) == null || (c1863850ybP2 = (C1863850ybP) c13lcT712.LIZIZ()) == null || (str5 = c1863850ybP2.LLILZLL) == null) {
                str5 = "";
            }
            ITakoContextAbility iTakoContextAbilityOp6 = op();
            if (iTakoContextAbilityOp6 != null && (c13lcT71 = iTakoContextAbilityOp6.T71()) != null && (c1863850ybP = (C1863850ybP) c13lcT71.LIZIZ()) != null && (str6 = c1863850ybP.LLIZ) != null) {
                str9 = str6;
            }
            C1862330yYx.LJJLIIIJJI(c1862330yYx, str3, str4, str7, "language_style", "change", str5, str9);
        }
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ boolean ur(C0R36 c0r36) {
        return true;
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ void vr(C0R36 c0r36) {
    }

    @Override // X.InterfaceC712990Rxx
    public final void sr(InterfaceC1587906Jp interfaceC1587906Jp, List list) {
        up(interfaceC1587906Jp);
    }
}
