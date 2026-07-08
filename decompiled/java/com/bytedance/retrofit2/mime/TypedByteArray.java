package com.bytedance.retrofit2.mime;

import X.C2188811AlT;
import android.text.TextUtils;
import com.bytedance.frameworks.encryptor.EncryptorUtil;
import com.bytedance.retrofit2.mime.TTRequestCompressManager;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Arrays;
import ttpobfuscated.e3;

/* JADX INFO: loaded from: classes24.dex */
public class TypedByteArray extends AbsTypedOutput implements TypedInput {
    public byte[] bytes;
    public final String fakeFileName;
    public final String mimeType;

    @Override // com.bytedance.retrofit2.mime.AbsTypedOutput, com.bytedance.retrofit2.mime.TypedOutput
    public String fileName() {
        if (TextUtils.isEmpty(this.fakeFileName)) {
            return null;
        }
        return this.fakeFileName;
    }

    @Override // com.bytedance.retrofit2.mime.AbsTypedOutput
    public byte[] getOriginBody() {
        return TTRequestCompressManager.decompressDataByType(this.bytes, this.mType, this.mOriginBodySize);
    }

    public int hashCode() {
        return (this.mimeType.hashCode() * 31) + Arrays.hashCode(this.bytes);
    }

    @Override // com.bytedance.retrofit2.mime.TypedInput
    public InputStream in() {
        return new ByteArrayInputStream(this.bytes);
    }

    @Override // com.bytedance.retrofit2.mime.AbsTypedOutput
    public boolean interceptRequestBody() {
        byte[] bArrLIZ;
        byte[] bArr = this.bytes;
        if (bArr == null || bArr.length > 102400 || (bArrLIZ = EncryptorUtil.LIZ(bArr.length, bArr)) == null) {
            return false;
        }
        this.bytes = bArrLIZ;
        this.mIsBodyEncrypted = true;
        return true;
    }

    @Override // com.bytedance.retrofit2.mime.AbsTypedOutput, com.bytedance.retrofit2.mime.TypedOutput
    public long length() {
        return this.bytes.length;
    }

    @Override // com.bytedance.retrofit2.mime.AbsTypedOutput, com.bytedance.retrofit2.mime.TypedOutput
    public String md5Stub() {
        byte[] bArr = this.bytes;
        if (bArr == null) {
            return null;
        }
        this.mBodyMd5Stub = DigestUtil.md5Hex(bArr);
        return this.mBodyMd5Stub;
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TypedByteArray[length=");
        sbLIZ.append(length());
        sbLIZ.append(e3.f);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public byte[] getBytes() {
        return this.bytes;
    }

    @Override // com.bytedance.retrofit2.mime.AbsTypedOutput, com.bytedance.retrofit2.mime.TypedOutput
    public String mimeType() {
        return this.mimeType;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        TypedByteArray typedByteArray = (TypedByteArray) obj;
        if (Arrays.equals(this.bytes, typedByteArray.bytes) && this.mimeType.equals(typedByteArray.mimeType)) {
            return true;
        }
        return false;
    }

    @Override // com.bytedance.retrofit2.mime.AbsTypedOutput, com.bytedance.retrofit2.mime.TypedOutput
    public void writeTo(OutputStream outputStream) throws IOException {
        outputStream.write(this.bytes);
    }

    public TypedByteArray(String str, byte[] bArr, String... strArr) {
        String str2;
        if (strArr != null && strArr.length > 0) {
            str2 = strArr[0];
        } else {
            str2 = null;
        }
        if (str == null) {
            if (TextUtils.isEmpty(str2)) {
                str = "application/unknown";
            } else {
                str = "application/octet-stream";
            }
        }
        if (bArr != null) {
            this.mimeType = str;
            this.bytes = bArr;
            this.fakeFileName = str2;
            return;
        }
        throw new NullPointerException("bytes null");
    }

    @Override // com.bytedance.retrofit2.mime.AbsTypedOutput
    public TTRequestCompressManager.CompressData compressRequestBody(String str, String str2, boolean z) throws Throwable {
        byte[] bArr = this.bytes;
        if (bArr == null) {
            return null;
        }
        TTRequestCompressManager.CompressData compressDataCompressBody = TTRequestCompressManager.compressBody(bArr, bArr.length, str, str2, z);
        if (compressDataCompressBody != null && compressDataCompressBody.data != null) {
            this.mOriginBodySize = this.bytes.length;
            this.bytes = compressDataCompressBody.data;
            this.mType = compressDataCompressBody.contentEncoding;
        }
        return compressDataCompressBody;
    }
}
