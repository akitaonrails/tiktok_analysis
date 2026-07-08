package com.ss.android.ugc.aweme.ecommerce.search.vision.record.history.vm;

import X.C09HH;
import X.C09HL;
import X.C13LP;
import X.C1A3P;
import X.C1A3R;
import X.C1A3S;
import X.C1A3T;
import X.C1A3W;
import X.C21615319iZ;
import X.C675940QfI;
import android.content.Context;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.bytedance.als.h0;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.vision.model.PhotoSearchEnterParams;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS399S0200000_33;
import kotlin.jvm.internal.AwS434S0200000_33;
import kotlin.jvm.internal.AwS612S0100000_33;

/* JADX INFO: loaded from: classes34.dex */
public final class HistoryRecordPageVM extends ViewModel {
    public static final /* synthetic */ int LLIZ = 0;
    public Integer LLILLL;
    public PhotoSearchEnterParams LLILZ;
    public boolean LLILZIL;
    public final List<C1A3S> LL = new ArrayList();
    public final h0<Integer> LLILLJJLI = new h0<>(0);
    public long LLILZLL = System.currentTimeMillis();

    public final C1A3S vQ2() {
        return wQ2(this.LLILLJJLI.LIZJ().intValue());
    }

    public static String yQ2(C1A3S c1a3s) {
        h0<C1A3T> h0Var;
        C1A3T c1a3tLIZJ;
        if (c1a3s != null && (h0Var = c1a3s.LJIIJJI) != null && (c1a3tLIZJ = h0Var.LIZJ()) != null && C1A3W.LIZ[c1a3tLIZJ.ordinal()] == 1) {
            return CardStruct.IStatusCode.DEFAULT;
        }
        return "1";
    }

    public final C1A3S wQ2(int i) {
        return (C1A3S) C13LP.LJJJLZIJ(i, this.LL);
    }

    public final void xQ2(Context context) {
        for (String str : (String[]) C21615319iZ.LIZIZ.getValue()) {
            List<C1A3S> list = this.LL;
            C1A3S c1a3sLIZ = C09HL.LIZ(context, str);
            c1a3sLIZ.LJIIJ.LIZ = Long.valueOf(this.LLILZLL);
            c1a3sLIZ.LJIIJ.LIZIZ = Long.valueOf(System.currentTimeMillis());
            ((ArrayList) list).add(c1a3sLIZ);
        }
    }

    public final void zQ2(Context context, C1A3S c1a3s, C1A3P c1a3p, boolean z, Function2<? super C1A3T, ? super C09HH, Unit> function2) {
        c1a3s.LJIIJJI.LJII(C1A3T.LOADING);
        c1a3s.LJIIIZ = c1a3p;
        c1a3s.LJIIJ.LIZJ = Long.valueOf(System.currentTimeMillis());
        AwS434S0200000_33 awS434S0200000_33 = new AwS434S0200000_33(context, c1a3s, function2, 76);
        C675940QfI.LIZ(new AwS612S0100000_33(c1a3s, 58));
        c1a3s.LJIIIIZZ.LIZIZ(ViewModelKt.getViewModelScope(this), c1a3p, new C1A3R(z, c1a3s, function2, this, context, awS434S0200000_33), new AwS399S0200000_33(c1a3s, awS434S0200000_33, 7));
    }
}
