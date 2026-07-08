package com.ss.android.ugc.aweme.music.search.cell;

import X.C1308910kAL;
import X.C426750GoL;
import X.C631230OpN;
import X.C631940OqW;
import android.content.Context;
import android.graphics.Paint;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RectShape;
import android.view.View;
import com.ss.android.ugc.aweme.music.assem.list.cell.v2.DefaultBackgroundAssem;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes10.dex */
public final class SearchMusicCellBackgroundAssem extends DefaultBackgroundAssem {
    @Override // com.ss.android.ugc.aweme.music.assem.list.cell.v2.DefaultBackgroundAssem
    public final void op(C631940OqW c631940OqW) {
        Integer numLIZJ;
        if (c631940OqW.isSimilarMusic()) {
            C631230OpN.LIZJ(getContentView());
            int iIntValue = 0;
            C426750GoL.LJIIIZ(getContentView(), 0, 0, 0, 0, false, 16);
            View view = this.LLJJLIIIJLLLLLLLZ;
            if (view != null) {
                ShapeDrawable shapeDrawable = new ShapeDrawable();
                shapeDrawable.setShape(new RectShape());
                Paint paint = shapeDrawable.getPaint();
                Context context = getContext();
                if (context != null && (numLIZJ = C1308910kAL.LIZJ(R.attr.bw, context)) != null) {
                    iIntValue = numLIZJ.intValue();
                }
                paint.setColor(iIntValue);
                view.setBackground(shapeDrawable);
                return;
            }
            return;
        }
        C631230OpN.LIZ(getContentView());
    }
}
