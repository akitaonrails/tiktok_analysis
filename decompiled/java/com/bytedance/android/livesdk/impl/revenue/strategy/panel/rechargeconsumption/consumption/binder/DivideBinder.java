package com.bytedance.android.livesdk.impl.revenue.strategy.panel.rechargeconsumption.consumption.binder;

import X.C01GW;
import X.C1196320hEk;
import X.C1546210qL5;
import X.C1834150xpV;
import X.C224300tl;
import X.C371620Ehc;
import X.C452501pT;
import X.C687700QyG;
import X.C786410Ut5;
import X.C814420VxA;
import X.InterfaceC1146704e9;
import X.InterfaceC1891350zJl;
import X.InterfaceC665370Q7z;
import X.InterfaceC713360RyY;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.ViewModelStoreOwner;
import com.bytedance.android.livesdk.impl.revenue.strategy.panel.common.communication.CampaignPanelScope;
import com.bytedance.ies.powerlist.PowerCell;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AFwS205S0000000_17;
import kotlin.jvm.internal.AwS561S0100000_17;
import webcast.data.TouchPointColor;

/* JADX INFO: loaded from: classes18.dex */
public final class DivideBinder extends PowerCell<C224300tl> implements InterfaceC713360RyY, InterfaceC1146704e9 {
    public final C01GW LL = C452501pT.LIZIZ(AFwS205S0000000_17.get$arr$(58));
    public final C01GW LLILLJJLI = C452501pT.LIZIZ(new AwS561S0100000_17(this, 204));

    @Override // X.InterfaceC1146704e9
    public final void checkParentScope() {
        C687700QyG.LIZ(this, new Class[]{CampaignPanelScope.class});
    }

    @Override // X.InterfaceC1146704e9
    public final List getParentScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(CampaignPanelScope.class);
        return arrayList;
    }

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
        Drawable drawableLIZJ;
        C224300tl c224300tl = (C224300tl) interfaceC1891350zJl;
        View viewFindViewById = this.itemView.findViewById(R.id.bsx);
        TouchPointColor touchPointColor = c224300tl.LL;
        if (touchPointColor != null && (str = touchPointColor.light) != null && (drawableLIZJ = C371620Ehc.LIZJ(str)) != null) {
            viewFindViewById.setBackground(drawableLIZJ);
        }
        Double dValueOf = Double.valueOf(c224300tl.LLILLJJLI);
        if (dValueOf.doubleValue() > 0.0d) {
            double dDoubleValue = dValueOf.doubleValue();
            ViewGroup.LayoutParams layoutParams = viewFindViewById.getLayoutParams();
            C1546210qL5 c1546210qL5 = C1546210qL5.LIZ;
            Double dValueOf2 = Double.valueOf(dDoubleValue);
            c1546210qL5.getClass();
            layoutParams.height = C814420VxA.LIZIZ(C1546210qL5.LIZ(dValueOf2));
        }
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        return C786410Ut5.Td(C1834150xpV.LJ(C786410Ut5.ne(viewGroup.getContext())), R.layout.g2c, viewGroup, false);
    }
}
