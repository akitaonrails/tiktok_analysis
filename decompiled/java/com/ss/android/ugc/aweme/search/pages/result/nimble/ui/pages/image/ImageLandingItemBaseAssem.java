package com.ss.android.ugc.aweme.search.pages.result.nimble.ui.pages.image;

import X.AbstractC468201s0;
import X.C01GW;
import X.C0Q09;
import X.C0Q0D;
import X.C0Q0E;
import X.C0Q0G;
import X.C0Q0H;
import X.C0R46;
import X.C1331660kl2;
import X.C1331670kl3;
import X.C21512819Ha;
import X.C384050F3z;
import X.C452501pT;
import X.C786410Ut5;
import X.InterfaceC1587906Jp;
import X.InterfaceC712990Rxx;
import Y.ARunnableS19S0400000_10;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.search.pages.result.nimble.ui.pages.image.IImageLandingPageAbility;
import com.ss.android.ugc.aweme.search.pages.result.nimble.ui.pages.image.ImageLandingItemBaseAssem;
import com.ss.android.ugc.aweme.search.pages.result.nimble.ui.pages.image.model.ImageData;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.AwS554S0100000_10;
import kotlin.jvm.internal.Intrinsics;
import wh6.AbS692S0100000_10;

/* JADX INFO: loaded from: classes11.dex */
public abstract class ImageLandingItemBaseAssem<T extends C0Q09> extends ReusedUISlotAssem<ImageLandingItemBaseAssem<T>> implements InterfaceC712990Rxx<T> {
    public final C01GW LLJJLIIIJLLLLLLLZ = C452501pT.LIZIZ(new AwS554S0100000_10((ImageLandingItemBaseAssem) this, 599));

    public abstract void Bp();

    public abstract void Ep(Bitmap bitmap, C21512819Ha c21512819Ha);

    public abstract String tp();

    @Override // X.InterfaceC712990Rxx
    public final void unBind() {
    }

    public abstract ConstraintLayout up();

    @Override // X.InterfaceC712990Rxx
    public final void wr() {
    }

    public abstract C21512819Ha yp();

    public abstract TuxTextView zp();

    public final void sp() {
        C21512819Ha c21512819HaYp;
        Context context = getContext();
        if (context != null && (c21512819HaYp = yp()) != null) {
            C384050F3z c384050F3z = new C384050F3z();
            c384050F3z.LIZIZ = Integer.valueOf(R.attr.bv);
            c21512819HaYp.setImageDrawable(c384050F3z.LIZ(context));
        }
        Bp();
    }

    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: Ap */
    public void up(T t) {
        final C21512819Ha c21512819HaYp;
        String detailPageImageUrl = t.getImageData().getDetailPageImageUrl();
        if (detailPageImageUrl != null && (c21512819HaYp = yp()) != null) {
            C1331670kl3 c1331670kl3LJIIIZ = C1331660kl2.LJIIIZ(C0Q0E.LIZIZ(detailPageImageUrl));
            c1331670kl3LJIIIZ.LJJIJL(getContext());
            c1331670kl3LJIIIZ.LJJII(new AbstractC468201s0(this) { // from class: X.0Q0B
                public final /* synthetic */ ImageLandingItemBaseAssem<C0Q09> LL;

                @Override // X.InterfaceC1331910klR
                public final void LIZ(Bitmap bitmap) {
                    Resources resources;
                    ImageLandingItemBaseAssem<C0Q09> imageLandingItemBaseAssem = this.LL;
                    C21512819Ha c21512819Ha = c21512819HaYp;
                    imageLandingItemBaseAssem.getClass();
                    if (bitmap != null) {
                        try {
                            Context context = imageLandingItemBaseAssem.getContext();
                            if (context != null && (resources = context.getResources()) != null) {
                                if (c21512819Ha.getWidth() > 0) {
                                    Bitmap bitmapOp = ImageLandingItemBaseAssem.op(bitmap, c21512819Ha);
                                    c21512819Ha.setImageDrawable(new BitmapDrawable(resources, bitmapOp));
                                    imageLandingItemBaseAssem.Ep(bitmapOp, c21512819Ha);
                                    return;
                                } else {
                                    c21512819Ha.setImageDrawable(null);
                                    HandlerHook.viewPost(c21512819Ha, new ARunnableS19S0400000_10(imageLandingItemBaseAssem, c21512819Ha, bitmap, resources, 1));
                                    return;
                                }
                            }
                            return;
                        } catch (Exception e) {
                            TryCatchGuardChecker.doCheck(e);
                        }
                    }
                    this.LL.sp();
                }

                @Override // X.InterfaceC1331910klR
                public final void onFailed(Throwable th) {
                    this.LL.sp();
                }

                {
                    this.LL = this;
                }
            });
        }
        String strTp = tp();
        if (strTp != null) {
            TuxTextView tuxTextViewZp = zp();
            if (tuxTextViewZp != null) {
                C786410Ut5.LLLLZLL(tuxTextViewZp, 0);
            }
            TuxTextView tuxTextViewZp2 = zp();
            if (tuxTextViewZp2 != null) {
                tuxTextViewZp2.setText(strTp);
                return;
            }
            return;
        }
        TuxTextView tuxTextViewZp3 = zp();
        if (tuxTextViewZp3 == null) {
            return;
        }
        C786410Ut5.LLLLZLL(tuxTextViewZp3, 8);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [X.0Q0C] */
    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public void onViewCreated(View view) {
        ConstraintLayout constraintLayoutUp = up();
        if (constraintLayoutUp != null) {
            C786410Ut5.I7(new AbS692S0100000_10(this, 9), constraintLayoutUp);
        }
        C21512819Ha c21512819HaYp = yp();
        if (c21512819HaYp != null) {
            c21512819HaYp.setImagePinchListener(new C0Q0H(this) { // from class: X.0Q0A
                public final /* synthetic */ ImageLandingItemBaseAssem<T> LIZ;

                {
                    this.LIZ = this;
                }

                @Override // X.C0Q0H
                public final void LIZ(boolean z) {
                    IImageLandingPageAbility iImageLandingPageAbility = (IImageLandingPageAbility) this.LIZ.LLJJLIIIJLLLLLLLZ.getValue();
                    if (iImageLandingPageAbility != null) {
                        ((C0Q09) C631370Opb.LIZ(this.LIZ)).getImageData();
                        iImageLandingPageAbility.FG0(z);
                    }
                }
            });
        }
        C21512819Ha c21512819HaYp2 = yp();
        if (c21512819HaYp2 != null) {
            c21512819HaYp2.setOnLongClickListener(new C0R46(this, 2));
        }
        IImageLandingPageAbility iImageLandingPageAbility = (IImageLandingPageAbility) this.LLJJLIIIJLLLLLLLZ.getValue();
        if (iImageLandingPageAbility != 0) {
            iImageLandingPageAbility.uz(new C0Q0G(this) { // from class: X.0Q0C
                public final /* synthetic */ ImageLandingItemBaseAssem<T> LIZ;

                {
                    this.LIZ = this;
                }

                @Override // X.C0Q0G
                public final void LIZ(ImageData imageData) {
                    C21512819Ha c21512819HaYp3;
                    if (!Intrinsics.LJFF(imageData, ((C0Q09) C631370Opb.LIZ(this.LIZ)).getImageData()) && (c21512819HaYp3 = this.LIZ.yp()) != null) {
                        c21512819HaYp3.LLILZ.reset();
                    }
                }
            });
        }
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ boolean ur(Object obj) {
        return true;
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ void vr(Object obj) {
    }

    public static Bitmap op(Bitmap bitmap, C21512819Ha c21512819Ha) {
        boolean z;
        Float fValueOf;
        Bitmap bitmapCreateBitmap;
        Pair pair = new Pair(Integer.valueOf(bitmap.getWidth()), Integer.valueOf(bitmap.getHeight()));
        Float fValueOf2 = null;
        if (c21512819Ha.getWidth() > 0 && c21512819Ha.getHeight() > 0) {
            if (c21512819Ha.getWidth() > c21512819Ha.getHeight()) {
                z = true;
            } else {
                z = false;
            }
            float width = c21512819Ha.getWidth() / c21512819Ha.getHeight();
            if (z) {
                fValueOf = null;
                fValueOf2 = Float.valueOf(width);
            } else {
                fValueOf = Float.valueOf(width);
            }
            C0Q0D c0q0dLIZ = C0Q0E.LIZ(pair, fValueOf, fValueOf2);
            if (c0q0dLIZ != null && (bitmapCreateBitmap = Bitmap.createBitmap(bitmap, c0q0dLIZ.LIZ, c0q0dLIZ.LIZIZ, c0q0dLIZ.LIZJ, c0q0dLIZ.LIZLLL)) != null) {
                return bitmapCreateBitmap;
            }
        }
        return bitmap;
    }

    public void sr(InterfaceC1587906Jp interfaceC1587906Jp, List list) {
        up(interfaceC1587906Jp);
    }
}
