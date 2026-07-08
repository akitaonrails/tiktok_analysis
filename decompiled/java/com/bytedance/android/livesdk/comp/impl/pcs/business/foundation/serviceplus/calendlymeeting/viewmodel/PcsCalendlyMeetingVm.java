package com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.calendlymeeting.viewmodel;

import X.C01YH;
import X.C01YK;
import X.C0JPA;
import X.C0JPS;
import X.C0JPT;
import X.C1533950q1J;
import X.C1554960qZC;
import X.C23250099c;
import X.C489960JJi;
import X.C500260Jjc;
import X.EnumC2273991DzZ;
import X.EnumC491290JOl;
import X.InterfaceC0148002o;
import X.InterfaceC1555100qZQ;
import X.InterfaceC665370Q7z;
import androidx.lifecycle.ViewModelKt;
import com.bytedance.android.livesdk.chatroom.api.SMBBookingEvent;
import com.bytedance.android.livesdk.comp.api.pcs.data.model.calendlymeeting.PcsCalendlyBookingData;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import webcast.api.smb.SMBBookingEventResponse;

/* JADX INFO: loaded from: classes8.dex */
public final class PcsCalendlyMeetingVm extends AssemViewModel<C0JPA> {
    public int LL;
    public InterfaceC665370Q7z LLILLJJLI;
    public C489960JJi LLILLL;
    public final C01YH LLILZ = new C01YH();

    public final void vQ2() {
        String str;
        PcsCalendlyBookingData pcsCalendlyBookingData;
        PcsCalendlyBookingData pcsCalendlyBookingData2;
        C489960JJi c489960JJiYQ2 = yQ2();
        long j = (c489960JJiYQ2 == null || (pcsCalendlyBookingData2 = c489960JJiYQ2.LL) == null) ? 0L : pcsCalendlyBookingData2.skuId;
        C489960JJi c489960JJiYQ22 = yQ2();
        if (c489960JJiYQ22 == null || (pcsCalendlyBookingData = c489960JJiYQ22.LL) == null || (str = pcsCalendlyBookingData.secAnchorId) == null) {
            str = "";
        }
        DataChannelGlobal dataChannelGlobal = DataChannelGlobal.LLILZ;
        Room roomLJJLI = C500260Jjc.LJJLI();
        C23250099c.LIZLLL(ViewModelKt.getViewModelScope(this), null, null, new C01YK(this, j, str, roomLJJLI != null ? roomLJJLI.getId() : 0L, null), 3);
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C0JPA(0);
    }

    public final C489960JJi yQ2() {
        InterfaceC1555100qZQ interfaceC1555100qZQLIZIZ;
        if (this.LLILLL == null) {
            InterfaceC665370Q7z interfaceC665370Q7z = this.LLILLJJLI;
            C489960JJi c489960JJi = null;
            if (interfaceC665370Q7z != null && (interfaceC1555100qZQLIZIZ = C1554960qZC.LIZIZ(interfaceC665370Q7z, "source_default_key", C489960JJi.class, null)) != null) {
                c489960JJi = (C489960JJi) interfaceC1555100qZQLIZIZ.getSource();
            }
            this.LLILLL = c489960JJi;
        }
        return this.LLILLL;
    }

    public final String AQ2() {
        PcsCalendlyBookingData pcsCalendlyBookingData;
        String str;
        SMBBookingEventResponse.ResponseData responseData = getState().LL;
        if (responseData != null && (str = responseData.skuTitle) != null && C1533950q1J.LJ(str)) {
            return str;
        }
        C489960JJi c489960JJiYQ2 = yQ2();
        return (c489960JJiYQ2 == null || (pcsCalendlyBookingData = c489960JJiYQ2.LL) == null) ? "" : pcsCalendlyBookingData.title;
    }

    public final String xQ2() {
        SMBBookingEvent sMBBookingEvent;
        String str;
        SMBBookingEventResponse.ResponseData responseData = getState().LL;
        return (responseData == null || (sMBBookingEvent = responseData.event) == null || (str = sMBBookingEvent.id) == null) ? "" : str;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0017 A[PHI: r3
      0x0017: PHI (r3v4 java.lang.String) = (r3v0 java.lang.String), (r3v5 java.lang.String) binds: [B:9:0x0015, B:7:0x0012] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:12:0x001b A[PHI: r3
      0x001b: PHI (r3v3 java.lang.String) = (r3v0 java.lang.String), (r3v4 java.lang.String) binds: [B:9:0x0015, B:11:0x0019] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x001e A[PHI: r2 r3
      0x001e: PHI (r2v0 java.lang.String) = (r2v2 java.lang.String), (r2v3 java.lang.String) binds: [B:13:0x001c, B:11:0x0019] A[DONT_GENERATE, DONT_INLINE]
      0x001e: PHI (r3v1 java.lang.String) = (r3v3 java.lang.String), (r3v4 java.lang.String) binds: [B:13:0x001c, B:11:0x0019] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String wQ2(webcast.api.smb.SMBBookingEventResponse.ResponseData r5) {
        /*
            java.lang.String r4 = ""
            if (r5 == 0) goto L14
            com.bytedance.android.livesdk.chatroom.api.SMBBookingEvent r0 = r5.event
            if (r0 == 0) goto L14
            long r0 = r0.updatedAtSec
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            java.lang.String r3 = r0.toString()
            if (r3 != 0) goto L17
        L14:
            r3 = r4
            if (r5 == 0) goto L1b
        L17:
            java.lang.String r2 = r5.bookingEventUrl
            if (r2 != 0) goto L1e
        L1b:
            r2 = r4
            if (r5 == 0) goto L2b
        L1e:
            boolean r0 = r5.needToQueue
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            java.lang.String r0 = r0.toString()
            if (r0 == 0) goto L2b
            r4 = r0
        L2b:
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            r1.append(r3)
            r0 = 124(0x7c, float:1.74E-43)
            r1.append(r0)
            r1.append(r2)
            r1.append(r0)
            r1.append(r4)
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.calendlymeeting.viewmodel.PcsCalendlyMeetingVm.wQ2(webcast.api.smb.SMBBookingEventResponse$ResponseData):java.lang.String");
    }

    public final void CQ2(EnumC2273991DzZ enumC2273991DzZ) {
        setState(new C0JPS(enumC2273991DzZ));
    }

    public final void DQ2(EnumC491290JOl enumC491290JOl) {
        if (enumC491290JOl != EnumC491290JOl.UNKNOWN && enumC491290JOl != getState().LLIZ) {
            setState(new C0JPT(enumC491290JOl));
        }
    }

    /* JADX WARN: Path cross not found for [B:14:0x0041, B:37:0x008f], limit reached: 68 */
    /* JADX WARN: Path cross not found for [B:25:0x0067, B:35:0x008a], limit reached: 68 */
    /* JADX WARN: Path cross not found for [B:37:0x008f, B:14:0x0041], limit reached: 68 */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0135  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:61:0x0128 -> B:12:0x003d). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object zQ2(X.InterfaceC1364105Vn<? super java.lang.Integer> r19) {
        /*
            Method dump skipped, instruction units count: 324
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.calendlymeeting.viewmodel.PcsCalendlyMeetingVm.zQ2(X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00e9  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:55:0x00e6 -> B:11:0x0037). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object BQ2(java.lang.String r10, java.lang.Integer r11, java.lang.Integer r12, boolean r13, X.InterfaceC1364105Vn<? super java.lang.Boolean> r14) {
        /*
            Method dump skipped, instruction units count: 254
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.calendlymeeting.viewmodel.PcsCalendlyMeetingVm.BQ2(java.lang.String, java.lang.Integer, java.lang.Integer, boolean, X.05Vn):java.lang.Object");
    }
}
