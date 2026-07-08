package com.ss.android.ugc.aweme.verify.ab;

import X.C09CT;
import X.C2188811AlT;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class OcrVerifyGuidePictureSettings {
    public static final OcrVerifyGuidePictureModel LIZ = new OcrVerifyGuidePictureModel(null);

    public static final class DataObject {

        @C09CT("image_url")
        public final String imageUrl;

        public DataObject() {
            this(null);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof DataObject) && Intrinsics.LJFF(this.imageUrl, ((DataObject) obj).imageUrl);
        }

        public final int hashCode() {
            String str = this.imageUrl;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public final String toString() {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("DataObject(imageUrl=");
            sbLIZ.append(this.imageUrl);
            sbLIZ.append(')');
            return C2188811AlT.LIZIZ(sbLIZ);
        }

        public DataObject(String str) {
            this.imageUrl = str;
        }
    }

    public static final class OcrVerifyGuidePictureModel {

        @C09CT("data")
        public DataObject dataObject;

        public OcrVerifyGuidePictureModel() {
            this(null);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OcrVerifyGuidePictureModel) && Intrinsics.LJFF(this.dataObject, ((OcrVerifyGuidePictureModel) obj).dataObject);
        }

        public final int hashCode() {
            DataObject dataObject = this.dataObject;
            if (dataObject == null) {
                return 0;
            }
            return dataObject.hashCode();
        }

        public final String toString() {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("OcrVerifyGuidePictureModel(dataObject=");
            sbLIZ.append(this.dataObject);
            sbLIZ.append(')');
            return C2188811AlT.LIZIZ(sbLIZ);
        }

        public OcrVerifyGuidePictureModel(DataObject dataObject) {
            this.dataObject = dataObject;
        }
    }
}
