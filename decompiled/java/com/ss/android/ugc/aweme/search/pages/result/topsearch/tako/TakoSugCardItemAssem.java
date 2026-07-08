package com.ss.android.ugc.aweme.search.pages.result.topsearch.tako;

import X.AbstractViewOnTouchListenerC446430Hez;
import X.C01GW;
import X.C0PCY;
import X.C0PM7;
import X.C0PRC;
import X.C0Q3E;
import X.C1101604So;
import X.C14TF;
import X.C20684915wt;
import X.C427690Gpr;
import X.C452501pT;
import X.C646370PWx;
import X.C665210Q7j;
import X.C786410Ut5;
import X.C830490Whz;
import X.InterfaceC1587906Jp;
import X.InterfaceC446420Hey;
import X.InterfaceC712990Rxx;
import Y.ATListenerS444S0100000_10;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.view.View;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.tako.TakoSugCardItemAssem;
import com.ss.android.ugc.aweme.search.source.neo.ISearchContextAbility;
import com.zhiliaoapp.musically.R;
import irm.AkS82S0100000_10;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AwS554S0100000_10;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class TakoSugCardItemAssem extends ReusedUISlotAssem<TakoSugCardItemAssem> implements InterfaceC712990Rxx<C665210Q7j> {
    public View LLJL;
    public TuxTextView LLJLIL;
    public C665210Q7j LLJLILLLLZIIL;
    public Map<String, String> LLJLL;
    public final C01GW LLJJLIIIJLLLLLLLZ = C452501pT.LIZIZ(new AwS554S0100000_10(this, 794));
    public final C830490Whz<Integer, Boolean> LLJLLIL = new C830490Whz<>();

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int Oo() {
        return R.layout.f3i;
    }

    @Override // X.InterfaceC712990Rxx
    public final void unBind() {
        this.LLJLILLLLZIIL = null;
    }

    @Override // X.InterfaceC712990Rxx
    public final void wr() {
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x00a3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.Map<java.lang.String, java.lang.String> op() {
        /*
            r10 = this;
            X.0Q7j r0 = r10.LLJLILLLLZIIL
            r9 = 0
            if (r0 == 0) goto La6
            java.lang.Boolean r1 = r0.LL
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            if (r0 == 0) goto La6
            java.lang.String r5 = "tako_ask_card"
        L11:
            X.0PWx r8 = r10.tp()
            X.0PRC r6 = r10.sp()
            X.0Q7z r1 = X.C1558520qew.LJIIL(r10)
            java.lang.Class<com.ss.android.ugc.aweme.search.pages.result.common.scrolling.firstscreen.assem.FirstScreenHelperAbility> r0 = com.ss.android.ugc.aweme.search.pages.result.common.scrolling.firstscreen.assem.FirstScreenHelperAbility.class
            r4 = 0
            X.01wD r1 = X.C1558520qew.LIZ(r1, r0, r4)
            com.ss.android.ugc.aweme.search.pages.result.common.scrolling.firstscreen.assem.FirstScreenHelperAbility r1 = (com.ss.android.ugc.aweme.search.pages.result.common.scrolling.firstscreen.assem.FirstScreenHelperAbility) r1
            if (r1 == 0) goto La3
            if (r8 == 0) goto La1
            java.lang.String r0 = r8.LLJ
        L2c:
            java.lang.String r7 = r1.Kz0(r0, r4)
            if (r7 == 0) goto La3
        L32:
            r0 = 7
            kotlin.Pair[] r3 = new kotlin.Pair[r0]
            if (r6 == 0) goto L9f
            java.lang.String r2 = r6.LLIZLLLIL
        L39:
            kotlin.Pair r1 = new kotlin.Pair
            java.lang.String r0 = "search_keyword"
            r1.<init>(r0, r2)
            r3[r9] = r1
            if (r8 == 0) goto L9d
            java.lang.Integer r0 = r8.LLJILJIL
        L46:
            java.lang.String r2 = java.lang.String.valueOf(r0)
            kotlin.Pair r1 = new kotlin.Pair
            java.lang.String r0 = "universal_rank"
            r1.<init>(r0, r2)
            r0 = 1
            r3[r0] = r1
            if (r8 == 0) goto L9b
            java.lang.String r2 = r8.LLJ
        L58:
            kotlin.Pair r1 = new kotlin.Pair
            java.lang.String r0 = "search_result_id"
            r1.<init>(r0, r2)
            r0 = 2
            r3[r0] = r1
            kotlin.Pair r1 = new kotlin.Pair
            java.lang.String r0 = "is_first_screen"
            r1.<init>(r0, r7)
            r0 = 3
            r3[r0] = r1
            if (r6 == 0) goto L99
            java.lang.String r2 = r6.LLILLL
        L70:
            kotlin.Pair r1 = new kotlin.Pair
            java.lang.String r0 = "search_id"
            r1.<init>(r0, r2)
            r0 = 4
            r3[r0] = r1
            kotlin.Pair r1 = new kotlin.Pair
            java.lang.String r0 = "token_type"
            r1.<init>(r0, r5)
            r0 = 5
            r3[r0] = r1
            X.0Q7j r0 = r10.LLJLILLLLZIIL
            if (r0 == 0) goto L8a
            java.lang.String r4 = r0.LLILLL
        L8a:
            kotlin.Pair r1 = new kotlin.Pair
            java.lang.String r0 = "interaction_name"
            r1.<init>(r0, r4)
            r0 = 6
            r3[r0] = r1
            java.util.Map r0 = X.C2097608Jq.LJIIJ(r3)
            return r0
        L99:
            r2 = r4
            goto L70
        L9b:
            r2 = r4
            goto L58
        L9d:
            r0 = r4
            goto L46
        L9f:
            r2 = r4
            goto L39
        La1:
            r0 = r4
            goto L2c
        La3:
            java.lang.String r7 = "0"
            goto L32
        La6:
            java.lang.String r5 = "tikbot_recommend_word"
            goto L11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.search.pages.result.topsearch.tako.TakoSugCardItemAssem.op():java.util.Map");
    }

    public final C0PRC sp() {
        C0PCY<C0PRC> c0pcyPh1;
        ISearchContextAbility iSearchContextAbility = (ISearchContextAbility) this.LLJJLIIIJLLLLLLLZ.getValue();
        if (iSearchContextAbility == null || (c0pcyPh1 = iSearchContextAbility.Ph1()) == null) {
            return null;
        }
        return (C0PRC) c0pcyPh1.LIZJ();
    }

    public final C646370PWx tp() {
        C0PCY<C646370PWx> c0pcyWO2;
        ISearchContextAbility iSearchContextAbility = (ISearchContextAbility) this.LLJJLIIIJLLLLLLLZ.getValue();
        if (iSearchContextAbility == null || (c0pcyWO2 = iSearchContextAbility.wO2()) == null) {
            return null;
        }
        return (C646370PWx) c0pcyWO2.LIZJ();
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        this.LLJLIL = (TuxTextView) view.findViewById(R.id.xcn);
        C427690Gpr.LJ(view, 0.0f);
        this.LLJL = view;
    }

    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final void up(C665210Q7j c665210Q7j) {
        boolean zLJFF;
        String str;
        String str2;
        Map<String, String> map;
        String str3;
        final Context context;
        View view;
        String str4;
        C665210Q7j c665210Q7j2 = c665210Q7j;
        this.LLJLILLLLZIIL = c665210Q7j2;
        TuxTextView tuxTextView = this.LLJLIL;
        Integer num = null;
        if (tuxTextView != null) {
            if (c665210Q7j2 != null) {
                str4 = c665210Q7j2.LLILLL;
            } else {
                str4 = null;
            }
            tuxTextView.setText(str4);
        }
        View view2 = this.LLJL;
        if (view2 != null) {
            C786410Ut5.I7(new AkS82S0100000_10(this, 5), view2);
        }
        if (((Number) C1101604So.LIZ.getValue()).intValue() == 1 && (context = getContext()) != null && (view = this.LLJL) != null) {
            AbstractViewOnTouchListenerC446430Hez abstractViewOnTouchListenerC446430Hez = new AbstractViewOnTouchListenerC446430Hez(context, this) { // from class: X.0Q7k
                public final /* synthetic */ Context LLJIJIL;
                public final /* synthetic */ TakoSugCardItemAssem LLJILJIL;

                @Override // X.AbstractViewOnTouchListenerC446430Hez
                public final void LIZ(boolean z) {
                    int iIntValue;
                    if (z) {
                        View view3 = this.LLJILJIL.LLJL;
                        if (view3 != null) {
                            Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a03, this.LLJIJIL);
                            if (numLIZJ != null) {
                                iIntValue = numLIZJ.intValue();
                            } else {
                                iIntValue = 0;
                            }
                            view3.setForeground(new ColorDrawable(iIntValue));
                            return;
                        }
                        return;
                    }
                    View view4 = this.LLJILJIL.LLJL;
                    if (view4 == null) {
                        return;
                    }
                    view4.setForeground(null);
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(context);
                    this.LLJIJIL = context;
                    this.LLJILJIL = this;
                }
            };
            abstractViewOnTouchListenerC446430Hez.LLIZ = new InterfaceC446420Hey() { // from class: X.0Q7i
                @Override // X.InterfaceC446420Hey
                public final void LIZ() {
                    String str5;
                    Map<String, String> map2;
                    TakoSugCardItemAssem takoSugCardItemAssem = this.LIZ;
                    View view3 = takoSugCardItemAssem.LLJL;
                    if (view3 != null) {
                        boolean z = C0Q9J.LIZ;
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        C665210Q7j c665210Q7j3 = takoSugCardItemAssem.LLJLILLLLZIIL;
                        if (c665210Q7j3 != null && (map2 = c665210Q7j3.LLILZ) != null && (!map2.isEmpty())) {
                            linkedHashMap.putAll(map2);
                        }
                        C0PRC c0prcSp = takoSugCardItemAssem.sp();
                        String str6 = c0prcSp != null ? c0prcSp.LLILLL : null;
                        if (str6 == null) {
                            str6 = "";
                        }
                        linkedHashMap.put("impr_id", str6);
                        C665210Q7j c665210Q7j4 = takoSugCardItemAssem.LLJLILLLLZIIL;
                        if (c665210Q7j4 == null || (str5 = c665210Q7j4.LLILLL) == null) {
                            str5 = "";
                        }
                        linkedHashMap.put("words_content", str5);
                        Map<String, String> map3 = takoSugCardItemAssem.LLJLL;
                        if (map3 != null) {
                            for (Map.Entry entry : ((LinkedHashMap) map3).entrySet()) {
                                Object key = entry.getKey();
                                Object value = entry.getValue();
                                if (value == null) {
                                    value = "";
                                }
                                linkedHashMap.put(key, value);
                            }
                        }
                        EnumC682590Qq1 enumC682590Qq1 = EnumC682590Qq1.TAKO_ASK_CARD;
                        String value2 = enumC682590Qq1.getValue();
                        C665210Q7j c665210Q7j5 = takoSugCardItemAssem.LLJLILLLLZIIL;
                        String str7 = c665210Q7j5 != null ? c665210Q7j5.LLILLL : null;
                        boolean z2 = C0Q9J.LIZ;
                        C684120QsU.LIZIZ(view3, new C683220Qr2(value2, null, str7, C684120QsU.LIZLLL(enumC682590Qq1.getValue()), linkedHashMap, null, null, null, false, false, false, false, null, null, null, 524258), false, null, null, 28);
                    }
                }
            };
            abstractViewOnTouchListenerC446430Hez.LLIZLLLIL = new ATListenerS444S0100000_10(this, 14);
            view.setOnTouchListener(abstractViewOnTouchListenerC446430Hez);
        }
        int i = c665210Q7j2.LLILLJJLI;
        Boolean bool = this.LLJLLIL.get(Integer.valueOf(i));
        Boolean bool2 = Boolean.TRUE;
        if (!Intrinsics.LJFF(bool, bool2)) {
            this.LLJLLIL.put(Integer.valueOf(i), bool2);
            C665210Q7j c665210Q7j3 = this.LLJLILLLLZIIL;
            if (c665210Q7j3 != null) {
                zLJFF = Intrinsics.LJFF(c665210Q7j3.LL, bool2);
            } else {
                zLJFF = false;
            }
            if (zLJFF) {
                Map<String, String> mapOp = op();
                C646370PWx c646370PWxTp = tp();
                if (c646370PWxTp != null) {
                    str3 = c646370PWxTp.LLILLL;
                } else {
                    str3 = null;
                }
                mapOp.put("enter_from", str3);
                mapOp.put("item_rank", String.valueOf(i));
                C646370PWx c646370PWxTp2 = tp();
                if (c646370PWxTp2 != null) {
                    num = c646370PWxTp2.LLJILJIL;
                }
                mapOp.put("rank", String.valueOf(num));
                this.LLJLL = mapOp;
                C20684915wt.LJFF("search_result_show", mapOp);
            }
            C0PRC c0prcSp = sp();
            Map<String, String> mapOp2 = op();
            mapOp2.put("enter_from", "general_search_tikbot");
            C665210Q7j c665210Q7j4 = this.LLJLILLLLZIIL;
            if (c665210Q7j4 != null && Intrinsics.LJFF(c665210Q7j4.LL, bool2)) {
                str = "click_ask_card";
            } else {
                str = "none";
            }
            mapOp2.put("enter_method", str);
            mapOp2.put("rank", String.valueOf(i));
            mapOp2.put("group_id", C14TF.LIZIZ.LJ());
            mapOp2.put("last_feed_group_id", ((C0PM7) C0Q3E.LJI().uF().LIZJ()).LLILZ);
            if (c0prcSp == null || (str2 = c0prcSp.LLILLL) == null) {
                str2 = "";
            }
            mapOp2.put("impr_id", str2);
            C665210Q7j c665210Q7j5 = this.LLJLILLLLZIIL;
            if (c665210Q7j5 != null && (map = c665210Q7j5.LLILZ) != null && (!map.isEmpty())) {
                mapOp2.putAll(map);
            }
            C20684915wt.LJFF("tikbot_quick_interaction_show", mapOp2);
        }
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ boolean ur(C665210Q7j c665210Q7j) {
        return true;
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ void vr(C665210Q7j c665210Q7j) {
    }

    @Override // X.InterfaceC712990Rxx
    public final void sr(InterfaceC1587906Jp interfaceC1587906Jp, List list) {
        up(interfaceC1587906Jp);
    }
}
