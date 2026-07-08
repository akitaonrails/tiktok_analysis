package com.ss.android.ugc.aweme.commercialize.media.impl.handler.detail.substitutemusic.v1;

import X.C01GW;
import X.C09IC;
import X.C13BV;
import X.C15438062q;
import X.C1697810uHb;
import X.C1782880wUo;
import X.C1786400waU;
import X.C1954807lC;
import X.C1BNE;
import X.C2252321DDq;
import X.C436790HAv;
import X.C452501pT;
import X.EnumC1782860wUm;
import androidx.lifecycle.ViewModel;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.music.model.MusicDetail;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AwS571S0100000_27;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes28.dex */
public final class CommerceMusicSubstituteMusicVideoViewModel extends ViewModel {
    public MusicDetail LL;
    public final C01GW LLILLJJLI = C452501pT.LIZIZ(new AwS571S0100000_27(this, 217));
    public final C2252321DDq LLILLL = C1BNE.LIZ(new C436790HAv(C13BV.INSTANCE, ""));

    public final void vQ2(int i) {
        EnumC1782860wUm enumC1782860wUm;
        C436790HAv c436790HAv = (C436790HAv) C09IC.LIZIZ(this.LLILLL).getValue();
        if (i <= C1697810uHb.LJIIJ(c436790HAv.LIZ) && i >= 0) {
            String aid = ((C1786400waU) ListProtector.get(c436790HAv.LIZ, i)).LIZ.getAid();
            int i2 = C1782880wUo.LIZ[((C1786400waU) ListProtector.get(c436790HAv.LIZ, i)).LIZIZ.ordinal()];
            if (i2 != 1) {
                if (i2 != 2 && i2 != 3) {
                    throw new C1954807lC();
                }
                C2252321DDq c2252321DDq = this.LLILLL;
                List<C1786400waU> list = c436790HAv.LIZ;
                ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
                for (C1786400waU c1786400waU : list) {
                    if (Intrinsics.LJFF(c1786400waU.LIZ.getAid(), aid)) {
                        enumC1782860wUm = EnumC1782860wUm.PLAYING;
                    } else {
                        enumC1782860wUm = c1786400waU.LIZIZ;
                        if (enumC1782860wUm == EnumC1782860wUm.PLAYING) {
                            enumC1782860wUm = EnumC1782860wUm.PAUSED;
                        }
                    }
                    arrayList.add(C1786400waU.LIZ(c1786400waU, enumC1782860wUm));
                }
                c2252321DDq.setValue(C436790HAv.LIZ(c436790HAv, arrayList));
                return;
            }
            C2252321DDq c2252321DDq2 = this.LLILLL;
            List<C1786400waU> list2 = c436790HAv.LIZ;
            ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(list2, 10));
            for (C1786400waU c1786400waULIZ : list2) {
                if (Intrinsics.LJFF(c1786400waULIZ.LIZ.getAid(), aid)) {
                    c1786400waULIZ = C1786400waU.LIZ(c1786400waULIZ, EnumC1782860wUm.PAUSED);
                }
                arrayList2.add(c1786400waULIZ);
            }
            c2252321DDq2.setValue(C436790HAv.LIZ(c436790HAv, arrayList2));
        }
    }
}
