package com.bytedance.android.livesdk.comp.api.pcs.ui.loading;

import X.C03IJ;
import X.C1390410mHn;
import X.C13LE;
import X.C1558360qeg;
import X.C1558520qew;
import X.C1637806bA;
import X.C1749280vcc;
import X.C19719912Dl;
import X.C2217381BqS;
import X.C724240Sb0;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C785410UrT;
import X.DialogC1390150mHN;
import X.InterfaceC2217461Bqa;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.bytedance.assem.arch.view.UISlotAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS279S0000000_33;
import kotlin.jvm.internal.AwS546S0100000_2;
import kotlin.jvm.internal.AwS647S0100000_33;
import kotlin.jvm.internal.AwS682S0100000_33;

/* JADX INFO: loaded from: classes34.dex */
public class PcsGenericLoadingAssem extends UISlotAssem {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJJJ;
    public ViewGroup LLJJI;
    public C1749280vcc LLJJIII;
    public View LLJJIJI;
    public final AssemVMLazy LLJJIJIIJIL;
    public ViewGroup LLJJIJIL;
    public C1390410mHn LLJJJ;
    public DialogC1390150mHN LLJJJIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(PcsGenericLoadingAssem.class, "viewModel", "getViewModel()Lcom/bytedance/android/livesdk/comp/api/pcs/ui/loading/PcsGenericLoadingVM;", 0);
        C13LE.LIZ.getClass();
        LLJJJJ = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public PcsGenericLoadingAssem() {
        C03IJ c03ij = C03IJ.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(PcsGenericLoadingVM.class);
        this.LLJJIJIIJIL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c03ij, C1637806bA.LIZ, new AwS546S0100000_2(c19719912DlLIZ, 46), AFwS279S0000000_33.get$arr$(13), null, true);
    }

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int Co() {
        return R.layout.gzr;
    }

    public String getTag() {
        return null;
    }

    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onParent_set_isOnParentSetEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onPause_isOnPauseEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    public final PcsGenericLoadingVM hp() {
        AssemVMLazy assemVMLazy = this.LLJJIJIIJIL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJJJ;
        return (PcsGenericLoadingVM) assemVMLazy.getValue();
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onDestroy() {
        super.onDestroy();
        C1390410mHn c1390410mHn = this.LLJJJ;
        if (c1390410mHn != null) {
            c1390410mHn.LIZLLL();
        }
        DialogC1390150mHN dialogC1390150mHN = this.LLJJJIL;
        if (dialogC1390150mHN != null) {
            dialogC1390150mHN.dismiss();
            C785410UrT.LIZ(dialogC1390150mHN);
        }
        this.LLJJJIL = null;
        C1558520qew.LJIIJJI(C1558520qew.LJIIL(this), IPcsLoadingAbility.class, getTag());
    }

    @Override // X.AbstractC738140SxQ
    public final void onParentSet() {
        Fragment fragmentLJI = C724240Sb0.LJI(this);
        if (fragmentLJI != null) {
            C1558520qew.LJII(C1558360qeg.LJFF(fragmentLJI, null), hp(), IPcsLoadingAbility.class, getTag(), null);
        }
    }

    @Override // X.AbstractC738140SxQ
    public final void onPause() {
        super.onPause();
        C1390410mHn c1390410mHn = this.LLJJJ;
        if (c1390410mHn != null) {
            c1390410mHn.LIZLLL();
        }
    }

    @Override // com.bytedance.assem.arch.view.UISlotAssem, com.bytedance.assem.arch.core.UIAssem
    public final void xo() {
        super.xo();
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        this.LLJJIJIL = (ViewGroup) view.findViewById(R.id.c3g);
        this.LLJJJ = (C1390410mHn) view.findViewById(R.id.gb7);
        this.LLJJIII = (C1749280vcc) view.findViewById(R.id.z18);
        this.LLJJI = (ViewGroup) view.findViewById(R.id.hc7);
        this.LLJJIJI = view.findViewById(R.id.e1v);
        C736680Sv4.LJIIIZ(this, hp(), new C2217381BqS() { // from class: X.1A5e
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Boolean.valueOf(((C2173691A5f) obj).LLILLJJLI);
            }
        }, new C2217381BqS() { // from class: X.1A5h
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C2173691A5f) obj).LL;
            }
        }, null, new AwS682S0100000_33(this, 2), 12);
        C736680Sv4.LJIIIIZZ(this, hp(), new C2217381BqS() { // from class: X.1A5i
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C2173691A5f) obj).LL;
            }
        }, null, new AwS647S0100000_33(this, 2), 6);
        C736680Sv4.LJIIIIZZ(this, hp(), new C2217381BqS() { // from class: X.1A5d
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Integer.valueOf(((C2173691A5f) obj).LLILZ);
            }
        }, null, new AwS647S0100000_33(this, 3), 6);
        C736680Sv4.LJIIIIZZ(this, hp(), new C2217381BqS() { // from class: X.1A5j
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C2173691A5f) obj).LL;
            }
        }, null, new AwS647S0100000_33(this, 4), 6);
    }
}
