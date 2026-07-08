package com.ss.android.ugc.aweme.tako.botpage.cards.novel.choice;

import X.C019F;
import X.C01GW;
import X.C03IJ;
import X.C093Y;
import X.C09R3;
import X.C0DSB;
import X.C0HZQ;
import X.C13LC;
import X.C13LE;
import X.C13LP;
import X.C1637806bA;
import X.C1637906bB;
import X.C1697810uHb;
import X.C1728806pq;
import X.C1857750yRZ;
import X.C1857790yRd;
import X.C1861360yXO;
import X.C1862330yYx;
import X.C1863850ybP;
import X.C19719612Di;
import X.C19719912Dl;
import X.C20235014Fo;
import X.C2097608Jq;
import X.C2188811AlT;
import X.C2217381BqS;
import X.C384050F3z;
import X.C418440Gaw;
import X.C427660Gpo;
import X.C452501pT;
import X.C597050NbL;
import X.C724270Sb3;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C736820SvI;
import X.C786410Ut5;
import X.C814420VxA;
import X.InterfaceC1860810yWV;
import X.InterfaceC2217461Bqa;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.android.livesdk.livesetting.game.DefaultHighLightCutConfig;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.tako.botpage.cards.base.TakoAnswerBaseAssem;
import com.ss.android.ugc.aweme.tako.botpage.cards.novel.core.TakoNovelBotViewModel;
import com.ss.android.ugc.aweme.tako.botpage.vm.MessageViewModel;
import com.ss.android.ugc.aweme.tako.ccl.model.api.Message;
import com.ss.android.ugc.aweme.tako.ccl.model.api.TakoMixFeed;
import com.ss.android.ugc.aweme.tako.ccl.model.api.TakoNovelChoiceSelect;
import com.ss.android.ugc.aweme.tako.signal.ITakoContextAbility;
import com.zhiliaoapp.musically.R;
import irm.AkS67S0200000_30;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.AFwS274S0000000_30;
import kotlin.jvm.internal.AwS396S0200000_30;
import kotlin.jvm.internal.AwS546S0100000_2;
import kotlin.jvm.internal.AwS571S0100000_27;
import kotlin.jvm.internal.AwS609S0100000_30;
import kotlin.jvm.internal.AwS644S0100000_30;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes31.dex */
public final class TakoNovelChoiceAssem extends TakoAnswerBaseAssem<C1857790yRd> {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLLZLZ;
    public final C01GW LLLLZLLLI = C452501pT.LIZIZ(new AwS571S0100000_27(this, 752));
    public final AssemVMLazy LLLZ;
    public final AssemVMLazy LLLZI;
    public final AssemVMLazy LLLZIIL;
    public final C01GW LLLZIL;
    public final C01GW LLLZL;
    public final List<TuxTextView> LLLZLL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(TakoNovelChoiceAssem.class, "messageViewModel", "getMessageViewModel()Lcom/ss/android/ugc/aweme/tako/botpage/vm/MessageViewModel;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(TakoNovelChoiceAssem.class, "novelBotViewModel", "getNovelBotViewModel()Lcom/ss/android/ugc/aweme/tako/botpage/cards/novel/core/TakoNovelBotViewModel;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS3 = new C2217381BqS(TakoNovelChoiceAssem.class, "novelChoiceViewModel", "getNovelChoiceViewModel()Lcom/ss/android/ugc/aweme/tako/botpage/cards/novel/choice/TakoNovelChoiceViewModel;", 0);
        c09r3.getClass();
        LLLZLZ = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2, c2217381BqS3};
    }

    public TakoNovelChoiceAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(MessageViewModel.class);
        C1637906bB c1637906bB = C1637806bA.LIZ;
        this.LLLZ = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, c1637906bB, new AwS546S0100000_2(c19719912DlLIZ, 845), AFwS274S0000000_30.get$arr$(146), null, true);
        C19719912Dl c19719912DlLIZ2 = C13LE.LIZ(TakoNovelBotViewModel.class);
        this.LLLZI = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ2), c019f, c1637906bB, new AwS546S0100000_2(c19719912DlLIZ2, 846), AFwS274S0000000_30.get$arr$(147), null, true);
        C03IJ c03ij = C03IJ.LIZ;
        C19719912Dl c19719912DlLIZ3 = C13LE.LIZ(TakoNovelChoiceViewModel.class);
        this.LLLZIIL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ3), c03ij, c1637906bB, new AwS546S0100000_2(c19719912DlLIZ3, 847), AFwS274S0000000_30.get$arr$(148), null, true);
        this.LLLZIL = C452501pT.LIZIZ(new AwS546S0100000_2(this, 848));
        this.LLLZL = C452501pT.LIZIZ(new AwS546S0100000_2(this, 844));
        this.LLLZLL = new ArrayList();
    }

    @Override // com.ss.android.ugc.aweme.tako.arch.protocol.TakoBaseAssem
    public final C0HZQ Bp() {
        return null;
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int Oo() {
        return R.layout.fmg;
    }

    @Override // com.ss.android.ugc.aweme.tako.botpage.cards.base.TakoAnswerBaseAssem
    public final /* bridge */ /* synthetic */ InterfaceC1860810yWV Tp() {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.tako.arch.protocol.TakoBaseAssem
    public final C427660Gpo sp() {
        return null;
    }

    public final LinearLayout Vr() {
        return (LinearLayout) this.LLLZL.getValue();
    }

    public final TakoNovelChoiceViewModel Xr() {
        AssemVMLazy assemVMLazy = this.LLLZIIL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLLZLZ;
        return (TakoNovelChoiceViewModel) assemVMLazy.getValue();
    }

    public final Drawable Yr() {
        C384050F3z c384050F3z = new C384050F3z();
        c384050F3z.LIZIZ = Integer.valueOf(R.attr.a02);
        c384050F3z.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(10));
        c384050F3z.LJFF = Integer.valueOf(R.attr.ee);
        c384050F3z.LIZLLL = Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Double.valueOf(0.5d))));
        return c384050F3z.LIZ(getContentView().getContext());
    }

    public final Drawable cs() {
        C384050F3z c384050F3z = new C384050F3z();
        c384050F3z.LIZIZ = Integer.valueOf(R.attr.a02);
        c384050F3z.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(10));
        return c384050F3z.LIZ(getContentView().getContext());
    }

    public final TuxTextView gs(Context context) {
        TuxTextView tuxTextView = new TuxTextView(context, null, 6, 0);
        tuxTextView.setId(View.generateViewId());
        tuxTextView.setTextColorRes(R.attr.a1h);
        tuxTextView.setTuxFont(42);
        tuxTextView.setMaxLines(2);
        tuxTextView.setEllipsize(TextUtils.TruncateAt.END);
        tuxTextView.setGravity(1);
        tuxTextView.setBackground(cs());
        int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12));
        tuxTextView.setPadding(iLIZIZ, iLIZIZ, iLIZIZ, iLIZIZ);
        C786410Ut5.I7(new AkS67S0200000_30(this, tuxTextView, 2), tuxTextView);
        return tuxTextView;
    }

    @Override // com.ss.android.ugc.aweme.tako.botpage.cards.base.TakoAnswerBaseAssem, com.ss.android.ugc.aweme.tako.arch.protocol.TakoBaseAssem, X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: js, reason: merged with bridge method [inline-methods] */
    public final void up(C1857790yRd c1857790yRd) {
        List<TakoNovelChoiceSelect> list;
        int size;
        String str;
        String str2;
        TextView textView;
        TakoNovelChoiceSelect takoNovelChoiceSelect;
        String str3;
        Map<String, String> mapLJ;
        C13LC<C1863850ybP> c13lcT71;
        C1863850ybP c1863850ybP;
        String str4;
        String str5;
        Drawable drawableCs;
        super.up(c1857790yRd);
        TakoMixFeed takoMixFeed = c1857790yRd.LLILZLL;
        if (takoMixFeed != null) {
            list = takoMixFeed.selects;
        } else {
            list = null;
        }
        if (list != null) {
            size = list.size();
        } else {
            size = 0;
        }
        if (size != Vr().getChildCount()) {
            int childCount = size - Vr().getChildCount();
            if (childCount > 0) {
                int i = 0;
                do {
                    TuxTextView tuxTextViewGs = (TuxTextView) C19719612Di.LJJIIZI(this.LLLZLL);
                    if (tuxTextViewGs == null) {
                        tuxTextViewGs = gs(getContentView().getContext());
                    }
                    Vr().addView(tuxTextViewGs, Wr(Vr().getChildCount(), tuxTextViewGs));
                    i++;
                } while (i < childCount);
            } else {
                int i2 = -childCount;
                for (int i3 = 0; i3 < i2; i3++) {
                    View childAt = Vr().getChildAt(Vr().getChildCount() - 1);
                    if (childAt != null) {
                        C786410Ut5.LJJL(childAt, Vr());
                    } else {
                        childAt = null;
                    }
                    if (!(childAt instanceof TuxTextView) || childAt == null) {
                        break;
                    }
                    ((ArrayList) this.LLLZLL).add(childAt);
                }
            }
        }
        TextView textView2 = (TextView) this.LLLZIL.getValue();
        TakoMixFeed takoMixFeed2 = c1857790yRd.LLILZLL;
        if (takoMixFeed2 != null) {
            str = takoMixFeed2.text;
        } else {
            str = null;
        }
        textView2.setText(str);
        TakoMixFeed takoMixFeed3 = c1857790yRd.LLILZLL;
        if (takoMixFeed3 != null) {
            str2 = takoMixFeed3.text;
        } else {
            str2 = null;
        }
        if (str2 != null && str2.length() != 0) {
            C0DSB.LIZJ((View) this.LLLZIL.getValue());
            C1857750yRZ.LJIILL(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12)), Vr());
        } else {
            C0DSB.LIZIZ((View) this.LLLZIL.getValue());
            C1857750yRZ.LJIILL(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(20)), Vr());
        }
        LinearLayout linearLayoutVr = Vr();
        int childCount2 = linearLayoutVr.getChildCount();
        for (int i4 = 0; i4 < childCount2; i4++) {
            View childAt2 = linearLayoutVr.getChildAt(i4);
            if (childAt2 instanceof TuxTextView) {
                textView = (TextView) childAt2;
            } else {
                textView = null;
            }
            if (list != null) {
                takoNovelChoiceSelect = (TakoNovelChoiceSelect) C13LP.LJJJLZIJ(i4, list);
            } else {
                takoNovelChoiceSelect = null;
            }
            if (textView != null) {
                if (takoNovelChoiceSelect != null) {
                    str5 = takoNovelChoiceSelect.text;
                } else {
                    str5 = null;
                }
                textView.setText(str5);
                C1861360yXO c1861360yXO = C1861360yXO.LIZ;
                Message message = c1857790yRd.LLJJIJI.LLILLL;
                c1861360yXO.getClass();
                if (C1861360yXO.LIZJ(takoNovelChoiceSelect, message)) {
                    drawableCs = Yr();
                } else {
                    drawableCs = cs();
                }
                textView.setBackground(drawableCs);
                textView.setTag(takoNovelChoiceSelect);
            }
            if (takoNovelChoiceSelect != null) {
                str3 = takoNovelChoiceSelect.text;
            } else {
                str3 = null;
            }
            String str6 = "";
            if (str3 == null) {
                str3 = "";
            }
            C1862330yYx c1862330yYx = C1862330yYx.LIZ;
            String str7 = Yy1().uuid;
            ITakoContextAbility iTakoContextAbilityZp = zp();
            if (iTakoContextAbilityZp != null && (c13lcT71 = iTakoContextAbilityZp.T71()) != null && (c1863850ybP = (C1863850ybP) c13lcT71.LIZIZ()) != null && (str4 = c1863850ybP.LLILZIL) != null) {
                str6 = str4;
            }
            ITakoContextAbility iTakoContextAbilityZp2 = zp();
            if (iTakoContextAbilityZp2 == null || (mapLJ = iTakoContextAbilityZp2.getCommonParams()) == null) {
                mapLJ = C2097608Jq.LJ();
            }
            C20235014Fo c20235014FoLIZ = C597050NbL.LIZ();
            c1862330yYx.getClass();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(str7);
            sbLIZ.append('_');
            sbLIZ.append(str3);
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            Map<String, Set<String>> map = C1862330yYx.LJI;
            LinkedHashMap linkedHashMap = (LinkedHashMap) map;
            Set set = (Set) linkedHashMap.get(str6);
            if (set == null || !set.contains(strLIZIZ)) {
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                linkedHashMap2.putAll(mapLJ);
                linkedHashMap2.put("option_content", str3);
                c20235014FoLIZ.LIZ("tikbot_option_button_show", linkedHashMap2);
                Set set2 = (Set) linkedHashMap.get(str6);
                if (set2 != null) {
                    set2.add(strLIZIZ);
                } else {
                    map.put(str6, C093Y.LJ(strLIZIZ));
                }
            }
        }
        ns(c1857790yRd, false, null);
    }

    public final String ks(TakoNovelChoiceSelect takoNovelChoiceSelect) {
        Object obj;
        C1861360yXO c1861360yXO = C1861360yXO.LIZ;
        C724270Sb3 c724270Sb3 = this.LLJI;
        String str = null;
        if (c724270Sb3 != null) {
            obj = c724270Sb3.LL;
        } else {
            obj = null;
        }
        Message message = ((C1857790yRd) obj).LLJJIJI.LLILLL;
        c1861360yXO.getClass();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(message.uuid);
        if (takoNovelChoiceSelect != null) {
            str = takoNovelChoiceSelect.id;
        }
        sbLIZ.append(str);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // com.ss.android.ugc.aweme.tako.botpage.cards.base.TakoAnswerBaseAssem, com.ss.android.ugc.aweme.tako.arch.protocol.TakoBaseAssem, com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        TakoAnswerBaseAssem.iq(this, new C1728806pq(this), C1697810uHb.LJIIJJI(24, 0, 24, 0), null, 4);
        AssemViewModel.selectSubscribe$default(Xr(), new C2217381BqS() { // from class: X.08r3
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C2002607su) obj).LL;
            }
        }, C736820SvI.LIZLLL(), null, null, new AwS609S0100000_30(new AwS609S0100000_30(this, 99), DefaultHighLightCutConfig.DEFAULT_CUT_INTERVAL), 12, null);
        AssemVMLazy assemVMLazy = this.LLLZI;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLLZLZ;
        AssemViewModel.selectSubscribe$default(assemVMLazy.getValue(), null, new C2217381BqS() { // from class: X.14IZ
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C20241914If) obj).LLILZ;
            }
        }, new C2217381BqS() { // from class: X.14Ia
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C20241914If) obj).LLILLJJLI;
            }
        }, null, null, null, new AwS644S0100000_30(new AwS644S0100000_30(this, 25), 46), 57, null);
    }

    public static LinearLayout.LayoutParams Wr(int i, TuxTextView tuxTextView) {
        LinearLayout.LayoutParams layoutParams;
        int iLIZIZ;
        ViewGroup.LayoutParams layoutParams2 = tuxTextView.getLayoutParams();
        if (!(layoutParams2 instanceof LinearLayout.LayoutParams) || (layoutParams = (LinearLayout.LayoutParams) layoutParams2) == null) {
            layoutParams = new LinearLayout.LayoutParams(-1, -2);
        }
        if (i > 0) {
            iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8));
        } else {
            iLIZIZ = 0;
        }
        layoutParams.topMargin = iLIZIZ;
        return layoutParams;
    }

    public final void ns(C1857790yRd c1857790yRd, boolean z, Message message) {
        if (z) {
            Xr().LL = false;
        } else {
            if (message != null) {
                Xr().LL = Intrinsics.LJFF(c1857790yRd.LLILLJJLI, message.uuid);
                return;
            }
            AssemVMLazy assemVMLazy = this.LLLZ;
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLLZLZ;
            C736680Sv4.LJIJJ(assemVMLazy.getValue(), new AwS396S0200000_30(c1857790yRd, this, 23));
        }
    }
}
