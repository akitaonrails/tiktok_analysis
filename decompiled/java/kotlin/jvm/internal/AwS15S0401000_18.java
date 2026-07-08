package kotlin.jvm.internal;

import X.C05P0;
import X.C09AY;
import X.C1110404Vy;
import X.C1167390gU5;
import X.C1167410gU7;
import X.C1167470gUD;
import X.C1189910h4P;
import X.C1189920h4Q;
import X.C13LP;
import X.C20248814Kw;
import X.C291001Au;
import android.view.View;
import com.ss.android.ugc.aweme.comment.services.IKeyboardService;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.mix.editplaylist.EditPlaylistViewModel;
import com.ss.android.ugc.aweme.poi.detail.container.PoiListApi;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes19.dex */
public class AwS15S0401000_18 extends C09AY implements Function1 {
    public final int $t;
    public int i4;
    public Object l0;
    public Object l1;
    public Object l2;
    public Object l3;

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj);
            case 1:
                return invoke$1(this, obj);
            case 2:
                return invoke$2(this, obj);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS15S0401000_18 awS15S0401000_18, Object obj) {
        C1167470gUD c1167470gUD = (C1167470gUD) obj;
        List list = (List) awS15S0401000_18.l0;
        C291001Au c291001Au = new C291001Au(list);
        Set<String> set = c1167470gUD.LLJILJILJ;
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : set) {
            Iterator it2 = list.iterator();
            while (true) {
                if (it2.hasNext()) {
                    if (Intrinsics.LJFF(((Aweme) it2.next()).getAid(), obj2)) {
                        break;
                    }
                } else {
                    arrayList.add(obj2);
                    break;
                }
            }
        }
        ((EditPlaylistViewModel) awS15S0401000_18.l3).xQ2().LJIIJJI = arrayList;
        Set setLLIIJI = C13LP.LLIIJI(arrayList);
        List list2 = (List) awS15S0401000_18.l1;
        EditPlaylistViewModel editPlaylistViewModel = (EditPlaylistViewModel) awS15S0401000_18.l3;
        ArrayList arrayList2 = new ArrayList();
        for (Object obj3 : list2) {
            C1167410gU7 c1167410gU7XQ2 = editPlaylistViewModel.xQ2();
            if (!c1167410gU7XQ2.LJJ.contains(((Aweme) obj3).getAid())) {
                arrayList2.add(obj3);
            }
        }
        ((EditPlaylistViewModel) awS15S0401000_18.l3).xQ2().LJIIL = arrayList2;
        C1167390gU5 c1167390gU5 = (C1167390gU5) awS15S0401000_18.l2;
        return C1167470gUD.LIZ(c1167470gUD, null, null, null, 0L, awS15S0401000_18.i4, c1167390gU5.LIZ, c1167390gU5.LIZIZ, null, null, 0, null, null, setLLIIJI, c291001Au, arrayList2, 3983);
    }

    public static final Object invoke$1(AwS15S0401000_18 awS15S0401000_18, Object obj) {
        C20248814Kw c20248814Kw = (C20248814Kw) obj;
        c20248814Kw.LIZ = new AwS142S0201000_18((C1189920h4Q) awS15S0401000_18.l0, (PoiListApi.PostTag) awS15S0401000_18.l1, awS15S0401000_18.i4, 3);
        c20248814Kw.LIZIZ(new AwS60S0301000_18((C1189910h4P) awS15S0401000_18.l2, (C1189910h4P) awS15S0401000_18.i4, (int) awS15S0401000_18.l3, (Function2<? super PoiListApi.PostTag, ? super Integer, Unit>) awS15S0401000_18.l1, (PoiListApi.PostTag) 0));
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS15S0401000_18 awS15S0401000_18, Object obj) {
        int iIntValue = ((Number) obj).intValue();
        if (iIntValue > ((Number) ((C05P0) awS15S0401000_18.l1).getValue()).intValue()) {
            ((C05P0) awS15S0401000_18.l1).setValue(Integer.valueOf(iIntValue));
            IKeyboardService iKeyboardServiceLIZ = C1110404Vy.LIZ();
            int i = iIntValue - awS15S0401000_18.i4;
            if (i < 0) {
                i = 0;
            }
            iKeyboardServiceLIZ.LIZIZ(i, true);
        }
        C05P0 c05p0 = (C05P0) awS15S0401000_18.l2;
        Boolean bool = Boolean.TRUE;
        c05p0.setValue(bool);
        ((C05P0) awS15S0401000_18.l3).setValue(bool);
        ((View) awS15S0401000_18.l0).requestLayout();
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS15S0401000_18(int i, int i2, View view, C05P0<Integer> c05p0, C05P0<Boolean> c05p02, C05P0<Boolean> c05p03) {
        super(1);
        this.$t = c05p03;
        this.i4 = i;
        this.l0 = i2;
        this.l1 = view;
        this.l2 = c05p0;
        this.l3 = c05p02;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS15S0401000_18(C1189920h4Q c1189920h4Q, C1189920h4Q c1189920h4Q2, PoiListApi.PostTag postTag, int i, C1189910h4P c1189910h4P, Function2<? super PoiListApi.PostTag, ? super Integer, Unit> function2) {
        super(1);
        this.$t = function2;
        this.l0 = c1189920h4Q;
        this.l1 = c1189920h4Q2;
        this.i4 = postTag;
        this.l2 = i;
        this.l3 = c1189910h4P;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS15S0401000_18(List list, List<? extends Aweme> list2, List<? extends Aweme> list3, C1167390gU5 c1167390gU5, int i, EditPlaylistViewModel editPlaylistViewModel) {
        super(1);
        this.$t = editPlaylistViewModel;
        this.l0 = list;
        this.l1 = list2;
        this.l2 = list3;
        this.i4 = c1167390gU5;
        this.l3 = i;
    }
}
