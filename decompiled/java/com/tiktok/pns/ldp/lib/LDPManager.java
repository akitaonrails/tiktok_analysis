package com.tiktok.pns.ldp.lib;

import X.C0W6I;
import X.C0WRQ;
import X.C0WRR;
import X.C2097608Jq;
import X.C2097908Jt;
import X.C2188811AlT;
import X.C538540LAe;
import X.C786410Ut5;
import X.C823520WSg;
import X.C823550WSj;
import X.C823580WSm;
import X.C823590WSn;
import X.InterfaceC823540WSi;
import X.InterfaceC823620WSq;
import Y.ARunnableS0S1310000_13;
import Y.ARunnableS113S0100000_13;
import Y.ARunnableS22S0400000_13;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.tiktok.pns.ldp.api.ILDPService;
import com.tiktok.pns.ldp.api.model.FrequencyRequestParams;
import com.tiktok.pns.ldp.api.model.PrivatisedDataStorageModel;
import com.tiktok.pns.ldp.api.model.UnknownDataStorageModel;
import com.tiktok.pns.ldp.lib.LDPManager;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.TimeZone;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.text.Charsets;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes14.dex */
public final class LDPManager implements ILDPService {
    public InterfaceC823540WSi LIZ;
    public int LIZIZ;
    public boolean LIZLLL;
    public boolean LJFF;
    public ScheduledExecutorService LJI;
    public C823520WSg LJII;
    public Set<String> LJIIIIZZ;
    public int LIZJ = 10;
    public Map<String, Long> LJ = C2097608Jq.LJ();
    public final String LJIIIZ = "_privatise_v2";
    public final String LJIIJ = "_unknown_url_v2";

    @Override // com.tiktok.pns.ldp.api.ILDPService
    public final void LIZIZ(C0W6I c0w6i) throws NoSuchAlgorithmException {
        long jNextLong = new SecureRandom().nextLong();
        Long l = this.LJ.get(c0w6i.LIZ);
        if (l == null) {
            l = 100L;
        }
        if (jNextLong % l.longValue() == 0) {
            LIZJ(null, c0w6i, null, null);
        }
    }

    @Override // com.tiktok.pns.ldp.api.ILDPService
    public final void LIZ(C823550WSj c823550WSj, C823520WSg c823520WSg) {
        C823580WSm c823580WSmLJIIIZ = C823550WSj.LJIIIZ();
        if (!c823580WSmLJIIIZ.LIZ) {
            return;
        }
        try {
            this.LJI = C786410Ut5.f4(1);
            this.LIZ = c823550WSj;
            this.LJII = c823520WSg;
            this.LIZJ = c823580WSmLJIIIZ.LIZIZ;
            this.LIZLLL = c823580WSmLJIIIZ.LIZJ;
            this.LJ = c823580WSmLJIIIZ.LJ;
            this.LJIIIIZZ = new LinkedHashSet();
            ScheduledExecutorService scheduledExecutorService = this.LJI;
            if (scheduledExecutorService != null) {
                scheduledExecutorService.schedule(new ARunnableS113S0100000_13(this, 165), c823580WSmLJIIIZ.LIZLLL, TimeUnit.SECONDS);
            }
            this.LJFF = true;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    @Override // com.tiktok.pns.ldp.api.ILDPService
    public final void LIZLLL(String str, Function0<C0W6I> function0) throws NoSuchAlgorithmException {
        long jNextLong = new SecureRandom().nextLong();
        Long l = this.LJ.get(str);
        if (l == null) {
            l = 100L;
        }
        if (jNextLong % l.longValue() == 0) {
            LIZJ(null, function0.invoke(), null, null);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [X.0WSk] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void LJ(List<PrivatisedDataStorageModel> list, final Set<String> set) {
        C823520WSg c823520WSg;
        String strLIZJ;
        if (!((ArrayList) list).isEmpty() && (c823520WSg = this.LJII) != null) {
            InterfaceC823540WSi interfaceC823540WSi = this.LIZ;
            if (interfaceC823540WSi != null) {
                strLIZJ = interfaceC823540WSi.LIZJ(C2097608Jq.LJIIIIZZ(new Pair("app_id", c823520WSg.LIZJ), new Pair("channel", c823520WSg.LIZLLL), new Pair("app_version", c823520WSg.LIZIZ), new Pair("device_platform", "Android"), new Pair("os_version", c823520WSg.LIZ), new Pair("os", "Android"), new Pair("region", c823520WSg.LJ.getRegion()), new Pair("priority_region", c823520WSg.LJ.getPriorityRegion()), new Pair("vgeo", c823520WSg.LJ.LIZ()), new Pair("is_login", c823520WSg.LJ.LIZIZ())));
            } else {
                strLIZJ = null;
            }
            FrequencyRequestParams frequencyRequestParams = new FrequencyRequestParams(strLIZJ, list);
            final InterfaceC823540WSi interfaceC823540WSi2 = this.LIZ;
            if (interfaceC823540WSi2 != 0) {
                interfaceC823540WSi2.LJI(frequencyRequestParams, new InterfaceC823620WSq() { // from class: X.0WSk
                    @Override // X.InterfaceC823620WSq
                    public final void LIZ(String str, boolean z) {
                        LDPManager lDPManager = this.LIZ;
                        ScheduledExecutorService scheduledExecutorService = lDPManager.LJI;
                        if (scheduledExecutorService != null) {
                            scheduledExecutorService.execute(new ARunnableS0S1310000_13(z, str, set, interfaceC823540WSi2, lDPManager, 1));
                        }
                    }
                });
            }
        }
    }

    @Override // com.tiktok.pns.ldp.api.ILDPService
    public final void LIZJ(Map<String, String> map, C0W6I c0w6i, C0WRQ c0wrq, C0WRR c0wrr) throws NoSuchAlgorithmException {
        InterfaceC823540WSi interfaceC823540WSi;
        int i;
        boolean z;
        PrivatisedDataStorageModel privatisedDataStorageModel;
        UnknownDataStorageModel unknownDataStorageModel;
        ScheduledExecutorService scheduledExecutorService;
        String strSubstring;
        if (this.LJFF && (interfaceC823540WSi = this.LIZ) != null) {
            long jNextLong = new SecureRandom().nextLong();
            long j = 3600;
            long timeInMillis = (((Calendar.getInstance(TimeZone.getTimeZone("UTC+0")).getTimeInMillis() / 1000) / j) * j) + ((long) new Random().nextInt(3600));
            if (c0wrq != null) {
                if (map != null && (!map.isEmpty()) && jNextLong % ((long) 1) == 0) {
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    for (Map.Entry entry : ((LinkedHashMap) map).entrySet()) {
                        String str = (String) entry.getValue();
                        int iNextInt = new Random().nextInt(C538540LAe.LLJJJIL);
                        MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append(str);
                        sbLIZ.append("$$$");
                        sbLIZ.append(iNextInt);
                        messageDigest.update(C2188811AlT.LIZIZ(sbLIZ).getBytes(Charsets.UTF_8));
                        int iIntValue = new BigInteger(1, messageDigest.digest()).mod(BigInteger.valueOf(8000)).intValue();
                        SecureRandom secureRandom = new SecureRandom();
                        ArrayList arrayList = new ArrayList();
                        if (secureRandom.nextDouble() <= 0.5d) {
                            arrayList.add(Integer.valueOf(iIntValue));
                        }
                        while (arrayList.size() < 7) {
                            int iNextInt2 = secureRandom.nextInt(8000);
                            if (iNextInt2 != iIntValue && !arrayList.contains(Integer.valueOf(iNextInt2))) {
                                arrayList.add(Integer.valueOf(iNextInt2));
                            }
                        }
                        Collections.shuffle(arrayList);
                        linkedHashMap.put(entry.getKey(), C2097908Jt.LIZJ(new Pair("url_frequency", C2097608Jq.LJIIIIZZ(new Pair("func_idx", Integer.valueOf(iNextInt)), new Pair("vector", arrayList)))));
                    }
                    i = 0;
                    privatisedDataStorageModel = new PrivatisedDataStorageModel(null, c0w6i.LIZ, timeInMillis, interfaceC823540WSi.LIZJ(c0w6i.LIZIZ), interfaceC823540WSi.LIZJ(C2097908Jt.LIZJ(new Pair("url_frequency", C2097608Jq.LJIIIIZZ(new Pair("hash_domain_range", 8000), new Pair("func_size", Integer.valueOf(C538540LAe.LLJJJIL)), new Pair("vector_size", 7))))), interfaceC823540WSi.LIZJ(linkedHashMap));
                    z = true;
                } else {
                    i = 0;
                    z = true;
                    privatisedDataStorageModel = null;
                }
            } else {
                i = 0;
                z = true;
                if (!c0w6i.LIZIZ.isEmpty()) {
                    privatisedDataStorageModel = new PrivatisedDataStorageModel(null, c0w6i.LIZ, timeInMillis, interfaceC823540WSi.LIZJ(c0w6i.LIZIZ), "", "");
                } else {
                    privatisedDataStorageModel = null;
                }
            }
            if (c0wrr != null && map != null && (!map.isEmpty()) == z && jNextLong % ((long) 100) == 0) {
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                for (Map.Entry entry2 : ((LinkedHashMap) map).entrySet()) {
                    Object key = entry2.getKey();
                    String str2 = (String) entry2.getValue();
                    SecureRandom secureRandom2 = new SecureRandom();
                    if (str2.length() < 90) {
                        strSubstring = a0.LJJJJJ('^', 90, str2);
                    } else {
                        strSubstring = str2.substring(i, 90);
                    }
                    int iNextInt3 = secureRandom2.nextInt(3);
                    StringBuilder sb = new StringBuilder();
                    int i2 = 0;
                    int i3 = 0;
                    while (i2 < strSubstring.length()) {
                        char cCharAt = strSubstring.charAt(i2);
                        int i4 = i3 + 1;
                        if (i3 % 3 == iNextInt3) {
                            sb.append(cCharAt);
                        }
                        i2++;
                        i3 = i4;
                    }
                    String string = sb.toString();
                    byte[] bArrDigest = MessageDigest.getInstance("SHA-256").digest(str2.getBytes(Charsets.UTF_8));
                    String str3 = C823590WSn.LIZ;
                    StringBuilder sb2 = new StringBuilder(bArrDigest.length * 2);
                    for (byte b : bArrDigest) {
                        int i5 = b & 255;
                        sb2.append(str3.charAt((i5 >>> 4) & 15));
                        sb2.append(str3.charAt((i5 >>> 0) & 15));
                    }
                    linkedHashMap2.put(key, C2097608Jq.LJIIIIZZ(new Pair("modulo", Integer.valueOf(iNextInt3)), new Pair("piece", string), new Pair("hash", sb2.toString())));
                    i = 0;
                }
                unknownDataStorageModel = new UnknownDataStorageModel(c0w6i.LIZ, timeInMillis, interfaceC823540WSi.LIZJ(C2097908Jt.LIZJ(new Pair("unknown_url", C2097608Jq.LJIIIIZZ(new Pair("modulo_size", 3), new Pair("url_length", 90), new Pair("sample_rate", 100))))), interfaceC823540WSi.LIZJ(linkedHashMap2));
            } else {
                unknownDataStorageModel = null;
            }
            InterfaceC823540WSi interfaceC823540WSi2 = this.LIZ;
            if (interfaceC823540WSi2 != null && (scheduledExecutorService = this.LJI) != null) {
                scheduledExecutorService.execute(new ARunnableS22S0400000_13(interfaceC823540WSi2, privatisedDataStorageModel, unknownDataStorageModel, this, 3));
            }
        }
    }
}
