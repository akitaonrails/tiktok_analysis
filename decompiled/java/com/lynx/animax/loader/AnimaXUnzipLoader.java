package com.lynx.animax.loader;

import X.C08P4;
import X.C0VSJ;
import X.C0VSP;
import X.C0VSV;
import X.C2188811AlT;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.lynx.animax.util.AnimaXLog;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

/* JADX INFO: loaded from: classes4.dex */
public class AnimaXUnzipLoader {

    public static class UnzipResult {
        public String error;
        public String path;

        public String getError() {
            return this.error;
        }

        public String getPath() {
            return this.path;
        }

        public void setError(String str) {
            this.error = str;
        }

        public void setPath(String str) {
            this.path = str;
        }

        public UnzipResult(String str, String str2) {
            this.error = str;
            this.path = str2;
        }
    }

    public static String getError(UnzipResult unzipResult) {
        return unzipResult.getError();
    }

    public static String getPath(UnzipResult unzipResult) {
        return unzipResult.getPath();
    }

    public static UnzipResult unzip(String str, String str2) {
        C08P4 c08p4;
        if (str != null && !str.isEmpty()) {
            if (str2 != null && !str2.isEmpty()) {
                try {
                    ZipInputStream zipInputStream = new ZipInputStream(new C0VSP(new C0VSJ(str)));
                    C0VSJ c0vsj = new C0VSJ(str2);
                    if (!c0vsj.exists() && !c0vsj.mkdirs()) {
                        c08p4 = new C08P4("make dst directory error");
                    } else {
                        while (true) {
                            try {
                                ZipEntry nextEntry = zipInputStream.getNextEntry();
                                if (nextEntry != null) {
                                    String name = nextEntry.getName();
                                    if (name != null && !name.contains("__MACOSX") && !name.contains(".DS_Store") && !name.contains("../")) {
                                        if (nextEntry.isDirectory()) {
                                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                                            sbLIZ.append(str2);
                                            sbLIZ.append(File.separator);
                                            sbLIZ.append(name);
                                            new C0VSJ(C2188811AlT.LIZIZ(sbLIZ)).mkdirs();
                                        } else {
                                            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                                            sbLIZ2.append(str2);
                                            sbLIZ2.append(File.separator);
                                            sbLIZ2.append(name);
                                            try {
                                                BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new C0VSV(C2188811AlT.LIZIZ(sbLIZ2)));
                                                byte[] bArr = new byte[SpeechEngineDefines.TTS_WORK_MODE_BOTH];
                                                while (true) {
                                                    try {
                                                        int i = zipInputStream.read(bArr);
                                                        if (-1 != i) {
                                                            try {
                                                                bufferedOutputStream.write(bArr, 0, i);
                                                            } catch (IOException e) {
                                                                TryCatchGuardChecker.doCheck(e);
                                                                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                                                                sbLIZ3.append("writeToStream error: ");
                                                                sbLIZ3.append(e.getMessage());
                                                                AnimaXLog.LIZ("UnzipUtil", C2188811AlT.LIZIZ(sbLIZ3));
                                                            }
                                                        }
                                                    } catch (IOException e2) {
                                                        TryCatchGuardChecker.doCheck(e2);
                                                        StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                                                        sbLIZ4.append("readZipFile error: ");
                                                        sbLIZ4.append(e2.getMessage());
                                                        AnimaXLog.LIZ("UnzipUtil", C2188811AlT.LIZIZ(sbLIZ4));
                                                    }
                                                    try {
                                                        break;
                                                    } catch (IOException e3) {
                                                        TryCatchGuardChecker.doCheck(e3);
                                                        StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                                                        sbLIZ5.append("close bufferedOutputStream error: ");
                                                        sbLIZ5.append(e3.getMessage());
                                                        AnimaXLog.LIZ("UnzipUtil", C2188811AlT.LIZIZ(sbLIZ5));
                                                    }
                                                }
                                                bufferedOutputStream.close();
                                            } catch (FileNotFoundException e4) {
                                                TryCatchGuardChecker.doCheck(e4);
                                                StringBuilder sbLIZ6 = C2188811AlT.LIZ();
                                                sbLIZ6.append("extractFile, create FileOutputStream error: ");
                                                sbLIZ6.append(e4.getMessage());
                                                AnimaXLog.LIZ("UnzipUtil", C2188811AlT.LIZIZ(sbLIZ6));
                                            }
                                        }
                                    }
                                    try {
                                        zipInputStream.closeEntry();
                                    } catch (IOException e5) {
                                        TryCatchGuardChecker.doCheck(e5);
                                        StringBuilder sbLIZ7 = C2188811AlT.LIZ();
                                        sbLIZ7.append("closeEntry error: ");
                                        sbLIZ7.append(e5.getMessage());
                                        AnimaXLog.LIZ("UnzipUtil", C2188811AlT.LIZIZ(sbLIZ7));
                                    }
                                }
                            } catch (IOException e6) {
                                TryCatchGuardChecker.doCheck(e6);
                                StringBuilder sbLIZ8 = C2188811AlT.LIZ();
                                sbLIZ8.append("getNextEntry error: ");
                                sbLIZ8.append(e6.getMessage());
                                AnimaXLog.LIZ("UnzipUtil", C2188811AlT.LIZIZ(sbLIZ8));
                            }
                            try {
                                break;
                            } catch (IOException e7) {
                                TryCatchGuardChecker.doCheck(e7);
                                StringBuilder sbLIZ9 = C2188811AlT.LIZ();
                                sbLIZ9.append("zipInputStream close error: ");
                                sbLIZ9.append(e7.getMessage());
                                AnimaXLog.LIZ("UnzipUtil", C2188811AlT.LIZIZ(sbLIZ9));
                            }
                        }
                        zipInputStream.close();
                        c08p4 = new C08P4();
                    }
                } catch (FileNotFoundException e8) {
                    TryCatchGuardChecker.doCheck(e8);
                    StringBuilder sbLIZ10 = C2188811AlT.LIZ();
                    sbLIZ10.append("new FileInputStream error: ");
                    sbLIZ10.append(e8.getMessage());
                    AnimaXLog.LIZ("UnzipUtil", C2188811AlT.LIZIZ(sbLIZ10));
                    c08p4 = new C08P4("open zip file error");
                }
                if (!c08p4.LIZ) {
                    return new UnzipResult(c08p4.LIZIZ, null);
                }
                return new UnzipResult(null, str2);
            }
            return new UnzipResult("UnzippedFilePath is null.", null);
        }
        return new UnzipResult("ZippedFilePath is null.", null);
    }
}
