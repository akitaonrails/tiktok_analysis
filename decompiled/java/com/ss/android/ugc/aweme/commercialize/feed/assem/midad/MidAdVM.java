package com.ss.android.ugc.aweme.commercialize.feed.assem.midad;

import X.C01GW;
import X.C0CQT;
import X.C0N6Z;
import X.C1019400cdO;
import X.C1022620cia;
import X.C1022820ciu;
import X.C1024380clQ;
import X.C1031030cw9;
import X.C11NJ;
import X.C11S5;
import X.C1483340ohg;
import X.C1483410ohn;
import X.C1489110oqz;
import X.C1558520qew;
import X.C1578630rBN;
import X.C1618220sDE;
import X.C1697810uHb;
import X.C1701940uOG;
import X.C1A2W;
import X.C2184171Adz;
import X.C2188811AlT;
import X.C2245731Cv5;
import X.C2245741Cv6;
import X.C2245751Cv7;
import X.C2245781CvA;
import X.C2245821CvE;
import X.C2344009Gk;
import X.C258060A9k;
import X.C258070A9l;
import X.C274660Apc;
import X.C293430Ben;
import X.C293440Beo;
import X.C293460Beq;
import X.C452501pT;
import X.C587970N4h;
import X.EnumC2245291CuN;
import X.EnumC584610MwN;
import X.InterfaceC0148002o;
import X.InterfaceC1603020roi;
import X.InterfaceC665370Q7z;
import Y.AfS203S0100000_34;
import androidx.fragment.app.Fragment;
import com.bytedance.ies.ugc.aweme.commercialize.intelligence.IAdReRankServiceManagerService;
import com.bytedance.ies.ugc.aweme.network.IRetrofitFactory;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.bytedance.pumbaa.utility.method_id.MethodIDManager;
import com.ss.android.ugc.aweme.commerce.AwemeCommerceStruct;
import com.ss.android.ugc.aweme.compliance.api.ComplianceServiceProvider;
import com.ss.android.ugc.aweme.experiment.Mp4ScreenVideoLoadTimeout;
import com.ss.android.ugc.aweme.feed.assem.base.FeedBaseViewModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.feed.platform.cell.component.progress.IVideoPlayProgressAbility;
import com.ss.android.ugc.feed.platform.panel.midad.IMidAdAbility;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.AFwS190S0000000_4;
import kotlin.jvm.internal.AFwS225S0000000_34;
import kotlin.jvm.internal.AFwS281S0000000_34;
import kotlin.jvm.internal.AwS19S0002000_34;
import kotlin.jvm.internal.AwS46S0010000_34;

/* JADX INFO: loaded from: classes35.dex */
public final class MidAdVM extends FeedBaseViewModel<C2245781CvA> {
    public static final String LLJJIII;
    public Aweme LL;
    public Aweme LLILLJJLI;
    public long LLILLL = -1;
    public boolean LLILZ;
    public final MidAdRequestApi LLILZIL;
    public final C11NJ LLILZLL;
    public boolean LLIZ;
    public boolean LLIZLLLIL;
    public int LLJ;
    public int LLJI;
    public boolean LLJIJIL;
    public boolean LLJILJIL;
    public final C01GW LLJILJILJ;
    public final C01GW LLJILLL;
    public final C01GW LLJJ;
    public final ConcurrentHashMap<Long, ArrayList<C1A2W>> LLJJI;

    static {
        Object obj = new Object() { // from class: X.1CvD
        };
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MidAdVM@");
        sbLIZ.append(obj.hashCode());
        LLJJIII = C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C2245781CvA(0);
    }

    public final void resetState() {
        setState(new C2245751Cv7());
        this.LLIZ = false;
        this.LLIZLLLIL = false;
        this.LLJ = 0;
        this.LLJI = 0;
        this.LLILZ = false;
        this.LLJILJIL = false;
        this.LLJIJIL = false;
        String str = LLJJIII;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("[reset] aid=");
        Aweme aweme = this.LL;
        sbLIZ.append(aweme != null ? aweme.getAid() : null);
        sbLIZ.append(", isLong=");
        sbLIZ.append(C2245741Cv6.LIZIZ(this.LL));
        sbLIZ.append(", isMid=");
        sbLIZ.append(C2245741Cv6.LIZJ(this.LL));
        C1022620cia.LIZ(str, C2188811AlT.LIZIZ(sbLIZ));
    }

    public final boolean wQ2() {
        return ((Boolean) this.LLJILLL.getValue()).booleanValue();
    }

    public final boolean zQ2() {
        Long lXQ2;
        if (this.LLILLL == -1 && (lXQ2 = xQ2(this.LL)) != null) {
            lXQ2.longValue();
            Long lHQ2 = HQ2(this.LL);
            if (lHQ2 != null) {
                lHQ2.longValue();
                return false;
            }
        }
        return true;
    }

    public MidAdVM() {
        MidAdRequestApi.LIZ.getClass();
        this.LLILZIL = (MidAdRequestApi) ((IRetrofitFactory) ServiceManager.get().getService(IRetrofitFactory.class)).createBuilder(C0CQT.LIZJ).build().retrofit.LIZ(MidAdRequestApi.class);
        this.LLILZLL = new C11NJ();
        this.LLJILJILJ = C452501pT.LIZIZ(AFwS225S0000000_34.get$arr$(48));
        this.LLJILLL = C452501pT.LIZIZ(AFwS225S0000000_34.get$arr$(47));
        this.LLJJ = C452501pT.LIZIZ(AFwS190S0000000_4.get$arr$(961));
        this.LLJJI = new ConcurrentHashMap<>();
    }

    public final void GQ2() {
        String authorUid;
        String aid;
        Aweme aweme;
        InterfaceC1603020roi interfaceC1603020roiLIZIZ;
        boolean zLJI = MethodIDManager.LJI(131185);
        String str = LLJJIII;
        C1022620cia.LIZ(str, "[requestMidAd]");
        if (((Boolean) this.LLJJ.getValue()).booleanValue() && this.LLJIJIL) {
            C1022620cia.LIZIZ(str, "[requestMidAd] is requesting, no need to request again, return!");
            C1618220sDE c1618220sDE = C1618220sDE.LIZ;
            Aweme aweme2 = this.LL;
            requestId = aweme2 != null ? aweme2.getAid() : null;
            c1618220sDE.getClass();
            C1618220sDE.LIZIZ(requestId, "data_loading");
            if (zLJI) {
                MethodIDManager.LJ();
                return;
            }
            return;
        }
        Aweme aweme3 = this.LL;
        if (aweme3 == null || (authorUid = AwemeExtKt.getAuthorUid(aweme3)) == null) {
            if (zLJI) {
                MethodIDManager.LJ();
                return;
            }
            return;
        }
        Aweme aweme4 = this.LL;
        if (aweme4 == null || (aid = aweme4.getAid()) == null) {
            if (zLJI) {
                MethodIDManager.LJ();
                return;
            }
            return;
        }
        long j = CastLongProtector.parseLong(aid);
        IAdReRankServiceManagerService iAdReRankServiceManagerService = (IAdReRankServiceManagerService) ServiceManager.get().getService(IAdReRankServiceManagerService.class);
        if (iAdReRankServiceManagerService != null && (interfaceC1603020roiLIZIZ = iAdReRankServiceManagerService.LIZIZ(EnumC584610MwN.FEED)) != null) {
            interfaceC1603020roiLIZIZ.L4();
        }
        C1618220sDE c1618220sDE2 = C1618220sDE.LIZ;
        Aweme aweme5 = this.LL;
        String aid2 = aweme5 != null ? aweme5.getAid() : null;
        c1618220sDE2.getClass();
        if (aid2 != null) {
            C1618220sDE.LIZJ(new C2344009Gk(), aid2, "midroll_ads_request");
        }
        this.LLJIJIL = true;
        MidAdRequestApi midAdRequestApi = this.LLILZIL;
        C293430Ben.LIZ.getClass();
        int i = C293430Ben.LIZ() ? 16 : 0;
        String strU4 = ((IAdReRankServiceManagerService) ServiceManager.get().getService(IAdReRankServiceManagerService.class)).LIZIZ(EnumC584610MwN.FEED).U4();
        String strLJII = ComplianceServiceProvider.LJJI().LJII();
        String strLIZ = C1489110oqz.LIZ("feed");
        C258070A9l.LIZ.getClass();
        if (((Boolean) C258070A9l.LIZIZ.getValue()).booleanValue() && (aweme = this.LL) != null) {
            requestId = aweme.getRequestId();
        }
        this.LLILZLL.LIZ(midAdRequestApi.request(i, authorUid, strU4, j, strLJII, strLIZ, requestId).LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLL(new AfS203S0100000_34(this, 4), new AfS203S0100000_34(this, 5)));
        if (zLJI) {
            MethodIDManager.LJ();
        }
    }

    public static Long HQ2(Aweme aweme) {
        AwemeCommerceStruct commerceVideoAuthInfo;
        long requestMidAdTimeBeforeEnd;
        AwemeCommerceStruct commerceVideoAuthInfo2;
        if (C2245741Cv6.LIZ(aweme)) {
            long duration = C1483410ohn.LJLJJI().getDuration();
            if (aweme != null && (commerceVideoAuthInfo2 = aweme.getCommerceVideoAuthInfo()) != null) {
                requestMidAdTimeBeforeEnd = commerceVideoAuthInfo2.getRequestMidAdTimeBeforeEnd();
            } else {
                requestMidAdTimeBeforeEnd = 10;
            }
            return Long.valueOf(duration - requestMidAdTimeBeforeEnd);
        }
        if (aweme != null && (commerceVideoAuthInfo = aweme.getCommerceVideoAuthInfo()) != null) {
            return Long.valueOf(commerceVideoAuthInfo.getRequestMidAdTime());
        }
        return null;
    }

    public static Long xQ2(Aweme aweme) {
        AwemeCommerceStruct commerceVideoAuthInfo;
        if (C2245741Cv6.LIZ(aweme)) {
            return Long.valueOf(C1483410ohn.LJLJJI().getDuration());
        }
        if (aweme != null && (commerceVideoAuthInfo = aweme.getCommerceVideoAuthInfo()) != null) {
            return Long.valueOf(commerceVideoAuthInfo.getInsertAdTime());
        }
        return null;
    }

    public final void BQ2(C2245821CvE c2245821CvE) {
        String aid;
        AwemeRawAd awemeRawAd;
        C293440Beo.LIZ.getClass();
        if (C293440Beo.LIZ()) {
            return;
        }
        String str = LLJJIII;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("[onReachCountdownTimeOnce] count=");
        sbLIZ.append(this.LLJ + 1);
        sbLIZ.append('.');
        C1022620cia.LIZ(str, C2188811AlT.LIZIZ(sbLIZ));
        C1618220sDE c1618220sDE = C1618220sDE.LIZ;
        Aweme aweme = this.LL;
        String aid2 = null;
        if (aweme != null) {
            aid = aweme.getAid();
        } else {
            aid = null;
        }
        int i = this.LLJ + 1;
        this.LLJ = i;
        c1618220sDE.getClass();
        if (aid != null) {
            C2344009Gk c2344009Gk = new C2344009Gk();
            c2344009Gk.LIZJ(i, "count");
            C1618220sDE.LIZJ(c2344009Gk, aid, "reach_countdown_timing");
        }
        if (c2245821CvE.LIZIZ()) {
            Aweme aweme2 = this.LLILLJJLI;
            if (aweme2 != null) {
                awemeRawAd = aweme2.getAwemeRawAd();
            } else {
                awemeRawAd = null;
            }
            C1022820ciu c1022820ciuLIZLLL = C2184171Adz.LIZLLL("draw_ad", "show_fail", awemeRawAd);
            c1022820ciuLIZLLL.LIZIZ(c2245821CvE.LIZ(), "fail_reason");
            c1022820ciuLIZLLL.LJII();
            Aweme aweme3 = this.LL;
            if (aweme3 != null) {
                aid2 = aweme3.getAid();
            }
            String strLIZ = c2245821CvE.LIZ();
            if (aid2 != null && strLIZ != null) {
                C2344009Gk c2344009Gk2 = new C2344009Gk();
                c2344009Gk2.LJFF("fail_reason", strLIZ);
                C1618220sDE.LIZJ(c2344009Gk2, aid2, "midroll_ads_show_failed");
            }
            if (c2245821CvE.LIZJ()) {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("[onReachCountdownTimeOnce] countdownTime, isRealBlock=true, reason=");
                sbLIZ2.append(c2245821CvE.LIZ());
                C1022620cia.LIZIZ(str, C2188811AlT.LIZIZ(sbLIZ2));
                this.LLJILJIL = true;
            }
        }
    }

    public final void DQ2(C2245821CvE c2245821CvE) {
        String aid;
        String aid2;
        String aid3;
        InterfaceC1603020roi interfaceC1603020roiLIZIZ;
        AwemeCommerceStruct commerceVideoAuthInfo;
        String str = LLJJIII;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("[onReachRequestTimeOnce] count=");
        sbLIZ.append(this.LLJI + 1);
        sbLIZ.append('.');
        C1022620cia.LIZ(str, C2188811AlT.LIZIZ(sbLIZ));
        C1618220sDE c1618220sDE = C1618220sDE.LIZ;
        Aweme aweme = this.LL;
        String aid4 = null;
        if (aweme != null) {
            aid = aweme.getAid();
        } else {
            aid = null;
        }
        int i = this.LLJI + 1;
        this.LLJI = i;
        c1618220sDE.getClass();
        if (aid != null) {
            C2344009Gk c2344009Gk = new C2344009Gk();
            c2344009Gk.LIZJ(i, "count");
            C1618220sDE.LIZJ(c2344009Gk, aid, "reach_midroll_ads_request_timing");
        }
        if (this.LLJILJIL) {
            return;
        }
        if (this.LLILLJJLI == null) {
            if (c2245821CvE.LIZIZ()) {
                Aweme aweme2 = this.LL;
                if (aweme2 != null) {
                    aid4 = aweme2.getAid();
                }
                C1618220sDE.LIZIZ(aid4, c2245821CvE.LIZ());
                if (c2245821CvE.LIZJ()) {
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("[onPlayProgressChange] isRealBlock=true, reason=");
                    sbLIZ2.append(c2245821CvE.LIZ());
                    C1022620cia.LIZIZ(str, C2188811AlT.LIZIZ(sbLIZ2));
                    this.LLJILJIL = true;
                    return;
                }
                return;
            }
            Aweme aweme3 = this.LL;
            if (aweme3 != null && (commerceVideoAuthInfo = aweme3.getCommerceVideoAuthInfo()) != null) {
                Integer numValueOf = Integer.valueOf(commerceVideoAuthInfo.getDisableMidRollStatusCode());
                if (numValueOf.intValue() != 0) {
                    int iIntValue = numValueOf.intValue();
                    Aweme aweme4 = this.LL;
                    if (aweme4 != null) {
                        aid4 = aweme4.getAid();
                    }
                    C1618220sDE.LIZ(aid4, String.valueOf(iIntValue));
                    return;
                }
            }
            C274660Apc.LIZ.getClass();
            C293430Ben.LIZ.getClass();
            if (C293430Ben.LIZ() && ((Number) C274660Apc.LIZIZ.getValue()).intValue() == 1) {
                IAdReRankServiceManagerService iAdReRankServiceManagerService = (IAdReRankServiceManagerService) PluggableExtentionKt.pluggableSpi$default(IAdReRankServiceManagerService.class, false, false, false, 14, null);
                if (iAdReRankServiceManagerService != null && (interfaceC1603020roiLIZIZ = iAdReRankServiceManagerService.LIZIZ(EnumC584610MwN.FEED)) != null) {
                    interfaceC1603020roiLIZIZ.Z4(EnumC2245291CuN.ON_BEFORE_GET_POSTROLL);
                    return;
                }
                return;
            }
            HashMap<String, Aweme> map = C0N6Z.LIZ;
            Aweme aweme5 = this.LL;
            if (aweme5 != null && (aid3 = aweme5.getAid()) != null) {
                C0N6Z.LJFF.remove(aid3);
            }
            if (((Boolean) this.LLJILJILJ.getValue()).booleanValue()) {
                Aweme aweme6 = this.LL;
                if (aweme6 != null) {
                    aid2 = aweme6.getAid();
                } else {
                    aid2 = null;
                }
                Aweme awemeLIZIZ = C0N6Z.LIZIZ(aid2);
                if (awemeLIZIZ == null) {
                    C1022620cia.LIZ(str, "[onReachRequestTimeOnce] no cache, request.");
                    GQ2();
                    return;
                }
                Aweme aweme7 = this.LL;
                if (aweme7 != null) {
                    aid4 = aweme7.getAid();
                }
                C1618220sDE.LIZIZ(aid4, "exist_ads");
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("[onReachRequestTimeOnce] has cache, aid=");
                sbLIZ3.append(awemeLIZIZ.getAid());
                C1022620cia.LIZ(str, C2188811AlT.LIZIZ(sbLIZ3));
                setState(new AwS46S0010000_34(EQ2(awemeLIZIZ), 0));
                return;
            }
            GQ2();
            return;
        }
        Aweme aweme8 = this.LL;
        if (aweme8 != null) {
            aid4 = aweme8.getAid();
        }
        C1618220sDE.LIZIZ(aid4, "exist_ads");
    }

    public final boolean EQ2(Aweme aweme) {
        boolean z;
        List<Aweme> listMk;
        String creativeIdStr;
        IAdReRankServiceManagerService iAdReRankServiceManagerService;
        InterfaceC1603020roi interfaceC1603020roiLIZIZ;
        InterfaceC1603020roi interfaceC1603020roiLIZIZ2;
        long jLongValue;
        InterfaceC665370Q7z interfaceC665370Q7zLJ;
        IMidAdAbility iMidAdAbility;
        String aid;
        Boolean bool;
        C258060A9k.LIZ.getClass();
        if (((Number) C258060A9k.LIZIZ.getValue()).intValue() == 1) {
            z = true;
        } else {
            z = false;
        }
        String aid2 = null;
        if (z) {
            HashMap<String, Aweme> map = C0N6Z.LIZ;
            Aweme aweme2 = this.LL;
            if (aweme2 != null && (aid = aweme2.getAid()) != null && (bool = C0N6Z.LJFF.get(aid)) != null && bool.booleanValue()) {
                C1618220sDE c1618220sDE = C1618220sDE.LIZ;
                Aweme aweme3 = this.LL;
                if (aweme3 != null) {
                    aid2 = aweme3.getAid();
                }
                c1618220sDE.getClass();
                if (aid2 != null) {
                    C2344009Gk c2344009Gk = new C2344009Gk();
                    c2344009Gk.LJFF("reason", "slide_away");
                    C1618220sDE.LIZJ(c2344009Gk, aid2, "midroll_ads_receive_drop");
                }
                C1022620cia.LIZ(LLJJIII, "[onRequestFinish] drop new, reason=SLIDE_AWAY, return");
                return false;
            }
        }
        C1031030cw9 c1031030cw9 = C1031030cw9.LIZ;
        Fragment fragment = this.fragment;
        if (fragment != null && (interfaceC665370Q7zLJ = C1578630rBN.LJ(fragment)) != null && (iMidAdAbility = (IMidAdAbility) C1558520qew.LIZ(interfaceC665370Q7zLJ, IMidAdAbility.class, null)) != null) {
            listMk = iMidAdAbility.Mk();
        } else {
            listMk = null;
        }
        c1031030cw9.getClass();
        boolean zLIZ = C1031030cw9.LIZ(aweme, listMk);
        Aweme aweme4 = this.LL;
        if (aweme.getAwemeRawAd() != null) {
            Long lXQ2 = xQ2(aweme4);
            if (lXQ2 != null) {
                jLongValue = lXQ2.longValue();
            } else {
                jLongValue = 0;
            }
            ((IAdReRankServiceManagerService) ServiceManager.get().getService(IAdReRankServiceManagerService.class)).LIZIZ(EnumC584610MwN.FEED).Q4(jLongValue, C1483410ohn.LJLJJI().getDuration(), aweme.getAwemeRawAd());
        }
        if (!zLIZ) {
            C1618220sDE c1618220sDE2 = C1618220sDE.LIZ;
            Aweme aweme5 = this.LL;
            if (aweme5 != null) {
                aid2 = aweme5.getAid();
            }
            c1618220sDE2.getClass();
            if (aid2 != null) {
                C2344009Gk c2344009Gk2 = new C2344009Gk();
                c2344009Gk2.LJFF("reason", "001_ad_filter");
                C1618220sDE.LIZJ(c2344009Gk2, aid2, "midroll_ads_receive_drop");
            }
            return false;
        }
        C1483340ohg.LJIL(0, aweme);
        C1024380clQ c1024380clQ = C1024380clQ.LIZ;
        C1024380clQ.LJIILIIL(C1697810uHb.LJ(aweme), "", null);
        this.LLILLJJLI = aweme;
        HashMap<String, Aweme> map2 = C0N6Z.LIZ;
        AwemeRawAd awemeRawAd = aweme.getAwemeRawAd();
        if (awemeRawAd != null) {
            creativeIdStr = awemeRawAd.getCreativeIdStr();
        } else {
            creativeIdStr = null;
        }
        Aweme aweme6 = this.LL;
        if (aweme6 != null && creativeIdStr != null) {
            C0N6Z.LIZ.put(creativeIdStr, aweme6);
        }
        String aid3 = aweme.getAid();
        if (aid3 != null) {
            C0N6Z.LIZJ.put(aid3, aweme);
        }
        IAdReRankServiceManagerService iAdReRankServiceManagerService2 = (IAdReRankServiceManagerService) ServiceManager.get().getService(IAdReRankServiceManagerService.class);
        if (iAdReRankServiceManagerService2 != null && (interfaceC1603020roiLIZIZ2 = iAdReRankServiceManagerService2.LIZIZ(EnumC584610MwN.FEED)) != null) {
            Aweme aweme7 = this.LL;
            if (aweme7 != null) {
                aid2 = aweme7.getAid();
            }
            interfaceC1603020roiLIZIZ2.Y4(aweme, aid2);
        }
        C293460Beq.LIZ.getClass();
        if ((C293460Beq.LIZIZ() || C293460Beq.LIZ()) && (iAdReRankServiceManagerService = (IAdReRankServiceManagerService) ServiceManager.get().getService(IAdReRankServiceManagerService.class)) != null && (interfaceC1603020roiLIZIZ = iAdReRankServiceManagerService.LIZIZ(EnumC584610MwN.FEED)) != null) {
            interfaceC1603020roiLIZIZ.Z4(EnumC2245291CuN.ON_GET_POSTROLL);
        }
        C1019400cdO.LJFF("mid_roll", Collections.singletonList(aweme));
        return true;
    }

    public final void IQ2(IVideoPlayProgressAbility iVideoPlayProgressAbility) {
        ConcurrentHashMap<Long, ArrayList<C1A2W>> concurrentHashMap;
        if (wQ2() && iVideoPlayProgressAbility != null && (concurrentHashMap = this.LLJJI) != null && !concurrentHashMap.isEmpty()) {
            C1022620cia.LIZ(LLJJIII, "[unregisterProgressObserver]");
            for (Map.Entry<Long, ArrayList<C1A2W>> entry : this.LLJJI.entrySet()) {
                long jLongValue = entry.getKey().longValue();
                ArrayList<C1A2W> value = entry.getValue();
                if (value != null) {
                    Iterator<C1A2W> it2 = value.iterator();
                    while (it2.hasNext()) {
                        iVideoPlayProgressAbility.l50(jLongValue, it2.next());
                    }
                }
            }
            this.LLJJI.clear();
        }
    }

    public final void vQ2(Aweme aweme) {
        long jLongValue;
        AwemeRawAd awemeRawAd;
        String creativeIdStr;
        Long l;
        AwemeRawAd awemeRawAd2;
        String aid;
        Long lHQ2;
        Long lXQ2;
        Integer numValueOf;
        Video video;
        String aid2;
        Long lValueOf;
        Integer numValueOf2;
        Video video2;
        AwemeCommerceStruct commerceVideoAuthInfo;
        String creativeIdStr2 = null;
        if (C2245741Cv6.LIZIZ(aweme)) {
            if (C2245741Cv6.LIZ(aweme)) {
                String str = LLJJIII;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("[bind] aid=");
                if (aweme != null) {
                    aid2 = aweme.getAid();
                } else {
                    aid2 = null;
                }
                sbLIZ.append(aid2);
                sbLIZ.append(", requestMidAdTimeBeforeEnd=");
                if (aweme != null && (commerceVideoAuthInfo = aweme.getCommerceVideoAuthInfo()) != null) {
                    lValueOf = Long.valueOf(commerceVideoAuthInfo.getRequestMidAdTimeBeforeEnd());
                } else {
                    lValueOf = null;
                }
                sbLIZ.append(lValueOf);
                sbLIZ.append(", videoLength=");
                if (aweme != null && (video2 = aweme.getVideo()) != null) {
                    numValueOf2 = Integer.valueOf(video2.getVideoLength());
                } else {
                    numValueOf2 = null;
                }
                sbLIZ.append(numValueOf2);
                C1022620cia.LIZ(str, C2188811AlT.LIZIZ(sbLIZ));
            } else {
                String str2 = LLJJIII;
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("[bind] aid=");
                if (aweme != null) {
                    aid = aweme.getAid();
                } else {
                    aid = null;
                }
                sbLIZ2.append(aid);
                sbLIZ2.append(", requestTime=");
                if (aweme != null) {
                    lHQ2 = HQ2(aweme);
                } else {
                    lHQ2 = null;
                }
                sbLIZ2.append(lHQ2);
                sbLIZ2.append(", insertTime=");
                if (aweme != null) {
                    lXQ2 = xQ2(aweme);
                } else {
                    lXQ2 = null;
                }
                sbLIZ2.append(lXQ2);
                sbLIZ2.append(", videoLength=");
                if (aweme != null && (video = aweme.getVideo()) != null) {
                    numValueOf = Integer.valueOf(video.getVideoLength());
                } else {
                    numValueOf = null;
                }
                sbLIZ2.append(numValueOf);
                C1022620cia.LIZ(str2, C2188811AlT.LIZIZ(sbLIZ2));
            }
        } else {
            C1022620cia.LIZ(LLJJIII, "[bind] postroll");
        }
        this.LL = aweme;
        this.LLILLJJLI = null;
        this.LLILLL = -1L;
        this.LLJIJIL = false;
        this.LLJI = 0;
        this.LLJ = 0;
        if (C2245741Cv6.LIZJ(aweme)) {
            HashMap<String, Aweme> map = C0N6Z.LIZ;
            if (aweme != null && (awemeRawAd2 = aweme.getAwemeRawAd()) != null) {
                creativeIdStr2 = awemeRawAd2.getCreativeIdStr();
            }
            this.LLILLJJLI = C0N6Z.LIZ(creativeIdStr2);
            if (aweme != null && (awemeRawAd = aweme.getAwemeRawAd()) != null && (creativeIdStr = awemeRawAd.getCreativeIdStr()) != null && (l = C0N6Z.LIZLLL.get(creativeIdStr)) != null) {
                jLongValue = l.longValue();
            } else {
                jLongValue = 0;
            }
            this.LLILLL = jLongValue;
        }
    }

    public static void FQ2(ConcurrentHashMap concurrentHashMap, long j, C1A2W c1a2w) {
        if (concurrentHashMap.get(Long.valueOf(j)) == null) {
            concurrentHashMap.put(Long.valueOf(j), new ArrayList());
        }
        ArrayList arrayList = (ArrayList) concurrentHashMap.get(Long.valueOf(j));
        if (arrayList != null) {
            arrayList.add(c1a2w);
        }
        if (concurrentHashMap.get(Long.valueOf(j)) == null) {
            new ArrayList();
        }
    }

    public final void CQ2(C2245821CvE c2245821CvE, long j, long j2) {
        AwemeRawAd awemeRawAd;
        String creativeIdStr;
        C293440Beo.LIZ.getClass();
        if (C293440Beo.LIZ()) {
            return;
        }
        C1022620cia.LIZ(LLJJIII, "[onReachInsertTimeOnce]");
        if (!c2245821CvE.LIZIZ()) {
            if ((C2245741Cv6.LIZ(this.LL) || j <= j2 + 350) && this.LLILZ && !this.LLJILJIL) {
                this.LLILLL = j;
                HashMap<String, Aweme> map = C0N6Z.LIZ;
                Aweme aweme = this.LLILLJJLI;
                if (aweme != null && (awemeRawAd = aweme.getAwemeRawAd()) != null && (creativeIdStr = awemeRawAd.getCreativeIdStr()) != null) {
                    C0N6Z.LIZLLL.put(creativeIdStr, Long.valueOf(j));
                }
                setStateImmediate(AFwS281S0000000_34.get$arr$(14));
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void yQ2(long j, C2245821CvE c2245821CvE, boolean z) {
        Aweme aweme;
        AwemeRawAd awemeRawAd;
        Integer numValueOf;
        Long lXQ2;
        C2245781CvA c2245781CvA = (C2245781CvA) getState();
        if (C2245741Cv6.LIZIZ(this.LL)) {
            if (this.LLILLL == -1 && (lXQ2 = xQ2(this.LL)) != null) {
                long jLongValue = lXQ2.longValue();
                long j2 = jLongValue - Mp4ScreenVideoLoadTimeout.CONTROL;
                Long lHQ2 = HQ2(this.LL);
                if (lHQ2 != null) {
                    long jLongValue2 = lHQ2.longValue();
                    if ((j2 > j || j > jLongValue) && this.LLILZ) {
                        setState(AFwS281S0000000_34.get$arr$(12));
                    }
                    if (C2245741Cv6.LIZ(this.LL) && z) {
                        CQ2(c2245821CvE, j, jLongValue);
                        return;
                    }
                    if (!C2245741Cv6.LIZ(this.LL) && j > jLongValue) {
                        if (wQ2()) {
                            return;
                        }
                        CQ2(c2245821CvE, j, jLongValue);
                        return;
                    }
                    if (j > j2) {
                        if (wQ2()) {
                            return;
                        }
                        C293440Beo.LIZ.getClass();
                        if (C293440Beo.LIZ()) {
                            return;
                        }
                        if (!this.LLIZLLLIL && j < j2 + 350) {
                            this.LLIZLLLIL = true;
                            BQ2(c2245821CvE);
                        }
                        AQ2(c2245821CvE, j, jLongValue, c2245781CvA);
                        return;
                    }
                    if (j > jLongValue2 && !wQ2() && !this.LLIZ && j < jLongValue2 + 350) {
                        this.LLIZ = true;
                        DQ2(c2245821CvE);
                        return;
                    }
                    return;
                }
                return;
            }
            return;
        }
        if (C2245741Cv6.LIZJ(this.LL) && (aweme = this.LL) != null && (awemeRawAd = aweme.getAwemeRawAd()) != null && (numValueOf = Integer.valueOf(awemeRawAd.getSkipAdTime())) != null) {
            int iIntValue = numValueOf.intValue();
            Integer num = c2245781CvA.LLILLL.LIZ;
            if (num == null || num.intValue() != 0) {
                Integer num2 = c2245781CvA.LLILLL.LIZ;
                int i = -1;
                if (num2 != null && num2.intValue() == -1) {
                    return;
                }
                if (iIntValue != -1) {
                    i = (int) (((long) (iIntValue / LSPassThroughRecordSizeConfig.DEFAULT)) - (j / ((long) LSPassThroughRecordSizeConfig.DEFAULT)));
                }
                setStateImmediate(new AwS19S0002000_34(i, iIntValue, 0));
            }
        }
    }

    public final void AQ2(C2245821CvE c2245821CvE, long j, long j2, C2245781CvA c2245781CvA) {
        if (C587970N4h.LIZ() || c2245821CvE.LJIIIIZZ) {
            setStateImmediate(AFwS281S0000000_34.get$arr$(13));
        }
        if (c2245781CvA.LL.LIZ.booleanValue() && !this.LLJILJIL) {
            this.LLILZ = true;
            setStateImmediate(new C2245731Cv5(this, j2, j));
        }
    }
}
