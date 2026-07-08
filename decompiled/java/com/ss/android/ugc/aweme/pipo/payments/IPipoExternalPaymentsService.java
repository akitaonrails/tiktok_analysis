package com.ss.android.ugc.aweme.pipo.payments;

import X.C19EG;
import X.EnumC922503j5;
import X.InterfaceC1631620sYq;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS121S0400000_26;
import kotlin.jvm.internal.AwS2S1600000_26;

/* JADX INFO: loaded from: classes2.dex */
public interface IPipoExternalPaymentsService {
    void LIZ(C19EG c19eg, AwS121S0400000_26 awS121S0400000_26);

    void LIZIZ(C19EG c19eg, String str, Function2<? super String, ? super Exception, Unit> function2);

    void LIZJ(C19EG c19eg, AwS2S1600000_26 awS2S1600000_26);

    void LIZLLL(C19EG c19eg, String str, Function2<? super String, ? super Exception, Unit> function2);

    void LJ(C19EG c19eg, String str, String str2, InterfaceC1631620sYq interfaceC1631620sYq, boolean z);

    void LJFF(C19EG c19eg, String str, String str2, EnumC922503j5 enumC922503j5, String str3, String str4, String str5, InterfaceC1631620sYq<? super Boolean, ? super Map<String, String>, ? super Boolean, Unit> interfaceC1631620sYq);
}
