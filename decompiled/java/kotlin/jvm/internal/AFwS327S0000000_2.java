package kotlin.jvm.internal;

import X.AbstractC738140SxQ;
import X.C05A1;
import X.C09AY;
import X.C0PEM;
import X.C1389890mGx;
import X.C1391190mJ3;
import X.C1455105mn;
import X.C1533790q13;
import X.C1716806nu;
import X.C19EG;
import X.C2296808zG;
import X.C23250099c;
import X.C291001Au;
import X.C337180DJs;
import X.C343970De7;
import X.C724240Sb0;
import X.InterfaceC1631620sYq;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.bytedance.assem.arch.core.UIAssem;
import com.bytedance.forest.Forest;
import com.bytedance.forest.model.RequestParams;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.aikit.api.common.task.CameoDraft;
import com.zhiliaoapp.musically.R;
import java.util.concurrent.atomic.AtomicReferenceArray;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public class AFwS327S0000000_2 extends C09AY implements InterfaceC1631620sYq {
    public static final /* synthetic */ AtomicReferenceArray arr$ = new AtomicReferenceArray(6);
    public final int $t;

    public static AFwS327S0000000_2 get$arr$(int i) {
        AFwS327S0000000_2 aFwS327S0000000_2 = (AFwS327S0000000_2) arr$.get(i);
        if (aFwS327S0000000_2 != null) {
            return aFwS327S0000000_2;
        }
        arr$.compareAndSet(i, null, new AFwS327S0000000_2(i));
        return (AFwS327S0000000_2) arr$.get(i);
    }

    @Override // X.InterfaceC1631620sYq
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj, obj2, obj3);
            case 1:
                return invoke$1(this, obj, obj2, obj3);
            case 2:
                return invoke$2(this, obj, obj2, obj3);
            case 3:
                return invoke$3(this, obj, obj2, obj3);
            case 4:
                return invoke$4(this, obj, obj2, obj3);
            case 5:
                return invoke$5(this, obj, obj2, obj3);
            default:
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AFwS327S0000000_2(int i) {
        super(3);
        this.$t = i;
    }

    public static final Object invoke$0(AFwS327S0000000_2 aFwS327S0000000_2, Object obj, Object obj2, Object obj3) {
        AbstractC738140SxQ abstractC738140SxQ = (AbstractC738140SxQ) obj;
        String str = (String) obj3;
        T t = ((C291001Au) obj2).LIZ;
        if (Intrinsics.LJFF(t, "Success")) {
            C19EG c19egLIZ = C724240Sb0.LIZ(abstractC738140SxQ);
            if (c19egLIZ != null) {
                C1389890mGx c1389890mGx = new C1389890mGx(c19egLIZ);
                c1389890mGx.LJIIIZ(2131825169);
                c1389890mGx.LJIIJJI();
            }
            Fragment fragmentLJI = C724240Sb0.LJI(abstractC738140SxQ);
            if (fragmentLJI != null) {
                String str2 = TuxSheet._pnsPageId;
                C1391190mJ3.LJFF(fragmentLJI, C343970De7.LIZ);
            }
        } else if (Intrinsics.LJFF(t, "Failed")) {
            C19EG c19egLIZ2 = C724240Sb0.LIZ(abstractC738140SxQ);
            if (c19egLIZ2 != null) {
                if (str.length() > 0) {
                    C1389890mGx c1389890mGx2 = new C1389890mGx(c19egLIZ2);
                    c1389890mGx2.LJIIJ(str);
                    c1389890mGx2.LJIIJJI();
                } else {
                    C1389890mGx c1389890mGx3 = new C1389890mGx(c19egLIZ2);
                    c1389890mGx3.LJIIIZ(2131848597);
                    c1389890mGx3.LJIIJJI();
                }
            }
            Fragment fragmentLJI2 = C724240Sb0.LJI(abstractC738140SxQ);
            if (fragmentLJI2 != null) {
                String str3 = TuxSheet._pnsPageId;
                C1391190mJ3.LJFF(fragmentLJI2, C343970De7.LIZ);
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$1(AFwS327S0000000_2 aFwS327S0000000_2, Object obj, Object obj2, Object obj3) {
        UIAssem uIAssem = (UIAssem) obj;
        boolean zBooleanValue = ((Boolean) obj2).booleanValue();
        boolean zBooleanValue2 = ((Boolean) obj3).booleanValue();
        View viewFindViewById = null;
        if (!zBooleanValue && !zBooleanValue2) {
            View viewLJJIJL = uIAssem.LJJIJL();
            if (viewLJJIJL != null) {
                viewFindViewById = viewLJJIJL.findViewById(R.id.ze);
            }
            C337180DJs.LIZJ(viewFindViewById);
        } else {
            View viewLJJIJL2 = uIAssem.LJJIJL();
            if (viewLJJIJL2 != null) {
                viewFindViewById = viewLJJIJL2.findViewById(R.id.ze);
            }
            C337180DJs.LIZ(viewFindViewById);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$2(AFwS327S0000000_2 aFwS327S0000000_2, Object obj, Object obj2, Object obj3) {
        ((Number) obj2).intValue();
        ((Boolean) obj3).booleanValue();
        return Boolean.TRUE;
    }

    public static final Object invoke$3(AFwS327S0000000_2 aFwS327S0000000_2, Object obj, Object obj2, Object obj3) {
        ((Number) obj2).intValue();
        C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C05A1((CameoDraft) obj, (Function0) obj3, null), 3);
        return Unit.LIZ;
    }

    public static final Object invoke$4(AFwS327S0000000_2 aFwS327S0000000_2, Object obj, Object obj2, Object obj3) {
        return C1455105mn.LIZ(obj2, null, (Function2) obj);
    }

    public static final Object invoke$5(AFwS327S0000000_2 aFwS327S0000000_2, Object obj, Object obj2, Object obj3) {
        String str = (String) obj;
        RequestParams requestParams = (RequestParams) obj2;
        Function1<? super C1533790q13, Unit> function1 = (Function1) obj3;
        Forest forest = (Forest) C1716806nu.LIZJ.getValue();
        if (forest != null) {
            return forest.fetchResourceAsync(str, requestParams, function1);
        }
        return null;
    }
}
