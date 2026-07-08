package com.ss.android.ugc.aweme.favorites.ui;

import X.AbstractC848400XPy;
import X.C01GW;
import X.C03IT;
import X.C098200Yq;
import X.C0T1N;
import X.C0TCH;
import X.C0XQ7;
import X.C1331660kl2;
import X.C1331670kl3;
import X.C1335950krx;
import X.C1489110oqz;
import X.C1529660puO;
import X.C1685300txQ;
import X.C189200o6;
import X.C19EG;
import X.C19GS;
import X.C20684815ws;
import X.C2097608Jq;
import X.C2344009Gk;
import X.C295070BhR;
import X.C298410Bmp;
import X.C427660Gpo;
import X.C444960Hcc;
import X.C452501pT;
import X.C614430O8b;
import X.C616430OFt;
import X.C629640Omo;
import X.C786410Ut5;
import X.C844470XAv;
import X.InterfaceC1334290kpH;
import X.InterfaceC616440OFu;
import Y.ACListenerS144S0100000_9;
import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.forest.Forest;
import com.bytedance.keva.Keva;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.common.applog.AppLog;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.awemeservice.api.IAwemeService;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.commercialize.engagement.trace.EngagementTraceImpl;
import com.ss.android.ugc.aweme.favorites.agents.abilities.ICollect;
import com.ss.android.ugc.aweme.favorites.business.aweme.ability.IAwemeCollectionState;
import com.ss.android.ugc.aweme.favorites.service.IFavoriteService;
import com.ss.android.ugc.aweme.favorites.ui.FavoriteNoticeSheetFragment;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.profile.model.User;
import com.zhiliaoapp.musically.R;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS195S0000000_9;
import kotlin.jvm.internal.AwS546S0100000_2;
import kotlin.jvm.internal.AwS623S0100000_9;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class FavoriteNoticeSheetFragment extends Fragment implements DialogInterface.OnDismissListener {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiMtPyAhITEpHELIOSOmEmIWsKKDk8Oiw4LAE8PCwvLBw7LSA4Dz0yLygpJzs=";
    public String LL;
    public Aweme LLILLJJLI;
    public C616430OFt LLILLL;
    public boolean LLILZ;
    public boolean LLILZIL;
    public boolean LLILZLL;
    public final C01GW LLIZ = C452501pT.LIZIZ(AFwS195S0000000_9.get$arr$(105));

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        String str;
        String aid;
        String authorUid;
        String curUserId;
        String aid2;
        String string;
        String string2;
        String logExtra;
        Map mapLJIIL;
        Long creativeId;
        Long adId;
        int i = 9;
        C616430OFt c616430OFt = null;
        Object obj = null;
        if (this.LLILLL == null) {
            C616430OFt c616430OFt2 = new C616430OFt();
            this.LLILLL = c616430OFt2;
            c616430OFt2.LLILZLL = this.LL;
            c616430OFt2.LLJILJILJ = Boolean.valueOf(this.LLILZ);
            if (this.LLILZ) {
                C616430OFt c616430OFt3 = this.LLILLL;
                if (c616430OFt3 == null) {
                    c616430OFt3 = null;
                }
                c616430OFt3.LLJIJIL = 9;
            } else {
                C616430OFt c616430OFt4 = this.LLILLL;
                if (c616430OFt4 == null) {
                    c616430OFt4 = null;
                }
                c616430OFt4.LLJIJIL = 8;
            }
        }
        C616430OFt c616430OFt5 = this.LLILLL;
        if (c616430OFt5 == null) {
            c616430OFt5 = null;
        }
        c616430OFt5.LLILLJJLI = new InterfaceC616440OFu() { // from class: X.0O9J
            @Override // X.InterfaceC616440OFu
            public final void p30(Exception exc) {
            }

            @Override // X.InterfaceC616440OFu
            public final void ZX() {
                Aweme aweme;
                FavoriteNoticeSheetFragment favoriteNoticeSheetFragment = this.LL;
                if (favoriteNoticeSheetFragment.LLILZ || (aweme = favoriteNoticeSheetFragment.LLILLJJLI) == null) {
                    return;
                }
                if (AwemeExtKt.isCollected(aweme)) {
                    aweme.setCollectStatus(0);
                    ((IAwemeService) ServiceManager.get().getService(IAwemeService.class)).Br(0, aweme.getAid());
                    C1440005kM.LIZ(new C737030Svd(54, favoriteNoticeSheetFragment.LLILLJJLI));
                    String aid3 = aweme.getAid();
                    C1440005kM.LIZ(new C731710Sn3(aid3 != null ? aid3 : "", 0, false));
                    return;
                }
                aweme.setCollectStatus(1);
                ((IAwemeService) ServiceManager.get().getService(IAwemeService.class)).Br(1, aweme.getAid());
                C313310CPx.LIZ.getClass();
                C1440005kM.LIZ(new C737030Svd(54, favoriteNoticeSheetFragment.LLILLJJLI));
                String aid4 = aweme.getAid();
                C1440005kM.LIZ(new C731710Sn3(aid4 != null ? aid4 : "", 1, false));
                C01GW<C740490T2x> c01gw = C740490T2x.LIZLLL;
                if (C739240SzC.LIZ(favoriteNoticeSheetFragment.LL)) {
                    C01GW<C740370T2l> c01gw2 = C740370T2l.LJIIL;
                    C582330Msh.LIZ().LJ(6);
                }
            }

            @Override // X.InterfaceC616440OFu
            public final void Me1(String str2) {
                Activity activityLJFF;
                if (str2 != null && ((IFavoriteService) ServiceManager.get().getService(IFavoriteService.class)).LJIIJJI() <= 0 && (activityLJFF = C2214201BlK.LJFF()) != null) {
                    C1389890mGx c1389890mGx = new C1389890mGx(activityLJFF);
                    c1389890mGx.LJIIJ(str2);
                    c1389890mGx.LJIIJJI();
                }
            }
        };
        if (!this.LLILZ) {
            if (C298410Bmp.LIZ()) {
                Aweme aweme = this.LLILLJJLI;
                if (aweme != null) {
                    Boolean boolLIZ = ((IAwemeCollectionState) ServiceManager.get().getService(IAwemeCollectionState.class)).LIZ(this.LLILLJJLI);
                    if (!this.LLILZ) {
                        i = 8;
                    }
                    Map mapLJIIJ = C2097608Jq.LJIIJ(new Pair("privacy_setting", Integer.valueOf(i)));
                    if (!AwemeExtKt.isMonetizationTraffic(aweme)) {
                        mapLJIIL = C2097608Jq.LJ();
                    } else {
                        C844470XAv.LIZ.getClass();
                        Context contextLIZ = C844470XAv.LIZ();
                        Map<String, Object> mapLIZ = EngagementTraceImpl.LIZIZ().LIZ();
                        Pair[] pairArr = new Pair[7];
                        AwemeRawAd monetizationData = AwemeExtKt.getMonetizationData(aweme);
                        if (monetizationData != null && (adId = monetizationData.getAdId()) != null) {
                            string = adId.toString();
                        } else {
                            string = null;
                        }
                        pairArr[0] = new Pair("ad_id", string);
                        AwemeRawAd monetizationData2 = AwemeExtKt.getMonetizationData(aweme);
                        if (monetizationData2 != null && (creativeId = monetizationData2.getCreativeId()) != null) {
                            string2 = creativeId.toString();
                        } else {
                            string2 = null;
                        }
                        pairArr[1] = new Pair("creative_id", string2);
                        AwemeRawAd monetizationData3 = AwemeExtKt.getMonetizationData(aweme);
                        if (monetizationData3 != null) {
                            logExtra = monetizationData3.getLogExtra();
                        } else {
                            logExtra = null;
                        }
                        pairArr[2] = new Pair("log_extra", logExtra);
                        pairArr[3] = new Pair("user_agent", C1489110oqz.LIZ("other"));
                        pairArr[4] = new Pair("access", C786410Ut5.b3(contextLIZ));
                        pairArr[5] = new Pair("package", contextLIZ.getPackageName());
                        android.util.Pair<String, Boolean> pairLIZ = C614430O8b.LIZ(contextLIZ);
                        if (pairLIZ != null) {
                            obj = pairLIZ.first;
                        }
                        pairArr[6] = new Pair("google_aid", obj);
                        mapLJIIL = C2097608Jq.LJIIL(C2097608Jq.LJIIIIZZ(pairArr), mapLIZ);
                    }
                    Map<String, ? extends Object> mapLJIIL2 = C2097608Jq.LJIIL(mapLJIIJ, mapLJIIL);
                    AwS546S0100000_2 awS546S0100000_2 = new AwS546S0100000_2(boolLIZ, 1165);
                    if (Intrinsics.LJFF(boolLIZ, Boolean.TRUE)) {
                        ((ICollect) this.LLIZ.getValue()).unCollect(aweme.getAid(), mapLJIIL2, new AwS623S0100000_9(awS546S0100000_2, 222), null);
                    } else {
                        ((ICollect) this.LLIZ.getValue()).collect(aweme.getAid(), mapLJIIL2, new AwS623S0100000_9(awS546S0100000_2, 223), new AwS623S0100000_9(this, 224));
                    }
                }
            } else {
                Aweme aweme2 = this.LLILLJJLI;
                if (aweme2 != null) {
                    C616430OFt c616430OFt6 = this.LLILLL;
                    if (c616430OFt6 != null) {
                        c616430OFt = c616430OFt6;
                    }
                    c616430OFt.LIZJ(2, aweme2.getAid(), Integer.valueOf(!AwemeExtKt.isCollected(aweme2) ? 1 : 0), Integer.valueOf(aweme2.getAwemeType()));
                }
            }
        }
        Keva.getRepo("keva_favorite_notify_optimize_repo").storeBoolean("keva_has_shown_favorite_notify_optimize_sheet", true);
        if (this.LLILZ) {
            str = "cancel";
        } else if (this.LLILZIL) {
            str = "close";
        } else if (this.LLILZLL) {
            str = "ok";
        } else {
            str = "hotzone";
        }
        C2344009Gk c2344009Gk = new C2344009Gk();
        Aweme aweme3 = this.LLILLJJLI;
        String str2 = "";
        if (aweme3 == null || (aid = aweme3.getAid()) == null) {
            aid = "";
        }
        c2344009Gk.LJIIIIZZ("group_id", aid);
        Aweme aweme4 = this.LLILLJJLI;
        if (aweme4 == null || (authorUid = AwemeExtKt.getAuthorUid(aweme4)) == null) {
            authorUid = "";
        }
        c2344009Gk.LJIIIIZZ("author_id", authorUid);
        IAccountUserService iAccountUserServiceLJFF = C0XQ7.LJFF();
        if (iAccountUserServiceLJFF == null || (curUserId = ((AbstractC848400XPy) iAccountUserServiceLJFF).getCurUserId()) == null) {
            curUserId = "";
        }
        c2344009Gk.LJIIIIZZ("user_id", curUserId);
        c2344009Gk.LJIIIIZZ("click_type", str);
        c2344009Gk.LJIIIIZZ("enter_from", this.LL);
        Aweme aweme5 = this.LLILLJJLI;
        if (aweme5 != null && (aid2 = aweme5.getAid()) != null) {
            str2 = aid2;
        }
        c2344009Gk.LJIIIIZZ("item_id", str2);
        c2344009Gk.LJIIIIZZ("device_id", AppLog.com_ss_android_common_applog_AppLog_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getServerDeviceId());
        C20684815ws.LJIILLIIL("favorite_permit_notification", c2344009Gk.LIZ);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        UrlModel avatarLarger;
        List<String> urlList;
        List<String> urlList2 = null;
        if (C295070BhR.LIZ()) {
            C0TCH c0tch = C0TCH.LIZ;
            C1529660puO c1529660puO = C629640Omo.LIZ;
            c0tch.getClass();
            Forest forestLIZ = C0TCH.LIZIZ;
            if (forestLIZ == null) {
                forestLIZ = C0T1N.LIZ();
                C0TCH.LIZIZ = forestLIZ;
            }
            C1335950krx c1335950krx = new C1335950krx(c1529660puO, forestLIZ);
            KeyEvent.Callback callbackFindViewById = view.findViewById(R.id.hqb);
            SmartImageView smartImageView = (SmartImageView) callbackFindViewById;
            if (C444960Hcc.LIZIZ()) {
                C786410Ut5.fc(smartImageView, -1.0f);
            }
            InterfaceC1334290kpH interfaceC1334290kpH = (InterfaceC1334290kpH) callbackFindViewById;
            c1335950krx.LJLI = new WeakReference<>(interfaceC1334290kpH);
            c1335950krx.LJJIIZI = interfaceC1334290kpH;
            c1335950krx.LJIIJ(null);
        } else {
            C1331670kl3 c1331670kl3LJFF = C1331660kl2.LJFF(R.drawable.bau);
            KeyEvent.Callback callbackFindViewById2 = view.findViewById(R.id.hqb);
            SmartImageView smartImageView2 = (SmartImageView) callbackFindViewById2;
            if (C444960Hcc.LIZIZ()) {
                C786410Ut5.fc(smartImageView2, -1.0f);
            }
            c1331670kl3LJFF.LJJ((InterfaceC1334290kpH) callbackFindViewById2);
            C786410Ut5.h3(c1331670kl3LJFF);
        }
        C427660Gpo c427660Gpo = (C427660Gpo) view.findViewById(R.id.bh2);
        User curUser = ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUser();
        if (curUser != null) {
            UrlModel avatarMedium = curUser.getAvatarMedium();
            if ((avatarMedium == null || (urlList = avatarMedium.getUrlList()) == null) && ((avatarLarger = curUser.getAvatarLarger()) == null || (urlList = avatarLarger.getUrlList()) == null)) {
                UrlModel avatarThumb = curUser.getAvatarThumb();
                if (avatarThumb != null) {
                    urlList2 = avatarThumb.getUrlList();
                }
            } else {
                urlList2 = urlList;
            }
        }
        C427660Gpo.LJIIJJI(c427660Gpo, new C03IT(urlList2), false, null, null, false, false, null, null, false, null, 1022);
        C786410Ut5.I7(new ACListenerS144S0100000_9(this, 31), view.findViewById(R.id.hq1));
        C786410Ut5.I7(new ACListenerS144S0100000_9(this, 32), view.findViewById(R.id.csu));
        C786410Ut5.I7(new ACListenerS144S0100000_9(this, 33), view.findViewById(R.id.co2));
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.c63, viewGroup, false);
        C19GS c19gs = null;
        if (!(viewTd instanceof View)) {
            viewTd = null;
        }
        if (viewTd != null) {
            try {
                ViewTreeLifecycleOwner.set(viewTd, getViewLifecycleOwner());
                ViewTreeViewModelStoreOwner.set(viewTd, this);
                viewTd.setTag(R.id.view_tree_saved_state_registry_owner, this);
                C19EG activity = getActivity();
                if (activity instanceof C19GS) {
                    c19gs = (C19GS) activity;
                }
                C1685300txQ.LIZ(c19gs);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
                return viewTd;
            }
        }
        C189200o6.m2constructorimpl(Unit.LIZ);
        return viewTd;
    }
}
