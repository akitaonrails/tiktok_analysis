package com.ss.android.ugc.profile.business.ci.viewer.ui;

import X.C01GW;
import X.C0P6P;
import X.C1216270hkv;
import X.C1390410mHn;
import X.C13LE;
import X.C1402240mas;
import X.C20605115k1;
import X.C2217381BqS;
import X.C326810CrX;
import X.C452501pT;
import X.C627300Oj2;
import X.C786410Ut5;
import X.EnumC323450Cm7;
import X.InterfaceC1891350zJl;
import X.InterfaceC2217461Bqa;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.powerlist.footer.PowerLoadingCell;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.profile.business.ci.viewer.viewmodel.ProfileViewerViewModel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS565S0100000_21;

/* JADX INFO: loaded from: classes22.dex */
public final class ViewerItemFooterCell extends PowerLoadingCell {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLIZLLLIL;
    public C627300Oj2 LL;
    public EnumC323450Cm7 LLILLJJLI = EnumC323450Cm7.Refresh;
    public final C1402240mas LLILLL = new C1402240mas(this, 1);
    public final C01GW LLILZ = C452501pT.LIZIZ(new AwS565S0100000_21(this, 1154));
    public final C01GW LLILZIL = C452501pT.LIZIZ(new AwS565S0100000_21(this, 1152));
    public final C01GW LLILZLL = C452501pT.LIZIZ(new AwS565S0100000_21(this, 1153));
    public final C01GW LLIZ = C452501pT.LIZIZ(new AwS565S0100000_21(this, 1155));

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(ViewerItemFooterCell.class, "control", "getControl()Lcom/ss/android/ugc/profile/business/ci/viewer/ui/IFooterControl;", 0);
        C13LE.LIZ.getClass();
        LLIZLLLIL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    @Override // com.bytedance.ies.powerlist.footer.PowerLoadingCell
    public final void L5() {
        C786410Ut5.LLLZZIL((C1390410mHn) this.itemView.findViewById(R.id.gb5), 8);
        if (!((Boolean) this.LLIZ.getValue()).booleanValue()) {
            C786410Ut5.LLLLZLL((TuxTextView) this.itemView.findViewById(R.id.zb2), 8);
            return;
        }
        C786410Ut5.LLLLZLL((TuxTextView) this.itemView.findViewById(R.id.zb2), 0);
        TextView textView = (TextView) this.itemView.findViewById(R.id.zb2);
        ProfileViewerViewModel profileViewerViewModel = (ProfileViewerViewModel) this.LLILZLL.getValue();
        textView.setText(C1216270hkv.LIZJ((profileViewerViewModel == null || !profileViewerViewModel.zQ2()) ? 2131845521 : 2131837214));
    }

    @Override // com.bytedance.ies.powerlist.footer.PowerLoadingCell
    public final void LIZJ() {
        RecyclerView recyclerView;
        C786410Ut5.LLLZZIL((C1390410mHn) this.itemView.findViewById(R.id.gb5), 8);
        C786410Ut5.LLLLZLL((TuxTextView) this.itemView.findViewById(R.id.zb2), 8);
        if (C326810CrX.LIZ[this.LLILLJJLI.ordinal()] != 1 || (recyclerView = (RecyclerView) this.LLILZ.getValue()) == null) {
            return;
        }
        C786410Ut5.LLLLZLL((TuxTextView) this.itemView.findViewById(R.id.zb2), 0);
        ((TextView) this.itemView.findViewById(R.id.zb2)).setText(C1216270hkv.LIZJ(2131845625));
        if (this.LL == null) {
            this.LL = new C627300Oj2(recyclerView, (C0P6P) this.LLILZIL.getValue());
        }
        C627300Oj2 c627300Oj2 = this.LL;
        if (c627300Oj2 != null) {
            c627300Oj2.LLILLL = true;
        }
    }

    @Override // com.bytedance.ies.powerlist.footer.PowerLoadingCell
    public final void N5() {
        C786410Ut5.LLLLZLL((TuxTextView) this.itemView.findViewById(R.id.zb2), 8);
        C1390410mHn c1390410mHn = (C1390410mHn) this.itemView.findViewById(R.id.gb5);
        C786410Ut5.LLLZZIL(c1390410mHn, 0);
        ((C1390410mHn) c1390410mHn.findViewById(R.id.gb5)).LIZJ();
    }

    @Override // com.bytedance.ies.powerlist.footer.PowerLoadingCell
    /* JADX INFO: renamed from: I5 */
    public final void onBindItemView(C20605115k1 c20605115k1) {
        super.onBindItemView(c20605115k1);
        this.LLILLJJLI = c20605115k1.LLILLL.LIZIZ.LIZ;
    }

    @Override // com.bytedance.ies.powerlist.footer.PowerLoadingCell, com.bytedance.ies.powerlist.PowerCell
    public final /* bridge */ /* synthetic */ void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl) {
        onBindItemView((C20605115k1) interfaceC1891350zJl);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        return C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.ejq, viewGroup, false);
    }
}
