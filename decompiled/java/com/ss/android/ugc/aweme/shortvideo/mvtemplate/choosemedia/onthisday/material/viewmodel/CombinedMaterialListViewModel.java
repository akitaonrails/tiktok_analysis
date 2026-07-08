package com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.onthisday.material.viewmodel;

import X.C01GW;
import X.C13BV;
import X.C1BNE;
import X.C2252321DDq;
import X.C452501pT;
import X.C470730Id5;
import X.EnumC485010J0h;
import androidx.lifecycle.ViewModel;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.model.TikTokMediaModel;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.model.onthisday.OnThisDayTiktokMediaModel;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AwS551S0100000_7;
import kotlin.jvm.internal.AwS552S0100000_8;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class CombinedMaterialListViewModel extends ViewModel {
    public final C01GW LL = C452501pT.LIZIZ(new AwS552S0100000_8(this, 284));
    public final C2252321DDq LLILLJJLI;
    public final C2252321DDq LLILLL;
    public C470730Id5 LLILZ;
    public final C01GW LLILZIL;
    public final C2252321DDq LLILZLL;
    public final C2252321DDq LLIZ;
    public final List<OnThisDayTiktokMediaModel> LLIZLLLIL;
    public final List<OnThisDayTiktokMediaModel> LLJ;

    public CombinedMaterialListViewModel() {
        C2252321DDq c2252321DDqLIZ = C1BNE.LIZ(EnumC485010J0h.INITIAL_LOADING);
        this.LLILLJJLI = c2252321DDqLIZ;
        this.LLILLL = c2252321DDqLIZ;
        this.LLILZIL = C452501pT.LIZIZ(new AwS551S0100000_7(this, 420));
        C2252321DDq c2252321DDqLIZ2 = C1BNE.LIZ(C13BV.INSTANCE);
        this.LLILZLL = c2252321DDqLIZ2;
        this.LLIZ = c2252321DDqLIZ2;
        this.LLIZLLLIL = new ArrayList();
        this.LLJ = new ArrayList();
    }

    public final void vQ2(List<OnThisDayTiktokMediaModel> list) {
        int i;
        ((ArrayList) this.LLJ).clear();
        ((ArrayList) this.LLJ).addAll((Collection) this.LLIZ.getValue());
        Iterator it2 = ((ArrayList) list).iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            MediaModel mediaModel = (MediaModel) it2.next();
            List<OnThisDayTiktokMediaModel> list2 = this.LLJ;
            if (!(list2 instanceof Collection) || !((ArrayList) list2).isEmpty()) {
                Iterator it3 = ((ArrayList) list2).iterator();
                while (it3.hasNext()) {
                    if (Intrinsics.LJFF(((MediaModel) it3.next()).id, mediaModel.id)) {
                        break;
                    }
                }
            }
            ((ArrayList) this.LLJ).add(mediaModel);
        }
        int size = ((ArrayList) this.LLJ).size();
        for (i = 0; i < size; i++) {
            ((TikTokMediaModel) ListProtector.get(this.LLJ, i)).originIndex = i;
        }
    }
}
