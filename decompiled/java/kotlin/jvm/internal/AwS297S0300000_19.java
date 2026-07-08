package kotlin.jvm.internal;

import X.AbstractC1247880iZu;
import X.AbstractC1255880imo;
import X.C05P0;
import X.C09AY;
import X.C0C38;
import X.C0MBB;
import X.C0SC4;
import X.C0SR4;
import X.C1019400cdO;
import X.C1231130i8t;
import X.C1231150i8v;
import X.C1248670ibB;
import X.C1248950ibd;
import X.C1261860iwS;
import X.C1388190mED;
import X.C1389890mGx;
import X.C13LP;
import X.C1616906Ut;
import X.C1649560t1m;
import X.C1668330tW3;
import X.C1680510tph;
import X.C1680520tpi;
import X.C1720106oR;
import X.C19EG;
import X.C2187451AjH;
import X.C2188811AlT;
import X.C2537109wv;
import X.C259800zU;
import X.C268330AfP;
import X.C418440Gaw;
import X.C428150Gqb;
import X.C786410Ut5;
import X.C814420VxA;
import X.EnumC1248260iaW;
import X.EnumC1993507rR;
import X.EnumC428940Grs;
import X.InterfaceC1209700haK;
import X.InterfaceC1603360rpG;
import X.InterfaceC1680500tpg;
import X.InterfaceC497601wk;
import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.account.login.twostep.TrustedDevicesItemCell;
import com.ss.android.ugc.aweme.detail.panel.DetailFragmentPanel;
import com.ss.android.ugc.aweme.detail.platform.DetailPageComponent;
import com.ss.android.ugc.aweme.fangroup.model.GroupJoinResponse;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.inbox.search.view.cell.InboxSearchDefaultPageFoldCell;
import com.ss.android.ugc.aweme.mix.editname.EditPlayListNameFragment;
import com.ss.android.ugc.aweme.relation.usercard.ability.IUserCardListAbility;
import com.ss.android.ugc.aweme.relation.usercard.impl.cell.AbsRecUserCell;
import com.ss.android.ugc.aweme.selector.choosegroup.FanGroupChooseGroupFragment;
import com.ss.android.ugc.aweme.selector.choosegroup.FanGroupChooseGroupFragmentParam;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.ss.android.ugc.aweme.story.highlights.creation.StoryHighlightsCreationVM;
import com.ss.android.ugc.aweme.subscription.service.IPaidContentFullAwemeService;
import com.ss.android.ugc.gamora.recorder.progress.f;
import com.ss.android.ugc.profile.business.profile.info.identifier.sheet.AccountOrgIdentifierProtocol;
import com.ss.android.ugc.profile.business.profile.util.AccountVerifyProtocol;
import com.ss.android.ugc.profile.business.ur.aigc.ProfileAigcChooseStyleFragment;
import com.ss.android.ugc.profile.business.ur.aigc.ProfileAigcProgressAssem;
import com.ss.android.ugc.profile.business.ur.nickname.ProfileInfoPronounsProtocol;
import com.ss.android.ugc.profile.platform.base.data.BizBaseData;
import com.ss.android.ugc.profile.platform.base.data.ProfileComponents;
import com.ss.android.ugc.profile.platform.business.header.business.advancedfeature.base.HeaderAdvancedFeatureBaseUIComponent;
import com.ss.android.ugc.profile.platform.business.header.business.bio.business.bainfo.base.BioStructuralInfoBaseComponent;
import com.ss.android.ugc.profile.platform.business.header.business.info.business.userinfo.base.AccountInfoBaseUIComponent;
import com.ss.android.ugc.profile.platform.business.header.business.info.business.userinfo.base.AccountUserInfoBaseUIComponent;
import com.ss.android.ugc.profile.platform.business.header.business.info.business.userinfo.base.CommonInfoBaseUIComponent;
import com.ss.android.ugc.profile.platform.business.header.business.info.business.userinfo.base.ProfileUserAccountNameInfoBaseComponent;
import com.ss.android.ugc.profile.platform.business.header.business.toptips.base.ProfileHeaderTopTipsBaseUIComponent;
import com.ss.android.ugc.profile.platform.standard.protocol.ProfilePlatformProtocol;
import com.tts.oecverify.BdTuring;
import com.zhiliaoapp.musically.R;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes20.dex */
public class AwS297S0300000_19 extends C09AY implements Function2 {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;

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
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS297S0300000_19 awS297S0300000_19, Object obj, Object obj2) {
        C0SR4 c0sr4;
        List items;
        ((AbstractC1255880imo) awS297S0300000_19.l0).insertItem(obj, ((Number) obj2).intValue());
        C1019400cdO.LJFF("profile_feed", Collections.singletonList(obj));
        List<Aweme> items2 = ((AbstractC1255880imo) awS297S0300000_19.l0).getItems();
        if (!(items2 instanceof List)) {
            items2 = null;
        }
        if (C0SC4.LIZ() && (((InterfaceC1603360rpG) awS297S0300000_19.l1) instanceof InterfaceC1209700haK) && (items = ((AbstractC1255880imo) awS297S0300000_19.l0).getItems()) != null) {
            DetailPageComponent detailPageComponent = (DetailPageComponent) awS297S0300000_19.l2;
            String aid = detailPageComponent.LLJJL.getAid();
            if (aid != null) {
                items2 = ((IPaidContentFullAwemeService) detailPageComponent.LLLFF.getValue()).LIZJ(aid, C13LP.LJJJJLI(items));
                if (!(items2 instanceof List)) {
                    items2 = null;
                }
            }
        }
        DetailFragmentPanel detailFragmentPanel = ((DetailPageComponent) awS297S0300000_19.l2).LLJL;
        if (detailFragmentPanel != null && (c0sr4 = detailFragmentPanel.LLJL) != null) {
            c0sr4.setData(items2);
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x009d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$1(kotlin.jvm.internal.AwS297S0300000_19 r8, java.lang.Object r9, java.lang.Object r10) {
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
            java.lang.Object r0 = r8.l0
            android.app.Activity r0 = (android.app.Activity) r0
            android.content.res.Resources r1 = r0.getResources()
            r0 = 2131833949(0x7f11345d, float:1.9300995E38)
            java.lang.String r5 = r1.getString(r0)
            r7 = 1
            r0 = -1633490746(0xffffffff9ea2e8c6, float:-1.724869E-20)
            r4.LJJIIJZLJL(r0)
            java.lang.Object r0 = r8.l1
            X.0t1m r0 = (X.C1649560t1m) r0
            boolean r3 = r4.LJII(r0)
            java.lang.Object r0 = r8.l2
            kotlin.jvm.functions.Function0 r0 = (kotlin.jvm.functions.Function0) r0
            boolean r0 = r4.LJJIIJ(r0)
            r3 = r3 | r0
            java.lang.Object r2 = r8.l1
            X.0t1m r2 = (X.C1649560t1m) r2
            java.lang.Object r1 = r8.l2
            kotlin.jvm.functions.Function0 r1 = (kotlin.jvm.functions.Function0) r1
            java.lang.Object r6 = r4.LJJ()
            if (r3 != 0) goto L58
            X.0tph r0 = X.InterfaceC1680500tpg.LIZ
            r0.getClass()
            X.0tpi r0 = X.C1680510tph.LIZIZ
            if (r6 != r0) goto L62
        L58:
            kotlin.jvm.internal.AwS420S0200000_19 r6 = new kotlin.jvm.internal.AwS420S0200000_19
            r0 = 90
            r6.<init>(r2, r1, r0)
            r4.LJJIJIIJI(r6)
        L62:
            kotlin.jvm.functions.Function0 r6 = (kotlin.jvm.functions.Function0) r6
            r4.LJ()
            r2 = 48
            r3 = 0
            X.C1668330tW3.LJIIIIZZ(r2, r3, r4, r5, r6, r7)
            java.lang.Object r0 = r8.l0
            android.app.Activity r0 = (android.app.Activity) r0
            android.content.res.Resources r1 = r0.getResources()
            r0 = 2131833948(0x7f11345c, float:1.9300992E38)
            java.lang.String r5 = r1.getString(r0)
            r0 = 5004770(0x4c5de2, float:7.013177E-39)
            r4.LJJIIJZLJL(r0)
            java.lang.Object r0 = r8.l2
            kotlin.jvm.functions.Function0 r0 = (kotlin.jvm.functions.Function0) r0
            boolean r0 = r4.LJJIIJ(r0)
            java.lang.Object r1 = r8.l2
            kotlin.jvm.functions.Function0 r1 = (kotlin.jvm.functions.Function0) r1
            java.lang.Object r6 = r4.LJJ()
            if (r0 != 0) goto L9d
            X.0tph r0 = X.InterfaceC1680500tpg.LIZ
            r0.getClass()
            X.0tpi r0 = X.C1680510tph.LIZIZ
            if (r6 != r0) goto La7
        L9d:
            kotlin.jvm.internal.AwS563S0100000_19 r6 = new kotlin.jvm.internal.AwS563S0100000_19
            r0 = 1477(0x5c5, float:2.07E-42)
            r6.<init>(r1, r0)
            r4.LJJIJIIJI(r6)
        La7:
            kotlin.jvm.functions.Function0 r6 = (kotlin.jvm.functions.Function0) r6
            r4.LJ()
            r2 = 48
            r3 = 0
            X.C1668330tW3.LJIIIZ(r2, r3, r4, r5, r6, r7)
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS297S0300000_19.invoke$1(kotlin.jvm.internal.AwS297S0300000_19, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    public static /* bridge */ /* synthetic */ Object invoke$10(AwS297S0300000_19 awS297S0300000_19, Object obj, Object obj2) {
        TextView textView;
        Integer num = (Integer) obj;
        View view = (View) obj2;
        int type = EnumC1248260iaW.ICON.getType();
        if (num != null && num.intValue() == type) {
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12)));
            layoutParams.gravity = 17;
            layoutParams.setMarginStart(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4)));
            if (view != null) {
                C786410Ut5.W5(view, layoutParams);
                view.setId(R.id.s7b);
            }
            C428150Gqb.LIZ(view, EnumC428940Grs.ALPHA, 0.0f);
            if (((AccountUserInfoBaseUIComponent) awS297S0300000_19.l0).ap() != null && (!(r0 instanceof AccountVerifyProtocol))) {
                ((AbstractC1247880iZu) awS297S0300000_19.l1).LIZ();
            }
        } else {
            int type2 = EnumC1248260iaW.TEXT.getType();
            if (num != null && num.intValue() == type2) {
                LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
                if (!C268330AfP.LJIIJ()) {
                    layoutParams2.gravity = 1;
                }
                if (view != null) {
                    C786410Ut5.W5(view, layoutParams2);
                    view.setId(R.id.f797s7d);
                }
                if (C2537109wv.LJI() && (view instanceof TuxTextView) && (textView = (TextView) view) != null) {
                    if (!C0C38.LIZ()) {
                        textView.setPadding(0, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(2)), 0, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(2)));
                    }
                    textView.setSingleLine(true);
                    textView.setEllipsize(TextUtils.TruncateAt.END);
                }
                if (((AccountUserInfoBaseUIComponent) awS297S0300000_19.l0).ap() != null && (!(r0 instanceof AccountVerifyProtocol))) {
                    ((AbstractC1247880iZu) awS297S0300000_19.l1).LIZ();
                    return view;
                }
            } else {
                return new LinearLayout((Context) awS297S0300000_19.l2);
            }
        }
        return view;
    }

    public static final Object invoke$11(AwS297S0300000_19 awS297S0300000_19, Object obj, Object obj2) {
        String str;
        ProfileComponents profileComponents;
        Integer num = (Integer) obj;
        View view = (View) obj2;
        CommonInfoBaseUIComponent commonInfoBaseUIComponent = (CommonInfoBaseUIComponent) awS297S0300000_19.l0;
        commonInfoBaseUIComponent.getClass();
        Set setSingleton = Collections.singleton("user_account_honor_label");
        C1248950ibd c1248950ibdBp = commonInfoBaseUIComponent.Bp();
        if (c1248950ibdBp != null && (profileComponents = c1248950ibdBp.LLILLJJLI) != null) {
            str = profileComponents.componentName;
        } else {
            str = null;
        }
        boolean zLJJJJ = C13LP.LJJJJ(str, setSingleton);
        boolean z = true;
        if (commonInfoBaseUIComponent.ap() == null || !(!(r0 instanceof ProfileInfoPronounsProtocol)) || zLJJJJ) {
            z = false;
        }
        int i = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("isPressEnabled: ");
        sbLIZ.append(z);
        C1720106oR.LJI("BaseUIComponent", C2188811AlT.LIZIZ(sbLIZ));
        if (z) {
            C428150Gqb.LIZ(view, EnumC428940Grs.ALPHA, 0.0f);
        }
        int type = EnumC1248260iaW.ICON.getType();
        if (num != null && num.intValue() == type) {
            ((CommonInfoBaseUIComponent) awS297S0300000_19.l0).yp(view, false);
            ((CommonInfoBaseUIComponent) awS297S0300000_19.l0).Ip(view);
            return ((AbstractC1247880iZu) awS297S0300000_19.l1).LIZ();
        }
        int type2 = EnumC1248260iaW.TEXT.getType();
        if (num != null && num.intValue() == type2) {
            ((CommonInfoBaseUIComponent) awS297S0300000_19.l0).zp(view);
            ((CommonInfoBaseUIComponent) awS297S0300000_19.l0).Ip(view);
            return ((AbstractC1247880iZu) awS297S0300000_19.l1).LIZ();
        }
        int type3 = EnumC1248260iaW.ICON_TEXT.getType();
        if (num != null && num.intValue() == type3) {
            ((AbstractC1247880iZu) awS297S0300000_19.l1).LIZJ(EnumC1248260iaW.UNKONWN, new AwS633S0100000_19((CommonInfoBaseUIComponent) awS297S0300000_19.l0, (CommonInfoBaseUIComponent<BizBaseData>) 166));
            ((C1248670ibB) ((AbstractC1247880iZu) awS297S0300000_19.l1)).LJ(new AwS633S0100000_19((CommonInfoBaseUIComponent) awS297S0300000_19.l0, (CommonInfoBaseUIComponent<BizBaseData>) 167));
            return ((C1248670ibB) ((AbstractC1247880iZu) awS297S0300000_19.l1)).LJ;
        }
        return new LinearLayout((Context) awS297S0300000_19.l2);
    }

    public static final Object invoke$12(AwS297S0300000_19 awS297S0300000_19, Object obj, Object obj2) {
        Integer num = (Integer) obj;
        View view = (View) obj2;
        C428150Gqb.LIZ(view, EnumC428940Grs.ALPHA, 0.0f);
        int type = EnumC1248260iaW.ICON.getType();
        if (num != null && num.intValue() == type) {
            ((ProfileUserAccountNameInfoBaseComponent) awS297S0300000_19.l0).up(view);
            return ((AbstractC1247880iZu) awS297S0300000_19.l1).LIZ();
        }
        int type2 = EnumC1248260iaW.TEXT.getType();
        if (num != null && num.intValue() == type2) {
            ((ProfileUserAccountNameInfoBaseComponent) awS297S0300000_19.l0).yp(view);
            return ((AbstractC1247880iZu) awS297S0300000_19.l1).LIZ();
        }
        int type3 = EnumC1248260iaW.ICON_TEXT.getType();
        if (num != null && num.intValue() == type3) {
            ((AbstractC1247880iZu) awS297S0300000_19.l1).LIZJ(EnumC1248260iaW.UNKONWN, new AwS633S0100000_19((ProfileUserAccountNameInfoBaseComponent) awS297S0300000_19.l0, (ProfileUserAccountNameInfoBaseComponent<BizBaseData>) 168));
            ((C1248670ibB) ((AbstractC1247880iZu) awS297S0300000_19.l1)).LJ(new AwS633S0100000_19((ProfileUserAccountNameInfoBaseComponent) awS297S0300000_19.l0, (ProfileUserAccountNameInfoBaseComponent<BizBaseData>) 169));
            return ((C1248670ibB) ((AbstractC1247880iZu) awS297S0300000_19.l1)).LJ;
        }
        return new LinearLayout((Context) awS297S0300000_19.l2);
    }

    public static final Object invoke$13(AwS297S0300000_19 awS297S0300000_19, Object obj, Object obj2) {
        Integer num = (Integer) obj;
        View view = (View) obj2;
        int type = EnumC1248260iaW.ICON.getType();
        if (num != null && num.intValue() == type) {
            LinearLayout linearLayout = new LinearLayout((Context) awS297S0300000_19.l0);
            ProfileHeaderTopTipsBaseUIComponent profileHeaderTopTipsBaseUIComponent = (ProfileHeaderTopTipsBaseUIComponent) awS297S0300000_19.l2;
            Context context = (Context) awS297S0300000_19.l0;
            AbstractC1247880iZu abstractC1247880iZu = (AbstractC1247880iZu) awS297S0300000_19.l1;
            profileHeaderTopTipsBaseUIComponent.up(context, linearLayout);
            profileHeaderTopTipsBaseUIComponent.yp((TuxIconView) view);
            abstractC1247880iZu.LIZ();
            linearLayout.addView(view);
            return linearLayout;
        }
        int type2 = EnumC1248260iaW.TEXT.getType();
        if (num != null && num.intValue() == type2) {
            LinearLayout linearLayout2 = new LinearLayout((Context) awS297S0300000_19.l0);
            ProfileHeaderTopTipsBaseUIComponent profileHeaderTopTipsBaseUIComponent2 = (ProfileHeaderTopTipsBaseUIComponent) awS297S0300000_19.l2;
            Context context2 = (Context) awS297S0300000_19.l0;
            AbstractC1247880iZu abstractC1247880iZu2 = (AbstractC1247880iZu) awS297S0300000_19.l1;
            profileHeaderTopTipsBaseUIComponent2.up(context2, linearLayout2);
            profileHeaderTopTipsBaseUIComponent2.zp((TuxTextView) view);
            abstractC1247880iZu2.LIZ();
            linearLayout2.addView(view);
            return linearLayout2;
        }
        int type3 = EnumC1248260iaW.ICON_TEXT.getType();
        if (num != null && num.intValue() == type3) {
            ((AbstractC1247880iZu) awS297S0300000_19.l1).LIZJ(EnumC1248260iaW.UNKONWN, new AwS455S0200000_19((ProfileHeaderTopTipsBaseUIComponent) awS297S0300000_19.l2, (Context) awS297S0300000_19.l0, 30));
            ((C1248670ibB) ((AbstractC1247880iZu) awS297S0300000_19.l1)).LJ(new AwS633S0100000_19((ProfileHeaderTopTipsBaseUIComponent) awS297S0300000_19.l2, 170));
            return ((C1248670ibB) ((AbstractC1247880iZu) awS297S0300000_19.l1)).LJ;
        }
        return new LinearLayout((Context) awS297S0300000_19.l0);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0095  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$14(kotlin.jvm.internal.AwS297S0300000_19 r8, java.lang.Object r9, java.lang.Object r10) {
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
            android.content.Context r1 = (android.content.Context) r1
            r0 = 2131847525(0x7f116965, float:1.932853E38)
            java.lang.String r5 = r1.getString(r0)
            r7 = 1
            r0 = -1633490746(0xffffffff9ea2e8c6, float:-1.724869E-20)
            r4.LJJIIJZLJL(r0)
            java.lang.Object r0 = r8.l1
            com.ss.android.ugc.aweme.inbox.search.view.cell.InboxSearchDefaultPageFoldCell r0 = (com.ss.android.ugc.aweme.inbox.search.view.cell.InboxSearchDefaultPageFoldCell) r0
            boolean r3 = r4.LJII(r0)
            java.lang.Object r0 = r8.l2
            kotlin.jvm.functions.Function0 r0 = (kotlin.jvm.functions.Function0) r0
            boolean r0 = r4.LJJIIJ(r0)
            r3 = r3 | r0
            java.lang.Object r2 = r8.l1
            com.ss.android.ugc.aweme.inbox.search.view.cell.InboxSearchDefaultPageFoldCell r2 = (com.ss.android.ugc.aweme.inbox.search.view.cell.InboxSearchDefaultPageFoldCell) r2
            java.lang.Object r1 = r8.l2
            kotlin.jvm.functions.Function0 r1 = (kotlin.jvm.functions.Function0) r1
            java.lang.Object r6 = r4.LJJ()
            if (r3 != 0) goto L54
            X.0tph r0 = X.InterfaceC1680500tpg.LIZ
            r0.getClass()
            X.0tpi r0 = X.C1680510tph.LIZIZ
            if (r6 != r0) goto L5e
        L54:
            kotlin.jvm.internal.AwS420S0200000_19 r6 = new kotlin.jvm.internal.AwS420S0200000_19
            r0 = 129(0x81, float:1.81E-43)
            r6.<init>(r2, r1, r0)
            r4.LJJIJIIJI(r6)
        L5e:
            kotlin.jvm.functions.Function0 r6 = (kotlin.jvm.functions.Function0) r6
            r4.LJ()
            r2 = 48
            r3 = 0
            X.C1668330tW3.LJIIIIZZ(r2, r3, r4, r5, r6, r7)
            java.lang.Object r1 = r8.l0
            android.content.Context r1 = (android.content.Context) r1
            r0 = 2131847524(0x7f116964, float:1.9328528E38)
            java.lang.String r5 = r1.getString(r0)
            r0 = 5004770(0x4c5de2, float:7.013177E-39)
            r4.LJJIIJZLJL(r0)
            java.lang.Object r0 = r8.l2
            kotlin.jvm.functions.Function0 r0 = (kotlin.jvm.functions.Function0) r0
            boolean r0 = r4.LJJIIJ(r0)
            java.lang.Object r1 = r8.l2
            kotlin.jvm.functions.Function0 r1 = (kotlin.jvm.functions.Function0) r1
            java.lang.Object r6 = r4.LJJ()
            if (r0 != 0) goto L95
            X.0tph r0 = X.InterfaceC1680500tpg.LIZ
            r0.getClass()
            X.0tpi r0 = X.C1680510tph.LIZIZ
            if (r6 != r0) goto L9f
        L95:
            kotlin.jvm.internal.AwS563S0100000_19 r6 = new kotlin.jvm.internal.AwS563S0100000_19
            r0 = 2764(0xacc, float:3.873E-42)
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
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS297S0300000_19.invoke$14(kotlin.jvm.internal.AwS297S0300000_19, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    public static final Object invoke$15(AwS297S0300000_19 awS297S0300000_19, Object obj, Object obj2) {
        InterfaceC1680500tpg interfaceC1680500tpg = (InterfaceC1680500tpg) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && interfaceC1680500tpg.LIZ()) {
            interfaceC1680500tpg.LIZJ();
        } else {
            String strLIZIZ = C0MBB.LIZIZ(2131848970, interfaceC1680500tpg);
            interfaceC1680500tpg.LJJIIJZLJL(5004770);
            C05P0 c05p0 = (C05P0) awS297S0300000_19.l2;
            Object objLJJ = interfaceC1680500tpg.LJJ();
            InterfaceC1680500tpg.LIZ.getClass();
            C1680520tpi c1680520tpi = C1680510tph.LIZIZ;
            if (objLJJ == c1680520tpi) {
                objLJJ = new AwS553S0100000_9(c05p0, (C05P0<Boolean>) 1681);
                interfaceC1680500tpg.LJJIJIIJI(objLJJ);
            }
            interfaceC1680500tpg.LJ();
            C1668330tW3.LJIIIZ(384, 2, interfaceC1680500tpg, strLIZIZ, (Function0) objLJJ, false);
            String strLIZIZ2 = C0MBB.LIZIZ(2131848969, interfaceC1680500tpg);
            interfaceC1680500tpg.LJJIIJZLJL(-1746271574);
            boolean zLJII = interfaceC1680500tpg.LJII((InterfaceC497601wk) awS297S0300000_19.l0) | interfaceC1680500tpg.LJII((StoryHighlightsCreationVM) awS297S0300000_19.l1);
            InterfaceC497601wk interfaceC497601wk = (InterfaceC497601wk) awS297S0300000_19.l0;
            C05P0 c05p02 = (C05P0) awS297S0300000_19.l2;
            StoryHighlightsCreationVM storyHighlightsCreationVM = (StoryHighlightsCreationVM) awS297S0300000_19.l1;
            Object objLJJ2 = interfaceC1680500tpg.LJJ();
            if (zLJII || objLJJ2 == c1680520tpi) {
                objLJJ2 = new AwS246S0300000_2(c05p02, storyHighlightsCreationVM, interfaceC497601wk, 22);
                interfaceC1680500tpg.LJJIJIIJI(objLJJ2);
            }
            interfaceC1680500tpg.LJ();
            C1668330tW3.LJIIIIZZ(0, 2, interfaceC1680500tpg, strLIZIZ2, (Function0) objLJJ2, false);
        }
        return Unit.LIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00a5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$16(kotlin.jvm.internal.AwS297S0300000_19 r8, java.lang.Object r9, java.lang.Object r10) {
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
            java.lang.Object r0 = r8.l0
            android.view.View r0 = (android.view.View) r0
            android.content.Context r0 = r0.getContext()
            android.content.res.Resources r1 = r0.getResources()
            r0 = 2131820630(0x7f110056, float:1.927398E38)
            java.lang.String r5 = r1.getString(r0)
            r7 = 1
            r0 = -1633490746(0xffffffff9ea2e8c6, float:-1.724869E-20)
            r4.LJJIIJZLJL(r0)
            java.lang.Object r0 = r8.l1
            com.ss.android.ugc.profile.business.ur.aigc.ProfileAigcChooseStyleFragment r0 = (com.ss.android.ugc.profile.business.ur.aigc.ProfileAigcChooseStyleFragment) r0
            boolean r3 = r4.LJII(r0)
            java.lang.Object r0 = r8.l2
            kotlin.jvm.functions.Function0 r0 = (kotlin.jvm.functions.Function0) r0
            boolean r0 = r4.LJJIIJ(r0)
            r3 = r3 | r0
            java.lang.Object r2 = r8.l1
            com.ss.android.ugc.profile.business.ur.aigc.ProfileAigcChooseStyleFragment r2 = (com.ss.android.ugc.profile.business.ur.aigc.ProfileAigcChooseStyleFragment) r2
            java.lang.Object r1 = r8.l2
            kotlin.jvm.functions.Function0 r1 = (kotlin.jvm.functions.Function0) r1
            java.lang.Object r6 = r4.LJJ()
            if (r3 != 0) goto L5c
            X.0tph r0 = X.InterfaceC1680500tpg.LIZ
            r0.getClass()
            X.0tpi r0 = X.C1680510tph.LIZIZ
            if (r6 != r0) goto L66
        L5c:
            kotlin.jvm.internal.AwS420S0200000_19 r6 = new kotlin.jvm.internal.AwS420S0200000_19
            r0 = 176(0xb0, float:2.47E-43)
            r6.<init>(r2, r1, r0)
            r4.LJJIJIIJI(r6)
        L66:
            kotlin.jvm.functions.Function0 r6 = (kotlin.jvm.functions.Function0) r6
            r4.LJ()
            r2 = 48
            r3 = 0
            X.C1668330tW3.LJIIIIZZ(r2, r3, r4, r5, r6, r7)
            java.lang.Object r0 = r8.l0
            android.view.View r0 = (android.view.View) r0
            android.content.Context r0 = r0.getContext()
            android.content.res.Resources r1 = r0.getResources()
            r0 = 2131820662(0x7f110076, float:1.9274045E38)
            java.lang.String r5 = r1.getString(r0)
            r0 = 5004770(0x4c5de2, float:7.013177E-39)
            r4.LJJIIJZLJL(r0)
            java.lang.Object r0 = r8.l2
            kotlin.jvm.functions.Function0 r0 = (kotlin.jvm.functions.Function0) r0
            boolean r0 = r4.LJJIIJ(r0)
            java.lang.Object r1 = r8.l2
            kotlin.jvm.functions.Function0 r1 = (kotlin.jvm.functions.Function0) r1
            java.lang.Object r6 = r4.LJJ()
            if (r0 != 0) goto La5
            X.0tph r0 = X.InterfaceC1680500tpg.LIZ
            r0.getClass()
            X.0tpi r0 = X.C1680510tph.LIZIZ
            if (r6 != r0) goto Laf
        La5:
            kotlin.jvm.internal.AwS563S0100000_19 r6 = new kotlin.jvm.internal.AwS563S0100000_19
            r0 = 3132(0xc3c, float:4.389E-42)
            r6.<init>(r1, r0)
            r4.LJJIJIIJI(r6)
        Laf:
            kotlin.jvm.functions.Function0 r6 = (kotlin.jvm.functions.Function0) r6
            r4.LJ()
            r2 = 48
            r3 = 0
            X.C1668330tW3.LJIIIZ(r2, r3, r4, r5, r6, r7)
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS297S0300000_19.invoke$16(kotlin.jvm.internal.AwS297S0300000_19, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    public static final Object invoke$17(AwS297S0300000_19 awS297S0300000_19, Object obj, Object obj2) {
        String str;
        if (((Number) obj).intValue() > 0) {
            Activity activityLIZ = C1388190mED.LIZ((Context) awS297S0300000_19.l0);
            if (activityLIZ != null) {
                FanGroupChooseGroupFragmentParam fanGroupChooseGroupFragmentParam = ((FanGroupChooseGroupFragment) awS297S0300000_19.l2).LLIZ;
                if (fanGroupChooseGroupFragmentParam == null || (str = fanGroupChooseGroupFragmentParam.inviteTargetUserSuccessToastContent) == null) {
                    str = "";
                }
                C1389890mGx c1389890mGx = new C1389890mGx(activityLIZ);
                c1389890mGx.LIZ(true);
                c1389890mGx.LJIIJ(str);
                c1389890mGx.LJIIJJI();
            }
            boolean z = ((FanGroupChooseGroupFragmentParam) awS297S0300000_19.l1).isFullScreen;
            FanGroupChooseGroupFragment fanGroupChooseGroupFragment = (FanGroupChooseGroupFragment) awS297S0300000_19.l2;
            C1616906Ut.LIZ(z, fanGroupChooseGroupFragment, fanGroupChooseGroupFragment.getActivity());
        }
        return Unit.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$18(AwS297S0300000_19 awS297S0300000_19, Object obj, Object obj2) {
        int i;
        int iIntValue = ((Number) obj2).intValue();
        TuxIconView tuxIconView = (TuxIconView) awS297S0300000_19.l0;
        int i2 = 0;
        if (iIntValue == 0) {
            ((C259800zU) awS297S0300000_19.l1).element = "upload_date";
            i = 0;
        } else {
            ((C259800zU) awS297S0300000_19.l1).element = "most_watched";
            i = 8;
        }
        C786410Ut5.LLLLLLZZ(tuxIconView, i);
        TuxIconView tuxIconView2 = (TuxIconView) awS297S0300000_19.l2;
        if (iIntValue != 1) {
            i2 = 8;
        }
        C786410Ut5.LLLLLLZZ(tuxIconView2, i2);
        return Unit.LIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0095  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$19(kotlin.jvm.internal.AwS297S0300000_19 r8, java.lang.Object r9, java.lang.Object r10) {
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
            android.content.Context r1 = (android.content.Context) r1
            r0 = 2131857358(0x7f118fce, float:1.9348474E38)
            java.lang.String r5 = r1.getString(r0)
            r7 = 1
            r0 = -1633490746(0xffffffff9ea2e8c6, float:-1.724869E-20)
            r4.LJJIIJZLJL(r0)
            java.lang.Object r0 = r8.l1
            com.ss.android.ugc.aweme.account.login.twostep.TrustedDevicesItemCell r0 = (com.ss.android.ugc.aweme.account.login.twostep.TrustedDevicesItemCell) r0
            boolean r3 = r4.LJII(r0)
            java.lang.Object r0 = r8.l2
            kotlin.jvm.functions.Function0 r0 = (kotlin.jvm.functions.Function0) r0
            boolean r0 = r4.LJJIIJ(r0)
            r3 = r3 | r0
            java.lang.Object r2 = r8.l1
            com.ss.android.ugc.aweme.account.login.twostep.TrustedDevicesItemCell r2 = (com.ss.android.ugc.aweme.account.login.twostep.TrustedDevicesItemCell) r2
            java.lang.Object r1 = r8.l2
            kotlin.jvm.functions.Function0 r1 = (kotlin.jvm.functions.Function0) r1
            java.lang.Object r6 = r4.LJJ()
            if (r3 != 0) goto L54
            X.0tph r0 = X.InterfaceC1680500tpg.LIZ
            r0.getClass()
            X.0tpi r0 = X.C1680510tph.LIZIZ
            if (r6 != r0) goto L5e
        L54:
            kotlin.jvm.internal.AwS420S0200000_19 r6 = new kotlin.jvm.internal.AwS420S0200000_19
            r0 = 211(0xd3, float:2.96E-43)
            r6.<init>(r2, r1, r0)
            r4.LJJIJIIJI(r6)
        L5e:
            kotlin.jvm.functions.Function0 r6 = (kotlin.jvm.functions.Function0) r6
            r4.LJ()
            r2 = 48
            r3 = 0
            X.C1668330tW3.LJIIIIZZ(r2, r3, r4, r5, r6, r7)
            java.lang.Object r1 = r8.l0
            android.content.Context r1 = (android.content.Context) r1
            r0 = 2131857393(0x7f118ff1, float:1.9348545E38)
            java.lang.String r5 = r1.getString(r0)
            r0 = 5004770(0x4c5de2, float:7.013177E-39)
            r4.LJJIIJZLJL(r0)
            java.lang.Object r0 = r8.l2
            kotlin.jvm.functions.Function0 r0 = (kotlin.jvm.functions.Function0) r0
            boolean r0 = r4.LJJIIJ(r0)
            java.lang.Object r1 = r8.l2
            kotlin.jvm.functions.Function0 r1 = (kotlin.jvm.functions.Function0) r1
            java.lang.Object r6 = r4.LJJ()
            if (r0 != 0) goto L95
            X.0tph r0 = X.InterfaceC1680500tpg.LIZ
            r0.getClass()
            X.0tpi r0 = X.C1680510tph.LIZIZ
            if (r6 != r0) goto L9f
        L95:
            kotlin.jvm.internal.AwS563S0100000_19 r6 = new kotlin.jvm.internal.AwS563S0100000_19
            r0 = 3364(0xd24, float:4.714E-42)
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
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS297S0300000_19.invoke$19(kotlin.jvm.internal.AwS297S0300000_19, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0054  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$2(kotlin.jvm.internal.AwS297S0300000_19 r6, java.lang.Object r7, java.lang.Object r8) {
        /*
            r4 = r7
            X.0tpg r4 = (X.InterfaceC1680500tpg) r4
            java.lang.Number r8 = (java.lang.Number) r8
            int r0 = r8.intValue()
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
            java.lang.Object r1 = r6.l0
            android.content.Context r1 = (android.content.Context) r1
            r0 = 2131821883(0x7f11053b, float:1.9276522E38)
            java.lang.String r5 = r1.getString(r0)
            r7 = 1
            r0 = -1633490746(0xffffffff9ea2e8c6, float:-1.724869E-20)
            r4.LJJIIJZLJL(r0)
            java.lang.Object r0 = r6.l1
            com.ss.android.ugc.aweme.mix.editname.EditPlayListNameFragment r0 = (com.ss.android.ugc.aweme.mix.editname.EditPlayListNameFragment) r0
            boolean r3 = r4.LJII(r0)
            java.lang.Object r0 = r6.l2
            kotlin.jvm.functions.Function0 r0 = (kotlin.jvm.functions.Function0) r0
            boolean r0 = r4.LJJIIJ(r0)
            r3 = r3 | r0
            java.lang.Object r2 = r6.l1
            com.ss.android.ugc.aweme.mix.editname.EditPlayListNameFragment r2 = (com.ss.android.ugc.aweme.mix.editname.EditPlayListNameFragment) r2
            java.lang.Object r1 = r6.l2
            kotlin.jvm.functions.Function0 r1 = (kotlin.jvm.functions.Function0) r1
            java.lang.Object r6 = r4.LJJ()
            if (r3 != 0) goto L54
            X.0tph r0 = X.InterfaceC1680500tpg.LIZ
            r0.getClass()
            X.0tpi r0 = X.C1680510tph.LIZIZ
            if (r6 != r0) goto L5e
        L54:
            kotlin.jvm.internal.AwS419S0200000_18 r6 = new kotlin.jvm.internal.AwS419S0200000_18
            r0 = 39
            r6.<init>(r2, r1, r0)
            r4.LJJIJIIJI(r6)
        L5e:
            kotlin.jvm.functions.Function0 r6 = (kotlin.jvm.functions.Function0) r6
            r4.LJ()
            r2 = 48
            r3 = 0
            X.C1668330tW3.LJIIIIZZ(r2, r3, r4, r5, r6, r7)
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS297S0300000_19.invoke$2(kotlin.jvm.internal.AwS297S0300000_19, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    public static final Object invoke$20(AwS297S0300000_19 awS297S0300000_19, Object obj, Object obj2) {
        if (((Boolean) obj).booleanValue()) {
            C1231130i8t.LJ((Context) awS297S0300000_19.l0, true, (C1231150i8v) awS297S0300000_19.l1, EnumC1993507rR.GROUP_JOIN_SCENE_DEFAULT.getValue(), "", (GroupJoinResponse) awS297S0300000_19.l2);
        }
        return Unit.LIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00f0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$3(kotlin.jvm.internal.AwS297S0300000_19 r12, java.lang.Object r13, java.lang.Object r14) {
        /*
            Method dump skipped, instruction units count: 314
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS297S0300000_19.invoke$3(kotlin.jvm.internal.AwS297S0300000_19, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x009d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$4(kotlin.jvm.internal.AwS297S0300000_19 r8, java.lang.Object r9, java.lang.Object r10) {
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
            java.lang.Object r0 = r8.l0
            android.content.Context r0 = (android.content.Context) r0
            android.content.res.Resources r1 = r0.getResources()
            r0 = 2131833949(0x7f11345d, float:1.9300995E38)
            java.lang.String r5 = r1.getString(r0)
            r7 = 1
            r0 = -1633490746(0xffffffff9ea2e8c6, float:-1.724869E-20)
            r4.LJJIIJZLJL(r0)
            java.lang.Object r0 = r8.l1
            com.ss.android.ugc.gamora.recorder.progress.f r0 = (com.ss.android.ugc.gamora.recorder.progress.f) r0
            boolean r3 = r4.LJII(r0)
            java.lang.Object r0 = r8.l2
            kotlin.jvm.functions.Function0 r0 = (kotlin.jvm.functions.Function0) r0
            boolean r0 = r4.LJJIIJ(r0)
            r3 = r3 | r0
            java.lang.Object r2 = r8.l1
            com.ss.android.ugc.gamora.recorder.progress.f r2 = (com.ss.android.ugc.gamora.recorder.progress.f) r2
            java.lang.Object r1 = r8.l2
            kotlin.jvm.functions.Function0 r1 = (kotlin.jvm.functions.Function0) r1
            java.lang.Object r6 = r4.LJJ()
            if (r3 != 0) goto L58
            X.0tph r0 = X.InterfaceC1680500tpg.LIZ
            r0.getClass()
            X.0tpi r0 = X.C1680510tph.LIZIZ
            if (r6 != r0) goto L62
        L58:
            kotlin.jvm.internal.AwS420S0200000_19 r6 = new kotlin.jvm.internal.AwS420S0200000_19
            r0 = 107(0x6b, float:1.5E-43)
            r6.<init>(r2, r1, r0)
            r4.LJJIJIIJI(r6)
        L62:
            kotlin.jvm.functions.Function0 r6 = (kotlin.jvm.functions.Function0) r6
            r4.LJ()
            r2 = 48
            r3 = 0
            X.C1668330tW3.LJIIIIZZ(r2, r3, r4, r5, r6, r7)
            java.lang.Object r0 = r8.l0
            android.content.Context r0 = (android.content.Context) r0
            android.content.res.Resources r1 = r0.getResources()
            r0 = 2131833948(0x7f11345c, float:1.9300992E38)
            java.lang.String r5 = r1.getString(r0)
            r0 = 5004770(0x4c5de2, float:7.013177E-39)
            r4.LJJIIJZLJL(r0)
            java.lang.Object r0 = r8.l2
            kotlin.jvm.functions.Function0 r0 = (kotlin.jvm.functions.Function0) r0
            boolean r0 = r4.LJJIIJ(r0)
            java.lang.Object r1 = r8.l2
            kotlin.jvm.functions.Function0 r1 = (kotlin.jvm.functions.Function0) r1
            java.lang.Object r6 = r4.LJJ()
            if (r0 != 0) goto L9d
            X.0tph r0 = X.InterfaceC1680500tpg.LIZ
            r0.getClass()
            X.0tpi r0 = X.C1680510tph.LIZIZ
            if (r6 != r0) goto La7
        L9d:
            kotlin.jvm.internal.AwS563S0100000_19 r6 = new kotlin.jvm.internal.AwS563S0100000_19
            r0 = 1972(0x7b4, float:2.763E-42)
            r6.<init>(r1, r0)
            r4.LJJIJIIJI(r6)
        La7:
            kotlin.jvm.functions.Function0 r6 = (kotlin.jvm.functions.Function0) r6
            r4.LJ()
            r2 = 48
            r3 = 0
            X.C1668330tW3.LJIIIZ(r2, r3, r4, r5, r6, r7)
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS297S0300000_19.invoke$4(kotlin.jvm.internal.AwS297S0300000_19, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    public static final Object invoke$5(AwS297S0300000_19 awS297S0300000_19, Object obj, Object obj2) {
        Integer num = (Integer) obj;
        View view = (View) obj2;
        int type = EnumC1248260iaW.ICON.getType();
        if (num != null && num.intValue() == type) {
            ((AccountOrgIdentifierProtocol) awS297S0300000_19.l0).LJJLIIIJLJLI(view);
            return view;
        }
        int type2 = EnumC1248260iaW.TEXT.getType();
        if (num != null && num.intValue() == type2) {
            AccountOrgIdentifierProtocol.LJJLJLI(((AccountOrgIdentifierProtocol) awS297S0300000_19.l0).LJJLL(), ((AccountOrgIdentifierProtocol) awS297S0300000_19.l0).LJJLL(), view);
            return view;
        }
        int type3 = EnumC1248260iaW.ICON_TEXT.getType();
        if (num != null && num.intValue() == type3) {
            ((AbstractC1247880iZu) awS297S0300000_19.l1).LIZJ(EnumC1248260iaW.UNKONWN, new AwS633S0100000_19((AccountOrgIdentifierProtocol) awS297S0300000_19.l0, 115));
            ((C1248670ibB) ((AbstractC1247880iZu) awS297S0300000_19.l1)).LJ(new AwS633S0100000_19((AccountOrgIdentifierProtocol) awS297S0300000_19.l0, 116));
            return view;
        }
        return new LinearLayout((Context) awS297S0300000_19.l2);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00b7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$6(kotlin.jvm.internal.AwS297S0300000_19 r9, java.lang.Object r10, java.lang.Object r11) {
        /*
            Method dump skipped, instruction units count: 206
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS297S0300000_19.invoke$6(kotlin.jvm.internal.AwS297S0300000_19, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    public static final Object invoke$7(AwS297S0300000_19 awS297S0300000_19, Object obj, Object obj2) {
        Integer num = (Integer) obj;
        View view = (View) obj2;
        int type = EnumC1248260iaW.ICON.getType();
        if (num != null && num.intValue() == type) {
            LinearLayout linearLayout = new LinearLayout((Context) awS297S0300000_19.l0);
            HeaderAdvancedFeatureBaseUIComponent headerAdvancedFeatureBaseUIComponent = (HeaderAdvancedFeatureBaseUIComponent) awS297S0300000_19.l2;
            Context context = (Context) awS297S0300000_19.l0;
            AbstractC1247880iZu abstractC1247880iZu = (AbstractC1247880iZu) awS297S0300000_19.l1;
            headerAdvancedFeatureBaseUIComponent.Ap(context, linearLayout);
            headerAdvancedFeatureBaseUIComponent.Bp((TuxIconView) view);
            abstractC1247880iZu.LIZ();
            linearLayout.addView(view);
            return linearLayout;
        }
        int type2 = EnumC1248260iaW.TEXT.getType();
        if (num != null && num.intValue() == type2) {
            LinearLayout linearLayout2 = new LinearLayout((Context) awS297S0300000_19.l0);
            HeaderAdvancedFeatureBaseUIComponent headerAdvancedFeatureBaseUIComponent2 = (HeaderAdvancedFeatureBaseUIComponent) awS297S0300000_19.l2;
            Context context2 = (Context) awS297S0300000_19.l0;
            AbstractC1247880iZu abstractC1247880iZu2 = (AbstractC1247880iZu) awS297S0300000_19.l1;
            headerAdvancedFeatureBaseUIComponent2.Ap(context2, linearLayout2);
            headerAdvancedFeatureBaseUIComponent2.Ep((TuxTextView) view);
            abstractC1247880iZu2.LIZ();
            linearLayout2.addView(view);
            return linearLayout2;
        }
        int type3 = EnumC1248260iaW.ICON_TEXT.getType();
        if (num != null && num.intValue() == type3) {
            ((AbstractC1247880iZu) awS297S0300000_19.l1).LIZJ(EnumC1248260iaW.UNKONWN, new AwS455S0200000_19((HeaderAdvancedFeatureBaseUIComponent) awS297S0300000_19.l2, (Context) awS297S0300000_19.l0, 28));
            ((C1248670ibB) ((AbstractC1247880iZu) awS297S0300000_19.l1)).LJ(new AwS633S0100000_19((HeaderAdvancedFeatureBaseUIComponent) awS297S0300000_19.l2, 156));
            return ((C1248670ibB) ((AbstractC1247880iZu) awS297S0300000_19.l1)).LJ;
        }
        return null;
    }

    public static final Object invoke$8(AwS297S0300000_19 awS297S0300000_19, Object obj, Object obj2) {
        Integer num = (Integer) obj;
        View view = (View) obj2;
        int type = EnumC1248260iaW.ICON.getType();
        if (num != null && num.intValue() == type) {
            LinearLayout linearLayout = new LinearLayout((Context) awS297S0300000_19.l0);
            BioStructuralInfoBaseComponent bioStructuralInfoBaseComponent = (BioStructuralInfoBaseComponent) awS297S0300000_19.l2;
            Context context = (Context) awS297S0300000_19.l0;
            AbstractC1247880iZu abstractC1247880iZu = (AbstractC1247880iZu) awS297S0300000_19.l1;
            bioStructuralInfoBaseComponent.Fp(context, linearLayout);
            TuxIconView tuxIconView = (TuxIconView) view;
            tuxIconView.setId(R.id.c1x);
            C786410Ut5.M6(tuxIconView, new LinearLayout.LayoutParams(((Number) bioStructuralInfoBaseComponent.LLJZ.getValue()).intValue(), ((Number) bioStructuralInfoBaseComponent.LLJZ.getValue()).intValue()));
            abstractC1247880iZu.LIZ();
            linearLayout.addView(view);
            return linearLayout;
        }
        int type2 = EnumC1248260iaW.TEXT.getType();
        if (num != null && num.intValue() == type2) {
            LinearLayout linearLayout2 = new LinearLayout((Context) awS297S0300000_19.l0);
            BioStructuralInfoBaseComponent bioStructuralInfoBaseComponent2 = (BioStructuralInfoBaseComponent) awS297S0300000_19.l2;
            Context context2 = (Context) awS297S0300000_19.l0;
            AbstractC1247880iZu abstractC1247880iZu2 = (AbstractC1247880iZu) awS297S0300000_19.l1;
            bioStructuralInfoBaseComponent2.Fp(context2, linearLayout2);
            bioStructuralInfoBaseComponent2.Gp((TuxTextView) view);
            abstractC1247880iZu2.LIZ();
            linearLayout2.addView(view);
            return linearLayout2;
        }
        int type3 = EnumC1248260iaW.ICON_TEXT.getType();
        if (num != null && num.intValue() == type3) {
            ((AbstractC1247880iZu) awS297S0300000_19.l1).LIZJ(EnumC1248260iaW.UNKONWN, new AwS455S0200000_19((BioStructuralInfoBaseComponent) awS297S0300000_19.l2, (BioStructuralInfoBaseComponent<BizBaseData>) awS297S0300000_19.l0, (Context) 29));
            ((C1248670ibB) ((AbstractC1247880iZu) awS297S0300000_19.l1)).LJ(new AwS633S0100000_19((BioStructuralInfoBaseComponent) awS297S0300000_19.l2, (BioStructuralInfoBaseComponent<BizBaseData>) 157));
            return ((C1248670ibB) ((AbstractC1247880iZu) awS297S0300000_19.l1)).LJ;
        }
        return null;
    }

    public static final Object invoke$9(AwS297S0300000_19 awS297S0300000_19, Object obj, Object obj2) {
        String str;
        int i;
        ProfilePlatformProtocol<BizBaseData> profilePlatformProtocolAp;
        ProfileComponents profileComponents;
        Integer num = (Integer) obj;
        View view = (View) obj2;
        AccountInfoBaseUIComponent accountInfoBaseUIComponent = (AccountInfoBaseUIComponent) awS297S0300000_19.l0;
        accountInfoBaseUIComponent.getClass();
        Set setSingleton = Collections.singleton("user_account_honor_label");
        C1248950ibd c1248950ibd = (C1248950ibd) accountInfoBaseUIComponent.LLJJL.getValue();
        if (c1248950ibd != null && (profileComponents = c1248950ibd.LLILLJJLI) != null) {
            str = profileComponents.componentName;
        } else {
            str = null;
        }
        boolean zLJJJJ = C13LP.LJJJJ(str, setSingleton);
        boolean z = true;
        if (!C268330AfP.LJIIJ() ? zLJJJJ : (profilePlatformProtocolAp = accountInfoBaseUIComponent.ap()) == null || !(!(profilePlatformProtocolAp instanceof ProfileInfoPronounsProtocol)) || zLJJJJ) {
            z = false;
        }
        int i2 = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("isPressEnabled: ");
        sbLIZ.append(z);
        C1720106oR.LJI("BaseUIComponent", C2188811AlT.LIZIZ(sbLIZ));
        if (z) {
            C428150Gqb.LIZ(view, EnumC428940Grs.ALPHA, 0.0f);
        }
        int type = EnumC1248260iaW.ICON.getType();
        if (num != null && num.intValue() == type) {
            ((AccountInfoBaseUIComponent) awS297S0300000_19.l0).up(view);
            return ((AbstractC1247880iZu) awS297S0300000_19.l1).LIZ();
        }
        int type2 = EnumC1248260iaW.TEXT.getType();
        if (num != null && num.intValue() == type2) {
            AccountInfoBaseUIComponent accountInfoBaseUIComponent2 = (AccountInfoBaseUIComponent) awS297S0300000_19.l0;
            if (C2537109wv.LJI() && !C268330AfP.LJIIJ()) {
                i = 10;
            } else {
                i = 0;
            }
            accountInfoBaseUIComponent2.yp(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(i)), view);
            return ((AbstractC1247880iZu) awS297S0300000_19.l1).LIZ();
        }
        int type3 = EnumC1248260iaW.ICON_TEXT.getType();
        if (num != null && num.intValue() == type3) {
            ((AbstractC1247880iZu) awS297S0300000_19.l1).LIZJ(EnumC1248260iaW.UNKONWN, new AwS633S0100000_19((AccountInfoBaseUIComponent) awS297S0300000_19.l0, (AccountInfoBaseUIComponent<BizBaseData>) 164));
            ((C1248670ibB) ((AbstractC1247880iZu) awS297S0300000_19.l1)).LJ(new AwS633S0100000_19((AccountInfoBaseUIComponent) awS297S0300000_19.l0, (AccountInfoBaseUIComponent<BizBaseData>) 165));
            return ((C1248670ibB) ((AbstractC1247880iZu) awS297S0300000_19.l1)).LJ;
        }
        return new LinearLayout((Context) awS297S0300000_19.l2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS297S0300000_19(C05P0 c05p0, StoryHighlightsCreationVM storyHighlightsCreationVM, InterfaceC497601wk interfaceC497601wk, int i) {
        super(2);
        this.$t = i;
        this.l0 = interfaceC497601wk;
        this.l1 = storyHighlightsCreationVM;
        this.l2 = c05p0;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS297S0300000_19(AbstractC1255880imo abstractC1255880imo, InterfaceC1603360rpG interfaceC1603360rpG, DetailPageComponent detailPageComponent, int i) {
        super(2);
        this.$t = i;
        this.l0 = abstractC1255880imo;
        this.l1 = interfaceC1603360rpG;
        this.l2 = detailPageComponent;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS297S0300000_19(C19EG c19eg, C19EG c19eg2, ProfileAigcProgressAssem profileAigcProgressAssem, Function0<Unit> function0) {
        super(2);
        this.$t = function0;
        this.l0 = c19eg;
        this.l1 = c19eg2;
        this.l2 = profileAigcProgressAssem;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS297S0300000_19(Activity activity, Activity activity2, C1649560t1m c1649560t1m, Function0<Unit> function0) {
        super(2);
        this.$t = function0;
        this.l0 = activity;
        this.l1 = activity2;
        this.l2 = c1649560t1m;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS297S0300000_19(Context context, C1231150i8v c1231150i8v, GroupJoinResponse groupJoinResponse, int i) {
        super(2);
        this.$t = i;
        this.l0 = context;
        this.l1 = c1231150i8v;
        this.l2 = groupJoinResponse;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS297S0300000_19(Context context, AbstractC1247880iZu abstractC1247880iZu, HeaderAdvancedFeatureBaseUIComponent headerAdvancedFeatureBaseUIComponent, int i) {
        super(2);
        this.$t = i;
        this.l0 = context;
        this.l1 = abstractC1247880iZu;
        this.l2 = headerAdvancedFeatureBaseUIComponent;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS297S0300000_19(Context context, Context context2, AbstractC1247880iZu abstractC1247880iZu, BioStructuralInfoBaseComponent<T> bioStructuralInfoBaseComponent) {
        super(2);
        this.$t = bioStructuralInfoBaseComponent;
        this.l0 = context;
        this.l1 = context2;
        this.l2 = abstractC1247880iZu;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS297S0300000_19(Context context, AbstractC1247880iZu abstractC1247880iZu, ProfileHeaderTopTipsBaseUIComponent profileHeaderTopTipsBaseUIComponent, int i) {
        super(2);
        this.$t = i;
        this.l0 = context;
        this.l1 = abstractC1247880iZu;
        this.l2 = profileHeaderTopTipsBaseUIComponent;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS297S0300000_19(Context context, Context context2, TrustedDevicesItemCell trustedDevicesItemCell, Function0<Unit> function0) {
        super(2);
        this.$t = function0;
        this.l0 = context;
        this.l1 = context2;
        this.l2 = trustedDevicesItemCell;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS297S0300000_19(Context context, Context context2, InboxSearchDefaultPageFoldCell inboxSearchDefaultPageFoldCell, Function0<Unit> function0) {
        super(2);
        this.$t = function0;
        this.l0 = context;
        this.l1 = context2;
        this.l2 = inboxSearchDefaultPageFoldCell;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS297S0300000_19(Context context, Context context2, EditPlayListNameFragment editPlayListNameFragment, Function0<Unit> function0) {
        super(2);
        this.$t = function0;
        this.l0 = context;
        this.l1 = context2;
        this.l2 = editPlayListNameFragment;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS297S0300000_19(Context context, FanGroupChooseGroupFragmentParam fanGroupChooseGroupFragmentParam, FanGroupChooseGroupFragment fanGroupChooseGroupFragment, int i) {
        super(2);
        this.$t = i;
        this.l0 = context;
        this.l1 = fanGroupChooseGroupFragmentParam;
        this.l2 = fanGroupChooseGroupFragment;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS297S0300000_19(Context context, Context context2, f fVar, Function0<Unit> function0) {
        super(2);
        this.$t = function0;
        this.l0 = context;
        this.l1 = context2;
        this.l2 = fVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS297S0300000_19(View view, View view2, ProfileAigcChooseStyleFragment profileAigcChooseStyleFragment, Function0<Unit> function0) {
        super(2);
        this.$t = function0;
        this.l0 = view;
        this.l1 = view2;
        this.l2 = profileAigcChooseStyleFragment;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS297S0300000_19(TuxIconView tuxIconView, TuxIconView tuxIconView2, C259800zU<String> c259800zU, TuxIconView tuxIconView3) {
        super(2);
        this.$t = tuxIconView3;
        this.l0 = tuxIconView;
        this.l1 = tuxIconView2;
        this.l2 = c259800zU;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS297S0300000_19(AbsRecUserCell absRecUserCell, AbsRecUserCell<ITEM> absRecUserCell2, IUserCardListAbility iUserCardListAbility, C1261860iwS c1261860iwS) {
        super(2);
        this.$t = c1261860iwS;
        this.l0 = absRecUserCell;
        this.l1 = absRecUserCell2;
        this.l2 = iUserCardListAbility;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS297S0300000_19(AccountOrgIdentifierProtocol accountOrgIdentifierProtocol, AbstractC1247880iZu abstractC1247880iZu, Context context, int i) {
        super(2);
        this.$t = i;
        this.l0 = accountOrgIdentifierProtocol;
        this.l1 = abstractC1247880iZu;
        this.l2 = context;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS297S0300000_19(AccountInfoBaseUIComponent accountInfoBaseUIComponent, AccountInfoBaseUIComponent<T> accountInfoBaseUIComponent2, AbstractC1247880iZu abstractC1247880iZu, Context context) {
        super(2);
        this.$t = context;
        this.l0 = accountInfoBaseUIComponent;
        this.l1 = accountInfoBaseUIComponent2;
        this.l2 = abstractC1247880iZu;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS297S0300000_19(AccountUserInfoBaseUIComponent accountUserInfoBaseUIComponent, AccountUserInfoBaseUIComponent<T> accountUserInfoBaseUIComponent2, AbstractC1247880iZu abstractC1247880iZu, Context context) {
        super(2);
        this.$t = context;
        this.l0 = accountUserInfoBaseUIComponent;
        this.l1 = accountUserInfoBaseUIComponent2;
        this.l2 = abstractC1247880iZu;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS297S0300000_19(CommonInfoBaseUIComponent commonInfoBaseUIComponent, CommonInfoBaseUIComponent<T> commonInfoBaseUIComponent2, AbstractC1247880iZu abstractC1247880iZu, Context context) {
        super(2);
        this.$t = context;
        this.l0 = commonInfoBaseUIComponent;
        this.l1 = commonInfoBaseUIComponent2;
        this.l2 = abstractC1247880iZu;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS297S0300000_19(ProfileUserAccountNameInfoBaseComponent profileUserAccountNameInfoBaseComponent, ProfileUserAccountNameInfoBaseComponent<T> profileUserAccountNameInfoBaseComponent2, AbstractC1247880iZu abstractC1247880iZu, Context context) {
        super(2);
        this.$t = context;
        this.l0 = profileUserAccountNameInfoBaseComponent;
        this.l1 = profileUserAccountNameInfoBaseComponent2;
        this.l2 = abstractC1247880iZu;
    }
}
