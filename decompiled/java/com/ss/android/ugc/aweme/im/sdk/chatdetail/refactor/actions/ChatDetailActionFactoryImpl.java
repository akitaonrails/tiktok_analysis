package com.ss.android.ugc.aweme.im.sdk.chatdetail.refactor.actions;

import X.C0Z28;
import X.C1722006ok;
import X.C1A23;
import X.C1A24;
import X.C890990YxN;
import X.C893020Z1o;
import X.C893960Z5e;
import android.app.Activity;
import com.ss.android.ugc.aweme.im.saas.host.api.feature.push.PushFeature;
import com.ss.android.ugc.aweme.im.sdk.chatdetail.refactor.data.IChatDetailActionFactory;
import com.ss.android.ugc.aweme.im.service.analytics.IIMAnalyticsUtil;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS187S0000000_2;
import kotlin.jvm.internal.AFwS201S0000000_14;
import kotlin.jvm.internal.AFwS298S0000000_14;
import kotlin.jvm.internal.AwS124S1000000_14;
import kotlin.jvm.internal.AwS185S1100000_2;
import kotlin.jvm.internal.AwS628S0100000_14;

/* JADX INFO: loaded from: classes3.dex */
public final class ChatDetailActionFactoryImpl implements IChatDetailActionFactory {
    /* JADX WARN: Type inference failed for: r0v0, types: [X.0Z5e] */
    @Override // com.ss.android.ugc.aweme.im.sdk.chatdetail.refactor.data.IChatDetailActionFactory
    public final C893960Z5e LIZ(Function1 function1) {
        return new C1A23(function1) { // from class: X.0Z5e
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(new C2172771A1r(new C06WA() { // from class: X.0Z5f
                }, R.string.s65, R.raw.icon_flag, null, 0 == true ? 1 : 0, true, 0 == true ? 1 : 0, 1720), AFwS201S0000000_14.get$arr$(368), new AwS628S0100000_14(function1, (Function1<? super Activity, Unit>) 48), null, null, 56);
            }
        };
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.0Z1o] */
    @Override // com.ss.android.ugc.aweme.im.sdk.chatdetail.refactor.data.IChatDetailActionFactory
    public final C893020Z1o LIZLLL(String str, Function1 function1) {
        return new C0Z28(str, function1) { // from class: X.0Z1o
            public final Function1<Boolean, Unit> LLJILJILJ;

            /* JADX WARN: Multi-variable type inference failed */
            {
                super(new C2172711A1l(C06W9.LIZ, 2131835250, R.raw.icon_arrow_to_top), AFwS201S0000000_14.get$arr$(367), new AwS185S1100000_2(str, (String) function1, (Function1<? super Boolean, Unit>) 3), AFwS298S0000000_14.get$arr$(7));
                this.LLJILJILJ = function1;
            }
        };
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.06ok] */
    @Override // com.ss.android.ugc.aweme.im.sdk.chatdetail.refactor.data.IChatDetailActionFactory
    public final C1722006ok LIZIZ(String str, String str2, String str3) {
        return new C1A24(str, str3, str2) { // from class: X.06ok
            {
                super(new C894370Z6t(new C06WA() { // from class: X.06ol
                }, 2131832149, R.raw.icon_magnifying_glass_fill), AFwS187S0000000_2.get$arr$(866), new C1721906oj(str, str2, str3), null, 56);
            }
        };
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.0YxN] */
    @Override // com.ss.android.ugc.aweme.im.sdk.chatdetail.refactor.data.IChatDetailActionFactory
    public final C890990YxN LIZJ(String str, boolean z, boolean z2) {
        return new C1A23(str, z, z2) { // from class: X.0YxN
            /* JADX WARN: Multi-variable type inference failed */
            {
                Map<String, String> mapLIZJ;
                C1695706kV c1695706kV = C1695706kV.LIZ;
                int i = 2131830933;
                int i2 = R.raw.icon_sound_sync;
                String str2 = null;
                Object[] objArr = 0;
                boolean z3 = true;
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                IIMAnalyticsUtil.LIZ.getClass();
                IIMAnalyticsUtil iIMAnalyticsUtilLIZ = C893580Z3s.LIZ();
                String strLIZ = (iIMAnalyticsUtilLIZ == null || (strLIZ = iIMAnalyticsUtilLIZ.LIZ(str)) == null) ? "" : strLIZ;
                PushFeature pushFeatureLIZ = PushFeature.LIZ.LIZ();
                linkedHashMap.putAll((pushFeatureLIZ == null || (mapLIZJ = pushFeatureLIZ.LIZJ(str, strLIZ)) == null) ? C2097608Jq.LJ() : mapLIZJ);
                super(new C2172771A1r(c1695706kV, i, i2, str2, objArr == true ? 1 : 0, z3, new C891240Yxm(linkedHashMap), 952), new C891020YxQ(str, z), new AwS124S1000000_14(str, 0), new C890980YxM(str, z2, z), null, 48);
            }
        };
    }
}
