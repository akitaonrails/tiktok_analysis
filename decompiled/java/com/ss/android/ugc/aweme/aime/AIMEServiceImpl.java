package com.ss.android.ugc.aweme.aime;

import X.C0PEM;
import X.C1398505df;
import X.C1445850njD;
import X.C19EG;
import X.C23250099c;
import X.C2481209nu;
import X.C533930Kwp;
import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Build;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.bytedance.ies.foundation.activity.BaseActivity;
import com.ss.android.ugc.aweme.creative.model.edit.SrcImageInfo;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.aigc.AimeCameraActivity;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final class AIMEServiceImpl implements IAIMEService {
    @Override // com.ss.android.ugc.aweme.aime.IAIMEService
    public final void LIZ(Activity activity) {
        if (activity instanceof AimeCameraActivity) {
            ((BaseActivity) activity).finish();
        }
    }

    @Override // com.ss.android.ugc.aweme.aime.IAIMEService
    public final SrcImageInfo LIZIZ(Context context, String str) throws Exception {
        Pair pair;
        String strLIZIZ = new C2481209nu(str, context).LIZIZ(C1445850njD.LIZ);
        if (strLIZIZ == null) {
            strLIZIZ = "";
        }
        Bitmap bitmapDecodeFile = BitmapFactory.decodeFile(str);
        if (bitmapDecodeFile == null) {
            pair = new Pair(0, 0);
        } else {
            pair = new Pair(Integer.valueOf(bitmapDecodeFile.getWidth()), Integer.valueOf(bitmapDecodeFile.getHeight()));
        }
        return new SrcImageInfo(strLIZIZ, ((Number) pair.getFirst()).intValue(), ((Number) pair.getSecond()).intValue(), null, null, 24, null);
    }

    @Override // com.ss.android.ugc.aweme.aime.IAIMEService
    public final void LIZJ(ViewModel viewModel, String str, C19EG c19eg, Function1<? super Boolean, Unit> function1) {
        if (Build.VERSION.SDK_INT < 29 && !C533930Kwp.LJFF()) {
            function1.invoke(Boolean.FALSE);
        } else {
            C23250099c.LIZLLL(ViewModelKt.getViewModelScope(viewModel), C0PEM.LIZJ, null, new C1398505df(c19eg, str, null, function1), 2);
        }
    }
}
