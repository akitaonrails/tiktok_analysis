package kotlin.jvm.internal;

import X.AbstractC1394705d3;
import X.AbstractC1623806Xk;
import X.AbstractC1690640u62;
import X.AbstractC20074613ge;
import X.AbstractC738140SxQ;
import X.C013C;
import X.C058R;
import X.C05P0;
import X.C05P1;
import X.C05PL;
import X.C060Z;
import X.C06D1;
import X.C06SE;
import X.C06SG;
import X.C06SJ;
import X.C06US;
import X.C095E;
import X.C09AY;
import X.C0I0B;
import X.C0PEM;
import X.C0Y8T;
import X.C0YSQ;
import X.C0ZUJ;
import X.C1150204ei;
import X.C1184530gvj;
import X.C1186970gzf;
import X.C1187610h0h;
import X.C11H9;
import X.C127K;
import X.C1361805Uq;
import X.C1374205Zk;
import X.C1378605aS;
import X.C1380805ao;
import X.C1386605bk;
import X.C1389890mGx;
import X.C1389910mGz;
import X.C1394905d5;
import X.C1395105d7;
import X.C1395205d8;
import X.C1395305d9;
import X.C1395605dC;
import X.C1395705dD;
import X.C1397510mTF;
import X.C1397620mTQ;
import X.C13BV;
import X.C13IQ;
import X.C13LP;
import X.C1511905vx;
import X.C1512005vy;
import X.C1512105vz;
import X.C1523705xr;
import X.C1533910q1F;
import X.C15390060u;
import X.C15438062q;
import X.C15493064t;
import X.C15496064w;
import X.C1590906Kt;
import X.C1623606Xi;
import X.C1623706Xj;
import X.C1640706bd;
import X.C1672606gm;
import X.C1675710thx;
import X.C1677606ha;
import X.C1683130ttv;
import X.C1684206ie;
import X.C1684506ih;
import X.C1688706jN;
import X.C1689106jR;
import X.C1692940u9k;
import X.C1703106lh;
import X.C1708206mW;
import X.C1735706qx;
import X.C1736506r5;
import X.C1736606r6;
import X.C1736806r8;
import X.C1745106sT;
import X.C1745506sX;
import X.C1856690yPr;
import X.C189200o6;
import X.C197039127h;
import X.C19719912Dl;
import X.C19EG;
import X.C20066813fO;
import X.C20684815ws;
import X.C2097608Jq;
import X.C2188811AlT;
import X.C2191401Ape;
import X.C2202101BGm;
import X.C2296808zG;
import X.C23250099c;
import X.C259800zU;
import X.C491001vg;
import X.C657850PrD;
import X.C724240Sb0;
import X.C724920Sc6;
import X.C770770ULj;
import X.C866950Xzh;
import X.C869590Y9l;
import X.C894660Z7w;
import X.C909290Zln;
import X.EnumC1763806vU;
import X.EnumC904370Zdr;
import X.InterfaceC1147104eD;
import X.InterfaceC1256904vv;
import X.InterfaceC1364105Vn;
import X.InterfaceC1369205Xm;
import X.InterfaceC1380005ag;
import X.InterfaceC1665500tRU;
import X.InterfaceC1690500u5o;
import X.InterfaceC1692520u94;
import X.InterfaceC1692950u9l;
import X.InterfaceC1757606uU;
import X.InterfaceC497601wk;
import X.InterfaceC876950Yaj;
import Y.ACListenerS106S0200000_2;
import Y.ARunnableS44S0300000_11;
import android.app.Activity;
import android.content.Context;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwnerKt;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.android.livesdk.livesetting.subscription.LiveSubscriptionQuestionnaireHourFrequencySetting;
import com.bytedance.assem.arch.core.Assembler;
import com.bytedance.assem.arch.core.UIAssem;
import com.bytedance.assem.arch.reused.ReusedUIAssem;
import com.bytedance.assem.arch.reused.ReusedUIContentAssem;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.bytedance.assem.arch.view.UISlotAssem;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.google.gson.k;
import com.google.gson.n;
import com.google.gson.q;
import com.ss.android.ugc.aweme.AccountUserService;
import com.ss.android.ugc.aweme.IAccountService;
import com.ss.android.ugc.aweme.chatroom.GroupChatAssem;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.story.Story;
import com.ss.android.ugc.aweme.feed.model.story.highlights.StoryHighlightCollection;
import com.ss.android.ugc.aweme.feed.model.story.highlights.StoryHighlightInfo;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.im.ai.impl.smartreply.instruction.edit.InstructionEditConfig;
import com.ss.android.ugc.aweme.im.ai.impl.smartreply.instruction.edit.InstructionEditVM;
import com.ss.android.ugc.aweme.im.b2c.actionbar.ActionBarButtonConfBusiness;
import com.ss.android.ugc.aweme.im.b2c.actionbar.BusinessChatActionBarDataConverterAssem;
import com.ss.android.ugc.aweme.im.b2c.landing.BusinessAutoMessage;
import com.ss.android.ugc.aweme.im.b2c.landing.BusinessChatLandingMsgVM;
import com.ss.android.ugc.aweme.im.chatroom.api.model.SessionInfo;
import com.ss.android.ugc.aweme.im.common.model.BaseContact;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUser;
import com.ss.android.ugc.aweme.im.creative.edit.impl.toolbar.IMEditToolbarAssem;
import com.ss.android.ugc.aweme.im.message.content.GroupSystemContent;
import com.ss.android.ugc.aweme.im.message.content.SystemContent;
import com.ss.android.ugc.aweme.im.messagelist.api.IIMMessageAdapterAnalytics;
import com.ss.android.ugc.aweme.im.messagelist.api.fake.message.FakeMsgOperatorService;
import com.ss.android.ugc.aweme.im.report.api.IReportUtils;
import com.ss.android.ugc.aweme.im.sdk.chatdetail.redesign.detailpage.viewmodel.BotDetailViewModel;
import com.ss.android.ugc.aweme.im.sdk.chatdetail.redesign.util.IDetailMediaGridPageCellService;
import com.ss.android.ugc.aweme.im.service.analytics.IImDmProminenceAnalytics;
import com.ss.android.ugc.aweme.im.service.analytics.IImImproveBlockExperienceAnalytics;
import com.ss.android.ugc.aweme.im.strategy.businessconfig.ChatFeatureListConf;
import com.ss.android.ugc.aweme.im.ui.assem.SearchMediaGridAssem;
import com.ss.android.ugc.aweme.poi.detail.basicinfo.header.PoiDetailContentHeaderBaseAssemV3;
import com.ss.android.ugc.aweme.poi.detail.basicinfo.header.PoiDetailHeaderAssem;
import com.ss.android.ugc.aweme.poi.detail.container.PoiListApi;
import com.ss.android.ugc.aweme.poi.detail.container.model.PoiShopBookingInfo;
import com.ss.android.ugc.aweme.poi.detail.post.assem.PoiPostPageFooterAssem;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.core.ui.jedi.SearchJediMixFeedFragment;
import com.ss.android.ugc.aweme.slash.page.SlashFragment;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.ss.android.ugc.aweme.story.highlights.service.IStoryHighlightsShareService;
import com.ss.android.ugc.profile.platform.business.header.business.storyhighlights.business.HeaderStoryHighlightsOtherCollectionComponent;
import com.tts.oecverify.BdTuring;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS581S0100000_2;
import kotlin.jvm.internal.AwS590S0100000_11;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes3.dex */
public class AwS211S0300000_2 extends C09AY implements Function1 {
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
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS211S0300000_2 awS211S0300000_2, Object obj) {
        Assembler assembler = (Assembler) obj;
        assembler.EQ2((PoiPostPageFooterAssem) awS211S0300000_2.l0, new AwS581S0100000_2((C1184530gvj) awS211S0300000_2.l1, 11));
        assembler.EQ2((PoiPostPageFooterAssem) awS211S0300000_2.l0, new AwS581S0100000_2((C1187610h0h) awS211S0300000_2.l2, 12));
        assembler.RQ2((PoiPostPageFooterAssem) awS211S0300000_2.l0, AFwS229S0000000_2.get$arr$(8));
        assembler.RQ2((PoiPostPageFooterAssem) awS211S0300000_2.l0, AFwS229S0000000_2.get$arr$(9));
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS211S0300000_2 awS211S0300000_2, Object obj) {
        InterfaceC1692950u9l interfaceC1692950u9l = (InterfaceC1692950u9l) obj;
        if (!((Boolean) ((C05P0) ((C259800zU) awS211S0300000_2.l0).element).getValue()).booleanValue() && interfaceC1692950u9l.LIZLLL()) {
            C1683130ttv c1683130ttvLIZJ = C1692940u9k.LIZJ(interfaceC1692950u9l);
            C1683130ttv c1683130ttv = (C1683130ttv) awS211S0300000_2.l1;
            float f = c1683130ttv.LIZLLL;
            float f2 = c1683130ttv.LIZIZ;
            if (f - f2 > 0.0f) {
                float f3 = c1683130ttv.LIZJ;
                float f4 = c1683130ttv.LIZ;
                if (f3 - f4 > 0.0f) {
                    float f5 = c1683130ttvLIZJ.LIZLLL;
                    float f6 = c1683130ttvLIZJ.LIZIZ;
                    if (f5 - f6 > 0.0f) {
                        float f7 = c1683130ttvLIZJ.LIZJ;
                        float f8 = c1683130ttvLIZJ.LIZ;
                        if (f7 - f8 > 0.0f && f4 <= f8 && f2 <= f6 && f3 >= f7 && f >= f5) {
                            ((C05P0) ((C259800zU) awS211S0300000_2.l0).element).setValue(Boolean.TRUE);
                            ((Function0) ((C05P1) awS211S0300000_2.l2).getValue()).invoke();
                        }
                    }
                }
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$10(AwS211S0300000_2 awS211S0300000_2, Object obj) {
        String conversationId;
        BaseContact baseContact;
        View view = (View) obj;
        C869590Y9l c869590Y9l = (C869590Y9l) awS211S0300000_2.l0;
        String uid = null;
        if (c869590Y9l != null) {
            conversationId = c869590Y9l.getConversationId();
        } else {
            conversationId = null;
        }
        String str = "";
        if (conversationId == null) {
            conversationId = "";
        }
        C0ZUJ c0zuj = C0ZUJ.LIZ;
        Context context = view.getContext();
        String itemId = ((GroupSystemContent) awS211S0300000_2.l1).getItemId();
        if (itemId != null) {
            str = itemId;
        }
        List list = (List) awS211S0300000_2.l2;
        if (list != null && (baseContact = (BaseContact) ListProtector.get(list, 0)) != null) {
            uid = baseContact.getUid();
        }
        c0zuj.getClass();
        C0ZUJ.LIZ(context, str, conversationId, uid);
        return Unit.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object invoke$11(AwS211S0300000_2 awS211S0300000_2, Object obj) {
        Function1 function1;
        AbstractC1623806Xk abstractC1623806Xk = (AbstractC1623806Xk) ((C11H9) obj).LIZ;
        if (abstractC1623806Xk instanceof C1623706Xj) {
            Function0 function0 = (Function0) awS211S0300000_2.l0;
            if (function0 != null) {
                function0.invoke();
            }
        } else if (abstractC1623806Xk instanceof C491001vg) {
            Function1 function12 = (Function1) awS211S0300000_2.l1;
            if (function12 != null) {
                function12.invoke(((C491001vg) abstractC1623806Xk).LIZ);
            }
        } else if ((abstractC1623806Xk instanceof C1623606Xi) && (function1 = (Function1) awS211S0300000_2.l2) != null) {
            function1.invoke(((C1623606Xi) abstractC1623806Xk).LIZ);
        }
        return Unit.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object invoke$12(AwS211S0300000_2 awS211S0300000_2, Object obj) {
        Function1 function1;
        AbstractC1623806Xk abstractC1623806Xk = (AbstractC1623806Xk) ((C11H9) obj).LIZ;
        if (abstractC1623806Xk instanceof C1623706Xj) {
            Function0 function0 = (Function0) awS211S0300000_2.l0;
            if (function0 != null) {
                function0.invoke();
            }
        } else if (abstractC1623806Xk instanceof C491001vg) {
            Function1 function12 = (Function1) awS211S0300000_2.l1;
            if (function12 != null) {
                function12.invoke(((C491001vg) abstractC1623806Xk).LIZ);
            }
        } else if ((abstractC1623806Xk instanceof C1623606Xi) && (function1 = (Function1) awS211S0300000_2.l2) != null) {
            function1.invoke(((C1623606Xi) abstractC1623806Xk).LIZ);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$13(AwS211S0300000_2 awS211S0300000_2, Object obj) {
        if (((Activity) awS211S0300000_2.l0) != null) {
            if (((InterfaceC1256904vv) awS211S0300000_2.l1).getStatusCode() == 102000) {
                C1389910mGz c1389910mGz = new C1389910mGz((Activity) awS211S0300000_2.l0);
                c1389910mGz.LJIIIZ(2131848510);
                c1389910mGz.LJ(3000L);
                c1389910mGz.LJFF(2131848511);
                c1389910mGz.LIZ.LIZLLL = 2;
                c1389910mGz.LIZ(false);
                c1389910mGz.LIZ.LJIIIIZZ = new ACListenerS106S0200000_2((Activity) awS211S0300000_2.l0, (BotDetailViewModel) awS211S0300000_2.l2, 11);
                c1389910mGz.LJIIJJI();
            } else {
                C1389890mGx c1389890mGx = new C1389890mGx((Activity) awS211S0300000_2.l0);
                c1389890mGx.LJIIIZ(2131848502);
                c1389890mGx.LIZLLL(3000L);
                c1389890mGx.LIZ(true);
                c1389890mGx.LJIIJJI();
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$14(AwS211S0300000_2 awS211S0300000_2, Object obj) {
        C197039127h c197039127h = (C197039127h) obj;
        C0I0B.LJFF.LIZJ();
        c197039127h.setText(C894660Z7w.LIZ().getResources().getString(2131831741));
        C1856690yPr c1856690yPr = new C1856690yPr(c197039127h.getContext(), R.raw.icon_spinner_normal);
        c197039127h.setButtonStartIconDrawable(c1856690yPr);
        c1856690yPr.LJIIIZ();
        C23250099c.LIZLLL(C15493064t.LIZLLL, null, null, new C06D1((C19EG) awS211S0300000_2.l0, (C15496064w) awS211S0300000_2.l1, (C1397510mTF) awS211S0300000_2.l2, null), 3);
        return Unit.LIZ;
    }

    public static final Object invoke$15(AwS211S0300000_2 awS211S0300000_2, Object obj) {
        IReportUtils.LIZ.getClass();
        IReportUtils iReportUtilsLIZ = C1703106lh.LIZ();
        if (iReportUtilsLIZ != null) {
            C1684206ie c1684206ie = C1684206ie.LIZ;
            C869590Y9l c869590Y9l = (C869590Y9l) awS211S0300000_2.l0;
            c1684206ie.getClass();
            iReportUtilsLIZ.LIZ(new C1689106jR((C869590Y9l) awS211S0300000_2.l0, "inline_message", C1684206ie.LIZIZ(c869590Y9l), null, 24), (Activity) awS211S0300000_2.l1, "2", (C869590Y9l) awS211S0300000_2.l0, true);
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(((C869590Y9l) awS211S0300000_2.l0).getSender());
        sbLIZ.append("");
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        IIMMessageAdapterAnalytics iIMMessageAdapterAnalytics = (IIMMessageAdapterAnalytics) PluggableExtentionKt.pluggableSpiForReal(IIMMessageAdapterAnalytics.class);
        if (iIMMessageAdapterAnalytics != null) {
            C1684206ie c1684206ie2 = C1684206ie.LIZ;
            C869590Y9l c869590Y9l2 = (C869590Y9l) awS211S0300000_2.l0;
            c1684206ie2.getClass();
            iIMMessageAdapterAnalytics.LJFF(strLIZIZ, "inline_message", C1684206ie.LIZIZ(c869590Y9l2), C1677606ha.LIZ(((SessionInfo) awS211S0300000_2.l2).getChatType()), null, C0I0B.LJFF.LIZIZ(), ((SessionInfo) awS211S0300000_2.l2).getUuid());
        }
        return Unit.LIZ;
    }

    public static final Object invoke$16(AwS211S0300000_2 awS211S0300000_2, Object obj) {
        float fLIZIZ;
        C1395105d7.LIZ((C1395205d8) awS211S0300000_2.l0, (C20066813fO) obj);
        float fLJ = ((InterfaceC1369205Xm) awS211S0300000_2.l1).getViewConfiguration().LJ();
        long jLIZIZ = ((C1395205d8) awS211S0300000_2.l0).LIZIZ(C1374205Zk.LIZ(fLJ, fLJ));
        C1395205d8 c1395205d8 = (C1395205d8) awS211S0300000_2.l0;
        C1395305d9 c1395305d9 = c1395205d8.LIZ;
        C1395605dC[] c1395605dCArr = c1395305d9.LIZLLL;
        Arrays.fill(c1395605dCArr, 0, c1395605dCArr.length, (Object) null);
        c1395305d9.LJ = 0;
        C1395305d9 c1395305d92 = c1395205d8.LIZIZ;
        C1395605dC[] c1395605dCArr2 = c1395305d92.LIZLLL;
        Arrays.fill(c1395605dCArr2, 0, c1395605dCArr2.length, (Object) null);
        c1395305d92.LJ = 0;
        c1395205d8.LIZJ = 0L;
        C095E<AbstractC1394705d3> c095e = ((AbstractC20074613ge) awS211S0300000_2.l2).LLJJJ;
        if (c095e != null) {
            C05PL c05pl = C1380805ao.LIZ;
            float fLIZJ = 0.0f;
            if (Float.isNaN(C1395705dD.LIZIZ(jLIZIZ))) {
                fLIZIZ = 0.0f;
            } else {
                fLIZIZ = C1395705dD.LIZIZ(jLIZIZ);
            }
            if (!Float.isNaN(C1395705dD.LIZJ(jLIZIZ))) {
                fLIZJ = C1395705dD.LIZJ(jLIZIZ);
            }
            c095e.LJIIIIZZ(new C1394905d5(C1374205Zk.LIZ(fLIZIZ, fLIZJ)));
        }
        return Unit.LIZ;
    }

    public static final Object invoke$17(AwS211S0300000_2 awS211S0300000_2, Object obj) {
        ((Function1) awS211S0300000_2.l1).invoke(Float.valueOf(Math.min(Math.max(Float.intBitsToFloat((int) (((C1378605aS) obj).LIZ >> 32)), 0.0f), ((Number) ((C05P0) awS211S0300000_2.l2).getValue()).floatValue()) / ((Number) ((C05P0) awS211S0300000_2.l2).getValue()).floatValue()));
        return Unit.LIZ;
    }

    public static final Object invoke$18(AwS211S0300000_2 awS211S0300000_2, Object obj) {
        List list = (List) obj;
        C013C c013c = (C013C) awS211S0300000_2.l0;
        if (!c013c.element) {
            c013c.element = true;
            C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C06SE((C06SJ) awS211S0300000_2.l1, list, (CompletionBlock) awS211S0300000_2.l2, null), 3);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$19(AwS211S0300000_2 awS211S0300000_2, Object obj) {
        ((Assembler) obj).QQ2((IMEditToolbarAssem) awS211S0300000_2.l0, new AwS368S0200000_2((View) awS211S0300000_2.l2, (C13IQ) awS211S0300000_2.l1, 117));
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS211S0300000_2 awS211S0300000_2, Object obj) {
        C20066813fO c20066813fO = (C20066813fO) obj;
        if (((InterfaceC1380005ag) awS211S0300000_2.l0).LIZJ(c20066813fO.LIZJ, (InterfaceC1692520u94) awS211S0300000_2.l1)) {
            c20066813fO.LIZ();
            ((C013C) awS211S0300000_2.l2).element = true;
        }
        return Unit.LIZ;
    }

    public static final Object invoke$20(AwS211S0300000_2 awS211S0300000_2, Object obj) {
        SearchJediMixFeedFragment searchJediMixFeedFragment = (SearchJediMixFeedFragment) awS211S0300000_2.l0;
        C657850PrD.LIZJ((Assembler) obj, searchJediMixFeedFragment, new AwS219S0300000_10(searchJediMixFeedFragment, (C19EG) awS211S0300000_2.l1, (View) awS211S0300000_2.l2, 23));
        return Unit.LIZ;
    }

    public static final Object invoke$21(AwS211S0300000_2 awS211S0300000_2, Object obj) {
        long jLJFF;
        long j = ((C1378605aS) obj).LIZ;
        long jCurrentTimeMillis = System.currentTimeMillis();
        C05P0 c05p0 = (C05P0) awS211S0300000_2.l1;
        float f = C1675710thx.LIZ;
        if (jCurrentTimeMillis - ((Number) c05p0.getValue()).longValue() >= 200) {
            ((C05P0) awS211S0300000_2.l1).setValue(Long.valueOf(jCurrentTimeMillis));
            InterfaceC1692950u9l interfaceC1692950u9l = (InterfaceC1692950u9l) ((C05P0) awS211S0300000_2.l2).getValue();
            if (interfaceC1692950u9l != null) {
                jLJFF = C1692940u9k.LJFF(interfaceC1692950u9l);
            } else {
                jLJFF = 0;
            }
            Function1 function1 = (Function1) awS211S0300000_2.l0;
            float fIntBitsToFloat = Float.intBitsToFloat((int) (jLJFF >> 32)) + Float.intBitsToFloat((int) (j >> 32));
            float fIntBitsToFloat2 = Float.intBitsToFloat((int) (jLJFF & 4294967295L)) + Float.intBitsToFloat((int) (j & 4294967295L));
            function1.invoke(new C1378605aS((((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) & 4294967295L)));
        }
        return Unit.LIZ;
    }

    public static final Object invoke$22(AwS211S0300000_2 awS211S0300000_2, Object obj) {
        C1745106sT c1745106sTWQ2 = ((BusinessChatActionBarDataConverterAssem) awS211S0300000_2.l0).ho().wQ2();
        String str = ((ActionBarButtonConfBusiness) awS211S0300000_2.l1).businessBtnId;
        Map<String, String> map = (Map) awS211S0300000_2.l2;
        c1745106sTWQ2.getClass();
        if (str != null && str.length() != 0 && map != null && !map.isEmpty()) {
            if (Intrinsics.LJFF(str, EnumC1763806vU.TTEC_SHOP_BAR.getBtnId())) {
                C0I0B.LJFF.LIZIZ().sendEvent("tiktokec_shop_entrance_click", map);
            } else if (Intrinsics.LJFF(str, EnumC1763806vU.TTEC_SHOWCASE_BAR.getBtnId())) {
                C0I0B.LJFF.LIZIZ().sendEvent("tiktokec_showcase_entrance_click", map);
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$23(AwS211S0300000_2 awS211S0300000_2, Object obj) {
        String str;
        IAccountService iAccountService;
        AccountUserService accountUserServiceLJIIJ;
        ((HeaderStoryHighlightsOtherCollectionComponent) awS211S0300000_2.l0).zp();
        StoryHighlightCollection storyHighlightCollection = (StoryHighlightCollection) awS211S0300000_2.l1;
        String str2 = null;
        if (storyHighlightCollection != null) {
            str = storyHighlightCollection.collectionId;
        } else {
            str = null;
        }
        C06US.LIZ.getClass();
        C06US.LIZ("others_homepage", "longpress_cover", str, "share");
        Fragment fragment = (Fragment) awS211S0300000_2.l2;
        if (fragment != null && (iAccountService = (IAccountService) PluggableExtentionKt.pluggableSpi$default(IAccountService.class, false, false, false, 14, null)) != null && (accountUserServiceLJIIJ = iAccountService.LJIIJ()) != null) {
            User curUser = accountUserServiceLJIIJ.getCurUser();
            C19EG c19egRequireActivity = fragment.requireActivity();
            Aweme aweme = new Aweme();
            StoryHighlightCollection storyHighlightCollection2 = (StoryHighlightCollection) awS211S0300000_2.l1;
            if (storyHighlightCollection2 != null) {
                str2 = storyHighlightCollection2.collectionId;
            }
            aweme.setAid(str2);
            aweme.setAwemeType(40);
            aweme.setStory(new Story(0L, false, 0L, null, 0L, false, false, false, false, false));
            aweme.setAuthor(curUser);
            aweme.storyHighlightInfo = new StoryHighlightInfo(null, storyHighlightCollection2, null, true, false);
            IStoryHighlightsShareService iStoryHighlightsShareService = (IStoryHighlightsShareService) PluggableExtentionKt.pluggableSpi$default(IStoryHighlightsShareService.class, false, false, false, 14, null);
            if (iStoryHighlightsShareService != null) {
                iStoryHighlightsShareService.LIZ(c19egRequireActivity, "others_homepage", aweme, "click");
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$24(AwS211S0300000_2 awS211S0300000_2, Object obj) {
        InterfaceC1147104eD interfaceC1147104eD;
        Assembler assembler = (Assembler) obj;
        C724920Sc6 c724920Sc6 = (C724920Sc6) awS211S0300000_2.l0;
        Class cls = (Class) awS211S0300000_2.l1;
        c724920Sc6.getClass();
        if (UIContentAssem.class.isAssignableFrom(cls)) {
            interfaceC1147104eD = new InterfaceC1147104eD() { // from class: X.04eA
                @Override // X.InterfaceC1147104eD
                public final void LIZ(Class cls2, C1150204ei c1150204ei, Assembler assembler2) {
                    assembler2.QQ2(c1150204ei, new AwS581S0100000_2(cls2, (Class<?>) 610));
                }
            };
        } else if (UISlotAssem.class.isAssignableFrom(cls)) {
            interfaceC1147104eD = new InterfaceC1147104eD() { // from class: X.04eB
                @Override // X.InterfaceC1147104eD
                public final void LIZ(Class cls2, C1150204ei c1150204ei, Assembler assembler2) {
                    assembler2.RQ2(c1150204ei, new AwS581S0100000_2(cls2, (Class<?>) 611));
                }
            };
        } else if (ReusedUISlotAssem.class.isAssignableFrom(cls)) {
            interfaceC1147104eD = new InterfaceC1147104eD() { // from class: X.0RTP
                @Override // X.InterfaceC1147104eD
                public final void LIZ(Class cls2, C1150204ei c1150204ei, Assembler assembler2) {
                    AwS590S0100000_11 awS590S0100000_11 = new AwS590S0100000_11(cls2, (Class<?>) 507);
                    assembler2.getClass();
                    ARunnableS44S0300000_11 aRunnableS44S0300000_11 = new ARunnableS44S0300000_11(awS590S0100000_11, assembler2, c1150204ei, 5);
                    C0RTR c0rtr = assembler2.LLILLL;
                    if (c0rtr != null) {
                        c0rtr.LIZ(aRunnableS44S0300000_11);
                    } else {
                        aRunnableS44S0300000_11.run();
                    }
                }
            };
        } else if (ReusedUIContentAssem.class.isAssignableFrom(cls)) {
            interfaceC1147104eD = new InterfaceC1147104eD() { // from class: X.0RTQ
                @Override // X.InterfaceC1147104eD
                public final void LIZ(Class cls2, C1150204ei c1150204ei, Assembler assembler2) {
                    AwS590S0100000_11 awS590S0100000_11 = new AwS590S0100000_11(cls2, (Class<?>) 509);
                    assembler2.getClass();
                    ARunnableS44S0300000_11 aRunnableS44S0300000_11 = new ARunnableS44S0300000_11(awS590S0100000_11, assembler2, c1150204ei, 4);
                    C0RTR c0rtr = assembler2.LLILLL;
                    if (c0rtr != null) {
                        c0rtr.LIZ(aRunnableS44S0300000_11);
                    } else {
                        aRunnableS44S0300000_11.run();
                    }
                }
            };
        } else if (ReusedUIAssem.class.isAssignableFrom(cls)) {
            interfaceC1147104eD = new InterfaceC1147104eD() { // from class: X.0RTO
                @Override // X.InterfaceC1147104eD
                public final void LIZ(Class cls2, C1150204ei c1150204ei, Assembler assembler2) {
                    AwS590S0100000_11 awS590S0100000_11 = new AwS590S0100000_11(cls2, (Class<?>) 508);
                    assembler2.getClass();
                    ARunnableS44S0300000_11 aRunnableS44S0300000_11 = new ARunnableS44S0300000_11(awS590S0100000_11, assembler2, c1150204ei, 3);
                    C0RTR c0rtr = assembler2.LLILLL;
                    if (c0rtr != null) {
                        c0rtr.LIZ(aRunnableS44S0300000_11);
                    } else {
                        aRunnableS44S0300000_11.run();
                    }
                }
            };
        } else {
            if (AbstractC738140SxQ.class.isAssignableFrom(cls)) {
                interfaceC1147104eD = new InterfaceC1147104eD() { // from class: X.04eC
                    @Override // X.InterfaceC1147104eD
                    public final void LIZ(Class cls2, C1150204ei c1150204ei, Assembler assembler2) {
                        assembler2.vQ2(c1150204ei, new AwS581S0100000_2(cls2, (Class<?>) 612));
                    }
                };
            }
            return Unit.LIZ;
        }
        interfaceC1147104eD.LIZ((Class) awS211S0300000_2.l1, (C1150204ei) awS211S0300000_2.l2, assembler);
        return Unit.LIZ;
    }

    public static final Object invoke$25(AwS211S0300000_2 awS211S0300000_2, Object obj) {
        String str;
        String str2;
        C1512005vy c1512005vy = (C1512005vy) obj;
        if (!c1512005vy.LLILZ && (!a0.LJJJIL(c1512005vy.LLILLJJLI) || !a0.LJJJIL(c1512005vy.LL))) {
            InstructionEditConfig instructionEditConfig = ((InstructionEditVM) awS211S0300000_2.l0).LL.getValue().LL;
            if (instructionEditConfig.botId == 0) {
                ((InstructionEditVM) awS211S0300000_2.l0).setState(new AwS581S0100000_2((View) awS211S0300000_2.l1, 623));
            } else {
                ((InstructionEditVM) awS211S0300000_2.l0).setState(AFwS229S0000000_2.get$arr$(829));
                String str3 = c1512005vy.LL;
                C060Z c060z = instructionEditConfig.sectionType;
                if (c060z == C060Z.AI_CANNOT_REPLY) {
                    str = str3;
                } else {
                    str = null;
                }
                if (c060z == C060Z.ASK_FOR_APPROVAL) {
                    str2 = str3;
                } else {
                    str2 = null;
                }
                C1512105vz c1512105vz = new C1512105vz(str, str2);
                C15390060u c15390060u = C15390060u.LL;
                long j = instructionEditConfig.botId;
                C058R c058r = new C058R((Function0) awS211S0300000_2.l2, (View) awS211S0300000_2.l1, (InstructionEditVM) awS211S0300000_2.l0, str3, null);
                c15390060u.getClass();
                C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C1511905vx(c058r, j, c1512105vz, null), 3);
            }
        }
        return Unit.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v32, types: [X.06r7] */
    public static final Object invoke$26(AwS211S0300000_2 awS211S0300000_2, Object obj) {
        String strLIZ;
        final List listLLIIII;
        String str;
        String str2;
        C1736506r5 c1736506r5 = (C1736506r5) obj;
        if (!c1736506r5.LLIZLLLIL) {
            InterfaceC1364105Vn interfaceC1364105Vn = (InterfaceC1364105Vn) awS211S0300000_2.l0;
            if (interfaceC1364105Vn != null) {
                Unit unit = Unit.LIZ;
                C189200o6.m2constructorimpl(unit);
                interfaceC1364105Vn.resumeWith(unit);
            }
        } else if (((BusinessChatLandingMsgVM) awS211S0300000_2.l1).vQ2() != null) {
            BusinessChatLandingMsgVM businessChatLandingMsgVM = (BusinessChatLandingMsgVM) awS211S0300000_2.l1;
            InterfaceC1364105Vn interfaceC1364105Vn2 = (InterfaceC1364105Vn) awS211S0300000_2.l0;
            Map map = (Map) awS211S0300000_2.l2;
            businessChatLandingMsgVM.setState(AFwS229S0000000_2.get$arr$(835));
            C1735706qx c1735706qx = (C1735706qx) businessChatLandingMsgVM.LLILZIL.getValue();
            if (c1735706qx != null) {
                int i = c1736506r5.LL;
                String str3 = "";
                if (i != 1) {
                    if (i != 3) {
                        if (i != 5) {
                            strLIZ = c1735706qx.LIZIZ.getSingleChatFromUserId();
                            if (strLIZ == null) {
                                strLIZ = "";
                            }
                        } else {
                            strLIZ = c1735706qx.LIZ("item_id");
                        }
                    } else {
                        strLIZ = c1735706qx.LIZ("room_id");
                    }
                } else {
                    strLIZ = c1735706qx.LIZ("creative_id");
                }
                final AwS87S1200000_2 awS87S1200000_2 = new AwS87S1200000_2(businessChatLandingMsgVM, (BusinessChatLandingMsgVM) interfaceC1364105Vn2, (InterfaceC1364105Vn<? super Unit>) strLIZ, (String) 11);
                List<BusinessAutoMessage> list = businessChatLandingMsgVM.getState().LLILLJJLI;
                C869590Y9l c869590Y9l = null;
                if (list != null) {
                    listLLIIII = C13LP.LLIIII(list);
                } else {
                    listLLIIII = null;
                }
                List<C869590Y9l> list2 = businessChatLandingMsgVM.getState().LLIZ;
                if (list2 != null) {
                    C13LP.LLIIII(list2);
                }
                if (C866950Xzh.LIZIZ(businessChatLandingMsgVM.getState().LLILLL)) {
                    if (map != null) {
                        str = (String) map.get("a:suggestion_rank_index");
                    } else {
                        str = null;
                    }
                    Object value = businessChatLandingMsgVM.LLILZLL.getValue();
                    C909290Zln c909290ZlnVQ2 = businessChatLandingMsgVM.vQ2();
                    String str4 = businessChatLandingMsgVM.getState().LLJ;
                    String strXQ2 = businessChatLandingMsgVM.xQ2();
                    if (C866950Xzh.LIZ(str)) {
                        str2 = "click_question";
                    } else {
                        str2 = "send_other_message";
                    }
                    if (str != null) {
                        str3 = str;
                    }
                    value.getClass();
                    C1745506sX.LJ(c909290ZlnVQ2, str4, strXQ2, str2, str3);
                }
                businessChatLandingMsgVM.setState(AFwS229S0000000_2.get$arr$(833));
                C909290Zln c909290ZlnVQ22 = businessChatLandingMsgVM.vQ2();
                if (c909290ZlnVQ22 == null) {
                    if (interfaceC1364105Vn2 != null) {
                        Unit unit2 = Unit.LIZ;
                        C189200o6.m2constructorimpl(unit2);
                        interfaceC1364105Vn2.resumeWith(unit2);
                    }
                } else {
                    List<C1736806r8> list3 = businessChatLandingMsgVM.LLJIJIL;
                    ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list3, 10));
                    for (C1736806r8 c1736806r8 : list3) {
                        C1684506ih c1684506ih = new C1684506ih();
                        C1736606r6 c1736606r6 = c1736806r8.LIZ;
                        c1684506ih.LIZ = Integer.valueOf(c1736606r6.LIZ);
                        c1684506ih.LIZIZ = c1736606r6.LIZIZ;
                        c1684506ih.LIZJ = c1736606r6.LIZJ;
                        c1684506ih.LIZLLL = c1736606r6.LIZLLL;
                        c1684506ih.LJ = c1736606r6.LJ;
                        c1684506ih.LJFF = c1736606r6.LJFF;
                        c1684506ih.LJI = new C1708206mW(c1736606r6.LJI);
                        c1684506ih.LIZJ = c1736806r8.LIZIZ;
                        arrayList.add(c1684506ih);
                    }
                    if (!businessChatLandingMsgVM.LLJIJIL.isEmpty()) {
                        C0Y8T c0y8tLIZ = C0YSQ.LIZIZ(InterfaceC876950Yaj.LIZ).LIZ(c909290ZlnVQ22.getConversationId());
                        if (c0y8tLIZ != null) {
                            C1736806r8 c1736806r82 = (C1736806r8) C13LP.LJJLIIIJL(businessChatLandingMsgVM.LLJIJIL);
                            if (c1736806r82 != null) {
                                c869590Y9l = c1736806r82.LIZJ;
                            }
                            c0y8tLIZ.setLastShowMessage(c869590Y9l);
                        }
                        businessChatLandingMsgVM.LLJIJIL = C13BV.INSTANCE;
                        FakeMsgOperatorService fakeMsgOperatorService = (FakeMsgOperatorService) PluggableExtentionKt.pluggableSpiForReal(FakeMsgOperatorService.class);
                        if (fakeMsgOperatorService != 0) {
                            fakeMsgOperatorService.LIZJ(new InterfaceC1757606uU() { // from class: X.06r7
                                @Override // X.InterfaceC1757506uT
                                public final void LIZIZ(C1736606r6 c1736606r62, int i2, String str5) {
                                }

                                @Override // X.InterfaceC1757606uU
                                public final void LIZ() {
                                    awS87S1200000_2.invoke(listLLIIII);
                                }
                            }, c909290ZlnVQ22.getConversationId(), c909290ZlnVQ22.getUuid(), arrayList);
                        } else if (interfaceC1364105Vn2 != null) {
                            Unit unit3 = Unit.LIZ;
                            C189200o6.m2constructorimpl(unit3);
                            interfaceC1364105Vn2.resumeWith(unit3);
                        }
                    } else {
                        awS87S1200000_2.invoke(listLLIIII);
                    }
                }
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$27(AwS211S0300000_2 awS211S0300000_2, Object obj) {
        C770770ULj c770770ULj = (C770770ULj) obj;
        c770770ULj.LIZIZ = false;
        C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope((Fragment) awS211S0300000_2.l0), null, null, new C1523705xr((C259800zU) awS211S0300000_2.l1, (Context) awS211S0300000_2.l2, c770770ULj, null), 3);
        C20684815ws.LJIILLIIL("filter_all_close_reminder_page_click", C2097608Jq.LJIIIIZZ(new Pair("enter_from", "comment_zone"), new Pair("action", "update_setting")));
        return Unit.LIZ;
    }

    public static final Object invoke$28(AwS211S0300000_2 awS211S0300000_2, Object obj) {
        C1590906Kt.LIZIZ("unlockAnimResInfoV2 cancel options");
        C1533910q1F c1533910q1F = (C1533910q1F) awS211S0300000_2.l0;
        if (c1533910q1F != null) {
            c1533910q1F.LIZ();
        }
        C1533910q1F c1533910q1F2 = (C1533910q1F) awS211S0300000_2.l1;
        if (c1533910q1F2 != null) {
            c1533910q1F2.LIZ();
        }
        C1533910q1F c1533910q1F3 = (C1533910q1F) awS211S0300000_2.l2;
        if (c1533910q1F3 != null) {
            c1533910q1F3.LIZ();
        }
        return Unit.LIZ;
    }

    public static final Object invoke$29(AwS211S0300000_2 awS211S0300000_2, Object obj) {
        String strLJIIL;
        k kVarLJJIIZ;
        String str = (String) obj;
        Map map = (Map) awS211S0300000_2.l0;
        if (map == null || (strLJIIL = (String) map.get(str)) == null) {
            n nVar = (n) awS211S0300000_2.l1;
            if (nVar != null && (kVarLJJIIZ = nVar.LJJIIZ(str)) != null) {
                C2191401Ape c2191401Ape = (C2191401Ape) awS211S0300000_2.l2;
                c2191401Ape.getClass();
                if (kVarLJJIIZ instanceof q) {
                    q qVarLJIILJJIL = kVarLJJIIZ.LJIILJJIL();
                    Object obj2 = qVarLJIILJJIL.LL;
                    if (obj2 instanceof String) {
                        strLJIIL = qVarLJIILJJIL.LJIL();
                    } else if (obj2 instanceof Number) {
                        strLJIIL = qVarLJIILJJIL.LJIJ().toString();
                    } else if (obj2 instanceof Boolean) {
                        strLJIIL = String.valueOf(qVarLJIILJJIL.LJ());
                    } else {
                        strLJIIL = qVarLJIILJJIL.toString();
                    }
                } else {
                    strLJIIL = c2191401Ape.LJIIL(kVarLJJIIZ);
                }
            } else {
                strLJIIL = null;
            }
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(str);
        sbLIZ.append('=');
        sbLIZ.append(strLJIIL);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$3(AwS211S0300000_2 awS211S0300000_2, Object obj) {
        Assembler assembler = (Assembler) obj;
        assembler.EQ2((UIAssem) awS211S0300000_2.l0, new AwS581S0100000_2((ChatFeatureListConf) awS211S0300000_2.l2, 99));
        GroupChatAssem groupChatAssem = (GroupChatAssem) awS211S0300000_2.l1;
        groupChatAssem.getClass();
        C724240Sb0.LJI(groupChatAssem);
        assembler.EQ2(groupChatAssem, new AwS581S0100000_2(groupChatAssem, 682));
        assembler.vQ2(groupChatAssem, AFwS229S0000000_2.get$arr$(904));
        GroupChatAssem groupChatAssem2 = (GroupChatAssem) awS211S0300000_2.l1;
        assembler.RQ2(groupChatAssem2, new AwS90S0110000_2(groupChatAssem2.LJJIJL().findViewById(R.id.krm), true, 8));
        assembler.QQ2(groupChatAssem2, new AwS581S0100000_2(groupChatAssem2, 684));
        return Unit.LIZ;
    }

    public static final Object invoke$30(AwS211S0300000_2 awS211S0300000_2, Object obj) {
        Integer numValueOf;
        ((View) obj).invalidate();
        if (((SessionInfo) awS211S0300000_2.l0) != null) {
            IReportUtils.LIZ.getClass();
            IReportUtils iReportUtilsLIZ = C1703106lh.LIZ();
            if (iReportUtilsLIZ != null) {
                iReportUtilsLIZ.LIZ(new C1688706jN((SessionInfo) awS211S0300000_2.l0, "block_notice", "dm_block_action"), (Activity) awS211S0300000_2.l1, "10", null, true);
            }
            IImImproveBlockExperienceAnalytics.LIZ.getClass();
            IImImproveBlockExperienceAnalytics iImImproveBlockExperienceAnalyticsLIZ = C2202101BGm.LIZ();
            if (iImImproveBlockExperienceAnalyticsLIZ != null) {
                iImImproveBlockExperienceAnalyticsLIZ.LIZJ("report", C0I0B.LJFF.LIZIZ());
            }
            IImDmProminenceAnalytics iImDmProminenceAnalytics = (IImDmProminenceAnalytics) PluggableExtentionKt.pluggableSpiForReal(IImDmProminenceAnalytics.class);
            if (iImDmProminenceAnalytics != null) {
                IMUser iMUser = (IMUser) awS211S0300000_2.l2;
                String recType = null;
                if (iMUser != null) {
                    numValueOf = Integer.valueOf(iMUser.getFollowStatus());
                } else {
                    numValueOf = null;
                }
                IMUser iMUser2 = (IMUser) awS211S0300000_2.l2;
                if (iMUser2 != null) {
                    recType = iMUser2.getRecType();
                }
                iImDmProminenceAnalytics.LIZLLL(C0I0B.LJFF.LIZIZ(), numValueOf, recType);
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$31(AwS211S0300000_2 awS211S0300000_2, Object obj) {
        C23250099c.LIZLLL((InterfaceC497601wk) awS211S0300000_2.l0, null, null, new C1361805Uq((InterfaceC1665500tRU) awS211S0300000_2.l1, (AbstractC1690640u62) awS211S0300000_2.l2, (String) obj, null), 3);
        return Unit.LIZ;
    }

    public static final Object invoke$32(AwS211S0300000_2 awS211S0300000_2, Object obj) {
        Assembler assembler = (Assembler) obj;
        assembler.EQ2((PoiDetailContentHeaderBaseAssemV3) awS211S0300000_2.l0, new AwS384S0200000_18((PoiListApi.PoiDetailResponse) awS211S0300000_2.l1, (C1186970gzf) awS211S0300000_2.l2, 293));
        assembler.RQ2((PoiDetailContentHeaderBaseAssemV3) awS211S0300000_2.l0, AFwS229S0000000_2.get$arr$(920));
        return Unit.LIZ;
    }

    public static final Object invoke$33(AwS211S0300000_2 awS211S0300000_2, Object obj) {
        Assembler assembler = (Assembler) obj;
        assembler.EQ2((PoiDetailHeaderAssem) awS211S0300000_2.l0, new AwS368S0200000_2((PoiShopBookingInfo) awS211S0300000_2.l1, (C1186970gzf) awS211S0300000_2.l2, 169));
        assembler.RQ2((PoiDetailHeaderAssem) awS211S0300000_2.l0, AFwS229S0000000_2.get$arr$(922));
        return Unit.LIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00b7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$4(kotlin.jvm.internal.AwS211S0300000_2 r11, java.lang.Object r12) {
        /*
            com.ss.android.ugc.aweme.im.message.content.SystemContent$Key r12 = (com.ss.android.ugc.aweme.im.message.content.SystemContent.Key) r12
            java.lang.Object r0 = r11.l0
            X.0Y9l r0 = (X.C869590Y9l) r0
            java.util.List r4 = r12.getActionDismissConditions()
            r7 = 1
            if (r4 == 0) goto L88
            com.ss.android.ugc.aweme.im.message.content.utils.SystemContentDismissUtil r3 = com.ss.android.ugc.aweme.im.message.content.utils.SystemContentDismissUtil.INSTANCE
            com.ss.android.ugc.aweme.im.message.content.utils.SystemContentDismissContext r2 = new com.ss.android.ugc.aweme.im.message.content.utils.SystemContentDismissContext
            if (r0 == 0) goto L19
            java.lang.String r1 = r0.getConversationId()
            if (r1 != 0) goto L1b
        L19:
            java.lang.String r1 = ""
        L1b:
            r0 = 0
            r2.<init>(r1, r0, r0, r0)
            boolean r0 = r3.shouldDismiss(r2, r4)
            if (r0 != r7) goto L88
            r10 = 1
        L26:
            java.lang.Object r6 = r11.l0
            X.0Y9l r6 = (X.C869590Y9l) r6
            java.lang.Object r9 = r11.l1
            com.ss.android.ugc.aweme.im.message.content.SystemContent r9 = (com.ss.android.ugc.aweme.im.message.content.SystemContent) r9
            java.lang.Object r0 = r11.l2
            X.06gm r0 = (X.C1672606gm) r0
            com.ss.android.ugc.aweme.im.sdk.chat.controller.SystemContentTemplateParser r1 = com.ss.android.ugc.aweme.im.sdk.chat.controller.SystemContentTemplateParser.LIZIZ
            X.06Wv r0 = r0.LJFF
            if (r0 == 0) goto L86
            X.06Ws<kotlin.jvm.functions.Function2<X.0Y9l, com.ss.android.ugc.aweme.im.message.content.SystemContent$Key, java.lang.Boolean>> r0 = r0.LIZJ
            if (r0 == 0) goto L86
            T r8 = r0.LIZ
            kotlin.jvm.functions.Function2 r8 = (kotlin.jvm.functions.Function2) r8
        L40:
            r1.getClass()
            int r1 = r12.getAction()
            r0 = 4
            if (r1 != r0) goto La5
            if (r6 == 0) goto La5
            java.lang.String[] r0 = X.C844450XAt.LIZ
            java.lang.String[] r5 = X.C844450XAt.LIZIZ()
            if (r9 == 0) goto La5
            int r0 = r5.length
            if (r0 == 0) goto La5
            java.lang.String r0 = r9.getNewTips()
            boolean r0 = X.C844450XAt.LIZ(r0, r5)
            if (r0 != 0) goto Lb1
            java.lang.String r0 = r9.getTips()
            boolean r0 = X.C844450XAt.LIZ(r0, r5)
            if (r0 != 0) goto Lb1
            com.ss.android.ugc.aweme.im.message.content.SystemContent$Key[] r4 = r9.getTemplate()
            if (r4 == 0) goto L8a
            int r3 = r4.length
            r2 = 0
        L73:
            if (r2 >= r3) goto L8a
            r1 = r4[r2]
            java.lang.String[] r0 = X.C844450XAt.LIZ
            java.lang.String r0 = r1.getLink()
            boolean r0 = X.C844450XAt.LIZJ(r0, r5)
            if (r0 != 0) goto Lb1
            int r2 = r2 + 1
            goto L73
        L86:
            r8 = 0
            goto L40
        L88:
            r10 = 0
            goto L26
        L8a:
            com.ss.android.ugc.aweme.im.message.content.SystemContent$Key[] r4 = r9.getNewTemplate()
            if (r4 == 0) goto La5
            int r3 = r4.length
            r2 = 0
        L92:
            if (r2 >= r3) goto La5
            r1 = r4[r2]
            java.lang.String[] r0 = X.C844450XAt.LIZ
            java.lang.String r0 = r1.getLink()
            boolean r0 = X.C844450XAt.LIZJ(r0, r5)
            if (r0 != 0) goto Lb1
            int r2 = r2 + 1
            goto L92
        La5:
            if (r8 == 0) goto Lb7
            java.lang.Object r0 = r8.invoke(r6, r12)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r7 = r0.booleanValue()
        Lb1:
            r10 = r10 | r7
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r10)
            return r0
        Lb7:
            r7 = 0
            goto Lb1
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS211S0300000_2.invoke$4(kotlin.jvm.internal.AwS211S0300000_2, java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0073  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$5(kotlin.jvm.internal.AwS211S0300000_2 r3, java.lang.Object r4) {
        /*
            java.lang.Object r0 = r3.l0
            X.127K r0 = (X.C127K) r0
            X.127M r1 = r0.getAccessory()
            boolean r0 = r1 instanceof X.C127A
            if (r0 == 0) goto L73
            X.11GO r1 = (X.C11GO) r1
            if (r1 == 0) goto L73
            boolean r1 = r1.LJIILIIL()
            r0 = 1
            if (r1 != r0) goto L73
        L17:
            java.lang.String r4 = "off"
            if (r0 == 0) goto L71
            java.lang.Object r0 = r3.l1
            X.06bv r0 = (X.InterfaceC1642506bv) r0
            if (r0 == 0) goto L24
            r0.call()
        L24:
            java.lang.Object r0 = r3.l2
            android.content.Context r0 = (android.content.Context) r0
            android.app.Activity r0 = X.C1388190mED.LIZ(r0)
            if (r0 == 0) goto L48
            X.0mGx r1 = new X.0mGx
            r1.<init>(r0)
            r0 = 2131831698(0x7f112b92, float:1.9296429E38)
            r1.LJIIIZ(r0)
            r0 = 2130774900(0x7f010b74, float:1.7152988E38)
            r1.LJFF(r0)
            r0 = 2131100622(0x7f0603ce, float:1.781363E38)
            r1.LJII(r0)
            r1.LJIIJJI()
        L48:
            java.lang.String r3 = "on"
        L4a:
            X.09Gk r2 = new X.09Gk
            r2.<init>()
            java.lang.String r1 = "enter_from"
            java.lang.String r0 = "chat"
            r2.LJIIIIZZ(r1, r0)
            java.lang.String r0 = "from_status"
            r2.LJIIIIZZ(r0, r4)
            java.lang.String r1 = "label"
            java.lang.String r0 = "im_push"
            r2.LJIIIIZZ(r1, r0)
            java.lang.String r0 = "to_status"
            r2.LJIIIIZZ(r0, r3)
            java.util.Map<java.lang.String, java.lang.String> r1 = r2.LIZ
            java.lang.String r0 = "notification_switch"
            X.C20684815ws.LJIILLIIL(r0, r1)
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L71:
            r3 = r4
            goto L4a
        L73:
            r0 = 0
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS211S0300000_2.invoke$5(kotlin.jvm.internal.AwS211S0300000_2, java.lang.Object):java.lang.Object");
    }

    public static final Object invoke$6(AwS211S0300000_2 awS211S0300000_2, Object obj) {
        Assembler assembler = (Assembler) obj;
        assembler.EQ2((SearchMediaGridAssem) awS211S0300000_2.l0, new AwS581S0100000_2((EnumC904370Zdr) awS211S0300000_2.l1, 235));
        assembler.RQ2((SearchMediaGridAssem) awS211S0300000_2.l0, new AwS581S0100000_2((IDetailMediaGridPageCellService) awS211S0300000_2.l2, 236));
        return Unit.LIZ;
    }

    public static final Object invoke$7(AwS211S0300000_2 awS211S0300000_2, Object obj) {
        ((Assembler) obj).RQ2((SlashFragment) awS211S0300000_2.l0, new AwS368S0200000_2((C13IQ) awS211S0300000_2.l1, (C13IQ<? extends UIAssem>) awS211S0300000_2.l2, (Integer) 58));
        return Unit.LIZ;
    }

    public static final Object invoke$8(AwS211S0300000_2 awS211S0300000_2, Object obj) {
        C1397620mTQ c1397620mTQ = (C1397620mTQ) obj;
        c1397620mTQ.LJFF(2131849194, new AwS368S0200000_2((Activity) awS211S0300000_2.l0, (Activity) awS211S0300000_2.l1, (Function0<Unit>) 61));
        c1397620mTQ.LJII(2131849193, new AwS581S0100000_2((Function1) awS211S0300000_2.l2, (Function1<Object, String>) 314));
        return Unit.LIZ;
    }

    public static final Object invoke$9(AwS211S0300000_2 awS211S0300000_2, Object obj) {
        String conversationId;
        BaseContact baseContact;
        View view = (View) obj;
        C869590Y9l c869590Y9l = (C869590Y9l) awS211S0300000_2.l0;
        String uid = null;
        if (c869590Y9l != null) {
            conversationId = c869590Y9l.getConversationId();
        } else {
            conversationId = null;
        }
        String str = "";
        if (conversationId == null) {
            conversationId = "";
        }
        C0ZUJ c0zuj = C0ZUJ.LIZ;
        Context context = view.getContext();
        String itemId = ((GroupSystemContent) awS211S0300000_2.l1).getItemId();
        if (itemId != null) {
            str = itemId;
        }
        List list = (List) awS211S0300000_2.l2;
        if (list != null && (baseContact = (BaseContact) ListProtector.get(list, 0)) != null) {
            uid = baseContact.getUid();
        }
        c0zuj.getClass();
        C0ZUJ.LIZ(context, str, conversationId, uid);
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS211S0300000_2(C127K c127k, Context context, int i) {
        super(1);
        this.$t = i;
        C1640706bd c1640706bd = C1640706bd.LIZ;
        this.l0 = c127k;
        this.l1 = c1640706bd;
        this.l2 = context;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS211S0300000_2(C259800zU c259800zU, C1683130ttv c1683130ttv, C05P0 c05p0, int i) {
        super(1);
        this.$t = i;
        this.l0 = c259800zU;
        this.l1 = c1683130ttv;
        this.l2 = c05p0;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS211S0300000_2(C013C c013c, C013C c013c2, C06SJ c06sj, CompletionBlock<C06SG> completionBlock) {
        super(1);
        this.$t = completionBlock;
        this.l0 = c013c;
        this.l1 = c013c2;
        this.l2 = c06sj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS211S0300000_2(InterfaceC497601wk interfaceC497601wk, InterfaceC1665500tRU interfaceC1665500tRU, C1386605bk c1386605bk, int i) {
        super(1);
        this.$t = i;
        this.l0 = interfaceC497601wk;
        this.l1 = interfaceC1665500tRU;
        this.l2 = c1386605bk;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS211S0300000_2(InterfaceC1364105Vn interfaceC1364105Vn, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn2, BusinessChatLandingMsgVM businessChatLandingMsgVM, Map<String, String> map) {
        super(1);
        this.$t = map;
        this.l0 = interfaceC1364105Vn;
        this.l1 = interfaceC1364105Vn2;
        this.l2 = businessChatLandingMsgVM;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS211S0300000_2(InterfaceC1380005ag interfaceC1380005ag, InterfaceC1692520u94 interfaceC1692520u94, C013C c013c, int i) {
        super(1);
        this.$t = i;
        this.l0 = interfaceC1380005ag;
        this.l1 = interfaceC1692520u94;
        this.l2 = c013c;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS211S0300000_2(C1395205d8 c1395205d8, InterfaceC1369205Xm interfaceC1369205Xm, AbstractC20074613ge abstractC20074613ge, int i) {
        super(1);
        this.$t = i;
        this.l0 = c1395205d8;
        this.l1 = interfaceC1369205Xm;
        this.l2 = abstractC20074613ge;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS211S0300000_2(C724920Sc6 c724920Sc6, C724920Sc6 c724920Sc62, Class<AbstractC738140SxQ> cls, C1150204ei c1150204ei) {
        super(1);
        this.$t = c1150204ei;
        this.l0 = c724920Sc6;
        this.l1 = c724920Sc62;
        this.l2 = cls;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS211S0300000_2(C869590Y9l c869590Y9l, C869590Y9l c869590Y9l2, GroupSystemContent groupSystemContent, List<? extends IMUser> list) {
        super(1);
        this.$t = list;
        this.l0 = c869590Y9l;
        this.l1 = c869590Y9l2;
        this.l2 = groupSystemContent;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS211S0300000_2(C869590Y9l c869590Y9l, SystemContent systemContent, C1672606gm c1672606gm, int i) {
        super(1);
        this.$t = i;
        this.l0 = c869590Y9l;
        this.l1 = systemContent;
        this.l2 = c1672606gm;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS211S0300000_2(C1533910q1F c1533910q1F, C1533910q1F c1533910q1F2, C1533910q1F c1533910q1F3, int i) {
        super(1);
        this.$t = i;
        this.l0 = c1533910q1F;
        this.l1 = c1533910q1F2;
        this.l2 = c1533910q1F3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS211S0300000_2(InterfaceC1690500u5o interfaceC1690500u5o, InterfaceC1690500u5o interfaceC1690500u5o2, Function1<? super Float, Unit> function1, C05P0<Float> c05p0) {
        super(1);
        this.$t = c05p0;
        this.l0 = interfaceC1690500u5o;
        this.l1 = interfaceC1690500u5o2;
        this.l2 = function1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS211S0300000_2(C19EG c19eg, C15496064w c15496064w, C1397510mTF c1397510mTF, int i) {
        super(1);
        this.$t = i;
        this.l0 = c19eg;
        this.l1 = c15496064w;
        this.l2 = c1397510mTF;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS211S0300000_2(Activity activity, InterfaceC1256904vv interfaceC1256904vv, BotDetailViewModel botDetailViewModel, int i) {
        super(1);
        this.$t = i;
        this.l0 = activity;
        this.l1 = interfaceC1256904vv;
        this.l2 = botDetailViewModel;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS211S0300000_2(Activity activity, C869590Y9l c869590Y9l, SessionInfo sessionInfo, int i) {
        super(1);
        this.$t = i;
        this.l0 = c869590Y9l;
        this.l1 = activity;
        this.l2 = sessionInfo;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS211S0300000_2(Activity activity, Activity activity2, Function0<Unit> function0, Function1<? super Boolean, Unit> function1) {
        super(1);
        this.$t = function1;
        this.l0 = activity;
        this.l1 = activity2;
        this.l2 = function0;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS211S0300000_2(Fragment fragment, Fragment fragment2, C259800zU<TuxSheet> c259800zU, Context context) {
        super(1);
        this.$t = context;
        this.l0 = fragment;
        this.l1 = fragment2;
        this.l2 = c259800zU;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS211S0300000_2(UIAssem uIAssem, GroupChatAssem groupChatAssem, ChatFeatureListConf chatFeatureListConf, int i) {
        super(1);
        this.$t = i;
        this.l0 = uIAssem;
        this.l1 = groupChatAssem;
        this.l2 = chatFeatureListConf;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS211S0300000_2(n nVar, C2191401Ape c2191401Ape, Map map, int i) {
        super(1);
        this.$t = i;
        this.l0 = map;
        this.l1 = nVar;
        this.l2 = c2191401Ape;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS211S0300000_2(InstructionEditVM instructionEditVM, View view, AwS546S0100000_2 awS546S0100000_2, int i) {
        super(1);
        this.$t = i;
        this.l0 = instructionEditVM;
        this.l1 = view;
        this.l2 = awS546S0100000_2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS211S0300000_2(BusinessChatActionBarDataConverterAssem businessChatActionBarDataConverterAssem, BusinessChatActionBarDataConverterAssem businessChatActionBarDataConverterAssem2, ActionBarButtonConfBusiness actionBarButtonConfBusiness, Map<String, String> map) {
        super(1);
        this.$t = map;
        this.l0 = businessChatActionBarDataConverterAssem;
        this.l1 = businessChatActionBarDataConverterAssem2;
        this.l2 = actionBarButtonConfBusiness;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS211S0300000_2(SessionInfo sessionInfo, Activity activity, IMUser iMUser, int i) {
        super(1);
        this.$t = i;
        this.l0 = sessionInfo;
        this.l1 = activity;
        this.l2 = iMUser;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS211S0300000_2(IMEditToolbarAssem iMEditToolbarAssem, C19719912Dl c19719912Dl, View view, int i) {
        super(1);
        this.$t = i;
        this.l0 = iMEditToolbarAssem;
        this.l1 = c19719912Dl;
        this.l2 = view;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS211S0300000_2(SearchMediaGridAssem searchMediaGridAssem, EnumC904370Zdr enumC904370Zdr, IDetailMediaGridPageCellService iDetailMediaGridPageCellService, int i) {
        super(1);
        this.$t = i;
        this.l0 = searchMediaGridAssem;
        this.l1 = enumC904370Zdr;
        this.l2 = iDetailMediaGridPageCellService;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS211S0300000_2(PoiDetailContentHeaderBaseAssemV3 poiDetailContentHeaderBaseAssemV3, PoiListApi.PoiDetailResponse poiDetailResponse, C1186970gzf c1186970gzf, int i) {
        super(1);
        this.$t = i;
        this.l0 = poiDetailContentHeaderBaseAssemV3;
        this.l1 = poiDetailResponse;
        this.l2 = c1186970gzf;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS211S0300000_2(PoiDetailHeaderAssem poiDetailHeaderAssem, PoiShopBookingInfo poiShopBookingInfo, C1186970gzf c1186970gzf, int i) {
        super(1);
        this.$t = i;
        this.l0 = poiDetailHeaderAssem;
        this.l1 = poiShopBookingInfo;
        this.l2 = c1186970gzf;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS211S0300000_2(PoiPostPageFooterAssem poiPostPageFooterAssem, C1184530gvj c1184530gvj, C1187610h0h c1187610h0h, int i) {
        super(1);
        this.$t = i;
        this.l0 = poiPostPageFooterAssem;
        this.l1 = c1184530gvj;
        this.l2 = c1187610h0h;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS211S0300000_2(SearchJediMixFeedFragment searchJediMixFeedFragment, C19EG c19eg, View view, int i) {
        super(1);
        this.$t = i;
        this.l0 = searchJediMixFeedFragment;
        this.l1 = c19eg;
        this.l2 = view;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS211S0300000_2(SlashFragment slashFragment, SlashFragment<CONTEXT> slashFragment2, C13IQ<? extends UIAssem> c13iq, Integer num) {
        super(1);
        this.$t = num;
        this.l0 = slashFragment;
        this.l1 = slashFragment2;
        this.l2 = c13iq;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS211S0300000_2(HeaderStoryHighlightsOtherCollectionComponent headerStoryHighlightsOtherCollectionComponent, StoryHighlightCollection storyHighlightCollection, Fragment fragment, int i) {
        super(1);
        this.$t = i;
        this.l0 = headerStoryHighlightsOtherCollectionComponent;
        this.l1 = storyHighlightCollection;
        this.l2 = fragment;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS211S0300000_2(Function0 function0, Function0<Unit> function02, Function1<? super Throwable, Unit> function1, Function1<Object, Unit> function12) {
        super(1);
        this.$t = function12;
        this.l0 = function0;
        this.l1 = function02;
        this.l2 = function1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS211S0300000_2(Function1 function1, Function1<? super C1378605aS, Unit> function12, C05P0<Long> c05p0, C05P0<InterfaceC1692950u9l> c05p02) {
        super(1);
        this.$t = c05p02;
        this.l0 = function1;
        this.l1 = function12;
        this.l2 = c05p0;
    }
}
