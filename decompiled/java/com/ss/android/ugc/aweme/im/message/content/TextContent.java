package com.ss.android.ugc.aweme.im.message.content;

import X.C09CT;
import X.C09EF;
import X.C0I1M;
import X.C2095008Iq;
import X.C2188811AlT;
import X.C786410Ut5;
import com.bytedance.ies.im.core.api.model.RichTextInfo;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.feed.model.story.Story;
import com.ss.android.ugc.aweme.im.message.content.BaseContent;
import com.ss.android.ugc.aweme.im.message.content.utils.SlimContent;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.unifiedauthapi.experiment.OppoPermissionPopupMaskDelayExp;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes15.dex */
public final class TextContent extends BaseContent implements SlimContent {
    public static final Companion Companion = new Companion();

    @C09CT("attachment")
    public final FeatureAttachmentContent attachment;

    @C09CT("header")
    public final BaseHeader header;

    @C09CT("rich_text_infos")
    public final List<RichTextInfo> richTextInfos;

    @C09CT("text")
    public final String text;

    public TextContent() {
        this(null, null, null, null);
    }

    public static final TextContent obtain(TextContent textContent) {
        return Companion.obtain(textContent);
    }

    public static final TextContent obtain(String str) {
        return Companion.obtain(str);
    }

    public static final TextContent obtain(String str, Aweme aweme) {
        return Companion.obtain(str, aweme);
    }

    public static final TextContent obtain(String str, Aweme aweme, List<RichTextInfo> list) {
        return Companion.obtain(str, aweme, list);
    }

    public static final TextContent obtain(String str, Aweme aweme, List<RichTextInfo> list, BaseContent.ReferenceSceneType referenceSceneType) {
        return Companion.obtain(str, aweme, list, referenceSceneType);
    }

    public static final TextContent obtain(String str, Aweme aweme, List<RichTextInfo> list, BaseContent.ReferenceSceneType referenceSceneType, FeatureAttachmentContent featureAttachmentContent) {
        return Companion.obtain(str, aweme, list, referenceSceneType, featureAttachmentContent);
    }

    public static final TextContent obtain(String str, Aweme aweme, List<RichTextInfo> list, BaseContent.ReferenceSceneType referenceSceneType, FeatureAttachmentContent featureAttachmentContent, BaseHeader baseHeader) {
        return Companion.obtain(str, aweme, list, referenceSceneType, featureAttachmentContent, baseHeader);
    }

    public static final TextContent obtainShareReplyContent(String str, User user) {
        return Companion.obtainShareReplyContent(str, user);
    }

    public static final TextContent obtainShareReplyContent(String str, User user, Aweme aweme) {
        return Companion.obtainShareReplyContent(str, user, aweme);
    }

    public static final TextContent obtainShareReplyContent(String str, User user, Aweme aweme, BaseContent.ReferenceSceneType referenceSceneType) {
        return Companion.obtainShareReplyContent(str, user, aweme, referenceSceneType);
    }

    public static final TextContent obtainShareReplyContent(String str, String str2, String str3) {
        return Companion.obtainShareReplyContent(str, str2, str3);
    }

    public static final TextContent obtainShareReplyContent(String str, String str2, String str3, Aweme aweme) {
        return Companion.obtainShareReplyContent(str, str2, str3, aweme);
    }

    public static final TextContent obtainShareReplyContent(String str, String str2, String str3, Aweme aweme, BaseContent.ReferenceSceneType referenceSceneType) {
        return Companion.obtainShareReplyContent(str, str2, str3, aweme, referenceSceneType);
    }

    public static final TextContent obtainShareReplyContent(String str, String str2, String str3, Aweme aweme, BaseContent.ReferenceSceneType referenceSceneType, FeatureAttachmentContent featureAttachmentContent) {
        return Companion.obtainShareReplyContent(str, str2, str3, aweme, referenceSceneType, featureAttachmentContent);
    }

    public static final TextContent obtainShareReplyContent(String str, String str2, String str3, Aweme aweme, BaseContent.ReferenceSceneType referenceSceneType, FeatureAttachmentContent featureAttachmentContent, BaseHeader baseHeader) {
        return Companion.obtainShareReplyContent(str, str2, str3, aweme, referenceSceneType, featureAttachmentContent, baseHeader);
    }

    public final TextContent copy(String str, List<RichTextInfo> list, FeatureAttachmentContent featureAttachmentContent, BaseHeader baseHeader) {
        return new TextContent(str, list, featureAttachmentContent, baseHeader);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TextContent)) {
            return false;
        }
        TextContent textContent = (TextContent) obj;
        return Intrinsics.LJFF(this.text, textContent.text) && Intrinsics.LJFF(this.richTextInfos, textContent.richTextInfos) && Intrinsics.LJFF(this.attachment, textContent.attachment) && Intrinsics.LJFF(this.header, textContent.header);
    }

    public int hashCode() {
        String str = this.text;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        List<RichTextInfo> list = this.richTextInfos;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        FeatureAttachmentContent featureAttachmentContent = this.attachment;
        int iHashCode3 = (iHashCode2 + (featureAttachmentContent == null ? 0 : featureAttachmentContent.hashCode())) * 31;
        BaseHeader baseHeader = this.header;
        return iHashCode3 + (baseHeader != null ? baseHeader.hashCode() : 0);
    }

    @Override // com.ss.android.ugc.aweme.im.message.content.BaseContent
    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TextContent(text=");
        sbLIZ.append(this.text);
        sbLIZ.append(", richTextInfos=");
        sbLIZ.append(this.richTextInfos);
        sbLIZ.append(", attachment=");
        sbLIZ.append(this.attachment);
        sbLIZ.append(", header=");
        sbLIZ.append(this.header);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final int getLinkCount() {
        List<RichTextInfo> list = this.richTextInfos;
        if (list == null) {
            return 0;
        }
        ArrayList arrayList = new ArrayList();
        for (RichTextInfo richTextInfo : list) {
            RichTextInfo richTextInfo2 = richTextInfo;
            if (richTextInfo2.type == C0I1M.EXTERNAL_LINK.getValue() || richTextInfo2.type == C0I1M.ROUTER_HYPER_LINK.getValue()) {
                arrayList.add(richTextInfo);
            }
        }
        return arrayList.size();
    }

    public final String getLinkStatus() throws JSONException {
        List<RichTextInfo> list = this.richTextInfos;
        if (list == null) {
            return "";
        }
        ArrayList<RichTextInfo> arrayList = new ArrayList();
        for (RichTextInfo richTextInfo : list) {
            RichTextInfo richTextInfo2 = richTextInfo;
            if (richTextInfo2.type == C0I1M.EXTERNAL_LINK.getValue() || richTextInfo2.type == C0I1M.ROUTER_HYPER_LINK.getValue()) {
                arrayList.add(richTextInfo);
            }
        }
        if (arrayList.isEmpty()) {
            return "";
        }
        JSONObject jSONObject = new JSONObject();
        for (RichTextInfo richTextInfo3 : arrayList) {
            String str = richTextInfo3.link;
            if (str != null) {
                jSONObject.put(str, richTextInfo3.getStatus().getStatusName());
            }
        }
        return C786410Ut5.J3(jSONObject);
    }

    public final String getLinkType() throws JSONException {
        List<RichTextInfo> list = this.richTextInfos;
        if (list == null) {
            return "";
        }
        ArrayList<RichTextInfo> arrayList = new ArrayList();
        for (RichTextInfo richTextInfo : list) {
            RichTextInfo richTextInfo2 = richTextInfo;
            if (richTextInfo2.type == C0I1M.EXTERNAL_LINK.getValue() || richTextInfo2.type == C0I1M.ROUTER_HYPER_LINK.getValue()) {
                arrayList.add(richTextInfo);
            }
        }
        if (arrayList.isEmpty()) {
            return "";
        }
        JSONObject jSONObject = new JSONObject();
        for (RichTextInfo richTextInfo3 : arrayList) {
            String str = richTextInfo3.link;
            if (str != null) {
                jSONObject.put(str, richTextInfo3.type);
            }
        }
        return C786410Ut5.J3(jSONObject);
    }

    public final boolean isValid() {
        String str = this.text;
        return !(str == null || str.length() == 0);
    }

    @Override // com.ss.android.ugc.aweme.im.message.content.utils.SlimContent
    public String trimToSlimContent() {
        TextContent textContentCopy = copy(this.text, this.richTextInfos, this.attachment, this.header);
        textContentCopy.copyBaseContentRequestFieldsFrom(this);
        return GsonProtectorUtils.toJson(C09EF.LIZ, textContentCopy);
    }

    public final FeatureAttachmentContent getAttachment() {
        return this.attachment;
    }

    public final BaseHeader getHeader() {
        return this.header;
    }

    public final List<RichTextInfo> getRichTextInfos() {
        return this.richTextInfos;
    }

    public final String getText() {
        return this.text;
    }

    public static final class Companion {
        public final TextContent obtain(TextContent textContent) {
            TextContent textContent2 = new TextContent(textContent.getText(), textContent.getRichTextInfos(), textContent.getAttachment(), textContent.getHeader());
            textContent2.type = OppoPermissionPopupMaskDelayExp.DEFAULT;
            textContent2.setRefVideo(textContent.getRefVideo());
            textContent2.setPrevId(textContent.getPrevId());
            textContent2.setRootId(textContent.getRootId());
            textContent2.setReferenceScene(textContent.getReferenceScene());
            return textContent2;
        }

        public final TextContent obtain(String str) {
            return obtain(str, null, null, null, null, null);
        }

        public final TextContent obtain(String str, Aweme aweme) {
            return obtain(str, aweme, null, null, null, null);
        }

        public final TextContent obtainShareReplyContent(String str, User user) {
            return obtainShareReplyContent(str, user, (Aweme) null, (BaseContent.ReferenceSceneType) null);
        }

        public final TextContent obtain(String str, Aweme aweme, List<RichTextInfo> list) {
            return obtain(str, aweme, list, null, null, null);
        }

        public final TextContent obtainShareReplyContent(String str, String str2, String str3) {
            return obtainShareReplyContent(str, str2, str3, null, null, null, null);
        }

        public final TextContent obtainShareReplyContent(String str, User user, Aweme aweme) {
            return obtainShareReplyContent(str, user, aweme, (BaseContent.ReferenceSceneType) null);
        }

        public final TextContent obtain(String str, Aweme aweme, List<RichTextInfo> list, BaseContent.ReferenceSceneType referenceSceneType) {
            return obtain(str, aweme, list, referenceSceneType, null, null);
        }

        public final TextContent obtainShareReplyContent(String str, User user, Aweme aweme, BaseContent.ReferenceSceneType referenceSceneType) {
            int iOrdinal;
            UrlModel cover;
            long j;
            long jLongValue;
            TextContent textContent = new TextContent(str, null, null, null);
            textContent.type = OppoPermissionPopupMaskDelayExp.DEFAULT;
            if (aweme != null) {
                BaseContent.ReferenceVideo referenceVideo = new BaseContent.ReferenceVideo();
                referenceVideo.setRefVideoId(aweme.getAid());
                if (user != null) {
                    referenceVideo.setRefVideoAuthorUid(user.getUid());
                    referenceVideo.setRefVideoAuthorSecUid(user.getSecUid());
                }
                Video video = aweme.getVideo();
                if (video != null) {
                    cover = video.getCover();
                } else {
                    cover = null;
                }
                referenceVideo.setRefVideoCoverUrl(cover);
                referenceVideo.setRefVideoAwemeType(aweme.getAwemeType());
                referenceVideo.setRefVideoIsStory(aweme.getIsTikTokStory());
                Story story = aweme.getStory();
                if (story != null) {
                    j = story.expiredAt;
                } else {
                    j = 0;
                }
                referenceVideo.setExpireAt(j);
                Long lLJIILIIL = C2095008Iq.LJIILIIL(AwemeExtKt.getAuthorUid(aweme));
                if (lLJIILIIL != null) {
                    jLongValue = lLJIILIIL.longValue();
                } else {
                    jLongValue = -1;
                }
                referenceVideo.setOriginAuthorId(jLongValue);
                textContent.setRefVideo(referenceVideo);
            }
            if (referenceSceneType != null) {
                iOrdinal = referenceSceneType.ordinal();
            } else {
                iOrdinal = 0;
            }
            textContent.setReferenceScene(Integer.valueOf(iOrdinal));
            return textContent;
        }

        public final TextContent obtainShareReplyContent(String str, String str2, String str3, Aweme aweme) {
            return obtainShareReplyContent(str, str2, str3, aweme, null, null, null);
        }

        public final TextContent obtain(String str, Aweme aweme, List<RichTextInfo> list, BaseContent.ReferenceSceneType referenceSceneType, FeatureAttachmentContent featureAttachmentContent) {
            return obtain(str, aweme, list, referenceSceneType, featureAttachmentContent, null);
        }

        public final TextContent obtainShareReplyContent(String str, String str2, String str3, Aweme aweme, BaseContent.ReferenceSceneType referenceSceneType) {
            return obtainShareReplyContent(str, str2, str3, aweme, referenceSceneType, null, null);
        }

        public final TextContent obtain(String str, Aweme aweme, List<RichTextInfo> list, BaseContent.ReferenceSceneType referenceSceneType, FeatureAttachmentContent featureAttachmentContent, BaseHeader baseHeader) {
            int iOrdinal;
            UrlModel cover;
            long j;
            long jLongValue;
            TextContent textContent = new TextContent(str, list, featureAttachmentContent, baseHeader);
            textContent.type = OppoPermissionPopupMaskDelayExp.DEFAULT;
            if (aweme != null) {
                BaseContent.ReferenceVideo referenceVideo = new BaseContent.ReferenceVideo();
                referenceVideo.setRefVideoId(aweme.getAid());
                referenceVideo.setRefVideoAuthorUid(AwemeExtKt.getAuthorUid(aweme));
                referenceVideo.setRefVideoAuthorSecUid(AwemeExtKt.getSecAuthorUid(aweme));
                Video video = aweme.getVideo();
                if (video != null) {
                    cover = video.getCover();
                } else {
                    cover = null;
                }
                referenceVideo.setRefVideoCoverUrl(cover);
                referenceVideo.setRefVideoAwemeType(aweme.getAwemeType());
                referenceVideo.setRefVideoIsStory(aweme.getIsTikTokStory());
                Story story = aweme.getStory();
                if (story != null) {
                    j = story.expiredAt;
                } else {
                    j = 0;
                }
                referenceVideo.setExpireAt(j);
                Long lLJIILIIL = C2095008Iq.LJIILIIL(AwemeExtKt.getAuthorUid(aweme));
                if (lLJIILIIL != null) {
                    jLongValue = lLJIILIIL.longValue();
                } else {
                    jLongValue = -1;
                }
                referenceVideo.setOriginAuthorId(jLongValue);
                textContent.setRefVideo(referenceVideo);
            }
            if (referenceSceneType != null) {
                iOrdinal = referenceSceneType.ordinal();
            } else {
                iOrdinal = 0;
            }
            textContent.setReferenceScene(Integer.valueOf(iOrdinal));
            return textContent;
        }

        public final TextContent obtainShareReplyContent(String str, String str2, String str3, Aweme aweme, BaseContent.ReferenceSceneType referenceSceneType, FeatureAttachmentContent featureAttachmentContent) {
            return obtainShareReplyContent(str, str2, str3, aweme, referenceSceneType, featureAttachmentContent, null);
        }

        public final TextContent obtainShareReplyContent(String str, String str2, String str3, Aweme aweme, BaseContent.ReferenceSceneType referenceSceneType, FeatureAttachmentContent featureAttachmentContent, BaseHeader baseHeader) {
            int iOrdinal;
            UrlModel cover;
            long j;
            long jLongValue;
            TextContent textContent = new TextContent(str, null, featureAttachmentContent, baseHeader);
            textContent.type = OppoPermissionPopupMaskDelayExp.DEFAULT;
            if (aweme != null) {
                BaseContent.ReferenceVideo referenceVideo = new BaseContent.ReferenceVideo();
                referenceVideo.setRefVideoId(aweme.getAid());
                referenceVideo.setRefVideoAuthorUid(str2);
                referenceVideo.setRefVideoAuthorSecUid(str3);
                Video video = aweme.getVideo();
                if (video != null) {
                    cover = video.getCover();
                } else {
                    cover = null;
                }
                referenceVideo.setRefVideoCoverUrl(cover);
                referenceVideo.setRefVideoAwemeType(aweme.getAwemeType());
                referenceVideo.setRefVideoIsStory(aweme.getIsTikTokStory());
                Story story = aweme.getStory();
                if (story != null) {
                    j = story.expiredAt;
                } else {
                    j = 0;
                }
                referenceVideo.setExpireAt(j);
                Long lLJIILIIL = C2095008Iq.LJIILIIL(AwemeExtKt.getAuthorUid(aweme));
                if (lLJIILIIL != null) {
                    jLongValue = lLJIILIIL.longValue();
                } else {
                    jLongValue = -1;
                }
                referenceVideo.setOriginAuthorId(jLongValue);
                textContent.setRefVideo(referenceVideo);
            }
            if (referenceSceneType != null) {
                iOrdinal = referenceSceneType.ordinal();
            } else {
                iOrdinal = 0;
            }
            textContent.setReferenceScene(Integer.valueOf(iOrdinal));
            return textContent;
        }
    }

    public TextContent(String str, List<RichTextInfo> list, FeatureAttachmentContent featureAttachmentContent, BaseHeader baseHeader) {
        this.text = str;
        this.richTextInfos = list;
        this.attachment = featureAttachmentContent;
        this.header = baseHeader;
    }
}
