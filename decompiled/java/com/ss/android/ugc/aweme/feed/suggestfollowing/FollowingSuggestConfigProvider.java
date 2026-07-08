package com.ss.android.ugc.aweme.feed.suggestfollowing;

import X.AbstractC1387105bp;
import X.C1ECA;
import X.C2097608Jq;
import X.C2445309i7;
import X.C2448109iZ;
import X.C2448209ia;
import X.C2448309ib;
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
import kotlin.jvm.internal.AFwS231S0000000_3;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class FollowingSuggestConfigProvider implements IStandardConfigProvider {
    @Override // com.ss.android.ugc.feed.platform.cell.interact.next.standardized.condition.IStandardConfigProvider
    public final Function1<WeakReference<C704830Rkn>, Function2<Map<String, Object>, Function0<Unit>, Unit>> Ca() {
        return null;
    }

    @Override // com.ss.android.ugc.feed.platform.cell.interact.next.standardized.condition.IStandardConfigProvider
    public final Function2<WeakReference<C704830Rkn>, String, Map<String, String>> ak() {
        return null;
    }

    @Override // com.ss.android.ugc.feed.platform.cell.interact.next.standardized.condition.IStandardConfigProvider
    public final String o7() {
        return "bottom_button_follow_follow";
    }

    @Override // com.ss.android.ugc.feed.platform.cell.interact.next.standardized.condition.IStandardConfigProvider
    public final Map<String, Function1<WeakReference<C704830Rkn>, InterfaceC1631620sYq<VideoItemParams, Map<String, ? extends Object>, InterfaceC1364105Vn<? super AbstractC1387105bp>, Object>>> I5() {
        C1ECA.LIZ.getClass();
        if (C1ECA.LIZJ() || C1ECA.LIZ()) {
            return C2097608Jq.LJIIIIZZ(new Pair("biz_follow_event", new C2448209ia(this)), new Pair("biz_not_interested_event", new C2448309ib(this)));
        }
        return null;
    }

    @Override // com.ss.android.ugc.feed.platform.cell.interact.next.standardized.condition.IStandardConfigProvider
    public final Function1<WeakReference<C704830Rkn>, InterfaceC702540Rh6> g3() {
        C1ECA.LIZ.getClass();
        if (C1ECA.LIZJ() || C1ECA.LIZ()) {
            return new C2448109iZ();
        }
        return null;
    }

    @Override // com.ss.android.ugc.feed.platform.cell.interact.next.standardized.condition.IStandardConfigProvider
    public final Function1<Lifecycle, InterfaceC702490Rh1<? extends Object>> h1() {
        C1ECA.LIZ.getClass();
        if (C1ECA.LIZJ() || C1ECA.LIZ()) {
            return AFwS231S0000000_3.get$arr$(37);
        }
        return null;
    }

    public static void LIZ(VideoItemParams videoItemParams, WeakReference weakReference) {
        C704830Rkn c704830Rkn;
        Map<String, Object> map;
        C704830Rkn c704830Rkn2;
        Map<String, Object> map2;
        Object obj = null;
        if (Intrinsics.LJFF(videoItemParams.mEventType, "homepage_hot")) {
            if (weakReference != null && (c704830Rkn2 = (C704830Rkn) weakReference.get()) != null && (map2 = c704830Rkn2.LJFF) != null) {
                obj = map2.get("KEY_BUTTON_VM");
            }
            if ((obj instanceof FYPFollowingSuggestViewModel) && obj != null) {
                C2445309i7.LJFF(0);
                return;
            }
            return;
        }
        if (weakReference != null && (c704830Rkn = (C704830Rkn) weakReference.get()) != null && (map = c704830Rkn.LJFF) != null) {
            obj = map.get("KEY_FYP_VM");
        }
        if (!(obj instanceof ProfileFollowingSuggestViewModel) || obj == null) {
            return;
        }
        C2445309i7.LJFF(0);
    }
}
