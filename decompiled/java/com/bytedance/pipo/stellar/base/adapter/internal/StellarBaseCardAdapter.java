package com.bytedance.pipo.stellar.base.adapter.internal;

import X.AbstractC1720840usk;
import X.C1720510usD;
import X.C1720520usE;
import X.C1720570usJ;
import X.C1720680usU;
import X.C1720760usc;
import X.C1720780use;
import X.C1723500ux2;
import X.C2188811AlT;
import X.EnumC1720670usT;
import X.InterfaceC1720550usH;
import X.InterfaceC1720700usW;
import X.ViewOnAttachStateChangeListenerC20604515jv;
import android.view.View;
import com.bytedance.pipo.stellar.base.adapter.StellarCardAdapter;
import com.bytedance.pipo.stellar.base.model.BackgroundDO;
import com.bytedance.pipo.stellar.base.model.CardDO;
import com.bytedance.pipo.stellar.base.model.MarginDO;
import com.bytedance.pipo.stellar.base.model.prop.StellarActionDO;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes27.dex */
public abstract class StellarBaseCardAdapter<T> extends StellarCardAdapter<C1720570usJ<T>> {
    public final AbstractC1720840usk<T> LLIZLLLIL;
    public final String LLJ;
    public final String LLJI;
    public final Function1<CardDO, T> LLJIJIL;
    public final String LLJILJIL;
    public final String LLJILJILJ;
    public final int LLJILLL;

    public StellarBaseCardAdapter() {
        throw null;
    }

    public void a6(C1720570usJ c1720570usJ) {
    }

    @Override // com.bytedance.pipo.stellar.base.adapter.StellarCardAdapter, com.bytedance.ies.powerlist.PowerCell
    public final int getLayoutId() {
        return this.LLIZLLLIL.LJ();
    }

    @Override // X.InterfaceC1720230url
    public final String LLFII() {
        return this.LLJ;
    }

    @Override // X.InterfaceC1720230url
    public final InterfaceC1720550usH J2(CardDO cardDO) {
        T tInvoke = this.LLJIJIL.invoke(cardDO);
        String str = this.LLJI;
        String str2 = this.LLJILJIL;
        String str3 = this.LLJILJILJ;
        C1720510usD c1720510usDX5 = X5(cardDO, tInvoke);
        int i = this.LLJILLL;
        String id = cardDO.getId();
        if (id == null) {
            id = "";
        }
        String sectionId = cardDO.getSectionId();
        Map<String, Object> sectionTrackingParams = cardDO.getSectionTrackingParams();
        String type = cardDO.getType();
        if (type != null) {
            str = type;
        }
        String height = cardDO.getHeight();
        if (height != null) {
            str3 = height;
        }
        String width = cardDO.getWidth();
        if (width != null) {
            str2 = width;
        }
        MarginDO margin = cardDO.getMargin();
        MarginDO cardPadding = cardDO.getCardPadding();
        StellarActionDO action = cardDO.getAction();
        BackgroundDO background = cardDO.getBackground();
        C1720680usU c1720680usU = EnumC1720670usT.Companion;
        String theme = cardDO.getTheme();
        c1720680usU.getClass();
        return new C1720570usJ(id, sectionId, sectionTrackingParams, str, str3, str2, margin, cardPadding, action, background, C1720680usU.LIZ(theme), c1720510usDX5, cardDO.getLayoutGravity(), i, tInvoke, cardDO.getCardData());
    }

    @Override // com.bytedance.pipo.stellar.base.adapter.StellarCardAdapter
    public final void U5(ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv) {
        viewOnAttachStateChangeListenerC20604515jv.LJIJ(new C1723500ux2(this.LLJILLL, getClass()));
    }

    public C1720760usc W5(C1720570usJ<T> c1720570usJ) {
        InterfaceC1720700usW interfaceC1720700usWR5 = R5();
        if (interfaceC1720700usWR5 != null) {
            return interfaceC1720700usWR5.Ka1();
        }
        return null;
    }

    @Override // com.bytedance.pipo.stellar.base.adapter.StellarCardAdapter
    public final void N5(View view, InterfaceC1720550usH interfaceC1720550usH) {
        C1720570usJ<T> c1720570usJ = (C1720570usJ) interfaceC1720550usH;
        this.LLIZLLLIL.LL = W5(c1720570usJ);
        a6(c1720570usJ);
        V5(view, c1720570usJ);
    }

    public void V5(View view, C1720570usJ<T> c1720570usJ) {
        T t = c1720570usJ.LLJJ;
        if (t != null) {
            this.LLIZLLLIL.LJFF(view, t, null);
        }
    }

    public C1720510usD X5(CardDO cardDO, T t) {
        return C1720520usE.LIZ(cardDO, null);
    }

    public StellarBaseCardAdapter(AbstractC1720840usk abstractC1720840usk, String str, String str2, Function1 function1, String str3, int i) {
        String str4;
        int iIntValue;
        str2 = (i & 4) != 0 ? str : str2;
        str3 = (i & 16) != 0 ? "-2" : str3;
        if ((i & 32) != 0) {
            str4 = "-2";
        } else {
            str4 = null;
        }
        this.LLIZLLLIL = abstractC1720840usk;
        this.LLJ = str;
        this.LLJI = str2;
        this.LLJIJIL = function1;
        this.LLJILJIL = str3;
        this.LLJILJILJ = str4;
        synchronized (C1720780use.LIZ) {
            String upperCase = str.toUpperCase(Locale.ROOT);
            LinkedHashMap<String, Integer> linkedHashMap = C1720780use.LIZIZ;
            Integer numValueOf = linkedHashMap.get(upperCase);
            if (numValueOf == null) {
                int i2 = C1720780use.LIZJ;
                if (i2 <= 60000) {
                    C1720780use.LIZJ = i2 + 1;
                    numValueOf = Integer.valueOf(i2);
                    linkedHashMap.put(upperCase, numValueOf);
                } else {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("Stellar dynamic content type exhausted, key=");
                    sbLIZ.append(upperCase);
                    String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                    strLIZIZ.toString();
                    throw new IllegalStateException(strLIZIZ);
                }
            }
            iIntValue = numValueOf.intValue();
        }
        this.LLJILLL = iIntValue;
    }
}
