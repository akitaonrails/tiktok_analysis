package kotlin.jvm.internal;

import X.AbstractC1255880imo;
import X.AbstractC738140SxQ;
import X.C013C;
import X.C03HY;
import X.C05P0;
import X.C09AY;
import X.C0DTR;
import X.C0FNT;
import X.C0HZQ;
import X.C0MBB;
import X.C0OM1;
import X.C0SY5;
import X.C0SY7;
import X.C0ZDN;
import X.C0ZP4;
import X.C1070210dxL;
import X.C1220330hrT;
import X.C1241460iPY;
import X.C1241500iPc;
import X.C1241700iPw;
import X.C1241770iQ3;
import X.C1241790iQ5;
import X.C1246120iX4;
import X.C1247240iYs;
import X.C1247270iYv;
import X.C1253050iiF;
import X.C1253930ijf;
import X.C1255920ims;
import X.C1258400iqs;
import X.C1259360isQ;
import X.C1261180ivM;
import X.C1261650iw7;
import X.C1261860iwS;
import X.C1264860j1I;
import X.C1275904yz;
import X.C128Y;
import X.C12ES;
import X.C1336205Ku;
import X.C1389890mGx;
import X.C13LP;
import X.C13Z4;
import X.C1558520qew;
import X.C1665460tRQ;
import X.C1665890tS7;
import X.C1668060tVc;
import X.C1668330tW3;
import X.C1669670tYD;
import X.C1673210tdv;
import X.C1680510tph;
import X.C1680520tpi;
import X.C1685910tyP;
import X.C1697810uHb;
import X.C1720106oR;
import X.C1722300uv6;
import X.C1749280vcc;
import X.C1893080zMY;
import X.C1904150zeP;
import X.C1913380ztI;
import X.C191994109g;
import X.C1954807lC;
import X.C19635211ry;
import X.C19719212De;
import X.C19EG;
import X.C20088213iq;
import X.C20600815jK;
import X.C2097608Jq;
import X.C2187451AjH;
import X.C2188811AlT;
import X.C2195221Avo;
import X.C2201941BFw;
import X.C259800zU;
import X.C291001Au;
import X.C418440Gaw;
import X.C427660Gpo;
import X.C428130GqZ;
import X.C438710HIf;
import X.C508401yU;
import X.C558690Lvf;
import X.C786410Ut5;
import X.C814420VxA;
import X.C898670ZNh;
import X.C994040byU;
import X.EnumC1222640hvC;
import X.EnumC1223000hvm;
import X.EnumC1241490iPb;
import X.EnumC1251640ify;
import X.EnumC1427810nG7;
import X.EnumC1609900rzo;
import X.InterfaceC1240590iO9;
import X.InterfaceC1264850j1H;
import X.InterfaceC1345705Ol;
import X.InterfaceC1680500tpg;
import X.InterfaceC1685750ty9;
import X.InterfaceC1891350zJl;
import X.InterfaceC1914010zuJ;
import X.InterfaceC2217461Bqa;
import X.InterfaceC344240DeY;
import X.InterfaceC629820On6;
import X.ViewOnAttachStateChangeListenerC20604515jv;
import Y.ARunnableS119S0100000_19;
import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.compose.foundation.layout.c;
import androidx.compose.ui.platform.ComposeView;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.android.livesdk.livesetting.subscription.LiveSubscriptionQuestionnaireHourFrequencySetting;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.navigation.TuxNavBar;
import com.ss.android.common.util.NetworkUtils;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.compliance.privacy.checkup.relation.base.BaseCheckupRelationViewModel;
import com.ss.android.ugc.aweme.compliance.privacy.checkup.relation.follower.CheckupRelationFollowerCell;
import com.ss.android.ugc.aweme.compliance.privacy.checkup.relation.following.CheckupRelationFollowingCell;
import com.ss.android.ugc.aweme.compliance.privacy.checkup.relation.friends.CheckupRelationFriendsCell;
import com.ss.android.ugc.aweme.ecommerce.tts.addressedit.us.vh.USDeleteButtonViewHolder;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUser;
import com.ss.android.ugc.aweme.im.saas.host.api.foundation.IMCrossAppFeatureDiffApi;
import com.ss.android.ugc.aweme.im.service.analytics.IMSayhiAnalytics;
import com.ss.android.ugc.aweme.inbox.search.InboxSearchResultFragment;
import com.ss.android.ugc.aweme.inbox.search.assem.InboxSearchAllTabListAssem;
import com.ss.android.ugc.aweme.inbox.search.vm.InboxSearchVM;
import com.ss.android.ugc.aweme.live.livehostimpl.livereply.autopost.AutoPostLivingPanelDialog;
import com.ss.android.ugc.aweme.minis.common.SchemaParserData;
import com.ss.android.ugc.aweme.minis.model.MinisMetaResp;
import com.ss.android.ugc.aweme.minis.page.MinisReportActivity;
import com.ss.android.ugc.aweme.minis.report.api.MinisCreateReportResponse;
import com.ss.android.ugc.aweme.music.model.MusicAwemeList;
import com.ss.android.ugc.aweme.music.v2.assem.MusicShootAssem;
import com.ss.android.ugc.aweme.music.v2.assem.MusicSquareBottomMaskAssem;
import com.ss.android.ugc.aweme.music.v2.assem.button.IMDPButtonAnimationAbility;
import com.ss.android.ugc.aweme.notice.api.services.INoticeService;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import com.ss.android.ugc.aweme.notification.v2.cell.FollowRequestCell;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.qrcode.IScanQRCodeDiffProtocol;
import com.ss.android.ugc.aweme.relation.mutual.MutualRelationEmptyCell;
import com.ss.android.ugc.aweme.relation.usercard.ability.IUserCardListAbility;
import com.ss.android.ugc.aweme.relation.usercard.impl.cell.LargeRectRecUserCell;
import com.ss.android.ugc.aweme.relation.usercard.impl.cell.RectRecUserCell;
import com.ss.android.ugc.aweme.relation.usercard.impl.cell.RectRedesignRecUserCell;
import com.ss.android.ugc.aweme.setting.page.diskmanager.compose.DiskManagerComposePage;
import com.ss.android.ugc.aweme.setting.page.litemode.LiteModeLearnMorePage;
import com.ss.android.ugc.aweme.setting.page.litemode.LiteModeSwitchPage;
import com.ss.android.ugc.aweme.setting.serverpush.compose.unlogin.PushSettingsUnLoginComposeFragment;
import com.ss.android.ugc.aweme.setting.ui.rvmpcompose.SettingsComposeRvmpFragment;
import com.ss.android.ugc.aweme.setting.ui.rvmpcompose.SettingsRvmpComposeViewModel;
import com.ss.android.ugc.aweme.share.qrcode.UserQrCodeComposeActivity;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.ss.android.ugc.aweme.tag.assem.SelectedWidgetAssem;
import com.ss.android.ugc.aweme.unifiedauthapi.experiment.ChannelAuthEdmAndSmsGuideV3;
import com.ss.android.ugc.aweme.unifiedauthapi.experiment.ChannelsAuthRefactorExp;
import com.ss.android.ugc.aweme.unifiedauthapi.model.PopupInstanceConfig;
import com.ss.android.ugc.aweme.unifiedauthapi.model.UnifiedAuthPopupConfig;
import com.ss.android.ugc.aweme.unifiedauthapi.push.IUniAuthGuidePopupApi;
import com.ss.android.ugc.aweme.user.repository.UserState;
import com.ss.android.ugc.awemepushapi.IPushPermissionApi;
import com.ss.android.ugc.profile.business.ci.ProfileNavbarViewerEntranceProtocol;
import com.ss.android.ugc.profile.business.profile.tab.ProfileLikesAwemeListFragment;
import com.ss.android.ugc.profile.business.ur.aigc.ChooseStyleCell;
import com.ss.android.ugc.profile.business.ur.editprofileassem.EditProfileBioCellAssem;
import com.ss.android.ugc.profile.business.ur.following.ui.assem.RelationSearchCell;
import com.ss.android.ugc.profile.business.ur.ui.ProfileEditNicknameFragment;
import com.ss.android.ugc.profile.platform.base.data.BizBaseData;
import com.ss.android.ugc.profile.platform.business.header.business.advancedfeature.base.HeaderAdvancedFeatureBaseUIComponent;
import com.ss.android.ugc.profile.platform.business.header.business.bio.business.bainfo.base.BioStructuralInfoBaseComponent;
import com.ss.android.ugc.profile.platform.business.header.business.toptips.base.ProfileHeaderTopTipsBaseUIComponent;
import com.ss.android.ugc.trill.setting.compose.DisplayAndCaptionComposePage;
import com.tts.oecverify.BdTuring;
import com.zhiliaoapp.musically.R;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes20.dex */
public class AwS455S0200000_19 extends C09AY implements Function2 {
    public final int $t;
    public Object l0;
    public Object l1;

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj, obj2);
            case 1:
                return invoke$1(this, obj, obj2);
            case 2:
                return invoke$2(this, obj, obj2);
            case 3:
                return invoke$3(this, obj, obj2);
            case 4:
                return invoke$4(this, obj, obj2);
            case 5:
                return invoke$5(this, obj, obj2);
            case 6:
                return invoke$6(this, obj, obj2);
            case 7:
                return invoke$7(this, obj, obj2);
            case 8:
                return invoke$8(this, obj, obj2);
            case BdTuring.TYPE_ECAF /* 9 */:
                return invoke$9(this, obj, obj2);
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                return invoke$10(this, obj, obj2);
            case BdTuring.TYPE_EMAIL /* 11 */:
                return invoke$11(this, obj, obj2);
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                return invoke$12(this, obj, obj2);
            case BdTuring.TYPE_SMS_VOICE /* 13 */:
                return invoke$13(this, obj, obj2);
            case 14:
                return invoke$14(this, obj, obj2);
            case 15:
                return invoke$15(this, obj, obj2);
            case 16:
                return invoke$16(this, obj, obj2);
            case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                return invoke$17(this, obj, obj2);
            case LiveToolbarIconStyleSetting.COLORFUL_WITH_TEXT /* 18 */:
                return invoke$18(this, obj, obj2);
            case 19:
                return invoke$19(this, obj, obj2);
            case LiveToolbarIconStyleSetting.HIGHLIGHT_WITH_TEXT /* 20 */:
                return invoke$20(this, obj, obj2);
            case 21:
                return invoke$21(this, obj, obj2);
            case 22:
                return invoke$22(this, obj, obj2);
            case 23:
                return invoke$23(this, obj, obj2);
            case LiveSubscriptionQuestionnaireHourFrequencySetting.DEFAULT /* 24 */:
                return invoke$24(this, obj, obj2);
            case 25:
                return invoke$25(this, obj, obj2);
            case 26:
                return invoke$26(this, obj, obj2);
            case 27:
                return invoke$27(this, obj, obj2);
            case 28:
                return invoke$28(this, obj, obj2);
            case 29:
                return invoke$29(this, obj, obj2);
            case 30:
                return invoke$30(this, obj, obj2);
            case 31:
                return invoke$31(this, obj, obj2);
            case 32:
                return invoke$32(this, obj, obj2);
            case LiveToolbarIconStyleSetting.GRAY_WITHOUT_TEXT /* 33 */:
                return invoke$33(this, obj, obj2);
            case LiveToolbarIconStyleSetting.COLORFUL_WITHOUT_TEXT /* 34 */:
                return invoke$34(this, obj, obj2);
            case 35:
                return invoke$35(this, obj, obj2);
            case LiveToolbarIconStyleSetting.HIGHLIGHT_WITHOUT_TEXT /* 36 */:
                return invoke$36(this, obj, obj2);
            case 37:
                return invoke$37(this, obj, obj2);
            case 38:
                return invoke$38(this, obj, obj2);
            case 39:
                return invoke$39(this, obj, obj2);
            case 40:
                return invoke$40(this, obj, obj2);
            case 41:
                return invoke$41(this, obj, obj2);
            case 42:
                return invoke$42(this, obj, obj2);
            case 43:
                return invoke$43(this, obj, obj2);
            case 44:
                return invoke$44(this, obj, obj2);
            case 45:
                return invoke$45(this, obj, obj2);
            case 46:
                return invoke$46(this, obj, obj2);
            case 47:
                return invoke$47(this, obj, obj2);
            case 48:
                return invoke$48(this, obj, obj2);
            case 49:
                return invoke$49(this, obj, obj2);
            case BaseNotice.RECOMMEND_LIVE /* 50 */:
                return invoke$50(this, obj, obj2);
            case 51:
                return invoke$51(this, obj, obj2);
            case 52:
                return invoke$52(this, obj, obj2);
            case 53:
                return invoke$53(this, obj, obj2);
            case 54:
                return invoke$54(this, obj, obj2);
            case 55:
                return invoke$55(this, obj, obj2);
            case 56:
                return invoke$56(this, obj, obj2);
            case 57:
                return invoke$57(this, obj, obj2);
            case 58:
                return invoke$58(this, obj, obj2);
            default:
                return null;
        }
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public AwS455S0200000_19(android.content.Context r3, X.C1220330hrT r4, int r5) {
        /*
            r2 = this;
            r2.$t = r5
            int r5 = 41 - r5
            if (r5 == 0) goto L10
            r1 = r2
            r1.l0 = r4
            r1.l1 = r3
            r0 = 2
        Lc:
            r1.<init>(r0)
            return
        L10:
            r1 = r2
            r1.l0 = r3
            r1.l1 = r4
            r0 = 2
            goto Lc
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS455S0200000_19.<init>(android.content.Context, X.0hrT, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x003d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$0(kotlin.jvm.internal.AwS455S0200000_19 r6, java.lang.Object r7, java.lang.Object r8) {
        /*
            r5 = r7
            X.0tpg r5 = (X.InterfaceC1680500tpg) r5
            java.lang.Number r8 = (java.lang.Number) r8
            int r0 = r8.intValue()
            r1 = r0 & 3
            r0 = 2
            if (r1 != r0) goto L1a
            boolean r0 = r5.LIZ()
            if (r0 == 0) goto L1a
            r5.LIZJ()
        L17:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L1a:
            X.0tyA r3 = X.InterfaceC1685750ty9.LIZ
            r0 = 5004770(0x4c5de2, float:7.013177E-39)
            r5.LJJIIJZLJL(r0)
            java.lang.Object r0 = r6.l0
            android.content.Context r0 = (android.content.Context) r0
            boolean r0 = r5.LJII(r0)
            java.lang.Object r2 = r6.l0
            android.content.Context r2 = (android.content.Context) r2
            java.lang.Object r1 = r5.LJJ()
            if (r0 != 0) goto L3d
            X.0tph r0 = X.InterfaceC1680500tpg.LIZ
            r0.getClass()
            X.0tpi r0 = X.C1680510tph.LIZIZ
            if (r1 != r0) goto L47
        L3d:
            kotlin.jvm.internal.AwS604S0100000_25 r1 = new kotlin.jvm.internal.AwS604S0100000_25
            r0 = 25
            r1.<init>(r2, r0)
            r5.LJJIJIIJI(r1)
        L47:
            kotlin.jvm.functions.Function1 r1 = (kotlin.jvm.functions.Function1) r1
            r5.LJ()
            r2 = 0
            X.0ty9 r1 = X.C1689740u4a.LIZIZ(r3, r2, r1)
            X.0tWw r0 = X.C1669660tYC.LJJL
            r3 = 0
            java.lang.Object r4 = r6.l1
            kotlin.jvm.functions.Function0 r4 = (kotlin.jvm.functions.Function0) r4
            r7 = 12
            r6 = r2
            X.C1668060tVc.LIZLLL(r0, r1, r2, r3, r4, r5, r6, r7)
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS455S0200000_19.invoke$0(kotlin.jvm.internal.AwS455S0200000_19, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    public static final Object invoke$1(AwS455S0200000_19 awS455S0200000_19, Object obj, Object obj2) {
        C1247240iYs c1247240iYs = C1247240iYs.LIZ;
        String enterFrom = ((RelationSearchCell) awS455S0200000_19.l0).getEnterFrom();
        String str = ((RelationSearchCell) awS455S0200000_19.l0).N5().LLILZ;
        int absoluteAdapterPosition = ((RelationSearchCell) awS455S0200000_19.l0).getAbsoluteAdapterPosition();
        int followStatus = ((User) awS455S0200000_19.l1).getFollowStatus();
        int followerStatus = ((User) awS455S0200000_19.l1).getFollowerStatus();
        c1247240iYs.getClass();
        C1247240iYs.LIZ(absoluteAdapterPosition, enterFrom, followStatus, str, followerStatus, "button");
        return Unit.LIZ;
    }

    public static final Object invoke$10(AwS455S0200000_19 awS455S0200000_19, Object obj, Object obj2) {
        String uid;
        C0SY7 c0sy7 = (C0SY7) obj;
        if (((Boolean) obj2).booleanValue()) {
            User user = (User) awS455S0200000_19.l0;
            FollowRequestCell followRequestCell = (FollowRequestCell) awS455S0200000_19.l1;
            if (user != null) {
                C1336205Ku.LIZ(false).getImSayHiService().LJI(c0sy7.getValue(), user.getFollowerStatus(), user.getUid());
            }
            if (2 == c0sy7.getValue()) {
                IMSayhiAnalytics imSayhiAnalytics = C1336205Ku.LIZ(false).getImSayhiAnalytics();
                if (user != null) {
                    uid = user.getUid();
                } else {
                    uid = null;
                }
                imSayhiAnalytics.LIZIZ(uid, C2097608Jq.LJIIJ(new Pair("enter_from", "follow_request_page")), C0SY5.LIZIZ(followRequestCell.itemView.getContext()), false);
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$11(AwS455S0200000_19 awS455S0200000_19, Object obj, Object obj2) {
        if (obj2 == EnumC1223000hvm.EMPTY || obj2 == EnumC1223000hvm.FAIL) {
            MutualRelationEmptyCell mutualRelationEmptyCell = (MutualRelationEmptyCell) awS455S0200000_19.l0;
            C03HY c03hy = (C03HY) awS455S0200000_19.l1;
            mutualRelationEmptyCell.getClass();
            C1913380ztI.LLILLJJLI.setStatusView((C1749280vcc) mutualRelationEmptyCell.itemView.findViewById(R.id.w28), EnumC1609900rzo.MUTUAL_RELATION_TAB, new AwS420S0200000_19(mutualRelationEmptyCell, c03hy, 137), (Exception) null);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$12(AwS455S0200000_19 awS455S0200000_19, Object obj, Object obj2) {
        IUserCardListAbility iUserCardListAbility;
        if (((Boolean) obj2).booleanValue() && obj == C0SY7.FOLLOWED && (iUserCardListAbility = (IUserCardListAbility) awS455S0200000_19.l0) != null) {
            iUserCardListAbility.rz((C1261860iwS) awS455S0200000_19.l1);
        }
        return Unit.LIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0204  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0207  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x010e A[Catch: all -> 0x01a1, TryCatch #0 {all -> 0x01a1, blocks: (B:52:0x0100, B:54:0x010e, B:56:0x0116, B:60:0x0122, B:62:0x0128, B:65:0x0138, B:67:0x013e, B:69:0x0144, B:71:0x014c, B:72:0x0156, B:74:0x015c, B:75:0x0160, B:77:0x016e, B:64:0x012e, B:58:0x011a), top: B:104:0x0100 }] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01ce  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$13(kotlin.jvm.internal.AwS455S0200000_19 r14, java.lang.Object r15, java.lang.Object r16) {
        /*
            Method dump skipped, instruction units count: 521
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS455S0200000_19.invoke$13(kotlin.jvm.internal.AwS455S0200000_19, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0204  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0207  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x010e A[Catch: all -> 0x01a1, TryCatch #0 {all -> 0x01a1, blocks: (B:52:0x0100, B:54:0x010e, B:56:0x0116, B:60:0x0122, B:62:0x0128, B:65:0x0138, B:67:0x013e, B:69:0x0144, B:71:0x014c, B:72:0x0156, B:74:0x015c, B:75:0x0160, B:77:0x016e, B:64:0x012e, B:58:0x011a), top: B:104:0x0100 }] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01ce  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$14(kotlin.jvm.internal.AwS455S0200000_19 r14, java.lang.Object r15, java.lang.Object r16) {
        /*
            Method dump skipped, instruction units count: 521
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS455S0200000_19.invoke$14(kotlin.jvm.internal.AwS455S0200000_19, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0204  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0207  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x010e A[Catch: all -> 0x01a1, TryCatch #0 {all -> 0x01a1, blocks: (B:52:0x0100, B:54:0x010e, B:56:0x0116, B:60:0x0122, B:62:0x0128, B:65:0x0138, B:67:0x013e, B:69:0x0144, B:71:0x014c, B:72:0x0156, B:74:0x015c, B:75:0x0160, B:77:0x016e, B:64:0x012e, B:58:0x011a), top: B:104:0x0100 }] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01ce  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$15(kotlin.jvm.internal.AwS455S0200000_19 r14, java.lang.Object r15, java.lang.Object r16) {
        /*
            Method dump skipped, instruction units count: 521
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS455S0200000_19.invoke$15(kotlin.jvm.internal.AwS455S0200000_19, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    public static final Object invoke$16(AwS455S0200000_19 awS455S0200000_19, Object obj, Object obj2) {
        InterfaceC1680500tpg interfaceC1680500tpg = (InterfaceC1680500tpg) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && interfaceC1680500tpg.LIZ()) {
            interfaceC1680500tpg.LIZJ();
        } else {
            ((ComposeView) awS455S0200000_19.l0).setViewCompositionStrategy(C20088213iq.LIZIZ);
            C1669670tYD.LJ((ComposeView) awS455S0200000_19.l0, EnumC1427810nG7.Auto, C13Z4.LIZJ(960009104, new AwS633S0100000_19((DiskManagerComposePage) awS455S0200000_19.l1, 86), interfaceC1680500tpg));
        }
        return Unit.LIZ;
    }

    public static final Object invoke$17(AwS455S0200000_19 awS455S0200000_19, Object obj, Object obj2) {
        InterfaceC1680500tpg interfaceC1680500tpg = (InterfaceC1680500tpg) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && interfaceC1680500tpg.LIZ()) {
            interfaceC1680500tpg.LIZJ();
        } else {
            ((ComposeView) awS455S0200000_19.l0).setViewCompositionStrategy(C20088213iq.LIZIZ);
            C1669670tYD.LJ((ComposeView) awS455S0200000_19.l0, EnumC1427810nG7.Auto, C13Z4.LIZJ(-1602127451, new AwS633S0100000_19((LiteModeLearnMorePage) awS455S0200000_19.l1, 87), interfaceC1680500tpg));
        }
        return Unit.LIZ;
    }

    public static final Object invoke$18(AwS455S0200000_19 awS455S0200000_19, Object obj, Object obj2) {
        InterfaceC1680500tpg interfaceC1680500tpg = (InterfaceC1680500tpg) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && interfaceC1680500tpg.LIZ()) {
            interfaceC1680500tpg.LIZJ();
        } else {
            ((ComposeView) awS455S0200000_19.l0).setViewCompositionStrategy(C20088213iq.LIZIZ);
            C1669670tYD.LJ((ComposeView) awS455S0200000_19.l0, EnumC1427810nG7.Auto, C13Z4.LIZJ(-1805395309, new AwS633S0100000_19((LiteModeSwitchPage) awS455S0200000_19.l1, 88), interfaceC1680500tpg));
        }
        return Unit.LIZ;
    }

    public static final Object invoke$19(AwS455S0200000_19 awS455S0200000_19, Object obj, Object obj2) {
        InterfaceC1680500tpg interfaceC1680500tpg = (InterfaceC1680500tpg) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && interfaceC1680500tpg.LIZ()) {
            interfaceC1680500tpg.LIZJ();
        } else {
            ((ComposeView) awS455S0200000_19.l0).setViewCompositionStrategy(C20088213iq.LIZIZ);
            C1669670tYD.LJ((ComposeView) awS455S0200000_19.l0, EnumC1427810nG7.Auto, C13Z4.LIZJ(-1943982778, new AwS633S0100000_19((PushSettingsUnLoginComposeFragment) awS455S0200000_19.l1, 89), interfaceC1680500tpg));
        }
        return Unit.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$2(AwS455S0200000_19 awS455S0200000_19, Object obj, Object obj2) {
        C0OM1 c0om1Sn;
        C128Y c128y = (Fragment) obj2;
        if (Intrinsics.LJFF(c128y, (Fragment) awS455S0200000_19.l0)) {
            if ((c128y instanceof InterfaceC344240DeY) && (c0om1Sn = ((InterfaceC344240DeY) c128y).Sn()) != null) {
                C1246120iX4 c1246120iX4 = (C1246120iX4) awS455S0200000_19.l1;
                TuxNavBar tuxNavBar = c1246120iX4.LL;
                if (tuxNavBar == null) {
                    tuxNavBar = new TuxNavBar(c1246120iX4.getContext(), null, 6);
                    c1246120iX4.addView(tuxNavBar, 0, new LinearLayout.LayoutParams(-1, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(52))));
                    Integer num = c1246120iX4.LLILLJJLI;
                    if (num != null) {
                        tuxNavBar.setNavBackground(num.intValue());
                    }
                    c1246120iX4.LL = tuxNavBar;
                }
                tuxNavBar.setNavActions(c0om1Sn);
                C786410Ut5.LLLLZLLLI(tuxNavBar, 0);
            } else {
                TuxNavBar tuxNavBar2 = ((C1246120iX4) awS455S0200000_19.l1).LL;
                if (tuxNavBar2 != null) {
                    C786410Ut5.LLLLZLLLI(tuxNavBar2, 8);
                }
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$20(AwS455S0200000_19 awS455S0200000_19, Object obj, Object obj2) {
        if (((Boolean) obj2).booleanValue()) {
            SettingsRvmpComposeViewModel settingsRvmpComposeViewModel = (SettingsRvmpComposeViewModel) awS455S0200000_19.l0;
            Context context = ((SettingsComposeRvmpFragment) awS455S0200000_19.l1).getContext();
            settingsRvmpComposeViewModel.getClass();
            if (context != null) {
                SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(context, "aweme://main?tab=1");
                smartRouteBuildRoute.withParam("tab", 1);
                smartRouteBuildRoute.withParam("com.ss.android.ugc.aweme.intent.extra.EXTRA_AWEME_PUSH_TAB", "HOME");
                smartRouteBuildRoute.addFlags(67108864);
                smartRouteBuildRoute.open();
            }
        }
        return Unit.LIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x003d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$21(kotlin.jvm.internal.AwS455S0200000_19 r6, java.lang.Object r7, java.lang.Object r8) {
        /*
            r5 = r7
            X.0tpg r5 = (X.InterfaceC1680500tpg) r5
            java.lang.Number r8 = (java.lang.Number) r8
            int r0 = r8.intValue()
            r1 = r0 & 3
            r0 = 2
            if (r1 != r0) goto L1a
            boolean r0 = r5.LIZ()
            if (r0 == 0) goto L1a
            r5.LIZJ()
        L17:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L1a:
            X.0tyA r3 = X.InterfaceC1685750ty9.LIZ
            r0 = 5004770(0x4c5de2, float:7.013177E-39)
            r5.LJJIIJZLJL(r0)
            java.lang.Object r0 = r6.l0
            android.content.Context r0 = (android.content.Context) r0
            boolean r0 = r5.LJII(r0)
            java.lang.Object r2 = r6.l0
            android.content.Context r2 = (android.content.Context) r2
            java.lang.Object r1 = r5.LJJ()
            if (r0 != 0) goto L3d
            X.0tph r0 = X.InterfaceC1680500tpg.LIZ
            r0.getClass()
            X.0tpi r0 = X.C1680510tph.LIZIZ
            if (r1 != r0) goto L47
        L3d:
            kotlin.jvm.internal.AwS604S0100000_25 r1 = new kotlin.jvm.internal.AwS604S0100000_25
            r0 = 114(0x72, float:1.6E-43)
            r1.<init>(r2, r0)
            r5.LJJIJIIJI(r1)
        L47:
            kotlin.jvm.functions.Function1 r1 = (kotlin.jvm.functions.Function1) r1
            r5.LJ()
            r2 = 0
            X.0ty9 r1 = X.C1689740u4a.LIZIZ(r3, r2, r1)
            X.0tWw r0 = X.C1669660tYC.LJIIZILJ
            r3 = 0
            java.lang.Object r4 = r6.l1
            kotlin.jvm.functions.Function0 r4 = (kotlin.jvm.functions.Function0) r4
            r7 = 12
            r6 = r2
            X.C1668060tVc.LIZLLL(r0, r1, r2, r3, r4, r5, r6, r7)
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS455S0200000_19.invoke$21(kotlin.jvm.internal.AwS455S0200000_19, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    public static final Object invoke$22(AwS455S0200000_19 awS455S0200000_19, Object obj, Object obj2) {
        InterfaceC1680500tpg interfaceC1680500tpg = (InterfaceC1680500tpg) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && interfaceC1680500tpg.LIZ()) {
            interfaceC1680500tpg.LIZJ();
        } else {
            ((ComposeView) awS455S0200000_19.l0).setViewCompositionStrategy(C20088213iq.LIZIZ);
            C1669670tYD.LJ((ComposeView) awS455S0200000_19.l0, EnumC1427810nG7.Auto, C13Z4.LIZJ(-863897458, new AwS633S0100000_19((UserQrCodeComposeActivity) awS455S0200000_19.l1, 93), interfaceC1680500tpg));
        }
        return Unit.LIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x008d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$23(kotlin.jvm.internal.AwS455S0200000_19 r8, java.lang.Object r9, java.lang.Object r10) {
        /*
            r4 = r9
            X.0tpg r4 = (X.InterfaceC1680500tpg) r4
            java.lang.Number r10 = (java.lang.Number) r10
            int r0 = r10.intValue()
            r1 = r0 & 3
            r0 = 2
            if (r1 != r0) goto L1a
            boolean r0 = r4.LIZ()
            if (r0 == 0) goto L1a
            r4.LIZJ()
        L17:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L1a:
            r0 = 2131829838(0x7f11244e, float:1.9292656E38)
            java.lang.String r5 = X.C0MBB.LIZIZ(r0, r4)
            r7 = 1
            r0 = -1633490746(0xffffffff9ea2e8c6, float:-1.724869E-20)
            r4.LJJIIJZLJL(r0)
            java.lang.Object r0 = r8.l0
            kotlin.jvm.functions.Function0 r0 = (kotlin.jvm.functions.Function0) r0
            boolean r3 = r4.LJJIIJ(r0)
            java.lang.Object r0 = r8.l1
            kotlin.jvm.functions.Function0 r0 = (kotlin.jvm.functions.Function0) r0
            boolean r0 = r4.LJJIIJ(r0)
            r3 = r3 | r0
            java.lang.Object r2 = r8.l0
            kotlin.jvm.functions.Function0 r2 = (kotlin.jvm.functions.Function0) r2
            java.lang.Object r1 = r8.l1
            kotlin.jvm.functions.Function0 r1 = (kotlin.jvm.functions.Function0) r1
            java.lang.Object r6 = r4.LJJ()
            if (r3 != 0) goto L50
            X.0tph r0 = X.InterfaceC1680500tpg.LIZ
            r0.getClass()
            X.0tpi r0 = X.C1680510tph.LIZIZ
            if (r6 != r0) goto L5a
        L50:
            kotlin.jvm.internal.AwS420S0200000_19 r6 = new kotlin.jvm.internal.AwS420S0200000_19
            r0 = 99
            r6.<init>(r2, r1, r0)
            r4.LJJIJIIJI(r6)
        L5a:
            kotlin.jvm.functions.Function0 r6 = (kotlin.jvm.functions.Function0) r6
            r4.LJ()
            r2 = 48
            r3 = 0
            X.C1668330tW3.LJIIIIZZ(r2, r3, r4, r5, r6, r7)
            r0 = 2131829840(0x7f112450, float:1.929266E38)
            java.lang.String r5 = X.C0MBB.LIZIZ(r0, r4)
            r0 = 5004770(0x4c5de2, float:7.013177E-39)
            r4.LJJIIJZLJL(r0)
            java.lang.Object r0 = r8.l1
            kotlin.jvm.functions.Function0 r0 = (kotlin.jvm.functions.Function0) r0
            boolean r0 = r4.LJJIIJ(r0)
            java.lang.Object r1 = r8.l1
            kotlin.jvm.functions.Function0 r1 = (kotlin.jvm.functions.Function0) r1
            java.lang.Object r6 = r4.LJJ()
            if (r0 != 0) goto L8d
            X.0tph r0 = X.InterfaceC1680500tpg.LIZ
            r0.getClass()
            X.0tpi r0 = X.C1680510tph.LIZIZ
            if (r6 != r0) goto L97
        L8d:
            kotlin.jvm.internal.AwS563S0100000_19 r6 = new kotlin.jvm.internal.AwS563S0100000_19
            r0 = 1853(0x73d, float:2.597E-42)
            r6.<init>(r1, r0)
            r4.LJJIJIIJI(r6)
        L97:
            kotlin.jvm.functions.Function0 r6 = (kotlin.jvm.functions.Function0) r6
            r4.LJ()
            r2 = 48
            r3 = 0
            X.C1668330tW3.LJIIIZ(r2, r3, r4, r5, r6, r7)
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS455S0200000_19.invoke$23(kotlin.jvm.internal.AwS455S0200000_19, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object invoke$24(AwS455S0200000_19 awS455S0200000_19, Object obj, Object obj2) {
        String str;
        C291001Au c291001Au = (C291001Au) obj2;
        if (c291001Au != null && (str = (String) c291001Au.LIZ) != null && (!TextUtils.isEmpty(str))) {
            SelectedWidgetAssem selectedWidgetAssem = (SelectedWidgetAssem) awS455S0200000_19.l0;
            C19EG c19eg = (C19EG) awS455S0200000_19.l1;
            selectedWidgetAssem.setLoading(false);
            C1389890mGx c1389890mGx = new C1389890mGx(c19eg);
            c1389890mGx.LJIIJ(str);
            c1389890mGx.LJIIJJI();
        }
        return Unit.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object invoke$25(AwS455S0200000_19 awS455S0200000_19, Object obj, Object obj2) {
        Object obj3;
        boolean z;
        C428130GqZ c428130GqZ;
        C291001Au c291001Au = (C291001Au) obj2;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onHiddenChangedEvent is ");
        if (c291001Au != null) {
            obj3 = c291001Au.LIZ;
        } else {
            obj3 = null;
        }
        sbLIZ.append(obj3);
        C2188811AlT.LIZIZ(sbLIZ);
        ProfileNavbarViewerEntranceProtocol profileNavbarViewerEntranceProtocol = (ProfileNavbarViewerEntranceProtocol) awS455S0200000_19.l0;
        if (c291001Au != null && !((Boolean) c291001Au.LIZ).booleanValue()) {
            ProfileNavbarViewerEntranceProtocol profileNavbarViewerEntranceProtocol2 = (ProfileNavbarViewerEntranceProtocol) awS455S0200000_19.l0;
            if (profileNavbarViewerEntranceProtocol2.LLLFF != null) {
                profileNavbarViewerEntranceProtocol2.LJLJLLL(false);
            }
            if (!((ProfileNavbarViewerEntranceProtocol) awS455S0200000_19.l0).LLJLLL) {
                C1253930ijf c1253930ijf = C1253930ijf.LIZ;
                int iLJLJI = ProfileNavbarViewerEntranceProtocol.LJLJI();
                int iLJLIIIL = ((ProfileNavbarViewerEntranceProtocol) awS455S0200000_19.l0).LJLIIIL();
                c1253930ijf.getClass();
                C1253930ijf.LJIILJJIL(iLJLJI, iLJLIIIL, "show");
                ((ProfileNavbarViewerEntranceProtocol) awS455S0200000_19.l0).LLLFFI = EnumC1251640ify.NORMAL;
            }
            z = true;
        } else {
            ((C013C) awS455S0200000_19.l1).element = false;
            z = false;
        }
        profileNavbarViewerEntranceProtocol.LLJLLL = z;
        if (c291001Au != null && ((Boolean) c291001Au.LIZ).booleanValue() && (c428130GqZ = ((ProfileNavbarViewerEntranceProtocol) awS455S0200000_19.l0).LLJZ) != null) {
            c428130GqZ.LIZ();
        }
        return Unit.LIZ;
    }

    public static final Object invoke$26(AwS455S0200000_19 awS455S0200000_19, Object obj, Object obj2) {
        if (!(obj2 instanceof C558690Lvf)) {
            EditProfileBioCellAssem editProfileBioCellAssem = (EditProfileBioCellAssem) awS455S0200000_19.l0;
            View view = editProfileBioCellAssem.LLJIJIL;
            if (view != null || (view = editProfileBioCellAssem.LLJI) != null) {
                HandlerHook.viewPost(view, new ARunnableS119S0100000_19(editProfileBioCellAssem, 106));
            }
            C0ZP4 c0zp4 = (C0ZP4) ((C259800zU) awS455S0200000_19.l1).element;
            if (c0zp4 != null) {
                c0zp4.dispose();
            }
        }
        return Unit.LIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0097  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$27(kotlin.jvm.internal.AwS455S0200000_19 r10, java.lang.Object r11, java.lang.Object r12) {
        /*
            r6 = r11
            X.0tpg r6 = (X.InterfaceC1680500tpg) r6
            java.lang.Number r12 = (java.lang.Number) r12
            int r0 = r12.intValue()
            r1 = r0 & 3
            r0 = 2
            if (r1 != r0) goto L1a
            boolean r0 = r6.LIZ()
            if (r0 == 0) goto L1a
            r6.LIZJ()
        L17:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L1a:
            r0 = 2131838129(0x7f1144b1, float:1.9309473E38)
            java.lang.String r7 = X.C0MBB.LIZIZ(r0, r6)
            r9 = 1
            r3 = -1633490746(0xffffffff9ea2e8c6, float:-1.724869E-20)
            r6.LJJIIJZLJL(r3)
            java.lang.Object r0 = r10.l0
            com.ss.android.ugc.profile.business.ur.ui.ProfileEditNicknameFragment r0 = (com.ss.android.ugc.profile.business.ur.ui.ProfileEditNicknameFragment) r0
            boolean r4 = r6.LJII(r0)
            java.lang.Object r0 = r10.l1
            kotlin.jvm.functions.Function0 r0 = (kotlin.jvm.functions.Function0) r0
            boolean r0 = r6.LJJIIJ(r0)
            r4 = r4 | r0
            java.lang.Object r2 = r10.l0
            com.ss.android.ugc.profile.business.ur.ui.ProfileEditNicknameFragment r2 = (com.ss.android.ugc.profile.business.ur.ui.ProfileEditNicknameFragment) r2
            java.lang.Object r1 = r10.l1
            kotlin.jvm.functions.Function0 r1 = (kotlin.jvm.functions.Function0) r1
            java.lang.Object r8 = r6.LJJ()
            if (r4 != 0) goto L50
            X.0tph r0 = X.InterfaceC1680500tpg.LIZ
            r0.getClass()
            X.0tpi r0 = X.C1680510tph.LIZIZ
            if (r8 != r0) goto L5a
        L50:
            kotlin.jvm.internal.AwS420S0200000_19 r8 = new kotlin.jvm.internal.AwS420S0200000_19
            r0 = 118(0x76, float:1.65E-43)
            r8.<init>(r2, r1, r0)
            r6.LJJIJIIJI(r8)
        L5a:
            kotlin.jvm.functions.Function0 r8 = (kotlin.jvm.functions.Function0) r8
            r6.LJ()
            r4 = 48
            r5 = 0
            X.C1668330tW3.LJIIIIZZ(r4, r5, r6, r7, r8, r9)
            r0 = 2131838128(0x7f1144b0, float:1.930947E38)
            java.lang.String r7 = X.C0MBB.LIZIZ(r0, r6)
            r6.LJJIIJZLJL(r3)
            java.lang.Object r0 = r10.l0
            com.ss.android.ugc.profile.business.ur.ui.ProfileEditNicknameFragment r0 = (com.ss.android.ugc.profile.business.ur.ui.ProfileEditNicknameFragment) r0
            boolean r3 = r6.LJII(r0)
            java.lang.Object r0 = r10.l1
            kotlin.jvm.functions.Function0 r0 = (kotlin.jvm.functions.Function0) r0
            boolean r0 = r6.LJJIIJ(r0)
            r3 = r3 | r0
            java.lang.Object r2 = r10.l0
            com.ss.android.ugc.profile.business.ur.ui.ProfileEditNicknameFragment r2 = (com.ss.android.ugc.profile.business.ur.ui.ProfileEditNicknameFragment) r2
            java.lang.Object r1 = r10.l1
            kotlin.jvm.functions.Function0 r1 = (kotlin.jvm.functions.Function0) r1
            java.lang.Object r8 = r6.LJJ()
            if (r3 != 0) goto L97
            X.0tph r0 = X.InterfaceC1680500tpg.LIZ
            r0.getClass()
            X.0tpi r0 = X.C1680510tph.LIZIZ
            if (r8 != r0) goto La1
        L97:
            kotlin.jvm.internal.AwS420S0200000_19 r8 = new kotlin.jvm.internal.AwS420S0200000_19
            r0 = 119(0x77, float:1.67E-43)
            r8.<init>(r2, r1, r0)
            r6.LJJIJIIJI(r8)
        La1:
            kotlin.jvm.functions.Function0 r8 = (kotlin.jvm.functions.Function0) r8
            r6.LJ()
            r4 = 48
            r5 = 0
            X.C1668330tW3.LJIIIZ(r4, r5, r6, r7, r8, r9)
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS455S0200000_19.invoke$27(kotlin.jvm.internal.AwS455S0200000_19, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    public static final Object invoke$28(AwS455S0200000_19 awS455S0200000_19, Object obj, Object obj2) {
        View view = (View) obj2;
        ((HeaderAdvancedFeatureBaseUIComponent) awS455S0200000_19.l0).Ap((Context) awS455S0200000_19.l1, (LinearLayout) view);
        return view;
    }

    public static final Object invoke$29(AwS455S0200000_19 awS455S0200000_19, Object obj, Object obj2) {
        View view = (View) obj2;
        ((BioStructuralInfoBaseComponent) awS455S0200000_19.l0).Fp((Context) awS455S0200000_19.l1, (LinearLayout) view);
        return view;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x008d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$3(kotlin.jvm.internal.AwS455S0200000_19 r8, java.lang.Object r9, java.lang.Object r10) {
        /*
            r4 = r9
            X.0tpg r4 = (X.InterfaceC1680500tpg) r4
            java.lang.Number r10 = (java.lang.Number) r10
            int r0 = r10.intValue()
            r1 = r0 & 3
            r0 = 2
            if (r1 != r0) goto L1a
            boolean r0 = r4.LIZ()
            if (r0 == 0) goto L1a
            r4.LIZJ()
        L17:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L1a:
            r0 = 2131836371(0x7f113dd3, float:1.9305907E38)
            java.lang.String r5 = X.C0MBB.LIZIZ(r0, r4)
            r7 = 1
            r0 = 5004770(0x4c5de2, float:7.013177E-39)
            r4.LJJIIJZLJL(r0)
            java.lang.Object r0 = r8.l0
            kotlin.jvm.functions.Function0 r0 = (kotlin.jvm.functions.Function0) r0
            boolean r0 = r4.LJJIIJ(r0)
            java.lang.Object r1 = r8.l0
            kotlin.jvm.functions.Function0 r1 = (kotlin.jvm.functions.Function0) r1
            java.lang.Object r6 = r4.LJJ()
            if (r0 != 0) goto L43
            X.0tph r0 = X.InterfaceC1680500tpg.LIZ
            r0.getClass()
            X.0tpi r0 = X.C1680510tph.LIZIZ
            if (r6 != r0) goto L4d
        L43:
            kotlin.jvm.internal.AwS563S0100000_19 r6 = new kotlin.jvm.internal.AwS563S0100000_19
            r0 = 1476(0x5c4, float:2.068E-42)
            r6.<init>(r1, r0)
            r4.LJJIJIIJI(r6)
        L4d:
            kotlin.jvm.functions.Function0 r6 = (kotlin.jvm.functions.Function0) r6
            r4.LJ()
            r2 = 48
            r3 = 0
            X.C1668330tW3.LJIIIZ(r2, r3, r4, r5, r6, r7)
            r0 = 2131836370(0x7f113dd2, float:1.9305905E38)
            java.lang.String r5 = X.C0MBB.LIZIZ(r0, r4)
            r0 = -1633490746(0xffffffff9ea2e8c6, float:-1.724869E-20)
            r4.LJJIIJZLJL(r0)
            java.lang.Object r0 = r8.l1
            kotlin.jvm.functions.Function0 r0 = (kotlin.jvm.functions.Function0) r0
            boolean r3 = r4.LJJIIJ(r0)
            java.lang.Object r0 = r8.l0
            kotlin.jvm.functions.Function0 r0 = (kotlin.jvm.functions.Function0) r0
            boolean r0 = r4.LJJIIJ(r0)
            r3 = r3 | r0
            java.lang.Object r2 = r8.l1
            kotlin.jvm.functions.Function0 r2 = (kotlin.jvm.functions.Function0) r2
            java.lang.Object r1 = r8.l0
            kotlin.jvm.functions.Function0 r1 = (kotlin.jvm.functions.Function0) r1
            java.lang.Object r6 = r4.LJJ()
            if (r3 != 0) goto L8d
            X.0tph r0 = X.InterfaceC1680500tpg.LIZ
            r0.getClass()
            X.0tpi r0 = X.C1680510tph.LIZIZ
            if (r6 != r0) goto L97
        L8d:
            kotlin.jvm.internal.AwS420S0200000_19 r6 = new kotlin.jvm.internal.AwS420S0200000_19
            r0 = 89
            r6.<init>(r2, r1, r0)
            r4.LJJIJIIJI(r6)
        L97:
            kotlin.jvm.functions.Function0 r6 = (kotlin.jvm.functions.Function0) r6
            r4.LJ()
            r2 = 48
            r3 = 0
            X.C1668330tW3.LJII(r2, r3, r4, r5, r6, r7)
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS455S0200000_19.invoke$3(kotlin.jvm.internal.AwS455S0200000_19, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    public static final Object invoke$30(AwS455S0200000_19 awS455S0200000_19, Object obj, Object obj2) {
        View view = (View) obj2;
        ((ProfileHeaderTopTipsBaseUIComponent) awS455S0200000_19.l0).up((Context) awS455S0200000_19.l1, (LinearLayout) view);
        return view;
    }

    public static final Object invoke$31(AwS455S0200000_19 awS455S0200000_19, Object obj, Object obj2) {
        InterfaceC1680500tpg interfaceC1680500tpg = (InterfaceC1680500tpg) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && interfaceC1680500tpg.LIZ()) {
            interfaceC1680500tpg.LIZJ();
        } else {
            ((ComposeView) awS455S0200000_19.l0).setViewCompositionStrategy(C20088213iq.LIZIZ);
            C1669670tYD.LJ((ComposeView) awS455S0200000_19.l0, EnumC1427810nG7.Auto, C13Z4.LIZJ(2102700781, new AwS633S0100000_19((DisplayAndCaptionComposePage) awS455S0200000_19.l1, 194), interfaceC1680500tpg));
        }
        return Unit.LIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0097  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$32(kotlin.jvm.internal.AwS455S0200000_19 r10, java.lang.Object r11, java.lang.Object r12) {
        /*
            r6 = r11
            X.0tpg r6 = (X.InterfaceC1680500tpg) r6
            java.lang.Number r12 = (java.lang.Number) r12
            int r0 = r12.intValue()
            r1 = r0 & 3
            r0 = 2
            if (r1 != r0) goto L1a
            boolean r0 = r6.LIZ()
            if (r0 == 0) goto L1a
            r6.LIZJ()
        L17:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L1a:
            r0 = 2131851304(0x7f117828, float:1.9336195E38)
            java.lang.String r7 = X.C0MBB.LIZIZ(r0, r6)
            r9 = 1
            r3 = -1633490746(0xffffffff9ea2e8c6, float:-1.724869E-20)
            r6.LJJIIJZLJL(r3)
            java.lang.Object r0 = r10.l0
            com.ss.android.ugc.aweme.live.livehostimpl.livereply.autopost.AutoPostLivingPanelDialog r0 = (com.ss.android.ugc.aweme.live.livehostimpl.livereply.autopost.AutoPostLivingPanelDialog) r0
            boolean r4 = r6.LJII(r0)
            java.lang.Object r0 = r10.l1
            kotlin.jvm.functions.Function0 r0 = (kotlin.jvm.functions.Function0) r0
            boolean r0 = r6.LJJIIJ(r0)
            r4 = r4 | r0
            java.lang.Object r2 = r10.l0
            com.ss.android.ugc.aweme.live.livehostimpl.livereply.autopost.AutoPostLivingPanelDialog r2 = (com.ss.android.ugc.aweme.live.livehostimpl.livereply.autopost.AutoPostLivingPanelDialog) r2
            java.lang.Object r1 = r10.l1
            kotlin.jvm.functions.Function0 r1 = (kotlin.jvm.functions.Function0) r1
            java.lang.Object r8 = r6.LJJ()
            if (r4 != 0) goto L50
            X.0tph r0 = X.InterfaceC1680500tpg.LIZ
            r0.getClass()
            X.0tpi r0 = X.C1680510tph.LIZIZ
            if (r8 != r0) goto L5a
        L50:
            kotlin.jvm.internal.AwS428S0200000_27 r8 = new kotlin.jvm.internal.AwS428S0200000_27
            r0 = 12
            r8.<init>(r2, r1, r0)
            r6.LJJIJIIJI(r8)
        L5a:
            kotlin.jvm.functions.Function0 r8 = (kotlin.jvm.functions.Function0) r8
            r6.LJ()
            r4 = 48
            r5 = 0
            X.C1668330tW3.LJIIIIZZ(r4, r5, r6, r7, r8, r9)
            r0 = 2131851305(0x7f117829, float:1.9336197E38)
            java.lang.String r7 = X.C0MBB.LIZIZ(r0, r6)
            r6.LJJIIJZLJL(r3)
            java.lang.Object r0 = r10.l0
            com.ss.android.ugc.aweme.live.livehostimpl.livereply.autopost.AutoPostLivingPanelDialog r0 = (com.ss.android.ugc.aweme.live.livehostimpl.livereply.autopost.AutoPostLivingPanelDialog) r0
            boolean r3 = r6.LJII(r0)
            java.lang.Object r0 = r10.l1
            kotlin.jvm.functions.Function0 r0 = (kotlin.jvm.functions.Function0) r0
            boolean r0 = r6.LJJIIJ(r0)
            r3 = r3 | r0
            java.lang.Object r2 = r10.l0
            com.ss.android.ugc.aweme.live.livehostimpl.livereply.autopost.AutoPostLivingPanelDialog r2 = (com.ss.android.ugc.aweme.live.livehostimpl.livereply.autopost.AutoPostLivingPanelDialog) r2
            java.lang.Object r1 = r10.l1
            kotlin.jvm.functions.Function0 r1 = (kotlin.jvm.functions.Function0) r1
            java.lang.Object r8 = r6.LJJ()
            if (r3 != 0) goto L97
            X.0tph r0 = X.InterfaceC1680500tpg.LIZ
            r0.getClass()
            X.0tpi r0 = X.C1680510tph.LIZIZ
            if (r8 != r0) goto La1
        L97:
            kotlin.jvm.internal.AwS428S0200000_27 r8 = new kotlin.jvm.internal.AwS428S0200000_27
            r0 = 13
            r8.<init>(r2, r1, r0)
            r6.LJJIJIIJI(r8)
        La1:
            kotlin.jvm.functions.Function0 r8 = (kotlin.jvm.functions.Function0) r8
            r6.LJ()
            r4 = 48
            r5 = 0
            X.C1668330tW3.LJIIIZ(r4, r5, r6, r7, r8, r9)
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS455S0200000_19.invoke$32(kotlin.jvm.internal.AwS455S0200000_19, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x008d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$33(kotlin.jvm.internal.AwS455S0200000_19 r8, java.lang.Object r9, java.lang.Object r10) {
        /*
            r4 = r9
            X.0tpg r4 = (X.InterfaceC1680500tpg) r4
            java.lang.Number r10 = (java.lang.Number) r10
            int r0 = r10.intValue()
            r1 = r0 & 3
            r0 = 2
            if (r1 != r0) goto L1a
            boolean r0 = r4.LIZ()
            if (r0 == 0) goto L1a
            r4.LIZJ()
        L17:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L1a:
            r0 = 2131827632(0x7f111bb0, float:1.9288182E38)
            java.lang.String r5 = X.C0MBB.LIZIZ(r0, r4)
            r7 = 1
            r0 = -1633490746(0xffffffff9ea2e8c6, float:-1.724869E-20)
            r4.LJJIIJZLJL(r0)
            java.lang.Object r0 = r8.l0
            com.ss.android.ugc.profile.business.ur.ui.ProfileEditNicknameFragment r0 = (com.ss.android.ugc.profile.business.ur.ui.ProfileEditNicknameFragment) r0
            boolean r3 = r4.LJII(r0)
            java.lang.Object r0 = r8.l1
            kotlin.jvm.functions.Function0 r0 = (kotlin.jvm.functions.Function0) r0
            boolean r0 = r4.LJJIIJ(r0)
            r3 = r3 | r0
            java.lang.Object r2 = r8.l0
            com.ss.android.ugc.profile.business.ur.ui.ProfileEditNicknameFragment r2 = (com.ss.android.ugc.profile.business.ur.ui.ProfileEditNicknameFragment) r2
            java.lang.Object r1 = r8.l1
            kotlin.jvm.functions.Function0 r1 = (kotlin.jvm.functions.Function0) r1
            java.lang.Object r6 = r4.LJJ()
            if (r3 != 0) goto L50
            X.0tph r0 = X.InterfaceC1680500tpg.LIZ
            r0.getClass()
            X.0tpi r0 = X.C1680510tph.LIZIZ
            if (r6 != r0) goto L5a
        L50:
            kotlin.jvm.internal.AwS420S0200000_19 r6 = new kotlin.jvm.internal.AwS420S0200000_19
            r0 = 135(0x87, float:1.89E-43)
            r6.<init>(r2, r1, r0)
            r4.LJJIJIIJI(r6)
        L5a:
            kotlin.jvm.functions.Function0 r6 = (kotlin.jvm.functions.Function0) r6
            r4.LJ()
            r2 = 48
            r3 = 0
            X.C1668330tW3.LJIIIIZZ(r2, r3, r4, r5, r6, r7)
            r0 = 2131827629(0x7f111bad, float:1.9288176E38)
            java.lang.String r5 = X.C0MBB.LIZIZ(r0, r4)
            r0 = 5004770(0x4c5de2, float:7.013177E-39)
            r4.LJJIIJZLJL(r0)
            java.lang.Object r0 = r8.l1
            kotlin.jvm.functions.Function0 r0 = (kotlin.jvm.functions.Function0) r0
            boolean r0 = r4.LJJIIJ(r0)
            java.lang.Object r1 = r8.l1
            kotlin.jvm.functions.Function0 r1 = (kotlin.jvm.functions.Function0) r1
            java.lang.Object r6 = r4.LJJ()
            if (r0 != 0) goto L8d
            X.0tph r0 = X.InterfaceC1680500tpg.LIZ
            r0.getClass()
            X.0tpi r0 = X.C1680510tph.LIZIZ
            if (r6 != r0) goto L97
        L8d:
            kotlin.jvm.internal.AwS563S0100000_19 r6 = new kotlin.jvm.internal.AwS563S0100000_19
            r0 = 2793(0xae9, float:3.914E-42)
            r6.<init>(r1, r0)
            r4.LJJIJIIJI(r6)
        L97:
            kotlin.jvm.functions.Function0 r6 = (kotlin.jvm.functions.Function0) r6
            r4.LJ()
            r2 = 48
            r3 = 0
            X.C1668330tW3.LJIIIZ(r2, r3, r4, r5, r6, r7)
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS455S0200000_19.invoke$33(kotlin.jvm.internal.AwS455S0200000_19, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x008d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$34(kotlin.jvm.internal.AwS455S0200000_19 r8, java.lang.Object r9, java.lang.Object r10) {
        /*
            r4 = r9
            X.0tpg r4 = (X.InterfaceC1680500tpg) r4
            java.lang.Number r10 = (java.lang.Number) r10
            int r0 = r10.intValue()
            r1 = r0 & 3
            r0 = 2
            if (r1 != r0) goto L1a
            boolean r0 = r4.LIZ()
            if (r0 == 0) goto L1a
            r4.LIZJ()
        L17:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L1a:
            r0 = 2131827622(0x7f111ba6, float:1.9288162E38)
            java.lang.String r5 = X.C0MBB.LIZIZ(r0, r4)
            r7 = 1
            r0 = -1633490746(0xffffffff9ea2e8c6, float:-1.724869E-20)
            r4.LJJIIJZLJL(r0)
            java.lang.Object r0 = r8.l0
            com.ss.android.ugc.profile.business.ur.ui.ProfileEditNicknameFragment r0 = (com.ss.android.ugc.profile.business.ur.ui.ProfileEditNicknameFragment) r0
            boolean r3 = r4.LJII(r0)
            java.lang.Object r0 = r8.l1
            kotlin.jvm.functions.Function0 r0 = (kotlin.jvm.functions.Function0) r0
            boolean r0 = r4.LJJIIJ(r0)
            r3 = r3 | r0
            java.lang.Object r2 = r8.l0
            com.ss.android.ugc.profile.business.ur.ui.ProfileEditNicknameFragment r2 = (com.ss.android.ugc.profile.business.ur.ui.ProfileEditNicknameFragment) r2
            java.lang.Object r1 = r8.l1
            kotlin.jvm.functions.Function0 r1 = (kotlin.jvm.functions.Function0) r1
            java.lang.Object r6 = r4.LJJ()
            if (r3 != 0) goto L50
            X.0tph r0 = X.InterfaceC1680500tpg.LIZ
            r0.getClass()
            X.0tpi r0 = X.C1680510tph.LIZIZ
            if (r6 != r0) goto L5a
        L50:
            kotlin.jvm.internal.AwS420S0200000_19 r6 = new kotlin.jvm.internal.AwS420S0200000_19
            r0 = 136(0x88, float:1.9E-43)
            r6.<init>(r2, r1, r0)
            r4.LJJIJIIJI(r6)
        L5a:
            kotlin.jvm.functions.Function0 r6 = (kotlin.jvm.functions.Function0) r6
            r4.LJ()
            r2 = 48
            r3 = 0
            X.C1668330tW3.LJIIIIZZ(r2, r3, r4, r5, r6, r7)
            r0 = 2131827629(0x7f111bad, float:1.9288176E38)
            java.lang.String r5 = X.C0MBB.LIZIZ(r0, r4)
            r0 = 5004770(0x4c5de2, float:7.013177E-39)
            r4.LJJIIJZLJL(r0)
            java.lang.Object r0 = r8.l1
            kotlin.jvm.functions.Function0 r0 = (kotlin.jvm.functions.Function0) r0
            boolean r0 = r4.LJJIIJ(r0)
            java.lang.Object r1 = r8.l1
            kotlin.jvm.functions.Function0 r1 = (kotlin.jvm.functions.Function0) r1
            java.lang.Object r6 = r4.LJJ()
            if (r0 != 0) goto L8d
            X.0tph r0 = X.InterfaceC1680500tpg.LIZ
            r0.getClass()
            X.0tpi r0 = X.C1680510tph.LIZIZ
            if (r6 != r0) goto L97
        L8d:
            kotlin.jvm.internal.AwS563S0100000_19 r6 = new kotlin.jvm.internal.AwS563S0100000_19
            r0 = 2794(0xaea, float:3.915E-42)
            r6.<init>(r1, r0)
            r4.LJJIJIIJI(r6)
        L97:
            kotlin.jvm.functions.Function0 r6 = (kotlin.jvm.functions.Function0) r6
            r4.LJ()
            r2 = 48
            r3 = 0
            X.C1668330tW3.LJIIIZ(r2, r3, r4, r5, r6, r7)
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS455S0200000_19.invoke$34(kotlin.jvm.internal.AwS455S0200000_19, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    public static final Object invoke$35(AwS455S0200000_19 awS455S0200000_19, Object obj, Object obj2) {
        String str;
        PopupInstanceConfig popupInstanceConfig;
        List<String> urlList;
        if (((Boolean) obj2).booleanValue()) {
            InterfaceC1345705Ol imUserService = C1336205Ku.LIZ(false).getImUserService();
            C2201941BFw c2201941BFw = IMUser.Companion;
            User user = ((UserState) awS455S0200000_19.l0).getUser();
            c2201941BFw.getClass();
            imUserService.LJIILIIL(C2201941BFw.LIZJ(user));
            if (obj == C0SY7.FOLLOWED || obj == C0SY7.FOLLOW_MUTUAL || obj == C0SY7.FOLLOW_REQUESTED) {
                if (!ChannelsAuthRefactorExp.INSTANCE.enabled() && !ChannelAuthEdmAndSmsGuideV3.INSTANCE.enabled()) {
                    IPushPermissionApi iPushPermissionApi = (IPushPermissionApi) ServiceManager.get().getService(IPushPermissionApi.class);
                    Activity activityLIZ = C0FNT.LIZ(((InterfaceC1264850j1H) awS455S0200000_19.l1).getFragmentActivity());
                    final InterfaceC1264850j1H interfaceC1264850j1H = (InterfaceC1264850j1H) awS455S0200000_19.l1;
                    final UserState userState = (UserState) awS455S0200000_19.l0;
                    iPushPermissionApi.LJIIJ(activityLIZ, "follow_finish", new InterfaceC1914010zuJ() { // from class: X.0ih2
                        @Override // X.InterfaceC1914010zuJ
                        public final void LIZIZ() {
                        }

                        @Override // X.InterfaceC1914010zuJ
                        public final void LIZ() {
                            List<String> urlList2;
                            INoticeService iNoticeService = (INoticeService) PluggableExtentionKt.pluggableSpi$default(INoticeService.class, false, false, false, 14, null);
                            if (iNoticeService != null) {
                                C19EG fragmentActivity = interfaceC1264850j1H.getFragmentActivity();
                                String strLIZ = C1264860j1I.LIZ(interfaceC1264850j1H);
                                UrlModel avatarThumb = userState.getUser().getAvatarThumb();
                                iNoticeService.LJJLIIIJILLIZJL(fragmentActivity, new C1917290zzb(null, strLIZ, null, "follow", (avatarThumb == null || (urlList2 = avatarThumb.getUrlList()) == null) ? null : (String) C13LP.LJJJLL(urlList2), null, null, null, "ug_338_follow_fans", 4069));
                            }
                        }
                    });
                } else {
                    UnifiedAuthPopupConfig unifiedAuthPopupConfigLIZJ = ((IUniAuthGuidePopupApi) ServiceManager.get().getService(IUniAuthGuidePopupApi.class)).LIZJ("follow_finish");
                    unifiedAuthPopupConfigLIZJ.setSceneId("follow_finish_fans");
                    unifiedAuthPopupConfigLIZJ.setSubSceneId("follow_finish_fans");
                    unifiedAuthPopupConfigLIZJ.setEnterFrom(C1264860j1I.LIZ((InterfaceC1264850j1H) awS455S0200000_19.l1));
                    UrlModel avatarThumb = ((UserState) awS455S0200000_19.l0).getUser().getAvatarThumb();
                    if (avatarThumb != null && (urlList = avatarThumb.getUrlList()) != null) {
                        str = (String) C13LP.LJJJLL(urlList);
                    } else {
                        str = null;
                    }
                    unifiedAuthPopupConfigLIZJ.setAvatar(str);
                    String nickname = ((UserState) awS455S0200000_19.l0).getUser().getNickname();
                    if (nickname == null || !(!a0.LJJJIL(nickname))) {
                        nickname = "";
                    }
                    unifiedAuthPopupConfigLIZJ.setTargetUserName(nickname);
                    unifiedAuthPopupConfigLIZJ.setPopupTriggerId("ug_338_follow_fans");
                    unifiedAuthPopupConfigLIZJ.setSysPage("follow_finish");
                    List<PopupInstanceConfig> list = unifiedAuthPopupConfigLIZJ.popupInstances;
                    if (list != null && (!list.isEmpty()) && (popupInstanceConfig = (PopupInstanceConfig) ListProtector.get(list, 0)) != null) {
                        popupInstanceConfig.setPopupCombinationType(3);
                    }
                    ((IUniAuthGuidePopupApi) ServiceManager.get().getService(IUniAuthGuidePopupApi.class)).LIZLLL(((InterfaceC1264850j1H) awS455S0200000_19.l1).getFragmentActivity(), null, unifiedAuthPopupConfigLIZJ);
                }
            }
        }
        return Unit.LIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x008d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$36(kotlin.jvm.internal.AwS455S0200000_19 r8, java.lang.Object r9, java.lang.Object r10) {
        /*
            r4 = r9
            X.0tpg r4 = (X.InterfaceC1680500tpg) r4
            java.lang.Number r10 = (java.lang.Number) r10
            int r0 = r10.intValue()
            r1 = r0 & 3
            r0 = 2
            if (r1 != r0) goto L1a
            boolean r0 = r4.LIZ()
            if (r0 == 0) goto L1a
            r4.LIZJ()
        L17:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L1a:
            r0 = 2131832974(0x7f11308e, float:1.9299017E38)
            java.lang.String r5 = X.C0MBB.LIZIZ(r0, r4)
            r7 = 1
            r0 = -1633490746(0xffffffff9ea2e8c6, float:-1.724869E-20)
            r4.LJJIIJZLJL(r0)
            java.lang.Object r0 = r8.l0
            kotlin.jvm.functions.Function0 r0 = (kotlin.jvm.functions.Function0) r0
            boolean r3 = r4.LJJIIJ(r0)
            java.lang.Object r0 = r8.l1
            kotlin.jvm.functions.Function0 r0 = (kotlin.jvm.functions.Function0) r0
            boolean r0 = r4.LJJIIJ(r0)
            r3 = r3 | r0
            java.lang.Object r2 = r8.l0
            kotlin.jvm.functions.Function0 r2 = (kotlin.jvm.functions.Function0) r2
            java.lang.Object r1 = r8.l1
            kotlin.jvm.functions.Function0 r1 = (kotlin.jvm.functions.Function0) r1
            java.lang.Object r6 = r4.LJJ()
            if (r3 != 0) goto L50
            X.0tph r0 = X.InterfaceC1680500tpg.LIZ
            r0.getClass()
            X.0tpi r0 = X.C1680510tph.LIZIZ
            if (r6 != r0) goto L5a
        L50:
            kotlin.jvm.internal.AwS420S0200000_19 r6 = new kotlin.jvm.internal.AwS420S0200000_19
            r0 = 142(0x8e, float:1.99E-43)
            r6.<init>(r2, r1, r0)
            r4.LJJIJIIJI(r6)
        L5a:
            kotlin.jvm.functions.Function0 r6 = (kotlin.jvm.functions.Function0) r6
            r4.LJ()
            r2 = 48
            r3 = 0
            X.C1668330tW3.LJIIIIZZ(r2, r3, r4, r5, r6, r7)
            r0 = 2131836275(0x7f113d73, float:1.9305712E38)
            java.lang.String r5 = X.C0MBB.LIZIZ(r0, r4)
            r0 = 5004770(0x4c5de2, float:7.013177E-39)
            r4.LJJIIJZLJL(r0)
            java.lang.Object r0 = r8.l1
            kotlin.jvm.functions.Function0 r0 = (kotlin.jvm.functions.Function0) r0
            boolean r0 = r4.LJJIIJ(r0)
            java.lang.Object r1 = r8.l1
            kotlin.jvm.functions.Function0 r1 = (kotlin.jvm.functions.Function0) r1
            java.lang.Object r6 = r4.LJJ()
            if (r0 != 0) goto L8d
            X.0tph r0 = X.InterfaceC1680500tpg.LIZ
            r0.getClass()
            X.0tpi r0 = X.C1680510tph.LIZIZ
            if (r6 != r0) goto L97
        L8d:
            kotlin.jvm.internal.AwS563S0100000_19 r6 = new kotlin.jvm.internal.AwS563S0100000_19
            r0 = 2848(0xb20, float:3.991E-42)
            r6.<init>(r1, r0)
            r4.LJJIJIIJI(r6)
        L97:
            kotlin.jvm.functions.Function0 r6 = (kotlin.jvm.functions.Function0) r6
            r4.LJ()
            r2 = 48
            r3 = 0
            X.C1668330tW3.LJIIIZ(r2, r3, r4, r5, r6, r7)
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS455S0200000_19.invoke$36(kotlin.jvm.internal.AwS455S0200000_19, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    public static final Object invoke$37(AwS455S0200000_19 awS455S0200000_19, Object obj, Object obj2) {
        InterfaceC1680500tpg interfaceC1680500tpg = (InterfaceC1680500tpg) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && interfaceC1680500tpg.LIZ()) {
            interfaceC1680500tpg.LIZJ();
        } else {
            String strLIZIZ = C0MBB.LIZIZ(2131848970, interfaceC1680500tpg);
            interfaceC1680500tpg.LJJIIJZLJL(5004770);
            C05P0 c05p0 = (C05P0) awS455S0200000_19.l1;
            Object objLJJ = interfaceC1680500tpg.LJJ();
            InterfaceC1680500tpg.LIZ.getClass();
            C1680520tpi c1680520tpi = C1680510tph.LIZIZ;
            if (objLJJ == c1680520tpi) {
                objLJJ = new AwS553S0100000_9(c05p0, (C05P0<Boolean>) 1682);
                interfaceC1680500tpg.LJJIJIIJI(objLJJ);
            }
            interfaceC1680500tpg.LJ();
            C1668330tW3.LJIIIZ(384, 2, interfaceC1680500tpg, strLIZIZ, (Function0) objLJJ, false);
            String strLIZIZ2 = C0MBB.LIZIZ(2131848973, interfaceC1680500tpg);
            interfaceC1680500tpg.LJJIIJZLJL(-1633490746);
            boolean zLJII = interfaceC1680500tpg.LJII((Activity) awS455S0200000_19.l0);
            Activity activity = (Activity) awS455S0200000_19.l0;
            C05P0 c05p02 = (C05P0) awS455S0200000_19.l1;
            Object objLJJ2 = interfaceC1680500tpg.LJJ();
            if (zLJII || objLJJ2 == c1680520tpi) {
                objLJJ2 = new AwS403S0200000_2(activity, (Activity) c05p02, (C05P0<Boolean>) 56);
                interfaceC1680500tpg.LJJIJIIJI(objLJJ2);
            }
            interfaceC1680500tpg.LJ();
            C1668330tW3.LJIIIIZZ(0, 2, interfaceC1680500tpg, strLIZIZ2, (Function0) objLJJ2, false);
        }
        return Unit.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object invoke$38(AwS455S0200000_19 awS455S0200000_19, Object obj, Object obj2) {
        MusicAwemeList musicAwemeList;
        AbstractC738140SxQ abstractC738140SxQ = (AbstractC738140SxQ) obj;
        C291001Au c291001Au = (C291001Au) obj2;
        if (c291001Au != null && (musicAwemeList = (MusicAwemeList) c291001Au.LIZ) != null && musicAwemeList.containSquareData) {
            C013C c013c = (C013C) awS455S0200000_19.l0;
            if (!c013c.element) {
                c013c.element = true;
                IMDPButtonAnimationAbility iMDPButtonAnimationAbility = (IMDPButtonAnimationAbility) C1558520qew.LIZ(C1558520qew.LJIIL(abstractC738140SxQ), IMDPButtonAnimationAbility.class, null);
                if (iMDPButtonAnimationAbility != null) {
                    iMDPButtonAnimationAbility.Iy0((View) awS455S0200000_19.l1, new C1253050iiF() { // from class: X.0hjN
                    });
                }
            }
        }
        return Unit.LIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x008d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$39(kotlin.jvm.internal.AwS455S0200000_19 r8, java.lang.Object r9, java.lang.Object r10) {
        /*
            r4 = r9
            X.0tpg r4 = (X.InterfaceC1680500tpg) r4
            java.lang.Number r10 = (java.lang.Number) r10
            int r0 = r10.intValue()
            r1 = r0 & 3
            r0 = 2
            if (r1 != r0) goto L1a
            boolean r0 = r4.LIZ()
            if (r0 == 0) goto L1a
            r4.LIZJ()
        L17:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L1a:
            r0 = 2131858006(0x7f119256, float:1.9349788E38)
            java.lang.String r5 = X.C0MBB.LIZIZ(r0, r4)
            r7 = 1
            r0 = -1633490746(0xffffffff9ea2e8c6, float:-1.724869E-20)
            r4.LJJIIJZLJL(r0)
            java.lang.Object r0 = r8.l0
            X.0ivM r0 = (X.C1261180ivM) r0
            boolean r3 = r4.LJII(r0)
            java.lang.Object r0 = r8.l1
            kotlin.jvm.functions.Function0 r0 = (kotlin.jvm.functions.Function0) r0
            boolean r0 = r4.LJJIIJ(r0)
            r3 = r3 | r0
            java.lang.Object r2 = r8.l0
            X.0ivM r2 = (X.C1261180ivM) r2
            java.lang.Object r1 = r8.l1
            kotlin.jvm.functions.Function0 r1 = (kotlin.jvm.functions.Function0) r1
            java.lang.Object r6 = r4.LJJ()
            if (r3 != 0) goto L50
            X.0tph r0 = X.InterfaceC1680500tpg.LIZ
            r0.getClass()
            X.0tpi r0 = X.C1680510tph.LIZIZ
            if (r6 != r0) goto L5a
        L50:
            kotlin.jvm.internal.AwS420S0200000_19 r6 = new kotlin.jvm.internal.AwS420S0200000_19
            r0 = 144(0x90, float:2.02E-43)
            r6.<init>(r2, r1, r0)
            r4.LJJIJIIJI(r6)
        L5a:
            kotlin.jvm.functions.Function0 r6 = (kotlin.jvm.functions.Function0) r6
            r4.LJ()
            r2 = 48
            r3 = 0
            X.C1668330tW3.LJIIIIZZ(r2, r3, r4, r5, r6, r7)
            r0 = 2131828357(0x7f111e85, float:1.9289653E38)
            java.lang.String r5 = X.C0MBB.LIZIZ(r0, r4)
            r0 = 5004770(0x4c5de2, float:7.013177E-39)
            r4.LJJIIJZLJL(r0)
            java.lang.Object r0 = r8.l1
            kotlin.jvm.functions.Function0 r0 = (kotlin.jvm.functions.Function0) r0
            boolean r0 = r4.LJJIIJ(r0)
            java.lang.Object r1 = r8.l1
            kotlin.jvm.functions.Function0 r1 = (kotlin.jvm.functions.Function0) r1
            java.lang.Object r6 = r4.LJJ()
            if (r0 != 0) goto L8d
            X.0tph r0 = X.InterfaceC1680500tpg.LIZ
            r0.getClass()
            X.0tpi r0 = X.C1680510tph.LIZIZ
            if (r6 != r0) goto L97
        L8d:
            kotlin.jvm.internal.AwS563S0100000_19 r6 = new kotlin.jvm.internal.AwS563S0100000_19
            r0 = 2910(0xb5e, float:4.078E-42)
            r6.<init>(r1, r0)
            r4.LJJIJIIJI(r6)
        L97:
            kotlin.jvm.functions.Function0 r6 = (kotlin.jvm.functions.Function0) r6
            r4.LJ()
            r2 = 48
            r3 = 0
            X.C1668330tW3.LJIIIZ(r2, r3, r4, r5, r6, r7)
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS455S0200000_19.invoke$39(kotlin.jvm.internal.AwS455S0200000_19, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    public static /* bridge */ /* synthetic */ Object invoke$4(AwS455S0200000_19 awS455S0200000_19, Object obj, Object obj2) {
        String str = (String) obj2;
        IMCrossAppFeatureDiffApi.LIZ.getClass();
        IMCrossAppFeatureDiffApi iMCrossAppFeatureDiffApiLIZIZ = C898670ZNh.LIZIZ();
        if (iMCrossAppFeatureDiffApiLIZIZ != null && iMCrossAppFeatureDiffApiLIZIZ.LIZLLL() && str.length() == 0) {
            TuxTextView tuxTextView = (TuxTextView) awS455S0200000_19.l0;
            if (tuxTextView != null) {
                C786410Ut5.LLLLZLL(tuxTextView, 0);
            }
            FrameLayout frameLayout = (FrameLayout) awS455S0200000_19.l1;
            if (frameLayout != null) {
                C786410Ut5.LJZ(0, frameLayout);
            }
        } else {
            TuxTextView tuxTextView2 = (TuxTextView) awS455S0200000_19.l0;
            if (tuxTextView2 != null) {
                C786410Ut5.LLLLZLL(tuxTextView2, 8);
            }
            FrameLayout frameLayout2 = (FrameLayout) awS455S0200000_19.l1;
            if (frameLayout2 != null) {
                C786410Ut5.LJZ(8, frameLayout2);
            }
        }
        return Unit.LIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x003d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$40(kotlin.jvm.internal.AwS455S0200000_19 r6, java.lang.Object r7, java.lang.Object r8) {
        /*
            r5 = r7
            X.0tpg r5 = (X.InterfaceC1680500tpg) r5
            java.lang.Number r8 = (java.lang.Number) r8
            int r0 = r8.intValue()
            r1 = r0 & 3
            r0 = 2
            if (r1 != r0) goto L1a
            boolean r0 = r5.LIZ()
            if (r0 == 0) goto L1a
            r5.LIZJ()
        L17:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L1a:
            X.0tyA r3 = X.InterfaceC1685750ty9.LIZ
            r0 = 5004770(0x4c5de2, float:7.013177E-39)
            r5.LJJIIJZLJL(r0)
            java.lang.Object r0 = r6.l0
            android.content.Context r0 = (android.content.Context) r0
            boolean r0 = r5.LJII(r0)
            java.lang.Object r2 = r6.l0
            android.content.Context r2 = (android.content.Context) r2
            java.lang.Object r1 = r5.LJJ()
            if (r0 != 0) goto L3d
            X.0tph r0 = X.InterfaceC1680500tpg.LIZ
            r0.getClass()
            X.0tpi r0 = X.C1680510tph.LIZIZ
            if (r1 != r0) goto L47
        L3d:
            kotlin.jvm.internal.AwS604S0100000_25 r1 = new kotlin.jvm.internal.AwS604S0100000_25
            r0 = 586(0x24a, float:8.21E-43)
            r1.<init>(r2, r0)
            r5.LJJIJIIJI(r1)
        L47:
            kotlin.jvm.functions.Function1 r1 = (kotlin.jvm.functions.Function1) r1
            r5.LJ()
            r2 = 0
            X.0ty9 r1 = X.C1689740u4a.LIZIZ(r3, r2, r1)
            X.0tWw r0 = X.C1669660tYC.LJIIZILJ
            r3 = 0
            java.lang.Object r4 = r6.l1
            kotlin.jvm.functions.Function0 r4 = (kotlin.jvm.functions.Function0) r4
            r7 = 12
            r6 = r2
            X.C1668060tVc.LIZLLL(r0, r1, r2, r3, r4, r5, r6, r7)
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS455S0200000_19.invoke$40(kotlin.jvm.internal.AwS455S0200000_19, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    public static final Object invoke$41(AwS455S0200000_19 awS455S0200000_19, Object obj, Object obj2) {
        InterfaceC1680500tpg interfaceC1680500tpg = (InterfaceC1680500tpg) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && interfaceC1680500tpg.LIZ()) {
            interfaceC1680500tpg.LIZJ();
        } else {
            InterfaceC1685750ty9 interfaceC1685750ty9LJI = c.LJI(c.LJ(InterfaceC1685750ty9.LIZ, 1.0f), 44);
            long j = C1685910tyP.LJIIIZ;
            C19719212De c19719212DeLIZJ = C13Z4.LIZJ(-857494384, new AwS633S0100000_19((Context) awS455S0200000_19.l0, 249), interfaceC1680500tpg);
            interfaceC1680500tpg.LJJIIJZLJL(1698921197);
            IScanQRCodeDiffProtocol.LIZ.getClass();
            C1070210dxL.LIZIZ.getValue().LIZIZ();
            C19719212De c19719212DeLIZJ2 = C13Z4.LIZJ(209980627, new AwS455S0200000_19((Context) awS455S0200000_19.l0, (C1220330hrT) awS455S0200000_19.l1, 42), interfaceC1680500tpg);
            interfaceC1680500tpg.LJ();
            C1668060tVc.LIZ(interfaceC1685750ty9LJI, false, 0L, j, null, c19719212DeLIZJ, null, c19719212DeLIZJ2, interfaceC1680500tpg, 199686, 86);
        }
        return Unit.LIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x004c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$42(kotlin.jvm.internal.AwS455S0200000_19 r10, java.lang.Object r11, java.lang.Object r12) {
        /*
            r9 = r11
            X.0tpg r9 = (X.InterfaceC1680500tpg) r9
            java.lang.Number r12 = (java.lang.Number) r12
            int r0 = r12.intValue()
            r1 = r0 & 3
            r0 = 2
            if (r1 != r0) goto L1a
            boolean r0 = r9.LIZ()
            if (r0 == 0) goto L1a
            r9.LIZJ()
        L17:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L1a:
            X.0tWw r4 = X.C1669660tYC.LLZZLLIL
            r5 = 0
            r6 = 0
            r0 = -1633490746(0xffffffff9ea2e8c6, float:-1.724869E-20)
            r9.LJJIIJZLJL(r0)
            java.lang.Object r0 = r10.l0
            X.0hrT r0 = (X.C1220330hrT) r0
            boolean r3 = r9.LJJIIJ(r0)
            java.lang.Object r0 = r10.l1
            android.content.Context r0 = (android.content.Context) r0
            boolean r0 = r9.LJII(r0)
            r3 = r3 | r0
            java.lang.Object r2 = r10.l0
            X.0hrT r2 = (X.C1220330hrT) r2
            java.lang.Object r1 = r10.l1
            android.content.Context r1 = (android.content.Context) r1
            java.lang.Object r8 = r9.LJJ()
            if (r3 != 0) goto L4c
            X.0tph r0 = X.InterfaceC1680500tpg.LIZ
            r0.getClass()
            X.0tpi r0 = X.C1680510tph.LIZIZ
            if (r8 != r0) goto L56
        L4c:
            kotlin.jvm.internal.AwS420S0200000_19 r8 = new kotlin.jvm.internal.AwS420S0200000_19
            r0 = 151(0x97, float:2.12E-43)
            r8.<init>(r1, r2, r0)
            r9.LJJIJIIJI(r8)
        L56:
            kotlin.jvm.functions.Function0 r8 = (kotlin.jvm.functions.Function0) r8
            r9.LJ()
            r11 = 14
            r7 = r5
            r10 = r6
            X.C1668060tVc.LIZLLL(r4, r5, r6, r7, r8, r9, r10, r11)
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS455S0200000_19.invoke$42(kotlin.jvm.internal.AwS455S0200000_19, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    public static final Object invoke$43(AwS455S0200000_19 awS455S0200000_19, Object obj, Object obj2) {
        boolean z;
        C291001Au c291001Au = (C291001Au) obj2;
        C0HZQ c0hzq = (C0HZQ) awS455S0200000_19.l0;
        if (!((ChooseStyleCell) awS455S0200000_19.l1).LLILLJJLI && ((Set) c291001Au.LIZ).size() >= 5) {
            z = false;
        } else {
            z = true;
        }
        c0hzq.setEnabled(z);
        return Unit.LIZ;
    }

    public static final Object invoke$44(AwS455S0200000_19 awS455S0200000_19, Object obj, Object obj2) {
        C191994109g c191994109g = C191994109g.LIZ;
        String str = ((CheckupRelationFollowerCell) awS455S0200000_19.l0).I5().LLILLJJLI;
        String str2 = ((CheckupRelationFollowerCell) awS455S0200000_19.l0).I5().LLILLL;
        String uid = ((C994040byU) awS455S0200000_19.l1).LL.getUid();
        c191994109g.getClass();
        C191994109g.LJII((C0SY7) obj, (C0SY7) obj2, str, str2, uid);
        return Unit.LIZ;
    }

    public static final Object invoke$45(AwS455S0200000_19 awS455S0200000_19, Object obj, Object obj2) {
        boolean zBooleanValue;
        InterfaceC1680500tpg interfaceC1680500tpg = (InterfaceC1680500tpg) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && interfaceC1680500tpg.LIZ()) {
            interfaceC1680500tpg.LIZJ();
        } else {
            if (((Boolean) ((C05P0) awS455S0200000_19.l0).getValue()).booleanValue()) {
                zBooleanValue = ((Boolean) ((C05P0) awS455S0200000_19.l1).getValue()).booleanValue();
            } else {
                zBooleanValue = true;
            }
            C1673210tdv.LJIIIZ(0, 1, interfaceC1680500tpg, null, zBooleanValue);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$46(AwS455S0200000_19 awS455S0200000_19, Object obj, Object obj2) {
        C191994109g c191994109g = C191994109g.LIZ;
        AssemVMLazy assemVMLazy = ((CheckupRelationFollowingCell) awS455S0200000_19.l0).LL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = CheckupRelationFollowingCell.LLILLJJLI;
        String str = ((BaseCheckupRelationViewModel) assemVMLazy.getValue()).LLILLJJLI;
        String str2 = ((BaseCheckupRelationViewModel) ((CheckupRelationFollowingCell) awS455S0200000_19.l0).LL.getValue()).LLILLL;
        String uid = ((C994040byU) awS455S0200000_19.l1).LL.getUid();
        c191994109g.getClass();
        C191994109g.LJII((C0SY7) obj, (C0SY7) obj2, str, str2, uid);
        return Unit.LIZ;
    }

    public static final Object invoke$47(AwS455S0200000_19 awS455S0200000_19, Object obj, Object obj2) {
        Function2 function2 = (Function2) awS455S0200000_19.l0;
        if (function2 != null) {
            function2.invoke(obj, obj2);
        }
        if (obj == C0SY7.UNFOLLOW && obj2 == C0SY7.FOLLOWED) {
            new C0ZDN(((RectRedesignRecUserCell) awS455S0200000_19.l1).itemView.getContext()).LIZ(0);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$48(AwS455S0200000_19 awS455S0200000_19, Object obj, Object obj2) {
        C191994109g c191994109g = C191994109g.LIZ;
        AssemVMLazy assemVMLazy = ((CheckupRelationFriendsCell) awS455S0200000_19.l0).LL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = CheckupRelationFriendsCell.LLILLJJLI;
        String str = ((BaseCheckupRelationViewModel) assemVMLazy.getValue()).LLILLJJLI;
        String str2 = ((BaseCheckupRelationViewModel) ((CheckupRelationFriendsCell) awS455S0200000_19.l0).LL.getValue()).LLILLL;
        String uid = ((C994040byU) awS455S0200000_19.l1).LL.getUid();
        c191994109g.getClass();
        C191994109g.LJII((C0SY7) obj, (C0SY7) obj2, str, str2, uid);
        return Unit.LIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x008d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$49(kotlin.jvm.internal.AwS455S0200000_19 r8, java.lang.Object r9, java.lang.Object r10) {
        /*
            r4 = r9
            X.0tpg r4 = (X.InterfaceC1680500tpg) r4
            java.lang.Number r10 = (java.lang.Number) r10
            int r0 = r10.intValue()
            r1 = r0 & 3
            r0 = 2
            if (r1 != r0) goto L1a
            boolean r0 = r4.LIZ()
            if (r0 == 0) goto L1a
            r4.LIZJ()
        L17:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L1a:
            r0 = 2131851056(0x7f117730, float:1.9335692E38)
            java.lang.String r5 = X.C0MBB.LIZIZ(r0, r4)
            r7 = 1
            r0 = 5004770(0x4c5de2, float:7.013177E-39)
            r4.LJJIIJZLJL(r0)
            java.lang.Object r0 = r8.l0
            kotlin.jvm.functions.Function0 r0 = (kotlin.jvm.functions.Function0) r0
            boolean r0 = r4.LJJIIJ(r0)
            java.lang.Object r1 = r8.l0
            kotlin.jvm.functions.Function0 r1 = (kotlin.jvm.functions.Function0) r1
            java.lang.Object r6 = r4.LJJ()
            if (r0 != 0) goto L43
            X.0tph r0 = X.InterfaceC1680500tpg.LIZ
            r0.getClass()
            X.0tpi r0 = X.C1680510tph.LIZIZ
            if (r6 != r0) goto L4d
        L43:
            kotlin.jvm.internal.AwS563S0100000_19 r6 = new kotlin.jvm.internal.AwS563S0100000_19
            r0 = 3252(0xcb4, float:4.557E-42)
            r6.<init>(r1, r0)
            r4.LJJIJIIJI(r6)
        L4d:
            kotlin.jvm.functions.Function0 r6 = (kotlin.jvm.functions.Function0) r6
            r4.LJ()
            r2 = 48
            r3 = 0
            X.C1668330tW3.LJIIIIZZ(r2, r3, r4, r5, r6, r7)
            r0 = 2131851055(0x7f11772f, float:1.933569E38)
            java.lang.String r5 = X.C0MBB.LIZIZ(r0, r4)
            r0 = -1633490746(0xffffffff9ea2e8c6, float:-1.724869E-20)
            r4.LJJIIJZLJL(r0)
            java.lang.Object r0 = r8.l1
            X.11ry r0 = (X.C19635211ry) r0
            boolean r3 = r4.LJII(r0)
            java.lang.Object r0 = r8.l0
            kotlin.jvm.functions.Function0 r0 = (kotlin.jvm.functions.Function0) r0
            boolean r0 = r4.LJJIIJ(r0)
            r3 = r3 | r0
            java.lang.Object r2 = r8.l1
            X.11ry r2 = (X.C19635211ry) r2
            java.lang.Object r1 = r8.l0
            kotlin.jvm.functions.Function0 r1 = (kotlin.jvm.functions.Function0) r1
            java.lang.Object r6 = r4.LJJ()
            if (r3 != 0) goto L8d
            X.0tph r0 = X.InterfaceC1680500tpg.LIZ
            r0.getClass()
            X.0tpi r0 = X.C1680510tph.LIZIZ
            if (r6 != r0) goto L97
        L8d:
            kotlin.jvm.internal.AwS420S0200000_19 r6 = new kotlin.jvm.internal.AwS420S0200000_19
            r0 = 200(0xc8, float:2.8E-43)
            r6.<init>(r2, r1, r0)
            r4.LJJIJIIJI(r6)
        L97:
            kotlin.jvm.functions.Function0 r6 = (kotlin.jvm.functions.Function0) r6
            r4.LJ()
            r2 = 48
            r3 = 0
            X.C1668330tW3.LJIIIZ(r2, r3, r4, r5, r6, r7)
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS455S0200000_19.invoke$49(kotlin.jvm.internal.AwS455S0200000_19, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    public static final Object invoke$5(AwS455S0200000_19 awS455S0200000_19, Object obj, Object obj2) {
        C1241790iQ5 c1241790iQ5 = (C1241790iQ5) obj2;
        if (c1241790iQ5 != null) {
            C1241770iQ3 c1241770iQ3 = (C1241770iQ3) awS455S0200000_19.l0;
            InboxSearchResultFragment inboxSearchResultFragment = (InboxSearchResultFragment) awS455S0200000_19.l1;
            String str = c1241790iQ5.LIZIZ;
            UrlModel urlModel = c1241790iQ5.LIZJ;
            c1241770iQ3.getInboxSearchUserFilterContainerFromXml().setSelected(true);
            C0DTR.LIZIZ(c1241770iQ3.getInboxSearchUserFilterArrowIconFromXml());
            C427660Gpo inboxSearchUserFilterHeadFromXml = c1241770iQ3.getInboxSearchUserFilterHeadFromXml();
            C427660Gpo.LJIIJJI(inboxSearchUserFilterHeadFromXml, C438710HIf.LIZ(urlModel), false, null, null, false, false, null, null, false, null, 1022);
            C12ES.LJIILL(0, inboxSearchUserFilterHeadFromXml);
            TuxTextView inboxSearchUserFilterNameFromXml = c1241770iQ3.getInboxSearchUserFilterNameFromXml();
            inboxSearchUserFilterNameFromXml.setText(str);
            C12ES.LJIILL(0, inboxSearchUserFilterNameFromXml);
            C12ES.LJIILL(0, c1241770iQ3.getInboxSearchUserFilterDeleteIconFromXml());
            inboxSearchResultFragment.LLJILJILJ = true;
            LinearLayout container = c1241770iQ3.getContainer();
            if (container != null) {
                container.setClickable(false);
            }
        } else {
            C1241770iQ3 c1241770iQ32 = (C1241770iQ3) awS455S0200000_19.l0;
            InboxSearchResultFragment inboxSearchResultFragment2 = (InboxSearchResultFragment) awS455S0200000_19.l1;
            c1241770iQ32.getInboxSearchUserFilterContainerFromXml().setSelected(false);
            C12ES.LJIILL(0, c1241770iQ32.getInboxSearchUserFilterArrowIconFromXml());
            C0DTR.LIZIZ(c1241770iQ32.getInboxSearchUserFilterHeadFromXml());
            C0DTR.LIZIZ(c1241770iQ32.getInboxSearchUserFilterNameFromXml());
            C0DTR.LIZIZ(c1241770iQ32.getInboxSearchUserFilterDeleteIconFromXml());
            inboxSearchResultFragment2.LLJILJILJ = false;
            LinearLayout container2 = c1241770iQ32.getContainer();
            if (container2 != null) {
                container2.setClickable(true);
            }
        }
        return Unit.LIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0097  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$50(kotlin.jvm.internal.AwS455S0200000_19 r10, java.lang.Object r11, java.lang.Object r12) {
        /*
            r6 = r11
            X.0tpg r6 = (X.InterfaceC1680500tpg) r6
            java.lang.Number r12 = (java.lang.Number) r12
            int r0 = r12.intValue()
            r1 = r0 & 3
            r0 = 2
            if (r1 != r0) goto L1a
            boolean r0 = r6.LIZ()
            if (r0 == 0) goto L1a
            r6.LIZJ()
        L17:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L1a:
            r0 = 2131848080(0x7f116b90, float:1.9329656E38)
            java.lang.String r7 = X.C0MBB.LIZIZ(r0, r6)
            r9 = 1
            r3 = -1633490746(0xffffffff9ea2e8c6, float:-1.724869E-20)
            r6.LJJIIJZLJL(r3)
            java.lang.Object r0 = r10.l0
            com.ss.android.ugc.aweme.ecommerce.tts.addressedit.us.vh.USDeleteButtonViewHolder r0 = (com.ss.android.ugc.aweme.ecommerce.tts.addressedit.us.vh.USDeleteButtonViewHolder) r0
            boolean r4 = r6.LJII(r0)
            java.lang.Object r0 = r10.l1
            kotlin.jvm.functions.Function0 r0 = (kotlin.jvm.functions.Function0) r0
            boolean r0 = r6.LJJIIJ(r0)
            r4 = r4 | r0
            java.lang.Object r2 = r10.l0
            com.ss.android.ugc.aweme.ecommerce.tts.addressedit.us.vh.USDeleteButtonViewHolder r2 = (com.ss.android.ugc.aweme.ecommerce.tts.addressedit.us.vh.USDeleteButtonViewHolder) r2
            java.lang.Object r1 = r10.l1
            kotlin.jvm.functions.Function0 r1 = (kotlin.jvm.functions.Function0) r1
            java.lang.Object r8 = r6.LJJ()
            if (r4 != 0) goto L50
            X.0tph r0 = X.InterfaceC1680500tpg.LIZ
            r0.getClass()
            X.0tpi r0 = X.C1680510tph.LIZIZ
            if (r8 != r0) goto L5a
        L50:
            kotlin.jvm.internal.AwS427S0200000_26 r8 = new kotlin.jvm.internal.AwS427S0200000_26
            r0 = 87
            r8.<init>(r2, r1, r0)
            r6.LJJIJIIJI(r8)
        L5a:
            kotlin.jvm.functions.Function0 r8 = (kotlin.jvm.functions.Function0) r8
            r6.LJ()
            r4 = 48
            r5 = 0
            X.C1668330tW3.LJIIIIZZ(r4, r5, r6, r7, r8, r9)
            r0 = 2131848079(0x7f116b8f, float:1.9329654E38)
            java.lang.String r7 = X.C0MBB.LIZIZ(r0, r6)
            r6.LJJIIJZLJL(r3)
            java.lang.Object r0 = r10.l0
            com.ss.android.ugc.aweme.ecommerce.tts.addressedit.us.vh.USDeleteButtonViewHolder r0 = (com.ss.android.ugc.aweme.ecommerce.tts.addressedit.us.vh.USDeleteButtonViewHolder) r0
            boolean r3 = r6.LJII(r0)
            java.lang.Object r0 = r10.l1
            kotlin.jvm.functions.Function0 r0 = (kotlin.jvm.functions.Function0) r0
            boolean r0 = r6.LJJIIJ(r0)
            r3 = r3 | r0
            java.lang.Object r2 = r10.l0
            com.ss.android.ugc.aweme.ecommerce.tts.addressedit.us.vh.USDeleteButtonViewHolder r2 = (com.ss.android.ugc.aweme.ecommerce.tts.addressedit.us.vh.USDeleteButtonViewHolder) r2
            java.lang.Object r1 = r10.l1
            kotlin.jvm.functions.Function0 r1 = (kotlin.jvm.functions.Function0) r1
            java.lang.Object r8 = r6.LJJ()
            if (r3 != 0) goto L97
            X.0tph r0 = X.InterfaceC1680500tpg.LIZ
            r0.getClass()
            X.0tpi r0 = X.C1680510tph.LIZIZ
            if (r8 != r0) goto La1
        L97:
            kotlin.jvm.internal.AwS427S0200000_26 r8 = new kotlin.jvm.internal.AwS427S0200000_26
            r0 = 88
            r8.<init>(r2, r1, r0)
            r6.LJJIJIIJI(r8)
        La1:
            kotlin.jvm.functions.Function0 r8 = (kotlin.jvm.functions.Function0) r8
            r6.LJ()
            r4 = 48
            r5 = 0
            X.C1668330tW3.LJIIIZ(r4, r5, r6, r7, r8, r9)
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS455S0200000_19.invoke$50(kotlin.jvm.internal.AwS455S0200000_19, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    public static final Object invoke$51(AwS455S0200000_19 awS455S0200000_19, Object obj, Object obj2) {
        int iLLLJL;
        C1259360isQ c1259360isQ;
        int iIntValue = ((Number) obj).intValue();
        if (((C1255920ims) awS455S0200000_19.l0).LJIILLIIL(obj2)) {
            if (C1258400iqs.LIZ() && (c1259360isQ = ((ProfileLikesAwemeListFragment) awS455S0200000_19.l1).LLJJL) != null) {
                iLLLJL = c1259360isQ.LLLJL();
            } else {
                iLLLJL = 0;
            }
            C1259360isQ c1259360isQ2 = ((ProfileLikesAwemeListFragment) awS455S0200000_19.l1).LLJJL;
            if (c1259360isQ2 != null) {
                c1259360isQ2.notifyItemRemoved(iLLLJL + iIntValue);
            }
            C1259360isQ c1259360isQ3 = ((ProfileLikesAwemeListFragment) awS455S0200000_19.l1).LLJJL;
            if (c1259360isQ3 != null && c1259360isQ3.getBasicItemCount() == 0) {
                ((ProfileLikesAwemeListFragment) awS455S0200000_19.l1).RS(false);
            }
        }
        return Unit.LIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x008d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$52(kotlin.jvm.internal.AwS455S0200000_19 r8, java.lang.Object r9, java.lang.Object r10) {
        /*
            r4 = r9
            X.0tpg r4 = (X.InterfaceC1680500tpg) r4
            java.lang.Number r10 = (java.lang.Number) r10
            int r0 = r10.intValue()
            r1 = r0 & 3
            r0 = 2
            if (r1 != r0) goto L1a
            boolean r0 = r4.LIZ()
            if (r0 == 0) goto L1a
            r4.LIZJ()
        L17:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L1a:
            r0 = 2131829078(0x7f112156, float:1.9291115E38)
            java.lang.String r5 = X.C0MBB.LIZIZ(r0, r4)
            r7 = 1
            r0 = -1633490746(0xffffffff9ea2e8c6, float:-1.724869E-20)
            r4.LJJIIJZLJL(r0)
            java.lang.Object r0 = r8.l0
            kotlin.jvm.functions.Function0 r0 = (kotlin.jvm.functions.Function0) r0
            boolean r3 = r4.LJJIIJ(r0)
            java.lang.Object r0 = r8.l1
            kotlin.jvm.functions.Function0 r0 = (kotlin.jvm.functions.Function0) r0
            boolean r0 = r4.LJJIIJ(r0)
            r3 = r3 | r0
            java.lang.Object r2 = r8.l0
            kotlin.jvm.functions.Function0 r2 = (kotlin.jvm.functions.Function0) r2
            java.lang.Object r1 = r8.l1
            kotlin.jvm.functions.Function0 r1 = (kotlin.jvm.functions.Function0) r1
            java.lang.Object r6 = r4.LJJ()
            if (r3 != 0) goto L50
            X.0tph r0 = X.InterfaceC1680500tpg.LIZ
            r0.getClass()
            X.0tpi r0 = X.C1680510tph.LIZIZ
            if (r6 != r0) goto L5a
        L50:
            kotlin.jvm.internal.AwS420S0200000_19 r6 = new kotlin.jvm.internal.AwS420S0200000_19
            r0 = 201(0xc9, float:2.82E-43)
            r6.<init>(r2, r1, r0)
            r4.LJJIJIIJI(r6)
        L5a:
            kotlin.jvm.functions.Function0 r6 = (kotlin.jvm.functions.Function0) r6
            r4.LJ()
            r2 = 48
            r3 = 0
            X.C1668330tW3.LJII(r2, r3, r4, r5, r6, r7)
            r0 = 2131829077(0x7f112155, float:1.9291113E38)
            java.lang.String r5 = X.C0MBB.LIZIZ(r0, r4)
            r0 = 5004770(0x4c5de2, float:7.013177E-39)
            r4.LJJIIJZLJL(r0)
            java.lang.Object r0 = r8.l1
            kotlin.jvm.functions.Function0 r0 = (kotlin.jvm.functions.Function0) r0
            boolean r0 = r4.LJJIIJ(r0)
            java.lang.Object r1 = r8.l1
            kotlin.jvm.functions.Function0 r1 = (kotlin.jvm.functions.Function0) r1
            java.lang.Object r6 = r4.LJJ()
            if (r0 != 0) goto L8d
            X.0tph r0 = X.InterfaceC1680500tpg.LIZ
            r0.getClass()
            X.0tpi r0 = X.C1680510tph.LIZIZ
            if (r6 != r0) goto L97
        L8d:
            kotlin.jvm.internal.AwS563S0100000_19 r6 = new kotlin.jvm.internal.AwS563S0100000_19
            r0 = 3260(0xcbc, float:4.568E-42)
            r6.<init>(r1, r0)
            r4.LJJIJIIJI(r6)
        L97:
            kotlin.jvm.functions.Function0 r6 = (kotlin.jvm.functions.Function0) r6
            r4.LJ()
            r2 = 48
            r3 = 0
            X.C1668330tW3.LJIIIZ(r2, r3, r4, r5, r6, r7)
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS455S0200000_19.invoke$52(kotlin.jvm.internal.AwS455S0200000_19, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x008d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$53(kotlin.jvm.internal.AwS455S0200000_19 r8, java.lang.Object r9, java.lang.Object r10) {
        /*
            r4 = r9
            X.0tpg r4 = (X.InterfaceC1680500tpg) r4
            java.lang.Number r10 = (java.lang.Number) r10
            int r0 = r10.intValue()
            r1 = r0 & 3
            r0 = 2
            if (r1 != r0) goto L1a
            boolean r0 = r4.LIZ()
            if (r0 == 0) goto L1a
            r4.LIZJ()
        L17:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L1a:
            r0 = 2131829066(0x7f11214a, float:1.929109E38)
            java.lang.String r5 = X.C0MBB.LIZIZ(r0, r4)
            r7 = 1
            r0 = -1633490746(0xffffffff9ea2e8c6, float:-1.724869E-20)
            r4.LJJIIJZLJL(r0)
            java.lang.Object r0 = r8.l0
            kotlin.jvm.functions.Function0 r0 = (kotlin.jvm.functions.Function0) r0
            boolean r3 = r4.LJJIIJ(r0)
            java.lang.Object r0 = r8.l1
            kotlin.jvm.functions.Function0 r0 = (kotlin.jvm.functions.Function0) r0
            boolean r0 = r4.LJJIIJ(r0)
            r3 = r3 | r0
            java.lang.Object r2 = r8.l0
            kotlin.jvm.functions.Function0 r2 = (kotlin.jvm.functions.Function0) r2
            java.lang.Object r1 = r8.l1
            kotlin.jvm.functions.Function0 r1 = (kotlin.jvm.functions.Function0) r1
            java.lang.Object r6 = r4.LJJ()
            if (r3 != 0) goto L50
            X.0tph r0 = X.InterfaceC1680500tpg.LIZ
            r0.getClass()
            X.0tpi r0 = X.C1680510tph.LIZIZ
            if (r6 != r0) goto L5a
        L50:
            kotlin.jvm.internal.AwS420S0200000_19 r6 = new kotlin.jvm.internal.AwS420S0200000_19
            r0 = 202(0xca, float:2.83E-43)
            r6.<init>(r2, r1, r0)
            r4.LJJIJIIJI(r6)
        L5a:
            kotlin.jvm.functions.Function0 r6 = (kotlin.jvm.functions.Function0) r6
            r4.LJ()
            r2 = 48
            r3 = 0
            X.C1668330tW3.LJIIIIZZ(r2, r3, r4, r5, r6, r7)
            r0 = 2131829065(0x7f112149, float:1.9291089E38)
            java.lang.String r5 = X.C0MBB.LIZIZ(r0, r4)
            r0 = 5004770(0x4c5de2, float:7.013177E-39)
            r4.LJJIIJZLJL(r0)
            java.lang.Object r0 = r8.l1
            kotlin.jvm.functions.Function0 r0 = (kotlin.jvm.functions.Function0) r0
            boolean r0 = r4.LJJIIJ(r0)
            java.lang.Object r1 = r8.l1
            kotlin.jvm.functions.Function0 r1 = (kotlin.jvm.functions.Function0) r1
            java.lang.Object r6 = r4.LJJ()
            if (r0 != 0) goto L8d
            X.0tph r0 = X.InterfaceC1680500tpg.LIZ
            r0.getClass()
            X.0tpi r0 = X.C1680510tph.LIZIZ
            if (r6 != r0) goto L97
        L8d:
            kotlin.jvm.internal.AwS563S0100000_19 r6 = new kotlin.jvm.internal.AwS563S0100000_19
            r0 = 3262(0xcbe, float:4.571E-42)
            r6.<init>(r1, r0)
            r4.LJJIJIIJI(r6)
        L97:
            kotlin.jvm.functions.Function0 r6 = (kotlin.jvm.functions.Function0) r6
            r4.LJ()
            r2 = 48
            r3 = 0
            X.C1668330tW3.LJIIIZ(r2, r3, r4, r5, r6, r7)
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS455S0200000_19.invoke$53(kotlin.jvm.internal.AwS455S0200000_19, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    public static final Object invoke$54(AwS455S0200000_19 awS455S0200000_19, Object obj, Object obj2) {
        InterfaceC1680500tpg interfaceC1680500tpg = (InterfaceC1680500tpg) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && interfaceC1680500tpg.LIZ()) {
            interfaceC1680500tpg.LIZJ();
        } else {
            C1665460tRQ.LIZ(0, 0, interfaceC1680500tpg, (InterfaceC1685750ty9) awS455S0200000_19.l1, (Function0) awS455S0200000_19.l0);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$55(AwS455S0200000_19 awS455S0200000_19, Object obj, Object obj2) {
        InterfaceC1680500tpg interfaceC1680500tpg = (InterfaceC1680500tpg) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && interfaceC1680500tpg.LIZ()) {
            interfaceC1680500tpg.LIZJ();
        } else {
            C1665890tS7.LIZ(0, 4, interfaceC1680500tpg, (InterfaceC1685750ty9) awS455S0200000_19.l1, (Function0) awS455S0200000_19.l0, false);
        }
        return Unit.LIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x003d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$56(kotlin.jvm.internal.AwS455S0200000_19 r6, java.lang.Object r7, java.lang.Object r8) {
        /*
            r5 = r7
            X.0tpg r5 = (X.InterfaceC1680500tpg) r5
            java.lang.Number r8 = (java.lang.Number) r8
            int r0 = r8.intValue()
            r1 = r0 & 3
            r0 = 2
            if (r1 != r0) goto L1a
            boolean r0 = r5.LIZ()
            if (r0 == 0) goto L1a
            r5.LIZJ()
        L17:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L1a:
            X.0tyA r3 = X.InterfaceC1685750ty9.LIZ
            r0 = 5004770(0x4c5de2, float:7.013177E-39)
            r5.LJJIIJZLJL(r0)
            java.lang.Object r0 = r6.l0
            android.content.Context r0 = (android.content.Context) r0
            boolean r0 = r5.LJII(r0)
            java.lang.Object r2 = r6.l0
            android.content.Context r2 = (android.content.Context) r2
            java.lang.Object r1 = r5.LJJ()
            if (r0 != 0) goto L3d
            X.0tph r0 = X.InterfaceC1680500tpg.LIZ
            r0.getClass()
            X.0tpi r0 = X.C1680510tph.LIZIZ
            if (r1 != r0) goto L47
        L3d:
            kotlin.jvm.internal.AwS604S0100000_25 r1 = new kotlin.jvm.internal.AwS604S0100000_25
            r0 = 903(0x387, float:1.265E-42)
            r1.<init>(r2, r0)
            r5.LJJIJIIJI(r1)
        L47:
            kotlin.jvm.functions.Function1 r1 = (kotlin.jvm.functions.Function1) r1
            r5.LJ()
            r2 = 0
            X.0ty9 r1 = X.C1689740u4a.LIZIZ(r3, r2, r1)
            X.0tWw r0 = X.C1669660tYC.LJIIZILJ
            r3 = 0
            java.lang.Object r4 = r6.l1
            kotlin.jvm.functions.Function0 r4 = (kotlin.jvm.functions.Function0) r4
            r7 = 12
            r6 = r2
            X.C1668060tVc.LIZLLL(r0, r1, r2, r3, r4, r5, r6, r7)
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS455S0200000_19.invoke$56(kotlin.jvm.internal.AwS455S0200000_19, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x003d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$57(kotlin.jvm.internal.AwS455S0200000_19 r6, java.lang.Object r7, java.lang.Object r8) {
        /*
            r5 = r7
            X.0tpg r5 = (X.InterfaceC1680500tpg) r5
            java.lang.Number r8 = (java.lang.Number) r8
            int r0 = r8.intValue()
            r1 = r0 & 3
            r0 = 2
            if (r1 != r0) goto L1a
            boolean r0 = r5.LIZ()
            if (r0 == 0) goto L1a
            r5.LIZJ()
        L17:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L1a:
            X.0tyA r3 = X.InterfaceC1685750ty9.LIZ
            r0 = 5004770(0x4c5de2, float:7.013177E-39)
            r5.LJJIIJZLJL(r0)
            java.lang.Object r0 = r6.l0
            android.content.Context r0 = (android.content.Context) r0
            boolean r0 = r5.LJII(r0)
            java.lang.Object r2 = r6.l0
            android.content.Context r2 = (android.content.Context) r2
            java.lang.Object r1 = r5.LJJ()
            if (r0 != 0) goto L3d
            X.0tph r0 = X.InterfaceC1680500tpg.LIZ
            r0.getClass()
            X.0tpi r0 = X.C1680510tph.LIZIZ
            if (r1 != r0) goto L47
        L3d:
            kotlin.jvm.internal.AwS604S0100000_25 r1 = new kotlin.jvm.internal.AwS604S0100000_25
            r0 = 909(0x38d, float:1.274E-42)
            r1.<init>(r2, r0)
            r5.LJJIJIIJI(r1)
        L47:
            kotlin.jvm.functions.Function1 r1 = (kotlin.jvm.functions.Function1) r1
            r5.LJ()
            r2 = 0
            X.0ty9 r1 = X.C1689740u4a.LIZIZ(r3, r2, r1)
            X.0tWw r0 = X.C1669660tYC.LJIIZILJ
            r3 = 0
            java.lang.Object r4 = r6.l1
            kotlin.jvm.functions.Function0 r4 = (kotlin.jvm.functions.Function0) r4
            r7 = 12
            r6 = r2
            X.C1668060tVc.LIZLLL(r0, r1, r2, r3, r4, r5, r6, r7)
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS455S0200000_19.invoke$57(kotlin.jvm.internal.AwS455S0200000_19, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x003d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$58(kotlin.jvm.internal.AwS455S0200000_19 r6, java.lang.Object r7, java.lang.Object r8) {
        /*
            r5 = r7
            X.0tpg r5 = (X.InterfaceC1680500tpg) r5
            java.lang.Number r8 = (java.lang.Number) r8
            int r0 = r8.intValue()
            r1 = r0 & 3
            r0 = 2
            if (r1 != r0) goto L1a
            boolean r0 = r5.LIZ()
            if (r0 == 0) goto L1a
            r5.LIZJ()
        L17:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L1a:
            X.0tyA r3 = X.InterfaceC1685750ty9.LIZ
            r0 = 5004770(0x4c5de2, float:7.013177E-39)
            r5.LJJIIJZLJL(r0)
            java.lang.Object r0 = r6.l0
            android.content.Context r0 = (android.content.Context) r0
            boolean r0 = r5.LJII(r0)
            java.lang.Object r2 = r6.l0
            android.content.Context r2 = (android.content.Context) r2
            java.lang.Object r1 = r5.LJJ()
            if (r0 != 0) goto L3d
            X.0tph r0 = X.InterfaceC1680500tpg.LIZ
            r0.getClass()
            X.0tpi r0 = X.C1680510tph.LIZIZ
            if (r1 != r0) goto L47
        L3d:
            kotlin.jvm.internal.AwS604S0100000_25 r1 = new kotlin.jvm.internal.AwS604S0100000_25
            r0 = 931(0x3a3, float:1.305E-42)
            r1.<init>(r2, r0)
            r5.LJJIJIIJI(r1)
        L47:
            kotlin.jvm.functions.Function1 r1 = (kotlin.jvm.functions.Function1) r1
            r5.LJ()
            r2 = 0
            X.0ty9 r1 = X.C1689740u4a.LIZIZ(r3, r2, r1)
            X.0tWw r0 = X.C1669660tYC.LJIIZILJ
            r3 = 0
            java.lang.Object r4 = r6.l1
            kotlin.jvm.functions.Function0 r4 = (kotlin.jvm.functions.Function0) r4
            r7 = 12
            r6 = r2
            X.C1668060tVc.LIZLLL(r0, r1, r2, r3, r4, r5, r6, r7)
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS455S0200000_19.invoke$58(kotlin.jvm.internal.AwS455S0200000_19, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    public static final Object invoke$6(AwS455S0200000_19 awS455S0200000_19, Object obj, Object obj2) {
        int i;
        C20600815jK<InterfaceC1891350zJl> state;
        C1241700iPw c1241700iPw = (C1241700iPw) obj2;
        int i2 = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("resultViewModel.subscribe() - state = ");
        sbLIZ.append(c1241700iPw.LLILLJJLI);
        sbLIZ.append(", itemList = ");
        sbLIZ.append(c1241700iPw.LL.size());
        sbLIZ.append('}');
        C1720106oR.LJI("InboxSearchAllTabListAssem", C2188811AlT.LIZIZ(sbLIZ));
        C0DTR.LIZIZ(((View) awS455S0200000_19.l0).findViewById(R.id.kj9));
        C0DTR.LIZIZ(((View) awS455S0200000_19.l0).findViewById(R.id.kj_));
        List<InterfaceC1891350zJl> list = c1241700iPw.LL;
        if ((list instanceof Collection) && list.isEmpty()) {
            i = 0;
        } else {
            Iterator<InterfaceC1891350zJl> it2 = list.iterator();
            i = 0;
            while (it2.hasNext()) {
                if ((it2.next() instanceof InterfaceC1240590iO9) && (i = i + 1) < 0) {
                    C1697810uHb.LJIJ();
                    throw null;
                }
            }
        }
        ((ViewOnAttachStateChangeListenerC20604515jv) ((View) awS455S0200000_19.l0).findViewById(R.id.kj8)).getState().LJIILL(c1241700iPw.LL, null);
        ((RecyclerView) ((View) awS455S0200000_19.l0).findViewById(R.id.kj8)).scrollToPosition(0);
        switch (C1241500iPc.LIZ[c1241700iPw.LLILLJJLI.ordinal()]) {
            case 1:
                InboxSearchAllTabListAssem inboxSearchAllTabListAssem = (InboxSearchAllTabListAssem) awS455S0200000_19.l1;
                inboxSearchAllTabListAssem.getClass();
                int i3 = C2187451AjH.LIZ;
                C1720106oR.LJI("InboxSearchAllTabListAssem", "onInit()");
                C0DTR.LIZIZ(inboxSearchAllTabListAssem.LJJIJL().findViewById(R.id.kjj));
                C0DTR.LIZIZ(inboxSearchAllTabListAssem.LJJIJL().findViewById(R.id.kj8));
                C0DTR.LIZIZ(inboxSearchAllTabListAssem.LJJIJL().findViewById(R.id.kj_));
                C0DTR.LIZIZ(inboxSearchAllTabListAssem.LJJIJL().findViewById(R.id.kj9));
                break;
            case 2:
                InboxSearchAllTabListAssem inboxSearchAllTabListAssem2 = (InboxSearchAllTabListAssem) awS455S0200000_19.l1;
                inboxSearchAllTabListAssem2.getClass();
                int i4 = C2187451AjH.LIZ;
                C1720106oR.LJI("InboxSearchAllTabListAssem", "onNoResult()");
                C0DTR.LIZIZ(inboxSearchAllTabListAssem2.LJJIJL().findViewById(R.id.kjj));
                C0DTR.LIZIZ(inboxSearchAllTabListAssem2.LJJIJL().findViewById(R.id.kj_));
                C1904150zeP.LIZ.getClass();
                if (C1904150zeP.LJ()) {
                    C12ES.LJIILL(0, inboxSearchAllTabListAssem2.LJJIJL().findViewById(R.id.kj8));
                    C0DTR.LIZIZ(inboxSearchAllTabListAssem2.LJJIJL().findViewById(R.id.kj9));
                    ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv = (ViewOnAttachStateChangeListenerC20604515jv) inboxSearchAllTabListAssem2.LJJIJL().findViewById(R.id.kj8);
                    if (viewOnAttachStateChangeListenerC20604515jv != null && (state = viewOnAttachStateChangeListenerC20604515jv.getState()) != null) {
                        AssemVMLazy assemVMLazy = inboxSearchAllTabListAssem2.LLJJIII;
                        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = InboxSearchAllTabListAssem.LLJJJ;
                        C20600815jK.LIZJ(state, new C1275904yz(((InboxSearchVM) assemVMLazy.getValue()).LL));
                    }
                } else {
                    C0DTR.LIZIZ(inboxSearchAllTabListAssem2.LJJIJL().findViewById(R.id.kj8));
                    C1749280vcc c1749280vcc = (C1749280vcc) inboxSearchAllTabListAssem2.LJJIJL().findViewById(R.id.kj9);
                    if (c1749280vcc != null) {
                        C1722300uv6 c1722300uv6 = new C1722300uv6();
                        C1893080zMY.LJ(c1722300uv6);
                        c1722300uv6.LJFF = 2131835991;
                        c1749280vcc.setStatus(c1722300uv6);
                    }
                    ((C1749280vcc) inboxSearchAllTabListAssem2.LJJIJL().findViewById(R.id.kj9)).setTopMargin(C418440Gaw.LIZIZ(100));
                    C12ES.LJIILL(0, inboxSearchAllTabListAssem2.LJJIJL().findViewById(R.id.kj9));
                }
                long serverTimeMills = NetworkUtils.getServerTimeMills();
                C1241460iPY c1241460iPY = C1241460iPY.LIZ;
                EnumC1241490iPb enumC1241490iPb = EnumC1241490iPb.NO_RESULT;
                long j = serverTimeMills - inboxSearchAllTabListAssem2.LLJJIJIIJIL;
                c1241460iPY.getClass();
                C1241460iPY.LJII(enumC1241490iPb, j, 0);
                break;
            case 3:
                InboxSearchAllTabListAssem inboxSearchAllTabListAssem3 = (InboxSearchAllTabListAssem) awS455S0200000_19.l1;
                inboxSearchAllTabListAssem3.getClass();
                int i5 = C2187451AjH.LIZ;
                C1720106oR.LJI("InboxSearchAllTabListAssem", "onLoading()");
                C12ES.LJIILL(0, inboxSearchAllTabListAssem3.LJJIJL().findViewById(R.id.kjj));
                C12ES.LJIILL(0, inboxSearchAllTabListAssem3.LJJIJL().findViewById(R.id.kj8));
                C0DTR.LIZIZ(inboxSearchAllTabListAssem3.LJJIJL().findViewById(R.id.kj_));
                C0DTR.LIZIZ(inboxSearchAllTabListAssem3.LJJIJL().findViewById(R.id.kj9));
                break;
            case 4:
                InboxSearchAllTabListAssem inboxSearchAllTabListAssem4 = (InboxSearchAllTabListAssem) awS455S0200000_19.l1;
                inboxSearchAllTabListAssem4.getClass();
                int i6 = C2187451AjH.LIZ;
                C1720106oR.LJI("InboxSearchAllTabListAssem", "onSuccess()");
                C0DTR.LIZIZ(inboxSearchAllTabListAssem4.LJJIJL().findViewById(R.id.kjj));
                C12ES.LJIILL(0, inboxSearchAllTabListAssem4.LJJIJL().findViewById(R.id.kj8));
                C0DTR.LIZIZ(inboxSearchAllTabListAssem4.LJJIJL().findViewById(R.id.kj_));
                C0DTR.LIZIZ(inboxSearchAllTabListAssem4.LJJIJL().findViewById(R.id.kj9));
                long serverTimeMills2 = NetworkUtils.getServerTimeMills();
                C1241460iPY c1241460iPY2 = C1241460iPY.LIZ;
                EnumC1241490iPb enumC1241490iPb2 = EnumC1241490iPb.SUCCESS;
                long j2 = serverTimeMills2 - inboxSearchAllTabListAssem4.LLJJIJIIJIL;
                c1241460iPY2.getClass();
                C1241460iPY.LJII(enumC1241490iPb2, j2, i);
                break;
            case 5:
                InboxSearchAllTabListAssem inboxSearchAllTabListAssem5 = (InboxSearchAllTabListAssem) awS455S0200000_19.l1;
                inboxSearchAllTabListAssem5.getClass();
                int i7 = C2187451AjH.LIZ;
                C1720106oR.LJI("InboxSearchAllTabListAssem", "onRefresh()");
                inboxSearchAllTabListAssem5.LLJJIJIIJIL = NetworkUtils.getServerTimeMills();
                C0DTR.LIZIZ(inboxSearchAllTabListAssem5.LJJIJL().findViewById(R.id.kjj));
                C0DTR.LIZIZ(inboxSearchAllTabListAssem5.LJJIJL().findViewById(R.id.kj_));
                C0DTR.LIZIZ(inboxSearchAllTabListAssem5.LJJIJL().findViewById(R.id.kj9));
                C12ES.LJIILL(0, inboxSearchAllTabListAssem5.LJJIJL().findViewById(R.id.kj8));
                ((LinkedHashMap) inboxSearchAllTabListAssem5.LLJJIJI).clear();
                break;
            case 6:
                InboxSearchAllTabListAssem inboxSearchAllTabListAssem6 = (InboxSearchAllTabListAssem) awS455S0200000_19.l1;
                inboxSearchAllTabListAssem6.getClass();
                int i8 = C2187451AjH.LIZ;
                C1720106oR.LJI("InboxSearchAllTabListAssem", "onError()");
                C0DTR.LIZIZ(inboxSearchAllTabListAssem6.LJJIJL().findViewById(R.id.kjj));
                long serverTimeMills3 = NetworkUtils.getServerTimeMills();
                C1241460iPY c1241460iPY3 = C1241460iPY.LIZ;
                EnumC1241490iPb enumC1241490iPb3 = EnumC1241490iPb.SUCCESS;
                long j3 = serverTimeMills3 - inboxSearchAllTabListAssem6.LLJJIJIIJIL;
                c1241460iPY3.getClass();
                C1241460iPY.LJII(enumC1241490iPb3, j3, i);
                Context context = inboxSearchAllTabListAssem6.getContext();
                if (context != null) {
                    if (i == 0) {
                        C1749280vcc c1749280vcc2 = (C1749280vcc) inboxSearchAllTabListAssem6.LJJIJL().findViewById(R.id.kj9);
                        C1722300uv6 c1722300uv62 = new C1722300uv6();
                        C1893080zMY.LIZ(c1722300uv62, new AwS563S0100000_19(inboxSearchAllTabListAssem6, 3342));
                        c1749280vcc2.setStatus(c1722300uv62);
                        ((C1749280vcc) inboxSearchAllTabListAssem6.LJJIJL().findViewById(R.id.kj9)).setTopMargin(C418440Gaw.LIZIZ(100));
                        ((C1749280vcc) inboxSearchAllTabListAssem6.LJJIJL().findViewById(R.id.kj9)).setButtonTopMargin(C418440Gaw.LIZIZ(24));
                        C1904150zeP.LIZ.getClass();
                        if (C1904150zeP.LJ()) {
                            C12ES.LJIILL(0, inboxSearchAllTabListAssem6.LJJIJL().findViewById(R.id.kj8));
                            C20600815jK<InterfaceC1891350zJl> state2 = ((ViewOnAttachStateChangeListenerC20604515jv) inboxSearchAllTabListAssem6.LJJIJL().findViewById(R.id.kj8)).getState();
                            AssemVMLazy assemVMLazy2 = inboxSearchAllTabListAssem6.LLJJIII;
                            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr2 = InboxSearchAllTabListAssem.LLJJJ;
                            C20600815jK.LIZJ(state2, new C1275904yz(((InboxSearchVM) assemVMLazy2.getValue()).LL));
                        } else {
                            C0DTR.LIZIZ(inboxSearchAllTabListAssem6.LJJIJL().findViewById(R.id.kj8));
                        }
                        C0DTR.LIZIZ(inboxSearchAllTabListAssem6.LJJIJL().findViewById(R.id.kj_));
                        C12ES.LJIILL(0, inboxSearchAllTabListAssem6.LJJIJL().findViewById(R.id.kj9));
                    } else {
                        C1749280vcc c1749280vcc3 = (C1749280vcc) inboxSearchAllTabListAssem6.LJJIJL().findViewById(R.id.kj_);
                        AwS563S0100000_19 awS563S0100000_19 = new AwS563S0100000_19(inboxSearchAllTabListAssem6, 3343);
                        C1722300uv6 c1722300uv63 = new C1722300uv6();
                        c1722300uv63.LJI = context.getString(2131829439);
                        c1722300uv63.LJIIIIZZ = context.getString(2131835992);
                        c1722300uv63.LJIIIZ = new AwS370S0200000_4(context, awS563S0100000_19, 6);
                        c1749280vcc3.setStatus(c1722300uv63);
                        ((C1749280vcc) inboxSearchAllTabListAssem6.LJJIJL().findViewById(R.id.kj_)).setTopMargin(C418440Gaw.LIZIZ(32));
                        C12ES.LJIILL(0, inboxSearchAllTabListAssem6.LJJIJL().findViewById(R.id.kj8));
                        C0DTR.LIZIZ(inboxSearchAllTabListAssem6.LJJIJL().findViewById(R.id.kj9));
                        C12ES.LJIILL(0, inboxSearchAllTabListAssem6.LJJIJL().findViewById(R.id.kj_));
                    }
                }
                break;
            default:
                throw new C1954807lC();
        }
        return Unit.LIZ;
    }

    public static final Object invoke$7(AwS455S0200000_19 awS455S0200000_19, Object obj, Object obj2) {
        String str;
        String enterFrom;
        Integer num;
        String string;
        MinisCreateReportResponse minisCreateReportResponse = (MinisCreateReportResponse) obj;
        Throwable th = (Throwable) obj2;
        if (th != null) {
            int i = C2187451AjH.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("createRevampReport failed: ");
            sbLIZ.append(th.getMessage());
            C1720106oR.LIZ("minis-ReportActivity", C2188811AlT.LIZIZ(sbLIZ));
        } else if (minisCreateReportResponse != null && (str = minisCreateReportResponse.objectId) != null) {
            MinisReportActivity minisReportActivity = (MinisReportActivity) awS455S0200000_19.l0;
            EnumC1222640hvC enumC1222640hvC = (EnumC1222640hvC) awS455S0200000_19.l1;
            C508401yU.LJIIJJI = new C508401yU(minisReportActivity, str);
            minisReportActivity.getClass();
            String strLLLLZI = MinisReportActivity.LLLLZI(enumC1222640hvC);
            if (strLLLLZI != null) {
                Uri.Builder builderBuildUpon = UriProtector.parse(strLLLLZI).buildUpon();
                builderBuildUpon.appendQueryParameter("object_id", str);
                String strLIZ = C2195221Avo.LIZ();
                String str2 = "";
                if (strLIZ == null) {
                    strLIZ = "";
                }
                builderBuildUpon.appendQueryParameter("client_key", strLIZ);
                SchemaParserData schemaParserData = C2195221Avo.LJII;
                if (schemaParserData != null) {
                    enterFrom = schemaParserData.getEnterFrom();
                } else {
                    enterFrom = null;
                }
                builderBuildUpon.appendQueryParameter("enter_from", enterFrom);
                MinisMetaResp minisMetaResp = minisReportActivity.LLJJIJI;
                if (minisMetaResp != null && (num = minisMetaResp.minisType) != null && (string = num.toString()) != null) {
                    str2 = string;
                }
                builderBuildUpon.appendQueryParameter("minis_type", str2);
                builderBuildUpon.appendQueryParameter("report_type", String.valueOf(enumC1222640hvC.getValue()));
                builderBuildUpon.appendQueryParameter("page_loaded_at", String.valueOf(minisReportActivity.LLJJIII));
                String string2 = builderBuildUpon.build().toString();
                int i2 = C2187451AjH.LIZ;
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("openRevampL2 schema: ");
                sbLIZ2.append(strLLLLZI);
                C2188811AlT.LIZIZ(sbLIZ2);
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("openRevampL2 fullSchema: ");
                sbLIZ3.append(string2);
                C2188811AlT.LIZIZ(sbLIZ3);
                SmartRouter.buildRoute(minisReportActivity, string2).open();
            }
        }
        return Unit.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object invoke$8(AwS455S0200000_19 awS455S0200000_19, Object obj, Object obj2) {
        MusicAwemeList musicAwemeList;
        AbstractC738140SxQ abstractC738140SxQ = (AbstractC738140SxQ) obj;
        C291001Au c291001Au = (C291001Au) obj2;
        if (c291001Au != null && (musicAwemeList = (MusicAwemeList) c291001Au.LIZ) != null && musicAwemeList.containSquareData) {
            C013C c013c = (C013C) awS455S0200000_19.l0;
            if (!c013c.element) {
                c013c.element = true;
                IMDPButtonAnimationAbility iMDPButtonAnimationAbility = (IMDPButtonAnimationAbility) C1558520qew.LIZ(C1558520qew.LJIIL(abstractC738140SxQ), IMDPButtonAnimationAbility.class, null);
                if (iMDPButtonAnimationAbility != null) {
                    iMDPButtonAnimationAbility.Iy0(((MusicShootAssem) awS455S0200000_19.l1).lp(), new C1253050iiF());
                }
            }
        }
        return Unit.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* bridge */ /* synthetic */ Object invoke$9(AwS455S0200000_19 awS455S0200000_19, Object obj, Object obj2) {
        MusicAwemeList musicAwemeList;
        View view;
        AbstractC738140SxQ abstractC738140SxQ = (AbstractC738140SxQ) obj;
        C291001Au c291001Au = (C291001Au) obj2;
        if (c291001Au != null && (musicAwemeList = (MusicAwemeList) c291001Au.LIZ) != null && musicAwemeList.containSquareData) {
            MusicSquareBottomMaskAssem musicSquareBottomMaskAssem = (MusicSquareBottomMaskAssem) awS455S0200000_19.l0;
            if (!musicSquareBottomMaskAssem.LLJJIII) {
                musicSquareBottomMaskAssem.LLJJIII = true;
                Object parent = ((View) awS455S0200000_19.l1).getParent();
                if ((parent instanceof View) && (view = (View) parent) != null) {
                    C786410Ut5.LJLLLLLL(0, view);
                }
                IMDPButtonAnimationAbility iMDPButtonAnimationAbility = (IMDPButtonAnimationAbility) C1558520qew.LIZ(C1558520qew.LJIIL(abstractC738140SxQ), IMDPButtonAnimationAbility.class, null);
                if (iMDPButtonAnimationAbility != null) {
                    iMDPButtonAnimationAbility.Iy0((View) awS455S0200000_19.l1, new InterfaceC629820On6() { // from class: X.0DaU
                        public boolean LIZ;

                        @Override // X.InterfaceC629820On6
                        public final boolean LIZIZ(int i) {
                            return i == 1 || i == 2 || i == 4;
                        }

                        public final void LIZJ(View view2) {
                            if (view2.getVisibility() == 8 && !this.LIZ) {
                                this.LIZ = true;
                                C786410Ut5.LJLLLLLL(0, view2);
                                Integer numLIZJ = C1308910kAL.LIZJ(R.attr.uk, view2.getContext());
                                Integer numLIZJ2 = C1308910kAL.LIZJ(R.attr.zm, view2.getContext());
                                if (numLIZJ != null && numLIZJ2 != null) {
                                    GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{numLIZJ.intValue(), numLIZJ2.intValue()});
                                    gradientDrawable.setGradientType(0);
                                    view2.setBackground(gradientDrawable);
                                }
                            }
                        }

                        @Override // X.InterfaceC629820On6
                        public final void LIZ(int i, View view2) {
                            if (i != 1) {
                                if (i != 2) {
                                    if (i == 4) {
                                        LIZJ(view2);
                                        return;
                                    }
                                    return;
                                }
                                LIZJ(view2);
                                return;
                            }
                            if (view2.getVisibility() != 0) {
                                return;
                            }
                            C786410Ut5.LJLLLLLL(8, view2);
                            this.LIZ = false;
                        }
                    });
                }
                IMDPButtonAnimationAbility iMDPButtonAnimationAbility2 = (IMDPButtonAnimationAbility) C1558520qew.LIZ(C1558520qew.LJIIL(abstractC738140SxQ), IMDPButtonAnimationAbility.class, null);
                if (iMDPButtonAnimationAbility2 != null) {
                    iMDPButtonAnimationAbility2.C61(4);
                }
            }
        }
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS455S0200000_19(C013C c013c, View view, int i) {
        super(2);
        this.$t = i;
        this.l0 = c013c;
        this.l1 = view;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS455S0200000_19(C013C c013c, MusicShootAssem musicShootAssem, int i) {
        super(2);
        this.$t = i;
        this.l0 = c013c;
        this.l1 = musicShootAssem;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS455S0200000_19(C05P0 c05p0, C05P0<Boolean> c05p02, C05P0<Boolean> c05p03) {
        super(2);
        this.$t = c05p03;
        this.l0 = c05p0;
        this.l1 = c05p02;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS455S0200000_19(C0HZQ c0hzq, ChooseStyleCell chooseStyleCell, int i) {
        super(2);
        this.$t = i;
        this.l0 = c0hzq;
        this.l1 = chooseStyleCell;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS455S0200000_19(C1241770iQ3 c1241770iQ3, InboxSearchResultFragment inboxSearchResultFragment, int i) {
        super(2);
        this.$t = i;
        this.l0 = c1241770iQ3;
        this.l1 = inboxSearchResultFragment;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS455S0200000_19(C1255920ims c1255920ims, C1255920ims<AbstractC1255880imo<?, ?>> c1255920ims2, ProfileLikesAwemeListFragment profileLikesAwemeListFragment) {
        super(2);
        this.$t = profileLikesAwemeListFragment;
        this.l0 = c1255920ims;
        this.l1 = c1255920ims2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS455S0200000_19(C1261180ivM c1261180ivM, C1261180ivM c1261180ivM2, Function0<Unit> function0) {
        super(2);
        this.$t = function0;
        this.l0 = c1261180ivM;
        this.l1 = c1261180ivM2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS455S0200000_19(InterfaceC1685750ty9 interfaceC1685750ty9, Function0 function0, int i) {
        super(2);
        this.$t = i;
        this.l0 = function0;
        this.l1 = interfaceC1685750ty9;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS455S0200000_19(InterfaceC1685750ty9 interfaceC1685750ty9, AwS549S0100000_5 awS549S0100000_5, int i) {
        super(2);
        this.$t = i;
        this.l0 = awS549S0100000_5;
        this.l1 = interfaceC1685750ty9;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS455S0200000_19(C19635211ry c19635211ry, Function0 function0, int i) {
        super(2);
        this.$t = i;
        this.l0 = function0;
        this.l1 = c19635211ry;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS455S0200000_19(Activity activity, Activity activity2, C05P0<Boolean> c05p0) {
        super(2);
        this.$t = c05p0;
        this.l0 = activity;
        this.l1 = activity2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS455S0200000_19(Context context, Context context2, Function0<Unit> function0) {
        super(2);
        this.$t = function0;
        this.l0 = context;
        this.l1 = context2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS455S0200000_19(View view, InboxSearchAllTabListAssem inboxSearchAllTabListAssem, int i) {
        super(2);
        this.$t = i;
        this.l0 = view;
        this.l1 = inboxSearchAllTabListAssem;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS455S0200000_19(FrameLayout frameLayout, TuxTextView tuxTextView, int i) {
        super(2);
        this.$t = i;
        this.l0 = tuxTextView;
        this.l1 = frameLayout;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS455S0200000_19(ComposeView composeView, DiskManagerComposePage diskManagerComposePage, int i) {
        super(2);
        this.$t = i;
        this.l0 = composeView;
        this.l1 = diskManagerComposePage;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS455S0200000_19(ComposeView composeView, LiteModeLearnMorePage liteModeLearnMorePage, int i) {
        super(2);
        this.$t = i;
        this.l0 = composeView;
        this.l1 = liteModeLearnMorePage;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS455S0200000_19(ComposeView composeView, LiteModeSwitchPage liteModeSwitchPage, int i) {
        super(2);
        this.$t = i;
        this.l0 = composeView;
        this.l1 = liteModeSwitchPage;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS455S0200000_19(ComposeView composeView, PushSettingsUnLoginComposeFragment pushSettingsUnLoginComposeFragment, int i) {
        super(2);
        this.$t = i;
        this.l0 = composeView;
        this.l1 = pushSettingsUnLoginComposeFragment;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS455S0200000_19(ComposeView composeView, UserQrCodeComposeActivity userQrCodeComposeActivity, int i) {
        super(2);
        this.$t = i;
        this.l0 = composeView;
        this.l1 = userQrCodeComposeActivity;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS455S0200000_19(ComposeView composeView, DisplayAndCaptionComposePage displayAndCaptionComposePage, int i) {
        super(2);
        this.$t = i;
        this.l0 = composeView;
        this.l1 = displayAndCaptionComposePage;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS455S0200000_19(Fragment fragment, C1246120iX4 c1246120iX4, int i) {
        super(2);
        this.$t = i;
        this.l0 = fragment;
        this.l1 = c1246120iX4;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS455S0200000_19(CheckupRelationFollowerCell checkupRelationFollowerCell, C994040byU c994040byU, int i) {
        super(2);
        this.$t = i;
        this.l0 = checkupRelationFollowerCell;
        this.l1 = c994040byU;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS455S0200000_19(CheckupRelationFollowingCell checkupRelationFollowingCell, C994040byU c994040byU, int i) {
        super(2);
        this.$t = i;
        this.l0 = checkupRelationFollowingCell;
        this.l1 = c994040byU;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS455S0200000_19(CheckupRelationFriendsCell checkupRelationFriendsCell, C994040byU c994040byU, int i) {
        super(2);
        this.$t = i;
        this.l0 = checkupRelationFriendsCell;
        this.l1 = c994040byU;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS455S0200000_19(USDeleteButtonViewHolder uSDeleteButtonViewHolder, USDeleteButtonViewHolder uSDeleteButtonViewHolder2, Function0<Unit> function0) {
        super(2);
        this.$t = function0;
        this.l0 = uSDeleteButtonViewHolder;
        this.l1 = uSDeleteButtonViewHolder2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS455S0200000_19(AutoPostLivingPanelDialog autoPostLivingPanelDialog, AutoPostLivingPanelDialog autoPostLivingPanelDialog2, Function0<Unit> function0) {
        super(2);
        this.$t = function0;
        this.l0 = autoPostLivingPanelDialog;
        this.l1 = autoPostLivingPanelDialog2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS455S0200000_19(MinisReportActivity minisReportActivity, EnumC1222640hvC enumC1222640hvC, int i) {
        super(2);
        this.$t = i;
        this.l0 = minisReportActivity;
        this.l1 = enumC1222640hvC;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS455S0200000_19(MusicSquareBottomMaskAssem musicSquareBottomMaskAssem, View view, int i) {
        super(2);
        this.$t = i;
        this.l0 = musicSquareBottomMaskAssem;
        this.l1 = view;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS455S0200000_19(User user, FollowRequestCell followRequestCell, int i) {
        super(2);
        this.$t = i;
        this.l0 = user;
        this.l1 = followRequestCell;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS455S0200000_19(MutualRelationEmptyCell mutualRelationEmptyCell, C03HY c03hy, int i) {
        super(2);
        this.$t = i;
        this.l0 = mutualRelationEmptyCell;
        this.l1 = c03hy;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS455S0200000_19(IUserCardListAbility iUserCardListAbility, C1261860iwS c1261860iwS, int i) {
        super(2);
        this.$t = i;
        this.l0 = iUserCardListAbility;
        this.l1 = c1261860iwS;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS455S0200000_19(LargeRectRecUserCell largeRectRecUserCell, LargeRectRecUserCell<ITEM> largeRectRecUserCell2, Fragment fragment) {
        super(2);
        this.$t = fragment;
        this.l0 = largeRectRecUserCell;
        this.l1 = largeRectRecUserCell2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS455S0200000_19(RectRecUserCell rectRecUserCell, RectRecUserCell<ITEM> rectRecUserCell2, Fragment fragment) {
        super(2);
        this.$t = fragment;
        this.l0 = rectRecUserCell;
        this.l1 = rectRecUserCell2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS455S0200000_19(RectRedesignRecUserCell rectRedesignRecUserCell, RectRedesignRecUserCell<ITEM> rectRedesignRecUserCell2, Fragment fragment) {
        super(2);
        this.$t = fragment;
        this.l0 = rectRedesignRecUserCell;
        this.l1 = rectRedesignRecUserCell2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS455S0200000_19(SettingsRvmpComposeViewModel settingsRvmpComposeViewModel, SettingsComposeRvmpFragment settingsComposeRvmpFragment, int i) {
        super(2);
        this.$t = i;
        this.l0 = settingsRvmpComposeViewModel;
        this.l1 = settingsComposeRvmpFragment;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS455S0200000_19(SelectedWidgetAssem selectedWidgetAssem, C19EG c19eg, int i) {
        super(2);
        this.$t = i;
        this.l0 = selectedWidgetAssem;
        this.l1 = c19eg;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS455S0200000_19(UserState userState, InterfaceC1264850j1H interfaceC1264850j1H, int i) {
        super(2);
        this.$t = i;
        this.l0 = userState;
        this.l1 = interfaceC1264850j1H;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS455S0200000_19(ProfileNavbarViewerEntranceProtocol profileNavbarViewerEntranceProtocol, C013C c013c, int i) {
        super(2);
        this.$t = i;
        this.l0 = profileNavbarViewerEntranceProtocol;
        this.l1 = c013c;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS455S0200000_19(EditProfileBioCellAssem editProfileBioCellAssem, EditProfileBioCellAssem editProfileBioCellAssem2, C259800zU<C0ZP4> c259800zU) {
        super(2);
        this.$t = c259800zU;
        this.l0 = editProfileBioCellAssem;
        this.l1 = editProfileBioCellAssem2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS455S0200000_19(RelationSearchCell relationSearchCell, RelationSearchCell<C1247270iYv> relationSearchCell2, User user) {
        super(2);
        this.$t = user;
        this.l0 = relationSearchCell;
        this.l1 = relationSearchCell2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS455S0200000_19(ProfileEditNicknameFragment profileEditNicknameFragment, ProfileEditNicknameFragment profileEditNicknameFragment2, Function0<Unit> function0) {
        super(2);
        this.$t = function0;
        this.l0 = profileEditNicknameFragment;
        this.l1 = profileEditNicknameFragment2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS455S0200000_19(HeaderAdvancedFeatureBaseUIComponent headerAdvancedFeatureBaseUIComponent, Context context, int i) {
        super(2);
        this.$t = i;
        this.l0 = headerAdvancedFeatureBaseUIComponent;
        this.l1 = context;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS455S0200000_19(BioStructuralInfoBaseComponent bioStructuralInfoBaseComponent, BioStructuralInfoBaseComponent<BizBaseData> bioStructuralInfoBaseComponent2, Context context) {
        super(2);
        this.$t = context;
        this.l0 = bioStructuralInfoBaseComponent;
        this.l1 = bioStructuralInfoBaseComponent2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS455S0200000_19(ProfileHeaderTopTipsBaseUIComponent profileHeaderTopTipsBaseUIComponent, Context context, int i) {
        super(2);
        this.$t = i;
        this.l0 = profileHeaderTopTipsBaseUIComponent;
        this.l1 = context;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS455S0200000_19(Function0 function0, Function0<Unit> function02, Function0<Unit> function03) {
        super(2);
        this.$t = function03;
        this.l0 = function0;
        this.l1 = function02;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS455S0200000_19(Function2 function2, Function2<? super C0SY7, ? super C0SY7, Unit> function22, RectRedesignRecUserCell<C1261650iw7> rectRedesignRecUserCell) {
        super(2);
        this.$t = rectRedesignRecUserCell;
        this.l0 = function2;
        this.l1 = function22;
    }
}
