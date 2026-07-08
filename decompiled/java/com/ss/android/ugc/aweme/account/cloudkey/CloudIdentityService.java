package com.ss.android.ugc.aweme.account.cloudkey;

import X.AbstractC848400XPy;
import X.C01GW;
import X.C04TD;
import X.C0W3J;
import X.C0XQ7;
import X.C1227904rF;
import X.C13LP;
import X.C1697810uHb;
import X.C2188811AlT;
import X.C452501pT;
import X.C835130WpT;
import X.C835180WpY;
import X.C835200Wpa;
import X.C835210Wpb;
import X.C835220Wpc;
import X.C835230Wpd;
import X.C835460Wq0;
import X.InterfaceC833980Wnc;
import android.util.Base64;
import com.bytedance.keva.Keva;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.android.gms.auth.blockstore.RetrieveBytesRequest;
import com.google.android.gms.auth.blockstore.RetrieveBytesResponse;
import com.google.gson.reflect.TypeToken;
import com.ss.android.ugc.aweme.cloudkey.ICloudIdentityService;
import java.lang.reflect.Type;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes14.dex */
public final class CloudIdentityService implements ICloudIdentityService {
    public static final C01GW<InterfaceC833980Wnc> LIZ = C452501pT.LIZIZ(new C835180WpY());
    public static final C01GW<Keva> LIZIZ = C452501pT.LIZIZ(new C835230Wpd());
    public static final String LIZJ = "HmacSHA256";

    public static ICloudIdentityService LIZLLL() {
        Object objLIZ = C04TD.LIZ(ICloudIdentityService.class, false);
        if (objLIZ != null) {
            return (ICloudIdentityService) objLIZ;
        }
        if (C04TD.LJLIIL == null) {
            synchronized (ICloudIdentityService.class) {
                if (C04TD.LJLIIL == null) {
                    C04TD.LJLIIL = new CloudIdentityService();
                }
            }
        }
        return C04TD.LJLIIL;
    }

    public static C835210Wpb LJ() {
        String str;
        byte[] bArr;
        byte[] bArr2;
        C835130WpT c835130WpT = new C835130WpT();
        List listLJIIJJI = C1697810uHb.LJIIJJI("cloud_key", "cloud_key_uid_mapping_request");
        C0W3J.LJIIIZ(listLJIIJJI, "Keys cannot be set to null");
        c835130WpT.LIZ = listLJIIJJI;
        RetrieveBytesResponse retrieveBytesResponse = (RetrieveBytesResponse) C835460Wq0.LIZ(LIZ.getValue().LIZIZ(new RetrieveBytesRequest(c835130WpT.LIZ, false)));
        RetrieveBytesResponse.BlockstoreData blockstoreData = retrieveBytesResponse.LJLZ().get("cloud_key");
        if (blockstoreData == null || (bArr2 = blockstoreData.zza) == null) {
            str = null;
        } else {
            str = new String(bArr2, Charsets.UTF_8);
            C835220Wpc.LIZ().storeString("cloud_key", str);
        }
        RetrieveBytesResponse.BlockstoreData blockstoreData2 = retrieveBytesResponse.LJLZ().get("cloud_key_uid_mapping_request");
        String str2 = (blockstoreData2 == null || (bArr = blockstoreData2.zza) == null) ? "{}" : new String(bArr, Charsets.UTF_8);
        Type type = new TypeToken<Map<String, ? extends String>>() { // from class: X.0WpZ
        }.getType();
        C1227904rF c1227904rF = C1227904rF.LIZ;
        c1227904rF.getClass();
        Map map = (Map) C1227904rF.LIZJ(str2, type);
        Keva kevaLIZ = C835220Wpc.LIZ();
        c1227904rF.getClass();
        kevaLIZ.storeString("cloud_key_uid_mapping_request", C1227904rF.LJI(map));
        return new C835210Wpb(str, map);
    }

    public static String LJFF() {
        C835210Wpb c835210WpbLJ = LJ();
        String str = c835210WpbLJ.LIZ;
        if (str != null && str.length() != 0) {
            return c835210WpbLJ.LIZ;
        }
        String string = UUID.randomUUID().toString();
        byte[] bytes = string.getBytes(Charsets.UTF_8);
        C835200Wpa c835200Wpa = new C835200Wpa();
        c835200Wpa.LIZ = bytes;
        C0W3J.LJFF("key cannot be null or empty", "cloud_key");
        c835200Wpa.LIZJ = "cloud_key";
        C01GW<InterfaceC833980Wnc> c01gw = LIZ;
        if (((Boolean) C835460Wq0.LIZ(c01gw.getValue().LIZ())).booleanValue()) {
            c835200Wpa.LIZIZ = true;
        }
        Integer num = (Integer) C835460Wq0.LIZ(c01gw.getValue().LIZJ(c835200Wpa.LIZ()));
        int length = bytes.length;
        if (num == null || num.intValue() != length) {
            return null;
        }
        C835220Wpc.LIZ().storeString("cloud_key", string);
        return string;
    }

    public static Map LJI() {
        if (!C835220Wpc.LIZ().contains("cloud_key_uid_mapping_request")) {
            return LJ().LIZIZ;
        }
        String string = C835220Wpc.LIZ().getString("cloud_key_uid_mapping_request", "{}");
        Type type = new TypeToken<Map<String, ? extends String>>() { // from class: X.04Yp
        }.getType();
        C1227904rF.LIZ.getClass();
        return (Map) C1227904rF.LIZJ(string, type);
    }

    @Override // com.ss.android.ugc.aweme.cloudkey.ICloudIdentityService
    public final String LIZ() {
        if (C835220Wpc.LIZ().contains("cloud_key")) {
            return C835220Wpc.LIZ().getString("cloud_key", "");
        }
        try {
            return LJFF();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }

    @Override // com.ss.android.ugc.aweme.cloudkey.ICloudIdentityService
    public final void LIZJ(String str, String str2) {
        byte[] bytes;
        try {
            LinkedHashMap linkedHashMap = new LinkedHashMap(LJI());
            linkedHashMap.put(str, str2);
            C1227904rF c1227904rF = C1227904rF.LIZ;
            c1227904rF.getClass();
            String strLJI = C1227904rF.LJI(linkedHashMap);
            if (strLJI != null && (bytes = strLJI.getBytes(Charsets.UTF_8)) != null) {
                C835200Wpa c835200Wpa = new C835200Wpa();
                c835200Wpa.LIZ = bytes;
                C0W3J.LJFF("key cannot be null or empty", "cloud_key_uid_mapping_request");
                c835200Wpa.LIZJ = "cloud_key_uid_mapping_request";
                C01GW<InterfaceC833980Wnc> c01gw = LIZ;
                if (((Boolean) C835460Wq0.LIZ(c01gw.getValue().LIZ())).booleanValue()) {
                    c835200Wpa.LIZIZ = true;
                }
                Integer num = (Integer) C835460Wq0.LIZ(c01gw.getValue().LIZJ(c835200Wpa.LIZ()));
                int length = bytes.length;
                if (num != null && num.intValue() == length) {
                    Keva kevaLIZ = C835220Wpc.LIZ();
                    c1227904rF.getClass();
                    kevaLIZ.storeString("cloud_key_uid_mapping_request", C1227904rF.LJI(linkedHashMap));
                }
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    @Override // com.ss.android.ugc.aweme.cloudkey.ICloudIdentityService
    public final String LIZIZ(long j, String str, boolean z) {
        try {
            Map mapLJI = LJI();
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            Iterator it2 = mapLJI.entrySet().iterator();
            while (true) {
                boolean zLJFF = true;
                if (!it2.hasNext()) {
                    break;
                }
                Map.Entry entry = (Map.Entry) it2.next();
                if (z) {
                    zLJFF = Intrinsics.LJFF(entry.getKey(), ((AbstractC848400XPy) C0XQ7.LJFF()).getCurSecUserId());
                }
                if (zLJFF) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            }
            ArrayList arrayList = new ArrayList(linkedHashMap.size());
            Iterator it3 = linkedHashMap.entrySet().iterator();
            while (it3.hasNext()) {
                String str2 = (String) ((Map.Entry) it3.next()).getValue();
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(str);
                sbLIZ.append('+');
                sbLIZ.append(j);
                String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                byte[] bArrDecode = Base64.decode(str2, 0);
                String str3 = LIZJ;
                SecretKeySpec secretKeySpec = new SecretKeySpec(bArrDecode, str3);
                Mac mac = Mac.getInstance(str3);
                mac.init(secretKeySpec);
                arrayList.add(a0.LJJJJJL('0', 64, new BigInteger(1, mac.doFinal(strLIZIZ.getBytes(Charsets.UTF_8))).toString(16)));
            }
            return C13LP.LJJLIIIJ(arrayList, ",", null, null, 0, null, null, 62);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return "";
        }
    }
}
