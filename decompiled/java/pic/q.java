package pic;

import X.AbstractC1387200mCc;
import X.AbstractC20598115it;
import X.C013C;
import X.C08JS;
import X.C098200Yq;
import X.C0C64;
import X.C0CHQ;
import X.C0CIJ;
import X.C0IKQ;
import X.C0L0E;
import X.C0L0F;
import X.C0LAB;
import X.C0LE0;
import X.C0LE5;
import X.C0LE8;
import X.C0LEI;
import X.C0MPJ;
import X.C0MPK;
import X.C0MWH;
import X.C0XF1;
import X.C10GR;
import X.C1227904rF;
import X.C122T;
import X.C1388190mED;
import X.C1389890mGx;
import X.C1394330mO7;
import X.C1398350mUb;
import X.C13BV;
import X.C1403010mc7;
import X.C1412390mrF;
import X.C1412660mrg;
import X.C1416310mxZ;
import X.C1417710mzp;
import X.C1419810n3D;
import X.C1428840nHm;
import X.C1429050nI7;
import X.C1432940nOO;
import X.C1443540nfU;
import X.C1443560nfW;
import X.C1446130njf;
import X.C1449400now;
import X.C1449410nox;
import X.C1452640nuA;
import X.C14D2;
import X.C1668306g5;
import X.C1688680u2s;
import X.C189200o6;
import X.C1906580ziK;
import X.C19565911gn;
import X.C19712912At;
import X.C19EG;
import X.C19EH;
import X.C201955140j;
import X.C20656615sK;
import X.C2188811AlT;
import X.C2216131BoR;
import X.C2344009Gk;
import X.C2354709Kn;
import X.C259800zU;
import X.C298890Bnb;
import X.C298910Bnd;
import X.C298980Bnk;
import X.C299080Bnu;
import X.C522680Keg;
import X.C524780Ki4;
import X.C531610Kt5;
import X.C531620Kt6;
import X.C536500L2i;
import X.C537520L6g;
import X.C538540LAe;
import X.C539530LDz;
import X.C571430Mb7;
import X.C571450Mb9;
import X.C573640Meg;
import X.C573660Mei;
import X.C573710Men;
import X.C573720Meo;
import X.C573740Meq;
import X.C573760Mes;
import X.C573840Mf0;
import X.C688120Qyw;
import X.C785410UrT;
import X.C786410Ut5;
import X.C849850XVn;
import X.DialogC1389620mGW;
import X.EnumC1412640mre;
import X.EnumC539100LCi;
import X.InterfaceC1389630mGX;
import X.InterfaceC1419170n2B;
import X.InterfaceC1711206n0;
import X.InterfaceC20658015sY;
import X.InterfaceC573670Mej;
import Y.ARunnableS41S0300000_8;
import android.app.Activity;
import android.appwidget.AppWidgetManager;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.ies.cutsame.cut_android.NLEPrepareListener;
import com.bytedance.ies.cutsame.resourcefetcher.NetworkFileFetcher;
import com.bytedance.ies.nle.editor_jni.LogLevel;
import com.bytedance.ies.nle.editor_jni.NLEEditorJniJNI;
import com.bytedance.ies.nle.editor_jni.NLEModelDownloader;
import com.bytedance.ies.nle.editor_jni.NLETemplateModel;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.poplayer.core.PopupManager;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.scene.Scene;
import com.bytedance.scene.navigation.NavigationScene;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.h;
import com.google.gson.k;
import com.google.gson.p;
import com.google.gson.reflect.TypeToken;
import com.ss.android.ugc.aweme.adaptation.saa.SAAActivity;
import com.ss.android.ugc.aweme.api.pipeline.ITemplateConsumeService;
import com.ss.android.ugc.aweme.autocut.s;
import com.ss.android.ugc.aweme.commercialize.media.api.service.ICommerceMediaService;
import com.ss.android.ugc.aweme.creative.model.CreativeFlowData;
import com.ss.android.ugc.aweme.creative.model.CreativeInfo;
import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.creative.model.DMCameraModel;
import com.ss.android.ugc.aweme.creative.model.PUgcTemplateData;
import com.ss.android.ugc.aweme.creative.model.TemplateAnchorData;
import com.ss.android.ugc.aweme.creative.model.music.AVMusic;
import com.ss.android.ugc.aweme.creative.model.photomode.template.ImageEffectTemplateReuseData;
import com.ss.android.ugc.aweme.creative.model.publish.FollowUpPublishTrackerModel;
import com.ss.android.ugc.aweme.cutsame.CutsameDataItem;
import com.ss.android.ugc.aweme.deeplink.IDeepLinkService;
import com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.interfaces.ITemplateResourceService;
import com.ss.android.ugc.aweme.mob.record.IRecordMobService;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.mvtemplate.impl.MovieReuseServiceImpl;
import com.ss.android.ugc.aweme.services.IMainService;
import com.ss.android.ugc.aweme.services.IMusicPublishBridgeService;
import com.ss.android.ugc.aweme.services.effect.EffectService;
import com.ss.android.ugc.aweme.services.external.TemplateScene;
import com.ss.android.ugc.aweme.services.external.ui.AutoCutAnchorConfig;
import com.ss.android.ugc.aweme.services.external.ui.DMAlbumParams;
import com.ss.android.ugc.aweme.services.external.ui.IRecordPageLifecycle;
import com.ss.android.ugc.aweme.services.external.ui.PhotoMvAnchorConfig;
import com.ss.android.ugc.aweme.services.external.ui.RecordConfig;
import com.ss.android.ugc.aweme.services.external.ui.SoundSyncAnchorConfig;
import com.ss.android.ugc.aweme.services.external.ui.StickerDownloadConfig;
import com.ss.android.ugc.aweme.services.external.ui.UgcTemplateAlbumConfig;
import com.ss.android.ugc.aweme.services.external.ui.UgcTemplateAnchorConfig;
import com.ss.android.ugc.aweme.services.external.ui.config.PhotoModeTemplateAnchorConfig;
import com.ss.android.ugc.aweme.services.video.VideoRecordEntranceServiceImpl;
import com.ss.android.ugc.aweme.shortvideo.CameraComponentModel;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.edit.audioedit.memesong.MemeSongPageContainerScene;
import com.ss.android.ugc.aweme.shortvideo.model.AVETParameter;
import com.ss.android.ugc.aweme.shortvideo.model.MemeSongModel;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.ss.android.ugc.aweme.shortvideo.model.ShootExtraData;
import com.ss.android.ugc.aweme.shortvideo.model.TemplateSlot;
import com.ss.android.ugc.aweme.shortvideo.model.TemplateSlotKt;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvChoosePhotoActivity;
import com.ss.android.ugc.aweme.shortvideo.ui.VideoRecordContainerScene;
import com.ss.android.ugc.aweme.shortvideo.util.performance.AutoCutAnchorOpenAlbumPerformanceMonitor;
import com.ss.android.ugc.aweme.shortvideo.util.performance.PhotoModeTemplateOpenAlbumPanelPerformanceMonitor;
import com.ss.android.ugc.aweme.shortvideo.util.performance.SoundSyncOpenAlbumPanelPerformanceMonitor;
import com.ss.android.ugc.aweme.shortvideo.util.performance.UGCOpenAlbumPanelPerformanceMonitor;
import com.ss.android.ugc.aweme.template.TemplateAnchorConfig;
import com.ss.android.ugc.aweme.tools.detail.IMovieReuseService;
import com.ss.android.ugc.aweme.tools.integration.plugin.integration.api.CreativeToolsPluginService;
import com.ss.android.ugc.cut_reportor_interface.ICutReporter;
import com.ss.android.ugc.cut_ui.MediaItem;
import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchAssetItemInfo;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListener;
import com.ss.android.ugc.effectmanager.effect.model.Asset;
import com.ss.android.ugc.effectmanager.effect.model.AssetItemModel;
import com.ss.android.ugc.effectmanager.effect.model.AssetType;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.effectmanager.effect.model.net.AssetItemResponse;
import com.ss.android.ugc.templatecore.templatedata.MvThemeData;
import com.zhiliaoapp.musically.R;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import joo.f;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS3S2400000_8;
import kotlin.jvm.internal.AwS587S0100000_8;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.u;
import lth.o;
import pic.q;

/* JADX INFO: loaded from: classes9.dex */
public final class q extends AbstractC20598115it {
    public static boolean LIZJ;

    @Override // com.ss.android.ugc.aweme.services.external.ui.IRecordService
    public final void recordActivityResult(Activity activity, int i, int i2, Intent intent) {
    }

    @Override // com.ss.android.ugc.aweme.services.external.ui.IRecordService
    public final IRecordPageLifecycle startFragment() {
        return new IRecordPageLifecycle() { // from class: X.197T
            public C19C8 LIZ;
            public NavigationScene LIZIZ;
            public Activity LIZJ;
            public Bundle LIZLLL = new Bundle();

            @Override // com.ss.android.ugc.aweme.services.external.ui.IRecordPageLifecycle
            public final void captureFrame(int i, int i2, Function2<? super Boolean, ? super Bitmap, Unit> function2) {
            }

            @Override // com.ss.android.ugc.aweme.services.external.ui.IRecordPageLifecycle
            public final void initLazyComponents() {
            }

            @Override // com.ss.android.ugc.aweme.services.external.ui.IRecordPageLifecycle
            public final void logShootExit(String str) {
            }

            @Override // com.ss.android.ugc.aweme.services.external.ui.IRecordPageLifecycle
            public final void observeFirstFrameRender(Function0<Unit> function0) {
            }

            @Override // com.ss.android.ugc.aweme.services.external.ui.IRecordPageLifecycle
            public final void startRightSwipe(String str, String str2) {
            }

            @Override // com.ss.android.ugc.aweme.services.external.ui.IRecordPageLifecycle
            public final boolean onBackPressed() {
                NavigationScene navigationScene = this.LIZIZ;
                Scene sceneLLLLIIIILLL = navigationScene != null ? navigationScene.LLLLIIIILLL() : null;
                if ((sceneLLLLIIIILLL instanceof AbstractC214814194y) && ((AbstractC214814194y) sceneLLLLIIIILLL).onKeyDown(4, new KeyEvent(0, 4))) {
                    return true;
                }
                NavigationScene navigationScene2 = this.LIZIZ;
                return navigationScene2 != null && navigationScene2.LLLLLJIL(null);
            }

            @Override // com.ss.android.ugc.aweme.services.external.ui.IRecordPageLifecycle
            public final void onDestroy() {
                C19C8 c19c8 = this.LIZ;
                if (c19c8 != null) {
                    c19c8.LJII();
                }
            }

            @Override // com.ss.android.ugc.aweme.services.external.ui.IRecordPageLifecycle
            public final void onEnterAnimationComplete() {
                AbstractC214814194y abstractC214814194y;
                NavigationScene navigationScene = this.LIZIZ;
                Scene sceneLLLLIIIILLL = navigationScene != null ? navigationScene.LLLLIIIILLL() : null;
                if (!(sceneLLLLIIIILLL instanceof AbstractC214814194y) || (abstractC214814194y = (AbstractC214814194y) sceneLLLLIIIILLL) == null) {
                    return;
                }
                abstractC214814194y.onEnterAnimationComplete();
            }

            @Override // com.ss.android.ugc.aweme.services.external.ui.IRecordPageLifecycle
            public final void onPause() {
                C19C8 c19c8 = this.LIZ;
                if (c19c8 != null) {
                    c19c8.LIZJ();
                }
            }

            @Override // com.ss.android.ugc.aweme.services.external.ui.IRecordPageLifecycle
            public final void onResume() {
                C19C8 c19c8 = this.LIZ;
                if (c19c8 != null) {
                    c19c8.LIZLLL();
                }
            }

            @Override // com.ss.android.ugc.aweme.services.external.ui.IRecordPageLifecycle
            public final void onStart() {
                C19C8 c19c8 = this.LIZ;
                if (c19c8 != null) {
                    c19c8.LJFF();
                }
            }

            @Override // com.ss.android.ugc.aweme.services.external.ui.IRecordPageLifecycle
            public final void onStop() {
                C19C8 c19c8 = this.LIZ;
                if (c19c8 != null) {
                    c19c8.LJI();
                }
            }

            @Override // com.ss.android.ugc.aweme.services.external.ui.IRecordPageLifecycle
            public final void onSaveInstanceState(Bundle bundle) {
                Activity activity = this.LIZJ;
                if (activity != null) {
                    f.LIZ.getClass();
                    f.LJII(activity, bundle);
                }
                C19C8 c19c8 = this.LIZ;
                if (c19c8 != null) {
                    c19c8.LJ(bundle);
                }
            }

            @Override // com.ss.android.ugc.aweme.services.external.ui.IRecordPageLifecycle
            public final void onActivityCreated(C19EG c19eg, Bundle bundle) {
                C19C8 c19c8 = this.LIZ;
                if (c19c8 != null) {
                    c19c8.LIZIZ(c19eg, bundle);
                }
            }

            @Override // com.ss.android.ugc.aweme.services.external.ui.IRecordPageLifecycle
            public final void onActivityResult(int i, int i2, Intent intent) {
                AbstractC214814194y abstractC214814194y;
                NavigationScene navigationScene = this.LIZIZ;
                Scene sceneLLLLIIIILLL = null;
                if (navigationScene != null) {
                    sceneLLLLIIIILLL = navigationScene.LLLLIIIILLL();
                }
                if (!(sceneLLLLIIIILLL instanceof AbstractC214814194y) || (abstractC214814194y = (AbstractC214814194y) sceneLLLLIIIILLL) == null || abstractC214814194y.onInterceptActivityResult(i, i2, intent)) {
                    return;
                }
                abstractC214814194y.onActivityResult(i, i2, intent);
            }

            @Override // com.ss.android.ugc.aweme.services.external.ui.IRecordPageLifecycle
            public final void onCreate(Activity activity, View view, Bundle bundle) {
                this.LIZJ = activity;
                if (bundle != null) {
                    this.LIZLLL = bundle;
                }
                C0CHQ.LIZ().LJJIZ();
                Pair<NavigationScene, C19AK<?>> pairLIZIZ = C214868197a.LIZIZ(activity, VideoRecordContainerScene.class, this.LIZLLL, view.getId(), false, 0.0f);
                this.LIZIZ = pairLIZIZ.getFirst();
                this.LIZ = new C19C8(pairLIZIZ.getSecond());
            }
        };
    }

    public static boolean LJI(Activity activity) {
        return Intrinsics.LJFF(activity.getClass().getName(), ((IDeepLinkService) ServiceManager.get().getService(IDeepLinkService.class)).LJJLIIIIJ("RecordServiceImpl#fromDeepLinkActivity"));
    }

    public static boolean LJII(Activity activity) {
        if (!C0XF1.LIZLLL(activity)) {
            C1389890mGx c1389890mGx = new C1389890mGx(activity);
            c1389890mGx.LJIIIZ(2131845780);
            c1389890mGx.LJFF(R.raw.icon_exclamation_mark_circle_fill);
            c1389890mGx.LJII(R.attr.a1h);
            c1389890mGx.LIZLLL(3000L);
            c1389890mGx.LJIIJJI();
            return true;
        }
        if (((ICommerceMediaService) ServiceManager.get().getService(ICommerceMediaService.class)).LIZLLL() && !((IMusicPublishBridgeService) ServiceManager.get().getService(IMusicPublishBridgeService.class)).enableBAUserMusicExperienceOpt()) {
            C1389890mGx c1389890mGx2 = new C1389890mGx(activity);
            c1389890mGx2.LJIIIZ(2131845781);
            c1389890mGx2.LIZLLL(3000L);
            c1389890mGx2.LJIIJJI();
            return true;
        }
        return false;
    }

    public static final void LJIIIIZZ(Activity activity) {
        C1389890mGx c1389890mGx = new C1389890mGx(activity);
        c1389890mGx.LJIIIZ(2131845780);
        c1389890mGx.LJFF(R.raw.icon_exclamation_mark_circle_fill);
        c1389890mGx.LJII(R.attr.a1h);
        c1389890mGx.LIZLLL(3000L);
        c1389890mGx.LJIIJJI();
    }

    @Override // com.ss.android.ugc.aweme.services.external.ui.IRecordService
    public final void openBulletinAlbum(Activity activity) throws Throwable {
        ShortVideoContext shortVideoContext = new ShortVideoContext(new CameraComponentModel(0));
        shortVideoContext.shootWay = "chat_shoot";
        shortVideoContext.enterFrom = "chat";
        Bundle bundle = new Bundle();
        bundle.putBoolean("Key_enable_multi_video", false);
        C786410Ut5.LJJIJL(bundle, "key_short_video_context", shortVideoContext);
        bundle.putBoolean("key_support_edit_after_choose", true);
        bundle.putInt("key_choose_scene", 50);
        bundle.putInt("key_support_flag", 2);
        bundle.putBoolean("from_upload_btn_click", false);
        bundle.putInt("result_code", -1);
        String str = MvChoosePhotoActivity._pnsPageId;
        C0L0F.LJI(activity, bundle, 1, 12346);
    }

    @Override // com.ss.android.ugc.aweme.services.external.ui.IRecordService
    public final void openBulletinAlbumForSingleMedia(Activity activity) throws Throwable {
        ShortVideoContext shortVideoContext = new ShortVideoContext(new CameraComponentModel(0));
        shortVideoContext.shootWay = "chat_shoot";
        shortVideoContext.enterFrom = "chat";
        DMCameraModel dMCameraModel = shortVideoContext.creativeModel.initialModel.dmCameraModel;
        dMCameraModel.enterFromDM = true;
        dMCameraModel.isBulletin = true;
        Bundle bundle = new Bundle();
        bundle.putInt("key_photo_select_min_count", 1);
        bundle.putInt("key_photo_select_max_count", 1);
        bundle.putInt("key_video_select_min_count", 1);
        bundle.putInt("key_video_select_max_count", 1);
        bundle.putBoolean("Key_enable_multi_video", false);
        C786410Ut5.LJJIJL(bundle, "key_short_video_context", shortVideoContext);
        bundle.putBoolean("key_support_edit_after_choose", true);
        bundle.putInt("key_choose_scene", 50);
        bundle.putInt("key_support_flag", 6);
        bundle.putBoolean("Key_enable_single_select_mode", true);
        bundle.putInt("key_max_selectable_video_duration", C538540LAe.LLJJJIL);
        bundle.putBoolean("from_upload_btn_click", false);
        bundle.putInt("result_code", -1);
        String str = MvChoosePhotoActivity._pnsPageId;
        C0L0F.LJI(activity, bundle, 1, 12346);
    }

    @Override // com.ss.android.ugc.aweme.services.external.ui.IRecordService
    public final void openDMAlbum(Activity activity, DMAlbumParams dMAlbumParams) throws Throwable {
        ShortVideoContext shortVideoContext = new ShortVideoContext(new CameraComponentModel(0));
        try {
            DMCameraModel dMCameraModel = shortVideoContext.creativeModel.initialModel.dmCameraModel;
            dMCameraModel.openCameraOrAlbumMobMap = dMAlbumParams.openAlbumMobMap;
            dMCameraModel.openCameraOrAlbumMobMapV2 = dMAlbumParams.openAlbumMobMapV2;
            C189200o6.m2constructorimpl(Unit.LIZ);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
        shortVideoContext.shootWay = "chat";
        shortVideoContext.enterFrom = "chat";
        Bundle bundle = new Bundle();
        bundle.putInt("key_photo_select_min_count", 1);
        bundle.putInt("key_photo_select_max_count", dMAlbumParams.maxSelectCount);
        bundle.putInt("key_video_select_min_count", 1);
        bundle.putInt("key_video_select_max_count", dMAlbumParams.maxSelectCount);
        bundle.putBoolean("Key_enable_multi_video", true);
        C786410Ut5.LJJIJL(bundle, "key_short_video_context", shortVideoContext);
        bundle.putBoolean("key_support_edit_after_choose", false);
        C786410Ut5.LJJJI("key_mv_hint_text", activity.getString(dMAlbumParams.hintTextRes), bundle);
        bundle.putInt("key_choose_scene", 21);
        bundle.putInt("key_support_flag", 6);
        bundle.putInt("result_code", -1);
        bundle.putInt("key_max_selectable_video_duration", dMAlbumParams.maxSelectableVideoDuration);
        bundle.putInt("key_choose_media_notice_text", dMAlbumParams.chooseMediaTnSNoticeRes);
        bundle.putBoolean("key_choose_media_display_tns_notice", dMAlbumParams.shouldDisplayTnsNotice);
        C786410Ut5.LJJJI("key_choose_media_dm_session_id", dMAlbumParams.sessionId, bundle);
        bundle.putInt("key_dm_chat_type", dMAlbumParams.chatType);
        C786410Ut5.LJJJI("key_dm_to_user_id", dMAlbumParams.toUserId, bundle);
        C786410Ut5.LJJJI("key_dm_conversation_id", dMAlbumParams.conversationId, bundle);
        C786410Ut5.LJJIJL(bundle, "key_dm_quote_mode", dMAlbumParams.quoteMode);
        C786410Ut5.LJJIJL(bundle, "key_dm_base_header_component", dMAlbumParams.baseHeaderComponent);
        C786410Ut5.LJJIJL(bundle, "key_dm_feature_attachment_data", dMAlbumParams.featureAttachmentData);
        if (C522680Keg.LIZIZ) {
            bundle.putBoolean("key_hide_header_close_button", true);
            bundle.putBoolean("key_display_title_knob", true);
            bundle.putBoolean("key_set_change_album_knob_position_config", true);
            bundle.putInt("key_set_peek_height", 75);
            bundle.putInt("key_set_title_layout_height", 62);
            bundle.putBoolean("key_set_dim_overlay_config", true);
            bundle.putBoolean("key_set_big_send_button_hide_mixed_view", true);
        }
        if (C522680Keg.LIZJ) {
            bundle.putBoolean("key_hide_header_close_button", true);
            bundle.putBoolean("key_display_title_knob", true);
            bundle.putBoolean("key_set_change_album_knob_position_config", true);
            bundle.putInt("key_set_peek_height", 75);
            bundle.putInt("key_set_title_layout_height", 70);
            bundle.putBoolean("key_set_dim_overlay_config", true);
            bundle.putBoolean("key_set_flattened_tag_album_menu_config", true);
            bundle.putBoolean("key_hide_media_type_navigator", true);
            bundle.putBoolean("key_set_big_send_button_hide_mixed_view", true);
        }
        bundle.putBoolean("key_set_show_expand_icon_skip_preview", true);
        bundle.putInt("key_set_column_count", 3);
        String str = MvChoosePhotoActivity._pnsPageId;
        C0L0F.LJI(activity, bundle, -1, 1);
    }

    @Override // com.ss.android.ugc.aweme.services.external.ui.IRecordService
    public final void starNLETemplateDebugAlbum(final Context context, final String str) {
        CreativeToolsPluginService creativeToolsPluginService = (CreativeToolsPluginService) PluggableExtentionKt.pluggableSpi$default(CreativeToolsPluginService.class, false, false, false, 14, null);
        if (creativeToolsPluginService != null && creativeToolsPluginService.LIZJ(context, "ugc_template", true)) {
            C19565911gn.LIZ();
            C122T.LIZ();
            C1419810n3D.LIZ.getClass();
            C0LE8.LIZIZ(C1419810n3D.LIZ());
            ((ITemplateResourceService) ServiceManager.get().getService(ITemplateResourceService.class)).LJIIIZ(context, str, new C1428840nHm("", (Boolean) null, false, (NetworkFileFetcher) null, (NLEModelDownloader) null, EnumC539100LCi.AUTOCUT, (ICutReporter) null, false, false, new NLEPrepareListener() { // from class: X.0Mec
                @Override // com.bytedance.ies.cutsame.cut_android.NLEPrepareListener
                public final void onError(int i, String str2) {
                }

                @Override // com.bytedance.ies.cutsame.cut_android.NLEPrepareListener
                public final void onPreSuccess(NLETemplateModel nLETemplateModel) {
                }

                @Override // com.bytedance.ies.cutsame.cut_android.NLEPrepareListener
                public final void onProgress(float f, String str2) {
                }

                @Override // com.bytedance.ies.cutsame.cut_android.NLEPrepareListener
                public final void onSuccess(NLETemplateModel nLETemplateModel) {
                    UgcTemplateAlbumConfig ugcTemplateAlbumConfig = new UgcTemplateAlbumConfig();
                    ugcTemplateAlbumConfig.setTemplateId("67999");
                    ugcTemplateAlbumConfig.setTemplateUrl(str);
                    ugcTemplateAlbumConfig.setTemplateMD5("gkgkgjh989y9y");
                    ugcTemplateAlbumConfig.setCreativeInfo(new CreativeInfo());
                    ugcTemplateAlbumConfig.setSlotIndex(0);
                    if (nLETemplateModel != null) {
                        ArrayList<Float> arrayList = new ArrayList<>();
                        Iterator<MediaItem> it2 = C0FQ1.LIZ(nLETemplateModel).iterator();
                        while (it2.hasNext()) {
                            arrayList.add(Float.valueOf((it2.next().duration * 1.0f) / 1000.0f));
                        }
                        ugcTemplateAlbumConfig.setClipDurations(arrayList);
                    }
                    Context context2 = context;
                    C524780Ki4.LIZ.start(UGCOpenAlbumPanelPerformanceMonitor.INSTANCE, "onClick");
                    ShortVideoContext shortVideoContext = new ShortVideoContext(new CameraComponentModel(2));
                    shortVideoContext.cameraComponentModel.mWorkspace = C14D2.LIZ(ugcTemplateAlbumConfig.getCreativeInfo());
                    shortVideoContext.creativeInfo = ugcTemplateAlbumConfig.getCreativeInfo();
                    shortVideoContext.LJ().setCreationId(ugcTemplateAlbumConfig.getCreativeInfo().getCreationId());
                    shortVideoContext.shootWay = ugcTemplateAlbumConfig.getShootWay();
                    shortVideoContext.enterFrom = ugcTemplateAlbumConfig.getEnterFrom();
                    shortVideoContext.enterMethod = ugcTemplateAlbumConfig.getEnterMethod();
                    shortVideoContext.creativeModel.socialModel.relationEnterMethod = ugcTemplateAlbumConfig.getRelationEnterMethod();
                    Bundle bundle = new Bundle();
                    bundle.putInt("key_template_slot_index", ugcTemplateAlbumConfig.getSlotIndex());
                    C786410Ut5.LJJJI("key_ugc_template_music_path", ugcTemplateAlbumConfig.getMusicPath(), bundle);
                    C786410Ut5.LJJIZ(bundle, "key_ugc_template_anchor", ugcTemplateAlbumConfig.getAnchor());
                    C786410Ut5.LJJJI("key_ugc_template_id", ugcTemplateAlbumConfig.getTemplateId(), bundle);
                    C786410Ut5.LJJJI("key_ugc_template_url", ugcTemplateAlbumConfig.getTemplateUrl(), bundle);
                    C786410Ut5.LJJJI("key_ugc_template_md5", ugcTemplateAlbumConfig.getTemplateMD5(), bundle);
                    C537520L6g.LJFF(bundle, ugcTemplateAlbumConfig.getCreativeInfo());
                    C786410Ut5.LJJIJL(bundle, "key_short_video_context", shortVideoContext);
                    bundle.putInt("key_choose_scene", 24);
                    ArrayList arrayList2 = new ArrayList();
                    Iterator<Float> it3 = ugcTemplateAlbumConfig.getClipDurations().iterator();
                    while (it3.hasNext()) {
                        arrayList2.add(Integer.valueOf((int) (it3.next().floatValue() * 1000.0f)));
                    }
                    C786410Ut5.LJJIJIL(bundle, "clip_arg_data_process_items", arrayList2);
                    C786410Ut5.LJJIL(bundle, "clip_arg_data_process_origin_items", ugcTemplateAlbumConfig.getSlotList());
                    C786410Ut5.LJJIJL(bundle, "clip_arg_data_process_music_item", ugcTemplateAlbumConfig.getMusicSlot());
                    shortVideoContext.cameraComponentModel.mMusicStart = ugcTemplateAlbumConfig.getMusicStart();
                    shortVideoContext.cameraComponentModel.musicEndTime = ugcTemplateAlbumConfig.getMusicEnd();
                    MusicModel musicModel = ugcTemplateAlbumConfig.getMusicModel();
                    if (musicModel != null) {
                        musicModel.setMusicBeginTime(ugcTemplateAlbumConfig.getMusicStart());
                        musicModel.setMusicEndTime(ugcTemplateAlbumConfig.getMusicEnd());
                    }
                    AVMusic aVMusicTransformMusicModel = o.LJI.transformMusicModel(musicModel);
                    if (aVMusicTransformMusicModel != null) {
                        C786410Ut5.LJJIZ(bundle, "aweme_music", aVMusicTransformMusicModel);
                        C786410Ut5.LJJIZ(bundle, "music_model", musicModel);
                    }
                    String str2 = MvChoosePhotoActivity._pnsPageId;
                    C0L0F.LJ(context2, 1, bundle);
                }
            }), null, null);
        }
    }

    @Override // com.ss.android.ugc.aweme.services.external.ui.IRecordService
    public final void startAlbumForExtractMusic(Activity activity, Bundle bundle) throws Throwable {
        bundle.putInt("key_choose_scene", 19);
        bundle.putInt("key_video_select_min_count", 1);
        bundle.putInt("key_video_select_max_count", 1);
        bundle.putInt("key_support_flag", 4);
        bundle.putBoolean("Key_enable_multi_video", true);
        bundle.putLong("invoke_uploadpage_time", System.currentTimeMillis());
        String str = MvChoosePhotoActivity._pnsPageId;
        C0L0F.LJI(activity, bundle, 0, 0);
    }

    @Override // com.ss.android.ugc.aweme.services.external.ui.IRecordService
    public final void startAutoCutAnchorAlbum(Activity activity, AutoCutAnchorConfig autoCutAnchorConfig) {
        int iMin;
        CreativeFlowData creativeFlowData;
        CreativeToolsPluginService creativeToolsPluginService = (CreativeToolsPluginService) PluggableExtentionKt.pluggableSpi$default(CreativeToolsPluginService.class, false, false, false, 14, null);
        if (creativeToolsPluginService != null && creativeToolsPluginService.LIZJ(activity, autoCutAnchorConfig.shootWay, true)) {
            C1417710mzp.LIZ(LogLevel.LEVEL_INFO, "AVToolsHelper#startAutoCutAnchorAlbum");
            C524780Ki4.LIZ.start(AutoCutAnchorOpenAlbumPerformanceMonitor.INSTANCE, "onClick");
            ShortVideoContext shortVideoContext = new ShortVideoContext(new CameraComponentModel(0));
            shortVideoContext.cameraComponentModel.mWorkspace = C14D2.LIZ(autoCutAnchorConfig.creativeInfo);
            shortVideoContext.creativeInfo = autoCutAnchorConfig.creativeInfo;
            shortVideoContext.LJ().setCreationId(autoCutAnchorConfig.creativeInfo.getCreationId());
            shortVideoContext.shootWay = autoCutAnchorConfig.shootWay;
            shortVideoContext.enterFrom = autoCutAnchorConfig.enterFrom;
            shortVideoContext.enterMethod = autoCutAnchorConfig.enterMethod;
            shortVideoContext.creativeModel.socialModel.relationEnterMethod = autoCutAnchorConfig.relationEnterMethod;
            ShootExtraData shootExtraData = autoCutAnchorConfig.shootExtraData;
            if (shootExtraData != null && (creativeFlowData = shortVideoContext.creativeFlowData) != null) {
                creativeFlowData.setShootExtraData(shootExtraData);
            }
            if (C298980Bnk.LIZ() && (!C298890Bnb.LIZ() || C0LEI.LIZJ(autoCutAnchorConfig.anchor))) {
                TemplateAnchorData templateAnchorData = shortVideoContext.creativeModel.templateAnchorData;
                templateAnchorData.isFollowPublishFromAnchor = true;
                templateAnchorData.followedTemplateDispatchType = C1416310mxZ.LJJLIIIJJI(autoCutAnchorConfig.anchor);
                templateAnchorData.ttTemplateType = C1412660mrg.LIZIZ(C1412660mrg.LJ(C1412660mrg.LIZ(autoCutAnchorConfig.anchor)));
            }
            Bundle bundle = new Bundle();
            C537520L6g.LJFF(bundle, autoCutAnchorConfig.creativeInfo);
            C786410Ut5.LJJIJL(bundle, "key_short_video_context", shortVideoContext);
            bundle.putLong("invoke_uploadpage_time", System.currentTimeMillis());
            bundle.putInt("key_choose_scene", 29);
            ArrayList arrayList = new ArrayList();
            Iterator<Float> it2 = autoCutAnchorConfig.durationList.iterator();
            while (it2.hasNext()) {
                arrayList.add(Integer.valueOf((int) (it2.next().floatValue() * 1000.0f)));
            }
            C786410Ut5.LJJIJIL(bundle, "clip_arg_data_process_items", arrayList);
            C786410Ut5.LJJIL(bundle, "clip_arg_data_process_origin_items", autoCutAnchorConfig.slotList);
            C786410Ut5.LJJJI("key_autocut_music_id", autoCutAnchorConfig.musicId, bundle);
            if (C0LE5.LIZ()) {
                iMin = Math.min(autoCutAnchorConfig.maxClips, C0LE5.LIZIZ());
            } else {
                iMin = autoCutAnchorConfig.minClips;
            }
            bundle.putInt("key_min_clip_num", iMin);
            bundle.putInt("key_max_clip_num", autoCutAnchorConfig.maxClips);
            C786410Ut5.LJJJI("key_autocut_template_group_id", autoCutAnchorConfig.templateGroupId, bundle);
            C786410Ut5.LJJJI("key_followed_main_anchor_type", autoCutAnchorConfig.mainAnchorType, bundle);
            C786410Ut5.LJJJI("tt_template_type", autoCutAnchorConfig.ttTemplateType, bundle);
            C786410Ut5.LJJIZ(bundle, "key_autocut_template_anchor", autoCutAnchorConfig.anchor);
            C786410Ut5.LJJIJL(bundle, "key_anchor_aweme_music_info", autoCutAnchorConfig.awemeMusicInfo);
            C786410Ut5.LJJIJL(bundle, "key_anchor_template_music_info", autoCutAnchorConfig.templateMusicInfo);
            Integer num = autoCutAnchorConfig.templateType;
            if (num != null) {
                bundle.putInt("template_type", num.intValue());
            }
            String str = MvChoosePhotoActivity._pnsPageId;
            C0L0F.LIZLLL(activity, bundle, 1);
        }
    }

    @Override // com.ss.android.ugc.aweme.services.external.ui.IRecordService
    public final void startImageEffectTemplateAlbum(Context context, RecordConfig recordConfig) {
        CreativeToolsPluginService creativeToolsPluginService = (CreativeToolsPluginService) PluggableExtentionKt.pluggableSpi$default(CreativeToolsPluginService.class, false, false, false, 14, null);
        String str = "";
        if (creativeToolsPluginService != null) {
            String shootway = recordConfig.getShootway();
            if (shootway == null) {
                shootway = "";
            }
            if (creativeToolsPluginService.LIZJ(context, shootway, true)) {
                Intent intentLIZ = AbstractC20598115it.LIZ(recordConfig);
                C524780Ki4.LIZ.start(SoundSyncOpenAlbumPanelPerformanceMonitor.INSTANCE, "onClick");
                Bundle bundle = new Bundle();
                Music music = (Music) intentLIZ.getSerializableExtra("sticker_music");
                String strLIZJ = C1688680u2s.LIZJ(intentLIZ, "sticker_with_music_file_path");
                if (music != null) {
                    AVMusic aVMusicTransformMusicModel = o.LJI.transformMusicModel(music.convertToMusicModel());
                    C1452640nuA.LJI(aVMusicTransformMusicModel);
                    C786410Ut5.LJJIZ(bundle, "aweme_music", aVMusicTransformMusicModel);
                    C786410Ut5.LJJIZ(bundle, "music_model", music.convertToMusicModel());
                }
                C786410Ut5.LJJJI("path", strLIZJ, bundle);
                bundle.putInt("key_photo_select_min_count", 1);
                bundle.putInt("key_photo_select_max_count", 1);
                C786410Ut5.LJJJI("key_mv_hint_text", context.getResources().getQuantityString(2131755477, 1, 1), bundle);
                bundle.putInt("key_support_flag", 1);
                bundle.putInt("key_choose_scene", 41);
                intentLIZ.putExtras(bundle);
                intentLIZ.putExtra("key_choose_request_code", 1);
                ShortVideoContext shortVideoContextLIZJ = C1443540nfU.LIZJ(C1688680u2s.LIZIZ(intentLIZ), context, null);
                C537520L6g.LIZLLL(intentLIZ, shortVideoContextLIZJ.creativeInfo);
                Effect firstSticker = recordConfig.getFirstSticker();
                C1446130njf.LIZ.getClass();
                String strLJFF = C1446130njf.LJFF(firstSticker, "tt_template_id");
                if (strLJFF != null) {
                    str = strLJFF;
                }
                ImageEffectTemplateReuseData imageEffectTemplateReuseData = shortVideoContextLIZJ.creativeModel.imageEffectTemplateData;
                imageEffectTemplateReuseData.isTemplateFromAnchor = true;
                imageEffectTemplateReuseData.templateId = str;
                intentLIZ.putExtra("key_short_video_context", shortVideoContextLIZJ);
                intentLIZ.setClass(context, MvChoosePhotoActivity.class);
                C1688680u2s.LIZ(context, intentLIZ);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.services.external.ui.IRecordService
    public final void startPhotoModeTemplateAlbum(Activity activity, PhotoModeTemplateAnchorConfig photoModeTemplateAnchorConfig) {
        CreativeToolsPluginService creativeToolsPluginService = (CreativeToolsPluginService) PluggableExtentionKt.pluggableSpi$default(CreativeToolsPluginService.class, false, false, false, 14, null);
        if (creativeToolsPluginService != null && creativeToolsPluginService.LIZJ(activity, photoModeTemplateAnchorConfig.getShootWay(), true)) {
            C524780Ki4.LIZ.start(PhotoModeTemplateOpenAlbumPanelPerformanceMonitor.INSTANCE, "onClick");
            ShortVideoContext shortVideoContext = new ShortVideoContext(new CameraComponentModel(0));
            shortVideoContext.cameraComponentModel.mWorkspace = C14D2.LIZ(photoModeTemplateAnchorConfig.getCreativeInfo());
            shortVideoContext.creativeInfo = photoModeTemplateAnchorConfig.getCreativeInfo();
            shortVideoContext.LJ().setCreationId(photoModeTemplateAnchorConfig.getCreativeInfo().getCreationId());
            shortVideoContext.shootWay = photoModeTemplateAnchorConfig.getShootWay();
            shortVideoContext.enterFrom = photoModeTemplateAnchorConfig.getEnterFrom();
            shortVideoContext.creativeModel.followUpPublishTrackerModel.followedMainAnchorType = photoModeTemplateAnchorConfig.getMainAnchorType();
            shortVideoContext.creativeModel.followUpPublishTrackerModel.followedTemplateType = photoModeTemplateAnchorConfig.getTtTemplateType();
            shortVideoContext.creativeModel.socialModel.relationEnterMethod = photoModeTemplateAnchorConfig.getRelationEnterMethod();
            Bundle bundle = new Bundle();
            C537520L6g.LJFF(bundle, photoModeTemplateAnchorConfig.getCreativeInfo());
            C786410Ut5.LJJIZ(bundle, "key_ugc_template_anchor", photoModeTemplateAnchorConfig.getAnchor());
            C786410Ut5.LJJJI("key_ugc_template_id", photoModeTemplateAnchorConfig.getTemplateId(), bundle);
            C786410Ut5.LJJIL(bundle, "clip_arg_data_process_origin_items", photoModeTemplateAnchorConfig.getSlotList());
            MusicModel musicModel = photoModeTemplateAnchorConfig.getMusicModel();
            AVMusic aVMusicTransformMusicModel = o.LJI.transformMusicModel(musicModel);
            if (aVMusicTransformMusicModel != null) {
                C786410Ut5.LJJIZ(bundle, "aweme_music", aVMusicTransformMusicModel);
                C786410Ut5.LJJIZ(bundle, "music_model", musicModel);
            }
            C786410Ut5.LJJIJL(bundle, "key_short_video_context", shortVideoContext);
            bundle.putInt("key_photo_select_min_count", photoModeTemplateAnchorConfig.getMinClips());
            bundle.putInt("key_photo_select_max_count", photoModeTemplateAnchorConfig.getMaxClips());
            bundle.putInt("key_choose_scene", 42);
            bundle.putInt("key_support_flag", 2);
            int maxClips = photoModeTemplateAnchorConfig.getMaxClips();
            C786410Ut5.LJJJI("key_mv_hint_text", activity.getResources().getQuantityString(2131755477, maxClips, Integer.valueOf(maxClips)), bundle);
            String str = MvChoosePhotoActivity._pnsPageId;
            C0L0F.LIZLLL(activity, bundle, 1);
        }
    }

    @Override // com.ss.android.ugc.aweme.services.external.ui.IRecordService
    public final void startPugcAlbum(Activity activity, C573660Mei c573660Mei) {
        CreativeToolsPluginService creativeToolsPluginService = (CreativeToolsPluginService) PluggableExtentionKt.pluggableSpi$default(CreativeToolsPluginService.class, false, false, false, 14, null);
        if (creativeToolsPluginService != null) {
            String str = c573660Mei.LIZ;
            if (str == null) {
                str = "";
            }
            if (creativeToolsPluginService.LIZJ(activity, str, true)) {
                ShortVideoContext shortVideoContext = new ShortVideoContext(new CameraComponentModel(0));
                CreativeInfo creativeInfo = new CreativeInfo();
                shortVideoContext.cameraComponentModel.mWorkspace = C14D2.LIZ(creativeInfo);
                shortVideoContext.creativeInfo = creativeInfo;
                shortVideoContext.LJ().setCreationId(creativeInfo.getCreationId());
                shortVideoContext.shootWay = c573660Mei.LIZ;
                shortVideoContext.enterFrom = c573660Mei.LIZIZ;
                shortVideoContext.enterMethod = c573660Mei.LIZJ;
                CreativeModel creativeModel = shortVideoContext.creativeModel;
                creativeModel.productPath = c573660Mei.LIZLLL;
                creativeModel.successFlag = c573660Mei.LJ;
                creativeModel.failFlag = c573660Mei.LJFF;
                C1449400now c1449400now = C1449400now.LIZ;
                String creationId = shortVideoContext.getCreationId();
                String str2 = c573660Mei.LIZ;
                if (str2 == null) {
                    str2 = "";
                }
                String str3 = c573660Mei.LIZIZ;
                if (str3 == null) {
                    str3 = "";
                }
                c1449400now.LIZIZ(new C1449410nox(creationId, str2, str3, C1443560nfW.LJIIIIZZ(), C1443560nfW.LJIIIIZZ(), null), new C0LAB(), null);
                C0L0E.LIZ.getClass();
                C0L0E.LIZ(activity, shortVideoContext, null);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.services.external.ui.IRecordService
    public final void startReusePugcTemplateAlbum(final Activity activity, final C573840Mf0 c573840Mf0) {
        Activity activityLIZIZ;
        Activity activityLIZ;
        Activity activityLIZIZ2;
        Activity activityLIZ2;
        CreativeToolsPluginService creativeToolsPluginService = (CreativeToolsPluginService) PluggableExtentionKt.pluggableSpi$default(CreativeToolsPluginService.class, false, false, false, 14, null);
        if (creativeToolsPluginService != null) {
            String str = c573840Mf0.LIZIZ;
            if (str == null) {
                str = "";
            }
            if (creativeToolsPluginService.LIZJ(activity, str, true)) {
                final long jCurrentTimeMillis = System.currentTimeMillis();
                if (LJI(activity)) {
                    if (((IMainService) ServiceManager.get().getService(IMainService.class)).isAppHot()) {
                        AbstractC1387200mCc abstractC1387200mCcLIZLLL = C1906580ziK.LIZLLL();
                        if (abstractC1387200mCcLIZLLL != null && (activityLIZIZ2 = abstractC1387200mCcLIZLLL.LIZIZ()) != null && (activityLIZ2 = C1388190mED.LIZ(activityLIZIZ2)) != null && LJII(activityLIZ2)) {
                            return;
                        }
                    } else {
                        for (AbstractC1387200mCc abstractC1387200mCc : C1906580ziK.LJII()) {
                            if ((abstractC1387200mCc.LIZ instanceof InterfaceC1711206n0) && (activityLIZIZ = abstractC1387200mCc.LIZIZ()) != null && (activityLIZ = C1388190mED.LIZ(activityLIZIZ)) != null && LJII(activityLIZ)) {
                                return;
                            }
                        }
                    }
                } else if (LJII(activity)) {
                    return;
                }
                final C013C c013c = new C013C();
                final C259800zU c259800zU = new C259800zU();
                if (c573840Mf0.LIZ.length() == 0) {
                    return;
                }
                ITemplateConsumeService iTemplateConsumeService = (ITemplateConsumeService) PluggableExtentionKt.pluggableSpi$default(ITemplateConsumeService.class, false, false, false, 14, null);
                if (iTemplateConsumeService != null && iTemplateConsumeService.LJFF(2, null, null, null)) {
                    ShortVideoContext shortVideoContextLIZLLL = C1688680u2s.LIZLLL(c573840Mf0, null);
                    iTemplateConsumeService.LJ(activity, null, shortVideoContextLIZLLL, C1412390mrF.LJIILLIIL, c573840Mf0.LIZ);
                    C1688680u2s.LJIILIIL(shortVideoContextLIZLLL, c573840Mf0);
                } else {
                    LJIIIZ(activity, c259800zU, c013c, true);
                    ((ITemplateResourceService) ServiceManager.get().getService(ITemplateResourceService.class)).LIZIZ(EffectService.Companion.getInstance().createMvEffectPlatform(activity), c573840Mf0.LIZ, AssetType.PUGC_TEMPLATE, Intrinsics.LJFF(c573840Mf0.LIZJ, "template_schema"), false, new IFetchAssetItemInfo() { // from class: X.0Mee
                        @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchAssetItemInfo
                        public final void onFailed(ExceptionResult exceptionResult) {
                            if (c013c.element) {
                                return;
                            }
                            if (Intrinsics.LJFF(c573840Mf0.LIZJ, "template_schema")) {
                                C1419580n2q c1419580n2q = C1419580n2q.LIZ;
                                C573840Mf0 c573840Mf02 = c573840Mf0;
                                C1419580n2q.LJIILLIIL(c1419580n2q, c573840Mf02.LIZIZ, jCurrentTimeMillis, null, c573840Mf02.LIZ, exceptionResult, 4);
                            }
                            C1481605r4.LIZIZ(new ARunnableS41S0300000_8(activity, c259800zU, c013c, 11));
                        }

                        @Override // com.ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
                        public final void onSuccess(AssetItemResponse assetItemResponse) {
                            final AssetItemResponse assetItemResponse2 = assetItemResponse;
                            if (!c013c.element) {
                                if (Intrinsics.LJFF(c573840Mf0.LIZJ, "template_schema")) {
                                    C1419580n2q c1419580n2q = C1419580n2q.LIZ;
                                    C573840Mf0 c573840Mf02 = c573840Mf0;
                                    C1419580n2q.LJIILLIIL(c1419580n2q, c573840Mf02.LIZIZ, jCurrentTimeMillis, assetItemResponse2, c573840Mf02.LIZ, null, 16);
                                }
                                final Activity activity2 = activity;
                                final C573840Mf0 c573840Mf03 = c573840Mf0;
                                final C259800zU<DialogC1389620mGW> c259800zU2 = c259800zU;
                                final C013C c013c2 = c013c;
                                C1481605r4.LIZIZ(new Runnable() { // from class: X.0Med
                                    /* JADX WARN: Multi-variable type inference failed */
                                    /* JADX WARN: Type inference failed for: r7v0, types: [X.13BV] */
                                    /* JADX WARN: Type inference failed for: r7v1, types: [java.util.List] */
                                    /* JADX WARN: Type inference failed for: r7v2, types: [java.util.ArrayList] */
                                    public final void LIZ() {
                                        AssetItemModel data;
                                        List<Asset> list;
                                        Asset asset;
                                        ?? arrayList;
                                        q.LJIIIZ(activity2, c259800zU2, c013c2, false);
                                        AssetItemResponse assetItemResponse3 = assetItemResponse2;
                                        if (assetItemResponse3 == null || (data = assetItemResponse3.getData()) == null || (list = data.asset_list) == null || (asset = (Asset) C13LP.LJJJLL(list)) == null) {
                                            q.LJIIIIZZ(activity2);
                                            return;
                                        }
                                        s.LIZ.getClass();
                                        CutsameDataItem cutsameDataItemLJJLIIIJLJLI = s.LJJLIIIJLJLI(asset);
                                        if (cutsameDataItemLJJLIIIJLJLI == null) {
                                            q.LJIIIIZZ(activity2);
                                            return;
                                        }
                                        List<String> hashtag = asset.getBusiness_extra().getHashtag();
                                        if (hashtag == null || hashtag.isEmpty()) {
                                            arrayList = C13BV.INSTANCE;
                                        } else {
                                            ArrayList arrayList2 = new ArrayList();
                                            List<String> hashtag2 = asset.getBusiness_extra().getHashtag();
                                            if (hashtag2 == null) {
                                                hashtag2 = C13BV.INSTANCE;
                                            }
                                            arrayList2.addAll(hashtag2);
                                            arrayList = new ArrayList();
                                            for (Object obj : arrayList2) {
                                                C1953307kx.LIZ.getClass();
                                                if (C1953307kx.LIZLLL((String) obj)) {
                                                    arrayList.add(obj);
                                                }
                                            }
                                        }
                                        Activity activity3 = activity2;
                                        C573840Mf0 c573840Mf04 = c573840Mf03;
                                        ShortVideoContext shortVideoContextLIZLLL2 = C1688680u2s.LIZLLL(c573840Mf04, arrayList);
                                        C537520L6g.LJFF(new Bundle(), shortVideoContextLIZLLL2.creativeInfo);
                                        if (Objects.equals(c573840Mf04.LIZJ, "template_schema")) {
                                            C0L0E.LIZIZ(activity3, shortVideoContextLIZLLL2, cutsameDataItemLJJLIIIJLJLI, true, EnumC538340L9k.H5);
                                        } else {
                                            C0L0E.LIZIZ(activity3, shortVideoContextLIZLLL2, cutsameDataItemLJJLIIIJLJLI, true, EnumC538340L9k.OTHER);
                                        }
                                        C1688680u2s.LJIILIIL(shortVideoContextLIZLLL2, c573840Mf04);
                                    }

                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        boolean zLIZ;
                                        C1C7U.LIZ("RecordServiceImpl@35b4.startReusePugcTemplateAlbum$3$onSuccess$1");
                                        try {
                                            LIZ();
                                        } finally {
                                            if (!zLIZ) {
                                            }
                                        }
                                        C1C7U.LIZIZ("RecordServiceImpl@35b4.startReusePugcTemplateAlbum$3$onSuccess$1");
                                    }
                                });
                            }
                        }
                    });
                }
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.services.external.ui.IRecordService
    public final void startSoundSyncAlbum(Activity activity, SoundSyncAnchorConfig soundSyncAnchorConfig) {
        CreativeToolsPluginService creativeToolsPluginService = (CreativeToolsPluginService) PluggableExtentionKt.pluggableSpi$default(CreativeToolsPluginService.class, false, false, false, 14, null);
        if (creativeToolsPluginService != null && creativeToolsPluginService.LIZJ(activity, soundSyncAnchorConfig.getShootWay(), true)) {
            C524780Ki4.LIZ.start(SoundSyncOpenAlbumPanelPerformanceMonitor.INSTANCE, "onClick");
            ShortVideoContext shortVideoContext = new ShortVideoContext(new CameraComponentModel(0));
            shortVideoContext.cameraComponentModel.mWorkspace = C14D2.LIZ(soundSyncAnchorConfig.getCreativeInfo());
            shortVideoContext.creativeInfo = soundSyncAnchorConfig.getCreativeInfo();
            shortVideoContext.LJ().setCreationId(soundSyncAnchorConfig.getCreativeInfo().getCreationId());
            shortVideoContext.shootWay = soundSyncAnchorConfig.getShootWay();
            shortVideoContext.enterFrom = soundSyncAnchorConfig.getEnterFrom();
            shortVideoContext.enterMethod = soundSyncAnchorConfig.getEnterMethod();
            Bundle bundle = new Bundle();
            C537520L6g.LJFF(bundle, soundSyncAnchorConfig.getCreativeInfo());
            C786410Ut5.LJJIJL(bundle, "key_short_video_context", shortVideoContext);
            bundle.putInt("key_choose_scene", 18);
            ArrayList arrayList = new ArrayList();
            Iterator<Float> it2 = soundSyncAnchorConfig.getClipDurations().iterator();
            while (it2.hasNext()) {
                arrayList.add(Integer.valueOf((int) (it2.next().floatValue() * 1000.0f)));
            }
            C786410Ut5.LJJIJIL(bundle, "clip_arg_data_process_items", arrayList);
            shortVideoContext.cameraComponentModel.mMusicStart = soundSyncAnchorConfig.getMusicStart();
            shortVideoContext.cameraComponentModel.musicEndTime = soundSyncAnchorConfig.getMusicEnd();
            MusicModel musicModel = soundSyncAnchorConfig.getMusicModel();
            if (musicModel != null) {
                musicModel.setMusicBeginTime(soundSyncAnchorConfig.getMusicStart());
                musicModel.setMusicEndTime(soundSyncAnchorConfig.getMusicEnd());
            }
            AVMusic aVMusicTransformMusicModel = o.LJI.transformMusicModel(musicModel);
            if (aVMusicTransformMusicModel != null) {
                C786410Ut5.LJJIZ(bundle, "aweme_music", aVMusicTransformMusicModel);
                C786410Ut5.LJJIZ(bundle, "music_model", musicModel);
            }
            String str = MvChoosePhotoActivity._pnsPageId;
            C0L0F.LIZLLL(activity, bundle, 1);
        }
    }

    @Override // com.ss.android.ugc.aweme.services.external.ui.IRecordService
    public final void startTemplateAnchorAlbum(Activity activity, TemplateAnchorConfig templateAnchorConfig) {
        ArrayList<TemplateSlot> arrayListLJFF;
        C1412390mrF c1412390mrF;
        List<Integer> listLJ;
        boolean z;
        boolean z2;
        int size;
        TemplateSlot next;
        String extra;
        String extra2;
        int minClips;
        CreativeToolsPluginService creativeToolsPluginService = (CreativeToolsPluginService) PluggableExtentionKt.pluggableSpi$default(CreativeToolsPluginService.class, false, false, false, 14, null);
        if (creativeToolsPluginService != null && creativeToolsPluginService.LIZJ(activity, templateAnchorConfig.getShootWay(), true)) {
            ITemplateConsumeService iTemplateConsumeService = (ITemplateConsumeService) PluggableExtentionKt.pluggableSpi$default(ITemplateConsumeService.class, false, false, false, 14, null);
            if (iTemplateConsumeService != null && iTemplateConsumeService.LJI(activity, templateAnchorConfig)) {
                return;
            }
            int templateType = templateAnchorConfig.getTemplateType();
            EnumC1412640mre enumC1412640mre = EnumC1412640mre.UGC_TEMPLATE;
            if ((templateType == enumC1412640mre.getValue() || templateType == EnumC1412640mre.PUGC_TEMPLATE.getValue() || EnumC1412640mre.SGT.getValue() == templateType) && ((arrayListLJFF = C539530LDz.LJFF(templateAnchorConfig.getAnchor())) == null || arrayListLJFF.size() == 0)) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(" templateid");
                sbLIZ.append(templateAnchorConfig.getTemplateId());
                sbLIZ.append("slot number is 0");
                C201955140j.LJFF("startTemplateAnchor", C2188811AlT.LIZIZ(sbLIZ));
                return;
            }
            int templateType2 = templateAnchorConfig.getTemplateType();
            ShortVideoContext shortVideoContext = new ShortVideoContext(new CameraComponentModel(0));
            CreativeInfo creativeInfo = templateAnchorConfig.getCreativeInfo();
            shortVideoContext.cameraComponentModel.mWorkspace = C14D2.LIZ(creativeInfo);
            shortVideoContext.creativeInfo = creativeInfo;
            shortVideoContext.LJ().setCreationId(creativeInfo.getCreationId());
            shortVideoContext.shootWay = templateAnchorConfig.getShootWay();
            shortVideoContext.enterFrom = templateAnchorConfig.getEnterFrom();
            shortVideoContext.enterMethod = templateAnchorConfig.getEnterMethod();
            shortVideoContext.creativeModel.followUpPublishTrackerModel.followedMainAnchorType = templateAnchorConfig.getMainAnchorType();
            shortVideoContext.creativeModel.followUpPublishTrackerModel.followedTemplateType = templateAnchorConfig.getFollowedTemplateType();
            shortVideoContext.creativeModel.eventData.shootEnterMethod = templateAnchorConfig.getEnterMethod();
            shortVideoContext.creativeModel.socialModel.relationEnterMethod = templateAnchorConfig.getRelationEnterMethod();
            if (templateAnchorConfig.getShootEnterFrom() != null && shortVideoContext.creativeFlowData.getShootExtraData() == null) {
                shortVideoContext.creativeFlowData.setShootExtraData(new ShootExtraData(templateAnchorConfig.getShootEnterFrom()));
            }
            AnchorCommonStruct anchor = templateAnchorConfig.getAnchor();
            String strLJJLIIIJJI = C1416310mxZ.LJJLIIIJJI(anchor);
            if (strLJJLIIIJJI != null) {
                c1412390mrF = new C1412390mrF(strLJJLIIIJJI);
            } else {
                c1412390mrF = null;
            }
            if (C298980Bnk.LIZ() && (!C298890Bnb.LIZ() || (C0LEI.LIZJ(templateAnchorConfig.getAnchor()) && !templateAnchorConfig.getShootWay().equals("mdp_square")))) {
                TemplateAnchorData templateAnchorData = shortVideoContext.creativeModel.templateAnchorData;
                templateAnchorData.isFollowPublishFromAnchor = true;
                templateAnchorData.followedTemplateDispatchType = C1416310mxZ.LJJLIIIJJI(anchor);
                templateAnchorData.ttTemplateType = C1412660mrg.LIZIZ(C1412660mrg.LJ(C1412660mrg.LIZ(anchor)));
            }
            if (anchor != null && anchor.subType().equals("pugc")) {
                if (anchor.getType() == 66 || (C298980Bnk.LIZ() && c1412390mrF != null && (c1412390mrF.LIZ() || c1412390mrF == C1412390mrF.LJFF || c1412390mrF == C1412390mrF.LJIIZILJ))) {
                    shortVideoContext.creativeModel.ugcTemplateData.isPUGCTemplateFromAutoCutAnchor = true;
                }
                if (anchor.getType() == 29 || (C298980Bnk.LIZ() && c1412390mrF != null && c1412390mrF.LIZJ())) {
                    shortVideoContext.creativeModel.ugcTemplateData.isPUGCTemplateFromMVAnchor = true;
                }
                String strLJI = C539530LDz.LJI(anchor);
                if (strLJI != null) {
                    shortVideoContext.creativeModel.ugcTemplateData.templateTags = strLJI;
                }
                shortVideoContext.creativeModel.pugcTemplateData.aiTemplateFuncList = templateAnchorConfig.getAiTemplateFuncList();
            }
            if (templateAnchorConfig.getMdpRecommendTemplateInfo() != null) {
                shortVideoContext.creativeModel.ugcTemplateData.mdpRecommendTemplateInfo = templateAnchorConfig.getMdpRecommendTemplateInfo();
            }
            Bundle bundle = new Bundle();
            C537520L6g.LJFF(bundle, creativeInfo);
            C786410Ut5.LJJIJL(bundle, "key_short_video_context", shortVideoContext);
            bundle.putLong("invoke_uploadpage_time", System.currentTimeMillis());
            bundle.putInt("template_type", templateType2);
            if (templateAnchorConfig.getAnchor() == null || templateAnchorConfig.getAnchor().getType() == 29 || (C298980Bnk.LIZ() && c1412390mrF != null && c1412390mrF.LIZJ())) {
                C786410Ut5.LJJJI("mv_id", templateAnchorConfig.getTemplateId(), bundle);
            }
            if (templateType2 == EnumC1412640mre.AUTOCUT_TEMPLATE.getValue()) {
                ArrayList arrayList = new ArrayList();
                List<Float> durationList = templateAnchorConfig.getDurationList();
                if (durationList != null && !durationList.isEmpty()) {
                    Iterator<Float> it2 = durationList.iterator();
                    while (it2.hasNext()) {
                        arrayList.add(Integer.valueOf((int) (it2.next().floatValue() * 1000.0f)));
                    }
                }
                if (!arrayList.isEmpty()) {
                    C786410Ut5.LJJIJIL(bundle, "clip_arg_data_process_items", arrayList);
                }
                ArrayList<TemplateSlot> slotList = templateAnchorConfig.getSlotList();
                if (slotList != null && !slotList.isEmpty()) {
                    C786410Ut5.LJJIL(bundle, "clip_arg_data_process_origin_items", slotList);
                }
                C786410Ut5.LJJJI("key_autocut_music_id", templateAnchorConfig.getMusicId(), bundle);
                if (C0LE5.LIZ()) {
                    minClips = Math.min(templateAnchorConfig.getMaxClips(), C0LE5.LIZIZ());
                } else {
                    minClips = templateAnchorConfig.getMinClips();
                }
                bundle.putInt("key_min_clip_num", minClips);
                bundle.putInt("key_max_clip_num", templateAnchorConfig.getMaxClips());
                C786410Ut5.LJJJI("key_autocut_template_group_id", templateAnchorConfig.getTemplateGroupId(), bundle);
                C786410Ut5.LJJIZ(bundle, "key_autocut_template_anchor", templateAnchorConfig.getAnchor());
                bundle.putInt("key_choose_scene", 29);
                String str = MvChoosePhotoActivity._pnsPageId;
                C0L0F.LIZLLL(activity, bundle, 1);
                return;
            }
            if (templateType2 != enumC1412640mre.getValue() && templateType2 != EnumC1412640mre.PUGC_TEMPLATE.getValue()) {
                if (templateType2 != EnumC1412640mre.MV_TEMPLATE.getValue() && templateType2 != EnumC1412640mre.CUT_SAME.getValue()) {
                    return;
                }
                IMovieReuseService iMovieReuseServiceLJ = MovieReuseServiceImpl.LJ();
                String templateId = templateAnchorConfig.getTemplateId();
                Integer numValueOf = Integer.valueOf(templateAnchorConfig.getTemplateType());
                String shootWay = templateAnchorConfig.getShootWay();
                String enterFrom = templateAnchorConfig.getEnterFrom();
                int sourceId = templateAnchorConfig.getSourceId();
                String mainAnchorType = templateAnchorConfig.getMainAnchorType();
                templateAnchorConfig.getFollowedTemplateType();
                String enterMethod = templateAnchorConfig.getEnterMethod();
                String relationEnterMethod = templateAnchorConfig.getRelationEnterMethod();
                if (anchor != null) {
                    extra2 = anchor.getExtra();
                } else {
                    extra2 = null;
                }
                iMovieReuseServiceLJ.LIZJ(activity, null, templateId, null, numValueOf, shootWay, enterFrom, sourceId, false, mainAnchorType, enterMethod, relationEnterMethod, null, extra2);
                return;
            }
            ArrayList<TemplateSlot> arrayListLJFF2 = C539530LDz.LJFF(templateAnchorConfig.getAnchor());
            AnchorCommonStruct anchor2 = templateAnchorConfig.getAnchor();
            try {
                new p();
                if (anchor2 == null) {
                    extra = null;
                } else {
                    extra = anchor2.getExtra();
                }
                String strLJIL = p.LIZJ(extra).LJIILIIL().LJJIIZ("nle_summary").LJIL();
                new p();
                k kVarLJJIIZ = p.LIZJ(strLJIL).LJIILIIL().LJJIIZ("feature_codes");
                kVarLJJIIZ.getClass();
                if (kVarLJJIIZ instanceof h) {
                    listLJ = (List) C08JS.LIZIZ().LIZLLL(kVarLJJIIZ, new TypeToken<List<? extends Integer>>() { // from class: X.04YG
                    }.getType());
                } else {
                    listLJ = C08JS.LJ(Integer[].class, kVarLJJIIZ.LJIL());
                }
            } catch (Throwable th) {
                th = th;
                listLJ = null;
            }
            try {
                C189200o6.m2constructorimpl(Unit.LIZ);
            } catch (Throwable th2) {
                th = th2;
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
            }
            if (listLJ == null) {
                listLJ = C13BV.INSTANCE;
            }
            if (arrayListLJFF2 != null) {
                ArrayList<TemplateSlot> arrayListLJ = C539530LDz.LJ(arrayListLJFF2);
                Pair<Boolean, List<TemplateSlot>> pairLIZ = C531610Kt5.LIZ(arrayListLJ);
                if (pairLIZ.getFirst().booleanValue()) {
                    arrayListLJ = new ArrayList<>(pairLIZ.getSecond());
                }
                if (templateType2 == EnumC1412640mre.PUGC_TEMPLATE.getValue()) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                Pair<Boolean, List<TemplateSlot>> pairLIZIZ = C531620Kt6.LIZIZ(arrayListLJ, z2);
                Boolean first = pairLIZIZ.getFirst();
                if (first.booleanValue()) {
                    arrayListLJ = new ArrayList<>(pairLIZIZ.getSecond());
                }
                if (!arrayListLJ.isEmpty()) {
                    C786410Ut5.LJJIL(bundle, "clip_arg_data_process_origin_items", arrayListLJ);
                }
                ArrayList<Integer> arrayListLIZJ = C539530LDz.LIZJ(arrayListLJ);
                if (!arrayListLIZJ.isEmpty()) {
                    C786410Ut5.LJJIJIL(bundle, "clip_arg_data_process_items", arrayListLIZJ);
                }
                boolean zIsUsingMagic = TemplateSlotKt.isUsingMagic(arrayListLJFF2);
                boolean zIsUsingReverse = TemplateSlotKt.isUsingReverse(arrayListLJFF2);
                boolean hasMaterialTypeConstraints = TemplateSlotKt.getHasMaterialTypeConstraints(arrayListLJFF2);
                if (listLJ.contains(Integer.valueOf(C0CIJ.UGC_I2V_FRAME.getValue()))) {
                    size = Math.min(arrayListLJ.size(), 2);
                } else if (!pairLIZ.getFirst().booleanValue() && !zIsUsingReverse && !hasMaterialTypeConstraints) {
                    if (first.booleanValue()) {
                        if (!zIsUsingMagic && C298910Bnd.LIZ()) {
                            size = Math.min(arrayListLJ.size(), C0LE5.LIZIZ());
                        } else {
                            size = arrayListLJ.size();
                        }
                    } else if (!zIsUsingMagic) {
                        size = Math.min(arrayListLIZJ.size(), C0LE5.LIZIZ());
                    } else {
                        size = arrayListLIZJ.size();
                    }
                } else {
                    size = arrayListLJ.size();
                }
                bundle.putInt("key_photo_select_min_count", size);
                bundle.putInt("key_video_select_min_count", size);
                templateAnchorConfig.getMusicId();
                ArrayList arrayList2 = (ArrayList) C539530LDz.LIZIZ(arrayListLJFF2);
                if (arrayList2.size() == 1) {
                    Iterator<TemplateSlot> it3 = arrayListLJFF2.iterator();
                    while (true) {
                        if (it3.hasNext()) {
                            next = it3.next();
                            TemplateSlot templateSlot = next;
                            if (Intrinsics.LJFF(templateSlot.getType(), "audio") && NLEEditorJniJNI.NLEMusicResourceProtocol_isMusicResource(templateSlot.getSource())) {
                                break;
                            }
                        } else {
                            next = null;
                            break;
                        }
                    }
                    TemplateSlot templateSlot2 = next;
                    if (templateSlot2 != null) {
                        int clipStart = (int) (templateSlot2.getClipStart() * 1000.0d);
                        int clipEnd = (int) (templateSlot2.getClipEnd() * 1000.0d);
                        CameraComponentModel cameraComponentModel = shortVideoContext.cameraComponentModel;
                        cameraComponentModel.mMusicStart = clipStart;
                        cameraComponentModel.musicEndTime = clipEnd;
                        MusicModel musicModel = templateAnchorConfig.getMusicModel();
                        if (musicModel != null) {
                            musicModel.setMusicBeginTime(clipStart);
                            musicModel.setMusicEndTime(clipEnd);
                        }
                        AVMusic aVMusicTransformMusicModel = o.LJI.transformMusicModel(musicModel);
                        if (aVMusicTransformMusicModel != null) {
                            C786410Ut5.LJJIZ(bundle, "aweme_music", aVMusicTransformMusicModel);
                            C786410Ut5.LJJIZ(bundle, "music_model", musicModel);
                        }
                        C786410Ut5.LJJIJL(bundle, "clip_arg_data_process_music_item", templateSlot2);
                    }
                    if (templateAnchorConfig.getMusicId() != null) {
                        C786410Ut5.LJJJI("key_pugc_music_id", templateAnchorConfig.getMusicId(), bundle);
                    }
                } else if (arrayList2.size() >= 2) {
                    ArrayList arrayList3 = new ArrayList();
                    Iterator it4 = arrayList2.iterator();
                    while (it4.hasNext()) {
                        String strLIZ = C0LE0.LIZ(((TemplateSlot) it4.next()).getSource());
                        if (!strLIZ.isEmpty()) {
                            arrayList3.add(strLIZ);
                        }
                    }
                    C786410Ut5.LJJJIL(bundle, "key_pugc_fusion_music_ids", arrayList3);
                }
            }
            if (templateAnchorConfig.getAwemeMusicInfo() != null) {
                C786410Ut5.LJJIJL(bundle, "key_anchor_aweme_music_info", templateAnchorConfig.getAwemeMusicInfo());
            }
            if (templateAnchorConfig.getTemplateMusicInfo() != null) {
                C786410Ut5.LJJIJL(bundle, "key_anchor_template_music_info", templateAnchorConfig.getTemplateMusicInfo());
            }
            bundle.putInt("key_template_slot_index", 0);
            C786410Ut5.LJJIZ(bundle, "key_ugc_template_anchor", templateAnchorConfig.getAnchor());
            C786410Ut5.LJJJI("key_ugc_template_id", templateAnchorConfig.getTemplateId(), bundle);
            if (templateAnchorConfig.getTemplateType() == EnumC1412640mre.UGC_TEMPLATE.getValue()) {
                bundle.putInt("key_choose_scene", 24);
            } else {
                bundle.putInt("key_choose_scene", 36);
            }
            List<String> listLIZ = C539530LDz.LIZ(templateAnchorConfig.getAnchor());
            if (listLIZ != null) {
                C1432940nOO.LIZ.getClass();
                if (C1432940nOO.LJFF(listLIZ)) {
                    z = true;
                    shortVideoContext.creativeModel.pugcTemplateData.hasMagic = true;
                } else {
                    z = true;
                }
                if (listLIZ.contains("TEMPLATE_MATTING")) {
                    shortVideoContext.creativeModel.pugcTemplateData.hasMatting = z;
                }
            }
            PUgcTemplateData pUgcTemplateData = shortVideoContext.creativeModel.pugcTemplateData;
            pUgcTemplateData.featureList = listLIZ;
            pUgcTemplateData.featureCodes = listLJ;
            if (anchor != null && anchor.subType().equals("pugc")) {
                if (anchor.getType() == 66 || (C298980Bnk.LIZ() && c1412390mrF != null && c1412390mrF.LIZ())) {
                    shortVideoContext.creativeModel.ugcTemplateData.isPUGCTemplateFromAutoCutAnchor = true;
                }
                if (anchor.getType() == 29 || (C298980Bnk.LIZ() && c1412390mrF != null && c1412390mrF.LIZJ())) {
                    shortVideoContext.creativeModel.ugcTemplateData.isPUGCTemplateFromMVAnchor = true;
                }
            }
            shortVideoContext.creativeModel.ugcTemplateData.isFromEPTemplateAnchor = templateAnchorConfig.getEpTemplateInfo().isEPTemplate();
            shortVideoContext.creativeModel.ugcTemplateData.anchorTemplateUsedFunctions = templateAnchorConfig.getEpTemplateInfo().usedFunctions;
            String str2 = MvChoosePhotoActivity._pnsPageId;
            C0L0F.LIZLLL(activity, bundle, 1);
        }
    }

    @Override // com.ss.android.ugc.aweme.services.external.ui.IRecordService
    public final void startTemplatePreviewActivity(Activity activity, C0MPJ c0mpj) {
        Activity activityLIZIZ;
        Activity activityLIZ;
        Activity activityLIZIZ2;
        Activity activityLIZ2;
        CreativeToolsPluginService creativeToolsPluginService = (CreativeToolsPluginService) PluggableExtentionKt.pluggableSpi$default(CreativeToolsPluginService.class, false, false, false, 14, null);
        if (creativeToolsPluginService != null) {
            String str = c0mpj.LIZIZ;
            if (str == null) {
                str = "";
            }
            if (creativeToolsPluginService.LIZJ(activity, str, true)) {
                if (LJI(activity)) {
                    if (((IMainService) ServiceManager.get().getService(IMainService.class)).isAppHot()) {
                        AbstractC1387200mCc abstractC1387200mCcLIZLLL = C1906580ziK.LIZLLL();
                        if (abstractC1387200mCcLIZLLL != null && (activityLIZIZ2 = abstractC1387200mCcLIZLLL.LIZIZ()) != null && (activityLIZ2 = C1388190mED.LIZ(activityLIZIZ2)) != null && LJII(activityLIZ2)) {
                            return;
                        }
                    } else {
                        for (AbstractC1387200mCc abstractC1387200mCc : C1906580ziK.LJII()) {
                            if ((abstractC1387200mCc.LIZ instanceof InterfaceC1711206n0) && (activityLIZIZ = abstractC1387200mCc.LIZIZ()) != null && (activityLIZ = C1388190mED.LIZ(activityLIZIZ)) != null && LJII(activityLIZ)) {
                                return;
                            }
                        }
                    }
                } else if (LJII(activity)) {
                    return;
                }
                C0CHQ.LIZ().LJIIIIZZ().LJIIIIZZ(activity, c0mpj);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.services.external.ui.IRecordService
    public final void startUgcTemplateAnchorAlbum(Activity activity, UgcTemplateAlbumConfig ugcTemplateAlbumConfig) {
        CreativeToolsPluginService creativeToolsPluginService = (CreativeToolsPluginService) PluggableExtentionKt.pluggableSpi$default(CreativeToolsPluginService.class, false, false, false, 14, null);
        if (creativeToolsPluginService != null && creativeToolsPluginService.LIZJ(activity, ugcTemplateAlbumConfig.getShootWay(), true)) {
            C1398350mUb c1398350mUb = C1398350mUb.LIZIZ;
            C1227904rF.LIZ.getClass();
            C571450Mb9.LIZIZ(C571430Mb7.LL, c1398350mUb, C1227904rF.LJI(ugcTemplateAlbumConfig));
            ITemplateConsumeService iTemplateConsumeService = (ITemplateConsumeService) PluggableExtentionKt.pluggableSpi$default(ITemplateConsumeService.class, false, false, false, 14, null);
            if (iTemplateConsumeService != null && iTemplateConsumeService.LIZ(activity, ugcTemplateAlbumConfig)) {
                return;
            }
            C1688680u2s.LJJ(activity, ugcTemplateAlbumConfig);
        }
    }

    @Override // com.ss.android.ugc.aweme.services.external.ui.IRecordService
    public final void checkPUGCI2VQuota(Activity activity, TemplateAnchorConfig templateAnchorConfig, Function1<? super Boolean, Unit> function1) {
        new C536500L2i(activity).LIZ(templateAnchorConfig.getTemplateType(), templateAnchorConfig.getCreativeInfo().getCreationId(), templateAnchorConfig.getTemplateId(), C539530LDz.LIZLLL(templateAnchorConfig.getAnchor()), function1);
    }

    @Override // com.ss.android.ugc.aweme.services.external.ui.IRecordService
    public final void openAlbumWithMusic(Activity activity, RecordConfig recordConfig, MusicModel musicModel) {
        if (C299080Bnu.LIZ()) {
            CreativeToolsPluginService creativeToolsPluginService = (CreativeToolsPluginService) PluggableExtentionKt.pluggableSpi$default(CreativeToolsPluginService.class, false, false, false, 14, null);
            if (creativeToolsPluginService != null) {
                String shootway = recordConfig.getShootway();
                if (shootway == null) {
                    shootway = "openAlbumWithMusic";
                }
                if (!creativeToolsPluginService.LIZJ(activity, shootway, true)) {
                    return;
                }
            } else {
                return;
            }
        }
        C1452640nuA.LJI(null);
        this.LIZ.LJIIIZ();
        VideoRecordEntranceServiceImpl.Companion.getINSTANCE().startChoosePhotoActivityWithMusic(activity, AbstractC20598115it.LIZ(recordConfig), musicModel);
    }

    @Override // com.ss.android.ugc.aweme.services.external.ui.IRecordService
    public final void startRecordSlideShowPhotoMV(Context context, RecordConfig recordConfig, PhotoMvAnchorConfig photoMvAnchorConfig) {
        if (C299080Bnu.LIZ()) {
            CreativeToolsPluginService creativeToolsPluginService = (CreativeToolsPluginService) PluggableExtentionKt.pluggableSpi$default(CreativeToolsPluginService.class, false, false, false, 14, null);
            if (creativeToolsPluginService != null) {
                String shootway = recordConfig.getShootway();
                if (shootway == null) {
                    shootway = "startRecordSlideShowPhotoMV";
                }
                if (!creativeToolsPluginService.LIZJ(context, shootway, true)) {
                    return;
                }
            } else {
                return;
            }
        }
        C1452640nuA.LJI(null);
        this.LIZ.LJIIIZ();
        VideoRecordEntranceServiceImpl.Companion.getINSTANCE().startChoosePhotoActivity(C1388190mED.LIZ(context), AbstractC20598115it.LIZ(recordConfig), photoMvAnchorConfig);
    }

    @Override // com.ss.android.ugc.aweme.services.external.ui.IRecordService
    public final void startUgcTemplatePreviewActivity(Activity activity, UgcTemplateAnchorConfig ugcTemplateAnchorConfig, C2344009Gk c2344009Gk) {
        CreativeToolsPluginService creativeToolsPluginService = (CreativeToolsPluginService) PluggableExtentionKt.pluggableSpi$default(CreativeToolsPluginService.class, false, false, false, 14, null);
        if (creativeToolsPluginService != null && creativeToolsPluginService.LIZJ(activity, ugcTemplateAnchorConfig.getShootWay(), true)) {
            SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(activity, "aweme://template/ugc/preview");
            smartRouteBuildRoute.withParam("aweme_model", ugcTemplateAnchorConfig.getAweme());
            smartRouteBuildRoute.withParam("is_enter_preview_from_pugc", ugcTemplateAnchorConfig.isFromPUgc());
            smartRouteBuildRoute.withParam("followed_main_anchor_type", ugcTemplateAnchorConfig.getMainAnchorType());
            smartRouteBuildRoute.withParam("tt_template_type", ugcTemplateAnchorConfig.getTtTemplateType());
            smartRouteBuildRoute.withParam("creation_info", (Serializable) ugcTemplateAnchorConfig.getCreativeInfo());
            smartRouteBuildRoute.withParam("is_use_editor_pro_template", ugcTemplateAnchorConfig.getEpTemplateInfo().isEPTemplate());
            smartRouteBuildRoute.withParam("template_used_functions", ugcTemplateAnchorConfig.getEpTemplateInfo().usedFunctions);
            smartRouteBuildRoute.withParam("template_music_id", ugcTemplateAnchorConfig.getTemplateMusicId());
            smartRouteBuildRoute.withParam("is_pugc_template_from_autocut_anchor", ugcTemplateAnchorConfig.isPUGCTemplateFromAutoCutAnchor());
            smartRouteBuildRoute.withParam("enter_method", ugcTemplateAnchorConfig.getEnterMethod());
            smartRouteBuildRoute.withParam("relation_enter_method", ugcTemplateAnchorConfig.getRelationEnterMethod());
            smartRouteBuildRoute.open();
            c2344009Gk.LJFF("creation_id", ugcTemplateAnchorConfig.getCreativeInfo().getCreationId());
            ((IRecordMobService) ServiceManager.get().getService(IRecordMobService.class)).LIZ(c2344009Gk.LIZ);
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [T, X.0mGW] */
    public static final void LJIIIZ(Activity activity, C259800zU<DialogC1389620mGW> c259800zU, final C013C c013c, boolean z) {
        if (activity.isFinishing()) {
            return;
        }
        if (!z) {
            DialogC1389620mGW dialogC1389620mGW = c259800zU.element;
            if (dialogC1389620mGW != null) {
                dialogC1389620mGW.dismiss();
                C785410UrT.LIZ(dialogC1389620mGW);
                return;
            }
            return;
        }
        if (c259800zU.element == null) {
            ?? dialogC1389620mGW2 = new DialogC1389620mGW(activity);
            dialogC1389620mGW2.LJJLJ(2131836766);
            dialogC1389620mGW2.LJJLIIJ(false);
            dialogC1389620mGW2.LJJLL(true);
            dialogC1389620mGW2.LLILZLL = new InterfaceC1389630mGX() { // from class: X.0Mef
                @Override // X.InterfaceC1389630mGX
                public final void LIZ(DialogC19728412Gs dialogC19728412Gs) {
                    c013c.element = true;
                }
            };
            c259800zU.element = dialogC1389620mGW2;
        }
        DialogC1389620mGW dialogC1389620mGW3 = c259800zU.element;
        if (dialogC1389620mGW3 != null) {
            C786410Ut5.J4(dialogC1389620mGW3);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ss.android.ugc.aweme.services.external.ui.IRecordService
    public final void startMemeSongPage(Activity activity, String str, List<MemeSongModel> list, Function2<? super List<MemeSongModel>, ? super String, Unit> function2) {
        Bundle bundle;
        NavigationScene navigationScene;
        C573640Meg.LIZIZ = function2;
        C573640Meg.LIZ = list;
        if ((activity instanceof InterfaceC573670Mej) && (navigationScene = ((InterfaceC573670Mej) activity).getNavigationScene()) != null) {
            if (activity instanceof C19EG) {
                C19EG c19eg = (C19EG) activity;
                List<Fragment> listLJJLIIIJL = c19eg.getSupportFragmentManager().LJJLIIIJL();
                ArrayList arrayList = new ArrayList();
                for (Fragment fragment : listLJJLIIIJL) {
                    if (fragment instanceof DialogFragment) {
                        arrayList.add(fragment);
                    }
                }
                if (!arrayList.isEmpty()) {
                    C19EH c19ehLJIIJ = c19eg.getSupportFragmentManager().LJIIJ();
                    Iterator it2 = arrayList.iterator();
                    while (it2.hasNext()) {
                        c19ehLJIIJ.LJIIZILJ((Fragment) it2.next());
                    }
                    c19ehLJIIJ.LJIIL();
                }
            }
            navigationScene.LLLLLLLLL(MemeSongPageContainerScene.class, null, null);
            return;
        }
        Intent intent = new Intent();
        intent.setClass(activity, SAAActivity.class);
        intent.putExtra("MemeSongPageFrom", str);
        intent.putExtra("creative_saa_page", "MemeSongScene");
        try {
            bundle = intent.getExtras();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        if (bundle == null) {
            bundle = new Bundle();
        }
        C0MWH.LJIIL(activity, bundle, "MemeSongScene", null, null, null, false, 120);
    }

    public final void LJFF(Activity activity, RecordConfig recordConfig, InterfaceC1419170n2B interfaceC1419170n2B, String str, String str2) {
        String shootway;
        C1452640nuA.LJI(null);
        this.LIZ.LJIIIZ();
        o.LJFF(C2216131BoR.LIZ());
        ShortVideoContext shortVideoContext = new ShortVideoContext(new CameraComponentModel(0));
        CreativeInfo creativeInfo = new CreativeInfo(null, 0, null, 7, null);
        shortVideoContext.cameraComponentModel.mWorkspace = C14D2.LIZ(creativeInfo);
        shortVideoContext.creativeInfo = creativeInfo;
        shortVideoContext.LJ().setCreationId(creativeInfo.getCreationId());
        if (C1394330mO7.LIZ()) {
            shootway = recordConfig.getShootway();
            if (shootway == null) {
                shootway = "tt_template_anchor";
            }
        } else if (!Intrinsics.LJFF(recordConfig.getShootway(), "followup_square")) {
            shootway = "mv_page";
        } else {
            shootway = recordConfig.getShootway();
        }
        shortVideoContext.shootWay = shootway;
        shortVideoContext.enterFrom = "mv_page";
        List<String> listLIZIZ = C0LEI.LIZIZ(str2, "tt_template_type", "dispatch_type");
        String str3 = (String) ListProtector.get(listLIZIZ, 0);
        String str4 = (String) ListProtector.get(listLIZIZ, 1);
        shortVideoContext.enterMethod = recordConfig.getEnterMethod();
        CreativeModel creativeModel = shortVideoContext.creativeModel;
        FollowUpPublishTrackerModel followUpPublishTrackerModel = creativeModel.followUpPublishTrackerModel;
        followUpPublishTrackerModel.followUpFirstItemId = C1443560nfW.LJI;
        followUpPublishTrackerModel.followUpItemIdGroups = C1443560nfW.LJII;
        followUpPublishTrackerModel.enterRecordFromFeed = true;
        followUpPublishTrackerModel.followedMainAnchorType = str;
        followUpPublishTrackerModel.followedTemplateType = str3;
        followUpPublishTrackerModel.followUpPromoId = C1443560nfW.LJIIJJI;
        creativeModel.eventData.shootEnterMethod = recordConfig.getEnterMethod();
        shortVideoContext.creativeModel.socialModel.relationEnterMethod = recordConfig.getRelationEnterMethod();
        if (recordConfig.getShootExtraData() != null) {
            shortVideoContext.creativeFlowData.setShootExtraData(recordConfig.getShootExtraData());
        }
        if (str2 != null && str2.length() != 0) {
            List<String> listLIZIZ2 = C0LEI.LIZIZ(str2, "tt_template_type", "dispatch_type");
            if (!listLIZIZ2.isEmpty()) {
                Iterator<String> it2 = listLIZIZ2.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    if (it2.next() != null) {
                        TemplateAnchorData templateAnchorData = shortVideoContext.creativeModel.templateAnchorData;
                        templateAnchorData.isFollowPublishFromAnchor = true;
                        templateAnchorData.ttTemplateType = str3;
                        templateAnchorData.followedTemplateDispatchType = str4;
                        break;
                    }
                }
            }
        }
        AVETParameter aVETParameter = new AVETParameter();
        aVETParameter.setCreationId(shortVideoContext.getCreationId());
        String str5 = shortVideoContext.shootWay;
        String hint = "";
        if (str5 == null) {
            str5 = "";
        }
        aVETParameter.setShootWay(str5);
        shortVideoContext.avetParameter = aVETParameter;
        if (interfaceC1419170n2B instanceof MvThemeData) {
            MvThemeData mvThemeData = (MvThemeData) interfaceC1419170n2B;
            mvThemeData.isMvAnchor = 1;
            shortVideoContext.mBindMovieId = mvThemeData.LJ();
            if (activity != null && mvThemeData.minCount >= 0) {
                String strLIZJ = mvThemeData.LIZJ();
                if (C2354709Kn.LIZIZ(strLIZJ)) {
                    mvThemeData.needServerExecute = C0MPK.LIZLLL(mvThemeData);
                    Bundle bundle = new Bundle();
                    bundle.putInt("template_type", EnumC1412640mre.MV_TEMPLATE.getValue());
                    C786410Ut5.LJJJI("mv_id", mvThemeData.getMvId(), bundle);
                    C786410Ut5.LJJJI("key_mv_src_limited_toast", mvThemeData.srcLimitToast, bundle);
                    bundle.putInt("upload_photo_min_height", mvThemeData.srcLimitHeight);
                    bundle.putInt("upload_photo_min_width", mvThemeData.srcLimitWidth);
                    Effect effect = mvThemeData.effect;
                    if (effect != null) {
                        hint = effect.getHint();
                    }
                    C786410Ut5.LJJJI("key_mv_hint_text", hint, bundle);
                    C786410Ut5.LJJJI("key_mv_resource_unzip_path", strLIZJ, bundle);
                    C786410Ut5.LJJIJL(bundle, "key_select_mv_data", mvThemeData);
                    C786410Ut5.LJJIJL(bundle, "key_short_video_context", shortVideoContext);
                    Effect effect2 = mvThemeData.effect;
                    if (effect2 != null) {
                        List<String> tags = effect2.getTags();
                        if (!C0IKQ.LIZ(tags)) {
                            Iterator<String> it3 = tags.iterator();
                            while (true) {
                                if (!it3.hasNext()) {
                                    break;
                                }
                                String next = it3.next();
                                if (u.LJJIIJZLJL(next, "challenge:", false)) {
                                    String strSubstring = next.substring(10);
                                    if (strSubstring != null) {
                                        C786410Ut5.LJJJI("Key_challenge_id", strSubstring, bundle);
                                    }
                                }
                            }
                        }
                    }
                    Effect effect3 = mvThemeData.effect;
                    if (effect3 != null) {
                        C786410Ut5.LJJJI("key_sdk_extra_data", effect3.getSdkExtra(), bundle);
                    }
                    C786410Ut5.LJJJI("key_mv_algorithm_hint", mvThemeData.LJFF(), bundle);
                    bundle.putInt("key_photo_select_min_count", mvThemeData.minCount);
                    bundle.putInt("key_photo_select_max_count", mvThemeData.maxCount);
                    bundle.putInt("key_support_flag", 3);
                    bundle.putInt("key_choose_scene", 2);
                    bundle.putLong("invoke_uploadpage_time", System.currentTimeMillis());
                    String str6 = MvChoosePhotoActivity._pnsPageId;
                    C0L0F.LIZJ(activity, bundle, 10001, null);
                }
            }
        } else if (interfaceC1419170n2B instanceof CutsameDataItem) {
            CutsameDataItem cutsameDataItem = (CutsameDataItem) interfaceC1419170n2B;
            shortVideoContext.enterCutsameId = cutsameDataItem.templateId;
            cutsameDataItem.isMvAnchor = 1;
            if (activity != null) {
                C1403010mc7.LIZ.LJFF().LJFF(activity, cutsameDataItem, shortVideoContext);
            }
        }
        LIZJ = false;
    }

    @Override // com.ss.android.ugc.aweme.services.external.ui.IRecordService
    public final void clickMvAnchorOpenAlbumDirectly(final Context context, final RecordConfig recordConfig, final StickerDownloadConfig stickerDownloadConfig, final String str, final String str2) {
        EnumC1412640mre enumC1412640mre;
        CreativeToolsPluginService creativeToolsPluginService = (CreativeToolsPluginService) PluggableExtentionKt.pluggableSpi$default(CreativeToolsPluginService.class, false, false, false, 14, null);
        if (creativeToolsPluginService != null) {
            String shootway = recordConfig.getShootway();
            if (shootway == null) {
                shootway = "";
            }
            if (creativeToolsPluginService.LIZJ(context, shootway, true) && !TextUtils.isEmpty(stickerDownloadConfig.getStickerId()) && !LIZJ) {
                LIZJ = true;
                Integer type = stickerDownloadConfig.getType();
                if (type != null && type.intValue() == 4) {
                    ITemplateResourceService iTemplateResourceService = (ITemplateResourceService) ServiceManager.get().getService(ITemplateResourceService.class);
                    String stickerId = stickerDownloadConfig.getStickerId();
                    C1429050nI7 c1429050nI7 = C1429050nI7.LIZ;
                    TemplateScene templateScene = TemplateScene.TEMPLATE_TAB;
                    c1429050nI7.getClass();
                    Pair pairLIZJ = C1429050nI7.LIZJ(templateScene);
                    Integer type2 = stickerDownloadConfig.getType();
                    if (type2 != null && type2.intValue() == 4) {
                        enumC1412640mre = EnumC1412640mre.CUT_SAME;
                    } else {
                        enumC1412640mre = EnumC1412640mre.MV_TEMPLATE;
                    }
                    iTemplateResourceService.LIZJ(stickerId, pairLIZJ, enumC1412640mre.getValue(), new AwS3S2400000_8(context, this, recordConfig, stickerDownloadConfig, str, str2, 3), new AwS587S0100000_8(stickerDownloadConfig, 694));
                    return;
                }
                AbstractC20598115it.LIZLLL(context, stickerDownloadConfig, new IFetchEffectListener() { // from class: X.0Meb
                    @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListener
                    public final void onStart(Effect effect) {
                    }

                    @Override // com.ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
                    public final void onSuccess(Effect effect) {
                        Effect effect2 = effect;
                        Function0<Unit> onSuccess = stickerDownloadConfig.getOnSuccess();
                        if (onSuccess != null) {
                            onSuccess.invoke();
                        }
                        MvThemeData mvThemeData = new MvThemeData();
                        mvThemeData.LJI(effect2);
                        this.LJFF(C1388190mED.LIZ(context), recordConfig, mvThemeData, str, str2);
                    }

                    @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListener
                    public final void onFail(Effect effect, ExceptionResult exceptionResult) {
                        Function1<Integer, Unit> onFail = stickerDownloadConfig.getOnFail();
                        if (onFail != null) {
                            onFail.invoke(Integer.valueOf(exceptionResult.getErrorCode()));
                        }
                        q.LIZJ = false;
                    }
                });
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.services.external.ui.IRecordService
    public final void showCameraWidgetGuide(final C19EG c19eg, final LifecycleOwner lifecycleOwner, String str, String str2, String str3, boolean z, InterfaceC20658015sY interfaceC20658015sY) {
        String str4;
        AppWidgetManager appWidgetManager;
        if (!z || C0C64.LJIILLIIL().LJIIIZ(31744, "studio_creation_enable_save_draft_widget_guide", true, false)) {
            if (z) {
                str4 = "save_drafts";
            } else {
                str4 = "publish";
            }
            if (c19eg.getPackageManager().hasSystemFeature("android.software.app_widgets") && C0C64.LJIILLIIL().LJIIIZ(31744, "studio_creation_enable_pin_camera_widget", true, false) && Intrinsics.LJFF(str, "direct_shoot") && !C573740Meq.LIZ().getBoolean("widget_installed", false) && C573740Meq.LIZ().getInt("show_guide_cnt", 0) < 3) {
                if (System.currentTimeMillis() - C573740Meq.LIZ().getLong("last_show_time", 0L) > TimeUnit.DAYS.toMillis(5L) && !C0CHQ.LIZ().getAccountService().LIZ()) {
                    if (C0C64.LJIILLIIL().LJIIIZ(31744, "studio_creation_enable_camera_widget_guide", true, false)) {
                        C573720Meo.LIZ.getClass();
                        if (C2354709Kn.LIZIZ(C573720Meo.LIZ())) {
                            PopupManager.LJIJI(new C573760Mes(c19eg, str3, str, str2, str4), true);
                            int i = C573740Meq.LIZ().getInt("show_guide_cnt", 0) + 1;
                            C573740Meq.LIZ().storeInt("show_guide_cnt", i);
                            C573740Meq.LIZ().storeLong("last_show_time", System.currentTimeMillis());
                            if (i == 3) {
                                C2354709Kn.LJIJJLI(C573720Meo.LIZ());
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    if (Build.VERSION.SDK_INT < 26 || (appWidgetManager = AppWidgetManager.getInstance(c19eg)) == null || !appWidgetManager.isRequestPinAppWidgetSupported() || C19712912At.LIZ.LIZJ()) {
                        return;
                    }
                    final C573710Men c573710Men = new C573710Men(c19eg, str, str3, str2, str4);
                    if (C849850XVn.LIZIZ.LIZJ().LJJ("camera_widget_guide")) {
                        PopupManager.LJIJ(new C10GR() { // from class: com.ss.android.ugc.aweme.utils.CameraWidgetManager$showAddToHomeWidget$1
                            @Override // X.InterfaceC20660515sx
                            public final int getPriority() {
                                return 2510;
                            }

                            @Override // X.InterfaceC20660415sw
                            public final C688120Qyw i2() {
                                C19EG c19eg2 = c19eg;
                                return new C688120Qyw(c19eg2, c19eg2, null);
                            }

                            @Override // X.InterfaceC20659015si
                            public final void LJFF(C688120Qyw c688120Qyw, C20656615sK c20656615sK) {
                                c573710Men.invoke();
                                lifecycleOwner.getLifecycle().addObserver(new CameraWidgetManager$showAddToHomeWidget$1$showPopup$1(new C013C(), new C013C(), c20656615sK));
                            }
                        }, "camera_widget_guide", new C1668306g5("camera_widget_after_post"));
                    } else {
                        c573710Men.invoke();
                    }
                }
            }
        }
    }
}
