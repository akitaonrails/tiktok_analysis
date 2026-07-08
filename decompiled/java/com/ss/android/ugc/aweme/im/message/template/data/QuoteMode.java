package com.ss.android.ugc.aweme.im.message.template.data;

import X.C2188811AlT;
import X.C786410Ut5;
import X.C896220ZDw;
import X.C896410ZEp;
import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.im.core.proto.ReferenceInfo;
import com.ss.android.ugc.aweme.im.message.template.component.AttachmentComponent;
import com.ss.android.ugc.aweme.im.message.template.data.QuoteMode;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes15.dex */
public interface QuoteMode extends Parcelable {
    public static final C896410ZEp Companion = C896410ZEp.LIZ;

    boolean MK();

    AttachmentComponent T3();

    ReferenceInfo jK();

    public static final class None implements QuoteMode {
        public static final None INSTANCE = new None();
        public static final Parcelable.Creator<None> CREATOR = new Parcelable.Creator<None>() { // from class: X.0ZE4
            @Override // android.os.Parcelable.Creator
            public final QuoteMode.None createFromParcel(Parcel parcel) {
                parcel.readInt();
                return QuoteMode.None.INSTANCE;
            }

            @Override // android.os.Parcelable.Creator
            public final QuoteMode.None[] newArray(int i) {
                return new QuoteMode.None[i];
            }
        };

        @Override // com.ss.android.ugc.aweme.im.message.template.data.QuoteMode
        public final boolean MK() {
            return true;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(1);
        }

        @Override // com.ss.android.ugc.aweme.im.message.template.data.QuoteMode
        public final AttachmentComponent T3() {
            return C896220ZDw.LIZ(this);
        }

        @Override // com.ss.android.ugc.aweme.im.message.template.data.QuoteMode
        public final ReferenceInfo jK() {
            return C896220ZDw.LIZIZ(this);
        }
    }

    public static final class Quote implements QuoteMode {
        public static final Parcelable.Creator<Quote> CREATOR = new Parcelable.Creator<Quote>() { // from class: X.0ZE3
            @Override // android.os.Parcelable.Creator
            public final QuoteMode.Quote createFromParcel(Parcel parcel) {
                boolean z;
                AttachmentComponent attachmentComponentCreateFromParcel = AttachmentComponent.CREATOR.createFromParcel(parcel);
                if (parcel.readInt() != 0) {
                    z = true;
                } else {
                    z = false;
                }
                return new QuoteMode.Quote(attachmentComponentCreateFromParcel, z);
            }

            @Override // android.os.Parcelable.Creator
            public final QuoteMode.Quote[] newArray(int i) {
                return new QuoteMode.Quote[i];
            }
        };
        public final AttachmentComponent attachment;
        public final boolean quoteFirstOnly;

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Quote)) {
                return false;
            }
            Quote quote = (Quote) obj;
            return Intrinsics.LJFF(this.attachment, quote.attachment) && this.quoteFirstOnly == quote.quoteFirstOnly;
        }

        public final int hashCode() {
            return (this.attachment.hashCode() * 31) + C786410Ut5.Z2(this.quoteFirstOnly);
        }

        public final String toString() {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Quote(attachment=");
            sbLIZ.append(this.attachment);
            sbLIZ.append(", quoteFirstOnly=");
            sbLIZ.append(this.quoteFirstOnly);
            sbLIZ.append(')');
            return C2188811AlT.LIZIZ(sbLIZ);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            this.attachment.writeToParcel(parcel, i);
            parcel.writeInt(this.quoteFirstOnly ? 1 : 0);
        }

        @Override // com.ss.android.ugc.aweme.im.message.template.data.QuoteMode
        public final AttachmentComponent T3() {
            return C896220ZDw.LIZ(this);
        }

        @Override // com.ss.android.ugc.aweme.im.message.template.data.QuoteMode
        public final ReferenceInfo jK() {
            return C896220ZDw.LIZIZ(this);
        }

        @Override // com.ss.android.ugc.aweme.im.message.template.data.QuoteMode
        public final boolean MK() {
            return this.quoteFirstOnly;
        }

        public Quote(AttachmentComponent attachmentComponent, boolean z) {
            this.attachment = attachmentComponent;
            this.quoteFirstOnly = z;
        }
    }

    public static final class Reply implements QuoteMode {
        public static final Parcelable.Creator<Reply> CREATOR = new Parcelable.Creator<Reply>() { // from class: X.0ZDv
            @Override // android.os.Parcelable.Creator
            public final QuoteMode.Reply createFromParcel(Parcel parcel) {
                boolean z;
                ReferenceInfo referenceInfo = (ReferenceInfo) parcel.readParcelable(QuoteMode.Reply.class.getClassLoader());
                if (parcel.readInt() != 0) {
                    z = true;
                } else {
                    z = false;
                }
                return new QuoteMode.Reply(referenceInfo, z);
            }

            @Override // android.os.Parcelable.Creator
            public final QuoteMode.Reply[] newArray(int i) {
                return new QuoteMode.Reply[i];
            }
        };
        public final boolean quoteFirstOnly;
        public final ReferenceInfo refInfo;

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Reply)) {
                return false;
            }
            Reply reply = (Reply) obj;
            return Intrinsics.LJFF(this.refInfo, reply.refInfo) && this.quoteFirstOnly == reply.quoteFirstOnly;
        }

        public final int hashCode() {
            return (this.refInfo.hashCode() * 31) + C786410Ut5.Z2(this.quoteFirstOnly);
        }

        public final String toString() {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Reply(refInfo=");
            sbLIZ.append(this.refInfo);
            sbLIZ.append(", quoteFirstOnly=");
            sbLIZ.append(this.quoteFirstOnly);
            sbLIZ.append(')');
            return C2188811AlT.LIZIZ(sbLIZ);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeParcelable(this.refInfo, i);
            parcel.writeInt(this.quoteFirstOnly ? 1 : 0);
        }

        @Override // com.ss.android.ugc.aweme.im.message.template.data.QuoteMode
        public final AttachmentComponent T3() {
            return C896220ZDw.LIZ(this);
        }

        @Override // com.ss.android.ugc.aweme.im.message.template.data.QuoteMode
        public final ReferenceInfo jK() {
            return C896220ZDw.LIZIZ(this);
        }

        @Override // com.ss.android.ugc.aweme.im.message.template.data.QuoteMode
        public final boolean MK() {
            return this.quoteFirstOnly;
        }

        public Reply(ReferenceInfo referenceInfo, boolean z) {
            this.refInfo = referenceInfo;
            this.quoteFirstOnly = z;
        }
    }

    public static final class Thought implements QuoteMode {
        public static final Parcelable.Creator<Thought> CREATOR = new Parcelable.Creator<Thought>() { // from class: X.0ZDu
            @Override // android.os.Parcelable.Creator
            public final QuoteMode.Thought createFromParcel(Parcel parcel) {
                boolean z;
                String string = parcel.readString();
                long j = parcel.readLong();
                long j2 = parcel.readLong();
                String string2 = parcel.readString();
                if (parcel.readInt() != 0) {
                    z = true;
                } else {
                    z = false;
                }
                return new QuoteMode.Thought(j, j2, z, string, string2);
            }

            @Override // android.os.Parcelable.Creator
            public final QuoteMode.Thought[] newArray(int i) {
                return new QuoteMode.Thought[i];
            }
        };
        public final String content;
        public final String id;
        public final long originalCreateTime;
        public final boolean quoteFirstOnly;
        public final long uid;

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Thought)) {
                return false;
            }
            Thought thought = (Thought) obj;
            return Intrinsics.LJFF(this.id, thought.id) && this.uid == thought.uid && this.originalCreateTime == thought.originalCreateTime && Intrinsics.LJFF(this.content, thought.content) && this.quoteFirstOnly == thought.quoteFirstOnly;
        }

        public final int hashCode() {
            int iHashCode = ((((this.id.hashCode() * 31) + C786410Ut5.Y2(this.uid)) * 31) + C786410Ut5.Y2(this.originalCreateTime)) * 31;
            String str = this.content;
            return ((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + C786410Ut5.Z2(this.quoteFirstOnly);
        }

        public final String toString() {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Thought(id=");
            sbLIZ.append(this.id);
            sbLIZ.append(", uid=");
            sbLIZ.append(this.uid);
            sbLIZ.append(", originalCreateTime=");
            sbLIZ.append(this.originalCreateTime);
            sbLIZ.append(", content=");
            sbLIZ.append(this.content);
            sbLIZ.append(", quoteFirstOnly=");
            sbLIZ.append(this.quoteFirstOnly);
            sbLIZ.append(')');
            return C2188811AlT.LIZIZ(sbLIZ);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.id);
            parcel.writeLong(this.uid);
            parcel.writeLong(this.originalCreateTime);
            parcel.writeString(this.content);
            parcel.writeInt(this.quoteFirstOnly ? 1 : 0);
        }

        @Override // com.ss.android.ugc.aweme.im.message.template.data.QuoteMode
        public final AttachmentComponent T3() {
            return C896220ZDw.LIZ(this);
        }

        @Override // com.ss.android.ugc.aweme.im.message.template.data.QuoteMode
        public final ReferenceInfo jK() {
            return C896220ZDw.LIZIZ(this);
        }

        @Override // com.ss.android.ugc.aweme.im.message.template.data.QuoteMode
        public final boolean MK() {
            return this.quoteFirstOnly;
        }

        public Thought(long j, long j2, boolean z, String str, String str2) {
            this.id = str;
            this.uid = j;
            this.originalCreateTime = j2;
            this.content = str2;
            this.quoteFirstOnly = z;
        }
    }
}
