package com.ss.android.ugc.aweme.pipo;

import X.C19EG;
import X.EnumC743970TGh;
import X.EnumC925903jd;
import X.EnumC989003to;
import X.InterfaceC1063710dmr;
import android.content.Context;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.bnpl.BnplMiddleActivity;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes27.dex */
public interface IPipoService {
    void LIZ(String str, String str2, List list);

    void LIZIZ(Function1<? super Boolean, Unit> function1);

    void LIZJ();

    String LIZLLL();

    void LJ();

    boolean LJFF(EnumC743970TGh enumC743970TGh);

    boolean LJI();

    void LJII();

    boolean LJIIIIZZ(C19EG c19eg, String str, String str2, String str3, String str4, String str5, String str6, EnumC989003to enumC989003to, String str7, String str8, String str9, EnumC925903jd enumC925903jd, Float f, String str10, Function1 function1);

    void LJIIIZ(List<String> list);

    boolean LJIIJ(Context context);

    void LJIIJJI(String str);

    String LJIIL();

    boolean LJIILIIL(BnplMiddleActivity bnplMiddleActivity, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, Map map);

    void LJIILJJIL(Function1<? super Boolean, Unit> function1);

    void LJIILL(String str, String str2, String str3, JSONObject jSONObject, List list, String str4);

    void LJIILLIIL();

    Class<? extends InterfaceC1063710dmr> LJIIZILJ(String str);

    String getDeviceId();

    String getRiskInfo();

    List<Class<? extends InterfaceC1063710dmr>> provideXBridgetIDLMethodList();
}
