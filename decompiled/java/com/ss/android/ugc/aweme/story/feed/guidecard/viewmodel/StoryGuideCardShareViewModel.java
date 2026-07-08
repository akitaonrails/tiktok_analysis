package com.ss.android.ugc.aweme.story.feed.guidecard.viewmodel;

import X.AbstractC316870CbV;
import X.C0KBN;
import X.C13BV;
import X.C1618440sDa;
import X.C1697810uHb;
import X.C20603715jn;
import X.C2188811AlT;
import X.C2189821An6;
import X.C2214201BlK;
import X.C2296808zG;
import X.C281310B0v;
import X.C326330Cql;
import X.C627660Ojc;
import X.C712440Rx4;
import X.C712450Rx5;
import X.C713190RyH;
import X.C713200RyI;
import X.C728750SiH;
import X.C729510SjV;
import X.InterfaceC0148002o;
import X.InterfaceC1209780haS;
import X.InterfaceC1364105Vn;
import X.InterfaceC1891350zJl;
import X.InterfaceC497601wk;
import X.ViewOnAttachStateChangeListenerC20604515jv;
import android.app.Activity;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.detail.vm.BaseDetailShareVM;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.story.ability.IStoryFeedUserDataAbility;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.AwS583S0100000_4;
import kotlin.jvm.internal.AwS625S0100000_11;

/* JADX INFO: loaded from: classes12.dex */
public final class StoryGuideCardShareViewModel extends BaseDetailShareVM<C326330Cql, InterfaceC1891350zJl, String> implements IStoryFeedUserDataAbility<String> {
    public static final /* synthetic */ int LLJILJILJ = 0;
    public volatile Aweme LLILZIL;
    public volatile Aweme LLILZLL;
    public int LLIZ;
    public boolean LLIZLLLIL;
    public String LLJ = "";
    public final Set<Integer> LLJI = new LinkedHashSet();
    public boolean LLJIJIL;
    public AbstractC316870CbV<String> LLJILJIL;

    @Override // com.ss.android.ugc.aweme.story.ability.IStoryFeedUserDataAbility
    public final void W20() {
        this.LLJIJIL = true;
    }

    @Override // com.ss.android.ugc.aweme.detail.vm.BaseDetailShareVM, X.InterfaceC1603360rpG
    public final boolean cannotLoadLatest() {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.story.ability.IStoryFeedUserDataAbility
    public final void fm2(boolean z) {
    }

    @Override // X.InterfaceC1603360rpG
    public final int getPageType(int i) {
        return 40;
    }

    @Override // com.ss.android.ugc.aweme.detail.vm.BaseDetailShareVM, X.InterfaceC1603360rpG
    public final boolean isDataEmpty() {
        return false;
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

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C326330Cql(0);
    }

    @Override // com.ss.android.ugc.aweme.story.ability.IStoryFeedUserDataAbility
    public final boolean He1() {
        return C713200RyI.LIZIZ(this);
    }

    @Override // com.ss.android.ugc.aweme.story.ability.IStoryFeedUserDataAbility
    public final boolean Qd2() {
        return C713200RyI.LIZJ(this);
    }

    @Override // com.ss.android.ugc.aweme.detail.vm.BaseDetailShareVM, X.C0PDP
    public final List<Aweme> getAwemeList() {
        List listLJIILJJIL;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("getAwemeList(), curInsertAweme = ");
        Aweme aweme = this.LLILZIL;
        sbLIZ.append(aweme != null ? aweme.getAid() : null);
        C2188811AlT.LIZIZ(sbLIZ);
        Aweme aweme2 = this.LLILZIL;
        if (aweme2 == null) {
            return super.getAwemeList();
        }
        String strLIZ = C712440Rx4.LIZ(aweme2);
        if (strLIZ == null) {
            return super.getAwemeList();
        }
        synchronized (C728750SiH.LIZ) {
            try {
                C713190RyH c713190RyH = (C713190RyH) C728750SiH.LIZ().get(strLIZ);
                if (c713190RyH != null && c713190RyH.LIZ == 2) {
                    List<C712450Rx5> list = c713190RyH.LIZLLL;
                    ArrayList arrayList = new ArrayList();
                    Iterator<C712450Rx5> it2 = list.iterator();
                    while (it2.hasNext()) {
                        Aweme awemeXQ2 = xQ2(it2.next());
                        if (awemeXQ2 != null) {
                            arrayList.add(awemeXQ2);
                        }
                    }
                    ArrayList arrayList2 = new ArrayList(arrayList);
                    listLJIILJJIL = arrayList2.isEmpty() ^ true ? arrayList2 : null;
                    if (listLJIILJJIL == null) {
                        Aweme aweme3 = this.LLILZLL;
                        listLJIILJJIL = aweme3 != null ? C1697810uHb.LJIILJJIL(aweme3) : new ArrayList();
                    }
                } else {
                    Aweme aweme4 = this.LLILZLL;
                    listLJIILJJIL = aweme4 != null ? C1697810uHb.LJIILJJIL(aweme4) : new ArrayList();
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return listLJIILJJIL;
    }

    @Override // com.bytedance.ext_power_list.AssemListViewModel, com.bytedance.ext_power_list.AssemSingleListViewModel
    public final List<InterfaceC1891350zJl> listGetAll() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("listGetAll(), curInsertAweme = ");
        Aweme aweme = this.LLILZIL;
        sbLIZ.append(aweme != null ? aweme.getAid() : null);
        C2188811AlT.LIZIZ(sbLIZ);
        return zQ2((C326330Cql) this.vmDispatcher.getState());
    }

    @Override // com.ss.android.ugc.aweme.story.ability.IStoryFeedUserDataAbility
    public final boolean m82() {
        return C713200RyI.LIZ(this);
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel, androidx.lifecycle.ViewModel
    public final void onCleared() {
        super.onCleared();
        C728750SiH c728750SiH = C728750SiH.LIZ;
        c728750SiH.getClass();
        synchronized (c728750SiH) {
            try {
                C728750SiH.LIZ().clear();
                ((HashMap) C728750SiH.LJI.getValue()).clear();
                ((LinkedHashMap) C728750SiH.LJII.getValue()).clear();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        ((LinkedHashMap) C728750SiH.LJ.getValue()).clear();
        ((LinkedHashMap) C728750SiH.LJFF.getValue()).clear();
        C2296808zG.LIZJ((InterfaceC497601wk) C728750SiH.LIZIZ.getValue(), null);
        this.LLILZIL = null;
        this.LLILZLL = null;
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final void onPrepared() {
        super.onPrepared();
        Activity activityLJFF = C2214201BlK.LJFF();
        if (activityLJFF != null) {
            ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv = new ViewOnAttachStateChangeListenerC20604515jv(activityLJFF, null);
            C20603715jn c20603715jn = new C20603715jn();
            c20603715jn.LIZJ = false;
            viewOnAttachStateChangeListenerC20604515jv.setListConfig(c20603715jn);
            setListState(viewOnAttachStateChangeListenerC20604515jv.getState());
            viewOnAttachStateChangeListenerC20604515jv.LJIIL(getConfig());
        }
    }

    @Override // com.ss.android.ugc.aweme.story.ability.IStoryFeedUserDataAbility
    public final boolean Hu1() {
        return this.LLJIJIL;
    }

    @Override // com.ss.android.ugc.aweme.story.ability.IStoryFeedUserDataAbility
    public final int UW1() {
        return this.LLIZ;
    }

    @Override // com.ss.android.ugc.aweme.story.ability.IStoryFeedUserDataAbility
    public final Set<Integer> XG() {
        return this.LLJI;
    }

    @Override // com.ss.android.ugc.aweme.story.ability.IStoryFeedUserDataAbility
    public final AbstractC316870CbV<String> Yl1() {
        return this.LLJILJIL;
    }

    @Override // com.ss.android.ugc.aweme.story.ability.IStoryFeedUserDataAbility
    public final /* bridge */ /* synthetic */ String bK2() {
        return this.LLJ;
    }

    @Override // com.ss.android.ugc.aweme.story.ability.IStoryFeedUserDataAbility
    public final boolean mB0() {
        return this.LLIZLLLIL;
    }

    @Override // com.ss.android.ugc.aweme.detail.vm.BaseDetailShareVM
    /* JADX INFO: renamed from: BQ2, reason: merged with bridge method [inline-methods] */
    public final List<InterfaceC1891350zJl> zQ2(C326330Cql c326330Cql) {
        String aid;
        boolean z;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("getItemList(), curInsertAweme = ");
        Aweme aweme = this.LLILZIL;
        List listSingletonList = null;
        if (aweme != null) {
            aid = aweme.getAid();
        } else {
            aid = null;
        }
        sbLIZ.append(aid);
        C2188811AlT.LIZIZ(sbLIZ);
        Aweme aweme2 = this.LLILZIL;
        if (aweme2 == null) {
            List<InterfaceC1891350zJl> listItemState = c326330Cql.getListItemState();
            if (listItemState == null) {
                return C13BV.INSTANCE;
            }
            return listItemState;
        }
        String strLIZ = C712440Rx4.LIZ(aweme2);
        if (strLIZ == null) {
            List<InterfaceC1891350zJl> listItemState2 = c326330Cql.getListItemState();
            if (listItemState2 == null) {
                return C13BV.INSTANCE;
            }
            return listItemState2;
        }
        synchronized (C728750SiH.LIZ) {
            try {
                C713190RyH c713190RyH = (C713190RyH) C728750SiH.LIZ().get(strLIZ);
                if (c713190RyH == null || c713190RyH.LIZ != 2) {
                    z = false;
                } else {
                    z = true;
                }
                if (z) {
                    ArrayList arrayList = new ArrayList(c713190RyH.LIZLLL);
                    if (!arrayList.isEmpty()) {
                        listSingletonList = arrayList;
                    }
                    if (listSingletonList == null) {
                        Aweme aweme3 = this.LLILZLL;
                        if (aweme3 != null) {
                            listSingletonList = Collections.singletonList(new C712450Rx5(aweme3));
                        } else {
                            listSingletonList = C13BV.INSTANCE;
                        }
                    }
                } else {
                    Aweme aweme4 = this.LLILZLL;
                    if (aweme4 == null || (listSingletonList = Collections.singletonList(new C712450Rx5(aweme4))) == null) {
                        listSingletonList = C13BV.INSTANCE;
                    }
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return listSingletonList;
    }

    @Override // com.ss.android.ugc.aweme.story.ability.IStoryFeedUserDataAbility
    public final void SO0(int i) {
        this.LLIZ = i;
    }

    @Override // com.ss.android.ugc.aweme.detail.vm.BaseDetailShareVM, X.InterfaceC1603360rpG
    public final void bindView(InterfaceC1209780haS interfaceC1209780haS) {
        if (!C281310B0v.LIZ()) {
            super.bindView(interfaceC1209780haS);
        }
    }

    @Override // com.ss.android.ugc.aweme.story.ability.IStoryFeedUserDataAbility
    public final void h60(int i) {
        C713200RyI.LIZLLL(this, i);
    }

    @Override // com.bytedance.ext_power_list.AssemSingleListViewModel
    public final void newState(C627660Ojc<InterfaceC1891350zJl> c627660Ojc) {
        setState(new AwS583S0100000_4(c627660Ojc, (C627660Ojc<C0KBN>) 130));
    }

    @Override // com.bytedance.ext_power_list.AssemListViewModel
    public final Object onRefresh(InterfaceC1364105Vn<? super AbstractC316870CbV<String>> interfaceC1364105Vn) {
        return C728750SiH.LIZ.LJ(this.LLILZIL, true, "", new AwS625S0100000_11(this, 53), interfaceC1364105Vn);
    }

    @Override // com.ss.android.ugc.aweme.detail.vm.BaseDetailShareVM
    public final Aweme xQ2(InterfaceC1891350zJl interfaceC1891350zJl) {
        if (!(interfaceC1891350zJl instanceof C712450Rx5)) {
            return null;
        }
        C712450Rx5 c712450Rx5 = (C712450Rx5) interfaceC1891350zJl;
        if (C729510SjV.LJJII(c712450Rx5.LL)) {
            return null;
        }
        Aweme aweme = c712450Rx5.LL;
        C1618440sDa.LIZIZ.LJJIIJ().LIZ(aweme);
        return aweme;
    }

    @Override // com.ss.android.ugc.aweme.story.ability.IStoryFeedUserDataAbility
    public final void yA1(boolean z) {
        this.LLIZLLLIL = z;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x004c  */
    @Override // com.bytedance.ext_power_list.AssemListViewModel
    /* JADX INFO: renamed from: CQ2, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object onLoadMore(java.lang.String r11, X.InterfaceC1364105Vn<? super X.AbstractC316870CbV<java.lang.String>> r12) {
        /*
            r10 = this;
            boolean r0 = r12 instanceof X.C713180RyG
            if (r0 == 0) goto L4c
            r9 = r12
            X.0RyG r9 = (X.C713180RyG) r9
            int r2 = r9.LLILZ
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L4c
            int r2 = r2 - r1
            r9.LLILZ = r2
        L12:
            java.lang.Object r4 = r9.LLILLJJLI
            java.lang.Object r3 = X.C099R.LJFF()
            int r0 = r9.LLILZ
            r2 = 1
            if (r0 == 0) goto L2d
            if (r0 != r2) goto L52
            X.013C r1 = r9.LL
            X.C155000ia.LIZIZ(r4)
        L24:
            X.0CbV r4 = (X.AbstractC316870CbV) r4
            boolean r0 = r1.element
            if (r0 == 0) goto L2c
            r10.LLJILJIL = r4
        L2c:
            return r4
        L2d:
            X.C155000ia.LIZIZ(r4)
            X.013C r1 = new X.013C
            r1.<init>()
            X.0SiH r4 = X.C728750SiH.LIZ
            com.ss.android.ugc.aweme.feed.model.Aweme r5 = r10.LLILZIL
            kotlin.jvm.internal.AwS153S1200000_11 r8 = new kotlin.jvm.internal.AwS153S1200000_11
            r0 = 1
            r7 = r11
            r8.<init>(r10, r1, r7, r0)
            r9.LL = r1
            r9.LLILZ = r2
            r6 = 0
            java.lang.Object r4 = r4.LJ(r5, r6, r7, r8, r9)
            if (r4 != r3) goto L24
            return r3
        L4c:
            X.0RyG r9 = new X.0RyG
            r9.<init>(r10, r12)
            goto L12
        L52:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.story.feed.guidecard.viewmodel.StoryGuideCardShareViewModel.onLoadMore(java.lang.String, X.05Vn):java.lang.Object");
    }

    @Override // com.ss.android.ugc.aweme.detail.vm.BaseDetailShareVM
    public final String yQ2(int i, C2189821An6 c2189821An6, int i2, boolean z) {
        String strLIZ = C712440Rx4.LIZ(this.LLILZIL);
        if (strLIZ == null) {
            return "";
        }
        synchronized (C728750SiH.LIZ) {
            try {
                C713190RyH c713190RyH = (C713190RyH) C728750SiH.LIZ().get(strLIZ);
                if (c713190RyH == null) {
                    return "";
                }
                return c713190RyH.LIZIZ;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }
}
