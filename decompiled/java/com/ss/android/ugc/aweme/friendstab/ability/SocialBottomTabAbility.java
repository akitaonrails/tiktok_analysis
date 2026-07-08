package com.ss.android.ugc.aweme.friendstab.ability;

import X.AbstractC1591090rVT;
import X.C0C0K;
import X.C0CAU;
import X.C1388190mED;
import X.C1583510rJF;
import X.C1591880rWk;
import X.C19EG;
import X.C343710Ddh;
import X.C786410Ut5;
import X.InterfaceC1586360rNq;
import Y.ARunnableS124S0100000_24;
import android.content.Context;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.bytedance.hox.Hox;
import com.ss.android.ugc.aweme.friendstab.interfaces.IBottomTabLayoutAbility;
import com.ss.android.ugc.aweme.friendstab.interfaces.IFriendsTabLayoutAbility;
import com.ss.android.ugc.aweme.friendstab.interfaces.ISocial2TabProtocolAbility;
import com.ss.android.ugc.aweme.friendstab.protocol.ISocialTabProtocol;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes25.dex */
public final class SocialBottomTabAbility implements IBottomTabLayoutAbility, InterfaceC1586360rNq {
    public final Context LL;
    public final String LLILLJJLI = "FRIENDS_TAB";
    public boolean LLILLL;
    public boolean LLILZ;

    @Override // com.ss.android.ugc.aweme.friendstab.interfaces.IBottomTabLayoutAbility
    public final void MB2() {
    }

    @Override // com.ss.android.ugc.aweme.friendstab.interfaces.IBottomTabLayoutAbility
    public final Fragment dL() {
        C19EG c19egLIZIZ;
        Context context = this.LL;
        if (context == null || (c19egLIZIZ = C1388190mED.LIZIZ(context)) == null) {
            return null;
        }
        return Hox.LLJILJIL.LIZ(c19egLIZIZ).Ki(this.LLILLJJLI);
    }

    @Override // com.ss.android.ugc.aweme.friendstab.interfaces.IBottomTabLayoutAbility
    public final AbstractC1591090rVT dO() {
        C19EG c19egLIZIZ;
        C1591880rWk c1591880rWk = C1591880rWk.LIZIZ;
        Context context = this.LL;
        if (context != null && (c19egLIZIZ = C1388190mED.LIZIZ(context)) != null) {
            return c1591880rWk.LJIILL(c19egLIZIZ).y01();
        }
        "Required value was null.".toString();
        throw new IllegalArgumentException("Required value was null.");
    }

    @Override // com.ss.android.ugc.aweme.friendstab.interfaces.IBottomTabLayoutAbility
    public final boolean hv0() {
        C19EG c19egLIZIZ;
        Context context = this.LL;
        if (context == null || (c19egLIZIZ = C1388190mED.LIZIZ(context)) == null) {
            return false;
        }
        return Intrinsics.LJFF(C343710Ddh.LIZ(c19egLIZIZ).CQ2(), this.LLILLJJLI);
    }

    @Override // com.ss.android.ugc.aweme.friendstab.interfaces.IBottomTabLayoutAbility
    public final void vJ1() {
        C786410Ut5.LJJZZIII(C0CAU.LIZ, new ARunnableS124S0100000_24(this, 28));
    }

    @Override // com.ss.android.ugc.aweme.friendstab.interfaces.IBottomTabLayoutAbility
    public final int Tw0() {
        AbstractC1591090rVT abstractC1591090rVTDO = dO();
        if (abstractC1591090rVTDO != null) {
            return abstractC1591090rVTDO.LJIJ(this.LLILLJJLI);
        }
        return 0;
    }

    @Override // com.ss.android.ugc.aweme.friendstab.interfaces.IBottomTabLayoutAbility
    public final boolean Dg1() {
        return this.LLILLL;
    }

    public SocialBottomTabAbility(Context context) {
        C19EG c19egLIZIZ;
        this.LL = context;
        if (context != null && (c19egLIZIZ = C1388190mED.LIZIZ(context)) != null) {
            C343710Ddh.LIZ(c19egLIZIZ).wQ2(this);
        }
    }

    @Override // com.ss.android.ugc.aweme.friendstab.interfaces.IBottomTabLayoutAbility
    public final void vd0(boolean z) {
        this.LLILLL = z;
    }

    @Override // X.InterfaceC1586360rNq
    public final void LLLZLZ(String str, String str2, boolean z, boolean z2, Bundle bundle, String str3) {
        String strNk0;
        Context context;
        ISocial2TabProtocolAbility iSocial2TabProtocolAbilityLJ;
        List<ISocialTabProtocol> listB9;
        ISocialTabProtocol next;
        Context context2;
        IFriendsTabLayoutAbility iFriendsTabLayoutAbilityLIZIZ;
        IFriendsTabLayoutAbility iFriendsTabLayoutAbilityLIZIZ2;
        if (Intrinsics.LJFF(str, this.LLILLJJLI)) {
            Context context3 = this.LL;
            if (context3 == null || (iFriendsTabLayoutAbilityLIZIZ2 = C1583510rJF.LIZIZ(context3)) == null || (strNk0 = iFriendsTabLayoutAbilityLIZIZ2.nk0()) == null) {
                strNk0 = "";
            }
            if (this.LLILLL && !Intrinsics.LJFF(strNk0, "FRIENDS_FEED") && (context2 = this.LL) != null && (iFriendsTabLayoutAbilityLIZIZ = C1583510rJF.LIZIZ(context2)) != null) {
                iFriendsTabLayoutAbilityLIZIZ.On0("FRIENDS_FEED");
            }
            if (this.LLILZ && !C0C0K.LIZ() && (context = this.LL) != null && (iSocial2TabProtocolAbilityLJ = C1583510rJF.LJ(context)) != null && (listB9 = iSocial2TabProtocolAbilityLJ.b9()) != null) {
                Iterator<ISocialTabProtocol> it2 = listB9.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        next = it2.next();
                        if (Intrinsics.LJFF(next.getTag(), strNk0)) {
                            break;
                        }
                    } else {
                        next = null;
                        break;
                    }
                }
                ISocialTabProtocol iSocialTabProtocol = next;
                if (iSocialTabProtocol != null) {
                    iSocialTabProtocol.B3();
                }
            }
            this.LLILZ = true;
        }
        if (Intrinsics.LJFF(str2, this.LLILLJJLI)) {
            vJ1();
        }
    }
}
