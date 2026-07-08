package kotlin.jvm.internal;

import X.AbstractC1222340hui;
import X.AbstractC1623806Xk;
import X.AbstractC738140SxQ;
import X.AbstractC848400XPy;
import X.AnonymousClass0208;
import X.C09AY;
import X.C0MBB;
import X.C0WZX;
import X.C0XF1;
import X.C0XQ7;
import X.C11H9;
import X.C1222300hue;
import X.C1222320hug;
import X.C1222330huh;
import X.C1222350huj;
import X.C1222360huk;
import X.C1222380hum;
import X.C1247380iZ6;
import X.C1247410iZ9;
import X.C1247450iZD;
import X.C1247480iZG;
import X.C1251850igJ;
import X.C1252710ihh;
import X.C1253420iiq;
import X.C1260720iuc;
import X.C1389890mGx;
import X.C13LE;
import X.C13LP;
import X.C1558520qew;
import X.C1623606Xi;
import X.C1626990sRN;
import X.C1668060tVc;
import X.C1670750tZx;
import X.C1673210tdv;
import X.C1697810uHb;
import X.C1954807lC;
import X.C197039127h;
import X.C19EG;
import X.C19M4;
import X.C212374189c;
import X.C2188811AlT;
import X.C2204961BRm;
import X.C268330AfP;
import X.C291001Au;
import X.C337180DJs;
import X.C491001vg;
import X.C523420Kfs;
import X.C588270N5l;
import X.C724240Sb0;
import X.C786410Ut5;
import X.C915970ZwZ;
import X.EnumC1216690hlb;
import X.InterfaceC1233210iCF;
import X.InterfaceC1680500tpg;
import android.content.Context;
import android.view.View;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.android.livesdk.livesetting.subscription.LiveSubscriptionQuestionnaireHourFrequencySetting;
import com.bytedance.assem.arch.core.UIAssem;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.status.loading.TuxSpinner;
import com.google.gson.h;
import com.google.gson.n;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.comment.model.CommentSurpriseStruct;
import com.ss.android.ugc.aweme.comment.services.CommentService;
import com.ss.android.ugc.aweme.commerce.BizAccountInfo;
import com.ss.android.ugc.aweme.commerce.BizAddress;
import com.ss.android.ugc.aweme.commerce.BizContactInfo;
import com.ss.android.ugc.aweme.commerce.CouponInfo;
import com.ss.android.ugc.aweme.exp.DMInboxChangeRightZoneClickableSizeExp;
import com.ss.android.ugc.aweme.feed.widget.LineProgressBar;
import com.ss.android.ugc.aweme.live.notification.ResponseState;
import com.ss.android.ugc.aweme.music.v2.assem.button.IMDPButtonAnimationAbility;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import com.ss.android.ugc.aweme.profile.model.SignatureExtraInfo;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.ss.android.ugc.aweme.story.feed.immersive.component.StoryLoadingComponent;
import com.ss.android.ugc.aweme.user.repository.UserState;
import com.ss.android.ugc.profile.business.ur.platform.recommendbutton.ICTARecommendButtonAbility;
import com.ss.android.ugc.profile.platform.base.data.ProfileComponents;
import com.tts.oecverify.BdTuring;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicReferenceArray;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes20.dex */
public class AFwS303S0000000_19 extends C09AY implements Function2 {
    public static final /* synthetic */ AtomicReferenceArray arr$ = new AtomicReferenceArray(78);
    public final int $t;

    public static AFwS303S0000000_19 get$arr$(int i) {
        AFwS303S0000000_19 aFwS303S0000000_19 = (AFwS303S0000000_19) arr$.get(i);
        if (aFwS303S0000000_19 != null) {
            return aFwS303S0000000_19;
        }
        arr$.compareAndSet(i, null, new AFwS303S0000000_19(i));
        return (AFwS303S0000000_19) arr$.get(i);
    }

    public static final Object invoke$29(AFwS303S0000000_19 aFwS303S0000000_19, Object obj, Object obj2) {
        return obj;
    }

    public static final Object invoke$30(AFwS303S0000000_19 aFwS303S0000000_19, Object obj, Object obj2) {
        return obj2;
    }

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
            case 59:
                return invoke$59(this, obj, obj2);
            case 60:
                return invoke$60(this, obj, obj2);
            case 61:
                return invoke$61(this, obj, obj2);
            case BaseNotice.CREATOR /* 62 */:
                return invoke$62(this, obj, obj2);
            case 63:
                return invoke$63(this, obj, obj2);
            case 64:
                return invoke$64(this, obj, obj2);
            case 65:
                return invoke$65(this, obj, obj2);
            case 66:
                return invoke$66(this, obj, obj2);
            case 67:
                return invoke$67(this, obj, obj2);
            case 68:
                return invoke$68(this, obj, obj2);
            case 69:
                return invoke$69(this, obj, obj2);
            case 70:
                return invoke$70(this, obj, obj2);
            case 71:
                return invoke$71(this, obj, obj2);
            case DMInboxChangeRightZoneClickableSizeExp.NEW_DP_SIZE /* 72 */:
                return invoke$72(this, obj, obj2);
            case 73:
                return invoke$73(this, obj, obj2);
            case 74:
                return invoke$74(this, obj, obj2);
            case 75:
                return invoke$75(this, obj, obj2);
            case 76:
                return invoke$76(this, obj, obj2);
            case 77:
                return invoke$77(this, obj, obj2);
            default:
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AFwS303S0000000_19(int i) {
        super(2);
        this.$t = i;
    }

    public static final Object invoke$0(AFwS303S0000000_19 aFwS303S0000000_19, Object obj, Object obj2) {
        String str = (String) obj;
        if (str.length() == 0) {
            return obj2.toString();
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(str);
        sbLIZ.append(", ");
        sbLIZ.append(obj2);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$1(AFwS303S0000000_19 aFwS303S0000000_19, Object obj, Object obj2) {
        InterfaceC1680500tpg interfaceC1680500tpg = (InterfaceC1680500tpg) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && interfaceC1680500tpg.LIZ()) {
            interfaceC1680500tpg.LIZJ();
        } else {
            C1673210tdv.LJ("", null, false, false, interfaceC1680500tpg, 6, 14);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$10(AFwS303S0000000_19 aFwS303S0000000_19, Object obj, Object obj2) {
        InterfaceC1680500tpg interfaceC1680500tpg = (InterfaceC1680500tpg) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && interfaceC1680500tpg.LIZ()) {
            interfaceC1680500tpg.LIZJ();
        } else {
            C1673210tdv.LJ("", null, false, false, interfaceC1680500tpg, 6, 14);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$11(AFwS303S0000000_19 aFwS303S0000000_19, Object obj, Object obj2) {
        InterfaceC1680500tpg interfaceC1680500tpg = (InterfaceC1680500tpg) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && interfaceC1680500tpg.LIZ()) {
            interfaceC1680500tpg.LIZJ();
        } else {
            C1673210tdv.LJ("", null, false, false, interfaceC1680500tpg, 6, 14);
        }
        return Unit.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object invoke$12(AFwS303S0000000_19 aFwS303S0000000_19, Object obj, Object obj2) {
        C19EG c19egLIZ;
        AbstractC738140SxQ abstractC738140SxQ = (AbstractC738140SxQ) obj;
        if (((Boolean) ((C291001Au) obj2).LIZ).booleanValue() && (c19egLIZ = C724240Sb0.LIZ(abstractC738140SxQ)) != null) {
            C2204961BRm.LLJJJ(c19egLIZ, 7777, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOmgYovK2SZ1Ov9PAxMHavLl9kHqobEjZzz40u9kbYXmIo1nx10WhzcPok1HSEDdxXTdONQEoma/AfPJk1BuB/8=", null));
            c19egLIZ.finish();
        }
        return Unit.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object invoke$13(AFwS303S0000000_19 aFwS303S0000000_19, Object obj, Object obj2) {
        C19EG c19egLIZ;
        AbstractC738140SxQ abstractC738140SxQ = (AbstractC738140SxQ) obj;
        if (((Boolean) ((C291001Au) obj2).LIZ).booleanValue() && (c19egLIZ = C724240Sb0.LIZ(abstractC738140SxQ)) != null) {
            C2204961BRm.LLJJJ(c19egLIZ, 4444, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOmgYovK2SZ1Ov9PAxMHavLl9kHqobEjZzz40u9kbYXmIo1nx10WhzcPok1HSEDdxXTdONQEoma/AfPJk1BuB/8=", null));
            c19egLIZ.finish();
        }
        return Unit.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$14(AFwS303S0000000_19 aFwS303S0000000_19, Object obj, Object obj2) {
        UIAssem uIAssem = (UIAssem) obj;
        boolean zBooleanValue = ((Boolean) obj2).booleanValue();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SingleLineAreaAboveInputAssem：showReplyInfoAboveInput: ");
        sbLIZ.append(zBooleanValue);
        C2188811AlT.LIZIZ(sbLIZ);
        if (zBooleanValue) {
            C786410Ut5.LJLLLLLL(0, uIAssem.LJJIJL());
        } else {
            C786410Ut5.LJLLLLLL(8, uIAssem.LJJIJL());
        }
        return Unit.LIZ;
    }

    public static final Object invoke$15(AFwS303S0000000_19 aFwS303S0000000_19, Object obj, Object obj2) {
        UIAssem uIAssem = (UIAssem) obj;
        if (((C915970ZwZ) obj2).LL.length() == 0) {
            ((RecyclerView) uIAssem.LJJIJL().findViewById(R.id.kjg)).scrollToPosition(0);
            C337180DJs.LIZJ(uIAssem.LJJIJL());
        } else {
            C337180DJs.LIZ(uIAssem.LJJIJL());
        }
        return Unit.LIZ;
    }

    public static final Object invoke$16(AFwS303S0000000_19 aFwS303S0000000_19, Object obj, Object obj2) {
        ResponseState responseState = (ResponseState) obj;
        return responseState.copy(-1, -1, responseState.cacheEvent, responseState.networkEvent);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object invoke$17(AFwS303S0000000_19 aFwS303S0000000_19, Object obj, Object obj2) {
        AbstractC738140SxQ abstractC738140SxQ = (AbstractC738140SxQ) obj;
        C291001Au c291001Au = (C291001Au) obj2;
        if (c291001Au != null) {
            int iIntValue = ((Number) c291001Au.LIZ).intValue();
            IMDPButtonAnimationAbility iMDPButtonAnimationAbility = (IMDPButtonAnimationAbility) C1558520qew.LIZ(C1558520qew.LJIIL(abstractC738140SxQ), IMDPButtonAnimationAbility.class, null);
            if (iMDPButtonAnimationAbility != null) {
                iMDPButtonAnimationAbility.C61(iIntValue);
            }
        }
        return Unit.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$19(AFwS303S0000000_19 aFwS303S0000000_19, Object obj, Object obj2) {
        ((Number) obj2).intValue();
        return Unit.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$2(AFwS303S0000000_19 aFwS303S0000000_19, Object obj, Object obj2) {
        int i;
        boolean zBooleanValue = ((Boolean) obj2).booleanValue();
        View viewFindViewById = ((UIAssem) obj).LJJIJL().findViewById(EnumC1216690hlb.GO_LIVE.getId());
        if (zBooleanValue) {
            i = 0;
        } else {
            i = 8;
        }
        C786410Ut5.LJLLLLLL(i, viewFindViewById);
        return Unit.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object invoke$20(AFwS303S0000000_19 aFwS303S0000000_19, Object obj, Object obj2) {
        StoryLoadingComponent storyLoadingComponent = (StoryLoadingComponent) obj;
        C291001Au c291001Au = (C291001Au) obj2;
        if (c291001Au != null) {
            if (((Boolean) c291001Au.LIZ).booleanValue()) {
                LineProgressBar lineProgressBar = (LineProgressBar) storyLoadingComponent.LLJLLL.getValue();
                if (lineProgressBar != null) {
                    lineProgressBar.LIZJ();
                }
            } else {
                LineProgressBar lineProgressBar2 = (LineProgressBar) storyLoadingComponent.LLJLLL.getValue();
                if (lineProgressBar2 != null) {
                    lineProgressBar2.LIZLLL();
                }
            }
        }
        return Unit.LIZ;
    }

    public static final /* bridge */ /* synthetic */ Object invoke$21(AFwS303S0000000_19 aFwS303S0000000_19, Object obj, Object obj2) {
        return Unit.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object invoke$22(AFwS303S0000000_19 aFwS303S0000000_19, Object obj, Object obj2) {
        BaseResponse baseResponse;
        UserState userState = (UserState) obj;
        AbstractC1623806Xk abstractC1623806Xk = (AbstractC1623806Xk) obj2;
        boolean z = abstractC1623806Xk instanceof C491001vg;
        if (z) {
        }
        if ((abstractC1623806Xk instanceof C1623606Xi) && (baseResponse = (BaseResponse) ((C1623606Xi) abstractC1623806Xk).LIZ) != null && baseResponse.status_code == 0) {
            User curUser = ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUser();
            AnonymousClass0208 anonymousClass0208 = AnonymousClass0208.get$arr$(8);
            if (C588270N5l.LIZ(curUser)) {
                anonymousClass0208.invoke(new C1247480iZG(curUser), new C1247380iZ6(curUser));
            } else {
                anonymousClass0208.invoke(new C1247450iZD(curUser), new C1247410iZ9(curUser));
            }
            return userState.copy(userState.user, true, userState.followStatus, userState.remarkName, userState.removeFollowerError, userState.newPostTagChange);
        }
        if (!z) {
            return userState;
        }
        return userState.copy(userState.user, userState.followerIsRemoved, userState.followStatus, userState.remarkName, ((C491001vg) abstractC1623806Xk).LIZ, userState.newPostTagChange);
    }

    public static final Object invoke$23(AFwS303S0000000_19 aFwS303S0000000_19, Object obj, Object obj2) {
        return Boolean.valueOf(C212374189c.LIZIZ((String) obj, (String) obj2));
    }

    public static final Object invoke$24(AFwS303S0000000_19 aFwS303S0000000_19, Object obj, Object obj2) {
        return Boolean.valueOf(C212374189c.LIZIZ((String) obj, (String) obj2));
    }

    public static final /* bridge */ /* synthetic */ Object invoke$25(AFwS303S0000000_19 aFwS303S0000000_19, Object obj, Object obj2) {
        ((Boolean) obj2).booleanValue();
        return Unit.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object invoke$26(AFwS303S0000000_19 aFwS303S0000000_19, Object obj, Object obj2) {
        UIAssem uIAssem = (UIAssem) obj;
        C291001Au c291001Au = (C291001Au) obj2;
        if (c291001Au != null) {
            C1389890mGx c1389890mGx = new C1389890mGx(uIAssem.LJJIJL());
            c1389890mGx.LJIIIZ(((Number) c291001Au.LIZ).intValue());
            c1389890mGx.LJIIJJI();
            ((InterfaceC1233210iCF) C1252710ihh.LIZ(uIAssem, C13LE.LIZ(InterfaceC1233210iCF.class), null)).f9();
        }
        return Unit.LIZ;
    }

    public static final Object invoke$28(AFwS303S0000000_19 aFwS303S0000000_19, Object obj, Object obj2) {
        int iIntValue = ((Number) obj2).intValue();
        ICTARecommendButtonAbility iCTARecommendButtonAbility = (ICTARecommendButtonAbility) C1558520qew.LIZ(C1558520qew.LJIIL((AbstractC738140SxQ) obj), ICTARecommendButtonAbility.class, null);
        if (iCTARecommendButtonAbility != null) {
            iCTARecommendButtonAbility.OD1(iIntValue);
        }
        return Unit.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$3(AFwS303S0000000_19 aFwS303S0000000_19, Object obj, Object obj2) {
        int i;
        boolean zBooleanValue = ((Boolean) obj2).booleanValue();
        View viewFindViewById = ((UIAssem) obj).LJJIJL().findViewById(EnumC1216690hlb.INVITE.getId());
        if (zBooleanValue) {
            i = 0;
        } else {
            i = 8;
        }
        C786410Ut5.LJLLLLLL(i, viewFindViewById);
        return Unit.LIZ;
    }

    public static final Object invoke$31(AFwS303S0000000_19 aFwS303S0000000_19, Object obj, Object obj2) {
        InterfaceC1680500tpg interfaceC1680500tpg = (InterfaceC1680500tpg) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && interfaceC1680500tpg.LIZ()) {
            interfaceC1680500tpg.LIZJ();
        } else {
            C1673210tdv.LJ("", null, false, false, interfaceC1680500tpg, 6, 14);
        }
        return Unit.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$32(AFwS303S0000000_19 aFwS303S0000000_19, Object obj, Object obj2) {
        TuxTextView tuxTextView;
        C19M4 c19m4;
        TuxSpinner tuxSpinner;
        TuxIconView tuxIconView;
        TuxIconView tuxIconView2;
        View viewFindViewById;
        C197039127h c197039127h;
        View viewFindViewById2;
        C19M4 c19m42;
        TuxIconView tuxIconView3;
        TuxTextView tuxTextView2;
        TuxIconView tuxIconView4;
        View viewFindViewById3;
        UIAssem uIAssem = (UIAssem) obj;
        AbstractC1222340hui abstractC1222340hui = (AbstractC1222340hui) obj2;
        View viewLJJIJL = uIAssem.LJJIJL();
        View viewFindViewById4 = null;
        TuxSpinner tuxSpinner2 = null;
        TextView textView = null;
        C197039127h c197039127h2 = null;
        View viewFindViewById5 = null;
        if (viewLJJIJL != null) {
            tuxTextView = (TuxTextView) viewLJJIJL.findViewById(R.id.hau);
        } else {
            tuxTextView = null;
        }
        C786410Ut5.LLLLZLL(tuxTextView, 8);
        View viewLJJIJL2 = uIAssem.LJJIJL();
        if (viewLJJIJL2 != null) {
            c19m4 = (C19M4) viewLJJIJL2.findViewById(R.id.rom);
        } else {
            c19m4 = null;
        }
        C786410Ut5.LLLLLZIL(c19m4, 8);
        View viewLJJIJL3 = uIAssem.LJJIJL();
        if (viewLJJIJL3 != null) {
            tuxSpinner = (TuxSpinner) viewLJJIJL3.findViewById(R.id.vu9);
        } else {
            tuxSpinner = null;
        }
        C786410Ut5.LLZILL(tuxSpinner, 8);
        View viewLJJIJL4 = uIAssem.LJJIJL();
        if (viewLJJIJL4 != null) {
            tuxIconView = (TuxIconView) viewLJJIJL4.findViewById(R.id.j58);
        } else {
            tuxIconView = null;
        }
        C786410Ut5.LLLLLLZZ(tuxIconView, 8);
        View viewLJJIJL5 = uIAssem.LJJIJL();
        if (viewLJJIJL5 != null) {
            tuxIconView2 = (TuxIconView) viewLJJIJL5.findViewById(R.id.e06);
        } else {
            tuxIconView2 = null;
        }
        C786410Ut5.LLLLLLZZ(tuxIconView2, 8);
        View viewLJJIJL6 = uIAssem.LJJIJL();
        if (viewLJJIJL6 != null) {
            viewFindViewById = viewLJJIJL6.findViewById(R.id.kqq);
        } else {
            viewFindViewById = null;
        }
        C786410Ut5.LJLLLLLL(8, viewFindViewById);
        View viewLJJIJL7 = uIAssem.LJJIJL();
        if (viewLJJIJL7 != null) {
            c197039127h = (C197039127h) viewLJJIJL7.findViewById(R.id.eom);
        } else {
            c197039127h = null;
        }
        c197039127h.setEnabled(false);
        if (!Intrinsics.LJFF(abstractC1222340hui, C1222300hue.LIZ)) {
            if (Intrinsics.LJFF(abstractC1222340hui, C1222380hum.LIZ)) {
                View viewLJJIJL8 = uIAssem.LJJIJL();
                if (viewLJJIJL8 != null) {
                    tuxSpinner2 = (TuxSpinner) viewLJJIJL8.findViewById(R.id.vu9);
                }
                C786410Ut5.LLZILL(tuxSpinner2, 0);
            } else if (abstractC1222340hui instanceof C1222320hug) {
                View viewLJJIJL9 = uIAssem.LJJIJL();
                if (viewLJJIJL9 != null) {
                    tuxTextView2 = (TuxTextView) viewLJJIJL9.findViewById(R.id.hau);
                } else {
                    tuxTextView2 = null;
                }
                C786410Ut5.LLLLZLL(tuxTextView2, 0);
                View viewLJJIJL10 = uIAssem.LJJIJL();
                if (viewLJJIJL10 != null) {
                    tuxIconView4 = (TuxIconView) viewLJJIJL10.findViewById(R.id.e06);
                } else {
                    tuxIconView4 = null;
                }
                C786410Ut5.LLLLLLZZ(tuxIconView4, 0);
                View viewLJJIJL11 = uIAssem.LJJIJL();
                if (viewLJJIJL11 != null) {
                    viewFindViewById3 = viewLJJIJL11.findViewById(R.id.kqq);
                } else {
                    viewFindViewById3 = null;
                }
                C786410Ut5.LJLLLLLL(0, viewFindViewById3);
                View viewLJJIJL12 = uIAssem.LJJIJL();
                if (viewLJJIJL12 != null) {
                    textView = (TextView) viewLJJIJL12.findViewById(R.id.hau);
                }
                textView.setText(((C1222320hug) abstractC1222340hui).LIZ);
            } else if (Intrinsics.LJFF(abstractC1222340hui, C1222330huh.LIZ)) {
                View viewLJJIJL13 = uIAssem.LJJIJL();
                if (viewLJJIJL13 != null) {
                    c19m42 = (C19M4) viewLJJIJL13.findViewById(R.id.rom);
                } else {
                    c19m42 = null;
                }
                C786410Ut5.LLLLLZIL(c19m42, 0);
                View viewLJJIJL14 = uIAssem.LJJIJL();
                if (viewLJJIJL14 != null) {
                    tuxIconView3 = (TuxIconView) viewLJJIJL14.findViewById(R.id.j58);
                } else {
                    tuxIconView3 = null;
                }
                C786410Ut5.LLLLLLZZ(tuxIconView3, 0);
                View viewLJJIJL15 = uIAssem.LJJIJL();
                if (viewLJJIJL15 != null) {
                    c197039127h2 = (C197039127h) viewLJJIJL15.findViewById(R.id.eom);
                }
                c197039127h2.setEnabled(true);
            } else if (Intrinsics.LJFF(abstractC1222340hui, C1222350huj.LIZ)) {
                View viewLJJIJL16 = uIAssem.LJJIJL();
                if (viewLJJIJL16 != null) {
                    viewFindViewById2 = viewLJJIJL16.findViewById(R.id.tqy);
                } else {
                    viewFindViewById2 = null;
                }
                if (C0XF1.LIZIZ(viewFindViewById2.getContext())) {
                    View viewLJJIJL17 = uIAssem.LJJIJL();
                    if (viewLJJIJL17 != null) {
                        viewFindViewById5 = viewLJJIJL17.findViewById(R.id.tqy);
                    }
                    C1389890mGx c1389890mGx = new C1389890mGx(viewFindViewById5);
                    c1389890mGx.LJIIIZ(2131829441);
                    c1389890mGx.LJIIJJI();
                } else {
                    C1626990sRN.LIZIZ(uIAssem.getContext());
                }
            } else if (Intrinsics.LJFF(abstractC1222340hui, C1222360huk.LIZ)) {
                View viewLJJIJL18 = uIAssem.LJJIJL();
                if (viewLJJIJL18 != null) {
                    viewFindViewById4 = viewLJJIJL18.findViewById(R.id.tqy);
                }
                C1389890mGx c1389890mGx2 = new C1389890mGx(viewFindViewById4);
                c1389890mGx2.LJIIIZ(2131826656);
                c1389890mGx2.LJIIJJI();
            } else {
                throw new C1954807lC();
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$33(AFwS303S0000000_19 aFwS303S0000000_19, Object obj, Object obj2) {
        C1253420iiq.LJIIJ = ((Number) obj).intValue();
        C1253420iiq.LJIIJJI = (String) obj2;
        return Unit.LIZ;
    }

    public static final Object invoke$34(AFwS303S0000000_19 aFwS303S0000000_19, Object obj, Object obj2) {
        C1253420iiq.LJFF = ((Number) obj).intValue();
        C1253420iiq.LJI = (String) obj2;
        return Unit.LIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x049c  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x04c4  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x04e5  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x04ff  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x053c  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0542  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0554  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x059a  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x063f  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0654  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0658  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x07a1  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x07a4  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x07a8  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x07b7  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x07c6  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x07c9  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x0800  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0406  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0432  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$35(kotlin.jvm.internal.AFwS303S0000000_19 r20, java.lang.Object r21, java.lang.Object r22) {
        /*
            Method dump skipped, instruction units count: 2120
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AFwS303S0000000_19.invoke$35(kotlin.jvm.internal.AFwS303S0000000_19, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    public static final /* bridge */ /* synthetic */ Object invoke$36(AFwS303S0000000_19 aFwS303S0000000_19, Object obj, Object obj2) {
        ((Number) obj).intValue();
        return null;
    }

    public static final Object invoke$37(AFwS303S0000000_19 aFwS303S0000000_19, Object obj, Object obj2) {
        C1260720iuc.LIZ.getClass();
        return Boolean.valueOf(Intrinsics.LJFF(C1260720iuc.LIZ((String) obj), C1260720iuc.LIZ((String) obj2)));
    }

    public static final Object invoke$38(AFwS303S0000000_19 aFwS303S0000000_19, Object obj, Object obj2) {
        long j;
        int iIntValue = ((Number) obj).intValue();
        C1670750tZx c1670750tZx = (C1670750tZx) C13LP.LJJJLL((List) obj2);
        if (c1670750tZx != null) {
            j = c1670750tZx.LIZ;
        } else {
            j = iIntValue;
        }
        return Long.valueOf(j);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public static final Object invoke$39(AFwS303S0000000_19 aFwS303S0000000_19, Object obj, Object obj2) {
        List<? extends ProfileComponents> list;
        List<? extends ProfileComponents> list2;
        BizContactInfo bizContactInfo;
        BizContactInfo bizContactInfo2;
        String bizPhone;
        n nVar;
        BizAccountInfo bizAccountInfo;
        List<CouponInfo> couponInfo;
        n nVar2;
        BizAccountInfo bizAccountInfo2;
        BizContactInfo bizContactInfo3;
        BizAddress bizAddress;
        BizAccountInfo bizAccountInfo3;
        String androidDownloadAppLink;
        ProfileComponents next;
        ProfileComponents profileComponents = (ProfileComponents) obj;
        User user = (User) obj2;
        String str = user.signature;
        ArrayList arrayList = null;
        if (str != null && !Intrinsics.LJFF(str, "")) {
            List<? extends ProfileComponents> list3 = profileComponents.components;
            int i = 0;
            if (list3 == null) {
                ProfileComponents profileComponents2 = new ProfileComponents();
                profileComponents2.componentName = "bio_signature";
                profileComponents.components = C1697810uHb.LJIILJJIL(profileComponents2);
            } else {
                Iterator<? extends ProfileComponents> it2 = list3.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        next = it2.next();
                        if (Intrinsics.LJFF(next.componentName, "bio_signature")) {
                            break;
                        }
                    } else {
                        next = null;
                        break;
                    }
                }
                if (C268330AfP.LIZLLL()) {
                    List<? extends ProfileComponents> list4 = profileComponents.components;
                    if (list4 != null) {
                        Iterator<? extends ProfileComponents> it3 = list4.iterator();
                        while (it3.hasNext()) {
                            if (Intrinsics.LJFF(it3.next().componentName, "bio_pronouns")) {
                                break;
                            }
                            i++;
                        }
                        i = -1;
                        i++;
                    } else {
                        i = -1;
                        i++;
                    }
                }
                if (next == null) {
                    List<? extends ProfileComponents> list5 = profileComponents.components;
                    if (list5 != null) {
                        arrayList = new ArrayList(list5);
                        ProfileComponents profileComponents3 = new ProfileComponents();
                        profileComponents3.componentName = "bio_signature";
                        profileComponents3.componentId = "bio_signature";
                        ListProtector.add(arrayList, i, profileComponents3);
                    }
                    profileComponents.components = arrayList;
                }
            }
        }
        List<? extends ProfileComponents> list6 = profileComponents.components;
        if (list6 != null) {
            for (ProfileComponents profileComponents4 : list6) {
                C1251850igJ c1251850igJ = C1251850igJ.LIZ;
                n nVar3 = profileComponents4.bizData;
                c1251850igJ.getClass();
                C1251850igJ.LIZJ = nVar3;
                String str2 = profileComponents4.componentName;
                if (str2 != null) {
                    int iHashCode = str2.hashCode();
                    if (iHashCode != -1857239291) {
                        if (iHashCode != -1710478581) {
                            if (iHashCode == -328374719 && str2.equals("bio_signature")) {
                                n nVar4 = new n();
                                nVar4.LJJIIJ("text", user.signature);
                                if (profileComponents4.bizData == null) {
                                    profileComponents4.bizData = new n();
                                }
                                n nVar5 = profileComponents4.bizData;
                                if (nVar5 != null) {
                                    nVar5.LJJIJL("describe");
                                }
                                n nVar6 = profileComponents4.bizData;
                                if (nVar6 != null) {
                                    nVar6.LJJIFFI("describe", nVar4);
                                }
                                h hVar = new h();
                                List<SignatureExtraInfo> signatureExtra = user.getSignatureExtra();
                                if (signatureExtra != null) {
                                    for (SignatureExtraInfo signatureExtraInfo : signatureExtra) {
                                        n nVar7 = new n();
                                        nVar7.LJJIII(signatureExtraInfo.getEndIndex(), "end");
                                        nVar7.LJJIIJ("sec_uid", signatureExtraInfo.getSecUserId());
                                        nVar7.LJJIII(signatureExtraInfo.getStartIndex(), "start");
                                        nVar7.LJJIII(Integer.valueOf(signatureExtraInfo.getType()), "type");
                                        nVar7.LJJIIJ("user_id", signatureExtraInfo.getUserId());
                                        hVar.LJJIFFI(nVar7);
                                    }
                                }
                                n nVar8 = profileComponents4.bizData;
                                if (nVar8 != null) {
                                    nVar8.LJJIJL("signature_extra");
                                }
                                n nVar9 = profileComponents4.bizData;
                                if (nVar9 != null) {
                                    nVar9.LJJIFFI("signature_extra", hVar);
                                }
                            }
                        } else if (str2.equals("bio_mail_link") && (list = profileComponents4.components) != null) {
                            for (ProfileComponents profileComponents5 : list) {
                                String str3 = profileComponents5.componentName;
                                if (Intrinsics.LJFF(str3, "bio_email")) {
                                    String bioEmail = user.getBioEmail();
                                    if (bioEmail != null) {
                                        C1251850igJ.LIZ.getClass();
                                        C1251850igJ.LJII(bioEmail, profileComponents5, "bio_email");
                                    }
                                } else if (Intrinsics.LJFF(str3, "bio_link")) {
                                    String bioUrl = user.getBioUrl();
                                    if (bioUrl != null) {
                                        C1251850igJ.LIZ.getClass();
                                        C1251850igJ.LJII(bioUrl, profileComponents4, "bio_url");
                                    }
                                    String bioSecureUrl = user.getBioSecureUrl();
                                    if (bioSecureUrl != null) {
                                        C1251850igJ.LIZ.getClass();
                                        C1251850igJ.LJII(bioSecureUrl, profileComponents5, "bio_secure_url");
                                    }
                                }
                            }
                        }
                    } else if (str2.equals("bio_business_account") && (list2 = profileComponents4.components) != null) {
                        for (ProfileComponents profileComponents6 : list2) {
                            String str4 = profileComponents6.componentName;
                            if (str4 != null) {
                                switch (str4.hashCode()) {
                                    case -2031990816:
                                        if (str4.equals("bio_business_account_app_download") && (bizAccountInfo3 = user.getBizAccountInfo()) != null && (androidDownloadAppLink = bizAccountInfo3.getAndroidDownloadAppLink()) != null) {
                                            C1251850igJ.LIZ.getClass();
                                            C1251850igJ.LJII(androidDownloadAppLink, profileComponents6, "android_download_app_link");
                                        }
                                        break;
                                    case -451726150:
                                        if (str4.equals("bio_business_account_address") && (nVar2 = profileComponents6.bizData) != null && (bizAccountInfo2 = user.getBizAccountInfo()) != null && (bizContactInfo3 = bizAccountInfo2.getBizContactInfo()) != null && (bizAddress = bizContactInfo3.getBizAddress()) != null) {
                                            String latitude = bizAddress.getLatitude();
                                            if (latitude != null) {
                                                C1251850igJ.LIZ.getClass();
                                                C1251850igJ.LJI(nVar2, latitude, "latitude");
                                            }
                                            String longitude = bizAddress.getLongitude();
                                            if (longitude != null) {
                                                C1251850igJ.LIZ.getClass();
                                                C1251850igJ.LJI(nVar2, longitude, "longitude");
                                            }
                                            String formattedAddressText = bizAddress.getFormattedAddressText();
                                            if (formattedAddressText != null) {
                                                C1251850igJ.LIZ.getClass();
                                                C1251850igJ.LJI(nVar2, formattedAddressText, "formatted_address_text");
                                            }
                                            String simplifiedAddressText = bizAddress.getSimplifiedAddressText();
                                            if (simplifiedAddressText != null) {
                                                C1251850igJ.LIZ.getClass();
                                                C1251850igJ.LJI(nVar2, simplifiedAddressText, "simplified_address_text");
                                            }
                                        }
                                        break;
                                    case 53350048:
                                        if (str4.equals("bio_business_account_coupon") && (nVar = profileComponents6.bizData) != null && (bizAccountInfo = user.getBizAccountInfo()) != null && bizAccountInfo.getCouponInfo() != null) {
                                            h hVar2 = new h();
                                            BizAccountInfo bizAccountInfo4 = user.getBizAccountInfo();
                                            if (bizAccountInfo4 != null && (couponInfo = bizAccountInfo4.getCouponInfo()) != null) {
                                                for (CouponInfo couponInfo2 : couponInfo) {
                                                    n nVar10 = new n();
                                                    nVar10.LJJIII(couponInfo2.getCouponId(), "coupon_id");
                                                    nVar10.LJJIIJ("coupon_code", couponInfo2.getCouponCode());
                                                    nVar10.LJJIII(couponInfo2.getDiscountRate(), "discount_rate");
                                                    nVar10.LJJIIJ("description", couponInfo2.getDescription());
                                                    nVar10.LJJIII(couponInfo2.getStartTime(), "start_time");
                                                    nVar10.LJJIII(couponInfo2.getExpireTime(), "expire_time");
                                                    nVar10.LJJIIJ("website", couponInfo2.getWebsite());
                                                    nVar10.LJJIIJ("website_secure", couponInfo2.getWebsiteSecure());
                                                    nVar10.LJJIIJ("received_id", couponInfo2.getReceivedId());
                                                    nVar10.LJJII(Boolean.valueOf(couponInfo2.getFollowersOnly()), "followers_only");
                                                    nVar10.LJJII(Boolean.valueOf(couponInfo2.getRedeemed()), "redeemed");
                                                    hVar2.LJJIFFI(nVar10);
                                                }
                                            }
                                            nVar.LJJIJL("coupon_list");
                                            nVar.LJJIFFI("coupon_list", hVar2);
                                        }
                                        break;
                                    case 290607028:
                                        if (str4.equals("bio_business_account_phone")) {
                                            BizAccountInfo bizAccountInfo5 = user.getBizAccountInfo();
                                            if (bizAccountInfo5 != null && (bizContactInfo2 = bizAccountInfo5.getBizContactInfo()) != null && (bizPhone = bizContactInfo2.getBizPhone()) != null) {
                                                C1251850igJ.LIZ.getClass();
                                                C1251850igJ.LJII(bizPhone, profileComponents6, "biz_phone");
                                            }
                                            BizAccountInfo bizAccountInfo6 = user.getBizAccountInfo();
                                            if (bizAccountInfo6 != null && (bizContactInfo = bizAccountInfo6.getBizContactInfo()) != null) {
                                                Boolean call = bizContactInfo.getCall();
                                                if (call != null) {
                                                    boolean zBooleanValue = call.booleanValue();
                                                    n nVar11 = profileComponents6.bizData;
                                                    if (nVar11 != null) {
                                                        nVar11.LJJIJL("biz_phone_enable_call");
                                                    }
                                                    n nVar12 = profileComponents6.bizData;
                                                    if (nVar12 != null) {
                                                        nVar12.LJJII(Boolean.valueOf(zBooleanValue), "biz_phone_enable_call");
                                                    }
                                                }
                                                Boolean text = bizContactInfo.getText();
                                                if (text != null) {
                                                    boolean zBooleanValue2 = text.booleanValue();
                                                    n nVar13 = profileComponents6.bizData;
                                                    if (nVar13 != null) {
                                                        nVar13.LJJIJL("biz_phone_enable_text");
                                                    }
                                                    n nVar14 = profileComponents6.bizData;
                                                    if (nVar14 != null) {
                                                        nVar14.LJJII(Boolean.valueOf(zBooleanValue2), "biz_phone_enable_text");
                                                    }
                                                }
                                                String type = bizContactInfo.getType();
                                                if (type != null) {
                                                    n nVar15 = profileComponents6.bizData;
                                                    if (nVar15 != null) {
                                                        nVar15.LJJIJL("biz_phone_show_pattern");
                                                    }
                                                    n nVar16 = profileComponents6.bizData;
                                                    if (nVar16 != null) {
                                                        nVar16.LJJIIJ("biz_phone_show_pattern", type);
                                                    }
                                                }
                                            }
                                        }
                                        break;
                                }
                            }
                        }
                    }
                }
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$4(AFwS303S0000000_19 aFwS303S0000000_19, Object obj, Object obj2) {
        InterfaceC1680500tpg interfaceC1680500tpg = (InterfaceC1680500tpg) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && interfaceC1680500tpg.LIZ()) {
            interfaceC1680500tpg.LIZJ();
        } else {
            C1673210tdv.LJ("", null, false, false, interfaceC1680500tpg, 6, 14);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$40(AFwS303S0000000_19 aFwS303S0000000_19, Object obj, Object obj2) {
        InterfaceC1680500tpg interfaceC1680500tpg = (InterfaceC1680500tpg) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && interfaceC1680500tpg.LIZ()) {
            interfaceC1680500tpg.LIZJ();
        } else {
            C1668060tVc.LIZIZ(null, C0MBB.LIZIZ(2131823130, interfaceC1680500tpg), null, null, null, null, null, null, null, interfaceC1680500tpg, 0, 509);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$41(AFwS303S0000000_19 aFwS303S0000000_19, Object obj, Object obj2) {
        InterfaceC1680500tpg interfaceC1680500tpg = (InterfaceC1680500tpg) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && interfaceC1680500tpg.LIZ()) {
            interfaceC1680500tpg.LIZJ();
        } else {
            C1673210tdv.LJ("", null, false, false, interfaceC1680500tpg, 6, 14);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$42(AFwS303S0000000_19 aFwS303S0000000_19, Object obj, Object obj2) {
        InterfaceC1680500tpg interfaceC1680500tpg = (InterfaceC1680500tpg) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && interfaceC1680500tpg.LIZ()) {
            interfaceC1680500tpg.LIZJ();
        } else {
            C1673210tdv.LJ("", null, false, false, interfaceC1680500tpg, 6, 14);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$43(AFwS303S0000000_19 aFwS303S0000000_19, Object obj, Object obj2) {
        InterfaceC1680500tpg interfaceC1680500tpg = (InterfaceC1680500tpg) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && interfaceC1680500tpg.LIZ()) {
            interfaceC1680500tpg.LIZJ();
        } else {
            C1673210tdv.LJ("", null, false, false, interfaceC1680500tpg, 6, 14);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$44(AFwS303S0000000_19 aFwS303S0000000_19, Object obj, Object obj2) {
        InterfaceC1680500tpg interfaceC1680500tpg = (InterfaceC1680500tpg) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && interfaceC1680500tpg.LIZ()) {
            interfaceC1680500tpg.LIZJ();
        } else {
            C1673210tdv.LJ("", null, false, false, interfaceC1680500tpg, 6, 14);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$45(AFwS303S0000000_19 aFwS303S0000000_19, Object obj, Object obj2) {
        InterfaceC1680500tpg interfaceC1680500tpg = (InterfaceC1680500tpg) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && interfaceC1680500tpg.LIZ()) {
            interfaceC1680500tpg.LIZJ();
        } else {
            C1673210tdv.LJ("", null, false, false, interfaceC1680500tpg, 6, 14);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$46(AFwS303S0000000_19 aFwS303S0000000_19, Object obj, Object obj2) {
        InterfaceC1680500tpg interfaceC1680500tpg = (InterfaceC1680500tpg) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && interfaceC1680500tpg.LIZ()) {
            interfaceC1680500tpg.LIZJ();
        } else {
            C1673210tdv.LJ("", null, false, false, interfaceC1680500tpg, 6, 14);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$47(AFwS303S0000000_19 aFwS303S0000000_19, Object obj, Object obj2) {
        InterfaceC1680500tpg interfaceC1680500tpg = (InterfaceC1680500tpg) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && interfaceC1680500tpg.LIZ()) {
            interfaceC1680500tpg.LIZJ();
        } else {
            C1673210tdv.LJ("", null, false, false, interfaceC1680500tpg, 6, 14);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$48(AFwS303S0000000_19 aFwS303S0000000_19, Object obj, Object obj2) {
        InterfaceC1680500tpg interfaceC1680500tpg = (InterfaceC1680500tpg) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && interfaceC1680500tpg.LIZ()) {
            interfaceC1680500tpg.LIZJ();
        } else {
            C1673210tdv.LJ("", null, false, false, interfaceC1680500tpg, 6, 14);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$49(AFwS303S0000000_19 aFwS303S0000000_19, Object obj, Object obj2) {
        InterfaceC1680500tpg interfaceC1680500tpg = (InterfaceC1680500tpg) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && interfaceC1680500tpg.LIZ()) {
            interfaceC1680500tpg.LIZJ();
        } else {
            C1673210tdv.LJ("", null, false, false, interfaceC1680500tpg, 6, 14);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$5(AFwS303S0000000_19 aFwS303S0000000_19, Object obj, Object obj2) {
        InterfaceC1680500tpg interfaceC1680500tpg = (InterfaceC1680500tpg) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && interfaceC1680500tpg.LIZ()) {
            interfaceC1680500tpg.LIZJ();
        } else {
            C1673210tdv.LJ("", null, false, false, interfaceC1680500tpg, 6, 14);
        }
        return Unit.LIZ;
    }

    public static final /* bridge */ /* synthetic */ Object invoke$50(AFwS303S0000000_19 aFwS303S0000000_19, Object obj, Object obj2) {
        return Unit.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object invoke$51(AFwS303S0000000_19 aFwS303S0000000_19, Object obj, Object obj2) {
        String uid;
        C11H9 c11h9 = (C11H9) obj2;
        User user = (User) ((C11H9) obj).LIZ;
        String uid2 = null;
        if (user != null) {
            uid = user.getUid();
        } else {
            uid = null;
        }
        User user2 = (User) c11h9.LIZ;
        if (user2 != null) {
            uid2 = user2.getUid();
        }
        return Boolean.valueOf(Intrinsics.LJFF(uid, uid2));
    }

    public static final Object invoke$52(AFwS303S0000000_19 aFwS303S0000000_19, Object obj, Object obj2) {
        int iIntValue = ((Number) obj2).intValue();
        ICTARecommendButtonAbility iCTARecommendButtonAbility = (ICTARecommendButtonAbility) C1558520qew.LIZ(C1558520qew.LJIIL((AbstractC738140SxQ) obj), ICTARecommendButtonAbility.class, null);
        if (iCTARecommendButtonAbility != null) {
            iCTARecommendButtonAbility.OD1(iIntValue);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$53(AFwS303S0000000_19 aFwS303S0000000_19, Object obj, Object obj2) {
        InterfaceC1680500tpg interfaceC1680500tpg = (InterfaceC1680500tpg) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && interfaceC1680500tpg.LIZ()) {
            interfaceC1680500tpg.LIZJ();
        } else {
            C1673210tdv.LJ("", null, false, false, interfaceC1680500tpg, 6, 14);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$54(AFwS303S0000000_19 aFwS303S0000000_19, Object obj, Object obj2) {
        InterfaceC1680500tpg interfaceC1680500tpg = (InterfaceC1680500tpg) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && interfaceC1680500tpg.LIZ()) {
            interfaceC1680500tpg.LIZJ();
        } else {
            C1673210tdv.LJ("", null, false, false, interfaceC1680500tpg, 6, 14);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$55(AFwS303S0000000_19 aFwS303S0000000_19, Object obj, Object obj2) {
        InterfaceC1680500tpg interfaceC1680500tpg = (InterfaceC1680500tpg) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && interfaceC1680500tpg.LIZ()) {
            interfaceC1680500tpg.LIZJ();
        } else {
            C1673210tdv.LJ("", null, false, false, interfaceC1680500tpg, 6, 14);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$56(AFwS303S0000000_19 aFwS303S0000000_19, Object obj, Object obj2) {
        InterfaceC1680500tpg interfaceC1680500tpg = (InterfaceC1680500tpg) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && interfaceC1680500tpg.LIZ()) {
            interfaceC1680500tpg.LIZJ();
        } else {
            C1673210tdv.LJ("", null, false, false, interfaceC1680500tpg, 6, 14);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$57(AFwS303S0000000_19 aFwS303S0000000_19, Object obj, Object obj2) {
        InterfaceC1680500tpg interfaceC1680500tpg = (InterfaceC1680500tpg) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && interfaceC1680500tpg.LIZ()) {
            interfaceC1680500tpg.LIZJ();
        } else {
            C1673210tdv.LJ("", null, false, false, interfaceC1680500tpg, 6, 14);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$58(AFwS303S0000000_19 aFwS303S0000000_19, Object obj, Object obj2) {
        InterfaceC1680500tpg interfaceC1680500tpg = (InterfaceC1680500tpg) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && interfaceC1680500tpg.LIZ()) {
            interfaceC1680500tpg.LIZJ();
        } else {
            C1673210tdv.LJ("", null, false, false, interfaceC1680500tpg, 6, 14);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$59(AFwS303S0000000_19 aFwS303S0000000_19, Object obj, Object obj2) {
        InterfaceC1680500tpg interfaceC1680500tpg = (InterfaceC1680500tpg) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && interfaceC1680500tpg.LIZ()) {
            interfaceC1680500tpg.LIZJ();
        } else {
            C1673210tdv.LJ("", null, false, false, interfaceC1680500tpg, 6, 14);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$6(AFwS303S0000000_19 aFwS303S0000000_19, Object obj, Object obj2) {
        InterfaceC1680500tpg interfaceC1680500tpg = (InterfaceC1680500tpg) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && interfaceC1680500tpg.LIZ()) {
            interfaceC1680500tpg.LIZJ();
        } else {
            C1673210tdv.LJ("", null, false, false, interfaceC1680500tpg, 6, 14);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$60(AFwS303S0000000_19 aFwS303S0000000_19, Object obj, Object obj2) {
        InterfaceC1680500tpg interfaceC1680500tpg = (InterfaceC1680500tpg) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && interfaceC1680500tpg.LIZ()) {
            interfaceC1680500tpg.LIZJ();
        } else {
            C1673210tdv.LJ("", null, false, false, interfaceC1680500tpg, 6, 14);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$61(AFwS303S0000000_19 aFwS303S0000000_19, Object obj, Object obj2) {
        InterfaceC1680500tpg interfaceC1680500tpg = (InterfaceC1680500tpg) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && interfaceC1680500tpg.LIZ()) {
            interfaceC1680500tpg.LIZJ();
        } else {
            C1673210tdv.LJ("", null, false, false, interfaceC1680500tpg, 6, 14);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$62(AFwS303S0000000_19 aFwS303S0000000_19, Object obj, Object obj2) {
        InterfaceC1680500tpg interfaceC1680500tpg = (InterfaceC1680500tpg) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && interfaceC1680500tpg.LIZ()) {
            interfaceC1680500tpg.LIZJ();
        } else {
            C1673210tdv.LJ("", null, false, false, interfaceC1680500tpg, 6, 14);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$63(AFwS303S0000000_19 aFwS303S0000000_19, Object obj, Object obj2) {
        InterfaceC1680500tpg interfaceC1680500tpg = (InterfaceC1680500tpg) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && interfaceC1680500tpg.LIZ()) {
            interfaceC1680500tpg.LIZJ();
        } else {
            C1673210tdv.LJ("", null, false, false, interfaceC1680500tpg, 6, 14);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$64(AFwS303S0000000_19 aFwS303S0000000_19, Object obj, Object obj2) {
        InterfaceC1680500tpg interfaceC1680500tpg = (InterfaceC1680500tpg) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && interfaceC1680500tpg.LIZ()) {
            interfaceC1680500tpg.LIZJ();
        } else {
            C1673210tdv.LJ("", null, false, false, interfaceC1680500tpg, 6, 14);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$65(AFwS303S0000000_19 aFwS303S0000000_19, Object obj, Object obj2) {
        InterfaceC1680500tpg interfaceC1680500tpg = (InterfaceC1680500tpg) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && interfaceC1680500tpg.LIZ()) {
            interfaceC1680500tpg.LIZJ();
        } else {
            C1673210tdv.LJ("", null, false, false, interfaceC1680500tpg, 6, 14);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$66(AFwS303S0000000_19 aFwS303S0000000_19, Object obj, Object obj2) {
        InterfaceC1680500tpg interfaceC1680500tpg = (InterfaceC1680500tpg) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && interfaceC1680500tpg.LIZ()) {
            interfaceC1680500tpg.LIZJ();
        } else {
            C1673210tdv.LJ("", null, false, false, interfaceC1680500tpg, 6, 14);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$67(AFwS303S0000000_19 aFwS303S0000000_19, Object obj, Object obj2) {
        InterfaceC1680500tpg interfaceC1680500tpg = (InterfaceC1680500tpg) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && interfaceC1680500tpg.LIZ()) {
            interfaceC1680500tpg.LIZJ();
        } else {
            C1673210tdv.LJ("", null, false, false, interfaceC1680500tpg, 6, 14);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$68(AFwS303S0000000_19 aFwS303S0000000_19, Object obj, Object obj2) {
        InterfaceC1680500tpg interfaceC1680500tpg = (InterfaceC1680500tpg) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && interfaceC1680500tpg.LIZ()) {
            interfaceC1680500tpg.LIZJ();
        } else {
            C1673210tdv.LJ("", null, false, false, interfaceC1680500tpg, 6, 14);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$69(AFwS303S0000000_19 aFwS303S0000000_19, Object obj, Object obj2) {
        InterfaceC1680500tpg interfaceC1680500tpg = (InterfaceC1680500tpg) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && interfaceC1680500tpg.LIZ()) {
            interfaceC1680500tpg.LIZJ();
        } else {
            C1673210tdv.LJ("", null, false, false, interfaceC1680500tpg, 6, 14);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$7(AFwS303S0000000_19 aFwS303S0000000_19, Object obj, Object obj2) {
        InterfaceC1680500tpg interfaceC1680500tpg = (InterfaceC1680500tpg) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && interfaceC1680500tpg.LIZ()) {
            interfaceC1680500tpg.LIZJ();
        } else {
            C1673210tdv.LJ("", null, false, false, interfaceC1680500tpg, 6, 14);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$70(AFwS303S0000000_19 aFwS303S0000000_19, Object obj, Object obj2) {
        InterfaceC1680500tpg interfaceC1680500tpg = (InterfaceC1680500tpg) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && interfaceC1680500tpg.LIZ()) {
            interfaceC1680500tpg.LIZJ();
        } else {
            C1673210tdv.LJ("", null, false, false, interfaceC1680500tpg, 6, 14);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$71(AFwS303S0000000_19 aFwS303S0000000_19, Object obj, Object obj2) {
        InterfaceC1680500tpg interfaceC1680500tpg = (InterfaceC1680500tpg) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && interfaceC1680500tpg.LIZ()) {
            interfaceC1680500tpg.LIZJ();
        } else {
            C1673210tdv.LJ("", null, false, false, interfaceC1680500tpg, 6, 14);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$72(AFwS303S0000000_19 aFwS303S0000000_19, Object obj, Object obj2) {
        InterfaceC1680500tpg interfaceC1680500tpg = (InterfaceC1680500tpg) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && interfaceC1680500tpg.LIZ()) {
            interfaceC1680500tpg.LIZJ();
        } else {
            C1673210tdv.LJ("", null, false, false, interfaceC1680500tpg, 6, 14);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$73(AFwS303S0000000_19 aFwS303S0000000_19, Object obj, Object obj2) {
        InterfaceC1680500tpg interfaceC1680500tpg = (InterfaceC1680500tpg) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && interfaceC1680500tpg.LIZ()) {
            interfaceC1680500tpg.LIZJ();
        } else {
            C1673210tdv.LJ("", null, false, false, interfaceC1680500tpg, 6, 14);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$74(AFwS303S0000000_19 aFwS303S0000000_19, Object obj, Object obj2) {
        InterfaceC1680500tpg interfaceC1680500tpg = (InterfaceC1680500tpg) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && interfaceC1680500tpg.LIZ()) {
            interfaceC1680500tpg.LIZJ();
        } else {
            C1673210tdv.LJ("", null, false, false, interfaceC1680500tpg, 6, 14);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$75(AFwS303S0000000_19 aFwS303S0000000_19, Object obj, Object obj2) {
        InterfaceC1680500tpg interfaceC1680500tpg = (InterfaceC1680500tpg) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && interfaceC1680500tpg.LIZ()) {
            interfaceC1680500tpg.LIZJ();
        } else {
            C1668060tVc.LIZIZ(null, C0MBB.LIZIZ(2131825809, interfaceC1680500tpg), null, null, null, null, null, null, null, interfaceC1680500tpg, 0, 509);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$76(AFwS303S0000000_19 aFwS303S0000000_19, Object obj, Object obj2) {
        InterfaceC1680500tpg interfaceC1680500tpg = (InterfaceC1680500tpg) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && interfaceC1680500tpg.LIZ()) {
            interfaceC1680500tpg.LIZJ();
        } else {
            C1673210tdv.LJ("", null, false, false, interfaceC1680500tpg, 6, 14);
        }
        return Unit.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object invoke$77(AFwS303S0000000_19 aFwS303S0000000_19, Object obj, Object obj2) {
        Context context;
        AbstractC738140SxQ abstractC738140SxQ = (AbstractC738140SxQ) obj;
        C291001Au c291001Au = (C291001Au) obj2;
        if (c291001Au != null) {
            CommentService.LIZ.getClass();
            CommentService commentServiceLIZ = C523420Kfs.LIZ();
            Fragment fragmentLJI = C724240Sb0.LJI(abstractC738140SxQ);
            if (fragmentLJI != null) {
                context = fragmentLJI.getContext();
            } else {
                context = null;
            }
            commentServiceLIZ.LJLLJ(context, (CommentSurpriseStruct) c291001Au.LIZ);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$8(AFwS303S0000000_19 aFwS303S0000000_19, Object obj, Object obj2) {
        InterfaceC1680500tpg interfaceC1680500tpg = (InterfaceC1680500tpg) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && interfaceC1680500tpg.LIZ()) {
            interfaceC1680500tpg.LIZJ();
        } else {
            C1673210tdv.LJ("", null, false, false, interfaceC1680500tpg, 6, 14);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$9(AFwS303S0000000_19 aFwS303S0000000_19, Object obj, Object obj2) {
        InterfaceC1680500tpg interfaceC1680500tpg = (InterfaceC1680500tpg) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && interfaceC1680500tpg.LIZ()) {
            interfaceC1680500tpg.LIZJ();
        } else {
            C1673210tdv.LJ("", null, false, false, interfaceC1680500tpg, 6, 14);
        }
        return Unit.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$18(AFwS303S0000000_19 aFwS303S0000000_19, Object obj, Object obj2) {
        return obj;
    }

    public static /* bridge */ /* synthetic */ Object invoke$27(AFwS303S0000000_19 aFwS303S0000000_19, Object obj, Object obj2) {
        return obj;
    }
}
