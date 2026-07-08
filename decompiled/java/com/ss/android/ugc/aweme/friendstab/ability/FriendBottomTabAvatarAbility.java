package com.ss.android.ugc.aweme.friendstab.ability;

import X.C087Q;
import X.C1587210rPD;
import X.C1587220rPE;
import X.C1589640rT8;
import X.C1595430rcT;
import X.C2275711E5p;
import X.EnumC1586610rOF;
import android.content.Context;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.friendstab.model.FriendsRedDotUser;
import com.ss.android.ugc.aweme.friendstab.model.NewContentResponse;
import com.ss.android.ugc.aweme.friendstab.model.UserNewContent;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AwS108S1000000_24;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes25.dex */
public final class FriendBottomTabAvatarAbility extends BaseBottomTabAvatarAbility {
    @Override // com.ss.android.ugc.aweme.friendstab.ability.BaseBottomTabAvatarAbility, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.ss.android.ugc.aweme.friendstab.ability.BaseBottomTabAvatarAbility
    public final Map<EnumC1586610rOF, ArrayList<? extends UserNewContent>> LIZIZ() {
        NewContentResponse latestResponse = C1595430rcT.LIZIZ.LIZIZ().getLatestResponse();
        if (latestResponse != null) {
            return latestResponse.getFeedTypeAvatarMap();
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.friendstab.ability.BaseBottomTabAvatarAbility
    public final ArrayList<? extends UserNewContent> LJFF() {
        NewContentResponse latestResponse = C1595430rcT.LIZIZ.LIZIZ().getLatestResponse();
        if (latestResponse != null) {
            return latestResponse.getNewMergedAvatarList();
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x001b  */
    @Override // com.ss.android.ugc.aweme.friendstab.ability.BaseBottomTabAvatarAbility, com.ss.android.ugc.aweme.friendstab.interfaces.IBottomFriendsTabAvatarAbility
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void w20() {
        /*
            r4 = this;
            X.0rPD r3 = r4.LLILLL
            r2 = 0
            if (r3 == 0) goto L46
            X.0rOF r1 = r3.LIZ
        L7:
            X.0rOF r0 = X.EnumC1586610rOF.FRIENDS_FEED
            if (r1 == r0) goto L1b
            if (r3 == 0) goto L44
            X.0rOF r1 = r3.LIZ
        Lf:
            X.0rOF r0 = X.EnumC1586610rOF.PURE_STORY
            if (r1 == r0) goto L1b
            if (r3 == 0) goto L42
            X.0rOF r1 = r3.LIZ
        L17:
            X.0rOF r0 = X.EnumC1586610rOF.FRIENDS_WATER_FALL
            if (r1 != r0) goto L3e
        L1b:
            X.0rPE r1 = X.C1587220rPE.LIZ
            if (r3 == 0) goto L2b
            com.ss.android.ugc.aweme.friendstab.model.UserNewContent r0 = r3.LIZIZ
            if (r0 == 0) goto L2b
            com.ss.android.ugc.aweme.friendstab.model.FriendsRedDotUser r0 = r0.getUser()
            if (r0 == 0) goto L2b
            java.lang.String r2 = r0.uid
        L2b:
            r1.getClass()
            boolean r0 = X.C2275711E5p.LIZ()
            if (r0 == 0) goto L3e
            kotlin.jvm.internal.AwS108S1000000_24 r1 = new kotlin.jvm.internal.AwS108S1000000_24
            r0 = 11
            r1.<init>(r2, r0)
            X.C087Q.LIZ(r1)
        L3e:
            super.w20()
            return
        L42:
            r1 = r2
            goto L17
        L44:
            r1 = r2
            goto Lf
        L46:
            r1 = r2
            goto L7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.friendstab.ability.FriendBottomTabAvatarAbility.w20():void");
    }

    @Override // com.ss.android.ugc.aweme.friendstab.ability.BaseBottomTabAvatarAbility
    public final void LJIIJ(List<String> list) {
        C1589640rT8.LIZIZ.k2(list, false);
    }

    @Override // com.ss.android.ugc.aweme.friendstab.ability.BaseBottomTabAvatarAbility, com.ss.android.ugc.aweme.friendstab.interfaces.IBottomFriendsTabAvatarAbility
    public final void ZD1(Aweme aweme) {
        EnumC1586610rOF enumC1586610rOF;
        boolean z;
        String str;
        UserNewContent userNewContent;
        UserNewContent userNewContent2;
        FriendsRedDotUser user;
        C1587210rPD c1587210rPD = this.LLILLL;
        String itemId = null;
        if (c1587210rPD != null) {
            enumC1586610rOF = c1587210rPD.LIZ;
        } else {
            enumC1586610rOF = null;
        }
        boolean z2 = false;
        if (enumC1586610rOF != EnumC1586610rOF.FRIENDS_FEED && enumC1586610rOF != EnumC1586610rOF.PURE_STORY && enumC1586610rOF != EnumC1586610rOF.FRIENDS_WATER_FALL) {
            z = false;
        } else {
            z = true;
        }
        if (c1587210rPD != null && (userNewContent2 = c1587210rPD.LIZIZ) != null && (user = userNewContent2.getUser()) != null) {
            str = user.uid;
        } else {
            str = null;
        }
        C1587210rPD c1587210rPD2 = this.LLILLL;
        if (c1587210rPD2 != null && (userNewContent = c1587210rPD2.LIZIZ) != null) {
            itemId = userNewContent.getItemId();
        }
        if ((Intrinsics.LJFF(aweme.getAid(), itemId) || aweme.getAid() == null) && Intrinsics.LJFF(AwemeExtKt.getAuthorUid(aweme), str)) {
            z2 = true;
        }
        if (z && z2) {
            C1587220rPE.LIZ.getClass();
            if (C2275711E5p.LIZ()) {
                C087Q.LIZ(new AwS108S1000000_24(str, 11));
            }
        }
        super.ZD1(aweme);
    }

    public FriendBottomTabAvatarAbility(String str, WeakReference<Context> weakReference) {
        super(str, weakReference);
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x008e A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00df A[PHI: r11
      0x00df: PHI (r11v3 boolean) = (r11v1 boolean), (r11v0 boolean) binds: [B:72:0x00dd, B:69:0x00d6] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0128  */
    @Override // com.ss.android.ugc.aweme.friendstab.ability.BaseBottomTabAvatarAbility, com.ss.android.ugc.aweme.friendstab.interfaces.IBottomFriendsTabAvatarAbility
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean Cs1(com.ss.android.ugc.aweme.friendstab.model.UserNewContent r14, X.EnumC1586610rOF r15) {
        /*
            Method dump skipped, instruction units count: 413
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.friendstab.ability.FriendBottomTabAvatarAbility.Cs1(com.ss.android.ugc.aweme.friendstab.model.UserNewContent, X.0rOF):boolean");
    }
}
