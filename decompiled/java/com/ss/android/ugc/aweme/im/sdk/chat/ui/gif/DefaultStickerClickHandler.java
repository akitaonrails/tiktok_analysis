package com.ss.android.ugc.aweme.im.sdk.chat.ui.gif;

import X.C019F;
import X.C01D1;
import X.C0I0B;
import X.C0Z2Z;
import X.C0ZDX;
import X.C0ZVS;
import X.C13IQ;
import X.C13LE;
import X.C13LP;
import X.C1622206Wu;
import X.C1954807lC;
import X.C19719912Dl;
import X.C19EG;
import X.C2095008Iq;
import X.C2097608Jq;
import X.C2217381BqS;
import X.C338490DOt;
import X.C451460Hn6;
import X.C451620HnM;
import X.C451650HnP;
import X.C452070Ho5;
import X.C454640HsE;
import X.C454810HsV;
import X.C454860Hsa;
import X.C454870Hsb;
import X.C454890Hsd;
import X.C454970Hsl;
import X.C5182020e;
import X.C724750Sbp;
import X.C869590Y9l;
import X.C987103tV;
import X.EnumC454550Hs5;
import X.InterfaceC2217461Bqa;
import X.InterfaceC451590HnJ;
import X.InterfaceC453710Hqj;
import X.InterfaceC454940Hsi;
import X.InterfaceC724760Sbq;
import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.im.chatroom.api.model.SessionInfo;
import com.ss.android.ugc.aweme.im.message.template.card.BaseTemplate;
import com.ss.android.ugc.aweme.im.message.template.card.StickerTemplate;
import com.ss.android.ugc.aweme.im.message.template.component.BaseRequestComponent;
import com.ss.android.ugc.aweme.im.message.template.component.ImageComponent;
import com.ss.android.ugc.aweme.im.message.template.component.QueryDataComponent;
import com.ss.android.ugc.aweme.im.message.template.component.StickerCardFallbackInfoComponent;
import com.ss.android.ugc.aweme.im.messagelist.api.ability.MessageListStickerClickAbility;
import com.ss.android.ugc.aweme.im.report.api.IIMReportService;
import com.ss.android.ugc.aweme.im.saas.host.api.live.IMLiveService;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.input.sendmsg.SendMessageVM;
import com.ss.android.ugc.aweme.im.sticker.api.IMStickerApi;
import com.ss.android.ugc.aweme.socialgame.api.model.EmojiGameInfo;
import com.ss.android.ugc.aweme.socialgame.api.model.StickerMatchStruct;
import com.ss.android.ugc.aweme.socialgame.api.service.ISocialGameService;
import com.ss.android.ugc.aweme.views.RoundingCornerLayout;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS236S0000000_6;
import kotlin.jvm.internal.AwS104S0400000_6;
import kotlin.jvm.internal.AwS135S0400000_6;
import kotlin.jvm.internal.AwS215S0300000_6;
import kotlin.jvm.internal.AwS250S0300000_6;
import kotlin.jvm.internal.AwS550S0100000_6;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class DefaultStickerClickHandler implements MessageListStickerClickAbility {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLILZ;
    public final SessionInfo LL;
    public final Fragment LLILLJJLI;
    public final AssemVMLazy LLILLL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(DefaultStickerClickHandler.class, "sendMessageVM", "getSendMessageVM()Lcom/ss/android/ugc/aweme/im/sdk/chat/ui/base/assems/input/sendmsg/SendMessageVM;", 0);
        C13LE.LIZ.getClass();
        LLILZ = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public final SendMessageVM LIZIZ() {
        AssemVMLazy assemVMLazy = this.LLILLL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLILZ;
        return (SendMessageVM) assemVMLazy.getValue();
    }

    public final void LIZLLL(InterfaceC454940Hsi interfaceC454940Hsi) {
        boolean zBooleanValue;
        BaseRequestComponent baseRequestComponentRj;
        QueryDataComponent queryDataComponent;
        Map<String, String> map;
        String str;
        BaseRequestComponent baseRequestComponentRj2;
        QueryDataComponent queryDataComponent2;
        Map<String, String> map2;
        IMLiveService iMLiveServiceLIZ;
        Boolean boolLIZ;
        if (interfaceC454940Hsi instanceof C454860Hsa) {
            C454860Hsa c454860Hsa = (C454860Hsa) interfaceC454940Hsi;
            C19EG c19eg = c454860Hsa.LIZ;
            C869590Y9l c869590Y9l = c454860Hsa.LIZIZ;
            String str2 = c454860Hsa.LIZJ;
            if (IMLiveService.LIZ != null && (iMLiveServiceLIZ = C0ZVS.LIZ()) != null && (boolLIZ = iMLiveServiceLIZ.LIZ()) != null) {
                zBooleanValue = boolLIZ.booleanValue();
            } else {
                zBooleanValue = true;
            }
            if (zBooleanValue) {
                BaseTemplate baseTemplateLIZ = C0Z2Z.LIZ(c869590Y9l, BaseTemplate.class);
                if (baseTemplateLIZ != null && (baseRequestComponentRj2 = baseTemplateLIZ.rj()) != null && (queryDataComponent2 = baseRequestComponentRj2.queryData) != null && (map2 = queryDataComponent2.extras) != null) {
                    String str3 = map2.get("a:sticker_set_id");
                    if (str3 == null) {
                        str3 = "";
                    }
                    String str4 = map2.get("a:sticker_sub_type");
                    if (str4 == null) {
                        str4 = "";
                    }
                    C454640HsE c454640HsE = IMStickerApi.LIZ;
                    c454640HsE.LIZIZ().getImStickerStoreService().LJJIJIIJIL(c19eg, CastLongProtector.parseLong(str3), EnumC454550Hs5.MESSAGE_LIST.getType(), "chat", "click", null, null, true, str2, null, null, null);
                    c454640HsE.LIZIZ().getImStickerAnalytics().LJJIII("chat", "click", C0I0B.LJFF.LIZIZ());
                    c454640HsE.LIZIZ().getImStickerAnalytics().LJIJI("chat", str3, c454640HsE.LIZIZ().getImStickerStoreService().LJIIL(CastLongProtector.parseLong(str3)), "click", c454640HsE.LIZIZ().getImStickerStoreService().LJJIIZI(str4), c454640HsE.LIZIZ().getImStickerStoreService().LJIJI(str4), null, C0I0B.LJFF.LIZIZ());
                    return;
                }
                return;
            }
            BaseTemplate baseTemplateLIZ2 = C0Z2Z.LIZ(c869590Y9l, BaseTemplate.class);
            if (baseTemplateLIZ2 == null || (baseRequestComponentRj = baseTemplateLIZ2.rj()) == null || (queryDataComponent = baseRequestComponentRj.queryData) == null || (map = queryDataComponent.extras) == null || (str = map.get("a:sticker_set_id")) == null) {
                return;
            }
            C454640HsE c454640HsE2 = IMStickerApi.LIZ;
            c454640HsE2.LIZIZ().getImStickerStoreService().LJJIJIIJIL(c19eg, CastLongProtector.parseLong(str), EnumC454550Hs5.MESSAGE_LIST.getType(), "chat", "click", null, null, true, str2, null, null, null);
            c454640HsE2.LIZIZ().getImStickerAnalytics().LJJIII("chat", "click", C0I0B.LJFF.LIZIZ());
            c454640HsE2.LIZIZ().getImStickerAnalytics().LJIJI("chat", str, c454640HsE2.LIZIZ().getImStickerStoreService().LJIIL(CastLongProtector.parseLong(str)), "click", false, false, null, C0I0B.LJFF.LIZIZ());
            return;
        }
        if (interfaceC454940Hsi instanceof C454890Hsd) {
            C454890Hsd c454890Hsd = (C454890Hsd) interfaceC454940Hsi;
            C19EG c19eg2 = c454890Hsd.LIZ;
            String str5 = c454890Hsd.LIZIZ;
            String str6 = c454890Hsd.LIZJ;
            Long lLJIILIIL = C2095008Iq.LJIILIIL(str5);
            if (lLJIILIIL == null) {
                return;
            }
            long jLongValue = lLJIILIIL.longValue();
            C454640HsE c454640HsE3 = IMStickerApi.LIZ;
            c454640HsE3.LIZIZ().getImStickerStoreService().LJJIJIIJIL(c19eg2, jLongValue, EnumC454550Hs5.MESSAGE_LIST.getType(), "chat", "click_quoted_message", null, null, true, str6, null, null, null);
            c454640HsE3.LIZIZ().getImStickerAnalytics().LJJIII("chat", "click_quoted_message", C0I0B.LJFF.LIZIZ());
            c454640HsE3.LIZIZ().getImStickerAnalytics().LJIJI("chat", str5, c454640HsE3.LIZIZ().getImStickerStoreService().LJIIL(jLongValue), "click_quoted_message", false, false, null, C0I0B.LJFF.LIZIZ());
            return;
        }
        throw new C1954807lC();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0245  */
    /* JADX WARN: Type inference failed for: r15v4, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r27v0, types: [X.0Hqj] */
    /* JADX WARN: Type inference failed for: r37v1, types: [kotlin.jvm.functions.Function0] */
    @Override // com.ss.android.ugc.aweme.im.messagelist.api.ability.MessageListStickerClickAbility
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void xj2(X.InterfaceC454950Hsj r44) {
        /*
            Method dump skipped, instruction units count: 590
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.im.sdk.chat.ui.gif.DefaultStickerClickHandler.xj2(X.0Hsj):void");
    }

    public DefaultStickerClickHandler(Fragment fragment, SessionInfo sessionInfo) {
        AssemVMLazy assemVMLazy;
        this.LL = sessionInfo;
        this.LLILLJJLI = fragment;
        InterfaceC724760Sbq interfaceC724760Sbq = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(SendMessageVM.class);
        C5182020e c5182020e = new C5182020e((C13IQ) c19719912DlLIZ, 503);
        AFwS236S0000000_6 aFwS236S0000000_6 = AFwS236S0000000_6.get$arr$(491);
        if (Intrinsics.LJFF(interfaceC724760Sbq, C01D1.LIZ)) {
            assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(fragment, c19719912DlLIZ), c5182020e, new C452070Ho5(), new C1622206Wu(fragment, true), new C338490DOt(fragment, true), new AwS550S0100000_6((HasDefaultViewModelProviderFactory) fragment, 1357), aFwS236S0000000_6, new C451460Hn6(fragment, true), new C451620HnM(fragment, true), new C987103tV(fragment, true));
        } else if (interfaceC724760Sbq instanceof InterfaceC451590HnJ) {
            assemVMLazy = C451650HnP.LIZ(fragment, (InterfaceC451590HnJ) interfaceC724760Sbq, C724750Sbp.LJIIJ(fragment, c19719912DlLIZ), c5182020e, new AwS550S0100000_6(fragment, 1358), aFwS236S0000000_6, null, null, null);
        } else if (Intrinsics.LJFF(interfaceC724760Sbq, interfaceC724760Sbq)) {
            assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(fragment, c19719912DlLIZ), c5182020e, new C452070Ho5(), C724750Sbp.LJII(fragment), C724750Sbp.LJIIIZ(fragment), new AwS550S0100000_6((HasDefaultViewModelProviderFactory) fragment, 1359), aFwS236S0000000_6, new C451460Hn6(fragment, false), new C451620HnM(fragment, false), new C987103tV(fragment, false));
        } else {
            throw new IllegalArgumentException("Do not support this scope here.");
        }
        this.LLILLL = assemVMLazy;
    }

    @Override // com.ss.android.ugc.aweme.im.messagelist.api.ability.MessageListStickerClickAbility
    public final void LG1(RoundingCornerLayout roundingCornerLayout, StickerTemplate stickerTemplate) {
        Map<String, String> map;
        String str;
        String str2;
        List<String> list;
        QueryDataComponent queryDataComponent;
        BaseRequestComponent baseRequestComponent = stickerTemplate.baseRequestComponent;
        String str3 = null;
        if (baseRequestComponent != null && (queryDataComponent = baseRequestComponent.queryData) != null) {
            map = queryDataComponent.extras;
        } else {
            map = null;
        }
        ISocialGameService iSocialGameService = (ISocialGameService) PluggableExtentionKt.pluggableSpi$default(ISocialGameService.class, false, false, false, 14, null);
        if (iSocialGameService != null) {
            Context context = roundingCornerLayout.getContext();
            if (map != null) {
                str = map.get("a:sticker_set_id");
                str2 = map.get("a:sticker_id");
            } else {
                str = null;
                str2 = null;
            }
            ImageComponent imageComponent = stickerTemplate.imageComponent;
            if (imageComponent != null && (list = imageComponent.urls) != null) {
                str3 = (String) C13LP.LJJJLZIJ(0, list);
            }
            iSocialGameService.LJIIIZ(context, new EmojiGameInfo(1, null, new StickerMatchStruct(str, str2, str3)), this.LL, C2097608Jq.LJIIIIZZ(new Pair("enter_from", "chat"), new Pair("enter_method", "sticker")));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0074  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZ(com.ss.android.ugc.aweme.im.message.template.card.StickerTemplate r10, X.InterfaceC1364105Vn<? super java.lang.String> r11) {
        /*
            r9 = this;
            boolean r0 = r11 instanceof X.C454830HsX
            if (r0 == 0) goto L74
            r7 = r11
            X.0HsX r7 = (X.C454830HsX) r7
            int r2 = r7.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L74
            int r2 = r2 - r1
            r7.LLILLL = r2
        L12:
            java.lang.Object r1 = r7.LL
            java.lang.Object r8 = X.C099R.LJFF()
            int r0 = r7.LLILLL
            r6 = 0
            r5 = 0
            r4 = 2131830930(0x7f112892, float:1.9294871E38)
            r3 = 1
            if (r0 == 0) goto L38
            if (r0 != r3) goto L7a
            X.C155000ia.LIZIZ(r1)
        L27:
            com.ss.android.ugc.aweme.im.common.model.BaseContact r1 = (com.ss.android.ugc.aweme.im.common.model.BaseContact) r1
            if (r1 == 0) goto L2f
            java.lang.String r6 = r1.getNickName()
        L2f:
            java.lang.Object[] r0 = new java.lang.Object[r3]
            r0[r5] = r6
            java.lang.String r0 = X.C1710306mr.LIZIZ(r4, r0)
            return r0
        L38:
            X.C155000ia.LIZIZ(r1)
            java.lang.String r2 = X.C2243571Crb.LIZ(r10)
            X.069P r0 = com.ss.android.ugc.aweme.im.contacts.api.IMContactApi.LIZ
            r0.getClass()
            com.ss.android.ugc.aweme.im.contacts.api.IMContactApi r0 = X.C069P.LIZ()
            X.1BGS r1 = r0.LJ()
            java.lang.String r0 = "im_local_db"
            com.ss.android.ugc.aweme.im.contacts.api.model.IMUser r0 = r1.LJIIL(r2, r6, r0)
            if (r0 == 0) goto L61
            java.lang.Object[] r1 = new java.lang.Object[r3]
            java.lang.String r0 = r0.getNickName()
            r1[r5] = r0
            java.lang.String r0 = X.C1710306mr.LIZIZ(r4, r1)
            return r0
        L61:
            com.ss.android.ugc.aweme.im.contacts.api.IMContactApi r0 = X.C069P.LIZ()
            X.1BGS r1 = r0.LJ()
            r7.LLILLL = r3
            java.lang.String r0 = "im_social_avatar_sticker"
            java.lang.Object r1 = r1.LJIIJ(r2, r0, r3, r7)
            if (r1 != r8) goto L27
            return r8
        L74:
            X.0HsX r7 = new X.0HsX
            r7.<init>(r9, r11)
            goto L12
        L7a:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.im.sdk.chat.ui.gif.DefaultStickerClickHandler.LIZ(com.ss.android.ugc.aweme.im.message.template.card.StickerTemplate, X.05Vn):java.lang.Object");
    }

    @Override // com.ss.android.ugc.aweme.im.messagelist.api.ability.MessageListStickerClickAbility
    public final void Gl1(C19EG c19eg, C869590Y9l c869590Y9l, StickerTemplate stickerTemplate) {
        StickerCardFallbackInfoComponent stickerCardFallbackInfoComponent = stickerTemplate.fallbackInfo;
        StickerCardFallbackInfoComponent.Companion.getClass();
        if (!Intrinsics.LJFF(stickerCardFallbackInfoComponent, StickerCardFallbackInfoComponent.EMPTY_FALLBACK)) {
            return;
        }
        LIZLLL(new C454860Hsa(c19eg, c869590Y9l, this.LL.getConversationId()));
    }

    @Override // com.ss.android.ugc.aweme.im.messagelist.api.ability.MessageListStickerClickAbility
    public final void iA0(SessionInfo sessionInfo, StickerTemplate stickerTemplate, AwS215S0300000_6 awS215S0300000_6) {
        String str;
        String str2;
        List<String> list;
        QueryDataComponent queryDataComponent;
        Map<String, String> map;
        QueryDataComponent queryDataComponent2;
        Map<String, String> map2;
        BaseRequestComponent baseRequestComponent = stickerTemplate.baseRequestComponent;
        String str3 = null;
        if (baseRequestComponent != null && (queryDataComponent2 = baseRequestComponent.queryData) != null && (map2 = queryDataComponent2.extras) != null) {
            str = map2.get("a:sticker_set_id");
        } else {
            str = null;
        }
        BaseRequestComponent baseRequestComponent2 = stickerTemplate.baseRequestComponent;
        if (baseRequestComponent2 != null && (queryDataComponent = baseRequestComponent2.queryData) != null && (map = queryDataComponent.extras) != null) {
            str2 = map.get("a:sticker_id");
        } else {
            str2 = null;
        }
        ImageComponent imageComponent = stickerTemplate.imageComponent;
        if (imageComponent != null && (list = imageComponent.urls) != null) {
            str3 = (String) C13LP.LJJJLZIJ(0, list);
        }
        EmojiGameInfo emojiGameInfo = new EmojiGameInfo(1, null, new StickerMatchStruct(str, str2, str3));
        ISocialGameService iSocialGameService = (ISocialGameService) PluggableExtentionKt.pluggableSpi$default(ISocialGameService.class, false, false, false, 14, null);
        if (iSocialGameService != null) {
            iSocialGameService.LJIIJ(sessionInfo, new AwS104S0400000_6(iSocialGameService, emojiGameInfo, sessionInfo, awS215S0300000_6, 8));
        }
    }

    public static void LJFF(Activity activity, String str, String str2, String str3) {
        Uri.Builder builderAppendQueryParameter = new Uri.Builder().appendQueryParameter("object_id", str).appendQueryParameter("owner_id", str2).appendQueryParameter("report_type", "sticker").appendQueryParameter("sticker_type", str3);
        IIMReportService.LIZ.getClass();
        IIMReportService iIMReportServiceLIZ = C454970Hsl.LIZ();
        if (iIMReportServiceLIZ != null) {
            iIMReportServiceLIZ.report(activity, builderAppendQueryParameter, null);
        }
    }

    @Override // com.ss.android.ugc.aweme.im.messagelist.api.ability.MessageListStickerClickAbility
    public final void MS(RoundingCornerLayout roundingCornerLayout, C19EG c19eg, C869590Y9l c869590Y9l, StickerTemplate stickerTemplate) {
        C454640HsE c454640HsE = IMStickerApi.LIZ;
        if (!c454640HsE.LIZIZ().getImSocialAvatarService().isEnabled()) {
            return;
        }
        c454640HsE.LIZIZ().getImSocialAvatarService().LJJJJL();
        InterfaceC453710Hqj imStickerInputPanelService = c454640HsE.LIZIZ().getImStickerInputPanelService();
        AwS250S0300000_6 awS250S0300000_6 = null;
        C454810HsV c454810HsV = new C454810HsV(this, stickerTemplate, null);
        if (!C0ZDX.LJJJJIZL(c869590Y9l)) {
            awS250S0300000_6 = new AwS250S0300000_6(roundingCornerLayout, this, stickerTemplate, 17);
        }
        imStickerInputPanelService.LJIILL(roundingCornerLayout, stickerTemplate, "chat", "chat", c454810HsV, true, null, new AwS135S0400000_6(this, roundingCornerLayout, stickerTemplate, c869590Y9l, 8), awS250S0300000_6, this.LL);
    }

    @Override // com.ss.android.ugc.aweme.im.messagelist.api.ability.MessageListStickerClickAbility
    public final void dH1(View view, C19EG c19eg, C869590Y9l c869590Y9l, StickerTemplate stickerTemplate) {
        xj2(new C454870Hsb(view, c19eg, c869590Y9l, stickerTemplate));
    }

    @Override // com.ss.android.ugc.aweme.im.messagelist.api.ability.MessageListStickerClickAbility
    public final void up1(View view, FragmentManager fragmentManager, C869590Y9l c869590Y9l, StickerTemplate stickerTemplate) {
        C454640HsE c454640HsE = IMStickerApi.LIZ;
        if (!c454640HsE.LIZIZ().getImSocialAvatarService().isEnabled()) {
            return;
        }
        c454640HsE.LIZIZ().getImSocialAvatarService().LJJJJL();
        c454640HsE.LIZIZ().getImSocialAvatarService().LJJL(this.LL, view, stickerTemplate, String.valueOf(c869590Y9l.getSender()), fragmentManager);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:30:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0167  */
    /* JADX WARN: Type inference failed for: r11v5, types: [java.lang.Long] */
    /* JADX WARN: Type inference failed for: r21v1, types: [kotlin.jvm.functions.Function0] */
    /* JADX WARN: Type inference failed for: r7v0, types: [X.0Hqj] */
    @Override // com.ss.android.ugc.aweme.im.messagelist.api.ability.MessageListStickerClickAbility
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zM(android.view.View r27, X.C19EG r28, X.C869590Y9l r29, com.ss.android.ugc.aweme.im.message.template.card.StickerTemplate r30) {
        /*
            Method dump skipped, instruction units count: 535
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.im.sdk.chat.ui.gif.DefaultStickerClickHandler.zM(android.view.View, X.19EG, X.0Y9l, com.ss.android.ugc.aweme.im.message.template.card.StickerTemplate):void");
    }
}
