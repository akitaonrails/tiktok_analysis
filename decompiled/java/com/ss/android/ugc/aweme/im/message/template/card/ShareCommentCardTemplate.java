package com.ss.android.ugc.aweme.im.message.template.card;

import X.C13BV;
import X.C1496910p3Z;
import X.C1516540pZE;
import X.C15438062q;
import X.C18Y8;
import X.C18Y9;
import X.C2241941Coy;
import X.C2241961Cp0;
import X.C2242511Cpt;
import X.C2242911CqX;
import X.C2242931CqZ;
import X.C869590Y9l;
import android.os.Parcel;
import android.os.Parcelable;
import com.squareup.wire.ProtoAdapter;
import com.ss.android.ugc.aweme.im.message.template.card.ShareCommentCardTemplate;
import com.ss.android.ugc.aweme.im.message.template.component.AttachmentComponent;
import com.ss.android.ugc.aweme.im.message.template.component.BaseFooterComponent;
import com.ss.android.ugc.aweme.im.message.template.component.BaseHeaderComponent;
import com.ss.android.ugc.aweme.im.message.template.component.BaseRequestComponent;
import com.ss.android.ugc.aweme.im.message.template.component.BaseResponseComponent;
import com.ss.android.ugc.aweme.im.message.template.component.BaseShareCommentComponent;
import com.ss.android.ugc.aweme.im.message.template.component.BaseUserComponent;
import com.ss.android.ugc.aweme.im.message.template.component.CommentFallbackStatusComponent;
import com.ss.android.ugc.aweme.im.message.template.component.PreviewHintComponent;
import com.ss.android.ugc.aweme.im.message.template.component.TextComponent;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import okio.ByteString;

/* JADX INFO: loaded from: classes35.dex */
public final class ShareCommentCardTemplate implements BaseTemplate {
    public static final Parcelable.Creator<ShareCommentCardTemplate> CREATOR = new Parcelable.Creator<ShareCommentCardTemplate>() { // from class: X.1CqR
        @Override // android.os.Parcelable.Creator
        public final ShareCommentCardTemplate createFromParcel(Parcel parcel) {
            AttachmentComponent attachmentComponentCreateFromParcel;
            BaseHeaderComponent baseHeaderComponentCreateFromParcel;
            BaseShareCommentComponent baseShareCommentComponentCreateFromParcel = BaseShareCommentComponent.CREATOR.createFromParcel(parcel);
            BaseUserComponent baseUserComponentCreateFromParcel = BaseUserComponent.CREATOR.createFromParcel(parcel);
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            for (int i2 = 0; i2 != i; i2++) {
                arrayList.add(TextComponent.CREATOR.createFromParcel(parcel));
            }
            CommentFallbackStatusComponent commentFallbackStatusComponentCreateFromParcel = CommentFallbackStatusComponent.CREATOR.createFromParcel(parcel);
            int i3 = parcel.readInt();
            PreviewHintComponent previewHintComponentCreateFromParcel = PreviewHintComponent.CREATOR.createFromParcel(parcel);
            BaseRequestComponent baseRequestComponentCreateFromParcel = BaseRequestComponent.CREATOR.createFromParcel(parcel);
            BaseResponseComponent baseResponseComponentCreateFromParcel = BaseResponseComponent.CREATOR.createFromParcel(parcel);
            BaseFooterComponent baseFooterComponentCreateFromParcel = null;
            if (parcel.readInt() == 0) {
                attachmentComponentCreateFromParcel = null;
            } else {
                attachmentComponentCreateFromParcel = AttachmentComponent.CREATOR.createFromParcel(parcel);
            }
            AttachmentComponent attachmentComponent = attachmentComponentCreateFromParcel;
            if (parcel.readInt() == 0) {
                baseHeaderComponentCreateFromParcel = null;
            } else {
                baseHeaderComponentCreateFromParcel = BaseHeaderComponent.CREATOR.createFromParcel(parcel);
            }
            BaseHeaderComponent baseHeaderComponent = baseHeaderComponentCreateFromParcel;
            if (parcel.readInt() != 0) {
                baseFooterComponentCreateFromParcel = BaseFooterComponent.CREATOR.createFromParcel(parcel);
            }
            return new ShareCommentCardTemplate(baseShareCommentComponentCreateFromParcel, baseUserComponentCreateFromParcel, arrayList, commentFallbackStatusComponentCreateFromParcel, i3, previewHintComponentCreateFromParcel, baseRequestComponentCreateFromParcel, baseResponseComponentCreateFromParcel, attachmentComponent, baseHeaderComponent, baseFooterComponentCreateFromParcel);
        }

        @Override // android.os.Parcelable.Creator
        public final ShareCommentCardTemplate[] newArray(int i) {
            return new ShareCommentCardTemplate[i];
        }
    };
    public final AttachmentComponent attachment;
    public final BaseFooterComponent baseFooterComponent;
    public final BaseHeaderComponent baseHeaderComponent;
    public final BaseRequestComponent baseRequestComponent;
    public final BaseResponseComponent baseResponseComponent;
    public final BaseShareCommentComponent baseShareComment;
    public final BaseUserComponent baseUserComponent;
    public final CommentFallbackStatusComponent commentFallbackStatusComponent;
    public final List<TextComponent> mentionUsernameList;
    public final int messageType;
    public final PreviewHintComponent previewHintComponent;

    public ShareCommentCardTemplate() {
        this((BaseShareCommentComponent) null, (BaseUserComponent) null, (List) null, (CommentFallbackStatusComponent) null, (PreviewHintComponent) null, (BaseRequestComponent) null, (BaseResponseComponent) null, (AttachmentComponent) null, (BaseHeaderComponent) null, (BaseFooterComponent) null, 2047);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ShareCommentCardTemplate)) {
            return false;
        }
        ShareCommentCardTemplate shareCommentCardTemplate = (ShareCommentCardTemplate) obj;
        return Intrinsics.LJFF(this.baseShareComment, shareCommentCardTemplate.baseShareComment) && Intrinsics.LJFF(this.baseUserComponent, shareCommentCardTemplate.baseUserComponent) && Intrinsics.LJFF(this.mentionUsernameList, shareCommentCardTemplate.mentionUsernameList) && this.commentFallbackStatusComponent == shareCommentCardTemplate.commentFallbackStatusComponent && this.messageType == shareCommentCardTemplate.messageType && Intrinsics.LJFF(this.previewHintComponent, shareCommentCardTemplate.previewHintComponent) && Intrinsics.LJFF(this.baseRequestComponent, shareCommentCardTemplate.baseRequestComponent) && Intrinsics.LJFF(this.baseResponseComponent, shareCommentCardTemplate.baseResponseComponent) && Intrinsics.LJFF(this.attachment, shareCommentCardTemplate.attachment) && Intrinsics.LJFF(this.baseHeaderComponent, shareCommentCardTemplate.baseHeaderComponent) && Intrinsics.LJFF(this.baseFooterComponent, shareCommentCardTemplate.baseFooterComponent);
    }

    public final int hashCode() {
        int iHashCode = ((((((((((((((this.baseShareComment.hashCode() * 31) + this.baseUserComponent.hashCode()) * 31) + this.mentionUsernameList.hashCode()) * 31) + this.commentFallbackStatusComponent.hashCode()) * 31) + this.messageType) * 31) + this.previewHintComponent.hashCode()) * 31) + this.baseRequestComponent.hashCode()) * 31) + this.baseResponseComponent.hashCode()) * 31;
        AttachmentComponent attachmentComponent = this.attachment;
        int iHashCode2 = (iHashCode + (attachmentComponent == null ? 0 : attachmentComponent.hashCode())) * 31;
        BaseHeaderComponent baseHeaderComponent = this.baseHeaderComponent;
        int iHashCode3 = (iHashCode2 + (baseHeaderComponent == null ? 0 : baseHeaderComponent.hashCode())) * 31;
        BaseFooterComponent baseFooterComponent = this.baseFooterComponent;
        return iHashCode3 + (baseFooterComponent != null ? baseFooterComponent.hashCode() : 0);
    }

    @Override // com.ss.android.ugc.aweme.im.message.template.card.BaseTemplate
    public final BaseTemplate nw(C869590Y9l c869590Y9l) {
        return this;
    }

    public final String toString() {
        return "ShareCommentCardTemplate(baseShareComment=" + this.baseShareComment + ", baseUserComponent=" + this.baseUserComponent + ", mentionUsernameList=" + this.mentionUsernameList + ", commentFallbackStatusComponent=" + this.commentFallbackStatusComponent + ", messageType=" + this.messageType + ", previewHintComponent=" + this.previewHintComponent + ", baseRequestComponent=" + this.baseRequestComponent + ", baseResponseComponent=" + this.baseResponseComponent + ", attachment=" + this.attachment + ", baseHeaderComponent=" + this.baseHeaderComponent + ", baseFooterComponent=" + this.baseFooterComponent + ')';
    }

    @Override // com.ss.android.ugc.aweme.im.message.template.card.BaseTemplate
    public final ByteString encode() {
        C1496910p3Z c1496910p3Z = ByteString.Companion;
        ProtoAdapter<C2241941Coy> protoAdapter = C2241941Coy.ADAPTER;
        C2241961Cp0 c2241961Cp0 = new C2241961Cp0();
        BaseHeaderComponent baseHeaderComponent = this.baseHeaderComponent;
        c2241961Cp0.LJJIJ = baseHeaderComponent != null ? baseHeaderComponent.LIZ() : null;
        BaseFooterComponent baseFooterComponent = this.baseFooterComponent;
        c2241961Cp0.LJJIJIIJI = baseFooterComponent != null ? baseFooterComponent.LIZ() : null;
        C2242911CqX c2242911CqX = new C2242911CqX();
        BaseShareCommentComponent baseShareCommentComponent = this.baseShareComment;
        baseShareCommentComponent.getClass();
        C2242931CqZ c2242931CqZ = new C2242931CqZ();
        c2242931CqZ.LIZLLL = Long.valueOf(baseShareCommentComponent.itemId);
        c2242931CqZ.LJ = Long.valueOf(baseShareCommentComponent.commentId);
        c2242931CqZ.LJFF = baseShareCommentComponent.topInlineTextComponent.LIZ();
        c2242931CqZ.LJI = baseShareCommentComponent.commentComponent.LIZ();
        c2242931CqZ.LJII = baseShareCommentComponent.imageComponent.LIZIZ();
        c2242931CqZ.LJIIIIZZ = baseShareCommentComponent.commentTypeComponent.toProto();
        c2242911CqX.LIZLLL = c2242931CqZ.build();
        c2242911CqX.LJ = this.previewHintComponent.LIZIZ();
        c2242911CqX.LJFF = this.baseUserComponent.LIZ();
        List<TextComponent> list = this.mentionUsernameList;
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
        Iterator<TextComponent> it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList.add(it2.next().LIZ());
        }
        C1516540pZE.LIZ(arrayList);
        c2242911CqX.LJI = arrayList;
        c2242911CqX.LJII = this.commentFallbackStatusComponent.toProto();
        AttachmentComponent attachmentComponent = this.attachment;
        c2242911CqX.LJIIIIZZ = attachmentComponent != null ? attachmentComponent.LIZ() : null;
        c2242911CqX.LJIIIZ = this.baseRequestComponent.LIZ();
        c2242911CqX.LJIIJ = this.baseResponseComponent.LIZ();
        c2241961Cp0.LJIIL = c2242911CqX.build();
        return C1496910p3Z.LIZJ(c1496910p3Z, protoAdapter.encode(c2241961Cp0.build()));
    }

    @Override // com.ss.android.ugc.aweme.im.message.template.card.BaseTemplate
    public final AttachmentComponent Hs() {
        return this.attachment;
    }

    @Override // com.ss.android.ugc.aweme.im.message.template.card.BaseTemplate
    public final BaseResponseComponent Nc() {
        return this.baseResponseComponent;
    }

    @Override // com.ss.android.ugc.aweme.im.message.template.card.BaseTemplate
    public final BaseFooterComponent dG() {
        return this.baseFooterComponent;
    }

    @Override // com.ss.android.ugc.aweme.im.message.template.card.BaseTemplate
    public final int getMessageType() {
        return this.messageType;
    }

    @Override // com.ss.android.ugc.aweme.im.message.template.card.BaseTemplate
    public final BaseHeaderComponent og() {
        return this.baseHeaderComponent;
    }

    @Override // com.ss.android.ugc.aweme.im.message.template.card.BaseTemplate
    public final BaseRequestComponent rj() {
        return this.baseRequestComponent;
    }

    @Override // com.ss.android.ugc.aweme.im.message.template.card.BaseTemplate
    public final PreviewHintComponent yo() {
        return this.previewHintComponent;
    }

    @Override // com.ss.android.ugc.aweme.im.message.template.card.BaseTemplate
    public final Map<String, String> Xr(C869590Y9l c869590Y9l) {
        return c869590Y9l.getExt();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        this.baseShareComment.writeToParcel(parcel, i);
        this.baseUserComponent.writeToParcel(parcel, i);
        List<TextComponent> list = this.mentionUsernameList;
        parcel.writeInt(list.size());
        Iterator<TextComponent> it2 = list.iterator();
        while (it2.hasNext()) {
            it2.next().writeToParcel(parcel, i);
        }
        this.commentFallbackStatusComponent.writeToParcel(parcel, i);
        parcel.writeInt(this.messageType);
        this.previewHintComponent.writeToParcel(parcel, i);
        this.baseRequestComponent.queryData.writeToParcel(parcel, i);
        this.baseResponseComponent.writeToParcel(parcel, i);
        AttachmentComponent attachmentComponent = this.attachment;
        if (attachmentComponent == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            attachmentComponent.writeToParcel(parcel, i);
        }
        BaseHeaderComponent baseHeaderComponent = this.baseHeaderComponent;
        if (baseHeaderComponent == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            baseHeaderComponent.text.writeToParcel(parcel, i);
        }
        BaseFooterComponent baseFooterComponent = this.baseFooterComponent;
        if (baseFooterComponent == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            baseFooterComponent.writeToParcel(parcel, i);
        }
    }

    @Override // com.ss.android.ugc.aweme.im.message.template.card.BaseTemplate
    public final BaseTemplate bM(PreviewHintComponent previewHintComponent, BaseRequestComponent baseRequestComponent, BaseResponseComponent baseResponseComponent) {
        return new ShareCommentCardTemplate(this.baseShareComment, this.baseUserComponent, this.mentionUsernameList, this.commentFallbackStatusComponent, this.messageType, previewHintComponent, baseRequestComponent, baseResponseComponent, this.attachment, this.baseHeaderComponent, this.baseFooterComponent);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public ShareCommentCardTemplate(BaseShareCommentComponent baseShareCommentComponent, BaseUserComponent baseUserComponent, List list, CommentFallbackStatusComponent commentFallbackStatusComponent, PreviewHintComponent previewHintComponent, BaseRequestComponent baseRequestComponent, BaseResponseComponent baseResponseComponent, AttachmentComponent attachmentComponent, BaseHeaderComponent baseHeaderComponent, BaseFooterComponent baseFooterComponent, int i) {
        BaseHeaderComponent baseHeaderComponent2 = baseHeaderComponent;
        BaseResponseComponent baseResponseComponent2 = baseResponseComponent;
        BaseRequestComponent baseRequestComponentLIZ = baseRequestComponent;
        AttachmentComponent attachmentComponent2 = attachmentComponent;
        PreviewHintComponent previewHintComponentLIZ = previewHintComponent;
        List list2 = list;
        BaseUserComponent baseUserComponentLIZ = baseUserComponent;
        CommentFallbackStatusComponent commentFallbackStatusComponent2 = commentFallbackStatusComponent;
        BaseShareCommentComponent baseShareCommentComponent2 = (i & 1) != 0 ? new BaseShareCommentComponent(0) : baseShareCommentComponent;
        if ((i & 2) != 0) {
            BaseUserComponent.Companion.getClass();
            baseUserComponentLIZ = C2242511Cpt.LIZ();
        }
        list2 = (i & 4) != 0 ? C13BV.INSTANCE : list2;
        commentFallbackStatusComponent2 = (i & 8) != 0 ? CommentFallbackStatusComponent.STATUS_COMMENT_VISIBLE : commentFallbackStatusComponent2;
        int i2 = (i & 16) != 0 ? 1811 : 0;
        if ((i & 32) != 0) {
            PreviewHintComponent.Companion.getClass();
            previewHintComponentLIZ = C18Y9.LIZ();
        }
        if ((i & 64) != 0) {
            BaseRequestComponent.Companion.getClass();
            baseRequestComponentLIZ = C18Y8.LIZ();
        }
        this(baseShareCommentComponent2, baseUserComponentLIZ, (List<TextComponent>) list2, commentFallbackStatusComponent2, i2, previewHintComponentLIZ, baseRequestComponentLIZ, (i & 128) != 0 ? new BaseResponseComponent(0L, 15) : baseResponseComponent2, (i & 256) != 0 ? null : attachmentComponent2, (i & 512) != 0 ? null : baseHeaderComponent2, (i & 1024) == 0 ? baseFooterComponent : null);
    }

    public ShareCommentCardTemplate(BaseShareCommentComponent baseShareCommentComponent, BaseUserComponent baseUserComponent, List<TextComponent> list, CommentFallbackStatusComponent commentFallbackStatusComponent, int i, PreviewHintComponent previewHintComponent, BaseRequestComponent baseRequestComponent, BaseResponseComponent baseResponseComponent, AttachmentComponent attachmentComponent, BaseHeaderComponent baseHeaderComponent, BaseFooterComponent baseFooterComponent) {
        this.baseShareComment = baseShareCommentComponent;
        this.baseUserComponent = baseUserComponent;
        this.mentionUsernameList = list;
        this.commentFallbackStatusComponent = commentFallbackStatusComponent;
        this.messageType = i;
        this.previewHintComponent = previewHintComponent;
        this.baseRequestComponent = baseRequestComponent;
        this.baseResponseComponent = baseResponseComponent;
        this.attachment = attachmentComponent;
        this.baseHeaderComponent = baseHeaderComponent;
        this.baseFooterComponent = baseFooterComponent;
    }
}
