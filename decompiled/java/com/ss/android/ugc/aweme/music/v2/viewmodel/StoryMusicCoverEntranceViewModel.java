package com.ss.android.ugc.aweme.music.v2.viewmodel;

import X.C01GW;
import X.C0PEM;
import X.C23250099c;
import X.C298510Bmz;
import X.C452501pT;
import X.C630570OoJ;
import X.C630580OoK;
import X.C630610OoN;
import X.C630620OoO;
import X.InterfaceC0148002o;
import X.InterfaceC1605670rsz;
import X.InterfaceC630590OoL;
import androidx.lifecycle.ViewModelKt;
import com.ss.android.ugc.aweme.music.v2.assem.story.IStoryMusicCoverEntranceViewModel;
import com.ss.android.ugc.aweme.service.ISocPubStatusRepoService;
import com.ss.android.ugc.aweme.services.IMusicExService;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.AFwS195S0000000_9;
import kotlin.jvm.internal.AwS553S0100000_9;
import kotlin.jvm.internal.AwS588S0100000_9;

/* JADX INFO: loaded from: classes10.dex */
public final class StoryMusicCoverEntranceViewModel extends IStoryMusicCoverEntranceViewModel {
    public String LL;
    public final C01GW LLILLJJLI = C452501pT.LIZIZ(AFwS195S0000000_9.get$arr$(260));
    public final C01GW LLILLL = C452501pT.LIZIZ(AFwS195S0000000_9.get$arr$(261));
    public final C630580OoK LLILZ = new InterfaceC630590OoL() { // from class: X.0OoK
        @Override // X.InterfaceC630590OoL
        public final void LIZ(List<String> list) {
            if (list != null) {
                this.LIZ.setState(new AwS588S0100000_9(list, (List<InterfaceC1891350zJl>) 338));
            }
        }
    };
    public final C01GW LLILZIL = C452501pT.LIZIZ(new AwS553S0100000_9(this, 1354));

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C630570OoJ(0);
    }

    @Override // com.ss.android.ugc.aweme.music.v2.assem.story.IStoryMusicCoverEntranceViewModel
    public final void wQ2() {
        C630620OoO c630620OoO = C630620OoO.LIZ;
        int iHashCode = hashCode();
        c630620OoO.getClass();
        C630620OoO.LIZJ.remove(Integer.valueOf(iHashCode));
        Integer numValueOf = Integer.valueOf(hashCode());
        c630620OoO.getClass();
        if (numValueOf != null) {
            numValueOf.intValue();
            C630620OoO.LIZIZ.remove(numValueOf);
        }
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [X.0OoK] */
    public StoryMusicCoverEntranceViewModel() {
        C630620OoO c630620OoO = C630620OoO.LIZ;
        int iHashCode = hashCode();
        C630580OoK c630580OoK = this.LLILZ;
        c630620OoO.getClass();
        ConcurrentHashMap<Integer, WeakReference<InterfaceC630590OoL>> concurrentHashMap = C630620OoO.LIZJ;
        WeakReference<InterfaceC630590OoL> weakReference = concurrentHashMap.get(Integer.valueOf(iHashCode));
        if (weakReference == null || weakReference.get() == null) {
            concurrentHashMap.put(Integer.valueOf(iHashCode), new WeakReference<>(c630580OoK));
        }
    }

    @Override // com.ss.android.ugc.aweme.music.v2.assem.story.IStoryMusicCoverEntranceViewModel
    public final void xQ2() {
        ISocPubStatusRepoService iSocPubStatusRepoService;
        if (C298510Bmz.LIZ() && (iSocPubStatusRepoService = (ISocPubStatusRepoService) this.LLILLL.getValue()) != null) {
            iSocPubStatusRepoService.LJIJJ(this, (InterfaceC1605670rsz) this.LLILZIL.getValue());
        }
    }

    @Override // com.ss.android.ugc.aweme.music.v2.assem.story.IStoryMusicCoverEntranceViewModel
    public final void yQ2(String str) {
        this.LL = str;
    }

    @Override // com.ss.android.ugc.aweme.music.v2.assem.story.IStoryMusicCoverEntranceViewModel
    public final void vQ2(int i, String str) {
        IMusicExService iMusicExService;
        String str2;
        if (!C298510Bmz.LIZ() || (iMusicExService = (IMusicExService) this.LLILLJJLI.getValue()) == null || (str2 = this.LL) == null) {
            return;
        }
        C23250099c.LIZLLL(ViewModelKt.getViewModelScope(this), C0PEM.LIZJ, null, new C630610OoN(iMusicExService, str2, str, i, this, null), 2);
    }
}
