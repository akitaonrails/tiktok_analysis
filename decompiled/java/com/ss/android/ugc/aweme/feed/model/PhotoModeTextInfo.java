package com.ss.android.ugc.aweme.feed.model;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public final class PhotoModeTextInfo implements Serializable {

    @C09CT("ai_generated_image_style_id")
    public Long aiGeneratedImageStyleId;

    @C09CT("comment_id")
    public Long commentId;

    @C09CT("comment_summary")
    public String commentSummary;

    @C09CT("generated_text_post_ai_position")
    public Integer generatedTextPostAIPosition;

    @C09CT("generated_text_post_position")
    public Integer generatedTextPostPosition;

    @C09CT("is_ai_summary")
    public boolean isAISummary;

    @C09CT("is_ai_text_mode")
    public boolean isAITextMode;

    @C09CT("is_comment2post")
    public boolean isComment2Post;

    @C09CT("is_converted_text")
    public boolean isConvertedText;

    @C09CT("is_text2image")
    public boolean isText2Image;

    @C09CT("original_item_id")
    public Long originalItemId;

    @C09CT("text_post_template_id")
    public Long templateId;

    public final Long getAiGeneratedImageStyleId() {
        return this.aiGeneratedImageStyleId;
    }

    public final Long getCommentId() {
        return this.commentId;
    }

    public final String getCommentSummary() {
        return this.commentSummary;
    }

    public final Integer getGeneratedTextPostAIPosition() {
        return this.generatedTextPostAIPosition;
    }

    public final Integer getGeneratedTextPostPosition() {
        return this.generatedTextPostPosition;
    }

    public final Long getOriginalItemId() {
        return this.originalItemId;
    }

    public final Long getTemplateId() {
        return this.templateId;
    }

    public final boolean isAISummary() {
        return this.isAISummary;
    }

    public final boolean isAITextMode() {
        return this.isAITextMode;
    }

    public final boolean isComment2Post() {
        return this.isComment2Post;
    }

    public final boolean isConvertedText() {
        return this.isConvertedText;
    }

    public final boolean isText2Image() {
        return this.isText2Image;
    }

    public final void setAISummary(boolean z) {
        this.isAISummary = z;
    }

    public final void setAITextMode(boolean z) {
        this.isAITextMode = z;
    }

    public final void setAiGeneratedImageStyleId(Long l) {
        this.aiGeneratedImageStyleId = l;
    }

    public final void setComment2Post(boolean z) {
        this.isComment2Post = z;
    }

    public final void setCommentId(Long l) {
        this.commentId = l;
    }

    public final void setCommentSummary(String str) {
        this.commentSummary = str;
    }

    public final void setConvertedText(boolean z) {
        this.isConvertedText = z;
    }

    public final void setGeneratedTextPostAIPosition(Integer num) {
        this.generatedTextPostAIPosition = num;
    }

    public final void setGeneratedTextPostPosition(Integer num) {
        this.generatedTextPostPosition = num;
    }

    public final void setOriginalItemId(Long l) {
        this.originalItemId = l;
    }

    public final void setTemplateId(Long l) {
        this.templateId = l;
    }

    public final void setText2Image(boolean z) {
        this.isText2Image = z;
    }
}
