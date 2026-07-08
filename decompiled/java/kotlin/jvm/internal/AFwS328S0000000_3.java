package kotlin.jvm.internal;

import X.AbstractC1387200mCc;
import X.AnonymousClass0782;
import X.C09AY;
import X.C1361400lX0;
import X.C1385040m98;
import X.C1906580ziK;
import X.C2027007wq;
import X.C20441214yg;
import X.C20684815ws;
import X.C2188811AlT;
import X.C2344009Gk;
import X.C467860IWi;
import X.C689240R1u;
import X.C844470XAv;
import X.InterfaceC1631620sYq;
import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.util.LruCache;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.util.concurrent.atomic.AtomicReferenceArray;
import kotlin.Unit;

/* JADX INFO: loaded from: classes4.dex */
public class AFwS328S0000000_3 extends C09AY implements InterfaceC1631620sYq {
    public static final /* synthetic */ AtomicReferenceArray arr$ = new AtomicReferenceArray(7);
    public final int $t;

    public static AFwS328S0000000_3 get$arr$(int i) {
        AFwS328S0000000_3 aFwS328S0000000_3 = (AFwS328S0000000_3) arr$.get(i);
        if (aFwS328S0000000_3 != null) {
            return aFwS328S0000000_3;
        }
        arr$.compareAndSet(i, null, new AFwS328S0000000_3(i));
        return (AFwS328S0000000_3) arr$.get(i);
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
            case 6:
                return invoke$6(this, obj, obj2, obj3);
            default:
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AFwS328S0000000_3(int i) {
        super(3);
        this.$t = i;
    }

    public static final Object invoke$0(AFwS328S0000000_3 aFwS328S0000000_3, Object obj, Object obj2, Object obj3) {
        int iIntValue = ((Number) obj).intValue();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("cancelPreApprove fail: code=");
        sbLIZ.append(iIntValue);
        sbLIZ.append(" msg=");
        sbLIZ.append((String) obj2);
        C20441214yg.LJIIIZ("MultiGuestInvitePreApproveHelper", C2188811AlT.LIZIZ(sbLIZ));
        return Unit.LIZ;
    }

    public static final /* bridge */ /* synthetic */ Object invoke$1(AFwS328S0000000_3 aFwS328S0000000_3, Object obj, Object obj2, Object obj3) {
        ((Number) obj).intValue();
        return Unit.LIZ;
    }

    public static final /* bridge */ /* synthetic */ Object invoke$2(AFwS328S0000000_3 aFwS328S0000000_3, Object obj, Object obj2, Object obj3) {
        ((Number) obj).intValue();
        return Unit.LIZ;
    }

    public static final /* bridge */ /* synthetic */ Object invoke$3(AFwS328S0000000_3 aFwS328S0000000_3, Object obj, Object obj2, Object obj3) {
        ((Number) obj).intValue();
        return Unit.LIZ;
    }

    public static final /* bridge */ /* synthetic */ Object invoke$4(AFwS328S0000000_3 aFwS328S0000000_3, Object obj, Object obj2, Object obj3) {
        return Unit.LIZ;
    }

    public static final Object invoke$5(AFwS328S0000000_3 aFwS328S0000000_3, Object obj, Object obj2, Object obj3) {
        Context contextLIZ;
        LruCache<C2027007wq, Bitmap> lruCache;
        Bitmap bitmap;
        Bitmap bitmap2;
        Activity activityLIZIZ;
        final int iIntValue = ((Number) obj).intValue();
        final int iIntValue2 = ((Number) obj2).intValue();
        final int iIntValue3 = ((Number) obj3).intValue();
        boolean z = true;
        if (((Number) AnonymousClass0782.LIZ.getValue()).intValue() != 1) {
            z = false;
        }
        if (!z) {
            AbstractC1387200mCc abstractC1387200mCcLJ = C1906580ziK.LJ();
            if (abstractC1387200mCcLJ != null && (activityLIZIZ = abstractC1387200mCcLJ.LIZIZ()) != null) {
                C689240R1u.LIZ.getClass();
                Bitmap bitmapLIZJ = C689240R1u.LIZJ(activityLIZIZ, iIntValue, iIntValue2, iIntValue3);
                if (bitmapLIZJ != null) {
                    return bitmapLIZJ;
                }
            }
            C689240R1u c689240R1u = C689240R1u.LIZ;
            C844470XAv.LIZ.getClass();
            Context contextLIZ2 = C844470XAv.LIZ();
            c689240R1u.getClass();
            return C689240R1u.LIZJ(contextLIZ2, iIntValue, iIntValue2, iIntValue3);
        }
        AbstractC1387200mCc abstractC1387200mCcLJ2 = C1906580ziK.LJ();
        if (abstractC1387200mCcLJ2 == null || (contextLIZ = abstractC1387200mCcLJ2.LIZIZ()) == null) {
            C844470XAv.LIZ.getClass();
            contextLIZ = C844470XAv.LIZ();
        }
        final boolean zLIZ = C467860IWi.LIZ(contextLIZ);
        Object obj4 = new Object(zLIZ, iIntValue, iIntValue2, iIntValue3) { // from class: X.07wq
            public final boolean LIZ;
            public final int LIZIZ;
            public final int LIZJ;
            public final int LIZLLL;

            public final boolean equals(Object obj5) {
                if (this == obj5) {
                    return true;
                }
                if (!(obj5 instanceof C2027007wq)) {
                    return false;
                }
                C2027007wq c2027007wq = (C2027007wq) obj5;
                return this.LIZ == c2027007wq.LIZ && this.LIZIZ == c2027007wq.LIZIZ && this.LIZJ == c2027007wq.LIZJ && this.LIZLLL == c2027007wq.LIZLLL;
            }

            public final int hashCode() {
                return (((((C786410Ut5.Z2(this.LIZ) * 31) + this.LIZIZ) * 31) + this.LIZJ) * 31) + this.LIZLLL;
            }

            public final String toString() {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("QuotationCacheKey(isDarkTheme=");
                sbLIZ.append(this.LIZ);
                sbLIZ.append(", iconRes=");
                sbLIZ.append(this.LIZIZ);
                sbLIZ.append(", destWidth=");
                sbLIZ.append(this.LIZJ);
                sbLIZ.append(", destHeight=");
                sbLIZ.append(this.LIZLLL);
                sbLIZ.append(')');
                return C2188811AlT.LIZIZ(sbLIZ);
            }

            {
                this.LIZ = zLIZ;
                this.LIZIZ = iIntValue;
                this.LIZJ = iIntValue2;
                this.LIZLLL = iIntValue3;
            }
        };
        Object obj5 = C689240R1u.LJIIIIZZ;
        synchronized (obj5) {
            try {
                lruCache = C689240R1u.LJII;
                bitmap = lruCache.get((C2027007wq) obj4);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        if (bitmap != null) {
            return bitmap;
        }
        C689240R1u c689240R1u2 = C689240R1u.LIZ;
        C1361400lX0 c1361400lX0LIZ = C1385040m98.LIZ(contextLIZ, zLIZ);
        c689240R1u2.getClass();
        Bitmap bitmapLIZJ2 = C689240R1u.LIZJ(c1361400lX0LIZ, iIntValue, iIntValue2, iIntValue3);
        synchronized (obj5) {
            try {
                bitmap2 = lruCache.get((C2027007wq) obj4);
                if (bitmap2 == null) {
                    lruCache.put((C2027007wq) obj4, bitmapLIZJ2);
                    bitmap2 = bitmapLIZJ2;
                }
            } catch (Throwable th2) {
                TryCatchGuardChecker.doCheck(th2);
                throw th2;
            }
        }
        return bitmap2;
    }

    public static final Object invoke$6(AFwS328S0000000_3 aFwS328S0000000_3, Object obj, Object obj2, Object obj3) {
        String str;
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        long jLongValue = ((Number) obj2).longValue();
        String str2 = (String) obj3;
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("action_type", "click");
        str2.toString();
        c2344009Gk.LJIIIIZZ("anchor_id", str2);
        c2344009Gk.LJIIIIZZ("room_id", String.valueOf(jLongValue));
        c2344009Gk.LJIIIIZZ("enter_from_merge", "homepage_hot");
        c2344009Gk.LJIIIIZZ("enter_method", "video_head");
        if (zBooleanValue) {
            str = "live_on";
        } else {
            str = "live_off";
        }
        c2344009Gk.LJIIIIZZ(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, str);
        C20684815ws.LJIILLIIL("livesdk_live_status_change", c2344009Gk.LIZ);
        return Unit.LIZ;
    }
}
