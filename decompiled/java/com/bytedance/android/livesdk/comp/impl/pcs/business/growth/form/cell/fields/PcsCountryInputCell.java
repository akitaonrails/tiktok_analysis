package com.bytedance.android.livesdk.comp.impl.pcs.business.growth.form.cell.fields;

import X.C0TSA;
import X.C1161920gLG;
import X.C1388190mED;
import X.C1727330v3D;
import X.C1727880v46;
import X.C1727900v48;
import X.C1727970v4F;
import X.C1727980v4G;
import X.C1749190vcT;
import X.C19EG;
import X.C786410Ut5;
import Y.ACListenerS160S0100000_26;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.livesdk.comp.api.pcs.data.setting.form.LivePcsFormUxOptSetting;
import com.bytedance.android.livesdkapi.host.IHostPCS;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.u;

/* JADX INFO: loaded from: classes27.dex */
public final class PcsCountryInputCell extends BasePcsInputCell<C1727330v3D> {
    public C1727880v46 LLILZIL;

    @Override // com.bytedance.android.livesdk.comp.impl.pcs.business.growth.form.cell.fields.BasePcsInputCell
    public final void U5() {
        C1727880v46 c1727880v46 = this.LLILZIL;
        if (c1727880v46 != null) {
            c1727880v46.setInvalid(this.itemView.getContext());
        }
    }

    @Override // com.bytedance.android.livesdk.comp.impl.pcs.business.growth.form.cell.fields.BasePcsInputCell
    public final void V5() {
        C1727880v46 c1727880v46 = this.LLILZIL;
        if (c1727880v46 != null) {
            c1727880v46.setValid(this.itemView.getContext());
        }
    }

    @Override // com.bytedance.android.livesdk.comp.impl.pcs.business.growth.form.cell.fields.BasePcsInputCell, com.bytedance.ies.powerlist.PowerCell
    /* JADX INFO: renamed from: X5, reason: merged with bridge method [inline-methods] */
    public final void onBindItemView(C1727330v3D c1727330v3D) {
        boolean z;
        List<C1727970v4F> listZt2;
        C1727970v4F next;
        String str;
        FragmentManager supportFragmentManager;
        LifecycleOwner lifecycleOwner;
        FragmentManager fragmentManager;
        super.onBindItemView(c1727330v3D);
        final C1727880v46 c1727880v46 = this.LLILZIL;
        if (c1727880v46 != null) {
            String str2 = c1727330v3D.LLILLJJLI.LIZ;
            C19EG c19egLIZIZ = C1388190mED.LIZIZ(this.itemView.getContext());
            if (c19egLIZIZ != null) {
                supportFragmentManager = c19egLIZIZ.getSupportFragmentManager();
            } else {
                supportFragmentManager = null;
            }
            c1727880v46.LLILZIL = str2;
            c1727880v46.LLILLJJLI = supportFragmentManager;
            c1727880v46.LLILLL = this;
            C786410Ut5.X8(c1727880v46.LL, new ACListenerS160S0100000_26(c1727880v46, 49));
            final String str3 = c1727880v46.LLILZIL;
            if (str3 != null && (lifecycleOwner = c1727880v46.LLILLL) != null && (fragmentManager = c1727880v46.LLILLJJLI) != null) {
                fragmentManager.LLIIIJ(str3, lifecycleOwner, new C0TSA() { // from class: X.0v47
                    @Override // X.C0TSA
                    public final void LIZ(Bundle bundle, String str4) {
                        String string;
                        if (!Intrinsics.LJFF(str4, str3) || (string = bundle.getString("country")) == null) {
                            return;
                        }
                        c1727880v46.setCountry(string);
                    }
                });
            }
        }
        C1727880v46 c1727880v462 = this.LLILZIL;
        if (c1727880v462 != null) {
            c1727880v462.setPlaceholder(c1727330v3D.LLILLJJLI.LJI);
        }
        C1749190vcT c1749190vcT = this.LLILLJJLI;
        if (c1749190vcT != null) {
            C1727980v4G.LIZ(c1749190vcT, this.LLILZIL, c1727330v3D.LLILLJJLI);
        }
        String str4 = (String) ((LinkedHashMap) P5().LLILZ).get(c1727330v3D.LLILLJJLI.LIZ);
        if (str4 == null) {
            str4 = c1727330v3D.LLILLJJLI.LJ;
        }
        if (str4.length() > 0) {
            z = true;
        } else {
            z = false;
        }
        String str5 = "";
        if (z && (listZt2 = ((IHostPCS) C1161920gLG.LIZJ(IHostPCS.class)).Zt2(this.itemView.getContext())) != null) {
            Iterator<C1727970v4F> it2 = listZt2.iterator();
            while (true) {
                if (it2.hasNext()) {
                    next = it2.next();
                    C1727970v4F c1727970v4F = next;
                    if (u.LJIJI(c1727970v4F.LIZ, str4, true) || u.LJIJI(c1727970v4F.LIZJ, str4, true)) {
                        break;
                    }
                } else {
                    next = null;
                    break;
                }
            }
            C1727970v4F c1727970v4F2 = next;
            if (c1727970v4F2 != null && (str = c1727970v4F2.LIZ) != null) {
                str5 = str;
            }
        }
        C1727880v46 c1727880v463 = this.LLILZIL;
        if (c1727880v463 != null) {
            c1727880v463.setCountry(str5);
        }
        if (LivePcsFormUxOptSetting.INSTANCE.isAutofillEnabled()) {
            String[] strArr = c1727330v3D.LLILLJJLI.LJIIIZ;
            if (strArr == null) {
                strArr = new String[0];
            }
            C1727880v46 c1727880v464 = this.LLILZIL;
            if (c1727880v464 != null) {
                String[] strArr2 = (String[]) Arrays.copyOf(strArr, strArr.length);
                if (Build.VERSION.SDK_INT >= 26) {
                    c1727880v464.setAutofillHints((String[]) Arrays.copyOf(strArr2, strArr2.length));
                    c1727880v464.setImportantForAutofill(1);
                }
            }
        }
    }

    @Override // com.bytedance.android.livesdk.comp.impl.pcs.business.growth.form.cell.fields.BasePcsInputCell, com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        View viewOnCreateItemView = super.onCreateItemView(viewGroup);
        C1727880v46 c1727880v46 = new C1727880v46(viewGroup.getContext());
        this.LLILZIL = c1727880v46;
        c1727880v46.setOnCountrySelected(new C1727900v48(this));
        return viewOnCreateItemView;
    }
}
