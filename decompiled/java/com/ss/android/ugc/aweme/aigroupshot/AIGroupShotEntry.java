package com.ss.android.ugc.aweme.aigroupshot;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.aigroupshot.AIGroupShotEntry;

/* JADX INFO: loaded from: classes28.dex */
public abstract class AIGroupShotEntry implements Parcelable {
    public final String entryName;

    public static abstract class InChat extends AIGroupShotEntry {
        public final String entryName;

        public static final class ActionBar extends InChat {
            public static final ActionBar INSTANCE = new ActionBar();
            public static final Parcelable.Creator<ActionBar> CREATOR = new Parcelable.Creator<ActionBar>() { // from class: X.0waM
                @Override // android.os.Parcelable.Creator
                public final AIGroupShotEntry.InChat.ActionBar createFromParcel(Parcel parcel) {
                    parcel.readInt();
                    return AIGroupShotEntry.InChat.ActionBar.INSTANCE;
                }

                @Override // android.os.Parcelable.Creator
                public final AIGroupShotEntry.InChat.ActionBar[] newArray(int i) {
                    return new AIGroupShotEntry.InChat.ActionBar[i];
                }
            };

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                parcel.writeInt(1);
            }

            public ActionBar() {
                super("action_bar");
            }
        }

        public static final class GroupShotCard extends InChat {
            public static final GroupShotCard INSTANCE = new GroupShotCard();
            public static final Parcelable.Creator<GroupShotCard> CREATOR = new Parcelable.Creator<GroupShotCard>() { // from class: X.0waK
                @Override // android.os.Parcelable.Creator
                public final AIGroupShotEntry.InChat.GroupShotCard createFromParcel(Parcel parcel) {
                    parcel.readInt();
                    return AIGroupShotEntry.InChat.GroupShotCard.INSTANCE;
                }

                @Override // android.os.Parcelable.Creator
                public final AIGroupShotEntry.InChat.GroupShotCard[] newArray(int i) {
                    return new AIGroupShotEntry.InChat.GroupShotCard[i];
                }
            };

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                parcel.writeInt(1);
            }

            public GroupShotCard() {
                super("main_card");
            }
        }

        public static final class InChatAnchor extends InChat {
            public static final InChatAnchor INSTANCE = new InChatAnchor();
            public static final Parcelable.Creator<InChatAnchor> CREATOR = new Parcelable.Creator<InChatAnchor>() { // from class: X.0waN
                @Override // android.os.Parcelable.Creator
                public final AIGroupShotEntry.InChat.InChatAnchor createFromParcel(Parcel parcel) {
                    parcel.readInt();
                    return AIGroupShotEntry.InChat.InChatAnchor.INSTANCE;
                }

                @Override // android.os.Parcelable.Creator
                public final AIGroupShotEntry.InChat.InChatAnchor[] newArray(int i) {
                    return new AIGroupShotEntry.InChat.InChatAnchor[i];
                }
            };

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                parcel.writeInt(1);
            }

            public InChatAnchor() {
                super("anchor");
            }
        }

        public static final class InlineMessage extends InChat {
            public static final InlineMessage INSTANCE = new InlineMessage();
            public static final Parcelable.Creator<InlineMessage> CREATOR = new Parcelable.Creator<InlineMessage>() { // from class: X.0waL
                @Override // android.os.Parcelable.Creator
                public final AIGroupShotEntry.InChat.InlineMessage createFromParcel(Parcel parcel) {
                    parcel.readInt();
                    return AIGroupShotEntry.InChat.InlineMessage.INSTANCE;
                }

                @Override // android.os.Parcelable.Creator
                public final AIGroupShotEntry.InChat.InlineMessage[] newArray(int i) {
                    return new AIGroupShotEntry.InChat.InlineMessage[i];
                }
            };

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                parcel.writeInt(1);
            }

            public InlineMessage() {
                super("inline_message");
            }
        }

        public static final class MessageCardTryDetail extends InChat {
            public static final MessageCardTryDetail INSTANCE = new MessageCardTryDetail();
            public static final Parcelable.Creator<MessageCardTryDetail> CREATOR = new Parcelable.Creator<MessageCardTryDetail>() { // from class: X.0waO
                @Override // android.os.Parcelable.Creator
                public final AIGroupShotEntry.InChat.MessageCardTryDetail createFromParcel(Parcel parcel) {
                    parcel.readInt();
                    return AIGroupShotEntry.InChat.MessageCardTryDetail.INSTANCE;
                }

                @Override // android.os.Parcelable.Creator
                public final AIGroupShotEntry.InChat.MessageCardTryDetail[] newArray(int i) {
                    return new AIGroupShotEntry.InChat.MessageCardTryDetail[i];
                }
            };

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                parcel.writeInt(1);
            }

            public MessageCardTryDetail() {
                super("try_detail_page");
            }
        }

        public static final class MessageCardTryGroupShot extends InChat {
            public static final MessageCardTryGroupShot INSTANCE = new MessageCardTryGroupShot();
            public static final Parcelable.Creator<MessageCardTryGroupShot> CREATOR = new Parcelable.Creator<MessageCardTryGroupShot>() { // from class: X.0waP
                @Override // android.os.Parcelable.Creator
                public final AIGroupShotEntry.InChat.MessageCardTryGroupShot createFromParcel(Parcel parcel) {
                    parcel.readInt();
                    return AIGroupShotEntry.InChat.MessageCardTryGroupShot.INSTANCE;
                }

                @Override // android.os.Parcelable.Creator
                public final AIGroupShotEntry.InChat.MessageCardTryGroupShot[] newArray(int i) {
                    return new AIGroupShotEntry.InChat.MessageCardTryGroupShot[i];
                }
            };

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                parcel.writeInt(1);
            }

            public MessageCardTryGroupShot() {
                super("try_group_shot");
            }
        }

        @Override // com.ss.android.ugc.aweme.aigroupshot.AIGroupShotEntry
        public final String LIZ() {
            return this.entryName;
        }

        public InChat(String str) {
            super(str);
            this.entryName = str;
        }
    }

    public static abstract class OutChat extends AIGroupShotEntry {
        public final String entryName;

        public static final class InboxBottomPopup extends OutChat {
            public static final InboxBottomPopup INSTANCE = new InboxBottomPopup();
            public static final Parcelable.Creator<InboxBottomPopup> CREATOR = new Parcelable.Creator<InboxBottomPopup>() { // from class: X.0waQ
                @Override // android.os.Parcelable.Creator
                public final AIGroupShotEntry.OutChat.InboxBottomPopup createFromParcel(Parcel parcel) {
                    parcel.readInt();
                    return AIGroupShotEntry.OutChat.InboxBottomPopup.INSTANCE;
                }

                @Override // android.os.Parcelable.Creator
                public final AIGroupShotEntry.OutChat.InboxBottomPopup[] newArray(int i) {
                    return new AIGroupShotEntry.OutChat.InboxBottomPopup[i];
                }
            };

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                parcel.writeInt(1);
            }

            public InboxBottomPopup() {
                super("inbox_pop_up");
            }
        }

        public static final class InboxTopBanner extends OutChat {
            public static final InboxTopBanner INSTANCE = new InboxTopBanner();
            public static final Parcelable.Creator<InboxTopBanner> CREATOR = new Parcelable.Creator<InboxTopBanner>() { // from class: X.0waR
                @Override // android.os.Parcelable.Creator
                public final AIGroupShotEntry.OutChat.InboxTopBanner createFromParcel(Parcel parcel) {
                    parcel.readInt();
                    return AIGroupShotEntry.OutChat.InboxTopBanner.INSTANCE;
                }

                @Override // android.os.Parcelable.Creator
                public final AIGroupShotEntry.OutChat.InboxTopBanner[] newArray(int i) {
                    return new AIGroupShotEntry.OutChat.InboxTopBanner[i];
                }
            };

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                parcel.writeInt(1);
            }

            public InboxTopBanner() {
                super("inbox_banner");
            }
        }

        public static final class OutChatAnchor extends OutChat {
            public static final OutChatAnchor INSTANCE = new OutChatAnchor();
            public static final Parcelable.Creator<OutChatAnchor> CREATOR = new Parcelable.Creator<OutChatAnchor>() { // from class: X.0waS
                @Override // android.os.Parcelable.Creator
                public final AIGroupShotEntry.OutChat.OutChatAnchor createFromParcel(Parcel parcel) {
                    parcel.readInt();
                    return AIGroupShotEntry.OutChat.OutChatAnchor.INSTANCE;
                }

                @Override // android.os.Parcelable.Creator
                public final AIGroupShotEntry.OutChat.OutChatAnchor[] newArray(int i) {
                    return new AIGroupShotEntry.OutChat.OutChatAnchor[i];
                }
            };

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                parcel.writeInt(1);
            }

            public OutChatAnchor() {
                super("anchor");
            }
        }

        @Override // com.ss.android.ugc.aweme.aigroupshot.AIGroupShotEntry
        public final String LIZ() {
            return this.entryName;
        }

        public OutChat(String str) {
            super(str);
            this.entryName = str;
        }
    }

    public String LIZ() {
        return this.entryName;
    }

    public AIGroupShotEntry(String str) {
        this.entryName = str;
    }
}
