package com.ss.android.ugc.aweme.im.message.template.component;

import X.C18ZU;
import X.C2242891CqV;
import X.C2243491CrT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.im.message.template.component.BaseShareCommentComponent;
import com.ss.android.ugc.aweme.im.message.template.component.CommentTypeComponent;
import com.ss.android.ugc.aweme.im.message.template.component.ImageComponent;
import com.ss.android.ugc.aweme.im.message.template.component.TextComponent;

/* JADX INFO: loaded from: classes35.dex */
public final class BaseShareCommentComponent implements BaseComponent<C2242891CqV> {
    public static final Parcelable.Creator<BaseShareCommentComponent> CREATOR = new Parcelable.Creator<BaseShareCommentComponent>() { // from class: X.1Cqb
        @Override // android.os.Parcelable.Creator
        public final BaseShareCommentComponent createFromParcel(Parcel parcel) {
            long j = parcel.readLong();
            long j2 = parcel.readLong();
            Parcelable.Creator<TextComponent> creator = TextComponent.CREATOR;
            return new BaseShareCommentComponent(j, j2, creator.createFromParcel(parcel), creator.createFromParcel(parcel), ImageComponent.CREATOR.createFromParcel(parcel), CommentTypeComponent.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final BaseShareCommentComponent[] newArray(int i) {
            return new BaseShareCommentComponent[i];
        }
    };
    public final TextComponent commentComponent;
    public final long commentId;
    public final CommentTypeComponent commentTypeComponent;
    public final ImageComponent imageComponent;
    public final long itemId;
    public final TextComponent topInlineTextComponent;

    public BaseShareCommentComponent() {
        this(0);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.itemId);
        parcel.writeLong(this.commentId);
        this.topInlineTextComponent.writeToParcel(parcel, i);
        this.commentComponent.writeToParcel(parcel, i);
        this.imageComponent.writeToParcel(parcel, i);
        this.commentTypeComponent.writeToParcel(parcel, i);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ BaseShareCommentComponent(int i) {
        C2243491CrT c2243491CrT = TextComponent.Companion;
        c2243491CrT.getClass();
        TextComponent textComponentLIZ = C2243491CrT.LIZ();
        c2243491CrT.getClass();
        TextComponent textComponentLIZ2 = C2243491CrT.LIZ();
        ImageComponent.Companion.getClass();
        this(-1L, -1L, textComponentLIZ, textComponentLIZ2, C18ZU.LIZ(), CommentTypeComponent.TYPE_TEXT);
    }

    public BaseShareCommentComponent(long j, long j2, TextComponent textComponent, TextComponent textComponent2, ImageComponent imageComponent, CommentTypeComponent commentTypeComponent) {
        this.itemId = j;
        this.commentId = j2;
        this.topInlineTextComponent = textComponent;
        this.commentComponent = textComponent2;
        this.imageComponent = imageComponent;
        this.commentTypeComponent = commentTypeComponent;
    }
}
