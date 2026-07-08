package com.ss.android.ugc.aweme.inbox.skylight.plat;

import X.AbstractC316870CbV;
import X.AbstractC641380PDs;
import X.C01GW;
import X.C08SN;
import X.C08SO;
import X.C098200Yq;
import X.C124300dd;
import X.C13BV;
import X.C15438062q;
import X.C1598140rgq;
import X.C1598150rgr;
import X.C1598340rhA;
import X.C1598660rhg;
import X.C1599020riG;
import X.C1599090riN;
import X.C1618440sDa;
import X.C1623706Xj;
import X.C1720106oR;
import X.C189200o6;
import X.C1DEV;
import X.C2188811AlT;
import X.C2189821An6;
import X.C2191201ApK;
import X.C2217381BqS;
import X.C23250099c;
import X.C291001Au;
import X.C295190Bhd;
import X.C316640Cb8;
import X.C317290CcB;
import X.C443120HZe;
import X.C452501pT;
import X.C557050Lt1;
import X.C596340NaC;
import X.C614770O9j;
import X.C626160OhC;
import X.C627660Ojc;
import X.C641350PDp;
import X.C641370PDr;
import X.C713200RyI;
import X.C729510SjV;
import X.C736820SvI;
import X.InterfaceC0148002o;
import X.InterfaceC1600130rk3;
import X.InterfaceC1891350zJl;
import X.InterfaceC712570RxH;
import X.ViewOnAttachStateChangeListenerC20604515jv;
import Y.ARunnableS30S0201000_24;
import Y.ARunnableS93S0200000_24;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.detail.vm.BaseDetailShareVM;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.inbox.skylight.plat.InboxSkylightListState;
import com.ss.android.ugc.aweme.inbox.widget.multi.InboxHorizontalTopListCombinePod;
import com.ss.android.ugc.aweme.story.ability.IStoryFeedUserDataAbility;
import com.ss.android.ugc.aweme.story.inbox.SkylightHighlightsItem;
import com.ss.android.ugc.aweme.story.inbox.StoryInboxItem;
import com.ss.android.ugc.aweme.story.inbox.ThoughtInboxItem;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS15S0211000_24;
import kotlin.jvm.internal.AwS1S0221000_24;
import kotlin.jvm.internal.AwS568S0100000_24;
import kotlin.jvm.internal.AwS603S0100000_24;
import kotlin.jvm.internal.AwS74S1000000_24;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes25.dex */
public final class SkylightListViewModel extends BaseDetailShareVM<InboxSkylightListState, InterfaceC1891350zJl, String> implements InterfaceC1600130rk3, InterfaceC712570RxH, IStoryFeedUserDataAbility<String> {
    public Aweme LLJ;
    public boolean LLJI;
    public String LLJIJIL;
    public AwS603S0100000_24 LLJILJIL;
    public Long LLJILJILJ;
    public InboxHorizontalTopListCombinePod LLJJ;
    public InboxHorizontalTopListCombinePod LLJJI;
    public boolean LLJJIII;
    public ViewOnAttachStateChangeListenerC20604515jv LLJJIJI;
    public boolean LLJJIJIIJIL;
    public long LLJJIJIL;
    public final C1DEV LLJJJJ;
    public int LLJJJJJIL;
    public String LLJJJJLIIL;
    public final Set<Integer> LLJJL;
    public boolean LLJJLIIIJLLLLLLLZ;
    public boolean LLJL;
    public AbstractC316870CbV<String> LLJLIL;
    public boolean LLJLILLLLZIIL;
    public final C1598340rhA LLILZIL = new C1598340rhA(this);
    public final C01GW LLILZLL = C452501pT.LIZIZ(new AwS568S0100000_24(this, 681));
    public final Set<String> LLIZ = new LinkedHashSet();
    public boolean LLIZLLLIL = true;
    public int LLJILLL = -1;
    public final C01GW LLJJJ = C452501pT.LIZIZ(new AwS568S0100000_24(this, 682));
    public final C557050Lt1 LLJJJIL = new C557050Lt1(false);

    @Override // X.InterfaceC712570RxH
    public final void Dl1() {
    }

    @Override // com.ss.android.ugc.aweme.story.ability.IStoryFeedUserDataAbility
    public final void W20() {
        this.LLJL = true;
    }

    @Override // X.InterfaceC1603360rpG
    public final int getPageType(int i) {
        return 40;
    }

    @Override // com.ss.android.ugc.aweme.story.ability.IStoryFeedUserDataAbility
    public final void pF2() {
        yA1(false);
        XG().clear();
    }

    @Override // com.ss.android.ugc.aweme.detail.vm.BaseDetailShareVM
    public final int vQ2(String str) {
        return -1;
    }

    @Override // com.ss.android.ugc.aweme.detail.vm.BaseDetailShareVM
    public final /* bridge */ /* synthetic */ String yQ2(int i, C2189821An6 c2189821An6, int i2, boolean z) {
        return "";
    }

    public final InboxHorizontalTopListCombinePod FQ2() {
        InboxHorizontalTopListCombinePod inboxHorizontalTopListCombinePod = this.LLJJI;
        if (inboxHorizontalTopListCombinePod != null) {
            return inboxHorizontalTopListCombinePod;
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean LJJIIJZLJL() {
        if (this.LLJJJIL.LIZIZ()) {
            return true;
        }
        return ((InboxSkylightListState) getState()).getListState().LL instanceof C1623706Xj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        C627660Ojc c627660Ojc = new C627660Ojc(null, null == true ? 1 : 0, null == true ? 1 : 0, null == true ? 1 : 0, 15);
        Boolean bool = Boolean.FALSE;
        return new InboxSkylightListState(c627660Ojc, new C291001Au(new C443120HZe(0, bool, bool)), null, null, null, new C291001Au(Boolean.FALSE), null);
    }

    public SkylightListViewModel() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("VM init ");
        sbLIZ.append(this);
        C2188811AlT.LIZIZ(sbLIZ);
        this.LLJJJJ = C2191201ApK.LIZ();
        this.LLJJJJLIIL = "";
        this.LLJJL = new LinkedHashSet();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean GQ2() {
        return (((InboxSkylightListState) getState()).getListState().LL instanceof C1623706Xj) || (((InboxSkylightListState) getState()).getListState().LLILLJJLI instanceof C1623706Xj);
    }

    @Override // com.ss.android.ugc.aweme.story.ability.IStoryFeedUserDataAbility
    public final boolean He1() {
        return C713200RyI.LIZIZ(this);
    }

    @Override // X.InterfaceC1600130rk3
    public final List<InterfaceC1891350zJl> LLILIL() {
        return listGetAll();
    }

    public final AbstractC316870CbV LQ2() {
        this.LLJIJIL = FQ2().passthroughPageToken();
        List<InterfaceC1891350zJl> coordinatorDisplayItems = FQ2().getCoordinatorDisplayItems();
        if (coordinatorDisplayItems == null) {
            coordinatorDisplayItems = C13BV.INSTANCE;
        }
        AwS603S0100000_24 awS603S0100000_24 = this.LLJILJIL;
        if (awS603S0100000_24 != null) {
            awS603S0100000_24.invoke(coordinatorDisplayItems);
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onRefreshViaCoordinator refreshData size ");
        sbLIZ.append(coordinatorDisplayItems.size());
        C2188811AlT.LIZIZ(sbLIZ);
        C1598660rhg.LIZ.getClass();
        C1598660rhg.LIZLLL.LIZ(coordinatorDisplayItems.size(), true);
        OQ2(coordinatorDisplayItems, true);
        if (!C1599090riN.LIZ()) {
            AbstractC316870CbV.LIZ.getClass();
            return new C316640Cb8(coordinatorDisplayItems);
        }
        String strPageToken = FQ2().pageToken();
        this.LLJJJJLIIL = strPageToken == null ? "" : strPageToken;
        if (strPageToken == null) {
            AbstractC316870CbV.LIZ.getClass();
            return new C316640Cb8(coordinatorDisplayItems);
        }
        C1599020riG c1599020riG = C1599020riG.LIZ;
        InboxHorizontalTopListCombinePod inboxHorizontalTopListCombinePodFQ2 = FQ2();
        c1599020riG.getClass();
        C1599020riG.LIZ(this, inboxHorizontalTopListCombinePodFQ2);
        return C317290CcB.LJ(AbstractC316870CbV.LIZ, null, strPageToken, coordinatorDisplayItems, 1);
    }

    @Override // com.ss.android.ugc.aweme.story.ability.IStoryFeedUserDataAbility
    public final boolean Qd2() {
        return C713200RyI.LIZJ(this);
    }

    @Override // com.ss.android.ugc.aweme.detail.vm.BaseDetailShareVM, X.C0PDP
    public final List<Aweme> getAwemeList() {
        Object c098200Yq;
        Object c098200Yq2;
        boolean z;
        if (!C295190Bhd.LIZJ()) {
            return super.getAwemeList();
        }
        try {
            c098200Yq = Boolean.valueOf(FQ2().getInsertStoryUid() != null);
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        Boolean bool = Boolean.FALSE;
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = bool;
        }
        boolean zBooleanValue = ((Boolean) c098200Yq).booleanValue();
        try {
            List<Aweme> listExtractStories = FQ2().extractStories();
            if (listExtractStories != null) {
                ArrayList arrayList = new ArrayList();
                for (Aweme aweme : listExtractStories) {
                    Aweme aweme2 = aweme;
                    if (C729510SjV.LJJII(aweme2) || !(zBooleanValue || C729510SjV.LJIILJJIL(AwemeExtKt.getAuthorUid(aweme2)))) {
                        z = false;
                    } else {
                        C1618440sDa.LIZIZ.LJJIIJ().LIZ(aweme2);
                        z = true;
                    }
                    if (z) {
                        arrayList.add(aweme);
                    }
                }
                c098200Yq2 = new ArrayList(arrayList);
            } else {
                c098200Yq2 = null;
            }
            C189200o6.m2constructorimpl(c098200Yq2);
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
            c098200Yq2 = new C098200Yq(th2);
            C189200o6.m2constructorimpl(c098200Yq2);
        }
        List<Aweme> arrayList2 = (List) (C189200o6.m7isFailureimpl(c098200Yq2) ? null : c098200Yq2);
        if (arrayList2 == null) {
            arrayList2 = new ArrayList<>();
        }
        return (!arrayList2.isEmpty() || zBooleanValue) ? arrayList2 : super.getAwemeList();
    }

    @Override // X.InterfaceC1600130rk3
    public final List<InterfaceC1891350zJl> i00() {
        List<ITEM> listListGetAll = listGetAll();
        if (listListGetAll == 0) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : listListGetAll) {
            InterfaceC1891350zJl interfaceC1891350zJl = (InterfaceC1891350zJl) obj;
            if ((interfaceC1891350zJl instanceof C1598140rgq) && ((C1598150rgr) interfaceC1891350zJl).LL.bizType == 7) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    @Override // com.ss.android.ugc.aweme.story.ability.IStoryFeedUserDataAbility
    public final boolean m82() {
        return C713200RyI.LIZ(this);
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel, androidx.lifecycle.ViewModel
    public final void onCleared() {
        super.onCleared();
        Iterator it2 = ((LinkedHashMap) this.LLILZIL.LJIIIIZZ(true)).entrySet().iterator();
        while (it2.hasNext()) {
            ((Map.Entry) it2.next()).getValue().getClass();
        }
        this.LLJJ = null;
        this.LLJIJIL = null;
    }

    @Override // com.ss.android.ugc.aweme.story.ability.IStoryFeedUserDataAbility
    public final boolean Hu1() {
        return this.LLJL;
    }

    @Override // com.ss.android.ugc.aweme.story.ability.IStoryFeedUserDataAbility
    public final int UW1() {
        return this.LLJJJJJIL;
    }

    @Override // X.InterfaceC1600130rk3
    public final boolean WM0() {
        return this.LLJI;
    }

    @Override // com.ss.android.ugc.aweme.story.ability.IStoryFeedUserDataAbility
    public final Set<Integer> XG() {
        return this.LLJJL;
    }

    @Override // com.ss.android.ugc.aweme.story.ability.IStoryFeedUserDataAbility
    public final AbstractC316870CbV<String> Yl1() {
        return this.LLJLIL;
    }

    @Override // com.ss.android.ugc.aweme.story.ability.IStoryFeedUserDataAbility
    public final /* bridge */ /* synthetic */ String bK2() {
        return this.LLJJJJLIIL;
    }

    @Override // com.ss.android.ugc.aweme.story.ability.IStoryFeedUserDataAbility
    public final boolean mB0() {
        return this.LLJJLIIIJLLLLLLLZ;
    }

    @Override // X.InterfaceC1600130rk3
    public final void C02(InterfaceC1891350zJl interfaceC1891350zJl) {
        listRemoveItem(interfaceC1891350zJl);
    }

    public final boolean DQ2(int i) {
        if (i == this.LLJILLL) {
            return true;
        }
        return false;
    }

    public final void HQ2(boolean z) {
        if (!C124300dd.LIZ()) {
            return;
        }
        if (z) {
            if (this.LLJJJIL.LIZ(false, true)) {
                C1720106oR.LJI("SkylightListViewModel", "mark is refreshing");
            }
        } else {
            if (!this.LLJJJIL.LIZ(true, false)) {
                return;
            }
            C1720106oR.LJI("SkylightListViewModel", "mark refresh finished");
        }
    }

    public final void MQ2(boolean z) {
        this.LLJLILLLLZIIL = z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0081 A[Catch: all -> 0x009a, TryCatch #1 {all -> 0x009a, blocks: (B:27:0x0065, B:29:0x0081, B:30:0x0089, B:35:0x0096, B:36:0x0099, B:16:0x003a, B:18:0x0041), top: B:41:0x001d }] */
    /* JADX WARN: Type inference failed for: r1v0, types: [int] */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v2, types: [X.01eN] */
    /* JADX WARN: Type inference failed for: r1v4, types: [X.01eN] */
    /* JADX WARN: Type inference failed for: r1v5, types: [X.01eN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object PQ2(X.InterfaceC1364105Vn<? super kotlin.Unit> r9) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof X.C641650PEt
            if (r0 == 0) goto L28
            r7 = r9
            X.0PEt r7 = (X.C641650PEt) r7
            int r2 = r7.LLILZIL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L28
            int r2 = r2 - r1
            r7.LLILZIL = r2
        L12:
            java.lang.Object r6 = r7.LLILLL
            java.lang.Object r5 = X.C099R.LJFF()
            int r1 = r7.LLILZIL
            r4 = 0
            r3 = 2
            r0 = 1
            if (r1 == 0) goto L3e
            if (r1 == r0) goto L36
            if (r1 != r3) goto L2e
            X.01eN r1 = r7.LLILLJJLI
            com.ss.android.ugc.aweme.inbox.skylight.plat.SkylightListViewModel r2 = r7.LL
            goto L60
        L28:
            X.0PEt r7 = new X.0PEt
            r7.<init>(r8, r9)
            goto L12
        L2e:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L36:
            X.01eN r1 = r7.LLILLJJLI
            com.ss.android.ugc.aweme.inbox.skylight.plat.SkylightListViewModel r2 = r7.LL
            X.C155000ia.LIZIZ(r6)     // Catch: java.lang.Throwable -> L9a
            goto L51
        L3e:
            X.C155000ia.LIZIZ(r6)
            X.1DEV r1 = r8.LLJJJJ     // Catch: java.lang.Throwable -> L9a
            r7.LL = r8     // Catch: java.lang.Throwable -> L9a
            r7.LLILLJJLI = r1     // Catch: java.lang.Throwable -> L9a
            r7.LLILZIL = r0     // Catch: java.lang.Throwable -> L9a
            java.lang.Object r0 = r1.LIZLLL(r4, r7)     // Catch: java.lang.Throwable -> L9a
            if (r0 != r5) goto L50
            return r5
        L50:
            r2 = r8
        L51:
            X.0rhA r0 = r2.LLILZIL     // Catch: java.lang.Throwable -> L8f
            r7.LL = r2     // Catch: java.lang.Throwable -> L8f
            r7.LLILLJJLI = r1     // Catch: java.lang.Throwable -> L8f
            r7.LLILZIL = r3     // Catch: java.lang.Throwable -> L8f
            java.lang.Object r6 = r0.LJIIJJI(r7)     // Catch: java.lang.Throwable -> L8f
            if (r6 != r5) goto L63
            return r5
        L60:
            X.C155000ia.LIZIZ(r6)     // Catch: java.lang.Throwable -> L94
        L63:
            java.util.List r6 = (java.util.List) r6     // Catch: java.lang.Throwable -> L94
            r1.LIZIZ(r4)     // Catch: java.lang.Throwable -> L9a
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()     // Catch: java.lang.Throwable -> L9a
            java.lang.String r0 = "onActiveDataUpdate, updatedData size: "
            r1.append(r0)     // Catch: java.lang.Throwable -> L9a
            int r0 = r6.size()     // Catch: java.lang.Throwable -> L9a
            r1.append(r0)     // Catch: java.lang.Throwable -> L9a
            X.C2188811AlT.LIZIZ(r1)     // Catch: java.lang.Throwable -> L9a
            boolean r0 = r6.isEmpty()     // Catch: java.lang.Throwable -> L9a
            if (r0 != 0) goto L89
            X.0PDo r0 = new X.0PDo     // Catch: java.lang.Throwable -> L9a
            r0.<init>(r2, r6)     // Catch: java.lang.Throwable -> L9a
            r2.withState(r0)     // Catch: java.lang.Throwable -> L9a
        L89:
            kotlin.Unit r0 = kotlin.Unit.LIZ     // Catch: java.lang.Throwable -> L9a
            X.C189200o6.m2constructorimpl(r0)     // Catch: java.lang.Throwable -> L9a
            goto La6
        L8f:
            r0 = move-exception
        L90:
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)     // Catch: java.lang.Throwable -> L94
            goto L96
        L94:
            r0 = move-exception
            goto L90
        L96:
            r1.LIZIZ(r4)     // Catch: java.lang.Throwable -> L9a
            throw r0     // Catch: java.lang.Throwable -> L9a
        L9a:
            r1 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r1)
            X.00Yq r0 = new X.00Yq
            r0.<init>(r1)
            X.C189200o6.m2constructorimpl(r0)
        La6:
            X.C189200o6.m5exceptionOrNullimpl(r0)
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.inbox.skylight.plat.SkylightListViewModel.PQ2(X.05Vn):java.lang.Object");
    }

    @Override // X.InterfaceC1600130rk3
    public final void QK1(boolean z) {
        if (!this.LLIZLLLIL) {
            return;
        }
        C614770O9j.LIZIZ.LIZJ().LJ(z);
        this.LLIZLLLIL = false;
    }

    @Override // com.ss.android.ugc.aweme.story.ability.IStoryFeedUserDataAbility
    public final void SO0(int i) {
        this.LLJJJJJIL = i;
    }

    @Override // X.InterfaceC1600130rk3
    public final void Zc2(List<? extends InterfaceC1891350zJl> list) {
        C23250099c.LIZLLL(getAssemVMScope(), null, null, new C641350PDp(this, list, null), 3);
    }

    @Override // com.ss.android.ugc.aweme.story.ability.IStoryFeedUserDataAbility
    public final void fm2(boolean z) {
        MQ2(z);
    }

    @Override // X.InterfaceC1600130rk3
    public final int gF1(String str) {
        StoryInboxItem storyInboxItem;
        Aweme storyCollection;
        List<ITEM> listListGetAll = listGetAll();
        int i = 0;
        if (listListGetAll != 0) {
            Iterator it2 = listListGetAll.iterator();
            while (true) {
                if (it2.hasNext()) {
                    InterfaceC1891350zJl interfaceC1891350zJl = (InterfaceC1891350zJl) it2.next();
                    String strLJIIIZ = null;
                    if ((interfaceC1891350zJl instanceof StoryInboxItem) && (storyInboxItem = (StoryInboxItem) interfaceC1891350zJl) != null && (storyCollection = storyInboxItem.getStoryCollection()) != null) {
                        strLJIIIZ = C729510SjV.LJIIIZ(storyCollection);
                    }
                    if (Intrinsics.LJFF(strLJIIIZ, str)) {
                        break;
                    }
                    i++;
                } else {
                    i = -1;
                    break;
                }
            }
        }
        return i + 1;
    }

    @Override // com.ss.android.ugc.aweme.story.ability.IStoryFeedUserDataAbility
    public final void h60(int i) {
        C713200RyI.LIZLLL(this, i);
    }

    @Override // X.InterfaceC1600130rk3
    public final int ht0(String str) {
        StoryInboxItem storyInboxItem;
        Aweme storyCollection;
        List<ITEM> listListGetAll = listGetAll();
        int i = 0;
        if (listListGetAll == 0) {
            return 0;
        }
        ArrayList<InterfaceC1891350zJl> arrayList = new ArrayList();
        for (Object obj : listListGetAll) {
            if (obj instanceof StoryInboxItem) {
                arrayList.add(obj);
            }
        }
        for (InterfaceC1891350zJl interfaceC1891350zJl : arrayList) {
            String strLJIIIZ = null;
            if ((interfaceC1891350zJl instanceof StoryInboxItem) && (storyInboxItem = (StoryInboxItem) interfaceC1891350zJl) != null && (storyCollection = storyInboxItem.getStoryCollection()) != null) {
                strLJIIIZ = C729510SjV.LJIIIZ(storyCollection);
            }
            if (!Intrinsics.LJFF(strLJIIIZ, str)) {
                i++;
            } else {
                return i;
            }
        }
        return -1;
    }

    @Override // X.InterfaceC1600130rk3
    public final void j20(InterfaceC1891350zJl interfaceC1891350zJl) {
        if (interfaceC1891350zJl instanceof StoryInboxItem) {
            this.LLJ = ((StoryInboxItem) interfaceC1891350zJl).getStoryCollection();
        }
    }

    @Override // com.bytedance.ext_power_list.AssemListViewModel
    public final void listRemoveItem(InterfaceC1891350zJl interfaceC1891350zJl) {
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv = this.LLJJIJI;
        if (viewOnAttachStateChangeListenerC20604515jv != null && viewOnAttachStateChangeListenerC20604515jv.isComputingLayout()) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("safeMutateListAlways: defer during layout, reason=");
            sbLIZ.append("listRemoveItem");
            sbLIZ.append(", vh=");
            sbLIZ.append(this.LLJILLL);
            C1720106oR.LJI("SkylightListViewModel", C2188811AlT.LIZIZ(sbLIZ));
            HandlerHook.viewPost(viewOnAttachStateChangeListenerC20604515jv, new ARunnableS93S0200000_24(this, interfaceC1891350zJl, 14));
            return;
        }
        super.listRemoveItem(interfaceC1891350zJl);
    }

    @Override // X.InterfaceC712570RxH
    public final void ll0(AbstractC641380PDs abstractC641380PDs) {
        setState(new AwS74S1000000_24(((C641370PDr) abstractC641380PDs).LIZ, 0));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.util.ArrayList] */
    @Override // com.bytedance.ext_power_list.AssemSingleListViewModel
    public final void newState(C627660Ojc<InterfaceC1891350zJl> c627660Ojc) {
        Object objLIZ;
        Object arrayList;
        final List<InterfaceC1891350zJl> list = c627660Ojc.LLILZ;
        if (list != null) {
            list.size();
        }
        if (list == null || (objLIZ = C08SO.LIZ(new C08SN<InterfaceC1891350zJl, String>() { // from class: X.0qx1
            @Override // X.C08SN
            public final Iterator<InterfaceC1891350zJl> LIZ() {
                return list.iterator();
            }

            @Override // X.C08SN
            public final String LIZIZ(InterfaceC1891350zJl interfaceC1891350zJl) {
                return interfaceC1891350zJl.getClass().getSimpleName();
            }
        })) == null) {
            objLIZ = -1;
        }
        Objects.toString(objLIZ);
        if (list != null) {
            ArrayList arrayList2 = new ArrayList();
            for (InterfaceC1891350zJl interfaceC1891350zJl : list) {
                if (interfaceC1891350zJl instanceof ThoughtInboxItem) {
                    arrayList2.add(interfaceC1891350zJl);
                }
            }
            arrayList = new ArrayList(C15438062q.LJIJJ(arrayList2, 10));
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                arrayList.add(((ThoughtInboxItem) it2.next()).getThoughtUser().getUid());
            }
        } else {
            arrayList = -1;
        }
        Objects.toString(arrayList);
        setState(new AwS603S0100000_24(c627660Ojc, (C627660Ojc<InterfaceC1891350zJl>) 121));
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00cd A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00eb A[Catch: all -> 0x0158, TryCatch #1 {all -> 0x0158, blocks: (B:39:0x00ce, B:40:0x00d1, B:42:0x00eb, B:43:0x00ee, B:45:0x0118, B:48:0x0124, B:51:0x012b, B:52:0x0136, B:53:0x0149), top: B:76:0x00ce }] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0118 A[Catch: all -> 0x0158, TryCatch #1 {all -> 0x0158, blocks: (B:39:0x00ce, B:40:0x00d1, B:42:0x00eb, B:43:0x00ee, B:45:0x0118, B:48:0x0124, B:51:0x012b, B:52:0x0136, B:53:0x0149), top: B:76:0x00ce }] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0149 A[Catch: all -> 0x0158, TryCatch #1 {all -> 0x0158, blocks: (B:39:0x00ce, B:40:0x00d1, B:42:0x00eb, B:43:0x00ee, B:45:0x0118, B:48:0x0124, B:51:0x012b, B:52:0x0136, B:53:0x0149), top: B:76:0x00ce }] */
    @Override // com.bytedance.ext_power_list.AssemListViewModel
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object onRefresh(X.InterfaceC1364105Vn<? super X.AbstractC316870CbV<java.lang.String>> r12) {
        /*
            Method dump skipped, instruction units count: 477
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.inbox.skylight.plat.SkylightListViewModel.onRefresh(X.05Vn):java.lang.Object");
    }

    @Override // X.InterfaceC1600130rk3
    public final void rN0(InterfaceC1891350zJl interfaceC1891350zJl) {
        withState(new AwS603S0100000_24(this, 119));
        setState(new AwS603S0100000_24(interfaceC1891350zJl, 120));
    }

    @Override // com.ss.android.ugc.aweme.detail.vm.BaseDetailShareVM
    public final Aweme xQ2(InterfaceC1891350zJl interfaceC1891350zJl) {
        if (interfaceC1891350zJl instanceof StoryInboxItem) {
            StoryInboxItem storyInboxItem = (StoryInboxItem) interfaceC1891350zJl;
            if (C729510SjV.LJJII(storyInboxItem.getStoryCollection())) {
                return null;
            }
            Aweme storyCollection = storyInboxItem.getStoryCollection();
            C1618440sDa.LIZIZ.LJJIIJ().LIZ(storyCollection);
            return storyCollection;
        }
        if (!(interfaceC1891350zJl instanceof SkylightHighlightsItem)) {
            return null;
        }
        Aweme highlightCollection = ((SkylightHighlightsItem) interfaceC1891350zJl).getHighlightCollection();
        C1618440sDa.LIZIZ.LJJIIJ().LIZ(highlightCollection);
        return highlightCollection;
    }

    @Override // com.ss.android.ugc.aweme.story.ability.IStoryFeedUserDataAbility
    public final void yA1(boolean z) {
        this.LLJJLIIIJLLLLLLLZ = z;
    }

    @Override // com.bytedance.ext_power_list.AssemListViewModel, com.bytedance.ext_power_list.AssemSingleListViewModel
    public final /* bridge */ /* synthetic */ void listRemoveItem(Object obj) {
        listRemoveItem((InterfaceC1891350zJl) obj);
    }

    public static void OQ2(List list, boolean z) {
        if (!C596340NaC.LIZJ()) {
            C596340NaC.LIZLLL("SkylightListViewModel#storeSkylightPOData", false);
        } else {
            if (list.isEmpty()) {
                return;
            }
            C596340NaC.LIZLLL("SkylightListViewModel#storeSkylightPOData", true);
            C614770O9j.LIZIZ.LJII().LIZIZ(3, z, list);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int EQ2(int i, Aweme aweme) {
        String strLJIIIZ;
        String aid;
        if (a0.LJJIIZI(aweme.getAid(), "highlight", false)) {
            strLJIIIZ = aweme.getAid();
        } else {
            strLJIIIZ = C729510SjV.LJIIIZ(aweme);
        }
        ITEM itemListGetAt = listGetAt(i);
        if (itemListGetAt instanceof StoryInboxItem) {
            aid = C729510SjV.LJIIIZ(((StoryInboxItem) itemListGetAt).getStoryCollection());
        } else if (itemListGetAt instanceof SkylightHighlightsItem) {
            aid = ((SkylightHighlightsItem) itemListGetAt).getHighlightCollection().getAid();
        } else {
            aid = null;
        }
        if (Intrinsics.LJFF(strLJIIIZ, aid)) {
            return i;
        }
        List<ITEM> listListGetAll = listGetAll();
        if (listListGetAll != 0) {
            int i2 = 0;
            for (ITEM item : listListGetAll) {
                if (((item instanceof StoryInboxItem) && Intrinsics.LJFF(C729510SjV.LJIIIZ(((StoryInboxItem) item).getStoryCollection()), strLJIIIZ)) || ((item instanceof SkylightHighlightsItem) && Intrinsics.LJFF(((SkylightHighlightsItem) item).getHighlightCollection().getAid(), strLJIIIZ))) {
                    return i2;
                }
                i2++;
            }
            return -1;
        }
        return -1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0027  */
    @Override // com.bytedance.ext_power_list.AssemListViewModel
    /* JADX INFO: renamed from: IQ2, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object onLoadMore(java.lang.String r16, X.InterfaceC1364105Vn<? super X.AbstractC316870CbV<java.lang.String>> r17) {
        /*
            Method dump skipped, instruction units count: 463
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.inbox.skylight.plat.SkylightListViewModel.onLoadMore(java.lang.String, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x009c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00be A[Catch: Exception -> 0x010a, TryCatch #1 {Exception -> 0x010a, blocks: (B:36:0x00a2, B:38:0x00be, B:43:0x00c8, B:44:0x00f4, B:46:0x00f8, B:48:0x00fe, B:17:0x0041, B:51:0x0106, B:52:0x0109, B:28:0x007f, B:34:0x009d, B:35:0x00a0, B:31:0x008e), top: B:57:0x0020, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00c8 A[Catch: Exception -> 0x010a, TryCatch #1 {Exception -> 0x010a, blocks: (B:36:0x00a2, B:38:0x00be, B:43:0x00c8, B:44:0x00f4, B:46:0x00f8, B:48:0x00fe, B:17:0x0041, B:51:0x0106, B:52:0x0109, B:28:0x007f, B:34:0x009d, B:35:0x00a0, B:31:0x008e), top: B:57:0x0020, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00f4 A[Catch: Exception -> 0x010a, TryCatch #1 {Exception -> 0x010a, blocks: (B:36:0x00a2, B:38:0x00be, B:43:0x00c8, B:44:0x00f4, B:46:0x00f8, B:48:0x00fe, B:17:0x0041, B:51:0x0106, B:52:0x0109, B:28:0x007f, B:34:0x009d, B:35:0x00a0, B:31:0x008e), top: B:57:0x0020, inners: #0 }] */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v3, types: [X.01eN] */
    /* JADX WARN: Type inference failed for: r1v7, types: [X.01eN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object JQ2(java.util.List<? extends X.EnumC1598330rh9> r11, X.InterfaceC1364105Vn<? super kotlin.Unit> r12) {
        /*
            Method dump skipped, instruction units count: 294
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.inbox.skylight.plat.SkylightListViewModel.JQ2(java.util.List, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0066  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object KQ2(X.EnumC1598330rh9 r7, X.InterfaceC1364105Vn<? super kotlin.Unit> r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof X.C641640PEs
            if (r0 == 0) goto L66
            r4 = r8
            X.0PEs r4 = (X.C641640PEs) r4
            int r2 = r4.LLILZ
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L66
            int r2 = r2 - r1
            r4.LLILZ = r2
        L12:
            java.lang.Object r1 = r4.LLILLJJLI
            java.lang.Object r3 = X.C099R.LJFF()
            int r0 = r4.LLILZ
            r5 = 2
            r2 = 1
            if (r0 == 0) goto L28
            if (r0 == r2) goto L38
            if (r0 != r5) goto L6c
            X.C155000ia.LIZIZ(r1)
        L25:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L28:
            X.C155000ia.LIZIZ(r1)
            boolean r0 = X.C1206204nk.LIZ()
            if (r0 == 0) goto L3d
            X.0rh9 r0 = X.EnumC1598330rh9.ACTIVE_STATUS
            if (r7 != r0) goto L3d
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L38:
            X.0rh9 r7 = r4.LL
            X.C155000ia.LIZIZ(r1)
        L3d:
            boolean r0 = r6.GQ2()
            if (r0 == 0) goto L50
            r4.LL = r7
            r4.LLILZ = r2
            r0 = 50
            java.lang.Object r0 = X.AnonymousClass0958.LIZIZ(r0, r4)
            if (r0 != r3) goto L3d
            return r3
        L50:
            int[] r1 = X.C1598320rh8.LIZ
            int r0 = r7.ordinal()
            r0 = r1[r0]
            if (r0 != r2) goto L74
            r0 = 0
            r4.LL = r0
            r4.LLILZ = r5
            java.lang.Object r0 = r6.PQ2(r4)
            if (r0 != r3) goto L25
            return r3
        L66:
            X.0PEs r4 = new X.0PEs
            r4.<init>(r6, r8)
            goto L12
        L6c:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L74:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.inbox.skylight.plat.SkylightListViewModel.KQ2(X.0rh9, X.05Vn):java.lang.Object");
    }

    @Override // com.bytedance.ext_power_list.AssemListViewModel
    public final void listAddItemAt(int i, InterfaceC1891350zJl interfaceC1891350zJl) {
        Boolean boolValueOf;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MultiViewModel vh: ");
        sbLIZ.append(this.LLJILLL);
        sbLIZ.append(" vm listAddItemAt: isComputing = ");
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv = this.LLJJIJI;
        if (viewOnAttachStateChangeListenerC20604515jv != null) {
            boolValueOf = Boolean.valueOf(viewOnAttachStateChangeListenerC20604515jv.isComputingLayout());
        } else {
            boolValueOf = null;
        }
        sbLIZ.append(boolValueOf);
        C1720106oR.LJI("SkylightListViewModel", C2188811AlT.LIZIZ(sbLIZ));
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv2 = this.LLJJIJI;
        if (viewOnAttachStateChangeListenerC20604515jv2 != null && viewOnAttachStateChangeListenerC20604515jv2.isComputingLayout()) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("safeMutateListAlways: defer during layout, reason=");
            sbLIZ2.append("listAddItemAt");
            sbLIZ2.append(", vh=");
            sbLIZ2.append(this.LLJILLL);
            C1720106oR.LJI("SkylightListViewModel", C2188811AlT.LIZIZ(sbLIZ2));
            HandlerHook.viewPost(viewOnAttachStateChangeListenerC20604515jv2, new ARunnableS30S0201000_24(i, this, interfaceC1891350zJl, 5));
            return;
        }
        super.listAddItemAt(i, interfaceC1891350zJl);
    }

    @Override // com.bytedance.ext_power_list.AssemListViewModel, com.bytedance.ext_power_list.AssemSingleListViewModel
    public final /* bridge */ /* synthetic */ void listAddItemAt(int i, Object obj) {
        listAddItemAt(i, (InterfaceC1891350zJl) obj);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x007f A[Catch: all -> 0x00d3, TryCatch #0 {all -> 0x00d3, blocks: (B:26:0x0076, B:27:0x0079, B:29:0x007f, B:30:0x0082, B:32:0x0088, B:37:0x0092, B:39:0x00c3, B:38:0x00c0), top: B:50:0x0076 }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0092 A[Catch: all -> 0x00d3, TryCatch #0 {all -> 0x00d3, blocks: (B:26:0x0076, B:27:0x0079, B:29:0x007f, B:30:0x0082, B:32:0x0088, B:37:0x0092, B:39:0x00c3, B:38:0x00c0), top: B:50:0x0076 }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00c0 A[Catch: all -> 0x00d3, TryCatch #0 {all -> 0x00d3, blocks: (B:26:0x0076, B:27:0x0079, B:29:0x007f, B:30:0x0082, B:32:0x0088, B:37:0x0092, B:39:0x00c3, B:38:0x00c0), top: B:50:0x0076 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object NQ2(com.ss.android.ugc.aweme.inbox.widget.multi.InboxHorizontalTopListCombinePod r9, kotlin.jvm.functions.Function0<kotlin.Unit> r10, X.InterfaceC1364105Vn<? super kotlin.Unit> r11) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 224
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.inbox.skylight.plat.SkylightListViewModel.NQ2(com.ss.android.ugc.aweme.inbox.widget.multi.InboxHorizontalTopListCombinePod, kotlin.jvm.functions.Function0, X.05Vn):java.lang.Object");
    }

    @Override // X.InterfaceC712570RxH
    public final void h21(Aweme aweme, int i, boolean z) {
        setStateImmediate(new AwS15S0211000_24(aweme, i, z, this, 0));
    }

    @Override // X.InterfaceC712570RxH
    public final void sA1(int i, Aweme aweme, boolean z, boolean z2) {
        setState(new AwS1S0221000_24(aweme, i, z, z2, this, 1));
    }

    @Override // X.InterfaceC712570RxH
    public final void zc1(LifecycleOwner lifecycleOwner, Function1<? super C626160OhC, Unit> function1, Function0<Unit> function0, Function1<? super Throwable, Unit> function12) {
        asyncSubscribe(new C2217381BqS() { // from class: X.0rhJ
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((InboxSkylightListState) obj).getLoadMoreState();
            }
        }, lifecycleOwner, C736820SvI.LIZLLL(), function12, function0, function1);
    }
}
