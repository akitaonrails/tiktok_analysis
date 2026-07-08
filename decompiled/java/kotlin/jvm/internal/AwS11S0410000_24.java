package kotlin.jvm.internal;

import X.AbstractC1623806Xk;
import X.C09AY;
import X.C1165920gRi;
import X.C1576190r7R;
import X.C1576260r7Y;
import X.C1579090rC7;
import X.C1623606Xi;
import X.C19EG;
import X.C491101vh;
import X.C626160OhC;
import X.C627660Ojc;
import X.EnumC1576280r7a;
import X.InterfaceC1891350zJl;
import com.ss.android.ugc.aweme.ogc.declaration.page.LocationInfo;
import com.ss.android.ugc.aweme.series.feed.model.MiniDramaCenterFilterOption;
import com.ss.android.ugc.aweme.series.feed.model.MiniDramaCenterResponse;
import com.ss.android.ugc.aweme.series.feed.seriescenter.assme.opt.MiniDramaCenterNewStyleViewModel;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes25.dex */
public class AwS11S0410000_24 extends C09AY implements Function1 {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;
    public Object l3;
    public boolean z4;

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj);
            case 1:
                return invoke$1(this, obj);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS11S0410000_24 awS11S0410000_24, Object obj) {
        String string;
        EnumC1576280r7a enumC1576280r7a;
        C19EG c19eg;
        String string2;
        EnumC1576280r7a enumC1576280r7a2;
        LocationInfo locationInfo;
        Long l = (Long) awS11S0410000_24.l0;
        String str = "";
        if (l != null) {
            long jLongValue = l.longValue();
            C1579090rC7.LIZ.getClass();
            string = C1579090rC7.LIZ(jLongValue);
        } else {
            C19EG c19eg2 = (C19EG) awS11S0410000_24.l1;
            if (c19eg2 == null || (string = c19eg2.getString(2131838648)) == null) {
                string = "";
            }
        }
        if (((Long) awS11S0410000_24.l0) != null) {
            enumC1576280r7a = EnumC1576280r7a.CLEAR;
        } else {
            enumC1576280r7a = EnumC1576280r7a.LINK;
        }
        C1576260r7Y c1576260r7Y = new C1576260r7Y(string, enumC1576280r7a);
        if (!awS11S0410000_24.z4 ? !((c19eg = (C19EG) awS11S0410000_24.l1) == null || (string2 = c19eg.getString(2131838650)) == null) : !((locationInfo = (LocationInfo) awS11S0410000_24.l2) == null || (string2 = locationInfo.name) == null)) {
            str = string2;
        }
        if (awS11S0410000_24.z4) {
            enumC1576280r7a2 = EnumC1576280r7a.CLEAR;
        } else {
            enumC1576280r7a2 = EnumC1576280r7a.LINK;
        }
        C1576260r7Y c1576260r7Y2 = new C1576260r7Y(str, enumC1576280r7a2);
        Boolean bool = (Boolean) awS11S0410000_24.l3;
        obj.getClass();
        return new C1576190r7R(c1576260r7Y, c1576260r7Y2, bool);
    }

    public static final Object invoke$1(AwS11S0410000_24 awS11S0410000_24, Object obj) {
        AbstractC1623806Xk c1623606Xi;
        AbstractC1623806Xk c1623606Xi2;
        C1165920gRi c1165920gRi = (C1165920gRi) obj;
        if (awS11S0410000_24.z4) {
            c1623606Xi = new C1623606Xi(new C626160OhC(false, Intrinsics.LJFF(((MiniDramaCenterResponse) awS11S0410000_24.l0).hasMore, Boolean.TRUE)));
        } else {
            c1623606Xi = C491101vh.LIZ;
        }
        if (awS11S0410000_24.z4) {
            c1623606Xi2 = new C1623606Xi(new C626160OhC(false, Intrinsics.LJFF(((MiniDramaCenterResponse) awS11S0410000_24.l0).hasMore, Boolean.TRUE)));
        } else {
            c1623606Xi2 = C491101vh.LIZ;
        }
        return C1165920gRi.LIZ(c1165920gRi, new C627660Ojc(c1623606Xi2, null, null, (List) awS11S0410000_24.l1, 6), c1623606Xi, (Map) awS11S0410000_24.l3, ((MiniDramaCenterNewStyleViewModel) awS11S0410000_24.l2).vQ2(), null, 70);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS11S0410000_24(Long l, C19EG c19eg, boolean z, LocationInfo locationInfo, Boolean bool, int i) {
        super(1);
        this.$t = i;
        this.l0 = l;
        this.l1 = c19eg;
        this.z4 = z;
        this.l2 = locationInfo;
        this.l3 = bool;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS11S0410000_24(boolean z, boolean z2, MiniDramaCenterResponse miniDramaCenterResponse, List<? extends InterfaceC1891350zJl> list, MiniDramaCenterNewStyleViewModel miniDramaCenterNewStyleViewModel, Map<String, ? extends List<MiniDramaCenterFilterOption>> map) {
        super(1);
        this.$t = map;
        this.z4 = z;
        this.l0 = z2;
        this.l1 = miniDramaCenterResponse;
        this.l2 = list;
        this.l3 = miniDramaCenterNewStyleViewModel;
    }
}
