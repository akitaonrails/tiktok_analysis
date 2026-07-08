package com.ss.android.ugc.aweme.ecommerce.base.address.edit.viewholder;

import X.C01GW;
import X.C03IT;
import X.C11EA;
import X.C1308910kAL;
import X.C1331660kl2;
import X.C1331670kl3;
import X.C13LE;
import X.C1745300vWC;
import X.C1745680vWo;
import X.C1776170wJz;
import X.C19719912Dl;
import X.C2217381BqS;
import X.C418440Gaw;
import X.C452501pT;
import X.C786410Ut5;
import X.C814420VxA;
import X.C992303uL;
import X.InterfaceC1747020vYy;
import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.AddressLocation;
import com.ss.android.ugc.aweme.ecommerce.base.address.edit.AddressEditFragment;
import com.ss.android.ugc.aweme.ecommerce.base.address.edit.AddressEditState;
import com.ss.android.ugc.aweme.ecommerce.base.address.edit.AddressEditViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.common.model.Icon;
import com.ss.android.ugc.aweme.ecommerce.service.vo.Image;
import com.zhiliaoapp.musically.R;
import g1c.AjS70S0100000_26;
import kotlin.jvm.internal.AwS270S0300000_26;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes27.dex */
public final class ThumbnailMapViewHolder extends BaseViewHolder {
    public final AddressEditFragment LLJILJILJ;
    public final C01GW LLJILLL;
    public InterfaceC1747020vYy LLJJ;
    public boolean LLJJI;
    public boolean LLJJIII;

    @Override // com.ss.android.ugc.aweme.ecommerce.base.address.edit.viewholder.BaseViewHolder, com.ss.android.ugc.aweme.ecommercebase.view.ECJediViewHolder, com.bytedance.jedi.ext.adapter.JediSimpleViewHolder, com.bytedance.jedi.ext.adapter.JediViewHolder, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    public final AddressEditViewModel a6() {
        return (AddressEditViewModel) this.LLJILLL.getValue();
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.address.edit.viewholder.BaseViewHolder
    /* JADX INFO: renamed from: W5 */
    public final void rr(C1745680vWo c1745680vWo) {
        Integer numLIZJ;
        Integer numLIZJ2;
        Integer numLIZJ3;
        C1745300vWC c1745300vWC;
        AddressLocation addressLocation;
        Image imageRequireImage;
        C03IT thumbFirstImageUrlModel;
        Image imageRequireImage2;
        C03IT thumbFirstImageUrlModel2;
        super.rr(c1745680vWo);
        ViewGroup viewGroup = (ViewGroup) this.itemView.findViewById(R.id.xuq);
        View viewFindViewById = this.itemView.findViewById(R.id.xur);
        View viewFindViewById2 = this.itemView.findViewById(R.id.xup);
        ViewGroup viewGroup2 = (ViewGroup) this.itemView.findViewById(R.id.ep0);
        TextView textView = (TextView) this.itemView.findViewById(R.id.eoz);
        View viewFindViewById3 = this.itemView.findViewById(R.id.eov);
        ImageView imageView = (ImageView) this.itemView.findViewById(R.id.qgh);
        ImageView imageView2 = (ImageView) this.itemView.findViewById(R.id.xyp);
        View viewFindViewById4 = this.itemView.findViewById(R.id.pwk);
        if (a6().LLLIZZ == null && viewGroup != null) {
            ViewGroup.LayoutParams layoutParams = viewGroup.getLayoutParams();
            if (layoutParams != null) {
                layoutParams.width = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(0));
                layoutParams.height = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(0));
            }
            if (viewGroup != null) {
                C786410Ut5.X5(layoutParams, viewGroup);
                C786410Ut5.LJLZ(8, viewGroup);
            }
        }
        if (viewFindViewById3 != null) {
            C786410Ut5.LJLLLLLL(8, viewFindViewById3);
        }
        if (viewGroup2 != null) {
            C786410Ut5.LJLZ(8, viewGroup2);
        }
        Context context = this.LLJILJILJ.getContext();
        if (context != null) {
            numLIZJ = C1308910kAL.LIZJ(R.attr.a03, context);
        } else {
            numLIZJ = null;
        }
        if (viewFindViewById != null) {
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setShape(0);
            gradientDrawable.setCornerRadius(C418440Gaw.LIZIZ(8));
            if (numLIZJ != null) {
                gradientDrawable.setStroke(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(1)), numLIZJ.intValue());
            }
            viewFindViewById.setBackground(gradientDrawable);
            viewFindViewById.setClipToOutline(true);
        }
        if (viewFindViewById2 != null) {
            GradientDrawable gradientDrawable2 = new GradientDrawable();
            gradientDrawable2.setShape(0);
            gradientDrawable2.setCornerRadius(C418440Gaw.LIZIZ(8));
            viewFindViewById2.setBackground(gradientDrawable2);
            viewFindViewById2.setClipToOutline(true);
        }
        Context context2 = this.LLJILJILJ.getContext();
        if (context2 != null) {
            numLIZJ2 = C1308910kAL.LIZJ(R.attr.a01, context2);
        } else {
            numLIZJ2 = null;
        }
        if (viewFindViewById3 != null) {
            GradientDrawable gradientDrawable3 = new GradientDrawable();
            gradientDrawable3.setShape(0);
            gradientDrawable3.setCornerRadius(C418440Gaw.LIZIZ(8));
            if (numLIZJ2 != null) {
                gradientDrawable3.setColor(numLIZJ2.intValue());
            }
            viewFindViewById3.setBackground(gradientDrawable3);
        }
        Context context3 = this.LLJILJILJ.getContext();
        if (context3 != null) {
            numLIZJ3 = C1308910kAL.LIZJ(R.attr.zn, context3);
        } else {
            numLIZJ3 = null;
        }
        if (viewGroup2 != null) {
            GradientDrawable gradientDrawable4 = new GradientDrawable();
            gradientDrawable4.setShape(0);
            gradientDrawable4.setCornerRadii(new float[]{C418440Gaw.LIZIZ(8), C418440Gaw.LIZIZ(8), C418440Gaw.LIZIZ(8), C418440Gaw.LIZIZ(8), 0.0f, 0.0f, 0.0f, 0.0f});
            if (numLIZJ3 != null) {
                gradientDrawable4.setColor(numLIZJ3.intValue());
            }
            viewGroup2.setBackground(gradientDrawable4);
        }
        if (imageView != null) {
            imageView.bringToFront();
        }
        if (viewFindViewById4 != null) {
            C786410Ut5.I7(new AjS70S0100000_26(this, 7), viewFindViewById4);
        }
        Object obj = c1745680vWo.LIZIZ;
        if ((obj instanceof AddressLocation) && (addressLocation = (AddressLocation) obj) != null) {
            Icon icon = addressLocation.pinPointIcon;
            if (icon != null && (imageRequireImage2 = icon.requireImage(this.itemView.getContext())) != null && (thumbFirstImageUrlModel2 = imageRequireImage2.toThumbFirstImageUrlModel()) != null) {
                C1331670kl3 c1331670kl3LJIIJ = C1331660kl2.LJIIJ(thumbFirstImageUrlModel2);
                c1331670kl3LJIIJ.LJJI(imageView);
                C786410Ut5.h3(c1331670kl3LJIIJ);
            }
            Icon icon2 = addressLocation.tipIcon;
            if (icon2 != null && (imageRequireImage = icon2.requireImage(this.itemView.getContext())) != null && (thumbFirstImageUrlModel = imageRequireImage.toThumbFirstImageUrlModel()) != null) {
                C1331670kl3 c1331670kl3LJIIJ2 = C1331660kl2.LJIIJ(thumbFirstImageUrlModel);
                c1331670kl3LJIIJ2.LJJI(imageView2);
                C786410Ut5.h3(c1331670kl3LJIIJ2);
            }
            String str = addressLocation.tipText;
            if (str != null && !a0.LJJJIL(str) && !a6().LLLLII) {
                if (textView != null) {
                    textView.setText(addressLocation.tipText);
                }
                if (viewGroup2 != null) {
                    C786410Ut5.LJLZ(0, viewGroup2);
                }
                if (viewFindViewById3 != null) {
                    C786410Ut5.LJLLLLLL(0, viewFindViewById3);
                }
            }
        }
        View view = this.itemView;
        if ((view instanceof C1745300vWC) && (c1745300vWC = (C1745300vWC) view) != null) {
            c1745300vWC.LJI(null, null, null, null, false);
            View inputBottomSpaceFromXml = c1745300vWC.getInputBottomSpaceFromXml();
            if (inputBottomSpaceFromXml != null) {
                C786410Ut5.LJLLLLLL(8, inputBottomSpaceFromXml);
            }
        }
        if (!this.LLJJIII) {
            this.LLJJIII = true;
            C11EA.LJIIJ(this, a6(), new C2217381BqS() { // from class: X.0vW6
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj2) {
                    return ((AddressEditState) obj2).getInputItemVOList();
                }
            }, new C2217381BqS() { // from class: X.0vWA
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj2) {
                    return ((AddressEditState) obj2).getCurrentLocation();
                }
            }, new C2217381BqS() { // from class: X.0vW8
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj2) {
                    return Boolean.valueOf(((AddressEditState) obj2).getLocationPermissionStatus());
                }
            }, new C1776170wJz(viewGroup, this, 0));
        }
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.address.edit.viewholder.BaseViewHolder, com.bytedance.jedi.ext.adapter.JediSimpleViewHolder
    public final /* bridge */ /* synthetic */ void rr(Object obj) {
        rr((C1745680vWo) obj);
    }

    public ThumbnailMapViewHolder(ViewGroup viewGroup, AddressEditFragment addressEditFragment) {
        super(C992303uL.LIZ(viewGroup.getContext(), R.layout.aji, viewGroup));
        this.LLJILJILJ = addressEditFragment;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(AddressEditViewModel.class);
        this.LLJILLL = C452501pT.LIZIZ(new AwS270S0300000_26(this, c19719912DlLIZ, c19719912DlLIZ, 30));
        this.LLJJI = true;
    }
}
