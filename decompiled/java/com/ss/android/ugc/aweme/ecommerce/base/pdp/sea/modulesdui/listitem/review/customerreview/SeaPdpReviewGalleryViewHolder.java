package com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.modulesdui.listitem.review.customerreview;

import X.C01GW;
import X.C04IU;
import X.C04IY;
import X.C1308910kAL;
import X.C13LE;
import X.C1697810uHb;
import X.C1755600vmo;
import X.C19719912Dl;
import X.C2097908Jt;
import X.C384050F3z;
import X.C418440Gaw;
import X.C419910GdJ;
import X.C426750GoL;
import X.C452501pT;
import X.C786410Ut5;
import X.C814420VxA;
import X.C958103op;
import android.content.Context;
import android.graphics.drawable.LayerDrawable;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.tux.drawable.TuxIconDrawable;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.basicui.listitem.common.AbsFullSpanVH;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.vm.SeaPdpViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.review.repo.dto.GalleryReview;
import com.ss.android.ugc.aweme.ecommerce.base.review.repo.dto.ReviewImageItem;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.AwS270S0300000_26;
import kotlin.jvm.internal.AwS367S0200000_1;

/* JADX INFO: loaded from: classes2.dex */
public final class SeaPdpReviewGalleryViewHolder extends AbsFullSpanVH<C04IU> {
    public static final int LLJJJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16));
    public static final int LLJJJIL = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(6));
    public final C01GW LLJJIJIL;

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.basicui.listitem.common.AbsFullSpanVH, com.ss.android.ugc.aweme.ecommercebase.view.ECJediViewHolder, com.bytedance.jedi.ext.adapter.JediSimpleViewHolder, com.bytedance.jedi.ext.adapter.JediViewHolder, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public SeaPdpReviewGalleryViewHolder(ViewGroup viewGroup) {
        C1755600vmo c1755600vmo = C1755600vmo.LIZ;
        Context context = viewGroup.getContext();
        c1755600vmo.getClass();
        super(C1755600vmo.LIZ(R.layout.ax0, context, viewGroup, false, false));
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(SeaPdpViewModel.class);
        this.LLJJIJIL = C452501pT.LIZIZ(new AwS270S0300000_26(this, c19719912DlLIZ, c19719912DlLIZ, 69));
    }

    @Override // com.bytedance.jedi.ext.adapter.JediSimpleViewHolder
    public final void rr(Object obj) {
        int size;
        List<ReviewImageItem> list;
        int size2;
        List<ReviewImageItem> list2;
        C04IU c04iu = (C04IU) obj;
        ((SeaPdpViewModel) this.LLJJIJIL.getValue()).XR2().LIZIZ(C2097908Jt.LIZJ(new Pair("if_review_show", "1")));
        ViewGroup viewGroup = (ViewGroup) this.itemView.findViewById(R.id.q7q);
        int iLIZLLL = ((C958103op.LIZLLL() - (LLJJJ * 2)) - (LLJJJIL * 3)) / 4;
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a0o, this.itemView.getContext());
        C419910GdJ c419910GdJ = new C419910GdJ();
        c419910GdJ.LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12));
        c419910GdJ.LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12));
        c419910GdJ.LIZ = R.raw.icon_play_fill;
        c419910GdJ.LIZLLL = numLIZJ;
        c419910GdJ.LJ = Integer.valueOf(R.attr.a0o);
        TuxIconDrawable tuxIconDrawableLIZ = c419910GdJ.LIZ(this.itemView.getContext());
        C384050F3z c384050F3z = new C384050F3z();
        c384050F3z.LJII = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(20));
        c384050F3z.LJI = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(20));
        c384050F3z.LIZIZ = Integer.valueOf(R.attr.zb);
        c384050F3z.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(200));
        LayerDrawable layerDrawableLJIILIIL = C426750GoL.LJIILIIL(tuxIconDrawableLIZ, c384050F3z.LIZ(this.itemView.getContext()));
        GalleryReview galleryReview = c04iu.LL;
        int i = 0;
        if (galleryReview != null && (list2 = galleryReview.mediaReviewItems) != null) {
            size = list2.size();
        } else {
            size = 0;
        }
        if (galleryReview != null) {
            list = galleryReview.mediaReviewItems;
        } else {
            list = null;
        }
        AwS367S0200000_1 awS367S0200000_1 = new AwS367S0200000_1(this, viewGroup, 248);
        C04IY c04iy = new C04IY(galleryReview, this, iLIZLLL, layerDrawableLJIILIIL, size, c04iu);
        if (list != null) {
            size2 = list.size();
        } else {
            size2 = 0;
        }
        if (viewGroup.getChildCount() > size2) {
            C786410Ut5.LJJZ(size2, viewGroup.getChildCount() - size2, viewGroup);
        }
        if (list != null) {
            for (ReviewImageItem reviewImageItem : list) {
                int i2 = i + 1;
                if (i >= 0) {
                    if (i < viewGroup.getChildCount()) {
                        c04iy.invoke(viewGroup.getChildAt(i), Integer.valueOf(i), reviewImageItem);
                    } else {
                        View view = (View) awS367S0200000_1.invoke(viewGroup);
                        viewGroup.addView(view);
                        c04iy.invoke(view, Integer.valueOf(i), reviewImageItem);
                    }
                    i = i2;
                } else {
                    C1697810uHb.LJIJI();
                    throw null;
                }
            }
        }
    }
}
