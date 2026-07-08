package z76;

import X.C1290650jgt;
import X.C1290850jhD;
import X.C2188811AlT;
import X.InterfaceC1290730jh1;
import android.graphics.Bitmap;
import kotlin.text.a0;
import org.json.JSONException;

/* JADX INFO: loaded from: classes21.dex */
public final class j implements g$a {
    public final /* synthetic */ InterfaceC1290730jh1<Bitmap> LIZ;
    public final /* synthetic */ C1290850jhD LIZIZ;
    public final /* synthetic */ String LIZJ;

    @Override // z76.g$a
    public final void onFailed(String str) throws JSONException {
        this.LIZIZ.LLLZ = false;
        if (!a0.LJJJIL(str)) {
            C1290850jhD c1290850jhD = this.LIZIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("useXResourceFrom: ");
            this.LIZIZ.getClass();
            sbLIZ.append((Object) null);
            sbLIZ.append(", mSrcUrl: ");
            sbLIZ.append((Object) this.LIZIZ.LLLLZIL);
            sbLIZ.append(", path: ");
            sbLIZ.append(this.LIZJ);
            sbLIZ.append(", msg: ");
            sbLIZ.append(str);
            c1290850jhD.LJLLJ(1, C2188811AlT.LIZIZ(sbLIZ), this.LIZJ);
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("fetch bitmap failed, useXResourceFrom: ");
        this.LIZIZ.getClass();
        sbLIZ2.append((Object) null);
        sbLIZ2.append(", path: ");
        sbLIZ2.append(this.LIZJ);
        this.LIZIZ.LJZ("error", C1290850jhD.LJLLILLLL(1, C2188811AlT.LIZIZ(sbLIZ2)));
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append("fetchBitmap mSrcUrl=`");
        sbLIZ3.append((Object) this.LIZIZ.LLLLZIL);
        sbLIZ3.append("`, filePath=`");
        sbLIZ3.append(this.LIZJ);
        sbLIZ3.append("` not exists.");
        C2188811AlT.LIZIZ(sbLIZ3);
        this.LIZ.onFailed();
    }

    @Override // z76.g$a
    public final void LIZ(Bitmap bitmap, String str) {
        this.LIZ.onSuccess(bitmap);
    }

    public j(C1290650jgt c1290650jgt, C1290850jhD c1290850jhD, String str) {
        this.LIZ = c1290650jgt;
        this.LIZIZ = c1290850jhD;
        this.LIZJ = str;
    }
}
