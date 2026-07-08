package com.ss.android.ugc.aweme.tako.menuwindow;

import X.C01GW;
import X.C0OGR;
import X.C0PEM;
import X.C1163730gOB;
import X.C1389890mGx;
import X.C1852960yJq;
import X.C1853070yK1;
import X.C19EG;
import X.C23250099c;
import X.C345300DgG;
import X.C449180HjQ;
import X.C452501pT;
import X.C540120LGg;
import X.EnumC1853160yKA;
import X.InterfaceC0148002o;
import android.content.Context;
import android.content.res.Resources;
import android.net.Uri;
import android.view.View;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.ss.android.ugc.aweme.tako.multipletemplate.gallery.TikTokMediaModel;
import java.util.HashMap;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS216S0000000_27;
import kotlin.jvm.internal.AwS571S0100000_27;

/* JADX INFO: loaded from: classes28.dex */
public final class TakoMenuWindowViewModel extends AssemViewModel<C1853070yK1> {
    public static final /* synthetic */ int LLJILJILJ = 0;
    public BottomSheetBehavior<View> LL;
    public BottomSheetBehavior<View> LLILLJJLI;
    public boolean LLILZIL;
    public List<? extends TikTokMediaModel> LLILZLL;
    public List<? extends TikTokMediaModel> LLIZ;
    public int LLIZLLLIL;
    public AwS571S0100000_27 LLJ;
    public int LLILLL = -1;
    public int LLILZ = -1;
    public final HashMap<String, C1163730gOB> LLJI = new HashMap<>();
    public final C01GW LLJIJIL = C452501pT.LIZIZ(AFwS216S0000000_27.get$arr$(180));
    public final C01GW LLJILJIL = C452501pT.LIZIZ(AFwS216S0000000_27.get$arr$(181));

    public final int vQ2() {
        return ((Number) this.LLJILJIL.getValue()).intValue();
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C1853070yK1(C540120LGg.LIZLLL() ? EnumC1853160yKA.FULL_GRANTED : C540120LGg.LJ() ? EnumC1853160yKA.PARTIAL_GRANTED : EnumC1853160yKA.DENIED, 239);
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel, androidx.lifecycle.ViewModel
    public final void onCleared() {
        super.onCleared();
    }

    public final void wQ2(Context context) {
        C23250099c.LIZLLL(getAssemVMScope(), C0PEM.LIZJ, null, new C1852960yJq(this, context, null), 2);
    }

    public final void xQ2(C19EG c19eg, C0OGR c0ogr, Function2<? super Integer, ? super List<Uri>, Unit> function2) {
        String quantityString;
        int size = getState().LLILZ.size() + this.LLIZLLLIL;
        if (size >= vQ2()) {
            if (c19eg != null) {
                Resources resources = c19eg.getResources();
                if (resources != null) {
                    quantityString = resources.getQuantityString(2131755041, vQ2(), Integer.valueOf(vQ2()));
                } else {
                    quantityString = null;
                    if (c19eg == null) {
                        return;
                    }
                }
                C1389890mGx c1389890mGx = new C1389890mGx(c19eg);
                c1389890mGx.LJIIJ(quantityString);
                c1389890mGx.LJIIJJI();
                return;
            }
            return;
        }
        if (c19eg != null) {
            C449180HjQ c449180HjQ = C449180HjQ.LIZ;
            C345300DgG c345300DgG = new C345300DgG(c19eg, size, false, c0ogr, function2);
            c449180HjQ.getClass();
            C449180HjQ.LIZLLL(c345300DgG);
        }
    }
}
