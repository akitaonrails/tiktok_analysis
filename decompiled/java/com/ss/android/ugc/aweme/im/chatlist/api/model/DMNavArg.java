package com.ss.android.ugc.aweme.im.chatlist.api.model;

import X.C912960Zri;
import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.router.annotation.IRouteArg;
import com.ss.android.ugc.aweme.im.chatlist.api.model.DMNavArg;

/* JADX INFO: loaded from: classes15.dex */
public final class DMNavArg implements IRouteArg {
    public final Integer chatType;
    public final String conversationId;
    public final String enterFrom;
    public final String enterMethod;
    public final String groupInviteUrl;
    public final Integer isGroupMemberRequest;
    public final String jumpedFromInviteId;
    public final Integer messageCount;
    public final Integer messagePreviewEnabled;
    public final long msgIdFromPush;
    public final String noticeType;
    public final String openPanelType;
    public final String pushLabel;
    public final String refMessageContent;
    public final Long refMessageId;
    public final Long refMessageSenderUid;
    public final Integer refMessageType;
    public final String routerFrom;
    public final String routerTo;
    public final Integer showKeyboardByDefault;
    public final String sourceBtmToken;
    public static final C912960Zri Companion = new C912960Zri();
    public static final Parcelable.Creator<DMNavArg> CREATOR = new Parcelable.Creator<DMNavArg>() { // from class: X.0W8W
        @Override // android.os.Parcelable.Creator
        public final DMNavArg createFromParcel(Parcel parcel) {
            Integer numValueOf;
            Integer numValueOf2;
            Integer numValueOf3;
            Integer numValueOf4;
            Long lValueOf;
            Integer numValueOf5;
            Long lValueOf2;
            String string = parcel.readString();
            String string2 = parcel.readString();
            Integer numValueOf6 = null;
            if (parcel.readInt() == 0) {
                numValueOf = null;
            } else {
                numValueOf = Integer.valueOf(parcel.readInt());
            }
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            String string5 = parcel.readString();
            long j = parcel.readLong();
            if (parcel.readInt() == 0) {
                numValueOf2 = null;
            } else {
                numValueOf2 = Integer.valueOf(parcel.readInt());
            }
            if (parcel.readInt() == 0) {
                numValueOf3 = null;
            } else {
                numValueOf3 = Integer.valueOf(parcel.readInt());
            }
            if (parcel.readInt() == 0) {
                numValueOf4 = null;
            } else {
                numValueOf4 = Integer.valueOf(parcel.readInt());
            }
            String string6 = parcel.readString();
            if (parcel.readInt() == 0) {
                lValueOf = null;
            } else {
                lValueOf = Long.valueOf(parcel.readLong());
            }
            if (parcel.readInt() == 0) {
                numValueOf5 = null;
            } else {
                numValueOf5 = Integer.valueOf(parcel.readInt());
            }
            if (parcel.readInt() == 0) {
                lValueOf2 = null;
            } else {
                lValueOf2 = Long.valueOf(parcel.readLong());
            }
            String string7 = parcel.readString();
            String string8 = parcel.readString();
            String string9 = parcel.readString();
            String string10 = parcel.readString();
            if (parcel.readInt() != 0) {
                numValueOf6 = Integer.valueOf(parcel.readInt());
            }
            return new DMNavArg(string, string2, numValueOf, string3, string4, string5, j, numValueOf2, numValueOf3, numValueOf4, string6, lValueOf, numValueOf5, lValueOf2, string7, string8, string9, string10, numValueOf6, parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final DMNavArg[] newArray(int i) {
            return new DMNavArg[i];
        }
    };

    public DMNavArg() {
        this(null, null, null, null, null, null, 0L, 0, 0, 0, null, null, null, null, null, null, null, null, 0, null, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.enterFrom);
        parcel.writeString(this.enterMethod);
        Integer num = this.messageCount;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        parcel.writeString(this.noticeType);
        parcel.writeString(this.jumpedFromInviteId);
        parcel.writeString(this.conversationId);
        parcel.writeLong(this.msgIdFromPush);
        Integer num2 = this.isGroupMemberRequest;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num2.intValue());
        }
        Integer num3 = this.chatType;
        if (num3 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num3.intValue());
        }
        Integer num4 = this.messagePreviewEnabled;
        if (num4 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num4.intValue());
        }
        parcel.writeString(this.refMessageContent);
        Long l = this.refMessageId;
        if (l == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l.longValue());
        }
        Integer num5 = this.refMessageType;
        if (num5 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num5.intValue());
        }
        Long l2 = this.refMessageSenderUid;
        if (l2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l2.longValue());
        }
        parcel.writeString(this.routerFrom);
        parcel.writeString(this.routerTo);
        parcel.writeString(this.pushLabel);
        parcel.writeString(this.openPanelType);
        Integer num6 = this.showKeyboardByDefault;
        if (num6 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num6.intValue());
        }
        parcel.writeString(this.groupInviteUrl);
        parcel.writeString(this.sourceBtmToken);
    }

    public final Integer getChatType() {
        return this.chatType;
    }

    public final String getConversationId() {
        return this.conversationId;
    }

    public final String getEnterFrom() {
        return this.enterFrom;
    }

    public final String getEnterMethod() {
        return this.enterMethod;
    }

    public final String getGroupInviteUrl() {
        return this.groupInviteUrl;
    }

    public final String getJumpedFromInviteId() {
        return this.jumpedFromInviteId;
    }

    public final Integer getMessageCount() {
        return this.messageCount;
    }

    public final Integer getMessagePreviewEnabled() {
        return this.messagePreviewEnabled;
    }

    public final long getMsgIdFromPush() {
        return this.msgIdFromPush;
    }

    public final String getNoticeType() {
        return this.noticeType;
    }

    public final String getOpenPanelType() {
        return this.openPanelType;
    }

    public final String getPushLabel() {
        return this.pushLabel;
    }

    public final String getRefMessageContent() {
        return this.refMessageContent;
    }

    public final Long getRefMessageId() {
        return this.refMessageId;
    }

    public final Long getRefMessageSenderUid() {
        return this.refMessageSenderUid;
    }

    public final Integer getRefMessageType() {
        return this.refMessageType;
    }

    public final String getRouterFrom() {
        return this.routerFrom;
    }

    public final String getRouterTo() {
        return this.routerTo;
    }

    public final Integer getShowKeyboardByDefault() {
        return this.showKeyboardByDefault;
    }

    public final String getSourceBtmToken() {
        return this.sourceBtmToken;
    }

    public final Integer isGroupMemberRequest() {
        return this.isGroupMemberRequest;
    }

    public DMNavArg(String str) {
        this(str, null, null, null, null, null, 0L, 0, 0, 0, null, null, null, null, null, null, null, null, 0, null, null);
    }

    public DMNavArg(String str, String str2) {
        this(str, str2, null, null, null, null, 0L, 0, 0, 0, null, null, null, null, null, null, null, null, 0, null, null);
    }

    public DMNavArg(String str, String str2, Integer num) {
        this(str, str2, num, null, null, null, 0L, 0, 0, 0, null, null, null, null, null, null, null, null, 0, null, null);
    }

    public DMNavArg(String str, String str2, Integer num, String str3) {
        this(str, str2, num, str3, null, null, 0L, 0, 0, 0, null, null, null, null, null, null, null, null, 0, null, null);
    }

    public DMNavArg(String str, String str2, Integer num, String str3, String str4) {
        this(str, str2, num, str3, str4, null, 0L, 0, 0, 0, null, null, null, null, null, null, null, null, 0, null, null);
    }

    public DMNavArg(String str, String str2, Integer num, String str3, String str4, String str5) {
        this(str, str2, num, str3, str4, str5, 0L, 0, 0, 0, null, null, null, null, null, null, null, null, 0, null, null);
    }

    public DMNavArg(String str, String str2, Integer num, String str3, String str4, String str5, long j) {
        this(str, str2, num, str3, str4, str5, j, 0, 0, 0, null, null, null, null, null, null, null, null, 0, null, null);
    }

    public DMNavArg(String str, String str2, Integer num, String str3, String str4, String str5, long j, Integer num2) {
        this(str, str2, num, str3, str4, str5, j, num2, 0, 0, null, null, null, null, null, null, null, null, 0, null, null);
    }

    public DMNavArg(String str, String str2, Integer num, String str3, String str4, String str5, long j, Integer num2, Integer num3) {
        this(str, str2, num, str3, str4, str5, j, num2, num3, 0, null, null, null, null, null, null, null, null, 0, null, null);
    }

    public DMNavArg(String str, String str2, Integer num, String str3, String str4, String str5, long j, Integer num2, Integer num3, Integer num4) {
        this(str, str2, num, str3, str4, str5, j, num2, num3, num4, null, null, null, null, null, null, null, null, 0, null, null);
    }

    public DMNavArg(String str, String str2, Integer num, String str3, String str4, String str5, long j, Integer num2, Integer num3, Integer num4, String str6) {
        this(str, str2, num, str3, str4, str5, j, num2, num3, num4, str6, null, null, null, null, null, null, null, 0, null, null);
    }

    public DMNavArg(String str, String str2, Integer num, String str3, String str4, String str5, long j, Integer num2, Integer num3, Integer num4, String str6, Long l) {
        this(str, str2, num, str3, str4, str5, j, num2, num3, num4, str6, l, null, null, null, null, null, null, 0, null, null);
    }

    public DMNavArg(String str, String str2, Integer num, String str3, String str4, String str5, long j, Integer num2, Integer num3, Integer num4, String str6, Long l, Integer num5) {
        this(str, str2, num, str3, str4, str5, j, num2, num3, num4, str6, l, num5, null, null, null, null, null, 0, null, null);
    }

    public DMNavArg(String str, String str2, Integer num, String str3, String str4, String str5, long j, Integer num2, Integer num3, Integer num4, String str6, Long l, Integer num5, Long l2) {
        this(str, str2, num, str3, str4, str5, j, num2, num3, num4, str6, l, num5, l2, null, null, null, null, 0, null, null);
    }

    public DMNavArg(String str, String str2, Integer num, String str3, String str4, String str5, long j, Integer num2, Integer num3, Integer num4, String str6, Long l, Integer num5, Long l2, String str7) {
        this(str, str2, num, str3, str4, str5, j, num2, num3, num4, str6, l, num5, l2, str7, null, null, null, 0, null, null);
    }

    public DMNavArg(String str, String str2, Integer num, String str3, String str4, String str5, long j, Integer num2, Integer num3, Integer num4, String str6, Long l, Integer num5, Long l2, String str7, String str8) {
        this(str, str2, num, str3, str4, str5, j, num2, num3, num4, str6, l, num5, l2, str7, str8, null, null, 0, null, null);
    }

    public DMNavArg(String str, String str2, Integer num, String str3, String str4, String str5, long j, Integer num2, Integer num3, Integer num4, String str6, Long l, Integer num5, Long l2, String str7, String str8, String str9) {
        this(str, str2, num, str3, str4, str5, j, num2, num3, num4, str6, l, num5, l2, str7, str8, str9, null, 0, null, null);
    }

    public DMNavArg(String str, String str2, Integer num, String str3, String str4, String str5, long j, Integer num2, Integer num3, Integer num4, String str6, Long l, Integer num5, Long l2, String str7, String str8, String str9, String str10) {
        this(str, str2, num, str3, str4, str5, j, num2, num3, num4, str6, l, num5, l2, str7, str8, str9, str10, 0, null, null);
    }

    public DMNavArg(String str, String str2, Integer num, String str3, String str4, String str5, long j, Integer num2, Integer num3, Integer num4, String str6, Long l, Integer num5, Long l2, String str7, String str8, String str9, String str10, Integer num6) {
        this(str, str2, num, str3, str4, str5, j, num2, num3, num4, str6, l, num5, l2, str7, str8, str9, str10, num6, null, null);
    }

    public DMNavArg(String str, String str2, Integer num, String str3, String str4, String str5, long j, Integer num2, Integer num3, Integer num4, String str6, Long l, Integer num5, Long l2, String str7, String str8, String str9, String str10, Integer num6, String str11) {
        this(str, str2, num, str3, str4, str5, j, num2, num3, num4, str6, l, num5, l2, str7, str8, str9, str10, num6, str11, null);
    }

    public DMNavArg(String str, String str2, Integer num, String str3, String str4, String str5, long j, Integer num2, Integer num3, Integer num4, String str6, Long l, Integer num5, Long l2, String str7, String str8, String str9, String str10, Integer num6, String str11, String str12) {
        this.enterFrom = str;
        this.enterMethod = str2;
        this.messageCount = num;
        this.noticeType = str3;
        this.jumpedFromInviteId = str4;
        this.conversationId = str5;
        this.msgIdFromPush = j;
        this.isGroupMemberRequest = num2;
        this.chatType = num3;
        this.messagePreviewEnabled = num4;
        this.refMessageContent = str6;
        this.refMessageId = l;
        this.refMessageType = num5;
        this.refMessageSenderUid = l2;
        this.routerFrom = str7;
        this.routerTo = str8;
        this.pushLabel = str9;
        this.openPanelType = str10;
        this.showKeyboardByDefault = num6;
        this.groupInviteUrl = str11;
        this.sourceBtmToken = str12;
    }
}
