package com.ss.android.ugc.aweme.search.pages.result.autoplay.core.model.enablestatus;

import X.AbstractC641560PEk;
import X.C0PDO;
import X.C19EG;
import X.C587090N0x;
import X.C588550N6n;
import X.C588600N6s;
import X.C679340Qkm;
import X.InterfaceC588620N6u;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public final class MusicPlayStatus extends AbstractC641560PEk {
    public static final C0PDO LLILLJJLI = new Object() { // from class: X.0PDO
    };
    public static volatile boolean LLILLL;

    @Override // X.InterfaceC588620N6u
    public final MutableLiveData<Integer> LIZ() {
        return null;
    }

    public static final class MusicPlayStatusVM extends ViewModel {
        public MusicPlayStatus LL;

        @Override // androidx.lifecycle.ViewModel
        public final void onCleared() {
            C588600N6s c588600N6s;
            super.onCleared();
            synchronized (MusicPlayStatus.LLILLJJLI) {
                try {
                    MusicPlayStatus.LLILLL = false;
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
            MusicPlayStatus musicPlayStatus = this.LL;
            if (musicPlayStatus == null || (c588600N6s = musicPlayStatus.LL) == null) {
                return;
            }
            C588550N6n c588550N6n = new C588550N6n(1, null);
            C587090N0x c587090N0x = c588600N6s.LIZ;
            boolean z = c588550N6n.LIZ == 1;
            List<InterfaceC588620N6u> list = c588550N6n.LIZIZ;
            if (list == null) {
                list = c587090N0x.LIZIZ;
            }
            c587090N0x.getClass();
            c588600N6s.LIZ = new C587090N0x(z, list);
        }
    }

    public MusicPlayStatus(Fragment fragment, C19EG c19eg) {
        if (c19eg != null) {
            ((MusicPlayStatusVM) C679340Qkm.LIZIZ(fragment, c19eg).get(MusicPlayStatusVM.class)).LL = this;
        }
    }
}
