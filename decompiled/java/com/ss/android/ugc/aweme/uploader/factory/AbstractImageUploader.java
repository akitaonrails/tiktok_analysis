package com.ss.android.ugc.aweme.uploader.factory;

import X.C2188811AlT;
import X.InterfaceC2207871Bb7;

/* JADX INFO: loaded from: classes23.dex */
public abstract class AbstractImageUploader {
    public boolean LIZ;
    public boolean LIZIZ;

    public void LIZ() {
    }

    public void LIZIZ() {
    }

    public abstract void LIZJ();

    public abstract void LIZLLL();

    public abstract void LJ();

    public abstract void LJFF();

    public abstract void LJI();

    public abstract void LJII();

    public abstract String LJIIIIZZ();

    public abstract void LJIIIZ(int i, String[] strArr);

    public abstract void LJIIJ(InterfaceC2207871Bb7 interfaceC2207871Bb7);

    public abstract void LJIIJJI(boolean z);

    public abstract void LJIIL(String str);

    public abstract void LJIILIIL();

    /* JADX INFO: loaded from: classes9.dex */
    public static final class ImageUploadInfo {
        public String mEncryptionImageTosKey;
        public long mErrorCode;
        public String mErrorMsg;
        public String mExtra;
        public int mFileIndex;
        public String mImageToskey;
        public String mMetaInfo;
        public long mProgress;

        public ImageUploadInfo() {
            this(-1, null, 0L, null, null, 0L, null, null);
        }

        public String toString() {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("ImageUploadInfo(mFileIndex=");
            sbLIZ.append(this.mFileIndex);
            sbLIZ.append(", mImageToskey=");
            sbLIZ.append(this.mImageToskey);
            sbLIZ.append(", mErrorCode=");
            sbLIZ.append(this.mErrorCode);
            sbLIZ.append(", mExtra=");
            sbLIZ.append(this.mExtra);
            sbLIZ.append(", mEncryptionImageTosKey=");
            sbLIZ.append(this.mEncryptionImageTosKey);
            sbLIZ.append(", mProgress=");
            sbLIZ.append(this.mProgress);
            sbLIZ.append(", mMetaInfo=");
            sbLIZ.append(this.mMetaInfo);
            sbLIZ.append(", mErrorMsg=");
            sbLIZ.append(this.mErrorMsg);
            sbLIZ.append(')');
            return C2188811AlT.LIZIZ(sbLIZ);
        }

        public final void setMEncryptionImageTosKey(String str) {
            this.mEncryptionImageTosKey = str;
        }

        public final void setMErrorCode(long j) {
            this.mErrorCode = j;
        }

        public final void setMErrorMsg(String str) {
            this.mErrorMsg = str;
        }

        public final void setMExtra(String str) {
            this.mExtra = str;
        }

        public final void setMFileIndex(int i) {
            this.mFileIndex = i;
        }

        public final void setMImageToskey(String str) {
            this.mImageToskey = str;
        }

        public final void setMMetaInfo(String str) {
            this.mMetaInfo = str;
        }

        public final void setMProgress(long j) {
            this.mProgress = j;
        }

        public ImageUploadInfo(int i, String str, long j, String str2, String str3, long j2, String str4, String str5) {
            this.mFileIndex = i;
            this.mImageToskey = str;
            this.mErrorCode = j;
            this.mExtra = str2;
            this.mEncryptionImageTosKey = str3;
            this.mProgress = j2;
            this.mMetaInfo = str4;
            this.mErrorMsg = str5;
        }
    }
}
