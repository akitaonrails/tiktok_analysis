package com.bytedance.android.livesdk.comp.impl.subscription.business.foundation.packagepage.model;

import X.C513700KCq;
import X.C514600KGc;
import X.C514770KGt;
import X.EnumC513810KDb;
import X.InterfaceC494301wD;
import com.bytedance.android.livesdk.subscribe.model.SubscriptionProductDetailWithTemplateInfo;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes8.dex */
public interface ISubPackagePageAbility extends InterfaceC494301wD {
    void Hc(String str);

    void Io(Function1<? super C514770KGt, Unit> function1);

    C513700KCq Ku();

    void WA(SubscriptionProductDetailWithTemplateInfo subscriptionProductDetailWithTemplateInfo);

    void Z8(Function2<? super C514600KGc, ? super Pair<String, ? extends List<SubscriptionProductDetailWithTemplateInfo>>, Unit> function2);

    void cu(Function1<? super Pair<String, ? extends List<SubscriptionProductDetailWithTemplateInfo>>, Unit> function1);

    SubscriptionProductDetailWithTemplateInfo e7();

    EnumC513810KDb hd();

    void xa(Function1<? super C514600KGc, Unit> function1);
}
