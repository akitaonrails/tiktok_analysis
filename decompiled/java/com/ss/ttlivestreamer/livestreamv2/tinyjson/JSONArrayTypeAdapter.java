package com.ss.ttlivestreamer.livestreamv2.tinyjson;

import X.C09CU;
import X.C09D5;
import X.C09D6;
import X.C09DL;
import X.C2188811AlT;
import com.bytedance.mt.protector.impl.string2number.CastDoubleProtector;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.TypeAdapter;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public class JSONArrayTypeAdapter extends TypeAdapter<JSONArray> {
    public JSONObjectTypeAdapter LIZ;

    @Override // com.google.gson.TypeAdapter
    /* JADX INFO: renamed from: LIZ, reason: merged with bridge method [inline-methods] */
    public final JSONArray read(C09CU c09cu) {
        c09cu.LIZ();
        JSONArray jSONArray = new JSONArray();
        while (true) {
            C09D6 c09d6LJJLIIIJ = c09cu.LJJLIIIJ();
            if (c09d6LJJLIIIJ != C09D6.END_ARRAY) {
                switch (C09D5.LIZ[c09d6LJJLIIIJ.ordinal()]) {
                    case 1:
                        jSONArray.put(c09cu.LJJ());
                        break;
                    case 2:
                        String strLJJJZ = c09cu.LJJJZ();
                        try {
                            try {
                                jSONArray.put(CastLongProtector.parseLong(strLJJJZ));
                            } catch (Exception e) {
                                e = e;
                                TryCatchGuardChecker.doCheck(e);
                                try {
                                    try {
                                        jSONArray.put(CastDoubleProtector.parseDouble(strLJJJZ));
                                    } catch (Exception e2) {
                                        e = e2;
                                        TryCatchGuardChecker.doCheck(e);
                                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                                        sbLIZ.append("parse String ");
                                        sbLIZ.append(strLJJJZ);
                                        sbLIZ.append(" failed:");
                                        sbLIZ.append(e.getMessage());
                                        GsonIncrementalTypeAdapterUtils.LIZJ("JSONArrayTypeAdapter", C2188811AlT.LIZIZ(sbLIZ), e);
                                    }
                                } catch (Exception e3) {
                                    e = e3;
                                }
                            }
                        } catch (Exception e4) {
                            e = e4;
                        }
                        break;
                    case 3:
                        jSONArray.put(c09cu.LJJJZ());
                        break;
                    case 4:
                        jSONArray.put(this.LIZ.read(c09cu));
                        break;
                    case 5:
                        jSONArray.put(read(c09cu));
                        break;
                    case 6:
                        c09cu.LJJJJJL();
                        break;
                    default:
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("unexpected token:");
                        sbLIZ2.append(c09d6LJJLIIIJ);
                        GsonIncrementalTypeAdapterUtils.LIZJ("JSONArrayTypeAdapter", C2188811AlT.LIZIZ(sbLIZ2), null);
                        break;
                }
            } else {
                c09cu.LJI();
                return jSONArray;
            }
        }
    }

    @Override // com.google.gson.TypeAdapter
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final void write(C09DL c09dl, JSONArray jSONArray) {
        c09dl.LIZIZ();
        if (jSONArray != null) {
            for (int i = 0; i < jSONArray.length(); i++) {
                try {
                    Object obj = jSONArray.get(i);
                    if (obj instanceof JSONArray) {
                        write(c09dl, (JSONArray) obj);
                    } else if (obj instanceof JSONObject) {
                        this.LIZ.write(c09dl, (JSONObject) obj);
                    } else if (obj instanceof Number) {
                        c09dl.LJJJJ((Number) obj);
                    } else if (obj instanceof String) {
                        c09dl.LJJJJJ((String) obj);
                    } else if (obj instanceof Boolean) {
                        c09dl.LJJJ((Boolean) obj);
                    }
                } catch (JSONException e) {
                    TryCatchGuardChecker.doCheck(e);
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("write failed:");
                    sbLIZ.append(e.getMessage());
                    GsonIncrementalTypeAdapterUtils.LIZJ("JSONArrayTypeAdapter", C2188811AlT.LIZIZ(sbLIZ), e);
                }
            }
        }
        c09dl.LJI();
    }
}
