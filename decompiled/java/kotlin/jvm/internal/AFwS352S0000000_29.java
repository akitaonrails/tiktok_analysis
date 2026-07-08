package kotlin.jvm.internal;

import X.C09AY;
import X.InterfaceC1631620sYq;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.concurrent.atomic.AtomicReferenceArray;
import kotlin.Unit;

/* JADX INFO: loaded from: classes30.dex */
public class AFwS352S0000000_29 extends C09AY implements InterfaceC1631620sYq {
    public static final /* synthetic */ AtomicReferenceArray arr$ = new AtomicReferenceArray(4);
    public final int $t;

    public static AFwS352S0000000_29 get$arr$(int i) {
        AFwS352S0000000_29 aFwS352S0000000_29 = (AFwS352S0000000_29) arr$.get(i);
        if (aFwS352S0000000_29 != null) {
            return aFwS352S0000000_29;
        }
        arr$.compareAndSet(i, null, new AFwS352S0000000_29(i));
        return (AFwS352S0000000_29) arr$.get(i);
    }

    @Override // X.InterfaceC1631620sYq
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj, obj2, obj3);
            case 1:
                return invoke$1(this, obj, obj2, obj3);
            case 2:
                return invoke$2(this, obj, obj2, obj3);
            case 3:
                return invoke$3(this, obj, obj2, obj3);
            default:
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AFwS352S0000000_29(int i) {
        super(3);
        this.$t = i;
    }

    public static final /* bridge */ /* synthetic */ Object invoke$0(AFwS352S0000000_29 aFwS352S0000000_29, Object obj, Object obj2, Object obj3) {
        return null;
    }

    public static final Object invoke$1(AFwS352S0000000_29 aFwS352S0000000_29, Object obj, Object obj2, Object obj3) {
        Integer num = (Integer) obj2;
        User user = (User) obj3;
        if (user != null) {
            User userM307clone = user.m307clone();
            if (num != null) {
                if (num.intValue() == 0) {
                    userM307clone.setLivePushNotificationStatus(2);
                }
                userM307clone.setFollowStatus(num.intValue());
            }
            return userM307clone;
        }
        return null;
    }

    public static final Object invoke$2(AFwS352S0000000_29 aFwS352S0000000_29, Object obj, Object obj2, Object obj3) {
        User userM307clone;
        Integer num = (Integer) obj2;
        User user = (User) obj3;
        if (user == null || num == null || num.intValue() != 0 || (userM307clone = user.m307clone()) == null) {
            return null;
        }
        userM307clone.setFollowerStatus(0);
        if (userM307clone.getFollowStatus() == 2) {
            userM307clone.setFollowStatus(1);
        }
        return userM307clone;
    }

    public static final /* bridge */ /* synthetic */ Object invoke$3(AFwS352S0000000_29 aFwS352S0000000_29, Object obj, Object obj2, Object obj3) {
        ((Number) obj3).intValue();
        return Unit.LIZ;
    }
}
