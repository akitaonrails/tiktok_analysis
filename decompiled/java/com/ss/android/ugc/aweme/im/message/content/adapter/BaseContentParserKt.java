package com.ss.android.ugc.aweme.im.message.content.adapter;

import X.C051M;
import X.C0YUT;
import X.C0ZDX;
import X.C1AF0;
import X.C869590Y9l;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.im.core.proto.ReferenceInfo;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.exp.DMInboxChangeRightZoneClickableSizeExp;
import com.ss.android.ugc.aweme.im.common.model.ReferenceInfoHint;
import com.ss.android.ugc.aweme.im.message.content.BaseContent;
import com.ss.android.ugc.aweme.im.message.content.BrandInvitationContent;
import com.ss.android.ugc.aweme.im.message.content.ChatIntroCardMsgContent;
import com.ss.android.ugc.aweme.im.message.content.CommentContent;
import com.ss.android.ugc.aweme.im.message.content.GifContent;
import com.ss.android.ugc.aweme.im.message.content.GroupInviteCardContent;
import com.ss.android.ugc.aweme.im.message.content.GroupSystemContent;
import com.ss.android.ugc.aweme.im.message.content.PhotoCommentStickerContent;
import com.ss.android.ugc.aweme.im.message.content.SayHelloContent;
import com.ss.android.ugc.aweme.im.message.content.ShareAwemeContent;
import com.ss.android.ugc.aweme.im.message.content.ShareChallengeContent;
import com.ss.android.ugc.aweme.im.message.content.ShareCompilationContent;
import com.ss.android.ugc.aweme.im.message.content.ShareEffectContent;
import com.ss.android.ugc.aweme.im.message.content.ShareLiveContent;
import com.ss.android.ugc.aweme.im.message.content.ShareLiveEventContent;
import com.ss.android.ugc.aweme.im.message.content.ShareMusicContent;
import com.ss.android.ugc.aweme.im.message.content.ShareProductContent;
import com.ss.android.ugc.aweme.im.message.content.ShareQnAContent;
import com.ss.android.ugc.aweme.im.message.content.ShareSearchContent;
import com.ss.android.ugc.aweme.im.message.content.ShareStoryContent;
import com.ss.android.ugc.aweme.im.message.content.ShareSubOnlyVideoContent;
import com.ss.android.ugc.aweme.im.message.content.ShareSubscribeInviteContent;
import com.ss.android.ugc.aweme.im.message.content.ShareUserContent;
import com.ss.android.ugc.aweme.im.message.content.ShareWebContent;
import com.ss.android.ugc.aweme.im.message.content.SuggestedReplyData;
import com.ss.android.ugc.aweme.im.message.content.SystemCardContent;
import com.ss.android.ugc.aweme.im.message.content.SystemContent;
import com.ss.android.ugc.aweme.im.message.content.TextContent;
import com.tts.oecverify.BdTuring;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes15.dex */
public final class BaseContentParserKt {
    public static final <Content extends BaseContent> Content getOrParseJsonContent(C869590Y9l c869590Y9l) {
        Intrinsics.LJIILIIL();
        throw null;
    }

    public static final BaseContent.ReferenceVideo getReferenceVideo(C869590Y9l c869590Y9l) {
        BaseContent orParseJsonContent = getOrParseJsonContent(c869590Y9l, BaseContent.class);
        if (orParseJsonContent != null) {
            return orParseJsonContent.getRefVideo();
        }
        return null;
    }

    public static final boolean isJsonContentInvalid(C869590Y9l c869590Y9l) {
        String content = c869590Y9l.getContent();
        if (content != null && content.length() != 0 && !Intrinsics.LJFF(c869590Y9l.getContent(), "{}") && !Intrinsics.LJFF(c869590Y9l.getContent(), "{\"hack\":\"1\"}")) {
            return false;
        }
        return true;
    }

    public static final BaseContent getContentByMsgType(String str, int i) {
        try {
            switch (i) {
                case 1:
                    return parse(str, SystemContent.class);
                case 5:
                    return parse(str, GifContent.class);
                case 7:
                    return parse(str, TextContent.class);
                case 8:
                    return parse(str, ShareAwemeContent.class);
                case BdTuring.TYPE_EMAIL /* 11 */:
                    return parse(str, ShareSubOnlyVideoContent.class);
                case 15:
                    return new SayHelloContent(null, null, null, null);
                case 16:
                    return parse(str, CommentContent.class);
                case 19:
                    return parse(str, ShareChallengeContent.class);
                case 21:
                    return parse(str, ShareLiveContent.class);
                case 22:
                    return parse(str, ShareMusicContent.class);
                case 25:
                    return parse(str, ShareUserContent.class);
                case 26:
                    return parse(str, ShareWebContent.class);
                case LiveToolbarIconStyleSetting.GRAY_WITHOUT_TEXT /* 33 */:
                    return parse(str, ShareQnAContent.class);
                case 40:
                    return parse(str, CommentContent.class);
                case 43:
                    return parse(str, ShareProductContent.class);
                case DMInboxChangeRightZoneClickableSizeExp.NEW_DP_SIZE /* 72 */:
                    return parse(str, ShareEffectContent.class);
                case 81:
                    return parse(str, ShareCompilationContent.class);
                case 1021:
                    return parse(str, ShareLiveContent.class);
                case 1025:
                    return parse(str, ShareStoryContent.class);
                case 1031:
                    return parse(str, GroupSystemContent.class);
                case 1032:
                    return parse(str, SystemCardContent.class);
                case 1033:
                    return parse(str, GroupInviteCardContent.class);
                case 1034:
                    return parse(str, ShareLiveEventContent.class);
                case 1036:
                    return parse(str, ShareSearchContent.class);
                case 1037:
                    return parse(str, BrandInvitationContent.class);
                case 1038:
                    return parse(str, ShareSubscribeInviteContent.class);
                case 1041:
                    return parse(str, SuggestedReplyData.class);
                case 4074:
                    return parse(str, ChatIntroCardMsgContent.class);
                case 4075:
                    return parse(str, PhotoCommentStickerContent.class);
                default:
                    return null;
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C1AF0.LJ(e);
            return null;
        }
    }

    public static final <Content extends BaseContent> Content getOrParseJsonContent(C869590Y9l c869590Y9l, Class<Content> cls) {
        if (C0ZDX.LJJJJLI(c869590Y9l)) {
            return null;
        }
        Object localCache = c869590Y9l.getLocalCache(501);
        if (cls.isInstance(localCache)) {
            return cls.cast(localCache);
        }
        BaseContent content = getContent(c869590Y9l, c869590Y9l.getContent(), c869590Y9l.getMsgType());
        if (content != null) {
            c869590Y9l.putLocalCache(501, content);
        } else {
            content = null;
        }
        if (!cls.isInstance(content)) {
            return null;
        }
        return cls.cast(content);
    }

    public static final BaseContent getOrParseJsonContentOfRefMsg(C869590Y9l c869590Y9l, int i) {
        C0YUT c0yut;
        ReferenceInfo referenceInfo;
        Long l;
        BaseContent jsonContent;
        BaseContent baseContent;
        ReferenceInfo referenceInfo2 = c869590Y9l.getReferenceInfo();
        if (referenceInfo2 == null || (c0yut = referenceInfo2.referenced_message_status) == null || c0yut == C0YUT.RECALLED || c0yut == C0YUT.NOT_EXIST || (referenceInfo = c869590Y9l.getReferenceInfo()) == null || (l = referenceInfo.ref_message_type) == null || i != ((int) l.longValue())) {
            return null;
        }
        Object localCache = c869590Y9l.getLocalCache(503);
        if ((localCache instanceof BaseContent) && (baseContent = (BaseContent) localCache) != null) {
            return baseContent;
        }
        ReferenceInfoHint referenceInfoHintLJIIIZ = C0ZDX.LJIIIZ(c869590Y9l);
        if (referenceInfoHintLJIIIZ == null) {
            return null;
        }
        String content = referenceInfoHintLJIIIZ.getContent();
        if (content.length() > 0 && (jsonContent = parseJsonContent(c869590Y9l, content, referenceInfoHintLJIIIZ.getRefmsg_type())) != null) {
            c869590Y9l.putLocalCache(503, jsonContent);
            return jsonContent;
        }
        return null;
    }

    public static final <T extends BaseContent> T parse(String str, Class<T> cls) {
        T t;
        try {
            t = (T) C051M.LIZIZ(cls, str);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C1AF0.LJ(e);
        }
        if (t == null) {
            return null;
        }
        return t;
    }

    public static final BaseContent getContent(C869590Y9l c869590Y9l, String str, int i) {
        if (!C0ZDX.LJJJJZ(c869590Y9l) && c869590Y9l.getMessageStatus() != C0YUT.RECALLED && str != null && !Intrinsics.LJFF(str, "")) {
            return getContentByMsgType(str, i);
        }
        return null;
    }

    public static final <Content extends BaseContent> Content parseJsonContent(C869590Y9l c869590Y9l, String str, int i) {
        Content content = (Content) getContent(c869590Y9l, str, i);
        if (!(content instanceof BaseContent)) {
            return null;
        }
        return content;
    }
}
