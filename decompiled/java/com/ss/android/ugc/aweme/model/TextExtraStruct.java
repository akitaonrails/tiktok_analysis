package com.ss.android.ugc.aweme.model;

import X.C09CT;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.base.model.Word;
import com.ss.android.ugc.aweme.model.TextExtraStruct;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes22.dex */
public class TextExtraStruct implements Parcelable, Serializable, Cloneable {
    public static final Parcelable.Creator<TextExtraStruct> CREATOR = new Parcelable.Creator<TextExtraStruct>() { // from class: X.0lKC
        @Override // android.os.Parcelable.Creator
        public final TextExtraStruct createFromParcel(Parcel parcel) {
            return new TextExtraStruct(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final TextExtraStruct[] newArray(int i) {
            return new TextExtraStruct[i];
        }
    };

    @C09CT("at_user_type")
    public String atUserType;

    @C09CT("aweme_id")
    public String awemeId;
    public boolean boldText;

    @C09CT("hashtag_id")
    public String cid;

    @C09CT("color")
    public int color;

    @C09CT("comment_id")
    public long commentId;
    public Object customSpan;

    @C09CT("end")
    public int end;
    public boolean everFolded;
    public int foldedTagIndex;
    public List<Integer> foldedTagsPos;

    @C09CT("group_id")
    public long groupId;

    @C09CT("group_name")
    public String groupName;

    @C09CT("group_scene")
    public String groupScene;

    @C09CT("hashtag_name")
    public String hashTagName;
    public boolean isClickable = true;

    @C09CT("is_commerce")
    public boolean isCommerce;

    @C09CT("is_tako_user")
    public boolean isTakoUser;

    @C09CT("is_third_party_highlight")
    public boolean isThirdPartyHighlight;

    @C09CT("line_idx")
    public int lineIndex;

    @C09CT("live_data")
    public String liveData;

    @C09CT("sec_uid")
    public String mSecUid;
    public int originPos;

    @C09CT("product_id")
    public long productId;

    @C09CT("product_schema")
    public String productSchema;

    @C09CT("product_title")
    public String productTitle;
    public String schema;

    @C09CT("search_keyword")
    public String searchKeyword;

    @C09CT("search_keyword_id")
    public String searchKeywordId;

    @C09CT("search_penetrate_info")
    public String searchPenetrateInfo;

    @C09CT("start")
    public int start;

    @C09CT("sticker_id")
    public String stickerId;

    @C09CT("sticker_source")
    public int stickerSource;

    @C09CT("sticker_url")
    public com.ss.android.ugc.aweme.base.model.UrlModel stickerUrl;

    @C09CT("sub_type")
    public int subType;

    @C09CT("tag_id")
    public String tagId;

    @C09CT("type")
    public int type;

    @C09CT("user_follow_status")
    public int userFollowStatus;

    @C09CT("user_id")
    public String userId;

    @C09CT("word_position")
    public int wordPosition;

    @C09CT("search_word_record")
    public Word wordRecord;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public int hashCode() {
        String str = this.userId;
        int iHashCode = (((str != null ? str.hashCode() : 0) * 31) + this.type + this.subType) * 31;
        String str2 = this.atUserType;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.hashTagName;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public TextExtraStruct() {
    }

    /* JADX INFO: renamed from: clone, reason: merged with bridge method [inline-methods] */
    public TextExtraStruct m271clone() {
        try {
            return (TextExtraStruct) super.clone();
        } catch (CloneNotSupportedException e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }

    public String getAtUserType() {
        return this.atUserType;
    }

    public String getAwemeId() {
        return this.awemeId;
    }

    public String getCid() {
        return this.cid;
    }

    public int getColor() {
        return this.color;
    }

    public long getCommentId() {
        return this.commentId;
    }

    public Object getCustomSpan() {
        return this.customSpan;
    }

    public int getEnd() {
        return this.end;
    }

    public boolean getEverFolded() {
        return this.everFolded;
    }

    public int getFoldedTagIndex() {
        return this.foldedTagIndex;
    }

    public List<Integer> getFoldedTagsPos() {
        return this.foldedTagsPos;
    }

    public long getGroupId() {
        return this.groupId;
    }

    public String getGroupName() {
        return this.groupName;
    }

    public String getGroupScene() {
        return this.groupScene;
    }

    public String getHashTagName() {
        return this.hashTagName;
    }

    public int getLineIndex() {
        return this.lineIndex;
    }

    public String getLiveData() {
        return this.liveData;
    }

    public int getOriginPos() {
        return this.originPos;
    }

    public long getProductId() {
        return this.productId;
    }

    public String getProductSchema() {
        return this.productSchema;
    }

    public String getProductTitle() {
        return this.productTitle;
    }

    public String getSchema() {
        return this.schema;
    }

    public String getSearchKeyword() {
        return this.searchKeyword;
    }

    public String getSearchKeywordId() {
        return this.searchKeywordId;
    }

    public String getSearchPenetrateInfo() {
        return this.searchPenetrateInfo;
    }

    public String getSecUid() {
        return this.mSecUid;
    }

    public int getStart() {
        return this.start;
    }

    public String getStickerId() {
        return this.stickerId;
    }

    public int getStickerSource() {
        return this.stickerSource;
    }

    public com.ss.android.ugc.aweme.base.model.UrlModel getStickerUrl() {
        return this.stickerUrl;
    }

    public int getSubtype() {
        return this.subType;
    }

    public String getTagId() {
        return this.tagId;
    }

    public int getType() {
        return this.type;
    }

    public int getUserFollowStatus() {
        return this.userFollowStatus;
    }

    public String getUserId() {
        return this.userId;
    }

    public int getWordPosition() {
        return this.wordPosition;
    }

    public Word getWordRecord() {
        return this.wordRecord;
    }

    public boolean isBoldText() {
        return this.boldText;
    }

    public boolean isClickable() {
        return this.isClickable;
    }

    public boolean isCommerce() {
        return this.isCommerce;
    }

    public boolean isTakoUser() {
        return this.isTakoUser;
    }

    public boolean isThirdPartyHighlight() {
        return this.isThirdPartyHighlight;
    }

    public TextExtraStruct(Parcel parcel) {
        this.start = parcel.readInt();
        this.end = parcel.readInt();
        this.userId = parcel.readString();
        this.mSecUid = parcel.readString();
        this.type = parcel.readInt();
        this.atUserType = parcel.readString();
        this.hashTagName = parcel.readString();
        this.awemeId = parcel.readString();
        this.schema = parcel.readString();
        this.subType = parcel.readInt();
        this.lineIndex = parcel.readInt();
        this.tagId = parcel.readString();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TextExtraStruct)) {
            return false;
        }
        TextExtraStruct textExtraStruct = (TextExtraStruct) obj;
        if (this.type != textExtraStruct.type || this.subType != textExtraStruct.subType) {
            return false;
        }
        String str = this.userId;
        if (str != null) {
            if (!str.equals(textExtraStruct.userId)) {
                return false;
            }
        } else if (textExtraStruct.userId != null) {
            return false;
        }
        if (!TextUtils.equals(this.hashTagName, textExtraStruct.hashTagName)) {
            return false;
        }
        String str2 = this.atUserType;
        String str3 = textExtraStruct.atUserType;
        if (str2 != null) {
            return str2.equals(str3);
        }
        if (str3 == null) {
            return true;
        }
        return false;
    }

    public void setAtUserType(String str) {
        this.atUserType = str;
    }

    public void setAwemeId(String str) {
        this.awemeId = str;
    }

    public void setBoldText(boolean z) {
        this.boldText = z;
    }

    public void setCid(String str) {
        this.cid = str;
    }

    public void setClickable(boolean z) {
        this.isClickable = z;
    }

    public void setColor(int i) {
        this.color = i;
    }

    public void setCommentId(long j) {
        this.commentId = j;
    }

    public void setCommerce(boolean z) {
        this.isCommerce = z;
    }

    public void setCustomSpan(Object obj) {
        this.customSpan = obj;
    }

    public void setEnd(int i) {
        this.end = i;
    }

    public void setEverFolded(boolean z) {
        this.everFolded = z;
    }

    public void setFoldedTagIndex(int i) {
        this.foldedTagIndex = i;
    }

    public void setFoldedTagsPos(List<Integer> list) {
        this.foldedTagsPos = list;
    }

    public void setGroupId(long j) {
        this.groupId = j;
    }

    public void setGroupName(String str) {
        this.groupName = str;
    }

    public void setGroupScene(String str) {
        this.groupScene = str;
    }

    public void setHashTagName(String str) {
        this.hashTagName = str;
    }

    public void setLineIndex(int i) {
        this.lineIndex = i;
    }

    public void setOriginPos(int i) {
        this.originPos = i;
    }

    public void setProductId(long j) {
        this.productId = j;
    }

    public void setProductSchema(String str) {
        this.productSchema = str;
    }

    public void setProductTitle(String str) {
        this.productTitle = str;
    }

    public void setSchema(String str) {
        this.schema = str;
    }

    public void setSearchKeyword(String str) {
        this.searchKeyword = str;
    }

    public void setSearchKeywordId(String str) {
        this.searchKeywordId = str;
    }

    public void setSearchPenetrateInfo(String str) {
        this.searchPenetrateInfo = str;
    }

    public void setSecUid(String str) {
        this.mSecUid = str;
    }

    public void setStart(int i) {
        this.start = i;
    }

    public void setStickerId(String str) {
        this.stickerId = str;
    }

    public void setStickerSource(int i) {
        this.stickerSource = i;
    }

    public void setStickerUrl(com.ss.android.ugc.aweme.base.model.UrlModel urlModel) {
        this.stickerUrl = urlModel;
    }

    public void setSubType(int i) {
        this.subType = i;
    }

    public void setTagId(String str) {
        this.tagId = str;
    }

    public void setTakoUser(boolean z) {
        this.isTakoUser = z;
    }

    public void setThirdPartyHighlight(boolean z) {
        this.isThirdPartyHighlight = z;
    }

    public void setType(int i) {
        this.type = i;
    }

    public void setUserId(String str) {
        this.userId = str;
    }

    public void setUserUserFollowStatus(int i) {
        this.userFollowStatus = i;
    }

    public void setWordPosition(int i) {
        this.wordPosition = i;
    }

    public void setWordRecord(Word word) {
        this.wordRecord = word;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.start);
        parcel.writeInt(this.end);
        parcel.writeString(this.userId);
        parcel.writeString(this.mSecUid);
        parcel.writeInt(this.type);
        parcel.writeString(this.atUserType);
        parcel.writeString(this.hashTagName);
        parcel.writeString(this.awemeId);
        parcel.writeString(this.schema);
        parcel.writeInt(this.subType);
        parcel.writeInt(this.lineIndex);
        parcel.writeString(this.tagId);
    }
}
