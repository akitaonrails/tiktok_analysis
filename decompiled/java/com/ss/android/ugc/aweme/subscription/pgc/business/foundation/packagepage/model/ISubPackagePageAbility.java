package com.ss.android.ugc.aweme.subscription.pgc.business.foundation.packagepage.model;

import X.C0KC4;
import X.C0KCH;
import X.C0KDT;
import X.C0KDZ;
import X.InterfaceC494301wD;
import com.ss.android.ugc.aweme.subscription.pgc.api.PGCSubscriptionProductDetailWithTemplateInfo;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes8.dex */
public interface ISubPackagePageAbility extends InterfaceC494301wD {
    void Hc(String str);

    void Io(Function1<? super C0KDT, Unit> function1);

    C0KC4 Ku();

    void Z8(Function2<? super C0KCH, ? super Pair<String, ? extends List<PGCSubscriptionProductDetailWithTemplateInfo>>, Unit> function2);

    void cu(Function1<? super Pair<String, ? extends List<PGCSubscriptionProductDetailWithTemplateInfo>>, Unit> function1);

    PGCSubscriptionProductDetailWithTemplateInfo e7();

    C0KDZ hd();

    void js1(PGCSubscriptionProductDetailWithTemplateInfo pGCSubscriptionProductDetailWithTemplateInfo);

    void xa(Function1<? super C0KCH, Unit> function1);
}
