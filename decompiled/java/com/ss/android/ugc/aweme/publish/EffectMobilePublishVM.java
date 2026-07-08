package com.ss.android.ugc.aweme.publish;

import X.C01GW;
import X.C0PEM;
import X.C1557090qcd;
import X.C1737090vIx;
import X.C23250099c;
import X.C452501pT;
import X.EnumC1736950vIj;
import android.content.Context;
import android.net.Uri;
import com.ss.android.ugc.aweme.prop.mobileefffect.EditImage;
import com.ss.android.ugc.aweme.prop.mobileefffect.EditImageEffectImgCreatorData;
import com.ss.android.ugc.aweme.prop.mobileefffect.EffectEditVM;
import kotlin.jvm.internal.AFwS215S0000000_26;
import kotlin.jvm.internal.AFwS268S0000000_26;
import kotlin.jvm.internal.AwS392S0200000_26;
import kotlin.jvm.internal.AwS605S0100000_26;

/* JADX INFO: loaded from: classes27.dex */
public final class EffectMobilePublishVM extends EffectEditVM {
    public final C01GW LLIZ = C452501pT.LIZIZ(AFwS215S0000000_26.get$arr$(251));

    @Override // com.ss.android.ugc.aweme.prop.mobileefffect.EffectEditVM
    public final void FQ2() {
        withState(AFwS268S0000000_26.get$arr$(457));
    }

    @Override // com.ss.android.ugc.aweme.prop.mobileefffect.EffectEditVM
    public final void IQ2(Uri uri, EditImageEffectImgCreatorData editImageEffectImgCreatorData) {
        String path = uri.getPath();
        if (path == null || path.length() == 0 || editImageEffectImgCreatorData == null) {
            return;
        }
        CQ2();
        EditImage editImage = new EditImage(uri, System.currentTimeMillis(), editImageEffectImgCreatorData);
        EditImageEffectImgCreatorData editImageEffectImgCreatorData2 = editImage.effectImgCreatorData;
        if (editImageEffectImgCreatorData2 != null) {
            setState(new AwS392S0200000_26(editImageEffectImgCreatorData2, editImage, 94));
        }
    }

    public final void JQ2(Context context, C1557090qcd c1557090qcd, EnumC1736950vIj enumC1736950vIj) {
        setState(new AwS605S0100000_26(enumC1736950vIj, 469));
        C23250099c.LIZLLL(getAssemVMScope(), C0PEM.LIZ, null, new C1737090vIx(this, enumC1736950vIj, context, c1557090qcd, null), 2);
    }
}
