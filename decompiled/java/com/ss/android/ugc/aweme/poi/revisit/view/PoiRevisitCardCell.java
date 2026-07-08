package com.ss.android.ugc.aweme.poi.revisit.view;

import X.C019F;
import X.C01D1;
import X.C01GW;
import X.C03IJ;
import X.C03K6;
import X.C1178910gmf;
import X.C13LE;
import X.C1558520qew;
import X.C19719912Dl;
import X.C2188811AlT;
import X.C2211631BhB;
import X.C2217381BqS;
import X.C452080Ho6;
import X.C452501pT;
import X.C737910Sx3;
import X.InterfaceC1891350zJl;
import X.InterfaceC2217461Bqa;
import X.InterfaceC451590HnJ;
import X.InterfaceC665370Q7z;
import X.ViewOnAttachStateChangeListenerC1846530y9T;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.ies.powerlist.PowerCell;
import com.ss.android.ugc.aweme.poi.revisit.model.PoiRevisitCardItem;
import com.ss.android.ugc.aweme.poi.revisit.vm.PoiRevisitViewModel;
import kotlin.jvm.internal.AFwS224S0000000_33;
import kotlin.jvm.internal.AFwS279S0000000_33;
import kotlin.jvm.internal.AwS375S0200000_9;
import kotlin.jvm.internal.AwS434S0200000_33;
import kotlin.jvm.internal.AwS577S0100000_33;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes34.dex */
public final class PoiRevisitCardCell extends PowerCell<PoiRevisitCardItem> {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLILLJJLI;
    public final AssemVMLazy LL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(PoiRevisitCardCell.class, "pageVM", "getPageVM()Lcom/ss/android/ugc/aweme/poi/revisit/vm/PoiRevisitViewModel;", 0);
        C13LE.LIZ.getClass();
        LLILLJJLI = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public PoiRevisitCardCell() {
        AssemVMLazy assemVMLazy;
        Object obj = C01D1.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(PoiRevisitViewModel.class);
        AwS577S0100000_33 awS577S0100000_33 = new AwS577S0100000_33(c19719912DlLIZ, 3045);
        AFwS279S0000000_33 aFwS279S0000000_33 = AFwS279S0000000_33.get$arr$(214);
        if (Intrinsics.LJFF(obj, obj)) {
            assemVMLazy = new AssemVMLazy(new AwS577S0100000_33(c19719912DlLIZ, 3056), awS577S0100000_33, AFwS224S0000000_33.get$arr$(419), new AwS577S0100000_33((C03K6) this, 3031), new AwS577S0100000_33((C03K6) this, 3033), new AwS577S0100000_33((HasDefaultViewModelProviderFactory) this, 3035), aFwS279S0000000_33, new AwS577S0100000_33((C03K6) this, 3037), null, new AwS577S0100000_33((C03K6) this, 3038));
        } else if (obj instanceof InterfaceC451590HnJ) {
            AwS577S0100000_33 awS577S0100000_332 = new AwS577S0100000_33((C03K6) this, 3032);
            AwS577S0100000_33 awS577S0100000_333 = new AwS577S0100000_33((HasDefaultViewModelProviderFactory) this, 3034);
            AwS577S0100000_33 awS577S0100000_334 = new AwS577S0100000_33(c19719912DlLIZ, 3036);
            C01GW c01gwLIZIZ = C452501pT.LIZIZ(new AwS434S0200000_33((InterfaceC451590HnJ) obj, awS577S0100000_332, 119));
            AwS577S0100000_33 awS577S0100000_335 = new AwS577S0100000_33(c01gwLIZIZ, 3039);
            AwS577S0100000_33 awS577S0100000_336 = new AwS577S0100000_33(c01gwLIZIZ, 3040);
            AwS577S0100000_33 awS577S0100000_337 = new AwS577S0100000_33(c01gwLIZIZ, 3041);
            AwS577S0100000_33 awS577S0100000_338 = new AwS577S0100000_33(c01gwLIZIZ, 3042);
            AwS577S0100000_33 awS577S0100000_339 = new AwS577S0100000_33(c01gwLIZIZ, 3043);
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = C737910Sx3.LIZ;
            assemVMLazy = new AssemVMLazy(awS577S0100000_334, awS577S0100000_33, new C452080Ho6(), awS577S0100000_335, awS577S0100000_336, awS577S0100000_333, aFwS279S0000000_33, awS577S0100000_337, awS577S0100000_338, awS577S0100000_339);
        } else if (Intrinsics.LJFF(obj, C019F.LIZ)) {
            assemVMLazy = new AssemVMLazy(new AwS577S0100000_33(c19719912DlLIZ, 3044), awS577S0100000_33, AFwS224S0000000_33.get$arr$(420), new AwS577S0100000_33((C03K6) this, 3046), new AwS577S0100000_33((C03K6) this, 3047), new AwS577S0100000_33((HasDefaultViewModelProviderFactory) this, 3048), aFwS279S0000000_33, new AwS577S0100000_33((C03K6) this, 3049), null, new AwS577S0100000_33((C03K6) this, 3050));
        } else {
            if (!Intrinsics.LJFF(obj, C03IJ.LIZ)) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Don't support this VMScope: ");
                sbLIZ.append(obj);
                sbLIZ.append(" there");
                throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
            }
            assemVMLazy = new AssemVMLazy(new AwS577S0100000_33(c19719912DlLIZ, 3051), awS577S0100000_33, AFwS224S0000000_33.get$arr$(421), new AwS577S0100000_33((C03K6) this, 3052), new AwS577S0100000_33((C03K6) this, 3053), new AwS577S0100000_33((C03K6) this, 3054), aFwS279S0000000_33, null, null, new AwS577S0100000_33((C03K6) this, 3055));
        }
        this.LL = assemVMLazy;
    }

    public final PoiRevisitViewModel I5() {
        AssemVMLazy assemVMLazy = this.LL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLILLJJLI;
        return (PoiRevisitViewModel) assemVMLazy.getValue();
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onItemViewCreated() {
        super.onItemViewCreated();
        InterfaceC665370Q7z interfaceC665370Q7z = I5().LLJ;
        C2211631BhB.LJ(this.itemView, new AwS375S0200000_9(this, interfaceC665370Q7z != null ? (IPoiRevisitNavAssemAbility) C1558520qew.LIZ(interfaceC665370Q7z, IPoiRevisitNavAssemAbility.class, null) : null, 93));
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl) {
        C1178910gmf c1178910gmf;
        PoiRevisitCardItem poiRevisitCardItem = (PoiRevisitCardItem) interfaceC1891350zJl;
        super.onBindItemView(poiRevisitCardItem);
        View view = this.itemView;
        if ((view instanceof C1178910gmf) && (c1178910gmf = (C1178910gmf) view) != null) {
            c1178910gmf.LIZ(poiRevisitCardItem, I5().LLJ, I5().LLILZIL);
        }
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        C1178910gmf c1178910gmf = new C1178910gmf(viewGroup.getContext(), null, 6);
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -2);
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c1178910gmf);
        c1178910gmf.setLayoutParams(layoutParams);
        return c1178910gmf;
    }
}
