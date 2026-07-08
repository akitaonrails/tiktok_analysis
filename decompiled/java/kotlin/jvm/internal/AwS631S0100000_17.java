package kotlin.jvm.internal;

import X.AbstractC1109720ez4;
import X.AbstractC1109840ezG;
import X.AbstractC1114930f7T;
import X.AbstractC1126600fQI;
import X.AbstractC1538740q92;
import X.AbstractC1623806Xk;
import X.AbstractC738140SxQ;
import X.AnonymousClass0054;
import X.C050G;
import X.C05XL;
import X.C099F;
import X.C09AY;
import X.C0CZU;
import X.C0GSA;
import X.C0IJT;
import X.C0TZM;
import X.C1098730ehL;
import X.C1105320ery;
import X.C1109600eys;
import X.C1114860f7M;
import X.C1115360f8A;
import X.C1115380f8C;
import X.C1120220fG0;
import X.C1120250fG3;
import X.C1121660fIK;
import X.C1123080fKc;
import X.C1123130fKh;
import X.C1123280fKw;
import X.C1123290fKx;
import X.C1123380fL6;
import X.C1123390fL7;
import X.C1125430fOP;
import X.C1125560fOc;
import X.C1125820fP2;
import X.C1125840fP4;
import X.C1125850fP5;
import X.C1125860fP6;
import X.C1125880fP8;
import X.C1126150fPZ;
import X.C1126220fPg;
import X.C1126230fPh;
import X.C1126240fPi;
import X.C1126260fPk;
import X.C1126540fQC;
import X.C1127050fR1;
import X.C1127480fRi;
import X.C1128450fTH;
import X.C1128710fTh;
import X.C1128760fTm;
import X.C1128870fTx;
import X.C1128950fU5;
import X.C1130020fVo;
import X.C1130100fVw;
import X.C1131140fXc;
import X.C1133640fbe;
import X.C1135230feD;
import X.C1141050fnb;
import X.C1141100fng;
import X.C1144610ftL;
import X.C1145190fuH;
import X.C1145230fuL;
import X.C1145270fuP;
import X.C1145280fuQ;
import X.C1145790fvF;
import X.C1145980fvY;
import X.C1146000fva;
import X.C1146010fvb;
import X.C1146050fvf;
import X.C1146070fvh;
import X.C1146090fvj;
import X.C1146120fvm;
import X.C1146160fvq;
import X.C1146180fvs;
import X.C1146210fvv;
import X.C1146350fw9;
import X.C1146360fwA;
import X.C1146430fwH;
import X.C1146440fwI;
import X.C1146500fwO;
import X.C1148930g0J;
import X.C1161920gLG;
import X.C1203120hPi;
import X.C1203130hPj;
import X.C1203140hPk;
import X.C1203200hPq;
import X.C13BV;
import X.C1538590q8n;
import X.C1558520qew;
import X.C158B;
import X.C1623606Xi;
import X.C1623706Xj;
import X.C1697810uHb;
import X.C16F5;
import X.C16FS;
import X.C1886107a7;
import X.C1954807lC;
import X.C1AF0;
import X.C20441214yg;
import X.C20600815jK;
import X.C21341918fZ;
import X.C21342318fd;
import X.C2188811AlT;
import X.C291001Au;
import X.C354201Zc;
import X.C434980H3w;
import X.C439101nJ;
import X.C468250IXv;
import X.C474500IjA;
import X.C491001vg;
import X.C491101vh;
import X.C497740JfY;
import X.C500260Jjc;
import X.C520710KbV;
import X.C766270U4b;
import X.C786410Ut5;
import X.EnumC1125400fOM;
import X.EnumC1129230fUX;
import X.EnumC1138990fkH;
import X.EnumC1146170fvr;
import X.EnumC776070UcP;
import X.EnumC994430bz7;
import X.InterfaceC1111870f2X;
import X.InterfaceC1128440fTG;
import X.InterfaceC1131100fXY;
import X.InterfaceC1891350zJl;
import X.InterfaceC2217461Bqa;
import X.RunnableC781530UlD;
import X.ViewOnAttachStateChangeListenerC20604515jv;
import Y.AAListenerS328S0100000_17;
import Y.ALAdapterS12S0200000_17;
import Y.ALAdapterS13S0100000_17;
import Y.ARunnableS117S0100000_17;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.os.SystemClock;
import android.text.SpannableStringBuilder;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.broadcast.stablemode.ModuleDecision;
import com.bytedance.android.live.commentcombo.view.CommentComboTrayWidget;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.android.live.design.view.sheet.LiveBottomSheetBehavior;
import com.bytedance.android.live.function.IRoomFunctionService;
import com.bytedance.android.live.gift.FastGiftClickChannel;
import com.bytedance.android.live.gift.ResetSilentTimerEvent;
import com.bytedance.android.live.liveinteract.multimatch.matchitem.MatchItemAssem;
import com.bytedance.android.live.pin.widget.BaseCommentPinnedWidget;
import com.bytedance.android.live.rank.impl.entrance.widget.RankEntranceRootWidget;
import com.bytedance.android.livesdk.FastGiftSendWidgetShowEvent;
import com.bytedance.android.livesdk.chatroom.viewmodule.NewTopRightBannerWidget;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.gift.base.business.dialog.v2.favorite.GiftFavoritePanelAssem;
import com.bytedance.android.livesdk.gift.base.platform.business.panel.anchor.GiftAnchorPanelSheetFragment;
import com.bytedance.android.livesdk.gift.base.platform.business.panel.anchor.center.GiftAnchorPanelCenterAssem;
import com.bytedance.android.livesdk.gift.base.platform.business.panel.anchor.center.gift.bottom.IGiftAnchorPanelGiftPageBottomAbility;
import com.bytedance.android.livesdk.gift.base.platform.business.panel.anchor.center.gift.center.GiftAnchorPanelGiftPageCenterAssem;
import com.bytedance.android.livesdk.gift.base.platform.business.panel.anchor.center.gift.center.GiftAnchorPanelGiftPageCenterViewModel;
import com.bytedance.android.livesdk.gift.base.platform.business.panel.anchor.center.record.center.GiftAnchorPanelRecordPageCenterAssem;
import com.bytedance.android.livesdk.gift.base.platform.business.panel.anchor.center.record.center.list.AnchorRecordEmptyCell;
import com.bytedance.android.livesdk.gift.base.platform.business.panel.anchor.center.record.notification.GiftAnchorPanelRecordPageNotificationAssem;
import com.bytedance.android.livesdk.gift.base.platform.business.panel.landscape.widget.LiveNewGiftPanelWidget;
import com.bytedance.android.livesdk.gift.base.platform.business.panel.portrait.banner.switchcolor.CountryListDialogFragment;
import com.bytedance.android.livesdk.gift.model.GiftColorInfo;
import com.bytedance.android.livesdk.grouplive.memberselection.UserSelectionAssem;
import com.bytedance.android.livesdk.impl.revenue.announcement.widget.LivePrivilegeAnnouncementWidget;
import com.bytedance.android.livesdk.impl.revenue.strategy.panel.common.packages.PackageListAssem;
import com.bytedance.android.livesdk.impl.revenue.strategy.panel.common.recharge.RechargeBtnAssem;
import com.bytedance.android.livesdk.livesetting.banner.LiveBannerPreloadFirstFrameSetting;
import com.bytedance.android.livesdk.livesetting.gift.LiveGiftAnchorPanelComposeSettings;
import com.bytedance.android.livesdk.livesetting.hybrid.LiveHybridLynxCodeCacheOptimizeSetting;
import com.bytedance.android.livesdk.livesetting.hybrid.LiveMoveBannerInitDataEventToRuntimeReadySetting;
import com.bytedance.android.livesdk.livesetting.hybrid.LiveTop3HybridContainerDynamicParamsSetting;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.android.livesdk.livesetting.subscription.LiveSubscriptionQuestionnaireHourFrequencySetting;
import com.bytedance.android.livesdk.model.BannerInRoom;
import com.bytedance.android.livesdk.model.Gift;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.forest.Forest;
import com.bytedance.forest.model.RequestParams;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.lynx.hybrid.service.IResourceServiceX;
import com.lynx.tasm.LynxView;
import com.lynx.tasm.TemplateBundle;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tiktok.forestx.RequestParamsX;
import com.tts.oecverify.BdTuring;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS602S0100000_23;
import org.json.JSONException;

/* JADX INFO: loaded from: classes18.dex */
public class AwS631S0100000_17 extends C09AY implements Function2 {
    public final int $t;
    public Object l0;

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
            default:
                return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:1287:0x17ae  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x02fb  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x025d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final /* bridge */ /* synthetic */ java.lang.Object invoke$1(kotlin.jvm.internal.AwS631S0100000_17 r31, java.lang.Object r32, java.lang.Object r33) throws org.json.JSONException {
        /*
            Method dump skipped, instruction units count: 6678
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS631S0100000_17.invoke$1(kotlin.jvm.internal.AwS631S0100000_17, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS631S0100000_17(C099F c099f, int i) {
        super(2);
        this.$t = i;
        this.l0 = c099f;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS631S0100000_17(C1098730ehL c1098730ehL, int i) {
        super(2);
        this.$t = i;
        this.l0 = c1098730ehL;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS631S0100000_17(C1105320ery c1105320ery, int i) {
        super(2);
        this.$t = i;
        this.l0 = c1105320ery;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS631S0100000_17(AbstractC1114930f7T abstractC1114930f7T, int i) {
        super(2);
        this.$t = i;
        this.l0 = abstractC1114930f7T;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS631S0100000_17(C1120250fG3 c1120250fG3, int i) {
        super(2);
        this.$t = i;
        this.l0 = c1120250fG3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS631S0100000_17(C1123280fKw c1123280fKw, int i) {
        super(2);
        this.$t = i;
        this.l0 = c1123280fKw;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS631S0100000_17(C1125560fOc c1125560fOc, int i) {
        super(2);
        this.$t = i;
        this.l0 = c1125560fOc;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS631S0100000_17(C1125880fP8 c1125880fP8, int i) {
        super(2);
        this.$t = i;
        this.l0 = c1125880fP8;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS631S0100000_17(C1126230fPh c1126230fPh, int i) {
        super(2);
        this.$t = i;
        this.l0 = c1126230fPh;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS631S0100000_17(C1126240fPi c1126240fPi, int i) {
        super(2);
        this.$t = i;
        this.l0 = c1126240fPi;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS631S0100000_17(C1126260fPk c1126260fPk, int i) {
        super(2);
        this.$t = i;
        this.l0 = c1126260fPk;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS631S0100000_17(C1128710fTh c1128710fTh, int i) {
        super(2);
        this.$t = i;
        this.l0 = c1128710fTh;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS631S0100000_17(C1128950fU5 c1128950fU5, int i) {
        super(2);
        this.$t = i;
        this.l0 = c1128950fU5;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS631S0100000_17(C1141100fng c1141100fng, int i) {
        super(2);
        this.$t = i;
        this.l0 = c1141100fng;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS631S0100000_17(C1145790fvF c1145790fvF, int i) {
        super(2);
        this.$t = i;
        this.l0 = c1145790fvF;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS631S0100000_17(ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv, int i) {
        super(2);
        this.$t = i;
        this.l0 = viewOnAttachStateChangeListenerC20604515jv;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS631S0100000_17(C16F5 c16f5, int i) {
        super(2);
        this.$t = i;
        this.l0 = c16f5;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS631S0100000_17(CommentComboTrayWidget commentComboTrayWidget, int i) {
        super(2);
        this.$t = i;
        this.l0 = commentComboTrayWidget;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS631S0100000_17(MatchItemAssem matchItemAssem, int i) {
        super(2);
        this.$t = i;
        this.l0 = matchItemAssem;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS631S0100000_17(BaseCommentPinnedWidget baseCommentPinnedWidget, int i) {
        super(2);
        this.$t = i;
        this.l0 = baseCommentPinnedWidget;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS631S0100000_17(RankEntranceRootWidget rankEntranceRootWidget, int i) {
        super(2);
        this.$t = i;
        this.l0 = rankEntranceRootWidget;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS631S0100000_17(NewTopRightBannerWidget newTopRightBannerWidget, int i) {
        super(2);
        this.$t = i;
        this.l0 = newTopRightBannerWidget;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS631S0100000_17(GiftFavoritePanelAssem giftFavoritePanelAssem, int i) {
        super(2);
        this.$t = i;
        this.l0 = giftFavoritePanelAssem;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS631S0100000_17(GiftAnchorPanelSheetFragment giftAnchorPanelSheetFragment, int i) {
        super(2);
        this.$t = i;
        this.l0 = giftAnchorPanelSheetFragment;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS631S0100000_17(GiftAnchorPanelCenterAssem giftAnchorPanelCenterAssem, int i) {
        super(2);
        this.$t = i;
        this.l0 = giftAnchorPanelCenterAssem;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS631S0100000_17(GiftAnchorPanelGiftPageCenterAssem giftAnchorPanelGiftPageCenterAssem, int i) {
        super(2);
        this.$t = i;
        this.l0 = giftAnchorPanelGiftPageCenterAssem;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS631S0100000_17(GiftAnchorPanelRecordPageCenterAssem giftAnchorPanelRecordPageCenterAssem, int i) {
        super(2);
        this.$t = i;
        this.l0 = giftAnchorPanelRecordPageCenterAssem;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS631S0100000_17(AnchorRecordEmptyCell anchorRecordEmptyCell, int i) {
        super(2);
        this.$t = i;
        this.l0 = anchorRecordEmptyCell;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS631S0100000_17(GiftAnchorPanelRecordPageNotificationAssem giftAnchorPanelRecordPageNotificationAssem, int i) {
        super(2);
        this.$t = i;
        this.l0 = giftAnchorPanelRecordPageNotificationAssem;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS631S0100000_17(LiveNewGiftPanelWidget liveNewGiftPanelWidget, int i) {
        super(2);
        this.$t = i;
        this.l0 = liveNewGiftPanelWidget;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS631S0100000_17(CountryListDialogFragment countryListDialogFragment, int i) {
        super(2);
        this.$t = i;
        this.l0 = countryListDialogFragment;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS631S0100000_17(UserSelectionAssem userSelectionAssem, int i) {
        super(2);
        this.$t = i;
        this.l0 = userSelectionAssem;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS631S0100000_17(LivePrivilegeAnnouncementWidget livePrivilegeAnnouncementWidget, int i) {
        super(2);
        this.$t = i;
        this.l0 = livePrivilegeAnnouncementWidget;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS631S0100000_17(PackageListAssem packageListAssem, int i) {
        super(2);
        this.$t = i;
        this.l0 = packageListAssem;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS631S0100000_17(RechargeBtnAssem rechargeBtnAssem, int i) {
        super(2);
        this.$t = i;
        this.l0 = rechargeBtnAssem;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS631S0100000_17(Function0 function0, Function0<Unit> function02) {
        super(2);
        this.$t = function02;
        this.l0 = function0;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS631S0100000_17(AwS561S0100000_17 awS561S0100000_17, int i) {
        super(2);
        this.$t = i;
        this.l0 = awS561S0100000_17;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS631S0100000_17(AwS606S0100000_27 awS606S0100000_27, int i) {
        super(2);
        this.$t = i;
        this.l0 = awS606S0100000_27;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object invoke$0(AwS631S0100000_17 awS631S0100000_17, Object obj, Object obj2) {
        String str;
        AbstractC1623806Xk abstractC1623806Xk = (AbstractC1623806Xk) obj2;
        if (abstractC1623806Xk instanceof C1623606Xi) {
            List<C1145280fuQ> list = ((C1144610ftL) ((C1623606Xi) abstractC1623806Xk).LIZ).LIZ;
            if (list.isEmpty()) {
                UserSelectionAssem userSelectionAssem = (UserSelectionAssem) awS631S0100000_17.l0;
                userSelectionAssem.getClass();
                C766270U4b.LIZLLL(2131841933);
                C1AF0.LIZJ("gift_group_live_member_list_page_error");
                userSelectionAssem.B6();
            } else {
                UserSelectionAssem userSelectionAssem2 = (UserSelectionAssem) awS631S0100000_17.l0;
                userSelectionAssem2.getClass();
                Iterator<C1145280fuQ> it2 = list.iterator();
                int i = 0;
                int i2 = 0;
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    if (it2.next().LJ) {
                        if (i2 > 0) {
                            i = i2;
                        }
                    } else {
                        i2++;
                    }
                }
                C1145270fuP c1145270fuP = userSelectionAssem2.LLJIJIL;
                if (c1145270fuP != null) {
                    C1145230fuL c1145230fuL = userSelectionAssem2.LLJILJIL;
                    ((ArrayList) c1145230fuL.LIZ).clear();
                    ((ArrayList) c1145230fuL.LIZ).addAll(c1145230fuL.LIZIZ);
                    ((ArrayList) c1145230fuL.LIZIZ).clear();
                    ((ArrayList) c1145230fuL.LIZIZ).addAll(list);
                    C21341918fZ c21341918fZLIZ = C21342318fd.LIZ(c1145230fuL, true);
                    c1145270fuP.LL = list;
                    c21341918fZLIZ.LIZJ(c1145270fuP);
                }
                RunnableC781530UlD runnableC781530UlD = userSelectionAssem2.LLJI;
                if (runnableC781530UlD != null) {
                    runnableC781530UlD.scrollToPosition(i);
                }
            }
            Object value = ((UserSelectionAssem) awS631S0100000_17.l0).LLJILJILJ.getValue();
            C1145190fuH c1145190fuHGo = ((UserSelectionAssem) awS631S0100000_17.l0).Go();
            value.getClass();
            C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_gift_change_to_member_panel_show");
            C1121660fIK.LIZ(c474500IjALIZ);
            c474500IjALIZ.LJJII(Integer.valueOf(list.size()), "on_stage_group_member_cnt");
            c474500IjALIZ.LJJII(c1145190fuHGo.LLILLJJLI, "gift_enter_from");
            for (C1145280fuQ c1145280fuQ : list) {
                if (c1145280fuQ.LJ) {
                    c474500IjALIZ.LJJII(Long.valueOf(c1145280fuQ.LIZ), "to_member_id");
                    if (c1145280fuQ.LIZLLL) {
                        str = "group_room_owner";
                    } else {
                        str = "group_member";
                    }
                    c474500IjALIZ.LJJII(str, "to_member_type");
                }
            }
            c474500IjALIZ.LIZ();
        } else if (!(abstractC1623806Xk instanceof C491001vg) && !(abstractC1623806Xk instanceof C1623706Xj) && !Intrinsics.LJFF(abstractC1623806Xk, C491101vh.LIZ)) {
            throw new C1954807lC();
        }
        return Unit.LIZ;
    }

    public static final Object invoke$10(AwS631S0100000_17 awS631S0100000_17, Object obj, Object obj2) {
        if (((Pair) obj2).getFirst() == EnumC1146170fvr.GIFT) {
            GiftAnchorPanelGiftPageCenterViewModel giftAnchorPanelGiftPageCenterViewModelIp = ((GiftAnchorPanelGiftPageCenterAssem) awS631S0100000_17.l0).ip();
            AssemVMLazy assemVMLazy = ((GiftAnchorPanelGiftPageCenterAssem) awS631S0100000_17.l0).LLJJIII;
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = GiftAnchorPanelGiftPageCenterAssem.LLJJJJ;
            boolean z = false;
            if (((C1146210fvv) assemVMLazy.getValue().getState()).LL.getSecond().intValue() == 0) {
                z = true;
            }
            if (Intrinsics.LJFF(giftAnchorPanelGiftPageCenterViewModelIp.getState().LL, C491101vh.LIZ)) {
                giftAnchorPanelGiftPageCenterViewModelIp.LLILZLL = z;
                giftAnchorPanelGiftPageCenterViewModelIp.wQ2();
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$11(AwS631S0100000_17 awS631S0100000_17, Object obj, Object obj2) {
        C20600815jK<InterfaceC1891350zJl> state;
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv;
        C20600815jK<InterfaceC1891350zJl> state2;
        C20600815jK<InterfaceC1891350zJl> state3;
        C20600815jK<InterfaceC1891350zJl> state4;
        C20600815jK<InterfaceC1891350zJl> state5;
        RecyclerView.LayoutManager layoutManager;
        C20600815jK<InterfaceC1891350zJl> state6;
        LinearLayoutManager linearLayoutManager;
        C20600815jK<InterfaceC1891350zJl> state7;
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv2;
        C20600815jK<InterfaceC1891350zJl> state8;
        C1146010fvb c1146010fvb = (C1146010fvb) obj2;
        Object obj3 = null;
        switch (C1146000fva.LIZ[c1146010fvb.LIZIZ.ordinal()]) {
            case 1:
            case 4:
                break;
            case 2:
                ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv3 = ((GiftAnchorPanelRecordPageCenterAssem) awS631S0100000_17.l0).LLJJJIL;
                boolean z = false;
                if (viewOnAttachStateChangeListenerC20604515jv3 != null && (state7 = viewOnAttachStateChangeListenerC20604515jv3.getState()) != null && ((ArrayList) state7.LJII()).isEmpty()) {
                    ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv4 = ((GiftAnchorPanelRecordPageCenterAssem) awS631S0100000_17.l0).LLJJJIL;
                    if (viewOnAttachStateChangeListenerC20604515jv4 != null && (state8 = viewOnAttachStateChangeListenerC20604515jv4.getState()) != null) {
                        state8.LJIILL(c1146010fvb.LIZ, null);
                    }
                    GiftAnchorPanelRecordPageCenterAssem giftAnchorPanelRecordPageCenterAssem = (GiftAnchorPanelRecordPageCenterAssem) awS631S0100000_17.l0;
                    if (giftAnchorPanelRecordPageCenterAssem.LLJJJJ && (viewOnAttachStateChangeListenerC20604515jv2 = giftAnchorPanelRecordPageCenterAssem.LLJJJIL) != null) {
                        HandlerHook.viewPost(viewOnAttachStateChangeListenerC20604515jv2, new ARunnableS117S0100000_17(giftAnchorPanelRecordPageCenterAssem, 82));
                    }
                } else {
                    ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv5 = ((GiftAnchorPanelRecordPageCenterAssem) awS631S0100000_17.l0).LLJJJIL;
                    if (viewOnAttachStateChangeListenerC20604515jv5 != null) {
                        layoutManager = viewOnAttachStateChangeListenerC20604515jv5.getLayoutManager();
                    } else {
                        layoutManager = null;
                    }
                    if ((layoutManager instanceof LinearLayoutManager) && (linearLayoutManager = (LinearLayoutManager) layoutManager) != null && linearLayoutManager.findFirstCompletelyVisibleItemPosition() == 0) {
                        AnimatorSet animatorSet = ((GiftAnchorPanelRecordPageCenterAssem) awS631S0100000_17.l0).LLJJJJLIIL;
                        if (animatorSet != null) {
                            animatorSet.cancel();
                        }
                        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(((GiftAnchorPanelRecordPageCenterAssem) awS631S0100000_17.l0).LLJJJIL, (Property<ViewOnAttachStateChangeListenerC20604515jv, Float>) View.ALPHA, 1.0f, 0.0f);
                        objectAnimatorOfFloat.setDuration(150L);
                        objectAnimatorOfFloat.addListener(new ALAdapterS12S0200000_17((GiftAnchorPanelRecordPageCenterAssem) awS631S0100000_17.l0, c1146010fvb, 2));
                        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(((GiftAnchorPanelRecordPageCenterAssem) awS631S0100000_17.l0).LLJJJIL, (Property<ViewOnAttachStateChangeListenerC20604515jv, Float>) View.ALPHA, 0.0f, 1.0f);
                        objectAnimatorOfFloat2.setDuration(150L);
                        AnimatorSet animatorSet2 = new AnimatorSet();
                        GiftAnchorPanelRecordPageCenterAssem giftAnchorPanelRecordPageCenterAssem2 = (GiftAnchorPanelRecordPageCenterAssem) awS631S0100000_17.l0;
                        animatorSet2.playSequentially(objectAnimatorOfFloat, objectAnimatorOfFloat2);
                        animatorSet2.addListener(new ALAdapterS13S0100000_17(giftAnchorPanelRecordPageCenterAssem2, 12));
                        animatorSet2.start();
                        ((GiftAnchorPanelRecordPageCenterAssem) awS631S0100000_17.l0).LLJJJJLIIL = animatorSet2;
                    } else {
                        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv6 = ((GiftAnchorPanelRecordPageCenterAssem) awS631S0100000_17.l0).LLJJJIL;
                        if (viewOnAttachStateChangeListenerC20604515jv6 != null && (state6 = viewOnAttachStateChangeListenerC20604515jv6.getState()) != null) {
                            state6.LJIILL(c1146010fvb.LIZ, null);
                        }
                        GiftAnchorPanelRecordPageCenterAssem giftAnchorPanelRecordPageCenterAssem3 = (GiftAnchorPanelRecordPageCenterAssem) awS631S0100000_17.l0;
                        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv7 = giftAnchorPanelRecordPageCenterAssem3.LLJJJIL;
                        if (viewOnAttachStateChangeListenerC20604515jv7 != null) {
                            HandlerHook.viewPost(viewOnAttachStateChangeListenerC20604515jv7, new ARunnableS117S0100000_17(giftAnchorPanelRecordPageCenterAssem3, 83));
                        }
                    }
                }
                AssemVMLazy assemVMLazy = ((GiftAnchorPanelRecordPageCenterAssem) awS631S0100000_17.l0).LLJJIII;
                InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = GiftAnchorPanelRecordPageCenterAssem.LLJJL;
                if (((C1146210fvv) assemVMLazy.getValue().getState()).LLILLJJLI.getFirst() == EnumC1146170fvr.RECORD) {
                    String str = ((GiftAnchorPanelRecordPageCenterAssem) awS631S0100000_17.l0).hp().LLILLL;
                    List<C050G> list = ((GiftAnchorPanelRecordPageCenterAssem) awS631S0100000_17.l0).ip().getState().LLILLJJLI.LIZ;
                    if (!(list instanceof Collection) || !list.isEmpty()) {
                        Iterator<C050G> it2 = list.iterator();
                        while (true) {
                            if (it2.hasNext()) {
                                if (it2.next() instanceof C1146070fvh) {
                                    z = true;
                                }
                            }
                        }
                    }
                    C1133640fbe.LJIIJJI(str, z, ((GiftAnchorPanelRecordPageCenterAssem) awS631S0100000_17.l0).ip().getState().LLILLJJLI.LIZ.isEmpty());
                }
                break;
            case 3:
                ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv8 = ((GiftAnchorPanelRecordPageCenterAssem) awS631S0100000_17.l0).LLJJJIL;
                if (viewOnAttachStateChangeListenerC20604515jv8 != null && (state5 = viewOnAttachStateChangeListenerC20604515jv8.getState()) != null) {
                    state5.LJIILL(c1146010fvb.LIZ, null);
                }
                break;
            case 5:
                ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv9 = ((GiftAnchorPanelRecordPageCenterAssem) awS631S0100000_17.l0).LLJJJIL;
                if (viewOnAttachStateChangeListenerC20604515jv9 != null && (state3 = viewOnAttachStateChangeListenerC20604515jv9.getState()) != null) {
                    Iterator it3 = ((ArrayList) state3.LJII()).iterator();
                    while (true) {
                        if (it3.hasNext()) {
                            Object next = it3.next();
                            if (next instanceof C1146050fvf) {
                                obj3 = next;
                            }
                        }
                    }
                    InterfaceC1891350zJl interfaceC1891350zJl = (InterfaceC1891350zJl) obj3;
                    if (interfaceC1891350zJl != null) {
                        GiftAnchorPanelRecordPageCenterAssem giftAnchorPanelRecordPageCenterAssem4 = (GiftAnchorPanelRecordPageCenterAssem) awS631S0100000_17.l0;
                        C766270U4b.LIZLLL(2131854909);
                        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv10 = giftAnchorPanelRecordPageCenterAssem4.LLJJJIL;
                        if (viewOnAttachStateChangeListenerC20604515jv10 != null && (state4 = viewOnAttachStateChangeListenerC20604515jv10.getState()) != null) {
                            C20600815jK.LJIIL(state4, interfaceC1891350zJl);
                        }
                    }
                }
                GiftAnchorPanelRecordPageCenterAssem giftAnchorPanelRecordPageCenterAssem5 = (GiftAnchorPanelRecordPageCenterAssem) awS631S0100000_17.l0;
                ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv11 = giftAnchorPanelRecordPageCenterAssem5.LLJJJIL;
                if (viewOnAttachStateChangeListenerC20604515jv11 != null) {
                    HandlerHook.viewPostDelay(viewOnAttachStateChangeListenerC20604515jv11, new ARunnableS117S0100000_17(giftAnchorPanelRecordPageCenterAssem5, 84), 300L);
                }
                break;
            case 6:
                ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv12 = ((GiftAnchorPanelRecordPageCenterAssem) awS631S0100000_17.l0).LLJJJIL;
                if (viewOnAttachStateChangeListenerC20604515jv12 != null && (state = viewOnAttachStateChangeListenerC20604515jv12.getState()) != null) {
                    Iterator it4 = ((ArrayList) state.LJII()).iterator();
                    while (true) {
                        if (it4.hasNext()) {
                            Object next2 = it4.next();
                            if (next2 instanceof C1146070fvh) {
                                obj3 = next2;
                            }
                        }
                    }
                    InterfaceC1891350zJl interfaceC1891350zJl2 = (InterfaceC1891350zJl) obj3;
                    if (interfaceC1891350zJl2 != null && (viewOnAttachStateChangeListenerC20604515jv = ((GiftAnchorPanelRecordPageCenterAssem) awS631S0100000_17.l0).LLJJJIL) != null && (state2 = viewOnAttachStateChangeListenerC20604515jv.getState()) != null) {
                        C20600815jK.LJIIL(state2, interfaceC1891350zJl2);
                    }
                }
                break;
            default:
                throw new C1954807lC();
        }
        return Unit.LIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00b0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$12(kotlin.jvm.internal.AwS631S0100000_17 r5, java.lang.Object r6, java.lang.Object r7) {
        /*
            kotlin.Pair r7 = (kotlin.Pair) r7
            java.lang.Object r1 = r7.getFirst()
            X.0fvr r0 = X.EnumC1146170fvr.RECORD
            if (r1 != r0) goto Lab
            java.lang.Object r0 = r5.l0
            com.bytedance.android.livesdk.gift.base.platform.business.panel.anchor.center.record.center.GiftAnchorPanelRecordPageCenterAssem r0 = (com.bytedance.android.livesdk.gift.base.platform.business.panel.anchor.center.record.center.GiftAnchorPanelRecordPageCenterAssem) r0
            com.bytedance.android.livesdk.gift.base.platform.business.panel.anchor.center.record.center.GiftAnchorPanelRecordPageCenterAssemViewModel r4 = r0.ip()
            boolean r0 = r4.LLILLL
            r3 = 1
            if (r0 != 0) goto L43
            r4.LLILLL = r3
            r4.refresh()
            X.0fvm r0 = r4.yQ2()
            com.bytedance.ies.sdk.datachannel.DataChannel r2 = r0.LLILLJJLI
            java.lang.Class<X.0eLP> r1 = X.C1085130eLP.class
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            r2.SX0(r1, r0)
            X.0fvm r0 = r4.yQ2()
            com.bytedance.ies.sdk.datachannel.DataChannel r2 = r0.LLILLJJLI
            java.lang.Class<com.bytedance.android.livesdk.GiftAnchorPanelGiftRecordReceivedEvent> r1 = com.bytedance.android.livesdk.GiftAnchorPanelGiftRecordReceivedEvent.class
            kotlin.jvm.internal.AwS596S0100000_17 r0 = r4.LLJJI
            r2.BQ2(r4, r1, r0)
            X.0fvm r0 = r4.yQ2()
            com.bytedance.ies.sdk.datachannel.DataChannel r2 = r0.LLILLJJLI
            java.lang.Class<com.bytedance.android.livesdk.GiftAnchorPanelGiftRecordReceivedQueueModelEvent> r1 = com.bytedance.android.livesdk.GiftAnchorPanelGiftRecordReceivedQueueModelEvent.class
            kotlin.jvm.internal.AwS596S0100000_17 r0 = r4.LLJJIII
            r2.BQ2(r4, r1, r0)
        L43:
            java.lang.Object r0 = r5.l0
            com.bytedance.android.livesdk.gift.base.platform.business.panel.anchor.center.record.center.GiftAnchorPanelRecordPageCenterAssem r0 = (com.bytedance.android.livesdk.gift.base.platform.business.panel.anchor.center.record.center.GiftAnchorPanelRecordPageCenterAssem) r0
            com.bytedance.android.livesdk.gift.base.platform.business.panel.anchor.center.record.center.GiftAnchorPanelRecordPageCenterAssemViewModel r0 = r0.ip()
            X.002o r0 = r0.getState()
            X.0fvY r0 = (X.C1145980fvY) r0
            X.06Xk<java.lang.Integer> r0 = r0.LL
            boolean r0 = r0 instanceof X.C1623606Xi
            if (r0 == 0) goto Lab
            java.lang.Object r0 = r5.l0
            com.bytedance.android.livesdk.gift.base.platform.business.panel.anchor.center.record.center.GiftAnchorPanelRecordPageCenterAssem r0 = (com.bytedance.android.livesdk.gift.base.platform.business.panel.anchor.center.record.center.GiftAnchorPanelRecordPageCenterAssem) r0
            X.0fvm r0 = r0.hp()
            java.lang.String r2 = r0.LLILLL
            java.lang.Object r0 = r5.l0
            com.bytedance.android.livesdk.gift.base.platform.business.panel.anchor.center.record.center.GiftAnchorPanelRecordPageCenterAssem r0 = (com.bytedance.android.livesdk.gift.base.platform.business.panel.anchor.center.record.center.GiftAnchorPanelRecordPageCenterAssem) r0
            X.15jv r0 = r0.LLJJJIL
            if (r0 == 0) goto Lb0
            X.15jK r0 = r0.getState()
            if (r0 == 0) goto Lb0
            java.util.List r1 = r0.LJII()
            java.util.ArrayList r1 = (java.util.ArrayList) r1
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto Lb0
            java.util.Iterator r1 = r1.iterator()
        L7f:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto Lb0
            java.lang.Object r0 = r1.next()
            boolean r0 = r0 instanceof X.C1146070fvh
            if (r0 == 0) goto L7f
            r1 = 1
        L8e:
            java.lang.Object r0 = r5.l0
            com.bytedance.android.livesdk.gift.base.platform.business.panel.anchor.center.record.center.GiftAnchorPanelRecordPageCenterAssem r0 = (com.bytedance.android.livesdk.gift.base.platform.business.panel.anchor.center.record.center.GiftAnchorPanelRecordPageCenterAssem) r0
            X.15jv r0 = r0.LLJJJIL
            if (r0 == 0) goto Lae
            X.15jK r0 = r0.getState()
            if (r0 == 0) goto Lae
            java.util.List r0 = r0.LJII()
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            boolean r0 = r0.isEmpty()
            if (r0 != r3) goto Lae
        La8:
            X.C1133640fbe.LJIIJJI(r2, r1, r3)
        Lab:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        Lae:
            r3 = 0
            goto La8
        Lb0:
            r1 = 0
            goto L8e
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS631S0100000_17.invoke$12(kotlin.jvm.internal.AwS631S0100000_17, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    public static final Object invoke$13(AwS631S0100000_17 awS631S0100000_17, Object obj, Object obj2) {
        if (((C1146090fvj) obj2).LIZJ) {
            ((AnchorRecordEmptyCell) awS631S0100000_17.l0).I5();
        } else {
            AnchorRecordEmptyCell anchorRecordEmptyCell = (AnchorRecordEmptyCell) awS631S0100000_17.l0;
            LiveIconView liveIconView = anchorRecordEmptyCell.LLILLL;
            if (liveIconView != null) {
                ObjectAnimator objectAnimator = anchorRecordEmptyCell.LLILZ;
                if (objectAnimator != null) {
                    objectAnimator.cancel();
                }
                anchorRecordEmptyCell.LLILZ = null;
                float rotation = liveIconView.getRotation();
                ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(liveIconView, (Property<LiveIconView, Float>) View.ROTATION, rotation, 360.0f);
                objectAnimatorOfFloat.setDuration((long) (((360.0f - rotation) / 360.0f) * 1000));
                objectAnimatorOfFloat.setInterpolator(new LinearInterpolator());
                objectAnimatorOfFloat.addListener(new ALAdapterS12S0200000_17(liveIconView, anchorRecordEmptyCell, 31));
                C786410Ut5.Pd(objectAnimatorOfFloat);
                anchorRecordEmptyCell.LLILZIL = objectAnimatorOfFloat;
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$14(AwS631S0100000_17 awS631S0100000_17, Object obj, Object obj2) {
        if (((Pair) obj2).getFirst() == EnumC1146170fvr.RECORD) {
            GiftAnchorPanelRecordPageNotificationAssem giftAnchorPanelRecordPageNotificationAssem = (GiftAnchorPanelRecordPageNotificationAssem) awS631S0100000_17.l0;
            if (giftAnchorPanelRecordPageNotificationAssem.LLJJJJLIIL) {
                String str = ((C1146120fvm) giftAnchorPanelRecordPageNotificationAssem.LLJJIJIL.getValue()).LLILLL;
                C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_creator_new_record_button_show");
                C1133640fbe.LIZ(c474500IjALIZ);
                c474500IjALIZ.LJJII(str, "gift_enter_from");
                c474500IjALIZ.LIZ();
                ((GiftAnchorPanelRecordPageNotificationAssem) awS631S0100000_17.l0).LLJJJJLIIL = false;
            }
        }
        return Unit.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$15(AwS631S0100000_17 awS631S0100000_17, Object obj, Object obj2) {
        ViewGroup.LayoutParams layoutParams;
        FrameLayout.LayoutParams layoutParams2;
        int iLIZ;
        C16F5 c16f5;
        String strLJIIL;
        C16F5 c16f52;
        C1146090fvj c1146090fvj = (C1146090fvj) obj2;
        EnumC994430bz7 enumC994430bz7 = c1146090fvj.LIZ;
        if (enumC994430bz7 != EnumC994430bz7.HIDE) {
            if (enumC994430bz7 == EnumC994430bz7.SHOW_DIAMOND && (c16f52 = ((GiftAnchorPanelRecordPageNotificationAssem) awS631S0100000_17.l0).LLJJIJIIJIL) != null) {
                c16f52.setText(C497740JfY.LJIJI(2131856132));
            }
            if (c1146090fvj.LIZ == EnumC994430bz7.SHOW_RECORD && (c16f5 = ((GiftAnchorPanelRecordPageNotificationAssem) awS631S0100000_17.l0).LLJJIJIIJIL) != null) {
                int i = c1146090fvj.LIZIZ;
                if (i > 99) {
                    strLJIIL = C497740JfY.LJIJI(2131852574);
                } else {
                    strLJIIL = C497740JfY.LJIIL(2131755851, i, Integer.valueOf(i));
                }
                c16f5.setText(strLJIIL);
            }
            if (c1146090fvj.LIZJ) {
                ObjectAnimator objectAnimator = ((GiftAnchorPanelRecordPageNotificationAssem) awS631S0100000_17.l0).LLJJJJ;
                if (objectAnimator != null && objectAnimator.isRunning()) {
                    C20441214yg.LJ(((GiftAnchorPanelRecordPageNotificationAssem) awS631S0100000_17.l0).LLJJI, "animation is running, ignore");
                } else {
                    ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(((GiftAnchorPanelRecordPageNotificationAssem) awS631S0100000_17.l0).LLJJIJI, (Property<LiveIconView, Float>) View.ROTATION, 0.0f, 360.0f);
                    objectAnimatorOfFloat.setDuration(1000L);
                    objectAnimatorOfFloat.setInterpolator(new LinearInterpolator());
                    objectAnimatorOfFloat.setRepeatCount(-1);
                    objectAnimatorOfFloat.setRepeatMode(1);
                    C786410Ut5.Pd(objectAnimatorOfFloat);
                    ((GiftAnchorPanelRecordPageNotificationAssem) awS631S0100000_17.l0).LLJJJJ = objectAnimatorOfFloat;
                }
            } else {
                ObjectAnimator objectAnimator2 = ((GiftAnchorPanelRecordPageNotificationAssem) awS631S0100000_17.l0).LLJJJJ;
                if (objectAnimator2 != null) {
                    objectAnimator2.cancel();
                }
                GiftAnchorPanelRecordPageNotificationAssem giftAnchorPanelRecordPageNotificationAssem = (GiftAnchorPanelRecordPageNotificationAssem) awS631S0100000_17.l0;
                giftAnchorPanelRecordPageNotificationAssem.LLJJJJ = null;
                LiveIconView liveIconView = giftAnchorPanelRecordPageNotificationAssem.LLJJIJI;
                if (liveIconView != null) {
                    C786410Ut5.Db(liveIconView, 0.0f);
                }
            }
            LinearLayout linearLayout = ((GiftAnchorPanelRecordPageNotificationAssem) awS631S0100000_17.l0).LLJJIII;
            if (linearLayout != null) {
                layoutParams = linearLayout.getLayoutParams();
            } else {
                layoutParams = null;
            }
            if ((layoutParams instanceof FrameLayout.LayoutParams) && (layoutParams2 = (FrameLayout.LayoutParams) layoutParams) != null) {
                AssemVMLazy assemVMLazy = ((GiftAnchorPanelRecordPageNotificationAssem) awS631S0100000_17.l0).LLJJJIL;
                InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = GiftAnchorPanelRecordPageNotificationAssem.LLJJL;
                if (((C1145980fvY) assemVMLazy.getValue().getState()).LLILZ) {
                    layoutParams2.gravity = 8388693;
                    layoutParams2.topMargin = 0;
                    layoutParams2.bottomMargin = C439101nJ.LIZ(50);
                } else {
                    layoutParams2.gravity = 8388661;
                    layoutParams2.bottomMargin = 0;
                    if (c1146090fvj.LIZLLL) {
                        iLIZ = C439101nJ.LIZ(166);
                    } else {
                        iLIZ = C439101nJ.LIZ(16);
                    }
                    layoutParams2.topMargin = iLIZ;
                }
            }
            if (!C500260Jjc.LJJJJIZL(((GiftAnchorPanelRecordPageNotificationAssem) awS631S0100000_17.l0).LLJJIII)) {
                AnimatorSet animatorSet = ((GiftAnchorPanelRecordPageNotificationAssem) awS631S0100000_17.l0).LLJJJJJIL;
                if (animatorSet != null) {
                    animatorSet.cancel();
                }
                GiftAnchorPanelRecordPageNotificationAssem giftAnchorPanelRecordPageNotificationAssem2 = (GiftAnchorPanelRecordPageNotificationAssem) awS631S0100000_17.l0;
                LinearLayout linearLayout2 = giftAnchorPanelRecordPageNotificationAssem2.LLJJIII;
                if (linearLayout2 != null) {
                    ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(linearLayout2, (Property<LinearLayout, Float>) View.TRANSLATION_Y, -10.0f, 0.0f);
                    ObjectAnimator objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(linearLayout2, (Property<LinearLayout, Float>) View.ALPHA, 0.0f, 1.0f);
                    AnimatorSet animatorSet2 = new AnimatorSet();
                    animatorSet2.setInterpolator(new C1125430fOP());
                    animatorSet2.setDuration(300L);
                    animatorSet2.playTogether(objectAnimatorOfFloat2, objectAnimatorOfFloat3);
                    animatorSet2.addListener(new AAListenerS328S0100000_17(giftAnchorPanelRecordPageNotificationAssem2, 7));
                    giftAnchorPanelRecordPageNotificationAssem2.LLJJJJJIL = animatorSet2;
                    animatorSet2.start();
                }
                AssemVMLazy assemVMLazy2 = ((GiftAnchorPanelRecordPageNotificationAssem) awS631S0100000_17.l0).LLJJJ;
                InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr2 = GiftAnchorPanelRecordPageNotificationAssem.LLJJL;
                if (((C1146210fvv) assemVMLazy2.getValue().getState()).LLILLJJLI.getFirst() == EnumC1146170fvr.RECORD) {
                    String str = ((C1146120fvm) ((GiftAnchorPanelRecordPageNotificationAssem) awS631S0100000_17.l0).LLJJIJIL.getValue()).LLILLL;
                    C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_creator_new_record_button_show");
                    C1133640fbe.LIZ(c474500IjALIZ);
                    c474500IjALIZ.LJJII(str, "gift_enter_from");
                    c474500IjALIZ.LIZ();
                } else {
                    ((GiftAnchorPanelRecordPageNotificationAssem) awS631S0100000_17.l0).LLJJJJLIIL = true;
                }
            }
            if (c1146090fvj.LJ) {
                C766270U4b.LIZLLL(2131852584);
            }
            C1133640fbe.LJIIL(21, null, null, null, 14);
        } else {
            AnimatorSet animatorSet3 = ((GiftAnchorPanelRecordPageNotificationAssem) awS631S0100000_17.l0).LLJJJJJIL;
            if (animatorSet3 != null) {
                animatorSet3.cancel();
            }
            GiftAnchorPanelRecordPageNotificationAssem giftAnchorPanelRecordPageNotificationAssem3 = (GiftAnchorPanelRecordPageNotificationAssem) awS631S0100000_17.l0;
            LinearLayout linearLayout3 = giftAnchorPanelRecordPageNotificationAssem3.LLJJIII;
            if (linearLayout3 != null) {
                ObjectAnimator objectAnimatorOfFloat4 = ObjectAnimator.ofFloat(linearLayout3, (Property<LinearLayout, Float>) View.ALPHA, 1.0f, 0.0f);
                AnimatorSet animatorSet4 = new AnimatorSet();
                animatorSet4.setDuration(150L);
                animatorSet4.playTogether(objectAnimatorOfFloat4);
                animatorSet4.addListener(new AAListenerS328S0100000_17(giftAnchorPanelRecordPageNotificationAssem3, 8));
                giftAnchorPanelRecordPageNotificationAssem3.LLJJJJJIL = animatorSet4;
                animatorSet4.start();
            }
            C1133640fbe.LJIIL(22, null, null, null, 14);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$16(AwS631S0100000_17 awS631S0100000_17, Object obj, Object obj2) {
        ((ViewOnAttachStateChangeListenerC20604515jv) awS631S0100000_17.l0).getState().LJIILL((Collection) obj2, null);
        return Unit.LIZ;
    }

    public static final Object invoke$17(AwS631S0100000_17 awS631S0100000_17, Object obj, Object obj2) {
        GiftColorInfo giftColorInfo;
        C291001Au c291001Au = (C291001Au) obj2;
        if (c291001Au != null && (giftColorInfo = (GiftColorInfo) c291001Au.LIZ()) != null) {
            CountryListDialogFragment countryListDialogFragment = (CountryListDialogFragment) awS631S0100000_17.l0;
            Long lValueOf = Long.valueOf(countryListDialogFragment.uS().getState().LL);
            Long l = giftColorInfo.colorId;
            String str = giftColorInfo.colorNameEnglish;
            if (str.length() <= 0) {
                str = null;
            }
            C474500IjA c474500IjALIZ = C0IJT.LIZ("gift_color_more_panel_confirm");
            c474500IjALIZ.LJIL();
            c474500IjALIZ.LJJII(lValueOf, "gift_id");
            c474500IjALIZ.LJJII(l, "color_id");
            c474500IjALIZ.LJJII(str, "button_type");
            c474500IjALIZ.LJJII(C1128450fTH.LJIIIZ().getDesc(), "send_gift_scene");
            c474500IjALIZ.LJJII(C1130100fVw.LIZ.LIZ, "guide_from");
            c474500IjALIZ.LIZ();
            InterfaceC1128440fTG interfaceC1128440fTG = countryListDialogFragment.LLJZ;
            if (interfaceC1128440fTG != null) {
                interfaceC1128440fTG.LIZ(giftColorInfo);
            }
            countryListDialogFragment.close(1);
        }
        return Unit.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$18(AwS631S0100000_17 awS631S0100000_17, Object obj, Object obj2) {
        float fFloatValue = ((Number) obj2).floatValue();
        C1126540fQC c1126540fQC = ((C1126260fPk) awS631S0100000_17.l0).LL;
        if (c1126540fQC != null) {
            C786410Ut5.g5(c1126540fQC, fFloatValue);
        }
        return Unit.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$19(AwS631S0100000_17 awS631S0100000_17, Object obj, Object obj2) {
        float fFloatValue = ((Number) obj2).floatValue();
        View view = ((C1126240fPi) awS631S0100000_17.l0).LL;
        if (view != null) {
            C786410Ut5.T4(view, fFloatValue);
        }
        return Unit.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$2(AwS631S0100000_17 awS631S0100000_17, Object obj, Object obj2) {
        AbstractC1109840ezG abstractC1109840ezG;
        C1109600eys c1109600eys = (C1109600eys) obj;
        boolean zBooleanValue = ((Boolean) obj2).booleanValue();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Callback invoked, VH = ");
        sbLIZ.append(((BaseCommentPinnedWidget) awS631S0100000_17.l0).LLIZ);
        sbLIZ.append(", PinnedModel: ");
        sbLIZ.append(c1109600eys);
        sbLIZ.append(", PerformHiding: ");
        sbLIZ.append(zBooleanValue);
        C20441214yg.LJ("PinnedWidget", C2188811AlT.LIZIZ(sbLIZ));
        BaseCommentPinnedWidget baseCommentPinnedWidget = (BaseCommentPinnedWidget) awS631S0100000_17.l0;
        AbstractC1109720ez4<? extends InterfaceC1111870f2X, C1109600eys<? extends InterfaceC1111870f2X>> abstractC1109720ez4 = baseCommentPinnedWidget.LLIZ;
        if ((abstractC1109720ez4 instanceof AbstractC1109840ezG) && (abstractC1109840ezG = (AbstractC1109840ezG) abstractC1109720ez4) != null) {
            C786410Ut5.T4(abstractC1109840ezG.itemView, 1.0f);
            if (zBooleanValue) {
                abstractC1109840ezG.onHide();
            }
            if (abstractC1109840ezG.isRecyclable()) {
                baseCommentPinnedWidget.Q1(abstractC1109840ezG, c1109600eys);
            }
        }
        ((BaseCommentPinnedWidget) awS631S0100000_17.l0).LLIZ = null;
        return Unit.LIZ;
    }

    public static final Object invoke$20(AwS631S0100000_17 awS631S0100000_17, Object obj, Object obj2) {
        ((LivePrivilegeAnnouncementWidget) awS631S0100000_17.l0).LLJI = ((Boolean) obj).booleanValue();
        return Unit.LIZ;
    }

    public static final Object invoke$21(AwS631S0100000_17 awS631S0100000_17, Object obj, Object obj2) {
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        Integer numLIZIZ = C0CZU.LIZIZ((ModuleDecision) obj2, EnumC776070UcP.LIKE_RATE_INTERVAL_INCREASE.getFeatureName());
        if (zBooleanValue && numLIZIZ != null) {
            C1120220fG0 c1120220fG0 = ((C1120250fG3) awS631S0100000_17.l0).LLJL;
            c1120220fG0.LIZ = false;
            c1120220fG0.LIZJ = numLIZIZ.intValue();
            c1120220fG0.LIZLLL = -1.0f;
            c1120220fG0.LIZIZ = false;
            c1120220fG0.LJ = false;
        } else {
            C1120220fG0 c1120220fG02 = ((C1120250fG3) awS631S0100000_17.l0).LLJL;
            c1120220fG02.LIZ = false;
            c1120220fG02.LIZJ = 1;
            c1120220fG02.LIZLLL = -1.0f;
            c1120220fG02.LIZIZ = false;
            c1120220fG02.LJ = false;
        }
        return Unit.LIZ;
    }

    public static final Object invoke$22(AwS631S0100000_17 awS631S0100000_17, Object obj, Object obj2) {
        String strLIZ;
        final boolean z;
        LiveMode streamType;
        final SparkContext sparkContext = (SparkContext) obj;
        int iIntValue = ((Number) obj2).intValue();
        if (LiveHybridLynxCodeCacheOptimizeSetting.INSTANCE.bannerEnable()) {
            sparkContext.LJJJZ("enable_code_cache", "1");
        }
        Map<String, String> commonParams = LiveTop3HybridContainerDynamicParamsSetting.INSTANCE.getCommonParams();
        if (commonParams != null) {
            for (Map.Entry<String, String> entry : commonParams.entrySet()) {
                sparkContext.LJJJZ(entry.getKey(), entry.getValue());
            }
        }
        Map<String, String> bannerParams = LiveTop3HybridContainerDynamicParamsSetting.INSTANCE.getBannerParams();
        if (bannerParams != null) {
            for (Map.Entry<String, String> entry2 : bannerParams.entrySet()) {
                sparkContext.LJJJZ(entry2.getKey(), entry2.getValue());
            }
        }
        sparkContext.LJJJLZIJ(((IRoomFunctionService) C1161920gLG.LIZJ(IRoomFunctionService.class)).db0(((C1098730ehL) awS631S0100000_17.l0).LLILZ, null) ? 1 : 0, "is_black_bg");
        sparkContext.LJJJZ("container_create_start_time", String.valueOf(System.currentTimeMillis()));
        sparkContext.LJJJZ("enter_live_time", String.valueOf(((C1098730ehL) awS631S0100000_17.l0).LLJI));
        Room room = ((C1098730ehL) awS631S0100000_17.l0).LLILZ;
        if (room != null && (streamType = room.getStreamType()) != null) {
            strLIZ = C354201Zc.LIZ(streamType);
        } else {
            strLIZ = "";
        }
        sparkContext.LJJJZ("live_type", strLIZ);
        C1098730ehL c1098730ehL = (C1098730ehL) awS631S0100000_17.l0;
        final List<? extends BannerInRoom> list = c1098730ehL.LLILLJJLI;
        final NewTopRightBannerWidget newTopRightBannerWidget = c1098730ehL.LLILZIL;
        if (iIntValue == 0) {
            z = true;
        } else {
            z = false;
        }
        sparkContext.LJJIJIIJIL(new AbstractC1538740q92(sparkContext, list, newTopRightBannerWidget, z) { // from class: X.0q6D
            public final boolean LLILLJJLI;
            public final C1098490egx LLILLL;
            public InterfaceC1541990qEH LLILZ;

            @Override // X.AbstractC1537870q7d
            public final void LJLJJI() {
                SparkContext sparkContext2;
                List<? extends BannerInRoom> list2;
                BannerInRoom bannerInRoom;
                String strLIZ2;
                IResourceServiceX iResourceServiceXLIZIZ;
                Forest forest;
                if (this.LLILLJJLI) {
                    C1098490egx c1098490egx = this.LLILLL;
                    c1098490egx.getClass();
                    if (!LiveBannerPreloadFirstFrameSetting.INSTANCE.getValue() || (sparkContext2 = c1098490egx.LIZ) == null || (list2 = c1098490egx.LIZIZ) == null || (bannerInRoom = (BannerInRoom) C13LP.LJJJLL(list2)) == null || (strLIZ2 = C1098490egx.LIZ(bannerInRoom)) == null || (iResourceServiceXLIZIZ = C1533710q0v.LIZIZ(sparkContext2, false)) == null || (forest = iResourceServiceXLIZIZ.getForest()) == null) {
                        return;
                    }
                    C1533020pzo c1533020pzoLJIILJJIL = C1537480q70.LJIILJJIL(sparkContext2, false, null, 3);
                    if (c1533020pzoLJIILJJIL != null) {
                        RequestParamsX requestParamsX = new RequestParamsX(EnumC1533980q1M.LYNX_COMPONENT, TemplateBundle.class);
                        requestParamsX.groupId = sparkContext2.containerId;
                        requestParamsX.source = "BaseHybridBanner";
                        requestParamsX.enableMemoryCache = true;
                        c1533020pzoLJIILJJIL.LIZJ(strLIZ2, requestParamsX, new AwS602S0100000_23(c1098490egx, 35));
                        return;
                    }
                    C1533900q1E c1533900q1E = new C1533900q1E(forest, null, false, 6);
                    sparkContext2.LJJ(C1533900q1E.class, c1533900q1E);
                    RequestParams requestParams = new RequestParams(EnumC1533980q1M.LYNX_COMPONENT);
                    requestParams.enableMemoryCache = Boolean.TRUE;
                    requestParams.loadToMemory = true;
                    requestParams.needLocalFile = Boolean.FALSE;
                    c1533900q1E.LJFF(strLIZ2, requestParams, false, new AwS602S0100000_23(c1098490egx, 36));
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // X.AbstractC1537870q7d
            public final void LJLIIIL(InterfaceC1541990qEH interfaceC1541990qEH) throws JSONException {
                List<? extends BannerInRoom> list2;
                BannerInRoom bannerInRoom;
                String strLIZ2;
                C1098490egx c1098490egx = this.LLILLL;
                TemplateBundle templateBundle = c1098490egx.LIZLLL;
                if (templateBundle != null && (interfaceC1541990qEH instanceof LynxView) && (list2 = c1098490egx.LIZIZ) != null && (bannerInRoom = (BannerInRoom) C13LP.LJJJLL(list2)) != null && (strLIZ2 = C1098490egx.LIZ(bannerInRoom)) != null) {
                    ((LynxView) interfaceC1541990qEH).registerDynamicComponent(strLIZ2, templateBundle);
                }
                InterfaceC1098410egp interfaceC1098410egp = c1098490egx.LIZJ;
                if (interfaceC1098410egp != null) {
                    interfaceC1098410egp.LJJJJJL();
                }
                if (!LiveMoveBannerInitDataEventToRuntimeReadySetting.INSTANCE.getValue()) {
                    c1098490egx.LIZIZ(interfaceC1541990qEH);
                }
            }

            @Override // X.AbstractC1537870q7d
            public final void LJLJI(InterfaceC1541990qEH interfaceC1541990qEH) {
                this.LLILZ = interfaceC1541990qEH;
            }

            @Override // X.AbstractC1537870q7d
            public final void LJLJJLL(EnumC1067640dtC enumC1067640dtC) throws JSONException {
                InterfaceC1541990qEH interfaceC1541990qEH = this.LLILZ;
                if (interfaceC1541990qEH != null) {
                    C1098490egx c1098490egx = this.LLILLL;
                    c1098490egx.getClass();
                    if (LiveMoveBannerInitDataEventToRuntimeReadySetting.INSTANCE.getValue()) {
                        c1098490egx.LIZIZ(interfaceC1541990qEH);
                    }
                }
            }

            @Override // X.AbstractC1537870q7d
            public final void LJLIIL(InterfaceC1541990qEH interfaceC1541990qEH, String str) {
                InterfaceC1098410egp interfaceC1098410egp = this.LLILLL.LIZJ;
                if (interfaceC1098410egp != null) {
                    interfaceC1098410egp.y0(str);
                }
            }

            @Override // X.AbstractC1537870q7d
            public final void LJL(InterfaceC1541990qEH interfaceC1541990qEH, String str, C1542120qEU c1542120qEU) {
                InterfaceC1098410egp interfaceC1098410egp = this.LLILLL.LIZJ;
                if (interfaceC1098410egp != null) {
                    interfaceC1098410egp.LJJLI(c1542120qEU.LIZIZ);
                }
            }

            {
                super(0);
                this.LLILLJJLI = z;
                this.LLILLL = new C1098490egx(sparkContext, list, newTopRightBannerWidget);
            }
        });
        if (iIntValue != 0) {
            C520710KbV.LIZIZ(sparkContext);
        } else {
            C1538590q8n c1538590q8n = new C1538590q8n();
            c1538590q8n.LIZ = false;
            c1538590q8n.LJI = true;
            sparkContext.liteLynxConfig = c1538590q8n;
        }
        return Unit.LIZ;
    }

    public static final Object invoke$23(AwS631S0100000_17 awS631S0100000_17, Object obj, Object obj2) {
        ((Function1) awS631S0100000_17.l0).invoke(Boolean.valueOf(((Boolean) obj).booleanValue()));
        return Unit.LIZ;
    }

    public static final Object invoke$24(AwS631S0100000_17 awS631S0100000_17, Object obj, Object obj2) {
        ((C1125880fP8) awS631S0100000_17.l0).LIZIZ(((Number) obj).longValue(), ((Number) obj2).longValue(), false);
        return Unit.LIZ;
    }

    public static final Object invoke$25(AwS631S0100000_17 awS631S0100000_17, Object obj, Object obj2) {
        ((C1125880fP8) awS631S0100000_17.l0).LIZIZ(((Number) obj).longValue(), ((Number) obj2).longValue(), false);
        return Unit.LIZ;
    }

    public static final Object invoke$26(AwS631S0100000_17 awS631S0100000_17, Object obj, Object obj2) {
        int iIntValue = ((Number) obj2).intValue();
        ((C16F5) awS631S0100000_17.l0).setText((String) obj);
        ((C16F5) awS631S0100000_17.l0).getLayoutParams().width = iIntValue;
        return Unit.LIZ;
    }

    public static final Object invoke$27(AwS631S0100000_17 awS631S0100000_17, Object obj, Object obj2) {
        float fFloatValue = ((Number) obj2).floatValue();
        C0GSA c0gsa = ((C1126230fPh) awS631S0100000_17.l0).LJIIJ;
        if (c0gsa != null) {
            c0gsa.setProgress(fFloatValue);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$28(AwS631S0100000_17 awS631S0100000_17, Object obj, Object obj2) {
        float fFloatValue = ((Number) obj2).floatValue();
        C0GSA c0gsa = ((C1126230fPh) awS631S0100000_17.l0).LJIIJ;
        if (c0gsa != null) {
            c0gsa.setScale(fFloatValue);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$29(AwS631S0100000_17 awS631S0100000_17, Object obj, Object obj2) {
        C0GSA c0gsa;
        float fFloatValue = ((Number) obj2).floatValue();
        C0GSA c0gsa2 = ((C1126230fPh) awS631S0100000_17.l0).LJIIJ;
        if (c0gsa2 != null && c0gsa2.getWidth() > 0 && (c0gsa = ((C1126230fPh) awS631S0100000_17.l0).LJIIJ) != null) {
            c0gsa.setBorderWidth(fFloatValue);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$3(AwS631S0100000_17 awS631S0100000_17, Object obj, Object obj2) {
        int size;
        int iIntValue = ((Number) obj).intValue();
        ((Number) obj2).intValue();
        RankEntranceRootWidget rankEntranceRootWidget = (RankEntranceRootWidget) awS631S0100000_17.l0;
        if (View.MeasureSpec.getMode(iIntValue) == 0) {
            size = 0;
        } else {
            size = View.MeasureSpec.getSize(iIntValue);
        }
        rankEntranceRootWidget.LLILLJJLI = size;
        return Unit.LIZ;
    }

    public static final Object invoke$30(AwS631S0100000_17 awS631S0100000_17, Object obj, Object obj2) {
        int iIntValue = ((Number) obj2).intValue();
        C0GSA c0gsa = ((C1126230fPh) awS631S0100000_17.l0).LJIIJ;
        if (c0gsa != null) {
            c0gsa.setBorderAlpha(iIntValue);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$31(AwS631S0100000_17 awS631S0100000_17, Object obj, Object obj2) {
        long ownerUserId;
        Room room;
        Room room2;
        DataChannel dataChannel;
        Gift gift = (Gift) obj;
        View view = (View) obj2;
        C1123280fKw c1123280fKw = (C1123280fKw) awS631S0100000_17.l0;
        c1123280fKw.getClass();
        if (C468250IXv.LIZJ(c1123280fKw.LLILZ)) {
            C468250IXv.LJ(c1123280fKw.LLILZ, "bottom_zone");
        } else {
            DataChannel dataChannel2 = c1123280fKw.LLILZ;
            if (dataChannel2 != null) {
                dataChannel2.zW(FastGiftClickChannel.class, Boolean.TRUE);
            }
            DataChannel dataChannel3 = c1123280fKw.LLILZ;
            if (dataChannel3 != null && Intrinsics.LJFF(dataChannel3.gg0(C0TZM.class), Boolean.FALSE) && (dataChannel = c1123280fKw.LLILZ) != null) {
                dataChannel.FQ2(ResetSilentTimerEvent.class);
            }
            C1123080fKc.LIZ();
            if (c1123280fKw.LLJILJILJ) {
                C1123130fKh.LIZLLL = true;
            } else {
                C1123130fKh.LIZLLL = false;
            }
            int[] iArr = new int[2];
            view.getLocationOnScreen(iArr);
            int i = iArr[0];
            int i2 = iArr[1];
            if (gift.id == 5655) {
                c1123280fKw.LLJJ = SystemClock.uptimeMillis();
                int width = view.getWidth();
                int height = view.getHeight();
                c1123280fKw.LLIZLLLIL = 0;
                c1123280fKw.LJIIIZ(width, height, iArr);
                C1126220fPg c1126220fPg = c1123280fKw.LLILLJJLI;
                if (c1126220fPg != null && C500260Jjc.LJJJJIZL(c1126220fPg)) {
                    if (C1123380fL6.LIZIZ()) {
                        C1123380fL6.LIZJ(402, true);
                    }
                } else if (C1123380fL6.LIZIZ()) {
                    C1123380fL6.LIZJ(401, false);
                }
                C1126220fPg c1126220fPg2 = c1123280fKw.LLILLJJLI;
                if (c1126220fPg2 != null) {
                    C500260Jjc.LLFFF(c1126220fPg2);
                }
                C1128760fTm c1128760fTm = C1128760fTm.LJIIJ;
                DataChannel dataChannel4 = c1123280fKw.LLILZ;
                Boolean bool = Boolean.FALSE;
                C1128760fTm.LJJJJJL(c1128760fTm, dataChannel4, 5655L, true, false, "convenient_icon", "", "click", 0, null, "gift", null, C1125820fP2.LJFF().LIZ, null, null, null, 124928);
                DataChannel dataChannel5 = c1123280fKw.LLILZ;
                if (dataChannel5 != null && (room2 = (Room) dataChannel5.gg0(RoomChannel.class)) != null) {
                    C1126150fPZ c1126150fPZ = new C1126150fPZ(EnumC1129230fUX.FAST_GIFT, EnumC1125400fOM.ANCHOR);
                    C1130020fVo c1130020fVo = InterfaceC1131100fXY.LIZ;
                    long j = gift.id;
                    int i3 = gift.type;
                    boolean zLJIIIZ = gift.LJIIIZ();
                    c1130020fVo.getClass();
                    C1128870fTx c1128870fTxLIZ = C1130020fVo.LIZ(j, i3, 1, zLJIIIZ, room2, 0, c1126150fPZ);
                    c1128870fTxLIZ.LJIJ = gift.diamondCount;
                    c1128870fTxLIZ.LJJJJLI = gift.isBroadcastGift;
                    c1128870fTxLIZ.LJLJJI = "convenient_icon";
                    c1128870fTxLIZ.LJLJL = C1123290fKx.LIZ(room2.getOwner());
                    c1128870fTxLIZ.LJJJJZ = true;
                    c1128870fTxLIZ.LJJIIJZLJL = C1127480fRi.LIZ(gift, null, 6);
                    c1128870fTxLIZ.LJJIIZ = C1123390fL7.LIZ(gift);
                    c1128870fTxLIZ.LJJJI = C1125820fP2.LJFF().LIZ;
                    c1128870fTxLIZ.LJJLIIJ = gift;
                    c1128870fTxLIZ.LJJII = C158B.LIZ();
                    C1131140fXc.LIZLLL(c1123280fKw.LLILZ, c1128870fTxLIZ);
                }
                C1126220fPg c1126220fPg3 = c1123280fKw.LLILLJJLI;
                if (c1126220fPg3 != null) {
                    ARunnableS117S0100000_17 aRunnableS117S0100000_17 = new ARunnableS117S0100000_17(c1123280fKw, 171);
                    ARunnableS117S0100000_17 aRunnableS117S0100000_172 = new ARunnableS117S0100000_17(c1123280fKw, 172);
                    long jUptimeMillis = SystemClock.uptimeMillis() - c1123280fKw.LLJJ;
                    DataChannel dataChannel6 = c1123280fKw.LLILZ;
                    if (dataChannel6 != null && (room = (Room) dataChannel6.gg0(RoomChannel.class)) != null) {
                        ownerUserId = room.getOwnerUserId();
                    } else {
                        ownerUserId = 0;
                    }
                    C1126220fPg.LJ(c1126220fPg3, aRunnableS117S0100000_17, aRunnableS117S0100000_172, 5655L, bool, "fast_gift", "fast_gift", "fast_gift", jUptimeMillis, Long.valueOf(ownerUserId), null, null, null, false, null, false, 48640);
                }
            } else {
                DataChannel dataChannel7 = c1123280fKw.LLILZ;
                if (dataChannel7 != null) {
                    dataChannel7.LC0(FastGiftSendWidgetShowEvent.class, new C1135230feD(gift, i, i2, i + view.getWidth(), i2 + view.getHeight()));
                }
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$32(AwS631S0100000_17 awS631S0100000_17, Object obj, Object obj2) {
        ((C1141100fng) awS631S0100000_17.l0).LIZIZ.LJI(EnumC1138990fkH.ALPHA_PLAYER, (C1141050fnb) obj2);
        return Unit.LIZ;
    }

    public static final Object invoke$33(AwS631S0100000_17 awS631S0100000_17, Object obj, Object obj2) {
        long jLJI;
        AbstractC1126600fQI<? extends AnonymousClass0054> abstractC1126600fQILLLIILIL;
        AbstractC1126600fQI<? extends AnonymousClass0054> abstractC1126600fQILLLIILIL2;
        AbstractC1126600fQI<? extends AnonymousClass0054> abstractC1126600fQILLLIILIL3;
        int iIntValue = ((Number) obj).intValue();
        ((Number) obj2).longValue();
        Integer numValueOf = Integer.valueOf(iIntValue);
        if (numValueOf.intValue() >= 0) {
            ImageModel imageModel = null;
            if (1 != 0) {
                C1128710fTh c1128710fTh = (C1128710fTh) awS631S0100000_17.l0;
                numValueOf.intValue();
                CopyOnWriteArrayList<C1125840fP4> copyOnWriteArrayList = C1125820fP2.LIZ;
                C1127050fR1 c1127050fR1 = c1128710fTh.LLJJIJI;
                if (c1127050fR1 != null && (abstractC1126600fQILLLIILIL3 = c1127050fR1.LLLIILIL(iIntValue)) != null) {
                    jLJI = abstractC1126600fQILLLIILIL3.LJI();
                } else {
                    jLJI = 0;
                }
                if (C1125820fP2.LJII(Long.valueOf(jLJI), null)) {
                    C1127050fR1 c1127050fR12 = c1128710fTh.LLJJIJI;
                    if (c1127050fR12 != null && (abstractC1126600fQILLLIILIL2 = c1127050fR12.LLLIILIL(iIntValue)) != null) {
                        C1125850fP5 c1125850fP5 = C1125820fP2.LJFF().LIZIZ;
                        if (c1125850fP5 != null) {
                            imageModel = c1125850fP5.LIZ;
                        }
                        abstractC1126600fQILLLIILIL2.LJIILLIIL = imageModel;
                    }
                } else {
                    C1127050fR1 c1127050fR13 = c1128710fTh.LLJJIJI;
                    if (c1127050fR13 != null && (abstractC1126600fQILLLIILIL = c1127050fR13.LLLIILIL(iIntValue)) != null) {
                        abstractC1126600fQILLLIILIL.LJIILLIIL = null;
                    }
                }
                C1127050fR1 c1127050fR14 = c1128710fTh.LLJJIJI;
                if (c1127050fR14 != null) {
                    c1127050fR14.LLLJ(iIntValue, "GIFT_ADAPTER_PAYLOAD_LEFT_ICON", c1128710fTh.LLJJIII);
                }
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$34(AwS631S0100000_17 awS631S0100000_17, Object obj, Object obj2) {
        ((C1128950fU5) awS631S0100000_17.l0).LIZ.LJJLL(((Number) obj).intValue(), (String) obj2);
        return Unit.LIZ;
    }

    public static final Object invoke$35(AwS631S0100000_17 awS631S0100000_17, Object obj, Object obj2) {
        if (((Boolean) obj2).booleanValue()) {
            ((PackageListAssem) awS631S0100000_17.l0).cp();
        }
        return Unit.LIZ;
    }

    public static final Object invoke$36(AwS631S0100000_17 awS631S0100000_17, Object obj, Object obj2) {
        ((Function0) awS631S0100000_17.l0).invoke();
        return Unit.LIZ;
    }

    public static final Object invoke$37(AwS631S0100000_17 awS631S0100000_17, Object obj, Object obj2) {
        List list = (List) obj;
        List list2 = (List) obj2;
        C05XL c05xl = (C05XL) awS631S0100000_17.l0;
        if (list == null) {
            list = C13BV.INSTANCE;
        }
        c05xl.LJIIZILJ(new C1886107a7(list, list2, false));
        return Unit.LIZ;
    }

    public static final Object invoke$38(AwS631S0100000_17 awS631S0100000_17, Object obj, Object obj2) {
        if (((Boolean) obj2).booleanValue()) {
            C16FS c16fs = ((RechargeBtnAssem) awS631S0100000_17.l0).LLJ;
            if (c16fs != null) {
                c16fs.LJ();
            }
        } else {
            C16FS c16fs2 = ((RechargeBtnAssem) awS631S0100000_17.l0).LLJ;
            if (c16fs2 != null) {
                c16fs2.LJIIL();
            }
        }
        return Unit.LIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:209:0x064d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$39(kotlin.jvm.internal.AwS631S0100000_17 r31, java.lang.Object r32, java.lang.Object r33) {
        /*
            Method dump skipped, instruction units count: 2467
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS631S0100000_17.invoke$39(kotlin.jvm.internal.AwS631S0100000_17, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    public static final Object invoke$4(AwS631S0100000_17 awS631S0100000_17, Object obj, Object obj2) {
        ((NewTopRightBannerWidget) awS631S0100000_17.l0).LLJL = ((Boolean) obj).booleanValue();
        return Unit.LIZ;
    }

    public static final Object invoke$40(AwS631S0100000_17 awS631S0100000_17, Object obj, Object obj2) {
        ((C1125560fOc) awS631S0100000_17.l0).LIZ(((Number) obj).longValue(), ((Number) obj2).longValue());
        return Unit.LIZ;
    }

    public static final Object invoke$41(AwS631S0100000_17 awS631S0100000_17, Object obj, Object obj2) {
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        long jLongValue = ((Number) obj2).longValue();
        C1105320ery c1105320ery = (C1105320ery) awS631S0100000_17.l0;
        if (!zBooleanValue) {
            c1105320ery.getClass();
            jLongValue = 2;
        }
        c1105320ery.LLILZLL = jLongValue;
        return Unit.LIZ;
    }

    public static final Object invoke$42(AwS631S0100000_17 awS631S0100000_17, Object obj, Object obj2) {
        List list = (List) obj2;
        C1148930g0J c1148930g0J = ((GiftFavoritePanelAssem) awS631S0100000_17.l0).LLJJIJI;
        if (c1148930g0J != null) {
            c1148930g0J.LLLI(list);
        }
        return Unit.LIZ;
    }

    /* JADX WARN: Code restructure failed: missing block: B:78:0x013f, code lost:
    
        r0 = false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* bridge */ /* synthetic */ java.lang.Object invoke$43(kotlin.jvm.internal.AwS631S0100000_17 r7, java.lang.Object r8, java.lang.Object r9) {
        /*
            Method dump skipped, instruction units count: 325
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS631S0100000_17.invoke$43(kotlin.jvm.internal.AwS631S0100000_17, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    public static final Object invoke$44(AwS631S0100000_17 awS631S0100000_17, Object obj, Object obj2) {
        if (((GiftFavoritePanelAssem) awS631S0100000_17.l0).Go().xQ2() == 0) {
            C16F5 c16f5 = ((GiftFavoritePanelAssem) awS631S0100000_17.l0).LLJILJILJ;
            if (c16f5 != null) {
                C500260Jjc.LJIILIIL(c16f5);
            }
        } else {
            C16F5 c16f52 = ((GiftFavoritePanelAssem) awS631S0100000_17.l0).LLJILJILJ;
            if (c16f52 != null) {
                C500260Jjc.LLFFF(c16f52);
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$45(AwS631S0100000_17 awS631S0100000_17, Object obj, Object obj2) {
        List list = (List) obj2;
        C1148930g0J c1148930g0J = ((GiftFavoritePanelAssem) awS631S0100000_17.l0).LLJJIJIIJIL;
        if (c1148930g0J != null) {
            c1148930g0J.LLLI(list);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$46(AwS631S0100000_17 awS631S0100000_17, Object obj, Object obj2) {
        SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) obj;
        ((Boolean) obj2).booleanValue();
        C1115360f8A c1115360f8A = C1115380f8C.LIZ;
        SpannableStringBuilder spannableStringBuilderLIZ = C1115380f8C.LIZ(40, spannableStringBuilder);
        if (spannableStringBuilderLIZ.length() == spannableStringBuilder.length()) {
            CommentComboTrayWidget commentComboTrayWidget = (CommentComboTrayWidget) awS631S0100000_17.l0;
            C16F5 c16f5 = commentComboTrayWidget.LLILZLL;
            if (c16f5 != null) {
                c16f5.setText(commentComboTrayWidget.z1(spannableStringBuilder, (String) commentComboTrayWidget.LLJILJIL.getValue()));
            }
        } else {
            CommentComboTrayWidget commentComboTrayWidget2 = (CommentComboTrayWidget) awS631S0100000_17.l0;
            C16F5 c16f52 = commentComboTrayWidget2.LLILZLL;
            if (c16f52 != null) {
                c16f52.setText(commentComboTrayWidget2.z1(new SpannableStringBuilder(spannableStringBuilderLIZ).append((CharSequence) ((CommentComboTrayWidget) awS631S0100000_17.l0).LL), (String) commentComboTrayWidget2.LLJILJIL.getValue()));
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$47(AwS631S0100000_17 awS631S0100000_17, Object obj, Object obj2) {
        ((Function0) awS631S0100000_17.l0).invoke();
        return Unit.LIZ;
    }

    public static final Object invoke$48(AwS631S0100000_17 awS631S0100000_17, Object obj, Object obj2) {
        AbstractC1126600fQI<? extends AnonymousClass0054> abstractC1126600fQI;
        Integer num = (Integer) obj;
        C434980H3w c434980H3w = ((LiveNewGiftPanelWidget) awS631S0100000_17.l0).LLJ;
        if (c434980H3w != null) {
            int iIntValue = 0;
            if (num != null) {
                int iIntValue2 = num.intValue();
                ImageModel imageModel = null;
                if (iIntValue2 > 0 && c434980H3w.LLIZ.size() > iIntValue2 && (abstractC1126600fQI = c434980H3w.LLIZ.get(iIntValue2)) != null) {
                    C1125860fP6 c1125860fP6 = C1125820fP2.LJFF().LIZ;
                    C1125850fP5 c1125850fP5 = C1125820fP2.LJFF().LIZIZ;
                    boolean zLJII = C1125820fP2.LJII(Long.valueOf(abstractC1126600fQI.LJI()), null);
                    if (c1125860fP6 != null && zLJII) {
                        if (c1125850fP5 != null) {
                            imageModel = c1125850fP5.LIZ;
                        }
                        abstractC1126600fQI.LJIILLIIL = imageModel;
                    } else {
                        abstractC1126600fQI.LJIILLIIL = null;
                    }
                    C434980H3w c434980H3w2 = ((LiveNewGiftPanelWidget) awS631S0100000_17.l0).LLJ;
                    if (c434980H3w2 != null) {
                        if (num != null) {
                            iIntValue = num.intValue();
                        }
                        c434980H3w2.notifyItemChanged(iIntValue, "GIFT_ADAPTER_PAYLOAD_LEFT_ICON");
                    }
                }
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$5(AwS631S0100000_17 awS631S0100000_17, Object obj, Object obj2) {
        ((Boolean) obj2).booleanValue();
        ((C1114860f7M) ((AbstractC1114930f7T) awS631S0100000_17.l0)).LLILLJJLI.setText((SpannableStringBuilder) obj);
        return Unit.LIZ;
    }

    public static final Object invoke$6(AwS631S0100000_17 awS631S0100000_17, Object obj, Object obj2) {
        int i;
        GiftAnchorPanelSheetFragment giftAnchorPanelSheetFragment = (GiftAnchorPanelSheetFragment) awS631S0100000_17.l0;
        int i2 = C1146160fvq.LIZ[((EnumC1146170fvr) ((Pair) obj2).getFirst()).ordinal()];
        if (i2 != 1 && i2 != 2) {
            if (i2 == 3) {
                i = R.id.sze;
            } else {
                throw new C1954807lC();
            }
        } else if (LiveGiftAnchorPanelComposeSettings.INSTANCE.getEnable()) {
            i = -1;
        } else {
            i = R.id.izo;
        }
        LiveBottomSheetBehavior<View> liveBottomSheetBehavior = giftAnchorPanelSheetFragment.LLJILLL;
        if (liveBottomSheetBehavior != null) {
            liveBottomSheetBehavior.LJJIIZI = i;
            liveBottomSheetBehavior.LJFF();
        }
        return Unit.LIZ;
    }

    public static final Object invoke$7(AwS631S0100000_17 awS631S0100000_17, Object obj, Object obj2) {
        C1203140hPk c1203140hPk;
        Pair pair = (Pair) obj2;
        if (((List) pair.getFirst()).size() > 1) {
            Iterator it2 = ((List) pair.getFirst()).iterator();
            while (it2.hasNext()) {
                int i = C1146180fvs.LIZ[((EnumC1146170fvr) it2.next()).ordinal()];
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3) {
                            throw new C1954807lC();
                        }
                    } else {
                        c1203140hPk = new C1203140hPk(C497740JfY.LJIJI(2131852579), null, 14);
                    }
                } else {
                    c1203140hPk = new C1203140hPk(C497740JfY.LJIJI(2131852580), null, 14);
                }
                C1203130hPj c1203130hPj = ((GiftAnchorPanelCenterAssem) awS631S0100000_17.l0).LLJJIJI;
                if (c1203130hPj != null) {
                    C1203120hPi c1203120hPi = c1203130hPj.LL;
                    c1203120hPi.LLILLJJLI.add(c1203140hPk);
                    c1203120hPi.notifyItemInserted(C1697810uHb.LJIIJ(c1203120hPi.LLILLJJLI));
                }
            }
            C500260Jjc.LLFFF(((GiftAnchorPanelCenterAssem) awS631S0100000_17.l0).LLJJIJI);
            GiftAnchorPanelCenterAssem giftAnchorPanelCenterAssem = (GiftAnchorPanelCenterAssem) awS631S0100000_17.l0;
            giftAnchorPanelCenterAssem.LLJJIJIIJIL = true;
            C1203130hPj c1203130hPj2 = giftAnchorPanelCenterAssem.LLJJIJI;
            if (c1203130hPj2 != null) {
                c1203130hPj2.LIZ(((Number) pair.getSecond()).intValue(), true, C1203200hPq.LIZ);
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$8(AwS631S0100000_17 awS631S0100000_17, Object obj, Object obj2) {
        C1203130hPj c1203130hPj;
        Pair pair = (Pair) obj2;
        GiftAnchorPanelCenterAssem giftAnchorPanelCenterAssem = (GiftAnchorPanelCenterAssem) awS631S0100000_17.l0;
        if (giftAnchorPanelCenterAssem.LLJJIJIIJIL && (c1203130hPj = giftAnchorPanelCenterAssem.LLJJIJI) != null) {
            c1203130hPj.LIZ(((Number) pair.getSecond()).intValue(), true, C1203200hPq.LIZ);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$9(AwS631S0100000_17 awS631S0100000_17, Object obj, Object obj2) {
        int i;
        C1146360fwA c1146360fwA;
        RecyclerView.LayoutManager layoutManager;
        LinearLayoutManager linearLayoutManager;
        C20600815jK<InterfaceC1891350zJl> state;
        C1146350fw9 c1146350fw9;
        RecyclerView.LayoutManager layoutManager2;
        LinearLayoutManager linearLayoutManager2;
        C20600815jK<InterfaceC1891350zJl> state2;
        C1146350fw9 c1146350fw92;
        C20600815jK<InterfaceC1891350zJl> state3;
        AbstractC738140SxQ abstractC738140SxQ = (AbstractC738140SxQ) obj;
        C1146430fwH c1146430fwH = (C1146430fwH) obj2;
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv = ((GiftAnchorPanelGiftPageCenterAssem) awS631S0100000_17.l0).LLJJJIL;
        if (viewOnAttachStateChangeListenerC20604515jv != null && (state3 = viewOnAttachStateChangeListenerC20604515jv.getState()) != null) {
            LinkedList linkedList = new LinkedList();
            C1146360fwA c1146360fwA2 = c1146430fwH.LIZ;
            if (c1146360fwA2 != null) {
                linkedList.add(c1146360fwA2);
            }
            linkedList.addAll(c1146430fwH.LIZIZ);
            state3.LJIILL(linkedList, null);
        }
        C1133640fbe.LJIIL(8, ((GiftAnchorPanelGiftPageCenterAssem) awS631S0100000_17.l0).hp().LLILLL, Long.valueOf(SystemClock.uptimeMillis() - ((GiftAnchorPanelGiftPageCenterAssem) awS631S0100000_17.l0).hp().LLILZLL), null, 8);
        C1146350fw9 c1146350fw9LIZIZ = C1146440fwI.LIZIZ(c1146430fwH);
        if (c1146350fw9LIZIZ != null) {
            int i2 = C1146500fwO.LIZ[c1146430fwH.LIZJ.ordinal()];
            int i3 = 0;
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 != 3) {
                        throw new C1954807lC();
                    }
                } else {
                    ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv2 = ((GiftAnchorPanelGiftPageCenterAssem) awS631S0100000_17.l0).LLJJJIL;
                    if (viewOnAttachStateChangeListenerC20604515jv2 != null) {
                        layoutManager2 = viewOnAttachStateChangeListenerC20604515jv2.getLayoutManager();
                    } else {
                        layoutManager2 = null;
                    }
                    if ((layoutManager2 instanceof GridLayoutManager) && (linearLayoutManager2 = (LinearLayoutManager) layoutManager2) != null) {
                        GiftAnchorPanelGiftPageCenterAssem giftAnchorPanelGiftPageCenterAssem = (GiftAnchorPanelGiftPageCenterAssem) awS631S0100000_17.l0;
                        if (!c1146350fw9LIZIZ.LLJJIJI) {
                            ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv3 = giftAnchorPanelGiftPageCenterAssem.LLJJJIL;
                            if (viewOnAttachStateChangeListenerC20604515jv3 != null && (state2 = viewOnAttachStateChangeListenerC20604515jv3.getState()) != null) {
                                Iterator it2 = ((ArrayList) state2.LJII()).iterator();
                                i3 = 0;
                                while (true) {
                                    if (!it2.hasNext()) {
                                        break;
                                    }
                                    InterfaceC1891350zJl interfaceC1891350zJl = (InterfaceC1891350zJl) it2.next();
                                    if ((interfaceC1891350zJl instanceof C1146350fw9) && (c1146350fw92 = (C1146350fw9) interfaceC1891350zJl) != null && c1146350fw92.LL == c1146350fw9LIZIZ.LL) {
                                        if (i3 >= 0) {
                                        }
                                    } else {
                                        i3++;
                                    }
                                }
                            } else if (linearLayoutManager2.findLastCompletelyVisibleItemPosition() >= i3 && linearLayoutManager2.findFirstCompletelyVisibleItemPosition() <= i3) {
                                giftAnchorPanelGiftPageCenterAssem.kp("click");
                            } else {
                                giftAnchorPanelGiftPageCenterAssem.hp().LLILZIL.LIZ = true;
                                giftAnchorPanelGiftPageCenterAssem.lp(i3, new AwS561S0100000_17(giftAnchorPanelGiftPageCenterAssem, 152));
                            }
                        } else if (linearLayoutManager2.findFirstCompletelyVisibleItemPosition() != 0) {
                            giftAnchorPanelGiftPageCenterAssem.hp().LLILZIL.LIZ = true;
                            giftAnchorPanelGiftPageCenterAssem.lp(0, new AwS561S0100000_17(giftAnchorPanelGiftPageCenterAssem, 153));
                        } else {
                            giftAnchorPanelGiftPageCenterAssem.kp("click");
                        }
                    }
                }
            } else if (!c1146350fw9LIZIZ.LLJJIJI) {
                ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv4 = ((GiftAnchorPanelGiftPageCenterAssem) awS631S0100000_17.l0).LLJJJIL;
                if (viewOnAttachStateChangeListenerC20604515jv4 != null && (state = viewOnAttachStateChangeListenerC20604515jv4.getState()) != null) {
                    Iterator it3 = ((ArrayList) state.LJII()).iterator();
                    i = 0;
                    while (true) {
                        if (!it3.hasNext()) {
                            break;
                        }
                        InterfaceC1891350zJl interfaceC1891350zJl2 = (InterfaceC1891350zJl) it3.next();
                        if ((interfaceC1891350zJl2 instanceof C1146350fw9) && (c1146350fw9 = (C1146350fw9) interfaceC1891350zJl2) != null && c1146350fw9.LL == c1146350fw9LIZIZ.LL) {
                            if (i >= 0) {
                            }
                        } else {
                            i++;
                        }
                    }
                } else {
                    i = 0;
                }
                C1146360fwA c1146360fwA3 = c1146430fwH.LIZ;
                if (((c1146360fwA3 == null || !c1146360fwA3.LLILZLL.isEmpty()) && ((c1146360fwA = c1146430fwH.LIZ) == null || c1146360fwA.LLILZ != 3)) || 1 > i || i >= 5) {
                    ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv5 = ((GiftAnchorPanelGiftPageCenterAssem) awS631S0100000_17.l0).LLJJJIL;
                    if (viewOnAttachStateChangeListenerC20604515jv5 != null) {
                        layoutManager = viewOnAttachStateChangeListenerC20604515jv5.getLayoutManager();
                    } else {
                        layoutManager = null;
                    }
                    if ((layoutManager instanceof GridLayoutManager) && (linearLayoutManager = (LinearLayoutManager) layoutManager) != null) {
                        linearLayoutManager.scrollToPositionWithOffset(i, 0);
                    }
                }
            }
            IGiftAnchorPanelGiftPageBottomAbility iGiftAnchorPanelGiftPageBottomAbility = (IGiftAnchorPanelGiftPageBottomAbility) C1558520qew.LIZ(C1558520qew.LJIIL(abstractC738140SxQ), IGiftAnchorPanelGiftPageBottomAbility.class, null);
            if (iGiftAnchorPanelGiftPageBottomAbility != null) {
                iGiftAnchorPanelGiftPageBottomAbility.qC(c1146350fw9LIZIZ);
            }
        } else {
            IGiftAnchorPanelGiftPageBottomAbility iGiftAnchorPanelGiftPageBottomAbility2 = (IGiftAnchorPanelGiftPageBottomAbility) C1558520qew.LIZ(C1558520qew.LJIIL(abstractC738140SxQ), IGiftAnchorPanelGiftPageBottomAbility.class, null);
            if (iGiftAnchorPanelGiftPageBottomAbility2 != null) {
                iGiftAnchorPanelGiftPageBottomAbility2.rs2();
            }
        }
        return Unit.LIZ;
    }
}
