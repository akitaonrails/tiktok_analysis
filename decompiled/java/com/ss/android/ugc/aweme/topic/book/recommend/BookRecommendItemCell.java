package com.ss.android.ugc.aweme.topic.book.recommend;

import X.AbstractC21673619ry;
import X.AbstractC2211791BhR;
import X.C0OAT;
import X.C1331660kl2;
import X.C13LP;
import X.C2211751BhN;
import X.C418440Gaw;
import X.C426750GoL;
import X.C427690Gpr;
import X.C786410Ut5;
import X.C814420VxA;
import X.InterfaceC1891350zJl;
import Y.ACListenerS144S0100000_9;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.lighten.loader.SmartImageView;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS553S0100000_9;

/* JADX INFO: loaded from: classes10.dex */
public final class BookRecommendItemCell extends PowerCell<C0OAT> {
    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onItemViewCreated() {
        super.onItemViewCreated();
        C2211751BhN.LIZ(this.itemView, new AbstractC2211791BhR(this) { // from class: X.0Oim
            public Function0<String> LJ;
            public final float LJFF = 0.001f;
            public final C638890P4d LJI;

            @Override // X.AbstractC2211791BhR
            public final boolean LJIIIIZZ() {
                return false;
            }

            @Override // X.AbstractC2211791BhR
            public final Function0<String> LIZLLL() {
                return this.LJ;
            }

            @Override // X.AbstractC2211791BhR
            public final InterfaceC2211931Bhf LJFF() {
                return this.LJI;
            }

            @Override // X.AbstractC2211791BhR
            public final float LJIIL() {
                return this.LJFF;
            }

            {
                this.LJ = new AwS553S0100000_9(this, 1541);
                this.LJI = new C638890P4d(this, 2);
            }

            @Override // X.AbstractC2211791BhR
            public final void LJIILL(Function0<String> function0) {
                this.LJ = function0;
            }
        });
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl) {
        Integer numValueOf;
        int itemCount;
        List<String> urlList;
        String str;
        C0OAT c0oat = (C0OAT) interfaceC1891350zJl;
        super.onBindItemView(c0oat);
        SmartImageView smartImageView = (SmartImageView) this.itemView.findViewById(R.id.bh2);
        float f = 75;
        float f2 = 120;
        float f3 = f / f2;
        UrlModel urlModel = c0oat.LL.cover;
        Integer numValueOf2 = null;
        if (urlModel != null) {
            numValueOf = Integer.valueOf(urlModel.getWidth());
        } else {
            numValueOf = null;
        }
        UrlModel urlModel2 = c0oat.LL.cover;
        if (urlModel2 != null) {
            numValueOf2 = Integer.valueOf(urlModel2.getHeight());
        }
        if (numValueOf != null && numValueOf2 != null && numValueOf.intValue() != 0 && numValueOf2.intValue() != 0) {
            float fIntValue = numValueOf.intValue() / numValueOf2.intValue();
            ViewGroup.LayoutParams layoutParams = smartImageView.getLayoutParams();
            if (layoutParams != null) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                if (fIntValue >= f3) {
                    marginLayoutParams.width = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(75));
                    marginLayoutParams.height = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(f / fIntValue)));
                } else {
                    marginLayoutParams.height = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(120));
                    float f4 = f2 * fIntValue;
                    marginLayoutParams.width = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(f4)));
                    int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf((f - f4) / 2)));
                    marginLayoutParams.setMargins(iLIZIZ, marginLayoutParams.topMargin, iLIZIZ, marginLayoutParams.bottomMargin);
                }
                C786410Ut5.W5(smartImageView, marginLayoutParams);
            } else {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            }
        } else {
            ViewGroup.LayoutParams layoutParams2 = smartImageView.getLayoutParams();
            if (layoutParams2 != null) {
                layoutParams2.width = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(75));
                layoutParams2.height = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(120));
                C786410Ut5.W5(smartImageView, layoutParams2);
            } else {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            }
        }
        UrlModel urlModel3 = c0oat.LL.cover;
        if (urlModel3 != null && (urlList = urlModel3.getUrlList()) != null && (str = (String) C13LP.LJJJJZI(urlList)) != null) {
            smartImageView.LIZ(C1331660kl2.LJIIIZ(str).LIZJ());
        }
        int absoluteAdapterPosition = getAbsoluteAdapterPosition();
        if (absoluteAdapterPosition == 0) {
            C426750GoL.LJIIIZ(this.itemView, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16))), null, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(5))), null, false, 26);
        } else {
            AbstractC21673619ry<? extends RecyclerView.ViewHolder> bindingAdapter = getBindingAdapter();
            if (bindingAdapter != null) {
                itemCount = bindingAdapter.getItemCount();
            } else {
                itemCount = 10;
            }
            if (absoluteAdapterPosition == itemCount - 1) {
                C426750GoL.LJIIIZ(this.itemView, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(5))), null, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16))), null, false, 26);
            } else {
                C426750GoL.LJIIIZ(this.itemView, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(5))), null, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(5))), null, false, 26);
            }
        }
        C786410Ut5.I7(new ACListenerS144S0100000_9(c0oat, 104), this.itemView);
        C427690Gpr.LJFF(this.itemView.findViewById(R.id.bh2), C418440Gaw.LIZIZ(2));
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        return C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.fvw, viewGroup, false);
    }
}
