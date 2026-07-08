package com.ss.android.ugc.aweme.compliance.api.interfaces;

import X.EnumC1216660hlY;
import X.EnumC1910570zol;
import X.EnumC1910580zom;
import X.InterfaceC1631620sYq;
import android.content.Context;
import com.ss.android.ugc.aweme.compliance.api.model.Organization;
import com.ss.android.ugc.aweme.compliance.business.fundraiser.FundraiserInterceptor;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS394S0200000_28;

/* JADX INFO: loaded from: classes29.dex */
public interface IFundraiserService {
    boolean LIZ();

    int LIZIZ();

    Organization LIZJ();

    void LIZLLL();

    FundraiserInterceptor LJ();

    void LJFF(Aweme aweme);

    void LJI();

    boolean LJII();

    boolean LJIIIIZZ();

    void LJIIIZ();

    void LJIIJ(String str, String str2, String str3, Function1<? super Boolean, Unit> function1, Function0<Unit> function0);

    boolean LJIIJJI();

    void LJIIL(boolean z);

    void LJIILIIL(Context context, String str, EnumC1910580zom enumC1910580zom, EnumC1910570zol enumC1910570zol, boolean z, String str2, InterfaceC1631620sYq<? super Organization, ? super EnumC1216660hlY, ? super Map<String, String>, Unit> interfaceC1631620sYq);

    void LJIILJJIL(int i, int i2, String str, String str2, String str3, Function1 function1);

    boolean LJIILL();

    boolean LJIILLIIL(Aweme aweme);

    void LJIIZILJ(Context context, String str, String str2, String str3, String str4, int i, String str5, boolean z, Integer num, Integer num2);

    void LJIJ(int i, String str, String str2, String str3, AwS394S0200000_28 awS394S0200000_28);
}
