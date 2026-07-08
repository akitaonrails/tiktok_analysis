package com.ss.android.ugc.aweme.poi.osp.component;

import X.AbstractViewOnClickListenerC1173120gdK;
import X.C01GW;
import X.C0IDF;
import X.C1193290h9r;
import X.C13LE;
import X.C166X;
import X.C20600815jK;
import X.C2217381BqS;
import X.C452501pT;
import X.C786410Ut5;
import X.InterfaceC1891350zJl;
import X.InterfaceC2217461Bqa;
import X.ViewOnAttachStateChangeListenerC20604515jv;
import android.view.View;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.ss.android.ugc.aweme.poi.osp.repo.model.CouponGuildCellData;
import com.ss.android.ugc.aweme.poi.osp.repo.model.CouponGuildData;
import com.ss.android.ugc.aweme.slash.component.BaseSlashReusedComponent;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AwS562S0100000_18;
import kotlin.jvm.internal.AwS597S0100000_18;

/* JADX INFO: loaded from: classes19.dex */
public final class PoiOrderSubmitCouponGuideAssem extends BaseSlashReusedComponent<CouponGuildData> {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJLILLLLZIIL;
    public final C166X LLJL = new C166X(new AwS597S0100000_18((ReusedUISlotAssem) this, 424));
    public final C01GW LLJLIL = C452501pT.LIZIZ(new AwS562S0100000_18(this, 1658));

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(PoiOrderSubmitCouponGuideAssem.class, "viewBinding", "getViewBinding()Lcom/ss/android/ugc/tiktok/poi/databinding/PoiOrderSubmitCouponGuideModuleBinding;", 0);
        C13LE.LIZ.getClass();
        LLJLILLLLZIIL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int Oo() {
        return R.layout.e5c;
    }

    public final C1193290h9r sp() {
        C166X c166x = this.LLJL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJLILLLLZIIL;
        return (C1193290h9r) c166x.LIZ(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0019  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x005e A[PHI: r14
      0x005e: PHI (r14v3 java.util.Map<java.lang.String, java.lang.Object>) = (r14v0 java.util.Map<java.lang.String, java.lang.Object>), (r14v4 java.util.Map<java.lang.String, java.lang.Object>) binds: [B:38:0x005c, B:36:0x0055] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0064 A[PHI: r14
      0x0064: PHI (r14v2 java.util.Map<java.lang.String, java.lang.Object>) = (r14v0 java.util.Map<java.lang.String, java.lang.Object>), (r14v3 java.util.Map<java.lang.String, java.lang.Object>) binds: [B:38:0x005c, B:40:0x0062] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0098 A[LOOP:0: B:48:0x0092->B:50:0x0098, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0117 A[LOOP:2: B:63:0x0111->B:65:0x0117, LOOP_END] */
    @Override // com.ss.android.ugc.aweme.slash.component.BaseSlashReusedComponent, X.InterfaceC1173990gej
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void fm1() throws org.json.JSONException {
        /*
            Method dump skipped, instruction units count: 322
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.poi.osp.component.PoiOrderSubmitCouponGuideAssem.fm1():void");
    }

    @Override // com.ss.android.ugc.aweme.slash.component.BaseSlashReusedComponent, com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv = sp().LLILLJJLI;
        viewOnAttachStateChangeListenerC20604515jv.setLifecycleOwner(this);
        viewOnAttachStateChangeListenerC20604515jv.LJIILJJIL(PoiOrderSubmitCouponGuideCell.class);
        viewOnAttachStateChangeListenerC20604515jv.setOrientation(0);
        viewOnAttachStateChangeListenerC20604515jv.addItemDecoration(new C0IDF(viewOnAttachStateChangeListenerC20604515jv, 2));
    }

    @Override // com.ss.android.ugc.aweme.slash.component.BaseSlashReusedComponent, X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: tp, reason: merged with bridge method [inline-methods] */
    public final void up(final CouponGuildData couponGuildData) {
        super.up(couponGuildData);
        sp().LLILLL.setText(couponGuildData.getTitle());
        C20600815jK<InterfaceC1891350zJl> state = sp().LLILLJJLI.getState();
        List<CouponGuildCellData> cellList = couponGuildData.getCellList();
        if (cellList == null) {
            cellList = new ArrayList<>();
        }
        state.LJIILL(cellList, null);
        C786410Ut5.I7(new AbstractViewOnClickListenerC1173120gdK() { // from class: X.0h9d
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Removed duplicated region for block: B:105:0x01c8 A[LOOP:2: B:103:0x01c2->B:105:0x01c8, LOOP_END] */
            /* JADX WARN: Removed duplicated region for block: B:11:0x0039  */
            /* JADX WARN: Removed duplicated region for block: B:53:0x00c7  */
            /* JADX WARN: Removed duplicated region for block: B:57:0x00d1  */
            /* JADX WARN: Removed duplicated region for block: B:61:0x00db  */
            /* JADX WARN: Removed duplicated region for block: B:65:0x00e5  */
            /* JADX WARN: Removed duplicated region for block: B:69:0x00ef  */
            /* JADX WARN: Removed duplicated region for block: B:73:0x00f9  */
            /* JADX WARN: Removed duplicated region for block: B:77:0x0103  */
            /* JADX WARN: Removed duplicated region for block: B:79:0x010a A[PHI: r17
              0x010a: PHI (r17v4 java.util.Map<java.lang.String, java.lang.Object>) = (r17v0 java.util.Map<java.lang.String, java.lang.Object>), (r17v5 java.util.Map<java.lang.String, java.lang.Object>) binds: [B:78:0x0108, B:76:0x0101] A[DONT_GENERATE, DONT_INLINE]] */
            /* JADX WARN: Removed duplicated region for block: B:81:0x0110 A[PHI: r17
              0x0110: PHI (r17v3 java.util.Map<java.lang.String, java.lang.Object>) = (r17v0 java.util.Map<java.lang.String, java.lang.Object>), (r17v4 java.util.Map<java.lang.String, java.lang.Object>) binds: [B:78:0x0108, B:80:0x010e] A[DONT_GENERATE, DONT_INLINE]] */
            /* JADX WARN: Removed duplicated region for block: B:90:0x0147 A[LOOP:0: B:88:0x0141->B:90:0x0147, LOOP_END] */
            /* JADX WARN: Removed duplicated region for block: B:97:0x0178  */
            @Override // X.AbstractViewOnClickListenerC1173120gdK
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void LIZ(android.view.View r22) throws org.json.JSONException {
                /*
                    Method dump skipped, instruction units count: 499
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C1193150h9d.LIZ(android.view.View):void");
            }
        }, sp().LL);
    }
}
