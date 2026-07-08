package com.bytedance.android.livesdk.impl.revenue.strategy.panel.rechargeconsumption.banner;

import X.C01GW;
import X.C1143680frq;
import X.C1144190fsf;
import X.C1146800fws;
import X.C1196320hEk;
import X.C1834150xpV;
import X.C1954807lC;
import X.C452501pT;
import X.C500260Jjc;
import X.C786410Ut5;
import X.C800330VaR;
import X.EnumC1144180fse;
import X.InterfaceC1891350zJl;
import X.InterfaceC665370Q7z;
import X.InterfaceC713360RyY;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.lifecycle.ViewModelStoreOwner;
import com.bytedance.ies.powerlist.PowerCell;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS205S0000000_17;
import kotlin.jvm.internal.AwS561S0100000_17;

/* JADX INFO: loaded from: classes18.dex */
public final class TaskProgressBinder extends PowerCell<C1146800fws> implements InterfaceC713360RyY {
    public final C01GW LL = C452501pT.LIZIZ(AFwS205S0000000_17.get$arr$(57));
    public final C01GW LLILLJJLI = C452501pT.LIZIZ(new AwS561S0100000_17(this, 201));

    @Override // X.InterfaceC713360RyY
    public final ViewModelStoreOwner LLIIIILZ() {
        return (ViewModelStoreOwner) this.LLILLJJLI.getValue();
    }

    @Override // X.InterfaceC713360RyY
    public final InterfaceC665370Q7z k0() {
        return C1196320hEk.LIZ(this);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl) {
        String str;
        int i;
        C1146800fws c1146800fws = (C1146800fws) interfaceC1891350zJl;
        TextView textView = (TextView) this.itemView.findViewById(R.id.xex);
        if (textView != null) {
            textView.setText(c1146800fws.LL);
        }
        TextView textView2 = (TextView) this.itemView.findViewById(R.id.xev);
        if (textView2 != null) {
            textView2.setText(c1146800fws.LLILLJJLI);
        }
        ImageView imageView = (ImageView) this.itemView.findViewById(R.id.xew);
        if (imageView != null) {
            int i2 = C1144190fsf.LIZ[c1146800fws.LLILLL.ordinal()];
            if (i2 != 1 && i2 != 2) {
                if (i2 == 3) {
                    i = R.drawable.f9d;
                } else {
                    throw new C1954807lC();
                }
            } else {
                i = R.drawable.f9c;
            }
            imageView.setImageDrawable(C800330VaR.LIZIZ(imageView.getContext(), i));
        }
        View viewFindViewById = this.itemView.findViewById(R.id.eno);
        if (viewFindViewById != null) {
            if (c1146800fws.LLILLL == EnumC1144180fse.COMPLETED) {
                C500260Jjc.LLFFF(viewFindViewById);
            } else {
                C500260Jjc.LJIILIIL(viewFindViewById);
            }
        }
        View viewFindViewById2 = this.itemView.findViewById(R.id.s9c);
        if (viewFindViewById2 != null) {
            if (c1146800fws.LLILZ) {
                C500260Jjc.LLFFF(viewFindViewById2);
            } else {
                C500260Jjc.LJIILIIL(viewFindViewById2);
            }
            if (c1146800fws.LLILZIL) {
                str = "live_first_recharge_progress_yellow.png";
            } else {
                str = "live_first_recharge_progress_grey.png";
            }
            C1143680frq.LJ(viewFindViewById2, "tiktok_live_revenue_demand_5", str, ImageView.ScaleType.FIT_XY);
        }
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        return C786410Ut5.Td(C1834150xpV.LJ(C786410Ut5.ne(viewGroup.getContext())), R.layout.g2x, viewGroup, false);
    }
}
