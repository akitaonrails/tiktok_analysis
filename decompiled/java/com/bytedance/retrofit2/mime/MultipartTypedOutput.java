package com.bytedance.retrofit2.mime;

import X.C2188811AlT;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.UUID;

/* JADX INFO: loaded from: classes14.dex */
public final class MultipartTypedOutput implements TypedOutput {
    public final String boundary;
    public final byte[] footer;
    public long length;
    public final List<MimePart> mimeParts;

    public static final class MimePart {
        public final TypedOutput body;
        public final String boundary;
        public boolean isBuilt;
        public final boolean isFirst;
        public final String name;
        public byte[] partBoundary;
        public byte[] partHeader;
        public final String transferEncoding;

        private void build() {
            if (this.isBuilt) {
                return;
            }
            this.partBoundary = MultipartTypedOutput.buildBoundary(this.boundary, this.isFirst, false);
            this.partHeader = MultipartTypedOutput.buildHeader(this.name, this.transferEncoding, this.body);
            this.isBuilt = true;
        }

        public long size() {
            build();
            if (this.body.length() > -1) {
                return this.body.length() + ((long) this.partBoundary.length) + ((long) this.partHeader.length);
            }
            return -1L;
        }

        public void writeTo(OutputStream outputStream) throws IOException {
            build();
            outputStream.write(this.partBoundary);
            outputStream.write(this.partHeader);
            this.body.writeTo(outputStream);
        }

        public MimePart(String str, String str2, TypedOutput typedOutput, String str3, boolean z) {
            this.name = str;
            this.transferEncoding = str2;
            this.body = typedOutput;
            this.isFirst = z;
            this.boundary = str3;
        }
    }

    @Override // com.bytedance.retrofit2.mime.TypedOutput
    public String fileName() {
        return null;
    }

    public int getPartCount() {
        return this.mimeParts.size();
    }

    public List<byte[]> getParts() throws IOException {
        ArrayList arrayList = new ArrayList(this.mimeParts.size());
        for (MimePart mimePart : this.mimeParts) {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            mimePart.writeTo(byteArrayOutputStream);
            arrayList.add(byteArrayOutputStream.toByteArray());
        }
        return arrayList;
    }

    @Override // com.bytedance.retrofit2.mime.TypedOutput
    public String md5Stub() {
        ByteArrayOutputStream byteArrayOutputStream;
        ByteArrayInputStream byteArrayInputStream;
        if (this.length == -1) {
            return null;
        }
        try {
            byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                writeTo(byteArrayOutputStream);
                byteArrayInputStream = new ByteArrayInputStream(byteArrayOutputStream.toByteArray());
                try {
                    String strMd5Hex = DigestUtil.md5Hex(byteArrayInputStream);
                    try {
                        byteArrayOutputStream.close();
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                    }
                    try {
                        byteArrayInputStream.close();
                        return strMd5Hex;
                    } catch (Throwable th2) {
                        TryCatchGuardChecker.doCheck(th2);
                        return strMd5Hex;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    try {
                        TryCatchGuardChecker.doCheck(th);
                        if (byteArrayOutputStream != null) {
                            try {
                                byteArrayOutputStream.close();
                            } catch (Throwable th4) {
                                TryCatchGuardChecker.doCheck(th4);
                            }
                        }
                        if (byteArrayInputStream != null) {
                            try {
                                byteArrayInputStream.close();
                                return null;
                            } catch (Throwable th5) {
                                TryCatchGuardChecker.doCheck(th5);
                                return null;
                            }
                        }
                        return null;
                    } catch (Throwable th6) {
                        TryCatchGuardChecker.doCheck(th6);
                        if (byteArrayOutputStream != null) {
                            try {
                                byteArrayOutputStream.close();
                            } catch (Throwable th7) {
                                TryCatchGuardChecker.doCheck(th7);
                            }
                        }
                        if (byteArrayInputStream == null) {
                            throw th6;
                        }
                        try {
                            byteArrayInputStream.close();
                            throw th6;
                        } catch (Throwable th8) {
                            TryCatchGuardChecker.doCheck(th8);
                            throw th6;
                        }
                    }
                }
            } catch (Throwable th9) {
                th = th9;
                byteArrayInputStream = null;
            }
        } catch (Throwable th10) {
            th = th10;
            byteArrayOutputStream = null;
            byteArrayInputStream = null;
        }
    }

    public MultipartTypedOutput() {
        this(UUID.randomUUID().toString());
    }

    @Override // com.bytedance.retrofit2.mime.TypedOutput
    public String mimeType() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("multipart/form-data; boundary=");
        sbLIZ.append(this.boundary);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // com.bytedance.retrofit2.mime.TypedOutput
    public long length() {
        return this.length;
    }

    public MultipartTypedOutput(String str) {
        this.mimeParts = new LinkedList();
        this.boundary = str;
        this.footer = buildBoundary(str, false, true);
        this.length = r0.length;
    }

    @Override // com.bytedance.retrofit2.mime.TypedOutput
    public void writeTo(OutputStream outputStream) throws IOException {
        Iterator<MimePart> it2 = this.mimeParts.iterator();
        while (it2.hasNext()) {
            it2.next().writeTo(outputStream);
        }
        outputStream.write(this.footer);
    }

    public void addPart(String str, TypedOutput typedOutput) {
        addPart(str, "binary", typedOutput);
    }

    public static byte[] buildBoundary(String str, boolean z, boolean z2) {
        try {
            StringBuilder sb = new StringBuilder(str.length() + 8);
            if (!z) {
                sb.append("\r\n");
            }
            sb.append("--");
            sb.append(str);
            if (z2) {
                sb.append("--");
            }
            sb.append("\r\n");
            return sb.toString().getBytes("UTF-8");
        } catch (IOException e) {
            TryCatchGuardChecker.doCheck(e);
            throw new RuntimeException("Unable to write multipart boundary", e);
        }
    }

    public static byte[] buildHeader(String str, String str2, TypedOutput typedOutput) {
        try {
            StringBuilder sb = new StringBuilder(128);
            sb.append("Content-Disposition: form-data; name=\"");
            sb.append(str);
            String strFileName = typedOutput.fileName();
            if (strFileName != null) {
                sb.append("\"; filename=\"");
                sb.append(strFileName);
            }
            sb.append("\"\r\nContent-Type: ");
            sb.append(typedOutput.mimeType());
            long length = typedOutput.length();
            if (length != -1) {
                sb.append("\r\nContent-Length: ");
                sb.append(length);
            }
            sb.append("\r\nContent-Transfer-Encoding: ");
            sb.append(str2);
            sb.append("\r\n\r\n");
            return sb.toString().getBytes("UTF-8");
        } catch (IOException e) {
            TryCatchGuardChecker.doCheck(e);
            throw new RuntimeException("Unable to write multipart header", e);
        }
    }

    public void addPart(String str, String str2, TypedOutput typedOutput) {
        if (str != null) {
            if (str2 != null) {
                if (typedOutput != null) {
                    MimePart mimePart = new MimePart(str, str2, typedOutput, this.boundary, this.mimeParts.isEmpty());
                    this.mimeParts.add(mimePart);
                    long size = mimePart.size();
                    if (size == -1) {
                        this.length = -1L;
                        return;
                    }
                    long j = this.length;
                    if (j == -1) {
                        return;
                    }
                    this.length = j + size;
                    return;
                }
                throw new NullPointerException("Part body must not be null.");
            }
            throw new NullPointerException("Transfer encoding must not be null.");
        }
        throw new NullPointerException("Part name must not be null.");
    }
}
