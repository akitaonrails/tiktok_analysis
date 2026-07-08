package kotlin.jvm.internal;

import X.AbstractC1387200mCc;
import X.AbstractC776930Udn;
import X.AbstractC848400XPy;
import X.C013C;
import X.C01GW;
import X.C01QD;
import X.C09AY;
import X.C0CX1;
import X.C0IJT;
import X.C0KAJ;
import X.C0U0Q;
import X.C0U17;
import X.C0U22;
import X.C0U2X;
import X.C0U3O;
import X.C0U3P;
import X.C0U3Q;
import X.C0U45;
import X.C0U5B;
import X.C0U5F;
import X.C0UA2;
import X.C0UDL;
import X.C0UDM;
import X.C0UFE;
import X.C0UIM;
import X.C0UK7;
import X.C0UNT;
import X.C0UNW;
import X.C0UOI;
import X.C0UP6;
import X.C0UPF;
import X.C0UPI;
import X.C0UTJ;
import X.C0UVW;
import X.C0UX6;
import X.C0XQ7;
import X.C1102070emj;
import X.C1107460evQ;
import X.C1107850ew3;
import X.C1116210f9X;
import X.C1161920gLG;
import X.C118300cf;
import X.C11NZ;
import X.C11S5;
import X.C1390920mIc;
import X.C1395020mPE;
import X.C1397510mTF;
import X.C1397580mTM;
import X.C1397620mTQ;
import X.C1397630mTR;
import X.C1397660mTU;
import X.C162100jj;
import X.C16F5;
import X.C16FS;
import X.C1701940uOG;
import X.C1906580ziK;
import X.C198900pf;
import X.C20355014km;
import X.C20441214yg;
import X.C20484615Do;
import X.C20656615sK;
import X.C20684815ws;
import X.C20743716Ff;
import X.C2097908Jt;
import X.C2188811AlT;
import X.C2344009Gk;
import X.C340190DVh;
import X.C474500IjA;
import X.C500260Jjc;
import X.C748880TZe;
import X.C754670Tiz;
import X.C760180Trs;
import X.C761740TuO;
import X.C762500Tvc;
import X.C762510Tvd;
import X.C762520Tve;
import X.C763230Twn;
import X.C766200U3u;
import X.C766210U3v;
import X.C766220U3w;
import X.C770370UJv;
import X.C772900UTo;
import X.C779530Uhz;
import X.C781230Ukj;
import X.C781270Ukn;
import X.C786410Ut5;
import X.C915190ZvJ;
import X.C923760a98;
import X.C985403tE;
import X.DialogInterfaceOnDismissListenerC786080UsY;
import X.EnumC1102750enp;
import X.EnumC20429314wl;
import X.EnumC20429414wm;
import X.EnumC746940TRs;
import X.EnumC754690Tj1;
import X.EnumC764770TzH;
import X.InterfaceC1088880eRS;
import X.InterfaceC1103130eoR;
import X.InterfaceC20673515v3;
import X.InterfaceC754470Tif;
import X.InterfaceC761540Tu4;
import X.InterfaceC772390URp;
import X.InterfaceC779960Uig;
import Y.AfS32S0210000_12;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Property;
import android.view.View;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.LifecycleOwner;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.DismissPreviewSettingDialogEvent;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.UrlModel;
import com.bytedance.android.live.broadcast.api.IBroadcastService;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.android.live.effect.api.soundeffect.SoundEffect;
import com.bytedance.android.live.effect.karaoke.fragments.KaraokeSongListFragment;
import com.bytedance.android.live.effect.karaoke.viewmodels.KaraokeViewModel;
import com.bytedance.android.live.effect.sticker.data.StickerEffectViewModel;
import com.bytedance.android.live.liveinteract.multiguestv3.AigcWallpaperStatus;
import com.bytedance.android.live.toolbar.IToolbarService;
import com.bytedance.android.live.uikit.reddot.RedDotExtensionKt;
import com.bytedance.android.livesdk.adminsetting.LiveAdminSettingGuideAdapter;
import com.bytedance.android.livesdk.api.BroadcastRoomApi;
import com.bytedance.android.livesdk.broadcast.preview.widget.setting.BasePreviewSettingMainFragmentSheetInitializer;
import com.bytedance.android.livesdk.broadcast.preview.widget.setting.LiveLocationScopeSettingSheet;
import com.bytedance.android.livesdk.chatroom.model.LatestBanRecordInfo;
import com.bytedance.android.livesdk.dataChannel.BGMDismissVolumeBarEvent;
import com.bytedance.android.livesdk.game.gamelist.GameTopicListAssem;
import com.bytedance.android.livesdk.interaction.LiveInteractionFeaturesFragment;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.android.livesdk.livesetting.subscription.LiveSubscriptionQuestionnaireHourFrequencySetting;
import com.bytedance.android.livesdk.model.GameTag;
import com.bytedance.android.livesdk.model.Hashtag;
import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.keva.Keva;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import com.ss.android.ugc.aweme.comment.model.Comment;
import com.ss.android.ugc.aweme.comment.model.CommentRethinkPopup;
import com.ss.android.ugc.aweme.commentv2.commentlist.viewmodel.CommentPublishViewModel;
import com.ss.android.ugc.aweme.commerce.tools.music.viewmodel.CommerceMusicLegalViewModel;
import com.ss.android.ugc.aweme.compliance.api.model.CopyWritingInfo;
import com.ss.android.ugc.aweme.rss.link.models.RssLinkParam;
import com.ss.android.ugc.aweme.rss.link.ui.RssIntroAssem;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.ss.android.ugc.effectmanager.common.ConcurrentHashSet;
import com.tts.oecverify.BdTuring;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import tikcast.api.anchor.ReminderWordUpdateStatusRequest;
import tikcast.api.anchor.ReminderWordUpdateStatusResponse;
import webcast.data.AboveGoLiveButtonComponent;
import webcast.data.AnchorReminderWordStatus;
import webcast.data.MusicSong;
import webcast.data.multi_guest_play.Playbook;

/* JADX INFO: loaded from: classes13.dex */
public class AwS221S0300000_12 extends C09AY implements Function1 {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj);
            case 1:
                return invoke$1(this, obj);
            case 2:
                return invoke$2(this, obj);
            case 3:
                return invoke$3(this, obj);
            case 4:
                return invoke$4(this, obj);
            case 5:
                return invoke$5(this, obj);
            case 6:
                return invoke$6(this, obj);
            case 7:
                return invoke$7(this, obj);
            case 8:
                return invoke$8(this, obj);
            case BdTuring.TYPE_ECAF /* 9 */:
                return invoke$9(this, obj);
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                return invoke$10(this, obj);
            case BdTuring.TYPE_EMAIL /* 11 */:
                return invoke$11(this, obj);
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                return invoke$12(this, obj);
            case BdTuring.TYPE_SMS_VOICE /* 13 */:
                return invoke$13(this, obj);
            case 14:
                return invoke$14(this, obj);
            case 15:
                return invoke$15(this, obj);
            case 16:
                return invoke$16(this, obj);
            case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                return invoke$17(this, obj);
            case LiveToolbarIconStyleSetting.COLORFUL_WITH_TEXT /* 18 */:
                return invoke$18(this, obj);
            case 19:
                return invoke$19(this, obj);
            case LiveToolbarIconStyleSetting.HIGHLIGHT_WITH_TEXT /* 20 */:
                return invoke$20(this, obj);
            case 21:
                return invoke$21(this, obj);
            case 22:
                return invoke$22(this, obj);
            case 23:
                return invoke$23(this, obj);
            case LiveSubscriptionQuestionnaireHourFrequencySetting.DEFAULT /* 24 */:
                return invoke$24(this, obj);
            case 25:
                return invoke$25(this, obj);
            case 26:
                return invoke$26(this, obj);
            case 27:
                return invoke$27(this, obj);
            case 28:
                return invoke$28(this, obj);
            case 29:
                return invoke$29(this, obj);
            case 30:
                return invoke$30(this, obj);
            case 31:
                return invoke$31(this, obj);
            case 32:
                return invoke$32(this, obj);
            case LiveToolbarIconStyleSetting.GRAY_WITHOUT_TEXT /* 33 */:
                return invoke$33(this, obj);
            case LiveToolbarIconStyleSetting.COLORFUL_WITHOUT_TEXT /* 34 */:
                return invoke$34(this, obj);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS221S0300000_12 awS221S0300000_12, Object obj) {
        ((LiveAdminSettingGuideAdapter) awS221S0300000_12.l0).LJFF((View) awS221S0300000_12.l1, (View) awS221S0300000_12.l2);
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS221S0300000_12 awS221S0300000_12, Object obj) {
        boolean zIsChecked = ((C20743716Ff) awS221S0300000_12.l0).isChecked();
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_anchor_manager_cues_switch_click");
        c474500IjALIZ.LJIJJLI(((LiveAdminSettingGuideAdapter) awS221S0300000_12.l1).LLILLJJLI);
        c474500IjALIZ.LJJII("live_take_setting", "event_page");
        boolean z = !zIsChecked;
        c474500IjALIZ.LJJII(Integer.valueOf(C500260Jjc.LJJJI(Boolean.valueOf(z)) ? 1 : 0), "action_type");
        c474500IjALIZ.LIZ();
        IBroadcastService iBroadcastService = (IBroadcastService) C1161920gLG.LIZJ(IBroadcastService.class);
        ReminderWordUpdateStatusRequest reminderWordUpdateStatusRequest = new ReminderWordUpdateStatusRequest();
        reminderWordUpdateStatusRequest.scene = ((AnchorReminderWordStatus) awS221S0300000_12.l2).scene;
        reminderWordUpdateStatusRequest.status = C500260Jjc.LJJJI(Boolean.valueOf(z)) ? 1 : 0;
        C11NZ<ReminderWordUpdateStatusResponse> c11nzUpdateReminderWordStatus = iBroadcastService.updateReminderWordStatus(reminderWordUpdateStatusRequest);
        if (c11nzUpdateReminderWordStatus != null) {
            c11nzUpdateReminderWordStatus.LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLJLI(new AfS32S0210000_12((C20743716Ff) awS221S0300000_12.l0, (AnchorReminderWordStatus) awS221S0300000_12.l2, zIsChecked, 0));
        }
        return Unit.LIZ;
    }

    public static final Object invoke$10(AwS221S0300000_12 awS221S0300000_12, Object obj) {
        AbstractC1387200mCc abstractC1387200mCcLIZIZ;
        Activity activityLIZIZ;
        if (((CommentRethinkPopup) awS221S0300000_12.l0) != null && (abstractC1387200mCcLIZIZ = C1906580ziK.LIZIZ()) != null && (activityLIZIZ = abstractC1387200mCcLIZIZ.LIZIZ()) != null) {
            CommentRethinkPopup commentRethinkPopup = (CommentRethinkPopup) awS221S0300000_12.l0;
            Comment comment = (Comment) awS221S0300000_12.l1;
            CommentPublishViewModel commentPublishViewModel = (CommentPublishViewModel) awS221S0300000_12.l2;
            try {
                C1397580mTM c1397580mTM = new C1397580mTM(activityLIZIZ);
                c1397580mTM.LJIIIZ = new C340190DVh(activityLIZIZ, R.raw.icon_info_circle, (Integer) null, 12);
                c1397580mTM.LJI(commentRethinkPopup.getTitle());
                c1397580mTM.LIZIZ(commentRethinkPopup.getBody());
                C985403tE.LIZ(c1397580mTM, new AwS378S0200000_12(comment, commentPublishViewModel, 39));
                new C1397510mTF(c1397580mTM).LIZLLL();
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        return Unit.LIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0058  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$11(kotlin.jvm.internal.AwS221S0300000_12 r7, java.lang.Object r8) {
        /*
            com.bytedance.android.livesdk.livesetting.linkmic.LinkMicPlaybookUGCAISetting r0 = com.bytedance.android.livesdk.livesetting.linkmic.LinkMicPlaybookUGCAISetting.INSTANCE
            boolean r0 = r0.isEnable()
            if (r0 == 0) goto L60
            java.lang.Object r6 = r7.l0
            X.0UPF r6 = (X.C0UPF) r6
            webcast.data.multi_guest_play.Playbook r0 = r6.LJIIJJI
            if (r0 == 0) goto L60
            int r1 = r0.playbookType
            r0 = 3
            if (r1 != r0) goto L60
            java.lang.Object r2 = r7.l1
            com.bytedance.ies.sdk.datachannel.DataChannel r2 = (com.bytedance.ies.sdk.datachannel.DataChannel) r2
            kotlin.jvm.internal.AwS256S0300000_12 r5 = new kotlin.jvm.internal.AwS256S0300000_12
            java.lang.Object r1 = r7.l2
            X.0UP6 r1 = (X.C0UP6) r1
            r0 = 4
            r5.<init>(r1, r6, r2, r0)
            X.11NJ r0 = r6.LJIIL
            if (r0 == 0) goto L2a
            r0.dispose()
        L2a:
            X.11NJ r0 = new X.11NJ
            r0.<init>()
            r6.LJIIL = r0
            java.lang.String r4 = "PlayBookViewModel"
            java.lang.String r0 = "publishAIPlaybook"
            X.C20441214yg.LIZIZ(r4, r0)
            webcast.data.multi_guest_play.Playbook r3 = r6.LJIIJJI
            if (r3 == 0) goto L58
            java.lang.Class<com.bytedance.android.live.liveinteract.api.IInteractService> r0 = com.bytedance.android.live.liveinteract.api.IInteractService.class
            X.006A r0 = X.C1161920gLG.LIZJ(r0)
            com.bytedance.android.live.liveinteract.api.IInteractService r0 = (com.bytedance.android.live.liveinteract.api.IInteractService) r0
            X.0UTJ r2 = r0.Pl1(r2)
            if (r2 == 0) goto L58
            X.0UPH r1 = new X.0UPH
            r1.<init>()
            X.11NJ r0 = r6.LJIIL
            r2.LJI(r3, r1, r0)
            kotlin.Unit r0 = kotlin.Unit.LIZ
            if (r0 != 0) goto L5d
        L58:
            java.lang.String r0 = "RePublishAIPlaybook error, playbook==null"
            X.C20441214yg.LJ(r4, r0)
        L5d:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L60:
            java.lang.Object r2 = r7.l0
            X.0UPF r2 = (X.C0UPF) r2
            java.lang.Object r0 = r7.l2
            X.0UP6 r0 = (X.C0UP6) r0
            java.lang.String r1 = r0.LIZJ
            java.lang.Object r0 = r7.l1
            com.bytedance.ies.sdk.datachannel.DataChannel r0 = (com.bytedance.ies.sdk.datachannel.DataChannel) r0
            r2.LIZLLL(r0, r1)
            goto L5d
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS221S0300000_12.invoke$11(kotlin.jvm.internal.AwS221S0300000_12, java.lang.Object):java.lang.Object");
    }

    public static final Object invoke$12(AwS221S0300000_12 awS221S0300000_12, Object obj) {
        C0UTJ c0utjPl1 = C781270Ukn.LJIILJJIL().Pl1((DataChannel) awS221S0300000_12.l0);
        Long lValueOf = null;
        if (c0utjPl1 != null) {
            c0utjPl1.LJIL(EnumC20429414wm.DETAIL, "fyp_go_live_button", null);
        }
        C0UPF c0upf = (C0UPF) awS221S0300000_12.l1;
        C0UP6 c0up6 = (C0UP6) awS221S0300000_12.l2;
        DataChannel dataChannel = (DataChannel) awS221S0300000_12.l0;
        c0upf.getClass();
        C20441214yg.LIZIZ("PlayBookViewModel", "viewMorePlaybooks");
        C772900UTo c772900UTo = c0upf.LJ;
        if (c772900UTo != null) {
            Playbook playbook = c0upf.LJIIJJI;
            if (playbook != null) {
                lValueOf = Long.valueOf(playbook.playbookId);
            }
            c772900UTo.LIZIZ(String.valueOf(lValueOf), "view_more");
        }
        C0UTJ c0utjPl12 = C781270Ukn.LJIILJJIL().Pl1(dataChannel);
        if (c0utjPl12 != null) {
            c0utjPl12.LIZ(new C0UPI(EnumC20429414wm.GO_LIVE_ANCHOR_LIST, c0up6.LIZLLL, new AwS556S0100000_12(c0upf, 699), new AwS221S0300000_12(c0up6, c0upf, dataChannel, 14), new AwS591S0100000_12(c0upf, 683), new AwS591S0100000_12(c0upf, 684), new AwS591S0100000_12(c0upf, 685), AFwS245S0000000_12.get$arr$(105), AFwS245S0000000_12.get$arr$(106), new AwS378S0200000_12(c0upf, dataChannel, 41)));
        }
        return Unit.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$13(AwS221S0300000_12 awS221S0300000_12, Object obj) {
        String str;
        String str2;
        String str3;
        Context context = (Context) obj;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("createCustomFooterView, effectId: ");
        sbLIZ.append((C0UP6) awS221S0300000_12.l0);
        sbLIZ.append(".effectId, goLive: ");
        C0UOI c0uoi = ((C0UP6) awS221S0300000_12.l0).LIZIZ;
        String str4 = null;
        if (c0uoi != null) {
            str = c0uoi.LIZIZ;
        } else {
            str = null;
        }
        sbLIZ.append(str);
        sbLIZ.append(", viewMore: ");
        C0UOI c0uoi2 = ((C0UP6) awS221S0300000_12.l0).LIZIZ;
        if (c0uoi2 != null) {
            str2 = c0uoi2.LIZJ;
        } else {
            str2 = null;
        }
        sbLIZ.append(str2);
        C20441214yg.LIZIZ("PlayBookViewModel", C2188811AlT.LIZIZ(sbLIZ));
        View viewSd = C786410Ut5.Sd(R.layout.hgl, C786410Ut5.ne(context), null);
        C0UP6 c0up6 = (C0UP6) awS221S0300000_12.l0;
        C0UPF c0upf = (C0UPF) awS221S0300000_12.l1;
        DataChannel dataChannel = (DataChannel) awS221S0300000_12.l2;
        C16FS c16fs = (C16FS) viewSd.findViewById(R.id.j3d);
        C0UOI c0uoi3 = c0up6.LIZIZ;
        if (c0uoi3 != null) {
            str3 = c0uoi3.LIZIZ;
        } else {
            str3 = null;
        }
        c16fs.setText(str3);
        C500260Jjc.LJLIIIL(500L, c16fs, new AwS221S0300000_12(c0up6, c0upf, dataChannel, 11));
        C16FS c16fs2 = (C16FS) viewSd.findViewById(R.id.view_more_playbooks);
        C0UOI c0uoi4 = c0up6.LIZIZ;
        if (c0uoi4 != null) {
            str4 = c0uoi4.LIZJ;
        }
        c16fs2.setText(str4);
        C500260Jjc.LJLIIIL(500L, c16fs2, new AwS221S0300000_12(c0up6, c0upf, dataChannel, 12));
        return viewSd;
    }

    public static final Object invoke$14(AwS221S0300000_12 awS221S0300000_12, Object obj) {
        C0UTJ c0utjPl1;
        if (((Number) obj).intValue() == 4 && (c0utjPl1 = C781270Ukn.LJIILJJIL().Pl1((DataChannel) awS221S0300000_12.l0)) != null) {
            c0utjPl1.LJJIFFI(((C0UPF) awS221S0300000_12.l1).LIZIZ((C0UP6) awS221S0300000_12.l2, (DataChannel) awS221S0300000_12.l0), "fyp_go_live_button", new C915190ZvJ("fyp_go_live_button", false, 6), EnumC20429314wl.INTERACT, false);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$15(AwS221S0300000_12 awS221S0300000_12, Object obj) {
        C1390920mIc c1390920mIc = (C1390920mIc) awS221S0300000_12.l0;
        DialogInterfaceOnDismissListenerC786080UsY dialogInterfaceOnDismissListenerC786080UsY = new DialogInterfaceOnDismissListenerC786080UsY((C20656615sK) obj, 20);
        TuxSheet tuxSheet = c1390920mIc.LIZ;
        tuxSheet.LLILLJJLI = dialogInterfaceOnDismissListenerC786080UsY;
        ((RssIntroAssem) awS221S0300000_12.l1).LLJJI = tuxSheet;
        tuxSheet.show((FragmentManager) awS221S0300000_12.l2, "RssIntroAssem");
        C1395020mPE c1395020mPE = C1395020mPE.LIZ;
        String enterFrom = ((RssLinkParam) ((RssIntroAssem) awS221S0300000_12.l1).LLJIJIL.getValue()).getEnterFrom();
        c1395020mPE.getClass();
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_from", enterFrom);
        C20684815ws.LJIILLIIL("show_new_rss_bottom_sheet", c2344009Gk.LIZ);
        C0CX1.LIZ.getClass();
        String curUserId = ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId();
        Keva keva = C0CX1.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("article_mode_intro_shown|");
        sbLIZ.append(curUserId);
        keva.storeBoolean(C2188811AlT.LIZIZ(sbLIZ), true);
        return Unit.LIZ;
    }

    public static final Object invoke$16(AwS221S0300000_12 awS221S0300000_12, Object obj) {
        Room roomLIZ;
        C0UFE c0ufe = (C0UFE) obj;
        ((C0UDM) awS221S0300000_12.l0).LLILZIL = c0ufe;
        if (c0ufe == C0UFE.OFF && (roomLIZ = C162100jj.LIZ((DataChannel) awS221S0300000_12.l1)) != null && roomLIZ.cppVersion == 1) {
            ((InterfaceC1103130eoR) awS221S0300000_12.l2).setAlpha(0.34f);
        } else {
            C500260Jjc.LJLJLJ(((C0UDM) awS221S0300000_12.l0).LLILLJJLI, false);
            ((InterfaceC1103130eoR) awS221S0300000_12.l2).setAlpha(1.0f);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$17(AwS221S0300000_12 awS221S0300000_12, Object obj) {
        DataChannel dataChannel;
        FragmentManager fragmentManager;
        String str;
        DataChannel dataChannel2 = ((BasePreviewSettingMainFragmentSheetInitializer) awS221S0300000_12.l0).LLILLJJLI;
        if (dataChannel2 != null) {
            dataChannel2.FQ2(DismissPreviewSettingDialogEvent.class);
        }
        C754670Tiz c754670Tiz = EnumC754690Tj1.Companion;
        LiveMode liveMode = (LiveMode) awS221S0300000_12.l1;
        c754670Tiz.getClass();
        final EnumC754690Tj1 enumC754690Tj1LIZ = C754670Tiz.LIZ(liveMode);
        if (enumC754690Tj1LIZ != null && (dataChannel = ((BasePreviewSettingMainFragmentSheetInitializer) awS221S0300000_12.l0).LLILLJJLI) != null && (fragmentManager = (FragmentManager) dataChannel.gg0(C748880TZe.class)) != null) {
            final LiveMode liveMode2 = (LiveMode) awS221S0300000_12.l1;
            final BasePreviewSettingMainFragmentSheetInitializer basePreviewSettingMainFragmentSheetInitializer = (BasePreviewSettingMainFragmentSheetInitializer) awS221S0300000_12.l0;
            final C16F5 c16f5 = (C16F5) awS221S0300000_12.l2;
            C781270Ukn.LJIIIZ().BC2(fragmentManager, new InterfaceC754470Tif() { // from class: X.0TgZ
                @Override // X.InterfaceC754470Tif
                public final void LIZ(Hashtag hashtag, GameTag gameTag) {
                    enumC754690Tj1LIZ.updateHashTagGameTag(hashtag, gameTag);
                    basePreviewSettingMainFragmentSheetInitializer.LJJJJLL(liveMode2, c16f5);
                }
            }, enumC754690Tj1LIZ, liveMode2);
            C474500IjA c474500IjALIZ = C0IJT.LIZ("live_topic_click");
            c474500IjALIZ.LJJII("start", "enter_rom");
            int i = C198900pf.LIZ[liveMode2.ordinal()];
            if (i != 1) {
                if (i != 2) {
                    str = "third_party";
                } else {
                    str = "screen_share";
                }
            } else {
                str = "video_live";
            }
            c474500IjALIZ.LJJII(str, "live_type");
            c474500IjALIZ.LJIJJLI(basePreviewSettingMainFragmentSheetInitializer.LLILLJJLI);
            c474500IjALIZ.LIZ();
        }
        return Unit.LIZ;
    }

    public static final Object invoke$18(AwS221S0300000_12 awS221S0300000_12, Object obj) {
        DataChannel dataChannel = ((C762500Tvc) awS221S0300000_12.l0).LLILLL;
        if (dataChannel != null) {
            dataChannel.FQ2(BGMDismissVolumeBarEvent.class);
        }
        MusicSong musicSong = (MusicSong) awS221S0300000_12.l1;
        if (!musicSong.isFavourite) {
            C762500Tvc c762500Tvc = (C762500Tvc) awS221S0300000_12.l0;
            C500260Jjc.LJJJJJ(c762500Tvc.LLILZ, null, new C762510Tvd(c762500Tvc, musicSong, null), 3);
            ((LiveIconView) ((View) awS221S0300000_12.l2).findViewById(R.id.hqx)).setIconAttr(R.attr.c6g);
            C762500Tvc c762500Tvc2 = (C762500Tvc) awS221S0300000_12.l0;
            C763230Twn.LIZIZ(c762500Tvc2.LLILLL, (MusicSong) awS221S0300000_12.l1, "favorite", c762500Tvc2.LLILZLL, c762500Tvc2.LLILZIL);
        } else {
            C762500Tvc c762500Tvc3 = (C762500Tvc) awS221S0300000_12.l0;
            C500260Jjc.LJJJJJ(c762500Tvc3.LLILZ, null, new C762520Tve(c762500Tvc3, musicSong, null), 3);
            ((LiveIconView) ((View) awS221S0300000_12.l2).findViewById(R.id.hqx)).setIconAttr(R.attr.c6f);
            C762500Tvc c762500Tvc4 = (C762500Tvc) awS221S0300000_12.l0;
            C763230Twn.LIZIZ(c762500Tvc4.LLILLL, (MusicSong) awS221S0300000_12.l1, "cancel_favorite", c762500Tvc4.LLILZLL, c762500Tvc4.LLILZIL);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$19(AwS221S0300000_12 awS221S0300000_12, Object obj) {
        C770370UJv c770370UJv = (C770370UJv) obj;
        c770370UJv.LIZ(C0UK7.P0, (Function1) awS221S0300000_12.l0);
        c770370UJv.LIZ(C0UK7.P1, (Function1) awS221S0300000_12.l1);
        c770370UJv.LIZ(C0UK7.P2, (Function1) awS221S0300000_12.l2);
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS221S0300000_12 awS221S0300000_12, Object obj) {
        boolean zIsChecked = ((C20743716Ff) awS221S0300000_12.l0).isChecked();
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_anchor_manager_cues_switch_click");
        c474500IjALIZ.LJIJJLI(((BasePreviewSettingMainFragmentSheetInitializer) awS221S0300000_12.l1).LLILLJJLI);
        c474500IjALIZ.LJJII("live_take_setting", "event_page");
        boolean z = !zIsChecked;
        c474500IjALIZ.LJJII(Integer.valueOf(C500260Jjc.LJJJI(Boolean.valueOf(z)) ? 1 : 0), "action_type");
        c474500IjALIZ.LIZ();
        C01GW<C0UVW> c01gw = C0UVW.LIZIZ;
        BroadcastRoomApi broadcastRoomApiLIZ = C01QD.LIZ().LIZ();
        ReminderWordUpdateStatusRequest reminderWordUpdateStatusRequest = new ReminderWordUpdateStatusRequest();
        reminderWordUpdateStatusRequest.scene = ((AnchorReminderWordStatus) awS221S0300000_12.l2).scene;
        reminderWordUpdateStatusRequest.status = C500260Jjc.LJJJI(Boolean.valueOf(z)) ? 1 : 0;
        broadcastRoomApiLIZ.updateReminderWordStatus(reminderWordUpdateStatusRequest).LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLJLI(new AfS32S0210000_12((C20743716Ff) awS221S0300000_12.l0, (AnchorReminderWordStatus) awS221S0300000_12.l2, zIsChecked, 1));
        return Unit.LIZ;
    }

    public static final Object invoke$20(AwS221S0300000_12 awS221S0300000_12, Object obj) {
        C1397630mTR c1397630mTR = (C1397630mTR) obj;
        String str = ((CopyWritingInfo) awS221S0300000_12.l0).confirm;
        String str2 = "";
        if (str == null) {
            str = "";
        }
        c1397630mTR.LIZJ(0, str, new AwS591S0100000_12((C20656615sK) awS221S0300000_12.l1, 920));
        String str3 = ((CopyWritingInfo) awS221S0300000_12.l0).checkSettings;
        if (str3 != null) {
            str2 = str3;
        }
        c1397630mTR.LIZJ(1, str2, new AwS378S0200000_12((Activity) awS221S0300000_12.l2, (C20656615sK) awS221S0300000_12.l1, 76));
        return Unit.LIZ;
    }

    public static final Object invoke$21(AwS221S0300000_12 awS221S0300000_12, Object obj) {
        C1397620mTQ c1397620mTQ = (C1397620mTQ) obj;
        c1397620mTQ.LIZJ(0, String.valueOf(((CopyWritingInfo) awS221S0300000_12.l0).checkSettings), new AwS378S0200000_12((Activity) awS221S0300000_12.l1, (C20656615sK) awS221S0300000_12.l2, 74));
        c1397620mTQ.LIZJ(0, String.valueOf(((CopyWritingInfo) awS221S0300000_12.l0).confirm), new AwS378S0200000_12((Activity) awS221S0300000_12.l1, (C20656615sK) awS221S0300000_12.l2, 75));
        return Unit.LIZ;
    }

    public static final Object invoke$22(AwS221S0300000_12 awS221S0300000_12, Object obj) {
        ((C923760a98) awS221S0300000_12.l0).LJJL((LatestBanRecordInfo) obj, (Context) awS221S0300000_12.l1, (LifecycleOwner) awS221S0300000_12.l2);
        return Unit.LIZ;
    }

    public static final Object invoke$23(AwS221S0300000_12 awS221S0300000_12, Object obj) {
        Boolean boolValueOf;
        C1116210f9X c1116210f9X = (C1116210f9X) obj;
        AbstractC776930Udn abstractC776930Udn = (AbstractC776930Udn) awS221S0300000_12.l0;
        Boolean boolValueOf2 = null;
        if (abstractC776930Udn != null) {
            boolValueOf = Boolean.valueOf(abstractC776930Udn.isShown());
        } else {
            boolValueOf = null;
        }
        if (C500260Jjc.LJJJI(boolValueOf)) {
            if (!InterfaceC772390URp.LLLZZ.LIZIZ().booleanValue()) {
                ((C779530Uhz) awS221S0300000_12.l1).LIZ();
            } else {
                InterfaceC779960Uig interfaceC779960Uig = (InterfaceC779960Uig) awS221S0300000_12.l2;
                if (interfaceC779960Uig != null) {
                    boolValueOf2 = Boolean.valueOf(interfaceC779960Uig.LJJII());
                }
                if (!C500260Jjc.LJJJI(boolValueOf2) && c1116210f9X != null) {
                    ((C779530Uhz) awS221S0300000_12.l1).LIZIZ.e0(c1116210f9X);
                    C779530Uhz c779530Uhz = (C779530Uhz) awS221S0300000_12.l1;
                    if (!c779530Uhz.LIZJ) {
                        c779530Uhz.LIZJ = true;
                        AbstractC776930Udn abstractC776930Udn2 = (AbstractC776930Udn) awS221S0300000_12.l0;
                        if (abstractC776930Udn2 != null) {
                            abstractC776930Udn2.setTipsView(c779530Uhz.LIZIZ);
                        }
                    }
                } else {
                    ((C779530Uhz) awS221S0300000_12.l1).LIZ();
                }
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$24(AwS221S0300000_12 awS221S0300000_12, Object obj) {
        long j;
        boolean zKQ2;
        C0U17 c0u17 = C0U17.LIZ;
        C0U0Q c0u0q = (C0U0Q) ((Pair) awS221S0300000_12.l0).getSecond();
        C0U22 c0u22 = (C0U22) awS221S0300000_12.l1;
        if (c0u22 != null) {
            j = c0u22.LIZ;
        } else {
            j = -1;
        }
        EnumC764770TzH enumC764770TzH = EnumC764770TzH.QUEUE;
        KaraokeViewModel karaokeViewModel = ((KaraokeSongListFragment) awS221S0300000_12.l2).LLILZIL;
        if (karaokeViewModel != null) {
            zKQ2 = karaokeViewModel.KQ2();
        } else {
            zKQ2 = false;
        }
        c0u17.LJIIJJI(c0u0q, j, enumC764770TzH, zKQ2);
        return Unit.LIZ;
    }

    public static final Object invoke$25(AwS221S0300000_12 awS221S0300000_12, Object obj) {
        long j;
        Long lValueOf;
        C0U2X c0u2x;
        C0U17 c0u17 = C0U17.LIZ;
        C0U0Q c0u0q = (C0U0Q) ((Pair) awS221S0300000_12.l0).getSecond();
        C0U22 c0u22 = (C0U22) awS221S0300000_12.l1;
        if (c0u22 != null) {
            j = c0u22.LIZ;
        } else {
            j = -1;
        }
        Integer numValueOf = null;
        if (c0u22 != null && (c0u2x = c0u22.LJIILLIIL) != null) {
            lValueOf = Long.valueOf(c0u2x.LIZIZ);
        } else {
            lValueOf = null;
        }
        KaraokeViewModel karaokeViewModel = ((KaraokeSongListFragment) awS221S0300000_12.l2).LLILZIL;
        if (karaokeViewModel != null) {
            numValueOf = Integer.valueOf(karaokeViewModel.HQ2());
        }
        c0u17.LJIIIIZZ(c0u0q, j, lValueOf, numValueOf);
        return Unit.LIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0181  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$26(kotlin.jvm.internal.AwS221S0300000_12 r8, java.lang.Object r9) {
        /*
            Method dump skipped, instruction units count: 387
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS221S0300000_12.invoke$26(kotlin.jvm.internal.AwS221S0300000_12, java.lang.Object):java.lang.Object");
    }

    public static /* bridge */ /* synthetic */ Object invoke$27(AwS221S0300000_12 awS221S0300000_12, Object obj) {
        View viewFindViewById;
        C0UX6 c0ux6;
        if (obj == C0UFE.OFF) {
            View view = (View) awS221S0300000_12.l0;
            if (view != null) {
                C786410Ut5.T4(view, 0.34f);
            }
        } else {
            C0UDL c0udl = (C0UDL) awS221S0300000_12.l1;
            DataChannel dataChannel = c0udl.LL;
            if (dataChannel != null) {
                dataChannel.CQ2(AigcWallpaperStatus.class, c0udl, new AwS591S0100000_12((View) awS221S0300000_12.l0, 1117));
            }
            ConcurrentHashSet<C0U3Q> concurrentHashSet = C0U3P.LIZ;
            C0U3P.LIZJ(C0U3Q.KARAOKE, new AwS591S0100000_12((View) awS221S0300000_12.l0, 1118));
            View view2 = (View) awS221S0300000_12.l0;
            if (view2 != null && (viewFindViewById = view2.findViewById(R.id.t16)) != null) {
                C0UDL c0udl2 = (C0UDL) awS221S0300000_12.l1;
                LifecycleOwner lifecycleOwner = (LifecycleOwner) awS221S0300000_12.l2;
                c0udl2.getClass();
                InterfaceC1088880eRS interfaceC1088880eRSMn1 = ((IToolbarService) C1161920gLG.LIZJ(IToolbarService.class)).Mn1(c0udl2.LL);
                if ((interfaceC1088880eRSMn1 != null && interfaceC1088880eRSMn1.LIZIZ(EnumC1102750enp.INTERACTION_FEATURES)) || C0UIM.LJFF()) {
                    c0ux6 = C0UX6.LIVE_BROADCAST_KARAOKE_MORE;
                } else {
                    c0ux6 = C0UX6.LIVE_BROADCAST_KARAOKE_INTERACT;
                }
                RedDotExtensionKt.LJI(viewFindViewById, lifecycleOwner, null, c0ux6, null);
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$28(AwS221S0300000_12 awS221S0300000_12, Object obj) {
        int i;
        InterfaceC761540Tu4 interfaceC761540Tu4;
        InterfaceC761540Tu4 interfaceC761540Tu42;
        C766210U3v c766210U3v = (C766210U3v) awS221S0300000_12.l0;
        LiveEffect liveEffect = (LiveEffect) awS221S0300000_12.l1;
        C766200U3u c766200U3u = c766210U3v.LLILLL;
        c766200U3u.LIZIZ = c766200U3u.LIZ;
        c766200U3u.LIZ = liveEffect.getResourceId();
        Iterator it2 = ((ArrayList) c766210U3v.LL).iterator();
        int i2 = 0;
        int i3 = 0;
        while (true) {
            i = -1;
            if (it2.hasNext()) {
                if (Intrinsics.LJFF(((LiveEffect) it2.next()).getResourceId(), c766210U3v.LLILLL.LIZIZ)) {
                    break;
                }
                i3++;
            } else {
                i3 = -1;
                break;
            }
        }
        c766210U3v.LLLJ(i3);
        C766200U3u c766200U3u2 = c766210U3v.LLILLL;
        ImageModel imageModelLIZ = null;
        if (!Intrinsics.LJFF(c766200U3u2.LIZIZ, c766200U3u2.LIZ)) {
            Iterator it3 = ((ArrayList) c766210U3v.LL).iterator();
            while (true) {
                if (!it3.hasNext()) {
                    break;
                }
                if (Intrinsics.LJFF(((LiveEffect) it3.next()).getResourceId(), c766210U3v.LLILLL.LIZ)) {
                    i = i2;
                    break;
                }
                i2++;
            }
            c766210U3v.LLLILZ(i);
            C0UA2 c0ua2 = c766210U3v.LLILZ;
            if (c0ua2 != null && (interfaceC761540Tu42 = c0ua2.LIZJ) != null) {
                String resourceId = liveEffect.getResourceId();
                UrlModel icon = liveEffect.getIcon();
                if (icon != null) {
                    imageModelLIZ = icon.LIZ();
                }
                interfaceC761540Tu42.LIZJ(new C20355014km(resourceId, imageModelLIZ));
            }
        } else {
            C766200U3u c766200U3u3 = c766210U3v.LLILLL;
            c766200U3u3.LIZIZ = null;
            c766200U3u3.LIZ = null;
            C0UA2 c0ua22 = c766210U3v.LLILZ;
            if (c0ua22 != null && (interfaceC761540Tu4 = c0ua22.LIZJ) != null) {
                interfaceC761540Tu4.LIZJ(null);
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$29(AwS221S0300000_12 awS221S0300000_12, Object obj) {
        Integer numValueOf;
        GameTag.GameAgeRating next;
        Integer numValueOf2;
        GameTag.GameAgeRating next2;
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_game_audience_control_perception");
        c474500IjALIZ.LJJII(1, "show");
        Iterator<GameTag.GameAgeRating> it2 = ((GameTag) awS221S0300000_12.l0).gar.iterator();
        while (true) {
            numValueOf = null;
            if (it2.hasNext()) {
                next = it2.next();
                if (next.rs == 1) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        GameTag.GameAgeRating gameAgeRating = next;
        if (gameAgeRating != null) {
            numValueOf2 = Integer.valueOf(gameAgeRating.ar);
        } else {
            numValueOf2 = null;
        }
        c474500IjALIZ.LJJII(numValueOf2, "pegi_rating");
        Iterator<GameTag.GameAgeRating> it3 = ((GameTag) awS221S0300000_12.l0).gar.iterator();
        while (true) {
            if (it3.hasNext()) {
                next2 = it3.next();
                if (next2.rs == 2) {
                    break;
                }
            } else {
                next2 = null;
                break;
            }
        }
        GameTag.GameAgeRating gameAgeRating2 = next2;
        if (gameAgeRating2 != null) {
            numValueOf = Integer.valueOf(gameAgeRating2.ar);
        }
        c474500IjALIZ.LJJII(numValueOf, "esrb_rating");
        c474500IjALIZ.LJJII(Integer.valueOf(((C118300cf) awS221S0300000_12.l1).element), "reason_code");
        c474500IjALIZ.LJJII(((GameTag) awS221S0300000_12.l0).id, "hashtag_id");
        c474500IjALIZ.LJJII(((GameTopicListAssem) awS221S0300000_12.l2).No(), "anchor_id");
        c474500IjALIZ.LIZ();
        return Unit.LIZ;
    }

    public static final Object invoke$3(AwS221S0300000_12 awS221S0300000_12, Object obj) {
        C20484615Do c20484615Do = ((BasePreviewSettingMainFragmentSheetInitializer) awS221S0300000_12.l0).LLILLL;
        Bundle bundle = new Bundle();
        bundle.putBoolean("show_back_arrow", true);
        c20484615Do.LJIIIZ(LiveLocationScopeSettingSheet.class, "LiveLocationScopeSettingSheet", null, bundle);
        C760180Trs.LJIIJ((DataChannel) awS221S0300000_12.l1, ((AboveGoLiveButtonComponent) awS221S0300000_12.l2).trackExtra);
        return Unit.LIZ;
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    public static final Object invoke$30(AwS221S0300000_12 awS221S0300000_12, Object obj) {
        ((C761740TuO) awS221S0300000_12.l0).LIZ.add((T) ((SoundEffect) awS221S0300000_12.l1));
        ((Function1) awS221S0300000_12.l2).invoke(-1);
        return Unit.LIZ;
    }

    public static final Object invoke$31(AwS221S0300000_12 awS221S0300000_12, Object obj) {
        ((C761740TuO) awS221S0300000_12.l0).LIZ.remove((SoundEffect) awS221S0300000_12.l1);
        ((Function1) awS221S0300000_12.l2).invoke(-2);
        return Unit.LIZ;
    }

    public static final Object invoke$32(AwS221S0300000_12 awS221S0300000_12, Object obj) {
        C0U3O c0u3o = (C0U3O) obj;
        c0u3o.LIZLLL(new AwS221S0300000_12((C761740TuO) awS221S0300000_12.l0, (C761740TuO) awS221S0300000_12.l1, (SoundEffect) awS221S0300000_12.l2, (Function1<? super Integer, Unit>) 30));
        c0u3o.LIZJ(new AwS582S0100000_3((Function1) awS221S0300000_12.l2, (Function1<? super Boolean, Unit>) 160));
        c0u3o.LJFF(new AwS221S0300000_12((C761740TuO) awS221S0300000_12.l0, (C761740TuO) awS221S0300000_12.l1, (SoundEffect) awS221S0300000_12.l2, (Function1<? super Integer, Unit>) 31));
        c0u3o.LIZIZ(new AwS290S0300000_12((C761740TuO) awS221S0300000_12.l0, (C761740TuO) awS221S0300000_12.l1, (SoundEffect) awS221S0300000_12.l2, (Function1<? super Integer, Unit>) 1));
        return Unit.LIZ;
    }

    public static final Object invoke$33(AwS221S0300000_12 awS221S0300000_12, Object obj) {
        C1107460evQ c1107460evQ;
        C0UNT c0unt = C0UNT.LIZ;
        C0UNT.LIZ.LIZIZ(1, 3, 0, new AwS378S0200000_12((C0UNW) awS221S0300000_12.l0, (DataChannel) awS221S0300000_12.l2, 120));
        C0UNW c0unw = (C0UNW) awS221S0300000_12.l0;
        View view = (View) awS221S0300000_12.l1;
        c0unw.getClass();
        View viewFindViewById = view.findViewById(R.id.sl5);
        if (viewFindViewById != null) {
            ObjectAnimator duration = ObjectAnimator.ofFloat(viewFindViewById, (Property<View, Float>) View.ALPHA, 1.0f, 0.0f).setDuration(120L);
            ObjectAnimator duration2 = ObjectAnimator.ofFloat(viewFindViewById, (Property<View, Float>) View.ALPHA, 0.0f, 1.0f).setDuration(120L);
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playTogether(duration, duration2);
            animatorSet.start();
        }
        if (((C0UNW) awS221S0300000_12.l0).LL != null && (c1107460evQ = C1107850ew3.LLILLL) != null) {
            C1102070emj.LJIILJJIL(C1102070emj.LIZ, c1107460evQ.LIZJ, C1107850ew3.LL, C1107850ew3.LLJI, C0KAJ.MANUALLY_ROUTE, null, null, 112);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$34(AwS221S0300000_12 awS221S0300000_12, Object obj) {
        int iIntValue = ((Number) obj).intValue();
        if (iIntValue != -3) {
            if (iIntValue != -2) {
                if (iIntValue != -1) {
                    C0U45 c0u45 = (C0U45) awS221S0300000_12.l0;
                    if (c0u45 != null) {
                        c0u45.LIZIZ((LiveEffect) awS221S0300000_12.l1, iIntValue, -1L);
                    }
                } else {
                    C0U45 c0u452 = (C0U45) awS221S0300000_12.l0;
                    if (c0u452 != null) {
                        c0u452.LIZJ((LiveEffect) awS221S0300000_12.l1);
                    }
                }
            } else {
                C0U45 c0u453 = (C0U45) awS221S0300000_12.l0;
                if (c0u453 != null) {
                    c0u453.LIZ((LiveEffect) awS221S0300000_12.l1);
                }
                ((StickerEffectViewModel) awS221S0300000_12.l2).EQ2();
            }
        } else {
            C0U45 c0u454 = (C0U45) awS221S0300000_12.l0;
            if (c0u454 != null) {
                c0u454.LJ((LiveEffect) awS221S0300000_12.l1, null);
            }
            ((StickerEffectViewModel) awS221S0300000_12.l2).EQ2();
        }
        return Unit.LIZ;
    }

    public static final Object invoke$4(AwS221S0300000_12 awS221S0300000_12, Object obj) {
        String strLJJJJJL;
        String str;
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        LiveInteractionFeaturesFragment liveInteractionFeaturesFragment = (LiveInteractionFeaturesFragment) awS221S0300000_12.l0;
        String string = ((ArrayList) awS221S0300000_12.l1).toString();
        String string2 = ((ArrayList) awS221S0300000_12.l2).toString();
        if (!liveInteractionFeaturesFragment.LLJLIL) {
            liveInteractionFeaturesFragment.LLJLIL = true;
            C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_anchor_interaction_panel_show");
            c474500IjALIZ.LJIJJLI(liveInteractionFeaturesFragment.LLJJIJIL);
            c474500IjALIZ.LJJII(liveInteractionFeaturesFragment.LLJJJJJIL.getValue(), "anchor_id");
            c474500IjALIZ.LJJII(Long.valueOf(((Number) liveInteractionFeaturesFragment.LLJJJJLIIL.getValue()).longValue()), "room_id");
            c474500IjALIZ.LJJII(liveInteractionFeaturesFragment.LLJJJJ, "entrance");
            c474500IjALIZ.LJJII("anchor", "user_type");
            if (Intrinsics.LJFF(liveInteractionFeaturesFragment.LLJJJJ, "more_top")) {
                if (zBooleanValue) {
                    str = "fold";
                } else {
                    str = "unfold";
                }
                c474500IjALIZ.LJJII(str, FollowStatusChangeMethod.PARAM_FOLLOW_STATUS);
            }
            c474500IjALIZ.LJJII(string, "envelope_permission");
            c474500IjALIZ.LJJII(string2, "goody_bag_permission");
            DataChannel dataChannel = liveInteractionFeaturesFragment.LLJJIJIL;
            if (dataChannel != null) {
                strLJJJJJL = C500260Jjc.LJJJJJL(dataChannel);
            } else {
                strLJJJJJL = null;
            }
            c474500IjALIZ.LJJII(strLJJJJJL, "live_type");
            c474500IjALIZ.LIZ();
        }
        return Unit.LIZ;
    }

    public static final Object invoke$5(AwS221S0300000_12 awS221S0300000_12, Object obj) {
        ((C013C) awS221S0300000_12.l0).element = true;
        CommerceMusicLegalViewModel commerceMusicLegalViewModel = (CommerceMusicLegalViewModel) awS221S0300000_12.l1;
        EnumC746940TRs enumC746940TRs = EnumC746940TRs.DIALOG;
        commerceMusicLegalViewModel.getClass();
        C20684815ws.LJIILLIIL("ba_publish_with_ugc", C2097908Jt.LIZJ(new Pair("source", enumC746940TRs.getValue())));
        ((CommerceMusicLegalViewModel) awS221S0300000_12.l1).LLIZLLLIL.setValue(Boolean.TRUE);
        ((Function0) awS221S0300000_12.l2).invoke();
        ((C1397660mTU) obj).LIZ().LIZIZ(null);
        return Unit.LIZ;
    }

    public static final Object invoke$6(AwS221S0300000_12 awS221S0300000_12, Object obj) {
        C1397620mTQ c1397620mTQ = (C1397620mTQ) obj;
        c1397620mTQ.LIZJ(0, ((InterfaceC20673515v3) awS221S0300000_12.l0).LJJJJZ("pm_end_live_end"), new AwS378S0200000_12((Context) awS221S0300000_12.l1, (Intent) awS221S0300000_12.l2, 30));
        c1397620mTQ.LIZJ(1, ((InterfaceC20673515v3) awS221S0300000_12.l0).LJJJJZ("pm_end_live_not_now"), AFwS245S0000000_12.get$arr$(74));
        return Unit.LIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0051  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$7(kotlin.jvm.internal.AwS221S0300000_12 r3, java.lang.Object r4) {
        /*
            android.view.View r4 = (android.view.View) r4
            java.lang.Object r2 = r3.l0
            X.0U5B r2 = (X.C0U5B) r2
            java.lang.Object r1 = r3.l1
            com.bytedance.android.livesdkapi.depend.model.LiveEffect r1 = (com.bytedance.android.livesdkapi.depend.model.LiveEffect) r1
            X.0U5A r2 = (X.C0U5A) r2
            boolean r0 = r2.LLJI
            if (r0 == 0) goto L51
            boolean r0 = X.C20588315hJ.LLILLL
            if (r0 != 0) goto L41
            boolean r0 = r2.LLIZLLLIL
            if (r0 == 0) goto L44
            boolean r0 = r1.LJJJJLL()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            boolean r0 = X.C500260Jjc.LJJJI(r0)
            if (r0 == 0) goto L44
            com.bytedance.ies.sdk.datachannel.DataChannel r1 = r2.LLILLJJLI
            if (r1 == 0) goto L34
            java.lang.Class<X.0Tra> r0 = X.C760000Tra.class
            java.lang.Object r1 = r1.gg0(r0)
            java.lang.String r1 = (java.lang.String) r1
            if (r1 != 0) goto L36
        L34:
            java.lang.String r1 = ""
        L36:
            android.content.Context r0 = r4.getContext()
            X.19EG r0 = X.C500260Jjc.LJ(r0)
            X.C766270U4b.LJIILJJIL(r0, r1)
        L41:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L44:
            boolean r0 = r2.LLLLLLL(r1)
            if (r0 == 0) goto L51
            r0 = 2131841649(0x7f115271, float:1.9316612E38)
            X.C766270U4b.LIZLLL(r0)
            goto L41
        L51:
            java.lang.Object r2 = r3.l0
            X.0U5B r2 = (X.C0U5B) r2
            java.lang.Object r1 = r3.l1
            com.bytedance.android.livesdkapi.depend.model.LiveEffect r1 = (com.bytedance.android.livesdkapi.depend.model.LiveEffect) r1
            java.lang.Object r0 = r3.l2
            androidx.recyclerview.widget.RecyclerView$ViewHolder r0 = (androidx.recyclerview.widget.RecyclerView.ViewHolder) r0
            android.view.View r0 = r0.itemView
            r2.LLLLLLLZIL(r1, r0)
            goto L41
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS221S0300000_12.invoke$7(kotlin.jvm.internal.AwS221S0300000_12, java.lang.Object):java.lang.Object");
    }

    public static final Object invoke$8(AwS221S0300000_12 awS221S0300000_12, Object obj) {
        ((LiveEffect) awS221S0300000_12.l0).LJJLIL(false);
        ((LiveEffect) awS221S0300000_12.l0).LJLILLLLZI(true);
        C0U5B c0u5b = (C0U5B) awS221S0300000_12.l1;
        if (c0u5b != null) {
            c0u5b.LLLII((LiveEffect) awS221S0300000_12.l0);
        }
        C0U5F c0u5f = (C0U5F) awS221S0300000_12.l2;
        if (c0u5f != null) {
            c0u5f.LIZLLL((LiveEffect) awS221S0300000_12.l0);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$9(AwS221S0300000_12 awS221S0300000_12, Object obj) {
        int downloadProcess;
        DownloadInfo downloadInfo = (DownloadInfo) obj;
        C0U5B c0u5b = (C0U5B) awS221S0300000_12.l0;
        if (c0u5b != null) {
            LiveEffect liveEffect = (LiveEffect) awS221S0300000_12.l1;
            if (downloadInfo != null) {
                downloadProcess = downloadInfo.getDownloadProcess();
            } else {
                downloadProcess = 0;
            }
            c0u5b.LLLIL(downloadProcess, liveEffect);
        }
        C0U5F c0u5f = (C0U5F) awS221S0300000_12.l2;
        if (c0u5f != null) {
            LiveEffect liveEffect2 = (LiveEffect) awS221S0300000_12.l1;
            if (downloadInfo != null) {
                downloadInfo.getDownloadProcess();
            }
            c0u5f.LIZIZ(liveEffect2);
        }
        return Unit.LIZ;
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public AwS221S0300000_12(X.C0UP6 r3, X.C0UPF r4, com.bytedance.ies.sdk.datachannel.DataChannel r5, int r6) {
        /*
            r2 = this;
            r2.$t = r6
            switch(r6) {
                case 11: goto L11;
                case 12: goto L1a;
                case 13: goto L5;
                case 14: goto L1a;
                default: goto L5;
            }
        L5:
            r1 = r2
            r1.l0 = r3
            r1.l1 = r4
            r1.l2 = r5
            r0 = 1
        Ld:
            r1.<init>(r0)
            return
        L11:
            r1 = r2
            r1.l0 = r4
            r1.l1 = r5
            r1.l2 = r3
            r0 = 1
            goto Ld
        L1a:
            r1 = r2
            r1.l0 = r5
            r1.l1 = r4
            r1.l2 = r3
            r0 = 1
            goto Ld
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS221S0300000_12.<init>(X.0UP6, X.0UPF, com.bytedance.ies.sdk.datachannel.DataChannel, int):void");
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public AwS221S0300000_12(X.C0U5F r3, X.C0U5B r4, com.bytedance.android.livesdkapi.depend.model.LiveEffect r5, int r6) {
        /*
            r2 = this;
            r2.$t = r6
            int r6 = 8 - r6
            if (r6 == 0) goto L12
            r1 = r2
            r1.l0 = r4
            r1.l1 = r5
            r1.l2 = r3
            r0 = 1
        Le:
            r1.<init>(r0)
            return
        L12:
            r1 = r2
            r1.l0 = r5
            r1.l1 = r4
            r1.l2 = r3
            r0 = 1
            goto Le
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS221S0300000_12.<init>(X.0U5F, X.0U5B, com.bytedance.android.livesdkapi.depend.model.LiveEffect, int):void");
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public AwS221S0300000_12(X.C19EG r3, X.C20656615sK r4, com.ss.android.ugc.aweme.compliance.api.model.CopyWritingInfo r5, int r6) {
        /*
            r2 = this;
            r2.$t = r6
            int r6 = 20 - r6
            if (r6 == 0) goto L12
            r1 = r2
            r1.l0 = r5
            r1.l1 = r3
            r1.l2 = r4
            r0 = 1
        Le:
            r1.<init>(r0)
            return
        L12:
            r1 = r2
            r1.l0 = r5
            r1.l1 = r4
            r1.l2 = r3
            r0 = 1
            goto Le
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS221S0300000_12.<init>(X.19EG, X.15sK, com.ss.android.ugc.aweme.compliance.api.model.CopyWritingInfo, int):void");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS221S0300000_12(C013C c013c, C013C c013c2, CommerceMusicLegalViewModel commerceMusicLegalViewModel, Function0<Unit> function0) {
        super(1);
        this.$t = function0;
        this.l0 = c013c;
        this.l1 = c013c2;
        this.l2 = commerceMusicLegalViewModel;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS221S0300000_12(C761740TuO c761740TuO, C761740TuO c761740TuO2, SoundEffect soundEffect, Function1<? super Integer, Unit> function1) {
        super(1);
        this.$t = function1;
        this.l0 = c761740TuO;
        this.l1 = c761740TuO2;
        this.l2 = soundEffect;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS221S0300000_12(C762500Tvc c762500Tvc, MusicSong musicSong, View view, int i) {
        super(1);
        this.$t = i;
        this.l0 = c762500Tvc;
        this.l1 = musicSong;
        this.l2 = view;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS221S0300000_12(C766210U3v c766210U3v, LiveEffect liveEffect, C766220U3w c766220U3w, int i) {
        super(1);
        this.$t = i;
        this.l0 = c766210U3v;
        this.l1 = liveEffect;
        this.l2 = c766220U3w;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS221S0300000_12(C0U45 c0u45, LiveEffect liveEffect, StickerEffectViewModel stickerEffectViewModel, int i) {
        super(1);
        this.$t = i;
        this.l0 = c0u45;
        this.l1 = liveEffect;
        this.l2 = stickerEffectViewModel;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS221S0300000_12(C0U5B c0u5b, LiveEffect liveEffect, RecyclerView.ViewHolder viewHolder, int i) {
        super(1);
        this.$t = i;
        this.l0 = c0u5b;
        this.l1 = liveEffect;
        this.l2 = viewHolder;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS221S0300000_12(C0UDM c0udm, DataChannel dataChannel, InterfaceC1103130eoR interfaceC1103130eoR, int i) {
        super(1);
        this.$t = i;
        this.l0 = c0udm;
        this.l1 = dataChannel;
        this.l2 = interfaceC1103130eoR;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS221S0300000_12(C0UNW c0unw, View view, DataChannel dataChannel, int i) {
        super(1);
        this.$t = i;
        this.l0 = c0unw;
        this.l1 = view;
        this.l2 = dataChannel;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS221S0300000_12(AbstractC776930Udn abstractC776930Udn, C779530Uhz c779530Uhz, InterfaceC779960Uig interfaceC779960Uig, int i) {
        super(1);
        this.$t = i;
        this.l0 = abstractC776930Udn;
        this.l1 = c779530Uhz;
        this.l2 = interfaceC779960Uig;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS221S0300000_12(C781230Ukj c781230Ukj, Context context, LifecycleOwner lifecycleOwner, int i) {
        super(1);
        this.$t = i;
        this.l0 = c781230Ukj;
        this.l1 = context;
        this.l2 = lifecycleOwner;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS221S0300000_12(C923760a98 c923760a98, Context context, LifecycleOwner lifecycleOwner, int i) {
        super(1);
        this.$t = i;
        this.l0 = c923760a98;
        this.l1 = context;
        this.l2 = lifecycleOwner;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS221S0300000_12(C1390920mIc c1390920mIc, RssIntroAssem rssIntroAssem, FragmentManager fragmentManager, int i) {
        super(1);
        this.$t = i;
        this.l0 = c1390920mIc;
        this.l1 = rssIntroAssem;
        this.l2 = fragmentManager;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS221S0300000_12(InterfaceC20673515v3 interfaceC20673515v3, Context context, Intent intent, int i) {
        super(1);
        this.$t = i;
        this.l0 = interfaceC20673515v3;
        this.l1 = context;
        this.l2 = intent;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS221S0300000_12(C20743716Ff c20743716Ff, LiveAdminSettingGuideAdapter liveAdminSettingGuideAdapter, AnchorReminderWordStatus anchorReminderWordStatus, int i) {
        super(1);
        this.$t = i;
        this.l0 = c20743716Ff;
        this.l1 = liveAdminSettingGuideAdapter;
        this.l2 = anchorReminderWordStatus;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS221S0300000_12(C20743716Ff c20743716Ff, BasePreviewSettingMainFragmentSheetInitializer basePreviewSettingMainFragmentSheetInitializer, AnchorReminderWordStatus anchorReminderWordStatus, int i) {
        super(1);
        this.$t = i;
        this.l0 = c20743716Ff;
        this.l1 = basePreviewSettingMainFragmentSheetInitializer;
        this.l2 = anchorReminderWordStatus;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS221S0300000_12(View view, C0UDL c0udl, LifecycleOwner lifecycleOwner, int i) {
        super(1);
        this.$t = i;
        this.l0 = view;
        this.l1 = c0udl;
        this.l2 = lifecycleOwner;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS221S0300000_12(LiveAdminSettingGuideAdapter liveAdminSettingGuideAdapter, View view, View view2, int i) {
        super(1);
        this.$t = i;
        this.l0 = liveAdminSettingGuideAdapter;
        this.l1 = view;
        this.l2 = view2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS221S0300000_12(BasePreviewSettingMainFragmentSheetInitializer basePreviewSettingMainFragmentSheetInitializer, LiveMode liveMode, C16F5 c16f5, int i) {
        super(1);
        this.$t = i;
        this.l0 = basePreviewSettingMainFragmentSheetInitializer;
        this.l1 = liveMode;
        this.l2 = c16f5;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS221S0300000_12(BasePreviewSettingMainFragmentSheetInitializer basePreviewSettingMainFragmentSheetInitializer, DataChannel dataChannel, AboveGoLiveButtonComponent aboveGoLiveButtonComponent, int i) {
        super(1);
        this.$t = i;
        this.l0 = basePreviewSettingMainFragmentSheetInitializer;
        this.l1 = dataChannel;
        this.l2 = aboveGoLiveButtonComponent;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS221S0300000_12(LiveInteractionFeaturesFragment liveInteractionFeaturesFragment, LiveInteractionFeaturesFragment liveInteractionFeaturesFragment2, ArrayList<Long> arrayList, ArrayList<Long> arrayList2) {
        super(1);
        this.$t = arrayList2;
        this.l0 = liveInteractionFeaturesFragment;
        this.l1 = liveInteractionFeaturesFragment2;
        this.l2 = arrayList;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS221S0300000_12(GameTag gameTag, C118300cf c118300cf, GameTopicListAssem gameTopicListAssem, int i) {
        super(1);
        this.$t = i;
        this.l0 = gameTag;
        this.l1 = c118300cf;
        this.l2 = gameTopicListAssem;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS221S0300000_12(CommentRethinkPopup commentRethinkPopup, Comment comment, CommentPublishViewModel commentPublishViewModel, int i) {
        super(1);
        this.$t = i;
        this.l0 = commentRethinkPopup;
        this.l1 = comment;
        this.l2 = commentPublishViewModel;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS221S0300000_12(Pair pair, Pair<? extends C0U0Q, ? extends C0U0Q> pair2, C0U22 c0u22, KaraokeSongListFragment karaokeSongListFragment) {
        super(1);
        this.$t = karaokeSongListFragment;
        this.l0 = pair;
        this.l1 = pair2;
        this.l2 = c0u22;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS221S0300000_12(AwS591S0100000_12 awS591S0100000_12, AwS591S0100000_12 awS591S0100000_122, AwS591S0100000_12 awS591S0100000_123, int i) {
        super(1);
        this.$t = i;
        this.l0 = awS591S0100000_12;
        this.l1 = awS591S0100000_122;
        this.l2 = awS591S0100000_123;
    }
}
