package com.bytedance.android.livesdk.gift.base.platform.business.panel.portrait.banner.switchcolor;

import X.C019F;
import X.C01D1;
import X.C01GW;
import X.C03IJ;
import X.C03K6;
import X.C1142320fpe;
import X.C1263704x1;
import X.C1324610kZf;
import X.C1324720kZq;
import X.C13LE;
import X.C16F5;
import X.C1819620xS4;
import X.C1841350y17;
import X.C19719912Dl;
import X.C2188811AlT;
import X.C2217381BqS;
import X.C452080Ho6;
import X.C452501pT;
import X.C737910Sx3;
import X.C786410Ut5;
import X.InterfaceC1891350zJl;
import X.InterfaceC2217461Bqa;
import X.InterfaceC451590HnJ;
import Y.ACListenerS120S0200000_17;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.ies.powerlist.PowerCell;
import com.zhiliaoapp.musically.R;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AFwS224S0000000_33;
import kotlin.jvm.internal.AFwS279S0000000_33;
import kotlin.jvm.internal.AwS434S0200000_33;
import kotlin.jvm.internal.AwS577S0100000_33;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes34.dex */
public final class CountryItemCell extends PowerCell<C1142320fpe> {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLILZLL;
    public final AssemVMLazy LL;
    public C1324720kZq LLILLJJLI;
    public C16F5 LLILLL;
    public C1841350y17 LLILZ;
    public int LLILZIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(CountryItemCell.class, "vm", "getVm()Lcom/bytedance/android/livesdk/gift/base/platform/business/panel/portrait/banner/switchcolor/CountryListDialogAssemViewModel;", 0);
        C13LE.LIZ.getClass();
        LLILZLL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public CountryItemCell() {
        AssemVMLazy assemVMLazy;
        Object obj = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(CountryListDialogAssemViewModel.class);
        AwS577S0100000_33 awS577S0100000_33 = new AwS577S0100000_33(c19719912DlLIZ, 204);
        AFwS279S0000000_33 aFwS279S0000000_33 = AFwS279S0000000_33.get$arr$(21);
        if (Intrinsics.LJFF(obj, C01D1.LIZ)) {
            assemVMLazy = new AssemVMLazy(new AwS577S0100000_33(c19719912DlLIZ, 215), awS577S0100000_33, AFwS224S0000000_33.get$arr$(30), new AwS577S0100000_33((C03K6) this, 190), new AwS577S0100000_33((C03K6) this, 192), new AwS577S0100000_33((HasDefaultViewModelProviderFactory) this, 194), aFwS279S0000000_33, new AwS577S0100000_33((C03K6) this, 196), null, new AwS577S0100000_33((C03K6) this, 197));
        } else if (obj instanceof InterfaceC451590HnJ) {
            AwS577S0100000_33 awS577S0100000_332 = new AwS577S0100000_33((C03K6) this, 191);
            AwS577S0100000_33 awS577S0100000_333 = new AwS577S0100000_33((HasDefaultViewModelProviderFactory) this, 193);
            AwS577S0100000_33 awS577S0100000_334 = new AwS577S0100000_33(c19719912DlLIZ, 195);
            C01GW c01gwLIZIZ = C452501pT.LIZIZ(new AwS434S0200000_33((InterfaceC451590HnJ) obj, awS577S0100000_332, 7));
            AwS577S0100000_33 awS577S0100000_335 = new AwS577S0100000_33(c01gwLIZIZ, 198);
            AwS577S0100000_33 awS577S0100000_336 = new AwS577S0100000_33(c01gwLIZIZ, 199);
            AwS577S0100000_33 awS577S0100000_337 = new AwS577S0100000_33(c01gwLIZIZ, 200);
            AwS577S0100000_33 awS577S0100000_338 = new AwS577S0100000_33(c01gwLIZIZ, 201);
            AwS577S0100000_33 awS577S0100000_339 = new AwS577S0100000_33(c01gwLIZIZ, 202);
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = C737910Sx3.LIZ;
            assemVMLazy = new AssemVMLazy(awS577S0100000_334, awS577S0100000_33, new C452080Ho6(), awS577S0100000_335, awS577S0100000_336, awS577S0100000_333, aFwS279S0000000_33, awS577S0100000_337, awS577S0100000_338, awS577S0100000_339);
        } else if (Intrinsics.LJFF(obj, obj)) {
            assemVMLazy = new AssemVMLazy(new AwS577S0100000_33(c19719912DlLIZ, 203), awS577S0100000_33, AFwS224S0000000_33.get$arr$(28), new AwS577S0100000_33((C03K6) this, 205), new AwS577S0100000_33((C03K6) this, 206), new AwS577S0100000_33((HasDefaultViewModelProviderFactory) this, 207), aFwS279S0000000_33, new AwS577S0100000_33((C03K6) this, 208), null, new AwS577S0100000_33((C03K6) this, 209));
        } else {
            if (!Intrinsics.LJFF(obj, C03IJ.LIZ)) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Don't support this VMScope: ");
                sbLIZ.append(obj);
                sbLIZ.append(" there");
                throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
            }
            assemVMLazy = new AssemVMLazy(new AwS577S0100000_33(c19719912DlLIZ, 210), awS577S0100000_33, AFwS224S0000000_33.get$arr$(29), new AwS577S0100000_33((C03K6) this, 211), new AwS577S0100000_33((C03K6) this, 212), new AwS577S0100000_33((C03K6) this, 213), aFwS279S0000000_33, null, null, new AwS577S0100000_33((C03K6) this, 214));
        }
        this.LL = assemVMLazy;
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onItemViewCreated() {
        super.onItemViewCreated();
        this.LLILLJJLI = (C1324720kZq) this.itemView.findViewById(R.id.f1w);
        this.LLILLL = (C16F5) this.itemView.findViewById(R.id.f25);
        this.LLILZ = (C1841350y17) this.itemView.findViewById(R.id.f23);
        this.LLILZIL = this.itemView.getResources().getDimensionPixelSize(R.dimen.am0);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl) {
        C1142320fpe c1142320fpe = (C1142320fpe) interfaceC1891350zJl;
        C1324720kZq c1324720kZq = this.LLILLJJLI;
        if (c1324720kZq != null) {
            C1324610kZf c1324610kZfLJIIIZ = C1819620xS4.LIZ().LJIIIZ(c1142320fpe.LL.colorImage);
            int i = this.LLILZIL;
            c1324610kZfLJIIIZ.LJ = i;
            c1324610kZfLJIIIZ.LJFF = i;
            c1324610kZfLJIIIZ.LJJ = Boolean.FALSE;
            c1324610kZfLJIIIZ.LJJI(c1324720kZq);
        }
        C16F5 c16f5 = this.LLILLL;
        if (c16f5 != null) {
            c16f5.setText(c1142320fpe.LL.colorName);
        }
        C1841350y17 c1841350y17 = this.LLILZ;
        if (c1841350y17 != null) {
            c1841350y17.setChecked(c1142320fpe.LLILLJJLI);
        }
        C786410Ut5.I7(new ACListenerS120S0200000_17(c1142320fpe, this, 24), this.itemView);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        return C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.g3c, viewGroup, false);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl, List list) {
        Object next;
        C1263704x1 c1263704x1;
        C1841350y17 c1841350y17;
        super.onBindItemView(interfaceC1891350zJl, list);
        Iterator it2 = list.iterator();
        do {
            next = null;
            if (!it2.hasNext()) {
                break;
            } else {
                next = it2.next();
            }
        } while (!(next instanceof C1263704x1));
        if ((next instanceof C1263704x1) && (c1263704x1 = (C1263704x1) next) != null && (c1841350y17 = this.LLILZ) != null) {
            c1841350y17.setChecked(c1263704x1.LIZ);
        }
    }
}
