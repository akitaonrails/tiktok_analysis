package com.ss.android.ugc.aweme.im.streaming.api;

import X.C2188811AlT;
import X.C906150Zgj;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.im.message.template.component.MetadataComponent;
import com.ss.android.ugc.aweme.im.message.template.component.StreamBlockContentComponent;
import com.ss.android.ugc.aweme.im.message.template.component.StreamBlockTypeComponent;
import com.ss.android.ugc.aweme.im.message.template.component.StreamReplyTypeComponent;
import com.ss.android.ugc.aweme.im.streaming.api.BlockUIData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes15.dex */
public final class BlockUIData implements Parcelable {
    public final String blockId;
    public final StreamBlockTypeComponent blockType;
    public final StreamBlockContentComponent content;
    public final MetadataComponent metadata;
    public final StreamReplyTypeComponent replyType;
    public static final C906150Zgj Companion = new C906150Zgj();
    public static final Parcelable.Creator<BlockUIData> CREATOR = new Parcelable.Creator<BlockUIData>() { // from class: X.0Zgk
        @Override // android.os.Parcelable.Creator
        public final BlockUIData createFromParcel(Parcel parcel) {
            return new BlockUIData(parcel.readString(), (StreamReplyTypeComponent) parcel.readParcelable(BlockUIData.class.getClassLoader()), (StreamBlockTypeComponent) parcel.readParcelable(BlockUIData.class.getClassLoader()), (StreamBlockContentComponent) parcel.readParcelable(BlockUIData.class.getClassLoader()), (MetadataComponent) parcel.readParcelable(BlockUIData.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final BlockUIData[] newArray(int i) {
            return new BlockUIData[i];
        }
    };

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BlockUIData)) {
            return false;
        }
        BlockUIData blockUIData = (BlockUIData) obj;
        return Intrinsics.LJFF(this.blockId, blockUIData.blockId) && this.replyType == blockUIData.replyType && this.blockType == blockUIData.blockType && Intrinsics.LJFF(this.content, blockUIData.content) && Intrinsics.LJFF(this.metadata, blockUIData.metadata);
    }

    public final int hashCode() {
        return (((((((this.blockId.hashCode() * 31) + this.replyType.hashCode()) * 31) + this.blockType.hashCode()) * 31) + this.content.hashCode()) * 31) + this.metadata.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("BlockUIData(blockId=");
        sbLIZ.append(this.blockId);
        sbLIZ.append(", replyType=");
        sbLIZ.append(this.replyType);
        sbLIZ.append(", blockType=");
        sbLIZ.append(this.blockType);
        sbLIZ.append(", content=");
        sbLIZ.append(this.content);
        sbLIZ.append(", metadata=");
        sbLIZ.append(this.metadata);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.blockId);
        parcel.writeParcelable(this.replyType, i);
        parcel.writeParcelable(this.blockType, i);
        parcel.writeParcelable(this.content, i);
        parcel.writeParcelable(this.metadata, i);
    }

    public BlockUIData(String str, StreamReplyTypeComponent streamReplyTypeComponent, StreamBlockTypeComponent streamBlockTypeComponent, StreamBlockContentComponent streamBlockContentComponent, MetadataComponent metadataComponent) {
        this.blockId = str;
        this.replyType = streamReplyTypeComponent;
        this.blockType = streamBlockTypeComponent;
        this.content = streamBlockContentComponent;
        this.metadata = metadataComponent;
    }
}
