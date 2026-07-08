package com.ss.android.ugc.aweme.translation.service;

import X.AnonymousClass0157;
import X.AnonymousClass0175;
import X.C017D;
import X.C017J;
import X.C0S60;
import X.C0SD5;
import X.C1388190mED;
import X.C161N;
import X.C1668306g5;
import X.C19EG;
import X.C20702715zl;
import X.C207069161b;
import X.C265490Aap;
import X.C299170Bo3;
import X.C299180Bo4;
import X.C634500Oue;
import X.C634520Oug;
import X.C746760TRa;
import X.InterfaceC0241006d;
import android.content.DialogInterface;
import com.bytedance.poplayer.core.PopupManager;
import com.ss.android.ugc.aweme.cla.et.newet.DubbingInfoIconEvent;
import com.ss.android.ugc.aweme.cla.et.newet.DubbingToggleEvent;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class AutoDubbingServiceImpl implements IAutoDubbingService {
    @Override // com.ss.android.ugc.aweme.translation.service.IAutoDubbingService
    public final boolean LIZ(Aweme aweme) {
        boolean z;
        if (C299180Bo4.LIZIZ() && !C746760TRa.LIZ().LJI()) {
            z = false;
        } else {
            z = true;
        }
        if (C299180Bo4.LIZ()) {
            if (C299170Bo3.LIZIZ() || ((Number) C265490Aap.LIZ.getValue()).intValue() != 0) {
                C20702715zl.LIZ.getClass();
                if (C20702715zl.LIZ(aweme, false) && z && aweme != null && !C0SD5.LIZIZ(aweme)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x009d  */
    @Override // com.ss.android.ugc.aweme.translation.service.IAutoDubbingService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LIZIZ(com.ss.android.ugc.aweme.feed.model.Aweme r5) {
        /*
            r4 = this;
            boolean r0 = X.C299180Bo4.LIZ()
            r3 = 1
            if (r0 == 0) goto L17
            boolean r0 = X.C299180Bo4.LIZIZ()
            if (r0 == 0) goto L65
            com.ss.android.ugc.aweme.service.ICaptionKevaService r0 = X.C746760TRa.LIZ()
            boolean r0 = r0.LJI()
            if (r0 != 0) goto L65
        L17:
            boolean r0 = X.C299180Bo4.LIZ()
            if (r0 != 0) goto Lb0
            X.15zl r0 = X.C20702715zl.LIZ
            r0.getClass()
            java.lang.String r1 = X.C20703515zt.LJIIIZ(r5)
            if (r1 == 0) goto L63
            com.ss.android.ugc.aweme.translation.service.ITranslationLangKevaService r0 = X.C1839820xye.LIZ()
            X.15zM r0 = r0.LJIIIIZZ()
            r0.getClass()
            java.lang.String[] r0 = X.C20700315zN.LIZJ()
            if (r0 == 0) goto L63
            int r0 = X.C13LQ.LJJIJIIJI(r1, r0)
            if (r0 < 0) goto L61
            r0 = 1
        L40:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            if (r0 == 0) goto L63
            boolean r2 = r0.booleanValue()
        L4a:
            X.01GW r0 = X.C265500Aaq.LIZ
            java.lang.Object r0 = r0.getValue()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L9f
            boolean r0 = X.C20702715zl.LIZIZ(r5)
            if (r0 == 0) goto Lb0
            if (r2 == 0) goto Lb0
            return r3
        L61:
            r0 = 0
            goto L40
        L63:
            r2 = 0
            goto L4a
        L65:
            X.15zl r0 = X.C20702715zl.LIZ
            r0.getClass()
            java.lang.String r1 = X.C20703515zt.LJIIIZ(r5)
            if (r1 == 0) goto L9d
            com.ss.android.ugc.aweme.translation.service.ITranslationLangKevaService r0 = X.C1839820xye.LIZ()
            X.15zM r0 = r0.LJIIIIZZ()
            r0.getClass()
            java.lang.String[] r0 = X.C20700315zN.LIZJ()
            if (r0 == 0) goto L9d
            int r0 = X.C13LQ.LJJIJIIJI(r1, r0)
            if (r0 < 0) goto L9b
            r0 = 1
        L88:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            if (r0 == 0) goto L9d
            boolean r1 = r0.booleanValue()
        L92:
            boolean r0 = X.C20702715zl.LIZIZ(r5)
            if (r0 == 0) goto L17
            if (r1 == 0) goto L17
            return r3
        L9b:
            r0 = 0
            goto L88
        L9d:
            r1 = 0
            goto L92
        L9f:
            X.0oc7 r1 = X.C20702715zl.LJ(r5)
            if (r1 == 0) goto Lb0
            boolean r0 = r1.LIZLLL
            if (r0 != 0) goto Lad
            boolean r0 = r1.LIZJ
            if (r0 == 0) goto Lb0
        Lad:
            if (r2 == 0) goto Lb0
            return r3
        Lb0:
            r3 = 0
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.translation.service.AutoDubbingServiceImpl.LIZIZ(com.ss.android.ugc.aweme.feed.model.Aweme):boolean");
    }

    @Override // com.ss.android.ugc.aweme.translation.service.IAutoDubbingService
    public final boolean LIZLLL(Aweme aweme) {
        if (!LIZ(aweme)) {
            return false;
        }
        if ((!C299170Bo3.LIZIZ() && ((Number) C265490Aap.LIZ.getValue()).intValue() != 1) || C746760TRa.LIZ().LJJLL()) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0101  */
    @Override // com.ss.android.ugc.aweme.translation.service.IAutoDubbingService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJ(com.ss.android.ugc.aweme.feed.model.Aweme r11) {
        /*
            Method dump skipped, instruction units count: 267
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.translation.service.AutoDubbingServiceImpl.LJ(com.ss.android.ugc.aweme.feed.model.Aweme):void");
    }

    @Override // com.ss.android.ugc.aweme.translation.service.IAutoDubbingService
    public final void LJI(C19EG c19eg, DialogInterface.OnDismissListener onDismissListener) {
        C19EG c19egLIZIZ;
        if (c19eg != null && (c19egLIZIZ = C1388190mED.LIZIZ(c19eg)) != null) {
            PopupManager.LJIJ(new C634500Oue(c19egLIZIZ, onDismissListener), "feed_auto_dubbing_consumption_education", new C1668306g5("cla_feed_auto_dubbing_consumption_education"));
        }
    }

    @Override // com.ss.android.ugc.aweme.translation.service.IAutoDubbingService
    public final void LJII(C19EG c19eg, DialogInterface.OnDismissListener onDismissListener) {
        C19EG c19egLIZIZ;
        if (c19eg != null && (c19egLIZIZ = C1388190mED.LIZIZ(c19eg)) != null) {
            PopupManager.LJIJ(new C634520Oug(c19egLIZIZ, onDismissListener), "auto_dubbing_consumption_sheet", new C1668306g5("auto_dubbing_consumption_sheet"));
        }
    }

    @Override // com.ss.android.ugc.aweme.translation.service.IAutoDubbingService
    public final void LJFF(final String str, final String str2, final String str3) {
        C0S60 c0s60 = new C017D() { // from class: X.0S60
            @Override // X.C017D
            public final List<InterfaceC1282004zy> LIZ(List<? extends Class<? extends InterfaceC0241006d>> list) {
                return C13BV.INSTANCE;
            }
        };
        AnonymousClass0175 anonymousClass0175 = new AnonymousClass0175();
        final String strLLIIZ = C161N.LIZIZ.LLIIZ();
        C207069161b.LJ(DubbingInfoIconEvent.class, c0s60, anonymousClass0175, Collections.singletonList(new InterfaceC0241006d(str, str2, str3, strLLIIZ) { // from class: X.006r
            public final String LL;
            public final String LLILLJJLI;
            public final String LLILLL;
            public final String LLILZ;

            @Override // X.InterfaceC1282004zy
            public final boolean checkExtraParamKey() {
                return false;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C0255006r)) {
                    return false;
                }
                C0255006r c0255006r = (C0255006r) obj;
                return Intrinsics.LJFF(this.LL, c0255006r.LL) && Intrinsics.LJFF(this.LLILLJJLI, c0255006r.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c0255006r.LLILLL) && Intrinsics.LJFF(this.LLILZ, c0255006r.LLILZ);
            }

            public final int hashCode() {
                String str4 = this.LL;
                int iHashCode = (str4 == null ? 0 : str4.hashCode()) * 31;
                String str5 = this.LLILLJJLI;
                int iHashCode2 = (iHashCode + (str5 == null ? 0 : str5.hashCode())) * 31;
                String str6 = this.LLILLL;
                int iHashCode3 = (iHashCode2 + (str6 == null ? 0 : str6.hashCode())) * 31;
                String str7 = this.LLILZ;
                return iHashCode3 + (str7 != null ? str7.hashCode() : 0);
            }

            @Override // X.InterfaceC1282004zy
            public final Map<String, Object> keyParams() {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                linkedHashMap.put("enter_from", this.LL);
                linkedHashMap.put("action_type", this.LLILLJJLI);
                linkedHashMap.put("group_id", this.LLILLL);
                linkedHashMap.put("target_language", this.LLILZ);
                return linkedHashMap;
            }

            public final String toString() {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("DubbingInfoIconParam(enterFrom=");
                sbLIZ.append(this.LL);
                sbLIZ.append(", actionType=");
                sbLIZ.append(this.LLILLJJLI);
                sbLIZ.append(", groupId=");
                sbLIZ.append(this.LLILLL);
                sbLIZ.append(", targetLang=");
                sbLIZ.append(this.LLILZ);
                sbLIZ.append(')');
                return C2188811AlT.LIZIZ(sbLIZ);
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
                this.LLILLJJLI = str2;
                this.LLILLL = str3;
                this.LLILZ = strLLIIZ;
            }
        }), 16);
    }

    @Override // com.ss.android.ugc.aweme.translation.service.IAutoDubbingService
    public final void LIZJ(final String str, final String str2, final String str3, boolean z) {
        final String value;
        C017J c017j = new C017D() { // from class: X.017J
            @Override // X.C017D
            public final List<InterfaceC1282004zy> LIZ(List<? extends Class<? extends InterfaceC0241006d>> list) {
                return C13BV.INSTANCE;
            }
        };
        AnonymousClass0175 anonymousClass0175 = new AnonymousClass0175();
        if (z) {
            value = AnonymousClass0157.ON.getValue();
        } else {
            value = AnonymousClass0157.OFF.getValue();
        }
        final String strLLIIZ = C161N.LIZIZ.LLIIZ();
        C207069161b.LJ(DubbingToggleEvent.class, c017j, anonymousClass0175, Collections.singletonList(new InterfaceC0241006d(str, value, str2, str3, strLLIIZ) { // from class: X.006t
            public final String LL;
            public final String LLILLJJLI;
            public final String LLILLL;
            public final String LLILZ;
            public final String LLILZIL;

            @Override // X.InterfaceC1282004zy
            public final boolean checkExtraParamKey() {
                return false;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C0257006t)) {
                    return false;
                }
                C0257006t c0257006t = (C0257006t) obj;
                return Intrinsics.LJFF(this.LL, c0257006t.LL) && Intrinsics.LJFF(this.LLILLJJLI, c0257006t.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c0257006t.LLILLL) && Intrinsics.LJFF(this.LLILZ, c0257006t.LLILZ) && Intrinsics.LJFF(this.LLILZIL, c0257006t.LLILZIL);
            }

            public final int hashCode() {
                String str4 = this.LL;
                int iHashCode = (str4 == null ? 0 : str4.hashCode()) * 31;
                String str5 = this.LLILLJJLI;
                int iHashCode2 = (iHashCode + (str5 == null ? 0 : str5.hashCode())) * 31;
                String str6 = this.LLILLL;
                int iHashCode3 = (iHashCode2 + (str6 == null ? 0 : str6.hashCode())) * 31;
                String str7 = this.LLILZ;
                int iHashCode4 = (iHashCode3 + (str7 == null ? 0 : str7.hashCode())) * 31;
                String str8 = this.LLILZIL;
                return iHashCode4 + (str8 != null ? str8.hashCode() : 0);
            }

            @Override // X.InterfaceC1282004zy
            public final Map<String, Object> keyParams() {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                linkedHashMap.put("enter_from", this.LL);
                linkedHashMap.put("click_type", this.LLILLJJLI);
                linkedHashMap.put("action_type", this.LLILLL);
                linkedHashMap.put("group_id", this.LLILZ);
                linkedHashMap.put("target_language", this.LLILZIL);
                return linkedHashMap;
            }

            public final String toString() {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("DubbingToggleParam(enterFrom=");
                sbLIZ.append(this.LL);
                sbLIZ.append(", clickType=");
                sbLIZ.append(this.LLILLJJLI);
                sbLIZ.append(", actionType=");
                sbLIZ.append(this.LLILLL);
                sbLIZ.append(", groupId=");
                sbLIZ.append(this.LLILZ);
                sbLIZ.append(", targetLang=");
                sbLIZ.append(this.LLILZIL);
                sbLIZ.append(')');
                return C2188811AlT.LIZIZ(sbLIZ);
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
                this.LLILLJJLI = value;
                this.LLILLL = str2;
                this.LLILZ = str3;
                this.LLILZIL = strLLIIZ;
            }
        }), 16);
    }
}
