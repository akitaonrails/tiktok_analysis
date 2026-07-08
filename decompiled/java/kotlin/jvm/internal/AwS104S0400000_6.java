package kotlin.jvm.internal;

import X.C09AY;
import X.C0F4L;
import X.C0F4M;
import X.C0FNV;
import X.C0H6Q;
import X.C0HOM;
import X.C0HV6;
import X.C0HYN;
import X.C0IA0;
import X.C0IA1;
import X.C0IA2;
import X.C0IA3;
import X.C0ID9;
import X.C0IE1;
import X.C0SZ4;
import X.C10EU;
import X.C1163440gNi;
import X.C127K;
import X.C1292030jj7;
import X.C1294720jnS;
import X.C1295950jpR;
import X.C1331660kl2;
import X.C1331670kl3;
import X.C1372405Ys;
import X.C1372505Yt;
import X.C1389890mGx;
import X.C13LE;
import X.C13LP;
import X.C1440005kM;
import X.C1634506ad;
import X.C1858110yS9;
import X.C189200o6;
import X.C1954807lC;
import X.C19EG;
import X.C19ME;
import X.C20248814Kw;
import X.C2188811AlT;
import X.C2252321DDq;
import X.C2277121EBa;
import X.C23260099m;
import X.C259800zU;
import X.C298860BnY;
import X.C339190DRl;
import X.C342950DcT;
import X.C342990DcX;
import X.C384050F3z;
import X.C418440Gaw;
import X.C426750GoL;
import X.C440440HOw;
import X.C441150HRp;
import X.C458790Hyv;
import X.C462040I9y;
import X.C682190QpN;
import X.C724240Sb0;
import X.C786410Ut5;
import X.C814420VxA;
import X.C960203pA;
import X.DialogC1389620mGW;
import X.EnumC1489905sP;
import X.EnumC2007507th;
import X.EnumC342940DcS;
import X.EnumC462000I9u;
import X.InterfaceC1364105Vn;
import X.InterfaceC1632206aG;
import X.InterfaceC332260D0u;
import X.InterfaceC440230HOb;
import X.InterfaceC441960HUs;
import X.InterfaceC665370Q7z;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.fragment.app.Fragment;
import com.bytedance.assem.arch.core.UIAssem;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.IMVoiceMessageUtil;
import com.ss.android.ugc.aweme.comment.model.Comment;
import com.ss.android.ugc.aweme.friendstab.ui.feed.panel.viewmodel.FriendsV3PublishStatusViewModel;
import com.ss.android.ugc.aweme.im.chatroom.api.model.SessionInfo;
import com.ss.android.ugc.aweme.im.chatroom.input.components.inputfield.IInputFieldAbility;
import com.ss.android.ugc.aweme.im.saas.host.api.im.IMImageStudioApi;
import com.ss.android.ugc.aweme.search.pages.result.common.searchvideo.core.assem.SearchVideoCommentAssem;
import com.ss.android.ugc.aweme.search.pages.result.nimble.model.fusioncard.AnimationConfig;
import com.ss.android.ugc.aweme.socialavatar.mixstudio.homepage.MixStudioHomePageAssem;
import com.ss.android.ugc.aweme.socialavatar.mixstudio.iddropdown.IdPowerCell;
import com.ss.android.ugc.aweme.socialavatar.saas.mixstudio.MixStudioEntranceControl;
import com.ss.android.ugc.aweme.socialavatar.saas.mixstudio.MixStudioSettings;
import com.ss.android.ugc.aweme.socialgame.api.model.EmojiGameInfo;
import com.ss.android.ugc.aweme.socialgame.api.service.ISocialGameService;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.ss.android.ugc.aweme.tako.ccl.model.api.TakoBotInfo;
import com.ss.android.ugc.aweme.template.TemplateAnchorConfig;
import com.ss.android.ugc.aweme.template.TemplateDetailFragment;
import com.ss.android.ugc.aweme.template.assem.TemplateBannerAssem;
import com.ss.android.ugc.aweme.template.datamodel.TemplateBannerModel;
import com.ss.android.ugc.aweme.template.datamodel.TemplateDetailModel;
import com.ss.android.ugc.aweme.template.datamodel.TemplatePugcCreatorStatisticModel;
import com.ss.android.ugc.aweme.template.datamodel.TemplateStructModel;
import com.tts.oecverify.BdTuring;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
public class AwS104S0400000_6 extends C09AY implements Function1 {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;
    public Object l3;

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
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS104S0400000_6 awS104S0400000_6, Object obj) {
        C0IA2 c0ia0;
        int i = C0IA1.LIZ[((EnumC462000I9u) awS104S0400000_6.l0).ordinal()];
        if (i != 1 && i != 2) {
            if (i != 3 && i != 4) {
                throw new C1954807lC();
            }
            FriendsV3PublishStatusViewModel friendsV3PublishStatusViewModel = (FriendsV3PublishStatusViewModel) awS104S0400000_6.l1;
            List list = (List) awS104S0400000_6.l2;
            C0IA3 c0ia3 = (C0IA3) awS104S0400000_6.l3;
            friendsV3PublishStatusViewModel.getClass();
            List listWQ2 = FriendsV3PublishStatusViewModel.wQ2(3, c0ia3, list);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("triggerUpdateOpt->RemoveWithAnimation, displayTaskList=");
            sbLIZ.append(C13LP.LJJLIIIJ(listWQ2, null, null, null, 0, null, AFwS236S0000000_6.get$arr$(67), 31));
            C2188811AlT.LIZIZ(sbLIZ);
            c0ia0 = new C462040I9y((C0IA3) C13LP.LJJJLZIJ(0, listWQ2), (C0IA3) C13LP.LJJJLZIJ(1, listWQ2), (C0IA3) C13LP.LJJJLZIJ(2, listWQ2));
        } else {
            FriendsV3PublishStatusViewModel friendsV3PublishStatusViewModel2 = (FriendsV3PublishStatusViewModel) awS104S0400000_6.l1;
            List list2 = (List) awS104S0400000_6.l2;
            friendsV3PublishStatusViewModel2.getClass();
            List listWQ22 = FriendsV3PublishStatusViewModel.wQ2(2, null, list2);
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("triggerUpdateOpt->StackDirectly, displayTaskList=");
            sbLIZ2.append(C13LP.LJJLIIIJ(listWQ22, null, null, null, 0, null, AFwS236S0000000_6.get$arr$(66), 31));
            C2188811AlT.LIZIZ(sbLIZ2);
            c0ia0 = new C0IA0((C0IA3) C13LP.LJJJLZIJ(0, listWQ22), (C0IA3) C13LP.LJJJLZIJ(1, listWQ22));
        }
        ((FriendsV3PublishStatusViewModel) awS104S0400000_6.l1).setState(new AwS585S0100000_6(c0ia0, 60));
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS104S0400000_6 awS104S0400000_6, Object obj) {
        C20248814Kw c20248814Kw = (C20248814Kw) obj;
        c20248814Kw.LIZ = new AwS547S0100000_3((Comment) awS104S0400000_6.l0, 50);
        c20248814Kw.LIZIZ(new AwS284S0300000_6((SearchVideoCommentAssem) awS104S0400000_6.l1, (SearchVideoCommentAssem) awS104S0400000_6.l2, (TuxTextView) awS104S0400000_6.l3, (C259800zU<String>) 2));
        return Unit.LIZ;
    }

    public static final Object invoke$10(AwS104S0400000_6 awS104S0400000_6, Object obj) {
        View view = (View) obj;
        if (((C0HV6) awS104S0400000_6.l0).LIZ()) {
            Function1 function1 = (Function1) awS104S0400000_6.l1;
            if (function1 != null) {
                function1.invoke(view);
            }
            if (((C0HV6) awS104S0400000_6.l0).LJIIJJI(view)) {
                IMVoiceMessageUtil iMVoiceMessageUtil = IMVoiceMessageUtil.LIZ;
                Context context = view.getContext();
                AwS135S0400000_6 awS135S0400000_6 = new AwS135S0400000_6((C0HV6) awS104S0400000_6.l0, (C0HV6) view, (View) awS104S0400000_6.l2, (UIAssem) awS104S0400000_6.l3, (Function1<? super View, Unit>) 10);
                iMVoiceMessageUtil.getClass();
                IMVoiceMessageUtil.LJIIIIZZ(context, awS135S0400000_6);
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$11(AwS104S0400000_6 awS104S0400000_6, Object obj) {
        View view = (View) obj;
        Function1 function1 = (Function1) awS104S0400000_6.l0;
        if (function1 != null) {
            function1.invoke(view);
        }
        if (((C0HV6) awS104S0400000_6.l1).LJIIJJI(view)) {
            IMVoiceMessageUtil iMVoiceMessageUtil = IMVoiceMessageUtil.LIZ;
            Context context = view.getContext();
            AwS135S0400000_6 awS135S0400000_6 = new AwS135S0400000_6((C0HV6) awS104S0400000_6.l1, (C0HV6) view, (View) awS104S0400000_6.l2, (UIAssem) awS104S0400000_6.l3, (Function1<? super View, Unit>) 11);
            iMVoiceMessageUtil.getClass();
            IMVoiceMessageUtil.LJIIIIZZ(context, awS135S0400000_6);
        }
        return Boolean.TRUE;
    }

    public static final Object invoke$12(AwS104S0400000_6 awS104S0400000_6, Object obj) {
        if (C298860BnY.LIZ()) {
            C1858110yS9.LIZ((TakoBotInfo) awS104S0400000_6.l0, (Context) awS104S0400000_6.l1, (InterfaceC665370Q7z) awS104S0400000_6.l2, (View) awS104S0400000_6.l3);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$13(AwS104S0400000_6 awS104S0400000_6, Object obj) {
        boolean z;
        if (((Number) obj).intValue() == 3) {
            C682190QpN c682190QpN = C682190QpN.LIZ;
            Fragment fragment = (Fragment) awS104S0400000_6.l0;
            C19EG c19eg = (C19EG) awS104S0400000_6.l1;
            Fragment fragment2 = (Fragment) awS104S0400000_6.l2;
            AnimationConfig animationConfig = (AnimationConfig) awS104S0400000_6.l3;
            c682190QpN.getClass();
            C682190QpN.LIZJ(fragment, c19eg, fragment2, animationConfig);
            C682190QpN.LIZ((Fragment) awS104S0400000_6.l0, (C19EG) awS104S0400000_6.l1);
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    public static final Object invoke$14(AwS104S0400000_6 awS104S0400000_6, Object obj) {
        int width;
        View view;
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) obj;
        int[] iArr = new int[2];
        ((View) awS104S0400000_6.l0).getLocationOnScreen(iArr);
        if (C426750GoL.LJ((FrameLayout) awS104S0400000_6.l1)) {
            width = (((FrameLayout) awS104S0400000_6.l1).getWidth() - ((View) awS104S0400000_6.l0).getWidth()) - iArr[0];
        } else {
            width = iArr[0];
        }
        marginLayoutParams.setMarginStart(width);
        marginLayoutParams.topMargin = iArr[1];
        if (((EnumC2007507th) awS104S0400000_6.l2) == EnumC2007507th.BOTTOM_ACTION_BAR && ((FrameLayout) awS104S0400000_6.l1).getWidth() - marginLayoutParams.getMarginStart() > ((View) awS104S0400000_6.l0).getWidth() / 2 && (view = (View) awS104S0400000_6.l3) != null) {
            C339190DRl.LIZLLL(view);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$15(AwS104S0400000_6 awS104S0400000_6, Object obj) {
        Function2 function2 = (Function2) awS104S0400000_6.l0;
        if (function2 != null) {
            function2.invoke(obj, Boolean.valueOf(!(((InterfaceC441960HUs) awS104S0400000_6.l1).getPanelType().getValue() instanceof InterfaceC1632206aG)));
        }
        C0HYN.LIZIZ((InterfaceC441960HUs) awS104S0400000_6.l1, (IInputFieldAbility) awS104S0400000_6.l2, (InterfaceC1632206aG) awS104S0400000_6.l3);
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS104S0400000_6 awS104S0400000_6, Object obj) {
        String string;
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        C0FNV.LIZ((DialogC1389620mGW) awS104S0400000_6.l0);
        if (zBooleanValue) {
            ((InterfaceC440230HOb) awS104S0400000_6.l1).LJFF((Context) awS104S0400000_6.l2, true);
        } else {
            if (C2277121EBa.LIZ()) {
                string = ((Context) awS104S0400000_6.l2).getString(2131838912, Integer.valueOf(C2277121EBa.LIZIZ()));
            } else {
                string = ((Context) awS104S0400000_6.l2).getString(2131827074);
            }
            Fragment fragmentLJI = C724240Sb0.LJI((MixStudioHomePageAssem) awS104S0400000_6.l3);
            if (fragmentLJI != null) {
                C1389890mGx c1389890mGx = new C1389890mGx(fragmentLJI);
                c1389890mGx.LJIIJ(string);
                c1389890mGx.LJIIJJI();
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$3(AwS104S0400000_6 awS104S0400000_6, Object obj) {
        C0IE1 c0ie1;
        InterfaceC1364105Vn interfaceC1364105Vn = (InterfaceC1364105Vn) awS104S0400000_6.l0;
        C1295950jpR c1295950jpR = new C1295950jpR();
        c1295950jpR.LJIILL((C1294720jnS) obj);
        c1295950jpR.LJJIIJ(-1);
        c1295950jpR.LJIIJJI();
        C189200o6.m2constructorimpl(c1295950jpR);
        interfaceC1364105Vn.resumeWith(c1295950jpR);
        C1292030jj7 c1292030jj7 = (C1292030jj7) awS104S0400000_6.l1;
        Function1 function1 = (Function1) ((C259800zU) awS104S0400000_6.l2).element;
        C0IE1 c0ie12 = null;
        if (function1 != null) {
            c0ie1 = new C0IE1(function1, 0);
        } else {
            c0ie1 = null;
        }
        c1292030jj7.LJII(c0ie1);
        C1292030jj7 c1292030jj72 = (C1292030jj7) awS104S0400000_6.l1;
        Function1 function12 = (Function1) ((C259800zU) awS104S0400000_6.l3).element;
        if (function12 != null) {
            c0ie12 = new C0IE1(function12, 0);
        }
        c1292030jj72.LJI(c0ie12);
        return Unit.LIZ;
    }

    public static final Object invoke$4(AwS104S0400000_6 awS104S0400000_6, Object obj) {
        InterfaceC1364105Vn interfaceC1364105Vn = (InterfaceC1364105Vn) awS104S0400000_6.l0;
        C0IE1 c0ie1 = null;
        C189200o6.m2constructorimpl(null);
        interfaceC1364105Vn.resumeWith(null);
        ((C1292030jj7) awS104S0400000_6.l1).LJII(new C0IE1((Function1) ((C259800zU) awS104S0400000_6.l2).element, 0));
        C1292030jj7 c1292030jj7 = (C1292030jj7) awS104S0400000_6.l1;
        Function1 function1 = (Function1) ((C259800zU) awS104S0400000_6.l3).element;
        if (function1 != null) {
            c0ie1 = new C0IE1(function1, 0);
        }
        c1292030jj7.LJI(c0ie1);
        return Unit.LIZ;
    }

    public static final Object invoke$5(AwS104S0400000_6 awS104S0400000_6, Object obj) {
        String awemeId;
        String authorId;
        String templateId;
        C0SZ4 c0sz4 = (C0SZ4) obj;
        c0sz4.LL = C13LE.LIZ(TemplateBannerAssem.class);
        c0sz4.LLJIJIL = C1163440gNi.LIZJ;
        TemplatePugcCreatorStatisticModel templatePugcCreatorStatisticModel = (TemplatePugcCreatorStatisticModel) awS104S0400000_6.l0;
        if (templatePugcCreatorStatisticModel != null) {
            c0sz4.LJ(templatePugcCreatorStatisticModel, "pugc_creator_statistic");
        }
        TemplateBannerModel templateBannerModel = (TemplateBannerModel) awS104S0400000_6.l1;
        if (templateBannerModel != null) {
            c0sz4.LJ(templateBannerModel, "banner_info");
        }
        TemplateAnchorConfig templateAnchorConfig = ((TemplateDetailFragment) awS104S0400000_6.l2).LLJI;
        String str = "";
        if (templateAnchorConfig == null || (awemeId = templateAnchorConfig.getAwemeId()) == null) {
            awemeId = "";
        }
        c0sz4.LJ(awemeId, "group_id");
        TemplateStructModel templateInfo = ((TemplateDetailModel) awS104S0400000_6.l3).getTemplateInfo();
        if (templateInfo == null || (authorId = templateInfo.getAuthorId()) == null) {
            authorId = "";
        }
        c0sz4.LJ(authorId, "author_id");
        c0sz4.LJ("anchor_detail", "enter_from");
        TemplateStructModel templateInfo2 = ((TemplateDetailModel) awS104S0400000_6.l3).getTemplateInfo();
        if (templateInfo2 != null && (templateId = templateInfo2.getTemplateId()) != null) {
            str = templateId;
        }
        c0sz4.LJ(str, "template_id");
        return Unit.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$6(AwS104S0400000_6 awS104S0400000_6, Object obj) {
        String strUseFriendsIdEmptyPreviewPlaceholderLight;
        Drawable c0f4m;
        Drawable c0f4m2;
        ViewGroup viewGroup = (ViewGroup) obj;
        viewGroup.setPaddingRelative(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(0)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(0)), viewGroup.getPaddingEnd(), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(0)));
        viewGroup.setClipChildren(false);
        viewGroup.setClipToPadding(false);
        SmartImageView smartImageView = new SmartImageView((Context) awS104S0400000_6.l0);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(44)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(44)));
        layoutParams.gravity = 48;
        layoutParams.setMarginStart(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4)));
        layoutParams.topMargin = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4));
        C786410Ut5.td(smartImageView, C418440Gaw.LIZIZ(4));
        C786410Ut5.Eb(smartImageView, -9.0f);
        C786410Ut5.G6(smartImageView, layoutParams);
        MixStudioHomePageAssem mixStudioHomePageAssem = (MixStudioHomePageAssem) awS104S0400000_6.l1;
        Context context = (Context) awS104S0400000_6.l0;
        C0HOM c0hom = (C0HOM) awS104S0400000_6.l2;
        C440440HOw c440440HOw = (C440440HOw) awS104S0400000_6.l3;
        mixStudioHomePageAssem.getClass();
        if (C10EU.LJIIZILJ(c440440HOw.LIZJ) && (c0hom instanceof C1372505Yt)) {
            if (C960203pA.LIZIZ(context)) {
                c0f4m2 = new C0F4L();
            } else {
                c0f4m2 = new C0F4M();
            }
            if (C960203pA.LIZIZ(context)) {
                C1331670kl3 c1331670kl3LJIIIZ = C1331660kl2.LJIIIZ(MixStudioSettings.INSTANCE.useFriendsIdCreateYoursPlaceholderDark());
                c1331670kl3LJIIIZ.LJJIIZI(c0f4m2);
                c1331670kl3LJIIIZ.LJJ(smartImageView);
                C786410Ut5.h3(c1331670kl3LJIIIZ);
                return smartImageView;
            }
            C1331670kl3 c1331670kl3LJIIIZ2 = C1331660kl2.LJIIIZ(MixStudioSettings.INSTANCE.useFriendsIdCreateYoursPlaceholderLight());
            c1331670kl3LJIIIZ2.LJJIIZI(c0f4m2);
            c1331670kl3LJIIIZ2.LJJ(smartImageView);
            C786410Ut5.h3(c1331670kl3LJIIIZ2);
            return smartImageView;
        }
        if (C960203pA.LIZIZ(context)) {
            strUseFriendsIdEmptyPreviewPlaceholderLight = MixStudioSettings.INSTANCE.useFriendsIdEmptyPreviewPlaceholderDark();
        } else {
            strUseFriendsIdEmptyPreviewPlaceholderLight = MixStudioSettings.INSTANCE.useFriendsIdEmptyPreviewPlaceholderLight();
        }
        if (C960203pA.LIZIZ(context)) {
            c0f4m = new C0F4L();
        } else {
            c0f4m = new C0F4M();
        }
        if (c440440HOw.LIZ.length() == 0) {
            C1331670kl3 c1331670kl3LJIIIZ3 = C1331660kl2.LJIIIZ(strUseFriendsIdEmptyPreviewPlaceholderLight);
            c1331670kl3LJIIIZ3.LJJIIZI(c0f4m);
            c1331670kl3LJIIIZ3.LJJ(smartImageView);
            C786410Ut5.h3(c1331670kl3LJIIIZ3);
            return smartImageView;
        }
        C1331670kl3 c1331670kl3LJIIIZ4 = C1331660kl2.LJIIIZ(c440440HOw.LIZ);
        c1331670kl3LJIIIZ4.LJJIIZI(c0f4m);
        c1331670kl3LJIIIZ4.LJJ(smartImageView);
        C786410Ut5.h3(c1331670kl3LJIIIZ4);
        return smartImageView;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* bridge */ /* synthetic */ Object invoke$7(AwS104S0400000_6 awS104S0400000_6, Object obj) {
        String strUseFriendsIdEmptyPreviewPlaceholderLight;
        Drawable c0f4m;
        C1372405Ys c1372405Ys;
        C440440HOw c440440HOw;
        String str;
        Drawable c0f4m2;
        ImageView imageView = (ImageView) obj;
        if (C0H6Q.LIZ()) {
            imageView.setOutlineProvider(new C0ID9(18));
            imageView.setClipToOutline(true);
            C384050F3z c384050F3z = new C384050F3z();
            c384050F3z.LIZIZ = Integer.valueOf(R.attr.a1g);
            imageView.setBackground(c384050F3z.LIZ(((C127K) awS104S0400000_6.l0).getContext()));
            C19ME c19me = new C19ME(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(44)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(44)));
            c19me.setMarginStart(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4)));
            C786410Ut5.c6(imageView, c19me);
        } else {
            C786410Ut5.Cb(imageView, -9.0f);
            C786410Ut5.gd(imageView, C418440Gaw.LIZIZ(4));
            C19ME c19me2 = new C19ME(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(44)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(44)));
            c19me2.setMarginStart(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4)));
            ((ViewGroup.MarginLayoutParams) c19me2).topMargin = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4));
            C786410Ut5.c6(imageView, c19me2);
        }
        IdPowerCell idPowerCell = (IdPowerCell) awS104S0400000_6.l1;
        Context context = ((C127K) awS104S0400000_6.l0).getContext();
        C0HOM c0hom = (C0HOM) awS104S0400000_6.l2;
        String str2 = ((C441150HRp) awS104S0400000_6.l3).LLILLJJLI;
        idPowerCell.getClass();
        if (C10EU.LJIIZILJ(str2) && (c0hom instanceof C1372505Yt)) {
            if (C960203pA.LIZIZ(context)) {
                c0f4m2 = new C0F4L();
            } else {
                c0f4m2 = new C0F4M();
            }
            if (C960203pA.LIZIZ(context)) {
                C1331670kl3 c1331670kl3LJIIIZ = C1331660kl2.LJIIIZ(MixStudioSettings.INSTANCE.useFriendsIdCreateYoursPlaceholderDark());
                c1331670kl3LJIIIZ.LJJIIZI(c0f4m2);
                c1331670kl3LJIIIZ.LJJI(imageView);
                C786410Ut5.h3(c1331670kl3LJIIIZ);
            } else {
                C1331670kl3 c1331670kl3LJIIIZ2 = C1331660kl2.LJIIIZ(MixStudioSettings.INSTANCE.useFriendsIdCreateYoursPlaceholderLight());
                c1331670kl3LJIIIZ2.LJJIIZI(c0f4m2);
                c1331670kl3LJIIIZ2.LJJI(imageView);
                C786410Ut5.h3(c1331670kl3LJIIIZ2);
            }
        } else {
            if (C960203pA.LIZIZ(context)) {
                strUseFriendsIdEmptyPreviewPlaceholderLight = MixStudioSettings.INSTANCE.useFriendsIdEmptyPreviewPlaceholderDark();
            } else {
                strUseFriendsIdEmptyPreviewPlaceholderLight = MixStudioSettings.INSTANCE.useFriendsIdEmptyPreviewPlaceholderLight();
            }
            if (C960203pA.LIZIZ(context)) {
                c0f4m = new C0F4L();
            } else {
                c0f4m = new C0F4M();
            }
            if ((c0hom instanceof C1372405Ys) && (c1372405Ys = (C1372405Ys) c0hom) != null && (c440440HOw = (C440440HOw) c1372405Ys.LIZIZ) != null && (str = c440440HOw.LIZ) != null && str.length() != 0) {
                C1331670kl3 c1331670kl3LJIIIZ3 = C1331660kl2.LJIIIZ(str);
                c1331670kl3LJIIIZ3.LJJIIZI(c0f4m);
                c1331670kl3LJIIIZ3.LJJI(imageView);
                C786410Ut5.h3(c1331670kl3LJIIIZ3);
            } else {
                C1331670kl3 c1331670kl3LJIIIZ4 = C1331660kl2.LJIIIZ(strUseFriendsIdEmptyPreviewPlaceholderLight);
                c1331670kl3LJIIIZ4.LJJIIZI(c0f4m);
                c1331670kl3LJIIIZ4.LJJI(imageView);
                C786410Ut5.h3(c1331670kl3LJIIIZ4);
            }
        }
        return Unit.LIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$8(kotlin.jvm.internal.AwS104S0400000_6 r3, java.lang.Object r4) {
        /*
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r0 = r4.booleanValue()
            if (r0 == 0) goto L29
            java.lang.Object r2 = r3.l0
            com.ss.android.ugc.aweme.socialgame.api.service.ISocialGameService r2 = (com.ss.android.ugc.aweme.socialgame.api.service.ISocialGameService) r2
            java.lang.Object r1 = r3.l1
            com.ss.android.ugc.aweme.socialgame.api.model.EmojiGameInfo r1 = (com.ss.android.ugc.aweme.socialgame.api.model.EmojiGameInfo) r1
            java.lang.Object r0 = r3.l2
            com.ss.android.ugc.aweme.im.chatroom.api.model.SessionInfo r0 = (com.ss.android.ugc.aweme.im.chatroom.api.model.SessionInfo) r0
            boolean r0 = r2.LJFF(r0, r1)
            if (r0 == 0) goto L29
            r0 = 1
        L1b:
            java.lang.Object r1 = r3.l3
            kotlin.jvm.functions.Function1 r1 = (kotlin.jvm.functions.Function1) r1
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r1.invoke(r0)
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L29:
            r0 = 0
            goto L1b
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS104S0400000_6.invoke$8(kotlin.jvm.internal.AwS104S0400000_6, java.lang.Object):java.lang.Object");
    }

    public static final Object invoke$9(AwS104S0400000_6 awS104S0400000_6, Object obj) {
        if (!(((InterfaceC441960HUs) awS104S0400000_6.l0).getPanelType().getValue() instanceof InterfaceC1632206aG)) {
            C1440005kM.LIZ(new C1634506ad(false, true, 1));
            if (((C342950DcT) ((InterfaceC332260D0u) awS104S0400000_6.l1).getValue()).LIZIZ == EnumC342940DcS.LOADING) {
                IMImageStudioApi.LIZ.getClass();
                IMImageStudioApi iMImageStudioApiLIZ = C342990DcX.LIZ();
                if (iMImageStudioApiLIZ != null) {
                    iMImageStudioApiLIZ.LIZ(EnumC1489905sP.STICKER_GENERATING, "click");
                }
            } else if (((C342950DcT) ((InterfaceC332260D0u) awS104S0400000_6.l1).getValue()).LIZIZ == EnumC342940DcS.COMPLETED) {
                IMImageStudioApi.LIZ.getClass();
                IMImageStudioApi iMImageStudioApiLIZ2 = C342990DcX.LIZ();
                if (iMImageStudioApiLIZ2 != null) {
                    iMImageStudioApiLIZ2.LIZ(EnumC1489905sP.STICKER_COMPLETE, "click");
                }
                MixStudioEntranceControl mixStudioEntranceControl = (MixStudioEntranceControl) awS104S0400000_6.l2;
                if (mixStudioEntranceControl != null) {
                    mixStudioEntranceControl.LJ();
                }
            } else {
                IMImageStudioApi.LIZ.getClass();
                IMImageStudioApi iMImageStudioApiLIZ3 = C342990DcX.LIZ();
                if (iMImageStudioApiLIZ3 != null) {
                    iMImageStudioApiLIZ3.LIZ(EnumC1489905sP.STICKER_FAIL, "click");
                }
                MixStudioEntranceControl mixStudioEntranceControl2 = (MixStudioEntranceControl) awS104S0400000_6.l2;
                if (mixStudioEntranceControl2 != null) {
                    mixStudioEntranceControl2.LJ();
                }
            }
        }
        C0HYN.LIZIZ((InterfaceC441960HUs) awS104S0400000_6.l0, (IInputFieldAbility) awS104S0400000_6.l3, C458790Hyv.LL);
        return Unit.LIZ;
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public AwS104S0400000_6(com.ss.android.ugc.aweme.im.assem.IMInputAssem r3, X.C0HV6 r4, kotlin.jvm.functions.Function1 r5, kotlin.jvm.functions.Function1 r6, int r7) {
        /*
            r2 = this;
            r2.$t = r7
            int r7 = 10 - r7
            if (r7 == 0) goto L14
            r1 = r2
            r1.l0 = r5
            r1.l1 = r4
            r1.l2 = r3
            r1.l3 = r6
            r0 = 1
        L10:
            r1.<init>(r0)
            return
        L14:
            r1 = r2
            r1.l0 = r4
            r1.l1 = r5
            r1.l2 = r3
            r1.l3 = r6
            r0 = 1
            goto L10
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS104S0400000_6.<init>(com.ss.android.ugc.aweme.im.assem.IMInputAssem, X.0HV6, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, int):void");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS104S0400000_6(C23260099m c23260099m, C1292030jj7 c1292030jj7, C259800zU c259800zU, C259800zU c259800zU2, int i) {
        super(1);
        this.$t = i;
        this.l0 = c23260099m;
        this.l1 = c1292030jj7;
        this.l2 = c259800zU;
        this.l3 = c259800zU2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS104S0400000_6(InterfaceC441960HUs interfaceC441960HUs, C2252321DDq c2252321DDq, MixStudioEntranceControl mixStudioEntranceControl, IInputFieldAbility iInputFieldAbility, int i) {
        super(1);
        this.$t = i;
        this.l0 = interfaceC441960HUs;
        this.l1 = c2252321DDq;
        this.l2 = mixStudioEntranceControl;
        this.l3 = iInputFieldAbility;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS104S0400000_6(EnumC462000I9u enumC462000I9u, EnumC462000I9u enumC462000I9u2, FriendsV3PublishStatusViewModel friendsV3PublishStatusViewModel, List<? extends C0IA3> list, C0IA3 c0ia3) {
        super(1);
        this.$t = c0ia3;
        this.l0 = enumC462000I9u;
        this.l1 = enumC462000I9u2;
        this.l2 = friendsV3PublishStatusViewModel;
        this.l3 = list;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS104S0400000_6(DialogC1389620mGW dialogC1389620mGW, DialogC1389620mGW dialogC1389620mGW2, InterfaceC440230HOb<? extends List<C440440HOw>> interfaceC440230HOb, Context context, MixStudioHomePageAssem mixStudioHomePageAssem) {
        super(1);
        this.$t = mixStudioHomePageAssem;
        this.l0 = dialogC1389620mGW;
        this.l1 = dialogC1389620mGW2;
        this.l2 = interfaceC440230HOb;
        this.l3 = context;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS104S0400000_6(C127K c127k, C127K c127k2, IdPowerCell idPowerCell, C0HOM<? extends C440440HOw> c0hom, C441150HRp c441150HRp) {
        super(1);
        this.$t = c441150HRp;
        this.l0 = c127k;
        this.l1 = c127k2;
        this.l2 = idPowerCell;
        this.l3 = c0hom;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS104S0400000_6(Context context, Context context2, MixStudioHomePageAssem mixStudioHomePageAssem, C0HOM<? extends List<C440440HOw>> c0hom, C440440HOw c440440HOw) {
        super(1);
        this.$t = c440440HOw;
        this.l0 = context;
        this.l1 = context2;
        this.l2 = mixStudioHomePageAssem;
        this.l3 = c0hom;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS104S0400000_6(View view, FrameLayout frameLayout, EnumC2007507th enumC2007507th, View view2, int i) {
        super(1);
        this.$t = i;
        this.l0 = view;
        this.l1 = frameLayout;
        this.l2 = enumC2007507th;
        this.l3 = view2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS104S0400000_6(Fragment fragment, C19EG c19eg, Fragment fragment2, AnimationConfig animationConfig, int i) {
        super(1);
        this.$t = i;
        this.l0 = fragment;
        this.l1 = c19eg;
        this.l2 = fragment2;
        this.l3 = animationConfig;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS104S0400000_6(Comment comment, Comment comment2, SearchVideoCommentAssem searchVideoCommentAssem, TuxTextView tuxTextView, C259800zU<String> c259800zU) {
        super(1);
        this.$t = c259800zU;
        this.l0 = comment;
        this.l1 = comment2;
        this.l2 = searchVideoCommentAssem;
        this.l3 = tuxTextView;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS104S0400000_6(ISocialGameService iSocialGameService, EmojiGameInfo emojiGameInfo, SessionInfo sessionInfo, AwS215S0300000_6 awS215S0300000_6, int i) {
        super(1);
        this.$t = i;
        this.l0 = iSocialGameService;
        this.l1 = emojiGameInfo;
        this.l2 = sessionInfo;
        this.l3 = awS215S0300000_6;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS104S0400000_6(TakoBotInfo takoBotInfo, Context context, InterfaceC665370Q7z interfaceC665370Q7z, View view, int i) {
        super(1);
        this.$t = i;
        this.l0 = takoBotInfo;
        this.l1 = context;
        this.l2 = interfaceC665370Q7z;
        this.l3 = view;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS104S0400000_6(TemplatePugcCreatorStatisticModel templatePugcCreatorStatisticModel, TemplateBannerModel templateBannerModel, TemplateDetailFragment templateDetailFragment, TemplateDetailModel templateDetailModel, int i) {
        super(1);
        this.$t = i;
        this.l0 = templatePugcCreatorStatisticModel;
        this.l1 = templateBannerModel;
        this.l2 = templateDetailFragment;
        this.l3 = templateDetailModel;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS104S0400000_6(Function2 function2, Function2<? super View, ? super Boolean, Unit> function22, InterfaceC441960HUs interfaceC441960HUs, IInputFieldAbility iInputFieldAbility, InterfaceC1632206aG interfaceC1632206aG) {
        super(1);
        this.$t = interfaceC1632206aG;
        this.l0 = function2;
        this.l1 = function22;
        this.l2 = interfaceC441960HUs;
        this.l3 = iInputFieldAbility;
    }
}
