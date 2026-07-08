package irm;

import X.AbstractViewOnClickListenerC1173120gdK;
import X.C07G2;
import X.C0GZA;
import X.C0OGR;
import X.C1161920gLG;
import X.C1196320hEk;
import X.C1276004z0;
import X.C1375460ltg;
import X.C1389890mGx;
import X.C13LC;
import X.C13LP;
import X.C1488060opI;
import X.C15438062q;
import X.C1558360qeg;
import X.C1558520qew;
import X.C1561230qjJ;
import X.C16F5;
import X.C1809420xBc;
import X.C1833570xoZ;
import X.C1833770xot;
import X.C1834240xpe;
import X.C1834730xqR;
import X.C1835920xsM;
import X.C1835970xsR;
import X.C1853010yJv;
import X.C1853170yKB;
import X.C1853300yKO;
import X.C1853460yKe;
import X.C1853550yKn;
import X.C1853560yKo;
import X.C1853750yL7;
import X.C1853770yL9;
import X.C1854470yMH;
import X.C1855770yON;
import X.C1862330yYx;
import X.C1862680yZW;
import X.C1863240yaQ;
import X.C1863850ybP;
import X.C1864020ybg;
import X.C1954807lC;
import X.C197039127h;
import X.C19EG;
import X.C20189513zB;
import X.C20230914Dz;
import X.C2097608Jq;
import X.C345300DgG;
import X.C419910GdJ;
import X.C426750GoL;
import X.C449180HjQ;
import X.C497740JfY;
import X.C540190LGn;
import X.C724240Sb0;
import X.C842240X2g;
import X.EnumC1154810g9n;
import X.EnumC540140LGi;
import X.InterfaceC1833600xoc;
import X.InterfaceC1891350zJl;
import X.InterfaceC2217461Bqa;
import X.InterfaceC665370Q7z;
import android.content.Context;
import android.content.res.Resources;
import android.net.Uri;
import android.view.View;
import android.widget.ImageView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.bytedance.android.live.actionhandler.IActionHandlerService;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.livesdk.chatroom.model.RoomReplay;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveReplayHighlightPageRefactorSetting;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.android.livesdk.replay.proto.VideoMetaInfo;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.live.livehostimpl.livereply.LiveReplayVideoPlayerDialogFragment;
import com.ss.android.ugc.aweme.live.livehostimpl.livereply.highlight.general.HighlightPreviewClipFragment;
import com.ss.android.ugc.aweme.live.livehostimpl.livereply.quickpost.ui.LivePostTagCell;
import com.ss.android.ugc.aweme.live.livehostimpl.livereply.replaylist.LiveReplayListActivity;
import com.ss.android.ugc.aweme.live.livehostimpl.livereply.replaylist.ui.LiveReplayCell;
import com.ss.android.ugc.aweme.live.livehostimpl.livereply.share.LiveReplayShareData;
import com.ss.android.ugc.aweme.live.livehostimpl.livereply.share.LiveReplaySharePackage;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.ss.android.ugc.aweme.tako.botpage.bottombox.TakoInputViewUIAbility;
import com.ss.android.ugc.aweme.tako.botpage.bottombox.actionbarsug.TakoActionBarSugItemAssem;
import com.ss.android.ugc.aweme.tako.botpage.components.feedback.ability.TakoFeedbackAbility;
import com.ss.android.ugc.aweme.tako.menuwindow.SquareActionCell;
import com.ss.android.ugc.aweme.tako.menuwindow.SquarePhotoCell;
import com.ss.android.ugc.aweme.tako.menuwindow.TakoMenuWindowViewModel;
import com.ss.android.ugc.aweme.tako.multipletemplate.bottomselected.BottomSelectedMediaAssem;
import com.ss.android.ugc.aweme.tako.multipletemplate.bottomselected.SelectedCell;
import com.ss.android.ugc.aweme.tako.multipletemplate.gallery.ActionCell;
import com.ss.android.ugc.aweme.tako.multipletemplate.gallery.PhotoCell;
import com.ss.android.ugc.aweme.tako.multipletemplate.gallery.TakoPhotoChooseViewModel;
import com.ss.android.ugc.aweme.tako.multipletemplate.gallery.TikTokMediaModel;
import com.ss.android.ugc.aweme.tako.multipletemplate.gallery.picker.TakoGalleryPickerActivity;
import com.ss.android.ugc.aweme.tako.multipletemplate.templatelist.TemplateCell;
import com.ss.android.ugc.aweme.tako.multipletemplate.templatelist.TemplateListViewModel;
import com.ss.android.ugc.aweme.tako.otherpage.image.create.TakoImageCreateFragmentViewModel;
import com.ss.android.ugc.aweme.tako.signal.ITakoContextAbility;
import com.ss.android.ugc.aweme.tako.vm.TakoRecordFragmentViewModel;
import com.tts.oecverify.BdTuring;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS269S0000000_27;
import kotlin.jvm.internal.AwS133S0101000_27;
import kotlin.jvm.internal.AwS393S0200000_27;
import kotlin.jvm.internal.AwS396S0200000_30;
import kotlin.jvm.internal.AwS428S0200000_27;
import kotlin.jvm.internal.AwS462S0200000_27;
import kotlin.jvm.internal.AwS588S0100000_9;
import kotlin.jvm.internal.AwS638S0100000_24;
import kotlin.jvm.internal.AwS77S1000000_27;
import kotlin.jvm.internal.AwS78S0210000_27;
import tikcast.api.anchor.LiveFragmentDetail;

/* JADX INFO: loaded from: classes28.dex */
public class AkS64S0200000_27 extends AbstractViewOnClickListenerC1173120gdK {
    public final int $t;
    public Object l0;
    public Object l1;

    @Override // X.AbstractViewOnClickListenerC1173120gdK
    public final void LIZ(View view) {
        switch (this.$t) {
            case 0:
                LIZ$0(this, view);
                break;
            case 1:
                LIZ$1(this, view);
                break;
            case 2:
                LIZ$2(this, view);
                break;
            case 3:
                LIZ$3(this, view);
                break;
            case 4:
                LIZ$4(this, view);
                break;
            case 5:
                LIZ$5(this, view);
                break;
            case 6:
                LIZ$6(this, view);
                break;
            case 7:
                LIZ$7(this, view);
                break;
            case 8:
                LIZ$8(this, view);
                break;
            case BdTuring.TYPE_ECAF /* 9 */:
                LIZ$9(this, view);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                LIZ$10(this, view);
                break;
            case BdTuring.TYPE_EMAIL /* 11 */:
                LIZ$11(this, view);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                LIZ$12(this, view);
                break;
            case BdTuring.TYPE_SMS_VOICE /* 13 */:
                LIZ$13(this, view);
                break;
            case 14:
                LIZ$14(this, view);
                break;
            case 15:
                LIZ$15(this, view);
                break;
            case 16:
                LIZ$16(this, view);
                break;
            case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                LIZ$17(this, view);
                break;
            case LiveToolbarIconStyleSetting.COLORFUL_WITH_TEXT /* 18 */:
                LIZ$18(this, view);
                break;
            case 19:
                LIZ$19(this, view);
                break;
            case LiveToolbarIconStyleSetting.HIGHLIGHT_WITH_TEXT /* 20 */:
                LIZ$20(this, view);
                break;
            case 21:
                LIZ$21(this, view);
                break;
            case 22:
                LIZ$22(this, view);
                break;
            default:
                super.LIZ(view);
                break;
        }
    }

    public static final void LIZ$0(AkS64S0200000_27 akS64S0200000_27, View view) {
        AssemVMLazy assemVMLazy = ((LivePostTagCell) akS64S0200000_27.l0).LL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LivePostTagCell.LLILLL;
        assemVMLazy.getValue().setState(new AwS77S1000000_27(((C1276004z0) akS64S0200000_27.l1).LL, 10));
    }

    public static final void LIZ$1(AkS64S0200000_27 akS64S0200000_27, View view) {
        RoomReplay roomReplay;
        String str;
        int i;
        int i2;
        Long lValueOf;
        List<LiveFragmentDetail> list;
        LiveFragmentDetail liveFragmentDetail;
        C1833770xot item = ((LiveReplayCell) akS64S0200000_27.l0).getItem();
        if (item != null && (roomReplay = item.LL) != null && roomReplay.watchStatus != 3 && roomReplay.punishType <= 0) {
            ((LiveReplayCell) akS64S0200000_27.l0).I5().LLILLJJLI = ((LiveReplayCell) akS64S0200000_27.l0).getItem();
            SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(((View) akS64S0200000_27.l1).getContext(), "//webcast_replay_video");
            smartRouteBuildRoute.withParam("roomId", roomReplay.id);
            smartRouteBuildRoute.withParam("videoUrl", roomReplay.m3u8Url);
            smartRouteBuildRoute.withParam("downloadUrl", roomReplay.downloadUrl);
            VideoMetaInfo videoMetaInfo = roomReplay.mp4VideoMetaInfo;
            if (videoMetaInfo == null || (str = videoMetaInfo.fileId) == null) {
                str = "";
            }
            smartRouteBuildRoute.withParam("fileId", str);
            VideoMetaInfo videoMetaInfo2 = roomReplay.hlsVideoMetaInfo;
            if (videoMetaInfo2 != null) {
                i = (int) videoMetaInfo2.width;
            } else {
                i = 0;
            }
            smartRouteBuildRoute.withParam("videoWidth", i);
            VideoMetaInfo videoMetaInfo3 = roomReplay.hlsVideoMetaInfo;
            if (videoMetaInfo3 != null) {
                i2 = (int) videoMetaInfo3.height;
            } else {
                i2 = 0;
            }
            smartRouteBuildRoute.withParam("videoHeight", i2);
            smartRouteBuildRoute.withParam("downloadStatus", roomReplay.status);
            C1833570xoZ.LIZ.getClass();
            smartRouteBuildRoute.withParam("enterFromPage", C1833570xoZ.LIZIZ);
            smartRouteBuildRoute.withParam("enterFrom", "live_replay");
            smartRouteBuildRoute.withParam("last_page", "live_replay");
            smartRouteBuildRoute.withParam("videoLength", 0);
            smartRouteBuildRoute.withParam("isAutoPlay", false);
            smartRouteBuildRoute.withParam("position", 0);
            smartRouteBuildRoute.withParam("isMute", false);
            smartRouteBuildRoute.withParam("isPause", false);
            C1833770xot item2 = ((LiveReplayCell) akS64S0200000_27.l0).getItem();
            if (item2 != null && (list = item2.LLILLJJLI) != null && (liveFragmentDetail = (LiveFragmentDetail) C13LP.LJJJLL(list)) != null) {
                lValueOf = Long.valueOf(liveFragmentDetail.ownerUserId);
            } else {
                lValueOf = null;
            }
            smartRouteBuildRoute.withParam("anchor_id", String.valueOf(lValueOf));
            smartRouteBuildRoute.open();
            C1833570xoZ.LIZ("live_recording", roomReplay.id, "live_recording");
        }
    }

    public static final void LIZ$10(AkS64S0200000_27 akS64S0200000_27, View view) {
        if (((C1853550yKn) akS64S0200000_27.l0).LL.selectIndex > 0) {
            AssemVMLazy assemVMLazy = ((PhotoCell) akS64S0200000_27.l1).LLJIJIL;
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = PhotoCell.LLJILJIL;
            ((TakoPhotoChooseViewModel) assemVMLazy.getValue()).AQ2(((C1853550yKn) akS64S0200000_27.l0).LL, false);
        } else {
            AssemVMLazy assemVMLazy2 = ((PhotoCell) akS64S0200000_27.l1).LLJIJIL;
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr2 = PhotoCell.LLJILJIL;
            ((TakoPhotoChooseViewModel) assemVMLazy2.getValue()).yQ2(((C1853550yKn) akS64S0200000_27.l0).LL, ((PhotoCell) akS64S0200000_27.l1).getCurrentActivity(), EnumC1154810g9n.GALLERY_ITEM);
        }
    }

    public static final void LIZ$11(AkS64S0200000_27 akS64S0200000_27, View view) {
        C19EG currentActivity = ((PhotoCell) akS64S0200000_27.l0).getCurrentActivity();
        if (currentActivity != null) {
            AssemVMLazy assemVMLazy = ((PhotoCell) akS64S0200000_27.l0).LLJIJIL;
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = PhotoCell.LLJILJIL;
            ((TakoPhotoChooseViewModel) assemVMLazy.getValue()).xQ2(currentActivity, ((C1853550yKn) akS64S0200000_27.l1).LL, ((PhotoCell) akS64S0200000_27.l0).getCurrentFragment(), false);
        }
    }

    public static final void LIZ$12(AkS64S0200000_27 akS64S0200000_27, View view) {
        if (LiveReplayHighlightPageRefactorSetting.INSTANCE.enable()) {
            SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(((LiveReplayVideoPlayerDialogFragment) akS64S0200000_27.l0).getContext(), "//webcast_highlight_page");
            smartRouteBuildRoute.withParam("replay_room_id", ((RoomReplay) akS64S0200000_27.l1).id);
            smartRouteBuildRoute.withParam("last_page", "video_page");
            smartRouteBuildRoute.withParam("enter_from_page", ((LiveReplayVideoPlayerDialogFragment) akS64S0200000_27.l0).LLLFF);
            smartRouteBuildRoute.withParam("enter_from", "video_page");
            smartRouteBuildRoute.withParam("anchor_id", ((LiveReplayVideoPlayerDialogFragment) akS64S0200000_27.l0).LLLIIII);
            smartRouteBuildRoute.withParam("user_type", String.valueOf(((LiveReplayVideoPlayerDialogFragment) akS64S0200000_27.l0).LLJLL));
            smartRouteBuildRoute.withParam("is_bb_fans", ((LiveReplayVideoPlayerDialogFragment) akS64S0200000_27.l0).LLJZ);
            smartRouteBuildRoute.open();
        } else {
            Uri.Builder builderAppendQueryParameter = C1834240xpe.LIZIZ("live_highlight_page_url", "sslocal://webcast_lynxview?trans_navigation_bar=1&hide_nav_bar=1&hide_status_bar=0&use_spark=1&url=https://lf16-gecko-source.tiktokcdn.com/obj/byte-gurd-source-sg/tiktok/fe/live/tiktok_live_fundamental_live_replay/pages/highlight-list/template.js&should_full_screen=1&status_bar_bg_color=000000&status_font_mode=light&container_bg_color=000000&loading_bg_color=000000&bdhm_bid=tiktok_live_fundamental_replay&bdhm_pid=highlight&starling_channel=3588__38137&starling_fallback=1").appendQueryParameter("replay_title", ((RoomReplay) akS64S0200000_27.l1).title).appendQueryParameter("replay_room_id", ((RoomReplay) akS64S0200000_27.l1).id).appendQueryParameter("fragment_list_scene", "7").appendQueryParameter("last_page", "video_page").appendQueryParameter("enter_from_page", ((LiveReplayVideoPlayerDialogFragment) akS64S0200000_27.l0).LLLFF).appendQueryParameter("enter_from", ((LiveReplayVideoPlayerDialogFragment) akS64S0200000_27.l0).LLLFFI).appendQueryParameter("click_position", "view_highlight").appendQueryParameter("anchor_id", ((LiveReplayVideoPlayerDialogFragment) akS64S0200000_27.l0).LLLIIII);
            int i = ((LiveReplayVideoPlayerDialogFragment) akS64S0200000_27.l0).LLJLL;
            if (i != 0) {
                builderAppendQueryParameter.appendQueryParameter("user_type", String.valueOf(i));
            }
            ((IActionHandlerService) C1161920gLG.LIZJ(IActionHandlerService.class)).handle(((LiveReplayVideoPlayerDialogFragment) akS64S0200000_27.l0).getContext(), builderAppendQueryParameter.build().toString());
        }
        ((LiveReplayVideoPlayerDialogFragment) akS64S0200000_27.l0).wS("livesdk_live_replay_click", "view_highlight");
    }

    public static final void LIZ$13(AkS64S0200000_27 akS64S0200000_27, View view) {
        if (LiveReplayHighlightPageRefactorSetting.INSTANCE.enable()) {
            SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(((LiveReplayVideoPlayerDialogFragment) akS64S0200000_27.l0).getContext(), "//webcast_highlight_page");
            smartRouteBuildRoute.withParam("replay_room_id", ((RoomReplay) akS64S0200000_27.l1).id);
            smartRouteBuildRoute.withParam("last_page", "video_page");
            smartRouteBuildRoute.withParam("enter_from_page", ((LiveReplayVideoPlayerDialogFragment) akS64S0200000_27.l0).LLLFF);
            smartRouteBuildRoute.withParam("enter_from", "video_page");
            smartRouteBuildRoute.withParam("anchor_id", ((LiveReplayVideoPlayerDialogFragment) akS64S0200000_27.l0).LLLIIII);
            smartRouteBuildRoute.withParam("user_type", String.valueOf(((LiveReplayVideoPlayerDialogFragment) akS64S0200000_27.l0).LLJLL));
            smartRouteBuildRoute.withParam("support_bb_download", ((LiveReplayVideoPlayerDialogFragment) akS64S0200000_27.l0).LLJLLIL);
            smartRouteBuildRoute.withParam("is_bb_fans", ((LiveReplayVideoPlayerDialogFragment) akS64S0200000_27.l0).LLJZ);
            smartRouteBuildRoute.withParam("anchor_id", ((LiveReplayVideoPlayerDialogFragment) akS64S0200000_27.l0).LLLIIII);
            smartRouteBuildRoute.open();
        } else {
            Uri.Builder builderAppendQueryParameter = C1834240xpe.LIZIZ("live_highlight_page_url", "sslocal://webcast_lynxview?trans_navigation_bar=1&hide_nav_bar=1&hide_status_bar=0&use_spark=1&url=https://lf16-gecko-source.tiktokcdn.com/obj/byte-gurd-source-sg/tiktok/fe/live/tiktok_live_fundamental_live_replay/pages/highlight-list/template.js&should_full_screen=1&status_bar_bg_color=000000&status_font_mode=light&container_bg_color=000000&loading_bg_color=000000&bdhm_bid=tiktok_live_fundamental_replay&bdhm_pid=highlight&starling_channel=3588__38137&starling_fallback=1").appendQueryParameter("replay_title", ((RoomReplay) akS64S0200000_27.l1).title).appendQueryParameter("replay_room_id", ((RoomReplay) akS64S0200000_27.l1).id).appendQueryParameter("fragment_list_scene", "7").appendQueryParameter("last_page", "video_page").appendQueryParameter("enter_from_page", ((LiveReplayVideoPlayerDialogFragment) akS64S0200000_27.l0).LLLFF).appendQueryParameter("enter_from", ((LiveReplayVideoPlayerDialogFragment) akS64S0200000_27.l0).LLLFFI).appendQueryParameter("click_position", "view_highlight").appendQueryParameter("anchor_id", ((LiveReplayVideoPlayerDialogFragment) akS64S0200000_27.l0).LLLIIII);
            int i = ((LiveReplayVideoPlayerDialogFragment) akS64S0200000_27.l0).LLJLL;
            if (i != 0) {
                builderAppendQueryParameter.appendQueryParameter("user_type", String.valueOf(i));
            }
            ((IActionHandlerService) C1161920gLG.LIZJ(IActionHandlerService.class)).handle(((LiveReplayVideoPlayerDialogFragment) akS64S0200000_27.l0).getContext(), builderAppendQueryParameter.build().toString());
        }
        ((LiveReplayVideoPlayerDialogFragment) akS64S0200000_27.l0).wS("livesdk_live_replay_click", "view_highlight");
    }

    public static final void LIZ$14(AkS64S0200000_27 akS64S0200000_27, View view) {
        String str;
        List<String> listLIZ;
        C19EG activity = ((LiveReplayVideoPlayerDialogFragment) akS64S0200000_27.l0).getActivity();
        if (activity != null) {
            InterfaceC1833600xoc.la.LIZJ(Boolean.TRUE);
            ImageView imageViewSR = ((LiveReplayVideoPlayerDialogFragment) akS64S0200000_27.l0).SR();
            if (imageViewSR != null) {
                C0GZA.LIZIZ(imageViewSR);
            }
            String strLJIJI = ((RoomReplay) akS64S0200000_27.l1).title;
            if (strLJIJI.length() == 0) {
                strLJIJI = C497740JfY.LJIJI(2131851075);
            }
            C1375460ltg c1375460ltg = LiveReplaySharePackage.Companion;
            RoomReplay roomReplay = (RoomReplay) akS64S0200000_27.l1;
            String str2 = roomReplay.messageContentPb;
            ImageModel imageModel = roomReplay.cover;
            if (imageModel != null && (listLIZ = C842240X2g.LIZ(imageModel)) != null) {
                str = (String) C13LP.LJJJLL(listLIZ);
            } else {
                str = null;
            }
            String strLJIJJ = C497740JfY.LJIJJ(2131856112, strLJIJI);
            String str3 = ((LiveReplayVideoPlayerDialogFragment) akS64S0200000_27.l0).LLLIIII;
            String str4 = ((RoomReplay) akS64S0200000_27.l1).id;
            C1833570xoZ.LIZ.getClass();
            LiveReplayShareData liveReplayShareData = new LiveReplayShareData(str2, str, strLJIJJ, str3, str4, C1833570xoZ.LIZIZ, C1833570xoZ.LIZJ, "video_page", "replay", null, "live_replay_share");
            c1375460ltg.getClass();
            C1375460ltg.LIZ(activity, liveReplayShareData);
            ((LiveReplayVideoPlayerDialogFragment) akS64S0200000_27.l0).wS("livesdk_live_replay_click", "share");
        }
    }

    public static final void LIZ$15(AkS64S0200000_27 akS64S0200000_27, View view) {
        LiveReplayListActivity liveReplayListActivity = (LiveReplayListActivity) akS64S0200000_27.l0;
        Context context = ((C16F5) akS64S0200000_27.l1).getContext();
        liveReplayListActivity.getClass();
        IActionHandlerService iActionHandlerService = (IActionHandlerService) C1161920gLG.LIZJ(IActionHandlerService.class);
        Uri.Builder builderLIZIZ = C1834240xpe.LIZIZ("live_publisher_homepage_schema", "sslocal://webcast_lynxview?url=https%3A%2F%2Flf16-gecko-source.tiktokcdn.com%2Fobj%2Fbyte-gurd-source-sg%2Ftiktok%2Ffe%2Flive%2Ftiktok_live_fundamental_live_publisher%2Fpages%2Fhomepage%2Ftemplate.js&hide_nav_bar=1&hide_status_bar=0&trans_status_bar=1&bdhm_bid=tiktok_live_fundamental_live_publisher&bdhm_pid=homepage&starling_channel=3588__38137");
        C1833570xoZ.LIZ.getClass();
        iActionHandlerService.handle(context, builderLIZIZ.appendQueryParameter("enter_from_page", C1833570xoZ.LIZIZ).appendQueryParameter("enter_from", "live_recording_page").build().toString());
    }

    public static final void LIZ$16(AkS64S0200000_27 akS64S0200000_27, View view) {
        TakoInputViewUIAbility takoInputViewUIAbility;
        C19EG currentActivity = ((SquareActionCell) akS64S0200000_27.l0).getCurrentActivity();
        String quantityString = null;
        if (currentActivity == null) {
            Fragment currentFragment = ((SquareActionCell) akS64S0200000_27.l0).getCurrentFragment();
            if (currentFragment != null) {
                currentActivity = currentFragment.getActivity();
            } else {
                currentActivity = null;
            }
        }
        int i = C1853750yL7.LIZ[((C1853560yKo) akS64S0200000_27.l1).LL.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    ((SquareActionCell) akS64S0200000_27.l0).I5();
                    C449180HjQ.LIZ.getClass();
                    C449180HjQ.LIZIZ(currentActivity);
                    C1862330yYx.LJJZZIII(C1862330yYx.LIZ, ((SquareActionCell) akS64S0200000_27.l0).getCommonParams(), "click_album", null, null, 48);
                    return;
                }
                throw new C1954807lC();
            }
            TakoMenuWindowViewModel takoMenuWindowViewModelI5 = ((SquareActionCell) akS64S0200000_27.l0).I5();
            if (currentActivity != null) {
                C540190LGn.LIZ(currentActivity, EnumC540140LGi.IMAGE, new AwS393S0200000_27(takoMenuWindowViewModelI5, currentActivity, 103));
            }
            C1862330yYx.LJJZZIII(C1862330yYx.LIZ, ((SquareActionCell) akS64S0200000_27.l0).getCommonParams(), "click_album", null, null, 48);
            return;
        }
        TakoMenuWindowViewModel takoMenuWindowViewModelI52 = ((SquareActionCell) akS64S0200000_27.l0).I5();
        int size = takoMenuWindowViewModelI52.getState().LLILZ.size() + takoMenuWindowViewModelI52.LLIZLLLIL;
        int iVQ2 = takoMenuWindowViewModelI52.LLILLL;
        if (iVQ2 < 0) {
            iVQ2 = takoMenuWindowViewModelI52.vQ2();
        }
        if (size >= iVQ2) {
            if (currentActivity != null) {
                Resources resources = currentActivity.getResources();
                if (resources != null) {
                    quantityString = resources.getQuantityString(2131755041, iVQ2, Integer.valueOf(iVQ2));
                } else if (currentActivity != null) {
                }
                C1389890mGx c1389890mGx = new C1389890mGx(currentActivity);
                c1389890mGx.LJIIJ(quantityString);
                c1389890mGx.LJIIJJI();
            }
        } else {
            C1561230qjJ.LIZ.getClass();
            if (C1561230qjJ.LIZ()) {
                TakoMenuWindowViewModel takoMenuWindowViewModelI53 = ((SquareActionCell) akS64S0200000_27.l0).I5();
                String str = ((SquareActionCell) akS64S0200000_27.l0).getCommonParams().get("enter_from");
                String str2 = "";
                if (str == null) {
                    str = "";
                }
                String str3 = ((SquareActionCell) akS64S0200000_27.l0).getCommonParams().get("enter_method");
                if (str3 == null) {
                    str3 = "";
                }
                String str4 = ((SquareActionCell) akS64S0200000_27.l0).getCommonParams().get("process_id");
                if (str4 == null) {
                    str4 = "";
                }
                String str5 = ((SquareActionCell) akS64S0200000_27.l0).getCommonParams().get("tako_session_id");
                if (str5 == null) {
                    str5 = "";
                }
                String str6 = ((SquareActionCell) akS64S0200000_27.l0).getCommonParams().get("tako_chat_id");
                if (str6 != null) {
                    str2 = str6;
                }
                takoMenuWindowViewModelI53.xQ2(currentActivity, new C0OGR(str, str3, str4, str5, str2), new AwS638S0100000_24((SquareActionCell) akS64S0200000_27.l0, 169));
            } else {
                InterfaceC665370Q7z interfaceC665370Q7zLIZ = C1196320hEk.LIZ((SquareActionCell) akS64S0200000_27.l0);
                if (interfaceC665370Q7zLIZ != null && (takoInputViewUIAbility = (TakoInputViewUIAbility) C1558520qew.LIZ(interfaceC665370Q7zLIZ, TakoInputViewUIAbility.class, null)) != null) {
                    takoInputViewUIAbility.eh("menu_window", new AwS638S0100000_24((SquareActionCell) akS64S0200000_27.l0, 170));
                }
            }
        }
        C1862330yYx.LJJZZIII(C1862330yYx.LIZ, ((SquareActionCell) akS64S0200000_27.l0).getCommonParams(), "click_camera", null, null, 48);
    }

    public static final void LIZ$17(AkS64S0200000_27 akS64S0200000_27, View view) {
        C419910GdJ c419910GdJ;
        HighlightPreviewClipFragment highlightPreviewClipFragment = (HighlightPreviewClipFragment) akS64S0200000_27.l0;
        if (highlightPreviewClipFragment.LLJJIJIIJIL) {
            C1488060opI c1488060opI = highlightPreviewClipFragment.LLJI;
            if (c1488060opI != null) {
                c1488060opI.LJIIIIZZ();
            }
            highlightPreviewClipFragment.LLJJIJIIJIL = false;
            highlightPreviewClipFragment.VR(true);
            highlightPreviewClipFragment.UR("mute_close");
        } else {
            C1488060opI c1488060opI2 = highlightPreviewClipFragment.LLJI;
            if (c1488060opI2 != null) {
                c1488060opI2.mute();
            }
            highlightPreviewClipFragment.LLJJIJIIJIL = true;
            highlightPreviewClipFragment.VR(false);
            highlightPreviewClipFragment.UR("mute_open");
        }
        if (((HighlightPreviewClipFragment) akS64S0200000_27.l0).LLJJIJIIJIL) {
            c419910GdJ = new C419910GdJ();
            c419910GdJ.LIZ = R.raw.icon_speaker_x_mark_fill_ltr;
            c419910GdJ.LJ = Integer.valueOf(R.attr.a0p);
        } else {
            c419910GdJ = new C419910GdJ();
            c419910GdJ.LIZ = R.raw.icon_speaker_2_fill_ltr;
            c419910GdJ.LJ = Integer.valueOf(R.attr.a0p);
        }
        ((TuxIconView) akS64S0200000_27.l1).setTuxIcon(c419910GdJ);
    }

    public static final void LIZ$18(AkS64S0200000_27 akS64S0200000_27, View view) {
        float fFloatValue;
        float fFloatValue2;
        Pair<Integer, Integer> pair;
        C1834730xqR params;
        HighlightPreviewClipFragment highlightPreviewClipFragment = (HighlightPreviewClipFragment) akS64S0200000_27.l0;
        highlightPreviewClipFragment.LLJJJIL = true;
        C1835920xsM c1835920xsM = highlightPreviewClipFragment.LLJJ;
        if (c1835920xsM != null) {
            fFloatValue = c1835920xsM.getLeftPercentage().invoke().floatValue();
        } else {
            fFloatValue = 0.0f;
        }
        float f = fFloatValue * r1.LLJJIJIL;
        C1835920xsM c1835920xsM2 = ((HighlightPreviewClipFragment) akS64S0200000_27.l0).LLJJ;
        if (c1835920xsM2 != null) {
            fFloatValue2 = c1835920xsM2.getRightPercentage().invoke().floatValue();
        } else {
            fFloatValue2 = 1.0f;
        }
        HighlightPreviewClipFragment highlightPreviewClipFragment2 = (HighlightPreviewClipFragment) akS64S0200000_27.l0;
        float f2 = fFloatValue2 * highlightPreviewClipFragment2.LLJJIJIL;
        if (C426750GoL.LJ((TuxTextView) akS64S0200000_27.l1)) {
            pair = new Pair<>(Integer.valueOf((int) f2), Integer.valueOf((int) f));
        } else {
            pair = new Pair<>(Integer.valueOf((int) f), Integer.valueOf((int) f2));
        }
        highlightPreviewClipFragment2.LLJJJJ = pair;
        C1835970xsR c1835970xsR = ((HighlightPreviewClipFragment) akS64S0200000_27.l0).LLIZLLLIL;
        if (c1835970xsR != null && (params = c1835970xsR.getParams()) != null) {
            params.LJII = true;
        }
        ((HighlightPreviewClipFragment) akS64S0200000_27.l0).OR(false);
        ((HighlightPreviewClipFragment) akS64S0200000_27.l0).UR("done");
    }

    public static final void LIZ$19(AkS64S0200000_27 akS64S0200000_27, View view) {
        if (((C1809420xBc) akS64S0200000_27.l0).LLILLL) {
            ((View.OnClickListener) akS64S0200000_27.l1).onClick(view);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x0148  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LIZ$2(irm.AkS64S0200000_27 r8, android.view.View r9) {
        /*
            Method dump skipped, instruction units count: 344
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: irm.AkS64S0200000_27.LIZ$2(irm.AkS64S0200000_27, android.view.View):void");
    }

    public static final void LIZ$20(AkS64S0200000_27 akS64S0200000_27, View view) {
        C19EG currentActivity = ((SelectedCell) akS64S0200000_27.l0).getCurrentActivity();
        if (currentActivity != null) {
            AssemVMLazy assemVMLazy = ((SelectedCell) akS64S0200000_27.l0).LLIZLLLIL;
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = SelectedCell.LLJ;
            ((TakoPhotoChooseViewModel) assemVMLazy.getValue()).xQ2(currentActivity, ((C1853300yKO) akS64S0200000_27.l1).LL, ((SelectedCell) akS64S0200000_27.l0).getCurrentFragment(), true);
        }
    }

    public static final void LIZ$21(AkS64S0200000_27 akS64S0200000_27, View view) {
        String enterFrom;
        String enterMethod;
        String str;
        String str2;
        String str3;
        String pageSource;
        String mode;
        String modeSource;
        String enterMethod2;
        String enterFrom2;
        String str4;
        String str5;
        Map<String, String> commonMobParams;
        String str6;
        Map<String, String> commonMobParams2;
        Map<String, String> commonMobParams3;
        String quantityString;
        Map<String, String> commonMobParams4;
        Map<String, String> commonMobParams5;
        Map<String, String> commonMobParams6;
        C19EG currentActivity = ((ActionCell) akS64S0200000_27.l0).getCurrentActivity();
        if (currentActivity == null) {
            Fragment currentFragment = ((ActionCell) akS64S0200000_27.l0).getCurrentFragment();
            if (currentFragment != null) {
                currentActivity = currentFragment.getActivity();
            } else {
                currentActivity = null;
            }
        }
        int i = C1853770yL9.LIZ[((C1853560yKo) akS64S0200000_27.l1).LL.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    AssemVMLazy assemVMLazy = ((ActionCell) akS64S0200000_27.l0).LLILZLL;
                    InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = ActionCell.LLIZLLLIL;
                    assemVMLazy.getValue();
                    C449180HjQ.LIZ.getClass();
                    C449180HjQ.LIZIZ(currentActivity);
                    return;
                }
                throw new C1954807lC();
            }
            AssemVMLazy assemVMLazy2 = ((ActionCell) akS64S0200000_27.l0).LLILZLL;
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr2 = ActionCell.LLIZLLLIL;
            TakoPhotoChooseViewModel takoPhotoChooseViewModel = (TakoPhotoChooseViewModel) assemVMLazy2.getValue();
            if (currentActivity == null) {
                return;
            }
            C540190LGn.LIZ(currentActivity, EnumC540140LGi.IMAGE, new AwS393S0200000_27(takoPhotoChooseViewModel, currentActivity, 148));
            return;
        }
        AssemVMLazy assemVMLazy3 = ((ActionCell) akS64S0200000_27.l0).LLILZLL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr3 = ActionCell.LLIZLLLIL;
        TakoPhotoChooseViewModel takoPhotoChooseViewModel2 = (TakoPhotoChooseViewModel) assemVMLazy3.getValue();
        C1862330yYx c1862330yYx = C1862330yYx.LIZ;
        C1853010yJv c1853010yJv = takoPhotoChooseViewModel2.LLJILJIL;
        String str7 = "";
        if (c1853010yJv == null || (enterFrom = c1853010yJv.getEnterFrom()) == null) {
            enterFrom = "";
        }
        C1853010yJv c1853010yJv2 = takoPhotoChooseViewModel2.LLJILJIL;
        if (c1853010yJv2 == null || (enterMethod = c1853010yJv2.getEnterMethod()) == null) {
            enterMethod = "";
        }
        C1853010yJv c1853010yJv3 = takoPhotoChooseViewModel2.LLJILJIL;
        if (c1853010yJv3 == null || (commonMobParams6 = c1853010yJv3.getCommonMobParams()) == null || (str = commonMobParams6.get("process_id")) == null) {
            str = "";
        }
        C1853010yJv c1853010yJv4 = takoPhotoChooseViewModel2.LLJILJIL;
        if (c1853010yJv4 == null || (commonMobParams5 = c1853010yJv4.getCommonMobParams()) == null || (str2 = commonMobParams5.get("tako_session_id")) == null) {
            str2 = "";
        }
        C1853010yJv c1853010yJv5 = takoPhotoChooseViewModel2.LLJILJIL;
        if (c1853010yJv5 == null || (commonMobParams4 = c1853010yJv5.getCommonMobParams()) == null || (str3 = commonMobParams4.get("tako_chat_id")) == null) {
            str3 = "";
        }
        C1853010yJv c1853010yJv6 = takoPhotoChooseViewModel2.LLJILJIL;
        if (c1853010yJv6 == null || (pageSource = c1853010yJv6.getPageSource()) == null) {
            pageSource = "";
        }
        C1853010yJv c1853010yJv7 = takoPhotoChooseViewModel2.LLJILJIL;
        if (c1853010yJv7 != null) {
            mode = c1853010yJv7.getMode();
        } else {
            mode = null;
        }
        C1853010yJv c1853010yJv8 = takoPhotoChooseViewModel2.LLJILJIL;
        if (c1853010yJv8 == null || (modeSource = c1853010yJv8.getModeSource()) == null) {
            modeSource = "";
        }
        C1862330yYx.LJJ(c1862330yYx, enterFrom, enterMethod, str, str2, str3, pageSource, "click_camera", "", null, mode, modeSource, null, null, null, takoPhotoChooseViewModel2.vQ2(true), 47360);
        int size = takoPhotoChooseViewModel2.getState().LLIZ.size() + takoPhotoChooseViewModel2.LLILLJJLI;
        int iIntValue = takoPhotoChooseViewModel2.LLILLL;
        if (iIntValue < 0) {
            iIntValue = ((Number) takoPhotoChooseViewModel2.LLJ.getValue()).intValue();
        }
        if (size >= iIntValue) {
            if (currentActivity == null) {
                return;
            }
            Resources resources = currentActivity.getResources();
            if (resources != null) {
                quantityString = resources.getQuantityString(2131755041, iIntValue, Integer.valueOf(iIntValue));
            } else {
                quantityString = null;
                if (currentActivity == null) {
                    return;
                }
            }
            C1389890mGx c1389890mGx = new C1389890mGx(currentActivity);
            c1389890mGx.LJIIJ(quantityString);
            c1389890mGx.LJIIJJI();
            return;
        }
        C1561230qjJ.LIZ.getClass();
        if (C1561230qjJ.LIZ()) {
            C1853010yJv c1853010yJv9 = takoPhotoChooseViewModel2.LLJILJIL;
            if (c1853010yJv9 == null || (enterMethod2 = c1853010yJv9.getEnterMethod()) == null) {
                enterMethod2 = "";
            }
            C1853010yJv c1853010yJv10 = takoPhotoChooseViewModel2.LLJILJIL;
            if (c1853010yJv10 == null || (enterFrom2 = c1853010yJv10.getEnterFrom()) == null) {
                enterFrom2 = "";
            }
            C1853010yJv c1853010yJv11 = takoPhotoChooseViewModel2.LLJILJIL;
            if (c1853010yJv11 == null || (commonMobParams3 = c1853010yJv11.getCommonMobParams()) == null || (str4 = commonMobParams3.get("process_id")) == null) {
                str4 = "";
            }
            C1853010yJv c1853010yJv12 = takoPhotoChooseViewModel2.LLJILJIL;
            if (c1853010yJv12 == null || (commonMobParams2 = c1853010yJv12.getCommonMobParams()) == null || (str5 = commonMobParams2.get("tako_session_id")) == null) {
                str5 = "";
            }
            C1853010yJv c1853010yJv13 = takoPhotoChooseViewModel2.LLJILJIL;
            if (c1853010yJv13 != null && (commonMobParams = c1853010yJv13.getCommonMobParams()) != null && (str6 = commonMobParams.get("tako_chat_id")) != null) {
                str7 = str6;
            }
            C0OGR c0ogr = new C0OGR(enterFrom2, enterMethod2, str4, str5, str7);
            AwS462S0200000_27 awS462S0200000_27 = new AwS462S0200000_27(takoPhotoChooseViewModel2, currentActivity, 20);
            if (currentActivity == null) {
                return;
            }
            C449180HjQ c449180HjQ = C449180HjQ.LIZ;
            C345300DgG c345300DgG = new C345300DgG(currentActivity, size, true, c0ogr, awS462S0200000_27);
            c449180HjQ.getClass();
            C449180HjQ.LIZLLL(c345300DgG);
            return;
        }
        AwS393S0200000_27 awS393S0200000_27 = new AwS393S0200000_27(takoPhotoChooseViewModel2, currentActivity, 149);
        if (currentActivity == null) {
            return;
        }
        C449180HjQ c449180HjQ2 = C449180HjQ.LIZ;
        AwS396S0200000_30 awS396S0200000_30 = new AwS396S0200000_30(currentActivity, awS393S0200000_27, 0);
        c449180HjQ2.getClass();
        C449180HjQ.LIZLLL(awS396S0200000_30);
    }

    public static final void LIZ$22(AkS64S0200000_27 akS64S0200000_27, View view) {
        ((TemplateCell) akS64S0200000_27.l0).L5().yQ2("click_template", (C1853460yKe) akS64S0200000_27.l1);
    }

    public static final void LIZ$3(AkS64S0200000_27 akS64S0200000_27, View view) {
        Function2<C1854470yMH, Context, Unit> function2;
        C1854470yMH c1854470yMH = ((TakoActionBarSugItemAssem) akS64S0200000_27.l0).LLJLL;
        if (c1854470yMH != null && (function2 = c1854470yMH.LLJIJIL) != null) {
            function2.invoke(c1854470yMH, ((View) akS64S0200000_27.l1).getContext());
        }
    }

    public static final void LIZ$4(AkS64S0200000_27 akS64S0200000_27, View view) {
        String quantityString;
        SquarePhotoCell squarePhotoCell = (SquarePhotoCell) akS64S0200000_27.l0;
        TikTokMediaModel tikTokMediaModel = ((C1853550yKn) akS64S0200000_27.l1).LL;
        squarePhotoCell.getClass();
        if (tikTokMediaModel.selectIndex > 0) {
            AssemVMLazy assemVMLazy = ((SquarePhotoCell) akS64S0200000_27.l0).LLJ;
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = SquarePhotoCell.LLJIJIL;
            TakoMenuWindowViewModel takoMenuWindowViewModel = (TakoMenuWindowViewModel) assemVMLazy.getValue();
            takoMenuWindowViewModel.withState(new AwS393S0200000_27(takoMenuWindowViewModel, ((C1853550yKn) akS64S0200000_27.l1).LL, 100));
            C1862330yYx.LJJZZIII(C1862330yYx.LIZ, ((SquarePhotoCell) akS64S0200000_27.l0).getCommonParams(), "unselect_photo", null, null, 48);
            return;
        }
        AssemVMLazy assemVMLazy2 = ((SquarePhotoCell) akS64S0200000_27.l0).LLJ;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr2 = SquarePhotoCell.LLJIJIL;
        TakoMenuWindowViewModel takoMenuWindowViewModel2 = (TakoMenuWindowViewModel) assemVMLazy2.getValue();
        TikTokMediaModel tikTokMediaModel2 = ((C1853550yKn) akS64S0200000_27.l1).LL;
        C19EG currentActivity = ((SquarePhotoCell) akS64S0200000_27.l0).getCurrentActivity();
        int size = takoMenuWindowViewModel2.getState().LLILZ.size() + takoMenuWindowViewModel2.LLIZLLLIL;
        int iVQ2 = takoMenuWindowViewModel2.LLILLL;
        if (iVQ2 < 0) {
            iVQ2 = takoMenuWindowViewModel2.vQ2();
        }
        if (size >= iVQ2) {
            if (currentActivity != null) {
                Resources resources = currentActivity.getResources();
                if (resources != null) {
                    quantityString = resources.getQuantityString(2131755041, iVQ2, Integer.valueOf(iVQ2));
                } else {
                    quantityString = null;
                    if (currentActivity != null) {
                    }
                }
                C1389890mGx c1389890mGx = new C1389890mGx(currentActivity);
                c1389890mGx.LJIIJ(quantityString);
                c1389890mGx.LJIIJJI();
            }
        } else {
            takoMenuWindowViewModel2.withState(new AwS78S0210000_27(tikTokMediaModel2, false, takoMenuWindowViewModel2, 6));
        }
        C1862330yYx.LJJZZIII(C1862330yYx.LIZ, ((SquarePhotoCell) akS64S0200000_27.l0).getCommonParams(), "select_photo", null, null, 48);
    }

    public static final void LIZ$5(AkS64S0200000_27 akS64S0200000_27, View view) {
        C19EG currentActivity = ((SquarePhotoCell) akS64S0200000_27.l0).getCurrentActivity();
        if (currentActivity != null) {
            AssemVMLazy assemVMLazy = ((SquarePhotoCell) akS64S0200000_27.l0).LLJI;
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = SquarePhotoCell.LLJIJIL;
            ((TakoPhotoChooseViewModel) assemVMLazy.getValue()).xQ2(currentActivity, ((C1853550yKn) akS64S0200000_27.l1).LL, ((SquarePhotoCell) akS64S0200000_27.l0).getCurrentFragment(), false);
            ((SquarePhotoCell) akS64S0200000_27.l0).LLJI.getValue().setState(AFwS269S0000000_27.get$arr$(479));
            C1862330yYx.LJJZZIII(C1862330yYx.LIZ, ((SquarePhotoCell) akS64S0200000_27.l0).getCommonParams(), "click_photo", null, null, 48);
        }
    }

    public static final void LIZ$6(AkS64S0200000_27 akS64S0200000_27, View view) {
        C1862680yZW.LIZ(C1558360qeg.LJ((View) akS64S0200000_27.l0, null), new AwS428S0200000_27((C1863240yaQ) akS64S0200000_27.l1, (View) akS64S0200000_27.l0, 35));
        C1862680yZW.LIZLLL(C1558360qeg.LJ((View) akS64S0200000_27.l0, null));
    }

    public static final void LIZ$7(AkS64S0200000_27 akS64S0200000_27, View view) {
        C1863850ybP c1863850ybP;
        boolean z;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        Long lValueOf;
        TakoFeedbackAbility takoFeedbackAbility;
        String str6;
        C13LC<C1863850ybP> c13lcT71;
        ((C1863240yaQ) akS64S0200000_27.l0).LJJIFFI("click_setting");
        Context context = ((View) akS64S0200000_27.l1).getContext();
        InterfaceC665370Q7z interfaceC665370Q7zLJ = C1558360qeg.LJ((View) akS64S0200000_27.l1, null);
        View view2 = (View) akS64S0200000_27.l1;
        ITakoContextAbility iTakoContextAbility = (ITakoContextAbility) C1558520qew.LIZ(interfaceC665370Q7zLJ, ITakoContextAbility.class, null);
        if (iTakoContextAbility != null && (c13lcT71 = iTakoContextAbility.T71()) != null) {
            c1863850ybP = (C1863850ybP) c13lcT71.LIZIZ();
        } else {
            c1863850ybP = null;
        }
        if (iTakoContextAbility != null && iTakoContextAbility.isTako()) {
            z = true;
        } else {
            z = false;
        }
        Pair[] pairArr = new Pair[7];
        if (c1863850ybP != null) {
            str = c1863850ybP.LL;
        } else {
            str = null;
        }
        String str7 = "";
        if (str == null) {
            str = "";
        }
        pairArr[0] = new Pair("enter_from", str);
        if (c1863850ybP == null || (str2 = c1863850ybP.LLILLJJLI) == null) {
            str2 = "";
        }
        pairArr[1] = new Pair("enter_method", str2);
        if (c1863850ybP == null || (str3 = c1863850ybP.LLILZLL) == null) {
            str3 = "";
        }
        pairArr[2] = new Pair("tako_session_id", str3);
        if (c1863850ybP == null || (str4 = c1863850ybP.LLIZ) == null) {
            str4 = "";
        }
        pairArr[3] = new Pair("tako_chat_id", str4);
        if (c1863850ybP == null || (str5 = c1863850ybP.LLILZIL) == null) {
            str5 = "";
        }
        pairArr[4] = new Pair("process_id", str5);
        if (c1863850ybP != null && (str6 = c1863850ybP.LLILLL) != null) {
            str7 = str6;
        }
        pairArr[5] = new Pair("search_id", str7);
        if (c1863850ybP != null) {
            lValueOf = Long.valueOf(c1863850ybP.LLJJ);
        } else {
            lValueOf = null;
        }
        pairArr[6] = new Pair("bot_id", String.valueOf(lValueOf));
        HashMap mapLJI = C2097608Jq.LJI(pairArr);
        C1862330yYx.LJJIJL(C1862330yYx.LIZ, mapLJI);
        if (z && C07G2.LIZ()) {
            if (context != null) {
                C1864020ybg.LJIIIZ(context, C2097608Jq.LJ(), mapLJI);
            }
        } else {
            if (view2 == null || (takoFeedbackAbility = (TakoFeedbackAbility) C1558520qew.LIZ(interfaceC665370Q7zLJ, TakoFeedbackAbility.class, null)) == null) {
                return;
            }
            takoFeedbackAbility.BD2(view2, mapLJI, z);
        }
    }

    public static final void LIZ$8(AkS64S0200000_27 akS64S0200000_27, View view) {
        String strIsCameraShow;
        String strIsCover;
        FragmentManager fragmentManagerLIZIZ;
        String strLIZJ;
        FragmentManager fragmentManagerLIZIZ2;
        String str = "";
        if (C724240Sb0.LIZ((BottomSelectedMediaAssem) akS64S0200000_27.l0) instanceof TakoGalleryPickerActivity) {
            if (((BottomSelectedMediaAssem) akS64S0200000_27.l0).mp() && (fragmentManagerLIZIZ2 = C20230914Dz.LIZIZ(C724240Sb0.LJI((BottomSelectedMediaAssem) akS64S0200000_27.l0), C724240Sb0.LIZ((BottomSelectedMediaAssem) akS64S0200000_27.l0))) != null) {
                fragmentManagerLIZIZ2.LJLLILLLL();
            }
            TakoGalleryPickerActivity takoGalleryPickerActivity = (TakoGalleryPickerActivity) C724240Sb0.LIZ((BottomSelectedMediaAssem) akS64S0200000_27.l0);
            if (!takoGalleryPickerActivity.isFinishing() && !takoGalleryPickerActivity.LLILZLL) {
                List<TikTokMediaModel> list = takoGalleryPickerActivity.LLLLZLL().getState().LLIZ;
                if (!list.isEmpty()) {
                    ArrayList arrayList = new ArrayList();
                    for (TikTokMediaModel tikTokMediaModel : list) {
                        String strLJFF = tikTokMediaModel.LJFF();
                        if ((strLJFF == null || (strLIZJ = C20189513zB.LIZJ(takoGalleryPickerActivity, strLJFF)) == null) && (strLIZJ = tikTokMediaModel.absolutePath) == null) {
                            strLIZJ = "";
                        }
                        if (strLIZJ.length() > 0) {
                            arrayList.add(new C1853170yKB(0, strLIZJ));
                        }
                    }
                    if (!arrayList.isEmpty()) {
                        takoGalleryPickerActivity.LLLLZI(null, arrayList);
                        return;
                    }
                    return;
                }
                return;
            }
            return;
        }
        if (((BottomSelectedMediaAssem) akS64S0200000_27.l0).lp().xQ2()) {
            TemplateListViewModel templateListViewModelLp = ((BottomSelectedMediaAssem) akS64S0200000_27.l0).lp();
            Context context = ((C197039127h) akS64S0200000_27.l1).getContext();
            if (templateListViewModelLp.LLILZIL) {
                templateListViewModelLp.setState(new AwS393S0200000_27(templateListViewModelLp, context, 172));
                return;
            } else {
                templateListViewModelLp.withState(new AwS393S0200000_27(templateListViewModelLp, context, 173));
                return;
            }
        }
        C1855770yON.LIZ.getClass();
        if (C1855770yON.LIZIZ()) {
            ((BottomSelectedMediaAssem) akS64S0200000_27.l0).lp().setState(new AwS133S0101000_27(((BottomSelectedMediaAssem) akS64S0200000_27.l0).kp().LLILZ, (int) ((BottomSelectedMediaAssem) akS64S0200000_27.l0).lp().LL, (List<TikTokMediaModel>) 6));
            if (((BottomSelectedMediaAssem) akS64S0200000_27.l0).ip().LL) {
                TakoRecordFragmentViewModel takoRecordFragmentViewModelIp = ((BottomSelectedMediaAssem) akS64S0200000_27.l0).ip();
                List<TikTokMediaModel> list2 = ((BottomSelectedMediaAssem) akS64S0200000_27.l0).lp().LL;
                ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(list2, 10));
                Iterator it2 = ((ArrayList) list2).iterator();
                while (it2.hasNext()) {
                    arrayList2.add(UriProtector.parse(((MediaModel) it2.next()).originLocalUriPath));
                }
                ArrayList arrayList3 = new ArrayList(arrayList2);
                takoRecordFragmentViewModelIp.LLIZ = true;
                if (takoRecordFragmentViewModelIp.LL) {
                    takoRecordFragmentViewModelIp.setState(new AwS588S0100000_9(arrayList3, (List<InterfaceC1891350zJl>) 632));
                }
            }
            if (((BottomSelectedMediaAssem) akS64S0200000_27.l0).hp().LL) {
                TakoImageCreateFragmentViewModel takoImageCreateFragmentViewModelHp = ((BottomSelectedMediaAssem) akS64S0200000_27.l0).hp();
                List<TikTokMediaModel> list3 = ((BottomSelectedMediaAssem) akS64S0200000_27.l0).lp().LL;
                ArrayList arrayList4 = new ArrayList(C15438062q.LJIJJ(list3, 10));
                Iterator it3 = ((ArrayList) list3).iterator();
                while (it3.hasNext()) {
                    arrayList4.add(UriProtector.parse(((MediaModel) it3.next()).originLocalUriPath));
                }
                ArrayList arrayList5 = new ArrayList(arrayList4);
                if (takoImageCreateFragmentViewModelHp.LL) {
                    takoImageCreateFragmentViewModelHp.setState(new AwS588S0100000_9(arrayList5, (List<InterfaceC1891350zJl>) 686));
                }
            }
            if (((BottomSelectedMediaAssem) akS64S0200000_27.l0).mp() && (fragmentManagerLIZIZ = C20230914Dz.LIZIZ(C724240Sb0.LJI((BottomSelectedMediaAssem) akS64S0200000_27.l0), C724240Sb0.LIZ((BottomSelectedMediaAssem) akS64S0200000_27.l0))) != null) {
                fragmentManagerLIZIZ.LJLLILLLL();
            }
            C1862330yYx c1862330yYx = C1862330yYx.LIZ;
            String str2 = ((BottomSelectedMediaAssem) akS64S0200000_27.l0).getCommonParams().get("enter_from");
            if (str2 == null) {
                str2 = "";
            }
            String str3 = ((BottomSelectedMediaAssem) akS64S0200000_27.l0).getCommonParams().get("enter_method");
            if (str3 == null) {
                str3 = "";
            }
            String str4 = ((BottomSelectedMediaAssem) akS64S0200000_27.l0).getCommonParams().get("process_id");
            if (str4 == null) {
                str4 = "";
            }
            String str5 = ((BottomSelectedMediaAssem) akS64S0200000_27.l0).getCommonParams().get("tako_session_id");
            if (str5 == null) {
                str5 = "";
            }
            String str6 = ((BottomSelectedMediaAssem) akS64S0200000_27.l0).getCommonParams().get("tako_chat_id");
            if (str6 != null) {
                str = str6;
            }
            Pair[] pairArr = new Pair[2];
            C1853010yJv c1853010yJv = (C1853010yJv) ((BottomSelectedMediaAssem) akS64S0200000_27.l0).LLJLILLLLZIIL.getValue();
            String str7 = CardStruct.IStatusCode.DEFAULT;
            if (c1853010yJv == null || (strIsCameraShow = c1853010yJv.isCameraShow()) == null) {
                strIsCameraShow = CardStruct.IStatusCode.DEFAULT;
            }
            pairArr[0] = new Pair("is_camera_show", strIsCameraShow);
            C1853010yJv c1853010yJv2 = (C1853010yJv) ((BottomSelectedMediaAssem) akS64S0200000_27.l0).LLJLILLLLZIIL.getValue();
            if (c1853010yJv2 != null && (strIsCover = c1853010yJv2.isCover()) != null) {
                str7 = strIsCover;
            }
            pairArr[1] = new Pair("is_cover", str7);
            C1862330yYx.LJJ(c1862330yYx, str2, str3, str4, str5, str, "template_generate_image", "click_next", null, null, null, null, null, null, null, C2097608Jq.LJIIIIZZ(pairArr), 49024);
        }
    }

    public static final void LIZ$9(AkS64S0200000_27 akS64S0200000_27, View view) {
        TemplateListViewModel templateListViewModelLp = ((BottomSelectedMediaAssem) akS64S0200000_27.l0).lp();
        Context context = ((C197039127h) akS64S0200000_27.l1).getContext();
        if (templateListViewModelLp.LLILZIL) {
            templateListViewModelLp.setState(new AwS393S0200000_27(templateListViewModelLp, context, 174));
        } else {
            templateListViewModelLp.withState(new AwS393S0200000_27(templateListViewModelLp, context, 175));
        }
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public AkS64S0200000_27(com.ss.android.ugc.aweme.tako.multipletemplate.gallery.PhotoCell r2, X.C1853550yKn r3, int r4) {
        /*
            r1 = this;
            r1.$t = r4
            int r4 = 10 - r4
            if (r4 == 0) goto Lf
            r0 = r1
            r0.l0 = r2
            r0.l1 = r3
        Lb:
            r0.<init>()
            return
        Lf:
            r0 = r1
            r0.l0 = r3
            r0.l1 = r2
            goto Lb
        */
        throw new UnsupportedOperationException("Method not decompiled: irm.AkS64S0200000_27.<init>(com.ss.android.ugc.aweme.tako.multipletemplate.gallery.PhotoCell, X.0yKn, int):void");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AkS64S0200000_27(View view, C1863240yaQ c1863240yaQ, int i) {
        super(1500L);
        this.$t = i;
        this.l0 = view;
        this.l1 = c1863240yaQ;
    }

    public AkS64S0200000_27(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }
}
