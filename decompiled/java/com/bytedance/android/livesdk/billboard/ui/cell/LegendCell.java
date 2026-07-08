package com.bytedance.android.livesdk.billboard.ui.cell;

import X.C01GW;
import X.C1119510fEr;
import X.C1324610kZf;
import X.C1819620xS4;
import X.C439101nJ;
import X.C452501pT;
import X.C500260Jjc;
import X.C786410Ut5;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.bytedance.android.live.base.model.ImageModel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS561S0100000_17;

/* JADX INFO: loaded from: classes18.dex */
public final class LegendCell extends BillboardPowerCell<C1119510fEr> {
    public final C01GW LL = C452501pT.LIZIZ(new AwS561S0100000_17(this, 106));
    public final C01GW LLILLJJLI = C452501pT.LIZIZ(new AwS561S0100000_17(this, 107));

    @Override // com.bytedance.android.livesdk.billboard.ui.cell.BillboardPowerCell, com.bytedance.ies.powerlist.PowerCell
    /* JADX INFO: renamed from: R5, reason: merged with bridge method [inline-methods] */
    public final void onBindItemView(C1119510fEr c1119510fEr) {
        super.onBindItemView(c1119510fEr);
        ImageModel imageModel = c1119510fEr.LL.image;
        if (imageModel != null) {
            C500260Jjc.LLFFF((View) this.LL.getValue());
            ViewGroup.LayoutParams layoutParams = ((View) this.LL.getValue()).getLayoutParams();
            layoutParams.width = C439101nJ.LIZ(imageModel.width);
            layoutParams.height = C439101nJ.LIZ(imageModel.height);
            C1324610kZf c1324610kZfLJIIIZ = C1819620xS4.LIZ().LJIIIZ(imageModel);
            BillboardPowerCell.I5(c1324610kZfLJIIIZ, c1119510fEr.LL.imageStyle);
            c1324610kZfLJIIIZ.LJJI((View) this.LL.getValue());
        } else {
            C500260Jjc.LJIILIIL((View) this.LL.getValue());
        }
        ((TextView) this.LLILLJJLI.getValue()).setText(c1119510fEr.LL.text);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        return C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.g00, viewGroup, false);
    }
}
