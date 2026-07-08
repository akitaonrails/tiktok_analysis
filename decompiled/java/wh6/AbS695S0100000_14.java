package wh6;

import X.AbstractC879060Ye8;
import X.AbstractViewOnClickListenerC1637610siV;
import X.C054G;
import X.C06Q7;
import X.C06XR;
import X.C0HTI;
import X.C0I0B;
import X.C0OO0;
import X.C0PEM;
import X.C0Y8T;
import X.C0YNP;
import X.C0Z92;
import X.C0ZDX;
import X.C1229980i72;
import X.C1230910i8X;
import X.C1391890mKB;
import X.C1391960mKI;
import X.C13LQ;
import X.C1720706oX;
import X.C1727806pg;
import X.C1DFH;
import X.C2107308Nj;
import X.C2241931Cox;
import X.C23250099c;
import X.C293390Bej;
import X.C457780HxI;
import X.C461720I8s;
import X.C724240Sb0;
import X.C724270Sb3;
import X.C866140XyO;
import X.C866530Xz1;
import X.C869590Y9l;
import X.C879070Ye9;
import X.C880080Yfm;
import X.C893560Z3q;
import X.C898670ZNh;
import X.C899240ZPm;
import X.C899350ZPx;
import X.C914150Ztd;
import X.EnumC879080YeA;
import X.EnumC899970ZSh;
import X.InterfaceC2217461Bqa;
import android.content.Context;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.tux.sheet.intro.TuxPanel;
import com.ss.android.ugc.aweme.analytics.IIMChatRoomAnalytics;
import com.ss.android.ugc.aweme.chatdetail.redesign.detailpage.assem.GroupDetailAvatarAssem;
import com.ss.android.ugc.aweme.chatdetail.redesign.detailpage.assem.GroupDetailNameAndDescAssem;
import com.ss.android.ugc.aweme.chatdetail.redesign.operation.editinfo.EditGroupInfoChangeAvatarAssem;
import com.ss.android.ugc.aweme.chatdetail.redesign.operation.editinfo.EditGroupInfoNavAssem;
import com.ss.android.ugc.aweme.chatdetail.redesign.operation.editinfo.EditGroupInfoViewModel;
import com.ss.android.ugc.aweme.experiment.ImPublicGroupTagConfigModel;
import com.ss.android.ugc.aweme.experiment.TagPanelConfig;
import com.ss.android.ugc.aweme.fangroup.view.FanGroupCreateAssemCell;
import com.ss.android.ugc.aweme.group.MockedConvVM;
import com.ss.android.ugc.aweme.im.chatroom.common.titlebar.SingleTitleBarRightAssem;
import com.ss.android.ugc.aweme.im.chatroom.common.titlebar.SingleTitleBarRightViewModel;
import com.ss.android.ugc.aweme.im.message.content.ShareAwemeContent;
import com.ss.android.ugc.aweme.im.message.template.card.AwemeCardTemplate;
import com.ss.android.ugc.aweme.im.message.template.card.BaseTemplate;
import com.ss.android.ugc.aweme.im.saas.host.api.foundation.IMCrossAppFeatureDiffApi;
import com.ss.android.ugc.aweme.im.sdk.chatdetail.analytics.IMGroupChatDetailAnalytics;
import com.ss.android.ugc.aweme.im.service.aweme.IAwemeOpenHelper;
import com.ss.android.ugc.aweme.msg.AwemeCardCenterAssem;
import com.ss.android.ugc.aweme.msg.GroupCreationAssem;
import com.ss.android.ugc.aweme.publicgroup.popup.PublicGroupTagIntroPanelHelper$show$1;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.ss.android.ugc.aweme.titlebar.GroupTitleBarCenterAssem;
import com.ss.android.ugc.aweme.titlebar.GroupTitleBarRightAssem;
import com.tts.oecverify.BdTuring;
import com.zhiliaoapp.musically.R;
import java.util.Collections;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS248S0000000_14;
import kotlin.jvm.internal.AFwS298S0000000_14;
import kotlin.jvm.internal.AwS558S0100000_14;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes15.dex */
public class AbS695S0100000_14 extends AbstractViewOnClickListenerC1637610siV {
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
            default:
                super.LIZ(view);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbS695S0100000_14(Object obj, int i) {
        super(300L);
        this.$t = i;
        this.l0 = obj;
    }

    public static final void LIZ$0(AbS695S0100000_14 abS695S0100000_14, View view) {
        Context context;
        C1229980i72 c1229980i72;
        C1230910i8X c1230910i8X;
        if (view != null && (context = ((FanGroupCreateAssemCell) abS695S0100000_14.l0).getContext()) != null && (c1229980i72 = (C1229980i72) ((FanGroupCreateAssemCell) abS695S0100000_14.l0).LLJJLIIIJLLLLLLLZ.getValue()) != null && (c1230910i8X = c1229980i72.LLILZIL) != null) {
            SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(context, "//im/fan_group_create");
            smartRouteBuildRoute.withParam("build_param", c1230910i8X);
            smartRouteBuildRoute.open();
        }
    }

    public static final void LIZ$1(AbS695S0100000_14 abS695S0100000_14, View view) {
        if (view != null) {
            ((GroupDetailAvatarAssem) abS695S0100000_14.l0).op().BQ2(((GroupDetailAvatarAssem) abS695S0100000_14.l0).LJJIJL().getContext());
        }
    }

    public static final void LIZ$10(AbS695S0100000_14 abS695S0100000_14, View view) {
        if (view != null) {
            AssemVMLazy assemVMLazy = ((GroupTitleBarCenterAssem) abS695S0100000_14.l0).LLJJJIL;
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = GroupTitleBarCenterAssem.LLJZ;
            ((MockedConvVM) assemVMLazy.getValue()).vQ2(((GroupTitleBarCenterAssem) abS695S0100000_14.l0).getContentView(), "title_bar_group_name", new AwS558S0100000_14((GroupTitleBarCenterAssem) abS695S0100000_14.l0, 1141));
        }
    }

    public static final void LIZ$11(AbS695S0100000_14 abS695S0100000_14, View view) {
        if (view != null) {
            AssemVMLazy assemVMLazy = ((GroupTitleBarRightAssem) abS695S0100000_14.l0).LLJJIJIL;
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = GroupTitleBarRightAssem.LLJJJJ;
            ((MockedConvVM) assemVMLazy.getValue()).vQ2(((GroupTitleBarRightAssem) abS695S0100000_14.l0).getContentView(), "title_bar_detail_page", new AwS558S0100000_14((GroupTitleBarRightAssem) abS695S0100000_14.l0, 1146));
        }
    }

    public static final void LIZ$12(AbS695S0100000_14 abS695S0100000_14, View view) {
        if (view != null) {
            GroupCreationAssem groupCreationAssem = (GroupCreationAssem) abS695S0100000_14.l0;
            if (groupCreationAssem.op(groupCreationAssem.tp().getConversationId()) && C1727806pg.LIZ.LIZ("group_chat_edit_group_info", ((GroupCreationAssem) abS695S0100000_14.l0).tp().getConversationId(), C461720I8s.LIZIZ(), false)) {
                ((GroupCreationAssem) abS695S0100000_14.l0).sp().vQ2(((GroupCreationAssem) abS695S0100000_14.l0).getContentView(), "group_creation_card_avatar", new AwS558S0100000_14((GroupCreationAssem) abS695S0100000_14.l0, 1304));
            }
        }
    }

    public static final void LIZ$13(AbS695S0100000_14 abS695S0100000_14, View view) {
        if (view != null) {
            ((GroupCreationAssem) abS695S0100000_14.l0).sp().vQ2(((GroupCreationAssem) abS695S0100000_14.l0).getContentView(), "group_creation_card_edit", new AwS558S0100000_14((GroupCreationAssem) abS695S0100000_14.l0, 1305));
        }
    }

    public static final void LIZ$14(AbS695S0100000_14 abS695S0100000_14, View view) {
        Fragment fragmentLJI;
        Context context;
        TagPanelConfig tagPanelConfig;
        String string;
        String string2;
        String string3;
        String string4;
        if (view != null && (fragmentLJI = C724240Sb0.LJI((GroupTitleBarCenterAssem) abS695S0100000_14.l0)) != null && fragmentLJI.isAdded() && (context = fragmentLJI.getContext()) != null) {
            FragmentManager childFragmentManager = fragmentLJI.getChildFragmentManager();
            if (!childFragmentManager.LJLJJI() && childFragmentManager.LJJJJZI("PublicGroupTagIntroPanel") == null) {
                C899350ZPx.LIZ.getClass();
                ImPublicGroupTagConfigModel imPublicGroupTagConfigModel = (ImPublicGroupTagConfigModel) SettingsManager.LIZLLL().LJIIIIZZ("im_public_group_tag_config", ImPublicGroupTagConfigModel.class, C899350ZPx.LIZIZ);
                if (imPublicGroupTagConfigModel != null) {
                    tagPanelConfig = imPublicGroupTagConfigModel.tagPanelConfig;
                } else {
                    tagPanelConfig = null;
                }
                C1391960mKI c1391960mKI = new C1391960mKI();
                C0HTI c0hti = new C0HTI();
                c0hti.LIZ = R.drawable.a0d;
                c1391960mKI.LIZLLL = c0hti.LIZ(context);
                c1391960mKI.LJI = 1;
                if (tagPanelConfig == null || (string = tagPanelConfig.mainTitle) == null || !(!a0.LJJJIL(string))) {
                    string = context.getString(2131831872);
                }
                c1391960mKI.LJII = string;
                C1391890mKB[] c1391890mKBArr = new C1391890mKB[2];
                if (tagPanelConfig == null || (string2 = tagPanelConfig.desc1) == null || !(!a0.LJJJIL(string2))) {
                    string2 = context.getString(2131831869);
                }
                c1391890mKBArr[0] = new C1391890mKB(string2, Integer.valueOf(R.raw.icon_magnifying_glass), null, 4);
                if (tagPanelConfig == null || (string3 = tagPanelConfig.desc2) == null || !(!a0.LJJJIL(string3))) {
                    string3 = context.getString(2131831870);
                }
                c1391890mKBArr[1] = new C1391890mKB(string3, Integer.valueOf(R.raw.icon_eye_lash), null, 4);
                c1391960mKI.LJIIIZ = C13LQ.LJJLL(c1391890mKBArr);
                c1391960mKI.LIZ = true;
                if (tagPanelConfig == null || (string4 = tagPanelConfig.btn) == null || !(true ^ a0.LJJJIL(string4))) {
                    string4 = context.getString(2131831868);
                }
                c1391960mKI.LIZIZ(string4, AFwS298S0000000_14.get$arr$(19));
                TuxPanel tuxPanel = c1391960mKI.LIZ().LIZ;
                tuxPanel.getLifecycle().addObserver(new PublicGroupTagIntroPanelHelper$show$1(tuxPanel));
                tuxPanel.show(childFragmentManager, "PublicGroupTagIntroPanel");
            }
        }
    }

    public static final void LIZ$15(AbS695S0100000_14 abS695S0100000_14, View view) {
        if (view != null) {
            IMCrossAppFeatureDiffApi.LIZ.getClass();
            IMCrossAppFeatureDiffApi iMCrossAppFeatureDiffApiLIZIZ = C898670ZNh.LIZIZ();
            if (iMCrossAppFeatureDiffApiLIZIZ != null) {
                iMCrossAppFeatureDiffApiLIZIZ.LJIILJJIL();
                C0OO0 c0oo0 = (C0OO0) ((EditGroupInfoChangeAvatarAssem) abS695S0100000_14.l0).LLJIJIL.getValue();
                if (c0oo0 != null) {
                    ((EditGroupInfoChangeAvatarAssem) abS695S0100000_14.l0).Go().vQ2(c0oo0, C724240Sb0.LIZ((EditGroupInfoChangeAvatarAssem) abS695S0100000_14.l0));
                }
            }
        }
    }

    public static final void LIZ$2(AbS695S0100000_14 abS695S0100000_14, View view) {
        if (view != null) {
            ((GroupDetailNameAndDescAssem) abS695S0100000_14.l0).mp().BQ2(((GroupDetailNameAndDescAssem) abS695S0100000_14.l0).ip().getContext());
        }
    }

    public static final void LIZ$3(AbS695S0100000_14 abS695S0100000_14, View view) {
        boolean z;
        if (view != null) {
            AssemVMLazy assemVMLazy = ((EditGroupInfoNavAssem) abS695S0100000_14.l0).LLIZLLLIL;
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = EditGroupInfoNavAssem.LLJI;
            boolean z2 = false;
            EditGroupInfoViewModel editGroupInfoViewModel = (EditGroupInfoViewModel) assemVMLazy.getValue();
            IMGroupChatDetailAnalytics.LIZ.LJFF("save_group_info", new Pair[]{new Pair("enter_from", editGroupInfoViewModel.xQ2().LLILLJJLI)}, C0I0B.LJFF.LIZIZ());
            if (a0.LJLIIIL(editGroupInfoViewModel.getState().LLIZ).toString().length() == 0) {
                editGroupInfoViewModel.setState(AFwS248S0000000_14.get$arr$(570));
                z = false;
            } else {
                z = true;
            }
            if (editGroupInfoViewModel.xQ2().LLILLL && editGroupInfoViewModel.getState().LLJ.length() == 0) {
                editGroupInfoViewModel.setState(AFwS248S0000000_14.get$arr$(569));
            } else {
                z2 = true;
            }
            if (z && z2) {
                editGroupInfoViewModel.setState(AFwS248S0000000_14.get$arr$(572));
                C866530Xz1 c866530Xz1LIZIZ = C0YNP.LIZIZ(editGroupInfoViewModel.xQ2().LL);
                String str = editGroupInfoViewModel.getState().LLIZ;
                if (!(!Intrinsics.LJFF(str, editGroupInfoViewModel.LLILZIL.getValue()))) {
                    str = null;
                }
                String str2 = editGroupInfoViewModel.getState().LLJ;
                if (!(!Intrinsics.LJFF(str2, editGroupInfoViewModel.LLILZLL.getValue()))) {
                    str2 = null;
                }
                String str3 = editGroupInfoViewModel.getState().LLILLL;
                C914150Ztd c914150Ztd = new C914150Ztd(editGroupInfoViewModel, 21);
                if (C293390Bej.LIZ()) {
                    C054G c054g = c866530Xz1LIZIZ.LJ;
                    C1DFH c1dfh = C0PEM.LIZ;
                    C23250099c.LIZLLL(c054g, C2107308Nj.LIZ.LLIILII(), null, new C866140XyO(c914150Ztd, null, c866530Xz1LIZIZ, str, str3, str2), 2);
                    return;
                }
                c866530Xz1LIZIZ.LJIJI().LLJJJJJIL(str, str3, str2, c914150Ztd);
            }
        }
    }

    public static final void LIZ$4(AbS695S0100000_14 abS695S0100000_14, View view) {
        SingleTitleBarRightViewModel singleTitleBarRightViewModelIp;
        AbstractC879060Ye8 abstractC879060Ye8VQ2;
        C0Y8T c0y8tLJ;
        String str;
        if (view != null && (abstractC879060Ye8VQ2 = (singleTitleBarRightViewModelIp = ((SingleTitleBarRightAssem) abS695S0100000_14.l0).ip()).vQ2()) != null && (c0y8tLJ = abstractC879060Ye8VQ2.LJ()) != null) {
            if (C879070Ye9.LJFF(c0y8tLJ)) {
                AbstractC879060Ye8 abstractC879060Ye8VQ22 = singleTitleBarRightViewModelIp.vQ2();
                if (abstractC879060Ye8VQ22 != null) {
                    AbstractC879060Ye8.LIZJ(abstractC879060Ye8VQ22, null, Collections.singletonList(EnumC879080YeA.STARRED), null, null, 5);
                }
            } else {
                AbstractC879060Ye8 abstractC879060Ye8VQ23 = singleTitleBarRightViewModelIp.vQ2();
                if (abstractC879060Ye8VQ23 != null) {
                    AbstractC879060Ye8.LIZJ(abstractC879060Ye8VQ23, Collections.singletonList(EnumC879080YeA.STARRED), null, null, null, 6);
                }
            }
            IIMChatRoomAnalytics.LIZ.getClass();
            IIMChatRoomAnalytics iIMChatRoomAnalyticsLIZ = C06Q7.LIZ();
            if (iIMChatRoomAnalyticsLIZ != null) {
                if (C879070Ye9.LJFF(c0y8tLJ)) {
                    str = "unstar";
                } else {
                    str = "star";
                }
                iIMChatRoomAnalyticsLIZ.LIZLLL("chat_room", str);
            }
        }
    }

    public static final void LIZ$5(AbS695S0100000_14 abS695S0100000_14, View view) {
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj5;
        if (view != null) {
            AwemeCardCenterAssem awemeCardCenterAssem = (AwemeCardCenterAssem) abS695S0100000_14.l0;
            C724270Sb3 c724270Sb3 = awemeCardCenterAssem.LLJI;
            Object obj6 = null;
            if (c724270Sb3 != null) {
                obj = c724270Sb3.LL;
            } else {
                obj = null;
            }
            C869590Y9l c869590Y9l = ((C06XR) obj).LLILLJJLI;
            BaseTemplate baseTemplateLIZJ = C2241931Cox.LIZJ(c869590Y9l, AwemeCardTemplate.class);
            if (baseTemplateLIZJ != null) {
                C724270Sb3 c724270Sb32 = awemeCardCenterAssem.LLJI;
                if (c724270Sb32 != null) {
                    obj2 = c724270Sb32.LL;
                } else {
                    obj2 = null;
                }
                if (!C880080Yfm.LIZLLL(((C06XR) obj2).LLILLJJLI)) {
                    C893560Z3q c893560Z3q = C893560Z3q.LIZ;
                    C724270Sb3 c724270Sb33 = awemeCardCenterAssem.LLJI;
                    if (c724270Sb33 != null) {
                        obj3 = c724270Sb33.LL;
                    } else {
                        obj3 = null;
                    }
                    Long lValueOf = Long.valueOf(((C06XR) obj3).LLILLJJLI.getSender());
                    String strSp = awemeCardCenterAssem.sp();
                    C724270Sb3 c724270Sb34 = awemeCardCenterAssem.LLJI;
                    if (c724270Sb34 != null) {
                        obj4 = c724270Sb34.LL;
                    } else {
                        obj4 = null;
                    }
                    String conversationId = ((C06XR) obj4).LLILLJJLI.getConversationId();
                    ShareAwemeContent.Companion companion = ShareAwemeContent.Companion;
                    C724270Sb3 c724270Sb35 = awemeCardCenterAssem.LLJI;
                    if (c724270Sb35 != null) {
                        obj5 = c724270Sb35.LL;
                    } else {
                        obj5 = null;
                    }
                    String messageTypeForEventTracking = companion.getMessageTypeForEventTracking(((C06XR) obj5).LLILLJJLI);
                    C724270Sb3 c724270Sb36 = awemeCardCenterAssem.LLJI;
                    if (c724270Sb36 != null) {
                        obj6 = c724270Sb36.LL;
                    }
                    C893560Z3q.LIZIZ(c893560Z3q, lValueOf, strSp, conversationId, messageTypeForEventTracking, companion.getMessageFromForEventTracking(((C06XR) obj6).LLILLJJLI), C0ZDX.LIZLLL(baseTemplateLIZJ), false, false, false, false, false, null, null, null, null, 65472);
                    String strSp2 = awemeCardCenterAssem.sp();
                    if (strSp2 != null) {
                        C1720706oX.LIZIZ(IAwemeOpenHelper.LIZ, awemeCardCenterAssem.getContentView().getContext(), awemeCardCenterAssem.op(), C0Z92.NORMAL, null, EnumC899970ZSh.AWEME_CARD, strSp2, c869590Y9l, ((C457780HxI) awemeCardCenterAssem.LLJJLIIIJLLLLLLLZ.getValue()).LL, null, true, "click_center_aweme_card", null, null, null, 14336);
                    }
                }
            }
        }
    }

    public static final void LIZ$6(AbS695S0100000_14 abS695S0100000_14, View view) {
        if (view != null) {
            ((C899240ZPm) abS695S0100000_14.l0).LIZIZ.invoke(view);
        }
    }

    public static final void LIZ$7(AbS695S0100000_14 abS695S0100000_14, View view) {
        if (view != null) {
            ((C899240ZPm) abS695S0100000_14.l0).LIZIZ.invoke(view);
        }
    }

    public static final void LIZ$8(AbS695S0100000_14 abS695S0100000_14, View view) {
        if (view != null) {
            ((C899240ZPm) abS695S0100000_14.l0).LIZIZ.invoke(view);
        }
    }

    public static final void LIZ$9(AbS695S0100000_14 abS695S0100000_14, View view) {
        if (view != null) {
            AssemVMLazy assemVMLazy = ((GroupTitleBarCenterAssem) abS695S0100000_14.l0).LLJJJIL;
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = GroupTitleBarCenterAssem.LLJZ;
            ((MockedConvVM) assemVMLazy.getValue()).vQ2(((GroupTitleBarCenterAssem) abS695S0100000_14.l0).getContentView(), "title_bar_avatar", new AwS558S0100000_14((GroupTitleBarCenterAssem) abS695S0100000_14.l0, 1140));
        }
    }
}
