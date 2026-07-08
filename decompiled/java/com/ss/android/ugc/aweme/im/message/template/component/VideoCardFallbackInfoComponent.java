package com.ss.android.ugc.aweme.im.message.template.component;

import X.C18ZU;
import X.C2188811AlT;
import X.C2242691CqB;
import X.C2242721CqE;
import X.C2242741CqG;
import X.C2243491CrT;
import X.C2244301Csm;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.im.message.template.component.ActionLinkComponent;
import com.ss.android.ugc.aweme.im.message.template.component.FallbackStatusComponent;
import com.ss.android.ugc.aweme.im.message.template.component.ImageComponent;
import com.ss.android.ugc.aweme.im.message.template.component.TextComponent;
import com.ss.android.ugc.aweme.im.message.template.component.VideoCardFallbackInfoComponent;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes35.dex */
public final class VideoCardFallbackInfoComponent implements BaseComponent<C2242721CqE> {
    public final ImageComponent image;
    public final ActionLinkComponent linkInfo;
    public final FallbackStatusComponent status;
    public final TextComponent text;
    public static final C2242691CqB Companion = new Object() { // from class: X.1CqB
    };
    public static final Parcelable.Creator<VideoCardFallbackInfoComponent> CREATOR = new Parcelable.Creator<VideoCardFallbackInfoComponent>() { // from class: X.1CqH
        @Override // android.os.Parcelable.Creator
        public final VideoCardFallbackInfoComponent createFromParcel(Parcel parcel) {
            return new VideoCardFallbackInfoComponent(ImageComponent.CREATOR.createFromParcel(parcel), TextComponent.CREATOR.createFromParcel(parcel), ActionLinkComponent.CREATOR.createFromParcel(parcel), FallbackStatusComponent.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final VideoCardFallbackInfoComponent[] newArray(int i) {
            return new VideoCardFallbackInfoComponent[i];
        }
    };
    public static final VideoCardFallbackInfoComponent EMPTY_FALLBACK = new VideoCardFallbackInfoComponent(null, 15);

    public VideoCardFallbackInfoComponent() {
        this(null, 15);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VideoCardFallbackInfoComponent)) {
            return false;
        }
        VideoCardFallbackInfoComponent videoCardFallbackInfoComponent = (VideoCardFallbackInfoComponent) obj;
        return Intrinsics.LJFF(this.image, videoCardFallbackInfoComponent.image) && Intrinsics.LJFF(this.text, videoCardFallbackInfoComponent.text) && Intrinsics.LJFF(this.linkInfo, videoCardFallbackInfoComponent.linkInfo) && this.status == videoCardFallbackInfoComponent.status;
    }

    public final int hashCode() {
        return (((((this.image.hashCode() * 31) + this.text.hashCode()) * 31) + this.linkInfo.hashCode()) * 31) + this.status.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("VideoCardFallbackInfoComponent(image=");
        sbLIZ.append(this.image);
        sbLIZ.append(", text=");
        sbLIZ.append(this.text);
        sbLIZ.append(", linkInfo=");
        sbLIZ.append(this.linkInfo);
        sbLIZ.append(", status=");
        sbLIZ.append(this.status);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        this.image.writeToParcel(parcel, i);
        this.text.writeToParcel(parcel, i);
        this.linkInfo.writeToParcel(parcel, i);
        this.status.writeToParcel(parcel, i);
    }

    public final C2242721CqE LIZIZ() {
        C2242741CqG c2242741CqG = new C2242741CqG();
        c2242741CqG.LIZLLL = this.image.LIZIZ();
        c2242741CqG.LJ = this.text.LIZ();
        c2242741CqG.LJFF = this.linkInfo.LIZIZ();
        c2242741CqG.LJI = this.status.toProto();
        return c2242741CqG.build();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ VideoCardFallbackInfoComponent(TextComponent textComponent, int i) {
        ImageComponent imageComponentLIZ;
        ActionLinkComponent actionLinkComponentLIZ;
        if ((i & 1) != 0) {
            ImageComponent.Companion.getClass();
            imageComponentLIZ = C18ZU.LIZ();
        } else {
            imageComponentLIZ = null;
        }
        if ((i & 2) != 0) {
            TextComponent.Companion.getClass();
            textComponent = C2243491CrT.LIZ();
        }
        if ((i & 4) != 0) {
            ActionLinkComponent.Companion.getClass();
            actionLinkComponentLIZ = C2244301Csm.LIZ();
        } else {
            actionLinkComponentLIZ = null;
        }
        this(imageComponentLIZ, textComponent, actionLinkComponentLIZ, (i & 8) != 0 ? FallbackStatusComponent.UNKNOWN : null);
    }

    public static VideoCardFallbackInfoComponent LIZ(VideoCardFallbackInfoComponent videoCardFallbackInfoComponent, ImageComponent imageComponent) {
        TextComponent textComponent = videoCardFallbackInfoComponent.text;
        ActionLinkComponent actionLinkComponent = videoCardFallbackInfoComponent.linkInfo;
        FallbackStatusComponent fallbackStatusComponent = videoCardFallbackInfoComponent.status;
        videoCardFallbackInfoComponent.getClass();
        return new VideoCardFallbackInfoComponent(imageComponent, textComponent, actionLinkComponent, fallbackStatusComponent);
    }

    public VideoCardFallbackInfoComponent(ImageComponent imageComponent, TextComponent textComponent, ActionLinkComponent actionLinkComponent, FallbackStatusComponent fallbackStatusComponent) {
        this.image = imageComponent;
        this.text = textComponent;
        this.linkInfo = actionLinkComponent;
        this.status = fallbackStatusComponent;
    }
}
