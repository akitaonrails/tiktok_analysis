package com.ss.android.ugc.aweme.tako.otherpage.image.detail.assem;

import X.AnonymousClass0951;
import X.C09IC;
import X.C13LP;
import X.C1679860toe;
import X.C1687330u0h;
import X.C1687490u0x;
import X.C1862330yYx;
import X.C1BNE;
import X.C2097608Jq;
import X.C2252321DDq;
import X.C291001Au;
import X.InterfaceC0148002o;
import X.InterfaceC1856570yPf;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.tako.otherpage.image.detail.assem.TakoContentPreviewItem;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS266S0000000_25;
import org.json.JSONException;

/* JADX INFO: loaded from: classes26.dex */
public final class TakoContentPreviewViewModel extends AssemViewModel<C1679860toe> implements InterfaceC1856570yPf {
    public final C2252321DDq LL;
    public final AnonymousClass0951 LLILLJJLI;
    public C1687490u0x LLILLL;

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C1679860toe(0);
    }

    public final void resetState() throws JSONException {
        setState(AFwS266S0000000_25.get$arr$(261));
        C1687490u0x c1687490u0x = this.LLILLL;
        if (c1687490u0x != null && c1687490u0x.LIZJ > 0) {
            C1687490u0x.LIZ(c1687490u0x, c1687490u0x.LIZ, System.currentTimeMillis() - c1687490u0x.LIZIZ);
        }
        this.LLILLL = null;
    }

    public final void vQ2() {
        if (((C291001Au) this.LLILLJJLI.getValue()).LIZIZ) {
            this.LL.setValue(new C291001Au(Boolean.TRUE));
        }
    }

    public TakoContentPreviewViewModel() {
        C291001Au c291001Au = new C291001Au(Boolean.FALSE);
        c291001Au.LIZ();
        C2252321DDq c2252321DDqLIZ = C1BNE.LIZ(c291001Au);
        this.LL = c2252321DDqLIZ;
        this.LLILLJJLI = C09IC.LIZIZ(c2252321DDqLIZ);
    }

    @Override // X.InterfaceC1856570yPf
    public final boolean l90() {
        return !getState().LL.isEmpty();
    }

    @Override // X.InterfaceC1856570yPf
    public final void Lk0(List<? extends TakoContentPreviewItem> list, int i, String str, boolean z, List<String> list2, Map<String, String> map, String str2, boolean z2, boolean z3) {
        setState(new C1687330u0h(list, i, str, z, list2, map, str2, z2, z3));
        C1862330yYx.LJLJJLL(20, C1862330yYx.LIZ, str2, null, str, map);
        TakoContentPreviewItem takoContentPreviewItem = (TakoContentPreviewItem) C13LP.LJJJLL(list);
        if (takoContentPreviewItem instanceof TakoContentPreviewItem.Image) {
            C1687490u0x c1687490u0x = new C1687490u0x(null, C2097608Jq.LJIIL(map, C2097608Jq.LJIIIIZZ(new Pair("url", C13LP.LJJJLL(((TakoContentPreviewItem.Image) takoContentPreviewItem).imageUrls)), new Pair("page_type", "image"))));
            this.LLILLL = c1687490u0x;
            c1687490u0x.LIZJ = System.currentTimeMillis();
        }
    }
}
