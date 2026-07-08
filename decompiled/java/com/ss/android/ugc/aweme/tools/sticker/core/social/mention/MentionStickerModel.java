package com.ss.android.ugc.aweme.tools.sticker.core.social.mention;

import X.AbstractC1442160ndG;
import X.C040H;
import X.C09CT;
import X.C0FKI;
import X.C123100dR;
import X.C1440500naa;
import X.C19591311kt;
import X.C19630911rH;
import X.C786410Ut5;
import X.EnumC1466150oFx;
import X.EnumC19597511lt;
import android.content.Context;
import android.graphics.Typeface;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import android.widget.EditText;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import com.ss.android.ugc.aweme.sticker.data.MentionStruct;
import com.ss.android.ugc.aweme.tools.sticker.core.BaseStickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.StickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.social.mention.MentionStickerModel;
import java.io.Serializable;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class MentionStickerModel implements StickerModel, Parcelable, Serializable {

    @C09CT("user_avatar_url")
    public UrlModel avatarUrl;

    @C09CT("base_sticker_model")
    public final BaseStickerModel baseStickerModel;

    @C09CT("editable")
    public boolean editable;

    @C09CT("nickname")
    public String nickname;

    @C09CT("sec_uid")
    public String secUid;

    @C09CT("use_capsule_style")
    public final boolean useCapsuleStyle;

    @C09CT("use_nick_name")
    public boolean useNickName;

    @C040H
    @C09CT("user")
    public User user;

    @C09CT("user_id")
    public String userId;

    @C09CT("user_name")
    public String userName;

    @C09CT("visible")
    public final boolean visible;
    public static final Parcelable.Creator<MentionStickerModel> CREATOR = new Parcelable.Creator<MentionStickerModel>() { // from class: X.0oGP
        @Override // android.os.Parcelable.Creator
        public final MentionStickerModel createFromParcel(Parcel parcel) {
            boolean z;
            boolean z2;
            boolean z3;
            boolean z4;
            BaseStickerModel baseStickerModelCreateFromParcel = BaseStickerModel.CREATOR.createFromParcel(parcel);
            User user = (User) parcel.readSerializable();
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            UrlModel urlModel = (UrlModel) parcel.readSerializable();
            String string4 = parcel.readString();
            if (parcel.readInt() != 0) {
                z = true;
            } else {
                z = false;
            }
            if (parcel.readInt() != 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (parcel.readInt() != 0) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (parcel.readInt() != 0) {
                z4 = true;
            } else {
                z4 = false;
            }
            return new MentionStickerModel(baseStickerModelCreateFromParcel, user, string, string2, string3, urlModel, string4, z, z2, z3, z4);
        }

        @Override // android.os.Parcelable.Creator
        public final MentionStickerModel[] newArray(int i) {
            return new MentionStickerModel[i];
        }
    };
    public static final int $stable = 8;

    public MentionStickerModel() {
        this(new BaseStickerModel(0, 0, null, 0, 0, 0.0f, 0.0f, 0, 0, 0, 0, 0, 0, 0, 0, false, null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, false, 0.0f, 0.0f, false, 0.0f, null, null, null, false, -1, 15, null), null, null, null, null, null, null, true, false, true, false);
    }

    public final MentionStickerModel copy(BaseStickerModel baseStickerModel, User user, String str, String str2, String str3, UrlModel urlModel, String str4, boolean z, boolean z2, boolean z3, boolean z4) {
        return new MentionStickerModel(baseStickerModel, user, str, str2, str3, urlModel, str4, z, z2, z3, z4);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MentionStickerModel)) {
            return false;
        }
        MentionStickerModel mentionStickerModel = (MentionStickerModel) obj;
        return Intrinsics.LJFF(this.baseStickerModel, mentionStickerModel.baseStickerModel) && Intrinsics.LJFF(this.user, mentionStickerModel.user) && Intrinsics.LJFF(this.userId, mentionStickerModel.userId) && Intrinsics.LJFF(this.secUid, mentionStickerModel.secUid) && Intrinsics.LJFF(this.userName, mentionStickerModel.userName) && Intrinsics.LJFF(this.avatarUrl, mentionStickerModel.avatarUrl) && Intrinsics.LJFF(this.nickname, mentionStickerModel.nickname) && this.useNickName == mentionStickerModel.useNickName && this.editable == mentionStickerModel.editable && this.visible == mentionStickerModel.visible && this.useCapsuleStyle == mentionStickerModel.useCapsuleStyle;
    }

    public int hashCode() {
        int iHashCode = this.baseStickerModel.hashCode() * 31;
        User user = this.user;
        int iHashCode2 = (iHashCode + (user == null ? 0 : user.hashCode())) * 31;
        String str = this.userId;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.secUid;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.userName;
        int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        UrlModel urlModel = this.avatarUrl;
        int iHashCode6 = (iHashCode5 + (urlModel == null ? 0 : urlModel.hashCode())) * 31;
        String str4 = this.nickname;
        return ((((((((iHashCode6 + (str4 != null ? str4.hashCode() : 0)) * 31) + C786410Ut5.Z2(this.useNickName)) * 31) + C786410Ut5.Z2(this.editable)) * 31) + C786410Ut5.Z2(this.visible)) * 31) + C786410Ut5.Z2(this.useCapsuleStyle);
    }

    @Override // com.ss.android.ugc.aweme.tools.sticker.core.StickerModel
    public boolean isVERenderSticker() {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.tools.sticker.core.StickerModel
    public boolean needCompile() {
        return true;
    }

    public String toString() {
        return "MentionStickerModel(baseStickerModel=" + this.baseStickerModel + ", user=" + this.user + ", userId=" + this.userId + ", secUid=" + this.secUid + ", userName=" + this.userName + ", avatarUrl=" + this.avatarUrl + ", nickname=" + this.nickname + ", useNickName=" + this.useNickName + ", editable=" + this.editable + ", visible=" + this.visible + ", useCapsuleStyle=" + this.useCapsuleStyle + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        this.baseStickerModel.writeToParcel(parcel, i);
        parcel.writeSerializable(this.user);
        parcel.writeString(this.userId);
        parcel.writeString(this.secUid);
        parcel.writeString(this.userName);
        parcel.writeSerializable(this.avatarUrl);
        parcel.writeString(this.nickname);
        parcel.writeInt(this.useNickName ? 1 : 0);
        parcel.writeInt(this.editable ? 1 : 0);
        parcel.writeInt(this.visible ? 1 : 0);
        parcel.writeInt(this.useCapsuleStyle ? 1 : 0);
    }

    @Override // com.ss.android.ugc.aweme.tools.sticker.core.StickerModel
    public int getId() {
        return this.baseStickerModel.getId();
    }

    @Override // com.ss.android.ugc.aweme.tools.sticker.core.StickerModel
    public InteractStickerStruct getInteractStickerStruct() {
        String str;
        MentionStruct mentionStruct;
        String uid;
        String secUid;
        C19591311kt.LIZ.getClass();
        InteractStickerStruct interactStickerStructLIZLLL = C19591311kt.LIZLLL(this, true);
        str = "";
        if (this.user != null) {
            mentionStruct = new MentionStruct();
            User user = this.user;
            if (user == null || (uid = user.getUid()) == null) {
                uid = "";
            }
            mentionStruct.setUserId(uid);
            User user2 = this.user;
            if (user2 != null && (secUid = user2.getSecUid()) != null) {
                str = secUid;
            }
            mentionStruct.setSecUid(str);
            mentionStruct.setUsername(C19630911rH.LIZIZ(this.user));
            User user3 = this.user;
            mentionStruct.setAvatarUrl(user3 != null ? user3.getAvatarThumb() : null);
            mentionStruct.setNickname(C19630911rH.LIZ(this.user));
            mentionStruct.setScenario(EnumC19597511lt.STICKER.getValue());
        } else {
            mentionStruct = new MentionStruct();
            String str2 = this.userId;
            if (str2 == null) {
                str2 = "";
            }
            mentionStruct.setUserId(str2);
            String str3 = this.secUid;
            if (str3 == null) {
                str3 = "";
            }
            mentionStruct.setSecUid(str3);
            String str4 = this.userName;
            if (str4 == null) {
                str4 = "";
            }
            mentionStruct.setUsername(str4);
            mentionStruct.setAvatarUrl(this.avatarUrl);
            String str5 = this.nickname;
            mentionStruct.setNickname(str5 != null ? str5 : "");
            mentionStruct.setScenario(EnumC19597511lt.STICKER.getValue());
        }
        interactStickerStructLIZLLL.setMentionInfo(mentionStruct);
        interactStickerStructLIZLLL.setType(getStickerType().getType());
        return interactStickerStructLIZLLL;
    }

    public final String getShowName() {
        User user = this.user;
        return user != null ? this.useNickName ? C19630911rH.LIZ(user) : C19630911rH.LIZIZ(user) : this.useNickName ? this.nickname : this.userName;
    }

    @Override // com.ss.android.ugc.aweme.tools.sticker.core.StickerModel
    public boolean isNotEmptyModel() {
        return C123100dR.LIZ(getShowName());
    }

    public final UrlModel getAvatarUrl() {
        return this.avatarUrl;
    }

    @Override // com.ss.android.ugc.aweme.tools.sticker.core.StickerModel
    public BaseStickerModel getBaseModel() {
        return this.baseStickerModel;
    }

    public final BaseStickerModel getBaseStickerModel() {
        return this.baseStickerModel;
    }

    public final boolean getEditable() {
        return this.editable;
    }

    public final String getNickname() {
        return this.nickname;
    }

    public final String getSecUid() {
        return this.secUid;
    }

    @Override // com.ss.android.ugc.aweme.tools.sticker.core.StickerModel
    public EnumC1466150oFx getStickerType() {
        return EnumC1466150oFx.MENTION;
    }

    public final boolean getUseCapsuleStyle() {
        return this.useCapsuleStyle;
    }

    public final boolean getUseNickName() {
        return this.useNickName;
    }

    public final User getUser() {
        return this.user;
    }

    public final String getUserId() {
        return this.userId;
    }

    public final String getUserName() {
        return this.userName;
    }

    public final boolean getVisible() {
        return this.visible;
    }

    public final void setAvatarUrl(UrlModel urlModel) {
        this.avatarUrl = urlModel;
    }

    public final void setEditable(boolean z) {
        this.editable = z;
    }

    public final void setNickname(String str) {
        this.nickname = str;
    }

    public final void setSecUid(String str) {
        this.secUid = str;
    }

    public final void setUseNickName(boolean z) {
        this.useNickName = z;
    }

    public final void setUser(User user) {
        this.user = user;
    }

    public final void setUserId(String str) {
        this.userId = str;
    }

    public final void setUserName(String str) {
        this.userName = str;
    }

    @Override // com.ss.android.ugc.aweme.tools.sticker.core.StickerModel
    public StickerModel updateMediaSize(Pair<Integer, Integer> pair) {
        return copy(BaseStickerModel.copy$default(this.baseStickerModel, 0, 0, null, 0, 0, 0.0f, 0.0f, 0, 0, 0, 0, 0, 0, pair.getFirst().intValue(), pair.getSecond().intValue(), false, null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, false, 0.0f, 0.0f, false, 0.0f, null, null, null, false, -24577, 15, null), this.user, this.userId, this.secUid, this.userName, this.avatarUrl, this.nickname, this.useNickName, this.editable, this.visible, this.useCapsuleStyle);
    }

    @Override // com.ss.android.ugc.aweme.tools.sticker.core.StickerModel
    public AbstractC1442160ndG<?> stickerCompileComponent(final Context context, final String str, final C1440500naa c1440500naa, final C0FKI c0fki, String str2) {
        return new AbstractC1442160ndG<MentionStickerModel>(context, c1440500naa, c0fki, str) { // from class: X.0oGU
            public final Context LIZJ;
            public final String LIZLLL;
            public final C0FKI LJ;

            @Override // X.AbstractC1442160ndG
            public final EnumC1466150oFx LIZJ() {
                return EnumC1466150oFx.MENTION;
            }

            @Override // X.AbstractC1442160ndG
            public final String LIZ(StickerModel stickerModel) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(this.LIZLLL);
                sbLIZ.append("/mention_sticker/");
                sbLIZ.append(((MentionStickerModel) stickerModel).getId());
                sbLIZ.append('_');
                sbLIZ.append(System.currentTimeMillis());
                sbLIZ.append(".png");
                return C2188811AlT.LIZIZ(sbLIZ);
            }

            @Override // X.AbstractC1442160ndG
            public final View LIZIZ(StickerModel stickerModel) {
                Typeface typefaceByFontName;
                EditText titleEditText;
                MentionStickerModel mentionStickerModel = (MentionStickerModel) stickerModel;
                C19630811rG c19630811rG = new C19630811rG(this.LIZJ);
                c19630811rG.LLJIJIL = mentionStickerModel.getUseCapsuleStyle();
                c19630811rG.LJII(mentionStickerModel);
                if (!mentionStickerModel.getUseCapsuleStyle() && (typefaceByFontName = this.LJ.getTypefaceByFontName("Neon")) != null && (titleEditText = c19630811rG.getTitleEditText()) != null) {
                    titleEditText.setTypeface(typefaceByFontName);
                }
                return c19630811rG;
            }

            @Override // X.AbstractC1442160ndG
            public final StickerModel LIZLLL(StickerModel stickerModel, int i, int i2) {
                MentionStickerModel mentionStickerModel = (MentionStickerModel) stickerModel;
                return mentionStickerModel.copy(BaseStickerModel.copy$default(mentionStickerModel.getBaseStickerModel(), 0, 0, null, 0, 0, 0.0f, 0.0f, i, i2, 0, 0, 0, 0, 0, 0, false, null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, false, 0.0f, 0.0f, false, 0.0f, null, null, null, false, -385, 15, null), mentionStickerModel.user, mentionStickerModel.userId, mentionStickerModel.secUid, mentionStickerModel.userName, mentionStickerModel.avatarUrl, mentionStickerModel.nickname, mentionStickerModel.useNickName, mentionStickerModel.editable, mentionStickerModel.visible, mentionStickerModel.useCapsuleStyle);
            }

            {
                super(context, c1440500naa);
                this.LIZJ = context;
                this.LIZLLL = str;
                this.LJ = c0fki;
            }
        };
    }

    public MentionStickerModel(BaseStickerModel baseStickerModel, User user, String str, String str2, String str3, UrlModel urlModel, String str4, boolean z, boolean z2, boolean z3, boolean z4) {
        this.baseStickerModel = baseStickerModel;
        this.user = user;
        this.userId = str;
        this.secUid = str2;
        this.userName = str3;
        this.avatarUrl = urlModel;
        this.nickname = str4;
        this.useNickName = z;
        this.editable = z2;
        this.visible = z3;
        this.useCapsuleStyle = z4;
    }
}
