package com.ss.android.ugc.aweme.out;

import X.C01GW;
import X.C0CHQ;
import X.C0LGM;
import X.C0VVD;
import X.C11BH;
import X.C1361860lXk;
import X.C13V6;
import X.C1403010mc7;
import X.C1429310nIX;
import X.C1429460nIm;
import X.C1439000nYA;
import X.C1440600nak;
import X.C1442050nd5;
import X.C1443560nfW;
import X.C1642020spc;
import X.C1699910uKz;
import X.C19550711eL;
import X.C19550911eN;
import X.C19EG;
import X.C1A67;
import X.C1DP8;
import X.C2188811AlT;
import X.C2207741Bau;
import X.C2207781Bay;
import X.C2208821Bce;
import X.C2216131BoR;
import X.C2216151BoT;
import X.C2216161BoU;
import X.C2216191BoX;
import X.C2259608tG;
import X.C2262801DhW;
import X.C2262811DhX;
import X.C2262821DhY;
import X.C2262831DhZ;
import X.C2268721Dr4;
import X.C2268921DrO;
import X.C2269021DrY;
import X.C2269031DrZ;
import X.C2269041Dra;
import X.C2269051Drb;
import X.C2269061Drc;
import X.C2269071Drd;
import X.C2269081Dre;
import X.C2269091Drf;
import X.C2269101Drg;
import X.C2269111Drh;
import X.C2269121Dri;
import X.C2269131Drj;
import X.C2269141Drk;
import X.C2269151Drl;
import X.C2269161Drm;
import X.C2269171Drn;
import X.C2275708vr;
import X.C2376609Sy;
import X.C452501pT;
import X.C554390Loj;
import X.C557080Lt4;
import X.C565060MEe;
import X.C565850MHf;
import X.C572320McY;
import X.C577600Ml4;
import X.C577620Ml6;
import X.C580340MpU;
import X.C707370Rot;
import X.C790290UzL;
import X.C794580VEy;
import X.InterfaceC2257101DWa;
import X.InterfaceC524700Khw;
import Y.ARunnableS98S0200000_29;
import android.app.Application;
import android.content.Context;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.android.livesdk.livesetting.subscription.LiveSubscriptionQuestionnaireHourFrequencySetting;
import com.bytedance.keva.Keva;
import com.bytedance.router.interceptor.IInterceptor;
import com.ss.android.ttve.nativePort.TENativeLibsLoader;
import com.ss.android.ugc.aweme.arch.widgets.base.NextLiveData;
import com.ss.android.ugc.aweme.avatar.AvatarPublishStoryServiceImpl;
import com.ss.android.ugc.aweme.commerce.tools.common.CommerceToolsService;
import com.ss.android.ugc.aweme.compliance.api.ComplianceServiceProvider;
import com.ss.android.ugc.aweme.creative.model.CreativeFlowData;
import com.ss.android.ugc.aweme.creative.model.CreativeInfo;
import com.ss.android.ugc.aweme.creative.model.music.AVMusic;
import com.ss.android.ugc.aweme.external.AICameoPreloadInitTask;
import com.ss.android.ugc.aweme.external.AIRemixStartupInitTask;
import com.ss.android.ugc.aweme.external.AVCameraInitTask;
import com.ss.android.ugc.aweme.external.AVCameraInitTaskNew;
import com.ss.android.ugc.aweme.external.AVCleanWatermarkFilesTask;
import com.ss.android.ugc.aweme.external.CleanAVStorageTask;
import com.ss.android.ugc.aweme.external.CleanForwardCommentDraftCacheTask;
import com.ss.android.ugc.aweme.external.DownloadCameraWidgetGuide;
import com.ss.android.ugc.aweme.external.DownloadSuperEntranceResTask;
import com.ss.android.ugc.aweme.external.InstallBytevc1enc8PluginTask;
import com.ss.android.ugc.aweme.external.InstallLiveQuicPluginTask;
import com.ss.android.ugc.aweme.external.PreDownloadEffectModel;
import com.ss.android.ugc.aweme.external.PreFetchBeautyData;
import com.ss.android.ugc.aweme.external.PreloadAlbumOnFeedTask;
import com.ss.android.ugc.aweme.external.PreloadCameraCoreLayoutTask;
import com.ss.android.ugc.aweme.external.ReportAppExitInfoTask;
import com.ss.android.ugc.aweme.external.ReportDraftInfoTask;
import com.ss.android.ugc.aweme.external.router.OpenTextEditInterceptor;
import com.ss.android.ugc.aweme.external.router.OpenVideoEditInterceptor;
import com.ss.android.ugc.aweme.external.router.StartCreateTemplateInterceptor;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.cardinsert.CardInsertInfo;
import com.ss.android.ugc.aweme.property.BrightnessManager;
import com.ss.android.ugc.aweme.services.AVPublishServiceImpl;
import com.ss.android.ugc.aweme.services.IAVFilterService;
import com.ss.android.ugc.aweme.services.IAVMobService;
import com.ss.android.ugc.aweme.services.IAvatarPublishStoryService;
import com.ss.android.ugc.aweme.services.IEffectCardService;
import com.ss.android.ugc.aweme.services.IExternalService;
import com.ss.android.ugc.aweme.services.IPreloadVESo;
import com.ss.android.ugc.aweme.services.audio.IAudioModeAVEnvOpt;
import com.ss.android.ugc.aweme.services.audio.IAudioModelService;
import com.ss.android.ugc.aweme.services.audio.IAudioServiceFactory;
import com.ss.android.ugc.aweme.services.audio.IAudioUserPortraitService;
import com.ss.android.ugc.aweme.services.audio.ITTSService;
import com.ss.android.ugc.aweme.services.external.IAIGCQuotaService;
import com.ss.android.ugc.aweme.services.external.IAILiveService;
import com.ss.android.ugc.aweme.services.external.IAVDraftService;
import com.ss.android.ugc.aweme.services.external.IAVPhotoModeService;
import com.ss.android.ugc.aweme.services.external.IAVTransformModelService;
import com.ss.android.ugc.aweme.services.external.IAVTypeFaceService;
import com.ss.android.ugc.aweme.services.external.IAbnormalExitLogService;
import com.ss.android.ugc.aweme.services.external.IAnchorService;
import com.ss.android.ugc.aweme.services.external.ICommerceToolsService;
import com.ss.android.ugc.aweme.services.external.IConfigService;
import com.ss.android.ugc.aweme.services.external.ICreativePathAdapterService;
import com.ss.android.ugc.aweme.services.external.ICreativeStandardPathService;
import com.ss.android.ugc.aweme.services.external.IDonationService;
import com.ss.android.ugc.aweme.services.external.IEnterFromService;
import com.ss.android.ugc.aweme.services.external.IInfoService;
import com.ss.android.ugc.aweme.services.external.IInitTaskService;
import com.ss.android.ugc.aweme.services.external.ILargeTransactionService;
import com.ss.android.ugc.aweme.services.external.IRouterService;
import com.ss.android.ugc.aweme.services.external.ability.IAVVESDKService;
import com.ss.android.ugc.aweme.services.external.ability.IAbilityService;
import com.ss.android.ugc.aweme.services.external.ability.IEffectSDKGeneralParamService;
import com.ss.android.ugc.aweme.services.external.ability.IOpenPhotoNextService;
import com.ss.android.ugc.aweme.services.external.ability.IOpenTextNextService;
import com.ss.android.ugc.aweme.services.external.ability.IOpenTextToImageService;
import com.ss.android.ugc.aweme.services.external.ability.VEAudioFileInfo;
import com.ss.android.ugc.aweme.services.external.ui.IEditService;
import com.ss.android.ugc.aweme.services.performance.IAVPerformance;
import com.ss.android.ugc.aweme.services.performance.ICrashReportService;
import com.ss.android.ugc.aweme.services.performance.ICreativePerformanceMonitorService;
import com.ss.android.ugc.aweme.services.specialplus.ISpecialPlusService;
import com.ss.android.ugc.aweme.services.story.ICStoryService;
import com.ss.android.ugc.aweme.services.story.IStoryDraftService;
import com.ss.android.ugc.aweme.services.story.IStoryPublishService;
import com.ss.android.ugc.aweme.services.superentrance.ISuperEntranceService;
import com.ss.android.ugc.aweme.services.ttep.ITTEPAbilityService;
import com.ss.android.ugc.aweme.services.ttuploader.IExternalUploaderService;
import com.ss.android.ugc.aweme.services.user.AudioUserPortraitServiceFactory;
import com.ss.android.ugc.aweme.services.user.UserPortraitParams;
import com.ss.android.ugc.aweme.services.video.IAVPublishService;
import com.ss.android.ugc.aweme.services.video.IActivityNameService;
import com.ss.android.ugc.aweme.shortvideo.AVMusicWaveBean;
import com.ss.android.ugc.aweme.shortvideo.BaseShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModelKt;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.ss.android.ugc.aweme.shortvideo.model.ShootExtraData;
import com.ss.android.ugc.aweme.shortvideo.publish.PublishModel;
import com.ss.android.ugc.aweme.shortvideo.util.j;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.ss.android.ugc.aweme.ttep.external.TTEPAbilityServiceImpl;
import com.ss.android.ugc.feed.platform.cardinsert.data.CardShowInfo;
import com.ss.android.ugc.feed.platform.cardinsert.data.FeedCardInsertData;
import com.ss.android.ugc.tiktok.tools.performance.record.PreloadCreativeModelTask;
import com.ss.android.vesdk.VEUtils;
import com.tts.oecverify.BdTuring;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.AFwS226S0000000_35;
import lth.o;
import mic.m;
import uxk.a;

/* JADX INFO: loaded from: classes36.dex */
public final class AVExternalServiceImpl implements IExternalService {
    public final C01GW LIZ;
    public final C01GW LIZIZ;
    public final C01GW LIZJ;
    public final C01GW LIZLLL;
    public final C01GW LJ;
    public final C01GW LJFF;
    public final C01GW LJI;
    public final C01GW LJII;
    public final C01GW LJIIIIZZ;
    public final C01GW LJIIIZ;
    public final C01GW LJIIJ;
    public final C01GW LJIIJJI;
    public final C01GW LJIIL;
    public final C01GW LJIILIIL;
    public final C01GW LJIILJJIL;
    public final C01GW LJIILL;
    public final C01GW LJIILLIIL;
    public final C01GW LJIIZILJ;
    public final C01GW LJIJ;
    public final C01GW LJIJI;
    public final C01GW LJIJJ;

    @Override // com.ss.android.ugc.aweme.services.IExternalService
    public final int getCommentSettingCache() {
        return C1439000nYA.LIZIZ(null);
    }

    @Override // com.ss.android.ugc.aweme.services.IExternalService
    public final IAVTransformModelService aVTransformModelService() {
        return new IAVTransformModelService() { // from class: X.15Iz
            @Override // com.ss.android.ugc.aweme.services.external.IAVTransformModelService
            public final MusicModel transformAVMusic(AVMusic aVMusic) {
                return C15KO.LIZ(aVMusic);
            }

            @Override // com.ss.android.ugc.aweme.services.external.IAVTransformModelService
            public final AVMusic transformMusicModel(MusicModel musicModel) {
                return new C15KP().apply(musicModel);
            }
        };
    }

    @Override // com.ss.android.ugc.aweme.services.IExternalService
    public final IAbilityService abilityService() {
        return (C2268921DrO) this.LIZJ.getValue();
    }

    @Override // com.ss.android.ugc.aweme.services.IExternalService
    public final IAnchorService anchorService() {
        return (C1429460nIm) this.LJIJI.getValue();
    }

    @Override // com.ss.android.ugc.aweme.services.IExternalService
    public final IAudioModelService audioModelService() {
        C19550911eN c19550911eN;
        String name = C19550911eN.class.getName();
        IAudioServiceFactory iAudioServiceFactoryLIZ = C19550711eL.LIZ(name);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(name);
        sbLIZ.append(" , get impl audio service factory class name is ");
        sbLIZ.append(iAudioServiceFactoryLIZ != null ? iAudioServiceFactoryLIZ.getClass().getSimpleName() : null);
        C2188811AlT.LIZIZ(sbLIZ);
        if (iAudioServiceFactoryLIZ == null || (c19550911eN = (C19550911eN) iAudioServiceFactoryLIZ) == null) {
            return null;
        }
        c19550911eN.LIZ = new IAudioModeAVEnvOpt() { // from class: X.1DrW
            @Override // com.ss.android.ugc.aweme.services.audio.IAudioModeAVEnvOpt
            public final void initDownloadableModel() {
                o.LIZLLL();
            }
        };
        return c19550911eN;
    }

    @Override // com.ss.android.ugc.aweme.services.IExternalService
    public final IAudioUserPortraitService audioUserPortraitService() {
        AudioUserPortraitServiceFactory audioUserPortraitServiceFactory;
        String name = AudioUserPortraitServiceFactory.class.getName();
        IAudioServiceFactory iAudioServiceFactoryLIZ = C19550711eL.LIZ(name);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(name);
        sbLIZ.append(" , get impl audio service factory class name is ");
        sbLIZ.append(iAudioServiceFactoryLIZ != null ? iAudioServiceFactoryLIZ.getClass().getSimpleName() : null);
        C2188811AlT.LIZIZ(sbLIZ);
        if (iAudioServiceFactoryLIZ == null || (audioUserPortraitServiceFactory = (AudioUserPortraitServiceFactory) iAudioServiceFactoryLIZ) == null) {
            return null;
        }
        audioUserPortraitServiceFactory.getAudioService(new UserPortraitParams(null));
        return audioUserPortraitServiceFactory;
    }

    @Override // com.ss.android.ugc.aweme.services.IExternalService
    public final IAvatarPublishStoryService avatarService() {
        return (AvatarPublishStoryServiceImpl) this.LJIIL.getValue();
    }

    @Override // com.ss.android.ugc.aweme.services.IExternalService
    public final IActivityNameService classnameService() {
        return C2268721Dr4.LIZ.getValue();
    }

    @Override // com.ss.android.ugc.aweme.services.IExternalService
    public final ICommerceToolsService commerceToolsService() {
        return new CommerceToolsService();
    }

    @Override // com.ss.android.ugc.aweme.services.IExternalService
    public final IConfigService configService() {
        return (C2207741Bau) this.LIZLLL.getValue();
    }

    @Override // com.ss.android.ugc.aweme.services.IExternalService
    public final ICreativePathAdapterService creativePathAdapter() {
        return new ICreativePathAdapterService() { // from class: X.0Mii
            @Override // com.ss.android.ugc.aweme.services.external.ICreativePathAdapterService
            public final String genMusicPath(String str) {
                return C0CHQ.LIZ().LJJIIJZLJL().getPathAdapter().genMusicPath(str);
            }
        };
    }

    @Override // com.ss.android.ugc.aweme.services.IExternalService
    public final ICreativeStandardPathService creativeStandardPath() {
        return new ICreativeStandardPathService() { // from class: X.0MTs
            @Override // com.ss.android.ugc.aweme.services.external.ICreativeStandardPathService
            public final String genCreativePath(String str) {
                return C2298208zU.LIZLLL(C0CHQ.LIZ().LJJIIJZLJL().getPathService(), new CreativeInfo(str, 0, null, 4, null), EnumC20228214Cy.OTHER_BUSINESS_LINE_SHARE, null, true, 4);
            }
        };
    }

    @Override // com.ss.android.ugc.aweme.services.IExternalService
    public final IDonationService donationService() {
        return (C11BH) this.LJIILL.getValue();
    }

    @Override // com.ss.android.ugc.aweme.services.IExternalService
    public final IAVDraftService draftService() {
        return (C557080Lt4) this.LIZIZ.getValue();
    }

    @Override // com.ss.android.ugc.aweme.services.IExternalService
    public final IEditService editService() {
        return new C580340MpU();
    }

    @Override // com.ss.android.ugc.aweme.services.IExternalService
    public final IEffectCardService effectCardService() {
        return new IEffectCardService() { // from class: X.12AZ
            public final C01GW LIZ = C452501pT.LIZIZ(new C12AY());

            public final C12AW LIZIZ() {
                return (C12AW) this.LIZ.getValue();
            }

            public static CardShowInfo LIZ(FeedCardInsertData feedCardInsertData) {
                List<CardShowInfo> list;
                CardShowInfo cardShowInfo = null;
                if (feedCardInsertData == null || (list = feedCardInsertData.showInfoList) == null) {
                    return null;
                }
                Iterator<CardShowInfo> it2 = list.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    CardShowInfo next = it2.next();
                    if (next.cardType == 2) {
                        cardShowInfo = next;
                        break;
                    }
                }
                return cardShowInfo;
            }

            @Override // com.ss.android.ugc.aweme.services.IEffectCardService
            public final View getEffectRecommendView(Context context) {
                if (C290700BaO.LIZ()) {
                    return new C12AK(context, null, 0);
                }
                return new C197109129z(context, null, 0);
            }

            @Override // com.ss.android.ugc.aweme.services.IEffectCardService
            public final void filterEffectCardAweme(List<? extends Aweme> list, Context context) {
                String cardInsertStatus;
                CardInsertInfo cardInsertInfo;
                if (list != null && !list.isEmpty() && C0C64.LJIILLIIL().LJIIIZ(31744, "show_effect_card", true, false) && list != null) {
                    List listLJJJJLI = C13LP.LJJJJLI(list);
                    ArrayList<Aweme> arrayList = new ArrayList();
                    for (Object obj : (ArrayList) listLJJJJLI) {
                        Aweme aweme = (Aweme) obj;
                        Set<Integer> set = C20681215wI.LIZ;
                        if (aweme != null && (cardInsertInfo = aweme.getCardInsertInfo()) != null && cardInsertInfo.getCardType() == 2) {
                            arrayList.add(obj);
                        }
                    }
                    for (Aweme aweme2 : arrayList) {
                        CardInsertInfo cardInsertInfo2 = aweme2.getCardInsertInfo();
                        if (cardInsertInfo2 != null && (cardInsertStatus = cardInsertInfo2.getCardInsertStatus()) != null && cardInsertStatus.length() == 0 && C19719512Dh.LJI(list)) {
                            list.remove(aweme2);
                        }
                    }
                    for (Aweme aweme3 : arrayList) {
                        if (context != null) {
                            C823050WQl.LIZLLL().execute(new ARunnableS98S0200000_29(aweme3, context, 81));
                        }
                    }
                }
            }

            @Override // com.ss.android.ugc.aweme.services.IEffectCardService
            public final Object getEffectRecommendCardViewHolder(View view, Fragment fragment) {
                return new C585760MyE(view, fragment);
            }

            /* JADX WARN: Removed duplicated region for block: B:15:0x004f  */
            @Override // com.ss.android.ugc.aweme.services.IEffectCardService
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final boolean shouldInsertEffectRecommendCard(java.lang.Object r17, java.lang.Integer r18) {
                /*
                    Method dump skipped, instruction units count: 605
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C12AZ.shouldInsertEffectRecommendCard(java.lang.Object, java.lang.Integer):boolean");
            }
        };
    }

    @Override // com.ss.android.ugc.aweme.services.IExternalService
    public final IExternalUploaderService externalUploaderService() {
        return new IExternalUploaderService() { // from class: X.1BbG
            @Override // com.ss.android.ugc.aweme.services.ttuploader.IExternalUploaderService
            public final String getSdkV4AuthKey() {
                C1444650nhH.LIZ.getClass();
                return C1444650nhH.LIZ();
            }

            @Override // com.ss.android.ugc.aweme.services.ttuploader.IExternalUploaderService
            public final void cacheUploadAuthKeyConfig() {
                C0CHQ.LIZ().getPublishService().LJJIJIIJIL();
                C1444700nhM.LIZ();
            }

            @Override // com.ss.android.ugc.aweme.services.ttuploader.IExternalUploaderService
            public final int getUploadBackupNetworkType() {
                return C2207881Bb8.LIZ();
            }

            @Override // com.ss.android.ugc.aweme.services.ttuploader.IExternalUploaderService
            public final int getUploadMainNetworkType() {
                return C541470LLl.LIZ();
            }

            /* JADX WARN: Removed duplicated region for block: B:11:0x002c A[PHI: r6
              0x002c: PHI (r6v4 java.lang.String) = (r6v0 java.lang.String), (r6v5 java.lang.String) binds: [B:10:0x002a, B:8:0x0027] A[DONT_GENERATE, DONT_INLINE]] */
            /* JADX WARN: Removed duplicated region for block: B:13:0x0030 A[PHI: r6
              0x0030: PHI (r6v3 java.lang.String) = (r6v0 java.lang.String), (r6v4 java.lang.String) binds: [B:10:0x002a, B:12:0x002e] A[DONT_GENERATE, DONT_INLINE]] */
            /* JADX WARN: Removed duplicated region for block: B:15:0x0033 A[PHI: r6 r7
              0x0033: PHI (r6v1 java.lang.String) = (r6v3 java.lang.String), (r6v4 java.lang.String) binds: [B:14:0x0031, B:12:0x002e] A[DONT_GENERATE, DONT_INLINE]
              0x0033: PHI (r7v0 java.lang.String) = (r7v2 java.lang.String), (r7v3 java.lang.String) binds: [B:14:0x0031, B:12:0x002e] A[DONT_GENERATE, DONT_INLINE]] */
            /* JADX WARN: Removed duplicated region for block: B:21:0x003e A[PHI: r9
              0x003e: PHI (r9v11 java.lang.String) = (r9v0 java.lang.String), (r9v12 java.lang.String) binds: [B:20:0x003c, B:18:0x0039] A[DONT_GENERATE, DONT_INLINE]] */
            /* JADX WARN: Removed duplicated region for block: B:23:0x0042 A[PHI: r9
              0x0042: PHI (r9v10 java.lang.String) = (r9v0 java.lang.String), (r9v11 java.lang.String) binds: [B:20:0x003c, B:22:0x0040] A[DONT_GENERATE, DONT_INLINE]] */
            /* JADX WARN: Removed duplicated region for block: B:25:0x0045 A[PHI: r9 r10
              0x0045: PHI (r9v1 java.lang.String) = (r9v10 java.lang.String), (r9v11 java.lang.String) binds: [B:24:0x0043, B:22:0x0040] A[DONT_GENERATE, DONT_INLINE]
              0x0045: PHI (r10v0 java.lang.String) = (r10v9 java.lang.String), (r10v10 java.lang.String) binds: [B:24:0x0043, B:22:0x0040] A[DONT_GENERATE, DONT_INLINE]] */
            /* JADX WARN: Removed duplicated region for block: B:29:0x004d A[PHI: r9 r10
              0x004d: PHI (r9v9 java.lang.String) = (r9v1 java.lang.String), (r9v1 java.lang.String), (r9v10 java.lang.String) binds: [B:26:0x0047, B:28:0x004b, B:24:0x0043] A[DONT_GENERATE, DONT_INLINE]
              0x004d: PHI (r10v8 java.lang.String) = (r10v0 java.lang.String), (r10v0 java.lang.String), (r10v9 java.lang.String) binds: [B:26:0x0047, B:28:0x004b, B:24:0x0043] A[DONT_GENERATE, DONT_INLINE]] */
            /* JADX WARN: Removed duplicated region for block: B:31:0x0050 A[PHI: r9 r10 r11
              0x0050: PHI (r9v8 java.lang.String) = (r9v1 java.lang.String), (r9v9 java.lang.String) binds: [B:28:0x004b, B:30:0x004e] A[DONT_GENERATE, DONT_INLINE]
              0x0050: PHI (r10v7 java.lang.String) = (r10v0 java.lang.String), (r10v8 java.lang.String) binds: [B:28:0x004b, B:30:0x004e] A[DONT_GENERATE, DONT_INLINE]
              0x0050: PHI (r11v7 java.lang.String) = (r11v0 java.lang.String), (r11v8 java.lang.String) binds: [B:28:0x004b, B:30:0x004e] A[DONT_GENERATE, DONT_INLINE]] */
            /* JADX WARN: Removed duplicated region for block: B:35:0x0058 A[PHI: r9 r10 r11
              0x0058: PHI (r9v2 java.lang.String) = (r9v8 java.lang.String), (r9v8 java.lang.String), (r9v9 java.lang.String) binds: [B:32:0x0052, B:34:0x0056, B:30:0x004e] A[DONT_GENERATE, DONT_INLINE]
              0x0058: PHI (r10v1 java.lang.String) = (r10v7 java.lang.String), (r10v7 java.lang.String), (r10v8 java.lang.String) binds: [B:32:0x0052, B:34:0x0056, B:30:0x004e] A[DONT_GENERATE, DONT_INLINE]
              0x0058: PHI (r11v1 java.lang.String) = (r11v7 java.lang.String), (r11v7 java.lang.String), (r11v8 java.lang.String) binds: [B:32:0x0052, B:34:0x0056, B:30:0x004e] A[DONT_GENERATE, DONT_INLINE]] */
            /* JADX WARN: Removed duplicated region for block: B:37:0x005b A[PHI: r9 r10 r11 r12
              0x005b: PHI (r9v7 java.lang.String) = (r9v2 java.lang.String), (r9v8 java.lang.String) binds: [B:36:0x0059, B:34:0x0056] A[DONT_GENERATE, DONT_INLINE]
              0x005b: PHI (r10v6 java.lang.String) = (r10v1 java.lang.String), (r10v7 java.lang.String) binds: [B:36:0x0059, B:34:0x0056] A[DONT_GENERATE, DONT_INLINE]
              0x005b: PHI (r11v6 java.lang.String) = (r11v1 java.lang.String), (r11v7 java.lang.String) binds: [B:36:0x0059, B:34:0x0056] A[DONT_GENERATE, DONT_INLINE]
              0x005b: PHI (r12v5 java.lang.String) = (r12v0 java.lang.String), (r12v6 java.lang.String) binds: [B:36:0x0059, B:34:0x0056] A[DONT_GENERATE, DONT_INLINE]] */
            /* JADX WARN: Removed duplicated region for block: B:41:0x0063 A[PHI: r9 r10 r11 r12
              0x0063: PHI (r9v3 java.lang.String) = (r9v2 java.lang.String), (r9v7 java.lang.String), (r9v7 java.lang.String) binds: [B:36:0x0059, B:38:0x005d, B:40:0x0061] A[DONT_GENERATE, DONT_INLINE]
              0x0063: PHI (r10v2 java.lang.String) = (r10v1 java.lang.String), (r10v6 java.lang.String), (r10v6 java.lang.String) binds: [B:36:0x0059, B:38:0x005d, B:40:0x0061] A[DONT_GENERATE, DONT_INLINE]
              0x0063: PHI (r11v2 java.lang.String) = (r11v1 java.lang.String), (r11v6 java.lang.String), (r11v6 java.lang.String) binds: [B:36:0x0059, B:38:0x005d, B:40:0x0061] A[DONT_GENERATE, DONT_INLINE]
              0x0063: PHI (r12v1 java.lang.String) = (r12v0 java.lang.String), (r12v5 java.lang.String), (r12v5 java.lang.String) binds: [B:36:0x0059, B:38:0x005d, B:40:0x0061] A[DONT_GENERATE, DONT_INLINE]] */
            /* JADX WARN: Removed duplicated region for block: B:43:0x0066 A[PHI: r9 r10 r11 r12 r13
              0x0066: PHI (r9v6 java.lang.String) = (r9v3 java.lang.String), (r9v7 java.lang.String) binds: [B:42:0x0064, B:40:0x0061] A[DONT_GENERATE, DONT_INLINE]
              0x0066: PHI (r10v5 java.lang.String) = (r10v2 java.lang.String), (r10v6 java.lang.String) binds: [B:42:0x0064, B:40:0x0061] A[DONT_GENERATE, DONT_INLINE]
              0x0066: PHI (r11v5 java.lang.String) = (r11v2 java.lang.String), (r11v6 java.lang.String) binds: [B:42:0x0064, B:40:0x0061] A[DONT_GENERATE, DONT_INLINE]
              0x0066: PHI (r12v4 java.lang.String) = (r12v1 java.lang.String), (r12v5 java.lang.String) binds: [B:42:0x0064, B:40:0x0061] A[DONT_GENERATE, DONT_INLINE]
              0x0066: PHI (r13v3 java.lang.String) = (r13v0 java.lang.String), (r13v4 java.lang.String) binds: [B:42:0x0064, B:40:0x0061] A[DONT_GENERATE, DONT_INLINE]] */
            /* JADX WARN: Removed duplicated region for block: B:47:0x006e A[PHI: r9 r10 r11 r12 r13
              0x006e: PHI (r9v4 java.lang.String) = (r9v3 java.lang.String), (r9v6 java.lang.String), (r9v6 java.lang.String) binds: [B:42:0x0064, B:44:0x0068, B:46:0x006c] A[DONT_GENERATE, DONT_INLINE]
              0x006e: PHI (r10v3 java.lang.String) = (r10v2 java.lang.String), (r10v5 java.lang.String), (r10v5 java.lang.String) binds: [B:42:0x0064, B:44:0x0068, B:46:0x006c] A[DONT_GENERATE, DONT_INLINE]
              0x006e: PHI (r11v3 java.lang.String) = (r11v2 java.lang.String), (r11v5 java.lang.String), (r11v5 java.lang.String) binds: [B:42:0x0064, B:44:0x0068, B:46:0x006c] A[DONT_GENERATE, DONT_INLINE]
              0x006e: PHI (r12v2 java.lang.String) = (r12v1 java.lang.String), (r12v4 java.lang.String), (r12v4 java.lang.String) binds: [B:42:0x0064, B:44:0x0068, B:46:0x006c] A[DONT_GENERATE, DONT_INLINE]
              0x006e: PHI (r13v1 java.lang.String) = (r13v0 java.lang.String), (r13v3 java.lang.String), (r13v3 java.lang.String) binds: [B:42:0x0064, B:44:0x0068, B:46:0x006c] A[DONT_GENERATE, DONT_INLINE]] */
            @Override // com.ss.android.ugc.aweme.services.ttuploader.IExternalUploaderService
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final com.ss.android.ugc.aweme.services.upload.ExternalUploadVideoConfig getUploadVideoConfig(java.lang.String r16) {
                /*
                    r15 = this;
                    X.1Ds4 r0 = X.C0CHQ.LIZ()
                    X.0niP r0 = r0.getNetworkService()
                    com.google.gson.Gson r1 = r0.getRetrofitFactoryGson()
                    java.lang.Class<com.ss.android.ugc.aweme.publish.model.UploadAuthKeyConfig> r0 = com.ss.android.ugc.aweme.publish.model.UploadAuthKeyConfig.class
                    r2 = r16
                    java.lang.Object r0 = com.bytedance.mt.protector.impl.GsonProtectorUtils.fromJson(r1, r2, r0)
                    com.ss.android.ugc.aweme.publish.model.UploadAuthKeyConfig r0 = (com.ss.android.ugc.aweme.publish.model.UploadAuthKeyConfig) r0
                    com.ss.android.ugc.aweme.publish.model.UploadVideoConfig r2 = r0.videoConfig
                    com.ss.android.ugc.aweme.services.upload.ExternalUploadVideoConfig r3 = new com.ss.android.ugc.aweme.services.upload.ExternalUploadVideoConfig
                    r8 = 0
                    if (r2 == 0) goto L73
                    int r4 = r2.maxFailTime
                    int r5 = r2.sliceSize
                L21:
                    java.lang.String r1 = ""
                    if (r2 == 0) goto L29
                    java.lang.String r6 = r2.fileHostName
                    if (r6 != 0) goto L2c
                L29:
                    r6 = r1
                    if (r2 == 0) goto L30
                L2c:
                    java.lang.String r7 = r2.videoHostName
                    if (r7 != 0) goto L33
                L30:
                    r7 = r1
                    if (r2 == 0) goto L35
                L33:
                    int r8 = r2.sliceTimeout
                L35:
                    if (r2 == 0) goto L3b
                    java.lang.String r9 = r2.appKey
                    if (r9 != 0) goto L3e
                L3b:
                    r9 = r1
                    if (r2 == 0) goto L42
                L3e:
                    java.lang.String r10 = r2.authorization
                    if (r10 != 0) goto L45
                L42:
                    r10 = r1
                    if (r2 == 0) goto L4d
                L45:
                    com.ss.android.ugc.aweme.publish.model.STSAuthConfig r0 = r2.authorizationV2
                    if (r0 == 0) goto L4d
                    java.lang.String r11 = r0.accessKeyId
                    if (r11 != 0) goto L50
                L4d:
                    r11 = r1
                    if (r2 == 0) goto L58
                L50:
                    com.ss.android.ugc.aweme.publish.model.STSAuthConfig r0 = r2.authorizationV2
                    if (r0 == 0) goto L58
                    java.lang.String r12 = r0.secretAccessKey
                    if (r12 != 0) goto L5b
                L58:
                    r12 = r1
                    if (r2 == 0) goto L63
                L5b:
                    com.ss.android.ugc.aweme.publish.model.STSAuthConfig r0 = r2.authorizationV2
                    if (r0 == 0) goto L63
                    java.lang.String r13 = r0.sessionToken
                    if (r13 != 0) goto L66
                L63:
                    r13 = r1
                    if (r2 == 0) goto L6e
                L66:
                    com.ss.android.ugc.aweme.publish.model.STSAuthConfig r0 = r2.authorizationV2
                    if (r0 == 0) goto L6e
                    java.lang.String r14 = r0.spaceName
                    if (r14 != 0) goto L6f
                L6e:
                    r14 = r1
                L6f:
                    r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
                    return r3
                L73:
                    r4 = 0
                    r5 = 0
                    goto L21
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C2207961BbG.getUploadVideoConfig(java.lang.String):com.ss.android.ugc.aweme.services.upload.ExternalUploadVideoConfig");
            }
        };
    }

    @Override // com.ss.android.ugc.aweme.services.IExternalService
    public final IAVFilterService filterService() {
        return (C2262821DhY) this.LJIIZILJ.getValue();
    }

    @Override // com.ss.android.ugc.aweme.services.IExternalService
    public final IAIGCQuotaService getAIGCQuotaService() {
        return (C554390Loj) this.LJI.getValue();
    }

    @Override // com.ss.android.ugc.aweme.services.IExternalService
    public final IAILiveService getAILiveService() {
        return (C565060MEe) this.LJFF.getValue();
    }

    @Override // com.ss.android.ugc.aweme.services.IExternalService
    public final IAVMobService getAVMobService() {
        return (C1361860lXk) this.LJIILLIIL.getValue();
    }

    @Override // com.ss.android.ugc.aweme.services.IExternalService
    public final String getCurrentUploadFrameResult() {
        C1403010mc7.LIZ.getMusicService().al();
        String strLIZIZ = C2275708vr.LIZIZ();
        return strLIZIZ == null ? "" : strLIZIZ;
    }

    @Override // com.ss.android.ugc.aweme.services.IExternalService
    public final NextLiveData<InterfaceC2257101DWa> getCurrentUserData() {
        return C707370Rot.LIZ.LIZ("#CurrentUser");
    }

    @Override // com.ss.android.ugc.aweme.services.IExternalService
    public final IEffectSDKGeneralParamService getEffectSDKGeneralParamService() {
        return new m();
    }

    @Override // com.ss.android.ugc.aweme.services.IExternalService
    public final IInfoService infoService() {
        return (C1442050nd5) this.LJ.getValue();
    }

    @Override // com.ss.android.ugc.aweme.services.IExternalService
    public final IInitTaskService initService() {
        return new IInitTaskService() { // from class: X.13zq
            @Override // com.ss.android.ugc.aweme.services.external.IInitTaskService
            public final C0CCZ initTask(int i) {
                switch (i) {
                    case 2:
                        return new AVCameraInitTaskNew();
                    case 3:
                    case 8:
                    case 14:
                    case 15:
                    case 16:
                    case 19:
                    case 21:
                    default:
                        return null;
                    case 4:
                        return new AVCameraInitTask();
                    case 5:
                        return new DownloadSuperEntranceResTask();
                    case 6:
                        return new ReportAppExitInfoTask();
                    case 7:
                        return new AVCameraInitTask.InitCBClickTrack();
                    case BdTuring.TYPE_ECAF /* 9 */:
                        return new AVCameraInitTask.PostedDraftConvertToNormal();
                    case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                        return new AVCameraInitTask.InitToolsActivityListener();
                    case BdTuring.TYPE_EMAIL /* 11 */:
                        return new DownloadCameraWidgetGuide();
                    case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                        return new AVCleanWatermarkFilesTask();
                    case BdTuring.TYPE_SMS_VOICE /* 13 */:
                        return new PreDownloadEffectModel();
                    case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                        return new InstallLiveQuicPluginTask();
                    case LiveToolbarIconStyleSetting.COLORFUL_WITH_TEXT /* 18 */:
                        return new InstallBytevc1enc8PluginTask();
                    case LiveToolbarIconStyleSetting.HIGHLIGHT_WITH_TEXT /* 20 */:
                        return new CleanForwardCommentDraftCacheTask();
                    case 22:
                        return new PreFetchBeautyData();
                    case 23:
                        return new ReportDraftInfoTask();
                    case LiveSubscriptionQuestionnaireHourFrequencySetting.DEFAULT /* 24 */:
                        return new CleanAVStorageTask();
                    case 25:
                        return new PreloadCameraCoreLayoutTask();
                    case 26:
                        return new PreloadCreativeModelTask();
                    case 27:
                        return new AIRemixStartupInitTask();
                    case 28:
                        return new PreloadAlbumOnFeedTask();
                    case 29:
                        return new AICameoPreloadInitTask();
                }
            }

            @Override // com.ss.android.ugc.aweme.services.external.IInitTaskService
            public final Runnable initTask(int i, Object obj) {
                if (i == 3) {
                    return new Runnable() { // from class: X.0nlm
                        @Override // java.lang.Runnable
                        public final void run() {
                            boolean zLIZ;
                            C1C7U.LIZ("InitTaskServiceImpl@95d5.initTask$1");
                            try {
                                o.LJIIL.invalidate();
                                o.LJIIJJI.invalidate();
                            } finally {
                                if (!zLIZ) {
                                }
                            }
                            C1C7U.LIZIZ("InitTaskServiceImpl@95d5.initTask$1");
                        }
                    };
                }
                return null;
            }
        };
    }

    @Override // com.ss.android.ugc.aweme.services.IExternalService
    public final ILargeTransactionService largeTransactionService() {
        return (C1699910uKz) this.LJIJ.getValue();
    }

    @Override // com.ss.android.ugc.aweme.services.IExternalService
    public final InterfaceC524700Khw mvTemplateService() {
        return (C1429310nIX) this.LJIJJ.getValue();
    }

    @Override // com.ss.android.ugc.aweme.services.IExternalService
    public final IOpenPhotoNextService openGotoNextService() {
        return (C565850MHf) this.LJIIIZ.getValue();
    }

    @Override // com.ss.android.ugc.aweme.services.IExternalService
    public final IOpenTextNextService openTextNextService() {
        return (C577600Ml4) this.LJIIJ.getValue();
    }

    @Override // com.ss.android.ugc.aweme.services.IExternalService
    public final IOpenTextToImageService openTextToImageService() {
        return (C572320McY) this.LJIIJJI.getValue();
    }

    @Override // com.ss.android.ugc.aweme.services.IExternalService
    public final ICreativePerformanceMonitorService performanceMonitorService() {
        return (C0VVD) this.LIZ.getValue();
    }

    @Override // com.ss.android.ugc.aweme.services.IExternalService
    public final IAVPhotoModeService photoModeService() {
        return (C577620Ml6) this.LJIILJJIL.getValue();
    }

    @Override // com.ss.android.ugc.aweme.services.IExternalService
    public final IAVPerformance provideAVPerformance() {
        return (j) this.LJIIIIZZ.getValue();
    }

    @Override // com.ss.android.ugc.aweme.services.IExternalService
    public final ICrashReportService provideErrorReporter() {
        return (C2259608tG) this.LJIILIIL.getValue();
    }

    @Override // com.ss.android.ugc.aweme.services.IExternalService
    public final IAVPublishService publishService() {
        return AVPublishServiceImpl.Companion.getInstance();
    }

    @Override // com.ss.android.ugc.aweme.services.IExternalService
    public final IRouterService routerService() {
        return new IRouterService() { // from class: X.0Mpt
            @Override // com.ss.android.ugc.aweme.services.external.IRouterService
            public final IInterceptor openEditPageRouter() {
                return new OpenVideoEditInterceptor();
            }

            @Override // com.ss.android.ugc.aweme.services.external.IRouterService
            public final IInterceptor openTextEditRouter() {
                return new OpenTextEditInterceptor();
            }

            @Override // com.ss.android.ugc.aweme.services.external.IRouterService
            public final IInterceptor startCreateTemplateRouter() {
                return new StartCreateTemplateInterceptor();
            }
        };
    }

    @Override // com.ss.android.ugc.aweme.services.IExternalService
    public final ICStoryService storyService() {
        return new ICStoryService() { // from class: X.1Drp
            public final C01GW LIZ = C452501pT.LIZIZ(new C2269211Drr());
            public final C01GW LIZIZ = C452501pT.LIZIZ(new C2269201Drq());

            @Override // com.ss.android.ugc.aweme.services.story.ICStoryService
            public final IStoryDraftService storyDraftService() {
                return (C0M5U) this.LIZIZ.getValue();
            }

            @Override // com.ss.android.ugc.aweme.services.story.ICStoryService
            public final IStoryPublishService storyPublishService() {
                return (C1441130nbb) this.LIZ.getValue();
            }
        };
    }

    @Override // com.ss.android.ugc.aweme.services.IExternalService
    public final ISuperEntranceService superEntranceService() {
        return C13V6.LIZ.getValue();
    }

    @Override // com.ss.android.ugc.aweme.services.IExternalService
    public final ITTSService ttsService() {
        C2376609Sy c2376609Sy;
        String name = C2376609Sy.class.getName();
        IAudioServiceFactory iAudioServiceFactoryLIZ = C19550711eL.LIZ(name);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(name);
        sbLIZ.append(" , get impl audio service factory class name is ");
        sbLIZ.append(iAudioServiceFactoryLIZ != null ? iAudioServiceFactoryLIZ.getClass().getSimpleName() : null);
        C2188811AlT.LIZIZ(sbLIZ);
        if (iAudioServiceFactoryLIZ == null || (c2376609Sy = (C2376609Sy) iAudioServiceFactoryLIZ) == null) {
            return null;
        }
        return c2376609Sy;
    }

    @Override // com.ss.android.ugc.aweme.services.IExternalService
    public final IAVTypeFaceService typeFaceService() {
        return new IAVTypeFaceService() { // from class: X.1DrX
            @Override // com.ss.android.ugc.aweme.services.external.IAVTypeFaceService
            public final Typeface getTypefaceByFontName(String str) {
                return C0FI2.LJIJJ().LJJII(str);
            }
        };
    }

    @Override // com.ss.android.ugc.aweme.services.IExternalService
    public final IAVVESDKService vesdkService() {
        return new IAVVESDKService() { // from class: X.15RZ
            @Override // com.ss.android.ugc.aweme.services.external.ability.IAVVESDKService
            public final VEAudioFileInfo getAudioFileInfo(String str) {
                Integer numValueOf;
                Integer numValueOf2;
                Integer numValueOf3;
                Integer numValueOf4;
                VEUtils.VEAudioFileInfo audioFileInfo = VEUtils.getAudioFileInfo(str);
                Integer numValueOf5 = null;
                if (audioFileInfo != null) {
                    numValueOf5 = Integer.valueOf(audioFileInfo.sampleRate);
                    numValueOf = Integer.valueOf(audioFileInfo.channelSize);
                    numValueOf2 = Integer.valueOf(audioFileInfo.sampleFormat);
                    numValueOf3 = Integer.valueOf(audioFileInfo.duration);
                    numValueOf4 = Integer.valueOf(audioFileInfo.bitRate);
                } else {
                    numValueOf = null;
                    numValueOf2 = null;
                    numValueOf3 = null;
                    numValueOf4 = null;
                }
                return new VEAudioFileInfo(numValueOf5, numValueOf, numValueOf2, numValueOf3, numValueOf4);
            }

            @Override // com.ss.android.ugc.aweme.services.external.ability.IAVVESDKService
            public final AVMusicWaveBean getMusicWaveData(String str, int i, int i2) {
                return C15R5.LIZJ(VEUtils.getMusicWaveData(str, i, i2));
            }

            @Override // com.ss.android.ugc.aweme.services.external.ability.IAVVESDKService
            public final AVMusicWaveBean getResampleMusicWaveData(float[] fArr, int i, int i2) {
                return C15R5.LIZJ(VEUtils.getResampleMusicWaveData(fArr, i, i2));
            }
        };
    }

    public AVExternalServiceImpl() {
        Keva keva = C790290UzL.LIZ;
        TENativeLibsLoader.setLibraryHooker(C794580VEy.LIZ);
        this.LIZ = C452501pT.LIZIZ(new C2269081Dre());
        this.LIZIZ = C452501pT.LIZIZ(new C2269101Drg());
        this.LIZJ = C452501pT.LIZIZ(AFwS226S0000000_35.get$arr$(241));
        this.LIZLLL = C452501pT.LIZIZ(new C2207781Bay());
        this.LJ = C452501pT.LIZIZ(new C2269111Drh());
        this.LJFF = C452501pT.LIZIZ(new C2269021DrY());
        this.LJI = C452501pT.LIZIZ(new C2269031DrZ());
        this.LJII = C452501pT.LIZIZ(new C2262811DhX());
        this.LJIIIIZZ = C452501pT.LIZIZ(new C1DP8());
        this.LJIIIZ = C452501pT.LIZIZ(new C2269141Drk());
        this.LJIIJ = C452501pT.LIZIZ(new C2269151Drl());
        this.LJIIJJI = C452501pT.LIZIZ(new C2269161Drm());
        this.LJIIL = C452501pT.LIZIZ(new C2269061Drc());
        this.LJIILIIL = C452501pT.LIZIZ(new C2269071Drd());
        this.LJIILJJIL = C452501pT.LIZIZ(new C2269171Drn());
        this.LJIILL = C452501pT.LIZIZ(new C2269091Drf());
        this.LJIILLIIL = C452501pT.LIZIZ(new C2269051Drb());
        this.LJIIZILJ = C452501pT.LIZIZ(new C2262831DhZ());
        this.LJIJ = C452501pT.LIZIZ(new C2269121Dri());
        this.LJIJI = C452501pT.LIZIZ(new C2269041Dra());
        this.LJIJJ = C452501pT.LIZIZ(new C2269131Drj());
    }

    @Override // com.ss.android.ugc.aweme.services.IExternalService
    public final int getPermissionSettingCache() {
        if (ComplianceServiceProvider.LJIJJ().LJJIIZ()) {
            return 1;
        }
        a.LIZ.getClass();
        return a.LIZIZ();
    }

    @Override // com.ss.android.ugc.aweme.services.IExternalService
    public final String getToolsCachePath() {
        return C0CHQ.LIZ().LJJIIJZLJL().getPathService().getCacheRoot();
    }

    @Override // com.ss.android.ugc.aweme.services.IExternalService
    public final void initASVE() {
        o.LJFF(C2216131BoR.LIZ());
    }

    @Override // com.ss.android.ugc.aweme.services.IExternalService
    public final IPreloadVESo preloadService() {
        return C0LGM.LIZ();
    }

    @Override // com.ss.android.ugc.aweme.services.IExternalService
    public final ISpecialPlusService specialPlusService() {
        return C1642020spc.LIZ();
    }

    @Override // com.ss.android.ugc.aweme.services.IExternalService
    public final IAbnormalExitLogService abnormalExitLogService() {
        return C1440600nak.LIZ;
    }

    @Override // com.ss.android.ugc.aweme.services.IExternalService
    public final IEnterFromService enterFromService() {
        return new IEnterFromService() { // from class: X.0rZd
            public static String LIZIZ = "HOME";

            @Override // com.ss.android.ugc.aweme.services.external.IEnterFromService
            public final String getEnterFrom() {
                return LIZIZ;
            }

            @Override // com.ss.android.ugc.aweme.services.external.IEnterFromService
            public final String getShootEnterFromOnEditModel(PublishModel publishModel) {
                VideoPublishEditModelKt videoPublishEditModelKt;
                CreativeFlowData creativeFlowData;
                ShootExtraData shootExtraData;
                String shootEnterFrom;
                BaseShortVideoContext baseShortVideoContext = publishModel.editModel;
                if (!(baseShortVideoContext instanceof VideoPublishEditModel) || (videoPublishEditModelKt = (VideoPublishEditModelKt) baseShortVideoContext) == null || (creativeFlowData = videoPublishEditModelKt.getCreativeFlowData()) == null || (shootExtraData = creativeFlowData.getShootExtraData()) == null || (shootEnterFrom = shootExtraData.getShootEnterFrom()) == null) {
                    return "";
                }
                return shootEnterFrom;
            }

            @Override // com.ss.android.ugc.aweme.services.external.IEnterFromService
            public final void setEnterFrom(String str) {
                LIZIZ = str;
            }
        };
    }

    @Override // com.ss.android.ugc.aweme.services.IExternalService
    public final ITTEPAbilityService ttepAbilityService() {
        return TTEPAbilityServiceImpl.LIZ;
    }

    @Override // com.ss.android.ugc.aweme.services.IExternalService
    public final void attachApplication(Application application) {
        C2216191BoX.LIZ.getClass();
        C2216191BoX.LIZJ = application;
    }

    @Override // com.ss.android.ugc.aweme.services.IExternalService
    public final void resetBrightness(C19EG c19eg) {
        C01GW c01gw = BrightnessManager.LIZ;
        if (c19eg != null) {
            BrightnessManager.LJFF(c19eg);
        }
        BrightnessManager.LJI = true;
        BrightnessManager.LIZJ = null;
        BrightnessManager.LIZLLL = null;
    }

    @Override // com.ss.android.ugc.aweme.services.IExternalService
    public final void setVideoIdParam(Aweme aweme) {
        C1443560nfW.LJIIL(aweme);
    }

    @Override // com.ss.android.ugc.aweme.services.IExternalService
    public final void updateVESDKDeviceId(String str) {
        Application application = o.LIZ;
        if (C2216161BoU.LJI) {
            C2216191BoX.LIZ.getClass();
            C2216151BoT c2216151BoT = ((C2208821Bce) C2216191BoX.LIZIZ()).LIZLLL;
            if (TextUtils.isEmpty(str)) {
                str = "";
            }
            c2216151BoT.LIZ = str;
            C1A67.LLILLJJLI.LL.LIZIZ(((C2208821Bce) C2216191BoX.LIZIZ()).LIZLLL.LIZ, "KEY_DEVICEID", true);
        }
    }

    @Override // com.ss.android.ugc.aweme.services.IExternalService
    public final void asyncService(String str, IExternalService.ServiceLoadCallback serviceLoadCallback) {
        serviceLoadCallback.onLoad((C2262801DhW) this.LJII.getValue(), 100L);
    }

    @Override // com.ss.android.ugc.aweme.services.IExternalService
    public final void asyncServiceWithOutPanel(String str, IExternalService.ServiceLoadCallback serviceLoadCallback) {
        serviceLoadCallback.onLoad((C2262801DhW) this.LJII.getValue(), 100L);
    }

    @Override // com.ss.android.ugc.aweme.services.IExternalService
    public final void asyncService(Context context, String str, IExternalService.ServiceLoadCallback serviceLoadCallback) {
        serviceLoadCallback.onLoad((C2262801DhW) this.LJII.getValue(), 100L);
    }

    @Override // com.ss.android.ugc.aweme.services.IExternalService
    public final void asyncServiceForMainRecordService(Context context, String str, IExternalService.ServiceLoadCallback serviceLoadCallback) {
        serviceLoadCallback.onLoad((C2262801DhW) this.LJII.getValue(), 100L);
    }

    @Override // com.ss.android.ugc.aweme.services.IExternalService
    public final void asyncServiceWithActivity(Context context, String str, IExternalService.ServiceLoadCallback serviceLoadCallback) {
        serviceLoadCallback.onLoad((C2262801DhW) this.LJII.getValue(), 100L);
    }
}
