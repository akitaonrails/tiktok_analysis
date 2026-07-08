package muk;

import X.C01GW;
import X.C19719612Di;
import X.C2176308fp;
import X.C2176708ft;
import X.C452501pT;
import X.C537970L7z;
import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.creative.model.editorpro.EditorProSchemeModel;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.effectmanager.effect.model.EffectCategoryModel;
import java.util.List;
import kotlin.jvm.internal.AFwS189S0000000_3;
import kotlin.jvm.internal.AFwS231S0000000_3;

/* JADX INFO: loaded from: classes4.dex */
public final class m1 extends C2176308fp {
    public final ShortVideoContext LIZLLL;
    public final C01GW LJ = C452501pT.LIZIZ(AFwS189S0000000_3.get$arr$(1222));

    public m1(ShortVideoContext shortVideoContext) {
        this.LIZLLL = shortVideoContext;
    }

    @Override // X.C2176308fp, X.C091J
    public final void LIZJ(List<EffectCategoryModel> list) {
        EditorProSchemeModel editorProSchemeModel;
        CreativeModel creativeModel;
        super.LIZJ(list);
        C2176708ft.LIZ(this.LIZLLL, list, false);
        ShortVideoContext shortVideoContext = this.LIZLLL;
        if (shortVideoContext != null && (creativeModel = shortVideoContext.creativeModel) != null) {
            editorProSchemeModel = creativeModel.editorProSchemeModel;
        } else {
            editorProSchemeModel = null;
        }
        if (C537970L7z.LIZJ(editorProSchemeModel)) {
            C19719612Di.LJJIIJ(list, AFwS231S0000000_3.get$arr$(193), true);
        }
    }
}
