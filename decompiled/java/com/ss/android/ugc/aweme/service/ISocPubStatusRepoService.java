package com.ss.android.ugc.aweme.service;

import X.C05G7;
import X.C0N5H;
import X.C0ZPB;
import X.C1605450rsd;
import X.C19EG;
import X.C727510SgH;
import X.C727780Sgi;
import X.EnumC1606080rte;
import X.EnumC1615506Uf;
import X.EnumC727500SgG;
import X.InterfaceC1364105Vn;
import X.InterfaceC1575850r6t;
import X.InterfaceC1605670rsz;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.profile.model.UserAllStoryMetadata;
import java.util.HashMap;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS555S0100000_11;

/* JADX INFO: loaded from: classes25.dex */
public interface ISocPubStatusRepoService {
    void LIZ(int i);

    C727780Sgi LIZIZ(EnumC1615506Uf enumC1615506Uf, String str);

    C0ZPB LIZJ(C19EG c19eg, LifecycleOwner lifecycleOwner, EnumC1615506Uf enumC1615506Uf, EnumC1606080rte enumC1606080rte, String str);

    void LIZLLL(String str, List list);

    Object LJ(String str, List list, C05G7 c05g7);

    boolean LJFF(String str);

    void LJI(LifecycleOwner lifecycleOwner, EnumC1615506Uf enumC1615506Uf, String str, String str2, InterfaceC1575850r6t interfaceC1575850r6t);

    void LJII(String str, String str2, AwS555S0100000_11 awS555S0100000_11);

    void LJIIIIZZ(C1605450rsd c1605450rsd);

    void LJIIIZ(HashMap<String, String> map, C0N5H c0n5h, EnumC727500SgG enumC727500SgG);

    void LJIIJ(EnumC1615506Uf enumC1615506Uf, String str, String str2, Function1<? super C727510SgH, Unit> function1);

    void LJIIJJI(int i);

    void LJIIL(List<? extends User> list, EnumC1606080rte enumC1606080rte, boolean z);

    Object LJIILIIL(String str, boolean z, String str2, InterfaceC1364105Vn interfaceC1364105Vn);

    void LJIILJJIL(EnumC1615506Uf enumC1615506Uf, C727780Sgi c727780Sgi);

    Boolean LJIILL(String str);

    void LJIILLIIL(EnumC1615506Uf enumC1615506Uf, LifecycleOwner lifecycleOwner);

    int LJIIZILJ(EnumC1615506Uf enumC1615506Uf, String str);

    void LJIJ(String str);

    UserAllStoryMetadata LJIJI(EnumC1615506Uf enumC1615506Uf, String str);

    void LJIJJ(LifecycleOwner lifecycleOwner, InterfaceC1605670rsz interfaceC1605670rsz);
}
