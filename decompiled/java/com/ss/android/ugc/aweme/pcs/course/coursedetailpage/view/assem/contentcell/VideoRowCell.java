package com.ss.android.ugc.aweme.pcs.course.coursedetailpage.view.assem.contentcell;

import X.C0JO6;
import X.C1324610kZf;
import X.C13LP;
import X.C1697580uHE;
import X.C1819620xS4;
import X.C1837000xu6;
import X.C1885807a4;
import X.C384050F3z;
import X.C418440Gaw;
import X.C426750GoL;
import X.C500260Jjc;
import X.C786410Ut5;
import X.C814420VxA;
import X.InterfaceC1142670fqD;
import X.InterfaceC1891350zJl;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.fly_main_color.FlyMainColor;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import irm.AkS94S0100000_27;

/* JADX INFO: loaded from: classes28.dex */
public final class VideoRowCell extends PowerCell<C1885807a4> {
    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl) {
        C1885807a4 c1885807a4 = (C1885807a4) interfaceC1891350zJl;
        super.onBindItemView(c1885807a4);
        if (c1885807a4.LLILLJJLI) {
            View view = this.itemView;
            C384050F3z c384050F3z = new C384050F3z();
            c384050F3z.LJIIJ = Float.valueOf(C418440Gaw.LIZIZ(22));
            c384050F3z.LJIIJJI = Float.valueOf(C418440Gaw.LIZIZ(22));
            c384050F3z.LIZIZ = Integer.valueOf(R.attr.exx);
            view.setBackground(c384050F3z.LIZ(this.itemView.getContext()));
            C426750GoL.LJIIIZ(this.itemView, 0, 0, 0, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(10))), false, 16);
            C426750GoL.LJIIL(this.itemView, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16))), 0, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(18))), 16);
        }
        I5(this.itemView.findViewById(R.id.video_item_1), (C1837000xu6) C13LP.LJJJLZIJ(0, c1885807a4.LL));
        I5(this.itemView.findViewById(R.id.video_item_2), (C1837000xu6) C13LP.LJJJLZIJ(1, c1885807a4.LL));
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        return C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.dc9, viewGroup, false);
    }

    public static void I5(final View view, C1837000xu6 c1837000xu6) {
        if (view == null) {
            return;
        }
        if (c1837000xu6 == null) {
            C500260Jjc.LJIILLIIL(view);
            return;
        }
        final TuxIconView tuxIconView = (TuxIconView) view.findViewById(R.id.video_cover);
        TuxTextView tuxTextView = (TuxTextView) view.findViewById(R.id.video_title);
        TuxTextView tuxTextView2 = (TuxTextView) view.findViewById(R.id.video_stats);
        final View viewFindViewById = view.findViewById(R.id.j4f);
        final View viewFindViewById2 = view.findViewById(R.id.voq);
        Typeface typefaceLIZIZ = C1697580uHE.LIZIZ(0.0f, 600, 0.0f, 0.0f, null, 0.0f, 0, null, 253);
        if (typefaceLIZIZ != null) {
            if (tuxTextView != null) {
                tuxTextView.setTypeface(typefaceLIZIZ);
            }
            if (tuxTextView != null) {
                tuxTextView.setTextSize(13.0f);
            }
            if (tuxTextView2 != null) {
                tuxTextView2.setTypeface(typefaceLIZIZ);
                tuxTextView2.setTextSize(13.0f);
            }
        }
        if (viewFindViewById2 != null) {
            C384050F3z c384050F3z = new C384050F3z();
            c384050F3z.LJIIJ = Float.valueOf(C418440Gaw.LIZIZ(20));
            c384050F3z.LJIIJJI = Float.valueOf(C418440Gaw.LIZIZ(20));
            viewFindViewById2.setBackground(c384050F3z.LIZ(view.getContext()));
        }
        C1324610kZf url = C1819620xS4.LIZ().setUrl(c1837000xu6.LLILLJJLI);
        url.LJIIL = new InterfaceC1142670fqD() { // from class: X.0xvk
            @Override // X.InterfaceC1142670fqD
            public final void LIZ() {
            }

            @Override // X.InterfaceC1142670fqD
            public final void LIZIZ(Animatable animatable) {
            }

            @Override // X.InterfaceC1142670fqD
            public final void LIZLLL(String str, Exception exc) {
            }

            @Override // X.InterfaceC1142670fqD
            public final void LIZJ(final int i, final int i2, String str) {
                final TuxIconView tuxIconView2 = tuxIconView;
                if (tuxIconView2 != null) {
                    final View view2 = view;
                    final View view3 = viewFindViewById;
                    final View view4 = viewFindViewById2;
                    ViewTreeObserverOnPreDrawListenerC337150DJp.LIZ(tuxIconView2, new Runnable() { // from class: X.0Gyn
                        public final void LIZ() {
                            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888);
                            tuxIconView2.draw(new Canvas(bitmapCreateBitmap));
                            Integer numLIZIZ = FlyMainColor.LIZ.LIZ(new C2439109h7(bitmapCreateBitmap, new Rect(0, 0, bitmapCreateBitmap.getWidth(), bitmapCreateBitmap.getHeight()))).LIZIZ();
                            if (numLIZIZ != null) {
                                int iIntValue = numLIZIZ.intValue();
                                GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.BOTTOM_TOP, new int[]{iIntValue, 0});
                                View view5 = view3;
                                if (view5 != null) {
                                    view5.setBackground(gradientDrawable);
                                }
                                C384050F3z c384050F3z2 = new C384050F3z();
                                c384050F3z2.LJIIJ = Float.valueOf(C418440Gaw.LIZIZ(20));
                                c384050F3z2.LJIIJJI = Float.valueOf(C418440Gaw.LIZIZ(20));
                                c384050F3z2.LIZ = Integer.valueOf(iIntValue);
                                Drawable drawableLIZ = c384050F3z2.LIZ(view2.getContext());
                                View view6 = view4;
                                if (view6 != null) {
                                    view6.setBackground(drawableLIZ);
                                }
                            }
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            boolean zLIZ;
                            C1C7U.LIZ("VideoRowCell@1f90.bindVideo$3$onLoadSuccess$$inlined$doOnPreDraw$1");
                            try {
                                LIZ();
                            } finally {
                                if (!zLIZ) {
                                }
                            }
                            C1C7U.LIZIZ("VideoRowCell@1f90.bindVideo$3$onLoadSuccess$$inlined$doOnPreDraw$1");
                        }
                    });
                }
            }
        };
        url.LJIJI(Float.valueOf(C418440Gaw.LIZIZ(20)));
        url.LJJI(tuxIconView);
        C786410Ut5.I7(new AkS94S0100000_27(c1837000xu6, 14), view);
        if (tuxTextView != null) {
            tuxTextView.setText(c1837000xu6.LLILLL);
        }
        if (tuxTextView2 != null) {
            tuxTextView2.setText(C0JO6.LIZIZ(c1837000xu6.LLILZ));
        }
    }
}
