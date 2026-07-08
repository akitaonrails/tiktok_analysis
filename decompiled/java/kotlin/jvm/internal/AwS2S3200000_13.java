package kotlin.jvm.internal;

import X.C09AY;
import X.C0XGR;
import X.C0XQ5;
import X.C0XTR;
import X.C1397620mTQ;
import X.C1397660mTU;
import X.C20684815ws;
import X.EnumC1237810iJf;
import X.EnumC1237820iJg;
import X.InterfaceC849390XTt;
import Y.ARunnableS113S0100000_13;
import android.app.Activity;
import android.os.Bundle;
import com.ss.android.ugc.aweme.services.BindService;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes14.dex */
public class AwS2S3200000_13 extends C09AY implements Function1 {
    public final int $t;
    public Object l3;
    public Object l4;
    public String s0;
    public String s1;
    public String s2;

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

    public static final Object invoke$0(AwS2S3200000_13 awS2S3200000_13, Object obj) {
        C1397620mTQ c1397620mTQ = (C1397620mTQ) obj;
        c1397620mTQ.LJFF = true;
        c1397620mTQ.LJFF(2131836785, new AwS2S3200000_13((Activity) awS2S3200000_13.l3, (InterfaceC849390XTt) awS2S3200000_13.l4, awS2S3200000_13.s0, awS2S3200000_13.s1, awS2S3200000_13.s2, 1));
        c1397620mTQ.LJII(2131836786, new AwS379S0200000_13((Activity) awS2S3200000_13.l3, (InterfaceC849390XTt) awS2S3200000_13.l4, 18));
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS2S3200000_13 awS2S3200000_13, Object obj) {
        final C1397660mTU c1397660mTU = (C1397660mTU) obj;
        c1397660mTU.LIZJ = false;
        C0XGR c0xgr = new C0XGR();
        c0xgr.LIZLLL("enter_from", awS2S3200000_13.s0);
        c0xgr.LIZLLL("enter_method", awS2S3200000_13.s1);
        c0xgr.LIZLLL("platform", awS2S3200000_13.s2);
        C20684815ws.LJIILLIIL("bind_notify_confirm", c0xgr.LIZ);
        Bundle bundle = new Bundle();
        bundle.putInt("phone_number_source", EnumC1237820iJg.DYA_BIND_PHONE_NUMBER_SOURCE_TYPE_LOGOUT_ALERT.getValue());
        bundle.putInt("email_source", EnumC1237810iJf.DYA_BIND_EMAIL_SOURCE_TYPE_LOGOUT_ALERT.getValue());
        BindService bindServiceLIZIZ = C0XQ5.LIZIZ();
        final Activity activity = (Activity) awS2S3200000_13.l3;
        String str = awS2S3200000_13.s0;
        String str2 = awS2S3200000_13.s1;
        final InterfaceC849390XTt interfaceC849390XTt = (InterfaceC849390XTt) awS2S3200000_13.l4;
        bindServiceLIZIZ.bindMobileOrEmailAndSetPwd(activity, str, str2, bundle, new C0XTR() { // from class: X.0XVc
            @Override // X.C0XTR
            public final void onResult(int i, int i2, Object obj2) {
                if (i2 == 1) {
                    if (!activity.isFinishing()) {
                        c1397660mTU.LIZ().LIZIZ(null);
                    }
                    C2487409ou.LIZLLL(200L, new ARunnableS113S0100000_13(interfaceC849390XTt, 207));
                }
            }
        });
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS2S3200000_13(Activity activity, InterfaceC849390XTt interfaceC849390XTt, String str, String str2, String str3, int i) {
        super(1);
        this.$t = i;
        this.s0 = str;
        this.s1 = str2;
        this.s2 = str3;
        this.l3 = activity;
        this.l4 = interfaceC849390XTt;
    }
}
