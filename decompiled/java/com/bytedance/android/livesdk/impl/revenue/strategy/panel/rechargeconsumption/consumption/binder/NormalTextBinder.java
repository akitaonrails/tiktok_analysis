package com.bytedance.android.livesdk.impl.revenue.strategy.panel.rechargeconsumption.consumption.binder;

import X.C01GW;
import X.C1143850fs7;
import X.C1146870fwz;
import X.C1196320hEk;
import X.C1834150xpV;
import X.C452501pT;
import X.C478701th;
import X.C687700QyG;
import X.C786410Ut5;
import X.InterfaceC1146704e9;
import X.InterfaceC1891350zJl;
import X.InterfaceC665370Q7z;
import X.InterfaceC713360RyY;
import Y.ACListenerS120S0200000_17;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.lifecycle.ViewModelStoreOwner;
import com.bytedance.android.livesdk.impl.revenue.strategy.panel.common.communication.CampaignPanelScope;
import com.bytedance.ies.powerlist.PowerCell;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AFwS205S0000000_17;
import kotlin.jvm.internal.AwS561S0100000_17;
import webcast.data.TPClickableText;
import webcast.data.TPText;

/* JADX INFO: loaded from: classes18.dex */
public final class NormalTextBinder extends PowerCell<C478701th> implements InterfaceC713360RyY, InterfaceC1146704e9 {
    public final C01GW LL = C452501pT.LIZIZ(AFwS205S0000000_17.get$arr$(59));
    public final C01GW LLILLJJLI = C452501pT.LIZIZ(new AwS561S0100000_17(this, 205));

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
        FrameLayout.LayoutParams layoutParams;
        int i;
        Integer numValueOf;
        TPText tPText;
        C478701th c478701th = (C478701th) interfaceC1891350zJl;
        TextView textView = (TextView) this.itemView.findViewById(R.id.pbu);
        TPClickableText tPClickableText = c478701th.LLILLJJLI;
        SpannableStringBuilder spannableStringBuilderLIZLLL = null;
        if (tPClickableText != null && (tPText = tPClickableText.text) != null) {
            spannableStringBuilderLIZLLL = C1143850fs7.LIZLLL(C1143850fs7.LIZ, tPText);
        }
        textView.setText(spannableStringBuilderLIZLLL);
        FrameLayout frameLayout = (FrameLayout) this.itemView.findViewById(R.id.pbv);
        ViewGroup.LayoutParams layoutParams2 = frameLayout.getLayoutParams();
        if ((layoutParams2 instanceof FrameLayout.LayoutParams) && (layoutParams = (FrameLayout.LayoutParams) layoutParams2) != null) {
            TPClickableText tPClickableText2 = c478701th.LLILLJJLI;
            if (tPClickableText2 != null && (numValueOf = Integer.valueOf(tPClickableText2.alignment)) != null) {
                if (numValueOf.intValue() == 0) {
                    i = 8388611;
                } else if (numValueOf.intValue() == 1) {
                    i = 8388613;
                } else {
                    numValueOf.intValue();
                    i = 17;
                }
                layoutParams.gravity = i;
                C786410Ut5.a6(frameLayout, layoutParams);
            } else {
                i = 17;
                layoutParams.gravity = i;
                C786410Ut5.a6(frameLayout, layoutParams);
            }
        }
        C786410Ut5.T7(textView, new ACListenerS120S0200000_17(this, c478701th, 38));
        C1146870fwz.LIZIZ(this.itemView.findViewById(R.id.pbv), c478701th.LL);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        return C786410Ut5.Td(C1834150xpV.LJ(C786410Ut5.ne(viewGroup.getContext())), R.layout.g2d, viewGroup, false);
    }
}
