package com.ss.android.ugc.aweme.tako.botpage.bottombox.photo.guide;

import X.C0H00;
import X.C0HU8;
import X.C0VSJ;
import X.C1308910kAL;
import X.C1331070kk5;
import X.C1331100kk8;
import X.C1331660kl2;
import X.C1331670kl3;
import X.C14J2;
import X.C15438062q;
import X.C1857690yRT;
import X.C1889607ag;
import X.C418440Gaw;
import X.C426750GoL;
import X.C427660Gpo;
import X.C433000GyQ;
import X.C433010GyR;
import X.C435790H6z;
import X.C786410Ut5;
import X.C814420VxA;
import X.InterfaceC1891350zJl;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.lighten.loader.SmartImageView;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public final class TakoPhotoUploadGuideItemCell extends PowerCell<C0H00> {
    public C427660Gpo LL;
    public SmartImageView LLILLJJLI;
    public SmartImageView LLILLL;
    public C14J2 LLILZ;

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onItemViewCreated() {
        Integer numLIZJ;
        C1331100kk8 c1331100kk8;
        super.onItemViewCreated();
        this.LL = (C427660Gpo) this.itemView.findViewById(R.id.jbh);
        SmartImageView smartImageView = (SmartImageView) this.itemView.findViewById(R.id.jco);
        C1331070kk5 hierarchy = smartImageView.getHierarchy();
        if (hierarchy != null) {
            if (C426750GoL.LJ(this.itemView)) {
                c1331100kk8 = new C1331100kk8();
                c1331100kk8.LJI(C418440Gaw.LIZIZ(5), C418440Gaw.LIZIZ(16), C418440Gaw.LIZIZ(16), C418440Gaw.LIZIZ(5));
            } else {
                c1331100kk8 = new C1331100kk8();
                c1331100kk8.LJI(C418440Gaw.LIZIZ(16), C418440Gaw.LIZIZ(5), C418440Gaw.LIZIZ(5), C418440Gaw.LIZIZ(16));
            }
            hierarchy.LJJIII(c1331100kk8);
        }
        this.LLILLJJLI = smartImageView;
        this.LLILLL = (SmartImageView) this.itemView.findViewById(R.id.jbg);
        C14J2 c14j2 = (C14J2) this.itemView.findViewById(R.id.jbo);
        this.LLILZ = c14j2;
        if (c14j2 != null) {
            c14j2.setHasLeftTail(true);
        }
        Context context = getContext();
        if (context == null || (numLIZJ = C1308910kAL.LIZJ(R.attr.zq, context)) == null) {
            return;
        }
        int iIntValue = numLIZJ.intValue();
        C14J2 c14j22 = this.LLILZ;
        if (c14j22 != null) {
            c14j22.setBackgroundDrawColor(iIntValue);
        }
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl) {
        int i;
        Integer numValueOf;
        String str;
        String str2;
        C0H00 c0h00 = (C0H00) interfaceC1891350zJl;
        super.onBindItemView(c0h00);
        C427660Gpo c427660Gpo = this.LL;
        if (c427660Gpo != null && (str2 = c0h00.LLILLL) != null) {
            C427660Gpo.LJIIJJI(c427660Gpo, new C0VSJ(str2), false, null, null, false, false, null, null, false, null, 1022);
        }
        SmartImageView smartImageView = this.LLILLJJLI;
        if (smartImageView != null && (str = c0h00.LL) != null) {
            C1331670kl3 c1331670kl3LJII = C1331660kl2.LJII(new C0VSJ(str));
            c1331670kl3LJII.LIZLLL("UploadGuideItemCell");
            int width = smartImageView.getWidth();
            int height = smartImageView.getHeight();
            c1331670kl3LJII.LJIIIIZZ = width;
            c1331670kl3LJII.LJIIIZ = height;
            c1331670kl3LJII.LJJ(smartImageView);
            C786410Ut5.h3(c1331670kl3LJII);
        }
        SmartImageView smartImageView2 = this.LLILLL;
        if (smartImageView2 != null) {
            C1857690yRT.LJII(smartImageView2, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(32)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(32)), false);
        }
        C14J2 c14j2 = this.LLILZ;
        if (c14j2 != null) {
            C0HU8 c0hu8 = new C0HU8(c14j2, null);
            C435790H6z c435790H6z = C435790H6z.LL;
            List<C433010GyR> listLIZIZ = C433000GyQ.LIZIZ(c0h00.LLILZ);
            ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(listLIZIZ, 10));
            int i2 = 0;
            for (C433010GyR c433010GyR : listLIZIZ) {
                String str3 = c433010GyR.LIZ;
                boolean z = c433010GyR.LIZIZ;
                if (z) {
                    i = i2 + 1;
                    numValueOf = Integer.valueOf(i2);
                } else {
                    i = i2;
                    numValueOf = null;
                }
                arrayList.add(new C1889607ag(numValueOf, str3, z));
                i2 = i;
            }
            C1857690yRT.LIZIZ(c14j2, arrayList.size(), c435790H6z);
            c0hu8.LIZIZ(c14j2, arrayList, c0hu8.LIZIZ, false);
        }
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        return C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.fnc, viewGroup, false);
    }
}
