package com.ss.android.ugc.aweme.im.service.analytics;

import X.C098200Yq;
import X.C09EF;
import X.C0YC6;
import X.C0Z2Z;
import X.C0Z9X;
import X.C0ZCW;
import X.C0ZDX;
import X.C13BV;
import X.C13DA;
import X.C13LP;
import X.C1697810uHb;
import X.C189200o6;
import X.C2095008Iq;
import X.C2097608Jq;
import X.C814420VxA;
import X.C869590Y9l;
import X.C905470Zfd;
import X.C905500Zfg;
import com.bytedance.im.core.proto.MediaURLStruct;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import com.ss.android.ugc.aweme.ext.feed.DMVideoModel;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.im.lightinteract.api.platform.service.ILightInteractionPlatformService;
import com.ss.android.ugc.aweme.im.message.content.BaseContent;
import com.ss.android.ugc.aweme.im.message.content.ShareAwemeContent;
import com.ss.android.ugc.aweme.im.message.content.adapter.BaseContentParserKt;
import com.ss.android.ugc.aweme.im.message.template.card.VoiceMessageTemplate;
import com.ss.android.ugc.aweme.im.message.template.component.VoiceMessageAudioWaveComponent;
import com.ss.android.ugc.aweme.im.saas.host.api.feature.story.StoryFeature;
import com.ss.android.ugc.aweme.im.sticker.api.IMStickerApi;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import okio.ByteString;

/* JADX INFO: loaded from: classes15.dex */
public final class MessageAnalyticsUtils implements IMessageAnalyticsUtils {
    @Override // com.ss.android.ugc.aweme.im.service.analytics.IMessageAnalyticsUtils
    public final Map<String, String> LIZ(C869590Y9l c869590Y9l) {
        if (c869590Y9l.getPersistentExtra() != null && !Intrinsics.LJFF(c869590Y9l.getPersistentExtra(), ByteString.EMPTY)) {
            try {
                C905500Zfg c905500Zfg = C905470Zfd.ADAPTER.decode(c869590Y9l.getPersistentExtra()).b2c_info;
                C13DA c13da = new C13DA();
                String str = c905500Zfg.business_source;
                if (str != null) {
                }
                String str2 = c905500Zfg.business_scenario;
                if (str2 != null) {
                    c13da.put("business_scenario", str2);
                }
                return c13da.build();
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                return C2097608Jq.LJ();
            }
        }
        return C2097608Jq.LJ();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0050 A[ORIG_RETURN, RETURN] */
    @Override // com.ss.android.ugc.aweme.im.service.analytics.IMessageAnalyticsUtils
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String LJ(X.C869590Y9l r6) {
        /*
            Method dump skipped, instruction units count: 382
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.im.service.analytics.MessageAnalyticsUtils.LJ(X.0Y9l):java.lang.String");
    }

    @Override // com.ss.android.ugc.aweme.im.service.analytics.IMessageAnalyticsUtils
    public final String LJFF(C869590Y9l c869590Y9l) {
        boolean z;
        String strLJIIL;
        String str;
        String scene = c869590Y9l.getScene();
        StoryFeature storyFeatureLIZ = StoryFeature.LIZ.LIZ();
        if (storyFeatureLIZ != null && storyFeatureLIZ.LIZIZ(c869590Y9l)) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            C0ZCW.LIZ.getClass();
            if (C0ZDX.LJIJ(c869590Y9l)) {
                return "aimoji";
            }
            if (C0ZDX.LJJJJIZL(c869590Y9l)) {
                return "share_story";
            }
            return "story_replied";
        }
        if (ShareAwemeContent.Companion.isEncourageMufInteractionMsg(c869590Y9l)) {
            Map<String, String> ext = c869590Y9l.getExt();
            if (ext == null || (str = ext.get("a:src")) == null) {
                return "";
            }
            return str;
        }
        Map<String, String> ext2 = c869590Y9l.getExt();
        String str2 = null;
        if (ext2 != null) {
            str2 = ext2.get("a:src");
        }
        if (Intrinsics.LJFF(str2, "add_story_to_story")) {
            return "add_story_to_story";
        }
        C0Z9X c0z9x = (C0Z9X) PluggableExtentionKt.pluggableSpiForReal(ILightInteractionPlatformService.class);
        if (c0z9x != null && (strLJIIL = c0z9x.LJIIL(c869590Y9l)) != null) {
            return strLJIIL;
        }
        if (C0ZDX.LJJJJLI(c869590Y9l)) {
            C0ZCW.LIZ.getClass();
            String strLIZJ = C0ZCW.LIZJ(c869590Y9l);
            if (strLIZJ == null) {
                if (IMStickerApi.LIZ.LIZIZ().getImSocialAvatarService().LJJI(scene)) {
                    return "aimoji";
                }
                if (Intrinsics.LJFF(scene, "share_video_system")) {
                    return "private_video";
                }
                if (Intrinsics.LJFF(scene, "share_image_system")) {
                    return "private_image";
                }
                if (c869590Y9l.getMsgType() == 1805) {
                    String strLIZLLL = C0ZCW.LIZLLL(c869590Y9l);
                    if (strLIZLLL != null) {
                        return strLIZLLL;
                    }
                } else if (scene != null && scene.length() != 0) {
                    return scene;
                }
            } else {
                return strLIZJ;
            }
        }
        int msgType = c869590Y9l.getMsgType();
        if (msgType != 8 && msgType != 11) {
            return LJ(c869590Y9l);
        }
        C0ZCW.LIZ.getClass();
        String strLIZJ2 = C0ZCW.LIZJ(c869590Y9l);
        if (strLIZJ2 != null) {
            return strLIZJ2;
        }
        return "share_video";
    }

    @Override // com.ss.android.ugc.aweme.im.service.analytics.IMessageAnalyticsUtils
    public final int LJI(C869590Y9l c869590Y9l) {
        Object c098200Yq;
        BaseContent orParseJsonContent = BaseContentParserKt.getOrParseJsonContent(c869590Y9l, BaseContent.class);
        if (orParseJsonContent != null) {
            return orParseJsonContent.type;
        }
        Object obj = null;
        try {
            String str = C09EF.LIZIZ(c869590Y9l.getContent()).get("aweType");
            if (str != null) {
                c098200Yq = C2095008Iq.LJIIJJI(str);
            } else {
                c098200Yq = null;
            }
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (!C189200o6.m7isFailureimpl(c098200Yq)) {
            obj = c098200Yq;
        }
        Integer num = (Integer) obj;
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }

    @Override // com.ss.android.ugc.aweme.im.service.analytics.IMessageAnalyticsUtils
    public final List<Pair<String, String>> LJIIIZ(C869590Y9l c869590Y9l) {
        Integer numValueOf;
        DMVideoModel dMVideoModel;
        String str;
        C0YC6 c0yc6;
        MediaURLStruct mediaURLStruct;
        C0YC6 c0yc62;
        MediaURLStruct mediaURLStruct2;
        Long l;
        if (c869590Y9l.getMsgType() == 1813) {
            VoiceMessageTemplate voiceMessageTemplate = (VoiceMessageTemplate) C0Z2Z.LIZ(c869590Y9l, VoiceMessageTemplate.class);
            if (voiceMessageTemplate == null) {
                return C13BV.INSTANCE;
            }
            List<C0YC6> attachments = c869590Y9l.getAttachments();
            Integer numValueOf2 = null;
            if (attachments != null && (c0yc62 = (C0YC6) C13LP.LJJLIIIJL(attachments)) != null && (mediaURLStruct2 = c0yc62.mediaUrlStruct) != null && (l = mediaURLStruct2.duration) != null) {
                numValueOf = Integer.valueOf(C814420VxA.LIZIZ(l.longValue() / 1000.0f));
            } else {
                numValueOf = null;
            }
            if (numValueOf == null) {
                try {
                    Gson gson = C09EF.LIZ;
                    List<C0YC6> attachments2 = c869590Y9l.getAttachments();
                    if (attachments2 != null && (c0yc6 = (C0YC6) C13LP.LJJLIIIJL(attachments2)) != null && (mediaURLStruct = c0yc6.mediaUrlStruct) != null) {
                        str = mediaURLStruct.video_model;
                    } else {
                        str = null;
                    }
                    dMVideoModel = (DMVideoModel) gson.LJII(str, DMVideoModel.class);
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    dMVideoModel = null;
                }
                if (dMVideoModel != null) {
                    numValueOf2 = Integer.valueOf(C814420VxA.LIZ(dMVideoModel.vidDuration));
                }
                numValueOf = numValueOf2;
            }
            if (numValueOf == null) {
                VoiceMessageAudioWaveComponent voiceMessageAudioWaveComponent = voiceMessageTemplate.audioWaveComponent;
                if (voiceMessageAudioWaveComponent.sampleRate > 0.0f) {
                    numValueOf = Integer.valueOf(C814420VxA.LIZIZ(voiceMessageAudioWaveComponent.volumeLevels.size() / voiceMessageAudioWaveComponent.sampleRate));
                } else {
                    numValueOf = 0;
                }
            }
            return C1697810uHb.LJIIJJI(new Pair("message_type", "voice_message"), new Pair("voice_duration", numValueOf.toString()));
        }
        return C13BV.INSTANCE;
    }

    @Override // com.ss.android.ugc.aweme.im.service.analytics.IMessageAnalyticsUtils
    public final Map LJII(C869590Y9l c869590Y9l, Map map) {
        String strLIZLLL;
        String str = c869590Y9l.getLocalExt().get("story_theme");
        if (str != null) {
            map.put("story_theme", str);
        }
        String str2 = c869590Y9l.getLocalExt().get("is_note");
        if (str2 != null) {
            map.put("is_note", str2);
        }
        String str3 = c869590Y9l.getLocalExt().get("is_note");
        if (str3 != null) {
            map.put("is_note", str3);
            if (!Intrinsics.LJFF(str3, CardStruct.IStatusCode.DEFAULT)) {
                StoryFeature storyFeatureLIZ = StoryFeature.LIZ.LIZ();
                if (storyFeatureLIZ != null) {
                    strLIZLLL = storyFeatureLIZ.LIZLLL();
                } else {
                    strLIZLLL = null;
                }
                map.put("if_show_quick_emojis", strLIZLLL);
                map.put("thought_text_type", c869590Y9l.getLocalExt().get("thought_text_type"));
            }
        }
        String str4 = c869590Y9l.getLocalExt().get("has_gif");
        if (str4 != null) {
            map.put("has_gif", str4);
        }
        String str5 = c869590Y9l.getLocalExt().get("is_avatar_thought");
        if (str5 != null) {
            map.put("is_avatar_thought", str5);
        }
        String str6 = c869590Y9l.getLocalExt().get("aweme_type");
        if (str6 != null) {
            map.put("aweme_type", str6);
        }
        String str7 = c869590Y9l.getLocalExt().get("has_friends_tag");
        if (str7 != null) {
            map.put("has_friends_tag", str7);
        }
        String str8 = c869590Y9l.getLocalExt().get("is_add_story_highlight");
        if (str8 != null) {
            map.put("is_add_story_highlight", str8);
        }
        String str9 = c869590Y9l.getLocalExt().get("is_highlight_immersive_flow");
        if (str9 != null) {
            map.put("is_highlight_immersive_flow", str9);
        }
        String str10 = c869590Y9l.getLocalExt().get("is_share_to_story");
        if (str10 != null) {
            map.put("is_share_to_story", str10);
            if (!Intrinsics.LJFF(str10, CardStruct.IStatusCode.DEFAULT)) {
                String str11 = c869590Y9l.getLocalExt().get("mention_nums");
                if (str11 != null) {
                    map.put("mention_nums", str11);
                }
                String str12 = c869590Y9l.getLocalExt().get("share_to_story_type");
                if (str12 != null) {
                    map.put("share_to_story_type", str12);
                }
                String str13 = c869590Y9l.getLocalExt().get("share_to_story_media_type");
                if (str13 != null) {
                    map.put("share_to_story_media_type", str13);
                }
                String str14 = c869590Y9l.getLocalExt().get("is_own_video");
                if (str14 != null) {
                    map.put("is_own_video", str14);
                }
                String str15 = c869590Y9l.getLocalExt().get("is_mention");
                if (str15 != null) {
                    map.put("is_mention", str15);
                }
            }
        } else {
            map.put("is_share_to_story", CardStruct.IStatusCode.DEFAULT);
        }
        String str16 = c869590Y9l.getLocalExt().get("story_reveal_status");
        if (str16 != null) {
            map.put("story_reveal_status", str16);
        }
        String str17 = c869590Y9l.getLocalExt().get("is_centralized_avatar");
        if (str17 != null) {
            map.put("is_centralized_avatar", str17);
        }
        return map;
    }

    /* JADX WARN: Removed duplicated region for block: B:152:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0073  */
    @Override // com.ss.android.ugc.aweme.im.service.analytics.IMessageAnalyticsUtils
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C892320YzW LJIIIIZZ(X.C869590Y9l r10, com.ss.android.ugc.aweme.im.message.content.BaseContent r11) {
        /*
            Method dump skipped, instruction units count: 456
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.im.service.analytics.MessageAnalyticsUtils.LJIIIIZZ(X.0Y9l, com.ss.android.ugc.aweme.im.message.content.BaseContent):X.0YzW");
    }
}
