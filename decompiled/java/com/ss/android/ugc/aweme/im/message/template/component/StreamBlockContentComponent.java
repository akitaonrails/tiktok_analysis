package com.ss.android.ugc.aweme.im.message.template.component;

import X.C1516540pZE;
import X.C2188811AlT;
import X.C2240111Cm1;
import X.C2240171Cm7;
import X.C2240181Cm8;
import X.C2240211CmB;
import X.C2240271CmH;
import X.C906780Zhk;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.im.message.template.component.ImageStreamBlockComponent;
import com.ss.android.ugc.aweme.im.message.template.component.MarkdownStreamBlockComponent;
import com.ss.android.ugc.aweme.im.message.template.component.StreamBlockContentComponent;
import com.ss.android.ugc.aweme.im.message.template.component.TextStreamBlockComponent;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes15.dex */
public interface StreamBlockContentComponent extends BaseComponent<C2240171Cm7> {
    public static final C906780Zhk Companion = new Object() { // from class: X.0Zhk
    };

    /* JADX INFO: loaded from: classes35.dex */
    public static final class Image implements StreamBlockContentComponent {
        public static final Parcelable.Creator<Image> CREATOR = new Parcelable.Creator<Image>() { // from class: X.1CmJ
            @Override // android.os.Parcelable.Creator
            public final StreamBlockContentComponent.Image createFromParcel(Parcel parcel) {
                return new StreamBlockContentComponent.Image(ImageStreamBlockComponent.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final StreamBlockContentComponent.Image[] newArray(int i) {
                return new StreamBlockContentComponent.Image[i];
            }
        };
        public final ImageStreamBlockComponent imageStreamBlock;

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Image) && Intrinsics.LJFF(this.imageStreamBlock, ((Image) obj).imageStreamBlock);
        }

        public final int hashCode() {
            return this.imageStreamBlock.hashCode();
        }

        public final String toString() {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Image(imageStreamBlock=");
            sbLIZ.append(this.imageStreamBlock);
            sbLIZ.append(')');
            return C2188811AlT.LIZIZ(sbLIZ);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            this.imageStreamBlock.writeToParcel(parcel, i);
        }

        @Override // com.ss.android.ugc.aweme.im.message.template.component.BaseComponent
        public final C2240171Cm7 toProto() {
            C2240181Cm8 c2240181Cm8 = new C2240181Cm8();
            ImageStreamBlockComponent imageStreamBlockComponent = this.imageStreamBlock;
            imageStreamBlockComponent.getClass();
            C2240271CmH c2240271CmH = new C2240271CmH();
            c2240271CmH.LIZLLL = imageStreamBlockComponent.status.toProto();
            c2240271CmH.LJ = Integer.valueOf(imageStreamBlockComponent.width);
            c2240271CmH.LJFF = Integer.valueOf(imageStreamBlockComponent.height);
            c2240271CmH.LJI = imageStreamBlockComponent.uri;
            List<String> list = imageStreamBlockComponent.url;
            C1516540pZE.LIZ(list);
            c2240271CmH.LJII = list;
            c2240271CmH.LJIIIIZZ = imageStreamBlockComponent.displayName;
            c2240181Cm8.LJ = c2240271CmH.build();
            return c2240181Cm8.build();
        }

        public Image(ImageStreamBlockComponent imageStreamBlockComponent) {
            this.imageStreamBlock = imageStreamBlockComponent;
        }
    }

    /* JADX INFO: loaded from: classes35.dex */
    public static final class Markdown implements StreamBlockContentComponent {
        public static final Parcelable.Creator<Markdown> CREATOR = new Parcelable.Creator<Markdown>() { // from class: X.1CmC
            @Override // android.os.Parcelable.Creator
            public final StreamBlockContentComponent.Markdown createFromParcel(Parcel parcel) {
                return new StreamBlockContentComponent.Markdown(MarkdownStreamBlockComponent.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final StreamBlockContentComponent.Markdown[] newArray(int i) {
                return new StreamBlockContentComponent.Markdown[i];
            }
        };
        public final MarkdownStreamBlockComponent markdownStreamBlock;

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Markdown) && Intrinsics.LJFF(this.markdownStreamBlock, ((Markdown) obj).markdownStreamBlock);
        }

        public final int hashCode() {
            return this.markdownStreamBlock.hashCode();
        }

        public final String toString() {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Markdown(markdownStreamBlock=");
            sbLIZ.append(this.markdownStreamBlock);
            sbLIZ.append(')');
            return C2188811AlT.LIZIZ(sbLIZ);
        }

        @Override // com.ss.android.ugc.aweme.im.message.template.component.BaseComponent
        public final C2240171Cm7 toProto() {
            C2240181Cm8 c2240181Cm8 = new C2240181Cm8();
            MarkdownStreamBlockComponent markdownStreamBlockComponent = this.markdownStreamBlock;
            markdownStreamBlockComponent.getClass();
            C2240211CmB c2240211CmB = new C2240211CmB();
            c2240211CmB.LIZLLL = markdownStreamBlockComponent.text;
            c2240181Cm8.LJFF = c2240211CmB.build();
            return c2240181Cm8.build();
        }

        public Markdown(MarkdownStreamBlockComponent markdownStreamBlockComponent) {
            this.markdownStreamBlock = markdownStreamBlockComponent;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.markdownStreamBlock.text);
        }
    }

    /* JADX INFO: loaded from: classes35.dex */
    public static final class Text implements StreamBlockContentComponent {
        public static final Parcelable.Creator<Text> CREATOR = new Parcelable.Creator<Text>() { // from class: X.1Cm4
            @Override // android.os.Parcelable.Creator
            public final StreamBlockContentComponent.Text createFromParcel(Parcel parcel) {
                return new StreamBlockContentComponent.Text(TextStreamBlockComponent.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final StreamBlockContentComponent.Text[] newArray(int i) {
                return new StreamBlockContentComponent.Text[i];
            }
        };
        public final TextStreamBlockComponent textStreamBlock;

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Text) && Intrinsics.LJFF(this.textStreamBlock, ((Text) obj).textStreamBlock);
        }

        public final int hashCode() {
            return this.textStreamBlock.hashCode();
        }

        public final String toString() {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Text(textStreamBlock=");
            sbLIZ.append(this.textStreamBlock);
            sbLIZ.append(')');
            return C2188811AlT.LIZIZ(sbLIZ);
        }

        @Override // com.ss.android.ugc.aweme.im.message.template.component.BaseComponent
        public final C2240171Cm7 toProto() {
            C2240181Cm8 c2240181Cm8 = new C2240181Cm8();
            TextStreamBlockComponent textStreamBlockComponent = this.textStreamBlock;
            textStreamBlockComponent.getClass();
            C2240111Cm1 c2240111Cm1 = new C2240111Cm1();
            c2240111Cm1.LIZLLL = textStreamBlockComponent.text;
            c2240181Cm8.LIZLLL = c2240111Cm1.build();
            return c2240181Cm8.build();
        }

        public Text(TextStreamBlockComponent textStreamBlockComponent) {
            this.textStreamBlock = textStreamBlockComponent;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.textStreamBlock.text);
        }
    }

    /* JADX INFO: loaded from: classes35.dex */
    public static final class Unknown implements StreamBlockContentComponent {
        public static final Unknown INSTANCE = new Unknown();
        public static final Parcelable.Creator<Unknown> CREATOR = new Parcelable.Creator<Unknown>() { // from class: X.1Cm5
            @Override // android.os.Parcelable.Creator
            public final StreamBlockContentComponent.Unknown createFromParcel(Parcel parcel) {
                parcel.readInt();
                return StreamBlockContentComponent.Unknown.INSTANCE;
            }

            @Override // android.os.Parcelable.Creator
            public final StreamBlockContentComponent.Unknown[] newArray(int i) {
                return new StreamBlockContentComponent.Unknown[i];
            }
        };

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Unknown);
        }

        public final int hashCode() {
            return 1150305493;
        }

        public final String toString() {
            return "Unknown";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(1);
        }

        @Override // com.ss.android.ugc.aweme.im.message.template.component.BaseComponent
        public final C2240171Cm7 toProto() {
            return new C2240181Cm8().build();
        }
    }
}
