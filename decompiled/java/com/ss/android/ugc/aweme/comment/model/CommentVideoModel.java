package com.ss.android.ugc.aweme.comment.model;

import X.C08FF;
import X.C2254308sP;
import X.InterfaceC2044707zh;
import X.InterfaceC384940F7k;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes30.dex */
public final class CommentVideoModel implements InterfaceC384940F7k, Serializable {
    public static final Companion Companion = new Companion();
    public static final long serialVersionUID = 6067284783174034475L;
    public final String awemeId;
    public final String awemeUserId;
    public final int channelId;
    public final String commentId;
    public final String commentMsg;
    public int endTime;
    public final String enterFrom;
    public final String enterMethod;
    public final List<UrlModel> imageList;
    public final String replyId;
    public final String replyToReplyId;
    public String shootWay;
    public int startTime;
    public final String storyMessageType;
    public final Type type;
    public final UrlModel userAvatar;
    public final String userId;
    public final String userName;

    public static final class Companion {
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: loaded from: classes22.dex */
    public static final class Type {
        public static final /* synthetic */ InterfaceC2044707zh $ENTRIES;
        public static final /* synthetic */ Type[] $VALUES;
        public final int code;
        public static final Type NONE = new Type("NONE", 0, 0);
        public static final Type COMMENT = new Type("COMMENT", 1, 1);
        public static final Type QUESTION = new Type("QUESTION", 2, 2);

        public static final /* synthetic */ Type[] $values() {
            return new Type[]{NONE, COMMENT, QUESTION};
        }

        public static InterfaceC2044707zh<Type> getEntries() {
            return $ENTRIES;
        }

        static {
            Type[] typeArr$values = $values();
            $VALUES = typeArr$values;
            $ENTRIES = new C2254308sP(typeArr$values);
        }

        public static Type[] values() {
            return (Type[]) $VALUES.clone();
        }

        public final int getCode() {
            return this.code;
        }

        public static Type valueOf(String str) {
            return (Type) C08FF.LIZ(Type.class, str);
        }

        public Type(String str, int i, int i2) {
            this.code = i2;
        }
    }

    public CommentVideoModel() {
        this("", "", null, "", null, "", "", "", "", "", 0, "", 0, 0, Type.COMMENT, "", "", null);
    }

    public final CommentVideoModel copy(String str, String str2, UrlModel urlModel, String str3, List<? extends UrlModel> list, String str4, String str5, String str6, String str7, String str8, int i, String str9, int i2, int i3, Type type, String str10, String str11, String str12) {
        return new CommentVideoModel(str, str2, urlModel, str3, list, str4, str5, str6, str7, str8, i, str9, i2, i3, type, str10, str11, str12);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CommentVideoModel)) {
            return false;
        }
        CommentVideoModel commentVideoModel = (CommentVideoModel) obj;
        return Intrinsics.LJFF(this.userId, commentVideoModel.userId) && Intrinsics.LJFF(this.userName, commentVideoModel.userName) && Intrinsics.LJFF(this.userAvatar, commentVideoModel.userAvatar) && Intrinsics.LJFF(this.commentMsg, commentVideoModel.commentMsg) && Intrinsics.LJFF(this.imageList, commentVideoModel.imageList) && Intrinsics.LJFF(this.commentId, commentVideoModel.commentId) && Intrinsics.LJFF(this.awemeId, commentVideoModel.awemeId) && Intrinsics.LJFF(this.awemeUserId, commentVideoModel.awemeUserId) && Intrinsics.LJFF(this.replyId, commentVideoModel.replyId) && Intrinsics.LJFF(this.replyToReplyId, commentVideoModel.replyToReplyId) && this.channelId == commentVideoModel.channelId && Intrinsics.LJFF(this.enterMethod, commentVideoModel.enterMethod) && this.startTime == commentVideoModel.startTime && this.endTime == commentVideoModel.endTime && this.type == commentVideoModel.type && Intrinsics.LJFF(this.shootWay, commentVideoModel.shootWay) && Intrinsics.LJFF(this.enterFrom, commentVideoModel.enterFrom) && Intrinsics.LJFF(this.storyMessageType, commentVideoModel.storyMessageType);
    }

    public int hashCode() {
        String str = this.userId;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.userName;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        UrlModel urlModel = this.userAvatar;
        int iHashCode3 = (iHashCode2 + (urlModel == null ? 0 : urlModel.hashCode())) * 31;
        String str3 = this.commentMsg;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        List<UrlModel> list = this.imageList;
        int iHashCode5 = (iHashCode4 + (list == null ? 0 : list.hashCode())) * 31;
        String str4 = this.commentId;
        int iHashCode6 = (iHashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.awemeId;
        int iHashCode7 = (iHashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.awemeUserId;
        int iHashCode8 = (iHashCode7 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.replyId;
        int iHashCode9 = (iHashCode8 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.replyToReplyId;
        int iHashCode10 = (((iHashCode9 + (str8 == null ? 0 : str8.hashCode())) * 31) + this.channelId) * 31;
        String str9 = this.enterMethod;
        int iHashCode11 = (((((iHashCode10 + (str9 == null ? 0 : str9.hashCode())) * 31) + this.startTime) * 31) + this.endTime) * 31;
        Type type = this.type;
        int iHashCode12 = (iHashCode11 + (type == null ? 0 : type.hashCode())) * 31;
        String str10 = this.shootWay;
        int iHashCode13 = (iHashCode12 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.enterFrom;
        int iHashCode14 = (iHashCode13 + (str11 == null ? 0 : str11.hashCode())) * 31;
        String str12 = this.storyMessageType;
        return iHashCode14 + (str12 != null ? str12.hashCode() : 0);
    }

    public String toString() {
        return "CommentVideoModel(userId=" + this.userId + ", userName=" + this.userName + ", userAvatar=" + this.userAvatar + ", commentMsg=" + this.commentMsg + ", imageList=" + this.imageList + ", commentId=" + this.commentId + ", awemeId=" + this.awemeId + ", awemeUserId=" + this.awemeUserId + ", replyId=" + this.replyId + ", replyToReplyId=" + this.replyToReplyId + ", channelId=" + this.channelId + ", enterMethod=" + this.enterMethod + ", startTime=" + this.startTime + ", endTime=" + this.endTime + ", type=" + this.type + ", shootWay=" + this.shootWay + ", enterFrom=" + this.enterFrom + ", storyMessageType=" + this.storyMessageType + ')';
    }

    public final boolean hasTimeData() {
        return this.endTime != 0;
    }

    public final boolean isComment() {
        return this.type == Type.COMMENT;
    }

    public final boolean isCommentFromEditPanel() {
        return Intrinsics.LJFF(this.shootWay, "edit_panel");
    }

    public final boolean isCommentFromPanel() {
        return Intrinsics.LJFF(this.shootWay, "record_panel") || Intrinsics.LJFF(this.shootWay, "edit_panel");
    }

    public final boolean isQuestion() {
        return this.type == Type.QUESTION;
    }

    public final String getAwemeId() {
        return this.awemeId;
    }

    public final String getAwemeUserId() {
        return this.awemeUserId;
    }

    public final int getChannelId() {
        return this.channelId;
    }

    public final String getCommentId() {
        return this.commentId;
    }

    public final String getCommentMsg() {
        return this.commentMsg;
    }

    public final int getEndTime() {
        return this.endTime;
    }

    public final String getEnterFrom() {
        return this.enterFrom;
    }

    public final String getEnterMethod() {
        return this.enterMethod;
    }

    public final List<UrlModel> getImageList() {
        return this.imageList;
    }

    public final String getReplyId() {
        return this.replyId;
    }

    public final String getReplyToReplyId() {
        return this.replyToReplyId;
    }

    public final String getShootWay() {
        return this.shootWay;
    }

    public final int getStartTime() {
        return this.startTime;
    }

    public final String getStoryMessageType() {
        return this.storyMessageType;
    }

    public final Type getType() {
        return this.type;
    }

    public final UrlModel getUserAvatar() {
        return this.userAvatar;
    }

    public final String getUserId() {
        return this.userId;
    }

    public final String getUserName() {
        return this.userName;
    }

    public CommentVideoModel(String str) {
        this(str, "", null, "", null, "", "", "", "", "", 0, "", 0, 0, Type.COMMENT, "", "", null);
    }

    public final boolean isVisibleWhen(long j) {
        if (!hasTimeData() || (this.startTime <= j && j <= this.endTime)) {
            return true;
        }
        return false;
    }

    public final void setEndTime(int i) {
        this.endTime = i;
    }

    public final void setShootWay(String str) {
        this.shootWay = str;
    }

    public final void setStartTime(int i) {
        this.startTime = i;
    }

    public CommentVideoModel(String str, String str2) {
        this(str, str2, null, "", null, "", "", "", "", "", 0, "", 0, 0, Type.COMMENT, "", "", null);
    }

    public CommentVideoModel(String str, String str2, UrlModel urlModel) {
        this(str, str2, urlModel, "", null, "", "", "", "", "", 0, "", 0, 0, Type.COMMENT, "", "", null);
    }

    public CommentVideoModel(String str, String str2, UrlModel urlModel, String str3) {
        this(str, str2, urlModel, str3, null, "", "", "", "", "", 0, "", 0, 0, Type.COMMENT, "", "", null);
    }

    public CommentVideoModel(String str, String str2, UrlModel urlModel, String str3, List<? extends UrlModel> list) {
        this(str, str2, urlModel, str3, list, "", "", "", "", "", 0, "", 0, 0, Type.COMMENT, "", "", null);
    }

    public CommentVideoModel(String str, String str2, UrlModel urlModel, String str3, List<? extends UrlModel> list, String str4) {
        this(str, str2, urlModel, str3, list, str4, "", "", "", "", 0, "", 0, 0, Type.COMMENT, "", "", null);
    }

    public CommentVideoModel(String str, String str2, UrlModel urlModel, String str3, List<? extends UrlModel> list, String str4, String str5) {
        this(str, str2, urlModel, str3, list, str4, str5, "", "", "", 0, "", 0, 0, Type.COMMENT, "", "", null);
    }

    public CommentVideoModel(String str, String str2, UrlModel urlModel, String str3, List<? extends UrlModel> list, String str4, String str5, String str6) {
        this(str, str2, urlModel, str3, list, str4, str5, str6, "", "", 0, "", 0, 0, Type.COMMENT, "", "", null);
    }

    public CommentVideoModel(String str, String str2, UrlModel urlModel, String str3, List<? extends UrlModel> list, String str4, String str5, String str6, String str7) {
        this(str, str2, urlModel, str3, list, str4, str5, str6, str7, "", 0, "", 0, 0, Type.COMMENT, "", "", null);
    }

    public CommentVideoModel(String str, String str2, UrlModel urlModel, String str3, List<? extends UrlModel> list, String str4, String str5, String str6, String str7, String str8) {
        this(str, str2, urlModel, str3, list, str4, str5, str6, str7, str8, 0, "", 0, 0, Type.COMMENT, "", "", null);
    }

    public CommentVideoModel(String str, String str2, UrlModel urlModel, String str3, List<? extends UrlModel> list, String str4, String str5, String str6, String str7, String str8, int i) {
        this(str, str2, urlModel, str3, list, str4, str5, str6, str7, str8, i, "", 0, 0, Type.COMMENT, "", "", null);
    }

    public CommentVideoModel(String str, String str2, UrlModel urlModel, String str3, List<? extends UrlModel> list, String str4, String str5, String str6, String str7, String str8, int i, String str9) {
        this(str, str2, urlModel, str3, list, str4, str5, str6, str7, str8, i, str9, 0, 0, Type.COMMENT, "", "", null);
    }

    public CommentVideoModel(String str, String str2, UrlModel urlModel, String str3, List<? extends UrlModel> list, String str4, String str5, String str6, String str7, String str8, int i, String str9, int i2) {
        this(str, str2, urlModel, str3, list, str4, str5, str6, str7, str8, i, str9, i2, 0, Type.COMMENT, "", "", null);
    }

    public CommentVideoModel(String str, String str2, UrlModel urlModel, String str3, List<? extends UrlModel> list, String str4, String str5, String str6, String str7, String str8, int i, String str9, int i2, int i3) {
        this(str, str2, urlModel, str3, list, str4, str5, str6, str7, str8, i, str9, i2, i3, Type.COMMENT, "", "", null);
    }

    public CommentVideoModel(String str, String str2, UrlModel urlModel, String str3, List<? extends UrlModel> list, String str4, String str5, String str6, String str7, String str8, int i, String str9, int i2, int i3, Type type) {
        this(str, str2, urlModel, str3, list, str4, str5, str6, str7, str8, i, str9, i2, i3, type, "", "", null);
    }

    public CommentVideoModel(String str, String str2, UrlModel urlModel, String str3, List<? extends UrlModel> list, String str4, String str5, String str6, String str7, String str8, int i, String str9, int i2, int i3, Type type, String str10) {
        this(str, str2, urlModel, str3, list, str4, str5, str6, str7, str8, i, str9, i2, i3, type, str10, "", null);
    }

    public CommentVideoModel(String str, String str2, UrlModel urlModel, String str3, List<? extends UrlModel> list, String str4, String str5, String str6, String str7, String str8, int i, String str9, int i2, int i3, Type type, String str10, String str11) {
        this(str, str2, urlModel, str3, list, str4, str5, str6, str7, str8, i, str9, i2, i3, type, str10, str11, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public CommentVideoModel(String str, String str2, UrlModel urlModel, String str3, List<? extends UrlModel> list, String str4, String str5, String str6, String str7, String str8, int i, String str9, int i2, int i3, Type type, String str10, String str11, String str12) {
        this.userId = str;
        this.userName = str2;
        this.userAvatar = urlModel;
        this.commentMsg = str3;
        this.imageList = list;
        this.commentId = str4;
        this.awemeId = str5;
        this.awemeUserId = str6;
        this.replyId = str7;
        this.replyToReplyId = str8;
        this.channelId = i;
        this.enterMethod = str9;
        this.startTime = i2;
        this.endTime = i3;
        this.type = type;
        this.shootWay = str10;
        this.enterFrom = str11;
        this.storyMessageType = str12;
    }
}
