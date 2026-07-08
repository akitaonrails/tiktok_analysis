package com.ss.android.ugc.aweme.ad.feed.adexperience;

import X.C01GW;
import X.C04TD;
import X.C1001190cA1;
import X.C1009530cNT;
import X.C1017070cZd;
import X.C1023960ckk;
import X.C1048450dOF;
import X.C1048520dOM;
import X.C1048530dON;
import X.C1048540dOO;
import X.C1048560dOQ;
import X.C1048570dOR;
import X.C1048580dOS;
import X.C1048590dOT;
import X.C1048600dOU;
import X.C1048720dOg;
import X.C1064370dnv;
import X.C1064390dnx;
import X.C13LP;
import X.C13LQ;
import X.C1906207dM;
import X.C2097908Jt;
import X.C2188811AlT;
import X.C452501pT;
import X.C603820NmG;
import X.C844470XAv;
import X.C987610bo7;
import X.EnumC2245291CuN;
import X.EnumC584610MwN;
import X.InterfaceC1009590cNZ;
import X.InterfaceC1048460dOG;
import X.InterfaceC1064430do1;
import X.InterfaceC1603020roi;
import X.InterfaceC987400bnm;
import android.content.Context;
import android.text.TextUtils;
import android.widget.FrameLayout;
import com.bytedance.android.livesdk.model.AdLiveEnterRoomConfig;
import com.bytedance.ies.ugc.aweme.commercialize.intelligence.IAdReRankServiceManagerService;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.IAnoleManager;
import com.ss.android.ugc.aweme.ad.feed.adexperience.ImageInfo;
import com.ss.android.ugc.aweme.ad.feed.adexperience.acesurvey.AdAceSurveyBottomBarAssemTrigger;
import com.ss.android.ugc.aweme.ad.feed.adexperience.event.AdExperienceEventLogger;
import com.ss.android.ugc.aweme.comment.model.Comment;
import com.ss.android.ugc.aweme.commercialize.depend.AdTaskDependImpl;
import com.ss.android.ugc.aweme.commercialize.model.AdDislikeInfo;
import com.ss.android.ugc.aweme.commercialize.model.AdReportInfo;
import com.ss.android.ugc.aweme.commercialize.service.IAdPhotoModeService;
import com.ss.android.ugc.aweme.commercialize.tasks.IAdTaskDepend;
import com.ss.android.ugc.aweme.commercialize.video.IVideoPlayTaskManager;
import com.ss.android.ugc.aweme.compliance.api.services.settings.IComplianceSettingsService;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.feed.model.commercialize.adexperience.CommerceAceSurveyInfo;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.feed.platform.container.protocol.priority.BottomBarPriorityProtocol;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS67S1000000_16;
import kotlin.text.a0;
import org.greenrobot.eventbus.EventBus;

/* JADX INFO: loaded from: classes17.dex */
public final class CommerceAdExperienceServiceImpl implements ICommerceAdExperienceService {
    public final String LIZ = "001";
    public final C01GW LIZIZ = C452501pT.LIZIZ(new C1009530cNT());

    public static ICommerceAdExperienceService LIZ() {
        Object objLIZ = C04TD.LIZ(ICommerceAdExperienceService.class, false);
        if (objLIZ != null) {
            return (ICommerceAdExperienceService) objLIZ;
        }
        if (C04TD.LJLJLJ == null) {
            synchronized (ICommerceAdExperienceService.class) {
                if (C04TD.LJLJLJ == null) {
                    C04TD.LJLJLJ = new CommerceAdExperienceServiceImpl();
                }
            }
        }
        return C04TD.LJLJLJ;
    }

    @Override // com.ss.android.ugc.aweme.ad.feed.adexperience.ICommerceAdExperienceService
    public final BottomBarPriorityProtocol Y2() {
        return new AdAceSurveyBottomBarAssemTrigger();
    }

    @Override // com.ss.android.ugc.aweme.ad.feed.adexperience.ICommerceAdExperienceService
    public final boolean R2(Aweme aweme) {
        AwemeRawAd awemeRawAd;
        if (!AwemeExtKt.isAdTraffic(aweme) || (awemeRawAd = aweme.getAwemeRawAd()) == null || !awemeRawAd.isAdvertiserDisbaleTranslation()) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.ad.feed.adexperience.ICommerceAdExperienceService
    public final InterfaceC987400bnm V2(final C987610bo7 c987610bo7) {
        return new InterfaceC987400bnm(c987610bo7) { // from class: X.0dP9
            public final InterfaceC988720bpu LL;
            public C1048750dOj LLILLJJLI;
            public C1049020dPA LLILLL;

            @Override // X.InterfaceC987400bnm
            public final void LJJLJLI() {
            }

            @Override // X.InterfaceC987400bnm
            public final void bind() {
            }

            @Override // X.InterfaceC1037910d7F
            public final void initialize() {
            }

            @Override // X.InterfaceC987400bnm
            public final C0SCN HG0() {
                if (this.LLILLJJLI == null) {
                    this.LLILLJJLI = new C1048750dOj(this.LL);
                }
                return this.LLILLJJLI;
            }

            @Override // X.InterfaceC987400bnm
            public final C1049020dPA PC() {
                C1049020dPA c1049020dPA = this.LLILLL;
                if (c1049020dPA != null) {
                    return c1049020dPA;
                }
                C1049020dPA c1049020dPA2 = new C1049020dPA(this.LL);
                this.LLILLL = c1049020dPA2;
                return c1049020dPA2;
            }

            @Override // X.InterfaceC987400bnm
            public final void onDestroy() {
                IVideoPlayTaskManager iVideoPlayTaskManager;
                C1048750dOj c1048750dOj = this.LLILLJJLI;
                if (c1048750dOj != null && EventBus.LIZLLL().LJIIJ(c1048750dOj)) {
                    EventBus.LIZLLL().LJJI(c1048750dOj);
                }
                C1049020dPA c1049020dPA = this.LLILLL;
                if (c1049020dPA == null || (iVideoPlayTaskManager = (IVideoPlayTaskManager) c1049020dPA.LLJIJIL.getValue()) == null) {
                    return;
                }
                iVideoPlayTaskManager.reset();
            }

            @Override // X.InterfaceC987400bnm
            public final void unBind() {
                C20286814Zm c20286814Zm;
                InterfaceC1008930cMV interfaceC1008930cMVLIZ;
                IAnoleManager iAnoleManagerRi;
                C1048750dOj c1048750dOj = this.LLILLJJLI;
                if (c1048750dOj != null) {
                    AnonymousClass0956 anonymousClass0956 = c1048750dOj.LLJJJJ;
                    if (anonymousClass0956 != null) {
                        anonymousClass0956.LIZIZ(null);
                    }
                    if (EventBus.LIZLLL().LJIIJ(c1048750dOj)) {
                        EventBus.LIZLLL().LJJI(c1048750dOj);
                    }
                }
                C1049020dPA c1049020dPA = this.LLILLL;
                if (c1049020dPA != null) {
                    C1049110dPJ c1049110dPJLJIJ = c1049020dPA.LJIJ();
                    if (!a0.LJJJIL(c1049110dPJLJIJ.LIZIZ()) && C693790RJh.LIZ(c1049110dPJLJIJ.LIZIZ).contains(c1049110dPJLJIJ.LIZIZ()) && (interfaceC1008930cMVLIZ = c1049110dPJLJIJ.LIZ()) != null && (iAnoleManagerRi = interfaceC1008930cMVLIZ.Ri()) != null) {
                        iAnoleManagerRi.LJIIJJI(c1049110dPJLJIJ.LIZIZ());
                    }
                    c1049110dPJLJIJ.LIZIZ = null;
                    c1049020dPA.LJIJI();
                    C1049060dPE c1049060dPE = c1049020dPA.LLJ;
                    AbstractC19368810q6 abstractC19368810q6 = c1049060dPE != null ? c1049060dPE.LJII : null;
                    if ((abstractC19368810q6 instanceof C20286814Zm) && (c20286814Zm = (C20286814Zm) abstractC19368810q6) != null) {
                        c20286814Zm.LJIJI();
                    }
                    FrameLayout frameLayout = c1049020dPA.LLILZLL;
                    if (frameLayout != null) {
                        frameLayout.removeOnLayoutChangeListener(c1049020dPA.LLJILJIL);
                    }
                    FrameLayout frameLayout2 = c1049020dPA.LLILZLL;
                    if (frameLayout2 != null) {
                        frameLayout2.setTag(null);
                    }
                    IVideoPlayTaskManager iVideoPlayTaskManager = (IVideoPlayTaskManager) c1049020dPA.LLJIJIL.getValue();
                    if (iVideoPlayTaskManager != null) {
                        iVideoPlayTaskManager.reset();
                    }
                }
            }

            @Override // X.InterfaceC1010530cP5
            public final /* bridge */ /* synthetic */ InterfaceC988720bpu Mh() {
                return this.LL;
            }

            {
                this.LL = c987610bo7;
            }

            @Override // X.InterfaceC987400bnm
            public final void Hf(int i) {
                TuxTextView tuxTextView;
                C1049020dPA c1049020dPA = this.LLILLL;
                if (c1049020dPA != null) {
                    c1049020dPA.LJIJJ();
                    if (!c1049020dPA.isShowing() && (tuxTextView = c1049020dPA.LLILZIL) != null) {
                        C786410Ut5.LLLLZLL(tuxTextView, 8);
                    }
                }
            }
        };
    }

    @Override // com.ss.android.ugc.aweme.ad.feed.adexperience.ICommerceAdExperienceService
    public final String X2(AwemeRawAd awemeRawAd) {
        if (awemeRawAd == null) {
            return null;
        }
        return C1048560dOQ.LIZ(awemeRawAd);
    }

    @Override // com.ss.android.ugc.aweme.ad.feed.adexperience.ICommerceAdExperienceService
    public final boolean Z2(Aweme aweme) {
        CommerceAceSurveyInfo commerceAceSurveyInfoLIZIZ;
        Integer styleType;
        C603820NmG<String, C1048580dOS> c603820NmG;
        C1048580dOS c1048580dOSLIZJ;
        Integer styleType2;
        if (aweme == null || C1048600dOU.LIZLLL(aweme) || !AwemeExtKt.isAdTraffic(aweme) || (commerceAceSurveyInfoLIZIZ = C1048600dOU.LIZIZ(aweme)) == null || (styleType = commerceAceSurveyInfoLIZIZ.getStyleType()) == null || styleType.intValue() != 1) {
            return false;
        }
        C01GW<C1048720dOg> c01gw = C1048720dOg.LIZJ;
        if (C1048570dOR.LIZ().LIZIZ(C1048600dOU.LIZJ(aweme))) {
            return false;
        }
        if (!C1017070cZd.LLIILZL(aweme) && !C1017070cZd.LLFZ(aweme) && !C1017070cZd.LLLILZJ(aweme)) {
            CommerceAceSurveyInfo commerceAceSurveyInfoLIZIZ2 = C1048600dOU.LIZIZ(aweme);
            if (commerceAceSurveyInfoLIZIZ2 == null || (styleType2 = commerceAceSurveyInfoLIZIZ2.getStyleType()) == null || styleType2.intValue() != 1) {
                return false;
            }
            return true;
        }
        C1048720dOg c1048720dOgLIZ = C1048570dOR.LIZ();
        String strLIZJ = C1048600dOU.LIZJ(aweme);
        if (strLIZJ == null) {
            c1048720dOgLIZ.getClass();
            return false;
        }
        C603820NmG<String, C1048580dOS> c603820NmG2 = c1048720dOgLIZ.LIZ;
        if ((c603820NmG2 == null || c603820NmG2.LIZJ(strLIZJ) == null) && (c603820NmG = c1048720dOgLIZ.LIZ) != null) {
            c603820NmG.LIZLLL(strLIZJ, new C1048580dOS(0));
        }
        C603820NmG<String, C1048580dOS> c603820NmG3 = c1048720dOgLIZ.LIZ;
        if (c603820NmG3 == null || (c1048580dOSLIZJ = c603820NmG3.LIZJ(strLIZJ)) == null || c1048580dOSLIZJ.LIZ) {
            return false;
        }
        AdExperienceEventLogger adExperienceEventLogger = new AdExperienceEventLogger(new Object[]{aweme});
        C1048520dOM.LIZ.getClass();
        adExperienceEventLogger.logAd(C1048520dOM.LJII);
        c1048580dOSLIZJ.LIZ = true;
        return false;
    }

    @Override // com.ss.android.ugc.aweme.ad.feed.adexperience.ICommerceAdExperienceService
    public final boolean b3(Aweme aweme) {
        if (aweme == null || !C1048600dOU.LIZLLL(aweme)) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.ad.feed.adexperience.ICommerceAdExperienceService
    public final C1048590dOT e3(Aweme aweme) {
        String surveyBgCover;
        CommerceAceSurveyInfo commerceAceSurveyInfoLIZIZ;
        if (aweme != null && (commerceAceSurveyInfoLIZIZ = C1048600dOU.LIZIZ(aweme)) != null) {
            surveyBgCover = commerceAceSurveyInfoLIZIZ.getSurveyBgCover();
        } else {
            surveyBgCover = null;
        }
        return new C1048590dOT(surveyBgCover);
    }

    @Override // com.ss.android.ugc.aweme.ad.feed.adexperience.ICommerceAdExperienceService
    public final List<String> f3(Aweme aweme) {
        ArrayList<String> geckoChannel;
        List<String> listLLIIII;
        if (aweme != null) {
            CommerceAceSurveyInfo commerceAceSurveyInfoLIZIZ = C1048600dOU.LIZIZ(aweme);
            if (commerceAceSurveyInfoLIZIZ == null || (geckoChannel = commerceAceSurveyInfoLIZIZ.getGeckoChannel()) == null || (listLLIIII = C13LP.LLIIII(geckoChannel)) == null) {
                return new ArrayList();
            }
            return listLLIIII;
        }
        return new ArrayList();
    }

    @Override // com.ss.android.ugc.aweme.ad.feed.adexperience.ICommerceAdExperienceService
    public final boolean g3(Aweme aweme) {
        if (aweme != null) {
            return C1048600dOU.LJ(aweme);
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.ad.feed.adexperience.ICommerceAdExperienceService
    public final C1048590dOT i3(Aweme aweme) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("res://");
        C844470XAv.LIZ.getClass();
        sbLIZ.append(C844470XAv.LIZ().getPackageName());
        sbLIZ.append('/');
        sbLIZ.append(R.drawable.ajc);
        return new C1048590dOT(C2188811AlT.LIZIZ(sbLIZ));
    }

    @Override // com.ss.android.ugc.aweme.ad.feed.adexperience.ICommerceAdExperienceService
    public final void c3(final Context context, final Comment comment) {
        C1064390dnx.LIZ.getClass();
        new C1048450dOF(new InterfaceC1048460dOG(context, comment) { // from class: X.0dOL
            public final Context LIZ;
            public final String LIZIZ;
            public final String LIZJ;
            public final String LIZLLL;
            public final String LJ;
            public final String LJFF;
            public final Integer LJI;
            public final Map<String, Object> LJII;
            public final /* synthetic */ Comment LJIIIIZZ;

            @Override // X.InterfaceC1048460dOG
            public final List<ImageInfo> getImageInfos() {
                return null;
            }

            @Override // X.InterfaceC1048460dOG
            public final String getRoomId() {
                return null;
            }

            @Override // X.InterfaceC1048460dOG
            public final AdReportInfo LIZ() {
                AwemeRawAd awemeRawAd;
                AdReportInfo reportInfo;
                Comment comment2 = this.LJIIIIZZ;
                if (comment2 == null || (awemeRawAd = comment2.getAwemeRawAd()) == null || (reportInfo = awemeRawAd.getReportInfo()) == null) {
                    return null;
                }
                IComplianceSettingsService iComplianceSettingsService = (IComplianceSettingsService) PluggableExtentionKt.pluggableSpi$default(IComplianceSettingsService.class, false, false, false, 14, null);
                boolean z = false;
                if (iComplianceSettingsService != null && iComplianceSettingsService.LJIILJJIL()) {
                    z = true;
                }
                return reportInfo.copy(z, reportInfo.ttplusBannerImage, reportInfo.ttplusBannerTitle, reportInfo.ttplusBannerGuide, reportInfo.ttplusBannerOpenSchema);
            }

            @Override // X.InterfaceC1048460dOG
            public final Integer LIZIZ() {
                return this.LJI;
            }

            @Override // X.InterfaceC1048460dOG
            public final String getAid() {
                return this.LIZIZ;
            }

            @Override // X.InterfaceC1048460dOG
            public final String getAuthorId() {
                return this.LIZJ;
            }

            @Override // X.InterfaceC1048460dOG
            public final String getCid() {
                return this.LIZLLL;
            }

            @Override // X.InterfaceC1048460dOG
            public final Context getContext() {
                return this.LIZ;
            }

            @Override // X.InterfaceC1048460dOG
            public final Map<String, Object> getExtraParam() {
                return this.LJII;
            }

            @Override // X.InterfaceC1048460dOG
            public final String getLogExtra() {
                return this.LJ;
            }

            @Override // X.InterfaceC1048460dOG
            public final String getReportFrom() {
                return this.LJFF;
            }

            {
                String uid;
                String string;
                String logExtra;
                AwemeRawAd awemeRawAd;
                AwemeRawAd awemeRawAd2;
                AwemeRawAd awemeRawAd3;
                Long creativeId;
                User user;
                AwemeRawAd awemeRawAd4;
                String itemId;
                this.LJIIIIZZ = comment;
                this.LIZ = context;
                Integer numValueOf = null;
                this.LIZIZ = (comment == null || (awemeRawAd4 = comment.getAwemeRawAd()) == null || (itemId = awemeRawAd4.getItemId()) == null) ? null : itemId;
                if (comment != null && (user = comment.getUser()) != null) {
                    uid = user.getUid();
                } else {
                    uid = null;
                }
                this.LIZJ = uid;
                if (comment != null && (awemeRawAd3 = comment.getAwemeRawAd()) != null && (creativeId = awemeRawAd3.getCreativeId()) != null) {
                    string = creativeId.toString();
                } else {
                    string = null;
                }
                this.LIZLLL = string;
                if (comment != null && (awemeRawAd2 = comment.getAwemeRawAd()) != null) {
                    logExtra = awemeRawAd2.getLogExtra();
                } else {
                    logExtra = null;
                }
                this.LJ = logExtra;
                this.LJFF = "comment_ad";
                if (comment != null && (awemeRawAd = comment.getAwemeRawAd()) != null) {
                    numValueOf = Integer.valueOf(awemeRawAd.getReportAdType());
                }
                this.LJI = numValueOf;
                this.LJII = C2097608Jq.LJ();
            }
        }).LIZ();
    }

    @Override // com.ss.android.ugc.aweme.ad.feed.adexperience.ICommerceAdExperienceService
    public final void d3(Aweme aweme, String str) {
        C1048530dON c1048530dON = new C1048530dON(aweme);
        C1048540dOO.LIZ.getClass();
        c1048530dON.log(C1048540dOO.LIZIZ, new AwS67S1000000_16(str, 35));
    }

    @Override // com.ss.android.ugc.aweme.ad.feed.adexperience.ICommerceAdExperienceService
    public final void W2(final Context context, final AdLiveEnterRoomConfig adLiveEnterRoomConfig, final String str) {
        C1064390dnx.LIZ.getClass();
        new C1048450dOF(new InterfaceC1048460dOG(context, adLiveEnterRoomConfig, str) { // from class: X.0dOI
            public final Context LIZ;
            public final String LIZIZ;
            public final String LIZJ;
            public final String LIZLLL;
            public final String LJ;
            public final String LJFF;
            public final Map<String, Object> LJI;
            public final /* synthetic */ AdLiveEnterRoomConfig LJII;

            @Override // X.InterfaceC1048460dOG
            public final Integer LIZIZ() {
                return null;
            }

            @Override // X.InterfaceC1048460dOG
            public final List<ImageInfo> getImageInfos() {
                return null;
            }

            @Override // X.InterfaceC1048460dOG
            public final String getReportFrom() {
                return "live_ad";
            }

            /* JADX WARN: Removed duplicated region for block: B:21:0x0058  */
            @Override // X.InterfaceC1048460dOG
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final com.ss.android.ugc.aweme.commercialize.model.AdReportInfo LIZ() {
                /*
                    r12 = this;
                    com.bytedance.android.livesdk.model.AdLiveEnterRoomConfig r2 = r12.LJII
                    r0 = 0
                    com.ss.android.ugc.aweme.utils.GsonProvider r1 = X.C7740030o.LIZ()     // Catch: java.lang.Throwable -> L1d
                    com.google.gson.Gson r3 = r1.getGson()     // Catch: java.lang.Throwable -> L1d
                    if (r2 == 0) goto L1b
                    java.lang.String r2 = r2.adReportInfo     // Catch: java.lang.Throwable -> L1d
                Lf:
                    java.lang.Class<com.ss.android.ugc.aweme.commercialize.model.AdReportInfo> r1 = com.ss.android.ugc.aweme.commercialize.model.AdReportInfo.class
                    java.lang.Object r6 = r3.LJII(r2, r1)     // Catch: java.lang.Throwable -> L1d
                    com.ss.android.ugc.aweme.commercialize.model.AdReportInfo r6 = (com.ss.android.ugc.aweme.commercialize.model.AdReportInfo) r6     // Catch: java.lang.Throwable -> L1d
                    X.C189200o6.m2constructorimpl(r6)     // Catch: java.lang.Throwable -> L1d
                    goto L29
                L1b:
                    r2 = r0
                    goto Lf
                L1d:
                    r1 = move-exception
                    com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r1)
                    X.00Yq r6 = new X.00Yq
                    r6.<init>(r1)
                    X.C189200o6.m2constructorimpl(r6)
                L29:
                    boolean r1 = X.C189200o6.m7isFailureimpl(r6)
                    if (r1 == 0) goto L30
                    r6 = r0
                L30:
                    com.ss.android.ugc.aweme.commercialize.model.AdReportInfo r6 = (com.ss.android.ugc.aweme.commercialize.model.AdReportInfo) r6
                    if (r6 == 0) goto L57
                    java.lang.Class<com.ss.android.ugc.aweme.compliance.api.services.settings.IComplianceSettingsService> r0 = com.ss.android.ugc.aweme.compliance.api.services.settings.IComplianceSettingsService.class
                    r1 = 0
                    r4 = 14
                    r5 = 0
                    r2 = r1
                    r3 = r1
                    java.lang.Object r0 = com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt.pluggableSpi$default(r0, r1, r2, r3, r4, r5)
                    com.ss.android.ugc.aweme.compliance.api.services.settings.IComplianceSettingsService r0 = (com.ss.android.ugc.aweme.compliance.api.services.settings.IComplianceSettingsService) r0
                    if (r0 == 0) goto L58
                    boolean r0 = r0.LJIILJJIL()
                    r7 = 1
                    if (r0 != r7) goto L58
                L4b:
                    java.lang.String r8 = r6.ttplusBannerImage
                    java.lang.String r9 = r6.ttplusBannerTitle
                    java.lang.String r10 = r6.ttplusBannerGuide
                    java.lang.String r11 = r6.ttplusBannerOpenSchema
                    com.ss.android.ugc.aweme.commercialize.model.AdReportInfo r0 = r6.copy(r7, r8, r9, r10, r11)
                L57:
                    return r0
                L58:
                    r7 = 0
                    goto L4b
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C1048480dOI.LIZ():com.ss.android.ugc.aweme.commercialize.model.AdReportInfo");
            }

            @Override // X.InterfaceC1048460dOG
            public final String getAid() {
                return this.LIZIZ;
            }

            @Override // X.InterfaceC1048460dOG
            public final String getAuthorId() {
                return this.LIZLLL;
            }

            @Override // X.InterfaceC1048460dOG
            public final String getCid() {
                return this.LJ;
            }

            @Override // X.InterfaceC1048460dOG
            public final Context getContext() {
                return this.LIZ;
            }

            @Override // X.InterfaceC1048460dOG
            public final Map<String, Object> getExtraParam() {
                return this.LJI;
            }

            @Override // X.InterfaceC1048460dOG
            public final String getLogExtra() {
                return this.LJFF;
            }

            @Override // X.InterfaceC1048460dOG
            public final String getRoomId() {
                return this.LIZJ;
            }

            {
                String str2;
                String str3;
                String str4;
                this.LJII = adLiveEnterRoomConfig;
                this.LIZ = context;
                if (adLiveEnterRoomConfig != null) {
                    str2 = adLiveEnterRoomConfig.aid;
                } else {
                    str2 = null;
                }
                this.LIZIZ = str2;
                if (adLiveEnterRoomConfig != null) {
                    str3 = adLiveEnterRoomConfig.roomId;
                } else {
                    str3 = null;
                }
                this.LIZJ = str3;
                this.LIZLLL = str;
                if (adLiveEnterRoomConfig != null) {
                    str4 = adLiveEnterRoomConfig.creativeId;
                } else {
                    str4 = null;
                }
                this.LJ = str4;
                this.LJFF = adLiveEnterRoomConfig != null ? adLiveEnterRoomConfig.logExtra : null;
                this.LJI = C2097608Jq.LJ();
            }
        }).LIZ();
    }

    @Override // com.ss.android.ugc.aweme.ad.feed.adexperience.ICommerceAdExperienceService
    public final void S2(Context context, Aweme aweme, String str, String str2) {
        IAdTaskDepend iAdTaskDependLIZLLL;
        if (context == null || aweme == null || (iAdTaskDependLIZLLL = AdTaskDependImpl.LIZLLL()) == null) {
            return;
        }
        iAdTaskDependLIZLLL.LIZJ(context, aweme, str);
        C1048530dON c1048530dON = new C1048530dON(aweme);
        C1048540dOO.LIZ.getClass();
        c1048530dON.log(C1048540dOO.LIZJ, new AwS67S1000000_16(str2, 36));
    }

    @Override // com.ss.android.ugc.aweme.ad.feed.adexperience.ICommerceAdExperienceService
    public final void T2(final Context context, final AdLiveEnterRoomConfig adLiveEnterRoomConfig, final Function0<Unit> function0, Function0<Unit> function02) {
        C1064390dnx.LIZ.getClass();
        InterfaceC1064430do1 interfaceC1064430do1 = new InterfaceC1064430do1(context, adLiveEnterRoomConfig, function0) { // from class: X.0doj
            public final Context LIZ;
            public final String LIZIZ;
            public final String LIZJ;
            public final String LIZLLL;
            public final String LJ;
            public final String LJFF;
            public final /* synthetic */ AdLiveEnterRoomConfig LJI;
            public final /* synthetic */ Function0<Unit> LJII;

            @Override // X.InterfaceC1064380dnw
            public final String getEnterFrom() {
                return "live_ad";
            }

            /* JADX WARN: Removed duplicated region for block: B:21:0x0072  */
            @Override // X.InterfaceC1064430do1
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final com.ss.android.ugc.aweme.commercialize.model.AdDislikeInfo LIZIZ() {
                /*
                    r18 = this;
                    r0 = r18
                    com.bytedance.android.livesdk.model.AdLiveEnterRoomConfig r2 = r0.LJI
                    r0 = 0
                    com.ss.android.ugc.aweme.utils.GsonProvider r1 = X.C7740030o.LIZ()     // Catch: java.lang.Throwable -> L1f
                    com.google.gson.Gson r3 = r1.getGson()     // Catch: java.lang.Throwable -> L1f
                    if (r2 == 0) goto L1d
                    java.lang.String r2 = r2.dislikeInfo     // Catch: java.lang.Throwable -> L1f
                L11:
                    java.lang.Class<com.ss.android.ugc.aweme.commercialize.model.AdDislikeInfo> r1 = com.ss.android.ugc.aweme.commercialize.model.AdDislikeInfo.class
                    java.lang.Object r2 = r3.LJII(r2, r1)     // Catch: java.lang.Throwable -> L1f
                    com.ss.android.ugc.aweme.commercialize.model.AdDislikeInfo r2 = (com.ss.android.ugc.aweme.commercialize.model.AdDislikeInfo) r2     // Catch: java.lang.Throwable -> L1f
                    X.C189200o6.m2constructorimpl(r2)     // Catch: java.lang.Throwable -> L1f
                    goto L2b
                L1d:
                    r2 = r0
                    goto L11
                L1f:
                    r1 = move-exception
                    com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r1)
                    X.00Yq r2 = new X.00Yq
                    r2.<init>(r1)
                    X.C189200o6.m2constructorimpl(r2)
                L2b:
                    boolean r1 = X.C189200o6.m7isFailureimpl(r2)
                    if (r1 == 0) goto L32
                    r2 = r0
                L32:
                    com.ss.android.ugc.aweme.commercialize.model.AdDislikeInfo r2 = (com.ss.android.ugc.aweme.commercialize.model.AdDislikeInfo) r2
                    if (r2 == 0) goto L71
                    r8 = 0
                    java.lang.Class<com.ss.android.ugc.aweme.compliance.api.services.settings.IComplianceSettingsService> r3 = com.ss.android.ugc.aweme.compliance.api.services.settings.IComplianceSettingsService.class
                    r4 = 0
                    r7 = 14
                    r5 = r4
                    r6 = r4
                    java.lang.Object r0 = com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt.pluggableSpi$default(r3, r4, r5, r6, r7, r8)
                    com.ss.android.ugc.aweme.compliance.api.services.settings.IComplianceSettingsService r0 = (com.ss.android.ugc.aweme.compliance.api.services.settings.IComplianceSettingsService) r0
                    if (r0 == 0) goto L72
                    boolean r0 = r0.LJJII()
                    r13 = 1
                    if (r0 != r13) goto L72
                L4d:
                    int r3 = r2.enable
                    java.util.List<com.ss.android.ugc.aweme.commercialize.model.AdDislikeReasonModel> r4 = r2.categoryList
                    boolean r5 = r2.enableAdShowDislikeIcon
                    int r6 = r2.dislikeStyle
                    int r7 = r2.dislikeType
                    java.lang.String r8 = r2.title
                    java.lang.String r9 = r2.desc
                    java.lang.String r10 = r2.submitText
                    java.lang.String r11 = r2.lynxSchema
                    java.lang.String r12 = r2.toastText
                    java.lang.String r14 = r2.ttplusBannerImage
                    java.lang.String r15 = r2.ttplusBannerTitle
                    java.lang.String r1 = r2.ttplusBannerGuide
                    java.lang.String r0 = r2.ttplusBannerOpenSchema
                    r16 = r1
                    r17 = r0
                    com.ss.android.ugc.aweme.commercialize.model.AdDislikeInfo r0 = r2.copy(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
                L71:
                    return r0
                L72:
                    r13 = 0
                    goto L4d
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C1064870doj.LIZIZ():com.ss.android.ugc.aweme.commercialize.model.AdDislikeInfo");
            }

            @Override // X.InterfaceC1064430do1
            public final InterfaceC1064920doo LIZJ() {
                final Function0<Unit> function03 = this.LJII;
                return new InterfaceC1064920doo() { // from class: X.0dol
                    @Override // X.InterfaceC1064920doo
                    public final void onDismiss() {
                        function03.invoke();
                    }
                };
            }

            @Override // X.InterfaceC1064380dnw
            public final Context LIZ() {
                return this.LIZ;
            }

            @Override // X.InterfaceC1064380dnw
            public final String getAdId() {
                return this.LIZJ;
            }

            @Override // X.InterfaceC1064380dnw
            public final String getAid() {
                return this.LIZIZ;
            }

            @Override // X.InterfaceC1064380dnw
            public final String getCreativeId() {
                return this.LJ;
            }

            @Override // X.InterfaceC1064380dnw
            public final String getLogExtra() {
                return this.LJFF;
            }

            @Override // X.InterfaceC1064380dnw
            public final String getRoomId() {
                return this.LIZLLL;
            }

            {
                String str;
                String str2;
                String str3;
                String str4;
                this.LJI = adLiveEnterRoomConfig;
                this.LJII = function0;
                this.LIZ = context;
                if (adLiveEnterRoomConfig != null) {
                    str = adLiveEnterRoomConfig.aid;
                } else {
                    str = null;
                }
                this.LIZIZ = str;
                if (adLiveEnterRoomConfig != null) {
                    str2 = adLiveEnterRoomConfig.adId;
                } else {
                    str2 = null;
                }
                this.LIZJ = str2;
                if (adLiveEnterRoomConfig != null) {
                    str3 = adLiveEnterRoomConfig.roomId;
                } else {
                    str3 = null;
                }
                this.LIZLLL = String.valueOf(str3);
                if (adLiveEnterRoomConfig != null) {
                    str4 = adLiveEnterRoomConfig.creativeId;
                } else {
                    str4 = null;
                }
                this.LJ = str4;
                this.LJFF = adLiveEnterRoomConfig != null ? adLiveEnterRoomConfig.logExtra : null;
            }
        };
        new C1064370dnv(interfaceC1064430do1).LIZ();
        C1064390dnx.LIZ(interfaceC1064430do1, function02);
    }

    @Override // com.ss.android.ugc.aweme.ad.feed.adexperience.ICommerceAdExperienceService
    public final void U2(final Context context, final Aweme aweme, final String str, final Function0<Unit> function0, Function0<Unit> function02) {
        Integer numValueOf;
        IAdReRankServiceManagerService iAdReRankServiceManagerService;
        InterfaceC1603020roi interfaceC1603020roiLIZIZ;
        if (aweme != null && AwemeExtKt.isAdTraffic(aweme)) {
            C1064390dnx.LIZ.getClass();
            InterfaceC1064430do1 interfaceC1064430do1 = new InterfaceC1064430do1(context, aweme, str, function0) { // from class: X.0dok
                public final Context LIZ;
                public final String LIZIZ;
                public final String LIZJ;
                public final String LIZLLL;
                public final String LJ;
                public final String LJFF;
                public final String LJI;
                public final /* synthetic */ Aweme LJII;
                public final /* synthetic */ Function0<Unit> LJIIIIZZ;

                @Override // X.InterfaceC1064430do1
                public final AdDislikeInfo LIZIZ() {
                    AwemeRawAd awemeRawAd;
                    AdDislikeInfo dislikeInfo;
                    Aweme aweme2 = this.LJII;
                    if (aweme2 == null || (awemeRawAd = aweme2.getAwemeRawAd()) == null || (dislikeInfo = awemeRawAd.getDislikeInfo()) == null) {
                        return null;
                    }
                    IComplianceSettingsService iComplianceSettingsService = (IComplianceSettingsService) PluggableExtentionKt.pluggableSpi$default(IComplianceSettingsService.class, false, false, false, 14, null);
                    boolean z = false;
                    if (iComplianceSettingsService != null && iComplianceSettingsService.LJJII()) {
                        z = true;
                    }
                    return dislikeInfo.copy(dislikeInfo.enable, dislikeInfo.categoryList, dislikeInfo.enableAdShowDislikeIcon, dislikeInfo.dislikeStyle, dislikeInfo.dislikeType, dislikeInfo.title, dislikeInfo.desc, dislikeInfo.submitText, dislikeInfo.lynxSchema, dislikeInfo.toastText, z, dislikeInfo.ttplusBannerImage, dislikeInfo.ttplusBannerTitle, dislikeInfo.ttplusBannerGuide, dislikeInfo.ttplusBannerOpenSchema);
                }

                @Override // X.InterfaceC1064430do1
                public final InterfaceC1064920doo LIZJ() {
                    final Function0<Unit> function03 = this.LJIIIIZZ;
                    return new InterfaceC1064920doo() { // from class: X.0dom
                        @Override // X.InterfaceC1064920doo
                        public final void onDismiss() {
                            function03.invoke();
                        }
                    };
                }

                @Override // X.InterfaceC1064380dnw
                public final Context LIZ() {
                    return this.LIZ;
                }

                @Override // X.InterfaceC1064380dnw
                public final String getAdId() {
                    return this.LIZJ;
                }

                @Override // X.InterfaceC1064380dnw
                public final String getAid() {
                    return this.LIZIZ;
                }

                @Override // X.InterfaceC1064380dnw
                public final String getCreativeId() {
                    return this.LJ;
                }

                @Override // X.InterfaceC1064380dnw
                public final String getEnterFrom() {
                    return this.LJI;
                }

                @Override // X.InterfaceC1064380dnw
                public final String getLogExtra() {
                    return this.LJFF;
                }

                @Override // X.InterfaceC1064380dnw
                public final String getRoomId() {
                    return this.LIZLLL;
                }

                {
                    String aid;
                    Long adId;
                    String creativeIdStr;
                    AwemeRawAd awemeRawAd;
                    AwemeRawAd awemeRawAd2;
                    AwemeRawAd awemeRawAd3;
                    this.LJII = aweme;
                    this.LJIIIIZZ = function0;
                    this.LIZ = context;
                    String logExtra = null;
                    if (aweme != null) {
                        aid = aweme.getAid();
                    } else {
                        aid = null;
                    }
                    this.LIZIZ = aid;
                    if (aweme != null && (awemeRawAd3 = aweme.getAwemeRawAd()) != null) {
                        adId = awemeRawAd3.getAdId();
                    } else {
                        adId = null;
                    }
                    this.LIZJ = String.valueOf(adId);
                    this.LIZLLL = C1019100ccu.LJ(aweme);
                    if (aweme != null && (awemeRawAd2 = aweme.getAwemeRawAd()) != null) {
                        creativeIdStr = awemeRawAd2.getCreativeIdStr();
                    } else {
                        creativeIdStr = null;
                    }
                    this.LJ = creativeIdStr;
                    if (aweme != null && (awemeRawAd = aweme.getAwemeRawAd()) != null) {
                        logExtra = awemeRawAd.getLogExtra();
                    }
                    this.LJFF = logExtra;
                    this.LJI = str;
                }
            };
            if (TextUtils.equals(str, "live_ad")) {
                C1906207dM c1906207dM = C1906207dM.LIZ;
                AwemeRawAd awemeRawAd = aweme.getAwemeRawAd();
                if (awemeRawAd != null) {
                    numValueOf = Integer.valueOf(awemeRawAd.getRit());
                } else {
                    numValueOf = null;
                }
                String strValueOf = String.valueOf(numValueOf);
                String str2 = this.LIZ;
                c1906207dM.getClass();
                if (C1906207dM.LIZ(strValueOf, str2) && (iAdReRankServiceManagerService = (IAdReRankServiceManagerService) PluggableExtentionKt.pluggableSpi$default(IAdReRankServiceManagerService.class, false, false, false, 14, null)) != null && (interfaceC1603020roiLIZIZ = iAdReRankServiceManagerService.LIZIZ(EnumC584610MwN.FEED)) != null) {
                    interfaceC1603020roiLIZIZ.Z4(EnumC2245291CuN.ON_DISLIKE);
                }
                new C1064370dnv(interfaceC1064430do1).LIZ();
            }
            C1064390dnx.LIZ(interfaceC1064430do1, function02);
            InterfaceC1009590cNZ interfaceC1009590cNZ = (InterfaceC1009590cNZ) this.LIZIZ.getValue();
            if (interfaceC1009590cNZ != null) {
                interfaceC1009590cNZ.LIZJ(2);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.ad.feed.adexperience.ICommerceAdExperienceService
    public final void a3(final Context context, final Aweme aweme, final String str, Map<String, ? extends Object> map, boolean z, final List<ImageInfo> list) {
        IAdReRankServiceManagerService iAdReRankServiceManagerService;
        InterfaceC1603020roi interfaceC1603020roiLIZIZ;
        AwemeRawAd awemeRawAd;
        AwemeRawAd awemeRawAdLJJIJLIJ;
        Object[] objArr;
        Map mapLIZJ;
        final LinkedHashMap linkedHashMap = new LinkedHashMap();
        Integer numValueOf = null;
        if (z && aweme != null && AwemeExtKt.isPhotoMode(aweme)) {
            Map<String, Object> mapLJJIIJ = ((IAdPhotoModeService) ServiceManager.get().getService(IAdPhotoModeService.class)).LJJIIJ(aweme);
            Object obj = mapLJJIIJ.get("product_id");
            if (!(obj instanceof String)) {
                obj = null;
            }
            Object obj2 = mapLJJIIJ.get("product_id_list");
            if (obj2 instanceof String[]) {
                objArr = (Object[]) obj2;
            } else {
                objArr = null;
            }
            if (obj != null) {
                mapLIZJ = C2097908Jt.LIZJ(new Pair("product_id", obj));
            } else if (objArr != null) {
                mapLIZJ = C2097908Jt.LIZJ(new Pair("product_id", C13LQ.LJJJ(objArr, ",", null, null, null, 62)));
            }
            if (mapLIZJ != null) {
                linkedHashMap.putAll(mapLIZJ);
            }
        }
        if (map != null) {
            linkedHashMap.putAll(map);
        }
        if (aweme != null && AwemeExtKt.isAdTraffic(aweme)) {
            AdExperienceEventLogger adExperienceEventLogger = new AdExperienceEventLogger();
            C1023960ckk c1023960ckk = C1001190cA1.LIZ;
            if (aweme != null) {
                awemeRawAdLJJIJLIJ = C1017070cZd.LJJIJLIJ(aweme);
            } else {
                awemeRawAdLJJIJLIJ = null;
            }
            adExperienceEventLogger.logAd(c1023960ckk, awemeRawAdLJJIJLIJ);
        }
        if (TextUtils.equals(str, "live_ad")) {
            C1906207dM c1906207dM = C1906207dM.LIZ;
            if (aweme != null && (awemeRawAd = aweme.getAwemeRawAd()) != null) {
                numValueOf = Integer.valueOf(awemeRawAd.getRit());
            }
            String strValueOf = String.valueOf(numValueOf);
            String str2 = this.LIZ;
            c1906207dM.getClass();
            if (C1906207dM.LIZ(strValueOf, str2) && (iAdReRankServiceManagerService = (IAdReRankServiceManagerService) PluggableExtentionKt.pluggableSpi$default(IAdReRankServiceManagerService.class, false, false, false, 14, null)) != null && (interfaceC1603020roiLIZIZ = iAdReRankServiceManagerService.LIZIZ(EnumC584610MwN.FEED)) != null) {
                interfaceC1603020roiLIZIZ.Z4(EnumC2245291CuN.ON_REPORT);
            }
        }
        C1064390dnx.LIZ.getClass();
        new C1048450dOF(new InterfaceC1048460dOG(context, aweme, str, list, linkedHashMap) { // from class: X.0dOK
            public final Context LIZ;
            public final String LIZIZ;
            public final String LIZJ;
            public final String LIZLLL;
            public final String LJ;
            public final String LJFF;
            public final String LJI;
            public final Integer LJII;
            public final Map<String, Object> LJIIIIZZ;
            public final List<ImageInfo> LJIIIZ;
            public final /* synthetic */ Aweme LJIIJ;

            @Override // X.InterfaceC1048460dOG
            public final AdReportInfo LIZ() {
                AwemeRawAd awemeRawAd2;
                AdReportInfo reportInfo;
                Aweme aweme2 = this.LJIIJ;
                if (aweme2 == null || (awemeRawAd2 = aweme2.getAwemeRawAd()) == null || (reportInfo = awemeRawAd2.getReportInfo()) == null) {
                    return null;
                }
                IComplianceSettingsService iComplianceSettingsService = (IComplianceSettingsService) PluggableExtentionKt.pluggableSpi$default(IComplianceSettingsService.class, false, false, false, 14, null);
                boolean z2 = false;
                if (iComplianceSettingsService != null && iComplianceSettingsService.LJIILJJIL()) {
                    z2 = true;
                }
                return reportInfo.copy(z2, reportInfo.ttplusBannerImage, reportInfo.ttplusBannerTitle, reportInfo.ttplusBannerGuide, reportInfo.ttplusBannerOpenSchema);
            }

            @Override // X.InterfaceC1048460dOG
            public final Integer LIZIZ() {
                return this.LJII;
            }

            @Override // X.InterfaceC1048460dOG
            public final String getAid() {
                return this.LIZIZ;
            }

            @Override // X.InterfaceC1048460dOG
            public final String getAuthorId() {
                return this.LIZLLL;
            }

            @Override // X.InterfaceC1048460dOG
            public final String getCid() {
                return this.LJ;
            }

            @Override // X.InterfaceC1048460dOG
            public final Context getContext() {
                return this.LIZ;
            }

            @Override // X.InterfaceC1048460dOG
            public final Map<String, Object> getExtraParam() {
                return this.LJIIIIZZ;
            }

            @Override // X.InterfaceC1048460dOG
            public final List<ImageInfo> getImageInfos() {
                return this.LJIIIZ;
            }

            @Override // X.InterfaceC1048460dOG
            public final String getLogExtra() {
                return this.LJFF;
            }

            @Override // X.InterfaceC1048460dOG
            public final String getReportFrom() {
                return this.LJI;
            }

            @Override // X.InterfaceC1048460dOG
            public final String getRoomId() {
                return this.LIZJ;
            }

            {
                String aid;
                String authorUid;
                String string;
                String logExtra;
                AwemeRawAd awemeRawAd2;
                AwemeRawAd awemeRawAd3;
                AwemeRawAd awemeRawAd4;
                Long creativeId;
                this.LJIIJ = aweme;
                this.LIZ = context;
                Integer numValueOf2 = null;
                if (aweme != null) {
                    aid = aweme.getAid();
                } else {
                    aid = null;
                }
                this.LIZIZ = aid;
                this.LIZJ = C1019100ccu.LJ(aweme);
                if (aweme != null) {
                    authorUid = AwemeExtKt.getAuthorUid(aweme);
                } else {
                    authorUid = null;
                }
                this.LIZLLL = authorUid;
                if (aweme != null && (awemeRawAd4 = aweme.getAwemeRawAd()) != null && (creativeId = awemeRawAd4.getCreativeId()) != null) {
                    string = creativeId.toString();
                } else {
                    string = null;
                }
                this.LJ = string;
                if (aweme != null && (awemeRawAd3 = aweme.getAwemeRawAd()) != null) {
                    logExtra = awemeRawAd3.getLogExtra();
                } else {
                    logExtra = null;
                }
                this.LJFF = logExtra;
                this.LJI = str;
                if (aweme != null && (awemeRawAd2 = aweme.getAwemeRawAd()) != null) {
                    numValueOf2 = Integer.valueOf(awemeRawAd2.getReportAdType());
                }
                this.LJII = numValueOf2;
                this.LJIIIIZZ = linkedHashMap;
                this.LJIIIZ = list;
            }
        }).LIZ();
        InterfaceC1009590cNZ interfaceC1009590cNZ = (InterfaceC1009590cNZ) this.LIZIZ.getValue();
        if (interfaceC1009590cNZ != null) {
            interfaceC1009590cNZ.LIZJ(3);
        }
    }

    @Override // com.ss.android.ugc.aweme.ad.feed.adexperience.ICommerceAdExperienceService
    public final void h3(final Context context, final String str, final String str2, String str3, final String str4, final String str5, final String str6, final String str7, final Map<String, ? extends Object> map, final String str8) {
        C1064390dnx.LIZ.getClass();
        new C1048450dOF(new InterfaceC1048460dOG(context, str2, str4, str5, str6, str7, str, map, str8) { // from class: X.0dOJ
            public final Context LIZ;
            public final String LIZIZ;
            public final String LIZJ;
            public final String LIZLLL;
            public final String LJ;
            public final String LJFF;
            public final String LJI;
            public final Map<String, Object> LJII;
            public final /* synthetic */ String LJIIIIZZ;

            @Override // X.InterfaceC1048460dOG
            public final Integer LIZIZ() {
                return null;
            }

            @Override // X.InterfaceC1048460dOG
            public final List<ImageInfo> getImageInfos() {
                return null;
            }

            @Override // X.InterfaceC1048460dOG
            public final AdReportInfo LIZ() {
                Object c098200Yq;
                try {
                    c098200Yq = (AdReportInfo) C7740030o.LIZ().getGson().LJII(this.LJIIIIZZ, AdReportInfo.class);
                    C189200o6.m2constructorimpl(c098200Yq);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    c098200Yq = new C098200Yq(th);
                    C189200o6.m2constructorimpl(c098200Yq);
                }
                if (C189200o6.m7isFailureimpl(c098200Yq)) {
                    c098200Yq = null;
                }
                AdReportInfo adReportInfo = (AdReportInfo) c098200Yq;
                if (adReportInfo == null) {
                    return null;
                }
                IComplianceSettingsService iComplianceSettingsService = (IComplianceSettingsService) PluggableExtentionKt.pluggableSpi$default(IComplianceSettingsService.class, false, false, false, 14, null);
                return adReportInfo.copy(iComplianceSettingsService != null && iComplianceSettingsService.LJIILJJIL(), adReportInfo.ttplusBannerImage, adReportInfo.ttplusBannerTitle, adReportInfo.ttplusBannerGuide, adReportInfo.ttplusBannerOpenSchema);
            }

            @Override // X.InterfaceC1048460dOG
            public final String getAid() {
                return this.LIZIZ;
            }

            @Override // X.InterfaceC1048460dOG
            public final String getAuthorId() {
                return this.LIZLLL;
            }

            @Override // X.InterfaceC1048460dOG
            public final String getCid() {
                return this.LJ;
            }

            @Override // X.InterfaceC1048460dOG
            public final Context getContext() {
                return this.LIZ;
            }

            @Override // X.InterfaceC1048460dOG
            public final Map<String, Object> getExtraParam() {
                return this.LJII;
            }

            @Override // X.InterfaceC1048460dOG
            public final String getLogExtra() {
                return this.LJFF;
            }

            @Override // X.InterfaceC1048460dOG
            public final String getReportFrom() {
                return this.LJI;
            }

            @Override // X.InterfaceC1048460dOG
            public final String getRoomId() {
                return this.LIZJ;
            }

            {
                this.LJIIIIZZ = str8;
                this.LIZ = context;
                this.LIZIZ = str2;
                this.LIZJ = str4;
                this.LIZLLL = str5;
                this.LJ = str6;
                this.LJFF = str7;
                this.LJI = str;
                this.LJII = map == null ? C2097608Jq.LJ() : map;
            }
        }).LIZ();
    }
}
