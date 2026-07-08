package com.ss.android.ugc.aweme.titlebar.viewmodel;

import X.C01GW;
import X.C06F6;
import X.C06LY;
import X.C0NYY;
import X.C0PEM;
import X.C0Y8T;
import X.C0YSQ;
import X.C0Z6T;
import X.C0ZF0;
import X.C0ZPJ;
import X.C0ZPK;
import X.C0ZPR;
import X.C0ZPT;
import X.C0ZPU;
import X.C0ZPY;
import X.C1229100i5c;
import X.C1383370m6R;
import X.C13BV;
import X.C1509305vX;
import X.C1515505wX;
import X.C15438062q;
import X.C1559260qg8;
import X.C15606069c;
import X.C1666706fp;
import X.C1727806pg;
import X.C2188811AlT;
import X.C23250099c;
import X.C418440Gaw;
import X.C419890GdH;
import X.C419910GdJ;
import X.C426750GoL;
import X.C452501pT;
import X.C461720I8s;
import X.C595660NXw;
import X.C595700NYa;
import X.C723600SZy;
import X.C786410Ut5;
import X.C814420VxA;
import X.C894700Z8a;
import X.C896480ZEw;
import X.C897370ZIh;
import X.C897520ZIw;
import X.EnumC896490ZEx;
import X.InterfaceC0148002o;
import X.InterfaceC1411705fn;
import X.InterfaceC876950Yaj;
import X.InterfaceC897380ZIi;
import android.content.Context;
import android.text.SpannableStringBuilder;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.tux.drawable.TuxIconDrawable;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.im.saas.host.api.im.IMHostApi;
import com.ss.android.ugc.aweme.im.streak.api.IStreakService;
import com.ss.android.ugc.aweme.im.streak.api.StreakData;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.titlebar.viewmodel.GroupTitleBarViewModel;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS187S0000000_2;
import kotlin.jvm.internal.AFwS201S0000000_14;
import kotlin.jvm.internal.AwS558S0100000_14;
import kotlin.jvm.internal.AwS593S0100000_14;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes15.dex */
public final class GroupTitleBarViewModel extends AssemViewModel<C0ZPR> {
    public static final C01GW<C0Z6T> LLJILLL = C1509305vX.LIZ(AFwS201S0000000_14.get$arr$(314));
    public String LLILZIL;
    public CharSequence LLILZLL;
    public CharSequence LLIZLLLIL;
    public final C1559260qg8 LL = new C1559260qg8(new C723600SZy(this, C15606069c.class, null), true);
    public final C01GW LLILLJJLI = C1509305vX.LIZ(new AwS558S0100000_14(this, 1161));
    public final C01GW LLILLL = C1509305vX.LIZ(new AwS558S0100000_14(this, 1159));
    public final C01GW LLILZ = C452501pT.LIZIZ(AFwS187S0000000_2.get$arr$(696));
    public C0ZPJ LLIZ = new C0ZPJ(0);
    public final C01GW LLJ = C452501pT.LIZIZ(new AwS558S0100000_14(this, 1160));
    public final C01GW LLJI = C1509305vX.LIZ(new AwS558S0100000_14(this, 1158));
    public final C0ZPY LLJIJIL = new C0NYY() { // from class: X.0ZPY
        @Override // X.C0NYY
        public final Object k3(Map<String, C595660NXw> map, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
            if (map.containsKey(this.LL.AQ2())) {
                this.LL.FQ2(map.get(this.LL.AQ2()));
                GroupTitleBarViewModel groupTitleBarViewModel = this.LL;
                groupTitleBarViewModel.setState(new AwS593S0100000_14(groupTitleBarViewModel, 161));
            }
            return Unit.LIZ;
        }
    };
    public final C01GW LLJILJIL = C452501pT.LIZIZ(AFwS187S0000000_2.get$arr$(697));
    public final GroupTitleBarViewModel$lifecycleObserver$1 LLJILJILJ = new GroupTitleBarViewModel$lifecycleObserver$1(this);

    public final String AQ2() {
        return (String) this.LLILLL.getValue();
    }

    public final CharSequence BQ2() {
        CharSequence charSequenceCQ2;
        String str = this.LLILZIL;
        if (str == null || str.length() == 0) {
            CharSequence charSequence = this.LLILZLL;
            if (charSequence == null || charSequence.length() == 0) {
                C0Y8T c0y8tZQ2 = zQ2();
                charSequenceCQ2 = CQ2(String.valueOf(c0y8tZQ2 != null ? c0y8tZQ2.getMemberCount() : 0));
            } else {
                charSequenceCQ2 = this.LLILZLL;
            }
        } else {
            charSequenceCQ2 = this.LLILZIL;
        }
        if (!Intrinsics.LJFF(String.valueOf(charSequenceCQ2), String.valueOf(this.LLIZLLLIL))) {
            this.LLIZLLLIL = charSequenceCQ2;
        }
        return this.LLIZLLLIL;
    }

    public final C0ZPU DQ2() {
        ArrayList arrayList = new ArrayList();
        if (vQ2()) {
            arrayList.add(C0ZPT.NAME_GROUP_GUIDE);
        }
        if (!vQ2()) {
            IStreakService.LJJIIZ.getClass();
            if (C06LY.LIZ().P(AQ2(), true)) {
                arrayList.add(C0ZPT.STREAK);
            }
        }
        if (C1229100i5c.LIZ.LJIIJJI(AQ2())) {
            arrayList.add(C0ZPT.PUBLIC_GROUP_TAG);
        }
        return arrayList.contains(C0ZPT.NAME_GROUP_GUIDE) ? new C0ZPU(yQ2().getString(2131831394), R.attr.a1k, arrayList) : new C0ZPU(C0ZPK.LIZ().LJIIJ(zQ2()), R.attr.a1h, arrayList);
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final void onPrepared() {
        runOnUIThread(new AwS593S0100000_14(this, 162));
        if (C1666706fp.LIZ() != 1 && C1666706fp.LIZ() != 2 && C1666706fp.LIZ() != 3 && C1666706fp.LIZ() != 4) {
            C23250099c.LIZLLL(getAssemVMScope(), C0PEM.LIZJ, null, new C1515505wX(this, null), 2);
        }
        IStreakService.LJJIIZ.getClass();
        C06LY.LIZ().x(new C06F6() { // from class: X.0ZPZ
            @Override // X.C06F6
            public final void r80(StreakData streakData, String str) {
                if (!Intrinsics.LJFF(str, this.LL.AQ2())) {
                    return;
                }
                GroupTitleBarViewModel groupTitleBarViewModel = this.LL;
                groupTitleBarViewModel.setState(new AwS593S0100000_14(groupTitleBarViewModel, 218));
            }
        });
        EQ2();
    }

    public final boolean vQ2() {
        if (C1727806pg.LIZ.LIZ("group_chat_show_guide_name_group", AQ2(), C461720I8s.LIZIZ(), false) && !C0ZPK.LIZ().LJII(AQ2()) && C0ZPK.LIZ().LJIIIZ(zQ2())) {
            InterfaceC1411705fn interfaceC1411705fn = (InterfaceC1411705fn) this.LLJILJIL.getValue();
            if (interfaceC1411705fn == null) {
                return true;
            }
            String strAQ2 = AQ2();
            IMHostApi iMHostApi = (IMHostApi) PluggableExtentionKt.pluggableSpiForReal(IMHostApi.class);
            if (!interfaceC1411705fn.LIZIZ(iMHostApi != null ? iMHostApi.LIZIZ() : System.currentTimeMillis(), strAQ2)) {
                return true;
            }
        }
        return false;
    }

    public final C897520ZIw xQ2() {
        return (C897520ZIw) this.LLJI.getValue();
    }

    public final Context yQ2() {
        return (Context) this.LLILZ.getValue();
    }

    public final C0Y8T zQ2() {
        return C0YSQ.LIZIZ(InterfaceC876950Yaj.LIZ).LIZ(AQ2());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [X.13BV] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.util.ArrayList] */
    public final void EQ2() {
        ?? arrayList;
        List<Long> memberIds;
        User userLIZLLL = C461720I8s.LIZLLL();
        String uid = userLIZLLL != null ? userLIZLLL.getUid() : null;
        String strAQ2 = AQ2();
        C0Y8T c0y8tZQ2 = zQ2();
        if (c0y8tZQ2 == null || (memberIds = c0y8tZQ2.getMemberIds()) == null) {
            arrayList = C13BV.INSTANCE;
        } else {
            ArrayList arrayList2 = new ArrayList();
            for (Long l : memberIds) {
                if (!Intrinsics.LJFF(l.toString(), uid)) {
                    arrayList2.add(l);
                }
            }
            arrayList = new ArrayList(C15438062q.LJIJJ(arrayList2, 10));
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                arrayList.add(((Long) it2.next()).toString());
            }
        }
        C595700NYa c595700NYa = new C595700NYa(strAQ2, arrayList);
        C897520ZIw c897520ZIwXQ2 = xQ2();
        if (c897520ZIwXQ2 != null) {
            c897520ZIwXQ2.LJIIIIZZ(Collections.singletonList(c595700NYa));
        }
        C897520ZIw c897520ZIwXQ22 = xQ2();
        if (c897520ZIwXQ22 != null) {
            c897520ZIwXQ22.LIZIZ(true, this.LLJIJIL);
        }
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        C0Y8T c0y8tZQ2 = zQ2();
        FQ2(wQ2(c0y8tZQ2 != null ? c0y8tZQ2.getMemberIds() : null));
        return new C0ZPR(DQ2(), BQ2(), this.LLIZ);
    }

    public final SpannableStringBuilder CQ2(String str) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(' ');
        sbLIZ.append(str);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(C2188811AlT.LIZIZ(sbLIZ));
        Context contextLJIILIIL = C1383370m6R.LJIILIIL();
        if (contextLJIILIIL != null) {
            C419910GdJ c419910GdJ = new C419910GdJ();
            c419910GdJ.LIZ = R.raw.icon_two_same_person;
            c419910GdJ.LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(14));
            c419910GdJ.LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(14));
            c419910GdJ.LJ = Integer.valueOf(R.attr.a1k);
            c419910GdJ.LIZLLL = Integer.valueOf(C1383370m6R.LJFF(R.attr.a1k));
            TuxIconDrawable tuxIconDrawableLIZ = c419910GdJ.LIZ(contextLJIILIIL);
            tuxIconDrawableLIZ.setBounds(0, 0, tuxIconDrawableLIZ.LJII, tuxIconDrawableLIZ.LJIIIIZZ);
            C419890GdH c419890GdH = new C419890GdH(tuxIconDrawableLIZ, 2);
            c419890GdH.LIZIZ(0, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(2)), C426750GoL.LIZLLL(yQ2()));
            C786410Ut5.q2(spannableStringBuilder, c419890GdH, 0, 1, 33);
        }
        return spannableStringBuilder;
    }

    public final void FQ2(C595660NXw c595660NXw) {
        C0ZPJ c0zpj;
        C0Y8T c0y8tZQ2;
        int memberCount;
        CharSequence charSequenceAppend;
        if (c595660NXw == null) {
            c0zpj = new C0ZPJ(0);
        } else if (C0ZPK.LIZ().LJIIIZ(zQ2()) && (c0y8tZQ2 = zQ2()) != null && c0y8tZQ2.getMemberCount() >= 2) {
            c0zpj = new C0ZPJ(C896480ZEw.LIZ(c595660NXw, yQ2(), 2), C896480ZEw.LIZJ(c595660NXw));
        } else {
            C897520ZIw c897520ZIwXQ2 = xQ2();
            if (c897520ZIwXQ2 != null) {
                c897520ZIwXQ2.LJI();
            }
            c0zpj = new C0ZPJ(0);
        }
        this.LLIZ = c0zpj;
        if (c0zpj.LIZIZ.LIZIZ != EnumC896490ZEx.NO_STATUS && C0ZPK.LIZ().LJIIIZ(zQ2())) {
            C0ZPJ c0zpj2 = this.LLIZ;
            C0Y8T c0y8tZQ22 = zQ2();
            if (c0y8tZQ22 != null) {
                memberCount = c0y8tZQ22.getMemberCount();
            } else {
                memberCount = 0;
            }
            SpannableStringBuilder spannableStringBuilderAppend = CQ2(String.valueOf(memberCount)).append(" · ");
            C894700Z8a c894700Z8a = c0zpj2.LIZIZ;
            int i = c894700Z8a.LJFF;
            int i2 = C0ZF0.LIZ[c894700Z8a.LIZIZ.ordinal()];
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 != 3) {
                        charSequenceAppend = "";
                    } else {
                        charSequenceAppend = spannableStringBuilderAppend.append((CharSequence) yQ2().getResources().getQuantityString(2131755234, i, Integer.valueOf(i)));
                    }
                } else if (c0zpj2.LIZIZ.LIZLLL.length() > 0) {
                    charSequenceAppend = spannableStringBuilderAppend.append((CharSequence) yQ2().getResources().getQuantityString(2131755232, c0zpj2.LIZIZ.LJ, 1, Integer.valueOf(c0zpj2.LIZIZ.LJ)));
                } else {
                    charSequenceAppend = spannableStringBuilderAppend.append((CharSequence) yQ2().getResources().getQuantityString(2131755231, i, Integer.valueOf(i)));
                }
            } else {
                charSequenceAppend = spannableStringBuilderAppend.append((CharSequence) yQ2().getResources().getQuantityString(2131755233, i, Integer.valueOf(i)));
            }
            this.LLILZLL = charSequenceAppend;
            return;
        }
        this.LLILZLL = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [X.13BV] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.util.ArrayList] */
    public final C595660NXw wQ2(List<Long> list) {
        ?? arrayList;
        String uid = null;
        if (!((Boolean) this.LLJ.getValue()).booleanValue()) {
            return null;
        }
        User userLIZLLL = C461720I8s.LIZLLL();
        if (userLIZLLL != null) {
            uid = userLIZLLL.getUid();
        }
        String strAQ2 = AQ2();
        if (list != null) {
            ArrayList arrayList2 = new ArrayList();
            for (Long l : list) {
                if (!Intrinsics.LJFF(String.valueOf(l.longValue()), uid)) {
                    arrayList2.add(l);
                }
            }
            arrayList = new ArrayList(C15438062q.LJIJJ(arrayList2, 10));
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                arrayList.add(String.valueOf(((Number) it2.next()).longValue()));
            }
        } else {
            arrayList = C13BV.INSTANCE;
        }
        C595700NYa c595700NYa = new C595700NYa(strAQ2, arrayList);
        InterfaceC897380ZIi.LIZIZ.getClass();
        return C897370ZIh.LIZ().LIZIZ(c595700NYa);
    }
}
