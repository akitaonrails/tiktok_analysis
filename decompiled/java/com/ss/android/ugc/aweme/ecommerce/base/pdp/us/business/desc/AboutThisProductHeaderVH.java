package com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.desc;

import X.C01GW;
import X.C03C8;
import X.C10515049h;
import X.C1326790kdB;
import X.C1331670kl3;
import X.C1406010mgx;
import X.C1744700vVE;
import X.C1748720vbi;
import X.C452501pT;
import X.C786410Ut5;
import X.C954703oH;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.ecommerce.base.common.model.Icon;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.basicui.listitem.common.AbsFullSpanVH;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.desc.AboutThisProductHeaderVH;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.core.page.vm.PdpViewModel;
import com.ss.android.ugc.aweme.ecommerce.richtext.dto.ECRichText;
import com.ss.android.ugc.aweme.ecommerce.service.vo.Image;
import com.zhiliaoapp.musically.R;
import java.util.Map;
import kotlin.jvm.internal.AwS108S0110000_22;
import kotlin.jvm.internal.AwS566S0100000_22;
import kotlin.jvm.internal.AwS601S0100000_22;
import kotlin.jvm.internal.AwS605S0100000_26;

/* JADX INFO: loaded from: classes23.dex */
public final class AboutThisProductHeaderVH extends AbsFullSpanVH<C1406010mgx> {
    public final C01GW LLJJIJIL;
    public TuxTextView LLJJJ;
    public SmartImageView LLJJJIL;

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.basicui.listitem.common.AbsFullSpanVH, com.ss.android.ugc.aweme.ecommercebase.view.ECJediViewHolder, com.bytedance.jedi.ext.adapter.JediSimpleViewHolder, com.bytedance.jedi.ext.adapter.JediViewHolder, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.bytedance.jedi.ext.adapter.JediSimpleViewHolder
    public final void rr(Object obj) {
        final boolean zBooleanValue;
        Icon icon;
        Image icon2;
        final C1406010mgx c1406010mgx = (C1406010mgx) obj;
        ECRichText eCRichText = c1406010mgx.LL;
        View viewFindViewById = null;
        if (eCRichText != null) {
            View viewFindViewById2 = this.LLJJJ;
            if (viewFindViewById2 == null) {
                View view = this.itemView;
                if (view != null) {
                    viewFindViewById2 = view.findViewById(R.id.yo);
                } else {
                    viewFindViewById2 = null;
                }
                this.LLJJJ = (TuxTextView) viewFindViewById2;
            }
            TextView textView = (TextView) viewFindViewById2;
            if (textView != null) {
                C03C8.LJ(textView, eCRichText, "description", null);
                C1748720vbi.LIZLLL(textView, new C10515049h(), new AwS601S0100000_22(c1406010mgx, 27));
            }
        }
        Boolean bool = (Boolean) ((Map) ((PdpViewModel) this.LLJJIJIL.getValue()).OR2().LIZIZ.getValue()).get(c1406010mgx.LLILZ);
        if (bool != null) {
            zBooleanValue = bool.booleanValue();
        } else {
            zBooleanValue = c1406010mgx.LLILZIL;
        }
        if (zBooleanValue) {
            icon = c1406010mgx.LLILLL;
        } else {
            icon = c1406010mgx.LLILLJJLI;
        }
        if (icon != null) {
            if (C1744700vVE.LJ(this.itemView.getContext(), null)) {
                icon2 = icon.getIconDark();
            } else {
                icon2 = icon.getIcon();
            }
        } else {
            icon2 = null;
        }
        C1326790kdB.LIZ.getClass();
        C1331670kl3 c1331670kl3LIZLLL = C1326790kdB.LIZLLL(icon2);
        View view2 = this.LLJJJIL;
        if (view2 == null) {
            View view3 = this.itemView;
            if (view3 != null) {
                viewFindViewById = view3.findViewById(R.id.yn);
            }
            this.LLJJJIL = (SmartImageView) viewFindViewById;
            view2 = viewFindViewById;
        }
        c1331670kl3LIZLLL.LJJ((SmartImageView) view2);
        C786410Ut5.h3(c1331670kl3LIZLLL);
        C786410Ut5.I7(new View.OnClickListener() { // from class: X.0n6X
            @Override // android.view.View.OnClickListener
            public final void onClick(View view4) {
                C1406010mgx c1406010mgx2 = c1406010mgx;
                if (c1406010mgx2.LLILZ != null) {
                    AboutThisProductHeaderVH aboutThisProductHeaderVH = this;
                    boolean z = zBooleanValue;
                    C1406560mhq c1406560mhqOR2 = ((PdpViewModel) aboutThisProductHeaderVH.LLJJIJIL.getValue()).OR2();
                    ((Map) c1406560mhqOR2.LIZIZ.getValue()).put(c1406010mgx2.LLILZ, Boolean.valueOf(!z));
                    c1406560mhqOR2.LIZ.setState(new AwS605S0100000_26(c1406560mhqOR2, 22));
                    C1748720vbi.LIZLLL(aboutThisProductHeaderVH.itemView, new C10516049i(), new AwS108S0110000_22(c1406010mgx2, z, 0));
                }
            }
        }, this.itemView);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public AboutThisProductHeaderVH(ViewGroup viewGroup, View view) {
        if (view == null) {
            C01GW c01gw = C954703oH.LIZ;
            view = C954703oH.LIZ(viewGroup.getContext(), R.layout.b30, viewGroup, false);
        }
        super(view);
        this.LLJJIJIL = C452501pT.LIZIZ(new AwS566S0100000_22(this, 28));
    }
}
