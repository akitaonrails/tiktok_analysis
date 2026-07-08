package com.ss.android.ugc.aweme.aigc.graph.api;

import X.C0LPX;
import X.C1346605Ou;
import X.C552640Llu;
import X.C552940LmO;
import X.EnumC2398509aZ;
import X.InterfaceC1364105Vn;
import X.InterfaceC1406105et;
import X.InterfaceC346201Wa;
import X.InterfaceC545310La5;
import X.InterfaceC550540LiW;
import X.InterfaceC553010LmV;
import com.ss.android.ugc.aweme.aigc.migration.model.OldFrameworkInputModel;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes9.dex */
public interface AIGCWorkflowManagementApi {
    Object LIZ(String str, InterfaceC1364105Vn<? super InterfaceC550540LiW<C1346605Ou>> interfaceC1364105Vn);

    Object LIZIZ(String str, InterfaceC545310La5 interfaceC545310La5, InterfaceC1364105Vn<? super InterfaceC550540LiW<C552940LmO>> interfaceC1364105Vn);

    Object LIZJ(String str, EnumC2398509aZ enumC2398509aZ, InterfaceC1364105Vn<? super InterfaceC550540LiW<C552940LmO>> interfaceC1364105Vn);

    Object LJ(String str, InterfaceC1364105Vn<? super InterfaceC550540LiW<C552940LmO>> interfaceC1364105Vn);

    Object LJFF(C0LPX c0lpx, InterfaceC1364105Vn<? super InterfaceC550540LiW<List<C552940LmO>>> interfaceC1364105Vn);

    InterfaceC346201Wa LJI(String str, C552640Llu c552640Llu);

    Object LJII(String str, InterfaceC1364105Vn<? super InterfaceC346201Wa<C1346605Ou>> interfaceC1364105Vn);

    Object LJIIIZ(String str, InterfaceC1364105Vn<? super InterfaceC550540LiW<C552940LmO>> interfaceC1364105Vn);

    Object LJIIJ(String str, Map<InterfaceC553010LmV, ? extends InterfaceC1406105et> map, InterfaceC1364105Vn<? super InterfaceC550540LiW<C552940LmO>> interfaceC1364105Vn);

    InterfaceC550540LiW LJIIJJI(String str);

    Object LJIILIIL(C552940LmO c552940LmO, OldFrameworkInputModel oldFrameworkInputModel, InterfaceC1364105Vn<? super InterfaceC550540LiW<String>> interfaceC1364105Vn);

    InterfaceC550540LiW LJIILJJIL(String str);

    Object LJIILL(String str, InterfaceC553010LmV interfaceC553010LmV, InterfaceC1364105Vn<? super InterfaceC550540LiW<InterfaceC1406105et>> interfaceC1364105Vn);
}
