package com.ss.android.ugc.aweme.commercialize.model;

import X.C09CT;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.profile.model.User;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes17.dex */
public class LinkData implements Serializable {
    public User LL;

    @C09CT("avatar_icon")
    public UrlModel avatarIcon;

    @C09CT("background_type")
    public int backgroundType;

    @C09CT("button_style")
    public int buttonStyle;

    @C09CT("button_text")
    public String buttonText;

    @C09CT("click_track_url_list")
    public UrlModel clickTrackUrlList;

    @C09CT("comment_area")
    public CommentStruct commentArea;

    @C09CT("creative_id")
    public String creativeId;

    @C09CT("description")
    public String description;

    @C09CT("download_url")
    public String downloadUrl;

    @C09CT("feed_show_type")
    public int feedShowType;
    public boolean hasDislike;

    @C09CT("image_list")
    public List<UrlModel> imageList;

    @C09CT("is_preview")
    public boolean isPreview;

    @C09CT("label")
    public String label;

    @C09CT("label_type")
    public int labelType;
    public int linkType;

    @C09CT("log_extra")
    public String logExtra;

    @C09CT("mp_url")
    public String mpUrl;

    @C09CT("open_url")
    public String openUrl;

    @C09CT("package")
    public String packageName;

    @C09CT("report_enable")
    public boolean reportEnabled = true;

    @C09CT("saiyan_link_type")
    public int saiyanLinkType;

    @C09CT("show_close_tips")
    public boolean showCloseTips;

    @C09CT("show_type")
    public int showType;

    @C09CT("source")
    public String source;

    @C09CT("tips_schema")
    public String tipsSchema;

    @C09CT("tips_text")
    public String tipsText;

    @C09CT("tips_type")
    public int tipsType;

    @C09CT("title")
    public String title;

    @C09CT("track_url_list")
    public UrlModel trackUrlList;

    @C09CT("type")
    public String type;

    @C09CT("web_title")
    public String webTitle;

    @C09CT("web_url")
    public String webUrl;

    public static class CommentStruct implements Serializable {

        @C09CT("avatar_icon")
        public UrlModel avatarIcon;

        @C09CT("feature_label")
        public String featureLabel;

        @C09CT("title")
        public String title;
    }

    public UrlModel getCommentAvatarIcon() {
        UrlModel urlModel;
        CommentStruct commentStruct = this.commentArea;
        return (commentStruct == null || (urlModel = commentStruct.avatarIcon) == null) ? this.avatarIcon : urlModel;
    }

    public boolean showOnComment() {
        CommentStruct commentStruct;
        int i = this.showType;
        return ((i != 0 && i != 2) || (commentStruct = this.commentArea) == null || commentStruct.title == null || commentStruct.featureLabel == null) ? false : true;
    }

    public boolean showOnFeed() {
        int i = this.showType;
        return i == 0 || i == 1;
    }

    public UrlModel getClickTrackUrlList() {
        return this.clickTrackUrlList;
    }

    public List<UrlModel> getImageList() {
        return this.imageList;
    }

    public int getLinkType() {
        return this.linkType;
    }

    public UrlModel getTrackUrlList() {
        return this.trackUrlList;
    }

    public User getUser() {
        return this.LL;
    }

    public boolean isHasDislike() {
        return this.hasDislike;
    }

    public void setClickTrackUrlList(UrlModel urlModel) {
        this.clickTrackUrlList = urlModel;
    }

    public void setHasDislike(boolean z) {
        this.hasDislike = z;
    }

    public void setLinkType(int i) {
        this.linkType = i;
    }

    public void setTrackUrlList(UrlModel urlModel) {
        this.trackUrlList = urlModel;
    }

    public void setUser(User user) {
        this.LL = user;
    }
}
