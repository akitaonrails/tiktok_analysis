package com.ss.android.ugc.aweme.offlinemode.viewmodel;

import X.C05Q9;
import X.C05QA;
import X.C09YA;
import X.C0OEU;
import X.C0PEM;
import X.C1349205Pu;
import X.C13BV;
import X.C19319410i8;
import X.C1BMD;
import X.C2188811AlT;
import X.C23250099c;
import X.C291001Au;
import X.C297220Bku;
import X.C297260Bky;
import X.C608110NtB;
import X.C608210NtL;
import X.C610460Nwy;
import X.C616100OEm;
import X.C624670Oen;
import X.C624810Of1;
import X.C624880Of8;
import X.C624940OfE;
import X.C625130OfX;
import X.C625420Og0;
import X.C625470Og5;
import X.C625530OgB;
import X.EnumC624750Oev;
import X.EnumC624770Oex;
import X.EnumC624780Oey;
import X.EnumC624820Of2;
import X.EnumC624830Of3;
import X.EnumC624840Of4;
import X.EnumC624950OfF;
import X.EnumC624960OfG;
import X.EnumC624980OfI;
import X.InterfaceC0148002o;
import X.InterfaceC624740Oeu;
import X.InterfaceC625450Og3;
import X.InterfaceC625570OgF;
import X.InterfaceC736910SvR;
import Y.ARunnableS5S1000000_9;
import androidx.lifecycle.ViewModelKt;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.offlinemode.database.OfflineModeFeedPBDataBase;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS240S0000000_9;
import kotlin.jvm.internal.AwS24S0001000_9;
import kotlin.jvm.internal.AwS24S0010000_9;
import kotlin.jvm.internal.AwS588S0100000_9;

/* JADX INFO: loaded from: classes10.dex */
public final class OfflineModeManagerVM extends AssemViewModel<C616100OEm> implements InterfaceC625450Og3 {
    public static final C19319410i8 LLILZLL = new C19319410i8("OfflineModeManagerVM");
    public C608210NtL LLILLL;
    public final C09YA LL = new C09YA(this, new C608110NtB());
    public int LLILLJJLI = C1BMD.LIZIZ.getEffectiveConnectionType();
    public boolean LLILZ = true;
    public final List<String> LLILZIL = new ArrayList();

    @Override // X.InterfaceC625450Og3
    public final void cU1() {
    }

    public final InterfaceC736910SvR<InterfaceC624740Oeu> wQ2() {
        return (InterfaceC736910SvR) this.LL.getValue();
    }

    public final void xQ2() {
        LLILZLL.LIZ("sendBackPressEvent", null);
        setState(AFwS240S0000000_9.get$arr$(590));
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        boolean zLJJLJ = ((InterfaceC624740Oeu) wQ2().getOperator()).LJJLJ();
        return new C616100OEm(((InterfaceC624740Oeu) wQ2().getOperator()).q0() / ((double) 1024), ((InterfaceC624740Oeu) wQ2().getOperator()).LJIILIIL(), ((InterfaceC624740Oeu) wQ2().getOperator()).LLIIJI(), zLJJLJ, ((InterfaceC624740Oeu) wQ2().getOperator()).LJIIJ(), null, null, null, null, null, null, null, null, new C291001Au(0L), C13BV.INSTANCE, new Pair("ss", Float.valueOf(0.0f)));
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel, androidx.lifecycle.ViewModel
    public final void onCleared() {
        super.onCleared();
        ((InterfaceC624740Oeu) wQ2().getOperator()).LLLIZZ(this);
        C608210NtL c608210NtL = this.LLILLL;
        if (c608210NtL != null) {
            C1BMD.LIZIZ.removeEffectiveConnectionTypeChangedListener(c608210NtL);
        }
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final void onPrepared() {
        super.onPrepared();
        ((InterfaceC624740Oeu) wQ2().getOperator()).LLLLLIL(this);
        C23250099c.LIZLLL(ViewModelKt.getViewModelScope(this), C0PEM.LIZJ, null, new C1349205Pu(this, null), 2);
    }

    public final void AQ2(EnumC624770Oex enumC624770Oex) {
        C19319410i8 c19319410i8 = LLILZLL;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("setDownloadState ");
        sbLIZ.append(enumC624770Oex);
        c19319410i8.LIZ(C2188811AlT.LIZIZ(sbLIZ), null);
        setState(new AwS588S0100000_9(enumC624770Oex, 363));
    }

    public final void BQ2(boolean z) {
        C19319410i8 c19319410i8 = LLILZLL;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("setIsWifiOnly ");
        sbLIZ.append(z);
        c19319410i8.LIZ(C2188811AlT.LIZIZ(sbLIZ), null);
        setState(new AwS24S0010000_9(z, 7));
    }

    public final void CQ2(C0OEU c0oeu) {
        C19319410i8 c19319410i8 = LLILZLL;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("setPopupDialogEvent ");
        sbLIZ.append(c0oeu);
        c19319410i8.LIZ(C2188811AlT.LIZIZ(sbLIZ), null);
        setState(new AwS588S0100000_9(c0oeu, 364));
    }

    public final void DQ2(EnumC624830Of3 enumC624830Of3) {
        C19319410i8 c19319410i8 = LLILZLL;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("setPopupSheetToastEvent ");
        sbLIZ.append(enumC624830Of3);
        c19319410i8.LIZ(C2188811AlT.LIZIZ(sbLIZ), null);
        setState(new AwS588S0100000_9(enumC624830Of3, 365));
    }

    public final void EQ2(EnumC624780Oey enumC624780Oey) {
        C19319410i8 c19319410i8 = LLILZLL;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("setPopupVideoToastEvent ");
        sbLIZ.append(enumC624780Oey);
        c19319410i8.LIZ(C2188811AlT.LIZIZ(sbLIZ), null);
        setState(new AwS588S0100000_9(enumC624780Oey, 366));
    }

    public final void FQ2(EnumC624750Oev enumC624750Oev) {
        C19319410i8 c19319410i8 = LLILZLL;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("setSheetStyle ");
        sbLIZ.append(enumC624750Oev);
        c19319410i8.LIZ(C2188811AlT.LIZIZ(sbLIZ), null);
        setState(new AwS588S0100000_9(enumC624750Oev, 367));
    }

    public final void GQ2(EnumC624950OfF enumC624950OfF) {
        C19319410i8 c19319410i8 = LLILZLL;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("setSheetUpdateEvent ");
        sbLIZ.append(enumC624950OfF);
        c19319410i8.LIZ(C2188811AlT.LIZIZ(sbLIZ), null);
        setState(new AwS588S0100000_9(enumC624950OfF, 368));
    }

    public final void HQ2(List<String> list) {
        Integer numValueOf;
        C19319410i8 c19319410i8 = LLILZLL;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("setWatchedList ");
        if (list != null) {
            numValueOf = Integer.valueOf(list.size());
        } else {
            numValueOf = null;
        }
        sbLIZ.append(numValueOf);
        c19319410i8.LIZ(C2188811AlT.LIZIZ(sbLIZ), null);
        setState(new C05Q9(list));
    }

    public final void IQ2(EnumC624770Oex enumC624770Oex) {
        if (enumC624770Oex == null) {
            enumC624770Oex = getState().LLILLL;
        }
        int i = C624810Of1.LIZ[enumC624770Oex.ordinal()];
        if (i != 3) {
            if (i != 4) {
                if (i == 5) {
                    DQ2(EnumC624830Of3.NETWORK_NO_TOAST);
                    return;
                }
                return;
            }
            DQ2(EnumC624830Of3.STORAGE_FULL_TOAST);
            return;
        }
        DQ2(EnumC624830Of3.NETWORK_WIFI_TOAST);
    }

    public final void KQ2(EnumC624770Oex enumC624770Oex) {
        EnumC624980OfI enumC624980OfI;
        C625470Og5.LL.getClass();
        if (C625420Og0.LJ() == 1) {
            C625420Og0.LJIIIIZZ().LIZJ("default_enable_state", 2);
        }
        switch (C624810Of1.LIZ[enumC624770Oex.ordinal()]) {
            case 1:
                OQ2(true);
                if (getState().LLIZ == EnumC624750Oev.OFFLINE_MODE_PANEL) {
                    enumC624980OfI = EnumC624980OfI.CLICK_DOWNLOAD;
                } else if (getState().LLIZ == EnumC624750Oev.OFFLINE_MODE_SETTING_PANEL) {
                    enumC624980OfI = EnumC624980OfI.CLICK_CONTINUE;
                } else {
                    enumC624980OfI = EnumC624980OfI.USER_RESUME;
                }
                ((InterfaceC624740Oeu) wQ2().getOperator()).LLJJIII(enumC624980OfI);
                break;
            case 2:
                ((InterfaceC624740Oeu) wQ2().getOperator()).LLJLL();
                break;
            case 3:
            case 4:
            case 5:
                ((InterfaceC624740Oeu) wQ2().getOperator()).J(enumC624770Oex);
                break;
            case 6:
                ((InterfaceC624740Oeu) wQ2().getOperator()).LLJLL();
                break;
        }
        AQ2(enumC624770Oex);
    }

    public final void LQ2(Boolean bool) {
        boolean zBooleanValue;
        if (bool != null) {
            zBooleanValue = bool.booleanValue();
        } else if (!getState().LLILZ) {
            zBooleanValue = true;
        } else {
            zBooleanValue = false;
        }
        ((InterfaceC624740Oeu) wQ2().getOperator()).LLZL(zBooleanValue);
        BQ2(zBooleanValue);
    }

    public final void MQ2(EnumC624820Of2 enumC624820Of2) {
        int value;
        EnumC624950OfF enumC624950OfF;
        int i;
        C19319410i8 c19319410i8 = LLILZLL;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("trySwitchStateManually, downloadEnterMethod ");
        sbLIZ.append(enumC624820Of2);
        c19319410i8.LJIIIZ(C2188811AlT.LIZIZ(sbLIZ));
        if (enumC624820Of2 == EnumC624820Of2.ICON) {
            int i2 = C624810Of1.LIZ[getState().LLILLL.ordinal()];
            if (i2 != 1) {
                if (i2 == 2) {
                    return;
                }
            } else {
                KQ2(EnumC624770Oex.USER_PAUSE);
                return;
            }
        }
        EnumC624960OfG enumC624960OfGO0 = ((InterfaceC624740Oeu) wQ2().getOperator()).o0();
        c19319410i8.LIZ("try DOWNLOAD", enumC624960OfGO0);
        if (enumC624960OfGO0 != null) {
            value = enumC624960OfGO0.getValue();
        } else {
            value = -1;
        }
        C624940OfE.LIZ = value;
        if (enumC624960OfGO0 != null && (i = C624810Of1.LIZJ[enumC624960OfGO0.ordinal()]) != -1) {
            if (i != 1) {
                if (i != 2) {
                    if (i == 3) {
                        if (enumC624820Of2 != EnumC624820Of2.FYP_BUTTON && enumC624820Of2 != EnumC624820Of2.CLICK_TURNON) {
                            if (C624670Oen.LIZIZ()) {
                                KQ2(EnumC624770Oex.PAUSE_NOT_WIFI);
                                EQ2(EnumC624780Oey.NETWORK_WIFI_TOAST);
                                C625130OfX.LJ(C625130OfX.LIZ, "offline_mode_cache_load_block", null, null, null, null, Integer.valueOf(getState().LLILZIL), EnumC624840Of4.NOT_WIFI.getValue(), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -98, 131071);
                                return;
                            } else if (enumC624820Of2 == EnumC624820Of2.PSP) {
                                KQ2(EnumC624770Oex.PAUSE_NOT_WIFI);
                                C625130OfX.LJ(C625130OfX.LIZ, "offline_mode_cache_load_block", null, null, null, null, Integer.valueOf(getState().LLILZIL), EnumC624840Of4.NOT_WIFI.getValue(), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -98, 131071);
                                return;
                            } else {
                                CQ2(C0OEU.NETWORK_MOBILE_DIALOG);
                                return;
                            }
                        }
                        KQ2(EnumC624770Oex.PAUSE_NOT_WIFI);
                        C625130OfX.LJ(C625130OfX.LIZ, "offline_mode_cache_load_block", null, null, null, null, Integer.valueOf(getState().LLILZIL), EnumC624840Of4.NOT_WIFI.getValue(), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -98, 131071);
                        return;
                    }
                    return;
                }
                if (enumC624820Of2 != EnumC624820Of2.FYP_BUTTON && enumC624820Of2 != EnumC624820Of2.CLICK_TURNON) {
                    if (C624670Oen.LIZIZ()) {
                        KQ2(EnumC624770Oex.PAUSE_NO_NETWORK);
                        EQ2(EnumC624780Oey.NETWORK_NO_TOAST);
                    } else if (enumC624820Of2 == EnumC624820Of2.PSP) {
                        KQ2(EnumC624770Oex.PAUSE_NO_NETWORK);
                    } else if (enumC624820Of2 == EnumC624820Of2.CONTINUE && C297220Bku.LIZ()) {
                        EQ2(EnumC624780Oey.SWITCH_TIER_NO_NET_TOAST);
                    } else {
                        EQ2(EnumC624780Oey.NETWORK_NO_TOAST);
                    }
                } else {
                    KQ2(EnumC624770Oex.PAUSE_NO_NETWORK);
                }
                C625130OfX.LJ(C625130OfX.LIZ, "offline_mode_cache_load_block", null, null, null, null, Integer.valueOf(getState().LLILZIL), EnumC624840Of4.NO_INTERNET_CONNECTION.getValue(), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -98, 131071);
                return;
            }
            if (enumC624820Of2 != EnumC624820Of2.FYP_BUTTON && enumC624820Of2 != EnumC624820Of2.CLICK_TURNON) {
                if (C624670Oen.LIZIZ()) {
                    KQ2(EnumC624770Oex.PAUSE_STORAGE);
                    EQ2(EnumC624780Oey.STORAGE_FULL_TOAST);
                } else if (enumC624820Of2 == EnumC624820Of2.PSP) {
                    KQ2(EnumC624770Oex.PAUSE_STORAGE);
                } else {
                    EQ2(EnumC624780Oey.STORAGE_FULL_TOAST);
                }
            } else {
                KQ2(EnumC624770Oex.PAUSE_STORAGE);
            }
            C625130OfX.LJ(C625130OfX.LIZ, "offline_mode_cache_load_block", null, null, null, null, Integer.valueOf(getState().LLILZIL), EnumC624840Of4.NOT_ENOUGH_SPACE.getValue(), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -98, 131071);
            return;
        }
        KQ2(EnumC624770Oex.DOWNLOADING);
        if (C624670Oen.LIZIZ()) {
            if (enumC624820Of2 == null || C624810Of1.LIZIZ[enumC624820Of2.ordinal()] != 1) {
                return;
            }
            EQ2(EnumC624780Oey.START_DOWNLOADING_TOAST);
            return;
        }
        EnumC624750Oev enumC624750Oev = getState().LLIZ;
        EnumC624750Oev enumC624750Oev2 = EnumC624750Oev.OFFLINE_MODE_PANEL;
        if (enumC624750Oev != enumC624750Oev2 && enumC624820Of2 != EnumC624820Of2.CONTINUE) {
            if (((InterfaceC624740Oeu) wQ2().getOperator()).LLLLLLZ()) {
                ((InterfaceC624740Oeu) wQ2().getOperator()).LLLZZ();
                enumC624950OfF = EnumC624950OfF.FIRST_ENTER;
            } else {
                enumC624950OfF = EnumC624950OfF.CLICK_DOWNLOAD_ENTER;
            }
            FQ2(enumC624750Oev2);
            GQ2(enumC624950OfF);
            return;
        }
        if (enumC624820Of2 != EnumC624820Of2.CONTINUE) {
            return;
        }
        OQ2(true);
        vQ2(false);
    }

    public final void NQ2(boolean z) {
        InterfaceC624740Oeu interfaceC624740Oeu = (InterfaceC624740Oeu) wQ2().getOperator();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("vm, isFromDetail ");
        sbLIZ.append(z);
        interfaceC624740Oeu.LJLLI(2, C2188811AlT.LIZIZ(sbLIZ));
        ((InterfaceC624740Oeu) wQ2().getOperator()).f(z);
    }

    public final void OQ2(boolean z) {
        int iLJIIJ = ((InterfaceC624740Oeu) wQ2().getOperator()).LJIIJ();
        int i = getState().LLILZIL;
        if (iLJIIJ == i) {
            return;
        }
        if (z) {
            C625470Og5.LL.getClass();
            if (C625420Og0.LJ() == 1) {
                C625420Og0.LJIIIIZZ().LIZJ("default_enable_state", 2);
            }
            ((InterfaceC624740Oeu) wQ2().getOperator()).LLILZLL(i);
            return;
        }
        zQ2(iLJIIJ);
    }

    @Override // X.InterfaceC625450Og3
    public final void RX0(List<String> list) {
        List<String> list2 = ((C616100OEm) getState()).LLILZLL;
        if (list2 == null) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (String str : list2) {
            if (!list.contains(str)) {
                arrayList.add(str);
            }
        }
        C19319410i8 c19319410i8 = LLILZLL;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onDeleteCaches, oldList ");
        sbLIZ.append(list2.size());
        sbLIZ.append(", aids ");
        sbLIZ.append(list.size());
        sbLIZ.append(", newList ");
        sbLIZ.append(arrayList.size());
        c19319410i8.LIZ(C2188811AlT.LIZIZ(sbLIZ), null);
        HQ2(arrayList);
    }

    @Override // X.InterfaceC625450Og3
    public final void SL2(EnumC624770Oex enumC624770Oex) {
        LLILZLL.LIZ("onUpdateDownloadState", enumC624770Oex);
        AQ2(enumC624770Oex);
        IQ2(enumC624770Oex);
    }

    @Override // X.InterfaceC625450Og3
    public final void Wz1(int i) {
        if (i == getState().LLILZIL) {
            return;
        }
        zQ2(i);
    }

    @Override // X.InterfaceC625450Og3
    public final void dL1(int i) {
        C19319410i8 c19319410i8 = LLILZLL;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("cachedVideoCount: ");
        sbLIZ.append(i);
        c19319410i8.LIZ(C2188811AlT.LIZIZ(sbLIZ), null);
        setState(new AwS24S0001000_9(i, 7));
    }

    @Override // X.InterfaceC625450Og3
    public final void n11(double d) {
        C19319410i8 c19319410i8 = LLILZLL;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CachedVideoSize: ");
        sbLIZ.append(d / ((double) 1024));
        c19319410i8.LIZ(C2188811AlT.LIZIZ(sbLIZ), null);
        setState(new C624880Of8(d));
    }

    @Override // X.InterfaceC625450Og3
    public final void tF(boolean z) {
        String str;
        if (z == getState().LLILZ) {
            return;
        }
        BQ2(z);
        if (!C624670Oen.LIZIZ()) {
            C625130OfX c625130OfX = C625130OfX.LIZ;
            if (z) {
                str = "on";
            } else {
                str = "off";
            }
            C625130OfX.LJ(c625130OfX, "change_offline_mode_wifi_status", null, null, null, null, Integer.valueOf(getState().LLILZIL), null, null, null, null, null, null, str, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -4130, 131071);
        }
    }

    public final void vQ2(boolean z) {
        if (!z && !this.LLILZ) {
            this.LLILZ = true;
        } else {
            FQ2(null);
            GQ2(null);
        }
    }

    public final void yQ2(EnumC624950OfF enumC624950OfF) {
        EnumC624750Oev enumC624750Oev;
        if (enumC624950OfF == EnumC624950OfF.CLICK_REACH_BOTTOM_GUIDE) {
            enumC624750Oev = EnumC624750Oev.OFFLINE_MODE_SETTING_PANEL;
            enumC624750Oev.setWithBack(false);
        } else if (!C624670Oen.LIZIZ() && getState().LLILLL == EnumC624770Oex.UNINITIALIZED) {
            enumC624750Oev = EnumC624750Oev.OFFLINE_MODE_SETTING_PANEL;
            enumC624750Oev.setWithBack(false);
        } else {
            enumC624750Oev = EnumC624750Oev.OFFLINE_MODE_PANEL;
        }
        FQ2(enumC624750Oev);
        GQ2(enumC624950OfF);
    }

    public final void zQ2(int i) {
        C19319410i8 c19319410i8 = LLILZLL;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("setCacheCount ");
        sbLIZ.append(i);
        c19319410i8.LIZ(C2188811AlT.LIZIZ(sbLIZ), null);
        setState(new AwS24S0001000_9(i, 8));
    }

    public final void JQ2(int i, String str) {
        float fLJJIL;
        if (str != null && C297260Bky.LIZJ()) {
            if ((C297260Bky.LIZ() & 16) == 16 && C297260Bky.LIZJ() && C297260Bky.LIZIZ()) {
                C610460Nwy.LIZ.getClass();
                if (C610460Nwy.LJ()) {
                    C625530OgB.LIZ.getClass();
                    InterfaceC625570OgF interfaceC625570OgFLIZLLL = C625530OgB.LIZLLL();
                    String curSecUserId = C625530OgB.LIZLLL.getCurSecUserId();
                    if (curSecUserId == null) {
                        fLJJIL = -1.0f;
                    } else {
                        fLJJIL = interfaceC625570OgFLIZLLL.LJJIL(curSecUserId, str);
                    }
                    C19319410i8 c19319410i8 = LLILZLL;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("setScore ");
                    sbLIZ.append(fLJJIL);
                    c19319410i8.LIZ(C2188811AlT.LIZIZ(sbLIZ), null);
                    setState(new C05QA(str, fLJJIL));
                }
            }
            if (i > 0) {
                long jCurrentTimeMillis = System.currentTimeMillis();
                C625530OgB.LIZ.getClass();
                OfflineModeFeedPBDataBase.LL.getValue().runInTransaction(new ARunnableS5S1000000_9(str, 2));
                C610460Nwy c610460Nwy = C610460Nwy.LIZ;
                long jCurrentTimeMillis2 = System.currentTimeMillis() - jCurrentTimeMillis;
                c610460Nwy.getClass();
                C610460Nwy.LIZ(jCurrentTimeMillis2, "updateWatchedScore");
            }
        }
    }
}
