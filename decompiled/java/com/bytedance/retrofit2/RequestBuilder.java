package com.bytedance.retrofit2;

import X.AbstractC842530X3j;
import X.C080U;
import X.C0X06;
import X.C0X7A;
import X.C0X7B;
import X.C2188811AlT;
import com.bytedance.retrofit2.mime.AbsTypedOutput;
import com.bytedance.retrofit2.mime.FormUrlEncodedTypedOutput;
import com.bytedance.retrofit2.mime.MultipartTypedOutput;
import com.bytedance.retrofit2.mime.TTRequestCompressManager;
import com.bytedance.retrofit2.mime.TypedOutput;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes24.dex */
public final class RequestBuilder {
    public String LIZ;
    public final C0X06 LIZIZ;
    public String LIZJ;
    public String LIZLLL;
    public StringBuilder LJ;
    public String LJFF;
    public List<C080U> LJI;
    public String LJII;
    public final boolean LJIIIIZZ;
    public final FormUrlEncodedTypedOutput LJIIIZ;
    public final MultipartTypedOutput LJIIJ;
    public TypedOutput LJIIJJI;
    public final int LJIIL;
    public final int LJIILIIL;
    public final String LJIILJJIL;
    public final boolean LJIILL;
    public int LJIILLIIL;
    public boolean LJIIZILJ;
    public final int LJIJ;
    public Object LJIJI;
    public final C0X7B LJIJJ;
    public AbstractC842530X3j LJIJJLI;
    public boolean LJIL;
    public final Map<Class<?>, Object> LJJ = new LinkedHashMap();

    public static class MimeOverridingTypedOutput extends AbsTypedOutput {
        public final TypedOutput delegate;
        public final String mimeType;

        @Override // com.bytedance.retrofit2.mime.AbsTypedOutput
        public String bodyCompressType() {
            TypedOutput typedOutput = this.delegate;
            if (typedOutput instanceof AbsTypedOutput) {
                return ((AbsTypedOutput) typedOutput).bodyCompressType();
            }
            return null;
        }

        @Override // com.bytedance.retrofit2.mime.AbsTypedOutput, com.bytedance.retrofit2.mime.TypedOutput
        public String fileName() {
            return this.delegate.fileName();
        }

        @Override // com.bytedance.retrofit2.mime.AbsTypedOutput
        public byte[] getOriginBody() {
            TypedOutput typedOutput = this.delegate;
            if (typedOutput instanceof AbsTypedOutput) {
                return ((AbsTypedOutput) typedOutput).getOriginBody();
            }
            return null;
        }

        @Override // com.bytedance.retrofit2.mime.AbsTypedOutput
        public boolean interceptRequestBody() {
            TypedOutput typedOutput = this.delegate;
            if (typedOutput instanceof AbsTypedOutput) {
                return ((AbsTypedOutput) typedOutput).interceptRequestBody();
            }
            return false;
        }

        @Override // com.bytedance.retrofit2.mime.AbsTypedOutput, com.bytedance.retrofit2.mime.TypedOutput
        public long length() {
            return this.delegate.length();
        }

        @Override // com.bytedance.retrofit2.mime.AbsTypedOutput, com.bytedance.retrofit2.mime.TypedOutput
        public String md5Stub() {
            this.mBodyMd5Stub = this.delegate.md5Stub();
            return this.mBodyMd5Stub;
        }

        public TypedOutput getDelegate() {
            return this.delegate;
        }

        @Override // com.bytedance.retrofit2.mime.AbsTypedOutput, com.bytedance.retrofit2.mime.TypedOutput
        public String mimeType() {
            return this.mimeType;
        }

        @Override // com.bytedance.retrofit2.mime.AbsTypedOutput, com.bytedance.retrofit2.mime.TypedOutput
        public void writeTo(OutputStream outputStream) {
            this.delegate.writeTo(outputStream);
        }

        public MimeOverridingTypedOutput(TypedOutput typedOutput, String str) {
            this.delegate = typedOutput;
            this.mimeType = str;
        }

        @Override // com.bytedance.retrofit2.mime.AbsTypedOutput
        public TTRequestCompressManager.CompressData compressRequestBody(String str, String str2, boolean z) {
            TypedOutput typedOutput = this.delegate;
            if (typedOutput instanceof AbsTypedOutput) {
                return ((AbsTypedOutput) typedOutput).compressRequestBody(str, str2, z);
            }
            return null;
        }
    }

    public static StringBuilder LIZJ(String str, String str2) {
        StringBuilder sb = new StringBuilder(str);
        if (str.endsWith("/")) {
            sb.deleteCharAt(sb.length() - 1);
        }
        sb.append(str2);
        return sb;
    }

    public final void LIZ(String str, String str2) {
        if (str != null) {
            if ("Content-Type".equalsIgnoreCase(str)) {
                this.LJII = str2;
                return;
            }
            List arrayList = this.LJI;
            if (arrayList == null) {
                arrayList = new ArrayList(2);
                this.LJI = arrayList;
            }
            arrayList.add(new C080U(str, str2));
            return;
        }
        throw new IllegalArgumentException("Header name must not be null.");
    }

    public final void LIZIZ(String str, String str2, boolean z) {
        char c;
        if (str != null) {
            try {
                StringBuilder sb = this.LJ;
                if (sb == null) {
                    sb = new StringBuilder();
                    this.LJ = sb;
                }
                if (sb.length() > 0) {
                    c = '&';
                } else {
                    c = '?';
                }
                sb.append(c);
                if (z) {
                    str = URLEncoder.encode(str, "UTF-8");
                    str2 = URLEncoder.encode(str2, "UTF-8");
                }
                if (str2 != null && !str2.isEmpty()) {
                    sb.append(str);
                    sb.append('=');
                    sb.append(str2);
                    return;
                }
                sb.append(str);
                return;
            } catch (UnsupportedEncodingException e) {
                TryCatchGuardChecker.doCheck(e);
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Unable to convert query parameter \"");
                sbLIZ.append(str);
                sbLIZ.append("\" value to UTF-8: ");
                sbLIZ.append(str2);
                throw new RuntimeException(C2188811AlT.LIZIZ(sbLIZ), e);
            }
        }
        throw new IllegalArgumentException("Query param name must not be null.");
    }

    public RequestBuilder(String str, C0X06 c0x06, String str2, List<C080U> list, String str3, int i, int i2, boolean z, int i3, boolean z2, int i4, Object obj, boolean z3, boolean z4, boolean z5, String str4, boolean z6) {
        this.LIZ = str;
        this.LIZIZ = c0x06;
        this.LIZLLL = str2;
        this.LJII = str3;
        this.LJIIL = i;
        this.LJIILIIL = i2;
        this.LJIILL = z;
        this.LJIILLIIL = i3;
        this.LJIIZILJ = z2;
        this.LJIJ = i4;
        this.LJIJI = obj;
        this.LJIIIIZZ = z3;
        this.LJI = list;
        this.LJIILJJIL = str4;
        if (z4) {
            FormUrlEncodedTypedOutput formUrlEncodedTypedOutput = new FormUrlEncodedTypedOutput(z6);
            this.LJIIIZ = formUrlEncodedTypedOutput;
            this.LJIIJ = null;
            this.LJIIJJI = formUrlEncodedTypedOutput;
            this.LJIJJ = null;
            return;
        }
        if (z5) {
            this.LJIIIZ = null;
            MultipartTypedOutput multipartTypedOutput = new MultipartTypedOutput();
            this.LJIIJ = multipartTypedOutput;
            this.LJIIJJI = multipartTypedOutput;
            C0X7B c0x7b = new C0X7B();
            this.LJIJJ = c0x7b;
            c0x7b.LJ(C0X7A.LJFF);
            return;
        }
        this.LJIIIZ = null;
        this.LJIIJ = null;
        this.LJIJJ = null;
    }
}
