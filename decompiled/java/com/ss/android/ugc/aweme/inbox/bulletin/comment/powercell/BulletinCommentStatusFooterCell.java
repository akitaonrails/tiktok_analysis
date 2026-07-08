package com.ss.android.ugc.aweme.inbox.bulletin.comment.powercell;

import X.C01GW;
import X.C0HTI;
import X.C0OY6;
import X.C0OYI;
import X.C1196320hEk;
import X.C1220000hqw;
import X.C13LE;
import X.C1722300uv6;
import X.C1749280vcc;
import X.C1893080zMY;
import X.C452070Ho5;
import X.C452501pT;
import X.C724750Sbp;
import X.C736950SvV;
import X.C786410Ut5;
import X.InterfaceC1891350zJl;
import X.InterfaceC665370Q7z;
import X.InterfaceC713360RyY;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.ViewModelStoreOwner;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.inbox.bulletin.comment.vm.BulletinCommentListViewModel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS195S0000000_9;
import kotlin.jvm.internal.AFwS240S0000000_9;
import kotlin.jvm.internal.AwS553S0100000_9;
import kotlin.jvm.internal.AwS588S0100000_9;

/* JADX INFO: loaded from: classes10.dex */
public final class BulletinCommentStatusFooterCell extends PowerCell<C0OYI> implements InterfaceC713360RyY {
    public final C736950SvV LL = new C736950SvV(C13LE.LIZ(BulletinCommentListViewModel.class), null, new C452070Ho5(), C724750Sbp.LJII(this), C1220000hqw.LIZ(this), AFwS240S0000000_9.get$arr$(295), null, null, null);
    public final C01GW LLILLJJLI = C452501pT.LIZIZ(AFwS195S0000000_9.get$arr$(141));
    public final C01GW LLILLL = C452501pT.LIZIZ(new AwS553S0100000_9(this, 506));

    @Override // X.InterfaceC713360RyY
    public final ViewModelStoreOwner LLIIIILZ() {
        return (ViewModelStoreOwner) this.LLILLL.getValue();
    }

    @Override // X.InterfaceC713360RyY
    public final InterfaceC665370Q7z k0() {
        return C1196320hEk.LIZ(this);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl) {
        C1749280vcc c1749280vcc;
        C0OYI c0oyi = (C0OYI) interfaceC1891350zJl;
        View view = this.itemView;
        if ((view instanceof C1749280vcc) && (c1749280vcc = (C1749280vcc) view) != null) {
            C786410Ut5.l9(c1749280vcc, new View.OnClickListener() { // from class: X.0OYV
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                }
            });
            int i = C0OY6.LIZ[c0oyi.LL.ordinal()];
            if (i != 1) {
                if (i != 2 && i != 3) {
                    if (i != 4) {
                        if (i == 5) {
                            C1722300uv6 c1722300uv6 = new C1722300uv6();
                            C1893080zMY.LIZ(c1722300uv6, new AwS553S0100000_9(this, 1809));
                            c1749280vcc.setStatus(c1722300uv6);
                            TuxTextView tuxTextView = (TuxTextView) c1749280vcc.findViewById(R.id.message_tv);
                            if (tuxTextView != null) {
                                tuxTextView.setTuxFont(51);
                                tuxTextView.setTextColorRes(R.attr.a1j);
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    C1722300uv6 c1722300uv62 = new C1722300uv6();
                    C0HTI c0hti = new C0HTI();
                    c0hti.LIZ = R.drawable.n4;
                    Drawable drawableLIZ = c0hti.LIZ(c1749280vcc.getContext());
                    c1722300uv62.LIZJ = 2;
                    c1722300uv62.LIZ = drawableLIZ;
                    c1722300uv62.LJIIIIZZ = this.itemView.getContext().getString(2131827931);
                    c1722300uv62.LJIIIZ = new AwS588S0100000_9(this, 621);
                    c1749280vcc.setStatus(c1722300uv62);
                    TuxTextView tuxTextView2 = (TuxTextView) c1749280vcc.findViewById(R.id.message_tv);
                    if (tuxTextView2 == null) {
                        return;
                    }
                    tuxTextView2.setTuxFont(31);
                    tuxTextView2.setTextColorRes(R.attr.a1k);
                    return;
                }
                C1722300uv6 c1722300uv63 = new C1722300uv6();
                c1722300uv63.LJIIIIZZ = this.itemView.getContext().getString(2131827929);
                c1749280vcc.setStatus(c1722300uv63);
                TuxTextView tuxTextView3 = (TuxTextView) c1749280vcc.findViewById(R.id.message_tv);
                if (tuxTextView3 == null) {
                    return;
                }
                tuxTextView3.setTuxFont(51);
                tuxTextView3.setTextColorRes(R.attr.a1j);
                return;
            }
            c1749280vcc.LJ();
        }
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        C1749280vcc c1749280vcc = new C1749280vcc(viewGroup.getContext(), null, 6);
        C786410Ut5.U6(c1749280vcc, new ViewGroup.LayoutParams(-1, -1));
        return c1749280vcc;
    }
}
