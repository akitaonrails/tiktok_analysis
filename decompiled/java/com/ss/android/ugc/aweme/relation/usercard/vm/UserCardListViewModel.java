package com.ss.android.ugc.aweme.relation.usercard.vm;

import X.AbstractC2252651DEx;
import X.AbstractC316870CbV;
import X.AbstractC329610Cw3;
import X.C01GW;
import X.C09R7;
import X.C0PEM;
import X.C1072460e0y;
import X.C1072480e10;
import X.C1157130gDX;
import X.C1262300ixA;
import X.C1263080iyQ;
import X.C1263140iyW;
import X.C1263190iyb;
import X.C1263200iyc;
import X.C1263340iyq;
import X.C1264320j0Q;
import X.C13IQ;
import X.C1558360qeg;
import X.C1558520qew;
import X.C19EG;
import X.C1DEV;
import X.C1DFB;
import X.C2188811AlT;
import X.C2191201ApK;
import X.C2252611DEt;
import X.C23250099c;
import X.C323720CmY;
import X.C452501pT;
import X.C627660Ojc;
import X.InterfaceC0148002o;
import X.InterfaceC1364105Vn;
import X.InterfaceC1891350zJl;
import X.InterfaceC494301wD;
import X.InterfaceC497601wk;
import X.InterfaceC665370Q7z;
import androidx.fragment.app.Fragment;
import com.bytedance.ext_power_list.AssemListViewModel;
import com.bytedance.ies.powerlist.page.config.PowerPageSource;
import com.bytedance.pumbaa.utility.method_id.MethodIDManager;
import com.ss.android.ugc.aweme.relation.usercard.ability.IAuthCardListScopeAbility;
import com.ss.android.ugc.aweme.relation.usercard.ability.IOptimizeAbility;
import com.ss.android.ugc.aweme.relation.usercard.ability.IUserCardListAbility;
import java.lang.reflect.Field;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.AwS385S0200000_19;
import kotlin.jvm.internal.AwS560S0100000_16;
import kotlin.jvm.internal.AwS563S0100000_19;
import kotlin.jvm.internal.AwS598S0100000_19;

/* JADX INFO: loaded from: classes20.dex */
public class UserCardListViewModel extends AssemListViewModel<C1263140iyW, InterfaceC1891350zJl, C1263190iyb> {
    public C1262300ixA LL;
    public final String LLILLJJLI;
    public final C323720CmY<C1263190iyb> LLILLL;
    public final AbstractC2252651DEx LLILZ;
    public final String LLILZIL;
    public final InterfaceC497601wk LLILZLL;
    public final C01GW LLIZ;
    public final C01GW LLIZLLLIL;
    public final C01GW LLJ;
    public final C01GW LLJI;
    public final C01GW LLJIJIL;
    public InterfaceC665370Q7z LLJILJIL;
    public final C01GW LLJILJILJ;
    public final C1DEV LLJILLL;
    public final C01GW LLJJ;

    public UserCardListViewModel() {
        throw null;
    }

    @Override // com.bytedance.ext_power_list.AssemListViewModel
    public final Object onRefresh(InterfaceC1364105Vn<? super AbstractC316870CbV<C1263190iyb>> interfaceC1364105Vn) {
        boolean zLJI = MethodIDManager.LJI(71952);
        Object objBQ2 = BQ2(this, interfaceC1364105Vn);
        if (zLJI) {
            MethodIDManager.LJ();
        }
        return objBQ2;
    }

    public final void CQ2() {
        C1264320j0Q c1264320j0Q = C1264320j0Q.LIZ;
        String str = this.LLILZIL;
        c1264320j0Q.getClass();
        C1264320j0Q.LIZLLL(str, "user touch, set PageMerge to is append");
        C1263340iyq c1263340iyq = yQ2().LLJJ;
        if (!(c1263340iyq instanceof C1263340iyq) || c1263340iyq == null) {
            return;
        }
        c1263340iyq.LIZ = true;
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C1263140iyW(0);
    }

    @Override // com.bytedance.ext_power_list.AssemListViewModel, com.bytedance.ext_power_list.AssemSingleListViewModel
    public final void manualListRefresh() {
        withState(new AwS598S0100000_19(this, 244));
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final void onPrepared() throws IllegalAccessException, NoSuchFieldException {
        C323720CmY<C1263190iyb> c323720CmY = this.LLILLL;
        if (c323720CmY != null) {
            InterfaceC497601wk interfaceC497601wk = this.LLILZLL;
            AbstractC329610Cw3<C1263190iyb> config = getConfig();
            c323720CmY.LLILLJJLI = interfaceC497601wk;
            c323720CmY.LLILLL = config;
            Field declaredField = PowerPageSource.class.getDeclaredField("operator");
            declaredField.setAccessible(true);
            declaredField.set(getConfig(), c323720CmY);
        }
        C23250099c.LIZLLL(this.LLILZLL, this.LLILZ, null, new C1072460e0y(this, null), 2);
        if (this.LL.trackerConfig.LJFF) {
            runOnWorkThread(new AwS598S0100000_19(this, 246));
        } else {
            zQ2();
        }
    }

    public final void reset() {
        setStateImmediate(new AwS598S0100000_19(this, 247));
        C23250099c.LIZLLL(getSingleThreadVMScope(), null, null, new C1072480e10(this, null), 3);
        ((IOptimizeAbility) this.LLJIJIL.getValue()).Qy2();
    }

    public final IUserCardListAbility xQ2() {
        return (IUserCardListAbility) this.LLJ.getValue();
    }

    public final C1263080iyQ yQ2() {
        return (C1263080iyQ) this.LLIZLLLIL.getValue();
    }

    public final void zQ2() {
        InterfaceC665370Q7z interfaceC665370Q7zLJI;
        C1262300ixA c1262300ixA = this.LL;
        Fragment fragment = c1262300ixA.hostFragment;
        if (fragment != null) {
            interfaceC665370Q7zLJI = C1558360qeg.LJFF(fragment, null);
        } else {
            C19EG c19eg = c1262300ixA.hostActivity;
            if (c19eg == null) {
                "not attach context".toString();
                throw new IllegalStateException("not attach context");
            }
            interfaceC665370Q7zLJI = C1558360qeg.LJI(c19eg, null);
        }
        this.LLJILJIL = interfaceC665370Q7zLJI;
        for (Pair pair : (List) this.LLJILJILJ.getValue()) {
            C1558520qew.LJII(interfaceC665370Q7zLJI, (InterfaceC494301wD) pair.getFirst(), C09R7.LIZ((C13IQ) pair.getSecond()), this.LLILLJJLI, null);
        }
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel, androidx.lifecycle.ViewModel
    public final void onCleared() {
        C2252611DEt c2252611DEt;
        xQ2().getConfig().listConfig.LJI.clear();
        ((IAuthCardListScopeAbility) this.LLJI.getValue()).onCleared();
        xQ2().onCleared();
        InterfaceC665370Q7z interfaceC665370Q7z = this.LLJILJIL;
        if (interfaceC665370Q7z != null) {
            Iterator it2 = ((List) this.LLJILJILJ.getValue()).iterator();
            while (it2.hasNext()) {
                C1558520qew.LJIIJJI(interfaceC665370Q7z, C09R7.LIZ((C13IQ) ((Pair) it2.next()).getSecond()), this.LLILLJJLI);
            }
        }
        this.hierarchyDataStore = null;
        this.hierarchyServiceStore = null;
        C323720CmY<C1263190iyb> c323720CmY = this.LLILLL;
        if (c323720CmY != null && (c2252611DEt = c323720CmY.LLILZ) != null) {
            c2252611DEt.LJJIIZ(null);
        }
        super.onCleared();
        C1264320j0Q c1264320j0Q = C1264320j0Q.LIZ;
        String str = this.LLILZIL;
        c1264320j0Q.getClass();
        C1264320j0Q.LIZLLL(str, "viewModel cleared!");
    }

    @Override // com.bytedance.ext_power_list.AssemListViewModel, com.bytedance.ext_power_list.AssemSingleListViewModel
    public final void manualListLoadMore(Object obj) {
        withState(new AwS385S0200000_19(this, ((C1263200iyc) yQ2().LLIZ.getValue()).LIZJ, 10));
    }

    @Override // com.bytedance.ext_power_list.AssemSingleListViewModel
    public final void newState(C627660Ojc<InterfaceC1891350zJl> c627660Ojc) {
        setState(new AwS598S0100000_19(c627660Ojc, (C627660Ojc<C1157130gDX>) 245));
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x006f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object BQ2(com.ss.android.ugc.aweme.relation.usercard.vm.UserCardListViewModel r5, X.InterfaceC1364105Vn<? super X.AbstractC316870CbV<X.C1263190iyb>> r6) {
        /*
            boolean r0 = r6 instanceof X.C1263300iym
            if (r0 == 0) goto L6f
            r4 = r6
            X.0iym r4 = (X.C1263300iym) r4
            int r2 = r4.LLILZ
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L6f
            int r2 = r2 - r1
            r4.LLILZ = r2
        L12:
            java.lang.Object r1 = r4.LLILLJJLI
            java.lang.Object r3 = X.C099R.LJFF()
            int r0 = r4.LLILZ
            r2 = 1
            if (r0 == 0) goto L50
            if (r0 != r2) goto L9a
            com.ss.android.ugc.aweme.relation.usercard.vm.UserCardListViewModel r5 = r4.LL
            X.C155000ia.LIZIZ(r1)
        L24:
            X.0iyn r1 = (X.C1263310iyn) r1
            X.0ixA r0 = r5.LL
            X.0ixd r0 = r0.apiConfig
            boolean r0 = r0.LJIJJ
            if (r0 == 0) goto L93
            X.0j02<X.0iwS> r3 = r1.LIZIZ
            boolean r0 = r3 instanceof X.C1264120j06
            if (r0 != 0) goto L8c
            boolean r0 = r3 instanceof X.C1265700j2e
            if (r0 != 0) goto L8c
            boolean r0 = r3 instanceof X.C1264100j04
            if (r0 == 0) goto L75
            X.0CcB r2 = X.AbstractC316870CbV.LIZ
            java.lang.Exception r1 = new java.lang.Exception
            X.0j04 r3 = (X.C1264100j04) r3
            java.lang.Throwable r0 = r3.LIZIZ
            r1.<init>(r0)
            r2.getClass()
            X.0Cb9 r2 = new X.0Cb9
            r2.<init>(r1)
            return r2
        L50:
            X.C155000ia.LIZIZ(r1)
            X.0j0Q r0 = X.C1264320j0Q.LIZ
            java.lang.String r1 = r5.LLILZIL
            r0.getClass()
            java.lang.String r0 = "invoke refresh!"
            X.C1264320j0Q.LIZLLL(r1, r0)
            X.0iyQ r1 = r5.yQ2()
            r4.LL = r5
            r4.LLILZ = r2
            r0 = 0
            java.lang.Object r1 = r1.LJIILIIL(r2, r0, r4)
            if (r1 != r3) goto L24
            return r3
        L6f:
            X.0iym r4 = new X.0iym
            r4.<init>(r5, r6)
            goto L12
        L75:
            boolean r0 = r3 instanceof X.C1264110j05
            if (r0 == 0) goto L86
            X.0CcB r0 = X.AbstractC316870CbV.LIZ
            r0.getClass()
            X.0CbW r2 = new X.0CbW
            java.lang.String r0 = ""
            r2.<init>(r0)
            return r2
        L86:
            X.07lC r0 = new X.07lC
            r0.<init>()
            throw r0
        L8c:
            X.0CcB r0 = X.AbstractC316870CbV.LIZ
            X.0Cb8 r2 = X.C317290CcB.LIZIZ(r0)
            return r2
        L93:
            X.0j02<X.0iwS> r0 = r1.LIZIZ
            X.0CbV r0 = X.C1263100iyS.LIZJ(r0)
            return r0
        L9a:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.relation.usercard.vm.UserCardListViewModel.BQ2(com.ss.android.ugc.aweme.relation.usercard.vm.UserCardListViewModel, X.05Vn):java.lang.Object");
    }

    @Override // com.bytedance.ext_power_list.AssemListViewModel
    public final Object onLoadMore(C1263190iyb c1263190iyb, InterfaceC1364105Vn<? super AbstractC316870CbV<C1263190iyb>> interfaceC1364105Vn) {
        return AQ2(this, c1263190iyb, interfaceC1364105Vn);
    }

    public UserCardListViewModel(C1262300ixA c1262300ixA, String str, C323720CmY c323720CmY) {
        C1DFB c1dfb = C0PEM.LIZJ;
        this.LL = c1262300ixA;
        this.LLILLJJLI = str;
        this.LLILLL = c323720CmY;
        this.LLILZ = c1dfb;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        C1262300ixA c1262300ixA2 = this.LL;
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append(c1262300ixA2.trackerConfig.LIZ);
        sbLIZ2.append('|');
        sbLIZ2.append(c1262300ixA2.trackerConfig.LJII);
        sbLIZ.append(C2188811AlT.LIZIZ(sbLIZ2));
        sbLIZ.append("|VM");
        this.LLILZIL = C2188811AlT.LIZIZ(sbLIZ);
        this.LLILZLL = getAssemVMScope();
        this.LLIZ = C452501pT.LIZIZ(new AwS563S0100000_19(this, 17));
        this.LLIZLLLIL = C452501pT.LIZIZ(new AwS563S0100000_19(this, 21));
        this.LLJ = C452501pT.LIZIZ(new AwS563S0100000_19(this, 19));
        this.LLJI = C452501pT.LIZIZ(new AwS560S0100000_16(this, 13));
        this.LLJIJIL = C452501pT.LIZIZ(new AwS563S0100000_19(this, 20));
        this.LLJILJILJ = C452501pT.LIZIZ(new AwS563S0100000_19(this, 15));
        this.LLJILLL = C2191201ApK.LIZ();
        this.LLJJ = C452501pT.LIZIZ(new AwS563S0100000_19(this, 16));
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0048  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ java.lang.Object AQ2(com.ss.android.ugc.aweme.relation.usercard.vm.UserCardListViewModel r5, X.C1263190iyb r6, X.InterfaceC1364105Vn<? super X.AbstractC316870CbV<X.C1263190iyb>> r7) {
        /*
            boolean r0 = r7 instanceof X.C1263290iyl
            if (r0 == 0) goto L48
            r4 = r7
            X.0iyl r4 = (X.C1263290iyl) r4
            int r2 = r4.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L48
            int r2 = r2 - r1
            r4.LLILLL = r2
        L12:
            java.lang.Object r1 = r4.LL
            java.lang.Object r3 = X.C099R.LJFF()
            int r0 = r4.LLILLL
            r2 = 1
            if (r0 == 0) goto L2b
            if (r0 != r2) goto L4e
            X.C155000ia.LIZIZ(r1)
        L22:
            X.0iyn r1 = (X.C1263310iyn) r1
            X.0j02<X.0iwS> r0 = r1.LIZIZ
            X.0CbV r0 = X.C1263100iyS.LIZJ(r0)
            return r0
        L2b:
            X.C155000ia.LIZIZ(r1)
            X.0j0Q r0 = X.C1264320j0Q.LIZ
            java.lang.String r1 = r5.LLILZIL
            r0.getClass()
            java.lang.String r0 = "invoke loadMore"
            X.C1264320j0Q.LIZLLL(r1, r0)
            X.0iyQ r1 = r5.yQ2()
            r4.LLILLL = r2
            r0 = 0
            java.lang.Object r1 = r1.LJIILIIL(r0, r6, r4)
            if (r1 != r3) goto L22
            return r3
        L48:
            X.0iyl r4 = new X.0iyl
            r4.<init>(r5, r7)
            goto L12
        L4e:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.relation.usercard.vm.UserCardListViewModel.AQ2(com.ss.android.ugc.aweme.relation.usercard.vm.UserCardListViewModel, X.0iyb, X.05Vn):java.lang.Object");
    }
}
