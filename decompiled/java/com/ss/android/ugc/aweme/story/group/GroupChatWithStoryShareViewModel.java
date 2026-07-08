package com.ss.android.ugc.aweme.story.group;

import X.AbstractC316870CbV;
import X.AnonymousClass0957;
import X.C09QK;
import X.C0O05;
import X.C104500aR;
import X.C13LP;
import X.C1605650rsx;
import X.C1618440sDa;
import X.C1697810uHb;
import X.C20603715jn;
import X.C2188561Al4;
import X.C2188811AlT;
import X.C2189821An6;
import X.C2214201BlK;
import X.C2296808zG;
import X.C326280Cqg;
import X.C476250Ilz;
import X.C627660Ojc;
import X.C713200RyI;
import X.C728820SiO;
import X.C729510SjV;
import X.C729600Sje;
import X.C729670Sjl;
import X.C729690Sjn;
import X.C729700Sjo;
import X.EnumC1615506Uf;
import X.InterfaceC0148002o;
import X.InterfaceC1364105Vn;
import X.InterfaceC1891350zJl;
import X.InterfaceC2135708Yh;
import X.InterfaceC2188711AlJ;
import X.InterfaceC360001aY;
import X.ViewOnAttachStateChangeListenerC20604515jv;
import android.app.Activity;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.detail.vm.BaseDetailShareVM;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.story.ability.IStoryFeedUserDataAbility;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.AwS590S0100000_11;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class GroupChatWithStoryShareViewModel extends BaseDetailShareVM<C326280Cqg, InterfaceC1891350zJl, Long> implements IStoryFeedUserDataAbility<Long>, InterfaceC2135708Yh {
    public String LLILZLL;
    public String LLIZ;
    public int LLIZLLLIL;
    public boolean LLJ;
    public long LLJI;
    public boolean LLJIJIL;
    public AbstractC316870CbV<Long> LLJILJILJ;
    public final C729600Sje LLILZIL = new C729600Sje();
    public final Set<Integer> LLJILJIL = new LinkedHashSet();

    @Override // com.ss.android.ugc.aweme.story.ability.IStoryFeedUserDataAbility
    public final void W20() {
        this.LLJIJIL = true;
    }

    @Override // com.ss.android.ugc.aweme.detail.vm.BaseDetailShareVM, X.InterfaceC1603360rpG
    public final boolean cannotLoadMore() {
        return true;
    }

    @Override // com.ss.android.ugc.aweme.story.ability.IStoryFeedUserDataAbility
    public final void fm2(boolean z) {
    }

    @Override // com.ss.android.ugc.aweme.detail.vm.BaseDetailShareVM, X.C0PDP
    public final List<Aweme> getAwemeList() {
        return C1697810uHb.LJIILJJIL(C1618440sDa.LIZIZ.LJJLIIIJLJLI().LJIIIIZZ());
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

    @Override // com.ss.android.ugc.aweme.story.ability.IStoryFeedUserDataAbility
    public final Long bK2() {
        return Long.valueOf(this.LLJI);
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C326280Cqg(0);
    }

    @Override // com.ss.android.ugc.aweme.story.ability.IStoryFeedUserDataAbility
    public final boolean He1() {
        return C713200RyI.LIZIZ(this);
    }

    @Override // com.ss.android.ugc.aweme.story.ability.IStoryFeedUserDataAbility
    public final boolean Qd2() {
        return C713200RyI.LIZJ(this);
    }

    @Override // com.bytedance.ext_power_list.AssemListViewModel, com.bytedance.ext_power_list.AssemSingleListViewModel
    public final List<InterfaceC1891350zJl> listGetAll() {
        C728820SiO c728820SiO;
        String str;
        List<InterfaceC1891350zJl> listListGetAll = super.listGetAll();
        InterfaceC1891350zJl interfaceC1891350zJl = listListGetAll != null ? (InterfaceC1891350zJl) C13LP.LJJJLL(listListGetAll) : null;
        if (!(interfaceC1891350zJl instanceof C728820SiO) || (c728820SiO = (C728820SiO) interfaceC1891350zJl) == null || (str = c728820SiO.LLILLJJLI) == null || Intrinsics.LJFF(str, this.LLILZLL)) {
            return listListGetAll;
        }
        listClear();
        return null;
    }

    @Override // com.ss.android.ugc.aweme.story.ability.IStoryFeedUserDataAbility
    public final boolean m82() {
        return C713200RyI.LIZ(this);
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel, androidx.lifecycle.ViewModel
    public final void onCleared() {
        super.onCleared();
        this.LLILZLL = null;
        this.LLIZ = null;
        C729600Sje c729600Sje = this.LLILZIL;
        C2296808zG.LIZJ(c729600Sje.LJ, null);
        synchronized (c729600Sje.LIZIZ) {
            try {
                ((ArrayList) c729600Sje.LIZIZ).clear();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        synchronized (c729600Sje.LIZ) {
            try {
                ((LinkedHashMap) c729600Sje.LIZ).clear();
            } catch (Throwable th2) {
                TryCatchGuardChecker.doCheck(th2);
                throw th2;
            }
        }
        synchronized (c729600Sje.LIZ()) {
            try {
                c729600Sje.LIZ().LJIIIZ(-1);
            } catch (Throwable th3) {
                TryCatchGuardChecker.doCheck(th3);
                throw th3;
            }
        }
        synchronized (c729600Sje.LIZLLL) {
            try {
                ((ArrayList) c729600Sje.LIZLLL).clear();
            } catch (Throwable th4) {
                TryCatchGuardChecker.doCheck(th4);
                throw th4;
            }
        }
        synchronized (c729600Sje.LIZJ) {
            try {
                ((LinkedHashMap) c729600Sje.LIZJ).clear();
            } catch (Throwable th5) {
                TryCatchGuardChecker.doCheck(th5);
                throw th5;
            }
        }
        C0O05 c0o05 = c729600Sje.LJII;
        if (c0o05 != null) {
            C476250Ilz.LIZ.getClass();
            C09QK.LIZ(c0o05);
        }
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [X.0O05, X.1AlJ] */
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
        final C729600Sje c729600Sje = this.LLILZIL;
        c729600Sje.getClass();
        if (((Boolean) C104500aR.LIZ.getValue()).booleanValue()) {
            ?? r1 = new InterfaceC2188711AlJ() { // from class: X.0O05
                @Override // X.InterfaceC2188711AlJ
                public final void LIZ(C1768270w7F c1768270w7F) {
                    C09QO c09qo;
                    if (c1768270w7F != null && (c09qo = c1768270w7F.LIZIZ) != null && C0O04.LIZ[c09qo.ordinal()] == 1) {
                        C603820NmG<String, C729670Sjl> c603820NmGLIZ = c729600Sje.LIZ();
                        C729600Sje c729600Sje2 = c729600Sje;
                        synchronized (c603820NmGLIZ) {
                            try {
                                c729600Sje2.LIZ().LJIIIZ(-1);
                            } catch (Throwable th) {
                                TryCatchGuardChecker.doCheck(th);
                                throw th;
                            }
                        }
                    }
                }
            };
            C476250Ilz.LIZ.getClass();
            C2188561Al4.LJII(r1);
            c729600Sje.LJII = r1;
        }
    }

    @Override // com.ss.android.ugc.aweme.story.ability.IStoryFeedUserDataAbility
    public final boolean Hu1() {
        return this.LLJIJIL;
    }

    @Override // com.ss.android.ugc.aweme.story.ability.IStoryFeedUserDataAbility
    public final int UW1() {
        return this.LLIZLLLIL;
    }

    @Override // com.ss.android.ugc.aweme.story.ability.IStoryFeedUserDataAbility
    public final Set<Integer> XG() {
        return this.LLJILJIL;
    }

    @Override // com.ss.android.ugc.aweme.story.ability.IStoryFeedUserDataAbility
    public final AbstractC316870CbV<Long> Yl1() {
        return this.LLJILJILJ;
    }

    @Override // com.ss.android.ugc.aweme.story.ability.IStoryFeedUserDataAbility
    public final boolean mB0() {
        return this.LLJ;
    }

    @Override // com.ss.android.ugc.aweme.story.ability.IStoryFeedUserDataAbility
    public final void SO0(int i) {
        this.LLIZLLLIL = i;
    }

    @Override // com.ss.android.ugc.aweme.story.ability.IStoryFeedUserDataAbility
    public final void h60(int i) {
        C713200RyI.LIZLLL(this, i);
    }

    @Override // com.bytedance.ext_power_list.AssemSingleListViewModel
    public final void newState(C627660Ojc<InterfaceC1891350zJl> c627660Ojc) {
        setState(new AwS590S0100000_11(c627660Ojc, (C627660Ojc<InterfaceC360001aY>) 265));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:22:0x005f  */
    @Override // com.bytedance.ext_power_list.AssemListViewModel
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object onRefresh(X.InterfaceC1364105Vn<? super X.AbstractC316870CbV<java.lang.Long>> r11) {
        /*
            r10 = this;
            boolean r0 = r11 instanceof X.C729650Sjj
            if (r0 == 0) goto L5f
            r8 = r11
            X.0Sjj r8 = (X.C729650Sjj) r8
            int r2 = r8.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L5f
            int r2 = r2 - r1
            r8.LLILLL = r2
        L12:
            java.lang.Object r3 = r8.LL
            java.lang.Object r2 = X.C099R.LJFF()
            int r1 = r8.LLILLL
            r0 = 1
            if (r1 == 0) goto L3b
            if (r1 != r0) goto L89
            X.C155000ia.LIZIZ(r3)
        L22:
            X.0Sjm r3 = (X.C729680Sjm) r3
            java.lang.String r1 = r3.LIZ
            java.lang.String r0 = r10.LLILZLL
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            if (r0 != 0) goto L65
            X.0CcB r0 = X.AbstractC316870CbV.LIZ
            r0.getClass()
            X.0CbW r1 = new X.0CbW
            java.lang.String r0 = "group id not match"
            r1.<init>(r0)
            return r1
        L3b:
            X.C155000ia.LIZIZ(r3)
            java.lang.String r6 = r10.LLILZLL
            if (r6 != 0) goto L4f
            X.0CcB r0 = X.AbstractC316870CbV.LIZ
            r0.getClass()
            X.0CbW r1 = new X.0CbW
            java.lang.String r0 = "currentGroupId is null"
            r1.<init>(r0)
            return r1
        L4f:
            X.0Sje r3 = r10.LLILZIL
            r9 = 1
            java.lang.String r7 = r10.LLIZ
            r8.LLILLL = r0
            r4 = 0
            java.lang.Object r3 = r3.LIZLLL(r4, r6, r7, r8, r9)
            if (r3 != r2) goto L22
            return r2
        L5f:
            X.0Sjj r8 = new X.0Sjj
            r8.<init>(r10, r11)
            goto L12
        L65:
            kotlin.jvm.internal.AwS590S0100000_11 r1 = new kotlin.jvm.internal.AwS590S0100000_11
            r0 = 266(0x10a, float:3.73E-43)
            r1.<init>(r3, r0)
            r10.setState(r1)
            X.0CbV<java.lang.Long> r1 = r3.LIZIZ
            boolean r0 = r1 instanceof X.C323380Cm0
            if (r0 == 0) goto L83
            X.0Cm0 r1 = (X.C323380Cm0) r1
            T r0 = r1.LIZJ
            java.lang.Long r0 = (java.lang.Long) r0
            if (r0 == 0) goto L86
            long r0 = r0.longValue()
        L81:
            r10.LLJI = r0
        L83:
            X.0CbV<java.lang.Long> r1 = r3.LIZIZ
            return r1
        L86:
            r0 = 0
            goto L81
        L89:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.story.group.GroupChatWithStoryShareViewModel.onRefresh(X.05Vn):java.lang.Object");
    }

    @Override // X.InterfaceC2135708Yh
    public final void vr0(String str) {
        AnonymousClass0957<Boolean> anonymousClass0957;
        AnonymousClass0957<C729670Sjl> anonymousClass09572;
        C729600Sje c729600Sje = this.LLILZIL;
        c729600Sje.getClass();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("removeGroupStoryDetail: group id is ");
        sbLIZ.append(str);
        C2188811AlT.LIZIZ(sbLIZ);
        synchronized (c729600Sje.LIZIZ) {
            try {
                ((ArrayList) c729600Sje.LIZIZ).remove(str);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        synchronized (c729600Sje.LIZ) {
            try {
                C729690Sjn c729690SjnRemove = c729600Sje.LIZ.remove(str);
                if (c729690SjnRemove != null && (anonymousClass09572 = c729690SjnRemove.LIZIZ) != null) {
                    anonymousClass09572.LIZIZ(null);
                }
            } catch (Throwable th2) {
                TryCatchGuardChecker.doCheck(th2);
                throw th2;
            }
        }
        synchronized (c729600Sje.LIZJ) {
            try {
                C729700Sjo c729700SjoRemove = c729600Sje.LIZJ.remove(str);
                if (c729700SjoRemove != null && (anonymousClass0957 = c729700SjoRemove.LIZIZ) != null) {
                    anonymousClass0957.LIZIZ(null);
                }
            } catch (Throwable th3) {
                TryCatchGuardChecker.doCheck(th3);
                throw th3;
            }
        }
        synchronized (c729600Sje.LIZ()) {
            try {
                c729600Sje.LIZ().LJ(str);
            } catch (Throwable th4) {
                TryCatchGuardChecker.doCheck(th4);
                throw th4;
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.detail.vm.BaseDetailShareVM
    public final Aweme xQ2(InterfaceC1891350zJl interfaceC1891350zJl) {
        if (!(interfaceC1891350zJl instanceof C728820SiO)) {
            return null;
        }
        C728820SiO c728820SiO = (C728820SiO) interfaceC1891350zJl;
        if (C729510SjV.LJJII(c728820SiO.LL)) {
            return null;
        }
        Aweme aweme = c728820SiO.LL;
        C1618440sDa.LIZIZ.LJJIIJ().LIZ(aweme);
        return aweme;
    }

    @Override // com.ss.android.ugc.aweme.story.ability.IStoryFeedUserDataAbility
    public final void yA1(boolean z) {
        this.LLJ = z;
    }

    @Override // X.InterfaceC2135708Yh
    public final void Cc0(List<String> list, boolean z) {
        if (list.isEmpty()) {
            return;
        }
        this.LLILZIL.LJ(list, z);
    }

    @Override // X.InterfaceC2135708Yh
    public final void FP(String str, String str2) {
        this.LLILZLL = str;
        this.LLIZ = str2;
        this.LLILZIL.LJ(Collections.singletonList(str), false);
        if (str2 != null) {
            C729600Sje c729600Sje = this.LLILZIL;
            List listSingletonList = Collections.singletonList(str2);
            c729600Sje.getClass();
            ArrayList<String> arrayList = new ArrayList();
            for (Object obj : listSingletonList) {
                if (c729600Sje.LIZJ((String) obj)) {
                    arrayList.add(obj);
                }
            }
            if (!arrayList.isEmpty()) {
                synchronized (c729600Sje.LIZLLL) {
                    try {
                        boolean zIsEmpty = ((ArrayList) c729600Sje.LIZLLL).isEmpty();
                        for (String str3 : arrayList) {
                            if (!((ArrayList) c729600Sje.LIZLLL).contains(str3)) {
                                ((ArrayList) c729600Sje.LIZLLL).add(str3);
                            }
                        }
                        boolean zIsEmpty2 = ((ArrayList) c729600Sje.LIZLLL).isEmpty();
                        if (zIsEmpty && !zIsEmpty2) {
                            c729600Sje.LJIIIZ();
                        }
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        throw th;
                    }
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:22:0x005e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object onLoadMore(long r11, X.InterfaceC1364105Vn<? super X.AbstractC316870CbV<java.lang.Long>> r13) {
        /*
            r10 = this;
            boolean r0 = r13 instanceof X.C729660Sjk
            if (r0 == 0) goto L5e
            r8 = r13
            X.0Sjk r8 = (X.C729660Sjk) r8
            int r2 = r8.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L5e
            int r2 = r2 - r1
            r8.LLILLL = r2
        L12:
            java.lang.Object r3 = r8.LL
            java.lang.Object r2 = X.C099R.LJFF()
            int r1 = r8.LLILLL
            r0 = 1
            if (r1 == 0) goto L3b
            if (r1 != r0) goto L80
            X.C155000ia.LIZIZ(r3)
        L22:
            X.0Sjm r3 = (X.C729680Sjm) r3
            java.lang.String r1 = r3.LIZ
            java.lang.String r0 = r10.LLILZLL
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            if (r0 != 0) goto L64
            X.0CcB r0 = X.AbstractC316870CbV.LIZ
            r0.getClass()
            X.0CbW r1 = new X.0CbW
            java.lang.String r0 = "group id not match"
            r1.<init>(r0)
            return r1
        L3b:
            X.C155000ia.LIZIZ(r3)
            java.lang.String r6 = r10.LLILZLL
            if (r6 != 0) goto L4f
            X.0CcB r0 = X.AbstractC316870CbV.LIZ
            r0.getClass()
            X.0CbW r1 = new X.0CbW
            java.lang.String r0 = "currentGroupId is null"
            r1.<init>(r0)
            return r1
        L4f:
            X.0Sje r3 = r10.LLILZIL
            r9 = 0
            java.lang.String r7 = r10.LLIZ
            r8.LLILLL = r0
            r4 = r11
            java.lang.Object r3 = r3.LIZLLL(r4, r6, r7, r8, r9)
            if (r3 != r2) goto L22
            return r2
        L5e:
            X.0Sjk r8 = new X.0Sjk
            r8.<init>(r10, r13)
            goto L12
        L64:
            X.0CbV<java.lang.Long> r1 = r3.LIZIZ
            r10.LLJILJILJ = r1
            boolean r0 = r1 instanceof X.C323380Cm0
            if (r0 == 0) goto L7a
            X.0Cm0 r1 = (X.C323380Cm0) r1
            T r0 = r1.LIZJ
            java.lang.Long r0 = (java.lang.Long) r0
            if (r0 == 0) goto L7d
            long r0 = r0.longValue()
        L78:
            r10.LLJI = r0
        L7a:
            X.0CbV<java.lang.Long> r1 = r3.LIZIZ
            return r1
        L7d:
            r0 = 0
            goto L78
        L80:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.story.group.GroupChatWithStoryShareViewModel.onLoadMore(long, X.05Vn):java.lang.Object");
    }

    @Override // X.InterfaceC2135708Yh
    public final String vD(int i, String str) {
        C729670Sjl c729670SjlLIZJ;
        C728820SiO next;
        Aweme aweme;
        boolean z;
        if (i != 1) {
            return null;
        }
        C729600Sje c729600Sje = this.LLILZIL;
        synchronized (c729600Sje.LIZ()) {
            try {
                c729670SjlLIZJ = c729600Sje.LIZ().LIZJ(str);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        if (c729670SjlLIZJ == null) {
            return null;
        }
        Iterator<C728820SiO> it2 = c729670SjlLIZJ.LIZJ.iterator();
        while (true) {
            if (it2.hasNext()) {
                next = it2.next();
                if (C1605650rsx.LIZIZ.LJIIZILJ(EnumC1615506Uf.STORY, AwemeExtKt.getAuthorUid(next.LL)) == 1) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        C728820SiO c728820SiO = next;
        if (c728820SiO == null || (aweme = c728820SiO.LL) == null) {
            return null;
        }
        return AwemeExtKt.getAuthorUid(aweme);
    }

    @Override // com.bytedance.ext_power_list.AssemListViewModel
    public final /* bridge */ /* synthetic */ Object onLoadMore(Object obj, InterfaceC1364105Vn interfaceC1364105Vn) {
        return onLoadMore(((Number) obj).longValue(), (InterfaceC1364105Vn<? super AbstractC316870CbV<Long>>) interfaceC1364105Vn);
    }

    @Override // com.ss.android.ugc.aweme.detail.vm.BaseDetailShareVM
    public final Long yQ2(int i, C2189821An6 c2189821An6, int i2, boolean z) {
        return 0L;
    }
}
