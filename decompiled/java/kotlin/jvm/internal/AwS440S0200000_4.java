package kotlin.jvm.internal;

import X.AbstractC329610Cw3;
import X.AbstractC848400XPy;
import X.C05P0;
import X.C09AY;
import X.C0C64;
import X.C0CZU;
import X.C0D6E;
import X.C0DZH;
import X.C0DZJ;
import X.C0DZZ;
import X.C0XQ7;
import X.C1112220f36;
import X.C13LP;
import X.C1671620tbM;
import X.C1675260thE;
import X.C1680510tph;
import X.C1680520tpi;
import X.C197039127h;
import X.C19EG;
import X.C20441214yg;
import X.C2188811AlT;
import X.C291001Au;
import X.C329660Cw8;
import X.C627660Ojc;
import X.C786410Ut5;
import X.EnumC308710C8f;
import X.EnumC776070UcP;
import X.EnumC776080UcQ;
import X.EnumC781860Ulk;
import X.InterfaceC1631620sYq;
import X.InterfaceC1680500tpg;
import X.InterfaceC1891350zJl;
import X.ViewOnAttachStateChangeListenerC20604515jv;
import Y.AObjectS531S0100000_17;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import androidx.compose.ui.platform.ComposeView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.broadcast.stablemode.ModuleDecision;
import com.bytedance.android.live.liveinteract.multiguestv3.main.userinfo.common.matchentry.GuestMatchEntryViewModel;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.android.livesdk.livesetting.subscription.LiveSubscriptionQuestionnaireHourFrequencySetting;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.commercialize.ucp.impl.data.ordersv2.OrderSnapshotV2;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.live.livehostimpl.livereply.autopost.PostedListFragment;
import com.ss.android.ugc.aweme.live.livehostimpl.livereply.highlight.LiveHighLightPageFragment;
import com.ss.android.ugc.aweme.mention.ui.page.VideoCaptionMentionPanel;
import com.ss.android.ugc.aweme.ogc.news.managetopics.cell.SeekBarCell;
import com.ss.android.ugc.aweme.poi.reviews.PoiReviewsApi;
import com.ss.android.ugc.aweme.poi.reviews.landing.ui.PoiReviewsContentAssem;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.prop.draft.EffectDraftDetailAssem;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.reviewaggregation.ui.SearchProsConsTabFragment;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.reviewaggregation.vm.SearchProsConsTabAssemViewModel;
import com.ss.android.ugc.aweme.social.thought.ui.aggregated.SocialThoughtAggregatedPanelFragment;
import com.ss.android.ugc.aweme.social.thought.view.IThoughtBubblePromptResolver;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public class AwS440S0200000_4 extends C09AY implements Function2 {
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
            default:
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS440S0200000_4(EnumC776070UcP enumC776070UcP, AObjectS531S0100000_17 aObjectS531S0100000_17, int i) {
        super(2);
        this.$t = i;
        this.l0 = enumC776070UcP;
        this.l1 = aObjectS531S0100000_17;
    }

    public static final Object invoke$0(AwS440S0200000_4 awS440S0200000_4, Object obj, Object obj2) {
        boolean z;
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        Integer numLIZIZ = C0CZU.LIZIZ((ModuleDecision) obj2, ((EnumC776070UcP) awS440S0200000_4.l0).getFeatureName());
        Function2 function2 = (Function2) awS440S0200000_4.l1;
        int iIntValue = 0;
        if (zBooleanValue && numLIZIZ != null) {
            z = true;
        } else {
            z = false;
        }
        Boolean boolValueOf = Boolean.valueOf(z);
        if (numLIZIZ != null) {
            iIntValue = numLIZIZ.intValue();
        }
        function2.invoke(boolValueOf, Integer.valueOf(iIntValue));
        return Unit.LIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0085  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$1(kotlin.jvm.internal.AwS440S0200000_4 r7, java.lang.Object r8, java.lang.Object r9) {
        /*
            X.0tpg r8 = (X.InterfaceC1680500tpg) r8
            java.lang.Number r9 = (java.lang.Number) r9
            int r0 = r9.intValue()
            r1 = r0 & 3
            r0 = 2
            if (r1 != r0) goto L19
            boolean r0 = r8.LIZ()
            if (r0 == 0) goto L19
            r8.LIZJ()
        L16:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L19:
            java.lang.Object r1 = r7.l0
            androidx.compose.ui.platform.ComposeView r1 = (androidx.compose.ui.platform.ComposeView) r1
            X.13iq r0 = X.C20088213iq.LIZIZ
            r1.setViewCompositionStrategy(r0)
            java.lang.Object r0 = r7.l1
            com.bytedance.android.live.liveinteract.multiguestv3.main.userinfo.common.matchentry.GuestMatchEntryViewModel r0 = (com.bytedance.android.live.liveinteract.multiguestv3.main.userinfo.common.matchentry.GuestMatchEntryViewModel) r0
            X.0951 r0 = r0.LLILLL
            r4 = 0
            X.05P0 r6 = X.C20028913Yh.LIZIZ(r0, r8, r4)
            kotlin.Unit r3 = kotlin.Unit.LIZ
            r5 = 5004770(0x4c5de2, float:7.013177E-39)
            r8.LJJIIJZLJL(r5)
            java.lang.Object r0 = r7.l1
            com.bytedance.android.live.liveinteract.multiguestv3.main.userinfo.common.matchentry.GuestMatchEntryViewModel r0 = (com.bytedance.android.live.liveinteract.multiguestv3.main.userinfo.common.matchentry.GuestMatchEntryViewModel) r0
            boolean r0 = r8.LJII(r0)
            java.lang.Object r2 = r7.l1
            com.bytedance.android.live.liveinteract.multiguestv3.main.userinfo.common.matchentry.GuestMatchEntryViewModel r2 = (com.bytedance.android.live.liveinteract.multiguestv3.main.userinfo.common.matchentry.GuestMatchEntryViewModel) r2
            java.lang.Object r1 = r8.LJJ()
            if (r0 != 0) goto L50
            X.0tph r0 = X.InterfaceC1680500tpg.LIZ
            r0.getClass()
            X.0tpi r0 = X.C1680510tph.LIZIZ
            if (r1 != r0) goto L59
        L50:
            X.0CY9 r1 = new X.0CY9
            r0 = 0
            r1.<init>(r2, r0)
            r8.LJJIJIIJI(r1)
        L59:
            kotlin.jvm.functions.Function2 r1 = (kotlin.jvm.functions.Function2) r1
            r8.LJ()
            X.C1680540tpk.LJFF(r3, r1, r8)
            java.lang.Object r3 = r6.getValue()
            X.0Cfi r3 = (X.C319480Cfi) r3
            r8.LJJIIJZLJL(r5)
            java.lang.Object r0 = r7.l1
            com.bytedance.android.live.liveinteract.multiguestv3.main.userinfo.common.matchentry.GuestMatchEntryViewModel r0 = (com.bytedance.android.live.liveinteract.multiguestv3.main.userinfo.common.matchentry.GuestMatchEntryViewModel) r0
            boolean r0 = r8.LJII(r0)
            java.lang.Object r2 = r7.l1
            com.bytedance.android.live.liveinteract.multiguestv3.main.userinfo.common.matchentry.GuestMatchEntryViewModel r2 = (com.bytedance.android.live.liveinteract.multiguestv3.main.userinfo.common.matchentry.GuestMatchEntryViewModel) r2
            java.lang.Object r1 = r8.LJJ()
            if (r0 != 0) goto L85
            X.0tph r0 = X.InterfaceC1680500tpg.LIZ
            r0.getClass()
            X.0tpi r0 = X.C1680510tph.LIZIZ
            if (r1 != r0) goto L8f
        L85:
            kotlin.jvm.internal.AwS583S0100000_4 r1 = new kotlin.jvm.internal.AwS583S0100000_4
            r0 = 13
            r1.<init>(r2, r0)
            r8.LJJIJIIJI(r1)
        L8f:
            kotlin.jvm.functions.Function1 r1 = (kotlin.jvm.functions.Function1) r1
            r8.LJ()
            X.C1667300tUO.LIZ(r3, r1, r8, r4)
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS440S0200000_4.invoke$1(kotlin.jvm.internal.AwS440S0200000_4, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0097  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$10(kotlin.jvm.internal.AwS440S0200000_4 r10, java.lang.Object r11, java.lang.Object r12) {
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
            r0 = 2131851295(0x7f11781f, float:1.9336176E38)
            java.lang.String r7 = X.C0MBB.LIZIZ(r0, r6)
            r9 = 1
            r3 = -1633490746(0xffffffff9ea2e8c6, float:-1.724869E-20)
            r6.LJJIIJZLJL(r3)
            java.lang.Object r0 = r10.l0
            com.ss.android.ugc.aweme.live.livehostimpl.livereply.autopost.PostedListFragment r0 = (com.ss.android.ugc.aweme.live.livehostimpl.livereply.autopost.PostedListFragment) r0
            boolean r4 = r6.LJII(r0)
            java.lang.Object r0 = r10.l1
            kotlin.jvm.functions.Function0 r0 = (kotlin.jvm.functions.Function0) r0
            boolean r0 = r6.LJJIIJ(r0)
            r4 = r4 | r0
            java.lang.Object r2 = r10.l0
            com.ss.android.ugc.aweme.live.livehostimpl.livereply.autopost.PostedListFragment r2 = (com.ss.android.ugc.aweme.live.livehostimpl.livereply.autopost.PostedListFragment) r2
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
            r0 = 14
            r8.<init>(r2, r1, r0)
            r6.LJJIJIIJI(r8)
        L5a:
            kotlin.jvm.functions.Function0 r8 = (kotlin.jvm.functions.Function0) r8
            r6.LJ()
            r4 = 48
            r5 = 0
            X.C1668330tW3.LJII(r4, r5, r6, r7, r8, r9)
            r0 = 2131851305(0x7f117829, float:1.9336197E38)
            java.lang.String r7 = X.C0MBB.LIZIZ(r0, r6)
            r6.LJJIIJZLJL(r3)
            java.lang.Object r0 = r10.l0
            com.ss.android.ugc.aweme.live.livehostimpl.livereply.autopost.PostedListFragment r0 = (com.ss.android.ugc.aweme.live.livehostimpl.livereply.autopost.PostedListFragment) r0
            boolean r3 = r6.LJII(r0)
            java.lang.Object r0 = r10.l1
            kotlin.jvm.functions.Function0 r0 = (kotlin.jvm.functions.Function0) r0
            boolean r0 = r6.LJJIIJ(r0)
            r3 = r3 | r0
            java.lang.Object r2 = r10.l0
            com.ss.android.ugc.aweme.live.livehostimpl.livereply.autopost.PostedListFragment r2 = (com.ss.android.ugc.aweme.live.livehostimpl.livereply.autopost.PostedListFragment) r2
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
            r0 = 15
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
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS440S0200000_4.invoke$10(kotlin.jvm.internal.AwS440S0200000_4, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    public static final Object invoke$11(AwS440S0200000_4 awS440S0200000_4, Object obj, Object obj2) {
        boolean z;
        long jLongValue;
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        Long lLIZJ = C0CZU.LIZJ((ModuleDecision) obj2, ((EnumC776070UcP) awS440S0200000_4.l0).getFeatureName());
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("subscribeOnlineCountIntervalIncrease, downgrade:");
        sbLIZ.append(zBooleanValue);
        sbLIZ.append(", interval:");
        sbLIZ.append(lLIZJ);
        C20441214yg.LIZIZ("LiveAnchorRankDowngrade", C2188811AlT.LIZIZ(sbLIZ));
        Function2 function2 = (Function2) awS440S0200000_4.l1;
        if (zBooleanValue && lLIZJ != null) {
            z = true;
        } else {
            z = false;
        }
        Boolean boolValueOf = Boolean.valueOf(z);
        if (lLIZJ != null) {
            jLongValue = lLIZJ.longValue();
        } else {
            jLongValue = 0;
        }
        function2.invoke(boolValueOf, Long.valueOf(jLongValue));
        return Unit.LIZ;
    }

    public static final Object invoke$12(AwS440S0200000_4 awS440S0200000_4, Object obj, Object obj2) {
        boolean z;
        long jLongValue;
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        Long lLIZJ = C0CZU.LIZJ((ModuleDecision) obj2, ((EnumC781860Ulk) awS440S0200000_4.l0).getFeatureName());
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("subscribeRankBannerSwitchIntervalIncrease, downgrade:");
        sbLIZ.append(zBooleanValue);
        sbLIZ.append(", interval:");
        sbLIZ.append(lLIZJ);
        C20441214yg.LIZIZ("LiveAnchorRankDowngrade", C2188811AlT.LIZIZ(sbLIZ));
        Function2 function2 = (Function2) awS440S0200000_4.l1;
        if (zBooleanValue && lLIZJ != null) {
            z = true;
        } else {
            z = false;
        }
        Boolean boolValueOf = Boolean.valueOf(z);
        if (lLIZJ != null) {
            jLongValue = lLIZJ.longValue();
        } else {
            jLongValue = 0;
        }
        function2.invoke(boolValueOf, Long.valueOf(jLongValue * 1000));
        return Unit.LIZ;
    }

    public static final Object invoke$13(AwS440S0200000_4 awS440S0200000_4, Object obj, Object obj2) {
        boolean z;
        long jLongValue;
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        Long lLIZJ = C0CZU.LIZJ((ModuleDecision) obj2, ((EnumC776070UcP) awS440S0200000_4.l0).getFeatureName());
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("subscribeOnlineLikeCountIntervalIncrease, isDowngrade: ");
        sbLIZ.append(zBooleanValue);
        sbLIZ.append(", interval: ");
        sbLIZ.append(lLIZJ);
        C20441214yg.LIZIZ("LiveAnchorRoomFunctionDowngrade", C2188811AlT.LIZIZ(sbLIZ));
        Function2 function2 = (Function2) awS440S0200000_4.l1;
        if (zBooleanValue && lLIZJ != null) {
            z = true;
        } else {
            z = false;
        }
        Boolean boolValueOf = Boolean.valueOf(z);
        if (lLIZJ != null) {
            jLongValue = lLIZJ.longValue();
        } else {
            jLongValue = 0;
        }
        function2.invoke(boolValueOf, Long.valueOf(jLongValue));
        return Unit.LIZ;
    }

    public static final Object invoke$14(AwS440S0200000_4 awS440S0200000_4, Object obj, Object obj2) {
        boolean z;
        float fFloatValue;
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("subscribeMessageQueueLengthReduce, isDowngrade: ");
        sbLIZ.append(zBooleanValue);
        C20441214yg.LIZIZ("LiveAnchorPublicScreenDowngrade", C2188811AlT.LIZIZ(sbLIZ));
        Float fLIZ = C0CZU.LIZ((ModuleDecision) obj2, ((EnumC776080UcQ) awS440S0200000_4.l0).getFeatureName());
        Function2 function2 = (Function2) awS440S0200000_4.l1;
        if (zBooleanValue && fLIZ != null) {
            z = true;
        } else {
            z = false;
        }
        Boolean boolValueOf = Boolean.valueOf(z);
        if (fLIZ != null) {
            fFloatValue = fLIZ.floatValue();
        } else {
            fFloatValue = 1.0f;
        }
        function2.invoke(boolValueOf, Float.valueOf(fFloatValue));
        return Unit.LIZ;
    }

    public static final Object invoke$15(AwS440S0200000_4 awS440S0200000_4, Object obj, Object obj2) {
        Object obj3;
        Object obj4;
        Float fValueOf;
        Object obj5;
        Object obj6;
        boolean z;
        float fFloatValue;
        Number number;
        Map map;
        Number number2;
        Map map2;
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        ModuleDecision moduleDecision = (ModuleDecision) obj2;
        String featureName = ((EnumC776080UcQ) awS440S0200000_4.l0).getFeatureName();
        String key = EnumC308710C8f.QPS_RATIO.getKey();
        Map<String, Object> map3 = moduleDecision.featureParams;
        Integer numValueOf = null;
        if (map3 != null) {
            obj3 = map3.get(featureName);
        } else {
            obj3 = null;
        }
        if ((obj3 instanceof Map) && (map2 = (Map) obj3) != null) {
            obj4 = map2.get(key);
        } else {
            obj4 = null;
        }
        if ((obj4 instanceof Number) && (number2 = (Number) obj4) != null) {
            fValueOf = Float.valueOf(number2.floatValue());
        } else {
            fValueOf = null;
        }
        String featureName2 = ((EnumC776080UcQ) awS440S0200000_4.l0).getFeatureName();
        String key2 = EnumC308710C8f.REFRESH_INTERVAL.getKey();
        Map<String, Object> map4 = moduleDecision.featureParams;
        if (map4 != null) {
            obj5 = map4.get(featureName2);
        } else {
            obj5 = null;
        }
        if ((obj5 instanceof Map) && (map = (Map) obj5) != null) {
            obj6 = map.get(key2);
        } else {
            obj6 = null;
        }
        if ((obj6 instanceof Number) && (number = (Number) obj6) != null) {
            numValueOf = Integer.valueOf(number.intValue());
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("subscribeRefreshIntervalIncrease, isDowngrade: ");
        sbLIZ.append(zBooleanValue);
        sbLIZ.append(", qpsRatio: ");
        sbLIZ.append(fValueOf);
        sbLIZ.append(", interval: ");
        sbLIZ.append(numValueOf);
        C20441214yg.LIZIZ("LiveAnchorPublicScreenDowngrade", C2188811AlT.LIZIZ(sbLIZ));
        InterfaceC1631620sYq interfaceC1631620sYq = (InterfaceC1631620sYq) awS440S0200000_4.l1;
        int iIntValue = 0;
        if (zBooleanValue && fValueOf != null && numValueOf != null) {
            z = true;
        } else {
            z = false;
        }
        Boolean boolValueOf = Boolean.valueOf(z);
        if (fValueOf != null) {
            fFloatValue = fValueOf.floatValue();
        } else {
            fFloatValue = 0.0f;
        }
        Float fValueOf2 = Float.valueOf(fFloatValue);
        if (numValueOf != null) {
            iIntValue = numValueOf.intValue();
        }
        interfaceC1631620sYq.invoke(boolValueOf, fValueOf2, Integer.valueOf(iIntValue));
        return Unit.LIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x008d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$16(kotlin.jvm.internal.AwS440S0200000_4 r8, java.lang.Object r9, java.lang.Object r10) {
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
            r0 = 2131835118(0x7f1138ee, float:1.9303366E38)
            java.lang.String r5 = X.C0MBB.LIZIZ(r0, r4)
            r7 = 1
            r0 = -1633490746(0xffffffff9ea2e8c6, float:-1.724869E-20)
            r4.LJJIIJZLJL(r0)
            java.lang.Object r0 = r8.l0
            android.content.Context r0 = (android.content.Context) r0
            boolean r3 = r4.LJII(r0)
            java.lang.Object r0 = r8.l1
            kotlin.jvm.functions.Function0 r0 = (kotlin.jvm.functions.Function0) r0
            boolean r0 = r4.LJJIIJ(r0)
            r3 = r3 | r0
            java.lang.Object r2 = r8.l0
            android.content.Context r2 = (android.content.Context) r2
            java.lang.Object r1 = r8.l1
            kotlin.jvm.functions.Function0 r1 = (kotlin.jvm.functions.Function0) r1
            java.lang.Object r6 = r4.LJJ()
            if (r3 != 0) goto L50
            X.0tph r0 = X.InterfaceC1680500tpg.LIZ
            r0.getClass()
            X.0tpi r0 = X.C1680510tph.LIZIZ
            if (r6 != r0) goto L5a
        L50:
            kotlin.jvm.internal.AwS407S0200000_6 r6 = new kotlin.jvm.internal.AwS407S0200000_6
            r0 = 57
            r6.<init>(r2, r1, r0)
            r4.LJJIJIIJI(r6)
        L5a:
            kotlin.jvm.functions.Function0 r6 = (kotlin.jvm.functions.Function0) r6
            r4.LJ()
            r2 = 48
            r3 = 0
            X.C1668330tW3.LJIIIIZZ(r2, r3, r4, r5, r6, r7)
            r0 = 2131828338(0x7f111e72, float:1.9289614E38)
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
            kotlin.jvm.internal.AwS548S0100000_4 r6 = new kotlin.jvm.internal.AwS548S0100000_4
            r0 = 454(0x1c6, float:6.36E-43)
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
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS440S0200000_4.invoke$16(kotlin.jvm.internal.AwS440S0200000_4, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    public static final Object invoke$17(AwS440S0200000_4 awS440S0200000_4, Object obj, Object obj2) {
        InterfaceC1891350zJl interfaceC1891350zJl;
        String reviewId;
        RecyclerView.LayoutManager layoutManager;
        PoiReviewsApi.PoiReviewModel poiReviewModel;
        Object next;
        List<ITEM> list = ((C627660Ojc) obj2).LLILZ;
        String reviewId2 = null;
        if (list != 0) {
            Iterator it2 = list.iterator();
            while (true) {
                if (it2.hasNext()) {
                    next = it2.next();
                    if (next instanceof PoiReviewsApi.PoiReviewModel) {
                        break;
                    }
                } else {
                    next = null;
                    break;
                }
            }
            interfaceC1891350zJl = (InterfaceC1891350zJl) next;
        } else {
            interfaceC1891350zJl = null;
        }
        if ((interfaceC1891350zJl instanceof PoiReviewsApi.PoiReviewModel) && (poiReviewModel = (PoiReviewsApi.PoiReviewModel) interfaceC1891350zJl) != null) {
            reviewId = poiReviewModel.getReviewId();
        } else {
            reviewId = null;
        }
        PoiReviewsApi.PoiReviewModel poiReviewModel2 = (PoiReviewsApi.PoiReviewModel) awS440S0200000_4.l0;
        if (poiReviewModel2 != null) {
            reviewId2 = poiReviewModel2.getReviewId();
        }
        if (Intrinsics.LJFF(reviewId, reviewId2) && (layoutManager = ((PoiReviewsContentAssem) awS440S0200000_4.l1).Go().getLayoutManager()) != null && (layoutManager instanceof LinearLayoutManager)) {
            ((LinearLayoutManager) layoutManager).scrollToPositionWithOffset(0, 0);
        }
        return Unit.LIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x008d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$18(kotlin.jvm.internal.AwS440S0200000_4 r8, java.lang.Object r9, java.lang.Object r10) {
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
            r0 = 2131849663(0x7f1171bf, float:1.9332866E38)
            java.lang.String r5 = X.C0MBB.LIZIZ(r0, r4)
            r7 = 1
            r0 = -1633490746(0xffffffff9ea2e8c6, float:-1.724869E-20)
            r4.LJJIIJZLJL(r0)
            java.lang.Object r0 = r8.l0
            android.content.Context r0 = (android.content.Context) r0
            boolean r3 = r4.LJII(r0)
            java.lang.Object r0 = r8.l1
            kotlin.jvm.functions.Function0 r0 = (kotlin.jvm.functions.Function0) r0
            boolean r0 = r4.LJJIIJ(r0)
            r3 = r3 | r0
            java.lang.Object r2 = r8.l0
            android.content.Context r2 = (android.content.Context) r2
            java.lang.Object r1 = r8.l1
            kotlin.jvm.functions.Function0 r1 = (kotlin.jvm.functions.Function0) r1
            java.lang.Object r6 = r4.LJJ()
            if (r3 != 0) goto L50
            X.0tph r0 = X.InterfaceC1680500tpg.LIZ
            r0.getClass()
            X.0tpi r0 = X.C1680510tph.LIZIZ
            if (r6 != r0) goto L5a
        L50:
            kotlin.jvm.internal.AwS407S0200000_6 r6 = new kotlin.jvm.internal.AwS407S0200000_6
            r0 = 70
            r6.<init>(r2, r1, r0)
            r4.LJJIJIIJI(r6)
        L5a:
            kotlin.jvm.functions.Function0 r6 = (kotlin.jvm.functions.Function0) r6
            r4.LJ()
            r2 = 48
            r3 = 0
            X.C1668330tW3.LJIIIIZZ(r2, r3, r4, r5, r6, r7)
            r0 = 2131849664(0x7f1171c0, float:1.9332868E38)
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
            kotlin.jvm.internal.AwS548S0100000_4 r6 = new kotlin.jvm.internal.AwS548S0100000_4
            r0 = 466(0x1d2, float:6.53E-43)
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
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS440S0200000_4.invoke$18(kotlin.jvm.internal.AwS440S0200000_4, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x008d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$19(kotlin.jvm.internal.AwS440S0200000_4 r8, java.lang.Object r9, java.lang.Object r10) {
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
            r0 = 2131849659(0x7f1171bb, float:1.9332858E38)
            java.lang.String r5 = X.C0MBB.LIZIZ(r0, r4)
            r7 = 1
            r0 = -1633490746(0xffffffff9ea2e8c6, float:-1.724869E-20)
            r4.LJJIIJZLJL(r0)
            java.lang.Object r0 = r8.l0
            android.content.Context r0 = (android.content.Context) r0
            boolean r3 = r4.LJII(r0)
            java.lang.Object r0 = r8.l1
            kotlin.jvm.functions.Function0 r0 = (kotlin.jvm.functions.Function0) r0
            boolean r0 = r4.LJJIIJ(r0)
            r3 = r3 | r0
            java.lang.Object r2 = r8.l0
            android.content.Context r2 = (android.content.Context) r2
            java.lang.Object r1 = r8.l1
            kotlin.jvm.functions.Function0 r1 = (kotlin.jvm.functions.Function0) r1
            java.lang.Object r6 = r4.LJJ()
            if (r3 != 0) goto L50
            X.0tph r0 = X.InterfaceC1680500tpg.LIZ
            r0.getClass()
            X.0tpi r0 = X.C1680510tph.LIZIZ
            if (r6 != r0) goto L5a
        L50:
            kotlin.jvm.internal.AwS407S0200000_6 r6 = new kotlin.jvm.internal.AwS407S0200000_6
            r0 = 72
            r6.<init>(r2, r1, r0)
            r4.LJJIJIIJI(r6)
        L5a:
            kotlin.jvm.functions.Function0 r6 = (kotlin.jvm.functions.Function0) r6
            r4.LJ()
            r2 = 48
            r3 = 0
            X.C1668330tW3.LJIIIIZZ(r2, r3, r4, r5, r6, r7)
            r0 = 2131849660(0x7f1171bc, float:1.933286E38)
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
            kotlin.jvm.internal.AwS548S0100000_4 r6 = new kotlin.jvm.internal.AwS548S0100000_4
            r0 = 467(0x1d3, float:6.54E-43)
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
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS440S0200000_4.invoke$19(kotlin.jvm.internal.AwS440S0200000_4, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object invoke$2(AwS440S0200000_4 awS440S0200000_4, Object obj, Object obj2) {
        Bundle arguments;
        C19EG activity;
        C291001Au c291001Au = (C291001Au) obj2;
        if (c291001Au != null && ((Boolean) c291001Au.LIZ).booleanValue() && (arguments = ((VideoCaptionMentionPanel) awS440S0200000_4.l0).getArguments()) != null && arguments.getBoolean("finish_activity_when_mention_risk", false) && (activity = ((VideoCaptionMentionPanel) awS440S0200000_4.l0).getActivity()) != null) {
            HandlerHook.viewPostDelay((View) awS440S0200000_4.l1, new Runnable() { // from class: X.0CbB
                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("VideoCaptionMentionPanel@9300.onViewCreated$2$1$1");
                    try {
                        Activity activityLJFF = C2214201BlK.LJFF();
                        if (activityLJFF != null) {
                            C1389890mGx c1389890mGx = new C1389890mGx(activityLJFF);
                            c1389890mGx.LJIIJ(C20612915lH.LIZIZ.LJIIIIZZ().LIZLLL());
                            c1389890mGx.LJIIJJI();
                        }
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("VideoCaptionMentionPanel@9300.onViewCreated$2$1$1");
                }
            }, 100L);
            activity.finish();
        }
        return Unit.LIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0097  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$20(kotlin.jvm.internal.AwS440S0200000_4 r10, java.lang.Object r11, java.lang.Object r12) {
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
            r0 = 2131820916(0x7f110174, float:1.927456E38)
            java.lang.String r7 = X.C0MBB.LIZIZ(r0, r6)
            r9 = 1
            r3 = -1633490746(0xffffffff9ea2e8c6, float:-1.724869E-20)
            r6.LJJIIJZLJL(r3)
            java.lang.Object r0 = r10.l0
            com.ss.android.ugc.aweme.prop.draft.EffectDraftDetailAssem r0 = (com.ss.android.ugc.aweme.prop.draft.EffectDraftDetailAssem) r0
            boolean r4 = r6.LJII(r0)
            java.lang.Object r0 = r10.l1
            kotlin.jvm.functions.Function0 r0 = (kotlin.jvm.functions.Function0) r0
            boolean r0 = r6.LJJIIJ(r0)
            r4 = r4 | r0
            java.lang.Object r2 = r10.l0
            com.ss.android.ugc.aweme.prop.draft.EffectDraftDetailAssem r2 = (com.ss.android.ugc.aweme.prop.draft.EffectDraftDetailAssem) r2
            java.lang.Object r1 = r10.l1
            kotlin.jvm.functions.Function0 r1 = (kotlin.jvm.functions.Function0) r1
            java.lang.Object r8 = r6.LJJ()
            if (r4 != 0) goto L50
            X.0tph r0 = X.InterfaceC1680500tpg.LIZ
            r0.getClass()
            X.0tpi r0 = X.C1680510tph.LIZIZ
            if (r8 != r0) goto L5a
        L50:
            kotlin.jvm.internal.AwS405S0200000_4 r8 = new kotlin.jvm.internal.AwS405S0200000_4
            r0 = 39
            r8.<init>(r2, r1, r0)
            r6.LJJIJIIJI(r8)
        L5a:
            kotlin.jvm.functions.Function0 r8 = (kotlin.jvm.functions.Function0) r8
            r6.LJ()
            r4 = 48
            r5 = 0
            X.C1668330tW3.LJII(r4, r5, r6, r7, r8, r9)
            r0 = 2131820918(0x7f110176, float:1.9274565E38)
            java.lang.String r7 = X.C0MBB.LIZIZ(r0, r6)
            r6.LJJIIJZLJL(r3)
            java.lang.Object r0 = r10.l0
            com.ss.android.ugc.aweme.prop.draft.EffectDraftDetailAssem r0 = (com.ss.android.ugc.aweme.prop.draft.EffectDraftDetailAssem) r0
            boolean r3 = r6.LJII(r0)
            java.lang.Object r0 = r10.l1
            kotlin.jvm.functions.Function0 r0 = (kotlin.jvm.functions.Function0) r0
            boolean r0 = r6.LJJIIJ(r0)
            r3 = r3 | r0
            java.lang.Object r2 = r10.l0
            com.ss.android.ugc.aweme.prop.draft.EffectDraftDetailAssem r2 = (com.ss.android.ugc.aweme.prop.draft.EffectDraftDetailAssem) r2
            java.lang.Object r1 = r10.l1
            kotlin.jvm.functions.Function0 r1 = (kotlin.jvm.functions.Function0) r1
            java.lang.Object r8 = r6.LJJ()
            if (r3 != 0) goto L97
            X.0tph r0 = X.InterfaceC1680500tpg.LIZ
            r0.getClass()
            X.0tpi r0 = X.C1680510tph.LIZIZ
            if (r8 != r0) goto La1
        L97:
            kotlin.jvm.internal.AwS405S0200000_4 r8 = new kotlin.jvm.internal.AwS405S0200000_4
            r0 = 40
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
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS440S0200000_4.invoke$20(kotlin.jvm.internal.AwS440S0200000_4, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0047  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$21(kotlin.jvm.internal.AwS440S0200000_4 r4, java.lang.Object r5, java.lang.Object r6) {
        /*
            r2 = r5
            X.0tpg r2 = (X.InterfaceC1680500tpg) r2
            java.lang.Number r6 = (java.lang.Number) r6
            int r0 = r6.intValue()
            r1 = r0 & 3
            r0 = 2
            if (r1 != r0) goto L1a
            boolean r0 = r2.LIZ()
            if (r0 == 0) goto L1a
            r2.LIZJ()
        L17:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L1a:
            java.lang.Object r1 = r4.l0
            android.app.Activity r1 = (android.app.Activity) r1
            r0 = 2131839105(0x7f114881, float:1.9311452E38)
            java.lang.String r3 = r1.getString(r0)
            r5 = 1
            r0 = 5004770(0x4c5de2, float:7.013177E-39)
            r2.LJJIIJZLJL(r0)
            java.lang.Object r0 = r4.l1
            kotlin.jvm.functions.Function0 r0 = (kotlin.jvm.functions.Function0) r0
            boolean r0 = r2.LJJIIJ(r0)
            java.lang.Object r1 = r4.l1
            kotlin.jvm.functions.Function0 r1 = (kotlin.jvm.functions.Function0) r1
            java.lang.Object r4 = r2.LJJ()
            if (r0 != 0) goto L47
            X.0tph r0 = X.InterfaceC1680500tpg.LIZ
            r0.getClass()
            X.0tpi r0 = X.C1680510tph.LIZIZ
            if (r4 != r0) goto L51
        L47:
            kotlin.jvm.internal.AwS548S0100000_4 r4 = new kotlin.jvm.internal.AwS548S0100000_4
            r0 = 471(0x1d7, float:6.6E-43)
            r4.<init>(r1, r0)
            r2.LJJIJIIJI(r4)
        L51:
            kotlin.jvm.functions.Function0 r4 = (kotlin.jvm.functions.Function0) r4
            r2.LJ()
            r0 = 48
            r1 = 0
            X.C1668330tW3.LJIIIIZZ(r0, r1, r2, r3, r4, r5)
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS440S0200000_4.invoke$21(kotlin.jvm.internal.AwS440S0200000_4, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0047  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$22(kotlin.jvm.internal.AwS440S0200000_4 r4, java.lang.Object r5, java.lang.Object r6) {
        /*
            r2 = r5
            X.0tpg r2 = (X.InterfaceC1680500tpg) r2
            java.lang.Number r6 = (java.lang.Number) r6
            int r0 = r6.intValue()
            r1 = r0 & 3
            r0 = 2
            if (r1 != r0) goto L1a
            boolean r0 = r2.LIZ()
            if (r0 == 0) goto L1a
            r2.LIZJ()
        L17:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L1a:
            java.lang.Object r1 = r4.l0
            android.app.Activity r1 = (android.app.Activity) r1
            r0 = 2131839103(0x7f11487f, float:1.9311448E38)
            java.lang.String r3 = r1.getString(r0)
            r5 = 1
            r0 = 5004770(0x4c5de2, float:7.013177E-39)
            r2.LJJIIJZLJL(r0)
            java.lang.Object r0 = r4.l1
            kotlin.jvm.functions.Function0 r0 = (kotlin.jvm.functions.Function0) r0
            boolean r0 = r2.LJJIIJ(r0)
            java.lang.Object r1 = r4.l1
            kotlin.jvm.functions.Function0 r1 = (kotlin.jvm.functions.Function0) r1
            java.lang.Object r4 = r2.LJJ()
            if (r0 != 0) goto L47
            X.0tph r0 = X.InterfaceC1680500tpg.LIZ
            r0.getClass()
            X.0tpi r0 = X.C1680510tph.LIZIZ
            if (r4 != r0) goto L51
        L47:
            kotlin.jvm.internal.AwS548S0100000_4 r4 = new kotlin.jvm.internal.AwS548S0100000_4
            r0 = 472(0x1d8, float:6.61E-43)
            r4.<init>(r1, r0)
            r2.LJJIJIIJI(r4)
        L51:
            kotlin.jvm.functions.Function0 r4 = (kotlin.jvm.functions.Function0) r4
            r2.LJ()
            r0 = 48
            r1 = 0
            X.C1668330tW3.LJIIIIZZ(r0, r1, r2, r3, r4, r5)
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS440S0200000_4.invoke$22(kotlin.jvm.internal.AwS440S0200000_4, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0095  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$23(kotlin.jvm.internal.AwS440S0200000_4 r8, java.lang.Object r9, java.lang.Object r10) {
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
            java.lang.Object r1 = r8.l0
            com.ss.android.ugc.aweme.live.livehostimpl.livereply.highlight.LiveHighLightPageFragment r1 = (com.ss.android.ugc.aweme.live.livehostimpl.livereply.highlight.LiveHighLightPageFragment) r1
            r0 = 2131855644(0x7f11891c, float:1.9344997E38)
            java.lang.String r5 = r1.getString(r0)
            r7 = 1
            r0 = -1633490746(0xffffffff9ea2e8c6, float:-1.724869E-20)
            r4.LJJIIJZLJL(r0)
            java.lang.Object r0 = r8.l0
            com.ss.android.ugc.aweme.live.livehostimpl.livereply.highlight.LiveHighLightPageFragment r0 = (com.ss.android.ugc.aweme.live.livehostimpl.livereply.highlight.LiveHighLightPageFragment) r0
            boolean r3 = r4.LJII(r0)
            java.lang.Object r0 = r8.l1
            kotlin.jvm.functions.Function0 r0 = (kotlin.jvm.functions.Function0) r0
            boolean r0 = r4.LJJIIJ(r0)
            r3 = r3 | r0
            java.lang.Object r2 = r8.l0
            com.ss.android.ugc.aweme.live.livehostimpl.livereply.highlight.LiveHighLightPageFragment r2 = (com.ss.android.ugc.aweme.live.livehostimpl.livereply.highlight.LiveHighLightPageFragment) r2
            java.lang.Object r1 = r8.l1
            kotlin.jvm.functions.Function0 r1 = (kotlin.jvm.functions.Function0) r1
            java.lang.Object r6 = r4.LJJ()
            if (r3 != 0) goto L54
            X.0tph r0 = X.InterfaceC1680500tpg.LIZ
            r0.getClass()
            X.0tpi r0 = X.C1680510tph.LIZIZ
            if (r6 != r0) goto L5e
        L54:
            kotlin.jvm.internal.AwS428S0200000_27 r6 = new kotlin.jvm.internal.AwS428S0200000_27
            r0 = 85
            r6.<init>(r2, r1, r0)
            r4.LJJIJIIJI(r6)
        L5e:
            kotlin.jvm.functions.Function0 r6 = (kotlin.jvm.functions.Function0) r6
            r4.LJ()
            r2 = 48
            r3 = 0
            X.C1668330tW3.LJIIIIZZ(r2, r3, r4, r5, r6, r7)
            java.lang.Object r1 = r8.l0
            com.ss.android.ugc.aweme.live.livehostimpl.livereply.highlight.LiveHighLightPageFragment r1 = (com.ss.android.ugc.aweme.live.livehostimpl.livereply.highlight.LiveHighLightPageFragment) r1
            r0 = 2131855639(0x7f118917, float:1.9344987E38)
            java.lang.String r5 = r1.getString(r0)
            r0 = 5004770(0x4c5de2, float:7.013177E-39)
            r4.LJJIIJZLJL(r0)
            java.lang.Object r0 = r8.l1
            kotlin.jvm.functions.Function0 r0 = (kotlin.jvm.functions.Function0) r0
            boolean r0 = r4.LJJIIJ(r0)
            java.lang.Object r1 = r8.l1
            kotlin.jvm.functions.Function0 r1 = (kotlin.jvm.functions.Function0) r1
            java.lang.Object r6 = r4.LJJ()
            if (r0 != 0) goto L95
            X.0tph r0 = X.InterfaceC1680500tpg.LIZ
            r0.getClass()
            X.0tpi r0 = X.C1680510tph.LIZIZ
            if (r6 != r0) goto L9f
        L95:
            kotlin.jvm.internal.AwS571S0100000_27 r6 = new kotlin.jvm.internal.AwS571S0100000_27
            r0 = 1227(0x4cb, float:1.72E-42)
            r6.<init>(r1, r0)
            r4.LJJIJIIJI(r6)
        L9f:
            kotlin.jvm.functions.Function0 r6 = (kotlin.jvm.functions.Function0) r6
            r4.LJ()
            r2 = 48
            r3 = 0
            X.C1668330tW3.LJIIIZ(r2, r3, r4, r5, r6, r7)
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS440S0200000_4.invoke$23(kotlin.jvm.internal.AwS440S0200000_4, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    public static /* bridge */ /* synthetic */ Object invoke$24(AwS440S0200000_4 awS440S0200000_4, Object obj, Object obj2) {
        Boolean bool = (Boolean) obj2;
        if (bool != null) {
            LinearLayout linearLayout = (LinearLayout) awS440S0200000_4.l0;
            LinearLayout linearLayout2 = (LinearLayout) awS440S0200000_4.l1;
            if (bool.booleanValue()) {
                if (linearLayout != null) {
                    C786410Ut5.LJZL(0, linearLayout);
                }
                if (linearLayout2 != null) {
                    C786410Ut5.LJZL(8, linearLayout2);
                }
            } else {
                if (linearLayout2 != null) {
                    C786410Ut5.LJZL(0, linearLayout2);
                }
                if (linearLayout != null) {
                    C786410Ut5.LJZL(8, linearLayout);
                }
            }
        }
        return Unit.LIZ;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x00d6, code lost:
    
        com.bytedance.mt.protector.impl.collections.ListProtector.add(r11, 0, r6);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$25(kotlin.jvm.internal.AwS440S0200000_4 r10, java.lang.Object r11, java.lang.Object r12) {
        /*
            Method dump skipped, instruction units count: 444
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS440S0200000_4.invoke$25(kotlin.jvm.internal.AwS440S0200000_4, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x008d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$26(kotlin.jvm.internal.AwS440S0200000_4 r8, java.lang.Object r9, java.lang.Object r10) {
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
            r0 = 2131826484(0x7f111734, float:1.9285854E38)
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
            kotlin.jvm.internal.AwS405S0200000_4 r6 = new kotlin.jvm.internal.AwS405S0200000_4
            r0 = 58
            r6.<init>(r2, r1, r0)
            r4.LJJIJIIJI(r6)
        L5a:
            kotlin.jvm.functions.Function0 r6 = (kotlin.jvm.functions.Function0) r6
            r4.LJ()
            r2 = 48
            r3 = 0
            X.C1668330tW3.LJIIIIZZ(r2, r3, r4, r5, r6, r7)
            r0 = 2131826482(0x7f111732, float:1.928585E38)
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
            kotlin.jvm.internal.AwS548S0100000_4 r6 = new kotlin.jvm.internal.AwS548S0100000_4
            r0 = 561(0x231, float:7.86E-43)
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
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS440S0200000_4.invoke$26(kotlin.jvm.internal.AwS440S0200000_4, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0047  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$3(kotlin.jvm.internal.AwS440S0200000_4 r4, java.lang.Object r5, java.lang.Object r6) {
        /*
            r2 = r5
            X.0tpg r2 = (X.InterfaceC1680500tpg) r2
            java.lang.Number r6 = (java.lang.Number) r6
            int r0 = r6.intValue()
            r1 = r0 & 3
            r0 = 2
            if (r1 != r0) goto L1a
            boolean r0 = r2.LIZ()
            if (r0 == 0) goto L1a
            r2.LIZJ()
        L17:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L1a:
            java.lang.Object r1 = r4.l0
            android.content.Context r1 = (android.content.Context) r1
            r0 = 2131821883(0x7f11053b, float:1.9276522E38)
            java.lang.String r3 = r1.getString(r0)
            r5 = 1
            r0 = 5004770(0x4c5de2, float:7.013177E-39)
            r2.LJJIIJZLJL(r0)
            java.lang.Object r0 = r4.l1
            kotlin.jvm.functions.Function0 r0 = (kotlin.jvm.functions.Function0) r0
            boolean r0 = r2.LJJIIJ(r0)
            java.lang.Object r1 = r4.l1
            kotlin.jvm.functions.Function0 r1 = (kotlin.jvm.functions.Function0) r1
            java.lang.Object r4 = r2.LJJ()
            if (r0 != 0) goto L47
            X.0tph r0 = X.InterfaceC1680500tpg.LIZ
            r0.getClass()
            X.0tpi r0 = X.C1680510tph.LIZIZ
            if (r4 != r0) goto L51
        L47:
            kotlin.jvm.internal.AwS548S0100000_4 r4 = new kotlin.jvm.internal.AwS548S0100000_4
            r0 = 173(0xad, float:2.42E-43)
            r4.<init>(r1, r0)
            r2.LJJIJIIJI(r4)
        L51:
            kotlin.jvm.functions.Function0 r4 = (kotlin.jvm.functions.Function0) r4
            r2.LJ()
            r0 = 48
            r1 = 0
            X.C1668330tW3.LJIIIIZZ(r0, r1, r2, r3, r4, r5)
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS440S0200000_4.invoke$3(kotlin.jvm.internal.AwS440S0200000_4, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x004d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$4(kotlin.jvm.internal.AwS440S0200000_4 r4, java.lang.Object r5, java.lang.Object r6) {
        /*
            r2 = r5
            X.0tpg r2 = (X.InterfaceC1680500tpg) r2
            java.lang.Number r6 = (java.lang.Number) r6
            int r0 = r6.intValue()
            r1 = r0 & 3
            r0 = 2
            if (r1 != r0) goto L1a
            boolean r0 = r2.LIZ()
            if (r0 == 0) goto L1a
            r2.LIZJ()
        L17:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L1a:
            java.lang.Object r0 = r4.l0
            com.ss.android.ugc.aweme.ogc.news.managetopics.cell.SeekBarCell r0 = (com.ss.android.ugc.aweme.ogc.news.managetopics.cell.SeekBarCell) r0
            android.view.View r0 = r0.itemView
            android.content.Context r1 = r0.getContext()
            r0 = 2131844876(0x7f115f0c, float:1.9323157E38)
            java.lang.String r3 = r1.getString(r0)
            r5 = 1
            r0 = 5004770(0x4c5de2, float:7.013177E-39)
            r2.LJJIIJZLJL(r0)
            java.lang.Object r0 = r4.l1
            kotlin.jvm.functions.Function0 r0 = (kotlin.jvm.functions.Function0) r0
            boolean r0 = r2.LJJIIJ(r0)
            java.lang.Object r1 = r4.l1
            kotlin.jvm.functions.Function0 r1 = (kotlin.jvm.functions.Function0) r1
            java.lang.Object r4 = r2.LJJ()
            if (r0 != 0) goto L4d
            X.0tph r0 = X.InterfaceC1680500tpg.LIZ
            r0.getClass()
            X.0tpi r0 = X.C1680510tph.LIZIZ
            if (r4 != r0) goto L57
        L4d:
            kotlin.jvm.internal.AwS548S0100000_4 r4 = new kotlin.jvm.internal.AwS548S0100000_4
            r0 = 185(0xb9, float:2.59E-43)
            r4.<init>(r1, r0)
            r2.LJJIJIIJI(r4)
        L57:
            kotlin.jvm.functions.Function0 r4 = (kotlin.jvm.functions.Function0) r4
            r2.LJ()
            r0 = 48
            r1 = 0
            X.C1668330tW3.LJIIIIZZ(r0, r1, r2, r3, r4, r5)
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS440S0200000_4.invoke$4(kotlin.jvm.internal.AwS440S0200000_4, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    public static final Object invoke$5(AwS440S0200000_4 awS440S0200000_4, Object obj, Object obj2) {
        InterfaceC1891350zJl interfaceC1891350zJl;
        String reviewId;
        RecyclerView.LayoutManager layoutManager;
        PoiReviewsApi.PoiReviewModel poiReviewModel;
        Object next;
        List<ITEM> list = ((C627660Ojc) obj2).LLILZ;
        String reviewId2 = null;
        if (list != 0) {
            Iterator it2 = list.iterator();
            while (true) {
                if (it2.hasNext()) {
                    next = it2.next();
                    if (next instanceof PoiReviewsApi.PoiReviewModel) {
                        break;
                    }
                } else {
                    next = null;
                    break;
                }
            }
            interfaceC1891350zJl = (InterfaceC1891350zJl) next;
        } else {
            interfaceC1891350zJl = null;
        }
        if ((interfaceC1891350zJl instanceof PoiReviewsApi.PoiReviewModel) && (poiReviewModel = (PoiReviewsApi.PoiReviewModel) interfaceC1891350zJl) != null) {
            reviewId = poiReviewModel.getReviewId();
        } else {
            reviewId = null;
        }
        PoiReviewsApi.PoiReviewModel poiReviewModel2 = (PoiReviewsApi.PoiReviewModel) awS440S0200000_4.l0;
        if (poiReviewModel2 != null) {
            reviewId2 = poiReviewModel2.getReviewId();
        }
        if (Intrinsics.LJFF(reviewId, reviewId2) && (layoutManager = ((PoiReviewsContentAssem) awS440S0200000_4.l1).Go().getLayoutManager()) != null && (layoutManager instanceof LinearLayoutManager)) {
            ((LinearLayoutManager) layoutManager).scrollToPositionWithOffset(0, 0);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$6(AwS440S0200000_4 awS440S0200000_4, Object obj, Object obj2) {
        final C329660Cw8 c329660Cw8 = (C329660Cw8) obj2;
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv = (ViewOnAttachStateChangeListenerC20604515jv) awS440S0200000_4.l0;
        final SearchProsConsTabFragment searchProsConsTabFragment = (SearchProsConsTabFragment) awS440S0200000_4.l1;
        viewOnAttachStateChangeListenerC20604515jv.LJIIL(new AbstractC329610Cw3<Integer>() { // from class: X.0Cw2
            @Override // com.bytedance.ies.powerlist.page.config.PowerPageSource
            public final void onRefresh(InterfaceC1364105Vn<? super AbstractC316870CbV<Integer>> interfaceC1364105Vn) {
                SearchProsConsTabAssemViewModel searchProsConsTabAssemViewModelDQ = searchProsConsTabFragment.DQ();
                C329660Cw8 c329660Cw82 = c329660Cw8;
                EnumC329590Cw1 enumC329590Cw1 = EnumC329590Cw1.LL;
                C09U0 c09u0 = searchProsConsTabAssemViewModelDQ.LLILLL;
                if (c09u0 == null) {
                    synchronized (searchProsConsTabAssemViewModelDQ) {
                        c09u0 = searchProsConsTabAssemViewModelDQ.LLILLL;
                        if (c09u0 == null) {
                            c09u0 = (C09U0) C1807670x8n.p();
                            searchProsConsTabAssemViewModelDQ.LLILLL = c09u0;
                        }
                    }
                }
                C948503nH.LJI(searchProsConsTabAssemViewModelDQ, c09u0.LIZ, new C329570Cvz(enumC329590Cw1, searchProsConsTabAssemViewModelDQ, c329660Cw82, interfaceC1364105Vn, null));
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // com.bytedance.ies.powerlist.page.config.PowerPageSource
            public final void onLoadMore(InterfaceC1364105Vn interfaceC1364105Vn, Object obj3) {
                ((Number) obj3).intValue();
                SearchProsConsTabAssemViewModel searchProsConsTabAssemViewModelDQ = searchProsConsTabFragment.DQ();
                C329660Cw8 c329660Cw82 = c329660Cw8;
                EnumC329590Cw1 enumC329590Cw1 = EnumC329590Cw1.LLILLJJLI;
                C09U0 c09u0 = searchProsConsTabAssemViewModelDQ.LLILLL;
                if (c09u0 == null) {
                    synchronized (searchProsConsTabAssemViewModelDQ) {
                        c09u0 = searchProsConsTabAssemViewModelDQ.LLILLL;
                        if (c09u0 == null) {
                            c09u0 = (C09U0) C1807670x8n.p();
                            searchProsConsTabAssemViewModelDQ.LLILLL = c09u0;
                        }
                    }
                }
                C948503nH.LJI(searchProsConsTabAssemViewModelDQ, c09u0.LIZ, new C329570Cvz(enumC329590Cw1, searchProsConsTabAssemViewModelDQ, c329660Cw82, interfaceC1364105Vn, null));
            }
        });
        return Unit.LIZ;
    }

    public static final Object invoke$7(AwS440S0200000_4 awS440S0200000_4, Object obj, Object obj2) {
        C0DZZ c0dzzLIZ;
        String str;
        UrlModel avatarThumb;
        List<String> urlList;
        InterfaceC1680500tpg interfaceC1680500tpg = (InterfaceC1680500tpg) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && interfaceC1680500tpg.LIZ()) {
            interfaceC1680500tpg.LIZJ();
        } else {
            C05P0 c05p0LIZIZ = C1671620tbM.LIZIZ(((SocialThoughtAggregatedPanelFragment) awS440S0200000_4.l0).SR().LLILLJJLI, interfaceC1680500tpg);
            interfaceC1680500tpg.LJJIIJZLJL(1849434622);
            Object objLJJ = interfaceC1680500tpg.LJJ();
            InterfaceC1680500tpg.LIZ.getClass();
            C1680520tpi c1680520tpi = C1680510tph.LIZIZ;
            String str2 = "";
            if (objLJJ == c1680520tpi) {
                User curUser = ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUser();
                if (curUser == null || (avatarThumb = curUser.getAvatarThumb()) == null || (urlList = avatarThumb.getUrlList()) == null || (objLJJ = (String) C13LP.LJJJLL(urlList)) == null) {
                    objLJJ = "";
                }
                interfaceC1680500tpg.LJJIJIIJI(objLJJ);
            }
            String str3 = (String) objLJJ;
            interfaceC1680500tpg.LJ();
            interfaceC1680500tpg.LJJIIJZLJL(1849434622);
            SocialThoughtAggregatedPanelFragment socialThoughtAggregatedPanelFragment = (SocialThoughtAggregatedPanelFragment) awS440S0200000_4.l0;
            Object objLJJ2 = interfaceC1680500tpg.LJJ();
            boolean z = true;
            if (objLJJ2 == c1680520tpi) {
                IThoughtBubblePromptResolver iThoughtBubblePromptResolver = (IThoughtBubblePromptResolver) PluggableExtentionKt.pluggableSpi$default(IThoughtBubblePromptResolver.class, false, false, false, 14, null);
                if (iThoughtBubblePromptResolver != null && (c0dzzLIZ = iThoughtBubblePromptResolver.LIZ(socialThoughtAggregatedPanelFragment.requireContext(), true)) != null && (str = c0dzzLIZ.LIZ) != null) {
                    str2 = str;
                }
                interfaceC1680500tpg.LJJIJIIJI(str2);
                objLJJ2 = str2;
            }
            String str4 = (String) objLJJ2;
            interfaceC1680500tpg.LJ();
            C0DZJ c0dzj = (C0DZJ) c05p0LIZIZ.getValue();
            if (C0C64.LJIILLIIL().LJIJ(31744, 0, "enable_thought_aggregated_bubble_floating", true) != 1) {
                z = false;
            }
            interfaceC1680500tpg.LJJIIJZLJL(5004770);
            boolean zLJII = interfaceC1680500tpg.LJII((SocialThoughtAggregatedPanelFragment) awS440S0200000_4.l0);
            SocialThoughtAggregatedPanelFragment socialThoughtAggregatedPanelFragment2 = (SocialThoughtAggregatedPanelFragment) awS440S0200000_4.l0;
            Object objLJJ3 = interfaceC1680500tpg.LJJ();
            if (zLJII || objLJJ3 == c1680520tpi) {
                objLJJ3 = new AwS548S0100000_4(socialThoughtAggregatedPanelFragment2, 219);
                interfaceC1680500tpg.LJJIJIIJI(objLJJ3);
            }
            Function0 function0 = (Function0) objLJJ3;
            interfaceC1680500tpg.LJ();
            interfaceC1680500tpg.LJJIIJZLJL(5004770);
            boolean zLJII2 = interfaceC1680500tpg.LJII((SocialThoughtAggregatedPanelFragment) awS440S0200000_4.l0);
            SocialThoughtAggregatedPanelFragment socialThoughtAggregatedPanelFragment3 = (SocialThoughtAggregatedPanelFragment) awS440S0200000_4.l0;
            Object objLJJ4 = interfaceC1680500tpg.LJJ();
            if (zLJII2 || objLJJ4 == c1680520tpi) {
                objLJJ4 = new AwS548S0100000_4(socialThoughtAggregatedPanelFragment3, 223);
                interfaceC1680500tpg.LJJIJIIJI(objLJJ4);
            }
            Function0 function02 = (Function0) objLJJ4;
            interfaceC1680500tpg.LJ();
            interfaceC1680500tpg.LJJIIJZLJL(5004770);
            boolean zLJII3 = interfaceC1680500tpg.LJII((SocialThoughtAggregatedPanelFragment) awS440S0200000_4.l0);
            SocialThoughtAggregatedPanelFragment socialThoughtAggregatedPanelFragment4 = (SocialThoughtAggregatedPanelFragment) awS440S0200000_4.l0;
            Object objLJJ5 = interfaceC1680500tpg.LJJ();
            if (zLJII3 || objLJJ5 == c1680520tpi) {
                objLJJ5 = new AwS548S0100000_4(socialThoughtAggregatedPanelFragment4, 224);
                interfaceC1680500tpg.LJJIJIIJI(objLJJ5);
            }
            Function0 function03 = (Function0) objLJJ5;
            interfaceC1680500tpg.LJ();
            interfaceC1680500tpg.LJJIIJZLJL(5004770);
            boolean zLJII4 = interfaceC1680500tpg.LJII((SocialThoughtAggregatedPanelFragment) awS440S0200000_4.l0);
            SocialThoughtAggregatedPanelFragment socialThoughtAggregatedPanelFragment5 = (SocialThoughtAggregatedPanelFragment) awS440S0200000_4.l0;
            Object objLJJ6 = interfaceC1680500tpg.LJJ();
            if (zLJII4 || objLJJ6 == c1680520tpi) {
                objLJJ6 = new AwS548S0100000_4(socialThoughtAggregatedPanelFragment5, 225);
                interfaceC1680500tpg.LJJIJIIJI(objLJJ6);
            }
            Function0 function04 = (Function0) objLJJ6;
            interfaceC1680500tpg.LJ();
            interfaceC1680500tpg.LJJIIJZLJL(5004770);
            boolean zLJII5 = interfaceC1680500tpg.LJII((SocialThoughtAggregatedPanelFragment) awS440S0200000_4.l0);
            SocialThoughtAggregatedPanelFragment socialThoughtAggregatedPanelFragment6 = (SocialThoughtAggregatedPanelFragment) awS440S0200000_4.l0;
            Object objLJJ7 = interfaceC1680500tpg.LJJ();
            if (zLJII5 || objLJJ7 == c1680520tpi) {
                objLJJ7 = new AwS583S0100000_4(socialThoughtAggregatedPanelFragment6, 123);
                interfaceC1680500tpg.LJJIJIIJI(objLJJ7);
            }
            Function1 function1 = (Function1) objLJJ7;
            interfaceC1680500tpg.LJ();
            interfaceC1680500tpg.LJJIIJZLJL(5004770);
            boolean zLJII6 = interfaceC1680500tpg.LJII((SocialThoughtAggregatedPanelFragment) awS440S0200000_4.l0);
            SocialThoughtAggregatedPanelFragment socialThoughtAggregatedPanelFragment7 = (SocialThoughtAggregatedPanelFragment) awS440S0200000_4.l0;
            Object objLJJ8 = interfaceC1680500tpg.LJJ();
            if (zLJII6 || objLJJ8 == c1680520tpi) {
                objLJJ8 = new AwS583S0100000_4(socialThoughtAggregatedPanelFragment7, 124);
                interfaceC1680500tpg.LJJIJIIJI(objLJJ8);
            }
            Function1 function12 = (Function1) objLJJ8;
            interfaceC1680500tpg.LJ();
            interfaceC1680500tpg.LJJIIJZLJL(5004770);
            boolean zLJII7 = interfaceC1680500tpg.LJII((SocialThoughtAggregatedPanelFragment) awS440S0200000_4.l0);
            SocialThoughtAggregatedPanelFragment socialThoughtAggregatedPanelFragment8 = (SocialThoughtAggregatedPanelFragment) awS440S0200000_4.l0;
            Object objLJJ9 = interfaceC1680500tpg.LJJ();
            if (zLJII7 || objLJJ9 == c1680520tpi) {
                objLJJ9 = new AwS583S0100000_4(socialThoughtAggregatedPanelFragment8, 125);
                interfaceC1680500tpg.LJJIJIIJI(objLJJ9);
            }
            Function1 function13 = (Function1) objLJJ9;
            interfaceC1680500tpg.LJ();
            interfaceC1680500tpg.LJJIIJZLJL(5004770);
            boolean zLJII8 = interfaceC1680500tpg.LJII((SocialThoughtAggregatedPanelFragment) awS440S0200000_4.l0);
            SocialThoughtAggregatedPanelFragment socialThoughtAggregatedPanelFragment9 = (SocialThoughtAggregatedPanelFragment) awS440S0200000_4.l0;
            Object objLJJ10 = interfaceC1680500tpg.LJJ();
            if (zLJII8 || objLJJ10 == c1680520tpi) {
                objLJJ10 = new AwS583S0100000_4(socialThoughtAggregatedPanelFragment9, 126);
                interfaceC1680500tpg.LJJIJIIJI(objLJJ10);
            }
            Function1 function14 = (Function1) objLJJ10;
            interfaceC1680500tpg.LJ();
            interfaceC1680500tpg.LJJIIJZLJL(5004770);
            boolean zLJII9 = interfaceC1680500tpg.LJII((SocialThoughtAggregatedPanelFragment) awS440S0200000_4.l0);
            SocialThoughtAggregatedPanelFragment socialThoughtAggregatedPanelFragment10 = (SocialThoughtAggregatedPanelFragment) awS440S0200000_4.l0;
            Object objLJJ11 = interfaceC1680500tpg.LJJ();
            if (zLJII9 || objLJJ11 == c1680520tpi) {
                objLJJ11 = new AwS583S0100000_4(socialThoughtAggregatedPanelFragment10, 127);
                interfaceC1680500tpg.LJJIJIIJI(objLJJ11);
            }
            Function1 function15 = (Function1) objLJJ11;
            interfaceC1680500tpg.LJ();
            interfaceC1680500tpg.LJJIIJZLJL(5004770);
            boolean zLJII10 = interfaceC1680500tpg.LJII((SocialThoughtAggregatedPanelFragment) awS440S0200000_4.l0);
            SocialThoughtAggregatedPanelFragment socialThoughtAggregatedPanelFragment11 = (SocialThoughtAggregatedPanelFragment) awS440S0200000_4.l0;
            Object objLJJ12 = interfaceC1680500tpg.LJJ();
            if (zLJII10 || objLJJ12 == c1680520tpi) {
                objLJJ12 = new AwS548S0100000_4(socialThoughtAggregatedPanelFragment11, 220);
                interfaceC1680500tpg.LJJIJIIJI(objLJJ12);
            }
            Function0 function05 = (Function0) objLJJ12;
            interfaceC1680500tpg.LJ();
            interfaceC1680500tpg.LJJIIJZLJL(5004770);
            boolean zLJII11 = interfaceC1680500tpg.LJII((SocialThoughtAggregatedPanelFragment) awS440S0200000_4.l0);
            SocialThoughtAggregatedPanelFragment socialThoughtAggregatedPanelFragment12 = (SocialThoughtAggregatedPanelFragment) awS440S0200000_4.l0;
            Object objLJJ13 = interfaceC1680500tpg.LJJ();
            if (zLJII11 || objLJJ13 == c1680520tpi) {
                objLJJ13 = new AwS548S0100000_4(socialThoughtAggregatedPanelFragment12, 221);
                interfaceC1680500tpg.LJJIJIIJI(objLJJ13);
            }
            Function0 function06 = (Function0) objLJJ13;
            interfaceC1680500tpg.LJ();
            interfaceC1680500tpg.LJJIIJZLJL(5004770);
            boolean zLJII12 = interfaceC1680500tpg.LJII((SocialThoughtAggregatedPanelFragment) awS440S0200000_4.l0);
            SocialThoughtAggregatedPanelFragment socialThoughtAggregatedPanelFragment13 = (SocialThoughtAggregatedPanelFragment) awS440S0200000_4.l0;
            Object objLJJ14 = interfaceC1680500tpg.LJJ();
            if (zLJII12 || objLJJ14 == c1680520tpi) {
                objLJJ14 = new AwS548S0100000_4(socialThoughtAggregatedPanelFragment13, 222);
                interfaceC1680500tpg.LJJIJIIJI(objLJJ14);
            }
            Function0 function07 = (Function0) objLJJ14;
            interfaceC1680500tpg.LJ();
            interfaceC1680500tpg.LJJIIJZLJL(5004770);
            boolean zLJII13 = interfaceC1680500tpg.LJII((C0DZH) awS440S0200000_4.l1);
            C0DZH c0dzh = (C0DZH) awS440S0200000_4.l1;
            Object objLJJ15 = interfaceC1680500tpg.LJJ();
            if (zLJII13 || objLJJ15 == c1680520tpi) {
                objLJJ15 = new AwS583S0100000_4(c0dzh, 122);
                interfaceC1680500tpg.LJJIJIIJI(objLJJ15);
            }
            interfaceC1680500tpg.LJ();
            C1675260thE.LJ(c0dzj, str3, str4, z, function0, function02, function03, function04, function1, function12, function13, function14, function15, function05, function06, function07, (Function1) objLJJ15, interfaceC1680500tpg, 432, 0, 0);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$8(AwS440S0200000_4 awS440S0200000_4, Object obj, Object obj2) {
        Set set = (Set) ((C291001Au) obj2).LIZ;
        ((C197039127h) awS440S0200000_4.l0).setEnabled(!set.isEmpty());
        if (set.isEmpty()) {
            ((C197039127h) awS440S0200000_4.l0).setText(((View) awS440S0200000_4.l1).getResources().getString(2131827259));
        } else {
            ((C197039127h) awS440S0200000_4.l0).setText(((View) awS440S0200000_4.l1).getResources().getString(2131827260, String.valueOf(set.size())));
        }
        return Unit.LIZ;
    }

    public static final Object invoke$9(AwS440S0200000_4 awS440S0200000_4, Object obj, Object obj2) {
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        if (((AtomicBoolean) awS440S0200000_4.l0).compareAndSet(false, true)) {
            ((Function2) awS440S0200000_4.l1).invoke(Boolean.valueOf(zBooleanValue), obj2);
        }
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS440S0200000_4(EnumC776070UcP enumC776070UcP, AwS631S0100000_17 awS631S0100000_17, int i) {
        super(2);
        this.$t = i;
        this.l0 = enumC776070UcP;
        this.l1 = awS631S0100000_17;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS440S0200000_4(EnumC776070UcP enumC776070UcP, AwS632S0100000_18 awS632S0100000_18, int i) {
        super(2);
        this.$t = i;
        this.l0 = enumC776070UcP;
        this.l1 = awS632S0100000_18;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS440S0200000_4(EnumC776080UcQ enumC776080UcQ, C1112220f36 c1112220f36, int i) {
        super(2);
        this.$t = i;
        this.l0 = enumC776080UcQ;
        this.l1 = c1112220f36;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS440S0200000_4(EnumC776080UcQ enumC776080UcQ, AObjectS531S0100000_17 aObjectS531S0100000_17, int i) {
        super(2);
        this.$t = i;
        this.l0 = enumC776080UcQ;
        this.l1 = aObjectS531S0100000_17;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS440S0200000_4(EnumC781860Ulk enumC781860Ulk, AwS641S0100000_27 awS641S0100000_27, int i) {
        super(2);
        this.$t = i;
        this.l0 = enumC781860Ulk;
        this.l1 = awS641S0100000_27;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS440S0200000_4(ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv, SearchProsConsTabFragment searchProsConsTabFragment, int i) {
        super(2);
        this.$t = i;
        this.l0 = viewOnAttachStateChangeListenerC20604515jv;
        this.l1 = searchProsConsTabFragment;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS440S0200000_4(Activity activity, Activity activity2, Function0<Unit> function0) {
        super(2);
        this.$t = function0;
        this.l0 = activity;
        this.l1 = activity2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS440S0200000_4(Context context, Context context2, Function0<Unit> function0) {
        super(2);
        this.$t = function0;
        this.l0 = context;
        this.l1 = context2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS440S0200000_4(View view, C197039127h c197039127h, int i) {
        super(2);
        this.$t = i;
        this.l0 = c197039127h;
        this.l1 = view;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS440S0200000_4(LinearLayout linearLayout, LinearLayout linearLayout2, int i) {
        super(2);
        this.$t = i;
        this.l0 = linearLayout;
        this.l1 = linearLayout2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS440S0200000_4(ComposeView composeView, GuestMatchEntryViewModel guestMatchEntryViewModel, int i) {
        super(2);
        this.$t = i;
        this.l0 = composeView;
        this.l1 = guestMatchEntryViewModel;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS440S0200000_4(OrderSnapshotV2 orderSnapshotV2, C0D6E c0d6e, int i) {
        super(2);
        this.$t = i;
        this.l0 = orderSnapshotV2;
        this.l1 = c0d6e;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS440S0200000_4(PostedListFragment postedListFragment, PostedListFragment postedListFragment2, Function0<Unit> function0) {
        super(2);
        this.$t = function0;
        this.l0 = postedListFragment;
        this.l1 = postedListFragment2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS440S0200000_4(LiveHighLightPageFragment liveHighLightPageFragment, LiveHighLightPageFragment liveHighLightPageFragment2, Function0<Unit> function0) {
        super(2);
        this.$t = function0;
        this.l0 = liveHighLightPageFragment;
        this.l1 = liveHighLightPageFragment2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS440S0200000_4(VideoCaptionMentionPanel videoCaptionMentionPanel, View view, int i) {
        super(2);
        this.$t = i;
        this.l0 = videoCaptionMentionPanel;
        this.l1 = view;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS440S0200000_4(SeekBarCell seekBarCell, SeekBarCell seekBarCell2, Function0<Unit> function0) {
        super(2);
        this.$t = function0;
        this.l0 = seekBarCell;
        this.l1 = seekBarCell2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS440S0200000_4(PoiReviewsApi.PoiReviewModel poiReviewModel, PoiReviewsContentAssem poiReviewsContentAssem, int i) {
        super(2);
        this.$t = i;
        this.l0 = poiReviewModel;
        this.l1 = poiReviewsContentAssem;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS440S0200000_4(EffectDraftDetailAssem effectDraftDetailAssem, EffectDraftDetailAssem effectDraftDetailAssem2, Function0<Unit> function0) {
        super(2);
        this.$t = function0;
        this.l0 = effectDraftDetailAssem;
        this.l1 = effectDraftDetailAssem2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS440S0200000_4(SocialThoughtAggregatedPanelFragment socialThoughtAggregatedPanelFragment, C0DZH c0dzh, int i) {
        super(2);
        this.$t = i;
        this.l0 = socialThoughtAggregatedPanelFragment;
        this.l1 = c0dzh;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS440S0200000_4(AtomicBoolean atomicBoolean, AtomicBoolean atomicBoolean2, Function2<? super Boolean, ? super Throwable, Unit> function2) {
        super(2);
        this.$t = function2;
        this.l0 = atomicBoolean;
        this.l1 = atomicBoolean2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS440S0200000_4(Function0 function0, Function0<Unit> function02, Function0<Unit> function03) {
        super(2);
        this.$t = function03;
        this.l0 = function0;
        this.l1 = function02;
    }
}
