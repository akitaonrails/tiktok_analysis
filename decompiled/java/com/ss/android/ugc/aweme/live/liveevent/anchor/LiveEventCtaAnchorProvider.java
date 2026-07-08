package com.ss.android.ugc.aweme.live.liveevent.anchor;

import X.AbstractC1387105bp;
import X.C01GW;
import X.C13LP;
import X.C1697810uHb;
import X.C2097608Jq;
import X.C452501pT;
import X.C474500IjA;
import X.C497740JfY;
import X.C704830Rkn;
import X.EnumC1430380nKG;
import X.InterfaceC1364105Vn;
import X.InterfaceC1631620sYq;
import X.InterfaceC702490Rh1;
import X.InterfaceC702540Rh6;
import androidx.lifecycle.Lifecycle;
import com.bytedance.android.livesdk.comp.api.event.api.data.LiveEventModule;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import com.google.gson.k;
import com.google.gson.n;
import com.google.gson.p;
import com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.feed.platform.cell.interact.next.standardized.condition.IStandardConfigProvider;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS213S0000000_24;
import kotlin.jvm.internal.AwS603S0100000_24;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes25.dex */
public final class LiveEventCtaAnchorProvider implements IStandardConfigProvider {
    public final C01GW LL = C452501pT.LIZIZ(AFwS213S0000000_24.get$arr$(219));
    public final C01GW LLILLJJLI = C452501pT.LIZIZ(AFwS213S0000000_24.get$arr$(218));
    public final String LLILLL = C497740JfY.LJIJI(2131851060);
    public final String LLILZ = C497740JfY.LJIJI(2131851061);

    @Override // com.ss.android.ugc.feed.platform.cell.interact.next.standardized.condition.IStandardConfigProvider
    public final Map<String, Function1<WeakReference<C704830Rkn>, InterfaceC1631620sYq<VideoItemParams, Map<String, ? extends Object>, InterfaceC1364105Vn<? super AbstractC1387105bp>, Object>>> I5() {
        return C2097608Jq.LJIIIIZZ(new Pair("biz_show_live_event_cta_event", new AwS603S0100000_24(this, 128)), new Pair("biz_click_live_event_cta_event", new AwS603S0100000_24(this, 129)));
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
        return "anchor_live_event";
    }

    @Override // com.ss.android.ugc.feed.platform.cell.interact.next.standardized.condition.IStandardConfigProvider
    public final Function1<WeakReference<C704830Rkn>, Function2<Map<String, Object>, Function0<Unit>, Unit>> Ca() {
        return new AwS603S0100000_24(this, 130);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v4 */
    public final C474500IjA LIZ(C474500IjA c474500IjA, Aweme aweme) {
        List<AnchorCommonStruct> anchors;
        String strLJJLIIIJ;
        int i;
        AnchorCommonStruct next;
        n nVar;
        LiveEventCtaAnchorProvider liveEventCtaAnchorProvider;
        LiveEventModule liveEventModule;
        LiveEventCtaAnchorProvider liveEventCtaAnchorProvider2;
        String uid;
        Object obj;
        Integer numValueOf;
        if (aweme != null && (anchors = aweme.getAnchors()) != null) {
            Iterator<AnchorCommonStruct> it2 = anchors.iterator();
            while (true) {
                strLJJLIIIJ = null;
                i = 0;
                if (it2.hasNext()) {
                    next = it2.next();
                    if (next.getType() == EnumC1430380nKG.LIVE_EVENT.getTYPE()) {
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
                    new p();
                    k kVarLIZJ = p.LIZJ(anchorCommonStruct.getExtra());
                    nVar = kVarLIZJ.LJIILIIL();
                    liveEventCtaAnchorProvider = kVarLIZJ;
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    nVar = new n();
                    liveEventCtaAnchorProvider = th;
                }
                try {
                    liveEventCtaAnchorProvider = this;
                    liveEventModule = (LiveEventModule) ((Gson) liveEventCtaAnchorProvider.LLILLJJLI.getValue()).LJII(nVar.LJJIJIIJI("live_event_info").LJIL(), LiveEventModule.class);
                    liveEventCtaAnchorProvider2 = liveEventCtaAnchorProvider;
                } catch (Throwable th2) {
                    TryCatchGuardChecker.doCheck(th2);
                    liveEventModule = new LiveEventModule(null, 0L, null, null, false, false, false, null, 0L, false, false, null, null, 8191, null);
                    liveEventCtaAnchorProvider2 = liveEventCtaAnchorProvider;
                }
                c474500IjA.LJJII(aweme.getAid(), "group_id");
                User author = aweme.getAuthor();
                if (author != null) {
                    uid = author.getUid();
                } else {
                    uid = null;
                }
                String str = "1";
                if (Intrinsics.LJFF(uid, String.valueOf(UserService.getInstance().user().getCurrentUserId()))) {
                    obj = "1";
                } else {
                    obj = CardStruct.IStatusCode.DEFAULT;
                }
                c474500IjA.LJJII(obj, "is_author");
                c474500IjA.LJJII(liveEventModule.id, "live_event_id");
                List<AnchorCommonStruct> anchors2 = aweme.getAnchors();
                if (anchors2 != null) {
                    ArrayList arrayList = new ArrayList();
                    for (AnchorCommonStruct anchorCommonStruct2 : anchors2) {
                        int i2 = i + 1;
                        if (i >= 0) {
                            if (anchorCommonStruct2.getType() == 41 && (numValueOf = Integer.valueOf(i2)) != null) {
                                arrayList.add(numValueOf);
                            }
                            i = i2;
                        } else {
                            C1697810uHb.LJIJI();
                            throw null;
                        }
                    }
                    strLJJLIIIJ = C13LP.LJJLIIIJ(arrayList, ",", null, null, 0, null, null, 62);
                }
                c474500IjA.LJJII(strLJJLIIIJ, "live_event_pos");
                c474500IjA.LJJII("upcoming", "live_event_status");
                c474500IjA.LJJII("anchor", "enter_from");
                c474500IjA.LJJII("live_event", "anchor_type");
                c474500IjA.LJJII(C13LP.LJJLIIIJ(liveEventModule.businessType, ",", null, null, 0, null, new AwS603S0100000_24(liveEventCtaAnchorProvider2, 127), 30), "business_type");
                if (liveEventModule.isPaidEvent) {
                    str = CardStruct.IStatusCode.DEFAULT;
                }
                c474500IjA.LJJII(str, "is_free");
            }
        }
        return c474500IjA;
    }
}
