package com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.calendlymeeting.view;

import X.C0JOW;
import X.C0TVI;
import X.C14K9;
import X.C500980Jkm;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.android.livesdk.comp.api.pcs.data.model.calendlymeeting.PcsCalendlyBookingData;
import com.bytedance.android.livesdk.comp.impl.pcs.business.common.ui.PcsDraggableBottomSheetDialogFragment;
import com.bytedance.android.livesdk.comp.impl.pcs.business.common.ui.TitleDragBottomSheetBehavior;
import com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.calendlymeeting.view.PcsCalendlyBookingFragment;
import com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.calendlymeeting.view.PcsCalendlyDraggleHeightDialog;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes8.dex */
public final class PcsCalendlyDraggleHeightDialog extends PcsDraggableBottomSheetDialogFragment {
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWstJyshJywoZyM6PiA/LSR9KyohOWE6JTUgZz8wO2suPDw6JiA/OmE1JzAiLS4nISoiZzHELIOSw2OjMlKiojJDA/ZywyJCAiLSMqJSApPSY9L2s6ICokZhUvOgwyJCAiLSMqDDctLig/LQ0pICg7PAElKCM8Lw==";
    public PcsCalendlyBookingData LLILLL;
    public int LLILZ;
    public int LLILZIL;
    public PcsCalendlyBookingFragment LLILZLL;

    @Override // com.bytedance.android.livesdk.comp.impl.pcs.business.common.ui.PcsDraggableBottomSheetDialogFragment
    public final PcsCalendlyBookingFragment NR() {
        C0JOW c0jow = PcsCalendlyBookingFragment.LLJ;
        PcsCalendlyBookingData pcsCalendlyBookingData = this.LLILLL;
        c0jow.getClass();
        PcsCalendlyBookingFragment pcsCalendlyBookingFragment = new PcsCalendlyBookingFragment();
        pcsCalendlyBookingFragment.LLILZ = pcsCalendlyBookingData;
        this.LLILZLL = pcsCalendlyBookingFragment;
        return pcsCalendlyBookingFragment;
    }

    @Override // com.bytedance.android.livesdk.comp.impl.pcs.business.common.ui.PcsDraggableBottomSheetDialogFragment, com.bytedance.android.livesdk.LiveDialogFragment
    public final C500980Jkm createParams() {
        C500980Jkm c500980JkmCreateParams = super.createParams();
        c500980JkmCreateParams.LJIIJJI = 100;
        c500980JkmCreateParams.LJIILIIL = 16;
        return c500980JkmCreateParams;
    }

    @Override // com.bytedance.android.livesdk.comp.impl.pcs.business.common.ui.PcsDraggableBottomSheetDialogFragment
    public final void MR(BottomSheetBehavior<ViewGroup> bottomSheetBehavior) {
        TitleDragBottomSheetBehavior titleDragBottomSheetBehavior;
        if ((bottomSheetBehavior instanceof TitleDragBottomSheetBehavior) && (titleDragBottomSheetBehavior = (TitleDragBottomSheetBehavior) bottomSheetBehavior) != null) {
            titleDragBottomSheetBehavior.LIZ = R.id.c8y;
        }
    }

    @Override // com.bytedance.android.livesdk.comp.impl.pcs.business.common.ui.PcsDraggableBottomSheetDialogFragment
    public final void OR(float f) {
        PcsCalendlyBookingFragment pcsCalendlyBookingFragment = this.LLILZLL;
        if (pcsCalendlyBookingFragment != null) {
            if (!pcsCalendlyBookingFragment.LLIZ) {
                pcsCalendlyBookingFragment.LLIZLLLIL = Float.valueOf(f);
            } else {
                pcsCalendlyBookingFragment.NR(f);
            }
        }
    }

    @Override // com.bytedance.android.livesdk.comp.impl.pcs.business.common.ui.PcsDraggableBottomSheetDialogFragment, com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(final View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        float f = getResources().getDisplayMetrics().heightPixels;
        this.LLILZ = (int) (0.3f * f);
        this.LLILZIL = (int) (f * 0.100000024f);
        View viewFindViewById = view.findViewById(R.id.tsc);
        if (viewFindViewById != null) {
            final int i = getResources().getDisplayMetrics().heightPixels;
            viewFindViewById.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: X.0JOX
                @Override // android.view.View.OnLayoutChangeListener
                public final void onLayoutChange(View view2, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
                    boolean z;
                    int i10;
                    ViewGroup.LayoutParams layoutParams;
                    C16BC c16bc;
                    PcsCalendlyDraggleHeightDialog pcsCalendlyDraggleHeightDialog;
                    PcsCalendlyBookingFragment pcsCalendlyBookingFragment;
                    ViewGroup.LayoutParams layoutParams2;
                    C16G1 c16g1;
                    int i11 = i5 - i3;
                    if (i11 != i9 - i7) {
                        if (i11 < ((double) i) * 0.85d) {
                            z = true;
                        } else {
                            z = false;
                        }
                        PcsCalendlyDraggleHeightDialog pcsCalendlyDraggleHeightDialog2 = this;
                        if (z) {
                            i10 = pcsCalendlyDraggleHeightDialog2.LLILZIL;
                        } else {
                            i10 = pcsCalendlyDraggleHeightDialog2.LLILZ;
                        }
                        View viewFindViewById2 = view.findViewById(R.id.eqx);
                        BottomSheetBehavior bottomSheetBehavior = null;
                        if (viewFindViewById2 != null) {
                            layoutParams = viewFindViewById2.getLayoutParams();
                        } else {
                            layoutParams = null;
                        }
                        if ((layoutParams instanceof C16G1) && (c16g1 = (C16G1) layoutParams) != null) {
                            c16bc = c16g1.LIZ;
                        } else {
                            c16bc = null;
                        }
                        if (c16bc instanceof BottomSheetBehavior) {
                            bottomSheetBehavior = (BottomSheetBehavior) c16bc;
                        }
                        int i12 = i11 - i10;
                        if (i12 < 0) {
                            i12 = 0;
                        }
                        if (bottomSheetBehavior != null && ((bottomSheetBehavior.getState() == 4 || bottomSheetBehavior.getState() == 2) && bottomSheetBehavior.getPeekHeight() != i12)) {
                            bottomSheetBehavior.setPeekHeight(i12);
                        }
                        if (z) {
                            PcsCalendlyBookingFragment pcsCalendlyBookingFragment2 = this.LLILZLL;
                            if (pcsCalendlyBookingFragment2 != null) {
                                if (!pcsCalendlyBookingFragment2.LLIZ) {
                                    pcsCalendlyBookingFragment2.LLIZLLLIL = Float.valueOf(0.0f);
                                } else {
                                    pcsCalendlyBookingFragment2.NR(0.0f);
                                }
                            }
                            View viewFindViewById3 = view.findViewById(R.id.eqx);
                            if (viewFindViewById3 != null) {
                                ViewGroup.LayoutParams layoutParams3 = viewFindViewById3.getLayoutParams();
                                if (layoutParams3 != null && layoutParams3.height == i12) {
                                    return;
                                }
                                ViewGroup.LayoutParams layoutParams4 = viewFindViewById3.getLayoutParams();
                                if (layoutParams4 != null) {
                                    layoutParams4.height = i12;
                                }
                                viewFindViewById3.requestLayout();
                                return;
                            }
                            return;
                        }
                        View viewFindViewById4 = view.findViewById(R.id.eqx);
                        if (viewFindViewById4 != null && ((layoutParams2 = viewFindViewById4.getLayoutParams()) == null || layoutParams2.height != -1)) {
                            ViewGroup.LayoutParams layoutParams5 = viewFindViewById4.getLayoutParams();
                            if (layoutParams5 != null) {
                                layoutParams5.height = -1;
                            }
                            viewFindViewById4.requestLayout();
                        }
                        if (bottomSheetBehavior == null || bottomSheetBehavior.getState() != 4 || (pcsCalendlyBookingFragment = (pcsCalendlyDraggleHeightDialog = this).LLILZLL) == null) {
                            return;
                        }
                        float f2 = pcsCalendlyDraggleHeightDialog.LLILZ;
                        if (!pcsCalendlyBookingFragment.LLIZ) {
                            pcsCalendlyBookingFragment.LLIZLLLIL = Float.valueOf(f2);
                        } else {
                            pcsCalendlyBookingFragment.NR(f2);
                        }
                    }
                }
            });
            C14K9.LJIJJ(view, new C0TVI() { // from class: X.0JOY
                @Override // X.C0TVI
                public final C20246014Ju onApplyWindowInsets(View view2, C20246014Ju c20246014Ju) {
                    return C20246014Ju.LIZIZ;
                }
            });
        }
    }
}
