package com.ss.android.ugc.aweme.captionsheet;

import X.AnonymousClass0158;
import X.AnonymousClass0159;
import X.AnonymousClass0175;
import X.C01GW;
import X.C0OM1;
import X.C1308910kAL;
import X.C13LQ;
import X.C161N;
import X.C1839820xye;
import X.C19292910dr;
import X.C19319810iC;
import X.C20693015yC;
import X.C20698415z4;
import X.C20700315zN;
import X.C207069161b;
import X.C2188811AlT;
import X.C452501pT;
import X.C746760TRa;
import X.C786410Ut5;
import X.EnumC1390800mIQ;
import X.EnumC2209071Bd3;
import X.InterfaceC0241006d;
import X.InterfaceC20698115z1;
import X.InterfaceC665370Q7z;
import X.ViewOnAttachStateChangeListenerC20604515jv;
import Y.ACListenerS165S0100000_31;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.ss.android.ugc.aweme.cla.et.newet.SecondaryTranslationSettingShowEvent;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.zhiliaoapp.musically.R;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AwS575S0100000_31;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes32.dex */
public final class CaptionSecondaryPanelFragment extends BaseCaptionSheetFragment {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiYtOTs6Jys/ISHELIOSo2PGsPKD8nISoiGiowJysoKD0qGCQiLCMVOiQrJCo9PA==";
    public ViewOnAttachStateChangeListenerC20604515jv LLIZLLLIL;
    public final C01GW LLJ;
    public C20693015yC LLJI;
    public C19292910dr LLJIJIL;

    public CaptionSecondaryPanelFragment() {
        this(0);
    }

    @Override // com.ss.android.ugc.aweme.captionsheet.BaseCaptionSheetFragment
    public final boolean RR() {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.captionsheet.BaseCaptionSheetFragment
    public final String getTitle() {
        return (String) this.LLJ.getValue();
    }

    @Override // com.ss.android.ugc.aweme.captionsheet.BaseCaptionSheetFragment
    public final C0OM1 Sn() {
        Integer numLIZJ;
        C0OM1 c0om1Sn = super.Sn();
        c0om1Sn.LIZLLL = true;
        Context context = getContext();
        if (context != null && (numLIZJ = C1308910kAL.LIZJ(R.attr.zp, context)) != null) {
            c0om1Sn.LIZJ(numLIZJ.intValue());
        }
        c0om1Sn.LIZLLL = false;
        return c0om1Sn;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.LLIZLLLIL = null;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        C20693015yC c20693015yC = this.LLJI;
        if (c20693015yC != null) {
            c20693015yC.LJ();
        }
    }

    @Override // com.ss.android.ugc.aweme.captionsheet.BaseCaptionSheetFragment
    public final C20693015yC SR() {
        return this.LLJI;
    }

    public CaptionSecondaryPanelFragment(int i) {
        this.LLJ = C452501pT.LIZIZ(new AwS575S0100000_31(this, 1582));
    }

    @Override // androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        super.onAttach(context);
        context.setTheme(R.style.my);
    }

    @Override // com.ss.android.ugc.aweme.captionsheet.BaseCaptionSheetFragment
    public final View VR(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return C786410Ut5.Td(layoutInflater, R.layout.adf, viewGroup, false);
    }

    @Override // com.ss.android.ugc.aweme.captionsheet.BaseCaptionSheetFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        String aid;
        final String strLJJJ;
        AnonymousClass0158 anonymousClass0158;
        AnonymousClass0159 anonymousClass0159;
        InterfaceC665370Q7z interfaceC665370Q7zRx;
        InterfaceC20698115z1 interfaceC20698115z1;
        EnumC1390800mIQ enterMethod;
        String value;
        InterfaceC20698115z1 interfaceC20698115z12;
        InterfaceC20698115z1 interfaceC20698115z13;
        Aweme aweme;
        super.onViewCreated(view, bundle);
        View viewFindViewById = this.LLIZLLLIL;
        if (viewFindViewById == null) {
            View view2 = getView();
            if (view2 != null) {
                viewFindViewById = view2.findViewById(R.id.rn0);
            } else {
                viewFindViewById = null;
            }
            this.LLIZLLLIL = (ViewOnAttachStateChangeListenerC20604515jv) viewFindViewById;
        }
        this.LLJI = new C20693015yC((ViewOnAttachStateChangeListenerC20604515jv) viewFindViewById);
        EnumC2209071Bd3 enumC2209071Bd3LJJLIIIJJI = C746760TRa.LIZ().LJJLIIIJJI();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("initStickerTranslationToggleRow: toggleSetting=");
        sbLIZ.append(enumC2209071Bd3LJJLIIIJJI);
        sbLIZ.append(", aid=");
        C20698415z4 c20698415z4 = this.LLILLJJLI;
        if (c20698415z4 != null && (interfaceC20698115z13 = c20698415z4.LIZ) != null && (aweme = interfaceC20698115z13.getAweme()) != null) {
            aid = aweme.getAid();
        } else {
            aid = null;
        }
        sbLIZ.append(aid);
        C2188811AlT.LIZIZ(sbLIZ);
        C20693015yC c20693015yC = this.LLJI;
        if (c20693015yC != null) {
            C19292910dr c19292910dr = new C19292910dr(new C19319810iC(enumC2209071Bd3LJJLIIIJJI.isOn(), getString(2131828823), new ACListenerS165S0100000_31(this, 231), false, null, null, null, null, false, false, false, null, 131064));
            this.LLJIJIL = c19292910dr;
            c20693015yC.LIZ(c19292910dr);
        }
        final String strLLIIZ = C161N.LIZIZ.LLIIZ();
        C1839820xye.LIZ().LJIIIIZZ().getClass();
        String[] strArrLIZJ = C20700315zN.LIZJ();
        final String str = "";
        if (strArrLIZJ == null || (strLJJJ = C13LQ.LJJJ(strArrLIZJ, ", ", null, null, null, 62)) == null) {
            strLJJJ = "";
        }
        if (C746760TRa.LIZ().LJJJJI()) {
            anonymousClass0158 = AnonymousClass0158.ON;
        } else {
            anonymousClass0158 = AnonymousClass0158.OFF;
        }
        if (C746760TRa.LIZ().LJLILLLLZI()) {
            anonymousClass0159 = AnonymousClass0159.ON;
        } else {
            anonymousClass0159 = AnonymousClass0159.OFF;
        }
        C20698415z4 c20698415z42 = this.LLILLJJLI;
        if (c20698415z42 != null && (interfaceC20698115z12 = c20698415z42.LIZ) != null) {
            interfaceC665370Q7zRx = interfaceC20698115z12.rx();
        } else {
            interfaceC665370Q7zRx = null;
        }
        AnonymousClass0175 anonymousClass0175 = new AnonymousClass0175();
        C20698415z4 c20698415z43 = this.LLILLJJLI;
        if (c20698415z43 != null && (interfaceC20698115z1 = c20698415z43.LIZ) != null && (enterMethod = interfaceC20698115z1.getEnterMethod()) != null && (value = enterMethod.getValue()) != null) {
            str = value;
        }
        final String value2 = anonymousClass0158.getValue();
        final String value3 = anonymousClass0159.getValue();
        C207069161b.LIZJ(SecondaryTranslationSettingShowEvent.class, interfaceC665370Q7zRx, anonymousClass0175, Collections.singletonList(new InterfaceC0241006d(str, strLLIIZ, strLJJJ, value2, value3) { // from class: X.014D
            public final String LL;
            public final String LLILLJJLI;
            public final String LLILLL;
            public final int LLILZ = 1;
            public final String LLILZIL;
            public final String LLILZLL;

            @Override // X.InterfaceC1282004zy
            public final boolean checkExtraParamKey() {
                return false;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C014D)) {
                    return false;
                }
                C014D c014d = (C014D) obj;
                return Intrinsics.LJFF(this.LL, c014d.LL) && Intrinsics.LJFF(this.LLILLJJLI, c014d.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c014d.LLILLL) && this.LLILZ == c014d.LLILZ && Intrinsics.LJFF(this.LLILZIL, c014d.LLILZIL) && Intrinsics.LJFF(this.LLILZLL, c014d.LLILZLL);
            }

            public final int hashCode() {
                return (((((((((this.LL.hashCode() * 31) + this.LLILLJJLI.hashCode()) * 31) + this.LLILLL.hashCode()) * 31) + this.LLILZ) * 31) + this.LLILZIL.hashCode()) * 31) + this.LLILZLL.hashCode();
            }

            @Override // X.InterfaceC1282004zy
            public final Map<String, Object> keyParams() {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                linkedHashMap.put("enter_method", this.LL);
                linkedHashMap.put("target_lang", this.LLILLJJLI);
                linkedHashMap.put("not_translate_langs", this.LLILLL);
                linkedHashMap.put("more_translation_options", Integer.valueOf(this.LLILZ));
                linkedHashMap.put("translate_sticker_status", this.LLILZIL);
                linkedHashMap.put("translate_title_status", this.LLILZLL);
                return linkedHashMap;
            }

            public final String toString() {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("TranslationPanelStatusParams(enterMethod=");
                sbLIZ2.append(this.LL);
                sbLIZ2.append(", targetLang=");
                sbLIZ2.append(this.LLILLJJLI);
                sbLIZ2.append(", notTranslateLangs=");
                sbLIZ2.append(this.LLILLL);
                sbLIZ2.append(", moreTranslationOptions=");
                sbLIZ2.append(this.LLILZ);
                sbLIZ2.append(", translateStickerStatus=");
                sbLIZ2.append(this.LLILZIL);
                sbLIZ2.append(", translateTitleStatus=");
                sbLIZ2.append(this.LLILZLL);
                sbLIZ2.append(')');
                return C2188811AlT.LIZIZ(sbLIZ2);
            }

            @Override // X.InterfaceC1282004zy
            public final Map<String, Object> filteredParams() {
                return keyParams();
            }

            @Override // X.InterfaceC1282004zy
            public final Map<String, Object> getExtraParam() {
                return C2097608Jq.LJ();
            }

            {
                this.LL = str;
                this.LLILLJJLI = strLLIIZ;
                this.LLILLL = strLJJJ;
                this.LLILZIL = value2;
                this.LLILZLL = value3;
            }
        }));
    }
}
