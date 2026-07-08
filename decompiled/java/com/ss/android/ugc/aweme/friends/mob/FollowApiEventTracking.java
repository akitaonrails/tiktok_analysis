package com.ss.android.ugc.aweme.friends.mob;

import X.C20684815ws;
import X.C2344009Gk;
import com.ss.android.ugc.aweme.friends.event.IFollowApiEventReporter;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class FollowApiEventTracking implements IFollowApiEventReporter {
    @Override // com.ss.android.ugc.aweme.friends.event.IFollowApiEventReporter
    public final void LIZ(long j, Integer num, Integer num2, String str, String str2, String str3, boolean z) {
        String str4;
        String str5;
        int iIntValue;
        if (!z) {
            str4 = "fail";
        } else {
            str4 = "success";
        }
        if (num == null) {
            str5 = "unknown";
        } else if (num.intValue() == 0) {
            str5 = "unfollow";
        } else {
            str5 = "follow";
        }
        long j2 = -1;
        if (j != 0) {
            long jCurrentTimeMillis = System.currentTimeMillis() - j;
            if (jCurrentTimeMillis >= -1) {
                j2 = jCurrentTimeMillis;
            }
        }
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("type", str5);
        c2344009Gk.LJIIIIZZ("result", str4);
        c2344009Gk.LIZLLL(j2, "duration");
        c2344009Gk.LJIIIIZZ("event_type", str);
        c2344009Gk.LJIIIIZZ("logid", str3);
        if (Intrinsics.LJFF(str4, "fail")) {
            if (num2 != null) {
                iIntValue = num2.intValue();
            } else {
                iIntValue = -1;
            }
            c2344009Gk.LIZJ(iIntValue, "error_code");
            if (str2 == null) {
                str2 = "UnknownReason";
            }
            c2344009Gk.LJFF("error_reason", str2);
        }
        C20684815ws.LJIILLIIL("follow_result", c2344009Gk.LIZ);
    }
}
