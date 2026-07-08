package com.ss.android.ugc.aweme.im.service.analytics;

import X.C051M;
import X.C05O2;
import X.C06W7;
import X.C0W8I;
import X.C0YMW;
import X.C0Z53;
import X.C1388190mED;
import X.C1481605r4;
import X.InterfaceC908320ZkE;
import Y.ARunnableS0S1000000_2;
import Y.ARunnableS83S0200000_14;
import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.util.ArrayMap;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.im.common.model.GroupCheckMsg;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUser;
import com.ss.android.ugc.aweme.im.saas.host.api.im.IMNetworkSaasApi;
import com.ss.android.ugc.aweme.im.saas.host.api.im.utils.IMALogApi;

/* JADX INFO: loaded from: classes15.dex */
public final class IMErrorUtils implements IIMErrorUtils {
    public static final IMErrorUtils LIZIZ = new IMErrorUtils();

    public static final class Service implements IIMErrorUtils {
        public final /* synthetic */ IMErrorUtils LIZIZ = IMErrorUtils.LIZIZ;

        @Override // com.ss.android.ugc.aweme.im.service.analytics.IIMErrorUtils
        public final void LIZ(IMUser iMUser, String str, Integer num, String str2) {
            this.LIZIZ.LIZ(iMUser, str, num, str2);
        }

        @Override // com.ss.android.ugc.aweme.im.service.analytics.IIMErrorUtils
        public final void LIZIZ(Context context) {
            this.LIZIZ.LIZIZ(context);
        }

        @Override // com.ss.android.ugc.aweme.im.service.analytics.IIMErrorUtils
        public final void LIZJ(Context context) {
            this.LIZIZ.LIZJ(context);
        }

        @Override // com.ss.android.ugc.aweme.im.service.analytics.IIMErrorUtils
        public final void LIZLLL(Context context, C0YMW c0ymw) {
            this.LIZIZ.LIZLLL(context, c0ymw);
        }

        @Override // com.ss.android.ugc.aweme.im.service.analytics.IIMErrorUtils
        public final void LJ(Context context) {
            this.LIZIZ.LIZJ(context);
        }
    }

    @Override // com.ss.android.ugc.aweme.im.service.analytics.IIMErrorUtils
    public final void LIZIZ(Context context) {
        InterfaceC908320ZkE networkStateForSharePanel;
        Activity activityLIZ = C1388190mED.LIZ(context);
        if (activityLIZ != null && C06W7.LIZIZ(activityLIZ)) {
            IMNetworkSaasApi.LIZ.getClass();
            IMNetworkSaasApi iMNetworkSaasApiLIZ = C05O2.LIZ();
            if (iMNetworkSaasApiLIZ != null && (networkStateForSharePanel = iMNetworkSaasApiLIZ.getNetworkStateForSharePanel()) != null) {
                C1481605r4.LIZIZ(new ARunnableS83S0200000_14(networkStateForSharePanel, activityLIZ, 9));
                return;
            }
            throw new IllegalArgumentException("Unexpected null IMNetworkSaasApi");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0035  */
    @Override // com.ss.android.ugc.aweme.im.service.analytics.IIMErrorUtils
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZJ(android.content.Context r4) {
        /*
            r3 = this;
            java.lang.Class<com.ss.android.ugc.aweme.im.saas.host.api.im.IMNetworkSaasApi> r0 = com.ss.android.ugc.aweme.im.saas.host.api.im.IMNetworkSaasApi.class
            java.lang.Object r0 = com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt.pluggableSpiForReal(r0)
            com.ss.android.ugc.aweme.im.saas.host.api.im.IMNetworkSaasApi r0 = (com.ss.android.ugc.aweme.im.saas.host.api.im.IMNetworkSaasApi) r0
            if (r0 == 0) goto L35
            X.0ZkB r0 = r0.getNetworkState()
            if (r0 == 0) goto L35
            int[] r1 = X.C908280ZkA.LIZ
            int r0 = r0.ordinal()
            r1 = r1[r0]
            r0 = 1
            if (r1 == r0) goto L31
            r0 = 2
            if (r1 != r0) goto L35
            r0 = 2131832006(0x7f112cc6, float:1.9297054E38)
        L21:
            java.lang.String r1 = r4.getString(r0)
            Y.ARunnableS0S1000000_2 r2 = new Y.ARunnableS0S1000000_2
            r0 = 2
            r2.<init>(r1, r0)
            r0 = 150(0x96, double:7.4E-322)
            X.C1481605r4.LIZ(r0, r2)
            return
        L31:
            r0 = 2131832009(0x7f112cc9, float:1.929706E38)
            goto L21
        L35:
            r0 = 2131848597(0x7f116d95, float:1.9330704E38)
            goto L21
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.im.service.analytics.IMErrorUtils.LIZJ(android.content.Context):void");
    }

    @Override // com.ss.android.ugc.aweme.im.service.analytics.IIMErrorUtils
    public final void LJ(Context context) {
        LIZJ(context);
    }

    @Override // com.ss.android.ugc.aweme.im.service.analytics.IIMErrorUtils
    public final void LIZLLL(Context context, C0YMW c0ymw) {
        String checkMsg;
        String statusMsg;
        if (c0ymw != null && (checkMsg = c0ymw.getCheckMsg()) != null && checkMsg.length() != 0) {
            try {
                GroupCheckMsg groupCheckMsg = (GroupCheckMsg) C051M.LIZIZ(GroupCheckMsg.class, c0ymw.getCheckMsg());
                if (groupCheckMsg != null && (statusMsg = groupCheckMsg.getStatusMsg()) != null && statusMsg.length() != 0) {
                    String statusMsg2 = groupCheckMsg.getStatusMsg();
                    if (statusMsg2 == null) {
                        return;
                    }
                    C1481605r4.LIZ(150L, new ARunnableS0S1000000_2(statusMsg2, 2));
                    return;
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
            LIZJ(context);
            return;
        }
        LIZJ(context);
    }

    @Override // com.ss.android.ugc.aweme.im.service.analytics.IIMErrorUtils
    public final void LIZ(IMUser iMUser, String str, Integer num, String str2) {
        int iIntValue;
        if (iMUser != null) {
            try {
                if (TextUtils.isEmpty(iMUser.getUid())) {
                    ArrayMap arrayMap = new ArrayMap();
                    arrayMap.put("user", iMUser.toString());
                    if (num != null) {
                        iIntValue = num.intValue();
                    } else {
                        iIntValue = -1;
                    }
                    arrayMap.put("key_enter_from", Integer.valueOf(iIntValue));
                    if (str == null) {
                        str = "empty";
                    }
                    arrayMap.put("conversation_id", str);
                    arrayMap.put("error_msg", str2);
                    C0W8I.LIZ.getClass();
                    C0W8I.LJ("empty_user", "im_error_event", arrayMap);
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                IMALogApi.LIZ.getClass();
                IMALogApi iMALogApiLIZ = C0Z53.LIZ();
                if (iMALogApiLIZ != null) {
                    iMALogApiLIZ.logException(e);
                }
            }
        }
    }
}
