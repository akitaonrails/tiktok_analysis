package wh6;

import X.AbstractC489130JGd;
import X.AbstractC489980JJk;
import X.AbstractC496140Jcy;
import X.AbstractViewOnClickListenerC1637610siV;
import X.C05JW;
import X.C06MM;
import X.C0IJT;
import X.C0IQR;
import X.C0JCK;
import X.C0JH1;
import X.C0JH6;
import X.C0JHA;
import X.C0JHG;
import X.C0JHI;
import X.C0JHK;
import X.C0JHN;
import X.C0JHW;
import X.C0JJO;
import X.C0K3S;
import X.C0K4J;
import X.C0K4Y;
import X.C0KPJ;
import X.C0KX8;
import X.C0TCF;
import X.C0UJ2;
import X.C0UKZ;
import X.C0UX6;
import X.C1161920gLG;
import X.C11NZ;
import X.C11S5;
import X.C1247510iZJ;
import X.C1390850mIV;
import X.C1397510mTF;
import X.C1397580mTM;
import X.C1443310nf7;
import X.C1558520qew;
import X.C1701940uOG;
import X.C1954807lC;
import X.C19EG;
import X.C19EH;
import X.C23250099c;
import X.C474500IjA;
import X.C475510Ikn;
import X.C489110JGb;
import X.C489190JGj;
import X.C489310JGv;
import X.C489320JGw;
import X.C489400JHe;
import X.C489560JHu;
import X.C490990JNh;
import X.C491000JNi;
import X.C494680Jac;
import X.C497010JeN;
import X.C497420Jf2;
import X.C500260Jjc;
import X.C511370K3r;
import X.C511510K4f;
import X.C511520K4g;
import X.C517110KPt;
import X.C724240Sb0;
import X.C766270U4b;
import X.C786410Ut5;
import X.C985403tE;
import X.EnumC489360JHa;
import X.EnumC499440JiI;
import X.EnumC748580TYa;
import X.InterfaceC1631620sYq;
import X.InterfaceC2217461Bqa;
import X.InterfaceC489200JGk;
import Y.AfS143S0200000_7;
import Y.AfS172S0100000_3;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LifecycleOwnerKt;
import com.bytedance.android.live.DismissPreviewSettingDialogEvent;
import com.bytedance.android.live.actionhandler.IActionHandlerService;
import com.bytedance.android.live.base.model.emoji.EmoteModel;
import com.bytedance.android.live.design.view.sheet.LiveSheetFragment;
import com.bytedance.android.live.liveinteract.multiguestv3.main.userinfo.common.multilive.MultiLiveFeedsEntryFragment;
import com.bytedance.android.live.uikit.reddot.RedDotExtensionKt;
import com.bytedance.android.livesdk.adminsetting.comment.filter.LiveFilterCommentSettingFragmentNew;
import com.bytedance.android.livesdk.broadcast.aireply.LiveAIReplySettingFragment;
import com.bytedance.android.livesdk.broadcast.preview.widget.setting.BasePreviewSettingMainFragmentSheetInitializer;
import com.bytedance.android.livesdk.comp.api.pcs.IPcsService;
import com.bytedance.android.livesdk.comp.api.subscription.ISubscribeService;
import com.bytedance.android.livesdk.comp.impl.pcs.business.growth.onestopshop.OneStopSheetFragment;
import com.bytedance.android.livesdk.dataChannel.BroadcastDialogPageChannel;
import com.bytedance.android.livesdk.dataChannel.BroadcastDialogPageCloseInternal;
import com.bytedance.android.livesdk.dataChannel.LiveBanCapabilityGlobalChannel;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.android.livesdk.livesetting.subscription.LiveSubscriptionQuestionnaireHourFrequencySetting;
import com.bytedance.android.livesdk.model.BannerInRoom;
import com.bytedance.android.livesdk.profile.ui.LiveProfileSheet;
import com.bytedance.android.livesdk.revenue.level.impl.fansclub.ui.FansClubJoinDialog;
import com.bytedance.android.livesdk.revenue.level.impl.superfan.treasurebox.TreasureBoxDialog;
import com.bytedance.android.livesdk.revenue.level.impl.superfan.ui.SuperFanJoinDialog;
import com.bytedance.android.livesdk.revenue.level.impl.superfan.ui.SuperFanViewModel;
import com.bytedance.android.livesdk.subcription.subspaceeditor.SpaceEditorAssem;
import com.bytedance.android.livesdk.usercard.TryModeLiveProfileDialog;
import com.bytedance.android.livesdkapi.host.IHostSubscription;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.provider.impl.GScope;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.creative.model.PcsCourseVideoModel;
import com.ss.android.ugc.aweme.editpost.EditPostResponse;
import com.ss.android.ugc.aweme.pcs.course.api.ui.IPcsCourseActivityAbility;
import com.ss.android.ugc.aweme.pcs.course.managementpage.ui.PcsCoursePriceTierSheet;
import com.ss.android.ugc.aweme.pcs.course.managementpage.ui.PcsCourseVideoListAssem;
import com.ss.android.ugc.aweme.pcs.course.managementpage.uiv2.PcsCoursePriceTierSheetV2;
import com.ss.android.ugc.aweme.pcs.course.managementpage.uiv2.powerlist.CourseVideoListCell;
import com.ss.android.ugc.aweme.pcs.course.managementpage.vm.PcsCourseManageVM;
import com.ss.android.ugc.aweme.pcs.course.videoeditpage.vm.PcsVideoEditVM;
import com.ss.android.ugc.aweme.pcs.course.videopublishpage.ui.PcsCoursePublishBottomAssem;
import com.ss.android.ugc.aweme.pcs.course.videopublishpage.vm.PcsVideoReEditVm;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.edit.model.EditPreviewInfo;
import com.ss.android.ugc.aweme.shortvideo.edit.model.EditVideoSegment;
import com.ss.android.ugc.aweme.shortvideo.edit.model.VideoFileInfo;
import com.ss.android.ugc.aweme.shortvideo.publish.PublishModel;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.ss.android.ugc.aweme.subscription.pgc.business.perks.subspace.detail.view.assem.DetailBackToSpaceAssem;
import com.ss.android.ugc.aweme.subscription.pgc.business.perks.subspace.detail.view.assem.DetailTitleAssem;
import com.ss.android.ugc.aweme.subscription.pgc.business.perks.subspace.detail.view.assem.FakeSubSpaceEditorAssem;
import com.ss.android.ugc.aweme.subscription.pgc.business.perks.subspace.detail.view.fragment.DetailSettingDialogFragment;
import com.ss.android.ugc.aweme.subscription.pgc.business.perks.subspace.detail.vm.SubSpaceDetailVM;
import com.ss.android.ugc.aweme.subscription.pgc.business.perks.subspace.feed.view.assem.JoinSubSpaceAssem;
import com.ss.android.ugc.aweme.subscription.pgc.business.perks.subspace.feed.view.assem.SpaceFeedTitleAssem;
import com.ss.android.ugc.aweme.subscription.pgc.business.perks.subspace.feed.view.fragment.SubSpaceFeedFragment;
import com.ss.android.ugc.aweme.subscription.pgc.business.perks.subspace.feed.vm.SubSpaceFeedVM;
import com.ss.android.ugc.aweme.subscription.pgc.business.perks.subspace.newpost.view.assem.SendSpacePostAssem;
import com.ss.android.ugc.aweme.subscription.pgc.business.perks.subspace.newpost.vm.SubSpaceNewPostVM;
import com.ss.android.ugc.aweme.subscription.pgc.business.perks.subspace.setting.view.fragment.SubSpaceSettingFragment;
import com.ss.android.ugc.aweme.subscription.pgc.data.network.DataResponse;
import com.ss.android.ugc.aweme.ttsvoice.ui.TTSVoiceDetailsFragment;
import com.tts.oecverify.BdTuring;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS193S0000000_7;
import kotlin.jvm.internal.AwS551S0100000_7;
import kotlin.jvm.internal.AwS586S0100000_7;
import kotlin.jvm.internal.Intrinsics;
import webcast.api.pgc_sub.PGCPostCreateReq;
import webcast.api.pgc_sub.PGCSpaceJoinResponse;

/* JADX INFO: loaded from: classes8.dex */
public class AbS689S0100000_7 extends AbstractViewOnClickListenerC1637610siV {
    public final int $t;
    public Object l0;

    @Override // X.AbstractViewOnClickListenerC1637610siV
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
            case 23:
                LIZ$23(this, view);
                break;
            case LiveSubscriptionQuestionnaireHourFrequencySetting.DEFAULT /* 24 */:
                LIZ$24(this, view);
                break;
            case 25:
                LIZ$25(this, view);
                break;
            case 26:
                LIZ$26(this, view);
                break;
            case 27:
                LIZ$27(this, view);
                break;
            case 28:
                LIZ$28(this, view);
                break;
            case 29:
                LIZ$29(this, view);
                break;
            case 30:
                LIZ$30(this, view);
                break;
            case 31:
                LIZ$31(this, view);
                break;
            case 32:
                LIZ$32(this, view);
                break;
            default:
                super.LIZ(view);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbS689S0100000_7(PcsCoursePublishBottomAssem pcsCoursePublishBottomAssem, int i) {
        super(1000L);
        this.$t = i;
        this.l0 = pcsCoursePublishBottomAssem;
    }

    public static final void LIZ$0(AbS689S0100000_7 abS689S0100000_7, View view) {
        if (view != null) {
            Function0<Unit> function0 = ((C511510K4f) abS689S0100000_7.l0).LIZJ;
            if (function0 == null) {
                function0 = null;
            }
            function0.invoke();
        }
    }

    public static final void LIZ$1(AbS689S0100000_7 abS689S0100000_7, View view) {
        if (view != null) {
            C497010JeN.LIZIZ();
            MultiLiveFeedsEntryFragment multiLiveFeedsEntryFragment = (MultiLiveFeedsEntryFragment) abS689S0100000_7.l0;
            multiLiveFeedsEntryFragment.LLILZIL = true;
            if (multiLiveFeedsEntryFragment.LLILZ == null) {
                if (multiLiveFeedsEntryFragment.LLILLL != null) {
                    multiLiveFeedsEntryFragment.NR();
                } else {
                    multiLiveFeedsEntryFragment.MR();
                }
            }
        }
    }

    public static final void LIZ$10(AbS689S0100000_7 abS689S0100000_7, View view) {
        if (view != null) {
            ((TreasureBoxDialog) abS689S0100000_7.l0).wS();
            ((IActionHandlerService) C1161920gLG.LIZJ(IActionHandlerService.class)).handle(((TreasureBoxDialog) abS689S0100000_7.l0).getContext(), "aweme://roma_redirect/?spark_page=treasure_box_super_fans_faq");
        }
    }

    public static final void LIZ$11(AbS689S0100000_7 abS689S0100000_7, View view) {
        Fragment fragmentLJI;
        FragmentManager childFragmentManager;
        if (view != null && (fragmentLJI = C724240Sb0.LJI((DetailTitleAssem) abS689S0100000_7.l0)) != null && (childFragmentManager = fragmentLJI.getChildFragmentManager()) != null) {
            String str = DetailSettingDialogFragment._pnsPageId;
            SubSpaceDetailVM subSpaceDetailVMHo = ((DetailTitleAssem) abS689S0100000_7.l0).Ho();
            C0K3S c0k3sGo = ((DetailTitleAssem) abS689S0100000_7.l0).Go();
            DetailSettingDialogFragment detailSettingDialogFragment = new DetailSettingDialogFragment();
            detailSettingDialogFragment.LLJLILLLLZIIL = subSpaceDetailVMHo;
            detailSettingDialogFragment.LLJLIL = c0k3sGo;
            detailSettingDialogFragment.show(childFragmentManager, "DetailSettingDialogFragment");
        }
    }

    public static final void LIZ$12(AbS689S0100000_7 abS689S0100000_7, View view) {
        if (view != null) {
            FakeSubSpaceEditorAssem.kp((FakeSubSpaceEditorAssem) abS689S0100000_7.l0, null, 0, 3);
        }
    }

    public static final void LIZ$13(AbS689S0100000_7 abS689S0100000_7, View view) {
        if (view != null) {
            FakeSubSpaceEditorAssem.kp((FakeSubSpaceEditorAssem) abS689S0100000_7.l0, null, 1, 1);
        }
    }

    public static final void LIZ$14(AbS689S0100000_7 abS689S0100000_7, View view) {
        if (view != null) {
            FakeSubSpaceEditorAssem.kp((FakeSubSpaceEditorAssem) abS689S0100000_7.l0, null, 2, 1);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x008b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LIZ$15(wh6.AbS689S0100000_7 r9, android.view.View r10) {
        /*
            if (r10 == 0) goto L84
            java.lang.Object r0 = r9.l0
            com.ss.android.ugc.aweme.subscription.pgc.business.perks.subspace.detail.view.assem.FakeSubSpaceEditorAssem r0 = (com.ss.android.ugc.aweme.subscription.pgc.business.perks.subspace.detail.view.assem.FakeSubSpaceEditorAssem) r0
            com.ss.android.ugc.aweme.subscription.pgc.business.perks.subspace.detail.vm.SubSpaceDetailVM r8 = r0.ip()
            android.text.Editable r0 = r8.Mq()
            if (r0 == 0) goto L73
            java.lang.String r7 = r0.toString()
            if (r7 == 0) goto L73
            X.0K3S r0 = r8.xQ2()
            r6 = 0
            if (r0 == 0) goto L3b
            java.lang.Long r0 = r0.LLJILJILJ
            if (r0 == 0) goto L3b
            long r2 = r0.longValue()
            X.0K3S r0 = r8.xQ2()
            if (r0 == 0) goto L3b
            java.util.HashMap<java.lang.Long, java.util.List<com.bytedance.android.livesdk.chatroom.api.AtWithIndex>> r1 = r0.LLJJ
            if (r1 == 0) goto L3b
            java.lang.Long r0 = java.lang.Long.valueOf(r2)
            java.lang.Object r5 = r1.get(r0)
            java.util.List r5 = (java.util.List) r5
            if (r5 != 0) goto L40
        L3b:
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
        L40:
            X.0K3S r0 = r8.xQ2()
            if (r0 == 0) goto L8b
            com.bytedance.android.livesdk.chatroom.api.SpaceCommentItem r4 = r0.LLJJI
        L48:
            X.0K3S r0 = r8.xQ2()
            if (r0 == 0) goto L73
            com.bytedance.android.livesdk.chatroom.api.SpacePost r3 = r0.LLILLL
            if (r3 == 0) goto L73
            if (r4 == 0) goto L87
            X.0K3S r0 = r8.xQ2()
            if (r0 == 0) goto L85
            java.lang.Long r2 = r0.LLJILJILJ
        L5c:
            long r0 = r4.commentId
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r2, r0)
            if (r0 == 0) goto L87
            r8.CN1(r4, r7, r5)
        L6b:
            X.0K3S r0 = r8.xQ2()
            if (r0 == 0) goto L73
            r0.LLJJI = r6
        L73:
            java.lang.Object r0 = r9.l0
            com.ss.android.ugc.aweme.subscription.pgc.business.perks.subspace.detail.view.assem.FakeSubSpaceEditorAssem r0 = (com.ss.android.ugc.aweme.subscription.pgc.business.perks.subspace.detail.view.assem.FakeSubSpaceEditorAssem) r0
            X.01GW r0 = r0.LLJJIJI
            java.lang.Object r1 = r0.getValue()
            android.widget.TextView r1 = (android.widget.TextView) r1
            java.lang.String r0 = ""
            r1.setText(r0)
        L84:
            return
        L85:
            r2 = r6
            goto L5c
        L87:
            r8.FF1(r7, r5, r3)
            goto L6b
        L8b:
            r4 = r6
            goto L48
        */
        throw new UnsupportedOperationException("Method not decompiled: wh6.AbS689S0100000_7.LIZ$15(wh6.AbS689S0100000_7, android.view.View):void");
    }

    public static final void LIZ$16(AbS689S0100000_7 abS689S0100000_7, View view) {
        if (view != null) {
            SuperFanJoinDialog superFanJoinDialog = (SuperFanJoinDialog) abS689S0100000_7.l0;
            if (superFanJoinDialog.LLJZ != null) {
                SuperFanViewModel.yQ2(superFanJoinDialog.getContext());
            }
        }
    }

    public static final void LIZ$17(AbS689S0100000_7 abS689S0100000_7, View view) {
        if (view != null) {
            ((SuperFanJoinDialog) abS689S0100000_7.l0).close(1);
        }
    }

    public static final void LIZ$18(AbS689S0100000_7 abS689S0100000_7, View view) {
        if (view != null) {
            ((PcsCoursePriceTierSheet) abS689S0100000_7.l0).zS();
        }
    }

    public static final void LIZ$19(AbS689S0100000_7 abS689S0100000_7, View view) {
        if (view != null) {
            PcsCourseVideoListAssem pcsCourseVideoListAssem = (PcsCourseVideoListAssem) abS689S0100000_7.l0;
            pcsCourseVideoListAssem.getClass();
            ((IHostSubscription) C1161920gLG.LIZJ(IHostSubscription.class)).kB2(C06MM.LIZ(pcsCourseVideoListAssem.getContext()));
            C489110JGb.LJIIL(((PcsCourseVideoListAssem) abS689S0100000_7.l0).ip(), "add", "click");
        }
    }

    public static final void LIZ$2(AbS689S0100000_7 abS689S0100000_7, View view) {
        DataChannel dataChannelLJ;
        if (view != null) {
            DataChannel dataChannelLJ2 = C475510Ikn.LJ((LiveFilterCommentSettingFragmentNew) abS689S0100000_7.l0);
            if (dataChannelLJ2 != null) {
                EnumC748580TYa enumC748580TYa = EnumC748580TYa.COMMENT_SETTING;
                enumC748580TYa.pre();
                dataChannelLJ2.zW(BroadcastDialogPageChannel.class, enumC748580TYa);
            }
            if (Intrinsics.LJFF(((LiveFilterCommentSettingFragmentNew) abS689S0100000_7.l0).LLJLLL, "from_broadcast_end") && (dataChannelLJ = C475510Ikn.LJ((LiveFilterCommentSettingFragmentNew) abS689S0100000_7.l0)) != null) {
                dataChannelLJ.LC0(BroadcastDialogPageCloseInternal.class, Boolean.TRUE);
            }
        }
    }

    public static final void LIZ$20(AbS689S0100000_7 abS689S0100000_7, View view) {
        if (view != null) {
            C0KX8 c0kx8 = (C0KX8) DataChannelGlobal.LLILZ.gg0(LiveBanCapabilityGlobalChannel.class);
            if (c0kx8 != null && c0kx8.LIZIZ) {
                C766270U4b.LIZLLL(2131844181);
                return;
            }
            DataChannel dataChannel = ((BasePreviewSettingMainFragmentSheetInitializer) abS689S0100000_7.l0).LLILLJJLI;
            if (dataChannel != null) {
                dataChannel.FQ2(DismissPreviewSettingDialogEvent.class);
            }
            C19EG c19egLJ = C500260Jjc.LJ(((BasePreviewSettingMainFragmentSheetInitializer) abS689S0100000_7.l0).LL.getContext());
            if (c19egLJ != null) {
                C497420Jf2.LIZ(c19egLJ, true, true);
            }
            C0UKZ.LLJJJIL.LJFF(Boolean.FALSE);
            C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_room_detail_setting");
            c474500IjALIZ.LJIL();
            ((ISubscribeService) C1161920gLG.LIZJ(ISubscribeService.class)).ei();
            c474500IjALIZ.LJJIIZI(C494680Jac.LJIIZILJ(C517110KPt.LIZIZ()));
            c474500IjALIZ.LJ("click");
            c474500IjALIZ.LIZ();
        }
    }

    public static final void LIZ$21(AbS689S0100000_7 abS689S0100000_7, View view) {
        if (view != null) {
            ((PcsCoursePriceTierSheetV2) abS689S0100000_7.l0).zS();
        }
    }

    public static final void LIZ$22(AbS689S0100000_7 abS689S0100000_7, View view) {
        InterfaceC489200JGk interfaceC489200JGk;
        C0JH1 c0jh1LJIIIIZZ;
        long jLJ;
        if (view != null && (interfaceC489200JGk = ((CourseVideoListCell) abS689S0100000_7.l0).LLJILLL) != null && (c0jh1LJIIIIZZ = interfaceC489200JGk.LJIIIIZZ()) != null && c0jh1LJIIIIZZ.isUploaded()) {
            IPcsCourseActivityAbility iPcsCourseActivityAbility = (IPcsCourseActivityAbility) C1558520qew.LIZ(GScope.LL, IPcsCourseActivityAbility.class, null);
            if (iPcsCourseActivityAbility != null) {
                InterfaceC489200JGk interfaceC489200JGk2 = ((CourseVideoListCell) abS689S0100000_7.l0).LLJILLL;
                if (interfaceC489200JGk2 != null) {
                    jLJ = interfaceC489200JGk2.LJ(true);
                } else {
                    jLJ = -1;
                }
                iPcsCourseActivityAbility.O52(jLJ, ((CourseVideoListCell) abS689S0100000_7.l0).LLJILLL);
            }
            C489110JGb.LJIIJJI(((CourseVideoListCell) abS689S0100000_7.l0).L5(), ((CourseVideoListCell) abS689S0100000_7.l0).LLJILLL, "cover", "click");
        }
    }

    public static final void LIZ$23(AbS689S0100000_7 abS689S0100000_7, View view) {
        if (view != null) {
            ((C490990JNh) abS689S0100000_7.l0).LIZLLL();
        }
    }

    public static final void LIZ$24(AbS689S0100000_7 abS689S0100000_7, View view) {
        if (view != null) {
            C23250099c.LIZLLL(((C490990JNh) abS689S0100000_7.l0).getCoroutineScope(), null, null, new C491000JNi((C490990JNh) abS689S0100000_7.l0, null), 3);
        }
    }

    public static final void LIZ$25(AbS689S0100000_7 abS689S0100000_7, View view) {
        C19EG c19egLIZ;
        FragmentManager supportFragmentManager;
        SubSpaceFeedVM subSpaceFeedVMHo;
        C511370K3r c511370K3rWQ2;
        if (view != null && (c19egLIZ = C724240Sb0.LIZ((SpaceFeedTitleAssem) abS689S0100000_7.l0)) != null && (supportFragmentManager = c19egLIZ.getSupportFragmentManager()) != null && (c511370K3rWQ2 = (subSpaceFeedVMHo = ((SpaceFeedTitleAssem) abS689S0100000_7.l0).Ho()).wQ2()) != null) {
            C0K4Y c0k4y = SubSpaceSettingFragment.LLJILJIL;
            int i = c511370K3rWQ2.LLJI;
            String str = c511370K3rWQ2.LLJIJIL;
            c0k4y.getClass();
            SubSpaceSettingFragment subSpaceSettingFragment = new SubSpaceSettingFragment();
            subSpaceSettingFragment.LLILLL = str;
            subSpaceSettingFragment.LLILZ = i;
            C19EH c19ehLJIIJ = supportFragmentManager.LJIIJ();
            c19ehLJIIJ.LJIJJ(R.anim.mg, R.anim.f487ms);
            c19ehLJIIJ.LIZJ(i, subSpaceSettingFragment, "SubOnlySpaceSettingFragment");
            c19ehLJIIJ.LJII("SubOnlySpaceSettingFragment");
            c19ehLJIIJ.LJIIJ();
            subSpaceFeedVMHo.xQ2().LIZLLL("setting", c511370K3rWQ2.LLILZLL, subSpaceFeedVMHo.AQ2());
        }
    }

    public static final void LIZ$26(AbS689S0100000_7 abS689S0100000_7, View view) {
        String str;
        C11NZ<DataResponse<PGCSpaceJoinResponse>> c11nzJoinSpace;
        C11NZ c11nz;
        if (view != null) {
            AssemVMLazy assemVMLazy = ((JoinSubSpaceAssem) abS689S0100000_7.l0).LLJJI;
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = JoinSubSpaceAssem.LLJJIII;
            SubSpaceFeedVM subSpaceFeedVM = (SubSpaceFeedVM) assemVMLazy.getValue();
            AFwS193S0000000_7 aFwS193S0000000_7 = AFwS193S0000000_7.get$arr$(286);
            AwS586S0100000_7 awS586S0100000_7 = new AwS586S0100000_7((JoinSubSpaceAssem) abS689S0100000_7.l0, 444);
            C511370K3r c511370K3rWQ2 = subSpaceFeedVM.wQ2();
            if (c511370K3rWQ2 != null && (str = c511370K3rWQ2.LLILZ) != null && (c11nzJoinSpace = C0K4J.LIZ().joinSpace(str)) != null && (c11nz = (C11NZ) C0JCK.LIZ(c11nzJoinSpace, EnumC499440JiI.GENERAL, "SubSpaceFeedVM", "sub/space/join", null, 8).LJL(C11S5.LIZ()).LJIILIIL(new C0UJ2()).LJJJLZIJ(C1701940uOG.LIZIZ()).LIZJ(new C0TCF(subSpaceFeedVM))) != null) {
                c11nz.LJJLL(new AfS143S0200000_7((Object) aFwS193S0000000_7, (EmoteModel) subSpaceFeedVM, (InterfaceC1631620sYq<? super EmoteModel, ? super String, ? super Integer, Unit>) 37), new AfS172S0100000_3((Object) awS586S0100000_7, 66));
            }
        }
    }

    public static final void LIZ$27(AbS689S0100000_7 abS689S0100000_7, View view) {
        C19EG c19egLIZ;
        FragmentManager supportFragmentManager;
        if (view != null && (c19egLIZ = C724240Sb0.LIZ((SpaceFeedTitleAssem) abS689S0100000_7.l0)) != null && (supportFragmentManager = c19egLIZ.getSupportFragmentManager()) != null) {
            C1390850mIV c1390850mIV = new C1390850mIV();
            C1247510iZJ[] c1247510iZJArr = new C1247510iZJ[2];
            C1247510iZJ c1247510iZJ = new C1247510iZJ();
            String strLJII = C511520K4g.LJII(2131849264);
            if (strLJII == null) {
                strLJII = "";
            }
            c1247510iZJ.LIZ = strLJII;
            c1247510iZJ.LIZ(new AwS586S0100000_7((SpaceFeedTitleAssem) abS689S0100000_7.l0, 446));
            c1247510iZJArr[0] = c1247510iZJ;
            C1247510iZJ c1247510iZJ2 = new C1247510iZJ();
            String strLJII2 = C511520K4g.LJII(2131849265);
            if (strLJII2 == null) {
                strLJII2 = "";
            }
            c1247510iZJ2.LIZ = strLJII2;
            c1247510iZJ2.LIZ(new AwS586S0100000_7((SpaceFeedTitleAssem) abS689S0100000_7.l0, 447));
            c1247510iZJArr[1] = c1247510iZJ2;
            c1390850mIV.LIZIZ(c1247510iZJArr);
            c1390850mIV.LIZJ().show(supportFragmentManager, "");
        }
    }

    public static final void LIZ$28(AbS689S0100000_7 abS689S0100000_7, View view) {
        if (view != null) {
            FansClubJoinDialog fansClubJoinDialog = (FansClubJoinDialog) abS689S0100000_7.l0;
            if (fansClubJoinDialog.LLL != null) {
                SuperFanViewModel.yQ2(fansClubJoinDialog.getContext());
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v60, types: [X.0JHP] */
    public static final void LIZ$29(AbS689S0100000_7 abS689S0100000_7, View view) {
        C489400JHe c489400JHeKp;
        EnumC489360JHa enumC489360JHa;
        String str;
        long duration;
        EditPreviewInfo previewInfo;
        List<EditVideoSegment> videoList;
        EditVideoSegment editVideoSegment;
        VideoFileInfo videoFileInfo;
        CreativeModel creativeModel;
        PcsCourseVideoModel pcsCourseVideoModel;
        if (view != null && (c489400JHeKp = ((PcsCoursePublishBottomAssem) abS689S0100000_7.l0).kp()) != null && (enumC489360JHa = c489400JHeKp.LL) != null) {
            int i = C0JHW.LIZ[enumC489360JHa.ordinal()];
            EnumC489360JHa enumC489360JHa2 = null;
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        throw new C1954807lC();
                    }
                } else {
                    PublishModel publishModel = ((PcsCoursePublishBottomAssem) abS689S0100000_7.l0).ip().getState().LLILZIL;
                    if (publishModel != null) {
                        final PcsCoursePublishBottomAssem pcsCoursePublishBottomAssem = (PcsCoursePublishBottomAssem) abS689S0100000_7.l0;
                        PcsVideoReEditVm pcsVideoReEditVmIp = pcsCoursePublishBottomAssem.ip();
                        C489190JGj c489190JGj = new C489190JGj(0.0f);
                        pcsVideoReEditVmIp.getClass();
                        pcsVideoReEditVmIp.setState(new AwS586S0100000_7((AbstractC489130JGd) c489190JGj, 500));
                        C0JHI c0jhiLIZ = C1443310nf7.LIZIZ.LIZ();
                        if (c0jhiLIZ != 0) {
                            c0jhiLIZ.LIZJ(publishModel, new AbstractC489980JJk() { // from class: X.0JHP
                                @Override // X.AbstractC1433570nPP
                                public final void onFinish(AbstractC1433460nPE abstractC1433460nPE, Object obj, PublishModel publishModel2) {
                                    if (abstractC1433460nPE instanceof C492380JSq) {
                                        EditPostResponse editPostResponse = ((C492380JSq) abstractC1433460nPE).LIZ;
                                        if (editPostResponse.statusCode == 0 && editPostResponse.bizErrorCode == 0) {
                                            PcsVideoReEditVm pcsVideoReEditVmIp2 = pcsCoursePublishBottomAssem.ip();
                                            C489180JGi c489180JGi = C489180JGi.LIZ;
                                            pcsVideoReEditVmIp2.getClass();
                                            pcsVideoReEditVmIp2.setState(new AwS586S0100000_7((AbstractC489130JGd) c489180JGi, 500));
                                            C500260Jjc.LJJLIIIJJIZ(new AwS551S0100000_7(pcsCoursePublishBottomAssem, 754));
                                            C489300JGu.LIZ = pcsCoursePublishBottomAssem.ip().getState().LLILLL;
                                            return;
                                        }
                                        PcsVideoReEditVm pcsVideoReEditVmIp3 = pcsCoursePublishBottomAssem.ip();
                                        C489170JGh c489170JGh = C489170JGh.LIZ;
                                        pcsVideoReEditVmIp3.getClass();
                                        pcsVideoReEditVmIp3.setState(new AwS586S0100000_7((AbstractC489130JGd) c489170JGh, 500));
                                        C500260Jjc.LJJLIIIJJIZ(new AwS551S0100000_7(abstractC1433460nPE, 755));
                                        return;
                                    }
                                    if (!(abstractC1433460nPE instanceof C1433450nPD)) {
                                        return;
                                    }
                                    PcsVideoReEditVm pcsVideoReEditVmIp4 = pcsCoursePublishBottomAssem.ip();
                                    C489170JGh c489170JGh2 = C489170JGh.LIZ;
                                    pcsVideoReEditVmIp4.getClass();
                                    pcsVideoReEditVmIp4.setState(new AwS586S0100000_7((AbstractC489130JGd) c489170JGh2, 500));
                                    C500260Jjc.LJJLIIIJJIZ(AFwS193S0000000_7.get$arr$(306));
                                }
                            });
                        }
                    } else {
                        return;
                    }
                }
            } else {
                PublishModel publishModel2 = ((C0JHK) ((AssemViewModel) ((PcsCoursePublishBottomAssem) abS689S0100000_7.l0).LLJJIII.getValue()).getState()).LLILLJJLI;
                if (publishModel2 != null) {
                    ((PcsCoursePublishBottomAssem) abS689S0100000_7.l0).LLJJIII.getValue();
                    BPEAHandler bPEAHandler = C0JHA.LIZ;
                    String strLIZLLL = C1443310nf7.LIZIZ.LIZ().LIZLLL(publishModel2, C0JHA.LJI, C0JHN.NEW_TASK);
                    if (strLIZLLL != null) {
                        synchronized (C0JHA.LIZLLL) {
                            try {
                                C0JHA.LIZJ.add(strLIZLLL);
                            } catch (Throwable th) {
                                TryCatchGuardChecker.doCheck(th);
                                throw th;
                            }
                        }
                    }
                    publishModel2.expectPublishTaskId = strLIZLLL;
                    C0JH1 c0jh1 = C0JH1.UPLOAD_IN_PROGRESS;
                    C0JH6 c0jh6 = new C0JH6(((C0JHK) ((AssemViewModel) ((PcsCoursePublishBottomAssem) abS689S0100000_7.l0).LLJJIII.getValue()).getState()).LL, 2);
                    VideoPublishEditModel videoPublishEditModelLIZ = C489560JHu.LIZ(publishModel2);
                    if (videoPublishEditModelLIZ == null || (creativeModel = videoPublishEditModelLIZ.creativeModel) == null || (pcsCourseVideoModel = creativeModel.pcsPaidVideoMediaModel) == null || (str = pcsCourseVideoModel.videoTitle) == null) {
                        str = "";
                    }
                    VideoPublishEditModel videoPublishEditModelLIZ2 = C489560JHu.LIZ(publishModel2);
                    if (videoPublishEditModelLIZ2 != null && (previewInfo = videoPublishEditModelLIZ2.getPreviewInfo()) != null && (videoList = previewInfo.getVideoList()) != null && (editVideoSegment = (EditVideoSegment) ListProtector.get(videoList, 0)) != null && (videoFileInfo = editVideoSegment.getVideoFileInfo()) != null) {
                        duration = videoFileInfo.getDuration();
                    } else {
                        duration = 0;
                    }
                    C0JHG c0jhg = new C0JHG();
                    c0jhg.LIZ = c0jh1;
                    c0jhg.LIZIZ = c0jh6;
                    c0jhg.LIZJ = str;
                    c0jhg.LIZLLL = duration;
                    c0jhg.LJI = publishModel2;
                    C489310JGv.LIZ = c0jhg;
                    ((PcsCoursePublishBottomAssem) abS689S0100000_7.l0).hp();
                }
            }
            C489400JHe c489400JHeKp2 = ((PcsCoursePublishBottomAssem) abS689S0100000_7.l0).kp();
            if (c489400JHeKp2 != null) {
                enumC489360JHa2 = c489400JHeKp2.LL;
            }
            C489320JGw.LIZIZ(enumC489360JHa2, ((PcsCourseManageVM) ((PcsCoursePublishBottomAssem) abS689S0100000_7.l0).LLJJIJIL.getValue()).zQ2(), (PcsVideoEditVM) ((PcsCoursePublishBottomAssem) abS689S0100000_7.l0).LLJJIJI.getValue(), false, "publish", null, 32);
        }
    }

    public static final void LIZ$3(AbS689S0100000_7 abS689S0100000_7, View view) {
        DataChannel dataChannelLJ;
        if (view != null) {
            DataChannel dataChannelLJ2 = C475510Ikn.LJ((LiveAIReplySettingFragment) abS689S0100000_7.l0);
            if (dataChannelLJ2 != null) {
                EnumC748580TYa enumC748580TYa = EnumC748580TYa.GUIDE;
                enumC748580TYa.pre();
                dataChannelLJ2.zW(BroadcastDialogPageChannel.class, enumC748580TYa);
            }
            if (Intrinsics.LJFF(((LiveAIReplySettingFragment) abS689S0100000_7.l0).LLJLLL, "from_broadcast_end") && (dataChannelLJ = C475510Ikn.LJ((LiveAIReplySettingFragment) abS689S0100000_7.l0)) != null) {
                dataChannelLJ.LC0(BroadcastDialogPageCloseInternal.class, Boolean.TRUE);
            }
        }
    }

    public static final void LIZ$30(AbS689S0100000_7 abS689S0100000_7, View view) {
        if (view != null) {
            SubSpaceNewPostVM subSpaceNewPostVMGo = ((SendSpacePostAssem) abS689S0100000_7.l0).Go();
            if (subSpaceNewPostVMGo.EQ2()) {
                PGCPostCreateReq pGCPostCreateReqCQ2 = subSpaceNewPostVMGo.CQ2();
                if (pGCPostCreateReqCQ2 != null) {
                    subSpaceNewPostVMGo.BQ2(pGCPostCreateReqCQ2);
                    return;
                }
                return;
            }
            PGCPostCreateReq pGCPostCreateReqWQ2 = subSpaceNewPostVMGo.wQ2(null);
            if (pGCPostCreateReqWQ2 == null) {
                return;
            }
            subSpaceNewPostVMGo.BQ2(pGCPostCreateReqWQ2);
        }
    }

    public static final void LIZ$31(AbS689S0100000_7 abS689S0100000_7, View view) {
        if (view != null) {
            ((C0IQR) abS689S0100000_7.l0).getClass();
        }
    }

    public static final void LIZ$32(AbS689S0100000_7 abS689S0100000_7, View view) {
        String string;
        if (view != null) {
            C1397580mTM c1397580mTM = new C1397580mTM(((TTSVoiceDetailsFragment) abS689S0100000_7.l0).requireContext());
            c1397580mTM.LJII = false;
            Context context = ((TTSVoiceDetailsFragment) abS689S0100000_7.l0).getContext();
            if (context == null || (string = context.getString(2131858316)) == null) {
                string = "";
            }
            c1397580mTM.LIZIZ(string);
            C985403tE.LIZ(c1397580mTM, new AwS586S0100000_7((TTSVoiceDetailsFragment) abS689S0100000_7.l0, 575));
            new C1397510mTF(c1397580mTM).LIZLLL();
        }
    }

    public static final void LIZ$4(AbS689S0100000_7 abS689S0100000_7, View view) {
        if (view != null) {
            Long lLIZIZ = C0KPJ.Qe.LIZIZ();
            if (lLIZIZ == null || lLIZIZ.longValue() != 0) {
                RedDotExtensionKt.LIZ(C0UX6.LIVE_GENERAL_SETTINGS_ONE_STOP_SHOP);
            }
            ((BasePreviewSettingMainFragmentSheetInitializer) abS689S0100000_7.l0).LJJIJLIJ("click");
            C0JJO c0jjoXf = ((IPcsService) C1161920gLG.LIZJ(IPcsService.class)).xf();
            Bundle bundle = new Bundle();
            C786410Ut5.LJJJI("enter_from", "stable_entrance", bundle);
            OneStopSheetFragment oneStopSheetFragmentLIZLLL = c0jjoXf.LIZLLL(bundle);
            if ((oneStopSheetFragmentLIZLLL instanceof LiveSheetFragment) && oneStopSheetFragmentLIZLLL != null) {
                ((BasePreviewSettingMainFragmentSheetInitializer) abS689S0100000_7.l0).LLILLL.LJIIJ(oneStopSheetFragmentLIZLLL, "live_smb_one_stop_sheet");
            }
        }
    }

    public static final void LIZ$5(AbS689S0100000_7 abS689S0100000_7, View view) {
        if (view != null) {
            LiveProfileSheet liveProfileSheet = (LiveProfileSheet) abS689S0100000_7.l0;
            liveProfileSheet.LLLLIILLL = true;
            AbstractC496140Jcy<?> abstractC496140Jcy = liveProfileSheet.LLJZ;
            if (abstractC496140Jcy != null) {
                LifecycleCoroutineScope lifecycleScope = LifecycleOwnerKt.getLifecycleScope(liveProfileSheet);
                C23250099c.LIZLLL(lifecycleScope, abstractC496140Jcy.LJ, null, new C05JW(abstractC496140Jcy, abstractC496140Jcy.LIZ(lifecycleScope, abstractC496140Jcy.LIZ.LIZJ.LJIIIIZZ), null), 2);
            }
        }
    }

    public static final void LIZ$6(AbS689S0100000_7 abS689S0100000_7, View view) {
        if (view != null) {
            ((SpaceEditorAssem) abS689S0100000_7.l0).Ho();
        }
    }

    public static final void LIZ$7(AbS689S0100000_7 abS689S0100000_7, View view) {
        if (view != null) {
            ((TryModeLiveProfileDialog) abS689S0100000_7.l0).getClass();
            TryModeLiveProfileDialog tryModeLiveProfileDialog = (TryModeLiveProfileDialog) abS689S0100000_7.l0;
            tryModeLiveProfileDialog.getClass();
            tryModeLiveProfileDialog.MR(new AwS551S0100000_7(tryModeLiveProfileDialog, 657));
        }
    }

    public static final void LIZ$8(AbS689S0100000_7 abS689S0100000_7, View view) {
        C0K3S c0k3sHp;
        String str;
        String str2;
        FragmentManager supportFragmentManager;
        if (view != null && (c0k3sHp = ((DetailBackToSpaceAssem) abS689S0100000_7.l0).hp()) != null) {
            int i = c0k3sHp.LLJJIJI;
            C0K3S c0k3sHp2 = ((DetailBackToSpaceAssem) abS689S0100000_7.l0).hp();
            if (c0k3sHp2 == null || (str = c0k3sHp2.LLILLJJLI) == null) {
                str = "";
            }
            Bundle bundle = new Bundle();
            C0K3S c0k3sHp3 = ((DetailBackToSpaceAssem) abS689S0100000_7.l0).hp();
            if (c0k3sHp3 != null) {
                str2 = c0k3sHp3.LLJIJIL;
            } else {
                str2 = null;
            }
            C786410Ut5.LJJJI("sec_anchor_id", str2, bundle);
            C19EG c19egLIZ = C724240Sb0.LIZ((DetailBackToSpaceAssem) abS689S0100000_7.l0);
            if (c19egLIZ != null && (supportFragmentManager = c19egLIZ.getSupportFragmentManager()) != null) {
                SubSpaceFeedFragment.LLJILJILJ.getClass();
                SubSpaceFeedFragment subSpaceFeedFragment = new SubSpaceFeedFragment();
                subSpaceFeedFragment.LLILLL = str;
                subSpaceFeedFragment.LLILZ = i;
                subSpaceFeedFragment.setArguments(bundle);
                C19EH c19ehLJIIJ = supportFragmentManager.LJIIJ();
                c19ehLJIIJ.LJIJJ(R.anim.mg, R.anim.f487ms);
                c19ehLJIIJ.LIZJ(i, subSpaceFeedFragment, "SubOnlySpaceFeedFragment");
                c19ehLJIIJ.LJII("SubOnlySpaceFeedFragment");
                c19ehLJIIJ.LJIIJ();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x004c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LIZ$9(wh6.AbS689S0100000_7 r3, android.view.View r4) {
        /*
            if (r4 == 0) goto L4b
            java.lang.Object r0 = r3.l0
            com.bytedance.android.livesdk.revenue.level.impl.superfan.treasurebox.TreasureBoxDialog r0 = (com.bytedance.android.livesdk.revenue.level.impl.superfan.treasurebox.TreasureBoxDialog) r0
            r0.wS()
            java.lang.Class<com.bytedance.android.live.actionhandler.IActionHandlerService> r0 = com.bytedance.android.live.actionhandler.IActionHandlerService.class
            X.006A r2 = X.C1161920gLG.LIZJ(r0)
            com.bytedance.android.live.actionhandler.IActionHandlerService r2 = (com.bytedance.android.live.actionhandler.IActionHandlerService) r2
            java.lang.Object r0 = r3.l0
            com.bytedance.android.livesdk.revenue.level.impl.superfan.treasurebox.TreasureBoxDialog r0 = (com.bytedance.android.livesdk.revenue.level.impl.superfan.treasurebox.TreasureBoxDialog) r0
            android.content.Context r1 = r0.getContext()
            java.lang.String r0 = "aweme://roma_redirect/?spark_page=treasure_box_superfans_history"
            r2.handle(r1, r0)
            java.lang.Object r0 = r3.l0
            com.bytedance.android.livesdk.revenue.level.impl.superfan.treasurebox.TreasureBoxDialog r0 = (com.bytedance.android.livesdk.revenue.level.impl.superfan.treasurebox.TreasureBoxDialog) r0
            com.bytedance.ies.sdk.datachannel.DataChannel r3 = X.C475510Ikn.LJ(r0)
            java.lang.String r0 = "livesdk_redpacket_history_click"
            X.0IjA r2 = X.C0IJT.LIZ(r0)
            r2.LJIJJLI(r3)
            java.lang.String r1 = "redpacket_type"
            java.lang.String r0 = "super_fan"
            r2.LJJII(r0, r1)
            if (r3 == 0) goto L4c
            boolean r1 = X.C500260Jjc.LJIIZILJ(r3)
            r0 = 1
            if (r1 != r0) goto L4c
        L3f:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            java.lang.String r0 = "is_anchor"
            r2.LJJII(r1, r0)
            r2.LIZ()
        L4b:
            return
        L4c:
            r0 = 0
            goto L3f
        */
        throw new UnsupportedOperationException("Method not decompiled: wh6.AbS689S0100000_7.LIZ$9(wh6.AbS689S0100000_7, android.view.View):void");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbS689S0100000_7(Object obj, int i) {
        super(300L);
        this.$t = i;
        this.l0 = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbS689S0100000_7(C0IQR c0iqr, int i, BannerInRoom bannerInRoom, int i2) {
        super(500L);
        this.$t = i2;
        this.l0 = c0iqr;
    }
}
