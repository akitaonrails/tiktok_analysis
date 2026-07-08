package com.bytedance.android.livesdk.game.gamelist;

import X.AbstractC316870CbV;
import X.AnonymousClass0206;
import X.C01GW;
import X.C0230005s;
import X.C09YA;
import X.C1338270kvh;
import X.C15438062q;
import X.C1819630xS5;
import X.C2188811AlT;
import X.C238000vy;
import X.C316640Cb8;
import X.C317290CcB;
import X.C452501pT;
import X.C497740JfY;
import X.C627660Ojc;
import X.C751980Tee;
import X.C754700Tj2;
import X.InterfaceC0148002o;
import X.InterfaceC1364105Vn;
import com.bytedance.android.live.base.model.HashtagResponse;
import com.bytedance.android.livesdk.game.model.PartnershipGameEvent;
import com.bytedance.android.livesdk.model.GameTag;
import com.bytedance.android.livesdk.model.Hashtag;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.ext_power_list.AssemListViewModel;
import com.bytedance.mt.protector.impl.PatternProtector;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.jvm.internal.AwS27S0010000_12;
import kotlin.jvm.internal.AwS591S0100000_12;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes13.dex */
public final class GameTopicListViewModel extends AssemListViewModel<C1819630xS5, C0230005s, Boolean> {
    public boolean LLILLJJLI;
    public List<PartnershipGameEvent> LLILZIL;
    public GameTag LLJILJIL;
    public boolean LLJILJILJ;
    public HashtagResponse LLJILLL;
    public boolean LLJJ;
    public final C09YA LL = new C09YA(this, AnonymousClass0206.get$arr$(74));
    public LiveMode LLILLL = LiveMode.SCREEN_RECORD;
    public String LLILZ = "null";
    public String LLILZLL = "";
    public boolean LLIZ = true;
    public final HashSet<Long> LLIZLLLIL = new HashSet<>();
    public List<GameTag> LLJ = new ArrayList();
    public List<GameTag> LLJI = new ArrayList();
    public final List<GameTag> LLJIJIL = new ArrayList();
    public final C01GW LLJJI = C452501pT.LIZIZ(AnonymousClass0206.get$arr$(73));

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C1819630xS5(0);
    }

    public static List AQ2(List list) {
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList.add(new C0230005s((GameTag) it2.next()));
        }
        return arrayList;
    }

    @Override // com.bytedance.ext_power_list.AssemSingleListViewModel
    public final void newState(C627660Ojc<C0230005s> c627660Ojc) {
        setState(new AwS591S0100000_12(c627660Ojc, (C627660Ojc<C0230005s>) 567));
    }

    @Override // com.bytedance.ext_power_list.AssemListViewModel
    public final Object onRefresh(InterfaceC1364105Vn<? super AbstractC316870CbV<Boolean>> interfaceC1364105Vn) {
        return wQ2(interfaceC1364105Vn);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object vQ2(X.InterfaceC1364105Vn<? super X.AbstractC316870CbV<java.lang.Boolean>> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof X.C773620UWi
            if (r0 == 0) goto L20
            r4 = r6
            X.0UWi r4 = (X.C773620UWi) r4
            int r2 = r4.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L20
            int r2 = r2 - r1
            r4.LLILLL = r2
        L12:
            java.lang.Object r2 = r4.LL
            java.lang.Object r1 = X.C099R.LJFF()
            int r0 = r4.LLILLL
            r3 = 1
            if (r0 == 0) goto L2e
            if (r0 != r3) goto L26
            goto L48
        L20:
            X.0UWi r4 = new X.0UWi
            r4.<init>(r5, r6)
            goto L12
        L26:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L2e:
            X.C155000ia.LIZIZ(r2)
            X.09YA r0 = r5.LL     // Catch: java.lang.Exception -> L71
            java.lang.Object r0 = r0.getValue()     // Catch: java.lang.Exception -> L71
            X.0SvR r0 = (X.InterfaceC736910SvR) r0     // Catch: java.lang.Exception -> L71
            X.00hg r0 = r0.getOperator()     // Catch: java.lang.Exception -> L71
            X.00vx r0 = (X.InterfaceC237900vx) r0     // Catch: java.lang.Exception -> L71
            r4.LLILLL = r3     // Catch: java.lang.Exception -> L71
            java.lang.Object r2 = r0.l(r4)     // Catch: java.lang.Exception -> L71
            if (r2 != r1) goto L4b
            return r1
        L48:
            X.C155000ia.LIZIZ(r2)     // Catch: java.lang.Exception -> L71
        L4b:
            X.0Icr r2 = (X.C470590Icr) r2     // Catch: java.lang.Exception -> L71
            T r2 = r2.data     // Catch: java.lang.Exception -> L71
            com.bytedance.android.live.base.model.HashtagResponse r2 = (com.bytedance.android.live.base.model.HashtagResponse) r2     // Catch: java.lang.Exception -> L71
            com.bytedance.android.livesdk.model.Hashtag r0 = r2.gameHashTag     // Catch: java.lang.Exception -> L71
            X.C754700Tj2.LJ = r0     // Catch: java.lang.Exception -> L71
            if (r0 == 0) goto L60
            X.14i1<java.lang.String> r1 = X.InterfaceC772390URp.n     // Catch: java.lang.Exception -> L71
            java.lang.String r0 = X.C1516000pYM.LIZLLL(r0)     // Catch: java.lang.Exception -> L71
            r1.LJFF(r0)     // Catch: java.lang.Exception -> L71
        L60:
            kotlin.jvm.internal.AwS591S0100000_12 r1 = new kotlin.jvm.internal.AwS591S0100000_12     // Catch: java.lang.Exception -> L71
            r0 = 1152(0x480, float:1.614E-42)
            r1.<init>(r2, r0)     // Catch: java.lang.Exception -> L71
            r5.setState(r1)     // Catch: java.lang.Exception -> L71
            java.util.List<com.bytedance.android.livesdk.model.GameTag> r0 = r2.gameTagList     // Catch: java.lang.Exception -> L71
            X.0Cb8 r0 = r5.BQ2(r0, r3)     // Catch: java.lang.Exception -> L71
            return r0
        L71:
            r2 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r2)
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "failed to fetch topics! error: "
            r1.append(r0)
            java.lang.String r0 = r2.getMessage()
            r1.append(r0)
            java.lang.String r1 = X.C2188811AlT.LIZIZ(r1)
            java.lang.String r0 = "GameCategoryListDialogV2"
            X.C20441214yg.LJ(r0, r1)
            kotlin.jvm.internal.AwS27S0010000_12 r1 = new kotlin.jvm.internal.AwS27S0010000_12
            r0 = 4
            r1.<init>(r0)
            r5.setState(r1)
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            X.0Cb8 r0 = r5.BQ2(r0, r3)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.game.gamelist.GameTopicListViewModel.vQ2(X.05Vn):java.lang.Object");
    }

    public final Object wQ2(InterfaceC1364105Vn<? super AbstractC316870CbV<Boolean>> interfaceC1364105Vn) {
        if (Intrinsics.LJFF(this.LLILZLL, "")) {
            if (!this.LLJI.isEmpty()) {
                return BQ2(this.LLJI, false);
            }
            HashtagResponse hashtagResponse = this.LLJILLL;
            if (hashtagResponse != null) {
                return BQ2(hashtagResponse.gameTagList, true);
            }
            return vQ2(interfaceC1364105Vn);
        }
        return zQ2(interfaceC1364105Vn);
    }

    public final List<GameTag> xQ2(List<GameTag> list) {
        if (C238000vy.LIZ[this.LLILLL.ordinal()] == 1) {
            ArrayList arrayList = new ArrayList();
            for (Object obj : (ArrayList) list) {
                GameTag gameTag = (GameTag) obj;
                if (gameTag.isMobileGame() || gameTag.isNonGameOrOtherGameItem()) {
                    arrayList.add(obj);
                }
            }
            return new ArrayList(arrayList);
        }
        return list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object zQ2(X.InterfaceC1364105Vn<? super X.AbstractC316870CbV<java.lang.Boolean>> r8) {
        /*
            Method dump skipped, instruction units count: 217
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.game.gamelist.GameTopicListViewModel.zQ2(X.05Vn):java.lang.Object");
    }

    public final C316640Cb8 BQ2(List list, boolean z) {
        if (z) {
            GameTag gameTag = this.LLJILJIL;
            ArrayList arrayList = new ArrayList(list);
            GameTag gameTag2 = new GameTag(-1L, C497740JfY.LJIJI(2131842801), C497740JfY.LJIJI(2131842801), C497740JfY.LJIJI(2131842801), 0, null, null, null, null, 496, null);
            Hashtag hashtagLIZ = C754700Tj2.LIZ();
            if (hashtagLIZ == null) {
                hashtagLIZ = new Hashtag(0L, "", null, 0);
            }
            gameTag2.hashtagList = Collections.singletonList(hashtagLIZ);
            arrayList.add(gameTag2);
            Iterator it2 = ((ArrayList) this.LLJIJIL).iterator();
            while (it2.hasNext()) {
                ListProtector.add(arrayList, 0, it2.next());
                Map<String, Object> map = C1338270kvh.LIZ;
            }
            ArrayList arrayList2 = new ArrayList();
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                GameTag gameTag3 = (GameTag) ListProtector.get(arrayList, i);
                if (gameTag3 != null) {
                    if (gameTag != null && Intrinsics.LJFF(gameTag.id, gameTag3.id)) {
                        gameTag3.setSelected(true);
                        ListProtector.add(arrayList2, 0, gameTag3);
                    } else {
                        gameTag3.setSelected(false);
                        arrayList2.add(gameTag3);
                    }
                }
            }
            this.LLJI = xQ2(arrayList2);
        }
        List<GameTag> list2 = this.LLJI;
        this.LLJ = list2;
        C317290CcB c317290CcB = AbstractC316870CbV.LIZ;
        List listAQ2 = AQ2(list2);
        c317290CcB.getClass();
        return new C316640Cb8(listAQ2);
    }

    @Override // com.bytedance.ext_power_list.AssemListViewModel
    public final Object onLoadMore(Boolean bool, InterfaceC1364105Vn<? super AbstractC316870CbV<Boolean>> interfaceC1364105Vn) {
        bool.booleanValue();
        return wQ2(interfaceC1364105Vn);
    }

    public final C316640Cb8 yQ2(String str, List list) {
        boolean z;
        Map<String, Object> map = C1338270kvh.LIZ;
        ArrayList arrayList = new ArrayList();
        Iterator it2 = list.iterator();
        while (true) {
            z = true;
            if (!it2.hasNext()) {
                break;
            }
            Object next = it2.next();
            GameTag gameTag = (GameTag) next;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("(?i)");
            sbLIZ.append(Pattern.quote(str));
            Pattern patternCompile = PatternProtector.compile(C2188811AlT.LIZIZ(sbLIZ));
            String str2 = gameTag.showName;
            String str3 = "";
            if (str2 == null) {
                str2 = "";
            }
            Matcher matcher = patternCompile.matcher(str2);
            String str4 = gameTag.fullName;
            if (str4 == null) {
                str4 = "";
            }
            Matcher matcher2 = patternCompile.matcher(str4);
            String str5 = gameTag.shortName;
            if (str5 != null) {
                str3 = str5;
            }
            Matcher matcher3 = patternCompile.matcher(str3);
            if (matcher.find() || matcher2.find() || matcher3.find() || gameTag.isNonGameOrOtherGameItem()) {
                arrayList.add(next);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            GameTag gameTag2 = (GameTag) obj;
            if (C751980Tee.LIZIZ(arrayList)) {
                if (gameTag2.isNonGameOrOtherGameItem()) {
                    arrayList2.add(obj);
                }
            } else if (!(!a0.LJJJIL(str)) || !gameTag2.isNonGameOrOtherGameItem()) {
                arrayList2.add(obj);
            }
        }
        boolean zLIZIZ = C751980Tee.LIZIZ(arrayList2);
        if (zLIZIZ) {
            setState(new AwS27S0010000_12(true, 3));
        } else {
            setState(new AwS27S0010000_12(false, 3));
        }
        if (str.length() <= 0 || zLIZIZ) {
            z = false;
        }
        return CQ2(arrayList2, z, false);
    }

    public final C316640Cb8 CQ2(List list, boolean z, boolean z2) {
        this.LLJ = list;
        Iterator it2 = ((ArrayList) list).iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            GameTag gameTag = (GameTag) it2.next();
            GameTag gameTag2 = this.LLJILJIL;
            if (gameTag2 != null && Intrinsics.LJFF(gameTag2.id, gameTag.id)) {
                gameTag.setSelected(true);
                break;
            }
        }
        this.LLJILJILJ = z;
        this.LLJJ = z2;
        C317290CcB c317290CcB = AbstractC316870CbV.LIZ;
        List listAQ2 = AQ2(this.LLJ);
        c317290CcB.getClass();
        return new C316640Cb8(listAQ2);
    }
}
