package com.ss.android.ugc.aweme.ecommerce.search.searchbar.vm;

import X.C0QER;
import X.C0QPB;
import X.C0QUT;
import X.C0QVH;
import X.C0QVI;
import X.C0QVP;
import X.C0QWD;
import X.C0QWU;
import X.C0QXN;
import X.C1558520qew;
import X.C20642515q3;
import X.C650500PfM;
import X.C668910QLp;
import X.C674380Qcm;
import X.EnumC671580QVw;
import X.InterfaceC665370Q7z;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.discover.model.suggest.Word;
import com.ss.android.ugc.aweme.ecommerce.search.searchbar.ISearchBarContextAbility;
import com.ss.android.ugc.aweme.search.ecommerce.entrance.ECSearchEntranceData;
import com.ss.android.ugc.aweme.search.model.SearchResultParam;

/* JADX INFO: loaded from: classes11.dex */
public final class ECSearchBarAssemVM extends AssemViewModel<C0QVI> {
    public final InterfaceC665370Q7z LL;
    public final int LLILLJJLI = C668910QLp.LIZ;
    public final MutableLiveData<C0QWD> LLILLL = new MutableLiveData<>();
    public final ISearchBarContextAbility LLILZ;
    public final C0QWU LLILZIL;
    public C0QUT LLILZLL;
    public Word LLIZ;
    public C674380Qcm LLIZLLLIL;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0013 A[PHI: r0 r2
      0x0013: PHI (r0v5 X.0QVH) = (r0v2 X.0QVH), (r0v6 X.0QVH) binds: [B:9:0x0011, B:7:0x000d] A[DONT_GENERATE, DONT_INLINE]
      0x0013: PHI (r2v2 java.lang.String) = (r2v0 java.lang.String), (r2v3 java.lang.String) binds: [B:9:0x0011, B:7:0x000d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x001b  */
    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.InterfaceC0148002o defaultState() {
        /*
            r4 = this;
            com.ss.android.ugc.aweme.ecommerce.search.searchbar.ISearchBarContextAbility r0 = r4.LLILZ
            r3 = 0
            if (r0 == 0) goto L26
            X.0QVH r0 = r0.Bf()
            if (r0 == 0) goto Lf
            java.lang.String r2 = r0.LIZIZ
            if (r2 != 0) goto L13
        Lf:
            java.lang.String r2 = ""
            if (r0 == 0) goto L15
        L13:
            java.lang.String r3 = r0.LIZJ
        L15:
            boolean r0 = X.C123100dR.LIZ(r3)
            if (r0 != 0) goto L1f
            java.lang.String r3 = r4.wQ2()
        L1f:
            X.0QVI r1 = new X.0QVI
            r0 = 0
            r1.<init>(r3, r2, r0)
            return r1
        L26:
            r0 = r3
            goto Lf
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.search.searchbar.vm.ECSearchBarAssemVM.defaultState():X.002o");
    }

    public final String wQ2() {
        C0QVH c0qvhBf;
        C0QER c0qer;
        ECSearchEntranceData ecSearchEntranceData;
        String stringOrNullStrategy;
        ISearchBarContextAbility iSearchBarContextAbility = this.LLILZ;
        return (iSearchBarContextAbility == null || (c0qvhBf = iSearchBarContextAbility.Bf()) == null || (c0qer = c0qvhBf.LJIILL) == null || (ecSearchEntranceData = c0qer.getEcSearchEntranceData()) == null || (stringOrNullStrategy = ecSearchEntranceData.getStringOrNullStrategy("default_hint_word")) == null) ? C20642515q3.LJI(2131840572) : stringOrNullStrategy;
    }

    public final int xQ2() {
        C0QVH c0qvhBf;
        C0QER c0qer;
        C0QVH c0qvhBf2;
        C0QER c0qer2;
        ECSearchEntranceData ecSearchEntranceData;
        C0QVH c0qvhBf3;
        C0QER c0qer3;
        ECSearchEntranceData ecSearchEntranceData2;
        C0QVH c0qvhBf4;
        C0QER c0qer4;
        ECSearchEntranceData ecSearchEntranceData3;
        Integer intOrNullStrategy;
        C0QXN ecommerceNewUserModel;
        C0QVH c0qvhBf5;
        C0QER c0qer5;
        ECSearchEntranceData ecSearchEntranceData4;
        C0QVP c0qvpZm;
        C0QPB c0qpbLLJILJIL;
        C0QUT c0qut = null;
        ISearchBarContextAbility iSearchBarContextAbility = (ISearchBarContextAbility) C1558520qew.LIZ(this.LL, ISearchBarContextAbility.class, null);
        SearchResultParam searchResultParam = (iSearchBarContextAbility == null || (c0qpbLLJILJIL = iSearchBarContextAbility.LLJILJIL()) == null) ? null : c0qpbLLJILJIL.LLILZ;
        ISearchBarContextAbility iSearchBarContextAbility2 = this.LLILZ;
        if (iSearchBarContextAbility2 != null && (c0qvpZm = iSearchBarContextAbility2.Zm()) != null) {
            c0qut = c0qvpZm.LIZLLL;
        }
        ISearchBarContextAbility iSearchBarContextAbility3 = this.LLILZ;
        if (iSearchBarContextAbility3 != null && (c0qvhBf5 = iSearchBarContextAbility3.Bf()) != null && (c0qer5 = c0qvhBf5.LJIILL) != null && (ecSearchEntranceData4 = c0qer5.getEcSearchEntranceData()) != null) {
            Integer intOrNullStrategy2 = ecSearchEntranceData4.getIntOrNullStrategy("skeleton_type");
            int type = EnumC671580QVw.ONLY_RESULT.getType();
            if (intOrNullStrategy2 != null && intOrNullStrategy2.intValue() == type) {
                return 0;
            }
        }
        if (searchResultParam != null && (ecommerceNewUserModel = searchResultParam.getEcommerceNewUserModel()) != null && ecommerceNewUserModel.landingToNewUserPage && c0qut == C0QUT.RESULT) {
            return 0;
        }
        ISearchBarContextAbility iSearchBarContextAbility4 = this.LLILZ;
        if (iSearchBarContextAbility4 != null && (c0qvhBf4 = iSearchBarContextAbility4.Bf()) != null && (c0qer4 = c0qvhBf4.LJIILL) != null && (ecSearchEntranceData3 = c0qer4.getEcSearchEntranceData()) != null && (intOrNullStrategy = ecSearchEntranceData3.getIntOrNullStrategy("photo_search_enable")) != null) {
            return intOrNullStrategy.intValue();
        }
        ISearchBarContextAbility iSearchBarContextAbility5 = this.LLILZ;
        if (iSearchBarContextAbility5 != null && (c0qvhBf3 = iSearchBarContextAbility5.Bf()) != null && (c0qer3 = c0qvhBf3.LJIILL) != null && (ecSearchEntranceData2 = c0qer3.getEcSearchEntranceData()) != null && ecSearchEntranceData2.getBooleanStrategy("photo_search_align_mall")) {
            return this.LLILLJJLI;
        }
        ISearchBarContextAbility iSearchBarContextAbility6 = this.LLILZ;
        if (iSearchBarContextAbility6 != null && (c0qvhBf2 = iSearchBarContextAbility6.Bf()) != null && (c0qer2 = c0qvhBf2.LJIILL) != null && (ecSearchEntranceData = c0qer2.getEcSearchEntranceData()) != null && ecSearchEntranceData.getBooleanStrategy("disable_vision_search")) {
            return 0;
        }
        ISearchBarContextAbility iSearchBarContextAbility7 = this.LLILZ;
        if (iSearchBarContextAbility7 == null || (c0qvhBf = iSearchBarContextAbility7.Bf()) == null || (c0qer = c0qvhBf.LJIILL) == null || C650500PfM.LJ(c0qer)) {
            return this.LLILLJJLI;
        }
        return 0;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(20:(21:16|(0)(2:19|(4:10|(1:12)(2:22|(0)(1:25))|13|(1:15)(0))(0))|93|26|(2:28|(1:30))(0)|31|(1:33)(1:34)|35|95|36|(7:97|38|(1:46)(1:42)|43|(2:45|47)|48|52)(2:51|52)|55|(1:57)|58|(2:60|(5:(3:63|99|65)(1:64)|66|69|(1:71)|72)(1:73))|74|(1:80)(1:78)|79|(1:83)|88|89)(1:6)|93|26|(0)(0)|31|(0)(0)|35|95|36|(0)(0)|55|(0)|58|(0)|74|(2:76|80)(0)|79|(3:82|84|83)(0)|88|89) */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00c3, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00c4, code lost:
    
        com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0);
        r5 = new X.C098200Yq(r0);
        X.C189200o6.m2constructorimpl(r5);
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0042 A[PHI: r6
      0x0042: PHI (r6v1 java.lang.String) = (r6v0 java.lang.String), (r6v11 java.lang.String) binds: [B:17:0x003f, B:8:0x0029] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0046 A[PHI: r3 r6
      0x0046: PHI (r3v1 java.lang.String) = (r3v0 java.lang.String), (r3v8 java.lang.String) binds: [B:20:0x0043, B:11:0x0031] A[DONT_GENERATE, DONT_INLINE]
      0x0046: PHI (r6v2 java.lang.String) = (r6v1 java.lang.String), (r6v10 java.lang.String) binds: [B:20:0x0043, B:11:0x0031] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x004a A[PHI: r3 r5 r6
      0x004a: PHI (r3v2 java.lang.String) = (r3v1 java.lang.String), (r3v7 java.lang.String) binds: [B:23:0x0047, B:14:0x0039] A[DONT_GENERATE, DONT_INLINE]
      0x004a: PHI (r5v1 java.lang.String) = (r5v0 java.lang.String), (r5v14 java.lang.String) binds: [B:23:0x0047, B:14:0x0039] A[DONT_GENERATE, DONT_INLINE]
      0x004a: PHI (r6v3 java.lang.String) = (r6v2 java.lang.String), (r6v9 java.lang.String) binds: [B:23:0x0047, B:14:0x0039] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0051 A[Catch: all -> 0x0140, TryCatch #0 {all -> 0x0140, blocks: (B:26:0x004b, B:28:0x0051, B:31:0x0066, B:33:0x006c, B:55:0x00cf, B:58:0x00d6, B:60:0x00da, B:69:0x0101, B:71:0x0107, B:72:0x010a, B:68:0x00f6, B:73:0x010e, B:74:0x0114, B:76:0x011d, B:78:0x0123, B:79:0x0125, B:84:0x012f, B:86:0x0135, B:88:0x013b, B:54:0x00c4, B:36:0x0080, B:38:0x0086, B:40:0x0095, B:42:0x0099, B:43:0x00a3, B:48:0x00b7, B:52:0x00bf, B:46:0x00ac, B:50:0x00bb, B:65:0x00e5, B:66:0x00ed), top: B:93:0x004b, inners: #1, #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x006c A[Catch: all -> 0x0140, TryCatch #0 {all -> 0x0140, blocks: (B:26:0x004b, B:28:0x0051, B:31:0x0066, B:33:0x006c, B:55:0x00cf, B:58:0x00d6, B:60:0x00da, B:69:0x0101, B:71:0x0107, B:72:0x010a, B:68:0x00f6, B:73:0x010e, B:74:0x0114, B:76:0x011d, B:78:0x0123, B:79:0x0125, B:84:0x012f, B:86:0x0135, B:88:0x013b, B:54:0x00c4, B:36:0x0080, B:38:0x0086, B:40:0x0095, B:42:0x0099, B:43:0x00a3, B:48:0x00b7, B:52:0x00bf, B:46:0x00ac, B:50:0x00bb, B:65:0x00e5, B:66:0x00ed), top: B:93:0x004b, inners: #1, #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00da A[Catch: all -> 0x0140, TryCatch #0 {all -> 0x0140, blocks: (B:26:0x004b, B:28:0x0051, B:31:0x0066, B:33:0x006c, B:55:0x00cf, B:58:0x00d6, B:60:0x00da, B:69:0x0101, B:71:0x0107, B:72:0x010a, B:68:0x00f6, B:73:0x010e, B:74:0x0114, B:76:0x011d, B:78:0x0123, B:79:0x0125, B:84:0x012f, B:86:0x0135, B:88:0x013b, B:54:0x00c4, B:36:0x0080, B:38:0x0086, B:40:0x0095, B:42:0x0099, B:43:0x00a3, B:48:0x00b7, B:52:0x00bf, B:46:0x00ac, B:50:0x00bb, B:65:0x00e5, B:66:0x00ed), top: B:93:0x004b, inners: #1, #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0086 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public ECSearchBarAssemVM(X.InterfaceC665370Q7z r10) {
        /*
            Method dump skipped, instruction units count: 335
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.search.searchbar.vm.ECSearchBarAssemVM.<init>(X.0Q7z):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:130:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x012b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.ss.android.ugc.aweme.search.model.SearchResultParam vQ2(java.lang.String r14) {
        /*
            Method dump skipped, instruction units count: 444
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.search.searchbar.vm.ECSearchBarAssemVM.vQ2(java.lang.String):com.ss.android.ugc.aweme.search.model.SearchResultParam");
    }
}
