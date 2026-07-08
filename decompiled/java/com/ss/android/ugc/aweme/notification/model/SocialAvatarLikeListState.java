package com.ss.android.ugc.aweme.notification.model;

import X.AbstractC1623806Xk;
import X.C00GV;
import X.C2188811AlT;
import X.C626160OhC;
import X.C627260Oiy;
import X.C627660Ojc;
import X.C786410Ut5;
import X.InterfaceC636340Oxc;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes25.dex */
public final class SocialAvatarLikeListState implements InterfaceC636340Oxc<SocialAvatarLikeListState, C00GV> {
    public static final int $stable = 8;
    public final long avatarId;
    public final String checksum;
    public final C627660Ojc<C00GV> listState;

    public SocialAvatarLikeListState() {
        this(0L, "", new C627660Ojc(null, null, null, null, 15));
    }

    public final SocialAvatarLikeListState copy(long j, String str, C627660Ojc<C00GV> c627660Ojc) {
        return new SocialAvatarLikeListState(j, str, c627660Ojc);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SocialAvatarLikeListState)) {
            return false;
        }
        SocialAvatarLikeListState socialAvatarLikeListState = (SocialAvatarLikeListState) obj;
        return this.avatarId == socialAvatarLikeListState.avatarId && Intrinsics.LJFF(this.checksum, socialAvatarLikeListState.checksum) && Intrinsics.LJFF(this.listState, socialAvatarLikeListState.listState);
    }

    public int hashCode() {
        return (((C786410Ut5.Y2(this.avatarId) * 31) + this.checksum.hashCode()) * 31) + this.listState.hashCode();
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SocialAvatarLikeListState(avatarId=");
        sbLIZ.append(this.avatarId);
        sbLIZ.append(", checksum=");
        sbLIZ.append(this.checksum);
        sbLIZ.append(", listState=");
        sbLIZ.append(this.listState);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC636270OxV
    public List<C00GV> getListItemState() {
        return C627260Oiy.LIZ(this);
    }

    @Override // X.InterfaceC636270OxV
    public AbstractC1623806Xk<C626160OhC> getLoadLatestState() {
        return C627260Oiy.LIZIZ(this);
    }

    @Override // X.InterfaceC636270OxV
    public AbstractC1623806Xk<C626160OhC> getLoadMoreState() {
        return C627260Oiy.LIZJ(this);
    }

    @Override // X.InterfaceC636270OxV
    public AbstractC1623806Xk<C626160OhC> getRefreshState() {
        return C627260Oiy.LIZLLL(this);
    }

    public final long getAvatarId() {
        return this.avatarId;
    }

    public final String getChecksum() {
        return this.checksum;
    }

    @Override // X.InterfaceC627270Oiz
    public C627660Ojc<C00GV> getListState() {
        return this.listState;
    }

    public SocialAvatarLikeListState(long j, String str, C627660Ojc<C00GV> c627660Ojc) {
        this.avatarId = j;
        this.checksum = str;
        this.listState = c627660Ojc;
    }
}
