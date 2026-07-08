package ms.bd.o;

import X.C0VSF;
import X.C0VSJ;
import X.C0VSV;
import X.C2188811AlT;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class w2 {
    public final C0VSJ LIZ;
    public final a LIZIZ;

    public interface a {
        Object a(String str);

        String a(Object obj);
    }

    public w2(C0VSJ c0vsj, String str, a aVar) {
        if (!c0vsj.exists()) {
            c0vsj.mkdirs();
        }
        this.LIZ = new C0VSJ(c0vsj, str);
        this.LIZIZ = aVar;
    }

    public final synchronized void LIZ() {
        if (this.LIZ.exists()) {
            this.LIZ.delete();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v14 */
    /* JADX WARN: Type inference failed for: r7v15 */
    /* JADX WARN: Type inference failed for: r7v2, types: [java.io.BufferedReader] */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v6 */
    public final synchronized void LIZIZ(List<Object> list) {
        BufferedReader bufferedReader;
        BufferedReader bufferedReader2;
        if (this.LIZ.exists()) {
            ?? r7 = 0;
            Exception e = null;
            BufferedReader bufferedReader3 = null;
            try {
                try {
                    bufferedReader2 = new BufferedReader(new C0VSF(this.LIZ));
                } catch (Throwable th) {
                    th = th;
                }
            } catch (Exception e2) {
                e = e2;
                TryCatchGuardChecker.doCheck(e);
            }
            while (true) {
                try {
                    try {
                        String line = bufferedReader2.readLine();
                        bufferedReader = bufferedReader2;
                        r7 = e;
                        if (line != null) {
                            String strTrim = line.trim();
                            if (!strTrim.equals("")) {
                                try {
                                    Object objA = this.LIZIZ.a(strTrim);
                                    if (objA != null) {
                                        try {
                                            list.add(objA);
                                        } catch (Exception e3) {
                                            e = e3;
                                            TryCatchGuardChecker.doCheck(e);
                                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                                            sbLIZ.append((String) k.a(16777217, 0, 0L, "4a0bc7", new byte[]{42, 109, 113, 19, 93, 36, 27, 73, 111, 55, 101, 107, 66, 5, 28, 37, 47, 67, 100, 34, 49, 106, 76, 24, 28}));
                                            sbLIZ.append(e.getMessage());
                                            C2188811AlT.LIZIZ(sbLIZ);
                                        }
                                    }
                                } catch (Exception e4) {
                                    e = e4;
                                }
                            }
                        }
                    } catch (Exception e5) {
                        e = e5;
                        TryCatchGuardChecker.doCheck(e);
                        bufferedReader3 = bufferedReader2;
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append((String) k.a(16777217, 0, 0L, "ca84ba", new byte[]{126, 108, 74, 68, 126, 119, 99, 72, 108, 36, 122, 98, 88, 0, 88, 110, 99, 69, 121, 112, 123, 108, 69, 0}));
                        sbLIZ2.append(e.getMessage());
                        C2188811AlT.LIZIZ(sbLIZ2);
                        if (bufferedReader3 != null) {
                            bufferedReader = bufferedReader3;
                            r7 = bufferedReader3;
                        }
                    }
                    try {
                        break;
                    } catch (IOException e6) {
                        TryCatchGuardChecker.doCheck(e6);
                        e6.printStackTrace();
                    }
                } catch (Throwable th2) {
                    th = th2;
                    r7 = bufferedReader2;
                    TryCatchGuardChecker.doCheck(th);
                    if (r7 != 0) {
                        try {
                            r7.close();
                        } catch (IOException e7) {
                            TryCatchGuardChecker.doCheck(e7);
                            e7.printStackTrace();
                        }
                    }
                    throw th;
                }
            }
            bufferedReader.close();
        }
    }

    public final synchronized void LIZJ(List<Object> list) {
        C0VSV c0vsv;
        byte b = 21;
        C0VSV c0vsv2 = null;
        try {
            try {
                c0vsv = new C0VSV((File) this.LIZ, false);
            } catch (Exception e) {
                e = e;
                TryCatchGuardChecker.doCheck(e);
            }
            try {
                try {
                    Iterator<Object> it2 = list.iterator();
                    while (it2.hasNext()) {
                        try {
                            c0vsv.write(this.LIZIZ.a(it2.next()).getBytes((String) k.a(16777217, 0, 0L, "146445", new byte[]{b, 2, 99, 13, 83})));
                            c0vsv.write(10);
                        } catch (Exception e2) {
                            TryCatchGuardChecker.doCheck(e2);
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append((String) k.a(16777217, 0, 0L, "a69611", new byte[]{127, 58, 125, 80, 7, 50, 103, 59, 97, 104, 117, 116, 66, 67, 29, 102, 103, 15, 107, 99, 96, 32, 67, 77, 0, 102}));
                            sbLIZ.append(e2.getMessage());
                            C2188811AlT.LIZIZ(sbLIZ);
                            b = 21;
                        }
                    }
                } catch (Throwable th) {
                    th = th;
                    c0vsv2 = c0vsv;
                    TryCatchGuardChecker.doCheck(th);
                    if (c0vsv2 != null) {
                        try {
                            c0vsv2.close();
                        } catch (IOException e3) {
                            TryCatchGuardChecker.doCheck(e3);
                            e3.printStackTrace();
                        }
                    }
                    throw th;
                }
            } catch (Exception e4) {
                e = e4;
                TryCatchGuardChecker.doCheck(e);
                c0vsv2 = c0vsv;
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append((String) k.a(16777217, 0, 0L, "20a8eb", new byte[]{48, 51, 4, 73, 121, 116, 50, 25, 53, 40, 43, 51, 1, 12, 95, 109, 50, 20, 32, 124, 42, 61, 28, 12}));
                sbLIZ2.append(e.getMessage());
                C2188811AlT.LIZIZ(sbLIZ2);
                if (c0vsv2 != null) {
                    c0vsv = c0vsv2;
                }
            }
            try {
                c0vsv.close();
            } catch (IOException e5) {
                TryCatchGuardChecker.doCheck(e5);
                e5.printStackTrace();
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }
}
