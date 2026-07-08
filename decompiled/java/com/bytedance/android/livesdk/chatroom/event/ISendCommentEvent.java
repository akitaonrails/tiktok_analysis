package com.bytedance.android.livesdk.chatroom.event;

import X.C08FF;
import X.C1114520f6o;
import X.C2254308sP;
import X.InterfaceC2044707zh;
import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.android.livesdk.chatroom.event.ISendCommentEvent;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes18.dex */
public interface ISendCommentEvent {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class Sender implements Parcelable {
        public static final /* synthetic */ InterfaceC2044707zh $ENTRIES;
        public static final /* synthetic */ Sender[] $VALUES;
        public static final Sender COMMENTWIDGET;
        public static final Sender COMMENT_COMBO_TRAY;
        public static final Sender COMMENT_GAME_MODERATOR_TIPS;
        public static final Sender COMMENT_GAME_MOMENT;
        public static final Sender COMMENT_GAME_MOMENT_DEFEAT;
        public static final Sender COMMENT_GAME_MOMENT_HIGHLIGHT;
        public static final C1114520f6o CREATOR;
        public static final Sender LOTTERY;
        public static final Sender POLL;
        public static final Sender QA;
        public static final Sender QUICKCOMMENT;
        public static final Sender QUICKCOMMENTFIRSTGIFT;
        public static final Sender QUICKEMOTECOMMENT;
        public static final Sender QUICKSUBGIFTCOMMENT;
        public static final Sender QUICK_COMMENT_EC;
        public static final Sender QUICK_COMMENT_GAME_MODERATOR_TIPS;
        public static final Sender REPLY;
        public static final Sender UNKNOWN;
        public static final Sender WELCOME_CAPSULE;
        public Map<String, String> logArgs = new LinkedHashMap();

        public static InterfaceC2044707zh<Sender> getEntries() {
            return $ENTRIES;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        /* JADX WARN: Type inference failed for: r0v19, types: [X.0f6o] */
        static {
            Sender sender = new Sender("UNKNOWN", 0);
            UNKNOWN = sender;
            Sender sender2 = new Sender("COMMENTWIDGET", 1);
            COMMENTWIDGET = sender2;
            Sender sender3 = new Sender("LOTTERY", 2);
            LOTTERY = sender3;
            Sender sender4 = new Sender("QA", 3);
            QA = sender4;
            Sender sender5 = new Sender("POLL", 4);
            POLL = sender5;
            Sender sender6 = new Sender("QUICKCOMMENT", 5);
            QUICKCOMMENT = sender6;
            Sender sender7 = new Sender("REPLY", 6);
            REPLY = sender7;
            Sender sender8 = new Sender("QUICKEMOTECOMMENT", 7);
            QUICKEMOTECOMMENT = sender8;
            Sender sender9 = new Sender("QUICKCOMMENTFIRSTGIFT", 8);
            QUICKCOMMENTFIRSTGIFT = sender9;
            Sender sender10 = new Sender("QUICKSUBGIFTCOMMENT", 9);
            QUICKSUBGIFTCOMMENT = sender10;
            Sender sender11 = new Sender("QUICK_COMMENT_EC", 10);
            QUICK_COMMENT_EC = sender11;
            Sender sender12 = new Sender("COMMENT_COMBO_TRAY", 11);
            COMMENT_COMBO_TRAY = sender12;
            Sender sender13 = new Sender("COMMENT_GAME_MOMENT", 12);
            COMMENT_GAME_MOMENT = sender13;
            Sender sender14 = new Sender("COMMENT_GAME_MOMENT_DEFEAT", 13);
            COMMENT_GAME_MOMENT_DEFEAT = sender14;
            Sender sender15 = new Sender("COMMENT_GAME_MOMENT_HIGHLIGHT", 14);
            COMMENT_GAME_MOMENT_HIGHLIGHT = sender15;
            Sender sender16 = new Sender("QUICK_COMMENT_GAME_MODERATOR_TIPS", 15);
            QUICK_COMMENT_GAME_MODERATOR_TIPS = sender16;
            Sender sender17 = new Sender("COMMENT_GAME_MODERATOR_TIPS", 16);
            COMMENT_GAME_MODERATOR_TIPS = sender17;
            Sender sender18 = new Sender("WELCOME_CAPSULE", 17);
            WELCOME_CAPSULE = sender18;
            Sender[] senderArr = {sender, sender2, sender3, sender4, sender5, sender6, sender7, sender8, sender9, sender10, sender11, sender12, sender13, sender14, sender15, sender16, sender17, sender18};
            $VALUES = senderArr;
            $ENTRIES = new C2254308sP(senderArr);
            CREATOR = new Parcelable.Creator<Sender>() { // from class: X.0f6o
                @Override // android.os.Parcelable.Creator
                public final ISendCommentEvent.Sender createFromParcel(Parcel parcel) {
                    String string = parcel.readString();
                    if (string == null) {
                        string = "UNKNOWN";
                    }
                    ISendCommentEvent.Sender senderValueOf = ISendCommentEvent.Sender.valueOf(string);
                    parcel.readMap(senderValueOf.getLogArgs(), Map.class.getClassLoader());
                    return senderValueOf;
                }

                @Override // android.os.Parcelable.Creator
                public final ISendCommentEvent.Sender[] newArray(int i) {
                    return new ISendCommentEvent.Sender[i];
                }
            };
        }

        public static Sender[] values() {
            return (Sender[]) $VALUES.clone();
        }

        public final Map<String, String> getLogArgs() {
            return this.logArgs;
        }

        public static Sender valueOf(String str) {
            return (Sender) C08FF.LIZ(Sender.class, str);
        }

        public final void setLogArgs(Map<String, String> map) {
            this.logArgs = map;
        }

        public Sender(String str, int i) {
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(name());
            parcel.writeMap(this.logArgs);
        }
    }
}
