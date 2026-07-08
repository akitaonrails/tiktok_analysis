package kotlin.jvm.internal;

import X.C09AY;
import X.C1720106oR;
import X.C2187451AjH;
import X.C635460OwC;
import X.C635480OwE;
import X.InterfaceC1631620sYq;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.notification.bean.UnSubscribeSettingsData;
import java.util.List;
import kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
public class AwS110S0210000_9 extends C09AY implements InterfaceC1631620sYq {
    public final int $t;
    public Object l0;
    public Object l1;
    public boolean z2;

    @Override // X.InterfaceC1631620sYq
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj, obj2, obj3);
            case 1:
                return invoke$1(this, obj, obj2, obj3);
            default:
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS110S0210000_9(C635480OwE c635480OwE, C635460OwC c635460OwC, boolean z, int i) {
        super(3);
        this.$t = i;
        this.l0 = c635480OwE;
        this.l1 = c635460OwC;
        this.z2 = z;
    }

    public static final Object invoke$0(AwS110S0210000_9 awS110S0210000_9, Object obj, Object obj2, Object obj3) {
        int size;
        ((Number) obj).intValue();
        ((Number) obj2).intValue();
        ((Boolean) obj3).booleanValue();
        List<UnSubscribeSettingsData> list = ((C635480OwE) awS110S0210000_9.l0).LLILLL;
        if (list != null) {
            size = list.size();
        } else {
            size = 0;
        }
        if (size > ((C635460OwC) awS110S0210000_9.l1).LLILLJJLI) {
            int i = C2187451AjH.LIZ;
            C1720106oR.LJI("SystemNotificationSettingAdapter", "update data");
            C635460OwC c635460OwC = (C635460OwC) awS110S0210000_9.l1;
            UnSubscribeSettingsData unSubscribeSettingsData = c635460OwC.LL;
            if (unSubscribeSettingsData != null) {
                boolean z = awS110S0210000_9.z2;
                C635480OwE c635480OwE = (C635480OwE) awS110S0210000_9.l0;
                UnSubscribeSettingsData unSubscribeSettingsDataLIZ = UnSubscribeSettingsData.LIZ(unSubscribeSettingsData, !z);
                c635460OwC.LL = unSubscribeSettingsDataLIZ;
                List<UnSubscribeSettingsData> list2 = c635480OwE.LLILLL;
                if (list2 != null) {
                    ListProtector.set(list2, c635460OwC.LLILLJJLI, unSubscribeSettingsDataLIZ);
                }
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS110S0210000_9 awS110S0210000_9, Object obj, Object obj2, Object obj3) {
        int size;
        ((Number) obj).intValue();
        ((Number) obj2).intValue();
        ((Boolean) obj3).booleanValue();
        List<UnSubscribeSettingsData> list = ((C635480OwE) awS110S0210000_9.l0).LLILLL;
        if (list != null) {
            size = list.size();
        } else {
            size = 0;
        }
        if (size > ((C635460OwC) awS110S0210000_9.l1).LLILLJJLI) {
            int i = C2187451AjH.LIZ;
            C1720106oR.LJI("SystemNotificationSettingAdapter", "update data");
            C635460OwC c635460OwC = (C635460OwC) awS110S0210000_9.l1;
            UnSubscribeSettingsData unSubscribeSettingsData = c635460OwC.LL;
            if (unSubscribeSettingsData != null) {
                boolean z = awS110S0210000_9.z2;
                C635480OwE c635480OwE = (C635480OwE) awS110S0210000_9.l0;
                c635460OwC.I5(false);
                UnSubscribeSettingsData unSubscribeSettingsDataLIZ = UnSubscribeSettingsData.LIZ(unSubscribeSettingsData, !z);
                c635460OwC.LL = unSubscribeSettingsDataLIZ;
                List<UnSubscribeSettingsData> list2 = c635480OwE.LLILLL;
                if (list2 != null) {
                    ListProtector.set(list2, c635460OwC.LLILLJJLI, unSubscribeSettingsDataLIZ);
                }
                c635480OwE.notifyItemChanged(c635460OwC.LLILLJJLI);
            }
        }
        return Unit.LIZ;
    }
}
