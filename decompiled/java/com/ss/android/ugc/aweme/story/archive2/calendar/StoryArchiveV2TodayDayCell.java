package com.ss.android.ugc.aweme.story.archive2.calendar;

import X.C1156980gDI;
import X.C1220000hqw;
import X.C1308910kAL;
import X.C13LE;
import X.C1546210qL5;
import X.C384050F3z;
import X.C452070Ho5;
import X.C724750Sbp;
import X.C736950SvV;
import X.C786410Ut5;
import X.InterfaceC1891350zJl;
import Y.ACListenerS143S0100000_8;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.ies.powerlist.PowerCell;
import com.ss.android.ugc.aweme.story.archive2.StoryArchiveV2ArchiveViewModel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS232S0000000_4;

/* JADX INFO: loaded from: classes5.dex */
public final class StoryArchiveV2TodayDayCell extends PowerCell<C1156980gDI> {
    public final C736950SvV LL = new C736950SvV(C13LE.LIZ(StoryArchiveV2ArchiveViewModel.class), null, new C452070Ho5(), C724750Sbp.LJII(this), C1220000hqw.LIZ(this), AFwS232S0000000_4.get$arr$(74), null, null, null);

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl) {
        int iIntValue;
        int iIntValue2;
        int iIntValue3;
        super.onBindItemView(interfaceC1891350zJl);
        View viewFindViewById = this.itemView.findViewById(R.id.iaw);
        C384050F3z c384050F3z = new C384050F3z();
        C1546210qL5.LIZ.getClass();
        c384050F3z.LIZJ = Float.valueOf(C1546210qL5.LIZ(14));
        Drawable drawableLIZ = c384050F3z.LIZ(this.itemView.getContext());
        GradientDrawable gradientDrawable = (GradientDrawable) drawableLIZ;
        int[] iArr = new int[3];
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.u8, this.itemView.getContext());
        if (numLIZJ != null) {
            iIntValue = numLIZJ.intValue();
        } else {
            iIntValue = 0;
        }
        iArr[0] = iIntValue;
        Integer numLIZJ2 = C1308910kAL.LIZJ(R.attr.u7, this.itemView.getContext());
        if (numLIZJ2 != null) {
            iIntValue2 = numLIZJ2.intValue();
        } else {
            iIntValue2 = 0;
        }
        iArr[1] = iIntValue2;
        Integer numLIZJ3 = C1308910kAL.LIZJ(R.attr.u6, this.itemView.getContext());
        if (numLIZJ3 != null) {
            iIntValue3 = numLIZJ3.intValue();
        } else {
            iIntValue3 = 0;
        }
        iArr[2] = iIntValue3;
        gradientDrawable.setColors(iArr);
        gradientDrawable.setOrientation(GradientDrawable.Orientation.TL_BR);
        gradientDrawable.setGradientType(0);
        viewFindViewById.setBackground(drawableLIZ);
        C786410Ut5.I7(new ACListenerS143S0100000_8(this, 80), this.itemView);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        return PowerCell.inflateItemView$default(this, viewGroup, R.layout.fb8, false, 4, null);
    }
}
