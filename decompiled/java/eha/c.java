package eha;

import X.C01GW;
import X.C03DZ;
import X.C0WZX;
import X.C13LP;
import X.C1744700vVE;
import X.C1745300vWC;
import X.C1745340vWG;
import X.C1745360vWI;
import X.C1745680vWo;
import X.C1746460vY4;
import X.C2204961BRm;
import X.C452501pT;
import X.InterfaceC998610c5r;
import android.view.View;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.InputItemDTO;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.Region;
import com.ss.android.ugc.aweme.ecommerce.base.address.edit.AddressEditFragment;
import com.ss.android.ugc.aweme.ecommerce.base.address.edit.AddressEditViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.widget.regionpicker.model.AddressBase;
import defpackage.RegionCandHelper;
import java.util.List;
import kotlin.jvm.internal.AwS570S0100000_26;
import kotlin.jvm.internal.AwS640S0100000_26;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes27.dex */
public final class c implements p8b.c, InterfaceC998610c5r {
    public final C1745300vWC LL;
    public final AddressEditFragment LLILLJJLI;
    public final AddressEditViewModel LLILLL;
    public C1745360vWI LLILZ;
    public final RegionCandHelper LLILZIL;
    public int LLIZ;
    public boolean LLIZLLLIL;
    public boolean LLJI;
    public C1745680vWo LLJIJIL;
    public boolean LLJILJIL;
    public long LLILZLL = -1;
    public boolean LLJ = true;
    public final C01GW LLJILJILJ = C452501pT.LIZIZ(new AwS570S0100000_26(this, 1232));
    public final AwS640S0100000_26 LLJILLL = new AwS640S0100000_26(this, 76);

    @Override // p8b.c
    public final String getViewName() {
        return "RegionSearchInputHelper";
    }

    public final String LIZ() {
        String str;
        C1745680vWo c1745680vWo = this.LLJIJIL;
        Object obj = c1745680vWo != null ? c1745680vWo.LIZIZ : null;
        return (!(obj instanceof String) || (str = (String) obj) == null) ? "" : str;
    }

    public final void LIZJ() {
        String str;
        Object obj;
        InputItemDTO inputItemDTO;
        C1746460vY4 c1746460vY4 = C1746460vY4.LIZ;
        C1745680vWo c1745680vWo = this.LLJIJIL;
        if (c1745680vWo == null || (inputItemDTO = c1745680vWo.LIZ) == null) {
            str = null;
            if (c1745680vWo == null) {
                obj = null;
            }
            c1746460vY4.getClass();
            C1746460vY4.LJIIIZ(str, obj, null, true);
            this.LLILLL.LLJJIJIL.LJI(this.LLJIJIL, Long.valueOf(this.LLILZLL), true, null);
        }
        str = inputItemDTO.key;
        obj = c1745680vWo.LIZIZ;
        c1746460vY4.getClass();
        C1746460vY4.LJIIIZ(str, obj, null, true);
        this.LLILLL.LLJJIJIL.LJI(this.LLJIJIL, Long.valueOf(this.LLILZLL), true, null);
    }

    @Override // X.InterfaceC998610c5r
    public final View l() {
        return this.LL.getEditViewFromXml();
    }

    @Override // X.InterfaceC998610c5r
    public final boolean w2() {
        C1745340vWG c1745340vWG;
        String str;
        C1745680vWo c1745680vWo = this.LLJIJIL;
        if (c1745680vWo != null) {
            if (c1745680vWo.LJII || !c1745680vWo.LJFF) {
                return false;
            }
            if (c1745680vWo != null && (c1745340vWG = c1745680vWo.LIZJ) != null && (str = c1745340vWG.LIZ) != null && str.length() > 0) {
                return true;
            }
        }
        return String.valueOf(C2204961BRm.LLLLJI(this.LL.getEditViewFromXml(), new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KO+rbJLD2SDodnumb/RY5KIch+E5zrpsHbqVmM6R4QuW/NeRNOnO+/DB40Gj6sIHmh6/aRbNGiaoeVc=", null))).length() == 0;
    }

    public final void LIZIZ(List<Region> list, AddressBase addressBase) {
        String str;
        String str2;
        if (list == null) {
            this.LLJILJIL = false;
            C1745680vWo c1745680vWo = this.LLJIJIL;
            if (c1745680vWo != null) {
                c1745680vWo.LIZIZ = "";
            }
            C1745360vWI c1745360vWI = this.LLILZ;
            if (c1745360vWI != null) {
                this.LL.getEditViewFromXml().removeTextChangedListener(c1745360vWI);
                this.LL.getEditViewFromXml().setText("");
                this.LL.getEditViewFromXml().addTextChangedListener(this.LLILZ);
            }
            LIZJ();
            return;
        }
        this.LLJILJIL = true;
        Region region = (Region) C13LP.LJJJLL(list);
        if (region != null) {
            str = region.name;
        } else {
            str = null;
        }
        if (!Intrinsics.LJFF(str, LIZ())) {
            this.LLILLL.LLJJIJI = true;
        }
        AddressEditViewModel addressEditViewModel = this.LLILLL;
        addressEditViewModel.LLJJI = list;
        if (addressBase != null) {
            addressEditViewModel.LLLILZLLLI = addressBase;
        }
        C1745680vWo c1745680vWo2 = this.LLJIJIL;
        if (c1745680vWo2 != null) {
            Region region2 = (Region) C13LP.LJJJLL(list);
            if (region2 != null) {
                str2 = region2.name;
            } else {
                str2 = null;
            }
            c1745680vWo2.LIZIZ = str2;
        }
        this.LL.getEditViewFromXml().setText(LIZ());
        C03DZ.LIZ(this.LL.getAddressInvalidMessageFromXml());
        C1745680vWo c1745680vWo3 = this.LLJIJIL;
        if (c1745680vWo3 != null) {
            c1745680vWo3.LJIIIZ = "";
            c1745680vWo3.LJIIJ = null;
        }
        C1744700vVE.LIZJ(this.LL.getEditViewFromXml());
        LIZJ();
    }

    public c(C1745300vWC c1745300vWC, AddressEditFragment addressEditFragment, AddressEditViewModel addressEditViewModel) {
        this.LL = c1745300vWC;
        this.LLILLJJLI = addressEditFragment;
        this.LLILLL = addressEditViewModel;
        this.LLILZIL = new RegionCandHelper(c1745300vWC.getContext(), c1745300vWC.getEditViewFromXml());
    }
}
