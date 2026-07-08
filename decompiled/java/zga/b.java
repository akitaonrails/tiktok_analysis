package zga;

import X.C01GW;
import X.C0WZX;
import X.C1745300vWC;
import X.C1745340vWG;
import X.C1745660vWm;
import X.C1745680vWo;
import X.C2204961BRm;
import X.C452501pT;
import X.InterfaceC998610c5r;
import android.view.View;
import com.ss.android.ugc.aweme.ecommerce.base.address.edit.detail.AddressEditDetailActivity;
import com.ss.android.ugc.aweme.ecommerce.base.address.edit.detail.AddressEditDetailViewModel;
import kotlin.jvm.internal.AwS570S0100000_26;
import p8b.c;

/* JADX INFO: loaded from: classes27.dex */
public final class b implements c, InterfaceC998610c5r {
    public final C1745300vWC LL;
    public final AddressEditDetailActivity LLILLJJLI;
    public final AddressEditDetailViewModel LLILLL;
    public C1745660vWm LLILZ;
    public int LLILZLL;
    public boolean LLIZ;
    public boolean LLJ;
    public Boolean LLJI;
    public C1745680vWo LLJIJIL;
    public long LLILZIL = -1;
    public boolean LLIZLLLIL = true;
    public final C01GW LLJILJIL = C452501pT.LIZIZ(new AwS570S0100000_26(this, 1639));

    @Override // p8b.c
    public final String getViewName() {
        return "TextInputHelper";
    }

    @Override // X.InterfaceC998610c5r
    public final View l() {
        return this.LL.getInputWithIndicatorEditTextFromXml();
    }

    @Override // X.InterfaceC998610c5r
    public final boolean w2() {
        C1745340vWG c1745340vWG;
        String str;
        C1745680vWo c1745680vWo = this.LLJIJIL;
        if (c1745680vWo != null) {
            if (!c1745680vWo.LJFF) {
                return false;
            }
            if (c1745680vWo != null && (c1745340vWG = c1745680vWo.LIZJ) != null && (str = c1745340vWG.LIZ) != null && str.length() > 0) {
                return true;
            }
        }
        return String.valueOf(C2204961BRm.LLLLJI(this.LL.getInputWithIndicatorEditTextFromXml(), new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KO+rbJLD2SDodnumb/RY5KIch+E5zrpsHbqVmM6d4ROH8MmREOXM5f7Oj4qLY+inFG2vDjgovgPHoBJUeYk=", null))).length() == 0;
    }

    public b(C1745300vWC c1745300vWC, AddressEditDetailActivity addressEditDetailActivity, AddressEditDetailViewModel addressEditDetailViewModel) {
        this.LL = c1745300vWC;
        this.LLILLJJLI = addressEditDetailActivity;
        this.LLILLL = addressEditDetailViewModel;
    }
}
