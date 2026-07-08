package com.ss.android.ugc.aweme.tako.signal.impl;

import X.C01GW;
import X.C123100dR;
import X.C13A2;
import X.C13LC;
import X.C14FS;
import X.C14GD;
import X.C1862870yZp;
import X.C1863850ybP;
import X.C1863920ybW;
import X.C1864200yby;
import X.C2097608Jq;
import X.C2097908Jt;
import X.C452501pT;
import X.InterfaceC1618180sDA;
import android.view.View;
import androidx.lifecycle.LifecycleOwner;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.aweme.tako.signal.ITakoContextAbility;
import java.lang.reflect.Field;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.AwS574S0100000_30;

/* JADX INFO: loaded from: classes31.dex */
public final class TakoContextAbilityImpl implements ITakoContextAbility {
    public final Object LL;
    public final View LLILLJJLI;
    public final LifecycleOwner LLILLL;
    public final C01GW LLILZ;
    public final C01GW LLILZIL;
    public final C01GW LLILZLL;
    public final C01GW LLIZ;
    public final C01GW LLIZLLLIL;
    public final C01GW LLJ;
    public final RecyclerView.RecycledViewPool LLJI;

    public TakoContextAbilityImpl() {
        this(7, null);
    }

    static {
        new TakoContextAbilityImpl(7, null).T71().getClass();
    }

    @Override // com.ss.android.ugc.aweme.tako.signal.ITakoContextAbility
    public final C13LC<C1864200yby> Ap0() {
        return (C13LC) this.LLJ.getValue();
    }

    public final C13LC<C13A2> LIZ() {
        return (C13LC) this.LLIZLLLIL.getValue();
    }

    @Override // com.ss.android.ugc.aweme.tako.signal.ITakoContextAbility
    public final C13LC<C1863850ybP> T71() {
        return (C13LC) this.LLILZ.getValue();
    }

    @Override // com.ss.android.ugc.aweme.tako.signal.ITakoContextAbility
    public final C13LC<C14GD> aP2() {
        return (C13LC) this.LLIZ.getValue();
    }

    @Override // com.ss.android.ugc.aweme.tako.signal.ITakoContextAbility
    public final C13LC<C1863920ybW> rg1() {
        return (C13LC) this.LLILZLL.getValue();
    }

    @Override // com.ss.android.ugc.aweme.tako.signal.ITakoContextAbility
    public final C13LC<C14FS> uk0() {
        return (C13LC) this.LLILZIL.getValue();
    }

    @Override // com.ss.android.ugc.aweme.tako.signal.ITakoContextAbility
    public final Map<String, Object> G5() {
        InterfaceC1618180sDA interfaceC1618180sDALIZIZ = T71().LIZIZ();
        Field[] declaredFields = C1863850ybP.class.getDeclaredFields();
        int iLIZIZ = C2097908Jt.LIZIZ(declaredFields.length);
        if (iLIZIZ < 16) {
            iLIZIZ = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iLIZIZ);
        for (Field field : declaredFields) {
            field.setAccessible(true);
            Pair pair = new Pair(field.getName(), field.get(interfaceC1618180sDALIZIZ));
            linkedHashMap.put(pair.getFirst(), pair.getSecond());
        }
        InterfaceC1618180sDA interfaceC1618180sDALIZIZ2 = uk0().LIZIZ();
        Field[] declaredFields2 = C14FS.class.getDeclaredFields();
        int iLIZIZ2 = C2097908Jt.LIZIZ(declaredFields2.length);
        if (iLIZIZ2 < 16) {
            iLIZIZ2 = 16;
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(iLIZIZ2);
        for (Field field2 : declaredFields2) {
            field2.setAccessible(true);
            Pair pair2 = new Pair(field2.getName(), field2.get(interfaceC1618180sDALIZIZ2));
            linkedHashMap2.put(pair2.getFirst(), pair2.getSecond());
        }
        InterfaceC1618180sDA interfaceC1618180sDALIZIZ3 = rg1().LIZIZ();
        Field[] declaredFields3 = C1863920ybW.class.getDeclaredFields();
        int iLIZIZ3 = C2097908Jt.LIZIZ(declaredFields3.length);
        if (iLIZIZ3 < 16) {
            iLIZIZ3 = 16;
        }
        LinkedHashMap linkedHashMap3 = new LinkedHashMap(iLIZIZ3);
        for (Field field3 : declaredFields3) {
            field3.setAccessible(true);
            Pair pair3 = new Pair(field3.getName(), field3.get(interfaceC1618180sDALIZIZ3));
            linkedHashMap3.put(pair3.getFirst(), pair3.getSecond());
        }
        InterfaceC1618180sDA interfaceC1618180sDALIZIZ4 = aP2().LIZIZ();
        Field[] declaredFields4 = C14GD.class.getDeclaredFields();
        int iLIZIZ4 = C2097908Jt.LIZIZ(declaredFields4.length);
        if (iLIZIZ4 < 16) {
            iLIZIZ4 = 16;
        }
        LinkedHashMap linkedHashMap4 = new LinkedHashMap(iLIZIZ4);
        for (Field field4 : declaredFields4) {
            field4.setAccessible(true);
            Pair pair4 = new Pair(field4.getName(), field4.get(interfaceC1618180sDALIZIZ4));
            linkedHashMap4.put(pair4.getFirst(), pair4.getSecond());
        }
        InterfaceC1618180sDA interfaceC1618180sDALIZIZ5 = Ap0().LIZIZ();
        Field[] declaredFields5 = C1864200yby.class.getDeclaredFields();
        int iLIZIZ5 = C2097908Jt.LIZIZ(declaredFields5.length);
        LinkedHashMap linkedHashMap5 = new LinkedHashMap(iLIZIZ5 >= 16 ? iLIZIZ5 : 16);
        for (Field field5 : declaredFields5) {
            field5.setAccessible(true);
            Pair pair5 = new Pair(field5.getName(), field5.get(interfaceC1618180sDALIZIZ5));
            linkedHashMap5.put(pair5.getFirst(), pair5.getSecond());
        }
        return C2097608Jq.LJIIL(C2097608Jq.LJIIL(C2097608Jq.LJIIL(C2097608Jq.LJIIL(linkedHashMap4, linkedHashMap3), linkedHashMap2), linkedHashMap), linkedHashMap5);
    }

    public final boolean LIZIZ() {
        C1863850ybP c1863850ybP = (C1863850ybP) T71().LIZIZ();
        return c1863850ybP.LLJJI == 2 && c1863850ybP.LLJJ == 88872960259L;
    }

    @Override // com.ss.android.ugc.aweme.tako.signal.ITakoContextAbility
    public final boolean T91() {
        C1863850ybP c1863850ybP = (C1863850ybP) T71().LIZIZ();
        return isTako() || (c1863850ybP.LLJJI == 2 && (c1863850ybP.LLJJ > 88872960259L ? 1 : (c1863850ybP.LLJJ == 88872960259L ? 0 : -1)) == 0);
    }

    @Override // com.ss.android.ugc.aweme.tako.signal.ITakoContextAbility
    public final boolean YV1() {
        C1863850ybP c1863850ybP = (C1863850ybP) T71().LIZIZ();
        return c1863850ybP.LLJJI == 2 && c1863850ybP.LLJJ != 1;
    }

    @Override // com.ss.android.ugc.aweme.tako.signal.ITakoContextAbility
    public final Map<String, String> getCommonParams() {
        String str = ((C1864200yby) Ap0().LIZIZ()).LL;
        C1863850ybP c1863850ybP = (C1863850ybP) T71().LIZIZ();
        Pair[] pairArr = new Pair[7];
        String str2 = c1863850ybP.LL;
        if (str2 == null) {
            str2 = "";
        }
        pairArr[0] = new Pair("enter_from", str2);
        String str3 = c1863850ybP.LLILLJJLI;
        if (str3 == null) {
            str3 = "";
        }
        pairArr[1] = new Pair("enter_method", str3);
        String str4 = c1863850ybP.LLILZIL;
        if (str4 == null) {
            str4 = "";
        }
        pairArr[2] = new Pair("process_id", str4);
        pairArr[3] = new Pair("bot_id", String.valueOf(c1863850ybP.LLJJ));
        String str5 = c1863850ybP.LLILLL;
        pairArr[4] = new Pair("search_id", str5 != null ? str5 : "");
        String str6 = c1863850ybP.LLJJJIL;
        if (str6.length() == 0) {
            str6 = "default";
        }
        pairArr[5] = new Pair("mode", str6);
        String str7 = c1863850ybP.LLJJJJ;
        pairArr[6] = new Pair("sub_mode_type", str7.length() != 0 ? str7 : "default");
        Map<String, String> mapLJIIJ = C2097608Jq.LJIIJ(pairArr);
        Long lValueOf = Long.valueOf(c1863850ybP.LLJILLL);
        if (lValueOf.longValue() > 0) {
            lValueOf.longValue();
            mapLJIIJ.put("action_item_id", String.valueOf(c1863850ybP.LLJILLL));
        }
        String str8 = c1863850ybP.LLJILJILJ;
        if (C123100dR.LIZ(str8) && c1863850ybP.LLJJ != 1 && str8 != null) {
            mapLJIIJ.put("sub_process_id", str8);
        }
        String str9 = c1863850ybP.LLJJIJIL;
        if (!C123100dR.LIZ(str9)) {
            str9 = null;
        }
        if (str9 != null) {
            mapLJIIJ.put("sub_enter_method", str9);
        }
        String str10 = c1863850ybP.LLJJIJIL;
        if (C123100dR.LIZ(str10) && str10 != null) {
            mapLJIIJ.put("sub_enter_method", str10);
        }
        String str11 = c1863850ybP.LLJJJ;
        if (C123100dR.LIZ(str11) && str11 != null) {
            mapLJIIJ.put("icon_state", str11);
        }
        String str12 = c1863850ybP.LLJLLIL;
        if (C123100dR.LIZ(str12) && str12 != null) {
            mapLJIIJ.putAll(C1862870yZp.LIZ(str12));
        }
        if (str != null && str.length() > 0) {
            mapLJIIJ.put("tako_session_id", str);
        }
        String str13 = c1863850ybP.LLIZ;
        if (C123100dR.LIZ(str13) && str13 != null) {
            mapLJIIJ.put("tako_chat_id", str13);
        }
        return mapLJIIJ;
    }

    @Override // com.ss.android.ugc.aweme.tako.signal.ITakoContextAbility
    public final boolean isTako() {
        C1863850ybP c1863850ybP = (C1863850ybP) T71().LIZIZ();
        return c1863850ybP.LLJJI == 1 && c1863850ybP.LLJJ == 1;
    }

    @Override // com.ss.android.ugc.aweme.tako.signal.ITakoContextAbility
    public final Map<String, String> uG1() {
        C14GD c14gd = (C14GD) aP2().LIZIZ();
        return C2097608Jq.LJIIJ(new Pair("enter_from", c14gd.LL), new Pair("enter_method", c14gd.LLILLJJLI), new Pair("process_id", c14gd.LLILLL));
    }

    @Override // com.ss.android.ugc.aweme.tako.signal.ITakoContextAbility
    public final RecyclerView.RecycledViewPool Nr() {
        return this.LLJI;
    }

    /* JADX WARN: Code restructure failed: missing block: B:76:0x0011, code lost:
    
        continue;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v10, types: [X.0qZ5] */
    /* JADX WARN: Type inference failed for: r1v13, types: [X.0qZ5] */
    /* JADX WARN: Type inference failed for: r1v8, types: [X.0qZ5] */
    /* JADX WARN: Type inference failed for: r2v2, types: [T extends X.0sDA<T>, X.014t, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5 */
    @Override // com.ss.android.ugc.aweme.tako.signal.ITakoContextAbility
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void PG0(X.C14G2 r13) {
        /*
            Method dump skipped, instruction units count: 379
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.tako.signal.impl.TakoContextAbilityImpl.PG0(X.14G2):void");
    }

    public TakoContextAbilityImpl(int i, LifecycleOwner lifecycleOwner) {
        lifecycleOwner = (i & 4) != 0 ? null : lifecycleOwner;
        this.LL = null;
        this.LLILLJJLI = null;
        this.LLILLL = lifecycleOwner;
        this.LLILZ = C452501pT.LIZIZ(new AwS574S0100000_30(this, 454));
        this.LLILZIL = C452501pT.LIZIZ(new AwS574S0100000_30(this, 456));
        this.LLILZLL = C452501pT.LIZIZ(new AwS574S0100000_30(this, 458));
        this.LLIZ = C452501pT.LIZIZ(new AwS574S0100000_30(this, 457));
        this.LLIZLLLIL = C452501pT.LIZIZ(new AwS574S0100000_30(this, 455));
        this.LLJ = C452501pT.LIZIZ(new AwS574S0100000_30(this, 459));
        this.LLJI = new RecyclerView.RecycledViewPool();
    }
}
