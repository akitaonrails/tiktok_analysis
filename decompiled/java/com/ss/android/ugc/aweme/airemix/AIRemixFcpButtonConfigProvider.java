package com.ss.android.ugc.aweme.airemix;

import X.AbstractC1387105bp;
import X.C2097608Jq;
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
import kotlin.jvm.internal.AFwS239S0000000_8;
import kotlin.jvm.internal.AwS587S0100000_8;

/* JADX INFO: loaded from: classes9.dex */
public final class AIRemixFcpButtonConfigProvider implements IStandardConfigProvider {
    public final String LL = "bottom_button_ai_remix_detail_page";

    @Override // com.ss.android.ugc.feed.platform.cell.interact.next.standardized.condition.IStandardConfigProvider
    public final Function1<WeakReference<C704830Rkn>, Function2<Map<String, Object>, Function0<Unit>, Unit>> Ca() {
        return null;
    }

    @Override // com.ss.android.ugc.feed.platform.cell.interact.next.standardized.condition.IStandardConfigProvider
    public final Map<String, Function1<WeakReference<C704830Rkn>, InterfaceC1631620sYq<VideoItemParams, Map<String, ? extends Object>, InterfaceC1364105Vn<? super AbstractC1387105bp>, Object>>> I5() {
        return C2097608Jq.LJIIIIZZ(new Pair("bottom_button_remix_this_button_show", new AwS587S0100000_8(this, 31)), new Pair("bottom_button_remix_this_button_click", new AwS587S0100000_8(this, 32)));
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
    public final Function1<Lifecycle, InterfaceC702490Rh1<? extends Object>> h1() {
        return AFwS239S0000000_8.get$arr$(25);
    }

    @Override // com.ss.android.ugc.feed.platform.cell.interact.next.standardized.condition.IStandardConfigProvider
    public final String o7() {
        return this.LL;
    }
}
