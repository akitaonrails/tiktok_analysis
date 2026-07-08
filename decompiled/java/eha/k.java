package eha;

import X.C01GW;
import X.C1120604Zw;
import X.C1121904a9;
import X.C13LE;
import X.C1741890vQh;
import X.C1745300vWC;
import X.C1745680vWo;
import X.C1746460vY4;
import X.C2371409Qy;
import X.C452501pT;
import X.InterfaceC1164530gPT;
import androidx.fragment.app.FragmentManager;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.google.gson.s;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.InputItemDTO;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.Region;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.SelectDistrictEvent;
import com.ss.android.ugc.aweme.ecommerce.base.address.edit.AddressEditViewModel;
import java.lang.reflect.Type;
import java.util.List;
import kotlin.jvm.internal.AwS570S0100000_26;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes27.dex */
public final class k implements InterfaceC1164530gPT, p8b.c {
    public static final /* synthetic */ int LLJI = 0;
    public final C1745300vWC LL;
    public final FragmentManager LLILLJJLI;
    public final AddressEditViewModel LLILLL;
    public final boolean LLILZ;
    public C1745680vWo LLILZIL;
    public boolean LLILZLL;
    public final C01GW LLIZ = C452501pT.LIZIZ(new AwS570S0100000_26(this, 1233));
    public long LLIZLLLIL = -1;
    public boolean LLJ;

    /* JADX WARN: Removed duplicated region for block: B:10:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:15:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZJ() {
        /*
            r6 = this;
            r5 = 1
            r6.LLJ = r5
            long r0 = android.os.SystemClock.elapsedRealtime()
            r6.LLIZLLLIL = r0
            X.0vY4 r4 = X.C1746460vY4.LIZ
            X.0vWo r3 = r6.LLILZIL
            r2 = 0
            if (r3 == 0) goto L3c
            com.ss.android.ugc.aweme.ecommerce.base.address.dto.InputItemDTO r0 = r3.LIZ
            if (r0 == 0) goto L3c
            java.lang.String r1 = r0.key
        L16:
            java.lang.Object r2 = r3.LIZIZ
        L18:
            r4.getClass()
            r0 = 0
            X.C1746460vY4.LJIIIZ(r1, r2, r0, r5)
            com.ss.android.ugc.aweme.ecommerce.base.address.edit.AddressEditViewModel r0 = r6.LLILLL
            X.0vWU r5 = r0.LLJJIJIL
            X.0vWo r4 = r6.LLILZIL
            r5.getClass()
            com.ss.android.ugc.aweme.ecommerce.base.address.edit.AddressEditFragment r3 = com.ss.android.ugc.aweme.ecommerce.base.address.edit.AddressEditFragment.LLLII
            if (r3 == 0) goto L3b
            X.049c r2 = new X.049c
            r2.<init>()
            kotlin.jvm.internal.AwS392S0200000_26 r1 = new kotlin.jvm.internal.AwS392S0200000_26
            r0 = 235(0xeb, float:3.3E-43)
            r1.<init>(r5, r4, r0)
            X.C1748720vbi.LIZIZ(r3, r2, r1)
        L3b:
            return
        L3c:
            r1 = r2
            if (r3 == 0) goto L18
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: eha.k.LIZJ():void");
    }

    @Override // p8b.c
    public final String getViewName() {
        return "RegionSelectHelper";
    }

    public final void LIZLLL() {
        String str;
        Object obj;
        InputItemDTO inputItemDTO;
        if (this.LLIZLLLIL != -1) {
            C1746460vY4 c1746460vY4 = C1746460vY4.LIZ;
            C1745680vWo c1745680vWo = this.LLILZIL;
            if (c1745680vWo == null || (inputItemDTO = c1745680vWo.LIZ) == null) {
                str = null;
                if (c1745680vWo == null) {
                    obj = null;
                }
                c1746460vY4.getClass();
                C1746460vY4.LJIIIZ(str, obj, null, false);
                this.LLILLL.LLJJIJIL.LJI(this.LLILZIL, Long.valueOf(this.LLIZLLLIL), this.LLJ, null);
                this.LLIZLLLIL = -1L;
            }
            str = inputItemDTO.key;
            obj = c1745680vWo.LIZIZ;
            c1746460vY4.getClass();
            C1746460vY4.LJIIIZ(str, obj, null, false);
            this.LLILLL.LLJJIJIL.LJI(this.LLILZIL, Long.valueOf(this.LLIZLLLIL), this.LLJ, null);
            this.LLIZLLLIL = -1L;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x007d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJ() {
        /*
            Method dump skipped, instruction units count: 280
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: eha.k.LJ():void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:138:0x021c  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0236  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0240  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0284  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x02a9  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x02f7  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x0210 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:209:0x01ec A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00ea  */
    /* JADX WARN: Type inference failed for: r11v11, types: [X.13BV] */
    /* JADX WARN: Type inference failed for: r11v12, types: [java.util.List<com.ss.android.ugc.aweme.ecommerce.base.address.dto.Region>] */
    /* JADX WARN: Type inference failed for: r11v13, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r8v10, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v9, types: [com.ss.android.ugc.aweme.ecommerce.base.address.dto.Region] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZ(java.util.List<com.ss.android.ugc.aweme.ecommerce.base.address.dto.Region> r24, com.ss.android.ugc.aweme.ecommerce.base.widget.regionpicker.model.AddressBase r25) {
        /*
            Method dump skipped, instruction units count: 771
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: eha.k.LIZ(java.util.List, com.ss.android.ugc.aweme.ecommerce.base.widget.regionpicker.model.AddressBase):void");
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:101:0x02e4  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0223  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0239  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0241  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x02a7  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x02ba  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x02cf  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x02d9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZIZ(X.C1745680vWo r10, boolean r11) {
        /*
            Method dump skipped, instruction units count: 912
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: eha.k.LIZIZ(X.0vWo, boolean):void");
    }

    @Override // X.InterfaceC1164530gPT
    public final void onEvent(String str, String str2) {
        String str3;
        Type type;
        List<Region> list;
        InputItemDTO inputItemDTO;
        C1745680vWo c1745680vWo = this.LLILZIL;
        if (c1745680vWo != null && (inputItemDTO = c1745680vWo.LIZ) != null) {
            str3 = inputItemDTO.key;
        } else {
            str3 = null;
        }
        if (Intrinsics.LJFF(str3, "districts") && Intrinsics.LJFF(str, "ec_district_select")) {
            try {
                Gson gsonLJFF = C1741890vQh.LJFF();
                C1120604Zw.LIZ.getClass();
                C1121904a9 c1121904a9LIZIZ = C1120604Zw.LIZIZ();
                if (c1121904a9LIZIZ != null && c1121904a9LIZIZ.LJII) {
                    type = C2371409Qy.LIZJ(C13LE.LJII(SelectDistrictEvent.class));
                } else {
                    type = new TypeToken<SelectDistrictEvent>() { // from class: X.0vWw
                    }.getType();
                }
                Object objFromJson = GsonProtectorUtils.fromJson(gsonLJFF, str2, type);
                if (!(objFromJson instanceof SelectDistrictEvent)) {
                    objFromJson = null;
                }
                SelectDistrictEvent selectDistrictEvent = (SelectDistrictEvent) objFromJson;
                if (selectDistrictEvent != null && (list = selectDistrictEvent.regions) != null) {
                    LIZ(list, null);
                }
            } catch (s e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
    }

    public k(C1745300vWC c1745300vWC, FragmentManager fragmentManager, AddressEditViewModel addressEditViewModel, boolean z) {
        this.LL = c1745300vWC;
        this.LLILLJJLI = fragmentManager;
        this.LLILLL = addressEditViewModel;
        this.LLILZ = z;
    }
}
