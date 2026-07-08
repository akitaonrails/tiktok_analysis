package com.ss.android.ugc.aweme.poi.detail.ymal.vertical;

import X.C1173300gdc;
import X.C1173350gdh;
import X.C1174830gg5;
import X.C1179130gn1;
import X.C1181430gqj;
import X.C1185600gxS;
import X.C1189060h32;
import X.C2211631BhB;
import X.C786410Ut5;
import X.InterfaceC1181010gq3;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.localservice.experiment.SlashComponentUIPreloadExp;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS597S0100000_18;

/* JADX INFO: loaded from: classes19.dex */
public final class VerticalYmalCell extends PowerCell<C1173350gdh> {
    public View LL;
    public SmartImageView LLILLJJLI;
    public C1179130gn1 LLILLL;
    public TuxTextView LLILZ;
    public View LLILZIL;
    public C1185600gxS LLILZLL;
    public C1173350gdh LLIZ;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onItemViewCreated() {
        InterfaceC1181010gq3 interfaceC1181010gq3LIZ;
        C1173300gdc c1173300gdcQr0;
        super.onItemViewCreated();
        this.LL = this.itemView.findViewById(R.id.msz);
        this.LLILLJJLI = (SmartImageView) this.itemView.findViewById(R.id.f58);
        this.LLILLL = (C1179130gn1) this.itemView.findViewById(R.id.df4);
        this.LLILZ = (TuxTextView) this.itemView.findViewById(R.id.fyj);
        this.LLILZIL = this.itemView.findViewById(R.id.eux);
        View view = this.LL;
        if (view != null) {
            C1189060h32.LJJIIJ(view, new AwS597S0100000_18(this, 381));
        }
        Fragment fragmentLJIIJ = C1189060h32.LJIIJ(getParent());
        this.LLILZLL = (fragmentLJIIJ == null || (interfaceC1181010gq3LIZ = C1174830gg5.LIZ(fragmentLJIIJ)) == null || (c1173300gdcQr0 = interfaceC1181010gq3LIZ.qr0()) == null) ? null : (C1185600gxS) c1173300gdcQr0.LIZ;
        C2211631BhB.LJ(this.itemView, new AwS597S0100000_18(this, 382));
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        if (SlashComponentUIPreloadExp.LIZ("poi_vertical_limited_ymal")) {
            return C1181430gqj.LIZIZ(viewGroup.getContext(), R.layout.e10, viewGroup, false);
        }
        return C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.e10, viewGroup, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:90:0x0278 A[Catch: Exception -> 0x02e2, TryCatch #0 {Exception -> 0x02e2, blocks: (B:49:0x01af, B:51:0x01b3, B:54:0x01b8, B:55:0x01bb, B:57:0x01bf, B:59:0x01c3, B:61:0x01c7, B:62:0x01ce, B:64:0x01d9, B:65:0x01dd, B:67:0x01f1, B:69:0x01f9, B:70:0x01fd, B:77:0x020e, B:79:0x0212, B:93:0x0297, B:95:0x029b, B:96:0x02bd, B:97:0x02cc, B:99:0x02da, B:100:0x02de, B:90:0x0278, B:92:0x027c, B:80:0x022e, B:82:0x0236, B:84:0x023a, B:85:0x023f, B:87:0x0243, B:88:0x0258, B:89:0x0268), top: B:114:0x01af }] */
    /* JADX WARN: Removed duplicated region for block: B:92:0x027c A[Catch: Exception -> 0x02e2, TryCatch #0 {Exception -> 0x02e2, blocks: (B:49:0x01af, B:51:0x01b3, B:54:0x01b8, B:55:0x01bb, B:57:0x01bf, B:59:0x01c3, B:61:0x01c7, B:62:0x01ce, B:64:0x01d9, B:65:0x01dd, B:67:0x01f1, B:69:0x01f9, B:70:0x01fd, B:77:0x020e, B:79:0x0212, B:93:0x0297, B:95:0x029b, B:96:0x02bd, B:97:0x02cc, B:99:0x02da, B:100:0x02de, B:90:0x0278, B:92:0x027c, B:80:0x022e, B:82:0x0236, B:84:0x023a, B:85:0x023f, B:87:0x0243, B:88:0x0258, B:89:0x0268), top: B:114:0x01af }] */
    /* JADX WARN: Removed duplicated region for block: B:95:0x029b A[Catch: Exception -> 0x02e2, TryCatch #0 {Exception -> 0x02e2, blocks: (B:49:0x01af, B:51:0x01b3, B:54:0x01b8, B:55:0x01bb, B:57:0x01bf, B:59:0x01c3, B:61:0x01c7, B:62:0x01ce, B:64:0x01d9, B:65:0x01dd, B:67:0x01f1, B:69:0x01f9, B:70:0x01fd, B:77:0x020e, B:79:0x0212, B:93:0x0297, B:95:0x029b, B:96:0x02bd, B:97:0x02cc, B:99:0x02da, B:100:0x02de, B:90:0x0278, B:92:0x027c, B:80:0x022e, B:82:0x0236, B:84:0x023a, B:85:0x023f, B:87:0x0243, B:88:0x0258, B:89:0x0268), top: B:114:0x01af }] */
    @Override // com.bytedance.ies.powerlist.PowerCell
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onBindItemView(X.InterfaceC1891350zJl r23, java.util.List r24) {
        /*
            Method dump skipped, instruction units count: 774
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.poi.detail.ymal.vertical.VerticalYmalCell.onBindItemView(X.0zJl, java.util.List):void");
    }
}
