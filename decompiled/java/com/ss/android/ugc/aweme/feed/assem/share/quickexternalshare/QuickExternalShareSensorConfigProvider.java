package com.ss.android.ugc.aweme.feed.assem.share.quickexternalshare;

import X.AbstractC1387105bp;
import X.C2097608Jq;
import X.C608880NuQ;
import X.C608920NuU;
import X.C608940NuW;
import X.C608970NuZ;
import X.C608980Nua;
import X.C704830Rkn;
import X.InterfaceC1364105Vn;
import X.InterfaceC1631620sYq;
import X.InterfaceC702490Rh1;
import X.InterfaceC702540Rh6;
import androidx.lifecycle.Lifecycle;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.feed.platform.cell.interact.next.standardized.condition.IStandardConfigProvider;
import java.lang.ref.WeakReference;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS588S0100000_9;

/* JADX INFO: loaded from: classes10.dex */
public final class QuickExternalShareSensorConfigProvider implements IStandardConfigProvider {
    @Override // com.ss.android.ugc.feed.platform.cell.interact.next.standardized.condition.IStandardConfigProvider
    public final Map<String, Function1<WeakReference<C704830Rkn>, InterfaceC1631620sYq<VideoItemParams, Map<String, ? extends Object>, InterfaceC1364105Vn<? super AbstractC1387105bp>, Object>>> I5() {
        return C2097608Jq.LJIIIIZZ(new Pair("bottom_button_quick_external_share_click", new C608920NuU()), new Pair("bottom_button_quick_external_share_expose", new C608880NuQ()), new Pair("bottom_button_quick_external_share_will_update", new C608970NuZ()));
    }

    @Override // com.ss.android.ugc.feed.platform.cell.interact.next.standardized.condition.IStandardConfigProvider
    public final Function2<WeakReference<C704830Rkn>, String, Map<String, String>> ak() {
        return null;
    }

    @Override // com.ss.android.ugc.feed.platform.cell.interact.next.standardized.condition.IStandardConfigProvider
    public final String o7() {
        return "bottom_button_quick_external_share";
    }

    @Override // com.ss.android.ugc.feed.platform.cell.interact.next.standardized.condition.IStandardConfigProvider
    public final Function1<WeakReference<C704830Rkn>, Function2<Map<String, Object>, Function0<Unit>, Unit>> Ca() {
        return new AwS588S0100000_9(this, 89);
    }

    @Override // com.ss.android.ugc.feed.platform.cell.interact.next.standardized.condition.IStandardConfigProvider
    public final Function1<WeakReference<C704830Rkn>, InterfaceC702540Rh6> g3() {
        return new C608940NuW();
    }

    @Override // com.ss.android.ugc.feed.platform.cell.interact.next.standardized.condition.IStandardConfigProvider
    public final Function1<Lifecycle, InterfaceC702490Rh1<? extends Object>> h1() {
        return new C608980Nua();
    }

    /* JADX WARN: Removed duplicated region for block: B:72:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0140  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LIZ(X.C704830Rkn r8, com.ss.android.ugc.aweme.feed.assem.share.quickexternalshare.QuickExternalShareVM r9, java.util.Map r10) {
        /*
            Method dump skipped, instruction units count: 323
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.feed.assem.share.quickexternalshare.QuickExternalShareSensorConfigProvider.LIZ(X.0Rkn, com.ss.android.ugc.aweme.feed.assem.share.quickexternalshare.QuickExternalShareVM, java.util.Map):void");
    }
}
