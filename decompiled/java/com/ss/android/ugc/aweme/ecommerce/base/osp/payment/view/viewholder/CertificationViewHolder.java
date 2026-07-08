package com.ss.android.ugc.aweme.ecommerce.base.osp.payment.view.viewholder;

import X.AbstractC468201s0;
import X.C1331660kl2;
import X.C1331670kl3;
import X.C13LP;
import X.C426160GnO;
import X.C786410Ut5;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.CertificationIcon;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentCertification;
import com.ss.android.ugc.aweme.ecommercebase.view.ECJediViewHolder;
import com.zhiliaoapp.musically.R;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class CertificationViewHolder extends ECJediViewHolder<PaymentCertification> {
    public final ViewGroup LLJILJIL;

    @Override // com.ss.android.ugc.aweme.ecommercebase.view.ECJediViewHolder, com.bytedance.jedi.ext.adapter.JediSimpleViewHolder, com.bytedance.jedi.ext.adapter.JediViewHolder, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    public CertificationViewHolder(ViewGroup viewGroup) {
        super(C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.aqo, viewGroup, false));
        this.LLJILJIL = viewGroup;
    }

    @Override // com.bytedance.jedi.ext.adapter.JediSimpleViewHolder
    public final void rr(Object obj) {
        String str;
        PaymentCertification paymentCertification = (PaymentCertification) obj;
        String str2 = paymentCertification.title;
        if (str2 != null) {
            ((TextView) this.itemView.findViewById(R.id.z2t)).setText(str2);
        }
        final float textSize = ((TextView) this.itemView.findViewById(R.id.z2t)).getTextSize();
        final Context context = this.LLJILJIL.getContext();
        C786410Ut5.LJJJJZ((C426160GnO) this.itemView.findViewById(R.id.i1u));
        List<CertificationIcon> list = paymentCertification.icons;
        if (list != null) {
            for (final CertificationIcon certificationIcon : list) {
                List<String> list2 = certificationIcon.urlList;
                if (list2 != null && (str = (String) C13LP.LJJJLL(list2)) != null) {
                    C1331670kl3 c1331670kl3LJIIIZ = C1331660kl2.LJIIIZ(str);
                    c1331670kl3LJIIIZ.LJJIJL(context);
                    c1331670kl3LJIIIZ.LJJII(new AbstractC468201s0() { // from class: X.03C7
                        @Override // X.InterfaceC1331910klR
                        public final void onFailed(Throwable th) {
                        }

                        @Override // X.InterfaceC1331910klR
                        public final void LIZ(Bitmap bitmap) {
                            int intrinsicWidth;
                            int intrinsicHeight;
                            if (bitmap == null) {
                                return;
                            }
                            BitmapDrawable bitmapDrawable = new BitmapDrawable(context.getResources(), bitmap);
                            Integer num = certificationIcon.width;
                            if (num != null && num.intValue() > 0) {
                                intrinsicWidth = certificationIcon.width.intValue();
                            } else {
                                intrinsicWidth = bitmapDrawable.getIntrinsicWidth();
                            }
                            Integer num2 = certificationIcon.height;
                            if (num2 != null && num2.intValue() > 0) {
                                intrinsicHeight = certificationIcon.height.intValue();
                            } else {
                                intrinsicHeight = bitmapDrawable.getIntrinsicHeight();
                            }
                            float f = (intrinsicWidth * 1.0f) / (intrinsicHeight * 1.0f);
                            float f2 = textSize;
                            bitmapDrawable.setBounds(0, 0, (int) (f2 * f), (int) f2);
                            ImageView imageView = new ImageView(context);
                            float f3 = textSize;
                            imageView.setImageDrawable(bitmapDrawable);
                            C786410Ut5.c6(imageView, new LinearLayout.LayoutParams((int) (((double) ((f * f3) + C0H9H.LIZIZ(2))) * 1.2d), (int) (((double) (f3 + C0H9H.LIZIZ(5))) * 1.2d)));
                            imageView.setPadding(C0H9H.LIZIZ(2), C679280Qkg.LIZ(1), C0H9H.LIZIZ(2), C679280Qkg.LIZ(1));
                            ((ViewGroup) this.itemView.findViewById(R.id.i1u)).addView(imageView);
                        }
                    });
                }
            }
        }
    }
}
