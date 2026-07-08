package com.ss.android.ugc.aweme.tako.multipletemplate.album;

import X.C01GW;
import X.C1163730gOB;
import X.C1322110kVd;
import X.C1324750kZt;
import X.C1331100kk8;
import X.C13LP;
import X.C23031090r;
import X.C2471909mP;
import X.C384050F3z;
import X.C418440Gaw;
import X.C423410Gix;
import X.C452501pT;
import X.C786410Ut5;
import X.InterfaceC1891350zJl;
import X.InterfaceC420801kM;
import android.graphics.Bitmap;
import android.util.Size;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.ies.powerlist.PowerCell;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.zhiliaoapp.musically.R;
import irm.AkS87S0100000_18;
import kotlin.jvm.internal.AFwS216S0000000_27;
import kotlin.jvm.internal.AwS571S0100000_27;
import kotlin.jvm.internal.AwS606S0100000_27;

/* JADX INFO: loaded from: classes28.dex */
public final class TakoAlbumCell extends PowerCell<C1163730gOB> {
    public InterfaceC420801kM LL;
    public final C01GW LLILLJJLI = C452501pT.LIZIZ(AFwS216S0000000_27.get$arr$(184));
    public final C01GW LLILLL = C452501pT.LIZIZ(new AwS571S0100000_27(this, 839));
    public final C01GW LLILZ = C452501pT.LIZIZ(new AwS571S0100000_27(this, 841));
    public final C01GW LLILZIL = C452501pT.LIZIZ(new AwS571S0100000_27(this, 840));

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final int getLayoutId() {
        return R.layout.fnv;
    }

    public final C1322110kVd I5() {
        return (C1322110kVd) this.LLILLL.getValue();
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl) {
        int i;
        C1163730gOB c1163730gOB = (C1163730gOB) interfaceC1891350zJl;
        super.onBindItemView(c1163730gOB);
        I5().getHierarchy().LJJIII(C1331100kk8.LIZLLL(C418440Gaw.LIZIZ(10)));
        C1322110kVd c1322110kVdI5 = I5();
        C384050F3z c384050F3z = new C384050F3z();
        c384050F3z.LIZIZ = Integer.valueOf(R.attr.br);
        c384050F3z.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(10));
        c1322110kVdI5.setBackground(c384050F3z.LIZ(this.itemView.getContext()));
        ((TextView) this.LLILZ.getValue()).setText(c1163730gOB.LL);
        ((TextView) this.LLILZIL.getValue()).setText(String.valueOf(c1163730gOB.LLILLJJLI.size()));
        MediaModel mediaModel = (MediaModel) C13LP.LJJJLIIL(c1163730gOB.LLILLJJLI);
        if (mediaModel != null) {
            if (I5().getLayoutParams().width > 0) {
                i = I5().getLayoutParams().width;
            } else {
                i = -1;
            }
            C1324750kZt.LJIIJ(I5(), C2471909mP.LJIILIIL(mediaModel.LJFF()).toString(), i, i, Bitmap.Config.ARGB_4444);
        }
        I5().setScaleType(ImageView.ScaleType.CENTER_CROP);
        MediaModel mediaModel2 = (MediaModel) C13LP.LJJJLIIL(c1163730gOB.LLILLJJLI);
        if (mediaModel2 != null) {
            C01GW c01gw = C23031090r.LIZ;
            this.LL = C23031090r.LIZIZ(I5(), mediaModel2, (Size) this.LLILLJJLI.getValue(), new AwS606S0100000_27(this, 577));
        }
        I5().getHierarchy().LJJIII(C1331100kk8.LIZLLL(C418440Gaw.LIZIZ(10)));
        I5().setOutlineProvider(new C423410Gix(Float.valueOf(C418440Gaw.LIZIZ(10))));
        I5().setClipToOutline(true);
        C786410Ut5.I7(new AkS87S0100000_18(c1163730gOB, 69), this.itemView);
    }
}
