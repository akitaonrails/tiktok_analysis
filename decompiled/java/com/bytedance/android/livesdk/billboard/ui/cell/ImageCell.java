package com.bytedance.android.livesdk.billboard.ui.cell;

import X.C01GW;
import X.C0JBN;
import X.C1119500fEq;
import X.C1324610kZf;
import X.C1819620xS4;
import X.C439101nJ;
import X.C452501pT;
import X.C786410Ut5;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.android.live.base.model.ImageModel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS561S0100000_17;

/* JADX INFO: loaded from: classes18.dex */
public final class ImageCell extends BillboardPowerCell<C1119500fEq> {
    public final C01GW LL = C452501pT.LIZIZ(new AwS561S0100000_17(this, 105));

    @Override // com.bytedance.android.livesdk.billboard.ui.cell.BillboardPowerCell, com.bytedance.ies.powerlist.PowerCell
    /* JADX INFO: renamed from: R5, reason: merged with bridge method [inline-methods] */
    public final void onBindItemView(C1119500fEq c1119500fEq) {
        super.onBindItemView(c1119500fEq);
        ImageModel imageModel = c1119500fEq.LL.image;
        if (imageModel != null) {
            ViewGroup.LayoutParams layoutParams = ((View) this.LL.getValue()).getLayoutParams();
            int i = imageModel.width;
            int i2 = 56;
            if (i == 0) {
                i = 56;
            }
            layoutParams.width = C439101nJ.LIZ(i);
            int i3 = imageModel.height;
            if (i3 != 0) {
                i2 = i3;
            }
            layoutParams.height = C439101nJ.LIZ(i2);
            C0JBN c0jbnLIZ = C1819620xS4.LIZ();
            BillboardPowerCell.I5(c0jbnLIZ, c1119500fEq.LL.imageStyle);
            C1324610kZf c1324610kZfLJIJJ = c0jbnLIZ.LJIJJ(R.drawable.ek3);
            c1324610kZfLJIJJ.LJIIIZ(imageModel);
            c1324610kZfLJIJJ.LJJI((View) this.LL.getValue());
        }
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        return C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.fzz, viewGroup, false);
    }
}
