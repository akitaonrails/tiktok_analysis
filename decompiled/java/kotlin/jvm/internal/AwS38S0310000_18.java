package kotlin.jvm.internal;

import X.AbstractC1623806Xk;
import X.C01GW;
import X.C09AY;
import X.C1160250gIZ;
import X.C1170820gZc;
import X.C1179830go9;
import X.C1179840goA;
import X.C1179850goB;
import X.C1189060h32;
import X.C1196140hES;
import X.C1197730hH1;
import X.C1197750hH3;
import X.C1207340hWW;
import X.C1207450hWh;
import X.C15438062q;
import X.C1749280vcc;
import X.C2097908Jt;
import X.C491001vg;
import X.C491101vh;
import X.C724240Sb0;
import X.EnumC1207930hXT;
import android.content.Context;
import androidx.fragment.app.Fragment;
import com.bytedance.assem.arch.core.UIAssem;
import com.bytedance.bpea.cert.token.TokenCert;
import com.ss.android.ugc.aweme.favorites.business.FavoritesFragmentV2;
import com.ss.android.ugc.aweme.favorites.business.collection.assem.CollectionListStateAssem;
import com.ss.android.ugc.tiktok.location_api.service.ILocationBaseServiceForMT;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes19.dex */
public class AwS38S0310000_18 extends C09AY implements Function1 {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;
    public boolean z3;

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj);
            case 1:
                return invoke$1(this, obj);
            case 2:
                return invoke$2(this, obj);
            case 3:
                return invoke$3(this, obj);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS38S0310000_18 awS38S0310000_18, Object obj) {
        List<C1170820gZc> listLIZ;
        Fragment parentFragment;
        AbstractC1623806Xk<List<C1170820gZc>> abstractC1623806Xk = ((C1160250gIZ) obj).LL;
        if (!(abstractC1623806Xk instanceof C491101vh) && !(abstractC1623806Xk instanceof C491001vg) && ((listLIZ = abstractC1623806Xk.LIZ()) == null || listLIZ.isEmpty())) {
            Fragment fragmentLJI = C724240Sb0.LJI((UIAssem) awS38S0310000_18.l0);
            if (fragmentLJI != null) {
                parentFragment = fragmentLJI.getParentFragment();
            } else {
                parentFragment = null;
            }
            if (parentFragment instanceof FavoritesFragmentV2) {
                ((CollectionListStateAssem) awS38S0310000_18.l1).Ho((C1749280vcc) awS38S0310000_18.l2, awS38S0310000_18.z3);
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS38S0310000_18 awS38S0310000_18, Object obj) {
        LinkedHashMap linkedHashMap;
        List list = (List) awS38S0310000_18.l0;
        List list2 = (List) awS38S0310000_18.l1;
        Map<String, List<C1179830go9>> map = ((C1179840goA) awS38S0310000_18.l2).LLILLL;
        if (map != null) {
            linkedHashMap = new LinkedHashMap(C2097908Jt.LIZIZ(map.size()));
            Iterator<T> it2 = map.entrySet().iterator();
            while (it2.hasNext()) {
                Map.Entry entry = (Map.Entry) it2.next();
                Object key = entry.getKey();
                Iterable iterable = (Iterable) entry.getValue();
                ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(iterable, 10));
                Iterator it3 = iterable.iterator();
                while (it3.hasNext()) {
                    arrayList.add(C1179830go9.LIZ((C1179830go9) it3.next(), false));
                }
                linkedHashMap.put(key, arrayList);
            }
        } else {
            linkedHashMap = null;
        }
        boolean z = awS38S0310000_18.z3;
        obj.getClass();
        return new C1179840goA(z, list, list2, linkedHashMap);
    }

    public static final Object invoke$2(AwS38S0310000_18 awS38S0310000_18, Object obj) {
        Boolean boolValueOf;
        Boolean boolValueOf2;
        C1196140hES c1196140hES = (C1196140hES) obj;
        C1197730hH1.LIZ.getClass();
        C01GW c01gw = C1197730hH1.LIZJ;
        ILocationBaseServiceForMT iLocationBaseServiceForMT = (ILocationBaseServiceForMT) c01gw.getValue();
        Boolean boolValueOf3 = null;
        if (iLocationBaseServiceForMT != null) {
            boolValueOf = Boolean.valueOf(iLocationBaseServiceForMT.LJJIIJZLJL((Context) awS38S0310000_18.l0));
        } else {
            boolValueOf = null;
        }
        c1196140hES.LIZ(C1189060h32.LJJIIZ(boolValueOf), "need_promote");
        c1196140hES.LIZLLL(C1189060h32.LJJIIZ(Boolean.valueOf(awS38S0310000_18.z3)), "manual");
        TokenCert tokenCert = (TokenCert) awS38S0310000_18.l1;
        if (tokenCert != null) {
            C1207340hWW.LIZ.getClass();
            c1196140hES.LIZIZ(C1189060h32.LJJIIZ(Boolean.valueOf(C1207340hWW.LJIIJ(tokenCert))), "cert_is_enable");
            c1196140hES.LIZJ(C1189060h32.LJJIIZ(Boolean.valueOf(C1207340hWW.LJIIIZ(tokenCert))), "cert_is_allow");
            String token = tokenCert.getToken();
            if (token == null) {
                token = "";
            }
            c1196140hES.LJIIIIZZ = new Pair<>("cert", token);
        }
        EnumC1207930hXT enumC1207930hXT = (EnumC1207930hXT) awS38S0310000_18.l2;
        if (enumC1207930hXT != null) {
            c1196140hES.LJIIIZ = new Pair<>("resultType", enumC1207930hXT.name());
        }
        ILocationBaseServiceForMT iLocationBaseServiceForMT2 = (ILocationBaseServiceForMT) c01gw.getValue();
        if (iLocationBaseServiceForMT2 != null) {
            boolValueOf2 = Boolean.valueOf(iLocationBaseServiceForMT2.LJ((Context) awS38S0310000_18.l0));
        } else {
            boolValueOf2 = null;
        }
        c1196140hES.LJII(C1189060h32.LJJIIZ(boolValueOf2), "system_is_precise");
        ILocationBaseServiceForMT iLocationBaseServiceForMT3 = (ILocationBaseServiceForMT) c01gw.getValue();
        if (iLocationBaseServiceForMT3 != null) {
            boolValueOf3 = Boolean.valueOf(iLocationBaseServiceForMT3.LJJIJ());
        }
        c1196140hES.LJIIL = new Pair<>("inapp_is_precise", Integer.valueOf(C1189060h32.LJJIIZ(boolValueOf3)));
        c1196140hES.LJIILIIL = new Pair<>("has_location", Integer.valueOf(C1189060h32.LJJIIZ(Boolean.valueOf(C1207450hWh.LIZ.LJII(0, (Context) awS38S0310000_18.l0)))));
        return Unit.LIZ;
    }

    public static final Object invoke$3(AwS38S0310000_18 awS38S0310000_18, Object obj) {
        Boolean boolValueOf;
        Boolean boolValueOf2;
        C1196140hES c1196140hES = (C1196140hES) obj;
        C1197750hH3.LIZ.getClass();
        C01GW c01gw = C1197750hH3.LIZJ;
        ILocationBaseServiceForMT iLocationBaseServiceForMT = (ILocationBaseServiceForMT) c01gw.getValue();
        Boolean boolValueOf3 = null;
        if (iLocationBaseServiceForMT != null) {
            boolValueOf = Boolean.valueOf(iLocationBaseServiceForMT.LJJIIJZLJL((Context) awS38S0310000_18.l0));
        } else {
            boolValueOf = null;
        }
        c1196140hES.LIZ(C1189060h32.LJJIIZ(boolValueOf), "need_promote");
        c1196140hES.LIZLLL(C1189060h32.LJJIIZ(Boolean.valueOf(awS38S0310000_18.z3)), "manual");
        TokenCert tokenCert = (TokenCert) awS38S0310000_18.l1;
        if (tokenCert != null) {
            C1207340hWW.LIZ.getClass();
            c1196140hES.LIZIZ(C1189060h32.LJJIIZ(Boolean.valueOf(C1207340hWW.LJIIJ(tokenCert))), "cert_is_enable");
            c1196140hES.LIZJ(C1189060h32.LJJIIZ(Boolean.valueOf(C1207340hWW.LJIIIZ(tokenCert))), "cert_is_allow");
            String token = tokenCert.getToken();
            if (token == null) {
                token = "";
            }
            c1196140hES.LJIIIIZZ = new Pair<>("cert", token);
        }
        EnumC1207930hXT enumC1207930hXT = (EnumC1207930hXT) awS38S0310000_18.l2;
        if (enumC1207930hXT != null) {
            c1196140hES.LJIIIZ = new Pair<>("resultType", enumC1207930hXT.name());
        }
        ILocationBaseServiceForMT iLocationBaseServiceForMT2 = (ILocationBaseServiceForMT) c01gw.getValue();
        if (iLocationBaseServiceForMT2 != null) {
            boolValueOf2 = Boolean.valueOf(iLocationBaseServiceForMT2.LJ((Context) awS38S0310000_18.l0));
        } else {
            boolValueOf2 = null;
        }
        c1196140hES.LJII(C1189060h32.LJJIIZ(boolValueOf2), "system_is_precise");
        ILocationBaseServiceForMT iLocationBaseServiceForMT3 = (ILocationBaseServiceForMT) c01gw.getValue();
        if (iLocationBaseServiceForMT3 != null) {
            boolValueOf3 = Boolean.valueOf(iLocationBaseServiceForMT3.LJJIJ());
        }
        c1196140hES.LJIIL = new Pair<>("inapp_is_precise", Integer.valueOf(C1189060h32.LJJIIZ(boolValueOf3)));
        c1196140hES.LJIILIIL = new Pair<>("has_location", Integer.valueOf(C1189060h32.LJJIIZ(Boolean.valueOf(C1207450hWh.LIZ.LJII(0, (Context) awS38S0310000_18.l0)))));
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS38S0310000_18(Context context, TokenCert tokenCert, EnumC1207930hXT enumC1207930hXT, int i) {
        super(1);
        this.$t = i;
        this.l0 = context;
        this.z3 = true;
        this.l1 = tokenCert;
        this.l2 = enumC1207930hXT;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS38S0310000_18(Context context, boolean z, TokenCert tokenCert, EnumC1207930hXT enumC1207930hXT, int i) {
        super(1);
        this.$t = i;
        this.l0 = context;
        this.z3 = z;
        this.l1 = tokenCert;
        this.l2 = enumC1207930hXT;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS38S0310000_18(UIAssem uIAssem, CollectionListStateAssem collectionListStateAssem, C1749280vcc c1749280vcc, boolean z, int i) {
        super(1);
        this.$t = i;
        this.l0 = uIAssem;
        this.l1 = collectionListStateAssem;
        this.l2 = c1749280vcc;
        this.z3 = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS38S0310000_18(List list, List<C1179850goB> list2, List<C1179830go9> list3, C1179840goA c1179840goA, boolean z) {
        super(1);
        this.$t = z ? 1 : 0;
        this.l0 = list;
        this.l1 = list2;
        this.l2 = list3;
        this.z3 = c1179840goA;
    }
}
