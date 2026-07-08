package com.ss.android.ugc.aweme.search.entry.searchbox.viewmodel;

import X.C01GW;
import X.C034O;
import X.C04SJ;
import X.C04VY;
import X.C04VZ;
import X.C09U0;
import X.C0PEM;
import X.C0QF7;
import X.C0QF8;
import X.C0QFF;
import X.C0QFH;
import X.C0QKV;
import X.C0SYH;
import X.C1017070cZd;
import X.C13LE;
import X.C14EU;
import X.C1576740r8K;
import X.C1594360rak;
import X.C1594370ral;
import X.C1594390ran;
import X.C1594400rao;
import X.C1594420raq;
import X.C1594430rar;
import X.C1594500ray;
import X.C1807670x8n;
import X.C1954807lC;
import X.C1DFK;
import X.C2037407yW;
import X.C20684815ws;
import X.C2188811AlT;
import X.C2217381BqS;
import X.C2296808zG;
import X.C23118094a;
import X.C23250099c;
import X.C2344009Gk;
import X.C452501pT;
import X.C671200QUk;
import X.C690440R6k;
import X.C718570SGp;
import X.C718580SGq;
import X.C817570W5j;
import X.EnumC1594380ram;
import X.EnumC1594410rap;
import X.EnumC682820QqO;
import X.InterfaceC0148002o;
import X.InterfaceC1583660rJU;
import X.InterfaceC1583770rJf;
import X.InterfaceC1594440ras;
import X.InterfaceC1594460rau;
import X.InterfaceC19330810jy;
import X.InterfaceC2217461Bqa;
import X.InterfaceC497601wk;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.im.push.api.IMPushApi;
import com.ss.android.ugc.aweme.innerpush.api.model.InnerPushMessage;
import com.ss.android.ugc.aweme.local_test.LocalTestApi;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AwS25S0010000_10;
import kotlin.jvm.internal.AwS568S0100000_24;
import kotlin.jvm.internal.AwS589S0100000_10;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.JobSupport;

/* JADX INFO: loaded from: classes25.dex */
public final class SearchBoxFYPViewModel extends AssemViewModel<C0QKV> implements InterfaceC1594440ras {
    public static final C671200QUk LLJIJIL;
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJILJIL;
    public static EnumC682820QqO LLJILJILJ;
    public static boolean LLJILLL;
    public Aweme LL;
    public long LLILLJJLI = -1;
    public JobSupport LLILLL;
    public final Map<String, Boolean> LLILZ;
    public final C01GW LLILZIL;
    public final C1594360rak LLILZLL;
    public final C1594420raq LLIZ;
    public final C1594370ral LLIZLLLIL;
    public final C1594500ray LLJ;
    public volatile C09U0 LLJI;

    /* JADX WARN: Type inference failed for: r0v3, types: [X.0QUk] */
    static {
        C2217381BqS c2217381BqS = new C2217381BqS(SearchBoxFYPViewModel.class, "dispatchers", "getDispatchers()Lcom/ss/android/ugc/aweme/utils/dispatchers/TTDispatchers;", 0);
        C13LE.LIZ.getClass();
        LLJILJIL = new InterfaceC2217461Bqa[]{c2217381BqS};
        LLJIJIL = new Object() { // from class: X.0QUk
        };
        LLJILJILJ = EnumC682820QqO.NOT_SHOWED;
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C0QKV(null, null);
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [X.0rak] */
    /* JADX WARN: Type inference failed for: r0v6, types: [X.0raq] */
    /* JADX WARN: Type inference failed for: r0v7, types: [X.0ral] */
    /* JADX WARN: Type inference failed for: r0v8, types: [X.0ray] */
    public SearchBoxFYPViewModel() {
        C1DFK c1dfkLIZ = C23118094a.LIZ();
        c1dfkLIZ.LIZIZ(null);
        this.LLILLL = c1dfkLIZ;
        this.LLILZ = new LinkedHashMap();
        this.LLILZIL = C452501pT.LIZIZ(new AwS568S0100000_24(this, 891));
        this.LLILZLL = new InterfaceC1583770rJf() { // from class: X.0rak
            @Override // X.InterfaceC1583770rJf
            public final void A4(String str, String str2) {
                if (!Intrinsics.LJFF(str2, "For You")) {
                    this.LL.JM2(EnumC1594380ram.CHANGE_NEXT_PAGE, null, false);
                }
            }
        };
        this.LLIZ = new InterfaceC1594460rau() { // from class: X.0raq
            @Override // X.InterfaceC1594460rau
            public final void LIZ(boolean z) {
                if (z) {
                    this.LIZ.JM2(EnumC1594380ram.PAUSE_PANEL_SHOW, null, true);
                }
            }
        };
        this.LLIZLLLIL = new InterfaceC1583660rJU() { // from class: X.0ral
            @Override // X.InterfaceC1583660rJU
            public final void LIZ() {
            }

            @Override // X.InterfaceC1583660rJU
            public final void LIZJ() {
            }

            @Override // X.InterfaceC1583660rJU
            public final void LIZIZ(boolean z) {
                if (z) {
                    this.LIZ.JM2(EnumC1594380ram.SKYLIGHT, null, true);
                }
            }
        };
        this.LLJ = new InterfaceC19330810jy() { // from class: X.0ray
            public final int[] LL = {101};

            @Override // X.InterfaceC19330810jy
            public final boolean LIZ(int i, InnerPushMessage innerPushMessage) {
                return false;
            }

            @Override // X.InterfaceC19330810jy
            public final boolean LJFF(InnerPushMessage innerPushMessage) {
                return true;
            }

            @Override // X.InterfaceC19330810jy
            public final boolean LJI(InnerPushMessage innerPushMessage) {
                return true;
            }

            @Override // X.InterfaceC19330810jy
            public final C20663815tU LJIIIZ(C20663515tR c20663515tR, InnerPushMessage innerPushMessage) {
                return null;
            }

            @Override // X.InterfaceC19330810jy
            public final int[] LIZJ() {
                return this.LL;
            }

            @Override // X.InterfaceC19330810jy
            public final boolean LIZLLL(InnerPushMessage innerPushMessage) {
                C1ER1.LIZIZ.LLF(EnumC1594380ram.COMPLIANCE_IAP, true);
                return false;
            }
        };
    }

    @C14EU
    public final void onAllTabsCleanModeEvent(C718570SGp c718570SGp) {
        C1576740r8K c1576740r8KLIZ = C690440R6k.LIZ();
        if (c1576740r8KLIZ != null && c1576740r8KLIZ.LIZ) {
            JM2(EnumC1594380ram.CLEAR_SCREEN, null, false);
        }
    }

    @C14EU
    public final void onCloseSearchBoxEvent(C0QF7 c0qf7) {
        JM2(c0qf7.LIZ, null, c0qf7.LIZIZ);
    }

    @C14EU
    public final void onCommentDialogEvent(C0SYH c0syh) {
        if (c0syh.LIZ == 1) {
            JM2(EnumC1594380ram.COMMENT_PANEL_SHOW, null, true);
        }
    }

    @C14EU
    public final void onFYPCleanModeEvent(C718580SGq c718580SGq) {
        C1576740r8K c1576740r8KLIZ = C690440R6k.LIZ();
        if (c1576740r8KLIZ != null && c1576740r8KLIZ.LIZLLL) {
            JM2(EnumC1594380ram.CLEAR_SCREEN, null, false);
        }
    }

    @C14EU
    public final void onFeedSeekbarCleanMode(C1594430rar c1594430rar) {
        String aid;
        String aid2;
        String aid3;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("eventbus onFeedSeekbarCleanModeEvent ");
        Aweme aweme = c1594430rar.LIZIZ;
        if (aweme != null) {
            aid = aweme.getAid();
        } else {
            aid = null;
        }
        sbLIZ.append(aid);
        sbLIZ.append(' ');
        sbLIZ.append(c1594430rar.LIZ);
        C2188811AlT.LIZIZ(sbLIZ);
        Aweme aweme2 = c1594430rar.LIZIZ;
        if (aweme2 != null) {
            aid2 = aweme2.getAid();
        } else {
            aid2 = null;
        }
        Aweme aweme3 = this.LL;
        if (aweme3 == null || (aid3 = aweme3.getAid()) == null) {
            aid3 = "";
        }
        if (Intrinsics.LJFF(aid2, aid3) && c1594430rar.LIZ) {
            JM2(EnumC1594380ram.CLEAR_SCREEN, null, false);
        }
    }

    @C14EU
    public final void onPhotoIndicatorShowed(C2037407yW c2037407yW) {
        String aid;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("eventbus onPhotoIndicatorShowed ");
        sbLIZ.append(c2037407yW.LIZ);
        sbLIZ.append(" holder visible:");
        sbLIZ.append(c2037407yW.LIZIZ);
        sbLIZ.append(" current aid:");
        Aweme aweme = this.LL;
        if (aweme != null) {
            aid = aweme.getAid();
        } else {
            aid = null;
        }
        sbLIZ.append(aid);
        C2188811AlT.LIZIZ(sbLIZ);
        if (c2037407yW.LIZ) {
            if (((Boolean) C04SJ.LIZ.getValue()).booleanValue() && !c2037407yW.LIZIZ) {
                return;
            }
            JM2(EnumC1594380ram.PHOTO_INDICATOR_SHOW, null, true);
        }
    }

    @C14EU
    public final void onSearchReinforceFetchedEvent(C034O c034o) {
        setState(new AwS589S0100000_10(c034o, 150));
    }

    public final void wQ2(boolean z) {
        LLJILJILJ = EnumC682820QqO.SHOWING;
        C1594400rao.LIZ.getClass();
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("position", "homepage_hot");
        C20684815ws.LJIILLIIL("feed_search_box_show", c2344009Gk.LIZ);
        this.LLILLJJLI = System.currentTimeMillis();
        this.LLILLL = C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C0QFF(this, null), 3);
        IMPushApi.LIZ.getClass();
        C817570W5j.LIZ().LIZLLL().LIZLLL(1, "searchbox", "search box show", true);
        setState(new AwS25S0010000_10(z, 1));
        InterfaceC497601wk assemVMScope = getAssemVMScope();
        C09U0 c09u0 = this.LLJI;
        if (c09u0 == null) {
            synchronized (this) {
                c09u0 = this.LLJI;
                if (c09u0 == null) {
                    c09u0 = (C09U0) C1807670x8n.p();
                    this.LLJI = c09u0;
                }
            }
        }
        C23250099c.LIZLLL(assemVMScope, c09u0.LIZ, null, new C0QFH(null), 2);
    }

    @Override // X.InterfaceC1594440ras
    public final void JM2(C0QF8 c0qf8, Integer num, boolean z) {
        long jCurrentTimeMillis;
        EnumC1594380ram enumC1594380ram;
        String aid;
        String aid2;
        Boolean bool;
        if (((Number) C04VY.LIZ.getValue()).intValue() == 2 && Intrinsics.LJFF(((LocalTestApi) ServiceManager.get().getService(LocalTestApi.class)).getSearchDebugSwitch(), Boolean.TRUE)) {
            return;
        }
        EnumC682820QqO enumC682820QqO = LLJILJILJ;
        EnumC682820QqO enumC682820QqO2 = EnumC682820QqO.HIDDEN;
        if (enumC682820QqO == enumC682820QqO2) {
            return;
        }
        String aid3 = null;
        if (((Boolean) C04VZ.LIZ.getValue()).booleanValue() && (c0qf8 == EnumC1594410rap.NEW_USER_GUIDANCE || c0qf8 == EnumC1594410rap.NORMAL_AD || c0qf8 == EnumC1594410rap.MULTI_PHOTO || c0qf8 == EnumC1594410rap.FULL_SCREEN_AD || c0qf8 == EnumC1594410rap.SCREEN_LIVE || c0qf8 == EnumC1594380ram.PHOTO_INDICATOR_SHOW || ((c0qf8 == EnumC1594380ram.HIDE_TOP_TAB && C1017070cZd.LLIZLLLIL(this.LL)) || (c0qf8 == EnumC1594380ram.HIDE_TOP_TAB_ALPHA && C1017070cZd.LLIZLLLIL(this.LL))))) {
            Aweme aweme = this.LL;
            if (aweme != null && (aid2 = aweme.getAid()) != null && (bool = (Boolean) ((LinkedHashMap) this.LLILZ).get(aid2)) != null && bool.booleanValue()) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("request hide search box reason: ");
                sbLIZ.append(c0qf8);
                sbLIZ.append(" has been reported before, awemeId : ");
                Aweme aweme2 = this.LL;
                if (aweme2 != null) {
                    aid3 = aweme2.getAid();
                }
                sbLIZ.append(aid3);
                C2188811AlT.LIZIZ(sbLIZ);
                return;
            }
            if (c0qf8 instanceof EnumC1594410rap) {
                C1594400rao.LIZ.getClass();
                C1594400rao.LIZ((EnumC1594410rap) c0qf8, num);
                Aweme aweme3 = this.LL;
                if (aweme3 != null && (aid = aweme3.getAid()) != null) {
                    this.LLILZ.put(aid, Boolean.TRUE);
                }
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("awemeId : ");
                Aweme aweme4 = this.LL;
                if (aweme4 != null) {
                    aid3 = aweme4.getAid();
                }
                sbLIZ2.append(aid3);
                sbLIZ2.append(" avoid event has report");
                C2188811AlT.LIZIZ(sbLIZ2);
                return;
            }
            return;
        }
        if (LLJILJILJ != EnumC682820QqO.SHOWING && (c0qf8 instanceof EnumC1594380ram)) {
            C1594400rao c1594400rao = C1594400rao.LIZ;
            EnumC1594410rap enumC1594410rap = EnumC1594410rap.OTHER;
            c1594400rao.getClass();
            C1594400rao.LIZ(enumC1594410rap, null);
        } else if (c0qf8 instanceof EnumC1594380ram) {
            C1594400rao c1594400rao2 = C1594400rao.LIZ;
            EnumC1594380ram enumC1594380ram2 = (EnumC1594380ram) c0qf8;
            if (this.LLILLJJLI > 0) {
                c1594400rao2.getClass();
                jCurrentTimeMillis = System.currentTimeMillis() - this.LLILLJJLI;
            } else {
                jCurrentTimeMillis = -1;
            }
            c1594400rao2.getClass();
            switch (C1594390ran.LIZ[enumC1594380ram2.ordinal()]) {
                case 1:
                    enumC1594380ram = EnumC1594380ram.AUTOSCROLL_ICON;
                    break;
                case 2:
                    enumC1594380ram = EnumC1594380ram.LAUNCH_30S;
                    break;
                case 3:
                    enumC1594380ram = EnumC1594380ram.CHANGE_FIRST_ITEM;
                    break;
                case 4:
                    enumC1594380ram = EnumC1594380ram.CHANGE_NEXT_PAGE;
                    break;
                case 5:
                    enumC1594380ram = EnumC1594380ram.COMMENT_PANEL_SHOW;
                    break;
                case 6:
                case 7:
                case 8:
                    enumC1594380ram = EnumC1594380ram.CLEAR_SCREEN;
                    break;
                case BdTuring.TYPE_ECAF /* 9 */:
                    enumC1594380ram = EnumC1594380ram.SKYLIGHT;
                    break;
                case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                    enumC1594380ram = EnumC1594380ram.PAUSE_PANEL_SHOW;
                    break;
                case BdTuring.TYPE_EMAIL /* 11 */:
                    enumC1594380ram = EnumC1594380ram.HAVE_XTAB;
                    break;
                case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                    enumC1594380ram = EnumC1594380ram.PHOTO_INDICATOR_SHOW;
                    break;
                case BdTuring.TYPE_SMS_VOICE /* 13 */:
                case 14:
                case 15:
                    enumC1594380ram = EnumC1594380ram.OTHER;
                    break;
                default:
                    throw new C1954807lC();
            }
            String mobString = enumC1594380ram.getMobString();
            if (mobString == null) {
                mobString = "";
            }
            C2344009Gk c2344009Gk = new C2344009Gk();
            c2344009Gk.LJIIIIZZ("position", "homepage_hot");
            c2344009Gk.LJIIIIZZ("disappear_type", mobString);
            c2344009Gk.LJIIIIZZ("show_duration", String.valueOf(jCurrentTimeMillis));
            C20684815ws.LJIILLIIL("feed_search_box_disappear", c2344009Gk.LIZ);
        } else if (c0qf8 instanceof EnumC1594410rap) {
            C1594400rao.LIZ.getClass();
            C1594400rao.LIZ((EnumC1594410rap) c0qf8, num);
        } else {
            throw new C1954807lC();
        }
        LLJILJILJ = enumC682820QqO2;
        IMPushApi.LIZ.getClass();
        C817570W5j.LIZ().LIZLLL().LIZLLL(0, "searchbox", "search box dismiss", false);
        setState(new AwS25S0010000_10(z, 0));
    }

    public final void vQ2(Aweme aweme, int i, boolean z) {
        String aid;
        String aid2;
        if (((Boolean) C04VZ.LIZ.getValue()).booleanValue()) {
            if (i == 0) {
                Aweme aweme2 = this.LL;
                if (aweme2 != null) {
                    String aid3 = aweme2.getAid();
                    if (aweme != null) {
                        aid2 = aweme.getAid();
                    } else {
                        aid2 = null;
                    }
                    if (Intrinsics.LJFF(aid3, aid2)) {
                        return;
                    }
                } else {
                    return;
                }
            }
            if (z && LLJILJILJ == EnumC682820QqO.SHOWING) {
                JM2(EnumC1594380ram.CHANGE_FIRST_ITEM, null, true);
                return;
            } else {
                if (LLJILJILJ != EnumC682820QqO.SHOWING) {
                    return;
                }
                JM2(EnumC1594380ram.CHANGE_FIRST_ITEM, null, false);
                return;
            }
        }
        if (i == 0) {
            Aweme aweme3 = this.LL;
            if (aweme3 == null) {
                return;
            }
            String aid4 = aweme3.getAid();
            if (aweme != null) {
                aid = aweme.getAid();
            } else {
                aid = null;
            }
            if (Intrinsics.LJFF(aid4, aid)) {
                return;
            }
        }
        if (z) {
            JM2(EnumC1594380ram.CHANGE_FIRST_ITEM, null, true);
        } else {
            JM2(EnumC1594380ram.CHANGE_FIRST_ITEM, null, false);
        }
    }
}
