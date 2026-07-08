package com.ss.android.ugc.aweme.ui.feed.commerce;

import X.C01GW;
import X.C098200Yq;
import X.C0SLJ;
import X.C0SM1;
import X.C0SM7;
import X.C0SM8;
import X.C0SMS;
import X.C1558420qem;
import X.C1558520qew;
import X.C1697810uHb;
import X.C189200o6;
import X.C1A5L;
import X.C2271381DvM;
import X.C2271391DvN;
import X.C452501pT;
import X.C497820Jfg;
import X.C719950SLx;
import X.InterfaceC469401sC;
import X.InterfaceC719500SKe;
import X.InterfaceC720380SNo;
import X.ViewOnClickListenerC725830SdZ;
import Y.ATListenerS445S0100000_11;
import android.content.Context;
import android.graphics.Bitmap;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ui.feed.commerce.VSAMultiPhotoViewHolder;
import com.ss.android.ugc.aweme.ui.feed.photos.assem.FeedPhotoSlidesAdapter$createAssemVHContainer$1;
import com.ss.android.ugc.aweme.ui.feed.subphoto.holders.PhotosViewHolderV3;
import com.ss.android.ugc.aweme.videoadaption.adaptionparams.AdaptionPaddingValues;
import com.ss.android.ugc.feed.platform.cell.component.adaption.CellAdaptionComponentAbility;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AwS73S0500000_11;

/* JADX INFO: loaded from: classes12.dex */
public final class VSAMultiPhotoViewHolder extends PhotosViewHolderV3 {
    public final List<Integer> LLJJL;
    public final C01GW LLJJLIIIJLLLLLLLZ;

    @Override // X.InterfaceC719460SKa
    public final View.OnTouchListener Hg() {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.ui.feed.subphoto.holders.PhotosViewHolderV3
    public final InterfaceC469401sC LJIILLIIL(C719950SLx c719950SLx) {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.ui.feed.subphoto.holders.PhotosViewHolderV3
    public final C0SMS LJIJJ() {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.ui.feed.subphoto.holders.PhotosViewHolderV3
    public final boolean LJJI() {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.ui.feed.subphoto.holders.PhotosViewHolderV3
    public final void LJJIIJ(int i) {
    }

    @Override // com.ss.android.ugc.aweme.ui.feed.subphoto.holders.PhotosViewHolderV3
    public final void LJJIIZ(Bitmap bitmap) {
    }

    @Override // com.ss.android.ugc.aweme.ui.feed.subphoto.holders.PhotosViewHolderV3
    public final void LJJIIZI() {
    }

    @Override // com.ss.android.ugc.aweme.ui.feed.subphoto.holders.PhotosViewHolderV3
    public final void LJJIJIL() {
    }

    @Override // X.InterfaceC719460SKa
    public final void LJIILJJIL() {
        for (ViewOnClickListenerC725830SdZ viewOnClickListenerC725830SdZ : (ArrayList) this.LLJJLIIIJLLLLLLLZ.getValue()) {
            if (viewOnClickListenerC725830SdZ != null) {
                viewOnClickListenerC725830SdZ.h0();
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.ui.feed.subphoto.holders.PhotosViewHolderV3
    public final void LJJIJLIJ() {
        super.LJJIJLIJ();
        for (ViewOnClickListenerC725830SdZ viewOnClickListenerC725830SdZ : (ArrayList) this.LLJJLIIIJLLLLLLLZ.getValue()) {
            if (viewOnClickListenerC725830SdZ != null) {
                viewOnClickListenerC725830SdZ.reset();
            }
        }
    }

    public static Object LJJIL(int i, List list) {
        Object c098200Yq;
        if (list != null && i >= 0 && i < list.size()) {
            try {
                c098200Yq = list.get(i);
                C189200o6.m2constructorimpl(c098200Yq);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                c098200Yq = new C098200Yq(th);
                C189200o6.m2constructorimpl(c098200Yq);
            }
            if (!C189200o6.m7isFailureimpl(c098200Yq)) {
                return c098200Yq;
            }
        }
        return null;
    }

    public VSAMultiPhotoViewHolder(View view, InterfaceC720380SNo interfaceC720380SNo, C0SLJ c0slj, C0SM7 c0sm7, ViewGroup viewGroup, InterfaceC719500SKe interfaceC719500SKe, C0SM8 c0sm8, C0SM1 c0sm1, FeedPhotoSlidesAdapter$createAssemVHContainer$1 feedPhotoSlidesAdapter$createAssemVHContainer$1) {
        int iLIZJ;
        AdaptionPaddingValues adaptionPaddingValuesNs0;
        super(view, c0slj, c0sm7, viewGroup, c0sm8, c0sm1, feedPhotoSlidesAdapter$createAssemVHContainer$1);
        CellAdaptionComponentAbility cellAdaptionComponentAbility = (CellAdaptionComponentAbility) C1558520qew.LIZ(C1558420qem.LIZIZ(this), CellAdaptionComponentAbility.class, null);
        if (cellAdaptionComponentAbility == null || (adaptionPaddingValuesNs0 = cellAdaptionComponentAbility.Ns0()) == null || adaptionPaddingValuesNs0.getTop() == 0) {
            int paddingLeft = view.getPaddingLeft();
            Context context = view.getContext();
            if (context != null) {
                iLIZJ = C497820Jfg.LIZJ(context);
            } else {
                iLIZJ = 0;
            }
            view.setPadding(paddingLeft, iLIZJ, view.getPaddingRight(), view.getPaddingBottom());
        }
        view.setOnTouchListener(new ATListenerS445S0100000_11(interfaceC720380SNo, 10));
        C2271391DvN.LIZ(view, (C1A5L) C2271381DvM.j.getValue());
        view.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: X.0Gcs
            public int LL = -1;
            public int LLILLJJLI = -1;

            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view2, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                int i9;
                int i10;
                ViewGroup.MarginLayoutParams marginLayoutParams;
                if (view2 != null && view2.getWidth() != 0 && view2.getHeight() != 0) {
                    if (view2.getWidth() != this.LL || view2.getHeight() != this.LLILLJJLI) {
                        this.LL = view2.getWidth();
                        this.LLILLJJLI = view2.getHeight();
                        VSAMultiPhotoViewHolder vSAMultiPhotoViewHolder = this.LLILLL;
                        int width = view2.getWidth();
                        int height = view2.getHeight() - view2.getPaddingTop();
                        vSAMultiPhotoViewHolder.getClass();
                        int iLIZIZ = (height - C814420VxA.LIZIZ(C418440Gaw.LIZIZ(58))) - C814420VxA.LIZIZ(C418440Gaw.LIZIZ(50));
                        if (width > iLIZIZ) {
                            i9 = iLIZIZ;
                        } else {
                            i9 = width;
                        }
                        if (width < iLIZIZ) {
                            i10 = (iLIZIZ * 43) / 672;
                        } else {
                            i10 = 0;
                        }
                        int iLIZIZ2 = i10 + C814420VxA.LIZIZ(C418440Gaw.LIZIZ(58));
                        View viewFindViewById = vSAMultiPhotoViewHolder.LLILZIL.findViewById(R.id.vsa_multi_product_content_view);
                        if (viewFindViewById != null) {
                            ViewGroup.LayoutParams layoutParams = viewFindViewById.getLayoutParams();
                            if ((layoutParams instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams) != null) {
                                marginLayoutParams.topMargin = iLIZIZ2;
                                marginLayoutParams.width = i9;
                                marginLayoutParams.height = i9;
                                C786410Ut5.W5(viewFindViewById, marginLayoutParams);
                            }
                        }
                    }
                }
            }
        });
        this.LLJJL = C1697810uHb.LJIILJJIL(Integer.valueOf(R.id.yba), Integer.valueOf(R.id.ceg), Integer.valueOf(R.id.yco), Integer.valueOf(R.id.cgd));
        this.LLJJLIIIJLLLLLLLZ = C452501pT.LIZIZ(new AwS73S0500000_11(this, view, c0sm7, interfaceC719500SKe, interfaceC720380SNo, 4));
    }
}
