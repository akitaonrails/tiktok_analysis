package com.ss.android.ugc.aweme.im.message.template.component;

import X.C13BV;
import X.C1516540pZE;
import X.C15438062q;
import X.C18ZU;
import X.C2188811AlT;
import X.C2242701CqC;
import X.C2244101CsS;
import X.C2244161CsY;
import X.C2244181Csa;
import X.C2244211Csd;
import X.C2244251Csh;
import X.C2244301Csm;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.im.message.template.component.ActionLinkComponent;
import com.ss.android.ugc.aweme.im.message.template.component.AnchorInfoComponent;
import com.ss.android.ugc.aweme.im.message.template.component.ImageComponent;
import com.ss.android.ugc.aweme.im.message.template.component.ResolutionComponent;
import com.ss.android.ugc.aweme.im.message.template.component.VideoCoverComponent;
import com.ss.android.ugc.aweme.im.message.template.component.VideoCoverType;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes35.dex */
public final class VideoCoverComponent implements BaseComponent<C2244101CsS> {
    public static final VideoCoverComponent EMPTY_VIDEO_COVER;
    public final List<AnchorInfoComponent> anchors;
    public final ImageComponent coverImage;
    public final String id;
    public final ActionLinkComponent linkComponent;
    public final ImageComponent overlay;
    public final ResolutionComponent resolutionComponent;
    public final VideoCoverType videoCoverType;
    public final String videoModel;
    public static final C2242701CqC Companion = new Object() { // from class: X.1CqC
    };
    public static final Parcelable.Creator<VideoCoverComponent> CREATOR = new Parcelable.Creator<VideoCoverComponent>() { // from class: X.1Csc
        @Override // android.os.Parcelable.Creator
        public final VideoCoverComponent createFromParcel(Parcel parcel) {
            ImageComponent imageComponentCreateFromParcel;
            ImageComponent imageComponentCreateFromParcel2;
            ResolutionComponent resolutionComponentCreateFromParcel = null;
            if (parcel.readInt() == 0) {
                imageComponentCreateFromParcel = null;
            } else {
                imageComponentCreateFromParcel = ImageComponent.CREATOR.createFromParcel(parcel);
            }
            ImageComponent imageComponent = imageComponentCreateFromParcel;
            String string = parcel.readString();
            String string2 = parcel.readString();
            VideoCoverType videoCoverTypeCreateFromParcel = VideoCoverType.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() == 0) {
                imageComponentCreateFromParcel2 = null;
            } else {
                imageComponentCreateFromParcel2 = ImageComponent.CREATOR.createFromParcel(parcel);
            }
            ImageComponent imageComponent2 = imageComponentCreateFromParcel2;
            ActionLinkComponent actionLinkComponentCreateFromParcel = ActionLinkComponent.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() != 0) {
                resolutionComponentCreateFromParcel = ResolutionComponent.CREATOR.createFromParcel(parcel);
            }
            ResolutionComponent resolutionComponent = resolutionComponentCreateFromParcel;
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            for (int i2 = 0; i2 != i; i2++) {
                arrayList.add(AnchorInfoComponent.CREATOR.createFromParcel(parcel));
            }
            return new VideoCoverComponent(imageComponent, string, string2, videoCoverTypeCreateFromParcel, imageComponent2, actionLinkComponentCreateFromParcel, resolutionComponent, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final VideoCoverComponent[] newArray(int i) {
            return new VideoCoverComponent[i];
        }
    };

    public VideoCoverComponent() {
        this((ImageComponent) null, (String) null, (String) null, (VideoCoverType) null, (ActionLinkComponent) null, (ResolutionComponent) null, (List) null, 255);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VideoCoverComponent)) {
            return false;
        }
        VideoCoverComponent videoCoverComponent = (VideoCoverComponent) obj;
        return Intrinsics.LJFF(this.coverImage, videoCoverComponent.coverImage) && Intrinsics.LJFF(this.id, videoCoverComponent.id) && Intrinsics.LJFF(this.videoModel, videoCoverComponent.videoModel) && this.videoCoverType == videoCoverComponent.videoCoverType && Intrinsics.LJFF(this.overlay, videoCoverComponent.overlay) && Intrinsics.LJFF(this.linkComponent, videoCoverComponent.linkComponent) && Intrinsics.LJFF(this.resolutionComponent, videoCoverComponent.resolutionComponent) && Intrinsics.LJFF(this.anchors, videoCoverComponent.anchors);
    }

    public final int hashCode() {
        ImageComponent imageComponent = this.coverImage;
        int iHashCode = (((imageComponent == null ? 0 : imageComponent.hashCode()) * 31) + this.id.hashCode()) * 31;
        String str = this.videoModel;
        int iHashCode2 = (((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.videoCoverType.hashCode()) * 31;
        ImageComponent imageComponent2 = this.overlay;
        int iHashCode3 = (((iHashCode2 + (imageComponent2 == null ? 0 : imageComponent2.hashCode())) * 31) + this.linkComponent.hashCode()) * 31;
        ResolutionComponent resolutionComponent = this.resolutionComponent;
        return ((iHashCode3 + (resolutionComponent != null ? resolutionComponent.hashCode() : 0)) * 31) + this.anchors.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("VideoCoverComponent(coverImage=");
        sbLIZ.append(this.coverImage);
        sbLIZ.append(", id=");
        sbLIZ.append(this.id);
        sbLIZ.append(", videoModel=");
        sbLIZ.append(this.videoModel);
        sbLIZ.append(", videoCoverType=");
        sbLIZ.append(this.videoCoverType);
        sbLIZ.append(", overlay=");
        sbLIZ.append(this.overlay);
        sbLIZ.append(", linkComponent=");
        sbLIZ.append(this.linkComponent);
        sbLIZ.append(", resolutionComponent=");
        sbLIZ.append(this.resolutionComponent);
        sbLIZ.append(", anchors=");
        sbLIZ.append(this.anchors);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        ImageComponent imageComponent = this.coverImage;
        if (imageComponent == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            imageComponent.writeToParcel(parcel, i);
        }
        parcel.writeString(this.id);
        parcel.writeString(this.videoModel);
        this.videoCoverType.writeToParcel(parcel, i);
        ImageComponent imageComponent2 = this.overlay;
        if (imageComponent2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            imageComponent2.writeToParcel(parcel, i);
        }
        this.linkComponent.writeToParcel(parcel, i);
        ResolutionComponent resolutionComponent = this.resolutionComponent;
        if (resolutionComponent == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            resolutionComponent.writeToParcel(parcel, i);
        }
        List<AnchorInfoComponent> list = this.anchors;
        parcel.writeInt(list.size());
        Iterator<AnchorInfoComponent> it2 = list.iterator();
        while (it2.hasNext()) {
            it2.next().writeToParcel(parcel, i);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.1CqC] */
    static {
        ImageComponent.Companion.getClass();
        EMPTY_VIDEO_COVER = new VideoCoverComponent(C18ZU.LIZ(), (String) null, (String) null, (VideoCoverType) null, (ActionLinkComponent) null, (ResolutionComponent) null, (List) null, 254);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.util.List, java.util.List<X.1CsW>] */
    /* JADX WARN: Type inference failed for: r3v2, types: [X.13BV] */
    public final C2244101CsS LIZIZ() {
        C2244161CsY c2244161CsYLIZIZ;
        ?? arrayList;
        C2244181Csa c2244181Csa = new C2244181Csa();
        c2244181Csa.LIZLLL = this.id;
        c2244181Csa.LJ = this.videoCoverType.toProto();
        c2244181Csa.LJI = this.videoModel;
        ImageComponent imageComponent = this.coverImage;
        c2244181Csa.LJFF = imageComponent != null ? imageComponent.LIZIZ() : null;
        c2244181Csa.LJII = this.linkComponent.LIZIZ();
        ResolutionComponent resolutionComponent = this.resolutionComponent;
        if (resolutionComponent != null) {
            C2244251Csh c2244251Csh = new C2244251Csh();
            c2244251Csh.LIZLLL = Integer.valueOf(resolutionComponent.width);
            c2244251Csh.LJ = Integer.valueOf(resolutionComponent.height);
            c2244161CsYLIZIZ = c2244251Csh.build();
        } else {
            c2244161CsYLIZIZ = null;
        }
        c2244181Csa.LJIIIIZZ = c2244161CsYLIZIZ;
        List<AnchorInfoComponent> list = this.anchors;
        if (list.isEmpty()) {
            arrayList = C13BV.INSTANCE;
        } else {
            arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
            for (AnchorInfoComponent anchorInfoComponent : list) {
                anchorInfoComponent.getClass();
                C2244211Csd c2244211Csd = new C2244211Csd();
                c2244211Csd.LIZLLL = anchorInfoComponent.keyword;
                ActionLinkComponent actionLinkComponent = anchorInfoComponent.schema;
                c2244211Csd.LJ = actionLinkComponent != null ? actionLinkComponent.LIZIZ() : null;
                c2244211Csd.LJFF = anchorInfoComponent.id;
                ImageComponent imageComponent2 = anchorInfoComponent.icon;
                c2244211Csd.LJI = imageComponent2 != null ? imageComponent2.LIZIZ() : null;
                c2244211Csd.LJII = anchorInfoComponent.extra;
                c2244211Csd.LJIIIIZZ = anchorInfoComponent.type.toProto();
                arrayList.add(c2244211Csd.build());
            }
        }
        C1516540pZE.LIZ(arrayList);
        c2244181Csa.LJIIIZ = arrayList;
        return c2244181Csa.build();
    }

    public static VideoCoverComponent LIZ(VideoCoverComponent videoCoverComponent, ImageComponent imageComponent) {
        String str = videoCoverComponent.id;
        String str2 = videoCoverComponent.videoModel;
        VideoCoverType videoCoverType = videoCoverComponent.videoCoverType;
        ImageComponent imageComponent2 = videoCoverComponent.overlay;
        ActionLinkComponent actionLinkComponent = videoCoverComponent.linkComponent;
        ResolutionComponent resolutionComponent = videoCoverComponent.resolutionComponent;
        List<AnchorInfoComponent> list = videoCoverComponent.anchors;
        videoCoverComponent.getClass();
        return new VideoCoverComponent(imageComponent, str, str2, videoCoverType, imageComponent2, actionLinkComponent, resolutionComponent, list);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public VideoCoverComponent(ImageComponent imageComponent, String str, String str2, VideoCoverType videoCoverType, ActionLinkComponent actionLinkComponent, ResolutionComponent resolutionComponent, List list, int i) {
        List list2 = list;
        ResolutionComponent resolutionComponent2 = resolutionComponent;
        ActionLinkComponent actionLinkComponentLIZ = actionLinkComponent;
        VideoCoverType videoCoverType2 = videoCoverType;
        String str3 = str2;
        String str4 = str;
        ImageComponent imageComponent2 = (i & 1) != 0 ? null : imageComponent;
        str4 = (i & 2) != 0 ? "" : str4;
        str3 = (i & 4) != 0 ? null : str3;
        videoCoverType2 = (i & 8) != 0 ? VideoCoverType.INVALID : videoCoverType2;
        if ((i & 32) != 0) {
            ActionLinkComponent.Companion.getClass();
            actionLinkComponentLIZ = C2244301Csm.LIZ();
        }
        this(imageComponent2, str4, str3, videoCoverType2, (ImageComponent) null, actionLinkComponentLIZ, (i & 64) != 0 ? null : resolutionComponent2, (List<AnchorInfoComponent>) ((i & 128) != 0 ? C13BV.INSTANCE : list2));
    }

    public VideoCoverComponent(ImageComponent imageComponent, String str, String str2, VideoCoverType videoCoverType, ImageComponent imageComponent2, ActionLinkComponent actionLinkComponent, ResolutionComponent resolutionComponent, List<AnchorInfoComponent> list) {
        this.coverImage = imageComponent;
        this.id = str;
        this.videoModel = str2;
        this.videoCoverType = videoCoverType;
        this.overlay = imageComponent2;
        this.linkComponent = actionLinkComponent;
        this.resolutionComponent = resolutionComponent;
        this.anchors = list;
    }
}
