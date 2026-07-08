package kotlin.jvm.internal;

import X.C09AY;
import X.C0XQ5;
import X.C0XTR;
import X.C1233610iCt;
import X.C1233790iDB;
import X.C1388190mED;
import X.C786410Ut5;
import X.C851380Xaa;
import X.EnumC1233840iDG;
import X.EnumC1237820iJg;
import X.EnumC852660Xce;
import X.EnumC852910Xd3;
import android.app.Activity;
import android.content.Context;
import android.os.BaseBundle;
import android.os.Bundle;
import com.ss.android.ugc.aweme.account.login.twostep.AuthDeviceResponse;
import com.ss.android.ugc.aweme.account.login.twostep.TwoStepVerificationActivityViewModel;
import com.ss.android.ugc.aweme.account.login.v2.base.CommonFlowActivity;
import com.ss.android.ugc.aweme.services.BindService;
import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes20.dex */
public class AwS1S2211000_19 extends C09AY implements Function0 {
    public final int $t;
    public int i5;
    public Object l2;
    public Object l3;
    public String s0;
    public String s1;
    public boolean z4;

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

    public static final Object invoke$0(AwS1S2211000_19 awS1S2211000_19) {
        Activity activityLIZ;
        final TwoStepVerificationActivityViewModel twoStepVerificationActivityViewModel = (TwoStepVerificationActivityViewModel) awS1S2211000_19.l2;
        final String str = awS1S2211000_19.s0;
        final C1233610iCt c1233610iCt = new C1233610iCt(twoStepVerificationActivityViewModel, awS1S2211000_19.z4, awS1S2211000_19.s1, (List) awS1S2211000_19.l3, awS1S2211000_19.i5);
        if (!twoStepVerificationActivityViewModel.LLJ) {
            Context context = twoStepVerificationActivityViewModel.BQ2().LLILLL;
            if (context != null && (activityLIZ = C1388190mED.LIZ(context)) != null) {
                String str2 = CommonFlowActivity._pnsPageId;
                EnumC852910Xd3 enumC852910Xd3 = EnumC852910Xd3.ADD_AUTH_DEVICE;
                EnumC852660Xce enumC852660Xce = EnumC852660Xce.ADD_CURRENT_DEVICE_TO_TRUST_DEVICE;
                Bundle bundleZQ2 = twoStepVerificationActivityViewModel.zQ2();
                C786410Ut5.LJJJI("enter_from", twoStepVerificationActivityViewModel.getEnterFrom(), bundleZQ2);
                C786410Ut5.LJJJI("ticket", str, bundleZQ2);
                C851380Xaa.LIZ(activityLIZ, enumC852910Xd3, enumC852660Xce, bundleZQ2, new C0XTR() { // from class: X.0iCq
                    @Override // X.C0XTR
                    public final void onResult(int i, int i2, Object obj) {
                        String string;
                        BaseBundle baseBundle;
                        AuthDeviceResponse authDeviceResponse;
                        Bundle bundle;
                        boolean z = obj instanceof Bundle;
                        Serializable serializable = null;
                        if (z && (bundle = (Bundle) obj) != null) {
                            serializable = bundle.getSerializable("auth_device_response");
                        }
                        if ((serializable instanceof AuthDeviceResponse) && (authDeviceResponse = (AuthDeviceResponse) serializable) != null) {
                            twoStepVerificationActivityViewModel.LLILZ.setAuthDeviceListStatus(authDeviceResponse);
                        }
                        if (!z || (baseBundle = (BaseBundle) obj) == null || (string = baseBundle.getString("ticket", str)) == null) {
                            string = str;
                        }
                        c1233610iCt.invoke(string);
                    }
                }, null);
            }
        } else {
            c1233610iCt.invoke(str);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS1S2211000_19 awS1S2211000_19) {
        Activity activityLIZ;
        final TwoStepVerificationActivityViewModel twoStepVerificationActivityViewModel = (TwoStepVerificationActivityViewModel) awS1S2211000_19.l2;
        final List list = (List) awS1S2211000_19.l3;
        String str = awS1S2211000_19.s0;
        boolean z = awS1S2211000_19.z4;
        final AwS1S2211000_19 awS1S2211000_192 = new AwS1S2211000_19(awS1S2211000_19.i5, twoStepVerificationActivityViewModel, str, awS1S2211000_19.s1, list, z, 0);
        C1233790iDB c1233790iDB = (C1233790iDB) ((LinkedHashMap) twoStepVerificationActivityViewModel.LLILZLL).get(EnumC1233840iDG.SMS);
        if (c1233790iDB != null && c1233790iDB.LIZ) {
            awS1S2211000_192.invoke();
        } else {
            BindService bindServiceLIZIZ = C0XQ5.LIZIZ();
            Context context = twoStepVerificationActivityViewModel.BQ2().LLILLL;
            if (context != null) {
                activityLIZ = C1388190mED.LIZ(context);
            } else {
                activityLIZ = null;
            }
            String enterFrom = twoStepVerificationActivityViewModel.getEnterFrom();
            String enterMethod = twoStepVerificationActivityViewModel.getEnterMethod();
            Bundle bundleZQ2 = twoStepVerificationActivityViewModel.zQ2();
            bundleZQ2.putBoolean("show_success_toast", false);
            bundleZQ2.putBoolean("show_skip", true);
            bundleZQ2.putInt("phone_number_source", EnumC1237820iJg.DYA_BIND_PHONE_NUMBER_SOURCE_TYPE_TWO_STEP_VERIFICATION.getValue());
            bindServiceLIZIZ.bindMobile(activityLIZ, enterFrom, enterMethod, bundleZQ2, true, new C0XTR() { // from class: X.0iDN
                @Override // X.C0XTR
                public final void onResult(int i, int i2, Object obj) {
                    C851860XbM c851860XbM;
                    C1233790iDB c1233790iDB2;
                    if (i2 == 1) {
                        String str2 = null;
                        if (obj instanceof C851860XbM) {
                            c851860XbM = (C851860XbM) obj;
                        } else {
                            c851860XbM = null;
                        }
                        Map<EnumC1233840iDG, C1233790iDB> map = twoStepVerificationActivityViewModel.LLILZLL;
                        EnumC1233840iDG enumC1233840iDG = EnumC1233840iDG.SMS;
                        LinkedHashMap linkedHashMap = (LinkedHashMap) map;
                        C1233790iDB c1233790iDB3 = (C1233790iDB) linkedHashMap.get(enumC1233840iDG);
                        if (c1233790iDB3 != null) {
                            if (c851860XbM != null) {
                                str2 = c851860XbM.LIZ;
                            }
                            c1233790iDB2 = C1233790iDB.LIZ(c1233790iDB3, true, false, str2, false, false, 54);
                        } else {
                            if (c851860XbM != null) {
                                str2 = c851860XbM.LIZ;
                            }
                            c1233790iDB2 = new C1233790iDB(true, false, enumC1233840iDG, str2, false, false, 50);
                        }
                        linkedHashMap.put(enumC1233840iDG, c1233790iDB2);
                        list.add("mobile_sms_verify");
                    }
                    awS1S2211000_192.invoke();
                }
            });
        }
        return Unit.LIZ;
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public AwS1S2211000_19(int r3, com.ss.android.ugc.aweme.account.login.twostep.TwoStepVerificationActivityViewModel r4, java.lang.String r5, java.lang.String r6, java.util.List r7, boolean r8, int r9) {
        /*
            r2 = this;
            r2.$t = r9
            if (r9 == 0) goto L16
            r1 = r2
            r1.l2 = r4
            r1.l3 = r7
            r1.s0 = r5
            r1.z4 = r8
            r1.s1 = r6
            r1.i5 = r3
            r0 = 0
        L12:
            r1.<init>(r0)
            return
        L16:
            r1 = r2
            r1.l2 = r4
            r1.s0 = r5
            r1.z4 = r8
            r1.s1 = r6
            r1.l3 = r7
            r1.i5 = r3
            r0 = 0
            goto L12
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS1S2211000_19.<init>(int, com.ss.android.ugc.aweme.account.login.twostep.TwoStepVerificationActivityViewModel, java.lang.String, java.lang.String, java.util.List, boolean, int):void");
    }
}
