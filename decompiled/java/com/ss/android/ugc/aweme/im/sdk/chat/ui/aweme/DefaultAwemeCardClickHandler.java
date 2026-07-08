package com.ss.android.ugc.aweme.im.sdk.chat.ui.aweme;

import X.C019F;
import X.C01D1;
import X.C069P;
import X.C09R3;
import X.C0I0B;
import X.C0QSJ;
import X.C0XF1;
import X.C0Z92;
import X.C0ZDX;
import X.C0ZH2;
import X.C0ZH3;
import X.C0ZU4;
import X.C1389890mGx;
import X.C13IQ;
import X.C13LE;
import X.C1558360qeg;
import X.C1622206Wu;
import X.C1705506m5;
import X.C1711706n5;
import X.C1720706oX;
import X.C19719912Dl;
import X.C2201941BFw;
import X.C2217381BqS;
import X.C327340CsO;
import X.C338490DOt;
import X.C451460Hn6;
import X.C451620HnM;
import X.C451650HnP;
import X.C452070Ho5;
import X.C5182020e;
import X.C687700QyG;
import X.C724750Sbp;
import X.C869590Y9l;
import X.C879350Yeb;
import X.C987103tV;
import X.EnumC896390ZEn;
import X.EnumC899970ZSh;
import X.InterfaceC1808360x9u;
import X.InterfaceC2217461Bqa;
import X.InterfaceC451590HnJ;
import X.InterfaceC724760Sbq;
import android.text.TextUtils;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.bytedance.android.btm.api.BtmSDK;
import com.bytedance.android.btm.api.model.PageFinder;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeBizExtKt;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.im.chatroom.api.IIMChatAnalytics;
import com.ss.android.ugc.aweme.im.chatroom.api.model.SessionInfo;
import com.ss.android.ugc.aweme.im.common.scope.ChatRoomScope;
import com.ss.android.ugc.aweme.im.contacts.api.IMContactApi;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUser;
import com.ss.android.ugc.aweme.im.message.template.card.AwemeCardTemplate;
import com.ss.android.ugc.aweme.im.message.template.component.HighlightStoryComponent;
import com.ss.android.ugc.aweme.im.messagelist.api.IIMMessageAdapterAnalytics;
import com.ss.android.ugc.aweme.im.messagelist.api.ability.MessageListAwemeCardClickAbility;
import com.ss.android.ugc.aweme.im.messagelist.api.ability.MessagePowerListAbility;
import com.ss.android.ugc.aweme.im.service.aweme.IAwemeOpenHelper;
import com.ss.android.ugc.aweme.photocommentsticker.IPhotoCommentStickerViewModel;
import com.ss.android.ugc.aweme.profile.util.IUserProfilePreload;
import com.ss.android.ugc.aweme.views.RoundingCornerLayoutCL;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.AFwS248S0000000_14;
import kotlin.jvm.internal.AwS558S0100000_14;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes15.dex */
public final class DefaultAwemeCardClickHandler implements MessageListAwemeCardClickAbility {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLILZIL;
    public final SessionInfo LL;
    public final Fragment LLILLJJLI;
    public final AssemVMLazy LLILLL;
    public volatile InterfaceC1808360x9u LLILZ;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(DefaultAwemeCardClickHandler.class, "photoCommentStickerRepository", "getPhotoCommentStickerRepository()Lcom/ss/android/ugc/aweme/photocommentsticker/IPhotoCommentStickerRepository;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(DefaultAwemeCardClickHandler.class, "photoCommentStickerVM", "getPhotoCommentStickerVM()Lcom/ss/android/ugc/aweme/photocommentsticker/IPhotoCommentStickerViewModel;", 0);
        c09r3.getClass();
        LLILZIL = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2};
    }

    public DefaultAwemeCardClickHandler(Fragment fragment, SessionInfo sessionInfo) {
        AssemVMLazy assemVMLazy;
        this.LL = sessionInfo;
        this.LLILLJJLI = fragment;
        InterfaceC724760Sbq interfaceC724760Sbq = C019F.LIZ;
        AwS558S0100000_14 awS558S0100000_14 = new AwS558S0100000_14(this, 1656);
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(IPhotoCommentStickerViewModel.class);
        C5182020e c5182020e = new C5182020e((C13IQ) c19719912DlLIZ, 610);
        AFwS248S0000000_14 aFwS248S0000000_14 = AFwS248S0000000_14.get$arr$(538);
        if (Intrinsics.LJFF(interfaceC724760Sbq, C01D1.LIZ)) {
            assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(fragment, c19719912DlLIZ), c5182020e, new C452070Ho5(), new C1622206Wu(fragment, true), new C338490DOt(fragment, true), awS558S0100000_14, aFwS248S0000000_14, new C451460Hn6(fragment, true), new C451620HnM(fragment, true), new C987103tV(fragment, true));
        } else if (interfaceC724760Sbq instanceof InterfaceC451590HnJ) {
            assemVMLazy = C451650HnP.LIZ(fragment, (InterfaceC451590HnJ) interfaceC724760Sbq, C724750Sbp.LJIIJ(fragment, c19719912DlLIZ), c5182020e, awS558S0100000_14, aFwS248S0000000_14, null, null, null);
        } else if (Intrinsics.LJFF(interfaceC724760Sbq, interfaceC724760Sbq)) {
            assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(fragment, c19719912DlLIZ), c5182020e, new C452070Ho5(), C724750Sbp.LJII(fragment), C724750Sbp.LJIIIZ(fragment), awS558S0100000_14, aFwS248S0000000_14, new C451460Hn6(fragment, false), new C451620HnM(fragment, false), new C987103tV(fragment, false));
        } else {
            throw new IllegalArgumentException("Do not support this scope here.");
        }
        this.LLILLL = assemVMLazy;
    }

    @Override // com.ss.android.ugc.aweme.im.messagelist.api.ability.MessageListAwemeCardClickAbility
    public final void gs2(RoundingCornerLayoutCL roundingCornerLayoutCL, C869590Y9l c869590Y9l, AwemeCardTemplate awemeCardTemplate) {
        String string;
        String str;
        IIMMessageAdapterAnalytics iIMMessageAdapterAnalytics;
        C0ZH2 c0zh2;
        Set<String> set;
        Object ability;
        List<C869590Y9l> listVi2;
        String str2 = awemeCardTemplate.baseVideoComponent.id;
        String strLIZ = null;
        if (!C0ZDX.LJJJJIZL(c869590Y9l) && C1711706n5.LIZ()) {
            AssemVMLazy assemVMLazy = this.LLILLL;
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLILZIL;
            IPhotoCommentStickerViewModel iPhotoCommentStickerViewModel = (IPhotoCommentStickerViewModel) assemVMLazy.getValue();
            C0QSJ c0qsjLIZJ = C687700QyG.LIZJ(C1558360qeg.LJFF(this.LLILLJJLI, null), ChatRoomScope.class);
            if (c0qsjLIZJ != null) {
                ability = c0qsjLIZJ.getAbility(MessagePowerListAbility.class);
            } else {
                ability = null;
            }
            if (!(ability instanceof MessagePowerListAbility)) {
                ability = null;
            }
            MessagePowerListAbility messagePowerListAbility = (MessagePowerListAbility) ability;
            if (messagePowerListAbility != null) {
                listVi2 = messagePowerListAbility.vi2();
            } else {
                listVi2 = null;
            }
            iPhotoCommentStickerViewModel.recordEnteredAweme(str2, listVi2);
        }
        if (C0XF1.LIZLLL(roundingCornerLayoutCL.getContext()) && (c0zh2 = C0ZH3.LIZ) != null && (set = c0zh2.LIZ) != null) {
            set.add(str2);
        }
        Aweme awemeLIZ = C327340CsO.LIZ(str2);
        if (Intrinsics.LJFF(c869590Y9l.getScene(), EnumC896390ZEn.STORY.getScene())) {
            IAwemeOpenHelper.LIZ.getClass();
            IAwemeOpenHelper iAwemeOpenHelperLIZ = C1720706oX.LIZ();
            if (iAwemeOpenHelperLIZ != null) {
                if (awemeLIZ != null) {
                    strLIZ = AwemeExtKt.getAuthorUid(awemeLIZ);
                }
                iAwemeOpenHelperLIZ.LIZ(str2, awemeLIZ, strLIZ, c869590Y9l.getConversationId(), "click", this.LL, C0ZU4.CHAT);
                return;
            }
            return;
        }
        if (!Intrinsics.LJFF(c869590Y9l.getScene(), EnumC896390ZEn.HIGHLIGHT_STORY.getScene()) && !Intrinsics.LJFF(c869590Y9l.getScene(), EnumC896390ZEn.HIGHLIGHT_STORY_COLLECTION.getScene())) {
            if (awemeLIZ != null) {
                AwemeBizExtKt.setSourceBtmToken(awemeLIZ, BtmSDK.INSTANCE.createJumpSourceBtmToken("c9946.d0", PageFinder.via((View) roundingCornerLayoutCL), null));
            }
            C1720706oX.LIZIZ(IAwemeOpenHelper.LIZ, roundingCornerLayoutCL.getContext(), roundingCornerLayoutCL, C0Z92.NORMAL, awemeLIZ, EnumC899970ZSh.AWEME_CARD, str2, c869590Y9l, this.LL, null, true, "click", null, null, null, 14336);
            if (!C0ZDX.LJIL(c869590Y9l) || (iIMMessageAdapterAnalytics = (IIMMessageAdapterAnalytics) PluggableExtentionKt.pluggableSpi$default(IIMMessageAdapterAnalytics.class, false, false, false, 14, null)) == null) {
                return;
            }
            iIMMessageAdapterAnalytics.LJIIIZ(c869590Y9l, C0I0B.LJFF.LIZIZ());
            return;
        }
        Long l = awemeCardTemplate.baseUserComponent.userId;
        if (l != null) {
            string = l.toString();
        } else {
            string = null;
        }
        IMContactApi.LIZ.getClass();
        IMUser iMUserLIZLLL = C069P.LIZ().LJ().LIZLLL(string, null, "im_chat");
        if (iMUserLIZLLL == null) {
            return;
        }
        IAwemeOpenHelper.LIZ.getClass();
        IAwemeOpenHelper iAwemeOpenHelperLIZ2 = C1720706oX.LIZ();
        if (iAwemeOpenHelperLIZ2 == null) {
            return;
        }
        Fragment fragment = this.LLILLJJLI;
        String scene = c869590Y9l.getScene();
        if (scene == null) {
            scene = "";
        }
        HighlightStoryComponent highlightStoryComponent = awemeCardTemplate.highlightStoryComponent;
        if (highlightStoryComponent == null || (str = highlightStoryComponent.highlightStoryCollectionId) == null) {
            str = "";
        }
        if (Intrinsics.LJFF(c869590Y9l.getScene(), "share_highlight_story")) {
            strLIZ = C0ZDX.LIZ(c869590Y9l);
        }
        IMUser.Companion.getClass();
        iAwemeOpenHelperLIZ2.LIZIZ(fragment, scene, str, strLIZ, C2201941BFw.LJII(iMUserLIZLLL), c869590Y9l.getConversationId(), this.LL, c869590Y9l);
    }

    @Override // com.ss.android.ugc.aweme.im.messagelist.api.ability.MessageListAwemeCardClickAbility
    public final void Li2(RoundingCornerLayoutCL roundingCornerLayoutCL, C869590Y9l c869590Y9l, AwemeCardTemplate awemeCardTemplate, SessionInfo sessionInfo) {
        String string;
        String str;
        IUserProfilePreload iUserProfilePreload;
        Long l = awemeCardTemplate.baseUserComponent.userId;
        if (l != null) {
            string = l.toString();
        } else {
            string = null;
        }
        if (TextUtils.isEmpty(string)) {
            return;
        }
        String str2 = c869590Y9l.getLocalExt().get("feed_ad_fake_nickname");
        if (str2 != null && str2.length() > 0) {
            C1389890mGx c1389890mGx = new C1389890mGx(roundingCornerLayoutCL);
            c1389890mGx.LJIIIZ(2131824738);
            c1389890mGx.LJIIJJI();
        }
        IMContactApi.LIZ.getClass();
        IMUser iMUserLIZLLL = C069P.LIZ().LJ().LIZLLL(string, null, "im_chat");
        if (iMUserLIZLLL != null && (iUserProfilePreload = (IUserProfilePreload) PluggableExtentionKt.pluggableSpi$default(IUserProfilePreload.class, false, false, false, 14, null)) != null) {
            IMUser.Companion.getClass();
            iUserProfilePreload.LIZ(C2201941BFw.LJII(iMUserLIZLLL));
        }
        if (sessionInfo.isGroupChat()) {
            str = "group_chat";
        } else {
            str = "chat";
        }
        IIMChatAnalytics.LIZ.getClass();
        IIMChatAnalytics iIMChatAnalyticsLIZ = C1705506m5.LIZ();
        if (iIMChatAnalyticsLIZ != null) {
            iIMChatAnalyticsLIZ.LJ(C0I0B.LJFF.LIZIZ(), null, string, str, "click_head", String.valueOf(System.currentTimeMillis()));
        }
        C879350Yeb.LIZ.getClass();
        C879350Yeb.LIZ(string, null, null);
    }
}
