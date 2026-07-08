package com.bytedance.android.livesdk.comp.impl.pcs.business.common.ui;

import X.C0HTI;
import X.C16BC;
import X.C16G1;
import X.C19EH;
import X.C491190JOb;
import X.C500980Jkm;
import X.C786410Ut5;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.android.livesdk.LiveDialogFragment;
import com.bytedance.android.livesdk.comp.impl.pcs.business.common.ui.PcsDraggableBottomSheetDialogFragment;
import com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.calendlymeeting.view.PcsCalendlyBookingFragment;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes8.dex */
public abstract class PcsDraggableBottomSheetDialogFragment extends LiveDialogFragment {
    public BottomSheetBehavior<ViewGroup> LL;
    public C491190JOb LLILLJJLI;

    public void MR(BottomSheetBehavior<ViewGroup> bottomSheetBehavior) {
    }

    public abstract PcsCalendlyBookingFragment NR();

    public abstract void OR(float f);

    @Override // com.bytedance.android.live.design.resource.theme.LiveThemeAwareDialogFragment
    public final boolean isSheet() {
        return true;
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment
    public C500980Jkm createParams() {
        C500980Jkm c500980Jkm = new C500980Jkm(R.layout.hfv);
        c500980Jkm.LIZJ = R.style.ahk;
        c500980Jkm.LJIIJ = -1;
        c500980Jkm.LJII = 80;
        c500980Jkm.LJIIJJI = 95;
        return c500980Jkm;
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        BottomSheetBehavior<ViewGroup> bottomSheetBehavior;
        C491190JOb c491190JOb = this.LLILLJJLI;
        if (c491190JOb != null && (bottomSheetBehavior = this.LL) != null) {
            bottomSheetBehavior.removeBottomSheetCallback(c491190JOb);
        }
        this.LLILLJJLI = null;
        this.LL = null;
        super.onDestroyView();
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        final BottomSheetBehavior bottomSheetBehavior;
        C16G1 c16g1;
        super.onViewCreated(view, bundle);
        final ViewGroup viewGroup = (ViewGroup) view.findViewById(R.id.eqx);
        View viewFindViewById = view.findViewById(R.id.iiv);
        View viewFindViewById2 = view.findViewById(R.id.yg_);
        if (viewFindViewById2 != null) {
            C786410Ut5.I7(new View.OnClickListener() { // from class: X.0JOZ
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    this.LL.dismiss();
                }
            }, viewFindViewById2);
        }
        viewGroup.setClickable(true);
        PcsCalendlyBookingFragment pcsCalendlyBookingFragmentNR = NR();
        C19EH c19ehLJIIJ = getChildFragmentManager().LJIIJ();
        C16BC c16bc = null;
        c19ehLJIIJ.LJIJ(viewFindViewById.getId(), pcsCalendlyBookingFragmentNR, null);
        c19ehLJIIJ.LJIIL();
        ViewGroup.LayoutParams layoutParams = viewGroup.getLayoutParams();
        if ((layoutParams instanceof C16G1) && (c16g1 = (C16G1) layoutParams) != null) {
            c16bc = c16g1.LIZ;
        }
        if ((c16bc instanceof BottomSheetBehavior) && (bottomSheetBehavior = (BottomSheetBehavior) c16bc) != null) {
            C0HTI c0hti = new C0HTI();
            c0hti.LIZ = R.drawable.f8l;
            final Drawable drawableLIZ = c0hti.LIZ(view.getContext());
            C0HTI c0hti2 = new C0HTI();
            c0hti2.LIZ = R.drawable.f8k;
            final Drawable drawableLIZ2 = c0hti2.LIZ(view.getContext());
            HandlerHook.viewPost(viewGroup, new Runnable() { // from class: X.0JOa
                /* JADX WARN: Type inference failed for: r3v1, types: [X.0JOb, X.0gl5] */
                public final void LIZ() {
                    BottomSheetBehavior<ViewGroup> bottomSheetBehavior2;
                    int height = viewGroup.getHeight();
                    final C1324720kZq c1324720kZq = (C1324720kZq) viewGroup.findViewById(R.id.g81);
                    if (c1324720kZq != null) {
                        c1324720kZq.setImageDrawable(drawableLIZ);
                    }
                    this.MR(bottomSheetBehavior);
                    final PcsDraggableBottomSheetDialogFragment pcsDraggableBottomSheetDialogFragment = this;
                    BottomSheetBehavior<ViewGroup> bottomSheetBehavior3 = bottomSheetBehavior;
                    final Drawable drawable = drawableLIZ;
                    final Drawable drawable2 = drawableLIZ2;
                    pcsDraggableBottomSheetDialogFragment.getClass();
                    float f = height;
                    final float f2 = f * 0.3f;
                    final float f3 = f * 0.100000024f;
                    bottomSheetBehavior3.setPeekHeight((int) (0.7f * f));
                    bottomSheetBehavior3.setExpandedOffset((int) f3);
                    bottomSheetBehavior3.setHalfExpandedRatio(bottomSheetBehavior3.getPeekHeight() / f);
                    bottomSheetBehavior3.setFitToContents(false);
                    bottomSheetBehavior3.setHideable(false);
                    bottomSheetBehavior3.setDraggable(true);
                    C491190JOb c491190JOb = pcsDraggableBottomSheetDialogFragment.LLILLJJLI;
                    if (c491190JOb != null && (bottomSheetBehavior2 = pcsDraggableBottomSheetDialogFragment.LL) != null) {
                        bottomSheetBehavior2.removeBottomSheetCallback(c491190JOb);
                    }
                    pcsDraggableBottomSheetDialogFragment.LL = bottomSheetBehavior3;
                    bottomSheetBehavior3.setState(4);
                    if (c1324720kZq != null) {
                        c1324720kZq.setImageDrawable(drawable);
                    }
                    pcsDraggableBottomSheetDialogFragment.OR(f2);
                    ?? r3 = new AbstractC1177930gl5() { // from class: X.0JOb
                        @Override // X.AbstractC1177930gl5
                        public final void LIZJ(View view2, float f4) {
                            float fLIZLLL = C13LZ.LIZLLL(f4, 0.0f, 1.0f);
                            float f5 = f2;
                            pcsDraggableBottomSheetDialogFragment.OR(f5 - ((f5 - f3) * fLIZLLL));
                        }

                        @Override // X.AbstractC1177930gl5
                        public final void LIZLLL(int i, View view2) {
                            if (i != 3) {
                                if (i == 4) {
                                    C1324720kZq c1324720kZq2 = c1324720kZq;
                                    if (c1324720kZq2 != null) {
                                        c1324720kZq2.setImageDrawable(drawable);
                                    }
                                    pcsDraggableBottomSheetDialogFragment.OR(f2);
                                    return;
                                }
                                return;
                            }
                            C1324720kZq c1324720kZq3 = c1324720kZq;
                            if (c1324720kZq3 != null) {
                                c1324720kZq3.setImageDrawable(drawable2);
                            }
                            pcsDraggableBottomSheetDialogFragment.OR(f3);
                        }
                    };
                    pcsDraggableBottomSheetDialogFragment.LLILLJJLI = r3;
                    bottomSheetBehavior3.addBottomSheetCallback(r3);
                }

                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("PcsDraggableBottomSheetDialogFragment@603f.onViewCreated$2");
                    try {
                        LIZ();
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("PcsDraggableBottomSheetDialogFragment@603f.onViewCreated$2");
                }
            });
        }
    }
}
