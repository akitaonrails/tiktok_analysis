package com.ss.android.ugc.aweme.multi.maker;

import X.C1066920ds2;
import X.C1077230e8f;
import X.C1331660kl2;
import X.C1331670kl3;
import X.C1394720mOk;
import X.C1599640rjG;
import X.C2344009Gk;
import X.C418440Gaw;
import X.C419910GdJ;
import X.C438710HIf;
import X.C786410Ut5;
import X.C814420VxA;
import X.EnumC1050190dR3;
import X.EnumC1338240kve;
import X.EnumC1430380nKG;
import X.InterfaceC1331800klG;
import X.InterfaceC1393560mMs;
import android.app.Dialog;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tux.drawable.TuxIconDrawable;
import com.ss.android.ugc.aweme.base.ImageUrlModel;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes17.dex */
public final class FriendsV3MusicTitleAnchorMaker extends CommonAnchorMaker {
    @Override // X.AbstractC1066910ds1
    public final boolean LJIIL() {
        return true;
    }

    @Override // com.ss.android.ugc.aweme.multi.maker.CommonAnchorMaker, X.InterfaceC1393560mMs
    public final InterfaceC1393560mMs clone() {
        return new FriendsV3MusicTitleAnchorMaker();
    }

    @Override // com.ss.android.ugc.aweme.multi.maker.CommonAnchorMaker, X.AbstractC1066890drz, X.InterfaceC1393560mMs
    public final int type() {
        return EnumC1430380nKG.FRIENDS_V3_MUSIC_TITLE_ANCHOR.getTYPE();
    }

    @Override // X.AbstractC1066890drz, X.InterfaceC1393560mMs
    public final void LJJJI(SmartImageView smartImageView) {
        UrlModel icon;
        AnchorCommonStruct anchorCommonStruct = this.LLIZ;
        if (anchorCommonStruct != null) {
            icon = anchorCommonStruct.getIcon();
        } else {
            icon = null;
        }
        ImageUrlModel imageUrlModelLIZ = C438710HIf.LIZ(icon);
        if (imageUrlModelLIZ.isEmpty()) {
            C419910GdJ c419910GdJ = new C419910GdJ();
            c419910GdJ.LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(14));
            c419910GdJ.LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(14));
            c419910GdJ.LIZ = R.raw.icon_music_note_s_alt_fill;
            c419910GdJ.LJ = Integer.valueOf(R.attr.ee);
            c419910GdJ.LJFF = true;
            smartImageView.setImageDrawable(c419910GdJ.LIZ(smartImageView.getContext()));
            return;
        }
        int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(18));
        C1331670kl3 c1331670kl3LJIIIIZZ = C1331660kl2.LJIIIIZZ(imageUrlModelLIZ);
        c1331670kl3LJIIIIZZ.LJIIIIZZ = iLIZIZ;
        c1331670kl3LJIIIIZZ.LJIIIZ = iLIZIZ;
        c1331670kl3LJIIIIZZ.LJJ = EnumC1338240kve.CENTER_CROP;
        final Context context = smartImageView.getContext();
        c1331670kl3LJIIIIZZ.LJJIJIL(new InterfaceC1331800klG(context) { // from class: X.0I7T
            public final Context LIZ;

            @Override // X.InterfaceC1331800klG
            public final String getKey() {
                return "friends_v3_music_cover_no_cutout_transform_v3";
            }

            {
                this.LIZ = context;
            }

            @Override // X.InterfaceC1331800klG
            public final InterfaceC1332090klj LIZIZ(Bitmap bitmap, C0I7N c0i7n) {
                if (bitmap != null) {
                    if (c0i7n == null) {
                        return null;
                    }
                    if (bitmap.getWidth() > 0 && bitmap.getHeight() > 0) {
                        int iLIZIZ2 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(18));
                        int iLIZIZ3 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8));
                        int iLIZIZ4 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(1));
                        C1331870klN c1331870klNLIZ = ((C1331760klC) c0i7n).LIZ(iLIZIZ2, iLIZIZ2, Bitmap.Config.ARGB_8888);
                        Canvas canvas = new Canvas(c1331870klNLIZ.getBitmap());
                        float f = iLIZIZ2;
                        RectF rectF = new RectF(0.0f, 0.0f, f, f);
                        Path path = new Path();
                        path.addRoundRect(rectF, C418440Gaw.LIZIZ(2), C418440Gaw.LIZIZ(2), Path.Direction.CW);
                        Paint paint = new Paint(1);
                        paint.setFilterBitmap(true);
                        canvas.save();
                        canvas.clipPath(path);
                        canvas.drawBitmap(bitmap, (Rect) null, rectF, paint);
                        canvas.restore();
                        int i = (iLIZIZ2 - iLIZIZ3) - iLIZIZ4;
                        C419910GdJ c419910GdJ2 = new C419910GdJ();
                        c419910GdJ2.LIZ = R.raw.icon_music_note_s_alt_fill;
                        c419910GdJ2.LJ = Integer.valueOf(R.attr.ee);
                        c419910GdJ2.LIZIZ = iLIZIZ3;
                        c419910GdJ2.LIZJ = iLIZIZ3;
                        c419910GdJ2.LJFF = true;
                        TuxIconDrawable tuxIconDrawableLIZ = c419910GdJ2.LIZ(this.LIZ);
                        int i2 = iLIZIZ3 + i;
                        tuxIconDrawableLIZ.setBounds(i, i, i2, i2);
                        tuxIconDrawableLIZ.draw(canvas);
                        return c1331870klNLIZ;
                    }
                    return ((C1331760klC) c0i7n).LIZIZ(bitmap);
                }
                if (c0i7n == null) {
                    return null;
                }
                return ((C1331760klC) c0i7n).LIZIZ(bitmap);
            }

            @Override // X.InterfaceC1331800klG
            public final InterfaceC1332090klj LIZ(Bitmap bitmap, C0I7N c0i7n, Map map) {
                return LIZIZ(bitmap, c0i7n);
            }
        });
        c1331670kl3LJIIIIZZ.LJJ(smartImageView);
        C786410Ut5.h3(c1331670kl3LJIIIIZZ);
    }

    @Override // com.ss.android.ugc.aweme.multi.maker.CommonAnchorMaker, X.AbstractC1066890drz, X.InterfaceC1393560mMs
    public final EnumC1050190dR3 LJJJJLL(List<AnchorCommonStruct> list) {
        ArrayList arrayList = new ArrayList();
        for (AnchorCommonStruct anchorCommonStruct : list) {
            if (anchorCommonStruct.getType() == type()) {
                arrayList.add(anchorCommonStruct);
            }
        }
        if (arrayList.size() == 0) {
            return EnumC1050190dR3.NOT_FOUND;
        }
        AnchorCommonStruct anchorCommonStruct2 = (AnchorCommonStruct) ListProtector.get(arrayList, 0);
        list.remove(anchorCommonStruct2);
        LJIILIIL(anchorCommonStruct2);
        this.LLIZ = anchorCommonStruct2;
        if (arrayList.size() == 1) {
            return EnumC1050190dR3.DONE;
        }
        return EnumC1050190dR3.PROCEED;
    }

    @Override // com.ss.android.ugc.aweme.multi.maker.CommonAnchorMaker, X.AbstractC1066910ds1, X.InterfaceC1393560mMs
    public final void LJJJLL(View view, C2344009Gk c2344009Gk) {
        super.LJJJLL(view, c2344009Gk);
        C1599640rjG.LIZIZ.bv(LJIILJJIL(), LJIIZILJ(), LJIJJLI());
    }

    @Override // X.AbstractC1066890drz, X.InterfaceC1393560mMs
    public final View LJJJJIZL(ViewGroup viewGroup, Dialog dialog, C2344009Gk c2344009Gk, int i) {
        AnchorCommonStruct anchorCommonStruct = this.LLIZ;
        if (anchorCommonStruct != null) {
            C1394720mOk c1394720mOkLIZ = C1066920ds2.LIZ(viewGroup.getContext());
            UrlModel thumbnail = anchorCommonStruct.getThumbnail();
            if (thumbnail != null || (thumbnail = anchorCommonStruct.getIcon()) != null) {
                c1394720mOkLIZ.setIcon(thumbnail);
            }
            LJJIIZ(c1394720mOkLIZ);
            c1394720mOkLIZ.setSubTitle(anchorCommonStruct.getDescription());
            C786410Ut5.I7(new C1077230e8f(this, c2344009Gk, dialog, 0), c1394720mOkLIZ);
            viewGroup.addView(c1394720mOkLIZ);
            return c1394720mOkLIZ;
        }
        return null;
    }
}
