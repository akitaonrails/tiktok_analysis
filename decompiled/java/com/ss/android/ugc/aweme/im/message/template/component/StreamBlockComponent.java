package com.ss.android.ugc.aweme.im.message.template.component;

import X.C2188811AlT;
import X.C2240741Cn2;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.im.message.template.component.MetadataComponent;
import com.ss.android.ugc.aweme.im.message.template.component.StreamBlockActionComponent;
import com.ss.android.ugc.aweme.im.message.template.component.StreamBlockComponent;
import com.ss.android.ugc.aweme.im.message.template.component.StreamBlockContentComponent;
import com.ss.android.ugc.aweme.im.message.template.component.StreamBlockTypeComponent;
import com.ss.android.ugc.aweme.im.message.template.component.StreamReplyTypeComponent;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes15.dex */
public final class StreamBlockComponent implements BaseComponent<C2240741Cn2> {
    public static final Parcelable.Creator<StreamBlockComponent> CREATOR = new Parcelable.Creator<StreamBlockComponent>() { // from class: X.0ZhH
        @Override // android.os.Parcelable.Creator
        public final StreamBlockComponent createFromParcel(Parcel parcel) {
            return new StreamBlockComponent(parcel.readString(), StreamReplyTypeComponent.CREATOR.createFromParcel(parcel), StreamBlockTypeComponent.CREATOR.createFromParcel(parcel), (StreamBlockContentComponent) parcel.readParcelable(StreamBlockComponent.class.getClassLoader()), StreamBlockActionComponent.CREATOR.createFromParcel(parcel), MetadataComponent.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final StreamBlockComponent[] newArray(int i) {
            return new StreamBlockComponent[i];
        }
    };
    public final StreamBlockActionComponent action;
    public final String blockId;
    public final StreamBlockContentComponent content;
    public final MetadataComponent metadata;
    public final StreamReplyTypeComponent replyType;
    public final StreamBlockTypeComponent type;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StreamBlockComponent)) {
            return false;
        }
        StreamBlockComponent streamBlockComponent = (StreamBlockComponent) obj;
        return Intrinsics.LJFF(this.blockId, streamBlockComponent.blockId) && this.replyType == streamBlockComponent.replyType && this.type == streamBlockComponent.type && Intrinsics.LJFF(this.content, streamBlockComponent.content) && this.action == streamBlockComponent.action && Intrinsics.LJFF(this.metadata, streamBlockComponent.metadata);
    }

    public final int hashCode() {
        return (((((((((this.blockId.hashCode() * 31) + this.replyType.hashCode()) * 31) + this.type.hashCode()) * 31) + this.content.hashCode()) * 31) + this.action.hashCode()) * 31) + this.metadata.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("StreamBlockComponent(blockId=");
        sbLIZ.append(this.blockId);
        sbLIZ.append(", replyType=");
        sbLIZ.append(this.replyType);
        sbLIZ.append(", type=");
        sbLIZ.append(this.type);
        sbLIZ.append(", content=");
        sbLIZ.append(this.content);
        sbLIZ.append(", action=");
        sbLIZ.append(this.action);
        sbLIZ.append(", metadata=");
        sbLIZ.append(this.metadata);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.blockId);
        this.replyType.writeToParcel(parcel, i);
        this.type.writeToParcel(parcel, i);
        parcel.writeParcelable(this.content, i);
        this.action.writeToParcel(parcel, i);
        this.metadata.writeToParcel(parcel, i);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public StreamBlockComponent() {
        StreamReplyTypeComponent streamReplyTypeComponent = StreamReplyTypeComponent.UNKNOWN;
        StreamBlockTypeComponent streamBlockTypeComponent = StreamBlockTypeComponent.UNKNOWN;
        StreamBlockContentComponent.Unknown unknown = StreamBlockContentComponent.Unknown.INSTANCE;
        StreamBlockActionComponent streamBlockActionComponent = StreamBlockActionComponent.UNKNOWN;
        MetadataComponent.Companion.getClass();
        this("", streamReplyTypeComponent, streamBlockTypeComponent, unknown, streamBlockActionComponent, MetadataComponent.EMPTY$delegate.getValue());
    }

    public StreamBlockComponent(String str, StreamReplyTypeComponent streamReplyTypeComponent, StreamBlockTypeComponent streamBlockTypeComponent, StreamBlockContentComponent streamBlockContentComponent, StreamBlockActionComponent streamBlockActionComponent, MetadataComponent metadataComponent) {
        this.blockId = str;
        this.replyType = streamReplyTypeComponent;
        this.type = streamBlockTypeComponent;
        this.content = streamBlockContentComponent;
        this.action = streamBlockActionComponent;
        this.metadata = metadataComponent;
    }
}
