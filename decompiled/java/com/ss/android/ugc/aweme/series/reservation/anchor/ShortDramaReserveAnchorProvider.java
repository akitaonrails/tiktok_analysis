package com.ss.android.ugc.aweme.series.reservation.anchor;

import X.AbstractC1387105bp;
import X.C01GW;
import X.C085L;
import X.C11NJ;
import X.C2097608Jq;
import X.C2344009Gk;
import X.C452501pT;
import X.C704830Rkn;
import X.EnumC1430380nKG;
import X.InterfaceC1364105Vn;
import X.InterfaceC1631620sYq;
import X.InterfaceC702490Rh1;
import X.InterfaceC702540Rh6;
import android.app.Activity;
import android.os.Looper;
import androidx.lifecycle.Lifecycle;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.series.reservation.model.ShortDramaReserveExtraModel;
import com.ss.android.ugc.feed.platform.cell.interact.next.standardized.condition.IStandardConfigProvider;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS187S0000000_2;
import kotlin.jvm.internal.AwS603S0100000_24;

/* JADX INFO: loaded from: classes25.dex */
public final class ShortDramaReserveAnchorProvider implements IStandardConfigProvider {
    public final C01GW LL = C452501pT.LIZIZ(AFwS187S0000000_2.get$arr$(627));
    public final ConcurrentHashMap<Long, WeakReference<Aweme>> LLILLJJLI = new ConcurrentHashMap<>();
    public final ConcurrentHashMap<Long, Boolean> LLILLL = new ConcurrentHashMap<>();
    public final WeakHashMap<Activity, C085L> LLILZ = new WeakHashMap<>();
    public final WeakHashMap<Activity, C11NJ> LLILZIL = new WeakHashMap<>();
    public final BPEAHandler LLILZLL = new BPEAHandler(Looper.getMainLooper());

    @Override // com.ss.android.ugc.feed.platform.cell.interact.next.standardized.condition.IStandardConfigProvider
    public final Map<String, Function1<WeakReference<C704830Rkn>, InterfaceC1631620sYq<VideoItemParams, Map<String, ? extends Object>, InterfaceC1364105Vn<? super AbstractC1387105bp>, Object>>> I5() {
        return C2097608Jq.LJIIIIZZ(new Pair("biz_show_drama_reserve_event_cta_event", new AwS603S0100000_24(this, 246)), new Pair("biz_click_drama_reserve_event_cta_event", new AwS603S0100000_24(this, 247)));
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
        return null;
    }

    @Override // com.ss.android.ugc.feed.platform.cell.interact.next.standardized.condition.IStandardConfigProvider
    public final String o7() {
        return "anchor_mini_drama_reservation";
    }

    @Override // com.ss.android.ugc.feed.platform.cell.interact.next.standardized.condition.IStandardConfigProvider
    public final Function1<WeakReference<C704830Rkn>, Function2<Map<String, Object>, Function0<Unit>, Unit>> Ca() {
        return new AwS603S0100000_24(this, 248);
    }

    public final boolean LIZIZ(ShortDramaReserveExtraModel shortDramaReserveExtraModel) {
        Boolean bool = this.LLILLL.get(Long.valueOf(shortDramaReserveExtraModel.getCollectionId()));
        if (bool != null) {
            return bool.booleanValue();
        }
        return shortDramaReserveExtraModel.isReserved();
    }

    public final ShortDramaReserveExtraModel LIZJ(Aweme aweme) {
        AnchorCommonStruct next;
        Gson gson = (Gson) this.LL.getValue();
        List<AnchorCommonStruct> anchors = aweme.getAnchors();
        if (anchors != null) {
            Iterator<AnchorCommonStruct> it2 = anchors.iterator();
            while (true) {
                if (it2.hasNext()) {
                    next = it2.next();
                    if (next.getType() == EnumC1430380nKG.SHORT_DRAMA_RESERVE.getTYPE()) {
                        break;
                    }
                } else {
                    next = null;
                    break;
                }
            }
            AnchorCommonStruct anchorCommonStruct = next;
            if (anchorCommonStruct != null) {
                try {
                    return (ShortDramaReserveExtraModel) gson.LJII(anchorCommonStruct.getExtra(), ShortDramaReserveExtraModel.class);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                }
            }
        }
        return null;
    }

    public static C2344009Gk LIZ(Aweme aweme, ShortDramaReserveExtraModel shortDramaReserveExtraModel, String str) {
        long collectionId;
        Map<String, String> logExtra;
        String uid;
        C2344009Gk c2344009Gk = new C2344009Gk();
        String str2 = "";
        if (str == null) {
            str = "";
        }
        c2344009Gk.LJIIIIZZ("enter_from", str);
        c2344009Gk.LJIIIIZZ("enter_method", "series_register_anchor");
        String aid = aweme.getAid();
        if (aid == null) {
            aid = "";
        }
        c2344009Gk.LJIIIIZZ("group_id", aid);
        User author = aweme.getAuthor();
        if (author != null && (uid = author.getUid()) != null) {
            str2 = uid;
        }
        c2344009Gk.LJIIIIZZ("author_id", str2);
        if (shortDramaReserveExtraModel != null) {
            collectionId = shortDramaReserveExtraModel.getCollectionId();
        } else {
            collectionId = 0;
        }
        c2344009Gk.LJIIIIZZ("collection_id", String.valueOf(collectionId));
        c2344009Gk.LJIIIIZZ("anchor_type", "paid_collections");
        c2344009Gk.LJIIIIZZ("series_anchor_type", "series_register");
        c2344009Gk.LJIIIIZZ("series_video_type", "9");
        if (shortDramaReserveExtraModel != null && (logExtra = shortDramaReserveExtraModel.getLogExtra()) != null) {
            for (Map.Entry<String, String> entry : logExtra.entrySet()) {
                c2344009Gk.LJFF(entry.getKey(), entry.getValue());
            }
        }
        return c2344009Gk;
    }
}
