package com.ss.android.ugc.aweme.im.sdk.chat.analytics;

import X.AbstractC1711506n3;
import X.C0YNP;
import X.C0Z2Z;
import X.C0Z48;
import X.C0ZCG;
import X.C0ZCI;
import X.C0ZDX;
import X.C1229100i5c;
import X.C123100dR;
import X.C1AF0;
import X.C2095008Iq;
import X.C2201941BFw;
import X.C23250099c;
import X.C453750Hqn;
import X.C455900HuG;
import X.C461720I8s;
import X.C817503Hh;
import X.C866950Xzh;
import X.C869590Y9l;
import X.C909290Zln;
import X.EnumC1431810nMZ;
import X.EnumC451180Hme;
import X.EnumC868450Y5b;
import X.EnumC894220Z6e;
import X.InterfaceC1364105Vn;
import X.InterfaceC1493105sv;
import X.InterfaceC453640Hqc;
import com.bytedance.ies.im.core.api.model.RichTextInfo;
import com.bytedance.im.core.proto.ReferenceInfo;
import com.bytedance.services.apm.api.IEnsure;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.im.chatroom.api.model.SessionInfo;
import com.ss.android.ugc.aweme.im.common.model.StickerSubType;
import com.ss.android.ugc.aweme.im.common.model.StickerVariant;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUser;
import com.ss.android.ugc.aweme.im.message.content.BaseContent;
import com.ss.android.ugc.aweme.im.message.content.TextContent;
import com.ss.android.ugc.aweme.im.message.content.adapter.BaseContentParserKt;
import com.ss.android.ugc.aweme.im.message.template.card.BaseTemplate;
import com.ss.android.ugc.aweme.im.message.template.card.StickerTemplate;
import com.ss.android.ugc.aweme.im.message.template.component.BaseRequestComponent;
import com.ss.android.ugc.aweme.im.message.template.component.QueryDataComponent;
import com.ss.android.ugc.aweme.im.saas.host.api.legacy.IMLegacyBridgeApi;
import com.ss.android.ugc.aweme.im.sdk.common.controller.analytics.IMAnalyticsUtil;
import com.ss.android.ugc.aweme.im.service.analytics.IIMMessageAnalytics;
import com.ss.android.ugc.aweme.im.sticker.api.IMStickerApi;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes15.dex */
public final class IMMessageAnalytics implements IIMMessageAnalytics {
    public static final IMMessageAnalytics LIZIZ = new IMMessageAnalytics();

    public static final class Service implements IIMMessageAnalytics {
        public final /* synthetic */ IMMessageAnalytics LIZIZ = IMMessageAnalytics.LIZIZ;

        @Override // com.ss.android.ugc.aweme.im.service.analytics.IIMMessageAnalytics
        public final Object LIZ(long j, C869590Y9l c869590Y9l, C0ZCG c0zcg, InterfaceC1364105Vn interfaceC1364105Vn) {
            return this.LIZIZ.LIZ(j, c869590Y9l, c0zcg, interfaceC1364105Vn);
        }

        @Override // com.ss.android.ugc.aweme.im.service.analytics.IIMMessageAnalytics
        public final Object LIZIZ(C869590Y9l c869590Y9l, EnumC894220Z6e enumC894220Z6e, long j, C0ZCG c0zcg, InterfaceC1493105sv interfaceC1493105sv, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
            return this.LIZIZ.LIZIZ(c869590Y9l, enumC894220Z6e, j, c0zcg, interfaceC1493105sv, interfaceC1364105Vn);
        }

        @Override // com.ss.android.ugc.aweme.im.service.analytics.IIMMessageAnalytics
        public final void LIZJ(C869590Y9l c869590Y9l, Map map) throws JSONException {
            this.LIZIZ.LIZJ(c869590Y9l, map);
        }

        @Override // com.ss.android.ugc.aweme.im.service.analytics.IIMMessageAnalytics
        public final Object LIZLLL(JSONObject jSONObject, C869590Y9l c869590Y9l, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
            return this.LIZIZ.LIZLLL(jSONObject, c869590Y9l, interfaceC1364105Vn);
        }

        @Override // com.ss.android.ugc.aweme.im.service.analytics.IIMMessageAnalytics
        public final void LJ(C869590Y9l c869590Y9l) {
            this.LIZIZ.LJ(c869590Y9l);
        }

        @Override // com.ss.android.ugc.aweme.im.service.analytics.IIMMessageAnalytics
        public final void LJFF(C869590Y9l c869590Y9l, Map<String, String> map) {
            this.LIZIZ.LJFF(c869590Y9l, map);
        }

        @Override // com.ss.android.ugc.aweme.im.service.analytics.IIMMessageAnalytics
        public final Object LJI(C869590Y9l c869590Y9l, Map map, InterfaceC1364105Vn interfaceC1364105Vn) {
            return this.LIZIZ.LJI(c869590Y9l, map, interfaceC1364105Vn);
        }

        @Override // com.ss.android.ugc.aweme.im.service.analytics.IIMMessageAnalytics
        public final Object LJII(C869590Y9l c869590Y9l, C0ZCG c0zcg, boolean z, InterfaceC1364105Vn<? super Map<String, String>> interfaceC1364105Vn) {
            return this.LIZIZ.LJII(c869590Y9l, c0zcg, z, interfaceC1364105Vn);
        }

        @Override // com.ss.android.ugc.aweme.im.service.analytics.IIMMessageAnalytics
        public final String LJIIIIZZ(C869590Y9l c869590Y9l) {
            return this.LIZIZ.LJIIIIZZ(c869590Y9l);
        }

        @Override // com.ss.android.ugc.aweme.im.service.analytics.IIMMessageAnalytics
        public final void LJIIIZ(C869590Y9l c869590Y9l) {
            this.LIZIZ.LJIIIZ(c869590Y9l);
        }

        @Override // com.ss.android.ugc.aweme.im.service.analytics.IIMMessageAnalytics
        public final void LJIIJ(C869590Y9l c869590Y9l, int i, C0ZCG c0zcg, InterfaceC1493105sv interfaceC1493105sv) {
            this.LIZIZ.LJIIJ(c869590Y9l, i, c0zcg, interfaceC1493105sv);
        }
    }

    public static String LJIIL(C869590Y9l c869590Y9l) {
        String localExtValue = c869590Y9l.getLocalExtValue("enter_from");
        if (Intrinsics.LJFF(c869590Y9l.getLocalExt().get("message_type"), "ttFarm")) {
            return localExtValue;
        }
        String strLJIIJJI = LJIIJJI(c869590Y9l, "enter_from");
        if (strLJIIJJI != null) {
            return strLJIIJJI;
        }
        if (localExtValue == null) {
            return IMAnalyticsUtil.LJIIIZ("enter_from", null);
        }
        return localExtValue;
    }

    public static String LJIILIIL(C869590Y9l c869590Y9l) {
        Map<String, String> localExt = c869590Y9l.getLocalExt();
        if (localExt != null) {
            return localExt.get("interaction_name");
        }
        return null;
    }

    public static String LJIILJJIL(C869590Y9l c869590Y9l) {
        Map<String, String> localExt = c869590Y9l.getLocalExt();
        if (localExt != null) {
            return localExt.get("interaction_type");
        }
        return null;
    }

    public static String LJIILLIIL(C869590Y9l c869590Y9l) {
        return c869590Y9l.getLocalExt().get("resource_id");
    }

    public static boolean LJIIZILJ(C869590Y9l c869590Y9l) {
        ReferenceInfo referenceInfo = c869590Y9l.getReferenceInfo();
        Long l = null;
        if (referenceInfo != null && referenceInfo.sender != null) {
            String strLIZIZ = C461720I8s.LIZIZ();
            strLIZIZ.toString();
            Long lLJIILIIL = C2095008Iq.LJIILIIL(strLIZIZ);
            ReferenceInfo referenceInfo2 = c869590Y9l.getReferenceInfo();
            if (referenceInfo2 != null) {
                l = referenceInfo2.sender;
            }
            if (!Intrinsics.LJFF(lLJIILIIL, l)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public static String LJIJ(C869590Y9l c869590Y9l) {
        BaseRequestComponent baseRequestComponentRj;
        QueryDataComponent queryDataComponent;
        Map<String, String> map;
        String str;
        BaseTemplate baseTemplateLIZ = C0Z2Z.LIZ(c869590Y9l, BaseTemplate.class);
        if (baseTemplateLIZ != null && (baseRequestComponentRj = baseTemplateLIZ.rj()) != null && (queryDataComponent = baseRequestComponentRj.queryData) != null && (map = queryDataComponent.extras) != null && (str = map.get("a:sticker_type")) != null) {
            StickerTemplate stickerTemplate = (StickerTemplate) C0Z2Z.LIZ(c869590Y9l, StickerTemplate.class);
            boolean z = false;
            if (stickerTemplate != null) {
                int i = C0ZDX.LIZJ;
                int i2 = stickerTemplate.stickerVariant;
                StickerVariant.Companion.getClass();
                if (i2 == 2) {
                    z = true;
                }
            }
            if (!Intrinsics.LJFF(str, String.valueOf(EnumC451180Hme.ANIMATED.getType()))) {
                if (!Intrinsics.LJFF(str, String.valueOf(EnumC451180Hme.AISELF_STICKER.getType())) || !z) {
                    if (Intrinsics.LJFF(str, String.valueOf(EnumC451180Hme.AIMOJI_STICKER_STATIC.getType())) && z) {
                        return "1";
                    }
                    return CardStruct.IStatusCode.DEFAULT;
                }
                return "1";
            }
            return "1";
        }
        return null;
    }

    public static String LJIJJLI(Boolean bool) {
        if (Intrinsics.LJFF(bool, Boolean.TRUE)) {
            return "1";
        }
        return CardStruct.IStatusCode.DEFAULT;
    }

    @Override // com.ss.android.ugc.aweme.im.service.analytics.IIMMessageAnalytics
    public final void LJ(C869590Y9l c869590Y9l) {
        String str;
        boolean z;
        BaseRequestComponent baseRequestComponentRj;
        QueryDataComponent queryDataComponent;
        Map<String, String> map;
        C455900HuG c455900HuG = StickerSubType.Companion;
        BaseTemplate baseTemplateLIZ = C0Z2Z.LIZ(c869590Y9l, BaseTemplate.class);
        if (baseTemplateLIZ != null && (baseRequestComponentRj = baseTemplateLIZ.rj()) != null && (queryDataComponent = baseRequestComponentRj.queryData) != null && (map = queryDataComponent.extras) != null) {
            str = map.get("a:sticker_sub_type");
        } else {
            str = null;
        }
        c455900HuG.getClass();
        StickerSubType stickerSubTypeLIZ = C455900HuG.LIZ(str);
        StickerSubType stickerSubType = StickerSubType.CUSTOMIZED;
        boolean z2 = false;
        if (stickerSubTypeLIZ != stickerSubType && stickerSubTypeLIZ != StickerSubType.DEFAULT) {
            z = false;
        } else {
            z = true;
        }
        if (stickerSubTypeLIZ == stickerSubType) {
            z2 = true;
        }
        if (z) {
            InterfaceC453640Hqc imStickerAnalytics = IMStickerApi.LIZ.LIZIZ().getImStickerAnalytics();
            String conversationId = c869590Y9l.getConversationId();
            String strLJIIIIZZ = LJIIIIZZ(c869590Y9l);
            String strLJIIJJI = LJIIJJI(c869590Y9l, "a:sticker_creator_user_id");
            String str2 = "";
            if (strLJIIJJI == null) {
                strLJIIJJI = "";
            }
            String strLJIILJJIL = C0ZDX.LJIILJJIL(c869590Y9l);
            if (strLJIILJJIL != null) {
                str2 = strLJIILJJIL;
            }
            imStickerAnalytics.LJJII(Boolean.valueOf(z2), conversationId, strLJIIIIZZ, strLJIIJJI, str2, String.valueOf(C0YNP.LJII(c869590Y9l.getConversationId())));
        }
    }

    @Override // com.ss.android.ugc.aweme.im.service.analytics.IIMMessageAnalytics
    public final String LJIIIIZZ(C869590Y9l c869590Y9l) {
        C909290Zln c909290Zln;
        IMAnalyticsUtil.LIZIZ.getClass();
        SessionInfo sessionInfo = IMAnalyticsUtil.LJ;
        if ((sessionInfo instanceof C909290Zln) && (c909290Zln = (C909290Zln) sessionInfo) != null && c909290Zln.isTCM()) {
            return "tcm";
        }
        if (c869590Y9l.getConversationType() == AbstractC1711506n3.LIZIZ) {
            return C1229100i5c.LIZLLL(c869590Y9l.getConversationId());
        }
        if (C0YNP.LJI(c869590Y9l.getConversationId()) == 5) {
            return "aiasst";
        }
        return "private";
    }

    @Override // com.ss.android.ugc.aweme.im.service.analytics.IIMMessageAnalytics
    public final void LJIIIZ(C869590Y9l c869590Y9l) {
        if (c869590Y9l != null && c869590Y9l.getConversationType() == AbstractC1711506n3.LIZ) {
            List listLJJLIIIJILLIZJL = a0.LJJLIIIJILLIZJL(c869590Y9l.getConversationId(), new String[]{":"}, 0, 6);
            boolean zContains = listLJJLIIIJILLIZJL.contains(C461720I8s.LIZIZ());
            IEnsure iEnsure = C1AF0.LIZ;
            if (iEnsure != null) {
                iEnsure.ensureTrue(zContains, "Current user is not part of this conversation");
            }
            boolean zContains2 = listLJJLIIIJILLIZJL.contains(String.valueOf(c869590Y9l.getSender()));
            IEnsure iEnsure2 = C1AF0.LIZ;
            if (iEnsure2 != null) {
                iEnsure2.ensureTrue(zContains2, "SenderId is not part of this conversation");
            }
            boolean zLJFF = Intrinsics.LJFF(String.valueOf(c869590Y9l.getSender()), C461720I8s.LIZIZ());
            IEnsure iEnsure3 = C1AF0.LIZ;
            if (iEnsure3 != null) {
                iEnsure3.ensureTrue(zLJFF, "senderId is not current user");
            }
        }
    }

    public static String LJIIJJI(C869590Y9l c869590Y9l, String str) {
        BaseRequestComponent baseRequestComponentRj;
        QueryDataComponent queryDataComponent;
        Map<String, String> map;
        BaseTemplate baseTemplateLIZ = C0Z2Z.LIZ(c869590Y9l, BaseTemplate.class);
        if (baseTemplateLIZ != null && (baseRequestComponentRj = baseTemplateLIZ.rj()) != null && (queryDataComponent = baseRequestComponentRj.queryData) != null && (map = queryDataComponent.extras) != null) {
            return map.get(str);
        }
        return null;
    }

    public static String LJIJI(C0ZCG c0zcg, String str) {
        String strLIZIZ;
        IMUser iMUserLJ = c0zcg.LJ(str, null);
        if (iMUserLJ == null) {
            return "";
        }
        IMUser.Companion.getClass();
        User userLJII = C2201941BFw.LJII(iMUserLJ);
        IMLegacyBridgeApi.LIZ.getClass();
        IMLegacyBridgeApi value = C0ZCI.LIZIZ.getValue();
        if (value == null || (strLIZIZ = value.LIZIZ(userLJII)) == null) {
            return "";
        }
        return strLIZIZ;
    }

    public static void LJIL(C869590Y9l c869590Y9l, Map map) {
        String strLIZIZ;
        CharSequence charSequence = (CharSequence) map.get("sticker_id");
        if ((charSequence == null || charSequence.length() == 0) && (strLIZIZ = C453750Hqn.LIZIZ(c869590Y9l)) != null) {
            map.put("sticker_id", strLIZIZ);
        }
    }

    @Override // com.ss.android.ugc.aweme.im.service.analytics.IIMMessageAnalytics
    public final void LIZJ(C869590Y9l c869590Y9l, Map map) throws JSONException {
        TextContent textContent;
        List<RichTextInfo> richTextInfos;
        int linkCount;
        if (c869590Y9l.getMsgType() == EnumC868450Y5b.MESSAGE_TYPE_TEXT.getValue() || c869590Y9l.getMsgType() == EnumC868450Y5b.LEGACY_MESSAGE_TYPE_TEXT.getValue()) {
            BaseContent orParseJsonContent = BaseContentParserKt.getOrParseJsonContent(c869590Y9l, BaseContent.class);
            if ((orParseJsonContent instanceof TextContent) && (richTextInfos = (textContent = (TextContent) orParseJsonContent).getRichTextInfos()) != null && !richTextInfos.isEmpty() && (linkCount = textContent.getLinkCount()) > 0) {
                map.put("link_cnt", String.valueOf(linkCount));
                String linkStatus = textContent.getLinkStatus();
                if (C123100dR.LIZ(linkStatus)) {
                    map.put("link_status", linkStatus);
                }
                String linkType = textContent.getLinkType();
                if (C123100dR.LIZ(linkType)) {
                    map.put("link_type", linkType);
                }
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.im.service.analytics.IIMMessageAnalytics
    public final void LJFF(C869590Y9l c869590Y9l, Map<String, String> map) {
        String value;
        String str = c869590Y9l.getExt().get("a:system_share");
        if (str != null) {
            if (!Intrinsics.LJFF(str, "video_edit")) {
                value = "system_share";
            } else {
                value = EnumC1431810nMZ.MAIN_POSTING_CAMERA_ICON.getValue();
            }
            map.put("enter_method", value);
            map.put("system_share", str);
            map.put("is_shoot_upload", "1");
        }
    }

    public static String LJIILL(long j, C869590Y9l c869590Y9l, C0ZCG c0zcg) {
        IMUser iMUserLJ = c0zcg.LJ(String.valueOf(j), c0zcg.LIZ(c869590Y9l.getConversationId()));
        if (iMUserLJ != null && iMUserLJ.getFriendRecType() == 1) {
            return "share_link_match";
        }
        return "";
    }

    public static void LJIJJ(String str, String str2, Map map) {
        if (C866950Xzh.LIZ(str2)) {
            map.put(str, str2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0061  */
    @Override // com.ss.android.ugc.aweme.im.service.analytics.IIMMessageAnalytics
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZLLL(org.json.JSONObject r6, X.C869590Y9l r7, X.InterfaceC1364105Vn<? super kotlin.Unit> r8) throws org.json.JSONException {
        /*
            r5 = this;
            boolean r0 = r8 instanceof X.C0ZCR
            if (r0 == 0) goto L61
            r4 = r8
            X.0ZCR r4 = (X.C0ZCR) r4
            int r2 = r4.LLILZIL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L61
            int r2 = r2 - r1
            r4.LLILZIL = r2
        L12:
            java.lang.Object r3 = r4.LLILLL
            java.lang.Object r2 = X.C099R.LJFF()
            int r1 = r4.LLILZIL
            r0 = 1
            if (r1 == 0) goto L4c
            if (r1 != r0) goto L6a
            java.lang.Object r1 = r4.LLILLJJLI
            java.util.Map r1 = (java.util.Map) r1
            java.lang.Object r6 = r4.LL
            org.json.JSONObject r6 = (org.json.JSONObject) r6
            X.C155000ia.LIZIZ(r3)
        L2a:
            java.util.Set r0 = r1.entrySet()
            java.util.Iterator r2 = r0.iterator()
        L32:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L67
            java.lang.Object r0 = r2.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r1 = r0.getKey()
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r0 = r0.getValue()
            r6.put(r1, r0)
            goto L32
        L4c:
            X.C155000ia.LIZIZ(r3)
            java.util.LinkedHashMap r1 = new java.util.LinkedHashMap
            r1.<init>()
            r4.LL = r6
            r4.LLILLJJLI = r1
            r4.LLILZIL = r0
            java.lang.Object r0 = r5.LJI(r7, r1, r4)
            if (r0 != r2) goto L2a
            return r2
        L61:
            X.0ZCR r4 = new X.0ZCR
            r4.<init>(r5, r8)
            goto L12
        L67:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L6a:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.im.sdk.chat.analytics.IMMessageAnalytics.LIZLLL(org.json.JSONObject, X.0Y9l, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:57:0x0114  */
    @Override // com.ss.android.ugc.aweme.im.service.analytics.IIMMessageAnalytics
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJI(X.C869590Y9l r10, java.util.Map r11, X.InterfaceC1364105Vn r12) {
        /*
            Method dump skipped, instruction units count: 291
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.im.sdk.chat.analytics.IMMessageAnalytics.LJI(X.0Y9l, java.util.Map, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:455:0x0926  */
    @Override // com.ss.android.ugc.aweme.im.service.analytics.IIMMessageAnalytics
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZ(long r31, X.C869590Y9l r33, X.C0ZCG r34, X.InterfaceC1364105Vn r35) {
        /*
            Method dump skipped, instruction units count: 2954
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.im.sdk.chat.analytics.IMMessageAnalytics.LIZ(long, X.0Y9l, X.0ZCG, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0299  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0334  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x033e  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0341  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0370  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x03a4  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x03ad  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x040e  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x0454  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x046f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x0492  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x0495  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x04a6  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x04c5  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x04ce  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0189 A[LOOP:0: B:69:0x0183->B:71:0x0189, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01d4  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01d7  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01da  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01dd  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01e0  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01e3  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01e6  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x01e9  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01ec  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x01ef  */
    @Override // com.ss.android.ugc.aweme.im.service.analytics.IIMMessageAnalytics
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJII(X.C869590Y9l r17, X.C0ZCG r18, boolean r19, X.InterfaceC1364105Vn<? super java.util.Map<java.lang.String, java.lang.String>> r20) {
        /*
            Method dump skipped, instruction units count: 1270
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.im.sdk.chat.analytics.IMMessageAnalytics.LJII(X.0Y9l, X.0ZCG, boolean, X.05Vn):java.lang.Object");
    }

    @Override // com.ss.android.ugc.aweme.im.service.analytics.IIMMessageAnalytics
    public final void LJIIJ(C869590Y9l c869590Y9l, int i, C0ZCG c0zcg, InterfaceC1493105sv interfaceC1493105sv) {
        C23250099c.LIZLLL(C817503Hh.LL, null, null, new C0Z48(c869590Y9l, c0zcg, i, interfaceC1493105sv, null), 3);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(108:0|2|(2:4|(1:6)(1:279))(0)|7|(1:(1:(16:11|12|(1:14)(1:49)|15|(1:19)|20|(1:22)|23|(1:48)(1:27)|(1:37)(3:33|(1:35)|(0))|38|(2:40|(1:42))|43|(1:45)|46|47)(2:280|281))(1:57))(4:50|(1:52)(1:56)|53|(1:55))|58|(3:60|(2:62|(1:(1:105)(1:67)))(1:106)|(1:69)(2:93|(3:95|(1:97)(1:104)|(1:103))))|70|(1:72)|73|(1:75)|76|(1:78)|(3:80|(1:82)(1:92)|83)|84|(3:88|(2:91|89)|284)|107|(1:111)|112|(1:116)|282|117|(1:119)|120|123|(1:125)|126|(1:128)(1:277)|129|(1:(2:274|(1:276))(1:273))(1:133)|134|(1:136)|137|(1:139)|140|(1:142)|143|(2:(1:146)(1:269)|(1:148))|149|(1:151)|152|(1:154)|155|(1:157)|158|(1:160)|161|(1:163)|164|(1:166)|167|(1:169)|170|(1:172)|173|(1:175)|176|(1:178)|179|(1:181)|182|(1:184)|185|(1:187)|188|(1:190)|191|(1:193)|194|(1:196)|197|(1:199)|200|(1:202)|203|(1:205)|206|(1:208)|209|(1:211)|212|(1:214)|215|(1:217)|218|(1:220)|221|(1:223)|224|(1:226)(1:268)|(1:267)(1:230)|231|(7:266|239|(4:241|(3:243|(1:245)|(4:247|(1:262)(1:251)|(1:253)(1:261)|254))(1:263)|264|(0))|255|(1:257)|258|(1:260)(1:278))(10:233|(1:235)(1:265)|236|(1:238)(0)|239|(0)|255|(0)|258|(0)(0))|12|(0)(0)|15|(2:17|19)|20|(0)|23|(2:25|48)(0)|(2:29|37)(0)|38|(0)|43|(0)|46|47) */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x0286, code lost:
    
        r1 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x0287, code lost:
    
        com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r1);
        X.C189200o6.m2constructorimpl(new X.C098200Yq(r1));
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x0566  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x0578  */
    /* JADX WARN: Removed duplicated region for block: B:257:0x0597  */
    /* JADX WARN: Removed duplicated region for block: B:260:0x05b8 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:266:0x05c3  */
    /* JADX WARN: Removed duplicated region for block: B:278:0x05f1  */
    /* JADX WARN: Removed duplicated region for block: B:279:0x05f4  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00ea  */
    @Override // com.ss.android.ugc.aweme.im.service.analytics.IIMMessageAnalytics
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZIZ(X.C869590Y9l r24, X.EnumC894220Z6e r25, long r26, X.C0ZCG r28, X.InterfaceC1493105sv r29, X.InterfaceC1364105Vn<? super kotlin.Unit> r30) {
        /*
            Method dump skipped, instruction units count: 1541
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.im.sdk.chat.analytics.IMMessageAnalytics.LIZIZ(X.0Y9l, X.0Z6e, long, X.0ZCG, X.05sv, X.05Vn):java.lang.Object");
    }
}
