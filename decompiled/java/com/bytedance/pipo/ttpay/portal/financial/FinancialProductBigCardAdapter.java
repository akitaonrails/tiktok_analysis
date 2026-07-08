package com.bytedance.pipo.ttpay.portal.financial;

import X.AbstractC1720900usq;
import X.C0N7J;
import X.C1227904rF;
import X.C1720510usD;
import X.C1720520usE;
import X.C1720580usK;
import X.C1720680usU;
import X.C1720790usf;
import X.EnumC1720670usT;
import X.InterfaceC1720550usH;
import X.InterfaceC1720620usO;
import com.bytedance.pipo.stellar.base.model.BackgroundDO;
import com.bytedance.pipo.stellar.base.model.CardDO;
import com.bytedance.pipo.stellar.base.model.MarginDO;
import com.bytedance.pipo.stellar.base.model.prop.StellarActionDO;
import com.bytedance.pipo.ttpay.model.FinancialProductDO;
import com.zhiliaoapp.musically.R;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes27.dex */
public final class FinancialProductBigCardAdapter extends BaseFinancialProductCardAdapter<C1720580usK> {
    public final C1720790usf LLIZLLLIL = new AbstractC1720900usq() { // from class: X.0usf
        @Override // X.AbstractC1720840usk
        public final int LJ() {
            return R.layout.i34;
        }
    };

    @Override // X.InterfaceC1720230url
    public final String LLFII() {
        return C0N7J.CARD_TYPE_FINANCIAL_PRODUCT_BIG.getValue();
    }

    @Override // com.bytedance.pipo.ttpay.portal.financial.BaseFinancialProductCardAdapter
    public final AbstractC1720900usq V5() {
        return this.LLIZLLLIL;
    }

    @Override // X.InterfaceC1720230url
    public final InterfaceC1720550usH J2(CardDO cardDO) {
        C1227904rF c1227904rF = C1227904rF.LIZ;
        String cardData = cardDO.getCardData();
        c1227904rF.getClass();
        final FinancialProductDO financialProductDO = (FinancialProductDO) C1227904rF.LIZIZ(cardData, FinancialProductDO.class);
        final String id = cardDO.getId();
        if (id == null) {
            id = "";
        }
        final String sectionId = cardDO.getSectionId();
        final Map<String, Object> sectionTrackingParams = cardDO.getSectionTrackingParams();
        final String type = cardDO.getType();
        if (type == null) {
            type = C0N7J.CARD_TYPE_FINANCIAL_PRODUCT_BIG.getValue();
        }
        final String height = cardDO.getHeight();
        final String str = "-2";
        if (height == null) {
            height = "-2";
        }
        String width = cardDO.getWidth();
        if (width != null) {
            str = width;
        }
        final MarginDO margin = cardDO.getMargin();
        final MarginDO cardPadding = cardDO.getCardPadding();
        final StellarActionDO action = cardDO.getAction();
        final BackgroundDO background = cardDO.getBackground();
        C1720680usU c1720680usU = EnumC1720670usT.Companion;
        String theme = cardDO.getTheme();
        c1720680usU.getClass();
        final EnumC1720670usT enumC1720670usTLIZ = C1720680usU.LIZ(theme);
        final C1720510usD c1720510usDLIZ = C1720520usE.LIZ(cardDO, null);
        final String layoutGravity = cardDO.getLayoutGravity();
        return new InterfaceC1720620usO(financialProductDO, id, sectionId, sectionTrackingParams, type, height, str, margin, cardPadding, action, background, c1720510usDLIZ, enumC1720670usTLIZ, layoutGravity) { // from class: X.0usK
            public final FinancialProductDO LL;
            public final String LLILLJJLI;
            public final String LLILLL;
            public final Map<String, Object> LLILZ;
            public final String LLILZIL;
            public final String LLILZLL;
            public final String LLIZ;
            public final MarginDO LLIZLLLIL;
            public final MarginDO LLJ;
            public final StellarActionDO LLJI;
            public final BackgroundDO LLJIJIL;
            public final C1720510usD LLJILJIL;
            public final EnumC1720670usT LLJILJILJ;
            public final String LLJILLL;

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C1720580usK)) {
                    return false;
                }
                C1720580usK c1720580usK = (C1720580usK) obj;
                return Intrinsics.LJFF(this.LL, c1720580usK.LL) && Intrinsics.LJFF(this.LLILLJJLI, c1720580usK.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c1720580usK.LLILLL) && Intrinsics.LJFF(this.LLILZ, c1720580usK.LLILZ) && Intrinsics.LJFF(this.LLILZIL, c1720580usK.LLILZIL) && Intrinsics.LJFF(this.LLILZLL, c1720580usK.LLILZLL) && Intrinsics.LJFF(this.LLIZ, c1720580usK.LLIZ) && Intrinsics.LJFF(this.LLIZLLLIL, c1720580usK.LLIZLLLIL) && Intrinsics.LJFF(this.LLJ, c1720580usK.LLJ) && Intrinsics.LJFF(this.LLJI, c1720580usK.LLJI) && Intrinsics.LJFF(this.LLJIJIL, c1720580usK.LLJIJIL) && Intrinsics.LJFF(this.LLJILJIL, c1720580usK.LLJILJIL) && this.LLJILJILJ == c1720580usK.LLJILJILJ && Intrinsics.LJFF(this.LLJILLL, c1720580usK.LLJILLL);
            }

            @Override // X.InterfaceC1891350zJl
            public final Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
                return null;
            }

            public final int hashCode() {
                FinancialProductDO financialProductDO2 = this.LL;
                int iHashCode = (((financialProductDO2 == null ? 0 : financialProductDO2.hashCode()) * 31) + this.LLILLJJLI.hashCode()) * 31;
                String str2 = this.LLILLL;
                int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
                Map<String, Object> map = this.LLILZ;
                int iHashCode3 = (((((((iHashCode2 + (map == null ? 0 : map.hashCode())) * 31) + this.LLILZIL.hashCode()) * 31) + this.LLILZLL.hashCode()) * 31) + this.LLIZ.hashCode()) * 31;
                MarginDO marginDO = this.LLIZLLLIL;
                int iHashCode4 = (iHashCode3 + (marginDO == null ? 0 : marginDO.hashCode())) * 31;
                MarginDO marginDO2 = this.LLJ;
                int iHashCode5 = (iHashCode4 + (marginDO2 == null ? 0 : marginDO2.hashCode())) * 31;
                StellarActionDO stellarActionDO = this.LLJI;
                int iHashCode6 = (iHashCode5 + (stellarActionDO == null ? 0 : stellarActionDO.hashCode())) * 31;
                BackgroundDO backgroundDO = this.LLJIJIL;
                int iHashCode7 = (((((iHashCode6 + (backgroundDO == null ? 0 : backgroundDO.hashCode())) * 31) + this.LLJILJIL.hashCode()) * 31) + this.LLJILJILJ.hashCode()) * 31;
                String str3 = this.LLJILLL;
                return iHashCode7 + (str3 != null ? str3.hashCode() : 0);
            }

            public final String toString() {
                return "FinancialProductBigWidget(data=" + this.LL + ", id=" + this.LLILLJJLI + ", sectionId=" + this.LLILLL + ", sectionTrackingParams=" + this.LLILZ + ", type=" + this.LLILZIL + ", height=" + this.LLILZLL + ", width=" + this.LLIZ + ", margin=" + this.LLIZLLLIL + ", padding=" + this.LLJ + ", action=" + this.LLJI + ", background=" + this.LLJIJIL + ", trackingConfig=" + this.LLJILJIL + ", theme=" + this.LLJILJILJ + ", layoutGravity=" + this.LLJILLL + ')';
            }

            @Override // X.InterfaceC1720550usH
            public final BackgroundDO LJFF() {
                return this.LLJIJIL;
            }

            @Override // X.InterfaceC1720550usH
            public final MarginDO LJIJJ() {
                return this.LLIZLLLIL;
            }

            @Override // X.InterfaceC1720550usH
            public final MarginDO LJJI() {
                return this.LLJ;
            }

            @Override // X.InterfaceC1720550usH
            public final String LLIIIZ() {
                return this.LLJILLL;
            }

            @Override // X.InterfaceC1720550usH
            public final C1720510usD LLILZLL() {
                return this.LLJILJIL;
            }

            @Override // X.InterfaceC1720550usH
            public final String LLJJIJIL() {
                return this.LLILLL;
            }

            @Override // X.InterfaceC1720550usH
            public final Map<String, Object> LLL() {
                return this.LLILZ;
            }

            @Override // X.InterfaceC1720550usH
            public final StellarActionDO getAction() {
                return this.LLJI;
            }

            @Override // X.InterfaceC1720620usO
            public final FinancialProductDO getData() {
                return this.LL;
            }

            @Override // X.InterfaceC1720550usH
            public final String getHeight() {
                return this.LLILZLL;
            }

            @Override // X.InterfaceC1720550usH
            public final String getId() {
                return this.LLILLJJLI;
            }

            @Override // X.InterfaceC1720550usH
            public final EnumC1720670usT getTheme() {
                return this.LLJILJILJ;
            }

            @Override // X.InterfaceC1720550usH
            public final String getType() {
                return this.LLILZIL;
            }

            @Override // X.InterfaceC1720550usH
            public final String getWidth() {
                return this.LLIZ;
            }

            @Override // X.InterfaceC1891350zJl
            public final boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
                return C1720540usG.LIZ(this, interfaceC1891350zJl);
            }

            @Override // X.InterfaceC1891350zJl
            public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
                return C1720540usG.LIZIZ(this, interfaceC1891350zJl);
            }

            {
                this.LL = financialProductDO;
                this.LLILLJJLI = id;
                this.LLILLL = sectionId;
                this.LLILZ = sectionTrackingParams;
                this.LLILZIL = type;
                this.LLILZLL = height;
                this.LLIZ = str;
                this.LLIZLLLIL = margin;
                this.LLJ = cardPadding;
                this.LLJI = action;
                this.LLJIJIL = background;
                this.LLJILJIL = c1720510usDLIZ;
                this.LLJILJILJ = enumC1720670usTLIZ;
                this.LLJILLL = layoutGravity;
            }
        };
    }
}
