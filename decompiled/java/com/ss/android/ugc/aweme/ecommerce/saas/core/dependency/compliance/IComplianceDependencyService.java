package com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.compliance;

import X.C1887750zDx;
import X.EnumC992703uP;
import X.InterfaceC1631620sYq;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import com.ss.android.ugc.aweme.ecommerce.saas.core.IECommerceHostService;
import java.util.List;
import kotlin.Unit;

/* JADX INFO: loaded from: classes2.dex */
public interface IComplianceDependencyService extends IECommerceHostService {
    boolean addSystemCalendarEvent(Activity activity, long j, long j2, String str);

    Bundle appendDataFlowId(Bundle bundle, EnumC992703uP enumC992703uP);

    Bundle appendDataFlowId(Bundle bundle, String str);

    void appendDataFlowId(Intent intent, int i);

    void triggerComplianceCheck(View view, String str, Object obj);

    void updatePNSConsentStatus(List<C1887750zDx> list, String str, boolean z, InterfaceC1631620sYq<? super Boolean, ? super Integer, ? super String, Unit> interfaceC1631620sYq);
}
