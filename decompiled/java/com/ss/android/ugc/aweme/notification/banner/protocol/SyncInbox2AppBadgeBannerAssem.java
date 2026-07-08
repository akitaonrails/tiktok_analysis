package com.ss.android.ugc.aweme.notification.banner.protocol;

import X.C0181003v;
import X.C13IQ;
import X.C13LE;
import X.C1904660zfE;
import X.C2188811AlT;
import X.C637550OzZ;
import X.C786410Ut5;
import X.InterfaceC1891350zJl;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.inbox.banner.InboxBannerCustomAssem;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS572S0100000_28;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes29.dex */
public final class SyncInbox2AppBadgeBannerAssem extends InboxBannerCustomAssem {
    public final C0181003v LLILZ = new C0181003v(null);

    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onResume_isOnResumeEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003e  */
    @Override // X.AbstractC738140SxQ
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onResume() {
        /*
            r5 = this;
            super.onResume()
            X.0zfE r0 = X.C1904660zfE.LIZ
            r0.getClass()
            boolean r0 = X.C1904660zfE.LIZ()
            r4 = 0
            if (r0 != 0) goto L3e
            boolean r0 = X.C1904660zfE.LIZJ
            if (r0 == 0) goto L52
            X.0CLb r0 = X.C312050CLb.LIZ
            r0.getClass()
            int r0 = X.C312050CLb.LIZ()
            r3 = 2
            if (r0 == r3) goto L26
            int r1 = X.C312050CLb.LIZ()
            r0 = 4
            if (r1 != r0) goto L52
        L26:
            boolean r0 = X.C312050CLb.LIZIZ()
            if (r0 == 0) goto L52
            com.bytedance.keva.Keva r2 = X.C1904660zfE.LIZIZ
            java.lang.String r0 = "banner_show_times"
            int r1 = r2.getInt(r0, r4)
            java.lang.String r0 = "banner_manual_close"
            boolean r0 = r2.getBoolean(r0, r4)
            if (r1 >= r3) goto L52
            if (r0 != 0) goto L52
        L3e:
            X.1DDq r3 = r5.LL
            X.0OzB r2 = X.EnumC637310OzB.TOP_SHOW
            X.003v r1 = r5.LLILZ
            kotlin.Pair r0 = new kotlin.Pair
            r0.<init>(r2, r1)
            r3.setValue(r0)
        L4c:
            X.C1904660zfE.LIZJ = r4
            X.C1904660zfE.LIZIZ()
            return
        L52:
            X.1DDq r0 = r5.LL
            java.lang.Object r0 = r0.getValue()
            kotlin.Pair r0 = (kotlin.Pair) r0
            java.lang.Object r1 = r0.getFirst()
            X.0OzB r0 = X.EnumC637310OzB.TOP_SHOW
            if (r1 == r0) goto L4c
            X.1DDq r3 = r5.LL
            X.0OzB r2 = X.EnumC637310OzB.DISMISS
            kotlin.Pair r1 = new kotlin.Pair
            r0 = 0
            r1.<init>(r2, r0)
            r3.setValue(r1)
            goto L4c
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.notification.banner.protocol.SyncInbox2AppBadgeBannerAssem.onResume():void");
    }

    @Override // com.ss.android.ugc.aweme.inbox.banner.InboxBannerCustomAssem
    public final void lo(RecyclerView.ViewHolder viewHolder) {
        C1904660zfE.LIZ.getClass();
        C1904660zfE.LIZLLL = true;
        if (!C1904660zfE.LJ) {
            Keva keva = C1904660zfE.LIZIZ;
            int i = keva.getInt("banner_show_times", 0);
            keva.storeInt("banner_show_times", i + 1);
            C1904660zfE.LJ = true;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("recordBannerShow, showTimes=");
            sbLIZ.append(i);
            C2188811AlT.LIZIZ(sbLIZ);
        }
    }

    @Override // com.ss.android.ugc.aweme.inbox.banner.InboxBannerCustomAssem
    public final RecyclerView.ViewHolder ko(ViewGroup viewGroup, C13IQ<? extends InterfaceC1891350zJl> c13iq) {
        if (Intrinsics.LJFF(c13iq, C13LE.LIZ(C0181003v.class))) {
            return new C637550OzZ(C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.a_l, viewGroup, false), new AwS572S0100000_28(this, 312));
        }
        return null;
    }
}
