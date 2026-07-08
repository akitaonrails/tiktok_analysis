package com.ss.android.ugc.aweme.notification.service;

import X.AbstractC1387200mCc;
import X.AbstractC1585770rMt;
import X.AbstractC1906720ziY;
import X.AbstractC848400XPy;
import X.AnonymousClass0555;
import X.C01GW;
import X.C05RV;
import X.C05RX;
import X.C05RY;
import X.C08JS;
import X.C098200Yq;
import X.C0ALO;
import X.C0C39;
import X.C0CD2;
import X.C0CLX;
import X.C0CYK;
import X.C0OKV;
import X.C0P0O;
import X.C0PEF;
import X.C0PEG;
import X.C0PEM;
import X.C0PGF;
import X.C0W4Y;
import X.C0WHU;
import X.C0XQ7;
import X.C0ZAG;
import X.C0ZAZ;
import X.C0ZC2;
import X.C0ZF5;
import X.C1074030e3V;
import X.C10D1;
import X.C1242310iQv;
import X.C1242390iR3;
import X.C1252240igw;
import X.C1308910kAL;
import X.C1336205Ku;
import X.C13IQ;
import X.C13LE;
import X.C1440005kM;
import X.C1530280pvO;
import X.C1584660rL6;
import X.C1585030rLh;
import X.C15O7;
import X.C1618770sE7;
import X.C1618920sEM;
import X.C1618930sEN;
import X.C1665806fg;
import X.C1720106oR;
import X.C1801100wyC;
import X.C1890330zI7;
import X.C1890850zIx;
import X.C189200o6;
import X.C1901120zZW;
import X.C1901130zZX;
import X.C1901150zZZ;
import X.C1901160zZa;
import X.C1901580zaG;
import X.C1901590zaH;
import X.C1902970zcV;
import X.C1903470zdJ;
import X.C1903510zdN;
import X.C1903930ze3;
import X.C1904150zeP;
import X.C1904660zfE;
import X.C1904730zfL;
import X.C1904760zfO;
import X.C1906570ziJ;
import X.C1906580ziK;
import X.C1906910zir;
import X.C1907400zje;
import X.C1908480zlO;
import X.C1912640zs6;
import X.C1917240zzW;
import X.C1917290zzb;
import X.C19206610Ca;
import X.C1952907kt;
import X.C1954807lC;
import X.C19EG;
import X.C1BVK;
import X.C1DFH;
import X.C2036807yQ;
import X.C20684815ws;
import X.C2097608Jq;
import X.C2107308Nj;
import X.C2162308dZ;
import X.C2187451AjH;
import X.C2188811AlT;
import X.C2214201BlK;
import X.C2241008qG;
import X.C2252408s6;
import X.C23250099c;
import X.C2450909j1;
import X.C312050CLb;
import X.C444920HcY;
import X.C452501pT;
import X.C461720I8s;
import X.C611500Nye;
import X.C624530OeZ;
import X.C635690OwZ;
import X.C635700Owa;
import X.C635770Owh;
import X.C786410Ut5;
import X.C799570VYd;
import X.C799890VZj;
import X.C799900VZk;
import X.C813020Vuu;
import X.C824390WVp;
import X.C844470XAv;
import X.C878950Ydx;
import X.C879340Yea;
import X.C881290Yhj;
import X.C889430Yur;
import X.C889830YvV;
import X.C889900Yvc;
import X.C889930Yvf;
import X.C890080Yvu;
import X.C890100Yvw;
import X.C890110Yvx;
import X.C890210Yw7;
import X.C890250YwB;
import X.C890260YwC;
import X.C890300YwG;
import X.C890320YwI;
import X.C890330YwJ;
import X.C891780Yye;
import X.CallableC624540Oea;
import X.EnumC1157520gEA;
import X.EnumC880480YgQ;
import X.InterfaceC1209300hZg;
import X.InterfaceC1255480imA;
import X.InterfaceC1349370lDb;
import X.InterfaceC1570900qyu;
import X.InterfaceC1617760sCU;
import X.InterfaceC1891350zJl;
import X.InterfaceC1908070zkj;
import X.InterfaceC1914010zuJ;
import X.InterfaceC1917380zzk;
import X.InterfaceC624520OeY;
import X.InterfaceC800130Va7;
import X.InterfaceC814740Vxg;
import X.InterfaceC888500YtM;
import X.InterfaceC889560Yv4;
import X.InterfaceC889970Yvj;
import X.ViewOnClickListenerC1600510rkf;
import Y.ACallableS24S1000000_9;
import Y.ACallableS411S0100000_3;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.common.utility.collection.WeakHandler;
import com.bytedance.frameworks.baselib.netx.partner.NetworkPartner;
import com.bytedance.hox.Hox;
import com.bytedance.keva.Keva;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.tiktok.homepage.mainfragment.BottomTabProtocol;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment;
import com.ss.android.ugc.aweme.base.ui.CommonPageFragment;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.im.chatlist.api.IMChatListApi;
import com.ss.android.ugc.aweme.im.saas.host.api.feature.notice.NoticeFeature;
import com.ss.android.ugc.aweme.im.service.IIMService;
import com.ss.android.ugc.aweme.im.service.analytics.IMSayhiAnalytics;
import com.ss.android.ugc.aweme.inbox.InboxShellFragment;
import com.ss.android.ugc.aweme.inbox.cache.PreloadManager;
import com.ss.android.ugc.aweme.inbox.filter.FilterTabType;
import com.ss.android.ugc.aweme.inbox.land.LandInboxExperiment;
import com.ss.android.ugc.aweme.inbox.land.SocialExtra;
import com.ss.android.ugc.aweme.inbox.lego.PreloadInboxTask;
import com.ss.android.ugc.aweme.inbox.newfollowerpage.InboxNewFollowerTabFragment;
import com.ss.android.ugc.aweme.inbox.professional.switchcreatorinbox.ui.SwitchCreatorInboxRootFragment;
import com.ss.android.ugc.aweme.inbox.search.data.items.InboxSearchRecentStoreItem;
import com.ss.android.ugc.aweme.inbox.v2.InboxFragmentV2;
import com.ss.android.ugc.aweme.inbox.widget.multi.InboxEntrancePod;
import com.ss.android.ugc.aweme.inbox.widget.multi.MultiViewModel;
import com.ss.android.ugc.aweme.notice.api.ab.EdmGuidePopupCoinExperiment;
import com.ss.android.ugc.aweme.notice.api.bean.NoticeList;
import com.ss.android.ugc.aweme.notice.api.services.INoticeService;
import com.ss.android.ugc.aweme.notification.MusNotificationDetailActivity;
import com.ss.android.ugc.aweme.notification.api.NoticeApiNetworkPartner;
import com.ss.android.ugc.aweme.notification.badge.SyncInbox2AppBootTask;
import com.ss.android.ugc.aweme.notification.creator.NotificationContainerFragment;
import com.ss.android.ugc.aweme.notification.followrequest.model.ApproveResponse;
import com.ss.android.ugc.aweme.notification.followrequest.model.RejectResponse;
import com.ss.android.ugc.aweme.notification.lego.FetchTutorialVideoRequest;
import com.ss.android.ugc.aweme.notification.perf.FollowerPreCacheManager;
import com.ss.android.ugc.aweme.notification.perf.NoticeVideoManager;
import com.ss.android.ugc.aweme.notification.v2.MergedNotificationFragment;
import com.ss.android.ugc.aweme.notification.view.NotificationTabProtocol;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.unifiedauthapi.experiment.GuideOutPushExperiment;
import com.ss.android.ugc.awemepushapi.IPushApi;
import com.ss.android.ugc.awemepushapi.IPushPermissionApi;
import com.ss.android.ugc.awemepushapi.model.SilentMsg;
import com.zhiliaoapp.musically.R;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS201S0000000_14;
import kotlin.jvm.internal.AwS607S0100000_28;
import kotlin.jvm.internal.AwS87S1000000_2;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes29.dex */
public final class NoticeServiceImpl implements INoticeService, NoticeFeature {
    public final C01GW LIZIZ = C452501pT.LIZIZ(new C1904730zfL());

    @Override // com.ss.android.ugc.aweme.notice.api.services.INoticeService
    public final String LJIJJLI(String str, String str2) {
        return str2;
    }

    @Override // com.ss.android.ugc.aweme.notice.api.services.INoticeService
    public final void LJJI() {
        C891780Yye.LJ = true;
    }

    @Override // com.ss.android.ugc.aweme.notice.api.services.INoticeService
    public final void LJJJJLL() {
    }

    @Override // com.ss.android.ugc.aweme.notice.api.services.INoticeService
    public final void initLegoInflate() {
    }

    @Override // com.ss.android.ugc.aweme.notice.api.services.INoticeService
    public final NetworkPartner LIZ() {
        return new NoticeApiNetworkPartner();
    }

    @Override // com.ss.android.ugc.aweme.notice.api.services.INoticeService
    public final C05RV LIZJ() {
        return C889930Yvf.LIZ.LIZJ();
    }

    @Override // com.ss.android.ugc.aweme.notice.api.services.INoticeService
    public final boolean LIZLLL() {
        return C889930Yvf.LIZ.LJIIL();
    }

    @Override // com.ss.android.ugc.aweme.notice.api.services.INoticeService
    public final boolean LJ() {
        return C889930Yvf.LIZ.LJIIIZ() && C890260YwC.LIZIZ.LIZJ(true);
    }

    @Override // com.ss.android.ugc.aweme.notice.api.services.INoticeService
    public final int LJI() {
        return C890100Yvw.LIZIZ.LJIIIIZZ();
    }

    @Override // com.ss.android.ugc.aweme.notice.api.services.INoticeService
    public final boolean LJII() {
        C1904150zeP.LIZ.getClass();
        return ((Boolean) LandInboxExperiment.LIZLLL.getValue()).booleanValue();
    }

    @Override // com.ss.android.ugc.aweme.notice.api.services.INoticeService
    public final List<FilterTabType> LJIIIIZZ() {
        return C889930Yvf.LIZ.LJFF();
    }

    @Override // com.ss.android.ugc.aweme.notice.api.services.INoticeService
    public final boolean LJIIJ() {
        C1904150zeP.LIZ.getClass();
        return C1904150zeP.LIZIZ.get();
    }

    @Override // com.ss.android.ugc.aweme.notice.api.services.INoticeService
    public final int LJIIJJI() {
        return C890100Yvw.LIZIZ.LJIIIZ();
    }

    @Override // com.ss.android.ugc.aweme.notice.api.services.INoticeService
    public final boolean LJIILIIL() {
        int i = C05RY.LIZ[C889930Yvf.LIZ.LIZJ().ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    throw new C1954807lC();
                }
                return false;
            }
            if (((Number) C0ALO.LIZ.getValue()).intValue() > 0) {
                return false;
            }
        } else if (!C890250YwB.LIZIZ.LIZJ(true) || ((Number) C0ALO.LIZ.getValue()).intValue() > 0) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.notice.api.services.INoticeService
    public final void LJIILL() {
        C1440005kM.LIZ(new C0OKV());
    }

    @Override // com.ss.android.ugc.aweme.notice.api.services.INoticeService
    public final boolean LJIIZILJ() {
        IMChatListApi.LJJIII.getClass();
        return C890330YwJ.LIZ().LJJIII() || C0CYK.LIZJ.LJIIIIZZ();
    }

    @Override // com.ss.android.ugc.aweme.notice.api.services.INoticeService
    public final boolean LJJ() {
        return C889930Yvf.LIZ.LJIIJJI();
    }

    @Override // com.ss.android.ugc.aweme.notice.api.services.INoticeService
    public final boolean LJJIII() {
        return C889930Yvf.LIZ.LJIIL();
    }

    @Override // com.ss.android.ugc.aweme.notice.api.services.INoticeService
    public final void LJJIIJZLJL() {
        Object c098200Yq;
        int i = C2187451AjH.LIZ;
        C1720106oR.LJI("NoticeService", "clearInboxCacheOnlyInMemory");
        C1901580zaG.LIZ.getClass();
        try {
            C1901580zaG.LIZLLL = C1901590zaH.LIZ(C1901580zaG.LIZLLL(), null);
            c098200Yq = Unit.LIZ;
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
        if (thM5exceptionOrNullimpl != null) {
            int i2 = C2187451AjH.LIZ;
            C1720106oR.LIZIZ("InboxDataCache", "clearInboxEntranceOnlyInMemory error", thM5exceptionOrNullimpl);
        }
        C1901150zZZ.LIZJ.LIZ();
        C1901160zZa.LIZJ.LIZ();
        C1901130zZX.LIZJ.LIZ();
        FollowerPreCacheManager.LIZ.getClass();
        synchronized (C1901120zZW.class) {
            try {
                FollowerPreCacheManager.LIZIZ = null;
            } catch (Throwable th2) {
                TryCatchGuardChecker.doCheck(th2);
                throw th2;
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.notice.api.services.INoticeService
    public final InterfaceC1255480imA LJJIIZ() {
        return (C1912640zs6) this.LIZIZ.getValue();
    }

    @Override // com.ss.android.ugc.aweme.notice.api.services.INoticeService
    public final boolean LJJIJ() {
        return C889930Yvf.LIZ.LJIIL();
    }

    @Override // com.ss.android.ugc.aweme.notice.api.services.INoticeService
    public final void LJJIJIIJIL() {
        C1904660zfE.LIZ.getClass();
        C1904660zfE.LIZJ = true;
    }

    @Override // com.ss.android.ugc.aweme.notice.api.services.INoticeService
    public final FilterTabType LJJIJIL() {
        if (C05RX.LIZ[C889930Yvf.LIZ.LIZJ().ordinal()] == 1) {
            return FilterTabType.OVERALL;
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.notice.api.services.INoticeService
    public final String LJJJ() {
        C1917240zzW.LIZ.getClass();
        int i = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("getShareActionAvatar(");
        sbLIZ.append(C1917240zzW.LJIIIIZZ);
        sbLIZ.append(')');
        C2188811AlT.LIZIZ(sbLIZ);
        return C1917240zzW.LJIIIIZZ;
    }

    @Override // com.ss.android.ugc.aweme.notice.api.services.INoticeService
    public final void LJJJI() {
        synchronized (C889930Yvf.LIZ) {
            Pair<String, ? extends C05RV> pair = C889930Yvf.LIZLLL;
            if (!Intrinsics.LJFF(pair != null ? pair.getFirst() : null, C461720I8s.LIZIZ())) {
                C889930Yvf.LIZLLL = null;
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.notice.api.services.INoticeService
    public final boolean LJJJIL() {
        C0ZAZ.LIZ.getClass();
        return C0ZAZ.LIZIZ();
    }

    @Override // com.ss.android.ugc.aweme.notice.api.services.INoticeService
    public final C05RV LJJJJ() {
        return C889930Yvf.LIZ.LIZLLL();
    }

    @Override // com.ss.android.ugc.aweme.notice.api.services.INoticeService
    public final boolean LJJJJZI() {
        return C889930Yvf.LIZ.LJIIIZ() && C881290Yhj.LIZIZ.LIZJ(true);
    }

    @Override // com.ss.android.ugc.aweme.notice.api.services.INoticeService
    public final boolean LJJJLL() {
        return C890320YwI.LIZIZ.LIZJ(true);
    }

    @Override // com.ss.android.ugc.aweme.notice.api.services.INoticeService
    public final void LJJJLZIJ() {
        C1618920sEM.LIZ.getClass();
        int i = C2187451AjH.LIZ;
        C1720106oR.LJI("InboxMovingReminderHelper", "onReminderEnd");
        C1618920sEM.LIZIZ = false;
    }

    @Override // com.ss.android.ugc.aweme.notice.api.services.INoticeService
    public final boolean LJJJZ() {
        return C890110Yvx.LIZIZ.LJI() > 0;
    }

    @Override // com.ss.android.ugc.aweme.notice.api.services.INoticeService
    public final Pair<FilterTabType, Set<EnumC880480YgQ>> LJJL() {
        Pair<FilterTabType, Set<EnumC880480YgQ>> pairLJII = C889930Yvf.LIZ.LJII();
        return LIZLLL() ? new Pair<>(pairLJII.getFirst(), Collections.singleton(EnumC880480YgQ.SAME_WITH_TAB)) : pairLJII;
    }

    @Override // com.ss.android.ugc.aweme.notice.api.services.INoticeService
    public final void LJJLI() {
        C1618920sEM.LIZ.getClass();
        int i = C2187451AjH.LIZ;
        C1720106oR.LJI("InboxMovingReminderHelper", "onReminderShow");
        C1618930sEN c1618930sENLIZ = C1618920sEM.LIZ();
        if (c1618930sENLIZ != null) {
            c1618930sENLIZ.LIZ.storeInt("inbox_moving_reminder_count", c1618930sENLIZ.LIZ.getInt("inbox_moving_reminder_count", 0) + 1);
            c1618930sENLIZ.LIZ.storeLong("inbox_last_reminder_show_time", System.currentTimeMillis());
        }
        String str = C1585030rLh.LJIJ("NOTIFICATION") ? "bottom_4tab" : C1585030rLh.LJIIJ("NOTIFICATION") == 0 ? "top_left_tab" : "top_right_tab";
        C2241008qG c2241008qG = new C2241008qG();
        c2241008qG.LIZ.put("enter_method", str);
        C20684815ws.LJIJ("show_inbox_moving_reminder", c2241008qG.LJ());
    }

    @Override // com.ss.android.ugc.aweme.notice.api.services.INoticeService
    public final Boolean LJJLIIIJJI() {
        C890110Yvx.LIZIZ.getClass();
        C1952907kt c1952907kt = C1952907kt.LIZ;
        String str = C890110Yvx.LIZJ;
        c1952907kt.getClass();
        if (C1952907kt.LIZ().getBoolean(str, false)) {
            return Boolean.valueOf(C1952907kt.LIZ().getInt("business_inbox", 0) > 0);
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.notice.api.services.INoticeService
    public final boolean LJJLIIIJL() {
        C1904150zeP.LIZ.getClass();
        int iLIZ = LandInboxExperiment.LIZ();
        return 1 <= iLIZ && iLIZ < 4;
    }

    @Override // com.ss.android.ugc.aweme.notice.api.services.INoticeService
    public final boolean LJJLIIIJLJLI() {
        return C890300YwG.LIZIZ.LIZJ(true);
    }

    @Override // com.ss.android.ugc.aweme.notice.api.services.INoticeService
    public final void LJJLIIIJLLLLLLLZ() {
        C1440005kM.LIZ(new C2036807yQ(false));
    }

    @Override // com.ss.android.ugc.aweme.notice.api.services.INoticeService
    public final void LJJLJ() {
        C1904150zeP.LIZ.getClass();
        ((IPushApi) ServiceManager.get().getService(IPushApi.class)).registerSilentMsgHandler(new InterfaceC814740Vxg() { // from class: X.0W4X
            @Override // X.InterfaceC814740Vxg
            public final int[] LIZ() {
                return new int[]{EnumC814940Vy0.LANDING_INBOX.getSceneId()};
            }

            @Override // X.InterfaceC814740Vxg
            public final void LIZIZ(SilentMsg silentMsg) {
                Object c098200Yq;
                C1904150zeP c1904150zeP = C1904150zeP.LIZ;
                String str = silentMsg.data;
                c1904150zeP.getClass();
                try {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("handleSilentPushMessage parse message ");
                    sbLIZ.append(str);
                    C0W4Y.LIZJ(C2188811AlT.LIZIZ(sbLIZ));
                    SocialExtra socialExtra = (SocialExtra) C08JS.LIZ(str, SocialExtra.class);
                    if (socialExtra != null && socialExtra.isValidData()) {
                        long j = socialExtra.noticeCreateTime;
                        if (j > 0) {
                            C1904150zeP.LJI(Long.valueOf(j), "silentPush");
                        }
                    }
                    c098200Yq = Unit.LIZ;
                    C189200o6.m2constructorimpl(c098200Yq);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    c098200Yq = new C098200Yq(th);
                    C189200o6.m2constructorimpl(c098200Yq);
                }
                Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
                if (thM5exceptionOrNullimpl != null) {
                    C0W4Y.LIZIZ("handleSilentPushMessage parse message error: " + thM5exceptionOrNullimpl.getMessage());
                }
            }
        });
    }

    @Override // com.ss.android.ugc.aweme.notice.api.services.INoticeService
    public final boolean LJJLL() {
        C1904660zfE.LIZ.getClass();
        C312050CLb c312050CLb = C312050CLb.LIZ;
        c312050CLb.getClass();
        if (!C312050CLb.LIZIZ()) {
            return false;
        }
        Keva keva = C1904660zfE.LIZIZ;
        if (keva.getInt("banner_show_times", 0) <= 0) {
            c312050CLb.getClass();
            if (C312050CLb.LIZ() != 3 || !C312050CLb.LIZIZ()) {
                long j = keva.getLong("initial_timestamp", 0L);
                if (j <= 0 || System.currentTimeMillis() - j <= TimeUnit.DAYS.toMillis(30L)) {
                    return false;
                }
            }
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.notice.api.services.INoticeService
    public final boolean LJJZZI() {
        C889930Yvf.LIZ.getClass();
        return C890080Yvu.LIZIZ.LIZJ(false);
    }

    @Override // com.ss.android.ugc.aweme.notice.api.services.INoticeService
    public final void LJJZZIII() {
        C1440005kM.LIZ(new C2036807yQ(true));
    }

    @Override // com.ss.android.ugc.aweme.notice.api.services.INoticeService
    public final ViewModelProvider.Factory LJL() {
        return MultiViewModel.LLLILZ.getValue();
    }

    @Override // com.ss.android.ugc.aweme.notice.api.services.INoticeService
    public final Pair<FilterTabType, Set<EnumC880480YgQ>> LJLIIIL() {
        Pair<FilterTabType, Set<EnumC880480YgQ>> pairLJI = C889930Yvf.LIZ.LJI();
        return LIZLLL() ? new Pair<>(pairLJI.getFirst(), Collections.singleton(EnumC880480YgQ.SAME_WITH_TAB)) : pairLJI;
    }

    @Override // com.ss.android.ugc.aweme.notice.api.services.INoticeService
    public final void LJLILLLLZI() {
        C1907400zje.LIZ.getClass();
        int i = C2187451AjH.LIZ;
        C1720106oR.LJI("NoticeNudgeManager", "clear nudge nid set when account change");
        C1907400zje.LIZIZ.clear();
        C1907400zje.LIZJ = Long.MAX_VALUE;
    }

    @Override // com.ss.android.ugc.aweme.notice.api.services.INoticeService
    public final void LJLJI() {
        C799900VZk.LIZ.getClass();
        C799890VZj c799890VZj = new C799890VZj();
        c799890VZj.LIZ(new PreloadInboxTask());
        c799890VZj.LIZIZ();
        C799890VZj c799890VZj2 = new C799890VZj();
        c799890VZj2.LIZ(new SyncInbox2AppBootTask());
        c799890VZj2.LIZIZ();
        C15O7.LIZJ(new Callable() { // from class: X.0zfI
            @Override // java.util.concurrent.Callable
            public final Object call() {
                C1C7U.LIZ("NoticeServiceImpl@c475.onMainPageLaunch$1");
                C1908480zlO.LIZIZ.init();
                Unit unit = Unit.LIZ;
                C1C7U.LIZIZ("NoticeServiceImpl@c475.onMainPageLaunch$1");
                return unit;
            }
        });
    }

    @Override // com.ss.android.ugc.aweme.notice.api.services.INoticeService
    public final boolean LJLJJL() {
        C1917240zzW.LIZ.getClass();
        int i = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("needChannelShareAction(");
        sbLIZ.append(C1917240zzW.LJII);
        sbLIZ.append(')');
        C2188811AlT.LIZIZ(sbLIZ);
        return C1917240zzW.LJII;
    }

    @Override // com.ss.android.ugc.aweme.notice.api.services.INoticeService
    public final void LJLJL() {
        C1917240zzW.LIZ.getClass();
        C1917240zzW.LIZJ("", false, true);
    }

    @Override // com.ss.android.ugc.aweme.im.saas.host.api.feature.notice.NoticeFeature
    public final boolean LJLJLJ() {
        return C889930Yvf.LIZ.LJIIIZ();
    }

    @Override // com.ss.android.ugc.aweme.notice.api.services.INoticeService
    public final AbstractC1585770rMt LJLLILLLL() {
        return new AbstractC1585770rMt() { // from class: X.0rKV
            @Override // X.AbstractC1585770rMt
            public final BottomTabProtocol LIZ() {
                return new NotificationTabProtocol();
            }

            @Override // X.AbstractC1585770rMt
            public final InterfaceC1570900qyu LIZJ() {
                return new C1584660rL6();
            }

            @Override // X.AbstractC1585770rMt
            public final EnumC1584360rKc LIZIZ() {
                return EnumC1584360rKc.INBOX;
            }
        };
    }

    @Override // com.ss.android.ugc.aweme.notice.api.services.INoticeService
    public final boolean LJLLLL() {
        C1665806fg c1665806fg = C1665806fg.LIZJ;
        c1665806fg.getClass();
        boolean z = ((Number) AnonymousClass0555.LIZ(c1665806fg)).intValue() == 1;
        boolean zLIZ = C890210Yw7.LIZ();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("expEnable=");
        sbLIZ.append(z);
        sbLIZ.append(", canSwitchBizInbox=");
        sbLIZ.append(zLIZ);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("NoticeServiceImpl");
        sbLIZ2.append(", ");
        sbLIZ2.append(strLIZIZ);
        C1618770sE7.LJFF(C2188811AlT.LIZIZ(sbLIZ2));
        return z && !zLIZ;
    }

    @Override // com.ss.android.ugc.aweme.notice.api.services.INoticeService
    public final boolean LJLLLLLL() {
        return C889930Yvf.LIZ.LJIIIZ();
    }

    @Override // com.ss.android.ugc.aweme.notice.api.services.INoticeService
    public final InterfaceC800130Va7 LJLZ() {
        return new FetchTutorialVideoRequest();
    }

    @Override // com.ss.android.ugc.aweme.notice.api.services.INoticeService
    public final void LJZ() {
        C2252408s6.LIZ(AFwS201S0000000_14.get$arr$(287));
    }

    @Override // com.ss.android.ugc.aweme.notice.api.services.INoticeService
    public final String LL() {
        C0ZAG.LIZ.getClass();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(C0ZAG.LJI);
        sbLIZ.append("\n[entranceLogId]");
        sbLIZ.append(C0ZAG.LJII);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // com.ss.android.ugc.aweme.notice.api.services.INoticeService
    public final void LLF() {
        if (((Boolean) C0CD2.LJIIJJI.getValue()).booleanValue()) {
            C799570VYd.LJFF(false).execute(new Runnable() { // from class: X.0zeR
                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("NoticeServiceImpl@c475.onApplicationCreate$1");
                    try {
                        C1904150zeP.LIZ.getClass();
                        C1904150zeP.LIZJ();
                        PreloadManager.LIZIZ();
                        C1903470zdJ c1903470zdJ = C1903470zdJ.LL;
                        c1903470zdJ.getClass();
                        C1908480zlO.LIZIZ.LJIILL(c1903470zdJ, C0ZF5.LIZJ);
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("NoticeServiceImpl@c475.onApplicationCreate$1");
                }
            });
            return;
        }
        C1904150zeP.LIZ.getClass();
        C1904150zeP.LIZJ();
        PreloadManager.LIZIZ();
        C1903470zdJ c1903470zdJ = C1903470zdJ.LL;
        c1903470zdJ.getClass();
        C1908480zlO.LIZIZ.LJIILL(c1903470zdJ, C0ZF5.LIZJ);
    }

    @Override // com.ss.android.ugc.aweme.notice.api.services.INoticeService
    public final boolean LLFII() {
        C1917240zzW.LIZ.getClass();
        int i = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("isVideoTriggered(");
        sbLIZ.append(C1917240zzW.LJIIIZ);
        sbLIZ.append(')');
        C2188811AlT.LIZIZ(sbLIZ);
        return C1917240zzW.LJIIIZ;
    }

    @Override // com.ss.android.ugc.aweme.notice.api.services.INoticeService
    public final InterfaceC1209300hZg LJJIIZI() {
        NoticeVideoManager.InnerManager innerManagerLIZ = NoticeVideoManager.LIZ();
        return innerManagerLIZ == null ? new InterfaceC1209300hZg() { // from class: X.0zfK
            @Override // X.InterfaceC1209300hZg
            public final Aweme LIZ(String str) {
                return null;
            }

            @Override // X.InterfaceC1209300hZg
            public final void LIZLLL(Aweme aweme, String str) {
            }
        } : innerManagerLIZ;
    }

    @Override // com.ss.android.ugc.aweme.notice.api.services.INoticeService
    public final boolean LJJIJIIJI() {
        C19EG c19eg;
        Activity activityLJFF = C2214201BlK.LJFF();
        if (!(activityLJFF instanceof C19EG) || (c19eg = (C19EG) activityLJFF) == null) {
            return false;
        }
        return Hox.LLJILJIL.LIZ(c19eg).KQ2("NOTIFICATION");
    }

    @Override // com.ss.android.ugc.aweme.notice.api.services.INoticeService
    public final boolean LLFFF() {
        return C0C39.LIZ();
    }

    @Override // com.ss.android.ugc.aweme.notice.api.services.INoticeService
    public final C0WHU LIZIZ() {
        return C1904760zfO.LIZ;
    }

    @Override // com.ss.android.ugc.aweme.notice.api.services.INoticeService
    public final InterfaceC1908070zkj LJIILLIIL() {
        return C1906910zir.LIZ;
    }

    @Override // com.ss.android.ugc.aweme.notice.api.services.INoticeService
    public final <T extends AmeBaseFragment> Class<? extends T> LJJII() {
        return InboxFragmentV2.class;
    }

    @Override // com.ss.android.ugc.aweme.notice.api.services.INoticeService
    public final InterfaceC1349370lDb LJJJJZ() {
        return C611500Nye.LIZ;
    }

    @Override // com.ss.android.ugc.aweme.notice.api.services.INoticeService
    public final <T extends CommonPageFragment> Class<? extends T> LJJLIIJ() {
        return InboxShellFragment.class;
    }

    @Override // com.ss.android.ugc.aweme.notice.api.services.INoticeService
    public final String LJLLL() {
        return C891780Yye.LIZLLL;
    }

    @Override // com.ss.android.ugc.aweme.notice.api.services.INoticeService
    public final void LJIIIZ(MotionEvent motionEvent) {
        IMChatListApi.LJJIII.getClass();
        C890330YwJ.LIZ().LJIILIIL().LJIIIZ(motionEvent);
    }

    @Override // com.ss.android.ugc.aweme.notice.api.services.INoticeService
    public final boolean LJIIL(Context context) {
        C1917240zzW.LIZ.getClass();
        if (((Boolean) GuideOutPushExperiment.LIZJ.getValue()).booleanValue()) {
            return true;
        }
        return C813020Vuu.LJIIL().LIZIZ(context, "key_opt_dm_dialog_show", true);
    }

    @Override // com.ss.android.ugc.aweme.notice.api.services.INoticeService
    public final Intent LJIJ(Context context) {
        return new Intent(context, (Class<?>) MusNotificationDetailActivity.class);
    }

    @Override // com.ss.android.ugc.aweme.notice.api.services.INoticeService
    public final void LJIL(C889900Yvc c889900Yvc) {
        C889930Yvf.LIZ.getClass();
        C889930Yvf.LJI = c889900Yvc;
    }

    @Override // com.ss.android.ugc.aweme.notice.api.services.INoticeService
    public final void LJJIFFI(InterfaceC889970Yvj interfaceC889970Yvj) {
        C889930Yvf.LIZ.getClass();
        C01GW c01gw = C889930Yvf.LIZIZ;
        if (!((CopyOnWriteArrayList) c01gw.getValue()).contains(interfaceC889970Yvj)) {
            ((CopyOnWriteArrayList) c01gw.getValue()).add(interfaceC889970Yvj);
        }
    }

    @Override // com.ss.android.ugc.aweme.notice.api.services.INoticeService
    public final void LJJIIJ(String str) {
        C15O7.LIZIZ(new ACallableS411S0100000_3((Object) new AwS87S1000000_2(str, 22), 35), (Executor) C2450909j1.LIZ.getValue(), null);
    }

    @Override // com.ss.android.ugc.aweme.notice.api.services.INoticeService
    public final void LJJIL(Function0<Unit> function0) {
        Activity activityLIZIZ;
        AbstractC1387200mCc abstractC1387200mCcLJ = C1906580ziK.LJ();
        if (abstractC1387200mCcLJ != null) {
            activityLIZIZ = abstractC1387200mCcLJ.LIZIZ();
        } else {
            activityLIZIZ = null;
        }
        C1530280pvO.LIZ(activityLIZIZ, new AwS607S0100000_28(function0, (Function0<Unit>) 94), false);
    }

    @Override // com.ss.android.ugc.aweme.notice.api.services.INoticeService
    public final boolean LJJJJI(Context context) {
        C1917240zzW.LIZ.getClass();
        return C1917240zzW.LJ(context, null);
    }

    @Override // com.ss.android.ugc.aweme.notice.api.services.INoticeService
    public final void LJJJJJL(Long l) {
        C1904150zeP.LIZ.getClass();
        C1904150zeP.LJI(l, "request/combine");
    }

    @Override // com.ss.android.ugc.aweme.notice.api.services.INoticeService
    public final void LJJLIIIIJ(NoticeList noticeList) {
        PreloadManager.LIZLLL(noticeList, 1);
    }

    @Override // com.ss.android.ugc.aweme.notice.api.services.INoticeService
    public final void LJJLIIIJJIZ(C19EG c19eg) {
        C1917240zzW.LIZ.getClass();
        C1917240zzW.LIZLLL(c19eg);
    }

    @Override // com.ss.android.ugc.aweme.notice.api.services.INoticeService
    public final void LJJLIL(InterfaceC889970Yvj interfaceC889970Yvj) {
        C889930Yvf.LIZ.getClass();
        ((CopyOnWriteArrayList) C889930Yvf.LIZIZ.getValue()).remove(interfaceC889970Yvj);
    }

    @Override // com.ss.android.ugc.aweme.notice.api.services.INoticeService
    public final void LJJZ(int i) {
        C1440005kM.LIZ(new C1902970zcV(i));
    }

    @Override // com.ss.android.ugc.aweme.notice.api.services.INoticeService
    public final View.OnClickListener LJLIIL(Context context) {
        return new ViewOnClickListenerC1600510rkf(context);
    }

    @Override // com.ss.android.ugc.aweme.notice.api.services.INoticeService
    public final boolean LJLJJI(BaseResponse baseResponse) {
        if ((baseResponse instanceof RejectResponse) && ((RejectResponse) baseResponse).reject_status == 0) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.notice.api.services.INoticeService
    public final void LJLJJLL(Context context) {
        C0CLX.LIZ.getClass();
    }

    @Override // com.ss.android.ugc.aweme.notice.api.services.INoticeService
    public final AbstractC1906720ziY LJLL(C1242310iQv c1242310iQv) {
        return new C1242390iR3(c1242310iQv);
    }

    @Override // com.ss.android.ugc.aweme.notice.api.services.INoticeService
    public final boolean LJLLI(BaseResponse baseResponse) {
        if ((baseResponse instanceof ApproveResponse) && ((ApproveResponse) baseResponse).approve_status == 0) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.notice.api.services.INoticeService
    public final void LJLLJ(JSONObject jSONObject) {
        String strOptString;
        Object c098200Yq;
        String strOptString2;
        C1904150zeP.LIZ.getClass();
        C844470XAv.LIZ.getClass();
        if (!C2162308dZ.LJI(C844470XAv.LIZ())) {
            C0W4Y.LIZIZ("handleExternalPushMessage, received push in sub-process");
            return;
        }
        if (jSONObject == null) {
            strOptString = null;
        } else {
            try {
                strOptString = jSONObject.optString("extra_str");
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                c098200Yq = new C098200Yq(th);
                C189200o6.m2constructorimpl(c098200Yq);
            }
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("handleExternalPushMessage extraStr =  ");
        sbLIZ.append(strOptString);
        C0W4Y.LIZ(C2188811AlT.LIZIZ(sbLIZ));
        if (strOptString == null || strOptString.length() == 0 || (strOptString2 = new JSONObject(strOptString).optString("social_extra")) == null || strOptString2.length() == 0) {
            return;
        }
        SocialExtra socialExtra = (SocialExtra) C08JS.LIZ(strOptString2, SocialExtra.class);
        if (socialExtra != null && socialExtra.isValidData()) {
            long j = socialExtra.noticeCreateTime;
            if (j > 0) {
                C1904150zeP.LJI(Long.valueOf(j), "externalPush");
            }
        }
        c098200Yq = Unit.LIZ;
        C189200o6.m2constructorimpl(c098200Yq);
        Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
        if (thM5exceptionOrNullimpl == null) {
            return;
        }
        C0W4Y.LIZIZ("handleExternalPushMessage parse message error: " + thM5exceptionOrNullimpl.getMessage());
    }

    @Override // com.ss.android.ugc.aweme.notice.api.services.INoticeService
    public final void notifyLocaleChange(Locale locale) {
        AtomicBoolean atomicBoolean = PreloadManager.LIZ;
        C1901580zaG.LIZIZ(C1901580zaG.LIZ);
    }

    @Override // com.ss.android.ugc.aweme.notice.api.services.INoticeService
    public final void LJIILJJIL(Context context, C1917290zzb c1917290zzb) {
        C1917240zzW.LIZ.getClass();
        C1917240zzW.LJII(context, c1917290zzb, null);
    }

    @Override // com.ss.android.ugc.aweme.notice.api.services.INoticeService
    public final InterfaceC889560Yv4 LJJIJL(C878950Ydx c878950Ydx, Function0<? extends List<? extends InterfaceC888500YtM>> function0) {
        return new C889430Yur(c878950Ydx, function0);
    }

    @Override // com.ss.android.ugc.aweme.notice.api.services.INoticeService
    public final void LJJIJLIJ(FilterTabType filterTabType, String str) {
        C889830YvV.LIZ(filterTabType, str);
    }

    @Override // com.ss.android.ugc.aweme.notice.api.services.INoticeService
    public final InterfaceC1570900qyu LJJJJJ(C19EG c19eg, InterfaceC1617760sCU interfaceC1617760sCU) {
        C1584660rL6 c1584660rL6 = new C1584660rL6();
        c1584660rL6.LL = c19eg;
        c1584660rL6.LLILLJJLI = interfaceC1617760sCU;
        return c1584660rL6;
    }

    @Override // com.ss.android.ugc.aweme.notice.api.services.INoticeService
    public final void LJJJJL(String str, WeakHandler weakHandler) {
        InterfaceC624520OeY interfaceC624520OeY = C624530OeZ.LIZ;
        C1BVK.LIZIZ().LIZ(weakHandler, new ACallableS24S1000000_9(str, 1), 2);
    }

    @Override // com.ss.android.ugc.aweme.notice.api.services.INoticeService
    public final RecyclerView.ViewHolder LJJJJLI(ViewGroup viewGroup, C13IQ<? extends InterfaceC1891350zJl> c13iq) {
        if (Intrinsics.LJFF(c13iq, C13LE.LIZ(InboxEntrancePod.class))) {
            C1903510zdN c1903510zdN = new C1903510zdN(C1906570ziJ.LIZ(C786410Ut5.ne(viewGroup.getContext()), R.layout.a_2, viewGroup, false, 24));
            c1903510zdN.LLLLJ(C1890850zIx.LIZLLL);
            return c1903510zdN;
        }
        int i = C1890330zI7.LL;
        return new C1890330zI7(C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.a_p, viewGroup, false));
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // com.ss.android.ugc.aweme.notice.api.services.INoticeService
    public final Intent LJJJLIIL(Context context, String str) {
        Class<? extends Fragment> cls;
        if (C0ZC2.LIZ()) {
            boolean zLJFF = Intrinsics.LJFF(str, "follow");
            C1074030e3V c1074030e3V = C1074030e3V.LIZ;
            Bundle bundle = new Bundle();
            bundle.putInt("default_tab", zLJFF ? 1 : 0);
            return c1074030e3V.LIZ(context, MergedNotificationFragment.class, bundle, null);
        }
        if (Intrinsics.LJFF(str, "follow")) {
            cls = InboxNewFollowerTabFragment.class;
        } else {
            cls = NotificationContainerFragment.class;
        }
        return C1074030e3V.LIZ.LIZ(context, cls, null, null);
    }

    @Override // com.ss.android.ugc.aweme.notice.api.services.INoticeService
    public final void LJJLIIIJ(String str, WeakHandler weakHandler) {
        InterfaceC624520OeY interfaceC624520OeY = C624530OeZ.LIZ;
        C1BVK.LIZIZ().LIZ(weakHandler, new CallableC624540Oea(str, 0), 1);
    }

    @Override // com.ss.android.ugc.aweme.notice.api.services.INoticeService
    public final void LJJLIIIJILLIZJL(Context context, C1917290zzb c1917290zzb) {
        c1917290zzb.LIZ = "interaction";
        C1917240zzW.LIZ.getClass();
        C1917240zzW.LJIIIIZZ(context, c1917290zzb, null);
    }

    @Override // com.ss.android.ugc.aweme.notice.api.services.INoticeService
    public final void LJJLJLI(String str, boolean z) {
        C1917240zzW.LIZ.getClass();
        C1917240zzW.LIZJ(str, true, z);
    }

    @Override // com.ss.android.ugc.aweme.notice.api.services.INoticeService
    public final void LJLI(String str, boolean z) {
        C1917240zzW.LIZ.getClass();
        int i = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("recordCopyLinkAvatar(video: ");
        sbLIZ.append(z);
        sbLIZ.append("): ");
        sbLIZ.append(str);
        C2188811AlT.LIZIZ(sbLIZ);
        C1917240zzW.LJIIIIZZ = str;
        C1917240zzW.LJIIIZ = z;
    }

    @Override // com.ss.android.ugc.aweme.notice.api.services.INoticeService
    public final void LJLJLLL(long j, String str) {
        C0PEG c0peg = C0PEG.LIZ;
        InboxSearchRecentStoreItem inboxSearchRecentStoreItem = new InboxSearchRecentStoreItem(C0PGF.USER, str, j);
        c0peg.getClass();
        C23250099c.LIZLLL(C0PEG.LIZIZ, null, null, new C0PEF(inboxSearchRecentStoreItem, null), 3);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:5:0x000d  */
    @Override // com.ss.android.ugc.aweme.notice.api.services.INoticeService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJZL(android.content.Context r9, X.C1917290zzb r10) {
        /*
            Method dump skipped, instruction units count: 358
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.notification.service.NoticeServiceImpl.LJZL(android.content.Context, X.0zzb):void");
    }

    @Override // com.ss.android.ugc.aweme.notice.api.services.INoticeService
    public final void LLD(String str, boolean z) {
        C1440005kM.LIZ(new C1903930ze3(str, z));
    }

    @Override // com.ss.android.ugc.aweme.notice.api.services.INoticeService
    public final Class<?> LJFF(Context context, C1917290zzb c1917290zzb, InterfaceC1917380zzk interfaceC1917380zzk) {
        C1917240zzW.LIZ.getClass();
        return C1917240zzW.LJII(context, c1917290zzb, interfaceC1917380zzk);
    }

    @Override // com.ss.android.ugc.aweme.notice.api.services.INoticeService
    public final void LJIJI(final Context context, final C1917290zzb c1917290zzb, final C19206610Ca c19206610Ca) {
        if (Intrinsics.LJFF(c1917290zzb.LIZ, "customized_ui_edm")) {
            int i = C2187451AjH.LIZ;
            if (context != null) {
                C1917240zzW.LIZ.getClass();
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("tryShowEdmGuideDialog(");
                sbLIZ.append(c1917290zzb.LIZLLL);
                sbLIZ.append(", ");
                sbLIZ.append(c1917290zzb.LIZ);
                sbLIZ.append(", ");
                sbLIZ.append(c1917290zzb.LIZIZ);
                sbLIZ.append(", ");
                sbLIZ.append(c1917290zzb.LIZJ);
                sbLIZ.append(", ");
                sbLIZ.append(c1917290zzb.LJ);
                sbLIZ.append(')');
                C2188811AlT.LIZIZ(sbLIZ);
                if (((Boolean) EdmGuidePopupCoinExperiment.LIZJ.getValue()).booleanValue()) {
                    long jLIZJ = C813020Vuu.LJIIL().LIZJ(context, "key_cross_guide_out_edm_dialog");
                    long jLIZJ2 = C813020Vuu.LJIIL().LIZJ(context, "key_times_guide_out_edm_dialog");
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    int i2 = C1917240zzW.LJ;
                    if (jLIZJ2 < i2) {
                        TimeUnit timeUnit = TimeUnit.DAYS;
                        int i3 = C1917240zzW.LJFF;
                        long j = i3;
                        c1917290zzb.LJII = timeUnit.toMinutes(j);
                        if (jCurrentTimeMillis - jLIZJ > j * 86400000) {
                            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                            sbLIZ2.append("shouldShowEdmDialog because < ");
                            sbLIZ2.append(i2);
                            sbLIZ2.append(" times & interval < ");
                            sbLIZ2.append(i3);
                            sbLIZ2.append(" days.");
                            C2188811AlT.LIZIZ(sbLIZ2);
                        }
                        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                        sbLIZ3.append("should NOT show edm dialog because (now:");
                        sbLIZ3.append(jCurrentTimeMillis);
                        sbLIZ3.append(")(stamp:");
                        sbLIZ3.append(jLIZJ);
                        sbLIZ3.append(", times:");
                        sbLIZ3.append(jLIZJ2);
                        sbLIZ3.append(")(interval:");
                        sbLIZ3.append(C1917240zzW.LJFF);
                        sbLIZ3.append(", exitTimes: ");
                        sbLIZ3.append(i2);
                        sbLIZ3.append(", afterExitInterval:");
                        sbLIZ3.append(C1917240zzW.LJI);
                        sbLIZ3.append(')');
                        C2188811AlT.LIZIZ(sbLIZ3);
                        c1917290zzb.LJIIIIZZ = "frequency_control";
                        C1917240zzW.LIZ(context, c1917290zzb, false);
                        c19206610Ca.LIZ("frequency_control");
                        return;
                    }
                    TimeUnit timeUnit2 = TimeUnit.DAYS;
                    int i4 = C1917240zzW.LJI;
                    long j2 = i4;
                    c1917290zzb.LJII = timeUnit2.toMinutes(j2);
                    if (jCurrentTimeMillis - jLIZJ > j2 * 86400000) {
                        StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                        sbLIZ4.append("shouldShowEdmDialog because > ");
                        sbLIZ4.append(i2);
                        sbLIZ4.append(" times & interval > ");
                        sbLIZ4.append(i4);
                        sbLIZ4.append(" days.");
                        C2188811AlT.LIZIZ(sbLIZ4);
                    }
                    StringBuilder sbLIZ32 = C2188811AlT.LIZ();
                    sbLIZ32.append("should NOT show edm dialog because (now:");
                    sbLIZ32.append(jCurrentTimeMillis);
                    sbLIZ32.append(")(stamp:");
                    sbLIZ32.append(jLIZJ);
                    sbLIZ32.append(", times:");
                    sbLIZ32.append(jLIZJ2);
                    sbLIZ32.append(")(interval:");
                    sbLIZ32.append(C1917240zzW.LJFF);
                    sbLIZ32.append(", exitTimes: ");
                    sbLIZ32.append(i2);
                    sbLIZ32.append(", afterExitInterval:");
                    sbLIZ32.append(C1917240zzW.LJI);
                    sbLIZ32.append(')');
                    C2188811AlT.LIZIZ(sbLIZ32);
                    c1917290zzb.LJIIIIZZ = "frequency_control";
                    C1917240zzW.LIZ(context, c1917290zzb, false);
                    c19206610Ca.LIZ("frequency_control");
                    return;
                }
                c1917290zzb.LJII = -1L;
                if (!((AbstractC848400XPy) C0XQ7.LJFF()).isLogin()) {
                    C1917240zzW.LIZ(context, c1917290zzb, false);
                    c19206610Ca.LIZ("invalid_login_status");
                    return;
                } else {
                    C1917240zzW.LIZ(context, c1917290zzb, false);
                    c19206610Ca.LIZ("edm_consented");
                    return;
                }
            }
            return;
        }
        if (C824390WVp.LIZJ(context)) {
            c19206610Ca.LIZ("has_notification_permission");
        } else {
            ((IPushPermissionApi) ServiceManager.get().getService(IPushPermissionApi.class)).LJIIJ(null, "coin_jsb", new InterfaceC1914010zuJ() { // from class: X.0zfJ
                @Override // X.InterfaceC1914010zuJ
                public final void LIZ() {
                    int i5 = C2187451AjH.LIZ;
                    Context context2 = context;
                    if (context2 != null) {
                        C1917290zzb c1917290zzb2 = c1917290zzb;
                        C10DS c10ds = c19206610Ca;
                        C1917240zzW.LIZ.getClass();
                        C1917240zzW.LJIIIIZZ(context2, c1917290zzb2, c10ds);
                    }
                }

                @Override // X.InterfaceC1914010zuJ
                public final void LIZIZ() {
                    int i5 = C2187451AjH.LIZ;
                    c19206610Ca.LIZIZ(0, null);
                }
            });
        }
    }

    @Override // com.ss.android.ugc.aweme.notice.api.services.INoticeService
    public final void LJJIZ(Context context, String str, boolean z) {
        EnumC1157520gEA enumC1157520gEA;
        String str2 = SwitchCreatorInboxRootFragment._pnsPageId;
        if (z) {
            enumC1157520gEA = EnumC1157520gEA.GUIDE_SWITCH;
        } else {
            enumC1157520gEA = EnumC1157520gEA.MANUAL_SETTING_PAGE;
        }
        SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(context, "//im/b2c/switch_creator_inbox");
        smartRouteBuildRoute.withParam("enter_method", enumC1157520gEA);
        smartRouteBuildRoute.withParam("pre_previous_page", str);
        smartRouteBuildRoute.open();
    }

    @Override // com.ss.android.ugc.aweme.notice.api.services.INoticeService
    public final void LJZI(C05RV c05rv, String str, Function1<? super Boolean, Unit> function1) {
        C889930Yvf.LIZ.getClass();
        C889930Yvf.LIZ(c05rv, str, function1);
    }

    @Override // com.ss.android.ugc.aweme.notice.api.services.INoticeService
    public final void LLFF(Context context, C1917290zzb c1917290zzb, C10D1 c10d1) {
        c1917290zzb.LIZ = "customized_ui";
        C1917240zzW.LIZ.getClass();
        C1917240zzW.LJIIIIZZ(context, c1917290zzb, c10d1);
    }

    @Override // com.ss.android.ugc.aweme.notice.api.services.INoticeService
    public final int LJIJJ(Context context, User user, String str, String str2, boolean z) {
        String remarkName;
        String str3 = str;
        C1252240igw.LIZ.getClass();
        if (user != null && z && user.getFollowStatus() == 2) {
            IIMService iIMServiceLIZ = C1336205Ku.LIZ(false);
            if (iIMServiceLIZ.getImSayHiService().LJ(user.getUid(), true, null, !C1336205Ku.LIZ(false).getLightInteractService().LIZLLL(r2), false)) {
                IMSayhiAnalytics imSayhiAnalytics = iIMServiceLIZ.getImSayhiAnalytics();
                String uid = user.getUid();
                Pair[] pairArr = new Pair[3];
                if (str3 == null) {
                    str3 = "inner_push";
                }
                pairArr[0] = new Pair("enter_from", str3);
                pairArr[1] = new Pair("enter_method", "inner_push");
                pairArr[2] = new Pair("push_label", str2);
                imSayhiAnalytics.LIZJ(uid, C2097608Jq.LJIIJ(pairArr));
                if (C1336205Ku.LIZ(false).getLightInteractService().LIZLLL(user.getUid())) {
                    if (TextUtils.isEmpty(user.getRemarkName())) {
                        remarkName = user.getNickname();
                    } else {
                        remarkName = user.getRemarkName();
                    }
                    iIMServiceLIZ.getImSayHiService().LIZLLL(context, user.getUid(), remarkName, false, C2097608Jq.LJIIJ(new Pair("enter_from", "inner_push"), new Pair("enter_method", "button"), new Pair("message_type", "emoji"), new Pair("message_from", "greeting_button")), false, null, null);
                    C1440005kM.LIZ(new C879340Yea(user.getUid()));
                    return 1;
                }
            }
            C1252240igw.LIZIZ(context, user, "inner_push", "", null, null);
            return 2;
        }
        return -1;
    }

    @Override // com.ss.android.ugc.aweme.notice.api.services.INoticeService
    public final void LJJJJIZL(C19EG c19eg, int i, List<Integer> list, String str, C635690OwZ c635690OwZ, Map<String, String> map, Function1<? super C1801100wyC, Unit> function1) {
        C635700Owa.LIZ.getClass();
        LifecycleCoroutineScope lifecycleScope = LifecycleOwnerKt.getLifecycleScope(c19eg);
        C1DFH c1dfh = C0PEM.LIZ;
        C23250099c.LIZLLL(lifecycleScope, C2107308Nj.LIZ, null, new C635770Owh(c19eg, function1, i, str, map, list, c635690OwZ, null), 2);
    }

    @Override // com.ss.android.ugc.aweme.notice.api.services.INoticeService
    public final SpannableStringBuilder LJLIL(TextView textView, CharSequence charSequence, int i, int i2, int i3, int i4, List<Pair<Integer, Integer>> list, Integer num) {
        int i5 = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("dealSearchText() - highLightList.size = ");
        sbLIZ.append(list.size());
        C1720106oR.LJI("InboxSearchGenericUtils", C2188811AlT.LIZIZ(sbLIZ));
        if (i <= 0) {
            return new SpannableStringBuilder(charSequence);
        }
        try {
            if (list.isEmpty()) {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence);
                return C0P0O.LIZJ(new SpannableStringBuilder(charSequence), textView.getPaint(), i, i2, i4, (int) textView.getPaint().measureText(spannableStringBuilder.subSequence(spannableStringBuilder.length() - i4, spannableStringBuilder.length()).toString()), true);
            }
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(charSequence);
            for (Pair<Integer, Integer> pair : list) {
                Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a1r, textView.getContext());
                if (numLIZJ != null) {
                    ForegroundColorSpan foregroundColorSpan = new ForegroundColorSpan(numLIZJ.intValue());
                    if (pair.getSecond().intValue() > pair.getFirst().intValue()) {
                        C786410Ut5.q2(spannableStringBuilder2, foregroundColorSpan, pair.getFirst().intValue(), pair.getSecond().intValue(), 33);
                    }
                }
                if (num != null) {
                    C444920HcY c444920HcY = new C444920HcY(num.intValue(), false);
                    if (pair.getSecond().intValue() > pair.getFirst().intValue()) {
                        C786410Ut5.q2(spannableStringBuilder2, c444920HcY, pair.getFirst().intValue(), pair.getSecond().intValue(), 33);
                    }
                }
            }
            Iterator<Pair<Integer, Integer>> it2 = list.iterator();
            if (it2.hasNext()) {
                int iIntValue = it2.next().getFirst().intValue();
                while (it2.hasNext()) {
                    int iIntValue2 = it2.next().getFirst().intValue();
                    if (iIntValue > iIntValue2) {
                        iIntValue = iIntValue2;
                    }
                }
                Iterator<Pair<Integer, Integer>> it3 = list.iterator();
                if (it3.hasNext()) {
                    int iIntValue3 = it3.next().getSecond().intValue();
                    while (it3.hasNext()) {
                        int iIntValue4 = it3.next().getSecond().intValue();
                        if (iIntValue3 < iIntValue4) {
                            iIntValue3 = iIntValue4;
                        }
                    }
                    return C0P0O.LIZLLL(spannableStringBuilder2, textView.getPaint(), i, i2, i3, i4, new Pair(Integer.valueOf(iIntValue), Integer.valueOf(iIntValue3)));
                }
                throw new NoSuchElementException();
            }
            throw new NoSuchElementException();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return new SpannableStringBuilder(charSequence);
        }
    }
}
