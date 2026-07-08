package com.ss.android.ugc.aweme.service;

import X.AbstractC848400XPy;
import X.AnonymousClass0124;
import X.C01GW;
import X.C01YS;
import X.C05G7;
import X.C0JFA;
import X.C0N5H;
import X.C0PEM;
import X.C0XQ7;
import X.C0ZPB;
import X.C11RJ;
import X.C11RK;
import X.C1604750rrV;
import X.C1605450rsd;
import X.C1605660rsy;
import X.C1605690rt1;
import X.C1605720rt4;
import X.C19EG;
import X.C1DFH;
import X.C2107308Nj;
import X.C2296808zG;
import X.C23250099c;
import X.C727510SgH;
import X.C727780Sgi;
import X.C903850Zd1;
import X.EnumC1605740rt6;
import X.EnumC1606080rte;
import X.EnumC1615506Uf;
import X.EnumC727500SgG;
import X.InterfaceC1364105Vn;
import X.InterfaceC1575850r6t;
import X.InterfaceC1605460rse;
import X.InterfaceC1605670rsz;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.crash.Npth;
import com.ss.android.ugc.aweme.avatar.musicdetail.StorySingleAwemeObserver$registerSingleAwemeListener$1;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.profile.model.UserAllStoryMetadata;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS18S2300000_24;
import kotlin.jvm.internal.AwS35S2200000_24;
import kotlin.jvm.internal.AwS555S0100000_11;

/* JADX INFO: loaded from: classes25.dex */
public final class SocPubStatusRepoServiceImpl implements ISocPubStatusRepoService {
    @Override // com.ss.android.ugc.aweme.service.ISocPubStatusRepoService
    public final void LIZ(int i) {
        C01GW c01gw = C1605660rsy.LIZ;
        Set<Integer> set = C1605660rsy.LIZIZ;
        set.remove(Integer.valueOf(i));
        if (set.isEmpty()) {
            C1605660rsy.LIZJ.clear();
        }
    }

    @Override // com.ss.android.ugc.aweme.service.ISocPubStatusRepoService
    public final boolean LJFF(String str) {
        C01GW c01gw = C1605660rsy.LIZ;
        return C1605660rsy.LIZJ.contains(str);
    }

    @Override // com.ss.android.ugc.aweme.service.ISocPubStatusRepoService
    public final void LJIIIIZZ(C1605450rsd c1605450rsd) {
        AnonymousClass0124.LIZIZ.add(new WeakReference<>(c1605450rsd));
    }

    @Override // com.ss.android.ugc.aweme.service.ISocPubStatusRepoService
    public final void LJIIJJI(int i) {
        C01GW c01gw = C1605660rsy.LIZ;
        C1605660rsy.LIZIZ.add(Integer.valueOf(i));
    }

    @Override // com.ss.android.ugc.aweme.service.ISocPubStatusRepoService
    public final Boolean LJIILL(String str) {
        Map<String, Set<String>> map = AnonymousClass0124.LIZ;
        Set set = (Set) ((LinkedHashMap) AnonymousClass0124.LIZ).get(str);
        if (set == null) {
            return null;
        }
        return Boolean.valueOf(set.isEmpty());
    }

    @Override // com.ss.android.ugc.aweme.service.ISocPubStatusRepoService
    public final void LJIJ(String str) {
        C01GW c01gw = C1605660rsy.LIZ;
        if (str != null) {
            Set<String> set = C1605660rsy.LIZJ;
            if (!set.contains(str)) {
                set.add(str);
                Iterator it2 = ((CopyOnWriteArrayList) C1605660rsy.LIZ.getValue()).iterator();
                while (it2.hasNext()) {
                    InterfaceC1605670rsz interfaceC1605670rsz = (InterfaceC1605670rsz) ((Reference) it2.next()).get();
                    if (interfaceC1605670rsz != null) {
                        interfaceC1605670rsz.LIZ(str);
                    }
                }
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.service.ISocPubStatusRepoService
    public final C727780Sgi LIZIZ(EnumC1615506Uf enumC1615506Uf, String str) {
        C1605720rt4 c1605720rt4 = (C1605720rt4) C1605690rt1.LIZIZ().get(enumC1615506Uf);
        if (c1605720rt4 != null && str != null) {
            return c1605720rt4.LIZJ().get(str);
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.service.ISocPubStatusRepoService
    public final void LIZLLL(String str, List list) {
        Map<String, Set<String>> map = AnonymousClass0124.LIZ;
        Object linkedHashSet = ((LinkedHashMap) map).get(str);
        if (linkedHashSet == null) {
            linkedHashSet = new LinkedHashSet();
            map.put(str, (Set<String>) linkedHashSet);
        }
        Set set = (Set) linkedHashSet;
        set.clear();
        Iterator it2 = ((ArrayList) list).iterator();
        while (it2.hasNext()) {
            set.add(it2.next());
        }
    }

    @Override // com.ss.android.ugc.aweme.service.ISocPubStatusRepoService
    public final void LJIILJJIL(EnumC1615506Uf enumC1615506Uf, C727780Sgi c727780Sgi) {
        String curUserId = ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId();
        C01GW c01gw = C1605690rt1.LIZ;
        C1605690rt1.LIZLLL(enumC1615506Uf, curUserId, c727780Sgi, EnumC1605740rt6.UPDATE_MINE);
    }

    @Override // com.ss.android.ugc.aweme.service.ISocPubStatusRepoService
    public final void LJIILLIIL(EnumC1615506Uf enumC1615506Uf, LifecycleOwner lifecycleOwner) {
        C1605720rt4 c1605720rt4 = (C1605720rt4) C1605690rt1.LIZIZ().get(enumC1615506Uf);
        if (c1605720rt4 != null) {
            C1DFH c1dfh = C0PEM.LIZ;
            C23250099c.LIZLLL(C2296808zG.LIZ(C2107308Nj.LIZ), null, null, new C0JFA(c1605720rt4, lifecycleOwner, null), 3);
        }
    }

    @Override // com.ss.android.ugc.aweme.service.ISocPubStatusRepoService
    public final int LJIIZILJ(EnumC1615506Uf enumC1615506Uf, String str) {
        return C1605690rt1.LIZJ(enumC1615506Uf, str);
    }

    @Override // com.ss.android.ugc.aweme.service.ISocPubStatusRepoService
    public final UserAllStoryMetadata LJIJI(EnumC1615506Uf enumC1615506Uf, String str) {
        C727780Sgi c727780Sgi;
        UserAllStoryMetadata userAllStoryMetadata;
        C1605720rt4 c1605720rt4 = (C1605720rt4) C1605690rt1.LIZIZ().get(enumC1615506Uf);
        if (c1605720rt4 == null || str == null || (c727780Sgi = c1605720rt4.LIZJ().get(str)) == null || (userAllStoryMetadata = c727780Sgi.LIZLLL) == null) {
            return null;
        }
        return userAllStoryMetadata;
    }

    @Override // com.ss.android.ugc.aweme.service.ISocPubStatusRepoService
    public final void LJIJJ(LifecycleOwner lifecycleOwner, InterfaceC1605670rsz interfaceC1605670rsz) {
        C01GW c01gw = C1605660rsy.LIZ;
        if (lifecycleOwner != null) {
            ((CopyOnWriteArrayList) C1605660rsy.LIZ.getValue()).add(new WeakReference(interfaceC1605670rsz));
            lifecycleOwner.getLifecycle().addObserver(new StorySingleAwemeObserver$registerSingleAwemeListener$1(interfaceC1605670rsz));
        }
    }

    @Override // com.ss.android.ugc.aweme.service.ISocPubStatusRepoService
    public final Object LJ(String str, List list, C05G7 c05g7) {
        return C1604750rrV.LIZ.LIZ(str, list, c05g7);
    }

    @Override // com.ss.android.ugc.aweme.service.ISocPubStatusRepoService
    public final void LJII(String str, String str2, AwS555S0100000_11 awS555S0100000_11) {
        InterfaceC1605460rse interfaceC1605460rse;
        Set set = (Set) ((LinkedHashMap) AnonymousClass0124.LIZ).get(str);
        if (set != null && set.remove(str2) && set.size() == 0) {
            if (awS555S0100000_11 != null) {
                awS555S0100000_11.invoke();
            }
            for (WeakReference<InterfaceC1605460rse> weakReference : AnonymousClass0124.LIZIZ) {
                if (weakReference != null && (interfaceC1605460rse = weakReference.get()) != null) {
                    interfaceC1605460rse.LIZ(str);
                }
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.service.ISocPubStatusRepoService
    public final void LJIIIZ(HashMap<String, String> map, C0N5H c0n5h, EnumC727500SgG enumC727500SgG) {
        String message;
        String message2 = null;
        if (enumC727500SgG != null) {
            message = enumC727500SgG.getMessage();
        } else {
            message = null;
        }
        Exception exc = new Exception(message);
        String bizName = c0n5h.getBizName();
        if (enumC727500SgG != null) {
            message2 = enumC727500SgG.getMessage();
        }
        Npth.reportBizException(bizName, (Throwable) exc, message2, (Map<String, String>) map, true);
    }

    @Override // com.ss.android.ugc.aweme.service.ISocPubStatusRepoService
    public final void LJIIL(List<? extends User> list, EnumC1606080rte enumC1606080rte, boolean z) {
        String strName;
        Set<String> set = C11RJ.LIZ;
        ArrayList<User> arrayList = new ArrayList();
        for (User user : list) {
            User user2 = user;
            if (!((CopyOnWriteArraySet) C11RJ.LIZ).contains(user2.getUid()) && user2.getUid() != null) {
                arrayList.add(user);
            }
        }
        for (User user3 : arrayList) {
            C11RK<C01YS> c11rk = C11RJ.LIZJ;
            String uid = user3.getUid();
            if (enumC1606080rte == null || (strName = enumC1606080rte.name()) == null) {
                strName = "";
            }
            c11rk.onNext(new C01YS(uid, strName, z));
            ((CopyOnWriteArraySet) C11RJ.LIZ).add(user3.getUid());
            ((CopyOnWriteArraySet) C11RJ.LIZIZ).add(user3);
        }
    }

    @Override // com.ss.android.ugc.aweme.service.ISocPubStatusRepoService
    public final void LJIIJ(EnumC1615506Uf enumC1615506Uf, String str, String str2, Function1<? super C727510SgH, Unit> function1) {
        C1605720rt4 c1605720rt4 = (C1605720rt4) C1605690rt1.LIZIZ().get(enumC1615506Uf);
        if (c1605720rt4 != null) {
            C1605690rt1.LIZ(new AwS35S2200000_24(c1605720rt4, (C1605720rt4) str, str2, (String) function1, (Function1<? super C727510SgH, Unit>) 3));
        }
    }

    @Override // com.ss.android.ugc.aweme.service.ISocPubStatusRepoService
    public final Object LJIILIIL(String str, boolean z, String str2, InterfaceC1364105Vn interfaceC1364105Vn) {
        return C1604750rrV.LIZIZ(str, z, true, str2, interfaceC1364105Vn);
    }

    @Override // com.ss.android.ugc.aweme.service.ISocPubStatusRepoService
    public final C0ZPB LIZJ(C19EG c19eg, LifecycleOwner lifecycleOwner, EnumC1615506Uf enumC1615506Uf, EnumC1606080rte enumC1606080rte, String str) {
        return new C903850Zd1(c19eg, lifecycleOwner, enumC1615506Uf, enumC1606080rte);
    }

    @Override // com.ss.android.ugc.aweme.service.ISocPubStatusRepoService
    public final void LJI(LifecycleOwner lifecycleOwner, EnumC1615506Uf enumC1615506Uf, String str, String str2, InterfaceC1575850r6t interfaceC1575850r6t) {
        C1605720rt4 c1605720rt4 = (C1605720rt4) C1605690rt1.LIZIZ().get(enumC1615506Uf);
        if (c1605720rt4 != null) {
            C1605690rt1.LIZ(new AwS18S2300000_24(c1605720rt4, lifecycleOwner, str2, str, interfaceC1575850r6t, 1));
        }
    }
}
