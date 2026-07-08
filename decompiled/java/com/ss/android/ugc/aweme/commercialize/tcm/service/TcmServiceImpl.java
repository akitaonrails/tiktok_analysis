package com.ss.android.ugc.aweme.commercialize.tcm.service;

import X.C04PM;
import X.C05NB;
import X.C08RU;
import X.C0XEE;
import X.C1050500dRY;
import X.C1050540dRc;
import X.C1209820haW;
import X.C1209830haX;
import X.C1265760j2k;
import X.C1389890mGx;
import X.C1397510mTF;
import X.C1397580mTM;
import X.C1397620mTQ;
import X.C1440005kM;
import X.C15N4;
import X.C15N5;
import X.C15N7;
import X.C15N8;
import X.C1944507jX;
import X.C1944607jY;
import X.C2188811AlT;
import X.C305810Byl;
import X.C444920HcY;
import X.C786410Ut5;
import X.C985403tE;
import X.InterfaceC1028200cra;
import X.InterfaceC1770740wBE;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.TextUtils;
import android.view.ViewGroup;
import com.bytedance.ies.web.jsbridge.IESJsBridge;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.awemeservice.api.IAwemeService;
import com.ss.android.ugc.aweme.commerce.AwemeCommerceStruct;
import com.ss.android.ugc.aweme.commerce.BizAccount;
import com.ss.android.ugc.aweme.commerce.BizAccountInfo;
import com.ss.android.ugc.aweme.commerce.BrandedContent;
import com.ss.android.ugc.aweme.commercialize.media.api.service.ICommerceMediaService;
import com.ss.android.ugc.aweme.commercialize.tcm.push.BCVideosInPushMsg;
import com.ss.android.ugc.aweme.commercialize.tcm.view.TcmOrderStatusBottomBarTrigger;
import com.ss.android.ugc.aweme.discover.model.BrandedContentToolSchema;
import com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.profile.model.TcmConfig;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.governance.eventbus.IEvent;
import com.zhiliaoapp.musically.R;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AFwS276S0000000_31;
import kotlin.jvm.internal.AwS260S0300000_16;
import kotlin.jvm.internal.AwS378S0200000_12;
import kotlin.jvm.internal.AwS397S0200000_31;
import kotlin.text.a0;
import kotlin.text.u;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes32.dex */
public final class TcmServiceImpl implements ITcmService {
    @Override // com.ss.android.ugc.aweme.commercialize.tcm.service.ITcmService
    public final TcmOrderStatusBottomBarTrigger LJIIJ() {
        return new TcmOrderStatusBottomBarTrigger();
    }

    @Override // com.ss.android.ugc.aweme.commercialize.tcm.service.ITcmService
    public final int LJIIL() {
        C15N4 c15n4;
        User currentUser;
        BrandedContent brandedContent;
        synchronized (C15N4.LLILLJJLI) {
            if (C15N4.LLILLL == null) {
                C15N4.LLILLL = new C15N4();
            }
            c15n4 = C15N4.LLILLL;
        }
        BCVideosInPushMsg bCVideosInPushMsg = c15n4.LL;
        InterfaceC1770740wBE interfaceC1770740wBE = (InterfaceC1770740wBE) C04PM.LIZ.LIZ();
        if (interfaceC1770740wBE == null || (currentUser = interfaceC1770740wBE.getCurrentUser()) == null) {
            return 0;
        }
        if (TextUtils.equals(bCVideosInPushMsg != null ? bCVideosInPushMsg.LIZ : null, currentUser.getUid())) {
            if (bCVideosInPushMsg != null) {
                return bCVideosInPushMsg.newContentNum;
            }
            return 0;
        }
        BizAccount bizAccountLIZ = C0XEE.LIZ();
        if (bizAccountLIZ == null || (brandedContent = bizAccountLIZ.getBrandedContent()) == null) {
            return 0;
        }
        return brandedContent.getNewContentNum();
    }

    @Override // com.ss.android.ugc.aweme.commercialize.tcm.service.ITcmService
    public final TcmConfig LJII() {
        return C305810Byl.LIZ();
    }

    @Override // com.ss.android.ugc.aweme.commercialize.tcm.service.ITcmService
    public final boolean LJIIJJI() {
        TcmConfig tcmConfigLIZ = C305810Byl.LIZ();
        if (tcmConfigLIZ != null) {
            return tcmConfigLIZ.getUseBcEntranceAfterPost();
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.commercialize.tcm.service.ITcmService
    public final Integer LJIILJJIL() {
        return Integer.valueOf(R.layout.fx7);
    }

    @Override // com.ss.android.ugc.aweme.commercialize.tcm.service.ITcmService
    public final void LIZ(JSONObject jSONObject) {
        Aweme awemeLLILZ;
        int i;
        String strOptString = jSONObject.optString("item_id");
        if (strOptString != null && (awemeLLILZ = ((IAwemeService) ServiceManager.get().getService(IAwemeService.class)).LLILZ(strOptString)) != null) {
            boolean zOptBoolean = jSONObject.optBoolean("ads_only");
            boolean zOptBoolean2 = jSONObject.optBoolean("ads_authorization");
            String strOptString2 = jSONObject.optString("branded_content_type");
            if (zOptBoolean) {
                i = 1;
            } else {
                i = 2;
            }
            AwemeCommerceStruct commerceVideoAuthInfo = awemeLLILZ.getCommerceVideoAuthInfo();
            if (commerceVideoAuthInfo != null) {
                commerceVideoAuthInfo.setDarkPostStatus(i);
                commerceVideoAuthInfo.setAdvPromotable(zOptBoolean2);
                commerceVideoAuthInfo.setBrandedContentType(CastLongProtector.parseLong(strOptString2));
                commerceVideoAuthInfo.setPreventSelfSee(TextUtils.equals(strOptString2, "4"));
                if (!TextUtils.isEmpty(jSONObject.optString("star_atlas_order_id"))) {
                    awemeLLILZ.setStarAtlasOrderId(CastLongProtector.parseLong(jSONObject.optString("star_atlas_order_id")));
                }
                C1440005kM.LIZ(new C15N5(CastIntegerProtector.parseInt(strOptString2), commerceVideoAuthInfo.isAdvPromotable()));
            }
            C1440005kM.LIZ(new IEvent() { // from class: X.0Szi
                @Override // com.ss.android.ugc.governance.eventbus.IEvent
                public final /* synthetic */ IEvent post() {
                    C1440005kM.LIZ(this);
                    return this;
                }

                @Override // com.ss.android.ugc.governance.eventbus.IEvent
                public final /* synthetic */ IEvent postSticky() {
                    C1440005kM.LIZIZ(this);
                    return this;
                }
            });
        }
    }

    @Override // com.ss.android.ugc.aweme.commercialize.tcm.service.ITcmService
    public final void LJI(C05NB c05nb) {
        C04PM.LIZ.LIZIZ(c05nb);
    }

    @Override // com.ss.android.ugc.aweme.commercialize.tcm.service.ITcmService
    public final int LJIIIZ(Integer num) {
        if (num != null) {
            if (num.intValue() == 1) {
                return 2131849985;
            }
            if (num.intValue() == 2) {
                return 2131849979;
            }
            if (num.intValue() == 3) {
                return 2131849984;
            }
            return 0;
        }
        return 0;
    }

    @Override // com.ss.android.ugc.aweme.commercialize.tcm.service.ITcmService
    public final void LJIILLIIL(JSONObject jSONObject) {
        C1440005kM.LIZ(new IEvent(jSONObject.optInt("type")) { // from class: X.0Szj
            public final int LIZ;

            @Override // com.ss.android.ugc.governance.eventbus.IEvent
            public final /* synthetic */ IEvent post() {
                C1440005kM.LIZ(this);
                return this;
            }

            @Override // com.ss.android.ugc.governance.eventbus.IEvent
            public final /* synthetic */ IEvent postSticky() {
                C1440005kM.LIZIZ(this);
                return this;
            }

            {
                this.LIZ = i;
            }
        });
    }

    @Override // com.ss.android.ugc.aweme.commercialize.tcm.service.ITcmService
    public final boolean LIZIZ(Aweme aweme, String str) {
        AwemeCommerceStruct commerceVideoAuthInfo;
        BizAccountInfo bizAccountInfo;
        if (aweme == null || (commerceVideoAuthInfo = aweme.getCommerceVideoAuthInfo()) == null || (bizAccountInfo = commerceVideoAuthInfo.getBizAccountInfo()) == null || !bizAccountInfo.enableBrandedContentViewInsights() || !C1050540dRc.LIZ(str)) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.commercialize.tcm.service.ITcmService
    public final C1209820haW LIZJ(Context context, ViewGroup viewGroup) {
        return new C1209820haW(context, viewGroup);
    }

    @Override // com.ss.android.ugc.aweme.commercialize.tcm.service.ITcmService
    public final void LIZLLL(Context context, Aweme aweme) {
        String str;
        C1050540dRc.LIZ.getClass();
        BrandedContentToolSchema brandedContentToolSchemaLIZ = C1209830haX.LIZ();
        String aid = null;
        if (brandedContentToolSchemaLIZ != null) {
            str = brandedContentToolSchemaLIZ.baViewInsightsSchema;
        } else {
            str = null;
        }
        if (!TextUtils.isEmpty(str)) {
            Bundle bundle = new Bundle();
            if (aweme != null) {
                aid = aweme.getAid();
            }
            C786410Ut5.LJJJI("itemID", aid, bundle);
            C786410Ut5.LJJJI("enter_from", "video_play", bundle);
            if (str == null) {
                str = "";
            }
            SmartRouter.buildRoute(context, C08RU.LIZ(bundle, str)).open();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x00c9 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00ca  */
    @Override // com.ss.android.ugc.aweme.commercialize.tcm.service.ITcmService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJFF(com.ss.android.ugc.aweme.feed.model.Aweme r10, java.lang.String r11) {
        /*
            Method dump skipped, instruction units count: 234
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.commercialize.tcm.service.TcmServiceImpl.LJFF(com.ss.android.ugc.aweme.feed.model.Aweme, java.lang.String):void");
    }

    @Override // com.ss.android.ugc.aweme.commercialize.tcm.service.ITcmService
    public final boolean LJIIIIZZ(Aweme aweme, String str) {
        AwemeCommerceStruct commerceVideoAuthInfo;
        BizAccountInfo bizAccountInfo;
        if (aweme == null || (commerceVideoAuthInfo = aweme.getCommerceVideoAuthInfo()) == null || (bizAccountInfo = commerceVideoAuthInfo.getBizAccountInfo()) == null || !bizAccountInfo.enableBrandedContentRemoveMe() || !C1050540dRc.LIZ(str)) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.commercialize.tcm.service.ITcmService
    public final void LJIILIIL(Context context, Aweme aweme) {
        C1397620mTQ c1397620mTQ = new C1397620mTQ(context);
        c1397620mTQ.LJFF(2131827282, new AwS378S0200000_12(context, aweme, 107));
        c1397620mTQ.LJII(2131827276, AFwS276S0000000_31.get$arr$(348));
        C1397580mTM c1397580mTM = new C1397580mTM(context);
        c1397580mTM.LJFF(2131827283);
        c1397580mTM.LIZ(2131827285);
        c1397580mTM.LJIIL = c1397620mTQ;
        C1397510mTF c1397510mTF = new C1397510mTF(c1397580mTM);
        c1397510mTF.LLJJIII = false;
        c1397510mTF.LJFF(false);
        c1397510mTF.LIZLLL();
    }

    @Override // com.ss.android.ugc.aweme.commercialize.tcm.service.ITcmService
    public final void LJIILL(Aweme aweme, Activity activity) {
        TcmConfig tcmConfigLIZ;
        String strLIZIZ;
        Integer missionItemStatus;
        String str;
        String tcmFeParams;
        String str2;
        Music music;
        String bcSchemaAfterPost;
        if (activity != null && aweme != null && (tcmConfigLIZ = C305810Byl.LIZ()) != null && tcmConfigLIZ.getUseNewBCSetting()) {
            String aid = aweme.getAid();
            if (aid != null) {
                TcmConfig tcmConfigLIZ2 = C305810Byl.LIZ();
                if (tcmConfigLIZ2 == null || (bcSchemaAfterPost = tcmConfigLIZ2.getBcSchemaAfterPost()) == null || (strLIZIZ = u.LJJIFFI(bcSchemaAfterPost, "%@", aid, false)) == null) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("aweme://webview?url=https%3A%2F%2Fwww.tiktok.com%2Ffalcon%2Ftcm%2Fh5%2Fbranded_content%2F");
                    sbLIZ.append(aid);
                    sbLIZ.append("%3Fhide_nav_bar%3D1");
                    strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                }
                C1944607jY c1944607jYLIZ = C1944507jX.LIZ(strLIZIZ);
                boolean zIsTop = AwemeExtKt.isTop(aweme);
                String str3 = CardStruct.IStatusCode.DEFAULT;
                if (zIsTop) {
                    c1944607jYLIZ.LIZ("videoTopPlaylist", "1");
                } else if (aweme.playlist_info != null) {
                    c1944607jYLIZ.LIZ("videoTopPlaylist", "2");
                } else if (AwemeExtKt.isTop(aweme) && aweme.playlist_info != null) {
                    c1944607jYLIZ.LIZ("videoTopPlaylist", "3");
                } else {
                    c1944607jYLIZ.LIZ("videoTopPlaylist", CardStruct.IStatusCode.DEFAULT);
                }
                c1944607jYLIZ.LIZ("missionToastType", "3");
                AwemeCommerceStruct commerceVideoAuthInfo = aweme.getCommerceVideoAuthInfo();
                if (commerceVideoAuthInfo != null) {
                    missionItemStatus = commerceVideoAuthInfo.getMissionItemStatus();
                } else {
                    missionItemStatus = null;
                }
                c1944607jYLIZ.LIZ("missionItemStatus", String.valueOf(missionItemStatus));
                C15N7 c15n7 = new Object() { // from class: X.15N7
                };
                boolean zIsPrivate = AwemeExtKt.isPrivate(aweme);
                c15n7.getClass();
                if (zIsPrivate) {
                    str = "1";
                } else {
                    str = CardStruct.IStatusCode.DEFAULT;
                }
                c1944607jYLIZ.LIZ("isPrivate", str);
                TcmConfig tcmConfigLIZ3 = C305810Byl.LIZ();
                if (tcmConfigLIZ3 == null || (tcmFeParams = tcmConfigLIZ3.getTcmFeParams()) == null) {
                    tcmFeParams = "";
                }
                c1944607jYLIZ.LIZ("tcmFeParams", tcmFeParams);
                if (aweme.getMusic() != null && ((ICommerceMediaService) ServiceManager.get().getService(ICommerceMediaService.class)).LJIILL(aweme.getMusic())) {
                    c1944607jYLIZ.LIZ("musicType", "general");
                }
                Music music2 = aweme.getMusic();
                if (music2 != null && music2.isCommercialMusic() && ((music = aweme.getMusic()) == null || !music.isOriginalSound())) {
                    str2 = "1";
                } else {
                    str2 = CardStruct.IStatusCode.DEFAULT;
                }
                c1944607jYLIZ.LIZ("isCommerceMusic", str2);
                c1944607jYLIZ.LIZ("awemeType", String.valueOf(aweme.getAwemeType()));
                if (aweme.getIsTikTokStory()) {
                    str3 = "1";
                }
                c1944607jYLIZ.LIZ("isStory", str3);
                c1944607jYLIZ.LIZ("use_spark", "1");
                SmartRouter.buildRoute(activity, c1944607jYLIZ.LIZIZ().toString()).open();
                return;
            }
            C1389890mGx c1389890mGx = new C1389890mGx(activity);
            c1389890mGx.LJIIIZ(2131825230);
            c1389890mGx.LIZLLL(1000L);
            c1389890mGx.LJIIJJI();
        }
    }

    @Override // com.ss.android.ugc.aweme.commercialize.tcm.service.ITcmService
    public final void LJIIZILJ(Context context, IESJsBridge iESJsBridge, InterfaceC1028200cra interfaceC1028200cra) {
        C15N8.LIZ.getClass();
        String string = context.getResources().getString(2131827280);
        String string2 = context.getResources().getString(2131827277, string);
        int iLJJJ = a0.LJJJ(string2, string, 0, false, 6);
        int length = string.length() + iLJJJ;
        SpannableString spannableString = new SpannableString(string2);
        C786410Ut5.p2(spannableString, new C444920HcY(32, true), iLJJJ, length, 33);
        C786410Ut5.p2(spannableString, new C1265760j2k(context, 3), iLJJJ, length, 33);
        C1397580mTM c1397580mTM = new C1397580mTM(context);
        c1397580mTM.LIZIZ(spannableString);
        C985403tE.LIZ(c1397580mTM, new AwS397S0200000_31(iESJsBridge, interfaceC1028200cra, 110));
        c1397580mTM.LJII = false;
        new C1397510mTF(c1397580mTM).LIZLLL();
    }

    @Override // com.ss.android.ugc.aweme.commercialize.tcm.service.ITcmService
    public final C1050500dRY LJ(Context context, Aweme aweme, String str, AwS260S0300000_16 awS260S0300000_16) {
        List<AnchorCommonStruct> anchors;
        List<AnchorCommonStruct> anchors2;
        AnchorCommonStruct next;
        String keyword;
        String schema;
        if (aweme == null || (anchors = aweme.getAnchors()) == null || anchors.isEmpty() || (anchors2 = aweme.getAnchors()) == null) {
            return null;
        }
        Iterator<AnchorCommonStruct> it2 = anchors2.iterator();
        while (true) {
            if (it2.hasNext()) {
                next = it2.next();
                AnchorCommonStruct anchorCommonStruct = next;
                if (anchorCommonStruct.getType() == 59 && anchorCommonStruct.getExtra().length() > 0) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        AnchorCommonStruct anchorCommonStruct2 = next;
        if (anchorCommonStruct2 == null || (keyword = anchorCommonStruct2.getKeyword()) == null || keyword.length() == 0 || (schema = anchorCommonStruct2.getSchema()) == null || schema.length() == 0) {
            return null;
        }
        return new C1050500dRY(context, aweme, anchorCommonStruct2, str, awS260S0300000_16);
    }
}
