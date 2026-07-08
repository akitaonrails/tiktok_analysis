package com.bytedance.android.livesdk.gift.receiving.model;

import X.C09CT;
import X.C2188811AlT;
import X.InterfaceC1136800fgk;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.model.BorderInfo;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;

/* JADX INFO: loaded from: classes18.dex */
public final class GiftQueueUserModel implements InterfaceC1136800fgk {

    @C09CT("avatar_thumb")
    public ImageModel avatarThumb;

    @C09CT("border")
    public BorderInfo border;

    @C09CT("enigma_info")
    public User.EnigmaInfo enigmaInfo;

    @C09CT(FollowStatusChangeMethod.PARAM_UID)
    public long id;

    @C09CT("sec_uid")
    public String secUid = "";

    @C09CT("user_name")
    public String username = "";

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("GiftQueueUserModel(id=");
        sbLIZ.append(this.id);
        sbLIZ.append(", username=");
        sbLIZ.append(this.username);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC1136800fgk
    public final User.EnigmaInfo LIZIZ() {
        return this.enigmaInfo;
    }

    @Override // X.InterfaceC1136800fgk
    public final BorderInfo LIZLLL() {
        return this.border;
    }

    @Override // X.InterfaceC1136800fgk
    public final String LJFF() {
        return this.username;
    }

    @Override // X.InterfaceC1136800fgk
    public final ImageModel getAvatarThumb() {
        return this.avatarThumb;
    }

    @Override // X.InterfaceC1136800fgk
    public final long getId() {
        return this.id;
    }

    @Override // X.InterfaceC1136800fgk
    public final String getSecUid() {
        return this.secUid;
    }

    @Override // X.InterfaceC1136800fgk
    public final void LIZ(BorderInfo borderInfo) {
        this.border = borderInfo;
    }

    @Override // X.InterfaceC1136800fgk
    public final void LIZJ(ImageModel imageModel) {
        this.avatarThumb = imageModel;
    }

    @Override // X.InterfaceC1136800fgk
    public final void LJ(User.EnigmaInfo enigmaInfo) {
        this.enigmaInfo = enigmaInfo;
    }

    public final void LJI(long j) {
        this.id = j;
    }

    public final void LJII(String str) {
        this.secUid = str;
    }

    public final void LJIIIIZZ(String str) {
        this.username = str;
    }
}
