package com.ss.android.ugc.aweme.music.v2.assem;

import X.AbstractC738140SxQ;
import X.C0RUV;
import X.C13IQ;
import X.C2097608Jq;
import X.C297120Bkk;
import X.C418440Gaw;
import X.C628830OlV;
import X.C723850SaN;
import X.C814420VxA;
import android.view.View;
import com.ss.android.ugc.aweme.detail.prefab.HeaderBasicInfoAssem;
import com.zhiliaoapp.musically.R;
import java.util.Map;
import kotlin.Pair;

/* JADX INFO: loaded from: classes7.dex */
public final class MusicHeaderBasicInfoAssem extends HeaderBasicInfoAssem {
    public static final Map<String, Integer> LLJJIII = C2097608Jq.LJIIIIZZ(new Pair("cover", Integer.valueOf(R.id.cover)), new Pair("desc", Integer.valueOf(R.id.desc)), new Pair("pugc_play_loading", Integer.valueOf(R.id.shw)), new Pair("pugc_play", Integer.valueOf(R.id.shv)));

    @Override // com.ss.android.ugc.aweme.detail.prefab.HeaderBasicInfoAssem, com.bytedance.assem.arch.view.UISlotAssem
    public final int Co() {
        return R.layout.dpt;
    }

    @Override // com.ss.android.ugc.aweme.detail.prefab.HeaderBasicInfoAssem, com.bytedance.assem.arch.dynamic.DynamicAssem
    public final Map<String, Integer> kp() {
        return LLJJIII;
    }

    @Override // com.bytedance.assem.arch.dynamic.DynamicAssem, com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void didUpdateConfig(C0RUV<? extends AbstractC738140SxQ> c0ruv) {
        C628830OlV c628830OlV;
        C628830OlV c628830OlV2;
        C13IQ<? extends T> c13iq;
        super.didUpdateConfig(c0ruv);
        if ((c0ruv instanceof C628830OlV) && (c628830OlV = (C628830OlV) c0ruv) != null && (c628830OlV2 = c628830OlV.LLJILJIL.get("pugc_play_loading")) != null && (c13iq = c628830OlV2.LL) != 0) {
            C723850SaN.LJII(this, c13iq, null);
        }
    }

    @Override // com.ss.android.ugc.aweme.detail.prefab.HeaderBasicInfoAssem, com.bytedance.assem.arch.dynamic.DynamicAssem, com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        if (C297120Bkk.LIZ()) {
            view.findViewById(R.id.ovj).setPaddingRelative(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(10)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(10)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8)));
        }
    }
}
