package com.ss.android.ugc.aweme.live.livehostimpl;

import X.C04QR;
import X.C13Q5;
import X.C14E9;
import X.C15O7;
import X.C1840140xzA;
import X.C19EG;
import X.C19F0;
import X.C201955140j;
import X.C20622515mp;
import X.C2188811AlT;
import X.C294080Bfq;
import X.C535670Kzd;
import X.C580610Mpv;
import X.C7740030o;
import X.C781360Ukw;
import X.C844470XAv;
import X.InterfaceC1637930sj1;
import X.InterfaceC20597015ii;
import X.InterfaceC20622815ms;
import X.InterfaceC2385309Wh;
import Y.ACallableS18S2100000_8;
import Y.ACallableS61S1100000_8;
import Y.AObjectS372S0100000_29;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.util.Pair;
import com.bef.effectsdk.AssetResourceFinder;
import com.bef.effectsdk.ResourceFinder;
import com.bytedance.android.livesdk.livesetting.highlight.LiveReplayAutoAddMusicSetting;
import com.bytedance.android.livesdk.livesetting.performance.LiveBroadcastEndPageOpenNewSAA;
import com.bytedance.android.livesdk.replay.proto.Caption;
import com.bytedance.android.livesdk.replay.proto.PublishPageParams;
import com.bytedance.android.livesdkapi.host.IHostCreativeTool;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import com.ss.android.ugc.aweme.creative.model.AnchorTransData;
import com.ss.android.ugc.aweme.creative.model.CreativeInitialModel;
import com.ss.android.ugc.aweme.creative.model.HashtagsModel;
import com.ss.android.ugc.aweme.creative.model.HighLightVideoParametersModel;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.live.livehostimpl.LiveBusinessExtra;
import com.ss.android.ugc.aweme.live.livehostimpl.LiveBusinessGiftHighlight;
import com.ss.android.ugc.aweme.live.livehostimpl.LiveHostCreativeTool;
import com.ss.android.ugc.aweme.services.IExternalService;
import com.ss.android.ugc.aweme.services.draft.ISaveVideoToDraftListener;
import com.ss.android.ugc.aweme.services.effect.IEffectDeletableCheckerService;
import com.ss.android.ugc.aweme.services.external.IAVDraftService;
import com.ss.android.ugc.aweme.services.external.ability.IAVEffectService;
import com.ss.android.ugc.aweme.services.external.ui.EditConfig;
import com.ss.android.ugc.aweme.services.external.ui.VideoMedia;
import com.ss.android.ugc.aweme.shortvideo.PublishManagerService;
import com.ss.android.ugc.aweme.shortvideo.model.ExtraMentionUserModel;
import com.ss.android.ugc.aweme.sticker.IStickerViewService;
import com.ss.android.ugc.aweme.sticker.data.CreateAnchorInfo;
import com.ss.android.ugc.aweme.sticker.data.Utterance;
import com.ss.android.ugc.aweme.tools.integration.plugin.integration.api.CreativeToolsPluginService;
import com.ss.android.ugc.effectmanager.DownloadableModelSupport;
import com.ss.android.ugc.effectmanager.EffectManager;
import com.ss.android.ugc.effectmanager.algorithm.FetchResourcesListener;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import org.json.JSONObject;
import v7.o;

/* JADX INFO: loaded from: classes31.dex */
public class LiveHostCreativeTool implements IHostCreativeTool {
    public final Map<C14E9, InterfaceC1637930sj1> LL = new HashMap();
    public EffectManager LLILLJJLI;

    @Override // com.bytedance.android.livesdkapi.host.IHostCreativeTool
    public final EffectManager LLJILJILJ() {
        if (this.LLILLJJLI == null) {
            final o oVar = new o();
            if (PluggableExtentionKt.pluggableSpi(IExternalService.class) == null) {
                return null;
            }
            IAVEffectService iAVEffectServiceEffectService = ((IExternalService) ServiceManager.get().getService(IExternalService.class)).abilityService().effectService();
            C844470XAv.LIZ.getClass();
            iAVEffectServiceEffectService.buildEffectPlatform(C844470XAv.LIZ(), new IAVEffectService.IAVEffectReadyCallback() { // from class: X.13vh
                @Override // com.ss.android.ugc.aweme.services.external.ability.IAVEffectService.IAVEffectReadyCallback
                public final void finish(Object obj) {
                    o oVar2 = oVar;
                    InterfaceC1635410sex interfaceC1635410sex = (InterfaceC1635410sex) obj;
                    if (interfaceC1635410sex != null) {
                        oVar2.LJ(interfaceC1635410sex.LLJILJILJ());
                    } else {
                        oVar2.LIZIZ(new RuntimeException("Decompress failed"));
                    }
                }
            }, new AObjectS372S0100000_29(iAVEffectServiceEffectService, 11));
            try {
                C15O7<TResult> c15o7 = oVar.LIZ;
                c15o7.LJIJJLI();
                if (c15o7.LJIILL()) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("So decompress: LiveAppContext, get effect manager wrong,  task error: ");
                    sbLIZ.append(Log.getStackTraceString(c15o7.LJIIJJI()));
                    C201955140j.LJ(C2188811AlT.LIZIZ(sbLIZ));
                } else {
                    this.LLILLJJLI = (EffectManager) c15o7.LJIIL();
                }
            } catch (InterruptedException e) {
                TryCatchGuardChecker.doCheck(e);
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("So decompress: LiveAppContext, get effect manager wrong, ");
                sbLIZ2.append(e.getMessage());
                sbLIZ2.append("at ");
                sbLIZ2.append(Log.getStackTraceString(e));
                C201955140j.LJ(C2188811AlT.LIZIZ(sbLIZ2));
            }
        }
        return this.LLILLJJLI;
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostCreativeTool
    public final boolean ni() {
        CreativeToolsPluginService creativeToolsPluginService = (CreativeToolsPluginService) PluggableExtentionKt.pluggableSpi(CreativeToolsPluginService.class);
        C844470XAv.LIZ.getClass();
        return creativeToolsPluginService != null && creativeToolsPluginService.LJI(C844470XAv.LIZ());
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostCreativeTool
    public final void K42() {
        IStickerViewService iStickerViewService = (IStickerViewService) ServiceManager.get().getService(IStickerViewService.class);
        if (iStickerViewService != null) {
            iStickerViewService.release();
            iStickerViewService.setPixelLoopStickerPresenterSupplier(null);
        }
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostCreativeTool
    public final boolean UC0() {
        return C294080Bfq.LIZ();
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostCreativeTool
    public final String getEPAccessKey() {
        return ((IStickerViewService) ServiceManager.get().getService(IStickerViewService.class)).getEPAccessKey();
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostCreativeTool
    public final String getEPVersion() {
        return ((IStickerViewService) ServiceManager.get().getService(IStickerViewService.class)).getEPVersion();
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostCreativeTool
    public final String getEffectSdkVersion() {
        return ((IStickerViewService) ServiceManager.get().getService(IStickerViewService.class)).getEffectSdkVersion();
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostCreativeTool
    public final void hideStickerView() {
        IStickerViewService iStickerViewService = (IStickerViewService) ServiceManager.get().getService(IStickerViewService.class);
        if (iStickerViewService != null) {
            iStickerViewService.hideStickerView();
        }
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostCreativeTool
    public final boolean isGalleryModuleInitialized() {
        IStickerViewService iStickerViewService = (IStickerViewService) ServiceManager.get().getService(IStickerViewService.class);
        if (iStickerViewService != null) {
            return iStickerViewService.isGalleryModuleInitialized();
        }
        return false;
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostCreativeTool
    public final boolean isShowStickerView() {
        IStickerViewService iStickerViewService = (IStickerViewService) ServiceManager.get().getService(IStickerViewService.class);
        if (iStickerViewService != null) {
            return iStickerViewService.isShowStickerView();
        }
        return false;
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostCreativeTool
    public final void needAbortCleanup() {
        IEffectDeletableCheckerService iEffectDeletableCheckerService = (IEffectDeletableCheckerService) ServiceManager.get().getService(IEffectDeletableCheckerService.class);
        if (iEffectDeletableCheckerService != null) {
            iEffectDeletableCheckerService.needAbortCleanup();
        }
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostCreativeTool
    public final void releaseGalleryModule() {
        IStickerViewService iStickerViewService = (IStickerViewService) ServiceManager.get().getService(IStickerViewService.class);
        if (iStickerViewService != null) {
            iStickerViewService.releaseGalleryModule();
        }
        ((HashMap) this.LL).clear();
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostCreativeTool
    public final void scanPhotoList() {
        IStickerViewService iStickerViewService = (IStickerViewService) ServiceManager.get().getService(IStickerViewService.class);
        if (iStickerViewService != null) {
            iStickerViewService.scanPhotoList();
        }
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostCreativeTool
    public final void selectFromGallery() {
        IStickerViewService iStickerViewService = (IStickerViewService) ServiceManager.get().getService(IStickerViewService.class);
        if (iStickerViewService != null) {
            iStickerViewService.selectFromGallery();
        }
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostCreativeTool
    public final void BJ0(C14E9 c14e9) {
        IStickerViewService iStickerViewService = (IStickerViewService) ServiceManager.get().getService(IStickerViewService.class);
        InterfaceC1637930sj1 interfaceC1637930sj1 = (InterfaceC1637930sj1) ((HashMap) this.LL).remove(c14e9);
        if (iStickerViewService != null && interfaceC1637930sj1 != null) {
            iStickerViewService.removeScanPhotoListListener(interfaceC1637930sj1);
        }
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostCreativeTool
    public final String Gr1(Long l) {
        return C1840140xzA.LIZ(l.longValue());
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostCreativeTool
    public final boolean cd(Context context) {
        return C04QR.LIZ(context, true);
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostCreativeTool
    public final List<String> handleGalleryResult(Intent intent) {
        IStickerViewService iStickerViewService = (IStickerViewService) ServiceManager.get().getService(IStickerViewService.class);
        if (iStickerViewService != null) {
            return iStickerViewService.handleGalleryResult(intent);
        }
        return Collections.emptyList();
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostCreativeTool
    public final InterfaceC20622815ms nc2(Activity activity) {
        return C20622515mp.LIZJ(activity);
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostCreativeTool
    public final String q30(String str) {
        if (C13Q5.LIZJ()) {
            return C13Q5.LIZ().LIZLLL().findResourceUri(str);
        }
        return null;
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostCreativeTool
    public final void qh2(C19EG c19eg) {
        InterfaceC20597015ii interfaceC20597015iiLIZJ = C20622515mp.LIZJ(c19eg);
        if (interfaceC20597015iiLIZJ != null) {
            interfaceC20597015iiLIZJ.ac(null);
        }
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostCreativeTool
    public final void qk2(String str) {
        if (DownloadableModelSupport.isInitialized()) {
            DownloadableModelSupport.getInstance().fetchResourcesWithModelNames(0, new String[]{str}, new FetchResourcesListener() { // from class: X.14EB
                public final /* synthetic */ C14EC LIZ = null;

                @Override // com.ss.android.ugc.effectmanager.algorithm.FetchResourcesListener
                public final void onSuccess() {
                    C14EC c14ec = this.LIZ;
                    if (c14ec != null) {
                        c14ec.onSuccess();
                    }
                }

                @Override // com.ss.android.ugc.effectmanager.algorithm.FetchResourcesListener
                public final void onFailed(Exception exc) {
                    C14EC c14ec = this.LIZ;
                    if (c14ec != null) {
                        c14ec.onFailed(exc);
                    }
                }
            });
        }
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostCreativeTool
    public final void selectFromGalleryByLauncher(C19F0<Intent> c19f0) {
        IStickerViewService iStickerViewService = (IStickerViewService) ServiceManager.get().getService(IStickerViewService.class);
        if (iStickerViewService != null) {
            iStickerViewService.selectFromGalleryByLauncher(c19f0);
        }
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostCreativeTool
    public final void Aq1(Activity activity, final C14E9 c14e9) {
        IStickerViewService iStickerViewService = (IStickerViewService) ServiceManager.get().getService(IStickerViewService.class);
        if (iStickerViewService != null && !((HashMap) this.LL).containsKey(c14e9)) {
            InterfaceC1637930sj1 interfaceC1637930sj1 = new InterfaceC1637930sj1() { // from class: X.14E8
                @Override // X.InterfaceC1637930sj1
                public final void LLZLI(String str) {
                    c14e9.LLZLI(str);
                }

                @Override // X.InterfaceC1637930sj1
                public final void f(List<String> list) {
                    c14e9.f(list);
                }

                @Override // X.InterfaceC1637930sj1
                public final void LLLLLLLLL(String str, String str2, String str3) {
                    c14e9.LLLLLLLLL(str, str2, str3);
                }
            };
            iStickerViewService.initGalleryModule(activity, interfaceC1637930sj1);
            ((HashMap) this.LL).put(c14e9, interfaceC1637930sj1);
        }
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostCreativeTool
    public final Object Nd1(Context context, String str) {
        if (PluggableExtentionKt.pluggableSpi(IExternalService.class) == null) {
            return new AssetResourceFinder(context.getAssets(), str);
        }
        final o oVar = new o();
        ((IExternalService) ServiceManager.get().getService(IExternalService.class)).abilityService().effectService().provideResourceFinder(new IAVEffectService.IAVEffectReadyCallback() { // from class: X.13vg
            @Override // com.ss.android.ugc.aweme.services.external.ability.IAVEffectService.IAVEffectReadyCallback
            public final void finish(Object obj) {
                LiveHostCreativeTool liveHostCreativeTool = this.LIZ;
                o oVar2 = oVar;
                final IAVEffectService.ResourceFinder resourceFinder = (IAVEffectService.ResourceFinder) obj;
                liveHostCreativeTool.getClass();
                ResourceFinder resourceFinder2 = new ResourceFinder() { // from class: X.13Uz
                    @Override // com.bef.effectsdk.ResourceFinder
                    public final long createNativeMD5ResourceFinder(long j) {
                        return resourceFinder.createNativeMD5ResourceFinder(j);
                    }

                    @Override // com.bef.effectsdk.ResourceFinder
                    public final long createNativeResourceFinder(long j) {
                        return resourceFinder.createNativeResourceFinder(j);
                    }

                    @Override // com.bef.effectsdk.ResourceFinder
                    public final void release(long j) {
                        resourceFinder.release(j);
                    }
                };
                if (resourceFinder != null) {
                    oVar2.LJ(resourceFinder2);
                } else {
                    oVar2.LIZIZ(new RuntimeException("Decompress failed"));
                }
            }
        });
        C15O7<TResult> c15o7 = oVar.LIZ;
        try {
            c15o7.LJIJJLI();
            if (c15o7.LJIILL()) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("So decompress: LiveAppContext, get resource finder wrong,  task error: ");
                sbLIZ.append(Log.getStackTraceString(c15o7.LJIIJJI()));
                C201955140j.LJ(C2188811AlT.LIZIZ(sbLIZ));
            }
        } catch (InterruptedException e) {
            TryCatchGuardChecker.doCheck(e);
        }
        Object objLJIIL = c15o7.LJIIL();
        if (objLJIIL == null) {
            return new AssetResourceFinder(context.getAssets(), str);
        }
        return objLJIIL;
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostCreativeTool
    public final boolean a72(Context context, String str) {
        return C535670Kzd.LIZ().LIZJ(context, str, true);
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostCreativeTool
    public final void lF(ArrayList arrayList, final C781360Ukw c781360Ukw) {
        ((IExternalService) ServiceManager.get().getService(IExternalService.class)).draftService().saveDraft(new IAVDraftService.SaveDraftByPathParam(arrayList, UUID.randomUUID().toString(), "live_highlight", new ISaveVideoToDraftListener() { // from class: X.14EA
            @Override // com.ss.android.ugc.aweme.services.draft.ISaveVideoToDraftListener
            public final void onSuccess() {
                C14EC c14ec = c781360Ukw;
                if (c14ec != null) {
                    c14ec.onSuccess();
                }
            }

            @Override // com.ss.android.ugc.aweme.services.draft.ISaveVideoToDraftListener
            public final void onFailed(Exception exc) {
                C14EC c14ec = c781360Ukw;
                if (c14ec != null && exc != null) {
                    c14ec.onFailed(exc);
                }
            }
        }, null, null));
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostCreativeTool
    public final void resizePhoto(String str, String str2) {
        IStickerViewService iStickerViewService = (IStickerViewService) ServiceManager.get().getService(IStickerViewService.class);
        if (iStickerViewService != null) {
            iStickerViewService.resizePhoto(str, str2);
        }
    }

    public static void LIZ(HighLightVideoParametersModel highLightVideoParametersModel, LiveBusinessGiftHighlight liveBusinessGiftHighlight, String str) {
        if (str.equals("send_to_dm")) {
            try {
                if (liveBusinessGiftHighlight.getBusinessExtra() != null) {
                    String strOptString = new JSONObject(liveBusinessGiftHighlight.getBusinessExtra()).optString("gift_metadata");
                    if (!strOptString.isEmpty()) {
                        highLightVideoParametersModel.toUserId = new JSONObject(strOptString).optString("sender_uid");
                    }
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostCreativeTool
    public final void Gq2(final Context context, final String str, final String str2, String str3, int i, String str4, String str5, String str6, String str7, String str8, String str9, final String str10, String str11, Integer num, String str12, String str13, final C580610Mpv c580610Mpv) {
        final boolean z;
        final CreativeInitialModel creativeInitialModel = new CreativeInitialModel();
        final HighLightVideoParametersModel highLightVideoParametersModel = creativeInitialModel.highLightVideoParametersModel;
        highLightVideoParametersModel.fragmentId = str3;
        highLightVideoParametersModel.roomId = str4;
        highLightVideoParametersModel.replayTitle = str5;
        highLightVideoParametersModel.fragmentType = str6;
        highLightVideoParametersModel.itemAnchorId = str9;
        highLightVideoParametersModel.scene = str10;
        highLightVideoParametersModel.enterFrom = str11;
        highLightVideoParametersModel.gifterRanking = num;
        highLightVideoParametersModel.publisherIdentity = str12;
        highLightVideoParametersModel.enterFromPage = str13;
        if (c580610Mpv != null && c580610Mpv.LIZ != null) {
            highLightVideoParametersModel.needChangeVolume = true;
        }
        if (LiveReplayAutoAddMusicSetting.INSTANCE.enable()) {
            highLightVideoParametersModel.autoAddMusicEnable = true;
        }
        if (new LiveHostBridge().liveInSaaStack() && LiveBroadcastEndPageOpenNewSAA.getEnable()) {
            z = true;
        } else {
            z = false;
        }
        Gson gson = C7740030o.LIZ().getGson();
        if (i == 1) {
            C15O7.LIZJ(new ACallableS61S1100000_8(gson, str8, 5)).LJ(new InterfaceC2385309Wh() { // from class: X.0Mpm
                @Override // X.InterfaceC2385309Wh
                public final Object then(C15O7 c15o7) {
                    LiveBusinessGiftHighlight liveBusinessGiftHighlight;
                    C580600Mpu c580600Mpu;
                    HashtagsModel hashtagsModel;
                    LiveHostCreativeTool liveHostCreativeTool = this.LIZ;
                    CreativeInitialModel creativeInitialModel2 = creativeInitialModel;
                    HighLightVideoParametersModel highLightVideoParametersModel2 = highLightVideoParametersModel;
                    String str14 = str10;
                    String str15 = str;
                    String str16 = str2;
                    boolean z2 = z;
                    C580610Mpv c580610Mpv2 = c580610Mpv;
                    Context context2 = context;
                    liveHostCreativeTool.getClass();
                    C1C7U.LIZ("LiveHostCreativeTool@890f.openShortVideoEditPage$2L");
                    if (c15o7.LJIILJJIL() && (liveBusinessGiftHighlight = (LiveBusinessGiftHighlight) c15o7.LJIIL()) != null) {
                        List<String> list = C580530Mpn.LIZIZ;
                        if (list != null && !list.isEmpty() && 0 == 0) {
                            new HashtagsModel(C580530Mpn.LIZIZ, 2);
                            List<String> list2 = C580530Mpn.LIZIZ;
                            if (list2 != null && !list2.isEmpty()) {
                                hashtagsModel = new HashtagsModel(C580530Mpn.LIZIZ, 2);
                            } else {
                                hashtagsModel = null;
                            }
                            creativeInitialModel2.hashtagsModel = hashtagsModel;
                        }
                        ExtraMentionUserModel extraMentionUserModel = C580530Mpn.LIZJ;
                        if (extraMentionUserModel != null) {
                            creativeInitialModel2.mentionUserModel = extraMentionUserModel;
                        }
                        ArrayList arrayList = new ArrayList();
                        PublishPageParams publishPageParams = liveBusinessGiftHighlight.PublishPageParams;
                        if (publishPageParams != null) {
                            for (Caption caption : publishPageParams.captions) {
                                long j = caption.startTime;
                                arrayList.add(new Utterance(j, caption.duration + j, caption.text, "#00000000", "#00FFFFF", 0.0f, 0.0f, 22, 0, "", false));
                            }
                            highLightVideoParametersModel2.utteranceList = arrayList;
                        }
                        LiveHostCreativeTool.LIZ(highLightVideoParametersModel2, liveBusinessGiftHighlight, str14);
                        VideoMedia videoMedia = new VideoMedia(str15);
                        EditConfig.Builder builder = new EditConfig.Builder();
                        builder.mediaInfo(videoMedia);
                        builder.shootWay(str16);
                        builder.initialInputModel(creativeInitialModel2);
                        builder.startSaaWithSingleTop(Boolean.valueOf(z2));
                        builder.startSaaFromLive(Boolean.valueOf(z2));
                        EditConfig editConfigBuild = builder.build();
                        if (C323910Cmr.LIZ && c580610Mpv2 != null && (c580600Mpu = c580610Mpv2.LIZ) != null) {
                            long j2 = c580600Mpu.LIZ;
                            if (j2 > 0) {
                                editConfigBuild.setMusicId(String.valueOf(j2));
                                editConfigBuild.setVoiceVolume(Float.valueOf(c580600Mpu.LIZIZ));
                                editConfigBuild.setMusicVolume(Float.valueOf(c580600Mpu.LIZJ));
                            }
                        }
                        List<AnchorTransData> list3 = C580530Mpn.LIZ;
                        if (list3 != null) {
                            editConfigBuild.setAnchors(list3);
                        }
                        editConfigBuild.setLiveShootPage(C580530Mpn.LIZ(editConfigBuild.getAnchors()));
                        PublishManagerService.LIZIZ().LIZ();
                        C575330MhP.LIZ(context2, editConfigBuild, liveBusinessGiftHighlight);
                    }
                    C1C7U.LIZIZ("LiveHostCreativeTool@890f.openShortVideoEditPage$2L");
                    return null;
                }
            }, C15O7.LJIIIIZZ, null);
        } else {
            final boolean z2 = z;
            C15O7.LIZJ(new ACallableS18S2100000_8(gson, str7, str8, 1)).LJ(new InterfaceC2385309Wh() { // from class: X.0Mpl
                @Override // X.InterfaceC2385309Wh
                public final Object then(C15O7 c15o7) {
                    LiveBusinessExtra liveBusinessExtra;
                    List<String> list;
                    LiveHostCreativeTool liveHostCreativeTool = this.LIZ;
                    HighLightVideoParametersModel highLightVideoParametersModel2 = highLightVideoParametersModel;
                    String str14 = str10;
                    CreativeInitialModel creativeInitialModel2 = creativeInitialModel;
                    String str15 = str;
                    String str16 = str2;
                    boolean z3 = z2;
                    Context context2 = context;
                    liveHostCreativeTool.getClass();
                    C1C7U.LIZ("LiveHostCreativeTool@890f.openShortVideoEditPage$4L");
                    if (c15o7.LJIILJJIL()) {
                        Pair pair = (Pair) c15o7.LJIIL();
                        if (pair != null) {
                            liveBusinessExtra = (LiveBusinessExtra) pair.first;
                            LiveBusinessGiftHighlight liveBusinessGiftHighlight = (LiveBusinessGiftHighlight) pair.second;
                            if (liveBusinessGiftHighlight != null && liveBusinessGiftHighlight.getPublishPageParams() != null) {
                                list = liveBusinessGiftHighlight.getPublishPageParams().challenges;
                                LiveHostCreativeTool.LIZ(highLightVideoParametersModel2, liveBusinessGiftHighlight, str14);
                            } else {
                                list = null;
                            }
                        } else {
                            liveBusinessExtra = null;
                            list = null;
                        }
                        ArrayList arrayList = new ArrayList();
                        if (liveBusinessExtra != null) {
                            highLightVideoParametersModel2.isEcom = true;
                            C1430560nKY c1430560nKY = AnchorTransData.Companion;
                            CreateAnchorInfo anchorInfo = liveBusinessExtra.getAnchorInfo();
                            c1430560nKY.getClass();
                            arrayList.add(C1430560nKY.LIZ(anchorInfo));
                            creativeInitialModel2.highLightVideoParametersModel.stickerText = liveBusinessExtra.getVideoSuggestTitle();
                            creativeInitialModel2.highLightVideoParametersModel.stickerHint = liveBusinessExtra.getVideoSuggestToast();
                        }
                        List<AnchorTransData> list2 = C580530Mpn.LIZ;
                        if (list2 != null && ((ArrayList) list2).size() > 0) {
                            arrayList.add(ListProtector.get(C580530Mpn.LIZ, 0));
                        }
                        String strLIZ = C580530Mpn.LIZ(arrayList);
                        VideoMedia videoMedia = new VideoMedia(str15);
                        EditConfig.Builder builder = new EditConfig.Builder();
                        builder.mediaInfo(videoMedia);
                        builder.shootWay(str16);
                        builder.anchors(arrayList);
                        builder.initialInputModel(creativeInitialModel2);
                        builder.challengeNames(list);
                        builder.startSaaWithSingleTop(Boolean.valueOf(z3));
                        builder.startSaaFromLive(Boolean.valueOf(z3));
                        builder.liveShootPage(strLIZ);
                        EditConfig editConfigBuild = builder.build();
                        PublishManagerService.LIZIZ().LIZ();
                        ((IExternalService) ServiceManager.get().getService(IExternalService.class)).asyncService(context2, "upload", new C580820MqG(context2, editConfigBuild, 13));
                    }
                    C1C7U.LIZIZ("LiveHostCreativeTool@890f.openShortVideoEditPage$4L");
                    return null;
                }
            }, C15O7.LJIIIIZZ, null);
        }
    }
}
