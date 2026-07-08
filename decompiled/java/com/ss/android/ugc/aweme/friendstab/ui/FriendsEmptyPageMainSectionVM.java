package com.ss.android.ugc.aweme.friendstab.ui;

import X.C09A1;
import X.C1071010dyd;
import X.C1073660e2u;
import X.C1073670e2v;
import X.C1073690e2x;
import X.C1073710e2z;
import X.C1073880e3G;
import X.C1076010e6h;
import X.C11NJ;
import X.C1388190mED;
import X.C19EG;
import X.C1E7L;
import X.C2232408os;
import X.C2296808zG;
import X.C2296908zH;
import X.C23250099c;
import X.C319860CgK;
import X.C418440Gaw;
import X.C786410Ut5;
import X.C814420VxA;
import X.EnumC1071030dyf;
import X.EnumC1073650e2t;
import X.InterfaceC497601wk;
import android.content.Context;
import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.arch.widgets.base.NextLiveData;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.relation.service.SocialMonoFreqControlService;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.AwS630S0100000_16;

/* JADX INFO: loaded from: classes17.dex */
public final class FriendsEmptyPageMainSectionVM extends ViewModel {
    public final InterfaceC497601wk LL;
    public final C1073670e2v LLILLJJLI;
    public final C11NJ LLILLL;
    public final Boolean LLILZ;
    public boolean LLILZIL;
    public final MutableLiveData<C1073710e2z> LLILZLL;
    public final MutableLiveData LLIZ;
    public final MutableLiveData<Boolean> LLIZLLLIL;
    public final MutableLiveData LLJ;
    public final NextLiveData<C1073880e3G> LLJI;
    public final NextLiveData<C1073880e3G> LLJIJIL;

    public final List<C1073690e2x> vQ2() {
        ArrayList arrayList = new ArrayList();
        getClass();
        C1076010e6h c1076010e6h = C1076010e6h.LIZJ;
        if (!c1076010e6h.LJIIJ().LIZJ() && !this.LLILZ.booleanValue()) {
            arrayList.add(new C1073690e2x(EnumC1073650e2t.CONTACT, 2131834947, new AwS630S0100000_16(this, 15)));
        }
        getClass();
        if (!c1076010e6h.LJII().LIZJ() && SocialMonoFreqControlService.LIZIZ().LIZ(C1E7L.AUTH_FB) && !this.LLILZ.booleanValue()) {
            arrayList.add(new C1073690e2x(EnumC1073650e2t.FACEBOOK, 2131834948, new AwS630S0100000_16(this, 16)));
        }
        if ((!arrayList.isEmpty()) && !C319860CgK.LIZ()) {
            arrayList.add(new C1073690e2x(EnumC1073650e2t.INVITE, 2131836220, new AwS630S0100000_16(this, 17)));
        }
        if (arrayList.isEmpty()) {
            arrayList.add(new C1073690e2x(EnumC1073650e2t.SHARE_BAR, null, null));
        }
        return arrayList;
    }

    public FriendsEmptyPageMainSectionVM() {
        this(C2296808zG.LIZ(C09A1.LIZLLL(C2296908zH.LIZ(), new C2232408os(C786410Ut5.h4()))));
    }

    @Override // androidx.lifecycle.ViewModel
    public final void onCleared() {
        super.onCleared();
        this.LLILLL.dispose();
    }

    public final C1073710e2z wQ2() {
        int i;
        List<C1073690e2x> listVQ2 = vQ2();
        ArrayList arrayList = (ArrayList) listVQ2;
        if (arrayList.isEmpty()) {
            i = 2131834939;
        } else {
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                if (((C1073690e2x) it2.next()).LIZ != EnumC1073650e2t.SHARE_BAR) {
                    i = 2131834938;
                    break;
                }
            }
            i = 2131834939;
        }
        return new C1073710e2z(i, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(60)), 44.0f, listVQ2, 0.45f, true);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.0e2v] */
    public FriendsEmptyPageMainSectionVM(InterfaceC497601wk interfaceC497601wk) {
        this.LL = interfaceC497601wk;
        this.LLILLJJLI = new Object() { // from class: X.0e2v
        };
        this.LLILLL = new C11NJ();
        this.LLILZ = ((IAccountUserService) ServiceManager.get().getService(IAccountUserService.class)).LJFF();
        MutableLiveData<C1073710e2z> mutableLiveData = new MutableLiveData<>(new C1073710e2z(0, 0.0f, 63));
        this.LLILZLL = mutableLiveData;
        this.LLIZ = mutableLiveData;
        MutableLiveData<Boolean> mutableLiveData2 = new MutableLiveData<>(Boolean.FALSE);
        this.LLIZLLLIL = mutableLiveData2;
        this.LLJ = mutableLiveData2;
        NextLiveData<C1073880e3G> nextLiveData = new NextLiveData<>();
        this.LLJI = nextLiveData;
        this.LLJIJIL = nextLiveData;
    }

    public static void xQ2(EnumC1073650e2t enumC1073650e2t) {
        String str;
        int i = C1073660e2u.LIZ[enumC1073650e2t.ordinal()];
        if (i != 1) {
            if (i != 2) {
                return;
            } else {
                str = "facebook";
            }
        } else {
            str = "contact";
        }
        C1076010e6h c1076010e6h = C1076010e6h.LIZJ;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("position", "top");
        linkedHashMap.put("from_empty_click", "true");
        c1076010e6h.LJJIJ(str, linkedHashMap);
    }

    public final void yQ2(EnumC1073650e2t enumC1073650e2t, Context context) {
        EnumC1071030dyf enumC1071030dyf;
        LifecycleCoroutineScope lifecycleScope;
        int i = C1073660e2u.LIZ[enumC1073650e2t.ordinal()];
        if (i != 1) {
            if (i != 2) {
                return;
            } else {
                enumC1071030dyf = EnumC1071030dyf.FACEBOOK;
            }
        } else {
            enumC1071030dyf = EnumC1071030dyf.CONTACT;
        }
        getClass();
        C19EG c19egLIZIZ = C1388190mED.LIZIZ(context);
        if (c19egLIZIZ != null && (lifecycleScope = LifecycleOwnerKt.getLifecycleScope(c19egLIZIZ)) != null) {
            C23250099c.LIZLLL(lifecycleScope, null, null, new C1071010dyd(context, enumC1071030dyf, "homepage_friends", "click", null), 3);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x00aa A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00ab  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object zQ2(X.InterfaceC1364105Vn r10, kotlin.jvm.functions.Function1 r11, boolean r12) {
        /*
            r9 = this;
            boolean r0 = r10 instanceof X.C1388105bz
            if (r0 == 0) goto Lab
            r4 = r10
            X.05bz r4 = (X.C1388105bz) r4
            int r2 = r4.LLILZIL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto Lab
            int r2 = r2 - r1
            r4.LLILZIL = r2
        L12:
            java.lang.Object r1 = r4.LLILLL
            java.lang.Object r3 = X.C099R.LJFF()
            int r0 = r4.LLILZIL
            r5 = 3
            r6 = 2
            r7 = 1
            r2 = 0
            if (r0 == 0) goto L2c
            if (r0 == r7) goto L43
            if (r0 == r6) goto L94
            if (r0 != r5) goto Lb2
            X.C155000ia.LIZIZ(r1)
        L29:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L2c:
            X.C155000ia.LIZIZ(r1)
            X.08ps r1 = X.C2108208Ns.LIZ
            X.05W0 r0 = new X.05W0
            r0.<init>(r9, r2, r12)
            r4.LLILLJJLI = r11
            r4.LL = r12
            r4.LLILZIL = r7
            java.lang.Object r0 = X.C23250099c.LJI(r4, r1, r0)
            if (r0 != r3) goto L4a
            return r3
        L43:
            boolean r12 = r4.LL
            kotlin.jvm.functions.Function1 r11 = r4.LLILLJJLI
            X.C155000ia.LIZIZ(r1)
        L4a:
            androidx.lifecycle.MutableLiveData<X.0e2z> r0 = r9.LLILZLL
            java.lang.Object r8 = r0.getValue()
            if (r8 != 0) goto L5b
            X.0e2z r8 = new X.0e2z
            r7 = 0
            r1 = 63
            r0 = 0
            r8.<init>(r0, r7, r1)
        L5b:
            java.lang.Object r7 = r11.invoke(r8)
            X.0e2z r7 = (X.C1073710e2z) r7
            if (r7 == 0) goto L99
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r7, r8)
            if (r0 != 0) goto L99
            int r0 = X.C2187451AjH.LIZ
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "update ui state: "
            r1.append(r0)
            r1.append(r7)
            java.lang.String r1 = X.C2188811AlT.LIZIZ(r1)
            java.lang.String r0 = "_FriendsEmpty"
            X.C1720106oR.LJI(r0, r1)
            X.08ps r1 = X.C2108208Ns.LIZ
            X.05bx r0 = new X.05bx
            r0.<init>(r9, r7, r2)
            r4.LLILLJJLI = r2
            r4.LL = r12
            r4.LLILZIL = r6
            java.lang.Object r0 = X.C23250099c.LJI(r4, r1, r0)
            if (r0 != r3) goto L99
            return r3
        L94:
            boolean r12 = r4.LL
            X.C155000ia.LIZIZ(r1)
        L99:
            X.08ps r1 = X.C2108208Ns.LIZ
            X.05W1 r0 = new X.05W1
            r0.<init>(r9, r2, r12)
            r4.LLILLJJLI = r2
            r4.LLILZIL = r5
            java.lang.Object r0 = X.C23250099c.LJI(r4, r1, r0)
            if (r0 != r3) goto L29
            return r3
        Lab:
            X.05bz r4 = new X.05bz
            r4.<init>(r9, r10)
            goto L12
        Lb2:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.friendstab.ui.FriendsEmptyPageMainSectionVM.zQ2(X.05Vn, kotlin.jvm.functions.Function1, boolean):java.lang.Object");
    }
}
