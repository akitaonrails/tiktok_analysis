package com.ss.android.ugc.aweme.ecommerce.search.result.vertical.video.assem.cell;

import X.C13LE;
import X.C2217381BqS;
import X.C684630QtJ;
import X.C786410Ut5;
import X.InterfaceC2217461Bqa;
import X.InterfaceC684640QtK;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.ies.powerlist.footer.PowerLoadingCell;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS554S0100000_10;

/* JADX INFO: loaded from: classes11.dex */
public final class VideoVerticalFooterCell extends PowerLoadingCell {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLILLJJLI;
    public final C684630QtJ LL = new C684630QtJ(this);

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(VideoVerticalFooterCell.class, "control", "getControl()Lcom/ss/android/ugc/aweme/ecommerce/search/result/vertical/video/assem/cell/IVideoVerticalFooterControl;", 0);
        C13LE.LIZ.getClass();
        LLILLJJLI = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    @Override // com.bytedance.ies.powerlist.footer.PowerLoadingCell
    public final void L5() {
        P5(new AwS554S0100000_10(this, 133));
    }

    @Override // com.bytedance.ies.powerlist.footer.PowerLoadingCell
    public final void LIZJ() {
        P5(new AwS554S0100000_10(this, 134));
    }

    @Override // com.bytedance.ies.powerlist.footer.PowerLoadingCell
    public final void N5() {
        P5(new AwS554S0100000_10(this, 135));
    }

    public final void P5(Function0<Unit> function0) {
        InterfaceC684640QtK interfaceC684640QtK = (InterfaceC684640QtK) this.LL.getValue(this, LLILLJJLI[0]);
        if (interfaceC684640QtK != null && !interfaceC684640QtK.XM1()) {
            C786410Ut5.LJLLLLLL(8, this.itemView);
        } else {
            C786410Ut5.LJLLLLLL(0, this.itemView);
            function0.invoke();
        }
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        return C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.bpb, viewGroup, false);
    }
}
