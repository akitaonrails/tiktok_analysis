package com.ss.android.ugc.aweme.compliance.protection.routeraction;

import X.C098200Yq;
import X.C1440005kM;
import X.C1571830r0P;
import X.C15YW;
import X.C189200o6;
import X.EnumC20538815Yk;
import X.EnumC20542815Zy;
import X.EnumC20542915Zz;
import android.content.Context;
import android.os.Bundle;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.bytedance.router.route.IRouteAction;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.compliance.api.model.DailyScreenTimeMeditation;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.internal.AwS567S0100000_23;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes32.dex */
public final class DailyScreenTimeRouterAction implements IRouteAction {
    @Override // com.bytedance.router.route.IRouteAction
    public final Object open(Context context, String str, Bundle bundle) {
        Object c098200Yq;
        String string;
        String string2;
        EnumC20542815Zy next;
        EnumC20542915Zz next2;
        if (context != null && bundle != null) {
            try {
                string = bundle.getString("type");
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                c098200Yq = new C098200Yq(th);
                C189200o6.m2constructorimpl(c098200Yq);
            }
            if (string != null && (string2 = bundle.getString("seconds")) != null) {
                int i = CastIntegerProtector.parseInt(string2);
                String string3 = bundle.getString("type_id");
                if (string3 != null) {
                    int i2 = CastIntegerProtector.parseInt(string3);
                    String string4 = bundle.getString("count");
                    if (string4 != null) {
                        int i3 = CastIntegerProtector.parseInt(string4);
                        String string5 = bundle.getString("button_type");
                        if (string5 != null) {
                            int i4 = CastIntegerProtector.parseInt(string5);
                            EnumC20542815Zy.Companion.getClass();
                            Iterator<EnumC20542815Zy> it2 = EnumC20542815Zy.getEntries().iterator();
                            while (true) {
                                if (it2.hasNext()) {
                                    next = it2.next();
                                    if (Intrinsics.LJFF(string, next.getS())) {
                                        break;
                                    }
                                } else {
                                    next = EnumC20542815Zy.BREATH;
                                    break;
                                }
                            }
                            Integer numValueOf = Integer.valueOf(i);
                            Integer numValueOf2 = Integer.valueOf(i2);
                            Integer numValueOf3 = Integer.valueOf(i3);
                            EnumC20542915Zz.Companion.getClass();
                            Iterator<EnumC20542915Zz> it3 = EnumC20542915Zz.getEntries().iterator();
                            while (true) {
                                if (it3.hasNext()) {
                                    next2 = it3.next();
                                    if (i4 == next2.getI()) {
                                        break;
                                    }
                                } else {
                                    next2 = EnumC20542915Zz.RETURN_BUTTON_FIRST;
                                    break;
                                }
                            }
                            DailyScreenTimeMeditation dailyScreenTimeMeditation = new DailyScreenTimeMeditation(next, numValueOf, numValueOf2, numValueOf3, next2);
                            C15YW.LIZ.getClass();
                            C15YW.LJIIIZ = dailyScreenTimeMeditation;
                            new AwS567S0100000_23(dailyScreenTimeMeditation, 107);
                            C1440005kM.LIZ(new C1571830r0P(EnumC20538815Yk.DAILY_SCREEN_TIME, "try_show_daily_screen_time"));
                            c098200Yq = Unit.LIZ;
                            C189200o6.m2constructorimpl(c098200Yq);
                            C189200o6.m5exceptionOrNullimpl(c098200Yq);
                        }
                    }
                }
            }
        }
        return Unit.LIZ;
    }
}
