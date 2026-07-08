package com.ss.android.ugc.aweme.compliance.business.policynotice.ui;

import X.C098200Yq;
import X.C10KE;
import X.C1391890mKB;
import X.C1391960mKI;
import X.C13LE;
import X.C13LP;
import X.C13LQ;
import X.C15438062q;
import X.C166Z;
import X.C1685300txQ;
import X.C1697810uHb;
import X.C189200o6;
import X.C1913750ztt;
import X.C1914080zuQ;
import X.C19EG;
import X.C19GS;
import X.C1EE5;
import X.C2217381BqS;
import X.C439850HMp;
import X.C444940Hca;
import X.InterfaceC2217461Bqa;
import android.os.Bundle;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.sheet.intro.TuxPanel;
import com.ss.android.ugc.aweme.pns.universalpopup.core.model.StyleExtra;
import com.ss.android.ugc.aweme.pns.universalpopup.core.model.UniversalPopup;
import com.ss.android.ugc.aweme.pns.universalpopup.core.model.UniversalPopupBodyLinkList;
import com.ss.android.ugc.aweme.pns.universalpopup.core.model.UniversalPopupButton;
import com.ss.android.ugc.aweme.pns.universalpopup.core.ui.UniversalPopupUI;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.jvm.internal.AwS141S1100000_27;
import kotlin.jvm.internal.AwS305S0300000_28;
import kotlin.jvm.internal.AwS394S0200000_28;
import kotlin.jvm.internal.AwS429S0200000_28;
import kotlin.jvm.internal.AwS596S0100000_17;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import kotlin.text.u;

/* JADX INFO: loaded from: classes29.dex */
public final class UniversalPopupPanelUI extends UniversalPopupUI {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJI;
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiYjJD8/ISQiKip9KjA/ICE2HELIOSOzZiOSA/ISY1JyAnISYpZzo6ZhAiIDk2OjYtJR88ODA8GS49LSkZAA==";
    public final C166Z LLIZ = new C166Z(new AwS394S0200000_28((LayoutInflater) null, this, 15), true);
    public final C1391960mKI LLIZLLLIL = new C1391960mKI();
    public final AtomicBoolean LLJ = new AtomicBoolean(false);

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(UniversalPopupPanelUI.class, "binding", "getBinding()Lcom/ss/android/ugc/aweme/pns/universalpopup/core/databinding/UniversalPopupUiFragmentBinding;", 0);
        C13LE.LIZ.getClass();
        LLJI = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    @Override // com.ss.android.ugc.aweme.pns.universalpopup.core.ui.UniversalPopupUI
    public final void SR(SpannableStringBuilder spannableStringBuilder, String str) {
    }

    @Override // com.ss.android.ugc.aweme.pns.universalpopup.core.ui.UniversalPopupUI
    public final void WR(String str) {
        this.LLIZLLLIL.LJII = str;
    }

    @Override // com.ss.android.ugc.aweme.pns.universalpopup.core.ui.UniversalPopupUI
    public final void RR(Map<String, String> map, StyleExtra styleExtra) {
        boolean zBooleanValue;
        boolean zLJFF;
        Boolean bool;
        String str;
        List<UniversalPopupBodyLinkList> list;
        boolean z;
        int iIntValue;
        int iIntValue2;
        UniversalPopup universalPopupPR = PR();
        boolean zLJFF2 = false;
        if (universalPopupPR != null && (str = universalPopupPR.body) != null) {
            UniversalPopup universalPopupPR2 = PR();
            if (universalPopupPR2 != null) {
                list = universalPopupPR2.popupLinkList;
            } else {
                list = null;
            }
            if (list != null && !list.isEmpty()) {
                z = false;
            } else {
                z = true;
            }
            if (z) {
                C1391960mKI c1391960mKI = this.LLIZLLLIL;
                C1391890mKB[] c1391890mKBArr = {new C1391890mKB(str, null, null, 6)};
                c1391960mKI.getClass();
                c1391960mKI.LJIIIZ = C13LQ.LJJLL(c1391890mKBArr);
            } else if (!a0.LJJIIZI(str, "%s", false)) {
                C1391960mKI c1391960mKI2 = this.LLIZLLLIL;
                C1391890mKB[] c1391890mKBArr2 = {new C1391890mKB(str, null, null, 6)};
                c1391960mKI2.getClass();
                c1391960mKI2.LJIIIZ = C13LQ.LJJLL(c1391890mKBArr2);
            } else {
                String strLJJIFFI = u.LJJIFFI(str, "\n", "<br>", false);
                try {
                    ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
                    for (UniversalPopupBodyLinkList universalPopupBodyLinkList : list) {
                        C444940Hca c444940Hca = new C444940Hca();
                        c444940Hca.LIZIZ = universalPopupBodyLinkList.hasChevron;
                        c444940Hca.LJI = true;
                        c444940Hca.LJIIIIZZ = new AwS429S0200000_28(this, universalPopupBodyLinkList, 167);
                        Integer num = C1EE5.LIZIZ.get(universalPopupBodyLinkList.color);
                        if (num != null) {
                            iIntValue = num.intValue();
                        } else {
                            iIntValue = 1;
                        }
                        c444940Hca.LIZLLL(iIntValue);
                        String str2 = universalPopupBodyLinkList.name;
                        if (str2 != null) {
                            c444940Hca.LIZJ = str2;
                        }
                        Integer num2 = C1EE5.LIZ.get(universalPopupBodyLinkList.font);
                        if (num2 != null) {
                            iIntValue2 = num2.intValue();
                        } else {
                            iIntValue2 = 62;
                        }
                        c444940Hca.LIZIZ(iIntValue2);
                        arrayList.add((Spannable) c444940Hca.LIZ(requireContext()));
                    }
                    Spannable[] spannableArr = (Spannable[]) arrayList.toArray(new Spannable[0]);
                    this.LLIZLLLIL.LJIIIIZZ = C10KE.LIZIZ(strLJJIFFI, (Spannable[]) Arrays.copyOf(spannableArr, spannableArr.length));
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    C1391960mKI c1391960mKI3 = this.LLIZLLLIL;
                    C1391890mKB[] c1391890mKBArr3 = {new C1391890mKB(str, null, null, 6)};
                    c1391960mKI3.getClass();
                    c1391960mKI3.LJIIIZ = C13LQ.LJJLL(c1391890mKBArr3);
                }
            }
        }
        C1391960mKI c1391960mKI4 = this.LLIZLLLIL;
        UniversalPopup universalPopupPR3 = PR();
        if (universalPopupPR3 != null && (bool = universalPopupPR3.upperRightClose) != null) {
            zBooleanValue = bool.booleanValue();
        } else {
            zBooleanValue = false;
        }
        c1391960mKI4.LIZ = zBooleanValue;
        C439850HMp c439850HMpLIZ = this.LLIZLLLIL.LIZ();
        UniversalPopup universalPopupPR4 = PR();
        if (universalPopupPR4 != null) {
            zLJFF = Intrinsics.LJFF(universalPopupPR4.swipeDownClose, Boolean.TRUE);
        } else {
            zLJFF = false;
        }
        c439850HMpLIZ.LIZ.LLJILJIL = zLJFF;
        UniversalPopup universalPopupPR5 = PR();
        if (universalPopupPR5 != null) {
            zLJFF2 = Intrinsics.LJFF(universalPopupPR5.dismissClickOutside, Boolean.TRUE);
        }
        TuxPanel tuxPanel = c439850HMpLIZ.LIZ;
        tuxPanel.LLJI = zLJFF2;
        tuxPanel.show(getChildFragmentManager(), "UNIVERSAL_POPUP_INTRO_PANEL");
    }

    @Override // com.ss.android.ugc.aweme.pns.universalpopup.core.ui.UniversalPopupUI
    public final void VR(String str, String str2) {
        if (a0.LJJJIL(str) && a0.LJJJIL(str2)) {
            return;
        }
        String strNR = NR(str, str2);
        C1391960mKI c1391960mKI = this.LLIZLLLIL;
        c1391960mKI.LJI = 1;
        c1391960mKI.LJ = new AwS141S1100000_27(strNR, this, 4);
    }

    @Override // com.ss.android.ugc.aweme.pns.universalpopup.core.ui.UniversalPopupUI
    public final void UR(List list, Boolean bool, AwS596S0100000_17 awS596S0100000_17) {
        List<UniversalPopupButton> list2;
        if (Intrinsics.LJFF(bool, Boolean.TRUE)) {
            C1391960mKI c1391960mKI = this.LLIZLLLIL;
            c1391960mKI.LJIIL = true;
            c1391960mKI.LJIILJJIL = true;
        }
        int i = 0;
        for (Object obj : C13LP.LL(list, 2)) {
            int i2 = i + 1;
            UniversalPopupButton universalPopupButton = null;
            if (i >= 0) {
                C1913750ztt c1913750ztt = (C1913750ztt) obj;
                UniversalPopup universalPopupPR = PR();
                if (universalPopupPR != null && (list2 = universalPopupPR.buttons) != null) {
                    universalPopupButton = (UniversalPopupButton) C13LP.LJJJLZIJ(i, list2);
                }
                AwS305S0300000_28 awS305S0300000_28 = new AwS305S0300000_28(universalPopupButton, c1913750ztt, awS596S0100000_17, 1);
                if (i == 0) {
                    this.LLIZLLLIL.LIZIZ(c1913750ztt.LIZ, awS305S0300000_28);
                } else {
                    this.LLIZLLLIL.LIZJ(c1913750ztt.LIZ, awS305S0300000_28);
                }
                i = i2;
            } else {
                C1697810uHb.LJIJI();
                throw null;
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C166Z c166z = this.LLIZ;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJI;
        ConstraintLayout constraintLayout = ((C1914080zuQ) c166z.LIZIZ(this)).LL;
        C19GS c19gs = null;
        if (!(constraintLayout instanceof View)) {
            constraintLayout = null;
        }
        if (constraintLayout != null) {
            try {
                ViewTreeLifecycleOwner.set(constraintLayout, getViewLifecycleOwner());
                ViewTreeViewModelStoreOwner.set(constraintLayout, this);
                constraintLayout.setTag(R.id.view_tree_saved_state_registry_owner, this);
                C19EG activity = getActivity();
                if (activity instanceof C19GS) {
                    c19gs = (C19GS) activity;
                }
                C1685300txQ.LIZ(c19gs);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
                return constraintLayout;
            }
        }
        C189200o6.m2constructorimpl(Unit.LIZ);
        return constraintLayout;
    }
}
