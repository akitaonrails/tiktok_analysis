package com.ss.android.ugc.aweme.profile.util;

import X.C1371430lnB;
import X.C19EG;
import X.InterfaceC1364105Vn;
import X.InterfaceC1369790lkX;
import android.content.Context;
import com.bytedance.bpea.basics.Cert;
import com.ss.android.ugc.aweme.qrcode.CopyLinkChannelWithBPEA;
import java.util.Map;
import kotlin.Unit;

/* JADX INFO: loaded from: classes17.dex */
public interface IShareLinkService {
    Object LIZ(C19EG c19eg, CopyLinkChannelWithBPEA copyLinkChannelWithBPEA, Integer num, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn);

    void LIZIZ(C19EG c19eg, String str, String str2, String str3, boolean z);

    CopyLinkChannelWithBPEA LIZJ(Cert cert, boolean z);

    Object LIZLLL(InterfaceC1369790lkX interfaceC1369790lkX, Map<String, String> map, InterfaceC1364105Vn<? super C1371430lnB> interfaceC1364105Vn);

    boolean LJ(C1371430lnB c1371430lnB, Context context, boolean z, Cert cert);
}
