package com.ss.android.ugc.aweme.offlinemode.ui.tag;

import X.AbstractC1387105bp;
import X.C0BVO;
import X.C0BVQ;
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
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS240S0000000_9;

/* JADX INFO: loaded from: classes10.dex */
public final class OfflineModeVideoTagProvider implements IStandardConfigProvider {
    @Override // com.ss.android.ugc.feed.platform.cell.interact.next.standardized.condition.IStandardConfigProvider
    public final Function1<WeakReference<C704830Rkn>, Function2<Map<String, Object>, Function0<Unit>, Unit>> Ca() {
        return null;
    }

    @Override // com.ss.android.ugc.feed.platform.cell.interact.next.standardized.condition.IStandardConfigProvider
    public final Map<String, Function1<WeakReference<C704830Rkn>, InterfaceC1631620sYq<VideoItemParams, Map<String, ? extends Object>, InterfaceC1364105Vn<? super AbstractC1387105bp>, Object>>> I5() {
        return null;
    }

    @Override // com.ss.android.ugc.feed.platform.cell.interact.next.standardized.condition.IStandardConfigProvider
    public final Function2<WeakReference<C704830Rkn>, String, Map<String, String>> ak() {
        return null;
    }

    @Override // com.ss.android.ugc.feed.platform.cell.interact.next.standardized.condition.IStandardConfigProvider
    public final Function1<WeakReference<C704830Rkn>, InterfaceC702540Rh6> g3() {
        return null;
    }

    @Override // com.ss.android.ugc.feed.platform.cell.interact.next.standardized.condition.IStandardConfigProvider
    public final String o7() {
        return "high_tag_offline_tag";
    }

    @Override // com.ss.android.ugc.feed.platform.cell.interact.next.standardized.condition.IStandardConfigProvider
    public final Function1<Lifecycle, InterfaceC702490Rh1<? extends Object>> h1() {
        if (C0BVQ.LIZ() && ((Number) C0BVO.LIZ.getValue()).intValue() == 1) {
            return AFwS240S0000000_9.get$arr$(589);
        }
        return null;
    }
}
