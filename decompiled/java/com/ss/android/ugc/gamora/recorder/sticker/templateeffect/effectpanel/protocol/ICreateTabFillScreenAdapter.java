package com.ss.android.ugc.gamora.recorder.sticker.templateeffect.effectpanel.protocol;

import X.C1636960shS;
import X.C2188811AlT;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes26.dex */
public interface ICreateTabFillScreenAdapter {
    ICreateTabFillScreenAdapter LLJJJIL(Map<String, String> map);

    FakeEffect getItem();

    public static final class FakeEffect extends Effect {
        public static final int $stable = 8;
        public final List<C1636960shS> showParamsList;

        public final FakeEffect copy(List<C1636960shS> list) {
            return new FakeEffect(list);
        }

        @Override // com.ss.android.ugc.effectmanager.effect.model.Effect
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof FakeEffect) && Intrinsics.LJFF(this.showParamsList, ((FakeEffect) obj).showParamsList);
        }

        @Override // com.ss.android.ugc.effectmanager.effect.model.Effect
        public int hashCode() {
            return this.showParamsList.hashCode();
        }

        @Override // com.ss.android.ugc.effectmanager.effect.model.Effect
        public String toString() {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("FakeEffect(showParamsList=");
            sbLIZ.append(this.showParamsList);
            sbLIZ.append(')');
            return C2188811AlT.LIZIZ(sbLIZ);
        }

        public final List<C1636960shS> getShowParamsList() {
            return this.showParamsList;
        }

        public FakeEffect(List<C1636960shS> list) {
            super(null, null, null, null, null, null, null, null, null, null, 0, null, null, null, null, null, null, null, 0, 0, 0, null, null, null, null, null, null, null, null, null, null, false, null, false, null, null, 0L, null, null, 0L, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, 0L, null, null, null, 0L, 0L, null, null, null, null, null, false, false, -1, -1, 15, null);
            this.showParamsList = list;
        }
    }
}
