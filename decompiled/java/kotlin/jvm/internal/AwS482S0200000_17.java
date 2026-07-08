package kotlin.jvm.internal;

import X.C09AY;
import X.C1123800fLm;
import X.C1124680fNC;
import X.C1127390fRZ;
import X.C1127440fRe;
import X.C1127980fSW;
import X.C1128300fT2;
import X.C1128320fT4;
import X.C1128350fT7;
import X.C1128940fU4;
import X.C1130250fWB;
import X.C501470JlZ;
import X.C784440Upu;
import X.InterfaceC1124700fNE;
import X.InterfaceC1631620sYq;
import android.os.SystemClock;
import com.bytedance.android.livesdk.gift.model.GiftColorInfo;
import com.bytedance.android.livesdk.model.Gift;
import kotlin.Unit;
import org.json.JSONException;
import webcast.api.bag.BagItemConsumeResponse;

/* JADX INFO: loaded from: classes18.dex */
public class AwS482S0200000_17 extends C09AY implements InterfaceC1631620sYq {
    public final int $t;
    public Object l0;
    public Object l1;

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
            default:
                return null;
        }
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public AwS482S0200000_17(X.C1127390fRZ r3, X.C1127440fRe r4, int r5) {
        /*
            r2 = this;
            r2.$t = r5
            if (r5 == 0) goto Le
            r1 = r2
            r1.l0 = r4
            r1.l1 = r3
            r0 = 3
        La:
            r1.<init>(r0)
            return
        Le:
            r1 = r2
            r1.l0 = r3
            r1.l1 = r4
            r0 = 3
            goto La
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS482S0200000_17.<init>(X.0fRZ, X.0fRe, int):void");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS482S0200000_17(C1124680fNC c1124680fNC, InterfaceC1124700fNE interfaceC1124700fNE, int i) {
        super(3);
        this.$t = i;
        this.l0 = c1124680fNC;
        this.l1 = interfaceC1124700fNE;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS482S0200000_17(C1128940fU4 c1128940fU4, C1130250fWB c1130250fWB, int i) {
        super(3);
        this.$t = i;
        this.l0 = c1128940fU4;
        this.l1 = c1130250fWB;
    }

    public static final Object invoke$0(AwS482S0200000_17 awS482S0200000_17, Object obj, Object obj2, Object obj3) {
        C1128350fT7 c1128350fT7 = (C1128350fT7) obj;
        boolean zBooleanValue = ((Boolean) obj2).booleanValue();
        int iIntValue = ((Number) obj3).intValue();
        ((C1127390fRZ) awS482S0200000_17.l0).LLJJIJI = c1128350fT7.LIZJ.colorId.longValue();
        C784440Upu.LIZ().LIZIZ(new C1127980fSW(c1128350fT7.LIZJ.colorId, zBooleanValue));
        Long lValueOf = Long.valueOf(c1128350fT7.LIZIZ);
        Long l = c1128350fT7.LIZJ.colorId;
        Integer numValueOf = Integer.valueOf(iIntValue);
        GiftColorInfo giftColorInfo = c1128350fT7.LIZJ;
        Gift gift = ((C1127440fRe) awS482S0200000_17.l1).LJIIIIZZ;
        C1128320fT4.LIZ(numValueOf, C1128300fT2.LJFF(giftColorInfo, C1128300fT2.LJIIIIZZ(gift), ((C1127390fRZ) awS482S0200000_17.l0).LJJJJLI().LIZ), lValueOf, l);
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS482S0200000_17 awS482S0200000_17, Object obj, Object obj2, Object obj3) throws JSONException {
        long jLongValue = ((Number) obj).longValue();
        C1123800fLm.LJ(((C1127440fRe) awS482S0200000_17.l0).LJI, SystemClock.uptimeMillis() - jLongValue, (Integer) obj2, (String) obj3);
        ((C1127390fRZ) awS482S0200000_17.l1).LJJLIIIIJ((C1127440fRe) awS482S0200000_17.l0);
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS482S0200000_17 awS482S0200000_17, Object obj, Object obj2, Object obj3) {
        int errorCode;
        String message;
        C501470JlZ c501470JlZ;
        long j;
        BagItemConsumeResponse.Data data = (BagItemConsumeResponse.Data) obj2;
        Throwable th = (Throwable) obj3;
        if (((Boolean) obj).booleanValue()) {
            if (data != null) {
                j = data.count;
            } else {
                j = ((C1128940fU4) awS482S0200000_17.l0).LIZIZ;
            }
            ((C1130250fWB) awS482S0200000_17.l1).LIZLLL.onSuccess(j);
        } else {
            if ((th instanceof C501470JlZ) && (c501470JlZ = (C501470JlZ) th) != null) {
                errorCode = c501470JlZ.getErrorCode();
                message = c501470JlZ.getPrompt();
                if (message == null) {
                }
                ((C1130250fWB) awS482S0200000_17.l1).LIZLLL.onFailure(errorCode, message);
            } else {
                errorCode = 10002;
            }
            if (th == null || (message = th.getMessage()) == null) {
                message = "consume bag item failed";
            }
            ((C1130250fWB) awS482S0200000_17.l1).LIZLLL.onFailure(errorCode, message);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$3(AwS482S0200000_17 awS482S0200000_17, Object obj, Object obj2, Object obj3) throws JSONException {
        long jLongValue = ((Number) obj).longValue();
        C1123800fLm.LJ(((C1124680fNC) awS482S0200000_17.l0).LJFF, SystemClock.uptimeMillis() - jLongValue, (Integer) obj2, (String) obj3);
        ((InterfaceC1124700fNE) awS482S0200000_17.l1).LIZIZ((C1124680fNC) awS482S0200000_17.l0);
        return Unit.LIZ;
    }
}
