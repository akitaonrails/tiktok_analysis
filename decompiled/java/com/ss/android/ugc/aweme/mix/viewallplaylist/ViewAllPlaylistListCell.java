package com.ss.android.ugc.aweme.mix.viewallplaylist;

import X.C0KZF;
import X.C1169160gWw;
import X.C1331660kl2;
import X.C1331670kl3;
import X.C1383370m6R;
import X.C13LP;
import X.C384050F3z;
import X.C418440Gaw;
import X.C419910GdJ;
import X.C426750GoL;
import X.C445530HdX;
import X.C445550HdZ;
import X.C786410Ut5;
import X.C814420VxA;
import X.C960203pA;
import X.InterfaceC1891350zJl;
import Y.ACListenerS110S0200000_6;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.drawable.TuxIconDrawable;
import com.bytedance.tux.tag.TuxTag;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.text.u;

/* JADX INFO: loaded from: classes7.dex */
public final class ViewAllPlaylistListCell extends PowerCell<C445550HdZ> {
    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl) {
        int i;
        String str;
        List<String> urlList;
        Integer num;
        Drawable drawableMutate;
        int iIntValue;
        int iIntValue2;
        C445550HdZ c445550HdZ = (C445550HdZ) interfaceC1891350zJl;
        super.onBindItemView(c445550HdZ);
        TextView textView = (TextView) this.itemView.findViewById(R.id.qv2);
        if (textView != null) {
            textView.setText(c445550HdZ.LL);
        }
        TextView textView2 = (TextView) this.itemView.findViewById(R.id.qux);
        int i2 = 0;
        if (textView2 != null) {
            Resources resources = this.itemView.getContext().getResources();
            Integer num2 = c445550HdZ.LLILLL;
            if (num2 != null) {
                iIntValue = num2.intValue();
            } else {
                iIntValue = 0;
            }
            Object[] objArr = new Object[1];
            Integer num3 = c445550HdZ.LLILLL;
            if (num3 != null) {
                iIntValue2 = num3.intValue();
            } else {
                iIntValue2 = 0;
            }
            objArr[0] = Integer.valueOf(iIntValue2);
            textView2.setText(resources.getQuantityString(2131755471, iIntValue, objArr));
        }
        TextView textView3 = (TextView) this.itemView.findViewById(R.id.qut);
        TextView textView4 = (TextView) this.itemView.findViewById(R.id.qur);
        TuxTag tuxTag = (TuxTag) this.itemView.findViewById(R.id.quy);
        tuxTag.setPadding(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(5)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(1)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(5)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(1)));
        if (c445550HdZ.LLJ == 1) {
            i = 0;
        } else {
            i = 8;
        }
        C786410Ut5.LLZLLIL(tuxTag, i);
        Drawable background = tuxTag.getBackground();
        if (background != null && (drawableMutate = background.mutate()) != null) {
            drawableMutate.setAlpha(30);
        }
        tuxTag.setTextColor(C960203pA.LIZ(R.attr.a11, tuxTag.getContext()));
        if (c445550HdZ.LLILZIL != null && (num = c445550HdZ.LLILLL) != null && num.intValue() != 0) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            long jLongValue = c445550HdZ.LLILZIL.longValue();
            long j = LSPassThroughRecordSizeConfig.DEFAULT;
            long j2 = jCurrentTimeMillis - (jLongValue * j);
            long j3 = 60;
            if (j2 <= ((long) C445530HdX.LIZ()) * 1000 * j3 * j3 * ((long) 24)) {
                if (textView3 != null) {
                    String strLJIIJ = C1383370m6R.LJIIJ(2131840538);
                    C0KZF c0kzf = C0KZF.LIZ;
                    Context context = this.itemView.getContext();
                    long jLongValue2 = c445550HdZ.LLILZIL.longValue() * j;
                    c0kzf.getClass();
                    textView3.setText(u.LJJIFFI(strLJIIJ, "{relative_date}", C0KZF.LIZ(context, jLongValue2, j2), false));
                }
                if (textView4 != null) {
                    textView4.setText(" · ");
                }
                C786410Ut5.LLIL(textView3, 0);
                C786410Ut5.LLIL(textView4, 0);
            } else {
                C786410Ut5.LLIL(textView3, 8);
                C786410Ut5.LLIL(textView4, 8);
            }
        } else {
            C786410Ut5.LLIL(textView3, 8);
            C786410Ut5.LLIL(textView4, 8);
        }
        SmartImageView smartImageView = (SmartImageView) this.itemView.findViewById(R.id.qua);
        String str2 = "";
        if (smartImageView != null) {
            C419910GdJ c419910GdJ = new C419910GdJ();
            c419910GdJ.LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(28));
            c419910GdJ.LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(28));
            c419910GdJ.LIZ = R.raw.icon_playlist_fill;
            c419910GdJ.LJ = Integer.valueOf(R.attr.a01);
            TuxIconDrawable tuxIconDrawableLIZ = c419910GdJ.LIZ(this.itemView.getContext());
            C384050F3z c384050F3z = new C384050F3z();
            c384050F3z.LJII = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(80));
            c384050F3z.LJI = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(80));
            c384050F3z.LIZIZ = Integer.valueOf(R.attr.a03);
            c384050F3z.LIZJ = Float.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4)));
            smartImageView.setBackground(C426750GoL.LJIILIIL(tuxIconDrawableLIZ, c384050F3z.LIZ(this.itemView.getContext())));
            UrlModel urlModel = c445550HdZ.LLILLJJLI;
            if (urlModel == null || (urlList = urlModel.getUrlList()) == null || (str = (String) C13LP.LJJJLZIJ(0, urlList)) == null) {
                str = "";
            }
            C1331670kl3 c1331670kl3LJIIIZ = C1331660kl2.LJIIIZ(str);
            c1331670kl3LJIIIZ.LJJ(smartImageView);
            C786410Ut5.h3(c1331670kl3LJIIIZ);
        }
        if (!c445550HdZ.LLJI.LIZ) {
            C1169160gWw c1169160gWw = C1169160gWw.LIZ;
            String str3 = c445550HdZ.LLIZLLLIL;
            String str4 = c445550HdZ.LLILZ;
            if (str4 == null) {
                str4 = "";
            }
            String str5 = c445550HdZ.LLILZLL;
            if (str5 != null) {
                str2 = str5;
            }
            if (c445550HdZ.LLJ == 1) {
                i2 = 1;
            }
            C1169160gWw.LJJ(c1169160gWw, str3, str4, null, str2, null, null, null, null, null, null, Integer.valueOf(i2), 1012);
            c445550HdZ.LLJI.LIZ = true;
        }
        C786410Ut5.I7(new ACListenerS110S0200000_6(this, c445550HdZ, 49), this.itemView);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        return C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.dx5, viewGroup, false);
    }
}
