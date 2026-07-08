package im3;

import X.C0VJO;
import X.C0VSJ;
import X.C0W18;
import X.C0W19;
import X.C0W1D;
import X.C0W1K;
import X.C0W1O;
import X.C0W1P;
import X.C2112008Pe;
import X.C2188811AlT;
import X.C786410Ut5;
import X.C798010VSd;
import X.C802230VdV;
import X.C802240VdW;
import X.C802300Vdc;
import X.EnumC797190VOz;
import android.text.TextUtils;
import android.util.Pair;
import com.bytedance.frameworks.encryptor.EncryptorUtil;
import com.bytedance.scene.Scene;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.zip.GZIPInputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes14.dex */
public class b {
    public static byte[] LIZLLL(HttpURLConnection httpURLConnection) throws Throwable {
        InputStream inputStream;
        GZIPInputStream gZIPInputStream;
        byte[] bArrLIZ;
        InputStream inputStream2 = null;
        try {
            try {
                inputStream = httpURLConnection.getInputStream();
                try {
                    if ("gzip".equalsIgnoreCase(httpURLConnection.getContentEncoding())) {
                        try {
                            gZIPInputStream = new GZIPInputStream(inputStream);
                        } catch (Throwable th) {
                            th = th;
                            gZIPInputStream = null;
                        }
                        try {
                            bArrLIZ = C0W19.LIZ(gZIPInputStream);
                            C798010VSd.LIZ(gZIPInputStream);
                        } catch (Throwable th2) {
                            th = th2;
                            while (true) {
                                try {
                                    TryCatchGuardChecker.doCheck(th);
                                    try {
                                        C798010VSd.LIZ(gZIPInputStream);
                                        throw th;
                                    } catch (Exception e) {
                                        e = e;
                                        TryCatchGuardChecker.doCheck(e);
                                        C2112008Pe.LIZ(inputStream);
                                        return null;
                                    } catch (Throwable th3) {
                                        th = th3;
                                        inputStream2 = inputStream;
                                        TryCatchGuardChecker.doCheck(th);
                                        C2112008Pe.LIZ(inputStream2);
                                        throw th;
                                    }
                                } catch (Throwable th4) {
                                    th = th4;
                                }
                            }
                        }
                    } else {
                        bArrLIZ = C0W19.LIZ(inputStream);
                    }
                    C2112008Pe.LIZ(inputStream);
                    return bArrLIZ;
                } catch (Exception e2) {
                    e = e2;
                } catch (Throwable th5) {
                    th = th5;
                }
            } catch (Throwable th6) {
                th = th6;
            }
        } catch (Exception e3) {
            e = e3;
            inputStream = null;
        }
    }

    public static C802240VdW LIZJ(int i, String str) {
        JSONObject jSONObject;
        C802240VdW c802240VdW = new C802240VdW(i);
        if (i != 200) {
            c802240VdW.LIZ = 207;
        }
        try {
            jSONObject = new JSONObject(str);
        } catch (JSONException e) {
            TryCatchGuardChecker.doCheck(e);
            jSONObject = new JSONObject();
            c802240VdW.LIZ = 207;
        }
        c802240VdW.LIZIZ(jSONObject);
        c802240VdW.LIZLLL = str.getBytes();
        return c802240VdW;
    }

    public static boolean LJI(String str, JSONObject jSONObject) {
        if (!TextUtils.isEmpty(str) && !C0VJO.LJI(jSONObject)) {
            try {
                return LIZ(str, C786410Ut5.J3(jSONObject).getBytes(), EnumC797190VOz.GZIP, true).LIZ();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
        }
        return false;
    }

    public static C802240VdW LJII(String str, String str2, File... fileArr) {
        ArrayList arrayList = new ArrayList();
        for (File file : fileArr) {
            arrayList.add(file);
        }
        if (LJFF("unknown_old", str, str2, arrayList).LIZ()) {
            return new C802240VdW(0);
        }
        return new C802240VdW(207);
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00d8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static X.C802240VdW LIZ(java.lang.String r7, byte[] r8, X.EnumC797190VOz r9, boolean r10) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 226
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: im3.b.LIZ(java.lang.String, byte[], X.0VOz, boolean):X.0VdW");
    }

    public static C802240VdW LJFF(String str, String str2, String str3, final List<File> list) {
        String strLJI;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("upload crashType ");
        sbLIZ.append(str);
        C2188811AlT.LIZIZ(sbLIZ);
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("upload url ");
        sbLIZ2.append(str2);
        C2188811AlT.LIZIZ(sbLIZ2);
        for (File file : list) {
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("upload attachments ");
            sbLIZ3.append(file.getAbsolutePath());
            C2188811AlT.LIZIZ(sbLIZ3);
        }
        try {
            long jLIZIZ = C802230VdV.LIZIZ(new URL(str2));
            if (jLIZIZ < 0) {
                return new C802240VdW(213);
            }
            if (jLIZIZ > 0) {
                return new C802240VdW(214);
            }
            if (C0W1D.LIZ != null) {
                try {
                    byte[] bytes = str3.getBytes();
                    if (C802300Vdc.LIZLLL != null) {
                        bytes = EncryptorUtil.LIZ(bytes.length, bytes);
                        strLJI = o.LJI(str2, "have_dump=true&encrypt=true");
                    } else {
                        strLJI = o.LJI(str2, "have_dump=true");
                    }
                    C0W1O c0w1o = new C0W1O(strLJI, true);
                    c0w1o.LJFF.add(new C0W1K(c0w1o.LIZ, c0w1o.LIZIZ, bytes));
                    LinkedList<C0W1P> linkedList = c0w1o.LJFF;
                    final String str4 = c0w1o.LIZ;
                    linkedList.add(new C0W1P(str4, list) { // from class: X.0W1J
                        public final String LIZ = "file";
                        public final List<File> LIZIZ;
                        public final String LIZJ;

                        @Override // X.C0W1P
                        public final void LIZ(C0W1L c0w1l) throws Throwable {
                            OutputStream outputStream;
                            ZipOutputStream zipOutputStream;
                            File[] fileArrListFiles;
                            String str5 = this.LIZ;
                            c0w1l.LIZ(("--" + this.LIZJ + "\r\nContent-Disposition: form-data; name=\"" + str5 + "\"; filename=\"" + str5 + "\"\r\nContent-Transfer-Encoding: binary\r\n\r\n").getBytes());
                            if (c0w1l.LIZJ) {
                                outputStream = c0w1l.LIZIZ;
                            } else {
                                outputStream = c0w1l.LIZ;
                            }
                            List<File> list2 = this.LIZIZ;
                            if (list2.size() != 0) {
                                ZipOutputStream zipOutputStream2 = null;
                                try {
                                    zipOutputStream = new ZipOutputStream(outputStream);
                                } catch (Throwable th) {
                                    th = th;
                                }
                                try {
                                    zipOutputStream.putNextEntry(new ZipEntry("/"));
                                    for (File file2 : list2) {
                                        if (file2 != null && file2.exists()) {
                                            if (file2.isDirectory()) {
                                                fileArrListFiles = file2.listFiles();
                                                if (fileArrListFiles == null) {
                                                }
                                            } else {
                                                fileArrListFiles = new File[]{file2};
                                            }
                                            for (File file3 : fileArrListFiles) {
                                                LIZIZ(file3, file3.getName(), zipOutputStream);
                                            }
                                        }
                                    }
                                    try {
                                        zipOutputStream.close();
                                    } catch (Throwable th2) {
                                        TryCatchGuardChecker.doCheck(th2);
                                    }
                                } catch (Throwable th3) {
                                    th = th3;
                                    zipOutputStream2 = zipOutputStream;
                                    TryCatchGuardChecker.doCheck(th);
                                    if (zipOutputStream2 != null) {
                                        try {
                                            zipOutputStream2.close();
                                            throw th;
                                        } catch (Throwable th4) {
                                            TryCatchGuardChecker.doCheck(th4);
                                            throw th;
                                        }
                                    }
                                    throw th;
                                }
                            }
                            c0w1l.LIZ("\r\n".getBytes());
                        }

                        {
                            this.LIZIZ = list;
                            this.LIZJ = str4;
                        }

                        /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
                            jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:30:0x008b
                            	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1182)
                            	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:53)
                            	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(ExcHandlersRegionMaker.java:38)
                            	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:27)
                            */
                        public static void LIZIZ(java.io.File r6, java.lang.String r7, java.util.zip.ZipOutputStream r8) {
                            /*
                                boolean r0 = r6.exists()
                                if (r0 != 0) goto L7
                                return
                            L7:
                                boolean r0 = r6.isDirectory()
                                r4 = 0
                                if (r0 == 0) goto L61
                                java.io.File[] r6 = r6.listFiles()
                                if (r6 != 0) goto L15
                                return
                            L15:
                                java.util.zip.ZipEntry r2 = new java.util.zip.ZipEntry
                                java.lang.StringBuilder r0 = X.C2188811AlT.LIZ()
                                r0.append(r7)
                                java.lang.String r1 = "/"
                                r0.append(r1)
                                java.lang.String r0 = X.C2188811AlT.LIZIZ(r0)
                                r2.<init>(r0)
                                r8.putNextEntry(r2)
                                int r0 = r7.length()
                                if (r0 != 0) goto L52
                                java.lang.String r5 = ""
                            L35:
                                int r3 = r6.length
                            L36:
                                if (r4 >= r3) goto L86
                                r2 = r6[r4]
                                java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
                                r1.append(r5)
                                java.lang.String r0 = r2.getName()
                                r1.append(r0)
                                java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)
                                LIZIZ(r2, r0, r8)
                                int r4 = r4 + 1
                                goto L36
                            L52:
                                java.lang.StringBuilder r0 = X.C2188811AlT.LIZ()
                                r0.append(r7)
                                r0.append(r1)
                                java.lang.String r5 = X.C2188811AlT.LIZIZ(r0)
                                goto L35
                            L61:
                                java.util.zip.ZipEntry r0 = new java.util.zip.ZipEntry
                                r0.<init>(r7)
                                r8.putNextEntry(r0)
                                r0 = 0
                                X.0VSP r3 = new X.0VSP     // Catch: java.lang.Throwable -> L8b
                                r3.<init>(r6)     // Catch: java.lang.Throwable -> L8b
                                r0 = 4096(0x1000, float:5.74E-42)
                                byte[] r2 = new byte[r0]     // Catch: java.lang.Throwable -> L88
                            L73:
                                int r1 = r3.read(r2)     // Catch: java.lang.Throwable -> L88
                                r0 = -1
                                if (r0 == r1) goto L7e
                                r8.write(r2, r4, r1)     // Catch: java.lang.Throwable -> L88
                                goto L73
                            L7e:
                                r3.close()     // Catch: java.lang.Throwable -> L82
                                goto L87
                            L82:
                                r0 = move-exception
                                com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
                            L86:
                                return
                            L87:
                                return
                            L88:
                                r1 = move-exception
                                r0 = r3
                                goto L8c
                            L8b:
                                r1 = move-exception
                            L8c:
                                com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r1)     // Catch: java.lang.Throwable -> L8b
                                if (r0 == 0) goto L99
                                r0.close()     // Catch: java.lang.Throwable -> L95
                                throw r1
                            L95:
                                r0 = move-exception
                                com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
                            L99:
                                throw r1
                            */
                            throw new UnsupportedOperationException("Method not decompiled: X.C0W1J.LIZIZ(java.io.File, java.lang.String, java.util.zip.ZipOutputStream):void");
                        }
                    });
                    Pair<Integer, String> pairLIZIZ = c0w1o.LIZIZ();
                    C802240VdW c802240VdWLIZJ = LIZJ(((Integer) pairLIZIZ.first).intValue(), (String) pairLIZIZ.second);
                    try {
                        C802230VdV.LJIJI(new URL(strLJI), c802240VdWLIZJ);
                        return c802240VdWLIZJ;
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        return c802240VdWLIZJ;
                    }
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    return new C802240VdW(207);
                }
            }
            C0W18 c0w18 = new C0W18(o.LJI(str2, "have_dump=true&encrypt=true"), true);
            c0w18.LIZLLL("json", str3, true);
            c0w18.LIZIZ(list);
            c0w18.LJ(str);
            C802240VdW c802240VdWLJFF = c0w18.LJFF();
            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
            sbLIZ4.append("uploadCrashLogWithAttachment:");
            sbLIZ4.append(str);
            sbLIZ4.append(" success");
            C2188811AlT.LIZIZ(sbLIZ4);
            return c802240VdWLJFF;
        } catch (IOException e2) {
            TryCatchGuardChecker.doCheck(e2);
            StringBuilder sbLIZ5 = C2188811AlT.LIZ();
            sbLIZ5.append("err upload crash log ");
            sbLIZ5.append(e2);
            C2188811AlT.LIZIZ(sbLIZ5);
            return new C802240VdW(207);
        }
    }

    public static boolean LJ(int i, String str, String str2, String str3, List list) {
        if (C0W1D.LIZ != null) {
            try {
                C0W1O c0w1o = new C0W1O(str, false);
                c0w1o.LIZ("aid", String.valueOf(i));
                c0w1o.LIZ("device_id", str2);
                c0w1o.LIZ("os", "Android");
                c0w1o.LIZ("process_name", str3);
                Iterator it2 = ((ArrayList) list).iterator();
                while (it2.hasNext()) {
                    final C0VSJ c0vsj = new C0VSJ((String) it2.next());
                    if (c0vsj.exists()) {
                        final HashMap map = new HashMap();
                        map.put("logtype", "alog");
                        map.put(Scene.SCENE_SERVICE, "npth");
                        LinkedList<C0W1P> linkedList = c0w1o.LJFF;
                        final String str4 = c0w1o.LIZ;
                        final String name = c0vsj.getName();
                        linkedList.add(new C0W1P(c0vsj, str4, name, map) { // from class: X.0W1I
                            public final File LIZ;
                            public final Map<String, String> LIZIZ;
                            public final String LIZJ;
                            public final String LIZLLL;

                            @Override // X.C0W1P
                            public final void LIZ(C0W1L c0w1l) throws IOException {
                                String str5 = this.LIZLLL;
                                Map<String, String> map2 = this.LIZIZ;
                                StringBuilder sb = new StringBuilder("--");
                                sb.append(this.LIZJ);
                                sb.append("\r\nContent-Disposition: form-data; name=\"");
                                sb.append(str5);
                                sb.append("\"; filename=\"");
                                sb.append(str5);
                                sb.append("\"");
                                if (map2 != null) {
                                    for (Map.Entry<String, String> entry : map2.entrySet()) {
                                        sb.append("; ");
                                        sb.append(entry.getKey());
                                        sb.append("=\"");
                                        sb.append(entry.getValue());
                                        sb.append("\"");
                                    }
                                }
                                sb.append("\r\nContent-Transfer-Encoding: binary\r\n\r\n");
                                c0w1l.LIZ(sb.toString().getBytes());
                                C0VSP c0vsp = new C0VSP(this.LIZ);
                                byte[] bArr = new byte[8192];
                                while (true) {
                                    int i2 = c0vsp.read(bArr);
                                    if (i2 != -1) {
                                        synchronized (c0w1l) {
                                            if (c0w1l.LIZJ) {
                                                c0w1l.LIZIZ.write(bArr, 0, i2);
                                            } else {
                                                c0w1l.LIZ.write(bArr, 0, i2);
                                            }
                                        }
                                    } else {
                                        c0vsp.close();
                                        c0w1l.LIZ("\r\n".getBytes());
                                        return;
                                    }
                                }
                            }

                            {
                                this.LIZ = c0vsj;
                                this.LIZIZ = map;
                                this.LIZJ = str4;
                                this.LIZLLL = name;
                            }
                        });
                    }
                }
                if (new JSONObject((String) c0w1o.LIZIZ().second).optInt("errno", -1) != 200) {
                    return false;
                }
                return true;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                return false;
            }
        }
        try {
            C0W18 c0w18 = new C0W18(str, false);
            c0w18.LIZLLL("aid", String.valueOf(i), false);
            c0w18.LIZLLL("device_id", str2, false);
            c0w18.LIZLLL("os", "Android", false);
            c0w18.LIZLLL("process_name", str3, false);
            Iterator it3 = ((ArrayList) list).iterator();
            while (it3.hasNext()) {
                C0VSJ c0vsj2 = new C0VSJ((String) it3.next());
                if (c0vsj2.exists()) {
                    HashMap map2 = new HashMap();
                    map2.put("logtype", "alog");
                    map2.put(Scene.SCENE_SERVICE, "npth");
                    c0w18.LIZJ(c0vsj2.getName(), map2);
                    c0w18.LIZ(c0vsj2);
                }
            }
            c0w18.LJ("alog");
            try {
                JSONObject jSONObject = c0w18.LJFF().LIZJ;
                if (jSONObject == null) {
                    return false;
                }
                if (jSONObject.optInt("errno", -1) == 200) {
                    return true;
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
            return false;
        } catch (IOException e2) {
            TryCatchGuardChecker.doCheck(e2);
            return false;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:57:0x0107
        	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1182)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:53)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(ExcHandlersRegionMaker.java:38)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:27)
        */
    public static X.C802240VdW LIZIZ(java.lang.String r12, byte[] r13, java.lang.String r14, java.lang.String r15, boolean r16, boolean r17) {
        /*
            Method dump skipped, instruction units count: 399
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: im3.b.LIZIZ(java.lang.String, byte[], java.lang.String, java.lang.String, boolean, boolean):X.0VdW");
    }
}
