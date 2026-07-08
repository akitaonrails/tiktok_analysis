package com.ss.android.ugc.aweme.search.pages.result.topsearch.tako;

import X.C01GW;
import X.C07CQ;
import X.C0DXR;
import X.C0PCY;
import X.C0PM7;
import X.C0PRC;
import X.C0Q3E;
import X.C0Q4Y;
import X.C0QSF;
import X.C0R45;
import X.C1110704Wb;
import X.C123100dR;
import X.C1308910kAL;
import X.C1322090kVb;
import X.C14TF;
import X.C15438062q;
import X.C1558520qew;
import X.C1697810uHb;
import X.C1744700vVE;
import X.C1818407Ag;
import X.C1833207Fy;
import X.C1838007Hu;
import X.C20600815jK;
import X.C20684915wt;
import X.C418440Gaw;
import X.C427690Gpr;
import X.C452501pT;
import X.C473401sq;
import X.C643180PKq;
import X.C646370PWx;
import X.C648880Pck;
import X.C650240Pew;
import X.C665210Q7j;
import X.C786410Ut5;
import X.C814420VxA;
import X.InterfaceC1587906Jp;
import X.InterfaceC1891350zJl;
import X.InterfaceC712990Rxx;
import X.ViewOnAttachStateChangeListenerC20604515jv;
import Y.ACListenerS145S0100000_10;
import android.graphics.Rect;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tux.drawable.TuxIconDrawable;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.TakoSugWordCard;
import com.ss.android.ugc.aweme.search.source.neo.ISearchContextAbility;
import com.ss.android.ugc.aweme.tako.mob.ITakoMob;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.AwS28S1201000_10;
import kotlin.jvm.internal.AwS554S0100000_10;
import kotlin.jvm.internal.AwS624S0100000_10;

/* JADX INFO: loaded from: classes11.dex */
public final class SearchTakoSugCardAssem extends ReusedUISlotAssem<SearchTakoSugCardAssem> implements InterfaceC712990Rxx<C643180PKq> {
    public ViewOnAttachStateChangeListenerC20604515jv LLJLILLLLZIIL;
    public List<String> LLJLLIL;
    public C643180PKq LLJLLL;
    public final C01GW LLJJLIIIJLLLLLLLZ = C452501pT.LIZIZ(new AwS554S0100000_10(this, 792));
    public final C01GW LLJL = C452501pT.LIZIZ(new AwS554S0100000_10(this, 793));
    public final AtomicBoolean LLJLIL = new AtomicBoolean(false);
    public boolean LLJLL = true;

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int Oo() {
        return R.layout.f3h;
    }

    @Override // X.InterfaceC712990Rxx
    public final void unBind() {
    }

    @Override // X.InterfaceC712990Rxx
    public final void wr() {
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x009f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.Map<java.lang.String, java.lang.String> op() {
        /*
            r9 = this;
            boolean r0 = r9.LLJLL
            if (r0 != 0) goto La2
            java.lang.String r4 = "tikbot_recommend_word"
        L6:
            X.0PWx r7 = r9.tp()
            X.0PRC r6 = r9.sp()
            X.0Q7z r1 = X.C1558520qew.LJIIL(r9)
            java.lang.Class<com.ss.android.ugc.aweme.search.pages.result.common.scrolling.firstscreen.assem.FirstScreenHelperAbility> r0 = com.ss.android.ugc.aweme.search.pages.result.common.scrolling.firstscreen.assem.FirstScreenHelperAbility.class
            r5 = 0
            X.01wD r1 = X.C1558520qew.LIZ(r1, r0, r5)
            com.ss.android.ugc.aweme.search.pages.result.common.scrolling.firstscreen.assem.FirstScreenHelperAbility r1 = (com.ss.android.ugc.aweme.search.pages.result.common.scrolling.firstscreen.assem.FirstScreenHelperAbility) r1
            if (r1 == 0) goto L9f
            if (r7 == 0) goto L9d
            java.lang.String r0 = r7.LLJ
        L21:
            java.lang.String r8 = r1.Kz0(r0, r5)
            if (r8 == 0) goto L9f
        L27:
            r0 = 7
            kotlin.Pair[] r3 = new kotlin.Pair[r0]
            if (r6 == 0) goto L9b
            java.lang.String r2 = r6.LLIZLLLIL
        L2e:
            kotlin.Pair r1 = new kotlin.Pair
            java.lang.String r0 = "search_keyword"
            r1.<init>(r0, r2)
            r0 = 0
            r3[r0] = r1
            if (r7 == 0) goto L99
            java.lang.Integer r0 = r7.LLJILJIL
        L3c:
            java.lang.String r2 = java.lang.String.valueOf(r0)
            kotlin.Pair r1 = new kotlin.Pair
            java.lang.String r0 = "universal_rank"
            r1.<init>(r0, r2)
            r0 = 1
            r3[r0] = r1
            if (r7 == 0) goto L97
            java.lang.String r2 = r7.LLJ
        L4e:
            kotlin.Pair r1 = new kotlin.Pair
            java.lang.String r0 = "search_result_id"
            r1.<init>(r0, r2)
            r0 = 2
            r3[r0] = r1
            kotlin.Pair r1 = new kotlin.Pair
            java.lang.String r0 = "is_first_screen"
            r1.<init>(r0, r8)
            r0 = 3
            r3[r0] = r1
            if (r7 == 0) goto L95
            int r0 = r7.LLILZLL
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
        L6a:
            java.lang.String r2 = java.lang.String.valueOf(r0)
            kotlin.Pair r1 = new kotlin.Pair
            java.lang.String r0 = "rank"
            r1.<init>(r0, r2)
            r0 = 4
            r3[r0] = r1
            if (r6 == 0) goto L7c
            java.lang.String r5 = r6.LLILLL
        L7c:
            kotlin.Pair r1 = new kotlin.Pair
            java.lang.String r0 = "search_id"
            r1.<init>(r0, r5)
            r0 = 5
            r3[r0] = r1
            kotlin.Pair r1 = new kotlin.Pair
            java.lang.String r0 = "token_type"
            r1.<init>(r0, r4)
            r0 = 6
            r3[r0] = r1
            java.util.Map r0 = X.C2097608Jq.LJIIJ(r3)
            return r0
        L95:
            r0 = r5
            goto L6a
        L97:
            r2 = r5
            goto L4e
        L99:
            r0 = r5
            goto L3c
        L9b:
            r2 = r5
            goto L2e
        L9d:
            r0 = r5
            goto L21
        L9f:
            java.lang.String r8 = "0"
            goto L27
        La2:
            java.lang.String r4 = "tako_ask_card"
            goto L6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.search.pages.result.topsearch.tako.SearchTakoSugCardAssem.op():java.util.Map");
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

    public final void zp() {
        String str;
        Map<String, String> mapOp = op();
        C646370PWx c646370PWxTp = tp();
        mapOp.put("enter_from", c646370PWxTp != null ? c646370PWxTp.LLILLL : null);
        C20684915wt.LJFF("search_result_show", mapOp);
        if (!this.LLJLL) {
            Map<String, String> mapOp2 = op();
            mapOp2.put("enter_from", "general_search_tikbot");
            mapOp2.put("entrance_type", "recommend_words");
            C20684915wt.LJFF("tikbot_entrance_show", mapOp2);
            return;
        }
        C646370PWx c646370PWxTp2 = tp();
        C0PRC c0prcSp = sp();
        ITakoMob iTakoMobLJJJLL = C14TF.LIZIZ.LJJJLL();
        String str2 = c0prcSp != null ? c0prcSp.LLILLL : null;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (c0prcSp == null || (str = c0prcSp.LLIZLLLIL) == null) {
            str = "";
        }
        linkedHashMap.put("search_keyword", str);
        linkedHashMap.put("universal_rank", String.valueOf(c646370PWxTp2 != null ? c646370PWxTp2.LLJILJIL : null));
        iTakoMobLJJJLL.mobTikbotEntranceShow("general_search_tikbot", "ask_card", null, str2, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, linkedHashMap, false);
    }

    public final void Bp() {
        if (C07CQ.LIZ()) {
            ITakoMob iTakoMobLJJJLL = C14TF.LIZIZ.LJJJLL();
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            Map<String, String> mapOp = op();
            mapOp.put("enter_from", "general_search_tikbot");
            for (Map.Entry entry : ((LinkedHashMap) mapOp).entrySet()) {
                String str = (String) entry.getValue();
                if (str != null && C123100dR.LIZ(str)) {
                    linkedHashMap.put(entry.getKey(), str);
                }
            }
            iTakoMobLJJJLL.mobTikbotEntranceClick("general_search_tikbot", "recommend_words", null, null, null, null, null, null, null, null, null, null, null, linkedHashMap, null, null, null, null, null, null, null, null, null, null, null, null, null);
        }
    }

    public final void yp() {
        String str;
        if (C07CQ.LIZ()) {
            C646370PWx c646370PWxTp = tp();
            C0PRC c0prcSp = sp();
            ITakoMob iTakoMobLJJJLL = C14TF.LIZIZ.LJJJLL();
            String str2 = c0prcSp != null ? c0prcSp.LLILLL : null;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            if (c0prcSp == null || (str = c0prcSp.LLIZLLLIL) == null) {
                str = "";
            }
            linkedHashMap.put("search_keyword", str);
            linkedHashMap.put("universal_rank", String.valueOf(c646370PWxTp != null ? c646370PWxTp.LLJILJIL : null));
            iTakoMobLJJJLL.mobTikbotEntranceClick("general_search_tikbot", "ask_card", null, null, null, null, null, null, null, null, null, null, null, linkedHashMap, str2, null, null, null, null, null, null, null, null, null, null, null, null);
        }
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        boolean z;
        TuxIconDrawable tuxIconDrawableLIZ;
        Integer num;
        Integer numLIZ = C1308910kAL.LIZ(R.attr.g0d, view.getContext());
        if (numLIZ != null && numLIZ.intValue() == 0) {
            z = false;
        } else {
            z = true;
        }
        if (C650240Pew.LIZ()) {
            View viewFindViewById = view.findViewById(R.id.jhz);
            C648880Pck.LIZIZ(viewFindViewById);
            C650240Pew.LIZ.getClass();
            C1744700vVE.LJIIIZ(C650240Pew.LIZJ, viewFindViewById);
        }
        int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(20));
        C1322090kVb c1322090kVb = (C1322090kVb) view.findViewById(R.id.bh2);
        if (C0QSF.LIZ()) {
            tuxIconDrawableLIZ = C14TF.LIZIZ.LJJLIIIJ().LJI(Integer.valueOf(iLIZIZ), Integer.valueOf(iLIZIZ)).LIZ(view.getContext());
        } else {
            tuxIconDrawableLIZ = C14TF.LIZIZ.LJJLIIIJ().LIZJ(Integer.valueOf(iLIZIZ), Integer.valueOf(iLIZIZ), !z).LIZ(view.getContext());
        }
        c1322090kVb.setImageDrawable(tuxIconDrawableLIZ);
        TextView textView = (TextView) view.findViewById(R.id.zp7);
        if (textView != null) {
            int iLIZ = C1838007Hu.LIZ();
            if (iLIZ != 1) {
                if (iLIZ != 2) {
                    if (((Boolean) C1818407Ag.LIZ.getValue()).booleanValue()) {
                        int iIntValue = ((Number) C1818407Ag.LIZIZ.getValue()).intValue();
                        if (iIntValue != 1) {
                            if (iIntValue == 2) {
                                num = 2131822487;
                            }
                        } else {
                            num = 2131822488;
                        }
                    }
                } else {
                    num = 2131822520;
                }
            } else {
                num = 2131822488;
            }
            if (num != null) {
                textView.setText(textView.getResources().getString(num.intValue()));
            }
        }
        LinearLayout linearLayout = (LinearLayout) view.findViewById(R.id.wnd);
        C427690Gpr.LJ(linearLayout, 0.0f);
        C786410Ut5.R7(linearLayout, new ACListenerS145S0100000_10(this, 37));
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv = (ViewOnAttachStateChangeListenerC20604515jv) view.findViewById(R.id.wnc);
        this.LLJLILLLLZIIL = viewOnAttachStateChangeListenerC20604515jv;
        if (viewOnAttachStateChangeListenerC20604515jv != null) {
            viewOnAttachStateChangeListenerC20604515jv.setLayoutManager(new LinearLayoutManager(viewOnAttachStateChangeListenerC20604515jv.getContext(), 1, false));
            viewOnAttachStateChangeListenerC20604515jv.setAnimation(null);
            viewOnAttachStateChangeListenerC20604515jv.setItemAnimator(null);
            viewOnAttachStateChangeListenerC20604515jv.getState().LIZLLL = C0Q4Y.BUFFER;
            viewOnAttachStateChangeListenerC20604515jv.LJIILJJIL(TakoSugCardItemCell.class);
            viewOnAttachStateChangeListenerC20604515jv.addItemDecoration(new C0DXR() { // from class: X.0Q7G
                @Override // X.C0DXR
                public final void LIZIZ(Rect rect, View view2, RecyclerView recyclerView, C21673919s1 c21673919s1) {
                    rect.top = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8));
                }
            });
            viewOnAttachStateChangeListenerC20604515jv.setTag(R.id.rnd, C1558520qew.LJIIL(this));
        }
        if (C1833207Fy.LIZIZ()) {
            getContentView().addOnAttachStateChangeListener(new C0R45(this, 35));
        }
        if (C1110704Wb.LIZ()) {
            C473401sq.LIZIZ(getContentView(), new AwS554S0100000_10(this, 1098), 0.0f, new AwS554S0100000_10(this, 1099), false, null, new AwS624S0100000_10(this, 113), 18);
        }
    }

    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final void up(C643180PKq c643180PKq) {
        C20600815jK<InterfaceC1891350zJl> state;
        C643180PKq c643180PKq2 = c643180PKq;
        this.LLJLLL = c643180PKq2;
        TakoSugWordCard takoSugWordCard = c643180PKq2.LL;
        if (takoSugWordCard == null) {
            C786410Ut5.LJLLLLLL(8, getContentView());
            return;
        }
        List<String> list = takoSugWordCard.sugWords;
        ArrayList arrayList = new ArrayList();
        for (String str : list) {
            if (C123100dR.LIZ(str)) {
                arrayList.add(str);
            }
        }
        if (arrayList.isEmpty()) {
            C786410Ut5.LJLLLLLL(8, getContentView());
            return;
        }
        this.LLJLL = takoSugWordCard.isAskTakoCard();
        this.LLJLLIL = takoSugWordCard.sugForTako;
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv = this.LLJLILLLLZIIL;
        if (viewOnAttachStateChangeListenerC20604515jv != null) {
            C786410Ut5.LLF(0, viewOnAttachStateChangeListenerC20604515jv);
        }
        List<Map<String, String>> sugListMobParams = takoSugWordCard.getSugListMobParams();
        ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(arrayList, 10));
        Iterator it2 = arrayList.iterator();
        int i = 0;
        while (true) {
            Map map = null;
            if (it2.hasNext()) {
                Object next = it2.next();
                int i2 = i + 1;
                if (i >= 0) {
                    String str2 = (String) next;
                    Boolean boolValueOf = Boolean.valueOf(this.LLJLL);
                    if (sugListMobParams != null) {
                        map = (Map) ListProtector.get(sugListMobParams, i);
                    }
                    arrayList2.add(new C665210Q7j(boolValueOf, i, str2, map, new AwS28S1201000_10(this, (SearchTakoSugCardAssem) str2, (String) i, (int) sugListMobParams, (List<? extends Map<String, String>>) 1)));
                    i = i2;
                } else {
                    C1697810uHb.LJIJI();
                    throw null;
                }
            } else {
                ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv2 = this.LLJLILLLLZIIL;
                if (viewOnAttachStateChangeListenerC20604515jv2 != null && (state = viewOnAttachStateChangeListenerC20604515jv2.getState()) != null) {
                    state.LJIILL(arrayList2, null);
                }
                if (C1110704Wb.LIZ()) {
                    return;
                }
                zp();
                return;
            }
        }
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ boolean ur(C643180PKq c643180PKq) {
        return true;
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ void vr(C643180PKq c643180PKq) {
    }

    @Override // X.InterfaceC712990Rxx
    public final void sr(InterfaceC1587906Jp interfaceC1587906Jp, List list) {
        up(interfaceC1587906Jp);
    }

    public final void Ap(Integer num, String str, String str2, Map map, boolean z) {
        String str3;
        String str4;
        Map<String, String> mapOp = op();
        C646370PWx c646370PWxTp = tp();
        String str5 = null;
        if (c646370PWxTp != null) {
            str5 = c646370PWxTp.LLILLL;
        }
        mapOp.put("enter_from", str5);
        mapOp.put("button_type", str);
        C20684915wt.LJFF("search_result_click", mapOp);
        if (z) {
            C0PRC c0prcSp = sp();
            Map<String, String> mapOp2 = op();
            mapOp2.put("enter_from", "general_search_tikbot");
            if (this.LLJLL) {
                str3 = "click_ask_card";
            } else {
                str3 = "none";
            }
            mapOp2.put("enter_method", str3);
            mapOp2.put("interaction_name", str2);
            if (num != null) {
                mapOp2.put("rank", String.valueOf(num.intValue()));
            }
            mapOp2.put("group_id", C14TF.LIZIZ.LJ());
            mapOp2.put("last_feed_group_id", ((C0PM7) C0Q3E.LJI().uF().LIZJ()).LLILZ);
            if (c0prcSp == null || (str4 = c0prcSp.LLILLL) == null) {
                str4 = "";
            }
            mapOp2.put("impr_id", str4);
            if (map != null && (!map.isEmpty())) {
                mapOp2.putAll(map);
            }
            C20684915wt.LJFF("tikbot_quick_interaction_click", mapOp2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0150  */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void up(java.lang.String r79, java.lang.String r80, java.lang.String r81, java.lang.String r82, java.util.Map r83, boolean r84) {
        /*
            Method dump skipped, instruction units count: 688
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.search.pages.result.topsearch.tako.SearchTakoSugCardAssem.up(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.Map, boolean):void");
    }
}
