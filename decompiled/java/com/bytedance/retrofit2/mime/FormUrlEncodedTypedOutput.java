package com.bytedance.retrofit2.mime;

import com.bytedance.frameworks.encryptor.EncryptorUtil;
import com.bytedance.retrofit2.mime.TTRequestCompressManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes24.dex */
public final class FormUrlEncodedTypedOutput extends AbsTypedOutput {
    public ByteArrayOutputStream content;
    public final boolean enableRecordFields;
    public final Map<String, List<String>> fields;

    @Override // com.bytedance.retrofit2.mime.AbsTypedOutput, com.bytedance.retrofit2.mime.TypedOutput
    public String fileName() {
        return null;
    }

    @Override // com.bytedance.retrofit2.mime.AbsTypedOutput, com.bytedance.retrofit2.mime.TypedOutput
    public String mimeType() {
        return "application/x-www-form-urlencoded; charset=UTF-8";
    }

    @Override // com.bytedance.retrofit2.mime.AbsTypedOutput
    public byte[] getOriginBody() {
        return TTRequestCompressManager.decompressDataByType(this.content.toByteArray(), this.mType, this.mOriginBodySize);
    }

    @Override // com.bytedance.retrofit2.mime.AbsTypedOutput
    public boolean interceptRequestBody() {
        byte[] bArrLIZ;
        byte[] byteArray = this.content.toByteArray();
        if (byteArray == null || byteArray.length > 102400 || (bArrLIZ = EncryptorUtil.LIZ(byteArray.length, byteArray)) == null) {
            return false;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(bArrLIZ.length);
        this.content = byteArrayOutputStream;
        byteArrayOutputStream.write(bArrLIZ, 0, bArrLIZ.length);
        this.mIsBodyEncrypted = true;
        return true;
    }

    @Override // com.bytedance.retrofit2.mime.AbsTypedOutput, com.bytedance.retrofit2.mime.TypedOutput
    public long length() {
        return this.content.size();
    }

    @Override // com.bytedance.retrofit2.mime.AbsTypedOutput, com.bytedance.retrofit2.mime.TypedOutput
    public String md5Stub() {
        this.mBodyMd5Stub = DigestUtil.md5Hex(this.content.toByteArray());
        return this.mBodyMd5Stub;
    }

    public FormUrlEncodedTypedOutput() {
        this.content = new ByteArrayOutputStream();
        this.fields = new HashMap();
        this.enableRecordFields = false;
    }

    public Map<String, List<String>> fields() {
        return this.fields;
    }

    public FormUrlEncodedTypedOutput(boolean z) {
        this.content = new ByteArrayOutputStream();
        this.fields = new HashMap();
        this.enableRecordFields = z;
    }

    @Override // com.bytedance.retrofit2.mime.AbsTypedOutput, com.bytedance.retrofit2.mime.TypedOutput
    public void writeTo(OutputStream outputStream) throws IOException {
        outputStream.write(this.content.toByteArray());
    }

    public void addField(String str, String str2) {
        addField(str, true, str2, true);
    }

    @Override // com.bytedance.retrofit2.mime.AbsTypedOutput
    public TTRequestCompressManager.CompressData compressRequestBody(String str, String str2, boolean z) throws Throwable {
        byte[] byteArray = this.content.toByteArray();
        if (byteArray == null) {
            return null;
        }
        TTRequestCompressManager.CompressData compressDataCompressBody = TTRequestCompressManager.compressBody(byteArray, byteArray.length, str, str2, z);
        if (compressDataCompressBody != null && compressDataCompressBody.data != null) {
            this.mOriginBodySize = byteArray.length;
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(compressDataCompressBody.data.length);
            this.content = byteArrayOutputStream;
            byte[] bArr = compressDataCompressBody.data;
            byteArrayOutputStream.write(bArr, 0, bArr.length);
            this.mType = compressDataCompressBody.contentEncoding;
        }
        return compressDataCompressBody;
    }

    public void addField(String str, boolean z, String str2, boolean z2) {
        if (str != null) {
            if (str2 != null) {
                if (this.content.size() > 0) {
                    this.content.write(38);
                }
                if (this.enableRecordFields) {
                    if (this.fields.containsKey(str)) {
                        this.fields.get(str).add(str2);
                    } else {
                        ArrayList arrayList = new ArrayList();
                        arrayList.add(str2);
                        this.fields.put(str, arrayList);
                    }
                }
                if (z) {
                    try {
                        str = URLEncoder.encode(str, "UTF-8");
                    } catch (IOException e) {
                        TryCatchGuardChecker.doCheck(e);
                        throw new RuntimeException(e);
                    }
                }
                if (z2) {
                    str2 = URLEncoder.encode(str2, "UTF-8");
                }
                this.content.write(str.getBytes("UTF-8"));
                this.content.write(61);
                this.content.write(str2.getBytes("UTF-8"));
                return;
            }
            throw new NullPointerException("value");
        }
        throw new NullPointerException("name");
    }
}
