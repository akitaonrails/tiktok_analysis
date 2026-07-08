package kotlin.jvm.internal;

import X.AbstractC316870CbV;
import X.AnonymousClass1814;
import X.C013C;
import X.C036E;
import X.C050S;
import X.C09AY;
import X.C0MAE;
import X.C0OKY;
import X.C0OOC;
import X.C0OTK;
import X.C0OTS;
import X.C0OVX;
import X.C0P3U;
import X.C0PEM;
import X.C0R60;
import X.C118300cf;
import X.C1391190mJ3;
import X.C1397510mTF;
import X.C1397580mTM;
import X.C1397620mTQ;
import X.C13BV;
import X.C1623606Xi;
import X.C1731680vAE;
import X.C1759440vt0;
import X.C19719212De;
import X.C19EG;
import X.C20656615sK;
import X.C20684815ws;
import X.C2097608Jq;
import X.C2126308Ur;
import X.C2296808zG;
import X.C23250099c;
import X.C2344009Gk;
import X.C259800zU;
import X.C291001Au;
import X.C343930De3;
import X.C343970De7;
import X.C594280NSo;
import X.C607780Nse;
import X.C618790OOv;
import X.C623900OdY;
import X.C626800OiE;
import X.C627300Oj2;
import X.C631220OpM;
import X.C631640Oq2;
import X.C632070Oqj;
import X.C632090Oql;
import X.C632990OsD;
import X.C634210OuB;
import X.C635080Ova;
import X.C635090Ovb;
import X.C635110Ovd;
import X.C635120Ove;
import X.C635200Ovm;
import X.C636230OxR;
import X.C705930RmZ;
import X.C786410Ut5;
import X.C844470XAv;
import X.C946803n0;
import X.C985403tE;
import X.EnumC323450Cm7;
import X.EnumC624750Oev;
import X.EnumC635130Ovf;
import X.InterfaceC1209780haS;
import X.InterfaceC1680500tpg;
import X.InterfaceC420801kM;
import X.InterfaceC624050Odn;
import X.InterfaceC635180Ovk;
import X.InterfaceC636240OxS;
import Y.ARunnableS18S0400000_9;
import android.content.Context;
import android.os.Looper;
import android.view.View;
import android.widget.LinearLayout;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.ViewModelKt;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.android.livesdk.livesetting.subscription.LiveSubscriptionQuestionnaireHourFrequencySetting;
import com.bytedance.assem.arch.core.Assembler;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.ext_power_list.AssemListViewModel;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.sheet.actionsheet.TuxActionSheet;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.addyours.model.AddYoursStickerStruct;
import com.ss.android.ugc.aweme.anchor.service.ITemplateAnchorStrategyService;
import com.ss.android.ugc.aweme.detail.component.biz.TemplateBottomComponent;
import com.ss.android.ugc.aweme.detail.vm.BaseDetailShareVM;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.inbox.bulletin.comment.BulletinCommentSheetFragment;
import com.ss.android.ugc.aweme.inbox.bulletin.comment.vm.BulletinCommentActionViewModel;
import com.ss.android.ugc.aweme.inbox.bulletin.data.item.BulletinBaseItem;
import com.ss.android.ugc.aweme.inbox.bulletin.share.BulletinShareModel;
import com.ss.android.ugc.aweme.inbox.bulletin.viewmodel.BulletinListViewModel;
import com.ss.android.ugc.aweme.inbox.bulletin.viewmodel.BulletinPollCreateViewModel;
import com.ss.android.ugc.aweme.inbox.workbench.ability.WorkbenchCardAbility;
import com.ss.android.ugc.aweme.inbox.workbench.viewmodel.WorkBenchViewModel;
import com.ss.android.ugc.aweme.music.assem.MusicListArtistCertificationAssem;
import com.ss.android.ugc.aweme.music.service.ProfileMusicTabService;
import com.ss.android.ugc.aweme.music.v2.assem.MusicDetailListAssem;
import com.ss.android.ugc.aweme.music.vm.MusicPlayViewModel;
import com.ss.android.ugc.aweme.music.vm.OriginMusicListViewModel;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BulletinAccountEditResponse;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BulletinBoardInfo;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BulletinFetchEvent;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BulletinPoll;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BulletinPollOption;
import com.ss.android.ugc.aweme.notice.repo.list.bean.MissionStruct;
import com.ss.android.ugc.aweme.offlinemode.ui.sheet.OfflineModeSheetPageFragment;
import com.ss.android.ugc.aweme.prefab.ListAssem;
import com.ss.android.ugc.aweme.prefab.NetworkHelper;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.ss.android.ugc.aweme.template.TemplateAnchorConfig;
import com.ss.android.ugc.aweme.template.assem.TemplateShootAssem;
import com.ss.android.ugc.aweme.topic.review.list.TopicReviewCell;
import com.ss.android.ugc.aweme.topic.review.model.TopicReview;
import com.ss.android.ugc.aweme.topic.review.panel.TopicReviewPanel;
import com.ss.android.ugc.aweme.vibefeed.feed.VibeDetailSharedVM;
import com.ss.android.ugc.aweme.vibefeed.feed.interact.digg.VibeFeedDiggDetailListAssem;
import com.ss.android.ugc.aweme.vibefeed.feed.viewmodel.VibeFeedDiggDetailListVM;
import com.tts.oecverify.BdTuring;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes10.dex */
public class AwS218S0300000_9 extends C09AY implements Function1 {
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
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS218S0300000_9 awS218S0300000_9, Object obj) {
        VibeFeedDiggDetailListVM vibeFeedDiggDetailListVM = null;
        ((NetworkHelper) awS218S0300000_9.l0).LIZ((Throwable) obj, null);
        VibeFeedDiggDetailListVM vibeFeedDiggDetailListVMMp = ((VibeFeedDiggDetailListAssem) awS218S0300000_9.l1).mp();
        if (vibeFeedDiggDetailListVMMp instanceof BaseDetailShareVM) {
            vibeFeedDiggDetailListVM = vibeFeedDiggDetailListVMMp;
        }
        if (vibeFeedDiggDetailListVM == null || vibeFeedDiggDetailListVM.LJIIJJI()) {
            ((C627300Oj2) awS218S0300000_9.l2).LLILLL = true;
        }
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS218S0300000_9 awS218S0300000_9, Object obj) {
        C0MAE c0mae = (C0MAE) obj;
        ((Function2) awS218S0300000_9.l0).invoke(c0mae, (InterfaceC636240OxS) awS218S0300000_9.l1);
        if (C636230OxR.LIZ((InterfaceC636240OxS) awS218S0300000_9.l1)) {
            c0mae.LIZIZ(null, null, new C19719212De(-1297799967, new AwS653S0100000_4((Function2) awS218S0300000_9.l2, (Function2<? super InterfaceC1680500tpg, ? super Integer, Unit>) 1), true));
        }
        return Unit.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$10(AwS218S0300000_9 awS218S0300000_9, Object obj) {
        C786410Ut5.LJJZZIII(new BPEAHandler(Looper.getMainLooper()), new ARunnableS18S0400000_9((C631220OpM) obj, (MusicModel) awS218S0300000_9.l0, (MusicPlayViewModel) awS218S0300000_9.l1, (C632090Oql) awS218S0300000_9.l2, 4));
        return Unit.LIZ;
    }

    public static final Object invoke$11(AwS218S0300000_9 awS218S0300000_9, Object obj) {
        ((Assembler) obj).QQ2((OfflineModeSheetPageFragment) awS218S0300000_9.l0, new AwS375S0200000_9((View) awS218S0300000_9.l1, (EnumC624750Oev) awS218S0300000_9.l2, 91));
        return Unit.LIZ;
    }

    public static final Object invoke$12(AwS218S0300000_9 awS218S0300000_9, Object obj) {
        if (((Boolean) obj).booleanValue()) {
            ITemplateAnchorStrategyService iTemplateAnchorStrategyService = (ITemplateAnchorStrategyService) awS218S0300000_9.l0;
            C19EG c19eg = ((TemplateShootAssem) awS218S0300000_9.l1).LLJJJJ;
            if (c19eg == null) {
                c19eg = null;
            }
            iTemplateAnchorStrategyService.LIZ(c19eg, (TemplateAnchorConfig) awS218S0300000_9.l2, true);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$13(AwS218S0300000_9 awS218S0300000_9, Object obj) {
        ((TopicReviewCell) awS218S0300000_9.l0).I5().LLILLL.put("enter_method", "edit_review");
        C626800OiE.LIZ(TopicReviewPanel.LLJJI, (FragmentManager) awS218S0300000_9.l1, null, (TopicReview) awS218S0300000_9.l2, true, null, 18);
        return Unit.LIZ;
    }

    public static final Object invoke$14(AwS218S0300000_9 awS218S0300000_9, Object obj) {
        long jLongValue;
        String text;
        C0R60 c0r60;
        String str;
        Long topicId;
        C343930De3 c343930De3 = (C343930De3) obj;
        c343930De3.setPreSelectedUser(C13BV.INSTANCE);
        Pair[] pairArr = new Pair[5];
        AddYoursStickerStruct addYoursStickerStruct = ((InteractStickerStruct) awS218S0300000_9.l0).getAddYoursStickerStruct();
        if (addYoursStickerStruct != null && (topicId = addYoursStickerStruct.getTopicId()) != null) {
            jLongValue = topicId.longValue();
        } else {
            jLongValue = 0;
        }
        pairArr[0] = new Pair("topic_id", Long.valueOf(jLongValue));
        AddYoursStickerStruct addYoursStickerStruct2 = ((InteractStickerStruct) awS218S0300000_9.l0).getAddYoursStickerStruct();
        String str2 = "";
        if (addYoursStickerStruct2 == null || (text = addYoursStickerStruct2.getText()) == null) {
            text = "";
        }
        pairArr[1] = new Pair("extra_topic_title", text);
        C705930RmZ c705930RmZ = (C705930RmZ) awS218S0300000_9.l1;
        if (c705930RmZ != null && (c0r60 = c705930RmZ.LJIIZILJ) != null && (str = c0r60.LIZ) != null) {
            str2 = str;
        }
        pairArr[2] = new Pair("enter_from", str2);
        pairArr[3] = new Pair("enter_method", "self_video_add_yours_sticker");
        pairArr[4] = new Pair("aweme", (Aweme) awS218S0300000_9.l2);
        c343930De3.setExtras(C2097608Jq.LJIIIIZZ(pairArr));
        return Unit.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v3, types: [X.0Ove] */
    public static final Object invoke$15(AwS218S0300000_9 awS218S0300000_9, Object obj) {
        String strLIZ;
        boolean z;
        int value;
        WorkBenchViewModel mainVm = ((C635090Ovb) awS218S0300000_9.l0).getMainVm();
        boolean z2 = true;
        if (mainVm != null) {
            MissionStruct missionStruct = (MissionStruct) awS218S0300000_9.l1;
            int i = missionStruct.sourceType;
            int i2 = missionStruct.subSourceType;
            int i3 = missionStruct.unsubscribeStatus;
            EnumC635130Ovf enumC635130Ovf = EnumC635130Ovf.UNSUBSCRIBE;
            if (i3 == enumC635130Ovf.getValue()) {
                z = true;
            } else {
                z = false;
            }
            final MissionStruct missionStruct2 = (MissionStruct) awS218S0300000_9.l1;
            final C635090Ovb c635090Ovb = (C635090Ovb) awS218S0300000_9.l0;
            ?? r3 = new InterfaceC635180Ovk() { // from class: X.0Ove
                @Override // X.InterfaceC635180Ovk
                public final void LIZ() {
                    String string = missionStruct2.unsubscribeStatus == EnumC635130Ovf.UNSUBSCRIBE.getValue() ? c635090Ovb.getContext().getString(2131837457, missionStruct2.subSourceText) : c635090Ovb.getContext().getString(2131837458, missionStruct2.subSourceText);
                    C1389890mGx c1389890mGx = new C1389890mGx(c635090Ovb);
                    c1389890mGx.LJIIJ(string);
                    c1389890mGx.LJIIJJI();
                }

                @Override // X.InterfaceC635180Ovk
                public final void LIZIZ() {
                    C1389890mGx c1389890mGx = new C1389890mGx(c635090Ovb);
                    c1389890mGx.LJIIIZ(2131828035);
                    c1389890mGx.LJIIJJI();
                }
            };
            C844470XAv.LIZ.getClass();
            C844470XAv.LIZ();
            try {
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
            if (!C036E.LIZ.LIZIZ()) {
                r3.LIZIZ();
            } else {
                C635200Ovm c635200Ovm = new C635200Ovm();
                if (z) {
                    value = EnumC635130Ovf.SUBSCRIBE.getValue();
                } else {
                    value = enumC635130Ovf.getValue();
                }
                InterfaceC420801kM interfaceC420801kM = (InterfaceC420801kM) ((LinkedHashMap) mainVm.LLILZLL).get(c635200Ovm);
                if (interfaceC420801kM != null) {
                    interfaceC420801kM.dispose();
                }
                mainVm.LLILZLL.put(c635200Ovm, ((InterfaceC624050Odn) mainVm.LL.getValue().getOperator()).A(i, i2, new C635110Ovd(r3, value, i, i2), new AwS553S0100000_9((C635120Ove) r3, 1672), z));
            }
        }
        DialogFragment dialogFragment = (DialogFragment) ((C259800zU) awS218S0300000_9.l2).element;
        if (dialogFragment != null) {
            dialogFragment.dismiss();
        }
        C635080Ova c635080Ova = C635080Ova.LIZ;
        WorkbenchCardAbility ability = ((C635090Ovb) awS218S0300000_9.l0).getAbility();
        if (ability != null) {
            strLIZ = C623900OdY.LIZ(ability.getTabId());
        } else {
            strLIZ = "";
        }
        MissionStruct missionStruct3 = (MissionStruct) awS218S0300000_9.l1;
        String str = missionStruct3.subSourceLabel;
        if (missionStruct3.unsubscribeStatus == EnumC635130Ovf.UNSUBSCRIBE.getValue()) {
            z2 = false;
        }
        c635080Ova.getClass();
        C635080Ova.LIZIZ("brand_partnership_page", strLIZ, str, z2);
        return Unit.LIZ;
    }

    public static final Object invoke$16(AwS218S0300000_9 awS218S0300000_9, Object obj) {
        C1397620mTQ c1397620mTQ = (C1397620mTQ) obj;
        c1397620mTQ.LIZJ(0, ((Context) awS218S0300000_9.l0).getString(2131828173), new AwS375S0200000_9((C618790OOv) awS218S0300000_9.l1, (BulletinBaseItem) awS218S0300000_9.l2, 136));
        c1397620mTQ.LIZJ(1, ((Context) awS218S0300000_9.l0).getString(2131828171), null);
        return Unit.LIZ;
    }

    public static final Object invoke$17(AwS218S0300000_9 awS218S0300000_9, Object obj) {
        SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute((Context) awS218S0300000_9.l0, "//highlight/select");
        String str = ((C631640Oq2) awS218S0300000_9.l1).LIZ;
        String str2 = "";
        if (str == null) {
            str = "";
        }
        smartRouteBuildRoute.withParam("user_id", str);
        String str3 = ((C631640Oq2) awS218S0300000_9.l1).LIZIZ;
        if (str3 != null) {
            str2 = str3;
        }
        smartRouteBuildRoute.withParam("sec_user_id", str2);
        smartRouteBuildRoute.withParam("highlighted_music_id", ((C632090Oql) awS218S0300000_9.l2).getMusicModel().getMusicId());
        String str4 = C632990OsD.LIZ;
        C632990OsD.LIZ = null;
        smartRouteBuildRoute.withParam("shoot_from", str4);
        smartRouteBuildRoute.open();
        return Unit.LIZ;
    }

    public static final Object invoke$18(AwS218S0300000_9 awS218S0300000_9, Object obj) {
        BulletinPollCreateViewModel bulletinPollCreateViewModel = (BulletinPollCreateViewModel) awS218S0300000_9.l0;
        return C0OVX.LIZ((C0OVX) obj, null, false, new C291001Au(new BulletinPoll(bulletinPollCreateViewModel.LL, Integer.valueOf(bulletinPollCreateViewModel.LLILZ), (List) awS218S0300000_9.l1, null, 0L, Boolean.FALSE, Boolean.FALSE)), (C0OOC) awS218S0300000_9.l2, 3);
    }

    public static final Object invoke$19(AwS218S0300000_9 awS218S0300000_9, Object obj) {
        C1623606Xi c1623606Xi = new C1623606Xi((BulletinBoardInfo) awS218S0300000_9.l0);
        BulletinShareModel bulletinShareModel = (BulletinShareModel) awS218S0300000_9.l1;
        BulletinAccountEditResponse bulletinAccountEditResponse = (BulletinAccountEditResponse) awS218S0300000_9.l2;
        return C0OKY.LIZ((C0OKY) obj, c1623606Xi, null, null, bulletinShareModel, null, null, 0L, null, null, null, null, null, null, null, null, null, null, null, 0L, bulletinAccountEditResponse.bizResourceEntry, null, bulletinAccountEditResponse.toolkitOrders, null, null, null, null, null, false, null, null, 2142240758);
    }

    public static final Object invoke$2(AwS218S0300000_9 awS218S0300000_9, Object obj) {
        BaseDetailShareVM baseDetailShareVM = null;
        ((NetworkHelper) awS218S0300000_9.l0).LIZ((Throwable) obj, null);
        AssemListViewModel<?, ?, ?> assemListViewModelTp = ((ListAssem) awS218S0300000_9.l1).tp();
        if (assemListViewModelTp instanceof BaseDetailShareVM) {
            baseDetailShareVM = (BaseDetailShareVM) assemListViewModelTp;
        }
        if (baseDetailShareVM == null || baseDetailShareVM.LJIIJJI()) {
            ((C627300Oj2) awS218S0300000_9.l2).LLILLL = true;
        }
        return Unit.LIZ;
    }

    public static final Object invoke$20(AwS218S0300000_9 awS218S0300000_9, Object obj) {
        int iIntValue = ((Number) obj).intValue();
        if (iIntValue != 1 && iIntValue != 2) {
            Function0 function0 = (Function0) awS218S0300000_9.l2;
            if (function0 != null) {
                function0.invoke();
            }
        } else {
            C1759440vt0 c1759440vt0 = (C1759440vt0) awS218S0300000_9.l0;
            c1759440vt0.LIZJ = null;
            c1759440vt0.LIZLLL = null;
            Function0 function02 = (Function0) awS218S0300000_9.l1;
            if (function02 != null) {
                function02.invoke();
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$21(AwS218S0300000_9 awS218S0300000_9, Object obj) {
        SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute((Context) awS218S0300000_9.l0, "//highlight/select");
        String str = ((C631640Oq2) awS218S0300000_9.l1).LIZ;
        String str2 = "";
        if (str == null) {
            str = "";
        }
        smartRouteBuildRoute.withParam("user_id", str);
        String str3 = ((C631640Oq2) awS218S0300000_9.l1).LIZIZ;
        if (str3 != null) {
            str2 = str3;
        }
        smartRouteBuildRoute.withParam("sec_user_id", str2);
        smartRouteBuildRoute.withParam("highlighted_music_id", ((C632090Oql) awS218S0300000_9.l2).getMusicModel().getMusicId());
        String str4 = C632990OsD.LIZ;
        C632990OsD.LIZ = null;
        smartRouteBuildRoute.withParam("shoot_from", str4);
        smartRouteBuildRoute.open();
        return Unit.LIZ;
    }

    public static final Object invoke$22(AwS218S0300000_9 awS218S0300000_9, Object obj) {
        C632090Oql c632090Oql = (C632090Oql) awS218S0300000_9.l0;
        Context context = (Context) awS218S0300000_9.l1;
        OriginMusicListViewModel originMusicListViewModel = (OriginMusicListViewModel) awS218S0300000_9.l2;
        if (context != null) {
            C1397580mTM c1397580mTM = new C1397580mTM(context);
            c1397580mTM.LJFF(2131837740);
            c1397580mTM.LIZ(2131837739);
            C985403tE.LIZ(c1397580mTM, new AwS375S0200000_9(originMusicListViewModel, c632090Oql, 163));
            new C1397510mTF(c1397580mTM).LIZLLL();
        }
        return Unit.LIZ;
    }

    public static final Object invoke$23(AwS218S0300000_9 awS218S0300000_9, Object obj) {
        Fragment fragmentLIZ;
        int iEQ2 = ((OriginMusicListViewModel) awS218S0300000_9.l0).EQ2(((C050S) awS218S0300000_9.l1).LL);
        if (iEQ2 != -1 && (fragmentLIZ = C946803n0.LIZ((View) awS218S0300000_9.l2)) != null) {
            OriginMusicListViewModel originMusicListViewModel = (OriginMusicListViewModel) awS218S0300000_9.l0;
            C050S c050s = (C050S) awS218S0300000_9.l1;
            C634210OuB c634210OuB = C634210OuB.LIZ;
            AwS135S0201000_9 awS135S0201000_9 = new AwS135S0201000_9(originMusicListViewModel, c050s, iEQ2, 6);
            c634210OuB.getClass();
            C634210OuB.LIZ(fragmentLIZ, awS135S0201000_9);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$24(AwS218S0300000_9 awS218S0300000_9, Object obj) {
        C23250099c.LIZLLL(C2296808zG.LIZ(C2126308Ur.LIZ), null, null, new C594280NSo((AnonymousClass1814) awS218S0300000_9.l1, null), 3);
        Map map = (Map) awS218S0300000_9.l0;
        map.put("click_area", "delete");
        C1731680vAE.LIZIZ(map, false);
        ((AnonymousClass1814) awS218S0300000_9.l1).e0((Map) awS218S0300000_9.l0);
        ((C013C) awS218S0300000_9.l2).element = true;
        return Unit.LIZ;
    }

    public static final Object invoke$25(AwS218S0300000_9 awS218S0300000_9, Object obj) {
        ((VibeDetailSharedVM) awS218S0300000_9.l0).getConfig().getOperator().LIZJ(EnumC323450Cm7.Refresh, (AbstractC316870CbV) awS218S0300000_9.l1, true);
        List<C607780Nse> listZQ2 = ((VibeDetailSharedVM) awS218S0300000_9.l0).zQ2((C0P3U) awS218S0300000_9.l2);
        VibeDetailSharedVM vibeDetailSharedVM = (VibeDetailSharedVM) awS218S0300000_9.l0;
        ArrayList arrayList = new ArrayList();
        for (C607780Nse c607780Nse : listZQ2) {
            vibeDetailSharedVM.getClass();
            Aweme aweme = c607780Nse.LLILLJJLI;
            if (aweme != null) {
                arrayList.add(aweme);
            }
        }
        InterfaceC1209780haS interfaceC1209780haS = ((VibeDetailSharedVM) awS218S0300000_9.l0).LLILLJJLI;
        if (interfaceC1209780haS != null) {
            interfaceC1209780haS.LLJJJIL(arrayList, false);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$3(AwS218S0300000_9 awS218S0300000_9, Object obj) {
        if (((Boolean) obj).booleanValue()) {
            ITemplateAnchorStrategyService iTemplateAnchorStrategyService = (ITemplateAnchorStrategyService) awS218S0300000_9.l0;
            C19EG c19eg = (C19EG) awS218S0300000_9.l1;
            TemplateAnchorConfig templateAnchorConfig = (TemplateAnchorConfig) awS218S0300000_9.l2;
            int i = TemplateBottomComponent.LLJJ;
            iTemplateAnchorStrategyService.LIZ(c19eg, templateAnchorConfig, true);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$4(AwS218S0300000_9 awS218S0300000_9, Object obj) {
        ((Boolean) obj).booleanValue();
        BulletinCommentActionViewModel bulletinCommentActionViewModel = (BulletinCommentActionViewModel) ((BulletinCommentSheetFragment) awS218S0300000_9.l0).LLIZ.getValue();
        C23250099c.LIZLLL(ViewModelKt.getViewModelScope(bulletinCommentActionViewModel), C0PEM.LIZJ, null, new C0OTK(bulletinCommentActionViewModel, (C0OTS) awS218S0300000_9.l1, null), 2);
        String str = TuxSheet._pnsPageId;
        C1391190mJ3.LJ((LinearLayout) awS218S0300000_9.l2, C343970De7.LIZ);
        return Unit.LIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:58:0x0127  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$5(kotlin.jvm.internal.AwS218S0300000_9 r32, java.lang.Object r33) {
        /*
            Method dump skipped, instruction units count: 885
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS218S0300000_9.invoke$5(kotlin.jvm.internal.AwS218S0300000_9, java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object invoke$6(AwS218S0300000_9 awS218S0300000_9, Object obj) {
        C291001Au c291001Au = (C291001Au) obj;
        if (c291001Au != null) {
            boolean zBooleanValue = ((Boolean) c291001Au.LIZ).booleanValue();
            View view = (View) awS218S0300000_9.l0;
            User user = (User) awS218S0300000_9.l1;
            MusicListArtistCertificationAssem musicListArtistCertificationAssem = (MusicListArtistCertificationAssem) awS218S0300000_9.l2;
            if (zBooleanValue && view.getVisibility() == 0) {
                C632070Oqj.LIZLLL(user.getSecUid());
            }
            musicListArtistCertificationAssem.getClass();
        }
        return Unit.LIZ;
    }

    public static final Object invoke$7(AwS218S0300000_9 awS218S0300000_9, Object obj) {
        String str;
        ((Number) obj).intValue();
        ((C20656615sK) awS218S0300000_9.l0).LIZ();
        ProfileMusicTabService profileMusicTabService = (ProfileMusicTabService) awS218S0300000_9.l1;
        int i = ((C118300cf) awS218S0300000_9.l2).element;
        profileMusicTabService.getClass();
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("page", "music_tab");
        if (i == 0) {
            str = "close";
        } else {
            str = "go_check";
        }
        c2344009Gk.LJIIIIZZ("button_name", str);
        C20684815ws.LJIILLIIL("aop_authorize_button_click", c2344009Gk.LIZ);
        return Unit.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x0200  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0212  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0224  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x022e  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0236  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x026a  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0287  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0289  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x028b  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x02d8  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x02db  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x02de  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x02e1  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x02e4  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x02e7  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x028d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00cc A[PHI: r25 r26
      0x00cc: PHI (r25v0 java.lang.String) = (r25v2 java.lang.String), (r25v3 java.lang.String) binds: [B:31:0x0083, B:29:0x007f] A[DONT_GENERATE, DONT_INLINE]
      0x00cc: PHI (r26v1 java.lang.String) = (r26v3 java.lang.String), (r26v4 java.lang.String) binds: [B:31:0x0083, B:29:0x007f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0158  */
    /* JADX WARN: Type inference failed for: r0v108 */
    /* JADX WARN: Type inference failed for: r0v60 */
    /* JADX WARN: Type inference failed for: r0v61 */
    /* JADX WARN: Type inference failed for: r1v18 */
    /* JADX WARN: Type inference failed for: r1v19, types: [X.0mZJ] */
    /* JADX WARN: Type inference failed for: r1v27 */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v5, types: [androidx.lifecycle.LifecycleOwner, java.lang.String] */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r3v9 */
    /* JADX WARN: Type inference incomplete: some casts might be missing */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$8(kotlin.jvm.internal.AwS218S0300000_9 r27, java.lang.Object r28) {
        /*
            Method dump skipped, instruction units count: 754
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS218S0300000_9.invoke$8(kotlin.jvm.internal.AwS218S0300000_9, java.lang.Object):java.lang.Object");
    }

    public static /* bridge */ /* synthetic */ Object invoke$9(AwS218S0300000_9 awS218S0300000_9, Object obj) {
        C786410Ut5.LJJZZIII(new BPEAHandler(Looper.getMainLooper()), new ARunnableS18S0400000_9((C631220OpM) obj, (MusicModel) awS218S0300000_9.l0, (MusicPlayViewModel) awS218S0300000_9.l1, (C632090Oql) awS218S0300000_9.l2, 3));
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS218S0300000_9(C632090Oql c632090Oql, Context context, OriginMusicListViewModel originMusicListViewModel, int i) {
        super(1);
        this.$t = i;
        this.l0 = c632090Oql;
        this.l1 = context;
        this.l2 = originMusicListViewModel;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS218S0300000_9(C635090Ovb c635090Ovb, C635090Ovb c635090Ovb2, MissionStruct missionStruct, C259800zU<TuxActionSheet> c259800zU) {
        super(1);
        this.$t = c259800zU;
        this.l0 = c635090Ovb;
        this.l1 = c635090Ovb2;
        this.l2 = missionStruct;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS218S0300000_9(C1759440vt0 c1759440vt0, AwS570S0100000_26 awS570S0100000_26, AwS570S0100000_26 awS570S0100000_262, int i) {
        super(1);
        this.$t = i;
        this.l0 = c1759440vt0;
        this.l1 = awS570S0100000_26;
        this.l2 = awS570S0100000_262;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS218S0300000_9(C20656615sK c20656615sK, ProfileMusicTabService profileMusicTabService, C118300cf c118300cf, int i) {
        super(1);
        this.$t = i;
        this.l0 = c20656615sK;
        this.l1 = profileMusicTabService;
        this.l2 = c118300cf;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS218S0300000_9(C19EG c19eg, ITemplateAnchorStrategyService iTemplateAnchorStrategyService, TemplateAnchorConfig templateAnchorConfig, int i) {
        super(1);
        this.$t = i;
        this.l0 = iTemplateAnchorStrategyService;
        this.l1 = c19eg;
        this.l2 = templateAnchorConfig;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS218S0300000_9(Context context, C618790OOv c618790OOv, BulletinBaseItem bulletinBaseItem, int i) {
        super(1);
        this.$t = i;
        this.l0 = context;
        this.l1 = c618790OOv;
        this.l2 = bulletinBaseItem;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS218S0300000_9(Context context, C631640Oq2 c631640Oq2, C632090Oql c632090Oql, int i) {
        super(1);
        this.$t = i;
        this.l0 = context;
        this.l1 = c631640Oq2;
        this.l2 = c632090Oql;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS218S0300000_9(View view, User user, MusicListArtistCertificationAssem musicListArtistCertificationAssem, int i) {
        super(1);
        this.$t = i;
        this.l0 = view;
        this.l1 = user;
        this.l2 = musicListArtistCertificationAssem;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS218S0300000_9(ITemplateAnchorStrategyService iTemplateAnchorStrategyService, TemplateShootAssem templateShootAssem, TemplateAnchorConfig templateAnchorConfig, int i) {
        super(1);
        this.$t = i;
        this.l0 = iTemplateAnchorStrategyService;
        this.l1 = templateShootAssem;
        this.l2 = templateAnchorConfig;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS218S0300000_9(BulletinCommentSheetFragment bulletinCommentSheetFragment, C0OTS c0ots, LinearLayout linearLayout, int i) {
        super(1);
        this.$t = i;
        this.l0 = bulletinCommentSheetFragment;
        this.l1 = c0ots;
        this.l2 = linearLayout;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS218S0300000_9(BulletinListViewModel bulletinListViewModel, BulletinListViewModel bulletinListViewModel2, List<BulletinFetchEvent> list, Map<String, String> map) {
        super(1);
        this.$t = map;
        this.l0 = bulletinListViewModel;
        this.l1 = bulletinListViewModel2;
        this.l2 = list;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS218S0300000_9(BulletinPollCreateViewModel bulletinPollCreateViewModel, BulletinPollCreateViewModel bulletinPollCreateViewModel2, List<BulletinPollOption> list, C0OOC c0ooc) {
        super(1);
        this.$t = c0ooc;
        this.l0 = bulletinPollCreateViewModel;
        this.l1 = bulletinPollCreateViewModel2;
        this.l2 = list;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS218S0300000_9(MusicDetailListAssem musicDetailListAssem, View view, Context context, int i) {
        super(1);
        this.$t = i;
        this.l0 = musicDetailListAssem;
        this.l1 = view;
        this.l2 = context;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS218S0300000_9(OriginMusicListViewModel originMusicListViewModel, C050S c050s, View view, int i) {
        super(1);
        this.$t = i;
        this.l0 = originMusicListViewModel;
        this.l1 = c050s;
        this.l2 = view;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS218S0300000_9(BulletinBoardInfo bulletinBoardInfo, BulletinShareModel bulletinShareModel, BulletinAccountEditResponse bulletinAccountEditResponse, int i) {
        super(1);
        this.$t = i;
        this.l0 = bulletinBoardInfo;
        this.l1 = bulletinShareModel;
        this.l2 = bulletinAccountEditResponse;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS218S0300000_9(OfflineModeSheetPageFragment offlineModeSheetPageFragment, View view, EnumC624750Oev enumC624750Oev, int i) {
        super(1);
        this.$t = i;
        this.l0 = offlineModeSheetPageFragment;
        this.l1 = view;
        this.l2 = enumC624750Oev;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS218S0300000_9(NetworkHelper networkHelper, ListAssem listAssem, C627300Oj2 c627300Oj2, int i) {
        super(1);
        this.$t = i;
        this.l0 = networkHelper;
        this.l1 = listAssem;
        this.l2 = c627300Oj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS218S0300000_9(NetworkHelper networkHelper, VibeFeedDiggDetailListAssem vibeFeedDiggDetailListAssem, C627300Oj2 c627300Oj2, int i) {
        super(1);
        this.$t = i;
        this.l0 = networkHelper;
        this.l1 = vibeFeedDiggDetailListAssem;
        this.l2 = c627300Oj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS218S0300000_9(MusicModel musicModel, MusicPlayViewModel musicPlayViewModel, C632090Oql c632090Oql, int i) {
        super(1);
        this.$t = i;
        this.l0 = musicModel;
        this.l1 = musicPlayViewModel;
        this.l2 = c632090Oql;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS218S0300000_9(InteractStickerStruct interactStickerStruct, C705930RmZ c705930RmZ, Aweme aweme, int i) {
        super(1);
        this.$t = i;
        this.l0 = interactStickerStruct;
        this.l1 = c705930RmZ;
        this.l2 = aweme;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS218S0300000_9(TopicReviewCell topicReviewCell, FragmentManager fragmentManager, TopicReview topicReview, int i) {
        super(1);
        this.$t = i;
        this.l0 = topicReviewCell;
        this.l1 = fragmentManager;
        this.l2 = topicReview;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS218S0300000_9(VibeDetailSharedVM vibeDetailSharedVM, VibeDetailSharedVM vibeDetailSharedVM2, AbstractC316870CbV<String> abstractC316870CbV, C0P3U c0p3u) {
        super(1);
        this.$t = c0p3u;
        this.l0 = vibeDetailSharedVM;
        this.l1 = vibeDetailSharedVM2;
        this.l2 = abstractC316870CbV;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS218S0300000_9(Map map, Map<String, Object> map2, AnonymousClass1814 anonymousClass1814, C013C c013c) {
        super(1);
        this.$t = c013c;
        this.l0 = map;
        this.l1 = map2;
        this.l2 = anonymousClass1814;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS218S0300000_9(Function2 function2, Function2<? super C0MAE, ? super InterfaceC636240OxS<T>, Unit> function22, InterfaceC636240OxS<T> interfaceC636240OxS, Function2<? super InterfaceC1680500tpg, ? super Integer, Unit> function23) {
        super(1);
        this.$t = function23;
        this.l0 = function2;
        this.l1 = function22;
        this.l2 = interfaceC636240OxS;
    }
}
