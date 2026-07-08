package com.bytedance.retrofit2.mime;

import X.C0VSP;
import X.C2188811AlT;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes4.dex */
public class TypedFile implements TypedInput, TypedOutput {
    public final File file;
    public final String mimeType;

    @Override // com.bytedance.retrofit2.mime.TypedOutput
    public String md5Stub() {
        return null;
    }

    @Override // com.bytedance.retrofit2.mime.TypedOutput
    public String fileName() {
        return this.file.getName();
    }

    public int hashCode() {
        return this.file.hashCode();
    }

    @Override // com.bytedance.retrofit2.mime.TypedInput
    public InputStream in() {
        return new C0VSP(this.file);
    }

    @Override // com.bytedance.retrofit2.mime.TypedInput
    public long length() {
        return this.file.length();
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(this.file.getAbsolutePath());
        sbLIZ.append(" (");
        sbLIZ.append(mimeType());
        sbLIZ.append(")");
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public File file() {
        return this.file;
    }

    @Override // com.bytedance.retrofit2.mime.TypedInput
    public String mimeType() {
        return this.mimeType;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof TypedFile) {
            return this.file.equals(((TypedFile) obj).file);
        }
        return false;
    }

    public void moveTo(TypedFile typedFile) throws IOException {
        if (mimeType().equals(typedFile.mimeType())) {
            if (this.file.renameTo(typedFile.file())) {
                return;
            } else {
                throw new IOException("Rename failed!");
            }
        }
        throw new IOException("Type mismatch.");
    }

    @Override // com.bytedance.retrofit2.mime.TypedOutput
    public void writeTo(OutputStream outputStream) throws IOException {
        byte[] bArr = new byte[SpeechEngineDefines.TTS_WORK_MODE_BOTH];
        C0VSP c0vsp = new C0VSP(this.file);
        while (true) {
            try {
                int i = c0vsp.read(bArr);
                if (i != -1) {
                    outputStream.write(bArr, 0, i);
                } else {
                    c0vsp.close();
                    return;
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                c0vsp.close();
                throw th;
            }
        }
    }

    public TypedFile(String str, File file) {
        str = str == null ? "application/octet-stream" : str;
        if (file != null) {
            this.mimeType = str;
            this.file = file;
            return;
        }
        throw new NullPointerException("file");
    }
}
