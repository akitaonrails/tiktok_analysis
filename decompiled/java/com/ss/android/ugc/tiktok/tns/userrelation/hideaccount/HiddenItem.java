package com.ss.android.ugc.tiktok.tns.userrelation.hideaccount;

import X.C01GW;
import X.C09CT;
import X.C127A;
import X.C1393160mME;
import X.C1393220mMK;
import X.C13LP;
import X.C1610870s1N;
import X.C2188811AlT;
import X.C452501pT;
import X.EnumC1392960mLu;
import X.EnumC2009407u0;
import X.EnumC994420bz6;
import X.InterfaceC1631620sYq;
import java.io.Serializable;
import java.util.List;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.internal.AwS575S0100000_31;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes32.dex */
public final class HiddenItem implements Serializable {

    @C09CT("hide_status")
    public final int hideStatus;

    @C09CT("mute_status")
    public final List<Integer> muteStatus;
    public final C01GW muteStatusSet$delegate;

    @C09CT("user")
    public final HiddenUser user;

    public HiddenItem() {
        this(null, EnumC994420bz6.NOT_HIDE.getValue(), null);
    }

    public final HiddenItem copy(HiddenUser hiddenUser, int i, List<Integer> list) {
        return new HiddenItem(hiddenUser, i, list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HiddenItem)) {
            return false;
        }
        HiddenItem hiddenItem = (HiddenItem) obj;
        return Intrinsics.LJFF(this.user, hiddenItem.user) && this.hideStatus == hiddenItem.hideStatus && Intrinsics.LJFF(this.muteStatus, hiddenItem.muteStatus);
    }

    public int hashCode() {
        HiddenUser hiddenUser = this.user;
        int iHashCode = (((hiddenUser == null ? 0 : hiddenUser.hashCode()) * 31) + this.hideStatus) * 31;
        List<Integer> list = this.muteStatus;
        return iHashCode + (list != null ? list.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("HiddenItem(user=");
        sbLIZ.append(this.user);
        sbLIZ.append(", hideStatus=");
        sbLIZ.append(this.hideStatus);
        sbLIZ.append(", muteStatus=");
        sbLIZ.append(this.muteStatus);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final Set<Integer> LIZ() {
        return (Set) this.muteStatusSet$delegate.getValue();
    }

    public final boolean isHidden() {
        C1610870s1N.LIZ.getClass();
        return C1610870s1N.LIZLLL() ? LIZ().contains(Integer.valueOf(EnumC2009407u0.MUTE_STATUS_STORY.getValue())) || LIZ().contains(Integer.valueOf(EnumC2009407u0.MUTE_STATUS_NON_STORY.getValue())) || LIZ().contains(Integer.valueOf(EnumC2009407u0.MUTE_STATUS_LIVES.getValue())) : this.hideStatus == EnumC994420bz6.HIDE.getValue();
    }

    public final List<Integer> generateMuteStatus() {
        return C13LP.LLIIII(LIZ());
    }

    public final void muteByType(EnumC1392960mLu enumC1392960mLu) {
        int i = C1393220mMK.LIZ[enumC1392960mLu.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    LIZ().add(Integer.valueOf(EnumC2009407u0.MUTE_STATUS_LIVES.getValue()));
                    return;
                }
                return;
            }
            LIZ().add(Integer.valueOf(EnumC2009407u0.MUTE_STATUS_NON_STORY.getValue()));
            return;
        }
        LIZ().add(Integer.valueOf(EnumC2009407u0.MUTE_STATUS_STORY.getValue()));
    }

    public final C1393160mME toMuteActionSheetConfig(InterfaceC1631620sYq<? super C127A, ? super EnumC1392960mLu, ? super Boolean, Unit> interfaceC1631620sYq) {
        String str;
        boolean z;
        HiddenUser hiddenUser = this.user;
        if (hiddenUser == null || (str = hiddenUser.nickname) == null) {
            str = "";
        }
        if (this.hideStatus == EnumC994420bz6.HIDE.getValue()) {
            z = true;
        } else {
            z = false;
        }
        return new C1393160mME(str, z, LIZ().contains(Integer.valueOf(EnumC2009407u0.MUTE_STATUS_STORY.getValue())), LIZ().contains(Integer.valueOf(EnumC2009407u0.MUTE_STATUS_NON_STORY.getValue())), LIZ().contains(Integer.valueOf(EnumC2009407u0.MUTE_STATUS_LIVES.getValue())), interfaceC1631620sYq);
    }

    public final void unMuteByType(EnumC1392960mLu enumC1392960mLu) {
        int i = C1393220mMK.LIZ[enumC1392960mLu.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    LIZ().remove(Integer.valueOf(EnumC2009407u0.MUTE_STATUS_LIVES.getValue()));
                    return;
                }
                return;
            }
            LIZ().remove(Integer.valueOf(EnumC2009407u0.MUTE_STATUS_NON_STORY.getValue()));
            return;
        }
        LIZ().remove(Integer.valueOf(EnumC2009407u0.MUTE_STATUS_STORY.getValue()));
    }

    public HiddenItem(HiddenUser hiddenUser, int i, List<Integer> list) {
        this.user = hiddenUser;
        this.hideStatus = i;
        this.muteStatus = list;
        this.muteStatusSet$delegate = C452501pT.LIZIZ(new AwS575S0100000_31(this, 1290));
    }
}
