package com.ss.android.ugc.aweme.inbox.bulletin.data.item;

import X.C09CT;
import X.C0OQ6;
import X.C2188811AlT;
import X.C786410Ut5;
import X.InterfaceC1891350zJl;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class BulletinEmojiItem implements InterfaceC1891350zJl {
    public final String LL;
    public final int LLILLJJLI;
    public boolean LLILLL;
    public transient String LLILZ = "";

    @C09CT("count")
    public long count;

    @C09CT("emoji")
    public final String emoji;

    @C09CT("is_reaction")
    public boolean isReaction;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BulletinEmojiItem)) {
            return false;
        }
        BulletinEmojiItem bulletinEmojiItem = (BulletinEmojiItem) obj;
        return Intrinsics.LJFF(this.emoji, bulletinEmojiItem.emoji) && this.count == bulletinEmojiItem.count && this.isReaction == bulletinEmojiItem.isReaction && Intrinsics.LJFF(this.LL, bulletinEmojiItem.LL) && this.LLILLJJLI == bulletinEmojiItem.LLILLJJLI && this.LLILLL == bulletinEmojiItem.LLILLL;
    }

    public final int hashCode() {
        return (((((((((this.emoji.hashCode() * 31) + C786410Ut5.Y2(this.count)) * 31) + C786410Ut5.Z2(this.isReaction)) * 31) + this.LL.hashCode()) * 31) + this.LLILLJJLI) * 31) + C786410Ut5.Z2(this.LLILLL);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("BulletinEmojiItem(emoji=");
        sbLIZ.append(this.emoji);
        sbLIZ.append(", count=");
        sbLIZ.append(this.count);
        sbLIZ.append(", isReaction=");
        sbLIZ.append(this.isReaction);
        sbLIZ.append(", itemId=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", orderNum=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", needAnimate=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        if (interfaceC1891350zJl instanceof BulletinEmojiItem) {
            BulletinEmojiItem bulletinEmojiItem = (BulletinEmojiItem) interfaceC1891350zJl;
            if (Intrinsics.LJFF(this.emoji, bulletinEmojiItem.emoji) && this.count == bulletinEmojiItem.count && this.isReaction == bulletinEmojiItem.isReaction) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        if (interfaceC1891350zJl instanceof BulletinEmojiItem) {
            BulletinEmojiItem bulletinEmojiItem = (BulletinEmojiItem) interfaceC1891350zJl;
            if (Intrinsics.LJFF(this.emoji, bulletinEmojiItem.emoji) && Intrinsics.LJFF(this.LL, bulletinEmojiItem.LL)) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override // X.InterfaceC1891350zJl
    public final Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
        boolean z;
        if (interfaceC1891350zJl instanceof BulletinEmojiItem) {
            BulletinEmojiItem bulletinEmojiItem = (BulletinEmojiItem) interfaceC1891350zJl;
            boolean z2 = true;
            boolean z3 = !Intrinsics.LJFF(bulletinEmojiItem.emoji, this.emoji);
            if (bulletinEmojiItem.count != this.count) {
                z = true;
            } else {
                z = false;
            }
            if (bulletinEmojiItem.isReaction == this.isReaction) {
                z2 = false;
            }
            return new C0OQ6(z3, z, z2);
        }
        return null;
    }

    public static BulletinEmojiItem LIZ(BulletinEmojiItem bulletinEmojiItem, long j, boolean z, boolean z2, int i) {
        String str;
        int i2;
        boolean z3 = z2;
        boolean z4 = z;
        long j2 = j;
        String str2 = null;
        if ((i & 1) != 0) {
            str = bulletinEmojiItem.emoji;
        } else {
            str = null;
        }
        if ((i & 2) != 0) {
            j2 = bulletinEmojiItem.count;
        }
        if ((i & 4) != 0) {
            z4 = bulletinEmojiItem.isReaction;
        }
        if ((i & 8) != 0) {
            str2 = bulletinEmojiItem.LL;
        }
        if ((i & 16) != 0) {
            i2 = bulletinEmojiItem.LLILLJJLI;
        } else {
            i2 = 0;
        }
        if ((i & 32) != 0) {
            z3 = bulletinEmojiItem.LLILLL;
        }
        return new BulletinEmojiItem(str, j2, z4, str2, i2, z3);
    }

    public BulletinEmojiItem(String str, long j, boolean z, String str2, int i, boolean z2) {
        this.emoji = str;
        this.count = j;
        this.isReaction = z;
        this.LL = str2;
        this.LLILLJJLI = i;
        this.LLILLL = z2;
    }
}
