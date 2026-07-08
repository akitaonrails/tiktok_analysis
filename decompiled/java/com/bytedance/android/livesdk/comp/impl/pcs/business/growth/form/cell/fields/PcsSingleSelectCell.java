package com.bytedance.android.livesdk.comp.impl.pcs.business.growth.form.cell.fields;

import X.C0HWQ;
import X.C1391600mJi;
import X.C13BV;
import X.C15438062q;
import X.C1727140v2u;
import X.C1727350v3F;
import X.C1727850v43;
import X.C1727990v4H;
import X.C1749140vcO;
import X.C20736316Cj;
import X.C384050F3z;
import X.C418440Gaw;
import X.C443090HZb;
import X.C786410Ut5;
import X.C814420VxA;
import X.EnumC1235690iGF;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.android.livesdk.comp.api.pcs.data.setting.form.LivePcsFormUxOptSetting;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes27.dex */
public final class PcsSingleSelectCell extends BasePcsInputCell<C1727350v3F> {
    public C1749140vcO LLILZIL;

    @Override // com.bytedance.android.livesdk.comp.impl.pcs.business.growth.form.cell.fields.BasePcsInputCell
    public final void I5() {
        if (!LivePcsFormUxOptSetting.INSTANCE.isUxOptEnabled()) {
            super.I5();
        } else {
            C1727140v2u.LIZ(this.itemView);
            a6(this.itemView.getContext());
        }
    }

    @Override // com.bytedance.android.livesdk.comp.impl.pcs.business.growth.form.cell.fields.BasePcsInputCell
    public final void U5() {
        C1749140vcO c1749140vcO = this.LLILZIL;
        if (c1749140vcO != null) {
            C384050F3z c384050F3z = new C384050F3z();
            c384050F3z.LIZIZ = Integer.valueOf(R.attr.ezk);
            c384050F3z.LIZJ = Float.valueOf(24.0f);
            c384050F3z.LIZLLL = Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(2)));
            c384050F3z.LJ = Integer.valueOf(C20736316Cj.LIZIZ(R.attr.exz, this.itemView.getContext()));
            c1749140vcO.setBackground(c384050F3z.LIZ(this.itemView.getContext()));
        }
    }

    @Override // com.bytedance.android.livesdk.comp.impl.pcs.business.growth.form.cell.fields.BasePcsInputCell
    public final void V5() {
        C1749140vcO c1749140vcO = this.LLILZIL;
        if (c1749140vcO != null) {
            C384050F3z c384050F3z = new C384050F3z();
            c384050F3z.LIZIZ = Integer.valueOf(R.attr.ey_);
            c384050F3z.LIZJ = Float.valueOf(24.0f);
            c1749140vcO.setBackground(c384050F3z.LIZ(this.itemView.getContext()));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x004e  */
    @Override // com.bytedance.android.livesdk.comp.impl.pcs.business.growth.form.cell.fields.BasePcsInputCell, com.bytedance.ies.powerlist.PowerCell
    /* JADX INFO: renamed from: X5, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onBindItemView(X.C1727350v3F r5) {
        /*
            r4 = this;
            super.onBindItemView(r5)
            com.bytedance.android.livesdk.comp.impl.pcs.business.growth.form.vm.PcsFormVm r0 = r4.P5()
            java.util.Map<java.lang.String, java.lang.String> r1 = r0.LLILZ
            X.0v4H r0 = r5.LLILLJJLI
            java.lang.String r0 = r0.LIZ
            java.util.LinkedHashMap r1 = (java.util.LinkedHashMap) r1
            java.lang.Object r3 = r1.get(r0)
            java.lang.String r3 = (java.lang.String) r3
            if (r3 != 0) goto L30
            X.0v4H r0 = r5.LLILLJJLI
            java.util.List<java.lang.String> r2 = r0.LJIIIIZZ
            java.lang.String r1 = ""
            if (r2 == 0) goto L4e
            java.lang.String r3 = r0.LJ
            int r0 = r3.length()
            if (r0 == 0) goto L4e
            boolean r0 = r2.contains(r3)
            if (r0 == 0) goto L4e
            r4.T5(r3)
        L30:
            X.0vcO r1 = r4.LLILZIL
            if (r1 == 0) goto L40
            X.0v4H r0 = r4.LLILLL
            if (r0 == 0) goto L4c
            java.lang.String r0 = r0.LJI
        L3a:
            r1.setPlaceholderText(r0)
            r1.setText(r3)
        L40:
            X.0vcT r2 = r4.LLILLJJLI
            if (r2 == 0) goto L4b
            X.0vcO r1 = r4.LLILZIL
            X.0v4H r0 = r5.LLILLJJLI
            X.C1727980v4G.LIZ(r2, r1, r0)
        L4b:
            return
        L4c:
            r0 = 0
            goto L3a
        L4e:
            r3 = r1
            goto L30
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.comp.impl.pcs.business.growth.form.cell.fields.PcsSingleSelectCell.onBindItemView(X.0v3F):void");
    }

    public final void a6(Context context) {
        String str;
        C1727990v4H c1727990v4H = this.LLILLL;
        if (c1727990v4H != null && (str = c1727990v4H.LIZ) != null) {
            List list = c1727990v4H.LJIIIIZZ;
            if (list == null) {
                list = C13BV.INSTANCE;
            }
            Object obj = ((LinkedHashMap) P5().LLILZ).get(str);
            C1727140v2u.LIZ(this.itemView);
            ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
            Iterator it2 = list.iterator();
            while (true) {
                int i = 0;
                if (!it2.hasNext()) {
                    break;
                }
                String str2 = (String) it2.next();
                if (Intrinsics.LJFF(str2, obj)) {
                    i = R.raw.icon_tick_fill_small;
                }
                arrayList.add(new C443090HZb(str2, new C1727850v43(this, str2), 0, null, i, null, 0, false, false, null, 1004));
            }
            C1749140vcO c1749140vcO = this.LLILZIL;
            if (c1749140vcO != null) {
                C0HWQ c0hwq = new C0HWQ(context);
                c0hwq.LJIIL(Collections.singletonList(arrayList));
                c0hwq.LLIZLLLIL = c1749140vcO.getWidth();
                c0hwq.LLILZLL = (ViewGroup) c1749140vcO.getRootView();
                C1391600mJi c1391600mJi = c0hwq.LLILLJJLI;
                c1391600mJi.LIZIZ = c1749140vcO;
                c1391600mJi.LJIIL = false;
                c1391600mJi.LJIJJ = true;
                c1391600mJi.LIZLLL = EnumC1235690iGF.BOTTOM;
                c1391600mJi.LJII = -1001L;
                c0hwq.LIZIZ().show();
            }
        }
    }

    @Override // com.bytedance.android.livesdk.comp.impl.pcs.business.growth.form.cell.fields.BasePcsInputCell, com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(final ViewGroup viewGroup) {
        View viewOnCreateItemView = super.onCreateItemView(viewGroup);
        C1749140vcO c1749140vcO = new C1749140vcO(viewGroup.getContext(), null, 6);
        C384050F3z c384050F3z = new C384050F3z();
        c384050F3z.LIZIZ = Integer.valueOf(R.attr.ey_);
        c384050F3z.LIZJ = Float.valueOf(24.0f);
        c1749140vcO.setBackground(c384050F3z.LIZ(viewGroup.getContext()));
        C786410Ut5.X8(c1749140vcO, new View.OnClickListener() { // from class: X.0v44
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.LL.a6(viewGroup.getContext());
            }
        });
        this.LLILZIL = c1749140vcO;
        return viewOnCreateItemView;
    }
}
