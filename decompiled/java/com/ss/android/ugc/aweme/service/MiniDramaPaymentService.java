package com.ss.android.ugc.aweme.service;

import X.C1155860gBU;
import X.C11JF;
import X.C1612200s3W;
import X.C1612570s47;
import X.C1612600s4A;
import X.C1612700s4K;
import X.C1613010s4p;
import X.C1613360s5O;
import X.C1613540s5g;
import X.C1614180s6i;
import X.EnumC1612690s4J;
import X.EnumC1612760s4Q;
import X.EnumC1613440s5W;
import X.InterfaceC1614350s6z;
import android.content.Context;
import android.os.Bundle;
import androidx.fragment.app.FragmentManager;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.SeriesCategory;
import com.ss.android.ugc.aweme.model.CollectionDetailModel;
import com.ss.android.ugc.aweme.series.payment.fragment.SeriesRefundFragment;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS138S1100000_24;
import kotlin.jvm.internal.AwS568S0100000_24;

/* JADX INFO: loaded from: classes25.dex */
public interface MiniDramaPaymentService {
    void LIZ(InterfaceC1614350s6z interfaceC1614350s6z);

    TuxSheet LIZIZ(FragmentManager fragmentManager, C1612700s4K c1612700s4K, CollectionDetailModel collectionDetailModel, Function0 function0);

    void LIZJ();

    void LIZLLL(Aweme aweme);

    void LJ(EnumC1613440s5W enumC1613440s5W, Long l);

    C1613540s5g LJFF(Context context, long j, Long l, String str, EnumC1612760s4Q enumC1612760s4Q, EnumC1612690s4J enumC1612690s4J, SeriesCategory seriesCategory, String str2, String str3, C1613010s4p c1613010s4p, String str4, C1613360s5O c1613360s5O, C1612600s4A c1612600s4A, C1612570s47 c1612570s47);

    boolean LJI();

    TuxSheet LJII(FragmentManager fragmentManager, C1614180s6i c1614180s6i, C1612200s3W c1612200s3W, Function0 function0, Function0 function02);

    void LJIIIIZZ(Context context, String str, Map<String, ? extends Object> map, Function1<? super C1155860gBU, Unit> function1);

    C1613540s5g LJIIIZ(Context context, long j, Map map, String str, EnumC1612690s4J enumC1612690s4J, SeriesCategory seriesCategory, String str2, String str3, C1613010s4p c1613010s4p, String str4, C1613360s5O c1613360s5O, C1612600s4A c1612600s4A, C1612570s47 c1612570s47);

    void LJIIJ(InterfaceC1614350s6z interfaceC1614350s6z);

    SeriesRefundFragment LJIIJJI(CollectionDetailModel collectionDetailModel, Bundle bundle);

    C11JF LJIIL(long j, int i, String str, AwS568S0100000_24 awS568S0100000_24, AwS138S1100000_24 awS138S1100000_24, AwS138S1100000_24 awS138S1100000_242);
}
