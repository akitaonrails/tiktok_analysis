package com.ss.android.ugc.aweme.im.sdk.chat.ui.slots;

import X.C06W7;
import X.C0I0B;
import X.C0ZDX;
import X.C1397510mTF;
import X.C1397580mTM;
import X.C1671906gf;
import X.C869590Y9l;
import X.C985403tE;
import Y.ARunnableS102S0100000_2;
import android.content.Context;
import android.view.View;
import com.ss.android.ugc.aweme.im.messagelist.api.ability.MessageListResendMessageAbility;
import com.ss.android.ugc.aweme.im.reminduser.api.IRemindUsersAnalytics;
import com.ss.android.ugc.aweme.im.saas.host.api.feature.privacy.PrivacySettingsFeature;
import kotlin.jvm.internal.AwS24S0102000_2;
import kotlin.jvm.internal.AwS581S0100000_2;

/* JADX INFO: loaded from: classes3.dex */
public final class DefaultResendMessageHandler implements MessageListResendMessageAbility {
    @Override // com.ss.android.ugc.aweme.im.messagelist.api.ability.MessageListResendMessageAbility
    public final void MI(View view, C869590Y9l c869590Y9l) {
        if (!C0ZDX.LJJJJIZL(c869590Y9l)) {
            return;
        }
        Context context = view.getContext();
        ARunnableS102S0100000_2 aRunnableS102S0100000_2 = new ARunnableS102S0100000_2(c869590Y9l, 29);
        if (C06W7.LIZIZ(context)) {
            C1397580mTM c1397580mTM = new C1397580mTM(context);
            c1397580mTM.LIZ(2131835717);
            C985403tE.LIZ(c1397580mTM, new AwS24S0102000_2(aRunnableS102S0100000_2, 3));
            c1397580mTM.LIZLLL(new AwS581S0100000_2(c869590Y9l, 500));
            new C1397510mTF(c1397580mTM).LIZLLL();
            IRemindUsersAnalytics.LIZ.getClass();
            IRemindUsersAnalytics iRemindUsersAnalyticsLIZ = C1671906gf.LIZ();
            if (iRemindUsersAnalyticsLIZ != null) {
                iRemindUsersAnalyticsLIZ.LJFF(c869590Y9l, null, C0I0B.LJFF.LIZIZ());
            }
        }
        IRemindUsersAnalytics.LIZ.getClass();
        IRemindUsersAnalytics iRemindUsersAnalyticsLIZ2 = C1671906gf.LIZ();
        if (iRemindUsersAnalyticsLIZ2 != null) {
            iRemindUsersAnalyticsLIZ2.LIZJ(c869590Y9l, true, PrivacySettingsFeature.LIZ.LIZ(), C0I0B.LJFF.LIZIZ());
        }
    }
}
