package kotlin.jvm.internal;

import X.C09AY;
import X.C15438062q;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes13.dex */
public class AwS295S0000000_12 extends C09AY implements Function2 {
    public final int $t;

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj, obj2);
            case 1:
                return invoke$1(this, obj, obj2);
            case 2:
                return invoke$2(this, obj, obj2);
            default:
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS295S0000000_12(int i) {
        super(2);
        this.$t = i;
    }

    public static /* bridge */ /* synthetic */ Object invoke$0(AwS295S0000000_12 awS295S0000000_12, Object obj, Object obj2) {
        List list = (List) obj2;
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
        for (Object obj3 : list) {
            if (Intrinsics.LJFF(((User) obj3).getUid(), ((User) obj).getUid()) && obj != null) {
                obj3 = obj;
            }
            arrayList.add(obj3);
        }
        return arrayList;
    }

    public static /* bridge */ /* synthetic */ Object invoke$1(AwS295S0000000_12 awS295S0000000_12, Object obj, Object obj2) {
        List list = (List) obj2;
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
        for (Object obj3 : list) {
            if (Intrinsics.LJFF(((User) obj3).getUid(), ((User) obj).getUid()) && obj != null) {
                obj3 = obj;
            }
            arrayList.add(obj3);
        }
        return arrayList;
    }

    public static /* bridge */ /* synthetic */ Object invoke$2(AwS295S0000000_12 awS295S0000000_12, Object obj, Object obj2) {
        List list = (List) obj2;
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
        for (Object obj3 : list) {
            if (Intrinsics.LJFF(((User) obj3).getUid(), ((User) obj).getUid()) && obj != null) {
                obj3 = obj;
            }
            arrayList.add(obj3);
        }
        return arrayList;
    }
}
