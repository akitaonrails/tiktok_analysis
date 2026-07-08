package com.ss.android.ugc.aweme.notice.repo.list.uitemplate;

import X.C09CT;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.comment.model.CommentImageStruct;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes29.dex */
public final class NoticeUITemplate {

    @C09CT("avatar_badge_url")
    public final UrlModel avatarBadgeUrl;

    @C09CT("avatar_cover_url")
    public final UrlModel avatarCoverUrl;

    @C09CT("avatar_image_url")
    public final UrlModel avatarImageUrl;

    @C09CT("avatar_schema_url")
    public final String avatarSchemaUrl;

    @C09CT("banner_image_url")
    public final UrlModel bannerImageUrl;

    @C09CT("banner_schema_url")
    public final String bannerSchemaUrl;

    @C09CT("buttons")
    public final List<NoticeUITemplateButton> bottomButtons;

    @C09CT("button_content")
    public final String buttonContent;

    @C09CT("button_type")
    public final Integer buttonType;

    @C09CT("comment_image")
    public final List<CommentImageStruct> commentsImageList;

    @C09CT("content")
    public final String content;

    @C09CT("content_text_link_configs")
    public final List<TextLinkConfig> contentTextLinkConfigs;

    @C09CT("dark_mode_quote_image")
    public final UrlModel darkModeQuoteImage;

    @C09CT("dark_mode_image_url")
    public final UrlModel darkModeRightImageUrl;

    @C09CT("event")
    public final String event;

    @C09CT("label")
    public final LabelInfoTemplate labelInfo;

    @C09CT("middle_bottom_buttons")
    public final List<NoticeUITemplateButton> middleBottomButtons;

    @C09CT("middle_image_schemas")
    public final List<String> middleImageSchemas;

    @C09CT("middle_image_urls")
    public final List<UrlModel> middleImageUrls;

    @C09CT("middle_schema_url")
    public final String middleSchemaUrl;

    @C09CT("middle_type")
    public final int middleType;

    @C09CT("quote_content")
    public final String quoteContent;

    @C09CT("quote_image")
    public final UrlModel quoteImage;

    @C09CT("right_icon_url")
    public final UrlModel rightIconUrl;

    @C09CT("image_url")
    public final UrlModel rightImageUrl;

    @C09CT("right_multi")
    public final NoticeRightMultiTemplateStruct rightMulti;

    @C09CT("right_schema_url")
    public final String rightSchemaUrl;

    @C09CT("right_secondary_type")
    public final int rightSecondaryType;

    @C09CT("right_type")
    public final int rightType;

    @C09CT("source_tag")
    public final String sourceTag;

    @C09CT("template_content")
    public final String templateContent;

    @C09CT("text_pairs")
    public final List<TextPair> textPair;

    @C09CT("title")
    public final TitleTemplate titleTemplate;

    @C09CT("toast_text")
    public final String toastText;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && Intrinsics.LJFF(NoticeUITemplate.class, obj.getClass())) {
            return Intrinsics.LJFF(this.titleTemplate, ((NoticeUITemplate) obj).titleTemplate);
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public NoticeUITemplate(UrlModel urlModel, String str, UrlModel urlModel2, int i, TitleTemplate titleTemplate, LabelInfoTemplate labelInfoTemplate, String str2, String str3, String str4, UrlModel urlModel3, UrlModel urlModel4, List<? extends UrlModel> list, String str5, List<String> list2, int i2, UrlModel urlModel5, UrlModel urlModel6, UrlModel urlModel7, String str6, Integer num, NoticeRightMultiTemplateStruct noticeRightMultiTemplateStruct, String str7, List<TextLinkConfig> list3, List<NoticeUITemplateButton> list4, List<NoticeUITemplateButton> list5, int i3, UrlModel urlModel8, String str8, UrlModel urlModel9, String str9, String str10, List<CommentImageStruct> list6, List<TextPair> list7, String str11) {
        this.avatarImageUrl = urlModel;
        this.avatarSchemaUrl = str;
        this.avatarCoverUrl = urlModel2;
        this.middleType = i;
        this.titleTemplate = titleTemplate;
        this.labelInfo = labelInfoTemplate;
        this.content = str2;
        this.event = str3;
        this.quoteContent = str4;
        this.quoteImage = urlModel3;
        this.darkModeQuoteImage = urlModel4;
        this.middleImageUrls = list;
        this.middleSchemaUrl = str5;
        this.middleImageSchemas = list2;
        this.rightType = i2;
        this.rightImageUrl = urlModel5;
        this.darkModeRightImageUrl = urlModel6;
        this.rightIconUrl = urlModel7;
        this.buttonContent = str6;
        this.buttonType = num;
        this.rightMulti = noticeRightMultiTemplateStruct;
        this.rightSchemaUrl = str7;
        this.contentTextLinkConfigs = list3;
        this.bottomButtons = list4;
        this.middleBottomButtons = list5;
        this.rightSecondaryType = i3;
        this.bannerImageUrl = urlModel8;
        this.bannerSchemaUrl = str8;
        this.avatarBadgeUrl = urlModel9;
        this.toastText = str9;
        this.templateContent = str10;
        this.commentsImageList = list6;
        this.textPair = list7;
        this.sourceTag = str11;
    }
}
