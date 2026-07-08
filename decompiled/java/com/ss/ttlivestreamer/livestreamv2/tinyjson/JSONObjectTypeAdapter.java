package com.ss.ttlivestreamer.livestreamv2.tinyjson;

import X.C09CU;
import X.C09D4;
import X.C09D6;
import X.C09DL;
import X.C2188811AlT;
import com.bytedance.mt.protector.impl.string2number.CastDoubleProtector;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.TypeAdapter;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public class JSONObjectTypeAdapter extends TypeAdapter<JSONObject> {
    public JSONArrayTypeAdapter LIZ;

    @Override // com.google.gson.TypeAdapter
    /* JADX INFO: renamed from: LIZ, reason: merged with bridge method [inline-methods] */
    public final JSONObject read(C09CU c09cu) {
        c09cu.LIZIZ();
        JSONObject jSONObject = new JSONObject();
        String strLJJJJ = null;
        while (true) {
            C09D6 c09d6LJJLIIIJ = c09cu.LJJLIIIJ();
            if (c09d6LJJLIIIJ != C09D6.END_OBJECT) {
                switch (C09D4.LIZ[c09d6LJJLIIIJ.ordinal()]) {
                    case 1:
                        strLJJJJ = c09cu.LJJJJ();
                        break;
                    case 2:
                        try {
                            try {
                                jSONObject.put(strLJJJJ, c09cu.LJJ());
                            } catch (JSONException e) {
                                e = e;
                                TryCatchGuardChecker.doCheck(e);
                                StringBuilder sbLIZ = C2188811AlT.LIZ();
                                sbLIZ.append("parse Boolean key:");
                                sbLIZ.append(strLJJJJ);
                                sbLIZ.append(" failed:");
                                sbLIZ.append(e.getMessage());
                                GsonIncrementalTypeAdapterUtils.LIZJ("JSONObjectTypeAdapter", C2188811AlT.LIZIZ(sbLIZ), e);
                            }
                        } catch (JSONException e2) {
                            e = e2;
                        }
                        break;
                    case 3:
                        try {
                        } catch (JSONException e3) {
                            e = e3;
                        }
                        try {
                            jSONObject.put(strLJJJJ, c09cu.LJJJZ());
                        } catch (JSONException e4) {
                            e = e4;
                            TryCatchGuardChecker.doCheck(e);
                            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                            sbLIZ2.append("parse String key:");
                            sbLIZ2.append(strLJJJJ);
                            sbLIZ2.append(" failed:");
                            sbLIZ2.append(e.getMessage());
                            GsonIncrementalTypeAdapterUtils.LIZJ("JSONObjectTypeAdapter", C2188811AlT.LIZIZ(sbLIZ2), e);
                        }
                        break;
                    case 4:
                        String strLJJJZ = c09cu.LJJJZ();
                        try {
                            try {
                                jSONObject.put(strLJJJJ, CastLongProtector.parseLong(strLJJJZ));
                            } catch (Exception e5) {
                                e = e5;
                                TryCatchGuardChecker.doCheck(e);
                                try {
                                } catch (JSONException e6) {
                                    e = e6;
                                }
                                try {
                                    jSONObject.put(strLJJJJ, CastDoubleProtector.parseDouble(strLJJJZ));
                                } catch (JSONException e7) {
                                    e = e7;
                                    TryCatchGuardChecker.doCheck(e);
                                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                                    sbLIZ3.append("parse Number key:");
                                    sbLIZ3.append(strLJJJJ);
                                    sbLIZ3.append(" failed:");
                                    sbLIZ3.append(e.getMessage());
                                    GsonIncrementalTypeAdapterUtils.LIZJ("JSONObjectTypeAdapter", C2188811AlT.LIZIZ(sbLIZ3), e);
                                }
                            }
                        } catch (Exception e8) {
                            e = e8;
                        }
                        break;
                    case 5:
                        try {
                        } catch (JSONException e9) {
                            e = e9;
                        }
                        try {
                            jSONObject.put(strLJJJJ, read(c09cu));
                        } catch (JSONException e10) {
                            e = e10;
                            TryCatchGuardChecker.doCheck(e);
                            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                            sbLIZ4.append("parse Object key:");
                            sbLIZ4.append(strLJJJJ);
                            sbLIZ4.append("failed:");
                            sbLIZ4.append(e.getMessage());
                            GsonIncrementalTypeAdapterUtils.LIZJ("JSONObjectTypeAdapter", C2188811AlT.LIZIZ(sbLIZ4), e);
                        }
                        break;
                    case 6:
                        try {
                            try {
                            } catch (JSONException e11) {
                                e = e11;
                            }
                        } catch (JSONException e12) {
                            e = e12;
                        }
                        try {
                            jSONObject.put(strLJJJJ, this.LIZ.read(c09cu));
                        } catch (JSONException e13) {
                            e = e13;
                            TryCatchGuardChecker.doCheck(e);
                            StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                            sbLIZ5.append("parse Array key:");
                            sbLIZ5.append(strLJJJJ);
                            sbLIZ5.append(" failed:");
                            sbLIZ5.append(e.getMessage());
                            GsonIncrementalTypeAdapterUtils.LIZJ("JSONObjectTypeAdapter", C2188811AlT.LIZIZ(sbLIZ5), e);
                        }
                        break;
                    case 7:
                        c09cu.LJJJJJL();
                        break;
                    default:
                        GsonIncrementalTypeAdapterUtils.LIZJ("JSONObjectTypeAdapter", "parse failed, no rule to parse", null);
                        break;
                }
            } else {
                c09cu.LJII();
                return jSONObject;
            }
        }
    }

    @Override // com.google.gson.TypeAdapter
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final void write(C09DL c09dl, JSONObject jSONObject) {
        String str;
        Object obj;
        c09dl.LIZLLL();
        if (jSONObject != null) {
            String str2 = null;
            try {
                Iterator<String> itKeys = jSONObject.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    try {
                        c09dl.LJIILLIIL(next);
                        obj = jSONObject.get(next);
                    } catch (JSONException e) {
                        e = e;
                    }
                    try {
                        if (obj instanceof JSONArray) {
                            this.LIZ.write(c09dl, (JSONArray) obj);
                        } else if (obj instanceof JSONObject) {
                            write(c09dl, (JSONObject) obj);
                        } else if (obj instanceof Number) {
                            c09dl.LJJJJ((Number) obj);
                        } else if (obj instanceof String) {
                            c09dl.LJJJJJ((String) obj);
                        } else if (obj instanceof Boolean) {
                            c09dl.LJJJ((Boolean) obj);
                        } else if (obj == JSONObject.NULL) {
                            c09dl.LJIJJ();
                        } else {
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append("Unexpected to write k-v key:");
                            sbLIZ.append(next);
                            sbLIZ.append(" value:");
                            sbLIZ.append(obj);
                            GsonIncrementalTypeAdapterUtils.LIZJ("JSONObjectTypeAdapter", C2188811AlT.LIZIZ(sbLIZ), null);
                        }
                    } catch (JSONException e2) {
                        e = e2;
                        str2 = obj;
                        str = str2;
                        str2 = next;
                        TryCatchGuardChecker.doCheck(e);
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("write key:");
                        sbLIZ2.append(str2);
                        sbLIZ2.append(" value:");
                        sbLIZ2.append((Object) str);
                        sbLIZ2.append(" failed:");
                        sbLIZ2.append(e.getMessage());
                        GsonIncrementalTypeAdapterUtils.LIZJ("JSONObjectTypeAdapter", C2188811AlT.LIZIZ(sbLIZ2), e);
                        c09dl.LJII();
                    }
                }
            } catch (JSONException e3) {
                e = e3;
                str = null;
            }
        }
        c09dl.LJII();
    }
}
