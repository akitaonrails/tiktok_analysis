package kotlin.jvm.internal;

import X.AbstractC21342018fa;
import X.C013C;
import X.C09AY;
import X.C0CNO;
import X.C1636320sgQ;
import X.C21341918fZ;
import X.C21342318fd;
import X.InterfaceC1891370zJn;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS199S0000000_12;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes26.dex */
public class AwS78S0301000_25 extends C09AY implements Function0 {
    public final int $t;
    public int i3;
    public Object l0;
    public Object l1;
    public Object l2;

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.$t) {
            case 0:
                return invoke$0(this);
            case 1:
                return invoke$1(this);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS78S0301000_25 awS78S0301000_25) {
        int i = awS78S0301000_25.i3;
        C1636320sgQ c1636320sgQ = (C1636320sgQ) awS78S0301000_25.l0;
        if (i == c1636320sgQ.LLJJIJI) {
            c1636320sgQ.LLILZ = new ArrayList((List) awS78S0301000_25.l1);
            final C013C c013c = new C013C();
            C21341918fZ c21341918fZ = (C21341918fZ) awS78S0301000_25.l2;
            final C1636320sgQ c1636320sgQ2 = (C1636320sgQ) awS78S0301000_25.l0;
            c21341918fZ.LIZIZ(new InterfaceC1891370zJn() { // from class: X.0slB
                @Override // X.InterfaceC1891370zJn
                public final void LJZL(int i2, int i3) {
                    c013c.element = true;
                    c1636320sgQ2.notifyItemRangeInserted(i2, i3);
                }

                @Override // X.InterfaceC1891370zJn
                public final void LLI(int i2, int i3) {
                    c1636320sgQ2.notifyItemMoved(i2, i3);
                }

                @Override // X.InterfaceC1891370zJn
                public final void LLIZLLLIL(int i2, int i3) {
                    c1636320sgQ2.notifyItemRangeRemoved(i2, i3);
                }

                @Override // X.InterfaceC1891370zJn
                public final void LLJJJJJIL(int i2, int i3, Object obj) {
                    c1636320sgQ2.notifyItemRangeChanged(i2, i3, obj);
                }
            });
            if (c013c.element) {
                RecyclerView.LayoutManager layoutManager = ((C1636320sgQ) awS78S0301000_25.l0).LLJJIII;
                if (layoutManager instanceof LinearLayoutManager) {
                    LinearLayoutManager linearLayoutManager = (LinearLayoutManager) layoutManager;
                    int iFindFirstVisibleItemPosition = linearLayoutManager.findFirstVisibleItemPosition();
                    int iFindLastVisibleItemPosition = linearLayoutManager.findLastVisibleItemPosition();
                    if (iFindFirstVisibleItemPosition >= 0 && iFindLastVisibleItemPosition >= iFindFirstVisibleItemPosition) {
                        ((C1636320sgQ) awS78S0301000_25.l0).notifyItemRangeChanged(iFindFirstVisibleItemPosition, (iFindLastVisibleItemPosition - iFindFirstVisibleItemPosition) + 1);
                    }
                }
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS78S0301000_25 awS78S0301000_25) {
        final Effect effectLLILIL = ((C1636320sgQ) awS78S0301000_25.l0).LLIZ.LLILIL();
        final List list = (List) awS78S0301000_25.l1;
        final List list2 = (List) awS78S0301000_25.l2;
        C0CNO.LIZLLL(0L, new AwS78S0301000_25(awS78S0301000_25.i3, (int) awS78S0301000_25.l0, (C1636320sgQ) awS78S0301000_25.l2, (List<? extends Effect>) C21342318fd.LIZ(new AbstractC21342018fa(effectLLILIL, list, list2) { // from class: X.0DKl
            public final Effect LIZ;
            public final List<Effect> LIZIZ;
            public final List<Effect> LIZJ;
            public final C01GW LIZLLL;

            @Override // X.AbstractC21342018fa
            public final int LIZLLL() {
                return this.LIZJ.size();
            }

            @Override // X.AbstractC21342018fa
            public final int LJ() {
                return this.LIZIZ.size();
            }

            @Override // X.AbstractC21342018fa
            public final boolean LIZ(int i, int i2) {
                Effect effect = (Effect) ListProtector.get(this.LIZIZ, i);
                Effect effect2 = (Effect) ListProtector.get(this.LIZJ, i2);
                if (this.LIZ != null && Intrinsics.LJFF(effect.getEffectId(), this.LIZ.getEffectId()) != Intrinsics.LJFF(effect2.getEffectId(), this.LIZ.getEffectId())) {
                    return false;
                }
                return true;
            }

            @Override // X.AbstractC21342018fa
            public final boolean LIZIZ(int i, int i2) {
                return Intrinsics.LJFF(((Effect) ListProtector.get(this.LIZIZ, i)).getEffectId(), ((Effect) ListProtector.get(this.LIZJ, i2)).getEffectId());
            }

            {
                this.LIZ = effectLLILIL;
                C01GW c01gwLIZIZ = C452501pT.LIZIZ(AFwS199S0000000_12.get$arr$(553));
                this.LIZLLL = c01gwLIZIZ;
                ArrayList arrayList = new ArrayList(list);
                ListProtector.add(arrayList, 0, c01gwLIZIZ.getValue());
                this.LIZIZ = arrayList;
                ArrayList arrayList2 = new ArrayList(list2);
                ListProtector.add(arrayList2, 0, c01gwLIZIZ.getValue());
                this.LIZJ = arrayList2;
            }
        }, false), (C21341918fZ) 0));
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS78S0301000_25(int i, int i2, C1636320sgQ c1636320sgQ, List<? extends Effect> list, C21341918fZ c21341918fZ) {
        super(0);
        this.$t = c21341918fZ;
        this.i3 = i;
        this.l0 = i2;
        this.l1 = c1636320sgQ;
        this.l2 = list;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS78S0301000_25(C1636320sgQ c1636320sgQ, C1636320sgQ c1636320sgQ2, List<? extends Effect> list, List<? extends Effect> list2, int i) {
        super(0);
        this.$t = i;
        this.l0 = c1636320sgQ;
        this.l1 = c1636320sgQ2;
        this.l2 = list;
        this.i3 = list2;
    }
}
