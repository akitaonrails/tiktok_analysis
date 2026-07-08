package com.ss.android.ugc.aweme.mix.pickcandidate;

import X.C01GW;
import X.C1165690gRL;
import X.C452501pT;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.PlayListInfo;
import com.ss.android.ugc.aweme.feed.model.Video;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AwS562S0100000_18;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.u;

/* JADX INFO: loaded from: classes19.dex */
public final class MultiVideoViewModel extends ViewModel {
    public boolean LLILZLL;
    public boolean LLIZLLLIL;
    public boolean LLJILJIL;
    public boolean LLJILJILJ;
    public final List<Aweme> LL = new ArrayList();
    public final List<C1165690gRL> LLILLJJLI = new ArrayList();
    public final List<Aweme> LLILLL = new ArrayList();
    public final MutableLiveData<Integer> LLILZ = new MutableLiveData<>();
    public final MutableLiveData<Integer> LLILZIL = new MutableLiveData<>();
    public boolean LLIZ = true;
    public final MutableLiveData<Integer> LLJ = new MutableLiveData<>();
    public List<String> LLJI = new ArrayList();
    public String LLJIJIL = "";
    public final C01GW LLJILLL = C452501pT.LIZIZ(new AwS562S0100000_18(this, 680));

    public final List<C1165690gRL> vQ2(List<? extends Aweme> list) {
        UrlModel cover;
        boolean z;
        ArrayList arrayList = new ArrayList();
        if (list != null) {
            for (Aweme aweme : list) {
                C1165690gRL c1165690gRL = new C1165690gRL(0);
                Video video = aweme.getVideo();
                if (video != null) {
                    cover = video.getCover();
                } else {
                    cover = null;
                }
                c1165690gRL.LL = cover;
                if (!aweme.getPlaylistBlocked() && !this.LLIZLLLIL) {
                    z = false;
                } else {
                    z = true;
                }
                c1165690gRL.LLILLL = z;
                c1165690gRL.LLIZ = aweme.getPlaylistBlocked();
                PlayListInfo playListInfo = aweme.playlist_info;
                if (playListInfo != null) {
                    if (u.LJIJI(playListInfo.getMixId(), this.LLJIJIL, false)) {
                        c1165690gRL.LLILZLL = true;
                        c1165690gRL.LLILLJJLI = true;
                    } else {
                        c1165690gRL.LLILZ = true;
                        c1165690gRL.LLILLL = true;
                    }
                }
                c1165690gRL.LLILZIL = aweme;
                Iterator it2 = ((ArrayList) this.LLILLL).iterator();
                while (it2.hasNext()) {
                    if (Intrinsics.LJFF(aweme, it2.next())) {
                        c1165690gRL.LLILLJJLI = true;
                        c1165690gRL.LLILZLL = true;
                    }
                }
                Iterator<String> it3 = this.LLJI.iterator();
                while (it3.hasNext()) {
                    if (Intrinsics.LJFF(aweme.getAid(), it3.next())) {
                        c1165690gRL.LLILZ = false;
                        c1165690gRL.LLILLL = false;
                        c1165690gRL.LLILZLL = false;
                        c1165690gRL.LLILLJJLI = false;
                    }
                }
                arrayList.add(c1165690gRL);
            }
        }
        return arrayList;
    }

    public final void wQ2(Aweme aweme) {
        if (aweme != null) {
            ((ArrayList) this.LLILLL).remove(aweme);
            this.LLILZ.postValue(Integer.valueOf(((ArrayList) this.LLILLL).size()));
            Integer value = this.LLJ.getValue();
            if (value != null) {
                value.intValue();
                this.LLJ.postValue(Integer.valueOf(this.LLJ.getValue().intValue() - 1));
            }
        }
    }

    public final void xQ2(Aweme aweme) {
        if (aweme != null) {
            ((ArrayList) this.LLILLL).add(aweme);
            this.LLILZ.postValue(Integer.valueOf(((ArrayList) this.LLILLL).size()));
            Integer value = this.LLJ.getValue();
            if (value != null) {
                value.intValue();
                this.LLJ.postValue(Integer.valueOf(this.LLJ.getValue().intValue() + 1));
            }
        }
    }
}
